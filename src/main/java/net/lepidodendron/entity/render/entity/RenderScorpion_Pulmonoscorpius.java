package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraScorpion_Pulmonoscorpius;
import net.lepidodendron.entity.model.entity.ModelScorpion;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScorpion_Pulmonoscorpius extends RenderLivingBaseWithBook<EntityPrehistoricFloraScorpion_Pulmonoscorpius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_pulmonoscorpius.png");
    private static final ResourceLocation TEXTURE_WITH_BABIES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_pulmonoscorpius_withbaby.png");
    public static final ResourceLocation TEXTURE_PP = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_pulmonoscorpius_pp.png");
    private static final ResourceLocation TEXTURE_WITH_BABIES_PP = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_pulmonoscorpius_pp_withbaby.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_baby.png");

    public RenderScorpion_Pulmonoscorpius(RenderManager mgr) {
        super(mgr, new ModelScorpion(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraScorpion_Pulmonoscorpius entity) {
        if (entity.getIsBaby()) {
            return RenderScorpion_Pulmonoscorpius.TEXTURE_BABY;
        }
        else if (entity.getBabies()) {
            if (LepidodendronConfig.colourPulmonoscorpius) {
                return RenderScorpion_Pulmonoscorpius.TEXTURE_WITH_BABIES_PP;
            }
            return RenderScorpion_Pulmonoscorpius.TEXTURE_WITH_BABIES;
        }
        if (LepidodendronConfig.colourPulmonoscorpius) {
            return RenderScorpion_Pulmonoscorpius.TEXTURE_PP;
        }
        return RenderScorpion_Pulmonoscorpius.TEXTURE;
    }

    public static float getScaler() {
        return 0.3f;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraScorpion_Pulmonoscorpius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {
            case DOWN:
            default:
                break;
            case EAST:
                GlStateManager.translate(0.0F, 0.05F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case WEST:
                GlStateManager.translate(0.0F, 0.05F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case NORTH:
                GlStateManager.translate(0.0F, 0.05F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case SOUTH:
                GlStateManager.translate(0.0F, 0.05F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }

    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraScorpion_Pulmonoscorpius entity, float f) {
        if (entity.getIsBaby()) {
            GlStateManager.scale(this.getScaler() * 0.4F, this.getScaler() * 0.4F, this.getScaler() * 0.4F);
        }
        else {
            GlStateManager.scale(this.getScaler(), this.getScaler(), this.getScaler());
        }
    }

}