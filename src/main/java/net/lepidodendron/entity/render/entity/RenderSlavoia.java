package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSlavoia;
import net.lepidodendron.entity.model.entity.ModelSlavoia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSlavoia extends RenderLivingBaseWithBook<EntityPrehistoricFloraSlavoia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/slavoia.png");

    public static float getScaler() {return 0.12F;}

    public RenderSlavoia(RenderManager mgr) {
        super(mgr, new ModelSlavoia(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSlavoia entity) {
        return RenderSlavoia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSlavoia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSlavoia entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}