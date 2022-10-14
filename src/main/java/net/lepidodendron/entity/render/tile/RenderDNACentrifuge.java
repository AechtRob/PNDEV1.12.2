package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockDNARecombinerCentrifuge;
import net.lepidodendron.entity.model.tile.ModelDNARecombinerCentrifugeLid;
import net.lepidodendron.entity.model.tile.ModelDNARecombinerCentrifugeLidHatch;
import net.lepidodendron.entity.model.tile.ModelDNARecombinerCentrifugePhial;
import net.lepidodendron.entity.model.tile.ModelDNARecombinerCentrifugeSpindle;
import net.lepidodendron.item.ItemPhialDNA;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RenderDNACentrifuge extends TileEntitySpecialRenderer<BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge> {

    private static final ResourceLocation TEXTURE_CENTRIFUGE_LID = new ResourceLocation("lepidodendron:textures/entities/dna_recombiner_centrifuge_top.png");
    private static final ResourceLocation TEXTURE_CENTRIFUGE_PHIAL_DNA = new ResourceLocation("lepidodendron:textures/entities/centrifuge_phial.png");
    private static final ResourceLocation TEXTURE_CENTRIFUGE_PHIAL_EMPTY = new ResourceLocation("lepidodendron:textures/entities/centrifuge_phial_empty.png");
    private static final ResourceLocation TEXTURE_IRON_BLOCK = new ResourceLocation("minecraft:textures/blocks/iron_block.png");

    private final ModelDNARecombinerCentrifugeLid modelDNARecombinerCentrifugeLid;
    private final ModelDNARecombinerCentrifugeLidHatch modelDNARecombinerCentrifugeLidHatch;
    private final ModelDNARecombinerCentrifugePhial modelDNARecombinerCentrifugePhial;
    private final ModelDNARecombinerCentrifugeSpindle modelDNARecombinerCentrifugeSpindle;

    public RenderDNACentrifuge() {
        this.modelDNARecombinerCentrifugeLid = new ModelDNARecombinerCentrifugeLid();
        this.modelDNARecombinerCentrifugeLidHatch = new ModelDNARecombinerCentrifugeLidHatch();
        this.modelDNARecombinerCentrifugePhial = new ModelDNARecombinerCentrifugePhial();
        this.modelDNARecombinerCentrifugeSpindle = new ModelDNARecombinerCentrifugeSpindle();
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
        float rotateAngleInitial = 0F;
        float rotateAngle = 0F;
        float flareAngle = 0F;
        if (entity.isProcessing()) {
            modelDNARecombinerCentrifugeLid.lid.rotateAngleZ = 0;
            try {
                rotateAngleInitial = entity.getRotationAngle(Minecraft.getMinecraft().world.getTotalWorldTime() - entity.startTick + partialTicks);
                rotateAngle = (float) entity.floorAngle(rotateAngleInitial);
                //System.err.println("angle: " + entity.setRotationAngle(Minecraft.getMinecraft().world.getTotalWorldTime() - entity.startTick + partialTicks));
                flareAngle = (float) entity.getFlareAngle(Minecraft.getMinecraft().world.getTotalWorldTime() - entity.startTick + partialTicks);
            } catch (RuntimeException exception) {
            }
        }
        else if (!entity.isLocked()){
            float f = entity.prevLidAngle + (entity.lidAngle - entity.prevLidAngle) * partialTicks;
            f = 1.0F - f;
            f = 1.0F - f * f * f;
            modelDNARecombinerCentrifugeLid.lid.rotateAngleZ = (f * ((float)Math.PI / 2F));
        }
        modelDNARecombinerCentrifugeLid.renderAll(1.25f);
        GlStateManager.disableAlpha();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();

        //Centrifuge lid hatch:
        yy = 1.5D;
        this.bindTexture(TEXTURE_IRON_BLOCK);
        ModelDNARecombinerCentrifugeLidHatch modelDNARecombinerCentrifugeLidHatch = this.modelDNARecombinerCentrifugeLidHatch;
        GlStateManager.pushMatrix();
        //GlStateManager.disableCull();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translate(x + 0.5, y + yy, z + 0.5);
        GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        GlStateManager.scale(0.05F, 0.05F, 0.05F);
        if (!(facing == EnumFacing.DOWN || facing == EnumFacing.UP)) {
            GlStateManager.rotate(facing.rotateY().rotateY().rotateY().getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        }
        GlStateManager.enableAlpha();
        if (entity.isProcessing()) {
            modelDNARecombinerCentrifugeLidHatch.lid.rotateAngleZ = 0;
        }
        else if (!entity.isLocked()){
            float f = entity.prevLidAngle + (entity.lidAngle - entity.prevLidAngle) * partialTicks;
            f = 1.0F - f;
            f = 1.0F - f * f * f;
            modelDNARecombinerCentrifugeLidHatch.lid.rotateAngleZ = (f * ((float)Math.PI / 2F));
        }
        modelDNARecombinerCentrifugeLidHatch.left.offsetZ = 1.25F * (float) entity.getHatchVal();
        modelDNARecombinerCentrifugeLidHatch.right.offsetZ = -1.25F * (float) entity.getHatchVal();
        modelDNARecombinerCentrifugeLidHatch.renderAll(1.25f);
        GlStateManager.disableAlpha();
        //GlStateManager.enableCull();
        GlStateManager.popMatrix();

        //Centrifuge Spindle:
        yy = 1.5D;
        this.bindTexture(TEXTURE_IRON_BLOCK);
        ModelDNARecombinerCentrifugeSpindle modelDNARecombinerCentrifugeSpindle = this.modelDNARecombinerCentrifugeSpindle;
        GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translate(x + 0.5, y + yy, z + 0.5);
        GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        GlStateManager.scale(0.05F, 0.05F, 0.05F);
        GlStateManager.enableAlpha();
        GlStateManager.rotate(rotateAngle, 0, 1, 0);
        modelDNARecombinerCentrifugeSpindle.renderAll(1.25f);
        GlStateManager.disableAlpha();
        GlStateManager.popMatrix();

        //Render phials if present
        yy = 1.525; //1.525 change lower to lower it
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        if (entity != null && entity.hasWorld()) {
            TileEntity te = world.getTileEntity(pos);
            if (te != null) {
                if (te instanceof BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) {
                    BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge tee = (BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) te;

                    if (!tee.getStackInSlot(0).isEmpty()) {
                        //Render the model in position 0:
                        if (tee.getStackInSlot(0).getItem() == ItemPhialDNA.block) {
                            this.bindTexture(TEXTURE_CENTRIFUGE_PHIAL_DNA);
                        }
                        else {
                            this.bindTexture(TEXTURE_CENTRIFUGE_PHIAL_EMPTY);
                        }
                        ModelDNARecombinerCentrifugePhial modelDNARecombinerCentrifugePhial = this.modelDNARecombinerCentrifugePhial;
                        GlStateManager.pushMatrix();
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.translate(x + 0.5, y + yy, z + 0.5);
                        GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        if (!(facing == EnumFacing.DOWN || facing == EnumFacing.UP)) {
                            GlStateManager.rotate(facing.rotateY().rotateY().getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
                        }
                        GlStateManager.enableAlpha();
                        modelDNARecombinerCentrifugePhial.phial1pivot.rotateAngleX = (float) -Math.toRadians(flareAngle);
                        modelDNARecombinerCentrifugePhial.phial1pivot.scaleChildren = true;
                        modelDNARecombinerCentrifugePhial.phial1pivot.setScale(0.5F, 0.5F, 0.5F);
                        GlStateManager.rotate(rotateAngle, 0, 1, 0);
                        modelDNARecombinerCentrifugePhial.renderAll(1.25f);
                        GlStateManager.disableAlpha();
                        GlStateManager.popMatrix();
                    }

                    if (!tee.getStackInSlot(1).isEmpty()) {
                        //Render the model in position 1:
                        if (tee.getStackInSlot(1).getItem() == ItemPhialDNA.block) {
                            this.bindTexture(TEXTURE_CENTRIFUGE_PHIAL_DNA);
                        }
                        else {
                            this.bindTexture(TEXTURE_CENTRIFUGE_PHIAL_EMPTY);
                        }
                        ModelDNARecombinerCentrifugePhial modelDNARecombinerCentrifugePhial = this.modelDNARecombinerCentrifugePhial;
                        GlStateManager.pushMatrix();
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.translate(x + 0.5, y + yy, z + 0.5);
                        GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        if (!(facing == EnumFacing.DOWN || facing == EnumFacing.UP)) {
                            GlStateManager.rotate(facing.rotateY().getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
                        }
                        GlStateManager.enableAlpha();
                        modelDNARecombinerCentrifugePhial.phial1pivot.rotateAngleX = (float) -Math.toRadians(flareAngle);
                        modelDNARecombinerCentrifugePhial.phial1pivot.scaleChildren = true;
                        modelDNARecombinerCentrifugePhial.phial1pivot.setScale(0.5F, 0.5F, 0.5F);
                        GlStateManager.rotate(rotateAngle, 0, 1, 0);
                        modelDNARecombinerCentrifugePhial.renderAll(1.25f);
                        GlStateManager.disableAlpha();
                        GlStateManager.popMatrix();
                    }

                    if (!tee.getStackInSlot(2).isEmpty()) {
                        //Render the model in position 2:
                        if (tee.getStackInSlot(2).getItem() == ItemPhialDNA.block) {
                            this.bindTexture(TEXTURE_CENTRIFUGE_PHIAL_DNA);
                        }
                        else {
                            this.bindTexture(TEXTURE_CENTRIFUGE_PHIAL_EMPTY);
                        }
                        ModelDNARecombinerCentrifugePhial modelDNARecombinerCentrifugePhial = this.modelDNARecombinerCentrifugePhial;
                        GlStateManager.pushMatrix();
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.translate(x + 0.5, y + yy, z + 0.5);
                        GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        if (!(facing == EnumFacing.DOWN || facing == EnumFacing.UP)) {
                            GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
                        }
                        GlStateManager.enableAlpha();
                        modelDNARecombinerCentrifugePhial.phial1pivot.rotateAngleX = (float) -Math.toRadians(flareAngle);
                        modelDNARecombinerCentrifugePhial.phial1pivot.scaleChildren = true;
                        modelDNARecombinerCentrifugePhial.phial1pivot.setScale(0.5F, 0.5F, 0.5F);
                        GlStateManager.rotate(rotateAngle, 0, 1, 0);
                        modelDNARecombinerCentrifugePhial.renderAll(1.25f);
                        GlStateManager.disableAlpha();
                        GlStateManager.popMatrix();
                    }

                    if (!tee.getStackInSlot(3).isEmpty()) {
                        //Render the model in position 3:
                        if (tee.getStackInSlot(3).getItem() == ItemPhialDNA.block) {
                            this.bindTexture(TEXTURE_CENTRIFUGE_PHIAL_DNA);
                        }
                        else {
                            this.bindTexture(TEXTURE_CENTRIFUGE_PHIAL_EMPTY);
                        }
                        ModelDNARecombinerCentrifugePhial modelDNARecombinerCentrifugePhial = this.modelDNARecombinerCentrifugePhial;
                        GlStateManager.pushMatrix();
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.translate(x + 0.5, y + yy, z + 0.5);
                        GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        if (!(facing == EnumFacing.DOWN || facing == EnumFacing.UP)) {
                            GlStateManager.rotate(facing.rotateY().rotateY().rotateY().getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
                        }
                        GlStateManager.enableAlpha();
                        modelDNARecombinerCentrifugePhial.phial1pivot.rotateAngleX = (float) -Math.toRadians(flareAngle);
                        modelDNARecombinerCentrifugePhial.phial1pivot.scaleChildren = true;
                        modelDNARecombinerCentrifugePhial.phial1pivot.setScale(0.5F, 0.5F, 0.5F);
                        GlStateManager.rotate(rotateAngle, 0, 1, 0);
                        modelDNARecombinerCentrifugePhial.renderAll(1.25f);
                        GlStateManager.disableAlpha();
                        GlStateManager.popMatrix();
                    }
                }
            }
        }
    }
}