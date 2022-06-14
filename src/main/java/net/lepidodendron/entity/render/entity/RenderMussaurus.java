package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMussaurus;
import net.lepidodendron.entity.model.entity.ModelMussaurus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMussaurus extends RenderLiving<EntityPrehistoricFloraMussaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mussaurus.png");

    public RenderMussaurus(RenderManager mgr) {
        super(mgr, new ModelMussaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMussaurus entity) {
        return RenderMussaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMussaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}



































