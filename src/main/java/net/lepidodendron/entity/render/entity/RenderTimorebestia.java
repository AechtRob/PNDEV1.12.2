package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTimorebestia;
import net.lepidodendron.entity.model.entity.ModelTimorebestia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTimorebestia extends RenderLivingBaseWithBook<EntityPrehistoricFloraTimorebestia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/timorebestia.png");

    public static float getScaler() {
        return 0.275F;
    }

    public RenderTimorebestia(RenderManager mgr) {
        super(mgr, new ModelTimorebestia(), 0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTimorebestia entity) {
        return RenderTimorebestia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTimorebestia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTimorebestia entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}