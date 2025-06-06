package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLiaoningogriphus;
import net.lepidodendron.entity.model.entity.ModelLiaoningogriphus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLiaoningogriphus extends RenderLivingBaseWithBook<EntityPrehistoricFloraLiaoningogriphus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/liaoningogriphus.png");

    public RenderLiaoningogriphus(RenderManager mgr) {
        super(mgr, new ModelLiaoningogriphus(), 0.0f);
    }

    public static float getScaler() {return 0.2F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLiaoningogriphus entity) {
        return RenderLiaoningogriphus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLiaoningogriphus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLiaoningogriphus entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}