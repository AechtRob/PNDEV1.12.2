package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPlesiosaurus;
import net.lepidodendron.entity.model.entity.ModelPlesiosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPlesiosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPlesiosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/plesiosaurus.png");

    public static float getScaler() {
        return 0.516F*1.2f;
    }
    public RenderPlesiosaurus(RenderManager mgr) {
        super(mgr, new ModelPlesiosaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPlesiosaurus entity) {
        return RenderPlesiosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPlesiosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPlesiosaurus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}