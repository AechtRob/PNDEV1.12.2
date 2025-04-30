package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAraripelepidotes;
import net.lepidodendron.entity.model.entity.ModelAraripelepidotes;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAraripelepidotes extends RenderLivingBaseWithBook<EntityPrehistoricFloraAraripelepidotes> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/araripelepidotes.png");

    public RenderAraripelepidotes(RenderManager mgr) {
        super(mgr, new ModelAraripelepidotes(), 0.0f);
    }

    public static float getScaler() {return 0.33F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAraripelepidotes entity) {
        return RenderAraripelepidotes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAraripelepidotes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAraripelepidotes entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}