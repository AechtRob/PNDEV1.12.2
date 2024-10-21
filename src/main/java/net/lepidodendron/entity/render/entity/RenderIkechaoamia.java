package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIkechaoamia;
import net.lepidodendron.entity.model.entity.ModelIkechaoamia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIkechaoamia extends RenderLivingBaseWithBook<EntityPrehistoricFloraIkechaoamia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ikechaoamia.png");

    public RenderIkechaoamia(RenderManager mgr) {
        super(mgr, new ModelIkechaoamia(), 0.0f);
    }

    public static float getScaler() {return 0.27F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIkechaoamia entity) {
        return RenderIkechaoamia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIkechaoamia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraIkechaoamia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}