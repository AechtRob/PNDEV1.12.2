package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHeteropetalus;
import net.lepidodendron.entity.model.entity.ModelHeteropetalus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHeteropetalus extends RenderLivingBaseWithBook<EntityPrehistoricFloraHeteropetalus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/heteropetalus.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/heteropetalus_f.png");

    public RenderHeteropetalus(RenderManager mgr) {
        super(mgr, new ModelHeteropetalus(), RenderDisplays.modelHeteropetalusBook, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHeteropetalus entity) {
        if (entity.getPNType() == EntityPrehistoricFloraHeteropetalus.Type.FEMALE) {
            return RenderHeteropetalus.TEXTURE_F;
        }
        return RenderHeteropetalus.TEXTURE;
    }

    public static float getScaler() {
        return 0.28F;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHeteropetalus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraHeteropetalus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (entity.getPNType() == EntityPrehistoricFloraHeteropetalus.Type.FEMALE) {
            scale = scale * 0.8F;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.00F;
    }

}