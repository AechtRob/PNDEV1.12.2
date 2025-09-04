package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMegachirella;
import net.lepidodendron.entity.model.entity.ModelMegachirella;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMegachirella extends RenderLivingBaseWithBook<EntityPrehistoricFloraMegachirella> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megachirella.png");

    public static float getScaler() {return 0.15f;}
    public RenderMegachirella(RenderManager mgr) {
        super(mgr, new ModelMegachirella(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMegachirella entity) {
        return RenderMegachirella.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMegachirella entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMegachirella entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}