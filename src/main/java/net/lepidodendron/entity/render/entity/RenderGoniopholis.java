package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGoniopholis;
import net.lepidodendron.entity.model.entity.ModelGoniopholis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGoniopholis extends RenderLivingBaseWithBook<EntityPrehistoricFloraGoniopholis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/goniopholis.png");

    public static float getScaler() {return 0.78f*0.8f;}
    public RenderGoniopholis(RenderManager mgr) {
        super(mgr, new ModelGoniopholis(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGoniopholis entity) {
        return RenderGoniopholis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGoniopholis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGoniopholis entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}