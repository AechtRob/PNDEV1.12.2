package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAmmonite_Coroniceras;
import net.lepidodendron.entity.model.entity.ModelCoroniceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAmmonite_Coroniceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraAmmonite_Coroniceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ammonite_coroniceras.png");

    public RenderAmmonite_Coroniceras(RenderManager mgr) {
        super(mgr, new ModelCoroniceras(), 0.2f);
    }
    public static float getScaler() {
        return 0.7F * 0.3F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAmmonite_Coroniceras entity) {
        return RenderAmmonite_Coroniceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAmmonite_Coroniceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAmmonite_Coroniceras entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}