package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPleurosaurus;
import net.lepidodendron.entity.model.entity.ModelPleurosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPleurosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPleurosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pleuerosaurus.png");

    public RenderPleurosaurus(RenderManager mgr) {
        super(mgr, new ModelPleurosaurus(), 0.0f);
    }

    public static float getScaler() {
        return 0.25F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPleurosaurus entity) {
        return RenderPleurosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPleurosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPleurosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;

    }

}