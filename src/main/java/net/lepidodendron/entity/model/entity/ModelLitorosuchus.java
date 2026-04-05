package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLitorosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLitorosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer tail8;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;

    private ModelAnimator animator;

    public ModelLitorosuchus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 17.6702F, 1.7521F);
        this.main.cubeList.add(new ModelBox(main, 21, 0, -1.5F, -1.4702F, -2.0521F, 3, 3, 4, 0.006F, false));
        this.main.cubeList.add(new ModelBox(main, 20, 54, -0.5F, -1.9702F, -1.0521F, 1, 1, 3, -0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, 1.5298F, 1.9479F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 27, -2.5F, -0.6F, -4.0F, 3, 1, 4, 0.003F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.2881F, 0.2495F, -0.1638F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.2884F, -0.2207F, -0.4468F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 49, 6, -1.0F, -0.25F, -1.0F, 2, 4, 2, 0.003F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 3.75F, -1.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.4702F, -0.1001F, 0.1942F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 50, 39, -1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.1049F, 2.4253F, 1.0246F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.6425F, 0.0226F, 0.217F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 29, 54, -1.5F, -0.5F, 0.0F, 3, 3, 1, 0.0F, true));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.2881F, 0.2495F, -0.1638F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2884F, 0.2207F, 0.4468F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 49, 6, -1.0F, -0.25F, -1.0F, 2, 4, 2, 0.003F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 3.75F, -1.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.4702F, 0.1001F, -0.1942F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 50, 39, -1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.1049F, 2.4253F, 1.0246F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.6425F, -0.0226F, -0.217F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 29, 54, -1.5F, -0.5F, 0.0F, 3, 3, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.0452F, 1.2452F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, 0.0654F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 30, -1.5F, -1.25F, 0.0F, 3, 3, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 22, 48, -0.5F, -2.25F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.55F, 3.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 18, -1.0F, -0.7F, 0.0F, 2, 3, 5, -0.003F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 30, 33, -0.5F, -1.8F, 0.0F, 1, 2, 5, 0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.55F, 4.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 21, -1.0F, -1.25F, 0.0F, 2, 3, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 36, 7, -0.5F, -2.15F, 0.0F, 1, 1, 5, -0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.075F, 4.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0654F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 33, 48, -0.5F, -1.9F, 0.0F, 1, 1, 4, -0.006F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 36, 0, -1.0F, -1.0F, 0.0F, 2, 2, 4, -0.003F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -1.025F, 3.5F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0436F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 28, 41, -0.5F, 0.0F, 0.0F, 1, 2, 4, 0.006F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 44, 48, -0.5F, -0.6F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 1.35F, 3.75F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0436F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 45, 25, -0.5F, -1.1F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 49, -0.5F, -1.725F, 0.0F, 1, 1, 4, -0.006F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 47, 14, -0.5F, -0.6F, 0.0F, 1, 1, 4, -0.003F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -0.6749F, 3.4939F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, 0.0262F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 15, 35, -0.5F, -0.4F, 0.0F, 1, 1, 5, -0.006F, false));
        this.tail7.cubeList.add(new ModelBox(tail7, 39, 41, 0.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.tail8 = new AdvancedModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, 0.0436F, 0.0F, 0.0F);
        this.tail8.cubeList.add(new ModelBox(tail8, 49, 0, -0.5F, -0.4F, -0.025F, 1, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.475F, -0.9F, -0.025F);
        this.tail8.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0785F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 54, 0.5F, 0.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.6179F, -1.2602F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 11, -2.0F, -0.9523F, -4.9919F, 4, 4, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.8046F, -2.6842F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 11, -1.5F, -0.35F, -2.5F, 3, 1, 5, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5523F, -4.4919F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0524F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.5F, -0.55F, -5.0F, 5, 5, 5, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.05F, -4.25F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 15, 27, -2.0F, -0.45F, -3.0F, 4, 4, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 3.55F, -3.0F);
        this.body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 38, -2.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.1F, -2.5F);
        this.body3.addChild(neck);
        this.setRotateAngle(neck, -0.1222F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 34, 18, -1.5F, -0.35F, -3.0F, 3, 3, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 2.65F, -2.0F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 54, 31, -1.5F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.8001F, -2.4795F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2269F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 13, 42, -1.0F, -1.0F, -3.0F, 2, 2, 3, -0.006F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.0873F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 43, -1.0F, -1.0F, -3.0F, 2, 2, 3, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 1.3432F, -2.9477F);
        this.neck3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2094F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 54, -2.0F, -1.0F, 0.0F, 2, 1, 2, -0.006F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.002F, -1.0018F, -2.967F);
        this.neck3.addChild(head);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.002F, 2.1045F, -4.5427F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5061F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 47, 20, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.498F, 3.2082F, -4.3643F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.8684F, 0.1936F, -0.2052F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 42, 0.0F, -0.875F, -0.275F, 0, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.9044F, 2.7546F, -3.0631F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.0101F, 0.3144F, -0.4426F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 24, -0.2F, -0.375F, -1.25F, 0, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.2926F, 1.0847F, 0.5565F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.391F, 0.113F, 0.0465F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 21, 0.0F, -0.725F, -4.0F, 0, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.502F, 3.2082F, -4.3643F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.8684F, -0.1936F, 0.2052F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 42, 0.0F, -0.875F, -0.275F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.002F, 2.1045F, -4.5427F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.624F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 50, 45, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.498F, -0.0059F, -0.0175F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3316F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 14, -1.5F, 0.0F, -2.0F, 2, 1, 2, 0.006F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.002F, 1.7212F, -1.7916F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3229F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 48, -0.5F, -0.55F, -2.35F, 1, 1, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.9084F, 2.7546F, -3.0631F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.0101F, -0.3144F, 0.4426F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 15, 24, 0.2F, -0.375F, -1.25F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.2594F, 1.5488F, -1.4361F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3895F, -0.0767F, -0.0315F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 56, 20, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.003F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.8051F, 2.588F, -3.1181F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3953F, 0.1621F, 0.0765F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 54, 54, -0.9F, -0.825F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.9044F, 2.7546F, -3.0631F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2553F, 0.3897F, 0.1698F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 58, 16, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.9084F, 2.7546F, -3.0631F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2553F, -0.3897F, -0.1698F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 58, 16, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.2966F, 1.0847F, 0.5565F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.391F, -0.113F, -0.0465F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 15, 21, 0.0F, -0.725F, -4.0F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.2634F, 1.5488F, -1.4361F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3895F, 0.0767F, 0.0315F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 56, 20, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.8091F, 2.588F, -3.1181F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.394F, -0.1654F, -0.0684F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 54, 54, -0.1F, -0.825F, 0.0F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.002F, 1.4041F, -0.2376F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, 0.9878F, -0.5607F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.096F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 21, 8, -2.0F, -1.0F, 0.0F, 2, 1, 1, -0.009F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0F, 0.7893F, -1.3878F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.4002F, 0.2379F, 0.0994F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 55, 45, -1.0F, -0.5F, -2.0F, 1, 1, 2, -0.006F, true));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 47, 54, -0.1F, -0.65F, -3.0F, 0, 1, 3, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, 0.7893F, -1.3878F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.4002F, -0.2379F, -0.0994F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 55, 45, 0.0F, -0.5F, -2.0F, 1, 1, 2, -0.006F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 47, 54, 0.1F, -0.65F, -3.0F, 0, 1, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0F, -0.4023F, 0.2046F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3883F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 28, 8, -2.0F, -0.35F, -1.85F, 2, 1, 1, -0.006F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 54, 35, -2.0F, 0.0F, -1.925F, 2, 1, 2, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 43, 33, -1.5F, 0.0F, -5.175F, 1, 1, 4, -0.003F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(-0.002F, 1.1128F, -1.3884F);
        this.head.addChild(eye);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.6913F, 0.0096F, -0.0156F);
        this.eye.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.4351F, 0.1307F, 0.0499F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 59, -0.275F, -0.5F, -0.45F, 1, 1, 1, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.6913F, 0.0096F, -0.0156F);
        this.eye.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.4351F, -0.1307F, -0.0499F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 59, -0.725F, -0.5F, -0.45F, 1, 1, 1, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.9583F, 2.5665F, -1.7718F);
        this.body3.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.3146F, -0.4046F, 1.1126F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 56, 24, 0.0F, -0.5F, -0.8F, 1, 3, 1, -0.006F, false));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 38, 58, -0.5F, -0.5F, -0.8F, 1, 3, 1, 0.003F, false));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 58, 11, -0.5F, -0.5F, -0.2F, 1, 3, 1, 0.0F, false));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 54, 58, 0.0F, -0.5F, -0.2F, 1, 3, 1, -0.003F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.25F, 2.25F, 0.15F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.8855F, -0.328F, -0.7327F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 58, 6, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.0653F, 2.2642F, -0.1296F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, -1.4014F, 0.5843F, -0.0449F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 55, 49, -1.0F, -0.1F, -0.25F, 2, 2, 1, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(1.9583F, 2.5665F, -1.7718F);
        this.body3.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.3146F, 0.4046F, -1.1126F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 56, 24, -1.0F, -0.5F, -0.8F, 1, 3, 1, -0.006F, true));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 38, 58, -0.5F, -0.5F, -0.8F, 1, 3, 1, 0.003F, true));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 58, 11, -0.5F, -0.5F, -0.2F, 1, 3, 1, 0.0F, true));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 54, 58, -1.0F, -0.5F, -0.2F, 1, 3, 1, -0.003F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.25F, 2.25F, 0.15F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.8855F, 0.328F, 0.7327F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 58, 6, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, true));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0653F, 2.2642F, -0.1296F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, -1.4014F, -0.5843F, 0.0449F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 55, 49, -1.0F, -0.1F, -0.25F, 2, 2, 1, 0.0F, true));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(neck2, 0.15F, 0.05F, 0.05F);
        this.setRotateAngle(head, 0.15F, 0.1F, 0.05F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.neck.offsetZ = 0.02F;
        this.neck.offsetY = -0.01F;
        this.neck.offsetX = -0.0F;
        this.neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.11F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.main.offsetY = -0.11F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.20F;
        this.main.offsetX = 0.075F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(212);
        this.main.rotateAngleX = (float)Math.toRadians(22);
        this.main.rotateAngleZ = (float)Math.toRadians(-12);
        this.main.scaleChildren = true;
        float scaler = 0.4F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        this.main.offsetY = 0.0F;

        EntityPrehistoricFloraLitorosuchus proteros = (EntityPrehistoricFloraLitorosuchus) e;

        this.faceTarget(f3, f4, 10, neck);
        this.faceTarget(f3, f4, 10, neck2);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};
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
        EntityPrehistoricFloraLitorosuchus ee = (EntityPrehistoricFloraLitorosuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if(ee.getIsFast()){
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLitorosuchus entity = (EntityPrehistoricFloraLitorosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (63.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = 63.25 + (((tickAnim - 18) / 20) * (-17.25-(63.25)));
            yy = 0 + (((tickAnim - 18) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 20) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -17.25 + (((tickAnim - 38) / 12) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 19 + (((tickAnim - 18) / 9) * (31.94827-(19)));
            yy = 0 + (((tickAnim - 18) / 9) * (-2.36864-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (-10.22755-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 31.94827 + (((tickAnim - 27) / 11) * (6.27045-(31.94827)));
            yy = -2.36864 + (((tickAnim - 27) / 11) * (-6.636-(-2.36864)));
            zz = -10.22755 + (((tickAnim - 27) / 11) * (0.8015-(-10.22755)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 6.27045 + (((tickAnim - 38) / 12) * (0-(6.27045)));
            yy = -6.636 + (((tickAnim - 38) / 12) * (0-(-6.636)));
            zz = 0.8015 + (((tickAnim - 38) / 12) * (0-(0.8015)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 5) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0.2-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -0.175 + (((tickAnim - 38) / 12) * (0-(-0.175)));
            zz = 0.2 + (((tickAnim - 38) / 12) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (50.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 50.5 + (((tickAnim - 18) / 9) * (67.3-(50.5)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 67.3 + (((tickAnim - 27) / 6) * (0-(67.3)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (9.38218-(0)));
            yy = 0 + (((tickAnim - 33) / 5) * (0.41841-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (-4.48206-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 9.38218 + (((tickAnim - 38) / 12) * (0-(9.38218)));
            yy = 0.41841 + (((tickAnim - 38) / 12) * (0-(0.41841)));
            zz = -4.48206 + (((tickAnim - 38) / 12) * (0-(-4.48206)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 0.525 + (((tickAnim - 27) / 6) * (0-(0.525)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 5) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -0.4 + (((tickAnim - 38) / 12) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
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
        EntityPrehistoricFloraLitorosuchus entity = (EntityPrehistoricFloraLitorosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9.25 + (((tickAnim - 20) / 10) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9.25 + (((tickAnim - 30) / 20) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.275-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -1.275 + (((tickAnim - 20) / 10) * (-1.275-(-1.275)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -1.275 + (((tickAnim - 30) / 20) * (0-(-1.275)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-14.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -14.75 + (((tickAnim - 20) / 10) * (-14.75-(-14.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -14.75 + (((tickAnim - 30) / 20) * (0-(-14.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (25.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9 + (((tickAnim - 20) / 10) * (9-(9)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 25.75 + (((tickAnim - 20) / 10) * (25.75-(25.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9 + (((tickAnim - 30) / 20) * (0-(9)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 25.75 + (((tickAnim - 30) / 20) * (0-(25.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.225 + (((tickAnim - 20) / 10) * (0.225-(0.225)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.225 + (((tickAnim - 30) / 20) * (0-(0.225)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.47366-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.00852-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-10.76366-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -2.47366 + (((tickAnim - 20) / 10) * (-2.47366-(-2.47366)));
            yy = 0.00852 + (((tickAnim - 20) / 10) * (0.00852-(0.00852)));
            zz = -10.76366 + (((tickAnim - 20) / 10) * (-10.76366-(-10.76366)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -2.47366 + (((tickAnim - 30) / 20) * (0-(-2.47366)));
            yy = 0.00852 + (((tickAnim - 30) / 20) * (0-(0.00852)));
            zz = -10.76366 + (((tickAnim - 30) / 20) * (0-(-10.76366)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.175 + (((tickAnim - 20) / 10) * (0.175-(0.175)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.175 + (((tickAnim - 30) / 20) * (0-(0.175)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (14.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 14.75 + (((tickAnim - 20) / 10) * (14.75-(14.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 14.75 + (((tickAnim - 30) / 20) * (0-(14.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-25.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9 + (((tickAnim - 20) / 10) * (9-(9)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -25.75 + (((tickAnim - 20) / 10) * (-25.75-(-25.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9 + (((tickAnim - 30) / 20) * (0-(9)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -25.75 + (((tickAnim - 30) / 20) * (0-(-25.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.225 + (((tickAnim - 20) / 10) * (0.225-(0.225)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.225 + (((tickAnim - 30) / 20) * (0-(0.225)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.47366-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.00852-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (10.76366-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -2.47366 + (((tickAnim - 20) / 10) * (-2.47366-(-2.47366)));
            yy = -0.00852 + (((tickAnim - 20) / 10) * (-0.00852-(-0.00852)));
            zz = 10.76366 + (((tickAnim - 20) / 10) * (10.76366-(10.76366)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -2.47366 + (((tickAnim - 30) / 20) * (0-(-2.47366)));
            yy = -0.00852 + (((tickAnim - 30) / 20) * (0-(-0.00852)));
            zz = 10.76366 + (((tickAnim - 30) / 20) * (0-(10.76366)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.175 + (((tickAnim - 20) / 10) * (0.175-(0.175)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.175 + (((tickAnim - 30) / 20) * (0-(0.175)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.75 + (((tickAnim - 20) / 10) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 2.75 + (((tickAnim - 30) / 20) * (0-(2.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1.75 + (((tickAnim - 20) / 10) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1.75 + (((tickAnim - 30) / 20) * (0-(1.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5.25 + (((tickAnim - 20) / 10) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 30) / 20) * (0-(5.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLitorosuchus entity = (EntityPrehistoricFloraLitorosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 10) / 10) * (0-(7.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (7.47815-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.83142-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.47587-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 7.47815 + (((tickAnim - 10) / 10) * (0-(7.47815)));
            yy = -0.83142 + (((tickAnim - 10) / 10) * (0-(-0.83142)));
            zz = -0.47587 + (((tickAnim - 10) / 10) * (0-(-0.47587)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 5.75 + (((tickAnim - 10) / 3) * (22.08-(5.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 22.08 + (((tickAnim - 13) / 7) * (0-(22.08)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 12 + (((tickAnim - 5) / 5) * (0-(12)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (34.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 34.75 + (((tickAnim - 10) / 3) * (0-(34.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLitorosuchus entity = (EntityPrehistoricFloraLitorosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 19.75 + (((tickAnim - 8) / 4) * (19.75-(19.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 19.75 + (((tickAnim - 12) / 8) * (0-(19.75)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eye, eye.rotateAngleX + (float) Math.toRadians(xx), eye.rotateAngleY + (float) Math.toRadians(yy), eye.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 8) / 4) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0.2 + (((tickAnim - 12) / 8) * (0-(0.2)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eye.rotationPointX = this.eye.rotationPointX + (float)(xx);
        this.eye.rotationPointY = this.eye.rotationPointY - (float)(yy);
        this.eye.rotationPointZ = this.eye.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (0.0275-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 8) / 4) * (1-(1)));
            yy = 0.0275 + (((tickAnim - 8) / 4) * (0.0275-(0.0275)));
            zz = 1 + (((tickAnim - 8) / 4) * (1-(1)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 12) / 8) * (1-(1)));
            yy = 0.0275 + (((tickAnim - 12) / 8) * (1-(0.0275)));
            zz = 1 + (((tickAnim - 12) / 8) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLitorosuchus entity = (EntityPrehistoricFloraLitorosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*4), main.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(69.14985), leftLeg.rotateAngleY + (float) Math.toRadians(-1.45402), leftLeg.rotateAngleZ + (float) Math.toRadians(-53.86909));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-4), leftLeg2.rotateAngleY + (float) Math.toRadians(0), leftLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(91.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-4), leftLeg3.rotateAngleY + (float) Math.toRadians(0), leftLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(69.14985), rightLeg.rotateAngleY + (float) Math.toRadians(1.45402), rightLeg.rotateAngleZ + (float) Math.toRadians(53.86909));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*4), rightLeg2.rotateAngleY + (float) Math.toRadians(0), rightLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(91.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*4), rightLeg3.rotateAngleY + (float) Math.toRadians(0), rightLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*5), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*8), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*10), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*12), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*14), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*16), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0), tail7.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*18), tail7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0), tail8.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-350))*23), tail8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-4.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-3), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-4), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*4), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(7.75), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*4), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(8.75), neck2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-4), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-2), neck3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*4), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(28.09764), rightArm.rotateAngleY + (float) Math.toRadians(30.10966), rightArm.rotateAngleZ + (float) Math.toRadians(19.62866));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(72.8365884853-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-4), rightArm2.rotateAngleY + (float) Math.toRadians(25.45836), rightArm2.rotateAngleZ + (float) Math.toRadians(34.64088));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(101-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-4), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(28.09764), leftArm.rotateAngleY + (float) Math.toRadians(-30.10966), leftArm.rotateAngleZ + (float) Math.toRadians(-19.62866));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(72.8365884853-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*4), leftArm2.rotateAngleY + (float) Math.toRadians(-25.45836), leftArm2.rotateAngleZ + (float) Math.toRadians(-34.64088));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(101-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*4), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLitorosuchus entity = (EntityPrehistoricFloraLitorosuchus) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-50))*4), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-50))*-10), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-30))*-5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-50))*0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-30))*0.5);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 46 + (((tickAnim - 0) / 4) * (14.9119-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(46)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.34936-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-17.1473+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 14.9119-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 4) / 4) * (-17.1495-(14.9119-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = -0.34936 + (((tickAnim - 4) / 4) * (9.78418-(-0.34936)));
            zz = -17.1473+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 4) / 4) * (12.73775-(-17.1473+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -17.1495 + (((tickAnim - 8) / 10) * (46-(-17.1495)));
            yy = 9.78418 + (((tickAnim - 8) / 10) * (0-(9.78418)));
            zz = 12.73775 + (((tickAnim - 8) / 10) * (0-(12.73775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 30.32791 + (((tickAnim - 0) / 2) * (40.64206-(30.32791)));
            yy = -4.76417 + (((tickAnim - 0) / 2) * (-3.03393-(-4.76417)));
            zz = -5.85294 + (((tickAnim - 0) / 2) * (-7.0178-(-5.85294)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 40.64206 + (((tickAnim - 2) / 2) * (17.91904-(40.64206)));
            yy = -3.03393 + (((tickAnim - 2) / 2) * (-0.95765-(-3.03393)));
            zz = -7.0178 + (((tickAnim - 2) / 2) * (-8.41562-(-7.0178)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 17.91904 + (((tickAnim - 4) / 4) * (-13.4072-(17.91904)));
            yy = -0.95765 + (((tickAnim - 4) / 4) * (2.50283-(-0.95765)));
            zz = -8.41562 + (((tickAnim - 4) / 4) * (-10.74534-(-8.41562)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -13.4072 + (((tickAnim - 8) / 10) * (30.32791-(-13.4072)));
            yy = 2.50283 + (((tickAnim - 8) / 10) * (-4.76417-(2.50283)));
            zz = -10.74534 + (((tickAnim - 8) / 10) * (-5.85294-(-10.74534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 45.5 + (((tickAnim - 0) / 4) * (87.62-(45.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 87.62 + (((tickAnim - 4) / 4) * (24.25-(87.62)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 24.25 + (((tickAnim - 8) / 5) * (-9.87-(24.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -9.87 + (((tickAnim - 13) / 5) * (45.5-(-9.87)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.225-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.4 + (((tickAnim - 4) / 4) * (-0.1-(0.4)));
            zz = -0.225 + (((tickAnim - 4) / 4) * (0-(-0.225)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = -0.1 + (((tickAnim - 8) / 10) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -17.1495 + (((tickAnim - 0) / 8) * (47.5-(-17.1495)));
            yy = -9.78418 + (((tickAnim - 0) / 8) * (0-(-9.78418)));
            zz = -12.73775 + (((tickAnim - 0) / 8) * (0-(-12.73775)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 47.5 + (((tickAnim - 8) / 5) * (139.0619-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(47.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (-0.34936-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (49.9027+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 139.0619-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 13) / 5) * (-17.1495-(139.0619-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = -0.34936 + (((tickAnim - 13) / 5) * (-9.78418-(-0.34936)));
            zz = 49.9027+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 13) / 5) * (-12.73775-(49.9027+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -13.4072 + (((tickAnim - 0) / 8) * (30.32791-(-13.4072)));
            yy = -2.50283 + (((tickAnim - 0) / 8) * (4.76417-(-2.50283)));
            zz = 10.74534 + (((tickAnim - 0) / 8) * (5.85294-(10.74534)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 30.32791 + (((tickAnim - 8) / 3) * (40.64206-(30.32791)));
            yy = 4.76417 + (((tickAnim - 8) / 3) * (3.03393-(4.76417)));
            zz = 5.85294 + (((tickAnim - 8) / 3) * (7.0178-(5.85294)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 40.64206 + (((tickAnim - 11) / 2) * (17.91904-(40.64206)));
            yy = 3.03393 + (((tickAnim - 11) / 2) * (0.95765-(3.03393)));
            zz = 7.0178 + (((tickAnim - 11) / 2) * (8.41562-(7.0178)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 17.91904 + (((tickAnim - 13) / 5) * (-13.4072-(17.91904)));
            yy = 0.95765 + (((tickAnim - 13) / 5) * (-2.50283-(0.95765)));
            zz = 8.41562 + (((tickAnim - 13) / 5) * (10.74534-(8.41562)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 24.25 + (((tickAnim - 0) / 4) * (-9.87-(24.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -9.87 + (((tickAnim - 4) / 4) * (45.5-(-9.87)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 45.5 + (((tickAnim - 8) / 5) * (87.62-(45.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 87.62 + (((tickAnim - 13) / 5) * (24.25-(87.62)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 8) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0.4-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.225-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.4 + (((tickAnim - 13) / 5) * (-0.1-(0.4)));
            zz = -0.225 + (((tickAnim - 13) / 5) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-50))*-1), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-50))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-100))*-3), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-150))*-4), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-130))*-5), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-170))*-5), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0), tail7.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-300))*5), tail7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0), tail8.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-350))*5), tail8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-70))*-5), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-70))*10), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411))*9));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-100))*5), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-30))*3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411/0.5-150))*3), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-200))*-5), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-8.75), neck2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-230))*-8), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-9), neck3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-300))*10), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(15.5), head.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-200))*10), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 30.95836 + (((tickAnim - 0) / 4) * (-13.0562-(30.95836)));
            yy = 2.21826 + (((tickAnim - 0) / 4) * (10.3813-(2.21826)));
            zz = -4.06501 + (((tickAnim - 0) / 4) * (25.571-(-4.06501)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -13.0562 + (((tickAnim - 4) / 4) * (-41.74425-(-13.0562)));
            yy = 10.3813 + (((tickAnim - 4) / 4) * (22.10271-(10.3813)));
            zz = 25.571 + (((tickAnim - 4) / 4) * (-14.86292-(25.571)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -41.74425 + (((tickAnim - 8) / 10) * (30.95836-(-41.74425)));
            yy = 22.10271 + (((tickAnim - 8) / 10) * (2.21826-(22.10271)));
            zz = -14.86292 + (((tickAnim - 8) / 10) * (-4.06501-(-14.86292)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 50.75 + (((tickAnim - 0) / 3) * (13.50019-(50.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (24.28367-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (7.48033-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 13.50019 + (((tickAnim - 3) / 4) * (-33.41897-(13.50019)));
            yy = 24.28367 + (((tickAnim - 3) / 4) * (24.28255-(24.28367)));
            zz = 7.48033 + (((tickAnim - 3) / 4) * (-23.87687-(7.48033)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -33.41897 + (((tickAnim - 7) / 1) * (8.47788-(-33.41897)));
            yy = 24.28255 + (((tickAnim - 7) / 1) * (14.18791-(24.28255)));
            zz = -23.87687 + (((tickAnim - 7) / 1) * (11.08283-(-23.87687)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 8.47788 + (((tickAnim - 8) / 2) * (-3.4962-(8.47788)));
            yy = 14.18791 + (((tickAnim - 8) / 2) * (12.83668-(14.18791)));
            zz = 11.08283 + (((tickAnim - 8) / 2) * (10.02732-(11.08283)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -3.4962 + (((tickAnim - 10) / 8) * (50.75-(-3.4962)));
            yy = 12.83668 + (((tickAnim - 10) / 8) * (0-(12.83668)));
            zz = 10.02732 + (((tickAnim - 10) / 8) * (0-(10.02732)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-0.275-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.225-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -0.275 + (((tickAnim - 13) / 5) * (0-(-0.275)));
            yy = 0.25 + (((tickAnim - 13) / 5) * (0-(0.25)));
            zz = 0.225 + (((tickAnim - 13) / 5) * (0-(0.225)));
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
            xx = 52.82333 + (((tickAnim - 0) / 3) * (126.09848-(52.82333)));
            yy = -38.09882 + (((tickAnim - 0) / 3) * (-22.07531-(-38.09882)));
            zz = -5.39339 + (((tickAnim - 0) / 3) * (1.16819-(-5.39339)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 126.09848 + (((tickAnim - 3) / 3) * (126.09848-(126.09848)));
            yy = -22.07531 + (((tickAnim - 3) / 3) * (-22.07531-(-22.07531)));
            zz = 1.16819 + (((tickAnim - 3) / 3) * (1.16819-(1.16819)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 126.09848 + (((tickAnim - 6) / 2) * (43.32588-(126.09848)));
            yy = -22.07531 + (((tickAnim - 6) / 2) * (-7.50848-(-22.07531)));
            zz = 1.16819 + (((tickAnim - 6) / 2) * (7.13326-(1.16819)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 43.32588 + (((tickAnim - 8) / 2) * (47.59151-(43.32588)));
            yy = -7.50848 + (((tickAnim - 8) / 2) * (-10.42185-(-7.50848)));
            zz = 7.13326 + (((tickAnim - 8) / 2) * (5.94025-(7.13326)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 47.59151 + (((tickAnim - 10) / 3) * (3.1234-(47.59151)));
            yy = -10.42185 + (((tickAnim - 10) / 3) * (-19.78689-(-10.42185)));
            zz = 5.94025 + (((tickAnim - 10) / 3) * (-4.85916-(5.94025)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 3.1234 + (((tickAnim - 13) / 1) * (-23.55995-(3.1234)));
            yy = -19.78689 + (((tickAnim - 13) / 1) * (-25.89087-(-19.78689)));
            zz = -4.85916 + (((tickAnim - 13) / 1) * (-5.03724-(-4.85916)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -23.55995 + (((tickAnim - 14) / 4) * (52.82333-(-23.55995)));
            yy = -25.89087 + (((tickAnim - 14) / 4) * (-38.09882-(-25.89087)));
            zz = -5.03724 + (((tickAnim - 14) / 4) * (-5.39339-(-5.03724)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -41.74425 + (((tickAnim - 0) / 8) * (31.20422-(-41.74425)));
            yy = -22.10271 + (((tickAnim - 0) / 8) * (-2.97422-(-22.10271)));
            zz = 14.86292 + (((tickAnim - 0) / 8) * (4.76428-(14.86292)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 31.20422 + (((tickAnim - 8) / 5) * (-13.0562-(31.20422)));
            yy = -2.97422 + (((tickAnim - 8) / 5) * (-10.3813-(-2.97422)));
            zz = 4.76428 + (((tickAnim - 8) / 5) * (-25.571-(4.76428)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -13.0562 + (((tickAnim - 13) / 5) * (-41.74425-(-13.0562)));
            yy = -10.3813 + (((tickAnim - 13) / 5) * (-22.10271-(-10.3813)));
            zz = -25.571 + (((tickAnim - 13) / 5) * (14.86292-(-25.571)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 8.47788 + (((tickAnim - 0) / 1) * (-3.4962-(8.47788)));
            yy = -14.18791 + (((tickAnim - 0) / 1) * (-12.83668-(-14.18791)));
            zz = -11.08283 + (((tickAnim - 0) / 1) * (-10.02732-(-11.08283)));
        }
        else if (tickAnim >= 1 && tickAnim < 8) {
            xx = -3.4962 + (((tickAnim - 1) / 7) * (50.75-(-3.4962)));
            yy = -12.83668 + (((tickAnim - 1) / 7) * (0-(-12.83668)));
            zz = -10.02732 + (((tickAnim - 1) / 7) * (0-(-10.02732)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 50.75 + (((tickAnim - 8) / 4) * (13.50019-(50.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (-24.28367-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-7.48033-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 13.50019 + (((tickAnim - 12) / 3) * (-33.41897-(13.50019)));
            yy = -24.28367 + (((tickAnim - 12) / 3) * (-24.28255-(-24.28367)));
            zz = -7.48033 + (((tickAnim - 12) / 3) * (23.87687-(-7.48033)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -33.41897 + (((tickAnim - 15) / 3) * (8.47788-(-33.41897)));
            yy = -24.28255 + (((tickAnim - 15) / 3) * (-14.18791-(-24.28255)));
            zz = 23.87687 + (((tickAnim - 15) / 3) * (-11.08283-(23.87687)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0.2-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (0.25-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0.225-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0.2 + (((tickAnim - 3) / 5) * (0-(0.2)));
            yy = 0.25 + (((tickAnim - 3) / 5) * (0-(0.25)));
            zz = 0.225 + (((tickAnim - 3) / 5) * (0-(0.225)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 43.32588 + (((tickAnim - 0) / 1) * (47.59151-(43.32588)));
            yy = 7.50848 + (((tickAnim - 0) / 1) * (10.42185-(7.50848)));
            zz = -7.13326 + (((tickAnim - 0) / 1) * (-5.94025-(-7.13326)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 47.59151 + (((tickAnim - 1) / 2) * (3.1234-(47.59151)));
            yy = 10.42185 + (((tickAnim - 1) / 2) * (19.78689-(10.42185)));
            zz = -5.94025 + (((tickAnim - 1) / 2) * (4.85916-(-5.94025)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.1234 + (((tickAnim - 3) / 2) * (-23.55995-(3.1234)));
            yy = 19.78689 + (((tickAnim - 3) / 2) * (25.89087-(19.78689)));
            zz = 4.85916 + (((tickAnim - 3) / 2) * (5.03724-(4.85916)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -23.55995 + (((tickAnim - 5) / 3) * (52.82333-(-23.55995)));
            yy = 25.89087 + (((tickAnim - 5) / 3) * (38.09882-(25.89087)));
            zz = 5.03724 + (((tickAnim - 5) / 3) * (5.39339-(5.03724)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 52.82333 + (((tickAnim - 8) / 4) * (126.09848-(52.82333)));
            yy = 38.09882 + (((tickAnim - 8) / 4) * (22.07531-(38.09882)));
            zz = 5.39339 + (((tickAnim - 8) / 4) * (-1.16819-(5.39339)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 126.09848 + (((tickAnim - 12) / 3) * (126.09848-(126.09848)));
            yy = 22.07531 + (((tickAnim - 12) / 3) * (22.07531-(22.07531)));
            zz = -1.16819 + (((tickAnim - 12) / 3) * (-1.16819-(-1.16819)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 126.09848 + (((tickAnim - 15) / 3) * (43.32588-(126.09848)));
            yy = 22.07531 + (((tickAnim - 15) / 3) * (7.50848-(22.07531)));
            zz = -1.16819 + (((tickAnim - 15) / 3) * (-7.13326-(-1.16819)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLitorosuchus entity = (EntityPrehistoricFloraLitorosuchus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-50))*2), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-7), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-30))*-3));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-50))*0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-30))*0.5);



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 33.25 + (((tickAnim - 0) / 9) * (5.3869-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(33.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.34936-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (8.4027+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 5.3869-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 9) / 9) * (-17.1495-(5.3869-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = -0.34936 + (((tickAnim - 9) / 9) * (9.78418-(-0.34936)));
            zz = 8.4027+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 9) / 9) * (12.73775-(8.4027+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -17.1495 + (((tickAnim - 18) / 17) * (33.25-(-17.1495)));
            yy = 9.78418 + (((tickAnim - 18) / 17) * (0-(9.78418)));
            zz = 12.73775 + (((tickAnim - 18) / 17) * (0-(12.73775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 30.32791 + (((tickAnim - 0) / 4) * (40.64206-(30.32791)));
            yy = -4.76417 + (((tickAnim - 0) / 4) * (-3.03393-(-4.76417)));
            zz = -5.85294 + (((tickAnim - 0) / 4) * (-7.0178-(-5.85294)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 40.64206 + (((tickAnim - 4) / 5) * (17.91904-(40.64206)));
            yy = -3.03393 + (((tickAnim - 4) / 5) * (-0.95765-(-3.03393)));
            zz = -7.0178 + (((tickAnim - 4) / 5) * (-8.41562-(-7.0178)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 17.91904 + (((tickAnim - 9) / 9) * (-13.4072-(17.91904)));
            yy = -0.95765 + (((tickAnim - 9) / 9) * (2.50283-(-0.95765)));
            zz = -8.41562 + (((tickAnim - 9) / 9) * (-10.74534-(-8.41562)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -13.4072 + (((tickAnim - 18) / 17) * (30.32791-(-13.4072)));
            yy = 2.50283 + (((tickAnim - 18) / 17) * (-4.76417-(2.50283)));
            zz = -10.74534 + (((tickAnim - 18) / 17) * (-5.85294-(-10.74534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 45.5 + (((tickAnim - 0) / 9) * (87.62-(45.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 87.62 + (((tickAnim - 9) / 9) * (24.25-(87.62)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 24.25 + (((tickAnim - 18) / 9) * (-9.87-(24.25)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -9.87 + (((tickAnim - 27) / 8) * (45.5-(-9.87)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.225-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0.4 + (((tickAnim - 9) / 9) * (-0.1-(0.4)));
            zz = -0.225 + (((tickAnim - 9) / 9) * (0-(-0.225)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = -0.1 + (((tickAnim - 18) / 17) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -17.1495 + (((tickAnim - 0) / 18) * (33.25-(-17.1495)));
            yy = -9.78418 + (((tickAnim - 0) / 18) * (0-(-9.78418)));
            zz = -12.73775 + (((tickAnim - 0) / 18) * (0-(-12.73775)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 33.25 + (((tickAnim - 18) / 9) * (188.9119-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(33.25)));
            yy = 0 + (((tickAnim - 18) / 9) * (-0.34936-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (49.9027+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 188.9119-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 27) / 8) * (-17.1495-(188.9119-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = -0.34936 + (((tickAnim - 27) / 8) * (-9.78418-(-0.34936)));
            zz = 49.9027+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 27) / 8) * (-12.73775-(49.9027+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -13.4072 + (((tickAnim - 0) / 18) * (30.32791-(-13.4072)));
            yy = -2.50283 + (((tickAnim - 0) / 18) * (4.76417-(-2.50283)));
            zz = 10.74534 + (((tickAnim - 0) / 18) * (5.85294-(10.74534)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 30.32791 + (((tickAnim - 18) / 4) * (40.64206-(30.32791)));
            yy = 4.76417 + (((tickAnim - 18) / 4) * (3.03393-(4.76417)));
            zz = 5.85294 + (((tickAnim - 18) / 4) * (7.0178-(5.85294)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 40.64206 + (((tickAnim - 22) / 5) * (17.91904-(40.64206)));
            yy = 3.03393 + (((tickAnim - 22) / 5) * (0.95765-(3.03393)));
            zz = 7.0178 + (((tickAnim - 22) / 5) * (8.41562-(7.0178)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 17.91904 + (((tickAnim - 27) / 8) * (-13.4072-(17.91904)));
            yy = 0.95765 + (((tickAnim - 27) / 8) * (-2.50283-(0.95765)));
            zz = 8.41562 + (((tickAnim - 27) / 8) * (10.74534-(8.41562)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 24.25 + (((tickAnim - 0) / 9) * (-9.87-(24.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -9.87 + (((tickAnim - 9) / 9) * (45.5-(-9.87)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 45.5 + (((tickAnim - 18) / 9) * (87.62-(45.5)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 87.62 + (((tickAnim - 27) / 8) * (24.25-(87.62)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 18) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 9) * (0.4-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (-0.225-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = 0.4 + (((tickAnim - 27) / 8) * (-0.1-(0.4)));
            zz = -0.225 + (((tickAnim - 27) / 8) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-1), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*-3), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*-4), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-130))*-5), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-170))*-5), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0), tail7.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-300))*5), tail7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0), tail8.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-350))*5), tail8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-70))*-3), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-70))*7), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*6));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*5), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-30))*1));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-150))*3), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*-5), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-230))*-8), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-300))*10), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*10), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 32.9079 + (((tickAnim - 0) / 9) * (-13.0562-(32.9079)));
            yy = 9.69139 + (((tickAnim - 0) / 9) * (10.3813-(9.69139)));
            zz = -10.62758 + (((tickAnim - 0) / 9) * (25.571-(-10.62758)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -13.0562 + (((tickAnim - 9) / 9) * (-41.74425-(-13.0562)));
            yy = 10.3813 + (((tickAnim - 9) / 9) * (22.10271-(10.3813)));
            zz = 25.571 + (((tickAnim - 9) / 9) * (-14.86292-(25.571)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -41.74425 + (((tickAnim - 18) / 17) * (32.9079-(-41.74425)));
            yy = 22.10271 + (((tickAnim - 18) / 17) * (9.69139-(22.10271)));
            zz = -14.86292 + (((tickAnim - 18) / 17) * (-10.62758-(-14.86292)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 50.75 + (((tickAnim - 0) / 6) * (13.50019-(50.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (24.28367-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (7.48033-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 13.50019 + (((tickAnim - 6) / 7) * (-33.41897-(13.50019)));
            yy = 24.28367 + (((tickAnim - 6) / 7) * (24.28255-(24.28367)));
            zz = 7.48033 + (((tickAnim - 6) / 7) * (-23.87687-(7.48033)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -33.41897 + (((tickAnim - 13) / 5) * (8.47788-(-33.41897)));
            yy = 24.28255 + (((tickAnim - 13) / 5) * (14.18791-(24.28255)));
            zz = -23.87687 + (((tickAnim - 13) / 5) * (11.08283-(-23.87687)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 8.47788 + (((tickAnim - 18) / 2) * (-3.4962-(8.47788)));
            yy = 14.18791 + (((tickAnim - 18) / 2) * (12.83668-(14.18791)));
            zz = 11.08283 + (((tickAnim - 18) / 2) * (10.02732-(11.08283)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -3.4962 + (((tickAnim - 20) / 15) * (50.75-(-3.4962)));
            yy = 12.83668 + (((tickAnim - 20) / 15) * (0-(12.83668)));
            zz = 10.02732 + (((tickAnim - 20) / 15) * (0-(10.02732)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (-0.275-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0.25-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0.225-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -0.275 + (((tickAnim - 25) / 10) * (0-(-0.275)));
            yy = 0.25 + (((tickAnim - 25) / 10) * (0-(0.25)));
            zz = 0.225 + (((tickAnim - 25) / 10) * (0-(0.225)));
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
            xx = 52.82333 + (((tickAnim - 0) / 6) * (126.09848-(52.82333)));
            yy = -38.09882 + (((tickAnim - 0) / 6) * (-22.07531-(-38.09882)));
            zz = -5.39339 + (((tickAnim - 0) / 6) * (1.16819-(-5.39339)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 126.09848 + (((tickAnim - 6) / 7) * (126.09848-(126.09848)));
            yy = -22.07531 + (((tickAnim - 6) / 7) * (-22.07531-(-22.07531)));
            zz = 1.16819 + (((tickAnim - 6) / 7) * (1.16819-(1.16819)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 126.09848 + (((tickAnim - 13) / 5) * (43.32588-(126.09848)));
            yy = -22.07531 + (((tickAnim - 13) / 5) * (-7.50848-(-22.07531)));
            zz = 1.16819 + (((tickAnim - 13) / 5) * (7.13326-(1.16819)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 43.32588 + (((tickAnim - 18) / 2) * (47.59151-(43.32588)));
            yy = -7.50848 + (((tickAnim - 18) / 2) * (-10.42185-(-7.50848)));
            zz = 7.13326 + (((tickAnim - 18) / 2) * (5.94025-(7.13326)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 47.59151 + (((tickAnim - 20) / 5) * (3.1234-(47.59151)));
            yy = -10.42185 + (((tickAnim - 20) / 5) * (-19.78689-(-10.42185)));
            zz = 5.94025 + (((tickAnim - 20) / 5) * (-4.85916-(5.94025)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 3.1234 + (((tickAnim - 25) / 3) * (-23.55995-(3.1234)));
            yy = -19.78689 + (((tickAnim - 25) / 3) * (-25.89087-(-19.78689)));
            zz = -4.85916 + (((tickAnim - 25) / 3) * (-5.03724-(-4.85916)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -23.55995 + (((tickAnim - 28) / 7) * (52.82333-(-23.55995)));
            yy = -25.89087 + (((tickAnim - 28) / 7) * (-38.09882-(-25.89087)));
            zz = -5.03724 + (((tickAnim - 28) / 7) * (-5.39339-(-5.03724)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -41.74425 + (((tickAnim - 0) / 18) * (32.9079-(-41.74425)));
            yy = -22.10271 + (((tickAnim - 0) / 18) * (-9.69139-(-22.10271)));
            zz = 14.86292 + (((tickAnim - 0) / 18) * (10.62758-(14.86292)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 32.9079 + (((tickAnim - 18) / 9) * (-13.0562-(32.9079)));
            yy = -9.69139 + (((tickAnim - 18) / 9) * (-10.3813-(-9.69139)));
            zz = 10.62758 + (((tickAnim - 18) / 9) * (-25.571-(10.62758)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -13.0562 + (((tickAnim - 27) / 8) * (-41.74425-(-13.0562)));
            yy = -10.3813 + (((tickAnim - 27) / 8) * (-22.10271-(-10.3813)));
            zz = -25.571 + (((tickAnim - 27) / 8) * (14.86292-(-25.571)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.47788 + (((tickAnim - 0) / 3) * (-3.4962-(8.47788)));
            yy = -14.18791 + (((tickAnim - 0) / 3) * (-12.83668-(-14.18791)));
            zz = -11.08283 + (((tickAnim - 0) / 3) * (-10.02732-(-11.08283)));
        }
        else if (tickAnim >= 3 && tickAnim < 18) {
            xx = -3.4962 + (((tickAnim - 3) / 15) * (50.75-(-3.4962)));
            yy = -12.83668 + (((tickAnim - 3) / 15) * (0-(-12.83668)));
            zz = -10.02732 + (((tickAnim - 3) / 15) * (0-(-10.02732)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 50.75 + (((tickAnim - 18) / 5) * (13.50019-(50.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (-24.28367-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-7.48033-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 13.50019 + (((tickAnim - 23) / 8) * (-33.41897-(13.50019)));
            yy = -24.28367 + (((tickAnim - 23) / 8) * (-24.28255-(-24.28367)));
            zz = -7.48033 + (((tickAnim - 23) / 8) * (23.87687-(-7.48033)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -33.41897 + (((tickAnim - 31) / 4) * (8.47788-(-33.41897)));
            yy = -24.28255 + (((tickAnim - 31) / 4) * (-14.18791-(-24.28255)));
            zz = 23.87687 + (((tickAnim - 31) / 4) * (-11.08283-(23.87687)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0.2-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0.225-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0.2 + (((tickAnim - 8) / 10) * (0-(0.2)));
            yy = 0.25 + (((tickAnim - 8) / 10) * (0-(0.25)));
            zz = 0.225 + (((tickAnim - 8) / 10) * (0-(0.225)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
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
            xx = 43.32588 + (((tickAnim - 0) / 3) * (47.59151-(43.32588)));
            yy = 7.50848 + (((tickAnim - 0) / 3) * (10.42185-(7.50848)));
            zz = -7.13326 + (((tickAnim - 0) / 3) * (-5.94025-(-7.13326)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 47.59151 + (((tickAnim - 3) / 5) * (3.1234-(47.59151)));
            yy = 10.42185 + (((tickAnim - 3) / 5) * (19.78689-(10.42185)));
            zz = -5.94025 + (((tickAnim - 3) / 5) * (4.85916-(-5.94025)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 3.1234 + (((tickAnim - 8) / 3) * (-23.55995-(3.1234)));
            yy = 19.78689 + (((tickAnim - 8) / 3) * (25.89087-(19.78689)));
            zz = 4.85916 + (((tickAnim - 8) / 3) * (5.03724-(4.85916)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -23.55995 + (((tickAnim - 11) / 7) * (52.82333-(-23.55995)));
            yy = 25.89087 + (((tickAnim - 11) / 7) * (38.09882-(25.89087)));
            zz = 5.03724 + (((tickAnim - 11) / 7) * (5.39339-(5.03724)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 52.82333 + (((tickAnim - 18) / 5) * (126.09848-(52.82333)));
            yy = 38.09882 + (((tickAnim - 18) / 5) * (22.07531-(38.09882)));
            zz = 5.39339 + (((tickAnim - 18) / 5) * (-1.16819-(5.39339)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 126.09848 + (((tickAnim - 23) / 7) * (126.09848-(126.09848)));
            yy = 22.07531 + (((tickAnim - 23) / 7) * (22.07531-(22.07531)));
            zz = -1.16819 + (((tickAnim - 23) / 7) * (-1.16819-(-1.16819)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 126.09848 + (((tickAnim - 30) / 5) * (43.32588-(126.09848)));
            yy = 22.07531 + (((tickAnim - 30) / 5) * (7.50848-(22.07531)));
            zz = -1.16819 + (((tickAnim - 30) / 5) * (-7.13326-(-1.16819)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));

    }




    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLitorosuchus e = (EntityPrehistoricFloraLitorosuchus) entity;
        animator.update(entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,0F);
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

    }
}
