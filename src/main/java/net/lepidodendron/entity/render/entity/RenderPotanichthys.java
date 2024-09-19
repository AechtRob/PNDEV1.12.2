package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPotanichthys;
import net.lepidodendron.entity.model.entity.ModelPotanichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPotanichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraPotanichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/potanichthys.png");

    public RenderPotanichthys(RenderManager mgr) {
        super(mgr, new ModelPotanichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPotanichthys entity) {
        return RenderPotanichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPotanichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}




