package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTriadobatrachus;
import net.lepidodendron.entity.model.entity.ModelTriadobatrachus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTriadobatrachus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTriadobatrachus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/triadobatrachus.png");

    public static float getScaler() {return 0.27f;}

    public RenderTriadobatrachus(RenderManager mgr) {
        super(mgr, new ModelTriadobatrachus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTriadobatrachus entity) {
        return RenderTriadobatrachus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTriadobatrachus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTriadobatrachus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.4F;
    }

}