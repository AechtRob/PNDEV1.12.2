package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWebsteroprionHole;
import net.lepidodendron.entity.model.entity.ModelWebsteroprionHole;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWebsteroprionHole extends RenderLivingBaseWithBook<EntityPrehistoricFloraWebsteroprionHole> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/websteroprion.png");

    public RenderWebsteroprionHole(RenderManager mgr) {
        super(mgr, new ModelWebsteroprionHole(), 0.1f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWebsteroprionHole entity) {
        return RenderWebsteroprionHole.TEXTURE;
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraWebsteroprionHole entity, float f ) {
        int ticksExtension = entity.getticksExtension();
        int ticksRetraction = entity.getticksRetraction();
        int AttackDuration = entity.getAttackLength();
        int AttackTick = entity.getAttackTick();

        float scaler = 0;
        if (AttackTick <= ticksExtension) { //Extension
            scaler = (float) ((double) (ticksExtension-AttackTick) / (double) ticksExtension);
        }
        else {
            if (AttackTick >= (AttackDuration - ticksRetraction)) { //Retraction
                scaler = (float) ((double) (ticksRetraction-(AttackDuration - AttackTick)) / (double) ticksRetraction);
            }
        }
        GlStateManager.translate(0, (scaler * 3),0);
    }
}