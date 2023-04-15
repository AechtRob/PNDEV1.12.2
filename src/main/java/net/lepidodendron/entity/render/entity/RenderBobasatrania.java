package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBobasatrania;
import net.lepidodendron.entity.EntityPrehistoricFloraOpabinia;
import net.lepidodendron.entity.model.entity.ModelBobasatrania;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBobasatrania extends RenderLiving<EntityPrehistoricFloraBobasatrania> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bobasatrania.png");
    public static float getScaler() {return 0.65F;}

    public RenderBobasatrania(RenderManager mgr) {
        super(mgr, new ModelBobasatrania(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBobasatrania entity) {
        return RenderBobasatrania.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBobasatrania entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    protected void preRenderCallback(EntityPrehistoricFloraBobasatrania entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}