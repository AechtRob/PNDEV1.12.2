package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraUrasterella;
import net.lepidodendron.entity.model.entity.ModelUrasterella;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUrasterella extends RenderLivingBaseWithBook<EntityPrehistoricFloraUrasterella> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/urasterella.png");

    public static float getScaler() {
        return 0.7F * 0.2F;
    }
    public RenderUrasterella(RenderManager mgr) {
        super(mgr, new ModelUrasterella(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraUrasterella entity) {
        return RenderUrasterella.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraUrasterella entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraUrasterella entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}