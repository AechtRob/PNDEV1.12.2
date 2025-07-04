package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDucrotayichthys;
import net.lepidodendron.entity.model.entity.ModelDucrotayichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDucrotayichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraDucrotayichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ducrotayichthys.png");

    public RenderDucrotayichthys(RenderManager mgr) {
        super(mgr, new ModelDucrotayichthys(), 0.0f);
    }

    public static float getScaler() {return 0.16F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDucrotayichthys entity) {
        return RenderDucrotayichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDucrotayichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDucrotayichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





