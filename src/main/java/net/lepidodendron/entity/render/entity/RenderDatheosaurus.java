package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDatheosaurus;
import net.lepidodendron.entity.model.entity.ModelDatheosaurus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDatheosaurus extends RenderLiving<EntityPrehistoricFloraDatheosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/datheosaurus.png");
    public static final ModelBase MODEL_BASE = new ModelDatheosaurus();

    public RenderDatheosaurus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.25F);
    }
    public static float getScaler() {
        return 0.558f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDatheosaurus entity) {
        return RenderDatheosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDatheosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDatheosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.25F;
    }

}