package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIchthyosaurus;
import net.lepidodendron.entity.model.entity.ModelIchthyosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIchthyosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraIchthyosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ichthyosaurus.png");

    public static float getScaler() {
        return 0.695F;
    }
    public RenderIchthyosaurus(RenderManager mgr) {
        super(mgr, new ModelIchthyosaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIchthyosaurus entity) {
        return RenderIchthyosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIchthyosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIchthyosaurus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}