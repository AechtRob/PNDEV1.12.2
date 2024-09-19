package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPseudoangustidontus;
import net.lepidodendron.entity.model.entity.ModelPseudoangustidontus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPseudoangustidontus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPseudoangustidontus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pseudoangustidontus.png");

    public RenderPseudoangustidontus(RenderManager mgr) {
        super(mgr, new ModelPseudoangustidontus(), 0.5f);
    }
    public static float getScaler() {
        return 0.33F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPseudoangustidontus entity) {
        return RenderPseudoangustidontus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPseudoangustidontus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPseudoangustidontus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}