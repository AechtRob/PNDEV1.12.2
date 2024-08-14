package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGoodrichthys;
import net.lepidodendron.entity.model.entity.ModelGoodrichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGoodrichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraGoodrichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/goodrichthys.png");

    public RenderGoodrichthys(RenderManager mgr) {
        super(mgr, new ModelGoodrichthys(), 0.0f);
    }

    public static float getScaler() {return 0.63f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGoodrichthys entity) {
        return RenderGoodrichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGoodrichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGoodrichthys entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}




