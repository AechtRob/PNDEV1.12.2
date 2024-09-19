package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLufengosaurus;
import net.lepidodendron.entity.model.entity.ModelLufengosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLufengosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraLufengosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lufengosaurus.png");

    public static float getScaler() {return 0.7272F;}

    public RenderLufengosaurus(RenderManager mgr) {
        super(mgr, new ModelLufengosaurus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLufengosaurus entity) {
        return RenderLufengosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLufengosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLufengosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}