package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIllinichthys;
import net.lepidodendron.entity.model.entity.ModelIllinichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIllinichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraIllinichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/illinichthys.png");

    public static float getScaler() {
        return 0.7F * 0.15F;
    }
    public RenderIllinichthys(RenderManager mgr) {
        super(mgr, new ModelIllinichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIllinichthys entity) {
        return RenderIllinichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIllinichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIllinichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}