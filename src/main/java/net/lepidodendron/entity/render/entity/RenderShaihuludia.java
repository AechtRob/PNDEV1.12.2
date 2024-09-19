package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraShaihuludia;
import net.lepidodendron.entity.model.entity.ModelShaihuludia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderShaihuludia extends RenderLivingBaseWithBook<EntityPrehistoricFloraShaihuludia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/shaihuludia.png");

    public static float getScaler() {
        return 0.45F;
    }

    public RenderShaihuludia(RenderManager mgr) {
        super(mgr, new ModelShaihuludia(), 0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraShaihuludia entity) {
        return RenderShaihuludia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraShaihuludia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraShaihuludia entity, float f) {
        float scale = this.getScaler()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.38F;
    }

}