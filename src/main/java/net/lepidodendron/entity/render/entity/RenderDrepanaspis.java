package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDrepanaspis;
import net.lepidodendron.entity.model.entity.ModelDrepanaspis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDrepanaspis extends RenderLiving<EntityPrehistoricFloraDrepanaspis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/drepanaspis.png");

    public RenderDrepanaspis(RenderManager mgr) {
        super(mgr, new ModelDrepanaspis(), 0.325f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDrepanaspis entity) {
        return RenderDrepanaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDrepanaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}