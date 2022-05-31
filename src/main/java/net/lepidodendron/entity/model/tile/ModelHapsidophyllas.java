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
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(6.0F, 24.0F, -7.0F);
        this.bone.cubeList.add(new ModelBox(bone, 8, 12, -7.0F, -1.0F, 2.0F, 1, 1, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 12, 14, -7.5F, -1.01F, 3.0F, 1, 1, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 8, -7.01F, -1.0F, 4.0F, 1, 1, 7, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 12, 14, -7.5F, -1.01F, 11.0F, 1, 1, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 4, 10, -8.0F, -1.0F, 10.99F, 1, 1, 2, 0.0F, false));

        this.frondmain9 = new AdvancedModelRenderer(this);
        this.frondmain9.setRotationPoint(-7.0F, -0.5F, 13.0F);
        this.bone.addChild(frondmain9);
        this.setRotateAngle(frondmain9, 0.0F, 0.0F, 1.4835F);
        this.frondmain9.cubeList.add(new ModelBox(frondmain9, 8, 0, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.frond26 = new AdvancedModelRenderer(this);
        this.frond26.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frondmain9.addChild(frond26);
        this.frond26.cubeList.add(new ModelBox(frond26, 8, 4, -0.5F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));
        this.frond26.cubeList.add(new ModelBox(frond26, 8, 5, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.frond27 = new AdvancedModelRenderer(this);
        this.frond27.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.frond26.addChild(frond27);
        this.frond27.cubeList.add(new ModelBox(frond27, 0, 4, 0.0F, -2.0F, -1.0F, 0, 1, 2, 0.0F, false));
        this.frond27.cubeList.add(new ModelBox(frond27, 0, 5, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.frond28 = new AdvancedModelRenderer(this);
        this.frond28.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.frond27.addChild(frond28);
        this.frond28.cubeList.add(new ModelBox(frond28, 0, 0, 0.0F, -2.0F, -1.0F, 0, 1, 2, 0.0F, false));
        this.frond28.cubeList.add(new ModelBox(frond28, 0, 2, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.frondmain8 = new AdvancedModelRenderer(this);
        this.frondmain8.setRotationPoint(-7.0F, -0.5F, 13.0F);
        this.bone.addChild(frondmain8);
        this.setRotateAngle(frondmain8, 0.4363F, 2.4435F, -0.6981F);
        this.frondmain8.cubeList.add(new ModelBox(frondmain8, 8, 0, 0.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.frond23 = new AdvancedModelRenderer(this);
        this.frond23.setRotationPoint(0.5F, -1.0F, 0.0F);
        this.frondmain8.addChild(frond23);
        this.frond23.cubeList.add(new ModelBox(frond23, 8, 4, -1.0F, -2.0F, -0.5F, 2, 1, 1, 0.0F, false));
        this.frond23.cubeList.add(new ModelBox(frond23, 8, 5, -1.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F, false));

        this.frond24 = new AdvancedModelRenderer(this);
        this.frond24.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.frond23.addChild(frond24);
        this.frond24.cubeList.add(new ModelBox(frond24, 0, 4, -1.0F, -2.0F, 0.0F, 2, 1, 0, 0.0F, false));
        this.frond24.cubeList.add(new ModelBox(frond24, 0, 5, -1.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.frond25 = new AdvancedModelRenderer(this);
        this.frond25.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.frond24.addChild(frond25);
        this.frond25.cubeList.add(new ModelBox(frond25, 0, 2, -1.0F, -2.0F, 0.0F, 2, 1, 0, 0.0F, false));
        this.frond25.cubeList.add(new ModelBox(frond25, 0, 3, -1.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.frondmain7 = new AdvancedModelRenderer(this);
        this.frondmain7.setRotationPoint(-6.0F, -0.5F, 2.0F);
        this.bone.addChild(frondmain7);
        this.setRotateAngle(frondmain7, 0.7854F, 0.3491F, 1.3963F);
        this.frondmain7.cubeList.add(new ModelBox(frondmain7, 8, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.frond20 = new AdvancedModelRenderer(this);
        this.frond20.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.frondmain7.addChild(frond20);
        this.frond20.cubeList.add(new ModelBox(frond20, 8, 4, -0.5F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));
        this.frond20.cubeList.add(new ModelBox(frond20, 8, 5, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.frond21 = new AdvancedModelRenderer(this);
        this.frond21.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.frond20.addChild(frond21);
        this.frond21.cubeList.add(new ModelBox(frond21, 0, 4, 0.0F, -2.5F, -1.0F, 0, 1, 2, 0.0F, false));
        this.frond21.cubeList.add(new ModelBox(frond21, 0, 5, 0.0F, -1.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.frond22 = new AdvancedModelRenderer(this);
        this.frond22.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.frond21.addChild(frond22);
        this.frond22.cubeList.add(new ModelBox(frond22, 0, 0, 0.0F, -2.0F, -1.0F, 0, 1, 2, 0.0F, false));
        this.frond22.cubeList.add(new ModelBox(frond22, 0, 2, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.frondmain6 = new AdvancedModelRenderer(this);
        this.frondmain6.setRotationPoint(-6.0F, -0.5F, 10.0F);
        this.bone.addChild(frondmain6);
        this.setRotateAngle(frondmain6, 0.0F, 0.0F, 1.1345F);
        this.frondmain6.cubeList.add(new ModelBox(frondmain6, 8, 0, -0.5F, -1.0F, -6.0F, 1, 1, 1, 0.0F, false));

        this.frond17 = new AdvancedModelRenderer(this);
        this.frond17.setRotationPoint(0.0F, -1.0F, -5.5F);
        this.frondmain6.addChild(frond17);
        this.frond17.cubeList.add(new ModelBox(frond17, 8, 4, -0.5F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));
        this.frond17.cubeList.add(new ModelBox(frond17, 8, 5, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.frond18 = new AdvancedModelRenderer(this);
        this.frond18.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.frond17.addChild(frond18);
        this.frond18.cubeList.add(new ModelBox(frond18, 0, 4, 0.0F, -2.5F, -1.0F, 0, 1, 2, 0.0F, false));
        this.frond18.cubeList.add(new ModelBox(frond18, 0, 5, 0.0F, -1.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.frond19 = new AdvancedModelRenderer(this);
        this.frond19.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.frond18.addChild(frond19);
        this.frond19.cubeList.add(new ModelBox(frond19, 0, 0, 0.0F, -2.0F, -1.0F, 0, 1, 2, 0.0F, false));
        this.frond19.cubeList.add(new ModelBox(frond19, 0, 2, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.frondmain5 = new AdvancedModelRenderer(this);
        this.frondmain5.setRotationPoint(-7.0F, -0.5F, 10.0F);
        this.bone.addChild(frondmain5);
        this.setRotateAngle(frondmain5, 0.0F, 0.0F, -1.0036F);
        this.frondmain5.cubeList.add(new ModelBox(frondmain5, 8, 0, -0.5F, -1.0F, -7.01F, 1, 1, 1, 0.0F, false));

        this.frond14 = new AdvancedModelRenderer(this);
        this.frond14.setRotationPoint(0.0F, -1.0F, -6.5F);
        this.frondmain5.addChild(frond14);
        this.frond14.cubeList.add(new ModelBox(frond14, 8, 4, -0.5F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));
        this.frond14.cubeList.add(new ModelBox(frond14, 8, 5, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.frond15 = new AdvancedModelRenderer(this);
        this.frond15.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.frond14.addChild(frond15);
        this.frond15.cubeList.add(new ModelBox(frond15, 0, 4, 0.0F, -2.0F, -1.0F, 0, 1, 2, 0.0F, false));
        this.frond15.cubeList.add(new ModelBox(frond15, 0, 5, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.frond16 = new AdvancedModelRenderer(this);
        this.frond16.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.frond15.addChild(frond16);
        this.frond16.cubeList.add(new ModelBox(frond16, 0, 0, 0.0F, -2.0F, -1.0F, 0, 1, 2, 0.0F, false));
        this.frond16.cubeList.add(new ModelBox(frond16, 0, 2, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.frondmain4 = new AdvancedModelRenderer(this);
        this.frondmain4.setRotationPoint(-6.0F, -0.5F, 10.0F);
        this.bone.addChild(frondmain4);
        this.setRotateAngle(frondmain4, 0.0F, 0.0F, 0.8727F);
        this.frondmain4.cubeList.add(new ModelBox(frondmain4, 8, 0, -1.0F, -1.0F, -3.5F, 1, 1, 1, 0.0F, false));

        this.frond11 = new AdvancedModelRenderer(this);
        this.frond11.setRotationPoint(-0.5F, -1.0F, -3.0F);
        this.frondmain4.addChild(frond11);
        this.frond11.cubeList.add(new ModelBox(frond11, 8, 4, -0.5F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));
        this.frond11.cubeList.add(new ModelBox(frond11, 8, 5, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.frond12 = new AdvancedModelRenderer(this);
        this.frond12.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.frond11.addChild(frond12);
        this.frond12.cubeList.add(new ModelBox(frond12, 0, 4, 0.0F, -2.0F, -1.0F, 0, 1, 2, 0.0F, false));
        this.frond12.cubeList.add(new ModelBox(frond12, 0, 5, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.frond13 = new AdvancedModelRenderer(this);
        this.frond13.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.frond12.addChild(frond13);
        this.frond13.cubeList.add(new ModelBox(frond13, 0, 0, 0.0F, -2.0F, -1.0F, 0, 1, 2, 0.0F, false));
        this.frond13.cubeList.add(new ModelBox(frond13, 0, 2, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.frondmain3 = new AdvancedModelRenderer(this);
        this.frondmain3.setRotationPoint(-6.0F, -0.5F, 10.0F);
        this.bone.addChild(frondmain3);
        this.setRotateAngle(frondmain3, 0.0F, 0.0F, -0.5672F);
        this.frondmain3.cubeList.add(new ModelBox(frondmain3, 8, 0, -1.0F, -1.0F, -3.5F, 1, 1, 1, 0.0F, false));

        this.frond5 = new AdvancedModelRenderer(this);
        this.frond5.setRotationPoint(-0.5F, -1.0F, -3.0F);
        this.frondmain3.addChild(frond5);
        this.frond5.cubeList.add(new ModelBox(frond5, 8, 4, -0.5F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));
        this.frond5.cubeList.add(new ModelBox(frond5, 8, 5, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.frond9 = new AdvancedModelRenderer(this);
        this.frond9.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.frond5.addChild(frond9);
        this.frond9.cubeList.add(new ModelBox(frond9, 0, 4, 0.0F, -2.0F, -1.0F, 0, 1, 2, 0.0F, false));
        this.frond9.cubeList.add(new ModelBox(frond9, 0, 5, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.frond10 = new AdvancedModelRenderer(this);
        this.frond10.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.frond9.addChild(frond10);
        this.frond10.cubeList.add(new ModelBox(frond10, 0, 0, 0.0F, -2.0F, -1.0F, 0, 1, 2, 0.0F, false));
        this.frond10.cubeList.add(new ModelBox(frond10, 0, 2, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.frondmain2 = new AdvancedModelRenderer(this);
        this.frondmain2.setRotationPoint(-6.0F, -0.5F, 10.0F);
        this.bone.addChild(frondmain2);
        this.setRotateAngle(frondmain2, 0.0F, 0.0F, -0.6545F);
        this.frondmain2.cubeList.add(new ModelBox(frondmain2, 8, 0, -1.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.frond6 = new AdvancedModelRenderer(this);
        this.frond6.setRotationPoint(-0.5F, -1.0F, 0.0F);
        this.frondmain2.addChild(frond6);
        this.frond6.cubeList.add(new ModelBox(frond6, 8, 4, -0.5F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));
        this.frond6.cubeList.add(new ModelBox(frond6, 8, 5, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.frond7 = new AdvancedModelRenderer(this);
        this.frond7.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.frond6.addChild(frond7);
        this.frond7.cubeList.add(new ModelBox(frond7, 0, 4, 0.0F, -2.0F, -1.0F, 0, 1, 2, 0.0F, false));
        this.frond7.cubeList.add(new ModelBox(frond7, 0, 5, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.frond8 = new AdvancedModelRenderer(this);
        this.frond8.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.frond7.addChild(frond8);
        this.frond8.cubeList.add(new ModelBox(frond8, 0, 0, 0.0F, -2.0F, -1.0F, 0, 1, 2, 0.0F, false));
        this.frond8.cubeList.add(new ModelBox(frond8, 0, 2, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.frondmain1 = new AdvancedModelRenderer(this);
        this.frondmain1.setRotationPoint(-6.0F, -0.5F, 10.0F);
        this.bone.addChild(frondmain1);
        this.setRotateAngle(frondmain1, 0.0F, 0.0F, 0.7418F);
        this.frondmain1.cubeList.add(new ModelBox(frondmain1, 8, 0, -1.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.frond2 = new AdvancedModelRenderer(this);
        this.frond2.setRotationPoint(-0.5F, -1.0F, 0.0F);
        this.frondmain1.addChild(frond2);
        this.frond2.cubeList.add(new ModelBox(frond2, 8, 4, -0.5F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));
        this.frond2.cubeList.add(new ModelBox(frond2, 8, 5, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.frond3 = new AdvancedModelRenderer(this);
        this.frond3.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.frond2.addChild(frond3);
        this.frond3.cubeList.add(new ModelBox(frond3, 0, 4, 0.0F, -2.0F, -1.0F, 0, 1, 2, 0.0F, false));
        this.frond3.cubeList.add(new ModelBox(frond3, 0, 5, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.frond4 = new AdvancedModelRenderer(this);
        this.frond4.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.frond3.addChild(frond4);
        this.frond4.cubeList.add(new ModelBox(frond4, 0, 0, 0.0F, -2.0F, -1.0F, 0, 1, 2, 0.0F, false));
        this.frond4.cubeList.add(new ModelBox(frond4, 0, 2, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

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
