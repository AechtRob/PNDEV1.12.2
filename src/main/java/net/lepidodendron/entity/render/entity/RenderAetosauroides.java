package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAetosauroides;
import net.lepidodendron.entity.model.entity.ModelAetosauroides;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAetosauroides extends RenderLivingBaseWithBook<EntityPrehistoricFloraAetosauroides> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aetosauroides.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aetosauroides_f.png");

    public static float getScaler() {
        return 0.62f;
    }

    public RenderAetosauroides(RenderManager mgr) {
        super(mgr, new ModelAetosauroides(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAetosauroides entity) {
        if (entity.getPNType() == EntityPrehistoricFloraAetosauroides.Type.FEMALE) {
            return RenderAetosauroides.TEXTURE_F;
        }
        return RenderAetosauroides.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAetosauroides entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAetosauroides entity, float f) {
        float scale = entity.getAgeScale() * getScaler();
        if (entity.getPNType() == EntityPrehistoricFloraAetosauroides.Type.FEMALE) {
            scale = scale * 0.55F;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}