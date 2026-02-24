package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaboilus;
import net.lepidodendron.entity.model.entity.ModelArchaboilus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArchaboilus extends RenderLivingBaseWithBook<EntityPrehistoricFloraArchaboilus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archaboilus_male.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archaboilus.png");


    public static float getScaler() {
        return 0.7F * 0.14F;
    }
    public RenderArchaboilus(RenderManager mgr) {
        super(mgr, new ModelArchaboilus(), 0.0f);
        this.addLayer(new LayerArchaboilusWing(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArchaboilus entity) {
        if (entity.getPNType() == EntityPrehistoricFloraArchaboilus.Type.FEMALE) {
            return RenderArchaboilus.TEXTURE_F;
        }
        return RenderArchaboilus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArchaboilus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraArchaboilus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}