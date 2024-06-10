package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKeichousaurus;
import net.lepidodendron.entity.model.entity.ModelKeichousaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKeichousaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraKeichousaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/keichousaurus.png");

    public static float getScaler() {
        return 0.25f;
    }

    public RenderKeichousaurus(RenderManager mgr) {
        super(mgr, new ModelKeichousaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKeichousaurus entity) {
        return RenderKeichousaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKeichousaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKeichousaurus entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}




