package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRotaciurca;
import net.lepidodendron.entity.model.entity.ModelRotaciurca;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRotaciurca extends RenderLiving<EntityPrehistoricFloraRotaciurca> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rotaciurca.png");

    public static float getScaler() {return 0.35F;}

    public RenderRotaciurca(RenderManager mgr) {
        super(mgr, new ModelRotaciurca(), 0.0f);
        this.addLayer(new LayerRotaciurcaTentacle(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRotaciurca entity) {
        return RenderRotaciurca.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRotaciurca entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRotaciurca entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}