package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBoreopricea;
import net.lepidodendron.entity.model.entity.ModelBoreopricea;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBoreopricea extends RenderLivingBaseWithBook<EntityPrehistoricFloraBoreopricea> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/boreopricea.png");

    public static float getScaler() {return 0.18f;}
    public RenderBoreopricea(RenderManager mgr) {
        super(mgr, new ModelBoreopricea(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBoreopricea entity) {
        return RenderBoreopricea.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBoreopricea entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBoreopricea entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}