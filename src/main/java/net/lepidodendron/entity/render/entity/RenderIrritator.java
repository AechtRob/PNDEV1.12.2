package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIrritator;
import net.lepidodendron.entity.model.entity.ModelIrritator;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIrritator extends RenderLivingBaseWithBook<EntityPrehistoricFloraIrritator> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/irritator.png");

    public static float getScaler() {return 1F;}

    public RenderIrritator(RenderManager mgr) {
        super(mgr, new ModelIrritator(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIrritator entity) {
        return RenderIrritator.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIrritator entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIrritator entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}