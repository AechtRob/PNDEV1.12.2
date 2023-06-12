package net.lepidodendron.entity.render.entity;

import net.minecraft.entity.item.EntityBoat;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public interface LayerRendererBoat<E extends EntityBoat>
{
    void doRenderLayer(E boatIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale);

    boolean shouldCombineTextures();
}
