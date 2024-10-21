package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSolnhofenamia;
import net.lepidodendron.entity.model.entity.ModelSolnhofenamia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSolnhofenamia extends RenderLivingBaseWithBook<EntityPrehistoricFloraSolnhofenamia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/solnhofenamia.png");

    public RenderSolnhofenamia(RenderManager mgr) {
        super(mgr, new ModelSolnhofenamia(), 0.0f);
    }

    public static float getScaler() {return 0.25F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSolnhofenamia entity) {
        return RenderSolnhofenamia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSolnhofenamia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraSolnhofenamia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}