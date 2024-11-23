package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCoeruleodraco;
import net.lepidodendron.entity.model.entity.ModelCoeruleodraco;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCoeruleodraco extends RenderLivingBaseWithBook<EntityPrehistoricFloraCoeruleodraco> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/coeruleodraco.png");

    public static float getScaler() {return 0.19f;}

    public RenderCoeruleodraco(RenderManager mgr) {
        super(mgr, new ModelCoeruleodraco(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCoeruleodraco entity) {
        return RenderCoeruleodraco.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCoeruleodraco entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCoeruleodraco entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}