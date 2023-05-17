package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraScorpion_Opsieobuthus;
import net.lepidodendron.entity.model.entity.ModelScorpion;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScorpion_Opsieobuthus extends RenderLiving<EntityPrehistoricFloraScorpion_Opsieobuthus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_opsieobuthus.png");
    private static final ResourceLocation TEXTURE_WITH_BABIES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_opsieobuthus_withbaby.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_baby.png");

    public RenderScorpion_Opsieobuthus(RenderManager mgr) {
        super(mgr, new ModelScorpion(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraScorpion_Opsieobuthus entity) {
        if (entity.getIsBaby()) {
            return RenderScorpion_Opsieobuthus.TEXTURE_BABY;
        }
        else if (entity.getBabies()) {
            return RenderScorpion_Opsieobuthus.TEXTURE_WITH_BABIES;
        }
        return RenderScorpion_Opsieobuthus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraScorpion_Opsieobuthus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
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
    protected void preRenderCallback(EntityPrehistoricFloraScorpion_Opsieobuthus entity, float f) {
        if (entity.getIsBaby()) {
            GlStateManager.scale(0.2, 0.2, 0.2);
        }
        else {
            GlStateManager.scale(0.4, 0.4, 0.4);
        }
    }

}