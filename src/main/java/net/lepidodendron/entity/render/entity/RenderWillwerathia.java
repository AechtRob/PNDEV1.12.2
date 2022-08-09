package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWillwerathia;
import net.lepidodendron.entity.model.entity.ModelWillwerathia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWillwerathia extends RenderLiving<EntityPrehistoricFloraWillwerathia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/willwerathia.png");

    public RenderWillwerathia(RenderManager mgr) {
        super(mgr, new ModelWillwerathia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWillwerathia entity) {
        return RenderWillwerathia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraWillwerathia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}



