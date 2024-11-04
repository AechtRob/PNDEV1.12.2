package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKannemeyeria;
import net.lepidodendron.entity.model.entity.ModelKannemeyeria;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKannemeyeria extends RenderLivingBaseWithBook<EntityPrehistoricFloraKannemeyeria> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kannemeyeria.png");

    public RenderKannemeyeria(RenderManager mgr) {
        super(mgr, new ModelKannemeyeria(), 0.5f);
    }
    public static float getScaler() {return 0.65f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKannemeyeria entity) {
        float scale = entity.getAgeScale();
        return RenderKannemeyeria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKannemeyeria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKannemeyeria entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}