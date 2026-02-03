package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParringtonia;
import net.lepidodendron.entity.model.entity.ModelParringtonia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParringtonia extends RenderLivingBaseWithBook<EntityPrehistoricFloraParringtonia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/parringtonia.png");

    public static float getScaler() {return 0.62f;}
    public RenderParringtonia(RenderManager mgr) {
        super(mgr, new ModelParringtonia(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParringtonia entity) {
        return RenderParringtonia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParringtonia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraParringtonia entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}