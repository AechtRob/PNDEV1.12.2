package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIsoxys;
import net.lepidodendron.entity.model.entity.ModelIsoxys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIsoxys extends RenderLivingBaseWithBook<EntityPrehistoricFloraIsoxys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/isoxys.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderIsoxys(RenderManager mgr) {
        super(mgr, new ModelIsoxys(), RenderDisplays.modelIsoxysBook, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIsoxys entity) {
        return RenderIsoxys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIsoxys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIsoxys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}