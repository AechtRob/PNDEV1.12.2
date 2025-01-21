package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKarakhtia;
import net.lepidodendron.entity.EntityPrehistoricFloraKimberella;
import net.lepidodendron.entity.model.entity.ModelKimberella;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKimberella extends RenderLivingBaseWithBook<EntityPrehistoricFloraKimberella> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/Kimberella.png");

    public static float getScaler() {
        return 0.31F;
    }

    public RenderKimberella(RenderManager mgr) {
        super(mgr, new ModelKimberella(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKimberella entity) {
        return RenderKimberella.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKimberella entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraKimberella entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}