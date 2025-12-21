package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHanduichthys;
import net.lepidodendron.entity.model.entity.ModelHanduichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHanduichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraHanduichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/handuichthys.png");

    public RenderHanduichthys(RenderManager mgr) {
        super(mgr, new ModelHanduichthys(), 0.0f);
    }

    public static float getScaler() {return 0.25F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHanduichthys entity) {
        return RenderHanduichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHanduichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHanduichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





