package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGracilisuchus;
import net.lepidodendron.entity.model.entity.ModelGracilisuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGracilisuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraGracilisuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gracilisuchus.png");

    public static float getScaler() {return 0.274f;}
    public RenderGracilisuchus(RenderManager mgr) {
        super(mgr, new ModelGracilisuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGracilisuchus entity) {
        return RenderGracilisuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGracilisuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGracilisuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}