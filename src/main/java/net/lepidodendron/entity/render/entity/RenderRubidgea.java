package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRubidgea;
import net.lepidodendron.entity.model.entity.ModelRubidgea;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRubidgea extends RenderLivingBaseWithBook<EntityPrehistoricFloraRubidgea> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rubidgea.png");

    public RenderRubidgea(RenderManager mgr) {
        super(mgr, new ModelRubidgea(), 0.5f);
    }

    public static float getScaler() {return 0.535f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRubidgea entity) {
        return RenderRubidgea.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRubidgea entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRubidgea entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}