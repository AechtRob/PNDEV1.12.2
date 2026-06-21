package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSpinolestes;
import net.lepidodendron.entity.model.entity.ModelSpinolestes;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSpinolestes extends RenderLivingBaseWithBook<EntityPrehistoricFloraSpinolestes> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/spinolestes.png");

    public static float getScaler() {return 0.15f;}
    public RenderSpinolestes(RenderManager mgr) {
        super(mgr, new ModelSpinolestes(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSpinolestes entity) {
        return RenderSpinolestes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSpinolestes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSpinolestes entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}