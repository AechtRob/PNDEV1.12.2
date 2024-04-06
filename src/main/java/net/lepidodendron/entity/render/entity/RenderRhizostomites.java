package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRhizostomites;
import net.lepidodendron.entity.model.entity.ModelRhizostomites;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRhizostomites extends RenderLiving<EntityPrehistoricFloraRhizostomites> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rhizostomites.png");

    public static float getScaler() {return 0.6F;}

    public RenderRhizostomites(RenderManager mgr) {
        super(mgr, new ModelRhizostomites(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRhizostomites entity) {
        return RenderRhizostomites.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRhizostomites entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRhizostomites entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}