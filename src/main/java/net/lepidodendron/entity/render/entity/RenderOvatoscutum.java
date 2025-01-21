package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOvatoscutum;
import net.lepidodendron.entity.model.entity.ModelOvatoscutum;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOvatoscutum extends RenderLivingBaseWithBook<EntityPrehistoricFloraOvatoscutum> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/Ovatoscutum.png");
    public static float getScaler() {
        return 0.335F;
    }

    public RenderOvatoscutum(RenderManager mgr) {
        super(mgr, new ModelOvatoscutum(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOvatoscutum entity) {
        return RenderOvatoscutum.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOvatoscutum entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraOvatoscutum entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}