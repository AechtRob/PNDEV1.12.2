package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBelantsea;
import net.lepidodendron.entity.model.entity.ModelBelantsea;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBelantsea extends RenderLiving<EntityPrehistoricFloraBelantsea> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/belantsea.png");

    public RenderBelantsea(RenderManager mgr) {
        super(mgr, new ModelBelantsea(), 0.05f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBelantsea entity) {
        return RenderBelantsea.TEXTURE;
    }
    public static float getScaler() {return 0.325F;}

    @Override
    protected void applyRotations(EntityPrehistoricFloraBelantsea entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    protected void preRenderCallback(EntityPrehistoricFloraBelantsea entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}