package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraXilousuchus;
import net.lepidodendron.entity.model.entity.ModelXilousuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderXilousuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraXilousuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/xilousuchus.png");

    public static float getScaler() {return 0.8f;}
    public RenderXilousuchus(RenderManager mgr) {
        super(mgr, new ModelXilousuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraXilousuchus entity) {
        return RenderXilousuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraXilousuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraXilousuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}