package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFukuipteryx;
import net.lepidodendron.entity.model.entity.ModelFukuipteryx;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFukuipteryx extends RenderLivingBaseWithBook<EntityPrehistoricFloraFukuipteryx> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/fukuipteryx.png");

    public static float getScaler() {
        return 0.15F;
    }

    public RenderFukuipteryx(RenderManager mgr) {
        super(mgr, new ModelFukuipteryx(), 0.15f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFukuipteryx entity) {
        return RenderFukuipteryx.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraFukuipteryx entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        float getOffset = 0.0F;
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraFukuipteryx entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}





