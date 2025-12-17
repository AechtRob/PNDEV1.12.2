package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNorellius;
import net.lepidodendron.entity.model.entity.ModelNorellius;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNorellius extends RenderLivingBaseWithBook<EntityPrehistoricFloraNorellius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/norellius.png");

    public static float getScaler() {
        return 0.1f;
    }

    public RenderNorellius(RenderManager mgr) {
        super(mgr, new ModelNorellius(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNorellius entity) {
        return RenderNorellius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNorellius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {

            default:
                break;

            case EAST: case WEST: case NORTH: case SOUTH: case DOWN:
                GlStateManager.translate(0.0F, 0.05F, -0.1F);
                GlStateManager.rotate(0, 1.0F, 0.0F, 0.0F);
                break;

            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }

    }


    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNorellius entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}