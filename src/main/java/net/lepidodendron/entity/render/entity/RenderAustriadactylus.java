package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAustriadactylus;
import net.lepidodendron.entity.model.entity.ModelAustriadactylus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAustriadactylus extends RenderLiving<EntityPrehistoricFloraAustriadactylus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/austriadactylus.png");

    public RenderAustriadactylus(RenderManager mgr) {
        super(mgr, new ModelAustriadactylus(), 0.12f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAustriadactylus entity) {
        return RenderAustriadactylus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAustriadactylus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAustriadactylus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}





