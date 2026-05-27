package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraStruthiocephalus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelStruthiocephalus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r5;
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
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer boss;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;


    private ModelAnimator animator;

    public ModelStruthiocephalus() {
        this.textureWidth = 97;
        this.textureHeight = 97;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 8.0F, 5.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 2.2724F, 12.5012F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.4363F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 53, 11, -1.5F, 0.0F, -9.0F, 5, 2, 9, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, 2.2724F, 12.5012F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 37, 26, -2.5F, 0.0F, -10.0F, 8, 8, 10, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(3.5F, 4.7643F, 7.344F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.3491F, 0.0F, -0.4363F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 25, 69, -2.0F, -0.5F, -2.5F, 4, 7, 5, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.1505F, 5.8441F, -2.1602F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.3653F, -0.0534F, 0.374F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 74, 33, -1.5F, -0.25F, 0.0F, 3, 7, 4, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.4365F, 5.0467F, 2.0427F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.0436F, 0.001F, 0.0654F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 61, 70, -1.5F, 0.0F, -3.25F, 4, 2, 5, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.5F, 4.7643F, 7.344F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3491F, 0.0F, 0.4363F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 25, 69, -2.0F, -0.5F, -2.5F, 4, 7, 5, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.1505F, 5.8441F, -2.1602F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.3653F, 0.0534F, -0.374F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 74, 33, -1.5F, -0.25F, 0.0F, 3, 7, 4, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.4365F, 5.0467F, 2.0427F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.0436F, -0.001F, -0.0654F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 61, 70, -2.5F, 0.0F, -3.25F, 4, 2, 5, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-0.1667F, -0.9148F, 4.7876F);
        this.main.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -5.8333F, -0.321F, -13.9437F, 12, 11, 14, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.1667F, -4.1091F, -13.5971F);
        this.body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 37, 45, -5.0F, 0.0F, 0.0F, 10, 4, 9, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.8333F, -2.711F, -5.1696F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 46, -3.5F, 0.1F, 0.2F, 9, 4, 6, -0.003F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.4495F, 1.6817F, -13.0069F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 26, -5.7828F, -3.5027F, -6.9368F, 11, 12, 7, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 53, 0, -4.2828F, -5.8027F, -6.9368F, 8, 3, 7, -0.003F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(5.0985F, 4.958F, -3.1896F);
        this.body3.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.2174F, 0.0189F, -0.9142F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 44, 70, -2.5F, -1.5F, -2.5F, 4, 7, 4, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.3172F, 4.7495F, 0.2165F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.1406F, 0.2095F, 0.892F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 77, 52, -1.5F, 0.0F, -2.0F, 3, 7, 3, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 5.675F, -0.25F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, -0.0044F, 0.0F, -0.0044F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 61, 78, -2.0F, 0.0F, -3.0F, 4, 2, 4, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-5.6642F, 4.958F, -3.1896F);
        this.body3.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.2174F, -0.0189F, 0.9142F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 44, 70, -1.5F, -1.5F, -2.5F, 4, 7, 4, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.3172F, 4.7495F, 0.2165F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.1406F, -0.2095F, -0.892F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 77, 52, -1.5F, 0.0F, -2.0F, 3, 7, 3, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 5.675F, -0.25F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, -0.0044F, 0.0F, 0.0044F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 61, 78, -2.0F, 0.0F, -3.0F, 4, 2, 4, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-0.2828F, -3.1526F, -4.9368F);
        this.body3.addChild(neck);
        this.setRotateAngle(neck, -0.2182F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 25, 59, -3.0F, -2.0F, -7.0F, 6, 2, 7, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 52, 59, -3.0F, 0.0F, -6.0F, 6, 4, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 3.5265F, -2.7714F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1571F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 74, 23, -2.5F, -2.0F, -4.0F, 4, 5, 4, -0.009F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 8.7558F, 1.6861F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5236F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 57, -1.5F, -4.3F, -6.475F, 5, 5, 7, -0.013F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.9388F, -6.971F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.8727F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 84, 0, -1.5F, 1.7F, -5.325F, 3, 1, 3, 0.006F, false));
        this.head.cubeList.add(new ModelBox(head, 78, 78, -2.0F, 0.0F, -3.0F, 4, 5, 3, 0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.6283F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 45, 82, -1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0F, 2.8805F, -5.6325F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2739F, -0.2947F, 0.0814F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 46, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 55, 0.0F, -0.6F, 0.0F, 1, 1, 1, -0.003F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.347F, 3.2051F, -4.4209F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3365F, -0.6699F, 0.2139F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 53, 23, -1.0F, -0.6F, 0.0F, 1, 1, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 49, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.003F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.7558F, 3.2371F, -4.3018F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2823F, -0.3786F, 0.1068F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 89, 37, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 90, 52, 0.0F, -0.6F, 0.0F, 1, 1, 2, -0.003F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.5212F, 4.6812F, -2.7758F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2625F, 0.0095F, 0.0019F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 39, 88, 0.0F, -4.0F, 0.0F, 1, 4, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(3.5212F, 4.6812F, -2.7758F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2625F, -0.0095F, -0.0019F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 88, -1.0F, -4.0F, 0.0F, 1, 4, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.7558F, 3.2371F, -4.3018F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2823F, 0.3786F, -0.1068F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 90, 52, -1.0F, -0.6F, 0.0F, 1, 1, 2, -0.003F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 89, 37, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.347F, 3.2051F, -4.4209F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3365F, 0.6699F, -0.2139F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 53, 23, 0.0F, -0.6F, 0.0F, 1, 1, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 49, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.0F, 2.8805F, -5.6325F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2739F, 0.2947F, -0.0814F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 31, 55, -1.0F, -0.6F, 0.0F, 1, 1, 1, -0.003F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 31, 46, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 3.8347F, -6.2247F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2618F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 81, -2.0F, -1.075F, 0.325F, 4, 1, 4, 0.006F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 0.5712F, -5.1239F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6938F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 89, 33, -1.5F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.7868F, -5.402F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.3483F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 20, 89, -1.0F, 0.0F, -0.75F, 2, 1, 2, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 2.3241F, -7.0836F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3316F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 87, -1.5F, 0.0F, 0.0F, 3, 1, 2, 0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 2.7143F, -8.8943F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2182F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 89, -1.5F, 0.0F, 0.0F, 2, 1, 2, 0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 4.4658F, -10.2843F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.4363F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 46, 88, -1.5F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.7F, 4.5876F, -11.0845F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2182F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 28, 57, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 28, 57, 0.9F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 3.2F, -4.5F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 30, 87, -1.25F, 0.0F, -6.875F, 0, 1, 4, 0.0F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 30, 87, 1.25F, 0.0F, -6.875F, 0, 1, 4, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 82, 11, -1.5F, -0.5F, -6.9F, 3, 1, 4, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 82, 17, -2.0F, -0.5F, -2.9F, 4, 1, 3, 0.0F, false));

        this.boss = new AdvancedModelRenderer(this);
        this.boss.setRotationPoint(1.8701F, 1.325F, -1.4621F);
        this.head.addChild(boss);
        this.setRotateAngle(boss, 0.1178F, 0.0F, 0.0F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-4.8409F, -1.1F, -0.1471F);
        this.boss.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0742F, 0.0436F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 87, 87, 0.0F, 0.0F, 0.0F, 2, 2, 2, -0.003F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.7702F, 1.4F, -1.8129F);
        this.boss.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.1745F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 69, 85, -1.75F, -2.5F, 0.0F, 2, 3, 2, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.1006F, -1.1F, -0.1471F);
        this.boss.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0742F, -0.0436F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 87, 87, -2.0F, 0.0F, 0.0F, 2, 2, 2, -0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.9701F, 1.4F, -1.8129F);
        this.boss.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.1745F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 69, 85, -0.25F, -2.5F, 0.0F, 2, 3, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 4.6F, -3.1138F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, -1.0836F, -2.5592F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0873F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 30, 82, -1.5F, 0.0F, 1.075F, 5, 2, 2, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 58, 85, -0.5F, -1.5F, -0.2F, 3, 2, 2, -0.01F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 84, 5, -1.0F, 0.0F, -0.7F, 4, 2, 2, -0.006F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 25, 57, -0.15F, -0.5F, -5.55F, 1, 1, 0, 0.0F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 25, 57, 1.15F, -0.5F, -5.55F, 1, 1, 0, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 78, 87, -0.15F, -0.5F, -5.55F, 0, 1, 4, 0.0F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 78, 87, 2.15F, -0.5F, -5.55F, 0, 1, 4, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 76, 44, -0.5F, 0.0F, -5.65F, 3, 2, 5, -0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0F, 0.4F, -0.8862F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2618F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 77, 63, -0.5F, -0.975F, -2.0F, 4, 2, 4, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, 2.3533F, -3.6224F);
        this.head.addChild(eyes);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.5F, -0.3533F, -0.6276F);
        this.eyes.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0873F, 0.3927F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 31, 52, -0.7F, -0.2F, 0.125F, 1, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.5F, -0.3533F, -0.6276F);
        this.eyes.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0873F, -0.3927F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 31, 52, -0.3F, -0.2F, 0.125F, 1, 1, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, 3.2083F, 11.0911F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.7418F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 70, -1.0F, -1.1864F, -0.0867F, 3, 4, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.5F, 0.6864F, 4.5867F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.3054F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 80, 70, -1.0F, -1.5F, 0.0F, 2, 2, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.3491F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 82, -0.5F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(neck, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.neck.offsetZ = -0.05F;
        this.neck.offsetY = -0.04F;
        this.neck.offsetX = -0.0F;
        this.neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetZ = 0.02F;
        this.main.offsetY = 0.13F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 0.3F;
        this.main.offsetX = -0.3F;
        this.main.rotateAngleY = (float)Math.toRadians(130);
        this.main.rotateAngleX = (float)Math.toRadians(2);
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

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.hips.offsetY = 1.50F;

        EntityPrehistoricFloraStruthiocephalus entityStruthiocephalus = (EntityPrehistoricFloraStruthiocephalus) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};


        if (entityStruthiocephalus.getAnimation() == entityStruthiocephalus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityStruthiocephalus.isReallyInWater()) {

                if (f3 == 0.0F || !entityStruthiocephalus.getIsMoving()) {
                    if (entityStruthiocephalus.getAnimation() != entityStruthiocephalus.EAT_ANIMATION
                            && entityStruthiocephalus.getAnimation() != entityStruthiocephalus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityStruthiocephalus.getIsFast()) { //Running


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
        EntityPrehistoricFloraStruthiocephalus ee = (EntityPrehistoricFloraStruthiocephalus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        } else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            } else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) {
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStruthiocephalus entity = (EntityPrehistoricFloraStruthiocephalus) entitylivingbaseIn;
        int animCycle = 200;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = -1.5 + (((tickAnim - 40) / 140) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 40) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 140) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 200) {
            xx = -1.5 + (((tickAnim - 180) / 20) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 180) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-1.65-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 40) / 140) * (0-(0)));
            yy = 0.175 + (((tickAnim - 40) / 140) * (0.175-(0.175)));
            zz = -1.65 + (((tickAnim - 40) / 140) * (-1.65-(-1.65)));
        }
        else if (tickAnim >= 180 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 180) / 20) * (0-(0)));
            yy = 0.175 + (((tickAnim - 180) / 20) * (0-(0.175)));
            zz = -1.65 + (((tickAnim - 180) / 20) * (0-(-1.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 85) {
            xx = -5.25 + (((tickAnim - 30) / 55) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 30) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 55) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 115) {
            xx = -5.25 + (((tickAnim - 85) / 30) * (-7.9491-(-5.25)));
            yy = 0 + (((tickAnim - 85) / 30) * (2.4857-(0)));
            zz = 0 + (((tickAnim - 85) / 30) * (0.9399-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = -7.9491 + (((tickAnim - 115) / 10) * (-7.4491-(-7.9491)));
            yy = 2.4857 + (((tickAnim - 115) / 10) * (2.4857-(2.4857)));
            zz = 0.9399 + (((tickAnim - 115) / 10) * (0.9399-(0.9399)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -7.4491 + (((tickAnim - 125) / 15) * (-7.9491-(-7.4491)));
            yy = 2.4857 + (((tickAnim - 125) / 15) * (2.4857-(2.4857)));
            zz = 0.9399 + (((tickAnim - 125) / 15) * (0.9399-(0.9399)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = -7.9491 + (((tickAnim - 140) / 40) * (-7.9491-(-7.9491)));
            yy = 2.4857 + (((tickAnim - 140) / 40) * (2.4857-(2.4857)));
            zz = 0.9399 + (((tickAnim - 140) / 40) * (0.9399-(0.9399)));
        }
        else if (tickAnim >= 180 && tickAnim < 200) {
            xx = -7.9491 + (((tickAnim - 180) / 20) * (0-(-7.9491)));
            yy = 2.4857 + (((tickAnim - 180) / 20) * (0-(2.4857)));
            zz = 0.9399 + (((tickAnim - 180) / 20) * (0-(0.9399)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (10.2339-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-9.4969-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.6259-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = 10.2339 + (((tickAnim - 40) / 140) * (10.2339-(10.2339)));
            yy = -9.4969 + (((tickAnim - 40) / 140) * (-9.4969-(-9.4969)));
            zz = -0.6259 + (((tickAnim - 40) / 140) * (-0.6259-(-0.6259)));
        }
        else if (tickAnim >= 180 && tickAnim < 200) {
            xx = 10.2339 + (((tickAnim - 180) / 20) * (0-(10.2339)));
            yy = -9.4969 + (((tickAnim - 180) / 20) * (0-(-9.4969)));
            zz = -0.6259 + (((tickAnim - 180) / 20) * (0-(-0.6259)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (17.4923-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-2.5042-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (11.3882-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = 17.4923 + (((tickAnim - 40) / 140) * (17.4923-(17.4923)));
            yy = -2.5042 + (((tickAnim - 40) / 140) * (-2.5042-(-2.5042)));
            zz = 11.3882 + (((tickAnim - 40) / 140) * (11.3882-(11.3882)));
        }
        else if (tickAnim >= 180 && tickAnim < 200) {
            xx = 17.4923 + (((tickAnim - 180) / 20) * (0-(17.4923)));
            yy = -2.5042 + (((tickAnim - 180) / 20) * (0-(-2.5042)));
            zz = 11.3882 + (((tickAnim - 180) / 20) * (0-(11.3882)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-7.1831-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.8072-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-8.725-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = -7.1831 + (((tickAnim - 40) / 140) * (-7.1831-(-7.1831)));
            yy = -1.8072 + (((tickAnim - 40) / 140) * (-1.8072-(-1.8072)));
            zz = -8.725 + (((tickAnim - 40) / 140) * (-8.725-(-8.725)));
        }
        else if (tickAnim >= 180 && tickAnim < 200) {
            xx = -7.1831 + (((tickAnim - 180) / 20) * (0-(-7.1831)));
            yy = -1.8072 + (((tickAnim - 180) / 20) * (0-(-1.8072)));
            zz = -8.725 + (((tickAnim - 180) / 20) * (0-(-8.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5.2447-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.2395-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-2.2615-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = -5.2447 + (((tickAnim - 40) / 140) * (-5.2447-(-5.2447)));
            yy = 0.2395 + (((tickAnim - 40) / 140) * (0.2395-(0.2395)));
            zz = -2.2615 + (((tickAnim - 40) / 140) * (-2.2615-(-2.2615)));
        }
        else if (tickAnim >= 180 && tickAnim < 200) {
            xx = -5.2447 + (((tickAnim - 180) / 20) * (0-(-5.2447)));
            yy = 0.2395 + (((tickAnim - 180) / 20) * (0-(0.2395)));
            zz = -2.2615 + (((tickAnim - 180) / 20) * (0-(-2.2615)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-6.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -6.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10 + (((tickAnim - 30) / 10) * (-0.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*-30-(-6.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -0.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*-30 + (((tickAnim - 40) / 8) * (0-(-0.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*-30)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 48) / 14) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*0.5-(0)));
            yy = 0 + (((tickAnim - 48) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 14) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 75) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*0.5 + (((tickAnim - 62) / 13) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*0.5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*0.5)));
            yy = 0 + (((tickAnim - 62) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 13) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*0.5 + (((tickAnim - 75) / 20) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*0.5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*0.5)));
            yy = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 20) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 114) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*0.5 + (((tickAnim - 95) / 19) * (40.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*0.5)));
            yy = 0 + (((tickAnim - 95) / 19) * (4.5875-(0)));
            zz = 0 + (((tickAnim - 95) / 19) * (-1.5377-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 115) {
            xx = 40.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 114) / 1) * (-7.9106-(40.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 4.5875 + (((tickAnim - 114) / 1) * (4.5875-(4.5875)));
            zz = -1.5377 + (((tickAnim - 114) / 1) * (-1.5377-(-1.5377)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = -7.9106 + (((tickAnim - 115) / 10) * (-8.2106-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*0.5-(-7.9106)));
            yy = 4.5875 + (((tickAnim - 115) / 10) * (4.5875-(4.5875)));
            zz = -1.5377 + (((tickAnim - 115) / 10) * (-1.5377-(-1.5377)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -8.2106-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*0.5 + (((tickAnim - 125) / 15) * (-7.9106-(-8.2106-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*0.5)));
            yy = 4.5875 + (((tickAnim - 125) / 15) * (4.5875-(4.5875)));
            zz = -1.5377 + (((tickAnim - 125) / 15) * (-1.5377-(-1.5377)));
        }
        else if (tickAnim >= 140 && tickAnim < 142) {
            xx = -7.9106 + (((tickAnim - 140) / 2) * (-7.9106-(-7.9106)));
            yy = 4.5875 + (((tickAnim - 140) / 2) * (4.5875-(4.5875)));
            zz = -1.5377 + (((tickAnim - 140) / 2) * (-1.5377-(-1.5377)));
        }
        else if (tickAnim >= 142 && tickAnim < 151) {
            xx = -7.9106 + (((tickAnim - 142) / 9) * (-8.2106-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*0.5-(-7.9106)));
            yy = 4.5875 + (((tickAnim - 142) / 9) * (4.5875-(4.5875)));
            zz = -1.5377 + (((tickAnim - 142) / 9) * (-1.5377-(-1.5377)));
        }
        else if (tickAnim >= 151 && tickAnim < 163) {
            xx = -8.2106-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*0.5 + (((tickAnim - 151) / 12) * (-7.9106-(-8.2106-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*0.5)));
            yy = 4.5875 + (((tickAnim - 151) / 12) * (4.5875-(4.5875)));
            zz = -1.5377 + (((tickAnim - 151) / 12) * (-1.5377-(-1.5377)));
        }
        else if (tickAnim >= 163 && tickAnim < 180) {
            xx = -7.9106 + (((tickAnim - 163) / 17) * (-7.9106-(-7.9106)));
            yy = 4.5875 + (((tickAnim - 163) / 17) * (4.5875-(4.5875)));
            zz = -1.5377 + (((tickAnim - 163) / 17) * (-1.5377-(-1.5377)));
        }
        else if (tickAnim >= 180 && tickAnim < 200) {
            xx = -7.9106 + (((tickAnim - 180) / 20) * (0-(-7.9106)));
            yy = 4.5875 + (((tickAnim - 180) / 20) * (0-(4.5875)));
            zz = -1.5377 + (((tickAnim - 180) / 20) * (0-(-1.5377)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (19.25-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 19.25 + (((tickAnim - 35) / 6) * (0-(19.25)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 48) / 14) * (2.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*2-(0)));
            yy = 0 + (((tickAnim - 48) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 14) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 75) {
            xx = 2.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*2 + (((tickAnim - 62) / 13) * (2.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*2-(2.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*2)));
            yy = 0 + (((tickAnim - 62) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 13) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 2.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*2 + (((tickAnim - 75) / 20) * (2.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*2-(2.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*2)));
            yy = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 20) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 2.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*2 + (((tickAnim - 95) / 10) * (0-(2.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*2)));
            yy = 0 + (((tickAnim - 95) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 10) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (17.5226-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (1.2556-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-9.2221-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = 17.5226 + (((tickAnim - 40) / 140) * (17.5226-(17.5226)));
            yy = 1.2556 + (((tickAnim - 40) / 140) * (1.2556-(1.2556)));
            zz = -9.2221 + (((tickAnim - 40) / 140) * (-9.2221-(-9.2221)));
        }
        else if (tickAnim >= 180 && tickAnim < 200) {
            xx = 17.5226 + (((tickAnim - 180) / 20) * (0-(17.5226)));
            yy = 1.2556 + (((tickAnim - 180) / 20) * (0-(1.2556)));
            zz = -9.2221 + (((tickAnim - 180) / 20) * (0-(-9.2221)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-7.1831-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (1.8072-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (8.725-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = -7.1831 + (((tickAnim - 40) / 140) * (-7.1831-(-7.1831)));
            yy = 1.8072 + (((tickAnim - 40) / 140) * (1.8072-(1.8072)));
            zz = 8.725 + (((tickAnim - 40) / 140) * (8.725-(8.725)));
        }
        else if (tickAnim >= 180 && tickAnim < 200) {
            xx = -7.1831 + (((tickAnim - 180) / 20) * (0-(-7.1831)));
            yy = 1.8072 + (((tickAnim - 180) / 20) * (0-(1.8072)));
            zz = 8.725 + (((tickAnim - 180) / 20) * (0-(8.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (10.2339-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (9.4969-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.6259-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = 10.2339 + (((tickAnim - 40) / 140) * (10.2339-(10.2339)));
            yy = 9.4969 + (((tickAnim - 40) / 140) * (9.4969-(9.4969)));
            zz = 0.6259 + (((tickAnim - 40) / 140) * (0.6259-(0.6259)));
        }
        else if (tickAnim >= 180 && tickAnim < 200) {
            xx = 10.2339 + (((tickAnim - 180) / 20) * (0-(10.2339)));
            yy = 9.4969 + (((tickAnim - 180) / 20) * (0-(9.4969)));
            zz = 0.6259 + (((tickAnim - 180) / 20) * (0-(0.6259)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 113 && tickAnim < 118) {
            xx = 1 + (((tickAnim - 113) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 113) / 5) * (0.085-(1)));
            zz = 1 + (((tickAnim - 113) / 5) * (1-(1)));
        }
        else if (tickAnim >= 118 && tickAnim < 124) {
            xx = 1 + (((tickAnim - 118) / 6) * (1-(1)));
            yy = 0.085 + (((tickAnim - 118) / 6) * (1-(0.085)));
            zz = 1 + (((tickAnim - 118) / 6) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStruthiocephalus entity = (EntityPrehistoricFloraStruthiocephalus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = -5 + (((tickAnim - 19) / 7) * (-5-(-5)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 26) / 24) * (0-(-5)));
            yy = 0 + (((tickAnim - 26) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            yy = -0.85 + (((tickAnim - 19) / 7) * (-0.85-(-0.85)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 26) / 24) * (0-(0)));
            yy = -0.85 + (((tickAnim - 26) / 24) * (0-(-0.85)));
            zz = 0 + (((tickAnim - 26) / 24) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 19) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 10.25 + (((tickAnim - 19) / 7) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 26) / 24) * (0-(10.25)));
            yy = 0 + (((tickAnim - 26) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 9.75 + (((tickAnim - 19) / 7) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = 9.75 + (((tickAnim - 26) / 24) * (0-(9.75)));
            yy = 0 + (((tickAnim - 26) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            yy = 0.375 + (((tickAnim - 19) / 7) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 26) / 24) * (0-(0)));
            yy = 0.375 + (((tickAnim - 26) / 24) * (0-(0.375)));
            zz = 0 + (((tickAnim - 26) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-10.4582-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-9.4918-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0.6156-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = -10.4582 + (((tickAnim - 19) / 7) * (-10.4582-(-10.4582)));
            yy = -9.4918 + (((tickAnim - 19) / 7) * (-9.4918-(-9.4918)));
            zz = 0.6156 + (((tickAnim - 19) / 7) * (0.6156-(0.6156)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = -10.4582 + (((tickAnim - 26) / 24) * (0-(-10.4582)));
            yy = -9.4918 + (((tickAnim - 26) / 24) * (0-(-9.4918)));
            zz = 0.6156 + (((tickAnim - 26) / 24) * (0-(0.6156)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 24.5 + (((tickAnim - 19) / 7) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = 24.5 + (((tickAnim - 26) / 24) * (0-(24.5)));
            yy = 0 + (((tickAnim - 26) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = -5.25 + (((tickAnim - 19) / 7) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = -5.25 + (((tickAnim - 26) / 24) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 26) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 2 + (((tickAnim - 19) / 7) * (2-(2)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = 2 + (((tickAnim - 26) / 24) * (0-(2)));
            yy = 0 + (((tickAnim - 26) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = -5 + (((tickAnim - 19) / 7) * (-5-(-5)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 26) / 24) * (0-(-5)));
            yy = 0 + (((tickAnim - 26) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 7.75 + (((tickAnim - 19) / 7) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = 7.75 + (((tickAnim - 26) / 24) * (0-(7.75)));
            yy = 0 + (((tickAnim - 26) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = -8 + (((tickAnim - 19) / 7) * (-8-(-8)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 26) / 24) * (0-(-8)));
            yy = 0 + (((tickAnim - 26) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 2 + (((tickAnim - 19) / 7) * (2-(2)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = 2 + (((tickAnim - 26) / 24) * (0-(2)));
            yy = 0 + (((tickAnim - 26) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = -5 + (((tickAnim - 19) / 7) * (-5-(-5)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 26) / 24) * (0-(-5)));
            yy = 0 + (((tickAnim - 26) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 7.75 + (((tickAnim - 19) / 7) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = 7.75 + (((tickAnim - 26) / 24) * (0-(7.75)));
            yy = 0 + (((tickAnim - 26) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-10.4582-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (9.4918-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-0.6156-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = -10.4582 + (((tickAnim - 19) / 7) * (-10.4582-(-10.4582)));
            yy = 9.4918 + (((tickAnim - 19) / 7) * (9.4918-(9.4918)));
            zz = -0.6156 + (((tickAnim - 19) / 7) * (-0.6156-(-0.6156)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = -10.4582 + (((tickAnim - 26) / 24) * (0-(-10.4582)));
            yy = 9.4918 + (((tickAnim - 26) / 24) * (0-(9.4918)));
            zz = -0.6156 + (((tickAnim - 26) / 24) * (0-(-0.6156)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 18.75 + (((tickAnim - 19) / 7) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 50) {
            xx = 18.75 + (((tickAnim - 26) / 24) * (0-(18.75)));
            yy = 0 + (((tickAnim - 26) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStruthiocephalus entity = (EntityPrehistoricFloraStruthiocephalus) entitylivingbaseIn;
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
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




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

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStruthiocephalus entity = (EntityPrehistoricFloraStruthiocephalus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*3 + (((tickAnim - 0) / 40) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*3)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -4.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-120))*5 + (((tickAnim - 0) / 40) * (0-(-4.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-120))*5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250)) + (((tickAnim - 0) / 18) * (19.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-20-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250)))));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 19.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-20 + (((tickAnim - 18) / 22) * (0-(19.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-20)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStruthiocephalus entity = (EntityPrehistoricFloraStruthiocephalus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
            xx = 0 + (((tickAnim - 0) / 10) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 6.25 + (((tickAnim - 10) / 10) * (0-(6.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12.75 + (((tickAnim - 10) / 10) * (0-(12.75)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-18.3392-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1.667-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-32.7504-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.3392 + (((tickAnim - 10) / 10) * (0-(-18.3392)));
            yy = -1.667 + (((tickAnim - 10) / 10) * (0-(-1.667)));
            zz = -32.7504 + (((tickAnim - 10) / 10) * (0-(-32.7504)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10.9044-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (5.5577-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (14.9746-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10.9044 + (((tickAnim - 10) / 10) * (0-(-10.9044)));
            yy = 5.5577 + (((tickAnim - 10) / 10) * (0-(5.5577)));
            zz = 14.9746 + (((tickAnim - 10) / 10) * (0-(14.9746)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (10.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 10.5 + (((tickAnim - 10) / 10) * (0-(10.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12.5 + (((tickAnim - 10) / 10) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 17.75 + (((tickAnim - 7) / 3) * (0-(17.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
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
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-18.3392-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.667-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (32.7504-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.3392 + (((tickAnim - 10) / 10) * (0-(-18.3392)));
            yy = 1.667 + (((tickAnim - 10) / 10) * (0-(1.667)));
            zz = 32.7504 + (((tickAnim - 10) / 10) * (0-(32.7504)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10.9044-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5.5577-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-14.9746-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10.9044 + (((tickAnim - 10) / 10) * (0-(-10.9044)));
            yy = -5.5577 + (((tickAnim - 10) / 10) * (0-(-5.5577)));
            zz = -14.9746 + (((tickAnim - 10) / 10) * (0-(-14.9746)));
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
            zz = 0 + (((tickAnim - 0) / 10) * (-10.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -10.5 + (((tickAnim - 10) / 10) * (0-(-10.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStruthiocephalus entity = (EntityPrehistoricFloraStruthiocephalus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250)) + (((tickAnim - 0) / 40) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250)))));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 100) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-2 + (((tickAnim - 0) / 39) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-2)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 39) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 1) * (0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-1-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-1 + (((tickAnim - 40) / 25) * (0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-1-(0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-1)));
        }
        else if (tickAnim >= 65 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 65) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 22) * (0-(0)));
            zz = 0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-1 + (((tickAnim - 65) / 22) * (0.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-1-(0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-1)));
        }
        else if (tickAnim >= 87 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 87) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 87) / 1) * (0-(0)));
            zz = 0.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-1 + (((tickAnim - 87) / 1) * (0-(0.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-1)));
        }
        else if (tickAnim >= 88 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 88) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 72) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*5 + (((tickAnim - 0) / 39) * (12.999-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*5)));
            yy = 0 + (((tickAnim - 0) / 39) * (0.0307-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*2 + (((tickAnim - 0) / 39) * (-3.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*2)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 12.999 + (((tickAnim - 39) / 1) * (12.999-(12.999)));
            yy = 0.0307 + (((tickAnim - 39) / 1) * (0.0307-(0.0307)));
            zz = -3.5 + (((tickAnim - 39) / 1) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*2-(-3.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 79) {
            xx = 12.999 + (((tickAnim - 40) / 39) * (12.999-(12.999)));
            yy = 0.0307 + (((tickAnim - 40) / 39) * (0.0307-(0.0307)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*2 + (((tickAnim - 40) / 39) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*2-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*2)));
        }
        else if (tickAnim >= 79 && tickAnim < 80) {
            xx = 12.999 + (((tickAnim - 79) / 1) * (11.724-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*10-(12.999)));
            yy = 0.0307 + (((tickAnim - 79) / 1) * (0.0307-(0.0307)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*2 + (((tickAnim - 79) / 1) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*2)));
        }
        else if (tickAnim >= 80 && tickAnim < 117) {
            xx = 11.724-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*10 + (((tickAnim - 80) / 37) * (0-(11.724-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*10)));
            yy = 0.0307 + (((tickAnim - 80) / 37) * (0-(0.0307)));
            zz = 0 + (((tickAnim - 80) / 37) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 117) / 1) * (8.775-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*10-(0)));
            yy = 0 + (((tickAnim - 117) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 1) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 140) {
            xx = 8.775-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*10 + (((tickAnim - 118) / 22) * (12.999-(8.775-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*10)));
            yy = 0 + (((tickAnim - 118) / 22) * (0.0307-(0)));
            zz = 0 + (((tickAnim - 118) / 22) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 12.999 + (((tickAnim - 140) / 20) * (0-(12.999)));
            yy = 0.0307 + (((tickAnim - 140) / 20) * (0-(0.0307)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 0.6 + (((tickAnim - 40) / 40) * (0.6-(0.6)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 80) / 38) * (0-(0)));
            yy = 0.6 + (((tickAnim - 80) / 38) * (0.6-(0.6)));
            zz = 0 + (((tickAnim - 80) / 38) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 118) / 42) * (0-(0)));
            yy = 0.6 + (((tickAnim - 118) / 42) * (0-(0.6)));
            zz = 0 + (((tickAnim - 118) / 42) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*2 + (((tickAnim - 0) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*2)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (-0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*1.5-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 41) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 46) * (0-(0)));
            zz = -0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*1.5 + (((tickAnim - 41) / 46) * (-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*1.5-(-0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*1.5)));
        }
        else if (tickAnim >= 87 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 87) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 87) / 1) * (0-(0)));
            zz = -0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*1.5 + (((tickAnim - 87) / 1) * (0-(-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*1.5)));
        }
        else if (tickAnim >= 88 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 88) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 72) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-3 + (((tickAnim - 0) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-3)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(0);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(0);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -2.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*3 + (((tickAnim - 0) / 40) * (0-(-2.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*3)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 40) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 39) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 79) / 1) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-10-(0)));
            yy = 0 + (((tickAnim - 79) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 1) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 117) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-10 + (((tickAnim - 80) / 37) * (-20.25-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-10)));
            yy = 0 + (((tickAnim - 80) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 37) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 118) {
            xx = -20.25 + (((tickAnim - 117) / 1) * (-10.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*10-(-20.25)));
            yy = 0 + (((tickAnim - 117) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 1) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 140) {
            xx = -10.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*10 + (((tickAnim - 118) / 22) * (0-(-10.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*10)));
            yy = 0 + (((tickAnim - 118) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 22) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-5 + (((tickAnim - 0) / 20) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 40) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 39) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 79) / 38) * (28.25-(0)));
            yy = 0 + (((tickAnim - 79) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 38) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 28.25 + (((tickAnim - 117) / 11) * (0-(28.25)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 128) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 128) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-2 + (((tickAnim - 0) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-2)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (-0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*1.5-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 41) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 46) * (0-(0)));
            zz = -0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*1.5 + (((tickAnim - 41) / 46) * (-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*1.5-(-0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*1.5)));
        }
        else if (tickAnim >= 87 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 87) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 87) / 1) * (0-(0)));
            zz = -0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*1.5 + (((tickAnim - 87) / 1) * (0-(-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*1.5)));
        }
        else if (tickAnim >= 88 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 88) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 72) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*3 + (((tickAnim - 0) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*3)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);

    }
    public void animYawn(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStruthiocephalus entity = (EntityPrehistoricFloraStruthiocephalus) entitylivingbaseIn;
        int animCycle = 49;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-6.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -6.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 23) / 7) * (-2.25-(-6.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 49) {
            xx = -2.25 + (((tickAnim - 30) / 19) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 30) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 49) {
            xx = 0.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*10 + (((tickAnim - 23) / 26) * (0-(0.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*10)));
            yy = 0 + (((tickAnim - 23) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (22.67-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 22.67 + (((tickAnim - 18) / 12) * (30.25-(22.67)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 30.25 + (((tickAnim - 30) / 10) * (0-(30.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 15) * (0.07-(1)));
            zz = 1 + (((tickAnim - 0) / 15) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 15) / 15) * (1-(1)));
            yy = 0.07 + (((tickAnim - 15) / 15) * (0.0525-(0.07)));
            zz = 1 + (((tickAnim - 15) / 15) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 0.0525 + (((tickAnim - 30) / 10) * (1-(0.0525)));
            zz = 1 + (((tickAnim - 30) / 10) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 1 + (((tickAnim - 40) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 9) * (1-(1)));
            zz = 1 + (((tickAnim - 40) / 9) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraStruthiocephalus entity = (EntityPrehistoricFloraStruthiocephalus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*0.7), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*1), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-0.15);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*0.3);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-1.3), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-1.5), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-1));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*0.75), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*1.5), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*1.5));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-80))*1), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-160))*2), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-220))*4), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*6));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*-1.2), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-1.5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*-1.5));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 4.5 + (((tickAnim - 0) / 13) * (27.0183-(4.5)));
            yy = -5.525 + (((tickAnim - 0) / 13) * (-9.7477-(-5.525)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.2147-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 27.0183 + (((tickAnim - 13) / 7) * (-14.8144-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-62.6))*100-(27.0183)));
            yy = -9.7477 + (((tickAnim - 13) / 7) * (-7.3036-(-9.7477)));
            zz = -0.2147 + (((tickAnim - 13) / 7) * (-13.4309-(-0.2147)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -14.8144-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-62.6))*100 + (((tickAnim - 20) / 8) * (-16.8226-(-14.8144-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-62.6))*100)));
            yy = -7.3036 + (((tickAnim - 20) / 8) * (-3.9065-(-7.3036)));
            zz = -13.4309 + (((tickAnim - 20) / 8) * (-5.1992-(-13.4309)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -16.8226 + (((tickAnim - 28) / 12) * (4.5-(-16.8226)));
            yy = -3.9065 + (((tickAnim - 28) / 12) * (-5.525-(-3.9065)));
            zz = -5.1992 + (((tickAnim - 28) / 12) * (0-(-5.1992)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 12.4637 + (((tickAnim - 0) / 13) * (25.8052-(12.4637)));
            yy = -3.7624 + (((tickAnim - 0) / 13) * (-7.6139-(-3.7624)));
            zz = -6.4787 + (((tickAnim - 0) / 13) * (-6.5026-(-6.4787)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 25.8052 + (((tickAnim - 13) / 7) * (-58.4427-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*120-(25.8052)));
            yy = -7.6139 + (((tickAnim - 13) / 7) * (-8.7495-(-7.6139)));
            zz = -6.5026 + (((tickAnim - 13) / 7) * (-9.392-(-6.5026)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -58.4427-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*120 + (((tickAnim - 20) / 8) * (2.5968-(-58.4427-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*120)));
            yy = -8.7495 + (((tickAnim - 20) / 8) * (-8.6143-(-8.7495)));
            zz = -9.392 + (((tickAnim - 20) / 8) * (-1.0057-(-9.392)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 2.5968 + (((tickAnim - 28) / 12) * (12.4637-(2.5968)));
            yy = -8.6143 + (((tickAnim - 28) / 12) * (-3.7624-(-8.6143)));
            zz = -1.0057 + (((tickAnim - 28) / 12) * (-6.4787-(-1.0057)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 15) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = -0.475 + (((tickAnim - 28) / 12) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -13.4635 + (((tickAnim - 0) / 13) * (31-(-13.4635)));
            yy = 1.0524 + (((tickAnim - 0) / 13) * (0-(1.0524)));
            zz = 6.3555 + (((tickAnim - 0) / 13) * (0-(6.3555)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 31 + (((tickAnim - 13) / 7) * (18.75-(31)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 18.75 + (((tickAnim - 20) / 8) * (14.75-(18.75)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 14.75 + (((tickAnim - 28) / 12) * (-13.4635-(14.75)));
            yy = 0 + (((tickAnim - 28) / 12) * (1.0524-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (6.3555-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.675 + (((tickAnim - 0) / 13) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (-1.075-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = -1.075 + (((tickAnim - 28) / 12) * (-0.675-(-1.075)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = -25.9469 + (((tickAnim - 0) / 24) * (28.75-(-25.9469)));
            yy = 1.3336 + (((tickAnim - 0) / 24) * (0-(1.3336)));
            zz = 9.9155 + (((tickAnim - 0) / 24) * (0-(9.9155)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 28.75 + (((tickAnim - 24) / 9) * (171.2104-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*200-(28.75)));
            yy = 0 + (((tickAnim - 24) / 9) * (4.356-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (134.69+Math.sin((Math.PI/180)*(((double)tickAnim/20)*75-15))*-150-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 171.2104-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*200 + (((tickAnim - 33) / 7) * (-25.9469-(171.2104-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*200)));
            yy = 4.356 + (((tickAnim - 33) / 7) * (1.3336-(4.356)));
            zz = 134.69+Math.sin((Math.PI/180)*(((double)tickAnim/20)*75-15))*-150 + (((tickAnim - 33) / 7) * (9.9155-(134.69+Math.sin((Math.PI/180)*(((double)tickAnim/20)*75-15))*-150)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -11.5829 + (((tickAnim - 0) / 8) * (-10.1669-(-11.5829)));
            yy = -14.8567 + (((tickAnim - 0) / 8) * (-10.7817-(-14.8567)));
            zz = -14.4192 + (((tickAnim - 0) / 8) * (-3.3755-(-14.4192)));
        }
        else if (tickAnim >= 8 && tickAnim < 24) {
            xx = -10.1669 + (((tickAnim - 8) / 16) * (12.025-(-10.1669)));
            yy = -10.7817 + (((tickAnim - 8) / 16) * (0-(-10.7817)));
            zz = -3.3755 + (((tickAnim - 8) / 16) * (0-(-3.3755)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 12.025 + (((tickAnim - 24) / 9) * (31.5626-Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-60-(12.025)));
            yy = 0 + (((tickAnim - 24) / 9) * (-13.6335-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (307.7892+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 31.5626-Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-60 + (((tickAnim - 33) / 7) * (-11.5829-(31.5626-Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*-60)));
            yy = -13.6335 + (((tickAnim - 33) / 7) * (-14.8567-(-13.6335)));
            zz = 307.7892+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 33) / 7) * (-14.4192-(307.7892+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.55 + (((tickAnim - 0) / 8) * (-0.2-(-0.55)));
            yy = -0.025 + (((tickAnim - 0) / 8) * (0.275-(-0.025)));
            zz = -0.25 + (((tickAnim - 0) / 8) * (0-(-0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 24) {
            xx = -0.2 + (((tickAnim - 8) / 16) * (0-(-0.2)));
            yy = 0.275 + (((tickAnim - 8) / 16) * (0-(0.275)));
            zz = 0 + (((tickAnim - 8) / 16) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (-0.65-(0)));
            yy = 0 + (((tickAnim - 24) / 9) * (0.25-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -0.65 + (((tickAnim - 33) / 7) * (-0.55-(-0.65)));
            yy = 0.25 + (((tickAnim - 33) / 7) * (-0.025-(0.25)));
            zz = 0 + (((tickAnim - 33) / 7) * (-0.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 27.158 + (((tickAnim - 0) / 8) * (11.4547-(27.158)));
            yy = -8.0221 + (((tickAnim - 0) / 8) * (-1.8687-(-8.0221)));
            zz = 0.5019 + (((tickAnim - 0) / 8) * (-1.0988-(0.5019)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 11.4547 + (((tickAnim - 8) / 7) * (-7.5-(11.4547)));
            yy = -1.8687 + (((tickAnim - 8) / 7) * (0-(-1.8687)));
            zz = -1.0988 + (((tickAnim - 8) / 7) * (-2.5-(-1.0988)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -7.5 + (((tickAnim - 15) / 9) * (63-(-7.5)));
            yy = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            zz = -2.5 + (((tickAnim - 15) / 9) * (0-(-2.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 63 + (((tickAnim - 24) / 4) * (108.53-(63)));
            yy = 0 + (((tickAnim - 24) / 4) * (-2.2283-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0.1394-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 108.53 + (((tickAnim - 28) / 5) * (95.31-(108.53)));
            yy = -2.2283 + (((tickAnim - 28) / 5) * (-4.4567-(-2.2283)));
            zz = 0.1394 + (((tickAnim - 28) / 5) * (0.2788-(0.1394)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 95.31 + (((tickAnim - 33) / 4) * (35.734-(95.31)));
            yy = -4.4567 + (((tickAnim - 33) / 4) * (-6.2394-(-4.4567)));
            zz = 0.2788 + (((tickAnim - 33) / 4) * (0.3903-(0.2788)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 35.734 + (((tickAnim - 37) / 3) * (27.158-(35.734)));
            yy = -6.2394 + (((tickAnim - 37) / 3) * (-8.0221-(-6.2394)));
            zz = 0.3903 + (((tickAnim - 37) / 3) * (0.5019-(0.3903)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2 + (((tickAnim - 0) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            yy = -0.35 + (((tickAnim - 15) / 9) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (-0.725-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 4) * (0.55-(0)));
            zz = -0.725 + (((tickAnim - 33) / 4) * (-0.27-(-0.725)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0.55 + (((tickAnim - 37) / 3) * (0-(0.55)));
            zz = -0.27 + (((tickAnim - 37) / 3) * (0-(-0.27)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-180))*-0.75), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 18.1346 + (((tickAnim - 0) / 5) * (28.75-(18.1346)));
            yy = 2.4848 + (((tickAnim - 0) / 5) * (4.6-(2.4848)));
            zz = -5.4617 + (((tickAnim - 0) / 5) * (0-(-5.4617)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 28.75 + (((tickAnim - 5) / 8) * (24.9354-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*100-(28.75)));
            yy = 4.6 + (((tickAnim - 5) / 8) * (4.356-(4.6)));
            zz = 0 + (((tickAnim - 5) / 8) * (-238.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-130))*-250-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 24.9354-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*100 + (((tickAnim - 13) / 8) * (-25.9469-(24.9354-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*100)));
            yy = 4.356 + (((tickAnim - 13) / 8) * (-1.3336-(4.356)));
            zz = -238.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-130))*-250 + (((tickAnim - 13) / 8) * (-9.9155-(-238.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-130))*-250)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -25.9469 + (((tickAnim - 21) / 19) * (18.1346-(-25.9469)));
            yy = -1.3336 + (((tickAnim - 21) / 19) * (2.4848-(-1.3336)));
            zz = -9.9155 + (((tickAnim - 21) / 19) * (-5.4617-(-9.9155)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.75 + (((tickAnim - 0) / 5) * (12.025-(0.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 5.75 + (((tickAnim - 0) / 5) * (0-(5.75)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 12.025 + (((tickAnim - 5) / 8) * (4.9344-Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-130))*30-(12.025)));
            yy = 0 + (((tickAnim - 5) / 8) * (18.1749-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (-57.2168+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 4.9344-Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-130))*30 + (((tickAnim - 13) / 8) * (-10.7841-(4.9344-Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-130))*30)));
            yy = 18.1749 + (((tickAnim - 13) / 8) * (20.1238-(18.1749)));
            zz = -57.2168+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 13) / 8) * (5.4524-(-57.2168+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -10.7841 + (((tickAnim - 21) / 19) * (0.75-(-10.7841)));
            yy = 20.1238 + (((tickAnim - 21) / 19) * (0-(20.1238)));
            zz = 5.4524 + (((tickAnim - 21) / 19) * (5.75-(5.4524)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0.65-(0)));
            yy = 0 + (((tickAnim - 5) / 8) * (0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0.65 + (((tickAnim - 13) / 8) * (0.55-(0.65)));
            yy = 0.25 + (((tickAnim - 13) / 8) * (0.025-(0.25)));
            zz = 0 + (((tickAnim - 13) / 8) * (-0.25-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0.55 + (((tickAnim - 21) / 19) * (0-(0.55)));
            yy = 0.025 + (((tickAnim - 21) / 19) * (0-(0.025)));
            zz = -0.25 + (((tickAnim - 21) / 19) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 27 + (((tickAnim - 0) / 5) * (47.75-(27)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 47.75 + (((tickAnim - 5) / 4) * (108.53-(47.75)));
            yy = 0 + (((tickAnim - 5) / 4) * (-2.2283-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0.1394-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 108.53 + (((tickAnim - 9) / 4) * (95.31-(108.53)));
            yy = -2.2283 + (((tickAnim - 9) / 4) * (-4.4567-(-2.2283)));
            zz = 0.1394 + (((tickAnim - 9) / 4) * (0.2788-(0.1394)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 95.31 + (((tickAnim - 13) / 5) * (35.734-(95.31)));
            yy = -4.4567 + (((tickAnim - 13) / 5) * (-6.2394-(-4.4567)));
            zz = 0.2788 + (((tickAnim - 13) / 5) * (0.3903-(0.2788)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 35.734 + (((tickAnim - 18) / 3) * (27.158-(35.734)));
            yy = -6.2394 + (((tickAnim - 18) / 3) * (-8.0221-(-6.2394)));
            zz = 0.3903 + (((tickAnim - 18) / 3) * (0.5019-(0.3903)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 27.158 + (((tickAnim - 21) / 4) * (17.1889-(27.158)));
            yy = -8.0221 + (((tickAnim - 21) / 4) * (-6.2782-(-8.0221)));
            zz = 0.5019 + (((tickAnim - 21) / 4) * (0.3928-(0.5019)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 17.1889 + (((tickAnim - 25) / 5) * (10.6259-(17.1889)));
            yy = -6.2782 + (((tickAnim - 25) / 5) * (-4.1855-(-6.2782)));
            zz = 0.3928 + (((tickAnim - 25) / 5) * (0.2619-(0.3928)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10.6259 + (((tickAnim - 30) / 10) * (27-(10.6259)));
            yy = -4.1855 + (((tickAnim - 30) / 10) * (0-(-4.1855)));
            zz = 0.2619 + (((tickAnim - 30) / 10) * (0-(0.2619)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.75 + (((tickAnim - 0) / 5) * (0-(0.75)));
            zz = 0.35 + (((tickAnim - 0) / 5) * (0-(0.35)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (-0.725-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.55-(0)));
            zz = -0.725 + (((tickAnim - 13) / 5) * (-0.27-(-0.725)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.55 + (((tickAnim - 18) / 3) * (0.3-(0.55)));
            zz = -0.27 + (((tickAnim - 18) / 3) * (0-(-0.27)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.3 + (((tickAnim - 21) / 4) * (0.5-(0.3)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 25) / 5) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.5 + (((tickAnim - 30) / 10) * (0.75-(0.5)));
            zz = 0 + (((tickAnim - 30) / 10) * (0.35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 8.7856-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 0) / 9) * (-16.8226-(8.7856-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 7.3036 + (((tickAnim - 0) / 9) * (3.9065-(7.3036)));
            zz = 13.4309+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30 + (((tickAnim - 0) / 9) * (5.1992-(13.4309+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30)));
        }
        else if (tickAnim >= 9 && tickAnim < 33) {
            xx = -16.8226 + (((tickAnim - 9) / 24) * (27.0183-(-16.8226)));
            yy = 3.9065 + (((tickAnim - 9) / 24) * (9.7477-(3.9065)));
            zz = 5.1992 + (((tickAnim - 9) / 24) * (0.2147-(5.1992)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 27.0183 + (((tickAnim - 33) / 7) * (115.3356-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50.5))*140-(27.0183)));
            yy = 9.7477 + (((tickAnim - 33) / 7) * (7.3036-(9.7477)));
            zz = 0.2147 + (((tickAnim - 33) / 7) * (50.8559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-51.5))*-50-(0.2147)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 25.6098-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80 + (((tickAnim - 0) / 9) * (2.5968-(25.6098-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80)));
            yy = 7.1159 + (((tickAnim - 0) / 9) * (8.6143-(7.1159)));
            zz = 7.4315 + (((tickAnim - 0) / 9) * (-1.0057-(7.4315)));
        }
        else if (tickAnim >= 9 && tickAnim < 33) {
            xx = 2.5968 + (((tickAnim - 9) / 24) * (26.0596-(2.5968)));
            yy = 8.6143 + (((tickAnim - 9) / 24) * (8.8105-(8.6143)));
            zz = -1.0057 + (((tickAnim - 9) / 24) * (7.8048-(-1.0057)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 26.0596 + (((tickAnim - 33) / 7) * (25.6098-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*80-(26.0596)));
            yy = 8.8105 + (((tickAnim - 33) / 7) * (7.1159-(8.8105)));
            zz = 7.8048 + (((tickAnim - 33) / 7) * (7.4315-(7.8048)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 9) / 31) * (0-(0)));
            yy = -0.475 + (((tickAnim - 9) / 31) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 9) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 18.75 + (((tickAnim - 0) / 9) * (14.7311-(18.75)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.7424-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-3.4204-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 14.7311 + (((tickAnim - 9) / 8) * (-5-(14.7311)));
            yy = 0.7424 + (((tickAnim - 9) / 8) * (0-(0.7424)));
            zz = -3.4204 + (((tickAnim - 9) / 8) * (0-(-3.4204)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -5 + (((tickAnim - 17) / 5) * (-16.75-(-5)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = -16.75 + (((tickAnim - 22) / 11) * (31-(-16.75)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 31 + (((tickAnim - 33) / 7) * (18.75-(31)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 9) / 13) * (0-(0)));
            yy = -0.975 + (((tickAnim - 9) / 13) * (-0.78-(-0.975)));
            zz = 0 + (((tickAnim - 9) / 13) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = -0.78 + (((tickAnim - 22) / 11) * (0-(-0.78)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
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
        EntityPrehistoricFloraStruthiocephalus entity = (EntityPrehistoricFloraStruthiocephalus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-30))*2.5), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*3), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-4));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.2);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*0.5);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*-2), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*-3), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*3));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-130))*3), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*4), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-4));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*2), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*6), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-8));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*8), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-12), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-12));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-6.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-130))*3), neck.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-1), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*1));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -13.8461 + (((tickAnim - 0) / 10) * (26-(-13.8461)));
            yy = -7.7032 + (((tickAnim - 0) / 10) * (0-(-7.7032)));
            zz = 5.1365 + (((tickAnim - 0) / 10) * (0-(5.1365)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 26 + (((tickAnim - 10) / 5) * (101.5544-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(26)));
            yy = 0 + (((tickAnim - 10) / 5) * (-5.9069-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-5.9684-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 101.5544-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 15) / 5) * (-13.8461-(101.5544-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = -5.9069 + (((tickAnim - 15) / 5) * (-7.7032-(-5.9069)));
            zz = -5.9684 + (((tickAnim - 15) / 5) * (5.1365-(-5.9684)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20.5151-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-11.6894-(0)));
            zz = -7.25 + (((tickAnim - 0) / 10) * (-9.5216-(-7.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 20.5151 + (((tickAnim - 10) / 5) * (133.4396-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(20.5151)));
            yy = -11.6894 + (((tickAnim - 10) / 5) * (-7.8154-(-11.6894)));
            zz = -9.5216 + (((tickAnim - 10) / 5) * (-12.6579-(-9.5216)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 133.4396-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 15) / 5) * (0-(133.4396-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = -7.8154 + (((tickAnim - 15) / 5) * (0-(-7.8154)));
            zz = -12.6579 + (((tickAnim - 15) / 5) * (-7.25-(-12.6579)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 10) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = 15.75 + (((tickAnim - 0) / 4) * (-8.17-(15.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -8.17 + (((tickAnim - 4) / 6) * (11.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350+50))*30-(-8.17)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350+50))*30 + (((tickAnim - 10) / 10) * (15.75-(11.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350+50))*30)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 10) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = 29.5 + (((tickAnim - 0) / 5) * (0.6518-(29.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.2894-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.3396+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.6518 + (((tickAnim - 5) / 5) * (-27.201-(0.6518)));
            yy = -0.2894 + (((tickAnim - 5) / 5) * (2.1245-(-0.2894)));
            zz = 1.3396+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50 + (((tickAnim - 5) / 5) * (7.9778-(1.3396+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -27.201 + (((tickAnim - 10) / 10) * (29.5-(-27.201)));
            yy = 2.1245 + (((tickAnim - 10) / 10) * (0-(2.1245)));
            zz = 7.9778 + (((tickAnim - 10) / 10) * (0-(7.9778)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (37.2691-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*100-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-13.971-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-42.0474+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*50-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 37.2691-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*100 + (((tickAnim - 5) / 5) * (-9.0466-(37.2691-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*100)));
            yy = -13.971 + (((tickAnim - 5) / 5) * (-16.8099-(-13.971)));
            zz = -42.0474+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*50 + (((tickAnim - 5) / 5) * (-8.9879-(-42.0474+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*50)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -9.0466 + (((tickAnim - 10) / 10) * (0-(-9.0466)));
            yy = -16.8099 + (((tickAnim - 10) / 10) * (0-(-16.8099)));
            zz = -8.9879 + (((tickAnim - 10) / 10) * (0-(-8.9879)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.685-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.545-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.685 + (((tickAnim - 5) / 5) * (-0.35-(-0.685)));
            yy = -0.545 + (((tickAnim - 5) / 5) * (-0.05-(-0.545)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.35 + (((tickAnim - 10) / 10) * (0-(-0.35)));
            yy = -0.05 + (((tickAnim - 10) / 10) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = 54.25 + (((tickAnim - 0) / 5) * (176.8395-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*150-(54.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.6329-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.2985-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 176.8395-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*150 + (((tickAnim - 5) / 5) * (26.2138-(176.8395-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*150)));
            yy = -0.6329 + (((tickAnim - 5) / 5) * (-1.4241-(-0.6329)));
            zz = 1.2985 + (((tickAnim - 5) / 5) * (2.9217-(1.2985)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 26.2138 + (((tickAnim - 10) / 4) * (2.4243-(26.2138)));
            yy = -1.4241 + (((tickAnim - 10) / 4) * (-0.7912-(-1.4241)));
            zz = 2.9217 + (((tickAnim - 10) / 4) * (1.6232-(2.9217)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 2.4243 + (((tickAnim - 14) / 6) * (54.25-(2.4243)));
            yy = -0.7912 + (((tickAnim - 14) / 6) * (0-(-0.7912)));
            zz = 1.6232 + (((tickAnim - 14) / 6) * (0-(1.6232)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.9-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.45-(0)));
            zz = -0.9 + (((tickAnim - 5) / 5) * (0-(-0.9)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -0.45 + (((tickAnim - 10) / 4) * (0.45-(-0.45)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0.45 + (((tickAnim - 14) / 6) * (0-(0.45)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -27.201 + (((tickAnim - 0) / 10) * (29.5-(-27.201)));
            yy = -2.1245 + (((tickAnim - 0) / 10) * (0-(-2.1245)));
            zz = -7.9778 + (((tickAnim - 0) / 10) * (0-(-7.9778)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 29.5 + (((tickAnim - 10) / 5) * (0.6518-(29.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.2894-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (43.7104+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*-50-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.6518 + (((tickAnim - 15) / 5) * (-27.201-(0.6518)));
            yy = 0.2894 + (((tickAnim - 15) / 5) * (-2.1245-(0.2894)));
            zz = 43.7104+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*-50 + (((tickAnim - 15) / 5) * (-7.9778-(43.7104+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*-50)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -9.0466 + (((tickAnim - 0) / 10) * (0-(-9.0466)));
            yy = 16.8099 + (((tickAnim - 0) / 10) * (0-(16.8099)));
            zz = 8.9879 + (((tickAnim - 0) / 10) * (0-(8.9879)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-53.0963-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*-150-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-1.2867-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-26.1565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*50-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -53.0963-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*-150 + (((tickAnim - 15) / 5) * (-9.0466-(-53.0963-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*-150)));
            yy = -1.2867 + (((tickAnim - 15) / 5) * (16.8099-(-1.2867)));
            zz = -26.1565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*50 + (((tickAnim - 15) / 5) * (8.9879-(-26.1565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*50)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0.35 + (((tickAnim - 0) / 10) * (0-(0.35)));
            yy = 0.05 + (((tickAnim - 0) / 10) * (0-(0.05)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0.135-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-0.37-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.135 + (((tickAnim - 15) / 5) * (0.35-(0.135)));
            yy = -0.37 + (((tickAnim - 15) / 5) * (0.05-(-0.37)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 26.2138 + (((tickAnim - 0) / 5) * (2.2319-(26.2138)));
            yy = 1.4241 + (((tickAnim - 0) / 5) * (0.7121-(1.4241)));
            zz = -2.9217 + (((tickAnim - 0) / 5) * (-1.4608-(-2.9217)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 2.2319 + (((tickAnim - 5) / 5) * (54.25-(2.2319)));
            yy = 0.7121 + (((tickAnim - 5) / 5) * (0-(0.7121)));
            zz = -1.4608 + (((tickAnim - 5) / 5) * (0-(-1.4608)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 54.25 + (((tickAnim - 10) / 5) * (-65.3355-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-150-(54.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (-0.6329-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (1.2985-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -65.3355-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-150 + (((tickAnim - 15) / 5) * (26.2138-(-65.3355-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-150)));
            yy = -0.6329 + (((tickAnim - 15) / 5) * (1.4241-(-0.6329)));
            zz = 1.2985 + (((tickAnim - 15) / 5) * (-2.9217-(1.2985)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.55 + (((tickAnim - 0) / 5) * (0.67-(-0.55)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.67 + (((tickAnim - 5) / 5) * (0-(0.67)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.9-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (-0.55-(0)));
            zz = -0.9 + (((tickAnim - 15) / 5) * (0-(-0.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 26 + (((tickAnim - 0) / 5) * (35.5294-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(26)));
            yy = 0 + (((tickAnim - 0) / 5) * (5.9069-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5.9684-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 35.5294-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 5) / 5) * (-13.8461-(35.5294-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 5.9069 + (((tickAnim - 5) / 5) * (7.7032-(5.9069)));
            zz = 5.9684 + (((tickAnim - 5) / 5) * (-5.1365-(5.9684)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -13.8461 + (((tickAnim - 10) / 10) * (26-(-13.8461)));
            yy = 7.7032 + (((tickAnim - 10) / 10) * (0-(7.7032)));
            zz = -5.1365 + (((tickAnim - 10) / 10) * (0-(-5.1365)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 20.5151 + (((tickAnim - 0) / 5) * (77.6646-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(20.5151)));
            yy = 11.6894 + (((tickAnim - 0) / 5) * (7.8154-(11.6894)));
            zz = 9.5216 + (((tickAnim - 0) / 5) * (12.6579-(9.5216)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 77.6646-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 5) / 5) * (0-(77.6646-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 7.8154 + (((tickAnim - 5) / 5) * (0-(7.8154)));
            zz = 12.6579 + (((tickAnim - 5) / 5) * (7.25-(12.6579)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (20.5151-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (11.6894-(0)));
            zz = 7.25 + (((tickAnim - 10) / 10) * (9.5216-(7.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.6 + (((tickAnim - 10) / 10) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*550+50))*-30 + (((tickAnim - 0) / 10) * (15.75-(-2.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*550+50))*-30)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 15.75 + (((tickAnim - 10) / 4) * (-8.17-(15.75)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -8.17 + (((tickAnim - 14) / 6) * (20.75-(-8.17)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.425 + (((tickAnim - 10) / 10) * (0-(-0.425)));
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


    }



    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraStruthiocephalus e = (EntityPrehistoricFloraStruthiocephalus) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
