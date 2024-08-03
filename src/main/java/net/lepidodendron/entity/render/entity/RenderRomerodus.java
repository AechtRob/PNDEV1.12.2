package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRomerodus;
import net.lepidodendron.entity.model.entity.ModelRomerodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRomerodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraRomerodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/Romerodus.png");

    public RenderRomerodus(RenderManager mgr) {
        super(mgr, new ModelRomerodus(), 0.0f);
    }

    public static float getScaler() {return 0.342F * 0.5F * 1.5F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRomerodus entity) {
        return RenderRomerodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRomerodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRomerodus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}




