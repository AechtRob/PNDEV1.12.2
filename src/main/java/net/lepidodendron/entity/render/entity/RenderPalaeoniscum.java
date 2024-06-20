package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeoniscum;
import net.lepidodendron.entity.model.entity.ModelPalaeoniscum;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPalaeoniscum extends RenderLivingBaseWithBook<EntityPrehistoricFloraPalaeoniscum> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeoniscum.png");
    public static float getScaler() {
        return 0.14F;
    }

    public RenderPalaeoniscum(RenderManager mgr) {
        super(mgr, new ModelPalaeoniscum(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPalaeoniscum entity) {
        return RenderPalaeoniscum.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPalaeoniscum entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}