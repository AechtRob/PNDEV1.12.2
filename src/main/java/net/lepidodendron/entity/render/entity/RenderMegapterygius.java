package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMegapterygius;
import net.lepidodendron.entity.model.entity.ModelMegapterygius;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMegapterygius extends RenderLivingBaseWithBook<EntityPrehistoricFloraMegapterygius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megapterygius.png");

    public static float getScaler() {
        return 1f;
    }

    public RenderMegapterygius(RenderManager mgr) {
        super(mgr, new ModelMegapterygius(),0.9f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMegapterygius entity) {
        return RenderMegapterygius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMegapterygius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMegapterygius entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}