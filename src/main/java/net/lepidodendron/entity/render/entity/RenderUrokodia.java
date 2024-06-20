package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraUrokodia;
import net.lepidodendron.entity.model.entity.ModelUrokodia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUrokodia extends RenderLivingBaseWithBook<EntityPrehistoricFloraUrokodia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/urokodia.png");

    public RenderUrokodia(RenderManager mgr) {
        super(mgr, new ModelUrokodia(), 0.0f);
    }

    public static float getScaler() {return 0.19F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraUrokodia entity) {
        return RenderUrokodia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraUrokodia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraUrokodia entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}