package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEdaphosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEdaphosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer sail1;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer sail2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer sail3;
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer sail4;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;

    private ModelAnimator animator;

    public ModelEdaphosaurus() {
        this.textureWidth = 98;
        this.textureHeight = 96;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.2128F, 17.7756F, 6.3434F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0304F, -1.346F, -1.192F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 61, 0, -2.5F, -2.725F, -3.5F, 5, 7, 8, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.3507F, 0.154F, -0.375F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.1393F, 0.4149F, 0.3348F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 15, 81, 0.0F, -0.5F, -1.5F, 4, 3, 3, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(3.2102F, 0.0656F, 0.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, 1.0908F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 50, 84, 0.0F, -1.0F, -1.0F, 5, 2, 2, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(4.0551F, 0.2435F, 0.6991F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.5086F, 0.014F, 0.1829F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 84, 63, 0.0F, -1.5F, -4.0F, 1, 3, 4, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.2899F, 0.154F, -0.375F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.1393F, -0.4149F, -0.3348F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 15, 81, -4.0F, -0.5F, -1.5F, 4, 3, 3, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-3.2102F, 0.0656F, 0.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, -1.0908F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 50, 84, -5.0F, -1.0F, -1.0F, 5, 2, 2, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-4.0551F, 0.2435F, 0.6991F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.5086F, -0.014F, -0.1829F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 84, 63, -1.0F, -1.5F, -4.0F, 1, 3, 4, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0304F, -4.4461F, -3.542F);
        this.main.addChild(body);
        this.setRotateAngle(body, -0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 50, -3.0F, -0.5F, -8.0F, 6, 8, 8, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5996F, -7.0087F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -3.5F, 0.0F, -9.0F, 7, 9, 9, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -5.2301F, -8.2724F);
        this.body2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0175F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 74, -0.5F, -12.3F, 0.0F, 1, 19, 0, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.1682F, -8.7377F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0916F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 61, 31, -3.0F, 0.0F, -6.25F, 6, 5, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 6.0163F, -6.6709F);
        this.body3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.3526F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 80, -0.5F, -2.3F, -4.0F, 3, 2, 4, -0.02F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 5.0F, -6.25F);
        this.body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 62, -1.5F, -2.9F, 0.0F, 5, 4, 7, -0.01F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.5567F, 5.4787F, -2.344F);
        this.body3.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0F, -0.3491F, 0.6109F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 21, 74, -1.5F, -1.5F, -2.1F, 5, 3, 3, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(2.7378F, -0.5764F, -0.1409F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.153F, 0.471F, 1.1161F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 84, 58, 0.0F, -1.0F, -1.0F, 5, 2, 2, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(4.25F, 0.0F, -0.25F);
        this.leftArm2.addChild(leftArm3);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.05F, 0.0F, 0.0F);
        this.leftArm3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0126F, -0.1785F, -0.0709F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 76, 84, 0.0F, -1.5F, -2.0F, 1, 3, 3, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.5567F, 5.4787F, -2.344F);
        this.body3.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.0F, 0.3491F, -0.6109F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 21, 74, -3.5F, -1.5F, -2.1F, 5, 3, 3, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-2.7378F, -0.5764F, -0.1409F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.153F, -0.471F, -1.1161F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 84, 58, -5.0F, -1.0F, -1.0F, 5, 2, 2, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-4.25F, 0.0F, -0.25F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0303F, 0.1732F, 0.0872F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 76, 84, -1.0F, -1.5F, -2.0F, 1, 3, 3, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, -5.25F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.2618F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 29, 49, -1.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0039F, -2.9957F);
        this.body4.addChild(head);
        this.setRotateAngle(head, 0.5236F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 85, 84, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 24, 88, 0.05F, 0.2F, -2.6F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 24, 88, -1.05F, 0.2F, -2.6F, 1, 1, 1, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 36, 16, -0.5F, 0.2821F, -3.496F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.2821F, -2.496F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 65, 84, -1.5F, 0.0F, 0.0F, 2, 1, 3, 0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 71, -0.5F, 0.25F, -1.975F, 1, 1, 1, -0.05F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 67, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.003F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.6756F, -1.1461F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.6298F, -1.5554F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 71, -0.5F, -0.2F, -0.95F, 1, 1, 1, -0.055F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 71, -0.5F, 0.0F, -1.0F, 1, 1, 1, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -1.6685F, -1.4499F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 86, 16, -0.5F, 1.0F, 0.2F, 2, 1, 2, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.3F, -1.95F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, 0.0873F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -0.0155F, -0.0112F);
        this.throat.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7418F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 86, 20, -0.5F, -1.0F, 0.0F, 2, 1, 2, -0.01F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, 1.325F, 1.45F);
        this.throat.addChild(throat2);
        this.setRotateAngle(throat2, -0.1745F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -1.3405F, -1.4611F);
        this.throat2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.7418F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 29, 56, -0.5F, -2.0F, 1.5F, 3, 2, 3, -0.01F, false));

        this.sail1 = new AdvancedModelRenderer(this);
        this.sail1.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(sail1);
        this.sail1.cubeList.add(new ModelBox(sail1, 36, 0, -0.5F, -14.5297F, -3.5316F, 1, 15, 0, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -5.3297F, -2.2316F);
        this.sail1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 33, 0, -0.5F, -12.3F, 0.0F, 1, 17, 0, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.7825F, -7.6045F);
        this.sail1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.5847F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 88, 36, -0.5F, -2.1F, -0.5F, 1, 4, 0, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.0125F, -5.3702F);
        this.sail1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3927F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 88, 7, -0.5F, -5.45F, -0.75F, 1, 6, 0, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.0125F, -5.3702F);
        this.sail1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 9, 87, -0.5F, -7.25F, 0.0F, 1, 8, 0, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -5.3297F, -4.8316F);
        this.sail1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 81, -0.5F, -6.1F, -0.1F, 1, 12, 0, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.5F, 0.0F, -0.95F);
        this.sail1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0262F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 21, 19, -1.5F, -18.7F, -9.0F, 0, 19, 10, 0.0F, false));

        this.sail2 = new AdvancedModelRenderer(this);
        this.sail2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body2.addChild(sail2);
        this.sail2.cubeList.add(new ModelBox(sail2, 42, 0, 0.025F, -20.675F, -9.0F, 0, 21, 9, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -5.2301F, -7.0724F);
        this.sail2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0524F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 47, 74, -0.5F, -14.4F, 0.05F, 1, 19, 0, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.2491F, -6.0082F);
        this.sail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1047F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 38, 74, -0.5F, -19.4F, -0.15F, 1, 20, 0, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -5.2301F, -4.2974F);
        this.sail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1745F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 41, 74, -0.5F, -14.475F, 0.0F, 1, 20, 0, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -5.2301F, -2.8974F);
        this.sail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2531F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 39, 0, -0.5F, -8.5F, 0.0F, 1, 14, 0, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -5.2301F, -1.2974F);
        this.sail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3054F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 33, 81, -0.5F, -4.4F, -0.2F, 1, 10, 0, 0.0F, false));

        this.sail3 = new AdvancedModelRenderer(this);
        this.sail3.setRotationPoint(0.0F, -0.5F, 0.25F);
        this.body.addChild(sail3);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.5519F, -9.3836F);
        this.sail3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.3447F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 15, 88, -0.5F, -4.6235F, -0.0848F, 1, 5, 0, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -16.2628F, -7.8493F);
        this.sail3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.4407F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 12, 87, -0.5F, -2.9155F, -0.1813F, 1, 6, 0, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -10.8353F, -7.4051F);
        this.sail3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.48F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 6, 87, -0.5F, -8.25F, -0.3F, 1, 9, 0, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -9.6178F, -5.8184F);
        this.sail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.6545F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 86, 44, -0.5F, -8.25F, -0.3F, 1, 8, 0, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -9.9888F, -3.1414F);
        this.sail3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.6065F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 88, 31, -0.5F, -1.7F, 0.075F, 1, 4, 0, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -6.5169F, -6.8915F);
        this.sail3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.3491F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 21, 88, -0.5F, -3.3F, -0.1F, 1, 5, 0, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.4762F, -7.9866F);
        this.sail3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.3927F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 54, 62, -0.5F, -8.75F, 0.375F, 1, 9, 0, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.2164F, -6.6561F);
        this.sail3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.4363F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 57, 62, -0.5F, -8.375F, 0.1F, 1, 9, 0, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -0.865F, -4.4021F);
        this.sail3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.5672F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 87, -0.5F, -4.9F, -0.1F, 1, 8, 0, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -0.5745F, -2.4732F);
        this.sail3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.5672F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 18, 88, -0.5F, -2.725F, -0.2F, 1, 5, 0, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -7.9335F, 0.3094F);
        this.sail3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.7985F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 89, 50, -0.5F, 0.7333F, -1.8233F, 1, 2, 0, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(2.5F, -0.35F, 0.125F);
        this.sail3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0436F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 42, 31, -2.5F, -20.7F, -9.0F, 0, 21, 9, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0304F, -3.1637F, 2.3918F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 61, 16, -2.0F, 0.0F, 0.0F, 4, 6, 8, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 61, 58, -1.5F, 0.0F, 0.125F, 3, 5, 8, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1F, 7.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 67, -1.0F, 0.0F, 0.0F, 2, 4, 8, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1F, 7.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 54, 72, -0.25F, 0.4F, 0.0F, 1, 3, 8, -0.003F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 73, 72, -0.75F, 0.4F, 0.0F, 1, 3, 8, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.1F, 7.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 61, 44, -0.5F, 0.7F, 0.0F, 1, 2, 11, 0.0F, false));

        this.sail4 = new AdvancedModelRenderer(this);
        this.sail4.setRotationPoint(0.0F, -4.975F, -4.5F);
        this.main.addChild(sail4);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0304F, -5.8546F, 0.7529F);
        this.sail4.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -1.0341F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 3, 87, -0.5F, -8.0F, 0.0F, 1, 8, 0, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0304F, -10.2546F, 1.5174F);
        this.sail4.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.9599F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 89, 41, -0.5F, -4.9F, -1.8F, 1, 4, 0, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0304F, -7.3046F, 1.5174F);
        this.sail4.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.9599F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 86, 24, -0.5F, -6.9F, -1.8F, 1, 6, 0, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0304F, 0.1042F, 6.4725F);
        this.sail4.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -1.3963F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 89, 24, -0.5F, -1.6F, 0.6F, 1, 4, 0, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0304F, 0.1572F, 3.9236F);
        this.sail4.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -1.3526F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 86, 53, -0.5F, -5.0F, -0.5F, 1, 4, 0, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0304F, -2.4487F, 3.4022F);
        this.sail4.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.6545F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 26, 71, -0.5F, 1.25F, 2.0F, 1, 2, 0, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0304F, -2.4487F, 3.4022F);
        this.sail4.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.7854F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 89, 46, -0.5F, 0.2F, 0.2F, 1, 3, 0, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0304F, -2.4021F, 5.0292F);
        this.sail4.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -1.3003F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 88, 0, -0.5F, -4.3F, -0.4F, 1, 6, 0, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0304F, -6.2673F, 4.6356F);
        this.sail4.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -1.1345F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 50, 74, -0.5F, -3.775F, 1.075F, 1, 9, 0, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(2.5304F, 3.629F, 6.208F);
        this.sail4.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0873F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 19, -2.475F, -21.125F, -6.5F, 0, 20, 10, 0.0F, false));

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

        EntityPrehistoricFloraEdaphosaurus EntityMegalosaurus = (EntityPrehistoricFloraEdaphosaurus) e;

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
        EntityPrehistoricFloraEdaphosaurus entity = (EntityPrehistoricFloraEdaphosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (15.87595-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.08434-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-5.49936-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 15.87595 + (((tickAnim - 10) / 4) * (63.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-90-(15.87595)));
            yy = 0.08434 + (((tickAnim - 10) / 4) * (0-(0.08434)));
            zz = -5.49936 + (((tickAnim - 10) / 4) * (0-(-5.49936)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 63.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-90 + (((tickAnim - 14) / 6) * (0-(63.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-90)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(xx), body4.rotateAngleY + (float) Math.toRadians(yy), body4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13 + (((tickAnim - 10) / 10) * (0-(13)));
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
            xx = 0 + (((tickAnim - 0) / 7) * (38.08-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 38.08 + (((tickAnim - 7) / 3) * (32-(38.08)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 32 + (((tickAnim - 10) / 3) * (0-(32)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -31.75 + (((tickAnim - 10) / 10) * (0-(-31.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.5 + (((tickAnim - 10) / 10) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 0) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 10) * (0.8-(1)));
            zz = 1 + (((tickAnim - 0) / 10) * (0.5-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 10) / 3) * (1-(1)));
            yy = 0.8 + (((tickAnim - 10) / 3) * (1-(0.8)));
            zz = 0.5 + (((tickAnim - 10) / 3) * (1-(0.5)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-57.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -57.5 + (((tickAnim - 10) / 3) * (-21.5-(-57.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -21.5 + (((tickAnim - 13) / 7) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.45-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.125 + (((tickAnim - 10) / 3) * (0-(1.125)));
            zz = -0.45 + (((tickAnim - 10) / 3) * (0-(-0.45)));
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
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 0) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 10) * (1.3-(1)));
            zz = 1 + (((tickAnim - 0) / 10) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 10) / 3) * (1-(1)));
            yy = 1.3 + (((tickAnim - 10) / 3) * (1-(1.3)));
            zz = 1 + (((tickAnim - 10) / 3) * (1-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 13) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 13) / 7) * (1-(1)));
            zz = 1 + (((tickAnim - 13) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);

       
    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEdaphosaurus entity = (EntityPrehistoricFloraEdaphosaurus) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-6.20284-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-1.44873-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-3.72883-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -6.20284 + (((tickAnim - 18) / 10) * (0-(-6.20284)));
            yy = -1.44873 + (((tickAnim - 18) / 10) * (0-(-1.44873)));
            zz = -3.72883 + (((tickAnim - 18) / 10) * (0-(-3.72883)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(xx), body4.rotateAngleY + (float) Math.toRadians(yy), body4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-16.03394-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.42333-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-1.10347-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -16.03394 + (((tickAnim - 7) / 6) * (-6.03239-(-16.03394)));
            yy = 0.42333 + (((tickAnim - 7) / 6) * (0.79374-(0.42333)));
            zz = -1.10347 + (((tickAnim - 7) / 6) * (-2.06901-(-1.10347)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -6.03239 + (((tickAnim - 13) / 5) * (-9.03084-(-6.03239)));
            yy = 0.79374 + (((tickAnim - 13) / 5) * (1.16415-(0.79374)));
            zz = -2.06901 + (((tickAnim - 13) / 5) * (-3.03455-(-2.06901)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -9.03084 + (((tickAnim - 18) / 10) * (0-(-9.03084)));
            yy = 1.16415 + (((tickAnim - 18) / 10) * (0-(1.16415)));
            zz = -3.03455 + (((tickAnim - 18) / 10) * (0-(-3.03455)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 24 + (((tickAnim - 7) / 5) * (20.36-(24)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 20.36 + (((tickAnim - 12) / 6) * (33-(20.36)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 33 + (((tickAnim - 18) / 10) * (0-(33)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (5.96394-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (3.05963-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (6.39145-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 5.96394 + (((tickAnim - 7) / 11) * (-19.2647-(5.96394)));
            yy = 3.05963 + (((tickAnim - 7) / 11) * (1.39789-(3.05963)));
            zz = 6.39145 + (((tickAnim - 7) / 11) * (6.94062-(6.39145)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -19.2647 + (((tickAnim - 18) / 10) * (0-(-19.2647)));
            yy = 1.39789 + (((tickAnim - 18) / 10) * (0-(1.39789)));
            zz = 6.94062 + (((tickAnim - 18) / 10) * (0-(6.94062)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            yy = -0.15 + (((tickAnim - 7) / 11) * (-0.025-(-0.15)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -0.025 + (((tickAnim - 18) / 10) * (0-(-0.025)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 0) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 7) * (1.1-(1)));
            zz = 1 + (((tickAnim - 0) / 7) * (1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 7) / 11) * (1-(1)));
            yy = 1.1 + (((tickAnim - 7) / 11) * (1.1-(1.1)));
            zz = 1 + (((tickAnim - 7) / 11) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 18) / 10) * (1-(1)));
            yy = 1.1 + (((tickAnim - 18) / 10) * (1-(1.1)));
            zz = 1 + (((tickAnim - 18) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-6.1559-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (1.95344-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-5.36971-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -6.1559 + (((tickAnim - 7) / 6) * (7.80381-(-6.1559)));
            yy = 1.95344 + (((tickAnim - 7) / 6) * (0.68441-(1.95344)));
            zz = -5.36971 + (((tickAnim - 7) / 6) * (-3.81653-(-5.36971)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 7.80381 + (((tickAnim - 13) / 5) * (-7.99992-(7.80381)));
            yy = 0.68441 + (((tickAnim - 13) / 5) * (-1.00763-(0.68441)));
            zz = -3.81653 + (((tickAnim - 13) / 5) * (-1.74562-(-3.81653)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -7.99992 + (((tickAnim - 18) / 10) * (0-(-7.99992)));
            yy = -1.00763 + (((tickAnim - 18) / 10) * (0-(-1.00763)));
            zz = -1.74562 + (((tickAnim - 18) / 10) * (0-(-1.74562)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-0.125-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.15-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = -0.125 + (((tickAnim - 7) / 11) * (0-(-0.125)));
            yy = -0.175 + (((tickAnim - 7) / 11) * (-0.025-(-0.175)));
            zz = 0.15 + (((tickAnim - 7) / 11) * (0.075-(0.15)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -0.025 + (((tickAnim - 18) / 10) * (0-(-0.025)));
            zz = 0.075 + (((tickAnim - 18) / 10) * (0-(0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 0) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 7) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 7) * (1.1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 7) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 7) / 11) * (1-(1)));
            zz = 1.1 + (((tickAnim - 7) / 11) * (1.1-(1.1)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 18) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 18) / 10) * (1-(1)));
            zz = 1.1 + (((tickAnim - 18) / 10) * (1-(1.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEdaphosaurus entity = (EntityPrehistoricFloraEdaphosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (41.13185-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-38.39655-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (21.93462-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 41.13185 + (((tickAnim - 23) / 15) * (24.61925-(41.13185)));
            yy = -38.39655 + (((tickAnim - 23) / 15) * (3.45203-(-38.39655)));
            zz = 21.93462 + (((tickAnim - 23) / 15) * (-16.9019-(21.93462)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 24.61925 + (((tickAnim - 38) / 12) * (0-(24.61925)));
            yy = 3.45203 + (((tickAnim - 38) / 12) * (0-(3.45203)));
            zz = -16.9019 + (((tickAnim - 38) / 12) * (0-(-16.9019)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-90.5091-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-1.20596-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-5.13613-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = -90.5091 + (((tickAnim - 23) / 15) * (0-(-90.5091)));
            yy = -1.20596 + (((tickAnim - 23) / 15) * (0-(-1.20596)));
            zz = -5.13613 + (((tickAnim - 23) / 15) * (16-(-5.13613)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 16 + (((tickAnim - 38) / 12) * (0-(16)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (1.9633-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.80087-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-6.15544-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 1.9633 + (((tickAnim - 12) / 11) * (0.27482-(1.9633)));
            yy = 0.80087 + (((tickAnim - 12) / 11) * (-39.42645-(0.80087)));
            zz = -6.15544 + (((tickAnim - 12) / 11) * (10.07029-(-6.15544)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0.27482 + (((tickAnim - 23) / 7) * (-30.48531-(0.27482)));
            yy = -39.42645 + (((tickAnim - 23) / 7) * (-61.07553-(-39.42645)));
            zz = 10.07029 + (((tickAnim - 23) / 7) * (48.81478-(10.07029)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -30.48531 + (((tickAnim - 30) / 8) * (-8.29071-(-30.48531)));
            yy = -61.07553 + (((tickAnim - 30) / 8) * (-13.73962-(-61.07553)));
            zz = 48.81478 + (((tickAnim - 30) / 8) * (6.06789-(48.81478)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -8.29071 + (((tickAnim - 38) / 12) * (0-(-8.29071)));
            yy = -13.73962 + (((tickAnim - 38) / 12) * (0-(-13.73962)));
            zz = 6.06789 + (((tickAnim - 38) / 12) * (0-(6.06789)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-0.85-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -0.85 + (((tickAnim - 23) / 7) * (-1.695-(-0.85)));
            yy = 0 + (((tickAnim - 23) / 7) * (0.8-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (-0.75-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.695 + (((tickAnim - 30) / 20) * (0-(-1.695)));
            yy = 0.8 + (((tickAnim - 30) / 20) * (0-(0.8)));
            zz = -0.75 + (((tickAnim - 30) / 20) * (0-(-0.75)));
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
        EntityPrehistoricFloraEdaphosaurus entity = (EntityPrehistoricFloraEdaphosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -2.525 + (((tickAnim - 20) / 5) * (-2.525-(-2.525)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = -2.525 + (((tickAnim - 25) / 25) * (0-(-2.525)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 20) * (-25.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = -25.25 + (((tickAnim - 20) / 5) * (-25.25-(-25.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = -25.25 + (((tickAnim - 25) / 25) * (0-(-25.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.00715-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (12.34422-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (20.64604-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 2.00715 + (((tickAnim - 20) / 5) * (2.00715-(2.00715)));
            yy = 12.34422 + (((tickAnim - 20) / 5) * (12.34422-(12.34422)));
            zz = 20.64604 + (((tickAnim - 20) / 5) * (20.64604-(20.64604)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 2.00715 + (((tickAnim - 25) / 25) * (0-(2.00715)));
            yy = 12.34422 + (((tickAnim - 25) / 25) * (0-(12.34422)));
            zz = 20.64604 + (((tickAnim - 25) / 25) * (0-(20.64604)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (25.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 25.25 + (((tickAnim - 20) / 5) * (25.25-(25.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 25.25 + (((tickAnim - 25) / 25) * (0-(25.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.00715-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-12.34422-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-20.64604-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 2.00715 + (((tickAnim - 20) / 5) * (2.00715-(2.00715)));
            yy = -12.34422 + (((tickAnim - 20) / 5) * (-12.34422-(-12.34422)));
            zz = -20.64604 + (((tickAnim - 20) / 5) * (-20.64604-(-20.64604)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 2.00715 + (((tickAnim - 25) / 25) * (0-(2.00715)));
            yy = -12.34422 + (((tickAnim - 25) / 25) * (0-(-12.34422)));
            zz = -20.64604 + (((tickAnim - 25) / 25) * (0-(-20.64604)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-33.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = -33.25 + (((tickAnim - 20) / 5) * (-33.25-(-33.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = -33.25 + (((tickAnim - 25) / 25) * (0-(-33.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (31.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 31.5 + (((tickAnim - 20) / 5) * (31.5-(31.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 31.5 + (((tickAnim - 25) / 25) * (0-(31.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (33.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 33.25 + (((tickAnim - 20) / 5) * (33.25-(33.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 33.25 + (((tickAnim - 25) / 25) * (0-(33.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-31.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = -31.5 + (((tickAnim - 20) / 5) * (-31.5-(-31.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = -31.5 + (((tickAnim - 25) / 25) * (0-(-31.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 6.5 + (((tickAnim - 20) / 5) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 25) / 25) * (0-(6.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 4.75 + (((tickAnim - 20) / 5) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 4.75 + (((tickAnim - 25) / 25) * (0-(4.75)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -6 + (((tickAnim - 20) / 5) * (-6-(-6)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 25) / 25) * (0-(-6)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEdaphosaurus entity = (EntityPrehistoricFloraEdaphosaurus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.45-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 20) / 83) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 83) * (0-(0)));
            zz = -0.45 + (((tickAnim - 20) / 83) * (-0.45-(-0.45)));
        }
        else if (tickAnim >= 103 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 103) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 32) * (0-(0)));
            zz = -0.45 + (((tickAnim - 103) / 32) * (0-(-0.45)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 20) / 83) * (0-(0)));
            yy = -5 + (((tickAnim - 20) / 83) * (-5-(-5)));
            zz = 0 + (((tickAnim - 20) / 83) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 103) / 32) * (0-(0)));
            yy = -5 + (((tickAnim - 103) / 32) * (0-(-5)));
            zz = 0 + (((tickAnim - 103) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (5.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 20) / 83) * (0-(0)));
            yy = 5.25 + (((tickAnim - 20) / 83) * (5.25-(5.25)));
            zz = 0 + (((tickAnim - 20) / 83) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 103) / 32) * (0-(0)));
            yy = 5.25 + (((tickAnim - 103) / 32) * (0-(5.25)));
            zz = 0 + (((tickAnim - 103) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.25 + (((tickAnim - 30) / 20) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = -0.25 + (((tickAnim - 60) / 18) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 18) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 78) / 25) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 78) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 25) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 135) {
            xx = -0.25 + (((tickAnim - 103) / 32) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 103) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.47182-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-10.46788-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2.90084-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 103) {
            xx = -1.47182 + (((tickAnim - 20) / 83) * (-1.47182-(-1.47182)));
            yy = -10.46788 + (((tickAnim - 20) / 83) * (-10.46788-(-10.46788)));
            zz = 2.90084 + (((tickAnim - 20) / 83) * (2.90084-(2.90084)));
        }
        else if (tickAnim >= 103 && tickAnim < 135) {
            xx = -1.47182 + (((tickAnim - 103) / 32) * (0-(-1.47182)));
            yy = -10.46788 + (((tickAnim - 103) / 32) * (0-(-10.46788)));
            zz = 2.90084 + (((tickAnim - 103) / 32) * (0-(2.90084)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.62632-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-17.57968-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (14.51323-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.62632 + (((tickAnim - 10) / 10) * (0-(0.62632)));
            yy = -17.57968 + (((tickAnim - 10) / 10) * (-35-(-17.57968)));
            zz = 14.51323 + (((tickAnim - 10) / 10) * (0-(14.51323)));
        }
        else if (tickAnim >= 20 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 20) / 83) * (0-(0)));
            yy = -35 + (((tickAnim - 20) / 83) * (-35-(-35)));
            zz = 0 + (((tickAnim - 20) / 83) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 103) / 17) * (1.28883-(0)));
            yy = -35 + (((tickAnim - 103) / 17) * (11.48344-(-35)));
            zz = 0 + (((tickAnim - 103) / 17) * (19.39209-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 1.28883 + (((tickAnim - 120) / 15) * (0-(1.28883)));
            yy = 11.48344 + (((tickAnim - 120) / 15) * (0-(11.48344)));
            zz = 19.39209 + (((tickAnim - 120) / 15) * (0-(19.39209)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.23162-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-21.10372-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (8.28494-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.23162 + (((tickAnim - 10) / 10) * (-16.78052-(-8.23162)));
            yy = -21.10372 + (((tickAnim - 10) / 10) * (18.29082-(-21.10372)));
            zz = 8.28494 + (((tickAnim - 10) / 10) * (17.13281-(8.28494)));
        }
        else if (tickAnim >= 20 && tickAnim < 103) {
            xx = -16.78052 + (((tickAnim - 20) / 83) * (-16.78052-(-16.78052)));
            yy = 18.29082 + (((tickAnim - 20) / 83) * (18.29082-(18.29082)));
            zz = 17.13281 + (((tickAnim - 20) / 83) * (17.13281-(17.13281)));
        }
        else if (tickAnim >= 103 && tickAnim < 120) {
            xx = -16.78052 + (((tickAnim - 103) / 17) * (-7.79084-(-16.78052)));
            yy = 18.29082 + (((tickAnim - 103) / 17) * (-10.33368-(18.29082)));
            zz = 17.13281 + (((tickAnim - 103) / 17) * (7.78199-(17.13281)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = -7.79084 + (((tickAnim - 120) / 15) * (0-(-7.79084)));
            yy = -10.33368 + (((tickAnim - 120) / 15) * (0-(-10.33368)));
            zz = 7.78199 + (((tickAnim - 120) / 15) * (0-(7.78199)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.94644-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (69.86203-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (4.35611-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 7.94644 + (((tickAnim - 10) / 10) * (0.01172-(7.94644)));
            yy = 69.86203 + (((tickAnim - 10) / 10) * (1.99908-(69.86203)));
            zz = 4.35611 + (((tickAnim - 10) / 10) * (-9.68815-(4.35611)));
        }
        else if (tickAnim >= 20 && tickAnim < 103) {
            xx = 0.01172 + (((tickAnim - 20) / 83) * (0.01172-(0.01172)));
            yy = 1.99908 + (((tickAnim - 20) / 83) * (1.99908-(1.99908)));
            zz = -9.68815 + (((tickAnim - 20) / 83) * (-9.68815-(-9.68815)));
        }
        else if (tickAnim >= 103 && tickAnim < 120) {
            xx = 0.01172 + (((tickAnim - 103) / 17) * (8.64456-(0.01172)));
            yy = 1.99908 + (((tickAnim - 103) / 17) * (70.54876-(1.99908)));
            zz = -9.68815 + (((tickAnim - 103) / 17) * (5.32127-(-9.68815)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 8.64456 + (((tickAnim - 120) / 15) * (0-(8.64456)));
            yy = 70.54876 + (((tickAnim - 120) / 15) * (0-(70.54876)));
            zz = 5.32127 + (((tickAnim - 120) / 15) * (0-(5.32127)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -6.5 + (((tickAnim - 20) / 5) * (-3.95149-(-6.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (-1.38253-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (-4.01923-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -3.95149 + (((tickAnim - 25) / 5) * (1.29851-(-3.95149)));
            yy = -1.38253 + (((tickAnim - 25) / 5) * (-1.38253-(-1.38253)));
            zz = -4.01923 + (((tickAnim - 25) / 5) * (-4.01923-(-4.01923)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1.29851 + (((tickAnim - 30) / 10) * (-27.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(1.29851)));
            yy = -1.38253 + (((tickAnim - 30) / 10) * (0-(-1.38253)));
            zz = -4.01923 + (((tickAnim - 30) / 10) * (0-(-4.01923)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -27.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 40) / 10) * (-26.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(-27.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = -26.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 50) / 7) * (-19.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(-26.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 7) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 67) {
            xx = -19.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 57) / 10) * (-19.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(-19.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 57) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 10) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = -19.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 67) / 11) * (-15.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(-19.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 11) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 84) {
            xx = -15.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 78) / 6) * (-10.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(-15.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 78) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 6) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 94) {
            xx = -10.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 84) / 10) * (-0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(-10.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 84) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 10) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = -0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 94) / 9) * (1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(-0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 9) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 135) {
            xx = 1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 103) / 32) * (0-(1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 103) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(xx), body4.rotateAngleY + (float) Math.toRadians(yy), body4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (-0.22-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (-0.1-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -0.22 + (((tickAnim - 25) / 5) * (-0.22-(-0.22)));
            yy = -0.15 + (((tickAnim - 25) / 5) * (-0.1-(-0.15)));
            zz = -0.1 + (((tickAnim - 25) / 5) * (-0.05-(-0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.22 + (((tickAnim - 30) / 20) * (-0.22-(-0.22)));
            yy = -0.1 + (((tickAnim - 30) / 20) * (-0.1-(-0.1)));
            zz = -0.05 + (((tickAnim - 30) / 20) * (0.05-(-0.05)));
        }
        else if (tickAnim >= 50 && tickAnim < 78) {
            xx = -0.22 + (((tickAnim - 50) / 28) * (-0.22-(-0.22)));
            yy = -0.1 + (((tickAnim - 50) / 28) * (-0.1-(-0.1)));
            zz = 0.05 + (((tickAnim - 50) / 28) * (0.05-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body4.rotationPointX = this.body4.rotationPointX + (float)(xx);
        this.body4.rotationPointY = this.body4.rotationPointY - (float)(yy);
        this.body4.rotationPointZ = this.body4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -14.5 + (((tickAnim - 20) / 5) * (-18.75-(-14.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -18.75 + (((tickAnim - 25) / 5) * (-22.75-(-18.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -22.75 + (((tickAnim - 30) / 10) * (58.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55-(-22.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 58.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55 + (((tickAnim - 40) / 10) * (53.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55-(58.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 53.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55 + (((tickAnim - 50) / 7) * (28.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55-(53.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 7) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 67) {
            xx = 28.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55 + (((tickAnim - 57) / 10) * (20.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55-(28.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55)));
            yy = 0 + (((tickAnim - 57) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 10) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = 20.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55 + (((tickAnim - 67) / 11) * (-1.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55-(20.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55)));
            yy = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 11) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 84) {
            xx = -1.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55 + (((tickAnim - 78) / 6) * (-18.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55-(-1.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55)));
            yy = 0 + (((tickAnim - 78) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 6) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 94) {
            xx = -18.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55 + (((tickAnim - 84) / 10) * (-37.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55-(-18.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55)));
            yy = 0 + (((tickAnim - 84) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 10) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = -37.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55 + (((tickAnim - 94) / 9) * (-47.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55-(-37.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55)));
            yy = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 9) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 135) {
            xx = -47.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55 + (((tickAnim - 103) / 32) * (0-(-47.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55)));
            yy = 0 + (((tickAnim - 103) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 30.75 + (((tickAnim - 20) / 5) * (0-(30.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (27.5-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 7) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 63) {
            xx = 27.5 + (((tickAnim - 57) / 6) * (0-(27.5)));
            yy = 0 + (((tickAnim - 57) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 6) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 63) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 15) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 4) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 82) / 6) * (27.5-(0)));
            yy = 0 + (((tickAnim - 82) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 6) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 103) {
            xx = 27.5 + (((tickAnim - 88) / 15) * (0-(27.5)));
            yy = 0 + (((tickAnim - 88) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (18.5-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 18.5 + (((tickAnim - 25) / 5) * (14.25-(18.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 14.25 + (((tickAnim - 30) / 10) * (0-(14.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 7) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 63) {
            xx = -11.75 + (((tickAnim - 57) / 6) * (1.75-(-11.75)));
            yy = 0 + (((tickAnim - 57) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 6) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 78) {
            xx = 1.75 + (((tickAnim - 63) / 15) * (0-(1.75)));
            yy = 0 + (((tickAnim - 63) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 15) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 4) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 82) / 6) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 82) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 6) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 103) {
            xx = -11.75 + (((tickAnim - 88) / 15) * (6.25-(-11.75)));
            yy = 0 + (((tickAnim - 88) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 15) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 135) {
            xx = 6.25 + (((tickAnim - 103) / 32) * (0-(6.25)));
            yy = 0 + (((tickAnim - 103) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0.375-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = -0.1 + (((tickAnim - 25) / 5) * (-0.25-(-0.1)));
            zz = 0.375 + (((tickAnim - 25) / 5) * (0.63-(0.375)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 30) / 10) * (-0.1-(-0.25)));
            zz = 0.63 + (((tickAnim - 30) / 10) * (0.38-(0.63)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (3-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 3 + (((tickAnim - 25) / 5) * (12.75-(3)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 12.75 + (((tickAnim - 30) / 10) * (0-(12.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 20) / 5) * (-0.275-(-0.275)));
            zz = 0.2 + (((tickAnim - 20) / 5) * (0.2-(0.2)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 25) / 5) * (-0.255-(-0.275)));
            zz = 0.2 + (((tickAnim - 25) / 5) * (0.225-(0.2)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.255 + (((tickAnim - 30) / 10) * (0-(-0.255)));
            zz = 0.225 + (((tickAnim - 30) / 10) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 20) / 83) * (0-(0)));
            yy = 1.5 + (((tickAnim - 20) / 83) * (1.5-(1.5)));
            zz = 0 + (((tickAnim - 20) / 83) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 103) / 32) * (0-(0)));
            yy = 1.5 + (((tickAnim - 103) / 32) * (0-(1.5)));
            zz = 0 + (((tickAnim - 103) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 20) / 83) * (0-(0)));
            yy = 2 + (((tickAnim - 20) / 83) * (2-(2)));
            zz = 0 + (((tickAnim - 20) / 83) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 103) / 32) * (0-(0)));
            yy = 2 + (((tickAnim - 103) / 32) * (0-(2)));
            zz = 0 + (((tickAnim - 103) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 20) / 83) * (0-(0)));
            yy = -2.5 + (((tickAnim - 20) / 83) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 20) / 83) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 103) / 32) * (0-(0)));
            yy = -2.5 + (((tickAnim - 103) / 32) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 103) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 20) / 83) * (0-(0)));
            yy = -5.5 + (((tickAnim - 20) / 83) * (-5.5-(-5.5)));
            zz = 0 + (((tickAnim - 20) / 83) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 103) / 32) * (0-(0)));
            yy = -5.5 + (((tickAnim - 103) / 32) * (0-(-5.5)));
            zz = 0 + (((tickAnim - 103) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEdaphosaurus entity = (EntityPrehistoricFloraEdaphosaurus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 31.10012 + (((tickAnim - 0) / 8) * (30.26921-(31.10012)));
            yy = -47.92009 + (((tickAnim - 0) / 8) * (99.3506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*200-(-47.92009)));
            zz = 7.11001 + (((tickAnim - 0) / 8) * (25.401+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(7.11001)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 30.26921 + (((tickAnim - 8) / 7) * (8.24242-(30.26921)));
            yy = 99.3506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*200 + (((tickAnim - 8) / 7) * (21.81564-(99.3506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*200)));
            zz = 25.401+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 8) / 7) * (11.35779-(25.401+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 8.24242 + (((tickAnim - 15) / 20) * (31.10012-(8.24242)));
            yy = 21.81564 + (((tickAnim - 15) / 20) * (-47.92009-(21.81564)));
            zz = 11.35779 + (((tickAnim - 15) / 20) * (7.11001-(11.35779)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.81026-(0)));
            yy = -12 + (((tickAnim - 0) / 8) * (-5.72135-(-12)));
            zz = 0 + (((tickAnim - 0) / 8) * (13.09047-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -1.81026 + (((tickAnim - 8) / 7) * (0-(-1.81026)));
            yy = -5.72135 + (((tickAnim - 8) / 7) * (0-(-5.72135)));
            zz = 13.09047 + (((tickAnim - 8) / 7) * (-9-(13.09047)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (-12-(0)));
            zz = -9 + (((tickAnim - 15) / 20) * (0-(-9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -20.13466 + (((tickAnim - 0) / 3) * (-46.66081-(-20.13466)));
            yy = -27.63238 + (((tickAnim - 0) / 3) * (-42.95966-(-27.63238)));
            zz = 31.97198 + (((tickAnim - 0) / 3) * (74.34375-(31.97198)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -46.66081 + (((tickAnim - 3) / 5) * (-46.41206-(-46.66081)));
            yy = -42.95966 + (((tickAnim - 3) / 5) * (-43.45178-(-42.95966)));
            zz = 74.34375 + (((tickAnim - 3) / 5) * (72.30967-(74.34375)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -46.41206 + (((tickAnim - 8) / 7) * (-16.9841-(-46.41206)));
            yy = -43.45178 + (((tickAnim - 8) / 7) * (-5.26421-(-43.45178)));
            zz = 72.30967 + (((tickAnim - 8) / 7) * (7.30619-(72.30967)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -16.9841 + (((tickAnim - 15) / 10) * (-3.57729-(-16.9841)));
            yy = -5.26421 + (((tickAnim - 15) / 10) * (24.63105-(-5.26421)));
            zz = 7.30619 + (((tickAnim - 15) / 10) * (-7.73539-(7.30619)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -3.57729 + (((tickAnim - 25) / 10) * (-20.13466-(-3.57729)));
            yy = 24.63105 + (((tickAnim - 25) / 10) * (-27.63238-(24.63105)));
            zz = -7.73539 + (((tickAnim - 25) / 10) * (31.97198-(-7.73539)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.575 + (((tickAnim - 0) / 3) * (-1.39-(-0.575)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.705-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.815-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -1.39 + (((tickAnim - 3) / 5) * (-2.29-(-1.39)));
            yy = 0.705 + (((tickAnim - 3) / 5) * (1-(0.705)));
            zz = -0.815 + (((tickAnim - 3) / 5) * (-0.725-(-0.815)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -2.29 + (((tickAnim - 8) / 4) * (-1.495-(-2.29)));
            yy = 1 + (((tickAnim - 8) / 4) * (0.44-(1)));
            zz = -0.725 + (((tickAnim - 8) / 4) * (-0.32-(-0.725)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -1.495 + (((tickAnim - 12) / 3) * (0-(-1.495)));
            yy = 0.44 + (((tickAnim - 12) / 3) * (0-(0.44)));
            zz = -0.32 + (((tickAnim - 12) / 3) * (0-(-0.32)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (-1.76+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -1.76+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10 + (((tickAnim - 25) / 10) * (-0.575-(-1.76+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
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
            xx = 8.24242 + (((tickAnim - 0) / 20) * (31.10012-(8.24242)));
            yy = -21.81564 + (((tickAnim - 0) / 20) * (47.92009-(-21.81564)));
            zz = -11.35779 + (((tickAnim - 0) / 20) * (-7.11001-(-11.35779)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 31.10012 + (((tickAnim - 20) / 8) * (30.26921-(31.10012)));
            yy = 47.92009 + (((tickAnim - 20) / 8) * (73.7506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-200-(47.92009)));
            zz = -7.11001 + (((tickAnim - 20) / 8) * (-82.599+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(-7.11001)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 30.26921 + (((tickAnim - 28) / 7) * (8.24242-(30.26921)));
            yy = 73.7506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-200 + (((tickAnim - 28) / 7) * (-21.81564-(73.7506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-200)));
            zz = -82.599+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 28) / 7) * (-11.35779-(-82.599+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (12-(0)));
            zz = 9 + (((tickAnim - 0) / 20) * (0-(9)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (-0.55101-(0)));
            yy = 12 + (((tickAnim - 20) / 8) * (5.97474-(12)));
            zz = 0 + (((tickAnim - 20) / 8) * (-0.77876-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -0.55101 + (((tickAnim - 28) / 7) * (0-(-0.55101)));
            yy = 5.97474 + (((tickAnim - 28) / 7) * (0-(5.97474)));
            zz = -0.77876 + (((tickAnim - 28) / 7) * (9-(-0.77876)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -16.9841 + (((tickAnim - 0) / 10) * (-17.84072-(-16.9841)));
            yy = 5.26421 + (((tickAnim - 0) / 10) * (-26.40281-(5.26421)));
            zz = -7.30619 + (((tickAnim - 0) / 10) * (4.9688-(-7.30619)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -17.84072 + (((tickAnim - 10) / 10) * (-20.13466-(-17.84072)));
            yy = -26.40281 + (((tickAnim - 10) / 10) * (27.63238-(-26.40281)));
            zz = 4.9688 + (((tickAnim - 10) / 10) * (-31.97198-(4.9688)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -20.13466 + (((tickAnim - 20) / 3) * (-46.66081-(-20.13466)));
            yy = 27.63238 + (((tickAnim - 20) / 3) * (42.95966-(27.63238)));
            zz = -31.97198 + (((tickAnim - 20) / 3) * (-74.34375-(-31.97198)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -46.66081 + (((tickAnim - 23) / 5) * (-46.41206-(-46.66081)));
            yy = 42.95966 + (((tickAnim - 23) / 5) * (43.45178-(42.95966)));
            zz = -74.34375 + (((tickAnim - 23) / 5) * (-72.30967-(-74.34375)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -46.41206 + (((tickAnim - 28) / 7) * (-16.9841-(-46.41206)));
            yy = 43.45178 + (((tickAnim - 28) / 7) * (5.26421-(43.45178)));
            zz = -72.30967 + (((tickAnim - 28) / 7) * (-7.30619-(-72.30967)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0.725 + (((tickAnim - 0) / 10) * (1.165+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(0.725)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.165+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 10) / 10) * (0.575-(1.165+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0.575 + (((tickAnim - 20) / 3) * (1.39-(0.575)));
            yy = 0 + (((tickAnim - 20) / 3) * (0.705-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (-0.815-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 1.39 + (((tickAnim - 23) / 5) * (2.29-(1.39)));
            yy = 0.705 + (((tickAnim - 23) / 5) * (1-(0.705)));
            zz = -0.815 + (((tickAnim - 23) / 5) * (-0.725-(-0.815)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 2.29 + (((tickAnim - 28) / 4) * (2.245-(2.29)));
            yy = 1 + (((tickAnim - 28) / 4) * (0.44-(1)));
            zz = -0.725 + (((tickAnim - 28) / 4) * (-0.32-(-0.725)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 2.245 + (((tickAnim - 32) / 3) * (0.725-(2.245)));
            yy = 0.44 + (((tickAnim - 32) / 3) * (0-(0.44)));
            zz = -0.32 + (((tickAnim - 32) / 3) * (0-(-0.32)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 5.03804 + (((tickAnim - 0) / 18) * (32.75-(5.03804)));
            yy = 47.07003 + (((tickAnim - 0) / 18) * (-30.5-(47.07003)));
            zz = 10.96352 + (((tickAnim - 0) / 18) * (0-(10.96352)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 32.75 + (((tickAnim - 18) / 9) * (20.65174-(32.75)));
            yy = -30.5 + (((tickAnim - 18) / 9) * (-164.0356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*185-(-30.5)));
            zz = 0 + (((tickAnim - 18) / 9) * (-98.2761+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*85-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 20.65174 + (((tickAnim - 27) / 8) * (5.03804-(20.65174)));
            yy = -164.0356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*185 + (((tickAnim - 27) / 8) * (47.07003-(-164.0356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*185)));
            zz = -98.2761+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*85 + (((tickAnim - 27) / 8) * (10.96352-(-98.2761+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -22.2391 + (((tickAnim - 0) / 18) * (7.27093-(-22.2391)));
            yy = -18.42866 + (((tickAnim - 0) / 18) * (-4.72444-(-18.42866)));
            zz = -27.61611 + (((tickAnim - 0) / 18) * (-25.58079-(-27.61611)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 7.27093 + (((tickAnim - 18) / 9) * (-25.9418-(7.27093)));
            yy = -4.72444 + (((tickAnim - 18) / 9) * (20.3449511811+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25-(-4.72444)));
            zz = -25.58079 + (((tickAnim - 18) / 9) * (-26.19283-(-25.58079)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -25.9418 + (((tickAnim - 27) / 8) * (-22.2391-(-25.9418)));
            yy = 20.3449511811+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25 + (((tickAnim - 27) / 8) * (-18.42866-(20.3449511811+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25)));
            zz = -26.19283 + (((tickAnim - 27) / 8) * (-27.61611-(-26.19283)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-3.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5+80))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(9.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5+80))*-1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*-8), tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -13.07194 + (((tickAnim - 0) / 8) * (-16.97822-(-13.07194)));
            yy = -10.31044 + (((tickAnim - 0) / 8) * (22.27531-(-10.31044)));
            zz = 6.65155 + (((tickAnim - 0) / 8) * (7.80663-(6.65155)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -16.97822 + (((tickAnim - 8) / 10) * (-33.90704-(-16.97822)));
            yy = 22.27531 + (((tickAnim - 8) / 10) * (-67.42202-(22.27531)));
            zz = 7.80663 + (((tickAnim - 8) / 10) * (40.67342-(7.80663)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -33.90704 + (((tickAnim - 18) / 4) * (0-(-33.90704)));
            yy = -67.42202 + (((tickAnim - 18) / 4) * (-110.5-(-67.42202)));
            zz = 40.67342 + (((tickAnim - 18) / 4) * (0-(40.67342)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (-1.1326-(0)));
            yy = -110.5 + (((tickAnim - 22) / 5) * (-75.58664-(-110.5)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -1.1326 + (((tickAnim - 27) / 8) * (-13.07194-(-1.1326)));
            yy = -75.58664 + (((tickAnim - 27) / 8) * (-10.31044-(-75.58664)));
            zz = 0 + (((tickAnim - 27) / 8) * (6.65155-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.05 + (((tickAnim - 0) / 8) * (-3.055+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*8-(-0.05)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.12-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -3.055+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*8 + (((tickAnim - 8) / 1) * (0.005-(-3.055+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*8)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0.12 + (((tickAnim - 8) / 1) * (0.08-(0.12)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0.005 + (((tickAnim - 9) / 9) * (-1-(0.005)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0.08 + (((tickAnim - 9) / 9) * (-0.25-(0.08)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -1 + (((tickAnim - 18) / 4) * (0.255-(-1)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = -0.25 + (((tickAnim - 18) / 4) * (-0.22-(-0.25)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0.255 + (((tickAnim - 22) / 5) * (-0.695-(0.255)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = -0.22 + (((tickAnim - 22) / 5) * (-0.295-(-0.22)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -0.695 + (((tickAnim - 27) / 8) * (-0.05-(-0.695)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = -0.295 + (((tickAnim - 27) / 8) * (0-(-0.295)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 32.75 + (((tickAnim - 0) / 9) * (20.65174-(32.75)));
            yy = 30.5 + (((tickAnim - 0) / 9) * (68.6606+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-185-(30.5)));
            zz = 0 + (((tickAnim - 0) / 9) * (41.7489+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-85-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 20.65174 + (((tickAnim - 9) / 9) * (5.03804-(20.65174)));
            yy = 68.6606+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-185 + (((tickAnim - 9) / 9) * (-47.07003-(68.6606+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-185)));
            zz = 41.7489+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-85 + (((tickAnim - 9) / 9) * (-10.96352-(41.7489+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-85)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 5.03804 + (((tickAnim - 18) / 17) * (32.75-(5.03804)));
            yy = -47.07003 + (((tickAnim - 18) / 17) * (30.5-(-47.07003)));
            zz = -10.96352 + (((tickAnim - 18) / 17) * (0-(-10.96352)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 7.27093 + (((tickAnim - 0) / 9) * (-25.9418-(7.27093)));
            yy = 4.72444 + (((tickAnim - 0) / 9) * (-20.3449511811+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55-(4.72444)));
            zz = 25.58079 + (((tickAnim - 0) / 9) * (26.19283-(25.58079)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -25.9418 + (((tickAnim - 9) / 9) * (-22.2391-(-25.9418)));
            yy = -20.3449511811+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55 + (((tickAnim - 9) / 9) * (18.42866-(-20.3449511811+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55)));
            zz = 26.19283 + (((tickAnim - 9) / 9) * (27.61611-(26.19283)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -22.2391 + (((tickAnim - 18) / 17) * (7.27093-(-22.2391)));
            yy = 18.42866 + (((tickAnim - 18) / 17) * (4.72444-(18.42866)));
            zz = 27.61611 + (((tickAnim - 18) / 17) * (25.58079-(27.61611)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -33.90704 + (((tickAnim - 0) / 4) * (0-(-33.90704)));
            yy = 67.42202 + (((tickAnim - 0) / 4) * (110.5-(67.42202)));
            zz = -40.67342 + (((tickAnim - 0) / 4) * (0-(-40.67342)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (10.1174-(0)));
            yy = 110.5 + (((tickAnim - 4) / 5) * (75.58664-(110.5)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 10.1174 + (((tickAnim - 9) / 9) * (-14.48236-(10.1174)));
            yy = 75.58664 + (((tickAnim - 9) / 9) * (9.47547-(75.58664)));
            zz = 0 + (((tickAnim - 9) / 9) * (-10.80986-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = -14.48236 + (((tickAnim - 18) / 9) * (-15.62505-(-14.48236)));
            yy = 9.47547 + (((tickAnim - 18) / 9) * (-23.78583-(9.47547)));
            zz = -10.80986 + (((tickAnim - 18) / 9) * (-13.769-(-10.80986)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -15.62505 + (((tickAnim - 27) / 8) * (-33.90704-(-15.62505)));
            yy = -23.78583 + (((tickAnim - 27) / 8) * (67.42202-(-23.78583)));
            zz = -13.769 + (((tickAnim - 27) / 8) * (-40.67342-(-13.769)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.65 + (((tickAnim - 0) / 4) * (-0.255-(0.65)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = -0.25 + (((tickAnim - 0) / 4) * (-0.22-(-0.25)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -0.255 + (((tickAnim - 4) / 5) * (0.695-(-0.255)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = -0.22 + (((tickAnim - 4) / 5) * (-0.295-(-0.22)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0.695 + (((tickAnim - 9) / 9) * (0.15-(0.695)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = -0.295 + (((tickAnim - 9) / 9) * (0-(-0.295)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0.15 + (((tickAnim - 18) / 9) * (7.545+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8-(0.15)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0.12-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 7.545+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8 + (((tickAnim - 27) / 1) * (0.205-(7.545+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0.12 + (((tickAnim - 27) / 1) * (0.08-(0.12)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0.205 + (((tickAnim - 28) / 7) * (0.65-(0.205)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0.08 + (((tickAnim - 28) / 7) * (-0.25-(0.08)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-50))*-1.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*3), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*1.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5+30))*-0.59);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5))*0.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-100))*1.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*-1));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-150))*-1), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-350))*3), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*-1));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-200))*-1.5), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-400))*-3), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*-1));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-250))*-1), body4.rotateAngleY + (float) Math.toRadians(0), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-350))*-1.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-50))*1.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*-2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5+80))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*-6), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*-10), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(sail1, sail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-50))*-1), sail1.rotateAngleY + (float) Math.toRadians(0), sail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*1));


        this.setRotateAngle(sail3, sail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5))*1), sail3.rotateAngleY + (float) Math.toRadians(0), sail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*-0.8));


        this.setRotateAngle(sail4, sail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-50))*1), sail4.rotateAngleY + (float) Math.toRadians(0), sail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-160))*-1.5));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEdaphosaurus entity = (EntityPrehistoricFloraEdaphosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 31.10012 + (((tickAnim - 0) / 4) * (30.26921-(31.10012)));
            yy = -47.92009 + (((tickAnim - 0) / 4) * (99.3506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*200-(-47.92009)));
            zz = 7.11001 + (((tickAnim - 0) / 4) * (12.476+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(7.11001)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 30.26921 + (((tickAnim - 4) / 5) * (8.24242-(30.26921)));
            yy = 99.3506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*200 + (((tickAnim - 4) / 5) * (21.81564-(99.3506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*200)));
            zz = 12.476+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 4) / 5) * (11.35779-(12.476+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 8.24242 + (((tickAnim - 9) / 11) * (31.10012-(8.24242)));
            yy = 21.81564 + (((tickAnim - 9) / 11) * (-47.92009-(21.81564)));
            zz = 11.35779 + (((tickAnim - 9) / 11) * (7.11001-(11.35779)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-1.81026-(0)));
            yy = -12 + (((tickAnim - 0) / 4) * (-5.72135-(-12)));
            zz = 0 + (((tickAnim - 0) / 4) * (13.09047-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -1.81026 + (((tickAnim - 4) / 5) * (0-(-1.81026)));
            yy = -5.72135 + (((tickAnim - 4) / 5) * (0-(-5.72135)));
            zz = 13.09047 + (((tickAnim - 4) / 5) * (-9-(13.09047)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (-12-(0)));
            zz = -9 + (((tickAnim - 9) / 11) * (0-(-9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -20.13466 + (((tickAnim - 0) / 2) * (-46.66081-(-20.13466)));
            yy = -27.63238 + (((tickAnim - 0) / 2) * (-42.95966-(-27.63238)));
            zz = 31.97198 + (((tickAnim - 0) / 2) * (74.34375-(31.97198)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -46.66081 + (((tickAnim - 2) / 2) * (-46.41206-(-46.66081)));
            yy = -42.95966 + (((tickAnim - 2) / 2) * (-43.45178-(-42.95966)));
            zz = 74.34375 + (((tickAnim - 2) / 2) * (72.30967-(74.34375)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -46.41206 + (((tickAnim - 4) / 5) * (-16.9841-(-46.41206)));
            yy = -43.45178 + (((tickAnim - 4) / 5) * (-5.26421-(-43.45178)));
            zz = 72.30967 + (((tickAnim - 4) / 5) * (7.30619-(72.30967)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -16.9841 + (((tickAnim - 9) / 5) * (-3.57729-(-16.9841)));
            yy = -5.26421 + (((tickAnim - 9) / 5) * (24.63105-(-5.26421)));
            zz = 7.30619 + (((tickAnim - 9) / 5) * (-7.73539-(7.30619)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -3.57729 + (((tickAnim - 14) / 6) * (-20.13466-(-3.57729)));
            yy = 24.63105 + (((tickAnim - 14) / 6) * (-27.63238-(24.63105)));
            zz = -7.73539 + (((tickAnim - 14) / 6) * (31.97198-(-7.73539)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.575 + (((tickAnim - 0) / 2) * (-1.39-(-0.575)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.705-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.815-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -1.39 + (((tickAnim - 2) / 2) * (-2.29-(-1.39)));
            yy = 0.705 + (((tickAnim - 2) / 2) * (1-(0.705)));
            zz = -0.815 + (((tickAnim - 2) / 2) * (-0.725-(-0.815)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -2.29 + (((tickAnim - 4) / 3) * (-2.395-(-2.29)));
            yy = 1 + (((tickAnim - 4) / 3) * (0.44-(1)));
            zz = -0.725 + (((tickAnim - 4) / 3) * (-0.32-(-0.725)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -2.395 + (((tickAnim - 7) / 2) * (-0.25-(-2.395)));
            yy = 0.44 + (((tickAnim - 7) / 2) * (0-(0.44)));
            zz = -0.32 + (((tickAnim - 7) / 2) * (0-(-0.32)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -0.25 + (((tickAnim - 9) / 5) * (2.915+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10-(-0.25)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 2.915+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10 + (((tickAnim - 14) / 6) * (-0.575-(2.915+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 8.24242 + (((tickAnim - 0) / 11) * (31.10012-(8.24242)));
            yy = -21.81564 + (((tickAnim - 0) / 11) * (47.92009-(-21.81564)));
            zz = -11.35779 + (((tickAnim - 0) / 11) * (-7.11001-(-11.35779)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 31.10012 + (((tickAnim - 11) / 5) * (30.26921-(31.10012)));
            yy = 47.92009 + (((tickAnim - 11) / 5) * (-9.8244+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-200-(47.92009)));
            zz = -7.11001 + (((tickAnim - 11) / 5) * (-65.799+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(-7.11001)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 30.26921 + (((tickAnim - 16) / 4) * (8.24242-(30.26921)));
            yy = -9.8244+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-200 + (((tickAnim - 16) / 4) * (-21.81564-(-9.8244+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-200)));
            zz = -65.799+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 16) / 4) * (-11.35779-(-65.799+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (12-(0)));
            zz = 9 + (((tickAnim - 0) / 11) * (0-(9)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (-0.55101-(0)));
            yy = 12 + (((tickAnim - 11) / 5) * (5.97474-(12)));
            zz = 0 + (((tickAnim - 11) / 5) * (-0.77876-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.55101 + (((tickAnim - 16) / 4) * (0-(-0.55101)));
            yy = 5.97474 + (((tickAnim - 16) / 4) * (0-(5.97474)));
            zz = -0.77876 + (((tickAnim - 16) / 4) * (9-(-0.77876)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -16.9841 + (((tickAnim - 0) / 3) * (-16.18534-(-16.9841)));
            yy = 5.26421 + (((tickAnim - 0) / 3) * (-6.33188-(5.26421)));
            zz = -7.30619 + (((tickAnim - 0) / 3) * (0.33365-(-7.30619)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -16.18534 + (((tickAnim - 3) / 3) * (-11.50765-(-16.18534)));
            yy = -6.33188 + (((tickAnim - 3) / 3) * (-2.61325-(-6.33188)));
            zz = 0.33365 + (((tickAnim - 3) / 3) * (-18.20646-(0.33365)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -11.50765 + (((tickAnim - 6) / 5) * (-20.13466-(-11.50765)));
            yy = -2.61325 + (((tickAnim - 6) / 5) * (27.63238-(-2.61325)));
            zz = -18.20646 + (((tickAnim - 6) / 5) * (-31.97198-(-18.20646)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -20.13466 + (((tickAnim - 11) / 2) * (-46.66081-(-20.13466)));
            yy = 27.63238 + (((tickAnim - 11) / 2) * (42.95966-(27.63238)));
            zz = -31.97198 + (((tickAnim - 11) / 2) * (-74.34375-(-31.97198)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -46.66081 + (((tickAnim - 13) / 3) * (-46.41206-(-46.66081)));
            yy = 42.95966 + (((tickAnim - 13) / 3) * (43.45178-(42.95966)));
            zz = -74.34375 + (((tickAnim - 13) / 3) * (-72.30967-(-74.34375)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -46.41206 + (((tickAnim - 16) / 4) * (-16.9841-(-46.41206)));
            yy = 43.45178 + (((tickAnim - 16) / 4) * (5.26421-(43.45178)));
            zz = -72.30967 + (((tickAnim - 16) / 4) * (-7.30619-(-72.30967)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0.725 + (((tickAnim - 0) / 6) * (4.84+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-5-(0.725)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 4.84+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-5 + (((tickAnim - 6) / 5) * (0.575-(4.84+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-5)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0.575 + (((tickAnim - 11) / 2) * (1.39-(0.575)));
            yy = 0 + (((tickAnim - 11) / 2) * (0.705-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (-0.815-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 1.39 + (((tickAnim - 13) / 3) * (2.29-(1.39)));
            yy = 0.705 + (((tickAnim - 13) / 3) * (1-(0.705)));
            zz = -0.815 + (((tickAnim - 13) / 3) * (-0.725-(-0.815)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 2.29 + (((tickAnim - 16) / 2) * (2.245-(2.29)));
            yy = 1 + (((tickAnim - 16) / 2) * (0.44-(1)));
            zz = -0.725 + (((tickAnim - 16) / 2) * (-0.32-(-0.725)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.245 + (((tickAnim - 18) / 2) * (0.725-(2.245)));
            yy = 0.44 + (((tickAnim - 18) / 2) * (0-(0.44)));
            zz = -0.32 + (((tickAnim - 18) / 2) * (0-(-0.32)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 5.03804 + (((tickAnim - 0) / 10) * (32.75-(5.03804)));
            yy = 47.07003 + (((tickAnim - 0) / 10) * (-30.5-(47.07003)));
            zz = 10.96352 + (((tickAnim - 0) / 10) * (0-(10.96352)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 32.75 + (((tickAnim - 10) / 5) * (20.65174-(32.75)));
            yy = -30.5 + (((tickAnim - 10) / 5) * (-125.4606+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*185-(-30.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (-63.4761+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*85-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 20.65174 + (((tickAnim - 15) / 5) * (5.03804-(20.65174)));
            yy = -125.4606+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*185 + (((tickAnim - 15) / 5) * (47.07003-(-125.4606+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*185)));
            zz = -63.4761+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*85 + (((tickAnim - 15) / 5) * (10.96352-(-63.4761+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -22.2391 + (((tickAnim - 0) / 10) * (7.27093-(-22.2391)));
            yy = -18.42866 + (((tickAnim - 0) / 10) * (-4.72444-(-18.42866)));
            zz = -27.61611 + (((tickAnim - 0) / 10) * (-25.58079-(-27.61611)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 7.27093 + (((tickAnim - 10) / 5) * (-25.9418-(7.27093)));
            yy = -4.72444 + (((tickAnim - 10) / 5) * (20.3449511811+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25-(-4.72444)));
            zz = -25.58079 + (((tickAnim - 10) / 5) * (-26.19283-(-25.58079)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -25.9418 + (((tickAnim - 15) / 5) * (-22.2391-(-25.9418)));
            yy = 20.3449511811+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25 + (((tickAnim - 15) / 5) * (-18.42866-(20.3449511811+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25)));
            zz = -26.19283 + (((tickAnim - 15) / 5) * (-27.61611-(-26.19283)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(1.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+80))*3), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-9), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-6));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-4.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+80))*-4), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-15), tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -13.07194 + (((tickAnim - 0) / 5) * (-16.97822-(-13.07194)));
            yy = -10.31044 + (((tickAnim - 0) / 5) * (22.27531-(-10.31044)));
            zz = 6.65155 + (((tickAnim - 0) / 5) * (7.80663-(6.65155)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -16.97822 + (((tickAnim - 5) / 5) * (-33.90704-(-16.97822)));
            yy = 22.27531 + (((tickAnim - 5) / 5) * (-67.42202-(22.27531)));
            zz = 7.80663 + (((tickAnim - 5) / 5) * (40.67342-(7.80663)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -33.90704 + (((tickAnim - 10) / 3) * (0-(-33.90704)));
            yy = -67.42202 + (((tickAnim - 10) / 3) * (-110.5-(-67.42202)));
            zz = 40.67342 + (((tickAnim - 10) / 3) * (0-(40.67342)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (-1.1326-(0)));
            yy = -110.5 + (((tickAnim - 13) / 2) * (-75.58664-(-110.5)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.1326 + (((tickAnim - 15) / 5) * (-13.07194-(-1.1326)));
            yy = -75.58664 + (((tickAnim - 15) / 5) * (-10.31044-(-75.58664)));
            zz = 0 + (((tickAnim - 15) / 5) * (6.65155-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.05 + (((tickAnim - 0) / 5) * (-2.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*8-(-0.05)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.12-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -2.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*8 + (((tickAnim - 5) / 1) * (0.005-(-2.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*8)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0.12 + (((tickAnim - 5) / 1) * (0.08-(0.12)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0.005 + (((tickAnim - 6) / 4) * (-1-(0.005)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0.08 + (((tickAnim - 6) / 4) * (-0.25-(0.08)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -1 + (((tickAnim - 10) / 3) * (0.255-(-1)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -0.25 + (((tickAnim - 10) / 3) * (-0.22-(-0.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.255 + (((tickAnim - 13) / 2) * (-0.695-(0.255)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -0.22 + (((tickAnim - 13) / 2) * (-0.295-(-0.22)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.695 + (((tickAnim - 15) / 5) * (-0.05-(-0.695)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -0.295 + (((tickAnim - 15) / 5) * (0-(-0.295)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 32.75 + (((tickAnim - 0) / 6) * (20.65174-(32.75)));
            yy = 30.5 + (((tickAnim - 0) / 6) * (35.7856+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-185-(30.5)));
            zz = 0 + (((tickAnim - 0) / 6) * (41.7489+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-85-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 20.65174 + (((tickAnim - 6) / 4) * (5.03804-(20.65174)));
            yy = 35.7856+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-185 + (((tickAnim - 6) / 4) * (-47.07003-(35.7856+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-185)));
            zz = 41.7489+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-85 + (((tickAnim - 6) / 4) * (-10.96352-(41.7489+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-85)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.03804 + (((tickAnim - 10) / 10) * (32.75-(5.03804)));
            yy = -47.07003 + (((tickAnim - 10) / 10) * (30.5-(-47.07003)));
            zz = -10.96352 + (((tickAnim - 10) / 10) * (0-(-10.96352)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 7.27093 + (((tickAnim - 0) / 6) * (-25.9418-(7.27093)));
            yy = 4.72444 + (((tickAnim - 0) / 6) * (-20.3449511811+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55-(4.72444)));
            zz = 25.58079 + (((tickAnim - 0) / 6) * (26.19283-(25.58079)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -25.9418 + (((tickAnim - 6) / 4) * (-22.2391-(-25.9418)));
            yy = -20.3449511811+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55 + (((tickAnim - 6) / 4) * (18.42866-(-20.3449511811+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55)));
            zz = 26.19283 + (((tickAnim - 6) / 4) * (27.61611-(26.19283)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -22.2391 + (((tickAnim - 10) / 10) * (7.27093-(-22.2391)));
            yy = 18.42866 + (((tickAnim - 10) / 10) * (4.72444-(18.42866)));
            zz = 27.61611 + (((tickAnim - 10) / 10) * (25.58079-(27.61611)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -33.90704 + (((tickAnim - 0) / 3) * (0-(-33.90704)));
            yy = 67.42202 + (((tickAnim - 0) / 3) * (110.5-(67.42202)));
            zz = -40.67342 + (((tickAnim - 0) / 3) * (0-(-40.67342)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (10.1174-(0)));
            yy = 110.5 + (((tickAnim - 3) / 3) * (75.58664-(110.5)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 10.1174 + (((tickAnim - 6) / 4) * (-14.48236-(10.1174)));
            yy = 75.58664 + (((tickAnim - 6) / 4) * (9.47547-(75.58664)));
            zz = 0 + (((tickAnim - 6) / 4) * (-10.80986-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -14.48236 + (((tickAnim - 10) / 5) * (-15.62505-(-14.48236)));
            yy = 9.47547 + (((tickAnim - 10) / 5) * (-23.78583-(9.47547)));
            zz = -10.80986 + (((tickAnim - 10) / 5) * (-13.769-(-10.80986)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -15.62505 + (((tickAnim - 15) / 5) * (-33.90704-(-15.62505)));
            yy = -23.78583 + (((tickAnim - 15) / 5) * (67.42202-(-23.78583)));
            zz = -13.769 + (((tickAnim - 15) / 5) * (-40.67342-(-13.769)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.65 + (((tickAnim - 0) / 3) * (-0.255-(0.65)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -0.25 + (((tickAnim - 0) / 3) * (-0.22-(-0.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -0.255 + (((tickAnim - 3) / 3) * (0.695-(-0.255)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = -0.22 + (((tickAnim - 3) / 3) * (-0.295-(-0.22)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0.695 + (((tickAnim - 6) / 4) * (0.15-(0.695)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = -0.295 + (((tickAnim - 6) / 4) * (0-(-0.295)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0.15 + (((tickAnim - 10) / 5) * (5.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8-(0.15)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0.12-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 5.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8 + (((tickAnim - 15) / 1) * (0.205-(5.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0.12 + (((tickAnim - 15) / 1) * (0.08-(0.12)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0.205 + (((tickAnim - 16) / 4) * (0.65-(0.205)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0.08 + (((tickAnim - 16) / 4) * (-0.25-(0.08)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-2.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*3));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+30))*-0.8);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*0.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*2.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-2), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-350))*5), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-2));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*-1.5), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-400))*-5), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-2));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*-2), body4.rotateAngleY + (float) Math.toRadians(0), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*-2.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*2.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+80))*2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-12), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+120))*-2), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-18), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(sail1, sail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*-2), sail1.rotateAngleY + (float) Math.toRadians(0), sail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*2));


        this.setRotateAngle(sail3, sail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*1), sail3.rotateAngleY + (float) Math.toRadians(0), sail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-1.4));


        this.setRotateAngle(sail4, sail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*2), sail4.rotateAngleY + (float) Math.toRadians(0), sail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))*-2.5));


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraEdaphosaurus ee = (EntityPrehistoricFloraEdaphosaurus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEdaphosaurus e = (EntityPrehistoricFloraEdaphosaurus) entity;

    }
}
