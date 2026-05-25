package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSzelepis;
import net.lepidodendron.entity.model.entity.ModelSzelepis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSzelepis extends RenderLivingBaseWithBook<EntityPrehistoricFloraSzelepis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/szelepis.png");

    public static float getScaler() {
        return 0.2F;
    }
    public RenderSzelepis(RenderManager mgr) {
        super(mgr, new ModelSzelepis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSzelepis entity) {
        return RenderSzelepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSzelepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSzelepis entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}