package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVolchovia;
import net.lepidodendron.entity.model.entity.ModelVolchovia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVolchovia extends RenderLivingBaseWithBook<EntityPrehistoricFloraVolchovia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/volchovia.png");

    public static float getScaler() {
        return 0.7F * 0.2F;
    }
    public RenderVolchovia(RenderManager mgr) {
        super(mgr, new ModelVolchovia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVolchovia entity) {
        return RenderVolchovia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVolchovia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraVolchovia entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}