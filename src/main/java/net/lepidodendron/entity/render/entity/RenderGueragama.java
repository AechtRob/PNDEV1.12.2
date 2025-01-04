package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGueragama;
import net.lepidodendron.entity.model.entity.ModelGueragama;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGueragama extends RenderLivingBaseWithBook<EntityPrehistoricFloraGueragama> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gueragama.png");

    public static float getScaler() {return 0.23f;}
    public RenderGueragama(RenderManager mgr) {
        super(mgr, new ModelGueragama(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGueragama entity) {
        return RenderGueragama.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGueragama entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGueragama entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}