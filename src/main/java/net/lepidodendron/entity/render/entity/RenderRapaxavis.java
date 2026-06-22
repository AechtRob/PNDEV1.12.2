package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRapaxavis;
import net.lepidodendron.entity.model.entity.ModelRapaxavis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRapaxavis extends RenderLivingBaseWithBook<EntityPrehistoricFloraRapaxavis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rapaxavis_male.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rapaxavis_female.png");

    public static float getScaler() {
        return 0.2f;
    }

    public RenderRapaxavis(RenderManager mgr) {
        super(mgr, new ModelRapaxavis(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRapaxavis entity) {
        if (entity.getPNType() == EntityPrehistoricFloraRapaxavis.Type.FEMALE) {
            return RenderRapaxavis.TEXTURE_F;
        }
        return RenderRapaxavis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRapaxavis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRapaxavis entity, float f) {
        float scale = entity.getAgeScale() * getScaler();
        if (entity.getPNType() == EntityPrehistoricFloraRapaxavis.Type.FEMALE) {
            scale = scale * 1.0F;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}