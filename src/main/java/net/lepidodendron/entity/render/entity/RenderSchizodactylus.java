package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSchizodactylus;
import net.lepidodendron.entity.model.entity.ModelSchizodactylus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSchizodactylus extends RenderLivingBaseWithBook<EntityPrehistoricFloraSchizodactylus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/schizodactylus.png");

    public RenderSchizodactylus(RenderManager mgr) {
        super(mgr, new ModelSchizodactylus(), 0.0f);
    }

    public static float getScaler() {
        return 0.14F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSchizodactylus entity) {
        return RenderSchizodactylus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSchizodactylus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {
            case DOWN:
            default:
                break;
            case EAST:
            case WEST:
            case NORTH:
            case SOUTH:
                GlStateManager.translate(0.0F, 0.1F, -0.05F);
                GlStateManager.rotate(0.0F, 1.0F, 0.0F, 0.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }

    }

    protected void preRenderCallback(EntityPrehistoricFloraSchizodactylus entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}