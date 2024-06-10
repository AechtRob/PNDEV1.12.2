package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNesonektris;
import net.lepidodendron.entity.model.entity.ModelNesonektris;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNesonektris extends RenderLivingBaseWithBook<EntityPrehistoricFloraNesonektris> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nesonektris.png");

    public RenderNesonektris(RenderManager mgr) {
        super(mgr, new ModelNesonektris(), RenderDisplays.modelNesonektrisBook, 0.0f);
    }

    public static float getScaler() {return 0.4F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNesonektris entity) {
        return RenderNesonektris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNesonektris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNesonektris entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}