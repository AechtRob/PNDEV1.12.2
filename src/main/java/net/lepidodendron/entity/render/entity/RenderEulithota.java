package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEulithota;
import net.lepidodendron.entity.model.entity.ModelEulithota;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEulithota extends RenderLivingBaseWithBook<EntityPrehistoricFloraEulithota> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eulithota.png");

    public static float getScaler() {return 0.6F;}

    public RenderEulithota(RenderManager mgr) {
        super(mgr, new ModelEulithota(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEulithota entity) {
        return RenderEulithota.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEulithota entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEulithota entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}