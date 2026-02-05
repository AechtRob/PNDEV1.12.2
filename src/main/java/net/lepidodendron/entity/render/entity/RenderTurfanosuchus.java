package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTurfanosuchus;
import net.lepidodendron.entity.model.entity.ModelTurfanosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTurfanosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTurfanosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/turfanosuchus.png");

    public static float getScaler() {return 0.389f;}
    public RenderTurfanosuchus(RenderManager mgr) {
        super(mgr, new ModelTurfanosuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTurfanosuchus entity) {
        return RenderTurfanosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTurfanosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTurfanosuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}