
package net.lepidodendron.entity;

import net.lepidodendron.block.BlockTrapWater;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityHanging;
import net.minecraft.entity.EntityLeashKnot;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class EntityPrehistoricFloraBuoyRopeEnd extends EntityHanging {

    public EntityPrehistoricFloraBuoyRopeEnd(World worldIn)
    {
        super(worldIn);
    }

    public EntityPrehistoricFloraBuoyRopeEnd(World worldIn, BlockPos hangingPositionIn)
    {
        super(worldIn, hangingPositionIn);
        this.setPosition((double)hangingPositionIn.getX() + 0.5D, (double)hangingPositionIn.getY() + 0.5D, (double)hangingPositionIn.getZ() + 0.5D);
        float f = 0.125F;
        float f1 = 0.1875F;
        float f2 = 0.25F;
        this.setEntityBoundingBox(new AxisAlignedBB(this.posX, this.posY, this.posZ, this.posX, this.posY, this.posZ));
        this.forceSpawn = true;
    }

    @Override
    public boolean canBeCollidedWith()
    {
        return false;
    }

    @Override
    public void setPosition(double x, double y, double z)
    {
        super.setPosition((double) MathHelper.floor(x) + 0.5D, (double)MathHelper.floor(y) + 0.5D, (double)MathHelper.floor(z) + 0.5D);
    }

    @Override
    protected void updateBoundingBox()
    {
        this.posX = (double)this.hangingPosition.getX() + 0.5D;
        this.posY = (double)this.hangingPosition.getY() + 0.5D;
        this.posZ = (double)this.hangingPosition.getZ() + 0.5D;
        if (this.isAddedToWorld() && !this.world.isRemote) this.world.updateEntityWithOptionalForce(this, false); // Forge - Process chunk registration after moving.
    }

    @Override
    public void updateFacingWithBoundingBox(EnumFacing facingDirectionIn)
    {
    }

    @Override
    public int getWidthPixels()
    {
        return 9;
    }

    @Override
    public int getHeightPixels()
    {
        return 9;
    }

    @Override
    public float getEyeHeight()
    {
        return -0.0625F;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean isInRangeToRenderDist(double distance)
    {
        return distance < 1024.0D;
    }

    @Override
    public void onBroken(@Nullable Entity brokenEntity)
    {
        this.playSound(SoundEvents.ENTITY_LEASHKNOT_BREAK, 1.0F, 1.0F);
    }

    @Override
    public boolean writeToNBTOptional(NBTTagCompound compound)
    {
        return false;
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound)
    {
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound)
    {
    }

    @Override
    public boolean processInitialInteract(EntityPlayer player, EnumHand hand)
    {
        if (this.world.isRemote)
        {
            return true;
        }
        else
        {
            boolean flag = false;
            double d0 = 7.0D;
            List<EntityLiving> list = this.world.<EntityLiving>getEntitiesWithinAABB(EntityLiving.class, new AxisAlignedBB(this.posX - 7.0D, this.posY - 32.0D, this.posZ - 7.0D, this.posX + 7.0D, this.posY + 32.0D, this.posZ + 7.0D));

            for (EntityLiving entityliving : list)
            {
                if (entityliving.getLeashed() && entityliving.getLeashHolder() == player)
                {
                    entityliving.setLeashHolder(this, true);
                    flag = true;
                }
            }

            if (!flag)
            {
                this.setDead();

                if (player.capabilities.isCreativeMode)
                {
                    for (EntityLiving entityliving1 : list)
                    {
                        if (entityliving1.getLeashed() && entityliving1.getLeashHolder() == this)
                        {
                            entityliving1.clearLeashed(true, false);
                        }
                    }
                }
            }

            return true;
        }
    }

    @Override
    public boolean onValidSurface()
    {
        return this.world.getBlockState(this.hangingPosition).getBlock() == BlockTrapWater.block;
    }

    public static EntityPrehistoricFloraBuoyRopeEnd createKnot(World worldIn, BlockPos knotPos)
    {
        EntityPrehistoricFloraBuoyRopeEnd entityleashknot = new EntityPrehistoricFloraBuoyRopeEnd(worldIn, knotPos);
        worldIn.spawnEntity(entityleashknot);
        entityleashknot.playPlaceSound();
        return entityleashknot;
    }

    @Nullable
    public static EntityPrehistoricFloraBuoyRopeEnd getKnotForPosition(World worldIn, BlockPos pos)
    {
        int i = pos.getX();
        int j = pos.getY();
        int k = pos.getZ();

        for (EntityPrehistoricFloraBuoyRopeEnd entityleashknot : worldIn.getEntitiesWithinAABB(EntityPrehistoricFloraBuoyRopeEnd.class, new AxisAlignedBB((double)i - 1.0D, (double)j - 1.0D, (double)k - 1.0D, (double)i + 1.0D, (double)j + 1.0D, (double)k + 1.0D)))
        {
            if (entityleashknot.getHangingPosition().equals(pos))
            {
                return entityleashknot;
            }
        }

        return null;
    }

    @Override
    public void playPlaceSound()
    {
        this.playSound(SoundEvents.ENTITY_LEASHKNOT_PLACE, 1.0F, 1.0F);
    }
}