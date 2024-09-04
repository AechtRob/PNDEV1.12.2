package net.lepidodendron.entity;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockGuano;
import net.lepidodendron.block.BlockGuanoBlock;
import net.lepidodendron.item.ItemGuanoBall;
import net.lepidodendron.util.ParticleGuano;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityPrehistoricFloraGuanoBall extends EntityThrowable
{
    private boolean isFromMob;

    public EntityPrehistoricFloraGuanoBall(World worldIn)
    {
        super(worldIn);
    }

    public EntityPrehistoricFloraGuanoBall(World worldIn, EntityLivingBase throwerIn)
    {
        super(worldIn, throwerIn);
    }

    public EntityPrehistoricFloraGuanoBall(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }

    public static void registerFixesSnowball(DataFixer fixer)
    {
        EntityThrowable.registerFixesThrowable(fixer, "Snowball");
    }

    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setBoolean("isFromMob", this.isFromMob);
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.isFromMob = compound.getBoolean("isFromMob");
    }

    @SideOnly(Side.CLIENT)
    public void handleStatusUpdate(byte id)
    {
        if (id == 3)
        {
            for (int i = 0; i < 8; ++i)
            {
                Minecraft.getMinecraft().effectRenderer.addEffect(ParticleGuano.GuanoFactory.createParticle(world, this.posX, this.posY, this.posZ, 0, 0, 0));
            }
        }
    }

    public void setFromMob(Boolean bool) {
        this.isFromMob = bool;
    }

    protected void onImpact(RayTraceResult result)
    {
        if (result.entityHit != null && !(result.entityHit instanceof EntityPrehistoricFloraGuanoGolem))
        {
            if (this.isFromMob && (!(result.entityHit instanceof EntityPlayer))) {
                return;
            }
            int i = 1;
            result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)i);
        }
        else if (result.typeOfHit == RayTraceResult.Type.BLOCK) {
            //We hit a block:
            BlockPos blockpos = result.getBlockPos();

            IBlockState iblockstate = this.world.getBlockState(blockpos);
            EnumFacing facing = result.sideHit;
            Block blockHit = iblockstate.getBlock();

            if ((facing != EnumFacing.UP || blockHit != BlockGuano.block) && !blockHit.isReplaceable(this.world, blockpos)) {
                blockpos = blockpos.offset(facing);
                iblockstate = this.world.getBlockState(blockpos);
                blockHit = iblockstate.getBlock();
            }

            boolean added = false;
            boolean blockable = (world.getGameRules().getBoolean("mobGriefing") && LepidodendronConfig.doGuanoGriefing);

            if (blockHit == BlockGuano.block) { //Add to layers
                int i = ((Integer) iblockstate.getValue(BlockSnow.LAYERS)).intValue();

                if (i < 8 && blockable) {
                    if (!this.world.isRemote) {
                        IBlockState iblockstate1 = iblockstate.withProperty(BlockSnow.LAYERS, Integer.valueOf(i + 1));
                        if (this.isFromMob && i == 7 && iblockstate.getValue(BlockGuano.DECAYABLE)) {
                            iblockstate1 = iblockstate.withProperty(BlockSnow.LAYERS, Integer.valueOf(i));
                        }
                        if (!this.isFromMob) {
                            iblockstate1 = iblockstate1.withProperty(BlockGuano.DECAYABLE, false);
                        }
                        AxisAlignedBB axisalignedbb = iblockstate1.getCollisionBoundingBox(this.world, blockpos);
                        if (!(this.isFromMob && !iblockstate.getValue(BlockGuano.DECAYABLE))) {
                            if (axisalignedbb != Block.NULL_AABB && this.world.checkNoEntityCollision(axisalignedbb.offset(blockpos)) && this.world.setBlockState(blockpos, iblockstate1, 10)) {
                                SoundType soundtype = BlockGuano.block.getSoundType(iblockstate1, this.world, blockpos, null);
                                this.world.playSound(null, blockpos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
                                if (this.world.getBlockState(blockpos).getValue(BlockSnow.LAYERS) == 8) {
                                   this.world.setBlockState(blockpos, BlockGuanoBlock.block.getDefaultState());
                                }
                            }
                        }
                    }

                    added = true;
                }
                else if (i < 8 && (!blockable)) {
                    if (!this.world.isRemote) {
                        EntityItem entityToSpawn = new EntityItem(world, this.posX, this.posY, this.posZ, new ItemStack(ItemGuanoBall.block, (int) (1)));
                        entityToSpawn.setPickupDelay(10);
                        world.spawnEntity(entityToSpawn);
                    }
                    added = true;
                }
                else if (i >= 8 && (this.isFromMob)) {
                    //Do nothing, so as to avoid buildup, and do not keep adding items to the world because of lag.....
//                    if (!this.world.isRemote) {
//                        EntityItem entityToSpawn = new EntityItem(world, this.posX, this.posY, this.posZ, new ItemStack(ItemGuanoBall.block, (int) (1)));
//                        entityToSpawn.setPickupDelay(10);
//                        world.spawnEntity(entityToSpawn);
//                    }
                    added = true;
                }
            }
            if (!added) {
                //Otherwise place the block:
                if (!blockHit.isReplaceable(this.world, blockpos)) {
                    blockpos = blockpos.offset(facing);
                }
                if (!blockable) {
                    if (!this.world.isRemote) {
                        EntityItem entityToSpawn = new EntityItem(world, this.posX, this.posY, this.posZ, new ItemStack(ItemGuanoBall.block, (int) (1)));
                        entityToSpawn.setPickupDelay(10);
                        world.spawnEntity(entityToSpawn);
                    }
                }
                else if (this.world.mayPlace(BlockGuano.block, blockpos, false, facing, null)) {
                    IBlockState iblockstate1 = BlockGuano.block.getDefaultState().withProperty(BlockSnow.LAYERS, Integer.valueOf(1));
                    if (this.isFromMob) {
                        iblockstate1 = iblockstate1.withProperty(BlockGuano.DECAYABLE, true);
                    }
                    AxisAlignedBB axisalignedbb = iblockstate1.getCollisionBoundingBox(this.world, blockpos);

                    if (axisalignedbb != Block.NULL_AABB && this.world.checkNoEntityCollision(axisalignedbb.offset(blockpos))) {
                        if (!this.world.isRemote) {
                            this.world.setBlockState(blockpos, iblockstate1);

                            SoundType soundtype = BlockGuano.block.getSoundType(iblockstate1, this.world, blockpos, null);
                            this.world.playSound(null, blockpos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);

                        }
                    }
                }
            }
        }

        if (!this.world.isRemote)
        {
            this.world.setEntityState(this, (byte)3);
            this.setDead();
        }
    }
}
