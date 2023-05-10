package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMorrolepis;
import net.lepidodendron.entity.model.entity.ModelMorrolepis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMorrolepis extends RenderLiving<EntityPrehistoricFloraMorrolepis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/morrolepis.png");
    public static float getScaler() {
        return 0.7F * 0.28F;
    }
    public RenderMorrolepis(RenderManager mgr) {
        super(mgr, new ModelMorrolepis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMorrolepis entity) {
        return RenderMorrolepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMorrolepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMorrolepis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}