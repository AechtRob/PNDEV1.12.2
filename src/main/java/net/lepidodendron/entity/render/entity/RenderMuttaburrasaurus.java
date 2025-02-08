package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMuttaburrasaurus;
import net.lepidodendron.entity.model.entity.ModelMuttaburrasaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMuttaburrasaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraMuttaburrasaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/muttaburrasaurus.png");

    public static float getScaler() {
        return 1f;
    }

    public RenderMuttaburrasaurus(RenderManager mgr) {
        super(mgr, new ModelMuttaburrasaurus(),0.9f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMuttaburrasaurus entity) {
        return RenderMuttaburrasaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMuttaburrasaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMuttaburrasaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}