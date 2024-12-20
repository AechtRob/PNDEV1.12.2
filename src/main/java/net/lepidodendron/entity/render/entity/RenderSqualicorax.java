package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSqualicorax;
import net.lepidodendron.entity.model.entity.ModelSqualicorax;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSqualicorax extends RenderLivingBaseWithBook<EntityPrehistoricFloraSqualicorax> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/squalicorax.png");

    public static float getScaler() {return 1f;}
    public RenderSqualicorax(RenderManager mgr) {
        super(mgr, new ModelSqualicorax(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSqualicorax entity) {
        return RenderSqualicorax.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSqualicorax entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSqualicorax entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}
