package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDyoplax;
import net.lepidodendron.entity.model.entity.ModelDyoplax;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDyoplax extends RenderLivingBaseWithBook<EntityPrehistoricFloraDyoplax> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dyoplax.png");

    public static float getScaler() {return 0.203f;}
    public RenderDyoplax(RenderManager mgr) {
        super(mgr, new ModelDyoplax(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDyoplax entity) {
        return RenderDyoplax.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDyoplax entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDyoplax entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}