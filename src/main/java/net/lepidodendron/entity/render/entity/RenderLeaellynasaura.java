package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLeaellynasaura;
import net.lepidodendron.entity.model.entity.ModelLeaellynasaura;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLeaellynasaura extends RenderLivingBaseWithBook<EntityPrehistoricFloraLeaellynasaura> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/leaellynasaura.png");

    public static float getScaler() {return 0.43f;}
    public RenderLeaellynasaura(RenderManager mgr) {
        super(mgr, new ModelLeaellynasaura(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLeaellynasaura entity) {
        return RenderLeaellynasaura.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLeaellynasaura entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLeaellynasaura entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}