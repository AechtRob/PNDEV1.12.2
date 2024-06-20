package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGerarusInsect;
import net.lepidodendron.entity.model.entity.ModelGerarus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGerarus extends RenderLivingBaseWithBook<EntityPrehistoricFloraGerarusInsect> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gerarus.png");
    public static final ResourceLocation TEXTURE_BOOK = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gerarus_book.png");

    public RenderGerarus(RenderManager mgr) {
        super(mgr, new ModelGerarus(), 0.0f);
        this.addLayer(new LayerGerarusWing(this));
    }

    public static float getScaler() {
        return 0.240f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGerarusInsect entity) {
        return RenderGerarus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGerarusInsect entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGerarusInsect entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
    }

}