package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHomalonotus;
import net.lepidodendron.entity.model.entity.ModelHomalonotus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHomalonotus extends RenderLivingBaseWithBook<EntityPrehistoricFloraHomalonotus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/homalonotus.png");

    public static float getScaler() {return 2.2F * 0.3F;}

    public RenderHomalonotus(RenderManager mgr) {
        super(mgr, new ModelHomalonotus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHomalonotus entity) {
        return RenderHomalonotus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHomalonotus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHomalonotus entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.00F;
    }


}