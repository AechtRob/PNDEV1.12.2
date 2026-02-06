package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraYonghesuchus;
import net.lepidodendron.entity.model.entity.ModelYonghesuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderYonghesuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraYonghesuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yonghesuchus.png");

    public static float getScaler() {return 0.365f;}
    public RenderYonghesuchus(RenderManager mgr) {
        super(mgr, new ModelYonghesuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraYonghesuchus entity) {
        return RenderYonghesuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraYonghesuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraYonghesuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}