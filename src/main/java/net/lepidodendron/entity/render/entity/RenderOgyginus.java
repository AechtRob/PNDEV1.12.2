package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOgyginus;
import net.lepidodendron.entity.model.entity.ModelOgyginus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOgyginus extends RenderLivingBaseWithBook<EntityPrehistoricFloraOgyginus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ogyginus.png");

    public RenderOgyginus(RenderManager mgr) {
        super(mgr, new ModelOgyginus(), 0.05f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOgyginus entity) {
        return RenderOgyginus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOgyginus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}