package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJoinvillichthys;
import net.lepidodendron.entity.model.entity.ModelJoinvillichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderJoinvillichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraJoinvillichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/joinvillichthys.png");

    public RenderJoinvillichthys(RenderManager mgr) {
        super(mgr, new ModelJoinvillichthys(), 0.0f);
    }

    public static float getScaler() {return 0.20F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJoinvillichthys entity) {
        return RenderJoinvillichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJoinvillichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraJoinvillichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





