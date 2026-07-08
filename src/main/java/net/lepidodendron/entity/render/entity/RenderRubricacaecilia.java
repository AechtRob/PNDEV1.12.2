package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRubricacaecilia;
import net.lepidodendron.entity.model.entity.ModelRubricacaecilia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRubricacaecilia extends RenderLivingBaseWithBook<EntityPrehistoricFloraRubricacaecilia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rubricacaecilia.png");

    public static float getScaler() {return 0.15f;}

    public RenderRubricacaecilia(RenderManager mgr) {
        super(mgr, new ModelRubricacaecilia(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRubricacaecilia entity) {
        return RenderRubricacaecilia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRubricacaecilia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRubricacaecilia entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}