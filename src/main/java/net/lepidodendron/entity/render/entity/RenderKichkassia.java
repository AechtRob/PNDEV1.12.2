package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKichkassia;
import net.lepidodendron.entity.model.entity.ModelKichkassia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKichkassia extends RenderLivingBaseWithBook<EntityPrehistoricFloraKichkassia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kichkassia.png");

    public RenderKichkassia(RenderManager mgr) {
        super(mgr, new ModelKichkassia(), RenderDisplays.modelKichkassiaBook, 0.0f);
    }

    public static float getScaler() {return 0.3F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKichkassia entity) {
        return RenderKichkassia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKichkassia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKichkassia entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}