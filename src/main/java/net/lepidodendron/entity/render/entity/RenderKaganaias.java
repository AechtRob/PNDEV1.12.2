package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKaganaias;
import net.lepidodendron.entity.model.entity.ModelKaganaias;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKaganaias extends RenderLivingBaseWithBook<EntityPrehistoricFloraKaganaias> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kaganaias.png");

    public static float getScaler() {return 0.18F;}

    public RenderKaganaias(RenderManager mgr) {
        super(mgr, new ModelKaganaias(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKaganaias entity) {
        return RenderKaganaias.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKaganaias entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKaganaias entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}