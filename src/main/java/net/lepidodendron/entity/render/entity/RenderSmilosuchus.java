package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSmilosuchus;
import net.lepidodendron.entity.model.entity.ModelSmilosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSmilosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraSmilosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/smilosuchus.png");

    public static float getScaler() {return 0.85F* 0.91F;}

    public RenderSmilosuchus(RenderManager mgr) {
        super(mgr, new ModelSmilosuchus(), 0.35f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSmilosuchus entity) {
        return RenderSmilosuchus.TEXTURE;
    } 
    
    @Override
    protected void applyRotations(EntityPrehistoricFloraSmilosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSmilosuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.55F;
    }

}