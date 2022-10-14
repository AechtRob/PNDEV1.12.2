package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPederpes;
import net.lepidodendron.entity.EntityPrehistoricFloraWhatcheeria;
import net.lepidodendron.entity.model.entity.ModelWhatcheeria;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWhatcheeria extends RenderLiving<EntityPrehistoricFloraWhatcheeria> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/whatcheeria.png");

    public RenderWhatcheeria(RenderManager mgr) {
        super(mgr, new ModelWhatcheeria(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWhatcheeria entity) {
        return RenderWhatcheeria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraWhatcheeria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraWhatcheeria entity, float f) {
        float scale = entity.getAgeScale()*2.1F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}