package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMesodermochelys;
import net.lepidodendron.entity.model.entity.ModelMesodermochelys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMesodermochelys extends RenderLivingBaseWithBook<EntityPrehistoricFloraMesodermochelys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mesodermochelys.png");

    public RenderMesodermochelys(RenderManager mgr) {
        super(mgr, new ModelMesodermochelys(), 0.0f);
    }

    public static float getScaler() {return 0.25f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMesodermochelys entity) {
        return RenderMesodermochelys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMesodermochelys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMesodermochelys entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}

