package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraElaphrosaurus;
import net.lepidodendron.entity.model.entity.ModelElaphrosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderElaphrosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraElaphrosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/elaphrosaurus.png");

    public RenderElaphrosaurus(RenderManager mgr) {
        super(mgr, new ModelElaphrosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.7475F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraElaphrosaurus entity) {
        return RenderElaphrosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraElaphrosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraElaphrosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}