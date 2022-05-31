package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSchinderhannes;
import net.lepidodendron.entity.model.entity.ModelSchinderhannes;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSchinderhannes extends RenderLiving<EntityPrehistoricFloraSchinderhannes> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/schinderhannes.png");

    public RenderSchinderhannes(RenderManager mgr) {
        super(mgr, new ModelSchinderhannes(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSchinderhannes entity) {
        return RenderSchinderhannes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSchinderhannes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}