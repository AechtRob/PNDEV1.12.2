package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAcadoaradoxides;
import net.lepidodendron.entity.model.entity.ModelAcadoaradoxides;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAcadoaradoxides extends RenderLivingBaseWithBook<EntityPrehistoricFloraAcadoaradoxides> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acadoparadoxides.png");

    public RenderAcadoaradoxides(RenderManager mgr) {
        super(mgr, new ModelAcadoaradoxides(), 0.2f);
    }

    public static float getScaler() {return 0.55F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAcadoaradoxides entity) {
        return RenderAcadoaradoxides.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAcadoaradoxides entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAcadoaradoxides entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}