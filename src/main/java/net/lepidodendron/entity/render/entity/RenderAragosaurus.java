package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAragosaurus;
import net.lepidodendron.entity.model.entity.ModelAragosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAragosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraAragosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aragosaurus.png");

    public RenderAragosaurus(RenderManager mgr) {
        super(mgr, new ModelAragosaurus(), 0.2f);
    }

    public static float getScaler() {
        return 1.0F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAragosaurus entity) {
        return RenderAragosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAragosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAragosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}