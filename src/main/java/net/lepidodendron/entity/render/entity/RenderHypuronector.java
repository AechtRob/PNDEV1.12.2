package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHypuronector;
import net.lepidodendron.entity.model.entity.ModelHypuronector;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHypuronector extends RenderLiving<EntityPrehistoricFloraHypuronector> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hypuronector.png");
    public static final ModelBase MODEL_BASE = new ModelHypuronector();

    public RenderHypuronector(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHypuronector entity) {
        return RenderHypuronector.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHypuronector entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}

