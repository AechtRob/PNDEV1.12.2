package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRechnisaurus;
import net.lepidodendron.entity.model.entity.ModelRechnisaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRechnisaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraRechnisaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rechnisaurus.png");

    public static float getScaler() {return 0.536f;}
    public RenderRechnisaurus(RenderManager mgr) {
        super(mgr, new ModelRechnisaurus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRechnisaurus entity) {
        return RenderRechnisaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRechnisaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRechnisaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}