package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNagini;
import net.lepidodendron.entity.model.entity.ModelNagini;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNagini extends RenderLivingBaseWithBook<EntityPrehistoricFloraNagini> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nagini.png");

    public RenderNagini(RenderManager mgr) {
        super(mgr, new ModelNagini(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNagini entity) {
        return RenderNagini.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNagini entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}




