package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAmmonite_Pachydesmoceras;
import net.lepidodendron.entity.model.entity.ModelAmmonite100cm;
import net.lepidodendron.entity.model.entity.ModelManticoceras;
import net.lepidodendron.entity.model.entity.ModelPachydesmoceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAmmonite_Pachydesmoceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraAmmonite_Pachydesmoceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ammonite_pachydesmoceras.png");

    public RenderAmmonite_Pachydesmoceras(RenderManager mgr) {
        super(mgr, new ModelPachydesmoceras(), 0.65f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAmmonite_Pachydesmoceras entity) {
        return RenderAmmonite_Pachydesmoceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAmmonite_Pachydesmoceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAmmonite_Pachydesmoceras entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}