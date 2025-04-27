package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCretalamna;
import net.lepidodendron.entity.model.entity.ModelCretalamna;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCretalamna extends RenderLivingBaseWithBook<EntityPrehistoricFloraCretalamna> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cretalamna.png");

    public static float getScaler() {return 0.99f;}
    public RenderCretalamna(RenderManager mgr) {
        super(mgr, new ModelCretalamna(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCretalamna entity) {
        return RenderCretalamna.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCretalamna entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCretalamna entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}
