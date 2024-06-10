package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParopsonema;
import net.lepidodendron.entity.model.entity.ModelEldonia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParopsonema extends RenderLiving<EntityPrehistoricFloraParopsonema> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/paropsonema.png");

    public static float getScaler() {return 0.4F;}

    public RenderParopsonema(RenderManager mgr) {
        super(mgr, new ModelEldonia(), 0.0f);
        this.addLayer(new LayerParopsonemaCap(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParopsonema entity) {
        return RenderParopsonema.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParopsonema entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraParopsonema entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}