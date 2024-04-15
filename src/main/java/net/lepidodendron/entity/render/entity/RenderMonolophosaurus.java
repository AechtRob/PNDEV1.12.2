package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMonolophosaurus;
import net.lepidodendron.entity.model.entity.ModelMonolophosaurus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMonolophosaurus extends RenderLiving<EntityPrehistoricFloraMonolophosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/monolophosaurus.png");

    public RenderMonolophosaurus(RenderManager mgr) {
        super(mgr, new ModelMonolophosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.8148F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMonolophosaurus entity) {
        return RenderMonolophosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMonolophosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMonolophosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}