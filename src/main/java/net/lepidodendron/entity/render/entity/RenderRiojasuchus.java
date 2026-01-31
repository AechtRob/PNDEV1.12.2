package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRiojasuchus;
import net.lepidodendron.entity.model.entity.ModelRiojasuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRiojasuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraRiojasuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/riojasuchus.png");

    public static float getScaler() {return 0.82f;}
    public RenderRiojasuchus(RenderManager mgr) {
        super(mgr, new ModelRiojasuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRiojasuchus entity) {
        return RenderRiojasuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRiojasuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRiojasuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}