package net.lepidodendron.entity;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityVolcano extends Entity
{
    public EntityVolcano(World worldIn, BlockPos pos)
    {
        this (worldIn);
        setPosition(pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D);
    }

    public EntityVolcano(World worldIn)
    {
        super(worldIn);
        setSize(0.0F, 0.0F);
    }

    @Override
    public void onUpdate()
    {
        super.onUpdate();

        if (!canExistAt())
        {
            setDead();
            return;
        }

        if (this.rand.nextInt(48) == 0) {
            double xx = this.rand.nextDouble() * (this.rand.nextBoolean() ? 1 : -1);
            double zz = this.rand.nextDouble() * (this.rand.nextBoolean() ? 1 : -1);
            double yy = this.rand.nextDouble();
            EntitySmallFireball fire = new EntitySmallFireball(this.world, this.posX, this.posY, this.posZ, xx, yy, zz);
            this.world.spawnEntity(fire);
        }
    }

    public boolean canExistAt() {
        return this.world.getBlockState(this.getPosition()).getMaterial() == Material.LAVA;
    }

    @Override
    protected void entityInit()
    {

    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound)
    {

    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound)
    {

    }
}