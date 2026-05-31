package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAragochersis;
import net.lepidodendron.entity.model.entity.ModelAragochersis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAragochersis extends RenderLivingBaseWithBook<EntityPrehistoricFloraAragochersis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aragochersis.png");

    public RenderAragochersis(RenderManager mgr) {
        super(mgr, new ModelAragochersis(), 0.0f);
    }

    public static float getScaler() {return 0.429f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAragochersis entity) {
        return RenderAragochersis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAragochersis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAragochersis entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}

