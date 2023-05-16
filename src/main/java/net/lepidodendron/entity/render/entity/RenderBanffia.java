package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBanffia;
import net.lepidodendron.entity.model.entity.ModelBanffia;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBanffia extends RenderLiving<EntityPrehistoricFloraBanffia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/banffia.png");
    public static final ModelBase MODEL_BASE = new ModelBanffia();

    public RenderBanffia(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBanffia entity) {
        return RenderBanffia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBanffia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}