package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAngelacanthus;
import net.lepidodendron.entity.model.entity.ModelAngelacanthus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAngelacanthus extends RenderLivingBaseWithBook<EntityPrehistoricFloraAngelacanthus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/angelacanthus.png");

    public static float getScaler() {
        return 0.7F * 0.4F;
    }
    public RenderAngelacanthus(RenderManager mgr) {
        super(mgr, new ModelAngelacanthus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAngelacanthus entity) {
        return RenderAngelacanthus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAngelacanthus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAngelacanthus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}