package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEusaurosphargis;
import net.lepidodendron.entity.model.entity.ModelEusaurosphargis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEusaurosphargis extends RenderLiving<EntityPrehistoricFloraEusaurosphargis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eusaurosphargis.png");

    public RenderEusaurosphargis(RenderManager mgr) {
        super(mgr, new ModelEusaurosphargis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEusaurosphargis entity) {
        return RenderEusaurosphargis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEusaurosphargis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}














































