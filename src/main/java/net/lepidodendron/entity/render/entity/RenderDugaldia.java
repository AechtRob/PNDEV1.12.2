package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDugaldia;
import net.lepidodendron.entity.model.entity.ModelDugaldia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDugaldia extends RenderLivingBaseWithBook<EntityPrehistoricFloraDugaldia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dugaldia.png");

    public RenderDugaldia(RenderManager mgr) {
        super(mgr, new ModelDugaldia(), 0.0f);
    }

    public static float getScaler() {return 0.2F;}

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDugaldia entity) {
        return RenderDugaldia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDugaldia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDugaldia entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}