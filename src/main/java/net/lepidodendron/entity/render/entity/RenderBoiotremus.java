package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBoiotremus;
import net.lepidodendron.entity.model.entity.ModelBoiotremus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBoiotremus extends RenderLivingBaseWithBook<EntityPrehistoricFloraBoiotremus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/boiotremus.png");

    public static float getScaler() {
        return 0.25F;
    }
    public RenderBoiotremus(RenderManager mgr) {
        super(mgr, new ModelBoiotremus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBoiotremus entity) {
        return RenderBoiotremus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBoiotremus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBoiotremus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}