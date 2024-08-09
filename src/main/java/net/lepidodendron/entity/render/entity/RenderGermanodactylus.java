package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGermanodactylus;
import net.lepidodendron.entity.model.entity.ModelGermanodactylus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class RenderGermanodactylus extends RenderLivingBaseWithBook<EntityPrehistoricFloraGermanodactylus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/germanodactylus.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/germanodactylus_f.png");

    public RenderGermanodactylus(RenderManager mgr) {
        super(mgr, new ModelGermanodactylus(), 0.5F);
    }

    public static float getScaler() {
        return 0.1825F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGermanodactylus entity) {
        String s = TextFormatting.getTextWithoutFormattingCodes(entity.getName());
        if (entity.getPNType() == EntityPrehistoricFloraGermanodactylus.Type.FEMALE) {
            return RenderGermanodactylus.TEXTURE_F;
        }
        return RenderGermanodactylus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGermanodactylus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        float getOffset = 0.37F;
        switch (entityLiving.getAttachmentFacing()) {
            case DOWN: case UP:
            default:
                break;
            case EAST: case WEST: case NORTH: case SOUTH:
                GlStateManager.translate(0.0, 0.05F, -getOffset);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGermanodactylus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (entity.getPNType() == EntityPrehistoricFloraGermanodactylus.Type.FEMALE) {
            scale = scale * 0.85F;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}