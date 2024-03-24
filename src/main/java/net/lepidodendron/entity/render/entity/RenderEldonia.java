package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEldonia;
import net.lepidodendron.entity.model.entity.ModelEldonia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEldonia extends RenderLiving<EntityPrehistoricFloraEldonia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eldonia.png");

    public static float getScaler() {return 0.4F;}

    public RenderEldonia(RenderManager mgr) {
        super(mgr, new ModelEldonia(), 0.0f);
        this.addLayer(new LayerEldoniaCap(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEldonia entity) {
        return RenderEldonia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEldonia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEldonia entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}