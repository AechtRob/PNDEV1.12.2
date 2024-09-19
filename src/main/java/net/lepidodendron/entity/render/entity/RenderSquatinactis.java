package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSquatinactis;
import net.lepidodendron.entity.model.entity.ModelSquatinactis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSquatinactis extends RenderLivingBaseWithBook<EntityPrehistoricFloraSquatinactis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/squatinactis.png");

    public RenderSquatinactis(RenderManager mgr) {
        super(mgr, new ModelSquatinactis(), 0.0f);
    }
    public static float getScaler() {
        return 0.7F * 0.43F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSquatinactis entity) {
        return RenderSquatinactis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSquatinactis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}