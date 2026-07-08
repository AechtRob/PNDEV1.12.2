package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPachyrhizodus_marathonensis;
import net.lepidodendron.entity.model.entity.ModelPachyrhizodus_marathonensis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPachyrhizodus_marathonensis extends RenderLivingBaseWithBook<EntityPrehistoricFloraPachyrhizodus_marathonensis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pachyrhizodus_marathonensis.png");

    public static float getScaler() {
        return 0.46F;
    }
    public RenderPachyrhizodus_marathonensis(RenderManager mgr) {
        super(mgr, new ModelPachyrhizodus_marathonensis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPachyrhizodus_marathonensis entity) {
        return RenderPachyrhizodus_marathonensis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPachyrhizodus_marathonensis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPachyrhizodus_marathonensis entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}