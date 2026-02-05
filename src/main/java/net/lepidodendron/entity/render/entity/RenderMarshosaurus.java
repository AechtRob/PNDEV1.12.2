package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMarshosaurus;
import net.lepidodendron.entity.model.entity.ModelMarshosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMarshosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraMarshosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/marshosaurus.png");

    public static float getScaler() {return 1f;}
    public RenderMarshosaurus(RenderManager mgr) {
        super(mgr, new ModelMarshosaurus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMarshosaurus entity) {
        return RenderMarshosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMarshosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMarshosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}