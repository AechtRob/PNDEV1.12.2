package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMosura;
import net.lepidodendron.entity.model.entity.ModelMosura;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMosura extends RenderLivingBaseWithBook<EntityPrehistoricFloraMosura> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mosura.png");

    public RenderMosura(RenderManager mgr) {
        super(mgr, new ModelMosura(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMosura entity) {
        return RenderMosura.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMosura entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}