package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEffigia;
import net.lepidodendron.entity.model.entity.ModelEffigia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEffigia extends RenderLivingBaseWithBook<EntityPrehistoricFloraEffigia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/effigia.png");

    public RenderEffigia(RenderManager mgr) {
        super(mgr, new ModelEffigia(), RenderDisplays.modelEffigiaBook, 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEffigia entity) {
        return RenderEffigia.TEXTURE;
    }

    public static float getScaler() {
        return  0.355f;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEffigia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEffigia entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.28F;
    }

}