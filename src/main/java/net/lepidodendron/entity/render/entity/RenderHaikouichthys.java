package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHaikouichthys;
import net.lepidodendron.entity.model.entity.ModelHaikouichthys;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHaikouichthys extends RenderLiving<EntityPrehistoricFloraHaikouichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/haikouichthys.png");
    public static final ModelBase MODEL_BASE = new ModelHaikouichthys();

    public static float getScaler() {return 0.0575F;}

    public RenderHaikouichthys(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
        this.addLayer(new LayerHaikouichthysFins(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHaikouichthys entity) {
        return RenderHaikouichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHaikouichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    protected void preRenderCallback(EntityPrehistoricFloraHaikouichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}