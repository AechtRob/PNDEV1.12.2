package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelHylaecullulus extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer stem1;
    private final AdvancedModelRenderer stem2;
    private final AdvancedModelRenderer stem3;
    private final AdvancedModelRenderer frondmain1;
    private final AdvancedModelRenderer frond17;
    private final AdvancedModelRenderer frond18;
    private final AdvancedModelRenderer frond19;
    private final AdvancedModelRenderer frondmain2;
    private final AdvancedModelRenderer frond5;
    private final AdvancedModelRenderer frond6;
    private final AdvancedModelRenderer frond7;
    private final AdvancedModelRenderer frondmain3;
    private final AdvancedModelRenderer frond8;
    private final AdvancedModelRenderer frond9;
    private final AdvancedModelRenderer frond10;
    private final AdvancedModelRenderer frondmain4;
    private final AdvancedModelRenderer frond11;
    private final AdvancedModelRenderer frond12;
    private final AdvancedModelRenderer frond13;
    private final AdvancedModelRenderer frondmain6;
    private final AdvancedModelRenderer frond20;
    private final AdvancedModelRenderer frond21;
    private final AdvancedModelRenderer frond22;
    private final AdvancedModelRenderer frondmain7;
    private final AdvancedModelRenderer frond23;
    private final AdvancedModelRenderer frond24;
    private final AdvancedModelRenderer frond25;
    private final AdvancedModelRenderer frondmain8;
    private final AdvancedModelRenderer frond26;
    private final AdvancedModelRenderer frond27;
    private final AdvancedModelRenderer frond28;
    private final AdvancedModelRenderer frondmain9;
    private final AdvancedModelRenderer frond29;
    private final AdvancedModelRenderer frond30;
    private final AdvancedModelRenderer frond31;

    public ModelHylaecullulus() {
        textureWidth = 32;
        textureHeight = 32;

        main = new AdvancedModelRenderer(this);
        main.setRotationPoint(0.0F, 24.0F, 0.5F);


        base = new AdvancedModelRenderer(this);
        base.setRotationPoint(0.0F, 0.9F, 0.0F);
        main.addChild(base);
        base.cubeList.add(new ModelBox(base, 0, 12, -4.5F, -1.4F, -4.0F, 9, 1, 7, 0.0F, false));
        base.cubeList.add(new ModelBox(base, 0, 1, -3.5F, -1.4F, -5.0F, 7, 1, 9, 0.001F, false));

        cube_r1 = new AdvancedModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, -0.4F, -0.5F);
        base.addChild(cube_r1);
        setRotateAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, -3.0F, -1.0F, 2, 2, 2, 0.0F, false));

        stem1 = new AdvancedModelRenderer(this);
        stem1.setRotationPoint(0.0F, -3.4F, 0.0F);
        base.addChild(stem1);
        stem1.cubeList.add(new ModelBox(stem1, 0, 12, -0.5F, -4.0F, -1.0F, 1, 4, 1, 0.0F, false));

        stem2 = new AdvancedModelRenderer(this);
        stem2.setRotationPoint(0.0F, -5.0F, -0.5F);
        stem1.addChild(stem2);
        setRotateAngle(stem2, 0.0F, -1.5708F, 0.0F);
        stem2.cubeList.add(new ModelBox(stem2, 26, 4, -0.5F, -3.0F, -0.5F, 1, 4, 1, 0.0F, false));

        stem3 = new AdvancedModelRenderer(this);
        stem3.setRotationPoint(0.0F, -3.0F, 0.0F);
        stem2.addChild(stem3);


        frondmain1 = new AdvancedModelRenderer(this);
        frondmain1.setRotationPoint(-0.6797F, -0.183F, 0.0F);
        stem3.addChild(frondmain1);
        setRotateAngle(frondmain1, 0.0F, 0.0F, 1.1345F);
        frondmain1.cubeList.add(new ModelBox(frondmain1, 28, 12, -0.183F, -1.6797F, -0.5F, 1, 1, 1, 0.0F, false));

        frond17 = new AdvancedModelRenderer(this);
        frond17.setRotationPoint(0.317F, -1.6797F, 0.0F);
        frondmain1.addChild(frond17);
        frond17.cubeList.add(new ModelBox(frond17, 1, 5, -0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        frond18 = new AdvancedModelRenderer(this);
        frond18.setRotationPoint(0.0F, -1.5F, 0.0F);
        frond17.addChild(frond18);
        frond18.cubeList.add(new ModelBox(frond18, 26, -1, 0.0F, -2.5F, -1.0F, 0, 2, 2, 0.0F, false));

        frond19 = new AdvancedModelRenderer(this);
        frond19.setRotationPoint(0.0F, -2.5F, 0.0F);
        frond18.addChild(frond19);
        frond19.cubeList.add(new ModelBox(frond19, 6, 4, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        frondmain2 = new AdvancedModelRenderer(this);
        frondmain2.setRotationPoint(0.0F, -0.183F, -0.6797F);
        stem3.addChild(frondmain2);
        setRotateAngle(frondmain2, -1.5708F, -0.4363F, 1.5708F);
        frondmain2.cubeList.add(new ModelBox(frondmain2, 28, 12, -0.183F, -1.6797F, -0.5F, 1, 1, 1, 0.0F, false));

        frond5 = new AdvancedModelRenderer(this);
        frond5.setRotationPoint(0.317F, -1.6797F, 0.0F);
        frondmain2.addChild(frond5);
        frond5.cubeList.add(new ModelBox(frond5, 1, 5, -0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        frond6 = new AdvancedModelRenderer(this);
        frond6.setRotationPoint(0.0F, -1.5F, 0.0F);
        frond5.addChild(frond6);
        frond6.cubeList.add(new ModelBox(frond6, 26, -1, 0.0F, -2.5F, -1.0F, 0, 2, 2, 0.0F, false));

        frond7 = new AdvancedModelRenderer(this);
        frond7.setRotationPoint(0.0F, -2.5F, 0.0F);
        frond6.addChild(frond7);
        frond7.cubeList.add(new ModelBox(frond7, 6, 4, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        frondmain3 = new AdvancedModelRenderer(this);
        frondmain3.setRotationPoint(0.6797F, -0.183F, 0.0F);
        stem3.addChild(frondmain3);
        setRotateAngle(frondmain3, 3.1416F, 0.0F, 2.0071F);
        frondmain3.cubeList.add(new ModelBox(frondmain3, 28, 12, -0.183F, -1.6797F, -0.5F, 1, 1, 1, 0.0F, false));

        frond8 = new AdvancedModelRenderer(this);
        frond8.setRotationPoint(0.317F, -1.6797F, 0.0F);
        frondmain3.addChild(frond8);
        frond8.cubeList.add(new ModelBox(frond8, 1, 5, -0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        frond9 = new AdvancedModelRenderer(this);
        frond9.setRotationPoint(0.0F, -1.5F, 0.0F);
        frond8.addChild(frond9);
        frond9.cubeList.add(new ModelBox(frond9, 26, -1, 0.0F, -2.5F, -1.0F, 0, 2, 2, 0.0F, false));

        frond10 = new AdvancedModelRenderer(this);
        frond10.setRotationPoint(0.0F, -2.5F, 0.0F);
        frond9.addChild(frond10);
        frond10.cubeList.add(new ModelBox(frond10, 6, 4, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        frondmain4 = new AdvancedModelRenderer(this);
        frondmain4.setRotationPoint(0.0F, -0.183F, 0.6797F);
        stem3.addChild(frondmain4);
        setRotateAngle(frondmain4, 1.5708F, 0.4363F, 1.5708F);
        frondmain4.cubeList.add(new ModelBox(frondmain4, 28, 12, -0.183F, -1.6797F, -0.5F, 1, 1, 1, 0.0F, false));

        frond11 = new AdvancedModelRenderer(this);
        frond11.setRotationPoint(0.317F, -1.6797F, 0.0F);
        frondmain4.addChild(frond11);
        frond11.cubeList.add(new ModelBox(frond11, 1, 5, -0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        frond12 = new AdvancedModelRenderer(this);
        frond12.setRotationPoint(0.0F, -1.5F, 0.0F);
        frond11.addChild(frond12);
        frond12.cubeList.add(new ModelBox(frond12, 26, -1, 0.0F, -2.5F, -1.0F, 0, 2, 2, 0.0F, false));

        frond13 = new AdvancedModelRenderer(this);
        frond13.setRotationPoint(0.0F, -2.5F, 0.0F);
        frond12.addChild(frond13);
        frond13.cubeList.add(new ModelBox(frond13, 6, 4, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        frondmain6 = new AdvancedModelRenderer(this);
        frondmain6.setRotationPoint(0.4777F, 0.2373F, 0.4777F);
        stem3.addChild(frondmain6);
        setRotateAngle(frondmain6, 2.5474F, 0.5484F, 2.228F);
        frondmain6.cubeList.add(new ModelBox(frondmain6, 28, 12, -0.3519F, -1.8641F, -0.5F, 1, 1, 1, 0.0F, false));

        frond20 = new AdvancedModelRenderer(this);
        frond20.setRotationPoint(0.317F, -1.6797F, 0.0F);
        frondmain6.addChild(frond20);
        frond20.cubeList.add(new ModelBox(frond20, 1, 5, -0.6689F, -2.1843F, -1.0F, 1, 2, 2, 0.0F, false));

        frond21 = new AdvancedModelRenderer(this);
        frond21.setRotationPoint(0.0F, -1.5F, 0.0F);
        frond20.addChild(frond21);
        frond21.cubeList.add(new ModelBox(frond21, 26, -1, -0.1689F, -2.6843F, -1.0F, 0, 2, 2, 0.0F, false));

        frond22 = new AdvancedModelRenderer(this);
        frond22.setRotationPoint(0.0F, -2.5F, 0.0F);
        frond21.addChild(frond22);
        frond22.cubeList.add(new ModelBox(frond22, 6, 4, -0.1689F, -1.1843F, -0.5F, 0, 1, 1, 0.0F, false));

        frondmain7 = new AdvancedModelRenderer(this);
        frondmain7.setRotationPoint(0.4777F, 0.2373F, -0.4777F);
        stem3.addChild(frondmain7);
        setRotateAngle(frondmain7, -2.5474F, -0.5484F, 2.228F);
        frondmain7.cubeList.add(new ModelBox(frondmain7, 28, 12, -0.3519F, -1.8641F, -0.5F, 1, 1, 1, 0.0F, false));

        frond23 = new AdvancedModelRenderer(this);
        frond23.setRotationPoint(0.317F, -1.6797F, 0.0F);
        frondmain7.addChild(frond23);
        frond23.cubeList.add(new ModelBox(frond23, 1, 5, -0.6689F, -2.1843F, -1.0F, 1, 2, 2, 0.0F, false));

        frond24 = new AdvancedModelRenderer(this);
        frond24.setRotationPoint(0.0F, -1.5F, 0.0F);
        frond23.addChild(frond24);
        frond24.cubeList.add(new ModelBox(frond24, 26, -1, -0.1689F, -2.6843F, -1.0F, 0, 2, 2, 0.0F, false));

        frond25 = new AdvancedModelRenderer(this);
        frond25.setRotationPoint(0.0F, -2.5F, 0.0F);
        frond24.addChild(frond25);
        frond25.cubeList.add(new ModelBox(frond25, 6, 4, -0.1689F, -1.1843F, -0.5F, 0, 1, 1, 0.0F, false));

        frondmain8 = new AdvancedModelRenderer(this);
        frondmain8.setRotationPoint(-0.4777F, 0.2373F, -0.4777F);
        stem3.addChild(frondmain8);
        setRotateAngle(frondmain8, -0.5942F, -0.5484F, 0.9136F);
        frondmain8.cubeList.add(new ModelBox(frondmain8, 28, 12, -0.3519F, -1.8641F, -0.5F, 1, 1, 1, 0.0F, false));

        frond26 = new AdvancedModelRenderer(this);
        frond26.setRotationPoint(0.317F, -1.6797F, 0.0F);
        frondmain8.addChild(frond26);
        frond26.cubeList.add(new ModelBox(frond26, 1, 5, -0.6689F, -2.1843F, -1.0F, 1, 2, 2, 0.0F, false));

        frond27 = new AdvancedModelRenderer(this);
        frond27.setRotationPoint(0.0F, -1.5F, 0.0F);
        frond26.addChild(frond27);
        frond27.cubeList.add(new ModelBox(frond27, 26, -1, -0.1689F, -2.6843F, -1.0F, 0, 2, 2, 0.0F, false));

        frond28 = new AdvancedModelRenderer(this);
        frond28.setRotationPoint(0.0F, -2.5F, 0.0F);
        frond27.addChild(frond28);
        frond28.cubeList.add(new ModelBox(frond28, 6, 4, -0.1689F, -1.1843F, -0.5F, 0, 1, 1, 0.0F, false));

        frondmain9 = new AdvancedModelRenderer(this);
        frondmain9.setRotationPoint(-0.4777F, 0.2373F, 0.4777F);
        stem3.addChild(frondmain9);
        setRotateAngle(frondmain9, 0.5942F, 0.5484F, 0.9136F);
        frondmain9.cubeList.add(new ModelBox(frondmain9, 28, 12, -0.3519F, -1.8641F, -0.5F, 1, 1, 1, 0.0F, false));

        frond29 = new AdvancedModelRenderer(this);
        frond29.setRotationPoint(0.317F, -1.6797F, 0.0F);
        frondmain9.addChild(frond29);
        frond29.cubeList.add(new ModelBox(frond29, 1, 5, -0.6689F, -2.1843F, -1.0F, 1, 2, 2, 0.0F, false));

        frond30 = new AdvancedModelRenderer(this);
        frond30.setRotationPoint(0.0F, -1.5F, 0.0F);
        frond29.addChild(frond30);
        frond30.cubeList.add(new ModelBox(frond30, 26, -1, -0.1689F, -2.6843F, -1.0F, 0, 2, 2, 0.0F, false));

        frond31 = new AdvancedModelRenderer(this);
        frond31.setRotationPoint(0.0F, -2.5F, 0.0F);
        frond30.addChild(frond31);
        frond31.cubeList.add(new ModelBox(frond31, 6, 4, -0.1689F, -1.1843F, -0.5F, 0, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();

        AdvancedModelRenderer[] bodyFull = {this.stem1,this.stem2,this.stem3};
        float speed = 0.051F;
        this.chainWave(bodyFull, speed, 0.08F, 2, f, 0.42F);

        AdvancedModelRenderer[] frond1 = {this.frondmain1,this.frond17,this.frond18, this.frond19};
        AdvancedModelRenderer[] frond2 = {this.frondmain2,this.frond5,this.frond6, this.frond7};
        AdvancedModelRenderer[] frond3 = {this.frondmain3,this.frond8,this.frond9, this.frond10};
        AdvancedModelRenderer[] frond4 = {this.frondmain4,this.frond11,this.frond12, this.frond13};
        AdvancedModelRenderer[] frond6 = {this.frondmain6,this.frond20,this.frond21, this.frond22};
        AdvancedModelRenderer[] frond7 = {this.frondmain7,this.frond23,this.frond24, this.frond25};
        AdvancedModelRenderer[] frond8 = {this.frondmain8,this.frond26,this.frond27, this.frond28};
        AdvancedModelRenderer[] frond9 = {this.frondmain9,this.frond29,this.frond30, this.frond31};

        this.chainWave(frond1, speed, 0.06F, 2, f, 0.42F);
        this.chainFlap(frond1, speed, 0.12F, 2, f, 0.42F);
        this.chainWave(frond2, speed, 0.06F, 2, f, 0.42F);
        this.chainFlap(frond2, speed, 0.12F, 2, f, 0.42F);
        this.chainWave(frond3, speed, 0.06F, 2, f, 0.42F);
        this.chainFlap(frond3, speed, 0.12F, 2, f, 0.42F);
        this.chainWave(frond4, speed, 0.06F, 2, f, 0.42F);
        this.chainFlap(frond4, speed, 0.12F, 2, f, 0.42F);
        this.chainWave(frond6, speed, 0.06F, 2, f, 0.42F);
        this.chainFlap(frond6, speed, 0.12F, 2, f, 0.42F);
        this.chainWave(frond7, speed, 0.06F, 2, f, 0.42F);
        this.chainFlap(frond7, speed, 0.12F, 2, f, 0.42F);
        this.chainWave(frond8, speed, 0.06F, 2, f, 0.42F);
        this.chainFlap(frond8, speed, 0.12F, 2, f, 0.42F);
        this.chainWave(frond9, speed, 0.06F, 2, f, 0.42F);
        this.chainFlap(frond9, speed, 0.12F, 2, f, 0.42F);

        this.main.render(0.1f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
