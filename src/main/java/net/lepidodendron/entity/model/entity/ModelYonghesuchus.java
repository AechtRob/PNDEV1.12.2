package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraYonghesuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelYonghesuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
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
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;

    private ModelAnimator animator;

    public ModelYonghesuchus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 16.25F, 4.25F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 2.8268F, -0.0649F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3447F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 25, -0.5F, -0.65F, -1.55F, 2, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.45F, 0.475F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 44, 0.0F, -1.0F, -2.0F, 1, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 0.65F, 0.5F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 17, -1.0F, -1.0F, -2.0F, 3, 3, 3, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.5F, 0.7244F, 0.1196F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.2182F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 39, 30, -1.0F, -0.25F, -1.0F, 2, 4, 2, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5F, 3.75F, -1.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7854F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 16, 48, -1.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 21, 48, -1.0F, 0.0F, 0.4F, 1, 4, 1, -0.003F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.5F, 3.8361F, 0.985F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.2182F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.1697F, -0.3661F);
        this.leftLeg3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 37, -1.5F, -0.25F, -2.5F, 2, 1, 3, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.5F, 0.7244F, 0.1196F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2182F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 39, 30, -1.0F, -0.25F, -1.0F, 2, 4, 2, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5F, 3.75F, -1.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7854F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 16, 48, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 21, 48, 0.0F, 0.0F, 0.4F, 1, 4, 1, -0.003F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.5F, 3.8361F, 0.985F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.2182F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -0.1697F, -0.3661F);
        this.rightLeg3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.7854F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 39, 37, -0.5F, -0.25F, -2.5F, 2, 1, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.55F, 0.95F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.1745F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 13, 31, -1.0F, -0.8F, 0.0F, 2, 2, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 38, -1.0F, 0.8F, 0.0F, 2, 1, 4, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -0.075F, 0.0F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 19, 0.0F, -1.0F, 0.0F, 1, 1, 4, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0496F, 3.5935F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 9, -0.25F, -0.75F, 0.0F, 1, 2, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 17, -0.75F, -0.75F, 0.0F, 1, 2, 5, 0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.95F, 0.0F);
        this.tail2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0262F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 6, -0.5F, 0.0F, 0.0F, 1, 1, 5, -0.006F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.225F, 4.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 13, 24, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 24, -0.5F, 0.0F, 0.0F, 1, 1, 5, -0.006F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 25, -0.5F, -0.4F, 0.0F, 1, 1, 5, -0.003F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.4913F, -1.0904F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0916F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 9, -2.0F, 0.0F, -3.0F, 4, 4, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 41, 6, -1.0F, -0.2F, -3.0F, 2, 1, 3, -0.003F, false));
        this.body.cubeList.add(new ModelBox(body, 13, 38, -1.5F, 3.4F, -3.0F, 3, 1, 3, -0.003F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.0F, -2.425F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0044F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.0F, -1.0F, -4.0F, 4, 4, 4, -0.003F, false));
        this.body2.cubeList.add(new ModelBox(body2, 26, 37, -1.0F, -1.2F, -4.0F, 2, 1, 4, -0.006F, false));
        this.body2.cubeList.add(new ModelBox(body2, 17, 0, -1.5F, 2.4F, -4.0F, 3, 1, 4, -0.006F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.075F, -3.45F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0873F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 26, 31, -1.5F, -1.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 3.0263F, -0.6111F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4974F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 32, -0.5F, -2.0F, -3.075F, 3, 2, 3, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.6F, -3.0F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 43, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(1.6F, 1.85F, -1.6F);
        this.body3.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.3054F, 0.0F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 26, 48, -0.5F, -0.5F, -0.5F, 1, 3, 1, 0.003F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 2.3967F, 0.5044F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.7854F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 49, -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 1.7139F, -0.0902F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.3054F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 40, 47, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.6F, 1.85F, -1.6F);
        this.body3.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.3054F, 0.0F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 26, 48, -0.5F, -0.5F, -0.5F, 1, 3, 1, 0.003F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 2.3967F, 0.5044F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.7854F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 49, -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 1.7139F, -0.0902F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.3054F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 40, 47, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.2669F, -2.4581F);
        this.body3.addChild(neck);
        this.setRotateAngle(neck, -0.2749F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 26, 17, -1.0F, -0.5F, -3.25F, 2, 2, 4, -0.003F, false));
        this.neck.cubeList.add(new ModelBox(neck, 32, 0, -1.0F, 0.9F, -3.25F, 2, 1, 4, -0.006F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5F, -0.65F, -0.25F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 13, 1.0F, 0.0F, -3.0F, 1, 1, 4, -0.003F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5108F, -3.2012F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 28, 13, -1.0F, 0.425F, -1.975F, 2, 1, 2, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 31, 43, -0.5F, 0.425F, -3.7F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.1201F, -4.3018F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2967F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 6, -0.475F, -0.5F, -0.525F, 0, 1, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 6, 0.475F, -0.5F, -0.525F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.1463F, 0.9381F, -3.4558F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3686F, -0.2482F, -0.027F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 9, 44, -0.4F, -0.3F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.1463F, 0.8881F, -2.9558F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4297F, -0.2482F, -0.027F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 5, 49, -0.4F, -0.3F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.85F, 1.125F, -1.675F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0241F, -0.2482F, -0.027F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 49, 49, 0.0F, -0.5F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.0328F, -1.0475F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1658F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 39, 42, -0.5F, 0.0F, -4.0F, 1, 1, 3, 0.003F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 48, 34, -1.0F, 0.0F, -1.0F, 2, 1, 1, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 0.0196F, -0.0488F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0524F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 6, -0.5F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.1463F, 0.8881F, -2.9558F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.4297F, 0.2482F, 0.027F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 5, 49, 0.4F, -0.3F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.1463F, 0.9381F, -3.4558F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3686F, 0.2482F, 0.027F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 9, 44, 0.4F, -0.3F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.85F, 1.125F, -1.675F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0241F, 0.2482F, 0.027F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 49, 49, 0.0F, -0.5F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, 0.925F, -1.975F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0241F, -0.2482F, -0.027F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 48, 30, 0.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.2F, 0.7F, -1.375F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0241F, -0.2482F, -0.027F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 49, 46, 0.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.2F, 0.7F, -1.375F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0241F, 0.2482F, 0.027F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 49, 46, -1.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, 0.925F, -1.975F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0241F, 0.2482F, 0.027F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 48, 30, -1.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.425F, -0.25F);
        this.head.addChild(jaw);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.0F, 0.35F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.096F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 13, 43, -0.5F, -1.025F, -4.925F, 1, 1, 3, -0.003F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 31, 47, -1.0F, -2.0F, -1.75F, 2, 1, 2, -0.01F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 45, 0, -1.0F, -1.025F, -2.15F, 2, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, 0.769F, -1.7877F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1026F, -0.2549F, 0.0387F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 48, 42, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 9, 48, 0.1F, -1.25F, -2.8F, 0, 1, 3, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0F, 0.769F, -1.7877F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1026F, 0.2549F, -0.0387F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 9, 48, -0.1F, -1.25F, -2.8F, 0, 1, 3, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 48, 42, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

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

        EntityPrehistoricFloraYonghesuchus EntityMegalosaurus = (EntityPrehistoricFloraYonghesuchus) e;

        this.faceTarget(f3, f4, 8, body3);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.body3, this.head};

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

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYonghesuchus entity = (EntityPrehistoricFloraYonghesuchus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 12.5 + (((tickAnim - 3) / 4) * (-8.75-(12.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -8.75 + (((tickAnim - 7) / 3) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -18.5 + (((tickAnim - 3) / 2) * (-22.4-(-18.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -22.4 + (((tickAnim - 5) / 2) * (0-(-22.4)));
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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.475-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0.475 + (((tickAnim - 3) / 7) * (0-(0.475)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 21 + (((tickAnim - 3) / 2) * (42.25-(21)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 42.25 + (((tickAnim - 5) / 2) * (0-(42.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYonghesuchus entity = (EntityPrehistoricFloraYonghesuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 25.25 + (((tickAnim - 8) / 5) * (89.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-155-(25.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 89.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-155 + (((tickAnim - 13) / 4) * (-39.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55-(89.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-155)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -39.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55 + (((tickAnim - 17) / 3) * (0-(-39.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (30.61-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 30.61 + (((tickAnim - 4) / 4) * (24.5-(30.61)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 24.5 + (((tickAnim - 8) / 5) * (0-(24.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (10.5-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 10.5 + (((tickAnim - 17) / 3) * (0-(10.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 30.75 + (((tickAnim - 4) / 4) * (0-(30.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (11.75-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 11.75 + (((tickAnim - 10) / 2) * (30.25-(11.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 30.25 + (((tickAnim - 12) / 1) * (0-(30.25)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (11.75-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 11.75 + (((tickAnim - 16) / 2) * (21-(11.75)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 21 + (((tickAnim - 18) / 2) * (0-(21)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.175-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0.175 + (((tickAnim - 10) / 2) * (-0.125-(0.175)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = -0.125 + (((tickAnim - 12) / 1) * (0-(-0.125)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0.175-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0.175 + (((tickAnim - 16) / 2) * (-0.125-(0.175)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = -0.125 + (((tickAnim - 18) / 2) * (0-(-0.125)));
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
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYonghesuchus entity = (EntityPrehistoricFloraYonghesuchus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = -14.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-30 + (((tickAnim - 0) / 18) * (-10.1-(-14.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-30)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -10.1 + (((tickAnim - 18) / 12) * (0-(-10.1)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (33.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 33.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-50 + (((tickAnim - 18) / 12) * (0-(33.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-50)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (77.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-100-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 77.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-100 + (((tickAnim - 18) / 3) * (0-(77.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-100)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYonghesuchus entity = (EntityPrehistoricFloraYonghesuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-25.35395-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-16.44463-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-7.51672-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -25.35395 + (((tickAnim - 15) / 9) * (15.36576-(-25.35395)));
            yy = -16.44463 + (((tickAnim - 15) / 9) * (-16.97536-(-16.44463)));
            zz = -7.51672 + (((tickAnim - 15) / 9) * (-28.35428-(-7.51672)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 15.36576 + (((tickAnim - 24) / 11) * (53.27976-(15.36576)));
            yy = -16.97536 + (((tickAnim - 24) / 11) * (-16.42963-(-16.97536)));
            zz = -28.35428 + (((tickAnim - 24) / 11) * (-17.68323-(-28.35428)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 53.27976 + (((tickAnim - 35) / 8) * (-13.57011-(53.27976)));
            yy = -16.42963 + (((tickAnim - 35) / 8) * (-7.30206-(-16.42963)));
            zz = -17.68323 + (((tickAnim - 35) / 8) * (-7.85921-(-17.68323)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -13.57011 + (((tickAnim - 43) / 7) * (0-(-13.57011)));
            yy = -7.30206 + (((tickAnim - 43) / 7) * (0-(-7.30206)));
            zz = -7.85921 + (((tickAnim - 43) / 7) * (0-(-7.85921)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -22.5 + (((tickAnim - 15) / 9) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (16.25-(0)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 16.25 + (((tickAnim - 35) / 15) * (0-(16.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (50-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 50 + (((tickAnim - 15) / 9) * (66.37633-(50)));
            yy = 0 + (((tickAnim - 15) / 9) * (-12.13005-(0)));
            zz = 0 + (((tickAnim - 15) / 9) * (-14.73532-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 66.37633 + (((tickAnim - 24) / 11) * (69-(66.37633)));
            yy = -12.13005 + (((tickAnim - 24) / 11) * (0-(-12.13005)));
            zz = -14.73532 + (((tickAnim - 24) / 11) * (0-(-14.73532)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 69 + (((tickAnim - 35) / 8) * (37.92-(69)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 37.92 + (((tickAnim - 43) / 7) * (0-(37.92)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (-0.16-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (0.715-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -0.16 + (((tickAnim - 19) / 5) * (0-(-0.16)));
            yy = 0.715 + (((tickAnim - 19) / 5) * (0-(0.715)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (1.475-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 1.475 + (((tickAnim - 43) / 7) * (0-(1.475)));
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

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYonghesuchus entity = (EntityPrehistoricFloraYonghesuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -13.25 + (((tickAnim - 15) / 20) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -13.25 + (((tickAnim - 35) / 15) * (0-(-13.25)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (-2.6-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.175-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -2.6 + (((tickAnim - 15) / 20) * (-2.6-(-2.6)));
            zz = 1.175 + (((tickAnim - 15) / 20) * (1.175-(1.175)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -2.6 + (((tickAnim - 35) / 15) * (0-(-2.6)));
            zz = 1.175 + (((tickAnim - 35) / 15) * (0-(1.175)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-41.74353-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.01444-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.73039-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -41.74353 + (((tickAnim - 15) / 20) * (-41.74353-(-41.74353)));
            yy = -1.01444 + (((tickAnim - 15) / 20) * (-1.01444-(-1.01444)));
            zz = -0.73039 + (((tickAnim - 15) / 20) * (-0.73039-(-0.73039)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -41.74353 + (((tickAnim - 35) / 15) * (0-(-41.74353)));
            yy = -1.01444 + (((tickAnim - 35) / 15) * (0-(-1.01444)));
            zz = -0.73039 + (((tickAnim - 35) / 15) * (0-(-0.73039)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 14.75 + (((tickAnim - 15) / 20) * (14.75-(14.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 14.75 + (((tickAnim - 35) / 15) * (0-(14.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-41.74353-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.01444-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.73039-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -41.74353 + (((tickAnim - 15) / 20) * (-41.74353-(-41.74353)));
            yy = 1.01444 + (((tickAnim - 15) / 20) * (1.01444-(1.01444)));
            zz = 0.73039 + (((tickAnim - 15) / 20) * (0.73039-(0.73039)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -41.74353 + (((tickAnim - 35) / 15) * (0-(-41.74353)));
            yy = 1.01444 + (((tickAnim - 35) / 15) * (0-(1.01444)));
            zz = 0.73039 + (((tickAnim - 35) / 15) * (0-(0.73039)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 14.75 + (((tickAnim - 15) / 20) * (14.75-(14.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 14.75 + (((tickAnim - 35) / 15) * (0-(14.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 12 + (((tickAnim - 15) / 20) * (12-(12)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 35) / 15) * (0-(12)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (9.25-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
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
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -3.25 + (((tickAnim - 15) / 20) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 35) / 15) * (0-(-3.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 15.25 + (((tickAnim - 15) / 20) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 15.25 + (((tickAnim - 35) / 15) * (0-(15.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYonghesuchus entity = (EntityPrehistoricFloraYonghesuchus) entitylivingbaseIn;
        int animCycle = 100;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 55) {
            xx = 2.25 + (((tickAnim - 20) / 35) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 20) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 35) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 2.25 + (((tickAnim - 55) / 5) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 2.25 + (((tickAnim - 60) / 10) * (0-(2.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 55) {
            xx = 10.75 + (((tickAnim - 20) / 35) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 20) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 35) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 10.75 + (((tickAnim - 55) / 5) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 10.75 + (((tickAnim - 60) / 10) * (0-(10.75)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-26.49866-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.15051-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-13.33076-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -26.49866 + (((tickAnim - 10) / 10) * (-53.5-(-26.49866)));
            yy = -2.15051 + (((tickAnim - 10) / 10) * (0-(-2.15051)));
            zz = -13.33076 + (((tickAnim - 10) / 10) * (0-(-13.33076)));
        }
        else if (tickAnim >= 20 && tickAnim < 55) {
            xx = -53.5 + (((tickAnim - 20) / 35) * (-53.5-(-53.5)));
            yy = 0 + (((tickAnim - 20) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 35) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -53.5 + (((tickAnim - 55) / 5) * (-53.5-(-53.5)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -53.5 + (((tickAnim - 60) / 5) * (-0.25-(-53.5)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = -0.25 + (((tickAnim - 65) / 5) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-20.1583-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (4.76658-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.20305-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -20.1583 + (((tickAnim - 10) / 10) * (7-(-20.1583)));
            yy = 4.76658 + (((tickAnim - 10) / 10) * (0-(4.76658)));
            zz = 2.20305 + (((tickAnim - 10) / 10) * (0-(2.20305)));
        }
        else if (tickAnim >= 20 && tickAnim < 55) {
            xx = 7 + (((tickAnim - 20) / 35) * (7-(7)));
            yy = 0 + (((tickAnim - 20) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 35) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 7 + (((tickAnim - 55) / 5) * (7-(7)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 7 + (((tickAnim - 60) / 5) * (-37-(7)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = -37 + (((tickAnim - 65) / 5) * (0-(-37)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (59.88-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 59.88 + (((tickAnim - 10) / 10) * (33.75-(59.88)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 55) {
            xx = 33.75 + (((tickAnim - 20) / 35) * (33.75-(33.75)));
            yy = 0 + (((tickAnim - 20) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 35) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 33.75 + (((tickAnim - 55) / 5) * (33.75-(33.75)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 33.75 + (((tickAnim - 60) / 5) * (76.38-(33.75)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 76.38 + (((tickAnim - 65) / 5) * (0-(76.38)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.06-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.6-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.06 + (((tickAnim - 10) / 10) * (0.125-(0.06)));
            zz = -0.6 + (((tickAnim - 10) / 10) * (-0.2-(-0.6)));
        }
        else if (tickAnim >= 20 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 20) / 35) * (0-(0)));
            yy = 0.125 + (((tickAnim - 20) / 35) * (0.125-(0.125)));
            zz = -0.2 + (((tickAnim - 20) / 35) * (-0.2-(-0.2)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 0.125 + (((tickAnim - 55) / 5) * (0.125-(0.125)));
            zz = -0.2 + (((tickAnim - 55) / 5) * (-0.2-(-0.2)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0.125 + (((tickAnim - 60) / 5) * (0.585-(0.125)));
            zz = -0.2 + (((tickAnim - 60) / 5) * (-0.8-(-0.2)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            yy = 0.585 + (((tickAnim - 65) / 5) * (0-(0.585)));
            zz = -0.8 + (((tickAnim - 65) / 5) * (0-(-0.8)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 55) {
            xx = -19.25 + (((tickAnim - 20) / 35) * (-19.25-(-19.25)));
            yy = 0 + (((tickAnim - 20) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 35) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -19.25 + (((tickAnim - 55) / 5) * (-19.25-(-19.25)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -19.25 + (((tickAnim - 60) / 10) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 55) {
            xx = -13.25 + (((tickAnim - 20) / 35) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 20) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 35) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -13.25 + (((tickAnim - 55) / 5) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -13.25 + (((tickAnim - 60) / 10) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 55) {
            xx = 19.25 + (((tickAnim - 20) / 35) * (19.25-(19.25)));
            yy = 0 + (((tickAnim - 20) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 35) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 19.25 + (((tickAnim - 55) / 5) * (19.25-(19.25)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 19.25 + (((tickAnim - 60) / 10) * (0-(19.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 20) / 35) * (0-(0)));
            yy = 0.225 + (((tickAnim - 20) / 35) * (0.225-(0.225)));
            zz = 0 + (((tickAnim - 20) / 35) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 0.225 + (((tickAnim - 55) / 5) * (0.225-(0.225)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0.225 + (((tickAnim - 60) / 10) * (0-(0.225)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*18 + (((tickAnim - 0) / 20) * (8.75-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*18)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 8.75 + (((tickAnim - 20) / 2) * (9.25-(8.75)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 9.25 + (((tickAnim - 22) / 1) * (8.75-(9.25)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 8.75 + (((tickAnim - 23) / 2) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 8.75 + (((tickAnim - 25) / 2) * (9.25-(8.75)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 9.25 + (((tickAnim - 27) / 1) * (8.75-(9.25)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 8.75 + (((tickAnim - 28) / 2) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 8.75 + (((tickAnim - 30) / 2) * (9.25-(8.75)));
            yy = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 9.25 + (((tickAnim - 32) / 1) * (8.75-(9.25)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 8.75 + (((tickAnim - 33) / 4) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 8.75 + (((tickAnim - 37) / 1) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 55) {
            xx = 8.75 + (((tickAnim - 38) / 17) * (-20.20905-(8.75)));
            yy = 0 + (((tickAnim - 38) / 17) * (7.48002-(0)));
            zz = 0 + (((tickAnim - 38) / 17) * (-2.03902-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -20.20905 + (((tickAnim - 55) / 5) * (-20.20905-(-20.20905)));
            yy = 7.48002 + (((tickAnim - 55) / 5) * (7.48002-(7.48002)));
            zz = -2.03902 + (((tickAnim - 55) / 5) * (-2.03902-(-2.03902)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -20.20905 + (((tickAnim - 60) / 10) * (-20.20905-(-20.20905)));
            yy = 7.48002 + (((tickAnim - 60) / 10) * (7.48002-(7.48002)));
            zz = -2.03902 + (((tickAnim - 60) / 10) * (-2.03902-(-2.03902)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = -20.20905 + (((tickAnim - 70) / 3) * (-17.45905-(-20.20905)));
            yy = 7.48002 + (((tickAnim - 70) / 3) * (7.48002-(7.48002)));
            zz = -2.03902 + (((tickAnim - 70) / 3) * (-2.03902-(-2.03902)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = -17.45905 + (((tickAnim - 73) / 2) * (-20.20905-(-17.45905)));
            yy = 7.48002 + (((tickAnim - 73) / 2) * (7.48002-(7.48002)));
            zz = -2.03902 + (((tickAnim - 73) / 2) * (-2.03902-(-2.03902)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = -20.20905 + (((tickAnim - 75) / 3) * (-17.45905-(-20.20905)));
            yy = 7.48002 + (((tickAnim - 75) / 3) * (7.48002-(7.48002)));
            zz = -2.03902 + (((tickAnim - 75) / 3) * (-2.03902-(-2.03902)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = -17.45905 + (((tickAnim - 78) / 2) * (-20.20905-(-17.45905)));
            yy = 7.48002 + (((tickAnim - 78) / 2) * (7.48002-(7.48002)));
            zz = -2.03902 + (((tickAnim - 78) / 2) * (-2.03902-(-2.03902)));
        }
        else if (tickAnim >= 80 && tickAnim < 88) {
            xx = -20.20905 + (((tickAnim - 80) / 8) * (-20.20905-(-20.20905)));
            yy = 7.48002 + (((tickAnim - 80) / 8) * (7.48002-(7.48002)));
            zz = -2.03902 + (((tickAnim - 80) / 8) * (-2.03902-(-2.03902)));
        }
        else if (tickAnim >= 88 && tickAnim < 100) {
            xx = -20.20905 + (((tickAnim - 88) / 12) * (0-(-20.20905)));
            yy = 7.48002 + (((tickAnim - 88) / 12) * (0-(7.48002)));
            zz = -2.03902 + (((tickAnim - 88) / 12) * (0-(-2.03902)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*70 + (((tickAnim - 0) / 20) * (24.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*70)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 24.5 + (((tickAnim - 20) / 2) * (23.06238-(24.5)));
            yy = 0 + (((tickAnim - 20) / 2) * (0.58196-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0.01433-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 23.06238 + (((tickAnim - 22) / 1) * (24.5-(23.06238)));
            yy = 0.58196 + (((tickAnim - 22) / 1) * (0-(0.58196)));
            zz = 0.01433 + (((tickAnim - 22) / 1) * (0-(0.01433)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 24.5 + (((tickAnim - 23) / 2) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 24.5 + (((tickAnim - 25) / 2) * (23.06238-(24.5)));
            yy = 0 + (((tickAnim - 25) / 2) * (0.58196-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0.01433-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 23.06238 + (((tickAnim - 27) / 1) * (24.5-(23.06238)));
            yy = 0.58196 + (((tickAnim - 27) / 1) * (0-(0.58196)));
            zz = 0.01433 + (((tickAnim - 27) / 1) * (0-(0.01433)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 24.5 + (((tickAnim - 28) / 2) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 24.5 + (((tickAnim - 30) / 2) * (23.06238-(24.5)));
            yy = 0 + (((tickAnim - 30) / 2) * (0.58196-(0)));
            zz = 0 + (((tickAnim - 30) / 2) * (0.01433-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 23.06238 + (((tickAnim - 32) / 1) * (24.5-(23.06238)));
            yy = 0.58196 + (((tickAnim - 32) / 1) * (0-(0.58196)));
            zz = 0.01433 + (((tickAnim - 32) / 1) * (0-(0.01433)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 24.5 + (((tickAnim - 33) / 4) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 24.5 + (((tickAnim - 37) / 1) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 24.5 + (((tickAnim - 38) / 10) * (-3.71468-(24.5)));
            yy = 0 + (((tickAnim - 38) / 10) * (15.19912-(0)));
            zz = 0 + (((tickAnim - 38) / 10) * (3.52457-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -3.71468 + (((tickAnim - 48) / 7) * (8.76607-(-3.71468)));
            yy = 15.19912 + (((tickAnim - 48) / 7) * (8.86375-(15.19912)));
            zz = 3.52457 + (((tickAnim - 48) / 7) * (3.43193-(3.52457)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 8.76607 + (((tickAnim - 55) / 5) * (8.76607-(8.76607)));
            yy = 8.86375 + (((tickAnim - 55) / 5) * (8.86375-(8.86375)));
            zz = 3.43193 + (((tickAnim - 55) / 5) * (3.43193-(3.43193)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 8.76607 + (((tickAnim - 60) / 10) * (21.26607-(8.76607)));
            yy = 8.86375 + (((tickAnim - 60) / 10) * (8.86375-(8.86375)));
            zz = 3.43193 + (((tickAnim - 60) / 10) * (3.43193-(3.43193)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 21.26607 + (((tickAnim - 70) / 3) * (15.26607-(21.26607)));
            yy = 8.86375 + (((tickAnim - 70) / 3) * (8.86375-(8.86375)));
            zz = 3.43193 + (((tickAnim - 70) / 3) * (3.43193-(3.43193)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = 15.26607 + (((tickAnim - 73) / 2) * (21.26607-(15.26607)));
            yy = 8.86375 + (((tickAnim - 73) / 2) * (8.86375-(8.86375)));
            zz = 3.43193 + (((tickAnim - 73) / 2) * (3.43193-(3.43193)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 21.26607 + (((tickAnim - 75) / 3) * (15.26607-(21.26607)));
            yy = 8.86375 + (((tickAnim - 75) / 3) * (8.86375-(8.86375)));
            zz = 3.43193 + (((tickAnim - 75) / 3) * (3.43193-(3.43193)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 15.26607 + (((tickAnim - 78) / 2) * (21.26607-(15.26607)));
            yy = 8.86375 + (((tickAnim - 78) / 2) * (8.86375-(8.86375)));
            zz = 3.43193 + (((tickAnim - 78) / 2) * (3.43193-(3.43193)));
        }
        else if (tickAnim >= 80 && tickAnim < 88) {
            xx = 21.26607 + (((tickAnim - 80) / 8) * (21.26607-(21.26607)));
            yy = 8.86375 + (((tickAnim - 80) / 8) * (8.86375-(8.86375)));
            zz = 3.43193 + (((tickAnim - 80) / 8) * (3.43193-(3.43193)));
        }
        else if (tickAnim >= 88 && tickAnim < 100) {
            xx = 21.26607 + (((tickAnim - 88) / 12) * (0-(21.26607)));
            yy = 8.86375 + (((tickAnim - 88) / 12) * (0-(8.86375)));
            zz = 3.43193 + (((tickAnim - 88) / 12) * (0-(3.43193)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 38 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 38) / 10) * (9.75-(0)));
            yy = 0 + (((tickAnim - 38) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 10) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 9.75 + (((tickAnim - 48) / 7) * (0-(9.75)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYonghesuchus entity = (EntityPrehistoricFloraYonghesuchus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 35.5 + (((tickAnim - 0) / 9) * (-24.6658-(35.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.60416-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.79688-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -24.6658 + (((tickAnim - 9) / 4) * (-14.5-(-24.6658)));
            yy = 0.60416 + (((tickAnim - 9) / 4) * (0-(0.60416)));
            zz = 0.79688 + (((tickAnim - 9) / 4) * (0-(0.79688)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -14.5 + (((tickAnim - 13) / 12) * (35.5-(-14.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 52.5 + (((tickAnim - 0) / 5) * (86.22-(52.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 86.22 + (((tickAnim - 5) / 4) * (68.74-(86.22)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 68.74 + (((tickAnim - 9) / 4) * (27.25-(68.74)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 27.25 + (((tickAnim - 13) / 5) * (-1.78-(27.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -1.78 + (((tickAnim - 18) / 7) * (52.5-(-1.78)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.885-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.35-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.885 + (((tickAnim - 5) / 3) * (1.35-(0.885)));
            zz = -0.35 + (((tickAnim - 5) / 3) * (0.165-(-0.35)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.35 + (((tickAnim - 8) / 1) * (1.82-(1.35)));
            zz = 0.165 + (((tickAnim - 8) / 1) * (-0.18-(0.165)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.82 + (((tickAnim - 9) / 4) * (0.45-(1.82)));
            zz = -0.18 + (((tickAnim - 9) / 4) * (0-(-0.18)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.45 + (((tickAnim - 13) / 5) * (0.16-(0.45)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0.16 + (((tickAnim - 18) / 7) * (0-(0.16)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
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
            xx = -14.5 + (((tickAnim - 0) / 13) * (35.5-(-14.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 35.5 + (((tickAnim - 13) / 9) * (-24.6658-(35.5)));
            yy = 0 + (((tickAnim - 13) / 9) * (0.60416-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0.79688-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -24.6658 + (((tickAnim - 22) / 3) * (-14.5-(-24.6658)));
            yy = 0.60416 + (((tickAnim - 22) / 3) * (0-(0.60416)));
            zz = 0.79688 + (((tickAnim - 22) / 3) * (0-(0.79688)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -13.25 + (((tickAnim - 0) / 13) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (36.82-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 36.82 + (((tickAnim - 18) / 7) * (-13.25-(36.82)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 27.25 + (((tickAnim - 0) / 6) * (-1.78-(27.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -1.78 + (((tickAnim - 6) / 7) * (52.5-(-1.78)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 52.5 + (((tickAnim - 13) / 5) * (86.22-(52.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 86.22 + (((tickAnim - 18) / 4) * (68.74-(86.22)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 68.74 + (((tickAnim - 22) / 3) * (27.25-(68.74)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.45 + (((tickAnim - 0) / 6) * (0.16-(0.45)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.16 + (((tickAnim - 6) / 7) * (0-(0.16)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.885-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.35-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.885 + (((tickAnim - 18) / 2) * (1.35-(0.885)));
            zz = -0.35 + (((tickAnim - 18) / 2) * (0.165-(-0.35)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 1.35 + (((tickAnim - 20) / 2) * (1.82-(1.35)));
            zz = 0.165 + (((tickAnim - 20) / 2) * (-0.18-(0.165)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 1.82 + (((tickAnim - 22) / 3) * (0.45-(1.82)));
            zz = -0.18 + (((tickAnim - 22) / 3) * (0-(-0.18)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -45.75 + (((tickAnim - 0) / 13) * (39.97997-(-45.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (1.89749-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-1.20937-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 39.97997 + (((tickAnim - 13) / 6) * (-8.87225-(39.97997)));
            yy = 1.89749 + (((tickAnim - 13) / 6) * (11.87904-(1.89749)));
            zz = -1.20937 + (((tickAnim - 13) / 6) * (-50.57706-(-1.20937)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -8.87225 + (((tickAnim - 19) / 6) * (-45.75-(-8.87225)));
            yy = 11.87904 + (((tickAnim - 19) / 6) * (0-(11.87904)));
            zz = -50.57706 + (((tickAnim - 19) / 6) * (0-(-50.57706)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 18.5 + (((tickAnim - 0) / 13) * (10.75-(18.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 10.75 + (((tickAnim - 13) / 6) * (-38.8669-(10.75)));
            yy = 0 + (((tickAnim - 13) / 6) * (-0.68113-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (53.87621-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -38.8669 + (((tickAnim - 19) / 6) * (18.5-(-38.8669)));
            yy = -0.68113 + (((tickAnim - 19) / 6) * (0-(-0.68113)));
            zz = 53.87621 + (((tickAnim - 19) / 6) * (0-(53.87621)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (-0.625-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -0.625 + (((tickAnim - 19) / 6) * (0-(-0.625)));
            yy = -0.275 + (((tickAnim - 19) / 6) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
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
            xx = 26.5 + (((tickAnim - 0) / 7) * (-10.75-(26.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -10.75 + (((tickAnim - 7) / 6) * (47.5-(-10.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 47.5 + (((tickAnim - 13) / 1) * (99-(47.5)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 99 + (((tickAnim - 14) / 5) * (74.5-(99)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 74.5 + (((tickAnim - 19) / 6) * (26.5-(74.5)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.555-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.21-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.555 + (((tickAnim - 3) / 4) * (-0.125-(0.555)));
            zz = -0.21 + (((tickAnim - 3) / 4) * (0-(-0.21)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.125 + (((tickAnim - 7) / 6) * (0.1-(-0.125)));
            zz = 0 + (((tickAnim - 7) / 6) * (-0.8-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0.1 + (((tickAnim - 13) / 6) * (0.6-(0.1)));
            zz = -0.8 + (((tickAnim - 13) / 6) * (-0.8-(-0.8)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0.6 + (((tickAnim - 19) / 6) * (0-(0.6)));
            zz = -0.8 + (((tickAnim - 19) / 6) * (0-(-0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 39.99975 + (((tickAnim - 0) / 7) * (-8.87225-(39.99975)));
            yy = -0.21085 + (((tickAnim - 0) / 7) * (-11.87904-(-0.21085)));
            zz = 0.13433 + (((tickAnim - 0) / 7) * (50.57706-(0.13433)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -8.87225 + (((tickAnim - 7) / 6) * (-45.75-(-8.87225)));
            yy = -11.87904 + (((tickAnim - 7) / 6) * (0-(-11.87904)));
            zz = 50.57706 + (((tickAnim - 7) / 6) * (0-(50.57706)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -45.75 + (((tickAnim - 13) / 12) * (39.99975-(-45.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (-0.21085-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0.13433-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 10.75 + (((tickAnim - 0) / 7) * (-38.8669-(10.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.68113-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-53.87621-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -38.8669 + (((tickAnim - 7) / 6) * (18.5-(-38.8669)));
            yy = 0.68113 + (((tickAnim - 7) / 6) * (0-(0.68113)));
            zz = -53.87621 + (((tickAnim - 7) / 6) * (0-(-53.87621)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 18.5 + (((tickAnim - 13) / 12) * (10.75-(18.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0.625-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0.625 + (((tickAnim - 7) / 6) * (0-(0.625)));
            yy = -0.275 + (((tickAnim - 7) / 6) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
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
            xx = 47.5 + (((tickAnim - 0) / 3) * (99-(47.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 99 + (((tickAnim - 3) / 4) * (74.5-(99)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 74.5 + (((tickAnim - 7) / 6) * (26.5-(74.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 26.5 + (((tickAnim - 13) / 6) * (-10.75-(26.5)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -10.75 + (((tickAnim - 19) / 6) * (47.5-(-10.75)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 7) * (0.6-(0.1)));
            zz = -0.8 + (((tickAnim - 0) / 7) * (-0.8-(-0.8)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.6 + (((tickAnim - 7) / 6) * (0-(0.6)));
            zz = -0.8 + (((tickAnim - 7) / 6) * (0-(-0.8)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.555-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.21-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 0.555 + (((tickAnim - 16) / 3) * (-0.125-(0.555)));
            zz = -0.21 + (((tickAnim - 16) / 3) * (0-(-0.21)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = -0.125 + (((tickAnim - 19) / 6) * (0.1-(-0.125)));
            zz = 0 + (((tickAnim - 19) / 6) * (-0.8-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+80))*2), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*1), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*-0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*0.3);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (36.82-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 36.82 + (((tickAnim - 6) / 7) * (-13.25-(36.82)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -13.25 + (((tickAnim - 13) / 12) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+80))*2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*-4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*-2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-80))*3), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-1), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-2));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*-3), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*1), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*3), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-30))*-1), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*-2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-280))*-3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYonghesuchus entity = (EntityPrehistoricFloraYonghesuchus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577))*5), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-50))*-1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-50))*1);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -34.36003 + (((tickAnim - 0) / 6) * (42.75-(-34.36003)));
            yy = -11.08824 + (((tickAnim - 0) / 6) * (0-(-11.08824)));
            zz = 1.44809 + (((tickAnim - 0) / 6) * (0-(1.44809)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 42.75 + (((tickAnim - 6) / 5) * (-29.30501-(42.75)));
            yy = 0 + (((tickAnim - 6) / 5) * (-5.54412-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0.72405-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -29.30501 + (((tickAnim - 11) / 2) * (-34.36003-(-29.30501)));
            yy = -5.54412 + (((tickAnim - 11) / 2) * (-11.08824-(-5.54412)));
            zz = 0.72405 + (((tickAnim - 11) / 2) * (1.44809-(0.72405)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (36.5-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 36.5 + (((tickAnim - 9) / 4) * (0-(36.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0.325 + (((tickAnim - 0) / 6) * (0-(0.325)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0.325-(0)));
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
            xx = 34.25 + (((tickAnim - 0) / 3) * (2.14-(34.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 2.14 + (((tickAnim - 3) / 3) * (70.75-(2.14)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 70.75 + (((tickAnim - 6) / 7) * (34.25-(70.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 6) * (0.5-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 6) / 3) * (1.1-(0.5)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.1 + (((tickAnim - 9) / 4) * (-0.2-(1.1)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
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
            xx = -34.36003 + (((tickAnim - 0) / 6) * (42.75-(-34.36003)));
            yy = 11.08824 + (((tickAnim - 0) / 6) * (0-(11.08824)));
            zz = -1.44809 + (((tickAnim - 0) / 6) * (0-(-1.44809)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 42.75 + (((tickAnim - 6) / 5) * (-29.30501-(42.75)));
            yy = 0 + (((tickAnim - 6) / 5) * (5.54412-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0.72405-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -29.30501 + (((tickAnim - 11) / 2) * (-34.36003-(-29.30501)));
            yy = 5.54412 + (((tickAnim - 11) / 2) * (11.08824-(5.54412)));
            zz = 0.72405 + (((tickAnim - 11) / 2) * (-1.44809-(0.72405)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (36.5-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 36.5 + (((tickAnim - 9) / 4) * (0-(36.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0.325 + (((tickAnim - 0) / 6) * (0-(0.325)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0.325-(0)));
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
            xx = 34.25 + (((tickAnim - 0) / 3) * (2.14-(34.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 2.14 + (((tickAnim - 3) / 3) * (70.75-(2.14)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 70.75 + (((tickAnim - 6) / 7) * (34.25-(70.75)));
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
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 6) * (0.5-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 6) / 3) * (1.1-(0.5)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.1 + (((tickAnim - 9) / 4) * (-0.2-(1.1)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577))*9), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(8.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-50))*9), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-100))*12), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-150))*18), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-100))*-5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-200))*5), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-300))*-5), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 37.5 + (((tickAnim - 0) / 3) * (-6.42323-(37.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (9.07843-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-38.86788-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -6.42323 + (((tickAnim - 3) / 4) * (-57.5-(-6.42323)));
            yy = 9.07843 + (((tickAnim - 3) / 4) * (0-(9.07843)));
            zz = -38.86788 + (((tickAnim - 3) / 4) * (0-(-38.86788)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -57.5 + (((tickAnim - 7) / 6) * (37.5-(-57.5)));
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
            xx = 23.98064 + (((tickAnim - 0) / 3) * (-36.90392-(23.98064)));
            yy = 6.64745 + (((tickAnim - 0) / 3) * (3.79854-(6.64745)));
            zz = 16.76547 + (((tickAnim - 0) / 3) * (9.58027-(16.76547)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -36.90392 + (((tickAnim - 3) / 4) * (36.5-(-36.90392)));
            yy = 3.79854 + (((tickAnim - 3) / 4) * (0-(3.79854)));
            zz = 9.58027 + (((tickAnim - 3) / 4) * (0-(9.58027)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 36.5 + (((tickAnim - 7) / 6) * (23.98064-(36.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (6.64745-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (16.76547-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 57.5 + (((tickAnim - 0) / 3) * (88.18-(57.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 88.18 + (((tickAnim - 3) / 4) * (62.75-(88.18)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 62.75 + (((tickAnim - 7) / 1) * (2.33165-(62.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (-0.19494-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (-2.80582-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.33165 + (((tickAnim - 8) / 2) * (29.57662-(2.33165)));
            yy = -0.19494 + (((tickAnim - 8) / 2) * (0.77975-(-0.19494)));
            zz = -2.80582 + (((tickAnim - 8) / 2) * (-11.22329-(-2.80582)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 29.57662 + (((tickAnim - 10) / 3) * (57.5-(29.57662)));
            yy = 0.77975 + (((tickAnim - 10) / 3) * (0-(0.77975)));
            zz = -11.22329 + (((tickAnim - 10) / 3) * (0-(-11.22329)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.5-(0)));
            zz = -0.625 + (((tickAnim - 0) / 3) * (-0.71-(-0.625)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 2) * (0.6-(0.5)));
            zz = -0.71 + (((tickAnim - 3) / 2) * (-0.65-(-0.71)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.6 + (((tickAnim - 5) / 2) * (0-(0.6)));
            zz = -0.65 + (((tickAnim - 5) / 2) * (-0.525-(-0.65)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (-0.28-(0)));
            zz = -0.525 + (((tickAnim - 7) / 1) * (-0.04-(-0.525)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.28 + (((tickAnim - 8) / 2) * (0-(-0.28)));
            zz = -0.04 + (((tickAnim - 8) / 2) * (0-(-0.04)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.625-(0)));
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
            xx = 37.5 + (((tickAnim - 0) / 3) * (-6.42323-(37.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-9.07843-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (38.86788-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -6.42323 + (((tickAnim - 3) / 4) * (-57.5-(-6.42323)));
            yy = -9.07843 + (((tickAnim - 3) / 4) * (0-(-9.07843)));
            zz = 38.86788 + (((tickAnim - 3) / 4) * (0-(38.86788)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -57.5 + (((tickAnim - 7) / 6) * (37.5-(-57.5)));
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
            xx = 23.98064 + (((tickAnim - 0) / 3) * (-36.90392-(23.98064)));
            yy = -6.64745 + (((tickAnim - 0) / 3) * (-3.79854-(-6.64745)));
            zz = -16.76547 + (((tickAnim - 0) / 3) * (-9.58027-(-16.76547)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -36.90392 + (((tickAnim - 3) / 4) * (36.5-(-36.90392)));
            yy = -3.79854 + (((tickAnim - 3) / 4) * (0-(-3.79854)));
            zz = -9.58027 + (((tickAnim - 3) / 4) * (0-(-9.58027)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 36.5 + (((tickAnim - 7) / 6) * (23.98064-(36.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (-6.64745-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (-16.76547-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 57.5 + (((tickAnim - 0) / 3) * (88.18-(57.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 88.18 + (((tickAnim - 3) / 4) * (62.75-(88.18)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 62.75 + (((tickAnim - 7) / 1) * (2.33165-(62.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (-0.19494-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (2.80582-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.33165 + (((tickAnim - 8) / 2) * (29.57662-(2.33165)));
            yy = -0.19494 + (((tickAnim - 8) / 2) * (0.77975-(-0.19494)));
            zz = 2.80582 + (((tickAnim - 8) / 2) * (11.22329-(2.80582)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 29.57662 + (((tickAnim - 10) / 3) * (57.5-(29.57662)));
            yy = 0.77975 + (((tickAnim - 10) / 3) * (0-(0.77975)));
            zz = 11.22329 + (((tickAnim - 10) / 3) * (0-(11.22329)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.5-(0)));
            zz = -0.625 + (((tickAnim - 0) / 3) * (-0.71-(-0.625)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 2) * (0.6-(0.5)));
            zz = -0.71 + (((tickAnim - 3) / 2) * (-0.65-(-0.71)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.6 + (((tickAnim - 5) / 2) * (0-(0.6)));
            zz = -0.65 + (((tickAnim - 5) / 2) * (-0.525-(-0.65)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (-0.28-(0)));
            zz = -0.525 + (((tickAnim - 7) / 1) * (-0.04-(-0.525)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.28 + (((tickAnim - 8) / 2) * (0-(-0.28)));
            zz = -0.04 + (((tickAnim - 8) / 2) * (0-(-0.04)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.625-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-350))*-5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-400))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraYonghesuchus ee = (EntityPrehistoricFloraYonghesuchus) entitylivingbaseIn;

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
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraYonghesuchus e = (EntityPrehistoricFloraYonghesuchus) entity;

    }
}
