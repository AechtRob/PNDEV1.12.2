package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelElrathia extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer antennaR;

    public ModelElrathia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.5F, 2.0F);
        this.body.cubeList.add(new ModelBox(body, 19, 2, -2.0F, -1.0F, 2.0F, 4, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 16, 16, -3.5F, -1.0F, -6.0F, 7, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 14, -3.5F, -1.25F, -6.0F, 7, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 19, 0, -2.5F, -1.0F, -7.0F, 5, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 19, -2.49F, -1.15F, -6.9F, 5, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 9, 19, -1.0F, -1.4F, -6.99F, 2, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -1.0F, -4.0F, 7, 1, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 6, -0.99F, -1.25F, -4.01F, 2, 1, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 17, -3.0F, -1.0F, 1.0F, 6, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.5F, 0.0F, -7.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 20, -0.1F, -1.1F, 1.5F, 1, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.5F, 0.0F, -7.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 8, 0.65F, -1.2F, -0.75F, 1, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(3.5F, 0.0F, -7.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.7854F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 19, -1.65F, -1.2F, -0.75F, 1, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.5F, 0.0F, -7.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 21, -0.9F, -1.1F, 1.5F, 1, 1, 2, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.5F, 0.0F, -6.5F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.3491F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 13, 11, 0.0F, 0.01F, -5.0F, 5, 0, 5, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.75F, 0.0F, -5.25F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.0F, 0.1745F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 6, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.75F, 0.0F, -3.5F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.1745F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 6, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.75F, 0.0F, -1.75F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.1745F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 6, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.1745F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 6, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.25F, 0.0F, 1.75F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, 0.1745F);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 6, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.75F, 0.0F, -5.25F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.0F, -0.1745F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 7, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.75F, 0.0F, -3.5F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.1745F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 7, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.75F, 0.0F, -1.75F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, -0.1745F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 7, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, -0.1745F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 7, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.25F, 0.0F, 1.75F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, -0.1745F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 7, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.5F, 0.0F, -6.5F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.3491F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 6, 6, -5.0F, 0.01F, -5.0F, 5, 0, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.2F);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.body.render(0.013F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body.offsetY = 1.2F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5};

        if (isAtBottom) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
            this.flap(legL, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legR5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.bob(body, 0.0F, 0.0F, false, f2, 1);
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(legL, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.2F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.2F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL4, 0.2F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR4, 0.2F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL5, 0.2F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legR5, 0.2F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.bob(body, 0.2F, 0.2F, false, f2, 1);
        }

        this.swing(antennaL, 0.38F, -0.3F, false, 0, -0.15F, f2, 0.8F);
        this.swing(antennaR, 0.38F, 0.3F, false, 0, 0.15F, f2, 0.8F);

    }
}
