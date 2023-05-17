package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSaurichthysFreshwater;
import net.lepidodendron.entity.model.entity.ModelSaurichthys;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSaurichthysFreshwater extends RenderLiving<EntityPrehistoricFloraSaurichthysFreshwater> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/saurichthys_freshwater.png");

    public RenderSaurichthysFreshwater(RenderManager mgr) {
        super(mgr, new ModelSaurichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSaurichthysFreshwater entity) {
        return RenderSaurichthysFreshwater.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSaurichthysFreshwater entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}