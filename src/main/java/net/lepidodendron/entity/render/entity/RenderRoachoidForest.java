package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRoachoidForestInsect;
import net.lepidodendron.entity.model.entity.ModelRoachoid;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRoachoidForest extends RenderLivingBaseWithBook<EntityPrehistoricFloraRoachoidForestInsect> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/roachoid_forest.png");

    public static float getScaler() {return 0.165f;}

    public RenderRoachoidForest(RenderManager mgr) {
        super(mgr, new ModelRoachoid(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRoachoidForestInsect entity) {
        return RenderRoachoidForest.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRoachoidForestInsect entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRoachoidForestInsect entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
    }

}