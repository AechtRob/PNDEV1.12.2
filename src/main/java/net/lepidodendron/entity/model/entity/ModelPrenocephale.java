package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPrenocephale;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPrenocephale extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer crest;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer crest2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r34;

    private ModelAnimator animator;

    public ModelPrenocephale() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 10.0F, -0.5F);
        this.main.cubeList.add(new ModelBox(main, 40, 36, -2.5F, -0.5F, -2.5F, 5, 7, 3, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.5F, 0.75F, -0.75F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.2182F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 38, -1.75F, -0.5F, -2.0F, 3, 7, 5, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.75F, 6.3993F, -1.6439F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7854F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 46, 0, -2.0F, 0.0F, 0.0F, 2, 6, 3, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 5.9293F, 2.9293F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7854F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 50, 47, -2.0F, 0.0F, -2.0F, 2, 4, 2, -0.01F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 3.1953F, -0.9567F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.2182F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 42, 22, -2.5F, 0.0F, -3.3F, 3, 1, 4, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.5F, 0.75F, -0.75F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2182F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 38, -1.25F, -0.5F, -2.0F, 3, 7, 5, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.75F, 6.3993F, -1.6439F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7854F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 46, 0, 0.0F, 0.0F, 0.0F, 2, 6, 3, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 5.9293F, 2.9293F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7854F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 50, 47, 0.0F, 0.0F, -2.0F, 2, 4, 2, -0.01F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 3.1953F, -0.9567F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.2182F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 42, 22, -0.5F, 0.0F, -3.3F, 3, 1, 4, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.45F, -1.875F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 13, -2.5F, -0.0436F, -4.9991F, 5, 7, 5, -0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.0436F, -4.9991F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.2182F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 21, 25, -2.0F, 0.0F, -6.0F, 4, 4, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, 4.0F, -6.0F);
        this.body2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.48F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 36, -0.5F, -3.0F, 0.0F, 4, 3, 6, -0.003F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.1185F, 3.2376F, -4.76F);
        this.body2.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.546F, 0.1623F, -0.2599F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 22, 52, -1.5F, -0.5F, -1.0F, 2, 3, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.25F, 1.9797F, 0.0395F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.3526F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 57, 0, -0.5F, 0.0F, -1.0F, 1, 3, 2, 0.003F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.5F, 3.0F, 0.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, 0.0F, 0.48F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 57, 22, -1.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.1185F, 3.2376F, -4.76F);
        this.body2.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.546F, -0.1623F, 0.2599F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 22, 52, -0.5F, -0.5F, -1.0F, 2, 3, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.25F, 1.9797F, 0.0395F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.3526F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 57, 0, -0.5F, 0.0F, -1.0F, 1, 3, 2, 0.003F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.5F, 3.0F, 0.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.0F, -0.48F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 57, 22, 0.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.9011F, -4.9581F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.7723F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 42, 28, -1.5F, -1.5127F, -1.8316F, 3, 3, 3, -0.003F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.4162F, -1.1926F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.3054F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 28, 46, -1.5F, -1.0F, -2.0F, 3, 3, 2, -0.006F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.5236F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 17, 46, -1.5F, 0.0F, -2.0F, 3, 3, 2, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.1558F, -1.6627F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.3054F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 40, 52, -0.5F, 1.0F, -5.0F, 1, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 39, 47, -1.5F, 0.0F, -2.0F, 3, 2, 2, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, 1.5F, -2.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.5323F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 57, 6, 0.0F, -1.5F, -2.0F, 1, 2, 2, 0.003F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.5F, 1.5F, -2.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.5323F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 57, 6, -1.0F, -1.5F, -2.0F, 1, 2, 2, 0.006F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -1.9345F, -0.3024F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.5498F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 52, -0.5F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.7576F, -3.7693F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.0472F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 57, 37, -0.5F, 0.0F, -2.0F, 1, 1, 2, -0.006F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -2.1088F, -2.2948F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.7418F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 56, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.8262F, -1.4031F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 51, -1.5F, -1.2F, -1.0F, 3, 2, 2, -0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 57, 33, -0.5F, -0.025F, -1.0F, 1, 1, 2, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.4F, 1.75F, -3.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 58, 54, 0.0F, -0.5F, -1.3F, 0, 1, 2, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 58, 54, 0.8F, -0.5F, -1.3F, 0, 1, 2, 0.0F, false));

        this.crest = new AdvancedModelRenderer(this);
        this.crest.setRotationPoint(0.7122F, -0.3721F, -0.688F);
        this.head.addChild(crest);
        this.setRotateAngle(crest, 0.0F, 0.0F, 0.096F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.6624F, 0.0577F, -2.9868F);
        this.crest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3933F, 0.5527F, 0.2371F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 57, 41, -2.0F, -0.075F, -0.2F, 2, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5639F, 0.1356F, -3.1112F);
        this.crest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.8275F, 0.3545F, 0.2478F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 31, 57, -1.0F, 0.025F, -1.75F, 1, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.6054F, 0.1317F, -0.047F);
        this.crest.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1498F, 0.3054F, 0.1578F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 55, 28, -0.25F, -0.7F, -2.075F, 1, 1, 3, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.9033F, -0.1092F, 1.2062F);
        this.crest.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1889F, -1.4192F, 0.1737F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 23, 58, -1.5F, -0.525F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5444F, -0.1845F, 0.552F);
        this.crest.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0313F, -0.5639F, 0.1059F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 58, -1.0F, -0.5F, -0.225F, 2, 1, 1, -0.01F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 57, 44, -1.0F, -0.5F, -0.625F, 2, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.6915F, -0.1143F, 1.2222F);
        this.crest.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -2.1411F, -1.4976F, 2.2121F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 51, 10, -0.3F, 0.0F, -0.625F, 1, 0, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.2915F, -0.1143F, 1.3722F);
        this.crest.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -2.9821F, -1.0455F, 3.0513F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 46, 10, -0.275F, 0.0F, -0.725F, 1, 0, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.2415F, -0.1143F, 0.2722F);
        this.crest.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0602F, -0.4358F, 0.0499F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 59, 11, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0665F, -0.1143F, 0.8472F);
        this.crest.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1199F, -1.348F, 0.2061F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 56, -0.35F, 0.0F, -0.625F, 1, 0, 1, 0.0F, false));

        this.crest2 = new AdvancedModelRenderer(this);
        this.crest2.setRotationPoint(-0.7122F, -0.3721F, -0.688F);
        this.head.addChild(crest2);
        this.setRotateAngle(crest2, 0.0F, 0.0F, -0.096F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.6624F, 0.0577F, -2.9868F);
        this.crest2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3933F, -0.5527F, -0.2371F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 57, 41, 0.0F, -0.075F, -0.2F, 2, 1, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5639F, 0.1356F, -3.1112F);
        this.crest2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.8275F, -0.3545F, -0.2478F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 31, 57, 0.0F, 0.025F, -1.75F, 1, 1, 2, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.6054F, 0.1317F, -0.047F);
        this.crest2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1498F, -0.3054F, -0.1578F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 55, 28, -0.75F, -0.7F, -2.075F, 1, 1, 3, -0.01F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.9033F, -0.1092F, 1.2062F);
        this.crest2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1889F, 1.4192F, -0.1737F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 23, 58, -0.5F, -0.525F, 0.0F, 2, 1, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5444F, -0.1845F, 0.552F);
        this.crest2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0313F, 0.5639F, -0.1059F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 16, 58, -1.0F, -0.5F, -0.225F, 2, 1, 1, -0.01F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 57, 44, -1.0F, -0.5F, -0.625F, 2, 1, 1, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.6915F, -0.1143F, 1.2222F);
        this.crest2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -2.1411F, 1.4976F, -2.2121F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 51, 10, -0.7F, 0.0F, -0.625F, 1, 0, 1, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.2915F, -0.1143F, 1.3722F);
        this.crest2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -2.9821F, 1.0455F, -3.0513F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 46, 10, -0.725F, 0.0F, -0.725F, 1, 0, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.2415F, -0.1143F, 0.2722F);
        this.crest2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0602F, 0.4358F, -0.0499F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 59, 11, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0665F, -0.1143F, 0.8472F);
        this.crest2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1199F, 1.348F, -0.2061F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 16, 56, -0.65F, 0.0F, -0.625F, 1, 0, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.0353F, 2.0011F, -1.0235F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 49, 54, -0.4647F, -0.0011F, -3.9765F, 1, 1, 3, -0.006F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 45, 57, 0.3853F, -0.3011F, -3.2765F, 0, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 45, 57, -0.3147F, -0.3011F, -3.2765F, 0, 1, 1, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 11, 52, -1.4647F, -0.0011F, -0.9765F, 3, 1, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5035F, -0.0011F, -2.4931F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.336F, -0.33F, 0.1168F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 9, 56, 0.0F, -1.775F, -0.325F, 0, 2, 3, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5742F, -0.0011F, -2.4931F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.336F, 0.33F, -0.1168F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 9, 56, 0.0F, -1.775F, -0.325F, 0, 2, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.4647F, -0.5011F, -0.9765F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.5323F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 38, 57, 0.0F, 0.5F, -2.0F, 1, 1, 2, 0.006F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.5353F, -0.5011F, -0.9765F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.5323F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 38, 57, -1.0F, 0.5F, -2.0F, 1, 1, 2, 0.003F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.head.addChild(eye);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.7206F, -0.1344F, 0.2679F);
        this.eye.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.2182F, 0.5323F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 58, 58, -0.5F, -0.425F, -0.45F, 1, 1, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.7206F, -0.1344F, 0.2679F);
        this.eye.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2182F, -0.5323F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 58, 58, -0.5F, -0.425F, -0.45F, 1, 1, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.2618F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 26, -2.0F, 0.0F, 0.0F, 4, 6, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1F, 4.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 42, 12, -1.5F, 0.0F, 0.0F, 3, 4, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 21, 13, -1.0F, 0.1F, 0.0F, 2, 3, 8, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1F, 7.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 25, 0, -0.5F, 0.1F, 0.0F, 1, 2, 9, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, 1.2F, 0.0F);
        this.tail5.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0436F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 11, -0.01F, false));


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
        this.main.offsetY = 0.1F;
        this.main.offsetX = 0.1F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(225);
        this.main.rotateAngleX = (float)Math.toRadians(14);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 0.6F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.054F;
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

        EntityPrehistoricFloraPrenocephale EntityPrenocephale = (EntityPrehistoricFloraPrenocephale) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftArm3};
        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightArm3};

        EntityPrenocephale.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityPrenocephale.getAnimation() == EntityPrenocephale.LAY_ANIMATION) {
            //this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            //this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityPrenocephale.isReallyInWater()) {

                if (f3 == 0.0F || !EntityPrenocephale.getIsMoving()) {
                    if (EntityPrenocephale.getAnimation() != EntityPrenocephale.EAT_ANIMATION
                        && EntityPrenocephale.getAnimation() != EntityPrenocephale.DRINK_ANIMATION) {
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

                if (EntityPrenocephale.getIsFast()) { //Running


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
        EntityPrehistoricFloraPrenocephale ee = (EntityPrehistoricFloraPrenocephale) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) { //The noise anim
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPrenocephale entity = (EntityPrehistoricFloraPrenocephale) entitylivingbaseIn;
        int animCycle = 79;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-23.15028-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (4.14273-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0.94664-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -23.15028 + (((tickAnim - 16) / 7) * (19.75-(-23.15028)));
            yy = 4.14273 + (((tickAnim - 16) / 7) * (0-(4.14273)));
            zz = 0.94664 + (((tickAnim - 16) / 7) * (0-(0.94664)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 19.75 + (((tickAnim - 23) / 0) * (19.31321-(19.75)));
            yy = 0 + (((tickAnim - 23) / 0) * (2.74545-(0)));
            zz = 0 + (((tickAnim - 23) / 0) * (-7.78276-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 19.31321 + (((tickAnim - 23) / 1) * (19.25-(19.31321)));
            yy = 2.74545 + (((tickAnim - 23) / 1) * (0-(2.74545)));
            zz = -7.78276 + (((tickAnim - 23) / 1) * (0-(-7.78276)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 19.25 + (((tickAnim - 24) / 12) * (-7.16013-(19.25)));
            yy = 0 + (((tickAnim - 24) / 12) * (15.40949-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (1.28552-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = -7.16013 + (((tickAnim - 36) / 12) * (-7.16013-(-7.16013)));
            yy = 15.40949 + (((tickAnim - 36) / 12) * (15.40949-(15.40949)));
            zz = 1.28552 + (((tickAnim - 36) / 12) * (1.28552-(1.28552)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -7.16013 + (((tickAnim - 48) / 7) * (-6.08631-(-7.16013)));
            yy = 15.40949 + (((tickAnim - 48) / 7) * (11.84838-(15.40949)));
            zz = 1.28552 + (((tickAnim - 48) / 7) * (-1.28041-(1.28552)));
        }
        else if (tickAnim >= 55 && tickAnim < 68) {
            xx = -6.08631 + (((tickAnim - 55) / 13) * (-2.55696-(-6.08631)));
            yy = 11.84838 + (((tickAnim - 55) / 13) * (5.89973-(11.84838)));
            zz = -1.28041 + (((tickAnim - 55) / 13) * (3.14691-(-1.28041)));
        }
        else if (tickAnim >= 68 && tickAnim < 79) {
            xx = -2.55696 + (((tickAnim - 68) / 11) * (0-(-2.55696)));
            yy = 5.89973 + (((tickAnim - 68) / 11) * (0-(5.89973)));
            zz = 3.14691 + (((tickAnim - 68) / 11) * (0-(3.14691)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-1.425-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = -1.425 + (((tickAnim - 16) / 7) * (-17.85-(-1.425)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = -17.85 + (((tickAnim - 23) / 0) * (-18.765-(-17.85)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = -18.765 + (((tickAnim - 23) / 1) * (-19.1-(-18.765)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            zz = -19.1 + (((tickAnim - 24) / 12) * (-12.425-(-19.1)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            zz = -12.425 + (((tickAnim - 36) / 12) * (-12.3-(-12.425)));
        }
        else if (tickAnim >= 48 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 48) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 31) * (0-(0)));
            zz = -12.3 + (((tickAnim - 48) / 31) * (0-(-12.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -5.5 + (((tickAnim - 11) / 5) * (0.75-(-5.5)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0.75 + (((tickAnim - 16) / 3) * (13.5-(0.75)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 13.5 + (((tickAnim - 19) / 4) * (-16.5-(13.5)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = -16.5 + (((tickAnim - 23) / 0) * (-19.74661-(-16.5)));
            yy = 0 + (((tickAnim - 23) / 0) * (4.28845-(0)));
            zz = 0 + (((tickAnim - 23) / 0) * (6.75978-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -19.74661 + (((tickAnim - 23) / 2) * (-17-(-19.74661)));
            yy = 4.28845 + (((tickAnim - 23) / 2) * (0-(4.28845)));
            zz = 6.75978 + (((tickAnim - 23) / 2) * (0-(6.75978)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = -17 + (((tickAnim - 25) / 6) * (-15.69-(-17)));
            yy = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = -15.69 + (((tickAnim - 31) / 5) * (0-(-15.69)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 12) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 48) / 10) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 48) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 10) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 69) {
            xx = -18.25 + (((tickAnim - 58) / 11) * (39.25-(-18.25)));
            yy = 0 + (((tickAnim - 58) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 11) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 79) {
            xx = 39.25 + (((tickAnim - 69) / 10) * (0-(39.25)));
            yy = 0 + (((tickAnim - 69) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -13.5 + (((tickAnim - 11) / 5) * (-3.25-(-13.5)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -3.25 + (((tickAnim - 16) / 3) * (36.33-(-3.25)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 36.33 + (((tickAnim - 19) / 4) * (0-(36.33)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (23.8-(0)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 23.8 + (((tickAnim - 29) / 2) * (26.73-(23.8)));
            yy = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 2) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 26.73 + (((tickAnim - 31) / 5) * (0-(26.73)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 12) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 48) / 10) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 48) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 10) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = -13.75 + (((tickAnim - 58) / 5) * (37.13-(-13.75)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 69) {
            xx = 37.13 + (((tickAnim - 63) / 6) * (-6-(37.13)));
            yy = 0 + (((tickAnim - 63) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 6) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 79) {
            xx = -6 + (((tickAnim - 69) / 10) * (0-(-6)));
            yy = 0 + (((tickAnim - 69) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-37.59-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = -37.59 + (((tickAnim - 4) / 7) * (9.75-(-37.59)));
            yy = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 9.75 + (((tickAnim - 11) / 5) * (18.25-(9.75)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 18.25 + (((tickAnim - 16) / 3) * (18.25-(18.25)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 18.25 + (((tickAnim - 19) / 2) * (-35.88-(18.25)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -35.88 + (((tickAnim - 21) / 2) * (0-(-35.88)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (-29.39-(0)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = -29.39 + (((tickAnim - 29) / 2) * (-33.22-(-29.39)));
            yy = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 2) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = -33.22 + (((tickAnim - 31) / 5) * (0-(-33.22)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 12) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 48) / 10) * (10.75-(0)));
            yy = 0 + (((tickAnim - 48) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 10) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 10.75 + (((tickAnim - 58) / 5) * (-20.25-(10.75)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 79) {
            xx = -20.25 + (((tickAnim - 63) / 16) * (0-(-20.25)));
            yy = 0 + (((tickAnim - 63) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (77.78-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 77.78 + (((tickAnim - 4) / 7) * (24.75-(77.78)));
            yy = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 24.75 + (((tickAnim - 11) / 5) * (7.5-(24.75)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 7.5 + (((tickAnim - 16) / 3) * (57.25-(7.5)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 57.25 + (((tickAnim - 19) / 2) * (90.93-(57.25)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 90.93 + (((tickAnim - 21) / 2) * (-3.75-(90.93)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -3.75 + (((tickAnim - 23) / 2) * (-0.75-(-3.75)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -0.75 + (((tickAnim - 25) / 4) * (100.25-(-0.75)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 100.25 + (((tickAnim - 29) / 2) * (92.1-(100.25)));
            yy = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 2) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 92.1 + (((tickAnim - 31) / 5) * (8-(92.1)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 8 + (((tickAnim - 36) / 12) * (8-(8)));
            yy = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 12) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 8 + (((tickAnim - 48) / 10) * (28-(8)));
            yy = 0 + (((tickAnim - 48) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 10) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 28 + (((tickAnim - 58) / 5) * (93.75-(28)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 69) {
            xx = 93.75 + (((tickAnim - 63) / 6) * (68.5-(93.75)));
            yy = 0 + (((tickAnim - 63) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 6) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 74) {
            xx = 68.5 + (((tickAnim - 69) / 5) * (7.31-(68.5)));
            yy = 0 + (((tickAnim - 69) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 5) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 79) {
            xx = 7.31 + (((tickAnim - 74) / 5) * (0-(7.31)));
            yy = 0 + (((tickAnim - 74) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.18-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.45-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = 0.18 + (((tickAnim - 4) / 7) * (-0.175-(0.18)));
            zz = -0.45 + (((tickAnim - 4) / 7) * (0-(-0.45)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 11) / 8) * (0-(0)));
            yy = -0.175 + (((tickAnim - 11) / 8) * (-0.17-(-0.175)));
            zz = 0 + (((tickAnim - 11) / 8) * (-0.425-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = -0.17 + (((tickAnim - 19) / 2) * (0.195-(-0.17)));
            zz = -0.425 + (((tickAnim - 19) / 2) * (-0.61-(-0.425)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0.195 + (((tickAnim - 21) / 2) * (0-(0.195)));
            zz = -0.61 + (((tickAnim - 21) / 2) * (0-(-0.61)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 12) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 48) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 10) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 58) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 3) * (1.25-(0)));
            zz = 0 + (((tickAnim - 58) / 3) * (-0.13-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 61) / 8) * (0-(0)));
            yy = 1.25 + (((tickAnim - 61) / 8) * (-0.6-(1.25)));
            zz = -0.13 + (((tickAnim - 61) / 8) * (-0.55-(-0.13)));
        }
        else if (tickAnim >= 69 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 69) / 5) * (0-(0)));
            yy = -0.6 + (((tickAnim - 69) / 5) * (-0.755-(-0.6)));
            zz = -0.55 + (((tickAnim - 69) / 5) * (-0.31-(-0.55)));
        }
        else if (tickAnim >= 74 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 74) / 5) * (0-(0)));
            yy = -0.755 + (((tickAnim - 74) / 5) * (0-(-0.755)));
            zz = -0.31 + (((tickAnim - 74) / 5) * (0-(-0.31)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 24.5 + (((tickAnim - 11) / 5) * (37.4864-(24.5)));
            yy = 0 + (((tickAnim - 11) / 5) * (0.73236-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (-2.12753-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 37.4864 + (((tickAnim - 16) / 7) * (-19.75-(37.4864)));
            yy = 0.73236 + (((tickAnim - 16) / 7) * (0-(0.73236)));
            zz = -2.12753 + (((tickAnim - 16) / 7) * (0-(-2.12753)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = -19.75 + (((tickAnim - 23) / 0) * (-18.09701-(-19.75)));
            yy = 0 + (((tickAnim - 23) / 0) * (4.35011-(0)));
            zz = 0 + (((tickAnim - 23) / 0) * (7.30954-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = -18.09701 + (((tickAnim - 23) / 1) * (-17-(-18.09701)));
            yy = 4.35011 + (((tickAnim - 23) / 1) * (0-(4.35011)));
            zz = 7.30954 + (((tickAnim - 23) / 1) * (0-(7.30954)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = -17 + (((tickAnim - 24) / 12) * (-12.08012-(-17)));
            yy = 0 + (((tickAnim - 24) / 12) * (-10.62083-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (-3.86687-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 47) {
            xx = -12.08012 + (((tickAnim - 36) / 11) * (-13.58012-(-12.08012)));
            yy = -10.62083 + (((tickAnim - 36) / 11) * (-10.62083-(-10.62083)));
            zz = -3.86687 + (((tickAnim - 36) / 11) * (-3.86687-(-3.86687)));
        }
        else if (tickAnim >= 47 && tickAnim < 57) {
            xx = -13.58012 + (((tickAnim - 47) / 10) * (29.75-(-13.58012)));
            yy = -10.62083 + (((tickAnim - 47) / 10) * (0-(-10.62083)));
            zz = -3.86687 + (((tickAnim - 47) / 10) * (0-(-3.86687)));
        }
        else if (tickAnim >= 57 && tickAnim < 66) {
            xx = 29.75 + (((tickAnim - 57) / 9) * (22.45-(29.75)));
            yy = 0 + (((tickAnim - 57) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 9) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 79) {
            xx = 22.45 + (((tickAnim - 66) / 13) * (0-(22.45)));
            yy = 0 + (((tickAnim - 66) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -4.25 + (((tickAnim - 11) / 5) * (-7-(-4.25)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -7 + (((tickAnim - 16) / 2) * (32.31-(-7)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 32.31 + (((tickAnim - 18) / 5) * (0-(32.31)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 24) / 12) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 47) {
            xx = -19.25 + (((tickAnim - 36) / 11) * (-19.25-(-19.25)));
            yy = 0 + (((tickAnim - 36) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 11) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = -19.25 + (((tickAnim - 47) / 6) * (30.97-(-19.25)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 30.97 + (((tickAnim - 53) / 4) * (0.5-(30.97)));
            yy = 0 + (((tickAnim - 53) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 4) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 66) {
            xx = 0.5 + (((tickAnim - 57) / 9) * (0-(0.5)));
            yy = 0 + (((tickAnim - 57) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 9) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 66) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 0) / 57) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 57) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 57) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 9) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 57) / 9) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 66) / 13) * (0-(0)));
            yy = -0.425 + (((tickAnim - 66) / 13) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 66) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (6.25-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 6.25 + (((tickAnim - 18) / 3) * (-36-(6.25)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -36 + (((tickAnim - 21) / 2) * (0-(-36)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 24) / 12) * (14.5-(0)));
            yy = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 47) {
            xx = 14.5 + (((tickAnim - 36) / 11) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 36) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 11) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 14.5 + (((tickAnim - 47) / 3) * (-21.93-(14.5)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -21.93 + (((tickAnim - 50) / 3) * (-18.86-(-21.93)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = -18.86 + (((tickAnim - 53) / 4) * (23.75-(-18.86)));
            yy = 0 + (((tickAnim - 53) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 4) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 66) {
            xx = 23.75 + (((tickAnim - 57) / 9) * (13.5-(23.75)));
            yy = 0 + (((tickAnim - 57) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 9) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 79) {
            xx = 13.5 + (((tickAnim - 66) / 13) * (0-(13.5)));
            yy = 0 + (((tickAnim - 66) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 0) / 57) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 57) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 57) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 9) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 57) / 9) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 66) / 13) * (0-(0)));
            yy = -0.125 + (((tickAnim - 66) / 13) * (0-(-0.125)));
            zz = 0 + (((tickAnim - 66) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -2.25 + (((tickAnim - 16) / 2) * (90.56-(-2.25)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 90.56 + (((tickAnim - 18) / 5) * (-1-(90.56)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = -1 + (((tickAnim - 23) / 1) * (-1-(-1)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = -1 + (((tickAnim - 24) / 12) * (27-(-1)));
            yy = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 47) {
            xx = 27 + (((tickAnim - 36) / 11) * (27-(27)));
            yy = 0 + (((tickAnim - 36) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 11) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 27 + (((tickAnim - 47) / 6) * (65.5-(27)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 65.5 + (((tickAnim - 53) / 4) * (31.5-(65.5)));
            yy = 0 + (((tickAnim - 53) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 4) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 66) {
            xx = 31.5 + (((tickAnim - 57) / 9) * (-34.39-(31.5)));
            yy = 0 + (((tickAnim - 57) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 9) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 79) {
            xx = -34.39 + (((tickAnim - 66) / 13) * (0-(-34.39)));
            yy = 0 + (((tickAnim - 66) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = -0.425 + (((tickAnim - 16) / 2) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 16) / 2) * (-0.475-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = -0.475 + (((tickAnim - 18) / 6) * (0-(-0.475)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 6) * (0.675-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0.675 + (((tickAnim - 30) / 6) * (0-(0.675)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 36) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 11) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 3) * (1.11-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (-0.24-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            yy = 1.11 + (((tickAnim - 50) / 3) * (0.21-(1.11)));
            zz = -0.24 + (((tickAnim - 50) / 3) * (-0.47-(-0.24)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 53) / 4) * (0-(0)));
            yy = 0.21 + (((tickAnim - 53) / 4) * (0.375-(0.21)));
            zz = -0.47 + (((tickAnim - 53) / 4) * (-0.045-(-0.47)));
        }
        else if (tickAnim >= 57 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 57) / 9) * (0-(0)));
            yy = 0.375 + (((tickAnim - 57) / 9) * (-0.825-(0.375)));
            zz = -0.045 + (((tickAnim - 57) / 9) * (-0.03-(-0.045)));
        }
        else if (tickAnim >= 66 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 66) / 13) * (0-(0)));
            yy = -0.825 + (((tickAnim - 66) / 13) * (0-(-0.825)));
            zz = -0.03 + (((tickAnim - 66) / 13) * (0-(-0.03)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0.75-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0.75 + (((tickAnim - 23) / 2) * (0-(0.75)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 25) / 11) * (-0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(0)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 47) {
            xx = -0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 36) / 11) * (-2.5-(-0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0 + (((tickAnim - 36) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 11) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 79) {
            xx = -2.5 + (((tickAnim - 47) / 32) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 47) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (-0.485-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = -0.485 + (((tickAnim - 23) / 2) * (0.3-(-0.485)));
        }
        else if (tickAnim >= 25 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 25) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 54) * (0-(0)));
            zz = 0.3 + (((tickAnim - 25) / 54) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 0) * (-2.75-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = -2.75 + (((tickAnim - 23) / 1) * (0-(-2.75)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 24) / 12) * (-5-(0)));
            yy = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 79) {
            xx = -5 + (((tickAnim - 36) / 43) * (0-(-5)));
            yy = 0 + (((tickAnim - 36) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0.025 + (((tickAnim - 23) / 1) * (0-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -9 + (((tickAnim - 16) / 5) * (26-(-9)));
            yy = -4.5 + (((tickAnim - 16) / 5) * (-4.5-(-4.5)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 26 + (((tickAnim - 21) / 2) * (18-(26)));
            yy = -4.5 + (((tickAnim - 21) / 2) * (-4.5-(-4.5)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 18 + (((tickAnim - 23) / 0) * (13.64155-(18)));
            yy = -4.5 + (((tickAnim - 23) / 0) * (0.2584-(-4.5)));
            zz = 0 + (((tickAnim - 23) / 0) * (7.75979-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 13.64155 + (((tickAnim - 23) / 1) * (5.75-(13.64155)));
            yy = 0.2584 + (((tickAnim - 23) / 1) * (-3.9375-(0.2584)));
            zz = 7.75979 + (((tickAnim - 23) / 1) * (0-(7.75979)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 5.75 + (((tickAnim - 24) / 12) * (-0.2801-(5.75)));
            yy = -3.9375 + (((tickAnim - 24) / 12) * (-5.72132-(-3.9375)));
            zz = 0 + (((tickAnim - 24) / 12) * (1.10098-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 79) {
            xx = -0.2801 + (((tickAnim - 36) / 43) * (0-(-0.2801)));
            yy = -5.72132 + (((tickAnim - 36) / 43) * (0-(-5.72132)));
            zz = 1.10098 + (((tickAnim - 36) / 43) * (0-(1.10098)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 0) * (0.5-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0.5 + (((tickAnim - 23) / 1) * (0-(0.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 36) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 10.5 + (((tickAnim - 16) / 7) * (18.5-(10.5)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 18.5 + (((tickAnim - 23) / 1) * (19.56-(18.5)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 19.56 + (((tickAnim - 24) / 12) * (0-(19.56)));
            yy = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 36) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.3-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 0) * (0.07-(0)));
            zz = -0.3 + (((tickAnim - 23) / 0) * (-0.59-(-0.3)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0.07 + (((tickAnim - 23) / 1) * (0.125-(0.07)));
            zz = -0.59 + (((tickAnim - 23) / 1) * (0-(-0.59)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            yy = 0.125 + (((tickAnim - 24) / 12) * (0-(0.125)));
            zz = 0 + (((tickAnim - 24) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (9.97-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 9.97 + (((tickAnim - 16) / 7) * (-0.13-(9.97)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = -0.13 + (((tickAnim - 23) / 1) * (45.5-(-0.13)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 45.5 + (((tickAnim - 24) / 1) * (47.56454-(45.5)));
            yy = 0 + (((tickAnim - 24) / 1) * (-0.26795-(0)));
            zz = 0 + (((tickAnim - 24) / 1) * (-0.33472-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 47.56454 + (((tickAnim - 25) / 11) * (21.40355-(47.56454)));
            yy = -0.26795 + (((tickAnim - 25) / 11) * (-3.75136-(-0.26795)));
            zz = -0.33472 + (((tickAnim - 25) / 11) * (-4.68601-(-0.33472)));
        }
        else if (tickAnim >= 36 && tickAnim < 79) {
            xx = 21.40355 + (((tickAnim - 36) / 43) * (0-(21.40355)));
            yy = -3.75136 + (((tickAnim - 36) / 43) * (0-(-3.75136)));
            zz = -4.68601 + (((tickAnim - 36) / 43) * (0-(-4.68601)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.1-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = 0.1 + (((tickAnim - 23) / 0) * (0.65-(0.1)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0.65 + (((tickAnim - 23) / 1) * (0-(0.65)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 1) * (-0.525-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = -0.525 + (((tickAnim - 25) / 11) * (0.08-(-0.525)));
        }
        else if (tickAnim >= 36 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 36) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 43) * (0-(0)));
            zz = 0.08 + (((tickAnim - 36) / 43) * (0-(0.08)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (31.21-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 31.21 + (((tickAnim - 16) / 6) * (16.25-(31.21)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 16.25 + (((tickAnim - 22) / 1) * (36.5-(16.25)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 36.5 + (((tickAnim - 23) / 1) * (0-(36.5)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 24) / 12) * (-17-(0)));
            yy = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = -17 + (((tickAnim - 36) / 2) * (-16.3-(-17)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = -16.3 + (((tickAnim - 38) / 1) * (-17-(-16.3)));
            yy = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 1) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = -17 + (((tickAnim - 39) / 2) * (-16.3-(-17)));
            yy = 0 + (((tickAnim - 39) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 2) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = -16.3 + (((tickAnim - 41) / 2) * (-17-(-16.3)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 44) {
            xx = -17 + (((tickAnim - 43) / 1) * (-16.3-(-17)));
            yy = 0 + (((tickAnim - 43) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 1) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 46) {
            xx = -16.3 + (((tickAnim - 44) / 2) * (-17-(-16.3)));
            yy = 0 + (((tickAnim - 44) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 2) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -17 + (((tickAnim - 46) / 2) * (-16.3-(-17)));
            yy = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 49) {
            xx = -16.3 + (((tickAnim - 48) / 1) * (-17-(-16.3)));
            yy = 0 + (((tickAnim - 48) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 1) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 51) {
            xx = -17 + (((tickAnim - 49) / 2) * (-16.3-(-17)));
            yy = 0 + (((tickAnim - 49) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 2) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = -16.3 + (((tickAnim - 51) / 2) * (-17-(-16.3)));
            yy = 0 + (((tickAnim - 51) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 2) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 79) {
            xx = -17 + (((tickAnim - 53) / 26) * (0-(-17)));
            yy = 0 + (((tickAnim - 53) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 31.75 + (((tickAnim - 16) / 7) * (46.25-(31.75)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 79) {
            xx = 46.25 + (((tickAnim - 23) / 56) * (0-(46.25)));
            yy = 0 + (((tickAnim - 23) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 79) {
            xx = -42.5 + (((tickAnim - 23) / 56) * (0-(-42.5)));
            yy = 0 + (((tickAnim - 23) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 31.75 + (((tickAnim - 16) / 7) * (46.25-(31.75)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 79) {
            xx = 46.25 + (((tickAnim - 23) / 56) * (0-(46.25)));
            yy = 0 + (((tickAnim - 23) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 79) {
            xx = -42.5 + (((tickAnim - 23) / 56) * (0-(-42.5)));
            yy = 0 + (((tickAnim - 23) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 29) / 2) * (18.5-(0)));
            yy = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 2) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 18.5 + (((tickAnim - 31) / 2) * (15.75-(18.5)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 15.75 + (((tickAnim - 33) / 1) * (18.5-(15.75)));
            yy = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 1) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 18.5 + (((tickAnim - 34) / 2) * (15.75-(18.5)));
            yy = 0 + (((tickAnim - 34) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 2) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 15.75 + (((tickAnim - 36) / 2) * (18.5-(15.75)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 18.5 + (((tickAnim - 38) / 1) * (15.75-(18.5)));
            yy = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 1) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = 15.75 + (((tickAnim - 39) / 2) * (18.5-(15.75)));
            yy = 0 + (((tickAnim - 39) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 2) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 18.5 + (((tickAnim - 41) / 2) * (15.75-(18.5)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 44) {
            xx = 15.75 + (((tickAnim - 43) / 1) * (18.5-(15.75)));
            yy = 0 + (((tickAnim - 43) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 1) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 46) {
            xx = 18.5 + (((tickAnim - 44) / 2) * (15.75-(18.5)));
            yy = 0 + (((tickAnim - 44) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 2) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 15.75 + (((tickAnim - 46) / 2) * (18.5-(15.75)));
            yy = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 49) {
            xx = 18.5 + (((tickAnim - 48) / 1) * (15.75-(18.5)));
            yy = 0 + (((tickAnim - 48) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 1) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 51) {
            xx = 15.75 + (((tickAnim - 49) / 2) * (18.5-(15.75)));
            yy = 0 + (((tickAnim - 49) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 2) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = 18.5 + (((tickAnim - 51) / 2) * (15.75-(18.5)));
            yy = 0 + (((tickAnim - 51) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 2) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 54) {
            xx = 15.75 + (((tickAnim - 53) / 1) * (0-(15.75)));
            yy = 0 + (((tickAnim - 53) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 14 + (((tickAnim - 16) / 2) * (12.5-(14)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12.5 + (((tickAnim - 18) / 2) * (1.5-(12.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 1.5 + (((tickAnim - 20) / 2) * (0-(1.5)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (-0.69005-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0.28152-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (-1.02076-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -0.69005 + (((tickAnim - 23) / 2) * (0-(-0.69005)));
            yy = 0.28152 + (((tickAnim - 23) / 2) * (0-(0.28152)));
            zz = -1.02076 + (((tickAnim - 23) / 2) * (0-(-1.02076)));
        }
        else if (tickAnim >= 25 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 25) / 21) * (-7.70127-(0)));
            yy = 0 + (((tickAnim - 25) / 21) * (-9.8095+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*20-(0)));
            zz = 0 + (((tickAnim - 25) / 21) * (0.06419-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 79) {
            xx = -7.70127 + (((tickAnim - 46) / 33) * (0-(-7.70127)));
            yy = -9.8095+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*20 + (((tickAnim - 46) / 33) * (0-(-9.8095+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*20)));
            zz = 0.06419 + (((tickAnim - 46) / 33) * (0-(0.06419)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 9 + (((tickAnim - 16) / 2) * (-4.25-(9)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -4.25 + (((tickAnim - 18) / 2) * (2.88-(-4.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 2.88 + (((tickAnim - 20) / 2) * (0-(2.88)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (-11.75-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = -11.75 + (((tickAnim - 23) / 2) * (0-(-11.75)));
        }
        else if (tickAnim >= 25 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 25) / 21) * (5.93841-(0)));
            yy = 0 + (((tickAnim - 25) / 21) * (-12.0973+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-50))*20-(0)));
            zz = 0 + (((tickAnim - 25) / 21) * (7.59752-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 79) {
            xx = 5.93841 + (((tickAnim - 46) / 33) * (0-(5.93841)));
            yy = -12.0973+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-50))*20 + (((tickAnim - 46) / 33) * (0-(-12.0973+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-50))*20)));
            zz = 7.59752 + (((tickAnim - 46) / 33) * (0-(7.59752)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 4.5 + (((tickAnim - 16) / 2) * (-8.41-(4.5)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -8.41 + (((tickAnim - 18) / 2) * (-5.91-(-8.41)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -5.91 + (((tickAnim - 20) / 2) * (0-(-5.91)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0.01018-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (-2.97431-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (-12.39193-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0.01018 + (((tickAnim - 23) / 2) * (0-(0.01018)));
            yy = -2.97431 + (((tickAnim - 23) / 2) * (0-(-2.97431)));
            zz = -12.39193 + (((tickAnim - 23) / 2) * (0-(-12.39193)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (-3.43458-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (-9.5261-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0.41471-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 46) {
            xx = -3.43458 + (((tickAnim - 32) / 14) * (-7.35813-(-3.43458)));
            yy = -9.5261 + (((tickAnim - 32) / 14) * (-60.2618+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-50))*70-(-9.5261)));
            zz = 0.41471 + (((tickAnim - 32) / 14) * (2.73406-(0.41471)));
        }
        else if (tickAnim >= 46 && tickAnim < 79) {
            xx = -7.35813 + (((tickAnim - 46) / 33) * (0-(-7.35813)));
            yy = -60.2618+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-50))*70 + (((tickAnim - 46) / 33) * (0-(-60.2618+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-50))*70)));
            zz = 2.73406 + (((tickAnim - 46) / 33) * (0-(2.73406)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 16) / 2) * (13.36-(5)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 13.36 + (((tickAnim - 18) / 1) * (-9.59-(13.36)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -9.59 + (((tickAnim - 19) / 1) * (-10.36-(-9.59)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -10.36 + (((tickAnim - 20) / 2) * (10.5-(-10.36)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 10.5 + (((tickAnim - 22) / 1) * (0.03736-(10.5)));
            yy = 0 + (((tickAnim - 22) / 1) * (-6.97323-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (-18.11312-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0.03736 + (((tickAnim - 23) / 2) * (0-(0.03736)));
            yy = -6.97323 + (((tickAnim - 23) / 2) * (0-(-6.97323)));
            zz = -18.11312 + (((tickAnim - 23) / 2) * (0-(-18.11312)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (-11.07-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 32) / 14) * (0-(0)));
            yy = -11.07 + (((tickAnim - 32) / 14) * (-98.7868+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-50))*100-(-11.07)));
            zz = 0 + (((tickAnim - 32) / 14) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 46) / 33) * (0-(0)));
            yy = -98.7868+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-50))*100 + (((tickAnim - 46) / 33) * (0-(-98.7868+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-50))*100)));
            zz = 0 + (((tickAnim - 46) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 16 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 16) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 16) / 7) * (0.025-(1)));
            zz = 1 + (((tickAnim - 16) / 7) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 23) / 2) * (1-(1)));
            yy = 0.025 + (((tickAnim - 23) / 2) * (0.025-(0.025)));
            zz = 1 + (((tickAnim - 23) / 2) * (1-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 25) / 5) * (1-(1)));
            yy = 0.025 + (((tickAnim - 25) / 5) * (1-(0.025)));
            zz = 1 + (((tickAnim - 25) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (11.75-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 11.75 + (((tickAnim - 20) / 2) * (0-(11.75)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 45) {
            xx = -6.25 + (((tickAnim - 27) / 18) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 27) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPrenocephale entity = (EntityPrehistoricFloraPrenocephale) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (38.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 38.5 + (((tickAnim - 8) / 8) * (0-(38.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (38.5-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 38.5 + (((tickAnim - 23) / 9) * (0-(38.5)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (38.5-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 38.5 + (((tickAnim - 39) / 11) * (0-(38.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 24 + (((tickAnim - 8) / 4) * (-12.5-(24)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -12.5 + (((tickAnim - 12) / 4) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (24-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 24 + (((tickAnim - 23) / 5) * (-12.5-(24)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -12.5 + (((tickAnim - 28) / 4) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (24-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 39) / 11) * (0-(24)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -17 + (((tickAnim - 8) / 4) * (-41.75-(-17)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -41.75 + (((tickAnim - 12) / 4) * (0-(-41.75)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -17 + (((tickAnim - 23) / 5) * (-41.75-(-17)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -41.75 + (((tickAnim - 28) / 4) * (0-(-41.75)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -17 + (((tickAnim - 39) / 6) * (-43.85-(-17)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -43.85 + (((tickAnim - 45) / 5) * (0-(-43.85)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.45-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0.675-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 12) / 4) * (0-(0.45)));
            zz = 0.675 + (((tickAnim - 12) / 4) * (0-(0.675)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0.45-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0.675-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 28) / 4) * (0-(0.45)));
            zz = 0.675 + (((tickAnim - 28) / 4) * (0-(0.675)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (0.525-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0.65-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 45) / 5) * (0-(0.525)));
            zz = 0.65 + (((tickAnim - 45) / 5) * (0-(0.65)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (65.79-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 65.79 + (((tickAnim - 3) / 5) * (68.5-(65.79)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 68.5 + (((tickAnim - 8) / 4) * (55.5-(68.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 55.5 + (((tickAnim - 12) / 4) * (0-(55.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (65.79-(0)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 65.79 + (((tickAnim - 19) / 4) * (68.5-(65.79)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 68.5 + (((tickAnim - 23) / 5) * (55.5-(68.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 55.5 + (((tickAnim - 28) / 4) * (0-(55.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (65.79-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 65.79 + (((tickAnim - 35) / 4) * (68.5-(65.79)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 68.5 + (((tickAnim - 39) / 11) * (0-(68.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.28-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 2) / 1) * (0.41-(0.875)));
            zz = -0.28 + (((tickAnim - 2) / 1) * (-0.46-(-0.28)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.41 + (((tickAnim - 3) / 5) * (0.975-(0.41)));
            zz = -0.46 + (((tickAnim - 3) / 5) * (-0.375-(-0.46)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.975 + (((tickAnim - 8) / 4) * (1.19-(0.975)));
            zz = -0.375 + (((tickAnim - 8) / 4) * (-0.315-(-0.375)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 1.19 + (((tickAnim - 12) / 4) * (0-(1.19)));
            zz = -0.315 + (((tickAnim - 12) / 4) * (0-(-0.315)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0.875-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (-0.28-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 18) / 1) * (0.41-(0.875)));
            zz = -0.28 + (((tickAnim - 18) / 1) * (-0.46-(-0.28)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.41 + (((tickAnim - 19) / 4) * (0.975-(0.41)));
            zz = -0.46 + (((tickAnim - 19) / 4) * (-0.375-(-0.46)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.975 + (((tickAnim - 23) / 5) * (1.19-(0.975)));
            zz = -0.375 + (((tickAnim - 23) / 5) * (-0.315-(-0.375)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 1.19 + (((tickAnim - 28) / 4) * (0-(1.19)));
            zz = -0.315 + (((tickAnim - 28) / 4) * (0-(-0.315)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 1) * (0.875-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (-0.28-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 33) / 2) * (0.41-(0.875)));
            zz = -0.28 + (((tickAnim - 33) / 2) * (-0.46-(-0.28)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            yy = 0.41 + (((tickAnim - 35) / 4) * (0.975-(0.41)));
            zz = -0.46 + (((tickAnim - 35) / 4) * (-0.375-(-0.46)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0.975 + (((tickAnim - 39) / 11) * (0-(0.975)));
            zz = -0.375 + (((tickAnim - 39) / 11) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPrenocephale entity = (EntityPrehistoricFloraPrenocephale) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -16.25 + (((tickAnim - 15) / 20) * (-16.25-(-16.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -16.25 + (((tickAnim - 35) / 15) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-4.1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -4.1 + (((tickAnim - 15) / 20) * (-4.1-(-4.1)));
            zz = 1.25 + (((tickAnim - 15) / 20) * (1.25-(1.25)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -4.1 + (((tickAnim - 35) / 15) * (0-(-4.1)));
            zz = 1.25 + (((tickAnim - 35) / 15) * (0-(1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -7.25 + (((tickAnim - 15) / 20) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -7.25 + (((tickAnim - 35) / 15) * (0-(-7.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (38.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 38.75 + (((tickAnim - 15) / 20) * (38.75-(38.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 38.75 + (((tickAnim - 35) / 15) * (0-(38.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -23.25 + (((tickAnim - 15) / 20) * (-23.25-(-23.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -23.25 + (((tickAnim - 35) / 15) * (0-(-23.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 9.25 + (((tickAnim - 15) / 20) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 35) / 15) * (0-(9.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.3 + (((tickAnim - 15) / 20) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.3 + (((tickAnim - 35) / 15) * (0-(0.3)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -7.25 + (((tickAnim - 15) / 20) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -7.25 + (((tickAnim - 35) / 15) * (0-(-7.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (38.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 38.75 + (((tickAnim - 15) / 20) * (38.75-(38.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 38.75 + (((tickAnim - 35) / 15) * (0-(38.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -23.25 + (((tickAnim - 15) / 20) * (-23.25-(-23.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -23.25 + (((tickAnim - 35) / 15) * (0-(-23.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 9.25 + (((tickAnim - 15) / 20) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 35) / 15) * (0-(9.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.3 + (((tickAnim - 15) / 20) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.3 + (((tickAnim - 35) / 15) * (0-(0.3)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10 + (((tickAnim - 15) / 20) * (10-(10)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 35) / 15) * (0-(10)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -6.5 + (((tickAnim - 15) / 20) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -6.5 + (((tickAnim - 35) / 15) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -5.5 + (((tickAnim - 7) / 8) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -4.75 + (((tickAnim - 40) / 10) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (15-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 15 + (((tickAnim - 15) / 20) * (15-(15)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 15 + (((tickAnim - 35) / 5) * (7.25-(15)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 7.25 + (((tickAnim - 40) / 4) * (-5.02-(7.25)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -5.02 + (((tickAnim - 44) / 6) * (0-(-5.02)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPrenocephale entity = (EntityPrehistoricFloraPrenocephale) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.5 + (((tickAnim - 10) / 10) * (0-(3.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18 + (((tickAnim - 10) / 10) * (0-(-18)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2 + (((tickAnim - 10) / 10) * (0-(2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 34.25 + (((tickAnim - 10) / 10) * (0-(34.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPrenocephale entity = (EntityPrehistoricFloraPrenocephale) entitylivingbaseIn;
        int animCycle = 470;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 304) {
            xx = 6.75 + (((tickAnim - 40) / 264) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 40) / 264) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 264) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 435) {
            xx = 6.75 + (((tickAnim - 304) / 131) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 304) / 131) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 131) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 470) {
            xx = 6.75 + (((tickAnim - 435) / 35) * (0-(6.75)));
            yy = 0 + (((tickAnim - 435) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.625-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 304) {
            xx = 0 + (((tickAnim - 40) / 264) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 264) * (0-(0)));
            zz = -0.625 + (((tickAnim - 40) / 264) * (-0.625-(-0.625)));
        }
        else if (tickAnim >= 304 && tickAnim < 435) {
            xx = 0 + (((tickAnim - 304) / 131) * (0-(0)));
            yy = 0 + (((tickAnim - 304) / 131) * (0-(0)));
            zz = -0.625 + (((tickAnim - 304) / 131) * (-0.625-(-0.625)));
        }
        else if (tickAnim >= 435 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 435) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 435) / 35) * (0-(0)));
            zz = -0.625 + (((tickAnim - 435) / 35) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 304) {
            xx = -20.25 + (((tickAnim - 40) / 264) * (-20.25-(-20.25)));
            yy = 0 + (((tickAnim - 40) / 264) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 264) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 435) {
            xx = -20.25 + (((tickAnim - 304) / 131) * (-20.25-(-20.25)));
            yy = 0 + (((tickAnim - 304) / 131) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 131) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 470) {
            xx = -20.25 + (((tickAnim - 435) / 35) * (0-(-20.25)));
            yy = 0 + (((tickAnim - 435) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0.44-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 0.44 + (((tickAnim - 19) / 21) * (-15.25-(0.44)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 304) {
            xx = -15.25 + (((tickAnim - 40) / 264) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 40) / 264) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 264) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 435) {
            xx = -15.25 + (((tickAnim - 304) / 131) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 304) / 131) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 131) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 452) {
            xx = -15.25 + (((tickAnim - 435) / 17) * (36.01-(-15.25)));
            yy = 0 + (((tickAnim - 435) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 17) * (0-(0)));
        }
        else if (tickAnim >= 452 && tickAnim < 470) {
            xx = 36.01 + (((tickAnim - 452) / 18) * (0-(36.01)));
            yy = 0 + (((tickAnim - 452) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 452) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 435 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 435) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 435) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-36.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = -36.75 + (((tickAnim - 19) / 21) * (0-(-36.75)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 304) {
            xx = 0 + (((tickAnim - 40) / 264) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 264) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 264) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 435) {
            xx = 0 + (((tickAnim - 304) / 131) * (0-(0)));
            yy = 0 + (((tickAnim - 304) / 131) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 131) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 452) {
            xx = 0 + (((tickAnim - 435) / 17) * (-25-(0)));
            yy = 0 + (((tickAnim - 435) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 17) * (0-(0)));
        }
        else if (tickAnim >= 452 && tickAnim < 470) {
            xx = -25 + (((tickAnim - 452) / 18) * (0-(-25)));
            yy = 0 + (((tickAnim - 452) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 452) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(0);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(0);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (69.76-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 69.76 + (((tickAnim - 19) / 21) * (29.75-(69.76)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 304) {
            xx = 29.75 + (((tickAnim - 40) / 264) * (29.75-(29.75)));
            yy = 0 + (((tickAnim - 40) / 264) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 264) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 435) {
            xx = 29.75 + (((tickAnim - 304) / 131) * (29.75-(29.75)));
            yy = 0 + (((tickAnim - 304) / 131) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 131) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 452) {
            xx = 29.75 + (((tickAnim - 435) / 17) * (92.58-(29.75)));
            yy = 0 + (((tickAnim - 435) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 17) * (0-(0)));
        }
        else if (tickAnim >= 452 && tickAnim < 470) {
            xx = 92.58 + (((tickAnim - 452) / 18) * (0-(92.58)));
            yy = 0 + (((tickAnim - 452) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 452) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.13-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-0.575-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            yy = 0.13 + (((tickAnim - 19) / 21) * (0.275-(0.13)));
            zz = -0.575 + (((tickAnim - 19) / 21) * (0-(-0.575)));
        }
        else if (tickAnim >= 40 && tickAnim < 304) {
            xx = 0 + (((tickAnim - 40) / 264) * (0-(0)));
            yy = 0.275 + (((tickAnim - 40) / 264) * (0.275-(0.275)));
            zz = 0 + (((tickAnim - 40) / 264) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 435) {
            xx = 0 + (((tickAnim - 304) / 131) * (0-(0)));
            yy = 0.275 + (((tickAnim - 304) / 131) * (0.275-(0.275)));
            zz = 0 + (((tickAnim - 304) / 131) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 452) {
            xx = 0 + (((tickAnim - 435) / 17) * (0-(0)));
            yy = 0.275 + (((tickAnim - 435) / 17) * (0.28-(0.275)));
            zz = 0 + (((tickAnim - 435) / 17) * (-0.475-(0)));
        }
        else if (tickAnim >= 452 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 452) / 18) * (0-(0)));
            yy = 0.28 + (((tickAnim - 452) / 18) * (0-(0.28)));
            zz = -0.475 + (((tickAnim - 452) / 18) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 304) {
            xx = 3.5 + (((tickAnim - 40) / 264) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 40) / 264) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 264) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 435) {
            xx = 3.5 + (((tickAnim - 304) / 131) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 304) / 131) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 131) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 470) {
            xx = 3.5 + (((tickAnim - 435) / 35) * (0-(3.5)));
            yy = 0 + (((tickAnim - 435) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 78) {
            xx = -7.75 + (((tickAnim - 40) / 38) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 40) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 38) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 120) {
            xx = -7.75 + (((tickAnim - 78) / 42) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 78) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 42) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 304) {
            xx = -7.75 + (((tickAnim - 120) / 184) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 120) / 184) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 184) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 343) {
            xx = -7.75 + (((tickAnim - 304) / 39) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 304) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 39) * (0-(0)));
        }
        else if (tickAnim >= 343 && tickAnim < 384) {
            xx = -7.75 + (((tickAnim - 343) / 41) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 343) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 343) / 41) * (0-(0)));
        }
        else if (tickAnim >= 384 && tickAnim < 435) {
            xx = -7.75 + (((tickAnim - 384) / 51) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 384) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 384) / 51) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 470) {
            xx = -7.75 + (((tickAnim - 435) / 35) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 435) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 78) {
            xx = -3.75 + (((tickAnim - 40) / 38) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 40) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 38) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 120) {
            xx = -3.75 + (((tickAnim - 78) / 42) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 78) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 42) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 304) {
            xx = -3.75 + (((tickAnim - 120) / 184) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 120) / 184) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 184) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 343) {
            xx = -3.75 + (((tickAnim - 304) / 39) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 304) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 39) * (0-(0)));
        }
        else if (tickAnim >= 343 && tickAnim < 384) {
            xx = -3.75 + (((tickAnim - 343) / 41) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 343) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 343) / 41) * (0-(0)));
        }
        else if (tickAnim >= 384 && tickAnim < 435) {
            xx = -3.75 + (((tickAnim - 384) / 51) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 384) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 384) / 51) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 470) {
            xx = -3.75 + (((tickAnim - 435) / 35) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 435) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 78) {
            xx = 1.75 + (((tickAnim - 40) / 38) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 40) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 38) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 120) {
            xx = 1.75 + (((tickAnim - 78) / 42) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 78) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 42) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 304) {
            xx = 1.75 + (((tickAnim - 120) / 184) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 120) / 184) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 184) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 343) {
            xx = 1.75 + (((tickAnim - 304) / 39) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 304) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 39) * (0-(0)));
        }
        else if (tickAnim >= 343 && tickAnim < 384) {
            xx = 1.75 + (((tickAnim - 343) / 41) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 343) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 343) / 41) * (0-(0)));
        }
        else if (tickAnim >= 384 && tickAnim < 435) {
            xx = 1.75 + (((tickAnim - 384) / 51) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 384) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 384) / 51) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 470) {
            xx = 1.75 + (((tickAnim - 435) / 35) * (0-(1.75)));
            yy = 0 + (((tickAnim - 435) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 4.75 + (((tickAnim - 40) / 15) * (3.25-(4.75)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 78) {
            xx = 3.25 + (((tickAnim - 55) / 23) * (4.75-(3.25)));
            yy = 0 + (((tickAnim - 55) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 23) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 94) {
            xx = 4.75 + (((tickAnim - 78) / 16) * (3.25-(4.75)));
            yy = 0 + (((tickAnim - 78) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 16) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 119) {
            xx = 3.25 + (((tickAnim - 94) / 25) * (4.75-(3.25)));
            yy = 0 + (((tickAnim - 94) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 25) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 148) {
            xx = 4.75 + (((tickAnim - 119) / 29) * (3.25-(4.75)));
            yy = 0 + (((tickAnim - 119) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 29) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 171) {
            xx = 3.25 + (((tickAnim - 148) / 23) * (-1.25-(3.25)));
            yy = 0 + (((tickAnim - 148) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 23) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 216) {
            xx = -1.25 + (((tickAnim - 171) / 45) * (-9.5-(-1.25)));
            yy = 0 + (((tickAnim - 171) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 45) * (0-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 242) {
            xx = -9.5 + (((tickAnim - 216) / 26) * (-8.25-(-9.5)));
            yy = 0 + (((tickAnim - 216) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 216) / 26) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 260) {
            xx = -8.25 + (((tickAnim - 242) / 18) * (-7.225-(-8.25)));
            yy = 0 + (((tickAnim - 242) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 18) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 275) {
            xx = -7.225 + (((tickAnim - 260) / 15) * (-6.47-(-7.225)));
            yy = 0 + (((tickAnim - 260) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 15) * (0-(0)));
        }
        else if (tickAnim >= 275 && tickAnim < 304) {
            xx = -6.47 + (((tickAnim - 275) / 29) * (4.75-(-6.47)));
            yy = 0 + (((tickAnim - 275) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 275) / 29) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 319) {
            xx = 4.75 + (((tickAnim - 304) / 15) * (3.25-(4.75)));
            yy = 0 + (((tickAnim - 304) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 15) * (0-(0)));
        }
        else if (tickAnim >= 319 && tickAnim < 342) {
            xx = 3.25 + (((tickAnim - 319) / 23) * (4.75-(3.25)));
            yy = 0 + (((tickAnim - 319) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 319) / 23) * (0-(0)));
        }
        else if (tickAnim >= 342 && tickAnim < 358) {
            xx = 4.75 + (((tickAnim - 342) / 16) * (3.25-(4.75)));
            yy = 0 + (((tickAnim - 342) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 342) / 16) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 383) {
            xx = 3.25 + (((tickAnim - 358) / 25) * (4.75-(3.25)));
            yy = 0 + (((tickAnim - 358) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 25) * (0-(0)));
        }
        else if (tickAnim >= 383 && tickAnim < 412) {
            xx = 4.75 + (((tickAnim - 383) / 29) * (3.25-(4.75)));
            yy = 0 + (((tickAnim - 383) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 383) / 29) * (0-(0)));
        }
        else if (tickAnim >= 412 && tickAnim < 435) {
            xx = 3.25 + (((tickAnim - 412) / 23) * (-1.25-(3.25)));
            yy = 0 + (((tickAnim - 412) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 412) / 23) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 470) {
            xx = -1.25 + (((tickAnim - 435) / 35) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 435) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 8.75 + (((tickAnim - 40) / 15) * (10-(8.75)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 78) {
            xx = 10 + (((tickAnim - 55) / 23) * (8.75-(10)));
            yy = 0 + (((tickAnim - 55) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 23) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 94) {
            xx = 8.75 + (((tickAnim - 78) / 16) * (10-(8.75)));
            yy = 0 + (((tickAnim - 78) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 16) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 119) {
            xx = 10 + (((tickAnim - 94) / 25) * (8.75-(10)));
            yy = 0 + (((tickAnim - 94) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 25) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 148) {
            xx = 8.75 + (((tickAnim - 119) / 29) * (10-(8.75)));
            yy = 0 + (((tickAnim - 119) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 29) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 171) {
            xx = 10 + (((tickAnim - 148) / 23) * (4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*-5-(10)));
            yy = 0 + (((tickAnim - 148) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 23) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 200) {
            xx = 4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*-5 + (((tickAnim - 171) / 29) * (-3-(4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*-5)));
            yy = 0 + (((tickAnim - 171) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 29) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 216) {
            xx = -3 + (((tickAnim - 200) / 16) * (-3.75-(-3)));
            yy = 0 + (((tickAnim - 200) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 16) * (0-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 242) {
            xx = -3.75 + (((tickAnim - 216) / 26) * (-3.25-(-3.75)));
            yy = 0 + (((tickAnim - 216) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 216) / 26) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 260) {
            xx = -3.25 + (((tickAnim - 242) / 18) * (-2.4-(-3.25)));
            yy = 0 + (((tickAnim - 242) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 18) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 275) {
            xx = -2.4 + (((tickAnim - 260) / 15) * (-1.9-(-2.4)));
            yy = 0 + (((tickAnim - 260) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 15) * (0-(0)));
        }
        else if (tickAnim >= 275 && tickAnim < 304) {
            xx = -1.9 + (((tickAnim - 275) / 29) * (8.75-(-1.9)));
            yy = 0 + (((tickAnim - 275) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 275) / 29) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 319) {
            xx = 8.75 + (((tickAnim - 304) / 15) * (10-(8.75)));
            yy = 0 + (((tickAnim - 304) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 15) * (0-(0)));
        }
        else if (tickAnim >= 319 && tickAnim < 342) {
            xx = 10 + (((tickAnim - 319) / 23) * (8.75-(10)));
            yy = 0 + (((tickAnim - 319) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 319) / 23) * (0-(0)));
        }
        else if (tickAnim >= 342 && tickAnim < 358) {
            xx = 8.75 + (((tickAnim - 342) / 16) * (10-(8.75)));
            yy = 0 + (((tickAnim - 342) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 342) / 16) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 383) {
            xx = 10 + (((tickAnim - 358) / 25) * (8.75-(10)));
            yy = 0 + (((tickAnim - 358) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 25) * (0-(0)));
        }
        else if (tickAnim >= 383 && tickAnim < 412) {
            xx = 8.75 + (((tickAnim - 383) / 29) * (10-(8.75)));
            yy = 0 + (((tickAnim - 383) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 383) / 29) * (0-(0)));
        }
        else if (tickAnim >= 412 && tickAnim < 435) {
            xx = 10 + (((tickAnim - 412) / 23) * (4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*-5-(10)));
            yy = 0 + (((tickAnim - 412) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 412) / 23) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 470) {
            xx = 4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*-5 + (((tickAnim - 435) / 35) * (0-(4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*-5)));
            yy = 0 + (((tickAnim - 435) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 304) {
            xx = 17.5 + (((tickAnim - 40) / 264) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 40) / 264) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 264) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 470) {
            xx = 17.5 + (((tickAnim - 304) / 166) * (0-(17.5)));
            yy = 0 + (((tickAnim - 304) / 166) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 166) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 78) {
            xx = 17.5 + (((tickAnim - 40) / 38) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 40) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 38) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 120) {
            xx = 17.5 + (((tickAnim - 78) / 42) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 78) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 42) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 304) {
            xx = 17.5 + (((tickAnim - 120) / 184) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 120) / 184) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 184) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 343) {
            xx = 17.5 + (((tickAnim - 304) / 39) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 304) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 39) * (0-(0)));
        }
        else if (tickAnim >= 343 && tickAnim < 384) {
            xx = 17.5 + (((tickAnim - 343) / 41) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 343) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 343) / 41) * (0-(0)));
        }
        else if (tickAnim >= 384 && tickAnim < 470) {
            xx = 17.5 + (((tickAnim - 384) / 86) * (0-(17.5)));
            yy = 0 + (((tickAnim - 384) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 384) / 86) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 22.75 + (((tickAnim - 40) / 15) * (43.25-(22.75)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 43.25 + (((tickAnim - 55) / 3) * (41.5-(43.25)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 41.5 + (((tickAnim - 58) / 5) * (43.25-(41.5)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 78) {
            xx = 43.25 + (((tickAnim - 63) / 15) * (22.75-(43.25)));
            yy = 0 + (((tickAnim - 63) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 15) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 93) {
            xx = 22.75 + (((tickAnim - 78) / 15) * (43.25-(22.75)));
            yy = 0 + (((tickAnim - 78) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 15) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 97) {
            xx = 43.25 + (((tickAnim - 93) / 4) * (41.5-(43.25)));
            yy = 0 + (((tickAnim - 93) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 4) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 102) {
            xx = 41.5 + (((tickAnim - 97) / 5) * (43.25-(41.5)));
            yy = 0 + (((tickAnim - 97) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 5) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 120) {
            xx = 43.25 + (((tickAnim - 102) / 18) * (22.75-(43.25)));
            yy = 0 + (((tickAnim - 102) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 18) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 148) {
            xx = 22.75 + (((tickAnim - 120) / 28) * (44.73203-(22.75)));
            yy = 0 + (((tickAnim - 120) / 28) * (0.28388-(0)));
            zz = 0 + (((tickAnim - 120) / 28) * (-7.24447-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 44.73203 + (((tickAnim - 148) / 12) * (28.3683078651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25-(44.73203)));
            yy = 0.28388 + (((tickAnim - 148) / 12) * (6.77861-(0.28388)));
            zz = -7.24447 + (((tickAnim - 148) / 12) * (-9.08769-(-7.24447)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 28.3683078651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25 + (((tickAnim - 160) / 40) * (3.88561-(28.3683078651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25)));
            yy = 6.77861 + (((tickAnim - 160) / 40) * (2.71687-(6.77861)));
            zz = -9.08769 + (((tickAnim - 160) / 40) * (-2.50149-(-9.08769)));
        }
        else if (tickAnim >= 200 && tickAnim < 216) {
            xx = 3.88561 + (((tickAnim - 200) / 16) * (4.63561-(3.88561)));
            yy = 2.71687 + (((tickAnim - 200) / 16) * (2.71687-(2.71687)));
            zz = -2.50149 + (((tickAnim - 200) / 16) * (-2.50149-(-2.50149)));
        }
        else if (tickAnim >= 216 && tickAnim < 230) {
            xx = 4.63561 + (((tickAnim - 216) / 14) * (12.35631-(4.63561)));
            yy = 2.71687 + (((tickAnim - 216) / 14) * (-4.32571-(2.71687)));
            zz = -2.50149 + (((tickAnim - 216) / 14) * (-1.12546-(-2.50149)));
        }
        else if (tickAnim >= 230 && tickAnim < 242) {
            xx = 12.35631 + (((tickAnim - 230) / 12) * (4.58218-(12.35631)));
            yy = -4.32571 + (((tickAnim - 230) / 12) * (-10.12548-(-4.32571)));
            zz = -1.12546 + (((tickAnim - 230) / 12) * (0.00775-(-1.12546)));
        }
        else if (tickAnim >= 242 && tickAnim < 260) {
            xx = 4.58218 + (((tickAnim - 242) / 18) * (1.08218-(4.58218)));
            yy = -10.12548 + (((tickAnim - 242) / 18) * (-10.12548-(-10.12548)));
            zz = 0.00775 + (((tickAnim - 242) / 18) * (0.00775-(0.00775)));
        }
        else if (tickAnim >= 260 && tickAnim < 275) {
            xx = 1.08218 + (((tickAnim - 260) / 15) * (-0.66782-(1.08218)));
            yy = -10.12548 + (((tickAnim - 260) / 15) * (-10.12548-(-10.12548)));
            zz = 0.00775 + (((tickAnim - 260) / 15) * (0.00775-(0.00775)));
        }
        else if (tickAnim >= 275 && tickAnim < 304) {
            xx = -0.66782 + (((tickAnim - 275) / 29) * (22.75-(-0.66782)));
            yy = -10.12548 + (((tickAnim - 275) / 29) * (0-(-10.12548)));
            zz = 0.00775 + (((tickAnim - 275) / 29) * (0-(0.00775)));
        }
        else if (tickAnim >= 304 && tickAnim < 319) {
            xx = 22.75 + (((tickAnim - 304) / 15) * (43.25-(22.75)));
            yy = 0 + (((tickAnim - 304) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 15) * (0-(0)));
        }
        else if (tickAnim >= 319 && tickAnim < 323) {
            xx = 43.25 + (((tickAnim - 319) / 4) * (41.5-(43.25)));
            yy = 0 + (((tickAnim - 319) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 319) / 4) * (0-(0)));
        }
        else if (tickAnim >= 323 && tickAnim < 328) {
            xx = 41.5 + (((tickAnim - 323) / 5) * (43.25-(41.5)));
            yy = 0 + (((tickAnim - 323) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 323) / 5) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 343) {
            xx = 43.25 + (((tickAnim - 328) / 15) * (22.75-(43.25)));
            yy = 0 + (((tickAnim - 328) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 15) * (0-(0)));
        }
        else if (tickAnim >= 343 && tickAnim < 358) {
            xx = 22.75 + (((tickAnim - 343) / 15) * (43.25-(22.75)));
            yy = 0 + (((tickAnim - 343) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 343) / 15) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 361) {
            xx = 43.25 + (((tickAnim - 358) / 3) * (41.5-(43.25)));
            yy = 0 + (((tickAnim - 358) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 3) * (0-(0)));
        }
        else if (tickAnim >= 361 && tickAnim < 366) {
            xx = 41.5 + (((tickAnim - 361) / 5) * (43.25-(41.5)));
            yy = 0 + (((tickAnim - 361) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 361) / 5) * (0-(0)));
        }
        else if (tickAnim >= 366 && tickAnim < 384) {
            xx = 43.25 + (((tickAnim - 366) / 18) * (22.75-(43.25)));
            yy = 0 + (((tickAnim - 366) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 366) / 18) * (0-(0)));
        }
        else if (tickAnim >= 384 && tickAnim < 412) {
            xx = 22.75 + (((tickAnim - 384) / 28) * (44.73203-(22.75)));
            yy = 0 + (((tickAnim - 384) / 28) * (0.28388-(0)));
            zz = 0 + (((tickAnim - 384) / 28) * (-7.24447-(0)));
        }
        else if (tickAnim >= 412 && tickAnim < 424) {
            xx = 44.73203 + (((tickAnim - 412) / 12) * (28.3683078651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25-(44.73203)));
            yy = 0.28388 + (((tickAnim - 412) / 12) * (6.77861-(0.28388)));
            zz = -7.24447 + (((tickAnim - 412) / 12) * (-9.08769-(-7.24447)));
        }
        else if (tickAnim >= 424 && tickAnim < 435) {
            xx = 28.3683078651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25 + (((tickAnim - 424) / 11) * (28.3683078651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25-(28.3683078651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25)));
            yy = 6.77861 + (((tickAnim - 424) / 11) * (6.77861-(6.77861)));
            zz = -9.08769 + (((tickAnim - 424) / 11) * (-9.08769-(-9.08769)));
        }
        else if (tickAnim >= 435 && tickAnim < 470) {
            xx = 28.3683078651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25 + (((tickAnim - 435) / 35) * (0-(28.3683078651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25)));
            yy = 6.77861 + (((tickAnim - 435) / 35) * (0-(6.77861)));
            zz = -9.08769 + (((tickAnim - 435) / 35) * (0-(-9.08769)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 55) / 8) * (0-(0)));
            yy = 0.375 + (((tickAnim - 55) / 8) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 55) / 8) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 63) / 30) * (0-(0)));
            yy = 0.375 + (((tickAnim - 63) / 30) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 63) / 30) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 93) / 9) * (0-(0)));
            yy = 0.375 + (((tickAnim - 93) / 9) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 93) / 9) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 319) {
            xx = 0 + (((tickAnim - 102) / 217) * (0-(0)));
            yy = 0.375 + (((tickAnim - 102) / 217) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 102) / 217) * (0-(0)));
        }
        else if (tickAnim >= 319 && tickAnim < 328) {
            xx = 0 + (((tickAnim - 319) / 9) * (0-(0)));
            yy = 0.375 + (((tickAnim - 319) / 9) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 319) / 9) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 358) {
            xx = 0 + (((tickAnim - 328) / 30) * (0-(0)));
            yy = 0.375 + (((tickAnim - 328) / 30) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 328) / 30) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 366) {
            xx = 0 + (((tickAnim - 358) / 8) * (0-(0)));
            yy = 0.375 + (((tickAnim - 358) / 8) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 358) / 8) * (0-(0)));
        }
        else if (tickAnim >= 366 && tickAnim < 435) {
            xx = 0 + (((tickAnim - 366) / 69) * (0-(0)));
            yy = 0.375 + (((tickAnim - 366) / 69) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 366) / 69) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 435) / 35) * (0-(0)));
            yy = 0.375 + (((tickAnim - 435) / 35) * (0-(0.375)));
            zz = 0 + (((tickAnim - 435) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 21.5 + (((tickAnim - 40) / 15) * (37-(21.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 120) {
            xx = 37 + (((tickAnim - 55) / 65) * (32.55-(37)));
            yy = 0 + (((tickAnim - 55) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 65) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 148) {
            xx = 32.55 + (((tickAnim - 120) / 28) * (-7.75-(32.55)));
            yy = 0 + (((tickAnim - 120) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 28) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = -7.75 + (((tickAnim - 148) / 12) * (-16.00021-(-7.75)));
            yy = 0 + (((tickAnim - 148) / 12) * (-18.97534-(0)));
            zz = 0 + (((tickAnim - 148) / 12) * (-0.4452-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 192) {
            xx = -16.00021 + (((tickAnim - 160) / 32) * (-16.65-(-16.00021)));
            yy = -18.97534 + (((tickAnim - 160) / 32) * (0-(-18.97534)));
            zz = -0.4452 + (((tickAnim - 160) / 32) * (0-(-0.4452)));
        }
        else if (tickAnim >= 192 && tickAnim < 200) {
            xx = -16.65 + (((tickAnim - 192) / 8) * (-14.5-(-16.65)));
            yy = 0 + (((tickAnim - 192) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 192) / 8) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 216) {
            xx = -14.5 + (((tickAnim - 200) / 16) * (-14-(-14.5)));
            yy = 0 + (((tickAnim - 200) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 16) * (0-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 230) {
            xx = -14 + (((tickAnim - 216) / 14) * (-1.24995-(-14)));
            yy = 0 + (((tickAnim - 216) / 14) * (-2.45842-(0)));
            zz = 0 + (((tickAnim - 216) / 14) * (-4.28909-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 242) {
            xx = -1.24995 + (((tickAnim - 230) / 12) * (-20.83814-(-1.24995)));
            yy = -2.45842 + (((tickAnim - 230) / 12) * (-4.483-(-2.45842)));
            zz = -4.28909 + (((tickAnim - 230) / 12) * (-7.82128-(-4.28909)));
        }
        else if (tickAnim >= 242 && tickAnim < 272) {
            xx = -20.83814 + (((tickAnim - 242) / 30) * (-14.76583-(-20.83814)));
            yy = -4.483 + (((tickAnim - 242) / 30) * (-2.33116-(-4.483)));
            zz = -7.82128 + (((tickAnim - 242) / 30) * (-4.06706-(-7.82128)));
        }
        else if (tickAnim >= 272 && tickAnim < 304) {
            xx = -14.76583 + (((tickAnim - 272) / 32) * (21.5-(-14.76583)));
            yy = -2.33116 + (((tickAnim - 272) / 32) * (0-(-2.33116)));
            zz = -4.06706 + (((tickAnim - 272) / 32) * (0-(-4.06706)));
        }
        else if (tickAnim >= 304 && tickAnim < 319) {
            xx = 21.5 + (((tickAnim - 304) / 15) * (37-(21.5)));
            yy = 0 + (((tickAnim - 304) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 15) * (0-(0)));
        }
        else if (tickAnim >= 319 && tickAnim < 384) {
            xx = 37 + (((tickAnim - 319) / 65) * (32.55-(37)));
            yy = 0 + (((tickAnim - 319) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 319) / 65) * (0-(0)));
        }
        else if (tickAnim >= 384 && tickAnim < 412) {
            xx = 32.55 + (((tickAnim - 384) / 28) * (-7.75-(32.55)));
            yy = 0 + (((tickAnim - 384) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 384) / 28) * (0-(0)));
        }
        else if (tickAnim >= 412 && tickAnim < 424) {
            xx = -7.75 + (((tickAnim - 412) / 12) * (-16.00021-(-7.75)));
            yy = 0 + (((tickAnim - 412) / 12) * (-18.97534-(0)));
            zz = 0 + (((tickAnim - 412) / 12) * (-0.4452-(0)));
        }
        else if (tickAnim >= 424 && tickAnim < 435) {
            xx = -16.00021 + (((tickAnim - 424) / 11) * (-16.00021-(-16.00021)));
            yy = -18.97534 + (((tickAnim - 424) / 11) * (-18.97534-(-18.97534)));
            zz = -0.4452 + (((tickAnim - 424) / 11) * (-0.4452-(-0.4452)));
        }
        else if (tickAnim >= 435 && tickAnim < 470) {
            xx = -16.00021 + (((tickAnim - 435) / 35) * (0-(-16.00021)));
            yy = -18.97534 + (((tickAnim - 435) / 35) * (0-(-18.97534)));
            zz = -0.4452 + (((tickAnim - 435) / 35) * (0-(-0.4452)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 0) / 148) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 148) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 148) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 12) * (0.5-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 192) {
            xx = 0 + (((tickAnim - 160) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 32) * (0-(0)));
            zz = 0.5 + (((tickAnim - 160) / 32) * (0-(0.5)));
        }
        else if (tickAnim >= 192 && tickAnim < 216) {
            xx = 0 + (((tickAnim - 192) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 192) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 192) / 24) * (0-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 216) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 216) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 216) / 14) * (0.1-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 412) {
            xx = 0 + (((tickAnim - 230) / 182) * (0-(0)));
            yy = 0 + (((tickAnim - 230) / 182) * (0-(0)));
            zz = 0.1 + (((tickAnim - 230) / 182) * (0-(0.1)));
        }
        else if (tickAnim >= 412 && tickAnim < 424) {
            xx = 0 + (((tickAnim - 412) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 412) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 412) / 12) * (0.5-(0)));
        }
        else if (tickAnim >= 424 && tickAnim < 435) {
            xx = 0 + (((tickAnim - 424) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 424) / 11) * (0-(0)));
            zz = 0.5 + (((tickAnim - 424) / 11) * (0.5-(0.5)));
        }
        else if (tickAnim >= 435 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 435) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 435) / 35) * (0-(0)));
            zz = 0.5 + (((tickAnim - 435) / 35) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 93) {
            xx = 12.75 + (((tickAnim - 55) / 38) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 55) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 38) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 148) {
            xx = 12.75 + (((tickAnim - 93) / 55) * (18.99759-(12.75)));
            yy = 0 + (((tickAnim - 93) / 55) * (0.08503-(0)));
            zz = 0 + (((tickAnim - 93) / 55) * (-3.24889-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 18.99759 + (((tickAnim - 148) / 12) * (2.24759-(18.99759)));
            yy = 0.08503 + (((tickAnim - 148) / 12) * (0.08503-(0.08503)));
            zz = -3.24889 + (((tickAnim - 148) / 12) * (-3.24889-(-3.24889)));
        }
        else if (tickAnim >= 160 && tickAnim < 192) {
            xx = 2.24759 + (((tickAnim - 160) / 32) * (0-(2.24759)));
            yy = 0.08503 + (((tickAnim - 160) / 32) * (0-(0.08503)));
            zz = -3.24889 + (((tickAnim - 160) / 32) * (0-(-3.24889)));
        }
        else if (tickAnim >= 192 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 192) / 8) * (2-(0)));
            yy = 0 + (((tickAnim - 192) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 192) / 8) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 216) {
            xx = 2 + (((tickAnim - 200) / 16) * (1.25-(2)));
            yy = 0 + (((tickAnim - 200) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 16) * (0-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 230) {
            xx = 1.25 + (((tickAnim - 216) / 14) * (-13.30213-(1.25)));
            yy = 0 + (((tickAnim - 216) / 14) * (-5.79794-(0)));
            zz = 0 + (((tickAnim - 216) / 14) * (-0.3231-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 242) {
            xx = -13.30213 + (((tickAnim - 230) / 12) * (1.61082-(-13.30213)));
            yy = -5.79794 + (((tickAnim - 230) / 12) * (-10.57271-(-5.79794)));
            zz = -0.3231 + (((tickAnim - 230) / 12) * (-0.58919-(-0.3231)));
        }
        else if (tickAnim >= 242 && tickAnim < 275) {
            xx = 1.61082 + (((tickAnim - 242) / 33) * (6.25739-(1.61082)));
            yy = -10.57271 + (((tickAnim - 242) / 33) * (-10.9307-(-10.57271)));
            zz = -0.58919 + (((tickAnim - 242) / 33) * (0.64327-(-0.58919)));
        }
        else if (tickAnim >= 275 && tickAnim < 319) {
            xx = 6.25739 + (((tickAnim - 275) / 44) * (12.75-(6.25739)));
            yy = -10.9307 + (((tickAnim - 275) / 44) * (0-(-10.9307)));
            zz = 0.64327 + (((tickAnim - 275) / 44) * (0-(0.64327)));
        }
        else if (tickAnim >= 319 && tickAnim < 358) {
            xx = 12.75 + (((tickAnim - 319) / 39) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 319) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 319) / 39) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 412) {
            xx = 12.75 + (((tickAnim - 358) / 54) * (18.99759-(12.75)));
            yy = 0 + (((tickAnim - 358) / 54) * (0.08503-(0)));
            zz = 0 + (((tickAnim - 358) / 54) * (-3.24889-(0)));
        }
        else if (tickAnim >= 412 && tickAnim < 424) {
            xx = 18.99759 + (((tickAnim - 412) / 12) * (2.24759-(18.99759)));
            yy = 0.08503 + (((tickAnim - 412) / 12) * (0.08503-(0.08503)));
            zz = -3.24889 + (((tickAnim - 412) / 12) * (-3.24889-(-3.24889)));
        }
        else if (tickAnim >= 424 && tickAnim < 435) {
            xx = 2.24759 + (((tickAnim - 424) / 11) * (-6.53366-(2.24759)));
            yy = 0.08503 + (((tickAnim - 424) / 11) * (0.06493-(0.08503)));
            zz = -3.24889 + (((tickAnim - 424) / 11) * (-2.48097-(-3.24889)));
        }
        else if (tickAnim >= 435 && tickAnim < 470) {
            xx = -6.53366 + (((tickAnim - 435) / 35) * (0-(-6.53366)));
            yy = 0.06493 + (((tickAnim - 435) / 35) * (0-(0.06493)));
            zz = -2.48097 + (((tickAnim - 435) / 35) * (0-(-2.48097)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 216) {
            xx = 0 + (((tickAnim - 0) / 216) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 216) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 216) * (0-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 216) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 216) / 14) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 216) / 14) * (0.5-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 319) {
            xx = 0 + (((tickAnim - 230) / 89) * (0-(0)));
            yy = -0.175 + (((tickAnim - 230) / 89) * (0-(-0.175)));
            zz = 0.5 + (((tickAnim - 230) / 89) * (0-(0.5)));
        }
        else if (tickAnim >= 319 && tickAnim < 435) {
            xx = 0 + (((tickAnim - 319) / 116) * (0-(0)));
            yy = 0 + (((tickAnim - 319) / 116) * (0-(0)));
            zz = 0 + (((tickAnim - 319) / 116) * (0.3-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 435) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 435) / 35) * (0-(0)));
            zz = 0.3 + (((tickAnim - 435) / 35) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0.25 + (((tickAnim - 40) / 8) * (-25.36-(0.25)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -25.36 + (((tickAnim - 48) / 7) * (-39.75-(-25.36)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = -39.75 + (((tickAnim - 55) / 3) * (-38-(-39.75)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = -38 + (((tickAnim - 58) / 5) * (-39.75-(-38)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 78) {
            xx = -39.75 + (((tickAnim - 63) / 15) * (0.25-(-39.75)));
            yy = 0 + (((tickAnim - 63) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 15) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 87) {
            xx = 0.25 + (((tickAnim - 78) / 9) * (-25.36-(0.25)));
            yy = 0 + (((tickAnim - 78) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 9) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 93) {
            xx = -25.36 + (((tickAnim - 87) / 6) * (-39.75-(-25.36)));
            yy = 0 + (((tickAnim - 87) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 6) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 97) {
            xx = -39.75 + (((tickAnim - 93) / 4) * (-38-(-39.75)));
            yy = 0 + (((tickAnim - 93) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 4) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 102) {
            xx = -38 + (((tickAnim - 97) / 5) * (-39.75-(-38)));
            yy = 0 + (((tickAnim - 97) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 5) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 120) {
            xx = -39.75 + (((tickAnim - 102) / 18) * (0.25-(-39.75)));
            yy = 0 + (((tickAnim - 102) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 18) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 0.25 + (((tickAnim - 120) / 15) * (-20.75-(0.25)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 148) {
            xx = -20.75 + (((tickAnim - 135) / 13) * (-11.75-(-20.75)));
            yy = 0 + (((tickAnim - 135) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 13) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 153) {
            xx = -11.75 + (((tickAnim - 148) / 5) * (16.47254-(-11.75)));
            yy = 0 + (((tickAnim - 148) / 5) * (-3.57376-(0)));
            zz = 0 + (((tickAnim - 148) / 5) * (-1.56786-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 160) {
            xx = 16.47254 + (((tickAnim - 153) / 7) * (31.55634-(16.47254)));
            yy = -3.57376 + (((tickAnim - 153) / 7) * (-8.93441-(-3.57376)));
            zz = -1.56786 + (((tickAnim - 153) / 7) * (-3.91964-(-1.56786)));
        }
        else if (tickAnim >= 160 && tickAnim < 171) {
            xx = 31.55634 + (((tickAnim - 160) / 11) * (22.80634-(31.55634)));
            yy = -8.93441 + (((tickAnim - 160) / 11) * (-8.93441-(-8.93441)));
            zz = -3.91964 + (((tickAnim - 160) / 11) * (-3.91964-(-3.91964)));
        }
        else if (tickAnim >= 171 && tickAnim < 242) {
            xx = 22.80634 + (((tickAnim - 171) / 71) * (21.5-(22.80634)));
            yy = -8.93441 + (((tickAnim - 171) / 71) * (0-(-8.93441)));
            zz = -3.91964 + (((tickAnim - 171) / 71) * (0-(-3.91964)));
        }
        else if (tickAnim >= 242 && tickAnim < 244) {
            xx = 21.5 + (((tickAnim - 242) / 2) * (21-(21.5)));
            yy = 0 + (((tickAnim - 242) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 2) * (0-(0)));
        }
        else if (tickAnim >= 244 && tickAnim < 247) {
            xx = 21 + (((tickAnim - 244) / 3) * (21.5-(21)));
            yy = 0 + (((tickAnim - 244) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 244) / 3) * (0-(0)));
        }
        else if (tickAnim >= 247 && tickAnim < 249) {
            xx = 21.5 + (((tickAnim - 247) / 2) * (21-(21.5)));
            yy = 0 + (((tickAnim - 247) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 247) / 2) * (0-(0)));
        }
        else if (tickAnim >= 249 && tickAnim < 252) {
            xx = 21 + (((tickAnim - 249) / 3) * (21.5-(21)));
            yy = 0 + (((tickAnim - 249) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 249) / 3) * (0-(0)));
        }
        else if (tickAnim >= 252 && tickAnim < 304) {
            xx = 21.5 + (((tickAnim - 252) / 52) * (0.25-(21.5)));
            yy = 0 + (((tickAnim - 252) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 252) / 52) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 313) {
            xx = 0.25 + (((tickAnim - 304) / 9) * (-25.36-(0.25)));
            yy = 0 + (((tickAnim - 304) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 9) * (0-(0)));
        }
        else if (tickAnim >= 313 && tickAnim < 319) {
            xx = -25.36 + (((tickAnim - 313) / 6) * (-39.75-(-25.36)));
            yy = 0 + (((tickAnim - 313) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 313) / 6) * (0-(0)));
        }
        else if (tickAnim >= 319 && tickAnim < 323) {
            xx = -39.75 + (((tickAnim - 319) / 4) * (-38-(-39.75)));
            yy = 0 + (((tickAnim - 319) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 319) / 4) * (0-(0)));
        }
        else if (tickAnim >= 323 && tickAnim < 328) {
            xx = -38 + (((tickAnim - 323) / 5) * (-39.75-(-38)));
            yy = 0 + (((tickAnim - 323) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 323) / 5) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 343) {
            xx = -39.75 + (((tickAnim - 328) / 15) * (0.25-(-39.75)));
            yy = 0 + (((tickAnim - 328) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 15) * (0-(0)));
        }
        else if (tickAnim >= 343 && tickAnim < 351) {
            xx = 0.25 + (((tickAnim - 343) / 8) * (-25.36-(0.25)));
            yy = 0 + (((tickAnim - 343) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 343) / 8) * (0-(0)));
        }
        else if (tickAnim >= 351 && tickAnim < 358) {
            xx = -25.36 + (((tickAnim - 351) / 7) * (-39.75-(-25.36)));
            yy = 0 + (((tickAnim - 351) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 351) / 7) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 361) {
            xx = -39.75 + (((tickAnim - 358) / 3) * (-38-(-39.75)));
            yy = 0 + (((tickAnim - 358) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 3) * (0-(0)));
        }
        else if (tickAnim >= 361 && tickAnim < 366) {
            xx = -38 + (((tickAnim - 361) / 5) * (-39.75-(-38)));
            yy = 0 + (((tickAnim - 361) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 361) / 5) * (0-(0)));
        }
        else if (tickAnim >= 366 && tickAnim < 384) {
            xx = -39.75 + (((tickAnim - 366) / 18) * (0.25-(-39.75)));
            yy = 0 + (((tickAnim - 366) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 366) / 18) * (0-(0)));
        }
        else if (tickAnim >= 384 && tickAnim < 399) {
            xx = 0.25 + (((tickAnim - 384) / 15) * (-20.75-(0.25)));
            yy = 0 + (((tickAnim - 384) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 384) / 15) * (0-(0)));
        }
        else if (tickAnim >= 399 && tickAnim < 412) {
            xx = -20.75 + (((tickAnim - 399) / 13) * (-11.75-(-20.75)));
            yy = 0 + (((tickAnim - 399) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 399) / 13) * (0-(0)));
        }
        else if (tickAnim >= 412 && tickAnim < 417) {
            xx = -11.75 + (((tickAnim - 412) / 5) * (16.47254-(-11.75)));
            yy = 0 + (((tickAnim - 412) / 5) * (-3.57376-(0)));
            zz = 0 + (((tickAnim - 412) / 5) * (-1.56786-(0)));
        }
        else if (tickAnim >= 417 && tickAnim < 424) {
            xx = 16.47254 + (((tickAnim - 417) / 7) * (31.55634-(16.47254)));
            yy = -3.57376 + (((tickAnim - 417) / 7) * (-8.93441-(-3.57376)));
            zz = -1.56786 + (((tickAnim - 417) / 7) * (-3.91964-(-1.56786)));
        }
        else if (tickAnim >= 424 && tickAnim < 435) {
            xx = 31.55634 + (((tickAnim - 424) / 11) * (22.80634-(31.55634)));
            yy = -8.93441 + (((tickAnim - 424) / 11) * (-8.93441-(-8.93441)));
            zz = -3.91964 + (((tickAnim - 424) / 11) * (-3.91964-(-3.91964)));
        }
        else if (tickAnim >= 435 && tickAnim < 470) {
            xx = 22.80634 + (((tickAnim - 435) / 35) * (0-(22.80634)));
            yy = -8.93441 + (((tickAnim - 435) / 35) * (0-(-8.93441)));
            zz = -3.91964 + (((tickAnim - 435) / 35) * (0-(-3.91964)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 40) / 8) * (19.5-(0)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 19.5 + (((tickAnim - 48) / 7) * (0-(19.5)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 58) / 3) * (7.25-(0)));
            yy = 0 + (((tickAnim - 58) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 3) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 63) {
            xx = 7.25 + (((tickAnim - 61) / 2) * (0-(7.25)));
            yy = 0 + (((tickAnim - 61) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 2) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 63) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 15) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 78) / 9) * (19.5-(0)));
            yy = 0 + (((tickAnim - 78) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 9) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 93) {
            xx = 19.5 + (((tickAnim - 87) / 6) * (0-(19.5)));
            yy = 0 + (((tickAnim - 87) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 6) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 93) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 93) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 4) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 97) / 2) * (7.25-(0)));
            yy = 0 + (((tickAnim - 97) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 2) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 102) {
            xx = 7.25 + (((tickAnim - 99) / 3) * (0-(7.25)));
            yy = 0 + (((tickAnim - 99) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 3) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 102) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 102) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 18) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 120) / 15) * (26-(0)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 148) {
            xx = 26 + (((tickAnim - 135) / 13) * (0-(26)));
            yy = 0 + (((tickAnim - 135) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 13) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 148) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 148) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 9) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 161) {
            xx = 0 + (((tickAnim - 157) / 4) * (7.5-(0)));
            yy = 0 + (((tickAnim - 157) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 4) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 165) {
            xx = 7.5 + (((tickAnim - 161) / 4) * (0-(7.5)));
            yy = 0 + (((tickAnim - 161) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 4) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 304) {
            xx = 0 + (((tickAnim - 165) / 139) * (0-(0)));
            yy = 0 + (((tickAnim - 165) / 139) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 139) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 304) / 9) * (19.5-(0)));
            yy = 0 + (((tickAnim - 304) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 9) * (0-(0)));
        }
        else if (tickAnim >= 313 && tickAnim < 319) {
            xx = 19.5 + (((tickAnim - 313) / 6) * (0-(19.5)));
            yy = 0 + (((tickAnim - 313) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 313) / 6) * (0-(0)));
        }
        else if (tickAnim >= 319 && tickAnim < 323) {
            xx = 0 + (((tickAnim - 319) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 319) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 319) / 4) * (0-(0)));
        }
        else if (tickAnim >= 323 && tickAnim < 325) {
            xx = 0 + (((tickAnim - 323) / 2) * (7.25-(0)));
            yy = 0 + (((tickAnim - 323) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 323) / 2) * (0-(0)));
        }
        else if (tickAnim >= 325 && tickAnim < 328) {
            xx = 7.25 + (((tickAnim - 325) / 3) * (0-(7.25)));
            yy = 0 + (((tickAnim - 325) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 325) / 3) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 343) {
            xx = 0 + (((tickAnim - 328) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 328) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 15) * (0-(0)));
        }
        else if (tickAnim >= 343 && tickAnim < 351) {
            xx = 0 + (((tickAnim - 343) / 8) * (19.5-(0)));
            yy = 0 + (((tickAnim - 343) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 343) / 8) * (0-(0)));
        }
        else if (tickAnim >= 351 && tickAnim < 358) {
            xx = 19.5 + (((tickAnim - 351) / 7) * (0-(19.5)));
            yy = 0 + (((tickAnim - 351) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 351) / 7) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 361) {
            xx = 0 + (((tickAnim - 358) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 358) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 3) * (0-(0)));
        }
        else if (tickAnim >= 361 && tickAnim < 363) {
            xx = 0 + (((tickAnim - 361) / 2) * (7.25-(0)));
            yy = 0 + (((tickAnim - 361) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 361) / 2) * (0-(0)));
        }
        else if (tickAnim >= 363 && tickAnim < 366) {
            xx = 7.25 + (((tickAnim - 363) / 3) * (0-(7.25)));
            yy = 0 + (((tickAnim - 363) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 363) / 3) * (0-(0)));
        }
        else if (tickAnim >= 366 && tickAnim < 384) {
            xx = 0 + (((tickAnim - 366) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 366) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 366) / 18) * (0-(0)));
        }
        else if (tickAnim >= 384 && tickAnim < 399) {
            xx = 0 + (((tickAnim - 384) / 15) * (26-(0)));
            yy = 0 + (((tickAnim - 384) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 384) / 15) * (0-(0)));
        }
        else if (tickAnim >= 399 && tickAnim < 412) {
            xx = 26 + (((tickAnim - 399) / 13) * (0-(26)));
            yy = 0 + (((tickAnim - 399) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 399) / 13) * (0-(0)));
        }
        else if (tickAnim >= 412 && tickAnim < 421) {
            xx = 0 + (((tickAnim - 412) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 412) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 412) / 9) * (0-(0)));
        }
        else if (tickAnim >= 421 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 421) / 4) * (7.5-(0)));
            yy = 0 + (((tickAnim - 421) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 421) / 4) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 429) {
            xx = 7.5 + (((tickAnim - 425) / 4) * (0-(7.5)));
            yy = 0 + (((tickAnim - 425) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 216 && tickAnim < 228) {
            xx = 1 + (((tickAnim - 216) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 216) / 12) * (0.0125-(1)));
            zz = 1 + (((tickAnim - 216) / 12) * (1-(1)));
        }
        else if (tickAnim >= 228 && tickAnim < 238) {
            xx = 1 + (((tickAnim - 228) / 10) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 228) / 10) * (1-(0.0125)));
            zz = 1 + (((tickAnim - 228) / 10) * (1-(1)));
        }
        else if (tickAnim >= 238 && tickAnim < 260) {
            xx = 1 + (((tickAnim - 238) / 22) * (1-(1)));
            yy = 1 + (((tickAnim - 238) / 22) * (1-(1)));
            zz = 1 + (((tickAnim - 238) / 22) * (1-(1)));
        }
        else if (tickAnim >= 260 && tickAnim < 266) {
            xx = 1 + (((tickAnim - 260) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 260) / 6) * (0.0275-(1)));
            zz = 1 + (((tickAnim - 260) / 6) * (1-(1)));
        }
        else if (tickAnim >= 266 && tickAnim < 272) {
            xx = 1 + (((tickAnim - 266) / 6) * (1-(1)));
            yy = 0.0275 + (((tickAnim - 266) / 6) * (1-(0.0275)));
            zz = 1 + (((tickAnim - 266) / 6) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 148) {
            xx = 4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2 + (((tickAnim - 40) / 108) * (4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2-(4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2)));
            yy = 0 + (((tickAnim - 40) / 108) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 108) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 195) {
            xx = 4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2 + (((tickAnim - 148) / 47) * (0-(4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2)));
            yy = 0 + (((tickAnim - 148) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 47) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 273) {
            xx = 0 + (((tickAnim - 195) / 78) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 195) / 78) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 78) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 320) {
            xx = -1.25 + (((tickAnim - 273) / 47) * (4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2-(-1.25)));
            yy = 0 + (((tickAnim - 273) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 47) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 428) {
            xx = 4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2 + (((tickAnim - 320) / 108) * (4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2-(4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2)));
            yy = 0 + (((tickAnim - 320) / 108) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 108) * (0-(0)));
        }
        else if (tickAnim >= 428 && tickAnim < 470) {
            xx = 4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2 + (((tickAnim - 428) / 42) * (0-(4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2)));
            yy = 0 + (((tickAnim - 428) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 428) / 42) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 148) {
            xx = -3.5 + (((tickAnim - 40) / 108) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 40) / 108) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 108) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 195) {
            xx = -3.5 + (((tickAnim - 148) / 47) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 148) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 47) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 273) {
            xx = 0 + (((tickAnim - 195) / 78) * (0-(0)));
            yy = 0 + (((tickAnim - 195) / 78) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 78) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 273) / 47) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 273) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 47) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 428) {
            xx = -3.5 + (((tickAnim - 320) / 108) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 320) / 108) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 108) * (0-(0)));
        }
        else if (tickAnim >= 428 && tickAnim < 470) {
            xx = -3.5 + (((tickAnim - 428) / 42) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 428) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 428) / 42) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 148) {
            xx = -6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*3 + (((tickAnim - 40) / 108) * (-6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*3-(-6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*3)));
            yy = 0 + (((tickAnim - 40) / 108) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 108) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 195) {
            xx = -6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*3 + (((tickAnim - 148) / 47) * (0-(-6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*3)));
            yy = 0 + (((tickAnim - 148) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 47) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 273) {
            xx = 0 + (((tickAnim - 195) / 78) * (0-(0)));
            yy = 0 + (((tickAnim - 195) / 78) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 78) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 273) / 47) * (-6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*3-(0)));
            yy = 0 + (((tickAnim - 273) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 47) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 428) {
            xx = -6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*3 + (((tickAnim - 320) / 108) * (-6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*3-(-6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*3)));
            yy = 0 + (((tickAnim - 320) / 108) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 108) * (0-(0)));
        }
        else if (tickAnim >= 428 && tickAnim < 470) {
            xx = -6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*3 + (((tickAnim - 428) / 42) * (0-(-6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*3)));
            yy = 0 + (((tickAnim - 428) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 428) / 42) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*4-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 148) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*4 + (((tickAnim - 40) / 108) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*4-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*4)));
            yy = 0 + (((tickAnim - 40) / 108) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 108) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 195) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*4 + (((tickAnim - 148) / 47) * (0-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*4)));
            yy = 0 + (((tickAnim - 148) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 47) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 273) {
            xx = 0 + (((tickAnim - 195) / 78) * (0-(0)));
            yy = 0 + (((tickAnim - 195) / 78) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 78) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 273) / 47) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*4-(0)));
            yy = 0 + (((tickAnim - 273) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 47) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 428) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*4 + (((tickAnim - 320) / 108) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*4-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*4)));
            yy = 0 + (((tickAnim - 320) / 108) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 108) * (0-(0)));
        }
        else if (tickAnim >= 428 && tickAnim < 470) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*4 + (((tickAnim - 428) / 42) * (0-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*4)));
            yy = 0 + (((tickAnim - 428) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 428) / 42) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-300))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 148) {
            xx = -7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-300))*5 + (((tickAnim - 40) / 108) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*4-(-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-300))*5)));
            yy = 0 + (((tickAnim - 40) / 108) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 108) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 195) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*4 + (((tickAnim - 148) / 47) * (0-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*4)));
            yy = 0 + (((tickAnim - 148) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 47) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 273) {
            xx = 0 + (((tickAnim - 195) / 78) * (0-(0)));
            yy = 0 + (((tickAnim - 195) / 78) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 78) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 273) / 47) * (-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-300))*5-(0)));
            yy = 0 + (((tickAnim - 273) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 47) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 428) {
            xx = -7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-300))*5 + (((tickAnim - 320) / 108) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*4-(-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-300))*5)));
            yy = 0 + (((tickAnim - 320) / 108) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 108) * (0-(0)));
        }
        else if (tickAnim >= 428 && tickAnim < 470) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*4 + (((tickAnim - 428) / 42) * (0-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*4)));
            yy = 0 + (((tickAnim - 428) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 428) / 42) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPrenocephale entity = (EntityPrehistoricFloraPrenocephale) entitylivingbaseIn;
        int animCycle = 120;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 2.5 + (((tickAnim - 20) / 20) * (4.25-(2.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 4.25 + (((tickAnim - 40) / 40) * (-15-(4.25)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = -15 + (((tickAnim - 80) / 25) * (0-(-15)));
            yy = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.2-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 20) / 60) * (0-(0)));
            yy = -1.2 + (((tickAnim - 20) / 60) * (-1.2-(-1.2)));
            zz = 0 + (((tickAnim - 20) / 60) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            yy = -1.2 + (((tickAnim - 80) / 25) * (0-(-1.2)));
            zz = 0 + (((tickAnim - 80) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -10.5 + (((tickAnim - 20) / 20) * (-11.75-(-10.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -11.75 + (((tickAnim - 40) / 40) * (8-(-11.75)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = 8 + (((tickAnim - 80) / 25) * (0-(8)));
            yy = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = 15.5 + (((tickAnim - 20) / 60) * (13.5-(15.5)));
            yy = 0 + (((tickAnim - 20) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 60) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = 13.5 + (((tickAnim - 80) / 25) * (0-(13.5)));
            yy = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(0), leftLeg3.rotateAngleY + (float) Math.toRadians(0), leftLeg3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -8.5 + (((tickAnim - 20) / 60) * (-6.25-(-8.5)));
            yy = 0 + (((tickAnim - 20) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 60) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = -6.25 + (((tickAnim - 80) / 25) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -10.5 + (((tickAnim - 20) / 20) * (-11.75-(-10.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -11.75 + (((tickAnim - 40) / 40) * (8-(-11.75)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = 8 + (((tickAnim - 80) / 25) * (0-(8)));
            yy = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = 15.5 + (((tickAnim - 20) / 60) * (13.5-(15.5)));
            yy = 0 + (((tickAnim - 20) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 60) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = 13.5 + (((tickAnim - 80) / 25) * (0-(13.5)));
            yy = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(0), rightLeg3.rotateAngleY + (float) Math.toRadians(0), rightLeg3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -8.5 + (((tickAnim - 20) / 60) * (-6.25-(-8.5)));
            yy = 0 + (((tickAnim - 20) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 60) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = -6.25 + (((tickAnim - 80) / 25) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 6.5 + (((tickAnim - 20) / 20) * (11.5-(6.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 11.5 + (((tickAnim - 40) / 40) * (7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4.5-(11.5)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4.5 + (((tickAnim - 80) / 40) * (0-(7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4.5)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 40) / 80) * (0-(0)));
            yy = 0.2 + (((tickAnim - 40) / 80) * (0-(0.2)));
            zz = 0 + (((tickAnim - 40) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 11 + (((tickAnim - 20) / 20) * (14.75-(11)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 14.75 + (((tickAnim - 40) / 40) * (-6-(14.75)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -6 + (((tickAnim - 80) / 40) * (0-(-6)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));

        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 22.5 + (((tickAnim - 20) / 20) * (35.25-(22.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*5 + (((tickAnim - 20) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*5)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 35.25 + (((tickAnim - 40) / 40) * (0-(35.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*5 + (((tickAnim - 40) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*5)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 80) / 3) * (-5.45-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*5 + (((tickAnim - 80) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*5)));
            zz = 0 + (((tickAnim - 80) / 3) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 102) {
            xx = -5.45 + (((tickAnim - 83) / 19) * (9.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25-(-5.45)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*5 + (((tickAnim - 83) / 19) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*5)));
            zz = 0 + (((tickAnim - 83) / 19) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 120) {
            xx = 9.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25 + (((tickAnim - 102) / 18) * (0-(9.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*5 + (((tickAnim - 102) / 18) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*5)));
            zz = 0 + (((tickAnim - 102) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (42-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 42 + (((tickAnim - 10) / 10) * (33-(42)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*5 + (((tickAnim - 10) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 33 + (((tickAnim - 20) / 20) * (-1.75-(33)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*5 + (((tickAnim - 20) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*5)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -1.75 + (((tickAnim - 40) / 40) * (0-(-1.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*5 + (((tickAnim - 40) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*5)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 80) / 16) * (39.75-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*5 + (((tickAnim - 80) / 16) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*5)));
            zz = 0 + (((tickAnim - 80) / 16) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 120) {
            xx = 39.75 + (((tickAnim - 96) / 24) * (0-(39.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*5 + (((tickAnim - 96) / 24) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*5)));
            zz = 0 + (((tickAnim - 96) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 80) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 16) * (0.2-(0)));
            zz = 0 + (((tickAnim - 80) / 16) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 96) / 24) * (0-(0)));
            yy = 0.2 + (((tickAnim - 96) / 24) * (0-(0.2)));
            zz = 0 + (((tickAnim - 96) / 24) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 19.75 + (((tickAnim - 20) / 20) * (-20.5-(19.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*5 + (((tickAnim - 20) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*5)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -20.5 + (((tickAnim - 40) / 40) * (0-(-20.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*5 + (((tickAnim - 40) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*5)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 80) / 15) * (17.94-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*5 + (((tickAnim - 80) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*5)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 103) {
            xx = 17.94 + (((tickAnim - 95) / 8) * (-6.54-(17.94)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*5 + (((tickAnim - 95) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*5)));
            zz = 0 + (((tickAnim - 95) / 8) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 120) {
            xx = -6.54 + (((tickAnim - 103) / 17) * (0-(-6.54)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*5 + (((tickAnim - 103) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*5)));
            zz = 0 + (((tickAnim - 103) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 58) {
            xx = 8.5 + (((tickAnim - 40) / 18) * (9.85-(8.5)));
            yy = 0 + (((tickAnim - 40) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 18) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 9.85 + (((tickAnim - 58) / 22) * (0-(9.85)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 80 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -4.25 + (((tickAnim - 40) / 40) * (5.5-(-4.25)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 5.5 + (((tickAnim - 80) / 40) * (0-(5.5)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -14.75 + (((tickAnim - 40) / 40) * (3.75-(-14.75)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 3.75 + (((tickAnim - 80) / 40) * (0-(3.75)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -15.5 + (((tickAnim - 40) / 40) * (11.75-(-15.5)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 11.75 + (((tickAnim - 80) / 40) * (0-(11.75)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (40.25-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 40.25 + (((tickAnim - 80) / 40) * (0-(40.25)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (40.25-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 40.25 + (((tickAnim - 80) / 40) * (0-(40.25)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPrenocephale entity = (EntityPrehistoricFloraPrenocephale) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.5 + (((tickAnim - 10) / 10) * (0-(8.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 10) / 10) * (0-(10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 20.25 + (((tickAnim - 10) / 10) * (0-(20.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 23 + (((tickAnim - 10) / 10) * (0-(23)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (35.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 35.75 + (((tickAnim - 10) / 10) * (0-(35.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (28.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 28.75 + (((tickAnim - 10) / 10) * (0-(28.75)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.15 + (((tickAnim - 10) / 10) * (0-(0.15)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 4) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 22 + (((tickAnim - 4) / 6) * (9.64-(22)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.64 + (((tickAnim - 10) / 10) * (0-(9.64)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (13.92-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 13.92 + (((tickAnim - 4) / 6) * (-14-(13.92)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -14 + (((tickAnim - 10) / 10) * (0-(-14)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 26 + (((tickAnim - 4) / 6) * (0-(26)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPrenocephale entity = (EntityPrehistoricFloraPrenocephale) entitylivingbaseIn;
        int animCycle = 28;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5))*1.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254+90))*1), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254+80))*5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-50))*0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-120))*-0.8);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -17.75 + (((tickAnim - 0) / 13) * (14.98167-(-17.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (-2.57447-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (1.63843-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 14.98167 + (((tickAnim - 13) / 5) * (24.62924-(14.98167)));
            yy = -2.57447 + (((tickAnim - 13) / 5) * (-7.13929-(-2.57447)));
            zz = 1.63843 + (((tickAnim - 13) / 5) * (2.30437-(1.63843)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 24.62924 + (((tickAnim - 18) / 10) * (-17.75-(24.62924)));
            yy = -7.13929 + (((tickAnim - 18) / 10) * (0-(-7.13929)));
            zz = 2.30437 + (((tickAnim - 18) / 10) * (0-(2.30437)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -5.75 + (((tickAnim - 0) / 13) * (-10-(-5.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 13) / 5) * (16-(-10)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 16 + (((tickAnim - 18) / 3) * (33.81-(16)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 33.81 + (((tickAnim - 21) / 6) * (-15.21-(33.81)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -15.21 + (((tickAnim - 27) / 1) * (-5.75-(-15.21)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 7.75 + (((tickAnim - 0) / 13) * (8.25-(7.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 8.25 + (((tickAnim - 13) / 5) * (9.25-(8.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 9.25 + (((tickAnim - 18) / 5) * (-40.87-(9.25)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -40.87 + (((tickAnim - 23) / 2) * (-40.87-(-40.87)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -40.87 + (((tickAnim - 25) / 3) * (7.75-(-40.87)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 16.5 + (((tickAnim - 0) / 13) * (-13.25-(16.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -13.25 + (((tickAnim - 13) / 5) * (61.75-(-13.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 61.75 + (((tickAnim - 18) / 5) * (92.65-(61.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 92.65 + (((tickAnim - 23) / 2) * (92.65-(92.65)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 92.65 + (((tickAnim - 25) / 3) * (16.5-(92.65)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.65 + (((tickAnim - 0) / 3) * (0.43-(0.65)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.43 + (((tickAnim - 3) / 3) * (0.155-(0.43)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.155 + (((tickAnim - 6) / 4) * (0.68-(0.155)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.68 + (((tickAnim - 10) / 3) * (0.675-(0.68)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.675 + (((tickAnim - 13) / 5) * (0-(0.675)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.6-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0.13-(0)));
            zz = -0.6 + (((tickAnim - 18) / 7) * (-0.825-(-0.6)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0.13 + (((tickAnim - 25) / 3) * (0.65-(0.13)));
            zz = -0.825 + (((tickAnim - 25) / 3) * (0-(-0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 15.058 + (((tickAnim - 0) / 6) * (24.49527-(15.058)));
            yy = 3.1085 + (((tickAnim - 0) / 6) * (5.51383-(3.1085)));
            zz = -2.36368 + (((tickAnim - 0) / 6) * (-0.84395-(-2.36368)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 24.49527 + (((tickAnim - 6) / 10) * (-17.75-(24.49527)));
            yy = 5.51383 + (((tickAnim - 6) / 10) * (0-(5.51383)));
            zz = -0.84395 + (((tickAnim - 6) / 10) * (0-(-0.84395)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = -17.75 + (((tickAnim - 16) / 12) * (15.058-(-17.75)));
            yy = 0 + (((tickAnim - 16) / 12) * (3.1085-(0)));
            zz = 0 + (((tickAnim - 16) / 12) * (-2.36368-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -10 + (((tickAnim - 0) / 6) * (16-(-10)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 16 + (((tickAnim - 6) / 2) * (33.81-(16)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 33.81 + (((tickAnim - 8) / 6) * (-15.21-(33.81)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -15.21 + (((tickAnim - 14) / 2) * (-5.75-(-15.21)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = -5.75 + (((tickAnim - 16) / 12) * (-10-(-5.75)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 8.25 + (((tickAnim - 0) / 6) * (9.25-(8.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 9.25 + (((tickAnim - 6) / 4) * (-40.87-(9.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -40.87 + (((tickAnim - 10) / 3) * (-40.87-(-40.87)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -40.87 + (((tickAnim - 13) / 3) * (7.75-(-40.87)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 7.75 + (((tickAnim - 16) / 12) * (8.25-(7.75)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -13.25 + (((tickAnim - 0) / 6) * (61.75-(-13.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 61.75 + (((tickAnim - 6) / 4) * (92.65-(61.75)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 92.65 + (((tickAnim - 10) / 3) * (83.65-(92.65)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 83.65 + (((tickAnim - 13) / 3) * (16.5-(83.65)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 16.5 + (((tickAnim - 16) / 12) * (-13.25-(16.5)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.475 + (((tickAnim - 0) / 6) * (0-(0.475)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.6-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0.13-(0)));
            zz = -0.6 + (((tickAnim - 6) / 7) * (-0.75-(-0.6)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.13 + (((tickAnim - 13) / 3) * (0.525-(0.13)));
            zz = -0.75 + (((tickAnim - 13) / 3) * (0-(-0.75)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 16) / 2) * (0.205-(0.525)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.205 + (((tickAnim - 18) / 4) * (0.355-(0.205)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.355 + (((tickAnim - 22) / 3) * (0.845-(0.355)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0.845 + (((tickAnim - 25) / 3) * (0.475-(0.845)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-100))*1.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254+90))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254+140))*-5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-150))*1.5), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254+180))*3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-200))*3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-250))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(3.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-350))*3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-200))*3), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254+180))*5));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-280))*3), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254+180))*3));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-200))*3), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254+180))*5));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-280))*3), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254+180))*3));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-50))*1.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-50))*5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254+150))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-100))*1.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-100))*6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254+150))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-150))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-150))*8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254+200))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-200))*4), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-200))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254+200))*3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-250))*6), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-250))*15), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254+200))*3));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPrenocephale entity = (EntityPrehistoricFloraPrenocephale) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.5+20))*4), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580+90))*2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580+90))*2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.5+50))*1.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(00+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.5+20))*-1.2);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -22 + (((tickAnim - 0) / 7) * (32.75-(-22)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 32.75 + (((tickAnim - 7) / 6) * (-22-(32.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -13.25 + (((tickAnim - 0) / 7) * (22.5-(-13.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 22.5 + (((tickAnim - 7) / 1) * (25.53-(22.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 25.53 + (((tickAnim - 8) / 5) * (-13.25-(25.53)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 6.75 + (((tickAnim - 0) / 7) * (0-(6.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (-38.22-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -38.22 + (((tickAnim - 9) / 1) * (-38.22-(-38.22)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -38.22 + (((tickAnim - 10) / 3) * (6.75-(-38.22)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 27.75 + (((tickAnim - 0) / 2) * (11.9-(27.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 11.9 + (((tickAnim - 2) / 1) * (-13.44407-(11.9)));
            yy = 0 + (((tickAnim - 2) / 1) * (-0.08557-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0.4663-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -13.44407 + (((tickAnim - 3) / 4) * (62.25-(-13.44407)));
            yy = -0.08557 + (((tickAnim - 3) / 4) * (0-(-0.08557)));
            zz = 0.4663 + (((tickAnim - 3) / 4) * (0-(0.4663)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 62.25 + (((tickAnim - 7) / 2) * (90.94-(62.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 90.94 + (((tickAnim - 9) / 4) * (27.75-(90.94)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 2) * (0.425-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.425 + (((tickAnim - 2) / 1) * (-0.555-(0.425)));
            zz = 0 + (((tickAnim - 2) / 1) * (-0.24-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.555 + (((tickAnim - 3) / 4) * (0-(-0.555)));
            zz = -0.24 + (((tickAnim - 3) / 4) * (-0.65-(-0.24)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.515-(0)));
            zz = -0.65 + (((tickAnim - 7) / 2) * (-0.74-(-0.65)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.515 + (((tickAnim - 9) / 4) * (-0.175-(0.515)));
            zz = -0.74 + (((tickAnim - 9) / 4) * (0-(-0.74)));
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
            xx = 32.75 + (((tickAnim - 0) / 5) * (-22-(32.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -22 + (((tickAnim - 5) / 8) * (32.75-(-22)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 22.5 + (((tickAnim - 0) / 1) * (25.53-(22.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 25.53 + (((tickAnim - 1) / 4) * (-13.25-(25.53)));
            yy = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 4) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -13.25 + (((tickAnim - 5) / 8) * (22.5-(-13.25)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-38.22-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -38.22 + (((tickAnim - 2) / 1) * (-38.22-(-38.22)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -38.22 + (((tickAnim - 3) / 2) * (6.75-(-38.22)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 6.75 + (((tickAnim - 5) / 8) * (0-(6.75)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
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
            xx = 62.25 + (((tickAnim - 0) / 3) * (90.94-(62.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 90.94 + (((tickAnim - 3) / 2) * (27.75-(90.94)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 27.75 + (((tickAnim - 5) / 3) * (3.1-(27.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 3.1 + (((tickAnim - 8) / 5) * (62.25-(3.1)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.515-(0)));
            zz = -0.65 + (((tickAnim - 0) / 3) * (-0.74-(-0.65)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.515 + (((tickAnim - 3) / 2) * (-0.175-(0.515)));
            zz = -0.74 + (((tickAnim - 3) / 2) * (0-(-0.74)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = -0.175 + (((tickAnim - 5) / 4) * (0.48-(-0.175)));
            zz = 0 + (((tickAnim - 5) / 4) * (-0.255-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.48 + (((tickAnim - 9) / 4) * (0-(0.48)));
            zz = -0.255 + (((tickAnim - 9) / 4) * (-0.65-(-0.255)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.5-50))*-6), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580+90))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580+150))*2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.5-120))*7), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580+250))*2));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.5-120))*-9), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580+250))*2));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.5-180))*-9), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580+250))*2));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.5-120))*-9), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580+250))*2));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.5-180))*-9), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580+250))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.5-180))*-7), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.5-250))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.5))*2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580))*5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580+90))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.5-50))*3), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580-50))*8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580+150))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.5-100))*4), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580-100))*12), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580+200))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.5-150))*5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580-150))*15), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580+250))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.5-200))*6), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580-200))*18), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580+300))*2));


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPrenocephale e = (EntityPrehistoricFloraPrenocephale) entity;
        animator.update(entity);


    }
}
