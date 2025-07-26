package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAnurognathid;
import net.lepidodendron.entity.model.entity.*;
import net.lepidodendron.entity.render.RenderLivingBaseVariantModels;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAnurognathid extends RenderLivingBaseVariantModels<EntityPrehistoricFloraAnurognathid> {
    public static final ResourceLocation TEXTURE_ANUROGNATHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anurognathid_anurognathus.png");
    public static final ResourceLocation TEXTURE_BATRACHOGNATHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anurognathid_batrachognathus.png");
    public static final ResourceLocation TEXTURE_CASCOCAUDA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anurognathid_cascocauda.png");
    public static final ResourceLocation TEXTURE_DENDRORHYNCHOIDES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anurognathid_dendrorhynchoides.png");
    public static final ResourceLocation TEXTURE_JEHOLOPTERUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anurognathid_jeholopterus.png");
    public static final ResourceLocation TEXTURE_SINOMACROPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anurognathid_sinomacrops.png");
    public static final ResourceLocation TEXTURE_VESPEROPTERYLUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anurognathid_vesperopterylus.png");


    public RenderAnurognathid(RenderManager mgr) {
        super(mgr,
            new ModelAnurognathus(),
            new ModelBase[]{new ModelAnurognathus(), new ModelBatrachognathus(), new ModelCascocauda(), new ModelDendrorhynchoides(), new ModelJeholopterus(), new ModelVesperopterylus()},
           0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAnurognathid entity) {
        switch (entity.getPNType()) {
            case ANUROGNTHUS: default:
                return TEXTURE_ANUROGNATHUS;

            case BATRACHOGNATHUS:
                return TEXTURE_BATRACHOGNATHUS;

            case CASCOCAUDA:
                return TEXTURE_CASCOCAUDA;

            case DENDRORHYNCHOIDES:
                return TEXTURE_DENDRORHYNCHOIDES;

            case JEHOLOPTERUS:
                return TEXTURE_JEHOLOPTERUS;

            case SINOMACROPS:
                return TEXTURE_SINOMACROPS;
            case VESPEROPTERYLUS:
                return TEXTURE_VESPEROPTERYLUS;

        }
    }

    public ModelBase getModelFromArray(EntityPrehistoricFloraAnurognathid entity) {
        switch (entity.getPNType()) {
            case ANUROGNTHUS: default:
                return this.mainModelArray[0];

            case BATRACHOGNATHUS:
                return this.mainModelArray[1];

            case CASCOCAUDA:
                return this.mainModelArray[2];

            case DENDRORHYNCHOIDES:
                return this.mainModelArray[3];

            case JEHOLOPTERUS:
                return this.mainModelArray[4];

            case SINOMACROPS:
                return this.mainModelArray[1];
            case VESPEROPTERYLUS:
                return this.mainModelArray[5];
        }
    }

    public static float getOffset(EntityPrehistoricFloraAnurognathid.Type variant) {
        switch (variant) {
            case ANUROGNTHUS: default:
                return 0.20F;

            case BATRACHOGNATHUS:
                return 0.270F;

            case CASCOCAUDA:
                return 0.250F;

            case DENDRORHYNCHOIDES:
                return 0.20F;

            case JEHOLOPTERUS:
                return 0.45F;

            case SINOMACROPS:
                return 0.20F;
            case VESPEROPTERYLUS:
                return 0.26F;

        }
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAnurognathid entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        switch (entityLiving.getAttachmentFacing()) {
            case DOWN:
            default:
                GlStateManager.translate(0.0F, -0.1F, 0.0F);
                break;
            case EAST: case WEST: case NORTH: case SOUTH:
                GlStateManager.translate(0.0, 0.05F, -this.getOffset(entityLiving.getPNType()));
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.5F + this.getOffset(entityLiving.getPNType()), 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }
    }

    public static float getScaler(EntityPrehistoricFloraAnurognathid.Type variant) {
        switch (variant) {
            case ANUROGNTHUS:
            default:
                return 0.205F;

            case BATRACHOGNATHUS:
                return 0.27F;

            case CASCOCAUDA:
                return 0.25F;

            case DENDRORHYNCHOIDES:
                return 0.24F;

            case JEHOLOPTERUS:
                return 0.275F;

            case SINOMACROPS:
                return 0.22F;
            case VESPEROPTERYLUS:
                return 0.29F;

        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAnurognathid entity, float f) {
        float scale = getScaler(entity.getPNType()) * entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
    }

}