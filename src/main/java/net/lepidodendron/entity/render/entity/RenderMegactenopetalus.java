package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMegactenopetalus;
import net.lepidodendron.entity.model.entity.ModelMegactenopetalus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMegactenopetalus extends RenderLivingBaseWithBook<EntityPrehistoricFloraMegactenopetalus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megactenopetalus.png");

    public RenderMegactenopetalus(RenderManager mgr) {
        super(mgr, new ModelMegactenopetalus(), 0.0f);
    }

    public static float getScaler() {return 0.825F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMegactenopetalus entity) {
        return RenderMegactenopetalus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMegactenopetalus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMegactenopetalus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}




