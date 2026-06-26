package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGaiasia;
import net.lepidodendron.entity.model.entity.ModelGaiasia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGaiasia extends RenderLivingBaseWithBook<EntityPrehistoricFloraGaiasia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gaiasia.png");

    public static float getScaler() {return 0.93f;}

    public RenderGaiasia(RenderManager mgr) {
        super(mgr, new ModelGaiasia(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGaiasia entity) {
        return RenderGaiasia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGaiasia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGaiasia entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.4F;
    }

}