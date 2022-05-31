package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJianshanopodia;
import net.lepidodendron.entity.model.entity.ModelJianshanopodia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderJianshanopodia extends RenderLiving<EntityPrehistoricFloraJianshanopodia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/jianshanopodia.png");

    public RenderJianshanopodia(RenderManager mgr) {
        super(mgr, new ModelJianshanopodia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJianshanopodia entity) {
        return RenderJianshanopodia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJianshanopodia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}