package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTypothorax;
import net.lepidodendron.entity.model.entity.ModelTypothorax;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTypothorax extends RenderLivingBaseWithBook<EntityPrehistoricFloraTypothorax> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/typothorax.png");

    public static float getScaler() {
        return 0.6F;
    }
    public RenderTypothorax(RenderManager mgr) {
        super(mgr, new ModelTypothorax(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTypothorax entity) {
        return RenderTypothorax.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTypothorax entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTypothorax entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}