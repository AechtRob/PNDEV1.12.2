package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraUteodon;
import net.lepidodendron.entity.model.entity.ModelUteodon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUteodon extends RenderLivingBaseWithBook<EntityPrehistoricFloraUteodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/uteodon.png");

    public static float getScaler() {
        return 0.525f;
    }

    public RenderUteodon(RenderManager mgr) {
        super(mgr, new ModelUteodon(), RenderDisplays.modelUteodon, 0.85F);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraUteodon entity) {
        return RenderUteodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraUteodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraUteodon entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.85F;
    }

}