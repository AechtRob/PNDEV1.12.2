package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParadoxides;
import net.lepidodendron.entity.model.entity.ModelParadoxides;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParadoxides extends RenderLivingBaseWithBook<EntityPrehistoricFloraParadoxides> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/paradoxides.png");

    public RenderParadoxides(RenderManager mgr) {
        super(mgr, new ModelParadoxides(), 0.2f);
    }

    public static float getScaler() {return 0.66F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParadoxides entity) {
        return RenderParadoxides.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParadoxides entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraParadoxides entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }

}