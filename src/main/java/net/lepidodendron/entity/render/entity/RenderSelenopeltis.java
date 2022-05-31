package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSelenopeltis;
import net.lepidodendron.entity.model.entity.ModelSelenopeltis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSelenopeltis extends RenderLiving<EntityPrehistoricFloraSelenopeltis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/Selenopeltis.png");

    public RenderSelenopeltis(RenderManager mgr) {
        super(mgr, new ModelSelenopeltis(), 0.08f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSelenopeltis entity) {
        return RenderSelenopeltis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSelenopeltis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}