package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDicraeosaurus;
import net.lepidodendron.entity.model.entity.ModelDicraeosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDicraeosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraDicraeosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dicraeosaurus.png");

    public RenderDicraeosaurus(RenderManager mgr) {
        super(mgr, new ModelDicraeosaurus(), RenderDisplays.modelDicraeosaurusBook, 0.3f);
    }

    public static float getScaler() {
        return 1F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDicraeosaurus entity) {
        return RenderDicraeosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDicraeosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDicraeosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}