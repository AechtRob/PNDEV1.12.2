package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCriocephalosaurus;
import net.lepidodendron.entity.model.entity.ModelCriocephalosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCriocephalosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraCriocephalosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/criocephalosaurus.png");

    public RenderCriocephalosaurus(RenderManager mgr) {
        super(mgr, new ModelCriocephalosaurus(), 0.5f);
    }
    public static float getScaler() {
        return 0.35f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCriocephalosaurus entity) {
        return RenderCriocephalosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCriocephalosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCriocephalosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}