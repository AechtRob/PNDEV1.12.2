package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProcompsognathus;
import net.lepidodendron.entity.model.entity.ModelProcompsognathus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProcompsognathus extends RenderLivingBaseWithBook<EntityPrehistoricFloraProcompsognathus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/procompsognathus.png");

    public RenderProcompsognathus(RenderManager mgr) {
        super(mgr, new ModelProcompsognathus(), 0.5f);
    }

    public static float getScaler() {return 0.335f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProcompsognathus entity) {
        return RenderProcompsognathus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProcompsognathus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraProcompsognathus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.38F;
    }

}