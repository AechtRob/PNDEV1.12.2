package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAnguillavus;
import net.lepidodendron.entity.model.entity.ModelAnguillavus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAnguillavus extends RenderLivingBaseWithBook<EntityPrehistoricFloraAnguillavus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anguillavus.png");

    public RenderAnguillavus(RenderManager mgr) {
        super(mgr, new ModelAnguillavus(), 0.0f);
    }

    public static float getScaler() {return 0.35F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAnguillavus entity) {
        return RenderAnguillavus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAnguillavus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAnguillavus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





