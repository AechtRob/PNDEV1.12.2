package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPsilichthys;
import net.lepidodendron.entity.model.entity.ModelPsilichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPsilichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraPsilichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/psilichthys.png");

    public RenderPsilichthys(RenderManager mgr) {
        super(mgr, new ModelPsilichthys(), 0.0f);
    }

    public static float getScaler() {return 0.2F;}

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPsilichthys entity) {
        return RenderPsilichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPsilichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPsilichthys entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}