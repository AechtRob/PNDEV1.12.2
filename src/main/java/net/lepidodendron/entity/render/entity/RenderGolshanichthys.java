package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGolshanichthys;
import net.lepidodendron.entity.model.entity.ModelGolshanichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGolshanichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraGolshanichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/golshanichthys.png");

    public static float getScaler() {
        return 0.86F;
    }
    public RenderGolshanichthys(RenderManager mgr) {
        super(mgr, new ModelGolshanichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGolshanichthys entity) {
        return RenderGolshanichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGolshanichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGolshanichthys entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}