package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLiliensternus;
import net.lepidodendron.entity.model.entity.ModelLiliensternus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLiliensternus extends RenderLiving<EntityPrehistoricFloraLiliensternus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/liliensternus.png");

    public RenderLiliensternus(RenderManager mgr) {
        super(mgr, new ModelLiliensternus(), 0.68f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLiliensternus entity) {
        return RenderLiliensternus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLiliensternus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLiliensternus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.68F;
    }

}