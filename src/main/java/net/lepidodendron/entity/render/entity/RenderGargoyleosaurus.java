package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGargoyleosaurus;
import net.lepidodendron.entity.model.entity.ModelGargoyleosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGargoyleosaurus extends RenderLiving<EntityPrehistoricFloraGargoyleosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gargoyleosaurus.png");

    public RenderGargoyleosaurus(RenderManager mgr) {
        super(mgr, new ModelGargoyleosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.85F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGargoyleosaurus entity) {
        return RenderGargoyleosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGargoyleosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGargoyleosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}