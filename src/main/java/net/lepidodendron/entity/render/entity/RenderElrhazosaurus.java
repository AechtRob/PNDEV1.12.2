package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraElrhazosaurus;
import net.lepidodendron.entity.model.entity.ModelElrhazosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderElrhazosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraElrhazosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/elrhazosaurus.png");

    public static float getScaler() {return 0.7f;}
    public RenderElrhazosaurus(RenderManager mgr) {
        super(mgr, new ModelElrhazosaurus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraElrhazosaurus entity) {
        return RenderElrhazosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraElrhazosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraElrhazosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}