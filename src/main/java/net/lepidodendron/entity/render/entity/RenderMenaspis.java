package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMenaspis;
import net.lepidodendron.entity.model.entity.ModelMenaspis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMenaspis extends RenderLiving<EntityPrehistoricFloraMenaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/menaspis.png");

    public RenderMenaspis(RenderManager mgr) {
        super(mgr, new ModelMenaspis(), 0.0f);
    }
    public static float getScaler() {
        return 0.2F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMenaspis entity) {
        return RenderMenaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMenaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMenaspis entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}