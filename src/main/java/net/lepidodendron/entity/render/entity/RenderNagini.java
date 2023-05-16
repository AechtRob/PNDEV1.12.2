package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNagini;
import net.lepidodendron.entity.model.entity.ModelNagini;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNagini extends RenderLiving<EntityPrehistoricFloraNagini> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nagini.png");
    public static final ModelBase MODEL_BASE = new ModelNagini();

    public RenderNagini(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNagini entity) {
        return RenderNagini.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNagini entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}




