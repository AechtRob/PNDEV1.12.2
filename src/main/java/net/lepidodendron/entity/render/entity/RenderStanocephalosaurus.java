package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraStanocephalosaurus;
import net.lepidodendron.entity.model.entity.ModelStanocephalosaurus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderStanocephalosaurus extends RenderLiving<EntityPrehistoricFloraStanocephalosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/stanocephalosaurus.png");

    public RenderStanocephalosaurus(RenderManager mgr) {
        super(mgr, new ModelStanocephalosaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraStanocephalosaurus entity) {
        return RenderStanocephalosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraStanocephalosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}

