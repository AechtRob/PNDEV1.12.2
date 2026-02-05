package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArganaceras;
import net.lepidodendron.entity.model.entity.ModelArganaceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArganaceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraArganaceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/arganaceras.png");

    public RenderArganaceras(RenderManager mgr) {
        super(mgr, new ModelArganaceras(), 0.0f);
    }

    public static float getScaler() {return 0.76f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArganaceras entity) {
        return RenderArganaceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArganaceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraArganaceras entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}