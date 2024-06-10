package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRobertia;
import net.lepidodendron.entity.model.entity.ModelRobertia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRobertia extends RenderLivingBaseWithBook<EntityPrehistoricFloraRobertia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/robertia.png");

    public static float getScaler() {
        return 0.7F * 0.30f;
    }

    public RenderRobertia(RenderManager mgr) {
        super(mgr, new ModelRobertia(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRobertia entity) {
        return RenderRobertia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRobertia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRobertia entity, float f) {
        float scale = entity.getAgeScale() * getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}