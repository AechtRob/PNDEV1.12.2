package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSanctacaris;
import net.lepidodendron.entity.model.entity.ModelSanctacaris;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import java.util.Calendar;

public class RenderSanctacaris extends RenderLiving<EntityPrehistoricFloraSanctacaris> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sanctacaris.png");
    public static final ResourceLocation TEXTURE_XMAS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sanctacaris_xmas.png");

    public static float getScaler() {
        return 0.13F;
    }

    public RenderSanctacaris(RenderManager mgr) {
        super(mgr, new ModelSanctacaris(), 0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSanctacaris entity) {
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24
                || calendar.get(2) + 1 == 12 && calendar.get(5) <= 26 )
        {
            return RenderSanctacaris.TEXTURE_XMAS;
        }
        return RenderSanctacaris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSanctacaris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSanctacaris entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.38F;
    }

}