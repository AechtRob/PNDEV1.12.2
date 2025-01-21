package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelHapsidophyllas extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer frondmain9;
    private final AdvancedModelRenderer frond26;
    private final AdvancedModelRenderer frond27;
    private final AdvancedModelRenderer frond28;
    private final AdvancedModelRenderer frondmain8;
    private final AdvancedModelRenderer frond23;
    private final AdvancedModelRenderer frond24;
    private final AdvancedModelRenderer frond25;
    private final AdvancedModelRenderer frondmain7;
    private final AdvancedModelRenderer frond20;
    private final AdvancedModelRenderer frond21;
    private final AdvancedModelRenderer frond22;
    private final AdvancedModelRenderer frondmain6;
    private final AdvancedModelRenderer frond17;
    private final AdvancedModelRenderer frond18;
    private final AdvancedModelRenderer frond19;
    private final AdvancedModelRenderer frondmain5;
    private final AdvancedModelRenderer frond14;
    private final AdvancedModelRenderer frond15;
    private final AdvancedModelRenderer frond16;
    private final AdvancedModelRenderer frondmain4;
    private final AdvancedModelRenderer frond11;
    private final AdvancedModelRenderer frond12;
    private final AdvancedModelRenderer frond13;
    private final AdvancedModelRenderer frondmain3;
    private final AdvancedModelRenderer frond5;
    private final AdvancedModelRenderer frond9;
    private final AdvancedModelRenderer frond10;
    private final AdvancedModelRenderer frondmain2;
    private final AdvancedModelRenderer frond6;
    private final AdvancedModelRenderer frond7;
    private final AdvancedModelRenderer frond8;
    private final AdvancedModelRenderer frondmain1;
    private final AdvancedModelRenderer frond2;
    private final AdvancedModelRenderer frond3;
    private final AdvancedModelRenderer frond4;

    public ModelHapsidophyllas() {
        textureWidth = 32;
        textureHeight = 16;

        bone = new AdvancedModelRenderer(this);
        bone.setRotationPoint(6.0F, 24.0F, -7.0F);
        bone.cubeList.add(new ModelBox(bone, 9, 2, -7.0F, -1.0F, 2.0F, 1, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 17, 2, -7.5F, -1.01F, 3.0F, 1, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -7.01F, -1.0F, 4.0F, 1, 1, 7, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 17, 0, -7.5F, -1.01F, 11.0F, 1, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 9, 4, -8.0F, -1.0F, 10.99F, 1, 1, 2, 0.0F, false));

        frondmain9 = new AdvancedModelRenderer(this);
        frondmain9.setRotationPoint(-7.0F, -0.5F, 13.0F);
        bone.addChild(frondmain9);
        setRotateAngle(frondmain9, 0.0F, 0.0F, 1.4835F);
        frondmain9.cubeList.add(new ModelBox(frondmain9, 9, 0, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        frond26 = new AdvancedModelRenderer(this);
        frond26.setRotationPoint(0.0F, -1.0F, 0.0F);
        frondmain9.addChild(frond26);
        frond26.cubeList.add(new ModelBox(frond26, 0, 0, -0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        frond27 = new AdvancedModelRenderer(this);
        frond27.setRotationPoint(0.0F, -2.0F, 0.0F);
        frond26.addChild(frond27);
        frond27.cubeList.add(new ModelBox(frond27, 20, 4, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        frond28 = new AdvancedModelRenderer(this);
        frond28.setRotationPoint(0.0F, -2.0F, 0.0F);
        frond27.addChild(frond28);
        frond28.cubeList.add(new ModelBox(frond28, 13, 2, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        frondmain8 = new AdvancedModelRenderer(this);
        frondmain8.setRotationPoint(-7.0F, -0.5F, 13.0F);
        bone.addChild(frondmain8);
        setRotateAngle(frondmain8, 0.4363F, 2.4435F, -0.6981F);
        frondmain8.cubeList.add(new ModelBox(frondmain8, 9, 0, 0.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        frond23 = new AdvancedModelRenderer(this);
        frond23.setRotationPoint(0.5F, -1.0F, 0.0F);
        frondmain8.addChild(frond23);
        frond23.cubeList.add(new ModelBox(frond23, 0, 4, -1.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F, false));

        frond24 = new AdvancedModelRenderer(this);
        frond24.setRotationPoint(0.0F, -2.0F, 0.0F);
        frond23.addChild(frond24);
        frond24.cubeList.add(new ModelBox(frond24, 16, 6, -1.0F, -2.0F, 0.0F, 2, 2, 0, 0.0F, false));

        frond25 = new AdvancedModelRenderer(this);
        frond25.setRotationPoint(0.0F, -2.0F, 0.0F);
        frond24.addChild(frond25);
        frond25.cubeList.add(new ModelBox(frond25, 17, 4, -1.0F, -2.0F, 0.0F, 2, 2, 0, 0.0F, false));

        frondmain7 = new AdvancedModelRenderer(this);
        frondmain7.setRotationPoint(-6.0F, -0.5F, 2.0F);
        bone.addChild(frondmain7);
        setRotateAngle(frondmain7, 0.7854F, 0.3491F, 1.3963F);
        frondmain7.cubeList.add(new ModelBox(frondmain7, 13, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        frond20 = new AdvancedModelRenderer(this);
        frond20.setRotationPoint(0.0F, -0.5F, 0.0F);
        frondmain7.addChild(frond20);
        frond20.cubeList.add(new ModelBox(frond20, 0, 0, -0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        frond21 = new AdvancedModelRenderer(this);
        frond21.setRotationPoint(0.0F, -1.5F, 0.0F);
        frond20.addChild(frond21);
        frond21.cubeList.add(new ModelBox(frond21, 20, 4, 0.0F, -2.5F, -1.0F, 0, 2, 2, 0.0F, false));

        frond22 = new AdvancedModelRenderer(this);
        frond22.setRotationPoint(0.0F, -2.5F, 0.0F);
        frond21.addChild(frond22);
        frond22.cubeList.add(new ModelBox(frond22, 13, 2, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        frondmain6 = new AdvancedModelRenderer(this);
        frondmain6.setRotationPoint(-6.0F, -0.5F, 10.0F);
        bone.addChild(frondmain6);
        setRotateAngle(frondmain6, 0.0F, 0.0F, 1.1345F);
        frondmain6.cubeList.add(new ModelBox(frondmain6, 13, 2, -0.5F, -1.0F, -6.0F, 1, 1, 1, 0.0F, false));

        frond17 = new AdvancedModelRenderer(this);
        frond17.setRotationPoint(0.0F, -1.0F, -5.5F);
        frondmain6.addChild(frond17);
        frond17.cubeList.add(new ModelBox(frond17, 0, 0, -0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        frond18 = new AdvancedModelRenderer(this);
        frond18.setRotationPoint(0.0F, -1.5F, 0.0F);
        frond17.addChild(frond18);
        frond18.cubeList.add(new ModelBox(frond18, 20, 4, 0.0F, -2.5F, -1.0F, 0, 2, 2, 0.0F, false));

        frond19 = new AdvancedModelRenderer(this);
        frond19.setRotationPoint(0.0F, -2.5F, 0.0F);
        frond18.addChild(frond19);
        frond19.cubeList.add(new ModelBox(frond19, 13, 2, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        frondmain5 = new AdvancedModelRenderer(this);
        frondmain5.setRotationPoint(-7.0F, -0.5F, 10.0F);
        bone.addChild(frondmain5);
        setRotateAngle(frondmain5, 0.0F, 0.0F, -1.0036F);
        frondmain5.cubeList.add(new ModelBox(frondmain5, 9, 0, -0.5F, -1.0F, -7.01F, 1, 1, 1, 0.0F, false));

        frond14 = new AdvancedModelRenderer(this);
        frond14.setRotationPoint(0.0F, -1.0F, -6.5F);
        frondmain5.addChild(frond14);
        frond14.cubeList.add(new ModelBox(frond14, 0, 0, -0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        frond15 = new AdvancedModelRenderer(this);
        frond15.setRotationPoint(0.0F, -2.0F, 0.0F);
        frond14.addChild(frond15);
        frond15.cubeList.add(new ModelBox(frond15, 16, 4, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        frond16 = new AdvancedModelRenderer(this);
        frond16.setRotationPoint(0.0F, -2.0F, 0.0F);
        frond15.addChild(frond16);
        frond16.cubeList.add(new ModelBox(frond16, 17, 2, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        frondmain4 = new AdvancedModelRenderer(this);
        frondmain4.setRotationPoint(-6.0F, -0.5F, 10.0F);
        bone.addChild(frondmain4);
        setRotateAngle(frondmain4, 0.0F, 0.0F, 0.8727F);
        frondmain4.cubeList.add(new ModelBox(frondmain4, 9, 0, -1.0F, -1.0F, -3.5F, 1, 1, 1, 0.0F, false));

        frond11 = new AdvancedModelRenderer(this);
        frond11.setRotationPoint(-0.5F, -1.0F, -3.0F);
        frondmain4.addChild(frond11);
        frond11.cubeList.add(new ModelBox(frond11, 0, 0, -0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        frond12 = new AdvancedModelRenderer(this);
        frond12.setRotationPoint(0.0F, -2.0F, 0.0F);
        frond11.addChild(frond12);
        frond12.cubeList.add(new ModelBox(frond12, 20, 4, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        frond13 = new AdvancedModelRenderer(this);
        frond13.setRotationPoint(0.0F, -2.0F, 0.0F);
        frond12.addChild(frond13);
        frond13.cubeList.add(new ModelBox(frond13, 13, 2, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        frondmain3 = new AdvancedModelRenderer(this);
        frondmain3.setRotationPoint(-6.0F, -0.5F, 10.0F);
        bone.addChild(frondmain3);
        setRotateAngle(frondmain3, 0.0F, 0.0F, -0.5672F);
        frondmain3.cubeList.add(new ModelBox(frondmain3, 9, 0, -1.0F, -1.0F, -3.5F, 1, 1, 1, 0.0F, false));

        frond5 = new AdvancedModelRenderer(this);
        frond5.setRotationPoint(-0.5F, -1.0F, -3.0F);
        frondmain3.addChild(frond5);
        frond5.cubeList.add(new ModelBox(frond5, 0, 0, -0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        frond9 = new AdvancedModelRenderer(this);
        frond9.setRotationPoint(0.0F, -2.0F, 0.0F);
        frond5.addChild(frond9);
        frond9.cubeList.add(new ModelBox(frond9, 16, 4, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        frond10 = new AdvancedModelRenderer(this);
        frond10.setRotationPoint(0.0F, -2.0F, 0.0F);
        frond9.addChild(frond10);
        frond10.cubeList.add(new ModelBox(frond10, 17, 2, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        frondmain2 = new AdvancedModelRenderer(this);
        frondmain2.setRotationPoint(-6.0F, -0.5F, 10.0F);
        bone.addChild(frondmain2);
        setRotateAngle(frondmain2, 0.0F, 0.0F, -0.6545F);
        frondmain2.cubeList.add(new ModelBox(frondmain2, 9, 0, -1.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        frond6 = new AdvancedModelRenderer(this);
        frond6.setRotationPoint(-0.5F, -1.0F, 0.0F);
        frondmain2.addChild(frond6);
        frond6.cubeList.add(new ModelBox(frond6, 0, 0, -0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        frond7 = new AdvancedModelRenderer(this);
        frond7.setRotationPoint(0.0F, -2.0F, 0.0F);
        frond6.addChild(frond7);
        frond7.cubeList.add(new ModelBox(frond7, 16, 4, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        frond8 = new AdvancedModelRenderer(this);
        frond8.setRotationPoint(0.0F, -2.0F, 0.0F);
        frond7.addChild(frond8);
        frond8.cubeList.add(new ModelBox(frond8, 17, 2, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        frondmain1 = new AdvancedModelRenderer(this);
        frondmain1.setRotationPoint(-6.0F, -0.5F, 10.0F);
        bone.addChild(frondmain1);
        setRotateAngle(frondmain1, 0.0F, 0.0F, 0.7418F);
        frondmain1.cubeList.add(new ModelBox(frondmain1, 9, 0, -1.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        frond2 = new AdvancedModelRenderer(this);
        frond2.setRotationPoint(-0.5F, -1.0F, 0.0F);
        frondmain1.addChild(frond2);
        frond2.cubeList.add(new ModelBox(frond2, 0, 0, -0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        frond3 = new AdvancedModelRenderer(this);
        frond3.setRotationPoint(0.0F, -2.0F, 0.0F);
        frond2.addChild(frond3);
        frond3.cubeList.add(new ModelBox(frond3, 20, 4, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        frond4 = new AdvancedModelRenderer(this);
        frond4.setRotationPoint(0.0F, -2.0F, 0.0F);
        frond3.addChild(frond4);
        frond4.cubeList.add(new ModelBox(frond4, 13, 2, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        AdvancedModelRenderer[] frondA = {this.frond2,this.frond3,this.frond4};
        AdvancedModelRenderer[] frondB = {this.frond6,this.frond7,this.frond8};
        AdvancedModelRenderer[] frondC = {this.frond5,this.frond9,this.frond10};
        AdvancedModelRenderer[] frondD = {this.frond11,this.frond12,this.frond13};
        AdvancedModelRenderer[] frondE = {this.frond14,this.frond15,this.frond16};
        AdvancedModelRenderer[] frondF = {this.frond17,this.frond18,this.frond19};
        AdvancedModelRenderer[] frondG = {this.frond20,this.frond21,this.frond22};
        AdvancedModelRenderer[] frondH = {this.frond23,this.frond24,this.frond25};
        AdvancedModelRenderer[] frondI = {this.frond26,this.frond27,this.frond28};
        float speed = 0.091F;
        this.chainWave(frondA, speed, 0.10F, 2, f, 0.32F);
        this.chainWave(frondB, speed * 0.095F, 0.08F, 2.5, f, 0.28F);
        this.chainWave(frondC, speed, 0.09F, 2.1, f, 0.4F);
        this.chainWave(frondD, speed * 1.084F, 0.095F, 1.8, f, 0.38F);
        this.chainWave(frondE, speed * 0.095F, 0.068F, 1.3, f, 0.29F);
        this.chainWave(frondF, speed * 1.084F, 0.11F, 2, f, 0.32F);
        this.chainWave(frondG, speed, 0.13F, 2.1, f, 0.38F);
        this.chainWave(frondH, speed * 0.095F, 0.095F, 1.6, f, 0.28F);
        this.chainWave(frondI, speed, 0.086F, 1.2, f, 0.32F);

        this.chainSwing(frondA, speed * 1.084F, 0.20F, 2, f, 0.32F);
        this.chainSwing(frondB, speed, 0.16F, 2.5, f, 0.28F);
        this.chainSwing(frondC, speed, 0.18F, 2.1, f, 0.4F);
        this.chainSwing(frondD, speed * 0.095F, 0.19F, 1.8, f, 0.38F);
        this.chainSwing(frondE, speed, 0.136F, 1.3, f, 0.29F);
        this.chainSwing(frondF, speed, 0.22F, 2, f, 0.32F);
        this.chainSwing(frondG, speed * 0.095F, 0.26F, 2.1, f, 0.38F);
        this.chainSwing(frondH, speed * 0.095F, 0.19F, 1.6, f, 0.28F);
        this.chainSwing(frondI, speed * 1.084F, 0.174F, 1.2, f, 0.32F);

        this.bone.render(0.1f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
