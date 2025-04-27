package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDeiroceras;
import net.lepidodendron.entity.model.entity.ModelDeiroceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDeiroceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraDeiroceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/deiroceras.png");

    public RenderDeiroceras(RenderManager mgr) {
        super(mgr, new ModelDeiroceras(), 0.6f);
    }
    public static float getScaler() {return 0.65F; }
    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDeiroceras entity) {
        return RenderDeiroceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDeiroceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDeiroceras entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}