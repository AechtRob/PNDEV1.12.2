package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDoryaspis;
import net.lepidodendron.entity.model.entity.ModelDoryaspis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDoryaspis extends RenderLiving<EntityPrehistoricFloraDoryaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/doryaspis.png");

    public RenderDoryaspis(RenderManager mgr) {
        super(mgr, new ModelDoryaspis(), 0.0f);
    }

    public static float getScaler() {return 0.18F;}

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDoryaspis entity) {
        return RenderDoryaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDoryaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDoryaspis entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}