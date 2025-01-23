package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIchnusa;
import net.lepidodendron.entity.model.entity.ModelIchnusa;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIchnusa extends RenderLivingBaseWithBook<EntityPrehistoricFloraIchnusa> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ichnusa.png");

    public static float getScaler() {return 0.54F;}

    public RenderIchnusa(RenderManager mgr) {
        super(mgr, new ModelIchnusa(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIchnusa entity) {
        return RenderIchnusa.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIchnusa entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIchnusa entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}