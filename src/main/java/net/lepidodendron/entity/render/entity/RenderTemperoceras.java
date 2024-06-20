package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTemperoceras;
import net.lepidodendron.entity.model.entity.ModelTemperoceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTemperoceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraTemperoceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/temperoceras.png");

    public RenderTemperoceras(RenderManager mgr) {
        super(mgr, new ModelTemperoceras(), 0.1f);
    }

    public static float getScaler() {return 0.3F;}

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTemperoceras entity) {
        return RenderTemperoceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTemperoceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTemperoceras entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}