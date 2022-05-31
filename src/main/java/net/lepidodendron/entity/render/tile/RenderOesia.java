package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockOesia;
import net.lepidodendron.entity.model.tile.ModelOesia;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

public class RenderOesia extends TileEntitySpecialRenderer<BlockOesia.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/oesia.png");
    private static final ResourceLocation TEXTURE1 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/oesia1.png");
    private static final ResourceLocation TEXTURE2 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/oesia2.png");
    private static final ResourceLocation TEXTURE3 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/oesia3.png");
    private static final ResourceLocation TEXTURE4 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/oesia4.png");
    private static final ResourceLocation TEXTURE5 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/oesia5.png");
    private static final ResourceLocation TEXTURE6 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/oesia6.png");
    private static final ResourceLocation TEXTURE7 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/oesia8.png");
    private static final ResourceLocation TEXTURE8 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/oesia9.png");
    private static final ResourceLocation TEXTURE9 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/oesia9.png");
    private static final ResourceLocation TEXTURE10 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/oesia10.png");
    private final ModelOesia modelOesia;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderOesia() {
        this.modelOesia = new ModelOesia();
    }

    @Override
    public void render(BlockOesia.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld()) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
            int variant = new Object() {
                public int getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = entity.getWorld().getTileEntity(pos);
                    if (tileEntity != null)
                        return tileEntity.getTileData().getInteger(tag);
                    return 0;
                }
            }.getValue(new BlockPos(entity.getPos()), "variant");
            if (variant == 0) {
                this.bindTexture(TEXTURE);
            }
            if (variant == 1) {
                this.bindTexture(TEXTURE1);
            }
            if (variant == 2) {
                this.bindTexture(TEXTURE2);
            }
            if (variant == 3) {
                this.bindTexture(TEXTURE3);
            }
            if (variant == 4) {
                this.bindTexture(TEXTURE4);
            }
            if (variant == 5) {
                this.bindTexture(TEXTURE5);
            }
            if (variant == 6) {
                this.bindTexture(TEXTURE6);
            }
            if (variant == 7) {
                this.bindTexture(TEXTURE7);
            }
            if (variant == 8) {
                this.bindTexture(TEXTURE8);
            }
            if (variant == 9) {
                this.bindTexture(TEXTURE9);
            }
            if (variant == 10) {
                this.bindTexture(TEXTURE10);
            }
            ModelOesia modelOesia = this.modelOesia;
            GlStateManager.pushMatrix();
            GlStateManager.translate(x + 0.5, y + 2.4, z + 0.5);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
            modelOesia.renderAll(Minecraft.getMinecraft().player.ticksExisted);
            GlStateManager.popMatrix();
        }
    }
}