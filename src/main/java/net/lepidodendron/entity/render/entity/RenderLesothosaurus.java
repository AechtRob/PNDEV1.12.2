package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLesothosaurus;
import net.lepidodendron.entity.model.entity.ModelLesothosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLesothosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraLesothosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lesothosaurus.png");

    public static float getScaler() {return 0.288F;}

    public RenderLesothosaurus(RenderManager mgr) {
        super(mgr, new ModelLesothosaurus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLesothosaurus entity) {
        return RenderLesothosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLesothosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLesothosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}