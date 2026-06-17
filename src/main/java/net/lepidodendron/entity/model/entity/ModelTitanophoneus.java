package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTitanophoneus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTitanophoneus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r47;

    private ModelAnimator animator;

    public ModelTitanophoneus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 13.9956F, 3.0485F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(3.0F, -1.2576F, -1.2312F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3316F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 21, -7.0F, -3.425F, -3.775F, 8, 8, 8, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.7704F, -3.5355F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0305F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, -1.0081F, -10.2804F, 9, 9, 11, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.5961F, -9.3874F);
        this.body.addChild(body2);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.0F, 0.7958F, -1.743F);
        this.body2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 38, -7.0F, -2.0F, -2.0F, 8, 8, 4, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-0.1667F, 2.3591F, -2.8952F);
        this.body2.addChild(neck);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.2315F, 0.844F, -2.131F);
        this.neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6545F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 50, -2.5F, -1.5F, -3.5F, 5, 3, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.2315F, 0.4362F, -1.5358F);
        this.neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 50, -6.0F, -4.0F, -4.0F, 6, 4, 6, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.2315F, -3.7559F, -4.8007F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 60, 13, -3.0F, -0.5579F, -1.6978F, 6, 3, 2, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 53, 68, -2.5F, 1.4421F, -2.6978F, 5, 1, 1, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.3574F, -0.1751F, -2.1584F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2319F, 0.548F, 0.0889F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 55, 71, -1.375F, -0.425F, -1.05F, 2, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.0302F, -0.4632F, -2.6116F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4098F, 0.0997F, 0.0107F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 38, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.3396F, 0.1388F, -3.3416F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4664F, 0.5349F, 0.1621F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 73, -1.025F, -0.325F, -0.925F, 1, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.2214F, 0.3317F, -4.4368F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.9334F, 0.0997F, 0.0107F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 35, 67, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.003F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.3396F, 0.1388F, -3.3416F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4664F, -0.5349F, -0.1621F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 73, 0.025F, -0.325F, -0.925F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.2278F, -0.1751F, -2.2334F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2319F, 0.548F, 0.0889F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 73, 72, -0.65F, 0.05F, -0.3F, 1, 2, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.3574F, -0.1751F, -2.2334F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2319F, -0.548F, -0.0889F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 73, 72, -0.35F, 0.05F, -0.3F, 1, 2, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.3574F, -0.1751F, -2.1584F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2319F, -0.548F, -0.0889F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 55, 71, -0.625F, -0.425F, -1.05F, 2, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.2214F, 0.3317F, -4.4368F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.9334F, -0.0997F, -0.0107F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 67, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0302F, -0.4632F, -2.6116F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.4098F, -0.0997F, -0.0107F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 25, 38, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 2.0497F, -7.1384F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4363F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 53, 61, -0.5F, 0.0F, 0.0F, 2, 1, 5, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.5F, 3.4681F, -5.5169F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3927F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 38, 74, 2.9F, -0.3794F, 0.934F, 0, 1, 1, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 38, 74, 0.1F, -0.3794F, 0.934F, 0, 1, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 62, 19, 0.0F, -1.8794F, -0.066F, 3, 2, 4, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 66, 8, -0.5F, -0.8794F, 2.009F, 4, 1, 2, 0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, 3.3793F, -6.247F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1186F, 0.0114F, -0.1304F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 11, 69, 0.0F, -0.3F, 0.075F, 0, 2, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, 3.3793F, -6.247F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1186F, -0.0114F, 0.1304F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 11, 69, 0.0F, -0.3F, 0.075F, 0, 2, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 3.6048F, -5.5317F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3054F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 25, 42, -0.5F, -0.225F, -1.75F, 2, 1, 1, -0.01F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 46, 71, -0.5F, -1.0F, -2.0F, 2, 1, 2, 0.003F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.2673F, -0.6849F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 62, 26, -3.0F, 0.1748F, -1.013F, 6, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 68, 61, -2.5F, 0.1748F, -2.013F, 5, 1, 1, 0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 1.0278F, -2.1096F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 23, 61, -2.5F, 0.0F, 0.0F, 4, 1, 4, -0.006F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 2.6534F, -4.822F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2182F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 68, 64, -1.5F, -1.0F, 0.0F, 2, 1, 3, -0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 1.7299F, -6.596F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.48F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 73, -1.5F, -1.0F, 0.0F, 2, 1, 2, -0.006F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 1.9042F, -4.6036F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 25, 45, -1.5F, -1.0F, -2.2F, 2, 1, 1, -0.003F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 64, 72, -1.5F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.35F, 0.6189F, -2.8163F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 41, 74, 0.0F, -0.5F, -1.0F, 0, 1, 1, -0.01F, true));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 41, 74, -2.7F, -0.5F, -1.0F, 0, 1, 1, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.3F, 1.6254F, -3.9043F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3927F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 35, 74, 1.0F, -2.0576F, -0.5396F, 0, 2, 1, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 35, 74, -1.6F, -2.0576F, -0.5396F, 0, 2, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 1.4542F, -4.6036F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0873F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 15, 63, -1.5F, -1.0F, -2.0F, 2, 1, 1, -0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 0.1748F, -2.013F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2618F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 69, -2.0F, 0.0F, -2.975F, 3, 1, 2, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.0F, 1.1407F, -1.7542F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2618F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 35, 71, -3.0F, -1.0F, -1.0F, 4, 1, 1, 0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(2.0F, 0.6498F, -1.013F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.48F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 62, 30, -4.0F, -1.75F, -1.0F, 4, 2, 3, -0.01F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, 0.9421F, -2.1978F);
        this.head.addChild(eye);
        this.eye.cubeList.add(new ModelBox(eye, 66, 69, -2.0F, -0.5F, -0.5F, 4, 1, 1, 0.006F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.3677F, 4.9911F, -1.7785F);
        this.body2.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.3463F, -0.0447F, -0.1231F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.2038F, 0.2887F, -1.3602F);
        this.leftArm.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.5744F, 0.3332F, -0.468F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 40, 61, -2.7554F, -0.1736F, -0.3006F, 3, 6, 3, 0.0F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(2.9452F, 3.0741F, 2.8185F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.0F, 0.0F, 0.1309F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.0521F, 2.0193F, 0.2782F);
        this.leftArm2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1309F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 26, 67, -1.0F, -2.0F, -1.0F, 2, 5, 2, 0.0F, true));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.0521F, 4.2752F, 1.1982F);
        this.leftArm2.addChild(leftArm3);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.25F, 0.95F, -1.325F);
        this.leftArm3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3054F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 63, -1.75F, -0.5F, -2.0F, 3, 1, 4, 0.0F, true));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.3677F, 4.9911F, -1.7785F);
        this.body2.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.3463F, 0.0447F, 0.1231F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.2038F, 0.2887F, -1.3602F);
        this.rightArm.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.5744F, -0.3332F, 0.468F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 40, 61, -0.2446F, -0.1736F, -0.3006F, 3, 6, 3, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-2.9452F, 3.0741F, 2.8185F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.0F, 0.0F, -0.1309F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0521F, 2.0193F, 0.2782F);
        this.rightArm2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1309F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 26, 67, -1.0F, -2.0F, -1.0F, 2, 5, 2, 0.0F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0521F, 4.2752F, 1.1982F);
        this.rightArm2.addChild(rightArm3);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.25F, 0.95F, -1.325F);
        this.rightArm3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.3054F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 63, -1.25F, -0.5F, -2.0F, 3, 1, 4, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(3.0F, -1.2576F, 0.7688F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.0F, 0.0F, -0.3054F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.2993F, 0.0463F, 0.75F);
        this.leftLeg.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.1745F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 60, 36, -1.9248F, -1.0612F, -3.0262F, 4, 8, 4, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(-0.089F, 5.762F, -1.5374F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, -0.0873F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.1492F, -0.3996F, -0.1876F);
        this.leftLeg2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1745F, 0.0F, 0.3927F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 15, 67, -1.2131F, 0.1866F, -0.6675F, 3, 6, 2, -0.003F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.1992F, -0.2746F, -0.9376F);
        this.leftLeg2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.1745F, 0.0F, 0.3927F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 15, 67, -1.2131F, 0.1866F, -0.6675F, 3, 6, 2, 0.01F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-1.9714F, 4.3815F, 1.8124F);
        this.leftLeg2.addChild(leftLeg3);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.2772F, 0.3852F, -1.35F);
        this.leftLeg3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, 0.3927F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 41, 13, -1.7F, -0.5F, -3.15F, 4, 1, 5, 0.0F, true));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.0F, -1.2576F, 0.7688F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.0F, 0.0F, 0.3054F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.2993F, 0.0463F, 0.75F);
        this.rightLeg.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.1745F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 60, 36, -2.0752F, -1.0612F, -3.0262F, 4, 8, 4, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.089F, 5.762F, -1.5374F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, 0.0873F);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.1492F, -0.3996F, -0.1876F);
        this.rightLeg2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1745F, 0.0F, -0.3927F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 15, 67, -1.7869F, 0.1866F, -0.6675F, 3, 6, 2, -0.003F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.1992F, -0.2746F, -0.9376F);
        this.rightLeg2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1745F, 0.0F, -0.3927F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 15, 67, -1.7869F, 0.1866F, -0.6675F, 3, 6, 2, 0.01F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(1.9714F, 4.3815F, 1.8124F);
        this.rightLeg2.addChild(rightLeg3);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.2772F, 0.3852F, -1.35F);
        this.rightLeg3.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, -0.3927F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 41, 13, -2.3F, -0.5F, -3.15F, 4, 1, 5, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.0738F, 3.2036F);
        this.main.addChild(tail);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(1.5F, 1.2784F, 1.1609F);
        this.tail.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.5498F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 33, 36, -4.0F, -1.3F, -2.0F, 5, 5, 8, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 4.4158F, 5.9326F);
        this.tail.addChild(tail2);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, 1.1126F, 0.7532F);
        this.tail2.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.3971F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 51, -1.0F, -1.375F, -1.325F, 3, 3, 8, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 3.1736F, 6.2423F);
        this.tail2.addChild(tail3);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 2.2056F, 4.2974F);
        this.tail3.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.0916F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 41, 0, -1.0F, -2.275F, -5.0F, 2, 2, 10, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.6884F, 8.7772F);
        this.tail3.addChild(tail4);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.5F, 1.1625F, 5.5949F);
        this.tail4.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0829F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 33, 21, 0.0F, -1.625F, -6.0F, 1, 1, 13, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.11F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 0.6F;
        this.main.offsetX = 0.1F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(240);
        this.main.rotateAngleX = (float)Math.toRadians(-0);
        this.main.rotateAngleZ = (float)Math.toRadians(3);
        this.main.scaleChildren = true;
        float scaler = 0.45F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraTitanophoneus EntityMegalosaurus = (EntityPrehistoricFloraTitanophoneus) e;
        this.main.offsetZ = 0.35F;

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};

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
        EntityPrehistoricFloraTitanophoneus ee = (EntityPrehistoricFloraTitanophoneus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //threat
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) {
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.YAWN_ANIMATION) {
            animYawn(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) {
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
    }


    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTitanophoneus entity = (EntityPrehistoricFloraTitanophoneus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-6.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = -6.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 2) / 6) * (-41.6135-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*80-(-6.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 2) / 6) * (0.5207-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (-2.9544-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -41.6135-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*80 + (((tickAnim - 8) / 7) * (0-(-41.6135-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*80)));
            yy = 0.5207 + (((tickAnim - 8) / 7) * (0-(0.5207)));
            zz = -2.9544 + (((tickAnim - 8) / 7) * (0-(-2.9544)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (2.475-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 2.475 + (((tickAnim - 2) / 6) * (-66.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100-(2.475)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -66.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100 + (((tickAnim - 8) / 7) * (0-(-66.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (51.25-(0)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 51.25 + (((tickAnim - 8) / 2) * (0-(51.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTitanophoneus entity = (EntityPrehistoricFloraTitanophoneus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.5 + (((tickAnim - 10) / 10) * (0-(9.5)));
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
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.25 + (((tickAnim - 10) / 10) * (0-(0.25)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 17.5 + (((tickAnim - 10) / 3) * (17.12-(17.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 17.12 + (((tickAnim - 13) / 7) * (0-(17.12)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 13.5 + (((tickAnim - 5) / 5) * (-8.25-(13.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -8.25 + (((tickAnim - 10) / 3) * (6.5-(-8.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 6.5 + (((tickAnim - 13) / 2) * (12.83-(6.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 12.83 + (((tickAnim - 15) / 5) * (0-(12.83)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 21.25 + (((tickAnim - 5) / 5) * (39.25-(21.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 39.25 + (((tickAnim - 10) / 3) * (0-(39.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-28.0577-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.088-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-16.6134-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -28.0577 + (((tickAnim - 10) / 10) * (0-(-28.0577)));
            yy = -2.088 + (((tickAnim - 10) / 10) * (0-(-2.088)));
            zz = -16.6134 + (((tickAnim - 10) / 10) * (0-(-16.6134)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (17.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -20.25 + (((tickAnim - 10) / 10) * (0-(-20.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 17.25 + (((tickAnim - 10) / 10) * (0-(17.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 10) / 10) * (0-(25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-28.0577-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.088-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (16.6134-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -28.0577 + (((tickAnim - 10) / 10) * (0-(-28.0577)));
            yy = 2.088 + (((tickAnim - 10) / 10) * (0-(2.088)));
            zz = 16.6134 + (((tickAnim - 10) / 10) * (0-(16.6134)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-17.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -20.25 + (((tickAnim - 10) / 10) * (0-(-20.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -17.25 + (((tickAnim - 10) / 10) * (0-(-17.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 10) / 10) * (0-(25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTitanophoneus entity = (EntityPrehistoricFloraTitanophoneus) entitylivingbaseIn;
        int animCycle = 210;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = -14.775-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-15 + (((tickAnim - 0) / 15) * (-1.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1-(-14.775-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-15)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 111) {
            xx = -1.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1 + (((tickAnim - 15) / 96) * (-1.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1-(-1.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1)));
            yy = 0 + (((tickAnim - 15) / 96) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 96) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 131) {
            xx = -1.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1 + (((tickAnim - 111) / 20) * (-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1-(-1.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1)));
            yy = 0 + (((tickAnim - 111) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 20) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 191) {
            xx = -1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1 + (((tickAnim - 131) / 60) * (-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1-(-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1)));
            yy = 0 + (((tickAnim - 131) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 60) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 211) {
            xx = -1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1 + (((tickAnim - 191) / 20) * (0-(-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1)));
            yy = 0 + (((tickAnim - 191) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 191) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3 + (((tickAnim - 0) / 15) * (1.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 111) {
            xx = 1.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1 + (((tickAnim - 15) / 96) * (1.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1-(1.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1)));
            yy = 0 + (((tickAnim - 15) / 96) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 96) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 131) {
            xx = 1.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1 + (((tickAnim - 111) / 20) * (-4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1-(1.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1)));
            yy = 0 + (((tickAnim - 111) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 20) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 191) {
            xx = -4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1 + (((tickAnim - 131) / 60) * (-4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1-(-4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1)));
            yy = 0 + (((tickAnim - 131) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 60) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 211) {
            xx = -4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1 + (((tickAnim - 191) / 20) * (0-(-4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.1)));
            yy = 0 + (((tickAnim - 191) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 191) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-29 + (((tickAnim - 0) / 15) * (19.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*1.5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-29)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 111) {
            xx = 19.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*1.5 + (((tickAnim - 15) / 96) * (19.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*1-(19.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*1.5)));
            yy = 0 + (((tickAnim - 15) / 96) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 96) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 119) {
            xx = 19.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*1 + (((tickAnim - 111) / 8) * (6.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-300))*20-(19.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*1)));
            yy = 0 + (((tickAnim - 111) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 8) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 123) {
            xx = 6.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-300))*20 + (((tickAnim - 119) / 4) * (7.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-120))*-20-(6.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-300))*20)));
            yy = 0 + (((tickAnim - 119) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 4) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 131) {
            xx = 7.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-120))*-20 + (((tickAnim - 123) / 8) * (19.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*1.5-(7.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-120))*-20)));
            yy = 0 + (((tickAnim - 123) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 8) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 191) {
            xx = 19.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*1.5 + (((tickAnim - 131) / 60) * (19.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*1.5-(19.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*1.5)));
            yy = 0 + (((tickAnim - 131) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 60) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 211) {
            xx = 19.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*1.5 + (((tickAnim - 191) / 20) * (0-(19.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*1.5)));
            yy = 0 + (((tickAnim - 191) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 191) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1 + (((tickAnim - 0) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 4) * (0.075-(1)));
            zz = 1 + (((tickAnim - 0) / 4) * (1-(1)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 4) / 2) * (1-(1)));
            yy = 0.075 + (((tickAnim - 4) / 2) * (0.075-(0.075)));
            zz = 1 + (((tickAnim - 4) / 2) * (1-(1)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 6) / 4) * (1-(1)));
            yy = 0.075 + (((tickAnim - 6) / 4) * (1-(0.075)));
            zz = 1 + (((tickAnim - 6) / 4) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 116) {
            xx = 1 + (((tickAnim - 10) / 106) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 106) * (1-(1)));
            zz = 1 + (((tickAnim - 10) / 106) * (1-(1)));
        }
        else if (tickAnim >= 116 && tickAnim < 120) {
            xx = 1 + (((tickAnim - 116) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 116) / 4) * (0.0425-(1)));
            zz = 1 + (((tickAnim - 116) / 4) * (1-(1)));
        }
        else if (tickAnim >= 120 && tickAnim < 122) {
            xx = 1 + (((tickAnim - 120) / 2) * (1-(1)));
            yy = 0.0425 + (((tickAnim - 120) / 2) * (0.0425-(0.0425)));
            zz = 1 + (((tickAnim - 120) / 2) * (1-(1)));
        }
        else if (tickAnim >= 122 && tickAnim < 126) {
            xx = 1 + (((tickAnim - 122) / 4) * (1-(1)));
            yy = 0.0425 + (((tickAnim - 122) / 4) * (1-(0.0425)));
            zz = 1 + (((tickAnim - 122) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animYawn(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTitanophoneus entity = (EntityPrehistoricFloraTitanophoneus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (10.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 10.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*10 + (((tickAnim - 23) / 27) * (0-(10.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*10)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-15.725-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -15.725 + (((tickAnim - 23) / 5) * (-11.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*-40-(-15.725)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -11.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*-40 + (((tickAnim - 28) / 22) * (0-(-11.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*-40)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (47.985-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 47.985 + (((tickAnim - 18) / 10) * (53.035-(47.985)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 53.035 + (((tickAnim - 28) / 7) * (95.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*90-(53.035)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 95.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*90 + (((tickAnim - 35) / 13) * (0-(95.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*90)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 0) / 23) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 23) * (0.135-(1)));
            zz = 1 + (((tickAnim - 0) / 23) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 1 + (((tickAnim - 23) / 4) * (1-(1)));
            yy = 0.135 + (((tickAnim - 23) / 4) * (0.135-(0.135)));
            zz = 1 + (((tickAnim - 23) / 4) * (1-(1)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 27) / 13) * (1-(1)));
            yy = 0.135 + (((tickAnim - 27) / 13) * (1-(0.135)));
            zz = 1 + (((tickAnim - 27) / 13) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTitanophoneus entity = (EntityPrehistoricFloraTitanophoneus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.06-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.074-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (3.9996-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -1.06 + (((tickAnim - 5) / 5) * (0-(-1.06)));
            yy = 0.074 + (((tickAnim - 5) / 5) * (0-(0.074)));
            zz = 3.9996 + (((tickAnim - 5) / 5) * (0-(3.9996)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-2.1198-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-0.1483-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-3.9973-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.1198 + (((tickAnim - 15) / 5) * (-4.25-(-2.1198)));
            yy = -0.1483 + (((tickAnim - 15) / 5) * (0-(-0.1483)));
            zz = -3.9973 + (((tickAnim - 15) / 5) * (0-(-3.9973)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -4.25 + (((tickAnim - 20) / 13) * (0.5-(-4.25)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0.5 + (((tickAnim - 33) / 17) * (0-(0.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.37-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -2.37 + (((tickAnim - 10) / 10) * (-4.05-(-2.37)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = -4.05 + (((tickAnim - 20) / 13) * (-3.7-(-4.05)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = -3.7 + (((tickAnim - 33) / 17) * (0-(-3.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.0642-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.048-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-3.9998-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -1.0642 + (((tickAnim - 5) / 5) * (-4.6234-(-1.0642)));
            yy = 0.048 + (((tickAnim - 5) / 5) * (0.0551-(0.048)));
            zz = -3.9998 + (((tickAnim - 5) / 5) * (0.8335-(-3.9998)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -4.6234 + (((tickAnim - 10) / 5) * (-4.4292-(-4.6234)));
            yy = 0.0551 + (((tickAnim - 10) / 5) * (0.2031-(0.0551)));
            zz = 0.8335 + (((tickAnim - 10) / 5) * (4.1631-(0.8335)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -4.4292 + (((tickAnim - 15) / 5) * (-4.25-(-4.4292)));
            yy = 0.2031 + (((tickAnim - 15) / 5) * (0-(0.2031)));
            zz = 4.1631 + (((tickAnim - 15) / 5) * (0-(4.1631)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -4.25 + (((tickAnim - 20) / 13) * (-2.98-(-4.25)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -2.98 + (((tickAnim - 33) / 4) * (-5.02-(-2.98)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -5.02 + (((tickAnim - 37) / 5) * (0-(-5.02)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (-0.9003-(0)));
            yy = 0 + (((tickAnim - 42) / 4) * (-0.8205-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (-0.0987-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -0.9003 + (((tickAnim - 46) / 4) * (0-(-0.9003)));
            yy = -0.8205 + (((tickAnim - 46) / 4) * (0-(-0.8205)));
            zz = -0.0987 + (((tickAnim - 46) / 4) * (0-(-0.0987)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1.6865-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.0589-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.9992-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.6865 + (((tickAnim - 5) / 5) * (3.3115-(1.6865)));
            yy = 0.0589 + (((tickAnim - 5) / 5) * (0.0589-(0.0589)));
            zz = -1.9992 + (((tickAnim - 5) / 5) * (-1.9992-(-1.9992)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 3.3115 + (((tickAnim - 10) / 5) * (5.0254-(3.3115)));
            yy = 0.0589 + (((tickAnim - 10) / 5) * (0.2335-(0.0589)));
            zz = -1.9992 + (((tickAnim - 10) / 5) * (-1.9889-(-1.9992)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 5.0254 + (((tickAnim - 15) / 5) * (6.75-(5.0254)));
            yy = 0.2335 + (((tickAnim - 15) / 5) * (0-(0.2335)));
            zz = -1.9889 + (((tickAnim - 15) / 5) * (0-(-1.9889)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 6.75 + (((tickAnim - 20) / 13) * (0-(6.75)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (7.25-(0)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 7.25 + (((tickAnim - 37) / 5) * (-2.25-(7.25)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -2.25 + (((tickAnim - 42) / 4) * (7.095-(-2.25)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 7.095 + (((tickAnim - 46) / 4) * (0-(7.095)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 0) / 20) * (4.3014-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-8-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*5 + (((tickAnim - 0) / 20) * (-0.4945-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*5)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.7127-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 4.3014-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-8 + (((tickAnim - 20) / 13) * (17.5764-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-12-(4.3014-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-8)));
            yy = -0.4945 + (((tickAnim - 20) / 13) * (-0.4945-(-0.4945)));
            zz = -0.7127 + (((tickAnim - 20) / 13) * (-0.7127-(-0.7127)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 17.5764-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-12 + (((tickAnim - 33) / 17) * (0-(17.5764-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-12)));
            yy = -0.4945 + (((tickAnim - 33) / 17) * (0-(-0.4945)));
            zz = -0.7127 + (((tickAnim - 33) / 17) * (0-(-0.7127)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15 + (((tickAnim - 0) / 20) * (6.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15)));
            yy = -8.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-120))*10 + (((tickAnim - 0) / 20) * (0-(-8.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-120))*10)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 6.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15 + (((tickAnim - 20) / 13) * (-16.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*15-(6.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -16.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*15 + (((tickAnim - 33) / 17) * (0-(-16.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*15)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.75-(0)));
            yy = 2.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-190))*15 + (((tickAnim - 0) / 20) * (0-(2.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-190))*15)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 6.75 + (((tickAnim - 20) / 13) * (11.75-(6.75)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 33) / 17) * (0-(11.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.75-(0)));
            yy = 18.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*20 + (((tickAnim - 0) / 20) * (0-(18.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-250))*20)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 7.75 + (((tickAnim - 20) / 13) * (15.25-(7.75)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 15.25 + (((tickAnim - 33) / 17) * (0-(15.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -8.5 + (((tickAnim - 20) / 13) * (-4.25-(-8.5)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -4.25 + (((tickAnim - 33) / 4) * (89.42-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*95-(-4.25)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 89.42-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*95 + (((tickAnim - 37) / 13) * (0-(89.42-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*95)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.4-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0.4 + (((tickAnim - 20) / 13) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -19.25 + (((tickAnim - 5) / 5) * (-3-(-19.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -3 + (((tickAnim - 10) / 4) * (-20.75-(-3)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -20.75 + (((tickAnim - 14) / 4) * (13.9264-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-12-(-20.75)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 13.9264-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-12 + (((tickAnim - 18) / 15) * (-13.75-(13.9264-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-12)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -13.75 + (((tickAnim - 33) / 7) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (249.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-25))*255-(0)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 249.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-25))*255 + (((tickAnim - 46) / 4) * (0-(249.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-25))*255)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (34.87-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 34.87 + (((tickAnim - 5) / 5) * (0-(34.87)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (42.25-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 42.25 + (((tickAnim - 14) / 4) * (0-(42.25)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (31.5-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 31.5 + (((tickAnim - 26) / 7) * (42-(31.5)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 42 + (((tickAnim - 33) / 7) * (0-(42)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-27.4389-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.5648-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-17.2367-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -27.4389 + (((tickAnim - 5) / 5) * (-23.2447-(-27.4389)));
            yy = -0.5648 + (((tickAnim - 5) / 5) * (14.3248-(-0.5648)));
            zz = -17.2367 + (((tickAnim - 5) / 5) * (8.5461-(-17.2367)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -23.2447 + (((tickAnim - 10) / 10) * (-18.5705-(-23.2447)));
            yy = 14.3248 + (((tickAnim - 10) / 10) * (2.95-(14.3248)));
            zz = 8.5461 + (((tickAnim - 10) / 10) * (17.2241-(8.5461)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -18.5705 + (((tickAnim - 20) / 13) * (-8.8542-(-18.5705)));
            yy = 2.95 + (((tickAnim - 20) / 13) * (2.3982-(2.95)));
            zz = 17.2241 + (((tickAnim - 20) / 13) * (4.3889-(17.2241)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -8.8542 + (((tickAnim - 33) / 8) * (-31.8542-(-8.8542)));
            yy = 2.3982 + (((tickAnim - 33) / 8) * (2.3982-(2.3982)));
            zz = 4.3889 + (((tickAnim - 33) / 8) * (4.3889-(4.3889)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = -31.8542 + (((tickAnim - 41) / 4) * (10.6522-(-31.8542)));
            yy = 2.3982 + (((tickAnim - 41) / 4) * (-8.8419-(2.3982)));
            zz = 4.3889 + (((tickAnim - 41) / 4) * (-11.3461-(4.3889)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 10.6522 + (((tickAnim - 45) / 5) * (0-(10.6522)));
            yy = -8.8419 + (((tickAnim - 45) / 5) * (0-(-8.8419)));
            zz = -11.3461 + (((tickAnim - 45) / 5) * (0-(-11.3461)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-24.3195-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.241-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-5.5912-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -24.3195 + (((tickAnim - 5) / 5) * (14.6943-(-24.3195)));
            yy = 0.241 + (((tickAnim - 5) / 5) * (0.482-(0.241)));
            zz = -5.5912 + (((tickAnim - 5) / 5) * (-11.1825-(-5.5912)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 14.6943 + (((tickAnim - 10) / 10) * (23.722-(14.6943)));
            yy = 0.482 + (((tickAnim - 10) / 10) * (0.9641-(0.482)));
            zz = -11.1825 + (((tickAnim - 10) / 10) * (-22.365-(-11.1825)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 23.722 + (((tickAnim - 20) / 13) * (11.9511-(23.722)));
            yy = 0.9641 + (((tickAnim - 20) / 13) * (-1.09-(0.9641)));
            zz = -22.365 + (((tickAnim - 20) / 13) * (5.1359-(-22.365)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 11.9511 + (((tickAnim - 33) / 8) * (20.9511-(11.9511)));
            yy = -1.09 + (((tickAnim - 33) / 8) * (-1.09-(-1.09)));
            zz = 5.1359 + (((tickAnim - 33) / 8) * (5.1359-(5.1359)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 20.9511 + (((tickAnim - 41) / 4) * (-37.4242-(20.9511)));
            yy = -1.09 + (((tickAnim - 41) / 4) * (25.3232-(-1.09)));
            zz = 5.1359 + (((tickAnim - 41) / 4) * (-15.7132-(5.1359)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -37.4242 + (((tickAnim - 45) / 5) * (0-(-37.4242)));
            yy = 25.3232 + (((tickAnim - 45) / 5) * (0-(25.3232)));
            zz = -15.7132 + (((tickAnim - 45) / 5) * (0-(-15.7132)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.3-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -0.3 + (((tickAnim - 20) / 13) * (0-(-0.3)));
            yy = -0.35 + (((tickAnim - 20) / 13) * (0-(-0.35)));
            zz = -0.225 + (((tickAnim - 20) / 13) * (0-(-0.225)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (90.4389-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.0556-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.7479-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 90.4389 + (((tickAnim - 5) / 5) * (9.3778-(90.4389)));
            yy = 0.0556 + (((tickAnim - 5) / 5) * (0.1111-(0.0556)));
            zz = 0.7479 + (((tickAnim - 5) / 5) * (1.4958-(0.7479)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.3778 + (((tickAnim - 10) / 10) * (-3.6926-(9.3778)));
            yy = 0.1111 + (((tickAnim - 10) / 10) * (7.2368-(0.1111)));
            zz = 1.4958 + (((tickAnim - 10) / 10) * (3.2561-(1.4958)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -3.6926 + (((tickAnim - 20) / 13) * (0-(-3.6926)));
            yy = 7.2368 + (((tickAnim - 20) / 13) * (0-(7.2368)));
            zz = 3.2561 + (((tickAnim - 20) / 13) * (-9.5-(3.2561)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 33) / 8) * (11.75-(0)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = -9.5 + (((tickAnim - 33) / 8) * (-9.5-(-9.5)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 11.75 + (((tickAnim - 41) / 4) * (105.1591-(11.75)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = -9.5 + (((tickAnim - 41) / 4) * (-5.1818-(-9.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 105.1591 + (((tickAnim - 45) / 5) * (0-(105.1591)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = -5.1818 + (((tickAnim - 45) / 5) * (0-(-5.1818)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.09-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.675-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.09 + (((tickAnim - 5) / 5) * (-0.405-(-0.09)));
            zz = -0.675 + (((tickAnim - 5) / 5) * (-0.45-(-0.675)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.405 + (((tickAnim - 10) / 10) * (-0.525-(-0.405)));
            zz = -0.45 + (((tickAnim - 10) / 10) * (0-(-0.45)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = -0.525 + (((tickAnim - 20) / 13) * (-0.02-(-0.525)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            yy = -0.02 + (((tickAnim - 33) / 8) * (0-(-0.02)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 4) * (0.85-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (-1.225-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.85 + (((tickAnim - 45) / 5) * (0-(0.85)));
            zz = -1.225 + (((tickAnim - 45) / 5) * (0-(-1.225)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (22.9648-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1.475-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-8.6121-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 22.9648 + (((tickAnim - 10) / 5) * (-22.228-(22.9648)));
            yy = -1.475 + (((tickAnim - 10) / 5) * (2.5413-(-1.475)));
            zz = -8.6121 + (((tickAnim - 10) / 5) * (-5.094-(-8.6121)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -22.228 + (((tickAnim - 15) / 5) * (-18.5705-(-22.228)));
            yy = 2.5413 + (((tickAnim - 15) / 5) * (-2.95-(2.5413)));
            zz = -5.094 + (((tickAnim - 15) / 5) * (-17.2241-(-5.094)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -18.5705 + (((tickAnim - 20) / 12) * (-15.0733-(-18.5705)));
            yy = -2.95 + (((tickAnim - 20) / 12) * (-1.2455-(-2.95)));
            zz = -17.2241 + (((tickAnim - 20) / 12) * (-2.1689-(-17.2241)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -15.0733 + (((tickAnim - 32) / 5) * (20.6834-(-15.0733)));
            yy = -1.2455 + (((tickAnim - 32) / 5) * (6.4085-(-1.2455)));
            zz = -2.1689 + (((tickAnim - 32) / 5) * (9.0052-(-2.1689)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 20.6834 + (((tickAnim - 37) / 5) * (12.5889-(20.6834)));
            yy = 6.4085 + (((tickAnim - 37) / 5) * (6.3607-(6.4085)));
            zz = 9.0052 + (((tickAnim - 37) / 5) * (-4.4084-(9.0052)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 12.5889 + (((tickAnim - 42) / 4) * (0.2281-(12.5889)));
            yy = 6.3607 + (((tickAnim - 42) / 4) * (2.7313-(6.3607)));
            zz = -4.4084 + (((tickAnim - 42) / 4) * (-2.6752-(-4.4084)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0.2281 + (((tickAnim - 46) / 4) * (0-(0.2281)));
            yy = 2.7313 + (((tickAnim - 46) / 4) * (0-(2.7313)));
            zz = -2.6752 + (((tickAnim - 46) / 4) * (0-(-2.6752)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (18.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-27.1284-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-20.4548-(0)));
            zz = 18.75 + (((tickAnim - 10) / 5) * (12.5413-(18.75)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -27.1284 + (((tickAnim - 15) / 5) * (23.722-(-27.1284)));
            yy = -20.4548 + (((tickAnim - 15) / 5) * (-0.9641-(-20.4548)));
            zz = 12.5413 + (((tickAnim - 15) / 5) * (22.365-(12.5413)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 23.722 + (((tickAnim - 20) / 12) * (18.9767-(23.722)));
            yy = -0.9641 + (((tickAnim - 20) / 12) * (0.8544-(-0.9641)));
            zz = 22.365 + (((tickAnim - 20) / 12) * (-3.1357-(22.365)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 18.9767 + (((tickAnim - 32) / 2) * (-18.3842-(18.9767)));
            yy = 0.8544 + (((tickAnim - 32) / 2) * (-12.991-(0.8544)));
            zz = -3.1357 + (((tickAnim - 32) / 2) * (6.235-(-3.1357)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -18.3842 + (((tickAnim - 34) / 3) * (-8.7451-(-18.3842)));
            yy = -12.991 + (((tickAnim - 34) / 3) * (-26.8365-(-12.991)));
            zz = 6.235 + (((tickAnim - 34) / 3) * (15.6056-(6.235)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -8.7451 + (((tickAnim - 37) / 5) * (18-(-8.7451)));
            yy = -26.8365 + (((tickAnim - 37) / 5) * (0-(-26.8365)));
            zz = 15.6056 + (((tickAnim - 37) / 5) * (10-(15.6056)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 18 + (((tickAnim - 42) / 4) * (-4-(18)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 10 + (((tickAnim - 42) / 4) * (5-(10)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 46) / 4) * (0-(-4)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 5 + (((tickAnim - 46) / 4) * (0-(5)));
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
            xx = 0 + (((tickAnim - 10) / 10) * (-0.3-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-0.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -0.3 + (((tickAnim - 20) / 12) * (0-(-0.3)));
            yy = -0.35 + (((tickAnim - 20) / 12) * (-0.175-(-0.35)));
            zz = -0.225 + (((tickAnim - 20) / 12) * (0-(-0.225)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = -0.175 + (((tickAnim - 32) / 5) * (0.38-(-0.175)));
            zz = 0 + (((tickAnim - 32) / 5) * (0.075-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            yy = 0.38 + (((tickAnim - 37) / 5) * (-0.3-(0.38)));
            zz = 0.075 + (((tickAnim - 37) / 5) * (-0.075-(0.075)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = -0.3 + (((tickAnim - 42) / 8) * (0-(-0.3)));
            zz = -0.075 + (((tickAnim - 42) / 8) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.0445-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.1111-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.4957-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.0445 + (((tickAnim - 10) / 3) * (104.8056-(12.0445)));
            yy = -0.1111 + (((tickAnim - 10) / 3) * (-0.1389-(-0.1111)));
            zz = -1.4957 + (((tickAnim - 10) / 3) * (-1.8697-(-1.4957)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 104.8056 + (((tickAnim - 13) / 2) * (93.0668-(104.8056)));
            yy = -0.1389 + (((tickAnim - 13) / 2) * (-0.1667-(-0.1389)));
            zz = -1.8697 + (((tickAnim - 13) / 2) * (-2.2436-(-1.8697)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 93.0668 + (((tickAnim - 15) / 5) * (-4.2443-(93.0668)));
            yy = -0.1667 + (((tickAnim - 15) / 5) * (-0.2222-(-0.1667)));
            zz = -2.2436 + (((tickAnim - 15) / 5) * (-2.9915-(-2.2436)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -4.2443 + (((tickAnim - 20) / 12) * (-1.7527-(-4.2443)));
            yy = -0.2222 + (((tickAnim - 20) / 12) * (-0.0526-(-0.2222)));
            zz = -2.9915 + (((tickAnim - 20) / 12) * (6-(-2.9915)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -1.7527 + (((tickAnim - 32) / 5) * (102.7473-(-1.7527)));
            yy = -0.0526 + (((tickAnim - 32) / 5) * (-0.0526-(-0.0526)));
            zz = 6 + (((tickAnim - 32) / 5) * (6-(6)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 102.7473 + (((tickAnim - 37) / 2) * (8.3565-(102.7473)));
            yy = -0.0526 + (((tickAnim - 37) / 2) * (-0.1422-(-0.0526)));
            zz = 6 + (((tickAnim - 37) / 2) * (-10.1924-(6)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 8.3565 + (((tickAnim - 39) / 3) * (-28.1679-(8.3565)));
            yy = -0.1422 + (((tickAnim - 39) / 3) * (-2.2462-(-0.1422)));
            zz = -10.1924 + (((tickAnim - 39) / 3) * (-4.1864-(-10.1924)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -28.1679 + (((tickAnim - 42) / 4) * (-1.5741-(-28.1679)));
            yy = -2.2462 + (((tickAnim - 42) / 4) * (-1.1369-(-2.2462)));
            zz = -4.1864 + (((tickAnim - 42) / 4) * (-2.5931-(-4.1864)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -1.5741 + (((tickAnim - 46) / 4) * (0-(-1.5741)));
            yy = -1.1369 + (((tickAnim - 46) / 4) * (0-(-1.1369)));
            zz = -2.5931 + (((tickAnim - 46) / 4) * (0-(-2.5931)));
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
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.735-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-1.145-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.735 + (((tickAnim - 13) / 2) * (-0.28-(0.735)));
            zz = -1.145 + (((tickAnim - 13) / 2) * (-0.85-(-1.145)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.28 + (((tickAnim - 15) / 5) * (-0.375-(-0.28)));
            zz = -0.85 + (((tickAnim - 15) / 5) * (0-(-0.85)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = -0.375 + (((tickAnim - 20) / 12) * (0.03-(-0.375)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = 0.03 + (((tickAnim - 32) / 5) * (0.605-(0.03)));
            zz = 0 + (((tickAnim - 32) / 5) * (-1.325-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            yy = 0.605 + (((tickAnim - 37) / 5) * (-0.6-(0.605)));
            zz = -1.325 + (((tickAnim - 37) / 5) * (0-(-1.325)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            yy = -0.6 + (((tickAnim - 42) / 4) * (0.05-(-0.6)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0.05 + (((tickAnim - 46) / 4) * (0-(0.05)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.62-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 17.62 + (((tickAnim - 10) / 5) * (-20.32-(17.62)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -20.32 + (((tickAnim - 15) / 5) * (4.75-(-20.32)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 4.75 + (((tickAnim - 20) / 12) * (-0.75-(4.75)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -0.75 + (((tickAnim - 32) / 5) * (15.15-(-0.75)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 15.15 + (((tickAnim - 37) / 5) * (19.5-(15.15)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 19.5 + (((tickAnim - 42) / 8) * (0-(19.5)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (48.5837-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (18.1067-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-8.8424-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 48.5837 + (((tickAnim - 15) / 5) * (0-(48.5837)));
            yy = 18.1067 + (((tickAnim - 15) / 5) * (0-(18.1067)));
            zz = -8.8424 + (((tickAnim - 15) / 5) * (0-(-8.8424)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (43.1677-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (1.2569-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (-13.8134-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 43.1677 + (((tickAnim - 37) / 5) * (0-(43.1677)));
            yy = 1.2569 + (((tickAnim - 37) / 5) * (0-(1.2569)));
            zz = -13.8134 + (((tickAnim - 37) / 5) * (0-(-13.8134)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.575-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.8-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.575 + (((tickAnim - 15) / 5) * (0-(0.575)));
            zz = -0.8 + (((tickAnim - 15) / 5) * (0-(-0.8)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (0.35-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (-0.5-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            yy = 0.35 + (((tickAnim - 37) / 5) * (0-(0.35)));
            zz = -0.5 + (((tickAnim - 37) / 5) * (0-(-0.5)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-7.2074-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.7872-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-6.2004-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -7.2074 + (((tickAnim - 5) / 5) * (0-(-7.2074)));
            yy = -0.7872 + (((tickAnim - 5) / 5) * (0-(-0.7872)));
            zz = -6.2004 + (((tickAnim - 5) / 5) * (0-(-6.2004)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (14.1252-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-1.9024-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (7.5144-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 14.1252 + (((tickAnim - 13) / 2) * (19.1732-(14.1252)));
            yy = -1.9024 + (((tickAnim - 13) / 2) * (7.5616-(-1.9024)));
            zz = 7.5144 + (((tickAnim - 13) / 2) * (2.62-(7.5144)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 19.1732 + (((tickAnim - 15) / 5) * (0-(19.1732)));
            yy = 7.5616 + (((tickAnim - 15) / 5) * (0-(7.5616)));
            zz = 2.62 + (((tickAnim - 15) / 5) * (0-(2.62)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (14.7622-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (-1.1049-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0.3328-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 14.7622 + (((tickAnim - 37) / 2) * (-11.6377-(14.7622)));
            yy = -1.1049 + (((tickAnim - 37) / 2) * (-7.6474-(-1.1049)));
            zz = 0.3328 + (((tickAnim - 37) / 2) * (1.6244-(0.3328)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -11.6377 + (((tickAnim - 39) / 4) * (-16.7652-(-11.6377)));
            yy = -7.6474 + (((tickAnim - 39) / 4) * (-2.394-(-7.6474)));
            zz = 1.6244 + (((tickAnim - 39) / 4) * (0.721-(1.6244)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -16.7652 + (((tickAnim - 43) / 7) * (0-(-16.7652)));
            yy = -2.394 + (((tickAnim - 43) / 7) * (0-(-2.394)));
            zz = 0.721 + (((tickAnim - 43) / 7) * (0-(0.721)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (-0.515-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (0.35-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = -0.515 + (((tickAnim - 37) / 6) * (-0.2-(-0.515)));
            yy = 0.35 + (((tickAnim - 37) / 6) * (-0.75-(0.35)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -0.2 + (((tickAnim - 43) / 7) * (0-(-0.2)));
            yy = -0.75 + (((tickAnim - 43) / 7) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-26.19-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -26.19 + (((tickAnim - 5) / 5) * (-16.88-(-26.19)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.88 + (((tickAnim - 10) / 10) * (-6.75-(-16.88)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -6.75 + (((tickAnim - 20) / 13) * (-12.5-(-6.75)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -12.5 + (((tickAnim - 33) / 8) * (-18.5-(-12.5)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -18.5 + (((tickAnim - 41) / 9) * (0-(-18.5)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (33.4995-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-7.1307-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (15.0157-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 33.4995 + (((tickAnim - 5) / 5) * (-8.6812-(33.4995)));
            yy = -7.1307 + (((tickAnim - 5) / 5) * (1.0999-(-7.1307)));
            zz = 15.0157 + (((tickAnim - 5) / 5) * (7.1666-(15.0157)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.6812 + (((tickAnim - 10) / 10) * (-5.5-(-8.6812)));
            yy = 1.0999 + (((tickAnim - 10) / 10) * (0-(1.0999)));
            zz = 7.1666 + (((tickAnim - 10) / 10) * (0-(7.1666)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -5.5 + (((tickAnim - 20) / 13) * (-10.75-(-5.5)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -10.75 + (((tickAnim - 33) / 8) * (-11.5-(-10.75)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -11.5 + (((tickAnim - 41) / 9) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.265-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.525-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.265 + (((tickAnim - 5) / 5) * (-0.525-(0.265)));
            zz = -0.525 + (((tickAnim - 5) / 5) * (0-(-0.525)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.525 + (((tickAnim - 10) / 10) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 20) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 21) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 20) / 21) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = -0.4 + (((tickAnim - 41) / 9) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 16.75 + (((tickAnim - 3) / 2) * (0-(16.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (27.633-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (1.0798-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-7.8962-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 27.633 + (((tickAnim - 10) / 10) * (15.824-(27.633)));
            yy = 1.0798 + (((tickAnim - 10) / 10) * (-5.259-(1.0798)));
            zz = -7.8962 + (((tickAnim - 10) / 10) * (-1.6125-(-7.8962)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 15.824 + (((tickAnim - 20) / 13) * (20.574-(15.824)));
            yy = -5.259 + (((tickAnim - 20) / 13) * (-5.259-(-5.259)));
            zz = -1.6125 + (((tickAnim - 20) / 13) * (-1.6125-(-1.6125)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 20.574 + (((tickAnim - 33) / 8) * (26.824-(20.574)));
            yy = -5.259 + (((tickAnim - 33) / 8) * (-5.259-(-5.259)));
            zz = -1.6125 + (((tickAnim - 33) / 8) * (-1.6125-(-1.6125)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 26.824 + (((tickAnim - 41) / 9) * (0-(26.824)));
            yy = -5.259 + (((tickAnim - 41) / 9) * (0-(-5.259)));
            zz = -1.6125 + (((tickAnim - 41) / 9) * (0-(-1.6125)));
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
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.125-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.125 + (((tickAnim - 10) / 10) * (0-(-0.125)));
            zz = -0.125 + (((tickAnim - 10) / 10) * (0-(-0.125)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 13) * (0.15-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            yy = 0.15 + (((tickAnim - 33) / 8) * (-0.275-(0.15)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = -0.275 + (((tickAnim - 41) / 9) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTitanophoneus entity = (EntityPrehistoricFloraTitanophoneus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3 + (((tickAnim - 0) / 18) * (2.25-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 2.25 + (((tickAnim - 18) / 12) * (20.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25-(2.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 20.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25 + (((tickAnim - 30) / 10) * (0-(20.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -18.75 + (((tickAnim - 18) / 12) * (-23.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*25-(-18.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -23.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*25 + (((tickAnim - 30) / 10) * (0-(-23.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-7.255-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -7.255-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 8) / 10) * (11-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1-(-7.255-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 11-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1 + (((tickAnim - 18) / 12) * (13.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*760))*8-(11-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 13.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*760))*8 + (((tickAnim - 30) / 10) * (0-(13.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*760))*8)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTitanophoneus entity = (EntityPrehistoricFloraTitanophoneus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 31.75 + (((tickAnim - 18) / 9) * (2.674-(31.75)));
            yy = 0 + (((tickAnim - 18) / 9) * (-5.4298-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (-16.7141-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 2.674 + (((tickAnim - 27) / 8) * (-29.5-(2.674)));
            yy = -5.4298 + (((tickAnim - 27) / 8) * (0-(-5.4298)));
            zz = -16.7141 + (((tickAnim - 27) / 8) * (0-(-16.7141)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -29.5 + (((tickAnim - 35) / 15) * (0-(-29.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (19.4528-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.1454-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.3772-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 19.4528 + (((tickAnim - 18) / 9) * (-37.8986-(19.4528)));
            yy = -0.1454 + (((tickAnim - 18) / 9) * (-0.0727-(-0.1454)));
            zz = -1.3772 + (((tickAnim - 18) / 9) * (-0.6886-(-1.3772)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -37.8986 + (((tickAnim - 27) / 8) * (9.25-(-37.8986)));
            yy = -0.0727 + (((tickAnim - 27) / 8) * (0-(-0.0727)));
            zz = -0.6886 + (((tickAnim - 27) / 8) * (0-(-0.6886)));
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
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(0);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(0);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.27-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 1.27 + (((tickAnim - 8) / 10) * (73.75-(1.27)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 73.75 + (((tickAnim - 18) / 4) * (112.15-(73.75)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 112.15 + (((tickAnim - 22) / 5) * (79.12-(112.15)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 79.12 + (((tickAnim - 27) / 8) * (21.5-(79.12)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 21.5 + (((tickAnim - 35) / 15) * (0-(21.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.425-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0.74-(0)));
            zz = -0.425 + (((tickAnim - 18) / 4) * (-1.095-(-0.425)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 0.74 + (((tickAnim - 22) / 5) * (0.725-(0.74)));
            zz = -1.095 + (((tickAnim - 22) / 5) * (-1.035-(-1.095)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = 0.725 + (((tickAnim - 27) / 8) * (0-(0.725)));
            zz = -1.035 + (((tickAnim - 27) / 8) * (0-(-1.035)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTitanophoneus entity = (EntityPrehistoricFloraTitanophoneus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -5.75 + (((tickAnim - 19) / 12) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -5.75 + (((tickAnim - 31) / 19) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-2.45-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = -2.45 + (((tickAnim - 19) / 12) * (-2.45-(-2.45)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = -2.45 + (((tickAnim - 31) / 19) * (0-(-2.45)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 5.25 + (((tickAnim - 19) / 12) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 31) / 19) * (0-(5.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 6.75 + (((tickAnim - 19) / 12) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 31) / 19) * (0-(6.75)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 19) {
            xx = -7.75 + (((tickAnim - 5) / 14) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 5) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 14) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (-2-(0)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 35) / 15) * (0-(-2)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 19) {
            xx = 1.5 + (((tickAnim - 5) / 14) * (-7.75-(1.5)));
            yy = 0 + (((tickAnim - 5) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 14) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -7.75 + (((tickAnim - 19) / 12) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 31) / 19) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-14-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = -14 + (((tickAnim - 19) / 12) * (-14-(-14)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = -14 + (((tickAnim - 31) / 19) * (0-(-14)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (13.5-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 13.5 + (((tickAnim - 19) / 12) * (13.5-(13.5)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 13.5 + (((tickAnim - 31) / 19) * (0-(13.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (14-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 14 + (((tickAnim - 19) / 12) * (14-(14)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 14 + (((tickAnim - 31) / 19) * (0-(14)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-13.5-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = -13.5 + (((tickAnim - 19) / 12) * (-13.5-(-13.5)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = -13.5 + (((tickAnim - 31) / 19) * (0-(-13.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-6-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -15.5 + (((tickAnim - 19) / 12) * (-15.5-(-15.5)));
            yy = -6 + (((tickAnim - 19) / 12) * (-6-(-6)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -15.5 + (((tickAnim - 31) / 19) * (0-(-15.5)));
            yy = -6 + (((tickAnim - 31) / 19) * (0-(-6)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (48.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 48.5 + (((tickAnim - 19) / 12) * (48.5-(48.5)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 48.5 + (((tickAnim - 31) / 19) * (0-(48.5)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-0.65-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = 0.6 + (((tickAnim - 19) / 12) * (0.6-(0.6)));
            zz = -0.65 + (((tickAnim - 19) / 12) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = 0.6 + (((tickAnim - 31) / 19) * (0-(0.6)));
            zz = -0.65 + (((tickAnim - 31) / 19) * (0-(-0.65)));
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
            xx = 0 + (((tickAnim - 0) / 19) * (-21.6128-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-6.2121-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (2.06-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -21.6128 + (((tickAnim - 19) / 12) * (-21.6128-(-21.6128)));
            yy = -6.2121 + (((tickAnim - 19) / 12) * (-6.2121-(-6.2121)));
            zz = 2.06 + (((tickAnim - 19) / 12) * (2.06-(2.06)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -21.6128 + (((tickAnim - 31) / 19) * (0-(-21.6128)));
            yy = -6.2121 + (((tickAnim - 31) / 19) * (0-(-6.2121)));
            zz = 2.06 + (((tickAnim - 31) / 19) * (0-(2.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = -0.425 + (((tickAnim - 19) / 12) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = -0.425 + (((tickAnim - 31) / 19) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-6-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -15.5 + (((tickAnim - 19) / 12) * (-15.5-(-15.5)));
            yy = -6 + (((tickAnim - 19) / 12) * (-6-(-6)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -15.5 + (((tickAnim - 31) / 19) * (0-(-15.5)));
            yy = -6 + (((tickAnim - 31) / 19) * (0-(-6)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (48.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 48.5 + (((tickAnim - 19) / 12) * (48.5-(48.5)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 48.5 + (((tickAnim - 31) / 19) * (0-(48.5)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-0.65-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = 0.6 + (((tickAnim - 19) / 12) * (0.6-(0.6)));
            zz = -0.65 + (((tickAnim - 19) / 12) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = 0.6 + (((tickAnim - 31) / 19) * (0-(0.6)));
            zz = -0.65 + (((tickAnim - 31) / 19) * (0-(-0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-23.9625-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (5.8974-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-3.0174-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -23.9625 + (((tickAnim - 19) / 12) * (-23.9625-(-23.9625)));
            yy = 5.8974 + (((tickAnim - 19) / 12) * (5.8974-(5.8974)));
            zz = -3.0174 + (((tickAnim - 19) / 12) * (-3.0174-(-3.0174)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -23.9625 + (((tickAnim - 31) / 19) * (0-(-23.9625)));
            yy = 5.8974 + (((tickAnim - 31) / 19) * (0-(5.8974)));
            zz = -3.0174 + (((tickAnim - 31) / 19) * (0-(-3.0174)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = -0.425 + (((tickAnim - 19) / 12) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = -0.425 + (((tickAnim - 31) / 19) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTitanophoneus entity = (EntityPrehistoricFloraTitanophoneus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*8), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*0.7);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+20))*1.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-12), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*9), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(9-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+90))*8), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(10.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*8), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(0);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(0);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(-0.825);


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-6.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*8), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*-15), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(2.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-120))*5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-11.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-120))*-5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 29.5 + (((tickAnim - 0) / 4) * (57.9915-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350-(29.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (-1.3614-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-10.2805-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 57.9915-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350 + (((tickAnim - 4) / 4) * (-19.7234-(57.9915-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350)));
            yy = -1.3614 + (((tickAnim - 4) / 4) * (7.2608-(-1.3614)));
            zz = -10.2805 + (((tickAnim - 4) / 4) * (7.2442-(-10.2805)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -19.7234 + (((tickAnim - 8) / 7) * (29.5-(-19.7234)));
            yy = 7.2608 + (((tickAnim - 8) / 7) * (0-(7.2608)));
            zz = 7.2442 + (((tickAnim - 8) / 7) * (0-(7.2442)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 22 + (((tickAnim - 0) / 4) * (34.5441-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350-(22)));
            yy = 0 + (((tickAnim - 0) / 4) * (7.6427-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-9.9613-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 34.5441-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350 + (((tickAnim - 4) / 4) * (-2.5-(34.5441-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350)));
            yy = 7.6427 + (((tickAnim - 4) / 4) * (0-(7.6427)));
            zz = -9.9613 + (((tickAnim - 4) / 4) * (-8.75-(-9.9613)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -2.5 + (((tickAnim - 8) / 7) * (22-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -8.75 + (((tickAnim - 8) / 7) * (0-(-8.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 67.75 + (((tickAnim - 0) / 2) * (108.47-(67.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 108.47 + (((tickAnim - 2) / 2) * (88.92-(108.47)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 88.92 + (((tickAnim - 4) / 4) * (22-(88.92)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22 + (((tickAnim - 8) / 2) * (10.17-(22)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 10.17 + (((tickAnim - 10) / 2) * (-8.08-(10.17)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -8.08 + (((tickAnim - 12) / 3) * (67.75-(-8.08)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.375 + (((tickAnim - 0) / 2) * (1.18-(1.375)));
            zz = -1.075 + (((tickAnim - 0) / 2) * (-1.465-(-1.075)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 1.18 + (((tickAnim - 2) / 2) * (0.89-(1.18)));
            zz = -1.465 + (((tickAnim - 2) / 2) * (-1.25-(-1.465)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.89 + (((tickAnim - 4) / 4) * (0.3-(0.89)));
            zz = -1.25 + (((tickAnim - 4) / 4) * (0-(-1.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.3 + (((tickAnim - 8) / 4) * (-0.01-(0.3)));
            zz = 0 + (((tickAnim - 8) / 4) * (-0.6-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = -0.01 + (((tickAnim - 12) / 3) * (1.375-(-0.01)));
            zz = -0.6 + (((tickAnim - 12) / 3) * (-1.075-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 29.5 + (((tickAnim - 0) / 4) * (57.9915-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350-(29.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.3614-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (10.2805-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 57.9915-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350 + (((tickAnim - 4) / 4) * (-19.7234-(57.9915-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350)));
            yy = 1.3614 + (((tickAnim - 4) / 4) * (-7.2608-(1.3614)));
            zz = 10.2805 + (((tickAnim - 4) / 4) * (-7.2442-(10.2805)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -19.7234 + (((tickAnim - 8) / 7) * (29.5-(-19.7234)));
            yy = -7.2608 + (((tickAnim - 8) / 7) * (0-(-7.2608)));
            zz = -7.2442 + (((tickAnim - 8) / 7) * (0-(-7.2442)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 22 + (((tickAnim - 0) / 4) * (34.5441-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350-(22)));
            yy = 0 + (((tickAnim - 0) / 4) * (-7.6427-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (9.9613-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 34.5441-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350 + (((tickAnim - 4) / 4) * (-2.5-(34.5441-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350)));
            yy = -7.6427 + (((tickAnim - 4) / 4) * (0-(-7.6427)));
            zz = 9.9613 + (((tickAnim - 4) / 4) * (8.75-(9.9613)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -2.5 + (((tickAnim - 8) / 7) * (22-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 8.75 + (((tickAnim - 8) / 7) * (0-(8.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 67.75 + (((tickAnim - 0) / 2) * (108.47-(67.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 108.47 + (((tickAnim - 2) / 2) * (88.92-(108.47)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 88.92 + (((tickAnim - 4) / 4) * (22-(88.92)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22 + (((tickAnim - 8) / 2) * (10.17-(22)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 10.17 + (((tickAnim - 10) / 2) * (-8.08-(10.17)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -8.08 + (((tickAnim - 12) / 3) * (67.75-(-8.08)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.375 + (((tickAnim - 0) / 2) * (1.18-(1.375)));
            zz = -1.075 + (((tickAnim - 0) / 2) * (-1.465-(-1.075)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 1.18 + (((tickAnim - 2) / 2) * (0.89-(1.18)));
            zz = -1.465 + (((tickAnim - 2) / 2) * (-1.25-(-1.465)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.89 + (((tickAnim - 4) / 4) * (0.3-(0.89)));
            zz = -1.25 + (((tickAnim - 4) / 4) * (0-(-1.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.3 + (((tickAnim - 8) / 4) * (-0.01-(0.3)));
            zz = 0 + (((tickAnim - 8) / 4) * (-0.6-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = -0.01 + (((tickAnim - 12) / 3) * (1.375-(-0.01)));
            zz = -0.6 + (((tickAnim - 12) / 3) * (-1.075-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -15.7479 + (((tickAnim - 0) / 7) * (28.5-(-15.7479)));
            yy = -14.7123 + (((tickAnim - 0) / 7) * (0-(-14.7123)));
            zz = -1.3046 + (((tickAnim - 0) / 7) * (0-(-1.3046)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 28.5 + (((tickAnim - 7) / 5) * (164.9597-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350-(28.5)));
            yy = 0 + (((tickAnim - 7) / 5) * (-7.2762-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (-11.7889-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 164.9597-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350 + (((tickAnim - 12) / 3) * (-15.7479-(164.9597-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350)));
            yy = -7.2762 + (((tickAnim - 12) / 3) * (-14.7123-(-7.2762)));
            zz = -11.7889 + (((tickAnim - 12) / 3) * (-1.3046-(-11.7889)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (30.4781-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (2.2437-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-10.5928-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 30.4781 + (((tickAnim - 7) / 5) * (35.7958-(30.4781)));
            yy = 2.2437 + (((tickAnim - 7) / 5) * (0.9972-(2.2437)));
            zz = -10.5928 + (((tickAnim - 7) / 5) * (-4.7079-(-10.5928)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 35.7958 + (((tickAnim - 12) / 3) * (0-(35.7958)));
            yy = 0.9972 + (((tickAnim - 12) / 3) * (0-(0.9972)));
            zz = -4.7079 + (((tickAnim - 12) / 3) * (0-(-4.7079)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 7) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0.36-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.36 + (((tickAnim - 12) / 3) * (-0.25-(0.36)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20.0311 + (((tickAnim - 0) / 3) * (-12.2257-(20.0311)));
            yy = 3.0289 + (((tickAnim - 0) / 3) * (-1.6012-(3.0289)));
            zz = 1.179 + (((tickAnim - 0) / 3) * (5.9438-(1.179)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -12.2257 + (((tickAnim - 3) / 4) * (37.9845-(-12.2257)));
            yy = -1.6012 + (((tickAnim - 3) / 4) * (13.5483-(-1.6012)));
            zz = 5.9438 + (((tickAnim - 3) / 4) * (10.3663-(5.9438)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 37.9845 + (((tickAnim - 7) / 2) * (47.4315-(37.9845)));
            yy = 13.5483 + (((tickAnim - 7) / 2) * (15.5258-(13.5483)));
            zz = 10.3663 + (((tickAnim - 7) / 2) * (14.196-(10.3663)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 47.4315 + (((tickAnim - 9) / 3) * (0-(47.4315)));
            yy = 15.5258 + (((tickAnim - 9) / 3) * (0-(15.5258)));
            zz = 14.196 + (((tickAnim - 9) / 3) * (0-(14.196)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (20.0311-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (3.0289-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (1.179-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.35 + (((tickAnim - 0) / 3) * (-0.175-(-0.35)));
            yy = -0.175 + (((tickAnim - 0) / 3) * (-0.425-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -0.175 + (((tickAnim - 3) / 4) * (0-(-0.175)));
            yy = -0.425 + (((tickAnim - 3) / 4) * (0.5-(-0.425)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0.7-(0)));
            yy = 0.5 + (((tickAnim - 7) / 2) * (1.325-(0.5)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0.7 + (((tickAnim - 9) / 3) * (0-(0.7)));
            yy = 1.325 + (((tickAnim - 9) / 3) * (0-(1.325)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (-0.35-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -15.7479 + (((tickAnim - 0) / 7) * (28.5-(-15.7479)));
            yy = 14.7123 + (((tickAnim - 0) / 7) * (0-(14.7123)));
            zz = 1.3046 + (((tickAnim - 0) / 7) * (0-(1.3046)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 28.5 + (((tickAnim - 7) / 5) * (164.9597-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350-(28.5)));
            yy = 0 + (((tickAnim - 7) / 5) * (7.2762-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (11.7889-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 164.9597-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350 + (((tickAnim - 12) / 3) * (-15.7479-(164.9597-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350)));
            yy = 7.2762 + (((tickAnim - 12) / 3) * (14.7123-(7.2762)));
            zz = 11.7889 + (((tickAnim - 12) / 3) * (1.3046-(11.7889)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (30.4781-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (2.2437-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-10.5928-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 30.4781 + (((tickAnim - 7) / 5) * (35.7958-(30.4781)));
            yy = 2.2437 + (((tickAnim - 7) / 5) * (0.9972-(2.2437)));
            zz = -10.5928 + (((tickAnim - 7) / 5) * (-4.7079-(-10.5928)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 35.7958 + (((tickAnim - 12) / 3) * (0-(35.7958)));
            yy = 0.9972 + (((tickAnim - 12) / 3) * (0-(0.9972)));
            zz = -4.7079 + (((tickAnim - 12) / 3) * (0-(-4.7079)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 7) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0.36-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.36 + (((tickAnim - 12) / 3) * (-0.25-(0.36)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
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
            xx = 22.8835 + (((tickAnim - 0) / 3) * (-12.2257-(22.8835)));
            yy = 2.0587 + (((tickAnim - 0) / 3) * (-1.6012-(2.0587)));
            zz = 1.1274 + (((tickAnim - 0) / 3) * (5.9438-(1.1274)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -12.2257 + (((tickAnim - 3) / 4) * (37.9845-(-12.2257)));
            yy = -1.6012 + (((tickAnim - 3) / 4) * (-13.5483-(-1.6012)));
            zz = 5.9438 + (((tickAnim - 3) / 4) * (-10.3663-(5.9438)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 37.9845 + (((tickAnim - 7) / 2) * (47.4315-(37.9845)));
            yy = -13.5483 + (((tickAnim - 7) / 2) * (-15.5258-(-13.5483)));
            zz = -10.3663 + (((tickAnim - 7) / 2) * (-14.196-(-10.3663)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 47.4315 + (((tickAnim - 9) / 3) * (0-(47.4315)));
            yy = -15.5258 + (((tickAnim - 9) / 3) * (0-(-15.5258)));
            zz = -14.196 + (((tickAnim - 9) / 3) * (0-(-14.196)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (22.8835-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (2.0587-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (1.1274-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.5 + (((tickAnim - 0) / 3) * (-0.175-(0.5)));
            yy = -0.125 + (((tickAnim - 0) / 3) * (-0.425-(-0.125)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -0.175 + (((tickAnim - 3) / 4) * (0-(-0.175)));
            yy = -0.425 + (((tickAnim - 3) / 4) * (0.5-(-0.425)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (-0.7-(0)));
            yy = 0.5 + (((tickAnim - 7) / 2) * (1.325-(0.5)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -0.7 + (((tickAnim - 9) / 3) * (0-(-0.7)));
            yy = 1.325 + (((tickAnim - 9) / 3) * (0-(1.325)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0.5-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTitanophoneus entity = (EntityPrehistoricFloraTitanophoneus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-50))*-2.5), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*3), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-80))*-2.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5+50))*-0.3);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5+150))*-0.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-180))*-3.5), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-20))*-3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-120))*2.5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-50))*3), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-120))*3.5), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-120))*3));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-100))*2.5), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*-2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-150))*3), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-2.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-250))*4), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-300))*6), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*-4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-25))*-3.5), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-130))*-1.5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*-4));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-190))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 20.75 + (((tickAnim - 0) / 6) * (8.8225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120-(20.75)));
            yy = -8.1551 + (((tickAnim - 0) / 6) * (-23.8725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(-8.1551)));
            zz = -21.2848 + (((tickAnim - 0) / 6) * (-50.1423+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90-(-21.2848)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 8.8225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120 + (((tickAnim - 6) / 7) * (-31.8057-(8.8225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120)));
            yy = -23.8725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 6) / 7) * (8.4511-(-23.8725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            zz = -50.1423+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90 + (((tickAnim - 6) / 7) * (6.6527-(-50.1423+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -31.8057 + (((tickAnim - 13) / 20) * (19.5651-(-31.8057)));
            yy = 8.4511 + (((tickAnim - 13) / 20) * (-5.0751-(8.4511)));
            zz = 6.6527 + (((tickAnim - 13) / 20) * (-9.8503-(6.6527)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 19.5651 + (((tickAnim - 33) / 2) * (-26.7642-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-70-(19.5651)));
            yy = -5.0751 + (((tickAnim - 33) / 2) * (-52.5801-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-50-(-5.0751)));
            zz = -9.8503 + (((tickAnim - 33) / 2) * (-110.0098+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*100-(-9.8503)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 15.525 + (((tickAnim - 0) / 6) * (16.9221-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*140-(15.525)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-4.5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 16.9221-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*140 + (((tickAnim - 6) / 7) * (8.75-(16.9221-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*140)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = -4.5 + (((tickAnim - 6) / 7) * (-8.5-(-4.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 8.75 + (((tickAnim - 13) / 20) * (15.85-(8.75)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = -8.5 + (((tickAnim - 13) / 20) * (0-(-8.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 15.85 + (((tickAnim - 33) / 2) * (15.525-(15.85)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0.05-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 28) / 5) * (0-(-0.2)));
            zz = 0.05 + (((tickAnim - 28) / 5) * (0-(0.05)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 72.5 + (((tickAnim - 0) / 3) * (105.575-(72.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 105.575 + (((tickAnim - 3) / 3) * (104.3-(105.575)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 104.3 + (((tickAnim - 6) / 7) * (19.25-(104.3)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 19.25 + (((tickAnim - 13) / 9) * (1.7848-(19.25)));
            yy = 0 + (((tickAnim - 13) / 9) * (-2.2495-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (3.2487-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 1.7848 + (((tickAnim - 22) / 6) * (-6.7512-(1.7848)));
            yy = -2.2495 + (((tickAnim - 22) / 6) * (0.4339-(-2.2495)));
            zz = 3.2487 + (((tickAnim - 22) / 6) * (5.5144-(3.2487)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -6.7512 + (((tickAnim - 28) / 5) * (41.75-(-6.7512)));
            yy = 0.4339 + (((tickAnim - 28) / 5) * (0-(0.4339)));
            zz = 5.5144 + (((tickAnim - 28) / 5) * (0-(5.5144)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 41.75 + (((tickAnim - 33) / 2) * (72.5-(41.75)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 6) * (0.19-(0.2)));
            zz = -0.745 + (((tickAnim - 0) / 6) * (-1.32-(-0.745)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.19 + (((tickAnim - 6) / 7) * (0.4-(0.19)));
            zz = -1.32 + (((tickAnim - 6) / 7) * (-0.275-(-1.32)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 13) / 1) * (-1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3-(0.4)));
            zz = -0.275 + (((tickAnim - 13) / 1) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = -1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3 + (((tickAnim - 14) / 8) * (0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*2.5-(-1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3)));
            zz = -0.275 + (((tickAnim - 14) / 8) * (0-(-0.275)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*2.5 + (((tickAnim - 22) / 6) * (0.155-(0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*2.5)));
            zz = 0 + (((tickAnim - 22) / 6) * (0.045-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0.155 + (((tickAnim - 28) / 5) * (0.2-(0.155)));
            zz = 0.045 + (((tickAnim - 28) / 5) * (-0.575-(0.045)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 33) / 2) * (0.2-(0.2)));
            zz = -0.575 + (((tickAnim - 33) / 2) * (-0.745-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -14.8057 + (((tickAnim - 0) / 14) * (23.7901-(-14.8057)));
            yy = -3.6261 + (((tickAnim - 0) / 14) * (5.0751-(-3.6261)));
            zz = -1.9027 + (((tickAnim - 0) / 14) * (9.8503-(-1.9027)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 23.7901 + (((tickAnim - 14) / 7) * (206.8225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300-(23.7901)));
            yy = 5.0751 + (((tickAnim - 14) / 7) * (41.8225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(5.0751)));
            zz = 9.8503 + (((tickAnim - 14) / 7) * (-270.4423+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-140))*-290-(9.8503)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 206.8225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300 + (((tickAnim - 21) / 7) * (-34.2778-(206.8225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300)));
            yy = 41.8225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 21) / 7) * (-11.1908-(41.8225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = -270.4423+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-140))*-290 + (((tickAnim - 21) / 7) * (-8.8485-(-270.4423+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-140))*-290)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -34.2778 + (((tickAnim - 28) / 7) * (-14.8057-(-34.2778)));
            yy = -11.1908 + (((tickAnim - 28) / 7) * (-3.6261-(-11.1908)));
            zz = -8.8485 + (((tickAnim - 28) / 7) * (-1.9027-(-8.8485)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 9.4645 + (((tickAnim - 0) / 14) * (20.75-(9.4645)));
            yy = -0.8242 + (((tickAnim - 0) / 14) * (0-(-0.8242)));
            zz = 4.9317 + (((tickAnim - 0) / 14) * (0-(4.9317)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 20.75 + (((tickAnim - 14) / 7) * (-0.3779-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100-(20.75)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (4.5-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -0.3779-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100 + (((tickAnim - 21) / 7) * (14.5-(-0.3779-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 4.5 + (((tickAnim - 21) / 7) * (8.5-(4.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 14.5 + (((tickAnim - 28) / 7) * (9.4645-(14.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (-0.8242-(0)));
            zz = 8.5 + (((tickAnim - 28) / 7) * (4.9317-(8.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 7) * (0.275-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0.275 + (((tickAnim - 21) / 7) * (-0.3-(0.275)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -0.3 + (((tickAnim - 28) / 7) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 5.2518 + (((tickAnim - 0) / 6) * (-10.6386-(5.2518)));
            yy = 0.1695 + (((tickAnim - 0) / 6) * (2.3725-(0.1695)));
            zz = -0.9887 + (((tickAnim - 0) / 6) * (-5.9457-(-0.9887)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = -10.6386 + (((tickAnim - 6) / 8) * (58.25-(-10.6386)));
            yy = 2.3725 + (((tickAnim - 6) / 8) * (0-(2.3725)));
            zz = -5.9457 + (((tickAnim - 6) / 8) * (0-(-5.9457)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 58.25 + (((tickAnim - 14) / 4) * (92.3-(58.25)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 92.3 + (((tickAnim - 18) / 3) * (125.22-(92.3)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 125.22 + (((tickAnim - 21) / 7) * (18.75-(125.22)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 18.75 + (((tickAnim - 28) / 7) * (5.2518-(18.75)));
            yy = 0 + (((tickAnim - 28) / 7) * (0.1695-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (-0.9887-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.425 + (((tickAnim - 0) / 6) * (0.275-(0.425)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            yy = 0.275 + (((tickAnim - 6) / 8) * (0.825-(0.275)));
            zz = 0 + (((tickAnim - 6) / 8) * (-0.575-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = 0.825 + (((tickAnim - 14) / 7) * (0.19-(0.825)));
            zz = -0.575 + (((tickAnim - 14) / 7) * (-1.32-(-0.575)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0.19 + (((tickAnim - 21) / 7) * (0.575-(0.19)));
            zz = -1.32 + (((tickAnim - 21) / 7) * (-0.275-(-1.32)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 28) / 0) * (0-(0)));
            yy = 0.575 + (((tickAnim - 28) / 0) * (-8.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(0.575)));
            zz = -0.275 + (((tickAnim - 28) / 0) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -8.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 28) / 7) * (0.425-(-8.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            zz = -0.275 + (((tickAnim - 28) / 7) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = -17.25 + (((tickAnim - 0) / 22) * (20.25-(-17.25)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 20.25 + (((tickAnim - 22) / 7) * (230.4801-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(20.25)));
            yy = 0 + (((tickAnim - 22) / 7) * (1.2684-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (78.9064+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 230.4801-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 29) / 6) * (-17.25-(230.4801-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = 1.2684 + (((tickAnim - 29) / 6) * (0-(1.2684)));
            zz = 78.9064+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 29) / 6) * (0-(78.9064+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (33-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 33 + (((tickAnim - 22) / 7) * (75.0159-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150-(33)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 75.0159-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150 + (((tickAnim - 29) / 6) * (0-(75.0159-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 22) * (0.275-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            yy = 0.275 + (((tickAnim - 22) / 7) * (0.98-(0.275)));
            zz = 0 + (((tickAnim - 22) / 7) * (-0.35-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = 0.98 + (((tickAnim - 29) / 6) * (-0.1-(0.98)));
            zz = -0.35 + (((tickAnim - 29) / 6) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 20.97 + (((tickAnim - 0) / 8) * (-11.6752-(20.97)));
            yy = 0.2473 + (((tickAnim - 0) / 8) * (0.8963-(0.2473)));
            zz = -0.551 + (((tickAnim - 0) / 8) * (-0.5644-(-0.551)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -11.6752 + (((tickAnim - 8) / 6) * (-7.0132-(-11.6752)));
            yy = 0.8963 + (((tickAnim - 8) / 6) * (3.2162-(0.8963)));
            zz = -0.5644 + (((tickAnim - 8) / 6) * (-0.4667-(-0.5644)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -7.0132 + (((tickAnim - 14) / 8) * (18.7368-(-7.0132)));
            yy = 3.2162 + (((tickAnim - 14) / 8) * (3.2162-(3.2162)));
            zz = -0.4667 + (((tickAnim - 14) / 8) * (-0.4667-(-0.4667)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 18.7368 + (((tickAnim - 22) / 3) * (37.6898-(18.7368)));
            yy = 3.2162 + (((tickAnim - 22) / 3) * (21.094-(3.2162)));
            zz = -0.4667 + (((tickAnim - 22) / 3) * (10.5553-(-0.4667)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 37.6898 + (((tickAnim - 25) / 7) * (-1-(37.6898)));
            yy = 21.094 + (((tickAnim - 25) / 7) * (0-(21.094)));
            zz = 10.5553 + (((tickAnim - 25) / 7) * (0-(10.5553)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -1 + (((tickAnim - 32) / 3) * (20.97-(-1)));
            yy = 0 + (((tickAnim - 32) / 3) * (0.2473-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (-0.551-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 3) * (0.34-(0.15)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.34 + (((tickAnim - 3) / 5) * (-0.88-(0.34)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = -0.88 + (((tickAnim - 8) / 6) * (-0.85-(-0.88)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = -0.85 + (((tickAnim - 14) / 8) * (0-(-0.85)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0.47-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (-0.05-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0.47 + (((tickAnim - 25) / 7) * (-0.275-(0.47)));
            zz = -0.05 + (((tickAnim - 25) / 7) * (0-(-0.05)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = -0.275 + (((tickAnim - 32) / 3) * (0.15-(-0.275)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 8.85 + (((tickAnim - 0) / 6) * (20.25-(8.85)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 20.25 + (((tickAnim - 6) / 7) * (75.7301-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(20.25)));
            yy = 0 + (((tickAnim - 6) / 7) * (1.2684-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-12.6814+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 75.7301-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 13) / 6) * (-17.25-(75.7301-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 1.2684 + (((tickAnim - 13) / 6) * (0-(1.2684)));
            zz = -12.6814+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 13) / 6) * (0-(-12.6814+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = -17.25 + (((tickAnim - 19) / 16) * (8.85-(-17.25)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 23.975 + (((tickAnim - 0) / 6) * (33-(23.975)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 33 + (((tickAnim - 6) / 7) * (127.6612-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*160-(33)));
            yy = 0 + (((tickAnim - 6) / 7) * (-12.6953-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (11.1544-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 127.6612-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*160 + (((tickAnim - 13) / 6) * (0-(127.6612-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*160)));
            yy = -12.6953 + (((tickAnim - 13) / 6) * (0-(-12.6953)));
            zz = 11.1544 + (((tickAnim - 13) / 6) * (0-(11.1544)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 19) / 16) * (23.975-(0)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.275 + (((tickAnim - 6) / 7) * (0.605-(0.275)));
            zz = 0 + (((tickAnim - 6) / 7) * (-0.575-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0.605 + (((tickAnim - 13) / 6) * (-0.1-(0.605)));
            zz = -0.575 + (((tickAnim - 13) / 6) * (0-(-0.575)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            yy = -0.1 + (((tickAnim - 19) / 16) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -7.0132 + (((tickAnim - 0) / 6) * (18.7368-(-7.0132)));
            yy = 3.2162 + (((tickAnim - 0) / 6) * (3.2162-(3.2162)));
            zz = -0.4667 + (((tickAnim - 0) / 6) * (-0.4667-(-0.4667)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 18.7368 + (((tickAnim - 6) / 6) * (37.6898-(18.7368)));
            yy = 3.2162 + (((tickAnim - 6) / 6) * (-21.094-(3.2162)));
            zz = -0.4667 + (((tickAnim - 6) / 6) * (-10.5553-(-0.4667)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 37.6898 + (((tickAnim - 12) / 4) * (-1-(37.6898)));
            yy = -21.094 + (((tickAnim - 12) / 4) * (0-(-21.094)));
            zz = -10.5553 + (((tickAnim - 12) / 4) * (0-(-10.5553)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -1 + (((tickAnim - 16) / 3) * (17.2266-(-1)));
            yy = 0 + (((tickAnim - 16) / 3) * (-0.908-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (-0.6403-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 17.2266 + (((tickAnim - 19) / 9) * (-8.6752-(17.2266)));
            yy = -0.908 + (((tickAnim - 19) / 9) * (0.8963-(-0.908)));
            zz = -0.6403 + (((tickAnim - 19) / 9) * (-0.5644-(-0.6403)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -8.6752 + (((tickAnim - 28) / 7) * (-7.0132-(-8.6752)));
            yy = 0.8963 + (((tickAnim - 28) / 7) * (3.2162-(0.8963)));
            zz = -0.5644 + (((tickAnim - 28) / 7) * (-0.4667-(-0.5644)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 6) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0.47-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-0.2-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.47 + (((tickAnim - 13) / 3) * (-0.275-(0.47)));
            zz = -0.2 + (((tickAnim - 13) / 3) * (0-(-0.2)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = -0.275 + (((tickAnim - 16) / 3) * (0.2-(-0.275)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 0.2 + (((tickAnim - 19) / 9) * (-0.855-(0.2)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -0.855 + (((tickAnim - 28) / 7) * (-0.425-(-0.855)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTitanophoneus e = (EntityPrehistoricFloraTitanophoneus) entity;
        animator.update(entity);

    }
}
