package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCheloniellon;
import net.lepidodendron.entity.model.entity.ModelCheloniellon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCheloniellon extends RenderLivingBaseWithBook<EntityPrehistoricFloraCheloniellon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cheloniellon.png");

    public RenderCheloniellon(RenderManager mgr) {
        super(mgr, new ModelCheloniellon(), 0.1f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCheloniellon entity) {
        return RenderCheloniellon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCheloniellon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}