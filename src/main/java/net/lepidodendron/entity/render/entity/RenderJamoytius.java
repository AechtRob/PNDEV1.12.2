package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJamoytius;
import net.lepidodendron.entity.model.entity.ModelJamoytius;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderJamoytius extends RenderLivingBaseWithBook<EntityPrehistoricFloraJamoytius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/jamoytius.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderJamoytius(RenderManager mgr) {
        super(mgr, new ModelJamoytius(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJamoytius entity) {
        return RenderJamoytius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJamoytius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraJamoytius entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}