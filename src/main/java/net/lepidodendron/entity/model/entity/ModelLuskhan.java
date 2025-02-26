package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLuskhan;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLuskhan extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightbackflipper;
    private final AdvancedModelRenderer rightbackflipper2;
    private final AdvancedModelRenderer rightbackflipper3;
    private final AdvancedModelRenderer rightbackflipper4;
    private final AdvancedModelRenderer leftbackflipper;
    private final AdvancedModelRenderer leftbackflipper2;
    private final AdvancedModelRenderer leftbackflipper3;
    private final AdvancedModelRenderer leftbackflipper4;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightfrontflipper;
    private final AdvancedModelRenderer rightfrontflipper2;
    private final AdvancedModelRenderer rightfrontflipper3;
    private final AdvancedModelRenderer rightfrontflipper4;
    private final AdvancedModelRenderer leftfrontflipper;
    private final AdvancedModelRenderer leftfrontflipper2;
    private final AdvancedModelRenderer leftfrontflipper3;
    private final AdvancedModelRenderer leftfrontflipper4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer head;
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

    private ModelAnimator animator;

    public ModelLuskhan() {
        this.textureWidth = 133;
        this.textureHeight = 133;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 11.5F, 33.05F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -9.0F, -5.6887F, -32.0487F, 18, 18, 24, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -4.5748F, -8.8743F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.2618F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 43, -7.0F, -0.7894F, -0.3921F, 15, 11, 13, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 15.2106F, -0.3921F);
        this.tail.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 61, 0, -6.5F, -3.3F, 1.6F, 13, 6, 12, 0.0F, false));

        this.rightbackflipper = new AdvancedModelRenderer(this);
        this.rightbackflipper.setRotationPoint(-4.75F, 9.1361F, 5.5756F);
        this.tail.addChild(rightbackflipper);
        this.setRotateAngle(rightbackflipper, 0.6634F, -0.2361F, 1.168F);
        this.rightbackflipper.cubeList.add(new ModelBox(rightbackflipper, 0, 105, -2.0F, 0.0F, -2.5F, 4, 6, 5, 0.0F, false));
        this.rightbackflipper.cubeList.add(new ModelBox(rightbackflipper, 49, 103, -2.0F, 6.0F, -3.0F, 4, 6, 6, 0.0F, false));

        this.rightbackflipper2 = new AdvancedModelRenderer(this);
        this.rightbackflipper2.setRotationPoint(0.0F, 11.25F, -2.0F);
        this.rightbackflipper.addChild(rightbackflipper2);
        this.setRotateAngle(rightbackflipper2, 0.0416F, -0.0041F, -0.1108F);
        this.rightbackflipper2.cubeList.add(new ModelBox(rightbackflipper2, 0, 0, -1.5F, -1.0F, -1.25F, 3, 9, 7, 0.0F, false));

        this.rightbackflipper3 = new AdvancedModelRenderer(this);
        this.rightbackflipper3.setRotationPoint(0.0F, 7.65F, 1.25F);
        this.rightbackflipper2.addChild(rightbackflipper3);
        this.setRotateAngle(rightbackflipper3, 0.1309F, 0.0F, 0.0F);
        this.rightbackflipper3.cubeList.add(new ModelBox(rightbackflipper3, 112, 11, -1.0F, 0.0F, -2.25F, 2, 6, 5, 0.0F, false));

        this.rightbackflipper4 = new AdvancedModelRenderer(this);
        this.rightbackflipper4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.rightbackflipper3.addChild(rightbackflipper4);
        this.rightbackflipper4.cubeList.add(new ModelBox(rightbackflipper4, 61, 0, -0.5F, 0.0F, -2.0F, 1, 5, 4, 0.0F, false));
        this.rightbackflipper4.cubeList.add(new ModelBox(rightbackflipper4, 61, 119, -0.5F, 5.0F, -1.75F, 1, 4, 3, 0.0F, false));

        this.leftbackflipper = new AdvancedModelRenderer(this);
        this.leftbackflipper.setRotationPoint(5.75F, 9.1361F, 5.5756F);
        this.tail.addChild(leftbackflipper);
        this.setRotateAngle(leftbackflipper, 0.6634F, 0.2361F, -1.168F);
        this.leftbackflipper.cubeList.add(new ModelBox(leftbackflipper, 0, 105, -2.0F, 0.0F, -2.5F, 4, 6, 5, 0.0F, true));
        this.leftbackflipper.cubeList.add(new ModelBox(leftbackflipper, 49, 103, -2.0F, 6.0F, -3.0F, 4, 6, 6, 0.0F, true));

        this.leftbackflipper2 = new AdvancedModelRenderer(this);
        this.leftbackflipper2.setRotationPoint(0.0F, 11.25F, -2.0F);
        this.leftbackflipper.addChild(leftbackflipper2);
        this.setRotateAngle(leftbackflipper2, 0.0416F, 0.0041F, 0.1108F);
        this.leftbackflipper2.cubeList.add(new ModelBox(leftbackflipper2, 0, 0, -1.5F, -1.0F, -1.25F, 3, 9, 7, 0.0F, true));

        this.leftbackflipper3 = new AdvancedModelRenderer(this);
        this.leftbackflipper3.setRotationPoint(0.0F, 7.65F, 1.25F);
        this.leftbackflipper2.addChild(leftbackflipper3);
        this.setRotateAngle(leftbackflipper3, 0.1309F, 0.0F, 0.0F);
        this.leftbackflipper3.cubeList.add(new ModelBox(leftbackflipper3, 112, 11, -1.0F, 0.0F, -2.25F, 2, 6, 5, 0.0F, true));

        this.leftbackflipper4 = new AdvancedModelRenderer(this);
        this.leftbackflipper4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.leftbackflipper3.addChild(leftbackflipper4);
        this.leftbackflipper4.cubeList.add(new ModelBox(leftbackflipper4, 61, 0, -0.5F, 0.0F, -2.0F, 1, 5, 4, 0.0F, true));
        this.leftbackflipper4.cubeList.add(new ModelBox(leftbackflipper4, 61, 119, -0.5F, 5.0F, -1.75F, 1, 4, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.9606F, 10.6079F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 72, 82, -5.0F, -1.5F, 0.0F, 11, 7, 8, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 8.5F, 0.0F);
        this.tail2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 92, -4.5F, -3.3F, 0.5F, 9, 4, 8, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 101, 98, -3.5F, -1.25F, 0.0F, 8, 6, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 102, 43, -2.5F, -1.0F, 0.0F, 6, 5, 4, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.75F, 2.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 82, 109, -1.5F, -1.5F, 1.0F, 4, 4, 5, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.tail5.addChild(tail6);
        this.tail6.cubeList.add(new ModelBox(tail6, 19, 17, 0.0F, -0.5F, 6.9F, 1, 1, 1, 0.002F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 63, 109, -0.5F, -1.1F, 0.0F, 2, 2, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.6F, 3.95F);
        this.tail6.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.0472F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 70, 119, 0.0F, -0.0028F, 0.0077F, 1, 4, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.3F, 4.3F);
        this.tail6.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.4835F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, -4.0035F, -0.0022F, 1, 4, 2, 0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.3F, 4.3F);
        this.tail6.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4712F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 0, 0.0F, -1.9785F, 0.4728F, 1, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 66, 82, 0.0F, -1.0035F, -0.0272F, 1, 1, 4, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -3.6F, 4.0F);
        this.tail6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6763F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 116, 117, 0.0F, 0.0025F, -0.0372F, 1, 2, 5, -0.002F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.5F, -5.4387F, -31.0487F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.1745F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 57, 43, -8.0F, 0.0F, -10.0F, 17, 13, 10, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 16.5F, 0.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3796F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 47, 67, -7.5F, -2.675F, -10.825F, 15, 4, 10, 0.0F, false));

        this.rightfrontflipper = new AdvancedModelRenderer(this);
        this.rightfrontflipper.setRotationPoint(-7.25F, 10.75F, -6.25F);
        this.body.addChild(rightfrontflipper);
        this.setRotateAngle(rightfrontflipper, 0.0203F, -0.1872F, 1.3039F);
        this.rightfrontflipper.cubeList.add(new ModelBox(rightfrontflipper, 103, 77, -1.4442F, -1.1131F, -2.3446F, 4, 7, 5, 0.0F, false));

        this.rightfrontflipper2 = new AdvancedModelRenderer(this);
        this.rightfrontflipper2.setRotationPoint(0.5558F, 4.8869F, -1.8446F);
        this.rightfrontflipper.addChild(rightfrontflipper2);
        this.setRotateAngle(rightfrontflipper2, 0.0848F, 0.0016F, -0.1105F);
        this.rightfrontflipper2.cubeList.add(new ModelBox(rightfrontflipper2, 28, 100, -1.5F, 0.0F, -1.25F, 3, 8, 7, 0.0F, false));

        this.rightfrontflipper3 = new AdvancedModelRenderer(this);
        this.rightfrontflipper3.setRotationPoint(0.0F, 7.75F, 1.75F);
        this.rightfrontflipper2.addChild(rightfrontflipper3);
        this.setRotateAngle(rightfrontflipper3, 0.0873F, 0.0F, 0.0F);
        this.rightfrontflipper3.cubeList.add(new ModelBox(rightfrontflipper3, 14, 112, -1.0F, 0.0F, -2.25F, 2, 6, 5, 0.0F, false));

        this.rightfrontflipper4 = new AdvancedModelRenderer(this);
        this.rightfrontflipper4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.rightfrontflipper3.addChild(rightfrontflipper4);
        this.rightfrontflipper4.cubeList.add(new ModelBox(rightfrontflipper4, 0, 117, -0.5F, 0.0F, -1.75F, 1, 5, 4, 0.0F, false));
        this.rightfrontflipper4.cubeList.add(new ModelBox(rightfrontflipper4, 0, 68, -0.5F, 5.0F, -1.25F, 1, 5, 3, 0.0F, false));

        this.leftfrontflipper = new AdvancedModelRenderer(this);
        this.leftfrontflipper.setRotationPoint(8.25F, 10.75F, -6.25F);
        this.body.addChild(leftfrontflipper);
        this.setRotateAngle(leftfrontflipper, 0.0203F, 0.1872F, -1.3039F);
        this.leftfrontflipper.cubeList.add(new ModelBox(leftfrontflipper, 103, 77, -2.5558F, -1.1131F, -2.3446F, 4, 7, 5, 0.0F, true));

        this.leftfrontflipper2 = new AdvancedModelRenderer(this);
        this.leftfrontflipper2.setRotationPoint(-0.5558F, 4.8869F, -1.8446F);
        this.leftfrontflipper.addChild(leftfrontflipper2);
        this.setRotateAngle(leftfrontflipper2, 0.0848F, -0.0016F, 0.1105F);
        this.leftfrontflipper2.cubeList.add(new ModelBox(leftfrontflipper2, 28, 100, -1.5F, 0.0F, -1.25F, 3, 8, 7, 0.0F, true));

        this.leftfrontflipper3 = new AdvancedModelRenderer(this);
        this.leftfrontflipper3.setRotationPoint(0.0F, 7.75F, 1.75F);
        this.leftfrontflipper2.addChild(leftfrontflipper3);
        this.setRotateAngle(leftfrontflipper3, 0.0873F, 0.0F, 0.0F);
        this.leftfrontflipper3.cubeList.add(new ModelBox(leftfrontflipper3, 14, 112, -1.0F, 0.0F, -2.25F, 2, 6, 5, 0.0F, true));

        this.leftfrontflipper4 = new AdvancedModelRenderer(this);
        this.leftfrontflipper4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.leftfrontflipper3.addChild(leftfrontflipper4);
        this.leftfrontflipper4.cubeList.add(new ModelBox(leftfrontflipper4, 0, 117, -0.5F, 0.0F, -1.75F, 1, 5, 4, 0.0F, true));
        this.leftfrontflipper4.cubeList.add(new ModelBox(leftfrontflipper4, 0, 68, -0.5F, 5.0F, -1.25F, 1, 5, 3, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.2F, -10.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 33, 82, -6.0F, -1.0F, -5.0F, 13, 11, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 15.3F, 10.0F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3796F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 66, 98, -5.5F, -2.8F, -16.425F, 11, 4, 6, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -1.0F, -4.25F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 68, -4.5F, 0.125F, -9.0F, 10, 9, 9, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 11.4346F, -0.5782F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3185F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 85, 19, -4.5F, -5.0097F, -7.6546F, 9, 5, 8, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.0F, -8.0F);
        this.body3.addChild(head);
        this.setRotateAngle(head, -0.0436F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 88, 67, -4.0F, -0.6F, -5.1F, 9, 4, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 17, -3.0F, 1.4F, -9.0F, 7, 2, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 104, 116, -2.0F, 1.4F, -12.0F, 5, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 61, 19, -2.0F, 1.4F, -14.0F, 5, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 114, 35, -1.0F, 2.4F, -19.0F, 3, 1, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 112, 59, -0.5F, 2.4F, -25.0F, 2, 1, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.25F, 3.4F, -22.5F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0416F, -0.0131F, -0.3052F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 0, 0.0F, -0.6F, -2.4F, 0, 1, 4, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.5F, 3.4F, -16.5F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0785F, 0.058F, -0.2223F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 51, 0.0F, -0.2F, -3.5F, 0, 1, 3, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.5F, 3.4F, -16.5F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, -0.3927F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 17, 0.0F, -0.2F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.5F, 3.4F, -16.5F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.3927F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 21, 6, 0.0F, 0.0F, 1.5F, 0, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.5F, 3.4F, -12.9F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, -0.4363F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 0, -0.75F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.5F, 3.4F, -10.5F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.4363F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 46, 68, -0.75F, -0.75F, -1.4F, 0, 1, 3, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.25F, 3.4F, -22.5F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0416F, 0.0131F, 0.3052F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 0, 0.0F, -0.6F, -2.4F, 0, 1, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 1.4F, -14.0F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0654F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 117, 67, -1.0F, 0.0F, -5.0F, 2, 1, 5, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 46, 116, -0.5F, 0.0F, -11.0F, 1, 1, 6, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 3.4F, -16.5F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0785F, -0.058F, 0.2223F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 44, 51, 0.0F, -0.2F, -3.5F, 0, 1, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 3.4F, -16.5F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0873F, 0.0F, 0.3927F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 17, 0.0F, -0.2F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 3.4F, -16.5F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.3927F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 21, 6, 0.0F, 0.0F, 1.5F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.4F, -9.0F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3403F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 76, 19, -1.5F, 0.1F, -2.8F, 4, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.5F, 3.4F, -12.9F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1745F, 0.0F, 0.4363F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 14, 0, 0.75F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.5F, 3.4F, -10.5F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.4363F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 46, 68, 0.75F, -0.75F, -1.4F, 0, 1, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, -0.6F, -5.0F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2618F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 101, 109, -1.5F, 0.0F, -4.1F, 6, 2, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 4.4F, -1.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 85, 33, -3.5F, -1.0F, -4.1F, 9, 4, 5, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 100, 0, -2.0F, -4.1F, -5.0F, 6, 4, 6, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 44, 43, -2.5F, -1.0F, -8.0F, 7, 3, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 30, 68, -1.5F, -1.0F, -13.0F, 5, 2, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 42, 100, -0.25F, -1.5F, -14.0F, 0, 1, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 29, 116, -0.5F, -1.0F, -18.0F, 3, 1, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 51, 0.0F, -1.5F, -17.75F, 0, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 114, 27, 0.0F, -1.0F, -24.0F, 2, 1, 6, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 43, 0.25F, -1.5F, -23.9F, 0, 1, 6, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 42, 100, 2.25F, -1.5F, -14.0F, 0, 1, 5, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 51, 2.0F, -1.5F, -17.75F, 0, 1, 3, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 43, 1.75F, -1.5F, -23.9F, 0, 1, 6, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, 0.6F, -17.875F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0916F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 95, 116, -0.5F, -1.0264F, -6.0087F, 1, 1, 6, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 1.0F, -13.0F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0873F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 117, 74, -0.5F, -1.0F, -4.9F, 2, 1, 5, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 2.0F, -8.0F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2007F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 111, 90, -0.5F, -1.0F, -5.0F, 4, 1, 5, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.2007F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 112, 53, -1.5F, -1.225F, -4.0F, 5, 1, 4, 0.0F, false));
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
        this.main.offsetY = 0.08F;
        this.main.offsetX = -0.15F;
        this.main.rotateAngleY = (float)Math.toRadians(205);
        this.main.rotateAngleX = (float)Math.toRadians(18);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 0.285F;
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
            resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraLuskhan ee = (EntityPrehistoricFloraLuskhan) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            animBeached(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }


        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLuskhan entity = (EntityPrehistoricFloraLuskhan) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-40))*2), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*2), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+30))*5), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 5.4978+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+190))*-5 + (((tickAnim - 0) / 10) * (-3.9767+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+190))*-5-(5.4978+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+190))*-5)));
            yy = -0.06826 + (((tickAnim - 0) / 10) * (0-(-0.06826)));
            zz = 3.4993+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*3 + (((tickAnim - 0) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*3-(3.4993+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*3)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -3.9767+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+190))*-5 + (((tickAnim - 10) / 5) * (5.4978+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+190))*-5-(-3.9767+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+190))*-5)));
            yy = 0 + (((tickAnim - 10) / 5) * (-0.06826-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*3 + (((tickAnim - 10) / 5) * (3.4993+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.65);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-5 + (((tickAnim - 0) / 3) * (0.01-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.01 + (((tickAnim - 3) / 2) * (5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-5-(0.01)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-5 + (((tickAnim - 5) / 6) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-5-(5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-5)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-5 + (((tickAnim - 11) / 4) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-5-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLuskhan entity = (EntityPrehistoricFloraLuskhan) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(rightbackflipper, rightbackflipper.rotateAngleX + (float) Math.toRadians(-22.4796+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556+160))*-35), rightbackflipper.rotateAngleY + (float) Math.toRadians(-4.2115+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556+100))*-20), rightbackflipper.rotateAngleZ + (float) Math.toRadians(5.3393+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556-60))*-5));



        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+20))*10 + (((tickAnim - 0) / 17) * (18.356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+20))*10-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+20))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+120))*-25 + (((tickAnim - 0) / 17) * (-15.9319+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+120))*-34.2005-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+120))*-25)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556-100))*-5 + (((tickAnim - 0) / 17) * (11.8232+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556-100))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556-100))*-5)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 18.356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+20))*10 + (((tickAnim - 17) / 23) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+20))*10-(18.356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+20))*10)));
            yy = -15.9319+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+120))*-34.2005 + (((tickAnim - 17) / 23) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+120))*-25-(-15.9319+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+120))*-34.2005)));
            zz = 11.8232+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556-100))*-5 + (((tickAnim - 17) / 23) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556-100))*-5-(11.8232+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556-100))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbackflipper2, rightbackflipper2.rotateAngleX + (float) Math.toRadians(xx), rightbackflipper2.rotateAngleY + (float) Math.toRadians(yy), rightbackflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556))*5 + (((tickAnim - 0) / 17) * (-2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556))*5-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+200))*15 + (((tickAnim - 0) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+200))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+200))*15)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+300))*-15 + (((tickAnim - 0) / 17) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+300))*-15-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+300))*-15)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = -2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556))*5 + (((tickAnim - 17) / 23) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556))*5-(-2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+200))*15 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+200))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+200))*15)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+300))*-15 + (((tickAnim - 17) / 23) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+300))*-15-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+300))*-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbackflipper3, rightbackflipper3.rotateAngleX + (float) Math.toRadians(xx), rightbackflipper3.rotateAngleY + (float) Math.toRadians(yy), rightbackflipper3.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightbackflipper3.rotationPointX = this.rightbackflipper3.rotationPointX + (float)(0);
        this.rightbackflipper3.rotationPointY = this.rightbackflipper3.rotationPointY - (float)(1);
        this.rightbackflipper3.rotationPointZ = this.rightbackflipper3.rotationPointZ + (float)(0);


        this.setRotateAngle(rightbackflipper4, rightbackflipper4.rotateAngleX + (float) Math.toRadians(9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556-80))*15), rightbackflipper4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556+250))*-5), rightbackflipper4.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556+300))*-20));


        this.setRotateAngle(leftbackflipper, leftbackflipper.rotateAngleX + (float) Math.toRadians(-22.4796+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556+160))*-35), leftbackflipper.rotateAngleY + (float) Math.toRadians(-4.2115+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.56+100))*20), leftbackflipper.rotateAngleZ + (float) Math.toRadians(-5.3393+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.55-60))*5));



        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+20))*10 + (((tickAnim - 0) / 17) * (19.3028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+20))*10-(14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+20))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+120))*25 + (((tickAnim - 0) / 17) * (4.9066+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+120))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+120))*25)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556-100))*5 + (((tickAnim - 0) / 17) * (-8.8956+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556-100))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556-100))*5)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 19.3028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+20))*10 + (((tickAnim - 17) / 23) * (14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+20))*10-(19.3028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+20))*10)));
            yy = 4.9066+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+120))*25 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+120))*25-(4.9066+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+120))*25)));
            zz = -8.8956+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556-100))*5 + (((tickAnim - 17) / 23) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556-100))*5-(-8.8956+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556-100))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbackflipper2, leftbackflipper2.rotateAngleX + (float) Math.toRadians(xx), leftbackflipper2.rotateAngleY + (float) Math.toRadians(yy), leftbackflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556))*5 + (((tickAnim - 0) / 17) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556))*5-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+200))*-15 + (((tickAnim - 0) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+200))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+200))*-15)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+300))*5 + (((tickAnim - 0) / 17) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+300))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+300))*5)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556))*5 + (((tickAnim - 17) / 23) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556))*5-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+200))*-15 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+200))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+200))*-15)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+300))*5 + (((tickAnim - 17) / 23) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+300))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.556+300))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbackflipper3, leftbackflipper3.rotateAngleX + (float) Math.toRadians(xx), leftbackflipper3.rotateAngleY + (float) Math.toRadians(yy), leftbackflipper3.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftbackflipper3.rotationPointX = this.leftbackflipper3.rotationPointX + (float)(0);
        this.leftbackflipper3.rotationPointY = this.leftbackflipper3.rotationPointY - (float)(1);
        this.leftbackflipper3.rotationPointZ = this.leftbackflipper3.rotationPointZ + (float)(0);


        this.setRotateAngle(leftbackflipper4, leftbackflipper4.rotateAngleX + (float) Math.toRadians(9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556-80))*15), leftbackflipper4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556+250))*-5), leftbackflipper4.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556+300))*20));


        this.setRotateAngle(rightfrontflipper, rightfrontflipper.rotateAngleX + (float) Math.toRadians(-2.7678+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556+220))*-40), rightfrontflipper.rotateAngleY + (float) Math.toRadians(16.8282+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556-260))*-40), rightfrontflipper.rotateAngleZ + (float) Math.toRadians(-0.302+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555+30))*-40));


        this.setRotateAngle(rightfrontflipper2, rightfrontflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556+290))*10), rightfrontflipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555+220))*-5), rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555-10))*-15));


        this.setRotateAngle(rightfrontflipper3, rightfrontflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.55+250))*5), rightfrontflipper3.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555+320))*-5), rightfrontflipper3.rotateAngleZ + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555-50))*-15));


        this.setRotateAngle(rightfrontflipper4, rightfrontflipper4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.55+300))*-5), rightfrontflipper4.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555+390))*-5), rightfrontflipper4.rotateAngleZ + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555-90))*-15));


        this.setRotateAngle(leftfrontflipper, leftfrontflipper.rotateAngleX + (float) Math.toRadians(-2.7678+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556+220))*-40), leftfrontflipper.rotateAngleY + (float) Math.toRadians(-16.8282+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556-260))*40), leftfrontflipper.rotateAngleZ + (float) Math.toRadians(0.302+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555+30))*40));


        this.setRotateAngle(leftfrontflipper2, leftfrontflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556+290))*10), leftfrontflipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555+220))*-5), leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555-10))*15));


        this.setRotateAngle(leftfrontflipper3, leftfrontflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556+250))*5), leftfrontflipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555+320))*-5), leftfrontflipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555-50))*15));


        this.setRotateAngle(leftfrontflipper4, leftfrontflipper4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555+300))*-5), leftfrontflipper4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556+390))*-5), leftfrontflipper4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.557-90))*15));


        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103/0.573+10))*4), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.567-100))*0.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556))*-0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556))*2.5);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556+60))*8), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.552-60))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556+20))*5), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556-20))*5), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556-80))*5), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555-120))*5), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556-200))*-10), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555+120))*5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.556-150))*2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555+160))*5), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555-200))*2));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(1.025);


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555+220))*5), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555-280))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555+260))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.555-320))*2));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLuskhan entity = (EntityPrehistoricFloraLuskhan) entitylivingbaseIn;
        int animCycle = 70;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(rightbackflipper, rightbackflipper.rotateAngleX + (float) Math.toRadians(-22.4796+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972+160))*-35), rightbackflipper.rotateAngleY + (float) Math.toRadians(-4.2115+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973+120))*-20), rightbackflipper.rotateAngleZ + (float) Math.toRadians(5.3393+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972-40))*-5));



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+20))*10 + (((tickAnim - 0) / 30) * (12.9158+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+20))*10-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+20))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+120))*-20 + (((tickAnim - 0) / 30) * (-3.045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+120))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+120))*-20)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-100))*-10 + (((tickAnim - 0) / 30) * (-1.7866+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-100))*-10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-100))*-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 12.9158+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+20))*10 + (((tickAnim - 30) / 40) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+20))*10-(12.9158+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+20))*10)));
            yy = -3.045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+120))*-20 + (((tickAnim - 30) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+120))*-20-(-3.045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+120))*-20)));
            zz = -1.7866+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-100))*-10 + (((tickAnim - 30) / 40) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-100))*-10-(-1.7866+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-100))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbackflipper2, rightbackflipper2.rotateAngleX + (float) Math.toRadians(xx), rightbackflipper2.rotateAngleY + (float) Math.toRadians(yy), rightbackflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-70))*20 + (((tickAnim - 0) / 18) * (-10.5249+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-70))*20-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-70))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+200))*5 + (((tickAnim - 0) / 18) * (1.7275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+200))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+200))*5)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+300))*-15 + (((tickAnim - 0) / 18) * (1.5957+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-300))*35-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+300))*-15)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -10.5249+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-70))*20 + (((tickAnim - 18) / 12) * (-24.296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-70))*20-(-10.5249+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-70))*20)));
            yy = 1.7275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+200))*-5 + (((tickAnim - 18) / 12) * (2.4594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+200))*-5-(1.7275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+200))*-5)));
            zz = 1.5957+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-300))*35 + (((tickAnim - 18) / 12) * (10.2028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+300))*-15-(1.5957+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-300))*35)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = -24.296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-70))*20 + (((tickAnim - 30) / 40) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-70))*20-(-24.296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-70))*20)));
            yy = 2.4594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+200))*-5 + (((tickAnim - 30) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+200))*5-(2.4594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+200))*-5)));
            zz = 10.2028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+300))*-15 + (((tickAnim - 30) / 40) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+300))*-15-(10.2028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+300))*-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbackflipper3, rightbackflipper3.rotateAngleX + (float) Math.toRadians(xx), rightbackflipper3.rotateAngleY + (float) Math.toRadians(yy), rightbackflipper3.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightbackflipper3.rotationPointX = this.rightbackflipper3.rotationPointX + (float)(0);
        this.rightbackflipper3.rotationPointY = this.rightbackflipper3.rotationPointY - (float)(1);
        this.rightbackflipper3.rotationPointZ = this.rightbackflipper3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-80))*15 + (((tickAnim - 0) / 30) * (5.0881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-80))*15-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-80))*15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+250))*-5 + (((tickAnim - 0) / 30) * (2.1368+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+250))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+250))*-5)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+300))*-20 + (((tickAnim - 0) / 30) * (22.6098+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+300))*-20-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+300))*-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 5.0881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-80))*15 + (((tickAnim - 30) / 40) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-80))*15-(5.0881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-80))*15)));
            yy = 2.1368+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+250))*-5 + (((tickAnim - 30) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+250))*-5-(2.1368+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+250))*-5)));
            zz = 22.6098+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+300))*-20 + (((tickAnim - 30) / 40) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+300))*-20-(22.6098+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+300))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbackflipper4, rightbackflipper4.rotateAngleX + (float) Math.toRadians(xx), rightbackflipper4.rotateAngleY + (float) Math.toRadians(yy), rightbackflipper4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftbackflipper, leftbackflipper.rotateAngleX + (float) Math.toRadians(-22.4796+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972+160))*-35), leftbackflipper.rotateAngleY + (float) Math.toRadians(-4.2115+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973+100))*20), leftbackflipper.rotateAngleZ + (float) Math.toRadians(-5.3393+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972-60))*5));



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+20))*10 + (((tickAnim - 0) / 30) * (11.4592+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+20))*-10-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+20))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+120))*20 + (((tickAnim - 0) / 30) * (0.1577+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+120))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+120))*20)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-100))*10 + (((tickAnim - 0) / 30) * (-1.6383+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-100))*-10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-100))*10)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 11.4592+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+20))*-10 + (((tickAnim - 30) / 40) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+20))*10-(11.4592+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+20))*-10)));
            yy = 0.1577+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+120))*20 + (((tickAnim - 30) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+120))*20-(0.1577+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+120))*20)));
            zz = -1.6383+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-100))*-10 + (((tickAnim - 30) / 40) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-100))*10-(-1.6383+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-100))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbackflipper2, leftbackflipper2.rotateAngleX + (float) Math.toRadians(xx), leftbackflipper2.rotateAngleY + (float) Math.toRadians(yy), leftbackflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-70))*20 + (((tickAnim - 0) / 18) * (-4.3669+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-70))*20-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-70))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+200))*-5 + (((tickAnim - 0) / 18) * (0.4027+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+200))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+200))*-5)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+300))*15 + (((tickAnim - 0) / 18) * (13.8136+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+300))*-15-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+300))*15)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = -4.3669+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-70))*20 + (((tickAnim - 18) / 13) * (-5.1934+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-70))*20-(-4.3669+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-70))*20)));
            yy = 0.4027+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+200))*-5 + (((tickAnim - 18) / 13) * (3.2752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+200))*-5-(0.4027+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+200))*-5)));
            zz = 13.8136+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+300))*-15 + (((tickAnim - 18) / 13) * (-6.4405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+300))*10-(13.8136+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+300))*-15)));
        }
        else if (tickAnim >= 31 && tickAnim < 60) {
            xx = -5.1934+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-70))*20 + (((tickAnim - 31) / 29) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-70))*20-(-5.1934+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-70))*20)));
            yy = 3.2752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+200))*-5 + (((tickAnim - 31) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+200))*-5-(3.2752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+200))*-5)));
            zz = -6.4405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+300))*10 + (((tickAnim - 31) / 29) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+300))*15-(-6.4405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+300))*10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-70))*20 + (((tickAnim - 60) / 10) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972-70))*20-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-70))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+200))*-5 + (((tickAnim - 60) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+200))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+200))*-5)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+300))*15 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+300))*15-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+300))*15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbackflipper3, leftbackflipper3.rotateAngleX + (float) Math.toRadians(xx), leftbackflipper3.rotateAngleY + (float) Math.toRadians(yy), leftbackflipper3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 60) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 60) / 10) * (1-(1)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftbackflipper3.rotationPointX = this.leftbackflipper3.rotationPointX + (float)(xx);
        this.leftbackflipper3.rotationPointY = this.leftbackflipper3.rotationPointY - (float)(yy);
        this.leftbackflipper3.rotationPointZ = this.leftbackflipper3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973-80))*15 + (((tickAnim - 0) / 30) * (-1.1895+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973-80))*15-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973-80))*15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+250))*5 + (((tickAnim - 0) / 30) * (2.9965+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+250))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+250))*5)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+300))*20 + (((tickAnim - 0) / 30) * (-26.8776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+300))*30-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+300))*20)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = -1.1895+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973-80))*15 + (((tickAnim - 30) / 40) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973-80))*15-(-1.1895+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973-80))*15)));
            yy = 2.9965+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+250))*5 + (((tickAnim - 30) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+250))*5-(2.9965+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+250))*5)));
            zz = -26.8776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+300))*30 + (((tickAnim - 30) / 40) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+300))*20-(-26.8776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.972+300))*30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbackflipper4, leftbackflipper4.rotateAngleX + (float) Math.toRadians(xx), leftbackflipper4.rotateAngleY + (float) Math.toRadians(yy), leftbackflipper4.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(rightfrontflipper, rightfrontflipper.rotateAngleX + (float) Math.toRadians(-2.7678+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973+220))*-40), rightfrontflipper.rotateAngleY + (float) Math.toRadians(16.8282+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973-260))*-40), rightfrontflipper.rotateAngleZ + (float) Math.toRadians(-0.302+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973+30))*-40));
        this.setRotateAngle(rightfrontflipper2, rightfrontflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973+290))*10), rightfrontflipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973+220))*-5), rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972-10))*-15));
        this.setRotateAngle(rightfrontflipper3, rightfrontflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973+250))*5), rightfrontflipper3.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973+320))*-5), rightfrontflipper3.rotateAngleZ + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972-50))*-15));
        this.setRotateAngle(rightfrontflipper4, rightfrontflipper4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973+300))*-5), rightfrontflipper4.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973+390))*-5), rightfrontflipper4.rotateAngleZ + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972-90))*-15));
        this.setRotateAngle(leftfrontflipper, leftfrontflipper.rotateAngleX + (float) Math.toRadians(-2.7678+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972+220))*-40), leftfrontflipper.rotateAngleY + (float) Math.toRadians(-16.8282+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973-260))*40), leftfrontflipper.rotateAngleZ + (float) Math.toRadians(0.302+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972+30))*40));
        this.setRotateAngle(leftfrontflipper2, leftfrontflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973+290))*10), leftfrontflipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973+220))*-5), leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972-10))*15));
        this.setRotateAngle(leftfrontflipper3, leftfrontflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973+250))*5), leftfrontflipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973+320))*-5), leftfrontflipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972-50))*15));
        this.setRotateAngle(leftfrontflipper4, leftfrontflipper4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973+300))*-5), leftfrontflipper4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973+390))*-5), leftfrontflipper4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972-90))*15));
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103+10))*4), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972-100))*0.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973))*-0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.973))*2);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972+60))*8), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972-60))*2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972+20))*5), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972-20))*5), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972-80))*5), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972-120))*5), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972-200))*-10), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972+120))*5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972-150))*2));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972+160))*5), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972-200))*2));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(1.025);
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972+220))*5), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972-280))*2));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972+260))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.972-320))*2));

    }
    public void animBeached(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLuskhan entity = (EntityPrehistoricFloraLuskhan) entitylivingbaseIn;
        int animCycle = 140;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = -1.95 + (((tickAnim - 0) / 140) * (-1.95-(-1.95)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);

        this.main.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.008),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.008),(float)1);



        if (tickAnim >= 0 && tickAnim < 140) {
            xx = -7.25 + (((tickAnim - 0) / 140) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));

        this.tail.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.008),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.008),(float)1);



        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*-0.5 + (((tickAnim - 0) / 140) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*-0.5)));
            zz = 13.5 + (((tickAnim - 0) / 140) * (13.5-(13.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbackflipper, rightbackflipper.rotateAngleX + (float) Math.toRadians(xx), rightbackflipper.rotateAngleY + (float) Math.toRadians(yy), rightbackflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 10 + (((tickAnim - 0) / 140) * (10-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbackflipper2, rightbackflipper2.rotateAngleX + (float) Math.toRadians(xx), rightbackflipper2.rotateAngleY + (float) Math.toRadians(yy), rightbackflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 9.5 + (((tickAnim - 0) / 140) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 5.5 + (((tickAnim - 0) / 140) * (5.5-(5.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbackflipper3, rightbackflipper3.rotateAngleX + (float) Math.toRadians(xx), rightbackflipper3.rotateAngleY + (float) Math.toRadians(yy), rightbackflipper3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = 0.325 + (((tickAnim - 0) / 140) * (0.325-(0.325)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightbackflipper3.rotationPointX = this.rightbackflipper3.rotationPointX + (float)(xx);
        this.rightbackflipper3.rotationPointY = this.rightbackflipper3.rotationPointY - (float)(yy);
        this.rightbackflipper3.rotationPointZ = this.rightbackflipper3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 15 + (((tickAnim - 0) / 140) * (15-(15)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbackflipper4, rightbackflipper4.rotateAngleX + (float) Math.toRadians(xx), rightbackflipper4.rotateAngleY + (float) Math.toRadians(yy), rightbackflipper4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 41) {
            xx = -21.75 + (((tickAnim - 0) / 41) * (-21.75-(-21.75)));
            yy = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            zz = -14.25 + (((tickAnim - 0) / 41) * (-14.25-(-14.25)));
        }
        else if (tickAnim >= 41 && tickAnim < 49) {
            xx = -21.75 + (((tickAnim - 41) / 8) * (-31.21345-(-21.75)));
            yy = 0 + (((tickAnim - 41) / 8) * (0.78582-(0)));
            zz = -14.25 + (((tickAnim - 41) / 8) * (-22.36866-(-14.25)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = -31.21345 + (((tickAnim - 49) / 10) * (-42.65366-(-31.21345)));
            yy = 0.78582 + (((tickAnim - 49) / 10) * (0.27533-(0.78582)));
            zz = -22.36866 + (((tickAnim - 49) / 10) * (-27.3759-(-22.36866)));
        }
        else if (tickAnim >= 59 && tickAnim < 65) {
            xx = -42.65366 + (((tickAnim - 59) / 6) * (-44.9332-(-42.65366)));
            yy = 0.27533 + (((tickAnim - 59) / 6) * (1.34063-(0.27533)));
            zz = -27.3759 + (((tickAnim - 59) / 6) * (-12.47185-(-27.3759)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = -44.9332 + (((tickAnim - 65) / 5) * (-49.27554-(-44.9332)));
            yy = 1.34063 + (((tickAnim - 65) / 5) * (1.02995-(1.34063)));
            zz = -12.47185 + (((tickAnim - 65) / 5) * (-9.20637-(-12.47185)));
        }
        else if (tickAnim >= 70 && tickAnim < 94) {
            xx = -49.27554 + (((tickAnim - 70) / 24) * (-49.27554-(-49.27554)));
            yy = 1.02995 + (((tickAnim - 70) / 24) * (1.02995-(1.02995)));
            zz = -9.20637 + (((tickAnim - 70) / 24) * (-9.20637-(-9.20637)));
        }
        else if (tickAnim >= 94 && tickAnim < 108) {
            xx = -49.27554 + (((tickAnim - 94) / 14) * (-40.58409-(-49.27554)));
            yy = 1.02995 + (((tickAnim - 94) / 14) * (0.56831-(1.02995)));
            zz = -9.20637 + (((tickAnim - 94) / 14) * (-34.23964-(-9.20637)));
        }
        else if (tickAnim >= 108 && tickAnim < 116) {
            xx = -40.58409 + (((tickAnim - 108) / 8) * (-26.48482-(-40.58409)));
            yy = 0.56831 + (((tickAnim - 108) / 8) * (-1.07134-(0.56831)));
            zz = -34.23964 + (((tickAnim - 108) / 8) * (-14.10487-(-34.23964)));
        }
        else if (tickAnim >= 116 && tickAnim < 120) {
            xx = -26.48482 + (((tickAnim - 116) / 4) * (-21.75-(-26.48482)));
            yy = -1.07134 + (((tickAnim - 116) / 4) * (0-(-1.07134)));
            zz = -14.10487 + (((tickAnim - 116) / 4) * (-14.25-(-14.10487)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = -21.75 + (((tickAnim - 120) / 20) * (-21.75-(-21.75)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = -14.25 + (((tickAnim - 120) / 20) * (-14.25-(-14.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbackflipper, leftbackflipper.rotateAngleX + (float) Math.toRadians(xx), leftbackflipper.rotateAngleY + (float) Math.toRadians(yy), leftbackflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0.24056 + (((tickAnim - 0) / 41) * (0.24056-(0.24056)));
            yy = 7.92719 + (((tickAnim - 0) / 41) * (7.92719-(7.92719)));
            zz = -5.901 + (((tickAnim - 0) / 41) * (-5.901-(-5.901)));
        }
        else if (tickAnim >= 41 && tickAnim < 49) {
            xx = 0.24056 + (((tickAnim - 41) / 8) * (-1.13092-(0.24056)));
            yy = 7.92719 + (((tickAnim - 41) / 8) * (7.85971-(7.92719)));
            zz = -5.901 + (((tickAnim - 41) / 8) * (-1.86098-(-5.901)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = -1.13092 + (((tickAnim - 49) / 10) * (-3.64968-(-1.13092)));
            yy = 7.85971 + (((tickAnim - 49) / 10) * (7.79444-(7.85971)));
            zz = -1.86098 + (((tickAnim - 49) / 10) * (-11.87988-(-1.86098)));
        }
        else if (tickAnim >= 59 && tickAnim < 65) {
            xx = -3.64968 + (((tickAnim - 59) / 6) * (-5.16772-(-3.64968)));
            yy = 7.79444 + (((tickAnim - 59) / 6) * (7.51322-(7.79444)));
            zz = -11.87988 + (((tickAnim - 59) / 6) * (-18.24567-(-11.87988)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = -5.16772 + (((tickAnim - 65) / 3) * (-3.41715-(-5.16772)));
            yy = 7.51322 + (((tickAnim - 65) / 3) * (7.95385-(7.51322)));
            zz = -18.24567 + (((tickAnim - 65) / 3) * (-3.744-(-18.24567)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = -3.41715 + (((tickAnim - 68) / 2) * (-4.00944-(-3.41715)));
            yy = 7.95385 + (((tickAnim - 68) / 2) * (7.92719-(7.95385)));
            zz = -3.744 + (((tickAnim - 68) / 2) * (-5.901-(-3.744)));
        }
        else if (tickAnim >= 70 && tickAnim < 94) {
            xx = -4.00944 + (((tickAnim - 70) / 24) * (-4.00944-(-4.00944)));
            yy = 7.92719 + (((tickAnim - 70) / 24) * (7.92719-(7.92719)));
            zz = -5.901 + (((tickAnim - 70) / 24) * (-5.901-(-5.901)));
        }
        else if (tickAnim >= 94 && tickAnim < 108) {
            xx = -4.00944 + (((tickAnim - 94) / 14) * (-0.96036-(-4.00944)));
            yy = 7.92719 + (((tickAnim - 94) / 14) * (7.82293-(7.92719)));
            zz = -5.901 + (((tickAnim - 94) / 14) * (0.15873-(-5.901)));
        }
        else if (tickAnim >= 108 && tickAnim < 116) {
            xx = -0.96036 + (((tickAnim - 108) / 8) * (-0.66311-(-0.96036)));
            yy = 7.82293 + (((tickAnim - 108) / 8) * (8.01288-(7.82293)));
            zz = 0.15873 + (((tickAnim - 108) / 8) * (-7.41504-(0.15873)));
        }
        else if (tickAnim >= 116 && tickAnim < 120) {
            xx = -0.66311 + (((tickAnim - 116) / 4) * (0.24056-(-0.66311)));
            yy = 8.01288 + (((tickAnim - 116) / 4) * (7.92719-(8.01288)));
            zz = -7.41504 + (((tickAnim - 116) / 4) * (-5.901-(-7.41504)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0.24056 + (((tickAnim - 120) / 20) * (0.24056-(0.24056)));
            yy = 7.92719 + (((tickAnim - 120) / 20) * (7.92719-(7.92719)));
            zz = -5.901 + (((tickAnim - 120) / 20) * (-5.901-(-5.901)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbackflipper2, leftbackflipper2.rotateAngleX + (float) Math.toRadians(xx), leftbackflipper2.rotateAngleY + (float) Math.toRadians(yy), leftbackflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 7 + (((tickAnim - 0) / 41) * (7-(7)));
            yy = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            zz = -4.25 + (((tickAnim - 0) / 41) * (-4.25-(-4.25)));
        }
        else if (tickAnim >= 41 && tickAnim < 49) {
            xx = 7 + (((tickAnim - 41) / 8) * (5.34176-(7)));
            yy = 0 + (((tickAnim - 41) / 8) * (-2.13004-(0)));
            zz = -4.25 + (((tickAnim - 41) / 8) * (5.01026-(-4.25)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = 5.34176 + (((tickAnim - 49) / 10) * (4.22448-(5.34176)));
            yy = -2.13004 + (((tickAnim - 49) / 10) * (-3.12296-(-2.13004)));
            zz = 5.01026 + (((tickAnim - 49) / 10) * (10.11179-(5.01026)));
        }
        else if (tickAnim >= 59 && tickAnim < 65) {
            xx = 4.22448 + (((tickAnim - 59) / 6) * (3.87707-(4.22448)));
            yy = -3.12296 + (((tickAnim - 59) / 6) * (2.05065-(-3.12296)));
            zz = 10.11179 + (((tickAnim - 59) / 6) * (-14.77244-(10.11179)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 3.87707 + (((tickAnim - 65) / 3) * (3.52025-(3.87707)));
            yy = 2.05065 + (((tickAnim - 65) / 3) * (2.77179-(2.05065)));
            zz = -14.77244 + (((tickAnim - 65) / 3) * (-18.34534-(-14.77244)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 3.52025 + (((tickAnim - 68) / 2) * (3.75-(3.52025)));
            yy = 2.77179 + (((tickAnim - 68) / 2) * (0-(2.77179)));
            zz = -18.34534 + (((tickAnim - 68) / 2) * (-4.25-(-18.34534)));
        }
        else if (tickAnim >= 70 && tickAnim < 94) {
            xx = 3.75 + (((tickAnim - 70) / 24) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 70) / 24) * (0-(0)));
            zz = -4.25 + (((tickAnim - 70) / 24) * (-4.25-(-4.25)));
        }
        else if (tickAnim >= 94 && tickAnim < 108) {
            xx = 3.75 + (((tickAnim - 94) / 14) * (-1.75505-(3.75)));
            yy = 0 + (((tickAnim - 94) / 14) * (-4.17684-(0)));
            zz = -4.25 + (((tickAnim - 94) / 14) * (14.30177-(-4.25)));
        }
        else if (tickAnim >= 108 && tickAnim < 116) {
            xx = -1.75505 + (((tickAnim - 108) / 8) * (4.01319-(-1.75505)));
            yy = -4.17684 + (((tickAnim - 108) / 8) * (1.88172-(-4.17684)));
            zz = 14.30177 + (((tickAnim - 108) / 8) * (-13.98516-(14.30177)));
        }
        else if (tickAnim >= 116 && tickAnim < 120) {
            xx = 4.01319 + (((tickAnim - 116) / 4) * (7-(4.01319)));
            yy = 1.88172 + (((tickAnim - 116) / 4) * (0-(1.88172)));
            zz = -13.98516 + (((tickAnim - 116) / 4) * (-4.25-(-13.98516)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 7 + (((tickAnim - 120) / 20) * (7-(7)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = -4.25 + (((tickAnim - 120) / 20) * (-4.25-(-4.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbackflipper3, leftbackflipper3.rotateAngleX + (float) Math.toRadians(xx), leftbackflipper3.rotateAngleY + (float) Math.toRadians(yy), leftbackflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 13.44324 + (((tickAnim - 0) / 41) * (13.44324-(13.44324)));
            yy = -5.63944 + (((tickAnim - 0) / 41) * (-5.63944-(-5.63944)));
            zz = -2.31663 + (((tickAnim - 0) / 41) * (-2.31663-(-2.31663)));
        }
        else if (tickAnim >= 41 && tickAnim < 49) {
            xx = 13.44324 + (((tickAnim - 41) / 8) * (12.49696-(13.44324)));
            yy = -5.63944 + (((tickAnim - 41) / 8) * (-4.0841-(-5.63944)));
            zz = -2.31663 + (((tickAnim - 41) / 8) * (8.92732-(-2.31663)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = 12.49696 + (((tickAnim - 49) / 10) * (12.34317-(12.49696)));
            yy = -4.0841 + (((tickAnim - 49) / 10) * (-2.25006-(-4.0841)));
            zz = 8.92732 + (((tickAnim - 49) / 10) * (11.37295-(8.92732)));
        }
        else if (tickAnim >= 59 && tickAnim < 65) {
            xx = 12.34317 + (((tickAnim - 59) / 6) * (11.32521-(12.34317)));
            yy = -2.25006 + (((tickAnim - 59) / 6) * (5.28353-(-2.25006)));
            zz = 11.37295 + (((tickAnim - 59) / 6) * (-17.24425-(11.37295)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 11.32521 + (((tickAnim - 65) / 3) * (10.27479-(11.32521)));
            yy = 5.28353 + (((tickAnim - 65) / 3) * (7.4525-(5.28353)));
            zz = -17.24425 + (((tickAnim - 65) / 3) * (-25.77058-(-17.24425)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 10.27479 + (((tickAnim - 68) / 2) * (12.56644-(10.27479)));
            yy = 7.4525 + (((tickAnim - 68) / 2) * (3.21908-(7.4525)));
            zz = -25.77058 + (((tickAnim - 68) / 2) * (-1.74883-(-25.77058)));
        }
        else if (tickAnim >= 70 && tickAnim < 94) {
            xx = 12.56644 + (((tickAnim - 70) / 24) * (12.56644-(12.56644)));
            yy = 3.21908 + (((tickAnim - 70) / 24) * (3.21908-(3.21908)));
            zz = -1.74883 + (((tickAnim - 70) / 24) * (-1.74883-(-1.74883)));
        }
        else if (tickAnim >= 94 && tickAnim < 108) {
            xx = 12.56644 + (((tickAnim - 94) / 14) * (12.24687-(12.56644)));
            yy = 3.21908 + (((tickAnim - 94) / 14) * (-4.65165-(3.21908)));
            zz = -1.74883 + (((tickAnim - 94) / 14) * (12.61319-(-1.74883)));
        }
        else if (tickAnim >= 108 && tickAnim < 116) {
            xx = 12.24687 + (((tickAnim - 108) / 8) * (14.01749-(12.24687)));
            yy = -4.65165 + (((tickAnim - 108) / 8) * (-1.18519-(-4.65165)));
            zz = 12.61319 + (((tickAnim - 108) / 8) * (-14.3782-(12.61319)));
        }
        else if (tickAnim >= 116 && tickAnim < 120) {
            xx = 14.01749 + (((tickAnim - 116) / 4) * (13.44324-(14.01749)));
            yy = -1.18519 + (((tickAnim - 116) / 4) * (-5.63944-(-1.18519)));
            zz = -14.3782 + (((tickAnim - 116) / 4) * (-2.31663-(-14.3782)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 13.44324 + (((tickAnim - 120) / 20) * (13.44324-(13.44324)));
            yy = -5.63944 + (((tickAnim - 120) / 20) * (-5.63944-(-5.63944)));
            zz = -2.31663 + (((tickAnim - 120) / 20) * (-2.31663-(-2.31663)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbackflipper4, leftbackflipper4.rotateAngleX + (float) Math.toRadians(xx), leftbackflipper4.rotateAngleY + (float) Math.toRadians(yy), leftbackflipper4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = -13.96723 + (((tickAnim - 0) / 140) * (-13.96723-(-13.96723)));
            yy = 0.96695 + (((tickAnim - 0) / 140) * (0.96695-(0.96695)));
            zz = 3.88155 + (((tickAnim - 0) / 140) * (3.88155-(3.88155)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 5.28507 + (((tickAnim - 0) / 140) * (5.28507-(5.28507)));
            yy = -8.07318 + (((tickAnim - 0) / 140) * (-8.07318-(-8.07318)));
            zz = 2.98698 + (((tickAnim - 0) / 140) * (2.98698-(2.98698)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 10.05988 + (((tickAnim - 0) / 140) * (10.05988-(10.05988)));
            yy = -9.68816 + (((tickAnim - 0) / 140) * (-9.68816-(-9.68816)));
            zz = -1.20979 + (((tickAnim - 0) / 140) * (-1.20979-(-1.20979)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 5.99519 + (((tickAnim - 0) / 140) * (5.99519-(5.99519)));
            yy = -7.42787 + (((tickAnim - 0) / 140) * (-7.42787-(-7.42787)));
            zz = 5.71196 + (((tickAnim - 0) / 140) * (5.71196-(5.71196)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = 3.5 + (((tickAnim - 0) / 140) * (3.5-(3.5)));
            zz = 28.25 + (((tickAnim - 0) / 140) * (28.25-(28.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 6.25 + (((tickAnim - 0) / 140) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));

        this.body.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.008),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.008),(float)1);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 11.32395 + (((tickAnim - 0) / 15) * (0.70715-(11.32395)));
            yy = 16.61054 + (((tickAnim - 0) / 15) * (16.32359-(16.61054)));
            zz = 5.52809 + (((tickAnim - 0) / 15) * (28.39255-(5.52809)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 0.70715 + (((tickAnim - 15) / 9) * (-13.84308-(0.70715)));
            yy = 16.32359 + (((tickAnim - 15) / 9) * (15.13671-(16.32359)));
            zz = 28.39255 + (((tickAnim - 15) / 9) * (5.31019-(28.39255)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -13.84308 + (((tickAnim - 24) / 6) * (-18.42605-(-13.84308)));
            yy = 15.13671 + (((tickAnim - 24) / 6) * (16.61054-(15.13671)));
            zz = 5.31019 + (((tickAnim - 24) / 6) * (5.52809-(5.31019)));
        }
        else if (tickAnim >= 30 && tickAnim < 119) {
            xx = -18.42605 + (((tickAnim - 30) / 89) * (-18.42605-(-18.42605)));
            yy = 16.61054 + (((tickAnim - 30) / 89) * (16.61054-(16.61054)));
            zz = 5.52809 + (((tickAnim - 30) / 89) * (5.52809-(5.52809)));
        }
        else if (tickAnim >= 119 && tickAnim < 125) {
            xx = -18.42605 + (((tickAnim - 119) / 6) * (-7.97059-(-18.42605)));
            yy = 16.61054 + (((tickAnim - 119) / 6) * (17.22678-(16.61054)));
            zz = 5.52809 + (((tickAnim - 119) / 6) * (10.51914-(5.52809)));
        }
        else if (tickAnim >= 125 && tickAnim < 132) {
            xx = -7.97059 + (((tickAnim - 125) / 7) * (1.45421-(-7.97059)));
            yy = 17.22678 + (((tickAnim - 125) / 7) * (16.61305-(17.22678)));
            zz = 10.51914 + (((tickAnim - 125) / 7) * (17.63122-(10.51914)));
        }
        else if (tickAnim >= 132 && tickAnim < 140) {
            xx = 1.45421 + (((tickAnim - 132) / 8) * (11.32395-(1.45421)));
            yy = 16.61305 + (((tickAnim - 132) / 8) * (16.61054-(16.61305)));
            zz = 17.63122 + (((tickAnim - 132) / 8) * (5.52809-(17.63122)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfrontflipper, rightfrontflipper.rotateAngleX + (float) Math.toRadians(xx), rightfrontflipper.rotateAngleY + (float) Math.toRadians(yy), rightfrontflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.26106 + (((tickAnim - 0) / 3) * (-0.04786-(0.26106)));
            yy = 5.78242 + (((tickAnim - 0) / 3) * (6.0198-(5.78242)));
            zz = 2.50416 + (((tickAnim - 0) / 3) * (-0.36463-(2.50416)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = -0.04786 + (((tickAnim - 3) / 12) * (0.8627-(-0.04786)));
            yy = 6.0198 + (((tickAnim - 3) / 12) * (5.17686-(6.0198)));
            zz = -0.36463 + (((tickAnim - 3) / 12) * (8.79726-(-0.36463)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 0.8627 + (((tickAnim - 15) / 9) * (1.3497-(0.8627)));
            yy = 5.17686 + (((tickAnim - 15) / 9) * (4.60941-(5.17686)));
            zz = 8.79726 + (((tickAnim - 15) / 9) * (14.30589-(8.79726)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 1.3497 + (((tickAnim - 24) / 6) * (0.93789-(1.3497)));
            yy = 4.60941 + (((tickAnim - 24) / 6) * (5.11542-(4.60941)));
            zz = 14.30589 + (((tickAnim - 24) / 6) * (9.5051-(14.30589)));
        }
        else if (tickAnim >= 30 && tickAnim < 119) {
            xx = 0.93789 + (((tickAnim - 30) / 89) * (0.93789-(0.93789)));
            yy = 5.11542 + (((tickAnim - 30) / 89) * (5.11542-(5.11542)));
            zz = 9.5051 + (((tickAnim - 30) / 89) * (9.5051-(9.5051)));
        }
        else if (tickAnim >= 119 && tickAnim < 125) {
            xx = 0.93789 + (((tickAnim - 119) / 6) * (-0.0169-(0.93789)));
            yy = 5.11542 + (((tickAnim - 119) / 6) * (5.99688-(5.11542)));
            zz = 9.5051 + (((tickAnim - 119) / 6) * (-0.08524-(9.5051)));
        }
        else if (tickAnim >= 125 && tickAnim < 132) {
            xx = -0.0169 + (((tickAnim - 125) / 7) * (0.53507-(-0.0169)));
            yy = 5.99688 + (((tickAnim - 125) / 7) * (5.51907-(5.99688)));
            zz = -0.08524 + (((tickAnim - 125) / 7) * (5.30206-(-0.08524)));
        }
        else if (tickAnim >= 132 && tickAnim < 136) {
            xx = 0.53507 + (((tickAnim - 132) / 4) * (0.74623-(0.53507)));
            yy = 5.51907 + (((tickAnim - 132) / 4) * (5.30882-(5.51907)));
            zz = 5.30206 + (((tickAnim - 132) / 4) * (7.49833-(5.30206)));
        }
        else if (tickAnim >= 136 && tickAnim < 140) {
            xx = 0.74623 + (((tickAnim - 136) / 4) * (0.26106-(0.74623)));
            yy = 5.30882 + (((tickAnim - 136) / 4) * (5.78242-(5.30882)));
            zz = 7.49833 + (((tickAnim - 136) / 4) * (2.50416-(7.49833)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfrontflipper2, rightfrontflipper2.rotateAngleX + (float) Math.toRadians(xx), rightfrontflipper2.rotateAngleY + (float) Math.toRadians(yy), rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7.83356 + (((tickAnim - 0) / 3) * (5.28041-(7.83356)));
            yy = 4.51287 + (((tickAnim - 0) / 3) * (6.9263-(4.51287)));
            zz = 4.46372 + (((tickAnim - 0) / 3) * (-7.7742-(4.46372)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 5.28041 + (((tickAnim - 3) / 5) * (2.79865-(5.28041)));
            yy = 6.9263 + (((tickAnim - 3) / 5) * (8.5363-(6.9263)));
            zz = -7.7742 + (((tickAnim - 3) / 5) * (-17.37022-(-7.7742)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 2.79865 + (((tickAnim - 8) / 7) * (1.84895-(2.79865)));
            yy = 8.5363 + (((tickAnim - 8) / 7) * (8.23642-(8.5363)));
            zz = -17.37022 + (((tickAnim - 8) / 7) * (-13.26062-(-17.37022)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 1.84895 + (((tickAnim - 15) / 9) * (5.18131-(1.84895)));
            yy = 8.23642 + (((tickAnim - 15) / 9) * (3.7884-(8.23642)));
            zz = -13.26062 + (((tickAnim - 15) / 9) * (14.08514-(-13.26062)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 5.18131 + (((tickAnim - 24) / 6) * (4.65542-(5.18131)));
            yy = 3.7884 + (((tickAnim - 24) / 6) * (5.30496-(3.7884)));
            zz = 14.08514 + (((tickAnim - 24) / 6) * (5.16546-(14.08514)));
        }
        else if (tickAnim >= 30 && tickAnim < 119) {
            xx = 4.65542 + (((tickAnim - 30) / 89) * (4.65542-(4.65542)));
            yy = 5.30496 + (((tickAnim - 30) / 89) * (5.30496-(5.30496)));
            zz = 5.16546 + (((tickAnim - 30) / 89) * (5.16546-(5.16546)));
        }
        else if (tickAnim >= 119 && tickAnim < 125) {
            xx = 4.65542 + (((tickAnim - 119) / 6) * (5.90158-(4.65542)));
            yy = 5.30496 + (((tickAnim - 119) / 6) * (4.61895-(5.30496)));
            zz = 5.16546 + (((tickAnim - 119) / 6) * (7.1495-(5.16546)));
        }
        else if (tickAnim >= 125 && tickAnim < 132) {
            xx = 5.90158 + (((tickAnim - 125) / 7) * (5.43896-(5.90158)));
            yy = 4.61895 + (((tickAnim - 125) / 7) * (7.08429-(4.61895)));
            zz = 7.1495 + (((tickAnim - 125) / 7) * (-6.84819-(7.1495)));
        }
        else if (tickAnim >= 132 && tickAnim < 136) {
            xx = 5.43896 + (((tickAnim - 132) / 4) * (7.84792-(5.43896)));
            yy = 7.08429 + (((tickAnim - 132) / 4) * (2.70462-(7.08429)));
            zz = -6.84819 + (((tickAnim - 132) / 4) * (13.22276-(-6.84819)));
        }
        else if (tickAnim >= 136 && tickAnim < 140) {
            xx = 7.84792 + (((tickAnim - 136) / 4) * (7.83356-(7.84792)));
            yy = 2.70462 + (((tickAnim - 136) / 4) * (4.51287-(2.70462)));
            zz = 13.22276 + (((tickAnim - 136) / 4) * (4.46372-(13.22276)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfrontflipper3, rightfrontflipper3.rotateAngleX + (float) Math.toRadians(xx), rightfrontflipper3.rotateAngleY + (float) Math.toRadians(yy), rightfrontflipper3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = 0.45 + (((tickAnim - 0) / 140) * (0.45-(0.45)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfrontflipper3.rotationPointX = this.rightfrontflipper3.rotationPointX + (float)(xx);
        this.rightfrontflipper3.rotationPointY = this.rightfrontflipper3.rotationPointY - (float)(yy);
        this.rightfrontflipper3.rotationPointZ = this.rightfrontflipper3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.5 + (((tickAnim - 0) / 3) * (20.28673-(23.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-2.36416-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (7.26314-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 20.28673 + (((tickAnim - 3) / 5) * (17.15329-(20.28673)));
            yy = -2.36416 + (((tickAnim - 3) / 5) * (1.25967-(-2.36416)));
            zz = 7.26314 + (((tickAnim - 3) / 5) * (-0.78775-(7.26314)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 17.15329 + (((tickAnim - 8) / 7) * (12.58684-(17.15329)));
            yy = 1.25967 + (((tickAnim - 8) / 7) * (9.51806-(1.25967)));
            zz = -0.78775 + (((tickAnim - 8) / 7) * (-22.68143-(-0.78775)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 12.58684 + (((tickAnim - 15) / 9) * (15.98225-(12.58684)));
            yy = 9.51806 + (((tickAnim - 15) / 9) * (2.808-(9.51806)));
            zz = -22.68143 + (((tickAnim - 15) / 9) * (0.60514-(-22.68143)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 15.98225 + (((tickAnim - 24) / 6) * (11.87497-(15.98225)));
            yy = 2.808 + (((tickAnim - 24) / 6) * (2.66131-(2.808)));
            zz = 0.60514 + (((tickAnim - 24) / 6) * (0.57353-(0.60514)));
        }
        else if (tickAnim >= 30 && tickAnim < 119) {
            xx = 11.87497 + (((tickAnim - 30) / 89) * (11.87497-(11.87497)));
            yy = 2.66131 + (((tickAnim - 30) / 89) * (2.66131-(2.66131)));
            zz = 0.57353 + (((tickAnim - 30) / 89) * (0.57353-(0.57353)));
        }
        else if (tickAnim >= 119 && tickAnim < 125) {
            xx = 11.87497 + (((tickAnim - 119) / 6) * (15.7083-(11.87497)));
            yy = 2.66131 + (((tickAnim - 119) / 6) * (2.4811-(2.66131)));
            zz = 0.57353 + (((tickAnim - 119) / 6) * (-0.74311-(0.57353)));
        }
        else if (tickAnim >= 125 && tickAnim < 132) {
            xx = 15.7083 + (((tickAnim - 125) / 7) * (18.53425-(15.7083)));
            yy = 2.4811 + (((tickAnim - 125) / 7) * (4.96692-(2.4811)));
            zz = -0.74311 + (((tickAnim - 125) / 7) * (-11.39226-(-0.74311)));
        }
        else if (tickAnim >= 132 && tickAnim < 136) {
            xx = 18.53425 + (((tickAnim - 132) / 4) * (20.87714-(18.53425)));
            yy = 4.96692 + (((tickAnim - 132) / 4) * (4.81879-(4.96692)));
            zz = -11.39226 + (((tickAnim - 132) / 4) * (-11.83999-(-11.39226)));
        }
        else if (tickAnim >= 136 && tickAnim < 140) {
            xx = 20.87714 + (((tickAnim - 136) / 4) * (23.5-(20.87714)));
            yy = 4.81879 + (((tickAnim - 136) / 4) * (0-(4.81879)));
            zz = -11.83999 + (((tickAnim - 136) / 4) * (0-(-11.83999)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfrontflipper4, rightfrontflipper4.rotateAngleX + (float) Math.toRadians(xx), rightfrontflipper4.rotateAngleY + (float) Math.toRadians(yy), rightfrontflipper4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = -10.54711 + (((tickAnim - 0) / 140) * (-10.54711-(-10.54711)));
            yy = -13.0721+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 0) / 140) * (-13.0721-(-13.0721+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            zz = -6.41427 + (((tickAnim - 0) / 140) * (-6.41427-(-6.41427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfrontflipper, leftfrontflipper.rotateAngleX + (float) Math.toRadians(xx), leftfrontflipper.rotateAngleY + (float) Math.toRadians(yy), leftfrontflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = -1.99768 + (((tickAnim - 0) / 140) * (-1.99768-(-1.99768)));
            yy = -7.63715 + (((tickAnim - 0) / 140) * (-7.63715-(-7.63715)));
            zz = -9.16399 + (((tickAnim - 0) / 140) * (-9.16399-(-9.16399)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfrontflipper2, leftfrontflipper2.rotateAngleX + (float) Math.toRadians(xx), leftfrontflipper2.rotateAngleY + (float) Math.toRadians(yy), leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 11.25 + (((tickAnim - 0) / 140) * (11.25-(11.25)));
            yy = -6 + (((tickAnim - 0) / 140) * (-6-(-6)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfrontflipper3, leftfrontflipper3.rotateAngleX + (float) Math.toRadians(xx), leftfrontflipper3.rotateAngleY + (float) Math.toRadians(yy), leftfrontflipper3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 140) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfrontflipper3.rotationPointX = this.leftfrontflipper3.rotationPointX + (float)(xx);
        this.leftfrontflipper3.rotationPointY = this.leftfrontflipper3.rotationPointY - (float)(yy);
        this.leftfrontflipper3.rotationPointZ = this.leftfrontflipper3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 14.5 + (((tickAnim - 0) / 140) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = -5.25 + (((tickAnim - 0) / 140) * (-5.25-(-5.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfrontflipper4, leftfrontflipper4.rotateAngleX + (float) Math.toRadians(xx), leftfrontflipper4.rotateAngleY + (float) Math.toRadians(yy), leftfrontflipper4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 4.992 + (((tickAnim - 0) / 41) * (5-(4.992)));
            yy = 0.28311 + (((tickAnim - 0) / 41) * (0-(0.28311)));
            zz = -3.23766 + (((tickAnim - 0) / 41) * (0-(-3.23766)));
        }
        else if (tickAnim >= 41 && tickAnim < 57) {
            xx = 5 + (((tickAnim - 41) / 16) * (6.6404+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5-(5)));
            yy = 0 + (((tickAnim - 41) / 16) * (4.9328+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(0)));
            zz = 0 + (((tickAnim - 41) / 16) * (0.393-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 66) {
            xx = 6.6404+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5 + (((tickAnim - 57) / 9) * (4.83748-(6.6404+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5)));
            yy = 4.9328+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 57) / 9) * (6.50815-(4.9328+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            zz = 0.393 + (((tickAnim - 57) / 9) * (3.19238-(0.393)));
        }
        else if (tickAnim >= 66 && tickAnim < 102) {
            xx = 4.83748 + (((tickAnim - 66) / 36) * (4.26931-(4.83748)));
            yy = 6.50815 + (((tickAnim - 66) / 36) * (6.73249-(6.50815)));
            zz = 3.19238 + (((tickAnim - 66) / 36) * (0.43314-(3.19238)));
        }
        else if (tickAnim >= 102 && tickAnim < 122) {
            xx = 4.26931 + (((tickAnim - 102) / 20) * (0.88465-(4.26931)));
            yy = 6.73249 + (((tickAnim - 102) / 20) * (3.36624-(6.73249)));
            zz = 0.43314 + (((tickAnim - 102) / 20) * (0.21657-(0.43314)));
        }
        else if (tickAnim >= 122 && tickAnim < 140) {
            xx = 0.88465 + (((tickAnim - 122) / 18) * (4.992-(0.88465)));
            yy = 3.36624 + (((tickAnim - 122) / 18) * (0.28311-(3.36624)));
            zz = 0.21657 + (((tickAnim - 122) / 18) * (-3.23766-(0.21657)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 41) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 41) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 41) / 99) * (0-(0)));
            yy = -0.425 + (((tickAnim - 41) / 99) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 41) / 99) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 41) {
            xx = -2.6735 + (((tickAnim - 0) / 41) * (-2.86902-(-2.6735)));
            yy = -3.80488 + (((tickAnim - 0) / 41) * (-3.6598-(-3.80488)));
            zz = -1.07114 + (((tickAnim - 0) / 41) * (1.93172-(-1.07114)));
        }
        else if (tickAnim >= 41 && tickAnim < 57) {
            xx = -2.86902 + (((tickAnim - 41) / 16) * (-6.169+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(-2.86902)));
            yy = -3.6598 + (((tickAnim - 41) / 16) * (-3.6598-(-3.6598)));
            zz = 1.93172 + (((tickAnim - 41) / 16) * (1.93172-(1.93172)));
        }
        else if (tickAnim >= 57 && tickAnim < 66) {
            xx = -6.169+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 57) / 9) * (-5.96243-(-6.169+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = -3.6598 + (((tickAnim - 57) / 9) * (-3.50519-(-3.6598)));
            zz = 1.93172 + (((tickAnim - 57) / 9) * (3.42666-(1.93172)));
        }
        else if (tickAnim >= 66 && tickAnim < 102) {
            xx = -5.96243 + (((tickAnim - 66) / 36) * (-5.86902-(-5.96243)));
            yy = -3.50519 + (((tickAnim - 66) / 36) * (-3.6598-(-3.50519)));
            zz = 3.42666 + (((tickAnim - 66) / 36) * (1.93172-(3.42666)));
        }
        else if (tickAnim >= 102 && tickAnim < 122) {
            xx = -5.86902 + (((tickAnim - 102) / 20) * (-8.59548-(-5.86902)));
            yy = -3.6598 + (((tickAnim - 102) / 20) * (-2.19343-(-3.6598)));
            zz = 1.93172 + (((tickAnim - 102) / 20) * (1.55946-(1.93172)));
        }
        else if (tickAnim >= 122 && tickAnim < 140) {
            xx = -8.59548 + (((tickAnim - 122) / 18) * (-2.6735-(-8.59548)));
            yy = -2.19343 + (((tickAnim - 122) / 18) * (-3.80488-(-2.19343)));
            zz = 1.55946 + (((tickAnim - 122) / 18) * (-1.07114-(1.55946)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 41) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 41) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 16) * (0.5-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 57) / 83) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 83) * (0-(0)));
            zz = 0.5 + (((tickAnim - 57) / 83) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body3.rotationPointX = this.body3.rotationPointX + (float)(xx);
        this.body3.rotationPointY = this.body3.rotationPointY - (float)(yy);
        this.body3.rotationPointZ = this.body3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -8.74237 + (((tickAnim - 0) / 17) * (-12.14946-(-8.74237)));
            yy = -1.88248 + (((tickAnim - 0) / 17) * (-2.3161-(-1.88248)));
            zz = 5.97423 + (((tickAnim - 0) / 17) * (3.76962-(5.97423)));
        }
        else if (tickAnim >= 17 && tickAnim < 41) {
            xx = -12.14946 + (((tickAnim - 17) / 24) * (-8.51473-(-12.14946)));
            yy = -2.3161 + (((tickAnim - 17) / 24) * (-2.94483-(-2.3161)));
            zz = 3.76962 + (((tickAnim - 17) / 24) * (0.57293-(3.76962)));
        }
        else if (tickAnim >= 41 && tickAnim < 57) {
            xx = -8.51473 + (((tickAnim - 41) / 16) * (-6.91546-(-8.51473)));
            yy = -2.94483 + (((tickAnim - 41) / 16) * (3.5144+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-2.94483)));
            zz = 0.57293 + (((tickAnim - 41) / 16) * (-1.92698-(0.57293)));
        }
        else if (tickAnim >= 57 && tickAnim < 66) {
            xx = -6.91546 + (((tickAnim - 57) / 9) * (-3.62897-(-6.91546)));
            yy = 3.5144+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 57) / 9) * (9.34989-(3.5144+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            zz = -1.92698 + (((tickAnim - 57) / 9) * (-6.21133-(-1.92698)));
        }
        else if (tickAnim >= 66 && tickAnim < 93) {
            xx = -3.62897 + (((tickAnim - 66) / 27) * (-3.91546-(-3.62897)));
            yy = 9.34989 + (((tickAnim - 66) / 27) * (9.81444-(9.34989)));
            zz = -6.21133 + (((tickAnim - 66) / 27) * (-1.92698-(-6.21133)));
        }
        else if (tickAnim >= 93 && tickAnim < 102) {
            xx = -3.91546 + (((tickAnim - 93) / 9) * (-3.41546-(-3.91546)));
            yy = 9.81444 + (((tickAnim - 93) / 9) * (9.81444-(9.81444)));
            zz = -1.92698 + (((tickAnim - 93) / 9) * (-1.92698-(-1.92698)));
        }
        else if (tickAnim >= 102 && tickAnim < 122) {
            xx = -3.41546 + (((tickAnim - 102) / 20) * (-5.92654-(-3.41546)));
            yy = 9.81444 + (((tickAnim - 102) / 20) * (-3.04453-(9.81444)));
            zz = -1.92698 + (((tickAnim - 102) / 20) * (-0.00983-(-1.92698)));
        }
        else if (tickAnim >= 122 && tickAnim < 140) {
            xx = -5.92654 + (((tickAnim - 122) / 18) * (-8.74237-(-5.92654)));
            yy = -3.04453 + (((tickAnim - 122) / 18) * (-1.88248-(-3.04453)));
            zz = -0.00983 + (((tickAnim - 122) / 18) * (5.97423-(-0.00983)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            yy = -0.55 + (((tickAnim - 0) / 41) * (-0.55-(-0.55)));
            zz = 1.4 + (((tickAnim - 0) / 41) * (1.4-(1.4)));
        }
        else if (tickAnim >= 41 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 41) / 99) * (0-(0)));
            yy = -0.55 + (((tickAnim - 41) / 99) * (-0.55-(-0.55)));
            zz = 1.4 + (((tickAnim - 41) / 99) * (1.4-(1.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 41) {
            xx = 4 + (((tickAnim - 17) / 24) * (0-(4)));
            yy = 0 + (((tickAnim - 17) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 24) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 41) / 16) * (7-(0)));
            yy = 0 + (((tickAnim - 41) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 16) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 7 + (((tickAnim - 57) / 3) * (2.15-(7)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 66) {
            xx = 2.15 + (((tickAnim - 60) / 6) * (0-(2.15)));
            yy = 0 + (((tickAnim - 60) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 6) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 66) / 27) * (0.75-(0)));
            yy = 0 + (((tickAnim - 66) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 27) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 102) {
            xx = 0.75 + (((tickAnim - 93) / 9) * (0-(0.75)));
            yy = 0 + (((tickAnim - 93) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 9) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 102) / 20) * (7.25-(0)));
            yy = 0 + (((tickAnim - 102) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 20) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 140) {
            xx = 7.25 + (((tickAnim - 122) / 18) * (0-(7.25)));
            yy = 0 + (((tickAnim - 122) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        this.main.offsetZ = -0.5F;

        this.faceTarget(f3, f4, 5, body2);
        this.faceTarget(f3, f4, 5, body3);
        this.faceTarget(f3, f4, 5, head);

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};

        EntityPrehistoricFloraLuskhan ee = (EntityPrehistoricFloraLuskhan) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

