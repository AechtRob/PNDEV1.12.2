package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraYilingia;
import net.lepidodendron.entity.model.entity.ModelYilingia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class RenderYilingia extends RenderLivingBaseWithBook<EntityPrehistoricFloraYilingia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yilingia.png");
    public static final ResourceLocation TEXTURE_GUMMY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yilingia_gummy.png");
    public static final ResourceLocation TEXTURE_STICK = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yilingia_stick.png");

    public RenderYilingia(RenderManager mgr) {
        super(mgr, new ModelYilingia(), 0.0f);
    }

    public static float getScaler() {
        return 0.250F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraYilingia entity) {
        String s = TextFormatting.getTextWithoutFormattingCodes(entity.getName());
        if (s != null &&
                ("Gummy".equalsIgnoreCase(s)
                ||"Gummy Worm".equalsIgnoreCase(s)
                ||"Gummi Worm".equalsIgnoreCase(s)
                ||"Sour Worm".equalsIgnoreCase(s)))
        {
            return RenderYilingia.TEXTURE_GUMMY;
        }
        else if (s != null &&
                ("Stick".equalsIgnoreCase(s)))
        {
            return RenderYilingia.TEXTURE_STICK;
        }
        return RenderYilingia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraYilingia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraYilingia entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}