package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDimetrodon_teutonis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDimetrodon_teutonis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer sailFront;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer sailFront2;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer sailMiddle;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer sailEnd;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer sailEnd2;
    private final AdvancedModelRenderer cube_r37;

    private ModelAnimator animator;

    public ModelDimetrodon_teutonis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 16.0F, 7.625F);
        this.main.cubeList.add(new ModelBox(main, 19, 16, -2.0F, -0.65F, -3.325F, 4, 4, 5, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.9058F, 1.7175F, 0.1933F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -1.5611F, -0.0592F, -0.0567F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.3F, -0.625F);
        this.leftLeg.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.7764F, 0.0963F, -0.0951F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 58, -0.9465F, 0.7313F, -0.2794F, 2, 4, 1, -0.003F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 53, -0.9465F, 0.7313F, -1.8044F, 2, 4, 2, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.7304F, 1.9499F, 2.0132F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7968F, -0.2098F, 0.0605F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.125F, -3.8F, -3.35F);
        this.leftLeg2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.7764F, 0.0963F, -0.0951F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 53, 27, -1.0F, 4.95F, -1.275F, 2, 4, 2, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.2075F, 2.7005F, 2.7235F);
        this.leftLeg2.addChild(leftLeg3);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0654F, -0.5107F, 0.5119F);
        this.leftLeg3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.76F, 0.1031F, -0.1008F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 22, -1.3298F, -0.4499F, -3.1947F, 3, 1, 3, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.9058F, 1.7175F, 0.1933F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -1.5611F, 0.0592F, 0.0567F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.3F, -0.625F);
        this.rightLeg.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.7764F, -0.0963F, 0.0951F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 27, 58, -1.0535F, 0.7313F, -0.2794F, 2, 4, 1, -0.003F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 53, -1.0535F, 0.7313F, -1.8044F, 2, 4, 2, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.7304F, 1.9499F, 2.0132F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7968F, 0.2098F, -0.0605F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.125F, -3.8F, -3.35F);
        this.rightLeg2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.7764F, -0.0963F, 0.0951F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 53, 27, -1.0F, 4.95F, -1.275F, 2, 4, 2, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.2075F, 2.7005F, 2.7235F);
        this.rightLeg2.addChild(rightLeg3);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.0654F, -0.5107F, 0.5119F);
        this.rightLeg3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.76F, -0.1031F, 0.1008F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 47, 22, -1.6702F, -0.4499F, -3.1947F, 3, 1, 3, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.5F, -1.9F, -6.5F);
        this.main.addChild(body);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -0.275F, 1.675F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4102F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 0, -2.5F, 0.0572F, -0.194F, 5, 5, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body.addChild(body2);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -2.5F, 0.0F, -9.0F, 6, 6, 9, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(-0.5F, 0.0239F, -7.9261F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0873F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 19, 26, -1.5F, -0.025F, -3.55F, 5, 5, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, 5.9F, 0.275F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2225F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 45, -2.0F, -1.0501F, -3.9382F, 4, 1, 4, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(3.425F, 3.3511F, -1.5739F);
        this.body3.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0407F, 0.266F, 0.0107F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.3F, -0.625F);
        this.leftArm.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.7764F, 0.0963F, -0.0951F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 53, -1.0F, 0.975F, -1.275F, 2, 4, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.2123F, 2.125F, 2.4797F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.8594F, -0.3141F, 0.1651F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.6559F, -3.7383F, -3.5117F);
        this.leftArm2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.7764F, 0.0963F, -0.0951F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 31, 10, -1.0F, 4.95F, -0.725F, 2, 4, 1, -0.001F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 58, 9, -1.0F, 4.95F, -1.275F, 2, 4, 1, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.2615F, 2.7622F, 2.5618F);
        this.leftArm2.addChild(leftArm3);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0654F, -0.5107F, 0.5119F);
        this.leftArm3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.8254F, 0.1024F, -0.1011F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 47, 17, -1.3298F, -0.4499F, -3.4947F, 3, 1, 3, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.425F, 3.3511F, -1.5739F);
        this.body3.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.0407F, -0.266F, -0.0107F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.3F, -0.625F);
        this.rightArm.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.7764F, -0.0963F, 0.0951F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 53, -1.0F, 0.975F, -1.275F, 2, 4, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.4623F, 2.125F, 2.4797F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.8594F, 0.3141F, -0.1651F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.8905F, -3.7691F, -3.4309F);
        this.rightArm2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.7764F, -0.0963F, 0.0951F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 10, -1.0F, 4.95F, -0.725F, 2, 4, 1, -0.001F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 58, 9, -1.0F, 4.95F, -1.275F, 2, 4, 1, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.027F, 2.7314F, 2.6426F);
        this.rightArm2.addChild(rightArm3);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.0654F, -0.5107F, 0.5119F);
        this.rightArm3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.8254F, -0.1024F, 0.1011F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 47, 17, -1.6702F, -0.4499F, -3.4947F, 3, 1, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0315F, -3.4253F);
        this.body3.addChild(neck);
        this.setRotateAngle(neck, -0.0436F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, 4.6103F, 0.0402F);
        this.neck.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.4843F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 18, 55, -1.0F, -2.225F, -1.95F, 2, 2, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -0.5F, -1.775F);
        this.neck.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2531F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 47, 10, -0.875F, 0.1F, -0.025F, 2, 3, 3, -0.002F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 47, 10, -0.125F, 0.1F, -0.025F, 2, 3, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.85F, 0.7789F, -1.3863F);
        this.neck.addChild(head);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.35F, 0.8527F, -5.4545F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.9905F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 60, 0.05F, -0.0332F, -1.2817F, 0, 1, 1, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 60, 0.95F, -0.0332F, -1.2817F, 0, 1, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 44, 58, 0.0F, -0.2082F, -1.4567F, 1, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.15F, 1.9461F, -3.4887F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0742F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 59, 59, -0.95F, -0.5714F, -1.2711F, 0, 1, 1, 0.0F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 59, 59, 0.95F, -0.5714F, -1.2711F, 0, 1, 1, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 58, 37, -1.0F, -0.9964F, -1.7961F, 2, 1, 1, 0.01F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 58, 34, -1.0F, -0.9964F, -0.9961F, 2, 1, 1, 0.009F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.35F, 1.0461F, -1.6887F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.4974F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 3, 60, -0.775F, -0.8803F, -1.5709F, 0, 1, 1, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 3, 60, 1.775F, -0.8803F, -1.5709F, 0, 1, 1, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 50, 5, -1.0F, -1.0303F, -2.0209F, 3, 1, 2, -0.008F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.15F, 0.5419F, -5.1312F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.6458F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 56, 50, -1.0F, 0.0012F, -0.9599F, 2, 1, 2, -0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.15F, -0.8155F, -3.0955F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.5585F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 55, 54, -1.0F, -0.0279F, -2.0436F, 2, 2, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.65F, -1.2789F, -0.2387F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1614F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 48, -2.0F, -0.0118F, -1.9449F, 3, 2, 2, 0.01F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 56, 46, -2.0F, -0.0118F, -2.9449F, 3, 2, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.45F, -1.044F, -2.0233F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1638F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 54, 59, -1.0F, 0.1682F, -0.0457F, 1, 1, 1, 0.0F, true));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 54, 59, 1.2F, 0.1682F, -0.0457F, 1, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.85F, 1.0273F, -0.1421F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.3229F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 0.4725F, -1.6297F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.4625F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 56, 41, -0.5F, -1.2028F, 0.0118F, 2, 2, 2, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 45, 49, -1.0F, -0.0028F, -0.0132F, 3, 2, 2, 0.009F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0F, 3.0582F, -4.0773F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0384F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 34, 58, -0.4F, -1.2644F, -1.0979F, 0, 1, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 34, 58, 0.4F, -1.2644F, -1.0979F, 0, 1, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 49, 58, -0.5F, -1.0144F, -1.1229F, 1, 1, 1, -0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.0F, 0.0029F, 0.2197F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2967F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 15, 43, -0.85F, 0.4666F, -4.8358F, 0, 1, 1, 0.0F, true));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 11, 48, -1.0F, 0.6416F, -5.3108F, 2, 1, 1, -0.002F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 15, 43, 0.85F, 0.4666F, -4.8358F, 0, 1, 1, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 45, 35, -1.0F, 0.6416F, -5.1108F, 2, 1, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 0.6391F, -1.739F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.7069F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 15, 40, -0.925F, -0.219F, -1.277F, 0, 1, 1, 0.0F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 15, 40, 1.925F, -0.219F, -1.277F, 0, 1, 1, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 44, 54, -1.0F, 0.006F, -1.702F, 3, 1, 2, -0.01F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(throat);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.5F, 2.2701F, -0.7529F);
        this.throat.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1178F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 50, 0, -1.5F, -1.0527F, 0.0293F, 2, 1, 3, -0.003F, false));

        this.sailFront = new AdvancedModelRenderer(this);
        this.sailFront.setRotationPoint(0.0F, -1.25F, -0.6F);
        this.head.addChild(sailFront);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.225F, 0.3717F, -0.9199F);
        this.sailFront.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.4102F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 28, 51, -0.125F, -0.075F, 0.3F, 1, 3, 3, 0.0F, false));

        this.sailFront2 = new AdvancedModelRenderer(this);
        this.sailFront2.setRotationPoint(0.8627F, -0.31F, -3.326F);
        this.body3.addChild(sailFront2);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0801F, -1.9971F, 1.0025F);
        this.sailFront2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1091F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 37, 51, 0.0F, -2.5F, -1.5F, 0, 5, 3, 0.0F, false));

        this.sailMiddle = new AdvancedModelRenderer(this);
        this.sailMiddle.setRotationPoint(0.0F, -0.5F, -4.0F);
        this.body2.addChild(sailMiddle);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-2.9758F, 0.0F, 4.4999F);
        this.sailMiddle.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0131F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 16, 3.5F, -13.55F, -9.0F, 0, 14, 9, 0.0F, false));

        this.sailEnd = new AdvancedModelRenderer(this);
        this.sailEnd.setRotationPoint(0.5F, 1.25F, 5.25F);
        this.body.addChild(sailEnd);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-3.4297F, -1.7517F, -3.7745F);
        this.sailEnd.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0131F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 19, 36, 3.525F, -12.1F, -0.2F, 0, 14, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.1204F, 1.5521F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.3927F, 0.0F, 0.0F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, 0.05F, -0.075F);
        this.tail.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1702F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 28, 36, -2.0F, -0.05F, 0.075F, 3, 3, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.375F, 4.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0393F, 0.0F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -0.4154F, -0.1557F);
        this.tail2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0611F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 38, 27, -1.0F, 0.0F, 0.15F, 2, 2, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.3654F, 5.0193F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.4538F, 0.0F, 0.0F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.25F, -0.358F, -0.2125F);
        this.tail3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.288F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 40, -0.25F, -0.075F, 0.025F, 1, 1, 6, -0.001F, false));

        this.sailEnd2 = new AdvancedModelRenderer(this);
        this.sailEnd2.setRotationPoint(0.0F, -0.5F, -1.25F);
        this.main.addChild(sailEnd2);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-3.5F, -1.9F, -3.75F);
        this.sailEnd2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0131F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 38, 10, 3.5F, -10.1F, 3.8F, 0, 12, 4, 0.0F, false));
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

        EntityPrehistoricFloraDimetrodon_teutonis EntityMegalosaurus = (EntityPrehistoricFloraDimetrodon_teutonis) e;

        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.head};

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

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDimetrodon_teutonis entity = (EntityPrehistoricFloraDimetrodon_teutonis) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 9.75 + (((tickAnim - 3) / 4) * (-4.95614-(9.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (0.43233-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (2.86538-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -4.95614 + (((tickAnim - 7) / 6) * (0-(-4.95614)));
            yy = 0.43233 + (((tickAnim - 7) / 6) * (0-(0.43233)));
            zz = 2.86538 + (((tickAnim - 7) / 6) * (0-(2.86538)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -6 + (((tickAnim - 3) / 4) * (-15.00988-(-6)));
            yy = 0 + (((tickAnim - 3) / 4) * (-2.97579-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0.3805-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -15.00988 + (((tickAnim - 7) / 3) * (10.5-(-15.00988)));
            yy = -2.97579 + (((tickAnim - 7) / 3) * (0-(-2.97579)));
            zz = 0.3805 + (((tickAnim - 7) / 3) * (0-(0.3805)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 10.5 + (((tickAnim - 10) / 3) * (0-(10.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 3) * (0.075-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0.075 + (((tickAnim - 3) / 4) * (0.23-(0.075)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0.23 + (((tickAnim - 7) / 3) * (0-(0.23)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 20.25 + (((tickAnim - 3) / 4) * (49-(20.25)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 49 + (((tickAnim - 7) / 3) * (0-(49)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDimetrodon_teutonis entity = (EntityPrehistoricFloraDimetrodon_teutonis) entitylivingbaseIn;
        int animCycle = 33;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 4.5 + (((tickAnim - 23) / 10) * (0-(4.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -8.5 + (((tickAnim - 23) / 10) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 22.25 + (((tickAnim - 23) / 10) * (0-(22.25)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDimetrodon_teutonis entity = (EntityPrehistoricFloraDimetrodon_teutonis) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 2 + (((tickAnim - 10) / 13) * (3.75-(2)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 3.75 + (((tickAnim - 23) / 12) * (2-(3.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 2 + (((tickAnim - 35) / 15) * (0-(2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.58607-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-6.44464-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (5.0035-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -0.58607 + (((tickAnim - 10) / 13) * (-4.58607-(-0.58607)));
            yy = -6.44464 + (((tickAnim - 10) / 13) * (-6.44464-(-6.44464)));
            zz = 5.0035 + (((tickAnim - 10) / 13) * (5.0035-(5.0035)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -4.58607 + (((tickAnim - 23) / 12) * (-0.58607-(-4.58607)));
            yy = -6.44464 + (((tickAnim - 23) / 12) * (-6.44464-(-6.44464)));
            zz = 5.0035 + (((tickAnim - 23) / 12) * (5.0035-(5.0035)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.58607 + (((tickAnim - 35) / 15) * (0-(-0.58607)));
            yy = -6.44464 + (((tickAnim - 35) / 15) * (0-(-6.44464)));
            zz = 5.0035 + (((tickAnim - 35) / 15) * (0-(5.0035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.87437-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-10.35758-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (4.82766-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -0.87437 + (((tickAnim - 10) / 13) * (6.37563-(-0.87437)));
            yy = -10.35758 + (((tickAnim - 10) / 13) * (-10.35758-(-10.35758)));
            zz = 4.82766 + (((tickAnim - 10) / 13) * (4.82766-(4.82766)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 6.37563 + (((tickAnim - 23) / 12) * (-0.87437-(6.37563)));
            yy = -10.35758 + (((tickAnim - 23) / 12) * (-10.35758-(-10.35758)));
            zz = 4.82766 + (((tickAnim - 23) / 12) * (4.82766-(4.82766)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.87437 + (((tickAnim - 35) / 15) * (0-(-0.87437)));
            yy = -10.35758 + (((tickAnim - 35) / 15) * (0-(-10.35758)));
            zz = 4.82766 + (((tickAnim - 35) / 15) * (0-(4.82766)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-48.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -48.25 + (((tickAnim - 10) / 13) * (19.75-(-48.25)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 19.75 + (((tickAnim - 23) / 12) * (-48.25-(19.75)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -48.25 + (((tickAnim - 35) / 15) * (0-(-48.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -30.25 + (((tickAnim - 5) / 5) * (14.5-(-30.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 14.5 + (((tickAnim - 10) / 13) * (16.5-(14.5)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 16.5 + (((tickAnim - 23) / 5) * (-51.43-(16.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -51.43 + (((tickAnim - 28) / 7) * (14.5-(-51.43)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 14.5 + (((tickAnim - 35) / 15) * (0-(14.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (61.1725-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (6.6847-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-3.4054-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 61.1725 + (((tickAnim - 5) / 5) * (36.845-(61.1725)));
            yy = 6.6847 + (((tickAnim - 5) / 5) * (13.3694-(6.6847)));
            zz = -3.4054 + (((tickAnim - 5) / 5) * (-6.8108-(-3.4054)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 36.845 + (((tickAnim - 10) / 6) * (1.1507-(36.845)));
            yy = 13.3694 + (((tickAnim - 10) / 6) * (7.1303-(13.3694)));
            zz = -6.8108 + (((tickAnim - 10) / 6) * (-3.6324-(-6.8108)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 1.1507 + (((tickAnim - 16) / 7) * (67-(1.1507)));
            yy = 7.1303 + (((tickAnim - 16) / 7) * (0-(7.1303)));
            zz = -3.6324 + (((tickAnim - 16) / 7) * (0-(-3.6324)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 67 + (((tickAnim - 23) / 2) * (163.0025-(67)));
            yy = 0 + (((tickAnim - 23) / 2) * (2.8649-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (-1.4595-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 163.0025 + (((tickAnim - 25) / 3) * (61.1725-(163.0025)));
            yy = 2.8649 + (((tickAnim - 25) / 3) * (6.6847-(2.8649)));
            zz = -1.4595 + (((tickAnim - 25) / 3) * (-3.4054-(-1.4595)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 61.1725 + (((tickAnim - 28) / 7) * (36.845-(61.1725)));
            yy = 6.6847 + (((tickAnim - 28) / 7) * (13.3694-(6.6847)));
            zz = -3.4054 + (((tickAnim - 28) / 7) * (-6.8108-(-3.4054)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 36.845 + (((tickAnim - 35) / 15) * (0-(36.845)));
            yy = 13.3694 + (((tickAnim - 35) / 15) * (0-(13.3694)));
            zz = -6.8108 + (((tickAnim - 35) / 15) * (0-(-6.8108)));
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
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0.85-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (-0.8-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.85 + (((tickAnim - 23) / 2) * (0.165-(0.85)));
            zz = -0.8 + (((tickAnim - 23) / 2) * (-0.91-(-0.8)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0.165 + (((tickAnim - 25) / 3) * (0-(0.165)));
            zz = -0.91 + (((tickAnim - 25) / 3) * (0-(-0.91)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-6.75-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = -6.75 + (((tickAnim - 23) / 27) * (0-(-6.75)));
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
            zz = 0 + (((tickAnim - 0) / 10) * (-1-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (-0.17761-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0.24487-(0)));
            zz = -1 + (((tickAnim - 10) / 13) * (-3.25773-(-1)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = -0.17761 + (((tickAnim - 23) / 27) * (0-(-0.17761)));
            yy = 0.24487 + (((tickAnim - 23) / 27) * (0-(0.24487)));
            zz = -3.25773 + (((tickAnim - 23) / 27) * (0-(-3.25773)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sailMiddle, sailMiddle.rotateAngleX + (float) Math.toRadians(xx), sailMiddle.rotateAngleY + (float) Math.toRadians(yy), sailMiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (-0.17761-(0)));
            yy = -1.5 + (((tickAnim - 10) / 13) * (-0.50513-(-1.5)));
            zz = -1 + (((tickAnim - 10) / 13) * (-3.25543-(-1)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = -0.17761 + (((tickAnim - 23) / 27) * (0-(-0.17761)));
            yy = -0.50513 + (((tickAnim - 23) / 27) * (0-(-0.50513)));
            zz = -3.25543 + (((tickAnim - 23) / 27) * (0-(-3.25543)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sailEnd, sailEnd.rotateAngleX + (float) Math.toRadians(xx), sailEnd.rotateAngleY + (float) Math.toRadians(yy), sailEnd.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDimetrodon_teutonis entity = (EntityPrehistoricFloraDimetrodon_teutonis) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-80))*2), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-15), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*9));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-0.5);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+50))*2), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-80))*10), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*-3));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*-4), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-80))*12), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*1), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*15), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-10), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-100))*2), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*-22), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*6));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-100))*2), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-22), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*6));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -51.25 + (((tickAnim - 0) / 5) * (16.9147-(-51.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (7.39-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-10.9966-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 16.9147 + (((tickAnim - 5) / 3) * (-35.049-(16.9147)));
            yy = 7.39 + (((tickAnim - 5) / 3) * (0.186-(7.39)));
            zz = -10.9966 + (((tickAnim - 5) / 3) * (-47.8482-(-10.9966)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -35.049 + (((tickAnim - 8) / 2) * (-51.25-(-35.049)));
            yy = 0.186 + (((tickAnim - 8) / 2) * (0-(0.186)));
            zz = -47.8482 + (((tickAnim - 8) / 2) * (0-(-47.8482)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 24.9465 + (((tickAnim - 0) / 2) * (7.2909-(24.9465)));
            yy = 15.3835 + (((tickAnim - 0) / 2) * (7.2873-(15.3835)));
            zz = -10.3073 + (((tickAnim - 0) / 2) * (-2.3426-(-10.3073)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 7.2909 + (((tickAnim - 2) / 3) * (29.7297-(7.2909)));
            yy = 7.2873 + (((tickAnim - 2) / 3) * (-8.905-(7.2873)));
            zz = -2.3426 + (((tickAnim - 2) / 3) * (13.5868-(-2.3426)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 29.7297 + (((tickAnim - 5) / 3) * (-81.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*550-(29.7297)));
            yy = -8.905 + (((tickAnim - 5) / 3) * (-11.6201-(-8.905)));
            zz = 13.5868 + (((tickAnim - 5) / 3) * (36.3867-(13.5868)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -81.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*550 + (((tickAnim - 8) / 2) * (24.9465-(-81.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*550)));
            yy = -11.6201 + (((tickAnim - 8) / 2) * (15.3835-(-11.6201)));
            zz = 36.3867 + (((tickAnim - 8) / 2) * (-10.3073-(36.3867)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.225 + (((tickAnim - 0) / 2) * (0-(0.225)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.4-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 6) / 2) * (0-(0.4)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0.225-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 29.8171 + (((tickAnim - 0) / 2) * (22.5659-(29.8171)));
            yy = -8.4224 + (((tickAnim - 0) / 2) * (-1.7297-(-8.4224)));
            zz = -7.9519 + (((tickAnim - 0) / 2) * (-9.698-(-7.9519)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 22.5659 + (((tickAnim - 2) / 1) * (-4.03-(22.5659)));
            yy = -1.7297 + (((tickAnim - 2) / 1) * (-4.0296-(-1.7297)));
            zz = -9.698 + (((tickAnim - 2) / 1) * (-11.8104-(-9.698)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -4.03 + (((tickAnim - 3) / 4) * (140.318-(-4.03)));
            yy = -4.0296 + (((tickAnim - 3) / 4) * (-6.9108-(-4.0296)));
            zz = -11.8104 + (((tickAnim - 3) / 4) * (-12.2643-(-11.8104)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 140.318 + (((tickAnim - 7) / 1) * (103.8456-(140.318)));
            yy = -6.9108 + (((tickAnim - 7) / 1) * (-7.3759-(-6.9108)));
            zz = -12.2643 + (((tickAnim - 7) / 1) * (-10.9374-(-12.2643)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 103.8456 + (((tickAnim - 8) / 2) * (29.8171-(103.8456)));
            yy = -7.3759 + (((tickAnim - 8) / 2) * (-8.4224-(-7.3759)));
            zz = -10.9374 + (((tickAnim - 8) / 2) * (-7.9519-(-10.9374)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = -0.25 + (((tickAnim - 0) / 2) * (-0.225-(-0.25)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0.15-(0)));
            zz = -0.225 + (((tickAnim - 2) / 3) * (-0.7-(-0.225)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 5) / 2) * (-0.125-(0.15)));
            zz = -0.7 + (((tickAnim - 5) / 2) * (-0.785-(-0.7)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.125 + (((tickAnim - 7) / 1) * (0.225-(-0.125)));
            zz = -0.785 + (((tickAnim - 7) / 1) * (-0.995-(-0.785)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.225 + (((tickAnim - 8) / 2) * (0-(0.225)));
            zz = -0.995 + (((tickAnim - 8) / 2) * (-0.25-(-0.995)));
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
            xx = 45.6 + (((tickAnim - 0) / 3) * (129.7732-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*150-(45.6)));
            yy = 2.75 + (((tickAnim - 0) / 3) * (-4.8991-(2.75)));
            zz = -24.34 + (((tickAnim - 0) / 3) * (-30.0652-(-24.34)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 129.7732-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*150 + (((tickAnim - 3) / 2) * (-10.2205-(129.7732-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*150)));
            yy = -4.8991 + (((tickAnim - 3) / 2) * (-0.0574-(-4.8991)));
            zz = -30.0652 + (((tickAnim - 3) / 2) * (-0.9922-(-30.0652)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -10.2205 + (((tickAnim - 5) / 5) * (45.6-(-10.2205)));
            yy = -0.0574 + (((tickAnim - 5) / 5) * (2.75-(-0.0574)));
            zz = -0.9922 + (((tickAnim - 5) / 5) * (-24.34-(-0.9922)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (52.2658-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*150-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.4352-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1.551-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 52.2658-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*150 + (((tickAnim - 3) / 2) * (-10.9684-(52.2658-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*150)));
            yy = -0.4352 + (((tickAnim - 3) / 2) * (0.8703-(-0.4352)));
            zz = 1.551 + (((tickAnim - 3) / 2) * (-3.1019-(1.551)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -10.9684 + (((tickAnim - 5) / 5) * (0-(-10.9684)));
            yy = 0.8703 + (((tickAnim - 5) / 5) * (0-(0.8703)));
            zz = -3.1019 + (((tickAnim - 5) / 5) * (0-(-3.1019)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0.425-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0.425 + (((tickAnim - 5) / 3) * (0-(0.425)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
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
            xx = 45 + (((tickAnim - 0) / 3) * (-73.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-150-(45)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -73.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-150 + (((tickAnim - 3) / 2) * (22.5-(-73.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-150)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 22.5 + (((tickAnim - 5) / 3) * (-12.1218-(22.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (-5.6046-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (8.3387-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12.1218 + (((tickAnim - 8) / 2) * (45-(-12.1218)));
            yy = -5.6046 + (((tickAnim - 8) / 2) * (0-(-5.6046)));
            zz = 8.3387 + (((tickAnim - 8) / 2) * (0-(8.3387)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.55 + (((tickAnim - 0) / 3) * (1.03-(0.55)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.385-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.03 + (((tickAnim - 3) / 2) * (0-(1.03)));
            zz = -0.385 + (((tickAnim - 3) / 2) * (0.375-(-0.385)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0.55-(0)));
            zz = 0.375 + (((tickAnim - 5) / 5) * (0-(0.375)));
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
            xx = -10.2205 + (((tickAnim - 0) / 5) * (141.0955-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150-(-10.2205)));
            yy = -0.0574 + (((tickAnim - 0) / 5) * (-2.747-(-0.0574)));
            zz = -0.9922 + (((tickAnim - 0) / 5) * (24.3365-(-0.9922)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 141.0955-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150 + (((tickAnim - 5) / 3) * (211.8691-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*250-(141.0955-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150)));
            yy = -2.747 + (((tickAnim - 5) / 3) * (-8.7399-(-2.747)));
            zz = 24.3365 + (((tickAnim - 5) / 3) * (40.9465-(24.3365)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 211.8691-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*250 + (((tickAnim - 8) / 2) * (-10.2205-(211.8691-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*250)));
            yy = -8.7399 + (((tickAnim - 8) / 2) * (-0.0574-(-8.7399)));
            zz = 40.9465 + (((tickAnim - 8) / 2) * (-0.9922-(40.9465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -10.9684 + (((tickAnim - 0) / 5) * (9.8001-(-10.9684)));
            yy = -0.8703 + (((tickAnim - 0) / 5) * (1.9493-(-0.8703)));
            zz = 3.1019 + (((tickAnim - 0) / 5) * (-0.9732-(3.1019)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 9.8001 + (((tickAnim - 5) / 3) * (-76.0342-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-150-(9.8001)));
            yy = 1.9493 + (((tickAnim - 5) / 3) * (-0.4352-(1.9493)));
            zz = -0.9732 + (((tickAnim - 5) / 3) * (1.551-(-0.9732)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -76.0342-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-150 + (((tickAnim - 8) / 2) * (-10.9684-(-76.0342-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-150)));
            yy = -0.4352 + (((tickAnim - 8) / 2) * (-0.8703-(-0.4352)));
            zz = 1.551 + (((tickAnim - 8) / 2) * (3.1019-(1.551)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0.3 + (((tickAnim - 0) / 3) * (0-(0.3)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0.3-(0)));
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
            xx = 22.5 + (((tickAnim - 0) / 3) * (1.1282-(22.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (5.6046-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-8.3387-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.1282 + (((tickAnim - 3) / 2) * (45-(1.1282)));
            yy = 5.6046 + (((tickAnim - 3) / 2) * (0-(5.6046)));
            zz = -8.3387 + (((tickAnim - 3) / 2) * (0-(-8.3387)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 45 + (((tickAnim - 5) / 3) * (-87.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-150-(45)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -87.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-150 + (((tickAnim - 8) / 2) * (22.5-(-87.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-150)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.55-(0)));
            zz = 0.375 + (((tickAnim - 0) / 5) * (0-(0.375)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.55 + (((tickAnim - 5) / 3) * (1.03-(0.55)));
            zz = 0 + (((tickAnim - 5) / 3) * (-0.385-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.03 + (((tickAnim - 8) / 2) * (0-(1.03)));
            zz = -0.385 + (((tickAnim - 8) / 2) * (0.375-(-0.385)));
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
            xx = 16.9147 + (((tickAnim - 0) / 3) * (-35.049-(16.9147)));
            yy = -7.39 + (((tickAnim - 0) / 3) * (-0.186-(-7.39)));
            zz = 10.9966 + (((tickAnim - 0) / 3) * (47.8482-(10.9966)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -35.049 + (((tickAnim - 3) / 2) * (-51.25-(-35.049)));
            yy = -0.186 + (((tickAnim - 3) / 2) * (0-(-0.186)));
            zz = 47.8482 + (((tickAnim - 3) / 2) * (0-(47.8482)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -51.25 + (((tickAnim - 5) / 5) * (16.9147-(-51.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (-7.39-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (10.9966-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.7297 + (((tickAnim - 0) / 3) * (-135.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*150-(29.7297)));
            yy = 8.905 + (((tickAnim - 0) / 3) * (11.6201-(8.905)));
            zz = -13.5868 + (((tickAnim - 0) / 3) * (-36.3867-(-13.5868)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -135.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*150 + (((tickAnim - 3) / 2) * (24.9465-(-135.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*150)));
            yy = 11.6201 + (((tickAnim - 3) / 2) * (-15.3835-(11.6201)));
            zz = -36.3867 + (((tickAnim - 3) / 2) * (10.3073-(-36.3867)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 24.9465 + (((tickAnim - 5) / 2) * (7.2909-(24.9465)));
            yy = -15.3835 + (((tickAnim - 5) / 2) * (-7.2873-(-15.3835)));
            zz = 10.3073 + (((tickAnim - 5) / 2) * (2.3426-(10.3073)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 7.2909 + (((tickAnim - 7) / 3) * (29.7297-(7.2909)));
            yy = -7.2873 + (((tickAnim - 7) / 3) * (8.905-(-7.2873)));
            zz = 2.3426 + (((tickAnim - 7) / 3) * (-13.5868-(2.3426)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 1) / 2) * (0-(0.4)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-0.225-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -0.225 + (((tickAnim - 5) / 2) * (0-(-0.225)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 65.874 + (((tickAnim - 0) / 2) * (-88.6938-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*-250-(65.874)));
            yy = 6.3295 + (((tickAnim - 0) / 2) * (-6.6783-(6.3295)));
            zz = 13.9228 + (((tickAnim - 0) / 2) * (12.9277-(13.9228)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -88.6938-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*-250 + (((tickAnim - 2) / 1) * (103.8456-(-88.6938-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*-250)));
            yy = -6.6783 + (((tickAnim - 2) / 1) * (7.3759-(-6.6783)));
            zz = 12.9277 + (((tickAnim - 2) / 1) * (10.9374-(12.9277)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 103.8456 + (((tickAnim - 3) / 2) * (29.8171-(103.8456)));
            yy = 7.3759 + (((tickAnim - 3) / 2) * (8.4224-(7.3759)));
            zz = 10.9374 + (((tickAnim - 3) / 2) * (7.9519-(10.9374)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 29.8171 + (((tickAnim - 5) / 2) * (22.5659-(29.8171)));
            yy = 8.4224 + (((tickAnim - 5) / 2) * (1.7297-(8.4224)));
            zz = 7.9519 + (((tickAnim - 5) / 2) * (9.698-(7.9519)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 22.5659 + (((tickAnim - 7) / 1) * (13.97-(22.5659)));
            yy = 1.7297 + (((tickAnim - 7) / 1) * (4.0296-(1.7297)));
            zz = 9.698 + (((tickAnim - 7) / 1) * (11.8104-(9.698)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 13.97 + (((tickAnim - 8) / 2) * (65.874-(13.97)));
            yy = 4.0296 + (((tickAnim - 8) / 2) * (6.3295-(4.0296)));
            zz = 11.8104 + (((tickAnim - 8) / 2) * (13.9228-(11.8104)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 2) * (0.125-(0.15)));
            zz = -0.7 + (((tickAnim - 0) / 2) * (-0.785-(-0.7)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.125 + (((tickAnim - 2) / 1) * (0.225-(0.125)));
            zz = -0.785 + (((tickAnim - 2) / 1) * (-0.995-(-0.785)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.225 + (((tickAnim - 3) / 2) * (0-(0.225)));
            zz = -0.995 + (((tickAnim - 3) / 2) * (-0.25-(-0.995)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = -0.25 + (((tickAnim - 5) / 2) * (-0.225-(-0.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0.15-(0)));
            zz = -0.225 + (((tickAnim - 7) / 3) * (-0.7-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(sailMiddle, sailMiddle.rotateAngleX + (float) Math.toRadians(0), sailMiddle.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-55))*-1.5), sailMiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+100))*-2));


        this.setRotateAngle(sailEnd, sailEnd.rotateAngleX + (float) Math.toRadians(0), sailEnd.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*3.5), sailEnd.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-130))*4));
        this.sailEnd.rotationPointX = this.sailEnd.rotationPointX + (float)(-0.1);
        this.sailEnd.rotationPointY = this.sailEnd.rotationPointY - (float)(0);
        this.sailEnd.rotationPointZ = this.sailEnd.rotationPointZ + (float)(0);


        this.setRotateAngle(sailFront2, sailFront2.rotateAngleX + (float) Math.toRadians(0), sailFront2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-70))*3), sailFront2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*-5));
        this.sailFront2.rotationPointX = this.sailFront2.rotationPointX + (float)(0.05);
        this.sailFront2.rotationPointY = this.sailFront2.rotationPointY - (float)(0);
        this.sailFront2.rotationPointZ = this.sailFront2.rotationPointZ + (float)(0.15);


        this.setRotateAngle(sailEnd2, sailEnd2.rotateAngleX + (float) Math.toRadians(0), sailEnd2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*3.5), sailEnd2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-130))*4));
        this.sailEnd2.rotationPointX = this.sailEnd2.rotationPointX + (float)(0);
        this.sailEnd2.rotationPointY = this.sailEnd2.rotationPointY - (float)(0);
        this.sailEnd2.rotationPointZ = this.sailEnd2.rotationPointZ + (float)(-0.05);


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDimetrodon_teutonis entity = (EntityPrehistoricFloraDimetrodon_teutonis) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*3));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.1);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*3), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*-3));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0);


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-2), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*4), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*1), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-4), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*2), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-12), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*6));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*2), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-12), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*6));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -51.25 + (((tickAnim - 0) / 10) * (16.9147-(-51.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (7.39-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-10.9966-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 16.9147 + (((tickAnim - 10) / 5) * (-35.049-(16.9147)));
            yy = 7.39 + (((tickAnim - 10) / 5) * (0.186-(7.39)));
            zz = -10.9966 + (((tickAnim - 10) / 5) * (-47.8482-(-10.9966)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -35.049 + (((tickAnim - 15) / 5) * (-51.25-(-35.049)));
            yy = 0.186 + (((tickAnim - 15) / 5) * (0-(0.186)));
            zz = -47.8482 + (((tickAnim - 15) / 5) * (0-(-47.8482)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 24.9465 + (((tickAnim - 0) / 3) * (7.2909-(24.9465)));
            yy = 15.3835 + (((tickAnim - 0) / 3) * (7.2873-(15.3835)));
            zz = -10.3073 + (((tickAnim - 0) / 3) * (-2.3426-(-10.3073)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 7.2909 + (((tickAnim - 3) / 7) * (29.7297-(7.2909)));
            yy = 7.2873 + (((tickAnim - 3) / 7) * (-8.905-(7.2873)));
            zz = -2.3426 + (((tickAnim - 3) / 7) * (13.5868-(-2.3426)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 29.7297 + (((tickAnim - 10) / 5) * (45.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*150-(29.7297)));
            yy = -8.905 + (((tickAnim - 10) / 5) * (-11.6201-(-8.905)));
            zz = 13.5868 + (((tickAnim - 10) / 5) * (36.3867-(13.5868)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 45.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*150 + (((tickAnim - 15) / 5) * (24.9465-(45.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*150)));
            yy = -11.6201 + (((tickAnim - 15) / 5) * (15.3835-(-11.6201)));
            zz = 36.3867 + (((tickAnim - 15) / 5) * (-10.3073-(36.3867)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.225 + (((tickAnim - 0) / 3) * (0-(0.225)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0.4-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 12) / 3) * (0-(0.4)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0.225-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
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
            xx = 29.8171 + (((tickAnim - 0) / 3) * (22.5659-(29.8171)));
            yy = -8.4224 + (((tickAnim - 0) / 3) * (-1.7297-(-8.4224)));
            zz = -7.9519 + (((tickAnim - 0) / 3) * (-9.698-(-7.9519)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 22.5659 + (((tickAnim - 3) / 4) * (-4.03-(22.5659)));
            yy = -1.7297 + (((tickAnim - 3) / 4) * (-4.0296-(-1.7297)));
            zz = -9.698 + (((tickAnim - 3) / 4) * (-11.8104-(-9.698)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -4.03 + (((tickAnim - 7) / 5) * (296.3812-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*250-(-4.03)));
            yy = -4.0296 + (((tickAnim - 7) / 5) * (-6.6783-(-4.0296)));
            zz = -11.8104 + (((tickAnim - 7) / 5) * (-12.9277-(-11.8104)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 296.3812-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*250 + (((tickAnim - 12) / 5) * (103.8456-(296.3812-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*250)));
            yy = -6.6783 + (((tickAnim - 12) / 5) * (-7.3759-(-6.6783)));
            zz = -12.9277 + (((tickAnim - 12) / 5) * (-10.9374-(-12.9277)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 103.8456 + (((tickAnim - 17) / 3) * (29.8171-(103.8456)));
            yy = -7.3759 + (((tickAnim - 17) / 3) * (-8.4224-(-7.3759)));
            zz = -10.9374 + (((tickAnim - 17) / 3) * (-7.9519-(-10.9374)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -0.25 + (((tickAnim - 0) / 3) * (-0.225-(-0.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0.15-(0)));
            zz = -0.225 + (((tickAnim - 3) / 7) * (-0.7-(-0.225)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.15 + (((tickAnim - 10) / 3) * (-0.125-(0.15)));
            zz = -0.7 + (((tickAnim - 10) / 3) * (-0.785-(-0.7)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.125 + (((tickAnim - 13) / 4) * (0.225-(-0.125)));
            zz = -0.785 + (((tickAnim - 13) / 4) * (-0.995-(-0.785)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 17) / 3) * (0-(0.225)));
            zz = -0.995 + (((tickAnim - 17) / 3) * (-0.25-(-0.995)));
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
            xx = 45.6 + (((tickAnim - 0) / 5) * (129.7732-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*150-(45.6)));
            yy = 2.75 + (((tickAnim - 0) / 5) * (-4.8991-(2.75)));
            zz = -24.34 + (((tickAnim - 0) / 5) * (-30.0652-(-24.34)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 129.7732-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*150 + (((tickAnim - 5) / 5) * (-10.2205-(129.7732-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*150)));
            yy = -4.8991 + (((tickAnim - 5) / 5) * (-0.0574-(-4.8991)));
            zz = -30.0652 + (((tickAnim - 5) / 5) * (-0.9922-(-30.0652)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10.2205 + (((tickAnim - 10) / 10) * (45.6-(-10.2205)));
            yy = -0.0574 + (((tickAnim - 10) / 10) * (2.75-(-0.0574)));
            zz = -0.9922 + (((tickAnim - 10) / 10) * (-24.34-(-0.9922)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (22.5158-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*150-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.4352-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.551-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 22.5158-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*150 + (((tickAnim - 5) / 5) * (-10.9684-(22.5158-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*150)));
            yy = -0.4352 + (((tickAnim - 5) / 5) * (0.8703-(-0.4352)));
            zz = 1.551 + (((tickAnim - 5) / 5) * (-3.1019-(1.551)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10.9684 + (((tickAnim - 10) / 10) * (0-(-10.9684)));
            yy = 0.8703 + (((tickAnim - 10) / 10) * (0-(0.8703)));
            zz = -3.1019 + (((tickAnim - 10) / 10) * (0-(-3.1019)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0.425-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0.425 + (((tickAnim - 10) / 5) * (0-(0.425)));
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
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 45 + (((tickAnim - 0) / 5) * (-73.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-150-(45)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -73.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-150 + (((tickAnim - 5) / 5) * (22.5-(-73.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-150)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 22.5 + (((tickAnim - 10) / 5) * (-12.1218-(22.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (-5.6046-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (8.3387-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -12.1218 + (((tickAnim - 15) / 5) * (45-(-12.1218)));
            yy = -5.6046 + (((tickAnim - 15) / 5) * (0-(-5.6046)));
            zz = 8.3387 + (((tickAnim - 15) / 5) * (0-(8.3387)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.55 + (((tickAnim - 0) / 5) * (1.03-(0.55)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.385-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.03 + (((tickAnim - 5) / 5) * (0-(1.03)));
            zz = -0.385 + (((tickAnim - 5) / 5) * (0.375-(-0.385)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0.09-(0)));
            zz = 0.375 + (((tickAnim - 10) / 2) * (-0.19-(0.375)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0.09 + (((tickAnim - 12) / 8) * (0.55-(0.09)));
            zz = -0.19 + (((tickAnim - 12) / 8) * (0-(-0.19)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -10.2205 + (((tickAnim - 0) / 10) * (115.5955-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150-(-10.2205)));
            yy = -0.0574 + (((tickAnim - 0) / 10) * (-2.747-(-0.0574)));
            zz = -0.9922 + (((tickAnim - 0) / 10) * (24.3365-(-0.9922)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 115.5955-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150 + (((tickAnim - 10) / 5) * (-92.6268-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-150-(115.5955-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150)));
            yy = -2.747 + (((tickAnim - 10) / 5) * (4.8991-(-2.747)));
            zz = 24.3365 + (((tickAnim - 10) / 5) * (30.0652-(24.3365)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -92.6268-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-150 + (((tickAnim - 15) / 5) * (-10.2205-(-92.6268-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-150)));
            yy = 4.8991 + (((tickAnim - 15) / 5) * (-0.0574-(4.8991)));
            zz = 30.0652 + (((tickAnim - 15) / 5) * (-0.9922-(30.0652)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -10.9684 + (((tickAnim - 0) / 10) * (0-(-10.9684)));
            yy = -0.8703 + (((tickAnim - 0) / 10) * (0-(-0.8703)));
            zz = 3.1019 + (((tickAnim - 0) / 10) * (0-(3.1019)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (-33.8342-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-100-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (-0.4352-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (1.551-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -33.8342-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-100 + (((tickAnim - 16) / 4) * (-10.9684-(-33.8342-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-100)));
            yy = -0.4352 + (((tickAnim - 16) / 4) * (-0.8703-(-0.4352)));
            zz = 1.551 + (((tickAnim - 16) / 4) * (3.1019-(1.551)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0.3 + (((tickAnim - 0) / 5) * (0-(0.3)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0.3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 22.5 + (((tickAnim - 0) / 5) * (1.1282-(22.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (5.6046-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-8.3387-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.1282 + (((tickAnim - 5) / 5) * (45-(1.1282)));
            yy = 5.6046 + (((tickAnim - 5) / 5) * (0-(5.6046)));
            zz = -8.3387 + (((tickAnim - 5) / 5) * (0-(-8.3387)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 45 + (((tickAnim - 10) / 5) * (-14.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-150-(45)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -14.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-150 + (((tickAnim - 15) / 5) * (22.5-(-14.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-150)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.55-(0)));
            zz = 0.375 + (((tickAnim - 0) / 10) * (0-(0.375)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.55 + (((tickAnim - 10) / 5) * (1.03-(0.55)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.385-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 1.03 + (((tickAnim - 15) / 5) * (0-(1.03)));
            zz = -0.385 + (((tickAnim - 15) / 5) * (0.375-(-0.385)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 16.9147 + (((tickAnim - 0) / 5) * (-35.049-(16.9147)));
            yy = -7.39 + (((tickAnim - 0) / 5) * (-0.186-(-7.39)));
            zz = 10.9966 + (((tickAnim - 0) / 5) * (47.8482-(10.9966)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -35.049 + (((tickAnim - 5) / 5) * (-51.25-(-35.049)));
            yy = -0.186 + (((tickAnim - 5) / 5) * (0-(-0.186)));
            zz = 47.8482 + (((tickAnim - 5) / 5) * (0-(47.8482)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -51.25 + (((tickAnim - 10) / 10) * (16.9147-(-51.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (-7.39-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (10.9966-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 29.7297 + (((tickAnim - 0) / 5) * (-92.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*150-(29.7297)));
            yy = 8.905 + (((tickAnim - 0) / 5) * (11.6201-(8.905)));
            zz = -13.5868 + (((tickAnim - 0) / 5) * (-36.3867-(-13.5868)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -92.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*150 + (((tickAnim - 5) / 5) * (24.9465-(-92.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*150)));
            yy = 11.6201 + (((tickAnim - 5) / 5) * (-15.3835-(11.6201)));
            zz = -36.3867 + (((tickAnim - 5) / 5) * (10.3073-(-36.3867)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 24.9465 + (((tickAnim - 10) / 3) * (7.2909-(24.9465)));
            yy = -15.3835 + (((tickAnim - 10) / 3) * (-7.2873-(-15.3835)));
            zz = 10.3073 + (((tickAnim - 10) / 3) * (2.3426-(10.3073)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 7.2909 + (((tickAnim - 13) / 7) * (29.7297-(7.2909)));
            yy = -7.2873 + (((tickAnim - 13) / 7) * (8.905-(-7.2873)));
            zz = 2.3426 + (((tickAnim - 13) / 7) * (-13.5868-(2.3426)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 2) / 3) * (0-(0.4)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-0.225-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -0.225 + (((tickAnim - 10) / 3) * (0-(-0.225)));
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
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 65.874 + (((tickAnim - 0) / 3) * (-88.6938-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*-250-(65.874)));
            yy = 6.3295 + (((tickAnim - 0) / 3) * (-6.6783-(6.3295)));
            zz = 13.9228 + (((tickAnim - 0) / 3) * (12.9277-(13.9228)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -88.6938-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*-250 + (((tickAnim - 3) / 4) * (103.8456-(-88.6938-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*-250)));
            yy = -6.6783 + (((tickAnim - 3) / 4) * (7.3759-(-6.6783)));
            zz = 12.9277 + (((tickAnim - 3) / 4) * (10.9374-(12.9277)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 103.8456 + (((tickAnim - 7) / 3) * (29.8171-(103.8456)));
            yy = 7.3759 + (((tickAnim - 7) / 3) * (8.4224-(7.3759)));
            zz = 10.9374 + (((tickAnim - 7) / 3) * (7.9519-(10.9374)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 29.8171 + (((tickAnim - 10) / 3) * (22.5659-(29.8171)));
            yy = 8.4224 + (((tickAnim - 10) / 3) * (1.7297-(8.4224)));
            zz = 7.9519 + (((tickAnim - 10) / 3) * (9.698-(7.9519)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 22.5659 + (((tickAnim - 13) / 4) * (13.97-(22.5659)));
            yy = 1.7297 + (((tickAnim - 13) / 4) * (4.0296-(1.7297)));
            zz = 9.698 + (((tickAnim - 13) / 4) * (11.8104-(9.698)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 13.97 + (((tickAnim - 17) / 3) * (65.874-(13.97)));
            yy = 4.0296 + (((tickAnim - 17) / 3) * (6.3295-(4.0296)));
            zz = 11.8104 + (((tickAnim - 17) / 3) * (13.9228-(11.8104)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 3) * (0.125-(0.15)));
            zz = -0.7 + (((tickAnim - 0) / 3) * (-0.785-(-0.7)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.125 + (((tickAnim - 3) / 4) * (0.225-(0.125)));
            zz = -0.785 + (((tickAnim - 3) / 4) * (-0.995-(-0.785)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 7) / 3) * (0-(0.225)));
            zz = -0.995 + (((tickAnim - 7) / 3) * (-0.25-(-0.995)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -0.25 + (((tickAnim - 10) / 3) * (-0.225-(-0.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0.15-(0)));
            zz = -0.225 + (((tickAnim - 13) / 7) * (-0.7-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(sailMiddle, sailMiddle.rotateAngleX + (float) Math.toRadians(0), sailMiddle.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-55))*-1.5), sailMiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*-2));


        this.setRotateAngle(sailEnd, sailEnd.rotateAngleX + (float) Math.toRadians(0), sailEnd.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*3.5), sailEnd.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-130))*4));
        this.sailEnd.rotationPointX = this.sailEnd.rotationPointX + (float)(-0.1);
        this.sailEnd.rotationPointY = this.sailEnd.rotationPointY - (float)(0);
        this.sailEnd.rotationPointZ = this.sailEnd.rotationPointZ + (float)(0);


        this.setRotateAngle(sailFront2, sailFront2.rotateAngleX + (float) Math.toRadians(0), sailFront2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*3), sailFront2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*-5));
        this.sailFront2.rotationPointX = this.sailFront2.rotationPointX + (float)(0.05);
        this.sailFront2.rotationPointY = this.sailFront2.rotationPointY - (float)(0);
        this.sailFront2.rotationPointZ = this.sailFront2.rotationPointZ + (float)(0.15);


        this.setRotateAngle(sailEnd2, sailEnd2.rotateAngleX + (float) Math.toRadians(0), sailEnd2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*3.5), sailEnd2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-130))*4));
        this.sailEnd2.rotationPointX = this.sailEnd2.rotationPointX + (float)(0);
        this.sailEnd2.rotationPointY = this.sailEnd2.rotationPointY - (float)(0);
        this.sailEnd2.rotationPointZ = this.sailEnd2.rotationPointZ + (float)(-0.05);


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraDimetrodon_teutonis ee = (EntityPrehistoricFloraDimetrodon_teutonis) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDimetrodon_teutonis e = (EntityPrehistoricFloraDimetrodon_teutonis) entity;

    }
}
