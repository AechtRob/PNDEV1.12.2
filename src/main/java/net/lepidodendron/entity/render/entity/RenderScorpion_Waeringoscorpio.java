package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraScorpion_Gondwanascorpio;
import net.lepidodendron.entity.EntityPrehistoricFloraScorpion_Waeringoscorpio;
import net.lepidodendron.entity.model.entity.ModelScorpion;
import net.lepidodendron.entity.model.entity.ModelWaeringoscorpio;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScorpion_Waeringoscorpio extends RenderLivingBaseWithBook<EntityPrehistoricFloraScorpion_Waeringoscorpio> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_waeringoscorpio.png");
    private static final ResourceLocation TEXTURE_WITH_BABIES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_waeringoscorpio_withbaby.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_baby.png");

    public static float getScaler() {
        return 0.32F * 0.32F;
    }

    public RenderScorpion_Waeringoscorpio(RenderManager mgr) {
        super(mgr, new ModelWaeringoscorpio(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraScorpion_Waeringoscorpio entity) {
        if (entity.getIsBaby()) {
            return RenderScorpion_Waeringoscorpio.TEXTURE_BABY;
        }
        else if (entity.getBabies()) {
            return RenderScorpion_Waeringoscorpio.TEXTURE_WITH_BABIES;
        }
        return RenderScorpion_Waeringoscorpio.TEXTURE;
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraScorpion_Waeringoscorpio entity, float f) {
        if (entity.getIsBaby()) {
            GlStateManager.scale(0.5625 * this.getScaler(), 0.5625 * this.getScaler(), 0.5625 * this.getScaler());
        }
        else {
            GlStateManager.scale(this.getScaler(), this.getScaler(), this.getScaler());
        }
    }

}