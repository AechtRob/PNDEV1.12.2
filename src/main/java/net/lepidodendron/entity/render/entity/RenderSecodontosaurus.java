package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSecodontosaurus;
import net.lepidodendron.entity.model.entity.ModelSecodontosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSecodontosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraSecodontosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/secodontosaurus.png");

    public RenderSecodontosaurus(RenderManager mgr) {
        super(mgr, new ModelSecodontosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.47F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSecodontosaurus entity) {
        return RenderSecodontosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSecodontosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSecodontosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.80F;
    }

}