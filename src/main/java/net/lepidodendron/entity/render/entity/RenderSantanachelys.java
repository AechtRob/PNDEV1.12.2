package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSantanachelys;
import net.lepidodendron.entity.model.entity.ModelSantanachelys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSantanachelys extends RenderLivingBaseWithBook<EntityPrehistoricFloraSantanachelys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/santanachelys.png");

    public RenderSantanachelys(RenderManager mgr) {
        super(mgr, new ModelSantanachelys(), 0.0f);
    }

    public static float getScaler() {return 0.2f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSantanachelys entity) {
        return RenderSantanachelys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSantanachelys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSantanachelys entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}

