package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNaomichelys;
import net.lepidodendron.entity.model.entity.ModelNaomichelys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNaomichelys extends RenderLivingBaseWithBook<EntityPrehistoricFloraNaomichelys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/naomichelys.png");

    public RenderNaomichelys(RenderManager mgr) {
        super(mgr, new ModelNaomichelys(), 0.0f);
    }

    public static float getScaler() {return 0.429f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNaomichelys entity) {
        return RenderNaomichelys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNaomichelys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNaomichelys entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}

