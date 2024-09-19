package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDaihuoides;
import net.lepidodendron.entity.model.entity.ModelDaihuoides;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDaihuoides extends RenderLivingBaseWithBook<EntityPrehistoricFloraDaihuoides> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/daihuoides.png");

    public static float getScaler() {return 0.4F;}

    public RenderDaihuoides(RenderManager mgr) {
        super(mgr, new ModelDaihuoides(), 0.0f);
        this.addLayer(new LayerDaihuoidesBody(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDaihuoides entity) {
        return RenderDaihuoides.TEXTURE;

    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDaihuoides entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDaihuoides entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}