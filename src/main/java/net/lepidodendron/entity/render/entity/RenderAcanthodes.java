package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAcanthodes;
import net.lepidodendron.entity.model.entity.ModelAcanthodes;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAcanthodes extends RenderLiving<EntityPrehistoricFloraAcanthodes> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acanthodes.png");

    public RenderAcanthodes(RenderManager mgr) {
        super(mgr, new ModelAcanthodes(), 0.0f);
    }

    public static float getScaler() {return 0.15F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAcanthodes entity) {
        return RenderAcanthodes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAcanthodes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAcanthodes entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}