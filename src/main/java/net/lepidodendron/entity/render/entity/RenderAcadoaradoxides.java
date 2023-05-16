package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAcadoaradoxides;
import net.lepidodendron.entity.model.entity.ModelAcadoaradoxides;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAcadoaradoxides extends RenderLiving<EntityPrehistoricFloraAcadoaradoxides> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acadoaradoxides.png");
    public static final ModelBase MODEL_BASE = new ModelAcadoaradoxides();

    public RenderAcadoaradoxides(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAcadoaradoxides entity) {
        return RenderAcadoaradoxides.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAcadoaradoxides entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}