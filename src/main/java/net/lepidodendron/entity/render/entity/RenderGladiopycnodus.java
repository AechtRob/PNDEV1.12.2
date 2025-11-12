package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGladiopycnodus;
import net.lepidodendron.entity.model.entity.ModelGladiopycnodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGladiopycnodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraGladiopycnodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gladiopycnodus.png");

    public RenderGladiopycnodus(RenderManager mgr) {
        super(mgr, new ModelGladiopycnodus(), 0.0f);
    }

    public static float getScaler() {return 0.18F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGladiopycnodus entity) {
        return RenderGladiopycnodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGladiopycnodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGladiopycnodus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





