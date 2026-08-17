package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVelociraptor;
import net.lepidodendron.entity.model.entity.ModelVelociraptor;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class RenderVelociraptor extends RenderLivingBaseWithBook<EntityPrehistoricFloraVelociraptor> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/velociraptor.png");
    public static final ResourceLocation TEXTURE_BLUE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/velociraptor_blue.png");
    public static final ResourceLocation TEXTURE_JP = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/velociraptor_jp.png");
    public static final ResourceLocation TEXTURE_TLW = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/velociraptor_tlw.png");
    public static final ResourceLocation TEXTURE_QUILLIAM = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/velociraptor_quilliam.png");
    public static final ResourceLocation TEXTURE_OMEGA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/velociraptor_omega.png");

    public static float getScaler() {
        return 0.495F;
    }
    public RenderVelociraptor(RenderManager mgr) {
        super(mgr, new ModelVelociraptor(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVelociraptor entity) {
        String s = TextFormatting.getTextWithoutFormattingCodes(entity.getName());
        if (s != null &&
                (s.toLowerCase().contains("blue") || s.toLowerCase().contains("2015"))
        )
        {
            return RenderVelociraptor.TEXTURE_BLUE;
        }
        else if (s != null &&
                (s.toLowerCase().contains("the big one") || s.toLowerCase().contains("1993"))
        )
        {
            return RenderVelociraptor.TEXTURE_JP;
        }
        else if (s != null &&
                (s.toLowerCase().contains("tiger") || s.toLowerCase().contains("1997"))
        )
        {
            return RenderVelociraptor.TEXTURE_TLW;
        }
        else if (s != null &&
                (s.toLowerCase().contains("quilliam") || (s.toLowerCase().contains("2001m") || s.toLowerCase().contains("2001 m"))
        ))
        {
            return RenderVelociraptor.TEXTURE_QUILLIAM;
        }
        else if (s != null &&
                (s.toLowerCase().contains("omega") || (s.toLowerCase().contains("2001f") || s.toLowerCase().contains("2001 f"))
        ))
        {
            return RenderVelociraptor.TEXTURE_OMEGA;
        }
        return RenderVelociraptor.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVelociraptor entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraVelociraptor entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}