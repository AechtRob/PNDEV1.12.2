package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRamirosuarezia;
import net.lepidodendron.entity.model.entity.ModelRamirosuarezia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRamirosuarezia extends RenderLivingBaseWithBook<EntityPrehistoricFloraRamirosuarezia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ramirosuarezia.png");

    public static float getScaler() {
        return 0.2F;
    }
    public RenderRamirosuarezia(RenderManager mgr) {
        super(mgr, new ModelRamirosuarezia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRamirosuarezia entity) {
        return RenderRamirosuarezia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRamirosuarezia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRamirosuarezia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}