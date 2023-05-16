package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPelurgaspis;
import net.lepidodendron.entity.model.entity.ModelPelurgaspis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPelurgaspis extends RenderLiving<EntityPrehistoricFloraPelurgaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pelurgaspis.png");
    public static final ModelBase MODEL_BASE = new ModelPelurgaspis();

    public RenderPelurgaspis(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPelurgaspis entity) {
        return RenderPelurgaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPelurgaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}