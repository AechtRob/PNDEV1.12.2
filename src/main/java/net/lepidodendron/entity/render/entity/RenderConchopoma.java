package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraConchopoma;
import net.lepidodendron.entity.model.entity.ModelConchopoma;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderConchopoma extends RenderLivingBaseWithBook<EntityPrehistoricFloraConchopoma> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/conchopoma.png");

    public RenderConchopoma(RenderManager mgr) {
        super(mgr, new ModelConchopoma(), RenderDisplays.modelConchopomaBook, 0.0f);
    }

    public static float getScaler() {return 0.3F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraConchopoma entity) {
        return RenderConchopoma.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraConchopoma entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraConchopoma entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}