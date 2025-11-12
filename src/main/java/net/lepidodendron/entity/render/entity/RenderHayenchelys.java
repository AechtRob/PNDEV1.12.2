package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHayenchelys;
import net.lepidodendron.entity.model.entity.ModelHayenchelys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHayenchelys extends RenderLivingBaseWithBook<EntityPrehistoricFloraHayenchelys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hayenchelys.png");

    public RenderHayenchelys(RenderManager mgr) {
        super(mgr, new ModelHayenchelys(), 0.0f);
    }

    public static float getScaler() {return 0.15F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHayenchelys entity) {
        return RenderHayenchelys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHayenchelys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHayenchelys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





