package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHeliopeltis;
import net.lepidodendron.entity.model.entity.ModelHeliopeltis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHeliopeltis extends RenderLiving<EntityPrehistoricFloraHeliopeltis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/heliopeltis.png");

    public RenderHeliopeltis(RenderManager mgr) {
        super(mgr, new ModelHeliopeltis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHeliopeltis entity) {
        return RenderHeliopeltis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHeliopeltis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}












































































































