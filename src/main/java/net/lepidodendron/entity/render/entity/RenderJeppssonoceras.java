package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJeppssonoceras;
import net.lepidodendron.entity.model.entity.ModelJeppssonoceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderJeppssonoceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraJeppssonoceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/jeppssonoceras.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderJeppssonoceras(RenderManager mgr) {
        super(mgr, new ModelJeppssonoceras(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJeppssonoceras entity) {
        return RenderJeppssonoceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJeppssonoceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraJeppssonoceras entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0.01F;
    }

}