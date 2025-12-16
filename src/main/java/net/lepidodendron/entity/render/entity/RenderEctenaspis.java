package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEctenaspis;
import net.lepidodendron.entity.model.entity.ModelEctenaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEctenaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraEctenaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ectenaspis.png");

    public RenderEctenaspis(RenderManager mgr) {
        super(mgr, new ModelEctenaspis(), 0.f);
    }

    public static float getScaler() {return 0.2F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEctenaspis entity) {
        return RenderEctenaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEctenaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEctenaspis entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}