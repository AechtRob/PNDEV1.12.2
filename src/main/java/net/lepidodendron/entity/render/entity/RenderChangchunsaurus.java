package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraChangchunsaurus;
import net.lepidodendron.entity.model.entity.ModelChangchunsaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChangchunsaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraChangchunsaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/changchunsaurus.png");

    public static float getScaler() {return 0.43f * 0.7f;}
    public RenderChangchunsaurus(RenderManager mgr) {
        super(mgr, new ModelChangchunsaurus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraChangchunsaurus entity) {
        return RenderChangchunsaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraChangchunsaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraChangchunsaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}