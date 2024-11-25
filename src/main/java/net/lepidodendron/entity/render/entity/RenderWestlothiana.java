package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWestlothiana;
import net.lepidodendron.entity.model.entity.ModelWestlothiana;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWestlothiana extends RenderLivingBaseWithBook<EntityPrehistoricFloraWestlothiana> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/westlothiana.png");

    public static float getScaler() {return 0.2f;}

    public RenderWestlothiana(RenderManager mgr) {
        super(mgr, new ModelWestlothiana(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWestlothiana entity) {
        return RenderWestlothiana.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraWestlothiana entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraWestlothiana entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}