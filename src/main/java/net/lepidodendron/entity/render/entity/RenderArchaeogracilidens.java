package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeogracilidens;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeogracilidens;
import net.lepidodendron.entity.model.entity.ModelArchaeogracilidens;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArchaeogracilidens extends RenderLivingBaseWithBook<EntityPrehistoricFloraArchaeogracilidens> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archaeogracilidens.png");

    public RenderArchaeogracilidens(RenderManager mgr) {
        super(mgr, new ModelArchaeogracilidens(), 0.5f);
    }
    public static float getScaler() {return 0.75f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArchaeogracilidens entity) {
        float scale = entity.getAgeScale();
        return RenderArchaeogracilidens.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArchaeogracilidens entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraArchaeogracilidens entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.30F;
    }

}