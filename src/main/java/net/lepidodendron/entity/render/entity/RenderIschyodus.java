package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIschyodus;
import net.lepidodendron.entity.model.entity.ModelIschyodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIschyodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraIschyodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ischyodus.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ischyodus_f.png");

    public static float getScaler() {
        return 0.8F * 0.55F;
    }
    public RenderIschyodus(RenderManager mgr) {
        super(mgr, new ModelIschyodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIschyodus entity) {
        if(entity.getPNType() == EntityPrehistoricFloraIschyodus.Type.FEMALE){
            return RenderIschyodus.TEXTURE_F;
        }
        return RenderIschyodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIschyodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIschyodus entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();

        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}