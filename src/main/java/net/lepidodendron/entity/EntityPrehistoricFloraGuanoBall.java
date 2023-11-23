package net.lepidodendron.entity;

import net.lepidodendron.block.BlockGuano;
import net.lepidodendron.util.ParticleGuano;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
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

    protected void onImpact(RayTraceResult result)
    {
        if (result.entityHit != null)
        {
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

            if (blockHit == BlockGuano.block) { //Add to layers
                int i = ((Integer) iblockstate.getValue(BlockSnow.LAYERS)).intValue();

                if (i < 8) {
                    IBlockState iblockstate1 = iblockstate.withProperty(BlockSnow.LAYERS, Integer.valueOf(i + 1));
                    AxisAlignedBB axisalignedbb = iblockstate1.getCollisionBoundingBox(this.world, blockpos);

                    if (axisalignedbb != Block.NULL_AABB && this.world.checkNoEntityCollision(axisalignedbb.offset(blockpos)) && this.world.setBlockState(blockpos, iblockstate1, 10)) {
                        SoundType soundtype = BlockGuano.block.getSoundType(iblockstate1, this.world, blockpos, null);
                        this.world.playSound(null, blockpos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
                    }

                    added = true;
                }
            }
            if (!added) {
                //Otherwise place the block:
                if (!blockHit.isReplaceable(this.world, blockpos)) {
                    blockpos = blockpos.offset(facing);
                }
                if (this.world.mayPlace(BlockGuano.block, blockpos, false, facing, null)) {
                    IBlockState iblockstate1 = BlockGuano.block.getDefaultState().withProperty(BlockSnow.LAYERS, Integer.valueOf(1));
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
