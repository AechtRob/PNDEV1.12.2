package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCandidodon;
import net.lepidodendron.entity.model.entity.ModelCandidodon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCandidodon extends RenderLivingBaseWithBook<EntityPrehistoricFloraCandidodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/candidodon.png");

    public static float getScaler() {return 0.78f*0.43f;}
    public RenderCandidodon(RenderManager mgr) {
        super(mgr, new ModelCandidodon(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCandidodon entity) {
        return RenderCandidodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCandidodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCandidodon entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}