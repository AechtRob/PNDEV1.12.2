package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRetifacies;
import net.lepidodendron.entity.model.entity.ModelRetifacies;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRetifacies extends RenderLivingBaseWithBook<EntityPrehistoricFloraRetifacies> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/retifacies.png");

    public RenderRetifacies(RenderManager mgr) {
        super(mgr, new ModelRetifacies(), 0.08f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRetifacies entity) {
        return RenderRetifacies.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRetifacies entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}