package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRhynchonkos;
import net.lepidodendron.entity.model.entity.ModelRhynchonkos;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRhynchonkos extends RenderLivingBaseWithBook<EntityPrehistoricFloraRhynchonkos> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rhynchonkos.png");

    public static float getScaler() {return 0.19f;}

    public RenderRhynchonkos(RenderManager mgr) {
        super(mgr, new ModelRhynchonkos(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRhynchonkos entity) {
        return RenderRhynchonkos.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRhynchonkos entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRhynchonkos entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.4F;
    }

}