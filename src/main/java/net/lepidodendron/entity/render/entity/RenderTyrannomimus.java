package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTyrannomimus;
import net.lepidodendron.entity.model.entity.ModelTyrannomimus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTyrannomimus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTyrannomimus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tyrannomimus.png");

    public static float getScaler() {return 0.5169F;}

    public RenderTyrannomimus(RenderManager mgr) {
        super(mgr, new ModelTyrannomimus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTyrannomimus entity) {
        return RenderTyrannomimus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTyrannomimus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTyrannomimus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}