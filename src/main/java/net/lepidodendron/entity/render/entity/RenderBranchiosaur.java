package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBrachiosaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraBranchiosaur;
import net.lepidodendron.entity.model.entity.ModelBranchiosaur;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBranchiosaur extends RenderLivingBaseWithBook<EntityPrehistoricFloraBranchiosaur> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/branchiosaur.png");

    public RenderBranchiosaur(RenderManager mgr) {
        super(mgr, new ModelBranchiosaur(), 0F);
    }

    public static float getScaler() {
        return 0.2F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBranchiosaur entity) {
        return RenderBranchiosaur.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBranchiosaur entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBranchiosaur entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.80F;
    }

}