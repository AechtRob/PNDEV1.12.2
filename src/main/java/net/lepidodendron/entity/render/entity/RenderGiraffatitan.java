package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGiraffatitan;
import net.lepidodendron.entity.model.entity.ModelGiraffatitan;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGiraffatitan extends RenderLivingBaseWithBook<EntityPrehistoricFloraGiraffatitan> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/giraffatitan.png");

    public RenderGiraffatitan(RenderManager mgr) {
        super(mgr, new ModelGiraffatitan(), 0.3f);
    }

    public static float getScaler() {
        return 1F;
    }
    
    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGiraffatitan entity) {
        return RenderGiraffatitan.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGiraffatitan entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGiraffatitan entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.80F;
    }

}