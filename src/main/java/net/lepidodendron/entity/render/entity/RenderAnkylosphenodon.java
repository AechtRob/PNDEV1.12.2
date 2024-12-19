package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAnkylosphenodon;
import net.lepidodendron.entity.model.entity.ModelAnkylosphenodon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAnkylosphenodon extends RenderLivingBaseWithBook<EntityPrehistoricFloraAnkylosphenodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ankylosphenodon.png");

    public static float getScaler() {
        return 0.7F * 0.18F;
    }
    public RenderAnkylosphenodon(RenderManager mgr) {
        super(mgr, new ModelAnkylosphenodon(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAnkylosphenodon entity) {
        return RenderAnkylosphenodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAnkylosphenodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAnkylosphenodon entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}