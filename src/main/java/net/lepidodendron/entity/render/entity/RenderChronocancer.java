package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraChronocancer;
import net.lepidodendron.entity.model.entity.ModelChronocancer;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChronocancer extends RenderLivingBaseWithBook<EntityPrehistoricFloraChronocancer> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/chronocancer.png");

    public RenderChronocancer(RenderManager mgr) {
        super(mgr, new ModelChronocancer(), 0.0f);
    }

    public static float getScaler() {return 0.16F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraChronocancer entity) {
        return RenderChronocancer.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraChronocancer entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraChronocancer entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}