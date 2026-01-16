package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDigonus;
import net.lepidodendron.entity.model.entity.ModelDigonus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDigonus extends RenderLivingBaseWithBook<EntityPrehistoricFloraDigonus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/digonus.png");

    public static float getScaler() {return 2.2F * 0.4F;}

    public RenderDigonus(RenderManager mgr) {
        super(mgr, new ModelDigonus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDigonus entity) {
        return RenderDigonus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDigonus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDigonus entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.00F;
    }


}