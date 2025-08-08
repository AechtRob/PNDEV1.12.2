package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDentilepisosteus;
import net.lepidodendron.entity.model.entity.ModelDentilepisosteus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDentilepisosteus extends RenderLivingBaseWithBook<EntityPrehistoricFloraDentilepisosteus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dentilepisosteus.png");

    public RenderDentilepisosteus(RenderManager mgr) {
        super(mgr, new ModelDentilepisosteus(), 0.0f);
    }

    public static float getScaler() {return 0.25F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDentilepisosteus entity) {
        return RenderDentilepisosteus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDentilepisosteus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDentilepisosteus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





