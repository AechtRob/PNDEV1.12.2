package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNimbia;
import net.lepidodendron.entity.model.entity.ModelPrecambrianJelly;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNimbia extends RenderLivingBaseWithBook<EntityPrehistoricFloraNimbia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nimbia.png");

    public static float getScaler() {return 0.45F;}

    public RenderNimbia(RenderManager mgr) {
        super(mgr, new ModelPrecambrianJelly(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNimbia entity) {
        return RenderNimbia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNimbia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
//        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        GlStateManager.rotate(180.0F - entityLiving.getTickOffset(), 0.0F, 1.0F, 0.0F);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNimbia entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}