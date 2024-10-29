package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTropidosuchus;
import net.lepidodendron.entity.model.entity.ModelTropidosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTropidosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTropidosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tropidosuchus.png");

    public static float getScaler() {return 0.3244f;}
    public RenderTropidosuchus(RenderManager mgr) {
        super(mgr, new ModelTropidosuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTropidosuchus entity) {
        return RenderTropidosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTropidosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTropidosuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}