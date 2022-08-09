package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFadeniaPermotriassic;
import net.lepidodendron.entity.model.entity.ModelFadenia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFadeniaPermotriassic extends RenderLiving<EntityPrehistoricFloraFadeniaPermotriassic> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/fadenia_permotriassic.png");

    public RenderFadeniaPermotriassic(RenderManager mgr) {
        super(mgr, new ModelFadenia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFadeniaPermotriassic entity) {
        return RenderFadeniaPermotriassic.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraFadeniaPermotriassic entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}



