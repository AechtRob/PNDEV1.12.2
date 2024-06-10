package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMymoorapelta;
import net.lepidodendron.entity.model.entity.ModelMymoorapelta;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMymoorapelta extends RenderLivingBaseWithBook<EntityPrehistoricFloraMymoorapelta> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mymoorapelta.png");

    public RenderMymoorapelta(RenderManager mgr) {
        super(mgr, new ModelMymoorapelta(), RenderDisplays.modelMymoorapeltaBook, 0.3f);
    }

    public static float getScaler() {
        return 0.7F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMymoorapelta entity) {
        return RenderMymoorapelta.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMymoorapelta entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMymoorapelta entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}