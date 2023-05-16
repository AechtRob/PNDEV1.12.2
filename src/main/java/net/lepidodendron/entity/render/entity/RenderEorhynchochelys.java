package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEorhynchochelys;
import net.lepidodendron.entity.model.entity.ModelEorhynchochelys;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEorhynchochelys extends RenderLiving<EntityPrehistoricFloraEorhynchochelys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eorhynchochelys.png");
    public static final ModelBase MODEL_BASE = new ModelEorhynchochelys();

    public RenderEorhynchochelys(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }
    public static float getScaler() {
        return 0.42f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEorhynchochelys entity) {
        return RenderEorhynchochelys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEorhynchochelys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEorhynchochelys entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}



