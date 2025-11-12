package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParacoccodus;
import net.lepidodendron.entity.model.entity.ModelParacoccodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParacoccodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraParacoccodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/paracoccodus.png");

    public RenderParacoccodus(RenderManager mgr) {
        super(mgr, new ModelParacoccodus(), 0.0f);
    }

    public static float getScaler() {return 0.20F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParacoccodus entity) {
        return RenderParacoccodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParacoccodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraParacoccodus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





