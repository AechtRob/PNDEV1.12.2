package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTegopelte;
import net.lepidodendron.entity.model.entity.ModelTegopelte;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTegopelte extends RenderLiving<EntityPrehistoricFloraTegopelte> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tegopelte.png");

    public RenderTegopelte(RenderManager mgr) {
        super(mgr, new ModelTegopelte(), 0.0f);
        this.addLayer(new LayerTegopelteShell(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTegopelte entity) {
        return RenderTegopelte.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTegopelte entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}