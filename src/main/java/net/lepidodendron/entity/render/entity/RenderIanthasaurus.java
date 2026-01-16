package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIanthasaurus;
import net.lepidodendron.entity.model.entity.ModelIanthasaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIanthasaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraIanthasaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ianthasaurus.png");

    public static float getScaler() {return 0.457f;}
    public RenderIanthasaurus(RenderManager mgr) {
        super(mgr, new ModelIanthasaurus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIanthasaurus entity) {
        return RenderIanthasaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIanthasaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIanthasaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}