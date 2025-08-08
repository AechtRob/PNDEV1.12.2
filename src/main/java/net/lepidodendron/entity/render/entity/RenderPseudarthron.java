package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPseudarthron;
import net.lepidodendron.entity.model.entity.ModelPseudarthron;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPseudarthron extends RenderLivingBaseWithBook<EntityPrehistoricFloraPseudarthron> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pseudarthron.png");

    public static float getScaler() {return 0.22F;}

    public RenderPseudarthron(RenderManager mgr) { super(mgr, new ModelPseudarthron(), 0.1f); }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPseudarthron entity) {
        return RenderPseudarthron.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPseudarthron entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPseudarthron entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.00F;
    }


}