package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraScorpion_Gigantoscorpio;
import net.lepidodendron.entity.model.entity.ModelScorpion;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScorpion_Gigantoscorpio extends RenderLiving<EntityPrehistoricFloraScorpion_Gigantoscorpio> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_gigantoscorpio.png");
    private static final ResourceLocation TEXTURE_WITH_BABIES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_gigantoscorpio_withbaby.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_baby.png");
    public static final ModelBase MODEL_BASE = new ModelScorpion();

    public RenderScorpion_Gigantoscorpio(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraScorpion_Gigantoscorpio entity) {
        if (entity.getIsBaby()) {
            return RenderScorpion_Gigantoscorpio.TEXTURE_BABY;
        }
        else if (entity.getBabies()) {
            return RenderScorpion_Gigantoscorpio.TEXTURE_WITH_BABIES;
        }
        return RenderScorpion_Gigantoscorpio.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraScorpion_Gigantoscorpio entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
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
    protected void preRenderCallback(EntityPrehistoricFloraScorpion_Gigantoscorpio entity, float f) {
        if (entity.getIsBaby()) {
            GlStateManager.scale(0.3, 0.3, 0.3);
        }
        else {
            GlStateManager.scale(0.6, 0.6, 0.6);
        }
    }

}