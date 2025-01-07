package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCooyoo;
import net.lepidodendron.entity.model.entity.ModelCooyoo;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCooyoo extends RenderLivingBaseWithBook<EntityPrehistoricFloraCooyoo> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cooyoo.png");

    public static float getScaler() {
        return 0.7F;
    }
    public RenderCooyoo(RenderManager mgr) {
        super(mgr, new ModelCooyoo(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCooyoo entity) {
        return RenderCooyoo.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCooyoo entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCooyoo entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}