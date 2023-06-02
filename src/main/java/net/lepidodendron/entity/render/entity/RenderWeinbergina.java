package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWeinbergina;
import net.lepidodendron.entity.model.entity.ModelWeinbergina;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWeinbergina extends RenderLiving<EntityPrehistoricFloraWeinbergina> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/weinbergina.png");

    public RenderWeinbergina(RenderManager mgr) {
        super(mgr, new ModelWeinbergina(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWeinbergina entity) {
        return RenderWeinbergina.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraWeinbergina entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraWeinbergina entity, float f) {
        float scale = 0.7F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}