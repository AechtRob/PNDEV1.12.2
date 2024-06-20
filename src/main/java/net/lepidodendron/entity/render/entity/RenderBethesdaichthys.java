package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBethesdaichthys;
import net.lepidodendron.entity.model.entity.ModelBethesdaichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBethesdaichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraBethesdaichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bethesdaichthys.png");

    public RenderBethesdaichthys(RenderManager mgr) {
        super(mgr, new ModelBethesdaichthys(),  0.0f);
    }

    public static float getScaler() {return 0.2F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBethesdaichthys entity) {
        return RenderBethesdaichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBethesdaichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBethesdaichthys entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}