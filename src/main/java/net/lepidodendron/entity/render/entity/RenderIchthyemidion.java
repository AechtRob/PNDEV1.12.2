package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIchthyemidion;
import net.lepidodendron.entity.model.entity.ModelIchthyemidion;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIchthyemidion extends RenderLivingBaseWithBook<EntityPrehistoricFloraIchthyemidion> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ichthyemidion.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderIchthyemidion(RenderManager mgr) {
        super(mgr, new ModelIchthyemidion(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIchthyemidion entity) {
        return RenderIchthyemidion.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIchthyemidion entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIchthyemidion entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}