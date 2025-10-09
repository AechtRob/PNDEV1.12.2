package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraChuhsiungichthys;
import net.lepidodendron.entity.model.entity.ModelChuhsiungichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChuhsiungichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraChuhsiungichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/chuhsiungichthys.png");

    public RenderChuhsiungichthys(RenderManager mgr) {
        super(mgr, new ModelChuhsiungichthys(), 0.0f);
    }

    public static float getScaler() {return 0.225F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraChuhsiungichthys entity) {
        return RenderChuhsiungichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraChuhsiungichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraChuhsiungichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}