package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDaedalichthys;
import net.lepidodendron.entity.model.entity.ModelDaedalichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDaedalichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraDaedalichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/daedalichthys.png");

    public RenderDaedalichthys(RenderManager mgr) {
        super(mgr, new ModelDaedalichthys(), 0.0f);
    }

    public static float getScaler() {return 0.128F * 1.4F;}

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDaedalichthys entity) {
        return RenderDaedalichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDaedalichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDaedalichthys entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}