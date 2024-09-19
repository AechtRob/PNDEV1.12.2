package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEochondrosteus;
import net.lepidodendron.entity.model.entity.ModelEochondrosteus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEochondrosteus extends RenderLivingBaseWithBook<EntityPrehistoricFloraEochondrosteus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eochondrosteus.png");

    public RenderEochondrosteus(RenderManager mgr) {
        super(mgr, new ModelEochondrosteus(), 0.0f);
    }

    public static float getScaler() {return 0.18F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEochondrosteus entity) {
        return RenderEochondrosteus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEochondrosteus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEochondrosteus entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}