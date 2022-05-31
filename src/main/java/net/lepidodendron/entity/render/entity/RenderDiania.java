package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDiania;
import net.lepidodendron.entity.model.entity.ModelDiania;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDiania extends RenderLiving<EntityPrehistoricFloraDiania> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diania.png");
    private static final ResourceLocation TEXTURE_NERF = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diania_nerf.png");
    public RenderDiania(RenderManager mgr) {
        super(mgr, new ModelDiania(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDiania entity) {
        if (LepidodendronConfig.doLowRes) {
            return RenderDiania.TEXTURE_NERF;
        }
        return RenderDiania.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDiania entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}