package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKunbarrasaurus;
import net.lepidodendron.entity.model.entity.ModelKunbarrasaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKunbarrasaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraKunbarrasaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kunbarrasaurus.png");

    public static float getScaler() {
        return 0.6f;
    }

    public RenderKunbarrasaurus(RenderManager mgr) {
        super(mgr, new ModelKunbarrasaurus(),0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKunbarrasaurus entity) {
        return RenderKunbarrasaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKunbarrasaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKunbarrasaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}