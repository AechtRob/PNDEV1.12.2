package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockDNARecombinerCentrifuge;
import net.lepidodendron.entity.model.tile.ModelDNARecombinerCentrifugeLid;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderDNACentrifuge extends TileEntitySpecialRenderer<BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge> {

    private static final ResourceLocation TEXTURE_CENTRIFUGE_LID = new ResourceLocation("lepidodendron:textures/entities/dna_recombiner_centrifuge_top.png");
    private final ModelDNARecombinerCentrifugeLid modelDNARecombinerCentrifugeLid;
    //public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderDNACentrifuge() {
        this.modelDNARecombinerCentrifugeLid = new ModelDNARecombinerCentrifugeLid();
    }

    @Override
    public void render(BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld()) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(BlockDNARecombinerCentrifuge.BlockCustom.FACING);
        }

        //Centrifuge lid:
        double yy = 1.5D;

        this.bindTexture(TEXTURE_CENTRIFUGE_LID);
        ModelDNARecombinerCentrifugeLid modelDNARecombinerCentrifugeLid = this.modelDNARecombinerCentrifugeLid;
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translate(x + 0.5, y + yy, z + 0.5);

        GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        GlStateManager.scale(0.05F, 0.05F, 0.05F);
        if (!(facing == EnumFacing.DOWN || facing == EnumFacing.UP)) {
            GlStateManager.rotate(facing.rotateY().rotateY().rotateY().getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        }
        GlStateManager.enableAlpha();

        float f = entity.prevLidAngle + (entity.lidAngle - entity.prevLidAngle) * partialTicks;
        f = 1.0F - f;
        f = 1.0F - f * f * f;
        modelDNARecombinerCentrifugeLid.lid.rotateAngleZ = (f * ((float)Math.PI / 2F));

        modelDNARecombinerCentrifugeLid.renderAll(1.25f);
        GlStateManager.disableAlpha();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();

    }
}