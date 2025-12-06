package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTenontosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTenontosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer leftArm4;
    private final AdvancedModelRenderer opposablePinkie;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer rightArm4;
    private final AdvancedModelRenderer opposablePinkie2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;

    private ModelAnimator animator;

    public ModelTenontosaurus() {
        this.textureWidth = 103;
        this.textureHeight = 100;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 2.5F, 10.3F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 26, -4.0F, -4.0F, -5.0F, 8, 13, 10, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.0F, 6.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 51, 78, 0.0F, -2.0F, -9.9F, 0, 2, 9, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(3.5F, -0.5F, -0.7F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.1745F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 66, -2.0F, -2.0F, -3.0F, 4, 12, 6, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 9.7F, -2.6F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.576F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 86, 0, -1.5F, -0.2F, -0.4F, 3, 9, 4, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 8.6F, 3.4F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6109F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 0, -1.5F, 0.1F, -2.7F, 3, 6, 3, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, 4.6F, -1.2F);
        this.leftLeg3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0274F, -0.1041F, 0.5141F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 26, -0.4F, -1.5F, -0.5F, 1, 3, 1, -0.01F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.5F, -0.4F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.2094F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 47, 0, -2.0F, -1.0319F, -3.2504F, 4, 2, 4, 0.0F, false));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, -0.2319F, -2.6504F);
        this.leftLeg4.addChild(leftLeg5);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 54, 18, -2.0F, -0.8F, -3.6F, 4, 2, 4, -0.003F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.5F, -0.5F, -0.7F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.1745F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 66, -2.0F, -2.0F, -3.0F, 4, 12, 6, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 9.7F, -2.6F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.576F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 86, 0, -1.5F, -0.2F, -0.4F, 3, 9, 4, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 8.6F, 3.4F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6109F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 0, -1.5F, 0.1F, -2.7F, 3, 6, 3, -0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.0F, 4.6F, -1.2F);
        this.rightLeg3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0274F, 0.1041F, -0.5141F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 26, -0.6F, -1.5F, -0.5F, 1, 3, 1, -0.01F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.5F, -0.4F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.2094F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 47, 0, -2.0F, -1.0319F, -3.2504F, 4, 2, 4, 0.0F, true));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, -0.2319F, -2.6504F);
        this.rightLeg4.addChild(rightLeg5);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 54, 18, -2.0F, -0.8F, -3.6F, 4, 2, 4, -0.003F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.9F, 4.8F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1222F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 37, 34, -3.0F, -2.0F, 5.0F, 6, 9, 10, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 33, 54, -3.5F, -2.0F, -1.0F, 7, 11, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.2F, 7.9F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 85, 0.0F, -2.6868F, -7.6325F, 0, 3, 8, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.2F, 7.9F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 0, -1.5F, -0.0868F, -8.0325F, 3, 2, 8, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -4.4881F, 11.6436F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 63, 86, 0.0F, -1.3F, -3.5F, 0, 3, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -3.0F, 8.0F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 85, -1.5F, -0.3F, -0.2F, 3, 2, 7, 0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 15.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0349F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 33, 14, -2.0F, -2.0F, -1.0F, 4, 7, 12, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.8F, -0.2F);
        this.tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 74, 7, 0.0F, -1.8066F, 0.1084F, 0, 2, 11, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -3.0F, -7.0F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 75, 72, -1.5F, -0.3F, 6.7F, 3, 2, 8, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 54, 0, -1.5F, -2.0F, -1.0F, 3, 5, 12, -0.003F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 75, 37, 0.0F, -2.8F, 0.0F, 0, 1, 11, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 58, 42, -1.0F, -2.0F, -1.0F, 2, 3, 12, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 75, 21, 0.0F, -2.7F, 0.0F, 0, 1, 11, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 60, 22, -0.5F, -2.0F, -1.0F, 1, 2, 12, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 37, 74, 0.0F, -2.6F, 0.0F, 0, 1, 11, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -1.6F, 11.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.1309F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 61, 58, -0.5F, -0.2F, 0.0F, 1, 1, 12, -0.005F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 62, 72, 0.0F, -0.7F, 0.0F, 0, 1, 12, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.hips.addChild(body);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 47, 59, 0.0F, -1.0F, -12.0F, 0, 1, 13, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -4.5F, 0.0F, -12.0F, 9, 12, 13, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 3.0F, -12.0F);
        this.body.addChild(chest);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 5.5F, -5.0F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 50, -4.0F, -7.073F, 0.0196F, 8, 7, 8, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.3F, -4.8F);
        this.chest.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5149F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 25, 50, 0.0F, -1.142F, -0.0599F, 0, 1, 6, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 21, 72, -3.5F, -0.142F, -0.0599F, 7, 6, 6, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(3.5F, 4.8F, -2.4F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.48F, 0.0F, -0.1745F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 61, 58, -1.0F, -1.4F, -1.5F, 2, 7, 3, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.2F, 5.2F, 1.2F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.6799F, 0.3503F, 0.0086F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 26, -1.0F, 0.0F, -1.6F, 2, 7, 2, -0.01F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 7.0F, -1.5F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.1962F, 0.4721F, 0.0902F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 32, 0, -0.5F, 0.0F, -0.1F, 1, 3, 2, 0.0F, false));

        this.leftArm4 = new AdvancedModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.leftArm3.addChild(leftArm4);
        this.leftArm4.cubeList.add(new ModelBox(leftArm4, 60, 37, -0.5F, -0.5F, -0.1F, 2, 1, 2, -0.003F, false));

        this.opposablePinkie = new AdvancedModelRenderer(this);
        this.opposablePinkie.setRotationPoint(0.0294F, 0.3F, 1.749F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 1.1781F, 0.0F, 0.0F);
        this.opposablePinkie.cubeList.add(new ModelBox(opposablePinkie, 25, 50, -0.5794F, -0.3392F, -0.6694F, 1, 2, 1, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-3.5F, 4.8F, -2.4F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.48F, 0.0F, 0.1745F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 61, 58, -1.0F, -1.4F, -1.5F, 2, 7, 3, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.2F, 5.2F, 1.2F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.6799F, -0.3503F, -0.0086F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 26, -1.0F, 0.0F, -1.6F, 2, 7, 2, -0.01F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 7.0F, -1.5F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.1962F, -0.4721F, -0.0902F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 32, 0, -0.5F, 0.0F, -0.1F, 1, 3, 2, 0.0F, true));

        this.rightArm4 = new AdvancedModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.rightArm3.addChild(rightArm4);
        this.rightArm4.cubeList.add(new ModelBox(rightArm4, 60, 37, -1.5F, -0.5F, -0.1F, 2, 1, 2, -0.003F, true));

        this.opposablePinkie2 = new AdvancedModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(-0.0294F, 0.3F, 1.749F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 1.1781F, 0.0F, 0.0F);
        this.opposablePinkie2.cubeList.add(new ModelBox(opposablePinkie2, 25, 50, -0.4206F, -0.3392F, -0.6694F, 1, 2, 1, 0.0F, true));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.chest.addChild(neck3);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.1F, -1.9F);
        this.neck3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1396F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 54, 56, 0.0F, -3.2F, -1.5F, 0, 1, 2, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 76, 58, -2.0F, -2.2F, -2.5F, 4, 5, 6, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.neck3.addChild(neck2);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.4F, -4.1F);
        this.neck2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.4712F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 27, 29, 0.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 80, 83, -1.5F, 0.0F, 0.0F, 3, 4, 7, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.7F, -4.3F);
        this.neck2.addChild(neck);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.8F, 0.3F);
        this.neck.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0175F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 51, 0.0F, -0.7258F, -3.0256F, 0, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.2F, -2.7F);
        this.neck.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1571F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 61, 74, -1.5F, 0.0F, 0.0F, 3, 4, 3, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.1F, -3.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.5236F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 15, 66, -0.2F, -0.2536F, -5.5F, 1, 1, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 66, -0.8F, -0.2536F, -5.5F, 1, 1, 4, -0.003F, true));
        this.head.cubeList.add(new ModelBox(head, 66, 29, 0.5F, 0.0464F, -5.1F, 0, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 66, 29, -0.5F, 0.0464F, -5.1F, 0, 1, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 2.1464F, -0.2F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 69, 37, -0.68F, -1.5F, -5.0F, 0, 1, 3, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 73, 6, -0.69F, -1.5F, -5.0F, 0, 1, 3, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 69, 37, 0.68F, -1.5F, -5.0F, 0, 1, 3, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 73, 6, 0.69F, -1.5F, -5.0F, 0, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.7464F, -3.1F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3491F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 49, 74, -1.2F, -2.0F, 0.0F, 1, 2, 2, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 49, 74, -0.5F, -2.0F, 0.0F, 1, 2, 2, -0.003F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 49, 74, 0.2F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.8F, 1.1464F, -5.9F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 45, 11, -0.2F, -0.9732F, -1.0536F, 2, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.3402F, -5.85F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3054F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 84, 39, -1.0F, -0.5F, -0.4F, 2, 1, 1, 0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.8F, 0.9464F, -5.5F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.5236F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 60, 41, -0.2F, -1.0F, -0.5F, 2, 1, 1, -0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.9536F, -5.1F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.5585F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 75, 40, -0.5F, -0.011F, -1.9604F, 1, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.6091F, -0.5786F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2793F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 73, 0, -1.5F, -1.7F, -1.0F, 3, 3, 2, 0.005F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -1.3536F, -3.1F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.192F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 75, 25, -0.5F, 0.6F, -2.0F, 1, 1, 2, -0.003F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 75, 44, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.3536F, -3.1F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0349F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 37, 39, -1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, -0.3639F, -2.0574F);
        this.head.addChild(eye);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.52F, 0.0F, 0.0F);
        this.eye.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0873F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 7, 10, -0.7F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 7, 10, 0.74F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.1464F, -0.2F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.3054F, 0.0F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 1.3F, -5.8F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3578F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 10, -1.0F, -0.9624F, -1.0145F, 2, 1, 1, -0.005F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.9F, -3.0F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1658F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 66, 25, -0.6F, -1.33F, -2.1421F, 0, 1, 2, 0.0F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 66, 25, 0.6F, -1.33F, -2.1421F, 0, 1, 2, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 37, 34, -0.8F, -1.03F, -2.8421F, 1, 1, 3, -0.003F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 37, 34, -0.2F, -1.03F, -2.8421F, 1, 1, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0436F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 60, 0, -0.69F, -0.5F, -5.0F, 0, 1, 2, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 50, -0.69F, -2.0F, -3.0F, 0, 2, 3, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 66, -0.7F, -0.5F, -5.0F, 0, 1, 2, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 26, 66, -0.7F, -2.0F, -3.0F, 0, 2, 3, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 75, 21, -1.2F, 0.0F, -3.0F, 1, 1, 2, -0.003F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 60, 0, 0.69F, -0.5F, -5.0F, 0, 1, 2, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 66, 0.7F, -0.5F, -5.0F, 0, 1, 2, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 50, 0.69F, -2.0F, -3.0F, 0, 2, 3, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 26, 66, 0.7F, -2.0F, -3.0F, 0, 2, 3, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 67, 18, -0.5F, 0.0F, -3.1F, 1, 1, 2, 0.004F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 55, 7, -1.5F, -1.0F, -1.8F, 3, 2, 2, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 75, 21, 0.2F, 0.0F, -3.0F, 1, 1, 2, -0.003F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.hips.offsetZ = -0.3F;
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        this.hips.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.5F;
        this.hips.offsetX = -0.27F;
        this.hips.rotateAngleY = (float)Math.toRadians(135);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.4F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        //this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {

        EntityPrehistoricFloraTenontosaurus walker = (EntityPrehistoricFloraTenontosaurus) e;

        AdvancedModelRenderer[] tailFull = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck3, this.neck2, this.neck, this.head};

        walker.tailBuffer.applyChainSwingBuffer(tailFull);

        float speed = 0.2F;

        //Animations:

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 4, head);

        if (walker.getAnimation() == walker.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!walker.isReallyInWater()) {

                if (f3 == 0.0F || !walker.getIsMoving()) {
                    if (walker.getAnimation() != walker.EAT_ANIMATION
                            && (!walker.isAnimationDirectionLocked(walker.getAnimation()))) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(tailFull, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(tailFull, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    return;
                }

                if (walker.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }



    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.eye.setScale(1,1,1);
        EntityPrehistoricFloraTenontosaurus ee = (EntityPrehistoricFloraTenontosaurus) entitylivingbaseIn;

        if ((!ee.isQuad() && ee.getAnimation() != ee.TOBI_ANIMATION) || ee.getAnimation() == ee.TOQUAD_ANIMATION) {
            //Bipedal Pose

            //And now the pose:
            this.setRotateAngle(body, -0.1178F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r12, 0.5149F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r13, -0.1396F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r14, -0.4712F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r15, -0.0175F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r16, -0.1571F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r18, -0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r19, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, -0.0274F, -0.1041F, 0.5141F);
            this.setRotateAngle(cube_r20, 0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r21, 0.5236F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r22, 0.5585F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r23, -0.2793F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r24, 0.192F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r25, -0.0349F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r26, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r27, -0.3578F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r28, 0.1658F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r29, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, -0.0274F, 0.1041F, -0.5141F);
            this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(head, 0.5236F, 0.0F, 0.0F);
            this.setRotateAngle(hips, -0.0829F, 0.0F, 0.0F);
            this.setRotateAngle(jaw, -0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(leftArm, 1.2174F, 0.0F, -0.1745F);
            this.setRotateAngle(leftArm2, -1.0857F, 0.3503F, 0.0086F);
            this.setRotateAngle(leftArm3, 0.2235F, 0.2166F, 0.2303F);
            this.setRotateAngle(leftArm4, 0.0F, 0.0F, 1.5053F);
            this.setRotateAngle(leftLeg, -0.0916F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg2, 0.576F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg3, -0.6109F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg4, 0.2094F, 0.0F, 0.0F);
            this.setRotateAngle(neck3, 0.2313F, 0.0F, 0.0F);
            this.setRotateAngle(opposablePinkie, 1.1781F, 0.0F, 0.0F);
            this.setRotateAngle(opposablePinkie2, 1.1781F, 0.0F, 0.0F);
            this.setRotateAngle(rightArm, 1.2174F, 0.0F, 0.1745F);
            this.setRotateAngle(rightArm2, -1.0857F, -0.3503F, -0.0086F);
            this.setRotateAngle(rightArm3, 0.2235F, -0.2166F, -0.0902F);
            this.setRotateAngle(rightArm4, 0.0F, 0.0F, -1.5053F);
            this.setRotateAngle(rightLeg, -0.0916F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg2, 0.576F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg3, -0.6109F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg4, 0.2094F, 0.0F, 0.0F);
            this.setRotateAngle(tail, -0.1222F, 0.0F, 0.0F);
            this.setRotateAngle(tail2, -0.0349F, 0.0F, 0.0F);
            this.setRotateAngle(tail4, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(tail5, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(tail6, -0.1309F, 0.0F, 0.0F);



        }

                //Is Walking:
        if (ee.getIsMoving() && !ee.isQuad()) {
            if(ee.getIsFast()) {
                animRunBi(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalkBi(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        } else if(ee.getIsMoving() && ee.isQuad()){
            animWalkQuad(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }




        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }



    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTenontosaurus entity = (EntityPrehistoricFloraTenontosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11 + (((tickAnim - 10) / 10) * (0-(11)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.175 + (((tickAnim - 10) / 10) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4 + (((tickAnim - 10) / 10) * (0-(4)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.325-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.325 + (((tickAnim - 10) / 10) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-28.70308-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.33928-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-15.74644-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -28.70308 + (((tickAnim - 10) / 10) * (0-(-28.70308)));
            yy = -0.33928 + (((tickAnim - 10) / 10) * (0-(-0.33928)));
            zz = -15.74644 + (((tickAnim - 10) / 10) * (0-(-15.74644)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-23-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -23 + (((tickAnim - 10) / 10) * (0-(-23)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (26.83501-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-23.8971-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (23.94668-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 26.83501 + (((tickAnim - 10) / 10) * (0-(26.83501)));
            yy = -23.8971 + (((tickAnim - 10) / 10) * (0-(-23.8971)));
            zz = 23.94668 + (((tickAnim - 10) / 10) * (0-(23.94668)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(0), leftArm4.rotateAngleY + (float) Math.toRadians(0), leftArm4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-28.70308-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.33928-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (15.7464-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -28.70308 + (((tickAnim - 10) / 10) * (0-(-28.70308)));
            yy = -0.33928 + (((tickAnim - 10) / 10) * (0-(-0.33928)));
            zz = 15.7464 + (((tickAnim - 10) / 10) * (0-(15.7464)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-23-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -23 + (((tickAnim - 10) / 10) * (0-(-23)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (26.83501-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (23.8971-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-23.9467-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 26.83501 + (((tickAnim - 10) / 10) * (0-(26.83501)));
            yy = 23.8971 + (((tickAnim - 10) / 10) * (0-(23.8971)));
            zz = -23.9467 + (((tickAnim - 10) / 10) * (0-(-23.9467)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightArm4, rightArm4.rotateAngleX + (float) Math.toRadians(0), rightArm4.rotateAngleY + (float) Math.toRadians(0), rightArm4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 22 + (((tickAnim - 6) / 4) * (22-(22)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 22 + (((tickAnim - 10) / 10) * (0-(22)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12 + (((tickAnim - 10) / 10) * (0-(12)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 9.75 + (((tickAnim - 10) / 2) * (16.63-(9.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 16.63 + (((tickAnim - 12) / 8) * (0-(16.63)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -11 + (((tickAnim - 10) / 2) * (1.67-(-11)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 1.67 + (((tickAnim - 12) / 8) * (0-(1.67)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (-0.005-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 3) / 4) * (1-(1)));
            yy = -0.005 + (((tickAnim - 3) / 4) * (1-(-0.005)));
            zz = 1 + (((tickAnim - 3) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 17.5 + (((tickAnim - 10) / 2) * (0-(17.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTenontosaurus entity = (EntityPrehistoricFloraTenontosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -10.25 + (((tickAnim - 15) / 20) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -10.25 + (((tickAnim - 35) / 15) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.35-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.1-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -5.35 + (((tickAnim - 15) / 20) * (-5.35-(-5.35)));
            zz = 1.1 + (((tickAnim - 15) / 20) * (1.1-(1.1)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -5.35 + (((tickAnim - 35) / 15) * (0-(-5.35)));
            zz = 1.1 + (((tickAnim - 35) / 15) * (0-(1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.69328-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-9.25498-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-4.49006-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0.69328 + (((tickAnim - 15) / 20) * (0.69328-(0.69328)));
            yy = -9.25498 + (((tickAnim - 15) / 20) * (-9.25498-(-9.25498)));
            zz = -4.49006 + (((tickAnim - 15) / 20) * (-4.49006-(-4.49006)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0.69328 + (((tickAnim - 35) / 15) * (0-(0.69328)));
            yy = -9.25498 + (((tickAnim - 35) / 15) * (0-(-9.25498)));
            zz = -4.49006 + (((tickAnim - 35) / 15) * (0-(-4.49006)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 22 + (((tickAnim - 15) / 20) * (22-(22)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 22 + (((tickAnim - 35) / 15) * (0-(22)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-50-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -50 + (((tickAnim - 15) / 20) * (-50-(-50)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -50 + (((tickAnim - 35) / 15) * (0-(-50)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (37.91287-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-3.44573-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.89604-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 37.91287 + (((tickAnim - 15) / 20) * (37.91287-(37.91287)));
            yy = -3.44573 + (((tickAnim - 15) / 20) * (-3.44573-(-3.44573)));
            zz = 2.89604 + (((tickAnim - 15) / 20) * (2.89604-(2.89604)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 37.91287 + (((tickAnim - 35) / 15) * (0-(37.91287)));
            yy = -3.44573 + (((tickAnim - 35) / 15) * (0-(-3.44573)));
            zz = 2.89604 + (((tickAnim - 35) / 15) * (0-(2.89604)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(0), leftLeg5.rotateAngleY + (float) Math.toRadians(0), leftLeg5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.69328-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (9.255-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.4901-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0.69328 + (((tickAnim - 15) / 20) * (0.69328-(0.69328)));
            yy = 9.255 + (((tickAnim - 15) / 20) * (9.255-(9.255)));
            zz = 4.4901 + (((tickAnim - 15) / 20) * (4.4901-(4.4901)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0.69328 + (((tickAnim - 35) / 15) * (0-(0.69328)));
            yy = 9.255 + (((tickAnim - 35) / 15) * (0-(9.255)));
            zz = 4.4901 + (((tickAnim - 35) / 15) * (0-(4.4901)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 22 + (((tickAnim - 15) / 20) * (22-(22)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 22 + (((tickAnim - 35) / 15) * (0-(22)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-50-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -50 + (((tickAnim - 15) / 20) * (-50-(-50)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -50 + (((tickAnim - 35) / 15) * (0-(-50)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (37.99973-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.19151-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-5.63134-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 37.99973 + (((tickAnim - 15) / 20) * (37.99973-(37.99973)));
            yy = -0.19151 + (((tickAnim - 15) / 20) * (-0.19151-(-0.19151)));
            zz = -5.63134 + (((tickAnim - 15) / 20) * (-5.63134-(-5.63134)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 37.99973 + (((tickAnim - 35) / 15) * (0-(37.99973)));
            yy = -0.19151 + (((tickAnim - 35) / 15) * (0-(-0.19151)));
            zz = -5.63134 + (((tickAnim - 35) / 15) * (0-(-5.63134)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(0), rightLeg5.rotateAngleY + (float) Math.toRadians(0), rightLeg5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -1.5 + (((tickAnim - 15) / 20) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -1.5 + (((tickAnim - 35) / 15) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 4.75 + (((tickAnim - 15) / 20) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 4.75 + (((tickAnim - 35) / 15) * (0-(4.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7.25 + (((tickAnim - 15) / 20) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 35) / 15) * (0-(7.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 8.5 + (((tickAnim - 15) / 20) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 8.5 + (((tickAnim - 35) / 15) * (0-(8.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.29723-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-3.08918-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.57791-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0.29723 + (((tickAnim - 15) / 20) * (0.29723-(0.29723)));
            yy = -3.08918 + (((tickAnim - 15) / 20) * (-3.08918-(-3.08918)));
            zz = -0.57791 + (((tickAnim - 15) / 20) * (-0.57791-(-0.57791)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0.29723 + (((tickAnim - 35) / 15) * (0-(0.29723)));
            yy = -3.08918 + (((tickAnim - 35) / 15) * (0-(-3.08918)));
            zz = -0.57791 + (((tickAnim - 35) / 15) * (0-(-0.57791)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 12.5 + (((tickAnim - 15) / 20) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12.5 + (((tickAnim - 35) / 15) * (0-(12.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -23.75 + (((tickAnim - 15) / 20) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 35) / 15) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (22.35877-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-4.88408-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (8.64572-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 22.35877 + (((tickAnim - 15) / 20) * (22.35877-(22.35877)));
            yy = -4.88408 + (((tickAnim - 15) / 20) * (-4.88408-(-4.88408)));
            zz = 8.64572 + (((tickAnim - 15) / 20) * (8.64572-(8.64572)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 22.35877 + (((tickAnim - 35) / 15) * (0-(22.35877)));
            yy = -4.88408 + (((tickAnim - 35) / 15) * (0-(-4.88408)));
            zz = 8.64572 + (((tickAnim - 35) / 15) * (0-(8.64572)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(0), leftArm4.rotateAngleY + (float) Math.toRadians(0), leftArm4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 12.5 + (((tickAnim - 15) / 20) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12.5 + (((tickAnim - 35) / 15) * (0-(12.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -23.75 + (((tickAnim - 15) / 20) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 35) / 15) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (22.35877-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (4.8841-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-8.6457-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 22.35877 + (((tickAnim - 15) / 20) * (22.35877-(22.35877)));
            yy = 4.8841 + (((tickAnim - 15) / 20) * (4.8841-(4.8841)));
            zz = -8.6457 + (((tickAnim - 15) / 20) * (-8.6457-(-8.6457)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 22.35877 + (((tickAnim - 35) / 15) * (0-(22.35877)));
            yy = 4.8841 + (((tickAnim - 35) / 15) * (0-(4.8841)));
            zz = -8.6457 + (((tickAnim - 35) / 15) * (0-(-8.6457)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightArm4, rightArm4.rotateAngleX + (float) Math.toRadians(0), rightArm4.rotateAngleY + (float) Math.toRadians(0), rightArm4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.5 + (((tickAnim - 15) / 20) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 35) / 15) * (0-(10.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 0) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 12) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 12) * (1-(1)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 12) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 12) / 6) * (0.0375-(1)));
            zz = 1 + (((tickAnim - 12) / 6) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 1 + (((tickAnim - 18) / 9) * (1-(1)));
            yy = 0.0375 + (((tickAnim - 18) / 9) * (1-(0.0375)));
            zz = 1 + (((tickAnim - 18) / 9) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTenontosaurus entity = (EntityPrehistoricFloraTenontosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.5 + (((tickAnim - 10) / 10) * (0-(0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0.5-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0.5 + (((tickAnim - 30) / 10) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (3.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 3.75 + (((tickAnim - 10) / 10) * (0-(3.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (3.75-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 3.75 + (((tickAnim - 30) / 10) * (0-(3.75)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -25.5 + (((tickAnim - 10) / 10) * (21-(-25.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 21 + (((tickAnim - 20) / 10) * (-25.5-(21)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -25.5 + (((tickAnim - 30) / 10) * (21-(-25.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 21 + (((tickAnim - 40) / 10) * (0-(21)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -12.75 + (((tickAnim - 5) / 5) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (26.75-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 26.75 + (((tickAnim - 20) / 5) * (-10.62-(26.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -10.62 + (((tickAnim - 25) / 5) * (0-(-10.62)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (26.75-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 26.75 + (((tickAnim - 40) / 5) * (-10.62-(26.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -10.62 + (((tickAnim - 45) / 5) * (0-(-10.62)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.725 + (((tickAnim - 5) / 5) * (-0.4-(0.725)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 10) / 10) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0.8-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0.8 + (((tickAnim - 25) / 5) * (-0.4-(0.8)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 30) / 10) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0.8-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.8 + (((tickAnim - 45) / 5) * (0-(0.8)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (23.19955-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-18.28305-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (11.34313-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 23.19955 + (((tickAnim - 10) / 10) * (0-(23.19955)));
            yy = -18.28305 + (((tickAnim - 10) / 10) * (0-(-18.28305)));
            zz = 11.34313 + (((tickAnim - 10) / 10) * (0-(11.34313)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (23.19955-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-18.28305-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (11.34313-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 23.19955 + (((tickAnim - 30) / 20) * (0-(23.19955)));
            yy = -18.28305 + (((tickAnim - 30) / 20) * (0-(-18.28305)));
            zz = 11.34313 + (((tickAnim - 30) / 20) * (0-(11.34313)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.475 + (((tickAnim - 10) / 10) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.475 + (((tickAnim - 30) / 20) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (89.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 89.5 + (((tickAnim - 5) / 5) * (0-(89.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (89.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 89.5 + (((tickAnim - 20) / 10) * (0-(89.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(xx), leftArm4.rotateAngleY + (float) Math.toRadians(yy), leftArm4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-5.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -5.5 + (((tickAnim - 10) / 10) * (0-(-5.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-5.5-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -5.5 + (((tickAnim - 30) / 10) * (0-(-5.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 21.80912 + (((tickAnim - 0) / 10) * (21.64608-(21.80912)));
            yy = -4.04313 + (((tickAnim - 0) / 10) * (-4.87616-(-4.04313)));
            zz = 2.68613 + (((tickAnim - 0) / 10) * (4.7826-(2.68613)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 21.64608 + (((tickAnim - 10) / 10) * (22.04228-(21.64608)));
            yy = -4.87616 + (((tickAnim - 10) / 10) * (-2.33832-(-4.87616)));
            zz = 4.7826 + (((tickAnim - 10) / 10) * (-1.5524-(4.7826)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 22.04228 + (((tickAnim - 20) / 10) * (21.64608-(22.04228)));
            yy = -2.33832 + (((tickAnim - 20) / 10) * (-4.87616-(-2.33832)));
            zz = -1.5524 + (((tickAnim - 20) / 10) * (4.7826-(-1.5524)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 21.64608 + (((tickAnim - 30) / 10) * (22.04228-(21.64608)));
            yy = -4.87616 + (((tickAnim - 30) / 10) * (-2.33832-(-4.87616)));
            zz = 4.7826 + (((tickAnim - 30) / 10) * (-1.5524-(4.7826)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 22.04228 + (((tickAnim - 40) / 10) * (21.80912-(22.04228)));
            yy = -2.33832 + (((tickAnim - 40) / 10) * (-4.04313-(-2.33832)));
            zz = -1.5524 + (((tickAnim - 40) / 10) * (2.68613-(-1.5524)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -5.62369 + (((tickAnim - 0) / 10) * (-5.74144-(-5.62369)));
            yy = -3.48466 + (((tickAnim - 0) / 10) * (-3.28661-(-3.48466)));
            zz = 12.90412 + (((tickAnim - 0) / 10) * (14.89777-(12.90412)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5.74144 + (((tickAnim - 10) / 10) * (-4.79787-(-5.74144)));
            yy = -3.28661 + (((tickAnim - 10) / 10) * (-4.55509-(-3.28661)));
            zz = 14.89777 + (((tickAnim - 10) / 10) * (1.17381-(14.89777)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -4.79787 + (((tickAnim - 20) / 10) * (-5.74144-(-4.79787)));
            yy = -4.55509 + (((tickAnim - 20) / 10) * (-3.28661-(-4.55509)));
            zz = 1.17381 + (((tickAnim - 20) / 10) * (14.89777-(1.17381)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5.74144 + (((tickAnim - 30) / 10) * (-4.79787-(-5.74144)));
            yy = -3.28661 + (((tickAnim - 30) / 10) * (-4.55509-(-3.28661)));
            zz = 14.89777 + (((tickAnim - 30) / 10) * (1.17381-(14.89777)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -4.79787 + (((tickAnim - 40) / 10) * (-5.62369-(-4.79787)));
            yy = -4.55509 + (((tickAnim - 40) / 10) * (-3.48466-(-4.55509)));
            zz = 1.17381 + (((tickAnim - 40) / 10) * (12.90412-(1.17381)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -3.09748 + (((tickAnim - 0) / 10) * (-3.57172-(-3.09748)));
            yy = -6.49849 + (((tickAnim - 0) / 10) * (-6.25116-(-6.49849)));
            zz = 5.32335 + (((tickAnim - 0) / 10) * (9.59256-(5.32335)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -3.57172 + (((tickAnim - 10) / 20) * (-3.57172-(-3.57172)));
            yy = -6.25116 + (((tickAnim - 10) / 20) * (-6.25116-(-6.25116)));
            zz = 9.59256 + (((tickAnim - 10) / 20) * (9.59256-(9.59256)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -3.57172 + (((tickAnim - 30) / 20) * (-3.09748-(-3.57172)));
            yy = -6.25116 + (((tickAnim - 30) / 20) * (-6.49849-(-6.25116)));
            zz = 9.59256 + (((tickAnim - 30) / 20) * (5.32335-(9.59256)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTenontosaurus entity = (EntityPrehistoricFloraTenontosaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 4.5 + (((tickAnim - 7) / 3) * (0-(4.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (3.75-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 3.75 + (((tickAnim - 17) / 8) * (0-(3.75)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -4 + (((tickAnim - 7) / 3) * (0-(-4)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -6.75 + (((tickAnim - 17) / 8) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -9.75 + (((tickAnim - 7) / 3) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -8.5 + (((tickAnim - 17) / 8) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 4 + (((tickAnim - 7) / 3) * (0-(4)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (5.25-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 5.25 + (((tickAnim - 17) / 8) * (0-(5.25)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 7) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (15.5-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 15.5 + (((tickAnim - 17) / 3) * (12.75-(15.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 12.75 + (((tickAnim - 20) / 5) * (0-(12.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTenontosaurus entity = (EntityPrehistoricFloraTenontosaurus) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 9) / 9) * (0-(-5)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 9) / 9) * (0-(5)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 9) / 9) * (0-(5)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 3.75 + (((tickAnim - 9) / 9) * (0-(3.75)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -6.75 + (((tickAnim - 9) / 9) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -1.25 + (((tickAnim - 9) / 9) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-34.04294-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.03309-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-34.72554-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -34.04294 + (((tickAnim - 5) / 5) * (-73.36729-(-34.04294)));
            yy = 2.03309 + (((tickAnim - 5) / 5) * (21.10509-(2.03309)));
            zz = -34.72554 + (((tickAnim - 5) / 5) * (-0.15136-(-34.72554)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -73.36729 + (((tickAnim - 10) / 8) * (0-(-73.36729)));
            yy = 21.10509 + (((tickAnim - 10) / 8) * (0-(21.10509)));
            zz = -0.15136 + (((tickAnim - 10) / 8) * (0-(-0.15136)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.06765-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-12.08462-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.53824-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 3.06765 + (((tickAnim - 5) / 8) * (1.06222-(3.06765)));
            yy = -12.08462 + (((tickAnim - 5) / 8) * (7.87741-(-12.08462)));
            zz = 0.53824 + (((tickAnim - 5) / 8) * (7.87266-(0.53824)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 1.06222 + (((tickAnim - 13) / 5) * (0-(1.06222)));
            yy = 7.87741 + (((tickAnim - 13) / 5) * (0-(7.87741)));
            zz = 7.87266 + (((tickAnim - 13) / 5) * (0-(7.87266)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-14-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = -14 + (((tickAnim - 4) / 3) * (-18.75-(-14)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = -18.75 + (((tickAnim - 7) / 6) * (21-(-18.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 21 + (((tickAnim - 13) / 5) * (0-(21)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-3.59-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = -3.59 + (((tickAnim - 4) / 3) * (-6.67-(-3.59)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = -6.67 + (((tickAnim - 7) / 2) * (26.75-(-6.67)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 26.75 + (((tickAnim - 9) / 9) * (0-(26.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(xx), leftArm4.rotateAngleY + (float) Math.toRadians(yy), leftArm4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-0.025-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -0.025 + (((tickAnim - 9) / 9) * (0-(-0.025)));
            yy = -0.55 + (((tickAnim - 9) / 9) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm4.rotationPointX = this.leftArm4.rotationPointX + (float)(xx);
        this.leftArm4.rotationPointY = this.leftArm4.rotationPointY - (float)(yy);
        this.leftArm4.rotationPointZ = this.leftArm4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (29.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(opposablePinkie, opposablePinkie.rotateAngleX + (float) Math.toRadians(xx), opposablePinkie.rotateAngleY + (float) Math.toRadians(yy), opposablePinkie.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -10.5 + (((tickAnim - 9) / 9) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -7.75 + (((tickAnim - 9) / 9) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 13.25 + (((tickAnim - 9) / 9) * (0-(13.25)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 15.75 + (((tickAnim - 9) / 9) * (0-(15.75)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTenontosaurus entity = (EntityPrehistoricFloraTenontosaurus) entitylivingbaseIn;
        int animCycle = 210;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-1.95-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = -1.95 + (((tickAnim - 25) / 150) * (-1.95-(-1.95)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = -1.95 + (((tickAnim - 175) / 35) * (0-(-1.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 13.25 + (((tickAnim - 25) / 150) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 13.25 + (((tickAnim - 175) / 35) * (0-(13.25)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 10.25 + (((tickAnim - 25) / 150) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 10.25 + (((tickAnim - 175) / 35) * (0-(10.25)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 8.5 + (((tickAnim - 25) / 150) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 8.5 + (((tickAnim - 175) / 35) * (0-(8.5)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = -32.75 + (((tickAnim - 25) / 150) * (-32.75-(-32.75)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = -32.75 + (((tickAnim - 175) / 35) * (0-(-32.75)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 7.75 + (((tickAnim - 25) / 150) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 7.75 + (((tickAnim - 175) / 35) * (0-(7.75)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = -6.25 + (((tickAnim - 25) / 150) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = -6.25 + (((tickAnim - 175) / 35) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 66) {
            xx = 4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*2 + (((tickAnim - 25) / 41) * (3.75-(4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*2)));
            yy = 0 + (((tickAnim - 25) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 41) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 120) {
            xx = 3.75 + (((tickAnim - 66) / 54) * (4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*2-(3.75)));
            yy = 0 + (((tickAnim - 66) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 54) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 210) {
            xx = 4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*2 + (((tickAnim - 120) / 90) * (0-(4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*2)));
            yy = 0 + (((tickAnim - 120) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 90) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 66) {
            xx = -3.75 + (((tickAnim - 25) / 41) * (-2-(-3.75)));
            yy = 0 + (((tickAnim - 25) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 41) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 120) {
            xx = -2 + (((tickAnim - 66) / 54) * (-3.75-(-2)));
            yy = 0 + (((tickAnim - 66) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 54) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 210) {
            xx = -3.75 + (((tickAnim - 120) / 90) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 120) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 90) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 66) {
            xx = -2.75 + (((tickAnim - 25) / 41) * (-1-(-2.75)));
            yy = 0 + (((tickAnim - 25) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 41) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 120) {
            xx = -1 + (((tickAnim - 66) / 54) * (-2.75-(-1)));
            yy = 0 + (((tickAnim - 66) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 54) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 170) {
            xx = -2.75 + (((tickAnim - 120) / 50) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 120) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 50) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 170) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 66) {
            xx = -2.75 + (((tickAnim - 25) / 41) * (3-(-2.75)));
            yy = 0 + (((tickAnim - 25) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 41) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 120) {
            xx = 3 + (((tickAnim - 66) / 54) * (-2.75-(3)));
            yy = 0 + (((tickAnim - 66) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 54) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 170) {
            xx = -2.75 + (((tickAnim - 120) / 50) * (3-(-2.75)));
            yy = 0 + (((tickAnim - 120) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 50) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 210) {
            xx = 3 + (((tickAnim - 170) / 40) * (0-(3)));
            yy = 0 + (((tickAnim - 170) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 66) {
            xx = -6 + (((tickAnim - 25) / 41) * (7-(-6)));
            yy = 0 + (((tickAnim - 25) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 41) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 120) {
            xx = 7 + (((tickAnim - 66) / 54) * (-6-(7)));
            yy = 0 + (((tickAnim - 66) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 54) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 170) {
            xx = -6 + (((tickAnim - 120) / 50) * (3-(-6)));
            yy = 0 + (((tickAnim - 120) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 50) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 210) {
            xx = 3 + (((tickAnim - 170) / 40) * (0-(3)));
            yy = 0 + (((tickAnim - 170) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 0) / 66) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 66) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 210) {
            xx = 9 + (((tickAnim - 66) / 144) * (0-(9)));
            yy = 0 + (((tickAnim - 66) / 144) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 144) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 6.5 + (((tickAnim - 25) / 150) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 6.5 + (((tickAnim - 175) / 35) * (0-(6.5)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = -0.175 + (((tickAnim - 25) / 150) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            yy = -0.175 + (((tickAnim - 175) / 35) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 6.25 + (((tickAnim - 25) / 150) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 6.25 + (((tickAnim - 175) / 35) * (0-(6.25)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.6-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0.6 + (((tickAnim - 25) / 150) * (0.6-(0.6)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0.6 + (((tickAnim - 175) / 35) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -16.75 + (((tickAnim - 10) / 15) * (-51.25-(-16.75)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = -51.25 + (((tickAnim - 25) / 150) * (-51.25-(-51.25)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -51.25 + (((tickAnim - 175) / 25) * (30.86-(-51.25)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 210) {
            xx = 30.86 + (((tickAnim - 200) / 10) * (0-(30.86)));
            yy = 0 + (((tickAnim - 200) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-22-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -22 + (((tickAnim - 10) / 15) * (0-(-22)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 175) / 25) * (-35-(0)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 210) {
            xx = -35 + (((tickAnim - 200) / 10) * (0-(-35)));
            yy = 0 + (((tickAnim - 200) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 0.9 + (((tickAnim - 10) / 15) * (0-(0.9)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0.5-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 200) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 10) * (0-(0)));
            zz = 0.5 + (((tickAnim - 200) / 10) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (19.73909-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-18.2897-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (38.20819-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 19.73909 + (((tickAnim - 10) / 15) * (33.15066-(19.73909)));
            yy = -18.2897 + (((tickAnim - 10) / 15) * (-16.37506-(-18.2897)));
            zz = 38.20819 + (((tickAnim - 10) / 15) * (23.14097-(38.20819)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 33.15066 + (((tickAnim - 25) / 150) * (33.15066-(33.15066)));
            yy = -16.37506 + (((tickAnim - 25) / 150) * (-16.37506-(-16.37506)));
            zz = 23.14097 + (((tickAnim - 25) / 150) * (23.14097-(23.14097)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 33.15066 + (((tickAnim - 175) / 25) * (17.73705-(33.15066)));
            yy = -16.37506 + (((tickAnim - 175) / 25) * (-18.45514-(-16.37506)));
            zz = 23.14097 + (((tickAnim - 175) / 25) * (36.69697-(23.14097)));
        }
        else if (tickAnim >= 200 && tickAnim < 210) {
            xx = 17.73705 + (((tickAnim - 200) / 10) * (0-(17.73705)));
            yy = -18.45514 + (((tickAnim - 200) / 10) * (0-(-18.45514)));
            zz = 36.69697 + (((tickAnim - 200) / 10) * (0-(36.69697)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 0.3 + (((tickAnim - 10) / 15) * (0-(0.3)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (90.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 90.25 + (((tickAnim - 10) / 15) * (0-(90.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (87.5-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 200) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 10) * (0-(0)));
            zz = 87.5 + (((tickAnim - 200) / 10) * (0-(87.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(xx), leftArm4.rotateAngleY + (float) Math.toRadians(yy), leftArm4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = -10.25 + (((tickAnim - 25) / 150) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = -10.25 + (((tickAnim - 175) / 35) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 25) / 150) * (0-(0)));
            yy = 0.9 + (((tickAnim - 25) / 150) * (0.9-(0.9)));
            zz = 0 + (((tickAnim - 25) / 150) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            yy = 0.9 + (((tickAnim - 175) / 35) * (0-(0.9)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 17 + (((tickAnim - 25) / 8) * (22-(17)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 22 + (((tickAnim - 33) / 7) * (17-(22)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 17 + (((tickAnim - 40) / 30) * (-22.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20-(17)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 71) {
            xx = -22.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20 + (((tickAnim - 70) / 1) * (-13.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10-(-22.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20)));
            yy = 0 + (((tickAnim - 70) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 1) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 104) {
            xx = -13.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10 + (((tickAnim - 71) / 33) * (10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10-(-13.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10)));
            yy = 0 + (((tickAnim - 71) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 33) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 130) {
            xx = 10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10 + (((tickAnim - 104) / 26) * (22-(10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10)));
            yy = 0 + (((tickAnim - 104) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 26) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 22 + (((tickAnim - 130) / 10) * (16.25-(22)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 156) {
            xx = 16.25 + (((tickAnim - 140) / 16) * (-3.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*15-(16.25)));
            yy = 0 + (((tickAnim - 140) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 16) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 175) {
            xx = -3.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*15 + (((tickAnim - 156) / 19) * (1.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*15-(-3.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*15)));
            yy = 0 + (((tickAnim - 156) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 19) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 1.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*15 + (((tickAnim - 175) / 35) * (0-(1.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*15)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 18 + (((tickAnim - 25) / 8) * (27.5-(18)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 27.5 + (((tickAnim - 33) / 7) * (18-(27.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 18 + (((tickAnim - 40) / 6) * (13-(18)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 92) {
            xx = 13 + (((tickAnim - 46) / 46) * (-15.1513+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(13)));
            yy = 0 + (((tickAnim - 46) / 46) * (6.58319-(0)));
            zz = 0 + (((tickAnim - 46) / 46) * (-0.88526-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 130) {
            xx = -15.1513+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 92) / 38) * (27.5-(-15.1513+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 6.58319 + (((tickAnim - 92) / 38) * (0-(6.58319)));
            zz = -0.88526 + (((tickAnim - 92) / 38) * (0-(-0.88526)));
        }
        else if (tickAnim >= 130 && tickAnim < 155) {
            xx = 27.5 + (((tickAnim - 130) / 25) * (22.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*15-(27.5)));
            yy = 0 + (((tickAnim - 130) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 25) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 175) {
            xx = 22.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*15 + (((tickAnim - 155) / 20) * (27.75-(22.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*15)));
            yy = 0 + (((tickAnim - 155) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 20) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 27.75 + (((tickAnim - 175) / 35) * (0-(27.75)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -0.25 + (((tickAnim - 33) / 7) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 40) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 16) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 40) / 16) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 56) / 26) * (0-(0)));
            yy = -0.25 + (((tickAnim - 56) / 26) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 56) / 26) * (0.525-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 82) / 48) * (0-(0)));
            yy = -0.25 + (((tickAnim - 82) / 48) * (-0.25-(-0.25)));
            zz = 0.525 + (((tickAnim - 82) / 48) * (0-(0.525)));
        }
        else if (tickAnim >= 130 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 130) / 80) * (0-(0)));
            yy = -0.25 + (((tickAnim - 130) / 80) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 130) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 9 + (((tickAnim - 33) / 7) * (18.25-(9)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 18.25 + (((tickAnim - 40) / 35) * (0-(18.25)));
            yy = 0 + (((tickAnim - 40) / 35) * (15-(0)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 75) / 20) * (-0.075-(0)));
            yy = 15 + (((tickAnim - 75) / 20) * (15-(15)));
            zz = 0 + (((tickAnim - 75) / 20) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = -0.075 + (((tickAnim - 95) / 35) * (9-(-0.075)));
            yy = 15 + (((tickAnim - 95) / 35) * (0-(15)));
            zz = 0 + (((tickAnim - 95) / 35) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 155) {
            xx = 9 + (((tickAnim - 130) / 25) * (-3-(9)));
            yy = 0 + (((tickAnim - 130) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 25) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 175) {
            xx = -3 + (((tickAnim - 155) / 20) * (12-(-3)));
            yy = 0 + (((tickAnim - 155) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 20) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 12 + (((tickAnim - 175) / 35) * (0-(12)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0.025-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -0.125 + (((tickAnim - 33) / 7) * (-0.125-(-0.125)));
            zz = 0.025 + (((tickAnim - 33) / 7) * (0.175-(0.025)));
        }
        else if (tickAnim >= 40 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 40) / 16) * (0-(0)));
            yy = -0.125 + (((tickAnim - 40) / 16) * (-0.125-(-0.125)));
            zz = 0.175 + (((tickAnim - 40) / 16) * (0.025-(0.175)));
        }
        else if (tickAnim >= 56 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 56) / 19) * (0-(0)));
            yy = -0.125 + (((tickAnim - 56) / 19) * (0-(-0.125)));
            zz = 0.025 + (((tickAnim - 56) / 19) * (0-(0.025)));
        }
        else if (tickAnim >= 75 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 75) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 55) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 75) / 55) * (0.025-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 130) / 80) * (0-(0)));
            yy = -0.125 + (((tickAnim - 130) / 80) * (0-(-0.125)));
            zz = 0.025 + (((tickAnim - 130) / 80) * (0-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 13.5 + (((tickAnim - 15) / 10) * (0-(13.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (-22.75-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -22.75 + (((tickAnim - 33) / 7) * (-10.75-(-22.75)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -10.75 + (((tickAnim - 40) / 6) * (-3.5-(-10.75)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 56) {
            xx = -3.5 + (((tickAnim - 46) / 10) * (-6-(-3.5)));
            yy = 0 + (((tickAnim - 46) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 10) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 75) {
            xx = -6 + (((tickAnim - 56) / 19) * (0-(-6)));
            yy = 0 + (((tickAnim - 56) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 19) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 75) / 19) * (0.57-(0)));
            yy = 0 + (((tickAnim - 75) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 19) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 130) {
            xx = 0.57 + (((tickAnim - 94) / 36) * (-22.75-(0.57)));
            yy = 0 + (((tickAnim - 94) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 36) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = -22.75 + (((tickAnim - 130) / 10) * (-2-(-22.75)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 155) {
            xx = -2 + (((tickAnim - 140) / 15) * (22.75-(-2)));
            yy = 0 + (((tickAnim - 140) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 15) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 175) {
            xx = 22.75 + (((tickAnim - 155) / 20) * (-19.5-(22.75)));
            yy = 0 + (((tickAnim - 155) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 20) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 189) {
            xx = -19.5 + (((tickAnim - 175) / 14) * (-4.92+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(-19.5)));
            yy = 0 + (((tickAnim - 175) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 14) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 210) {
            xx = -4.92+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 189) / 21) * (0-(-4.92+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 0 + (((tickAnim - 189) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.125-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 15) / 195) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 195) * (0-(0)));
            zz = 0.125 + (((tickAnim - 15) / 195) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 3 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 3) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 3) / 3) * (0.0075-(1)));
            zz = 1 + (((tickAnim - 3) / 3) * (1-(1)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 6) / 2) * (1-(1)));
            yy = 0.0075 + (((tickAnim - 6) / 2) * (1-(0.0075)));
            zz = 1 + (((tickAnim - 6) / 2) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 39) {
            xx = 1 + (((tickAnim - 8) / 31) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 31) * (1-(1)));
            zz = 1 + (((tickAnim - 8) / 31) * (1-(1)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 1 + (((tickAnim - 39) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 39) / 3) * (0.0075-(1)));
            zz = 1 + (((tickAnim - 39) / 3) * (1-(1)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 1 + (((tickAnim - 42) / 2) * (1-(1)));
            yy = 0.0075 + (((tickAnim - 42) / 2) * (1-(0.0075)));
            zz = 1 + (((tickAnim - 42) / 2) * (1-(1)));
        }
        else if (tickAnim >= 44 && tickAnim < 56) {
            xx = 1 + (((tickAnim - 44) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 44) / 12) * (0.115-(1)));
            zz = 1 + (((tickAnim - 44) / 12) * (1-(1)));
        }
        else if (tickAnim >= 56 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 56) / 19) * (1-(1)));
            yy = 0.115 + (((tickAnim - 56) / 19) * (1-(0.115)));
            zz = 1 + (((tickAnim - 56) / 19) * (1-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 84) {
            xx = 1 + (((tickAnim - 75) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 75) / 9) * (1-(1)));
            zz = 1 + (((tickAnim - 75) / 9) * (1-(1)));
        }
        else if (tickAnim >= 84 && tickAnim < 87) {
            xx = 1 + (((tickAnim - 84) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 84) / 3) * (0.0075-(1)));
            zz = 1 + (((tickAnim - 84) / 3) * (1-(1)));
        }
        else if (tickAnim >= 87 && tickAnim < 89) {
            xx = 1 + (((tickAnim - 87) / 2) * (1-(1)));
            yy = 0.0075 + (((tickAnim - 87) / 2) * (1-(0.0075)));
            zz = 1 + (((tickAnim - 87) / 2) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 15 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 15) / 13) * (17.25-(0)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 17.25 + (((tickAnim - 28) / 5) * (0-(17.25)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 33) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 13) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 46) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 10) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 56) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 54) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 110) / 15) * (17.25-(0)));
            yy = 0 + (((tickAnim - 110) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 15) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 130) {
            xx = 17.25 + (((tickAnim - 125) / 5) * (0-(17.25)));
            yy = 0 + (((tickAnim - 125) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 5) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 130) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 35) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 173) {
            xx = 0 + (((tickAnim - 165) / 8) * (16.5-(0)));
            yy = 0 + (((tickAnim - 165) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 8) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 175) {
            xx = 16.5 + (((tickAnim - 173) / 2) * (0-(16.5)));
            yy = 0 + (((tickAnim - 173) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalkQuad(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTenontosaurus entity = (EntityPrehistoricFloraTenontosaurus) entitylivingbaseIn;
        int animCycle = 23;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -3.31462 + (((tickAnim - 0) / 3) * (-19.74154-(-3.31462)));
            yy = -5.59644 + (((tickAnim - 0) / 3) * (-0.74426-(-5.59644)));
            zz = 1.32211 + (((tickAnim - 0) / 3) * (-1.30237-(1.32211)));
        }
        else if (tickAnim >= 3 && tickAnim < 18) {
            xx = -19.74154 + (((tickAnim - 3) / 15) * (25.5-(-19.74154)));
            yy = -0.74426 + (((tickAnim - 3) / 15) * (0-(-0.74426)));
            zz = -1.30237 + (((tickAnim - 3) / 15) * (0-(-1.30237)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 25.5 + (((tickAnim - 18) / 5) * (-3.31462-(25.5)));
            yy = 0 + (((tickAnim - 18) / 5) * (-5.59644-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (1.32211-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.75 + (((tickAnim - 0) / 3) * (-10-(4.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 3) / 7) * (-0.75-(-10)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -0.75 + (((tickAnim - 10) / 8) * (24.84-(-0.75)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 24.84 + (((tickAnim - 18) / 5) * (4.75-(24.84)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -48.67994 + (((tickAnim - 0) / 3) * (22.57006-(-48.67994)));
            yy = 0.99081 + (((tickAnim - 0) / 3) * (0.99081-(0.99081)));
            zz = 0.3067 + (((tickAnim - 0) / 3) * (0.3067-(0.3067)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 22.57006 + (((tickAnim - 3) / 7) * (11.32006-(22.57006)));
            yy = 0.99081 + (((tickAnim - 3) / 7) * (0.99081-(0.99081)));
            zz = 0.3067 + (((tickAnim - 3) / 7) * (0.3067-(0.3067)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 11.32006 + (((tickAnim - 10) / 8) * (-28.50806-(11.32006)));
            yy = 0.99081 + (((tickAnim - 10) / 8) * (0.99081-(0.99081)));
            zz = 0.3067 + (((tickAnim - 10) / 8) * (0.3067-(0.3067)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -28.50806 + (((tickAnim - 18) / 3) * (-44.83172-(-28.50806)));
            yy = 0.99081 + (((tickAnim - 18) / 3) * (0.99081-(0.99081)));
            zz = 0.3067 + (((tickAnim - 18) / 3) * (0.3067-(0.3067)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -44.83172 + (((tickAnim - 21) / 2) * (-48.67994-(-44.83172)));
            yy = 0.99081 + (((tickAnim - 21) / 2) * (0.99081-(0.99081)));
            zz = 0.3067 + (((tickAnim - 21) / 2) * (0.3067-(0.3067)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = -0.125 + (((tickAnim - 10) / 13) * (0-(-0.125)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 73.5 + (((tickAnim - 0) / 3) * (6.75-(73.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 6.75 + (((tickAnim - 3) / 7) * (-9.25-(6.75)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -9.25 + (((tickAnim - 10) / 8) * (77.41-(-9.25)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 77.41 + (((tickAnim - 18) / 3) * (95.1-(77.41)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 95.1 + (((tickAnim - 21) / 2) * (73.5-(95.1)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.975 + (((tickAnim - 0) / 3) * (0-(0.975)));
            zz = -0.55 + (((tickAnim - 0) / 3) * (0-(-0.55)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0.145-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (-0.29-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.145 + (((tickAnim - 10) / 3) * (0.575-(0.145)));
            zz = -0.29 + (((tickAnim - 10) / 3) * (-0.46-(-0.29)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.575 + (((tickAnim - 13) / 5) * (0-(0.575)));
            zz = -0.46 + (((tickAnim - 13) / 5) * (-0.675-(-0.46)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (1.535-(0)));
            zz = -0.675 + (((tickAnim - 18) / 3) * (-0.975-(-0.675)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 1.535 + (((tickAnim - 21) / 2) * (0.975-(1.535)));
            zz = -0.975 + (((tickAnim - 21) / 2) * (-0.55-(-0.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15.5 + (((tickAnim - 0) / 3) * (0-(15.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-26.91-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -26.91 + (((tickAnim - 13) / 5) * (19.75-(-26.91)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 19.75 + (((tickAnim - 18) / 5) * (15.5-(19.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0.4-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0.4 + (((tickAnim - 21) / 2) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 5.25 + (((tickAnim - 0) / 8) * (24.5-(5.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 24.5 + (((tickAnim - 8) / 4) * (1.29973-(24.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (5.39587-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-1.06674-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 1.29973 + (((tickAnim - 12) / 4) * (-20.74413-(1.29973)));
            yy = 5.39587 + (((tickAnim - 12) / 4) * (0.62023-(5.39587)));
            zz = -1.06674 + (((tickAnim - 12) / 4) * (1.08529-(-1.06674)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -20.74413 + (((tickAnim - 16) / 7) * (5.25-(-20.74413)));
            yy = 0.62023 + (((tickAnim - 16) / 7) * (0-(0.62023)));
            zz = 1.08529 + (((tickAnim - 16) / 7) * (0-(1.08529)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.88-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5.88 + (((tickAnim - 4) / 4) * (21.83-(5.88)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 21.83 + (((tickAnim - 8) / 8) * (-10-(21.83)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -10 + (((tickAnim - 16) / 7) * (0-(-10)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-24.37457-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.68594-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.21233-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -24.37457 + (((tickAnim - 8) / 2) * (-40.37883-(-24.37457)));
            yy = 0.68594 + (((tickAnim - 8) / 2) * (0.68595-(0.68594)));
            zz = 0.21233 + (((tickAnim - 8) / 2) * (0.21233-(0.21233)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -40.37883 + (((tickAnim - 10) / 3) * (-50.37847-(-40.37883)));
            yy = 0.68595 + (((tickAnim - 10) / 3) * (0.78482-(0.68595)));
            zz = 0.21233 + (((tickAnim - 10) / 3) * (0.24294-(0.21233)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -50.37847 + (((tickAnim - 13) / 3) * (22.57006-(-50.37847)));
            yy = 0.78482 + (((tickAnim - 13) / 3) * (0.99081-(0.78482)));
            zz = 0.24294 + (((tickAnim - 13) / 3) * (0.3067-(0.24294)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 22.57006 + (((tickAnim - 16) / 7) * (0-(22.57006)));
            yy = 0.99081 + (((tickAnim - 16) / 7) * (0-(0.99081)));
            zz = 0.3067 + (((tickAnim - 16) / 7) * (0-(0.3067)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -5 + (((tickAnim - 0) / 4) * (55.73-(-5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 55.73 + (((tickAnim - 4) / 4) * (71.75-(55.73)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 71.75 + (((tickAnim - 8) / 5) * (76.61-(71.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 76.61 + (((tickAnim - 13) / 3) * (7.82-(76.61)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 7.82 + (((tickAnim - 16) / 7) * (-5-(7.82)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 8) * (1.31-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.65-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.31 + (((tickAnim - 8) / 5) * (1.325-(1.31)));
            zz = -0.65 + (((tickAnim - 8) / 5) * (-0.825-(-0.65)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 1.325 + (((tickAnim - 13) / 3) * (0-(1.325)));
            zz = -0.825 + (((tickAnim - 13) / 3) * (0-(-0.825)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-48.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -48.25 + (((tickAnim - 4) / 4) * (28.25-(-48.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 28.25 + (((tickAnim - 8) / 7) * (0-(28.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -33.06608 + (((tickAnim - 0) / 7) * (-3.75-(-33.06608)));
            yy = -0.17311 + (((tickAnim - 0) / 7) * (0-(-0.17311)));
            zz = 3.94339 + (((tickAnim - 0) / 7) * (0-(3.94339)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -3.75 + (((tickAnim - 7) / 6) * (16-(-3.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 16 + (((tickAnim - 13) / 8) * (-39.31608-(16)));
            yy = 0 + (((tickAnim - 13) / 8) * (-0.17311-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (3.94339-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -39.31608 + (((tickAnim - 21) / 2) * (-33.06608-(-39.31608)));
            yy = -0.17311 + (((tickAnim - 21) / 2) * (-0.17311-(-0.17311)));
            zz = 3.94339 + (((tickAnim - 21) / 2) * (3.94339-(3.94339)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 22.5 + (((tickAnim - 0) / 7) * (13.75-(22.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 13.75 + (((tickAnim - 7) / 6) * (21-(13.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 21 + (((tickAnim - 13) / 5) * (-6.13-(21)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -6.13 + (((tickAnim - 18) / 4) * (22.5-(-6.13)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 22.5 + (((tickAnim - 22) / 1) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0.325 + (((tickAnim - 0) / 13) * (-0.45-(0.325)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.45 + (((tickAnim - 13) / 3) * (0.735-(-0.45)));
            zz = -0.5 + (((tickAnim - 13) / 3) * (-0.005-(-0.5)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.735 + (((tickAnim - 16) / 2) * (0.575-(0.735)));
            zz = -0.005 + (((tickAnim - 16) / 2) * (-0.17-(-0.005)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.575 + (((tickAnim - 18) / 4) * (0-(0.575)));
            zz = -0.17 + (((tickAnim - 18) / 4) * (0-(-0.17)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0.325-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 10.48576 + (((tickAnim - 0) / 7) * (0-(10.48576)));
            yy = -14.34335 + (((tickAnim - 0) / 7) * (0-(-14.34335)));
            zz = 8.08104 + (((tickAnim - 0) / 7) * (0-(8.08104)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (14.01258-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (-34.54561-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (44.02791-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 14.01258 + (((tickAnim - 17) / 1) * (14.01258-(14.01258)));
            yy = -34.54561 + (((tickAnim - 17) / 1) * (-34.54561-(-34.54561)));
            zz = 44.02791 + (((tickAnim - 17) / 1) * (44.02791-(44.02791)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 14.01258 + (((tickAnim - 18) / 3) * (-5.91516-(14.01258)));
            yy = -34.54561 + (((tickAnim - 18) / 3) * (-8.98657-(-34.54561)));
            zz = 44.02791 + (((tickAnim - 18) / 3) * (-8.06052-(44.02791)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -5.91516 + (((tickAnim - 21) / 2) * (10.48576-(-5.91516)));
            yy = -8.98657 + (((tickAnim - 21) / 2) * (-14.34335-(-8.98657)));
            zz = -8.06052 + (((tickAnim - 21) / 2) * (8.08104-(-8.06052)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0.225-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.775-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0.225 + (((tickAnim - 16) / 2) * (0-(0.225)));
            yy = 0.775 + (((tickAnim - 16) / 2) * (0-(0.775)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20.25 + (((tickAnim - 0) / 3) * (15.25-(20.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 15.25 + (((tickAnim - 3) / 6) * (-41.01738-(15.25)));
            yy = 0 + (((tickAnim - 3) / 6) * (-1.09316-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (-0.46187-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = -41.01738 + (((tickAnim - 9) / 12) * (11-(-41.01738)));
            yy = -1.09316 + (((tickAnim - 9) / 12) * (0-(-1.09316)));
            zz = -0.46187 + (((tickAnim - 9) / 12) * (0-(-0.46187)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 11 + (((tickAnim - 21) / 2) * (20.25-(11)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 4 + (((tickAnim - 0) / 5) * (-15.37-(4)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -15.37 + (((tickAnim - 5) / 3) * (4.25-(-15.37)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 4.25 + (((tickAnim - 8) / 1) * (24-(4.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 24 + (((tickAnim - 9) / 12) * (9.25-(24)));
            yy = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 12) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 9.25 + (((tickAnim - 21) / 2) * (4-(9.25)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 3) * (0.815-(-0.3)));
            zz = -0.225 + (((tickAnim - 0) / 3) * (-0.17-(-0.225)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.815 + (((tickAnim - 3) / 2) * (0.815-(0.815)));
            zz = -0.17 + (((tickAnim - 3) / 2) * (-0.17-(-0.17)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.815 + (((tickAnim - 5) / 3) * (-0.1-(0.815)));
            zz = -0.17 + (((tickAnim - 5) / 3) * (0-(-0.17)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 8) / 1) * (-0.075-(-0.1)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -0.075 + (((tickAnim - 9) / 2) * (0.175-(-0.075)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            yy = 0.175 + (((tickAnim - 11) / 10) * (-0.3-(0.175)));
            zz = 0 + (((tickAnim - 11) / 10) * (-0.225-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 21) / 2) * (-0.3-(-0.3)));
            zz = -0.225 + (((tickAnim - 21) / 2) * (-0.225-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -6.25 + (((tickAnim - 0) / 3) * (8.25473-(-6.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (7.30579-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-35.47319-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 8.25473 + (((tickAnim - 3) / 2) * (9.67782-(8.25473)));
            yy = 7.30579 + (((tickAnim - 3) / 2) * (7.18133-(7.30579)));
            zz = -35.47319 + (((tickAnim - 3) / 2) * (-31.20833-(-35.47319)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 9.67782 + (((tickAnim - 5) / 3) * (-9.15356-(9.67782)));
            yy = 7.18133 + (((tickAnim - 5) / 3) * (6.10048-(7.18133)));
            zz = -31.20833 + (((tickAnim - 5) / 3) * (10.47928-(-31.20833)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -9.15356 + (((tickAnim - 8) / 1) * (12.99349-(-9.15356)));
            yy = 6.10048 + (((tickAnim - 8) / 1) * (2.14469-(6.10048)));
            zz = 10.47928 + (((tickAnim - 8) / 1) * (-21.07694-(10.47928)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 12.99349 + (((tickAnim - 9) / 12) * (-6.25-(12.99349)));
            yy = 2.14469 + (((tickAnim - 9) / 12) * (0-(2.14469)));
            zz = -21.07694 + (((tickAnim - 9) / 12) * (0-(-21.07694)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -6.25 + (((tickAnim - 21) / 2) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 3) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (1.1-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.1 + (((tickAnim - 5) / 3) * (0-(1.1)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 8) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 13) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (32-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 32 + (((tickAnim - 13) / 5) * (86.5-(32)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 86.5 + (((tickAnim - 18) / 3) * (-11.25-(86.5)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = -11.25 + (((tickAnim - 21) / 1) * (7.5-(-11.25)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 7.5 + (((tickAnim - 22) / 1) * (0-(7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(xx), leftArm4.rotateAngleY + (float) Math.toRadians(yy), leftArm4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0.45 + (((tickAnim - 5) / 7) * (0-(0.45)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm4.rotationPointX = this.leftArm4.rotationPointX + (float)(xx);
        this.leftArm4.rotationPointY = this.leftArm4.rotationPointY - (float)(yy);
        this.leftArm4.rotationPointZ = this.leftArm4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -80.75 + (((tickAnim - 0) / 3) * (-106-(-80.75)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -106 + (((tickAnim - 3) / 2) * (-93.12-(-106)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -93.12 + (((tickAnim - 5) / 3) * (11-(-93.12)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 11 + (((tickAnim - 8) / 1) * (0-(11)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (-38.5-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = -38.5 + (((tickAnim - 21) / 2) * (-80.75-(-38.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm4, rightArm4.rotateAngleX + (float) Math.toRadians(xx), rightArm4.rotateAngleY + (float) Math.toRadians(yy), rightArm4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 9) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 8) * (0.45-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 17) / 4) * (0-(0.45)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm4.rotationPointX = this.rightArm4.rotationPointX + (float)(xx);
        this.rightArm4.rotationPointY = this.rightArm4.rotationPointY - (float)(yy);
        this.rightArm4.rotationPointZ = this.rightArm4.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5+50))*1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309))*1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-25))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5))*-0.1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5-50))*0.3);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5+50))*0.1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-50))*-1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-50))*1));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5-5))*0.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-50))*1));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5-30))*0.8), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309+20))*2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-50))*1));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5-50))*1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-30))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-50))*-1));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5-70))*1), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-30))*4), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-50))*-1));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5-90))*2), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-50))*6), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-50))*-1));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5-100))*1), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-185))*4));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5-130))*1), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-190))*1), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309+120))*2));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5-85))*-1.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309+250))*2));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5-125))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309+280))*2));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5+20))*-3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309+280))*2));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



    }
    public void animWalkBi(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTenontosaurus entity = (EntityPrehistoricFloraTenontosaurus) entitylivingbaseIn;
        int animCycle = 21;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.541+150))*1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75))*0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+30))*1.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.27))*-0.35);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(-1.275+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.27))*0.8);



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -17.5 + (((tickAnim - 0) / 11) * (15.5-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 15.5 + (((tickAnim - 11) / 7) * (-5.81498-(15.5)));
            yy = 0 + (((tickAnim - 11) / 7) * (-7.5167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (-0.31279-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -5.81498 + (((tickAnim - 18) / 4) * (-17.5-(-5.81498)));
            yy = -7.5167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 18) / 4) * (0-(-7.5167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            zz = -0.31279 + (((tickAnim - 18) / 4) * (0-(-0.31279)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -6.25 + (((tickAnim - 0) / 11) * (40.5-(-6.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 40.5 + (((tickAnim - 11) / 11) * (-6.25-(40.5)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -0.25 + (((tickAnim - 0) / 11) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (-41.75-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -41.75 + (((tickAnim - 15) / 3) * (-50.87-(-41.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -50.87 + (((tickAnim - 18) / 4) * (-0.25-(-50.87)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23 + (((tickAnim - 0) / 3) * (6.25-(23)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 6.25 + (((tickAnim - 3) / 3) * (35.25-(6.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 35.25 + (((tickAnim - 6) / 5) * (61.75-(35.25)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 61.75 + (((tickAnim - 11) / 4) * (76.4-(61.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 76.4 + (((tickAnim - 15) / 3) * (76.2-(76.4)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 76.2 + (((tickAnim - 18) / 4) * (23-(76.2)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.8 + (((tickAnim - 0) / 6) * (0.45-(0.8)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.72-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0.45 + (((tickAnim - 6) / 5) * (0-(0.45)));
            zz = -0.72 + (((tickAnim - 6) / 5) * (-0.6-(-0.72)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0.9-(0)));
            zz = -0.6 + (((tickAnim - 11) / 4) * (-0.92-(-0.6)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.9 + (((tickAnim - 15) / 3) * (0.45-(0.9)));
            zz = -0.92 + (((tickAnim - 15) / 3) * (-0.685-(-0.92)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 18) / 4) * (0.8-(0.45)));
            zz = -0.685 + (((tickAnim - 18) / 4) * (0-(-0.685)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-53.5-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -53.5 + (((tickAnim - 6) / 5) * (30-(-53.5)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 30 + (((tickAnim - 11) / 4) * (0-(30)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (7.75-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 7.75 + (((tickAnim - 18) / 4) * (0-(7.75)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.475-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -0.125 + (((tickAnim - 11) / 4) * (-0.08-(-0.125)));
            zz = 0.475 + (((tickAnim - 11) / 4) * (1.04-(0.475)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -0.08 + (((tickAnim - 15) / 3) * (0-(-0.08)));
            zz = 1.04 + (((tickAnim - 15) / 3) * (0-(1.04)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 15.5 + (((tickAnim - 0) / 7) * (-7.59503-(15.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (5.712+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.68203-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -7.59503 + (((tickAnim - 7) / 3) * (-17.5-(-7.59503)));
            yy = 5.712+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8 + (((tickAnim - 7) / 3) * (0-(5.712+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8)));
            zz = 0.68203 + (((tickAnim - 7) / 3) * (0-(0.68203)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = -17.5 + (((tickAnim - 10) / 12) * (15.5-(-17.5)));
            yy = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 40.5 + (((tickAnim - 0) / 10) * (-6.25-(40.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = -6.25 + (((tickAnim - 10) / 12) * (40.5-(-6.25)));
            yy = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-33.86-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -33.86 + (((tickAnim - 4) / 4) * (-49.01-(-33.86)));
            yy = 0 + (((tickAnim - 4) / 4) * (-1.4-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -49.01 + (((tickAnim - 8) / 2) * (-5.5-(-49.01)));
            yy = -1.4 + (((tickAnim - 8) / 2) * (0-(-1.4)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = -5.5 + (((tickAnim - 10) / 12) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 53.75 + (((tickAnim - 0) / 3) * (82.07-(53.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 82.07 + (((tickAnim - 3) / 5) * (74.4-(82.07)));
            yy = 0 + (((tickAnim - 3) / 5) * (-1.4-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 74.4 + (((tickAnim - 8) / 2) * (28.5-(74.4)));
            yy = -1.4 + (((tickAnim - 8) / 2) * (0-(-1.4)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 28.5 + (((tickAnim - 10) / 3) * (5.75-(28.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 5.75 + (((tickAnim - 13) / 5) * (39.78-(5.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 39.78 + (((tickAnim - 18) / 4) * (53.75-(39.78)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.95-(0)));
            zz = -0.6 + (((tickAnim - 0) / 4) * (-0.83-(-0.6)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 1.95 + (((tickAnim - 4) / 4) * (0-(1.95)));
            zz = -0.83 + (((tickAnim - 4) / 4) * (-0.875-(-0.83)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.3-(0)));
            zz = -0.875 + (((tickAnim - 8) / 2) * (0-(-0.875)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 10) / 3) * (0.8-(0.3)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.8 + (((tickAnim - 13) / 5) * (-0.01-(0.8)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.8-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -0.01 + (((tickAnim - 18) / 4) * (0-(-0.01)));
            zz = -0.8 + (((tickAnim - 18) / 4) * (-0.6-(-0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 30 + (((tickAnim - 0) / 4) * (0-(30)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-66.58-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -66.58 + (((tickAnim - 18) / 4) * (30-(-66.58)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.15-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 1.15 + (((tickAnim - 5) / 5) * (0-(1.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.541+70))*1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75-80))*2.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+70))*1));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(3.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.541+50))*2), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75-100))*3), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+90))*2));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(4.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.541+70))*5), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75-80))*5), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+100))*3));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.541-90))*2), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75-185))*2));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.541+120))*1.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75-220))*1));
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.541-60))*3), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.541-30))*-3), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(0), leftArm4.rotateAngleY + (float) Math.toRadians(0), leftArm4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.541-60))*3), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.541-30))*-3), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightArm4, rightArm4.rotateAngleX + (float) Math.toRadians(0), rightArm4.rotateAngleY + (float) Math.toRadians(0), rightArm4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.541-90))*1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+10))*2));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-4.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.541-150))*1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+100))*2));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.541-120))*-3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+180))*2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.541+100))*0.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75-30))*1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+40))*0.5));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.541+100))*0.8), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75-60))*2), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+40))*0.8));



    }
    public void animRunBi(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTenontosaurus entity = (EntityPrehistoricFloraTenontosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-10))*4), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+20))*1.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(-0.625+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.187-50))*1.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.187))*-1.8);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -19.25 + (((tickAnim - 0) / 8) * (21.75-(-19.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 21.75 + (((tickAnim - 8) / 5) * (-9.99435-(21.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (-2.00843-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-1.81077-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -9.99435 + (((tickAnim - 13) / 2) * (-19.25-(-9.99435)));
            yy = -2.00843 + (((tickAnim - 13) / 2) * (0-(-2.00843)));
            zz = -1.81077 + (((tickAnim - 13) / 2) * (0-(-1.81077)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 0) / 8) * (36.75-(-10)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 36.75 + (((tickAnim - 8) / 7) * (-10-(36.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 26.75 + (((tickAnim - 0) / 3) * (59.5-(26.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 59.5 + (((tickAnim - 3) / 5) * (69-(59.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 69 + (((tickAnim - 8) / 3) * (77.58-(69)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 77.58 + (((tickAnim - 11) / 2) * (82.13-(77.58)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 82.13 + (((tickAnim - 13) / 2) * (26.75-(82.13)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.175 + (((tickAnim - 0) / 3) * (0.575-(1.175)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.775-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.575 + (((tickAnim - 3) / 5) * (1.075-(0.575)));
            zz = -0.775 + (((tickAnim - 3) / 5) * (-0.8-(-0.775)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 1.075 + (((tickAnim - 8) / 3) * (1.2-(1.075)));
            zz = -0.8 + (((tickAnim - 8) / 3) * (-0.89-(-0.8)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.2 + (((tickAnim - 11) / 2) * (0-(1.2)));
            zz = -0.89 + (((tickAnim - 11) / 2) * (-0.7-(-0.89)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (1.175-(0)));
            zz = -0.7 + (((tickAnim - 13) / 2) * (0-(-0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 19 + (((tickAnim - 0) / 4) * (-12.4489-(19)));
            yy = 0 + (((tickAnim - 0) / 4) * (4.01377-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.44768-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -12.4489 + (((tickAnim - 4) / 2) * (-24.25-(-12.4489)));
            yy = 4.01377 + (((tickAnim - 4) / 2) * (0-(4.01377)));
            zz = 0.44768 + (((tickAnim - 4) / 2) * (0-(0.44768)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -24.25 + (((tickAnim - 6) / 9) * (19-(-24.25)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 46.5 + (((tickAnim - 0) / 6) * (-6.25-(46.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -6.25 + (((tickAnim - 6) / 9) * (46.5-(-6.25)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 56.5 + (((tickAnim - 0) / 2) * (79.82-(56.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 79.82 + (((tickAnim - 2) / 2) * (91.25-(79.82)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 91.25 + (((tickAnim - 4) / 2) * (25.5-(91.25)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 25.5 + (((tickAnim - 6) / 3) * (33.5-(25.5)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 33.5 + (((tickAnim - 9) / 6) * (56.5-(33.5)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.275-(0)));
            zz = -0.8 + (((tickAnim - 0) / 2) * (-0.57-(-0.8)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 1.275 + (((tickAnim - 2) / 2) * (0.51-(1.275)));
            zz = -0.57 + (((tickAnim - 2) / 2) * (-0.805-(-0.57)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.51 + (((tickAnim - 4) / 2) * (0.5-(0.51)));
            zz = -0.805 + (((tickAnim - 4) / 2) * (0-(-0.805)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 6) / 2) * (1.635-(0.5)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.2-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.635 + (((tickAnim - 8) / 1) * (-0.15-(1.635)));
            zz = -0.2 + (((tickAnim - 8) / 1) * (-0.4-(-0.2)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = -0.15 + (((tickAnim - 9) / 6) * (0-(-0.15)));
            zz = -0.4 + (((tickAnim - 9) / 6) * (-0.8-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 59 + (((tickAnim - 0) / 2) * (4.5-(59)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 4.5 + (((tickAnim - 2) / 2) * (26.05-(4.5)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 26.05 + (((tickAnim - 4) / 2) * (0-(26.05)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (-61.5-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -61.5 + (((tickAnim - 10) / 5) * (59-(-61.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.55-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0.55 + (((tickAnim - 2) / 4) * (0-(0.55)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-20))*-3), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-20))*2), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-40))*4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-40))*3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-1.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-60))*4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(3.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+50))*5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*-5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+100))*-9), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*-5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*1));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+80))*-12), tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*-8), tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+30))*-5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+60))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+45))*5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+150))*2));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.425);


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-60))*5), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-30))*-10), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(0), leftArm4.rotateAngleY + (float) Math.toRadians(0), leftArm4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-60))*5), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-30))*-10), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm4, rightArm4.rotateAngleX + (float) Math.toRadians(0), rightArm4.rotateAngleY + (float) Math.toRadians(0), rightArm4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+70))*3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+100))*2));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 4 + (((tickAnim - 0) / 8) * (0-(4)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (-46.5-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -46.5 + (((tickAnim - 11) / 2) * (-47.3-(-46.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -47.3 + (((tickAnim - 13) / 2) * (4-(-47.3)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-76-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -76 + (((tickAnim - 3) / 5) * (59-(-76)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 59 + (((tickAnim - 8) / 3) * (11.25-(59)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 11.25 + (((tickAnim - 11) / 4) * (0-(11.25)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0.6-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0.6 + (((tickAnim - 11) / 4) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-40-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -40 + (((tickAnim - 2) / 2) * (-53.5-(-40)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -53.5 + (((tickAnim - 4) / 2) * (11-(-53.5)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 11 + (((tickAnim - 6) / 9) * (0-(11)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+130))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+190))*3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+180))*2));



    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTenontosaurus e = (EntityPrehistoricFloraTenontosaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.TOBI_ANIMATION);
        animator.startKeyframe(e.getToBiTransitionLength()); //move to this keyframe over the right length

        animator.rotate(body, ((-0.1178F)-(-0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((0.2182F)-(0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r11, ((-0.2182F)-(-0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r12, ((0.5149F)-(0.5149F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r13, ((-0.1396F)-(-0.1396F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r14, ((-0.4712F)-(-0.4712F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r15, ((-0.0175F)-(-0.0175F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r16, ((-0.1571F)-(-0.1571F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r17, ((-0.0436F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r18, ((-0.3491F)-(-0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r19, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((-0.0274F)-(-0.0274F)), ((-0.1041F)-(-0.1041F)),((0.5141F)-(0.5141F)));
        animator.rotate(cube_r20, ((0.3054F)-(0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r21, ((0.5236F)-(0.5236F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r22, ((0.5585F)-(0.5585F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r23, ((-0.2793F)-(-0.2793F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r24, ((0.192F)-(0.192F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r25, ((-0.0349F)-(-0.0349F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r26, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r27, ((-0.3578F)-(-0.3578F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r28, ((0.1658F)-(0.1658F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r29, ((-0.0436F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((-0.0274F)-(-0.0274F)), ((0.1041F)-(0.1041F)),((-0.5141F)-(-0.5141F)));
        animator.rotate(cube_r4, ((0.2182F)-(0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((-0.0436F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r9, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head, ((0.5236F)-(0.5236F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(hips, ((-0.0829F)-(-0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw, ((-0.3054F)-(-0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftArm, ((1.2174F)-(0.48F)), ((0.0F)-(0.0F)),((-0.1745F)-(-0.1745F)));
        animator.rotate(leftArm2, ((-1.0857F)-(-0.6799F)), ((0.3503F)-(0.3503F)),((0.0086F)-(0.0086F)));
        animator.rotate(leftArm3, ((0.2235F)-(0.1962F)), ((0.2166F)-(0.4721F)),((0.2303F)-(0.0902F)));
        animator.rotate(leftArm4, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((1.5053F)-(0.0F)));
        animator.rotate(leftLeg, ((-0.0916F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg2, ((0.576F)-(0.576F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg3, ((-0.6109F)-(-0.6109F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg4, ((0.2094F)-(0.2094F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck3, ((0.2313F)-(0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie, ((1.1781F)-(1.1781F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie2, ((1.1781F)-(1.1781F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightArm, ((1.2174F)-(0.48F)), ((0.0F)-(0.0F)),((0.1745F)-(0.1745F)));
        animator.rotate(rightArm2, ((-1.0857F)-(-0.6799F)), ((-0.3503F)-(-0.3503F)),((-0.0086F)-(-0.0086F)));
        animator.rotate(rightArm3, ((0.2235F)-(0.1962F)), ((-0.2166F)-(-0.4721F)),((-0.0902F)-(-0.0902F)));
        animator.rotate(rightArm4, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-1.5053F)-(-0.0F)));
        animator.rotate(rightLeg, ((-0.0916F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg2, ((0.576F)-(0.576F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg3, ((-0.6109F)-(-0.6109F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg4, ((0.2094F)-(0.2094F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail, ((-0.1222F)-(-0.1222F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail2, ((-0.0349F)-(-0.0349F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail4, ((-0.0436F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail5, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail6, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));


        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.TOQUAD_ANIMATION);
        animator.startKeyframe(e.getToQuadTransitionLength()); //move to this keyframe over the right length

        animator.rotate(body, -((-0.1178F)-(-0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((0.2182F)-(0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r11, -((-0.2182F)-(-0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r12, -((0.5149F)-(0.5149F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r13, -((-0.1396F)-(-0.1396F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r14, -((-0.4712F)-(-0.4712F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r15, -((-0.0175F)-(-0.0175F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r16, -((-0.1571F)-(-0.1571F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r17, -((-0.0436F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r18, -((-0.3491F)-(-0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r19, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((-0.0274F)-(-0.0274F)), -((-0.1041F)-(-0.1041F)),-((0.5141F)-(0.5141F)));
        animator.rotate(cube_r20, -((0.3054F)-(0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r21, -((0.5236F)-(0.5236F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r22, -((0.5585F)-(0.5585F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r23, -((-0.2793F)-(-0.2793F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r24, -((0.192F)-(0.192F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r25, -((-0.0349F)-(-0.0349F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r26, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r27, -((-0.3578F)-(-0.3578F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r28, -((0.1658F)-(0.1658F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r29, -((-0.0436F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((-0.0274F)-(-0.0274F)), -((0.1041F)-(0.1041F)),-((-0.5141F)-(-0.5141F)));
        animator.rotate(cube_r4, -((0.2182F)-(0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((-0.0436F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r9, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head, -((0.5236F)-(0.5236F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(hips, -((-0.0829F)-(-0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw, -((-0.3054F)-(-0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftArm, -((1.2174F)-(0.48F)), -((0.0F)-(0.0F)),-((-0.1745F)-(-0.1745F)));
        animator.rotate(leftArm2, -((-1.0857F)-(-0.6799F)), -((0.3503F)-(0.3503F)),-((0.0086F)-(0.0086F)));
        animator.rotate(leftArm3, -((0.2235F)-(0.1962F)), -((0.2166F)-(0.4721F)),-((0.2303F)-(0.0902F)));
        animator.rotate(leftArm4, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((1.5053F)-(0.0F)));
        animator.rotate(leftLeg, -((-0.0916F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg2, -((0.576F)-(0.576F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg3, -((-0.6109F)-(-0.6109F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg4, -((0.2094F)-(0.2094F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck3, -((0.2313F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie, -((1.1781F)-(1.1781F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(opposablePinkie2, -((1.1781F)-(1.1781F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightArm, -((1.2174F)-(0.48F)), -((0.0F)-(0.0F)),-((0.1745F)-(0.1745F)));
        animator.rotate(rightArm2, -((-1.0857F)-(-0.6799F)), -((-0.3503F)-(-0.3503F)),-((-0.0086F)-(-0.0086F)));
        animator.rotate(rightArm3, -((0.2235F)-(0.1962F)), -((-0.2166F)-(-0.4721F)),-((-0.0902F)-(-0.0902F)));
        animator.rotate(rightArm4, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-1.5053F)-(-0.0F)));
        animator.rotate(rightLeg, -((-0.0916F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg2, -((0.576F)-(0.576F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg3, -((-0.6109F)-(-0.6109F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg4, -((0.2094F)-(0.2094F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail, -((-0.1222F)-(-0.1222F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail2, -((-0.0349F)-(-0.0349F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail4, -((-0.0436F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail5, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail6, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));


        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
