package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraShenzhousaurus;
import net.lepidodendron.entity.model.entity.ModelShenzhousaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderShenzhousaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraShenzhousaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/shenzhousaurus.png");

    public static float getScaler() {return 0.5169F;}

    public RenderShenzhousaurus(RenderManager mgr) {
        super(mgr, new ModelShenzhousaurus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraShenzhousaurus entity) {
        return RenderShenzhousaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraShenzhousaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraShenzhousaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}