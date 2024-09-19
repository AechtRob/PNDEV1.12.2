package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTanaocrossus;
import net.lepidodendron.entity.model.entity.ModelTanaocrossus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTanaocrossus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTanaocrossus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tanaocrossus.png");

    public RenderTanaocrossus(RenderManager mgr) {
        super(mgr, new ModelTanaocrossus(), 0.0f);
    }

    public static float getScaler() {return 0.2F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTanaocrossus entity) {
        return RenderTanaocrossus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTanaocrossus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTanaocrossus entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}