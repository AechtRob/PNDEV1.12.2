package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSarcosuchus;
import net.lepidodendron.entity.model.entity.ModelSarcosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSarcosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraSarcosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sarcosuchus.png");

    public static float getScaler() {return 1f;}
    public RenderSarcosuchus(RenderManager mgr) {
        super(mgr, new ModelSarcosuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSarcosuchus entity) {
        return RenderSarcosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSarcosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSarcosuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}