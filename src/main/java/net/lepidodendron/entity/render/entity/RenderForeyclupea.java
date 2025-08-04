package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraForeyclupea;
import net.lepidodendron.entity.model.entity.ModelForeyclupea;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderForeyclupea extends RenderLivingBaseWithBook<EntityPrehistoricFloraForeyclupea> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/foreyclupea.png");

    public RenderForeyclupea(RenderManager mgr) {
        super(mgr, new ModelForeyclupea(), 0.0f);
    }

    public static float getScaler() {return 0.2F;}

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraForeyclupea entity) {
        return RenderForeyclupea.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraForeyclupea entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraForeyclupea entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}