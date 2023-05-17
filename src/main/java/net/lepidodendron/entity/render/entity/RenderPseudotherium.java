package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPseudotherium;
import net.lepidodendron.entity.model.entity.ModelPseudotherium;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPseudotherium extends RenderLiving<EntityPrehistoricFloraPseudotherium> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pseudotherium.png");

    public static float getScaler() {return 0.15f;}
    public RenderPseudotherium(RenderManager mgr) {
        super(mgr, new ModelPseudotherium(), 0.325f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPseudotherium entity) {
        return RenderPseudotherium.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPseudotherium entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPseudotherium entity, float f) {
        float scale = entity.getAgeScale()*getScaler(); //This is smaller than Pseudotherium
        GlStateManager.scale(scale, scale, scale);
        //this.shadowSize = entity.width * scale * 0.125F;
    }

}