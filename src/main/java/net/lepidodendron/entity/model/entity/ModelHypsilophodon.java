package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHypsilophodon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHypsilophodon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightLeg6;
    private final AdvancedModelRenderer rightLeg7;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightLeg8;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightArm4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightArm5;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer rightArm6;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftArm4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftArm5;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer leftArm6;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer HeadslopeL;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer BrowL2;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer BrowL3;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;

    private ModelAnimator animator;

    public ModelHypsilophodon() {
        this.textureWidth = 67;
        this.textureHeight = 60;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 9.825F, -3.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -1.3F, -1.1F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.192F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 23, -0.5F, -1.3F, -0.4F, 0, 1, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 36, -2.5F, -1.0F, -0.4F, 4, 7, 5, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.1F, 0.4F, 0.6F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.4887F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0028F, -0.6273F);
        this.rightLeg.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0785F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 0, -1.5F, -1.5F, -0.8F, 3, 7, 4, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 5.2802F, -0.221F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0734F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 15, 0, -1.1F, -0.4466F, -0.5783F, 2, 7, 2, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.1F, 6.5229F, 1.0046F);
        this.rightLeg2.addChild(rightLeg3);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.5F, -15.7F, 0.2F);
        this.rightLeg3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.8727F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 23, -3.5F, 10.0767F, 11.2776F, 2, 4, 1, -0.002F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.1F, 2.5F, -2.8F);
        this.rightLeg3.addChild(rightLeg4);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.4F, -18.7F, 3.6F);
        this.rightLeg4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.576F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 49, -4.0F, 17.4186F, 2.6358F, 3, 1, 5, 0.0F, true));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(2.1F, 0.4F, 0.6F);
        this.hips.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, -0.4887F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0028F, -0.6273F);
        this.rightLeg5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0785F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 45, 0, -1.5F, -1.5F, -0.8F, 3, 7, 4, 0.0F, false));

        this.rightLeg6 = new AdvancedModelRenderer(this);
        this.rightLeg6.setRotationPoint(0.0F, 5.2802F, -0.221F);
        this.rightLeg5.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 1.0734F, 0.0F, 0.0F);
        this.rightLeg6.cubeList.add(new ModelBox(rightLeg6, 15, 0, -0.9F, -0.4466F, -0.5783F, 2, 7, 2, 0.0F, false));

        this.rightLeg7 = new AdvancedModelRenderer(this);
        this.rightLeg7.setRotationPoint(0.1F, 6.5229F, 1.0046F);
        this.rightLeg6.addChild(rightLeg7);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.5F, -15.7F, 0.2F);
        this.rightLeg7.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.8727F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 23, 1.5F, 10.0767F, 11.2776F, 2, 4, 1, -0.002F, false));

        this.rightLeg8 = new AdvancedModelRenderer(this);
        this.rightLeg8.setRotationPoint(-0.1F, 2.5F, -2.8F);
        this.rightLeg7.addChild(rightLeg8);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.4F, -18.7F, 3.6F);
        this.rightLeg8.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.576F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 49, 1.0F, 17.4186F, 2.6358F, 3, 1, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.8F, -1.1F);
        this.hips.addChild(body);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.0F, -0.4F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0175F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 51, 12, -1.0F, -2.14F, -4.6F, 1, 1, 5, 0.004F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 26, -3.0F, -1.54F, -4.6F, 5, 7, 5, 0.004F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.1F, -4.9F);
        this.body.addChild(chest);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 4.6F, -3.9F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2443F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 19, -2.5F, -5.1038F, -0.9852F, 4, 5, 5, -0.004F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.2F, -3.9F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2094F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 49, 46, -1.5F, -1.8F, -0.9F, 2, 1, 5, 0.004F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 19, 39, -2.5F, -0.8F, -0.9F, 4, 5, 5, 0.004F, false));

        this.rightArm4 = new AdvancedModelRenderer(this);
        this.rightArm4.setRotationPoint(1.9F, 3.0011F, -4.0655F);
        this.chest.addChild(rightArm4);
        this.setRotateAngle(rightArm4, -0.1408F, 0.2067F, -0.0885F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -0.4F, -0.5F);
        this.rightArm4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.7418F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 55, 26, 0.0F, -1.3F, 0.3F, 1, 2, 4, 0.003F, false));

        this.rightArm5 = new AdvancedModelRenderer(this);
        this.rightArm5.setRotationPoint(-0.1F, 2.7F, 2.5F);
        this.rightArm4.addChild(rightArm5);
        this.setRotateAngle(rightArm5, 0.5672F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.4F, 0.1F, 0.8F);
        this.rightArm5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.8378F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 25, 53, 0.0F, -1.6662F, -3.8486F, 1, 2, 5, -0.1F, false));

        this.rightArm6 = new AdvancedModelRenderer(this);
        this.rightArm6.setRotationPoint(0.4F, 2.5F, -2.1F);
        this.rightArm5.addChild(rightArm6);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.5F, 0.2F);
        this.rightArm6.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.8574F, 0.1855F, 0.21F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 41, 44, -1.1F, -1.5083F, -1.8051F, 1, 2, 2, -0.002F, false));

        this.leftArm4 = new AdvancedModelRenderer(this);
        this.leftArm4.setRotationPoint(-1.9F, 3.0011F, -4.0655F);
        this.chest.addChild(leftArm4);
        this.setRotateAngle(leftArm4, -0.1408F, -0.2067F, 0.0885F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -0.4F, -0.5F);
        this.leftArm4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.7418F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 55, 26, -1.0F, -1.3F, 0.3F, 1, 2, 4, 0.003F, true));

        this.leftArm5 = new AdvancedModelRenderer(this);
        this.leftArm5.setRotationPoint(0.1F, 2.7F, 2.5F);
        this.leftArm4.addChild(leftArm5);
        this.setRotateAngle(leftArm5, 0.5672F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.4F, 0.1F, 0.8F);
        this.leftArm5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.8378F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 25, 53, -1.0F, -1.6662F, -3.8486F, 1, 2, 5, -0.1F, true));

        this.leftArm6 = new AdvancedModelRenderer(this);
        this.leftArm6.setRotationPoint(-0.4F, 2.5F, -2.1F);
        this.leftArm5.addChild(leftArm6);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.5F, 0.2F);
        this.leftArm6.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.8574F, -0.1855F, -0.21F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 41, 44, 0.1F, -1.5083F, -1.8051F, 1, 2, 2, -0.002F, true));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.7F, -4.0F);
        this.chest.addChild(neck3);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 0.3F, 0.0F);
        this.neck3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1571F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 8, -1.5F, -2.5F, -2.7F, 2, 1, 3, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 17, 50, -2.0F, -1.5F, -2.7F, 3, 4, 3, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.3F, -2.6F);
        this.neck3.addChild(neck2);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.4F, -3.5F);
        this.neck2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.5061F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -0.5F, -2.0531F, -0.1079F, 1, 2, 5, 0.004F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.8F, -2.2F);
        this.neck2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.576F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 28, 0, -0.5F, -2.5F, 0.0F, 1, 2, 3, 0.004F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 52, 53, -1.0F, -0.5F, 0.0F, 2, 2, 4, 0.004F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.3F, -2.4F);
        this.neck2.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 14, 36, -0.5F, -0.1161F, -2.1035F, 1, 2, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -1.0F, -1.6F);
        this.neck.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2618F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 37, 0, 0.0F, -2.4F, 0.0F, 1, 2, 2, -0.006F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 54, 19, -0.5F, -0.4F, 0.0F, 2, 2, 2, -0.006F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(-0.5F, -0.4172F, -1.6103F);
        this.neck.addChild(Head);
        this.setRotateAngle(Head, -0.1222F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 1.9572F, -3.6886F);
        this.Head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 1.4137F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 49, 46, -0.5F, -0.0699F, -0.9308F, 1, 1, 1, 0.005F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, -0.2747F, -1.7938F);
        this.Head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.6807F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 7, 56, -0.5F, -0.0543F, -0.9721F, 1, 1, 1, 0.005F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.3572F, -2.5886F);
        this.Head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.9425F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 56, -0.5F, -0.0433F, -1.9511F, 1, 1, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.1F, 0.4039F, -1.476F);
        this.Head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.6807F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 49, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 49, 0.7F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, -1.7231F, -0.1791F);
        this.Head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.4887F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 36, 0.0F, -0.1451F, -1.9621F, 0, 1, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, -0.0231F, -0.9791F);
        this.Head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2967F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 47, 31, -1.0F, -0.5369F, -0.7F, 2, 2, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.1924F, 1.5633F, -1.195F);
        this.Head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3862F, -0.0945F, -0.0452F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 44, 0, -0.2037F, -0.8993F, -1.7746F, 0, 1, 2, 0.0001F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.2F, 3.0967F, -2.1884F);
        this.Head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.6745F, -0.2331F, -0.1519F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 13, 23, -0.02F, -1.1878F, 0.1466F, 0, 1, 2, 0.0F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 8, 0, -0.0362F, -1.1878F, 0.1466F, 0, 1, 2, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.8076F, 1.5633F, -1.195F);
        this.Head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.3862F, 0.0945F, 0.0452F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 44, 0, 0.2037F, -0.8993F, -1.7746F, 0, 1, 2, 0.0001F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.8F, 3.0967F, -2.1884F);
        this.Head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.6745F, 0.2331F, 0.1519F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 13, 23, 0.02F, -1.1878F, 0.1466F, 0, 1, 2, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 8, 0, 0.0362F, -1.1878F, 0.1466F, 0, 1, 2, 0.0F, false));

        this.HeadslopeL = new AdvancedModelRenderer(this);
        this.HeadslopeL.setRotationPoint(1.0F, 0.5415F, 1.1145F);
        this.Head.addChild(HeadslopeL);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.698F, 1.1782F, -4.4222F);
        this.HeadslopeL.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3591F, -0.2117F, -0.0686F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 55, 34, -0.3151F, -0.394F, 0.1571F, 1, 1, 2, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.302F, 1.1782F, -4.4222F);
        this.HeadslopeL.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3591F, 0.2117F, 0.0686F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 55, 34, -0.6849F, -0.394F, 0.1571F, 1, 1, 2, 0.0F, false));

        this.BrowL2 = new AdvancedModelRenderer(this);
        this.BrowL2.setRotationPoint(1.1147F, 0.3411F, -2.1098F);
        this.Head.addChild(BrowL2);
        this.setRotateAngle(BrowL2, -0.0204F, -0.0677F, 0.0216F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.4853F, -1.8824F, 5.5347F);
        this.BrowL2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.3423F, -0.0986F, 0.1059F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 8, 8, -1.2836F, -0.5869F, -5.297F, 1, 1, 1, -0.03F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.4035F, 0.5983F, 0.198F);
        this.BrowL2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.8867F, 0.1997F, 0.3959F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 51, 12, -1.0574F, -0.7315F, -0.8482F, 1, 1, 1, -0.03F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0066F, -0.0023F, 0.2682F);
        this.BrowL2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.6984F, -0.1044F, 0.1225F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 47, 36, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.03F, false));

        this.BrowL3 = new AdvancedModelRenderer(this);
        this.BrowL3.setRotationPoint(-0.1147F, 0.3411F, -2.1098F);
        this.Head.addChild(BrowL3);
        this.setRotateAngle(BrowL3, -0.0204F, 0.0677F, -0.0216F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.4853F, -1.8824F, 5.5347F);
        this.BrowL3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.3423F, 0.0986F, -0.1059F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 8, 8, 0.2836F, -0.5869F, -5.297F, 1, 1, 1, -0.03F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.4035F, 0.5983F, 0.198F);
        this.BrowL3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.8867F, -0.1997F, -0.3959F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 51, 12, 0.0574F, -0.7315F, -0.8482F, 1, 1, 1, -0.03F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.0066F, -0.0023F, 0.2682F);
        this.BrowL3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.6984F, 0.1044F, -0.1225F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 47, 36, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.03F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.0415F, 0.6145F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.2443F, 0.0F, 0.0F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, 2.7091F, -3.0883F);
        this.Jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.2793F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 56, 0, -0.5F, -0.867F, -0.5428F, 1, 1, 1, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.0F, 1.7351F, -1.2499F);
        this.Jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.3142F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 55, 38, -1.0F, -1.0421F, -0.5589F, 1, 1, 2, 0.005F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(1.0F, 0.8351F, 0.0501F);
        this.Jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.4363F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 28, 6, -1.5F, -1.6759F, -1.3175F, 2, 1, 2, -0.01F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 30, 19, -1.5F, -0.7759F, -1.6175F, 2, 1, 2, -0.007F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, 1.6376F, -2.3756F);
        this.Jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.6383F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 0, -0.3F, -0.5F, -0.8F, 0, 1, 2, 0.0F, true));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 0, 0.3F, -0.5F, -0.8F, 0, 1, 2, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.2F, 2.0552F, -2.8029F);
        this.Jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.6745F, -0.2331F, -0.1519F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 19, 39, -0.02F, -1.0878F, 0.3466F, 0, 1, 2, 0.0F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 39, 19, -0.0362F, -1.0878F, 0.3466F, 0, 1, 2, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 2.0332F, -2.6973F);
        this.Jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.6271F, -0.2226F, -0.1985F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 12, 49, 0.0F, -0.4574F, -0.4F, 1, 1, 2, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(1.0F, 2.0332F, -2.6973F);
        this.Jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.6271F, 0.2226F, 0.1985F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 12, 49, -1.0F, -0.4574F, -0.4F, 1, 1, 2, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5F, 2.0332F, -2.6973F);
        this.Jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.6208F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 33, 53, -0.5F, -0.4574F, -0.4F, 1, 1, 2, 0.008F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.8F, 2.0552F, -2.8029F);
        this.Jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.6745F, 0.2331F, 0.1519F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 19, 39, 0.02F, -1.0878F, 0.3466F, 0, 1, 2, 0.0F, false));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 39, 19, 0.0362F, -1.0878F, 0.3466F, 0, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.1F, 2.6F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.3927F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 32, 6, -1.5F, -1.5F, 0.0F, 3, 6, 6, 0.004F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 23, -1.0F, -1.5F, -1.0F, 2, 4, 8, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 5.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1658F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 35, 32, -1.0F, -1.335F, -0.0137F, 2, 3, 7, 0.004F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.165F, 6.9863F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 15, 0, -0.5F, -1.5F, 7.0F, 1, 1, 10, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 31, 43, -0.5F, -1.5F, 0.0F, 1, 2, 7, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.1F, -1.2F, 0.9F);
        this.tail4.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.1842F, -0.0181F, -0.5581F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 47, 36, -0.1867F, -0.8565F, -0.6734F, 0, 2, 7, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.5F, -1.4387F, 7.0226F);
        this.tail4.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0349F, 0.0F, -0.6545F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 19, 13, 0.0F, -1.5613F, -0.0226F, 0, 2, 10, 0.0F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.1F, -1.2F, 0.9F);
        this.tail4.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.1842F, 0.0181F, 0.5581F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 47, 36, 0.1867F, -0.8565F, -0.6734F, 0, 2, 7, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.288F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 41, 46, -0.5F, -1.5F, 0.0F, 0, 2, 7, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.5F, -3.6F, 6.3F);
        this.tail4.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.192F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 0, -0.5F, -0.1F, 0.0F, 0, 8, 14, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.5F, -1.4387F, 7.0226F);
        this.tail4.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0349F, 0.0F, 0.6545F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 19, 13, 0.0F, -1.5613F, -0.0226F, 0, 2, 10, 0.0F, false));
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
        this.hips.offsetY = -0.10F;
        this.hips.offsetX = 0.3F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(130);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.8F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hips, 0.2F, 3.8F, -0.0F);
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
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

        EntityPrehistoricFloraHypsilophodon entityHypsilophodon = (EntityPrehistoricFloraHypsilophodon) e;

        this.faceTarget(f3, f4, 10, neck);
        this.faceTarget(f3, f4, 10, neck2);
        this.faceTarget(f3, f4, 10, neck3);
        this.faceTarget(f3, f4, 10, Head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.Head};
        AdvancedModelRenderer[] ArmL = {this.rightArm4, this.rightArm5, this.rightArm6};
        AdvancedModelRenderer[] ArmR = {this.leftArm4, this.leftArm5, this.leftArm6};

        entityHypsilophodon.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityHypsilophodon.getAnimation() == entityHypsilophodon.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityHypsilophodon.isReallyInWater()) {

                if (f3 == 0.0F || !entityHypsilophodon.getIsMoving()) {
                    if (entityHypsilophodon.getAnimation() != entityHypsilophodon.EAT_ANIMATION
                        && entityHypsilophodon.getAnimation() != entityHypsilophodon.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.rightArm4, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.leftArm4, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.rightArm5, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.leftArm5, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);


                    return;
                }

                if (entityHypsilophodon.getIsFast()) { //Running


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
        EntityPrehistoricFloraHypsilophodon ee = (EntityPrehistoricFloraHypsilophodon) entitylivingbaseIn;

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
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The graze anim
            animScratch(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.CHATTER_ANIMATION) { //The noise anim
            animChatter(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LONG_CHATTER_ANIMATION) { //The noise anim
            animLongChatter(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) { //The noise anim
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) { //The noise anim
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHypsilophodon entity = (EntityPrehistoricFloraHypsilophodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 4.75 + (((tickAnim - 8) / 7) * (8.74712-(4.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0.16558-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-1.99314-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 8.74712 + (((tickAnim - 15) / 8) * (4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4-(8.74712)));
            yy = 0.16558 + (((tickAnim - 15) / 8) * (0.16558-(0.16558)));
            zz = -1.99314 + (((tickAnim - 15) / 8) * (-1.99314-(-1.99314)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4 + (((tickAnim - 23) / 11) * (4.24886-(4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4)));
            yy = 0.16558 + (((tickAnim - 23) / 11) * (-0.11229-(0.16558)));
            zz = -1.99314 + (((tickAnim - 23) / 11) * (1.74656-(-1.99314)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 4.24886 + (((tickAnim - 34) / 6) * (2.30695-(4.24886)));
            yy = -0.11229 + (((tickAnim - 34) / 6) * (-0.13157-(-0.11229)));
            zz = 1.74656 + (((tickAnim - 34) / 6) * (2.04315-(1.74656)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 2.30695 + (((tickAnim - 40) / 10) * (0-(2.30695)));
            yy = -0.13157 + (((tickAnim - 40) / 10) * (0-(-0.13157)));
            zz = 2.04315 + (((tickAnim - 40) / 10) * (0-(2.04315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 7 + (((tickAnim - 8) / 7) * (4.74202-(7)));
            yy = 0 + (((tickAnim - 8) / 7) * (0.33501-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-2.72953-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 4.74202 + (((tickAnim - 15) / 8) * (2.2971+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4-(4.74202)));
            yy = 0.33501 + (((tickAnim - 15) / 8) * (0.33501-(0.33501)));
            zz = -2.72953 + (((tickAnim - 15) / 8) * (-2.72953-(-2.72953)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 2.2971+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4 + (((tickAnim - 23) / 11) * (-9.7403+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5-(2.2971+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4)));
            yy = 0.33501 + (((tickAnim - 23) / 11) * (0.24331-(0.33501)));
            zz = -2.72953 + (((tickAnim - 23) / 11) * (0.76931-(-2.72953)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -9.7403+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5 + (((tickAnim - 34) / 6) * (-29.2903+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-25-(-9.7403+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5)));
            yy = 0.24331 + (((tickAnim - 34) / 6) * (0.24331-(0.24331)));
            zz = 0.76931 + (((tickAnim - 34) / 6) * (0.76931-(0.76931)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -29.2903+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-25 + (((tickAnim - 40) / 10) * (0-(-29.2903+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-25)));
            yy = 0.24331 + (((tickAnim - 40) / 10) * (0-(0.24331)));
            zz = 0.76931 + (((tickAnim - 40) / 10) * (0-(0.76931)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (28.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 28.75 + (((tickAnim - 10) / 8) * (11.69-(28.75)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 11.69 + (((tickAnim - 18) / 9) * (38.02-(11.69)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = 38.02 + (((tickAnim - 27) / 23) * (0-(38.02)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm4, rightArm4.rotateAngleX + (float) Math.toRadians(xx), rightArm4.rotateAngleY + (float) Math.toRadians(yy), rightArm4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-33-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -33 + (((tickAnim - 10) / 8) * (-18.02-(-33)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = -18.02 + (((tickAnim - 18) / 9) * (-56.92-(-18.02)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = -56.92 + (((tickAnim - 27) / 23) * (0-(-56.92)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm5, rightArm5.rotateAngleX + (float) Math.toRadians(xx), rightArm5.rotateAngleY + (float) Math.toRadians(yy), rightArm5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (-0.6-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = -0.6 + (((tickAnim - 27) / 23) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm5.rotationPointX = this.rightArm5.rotationPointX + (float)(xx);
        this.rightArm5.rotationPointY = this.rightArm5.rotationPointY - (float)(yy);
        this.rightArm5.rotationPointZ = this.rightArm5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (28.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 28.75 + (((tickAnim - 10) / 13) * (4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4-(28.75)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4 + (((tickAnim - 23) / 14) * (38.02-(4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 38.02 + (((tickAnim - 37) / 13) * (0-(38.02)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(xx), leftArm4.rotateAngleY + (float) Math.toRadians(yy), leftArm4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-33-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -33 + (((tickAnim - 10) / 13) * (4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4-(-33)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4 + (((tickAnim - 23) / 14) * (-56.92-(4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -56.92 + (((tickAnim - 37) / 13) * (0-(-56.92)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm5, leftArm5.rotateAngleX + (float) Math.toRadians(xx), leftArm5.rotateAngleY + (float) Math.toRadians(yy), leftArm5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 10) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 27) * (-0.6-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = -0.6 + (((tickAnim - 37) / 13) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm5.rotationPointX = this.leftArm5.rotationPointX + (float)(xx);
        this.leftArm5.rotationPointY = this.leftArm5.rotationPointY - (float)(yy);
        this.leftArm5.rotationPointZ = this.leftArm5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 7.5 + (((tickAnim - 8) / 7) * (-1.25-(7.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -1.25 + (((tickAnim - 15) / 8) * (4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4-(-1.25)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4 + (((tickAnim - 23) / 11) * (1.25-(4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 1.25 + (((tickAnim - 34) / 6) * (-7.5-(1.25)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 40) / 10) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -6.25 + (((tickAnim - 8) / 7) * (23.5-(-6.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 23.5 + (((tickAnim - 15) / 8) * (4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4-(23.5)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4 + (((tickAnim - 23) / 6) * (8.29-(4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 8.29 + (((tickAnim - 29) / 5) * (27.5-(8.29)));
            yy = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 27.5 + (((tickAnim - 34) / 6) * (14-(27.5)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 14 + (((tickAnim - 40) / 10) * (0-(14)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -6.5 + (((tickAnim - 15) / 8) * (4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4-(-6.5)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4 + (((tickAnim - 23) / 6) * (31.43-(4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 31.43 + (((tickAnim - 29) / 5) * (3-(31.43)));
            yy = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 3 + (((tickAnim - 34) / 6) * (17.5-(3)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 40) / 10) * (0-(17.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -13 + (((tickAnim - 15) / 8) * (4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4-(-13)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4 + (((tickAnim - 23) / 11) * (-3.25-(4.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*4)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -3.25 + (((tickAnim - 34) / 6) * (8.75-(-3.25)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 40) / 10) * (0-(8.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (25-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 25 + (((tickAnim - 13) / 2) * (0-(25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 15) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 14) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (25-(0)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 25 + (((tickAnim - 32) / 2) * (0-(25)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHypsilophodon entity = (EntityPrehistoricFloraHypsilophodon) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 14.5 + (((tickAnim - 8) / 5) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 14.5 + (((tickAnim - 13) / 7) * (0-(14.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 2.75 + (((tickAnim - 8) / 5) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 2.75 + (((tickAnim - 13) / 7) * (0-(2.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 25.5 + (((tickAnim - 8) / 5) * (25.5-(25.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 25.5 + (((tickAnim - 13) / 7) * (0-(25.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm4, rightArm4.rotateAngleX + (float) Math.toRadians(xx), rightArm4.rotateAngleY + (float) Math.toRadians(yy), rightArm4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-24-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -24 + (((tickAnim - 8) / 5) * (-24-(-24)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -24 + (((tickAnim - 13) / 7) * (0-(-24)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm5, rightArm5.rotateAngleX + (float) Math.toRadians(xx), rightArm5.rotateAngleY + (float) Math.toRadians(yy), rightArm5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 24.5 + (((tickAnim - 8) / 5) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 24.5 + (((tickAnim - 13) / 7) * (0-(24.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(xx), leftArm4.rotateAngleY + (float) Math.toRadians(yy), leftArm4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -25.25 + (((tickAnim - 8) / 5) * (-25.25-(-25.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -25.25 + (((tickAnim - 13) / 7) * (0-(-25.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm5, leftArm5.rotateAngleX + (float) Math.toRadians(xx), leftArm5.rotateAngleY + (float) Math.toRadians(yy), leftArm5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 21 + (((tickAnim - 8) / 5) * (21-(21)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 21 + (((tickAnim - 13) / 7) * (0-(21)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (36.5-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 36.5 + (((tickAnim - 10) / 3) * (0-(36.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (6.75-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6.75 + (((tickAnim - 10) / 3) * (0-(6.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -11.25 + (((tickAnim - 10) / 3) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (27.5-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 27.5 + (((tickAnim - 10) / 2) * (0-(27.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animScratch(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHypsilophodon entity = (EntityPrehistoricFloraHypsilophodon) entitylivingbaseIn;
        int animCycle = 55;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-38.74553-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-8.88216-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.58045-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -38.74553 + (((tickAnim - 10) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 10) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 10) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -27.12183 + (((tickAnim - 13) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 13) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 13) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -38.74553 + (((tickAnim - 15) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 15) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 15) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -27.12183 + (((tickAnim - 18) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 18) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 18) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -38.74553 + (((tickAnim - 20) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 20) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 20) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -27.12183 + (((tickAnim - 23) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 23) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 23) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -38.74553 + (((tickAnim - 25) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 25) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 25) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -27.12183 + (((tickAnim - 28) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 28) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 28) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -38.74553 + (((tickAnim - 30) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 30) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 30) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -27.12183 + (((tickAnim - 33) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 33) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 33) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -38.74553 + (((tickAnim - 35) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 35) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 35) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -27.12183 + (((tickAnim - 38) / 4) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 38) / 4) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 38) / 4) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = -38.74553 + (((tickAnim - 42) / 13) * (0-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 42) / 13) * (0-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 42) / 13) * (0-(-1.58045)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-31.27421-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (10.31702-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -31.27421 + (((tickAnim - 10) / 3) * (-19.75-(-31.27421)));
            yy = -3.0367 + (((tickAnim - 10) / 3) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 10) / 3) * (0-(10.31702)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -19.75 + (((tickAnim - 13) / 2) * (-31.27421-(-19.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (10.31702-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -31.27421 + (((tickAnim - 15) / 3) * (-19.75-(-31.27421)));
            yy = -3.0367 + (((tickAnim - 15) / 3) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 15) / 3) * (0-(10.31702)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -19.75 + (((tickAnim - 18) / 2) * (-31.27421-(-19.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (10.31702-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -31.27421 + (((tickAnim - 20) / 3) * (-19.75-(-31.27421)));
            yy = -3.0367 + (((tickAnim - 20) / 3) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 20) / 3) * (0-(10.31702)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -19.75 + (((tickAnim - 23) / 2) * (-31.27421-(-19.75)));
            yy = 0 + (((tickAnim - 23) / 2) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (10.31702-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -31.27421 + (((tickAnim - 25) / 3) * (-19.75-(-31.27421)));
            yy = -3.0367 + (((tickAnim - 25) / 3) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 25) / 3) * (0-(10.31702)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -19.75 + (((tickAnim - 28) / 2) * (-31.27421-(-19.75)));
            yy = 0 + (((tickAnim - 28) / 2) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (10.31702-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -31.27421 + (((tickAnim - 30) / 3) * (-19.75-(-31.27421)));
            yy = -3.0367 + (((tickAnim - 30) / 3) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 30) / 3) * (0-(10.31702)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -19.75 + (((tickAnim - 33) / 2) * (-31.27421-(-19.75)));
            yy = 0 + (((tickAnim - 33) / 2) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (10.31702-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -31.27421 + (((tickAnim - 35) / 3) * (-19.75-(-31.27421)));
            yy = -3.0367 + (((tickAnim - 35) / 3) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 35) / 3) * (0-(10.31702)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -19.75 + (((tickAnim - 38) / 4) * (-31.27421-(-19.75)));
            yy = 0 + (((tickAnim - 38) / 4) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (10.31702-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = -31.27421 + (((tickAnim - 42) / 13) * (0-(-31.27421)));
            yy = -3.0367 + (((tickAnim - 42) / 13) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 42) / 13) * (0-(10.31702)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg6, rightLeg6.rotateAngleX + (float) Math.toRadians(xx), rightLeg6.rotateAngleY + (float) Math.toRadians(yy), rightLeg6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -13.5 + (((tickAnim - 10) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -35.25 + (((tickAnim - 13) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -13.5 + (((tickAnim - 15) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -35.25 + (((tickAnim - 18) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -13.5 + (((tickAnim - 20) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -35.25 + (((tickAnim - 23) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -13.5 + (((tickAnim - 25) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -35.25 + (((tickAnim - 28) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -13.5 + (((tickAnim - 30) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -35.25 + (((tickAnim - 33) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -13.5 + (((tickAnim - 35) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -35.25 + (((tickAnim - 38) / 4) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = -13.5 + (((tickAnim - 42) / 13) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg7, rightLeg7.rotateAngleX + (float) Math.toRadians(xx), rightLeg7.rotateAngleY + (float) Math.toRadians(yy), rightLeg7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6 + (((tickAnim - 10) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 107.25 + (((tickAnim - 13) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6 + (((tickAnim - 15) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 107.25 + (((tickAnim - 18) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 6 + (((tickAnim - 20) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 107.25 + (((tickAnim - 23) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 6 + (((tickAnim - 25) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 107.25 + (((tickAnim - 28) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 6 + (((tickAnim - 30) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 107.25 + (((tickAnim - 33) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 6 + (((tickAnim - 35) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 107.25 + (((tickAnim - 38) / 4) * (6-(107.25)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 6 + (((tickAnim - 42) / 13) * (0-(6)));
            yy = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg8, rightLeg8.rotateAngleX + (float) Math.toRadians(xx), rightLeg8.rotateAngleY + (float) Math.toRadians(yy), rightLeg8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.62773-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (3.24749-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.25362-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 11.62773 + (((tickAnim - 10) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 10) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 10) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 12.87773 + (((tickAnim - 13) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 13) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 13) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 11.62773 + (((tickAnim - 15) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 15) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 15) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12.87773 + (((tickAnim - 18) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 18) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 18) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 11.62773 + (((tickAnim - 20) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 20) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 20) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 12.87773 + (((tickAnim - 23) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 23) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 23) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 11.62773 + (((tickAnim - 25) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 25) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 25) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 12.87773 + (((tickAnim - 28) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 28) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 28) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 11.62773 + (((tickAnim - 30) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 30) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 30) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 12.87773 + (((tickAnim - 33) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 33) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 33) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 11.62773 + (((tickAnim - 35) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 35) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 35) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 12.87773 + (((tickAnim - 38) / 4) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 38) / 4) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 38) / 4) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 11.62773 + (((tickAnim - 42) / 13) * (0-(11.62773)));
            yy = 3.24749 + (((tickAnim - 42) / 13) * (0-(3.24749)));
            zz = 2.25362 + (((tickAnim - 42) / 13) * (0-(2.25362)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.39605-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-10.06105-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.98308-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6.39605 + (((tickAnim - 10) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 10) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 10) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.96395 + (((tickAnim - 13) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 13) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 13) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6.39605 + (((tickAnim - 15) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 15) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 15) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.96395 + (((tickAnim - 18) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 18) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 18) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 6.39605 + (((tickAnim - 20) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 20) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 20) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2.96395 + (((tickAnim - 23) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 23) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 23) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 6.39605 + (((tickAnim - 25) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 25) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 25) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.96395 + (((tickAnim - 28) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 28) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 28) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 6.39605 + (((tickAnim - 30) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 30) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 30) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2.96395 + (((tickAnim - 33) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 33) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 33) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 6.39605 + (((tickAnim - 35) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 35) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 35) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 2.96395 + (((tickAnim - 38) / 4) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 38) / 4) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 38) / 4) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 6.39605 + (((tickAnim - 42) / 13) * (0-(6.39605)));
            yy = -10.06105 + (((tickAnim - 42) / 13) * (0-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 42) / 13) * (0-(1.98308)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (34.43858-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5.21784-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (28.02752-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 41) {
            xx = 34.43858 + (((tickAnim - 10) / 31) * (34.43858-(34.43858)));
            yy = -5.21784 + (((tickAnim - 10) / 31) * (-5.21784-(-5.21784)));
            zz = 28.02752 + (((tickAnim - 10) / 31) * (28.02752-(28.02752)));
        }
        else if (tickAnim >= 41 && tickAnim < 55) {
            xx = 34.43858 + (((tickAnim - 41) / 14) * (0-(34.43858)));
            yy = -5.21784 + (((tickAnim - 41) / 14) * (0-(-5.21784)));
            zz = 28.02752 + (((tickAnim - 41) / 14) * (0-(28.02752)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm4, rightArm4.rotateAngleX + (float) Math.toRadians(xx), rightArm4.rotateAngleY + (float) Math.toRadians(yy), rightArm4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-22.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6 + (((tickAnim - 10) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 10) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 10) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.18391 + (((tickAnim - 13) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 13) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 13) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6 + (((tickAnim - 15) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 15) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 15) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.18391 + (((tickAnim - 18) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 18) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 18) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 6 + (((tickAnim - 20) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 20) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 20) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2.18391 + (((tickAnim - 23) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 23) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 23) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 6 + (((tickAnim - 25) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 25) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 25) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.18391 + (((tickAnim - 28) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 28) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 28) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 6 + (((tickAnim - 30) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 30) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 30) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2.18391 + (((tickAnim - 33) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 33) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 33) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 6 + (((tickAnim - 35) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 35) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 35) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 2.18391 + (((tickAnim - 38) / 4) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 38) / 4) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 38) / 4) * (0-(10.37068)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 6 + (((tickAnim - 42) / 13) * (0-(6)));
            yy = -22.25 + (((tickAnim - 42) / 13) * (0-(-22.25)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-17.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 10) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 10) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -3.55309 + (((tickAnim - 13) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 13) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 13) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 15) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 15) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -3.55309 + (((tickAnim - 18) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 18) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 18) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 20) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 20) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -3.55309 + (((tickAnim - 23) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 23) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 23) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 25) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 25) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -3.55309 + (((tickAnim - 28) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 28) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 28) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 30) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 30) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -3.55309 + (((tickAnim - 33) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 33) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 33) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 35) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 35) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -3.55309 + (((tickAnim - 38) / 4) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 38) / 4) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 38) / 4) * (0-(10.31088)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            yy = -17.75 + (((tickAnim - 42) / 13) * (0-(-17.75)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -2 + (((tickAnim - 10) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.25 + (((tickAnim - 13) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -2 + (((tickAnim - 15) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.25 + (((tickAnim - 18) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -2 + (((tickAnim - 20) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2.25 + (((tickAnim - 23) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -2 + (((tickAnim - 25) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.25 + (((tickAnim - 28) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -2 + (((tickAnim - 30) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2.25 + (((tickAnim - 33) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -2 + (((tickAnim - 35) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 2.25 + (((tickAnim - 38) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -2 + (((tickAnim - 40) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 2.25 + (((tickAnim - 43) / 2) * (5.27-(2.25)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 5.27 + (((tickAnim - 45) / 10) * (0-(5.27)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -3.25 + (((tickAnim - 10) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 6.25 + (((tickAnim - 13) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -3.25 + (((tickAnim - 15) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 6.25 + (((tickAnim - 18) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -3.25 + (((tickAnim - 20) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 6.25 + (((tickAnim - 23) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -3.25 + (((tickAnim - 25) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 6.25 + (((tickAnim - 28) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -3.25 + (((tickAnim - 30) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 6.25 + (((tickAnim - 33) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -3.25 + (((tickAnim - 35) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 6.25 + (((tickAnim - 38) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -3.25 + (((tickAnim - 40) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 6.25 + (((tickAnim - 43) / 2) * (3.34-(6.25)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 3.34 + (((tickAnim - 45) / 10) * (0-(3.34)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -8.25 + (((tickAnim - 10) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -11.19 + (((tickAnim - 11) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -1 + (((tickAnim - 13) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -8.25 + (((tickAnim - 15) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -11.19 + (((tickAnim - 16) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -1 + (((tickAnim - 18) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -8.25 + (((tickAnim - 20) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -11.19 + (((tickAnim - 21) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -1 + (((tickAnim - 23) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -8.25 + (((tickAnim - 25) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 1) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -11.19 + (((tickAnim - 26) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -1 + (((tickAnim - 28) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -8.25 + (((tickAnim - 30) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 1) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -11.19 + (((tickAnim - 31) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -1 + (((tickAnim - 33) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -8.25 + (((tickAnim - 35) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 1) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = -11.19 + (((tickAnim - 36) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -1 + (((tickAnim - 38) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = -8.25 + (((tickAnim - 40) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = -11.19 + (((tickAnim - 41) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -1 + (((tickAnim - 43) / 2) * (-0.63-(-1)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -0.63 + (((tickAnim - 45) / 10) * (0-(-0.63)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHypsilophodon entity = (EntityPrehistoricFloraHypsilophodon) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = 1.75 + (((tickAnim - 4) / 10) * (-8.75-(1.75)));
            yy = 0 + (((tickAnim - 4) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 10) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -8.75 + (((tickAnim - 14) / 6) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = 1.5 + (((tickAnim - 4) / 10) * (2.25-(1.5)));
            yy = 0 + (((tickAnim - 4) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 10) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 2.25 + (((tickAnim - 14) / 6) * (0-(2.25)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (41.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 41.75 + (((tickAnim - 9) / 11) * (0-(41.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm4, rightArm4.rotateAngleX + (float) Math.toRadians(xx), rightArm4.rotateAngleY + (float) Math.toRadians(yy), rightArm4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -33.75 + (((tickAnim - 9) / 11) * (0-(-33.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm5, rightArm5.rotateAngleX + (float) Math.toRadians(xx), rightArm5.rotateAngleY + (float) Math.toRadians(yy), rightArm5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (41.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 41.75 + (((tickAnim - 9) / 11) * (0-(41.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(xx), leftArm4.rotateAngleY + (float) Math.toRadians(yy), leftArm4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -33.75 + (((tickAnim - 9) / 11) * (0-(-33.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm5, leftArm5.rotateAngleX + (float) Math.toRadians(xx), leftArm5.rotateAngleY + (float) Math.toRadians(yy), leftArm5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = 1.25 + (((tickAnim - 4) / 10) * (0-(1.25)));
            yy = 0 + (((tickAnim - 4) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 10) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 3.75 + (((tickAnim - 4) / 8) * (-9.75-(3.75)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -9.75 + (((tickAnim - 12) / 8) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -3.25 + (((tickAnim - 4) / 8) * (-7.5-(-3.25)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 12) / 8) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -13.5 + (((tickAnim - 4) / 8) * (12-(-13.5)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 12 + (((tickAnim - 12) / 8) * (0-(12)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 24.75 + (((tickAnim - 3) / 1) * (0-(24.75)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (3.1-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 3.1 + (((tickAnim - 6) / 3) * (0-(3.1)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (24.75-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 24.75 + (((tickAnim - 12) / 2) * (0-(24.75)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 6 + (((tickAnim - 4) / 6) * (2.25-(6)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 2.25 + (((tickAnim - 10) / 6) * (-3.25-(2.25)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -3.25 + (((tickAnim - 16) / 4) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -2.75 + (((tickAnim - 4) / 6) * (-3.25-(-2.75)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -3.25 + (((tickAnim - 10) / 6) * (-4.75-(-3.25)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -4.75 + (((tickAnim - 16) / 4) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -2.75 + (((tickAnim - 4) / 6) * (9.75-(-2.75)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 9.75 + (((tickAnim - 10) / 6) * (-5.5-(9.75)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -5.5 + (((tickAnim - 16) / 4) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-19.57-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -19.57 + (((tickAnim - 5) / 5) * (0-(-19.57)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0.75-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0.75 + (((tickAnim - 16) / 4) * (0-(0.75)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLongChatter(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHypsilophodon entity = (EntityPrehistoricFloraHypsilophodon) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -1.75 + (((tickAnim - 10) / 3) * (-0.75-(-1.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.75 + (((tickAnim - 13) / 2) * (-1.75-(-0.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -1.75 + (((tickAnim - 15) / 3) * (-0.75-(-1.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -0.75 + (((tickAnim - 18) / 1) * (-1.75-(-0.75)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -1.75 + (((tickAnim - 19) / 2) * (-0.75-(-1.75)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -0.75 + (((tickAnim - 21) / 2) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -0.75 + (((tickAnim - 23) / 17) * (-2.50021-(-0.75)));
            yy = 0 + (((tickAnim - 23) / 17) * (-0.74929-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0.03272-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = -2.50021 + (((tickAnim - 40) / 14) * (-2.50021-(-2.50021)));
            yy = -0.74929 + (((tickAnim - 40) / 14) * (-0.74929-(-0.74929)));
            zz = 0.03272 + (((tickAnim - 40) / 14) * (0.03272-(0.03272)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -2.50021 + (((tickAnim - 54) / 6) * (0-(-2.50021)));
            yy = -0.74929 + (((tickAnim - 54) / 6) * (0-(-0.74929)));
            zz = 0.03272 + (((tickAnim - 54) / 6) * (0-(0.03272)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 3.5 + (((tickAnim - 10) / 3) * (0.25-(3.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.25 + (((tickAnim - 13) / 2) * (3.5-(0.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 3.5 + (((tickAnim - 15) / 3) * (0.25-(3.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0.25 + (((tickAnim - 18) / 1) * (3.5-(0.25)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 3.5 + (((tickAnim - 19) / 3) * (0.25-(3.5)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0.25 + (((tickAnim - 22) / 1) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0.25 + (((tickAnim - 23) / 8) * (0.33719-(0.25)));
            yy = 0 + (((tickAnim - 23) / 8) * (-1.98717-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (-2.51021-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0.33719 + (((tickAnim - 31) / 9) * (2.58719-(0.33719)));
            yy = -1.98717 + (((tickAnim - 31) / 9) * (-1.98717-(-1.98717)));
            zz = -2.51021 + (((tickAnim - 31) / 9) * (-2.51021-(-2.51021)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = 2.58719 + (((tickAnim - 40) / 14) * (2.58719-(2.58719)));
            yy = -1.98717 + (((tickAnim - 40) / 14) * (-1.98717-(-1.98717)));
            zz = -2.51021 + (((tickAnim - 40) / 14) * (-2.51021-(-2.51021)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 2.58719 + (((tickAnim - 54) / 6) * (0-(2.58719)));
            yy = -1.98717 + (((tickAnim - 54) / 6) * (0-(-1.98717)));
            zz = -2.51021 + (((tickAnim - 54) / 6) * (0-(-2.51021)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 3.25 + (((tickAnim - 10) / 3) * (1.75-(3.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 1.75 + (((tickAnim - 13) / 1) * (3.25-(1.75)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 3.25 + (((tickAnim - 14) / 3) * (1.75-(3.25)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 1.75 + (((tickAnim - 17) / 1) * (3.25-(1.75)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 3.25 + (((tickAnim - 18) / 1) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 3.25 + (((tickAnim - 19) / 4) * (1.75-(3.25)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 1.75 + (((tickAnim - 23) / 8) * (1.9556-(1.75)));
            yy = 0 + (((tickAnim - 23) / 8) * (-8.45538-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (-1.52463-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 1.9556 + (((tickAnim - 31) / 9) * (-2.0444-(1.9556)));
            yy = -8.45538 + (((tickAnim - 31) / 9) * (-8.45538-(-8.45538)));
            zz = -1.52463 + (((tickAnim - 31) / 9) * (-1.52463-(-1.52463)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = -2.0444 + (((tickAnim - 40) / 14) * (-2.0444-(-2.0444)));
            yy = -8.45538 + (((tickAnim - 40) / 14) * (-8.45538-(-8.45538)));
            zz = -1.52463 + (((tickAnim - 40) / 14) * (-1.52463-(-1.52463)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -2.0444 + (((tickAnim - 54) / 6) * (0-(-2.0444)));
            yy = -8.45538 + (((tickAnim - 54) / 6) * (0-(-8.45538)));
            zz = -1.52463 + (((tickAnim - 54) / 6) * (0-(-1.52463)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -2.75 + (((tickAnim - 10) / 3) * (-1.25-(-2.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -1.25 + (((tickAnim - 13) / 1) * (-2.75-(-1.25)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -2.75 + (((tickAnim - 14) / 3) * (-1.25-(-2.75)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -1.25 + (((tickAnim - 17) / 1) * (-2.75-(-1.25)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -2.75 + (((tickAnim - 18) / 1) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -2.75 + (((tickAnim - 19) / 4) * (-1.25-(-2.75)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -1.25 + (((tickAnim - 23) / 8) * (-1.30367-(-1.25)));
            yy = 0 + (((tickAnim - 23) / 8) * (-16.49596-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0.37023-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 54) {
            xx = -1.30367 + (((tickAnim - 31) / 23) * (-1.30367-(-1.30367)));
            yy = -16.49596 + (((tickAnim - 31) / 23) * (-16.49596-(-16.49596)));
            zz = 0.37023 + (((tickAnim - 31) / 23) * (0.37023-(0.37023)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -1.30367 + (((tickAnim - 54) / 6) * (0-(-1.30367)));
            yy = -16.49596 + (((tickAnim - 54) / 6) * (0-(-16.49596)));
            zz = 0.37023 + (((tickAnim - 54) / 6) * (0-(0.37023)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7.75 + (((tickAnim - 10) / 3) * (-6.75-(-7.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -6.75 + (((tickAnim - 13) / 1) * (-7.75-(-6.75)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -7.75 + (((tickAnim - 14) / 3) * (-6.75-(-7.75)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -6.75 + (((tickAnim - 17) / 1) * (-7.75-(-6.75)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -7.75 + (((tickAnim - 18) / 1) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -7.75 + (((tickAnim - 19) / 4) * (-6.75-(-7.75)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -6.75 + (((tickAnim - 23) / 8) * (-6.85315-(-6.75)));
            yy = 0 + (((tickAnim - 23) / 8) * (-9.92998-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (1.18729-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -6.85315 + (((tickAnim - 31) / 9) * (-6.85315-(-6.85315)));
            yy = -9.92998 + (((tickAnim - 31) / 9) * (-9.92998-(-9.92998)));
            zz = 1.18729 + (((tickAnim - 31) / 9) * (1.18729-(1.18729)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -6.85315 + (((tickAnim - 40) / 8) * (-8.32263-(-6.85315)));
            yy = -9.92998 + (((tickAnim - 40) / 8) * (-8.73905-(-9.92998)));
            zz = 1.18729 + (((tickAnim - 40) / 8) * (7.0783+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3-(1.18729)));
        }
        else if (tickAnim >= 48 && tickAnim < 54) {
            xx = -8.32263 + (((tickAnim - 48) / 6) * (-8.32263-(-8.32263)));
            yy = -8.73905 + (((tickAnim - 48) / 6) * (-8.73905-(-8.73905)));
            zz = 7.0783+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3 + (((tickAnim - 48) / 6) * (10.5533+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5-(7.0783+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -8.32263 + (((tickAnim - 54) / 6) * (0-(-8.32263)));
            yy = -8.73905 + (((tickAnim - 54) / 6) * (0-(-8.73905)));
            zz = 10.5533+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5 + (((tickAnim - 54) / 6) * (0-(10.5533+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 22) / 9) * (2.93151-(0)));
            yy = 0 + (((tickAnim - 22) / 9) * (-11.02323-(0)));
            zz = 0 + (((tickAnim - 22) / 9) * (-3.16008-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 2.93151 + (((tickAnim - 31) / 9) * (2.93151-(2.93151)));
            yy = -11.02323 + (((tickAnim - 31) / 9) * (-11.02323-(-11.02323)));
            zz = -3.16008 + (((tickAnim - 31) / 9) * (-3.16008-(-3.16008)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 2.93151 + (((tickAnim - 40) / 8) * (2.30737-(2.93151)));
            yy = -11.02323 + (((tickAnim - 40) / 8) * (-10.77493-(-11.02323)));
            zz = -3.16008 + (((tickAnim - 40) / 8) * (0.13996-(-3.16008)));
        }
        else if (tickAnim >= 48 && tickAnim < 54) {
            xx = 2.30737 + (((tickAnim - 48) / 6) * (2.30737-(2.30737)));
            yy = -10.77493 + (((tickAnim - 48) / 6) * (-10.77493-(-10.77493)));
            zz = 0.13996 + (((tickAnim - 48) / 6) * (0.13996-(0.13996)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 2.30737 + (((tickAnim - 54) / 6) * (0-(2.30737)));
            yy = -10.77493 + (((tickAnim - 54) / 6) * (0-(-10.77493)));
            zz = 0.13996 + (((tickAnim - 54) / 6) * (0-(0.13996)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (19.5-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 19.5 + (((tickAnim - 13) / 3) * (0-(19.5)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (19.5-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 19.5 + (((tickAnim - 18) / 3) * (0-(19.5)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animChatter(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHypsilophodon entity = (EntityPrehistoricFloraHypsilophodon) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1.5 + (((tickAnim - 10) / 3) * (-1.63-(1.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -1.63 + (((tickAnim - 13) / 6) * (1.5-(-1.63)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 1.5 + (((tickAnim - 19) / 5) * (-1.63-(1.5)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -1.63 + (((tickAnim - 24) / 3) * (1.5-(-1.63)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 1.5 + (((tickAnim - 27) / 11) * (0-(1.5)));
            yy = 0 + (((tickAnim - 27) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 11) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 10) / 3) * (-1.92-(1)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -1.92 + (((tickAnim - 13) / 6) * (1-(-1.92)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 19) / 5) * (-1.92-(1)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -1.92 + (((tickAnim - 24) / 3) * (1-(-1.92)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 27) / 11) * (0-(1)));
            yy = 0 + (((tickAnim - 27) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 11) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -5.5 + (((tickAnim - 10) / 3) * (-12.25-(-5.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -12.25 + (((tickAnim - 13) / 4) * (-5.5-(-12.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -5.5 + (((tickAnim - 17) / 3) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -5.5 + (((tickAnim - 20) / 4) * (-12.25-(-5.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -12.25 + (((tickAnim - 24) / 4) * (-5.5-(-12.25)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -5.5 + (((tickAnim - 28) / 4) * (-12.25-(-5.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -12.25 + (((tickAnim - 32) / 6) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -6.75 + (((tickAnim - 10) / 3) * (0.25-(-6.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0.25 + (((tickAnim - 13) / 4) * (-6.75-(0.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -6.75 + (((tickAnim - 17) / 3) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -6.75 + (((tickAnim - 20) / 4) * (0.25-(-6.75)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0.25 + (((tickAnim - 24) / 4) * (-6.75-(0.25)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -6.75 + (((tickAnim - 28) / 4) * (0.25-(-6.75)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0.25 + (((tickAnim - 32) / 6) * (0-(0.25)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 5.5 + (((tickAnim - 10) / 3) * (-1.25-(5.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -1.25 + (((tickAnim - 13) / 4) * (5.5-(-1.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 5.5 + (((tickAnim - 17) / 3) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 5.5 + (((tickAnim - 20) / 4) * (-1.25-(5.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -1.25 + (((tickAnim - 24) / 4) * (5.5-(-1.25)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 5.5 + (((tickAnim - 28) / 4) * (-1.25-(5.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -1.25 + (((tickAnim - 32) / 6) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 5.5 + (((tickAnim - 10) / 3) * (-7-(5.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -7 + (((tickAnim - 13) / 4) * (5.5-(-7)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 5.5 + (((tickAnim - 17) / 3) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 5.5 + (((tickAnim - 20) / 4) * (-7-(5.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -7 + (((tickAnim - 24) / 4) * (5.5-(-7)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 5.5 + (((tickAnim - 28) / 4) * (-7-(5.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -7 + (((tickAnim - 32) / 6) * (0-(-7)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (19.75-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 19.75 + (((tickAnim - 13) / 4) * (0-(19.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (19.75-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 19.75 + (((tickAnim - 24) / 4) * (0-(19.75)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (19.75-(0)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 19.75 + (((tickAnim - 32) / 6) * (0-(19.75)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHypsilophodon entity = (EntityPrehistoricFloraHypsilophodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -12.25 + (((tickAnim - 8) / 7) * (27.25-(-12.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 27.25 + (((tickAnim - 15) / 7) * (-12.25-(27.25)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -12.25 + (((tickAnim - 22) / 6) * (27.25-(-12.25)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 27.25 + (((tickAnim - 28) / 7) * (-12.25-(27.25)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -12.25 + (((tickAnim - 35) / 7) * (27.25-(-12.25)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 27.25 + (((tickAnim - 42) / 8) * (0-(27.25)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -29.25 + (((tickAnim - 8) / 7) * (14.75-(-29.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 14.75 + (((tickAnim - 15) / 7) * (-29.25-(14.75)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -29.25 + (((tickAnim - 22) / 6) * (14.75-(-29.25)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 14.75 + (((tickAnim - 28) / 7) * (-29.25-(14.75)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -29.25 + (((tickAnim - 35) / 7) * (14.75-(-29.25)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 14.75 + (((tickAnim - 42) / 8) * (0-(14.75)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg6, rightLeg6.rotateAngleX + (float) Math.toRadians(xx), rightLeg6.rotateAngleY + (float) Math.toRadians(yy), rightLeg6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -30.75 + (((tickAnim - 4) / 4) * (11.5-(-30.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 11.5 + (((tickAnim - 8) / 7) * (20.25-(11.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 20.25 + (((tickAnim - 15) / 3) * (-48.12-(20.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -48.12 + (((tickAnim - 18) / 4) * (11.5-(-48.12)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 11.5 + (((tickAnim - 22) / 6) * (20.25-(11.5)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 20.25 + (((tickAnim - 28) / 4) * (-48.12-(20.25)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -48.12 + (((tickAnim - 32) / 3) * (11.5-(-48.12)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 11.5 + (((tickAnim - 35) / 7) * (20.25-(11.5)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 20.25 + (((tickAnim - 42) / 8) * (0-(20.25)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg7, rightLeg7.rotateAngleX + (float) Math.toRadians(xx), rightLeg7.rotateAngleY + (float) Math.toRadians(yy), rightLeg7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (68.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 68.75 + (((tickAnim - 4) / 4) * (29-(68.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 29 + (((tickAnim - 8) / 4) * (-17.37-(29)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -17.37 + (((tickAnim - 12) / 3) * (56.75-(-17.37)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 56.75 + (((tickAnim - 15) / 3) * (66.13-(56.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 66.13 + (((tickAnim - 18) / 4) * (29-(66.13)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 29 + (((tickAnim - 22) / 3) * (-17.37-(29)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -17.37 + (((tickAnim - 25) / 3) * (56.75-(-17.37)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 56.75 + (((tickAnim - 28) / 4) * (66.13-(56.75)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 66.13 + (((tickAnim - 32) / 3) * (29-(66.13)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 29 + (((tickAnim - 35) / 3) * (-17.37-(29)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -17.37 + (((tickAnim - 38) / 4) * (56.75-(-17.37)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 56.75 + (((tickAnim - 42) / 8) * (0-(56.75)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg8, rightLeg8.rotateAngleX + (float) Math.toRadians(xx), rightLeg8.rotateAngleY + (float) Math.toRadians(yy), rightLeg8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.575 + (((tickAnim - 4) / 4) * (0-(0.575)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0.475-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-0.125-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 0.475 + (((tickAnim - 15) / 7) * (0-(0.475)));
            zz = -0.125 + (((tickAnim - 15) / 7) * (0-(-0.125)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 6) * (0.475-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (-0.125-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0.475 + (((tickAnim - 28) / 7) * (0-(0.475)));
            zz = -0.125 + (((tickAnim - 28) / 7) * (0-(-0.125)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 7) * (0.475-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (-0.125-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0.475 + (((tickAnim - 42) / 8) * (0-(0.475)));
            zz = -0.125 + (((tickAnim - 42) / 8) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg8.rotationPointX = this.rightLeg8.rotationPointX + (float)(xx);
        this.rightLeg8.rotationPointY = this.rightLeg8.rotationPointY - (float)(yy);
        this.rightLeg8.rotationPointZ = this.rightLeg8.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0.21279-(0)));
            yy = 3.25 + (((tickAnim - 8) / 7) * (3.24303-(3.25)));
            zz = -2.5 + (((tickAnim - 8) / 7) * (1.25602-(-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0.21279 + (((tickAnim - 15) / 7) * (0-(0.21279)));
            yy = 3.24303 + (((tickAnim - 15) / 7) * (3.25-(3.24303)));
            zz = 1.25602 + (((tickAnim - 15) / 7) * (-2.5-(1.25602)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0.21279-(0)));
            yy = 3.25 + (((tickAnim - 22) / 6) * (3.24303-(3.25)));
            zz = -2.5 + (((tickAnim - 22) / 6) * (1.25602-(-2.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0.21279 + (((tickAnim - 28) / 7) * (0-(0.21279)));
            yy = 3.24303 + (((tickAnim - 28) / 7) * (3.25-(3.24303)));
            zz = 1.25602 + (((tickAnim - 28) / 7) * (-2.5-(1.25602)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 3.25 + (((tickAnim - 35) / 15) * (0-(3.25)));
            zz = -2.5 + (((tickAnim - 35) / 15) * (0-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.75-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -2.75 + (((tickAnim - 8) / 7) * (3.5-(-2.75)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 3.5 + (((tickAnim - 15) / 7) * (-2.75-(3.5)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = -2.75 + (((tickAnim - 22) / 6) * (3.5-(-2.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 3.5 + (((tickAnim - 28) / 7) * (-2.75-(3.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -2.75 + (((tickAnim - 35) / 15) * (0-(-2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.07696-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-8.74966-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.50589-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.07696 + (((tickAnim - 8) / 7) * (0-(-0.07696)));
            yy = -8.74966 + (((tickAnim - 8) / 7) * (-8.75-(-8.74966)));
            zz = 0.50589 + (((tickAnim - 8) / 7) * (0-(0.50589)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (-0.49994-(0)));
            yy = -8.75 + (((tickAnim - 15) / 7) * (-8.73582-(-8.75)));
            zz = 0 + (((tickAnim - 15) / 7) * (3.28819-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -0.49994 + (((tickAnim - 22) / 6) * (-0.80687-(-0.49994)));
            yy = -8.73582 + (((tickAnim - 22) / 6) * (-8.71301-(-8.73582)));
            zz = 3.28819 + (((tickAnim - 22) / 6) * (5.31147-(3.28819)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -0.80687 + (((tickAnim - 28) / 7) * (-1.26521-(-0.80687)));
            yy = -8.71301 + (((tickAnim - 28) / 7) * (-8.65875-(-8.71301)));
            zz = 5.31147 + (((tickAnim - 28) / 7) * (8.34579-(5.31147)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -1.26521 + (((tickAnim - 35) / 15) * (0-(-1.26521)));
            yy = -8.65875 + (((tickAnim - 35) / 15) * (0-(-8.65875)));
            zz = 8.34579 + (((tickAnim - 35) / 15) * (0-(8.34579)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (13.95309-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-3.98898-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (4.26034-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 13.95309 + (((tickAnim - 8) / 7) * (14.26259-(13.95309)));
            yy = -3.98898 + (((tickAnim - 8) / 7) * (-2.6474-(-3.98898)));
            zz = 4.26034 + (((tickAnim - 8) / 7) * (-1.08262-(4.26034)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 14.26259 + (((tickAnim - 15) / 7) * (13.95309-(14.26259)));
            yy = -2.6474 + (((tickAnim - 15) / 7) * (-3.98898-(-2.6474)));
            zz = -1.08262 + (((tickAnim - 15) / 7) * (4.26034-(-1.08262)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 13.95309 + (((tickAnim - 22) / 6) * (14.26259-(13.95309)));
            yy = -3.98898 + (((tickAnim - 22) / 6) * (-2.6474-(-3.98898)));
            zz = 4.26034 + (((tickAnim - 22) / 6) * (-1.08262-(4.26034)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 14.26259 + (((tickAnim - 28) / 7) * (13.95309-(14.26259)));
            yy = -2.6474 + (((tickAnim - 28) / 7) * (-3.98898-(-2.6474)));
            zz = -1.08262 + (((tickAnim - 28) / 7) * (4.26034-(-1.08262)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 13.95309 + (((tickAnim - 35) / 15) * (0-(13.95309)));
            yy = -3.98898 + (((tickAnim - 35) / 15) * (0-(-3.98898)));
            zz = 4.26034 + (((tickAnim - 35) / 15) * (0-(4.26034)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.39688-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-10.15538-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (7.87413-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -1.39688 + (((tickAnim - 8) / 7) * (-2.54865-(-1.39688)));
            yy = -10.15538 + (((tickAnim - 8) / 7) * (-9.93137-(-10.15538)));
            zz = 7.87413 + (((tickAnim - 8) / 7) * (14.47148-(7.87413)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -2.54865 + (((tickAnim - 15) / 7) * (-1.39688-(-2.54865)));
            yy = -9.93137 + (((tickAnim - 15) / 7) * (-10.15538-(-9.93137)));
            zz = 14.47148 + (((tickAnim - 15) / 7) * (7.87413-(14.47148)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -1.39688 + (((tickAnim - 22) / 6) * (-2.54865-(-1.39688)));
            yy = -10.15538 + (((tickAnim - 22) / 6) * (-9.93137-(-10.15538)));
            zz = 7.87413 + (((tickAnim - 22) / 6) * (14.47148-(7.87413)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -2.54865 + (((tickAnim - 28) / 7) * (-1.39688-(-2.54865)));
            yy = -9.93137 + (((tickAnim - 28) / 7) * (-10.15538-(-9.93137)));
            zz = 14.47148 + (((tickAnim - 28) / 7) * (7.87413-(14.47148)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -1.39688 + (((tickAnim - 35) / 15) * (0-(-1.39688)));
            yy = -10.15538 + (((tickAnim - 35) / 15) * (0-(-10.15538)));
            zz = 7.87413 + (((tickAnim - 35) / 15) * (0-(7.87413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.76159-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-13.08238-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (3.3118-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.76159 + (((tickAnim - 8) / 7) * (-2.66984-(-0.76159)));
            yy = -13.08238 + (((tickAnim - 8) / 7) * (-11.75376-(-13.08238)));
            zz = 3.3118 + (((tickAnim - 8) / 7) * (12.16816-(3.3118)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -2.66984 + (((tickAnim - 15) / 7) * (-0.76159-(-2.66984)));
            yy = -11.75376 + (((tickAnim - 15) / 7) * (-13.08238-(-11.75376)));
            zz = 12.16816 + (((tickAnim - 15) / 7) * (3.3118-(12.16816)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -0.76159 + (((tickAnim - 22) / 6) * (-2.66984-(-0.76159)));
            yy = -13.08238 + (((tickAnim - 22) / 6) * (-11.75376-(-13.08238)));
            zz = 3.3118 + (((tickAnim - 22) / 6) * (12.16816-(3.3118)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -2.66984 + (((tickAnim - 28) / 7) * (-0.76159-(-2.66984)));
            yy = -11.75376 + (((tickAnim - 28) / 7) * (-13.08238-(-11.75376)));
            zz = 12.16816 + (((tickAnim - 28) / 7) * (3.3118-(12.16816)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.76159 + (((tickAnim - 35) / 15) * (0-(-0.76159)));
            yy = -13.08238 + (((tickAnim - 35) / 15) * (0-(-13.08238)));
            zz = 3.3118 + (((tickAnim - 35) / 15) * (0-(3.3118)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-5.75-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (-2.05429-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (-7.82486-(0)));
            zz = -5.75 + (((tickAnim - 8) / 7) * (8.25158-(-5.75)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -2.05429 + (((tickAnim - 15) / 7) * (0-(-2.05429)));
            yy = -7.82486 + (((tickAnim - 15) / 7) * (0-(-7.82486)));
            zz = 8.25158 + (((tickAnim - 15) / 7) * (-5.75-(8.25158)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (-2.05429-(0)));
            yy = 0 + (((tickAnim - 22) / 6) * (-7.82486-(0)));
            zz = -5.75 + (((tickAnim - 22) / 6) * (8.25158-(-5.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -2.05429 + (((tickAnim - 28) / 7) * (0-(-2.05429)));
            yy = -7.82486 + (((tickAnim - 28) / 7) * (0-(-7.82486)));
            zz = 8.25158 + (((tickAnim - 28) / 7) * (-5.75-(8.25158)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (-2.05429-(0)));
            yy = 0 + (((tickAnim - 35) / 7) * (-7.82486-(0)));
            zz = -5.75 + (((tickAnim - 35) / 7) * (8.25158-(-5.75)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = -2.05429 + (((tickAnim - 42) / 6) * (0-(-2.05429)));
            yy = -7.82486 + (((tickAnim - 42) / 6) * (0-(-7.82486)));
            zz = 8.25158 + (((tickAnim - 42) / 6) * (-5.75-(8.25158)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = -5.75 + (((tickAnim - 48) / 2) * (0-(-5.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (4.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 4.25 + (((tickAnim - 8) / 7) * (-12-(4.25)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = -12 + (((tickAnim - 15) / 7) * (4.25-(-12)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 4.25 + (((tickAnim - 22) / 6) * (-12-(4.25)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -12 + (((tickAnim - 28) / 7) * (4.25-(-12)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = 4.25 + (((tickAnim - 35) / 7) * (-12-(4.25)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = -12 + (((tickAnim - 42) / 6) * (4.25-(-12)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 4.25 + (((tickAnim - 48) / 2) * (0-(4.25)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 5.75 + (((tickAnim - 8) / 7) * (-11.5-(5.75)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = -11.5 + (((tickAnim - 15) / 7) * (5.75-(-11.5)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 5.75 + (((tickAnim - 22) / 6) * (-11.5-(5.75)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -11.5 + (((tickAnim - 28) / 7) * (5.75-(-11.5)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = 5.75 + (((tickAnim - 35) / 7) * (-11.5-(5.75)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = -11.5 + (((tickAnim - 42) / 6) * (5.75-(-11.5)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 5.75 + (((tickAnim - 48) / 2) * (0-(5.75)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (11-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 11 + (((tickAnim - 8) / 4) * (14.56-(11)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 14.56 + (((tickAnim - 12) / 3) * (-11.5-(14.56)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -11.5 + (((tickAnim - 15) / 3) * (-13.5-(-11.5)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -13.5 + (((tickAnim - 18) / 4) * (11-(-13.5)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 11 + (((tickAnim - 22) / 3) * (14.63-(11)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 14.63 + (((tickAnim - 25) / 3) * (-11.5-(14.63)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = -11.5 + (((tickAnim - 28) / 5) * (-9.53-(-11.5)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = -9.53 + (((tickAnim - 33) / 2) * (11-(-9.53)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 11 + (((tickAnim - 35) / 3) * (15.63-(11)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = 15.63 + (((tickAnim - 38) / 4) * (-11.5-(15.63)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = -11.5 + (((tickAnim - 42) / 2) * (-16.22-(-11.5)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = -16.22 + (((tickAnim - 44) / 4) * (11-(-16.22)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 11 + (((tickAnim - 48) / 2) * (0-(11)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHypsilophodon entity = (EntityPrehistoricFloraHypsilophodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.275-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (6.475-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -5.275 + (((tickAnim - 15) / 20) * (-5.275-(-5.275)));
            zz = 6.475 + (((tickAnim - 15) / 20) * (6.475-(6.475)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -5.275 + (((tickAnim - 35) / 15) * (0-(-5.275)));
            zz = 6.475 + (((tickAnim - 35) / 15) * (0-(6.475)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -27.25 + (((tickAnim - 15) / 20) * (-27.25-(-27.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -27.25 + (((tickAnim - 35) / 15) * (0-(-27.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 11.75 + (((tickAnim - 15) / 20) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 35) / 15) * (0-(11.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.15 + (((tickAnim - 15) / 20) * (0.15-(0.15)));
            zz = -0.075 + (((tickAnim - 15) / 20) * (-0.075-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-48-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -48 + (((tickAnim - 15) / 20) * (-48-(-48)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -48 + (((tickAnim - 35) / 15) * (0-(-48)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (70.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 70.25 + (((tickAnim - 15) / 20) * (70.25-(70.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 70.25 + (((tickAnim - 35) / 15) * (0-(70.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.35 + (((tickAnim - 15) / 20) * (0.35-(0.35)));
            zz = -0.325 + (((tickAnim - 15) / 20) * (-0.325-(-0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -27.25 + (((tickAnim - 15) / 20) * (-27.25-(-27.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -27.25 + (((tickAnim - 35) / 15) * (0-(-27.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 11.75 + (((tickAnim - 15) / 20) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 35) / 15) * (0-(11.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg6, rightLeg6.rotateAngleX + (float) Math.toRadians(xx), rightLeg6.rotateAngleY + (float) Math.toRadians(yy), rightLeg6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.075-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.15 + (((tickAnim - 15) / 20) * (0.15-(0.15)));
            zz = -0.075 + (((tickAnim - 15) / 20) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.15 + (((tickAnim - 35) / 15) * (0-(0.15)));
            zz = -0.075 + (((tickAnim - 35) / 15) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg6.rotationPointX = this.rightLeg6.rotationPointX + (float)(xx);
        this.rightLeg6.rotationPointY = this.rightLeg6.rotationPointY - (float)(yy);
        this.rightLeg6.rotationPointZ = this.rightLeg6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-48-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -48 + (((tickAnim - 15) / 20) * (-48-(-48)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -48 + (((tickAnim - 35) / 15) * (0-(-48)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg7, rightLeg7.rotateAngleX + (float) Math.toRadians(xx), rightLeg7.rotateAngleY + (float) Math.toRadians(yy), rightLeg7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (70.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 70.25 + (((tickAnim - 15) / 20) * (70.25-(70.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 70.25 + (((tickAnim - 35) / 15) * (0-(70.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg8, rightLeg8.rotateAngleX + (float) Math.toRadians(xx), rightLeg8.rotateAngleY + (float) Math.toRadians(yy), rightLeg8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.61-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.15-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.61 + (((tickAnim - 7) / 8) * (0.35-(0.61)));
            zz = -0.15 + (((tickAnim - 7) / 8) * (-0.325-(-0.15)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.35 + (((tickAnim - 15) / 20) * (0.35-(0.35)));
            zz = -0.325 + (((tickAnim - 15) / 20) * (-0.325-(-0.325)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0.35 + (((tickAnim - 35) / 8) * (0.535-(0.35)));
            zz = -0.325 + (((tickAnim - 35) / 8) * (-0.14-(-0.325)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.535 + (((tickAnim - 43) / 7) * (0-(0.535)));
            zz = -0.14 + (((tickAnim - 43) / 7) * (0-(-0.14)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg8.rotationPointX = this.rightLeg8.rotationPointX + (float)(xx);
        this.rightLeg8.rotationPointY = this.rightLeg8.rotationPointY - (float)(yy);
        this.rightLeg8.rotationPointZ = this.rightLeg8.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -5.75 + (((tickAnim - 15) / 20) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5.75 + (((tickAnim - 35) / 15) * (0-(-5.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.25 + (((tickAnim - 15) / 20) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 35) / 15) * (0-(5.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightArm4, rightArm4.rotateAngleX + (float) Math.toRadians(0), rightArm4.rotateAngleY + (float) Math.toRadians(0), rightArm4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm5, rightArm5.rotateAngleX + (float) Math.toRadians(0), rightArm5.rotateAngleY + (float) Math.toRadians(0), rightArm5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(0), leftArm4.rotateAngleY + (float) Math.toRadians(0), leftArm4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm5, leftArm5.rotateAngleX + (float) Math.toRadians(0), leftArm5.rotateAngleY + (float) Math.toRadians(0), leftArm5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 15) / 20) * (-5-(-5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 35) / 15) * (0-(-5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0.5266-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (8.42883-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (3.52478-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0.5266 + (((tickAnim - 15) / 20) * (0.5266-(0.5266)));
            yy = 8.42883 + (((tickAnim - 15) / 20) * (8.42883-(8.42883)));
            zz = 3.52478 + (((tickAnim - 15) / 20) * (3.52478-(3.52478)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0.5266 + (((tickAnim - 35) / 15) * (0-(0.5266)));
            yy = 8.42883 + (((tickAnim - 35) / 15) * (0-(8.42883)));
            zz = 3.52478 + (((tickAnim - 35) / 15) * (0-(3.52478)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.0532-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (10.49947-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (3.29898-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 8.0532 + (((tickAnim - 15) / 20) * (8.0532-(8.0532)));
            yy = 10.49947 + (((tickAnim - 15) / 20) * (10.49947-(10.49947)));
            zz = 3.29898 + (((tickAnim - 15) / 20) * (3.29898-(3.29898)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 8.0532 + (((tickAnim - 35) / 15) * (0-(8.0532)));
            yy = 10.49947 + (((tickAnim - 35) / 15) * (0-(10.49947)));
            zz = 3.29898 + (((tickAnim - 35) / 15) * (0-(3.29898)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.27868-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (18.67601-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (7.19462-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0.27868 + (((tickAnim - 15) / 20) * (0.27868-(0.27868)));
            yy = 18.67601 + (((tickAnim - 15) / 20) * (18.67601-(18.67601)));
            zz = 7.19462 + (((tickAnim - 15) / 20) * (7.19462-(7.19462)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0.27868 + (((tickAnim - 35) / 15) * (0-(0.27868)));
            yy = 18.67601 + (((tickAnim - 35) / 15) * (0-(18.67601)));
            zz = 7.19462 + (((tickAnim - 35) / 15) * (0-(7.19462)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHypsilophodon entity = (EntityPrehistoricFloraHypsilophodon) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+30))*2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+50))*5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-0.4);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*0.3);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 26 + (((tickAnim - 0) / 8) * (-4.16628-(26)));
            yy = 0 + (((tickAnim - 0) / 8) * (5.50898-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-3.45513-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.16628 + (((tickAnim - 8) / 2) * (-14-(-4.16628)));
            yy = 5.50898 + (((tickAnim - 8) / 2) * (0-(5.50898)));
            zz = -3.45513 + (((tickAnim - 8) / 2) * (0-(-3.45513)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -14 + (((tickAnim - 10) / 10) * (26-(-14)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.5 + (((tickAnim - 0) / 3) * (29-(8.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 29 + (((tickAnim - 3) / 7) * (-26.75-(29)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -26.75 + (((tickAnim - 10) / 10) * (8.5-(-26.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 36.75 + (((tickAnim - 0) / 4) * (-37.17-(36.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -37.17 + (((tickAnim - 4) / 4) * (-37.17-(-37.17)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -37.17 + (((tickAnim - 8) / 2) * (12.5-(-37.17)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12.5 + (((tickAnim - 10) / 10) * (36.75-(12.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 60 + (((tickAnim - 0) / 2) * (89.98-(60)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 89.98 + (((tickAnim - 2) / 2) * (74.96-(89.98)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 74.96 + (((tickAnim - 4) / 4) * (74.96-(74.96)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 74.96 + (((tickAnim - 8) / 2) * (27.5-(74.96)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 27.5 + (((tickAnim - 10) / 2) * (11.64597-(27.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (1.77413-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (6.23676-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 11.64597 + (((tickAnim - 12) / 2) * (-12-(11.64597)));
            yy = 1.77413 + (((tickAnim - 12) / 2) * (0-(1.77413)));
            zz = 6.23676 + (((tickAnim - 12) / 2) * (0-(6.23676)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -12 + (((tickAnim - 14) / 3) * (-20.11-(-12)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -20.11 + (((tickAnim - 17) / 3) * (60-(-20.11)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.475 + (((tickAnim - 0) / 4) * (1.275-(0.475)));
            zz = -0.325 + (((tickAnim - 0) / 4) * (0.8-(-0.325)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 1.275 + (((tickAnim - 4) / 4) * (1.275-(1.275)));
            zz = 0.8 + (((tickAnim - 4) / 4) * (0.8-(0.8)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.275 + (((tickAnim - 8) / 2) * (0-(1.275)));
            zz = 0.8 + (((tickAnim - 8) / 2) * (0-(0.8)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (1.185-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (1.05-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 1.185 + (((tickAnim - 13) / 1) * (0.525-(1.185)));
            zz = 1.05 + (((tickAnim - 13) / 1) * (0.575-(1.05)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0.525 + (((tickAnim - 14) / 6) * (0.475-(0.525)));
            zz = 0.575 + (((tickAnim - 14) / 6) * (-0.325-(0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -14 + (((tickAnim - 0) / 9) * (26-(-14)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 26 + (((tickAnim - 9) / 11) * (-14-(26)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -26.75 + (((tickAnim - 0) / 9) * (8.5-(-26.75)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 8.5 + (((tickAnim - 9) / 4) * (32.08-(8.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 32.08 + (((tickAnim - 13) / 7) * (-26.75-(32.08)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg6, rightLeg6.rotateAngleX + (float) Math.toRadians(xx), rightLeg6.rotateAngleY + (float) Math.toRadians(yy), rightLeg6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 12.5 + (((tickAnim - 0) / 9) * (36.75-(12.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 36.75 + (((tickAnim - 9) / 4) * (-38.29-(36.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -38.29 + (((tickAnim - 13) / 5) * (-38.29-(-38.29)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -38.29 + (((tickAnim - 18) / 2) * (12.5-(-38.29)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg7, rightLeg7.rotateAngleX + (float) Math.toRadians(xx), rightLeg7.rotateAngleY + (float) Math.toRadians(yy), rightLeg7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 27.5 + (((tickAnim - 0) / 2) * (9.82167-(27.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (-1.29272-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-6.90526-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 9.82167 + (((tickAnim - 2) / 2) * (-13.70452-(9.82167)));
            yy = -1.29272 + (((tickAnim - 2) / 2) * (-3.61429-(-1.29272)));
            zz = -6.90526 + (((tickAnim - 2) / 2) * (-4.26558-(-6.90526)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -13.70452 + (((tickAnim - 4) / 2) * (-19.37-(-13.70452)));
            yy = -3.61429 + (((tickAnim - 4) / 2) * (0-(-3.61429)));
            zz = -4.26558 + (((tickAnim - 4) / 2) * (0-(-4.26558)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -19.37 + (((tickAnim - 6) / 5) * (99.2-(-19.37)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 99.2 + (((tickAnim - 11) / 2) * (72-(99.2)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 72 + (((tickAnim - 13) / 5) * (72-(72)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 72 + (((tickAnim - 18) / 2) * (27.5-(72)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg8, rightLeg8.rotateAngleX + (float) Math.toRadians(xx), rightLeg8.rotateAngleY + (float) Math.toRadians(yy), rightLeg8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.22-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.955-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.22 + (((tickAnim - 3) / 1) * (0.675-(1.22)));
            zz = 0.955 + (((tickAnim - 3) / 1) * (0.475-(0.955)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = 0.675 + (((tickAnim - 4) / 7) * (0.62-(0.675)));
            zz = 0.475 + (((tickAnim - 4) / 7) * (-0.175-(0.475)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.62 + (((tickAnim - 11) / 2) * (1.55-(0.62)));
            zz = -0.175 + (((tickAnim - 11) / 2) * (1.125-(-0.175)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.55 + (((tickAnim - 13) / 5) * (0.45-(1.55)));
            zz = 1.125 + (((tickAnim - 13) / 5) * (-0.15-(1.125)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 18) / 2) * (0-(0.45)));
            zz = -0.15 + (((tickAnim - 18) / 2) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg8.rotationPointX = this.rightLeg8.rotationPointX + (float)(xx);
        this.rightLeg8.rotationPointY = this.rightLeg8.rotationPointY - (float)(yy);
        this.rightLeg8.rotationPointZ = this.rightLeg8.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+90))*-5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-160))*3), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-1), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-240))*-3));


        this.setRotateAngle(rightArm4, rightArm4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-220))*-7), rightArm4.rotateAngleY + (float) Math.toRadians(0), rightArm4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm5, rightArm5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-290))*5), rightArm5.rotateAngleY + (float) Math.toRadians(0), rightArm5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-220))*-7), leftArm4.rotateAngleY + (float) Math.toRadians(0), leftArm4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm5, leftArm5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-290))*5), leftArm5.rotateAngleY + (float) Math.toRadians(0), leftArm5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-220))*1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-380))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-280))*1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-430))*-1));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-420))*2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-470))*-1));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-460))*2), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-500))*-1));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+30))*0.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+80))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+30))*0.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-120))*7), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+80))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+30))*0.5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-170))*10), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+80))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+30))*0.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-220))*15), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+80))*2));

       
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHypsilophodon entity = (EntityPrehistoricFloraHypsilophodon) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542/0.5+40))*4), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542))*4), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542+40))*7));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542/0.5))*-0.8);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542/0.5))*0.5);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 25.99311 + (((tickAnim - 0) / 5) * (-3.97817-(25.99311)));
            yy = 4.7471 + (((tickAnim - 0) / 5) * (2.35836-(4.7471)));
            zz = -0.16615 + (((tickAnim - 0) / 5) * (0.00061-(-0.16615)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -3.97817 + (((tickAnim - 5) / 2) * (-13.99322-(-3.97817)));
            yy = 2.35836 + (((tickAnim - 5) / 2) * (-0.83638-(2.35836)));
            zz = 0.00061 + (((tickAnim - 5) / 2) * (-0.929-(0.00061)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -13.99322 + (((tickAnim - 7) / 6) * (25.99311-(-13.99322)));
            yy = -0.83638 + (((tickAnim - 7) / 6) * (4.7471-(-0.83638)));
            zz = -0.929 + (((tickAnim - 7) / 6) * (-0.16615-(-0.929)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 13.5 + (((tickAnim - 0) / 2) * (23.19-(13.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 23.19 + (((tickAnim - 2) / 5) * (-40.75-(23.19)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -40.75 + (((tickAnim - 7) / 6) * (13.5-(-40.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 36.75 + (((tickAnim - 0) / 2) * (-33.81-(36.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -33.81 + (((tickAnim - 2) / 1) * (-43.12-(-33.81)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -43.12 + (((tickAnim - 3) / 1) * (-43.12-(-43.12)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -43.12 + (((tickAnim - 4) / 3) * (28.75-(-43.12)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 28.75 + (((tickAnim - 7) / 6) * (36.75-(28.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.2-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0.2 + (((tickAnim - 3) / 1) * (0.2-(0.2)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0.2 + (((tickAnim - 4) / 3) * (0-(0.2)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.925-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.925 + (((tickAnim - 8) / 3) * (0-(0.925)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 60 + (((tickAnim - 0) / 1) * (83.88-(60)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 83.88 + (((tickAnim - 1) / 2) * (74.59-(83.88)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 74.59 + (((tickAnim - 3) / 1) * (74.59-(74.59)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 74.59 + (((tickAnim - 4) / 3) * (25.75-(74.59)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 25.75 + (((tickAnim - 7) / 2) * (-14-(25.75)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -14 + (((tickAnim - 9) / 2) * (-20.03-(-14)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -20.03 + (((tickAnim - 11) / 2) * (60-(-20.03)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.475 + (((tickAnim - 0) / 3) * (1.39-(0.475)));
            zz = -0.325 + (((tickAnim - 0) / 3) * (0.865-(-0.325)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.39 + (((tickAnim - 3) / 1) * (1.39-(1.39)));
            zz = 0.865 + (((tickAnim - 3) / 1) * (0.865-(0.865)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 1.39 + (((tickAnim - 4) / 3) * (0-(1.39)));
            zz = 0.865 + (((tickAnim - 4) / 3) * (0-(0.865)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (1.39-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0.28-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.39 + (((tickAnim - 8) / 1) * (1.005-(1.39)));
            zz = 0.28 + (((tickAnim - 8) / 1) * (0.83-(0.28)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.005 + (((tickAnim - 9) / 4) * (0.475-(1.005)));
            zz = 0.83 + (((tickAnim - 9) / 4) * (-0.325-(0.83)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -13.98671 + (((tickAnim - 0) / 6) * (25.99382-(-13.98671)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*542))*2 + (((tickAnim - 0) / 6) * (-4.49725-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*542))*2)));
            zz = 1.30068 + (((tickAnim - 0) / 6) * (0.15737-(1.30068)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 25.99382 + (((tickAnim - 6) / 6) * (-5.02707-(25.99382)));
            yy = -4.49725 + (((tickAnim - 6) / 6) * (-1.91675-(-4.49725)));
            zz = 0.15737 + (((tickAnim - 6) / 6) * (0.55344-(0.15737)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -5.02707 + (((tickAnim - 12) / 1) * (-13.98671-(-5.02707)));
            yy = -1.91675 + (((tickAnim - 12) / 1) * (1.17088-(-1.91675)));
            zz = 0.55344 + (((tickAnim - 12) / 1) * (1.30068-(0.55344)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -36.5 + (((tickAnim - 0) / 6) * (8.5-(-36.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 8.5 + (((tickAnim - 6) / 2) * (27.75-(8.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 27.75 + (((tickAnim - 8) / 5) * (-36.5-(27.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg6, rightLeg6.rotateAngleX + (float) Math.toRadians(xx), rightLeg6.rotateAngleY + (float) Math.toRadians(yy), rightLeg6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 23 + (((tickAnim - 0) / 6) * (36.75-(23)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 36.75 + (((tickAnim - 6) / 2) * (-31.75-(36.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -31.75 + (((tickAnim - 8) / 1) * (-39-(-31.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -39 + (((tickAnim - 9) / 2) * (-39-(-39)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -39 + (((tickAnim - 11) / 2) * (23-(-39)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg7, rightLeg7.rotateAngleX + (float) Math.toRadians(xx), rightLeg7.rotateAngleY + (float) Math.toRadians(yy), rightLeg7.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 3) * (1.495-(0.2)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.495 + (((tickAnim - 3) / 3) * (0-(1.495)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0.175-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0.175 + (((tickAnim - 9) / 2) * (0.175-(0.175)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0.175 + (((tickAnim - 11) / 2) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg7.rotationPointX = this.rightLeg7.rotationPointX + (float)(xx);
        this.rightLeg7.rotationPointY = this.rightLeg7.rotationPointY - (float)(yy);
        this.rightLeg7.rotationPointZ = this.rightLeg7.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 27.5 + (((tickAnim - 0) / 2) * (-4.67-(27.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -4.67 + (((tickAnim - 2) / 1) * (-15.97-(-4.67)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -15.97 + (((tickAnim - 3) / 3) * (60-(-15.97)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 60 + (((tickAnim - 6) / 2) * (104.5-(60)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 104.5 + (((tickAnim - 8) / 1) * (72.88-(104.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 72.88 + (((tickAnim - 9) / 2) * (72.88-(72.88)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 72.88 + (((tickAnim - 11) / 2) * (27.5-(72.88)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg8, rightLeg8.rotateAngleX + (float) Math.toRadians(xx), rightLeg8.rotateAngleY + (float) Math.toRadians(yy), rightLeg8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 0) / 2) * (0.85-(0.525)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.625-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0.85 + (((tickAnim - 2) / 4) * (0.475-(0.85)));
            zz = 0.625 + (((tickAnim - 2) / 4) * (-0.325-(0.625)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 6) / 2) * (0.48-(0.475)));
            zz = -0.325 + (((tickAnim - 6) / 2) * (0.055-(-0.325)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.48 + (((tickAnim - 8) / 1) * (1.375-(0.48)));
            zz = 0.055 + (((tickAnim - 8) / 1) * (0.805-(0.055)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 1.375 + (((tickAnim - 9) / 2) * (1.375-(1.375)));
            zz = 0.805 + (((tickAnim - 9) / 2) * (0.805-(0.805)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.375 + (((tickAnim - 11) / 2) * (0.525-(1.375)));
            zz = 0.805 + (((tickAnim - 11) / 2) * (0-(0.805)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg8.rotationPointX = this.rightLeg8.rotationPointX + (float)(xx);
        this.rightLeg8.rotationPointY = this.rightLeg8.rotationPointY - (float)(yy);
        this.rightLeg8.rotationPointZ = this.rightLeg8.rotationPointZ + (float)(zz);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542/0.5+170))*7), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542+150))*4));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542/0.5+220))*4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542+240))*4));
        this.setRotateAngle(rightArm4, rightArm4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542/0.5+290))*12), rightArm4.rotateAngleY + (float) Math.toRadians(0), rightArm4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightArm5, rightArm5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542/0.5+320))*-12), rightArm5.rotateAngleY + (float) Math.toRadians(0), rightArm5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542/0.5+290))*12), leftArm4.rotateAngleY + (float) Math.toRadians(0), leftArm4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArm5, leftArm5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542/0.5+320))*-12), leftArm5.rotateAngleY + (float) Math.toRadians(0), leftArm5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542/0.5+280))*-4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542+270))*4));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542/0.5+320))*7), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542+300))*4));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542/0.5+380))*4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542+340))*4));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542/0.5+430))*-4), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542+390))*4));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542/0.5+90))*4), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542-50))*-9), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542+40))*2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542/0.5-230))*-4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542-130))*-13), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542+40))*2));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542/0.5-320))*-4), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542-240))*-23), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542+40))*2));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542/0.5+190))*4), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542-280))*-28), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*542+40))*2));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHypsilophodon e = (EntityPrehistoricFloraHypsilophodon) entity;
        animator.update(entity);

    }
}
