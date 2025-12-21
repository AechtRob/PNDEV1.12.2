package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPetrolacosaurus;
import net.lepidodendron.entity.model.entity.ModelPetrolacosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPetrolacosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPetrolacosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/petrolacosaurus.png");

    public static float getScaler() {
        return 0.25f;
    }

    public RenderPetrolacosaurus(RenderManager mgr) {
        super(mgr, new ModelPetrolacosaurus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPetrolacosaurus entity) {
        return RenderPetrolacosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPetrolacosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {

            default:
                break;

            case EAST: case WEST: case NORTH: case SOUTH:case DOWN:
                GlStateManager.translate(0.0F, 0.0F, 0.0F);
                GlStateManager.rotate(0, 0.0F, 0.0F, 0.0F);
                break;

            case UP:
                GlStateManager.translate(0.0F, 0.F, 0.0F);
                GlStateManager.rotate(0.0F, 0.0F, 0.0F, 0.0F);
        }

    }


    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPetrolacosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}