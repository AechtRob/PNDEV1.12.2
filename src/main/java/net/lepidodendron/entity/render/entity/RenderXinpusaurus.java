package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraXinpusaurus;
import net.lepidodendron.entity.model.entity.ModelXinpusaurus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderXinpusaurus extends RenderLiving<EntityPrehistoricFloraXinpusaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/xinpusaurus.png");

    public RenderXinpusaurus(RenderManager mgr) {
        super(mgr, new ModelXinpusaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraXinpusaurus entity) {
        return RenderXinpusaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraXinpusaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}












