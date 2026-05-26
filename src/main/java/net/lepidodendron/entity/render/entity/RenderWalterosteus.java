package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWalterosteus;
import net.lepidodendron.entity.model.entity.ModelWalterosteus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class RenderWalterosteus extends RenderLivingBaseWithBook<EntityPrehistoricFloraWalterosteus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/walterosteus.png");
    private static final ResourceLocation TEXTURE_WALTUH = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/waltuh.png");


    public static float getScaler() {
        return 0.35F;
    }
    public RenderWalterosteus(RenderManager mgr) {
        super(mgr, new ModelWalterosteus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWalterosteus entity) {
        String s = TextFormatting.getTextWithoutFormattingCodes(entity.getName());
        if (s != null && ("Waltuh".equalsIgnoreCase(s))
                || ("Walter White".equalsIgnoreCase(s))
                || ("Walter".equalsIgnoreCase(s))
                || ("Heisenberg".equalsIgnoreCase(s))
                || ("Breaking Bad".equalsIgnoreCase(s)))
        {
            return RenderWalterosteus.TEXTURE_WALTUH;
        }
        return RenderWalterosteus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraWalterosteus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraWalterosteus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}