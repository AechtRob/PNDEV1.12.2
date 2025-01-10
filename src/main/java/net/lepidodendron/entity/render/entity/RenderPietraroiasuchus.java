package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPietraroiasuchus;
import net.lepidodendron.entity.model.entity.ModelPietraroiasuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPietraroiasuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPietraroiasuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pietraroiasuchus.png");

    public static float getScaler() {return 0.3244f;}
    public RenderPietraroiasuchus(RenderManager mgr) {
        super(mgr, new ModelPietraroiasuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPietraroiasuchus entity) {
        return RenderPietraroiasuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPietraroiasuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPietraroiasuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}