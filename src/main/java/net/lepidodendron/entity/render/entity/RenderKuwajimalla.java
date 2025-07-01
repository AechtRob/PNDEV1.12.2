package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKuwajimalla;
import net.lepidodendron.entity.model.entity.ModelKuwajimalla;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKuwajimalla extends RenderLivingBaseWithBook<EntityPrehistoricFloraKuwajimalla> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kuwajimalla.png");

    public static float getScaler() {return 0.175F;}

    public RenderKuwajimalla(RenderManager mgr) {
        super(mgr, new ModelKuwajimalla(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKuwajimalla entity) {
        return RenderKuwajimalla.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKuwajimalla entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKuwajimalla entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}