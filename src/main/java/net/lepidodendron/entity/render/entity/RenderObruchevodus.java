package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraObruchevodus;
import net.lepidodendron.entity.model.entity.ModelObruchevodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderObruchevodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraObruchevodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/obruchevodus.png");

    public RenderObruchevodus(RenderManager mgr) {
        super(mgr, new ModelObruchevodus(), 0.05f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraObruchevodus entity) {
        return RenderObruchevodus.TEXTURE;
    }
    public static float getScaler() {return 0.26F;}

    @Override
    protected void applyRotations(EntityPrehistoricFloraObruchevodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraObruchevodus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}