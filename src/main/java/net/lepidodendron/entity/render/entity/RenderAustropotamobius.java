package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAustropotamobius;
import net.lepidodendron.entity.model.entity.ModelAustropotamobius;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAustropotamobius extends RenderLivingBaseWithBook<EntityPrehistoricFloraAustropotamobius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/austropotamobius.png");

    public RenderAustropotamobius(RenderManager mgr) {
        super(mgr, new ModelAustropotamobius(), 0.0f);
    }

    public static float getScaler() {return 0.25F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAustropotamobius entity) {
        return RenderAustropotamobius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAustropotamobius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAustropotamobius entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}