package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHolonema;
import net.lepidodendron.entity.model.entity.ModelHolonema;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHolonema extends RenderLivingBaseWithBook<EntityPrehistoricFloraHolonema> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/holonema.png");

    public RenderHolonema(RenderManager mgr) {
        super(mgr, new ModelHolonema(), 0.0f);
    }

    public static float getScaler() {return 0.55F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHolonema entity) {
        return RenderHolonema.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHolonema entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHolonema entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





