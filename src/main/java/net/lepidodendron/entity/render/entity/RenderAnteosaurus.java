package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAnteosaurus;
import net.lepidodendron.entity.model.entity.ModelAnteosaurus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAnteosaurus extends RenderLiving<EntityPrehistoricFloraAnteosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anteosaurus.png");
    public static final ModelBase MODEL_BASE = new ModelAnteosaurus();

    public RenderAnteosaurus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.5f);
    }

    public static float getScaler(){
         return 1.08f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAnteosaurus entity) {
        return RenderAnteosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAnteosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAnteosaurus entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.85F;
    }

}