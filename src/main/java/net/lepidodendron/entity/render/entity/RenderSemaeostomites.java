package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSemaeostomites;
import net.lepidodendron.entity.model.entity.ModelSemaeostomites;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSemaeostomites extends RenderLivingBaseWithBook<EntityPrehistoricFloraSemaeostomites> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/semaeostomites.png");

    public static float getScaler() {return 0.44F;}

    public RenderSemaeostomites(RenderManager mgr) {
        super(mgr, new ModelSemaeostomites(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSemaeostomites entity) {
        return RenderSemaeostomites.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSemaeostomites entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSemaeostomites entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}