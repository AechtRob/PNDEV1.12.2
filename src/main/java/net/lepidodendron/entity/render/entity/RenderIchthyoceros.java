package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIchthyoceros;
import net.lepidodendron.entity.model.entity.ModelIchthyoceros;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIchthyoceros extends RenderLivingBaseWithBook<EntityPrehistoricFloraIchthyoceros> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ichthyoceros.png");

    public RenderIchthyoceros(RenderManager mgr) {
        super(mgr, new ModelIchthyoceros(), 0.0f);
    }

    public static float getScaler() {return 0.15F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIchthyoceros entity) {
        return RenderIchthyoceros.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIchthyoceros entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIchthyoceros entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





