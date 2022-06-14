package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRhenocystis;
import net.lepidodendron.entity.model.entity.ModelRhenocystis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRhenocystis extends RenderLiving<EntityPrehistoricFloraRhenocystis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rhenocystis.png");

    public RenderRhenocystis(RenderManager mgr) {
        super(mgr, new ModelRhenocystis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRhenocystis entity) {
        return RenderRhenocystis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRhenocystis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}









































































































