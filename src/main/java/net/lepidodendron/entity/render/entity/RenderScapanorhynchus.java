package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraScapanorhynchus;
import net.lepidodendron.entity.model.entity.ModelScapanorhynchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScapanorhynchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraScapanorhynchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scapanorhynchus.png");

    public RenderScapanorhynchus(RenderManager mgr) {
        super(mgr, new ModelScapanorhynchus(), 0.5f);
    }
    public static float getScaler() {return 1f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraScapanorhynchus entity) {
        float scale = entity.getAgeScale();
        return RenderScapanorhynchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraScapanorhynchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraScapanorhynchus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.10F;
    }

}