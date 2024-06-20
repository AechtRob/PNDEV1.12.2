package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHarpagofututor;
import net.lepidodendron.entity.model.entity.ModelHarpagofututor;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHarpagofututor extends RenderLivingBaseWithBook<EntityPrehistoricFloraHarpagofututor> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/harpagofututor_male.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/harpagofututor_female.png");

    public RenderHarpagofututor(RenderManager mgr) {
        super(mgr, new ModelHarpagofututor(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHarpagofututor entity) {
        if (entity.getPNType() == EntityPrehistoricFloraHarpagofututor.Type.FEMALE) {
            return RenderHarpagofututor.TEXTURE_F;
        }
        return RenderHarpagofututor.TEXTURE;
    }

    public static float getScaler() {
        return 0.2F;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHarpagofututor entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraHarpagofututor entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (entity.getPNType() == EntityPrehistoricFloraHarpagofututor.Type.FEMALE) {
            scale = scale * 0.8F;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.00F;
    }

}