package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMalawisuchus;
import net.lepidodendron.entity.model.entity.ModelMalawisuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMalawisuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraMalawisuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/malawisuchus.png");

    public static float getScaler() {return 0.78f*0.43f;}
    public RenderMalawisuchus(RenderManager mgr) {
        super(mgr, new ModelMalawisuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMalawisuchus entity) {
        return RenderMalawisuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMalawisuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMalawisuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}