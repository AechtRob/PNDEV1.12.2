package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPhuwiangvenator;
import net.lepidodendron.entity.model.entity.ModelPhuwiangvenator;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPhuwiangvenator extends RenderLivingBaseWithBook<EntityPrehistoricFloraPhuwiangvenator> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phuwiangvenator.png");

    public static float getScaler() {return 0.88888F;}

    public RenderPhuwiangvenator(RenderManager mgr) {
        super(mgr, new ModelPhuwiangvenator(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPhuwiangvenator entity) {
        return RenderPhuwiangvenator.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPhuwiangvenator entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPhuwiangvenator entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}