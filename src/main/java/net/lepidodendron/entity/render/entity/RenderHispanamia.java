package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHispanamia;
import net.lepidodendron.entity.model.entity.ModelHispanamia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHispanamia extends RenderLivingBaseWithBook<EntityPrehistoricFloraHispanamia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hispanamia.png");

    public RenderHispanamia(RenderManager mgr) {
        super(mgr, new ModelHispanamia(), 0.0f);
    }

    public static float getScaler() {return 0.35F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHispanamia entity) {
        return RenderHispanamia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHispanamia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraHispanamia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}