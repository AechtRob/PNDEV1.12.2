package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKulindadromeus;
import net.lepidodendron.entity.model.entity.ModelKulindadromeus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKulindadromeus extends RenderLiving<EntityPrehistoricFloraKulindadromeus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kulindadromeus.png");

    public RenderKulindadromeus(RenderManager mgr) {
        super(mgr, new ModelKulindadromeus(), 0.3f);
    }

    public static float getScaler() {
        return 0.45F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKulindadromeus entity) {
        return RenderKulindadromeus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKulindadromeus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKulindadromeus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}