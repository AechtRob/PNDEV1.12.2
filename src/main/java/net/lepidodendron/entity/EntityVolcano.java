package net.lepidodendron.entity;

import net.lepidodendron.LepidodendronConfig;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
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

     public void onUpdate()
    {
        if (!canExistAt())
        {
            setDead();
            return;
        }

        if (this.rand.nextInt(48) == 0 && LepidodendronConfig.doVolcanos) {
            EntityVolcanoFireball fire = new EntityVolcanoFireball(this.world, this.posX, this.posY, this.posZ, this);
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