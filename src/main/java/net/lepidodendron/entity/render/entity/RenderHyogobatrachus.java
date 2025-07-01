package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHyogobatrachus;
import net.lepidodendron.entity.model.entity.ModelHyogobatrachus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHyogobatrachus extends RenderLivingBaseWithBook<EntityPrehistoricFloraHyogobatrachus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hyogobatrachus.png");

    public static float getScaler() {return 0.18f;}

    public RenderHyogobatrachus(RenderManager mgr) {
        super(mgr, new ModelHyogobatrachus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHyogobatrachus entity) {
        return RenderHyogobatrachus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHyogobatrachus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHyogobatrachus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.4F;
    }

}