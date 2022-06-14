package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLotosaurus;
import net.lepidodendron.entity.model.entity.ModelLotosaurus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLotosaurus extends RenderLiving<EntityPrehistoricFloraLotosaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lotosaurus.png");

    public RenderLotosaurus(RenderManager mgr) {
        super(mgr, new ModelLotosaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLotosaurus entity) {
        return RenderLotosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLotosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}






































