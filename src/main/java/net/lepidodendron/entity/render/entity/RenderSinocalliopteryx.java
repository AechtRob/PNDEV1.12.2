package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSinocalliopteryx;
import net.lepidodendron.entity.model.entity.ModelSinocalliopteryx;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSinocalliopteryx extends RenderLivingBaseWithBook<EntityPrehistoricFloraSinocalliopteryx> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sinocalliopteryx.png");

    public RenderSinocalliopteryx(RenderManager mgr) {
        super(mgr, new ModelSinocalliopteryx(), 0.0f);
    }

    public static float getScaler() {return 0.7F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSinocalliopteryx entity) {
        return RenderSinocalliopteryx.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSinocalliopteryx entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSinocalliopteryx entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}