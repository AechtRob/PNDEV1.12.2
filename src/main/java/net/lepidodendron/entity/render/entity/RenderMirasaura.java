package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMirasaura;
import net.lepidodendron.entity.model.entity.ModelMirasaura;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMirasaura extends RenderLivingBaseWithBook<EntityPrehistoricFloraMirasaura> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mirasaura.png");

    public static float getScaler() {
        return 0.15f;
    }

    public RenderMirasaura(RenderManager mgr) {
        super(mgr, new ModelMirasaura(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMirasaura entity) {
        return RenderMirasaura.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMirasaura entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {
            default:
                break;

            case EAST: case WEST: case NORTH: case SOUTH: case DOWN:
                GlStateManager.translate(0.0F, 0F, -0.07F);
                GlStateManager.rotate(0, 1.0F, 0.0F, 0.0F);
                break;

            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(0, 1.0F, 0.0F, 0.0F);
        }

    }


    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMirasaura entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}