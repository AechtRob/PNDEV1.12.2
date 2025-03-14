package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRoachoidSwampInsect;
import net.lepidodendron.entity.model.entity.ModelRoachoid;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRoachoidSwamp extends RenderLivingBaseWithBook<EntityPrehistoricFloraRoachoidSwampInsect> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/roachoid_swamp.png");

    public static float getScaler() {return 0.165f;}

    public RenderRoachoidSwamp(RenderManager mgr) {
        super(mgr, new ModelRoachoid(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRoachoidSwampInsect entity) {
        return RenderRoachoidSwamp.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRoachoidSwampInsect entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRoachoidSwampInsect entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
    }

}