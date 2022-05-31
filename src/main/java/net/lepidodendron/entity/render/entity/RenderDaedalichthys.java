package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDaedalichthys;
import net.lepidodendron.entity.model.entity.ModelDaedalichthys;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDaedalichthys extends RenderLiving<EntityPrehistoricFloraDaedalichthys> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/daedalichthys.png");

    public RenderDaedalichthys(RenderManager mgr) {
        super(mgr, new ModelDaedalichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDaedalichthys entity) {
        return RenderDaedalichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDaedalichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}