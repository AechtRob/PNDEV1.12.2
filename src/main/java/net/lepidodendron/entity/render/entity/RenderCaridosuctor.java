package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCaridosuctor;
import net.lepidodendron.entity.model.entity.ModelCaridosuctor;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCaridosuctor extends RenderLivingBaseWithBook<EntityPrehistoricFloraCaridosuctor> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/caridosuctor.png");

    public RenderCaridosuctor(RenderManager mgr) {
        super(mgr, new ModelCaridosuctor(), 0.0f);
    }

    public static float getScaler() {return 0.3F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCaridosuctor entity) {
        return RenderCaridosuctor.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCaridosuctor entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCaridosuctor entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}