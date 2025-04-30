package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSauroposeidon;
import net.lepidodendron.entity.model.entity.ModelSauroposeidon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSauroposeidon extends RenderLivingBaseWithBook<EntityPrehistoricFloraSauroposeidon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sauroposeidon.png");

    public RenderSauroposeidon(RenderManager mgr) {
        super(mgr, new ModelSauroposeidon(), 0.0f);
    }

    public static float getScaler() {return 1F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSauroposeidon entity) {
        return RenderSauroposeidon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSauroposeidon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSauroposeidon entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}