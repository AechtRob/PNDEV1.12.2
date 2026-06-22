package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSinosauropteryx;
import net.lepidodendron.entity.model.entity.ModelSinosauropteryx;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSinosauropteryx extends RenderLivingBaseWithBook<EntityPrehistoricFloraSinosauropteryx> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sinosauropteryx_male.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sinosauropteryx_female.png");


    public static float getScaler() {
        return 0.3f;
    }

    public RenderSinosauropteryx(RenderManager mgr) {
        super(mgr, new ModelSinosauropteryx(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSinosauropteryx entity) {
        return RenderSinosauropteryx.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSinosauropteryx entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSinosauropteryx entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.30F;
    }

}