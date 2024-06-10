package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraYangchuanosaurus;
import net.lepidodendron.entity.model.entity.ModelYangchuanosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderYangchuanosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraYangchuanosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yangchuanosaurus.png");

    public RenderYangchuanosaurus(RenderManager mgr) {
        super(mgr, new ModelYangchuanosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.9F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraYangchuanosaurus entity) {
        return RenderYangchuanosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraYangchuanosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraYangchuanosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}