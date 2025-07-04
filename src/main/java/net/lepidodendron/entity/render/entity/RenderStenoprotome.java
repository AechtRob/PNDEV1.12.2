package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraStenoprotome;
import net.lepidodendron.entity.model.entity.ModelStenoprotome;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderStenoprotome extends RenderLivingBaseWithBook<EntityPrehistoricFloraStenoprotome> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/stenoprotome.png");

    public RenderStenoprotome(RenderManager mgr) {
        super(mgr, new ModelStenoprotome(), 0.0f);
    }

    public static float getScaler() {return 0.17F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraStenoprotome entity) {
        return RenderStenoprotome.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraStenoprotome entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraStenoprotome entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





