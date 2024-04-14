package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHydropessum;
import net.lepidodendron.entity.model.entity.ModelHydropessum;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHydropessum extends RenderLiving<EntityPrehistoricFloraHydropessum> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hydropessum.png");

    public RenderHydropessum(RenderManager mgr) {
        super(mgr, new ModelHydropessum(), 0.0f);
    }

    public static float getScaler() {return 0.2F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHydropessum entity) {
        return RenderHydropessum.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHydropessum entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHydropessum entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}