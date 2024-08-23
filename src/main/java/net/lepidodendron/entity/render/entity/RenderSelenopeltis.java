package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSchoenesmahl;
import net.lepidodendron.entity.EntityPrehistoricFloraSelenopeltis;
import net.lepidodendron.entity.model.entity.ModelSelenopeltis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSelenopeltis extends RenderLivingBaseWithBook<EntityPrehistoricFloraSelenopeltis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/selenopeltis.png");

    public static float getScaler() {
        return 0.25F;
    }

    public RenderSelenopeltis(RenderManager mgr) {
        super(mgr, new ModelSelenopeltis(), 0.08f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSelenopeltis entity) {
        return RenderSelenopeltis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSelenopeltis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSelenopeltis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}