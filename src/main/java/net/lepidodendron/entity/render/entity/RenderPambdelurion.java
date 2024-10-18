package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPambdelurion;
import net.lepidodendron.entity.model.entity.ModelPambdelurion;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPambdelurion extends RenderLivingBaseWithBook<EntityPrehistoricFloraPambdelurion> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pambdelurion.png");

    public static float getScaler() {
        return 0.7F*0.75f;
    }

    public RenderPambdelurion(RenderManager mgr) {
        super(mgr, new ModelPambdelurion(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPambdelurion entity) {
        return RenderPambdelurion.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPambdelurion entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPambdelurion entity, float f) {
        float scale = this.getScaler()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.38F;
    }

}