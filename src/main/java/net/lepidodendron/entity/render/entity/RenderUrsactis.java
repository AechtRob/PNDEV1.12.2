package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraUrsactis;
import net.lepidodendron.entity.model.entity.ModelUrsactis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUrsactis extends RenderLiving<EntityPrehistoricFloraUrsactis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ursactis.png");

    public static float getScaler() {
        return 0.45F*0.5f;
    }

    public RenderUrsactis(RenderManager mgr) {
        super(mgr, new ModelUrsactis(), 0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraUrsactis entity) {
        return RenderUrsactis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraUrsactis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraUrsactis entity, float f) {
        float scale = this.getScaler()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.38F;
    }

}