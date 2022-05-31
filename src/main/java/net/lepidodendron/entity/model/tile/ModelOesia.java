package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelOesia extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer wormD;
    private final AdvancedModelRenderer wormE;
    private final AdvancedModelRenderer wormF;
    private final AdvancedModelRenderer wormG;
    private final AdvancedModelRenderer wormC;
    private final AdvancedModelRenderer wormB;
    private final AdvancedModelRenderer wormA;
    private final AdvancedModelRenderer wormD2;
    private final AdvancedModelRenderer wormE2;
    private final AdvancedModelRenderer wormF2;
    private final AdvancedModelRenderer wormG2;
    private final AdvancedModelRenderer wormC2;
    private final AdvancedModelRenderer wormB2;
    private final AdvancedModelRenderer wormA2;
    private final AdvancedModelRenderer wormD3;
    private final AdvancedModelRenderer wormE3;
    private final AdvancedModelRenderer wormF3;
    private final AdvancedModelRenderer wormG3;
    private final AdvancedModelRenderer wormC3;
    private final AdvancedModelRenderer wormB3;
    private final AdvancedModelRenderer wormA3;

    public ModelOesia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(3.0F, 15.0F, -3.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -9.0F, -3.0F, -3.0F, 3, 12, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 12, 0, -5.0F, -1.0F, 6.0F, 3, 10, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 9, 13, -1.0F, 0.0F, -1.0F, 3, 9, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3491F, -0.0436F, 0.1309F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 10, -0.925F, -7.5F, -1.1F, 3, 8, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3927F, -0.0436F, -0.1309F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 21, -1.1F, -5.7F, -0.9F, 3, 6, 3, 0.0F, false));

        this.wormD = new AdvancedModelRenderer(this);
        this.wormD.setRotationPoint(-3.5F, 4.0F, 7.5F);
        this.bone.addChild(wormD);
        this.wormD.cubeList.add(new ModelBox(wormD, 4, 25, -0.51F, 0.0F, -0.49F, 1, 1, 1, 0.0F, false));

        this.wormE = new AdvancedModelRenderer(this);
        this.wormE.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.wormD.addChild(wormE);
        this.wormE.cubeList.add(new ModelBox(wormE, 0, 25, -0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.wormF = new AdvancedModelRenderer(this);
        this.wormF.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.wormE.addChild(wormF);
        this.wormF.cubeList.add(new ModelBox(wormF, 4, 25, -0.51F, 0.0F, -0.49F, 1, 1, 1, 0.0F, false));

        this.wormG = new AdvancedModelRenderer(this);
        this.wormG.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.wormF.addChild(wormG);
        this.wormG.cubeList.add(new ModelBox(wormG, 0, 25, -0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.wormC = new AdvancedModelRenderer(this);
        this.wormC.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wormD.addChild(wormC);
        this.wormC.cubeList.add(new ModelBox(wormC, 0, 25, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.wormB = new AdvancedModelRenderer(this);
        this.wormB.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.wormC.addChild(wormB);
        this.wormB.cubeList.add(new ModelBox(wormB, 4, 23, -0.51F, -1.0F, -0.49F, 1, 1, 1, 0.0F, false));

        this.wormA = new AdvancedModelRenderer(this);
        this.wormA.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.wormB.addChild(wormA);
        this.wormA.cubeList.add(new ModelBox(wormA, 0, 23, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.wormD2 = new AdvancedModelRenderer(this);
        this.wormD2.setRotationPoint(-8.0F, 3.0F, -2.25F);
        this.bone.addChild(wormD2);
        this.wormD2.cubeList.add(new ModelBox(wormD2, 4, 29, -0.51F, 0.0F, -0.49F, 1, 1, 1, 0.0F, false));

        this.wormE2 = new AdvancedModelRenderer(this);
        this.wormE2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.wormD2.addChild(wormE2);
        this.wormE2.cubeList.add(new ModelBox(wormE2, 0, 29, -0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.wormF2 = new AdvancedModelRenderer(this);
        this.wormF2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.wormE2.addChild(wormF2);
        this.wormF2.cubeList.add(new ModelBox(wormF2, 4, 29, -0.51F, 0.0F, -0.49F, 1, 1, 1, 0.0F, false));

        this.wormG2 = new AdvancedModelRenderer(this);
        this.wormG2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.wormF2.addChild(wormG2);
        this.wormG2.cubeList.add(new ModelBox(wormG2, 0, 29, -0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.wormC2 = new AdvancedModelRenderer(this);
        this.wormC2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wormD2.addChild(wormC2);
        this.wormC2.cubeList.add(new ModelBox(wormC2, 0, 29, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.wormB2 = new AdvancedModelRenderer(this);
        this.wormB2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.wormC2.addChild(wormB2);
        this.wormB2.cubeList.add(new ModelBox(wormB2, 4, 27, -0.51F, -1.0F, -0.49F, 1, 1, 1, 0.0F, false));

        this.wormA2 = new AdvancedModelRenderer(this);
        this.wormA2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.wormB2.addChild(wormA2);
        this.wormA2.cubeList.add(new ModelBox(wormA2, 0, 27, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.wormD3 = new AdvancedModelRenderer(this);
        this.wormD3.setRotationPoint(0.5F, -0.75F, -0.5F);
        this.bone.addChild(wormD3);
        this.setRotateAngle(wormD3, 0.1745F, 0.0F, 0.0F);
        this.wormD3.cubeList.add(new ModelBox(wormD3, 2, 21, -0.51F, 0.0F, -0.49F, 1, 1, 1, 0.0F, false));

        this.wormE3 = new AdvancedModelRenderer(this);
        this.wormE3.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.wormD3.addChild(wormE3);
        this.wormE3.cubeList.add(new ModelBox(wormE3, 1, 20, -0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.wormF3 = new AdvancedModelRenderer(this);
        this.wormF3.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.wormE3.addChild(wormF3);
        this.wormF3.cubeList.add(new ModelBox(wormF3, 2, 21, -0.51F, 0.0F, -0.49F, 1, 1, 1, 0.0F, false));

        this.wormG3 = new AdvancedModelRenderer(this);
        this.wormG3.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.wormF3.addChild(wormG3);
        this.wormG3.cubeList.add(new ModelBox(wormG3, 1, 20, -0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.wormC3 = new AdvancedModelRenderer(this);
        this.wormC3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wormD3.addChild(wormC3);
        this.wormC3.cubeList.add(new ModelBox(wormC3, 1, 20, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.wormB3 = new AdvancedModelRenderer(this);
        this.wormB3.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.wormC3.addChild(wormB3);
        this.wormB3.cubeList.add(new ModelBox(wormB3, 1, 17, -0.51F, -1.0F, -0.49F, 1, 1, 1, 0.0F, false));

        this.wormA3 = new AdvancedModelRenderer(this);
        this.wormA3.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.wormB3.addChild(wormA3);
        this.wormA3.cubeList.add(new ModelBox(wormA3, 1, 16, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        AdvancedModelRenderer[] worm1F = {this.wormC,this.wormB,this.wormA};
        AdvancedModelRenderer[] worm1B = {this.wormE,this.wormF,this.wormG};

        AdvancedModelRenderer[] worm2F = {this.wormC2,this.wormB2,this.wormA2};
        AdvancedModelRenderer[] worm2B = {this.wormE2,this.wormF2,this.wormG2};

        AdvancedModelRenderer[] worm3F = {this.wormC3,this.wormB3,this.wormA3};
        AdvancedModelRenderer[] worm3B = {this.wormE3,this.wormF3,this.wormG3};

        this.bone.offsetY = 1.85F;

        float speed = 0.054F;
        this.chainWave(worm1F, speed, 0.1F, 0.75, f, 0.5F);
        this.chainFlap(worm1F, speed, 0.1F, 0.75, f, 0.5F);
        this.chainWave(worm1B, speed, 0.1F, 0.75, f, 0.5F);
        this.chainFlap(worm1B, speed, 0.1F, 0.75, f, 0.5F);
        this.bob(wormD, speed * 2F, 0.2F, false, f, 1F);

        this.chainWave(worm2F, speed * 1.2F, 0.1F, 0.75, f, 0.5F);
        this.chainFlap(worm2F, speed * 1.2F, 0.1F, 0.75, f, 0.5F);
        this.chainWave(worm2B, speed * 1.2F, 0.1F, 0.75, f, 0.5F);
        this.chainFlap(worm2B, speed * 1.2F, 0.1F, 0.75, f, 0.5F);
        this.bob(wormD2, speed * 2F * 1.2F, 0.2F, false, f, 1F);

        this.chainWave(worm3F, speed * 0.92F, 0.1F, 0.75, f, 0.5F);
        this.chainFlap(worm3F, speed * 0.92F, 0.1F, 0.75, f, 0.5F);
        this.chainWave(worm3B, speed * 0.92F, 0.1F, 0.75, f, 0.5F);
        this.chainFlap(worm3B, speed * 0.92F, 0.1F, 0.75, f, 0.5F);
        this.bob(wormD3, speed * 2F * 0.92F, 0.2F, false, f, 1F);

        this.bone.render(0.0225f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
