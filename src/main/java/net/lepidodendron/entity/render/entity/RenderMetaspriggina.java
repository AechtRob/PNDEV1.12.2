package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMetaspriggina;
import net.lepidodendron.entity.model.entity.ModelMetaspriggina;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMetaspriggina extends RenderLiving<EntityPrehistoricFloraMetaspriggina> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/metaspriggina.png");
    public static final ModelBase MODEL_BASE = new ModelMetaspriggina();

    public RenderMetaspriggina(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMetaspriggina entity) {
        return RenderMetaspriggina.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMetaspriggina entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}