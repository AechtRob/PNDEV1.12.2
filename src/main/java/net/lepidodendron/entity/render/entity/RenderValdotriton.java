package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraValdotriton;
import net.lepidodendron.entity.model.entity.ModelValdotriton;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderValdotriton extends RenderLivingBaseWithBook<EntityPrehistoricFloraValdotriton> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/valdotriton.png");

    public static float getScaler() {return 0.25f;}
    public RenderValdotriton(RenderManager mgr) {
        super(mgr, new ModelValdotriton(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraValdotriton entity) {
        return RenderValdotriton.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraValdotriton entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraValdotriton entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}