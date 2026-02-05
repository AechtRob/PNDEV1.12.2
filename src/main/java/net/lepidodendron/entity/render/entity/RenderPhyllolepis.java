package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPhyllolepis;
import net.lepidodendron.entity.model.entity.ModelPhyllolepis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPhyllolepis extends RenderLivingBaseWithBook<EntityPrehistoricFloraPhyllolepis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phyllolepis.png");

    public static float getScaler() {
        return 0.47F;
    }
    public RenderPhyllolepis(RenderManager mgr) {
        super(mgr, new ModelPhyllolepis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPhyllolepis entity) {
        return RenderPhyllolepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPhyllolepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPhyllolepis entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}