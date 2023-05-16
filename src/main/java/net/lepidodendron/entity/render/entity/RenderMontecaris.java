package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMontecaris;
import net.lepidodendron.entity.model.entity.ModelMontecaris;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMontecaris extends RenderLiving<EntityPrehistoricFloraMontecaris> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/montecaris.png");
    public static final ModelBase MODEL_BASE = new ModelMontecaris();

    public RenderMontecaris(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMontecaris entity) {
        return RenderMontecaris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMontecaris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}





