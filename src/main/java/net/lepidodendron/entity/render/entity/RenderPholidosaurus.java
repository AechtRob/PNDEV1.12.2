package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPholidosaurus;
import net.lepidodendron.entity.model.entity.ModelPholidosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPholidosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPholidosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pholidosaurus.png");

    public static float getScaler() {return 0.75f;}
    public RenderPholidosaurus(RenderManager mgr) {
        super(mgr, new ModelPholidosaurus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPholidosaurus entity) {
        return RenderPholidosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPholidosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPholidosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}