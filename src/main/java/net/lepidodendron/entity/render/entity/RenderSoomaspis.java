package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSoomaspis;
import net.lepidodendron.entity.model.entity.ModelSoomaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSoomaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraSoomaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/soomaspis.png");

    public static float getScaler() {return 0.15F;}

    public RenderSoomaspis(RenderManager mgr) {
        super(mgr, new ModelSoomaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSoomaspis entity) {
        return RenderSoomaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSoomaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSoomaspis entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }


}


