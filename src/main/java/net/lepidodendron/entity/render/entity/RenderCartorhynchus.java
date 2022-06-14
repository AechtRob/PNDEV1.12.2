package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCartorhynchus;
import net.lepidodendron.entity.model.entity.ModelCartorhynchus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCartorhynchus extends RenderLiving<EntityPrehistoricFloraCartorhynchus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cartorhynchus.png");

    public RenderCartorhynchus(RenderManager mgr) {
        super(mgr, new ModelCartorhynchus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCartorhynchus entity) {
        return RenderCartorhynchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCartorhynchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}







































































