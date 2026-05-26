package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMurrindalaspis;
import net.lepidodendron.entity.model.entity.ModelMurrindalaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMurrindalaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraMurrindalaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/murrindalaspis.png");

    public static float getScaler() {
        return 0.15F;
    }
    public RenderMurrindalaspis(RenderManager mgr) {
        super(mgr, new ModelMurrindalaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMurrindalaspis entity) {
        return RenderMurrindalaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMurrindalaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMurrindalaspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}