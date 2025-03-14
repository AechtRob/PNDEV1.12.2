package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMegasecoptera;
import net.lepidodendron.entity.model.entity.ModelSylvohymen;
import net.lepidodendron.entity.render.RenderLivingBaseVariantModels;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMegasecoptera extends RenderLivingBaseVariantModels<EntityPrehistoricFloraMegasecoptera> {
    public static final ResourceLocation TEXTURE_SYLVOHYMEN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megasecoptera_sylvohymen.png");

    public RenderMegasecoptera(RenderManager mgr) {
        super(mgr,
                new ModelSylvohymen(),
                new ModelBase[]{new ModelSylvohymen()},
                0.0f);
        this.addLayer(new LayerMegasecopteraWing(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMegasecoptera entity) {
        switch (entity.getPNType()) {
            case SYLVOHYMEN: default:
                return TEXTURE_SYLVOHYMEN;
        }
    }

    public ModelBase getModelFromArray(EntityPrehistoricFloraMegasecoptera entity) {
        switch (entity.getPNType()) {
            case SYLVOHYMEN: default:
                return this.mainModelArray[0];

        }
    }

    public static float getOffset(EntityPrehistoricFloraMegasecoptera.Type variant) {
        switch (variant) {
            case SYLVOHYMEN: default:
                return 0.07F;

        }
    }


    @Override
    protected void applyRotations(EntityPrehistoricFloraMegasecoptera entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        switch (entityLiving.getAttachmentFacing()) {
            case DOWN:
            default:
                break;
            case EAST:
                GlStateManager.translate(this.getOffset(entityLiving.getPNType()), 0.1F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(90.0F, 0.0F, 0.0F, 1.0F);
                break;
            case WEST:
                GlStateManager.translate(-this.getOffset(entityLiving.getPNType()), 0.1F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(-90.0F, 0.0F, 0.0F, 1.0F);
                break;
            case NORTH:
                GlStateManager.translate(0.0F, 0.1F, -this.getOffset(entityLiving.getPNType()));
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case SOUTH:
                GlStateManager.translate(0.0F, 0.1F, this.getOffset(entityLiving.getPNType()));
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.5F + this.getOffset(entityLiving.getPNType()), 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }
    }


    public static float getScaler(EntityPrehistoricFloraMegasecoptera.Type variant) {
        switch (variant) {
            case SYLVOHYMEN:
            default:
                return 0.305F;

        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMegasecoptera entity, float f) {
        float scale = 1.0F * getScaler(entity.getPNType());
        GlStateManager.scale(scale, scale, scale);
    }

}