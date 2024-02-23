package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDicranurus;
import net.lepidodendron.entity.EntityPrehistoricFloraHeliopeltis;
import net.lepidodendron.entity.model.entity.ModelHeliopeltis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHeliopeltis extends RenderLiving<EntityPrehistoricFloraHeliopeltis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/heliopeltis.png");
    public static float getScaler() {
        return 0.13F;
    }

    public RenderHeliopeltis(RenderManager mgr) {
        super(mgr, new ModelHeliopeltis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHeliopeltis entity) {
        return RenderHeliopeltis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHeliopeltis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHeliopeltis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}
