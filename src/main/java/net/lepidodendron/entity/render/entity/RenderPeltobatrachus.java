package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPeltobatrachus;
import net.lepidodendron.entity.model.entity.ModelPeltobatrachus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPeltobatrachus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPeltobatrachus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/peltobatrachus.png");

    public static float getScaler() {return 0.4f;}
    public RenderPeltobatrachus(RenderManager mgr) {
        super(mgr, new ModelPeltobatrachus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPeltobatrachus entity) {
        return RenderPeltobatrachus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPeltobatrachus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPeltobatrachus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}