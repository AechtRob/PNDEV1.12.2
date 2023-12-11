package net.lepidodendron.util;

import net.lepidodendron.item.ItemGuanoBall;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleBreaking;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class ParticleGuano extends ParticleBreaking {

    protected ParticleGuano(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeed, double ySpeed, double zSpeed)
    {
        super(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeed, ySpeed, zSpeed, ItemGuanoBall.block, 0);
    }

    @SideOnly(Side.CLIENT)
    public static class GuanoFactory implements IParticleFactory
    {
        public static Particle createParticle(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn)
        {
            ParticleGuano particle = new ParticleGuano(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeedIn, ySpeedIn, zSpeedIn);
            particle.setRBGColorF(0.7539F, 0.7266F, 0.6875F);
            return particle;
        }

        @Nullable
        @Override
        public Particle createParticle(int particleID, World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn, int... p_178902_15_) {
            return null;
        }
    }


}
