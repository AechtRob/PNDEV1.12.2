package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraYuanyanglong;
import net.lepidodendron.entity.model.entity.ModelYuanyanglong;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class RenderYuanyanglong extends RenderLivingBaseWithBook<EntityPrehistoricFloraYuanyanglong> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yuanyanglong.png");
    public static final ResourceLocation TEXTURE_ZOMBIE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yuanyanglong_zombie.png");

    public RenderYuanyanglong(RenderManager mgr) {
        super(mgr, new ModelYuanyanglong(), 0.3f);
    }

    public static float getScaler() {
        return 0.3636F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraYuanyanglong entity) {
        String s = TextFormatting.getTextWithoutFormattingCodes(entity.getName());
        if (s != null &&
                (("zombie".equalsIgnoreCase(s)))
        ) {
            return RenderYuanyanglong.TEXTURE_ZOMBIE;
        }
        return RenderYuanyanglong.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraYuanyanglong entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraYuanyanglong entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}