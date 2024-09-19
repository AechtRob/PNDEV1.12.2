package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCompsognathus;
import net.lepidodendron.entity.model.entity.ModelCompsognathus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCompsognathus extends RenderLivingBaseWithBook<EntityPrehistoricFloraCompsognathus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/compsognathus.png");

    public static float getScaler() {
        return 0.35f;
    }

    public RenderCompsognathus(RenderManager mgr) {
        super(mgr, new ModelCompsognathus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCompsognathus entity) {
        return RenderCompsognathus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCompsognathus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCompsognathus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.30F;
    }

}