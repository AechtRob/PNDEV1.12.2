package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKosoraspis;
import net.lepidodendron.entity.model.entity.ModelKosoraspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKosoraspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraKosoraspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kosoraspis.png");

    public static float getScaler() {
        return 0.3F;
    }
    public RenderKosoraspis(RenderManager mgr) {
        super(mgr, new ModelKosoraspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKosoraspis entity) {
        return RenderKosoraspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKosoraspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKosoraspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}