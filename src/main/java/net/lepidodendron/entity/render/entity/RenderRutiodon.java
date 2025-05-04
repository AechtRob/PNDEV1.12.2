package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRutiodon;
import net.lepidodendron.entity.model.entity.ModelRutiodon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRutiodon extends RenderLivingBaseWithBook<EntityPrehistoricFloraRutiodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rutiodon.png");

    public static float getScaler() {return 0.78f;}
    public RenderRutiodon(RenderManager mgr) {
        super(mgr, new ModelRutiodon(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRutiodon entity) {
        return RenderRutiodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRutiodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRutiodon entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}