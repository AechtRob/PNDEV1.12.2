package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraXinpusaurus;
import net.lepidodendron.entity.model.entity.ModelXinpusaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderXinpusaurus extends RenderLiving<EntityPrehistoricFloraXinpusaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/xinpusaurus.png");
    private static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/xinpusaurus_f.png");

    public RenderXinpusaurus(RenderManager mgr) {
        super(mgr, new ModelXinpusaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraXinpusaurus entity) {
        if (entity.getIsFemale()) {
            return RenderXinpusaurus.TEXTURE_F;
        }
        return RenderXinpusaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraXinpusaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    protected void preRenderCallback(EntityPrehistoricFloraXinpusaurus entity, float f) {
        float scale = entity.getAgeScale() * 0.7F;
        if (scale < 0.1f) {
            scale = 0.1f;
        } else if (entity.getIsFemale()) {
            scale = scale * 0.85F;
        }

        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}



