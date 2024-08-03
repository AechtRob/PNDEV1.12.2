package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGregorius;
import net.lepidodendron.entity.model.entity.ModelGregorius;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGregorius extends RenderLivingBaseWithBook<EntityPrehistoricFloraGregorius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gregorius.png");

    public RenderGregorius(RenderManager mgr) {
        super(mgr, new ModelGregorius(), 0.0f);
    }

    public static float getScaler() {return 0.17F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGregorius entity) {
        return RenderGregorius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGregorius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGregorius entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}