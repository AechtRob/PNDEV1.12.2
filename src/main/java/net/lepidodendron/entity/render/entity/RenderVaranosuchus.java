package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVaranosuchus;
import net.lepidodendron.entity.model.entity.ModelVaranosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVaranosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraVaranosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/varanosuchus.png");

    public static float getScaler() {return 0.5f;}
    public RenderVaranosuchus(RenderManager mgr) {
        super(mgr, new ModelVaranosuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVaranosuchus entity) {
        return RenderVaranosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVaranosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraVaranosuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}