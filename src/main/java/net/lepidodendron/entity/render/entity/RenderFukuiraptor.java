package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFukuiraptor;
import net.lepidodendron.entity.model.entity.ModelFukuiraptor;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFukuiraptor extends RenderLivingBaseWithBook<EntityPrehistoricFloraFukuiraptor> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/fukuiraptor.png");

    public static float getScaler() {return 0.88888F;}

    public RenderFukuiraptor(RenderManager mgr) {
        super(mgr, new ModelFukuiraptor(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFukuiraptor entity) {
        return RenderFukuiraptor.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraFukuiraptor entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraFukuiraptor entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}