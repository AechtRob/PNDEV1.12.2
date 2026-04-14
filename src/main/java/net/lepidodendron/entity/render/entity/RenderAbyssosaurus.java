package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAbyssosaurus;
import net.lepidodendron.entity.model.entity.ModelAbyssosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAbyssosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraAbyssosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/abyssosaurus.png");

    public RenderAbyssosaurus(RenderManager mgr) {
        super(mgr, new ModelAbyssosaurus(), 0.0f);
    }

    public static float getScaler() {return 1F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAbyssosaurus entity) {
        return RenderAbyssosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAbyssosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAbyssosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}