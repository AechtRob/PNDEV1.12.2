package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLonchidion;
import net.lepidodendron.entity.model.entity.ModelLonchidion;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLonchidion extends RenderLiving<EntityPrehistoricFloraLonchidion> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lonchidion.png");

    public RenderLonchidion(RenderManager mgr) {
        super(mgr, new ModelLonchidion(), 0.0f);
    }

    public static float getScaler() {return 0.342F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLonchidion entity) {
        return RenderLonchidion.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLonchidion entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLonchidion entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}