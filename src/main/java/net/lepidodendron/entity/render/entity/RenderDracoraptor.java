package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDracoraptor;
import net.lepidodendron.entity.model.entity.ModelDracoraptor;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDracoraptor extends RenderLivingBaseWithBook<EntityPrehistoricFloraDracoraptor> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dracoraptor.png");

    public RenderDracoraptor(RenderManager mgr) {
        super(mgr, new ModelDracoraptor(), 0.5f);
    }
    public static float getScaler() {return 0.45f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDracoraptor entity) {
        float scale = entity.getAgeScale();
        return RenderDracoraptor.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDracoraptor entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDracoraptor entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}