package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPoleumita;
import net.lepidodendron.entity.model.entity.ModelPoleumita;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPoleumita extends RenderLivingBaseWithBook<EntityPrehistoricFloraPoleumita> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/poleumita.png");

    public static float getScaler() {
        return 0.4F;
    }
    public RenderPoleumita(RenderManager mgr) {
        super(mgr, new ModelPoleumita(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPoleumita entity) {
        return RenderPoleumita.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPoleumita entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPoleumita entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}