package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraScelidosaurus;
import net.lepidodendron.entity.model.entity.ModelScelidosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScelidosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraScelidosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scelidosaurus.png");

    public RenderScelidosaurus(RenderManager mgr) {
        super(mgr, new ModelScelidosaurus(), 0.0f);
    }

    public static float getScaler() {return 0.71F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraScelidosaurus entity) {
        return RenderScelidosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraScelidosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraScelidosaurus entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}