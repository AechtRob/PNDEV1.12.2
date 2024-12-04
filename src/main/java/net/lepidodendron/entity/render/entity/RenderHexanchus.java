package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHexanchus;
import net.lepidodendron.entity.model.entity.ModelHexanchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHexanchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraHexanchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hexanchus.png");

    public RenderHexanchus(RenderManager mgr) {
        super(mgr, new ModelHexanchus(), 0.5f);
    }
    public static float getScaler() {return 1f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHexanchus entity) {
        float scale = entity.getAgeScale();
        return RenderHexanchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHexanchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHexanchus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}