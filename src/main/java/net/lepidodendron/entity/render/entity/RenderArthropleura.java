package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArthropleura;
import net.lepidodendron.entity.model.entity.ModelArthropleura;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArthropleura extends RenderLiving<EntityPrehistoricFloraArthropleura> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/arthropleura.png");

    public RenderArthropleura(RenderManager mgr) {
        super(mgr, new ModelArthropleura(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArthropleura entity) {
        return RenderArthropleura.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArthropleura entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}


























































































