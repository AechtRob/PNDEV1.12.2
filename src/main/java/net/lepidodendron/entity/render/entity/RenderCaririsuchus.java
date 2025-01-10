package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCaririsuchus;
import net.lepidodendron.entity.model.entity.ModelCaririsuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCaririsuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraCaririsuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/caririsuchus.png");

    public static float getScaler() {return 0.6f;}
    public RenderCaririsuchus(RenderManager mgr) {
        super(mgr, new ModelCaririsuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCaririsuchus entity) {
        return RenderCaririsuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCaririsuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCaririsuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}