package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParioscorpio;
import net.lepidodendron.entity.model.entity.ModelParioscorpio;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParioscorpio extends RenderLivingBaseWithBook<EntityPrehistoricFloraParioscorpio> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/parioscorpio.png");

    public RenderParioscorpio(RenderManager mgr) {
        super(mgr, new ModelParioscorpio(), RenderDisplays.modelParioscorpioBook, 0.0f);
    }

    public static float getScaler() {return 0.24F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParioscorpio entity) {
        return RenderParioscorpio.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParioscorpio entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraParioscorpio entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}