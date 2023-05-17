package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEricixerxes;
import net.lepidodendron.entity.model.entity.ModelEricixerxes;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEricixerxes extends RenderLiving<EntityPrehistoricFloraEricixerxes> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ericixerxes.png");

    public RenderEricixerxes(RenderManager mgr) {
        super(mgr, new ModelEricixerxes(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEricixerxes entity) {
        return RenderEricixerxes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEricixerxes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}