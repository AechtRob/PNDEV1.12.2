package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKerygmachela;
import net.lepidodendron.entity.model.entity.ModelKerygmachela;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKerygmachela extends RenderLiving<EntityPrehistoricFloraKerygmachela> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kerygmachela.png");


    public RenderKerygmachela(RenderManager mgr) {
        super(mgr, new ModelKerygmachela(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKerygmachela entity) {
        return RenderKerygmachela.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKerygmachela entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}