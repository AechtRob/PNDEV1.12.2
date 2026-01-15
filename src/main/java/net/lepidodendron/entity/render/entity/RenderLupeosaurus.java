package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLupeosaurus;
import net.lepidodendron.entity.model.entity.ModelLupeosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLupeosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraLupeosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lupeosaurus.png");

    public static float getScaler() {return 0.716f;}
    public RenderLupeosaurus(RenderManager mgr) {
        super(mgr, new ModelLupeosaurus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLupeosaurus entity) {
        return RenderLupeosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLupeosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLupeosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}