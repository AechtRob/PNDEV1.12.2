package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDapedium;
import net.lepidodendron.entity.EntityPrehistoricFloraXinpusaurus;
import net.lepidodendron.entity.model.entity.ModelDapedium;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDapedium extends RenderLiving<EntityPrehistoricFloraDapedium> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dapedium.png");

    public RenderDapedium(RenderManager mgr) {
        super(mgr, new ModelDapedium(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDapedium entity) {
        return RenderDapedium.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDapedium entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    public static float getScaler() {
        return  0.25F;
    }
    protected void preRenderCallback(EntityPrehistoricFloraDapedium entity, float f) {
        float scale = this.getScaler();

        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}


