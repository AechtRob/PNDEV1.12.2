package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRhamphoichthys;
import net.lepidodendron.entity.model.entity.ModelRhamphoichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRhamphoichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraRhamphoichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rhamphoichthys.png");

    public RenderRhamphoichthys(RenderManager mgr) {
        super(mgr, new ModelRhamphoichthys(), 0.0f);
    }

    public static float getScaler() {return 0.42F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRhamphoichthys entity) {
        return RenderRhamphoichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRhamphoichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRhamphoichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





