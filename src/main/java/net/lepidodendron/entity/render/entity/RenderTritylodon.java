package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTritylodon;
import net.lepidodendron.entity.model.entity.ModelTritylodon;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTritylodon extends RenderLiving<EntityPrehistoricFloraTritylodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tritylodon.png");

    public static float getScaler() {return 0.325f;}

    public RenderTritylodon(RenderManager mgr) {
        super(mgr, new ModelTritylodon(), 0.14f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTritylodon entity) {
        return RenderTritylodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTritylodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTritylodon entity, float f) {
        float scale = entity.getAgeScale() * getScaler(); //This is smaller than Tritylodon
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}