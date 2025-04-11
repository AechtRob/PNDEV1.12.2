package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHamiltonichthys;
import net.lepidodendron.entity.model.entity.ModelHamiltonichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHamiltonichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraHamiltonichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hamiltonichthys.png");

    public RenderHamiltonichthys(RenderManager mgr) {
        super(mgr, new ModelHamiltonichthys(), 0.0f);
    }

    public static float getScaler() {return 0.22F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHamiltonichthys entity) {
        return RenderHamiltonichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHamiltonichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHamiltonichthys entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}