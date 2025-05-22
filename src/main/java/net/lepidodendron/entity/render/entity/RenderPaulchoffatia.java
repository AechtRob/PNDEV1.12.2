package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPaulchoffatia;
import net.lepidodendron.entity.model.entity.ModelPaulchoffatia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPaulchoffatia extends RenderLivingBaseWithBook<EntityPrehistoricFloraPaulchoffatia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/paulchoffatia.png");

    public RenderPaulchoffatia(RenderManager mgr) {
        super(mgr, new ModelPaulchoffatia(), 0.3f);
    }

    public static float getScaler() {
        return 0.3F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPaulchoffatia entity) {
        return RenderPaulchoffatia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPaulchoffatia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPaulchoffatia entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}