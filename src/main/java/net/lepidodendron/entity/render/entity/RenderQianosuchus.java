package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraQianosuchus;
import net.lepidodendron.entity.model.entity.ModelQianosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderQianosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraQianosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/qianosuchus.png");

    public static float getScaler() {return 0.7f;}
    public RenderQianosuchus(RenderManager mgr) {
        super(mgr, new ModelQianosuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraQianosuchus entity) {
        return RenderQianosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraQianosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraQianosuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.5F;
    }

}