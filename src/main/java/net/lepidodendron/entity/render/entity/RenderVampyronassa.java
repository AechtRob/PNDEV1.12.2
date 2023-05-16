package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVampyronassa;
import net.lepidodendron.entity.model.entity.ModelVampyronassa;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import java.util.Calendar;

public class RenderVampyronassa extends RenderLiving<EntityPrehistoricFloraVampyronassa> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vampyronassa.png");
    public static final ResourceLocation TEXTURE_HALLOWEEN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vampyronassa_halloween.png");
    public static final ModelBase MODEL_BASE = new ModelVampyronassa();

    public static float getScaler() {
        return 0.7F * 0.4F;
    }
    public RenderVampyronassa(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVampyronassa entity) {
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(2) + 1 == 10 && calendar.get(5) >= 31
            || calendar.get(2) + 1 == 11 && calendar.get(5) <= 1 )
        {
            return RenderVampyronassa.TEXTURE_HALLOWEEN;
        }
        return RenderVampyronassa.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVampyronassa entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraVampyronassa entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}