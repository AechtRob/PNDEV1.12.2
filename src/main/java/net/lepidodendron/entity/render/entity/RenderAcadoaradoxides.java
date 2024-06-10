package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAcadoaradoxides;
import net.lepidodendron.entity.model.entity.ModelAcadoaradoxides;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAcadoaradoxides extends RenderLivingBaseWithBook<EntityPrehistoricFloraAcadoaradoxides> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acadoaradoxides.png");

    public RenderAcadoaradoxides(RenderManager mgr) {
        super(mgr, new ModelAcadoaradoxides(),  RenderDisplays.modelAcadoaradoxides, 0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAcadoaradoxides entity) {
        return RenderAcadoaradoxides.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAcadoaradoxides entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}