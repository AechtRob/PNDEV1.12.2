package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockTimeResearcherHopper;
import net.lepidodendron.entity.model.tile.ModelTimeResearcherHopperCrusher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderTimeResearcherHopper extends TileEntitySpecialRenderer<BlockTimeResearcherHopper.TileEntityTimeResearcherHopper> {

    private static final ResourceLocation TEXTURE = new ResourceLocation("lepidodendron:textures/entities/time_researcher_hopper_crusher.png");
    
    private final ModelTimeResearcherHopperCrusher modelTimeResearcherHopperCrusher;

    public RenderTimeResearcherHopper() {
        this.modelTimeResearcherHopperCrusher = new ModelTimeResearcherHopperCrusher();
    }

    @Override
    public void render(BlockTimeResearcherHopper.TileEntityTimeResearcherHopper entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockTimeResearcherHopper.block) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(BlockTimeResearcherHopper.BlockCustom.FACING);
        }
        
        //Crusher:
        double yy = 1.5D;
        float rotation = entity.getCrusherRotation();
        this.bindTexture(TEXTURE);
        ModelTimeResearcherHopperCrusher modelTimeResearcherHopperCrusher = this.modelTimeResearcherHopperCrusher;
        GlStateManager.pushMatrix();
        GlStateManager.enableAlpha();
        GlStateManager.enableRescaleNormal();
        GlStateManager.enableCull();
        GlStateManager.translate(x + 0.5, y + yy, z + 0.5);
        GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        GlStateManager.scale(0.05F, 0.05F, 0.05F);
        if (!(facing == EnumFacing.DOWN || facing == EnumFacing.UP)) {
            GlStateManager.rotate(facing.rotateY().getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        }
        modelTimeResearcherHopperCrusher.grinder1.rotateAngleZ = -(float)Math.toRadians(rotation);
        modelTimeResearcherHopperCrusher.grinder2.rotateAngleZ = (float)Math.toRadians(rotation);
        modelTimeResearcherHopperCrusher.grinder3.rotateAngleZ = (float)Math.toRadians(rotation);
        modelTimeResearcherHopperCrusher.renderAll(1.25f);
        GlStateManager.disableRescaleNormal();
//        GlStateManager.disableAlpha();
        GlStateManager.popMatrix();

    }
}