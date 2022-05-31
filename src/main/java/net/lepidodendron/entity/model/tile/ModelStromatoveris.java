package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelStromatoveris extends AdvancedModelBase {
    private final AdvancedModelRenderer stem;
    private final AdvancedModelRenderer stem1;
    private final AdvancedModelRenderer leaf1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leaf2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leaf3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leaf4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;

    public ModelStromatoveris() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.stem = new AdvancedModelRenderer(this);
        this.stem.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.stem.cubeList.add(new ModelBox(stem, 0, 0, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.stem1 = new AdvancedModelRenderer(this);
        this.stem1.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.stem.addChild(stem1);
        this.stem1.cubeList.add(new ModelBox(stem1, 22, 22, -0.99F, -3.0F, -1.01F, 2, 3, 2, 0.0F, false));

        this.leaf1 = new AdvancedModelRenderer(this);
        this.leaf1.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.stem1.addChild(leaf1);
        this.leaf1.cubeList.add(new ModelBox(leaf1, 14, 23, 0.0F, -4.0F, -0.5F, 0, 4, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -3.0F, -0.5F);
        this.leaf1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.6581F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 8, 0.0F, -1.0F, -3.25F, 0, 4, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -3.0F, 0.5F);
        this.leaf1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.6581F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 12, 0.0F, -1.0F, -0.755F, 0, 4, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -3.0F, -0.5F);
        this.leaf1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.5236F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 16, 0.25F, -1.0F, -3.5F, 0, 4, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -3.0F, 0.5F);
        this.leaf1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.5236F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 20, 0.245F, -1.0F, -0.5F, 0, 4, 4, 0.0F, false));

        this.leaf2 = new AdvancedModelRenderer(this);
        this.leaf2.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.leaf1.addChild(leaf2);
        this.leaf2.cubeList.add(new ModelBox(leaf2, 12, 23, -0.005F, -4.0F, -0.5F, 0, 4, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -3.0F, -0.5F);
        this.leaf2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -1.6581F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 16, 0.0F, -1.0F, -3.255F, 0, 4, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -3.0F, 0.5F);
        this.leaf2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 1.6581F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 0, 0.0F, -1.0F, -0.75F, 0, 4, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -3.0F, -0.5F);
        this.leaf2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.5236F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 4, 0.245F, -1.0F, -3.5F, 0, 4, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -3.0F, 0.5F);
        this.leaf2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.5236F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 16, 0.25F, -1.0F, -0.5F, 0, 4, 4, 0.0F, false));

        this.leaf3 = new AdvancedModelRenderer(this);
        this.leaf3.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.leaf2.addChild(leaf3);
        this.leaf3.cubeList.add(new ModelBox(leaf3, 10, 23, 0.0F, -4.0F, -0.5F, 0, 4, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -3.0F, -0.5F);
        this.leaf3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -1.6581F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 4, 0.0F, -1.0F, -3.25F, 0, 4, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -3.0F, 0.5F);
        this.leaf3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 1.6581F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 8, 0.0F, -1.0F, -0.755F, 0, 4, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -3.0F, -0.5F);
        this.leaf3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.5236F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 12, 0.25F, -1.0F, -3.5F, 0, 4, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -3.0F, 0.5F);
        this.leaf3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.5236F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 12, 0.245F, -1.0F, -0.5F, 0, 4, 4, 0.0F, false));

        this.leaf4 = new AdvancedModelRenderer(this);
        this.leaf4.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.leaf3.addChild(leaf4);
        this.leaf4.cubeList.add(new ModelBox(leaf4, 8, 23, -0.005F, -4.0F, -0.5F, 0, 4, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -3.0F, -0.5F);
        this.leaf4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -1.6581F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.0F, -1.0F, -3.255F, 0, 4, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -3.0F, 0.5F);
        this.leaf4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 1.6581F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 4, 0.0F, -1.0F, -0.75F, 0, 4, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -3.0F, -0.5F);
        this.leaf4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.5236F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 8, 0.245F, -1.0F, -3.5F, 0, 4, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -3.0F, 0.5F);
        this.leaf4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.5236F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 8, 0, 0.25F, -1.0F, -0.5F, 0, 4, 4, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.stem.offsetY = 1.85F;
        AdvancedModelRenderer[] bodyFull = {this.stem1,this.leaf1,this.leaf2,this.leaf3,this.leaf4};
        float speed = 0.051F;
        this.chainWave(bodyFull, speed, 0.12F, 2, f, 0.42F);
        this.chainFlap(bodyFull, speed, 0.10F, 1, f, 0.32F);
        this.stem.render(0.024f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
