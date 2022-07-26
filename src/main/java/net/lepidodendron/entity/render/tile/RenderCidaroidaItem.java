package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockCidaroida;
import net.lepidodendron.entity.model.entity.ModelCidaroida;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderCidaroidaItem extends TileEntitySpecialRenderer<BlockCidaroida.TileEntityCustom> {

    private static final ResourceLocation TEXTURE1 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cidaroid_1.png");
    private static final ResourceLocation TEXTURE2 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cidaroid_2.png");
    private static final ResourceLocation TEXTURE3 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cidaroid_3.png");
    private static final ResourceLocation TEXTURE4 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cidaroid_4.png");
    private final ModelCidaroida modelCidaroida;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderCidaroidaItem() {
        this.modelCidaroida = new ModelCidaroida();
    }

    @Override
    public void render(BlockCidaroida.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        int variant = 3;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
            variant = entity.getTileData().getInteger("variant");
        }
        ResourceLocation TEXTURE = TEXTURE4;
        if (variant == 0) {
            TEXTURE = TEXTURE1;
        }
        else if (variant == 1) {
            TEXTURE = TEXTURE2;
        }
        else if (variant == 2) {
            TEXTURE = TEXTURE3;
        }
        this.bindTexture(TEXTURE);
        ModelCidaroida ModelCidaroida = this.modelCidaroida;
        double scale = 0.04D;
        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5, y - 0.05, z + 0.5);
        GlStateManager.scale(scale,scale,scale);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
        ModelCidaroida.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.popMatrix();
    }
}