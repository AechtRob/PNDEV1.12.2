package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraErpetosuchus;
import net.lepidodendron.entity.model.entity.ModelErpetosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderErpetosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraErpetosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/erpetosuchus.png");

    public static float getScaler() {return 0.258f;}
    public RenderErpetosuchus(RenderManager mgr) {
        super(mgr, new ModelErpetosuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraErpetosuchus entity) {
        return RenderErpetosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraErpetosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraErpetosuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}