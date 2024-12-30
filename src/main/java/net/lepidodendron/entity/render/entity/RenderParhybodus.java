package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParhybodus;
import net.lepidodendron.entity.model.entity.ModelParhybodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParhybodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraParhybodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/parhybodus.png");

    public static float getScaler() {return 0.8f;}
    public RenderParhybodus(RenderManager mgr) {
        super(mgr, new ModelParhybodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParhybodus entity) {
        return RenderParhybodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParhybodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraParhybodus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}
