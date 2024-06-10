package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDiscophyllum;
import net.lepidodendron.entity.model.entity.ModelEldonia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDiscophyllum extends RenderLiving<EntityPrehistoricFloraDiscophyllum> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/discophyllum.png");

    public static float getScaler() {return 0.4F;}

    public RenderDiscophyllum(RenderManager mgr) {
        super(mgr, new ModelEldonia(), 0.0f);
        this.addLayer(new LayerDiscophyllumCap(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDiscophyllum entity) {
        return RenderDiscophyllum.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDiscophyllum entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDiscophyllum entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}