package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraStichopterus;
import net.lepidodendron.entity.model.entity.ModelStichopterus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderStichopterus extends RenderLivingBaseWithBook<EntityPrehistoricFloraStichopterus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/stichopterus.png");

    public RenderStichopterus(RenderManager mgr) {
        super(mgr, new ModelStichopterus(), 0.0f);
    }

    public static float getScaler() {return 0.26F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraStichopterus entity) {
        return RenderStichopterus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraStichopterus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraStichopterus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}