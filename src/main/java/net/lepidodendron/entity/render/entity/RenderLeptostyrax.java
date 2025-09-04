package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLeptostyrax;
import net.lepidodendron.entity.model.entity.ModelLeptostyrax;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLeptostyrax extends RenderLivingBaseWithBook<EntityPrehistoricFloraLeptostyrax> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/leptostyrax.png");

    public static float getScaler() {return 0.75f;}
    public RenderLeptostyrax(RenderManager mgr) {
        super(mgr, new ModelLeptostyrax(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLeptostyrax entity) {
        return RenderLeptostyrax.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLeptostyrax entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLeptostyrax entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}
