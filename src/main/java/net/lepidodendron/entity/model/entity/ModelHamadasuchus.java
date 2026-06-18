package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHamadasuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHamadasuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
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
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;


    private ModelAnimator animator;

    public ModelHamadasuchus() {
        this.textureWidth = 78;
        this.textureHeight = 78;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 15.0F, 3.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.5F, -3.45F, 2.8F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1527F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 46, 1.5F, -0.925F, -3.425F, 2, 1, 6, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -3.4F, 2.8F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 14, -1.5F, -0.5F, -3.5F, 5, 6, 6, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.5F, -2.1963F, 2.7493F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.3054F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 44, 11, -1.5F, -0.5F, -2.0F, 3, 6, 4, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 5.5F, -2.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6981F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 59, 8, -1.0F, 0.0F, 0.0F, 2, 7, 3, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 6.7962F, 1.9809F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.3927F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 38, 36, -1.5F, 0.0F, -6.0F, 3, 1, 6, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.5F, -2.1963F, 2.7493F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3054F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 44, 11, -1.5F, -0.5F, -2.0F, 3, 6, 4, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 5.5F, -2.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6981F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 59, 8, -1.0F, 0.0F, 0.0F, 2, 7, 3, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 6.7962F, 1.9809F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.3927F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 38, 36, -1.5F, 0.0F, -6.0F, 3, 1, 6, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.4698F, 4.5386F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.2531F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 25, 0, -2.0F, 0.0F, 0.0F, 4, 4, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -0.575F, 0.0F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.048F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 47, 0.0F, 0.0F, 0.0F, 2, 1, 6, -0.005F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1222F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 37, -1.5F, 0.0F, 0.0F, 3, 3, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -0.425F, 1.0F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 55, 0.5F, 0.0F, -1.0F, 1, 1, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 19, 36, -1.0F, 0.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.25F, 3.5F);
        this.tail3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 54, 0.0F, -0.45F, -2.8F, 1, 1, 6, -0.005F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1255F, 5.9891F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 42, 26, -0.5F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.9603F, 0.0154F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -0.5397F, -6.0154F, 6, 7, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -1.1397F, -5.9654F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 46, 0, -2.0F, 0.025F, 0.125F, 2, 1, 6, -0.003F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 2.7603F, -5.1154F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 23, 14, -3.0F, -3.3F, -4.0F, 6, 7, 4, 0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -3.7F, -5.05F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 59, 29, -1.0F, 0.0F, 1.0F, 2, 1, 4, 0.003F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -3.1F, -3.5F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0436F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 23, 26, -2.5F, -0.0499F, -3.9978F, 5, 5, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0F, -0.4764F, -5.0848F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0349F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 53, 60, 1.0F, 0.0F, 1.0F, 2, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 5.0F, -4.0F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 53, 53, -1.5F, -1.475F, 0.0F, 4, 2, 4, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.25F, 3.25F, -2.2F);
        this.body3.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.2618F, 0.0F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 59, 19, -1.0F, -0.5F, -1.5F, 2, 6, 3, 0.01F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 5.5F, 1.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.5236F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 56, 66, -1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 4.3F, -0.175F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.2182F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 0, 63, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.25F, 3.25F, -2.2F);
        this.body3.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.2618F, 0.0F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 59, 19, -1.0F, -0.5F, -1.5F, 2, 6, 3, 0.01F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 5.5F, 1.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.5236F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 56, 66, -1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 4.3F, -0.175F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2182F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 0, 63, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0271F, -3.4755F);
        this.body3.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 27, -2.0F, -0.0498F, -4.5206F, 4, 4, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 4.6672F, -4.5893F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 36, 53, -1.0F, -2.0F, -0.05F, 3, 2, 5, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -0.5404F, -0.0264F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 61, 0.0F, 0.025F, -4.0F, 2, 1, 4, -0.003F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -3.525F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.0698F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 55, 44, -0.2F, 0.0F, -3.5F, 2, 4, 4, -0.003F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 57, 35, -1.8F, 0.0F, -3.5F, 2, 4, 4, -0.006F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.3212F, -0.5622F);
        this.neck2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 62, -1.0F, 0.0F, -3.15F, 2, 1, 4, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 4.0F, -3.5F);
        this.neck2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 63, 0, -1.0F, -0.7F, 0.0F, 3, 1, 3, -0.003F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.0436F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 68, 49, -1.0F, 0.75F, -2.0F, 2, 1, 2, 0.006F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.4625F, -7.8222F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.7418F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 35, 11, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.2889F, -6.8374F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 11, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.006F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.2889F, -6.8374F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0698F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 67, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.9899F, 0.1813F, -3.8001F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0903F, -0.1928F, -0.0351F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 38, 44, -0.125F, 0.0F, -3.05F, 1, 1, 7, 0.003F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.9899F, 0.1813F, -3.8001F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0903F, 0.1928F, 0.0351F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 44, -0.875F, 0.0F, -3.05F, 1, 1, 7, 0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.0878F, -1.9981F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 70, 9, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.175F, 0.0F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 70, 5, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0485F, 1.25F, -6.3248F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.3665F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 63, 5, 0.0F, -0.5F, -1.675F, 1, 1, 1, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 53, 22, 0.0F, -0.5F, -1.0F, 1, 1, 1, 0.006F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0485F, 1.25F, -6.3248F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0611F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 51, 8, 0.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0333F, 0.75F, -5.4984F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2705F, -0.1745F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 37, 67, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-2.0066F, 0.75F, -0.6952F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1598F, -0.1761F, -0.0744F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 46, 8, 0.0F, 0.0F, -3.425F, 1, 1, 1, -0.003F, true));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 68, 0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.0094F, 1.25F, -0.688F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.1396F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 70, 71, 0.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0485F, 1.25F, -6.3248F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.3665F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 63, 5, -1.0F, -0.5F, -1.675F, 1, 1, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 53, 22, -1.0F, -0.5F, -1.0F, 1, 1, 1, 0.006F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0627F, 1.9648F, -4.1365F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3638F, -0.1761F, -0.0744F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 40, 11, 0.0F, -0.6F, -0.3F, 0, 1, 1, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.8884F, 1.7136F, -5.9443F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.3677F, -0.1457F, 0.102F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 19, 33, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.6902F, 1.75F, -7.2584F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1745F, -0.3665F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 19, 30, 0.05F, -0.425F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.6902F, 1.75F, -7.2584F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1745F, 0.3665F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 19, 30, -0.05F, -0.425F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.0485F, 1.25F, -6.3248F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -0.0611F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 51, 8, -1.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.8884F, 1.7136F, -5.9443F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3677F, 0.1457F, -0.102F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 19, 33, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.0333F, 0.75F, -5.4984F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.2705F, 0.1745F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 37, 67, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(2.0094F, 1.25F, -0.688F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -0.1396F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 70, 71, -1.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(2.0066F, 0.75F, -0.6952F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1598F, 0.1761F, 0.0744F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 68, -1.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 46, 8, -1.0F, 0.0F, -3.425F, 1, 1, 1, -0.003F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.0627F, 1.9648F, -4.1365F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.3638F, 0.1761F, 0.0744F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 40, 11, 0.0F, -0.6F, -0.3F, 0, 1, 1, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.5F, 1.8831F, -7.7752F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.3709F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 25, 11, -1.0F, -0.9952F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, 2.2336F, -3.673F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.2182F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 66, 60, 0.0F, -1.0F, -4.0F, 1, 1, 4, -0.003F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.75F, -2.0F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.2618F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 44, 22, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.75F, -0.1F);
        this.head.addChild(jaw);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.5F, 2.3323F, -2.0431F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.0873F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 65, 66, -1.0F, -2.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 1.8147F, -3.9749F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.2618F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 70, 17, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.006F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, 1.514F, -4.9286F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.3054F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 37, 71, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.006F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, 0.7486F, -6.7764F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.3927F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 70, 35, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.5F, 0.1398F, -7.5697F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.6545F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 70, 56, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5F, 0.9052F, -5.722F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.3927F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 70, 25, -1.0F, -1.0F, -2.0F, 1, 1, 2, -0.006F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5F, -0.0796F, -5.5483F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.2923F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 70, 21, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.003F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.3308F, -1.8841F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0567F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 70, 13, -1.0F, 0.0F, -1.925F, 2, 1, 2, 0.003F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.3922F, -0.4946F, -6.8697F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.5501F, -0.172F, 0.0881F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 19, 27, -0.05F, -0.75F, -0.3F, 0, 1, 1, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.7365F, 0.258F, -5.0163F);
        this.jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.2347F, -0.2542F, -0.0662F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 45, 61, 0.0F, -0.6F, -1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.3922F, -0.4946F, -6.8697F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.5501F, 0.172F, -0.0881F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 19, 27, 0.05F, -0.75F, -0.3F, 0, 1, 1, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-0.9988F, 0.5316F, -5.0992F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.3792F, -0.1583F, 0.1107F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 68, 44, 0.025F, -0.5F, -2.45F, 1, 1, 3, 0.0F, true));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-1.961F, -0.0134F, -0.4386F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.0072F, 0.1299F, -0.0255F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 65, 71, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.4938F, 1.1908F, -4.8128F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.1255F, -0.2189F, -0.0137F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 70, 39, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-2.0066F, -1.0F, -0.5952F);
        this.jaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.1598F, -0.1761F, -0.0744F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 18, 68, 0.0F, 1.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.9988F, 0.5316F, -5.0992F);
        this.jaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.3792F, 0.1583F, -0.1107F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 68, 44, -1.025F, -0.5F, -2.45F, 1, 1, 3, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.4938F, 1.1908F, -4.8128F);
        this.jaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.1255F, 0.2189F, 0.0137F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 70, 39, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(1.961F, -0.0134F, -0.4386F);
        this.jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.0072F, -0.1299F, 0.0255F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 65, 71, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-1.6785F, 0.1251F, -1.3931F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.1254F, -0.1681F, 0.1191F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 45, 66, 0.15F, -1.8F, -1.4F, 2, 2, 3, 0.0F, true));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(1.6785F, 0.1251F, -1.3931F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.1254F, 0.1681F, -0.1191F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 45, 66, -2.15F, -1.8F, -1.4F, 2, 2, 3, 0.0F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.7365F, 0.258F, -5.0163F);
        this.jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.2347F, 0.2542F, 0.0662F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 45, 61, 0.0F, -0.6F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(2.0066F, -1.0F, -0.5952F);
        this.jaw.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.1598F, 0.1761F, 0.0744F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 18, 68, -1.0F, 1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.jaw.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.1614F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 9, 68, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, 0.7244F, -2.3781F);
        this.head.addChild(eyes);


        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(1.4622F, 0.4117F, -0.0401F);
        this.eyes.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0682F, 0.2119F, -0.037F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 70, 53, -0.825F, -0.925F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(-1.4622F, 0.4117F, -0.0401F);
        this.eyes.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0682F, -0.2119F, 0.037F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 70, 53, -0.175F, -0.925F, -0.5F, 1, 1, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 0.2F;
        this.main.offsetX = 0.35F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.6F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.105F;
        this.main.render(0.01F);
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

        EntityPrehistoricFloraHamadasuchus EntityMegalosaurus = (EntityPrehistoricFloraHamadasuchus) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraHamadasuchus ee = (EntityPrehistoricFloraHamadasuchus) entitylivingbaseIn;

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
            //moving in water
            //
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The actual roar/anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.YAWN_ANIMATION) { //The actual roar/anim
            animYawn(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animYawn(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHamadasuchus entity = (EntityPrehistoricFloraHamadasuchus) entitylivingbaseIn;
        int animCycle = 78;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7 + (((tickAnim - 0) / 25) * (1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*-10-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 61) {
            xx = 1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*-10 + (((tickAnim - 25) / 36) * (8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*15-(1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*-10)));
            yy = 0 + (((tickAnim - 25) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 36) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 78) {
            xx = 8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*15 + (((tickAnim - 61) / 17) * (0-(8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*15)));
            yy = 0 + (((tickAnim - 61) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7 + (((tickAnim - 0) / 25) * (39.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*50-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 61) {
            xx = 39.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*50 + (((tickAnim - 25) / 36) * (-26.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*30-(39.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*50)));
            yy = 0 + (((tickAnim - 25) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 36) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 78) {
            xx = -26.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*30 + (((tickAnim - 61) / 17) * (0-(-26.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*30)));
            yy = 0 + (((tickAnim - 61) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 78) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7 + (((tickAnim - 0) / 78) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7)));
            yy = 0 + (((tickAnim - 0) / 78) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 78) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.3-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 9) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 47) * (0-(0)));
            zz = 0.3 + (((tickAnim - 9) / 47) * (0.3-(0.3)));
        }
        else if (tickAnim >= 56 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 56) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 22) * (0-(0)));
            zz = 0.3 + (((tickAnim - 56) / 22) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (21.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 21.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20 + (((tickAnim - 9) / 16) * (26.175-(21.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 61) {
            xx = 26.175 + (((tickAnim - 25) / 36) * (67.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*-50-(26.175)));
            yy = 0 + (((tickAnim - 25) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 36) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 78) {
            xx = 67.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*-50 + (((tickAnim - 61) / 17) * (0-(67.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*-50)));
            yy = 0 + (((tickAnim - 61) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 0) / 23) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 23) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 23) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 23) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 23) / 7) * (-0.0125-(1)));
            zz = 1 + (((tickAnim - 23) / 7) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 30) / 5) * (1-(1)));
            yy = -0.0125 + (((tickAnim - 30) / 5) * (-0.0125-(-0.0125)));
            zz = 1 + (((tickAnim - 30) / 5) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 68) {
            xx = 1 + (((tickAnim - 35) / 33) * (1-(1)));
            yy = -0.0125 + (((tickAnim - 35) / 33) * (1-(-0.0125)));
            zz = 1 + (((tickAnim - 35) / 33) * (1-(1)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = 1 + (((tickAnim - 68) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 68) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 68) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);
       

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHamadasuchus entity = (EntityPrehistoricFloraHamadasuchus) entitylivingbaseIn;
        int animCycle = 154;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 20) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 37) * (0-(0)));
            zz = -1 + (((tickAnim - 20) / 37) * (-1-(-1)));
        }
        else if (tickAnim >= 57 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 57) / 1) * (7.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*8-(0)));
            yy = 0 + (((tickAnim - 57) / 1) * (0-(0)));
            zz = -1 + (((tickAnim - 57) / 1) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-2-(-1)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 7.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*8 + (((tickAnim - 58) / 22) * (2.7498-(7.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*8)));
            yy = 0 + (((tickAnim - 58) / 22) * (-0.036-(0)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-2 + (((tickAnim - 58) / 22) * (-0.2509-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-2)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = 2.7498 + (((tickAnim - 80) / 55) * (2.7498-(2.7498)));
            yy = -0.036 + (((tickAnim - 80) / 55) * (-0.036-(-0.036)));
            zz = -0.2509 + (((tickAnim - 80) / 55) * (-0.2509-(-0.2509)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 2.7498 + (((tickAnim - 135) / 19) * (0-(2.7498)));
            yy = -0.036 + (((tickAnim - 135) / 19) * (0-(-0.036)));
            zz = -0.2509 + (((tickAnim - 135) / 19) * (0-(-0.2509)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 20) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 37) * (0-(0)));
            zz = 2 + (((tickAnim - 20) / 37) * (2-(2)));
        }
        else if (tickAnim >= 57 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 57) / 1) * (19.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*20-(0)));
            yy = 0 + (((tickAnim - 57) / 1) * (0-(0)));
            zz = 2 + (((tickAnim - 57) / 1) * (2-(2)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 19.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*20 + (((tickAnim - 58) / 22) * (5.4981-(19.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*20)));
            yy = 0 + (((tickAnim - 58) / 22) * (-0.174-(0)));
            zz = 2 + (((tickAnim - 58) / 22) * (3.2378-(2)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = 5.4981 + (((tickAnim - 80) / 55) * (5.4981-(5.4981)));
            yy = -0.174 + (((tickAnim - 80) / 55) * (-0.174-(-0.174)));
            zz = 3.2378 + (((tickAnim - 80) / 55) * (3.2378-(3.2378)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 5.4981 + (((tickAnim - 135) / 19) * (0-(5.4981)));
            yy = -0.174 + (((tickAnim - 135) / 19) * (0-(-0.174)));
            zz = 3.2378 + (((tickAnim - 135) / 19) * (0-(3.2378)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-16.0429-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.6899-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-3.5591-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.0429 + (((tickAnim - 10) / 10) * (-9.0858-(-16.0429)));
            yy = 0.6899 + (((tickAnim - 10) / 10) * (1.3798-(0.6899)));
            zz = -3.5591 + (((tickAnim - 10) / 10) * (-7.1182-(-3.5591)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -9.0858 + (((tickAnim - 20) / 15) * (16.4142-(-9.0858)));
            yy = 1.3798 + (((tickAnim - 20) / 15) * (1.3798-(1.3798)));
            zz = -7.1182 + (((tickAnim - 20) / 15) * (-7.1182-(-7.1182)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 16.4142 + (((tickAnim - 35) / 15) * (-9.0858-(16.4142)));
            yy = 1.3798 + (((tickAnim - 35) / 15) * (1.3798-(1.3798)));
            zz = -7.1182 + (((tickAnim - 35) / 15) * (-7.1182-(-7.1182)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -9.0858 + (((tickAnim - 50) / 15) * (9.4142-(-9.0858)));
            yy = 1.3798 + (((tickAnim - 50) / 15) * (1.3798-(1.3798)));
            zz = -7.1182 + (((tickAnim - 50) / 15) * (-7.1182-(-7.1182)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 9.4142 + (((tickAnim - 65) / 15) * (3.4142-(9.4142)));
            yy = 1.3798 + (((tickAnim - 65) / 15) * (1.3798-(1.3798)));
            zz = -7.1182 + (((tickAnim - 65) / 15) * (-7.1182-(-7.1182)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = 3.4142 + (((tickAnim - 80) / 55) * (3.4142-(3.4142)));
            yy = 1.3798 + (((tickAnim - 80) / 55) * (1.3798-(1.3798)));
            zz = -7.1182 + (((tickAnim - 80) / 55) * (-7.1182-(-7.1182)));
        }
        else if (tickAnim >= 135 && tickAnim < 146) {
            xx = 3.4142 + (((tickAnim - 135) / 11) * (2.4627-(3.4142)));
            yy = 1.3798 + (((tickAnim - 135) / 11) * (0.5999-(1.3798)));
            zz = -7.1182 + (((tickAnim - 135) / 11) * (-3.0949-(-7.1182)));
        }
        else if (tickAnim >= 146 && tickAnim < 154) {
            xx = 2.4627 + (((tickAnim - 146) / 8) * (0-(2.4627)));
            yy = 0.5999 + (((tickAnim - 146) / 8) * (0-(0.5999)));
            zz = -3.0949 + (((tickAnim - 146) / 8) * (0-(-3.0949)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-60.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -60.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 10) / 10) * (-12-(-60.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -12 + (((tickAnim - 20) / 15) * (-0.5-(-12)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -0.5 + (((tickAnim - 35) / 8) * (-27.5-(-0.5)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 43) / 7) * (-12-(-27.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -12 + (((tickAnim - 50) / 15) * (-0.5-(-12)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = -0.5 + (((tickAnim - 65) / 15) * (12.75-(-0.5)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = 12.75 + (((tickAnim - 80) / 55) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 80) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 55) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 146) {
            xx = 12.75 + (((tickAnim - 135) / 11) * (-39.49-(12.75)));
            yy = 0 + (((tickAnim - 135) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 11) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 154) {
            xx = -39.49 + (((tickAnim - 146) / 8) * (0-(-39.49)));
            yy = 0 + (((tickAnim - 146) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0.425-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0.3-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 0.425 + (((tickAnim - 38) / 5) * (0-(0.425)));
            zz = 0.3 + (((tickAnim - 38) / 5) * (0-(0.3)));
        }
        else if (tickAnim >= 43 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 43) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 22) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 80) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 55) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 135) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 19) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (72.37-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 72.37 + (((tickAnim - 10) / 10) * (65.75-(72.37)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 65.75 + (((tickAnim - 20) / 8) * (7-(65.75)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 7 + (((tickAnim - 28) / 7) * (9.4466-(7)));
            yy = 0 + (((tickAnim - 28) / 7) * (-0.8501-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (7.2002-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 9.4466 + (((tickAnim - 35) / 6) * (88.17-(9.4466)));
            yy = -0.8501 + (((tickAnim - 35) / 6) * (0-(-0.8501)));
            zz = 7.2002 + (((tickAnim - 35) / 6) * (0-(7.2002)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 88.17 + (((tickAnim - 41) / 9) * (49-(88.17)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = 49 + (((tickAnim - 50) / 8) * (6.9504-(49)));
            yy = 0 + (((tickAnim - 50) / 8) * (-1.4175-(0)));
            zz = 0 + (((tickAnim - 50) / 8) * (4.0071-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = 6.9504 + (((tickAnim - 58) / 7) * (-9.0037-(6.9504)));
            yy = -1.4175 + (((tickAnim - 58) / 7) * (-0.0871-(-1.4175)));
            zz = 4.0071 + (((tickAnim - 58) / 7) * (4.9991-(4.0071)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = -9.0037 + (((tickAnim - 65) / 15) * (-26.25-(-9.0037)));
            yy = -0.0871 + (((tickAnim - 65) / 15) * (0-(-0.0871)));
            zz = 4.9991 + (((tickAnim - 65) / 15) * (0-(4.9991)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = -26.25 + (((tickAnim - 80) / 55) * (-26.25-(-26.25)));
            yy = 0 + (((tickAnim - 80) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 55) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 140) {
            xx = -26.25 + (((tickAnim - 135) / 5) * (41.31-(-26.25)));
            yy = 0 + (((tickAnim - 135) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 5) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 146) {
            xx = 41.31 + (((tickAnim - 140) / 6) * (87.09-(41.31)));
            yy = 0 + (((tickAnim - 140) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 6) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 154) {
            xx = 87.09 + (((tickAnim - 146) / 8) * (0-(87.09)));
            yy = 0 + (((tickAnim - 146) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.575-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0.475 + (((tickAnim - 20) / 8) * (-0.35-(0.475)));
            zz = -0.575 + (((tickAnim - 20) / 8) * (0-(-0.575)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -0.35 + (((tickAnim - 28) / 7) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 6) * (1.065-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (-0.975-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 1.065 + (((tickAnim - 41) / 9) * (0.475-(1.065)));
            zz = -0.975 + (((tickAnim - 41) / 9) * (-0.575-(-0.975)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 50) / 8) * (0-(0)));
            yy = 0.475 + (((tickAnim - 50) / 8) * (-0.125-(0.475)));
            zz = -0.575 + (((tickAnim - 50) / 8) * (0-(-0.575)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 58) / 7) * (0-(0)));
            yy = -0.125 + (((tickAnim - 58) / 7) * (-0.4-(-0.125)));
            zz = 0 + (((tickAnim - 58) / 7) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            yy = -0.4 + (((tickAnim - 65) / 8) * (-0.325-(-0.4)));
            zz = 0 + (((tickAnim - 65) / 8) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            yy = -0.325 + (((tickAnim - 73) / 7) * (-0.4-(-0.325)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 80) / 55) * (0-(0)));
            yy = -0.4 + (((tickAnim - 80) / 55) * (-0.4-(-0.4)));
            zz = 0 + (((tickAnim - 80) / 55) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 135) / 5) * (0-(0)));
            yy = -0.4 + (((tickAnim - 135) / 5) * (0.83-(-0.4)));
            zz = 0 + (((tickAnim - 135) / 5) * (-0.23-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 140) / 6) * (0-(0)));
            yy = 0.83 + (((tickAnim - 140) / 6) * (0.755-(0.83)));
            zz = -0.23 + (((tickAnim - 140) / 6) * (-0.825-(-0.23)));
        }
        else if (tickAnim >= 146 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 146) / 8) * (0-(0)));
            yy = 0.755 + (((tickAnim - 146) / 8) * (0-(0.755)));
            zz = -0.825 + (((tickAnim - 146) / 8) * (0-(-0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 57) {
            xx = -0.5 + (((tickAnim - 20) / 37) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 20) / 37) * (0-(0)));
            zz = -0.75 + (((tickAnim - 20) / 37) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 57 && tickAnim < 58) {
            xx = -0.5 + (((tickAnim - 57) / 1) * (-15.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-15-(-0.5)));
            yy = 0 + (((tickAnim - 57) / 1) * (0-(0)));
            zz = -0.75 + (((tickAnim - 57) / 1) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -15.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-15 + (((tickAnim - 58) / 22) * (-7.0144-(-15.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-15)));
            yy = 0 + (((tickAnim - 58) / 22) * (0.6184-(0)));
            zz = -0.75 + (((tickAnim - 58) / 22) * (-3.4296-(-0.75)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = -7.0144 + (((tickAnim - 80) / 55) * (-7.0144-(-7.0144)));
            yy = 0.6184 + (((tickAnim - 80) / 55) * (0.6184-(0.6184)));
            zz = -3.4296 + (((tickAnim - 80) / 55) * (-3.4296-(-3.4296)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = -7.0144 + (((tickAnim - 135) / 19) * (0-(-7.0144)));
            yy = 0.6184 + (((tickAnim - 135) / 19) * (0-(0.6184)));
            zz = -3.4296 + (((tickAnim - 135) / 19) * (0-(-3.4296)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3.0003-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.159-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.1929-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 57) {
            xx = 3.0003 + (((tickAnim - 20) / 37) * (3.0003-(3.0003)));
            yy = -0.159 + (((tickAnim - 20) / 37) * (-0.159-(-0.159)));
            zz = -0.1929 + (((tickAnim - 20) / 37) * (-0.1929-(-0.1929)));
        }
        else if (tickAnim >= 57 && tickAnim < 58) {
            xx = 3.0003 + (((tickAnim - 57) / 1) * (-21.8997-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-25-(3.0003)));
            yy = -0.159 + (((tickAnim - 57) / 1) * (-0.159-(-0.159)));
            zz = -0.1929 + (((tickAnim - 57) / 1) * (-0.1929-(-0.1929)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -21.8997-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-25 + (((tickAnim - 58) / 22) * (-7.7497-(-21.8997-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-25)));
            yy = -0.159 + (((tickAnim - 58) / 22) * (-0.159-(-0.159)));
            zz = -0.1929 + (((tickAnim - 58) / 22) * (-0.1929-(-0.1929)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = -7.7497 + (((tickAnim - 80) / 55) * (-7.7497-(-7.7497)));
            yy = -0.159 + (((tickAnim - 80) / 55) * (-0.159-(-0.159)));
            zz = -0.1929 + (((tickAnim - 80) / 55) * (-0.1929-(-0.1929)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = -7.7497 + (((tickAnim - 135) / 19) * (0-(-7.7497)));
            yy = -0.159 + (((tickAnim - 135) / 19) * (0-(-0.159)));
            zz = -0.1929 + (((tickAnim - 135) / 19) * (0-(-0.1929)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 58) {
            xx = -2.75 + (((tickAnim - 20) / 38) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 20) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 38) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -2.75 + (((tickAnim - 58) / 22) * (7.25-(-2.75)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = 7.25 + (((tickAnim - 80) / 55) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 80) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 55) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 7.25 + (((tickAnim - 135) / 19) * (0-(7.25)));
            yy = 0 + (((tickAnim - 135) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.678-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.9923-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.5756-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 2.678-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 20) / 15) * (-2.247-(2.678-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = -1.9923 + (((tickAnim - 20) / 15) * (-1.9923-(-1.9923)));
            zz = 1.5756 + (((tickAnim - 20) / 15) * (1.5756-(1.5756)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -2.247 + (((tickAnim - 35) / 15) * (-2.747-(-2.247)));
            yy = -1.9923 + (((tickAnim - 35) / 15) * (-1.9923-(-1.9923)));
            zz = 1.5756 + (((tickAnim - 35) / 15) * (1.5756-(1.5756)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -2.747 + (((tickAnim - 50) / 15) * (-2.247-(-2.747)));
            yy = -1.9923 + (((tickAnim - 50) / 15) * (-8.6173-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-8-(-1.9923)));
            zz = 1.5756 + (((tickAnim - 50) / 15) * (5.2256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8-(1.5756)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = -2.247 + (((tickAnim - 65) / 15) * (-2.5984-(-2.247)));
            yy = -8.6173-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-8 + (((tickAnim - 65) / 15) * (-4.9305-(-8.6173-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-8)));
            zz = 5.2256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8 + (((tickAnim - 65) / 15) * (5.704-(5.2256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8)));
        }
        else if (tickAnim >= 80 && tickAnim < 135) {
            xx = -2.5984 + (((tickAnim - 80) / 55) * (-2.5984-(-2.5984)));
            yy = -4.9305 + (((tickAnim - 80) / 55) * (-4.9305-(-4.9305)));
            zz = 5.704 + (((tickAnim - 80) / 55) * (5.704-(5.704)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = -2.5984 + (((tickAnim - 135) / 19) * (0-(-2.5984)));
            yy = -4.9305 + (((tickAnim - 135) / 19) * (0-(-4.9305)));
            zz = 5.704 + (((tickAnim - 135) / 19) * (0-(5.704)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.1072-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.9486-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2.7533-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 2.1072 + (((tickAnim - 20) / 15) * (1.5572-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-10-(2.1072)));
            yy = -2.9486 + (((tickAnim - 20) / 15) * (-2.9486-(-2.9486)));
            zz = 2.7533 + (((tickAnim - 20) / 15) * (2.7533-(2.7533)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 1.5572-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-10 + (((tickAnim - 35) / 14) * (5.3572-(1.5572-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-10)));
            yy = -2.9486 + (((tickAnim - 35) / 14) * (-2.9486-(-2.9486)));
            zz = 2.7533 + (((tickAnim - 35) / 14) * (2.7533-(2.7533)));
        }
        else if (tickAnim >= 49 && tickAnim < 51) {
            xx = 5.3572 + (((tickAnim - 49) / 2) * (32.7322-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*30-(5.3572)));
            yy = -2.9486 + (((tickAnim - 49) / 2) * (-2.9486-(-2.9486)));
            zz = 2.7533 + (((tickAnim - 49) / 2) * (2.7533-(2.7533)));
        }
        else if (tickAnim >= 51 && tickAnim < 80) {
            xx = 32.7322-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*30 + (((tickAnim - 51) / 29) * (14.4636-(32.7322-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*30)));
            yy = -2.9486 + (((tickAnim - 51) / 29) * (-8.3889-(-2.9486)));
            zz = 2.7533 + (((tickAnim - 51) / 29) * (-3.1398-(2.7533)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = 14.4636 + (((tickAnim - 80) / 7) * (17.6136-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-20-(14.4636)));
            yy = -8.3889 + (((tickAnim - 80) / 7) * (-8.3889-(-8.3889)));
            zz = -3.1398 + (((tickAnim - 80) / 7) * (-3.1398-(-3.1398)));
        }
        else if (tickAnim >= 87 && tickAnim < 93) {
            xx = 17.6136-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-20 + (((tickAnim - 87) / 6) * (14.0886-(17.6136-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-20)));
            yy = -8.3889 + (((tickAnim - 87) / 6) * (-8.3889-(-8.3889)));
            zz = -3.1398 + (((tickAnim - 87) / 6) * (-3.1398-(-3.1398)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 14.0886 + (((tickAnim - 93) / 7) * (27.0386-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-20-(14.0886)));
            yy = -8.3889 + (((tickAnim - 93) / 7) * (-8.3889-(-8.3889)));
            zz = -3.1398 + (((tickAnim - 93) / 7) * (-3.1398-(-3.1398)));
        }
        else if (tickAnim >= 100 && tickAnim < 107) {
            xx = 27.0386-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-20 + (((tickAnim - 100) / 7) * (14.4636-(27.0386-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-20)));
            yy = -8.3889 + (((tickAnim - 100) / 7) * (-8.3889-(-8.3889)));
            zz = -3.1398 + (((tickAnim - 100) / 7) * (-3.1398-(-3.1398)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = 14.4636 + (((tickAnim - 107) / 6) * (17.4636-(14.4636)));
            yy = -8.3889 + (((tickAnim - 107) / 6) * (-8.3889-(-8.3889)));
            zz = -3.1398 + (((tickAnim - 107) / 6) * (-3.1398-(-3.1398)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = 17.4636 + (((tickAnim - 113) / 22) * (17.4636-(17.4636)));
            yy = -8.3889 + (((tickAnim - 113) / 22) * (-8.3889-(-8.3889)));
            zz = -3.1398 + (((tickAnim - 113) / 22) * (-3.1398-(-3.1398)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 17.4636 + (((tickAnim - 135) / 19) * (0-(17.4636)));
            yy = -8.3889 + (((tickAnim - 135) / 19) * (0-(-8.3889)));
            zz = -3.1398 + (((tickAnim - 135) / 19) * (0-(-3.1398)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.1-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -0.1 + (((tickAnim - 20) / 30) * (-0.1-(-0.1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = -0.1 + (((tickAnim - 50) / 30) * (-0.1-(-0.1)));
            yy = 0 + (((tickAnim - 50) / 30) * (0.1-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (-0.225-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = -0.1 + (((tickAnim - 80) / 13) * (-0.1-(-0.1)));
            yy = 0.1 + (((tickAnim - 80) / 13) * (0.1-(0.1)));
            zz = -0.225 + (((tickAnim - 80) / 13) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 93 && tickAnim < 107) {
            xx = -0.1 + (((tickAnim - 93) / 14) * (-0.1-(-0.1)));
            yy = 0.1 + (((tickAnim - 93) / 14) * (0.1-(0.1)));
            zz = -0.225 + (((tickAnim - 93) / 14) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 107 && tickAnim < 135) {
            xx = -0.1 + (((tickAnim - 107) / 28) * (-0.1-(-0.1)));
            yy = 0.1 + (((tickAnim - 107) / 28) * (0.1-(0.1)));
            zz = -0.225 + (((tickAnim - 107) / 28) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = -0.1 + (((tickAnim - 135) / 19) * (0-(-0.1)));
            yy = 0.1 + (((tickAnim - 135) / 19) * (0-(0.1)));
            zz = -0.225 + (((tickAnim - 135) / 19) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.2887-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5.4924-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (3.014-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -0.2887 + (((tickAnim - 20) / 15) * (3.9613-(-0.2887)));
            yy = -5.4924 + (((tickAnim - 20) / 15) * (-5.4924-(-5.4924)));
            zz = 3.014 + (((tickAnim - 20) / 15) * (3.014-(3.014)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.9613 + (((tickAnim - 35) / 15) * (6.7113-(3.9613)));
            yy = -5.4924 + (((tickAnim - 35) / 15) * (-5.4924-(-5.4924)));
            zz = 3.014 + (((tickAnim - 35) / 15) * (3.014-(3.014)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 6.7113 + (((tickAnim - 50) / 30) * (12.6746-(6.7113)));
            yy = -5.4924 + (((tickAnim - 50) / 30) * (-11.2314-(-5.4924)));
            zz = 3.014 + (((tickAnim - 50) / 30) * (-0.7136-(3.014)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = 12.6746 + (((tickAnim - 80) / 7) * (9.9246-(12.6746)));
            yy = -11.2314 + (((tickAnim - 80) / 7) * (-11.2314-(-11.2314)));
            zz = -0.7136 + (((tickAnim - 80) / 7) * (-0.7136-(-0.7136)));
        }
        else if (tickAnim >= 87 && tickAnim < 93) {
            xx = 9.9246 + (((tickAnim - 87) / 6) * (12.6746-(9.9246)));
            yy = -11.2314 + (((tickAnim - 87) / 6) * (-11.2314-(-11.2314)));
            zz = -0.7136 + (((tickAnim - 87) / 6) * (-0.7136-(-0.7136)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 12.6746 + (((tickAnim - 93) / 7) * (9.9246-(12.6746)));
            yy = -11.2314 + (((tickAnim - 93) / 7) * (-11.2314-(-11.2314)));
            zz = -0.7136 + (((tickAnim - 93) / 7) * (-0.7136-(-0.7136)));
        }
        else if (tickAnim >= 100 && tickAnim < 107) {
            xx = 9.9246 + (((tickAnim - 100) / 7) * (12.6746-(9.9246)));
            yy = -11.2314 + (((tickAnim - 100) / 7) * (-11.2314-(-11.2314)));
            zz = -0.7136 + (((tickAnim - 100) / 7) * (-0.7136-(-0.7136)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = 12.6746 + (((tickAnim - 107) / 6) * (10.6746-(12.6746)));
            yy = -11.2314 + (((tickAnim - 107) / 6) * (-11.2314-(-11.2314)));
            zz = -0.7136 + (((tickAnim - 107) / 6) * (-0.7136-(-0.7136)));
        }
        else if (tickAnim >= 113 && tickAnim < 135) {
            xx = 10.6746 + (((tickAnim - 113) / 22) * (10.6746-(10.6746)));
            yy = -11.2314 + (((tickAnim - 113) / 22) * (-11.2314-(-11.2314)));
            zz = -0.7136 + (((tickAnim - 113) / 22) * (-0.7136-(-0.7136)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 10.6746 + (((tickAnim - 135) / 19) * (0-(10.6746)));
            yy = -11.2314 + (((tickAnim - 135) / 19) * (0-(-11.2314)));
            zz = -0.7136 + (((tickAnim - 135) / 19) * (0-(-0.7136)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 107 && tickAnim < 111) {
            xx = 1 + (((tickAnim - 107) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 107) / 4) * (-0.015-(1)));
            zz = 1 + (((tickAnim - 107) / 4) * (1-(1)));
        }
        else if (tickAnim >= 111 && tickAnim < 115) {
            xx = 1 + (((tickAnim - 111) / 4) * (1-(1)));
            yy = -0.015 + (((tickAnim - 111) / 4) * (1-(-0.015)));
            zz = 1 + (((tickAnim - 111) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHamadasuchus entity = (EntityPrehistoricFloraHamadasuchus) entitylivingbaseIn;
        int animCycle = 53;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 17) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*20 + (((tickAnim - 0) / 17) * (13.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*20-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*20)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 53) {
            xx = 13.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*20 + (((tickAnim - 17) / 36) * (0-(13.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*20)));
            yy = 0 + (((tickAnim - 17) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (10.77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 10.77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 7) / 10) * (7.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20-(10.77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 53) {
            xx = 7.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20 + (((tickAnim - 17) / 36) * (0-(7.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20)));
            yy = 0 + (((tickAnim - 17) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.725-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.075 + (((tickAnim - 13) / 4) * (0-(-0.075)));
            zz = 0.725 + (((tickAnim - 13) / 4) * (0.65-(0.725)));
        }
        else if (tickAnim >= 17 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 17) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 36) * (0-(0)));
            zz = 0.65 + (((tickAnim - 17) / 36) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (66.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 66.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120 + (((tickAnim - 7) / 6) * (0-(66.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 11) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*-0.05-(0)));
            zz = 0 + (((tickAnim - 17) / 11) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 28) / 25) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*-0.05 + (((tickAnim - 28) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*-0.05)));
            zz = 0 + (((tickAnim - 28) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);
       
    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHamadasuchus entity = (EntityPrehistoricFloraHamadasuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (36.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 36.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 7) / 8) * (0-(36.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-24.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -24.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80 + (((tickAnim - 7) / 2) * (-123.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*150-(-24.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -123.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*150 + (((tickAnim - 9) / 6) * (0-(-123.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*150)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.425-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0.425 + (((tickAnim - 7) / 2) * (0.425-(0.425)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0.425 + (((tickAnim - 9) / 6) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (41.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 41.25 + (((tickAnim - 7) / 2) * (0-(41.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(0);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(0);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(0);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHamadasuchus entity = (EntityPrehistoricFloraHamadasuchus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.8748-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.5169-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.7841-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0.8748 + (((tickAnim - 3) / 4) * (7.1875-(0.8748)));
            yy = 0.5169 + (((tickAnim - 3) / 4) * (0-(0.5169)));
            zz = 0.7841 + (((tickAnim - 3) / 4) * (-1.0625-(0.7841)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 7.1875 + (((tickAnim - 7) / 3) * (9.75-(7.1875)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = -1.0625 + (((tickAnim - 7) / 3) * (-4.25-(-1.0625)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 9.75 + (((tickAnim - 10) / 4) * (-9.4063-(9.75)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = -4.25 + (((tickAnim - 10) / 4) * (-3.7188-(-4.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -9.4063 + (((tickAnim - 14) / 7) * (-8.4063-(-9.4063)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = -3.7188 + (((tickAnim - 14) / 7) * (-3.7188-(-3.7188)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -8.4063 + (((tickAnim - 21) / 6) * (-13.3125-(-8.4063)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = -3.7188 + (((tickAnim - 21) / 6) * (-3.1875-(-3.7188)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = -13.3125 + (((tickAnim - 27) / 4) * (0-(-13.3125)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = -3.1875 + (((tickAnim - 27) / 4) * (0-(-3.1875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4.9689-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.5076-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-13.6432-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 4.9689 + (((tickAnim - 7) / 3) * (27-(4.9689)));
            yy = -0.5076 + (((tickAnim - 7) / 3) * (0-(-0.5076)));
            zz = -13.6432 + (((tickAnim - 7) / 3) * (-12.25-(-13.6432)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 27 + (((tickAnim - 10) / 4) * (-12.7269-(27)));
            yy = 0 + (((tickAnim - 10) / 4) * (0.772-(0)));
            zz = -12.25 + (((tickAnim - 10) / 4) * (3.4139-(-12.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -12.7269 + (((tickAnim - 14) / 4) * (1.5-(-12.7269)));
            yy = 0.772 + (((tickAnim - 14) / 4) * (0-(0.772)));
            zz = 3.4139 + (((tickAnim - 14) / 4) * (0-(3.4139)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 1.5 + (((tickAnim - 18) / 3) * (4-(1.5)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 4 + (((tickAnim - 21) / 3) * (-12.7269-(4)));
            yy = 0 + (((tickAnim - 21) / 3) * (0.772-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (3.4139-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -12.7269 + (((tickAnim - 24) / 4) * (7.5-(-12.7269)));
            yy = 0.772 + (((tickAnim - 24) / 4) * (0-(0.772)));
            zz = 3.4139 + (((tickAnim - 24) / 4) * (0-(3.4139)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 7.5 + (((tickAnim - 28) / 3) * (0-(7.5)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
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
            xx = 0 + (((tickAnim - 3) / 4) * (21-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 21 + (((tickAnim - 7) / 3) * (0-(21)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (22.5-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 22.5 + (((tickAnim - 14) / 4) * (0-(22.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (29.25-(0)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 29.25 + (((tickAnim - 24) / 4) * (0-(29.25)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
        

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHamadasuchus entity = (EntityPrehistoricFloraHamadasuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-4.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -4.75 + (((tickAnim - 10) / 10) * (0-(-4.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-4.75-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -4.75 + (((tickAnim - 30) / 10) * (0-(-4.75)));
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
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (46.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (22.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 46.75 + (((tickAnim - 10) / 10) * (0-(46.75)));
            yy = 22.25 + (((tickAnim - 10) / 10) * (0-(22.25)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (46.75-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (22.25-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 46.75 + (((tickAnim - 30) / 10) * (-16.75-(46.75)));
            yy = 22.25 + (((tickAnim - 30) / 10) * (0-(22.25)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -16.75 + (((tickAnim - 40) / 10) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.5858-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.0824-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (13.8509-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.5858 + (((tickAnim - 10) / 5) * (-36.5-(-0.5858)));
            yy = -3.0824 + (((tickAnim - 10) / 5) * (0-(-3.0824)));
            zz = 13.8509 + (((tickAnim - 10) / 5) * (0-(13.8509)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -36.5 + (((tickAnim - 15) / 5) * (0-(-36.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-0.5858-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-3.0824-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (13.8509-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -0.5858 + (((tickAnim - 30) / 5) * (-36.5-(-0.5858)));
            yy = -3.0824 + (((tickAnim - 30) / 5) * (0-(-3.0824)));
            zz = 13.8509 + (((tickAnim - 30) / 5) * (0-(13.8509)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -36.5 + (((tickAnim - 35) / 5) * (6.5-(-36.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 40) / 10) * (0-(6.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25.587-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 25.587 + (((tickAnim - 10) / 5) * (75.5-(25.587)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 75.5 + (((tickAnim - 15) / 5) * (0-(75.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (25.587-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 25.587 + (((tickAnim - 30) / 5) * (75.5-(25.587)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 75.5 + (((tickAnim - 35) / 5) * (12-(75.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 40) / 10) * (0-(12)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.525-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.95-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 15) / 5) * (0-(0.525)));
            zz = -0.95 + (((tickAnim - 15) / 5) * (0-(-0.95)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0.525-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-0.95-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 35) / 5) * (0-(0.525)));
            zz = -0.95 + (((tickAnim - 35) / 5) * (0-(-0.95)));
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
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (5.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 5.75 + (((tickAnim - 10) / 10) * (0-(5.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (5.75-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 5.75 + (((tickAnim - 30) / 10) * (0-(5.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.0579-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.5951-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.3343-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.0579 + (((tickAnim - 10) / 10) * (0-(-0.0579)));
            yy = 0.5951 + (((tickAnim - 10) / 10) * (0-(0.5951)));
            zz = -1.3343 + (((tickAnim - 10) / 10) * (0-(-1.3343)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-0.0579-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0.5951-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-1.3343-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -0.0579 + (((tickAnim - 30) / 10) * (0-(-0.0579)));
            yy = 0.5951 + (((tickAnim - 30) / 10) * (0-(0.5951)));
            zz = -1.3343 + (((tickAnim - 30) / 10) * (0-(-1.3343)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (4.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 4.75 + (((tickAnim - 10) / 10) * (0-(4.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (4.75-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 4.75 + (((tickAnim - 30) / 10) * (0-(4.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));
        
    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHamadasuchus entity = (EntityPrehistoricFloraHamadasuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -12.75 + (((tickAnim - 16) / 18) * (-12.75-(-12.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -12.75 + (((tickAnim - 34) / 16) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-3.5-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (1.325-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            yy = -3.5 + (((tickAnim - 16) / 18) * (-3.5-(-3.5)));
            zz = 1.325 + (((tickAnim - 16) / 18) * (1.325-(1.325)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = -3.5 + (((tickAnim - 34) / 16) * (0-(-3.5)));
            zz = 1.325 + (((tickAnim - 34) / 16) * (0-(1.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -17.75 + (((tickAnim - 16) / 18) * (-17.75-(-17.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -17.75 + (((tickAnim - 34) / 16) * (0-(-17.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (39.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 39.75 + (((tickAnim - 16) / 18) * (39.75-(39.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 39.75 + (((tickAnim - 34) / 16) * (0-(39.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -9.75 + (((tickAnim - 16) / 18) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -9.75 + (((tickAnim - 34) / 16) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0.275-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            yy = 0.55 + (((tickAnim - 16) / 18) * (0.55-(0.55)));
            zz = 0.275 + (((tickAnim - 16) / 18) * (0.275-(0.275)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0.55 + (((tickAnim - 34) / 16) * (0-(0.55)));
            zz = 0.275 + (((tickAnim - 34) / 16) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -17.75 + (((tickAnim - 16) / 18) * (-17.75-(-17.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -17.75 + (((tickAnim - 34) / 16) * (0-(-17.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (39.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 39.75 + (((tickAnim - 16) / 18) * (39.75-(39.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 39.75 + (((tickAnim - 34) / 16) * (0-(39.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -9.75 + (((tickAnim - 16) / 18) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -9.75 + (((tickAnim - 34) / 16) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0.275-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            yy = 0.55 + (((tickAnim - 16) / 18) * (0.55-(0.55)));
            zz = 0.275 + (((tickAnim - 16) / 18) * (0.275-(0.275)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0.55 + (((tickAnim - 34) / 16) * (0-(0.55)));
            zz = 0.275 + (((tickAnim - 34) / 16) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 11 + (((tickAnim - 16) / 18) * (11-(11)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 11 + (((tickAnim - 34) / 16) * (0-(11)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 4 + (((tickAnim - 16) / 18) * (4-(4)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 34) / 16) * (0-(4)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 6.5 + (((tickAnim - 16) / 18) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 34) / 16) * (0-(6.5)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -4.5 + (((tickAnim - 16) / 18) * (-4.5-(-4.5)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -4.5 + (((tickAnim - 34) / 16) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -29.75 + (((tickAnim - 16) / 18) * (-29.75-(-29.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -29.75 + (((tickAnim - 34) / 16) * (0-(-29.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (36.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 36.5 + (((tickAnim - 16) / 18) * (36.5-(36.5)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 36.5 + (((tickAnim - 34) / 16) * (0-(36.5)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-0.625-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = -0.625 + (((tickAnim - 16) / 18) * (-0.625-(-0.625)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = -0.625 + (((tickAnim - 34) / 16) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -4.5 + (((tickAnim - 16) / 18) * (-4.5-(-4.5)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -4.5 + (((tickAnim - 34) / 16) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -29.75 + (((tickAnim - 16) / 18) * (-29.75-(-29.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -29.75 + (((tickAnim - 34) / 16) * (0-(-29.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (36.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 36.5 + (((tickAnim - 16) / 18) * (36.5-(36.5)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 36.5 + (((tickAnim - 34) / 16) * (0-(36.5)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-0.625-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = -0.625 + (((tickAnim - 16) / 18) * (-0.625-(-0.625)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = -0.625 + (((tickAnim - 34) / 16) * (0-(-0.625)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 4 + (((tickAnim - 8) / 8) * (0-(4)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 25) / 9) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 34) / 16) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -6 + (((tickAnim - 8) / 8) * (0-(-6)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 25) / 9) * (6.5-(0)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 34) / 16) * (0-(6.5)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 7 + (((tickAnim - 8) / 8) * (0-(7)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
       
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHamadasuchus entity = (EntityPrehistoricFloraHamadasuchus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*1.5), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*1), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*1.3));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-80))*-0.3);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-20))*-0.3);



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 13.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 0) / 16) * (1.35-(13.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 1.35 + (((tickAnim - 16) / 14) * (13.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-70-(1.35)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 29.125 + (((tickAnim - 0) / 8) * (16.245-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*50-(29.125)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 16.245-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*50 + (((tickAnim - 8) / 8) * (-18.05-(16.245-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*50)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -18.05 + (((tickAnim - 16) / 14) * (-144.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-180-(-18.05)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 42.25 + (((tickAnim - 0) / 7) * (74.415-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(42.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 74.415-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 7) / 9) * (18-(74.415-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 18 + (((tickAnim - 16) / 2) * (3.2-(18)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 3.2 + (((tickAnim - 18) / 3) * (0.65-(3.2)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0.65 + (((tickAnim - 21) / 6) * (30.71-(0.65)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 30.71 + (((tickAnim - 27) / 3) * (42.25-(30.71)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.95 + (((tickAnim - 0) / 5) * (1.45-(0.95)));
            zz = 1 + (((tickAnim - 0) / 5) * (0.98-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 1.45 + (((tickAnim - 5) / 4) * (0.37-(1.45)));
            zz = 0.98 + (((tickAnim - 5) / 4) * (0.89-(0.98)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = 0.37 + (((tickAnim - 9) / 7) * (0.875-(0.37)));
            zz = 0.89 + (((tickAnim - 9) / 7) * (0.75-(0.89)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            yy = 0.875 + (((tickAnim - 16) / 5) * (0.33-(0.875)));
            zz = 0.75 + (((tickAnim - 16) / 5) * (0.74-(0.75)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            yy = 0.33 + (((tickAnim - 21) / 6) * (0.845-(0.33)));
            zz = 0.74 + (((tickAnim - 21) / 6) * (1.195-(0.74)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0.845 + (((tickAnim - 27) / 3) * (0.95-(0.845)));
            zz = 1.195 + (((tickAnim - 27) / 3) * (1-(1.195)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -6.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130 + (((tickAnim - 0) / 13) * (11.375-(-6.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 11.375 + (((tickAnim - 13) / 17) * (-70.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150-(11.375)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 0) / 13) * (27.35-(-6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 27.35 + (((tickAnim - 13) / 10) * (186.77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200-(27.35)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 186.77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200 + (((tickAnim - 23) / 7) * (-5.8-(186.77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.975 + (((tickAnim - 0) / 3) * (-2.17-(12.975)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -2.17 + (((tickAnim - 3) / 5) * (10.8-(-2.17)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 10.8 + (((tickAnim - 8) / 3) * (31-(10.8)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 31 + (((tickAnim - 11) / 2) * (39.62-(31)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 39.62 + (((tickAnim - 13) / 5) * (32.12-(39.62)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 32.12 + (((tickAnim - 18) / 6) * (145.79-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(32.12)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 145.79-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 24) / 4) * (9.34-(145.79-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 9.34 + (((tickAnim - 28) / 2) * (12.975-(9.34)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.195 + (((tickAnim - 0) / 3) * (-0.35-(0.195)));
            zz = 0.75 + (((tickAnim - 0) / 3) * (0.83-(0.75)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.35 + (((tickAnim - 3) / 5) * (0.01-(-0.35)));
            zz = 0.83 + (((tickAnim - 3) / 5) * (0.98-(0.83)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.01 + (((tickAnim - 8) / 3) * (0.275-(0.01)));
            zz = 0.98 + (((tickAnim - 8) / 3) * (1.25-(0.98)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.275 + (((tickAnim - 11) / 2) * (0.845-(0.275)));
            zz = 1.25 + (((tickAnim - 11) / 2) * (1.3-(1.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.845 + (((tickAnim - 13) / 5) * (1.15-(0.845)));
            zz = 1.3 + (((tickAnim - 13) / 5) * (1.39-(1.3)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 1.15 + (((tickAnim - 18) / 4) * (1.37-(1.15)));
            zz = 1.39 + (((tickAnim - 18) / 4) * (1.36-(1.39)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 1.37 + (((tickAnim - 22) / 2) * (0.74-(1.37)));
            zz = 1.36 + (((tickAnim - 22) / 2) * (1.08-(1.36)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 0.74 + (((tickAnim - 24) / 6) * (0.195-(0.74)));
            zz = 1.08 + (((tickAnim - 24) / 6) * (0.75-(1.08)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*-2), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*1.3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*-3), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*-6), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*6));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*-3), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*9), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*9));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*1), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*2), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-1), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*1.3));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*-1.8), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-1), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-1.3));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -29.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-60 + (((tickAnim - 0) / 15) * (28.175-(-29.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-60)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 28.175 + (((tickAnim - 15) / 8) * (123.4884-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(28.175)));
            yy = 0 + (((tickAnim - 15) / 8) * (0.8088-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (-46.1624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 123.4884-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 23) / 7) * (-29.75-(123.4884-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0.8088 + (((tickAnim - 23) / 7) * (0-(0.8088)));
            zz = -46.1624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 23) / 7) * (0-(-46.1624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 8.5 + (((tickAnim - 0) / 15) * (5.5-(8.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 5.5 + (((tickAnim - 15) / 8) * (-22.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150-(5.5)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -22.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150 + (((tickAnim - 23) / 7) * (8.5-(-22.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 22.25 + (((tickAnim - 0) / 6) * (-10.25-(22.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = -10.25 + (((tickAnim - 6) / 8) * (50.75-(-10.25)));
            yy = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 50.75 + (((tickAnim - 14) / 4) * (100.58-(50.75)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 100.58 + (((tickAnim - 18) / 5) * (96-(100.58)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 96 + (((tickAnim - 23) / 7) * (22.25-(96)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 3) * (0.53-(0.175)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.53 + (((tickAnim - 3) / 3) * (-0.05-(0.53)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            yy = -0.05 + (((tickAnim - 6) / 8) * (0.85-(-0.05)));
            zz = 0 + (((tickAnim - 6) / 8) * (-0.625-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.85 + (((tickAnim - 14) / 4) * (1.015-(0.85)));
            zz = -0.625 + (((tickAnim - 14) / 4) * (-1.46-(-0.625)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 1.015 + (((tickAnim - 18) / 5) * (0.51-(1.015)));
            zz = -1.46 + (((tickAnim - 18) / 5) * (-1.335-(-1.46)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.51 + (((tickAnim - 23) / 7) * (0.175-(0.51)));
            zz = -1.335 + (((tickAnim - 23) / 7) * (0-(-1.335)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 21.575 + (((tickAnim - 0) / 8) * (35.6384-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(21.575)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.8088-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-10.3374+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 35.6384-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 8) / 7) * (-29.75-(35.6384-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0.8088 + (((tickAnim - 8) / 7) * (0-(0.8088)));
            zz = -10.3374+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 8) / 7) * (0-(-10.3374+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -29.75 + (((tickAnim - 15) / 15) * (55.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*80-(-29.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 5.5 + (((tickAnim - 0) / 8) * (16.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100-(5.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 16.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100 + (((tickAnim - 8) / 7) * (8.5-(16.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 8.5 + (((tickAnim - 15) / 15) * (5.5-(8.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 50.75 + (((tickAnim - 0) / 3) * (100.58-(50.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 100.58 + (((tickAnim - 3) / 5) * (96-(100.58)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 96 + (((tickAnim - 8) / 7) * (22.25-(96)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 22.25 + (((tickAnim - 15) / 6) * (-9.42-(22.25)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -9.42 + (((tickAnim - 21) / 9) * (50.75-(-9.42)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.85 + (((tickAnim - 0) / 3) * (1.015-(0.85)));
            zz = -0.625 + (((tickAnim - 0) / 3) * (-1.46-(-0.625)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.015 + (((tickAnim - 3) / 5) * (0.51-(1.015)));
            zz = -1.46 + (((tickAnim - 3) / 5) * (-1.335-(-1.46)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.51 + (((tickAnim - 8) / 7) * (0.175-(0.51)));
            zz = -1.335 + (((tickAnim - 8) / 7) * (0-(-1.335)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 15) / 3) * (0.45-(0.175)));
            zz = 0 + (((tickAnim - 15) / 3) * (-0.1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.45 + (((tickAnim - 18) / 3) * (-0.01-(0.45)));
            zz = -0.1 + (((tickAnim - 18) / 3) * (-0.24-(-0.1)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = -0.01 + (((tickAnim - 21) / 9) * (0.85-(-0.01)));
            zz = -0.24 + (((tickAnim - 21) / 9) * (-0.625-(-0.24)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*2), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*1.5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-1.3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-180))*-2.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

        
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHamadasuchus entity = (EntityPrehistoricFloraHamadasuchus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+90))*9), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577))*-1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+90))*-1);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -31.8939 + (((tickAnim - 0) / 3) * (-15.6439-(-31.8939)));
            yy = -14.243 + (((tickAnim - 0) / 3) * (-14.243-(-14.243)));
            zz = -3.7008 + (((tickAnim - 0) / 3) * (-3.7008-(-3.7008)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -15.6439 + (((tickAnim - 3) / 5) * (28.5-(-15.6439)));
            yy = -14.243 + (((tickAnim - 3) / 5) * (0-(-14.243)));
            zz = -3.7008 + (((tickAnim - 3) / 5) * (0-(-3.7008)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 28.5 + (((tickAnim - 8) / 5) * (-31.8939-(28.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (-14.243-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-3.7008-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.5 + (((tickAnim - 0) / 3) * (-16.5-(12.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -16.5 + (((tickAnim - 3) / 5) * (22.5-(-16.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 22.5 + (((tickAnim - 8) / 1) * (41.75-(22.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 41.75 + (((tickAnim - 9) / 4) * (12.5-(41.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (33.2291-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.6974-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (3.43-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 33.2291 + (((tickAnim - 3) / 1) * (2.8375-(33.2291)));
            yy = -0.6974 + (((tickAnim - 3) / 1) * (-0.4184-(-0.6974)));
            zz = 3.43 + (((tickAnim - 3) / 1) * (2.058-(3.43)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 2.8375 + (((tickAnim - 4) / 4) * (36-(2.8375)));
            yy = -0.4184 + (((tickAnim - 4) / 4) * (0-(-0.4184)));
            zz = 2.058 + (((tickAnim - 4) / 4) * (0-(2.058)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 36 + (((tickAnim - 8) / 1) * (39.85-(36)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 39.85 + (((tickAnim - 9) / 4) * (0-(39.85)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.025 + (((tickAnim - 0) / 3) * (1.1-(-0.025)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.275-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.1 + (((tickAnim - 3) / 1) * (0.715-(1.1)));
            zz = 0.275 + (((tickAnim - 3) / 1) * (0.36-(0.275)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.715 + (((tickAnim - 4) / 1) * (0.215-(0.715)));
            zz = 0.36 + (((tickAnim - 4) / 1) * (0.925-(0.36)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.215 + (((tickAnim - 5) / 3) * (0.475-(0.215)));
            zz = 0.925 + (((tickAnim - 5) / 3) * (0.475-(0.925)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.475 + (((tickAnim - 8) / 1) * (0.655-(0.475)));
            zz = 0.475 + (((tickAnim - 8) / 1) * (0.965-(0.475)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.655 + (((tickAnim - 9) / 4) * (-0.025-(0.655)));
            zz = 0.965 + (((tickAnim - 9) / 4) * (0-(0.965)));
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
            xx = -31.8939 + (((tickAnim - 0) / 3) * (-15.6439-(-31.8939)));
            yy = 14.243 + (((tickAnim - 0) / 3) * (14.243-(14.243)));
            zz = 3.7008 + (((tickAnim - 0) / 3) * (3.7008-(3.7008)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -15.6439 + (((tickAnim - 3) / 5) * (28.5-(-15.6439)));
            yy = 14.243 + (((tickAnim - 3) / 5) * (0-(14.243)));
            zz = 3.7008 + (((tickAnim - 3) / 5) * (0-(3.7008)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 28.5 + (((tickAnim - 8) / 5) * (-31.8939-(28.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (14.243-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (3.7008-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.5 + (((tickAnim - 0) / 3) * (-16.5-(12.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -16.5 + (((tickAnim - 3) / 5) * (22.5-(-16.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 22.5 + (((tickAnim - 8) / 1) * (41.75-(22.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 41.75 + (((tickAnim - 9) / 4) * (12.5-(41.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (33.2291-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.6974-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-3.43-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 33.2291 + (((tickAnim - 3) / 1) * (2.8375-(33.2291)));
            yy = 0.6974 + (((tickAnim - 3) / 1) * (0.4184-(0.6974)));
            zz = -3.43 + (((tickAnim - 3) / 1) * (-2.058-(-3.43)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 2.8375 + (((tickAnim - 4) / 4) * (36-(2.8375)));
            yy = 0.4184 + (((tickAnim - 4) / 4) * (0-(0.4184)));
            zz = -2.058 + (((tickAnim - 4) / 4) * (0-(-2.058)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 36 + (((tickAnim - 8) / 1) * (39.85-(36)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 39.85 + (((tickAnim - 9) / 4) * (0-(39.85)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.025 + (((tickAnim - 0) / 3) * (1.1-(-0.025)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.275-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.1 + (((tickAnim - 3) / 1) * (0.715-(1.1)));
            zz = 0.275 + (((tickAnim - 3) / 1) * (0.36-(0.275)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.715 + (((tickAnim - 4) / 1) * (0.215-(0.715)));
            zz = 0.36 + (((tickAnim - 4) / 1) * (0.925-(0.36)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.215 + (((tickAnim - 5) / 3) * (0.475-(0.215)));
            zz = 0.925 + (((tickAnim - 5) / 3) * (0.475-(0.925)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.475 + (((tickAnim - 8) / 1) * (0.655-(0.475)));
            zz = 0.475 + (((tickAnim - 8) / 1) * (0.965-(0.475)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.655 + (((tickAnim - 9) / 4) * (-0.025-(0.655)));
            zz = 0.965 + (((tickAnim - 9) / 4) * (0-(0.965)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577))*9), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-50))*9), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-100))*9), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-150))*9), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-80))*-2), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+70))*-3), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+100))*-7), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.body3.rotationPointX = this.body3.rotationPointX + (float)(0);
        this.body3.rotationPointY = this.body3.rotationPointY - (float)(0);
        this.body3.rotationPointZ = this.body3.rotationPointZ + (float)(0.4);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 45.725 + (((tickAnim - 0) / 3) * (47.4381-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350-(45.725)));
            yy = 0 + (((tickAnim - 0) / 3) * (5.2029-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-19.3381-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 47.4381-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350 + (((tickAnim - 3) / 4) * (-126.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(47.4381-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350)));
            yy = 5.2029 + (((tickAnim - 3) / 4) * (0-(5.2029)));
            zz = -19.3381 + (((tickAnim - 3) / 4) * (0-(-19.3381)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -126.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 7) / 6) * (45.725-(-126.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -18.3868 + (((tickAnim - 0) / 3) * (-128.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-550-(-18.3868)));
            yy = 3.7035 + (((tickAnim - 0) / 3) * (0-(3.7035)));
            zz = 4.973 + (((tickAnim - 0) / 3) * (0-(4.973)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -128.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-550 + (((tickAnim - 3) / 4) * (7.5-(-128.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-550)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 7.5 + (((tickAnim - 7) / 6) * (-18.3868-(7.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (3.7035-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (4.973-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 134.25 + (((tickAnim - 0) / 3) * (122-(134.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 122 + (((tickAnim - 3) / 2) * (34.5-(122)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 34.5 + (((tickAnim - 5) / 2) * (18.75-(34.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 18.75 + (((tickAnim - 7) / 1) * (9.25-(18.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 9.25 + (((tickAnim - 8) / 1) * (21.25-(9.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 21.25 + (((tickAnim - 9) / 4) * (134.25-(21.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 3) * (-0.08-(-0.15)));
            zz = -1.725 + (((tickAnim - 0) / 3) * (-1.6-(-1.725)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.08 + (((tickAnim - 3) / 4) * (1.15-(-0.08)));
            zz = -1.6 + (((tickAnim - 3) / 4) * (0-(-1.6)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.15 + (((tickAnim - 7) / 1) * (-0.2-(1.15)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.43-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 1) * (0-(-0.2)));
            zz = -0.43 + (((tickAnim - 8) / 1) * (0-(-0.43)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (-1.725-(0)));
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
            xx = 27.5 + (((tickAnim - 0) / 3) * (47.2631-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450-(27.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-5.2029-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (19.3381-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 47.2631-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450 + (((tickAnim - 3) / 4) * (-69.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(47.2631-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450)));
            yy = -5.2029 + (((tickAnim - 3) / 4) * (0-(-5.2029)));
            zz = 19.3381 + (((tickAnim - 3) / 4) * (0-(19.3381)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -69.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 7) / 6) * (27.5-(-69.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -20.3274 + (((tickAnim - 0) / 3) * (-46-(-20.3274)));
            yy = -4.2128 + (((tickAnim - 0) / 3) * (0-(-4.2128)));
            zz = -5.8356 + (((tickAnim - 0) / 3) * (0-(-5.8356)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -46 + (((tickAnim - 3) / 4) * (7.5-(-46)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 7.5 + (((tickAnim - 7) / 6) * (-20.3274-(7.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (-4.2128-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (-5.8356-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 134.25 + (((tickAnim - 0) / 3) * (122-(134.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 122 + (((tickAnim - 3) / 4) * (18.75-(122)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 18.75 + (((tickAnim - 7) / 1) * (9.25-(18.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 9.25 + (((tickAnim - 8) / 1) * (21.25-(9.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 21.25 + (((tickAnim - 9) / 4) * (134.25-(21.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 3) * (-0.08-(-0.15)));
            zz = -1.725 + (((tickAnim - 0) / 3) * (-1.6-(-1.725)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.08 + (((tickAnim - 3) / 4) * (1.15-(-0.08)));
            zz = -1.6 + (((tickAnim - 3) / 4) * (0-(-1.6)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.15 + (((tickAnim - 7) / 1) * (-0.2-(1.15)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.43-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 1) * (0-(-0.2)));
            zz = -0.43 + (((tickAnim - 8) / 1) * (0-(-0.43)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (-1.725-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-5.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+150))*-7), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+250))*7), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+270))*-8), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.525);
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHamadasuchus e = (EntityPrehistoricFloraHamadasuchus) entity;

    }
}
