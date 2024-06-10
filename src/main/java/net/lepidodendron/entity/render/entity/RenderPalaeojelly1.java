package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJellyfish_Palaeo1;
import net.lepidodendron.entity.model.entity.ModelPalaeoJelly1;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPalaeojelly1 extends RenderLivingBaseWithBook<EntityPrehistoricFloraJellyfish_Palaeo1> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeojelly1.png");

    public RenderPalaeojelly1(RenderManager mgr) {
        super(mgr, new ModelPalaeoJelly1(), RenderDisplays.modelPalaeoJelly1Book, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJellyfish_Palaeo1 entity) {
        return RenderPalaeojelly1.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJellyfish_Palaeo1 entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}