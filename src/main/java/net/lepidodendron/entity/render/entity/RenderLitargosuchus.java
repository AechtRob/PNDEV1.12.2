package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLitargosuchus;
import net.lepidodendron.entity.model.entity.ModelLitargosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLitargosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraLitargosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/litargosuchus.png");

    public static float getScaler() {return 0.28f;}
    public RenderLitargosuchus(RenderManager mgr) {
        super(mgr, new ModelLitargosuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLitargosuchus entity) {
        return RenderLitargosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLitargosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLitargosuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}