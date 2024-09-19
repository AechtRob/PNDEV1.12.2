package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeocydippida;
import net.lepidodendron.entity.model.entity.ModelArchaeocydippida;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArchaeocydippida extends RenderLivingBaseWithBook<EntityPrehistoricFloraArchaeocydippida> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archaeocydippida.png");

    public static float getScaler() {return 0.3F;}

    public RenderArchaeocydippida(RenderManager mgr) {
        super(mgr, new ModelArchaeocydippida(), 0.0f);
        this.addLayer(new LayerArchaeocydippidaBody(this));
        this.addLayer(new LayerArchaeocydippidaEmissive(this));

    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArchaeocydippida entity) {
        return RenderArchaeocydippida.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArchaeocydippida entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraArchaeocydippida entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        //this.shadowSize = entity.width * scale * 0.50F;
    }

}