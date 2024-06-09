package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSenekichthys;
import net.lepidodendron.entity.model.entity.ModelSenekichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSenekichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraSenekichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/senekichthys.png");

    public RenderSenekichthys(RenderManager mgr) {
        super(mgr, new ModelSenekichthys(), RenderDisplays.modelSenekichthysBook, 0.0f);
    }

    public static float getScaler() {return 0.2F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSenekichthys entity) {
        return RenderSenekichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSenekichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSenekichthys entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}