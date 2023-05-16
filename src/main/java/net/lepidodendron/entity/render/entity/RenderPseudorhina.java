package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPseudorhina;
import net.lepidodendron.entity.model.entity.ModelPseudorhina;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPseudorhina extends RenderLiving<EntityPrehistoricFloraPseudorhina> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pseudorhina.png");
    public static final ModelBase MODEL_BASE = new ModelPseudorhina();

    public static float getScaler() {
        return 0.45F;
    }
    public RenderPseudorhina(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPseudorhina entity) {
        return RenderPseudorhina.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPseudorhina entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPseudorhina entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (entity.getIsFemale()) {
            scale = this.getScaler() *0.95F;
        }
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}