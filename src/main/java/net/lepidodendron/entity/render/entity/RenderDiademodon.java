package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDiademodon;
import net.lepidodendron.entity.model.entity.ModelDiademodon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class RenderDiademodon extends RenderLivingBaseWithBook<EntityPrehistoricFloraDiademodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diademodon.png");
    private static final ResourceLocation TEXTURE_DOUG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diademodon_doug.png");

    public RenderDiademodon(RenderManager mgr) {
        super(mgr, new ModelDiademodon(), 0.5f);
    }
    public static float getScaler() {
        return 0.5F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDiademodon entity) {
        String s = TextFormatting.getTextWithoutFormattingCodes(entity.getName());
        if (s != null && ("Doug".equalsIgnoreCase(s)))
        {
            return RenderDiademodon.TEXTURE_DOUG;
        }
        return RenderDiademodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDiademodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDiademodon entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.42F;
    }

}