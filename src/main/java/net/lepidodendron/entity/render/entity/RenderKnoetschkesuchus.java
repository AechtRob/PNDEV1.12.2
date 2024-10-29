package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKnoetschkesuchus;
import net.lepidodendron.entity.model.entity.ModelKnoetschkesuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKnoetschkesuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraKnoetschkesuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/knoetschkesuchus.png");

    public static float getScaler() {return 0.28f;}
    public RenderKnoetschkesuchus(RenderManager mgr) {
        super(mgr, new ModelKnoetschkesuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKnoetschkesuchus entity) {
        return RenderKnoetschkesuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKnoetschkesuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKnoetschkesuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}