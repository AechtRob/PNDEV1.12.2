package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHensodon;
import net.lepidodendron.entity.model.entity.ModelHensodon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHensodon extends RenderLivingBaseWithBook<EntityPrehistoricFloraHensodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hensodon_male.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hensodon_female.png");

    public RenderHensodon(RenderManager mgr) {
        super(mgr, new ModelHensodon(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHensodon entity) {
        if (entity.getPNType() == EntityPrehistoricFloraHensodon.Type.FEMALE) {
            return RenderHensodon.TEXTURE_F;
        }
        return RenderHensodon.TEXTURE;
    }

    public static float getScaler() {
        return 0.22F;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHensodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraHensodon entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (entity.getPNType() == EntityPrehistoricFloraHensodon.Type.FEMALE) {
            scale = scale * 0.9F;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.00F;
    }

}