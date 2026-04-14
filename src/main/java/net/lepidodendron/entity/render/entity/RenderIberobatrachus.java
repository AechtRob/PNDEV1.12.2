package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIberobatrachus;
import net.lepidodendron.entity.model.entity.ModelIberobatrachus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIberobatrachus extends RenderLivingBaseWithBook<EntityPrehistoricFloraIberobatrachus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/iberobatrachus.png");

    public static float getScaler() {return 0.18f;}

    public RenderIberobatrachus(RenderManager mgr) {
        super(mgr, new ModelIberobatrachus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIberobatrachus entity) {
        return RenderIberobatrachus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIberobatrachus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIberobatrachus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.4F;
    }

}