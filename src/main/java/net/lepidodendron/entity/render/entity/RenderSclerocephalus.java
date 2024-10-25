package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSclerocephalus;
import net.lepidodendron.entity.model.entity.ModelSclerocephalus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSclerocephalus extends RenderLivingBaseWithBook<EntityPrehistoricFloraSclerocephalus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sclerocephalus.png");

    public static float getScaler() {return 0.452f;}

    public RenderSclerocephalus(RenderManager mgr) {
        super(mgr, new ModelSclerocephalus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSclerocephalus entity) {
        return RenderSclerocephalus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSclerocephalus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSclerocephalus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.4F;
    }

}