package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKokuraichthys;
import net.lepidodendron.entity.model.entity.ModelKokuraichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKokuraichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraKokuraichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kokuraichthys.png");

    public RenderKokuraichthys(RenderManager mgr) {
        super(mgr, new ModelKokuraichthys(), 0.0f);
    }

    public static float getScaler() {return 0.195F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKokuraichthys entity) {
        return RenderKokuraichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKokuraichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKokuraichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}