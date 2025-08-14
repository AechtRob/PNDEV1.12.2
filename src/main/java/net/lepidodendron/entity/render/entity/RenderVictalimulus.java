package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVictalimulus;
import net.lepidodendron.entity.model.entity.ModelVictalimulus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVictalimulus extends RenderLivingBaseWithBook<EntityPrehistoricFloraVictalimulus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/victalimulus.png");

    public static float getScaler() {
        return 0.25F;
    }

    public RenderVictalimulus(RenderManager mgr) {
        super(mgr, new ModelVictalimulus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVictalimulus entity) {
        return RenderVictalimulus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVictalimulus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraVictalimulus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0F;
    }

}
