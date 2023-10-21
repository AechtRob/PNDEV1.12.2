package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraXinpusaurus;
import net.lepidodendron.entity.model.entity.ModelXinpusaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderXinpusaurus extends RenderLiving<EntityPrehistoricFloraXinpusaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/xinpusaurus.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/xinpusaurus_f.png");

    public RenderXinpusaurus(RenderManager mgr) {
        super(mgr, new ModelXinpusaurus(), 0.0f);
    }

    public static float getScaler() {
        return 0.7F * 0.375F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraXinpusaurus entity) {
        if (entity.getPNType() == EntityPrehistoricFloraXinpusaurus.Type.FEMALE) {
            return RenderXinpusaurus.TEXTURE_F;
        }
        return RenderXinpusaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraXinpusaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraXinpusaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        } else if (entity.getPNType() == EntityPrehistoricFloraXinpusaurus.Type.FEMALE) {
            scale = scale * (0.85F/0.7F);
        }

        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}



