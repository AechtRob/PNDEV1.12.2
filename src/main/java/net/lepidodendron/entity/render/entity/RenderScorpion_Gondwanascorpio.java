package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraScorpion_Gondwanascorpio;
import net.lepidodendron.entity.model.entity.ModelScorpion;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScorpion_Gondwanascorpio extends RenderLiving<EntityPrehistoricFloraScorpion_Gondwanascorpio> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_gondwanascorpio.png");
    private static final ResourceLocation TEXTURE_WITH_BABIES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_gondwanascorpio_withbaby.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_baby.png");

    public RenderScorpion_Gondwanascorpio(RenderManager mgr) {
        super(mgr, new ModelScorpion(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraScorpion_Gondwanascorpio entity) {
        if (entity.getIsBaby()) {
            return RenderScorpion_Gondwanascorpio.TEXTURE_BABY;
        }
        else if (entity.getBabies()) {
            return RenderScorpion_Gondwanascorpio.TEXTURE_WITH_BABIES;
        }
        return RenderScorpion_Gondwanascorpio.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraScorpion_Gondwanascorpio entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
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
    protected void preRenderCallback(EntityPrehistoricFloraScorpion_Gondwanascorpio entity, float f) {
        if (entity.getIsBaby()) {
            GlStateManager.scale(0.18, 0.18, 0.18);
        }
        else {
            GlStateManager.scale(0.32, 0.32, 0.32);
        }
    }

}