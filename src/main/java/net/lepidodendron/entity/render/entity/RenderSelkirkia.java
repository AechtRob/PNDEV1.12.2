package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSelkirkia;
import net.lepidodendron.entity.model.entity.ModelSelkirkia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSelkirkia extends RenderLivingBaseWithBook<EntityPrehistoricFloraSelkirkia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/selkirkia.png");

    public RenderSelkirkia(RenderManager mgr) {
        super(mgr, new ModelSelkirkia(), 0.1f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSelkirkia entity) {
        return RenderSelkirkia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSelkirkia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
}