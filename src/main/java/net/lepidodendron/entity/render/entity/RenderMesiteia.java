package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMesiteia;
import net.lepidodendron.entity.model.entity.ModelMesiteia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMesiteia extends RenderLivingBaseWithBook<EntityPrehistoricFloraMesiteia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mesiteia.png");

    public RenderMesiteia(RenderManager mgr) {
        super(mgr, new ModelMesiteia(), 0.0f);
    }

    public static float getScaler() {return 0.31F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMesiteia entity) {
        return RenderMesiteia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMesiteia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMesiteia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





