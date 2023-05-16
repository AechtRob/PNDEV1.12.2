package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSqualoraja;
import net.lepidodendron.entity.model.entity.ModelSqualoraja;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSqualoraja extends RenderLiving<EntityPrehistoricFloraSqualoraja> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/squaloraja.png");
    private static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/squaloraja_f.png");
    public static final ModelBase MODEL_BASE = new ModelSqualoraja();

    public static float getScaler() {
        return 0.7F * 0.38F;
    }
    public RenderSqualoraja(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSqualoraja entity) {
        if (entity.getIsFemale()) {
            return RenderSqualoraja.TEXTURE_F;
        }
        return RenderSqualoraja.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSqualoraja entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSqualoraja entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (entity.getIsFemale()) {
            scale = this.getScaler() *0.75F;
        }
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}