package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWukongopterus;
import net.lepidodendron.entity.model.entity.ModelWukongopterus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class RenderWukongopterus extends RenderLivingBaseWithBook<EntityPrehistoricFloraWukongopterus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/wukongopterus_m.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/wukongopterus_f.png");
    public static final ResourceLocation TEXTURE_WUKONGOPTERUS_KING_MONKEY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/wukongopterus_king_monkey.png");

    public RenderWukongopterus(RenderManager mgr) {
        super(mgr, new ModelWukongopterus(), 0.5F);
    }

    public static float getScaler() {
        return 0.1825F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWukongopterus entity) {
        String s = TextFormatting.getTextWithoutFormattingCodes(entity.getName());
        if (s != null &&
                (("Sun Wu Kong".equalsIgnoreCase(s))
                        || ("Sun WuKong".equalsIgnoreCase(s))
                        || ("Goku".equalsIgnoreCase(s))
                        || ("Son Goku".equalsIgnoreCase(s))
                        || ("Tôn Ngộ Không".equalsIgnoreCase(s))
                        || ("Ton Ngo Khong".equalsIgnoreCase(s))
                        || ("Great Sage, Heaven's Equal".equalsIgnoreCase(s))
                        || ("Great Sage, Heavens Equal".equalsIgnoreCase(s))
                        || ("Great Sage Heaven's Equal".equalsIgnoreCase(s))
                        || ("Great Sage Heavens Equal".equalsIgnoreCase(s))
                        || ("Sun Ngokong".equalsIgnoreCase(s))
                        || ("Sun Gokong".equalsIgnoreCase(s))
                        || ("Son Oh Gong".equalsIgnoreCase(s))
                        || ("monkey king".equalsIgnoreCase(s))
                        || ("king monkey".equalsIgnoreCase(s))
                        || ("monkey".equalsIgnoreCase(s))
                        || ("孙悟空".equalsIgnoreCase(s))
                        || ("孫悟空".equalsIgnoreCase(s))
                        || ("齊天".equalsIgnoreCase(s))
                        || ("猴齊天".equalsIgnoreCase(s))
                        || ("馬騮精".equalsIgnoreCase(s))
                        || ("Te Thien Dai Thanh".equalsIgnoreCase(s))
                        || ("Te Thien".equalsIgnoreCase(s))
                )
            )
        {
            return RenderWukongopterus.TEXTURE_WUKONGOPTERUS_KING_MONKEY;
        }
        if (entity.getPNType() == EntityPrehistoricFloraWukongopterus.Type.FEMALE) {
            return RenderWukongopterus.TEXTURE_F;
        }
        return RenderWukongopterus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraWukongopterus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
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
    protected void preRenderCallback(EntityPrehistoricFloraWukongopterus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (entity.getPNType() == EntityPrehistoricFloraWukongopterus.Type.FEMALE) {
            scale = scale * 0.85F;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}