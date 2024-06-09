package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDubreuillosaurus;
import net.lepidodendron.entity.model.entity.ModelDubreuillosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDubreuillosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraDubreuillosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dubreuillosaurus.png");

    public static float getScaler() {return 0.6F;}

    public RenderDubreuillosaurus(RenderManager mgr) {
        super(mgr, new ModelDubreuillosaurus(), RenderDisplays.modelDubreuillosaurusBook, 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDubreuillosaurus entity) {
        return RenderDubreuillosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDubreuillosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDubreuillosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}