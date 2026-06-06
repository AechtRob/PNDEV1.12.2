package net.lepidodendron.util;

import net.lepidodendron.LepidodendronEventSubscribersClient;
import net.minecraft.client.particle.Particle;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ParticleTarBubble extends Particle {

    public ParticleTarBubble(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn)
    {
        super(worldIn, xCoordIn, yCoordIn, zCoordIn);

        this.particleScale = 1.5F;
        this.particleMaxAge = 18;
        this.motionY = 0.001D;

        this.setParticleTexture(LepidodendronEventSubscribersClient.TAR_BUBBLE);
    }

    @Override
    public void onUpdate() {
        if (this.particleAge == 0) {
            this.world.playSound(this.posX, this.posY, this.posZ, BlockSounds.TAR_BUBBLE, SoundCategory.BLOCKS, 0.3F, 0.2F + (rand.nextFloat()/2F), false);
        }
        super.onUpdate();

    }

    @Override
    public int getFXLayer() {
        return 1; // texture atlas particles
    }
}
