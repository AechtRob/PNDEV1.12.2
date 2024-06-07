package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProthysanostoma;
import net.lepidodendron.entity.model.entity.ModelProthysanostoma;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProthysanostoma extends RenderLiving<EntityPrehistoricFloraProthysanostoma> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/prothysanostoma.png");

    public static float getScaler() {return 0.3F;}

    public RenderProthysanostoma(RenderManager mgr) {
        super(mgr, new ModelProthysanostoma(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProthysanostoma entity) {
        return RenderProthysanostoma.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProthysanostoma entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraProthysanostoma entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}