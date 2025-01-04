package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAnatosuchus;
import net.lepidodendron.entity.model.entity.ModelAnatosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAnatosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraAnatosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anatosuchus.png");

    public static float getScaler() {return 0.35f;}
    public RenderAnatosuchus(RenderManager mgr) {
        super(mgr, new ModelAnatosuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAnatosuchus entity) {
        return RenderAnatosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAnatosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAnatosuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}