package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDeinonychus;
import net.lepidodendron.entity.model.entity.ModelDeinonychus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDeinonychus extends RenderLivingBaseWithBook<EntityPrehistoricFloraDeinonychus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/deinonychus.png");

    public static float getScaler() {return 1f;}
    public RenderDeinonychus(RenderManager mgr) {
        super(mgr, new ModelDeinonychus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDeinonychus entity) {
        return RenderDeinonychus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDeinonychus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDeinonychus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}