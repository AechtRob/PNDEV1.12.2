package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTietasaura;
import net.lepidodendron.entity.model.entity.ModelTietasaura;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTietasaura extends RenderLivingBaseWithBook<EntityPrehistoricFloraTietasaura> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tietasaura.png");

    public static float getScaler() {
        return 0.95F;
    }

    public RenderTietasaura(RenderManager mgr) {
        super(mgr, new ModelTietasaura(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTietasaura entity) {
        return RenderTietasaura.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTietasaura entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTietasaura entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}




