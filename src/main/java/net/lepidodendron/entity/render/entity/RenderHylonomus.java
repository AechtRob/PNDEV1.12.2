package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHylonomus;
import net.lepidodendron.entity.model.entity.ModelHylonomus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHylonomus extends RenderLivingBaseWithBook<EntityPrehistoricFloraHylonomus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hylonomus.png");

    public RenderHylonomus(RenderManager mgr) {
        super(mgr, new ModelHylonomus(), 0.1f);
    }

    public static float getScaler() {return 0.18F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHylonomus entity) {
        return RenderHylonomus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHylonomus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHylonomus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.1F;
    }

}