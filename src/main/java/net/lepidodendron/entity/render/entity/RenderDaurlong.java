package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDaurlong;
import net.lepidodendron.entity.model.entity.ModelDaurlong;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDaurlong extends RenderLivingBaseWithBook<EntityPrehistoricFloraDaurlong> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/daurlong.png");

    public RenderDaurlong(RenderManager mgr) {
        super(mgr, new ModelDaurlong(), 0.0f);
    }

    public static float getScaler() {return 0.58F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDaurlong entity) {
        return RenderDaurlong.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDaurlong entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDaurlong entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}