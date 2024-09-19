package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTeraterpeton;
import net.lepidodendron.entity.model.entity.ModelTeraterpeton;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTeraterpeton extends RenderLivingBaseWithBook<EntityPrehistoricFloraTeraterpeton> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/teraterpeton.png");

    public RenderTeraterpeton(RenderManager mgr) {
        super(mgr, new ModelTeraterpeton(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTeraterpeton entity) {
        return RenderTeraterpeton.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTeraterpeton entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}




