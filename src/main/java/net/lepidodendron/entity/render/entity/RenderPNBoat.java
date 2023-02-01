package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.boats.EntityPNBoat;
import net.minecraft.client.renderer.entity.RenderBoat;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.util.ResourceLocation;

public class RenderPNBoat extends RenderBoat {
    private static final ResourceLocation TEXTURE_LEPIDODENDRON = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_lepidodendron.png");

    public RenderPNBoat(RenderManager renderManagerIn) {
        super(renderManagerIn);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityBoat entity)
    {
        EntityPNBoat boat = (EntityPNBoat) entity;
        switch (boat.getPNBoatType()) {
            case LEPIDODENDRON:
            default:
                return TEXTURE_LEPIDODENDRON;
        }
    }
}