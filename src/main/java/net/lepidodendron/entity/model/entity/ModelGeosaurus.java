package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDakosaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraGeosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelGeosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer bone18;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer bone19;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer bone11;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer UpperLegL;
    private final AdvancedModelRenderer LowerLegL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer UpperLegR;
    private final AdvancedModelRenderer LowerLegR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer bone12;
    private final AdvancedModelRenderer bone13;
    private final AdvancedModelRenderer bone14;
    private final AdvancedModelRenderer bone15;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer HandR;


    private final ModelAnimator animator;

    public ModelGeosaurus() {
        this.textureWidth = 80;
        this.textureHeight = 70;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 19.0F, -3.5F);
        this.Body.cubeList.add(new ModelBox(Body, 28, 35, -3.5F, -1.25F, -3.5F, 7, 6, 5, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 1.0F, -2.5F);
        this.Body.addChild(Neck);
        this.Neck.cubeList.add(new ModelBox(Neck, 50, 16, -2.5F, -1.99F, -5.0F, 5, 5, 5, -0.001F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Neck.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 56, 30, -3.0F, -2.0F, -5.0F, 6, 3, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, -5.875F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 45, -3.5F, -0.725F, 2.6F, 1, 1, 3, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 45, 2.5F, -0.725F, 2.6F, 1, 1, 3, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0436F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 37, 49, -3.0F, 0.5F, -5.0F, 6, 1, 6, -0.002F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 44, 9, -3.0F, 0.0F, -5.0F, 6, 1, 6, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Jaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.24F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 58, 38, -2.0F, -2.0F, 0.0F, 4, 2, 4, -0.001F, false));

        this.bone18 = new AdvancedModelRenderer(this);
        this.bone18.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Jaw.addChild(bone18);
        this.setRotateAngle(bone18, 0.0436F, 0.0F, 0.0F);
        this.bone18.cubeList.add(new ModelBox(bone18, 32, 56, -2.0F, 0.0F, -5.0F, 4, 1, 5, -0.001F, false));
        this.bone18.cubeList.add(new ModelBox(bone18, 22, 0, -2.0F, 0.5F, -5.0F, 4, 1, 5, -0.002F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.75F, -4.75F);
        this.bone18.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 14, -1.0F, 0.0F, -2.0F, 2, 1, 1, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.75F, -4.9F);
        this.bone18.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 57, -2.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.bone19 = new AdvancedModelRenderer(this);
        this.bone19.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.bone18.addChild(bone19);
        this.setRotateAngle(bone19, -0.0873F, 0.0F, 0.0F);
        this.bone19.cubeList.add(new ModelBox(bone19, 30, 46, -1.5F, -1.0F, -2.925F, 3, 1, 3, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.5F, 0.0F);
        this.bone19.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1702F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 62, 9, -0.5F, -1.0F, -2.925F, 2, 1, 3, -0.002F, false));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.Head.addChild(snout);
        this.setRotateAngle(snout, -0.0436F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 50, 56, -2.0F, -1.0F, -5.0F, 4, 1, 5, 0.0F, false));
        this.snout.cubeList.add(new ModelBox(snout, 55, 49, -2.0F, -1.5F, -5.0F, 4, 1, 5, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.85F, -5.75F);
        this.snout.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 45, 56, -1.0F, -1.0F, -2.0F, 2, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 1.0F, -5.0F);
        this.snout.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 41, -1.0F, -1.0F, 1.0F, 3, 1, 3, 0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, -2.6F, -1.5F);
        this.snout.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.183F, -0.8346F, -0.0652F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 9, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, -2.6F, -1.5F);
        this.snout.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.183F, 0.8346F, 0.0652F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 9, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.75F, -5.0F);
        this.snout.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 14, -1.0F, 0.0F, -2.85F, 2, 1, 1, -0.001F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 33, 62, -1.0F, 0.0F, -2.0F, 2, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -1.75F, -5.0F);
        this.snout.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2356F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 14, -1.0F, 0.0F, 4.275F, 3, 1, 1, -0.001F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 0, -1.0F, 1.0F, 1.0F, 3, 1, 4, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 58, 0, -1.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.snout.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 61, 26, -1.5F, 1.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.85F, 1.5F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 23, 17, -4.0F, -2.5F, -1.0F, 8, 7, 11, 0.001F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -0.75F, 9.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 0, -3.5F, -1.5F, 0.0F, 7, 6, 8, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 4.5F, 8.0F);
        this.Body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0698F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 22, 6, -3.0F, -1.0F, -8.0F, 6, 1, 8, 0.0F, false));

        this.bone11 = new AdvancedModelRenderer(this);
        this.bone11.setRotationPoint(0.0F, 1.0F, 8.0F);
        this.Body3.addChild(bone11);
        this.bone11.cubeList.add(new ModelBox(bone11, 0, 28, -3.0F, -2.25F, -1.0F, 6, 5, 8, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.75F, 7.0F);
        this.bone11.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0916F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 0, -2.0F, -1.0F, -8.0F, 4, 1, 8, 0.0F, false));

        this.UpperLegL = new AdvancedModelRenderer(this);
        this.UpperLegL.setRotationPoint(2.75F, 0.9F, 0.65F);
        this.bone11.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, 1.0036F, 0.6109F, 0.0F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 0, 28, -1.75F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false));

        this.LowerLegL = new AdvancedModelRenderer(this);
        this.LowerLegL.setRotationPoint(-0.25F, 4.75F, -0.5F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.48F, -0.3491F, 0.0F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 0, 41, -1.35F, -0.05F, -0.5F, 2, 4, 2, 0.0F, false));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.2618F, 0.0F, -0.2182F);
        this.FootL.cubeList.add(new ModelBox(FootL, 0, 0, -0.75F, -0.3F, -1.25F, 1, 4, 3, 0.0F, false));

        this.UpperLegR = new AdvancedModelRenderer(this);
        this.UpperLegR.setRotationPoint(-2.75F, 0.9F, 0.65F);
        this.bone11.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, 1.0036F, -0.6109F, 0.0F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 0, 28, -0.25F, 0.0F, -1.0F, 2, 5, 2, 0.0F, true));

        this.LowerLegR = new AdvancedModelRenderer(this);
        this.LowerLegR.setRotationPoint(0.25F, 4.75F, -0.5F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, 0.48F, 0.3491F, 0.0F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 0, 41, -0.65F, -0.05F, -0.5F, 2, 4, 2, 0.0F, true));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, 0.2618F, 0.0F, 0.2182F);
        this.FootR.cubeList.add(new ModelBox(FootR, 0, 0, -0.25F, -0.3F, -1.25F, 1, 4, 3, 0.0F, true));

        this.bone12 = new AdvancedModelRenderer(this);
        this.bone12.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.bone11.addChild(bone12);
        this.bone12.cubeList.add(new ModelBox(bone12, 15, 46, -2.0F, -2.0F, 0.0F, 4, 4, 7, 0.0F, false));

        this.bone13 = new AdvancedModelRenderer(this);
        this.bone13.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.bone12.addChild(bone13);
        this.setRotateAngle(bone13, -0.0436F, 0.0F, 0.0F);
        this.bone13.cubeList.add(new ModelBox(bone13, 44, 38, -1.5F, -1.75F, 0.0F, 3, 3, 8, 0.0F, false));

        this.bone14 = new AdvancedModelRenderer(this);
        this.bone14.setRotationPoint(0.0F, -0.5F, 7.0F);
        this.bone13.addChild(bone14);
        this.setRotateAngle(bone14, -0.0436F, 0.0F, 0.0F);
        this.bone14.cubeList.add(new ModelBox(bone14, 0, 41, -1.0F, -1.25F, 0.0F, 2, 3, 9, 0.0F, false));

        this.bone15 = new AdvancedModelRenderer(this);
        this.bone15.setRotationPoint(0.0F, 0.5F, 8.0F);
        this.bone14.addChild(bone15);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 5.0F, 5.25F);
        this.bone15.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3927F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 11, 57, -0.5F, -0.4F, -0.125F, 1, 1, 7, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.75F, 1.0F);
        this.bone15.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.829F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 0.0F, -10.0F, -3.0F, 0, 11, 17, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 53, -0.5F, 0.0F, 0.0F, 1, 2, 8, 0.0F, false));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(3.75F, 3.0F, -2.0F);
        this.Body.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -0.5236F, 0.5672F, 0.0F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 0, 53, -1.0F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(-0.5F, 0.0F, 2.0F);
        this.UpperArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.5236F, -0.3927F, -0.3054F);
        this.HandL.cubeList.add(new ModelBox(HandL, 37, 50, -0.5F, -1.0F, -0.25F, 1, 2, 2, 0.0F, false));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-3.75F, 3.0F, -2.0F);
        this.Body.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, -0.5236F, -0.5672F, 0.0F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 0, 53, 0.0F, -1.0F, 0.0F, 1, 2, 2, 0.0F, true));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(0.5F, 0.0F, 2.0F);
        this.UpperArmR.addChild(HandR);
        this.setRotateAngle(HandR, 0.5236F, 0.3927F, 0.3054F);
        this.HandR.cubeList.add(new ModelBox(HandR, 37, 50, -0.5F, -1.0F, -0.25F, 1, 2, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body.render(f5);
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        this.Body.offsetY = 0.25F;
        this.Body.offsetZ = -0.9F;

        EntityPrehistoricFloraGeosaurus Dako = (EntityPrehistoricFloraGeosaurus) e;

        this.faceTarget(f3, f4, 5, Neck);
        this.faceTarget(f3, f4, 5, Head);
        AdvancedModelRenderer[] Tail = {this.Body3, this.bone11, this.bone12, this.bone13, this.bone14, this.bone15};
        //AdvancedModelRenderer[] Torso = {this.Neckfront, this.Neckmiddlefront, this.Neckmiddlebase, this.Neckbase, this.Bodyfront};
        Dako.tailBuffer.applyChainSwingBuffer(Tail);

        //AdvancedModelRenderer[] FL = {this.Rightupperarm, this.Rightlowerarm, this.Rightfrontfoot};
        //AdvancedModelRenderer[] FR = {this.Leftupperarm, this.Leftlowerarm, this.Leftfrontfoot};
        //AdvancedModelRenderer[] BL = {this.Rightthigh, this.Rightshin, this.Righthindfoot};
        //AdvancedModelRenderer[] BR = {this.Leftthigh, this.Leftshin, this.Lefthindfoot};

        if (!Dako.isReallyInWater()) { //will never happen as it should not be on land
            //this.leftarm.rotateAngleZ = (float) Math.toRadians(15.6125);
            //this.rightarm3.rotateAngleZ = (float) Math.toRadians(-18.662);

            //this.leftleg.rotateAngleX = -(float) Math.toRadians(22.9232);
            //this.rightleg3.rotateAngleX = -(float) Math.toRadians(22.9232);
        }
    }
    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraGeosaurus ee = (EntityPrehistoricFloraGeosaurus) entitylivingbaseIn;

        if (ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            } else {
                animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGeosaurus entity = (EntityPrehistoricFloraGeosaurus) entitylivingbaseIn;
    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGeosaurus entity = (EntityPrehistoricFloraGeosaurus) entitylivingbaseIn;
    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGeosaurus entity = (EntityPrehistoricFloraGeosaurus) entitylivingbaseIn;
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGeosaurus entity = (EntityPrehistoricFloraGeosaurus) entitylivingbaseIn;
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);

    }
}
