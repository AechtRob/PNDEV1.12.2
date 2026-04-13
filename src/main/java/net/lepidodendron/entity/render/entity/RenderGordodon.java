package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGordodon;
import net.lepidodendron.entity.model.entity.ModelGordodon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGordodon extends RenderLivingBaseWithBook<EntityPrehistoricFloraGordodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gordodon.png");

    public RenderGordodon(RenderManager mgr) {
        super(mgr, new ModelGordodon(), 0.0f);
    }

    public static float getScaler() {return 0.47F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGordodon entity) {
        return RenderGordodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGordodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGordodon entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}