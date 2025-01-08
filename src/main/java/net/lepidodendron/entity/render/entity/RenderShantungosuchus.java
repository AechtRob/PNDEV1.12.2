package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraShantungosuchus;
import net.lepidodendron.entity.model.entity.ModelShantungosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderShantungosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraShantungosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/shantungosuchus.png");

    public static float getScaler() {
        return 0.3F;
    }

    public RenderShantungosuchus(RenderManager mgr) {
        super(mgr, new ModelShantungosuchus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraShantungosuchus entity) {
        return RenderShantungosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraShantungosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraShantungosuchus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}




