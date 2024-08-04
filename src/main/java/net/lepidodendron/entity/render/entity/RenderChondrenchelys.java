package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraChondrenchelys;
import net.lepidodendron.entity.model.entity.ModelChondrenchelys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChondrenchelys extends RenderLivingBaseWithBook<EntityPrehistoricFloraChondrenchelys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/chondrenchelys.png");

    public RenderChondrenchelys(RenderManager mgr) {
        super(mgr, new ModelChondrenchelys(), 0.0f);
    }

    public static float getScaler() {return 0.15F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraChondrenchelys entity) {
        return RenderChondrenchelys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraChondrenchelys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraChondrenchelys entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}