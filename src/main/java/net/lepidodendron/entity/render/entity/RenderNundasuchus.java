package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNundasuchus;
import net.lepidodendron.entity.model.entity.ModelNundasuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNundasuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraNundasuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nundasuchus.png");

    public static float getScaler() {return 0.54f;}
    public RenderNundasuchus(RenderManager mgr) {
        super(mgr, new ModelNundasuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNundasuchus entity) {
        return RenderNundasuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNundasuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNundasuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}