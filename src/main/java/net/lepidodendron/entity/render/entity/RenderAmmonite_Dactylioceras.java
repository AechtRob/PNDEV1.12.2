package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAmmonite_Dactylioceras;
import net.lepidodendron.entity.model.entity.ModelAmmonite15cm;
import net.lepidodendron.entity.model.entity.ModelDactylioceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAmmonite_Dactylioceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraAmmonite_Dactylioceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ammonite_dactylioceras.png");

    public RenderAmmonite_Dactylioceras(RenderManager mgr) {
        super(mgr, new ModelDactylioceras(), 0.1f);
    }

    public static float getScaler() {
        return 0.2F;
    }
    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAmmonite_Dactylioceras entity) {
        return RenderAmmonite_Dactylioceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAmmonite_Dactylioceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAmmonite_Dactylioceras entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}