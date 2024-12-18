package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMachimosaurus;
import net.lepidodendron.entity.model.entity.ModelMachimosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMachimosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraMachimosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/machimosaurus.png");

    public static float getScaler() {return 1.43f;}
    public RenderMachimosaurus(RenderManager mgr) {
        super(mgr, new ModelMachimosaurus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMachimosaurus entity) {
        return RenderMachimosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMachimosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMachimosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}