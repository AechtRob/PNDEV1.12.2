package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDiplocaulus_minimus;
import net.lepidodendron.entity.model.entity.ModelDiplocaulus_minimus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDiplocaulus_minimus extends RenderLivingBaseWithBook<EntityPrehistoricFloraDiplocaulus_minimus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diplocaulus_minimus.png");

    public RenderDiplocaulus_minimus(RenderManager mgr) {
        super(mgr, new ModelDiplocaulus_minimus(), 0.0f);
    }

    public static float getScaler() {return 0.22F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDiplocaulus_minimus entity) {
        return RenderDiplocaulus_minimus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDiplocaulus_minimus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraDiplocaulus_minimus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}