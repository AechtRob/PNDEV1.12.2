package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLaccognathus;
import net.lepidodendron.entity.model.entity.ModelLaccognathus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLaccognathus extends RenderLivingBaseWithBook<EntityPrehistoricFloraLaccognathus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/laccognathus.png");

    public RenderLaccognathus(RenderManager mgr) {
        super(mgr, new ModelLaccognathus(), 0.3f);
    }

    public static float getScaler() {return 1.0F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLaccognathus entity) {
        return RenderLaccognathus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLaccognathus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLaccognathus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}