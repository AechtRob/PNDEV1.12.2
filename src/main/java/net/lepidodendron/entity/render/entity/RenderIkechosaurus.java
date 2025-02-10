package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIkechosaurus;
import net.lepidodendron.entity.model.entity.ModelIkechosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIkechosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraIkechosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ikechosaurus.png");

    public static float getScaler() {return 0.48f;}
    public RenderIkechosaurus(RenderManager mgr) {
        super(mgr, new ModelIkechosaurus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIkechosaurus entity) {
        return RenderIkechosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIkechosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIkechosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}