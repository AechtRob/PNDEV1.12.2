package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPoleumita;
import net.lepidodendron.entity.model.entity.ModelPoleumita;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPoleumita extends RenderLiving<EntityPrehistoricFloraPoleumita> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/poleumita.png");
    public static final ModelBase MODEL_BASE = new ModelPoleumita();

    public RenderPoleumita(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPoleumita entity) {
        return RenderPoleumita.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPoleumita entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}