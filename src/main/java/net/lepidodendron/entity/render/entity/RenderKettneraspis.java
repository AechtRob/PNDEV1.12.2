package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKettneraspis;
import net.lepidodendron.entity.model.entity.ModelKettneraspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKettneraspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraKettneraspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kettneraspis.png");

    public static float getScaler() {return 2.2F * 0.3F;}

    public RenderKettneraspis(RenderManager mgr) {
        super(mgr, new ModelKettneraspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKettneraspis entity) {
        return RenderKettneraspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKettneraspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKettneraspis entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.00F;
    }


}