package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFutabasaurus;
import net.lepidodendron.entity.model.entity.ModelFutabasaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFutabasaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraFutabasaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/futabasaurus.png");

    public static float getScaler() {
        return 1f;
    }

    public RenderFutabasaurus(RenderManager mgr) {
        super(mgr, new ModelFutabasaurus(),0.9f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFutabasaurus entity) {
        return RenderFutabasaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraFutabasaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraFutabasaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}