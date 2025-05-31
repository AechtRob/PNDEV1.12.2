package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraShokawa;
import net.lepidodendron.entity.model.entity.ModelHyphalosaurus;
import net.lepidodendron.entity.model.entity.ModelShokawa;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class RenderShokawa extends RenderLivingBaseWithBook<EntityPrehistoricFloraShokawa> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/shokawa.png");

    public RenderShokawa(RenderManager mgr) {
        super(mgr, new ModelShokawa(), 0.5f);
    }
    public static float getScaler() {
        return 0.23F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraShokawa entity) {
        return RenderShokawa.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraShokawa entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraShokawa entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.42F;
    }

}