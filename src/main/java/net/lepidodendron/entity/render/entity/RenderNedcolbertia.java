package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNedcolbertia;
import net.lepidodendron.entity.model.entity.ModelNedcolbertia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNedcolbertia extends RenderLivingBaseWithBook<EntityPrehistoricFloraNedcolbertia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nedcolbertia.png");

    public static float getScaler() {return 0.5169F;}

    public RenderNedcolbertia(RenderManager mgr) {
        super(mgr, new ModelNedcolbertia(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNedcolbertia entity) {
        return RenderNedcolbertia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNedcolbertia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNedcolbertia entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}