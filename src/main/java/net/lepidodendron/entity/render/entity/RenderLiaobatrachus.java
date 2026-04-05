package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLiaobatrachus;
import net.lepidodendron.entity.model.entity.ModelLiaobatrachus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLiaobatrachus extends RenderLivingBaseWithBook<EntityPrehistoricFloraLiaobatrachus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/liaboatrachus.png");

    public static float getScaler() {return 0.18f;}

    public RenderLiaobatrachus(RenderManager mgr) {
        super(mgr, new ModelLiaobatrachus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLiaobatrachus entity) {
        return RenderLiaobatrachus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLiaobatrachus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLiaobatrachus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.4F;
    }

}