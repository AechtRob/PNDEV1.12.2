package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAnthracosaurus;
import net.lepidodendron.entity.model.entity.ModelAnthracosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAnthracosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraAnthracosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anthracosaurus.png");

    public static float getScaler() {return 0.615f;}

    public RenderAnthracosaurus(RenderManager mgr) {
        super(mgr, new ModelAnthracosaurus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAnthracosaurus entity) {
        return RenderAnthracosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAnthracosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAnthracosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.4F;
    }

}