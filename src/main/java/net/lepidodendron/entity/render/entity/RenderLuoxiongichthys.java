package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLuoxiongichthys;
import net.lepidodendron.entity.model.entity.ModelLuoxiongichthys;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLuoxiongichthys extends RenderLiving<EntityPrehistoricFloraLuoxiongichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/luoxiongichthys.png");
    public static final ModelBase MODEL_BASE = new ModelLuoxiongichthys();

    public RenderLuoxiongichthys(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLuoxiongichthys entity) {
        return RenderLuoxiongichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLuoxiongichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}




