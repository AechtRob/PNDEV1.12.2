package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRepenomamus;
import net.lepidodendron.entity.model.entity.ModelRepenomamus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRepenomamus extends RenderLivingBaseWithBook<EntityPrehistoricFloraRepenomamus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/repenomamus.png");

    public static float getScaler() {return 0.45f;}
    public RenderRepenomamus(RenderManager mgr) {
        super(mgr, new ModelRepenomamus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRepenomamus entity) {
        return RenderRepenomamus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRepenomamus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRepenomamus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}