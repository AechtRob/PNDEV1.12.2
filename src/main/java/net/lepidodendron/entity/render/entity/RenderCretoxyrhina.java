package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCretoxyrhina;
import net.lepidodendron.entity.model.entity.ModelCretoxyrhina;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCretoxyrhina extends RenderLivingBaseWithBook<EntityPrehistoricFloraCretoxyrhina> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cretoxyrhina.png");

    public static float getScaler() {return 1f;}
    public RenderCretoxyrhina(RenderManager mgr) {
        super(mgr, new ModelCretoxyrhina(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCretoxyrhina entity) {
        return RenderCretoxyrhina.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCretoxyrhina entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCretoxyrhina entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}
