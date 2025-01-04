package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLunaspis;
import net.lepidodendron.entity.model.entity.ModelLunaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLunaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraLunaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lunaspis.png");

    public static float getScaler() {
        return 0.3F;
    }
    public RenderLunaspis(RenderManager mgr) {
        super(mgr, new ModelLunaspis(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLunaspis entity) {
        return RenderLunaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLunaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLunaspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3f;
    }

}