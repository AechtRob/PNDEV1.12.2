package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTeinolophos;
import net.lepidodendron.entity.model.entity.ModelTeinolophos;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTeinolophos extends RenderLivingBaseWithBook<EntityPrehistoricFloraTeinolophos> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/teinolophos.png");

    public static float getScaler() {return 0.250f;}
    public RenderTeinolophos(RenderManager mgr) {
        super(mgr, new ModelTeinolophos(), 0.14f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTeinolophos entity) {
        return RenderTeinolophos.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTeinolophos entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTeinolophos entity, float f) {
        float scale = entity.getAgeScale()*getScaler(); //This is smaller than Teinolophos
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.125F;
    }

}