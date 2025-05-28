package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPrenocephale;
import net.lepidodendron.entity.model.entity.ModelPrenocephale;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPrenocephale extends RenderLivingBaseWithBook<EntityPrehistoricFloraPrenocephale> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/prenocephale.png");

    public static float getScaler() {return 0.76f;}
    public RenderPrenocephale(RenderManager mgr) {
        super(mgr, new ModelPrenocephale(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPrenocephale entity) {
        return RenderPrenocephale.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPrenocephale entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPrenocephale entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}