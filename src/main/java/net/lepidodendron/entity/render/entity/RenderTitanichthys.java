package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTitanichthys;
import net.lepidodendron.entity.model.entity.ModelTitanicthys;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextFormatting;

public class RenderTitanichthys extends RenderLiving<EntityPrehistoricFloraTitanichthys> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanichthys.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanichthys_baby.png");

    public RenderTitanichthys(RenderManager mgr) {
        super(mgr, new ModelTitanicthys(), 1.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTitanichthys entity) {
        float scale = entity.getAgeScale();
        //System.err.println("AgeScale: " + scale);
        if (scale < 0.2F) {
            return RenderTitanichthys.TEXTURE_BABY;
        }
        return RenderTitanichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTitanichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks)
    {
        GlStateManager.rotate(180.0F - rotationYaw, 0.0F, 1.0F, 0.0F);

        if (entityLiving.deathTime > 0)
        {
            float f = ((float)entityLiving.deathTime + partialTicks - 1.0F) / 20.0F * 1.6F;
            f = MathHelper.sqrt(f);

            if (f > 1.0F)
            {
                f = 1.0F;
            }

            GlStateManager.rotate(f * this.getDeathMaxRotation(entityLiving), 0.0F, 0.0F, 1.0F);
        }
        else
        {
            String s = TextFormatting.getTextWithoutFormattingCodes(entityLiving.getName());

            if (s != null && ("Keith".equalsIgnoreCase(s)))
            {
                GlStateManager.scale(3.0,3.0,3.0);
            }
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTitanichthys entity, float f) {
        float scale = entity.getAgeScale();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}