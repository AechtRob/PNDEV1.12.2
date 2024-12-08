package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAlbalophosaurus;
import net.lepidodendron.entity.model.entity.ModelAlbalophosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAlbalophosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraAlbalophosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/albalophosaurus.png");

    public RenderAlbalophosaurus(RenderManager mgr) {
        super(mgr, new ModelAlbalophosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.35F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAlbalophosaurus entity) {
        return RenderAlbalophosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAlbalophosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAlbalophosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}