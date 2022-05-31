package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLaminacaris;
import net.lepidodendron.entity.model.entity.ModelLaminacaris;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLaminacaris extends RenderLiving<EntityPrehistoricFloraLaminacaris> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/laminacaris.png");

    public RenderLaminacaris(RenderManager mgr) {
        super(mgr, new ModelLaminacaris(), 0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLaminacaris entity) {
        return RenderLaminacaris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLaminacaris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLaminacaris entity, float f) {
        GlStateManager.scale(1.3, 1.3, 1.3);
    }

}