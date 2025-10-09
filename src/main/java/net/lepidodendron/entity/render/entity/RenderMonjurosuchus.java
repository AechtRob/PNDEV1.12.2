package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMonjurosuchus;
import net.lepidodendron.entity.model.entity.ModelMonjurosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMonjurosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraMonjurosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/monjurosuchus.png");

    public static float getScaler() {return 0.238f;}
    public RenderMonjurosuchus(RenderManager mgr) {
        super(mgr, new ModelMonjurosuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMonjurosuchus entity) {
        return RenderMonjurosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMonjurosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMonjurosuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}