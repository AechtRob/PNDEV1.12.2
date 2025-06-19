package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMonjurosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMonjurosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer rightUpperArm;
    private final AdvancedModelRenderer rightLowerArmw;
    private final AdvancedModelRenderer rightLowerArm;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer leftUpperArm;
    private final AdvancedModelRenderer leftLowerArmw;
    private final AdvancedModelRenderer leftLowerArm;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer pelvis;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer rightUpperLeg;
    private final AdvancedModelRenderer rightLowerLeg;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer leftUpperLeg;
    private final AdvancedModelRenderer leftLowerLeg;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    private ModelAnimator animator;

    public ModelMonjurosuchus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 21.7F, -3.75F);
        this.chest.cubeList.add(new ModelBox(chest, 28, 20, -1.5F, -1.25F, -3.25F, 3, 3, 3, -0.01F, false));

        this.rightUpperArm = new AdvancedModelRenderer(this);
        this.rightUpperArm.setRotationPoint(-1.0333F, 0.4028F, -2.0385F);
        this.chest.addChild(rightUpperArm);
        this.setRotateAngle(rightUpperArm, -0.0422F, 0.3031F, -0.2179F);
        this.rightUpperArm.cubeList.add(new ModelBox(rightUpperArm, 8, 34, -2.2F, -0.5F, -1.0F, 3, 1, 1, 0.01F, false));
        this.rightUpperArm.cubeList.add(new ModelBox(rightUpperArm, 16, 34, -2.2F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
        this.rightUpperArm.cubeList.add(new ModelBox(rightUpperArm, 34, 34, -2.2F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));
        this.rightUpperArm.cubeList.add(new ModelBox(rightUpperArm, 34, 32, -2.2F, 0.0F, -0.5F, 3, 1, 1, -0.01F, false));

        this.rightLowerArmw = new AdvancedModelRenderer(this);
        this.rightLowerArmw.setRotationPoint(-2.2072F, 0.223F, -0.1026F);
        this.rightUpperArm.addChild(rightLowerArmw);


        this.rightLowerArm = new AdvancedModelRenderer(this);
        this.rightLowerArm.setRotationPoint(0.15F, 0.0F, 0.0F);
        this.rightLowerArmw.addChild(rightLowerArm);
        this.setRotateAngle(rightLowerArm, 0.4069F, -0.7751F, -0.552F);
        this.rightLowerArm.cubeList.add(new ModelBox(rightLowerArm, 38, 9, -1.7F, -0.5F, -0.75F, 2, 1, 1, 0.01F, false));
        this.rightLowerArm.cubeList.add(new ModelBox(rightLowerArm, 38, 11, -1.7F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-1.3158F, 0.0064F, -0.0082F);
        this.rightLowerArm.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.1257F, -0.0298F, 0.5224F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 26, 32, -1.9F, -0.4F, -1.0F, 2, 1, 2, 0.0F, false));

        this.leftUpperArm = new AdvancedModelRenderer(this);
        this.leftUpperArm.setRotationPoint(1.0333F, 0.4028F, -2.0385F);
        this.chest.addChild(leftUpperArm);
        this.setRotateAngle(leftUpperArm, -0.0422F, -0.3031F, 0.2179F);
        this.leftUpperArm.cubeList.add(new ModelBox(leftUpperArm, 8, 34, -0.8F, -0.5F, -1.0F, 3, 1, 1, 0.01F, true));
        this.leftUpperArm.cubeList.add(new ModelBox(leftUpperArm, 16, 34, -0.8F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));
        this.leftUpperArm.cubeList.add(new ModelBox(leftUpperArm, 34, 34, -0.8F, 0.0F, -1.0F, 3, 1, 1, 0.0F, true));
        this.leftUpperArm.cubeList.add(new ModelBox(leftUpperArm, 34, 32, -0.8F, 0.0F, -0.5F, 3, 1, 1, -0.01F, true));

        this.leftLowerArmw = new AdvancedModelRenderer(this);
        this.leftLowerArmw.setRotationPoint(2.2072F, 0.223F, -0.1026F);
        this.leftUpperArm.addChild(leftLowerArmw);


        this.leftLowerArm = new AdvancedModelRenderer(this);
        this.leftLowerArm.setRotationPoint(-0.15F, 0.0F, 0.0F);
        this.leftLowerArmw.addChild(leftLowerArm);
        this.setRotateAngle(leftLowerArm, 0.4069F, 0.7751F, 0.552F);
        this.leftLowerArm.cubeList.add(new ModelBox(leftLowerArm, 38, 9, -0.3F, -0.5F, -0.75F, 2, 1, 1, 0.01F, true));
        this.leftLowerArm.cubeList.add(new ModelBox(leftLowerArm, 38, 11, -0.3F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(1.3158F, 0.0064F, -0.0082F);
        this.leftLowerArm.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.1257F, 0.0298F, -0.5224F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 26, 32, -0.1F, -0.4F, -1.0F, 2, 1, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.2F, -3.25F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 30, 6, -1.0F, -1.0F, -1.75F, 2, 2, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.6F, -0.75F);
        this.neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 10, -1.0F, -1.0F, -1.0F, 2, 1, 2, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.05F, -1.75F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 28, 26, -0.5F, -0.2F, -4.225F, 1, 1, 5, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.8F, -3.225F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.5061F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 37, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.975F, 0.8F, -2.375F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 38, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.125F, -0.95F, -1.45F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0873F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 14, -1.0F, 0.0F, 1.2F, 1, 0, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 36, -1.0F, 0.0F, -0.1F, 1, 1, 2, 0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.775F, -0.95F, -1.45F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.2618F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 29, 0.0F, 0.25F, 1.2F, 0, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.125F, 0.8F, -1.45F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0873F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 36, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -0.2F, -3.225F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3883F, 0.3054F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 38, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.125F, -0.95F, -1.45F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, -0.0873F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 14, 0.0F, 0.0F, 1.2F, 1, 0, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 36, 0.0F, 0.0F, -0.1F, 1, 1, 2, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.775F, -0.95F, -1.45F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1309F, -0.2618F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 29, 0.0F, 0.25F, 1.2F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.125F, 0.8F, -1.45F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.0873F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 36, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.975F, 0.8F, -2.375F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.1745F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 38, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 0.8F, -3.225F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.5061F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 37, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.0F, -1.425F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1222F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 22, 37, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -0.2F, -3.225F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3883F, -0.3054F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 6, 38, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.2F, -3.225F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4102F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 37, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.8F, 0.275F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 14, -0.5F, -0.5F, -4.475F, 1, 1, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.5F, -3.5F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.4756F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 38, 38, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.95F, 0.5F, -2.65F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.1745F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 39, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.02F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.1F, 0.5F, -1.725F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0873F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 6, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.01F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.5F, -3.5F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.4756F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 38, 38, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.1F, 0.5F, -1.725F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.0873F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 38, 6, 0.0F, -1.0F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.95F, 0.5F, -2.65F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.1745F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 16, 39, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.02F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.125F, -0.1F, -2.1F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.3491F, -0.0873F, 0.2618F);
        this.eyeright.cubeList.add(new ModelBox(eyeright, 38, 36, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.125F, -0.1F, -2.1F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.3491F, 0.0873F, -0.2618F);
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 38, 36, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.25F, -0.75F);
        this.chest.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 8, -2.0F, -1.0F, -0.25F, 4, 3, 4, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 14, 23, -2.0F, -1.0F, 0.0F, 4, 3, 3, 0.0F, false));

        this.pelvis = new AdvancedModelRenderer(this);
        this.pelvis.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body2.addChild(pelvis);
        this.pelvis.cubeList.add(new ModelBox(pelvis, 0, 30, -1.5F, 1.0F, -0.5F, 3, 1, 3, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.9F, 0.25F);
        this.pelvis.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1309F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 14, 29, -1.5F, 0.0F, -0.5F, 3, 2, 3, 0.0F, false));

        this.rightUpperLeg = new AdvancedModelRenderer(this);
        this.rightUpperLeg.setRotationPoint(-0.9F, 0.35F, 1.65F);
        this.pelvis.addChild(rightUpperLeg);
        this.setRotateAngle(rightUpperLeg, -0.1819F, -0.4445F, -0.2711F);
        this.rightUpperLeg.cubeList.add(new ModelBox(rightUpperLeg, 30, 0, -2.9F, 0.0F, -1.0F, 3, 1, 2, -0.01F, false));
        this.rightUpperLeg.cubeList.add(new ModelBox(rightUpperLeg, 30, 3, -2.9F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        this.rightLowerLeg = new AdvancedModelRenderer(this);
        this.rightLowerLeg.setRotationPoint(-2.2625F, 0.1281F, -0.2687F);
        this.rightUpperLeg.addChild(rightLowerLeg);
        this.setRotateAngle(rightLowerLeg, 0.0F, 1.0036F, 0.0F);
        this.rightLowerLeg.cubeList.add(new ModelBox(rightLowerLeg, 24, 35, -2.7878F, -0.5F, -0.897F, 3, 1, 1, 0.01F, false));
        this.rightLowerLeg.cubeList.add(new ModelBox(rightLowerLeg, 8, 36, -2.7878F, -0.5F, -0.397F, 3, 1, 1, 0.0F, false));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(-2.8F, -0.3F, -0.3F);
        this.rightLowerLeg.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.1658F, -0.4145F, 0.1047F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.2699F, -0.3134F, 0.7612F);
        this.rightFoot.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3033F, -0.6194F, 0.0906F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 34, -1.9098F, 0.0113F, -1.5326F, 2, 1, 2, 0.0F, false));

        this.leftUpperLeg = new AdvancedModelRenderer(this);
        this.leftUpperLeg.setRotationPoint(0.9F, 0.35F, 1.65F);
        this.pelvis.addChild(leftUpperLeg);
        this.setRotateAngle(leftUpperLeg, -0.1819F, 0.4445F, 0.2711F);
        this.leftUpperLeg.cubeList.add(new ModelBox(leftUpperLeg, 30, 0, -0.1F, 0.0F, -1.0F, 3, 1, 2, -0.01F, true));
        this.leftUpperLeg.cubeList.add(new ModelBox(leftUpperLeg, 30, 3, -0.1F, -0.5F, -1.0F, 3, 1, 2, 0.0F, true));

        this.leftLowerLeg = new AdvancedModelRenderer(this);
        this.leftLowerLeg.setRotationPoint(2.2625F, 0.1281F, -0.2687F);
        this.leftUpperLeg.addChild(leftLowerLeg);
        this.setRotateAngle(leftLowerLeg, 0.0F, -1.0036F, 0.0F);
        this.leftLowerLeg.cubeList.add(new ModelBox(leftLowerLeg, 24, 35, -0.2122F, -0.5F, -0.897F, 3, 1, 1, 0.01F, true));
        this.leftLowerLeg.cubeList.add(new ModelBox(leftLowerLeg, 8, 36, -0.2122F, -0.5F, -0.397F, 3, 1, 1, 0.0F, true));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(2.8F, -0.3F, -0.3F);
        this.leftLowerLeg.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.1658F, 0.4145F, -0.1047F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.2699F, -0.3134F, 0.7612F);
        this.leftFoot.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3033F, 0.6194F, -0.0906F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 34, -0.0902F, 0.0113F, -1.5326F, 2, 1, 2, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.1482F, 2.5068F);
        this.pelvis.addChild(tail1);
        this.setRotateAngle(tail1, -0.0873F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 0, -1.0F, -0.65F, -0.85F, 2, 2, 6, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 4.95F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0175F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 15, -0.2F, -1.1F, -0.7F, 1, 2, 6, 0.001F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 14, 15, -0.8F, -1.1F, -0.7F, 1, 2, 6, 0.001F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1F, 5.1F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0349F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 16, 0, -0.5F, -0.9F, 0.0F, 1, 1, 6, 0.01F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 23, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.3F, 5.9F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 16, 7, -0.5F, -0.5F, -0.1F, 1, 1, 6, -0.01F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.chest.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.chest.offsetY = -0.8F;
        this.chest.offsetX = 0.3F;
        this.chest.offsetZ = 2.0F;
        this.chest.rotateAngleY = (float)Math.toRadians(210);
        this.chest.rotateAngleX = (float)Math.toRadians(14);
        this.chest.rotateAngleZ = (float)Math.toRadians(-8);
        this.chest.scaleChildren = true;
        float scaler = 1.2F;
        this.chest.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.chest.render(f);
        //Reset rotations, positions and sizing:
        this.chest.setScale(1.0F, 1.0F, 1.0F);
        this.chest.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {

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
        this.chest.offsetY = 0.0F;

        EntityPrehistoricFloraMonjurosuchus proteros = (EntityPrehistoricFloraMonjurosuchus) e;

//        this.faceTarget(f3, f4, 10, neck1);
//        this.faceTarget(f3, f4, 10, neck2);
//        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        proteros.tailBuffer.applyChainSwingBuffer(Tail);

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMonjurosuchus ee = (EntityPrehistoricFloraMonjurosuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (ee.getIsFast()) { //Running
                animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }



    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMonjurosuchus entity = (EntityPrehistoricFloraMonjurosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (10.21844-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.51748-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-6.98094-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 10.21844 + (((tickAnim - 7) / 4) * (6.96844-(10.21844)));
            yy = 0.51748 + (((tickAnim - 7) / 4) * (0.51748-(0.51748)));
            zz = -6.98094 + (((tickAnim - 7) / 4) * (-6.98094-(-6.98094)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 6.96844 + (((tickAnim - 11) / 4) * (0-(6.96844)));
            yy = 0.51748 + (((tickAnim - 11) / 4) * (0-(0.51748)));
            zz = -6.98094 + (((tickAnim - 11) / 4) * (0-(-6.98094)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -1.25 + (((tickAnim - 7) / 4) * (15.5-(-1.25)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 15.5 + (((tickAnim - 11) / 4) * (-14-(15.5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -14 + (((tickAnim - 15) / 5) * (0-(-14)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (15.25-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 15.25 + (((tickAnim - 7) / 4) * (0-(15.25)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (16-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 16 + (((tickAnim - 13) / 2) * (0-(16)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMonjurosuchus entity = (EntityPrehistoricFloraMonjurosuchus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 16.75 + (((tickAnim - 3) / 5) * (4.5-(16.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.5 + (((tickAnim - 8) / 2) * (0-(4.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -17.5 + (((tickAnim - 3) / 5) * (-11.5-(-17.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -11.5 + (((tickAnim - 8) / 2) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 20.25 + (((tickAnim - 3) / 5) * (0-(20.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMonjurosuchus entity = (EntityPrehistoricFloraMonjurosuchus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*1), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-4), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*2));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0.15 + (((tickAnim - 7) / 7) * (0-(0.15)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 7) * (0.15-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.15 + (((tickAnim - 21) / 4) * (0-(0.15)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 37.31012 + (((tickAnim - 0) / 7) * (17.05961-(37.31012)));
            yy = 19.3224 + (((tickAnim - 0) / 7) * (-10.201-(19.3224)));
            zz = 28.8441 + (((tickAnim - 0) / 7) * (33.9056-(28.8441)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 17.05961 + (((tickAnim - 7) / 7) * (3.70061-(17.05961)));
            yy = -10.201 + (((tickAnim - 7) / 7) * (-30.0523-(-10.201)));
            zz = 33.9056 + (((tickAnim - 7) / 7) * (-6.4222-(33.9056)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 3.70061 + (((tickAnim - 14) / 11) * (37.31012-(3.70061)));
            yy = -30.0523 + (((tickAnim - 14) / 11) * (19.3224-(-30.0523)));
            zz = -6.4222 + (((tickAnim - 14) / 11) * (28.8441-(-6.4222)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(xx), rightUpperArm.rotateAngleY + (float) Math.toRadians(yy), rightUpperArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0.25 + (((tickAnim - 0) / 14) * (0-(0.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 11) * (0.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightUpperArm.rotationPointX = this.rightUpperArm.rotationPointX + (float)(xx);
        this.rightUpperArm.rotationPointY = this.rightUpperArm.rotationPointY - (float)(yy);
        this.rightUpperArm.rotationPointZ = this.rightUpperArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 72.32187 + (((tickAnim - 0) / 3) * (76.33682-(72.32187)));
            yy = -34.4771 + (((tickAnim - 0) / 3) * (2.43518-(-34.4771)));
            zz = -28.3356 + (((tickAnim - 0) / 3) * (-15.25244-(-28.3356)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 76.33682 + (((tickAnim - 3) / 4) * (25.13843-(76.33682)));
            yy = 2.43518 + (((tickAnim - 3) / 4) * (3.97012-(2.43518)));
            zz = -15.25244 + (((tickAnim - 3) / 4) * (0.28382-(-15.25244)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 25.13843 + (((tickAnim - 7) / 3) * (0.85035-(25.13843)));
            yy = 3.97012 + (((tickAnim - 7) / 3) * (2.99098-(3.97012)));
            zz = 0.28382 + (((tickAnim - 7) / 3) * (-4.12394-(0.28382)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0.85035 + (((tickAnim - 10) / 4) * (3.06227-(0.85035)));
            yy = 2.99098 + (((tickAnim - 10) / 4) * (2.01184-(2.99098)));
            zz = -4.12394 + (((tickAnim - 10) / 4) * (-8.5317-(-4.12394)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 3.06227 + (((tickAnim - 14) / 11) * (72.32187-(3.06227)));
            yy = 2.01184 + (((tickAnim - 14) / 11) * (-34.4771-(2.01184)));
            zz = -8.5317 + (((tickAnim - 14) / 11) * (-28.3356-(-8.5317)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerArmw, rightLowerArmw.rotateAngleX + (float) Math.toRadians(xx), rightLowerArmw.rotateAngleY + (float) Math.toRadians(yy), rightLowerArmw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.23-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.21-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.08-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0.23 + (((tickAnim - 3) / 4) * (-0.1-(0.23)));
            yy = 0.21 + (((tickAnim - 3) / 4) * (0.35-(0.21)));
            zz = 0.08 + (((tickAnim - 3) / 4) * (0.15-(0.08)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -0.1 + (((tickAnim - 7) / 7) * (0-(-0.1)));
            yy = 0.35 + (((tickAnim - 7) / 7) * (0-(0.35)));
            zz = 0.15 + (((tickAnim - 7) / 7) * (0-(0.15)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLowerArmw.rotationPointX = this.rightLowerArmw.rotationPointX + (float)(xx);
        this.rightLowerArmw.rotationPointY = this.rightLowerArmw.rotationPointY - (float)(yy);
        this.rightLowerArmw.rotationPointZ = this.rightLowerArmw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -22.75802 + (((tickAnim - 0) / 5) * (-8.24974-(-22.75802)));
            yy = 2.63267 + (((tickAnim - 0) / 5) * (1.55818-(2.63267)));
            zz = 79.05203 + (((tickAnim - 0) / 5) * (-31.06244-(79.05203)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -8.24974 + (((tickAnim - 5) / 4) * (-1.06373-(-8.24974)));
            yy = 1.55818 + (((tickAnim - 5) / 4) * (-0.29992-(1.55818)));
            zz = -31.06244 + (((tickAnim - 5) / 4) * (5.93264-(-31.06244)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -1.06373 + (((tickAnim - 9) / 5) * (8.5-(-1.06373)));
            yy = -0.29992 + (((tickAnim - 9) / 5) * (0-(-0.29992)));
            zz = 5.93264 + (((tickAnim - 9) / 5) * (13-(5.93264)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 8.5 + (((tickAnim - 14) / 6) * (-15.44813-(8.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (2.07857-(0)));
            zz = 13 + (((tickAnim - 14) / 6) * (40.72113-(13)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -15.44813 + (((tickAnim - 20) / 5) * (-22.75802-(-15.44813)));
            yy = 2.07857 + (((tickAnim - 20) / 5) * (2.63267-(2.07857)));
            zz = 40.72113 + (((tickAnim - 20) / 5) * (79.05203-(40.72113)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -0.55 + (((tickAnim - 0) / 14) * (0.175-(-0.55)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0.175 + (((tickAnim - 14) / 6) * (0.265-(0.175)));
            yy = 0.075 + (((tickAnim - 14) / 6) * (0.01-(0.075)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0.265 + (((tickAnim - 20) / 5) * (-0.55-(0.265)));
            yy = 0.01 + (((tickAnim - 20) / 5) * (0-(0.01)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 3.70061 + (((tickAnim - 0) / 11) * (31.46855-(3.70061)));
            yy = 30.05226 + (((tickAnim - 0) / 11) * (-23.83466-(30.05226)));
            zz = 6.4222 + (((tickAnim - 0) / 11) * (-19.57074-(6.4222)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 31.46855 + (((tickAnim - 11) / 7) * (17.05961-(31.46855)));
            yy = -23.83466 + (((tickAnim - 11) / 7) * (10.20096-(-23.83466)));
            zz = -19.57074 + (((tickAnim - 11) / 7) * (-33.90562-(-19.57074)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 17.05961 + (((tickAnim - 18) / 7) * (3.70061-(17.05961)));
            yy = 10.20096 + (((tickAnim - 18) / 7) * (30.05226-(10.20096)));
            zz = -33.90562 + (((tickAnim - 18) / 7) * (6.4222-(-33.90562)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(xx), leftUpperArm.rotateAngleY + (float) Math.toRadians(yy), leftUpperArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.225-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0.225 + (((tickAnim - 11) / 14) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftUpperArm.rotationPointX = this.leftUpperArm.rotationPointX + (float)(xx);
        this.leftUpperArm.rotationPointY = this.leftUpperArm.rotationPointY - (float)(yy);
        this.leftUpperArm.rotationPointZ = this.leftUpperArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 3.06227 + (((tickAnim - 0) / 11) * (72.32187-(3.06227)));
            yy = 2.01184 + (((tickAnim - 0) / 11) * (34.47711-(2.01184)));
            zz = -8.5317 + (((tickAnim - 0) / 11) * (28.3356-(-8.5317)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 72.32187 + (((tickAnim - 11) / 3) * (68.43563-(72.32187)));
            yy = 34.47711 + (((tickAnim - 11) / 3) * (15.14222-(34.47711)));
            zz = 28.3356 + (((tickAnim - 11) / 3) * (18.9729-(28.3356)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 68.43563 + (((tickAnim - 14) / 4) * (25.13843-(68.43563)));
            yy = 15.14222 + (((tickAnim - 14) / 4) * (3.97012-(15.14222)));
            zz = 18.9729 + (((tickAnim - 14) / 4) * (0.28382-(18.9729)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 25.13843 + (((tickAnim - 18) / 3) * (0.85035-(25.13843)));
            yy = 3.97012 + (((tickAnim - 18) / 3) * (2.99098-(3.97012)));
            zz = 0.28382 + (((tickAnim - 18) / 3) * (-4.12394-(0.28382)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0.85035 + (((tickAnim - 21) / 4) * (3.06227-(0.85035)));
            yy = 2.99098 + (((tickAnim - 21) / 4) * (2.01184-(2.99098)));
            zz = -4.12394 + (((tickAnim - 21) / 4) * (-8.5317-(-4.12394)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerArmw, leftLowerArmw.rotateAngleX + (float) Math.toRadians(xx), leftLowerArmw.rotateAngleY + (float) Math.toRadians(yy), leftLowerArmw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (-0.35-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0.525-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0.15-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -0.35 + (((tickAnim - 18) / 7) * (0-(-0.35)));
            yy = 0.525 + (((tickAnim - 18) / 7) * (0-(0.525)));
            zz = 0.15 + (((tickAnim - 18) / 7) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLowerArmw.rotationPointX = this.leftLowerArmw.rotationPointX + (float)(xx);
        this.leftLowerArmw.rotationPointY = this.leftLowerArmw.rotationPointY - (float)(yy);
        this.leftLowerArmw.rotationPointZ = this.leftLowerArmw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-22.2358-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-1.58474-(0)));
            zz = 1.5 + (((tickAnim - 0) / 6) * (-48.36326-(1.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -22.2358 + (((tickAnim - 6) / 5) * (-23.16446-(-22.2358)));
            yy = -1.58474 + (((tickAnim - 6) / 5) * (-3.27098-(-1.58474)));
            zz = -48.36326 + (((tickAnim - 6) / 5) * (-67.54831-(-48.36326)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -23.16446 + (((tickAnim - 11) / 3) * (-11.37334-(-23.16446)));
            yy = -3.27098 + (((tickAnim - 11) / 3) * (7.41254-(-3.27098)));
            zz = -67.54831 + (((tickAnim - 11) / 3) * (22.95804-(-67.54831)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -11.37334 + (((tickAnim - 14) / 4) * (-3.69789-(-11.37334)));
            yy = 7.41254 + (((tickAnim - 14) / 4) * (5.88095-(7.41254)));
            zz = 22.95804 + (((tickAnim - 14) / 4) * (62.48826-(22.95804)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -3.69789 + (((tickAnim - 18) / 4) * (-4.05493-(-3.69789)));
            yy = 5.88095 + (((tickAnim - 18) / 4) * (3.21763-(5.88095)));
            zz = 62.48826 + (((tickAnim - 18) / 4) * (10.37882-(62.48826)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -4.05493 + (((tickAnim - 22) / 3) * (0-(-4.05493)));
            yy = 3.21763 + (((tickAnim - 22) / 3) * (0-(3.21763)));
            zz = 10.37882 + (((tickAnim - 22) / 3) * (1.5-(10.37882)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.075-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = -0.075 + (((tickAnim - 6) / 8) * (0-(-0.075)));
            yy = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*4), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*4), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*4), body1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-4), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))));


        this.setRotateAngle(pelvis, pelvis.rotateAngleX + (float) Math.toRadians(0), pelvis.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*-4), pelvis.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*3));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (6.78262-(0)));
            yy = -11.25 + (((tickAnim - 0) / 5) * (7.25404-(-11.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (-5.19698-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 6.78262 + (((tickAnim - 5) / 7) * (7.09299-(6.78262)));
            yy = 7.25404 + (((tickAnim - 5) / 7) * (32.07417-(7.25404)));
            zz = -5.19698 + (((tickAnim - 5) / 7) * (-11.67352-(-5.19698)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 7.09299 + (((tickAnim - 12) / 6) * (0.21536-(7.09299)));
            yy = 32.07417 + (((tickAnim - 12) / 6) * (16.84935-(32.07417)));
            zz = -11.67352 + (((tickAnim - 12) / 6) * (30.8379-(-11.67352)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0.21536 + (((tickAnim - 18) / 7) * (0-(0.21536)));
            yy = 16.84935 + (((tickAnim - 18) / 7) * (-11.25-(16.84935)));
            zz = 30.8379 + (((tickAnim - 18) / 7) * (0-(30.8379)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperLeg, rightUpperLeg.rotateAngleX + (float) Math.toRadians(xx), rightUpperLeg.rotateAngleY + (float) Math.toRadians(yy), rightUpperLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.225-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = -0.225 + (((tickAnim - 12) / 13) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightUpperLeg.rotationPointX = this.rightUpperLeg.rotationPointX + (float)(xx);
        this.rightUpperLeg.rotationPointY = this.rightUpperLeg.rotationPointY - (float)(yy);
        this.rightUpperLeg.rotationPointZ = this.rightUpperLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 5.76938 + (((tickAnim - 0) / 6) * (-0.78148-(5.76938)));
            yy = -20.53486 + (((tickAnim - 0) / 6) * (-1.18346-(-20.53486)));
            zz = -5.41234 + (((tickAnim - 0) / 6) * (-3.1254-(-5.41234)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -0.78148 + (((tickAnim - 6) / 6) * (13.35779-(-0.78148)));
            yy = -1.18346 + (((tickAnim - 6) / 6) * (-12.25465-(-1.18346)));
            zz = -3.1254 + (((tickAnim - 6) / 6) * (13.88883-(-3.1254)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 13.35779 + (((tickAnim - 12) / 3) * (20.50002-(13.35779)));
            yy = -12.25465 + (((tickAnim - 12) / 3) * (21.2526-(-12.25465)));
            zz = 13.88883 + (((tickAnim - 12) / 3) * (-24.21706-(13.88883)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 20.50002 + (((tickAnim - 15) / 3) * (52.47977-(20.50002)));
            yy = 21.2526 + (((tickAnim - 15) / 3) * (5.77356-(21.2526)));
            zz = -24.21706 + (((tickAnim - 15) / 3) * (-19.6643-(-24.21706)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 52.47977 + (((tickAnim - 18) / 4) * (30.77109-(52.47977)));
            yy = 5.77356 + (((tickAnim - 18) / 4) * (-14.24999-(5.77356)));
            zz = -19.6643 + (((tickAnim - 18) / 4) * (-1.02373-(-19.6643)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 30.77109 + (((tickAnim - 22) / 3) * (5.76938-(30.77109)));
            yy = -14.24999 + (((tickAnim - 22) / 3) * (-20.53486-(-14.24999)));
            zz = -1.02373 + (((tickAnim - 22) / 3) * (-5.41234-(-1.02373)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerLeg, rightLowerLeg.rotateAngleX + (float) Math.toRadians(xx), rightLowerLeg.rotateAngleY + (float) Math.toRadians(yy), rightLowerLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0.025-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.2-(0)));
            zz = 0.225 + (((tickAnim - 0) / 12) * (0-(0.225)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0.025 + (((tickAnim - 12) / 13) * (0-(0.025)));
            yy = -0.2 + (((tickAnim - 12) / 13) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 12) / 13) * (0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLowerLeg.rotationPointX = this.rightLowerLeg.rotationPointX + (float)(xx);
        this.rightLowerLeg.rotationPointY = this.rightLowerLeg.rotationPointY - (float)(yy);
        this.rightLowerLeg.rotationPointZ = this.rightLowerLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-15.63978-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-2.16227-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-4.50415-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -15.63978 + (((tickAnim - 12) / 3) * (-14.37886-(-15.63978)));
            yy = -2.16227 + (((tickAnim - 12) / 3) * (55.34457-(-2.16227)));
            zz = -4.50415 + (((tickAnim - 12) / 3) * (-14.95906-(-4.50415)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -14.37886 + (((tickAnim - 15) / 3) * (-14.46815-(-14.37886)));
            yy = 55.34457 + (((tickAnim - 15) / 3) * (51.1439-(55.34457)));
            zz = -14.95906 + (((tickAnim - 15) / 3) * (-22.7472-(-14.95906)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -14.46815 + (((tickAnim - 18) / 4) * (4.54937-(-14.46815)));
            yy = 51.1439 + (((tickAnim - 18) / 4) * (21.91881-(51.1439)));
            zz = -22.7472 + (((tickAnim - 18) / 4) * (-9.7488-(-22.7472)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 4.54937 + (((tickAnim - 22) / 3) * (0-(4.54937)));
            yy = 21.91881 + (((tickAnim - 22) / 3) * (0-(21.91881)));
            zz = -9.7488 + (((tickAnim - 22) / 3) * (0-(-9.7488)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 7.19534 + (((tickAnim - 0) / 7) * (0.21536-(7.19534)));
            yy = -31.89087 + (((tickAnim - 0) / 7) * (-16.8493-(-31.89087)));
            zz = 6.7633 + (((tickAnim - 0) / 7) * (-30.8379-(6.7633)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0.21536 + (((tickAnim - 7) / 6) * (0-(0.21536)));
            yy = -16.8493 + (((tickAnim - 7) / 6) * (3.75-(-16.8493)));
            zz = -30.8379 + (((tickAnim - 7) / 6) * (0-(-30.8379)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (7.19534-(0)));
            yy = 3.75 + (((tickAnim - 13) / 12) * (-31.89087-(3.75)));
            zz = 0 + (((tickAnim - 13) / 12) * (6.7633-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperLeg, leftUpperLeg.rotateAngleX + (float) Math.toRadians(xx), leftUpperLeg.rotateAngleY + (float) Math.toRadians(yy), leftUpperLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = -0.35 + (((tickAnim - 0) / 13) * (0-(-0.35)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (-0.35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftUpperLeg.rotationPointX = this.leftUpperLeg.rotationPointX + (float)(xx);
        this.leftUpperLeg.rotationPointY = this.leftUpperLeg.rotationPointY - (float)(yy);
        this.leftUpperLeg.rotationPointZ = this.leftUpperLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -20.12184 + (((tickAnim - 0) / 3) * (20.50002-(-20.12184)));
            yy = -14.34904 + (((tickAnim - 0) / 3) * (-21.2526-(-14.34904)));
            zz = 23.57789 + (((tickAnim - 0) / 3) * (24.2171-(23.57789)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 20.50002 + (((tickAnim - 3) / 4) * (62.83509-(20.50002)));
            yy = -21.2526 + (((tickAnim - 3) / 4) * (-8.86418-(-21.2526)));
            zz = 24.2171 + (((tickAnim - 3) / 4) * (8.23254-(24.2171)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 62.83509 + (((tickAnim - 7) / 3) * (30.77109-(62.83509)));
            yy = -8.86418 + (((tickAnim - 7) / 3) * (14.25-(-8.86418)));
            zz = 8.23254 + (((tickAnim - 7) / 3) * (1.0237-(8.23254)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 30.77109 + (((tickAnim - 10) / 3) * (5.76938-(30.77109)));
            yy = 14.25 + (((tickAnim - 10) / 3) * (20.5349-(14.25)));
            zz = 1.0237 + (((tickAnim - 10) / 3) * (5.4123-(1.0237)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 5.76938 + (((tickAnim - 13) / 12) * (-20.12184-(5.76938)));
            yy = 20.5349 + (((tickAnim - 13) / 12) * (-14.34904-(20.5349)));
            zz = 5.4123 + (((tickAnim - 13) / 12) * (23.57789-(5.4123)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerLeg, leftLowerLeg.rotateAngleX + (float) Math.toRadians(xx), leftLowerLeg.rotateAngleY + (float) Math.toRadians(yy), leftLowerLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.2 + (((tickAnim - 0) / 7) * (-0.09-(-0.2)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.13-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -0.09 + (((tickAnim - 7) / 6) * (0-(-0.09)));
            yy = -0.175 + (((tickAnim - 7) / 6) * (0-(-0.175)));
            zz = 0.13 + (((tickAnim - 7) / 6) * (0.225-(0.13)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (-0.2-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0.225 + (((tickAnim - 13) / 12) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLowerLeg.rotationPointX = this.leftLowerLeg.rotationPointX + (float)(xx);
        this.leftLowerLeg.rotationPointY = this.leftLowerLeg.rotationPointY - (float)(yy);
        this.leftLowerLeg.rotationPointZ = this.leftLowerLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -15.63978 + (((tickAnim - 0) / 3) * (-14.37886-(-15.63978)));
            yy = 2.1623 + (((tickAnim - 0) / 3) * (-55.3446-(2.1623)));
            zz = 4.5041 + (((tickAnim - 0) / 3) * (14.9591-(4.5041)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -14.37886 + (((tickAnim - 3) / 4) * (-14.46815-(-14.37886)));
            yy = -55.3446 + (((tickAnim - 3) / 4) * (-51.1439-(-55.3446)));
            zz = 14.9591 + (((tickAnim - 3) / 4) * (22.7472-(14.9591)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -14.46815 + (((tickAnim - 7) / 3) * (4.54937-(-14.46815)));
            yy = -51.1439 + (((tickAnim - 7) / 3) * (-21.9188-(-51.1439)));
            zz = 22.7472 + (((tickAnim - 7) / 3) * (9.7488-(22.7472)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 4.54937 + (((tickAnim - 10) / 3) * (0-(4.54937)));
            yy = -21.9188 + (((tickAnim - 10) / 3) * (0-(-21.9188)));
            zz = 9.7488 + (((tickAnim - 10) / 3) * (0-(9.7488)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (-14.33949-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (-1.2985-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (-10.80264-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -14.33949 + (((tickAnim - 20) / 5) * (-15.63978-(-14.33949)));
            yy = -1.2985 + (((tickAnim - 20) / 5) * (2.1623-(-1.2985)));
            zz = -10.80264 + (((tickAnim - 20) / 5) * (4.5041-(-10.80264)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*-1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*4), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+250))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+350))*8), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+350))*10), tail4.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMonjurosuchus entity = (EntityPrehistoricFloraMonjurosuchus) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*-10), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*2));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*-0.5);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0);
        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(89.08458), rightUpperArm.rotateAngleY + (float) Math.toRadians(27.26038), rightUpperArm.rotateAngleZ + (float) Math.toRadians(5.96287));
        this.setRotateAngle(rightLowerArm, rightLowerArm.rotateAngleX + (float) Math.toRadians(0), rightLowerArm.rotateAngleY + (float) Math.toRadians(35.25), rightLowerArm.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(-37.5));
        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(89.11292), leftUpperArm.rotateAngleY + (float) Math.toRadians(-26.7612), leftUpperArm.rotateAngleZ + (float) Math.toRadians(-2.31874));
        this.setRotateAngle(leftLowerArm, leftLowerArm.rotateAngleX + (float) Math.toRadians(0), leftLowerArm.rotateAngleY + (float) Math.toRadians(-35.25), leftLowerArm.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(37.5));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(12.5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-100))*10), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-9.25), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-250))*-10), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*10), body1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+50))*-10), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))));
        this.setRotateAngle(pelvis, pelvis.rotateAngleX + (float) Math.toRadians(0), pelvis.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+100))*-10), pelvis.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*3));
        this.setRotateAngle(rightUpperLeg, rightUpperLeg.rotateAngleX + (float) Math.toRadians(32.19645), rightUpperLeg.rotateAngleY + (float) Math.toRadians(74.9019), rightUpperLeg.rotateAngleZ + (float) Math.toRadians(-38.4699));
        this.setRotateAngle(rightLowerLeg, rightLowerLeg.rotateAngleX + (float) Math.toRadians(5.99687), rightLowerLeg.rotateAngleY + (float) Math.toRadians(-16.4612), rightLowerLeg.rotateAngleZ + (float) Math.toRadians(-14.7519));
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(-5.99252), rightFoot.rotateAngleY + (float) Math.toRadians(42.6036), rightFoot.rotateAngleZ + (float) Math.toRadians(-17.9958));
        this.setRotateAngle(leftUpperLeg, leftUpperLeg.rotateAngleX + (float) Math.toRadians(32.19645), leftUpperLeg.rotateAngleY + (float) Math.toRadians(-74.90189), leftUpperLeg.rotateAngleZ + (float) Math.toRadians(38.46993));
        this.setRotateAngle(leftLowerLeg, leftLowerLeg.rotateAngleX + (float) Math.toRadians(5.99687), leftLowerLeg.rotateAngleY + (float) Math.toRadians(16.46116), leftLowerLeg.rotateAngleZ + (float) Math.toRadians(14.75187));
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(-5.99252), leftFoot.rotateAngleY + (float) Math.toRadians(-42.60361), leftFoot.rotateAngleZ + (float) Math.toRadians(17.99582));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*10), tail1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+50))*-14), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+150))*18), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540+150))*24), tail4.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMonjurosuchus entity = (EntityPrehistoricFloraMonjurosuchus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-7), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*2));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-0.2);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0);
        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(78.6096), rightUpperArm.rotateAngleY + (float) Math.toRadians(29.76991), rightUpperArm.rotateAngleZ + (float) Math.toRadians(-12.44763));
        this.setRotateAngle(rightLowerArm, rightLowerArm.rotateAngleX + (float) Math.toRadians(1.10299), rightLowerArm.rotateAngleY + (float) Math.toRadians(32.73277), rightLowerArm.rotateAngleZ + (float) Math.toRadians(6.09383));
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(-48));
        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(78.6096), leftUpperArm.rotateAngleY + (float) Math.toRadians(-29.76991), leftUpperArm.rotateAngleZ + (float) Math.toRadians(12.44763));
        this.setRotateAngle(leftLowerArm, leftLowerArm.rotateAngleX + (float) Math.toRadians(-1.10299), leftLowerArm.rotateAngleY + (float) Math.toRadians(-32.73277), leftLowerArm.rotateAngleZ + (float) Math.toRadians(-6.09383));
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(48));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(12.5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*4), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-9.25), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*-4), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*7), body1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-7), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))));
        this.setRotateAngle(pelvis, pelvis.rotateAngleX + (float) Math.toRadians(0), pelvis.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*-7), pelvis.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*3));
        this.setRotateAngle(rightUpperLeg, rightUpperLeg.rotateAngleX + (float) Math.toRadians(32.19645), rightUpperLeg.rotateAngleY + (float) Math.toRadians(74.9019), rightUpperLeg.rotateAngleZ + (float) Math.toRadians(-38.4699));
        this.setRotateAngle(rightLowerLeg, rightLowerLeg.rotateAngleX + (float) Math.toRadians(5.99687), rightLowerLeg.rotateAngleY + (float) Math.toRadians(-16.4612), rightLowerLeg.rotateAngleZ + (float) Math.toRadians(-14.7519));
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(-5.99252), rightFoot.rotateAngleY + (float) Math.toRadians(42.6036), rightFoot.rotateAngleZ + (float) Math.toRadians(-17.9958));
        this.setRotateAngle(leftUpperLeg, leftUpperLeg.rotateAngleX + (float) Math.toRadians(32.19645), leftUpperLeg.rotateAngleY + (float) Math.toRadians(-74.90189), leftUpperLeg.rotateAngleZ + (float) Math.toRadians(38.46993));
        this.setRotateAngle(leftLowerLeg, leftLowerLeg.rotateAngleX + (float) Math.toRadians(5.99687), leftLowerLeg.rotateAngleY + (float) Math.toRadians(16.46116), leftLowerLeg.rotateAngleZ + (float) Math.toRadians(14.75187));
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(-5.99252), leftFoot.rotateAngleY + (float) Math.toRadians(-42.60361), leftFoot.rotateAngleZ + (float) Math.toRadians(17.99582));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*-1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*7), tail1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-9), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*15), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*18), tail4.rotateAngleZ + (float) Math.toRadians(0));

    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMonjurosuchus e = (EntityPrehistoricFloraMonjurosuchus) entity;
        animator.update(entity);

//            animator.setAnimation(e.ROAR_ANIMATION);
//            animator.startKeyframe(10);
//            animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
//            animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
//            animator.endKeyframe();
//            animator.setStaticKeyframe(10);
//            animator.resetKeyframe(10);

    }
}
