package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraQuaestio;
import net.lepidodendron.entity.model.entity.ModelQuaestio;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class RenderQuaestio extends RenderLivingBaseWithBook<EntityPrehistoricFloraQuaestio> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/quaestio.png");
    public static final ResourceLocation TEXTURE_WHO = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/quaestio_doctor.png");
    public static final ResourceLocation TEXTURE_LUCKY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/quaestio_lucky.png");

    public RenderQuaestio(RenderManager mgr) {
        super(mgr, new ModelQuaestio(), 0.0f);
    }

    public static float getScaler() {
        return 0.22F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraQuaestio entity) {
        String s = TextFormatting.getTextWithoutFormattingCodes(entity.getName());
        if (s != null &&
            (s.toLowerCase().contains("who")
            || s.toLowerCase().contains("doctor")
            || s.toLowerCase().contains("time-lord")
            || s.toLowerCase().contains("time lord")
            || s.toLowerCase().contains("timelord"))
        )
        {
            return RenderQuaestio.TEXTURE_WHO;
        }
        else if (s != null &&
                (s.toLowerCase().contains("lucky"))
        )
        {
            return RenderQuaestio.TEXTURE_LUCKY;
        }
        return RenderQuaestio.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraQuaestio entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraQuaestio entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}