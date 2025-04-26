package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKirkospira;
import net.lepidodendron.entity.model.entity.ModelKirkospira;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKirkospira extends RenderLivingBaseWithBook<EntityPrehistoricFloraKirkospira> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kirkospira.png");

    public static float getScaler() {
        return 0.2F;
    }
    public RenderKirkospira(RenderManager mgr) {
        super(mgr, new ModelKirkospira(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKirkospira entity) {
        return RenderKirkospira.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKirkospira entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKirkospira entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}