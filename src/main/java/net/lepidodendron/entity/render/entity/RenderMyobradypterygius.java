package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMyobradypterygius;
import net.lepidodendron.entity.model.entity.ModelMyobradypterygius;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMyobradypterygius extends RenderLivingBaseWithBook<EntityPrehistoricFloraMyobradypterygius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/myobradypterygius.png");

    public static float getScaler() {
        return 1F;
    }

    public RenderMyobradypterygius(RenderManager mgr) {
        super(mgr, new ModelMyobradypterygius(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMyobradypterygius entity) {
        return RenderMyobradypterygius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMyobradypterygius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMyobradypterygius entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}




