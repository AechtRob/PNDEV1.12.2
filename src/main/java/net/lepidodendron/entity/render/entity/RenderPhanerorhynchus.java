package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPhanerorhynchus;
import net.lepidodendron.entity.model.entity.ModelPhanerorhynchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPhanerorhynchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPhanerorhynchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phanerorhynchus.png");

    public RenderPhanerorhynchus(RenderManager mgr) {
        super(mgr, new ModelPhanerorhynchus(), 0.0f);
    }

    public static float getScaler() {return 0.3F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPhanerorhynchus entity) {
        return RenderPhanerorhynchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPhanerorhynchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPhanerorhynchus entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}