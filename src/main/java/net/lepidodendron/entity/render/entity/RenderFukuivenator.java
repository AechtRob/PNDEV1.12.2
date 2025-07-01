package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFukuivenator;
import net.lepidodendron.entity.model.entity.ModelFukuivenator;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFukuivenator extends RenderLivingBaseWithBook<EntityPrehistoricFloraFukuivenator> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/fukuivenator.png");

    public static float getScaler() {return 0.5925F;}

    public RenderFukuivenator(RenderManager mgr) {
        super(mgr, new ModelFukuivenator(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFukuivenator entity) {
        return RenderFukuivenator.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraFukuivenator entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraFukuivenator entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}