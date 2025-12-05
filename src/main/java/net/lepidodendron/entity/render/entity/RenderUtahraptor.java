package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraUtahraptor;
import net.lepidodendron.entity.model.entity.ModelUtahraptor;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUtahraptor extends RenderLivingBaseWithBook<EntityPrehistoricFloraUtahraptor> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/utahraptor.png");

    public static float getScaler() {
        return 0.85f;
    }

    public RenderUtahraptor(RenderManager mgr) {
        super(mgr, new ModelUtahraptor(),0.9f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraUtahraptor entity) {
        return RenderUtahraptor.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraUtahraptor entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraUtahraptor entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}