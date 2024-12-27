package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraToxolophosaurus;
import net.lepidodendron.entity.model.entity.ModelToxolophosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderToxolophosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraToxolophosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/toxolophosaurus.png");

    public static float getScaler() {return 0.19f;}

    public RenderToxolophosaurus(RenderManager mgr) {
        super(mgr, new ModelToxolophosaurus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraToxolophosaurus entity) {
        return RenderToxolophosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraToxolophosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraToxolophosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}