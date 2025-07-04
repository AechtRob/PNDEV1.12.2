package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArmigatus;
import net.lepidodendron.entity.model.entity.ModelArmigatus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArmigatus extends RenderLivingBaseWithBook<EntityPrehistoricFloraArmigatus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/armigatus.png");

    public RenderArmigatus(RenderManager mgr) {
        super(mgr, new ModelArmigatus(), 0.0f);
    }

    public static float getScaler() {return 0.29F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArmigatus entity) {
        return RenderArmigatus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArmigatus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraArmigatus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





