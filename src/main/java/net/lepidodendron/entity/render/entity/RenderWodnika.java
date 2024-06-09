package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWodnika;
import net.lepidodendron.entity.model.entity.ModelWodnika;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWodnika extends RenderLivingBaseWithBook<EntityPrehistoricFloraWodnika> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/wodnika.png");

    public RenderWodnika(RenderManager mgr) {
        super(mgr, new ModelWodnika(), RenderDisplays.modelWodnikaBook, 0.5f);
    }
    public static float getScaler() {
        return 0.7F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWodnika entity) {
        return RenderWodnika.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraWodnika entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraWodnika entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}