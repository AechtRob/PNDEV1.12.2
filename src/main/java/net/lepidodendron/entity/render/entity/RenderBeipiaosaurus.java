package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBeipiaosaurus;
import net.lepidodendron.entity.model.entity.ModelBeipiaosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBeipiaosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraBeipiaosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/beipiaosaurus.png");

    public RenderBeipiaosaurus(RenderManager mgr) {
        super(mgr, new ModelBeipiaosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.53F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBeipiaosaurus entity) {
        return RenderBeipiaosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBeipiaosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBeipiaosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}