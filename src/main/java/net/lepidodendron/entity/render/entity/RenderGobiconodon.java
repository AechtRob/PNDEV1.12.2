package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGobiconodon;
import net.lepidodendron.entity.model.entity.ModelGobiconodon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGobiconodon extends RenderLivingBaseWithBook<EntityPrehistoricFloraGobiconodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gobiconodon.png");

    public static float getScaler() {return 0.16f;}
    public RenderGobiconodon(RenderManager mgr) {
        super(mgr, new ModelGobiconodon(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGobiconodon entity) {
        return RenderGobiconodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGobiconodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGobiconodon entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}