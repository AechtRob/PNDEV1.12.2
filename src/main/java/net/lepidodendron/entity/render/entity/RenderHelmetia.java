package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHelmetia;
import net.lepidodendron.entity.model.entity.ModelHelmetia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHelmetia extends RenderLivingBaseWithBook<EntityPrehistoricFloraHelmetia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/helmetia.png");

    public RenderHelmetia(RenderManager mgr) {
        super(mgr, new ModelHelmetia(), 0.08f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHelmetia entity) {
        return RenderHelmetia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHelmetia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}