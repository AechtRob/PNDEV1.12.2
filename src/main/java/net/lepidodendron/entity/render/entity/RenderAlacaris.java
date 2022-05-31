package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAlacaris;
import net.lepidodendron.entity.model.entity.ModelAlacaris;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAlacaris extends RenderLiving<EntityPrehistoricFloraAlacaris> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/alacaris.png");

    public RenderAlacaris(RenderManager mgr) {
        super(mgr, new ModelAlacaris(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAlacaris entity) {
        return RenderAlacaris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAlacaris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}