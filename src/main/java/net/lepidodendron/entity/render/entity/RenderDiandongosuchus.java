package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDiandongosuchus;
import net.lepidodendron.entity.model.entity.ModelDiandongosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDiandongosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraDiandongosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diandongosuchus.png");

    public static float getScaler() {return 0.82f;}
    public RenderDiandongosuchus(RenderManager mgr) {
        super(mgr, new ModelDiandongosuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDiandongosuchus entity) {
        return RenderDiandongosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDiandongosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDiandongosuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}