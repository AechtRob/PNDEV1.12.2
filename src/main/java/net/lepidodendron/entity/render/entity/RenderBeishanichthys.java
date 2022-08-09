package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBeishanichthys;
import net.lepidodendron.entity.model.entity.ModelBeishanichthys;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBeishanichthys extends RenderLiving<EntityPrehistoricFloraBeishanichthys> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/beishanichthys.png");

    public RenderBeishanichthys(RenderManager mgr) {
        super(mgr, new ModelBeishanichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBeishanichthys entity) {
        return RenderBeishanichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBeishanichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}
