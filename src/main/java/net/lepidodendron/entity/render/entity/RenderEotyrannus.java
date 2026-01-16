package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEotyrannus;
import net.lepidodendron.entity.model.entity.ModelEotyrannus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEotyrannus extends RenderLivingBaseWithBook<EntityPrehistoricFloraEotyrannus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eotyrannus.png");

    public static float getScaler() {return 0.88888F;}

    public RenderEotyrannus(RenderManager mgr) {
        super(mgr, new ModelEotyrannus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEotyrannus entity) {
        return RenderEotyrannus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEotyrannus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEotyrannus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}