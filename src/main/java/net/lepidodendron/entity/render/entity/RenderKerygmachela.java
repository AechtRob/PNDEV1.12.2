package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKerygmachela;
import net.lepidodendron.entity.model.entity.ModelKerygmachela;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKerygmachela extends RenderLivingBaseWithBook<EntityPrehistoricFloraKerygmachela> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kerygmachela.png");

    public static float getScaler() {return 0.213F;}

    public RenderKerygmachela(RenderManager mgr) {
        super(mgr, new ModelKerygmachela(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKerygmachela entity) {
        return RenderKerygmachela.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKerygmachela entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    protected void preRenderCallback(EntityPrehistoricFloraKerygmachela entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}