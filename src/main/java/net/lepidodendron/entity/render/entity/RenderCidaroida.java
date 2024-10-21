package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCidaroida;
import net.lepidodendron.entity.model.entity.ModelCidaroida;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCidaroida extends RenderLivingBaseWithBook<EntityPrehistoricFloraCidaroida> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cidaroid_1.png");
    private static final ResourceLocation TEXTURE2 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cidaroid_2.png");
    private static final ResourceLocation TEXTURE3 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cidaroid_3.png");
    private static final ResourceLocation TEXTURE4 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cidaroid_4.png");

    public RenderCidaroida(RenderManager mgr) {
        super(mgr, new ModelCidaroida(), 0.0f);
    }

    public static float getScaler() {
        return 0.22F;
    }
    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCidaroida entity) {
        if (entity.getVariant() == 0) {
            return RenderCidaroida.TEXTURE;
        }
        if (entity.getVariant() == 1) {
            return RenderCidaroida.TEXTURE2;
        }
        if (entity.getVariant() == 2) {
            return RenderCidaroida.TEXTURE3;
        }
        return RenderCidaroida.TEXTURE4;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCidaroida entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCidaroida entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }

}