package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMoradisaurus;
import net.lepidodendron.entity.model.entity.ModelMoradisaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMoradisaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraMoradisaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/moradisaurus.png");

    public RenderMoradisaurus(RenderManager mgr) {
        super(mgr, new ModelMoradisaurus(), 0.0f);
    }

    public static float getScaler() {return 0.8F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMoradisaurus entity) {
        return RenderMoradisaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMoradisaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraMoradisaurus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}