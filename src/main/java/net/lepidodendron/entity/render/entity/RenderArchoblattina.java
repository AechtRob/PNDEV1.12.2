package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArchoblattinaInsect;
import net.lepidodendron.entity.model.entity.ModelArchoblattina;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArchoblattina extends RenderLivingBaseWithBook<EntityPrehistoricFloraArchoblattinaInsect> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archoblattina.png");

    public RenderArchoblattina(RenderManager mgr) {
        super(mgr, new ModelArchoblattina(), 0.0f);
    }
    public static float getScaler() {
        return 1.25F * 0.165f;
    }
    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArchoblattinaInsect entity) {
        return RenderArchoblattina.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArchoblattinaInsect entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraArchoblattinaInsect entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
    }

}