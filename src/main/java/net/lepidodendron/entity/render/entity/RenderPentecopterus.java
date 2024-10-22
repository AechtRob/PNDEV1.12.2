package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPentecopterus;
import net.lepidodendron.entity.model.entity.ModelPentecopterus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPentecopterus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPentecopterus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pentecopterus.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pentecopterus_baby.png");

    public static float getScaler() {
        return 0.63F;
    }
    public RenderPentecopterus(RenderManager mgr) {
        super(mgr, new ModelPentecopterus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPentecopterus entity) {
        float scale = entity.getAgeScale();
        //System.err.println("AgeScale: " + scale);
        if (entity.isSmall()) {
            return RenderPentecopterus.TEXTURE_BABY;
        }
        return RenderPentecopterus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPentecopterus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPentecopterus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}