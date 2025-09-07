package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAmmonite_Cylolobus;
import net.lepidodendron.entity.model.entity.ModelCyclolobus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAmmonite_Cylolobus extends RenderLivingBaseWithBook<EntityPrehistoricFloraAmmonite_Cylolobus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ammonite_cyclolobus.png");

    public RenderAmmonite_Cylolobus(RenderManager mgr) {
        super(mgr, new ModelCyclolobus(), 0.2f);
    }
    public static float getScaler() {
        return 0.7F * 0.3F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAmmonite_Cylolobus entity) {
        return RenderAmmonite_Cylolobus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAmmonite_Cylolobus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAmmonite_Cylolobus entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}