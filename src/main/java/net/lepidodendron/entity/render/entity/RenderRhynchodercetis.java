package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRhynchodercetis;
import net.lepidodendron.entity.model.entity.ModelRhynchodercetis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRhynchodercetis extends RenderLivingBaseWithBook<EntityPrehistoricFloraRhynchodercetis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rhynchodercetis.png");

    public RenderRhynchodercetis(RenderManager mgr) {
        super(mgr, new ModelRhynchodercetis(), 0.0f);
    }

    public static float getScaler() {return 0.26F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRhynchodercetis entity) {
        return RenderRhynchodercetis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRhynchodercetis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRhynchodercetis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





