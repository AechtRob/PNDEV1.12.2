package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEstemmenosuchus;
import net.lepidodendron.entity.model.entity.ModelEstemmenosuchus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEstemmenosuchus extends RenderLiving<EntityPrehistoricFloraEstemmenosuchus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/estemmenosuchus.png");

    public RenderEstemmenosuchus(RenderManager mgr) {
        super(mgr, new ModelEstemmenosuchus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEstemmenosuchus entity) {
        return RenderEstemmenosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEstemmenosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEstemmenosuchus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.55F;
    }

}