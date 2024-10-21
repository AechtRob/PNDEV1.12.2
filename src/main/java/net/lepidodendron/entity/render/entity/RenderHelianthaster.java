package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHelianthaster;
import net.lepidodendron.entity.model.entity.ModelHelianthaster;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHelianthaster extends RenderLivingBaseWithBook<EntityPrehistoricFloraHelianthaster> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/helianthaster.png");

    public RenderHelianthaster(RenderManager mgr) {
        super(mgr, new ModelHelianthaster(), 0.0f);
    }

    public static float getScaler() {return 0.075f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHelianthaster entity) {
        return RenderHelianthaster.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHelianthaster entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHelianthaster entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}