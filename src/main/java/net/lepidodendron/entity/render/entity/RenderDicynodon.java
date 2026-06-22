package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDicynodon;
import net.lepidodendron.entity.model.entity.ModelDicynodon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDicynodon extends RenderLivingBaseWithBook<EntityPrehistoricFloraDicynodon> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dicynodon.png");

    public RenderDicynodon(RenderManager mgr) {
        super(mgr, new ModelDicynodon(), 0.5f);
    }
    public static float getScaler() {
        return 0.42F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDicynodon entity) {
        return RenderDicynodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDicynodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDicynodon entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.42F;
    }

}