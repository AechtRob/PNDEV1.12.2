package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEoporpita;
import net.lepidodendron.entity.model.entity.ModelEoporpita;
import net.lepidodendron.entity.model.entity.ModelPrecambrianJelly;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEoporpita extends RenderLivingBaseWithBook<EntityPrehistoricFloraEoporpita> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eoporpita.png");

    public static float getScaler() {return 0.815F;}

    public RenderEoporpita(RenderManager mgr) {
        super(mgr, new ModelEoporpita(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEoporpita entity) {
        return RenderEoporpita.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEoporpita entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEoporpita entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}