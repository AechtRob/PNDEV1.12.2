package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLeaellynasaura;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLeaellynasaura extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer Femur_r1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer tail8;
    private final AdvancedModelRenderer tail9;

    private ModelAnimator animator;

    public ModelLeaellynasaura() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 7.0F, 0.5F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -1.5F, -2.6F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1047F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 55, -4.0F, -1.5F, -0.4F, 6, 6, 7, 0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 65, 92, -3.0F, 6.2F, 0.3F, 4, 1, 5, 0.004F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 67, -3.5F, -0.8F, -0.1F, 5, 7, 6, 0.004F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.9F, 0.2F, -0.2F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.4014F, 0.0F, 0.0F);


        this.Femur_r1 = new AdvancedModelRenderer(this);
        this.Femur_r1.setRotationPoint(0.0F, 2.3272F, -0.6209F);
        this.rightLeg.addChild(Femur_r1);
        this.setRotateAngle(Femur_r1, 0.0873F, 0.0F, 0.0F);
        this.Femur_r1.cubeList.add(new ModelBox(Femur_r1, 89, 10, -1.5F, -3.0711F, 0.0174F, 3, 7, 4, 0.003F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 6.1046F, 0.4854F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7941F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 93, -1.1F, -0.2466F, -0.3783F, 2, 8, 3, 0.01F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 29, 36, -1.1F, 2.7534F, 2.6217F, 0, 4, 1, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 7.9543F, 1.3538F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.2182F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.5F, -16.7383F, -0.6555F);
        this.rightLeg3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.8727F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 101, -3.5F, 9.0767F, 11.2776F, 2, 5, 2, -0.002F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.1F, 1.8632F, -3.0821F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, -0.0175F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.4F, -18.7F, 3.6F);
        this.rightLeg4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.576F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 98, -4.0F, 17.4186F, 4.6358F, 3, 1, 3, 0.0F, true));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, -1.6776F, -2.4871F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, -0.0175F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.1F, 0.0185F, 0.5445F);
        this.rightLeg5.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.576F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 89, 22, -1.5F, 0.1F, -2.0F, 3, 1, 2, -0.001F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.9F, 0.2F, -0.2F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.4014F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.3272F, -0.6209F);
        this.leftLeg.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 89, 10, -1.5F, -3.0711F, 0.0174F, 3, 7, 4, 0.003F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 6.1046F, 0.4854F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7941F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 93, -0.9F, -0.2466F, -0.3783F, 2, 8, 3, 0.01F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 29, 36, 1.1F, 2.7534F, 2.6217F, 0, 4, 1, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 7.9543F, 1.3538F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.2182F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.5F, -16.7383F, -0.6555F);
        this.leftLeg3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.8727F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 101, 1.5F, 9.0767F, 11.2776F, 2, 5, 2, -0.002F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(-0.1F, 1.8632F, -3.0821F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, -0.0175F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.4F, -18.7F, 3.6F);
        this.leftLeg4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.576F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 52, 98, 1.0F, 17.4186F, 4.6358F, 3, 1, 3, 0.0F, false));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, -1.6776F, -2.4871F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, -0.0175F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.1F, 0.0185F, 0.5445F);
        this.leftLeg5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.576F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 89, 22, -1.5F, 0.1F, -2.0F, 3, 1, 2, -0.001F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.9F, -2.6F);
        this.hips.addChild(body);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -1.6F, 0.0F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0524F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 46, 91, -2.5F, -1.6F, -8.0F, 4, 1, 5, 0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 33, 19, -4.0F, -0.8F, -8.0F, 7, 7, 8, 0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 46, 81, -2.5F, 7.2F, -8.0F, 4, 1, 8, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 35, 0, -3.5F, 0.2F, -8.0F, 6, 7, 8, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.2F, -7.9F);
        this.body.addChild(chest);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 4.8F, -2.3F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3316F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 84, 92, -3.0F, -2.9374F, 0.0183F, 5, 3, 3, -0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.0F, 1.8F, -3.7F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3142F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 102, 74, 3.0F, -3.3516F, 0.4228F, 0, 1, 4, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 64, 26, 0.5F, -3.0516F, 0.4228F, 5, 1, 5, 0.01F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 87, 37, 0.0F, -2.3516F, 0.4228F, 6, 5, 4, 0.01F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.4F, 4.6011F, -2.2655F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.1805F, -0.3548F, 0.02F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -0.4F, -0.5F);
        this.rightArm.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.7418F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 11, 93, -1.0F, -1.3F, 0.3F, 1, 2, 5, 0.01F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.1F, 2.7F, 2.5F);
        this.rightArm.addChild(rightArm2);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.4F, 0.1F, 0.8F);
        this.rightArm2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.0996F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 98, 99, -0.9F, -1.5662F, -3.6486F, 0, 3, 4, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.4F, 0.1F, 0.8F);
        this.rightArm2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.8378F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 99, -1.0F, -1.6662F, -3.8486F, 1, 2, 4, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.6F, 2.5F, -2.3F);
        this.rightArm2.addChild(rightArm3);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.5F, 0.2F);
        this.rightArm3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.8574F, -0.1855F, -0.21F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 71, 81, 0.1F, -1.5083F, -1.8051F, 1, 2, 2, -0.002F, true));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.4F, 4.6011F, -2.2655F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.1805F, 0.3548F, -0.02F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -0.4F, -0.5F);
        this.leftArm.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.7418F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 11, 93, 0.0F, -1.3F, 0.3F, 1, 2, 5, 0.01F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.1F, 2.7F, 2.5F);
        this.leftArm.addChild(leftArm2);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.4F, 0.1F, 0.8F);
        this.leftArm2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 1.0996F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 98, 99, 0.9F, -1.5662F, -3.6486F, 0, 3, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.4F, 0.1F, 0.8F);
        this.leftArm2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.8378F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 24, 99, 0.0F, -1.6662F, -3.8486F, 1, 2, 4, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.6F, 2.5F, -2.3F);
        this.leftArm2.addChild(leftArm3);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.5F, 0.2F);
        this.leftArm3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.8574F, 0.1855F, 0.21F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 71, 81, -1.1F, -1.5083F, -1.8051F, 1, 2, 2, -0.002F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.3F, -3.7F);
        this.chest.addChild(neck3);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 0.6F, -1.9F);
        this.neck3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0175F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 93, -2.0F, 2.7F, 0.0F, 3, 1, 4, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 89, 0, -2.5F, -2.1F, 0.0F, 4, 5, 4, 0.004F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.1F, -1.8F);
        this.neck3.addChild(neck2);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -2.6F, -2.8F);
        this.neck2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.7854F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 39, 98, -1.0F, 0.6F, 3.2F, 3, 2, 3, 0.01F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 76, 99, -0.5F, 0.5F, 1.0F, 2, 2, 3, 0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -2.6F, -2.8F);
        this.neck2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.6109F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 87, 99, -1.0F, -0.5F, 3.0F, 3, 3, 2, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 65, 99, -0.5F, -0.5F, 0.0F, 2, 3, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.3F, -2.8F);
        this.neck2.addChild(neck);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, 0.3F, 0.2F);
        this.neck.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2269F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 52, 103, -0.5F, -1.0F, -2.0F, 2, 1, 2, 0.03F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 0.3F, 0.2F);
        this.neck.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0524F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 102, 68, -0.5F, -1.0F, -1.9F, 2, 3, 2, 0.004F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.3F, -2.1F);
        this.neck.addChild(head);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.3364F, 0.1008F, -1.1778F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -1.5184F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 104, 53, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 104, 53, 0.1728F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.3F, -0.6F, -1.2F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -1.1345F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 104, 62, -0.2F, -0.0347F, -0.0241F, 1, 1, 1, -0.004F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.7F, -1.1F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -1.309F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 49, 16, -1.0F, -0.9087F, 0.0401F, 2, 1, 1, -0.01F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 35, 16, -1.0F, -1.6087F, 0.0401F, 2, 1, 1, -0.005F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 0.7618F, -4.2658F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 1.7628F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 104, 50, -1.0F, -0.2128F, -1.0085F, 1, 1, 1, 0.004F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 0.3F, -3.7F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.6283F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 104, 47, -1.0F, -0.0465F, -0.9276F, 1, 1, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -1.0177F, -0.1952F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0262F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 56, 16, -1.0F, -0.4F, -0.2F, 2, 1, 1, 0.01F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.1F, 0.3F, -3.7F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3316F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 102, 84, -1.1F, -0.5465F, 1.6724F, 2, 1, 2, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -0.026F, -2.6424F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.7592F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 64, 33, -1.0F, 0.2F, -1.2F, 2, 0, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, 0.22F, -2.3818F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.192F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 104, 65, -1.0F, -0.4F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.22F, -2.3818F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.5498F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 42, 16, -1.0F, -0.8F, -0.4F, 2, 1, 1, -0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.6F, 0.3819F, -3.6895F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.3316F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 104, 10, -1.1F, -0.1465F, 0.0724F, 1, 1, 2, 0.0014F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.7F, 0.8F, -1.8F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.288F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 39, 93, -1.2F, -0.9998F, -1.6973F, 1, 1, 2, -0.012F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, 0.8F, -1.8F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.192F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 71, 86, 0.0F, -0.8998F, -1.8973F, 1, 1, 2, -0.099F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.8F, 0.0F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0175F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 100, 22, -1.0F, -1.0F, -1.0F, 2, 1, 2, -0.004F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 47, 104, -0.8F, -1.0F, -2.0F, 1, 1, 1, -0.003F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 47, 104, -0.2F, -1.0F, -2.0F, 1, 1, 1, -0.003F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.4F, 1.1692F, -1.7273F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.3363F, -0.0641F, -0.0585F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 104, 13, -0.001F, -0.5F, -0.6F, 0, 1, 3, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.4F, 1.1692F, -1.7273F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.3363F, 0.0641F, 0.0585F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 104, 13, 0.001F, -0.5F, -0.6F, 0, 1, 3, 0.0F, false));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 104, 13, 0.0F, -0.5F, -0.6F, 0, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.2F, 0.7F, 0.5F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1745F, 0.0F, 0.0F);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.7F, 0.4844F, -3.1829F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.1396F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 104, 59, 0.0F, -0.9935F, -1.6132F, 1, 1, 1, -0.006F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 104, 56, 0.0F, -0.9935F, -0.9132F, 1, 1, 1, -0.01F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.19F, 0.2844F, -1.5829F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0873F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 101, 92, 0.99F, 0.4331F, -1.8611F, 0, 1, 4, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 35, 104, 0.49F, -0.3669F, -1.9611F, 1, 1, 2, 0.01F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 104, 14, 0.49F, -0.6669F, -1.5611F, 1, 1, 2, -0.01F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -0.1156F, 0.0171F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0349F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 102, 88, -1.2F, 0.0862F, -1.8508F, 2, 1, 2, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 102, 80, -1.2F, -0.2138F, -1.8508F, 2, 1, 2, -0.006F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -1.1156F, 0.0171F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0349F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 103, 81, -1.2F, -0.2138F, -0.8508F, 2, 1, 1, -0.015F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.4F, 3.3F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2618F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 56, 68, -2.5F, -1.9F, -0.3F, 5, 6, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 60, 47, -2.0F, 4.1F, -0.3F, 4, 1, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0175F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 36, -2.0F, -1.6F, -0.4F, 4, 5, 10, 0.004F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 60, 35, -1.5F, 3.4F, -0.4F, 3, 1, 10, 0.004F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 23, 69, -1.5F, -1.1F, 0.0F, 3, 4, 8, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 83, 58, -1.0F, 2.9F, 0.0F, 2, 1, 8, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1222F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 64, 13, -1.5F, -1.1F, -0.3F, 3, 3, 9, -0.01F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 23, 82, -1.0F, 1.9F, -0.3F, 2, 1, 9, -0.01F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.6F, 9.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 52, -1.5F, -0.5F, -0.7F, 3, 3, 11, -0.02F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 56, 55, -1.0F, 2.5F, -0.7F, 2, 1, 11, -0.02F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.0698F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 64, 0, -1.0F, -0.3F, -1.0F, 2, 2, 10, 0.004F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 81, -0.5F, 1.7F, -1.0F, 1, 1, 10, 0.004F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.0873F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 79, 68, -1.0F, -0.3F, 0.0F, 2, 2, 9, 0.0F, false));
        this.tail7.cubeList.add(new ModelBox(tail7, 83, 47, -0.5F, 1.7F, 0.0F, 1, 1, 9, 0.0F, false));

        this.tail8 = new AdvancedModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.0524F, 0.0F, 0.0F);
        this.tail8.cubeList.add(new ModelBox(tail8, 79, 80, -1.0F, -0.4F, 0.0F, 2, 2, 9, 0.004F, false));
        this.tail8.cubeList.add(new ModelBox(tail8, 87, 26, -0.5F, 1.6F, 0.0F, 1, 1, 9, 0.004F, false));

        this.tail9 = new AdvancedModelRenderer(this);
        this.tail9.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail8.addChild(tail9);
        this.setRotateAngle(tail9, -0.0524F, 0.0F, 0.0F);
        this.tail9.cubeList.add(new ModelBox(tail9, 0, 19, -1.5F, -0.7F, 0.0F, 3, 3, 13, 0.0F, false));
        this.tail9.cubeList.add(new ModelBox(tail9, 33, 35, 0.0F, -1.7F, 4.0F, 0, 6, 13, 0.0F, false));
        this.tail9.cubeList.add(new ModelBox(tail9, 0, 0, -1.0F, 0.3F, 0.0F, 2, 3, 15, 0.0F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -1.0F;
        this.hips.offsetX = 0.1F;
        this.hips.rotateAngleY = (float)Math.toRadians(225);
        this.hips.rotateAngleX = (float)Math.toRadians(14);
        this.hips.rotateAngleZ = (float)Math.toRadians(-8);
        this.hips.scaleChildren = true;
        float scaler = 1.63F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.hips.rotateAngleY = (float) Math.toRadians(90);
        this.hips.offsetY = -0.054F;
        this.hips.render(0.01F);
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

        EntityPrehistoricFloraLeaellynasaura EntityLeaellynasaura = (EntityPrehistoricFloraLeaellynasaura) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftArm3};
        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightArm3};

        EntityLeaellynasaura.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityLeaellynasaura.getAnimation() == EntityLeaellynasaura.LAY_ANIMATION) {
            //this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            //this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityLeaellynasaura.isReallyInWater()) {

                if (f3 == 0.0F || !EntityLeaellynasaura.getIsMoving()) {
                    if (EntityLeaellynasaura.getAnimation() != EntityLeaellynasaura.EAT_ANIMATION
                        && EntityLeaellynasaura.getAnimation() != EntityLeaellynasaura.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftArm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm2, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm2, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityLeaellynasaura.getIsFast()) { //Running


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
        EntityPrehistoricFloraLeaellynasaura ee = (EntityPrehistoricFloraLeaellynasaura) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
//            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) { //The noise anim
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLeaellynasaura entity = (EntityPrehistoricFloraLeaellynasaura) entitylivingbaseIn;
        int animCycle = 120;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 12.5 + (((tickAnim - 30) / 60) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 12.5 + (((tickAnim - 90) / 30) * (0-(12.5)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-4.4-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-1.45-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            yy = -4.4 + (((tickAnim - 30) / 60) * (-4.4-(-4.4)));
            zz = -1.45 + (((tickAnim - 30) / 60) * (-1.45-(-1.45)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = -4.4 + (((tickAnim - 90) / 30) * (0-(-4.4)));
            zz = -1.45 + (((tickAnim - 90) / 30) * (0-(-1.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = -25 + (((tickAnim - 30) / 60) * (-25-(-25)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -25 + (((tickAnim - 90) / 30) * (0-(-25)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (45.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 45.75 + (((tickAnim - 30) / 60) * (45.75-(45.75)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 45.75 + (((tickAnim - 90) / 30) * (0-(45.75)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = -34.25 + (((tickAnim - 30) / 60) * (-34.25-(-34.25)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -34.25 + (((tickAnim - 90) / 30) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = -25 + (((tickAnim - 30) / 60) * (-25-(-25)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -25 + (((tickAnim - 90) / 30) * (0-(-25)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (45.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 45.75 + (((tickAnim - 30) / 60) * (45.75-(45.75)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 45.75 + (((tickAnim - 90) / 30) * (0-(45.75)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = -34.25 + (((tickAnim - 30) / 60) * (-34.25-(-34.25)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -34.25 + (((tickAnim - 90) / 30) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*5-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-5 + (((tickAnim - 30) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-5)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*5 + (((tickAnim - 30) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*5)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-5 + (((tickAnim - 90) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-5)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*5 + (((tickAnim - 90) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*5 + (((tickAnim - 30) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*5)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*5 + (((tickAnim - 90) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*5)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-36-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (59+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-100))*-10-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = -36 + (((tickAnim - 30) / 60) * (-36-(-36)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = 59+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-100))*-10 + (((tickAnim - 30) / 60) * (59+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-100))*-10-(59+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-100))*-10)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -36 + (((tickAnim - 90) / 30) * (0-(-36)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 59+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-100))*-10 + (((tickAnim - 90) / 30) * (0-(59+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-100))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-36-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-59+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-100))*10-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = -36 + (((tickAnim - 30) / 60) * (-36-(-36)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = -59+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-100))*10 + (((tickAnim - 30) / 60) * (-59+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-100))*10-(-59+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-100))*10)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -36 + (((tickAnim - 90) / 30) * (0-(-36)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = -59+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-100))*10 + (((tickAnim - 90) / 30) * (0-(-59+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-100))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = -14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5 + (((tickAnim - 30) / 60) * (-14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5-(-14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5 + (((tickAnim - 90) / 30) * (0-(-14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (20.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-100))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 20.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-100))*5 + (((tickAnim - 30) / 60) * (20.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-100))*5-(20.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-100))*5)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 20.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-100))*5 + (((tickAnim - 90) / 30) * (0-(20.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-100))*5)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-24.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = -24.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*5 + (((tickAnim - 30) / 60) * (-24.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*5-(-24.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*5)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -24.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*5 + (((tickAnim - 90) / 30) * (0-(-24.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*5)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = 25.5 + (((tickAnim - 30) / 11) * (0-(25.5)));
            yy = 0 + (((tickAnim - 30) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 11) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 41) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 24) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 65) / 14) * (25.5-(0)));
            yy = 0 + (((tickAnim - 65) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 14) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 90) {
            xx = 25.5 + (((tickAnim - 79) / 11) * (0-(25.5)));
            yy = 0 + (((tickAnim - 79) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5 + (((tickAnim - 30) / 60) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5 + (((tickAnim - 30) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5 + (((tickAnim - 90) / 30) * (0-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5 + (((tickAnim - 90) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-50))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-50))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-50))*5 + (((tickAnim - 30) / 60) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-50))*5-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-50))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-50))*5 + (((tickAnim - 30) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-50))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-50))*5)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-50))*5 + (((tickAnim - 90) / 30) * (0-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-50))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-50))*5 + (((tickAnim - 90) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-50))*5)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.725-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = -0.725 + (((tickAnim - 30) / 60) * (-0.725-(-0.725)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = -0.725 + (((tickAnim - 90) / 30) * (0-(-0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-100))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-100))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-100))*10 + (((tickAnim - 30) / 60) * (14-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-100))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-100))*10 + (((tickAnim - 30) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-100))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-100))*10)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 14 + (((tickAnim - 90) / 30) * (0-(14)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-100))*10 + (((tickAnim - 90) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-100))*10)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.8-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = -0.8 + (((tickAnim - 30) / 60) * (-0.8-(-0.8)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = -0.8 + (((tickAnim - 90) / 30) * (0-(-0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-150))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 14 + (((tickAnim - 30) / 60) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-100))*10-(14)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-150))*10 + (((tickAnim - 30) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-150))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-150))*10)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-100))*10 + (((tickAnim - 90) / 30) * (0-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-100))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-150))*10 + (((tickAnim - 90) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.70-150))*10)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.45-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = -0.45 + (((tickAnim - 30) / 60) * (-0.45-(-0.45)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = -0.45 + (((tickAnim - 90) / 30) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.65-200))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.65-200))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.65-200))*5 + (((tickAnim - 30) / 60) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.65-200))*5-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.65-200))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.65-200))*10 + (((tickAnim - 30) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.65-200))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.65-200))*10)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.65-200))*5 + (((tickAnim - 90) / 30) * (0-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.65-200))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.65-200))*10 + (((tickAnim - 90) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.65-200))*10)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.5-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = -0.5 + (((tickAnim - 30) / 60) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = -0.5 + (((tickAnim - 90) / 30) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.65-220))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.65-220))*20-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.65-220))*1 + (((tickAnim - 30) / 60) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.65-220))*1-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.65-220))*1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.65-220))*20 + (((tickAnim - 30) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.65-220))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.65-220))*20)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.65-220))*1 + (((tickAnim - 90) / 30) * (0-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.65-220))*1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.65-220))*20 + (((tickAnim - 90) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.65-220))*20)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.6-300))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.6-300))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.6-300))*5 + (((tickAnim - 30) / 60) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.6-300))*5-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.6-300))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.6-300))*5 + (((tickAnim - 30) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.65-250))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.6-300))*5)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.6-300))*5 + (((tickAnim - 90) / 30) * (0-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.6-300))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.65-250))*15 + (((tickAnim - 90) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.65-250))*15)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.475-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = -0.475 + (((tickAnim - 30) / 60) * (-0.475-(-0.475)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = -0.475 + (((tickAnim - 90) / 30) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail7.rotationPointX = this.tail7.rotationPointX + (float)(xx);
        this.tail7.rotationPointY = this.tail7.rotationPointY - (float)(yy);
        this.tail7.rotationPointZ = this.tail7.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.6-300))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.6-300))*25-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.6-300))*10 + (((tickAnim - 30) / 60) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.6-300))*10-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.6-300))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.6-300))*25 + (((tickAnim - 30) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.6-300))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.6-300))*25)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.6-300))*10 + (((tickAnim - 90) / 30) * (0-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.6-300))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.6-300))*25 + (((tickAnim - 90) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.6-300))*25)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.325-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 60) * (0-(0)));
            zz = -0.325 + (((tickAnim - 30) / 60) * (-0.325-(-0.325)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = -0.325 + (((tickAnim - 90) / 30) * (0-(-0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail8.rotationPointX = this.tail8.rotationPointX + (float)(xx);
        this.tail8.rotationPointY = this.tail8.rotationPointY - (float)(yy);
        this.tail8.rotationPointZ = this.tail8.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500/0.6-320))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.6-320))*25-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 90) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500/0.6-320))*5 + (((tickAnim - 30) / 60) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500/0.6-320))*5-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500/0.6-320))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.6-320))*25 + (((tickAnim - 30) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.6-320))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.6-320))*25)));
            zz = 0 + (((tickAnim - 30) / 60) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500/0.6-320))*5 + (((tickAnim - 90) / 30) * (0-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500/0.6-320))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.6-320))*25 + (((tickAnim - 90) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.6-320))*25)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(xx), tail9.rotateAngleY + (float) Math.toRadians(yy), tail9.rotateAngleZ + (float) Math.toRadians(zz));

        this.tail9.rotationPointX = this.tail9.rotationPointX + (float)(0);
        this.tail9.rotationPointY = this.tail9.rotationPointY - (float)(0);
        this.tail9.rotationPointZ = this.tail9.rotationPointZ + (float)(0);


    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLeaellynasaura entity = (EntityPrehistoricFloraLeaellynasaura) entitylivingbaseIn;
        int animCycle = 170;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 8.5 + (((tickAnim - 40) / 57) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 98) {
            xx = 8.5 + (((tickAnim - 97) / 1) * (-9.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-20-(8.5)));
            yy = 0 + (((tickAnim - 97) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 1) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 120) {
            xx = -9.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-20 + (((tickAnim - 98) / 22) * (-18.5-(-9.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-20)));
            yy = 0 + (((tickAnim - 98) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 22) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 151) {
            xx = -18.5 + (((tickAnim - 120) / 31) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 120) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 31) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 170) {
            xx = -18.5 + (((tickAnim - 151) / 19) * (0-(-18.5)));
            yy = 0 + (((tickAnim - 151) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 0) / 97) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 97) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 97) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 97) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 97) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 1) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 98) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 98) / 22) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 98) / 22) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 120) / 31) * (0-(0)));
            yy = -0.15 + (((tickAnim - 120) / 31) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 120) / 31) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 151) / 19) * (0-(0)));
            yy = -0.15 + (((tickAnim - 151) / 19) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 151) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = -8.75 + (((tickAnim - 40) / 57) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 98) {
            xx = -8.75 + (((tickAnim - 97) / 1) * (9.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*20-(-8.75)));
            yy = 0 + (((tickAnim - 97) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 1) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 120) {
            xx = 9.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*20 + (((tickAnim - 98) / 22) * (18.25-(9.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*20)));
            yy = 0 + (((tickAnim - 98) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 22) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 151) {
            xx = 18.25 + (((tickAnim - 120) / 31) * (18.25-(18.25)));
            yy = 0 + (((tickAnim - 120) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 31) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 170) {
            xx = 18.25 + (((tickAnim - 151) / 19) * (0-(18.25)));
            yy = 0 + (((tickAnim - 151) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = -8.75 + (((tickAnim - 40) / 57) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 98) {
            xx = -8.75 + (((tickAnim - 97) / 1) * (9.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*20-(-8.75)));
            yy = 0 + (((tickAnim - 97) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 1) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 120) {
            xx = 9.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*20 + (((tickAnim - 98) / 22) * (18.25-(9.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*20)));
            yy = 0 + (((tickAnim - 98) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 22) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 151) {
            xx = 18.25 + (((tickAnim - 120) / 31) * (18.25-(18.25)));
            yy = 0 + (((tickAnim - 120) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 31) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 170) {
            xx = 18.25 + (((tickAnim - 151) / 19) * (0-(18.25)));
            yy = 0 + (((tickAnim - 151) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 4.75 + (((tickAnim - 40) / 20) * (3.75-(4.75)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 97) {
            xx = 3.75 + (((tickAnim - 60) / 37) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 60) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 37) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 120) {
            xx = 3.75 + (((tickAnim - 97) / 23) * (0-(3.75)));
            yy = 0 + (((tickAnim - 97) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 23) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 120) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 13) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 133) / 18) * (0.5-(0)));
            yy = 0 + (((tickAnim - 133) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 18) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 170) {
            xx = 0.5 + (((tickAnim - 151) / 19) * (0-(0.5)));
            yy = 0 + (((tickAnim - 151) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 6.5 + (((tickAnim - 40) / 20) * (4.75-(6.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 97) {
            xx = 4.75 + (((tickAnim - 60) / 37) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 60) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 37) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 120) {
            xx = 4.75 + (((tickAnim - 97) / 23) * (0-(4.75)));
            yy = 0 + (((tickAnim - 97) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 23) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 120) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 13) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 133) / 18) * (-6-(0)));
            yy = 0 + (((tickAnim - 133) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 18) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 170) {
            xx = -6 + (((tickAnim - 151) / 19) * (0-(-6)));
            yy = 0 + (((tickAnim - 151) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.45-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0.45 + (((tickAnim - 40) / 57) * (0.45-(0.45)));
        }
        else if (tickAnim >= 97 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 97) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 97) / 23) * (0-(0)));
            zz = 0.45 + (((tickAnim - 97) / 23) * (0-(0.45)));
        }
        else if (tickAnim >= 120 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 120) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 13) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 133) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 133) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 18) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 151) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 151) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 14.75 + (((tickAnim - 40) / 20) * (22.75-(14.75)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 77) {
            xx = 22.75 + (((tickAnim - 60) / 17) * (14.75-(22.75)));
            yy = 0 + (((tickAnim - 60) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 17) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 97) {
            xx = 14.75 + (((tickAnim - 77) / 20) * (22.75-(14.75)));
            yy = 0 + (((tickAnim - 77) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 20) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 120) {
            xx = 22.75 + (((tickAnim - 97) / 23) * (0-(22.75)));
            yy = 0 + (((tickAnim - 97) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 23) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 120) / 3) * (0.75-(0)));
            yy = 0 + (((tickAnim - 120) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 3) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 125) {
            xx = 0.75 + (((tickAnim - 123) / 2) * (0-(0.75)));
            yy = 0 + (((tickAnim - 123) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 2) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 125) / 3) * (0.75-(0)));
            yy = 0 + (((tickAnim - 125) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 3) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 130) {
            xx = 0.75 + (((tickAnim - 128) / 2) * (0-(0.75)));
            yy = 0 + (((tickAnim - 128) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 2) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 130) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 3) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 133) / 11) * (-6.41511-(0)));
            yy = 0 + (((tickAnim - 133) / 11) * (-5.95145-(0)));
            zz = 0 + (((tickAnim - 133) / 11) * (-5.9875-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 170) {
            xx = -6.41511 + (((tickAnim - 144) / 26) * (0-(-6.41511)));
            yy = -5.95145 + (((tickAnim - 144) / 26) * (0-(-5.95145)));
            zz = -5.9875 + (((tickAnim - 144) / 26) * (0-(-5.9875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (23.5-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 23.5 + (((tickAnim - 40) / 10) * (4.5-(23.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 4.5 + (((tickAnim - 50) / 10) * (25.25-(4.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 25.25 + (((tickAnim - 60) / 7) * (14-(25.25)));
            yy = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 7) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 77) {
            xx = 14 + (((tickAnim - 67) / 10) * (39-(14)));
            yy = 0 + (((tickAnim - 67) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 10) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 87) {
            xx = 39 + (((tickAnim - 77) / 10) * (19.25-(39)));
            yy = 0 + (((tickAnim - 77) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 10) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 97) {
            xx = 19.25 + (((tickAnim - 87) / 10) * (25.25-(19.25)));
            yy = 0 + (((tickAnim - 87) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 10) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 120) {
            xx = 25.25 + (((tickAnim - 97) / 23) * (0-(25.25)));
            yy = 0 + (((tickAnim - 97) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 23) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 120) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 13) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 133) / 11) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 133) / 11) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 133) / 11) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 151) {
            xx = -5.25 + (((tickAnim - 144) / 7) * (-0.75-(-5.25)));
            yy = -12.5 + (((tickAnim - 144) / 7) * (-12.5-(-12.5)));
            zz = 0 + (((tickAnim - 144) / 7) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 170) {
            xx = -0.75 + (((tickAnim - 151) / 19) * (0-(-0.75)));
            yy = -12.5 + (((tickAnim - 151) / 19) * (0-(-12.5)));
            zz = 0 + (((tickAnim - 151) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 24.75 + (((tickAnim - 30) / 10) * (0-(24.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (22-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 22 + (((tickAnim - 50) / 10) * (1.25-(22)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 1.25 + (((tickAnim - 60) / 7) * (24.75-(1.25)));
            yy = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 7) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 77) {
            xx = 24.75 + (((tickAnim - 67) / 10) * (0-(24.75)));
            yy = 0 + (((tickAnim - 67) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 10) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 77) / 10) * (22-(0)));
            yy = 0 + (((tickAnim - 77) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 10) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 97) {
            xx = 22 + (((tickAnim - 87) / 10) * (1.25-(22)));
            yy = 0 + (((tickAnim - 87) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 10) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 107) {
            xx = 1.25 + (((tickAnim - 97) / 10) * (29.21-(1.25)));
            yy = 0 + (((tickAnim - 97) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 10) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 120) {
            xx = 29.21 + (((tickAnim - 107) / 13) * (21.75-(29.21)));
            yy = 0 + (((tickAnim - 107) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 13) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 123) {
            xx = 21.75 + (((tickAnim - 120) / 3) * (20.5-(21.75)));
            yy = 0 + (((tickAnim - 120) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 3) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 125) {
            xx = 20.5 + (((tickAnim - 123) / 2) * (21.75-(20.5)));
            yy = 0 + (((tickAnim - 123) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 2) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 128) {
            xx = 21.75 + (((tickAnim - 125) / 3) * (20.5-(21.75)));
            yy = 0 + (((tickAnim - 125) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 3) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 130) {
            xx = 20.5 + (((tickAnim - 128) / 2) * (21.75-(20.5)));
            yy = 0 + (((tickAnim - 128) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 2) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 133) {
            xx = 21.75 + (((tickAnim - 130) / 3) * (21.75-(21.75)));
            yy = 0 + (((tickAnim - 130) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 3) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 144) {
            xx = 21.75 + (((tickAnim - 133) / 11) * (33.25-(21.75)));
            yy = 0 + (((tickAnim - 133) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 11) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 170) {
            xx = 33.25 + (((tickAnim - 144) / 26) * (0-(33.25)));
            yy = 0 + (((tickAnim - 144) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 0) / 133) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 133) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 133) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 133) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 133) / 6) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 133) / 6) * (0.15-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 139) / 5) * (0-(0)));
            yy = -0.25 + (((tickAnim - 139) / 5) * (0-(-0.25)));
            zz = 0.15 + (((tickAnim - 139) / 5) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 144 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 144) / 2) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 144) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 2) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 148) {
            xx = -1.5 + (((tickAnim - 146) / 2) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 146) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 2) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 148) / 1) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 148) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 1) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 151) {
            xx = -1.5 + (((tickAnim - 149) / 2) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 149) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (20.25-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 20.25 + (((tickAnim - 35) / 5) * (0-(20.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (6.75-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 45) / 5) * (0-(6.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (20.25-(0)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 20.25 + (((tickAnim - 55) / 5) * (0-(20.25)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 7) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 67) / 5) * (20.25-(0)));
            yy = 0 + (((tickAnim - 67) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 5) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 77) {
            xx = 20.25 + (((tickAnim - 72) / 5) * (0-(20.25)));
            yy = 0 + (((tickAnim - 72) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 5) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 77) / 5) * (6.75-(0)));
            yy = 0 + (((tickAnim - 77) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 5) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 87) {
            xx = 6.75 + (((tickAnim - 82) / 5) * (0-(6.75)));
            yy = 0 + (((tickAnim - 82) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 5) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 87) / 5) * (20.25-(0)));
            yy = 0 + (((tickAnim - 87) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 5) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 97) {
            xx = 20.25 + (((tickAnim - 92) / 5) * (0-(20.25)));
            yy = 0 + (((tickAnim - 92) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 97) {
            xx = 7 + (((tickAnim - 60) / 37) * (5.05-(7)));
            yy = 0 + (((tickAnim - 60) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 37) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 120) {
            xx = 5.05 + (((tickAnim - 97) / 23) * (6.25-(5.05)));
            yy = 0 + (((tickAnim - 97) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 23) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 151) {
            xx = 6.25 + (((tickAnim - 120) / 31) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 120) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 31) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 170) {
            xx = 6.25 + (((tickAnim - 151) / 19) * (0-(6.25)));
            yy = 0 + (((tickAnim - 151) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 106) {
            xx = -0.5 + (((tickAnim - 60) / 46) * (1.5-(-0.5)));
            yy = 0 + (((tickAnim - 60) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 46) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 120) {
            xx = 1.5 + (((tickAnim - 106) / 14) * (2.75-(1.5)));
            yy = 0 + (((tickAnim - 106) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 14) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 151) {
            xx = 2.75 + (((tickAnim - 120) / 31) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 120) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 31) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 170) {
            xx = 2.75 + (((tickAnim - 151) / 19) * (0-(2.75)));
            yy = 0 + (((tickAnim - 151) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -6.75 + (((tickAnim - 40) / 20) * (-7.25-(-6.75)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 106) {
            xx = -7.25 + (((tickAnim - 60) / 46) * (-4.75-(-7.25)));
            yy = 0 + (((tickAnim - 60) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 46) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 120) {
            xx = -4.75 + (((tickAnim - 106) / 14) * (1.75-(-4.75)));
            yy = 0 + (((tickAnim - 106) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 14) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 133) {
            xx = 1.75 + (((tickAnim - 120) / 13) * (2.25-(1.75)));
            yy = 0 + (((tickAnim - 120) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 13) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 151) {
            xx = 2.25 + (((tickAnim - 133) / 18) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 133) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 18) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 170) {
            xx = 2.25 + (((tickAnim - 151) / 19) * (0-(2.25)));
            yy = 0 + (((tickAnim - 151) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -9.75 + (((tickAnim - 40) / 20) * (-10.75-(-9.75)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 106) {
            xx = -10.75 + (((tickAnim - 60) / 46) * (-10-(-10.75)));
            yy = 0 + (((tickAnim - 60) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 46) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 120) {
            xx = -10 + (((tickAnim - 106) / 14) * (1.5-(-10)));
            yy = 0 + (((tickAnim - 106) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 14) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 133) {
            xx = 1.5 + (((tickAnim - 120) / 13) * (2.75-(1.5)));
            yy = 0 + (((tickAnim - 120) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 13) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 151) {
            xx = 2.75 + (((tickAnim - 133) / 18) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 133) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 18) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 170) {
            xx = 2.75 + (((tickAnim - 151) / 19) * (0-(2.75)));
            yy = 0 + (((tickAnim - 151) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 97) {
            xx = -6.5 + (((tickAnim - 60) / 37) * (-6.63-(-6.5)));
            yy = 0 + (((tickAnim - 60) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 37) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 120) {
            xx = -6.63 + (((tickAnim - 97) / 23) * (1-(-6.63)));
            yy = 0 + (((tickAnim - 97) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 23) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 133) {
            xx = 1 + (((tickAnim - 120) / 13) * (2.75-(1)));
            yy = 0 + (((tickAnim - 120) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 13) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 151) {
            xx = 2.75 + (((tickAnim - 133) / 18) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 133) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 18) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 170) {
            xx = 2.75 + (((tickAnim - 151) / 19) * (0-(2.75)));
            yy = 0 + (((tickAnim - 151) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 97) {
            xx = -0.75 + (((tickAnim - 60) / 37) * (0.34-(-0.75)));
            yy = 0 + (((tickAnim - 60) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 37) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 106) {
            xx = 0.34 + (((tickAnim - 97) / 9) * (3.5-(0.34)));
            yy = 0 + (((tickAnim - 97) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 9) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 114) {
            xx = 3.5 + (((tickAnim - 106) / 8) * (7.66-(3.5)));
            yy = 0 + (((tickAnim - 106) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 8) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 120) {
            xx = 7.66 + (((tickAnim - 114) / 6) * (6.75-(7.66)));
            yy = 0 + (((tickAnim - 114) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 6) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 133) {
            xx = 6.75 + (((tickAnim - 120) / 13) * (5.25-(6.75)));
            yy = 0 + (((tickAnim - 120) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 13) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 151) {
            xx = 5.25 + (((tickAnim - 133) / 18) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 133) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 18) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 170) {
            xx = 5.25 + (((tickAnim - 151) / 19) * (0-(5.25)));
            yy = 0 + (((tickAnim - 151) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 97) {
            xx = -1.75 + (((tickAnim - 60) / 37) * (2.75-(-1.75)));
            yy = 0 + (((tickAnim - 60) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 37) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 106) {
            xx = 2.75 + (((tickAnim - 97) / 9) * (8.25-(2.75)));
            yy = 0 + (((tickAnim - 97) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 9) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 120) {
            xx = 8.25 + (((tickAnim - 106) / 14) * (5.25-(8.25)));
            yy = 0 + (((tickAnim - 106) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 14) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 133) {
            xx = 5.25 + (((tickAnim - 120) / 13) * (4.5-(5.25)));
            yy = 0 + (((tickAnim - 120) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 13) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 151) {
            xx = 4.5 + (((tickAnim - 133) / 18) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 133) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 18) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 170) {
            xx = 4.5 + (((tickAnim - 151) / 19) * (0-(4.5)));
            yy = 0 + (((tickAnim - 151) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 60) / 13) * (-1.29-(0)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 97) {
            xx = -1.29 + (((tickAnim - 73) / 24) * (-0.59-(-1.29)));
            yy = 0 + (((tickAnim - 73) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 24) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 106) {
            xx = -0.59 + (((tickAnim - 97) / 9) * (5.25-(-0.59)));
            yy = 0 + (((tickAnim - 97) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 9) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 120) {
            xx = 5.25 + (((tickAnim - 106) / 14) * (-1-(5.25)));
            yy = 0 + (((tickAnim - 106) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 14) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 133) {
            xx = -1 + (((tickAnim - 120) / 13) * (-1.625-(-1)));
            yy = 0 + (((tickAnim - 120) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 13) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 151) {
            xx = -1.625 + (((tickAnim - 133) / 18) * (-1.625-(-1.625)));
            yy = 0 + (((tickAnim - 133) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 18) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 170) {
            xx = -1.625 + (((tickAnim - 151) / 19) * (0-(-1.625)));
            yy = 0 + (((tickAnim - 151) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = -2 + (((tickAnim - 60) / 13) * (-5.84-(-2)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 97) {
            xx = -5.84 + (((tickAnim - 73) / 24) * (-0.29-(-5.84)));
            yy = 0 + (((tickAnim - 73) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 24) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 106) {
            xx = -0.29 + (((tickAnim - 97) / 9) * (8.5-(-0.29)));
            yy = 0 + (((tickAnim - 97) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 9) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 120) {
            xx = 8.5 + (((tickAnim - 106) / 14) * (-0.83017-(8.5)));
            yy = 0 + (((tickAnim - 106) / 14) * (1.4142-(0)));
            zz = 0 + (((tickAnim - 106) / 14) * (-1.21924-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 133) {
            xx = -0.83017 + (((tickAnim - 120) / 13) * (-2.08017-(-0.83017)));
            yy = 1.4142 + (((tickAnim - 120) / 13) * (1.4142-(1.4142)));
            zz = -1.21924 + (((tickAnim - 120) / 13) * (-1.21924-(-1.21924)));
        }
        else if (tickAnim >= 133 && tickAnim < 151) {
            xx = -2.08017 + (((tickAnim - 133) / 18) * (-2.08017-(-2.08017)));
            yy = 1.4142 + (((tickAnim - 133) / 18) * (1.4142-(1.4142)));
            zz = -1.21924 + (((tickAnim - 133) / 18) * (-1.21924-(-1.21924)));
        }
        else if (tickAnim >= 151 && tickAnim < 170) {
            xx = -2.08017 + (((tickAnim - 151) / 19) * (0-(-2.08017)));
            yy = 1.4142 + (((tickAnim - 151) / 19) * (0-(1.4142)));
            zz = -1.21924 + (((tickAnim - 151) / 19) * (0-(-1.21924)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(xx), tail9.rotateAngleY + (float) Math.toRadians(yy), tail9.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLeaellynasaura entity = (EntityPrehistoricFloraLeaellynasaura) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (30.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 30.5 + (((tickAnim - 15) / 10) * (0-(30.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (30.5-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 30.5 + (((tickAnim - 40) / 10) * (0-(30.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 26.75 + (((tickAnim - 15) / 10) * (0-(26.75)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (26.75-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 26.75 + (((tickAnim - 40) / 10) * (0-(26.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-55.75-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -55.75 + (((tickAnim - 20) / 5) * (0-(-55.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (-55.75-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -55.75 + (((tickAnim - 45) / 5) * (0-(-55.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (64.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 64.5 + (((tickAnim - 15) / 5) * (74.25-(64.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 74.25 + (((tickAnim - 20) / 5) * (0-(74.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (64.5-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 64.5 + (((tickAnim - 40) / 5) * (74.25-(64.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 74.25 + (((tickAnim - 45) / 5) * (0-(74.25)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.85 + (((tickAnim - 15) / 5) * (1.405-(0.85)));
            zz = 0 + (((tickAnim - 15) / 5) * (0.825-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 1.405 + (((tickAnim - 20) / 5) * (0-(1.405)));
            zz = 0.825 + (((tickAnim - 20) / 5) * (0-(0.825)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0.85-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0.85 + (((tickAnim - 40) / 5) * (1.405-(0.85)));
            zz = 0 + (((tickAnim - 40) / 5) * (0.825-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 1.405 + (((tickAnim - 45) / 5) * (0-(1.405)));
            zz = 0.825 + (((tickAnim - 45) / 5) * (0-(0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-41-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -41 + (((tickAnim - 5) / 10) * (33-(-41)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 33 + (((tickAnim - 15) / 10) * (0-(33)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (-41-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -41 + (((tickAnim - 30) / 10) * (33-(-41)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 33 + (((tickAnim - 40) / 10) * (0-(33)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.425-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 5) / 5) * (0-(-0.275)));
            zz = 0.425 + (((tickAnim - 5) / 5) * (0.075-(0.425)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-0.25-(0)));
            zz = 0.075 + (((tickAnim - 10) / 5) * (0-(0.075)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 15) / 10) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0.425-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 30) / 5) * (0-(-0.275)));
            zz = 0.425 + (((tickAnim - 30) / 5) * (0.075-(0.425)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (-0.25-(0)));
            zz = 0.075 + (((tickAnim - 35) / 5) * (0-(0.075)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 40) / 10) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLeaellynasaura entity = (EntityPrehistoricFloraLeaellynasaura) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -21 + (((tickAnim - 15) / 20) * (-21-(-21)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -21 + (((tickAnim - 35) / 15) * (0-(-21)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (-3.725-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.775-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -3.725 + (((tickAnim - 15) / 20) * (-3.725-(-3.725)));
            zz = 2.775 + (((tickAnim - 15) / 20) * (2.775-(2.775)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -3.725 + (((tickAnim - 35) / 15) * (0-(-3.725)));
            zz = 2.775 + (((tickAnim - 35) / 15) * (0-(2.775)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -7 + (((tickAnim - 15) / 20) * (-7-(-7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 35) / 15) * (0-(-7)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (39.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 39.5 + (((tickAnim - 15) / 20) * (39.5-(39.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 39.5 + (((tickAnim - 35) / 15) * (0-(39.5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-36.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -36.25 + (((tickAnim - 15) / 20) * (-36.25-(-36.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -36.25 + (((tickAnim - 35) / 15) * (0-(-36.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 24.25 + (((tickAnim - 15) / 20) * (24.25-(24.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 24.25 + (((tickAnim - 35) / 15) * (0-(24.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -7 + (((tickAnim - 15) / 20) * (-7-(-7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 35) / 15) * (0-(-7)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (39.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 39.5 + (((tickAnim - 15) / 20) * (39.5-(39.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 39.5 + (((tickAnim - 35) / 15) * (0-(39.5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-36.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -36.25 + (((tickAnim - 15) / 20) * (-36.25-(-36.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -36.25 + (((tickAnim - 35) / 15) * (0-(-36.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 24.25 + (((tickAnim - 15) / 20) * (24.25-(24.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 24.25 + (((tickAnim - 35) / 15) * (0-(24.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.25 + (((tickAnim - 15) / 20) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 35) / 15) * (0-(10.25)));
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



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7.5 + (((tickAnim - 15) / 20) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 35) / 15) * (0-(7.5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.75 + (((tickAnim - 15) / 20) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 35) / 15) * (0-(5.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.4-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -0.4 + (((tickAnim - 15) / 20) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -0.4 + (((tickAnim - 35) / 15) * (0-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.25 + (((tickAnim - 15) / 20) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.25 + (((tickAnim - 35) / 15) * (0-(3.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 4 + (((tickAnim - 15) / 20) * (4-(4)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 35) / 15) * (0-(4)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.5 + (((tickAnim - 15) / 20) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.5 + (((tickAnim - 35) / 15) * (0-(3.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 4.25 + (((tickAnim - 15) / 20) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 4.25 + (((tickAnim - 35) / 15) * (0-(4.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLeaellynasaura entity = (EntityPrehistoricFloraLeaellynasaura) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -11.75 + (((tickAnim - 8) / 4) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -11.75 + (((tickAnim - 20) / 5) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-16.12-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -16.12 + (((tickAnim - 4) / 4) * (-3.75-(-16.12)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -3.75 + (((tickAnim - 8) / 6) * (-15.5-(-3.75)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -15.5 + (((tickAnim - 14) / 4) * (-16.12-(-15.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -16.12 + (((tickAnim - 18) / 2) * (-3.75-(-16.12)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -3.75 + (((tickAnim - 20) / 5) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.6-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 4) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 14) * (0-(0)));
            zz = 0.6 + (((tickAnim - 4) / 14) * (0.6-(0.6)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0.6 + (((tickAnim - 18) / 7) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (6.88-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 6.88 + (((tickAnim - 4) / 4) * (-8.25-(6.88)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -8.25 + (((tickAnim - 8) / 6) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (6.88-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 6.88 + (((tickAnim - 18) / 2) * (-8.25-(6.88)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -8.25 + (((tickAnim - 20) / 5) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 23.5 + (((tickAnim - 8) / 6) * (0-(23.5)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (23.5-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 23.5 + (((tickAnim - 20) / 5) * (0-(23.5)));
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
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLeaellynasaura entity = (EntityPrehistoricFloraLeaellynasaura) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 9.75 + (((tickAnim - 7) / 8) * (0-(9.75)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.5-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0.5 + (((tickAnim - 7) / 8) * (0-(0.5)));
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
            xx = 0 + (((tickAnim - 0) / 7) * (27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 27.25 + (((tickAnim - 7) / 8) * (0-(27.25)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (40.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 40.5 + (((tickAnim - 7) / 8) * (0-(40.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (37.88-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 37.88 + (((tickAnim - 3) / 4) * (9.25-(37.88)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 9.25 + (((tickAnim - 7) / 8) * (0-(9.25)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 22 + (((tickAnim - 3) / 4) * (0-(22)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLeaellynasaura entity = (EntityPrehistoricFloraLeaellynasaura) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 49.49249 + (((tickAnim - 0) / 6) * (-28.25536-(49.49249)));
            yy = 6.99893 + (((tickAnim - 0) / 6) * (5.55716-(6.99893)));
            zz = -0.12278 + (((tickAnim - 0) / 6) * (-0.06329-(-0.12278)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -28.25536 + (((tickAnim - 6) / 7) * (49.49249-(-28.25536)));
            yy = 5.55716 + (((tickAnim - 6) / 7) * (6.99893-(5.55716)));
            zz = -0.06329 + (((tickAnim - 6) / 7) * (-0.12278-(-0.06329)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 31.5 + (((tickAnim - 0) / 1) * (39.35-(31.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 39.35 + (((tickAnim - 1) / 5) * (-1-(39.35)));
            yy = 0 + (((tickAnim - 1) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 5) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -1 + (((tickAnim - 6) / 7) * (31.5-(-1)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 6) * (-0.4-(0.2)));
            zz = -0.25 + (((tickAnim - 0) / 6) * (0-(-0.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.4 + (((tickAnim - 6) / 7) * (0.2-(-0.4)));
            zz = 0 + (((tickAnim - 6) / 7) * (-0.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.75 + (((tickAnim - 0) / 2) * (-41.04-(-7.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -41.04 + (((tickAnim - 2) / 2) * (-56.54-(-41.04)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -56.54 + (((tickAnim - 4) / 2) * (13.75-(-56.54)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 13.75 + (((tickAnim - 6) / 7) * (-7.75-(13.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -0.05 + (((tickAnim - 6) / 7) * (0-(-0.05)));
            yy = -0.775 + (((tickAnim - 6) / 7) * (0-(-0.775)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 84.75 + (((tickAnim - 0) / 2) * (76.38-(84.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 76.38 + (((tickAnim - 2) / 2) * (77.32-(76.38)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 77.32 + (((tickAnim - 4) / 2) * (37.85879-(77.32)));
            yy = 0 + (((tickAnim - 4) / 2) * (5.71726-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (-4.22733-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 37.85879 + (((tickAnim - 6) / 1) * (6.70895-(37.85879)));
            yy = 5.71726 + (((tickAnim - 6) / 1) * (9.24952-(5.71726)));
            zz = -4.22733 + (((tickAnim - 6) / 1) * (9.22805-(-4.22733)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 6.70895 + (((tickAnim - 7) / 1) * (-6.01381-(6.70895)));
            yy = 9.24952 + (((tickAnim - 7) / 1) * (8.2093-(9.24952)));
            zz = 9.22805 + (((tickAnim - 7) / 1) * (7.22507-(9.22805)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -6.01381 + (((tickAnim - 8) / 2) * (59.07786-(-6.01381)));
            yy = 8.2093 + (((tickAnim - 8) / 2) * (0.46749-(8.2093)));
            zz = 7.22507 + (((tickAnim - 8) / 2) * (-0.19065-(7.22507)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 59.07786 + (((tickAnim - 10) / 3) * (55.75-(59.07786)));
            yy = 0.46749 + (((tickAnim - 10) / 3) * (0-(0.46749)));
            zz = -0.19065 + (((tickAnim - 10) / 3) * (0-(-0.19065)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.75 + (((tickAnim - 0) / 2) * (1.255-(0.75)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.6-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 1.255 + (((tickAnim - 2) / 2) * (1.355-(1.255)));
            zz = 0.6 + (((tickAnim - 2) / 2) * (0.3-(0.6)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 1.355 + (((tickAnim - 4) / 2) * (1.675-(1.355)));
            zz = 0.3 + (((tickAnim - 4) / 2) * (1.025-(0.3)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 1.675 + (((tickAnim - 6) / 1) * (1.065-(1.675)));
            zz = 1.025 + (((tickAnim - 6) / 1) * (1.285-(1.025)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.065 + (((tickAnim - 7) / 1) * (1.135-(1.065)));
            zz = 1.285 + (((tickAnim - 7) / 1) * (1.39-(1.285)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.135 + (((tickAnim - 8) / 1) * (0.765-(1.135)));
            zz = 1.39 + (((tickAnim - 8) / 1) * (0.4-(1.39)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.765 + (((tickAnim - 9) / 1) * (0.64-(0.765)));
            zz = 0.4 + (((tickAnim - 9) / 1) * (-0.3-(0.4)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.64 + (((tickAnim - 10) / 3) * (0.75-(0.64)));
            zz = -0.3 + (((tickAnim - 10) / 3) * (0-(-0.3)));
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
            xx = 37.25 + (((tickAnim - 0) / 4) * (33.08-(37.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 33.08 + (((tickAnim - 4) / 2) * (0-(33.08)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (-33.81-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -33.81 + (((tickAnim - 8) / 2) * (-0.19-(-33.81)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -0.19 + (((tickAnim - 10) / 3) * (37.25-(-0.19)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 4) * (-0.23-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.025-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.23 + (((tickAnim - 4) / 2) * (0-(-0.23)));
            zz = -0.025 + (((tickAnim - 4) / 2) * (0-(-0.025)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0.55-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = -0.35 + (((tickAnim - 9) / 1) * (0-(-0.35)));
            zz = 0.55 + (((tickAnim - 9) / 1) * (0-(0.55)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.12-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0.31-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.12 + (((tickAnim - 12) / 1) * (-0.325-(-0.12)));
            zz = 0.31 + (((tickAnim - 12) / 1) * (0-(0.31)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -32.21496 + (((tickAnim - 0) / 6) * (49.49249-(-32.21496)));
            yy = -7.67393 + (((tickAnim - 0) / 6) * (-6.99893-(-7.67393)));
            zz = 0.60639 + (((tickAnim - 0) / 6) * (0.12278-(0.60639)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 49.49249 + (((tickAnim - 6) / 7) * (-32.21496-(49.49249)));
            yy = -6.99893 + (((tickAnim - 6) / 7) * (-7.67393-(-6.99893)));
            zz = 0.12278 + (((tickAnim - 6) / 7) * (0.60639-(0.12278)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -6.5 + (((tickAnim - 0) / 6) * (24.5-(-6.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 24.5 + (((tickAnim - 6) / 7) * (-6.5-(24.5)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 6) * (0.2-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.25-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.2 + (((tickAnim - 6) / 7) * (-0.4-(0.2)));
            zz = -0.25 + (((tickAnim - 6) / 7) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 13.75 + (((tickAnim - 0) / 6) * (-7.75-(13.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -7.75 + (((tickAnim - 6) / 2) * (-41.04-(-7.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -41.04 + (((tickAnim - 8) / 2) * (-56.54-(-41.04)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -56.54 + (((tickAnim - 10) / 3) * (13.75-(-56.54)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.775 + (((tickAnim - 0) / 6) * (0-(-0.775)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 56.90465 + (((tickAnim - 0) / 1) * (9.68469-(56.90465)));
            yy = -7.96282 + (((tickAnim - 0) / 1) * (-5.94368-(-7.96282)));
            zz = -6.61917 + (((tickAnim - 0) / 1) * (-7.63054-(-6.61917)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 9.68469 + (((tickAnim - 1) / 1) * (-9.03526-(9.68469)));
            yy = -5.94368 + (((tickAnim - 1) / 1) * (-3.92455-(-5.94368)));
            zz = -7.63054 + (((tickAnim - 1) / 1) * (-8.6419-(-7.63054)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -9.03526 + (((tickAnim - 2) / 1) * (27.42-(-9.03526)));
            yy = -3.92455 + (((tickAnim - 2) / 1) * (0-(-3.92455)));
            zz = -8.6419 + (((tickAnim - 2) / 1) * (0-(-8.6419)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 27.42 + (((tickAnim - 3) / 0) * (53.53-(27.42)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 53.53 + (((tickAnim - 3) / 3) * (55.75-(53.53)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 55.75 + (((tickAnim - 6) / 2) * (76.38-(55.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 76.38 + (((tickAnim - 8) / 2) * (77.32-(76.38)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 77.32 + (((tickAnim - 10) / 3) * (56.90465-(77.32)));
            yy = 0 + (((tickAnim - 10) / 3) * (-7.96282-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-6.61917-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.9 + (((tickAnim - 0) / 1) * (1.14-(0.9)));
            zz = 0.475 + (((tickAnim - 0) / 1) * (0.89-(0.475)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 1.14 + (((tickAnim - 1) / 1) * (0.65-(1.14)));
            zz = 0.89 + (((tickAnim - 1) / 1) * (0.875-(0.89)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.65 + (((tickAnim - 2) / 1) * (1.365-(0.65)));
            zz = 0.875 + (((tickAnim - 2) / 1) * (0.825-(0.875)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 1.365 + (((tickAnim - 3) / 0) * (0.71-(1.365)));
            zz = 0.825 + (((tickAnim - 3) / 0) * (-0.305-(0.825)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.71 + (((tickAnim - 3) / 3) * (0.75-(0.71)));
            zz = -0.305 + (((tickAnim - 3) / 3) * (0-(-0.305)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.75 + (((tickAnim - 6) / 2) * (1.255-(0.75)));
            zz = 0 + (((tickAnim - 6) / 2) * (0.6-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.255 + (((tickAnim - 8) / 2) * (1.355-(1.255)));
            zz = 0.6 + (((tickAnim - 8) / 2) * (0.3-(0.6)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.355 + (((tickAnim - 10) / 3) * (0.9-(1.355)));
            zz = 0.3 + (((tickAnim - 10) / 3) * (0.475-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-80))*7), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-100))*-5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-100))*-9));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(-0.0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-140))*1.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5))*2);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-40.75-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -40.75 + (((tickAnim - 3) / 3) * (37.25-(-40.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 37.25 + (((tickAnim - 6) / 4) * (33.08-(37.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 33.08 + (((tickAnim - 10) / 3) * (0-(33.08)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (-0.33-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0.46-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -0.33 + (((tickAnim - 3) / 0) * (-0.25-(-0.33)));
            zz = 0.46 + (((tickAnim - 3) / 0) * (0.65-(0.46)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 3) / 3) * (-0.325-(-0.25)));
            zz = 0.65 + (((tickAnim - 3) / 3) * (0-(0.65)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -0.325 + (((tickAnim - 6) / 4) * (-0.23-(-0.325)));
            zz = 0 + (((tickAnim - 6) / 4) * (-0.025-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -0.23 + (((tickAnim - 10) / 3) * (0-(-0.23)));
            zz = -0.025 + (((tickAnim - 10) / 3) * (0-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-100))*-12), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-100))*5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-120))*9));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-150))*8), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-180))*-9));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-200))*3), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-180))*2));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-300))*5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-180))*2));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-200))*3), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-180))*2));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-300))*5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-180))*2));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-200))*-8), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-330))*-9));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-200))*6), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-300))*5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-100))*-4), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*5), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-50))*5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-100))*-3), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-50))*5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-100))*5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-150))*-3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-100))*8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-150))*6));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-250))*-5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-150))*10), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-200))*7));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-300))*-5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-200))*13), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-250))*8));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(3.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-400))*-6), tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-250))*9), tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-300))*8));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-450))*7), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-250))*7), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-350))*6));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-500))*7), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-450))*-8), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-400))*7));


        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-550))*8), tail9.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-450))*-9), tail9.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-450))*9));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLeaellynasaura entity = (EntityPrehistoricFloraLeaellynasaura) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 30.24249 + (((tickAnim - 0) / 10) * (-27.47056-(30.24249)));
            yy = 6.99893 + (((tickAnim - 0) / 10) * (0.28223-(6.99893)));
            zz = -0.12278 + (((tickAnim - 0) / 10) * (-4.28188-(-0.12278)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -27.47056 + (((tickAnim - 10) / 10) * (30.24249-(-27.47056)));
            yy = 0.28223 + (((tickAnim - 10) / 10) * (6.99893-(0.28223)));
            zz = -4.28188 + (((tickAnim - 10) / 10) * (-0.12278-(-4.28188)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 31.5 + (((tickAnim - 0) / 1) * (39.35-(31.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 10) {
            xx = 39.35 + (((tickAnim - 1) / 9) * (-1-(39.35)));
            yy = 0 + (((tickAnim - 1) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 9) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -1 + (((tickAnim - 10) / 10) * (31.5-(-1)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 10) * (-0.4-(0.2)));
            zz = -0.25 + (((tickAnim - 0) / 10) * (0-(-0.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 10) / 10) * (0.2-(-0.4)));
            zz = 0 + (((tickAnim - 10) / 10) * (-0.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -7.75 + (((tickAnim - 0) / 3) * (-41.04-(-7.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -41.04 + (((tickAnim - 3) / 4) * (-56.54-(-41.04)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -56.54 + (((tickAnim - 7) / 3) * (13.75-(-56.54)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13.75 + (((tickAnim - 10) / 10) * (-7.75-(13.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.05 + (((tickAnim - 10) / 10) * (0-(-0.05)));
            yy = -0.775 + (((tickAnim - 10) / 10) * (0-(-0.775)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 55.75 + (((tickAnim - 0) / 3) * (76.38-(55.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 76.38 + (((tickAnim - 3) / 4) * (77.32-(76.38)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 77.32 + (((tickAnim - 7) / 3) * (17.40465-(77.32)));
            yy = 0 + (((tickAnim - 7) / 3) * (7.96282-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (6.61917-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 17.40465 + (((tickAnim - 10) / 3) * (-6.01381-(17.40465)));
            yy = 7.96282 + (((tickAnim - 10) / 3) * (8.2093-(7.96282)));
            zz = 6.61917 + (((tickAnim - 10) / 3) * (7.22507-(6.61917)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -6.01381 + (((tickAnim - 13) / 3) * (59.07786-(-6.01381)));
            yy = 8.2093 + (((tickAnim - 13) / 3) * (0.46749-(8.2093)));
            zz = 7.22507 + (((tickAnim - 13) / 3) * (-0.19065-(7.22507)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 59.07786 + (((tickAnim - 16) / 4) * (55.75-(59.07786)));
            yy = 0.46749 + (((tickAnim - 16) / 4) * (0-(0.46749)));
            zz = -0.19065 + (((tickAnim - 16) / 4) * (0-(-0.19065)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.75 + (((tickAnim - 0) / 3) * (1.255-(0.75)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.6-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 1.255 + (((tickAnim - 3) / 4) * (1.355-(1.255)));
            zz = 0.6 + (((tickAnim - 3) / 4) * (0.3-(0.6)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 1.355 + (((tickAnim - 7) / 3) * (0.25-(1.355)));
            zz = 0.3 + (((tickAnim - 7) / 3) * (0.475-(0.3)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 10) / 1) * (0.69-(0.25)));
            zz = 0.475 + (((tickAnim - 10) / 1) * (0.71-(0.475)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.69 + (((tickAnim - 11) / 2) * (0.61-(0.69)));
            zz = 0.71 + (((tickAnim - 11) / 2) * (0.515-(0.71)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.61 + (((tickAnim - 13) / 1) * (0.765-(0.61)));
            zz = 0.515 + (((tickAnim - 13) / 1) * (0.4-(0.515)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.765 + (((tickAnim - 14) / 2) * (0.64-(0.765)));
            zz = 0.4 + (((tickAnim - 14) / 2) * (-0.3-(0.4)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.64 + (((tickAnim - 16) / 4) * (0.75-(0.64)));
            zz = -0.3 + (((tickAnim - 16) / 4) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 37.25 + (((tickAnim - 0) / 7) * (33.08-(37.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 33.08 + (((tickAnim - 7) / 3) * (0-(33.08)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (-81.44-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -81.44 + (((tickAnim - 16) / 4) * (37.25-(-81.44)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 7) * (-0.23-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.025-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -0.23 + (((tickAnim - 7) / 3) * (0-(-0.23)));
            zz = -0.025 + (((tickAnim - 7) / 3) * (0-(-0.025)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0.55-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -0.35 + (((tickAnim - 14) / 2) * (-0.69-(-0.35)));
            zz = 0.55 + (((tickAnim - 14) / 2) * (0.4-(0.55)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = -0.69 + (((tickAnim - 16) / 2) * (-0.12-(-0.69)));
            zz = 0.4 + (((tickAnim - 16) / 2) * (0.31-(0.4)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.12 + (((tickAnim - 18) / 2) * (-0.325-(-0.12)));
            zz = 0.31 + (((tickAnim - 18) / 2) * (0-(0.31)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -27.47056 + (((tickAnim - 0) / 9) * (31.24249-(-27.47056)));
            yy = -0.28223 + (((tickAnim - 0) / 9) * (-6.99893-(-0.28223)));
            zz = 4.28188 + (((tickAnim - 0) / 9) * (0.12278-(4.28188)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 31.24249 + (((tickAnim - 9) / 11) * (-27.47056-(31.24249)));
            yy = -6.99893 + (((tickAnim - 9) / 11) * (-0.28223-(-6.99893)));
            zz = 0.12278 + (((tickAnim - 9) / 11) * (4.28188-(0.12278)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -1 + (((tickAnim - 0) / 9) * (31.5-(-1)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 31.5 + (((tickAnim - 9) / 1) * (39.35-(31.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 39.35 + (((tickAnim - 10) / 10) * (-1-(39.35)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 9) * (0.2-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.25-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0.2 + (((tickAnim - 9) / 11) * (-0.4-(0.2)));
            zz = -0.25 + (((tickAnim - 9) / 11) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 13.75 + (((tickAnim - 0) / 9) * (-7.75-(13.75)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -7.75 + (((tickAnim - 9) / 3) * (-41.04-(-7.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -41.04 + (((tickAnim - 12) / 5) * (-56.54-(-41.04)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -56.54 + (((tickAnim - 17) / 3) * (13.75-(-56.54)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -0.775 + (((tickAnim - 0) / 9) * (0-(-0.775)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
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
            xx = 17.40465 + (((tickAnim - 0) / 3) * (-5.03526-(17.40465)));
            yy = -7.96282 + (((tickAnim - 0) / 3) * (-3.92455-(-7.96282)));
            zz = -6.61917 + (((tickAnim - 0) / 3) * (-8.6419-(-6.61917)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -5.03526 + (((tickAnim - 3) / 1) * (27.42-(-5.03526)));
            yy = -3.92455 + (((tickAnim - 3) / 1) * (0-(-3.92455)));
            zz = -8.6419 + (((tickAnim - 3) / 1) * (0-(-8.6419)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 27.42 + (((tickAnim - 4) / 2) * (53.53-(27.42)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 53.53 + (((tickAnim - 6) / 3) * (55.75-(53.53)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 55.75 + (((tickAnim - 9) / 3) * (76.38-(55.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 76.38 + (((tickAnim - 12) / 4) * (77.32-(76.38)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 77.32 + (((tickAnim - 16) / 4) * (17.40465-(77.32)));
            yy = 0 + (((tickAnim - 16) / 4) * (-7.96282-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (-6.61917-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 1) * (0.615-(0.25)));
            zz = 0.475 + (((tickAnim - 0) / 1) * (0.89-(0.475)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0.615 + (((tickAnim - 1) / 2) * (0.65-(0.615)));
            zz = 0.89 + (((tickAnim - 1) / 2) * (0.875-(0.89)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.65 + (((tickAnim - 3) / 1) * (1.365-(0.65)));
            zz = 0.875 + (((tickAnim - 3) / 1) * (0.825-(0.875)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 1.365 + (((tickAnim - 4) / 2) * (0.71-(1.365)));
            zz = 0.825 + (((tickAnim - 4) / 2) * (-0.305-(0.825)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0.71 + (((tickAnim - 6) / 3) * (0.75-(0.71)));
            zz = -0.305 + (((tickAnim - 6) / 3) * (0-(-0.305)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.75 + (((tickAnim - 9) / 3) * (1.255-(0.75)));
            zz = 0 + (((tickAnim - 9) / 3) * (0.6-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 1.255 + (((tickAnim - 12) / 4) * (1.355-(1.255)));
            zz = 0.6 + (((tickAnim - 12) / 4) * (0.3-(0.6)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 1.355 + (((tickAnim - 16) / 4) * (0.25-(1.355)));
            zz = 0.3 + (((tickAnim - 16) / 4) * (0.475-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-3), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-6));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(-0.375+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*1.2);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-40.75-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -40.75 + (((tickAnim - 6) / 3) * (37.25-(-40.75)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 37.25 + (((tickAnim - 9) / 7) * (33.08-(37.25)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 33.08 + (((tickAnim - 16) / 4) * (0-(33.08)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-0.33-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0.46-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.33 + (((tickAnim - 4) / 2) * (-0.25-(-0.33)));
            zz = 0.46 + (((tickAnim - 4) / 2) * (0.65-(0.46)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 6) / 3) * (-0.325-(-0.25)));
            zz = 0.65 + (((tickAnim - 6) / 3) * (0-(0.65)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = -0.325 + (((tickAnim - 9) / 7) * (-0.23-(-0.325)));
            zz = 0 + (((tickAnim - 9) / 7) * (-0.025-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = -0.23 + (((tickAnim - 16) / 4) * (0-(-0.23)));
            zz = -0.025 + (((tickAnim - 16) / 4) * (0-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*-5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*6));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-6));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*3), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*2));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*2));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*3), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*2));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*2));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*-5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-330))*-6));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*-1.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*-2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*4));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*-2), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-400))*-2), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*6), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*5));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-450))*3), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*7), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-350))*6));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-500))*5), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-450))*-8), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-400))*7));


        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-550))*6), tail9.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-450))*-9), tail9.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-450))*9));


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLeaellynasaura e = (EntityPrehistoricFloraLeaellynasaura) entity;
        animator.update(entity);


    }
}
