package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOdaraia;
import net.lepidodendron.entity.model.entity.ModelOdaraia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOdaraia extends RenderLiving<EntityPrehistoricFloraOdaraia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/odaraia.png");

    public RenderOdaraia(RenderManager mgr) {

        super(mgr, new ModelOdaraia(), 0.0f);
        this.addLayer(new LayerOdaraiaShell(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOdaraia entity) {
        return RenderOdaraia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOdaraia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}