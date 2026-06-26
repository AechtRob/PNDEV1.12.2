package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraErfoudichthys;
import net.lepidodendron.entity.model.entity.ModelErfoudichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderErfoudichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraErfoudichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/erfoudichthys.png");

    public RenderErfoudichthys(RenderManager mgr) {
        super(mgr, new ModelErfoudichthys(), 0.0f);
    }

    public static float getScaler() {return 0.23F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraErfoudichthys entity) {
        return RenderErfoudichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraErfoudichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraErfoudichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}