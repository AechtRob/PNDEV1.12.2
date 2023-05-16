package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraStahleckeria;
import net.lepidodendron.entity.model.entity.ModelStahleckeria;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderStahleckeria extends RenderLiving<EntityPrehistoricFloraStahleckeria> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/stahleckeria.png");
    public static final ModelBase MODEL_BASE = new ModelStahleckeria();

    public RenderStahleckeria(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.5f);
    }
    public static float getScaler() {return 0.65f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraStahleckeria entity) {
        float scale = entity.getAgeScale();
        return RenderStahleckeria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraStahleckeria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraStahleckeria entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}