package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAnthracoceras;
import net.lepidodendron.entity.model.entity.ModelAnthracoceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAnthracoceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraAnthracoceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anthracoceras.png");

    public static float getScaler() {
        return 0.2F;
    }
    public RenderAnthracoceras(RenderManager mgr) {
        super(mgr, new ModelAnthracoceras(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAnthracoceras entity) {
        return RenderAnthracoceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAnthracoceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAnthracoceras entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}