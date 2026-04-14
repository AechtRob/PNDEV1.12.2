package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeopalaemon;
import net.lepidodendron.entity.model.entity.ModelPalaeopalaemon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPalaeopalaemon extends RenderLivingBaseWithBook<EntityPrehistoricFloraPalaeopalaemon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeopalaemon.png");

    public RenderPalaeopalaemon(RenderManager mgr) {
        super(mgr, new ModelPalaeopalaemon(), 0.0f);
    }

    public static float getScaler() {return 0.25F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPalaeopalaemon entity) {
        return RenderPalaeopalaemon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPalaeopalaemon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPalaeopalaemon entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}