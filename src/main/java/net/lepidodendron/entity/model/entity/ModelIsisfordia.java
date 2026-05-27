package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraIsisfordia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelIsisfordia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;

    private ModelAnimator animator;

    public ModelIsisfordia() {
        this.textureWidth = 66;
        this.textureHeight = 66;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 21.0F, 8.0F);
        this.main.cubeList.add(new ModelBox(main, 45, 33, -1.5F, -1.7459F, -3.5818F, 3, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -1.9F, 0.25F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 41, -0.5F, -1.65F, -3.725F, 3, 1, 4, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 26, -1.0F, -1.2F, -3.725F, 4, 2, 4, -0.003F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.6049F, -2.65F, -1.3987F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.2099F, 0.4976F, 0.7331F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 55, 5, 0.0F, -0.5F, -1.5F, 3, 2, 2, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(3.2437F, 0.2457F, -1.3104F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.5585F, -0.4638F, 1.0368F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 43, 53, 0.0F, -0.75F, 0.0F, 4, 1, 2, 0.0F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 54, 0.0F, -0.25F, 0.0F, 4, 1, 2, -0.003F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(3.3583F, -0.0266F, 1.1996F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0275F, 0.3042F, 0.0915F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 58, 39, 0.0F, -1.0F, -2.0F, 1, 2, 2, 0.01F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.6049F, -2.65F, -1.3987F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.2099F, -0.4976F, -0.7331F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 55, 5, -3.0F, -0.5F, -1.5F, 3, 2, 2, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-3.2437F, 0.2457F, -1.3104F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.5585F, 0.4638F, -1.0368F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 43, 53, -4.0F, -0.75F, 0.0F, 4, 1, 2, 0.0F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 54, -4.0F, -0.25F, 0.0F, 4, 1, 2, -0.003F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-3.3583F, -0.0266F, 1.1996F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0275F, -0.3042F, -0.0915F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 58, 39, -1.0F, -1.0F, -2.0F, 1, 2, 2, 0.01F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.8004F, 0.0413F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.2182F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 25, 0, -1.5F, -1.2F, -0.025F, 3, 2, 5, -0.003F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 63, -1.4F, -1.7F, 0.975F, 0, 1, 3, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 63, 1.4F, -1.7F, 0.975F, 0, 1, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.0F, 0.1F);
        this.tail.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0829F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 18, -0.5F, -1.7F, -0.225F, 2, 1, 5, -0.006F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1353F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 23, 18, -1.0F, -1.2F, -0.025F, 2, 2, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.75F, -1.15F, -0.525F);
        this.tail2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.048F, 0.0436F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 39, -0.2F, -0.5F, -0.025F, 0, 1, 6, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.75F, -1.15F, -0.525F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.048F, -0.0436F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 39, 0.2F, -0.5F, -0.025F, 0, 1, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1992F, 5.5174F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1091F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 33, -0.5F, -1.2F, -0.025F, 1, 1, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 15, 33, -0.5F, -0.5F, -0.025F, 1, 1, 6, -0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.375F, -1.6F, -0.025F);
        this.tail3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0742F, -0.0436F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 0, 0.0F, -0.5F, 0.0F, 0, 2, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.375F, -1.6F, -0.025F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0742F, 0.0436F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 42, 0, 0.0F, -0.5F, 0.0F, 0, 2, 6, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.15F, 5.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2225F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 30, 33, -0.5F, -0.45F, -0.025F, 1, 1, 6, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.7F, -1.1809F, 2.9779F);
        this.tail4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 8, 0.7F, -0.675F, -3.05F, 0, 2, 6, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.65F, -2.55F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 23, 10, -2.5F, -0.05F, -4.0F, 5, 3, 4, -0.006F, false));
        this.body.cubeList.add(new ModelBox(body, 34, 27, -2.0F, -0.45F, -4.0F, 4, 1, 4, -0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.0875F, -3.5F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -3.0F, 0.0375F, -6.0F, 6, 3, 6, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 18, -2.5F, 2.4375F, -6.0F, 5, 1, 6, -0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 10, -2.5F, -0.4375F, -6.0F, 5, 1, 6, -0.003F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0502F, -5.2828F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0873F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 2.1294F, -2.9268F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 41, -2.0F, -1.45F, -0.125F, 4, 2, 3, 0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.1182F, -2.7143F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0698F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 47, -1.0F, -0.4F, -0.3F, 4, 1, 3, 0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -0.0127F, 0.2828F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 27, -2.0F, 0.0F, -3.3F, 5, 2, 3, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(1.8781F, 1.709F, -1.7941F);
        this.body3.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0678F, -0.4755F, 0.6817F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 55, 15, 0.0F, -0.7F, -1.0F, 3, 1, 2, 0.0F, false));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 56, 47, 0.0F, -0.3F, -1.0F, 3, 1, 2, -0.003F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(2.6817F, 0.0707F, 1.0183F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.2046F, 0.4489F, 0.8585F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 55, 19, 0.0F, -0.5F, -2.0F, 3, 1, 2, -0.006F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(2.5F, 0.0F, -1.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, -0.759F, 1.5107F, -0.6767F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 60, 61, 0.0F, -1.0F, -0.5F, 2, 2, 1, 0.003F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.8781F, 1.709F, -1.7941F);
        this.body3.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.0678F, 0.4755F, -0.6817F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 55, 15, -3.0F, -0.7F, -1.0F, 3, 1, 2, 0.0F, true));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 56, 47, -3.0F, -0.3F, -1.0F, 3, 1, 2, -0.003F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-2.6817F, 0.0707F, 1.0183F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.2046F, -0.4489F, -0.8585F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 55, 19, -3.0F, -0.5F, -2.0F, 3, 1, 2, -0.006F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-2.5F, 0.0F, -1.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, -0.759F, -1.5107F, 0.6767F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 60, 61, -2.0F, -1.0F, -0.5F, 2, 2, 1, 0.003F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.2219F, -2.1846F);
        this.body3.addChild(neck);
        this.setRotateAngle(neck, -0.2836F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 41, -1.5F, 0.006F, -3.5012F, 3, 2, 4, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 43, 47, -1.0F, 1.331F, -3.5012F, 2, 1, 4, -0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 0.281F, -4.5012F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0393F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 48, -2.0F, -0.35F, 1.0F, 2, 1, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0455F, -3.4228F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.3054F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 35, 54, -1.0F, 0.0005F, -0.9902F, 2, 1, 1, 0.006F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.7849F, -4.4924F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0218F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 8, -0.5F, 0.2F, -3.95F, 1, 1, 0, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 52, -0.5F, 0.0F, -4.05F, 1, 1, 4, 0.006F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.4376F, -2.5228F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 23, 59, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.131F, -1.9816F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3927F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 62, -0.5F, 0.0F, -1.0F, 2, 1, 1, 0.006F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.0005F, -0.9902F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 58, 44, -0.5F, 0.0F, -1.0F, 2, 1, 1, 0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.8869F, 0.9809F, -7.6086F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0335F, -0.2806F, -0.0608F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 59, 0.05F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.8188F, 1.4763F, -7.6141F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.011F, -0.1033F, -0.1355F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 35, 57, 0.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.6036F, 0.3921F, -2.0093F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2483F, -0.1226F, -0.1193F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 56, 56, 0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.621F, 0.2723F, -1.8787F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0611F, -0.1309F, -0.1222F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 60, 35, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.8869F, 0.9809F, -7.6086F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0335F, 0.2806F, 0.0608F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 30, 59, -1.05F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.629F, 0.2601F, -1.8285F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2506F, -0.1818F, -0.1346F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 30, 62, -0.9F, 0.2F, -2.4F, 0, 1, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.766F, 1.6875F, -6.1133F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0111F, -0.1294F, -0.1352F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 58, -0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.766F, 1.6875F, -6.1133F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0111F, 0.1294F, 0.1352F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 9, 58, 0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.8188F, 1.4763F, -7.6141F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.011F, 0.1033F, 0.1355F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 35, 57, -1.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.629F, 0.2601F, -1.8285F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2506F, 0.1818F, 0.1346F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 30, 62, 0.9F, 0.2F, -2.4F, 0, 1, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.6036F, 0.3921F, -2.0093F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2483F, 0.1226F, 0.1193F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 56, 56, -1.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.621F, 0.2723F, -1.8787F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0611F, 0.1309F, 0.1222F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 60, 35, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.9857F, -0.2999F);
        this.head.addChild(jaw);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.3545F, -4.5408F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0436F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 25, 8, -0.5F, -1.2F, -3.55F, 1, 1, 0, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 30, 47, -0.5F, -1.0F, -3.65F, 1, 1, 5, -0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0148F, -0.6903F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1309F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 60, 31, -0.5F, 0.0F, -3.0F, 1, 1, 2, -0.006F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 58, -1.0F, -0.75F, -1.3F, 2, 1, 2, -0.01F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 24, 54, -1.0F, 0.0F, -1.6F, 2, 1, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 1.2151F, -2.1461F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1527F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 55, 0, -1.0F, -1.0F, 0.0F, 2, 1, 3, -0.006F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.9121F, 1.3324F, -3.8304F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0287F, -0.0946F, -0.0687F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 16, 58, 0.1F, -1.2F, -4.275F, 0, 1, 3, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.4572F, 0.6966F, -1.6307F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0775F, -0.2207F, -0.0785F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 53, 57, 0.1F, -0.7F, -3.0F, 0, 1, 1, 0.0F, true));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 62, 26, 0.1F, -0.7F, -1.5F, 0, 1, 1, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.9121F, 1.3324F, -3.8304F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0287F, 0.0946F, 0.0687F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 16, 58, -0.1F, -1.2F, -4.275F, 0, 1, 3, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.621F, -0.7134F, -1.5789F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0611F, -0.1309F, -0.1222F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 53, 61, -1.0F, 0.8F, 0.0F, 1, 1, 2, -0.003F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.4572F, 0.6966F, -1.6307F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0766F, -0.1598F, -0.0737F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 44, 57, 0.0F, -0.5F, -3.0F, 1, 1, 3, -0.003F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.9121F, 1.3324F, -3.8304F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0288F, -0.1251F, -0.0678F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 51, 25, -0.1F, -1.0F, -4.375F, 1, 1, 4, -0.003F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.9121F, 1.3324F, -3.8304F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0288F, 0.1251F, 0.0678F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 51, 25, -0.9F, -1.0F, -4.375F, 1, 1, 4, -0.003F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(1.4572F, 0.6966F, -1.6307F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0775F, 0.2207F, 0.0785F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 62, 26, -0.1F, -0.7F, -1.5F, 0, 1, 1, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 53, 57, -0.1F, -0.7F, -3.0F, 0, 1, 1, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(1.4572F, 0.6966F, -1.6307F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0766F, 0.1598F, 0.0737F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 44, 57, -1.0F, -0.5F, -3.0F, 1, 1, 3, -0.003F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.621F, -0.7134F, -1.5789F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0611F, 0.1309F, 0.1222F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 53, 61, 0.0F, 0.8F, 0.0F, 1, 1, 2, -0.003F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.3872F, -3.5053F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.1658F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 56, 51, -0.5F, -1.0F, 0.0F, 1, 1, 3, -0.01F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5F, 0.0F, 3.0F);
        this.throat.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0873F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 55, 10, -0.5F, -1.0F, -0.025F, 2, 1, 3, -0.01F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, 0.4307F, -2.224F);
        this.head.addChild(eyes);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.3203F, 0.1086F, 0.152F);
        this.eyes.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.4384F, -0.2799F, 0.2069F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 62, 23, -1.05F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.3203F, 0.1086F, 0.152F);
        this.eyes.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.4384F, 0.2799F, -0.2069F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 62, 23, 0.05F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));


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
        this.main.offsetY = -1.0F;
        this.main.offsetX = -0.038F;
        this.main.rotateAngleY = (float)Math.toRadians(220);
        this.main.rotateAngleX = (float)Math.toRadians(18);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 2.33F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {

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

        EntityPrehistoricFloraIsisfordia proteros = (EntityPrehistoricFloraIsisfordia) e;

//        this.faceTarget(f3, f4, 10, neck1);
//        this.faceTarget(f3, f4, 10, neck2);
//        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, head};
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
        this.eyes.setScale(1,1,1);
        EntityPrehistoricFloraIsisfordia ee = (EntityPrehistoricFloraIsisfordia) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if(ee.getIsFast()) {
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
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.BASK_ANIMATION) {
            animBask(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }  else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.YAWN_ANIMATION) {
            animYawn(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        



    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIsisfordia entity = (EntityPrehistoricFloraIsisfordia) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-13.3125-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.0625-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -13.3125 + (((tickAnim - 3) / 4) * (-4.3386-(-13.3125)));
            yy = 0 + (((tickAnim - 3) / 4) * (0.2048-(0)));
            zz = -1.0625 + (((tickAnim - 3) / 4) * (-5.8262-(-1.0625)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -4.3386 + (((tickAnim - 7) / 3) * (-6.75-(-4.3386)));
            yy = 0.2048 + (((tickAnim - 7) / 3) * (0-(0.2048)));
            zz = -5.8262 + (((tickAnim - 7) / 3) * (-4.25-(-5.8262)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -6.75 + (((tickAnim - 10) / 4) * (-9.4063-(-6.75)));
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
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIsisfordia entity = (EntityPrehistoricFloraIsisfordia) entitylivingbaseIn;
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
            xx = 0 + (((tickAnim - 0) / 7) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 24.25 + (((tickAnim - 7) / 2) * (0-(24.25)));
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



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (4.25-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 4.25 + (((tickAnim - 9) / 6) * (0-(4.25)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.575-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0.575 + (((tickAnim - 7) / 2) * (0-(0.575)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIsisfordia entity = (EntityPrehistoricFloraIsisfordia) entitylivingbaseIn;
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
            yy = 0 + (((tickAnim - 0) / 10) * (-22.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 46.75 + (((tickAnim - 10) / 5) * (37.7615-(46.75)));
            yy = -22.25 + (((tickAnim - 10) / 5) * (6.1006-(-22.25)));
            zz = 0 + (((tickAnim - 10) / 5) * (-28.2248-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 37.7615 + (((tickAnim - 15) / 5) * (0-(37.7615)));
            yy = 6.1006 + (((tickAnim - 15) / 5) * (0-(6.1006)));
            zz = -28.2248 + (((tickAnim - 15) / 5) * (0-(-28.2248)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (46.75-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-22.25-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 46.75 + (((tickAnim - 30) / 5) * (37.7615-(46.75)));
            yy = -22.25 + (((tickAnim - 30) / 5) * (6.1006-(-22.25)));
            zz = 0 + (((tickAnim - 30) / 5) * (-28.2248-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 37.7615 + (((tickAnim - 35) / 5) * (0-(37.7615)));
            yy = 6.1006 + (((tickAnim - 35) / 5) * (17.25-(6.1006)));
            zz = -28.2248 + (((tickAnim - 35) / 5) * (0-(-28.2248)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 17.25 + (((tickAnim - 40) / 10) * (0-(17.25)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-1.0359-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-19.7622-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-12.5485-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -1.0359 + (((tickAnim - 10) / 5) * (1.299-(-1.0359)));
            yy = -19.7622 + (((tickAnim - 10) / 5) * (8.216-(-19.7622)));
            zz = -12.5485 + (((tickAnim - 10) / 5) * (-2.0119-(-12.5485)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1.299 + (((tickAnim - 15) / 5) * (0-(1.299)));
            yy = 8.216 + (((tickAnim - 15) / 5) * (0-(8.216)));
            zz = -2.0119 + (((tickAnim - 15) / 5) * (0-(-2.0119)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-1.0359-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-19.7622-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-12.5485-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -1.0359 + (((tickAnim - 30) / 5) * (1.299-(-1.0359)));
            yy = -19.7622 + (((tickAnim - 30) / 5) * (8.216-(-19.7622)));
            zz = -12.5485 + (((tickAnim - 30) / 5) * (-2.0119-(-12.5485)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1.299 + (((tickAnim - 35) / 5) * (0-(1.299)));
            yy = 8.216 + (((tickAnim - 35) / 5) * (1-(8.216)));
            zz = -2.0119 + (((tickAnim - 35) / 5) * (0-(-2.0119)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 40) / 10) * (0-(1)));
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
            yy = 0 + (((tickAnim - 0) / 10) * (-74.559-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (48.7957-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 25.587 + (((tickAnim - 10) / 5) * (23.8371-(25.587)));
            yy = -74.559 + (((tickAnim - 10) / 5) * (-78.5547-(-74.559)));
            zz = 48.7957 + (((tickAnim - 10) / 5) * (45.7739-(48.7957)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 23.8371 + (((tickAnim - 15) / 5) * (0-(23.8371)));
            yy = -78.5547 + (((tickAnim - 15) / 5) * (0-(-78.5547)));
            zz = 45.7739 + (((tickAnim - 15) / 5) * (0-(45.7739)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (25.587-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-74.559-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (48.7957-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 25.587 + (((tickAnim - 30) / 5) * (23.8371-(25.587)));
            yy = -74.559 + (((tickAnim - 30) / 5) * (-78.5547-(-74.559)));
            zz = 48.7957 + (((tickAnim - 30) / 5) * (45.7739-(48.7957)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 23.8371 + (((tickAnim - 35) / 5) * (0-(23.8371)));
            yy = -78.5547 + (((tickAnim - 35) / 5) * (-15.25-(-78.5547)));
            zz = 45.7739 + (((tickAnim - 35) / 5) * (0-(45.7739)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -15.25 + (((tickAnim - 40) / 10) * (0-(-15.25)));
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
            xx = 0 + (((tickAnim - 10) / 5) * (-0.725-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.725 + (((tickAnim - 15) / 5) * (0-(-0.725)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (-0.725-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -0.725 + (((tickAnim - 35) / 5) * (0-(-0.725)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 10) * (5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 5 + (((tickAnim - 10) / 10) * (0-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (5-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 5 + (((tickAnim - 30) / 10) * (0-(5)));
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
            zz = 0 + (((tickAnim - 0) / 10) * (13.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 13.75 + (((tickAnim - 10) / 10) * (0-(13.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (13.75-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 13.75 + (((tickAnim - 30) / 10) * (0-(13.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12 + (((tickAnim - 10) / 10) * (0-(-12)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-12-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -12 + (((tickAnim - 30) / 10) * (0-(-12)));
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
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIsisfordia entity = (EntityPrehistoricFloraIsisfordia) entitylivingbaseIn;
        int animCycle = 600;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -2.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 20) / 10) * (-2.25-(-2.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 550) {
            xx = -2.25 + (((tickAnim - 30) / 520) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 30) / 520) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 520) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 570) {
            xx = -2.25 + (((tickAnim - 550) / 20) * (2.15-(-2.25)));
            yy = 0 + (((tickAnim - 550) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 20) * (0-(0)));
        }
        else if (tickAnim >= 570 && tickAnim < 600) {
            xx = 2.15 + (((tickAnim - 570) / 30) * (0-(2.15)));
            yy = 0 + (((tickAnim - 570) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 570) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-3.45-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.45-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -3.45 + (((tickAnim - 20) / 10) * (-3.75-(-3.45)));
            zz = -3.45 + (((tickAnim - 20) / 10) * (-4.025-(-3.45)));
        }
        else if (tickAnim >= 30 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 30) / 520) * (0-(0)));
            yy = -3.75 + (((tickAnim - 30) / 520) * (-3.75-(-3.75)));
            zz = -4.025 + (((tickAnim - 30) / 520) * (-4.025-(-4.025)));
        }
        else if (tickAnim >= 550 && tickAnim < 570) {
            xx = 0 + (((tickAnim - 550) / 20) * (0-(0)));
            yy = -3.75 + (((tickAnim - 550) / 20) * (-2.125-(-3.75)));
            zz = -4.025 + (((tickAnim - 550) / 20) * (-3.675-(-4.025)));
        }
        else if (tickAnim >= 570 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 570) / 30) * (0-(0)));
            yy = -2.125 + (((tickAnim - 570) / 30) * (0-(-2.125)));
            zz = -3.675 + (((tickAnim - 570) / 30) * (0-(-3.675)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (44.7084-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-69.4054-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-12.2822-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 44.7084 + (((tickAnim - 20) / 10) * (48.7915-(44.7084)));
            yy = -69.4054 + (((tickAnim - 20) / 10) * (-72.1302-(-69.4054)));
            zz = -12.2822 + (((tickAnim - 20) / 10) * (-18.3488-(-12.2822)));
        }
        else if (tickAnim >= 30 && tickAnim < 550) {
            xx = 48.7915 + (((tickAnim - 30) / 520) * (48.7915-(48.7915)));
            yy = -72.1302 + (((tickAnim - 30) / 520) * (-72.1302-(-72.1302)));
            zz = -18.3488 + (((tickAnim - 30) / 520) * (-18.3488-(-18.3488)));
        }
        else if (tickAnim >= 550 && tickAnim < 575) {
            xx = 48.7915 + (((tickAnim - 550) / 25) * (40.9884-(48.7915)));
            yy = -72.1302 + (((tickAnim - 550) / 25) * (-28.8055-(-72.1302)));
            zz = -18.3488 + (((tickAnim - 550) / 25) * (8.3608-(-18.3488)));
        }
        else if (tickAnim >= 575 && tickAnim < 583) {
            xx = 40.9884 + (((tickAnim - 575) / 8) * (7.8708-(40.9884)));
            yy = -28.8055 + (((tickAnim - 575) / 8) * (1.0677-(-28.8055)));
            zz = 8.3608 + (((tickAnim - 575) / 8) * (-34.1508-(8.3608)));
        }
        else if (tickAnim >= 583 && tickAnim < 590) {
            xx = 7.8708 + (((tickAnim - 583) / 7) * (-1.3153-(7.8708)));
            yy = 1.0677 + (((tickAnim - 583) / 7) * (-18.6351-(1.0677)));
            zz = -34.1508 + (((tickAnim - 583) / 7) * (-14.9474-(-34.1508)));
        }
        else if (tickAnim >= 590 && tickAnim < 600) {
            xx = -1.3153 + (((tickAnim - 590) / 10) * (0-(-1.3153)));
            yy = -18.6351 + (((tickAnim - 590) / 10) * (0-(-18.6351)));
            zz = -14.9474 + (((tickAnim - 590) / 10) * (0-(-14.9474)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 20) / 530) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 530) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 530) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 575) {
            xx = 0 + (((tickAnim - 550) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 550) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 25) * (15.25-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 583) {
            xx = 0 + (((tickAnim - 575) / 8) * (-11.0246-(0)));
            yy = 0 + (((tickAnim - 575) / 8) * (-19.4311-(0)));
            zz = 15.25 + (((tickAnim - 575) / 8) * (14.7597-(15.25)));
        }
        else if (tickAnim >= 583 && tickAnim < 590) {
            xx = -11.0246 + (((tickAnim - 583) / 7) * (0-(-11.0246)));
            yy = -19.4311 + (((tickAnim - 583) / 7) * (0-(-19.4311)));
            zz = 14.7597 + (((tickAnim - 583) / 7) * (12.75-(14.7597)));
        }
        else if (tickAnim >= 590 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 590) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 590) / 10) * (0-(0)));
            zz = 12.75 + (((tickAnim - 590) / 10) * (0-(12.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (39.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-39-(0)));
            yy = 39.5 + (((tickAnim - 10) / 5) * (12-(39.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -39 + (((tickAnim - 15) / 5) * (0-(-39)));
            yy = 12 + (((tickAnim - 15) / 5) * (-63.5-(12)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 20) / 530) * (0-(0)));
            yy = -63.5 + (((tickAnim - 20) / 530) * (-63.5-(-63.5)));
            zz = 0 + (((tickAnim - 20) / 530) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 575) {
            xx = 0 + (((tickAnim - 550) / 25) * (0-(0)));
            yy = -63.5 + (((tickAnim - 550) / 25) * (-91.25-(-63.5)));
            zz = 0 + (((tickAnim - 550) / 25) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 583) {
            xx = 0 + (((tickAnim - 575) / 8) * (0-(0)));
            yy = -91.25 + (((tickAnim - 575) / 8) * (-81.38-(-91.25)));
            zz = 0 + (((tickAnim - 575) / 8) * (0-(0)));
        }
        else if (tickAnim >= 583 && tickAnim < 590) {
            xx = 0 + (((tickAnim - 583) / 7) * (0-(0)));
            yy = -81.38 + (((tickAnim - 583) / 7) * (10.5-(-81.38)));
            zz = 0 + (((tickAnim - 583) / 7) * (0-(0)));
        }
        else if (tickAnim >= 590 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 590) / 10) * (0-(0)));
            yy = 10.5 + (((tickAnim - 590) / 10) * (0-(10.5)));
            zz = 0 + (((tickAnim - 590) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.1019-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (37.957-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (18.6092-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.1019 + (((tickAnim - 10) / 10) * (43.8187-(17.1019)));
            yy = 37.957 + (((tickAnim - 10) / 10) * (68.7116-(37.957)));
            zz = 18.6092 + (((tickAnim - 10) / 10) * (10.9137-(18.6092)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 43.8187 + (((tickAnim - 20) / 10) * (49.0002-(43.8187)));
            yy = 68.7116 + (((tickAnim - 20) / 10) * (72.2517-(68.7116)));
            zz = 10.9137 + (((tickAnim - 20) / 10) * (18.651-(10.9137)));
        }
        else if (tickAnim >= 30 && tickAnim < 550) {
            xx = 49.0002 + (((tickAnim - 30) / 520) * (49.0002-(49.0002)));
            yy = 72.2517 + (((tickAnim - 30) / 520) * (72.2517-(72.2517)));
            zz = 18.651 + (((tickAnim - 30) / 520) * (18.651-(18.651)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 49.0002 + (((tickAnim - 550) / 8) * (35.0398-(49.0002)));
            yy = 72.2517 + (((tickAnim - 550) / 8) * (47.3014-(72.2517)));
            zz = 18.651 + (((tickAnim - 550) / 8) * (54.3585-(18.651)));
        }
        else if (tickAnim >= 558 && tickAnim < 565) {
            xx = 35.0398 + (((tickAnim - 558) / 7) * (5.1191-(35.0398)));
            yy = 47.3014 + (((tickAnim - 558) / 7) * (26.3647-(47.3014)));
            zz = 54.3585 + (((tickAnim - 558) / 7) * (52.3562-(54.3585)));
        }
        else if (tickAnim >= 565 && tickAnim < 600) {
            xx = 5.1191 + (((tickAnim - 565) / 35) * (0-(5.1191)));
            yy = 26.3647 + (((tickAnim - 565) / 35) * (0-(26.3647)));
            zz = 52.3562 + (((tickAnim - 565) / 35) * (0-(52.3562)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 20) / 530) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 530) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 530) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 550) / 8) * (4.3587-(0)));
            yy = 0 + (((tickAnim - 550) / 8) * (-5.9337-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (14.3144-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 565) {
            xx = 4.3587 + (((tickAnim - 558) / 7) * (6.0722-(4.3587)));
            yy = -5.9337 + (((tickAnim - 558) / 7) * (-10.2468-(-5.9337)));
            zz = 14.3144 + (((tickAnim - 558) / 7) * (-34.6059-(14.3144)));
        }
        else if (tickAnim >= 565 && tickAnim < 600) {
            xx = 6.0722 + (((tickAnim - 565) / 35) * (0-(6.0722)));
            yy = -10.2468 + (((tickAnim - 565) / 35) * (0-(-10.2468)));
            zz = -34.6059 + (((tickAnim - 565) / 35) * (0-(-34.6059)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-17.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-39-(0)));
            yy = -17.5 + (((tickAnim - 10) / 5) * (12-(-17.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -39 + (((tickAnim - 15) / 5) * (0-(-39)));
            yy = 12 + (((tickAnim - 15) / 5) * (63.5-(12)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 20) / 530) * (0-(0)));
            yy = 63.5 + (((tickAnim - 20) / 530) * (63.5-(63.5)));
            zz = 0 + (((tickAnim - 20) / 530) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 565) {
            xx = 0 + (((tickAnim - 550) / 15) * (15.0399-(0)));
            yy = 63.5 + (((tickAnim - 550) / 15) * (-4.4569-(63.5)));
            zz = 0 + (((tickAnim - 550) / 15) * (-14.0443-(0)));
        }
        else if (tickAnim >= 565 && tickAnim < 600) {
            xx = 15.0399 + (((tickAnim - 565) / 35) * (0-(15.0399)));
            yy = -4.4569 + (((tickAnim - 565) / 35) * (0-(-4.4569)));
            zz = -14.0443 + (((tickAnim - 565) / 35) * (0-(-14.0443)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 550) {
            xx = 11.75 + (((tickAnim - 20) / 530) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 20) / 530) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 530) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 570) {
            xx = 11.75 + (((tickAnim - 550) / 20) * (0-(11.75)));
            yy = 0 + (((tickAnim - 550) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 20) * (0-(0)));
        }
        else if (tickAnim >= 570 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 570) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 570) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 570) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11.7686-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5.4868-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.3848-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 11.7686 + (((tickAnim - 20) / 10) * (6.7658-(11.7686)));
            yy = -5.4868 + (((tickAnim - 20) / 10) * (-6.9865-(-5.4868)));
            zz = -0.3848 + (((tickAnim - 20) / 10) * (-0.359-(-0.3848)));
        }
        else if (tickAnim >= 30 && tickAnim < 73) {
            xx = 6.7658 + (((tickAnim - 30) / 43) * (6.7712-(6.7658)));
            yy = -6.9865 + (((tickAnim - 30) / 43) * (-3.4872-(-6.9865)));
            zz = -0.359 + (((tickAnim - 30) / 43) * (-0.4191-(-0.359)));
        }
        else if (tickAnim >= 73 && tickAnim < 550) {
            xx = 6.7712 + (((tickAnim - 73) / 477) * (6.7712-(6.7712)));
            yy = -3.4872 + (((tickAnim - 73) / 477) * (-3.4872-(-3.4872)));
            zz = -0.4191 + (((tickAnim - 73) / 477) * (-0.4191-(-0.4191)));
        }
        else if (tickAnim >= 550 && tickAnim < 570) {
            xx = 6.7712 + (((tickAnim - 550) / 20) * (4.7075-(6.7712)));
            yy = -3.4872 + (((tickAnim - 550) / 20) * (-20.7201-(-3.4872)));
            zz = -0.4191 + (((tickAnim - 550) / 20) * (-1.1357-(-0.4191)));
        }
        else if (tickAnim >= 570 && tickAnim < 585) {
            xx = 4.7075 + (((tickAnim - 570) / 15) * (-1.4705-(4.7075)));
            yy = -20.7201 + (((tickAnim - 570) / 15) * (-15.9858-(-20.7201)));
            zz = -1.1357 + (((tickAnim - 570) / 15) * (0.6807-(-1.1357)));
        }
        else if (tickAnim >= 585 && tickAnim < 600) {
            xx = -1.4705 + (((tickAnim - 585) / 15) * (0-(-1.4705)));
            yy = -15.9858 + (((tickAnim - 585) / 15) * (0-(-15.9858)));
            zz = 0.6807 + (((tickAnim - 585) / 15) * (0-(0.6807)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.8415-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.0007-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.083-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.8415 + (((tickAnim - 10) / 10) * (-1.6027-(-0.8415)));
            yy = -2.0007 + (((tickAnim - 10) / 10) * (-14.4544-(-2.0007)));
            zz = -0.083 + (((tickAnim - 10) / 10) * (-1.1623-(-0.083)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.6027 + (((tickAnim - 20) / 10) * (-1.6944-(-1.6027)));
            yy = -14.4544 + (((tickAnim - 20) / 10) * (-8.9721-(-14.4544)));
            zz = -1.1623 + (((tickAnim - 20) / 10) * (-0.7118-(-1.1623)));
        }
        else if (tickAnim >= 30 && tickAnim < 73) {
            xx = -1.6944 + (((tickAnim - 30) / 43) * (-1.7314-(-1.6944)));
            yy = -8.9721 + (((tickAnim - 30) / 43) * (-5.2339-(-8.9721)));
            zz = -0.7118 + (((tickAnim - 30) / 43) * (-0.4129-(-0.7118)));
        }
        else if (tickAnim >= 73 && tickAnim < 550) {
            xx = -1.7314 + (((tickAnim - 73) / 477) * (-1.7314-(-1.7314)));
            yy = -5.2339 + (((tickAnim - 73) / 477) * (-5.2339-(-5.2339)));
            zz = -0.4129 + (((tickAnim - 73) / 477) * (-0.4129-(-0.4129)));
        }
        else if (tickAnim >= 550 && tickAnim < 565) {
            xx = -1.7314 + (((tickAnim - 550) / 15) * (4.8495-(-1.7314)));
            yy = -5.2339 + (((tickAnim - 550) / 15) * (-9.5205-(-5.2339)));
            zz = -0.4129 + (((tickAnim - 550) / 15) * (-1.4982-(-0.4129)));
        }
        else if (tickAnim >= 565 && tickAnim < 585) {
            xx = 4.8495 + (((tickAnim - 565) / 20) * (4.162-(4.8495)));
            yy = -9.5205 + (((tickAnim - 565) / 20) * (-34.145-(-9.5205)));
            zz = -1.4982 + (((tickAnim - 565) / 20) * (-5.7749-(-1.4982)));
        }
        else if (tickAnim >= 585 && tickAnim < 600) {
            xx = 4.162 + (((tickAnim - 585) / 15) * (0-(4.162)));
            yy = -34.145 + (((tickAnim - 585) / 15) * (0-(-34.145)));
            zz = -5.7749 + (((tickAnim - 585) / 15) * (0-(-5.7749)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.072-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (16.398-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.4-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -7.072 + (((tickAnim - 10) / 10) * (-14.5425-(-7.072)));
            yy = 16.398 + (((tickAnim - 10) / 10) * (-12.4941-(16.398)));
            zz = 2.4 + (((tickAnim - 10) / 10) * (0.388-(2.4)));
        }
        else if (tickAnim >= 20 && tickAnim < 73) {
            xx = -14.5425 + (((tickAnim - 20) / 53) * (-14.0087-(-14.5425)));
            yy = -12.4941 + (((tickAnim - 20) / 53) * (-6.7484-(-12.4941)));
            zz = 0.388 + (((tickAnim - 20) / 53) * (0.1478-(0.388)));
        }
        else if (tickAnim >= 73 && tickAnim < 550) {
            xx = -14.0087 + (((tickAnim - 73) / 477) * (-14.0087-(-14.0087)));
            yy = -6.7484 + (((tickAnim - 73) / 477) * (-6.7484-(-6.7484)));
            zz = 0.1478 + (((tickAnim - 73) / 477) * (0.1478-(0.1478)));
        }
        else if (tickAnim >= 550 && tickAnim < 564) {
            xx = -14.0087 + (((tickAnim - 550) / 14) * (-13.6512-(-14.0087)));
            yy = -6.7484 + (((tickAnim - 550) / 14) * (27.8629-(-6.7484)));
            zz = 0.1478 + (((tickAnim - 550) / 14) * (-0.4184-(0.1478)));
        }
        else if (tickAnim >= 564 && tickAnim < 585) {
            xx = -13.6512 + (((tickAnim - 564) / 21) * (-6.6308-(-13.6512)));
            yy = 27.8629 + (((tickAnim - 564) / 21) * (-12.3742-(27.8629)));
            zz = -0.4184 + (((tickAnim - 564) / 21) * (-1.2919-(-0.4184)));
        }
        else if (tickAnim >= 585 && tickAnim < 600) {
            xx = -6.6308 + (((tickAnim - 585) / 15) * (0-(-6.6308)));
            yy = -12.3742 + (((tickAnim - 585) / 15) * (0-(-12.3742)));
            zz = -1.2919 + (((tickAnim - 585) / 15) * (0-(-1.2919)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 0) / 550) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 550) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 550) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 570) {
            xx = 0 + (((tickAnim - 550) / 20) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 550) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 20) * (0-(0)));
        }
        else if (tickAnim >= 570 && tickAnim < 600) {
            xx = -2.75 + (((tickAnim - 570) / 30) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 570) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 570) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3.2527-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.4845-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.2153-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 3.2527 + (((tickAnim - 20) / 10) * (-5.7473-(3.2527)));
            yy = -1.4845 + (((tickAnim - 20) / 10) * (-1.4845-(-1.4845)));
            zz = -0.2153 + (((tickAnim - 20) / 10) * (-0.2153-(-0.2153)));
        }
        else if (tickAnim >= 30 && tickAnim < 550) {
            xx = -5.7473 + (((tickAnim - 30) / 520) * (-5.7473-(-5.7473)));
            yy = -1.4845 + (((tickAnim - 30) / 520) * (-1.4845-(-1.4845)));
            zz = -0.2153 + (((tickAnim - 30) / 520) * (-0.2153-(-0.2153)));
        }
        else if (tickAnim >= 550 && tickAnim < 600) {
            xx = -5.7473 + (((tickAnim - 550) / 50) * (0-(-5.7473)));
            yy = -1.4845 + (((tickAnim - 550) / 50) * (0-(-1.4845)));
            zz = -0.2153 + (((tickAnim - 550) / 50) * (0-(-0.2153)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12.013-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-3.474-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.427-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 550) {
            xx = 12.013 + (((tickAnim - 20) / 530) * (12.013-(12.013)));
            yy = -3.474 + (((tickAnim - 20) / 530) * (-3.474-(-3.474)));
            zz = -0.427 + (((tickAnim - 20) / 530) * (-0.427-(-0.427)));
        }
        else if (tickAnim >= 550 && tickAnim < 570) {
            xx = 12.013 + (((tickAnim - 550) / 20) * (0.7078-(12.013)));
            yy = -3.474 + (((tickAnim - 550) / 20) * (-2.0844-(-3.474)));
            zz = -0.427 + (((tickAnim - 550) / 20) * (-0.2562-(-0.427)));
        }
        else if (tickAnim >= 570 && tickAnim < 600) {
            xx = 0.7078 + (((tickAnim - 570) / 30) * (0-(0.7078)));
            yy = -2.0844 + (((tickAnim - 570) / 30) * (0-(-2.0844)));
            zz = -0.2562 + (((tickAnim - 570) / 30) * (0-(-0.2562)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-12.8866-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (41.6291-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-49.3863-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -12.8866 + (((tickAnim - 6) / 7) * (3.5069-(-12.8866)));
            yy = 41.6291 + (((tickAnim - 6) / 7) * (36.1327-(41.6291)));
            zz = -49.3863 + (((tickAnim - 6) / 7) * (-40.1907-(-49.3863)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 3.5069 + (((tickAnim - 13) / 7) * (36.5911-(3.5069)));
            yy = 36.1327 + (((tickAnim - 13) / 7) * (15.9336-(36.1327)));
            zz = -40.1907 + (((tickAnim - 13) / 7) * (-45.3388-(-40.1907)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 36.5911 + (((tickAnim - 20) / 10) * (74.4117-(36.5911)));
            yy = 15.9336 + (((tickAnim - 20) / 10) * (-15.1409-(15.9336)));
            zz = -45.3388 + (((tickAnim - 20) / 10) * (-27.1926-(-45.3388)));
        }
        else if (tickAnim >= 30 && tickAnim < 550) {
            xx = 74.4117 + (((tickAnim - 30) / 520) * (74.4117-(74.4117)));
            yy = -15.1409 + (((tickAnim - 30) / 520) * (-15.1409-(-15.1409)));
            zz = -27.1926 + (((tickAnim - 30) / 520) * (-27.1926-(-27.1926)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 74.4117 + (((tickAnim - 550) / 8) * (64.4079-(74.4117)));
            yy = -15.1409 + (((tickAnim - 550) / 8) * (-18.9494-(-15.1409)));
            zz = -27.1926 + (((tickAnim - 550) / 8) * (-56.9413-(-27.1926)));
        }
        else if (tickAnim >= 558 && tickAnim < 565) {
            xx = 64.4079 + (((tickAnim - 558) / 7) * (56.667-(64.4079)));
            yy = -18.9494 + (((tickAnim - 558) / 7) * (-27.9037-(-18.9494)));
            zz = -56.9413 + (((tickAnim - 558) / 7) * (-40.6927-(-56.9413)));
        }
        else if (tickAnim >= 565 && tickAnim < 585) {
            xx = 56.667 + (((tickAnim - 565) / 20) * (11.74-(56.667)));
            yy = -27.9037 + (((tickAnim - 565) / 20) * (10.5083-(-27.9037)));
            zz = -40.6927 + (((tickAnim - 565) / 20) * (-17.3554-(-40.6927)));
        }
        else if (tickAnim >= 585 && tickAnim < 593) {
            xx = 11.74 + (((tickAnim - 585) / 8) * (34.635-(11.74)));
            yy = 10.5083 + (((tickAnim - 585) / 8) * (-1.2368-(10.5083)));
            zz = -17.3554 + (((tickAnim - 585) / 8) * (-44.1543-(-17.3554)));
        }
        else if (tickAnim >= 593 && tickAnim < 600) {
            xx = 34.635 + (((tickAnim - 593) / 7) * (0-(34.635)));
            yy = -1.2368 + (((tickAnim - 593) / 7) * (0-(-1.2368)));
            zz = -44.1543 + (((tickAnim - 593) / 7) * (0-(-44.1543)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (6.0334-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (20.423-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-8.5329-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 6.0334 + (((tickAnim - 6) / 7) * (-8.2672-(6.0334)));
            yy = 20.423 + (((tickAnim - 6) / 7) * (-15.4044-(20.423)));
            zz = -8.5329 + (((tickAnim - 6) / 7) * (-2.0928-(-8.5329)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -8.2672 + (((tickAnim - 13) / 17) * (0-(-8.2672)));
            yy = -15.4044 + (((tickAnim - 13) / 17) * (-19.5-(-15.4044)));
            zz = -2.0928 + (((tickAnim - 13) / 17) * (0-(-2.0928)));
        }
        else if (tickAnim >= 30 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 30) / 520) * (0-(0)));
            yy = -19.5 + (((tickAnim - 30) / 520) * (-19.5-(-19.5)));
            zz = 0 + (((tickAnim - 30) / 520) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 550) / 8) * (-15.25-(0)));
            yy = -19.5 + (((tickAnim - 550) / 8) * (0-(-19.5)));
            zz = 0 + (((tickAnim - 550) / 8) * (-51.75-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 565) {
            xx = -15.25 + (((tickAnim - 558) / 7) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 558) / 7) * (0-(0)));
            zz = -51.75 + (((tickAnim - 558) / 7) * (0-(-51.75)));
        }
        else if (tickAnim >= 565 && tickAnim < 585) {
            xx = 0 + (((tickAnim - 565) / 20) * (11.75-(0)));
            yy = 0 + (((tickAnim - 565) / 20) * (7.75-(0)));
            zz = 0 + (((tickAnim - 565) / 20) * (0-(0)));
        }
        else if (tickAnim >= 585 && tickAnim < 593) {
            xx = 11.75 + (((tickAnim - 585) / 8) * (-8.6743-(11.75)));
            yy = 7.75 + (((tickAnim - 585) / 8) * (8.1792-(7.75)));
            zz = 0 + (((tickAnim - 585) / 8) * (-27.2539-(0)));
        }
        else if (tickAnim >= 593 && tickAnim < 600) {
            xx = -8.6743 + (((tickAnim - 593) / 7) * (0-(-8.6743)));
            yy = 8.1792 + (((tickAnim - 593) / 7) * (0-(8.1792)));
            zz = -27.2539 + (((tickAnim - 593) / 7) * (0-(-27.2539)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 600) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (26.7431-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-100.3372-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (63.5533-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 26.7431 + (((tickAnim - 6) / 7) * (-44.7083-(26.7431)));
            yy = -100.3372 + (((tickAnim - 6) / 7) * (-26.1449-(-100.3372)));
            zz = 63.5533 + (((tickAnim - 6) / 7) * (-13.4177-(63.5533)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -44.7083 + (((tickAnim - 13) / 17) * (-41.4963-(-44.7083)));
            yy = -26.1449 + (((tickAnim - 13) / 17) * (-96.7425-(-26.1449)));
            zz = -13.4177 + (((tickAnim - 13) / 17) * (29.05-(-13.4177)));
        }
        else if (tickAnim >= 30 && tickAnim < 550) {
            xx = -41.4963 + (((tickAnim - 30) / 520) * (-41.4963-(-41.4963)));
            yy = -96.7425 + (((tickAnim - 30) / 520) * (-96.7425-(-96.7425)));
            zz = 29.05 + (((tickAnim - 30) / 520) * (29.05-(29.05)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = -41.4963 + (((tickAnim - 550) / 8) * (-19.5811-(-41.4963)));
            yy = -96.7425 + (((tickAnim - 550) / 8) * (-54.8281-(-96.7425)));
            zz = 29.05 + (((tickAnim - 550) / 8) * (71.8901-(29.05)));
        }
        else if (tickAnim >= 558 && tickAnim < 565) {
            xx = -19.5811 + (((tickAnim - 558) / 7) * (-123.7392-(-19.5811)));
            yy = -54.8281 + (((tickAnim - 558) / 7) * (-41.1359-(-54.8281)));
            zz = 71.8901 + (((tickAnim - 558) / 7) * (-96.8441-(71.8901)));
        }
        else if (tickAnim >= 565 && tickAnim < 585) {
            xx = -123.7392 + (((tickAnim - 565) / 20) * (-36.8189-(-123.7392)));
            yy = -41.1359 + (((tickAnim - 565) / 20) * (-17.8049-(-41.1359)));
            zz = -96.8441 + (((tickAnim - 565) / 20) * (-24.1378-(-96.8441)));
        }
        else if (tickAnim >= 585 && tickAnim < 593) {
            xx = -36.8189 + (((tickAnim - 585) / 8) * (32.5515-(-36.8189)));
            yy = -17.8049 + (((tickAnim - 585) / 8) * (-92.8295-(-17.8049)));
            zz = -24.1378 + (((tickAnim - 585) / 8) * (50.4765-(-24.1378)));
        }
        else if (tickAnim >= 593 && tickAnim < 600) {
            xx = 32.5515 + (((tickAnim - 593) / 7) * (0-(32.5515)));
            yy = -92.8295 + (((tickAnim - 593) / 7) * (0-(-92.8295)));
            zz = 50.4765 + (((tickAnim - 593) / 7) * (0-(50.4765)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 0) / 558) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 558) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 558) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 565) {
            xx = 0 + (((tickAnim - 558) / 7) * (0.475-(0)));
            yy = 0 + (((tickAnim - 558) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 7) * (0-(0)));
        }
        else if (tickAnim >= 565 && tickAnim < 585) {
            xx = 0.475 + (((tickAnim - 565) / 20) * (-0.1-(0.475)));
            yy = 0 + (((tickAnim - 565) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 565) / 20) * (0-(0)));
        }
        else if (tickAnim >= 585 && tickAnim < 593) {
            xx = -0.1 + (((tickAnim - 585) / 8) * (0-(-0.1)));
            yy = 0 + (((tickAnim - 585) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 585) / 8) * (0-(0)));
        }
        else if (tickAnim >= 593 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 593) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 593) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 593) / 7) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (55.3203-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (22.5472-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (38.4473-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 55.3203 + (((tickAnim - 20) / 10) * (56.7603-(55.3203)));
            yy = 22.5472 + (((tickAnim - 20) / 10) * (18.4037-(22.5472)));
            zz = 38.4473 + (((tickAnim - 20) / 10) * (24.8878-(38.4473)));
        }
        else if (tickAnim >= 30 && tickAnim < 550) {
            xx = 56.7603 + (((tickAnim - 30) / 520) * (56.7603-(56.7603)));
            yy = 18.4037 + (((tickAnim - 30) / 520) * (18.4037-(18.4037)));
            zz = 24.8878 + (((tickAnim - 30) / 520) * (24.8878-(24.8878)));
        }
        else if (tickAnim >= 550 && tickAnim < 565) {
            xx = 56.7603 + (((tickAnim - 550) / 15) * (69.374-(56.7603)));
            yy = 18.4037 + (((tickAnim - 550) / 15) * (-7.6149-(18.4037)));
            zz = 24.8878 + (((tickAnim - 550) / 15) * (20.6337-(24.8878)));
        }
        else if (tickAnim >= 565 && tickAnim < 570) {
            xx = 69.374 + (((tickAnim - 565) / 5) * (59.3044-(69.374)));
            yy = -7.6149 + (((tickAnim - 565) / 5) * (-3.7563-(-7.6149)));
            zz = 20.6337 + (((tickAnim - 565) / 5) * (43.3846-(20.6337)));
        }
        else if (tickAnim >= 570 && tickAnim < 575) {
            xx = 59.3044 + (((tickAnim - 570) / 5) * (43.7999-(59.3044)));
            yy = -3.7563 + (((tickAnim - 570) / 5) * (-7.2252-(-3.7563)));
            zz = 43.3846 + (((tickAnim - 570) / 5) * (51.4351-(43.3846)));
        }
        else if (tickAnim >= 575 && tickAnim < 585) {
            xx = 43.7999 + (((tickAnim - 575) / 10) * (-4.1934-(43.7999)));
            yy = -7.2252 + (((tickAnim - 575) / 10) * (19.9001-(-7.2252)));
            zz = 51.4351 + (((tickAnim - 575) / 10) * (10.839-(51.4351)));
        }
        else if (tickAnim >= 585 && tickAnim < 600) {
            xx = -4.1934 + (((tickAnim - 585) / 15) * (0-(-4.1934)));
            yy = 19.9001 + (((tickAnim - 585) / 15) * (0-(19.9001)));
            zz = 10.839 + (((tickAnim - 585) / 15) * (0-(10.839)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (25.75-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 30) / 520) * (0-(0)));
            yy = 25.75 + (((tickAnim - 30) / 520) * (25.75-(25.75)));
            zz = 0 + (((tickAnim - 30) / 520) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 565) {
            xx = 0 + (((tickAnim - 550) / 15) * (0-(0)));
            yy = 25.75 + (((tickAnim - 550) / 15) * (28.27-(25.75)));
            zz = 0 + (((tickAnim - 550) / 15) * (0-(0)));
        }
        else if (tickAnim >= 565 && tickAnim < 570) {
            xx = 0 + (((tickAnim - 565) / 5) * (1.3109-(0)));
            yy = 28.27 + (((tickAnim - 565) / 5) * (20.2275-(28.27)));
            zz = 0 + (((tickAnim - 565) / 5) * (20.5329-(0)));
        }
        else if (tickAnim >= 570 && tickAnim < 575) {
            xx = 1.3109 + (((tickAnim - 570) / 5) * (4.9975-(1.3109)));
            yy = 20.2275 + (((tickAnim - 570) / 5) * (-24.7655-(20.2275)));
            zz = 20.5329 + (((tickAnim - 570) / 5) * (31.8473-(20.5329)));
        }
        else if (tickAnim >= 575 && tickAnim < 585) {
            xx = 4.9975 + (((tickAnim - 575) / 10) * (0-(4.9975)));
            yy = -24.7655 + (((tickAnim - 575) / 10) * (0-(-24.7655)));
            zz = 31.8473 + (((tickAnim - 575) / 10) * (0-(31.8473)));
        }
        else if (tickAnim >= 585 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 585) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 585) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 585) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 575) {
            xx = 0 + (((tickAnim - 0) / 575) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 575) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 575) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 585) {
            xx = 0 + (((tickAnim - 575) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 575) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-131.4809-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (24.6528-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (136.3726-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -131.4809 + (((tickAnim - 10) / 20) * (-46.3237-(-131.4809)));
            yy = 24.6528 + (((tickAnim - 10) / 20) * (92.1115-(24.6528)));
            zz = 136.3726 + (((tickAnim - 10) / 20) * (-33.2742-(136.3726)));
        }
        else if (tickAnim >= 30 && tickAnim < 550) {
            xx = -46.3237 + (((tickAnim - 30) / 520) * (-46.3237-(-46.3237)));
            yy = 92.1115 + (((tickAnim - 30) / 520) * (92.1115-(92.1115)));
            zz = -33.2742 + (((tickAnim - 30) / 520) * (-33.2742-(-33.2742)));
        }
        else if (tickAnim >= 550 && tickAnim < 565) {
            xx = -46.3237 + (((tickAnim - 550) / 15) * (-46.3237-(-46.3237)));
            yy = 92.1115 + (((tickAnim - 550) / 15) * (92.1115-(92.1115)));
            zz = -33.2742 + (((tickAnim - 550) / 15) * (-33.2742-(-33.2742)));
        }
        else if (tickAnim >= 565 && tickAnim < 575) {
            xx = -46.3237 + (((tickAnim - 565) / 10) * (-1.1731-(-46.3237)));
            yy = 92.1115 + (((tickAnim - 565) / 10) * (93.2693-(92.1115)));
            zz = -33.2742 + (((tickAnim - 565) / 10) * (-79.6117-(-33.2742)));
        }
        else if (tickAnim >= 575 && tickAnim < 585) {
            xx = -1.1731 + (((tickAnim - 575) / 10) * (-41.6248-(-1.1731)));
            yy = 93.2693 + (((tickAnim - 575) / 10) * (5.1823-(93.2693)));
            zz = -79.6117 + (((tickAnim - 575) / 10) * (26.7138-(-79.6117)));
        }
        else if (tickAnim >= 585 && tickAnim < 600) {
            xx = -41.6248 + (((tickAnim - 585) / 15) * (0-(-41.6248)));
            yy = 5.1823 + (((tickAnim - 585) / 15) * (0-(5.1823)));
            zz = 26.7138 + (((tickAnim - 585) / 15) * (0-(26.7138)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.9294-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-13.2462-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (3.452-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5.9294 + (((tickAnim - 20) / 10) * (10.8346-(5.9294)));
            yy = -13.2462 + (((tickAnim - 20) / 10) * (-16.9797-(-13.2462)));
            zz = 3.452 + (((tickAnim - 20) / 10) * (3.8153-(3.452)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 10.8346 + (((tickAnim - 30) / 15) * (10.8346-(10.8346)));
            yy = -16.9797 + (((tickAnim - 30) / 15) * (-16.9797-(-16.9797)));
            zz = 3.8153 + (((tickAnim - 30) / 15) * (3.8153-(3.8153)));
        }
        else if (tickAnim >= 45 && tickAnim < 58) {
            xx = 10.8346 + (((tickAnim - 45) / 13) * (10.0846-(10.8346)));
            yy = -16.9797 + (((tickAnim - 45) / 13) * (-16.9797-(-16.9797)));
            zz = 3.8153 + (((tickAnim - 45) / 13) * (3.8153-(3.8153)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 10.0846 + (((tickAnim - 58) / 2) * (10.0846-(10.0846)));
            yy = -16.9797 + (((tickAnim - 58) / 2) * (-16.9797-(-16.9797)));
            zz = 3.8153 + (((tickAnim - 58) / 2) * (3.8153-(3.8153)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 10.0846 + (((tickAnim - 60) / 13) * (10.8346-(10.0846)));
            yy = -16.9797 + (((tickAnim - 60) / 13) * (-16.9797-(-16.9797)));
            zz = 3.8153 + (((tickAnim - 60) / 13) * (3.8153-(3.8153)));
        }
        else if (tickAnim >= 73 && tickAnim < 79) {
            xx = 10.8346 + (((tickAnim - 73) / 6) * (10.8346-(10.8346)));
            yy = -16.9797 + (((tickAnim - 73) / 6) * (-16.9797-(-16.9797)));
            zz = 3.8153 + (((tickAnim - 73) / 6) * (3.8153-(3.8153)));
        }
        else if (tickAnim >= 79 && tickAnim < 80) {
            xx = 10.8346 + (((tickAnim - 79) / 1) * (-2.5154-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-15-(10.8346)));
            yy = -16.9797 + (((tickAnim - 79) / 1) * (-16.9797-(-16.9797)));
            zz = 3.8153 + (((tickAnim - 79) / 1) * (3.8153-(3.8153)));
        }
        else if (tickAnim >= 80 && tickAnim < 136) {
            xx = -2.5154-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-15 + (((tickAnim - 80) / 56) * (1.8346-(-2.5154-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-15)));
            yy = -16.9797 + (((tickAnim - 80) / 56) * (-16.9797-(-16.9797)));
            zz = 3.8153 + (((tickAnim - 80) / 56) * (3.8153-(3.8153)));
        }
        else if (tickAnim >= 136 && tickAnim < 280) {
            xx = 1.8346 + (((tickAnim - 136) / 144) * (1.8346-(1.8346)));
            yy = -16.9797 + (((tickAnim - 136) / 144) * (-16.9797-(-16.9797)));
            zz = 3.8153 + (((tickAnim - 136) / 144) * (3.8153-(3.8153)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 1.8346 + (((tickAnim - 280) / 20) * (-5.4154-(1.8346)));
            yy = -16.9797 + (((tickAnim - 280) / 20) * (-16.9797-(-16.9797)));
            zz = 3.8153 + (((tickAnim - 280) / 20) * (3.8153-(3.8153)));
        }
        else if (tickAnim >= 300 && tickAnim < 317) {
            xx = -5.4154 + (((tickAnim - 300) / 17) * (-5.4154-(-5.4154)));
            yy = -16.9797 + (((tickAnim - 300) / 17) * (-16.9797-(-16.9797)));
            zz = 3.8153 + (((tickAnim - 300) / 17) * (3.8153-(3.8153)));
        }
        else if (tickAnim >= 317 && tickAnim < 318) {
            xx = -5.4154 + (((tickAnim - 317) / 1) * (-0.5904-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(-5.4154)));
            yy = -16.9797 + (((tickAnim - 317) / 1) * (-16.9797-(-16.9797)));
            zz = 3.8153 + (((tickAnim - 317) / 1) * (3.8153-(3.8153)));
        }
        else if (tickAnim >= 318 && tickAnim < 365) {
            xx = -0.5904-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 318) / 47) * (0.7346-(-0.5904-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = -16.9797 + (((tickAnim - 318) / 47) * (-16.9797-(-16.9797)));
            zz = 3.8153 + (((tickAnim - 318) / 47) * (3.8153-(3.8153)));
        }
        else if (tickAnim >= 365 && tickAnim < 500) {
            xx = 0.7346 + (((tickAnim - 365) / 135) * (0.7346-(0.7346)));
            yy = -16.9797 + (((tickAnim - 365) / 135) * (-16.9797-(-16.9797)));
            zz = 3.8153 + (((tickAnim - 365) / 135) * (3.8153-(3.8153)));
        }
        else if (tickAnim >= 500 && tickAnim < 501) {
            xx = 0.7346 + (((tickAnim - 500) / 1) * (-0.1904-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(0.7346)));
            yy = -16.9797 + (((tickAnim - 500) / 1) * (-16.9797-(-16.9797)));
            zz = 3.8153 + (((tickAnim - 500) / 1) * (3.8153-(3.8153)));
        }
        else if (tickAnim >= 501 && tickAnim < 540) {
            xx = -0.1904-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 501) / 39) * (-2.5154-(-0.1904-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = -16.9797 + (((tickAnim - 501) / 39) * (-16.9797-(-16.9797)));
            zz = 3.8153 + (((tickAnim - 501) / 39) * (3.8153-(3.8153)));
        }
        else if (tickAnim >= 540 && tickAnim < 550) {
            xx = -2.5154 + (((tickAnim - 540) / 10) * (-2.5154-(-2.5154)));
            yy = -16.9797 + (((tickAnim - 540) / 10) * (-16.9797-(-16.9797)));
            zz = 3.8153 + (((tickAnim - 540) / 10) * (3.8153-(3.8153)));
        }
        else if (tickAnim >= 550 && tickAnim < 570) {
            xx = -2.5154 + (((tickAnim - 550) / 20) * (11.9908-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(-2.5154)));
            yy = -16.9797 + (((tickAnim - 550) / 20) * (-10.1878-(-16.9797)));
            zz = 3.8153 + (((tickAnim - 550) / 20) * (2.2892-(3.8153)));
        }
        else if (tickAnim >= 570 && tickAnim < 600) {
            xx = 11.9908-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 570) / 30) * (0-(11.9908-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            yy = -10.1878 + (((tickAnim - 570) / 30) * (0-(-10.1878)));
            zz = 2.2892 + (((tickAnim - 570) / 30) * (0-(2.2892)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15.5 + (((tickAnim - 20) / 10) * (-16.2511-(-15.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0.0546-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-2.4994-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -16.2511 + (((tickAnim - 30) / 15) * (-16.2511-(-16.2511)));
            yy = 0.0546 + (((tickAnim - 30) / 15) * (0.0546-(0.0546)));
            zz = -2.4994 + (((tickAnim - 30) / 15) * (-2.4994-(-2.4994)));
        }
        else if (tickAnim >= 45 && tickAnim < 58) {
            xx = -16.2511 + (((tickAnim - 45) / 13) * (-15.0011-(-16.2511)));
            yy = 0.0546 + (((tickAnim - 45) / 13) * (0.0546-(0.0546)));
            zz = -2.4994 + (((tickAnim - 45) / 13) * (-2.4994-(-2.4994)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = -15.0011 + (((tickAnim - 58) / 2) * (-15.0011-(-15.0011)));
            yy = 0.0546 + (((tickAnim - 58) / 2) * (0.0546-(0.0546)));
            zz = -2.4994 + (((tickAnim - 58) / 2) * (-2.4994-(-2.4994)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = -15.0011 + (((tickAnim - 60) / 13) * (-16.2511-(-15.0011)));
            yy = 0.0546 + (((tickAnim - 60) / 13) * (0.0546-(0.0546)));
            zz = -2.4994 + (((tickAnim - 60) / 13) * (-2.4994-(-2.4994)));
        }
        else if (tickAnim >= 73 && tickAnim < 79) {
            xx = -16.2511 + (((tickAnim - 73) / 6) * (-16.2511-(-16.2511)));
            yy = 0.0546 + (((tickAnim - 73) / 6) * (0.0546-(0.0546)));
            zz = -2.4994 + (((tickAnim - 73) / 6) * (-2.4994-(-2.4994)));
        }
        else if (tickAnim >= 79 && tickAnim < 80) {
            xx = -16.2511 + (((tickAnim - 79) / 1) * (-16.2511-(-16.2511)));
            yy = 0.0546 + (((tickAnim - 79) / 1) * (0.0546-(0.0546)));
            zz = -2.4994 + (((tickAnim - 79) / 1) * (-2.4994-(-2.4994)));
        }
        else if (tickAnim >= 80 && tickAnim < 136) {
            xx = -16.2511 + (((tickAnim - 80) / 56) * (-25.7511-(-16.2511)));
            yy = 0.0546 + (((tickAnim - 80) / 56) * (0.0546-(0.0546)));
            zz = -2.4994 + (((tickAnim - 80) / 56) * (-2.4994-(-2.4994)));
        }
        else if (tickAnim >= 136 && tickAnim < 280) {
            xx = -25.7511 + (((tickAnim - 136) / 144) * (-25.7511-(-25.7511)));
            yy = 0.0546 + (((tickAnim - 136) / 144) * (0.0546-(0.0546)));
            zz = -2.4994 + (((tickAnim - 136) / 144) * (-2.4994-(-2.4994)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = -25.7511 + (((tickAnim - 280) / 20) * (-8.75-(-25.7511)));
            yy = 0.0546 + (((tickAnim - 280) / 20) * (0-(0.0546)));
            zz = -2.4994 + (((tickAnim - 280) / 20) * (0-(-2.4994)));
        }
        else if (tickAnim >= 300 && tickAnim < 317) {
            xx = -8.75 + (((tickAnim - 300) / 17) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 300) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 17) * (0-(0)));
        }
        else if (tickAnim >= 317 && tickAnim < 318) {
            xx = -8.75 + (((tickAnim - 317) / 1) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 317) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 317) / 1) * (0-(0)));
        }
        else if (tickAnim >= 318 && tickAnim < 365) {
            xx = -8.75 + (((tickAnim - 318) / 47) * (-22-(-8.75)));
            yy = 0 + (((tickAnim - 318) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 318) / 47) * (0-(0)));
        }
        else if (tickAnim >= 365 && tickAnim < 500) {
            xx = -22 + (((tickAnim - 365) / 135) * (-22-(-22)));
            yy = 0 + (((tickAnim - 365) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 365) / 135) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 501) {
            xx = -22 + (((tickAnim - 500) / 1) * (-22-(-22)));
            yy = 0 + (((tickAnim - 500) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 1) * (0-(0)));
        }
        else if (tickAnim >= 501 && tickAnim < 540) {
            xx = -22 + (((tickAnim - 501) / 39) * (0-(-22)));
            yy = 0 + (((tickAnim - 501) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 501) / 39) * (0-(0)));
        }
        else if (tickAnim >= 540 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 540) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 540) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 540) / 10) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 570) {
            xx = 0 + (((tickAnim - 550) / 20) * (-7.3804-(0)));
            yy = 0 + (((tickAnim - 550) / 20) * (-0.9103-(0)));
            zz = 0 + (((tickAnim - 550) / 20) * (-0.9189-(0)));
        }
        else if (tickAnim >= 570 && tickAnim < 600) {
            xx = -7.3804 + (((tickAnim - 570) / 30) * (0-(-7.3804)));
            yy = -0.9103 + (((tickAnim - 570) / 30) * (0-(-0.9103)));
            zz = -0.9189 + (((tickAnim - 570) / 30) * (0-(-0.9189)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 79 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 79) / 1) * (22.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*25-(0)));
            yy = 0 + (((tickAnim - 79) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 1) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 136) {
            xx = 22.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*25 + (((tickAnim - 80) / 56) * (24.5-(22.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*25)));
            yy = 0 + (((tickAnim - 80) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 56) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 280) {
            xx = 24.5 + (((tickAnim - 136) / 144) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 136) / 144) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 144) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 24.5 + (((tickAnim - 280) / 20) * (0-(24.5)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 317) {
            xx = 0 + (((tickAnim - 300) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 300) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 17) * (0-(0)));
        }
        else if (tickAnim >= 317 && tickAnim < 318) {
            xx = 0 + (((tickAnim - 317) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 317) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 317) / 1) * (0-(0)));
        }
        else if (tickAnim >= 318 && tickAnim < 365) {
            xx = 0 + (((tickAnim - 318) / 47) * (19-(0)));
            yy = 0 + (((tickAnim - 318) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 318) / 47) * (0-(0)));
        }
        else if (tickAnim >= 365 && tickAnim < 500) {
            xx = 19 + (((tickAnim - 365) / 135) * (19-(19)));
            yy = 0 + (((tickAnim - 365) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 365) / 135) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 501) {
            xx = 19 + (((tickAnim - 500) / 1) * (19-(19)));
            yy = 0 + (((tickAnim - 500) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 1) * (0-(0)));
        }
        else if (tickAnim >= 501 && tickAnim < 540) {
            xx = 19 + (((tickAnim - 501) / 39) * (0-(19)));
            yy = 0 + (((tickAnim - 501) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 501) / 39) * (0-(0)));
        }
        else if (tickAnim >= 540 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 540) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 540) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 540) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4 + (((tickAnim - 20) / 10) * (4.5-(4)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 550) {
            xx = 4.5 + (((tickAnim - 30) / 520) * (0-(4.5)));
            yy = 0 + (((tickAnim - 30) / 520) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 520) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 570) {
            xx = 0 + (((tickAnim - 550) / 20) * (3.25-(0)));
            yy = 0 + (((tickAnim - 550) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 20) * (0-(0)));
        }
        else if (tickAnim >= 570 && tickAnim < 600) {
            xx = 3.25 + (((tickAnim - 570) / 30) * (0-(3.25)));
            yy = 0 + (((tickAnim - 570) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 570) / 30) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 20) * (0.95-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0.95 + (((tickAnim - 20) / 10) * (0.805-(0.95)));
        }
        else if (tickAnim >= 30 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 30) / 250) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 250) * (0-(0)));
            zz = 0.805 + (((tickAnim - 30) / 250) * (0.805-(0.805)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = 0.805 + (((tickAnim - 280) / 20) * (0-(0.805)));
        }
        else if (tickAnim >= 300 && tickAnim < 348) {
            xx = 0 + (((tickAnim - 300) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 300) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 48) * (0-(0)));
        }
        else if (tickAnim >= 348 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 348) / 252) * (0-(0)));
            yy = 0 + (((tickAnim - 348) / 252) * (0-(0)));
            zz = 0 + (((tickAnim - 348) / 252) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 45) / 13) * (11.75-(0)));
            yy = 0 + (((tickAnim - 45) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 13) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 11.75 + (((tickAnim - 58) / 2) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 11.75 + (((tickAnim - 60) / 13) * (0-(11.75)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 73) / 63) * (11.75-(0)));
            yy = 0 + (((tickAnim - 73) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 63) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 280) {
            xx = 11.75 + (((tickAnim - 136) / 144) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 136) / 144) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 144) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 11.75 + (((tickAnim - 280) / 20) * (0-(11.75)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 300) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 300) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 20) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 320) / 30) * (14-(0)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 500) {
            xx = 14 + (((tickAnim - 350) / 150) * (14-(14)));
            yy = 0 + (((tickAnim - 350) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 150) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 540) {
            xx = 14 + (((tickAnim - 500) / 40) * (0-(14)));
            yy = 0 + (((tickAnim - 500) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 40) * (0-(0)));
        }
        else if (tickAnim >= 540 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 540) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 540) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 540) / 10) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 550) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 550) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eyes, eyes.rotateAngleX + (float) Math.toRadians(xx), eyes.rotateAngleY + (float) Math.toRadians(yy), eyes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 45) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 13) * (0.1-(0)));
            zz = 0 + (((tickAnim - 45) / 13) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 58) / 2) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            yy = 0.1 + (((tickAnim - 60) / 13) * (0-(0.1)));
            zz = 0 + (((tickAnim - 60) / 13) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 73) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 63) * (0.1-(0)));
            zz = 0 + (((tickAnim - 73) / 63) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 136) / 144) * (0-(0)));
            yy = 0.1 + (((tickAnim - 136) / 144) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 136) / 144) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            yy = 0.1 + (((tickAnim - 280) / 20) * (0-(0.1)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 300) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 300) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 20) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 30) * (0.1-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 350) / 150) * (0-(0)));
            yy = 0.1 + (((tickAnim - 350) / 150) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 350) / 150) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 540) {
            xx = 0 + (((tickAnim - 500) / 40) * (0-(0)));
            yy = 0.1 + (((tickAnim - 500) / 40) * (0-(0.1)));
            zz = 0 + (((tickAnim - 500) / 40) * (0-(0)));
        }
        else if (tickAnim >= 540 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 540) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 540) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 540) / 10) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 550) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 550) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyes.rotationPointX = this.eyes.rotationPointX + (float)(xx);
        this.eyes.rotationPointY = this.eyes.rotationPointY - (float)(yy);
        this.eyes.rotationPointZ = this.eyes.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 0) / 45) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 45) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 45) * (1-(1)));
        }
        else if (tickAnim >= 45 && tickAnim < 58) {
            xx = 1 + (((tickAnim - 45) / 13) * (1-(1)));
            yy = 1 + (((tickAnim - 45) / 13) * (0.0025-(1)));
            zz = 1 + (((tickAnim - 45) / 13) * (1-(1)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 58) / 2) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 58) / 2) * (0.0025-(0.0025)));
            zz = 1 + (((tickAnim - 58) / 2) * (1-(1)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 1 + (((tickAnim - 60) / 13) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 60) / 13) * (1-(0.0025)));
            zz = 1 + (((tickAnim - 60) / 13) * (1-(1)));
        }
        else if (tickAnim >= 73 && tickAnim < 136) {
            xx = 1 + (((tickAnim - 73) / 63) * (1-(1)));
            yy = 1 + (((tickAnim - 73) / 63) * (0.0025-(1)));
            zz = 1 + (((tickAnim - 73) / 63) * (1-(1)));
        }
        else if (tickAnim >= 136 && tickAnim < 280) {
            xx = 1 + (((tickAnim - 136) / 144) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 136) / 144) * (0.0025-(0.0025)));
            zz = 1 + (((tickAnim - 136) / 144) * (1-(1)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 1 + (((tickAnim - 280) / 20) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 280) / 20) * (1-(0.0025)));
            zz = 1 + (((tickAnim - 280) / 20) * (1-(1)));
        }
        else if (tickAnim >= 300 && tickAnim < 320) {
            xx = 1 + (((tickAnim - 300) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 300) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 300) / 20) * (1-(1)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 1 + (((tickAnim - 320) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 320) / 30) * (0.255-(1)));
            zz = 1 + (((tickAnim - 320) / 30) * (1-(1)));
        }
        else if (tickAnim >= 350 && tickAnim < 365) {
            xx = 1 + (((tickAnim - 350) / 15) * (1-(1)));
            yy = 0.255 + (((tickAnim - 350) / 15) * (0.0125-(0.255)));
            zz = 1 + (((tickAnim - 350) / 15) * (1-(1)));
        }
        else if (tickAnim >= 365 && tickAnim < 500) {
            xx = 1 + (((tickAnim - 365) / 135) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 365) / 135) * (0.0125-(0.0125)));
            zz = 1 + (((tickAnim - 365) / 135) * (1-(1)));
        }
        else if (tickAnim >= 500 && tickAnim < 540) {
            xx = 1 + (((tickAnim - 500) / 40) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 500) / 40) * (1-(0.0125)));
            zz = 1 + (((tickAnim - 500) / 40) * (1-(1)));
        }
        else if (tickAnim >= 540 && tickAnim < 550) {
            xx = 1 + (((tickAnim - 540) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 540) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 540) / 10) * (1-(1)));
        }
        else if (tickAnim >= 550 && tickAnim < 600) {
            xx = 1 + (((tickAnim - 550) / 50) * (1-(1)));
            yy = 1 + (((tickAnim - 550) / 50) * (1-(1)));
            zz = 1 + (((tickAnim - 550) / 50) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animYawn(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIsisfordia entity = (EntityPrehistoricFloraIsisfordia) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 55) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*10 + (((tickAnim - 0) / 55) * (-20.775-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-20-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*10)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -20.775-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-20 + (((tickAnim - 55) / 25) * (0-(-20.775-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-20)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20 + (((tickAnim - 0) / 55) * (-22.5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -22.5 + (((tickAnim - 55) / 25) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20 + (((tickAnim - 0) / 35) * (18.625-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 18.625 + (((tickAnim - 35) / 20) * (23.75-(18.625)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 23.75 + (((tickAnim - 55) / 25) * (0-(23.75)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 20) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 15) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 20) / 15) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 35) / 20) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 35) / 20) * (0.0325-(0.0325)));
            zz = 1 + (((tickAnim - 35) / 20) * (1-(1)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 55) / 25) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 55) / 25) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 55) / 25) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIsisfordia entity = (EntityPrehistoricFloraIsisfordia) entitylivingbaseIn;
        int animCycle = 51;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 21) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 0) / 21) * (16.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 52) {
            xx = 16.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40 + (((tickAnim - 21) / 31) * (0-(16.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40)));
            yy = 0 + (((tickAnim - 21) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 0) / 30) * (-0.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*20-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 52) {
            xx = -0.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*20 + (((tickAnim - 30) / 22) * (0-(-0.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*20)));
            yy = 0 + (((tickAnim - 30) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 14.75 + (((tickAnim - 10) / 10) * (0-(14.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -9.5 + (((tickAnim - 16) / 6) * (-5.75-(-9.5)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -5.75 + (((tickAnim - 22) / 5) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (4-(0)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 4 + (((tickAnim - 30) / 8) * (4-(4)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 52) {
            xx = 4 + (((tickAnim - 38) / 14) * (0-(4)));
            yy = 0 + (((tickAnim - 38) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.5))*0.03-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 17) / 9) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.5))*0.03 + (((tickAnim - 17) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.5))*0.03-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.5))*0.03)));
            zz = 0 + (((tickAnim - 17) / 9) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.5))*0.03 + (((tickAnim - 26) / 1) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.5))*0.03)));
            zz = 0 + (((tickAnim - 26) / 1) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 27) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraIsisfordia entity = (EntityPrehistoricFloraIsisfordia) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*1), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*3), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*3));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-0.2);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-20))*-0.4);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -13.3804 + (((tickAnim - 0) / 7) * (121.3219-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*-150-(-13.3804)));
            yy = -45.1123 + (((tickAnim - 0) / 7) * (-13.846-(-45.1123)));
            zz = -11.9664 + (((tickAnim - 0) / 7) * (-109.9606+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-80-(-11.9664)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 121.3219-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*-150 + (((tickAnim - 7) / 6) * (5.7816-(121.3219-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*-150)));
            yy = -13.846 + (((tickAnim - 7) / 6) * (9.6476-(-13.846)));
            zz = -109.9606+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-80 + (((tickAnim - 7) / 6) * (-3.911-(-109.9606+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-80)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 5.7816 + (((tickAnim - 13) / 12) * (-13.3804-(5.7816)));
            yy = 9.6476 + (((tickAnim - 13) / 12) * (-45.1123-(9.6476)));
            zz = -3.911 + (((tickAnim - 13) / 12) * (-11.9664-(-3.911)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 37.5177 + (((tickAnim - 0) / 6) * (11.2662-(37.5177)));
            yy = -11.1861 + (((tickAnim - 0) / 6) * (-56.0346-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(-11.1861)));
            zz = -11.3472 + (((tickAnim - 0) / 6) * (-10.6942-(-11.3472)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 11.2662 + (((tickAnim - 6) / 7) * (-9.2961-(11.2662)));
            yy = -56.0346-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 6) / 7) * (24.2205-(-56.0346-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
            zz = -10.6942 + (((tickAnim - 6) / 7) * (-22.1474-(-10.6942)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -9.2961 + (((tickAnim - 13) / 12) * (37.5177-(-9.2961)));
            yy = 24.2205 + (((tickAnim - 13) / 12) * (-11.1861-(24.2205)));
            zz = -22.1474 + (((tickAnim - 13) / 12) * (-11.3472-(-22.1474)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -0.3 + (((tickAnim - 0) / 6) * (-0.45-(-0.3)));
            yy = -0.65 + (((tickAnim - 0) / 6) * (-0.225-(-0.65)));
            zz = -0.1 + (((tickAnim - 0) / 6) * (-0.325-(-0.1)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -0.45 + (((tickAnim - 6) / 7) * (0-(-0.45)));
            yy = -0.225 + (((tickAnim - 6) / 7) * (0.375-(-0.225)));
            zz = -0.325 + (((tickAnim - 6) / 7) * (0-(-0.325)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (-0.3-(0)));
            yy = 0.375 + (((tickAnim - 13) / 12) * (-0.65-(0.375)));
            zz = 0 + (((tickAnim - 13) / 12) * (-0.1-(0)));
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
            xx = -2.5065 + (((tickAnim - 0) / 5) * (0-(-2.5065)));
            yy = -72.5098 + (((tickAnim - 0) / 5) * (252.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-550-(-72.5098)));
            zz = 3.0568 + (((tickAnim - 0) / 5) * (0-(3.0568)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (-1.9214-(0)));
            yy = 252.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-550 + (((tickAnim - 5) / 4) * (-23.9664-(252.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-550)));
            zz = 0 + (((tickAnim - 5) / 4) * (-4.5441-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -1.9214 + (((tickAnim - 9) / 4) * (-5.9551-(-1.9214)));
            yy = -23.9664 + (((tickAnim - 9) / 4) * (-36.1866-(-23.9664)));
            zz = -4.5441 + (((tickAnim - 9) / 4) * (5.153-(-4.5441)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -5.9551 + (((tickAnim - 13) / 4) * (-0.9177-(-5.9551)));
            yy = -36.1866 + (((tickAnim - 13) / 4) * (-12.3469-(-36.1866)));
            zz = 5.153 + (((tickAnim - 13) / 4) * (12.5271-(5.153)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -0.9177 + (((tickAnim - 17) / 8) * (-2.5065-(-0.9177)));
            yy = -12.3469 + (((tickAnim - 17) / 8) * (-72.5098-(-12.3469)));
            zz = 12.5271 + (((tickAnim - 17) / 8) * (3.0568-(12.5271)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.12-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.675-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -0.12 + (((tickAnim - 5) / 4) * (-0.3-(-0.12)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = -0.675 + (((tickAnim - 5) / 4) * (0-(-0.675)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -0.3 + (((tickAnim - 9) / 4) * (-0.175-(-0.3)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -0.175 + (((tickAnim - 13) / 4) * (0-(-0.175)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
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
            xx = 1.1804 + (((tickAnim - 0) / 13) * (-13.3804-(1.1804)));
            yy = -7.0576 + (((tickAnim - 0) / 13) * (45.1123-(-7.0576)));
            zz = -1.6233 + (((tickAnim - 0) / 13) * (11.9664-(-1.6233)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -13.3804 + (((tickAnim - 13) / 5) * (-107.8031-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-100-(-13.3804)));
            yy = 45.1123 + (((tickAnim - 13) / 5) * (25.196-(45.1123)));
            zz = 11.9664 + (((tickAnim - 13) / 5) * (150.3356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-150-(11.9664)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -107.8031-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-100 + (((tickAnim - 18) / 7) * (1.1804-(-107.8031-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-100)));
            yy = 25.196 + (((tickAnim - 18) / 7) * (-7.0576-(25.196)));
            zz = 150.3356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-150 + (((tickAnim - 18) / 7) * (-1.6233-(150.3356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-150)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -9.2961 + (((tickAnim - 0) / 13) * (37.5177-(-9.2961)));
            yy = -24.2205 + (((tickAnim - 0) / 13) * (11.1861-(-24.2205)));
            zz = 22.1474 + (((tickAnim - 0) / 13) * (11.3472-(22.1474)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 37.5177 + (((tickAnim - 13) / 5) * (11.2662-(37.5177)));
            yy = 11.1861 + (((tickAnim - 13) / 5) * (126.4096-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200-(11.1861)));
            zz = 11.3472 + (((tickAnim - 13) / 5) * (10.6942-(11.3472)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 11.2662 + (((tickAnim - 18) / 7) * (-9.2961-(11.2662)));
            yy = 126.4096-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200 + (((tickAnim - 18) / 7) * (-24.2205-(126.4096-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200)));
            zz = 10.6942 + (((tickAnim - 18) / 7) * (22.1474-(10.6942)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0.3-(0)));
            yy = 0.45 + (((tickAnim - 0) / 13) * (-0.65-(0.45)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.1-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0.3 + (((tickAnim - 13) / 5) * (0.875-(0.3)));
            yy = -0.65 + (((tickAnim - 13) / 5) * (-0.1-(-0.65)));
            zz = 0.1 + (((tickAnim - 13) / 5) * (-0.325-(0.1)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0.875 + (((tickAnim - 18) / 7) * (0-(0.875)));
            yy = -0.1 + (((tickAnim - 18) / 7) * (0.45-(-0.1)));
            zz = -0.325 + (((tickAnim - 18) / 7) * (0-(-0.325)));
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
            xx = -2.4212 + (((tickAnim - 0) / 5) * (-0.0172-(-2.4212)));
            yy = 36.6557 + (((tickAnim - 0) / 5) * (7.847-(36.6557)));
            zz = 5.6773 + (((tickAnim - 0) / 5) * (-10.8972-(5.6773)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -0.0172 + (((tickAnim - 5) / 8) * (-2.5065-(-0.0172)));
            yy = 7.847 + (((tickAnim - 5) / 8) * (72.5098-(7.847)));
            zz = -10.8972 + (((tickAnim - 5) / 8) * (-3.0568-(-10.8972)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -2.5065 + (((tickAnim - 13) / 5) * (0-(-2.5065)));
            yy = 72.5098 + (((tickAnim - 13) / 5) * (25.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*550-(72.5098)));
            zz = -3.0568 + (((tickAnim - 13) / 5) * (0-(-3.0568)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (-1.9214-(0)));
            yy = 25.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*550 + (((tickAnim - 18) / 4) * (6.4164-(25.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*550)));
            zz = 0 + (((tickAnim - 18) / 4) * (4.5441-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -1.9214 + (((tickAnim - 22) / 3) * (-2.4212-(-1.9214)));
            yy = 6.4164 + (((tickAnim - 22) / 3) * (36.6557-(6.4164)));
            zz = 4.5441 + (((tickAnim - 22) / 3) * (5.6773-(4.5441)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.25 + (((tickAnim - 0) / 5) * (0-(0.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0.12-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0.12 + (((tickAnim - 18) / 4) * (0-(0.12)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0.25-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*-1), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-7-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*-3), tail2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(9.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*4), tail3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-10), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*2), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-15), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*-5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*1), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*-2), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-20))*3), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-180))*-1));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-2))*-2), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-4), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-30))*-2));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 3.7428 + (((tickAnim - 0) / 13) * (37.25-(3.7428)));
            yy = 41.7835 + (((tickAnim - 0) / 13) * (-18.75-(41.7835)));
            zz = 1.5119 + (((tickAnim - 0) / 13) * (0-(1.5119)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 37.25 + (((tickAnim - 13) / 5) * (16.7499-(37.25)));
            yy = -18.75 + (((tickAnim - 13) / 5) * (-195.1961-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-280-(-18.75)));
            zz = 0 + (((tickAnim - 13) / 5) * (38.8371+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-90-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 16.7499 + (((tickAnim - 18) / 7) * (3.7428-(16.7499)));
            yy = -195.1961-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-280 + (((tickAnim - 18) / 7) * (41.7835-(-195.1961-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-280)));
            zz = 38.8371+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-90 + (((tickAnim - 18) / 7) * (1.5119-(38.8371+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-90)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4.5312 + (((tickAnim - 0) / 3) * (-4.3314-(-4.5312)));
            yy = 26.8951 + (((tickAnim - 0) / 3) * (11.2994-(26.8951)));
            zz = -17.0705 + (((tickAnim - 0) / 3) * (-18.6573-(-17.0705)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -4.3314 + (((tickAnim - 3) / 10) * (-10.774-(-4.3314)));
            yy = 11.2994 + (((tickAnim - 3) / 10) * (-24.738-(11.2994)));
            zz = -18.6573 + (((tickAnim - 3) / 10) * (-16.6374-(-18.6573)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -10.774 + (((tickAnim - 13) / 7) * (18.1294-(-10.774)));
            yy = -24.738 + (((tickAnim - 13) / 7) * (-195.5811-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-280-(-24.738)));
            zz = -16.6374 + (((tickAnim - 13) / 7) * (-12.3458-(-16.6374)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 18.1294 + (((tickAnim - 20) / 5) * (-4.5312-(18.1294)));
            yy = -195.5811-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-280 + (((tickAnim - 20) / 5) * (26.8951-(-195.5811-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-280)));
            zz = -12.3458 + (((tickAnim - 20) / 5) * (-17.0705-(-12.3458)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 24.5321 + (((tickAnim - 0) / 3) * (-6.3548-(24.5321)));
            yy = -74.1202 + (((tickAnim - 0) / 3) * (-29.6558-(-74.1202)));
            zz = 37.5733 + (((tickAnim - 0) / 3) * (1.0726-(37.5733)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -6.3548 + (((tickAnim - 3) / 3) * (-61.6846-(-6.3548)));
            yy = -29.6558 + (((tickAnim - 3) / 3) * (-12.7149-(-29.6558)));
            zz = 1.0726 + (((tickAnim - 3) / 3) * (-56.9083-(1.0726)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -61.6846 + (((tickAnim - 6) / 7) * (40.7937-(-61.6846)));
            yy = -12.7149 + (((tickAnim - 6) / 7) * (-58.0835-(-12.7149)));
            zz = -56.9083 + (((tickAnim - 6) / 7) * (43.9009-(-56.9083)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 40.7937 + (((tickAnim - 13) / 3) * (32.9716-(40.7937)));
            yy = -58.0835 + (((tickAnim - 13) / 3) * (-128.4177-(-58.0835)));
            zz = 43.9009 + (((tickAnim - 13) / 3) * (56.15-(43.9009)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 32.9716 + (((tickAnim - 16) / 4) * (27.9591-(32.9716)));
            yy = -128.4177 + (((tickAnim - 16) / 4) * (-138.1673-(-128.4177)));
            zz = 56.15 + (((tickAnim - 16) / 4) * (58.093-(56.15)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 27.9591 + (((tickAnim - 20) / 5) * (24.5321-(27.9591)));
            yy = -138.1673 + (((tickAnim - 20) / 5) * (-74.1202-(-138.1673)));
            zz = 58.093 + (((tickAnim - 20) / 5) * (37.5733-(58.093)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.375 + (((tickAnim - 0) / 3) * (0.15-(-0.375)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.4-(0)));
            zz = -0.05 + (((tickAnim - 0) / 3) * (0.525-(-0.05)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.15 + (((tickAnim - 3) / 3) * (-0.31-(0.15)));
            yy = -0.4 + (((tickAnim - 3) / 3) * (-0.45-(-0.4)));
            zz = 0.525 + (((tickAnim - 3) / 3) * (0.65-(0.525)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -0.31 + (((tickAnim - 6) / 3) * (-0.605-(-0.31)));
            yy = -0.45 + (((tickAnim - 6) / 3) * (-0.2-(-0.45)));
            zz = 0.65 + (((tickAnim - 6) / 3) * (0.22-(0.65)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -0.605 + (((tickAnim - 9) / 4) * (0.25-(-0.605)));
            yy = -0.2 + (((tickAnim - 9) / 4) * (0-(-0.2)));
            zz = 0.22 + (((tickAnim - 9) / 4) * (0-(0.22)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0.25 + (((tickAnim - 13) / 3) * (-0.3-(0.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.21-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.3 + (((tickAnim - 16) / 4) * (-0.255-(-0.3)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = -0.21 + (((tickAnim - 16) / 4) * (-0.515-(-0.21)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -0.255 + (((tickAnim - 20) / 5) * (-0.375-(-0.255)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = -0.515 + (((tickAnim - 20) / 5) * (-0.05-(-0.515)));
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
            xx = 37.25 + (((tickAnim - 0) / 5) * (27.3999-(37.25)));
            yy = 18.75 + (((tickAnim - 0) / 5) * (34.4211-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(18.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (26.9629+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 27.3999 + (((tickAnim - 5) / 8) * (9.16-(27.3999)));
            yy = 34.4211-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 5) / 8) * (-32.2065-(34.4211-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            zz = 26.9629+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 5) / 8) * (-2.9749-(26.9629+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 9.16 + (((tickAnim - 13) / 12) * (37.25-(9.16)));
            yy = -32.2065 + (((tickAnim - 13) / 12) * (18.75-(-32.2065)));
            zz = -2.9749 + (((tickAnim - 13) / 12) * (0-(-2.9749)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -10.774 + (((tickAnim - 0) / 5) * (7.6294-(-10.774)));
            yy = 24.738 + (((tickAnim - 0) / 5) * (15.9811-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(24.738)));
            zz = 16.6374 + (((tickAnim - 0) / 5) * (12.3458-(16.6374)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 7.6294 + (((tickAnim - 5) / 10) * (-7.7181-(7.6294)));
            yy = 15.9811-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 5) / 10) * (-0.7842-(15.9811-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            zz = 12.3458 + (((tickAnim - 5) / 10) * (19.042-(12.3458)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -7.7181 + (((tickAnim - 15) / 10) * (-10.774-(-7.7181)));
            yy = -0.7842 + (((tickAnim - 15) / 10) * (24.738-(-0.7842)));
            zz = 19.042 + (((tickAnim - 15) / 10) * (16.6374-(19.042)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 40.7937 + (((tickAnim - 0) / 3) * (33.7601-(40.7937)));
            yy = 58.0835 + (((tickAnim - 0) / 3) * (112.9788-(58.0835)));
            zz = -43.9009 + (((tickAnim - 0) / 3) * (-50.4979-(-43.9009)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 33.7601 + (((tickAnim - 3) / 3) * (26.6621-(33.7601)));
            yy = 112.9788 + (((tickAnim - 3) / 3) * (110.6922-(112.9788)));
            zz = -50.4979 + (((tickAnim - 3) / 3) * (-46.9912-(-50.4979)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 26.6621 + (((tickAnim - 6) / 7) * (3.8588-(26.6621)));
            yy = 110.6922 + (((tickAnim - 6) / 7) * (42.7876-(110.6922)));
            zz = -46.9912 + (((tickAnim - 6) / 7) * (-9.4232-(-46.9912)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 3.8588 + (((tickAnim - 13) / 3) * (-46.4827-(3.8588)));
            yy = 42.7876 + (((tickAnim - 13) / 3) * (22.2397-(42.7876)));
            zz = -9.4232 + (((tickAnim - 13) / 3) * (33.8681-(-9.4232)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -46.4827 + (((tickAnim - 16) / 9) * (40.7937-(-46.4827)));
            yy = 22.2397 + (((tickAnim - 16) / 9) * (58.0835-(22.2397)));
            zz = 33.8681 + (((tickAnim - 16) / 9) * (-43.9009-(33.8681)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0.25 + (((tickAnim - 0) / 6) * (0.325-(0.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0.325 + (((tickAnim - 6) / 7) * (-0.15-(0.325)));
            yy = 0 + (((tickAnim - 6) / 7) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0.625-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -0.15 + (((tickAnim - 13) / 3) * (0.015-(-0.15)));
            yy = -0.25 + (((tickAnim - 13) / 3) * (-0.2-(-0.25)));
            zz = 0.625 + (((tickAnim - 13) / 3) * (0.49-(0.625)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0.015 + (((tickAnim - 16) / 4) * (0.88-(0.015)));
            yy = -0.2 + (((tickAnim - 16) / 4) * (-0.11-(-0.2)));
            zz = 0.49 + (((tickAnim - 16) / 4) * (0.27-(0.49)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0.88 + (((tickAnim - 20) / 5) * (0.25-(0.88)));
            yy = -0.11 + (((tickAnim - 20) / 5) * (0-(-0.11)));
            zz = 0.27 + (((tickAnim - 20) / 5) * (0-(0.27)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*2), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-2), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-30))*-3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-90))*1), head.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*1.5), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-1.5));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-90))*-1), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-4));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraIsisfordia entity = (EntityPrehistoricFloraIsisfordia) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-11-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-150))*-15), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-50))*0.5 + (((tickAnim - 0) / 6) * (0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-50))*0.5-(0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-50))*0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575+50))*1 + (((tickAnim - 0) / 6) * (-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575+50))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575+50))*1)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-50))*0.5 + (((tickAnim - 6) / 2) * (0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-50))*0.5-(0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-50))*0.5)));
            zz = -0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575+50))*1.5 + (((tickAnim - 6) / 2) * (-0.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575+50))*1.5-(-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575+50))*1.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-50))*0.5 + (((tickAnim - 8) / 5) * (0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-50))*0.5-(0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-50))*0.5)));
            zz = -0.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575+50))*1.5 + (((tickAnim - 8) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575+50))*1-(-0.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575+50))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 62.7831 + (((tickAnim - 0) / 3) * (73.0485-(62.7831)));
            yy = -9.9162 + (((tickAnim - 0) / 3) * (-48.7052-(-9.9162)));
            zz = 22.5571 + (((tickAnim - 0) / 3) * (21.3479-(22.5571)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 73.0485 + (((tickAnim - 3) / 4) * (100.4837-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(73.0485)));
            yy = -48.7052 + (((tickAnim - 3) / 4) * (-81.7335-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(-48.7052)));
            zz = 21.3479 + (((tickAnim - 3) / 4) * (74.8076+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(21.3479)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 100.4837-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 7) / 2) * (37.0625-(100.4837-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = -81.7335-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 7) / 2) * (19.1343-(-81.7335-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
            zz = 74.8076+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 7) / 2) * (14.3322-(74.8076+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 37.0625 + (((tickAnim - 9) / 4) * (62.7831-(37.0625)));
            yy = 19.1343 + (((tickAnim - 9) / 4) * (-9.9162-(19.1343)));
            zz = 14.3322 + (((tickAnim - 9) / 4) * (22.5571-(14.3322)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -44.4329 + (((tickAnim - 0) / 2) * (-56.9586-(-44.4329)));
            yy = 27.2 + (((tickAnim - 0) / 2) * (30.3648-(27.2)));
            zz = -11.2116 + (((tickAnim - 0) / 2) * (-24.206-(-11.2116)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -56.9586 + (((tickAnim - 2) / 3) * (-52.0521-(-56.9586)));
            yy = 30.3648 + (((tickAnim - 2) / 3) * (28.36-(30.3648)));
            zz = -24.206 + (((tickAnim - 2) / 3) * (12.2538-(-24.206)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -52.0521 + (((tickAnim - 5) / 4) * (-45.411-(-52.0521)));
            yy = 28.36 + (((tickAnim - 5) / 4) * (31.7125-(28.36)));
            zz = 12.2538 + (((tickAnim - 5) / 4) * (-30.4689-(12.2538)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -45.411 + (((tickAnim - 9) / 4) * (-44.4329-(-45.411)));
            yy = 31.7125 + (((tickAnim - 9) / 4) * (27.2-(31.7125)));
            zz = -30.4689 + (((tickAnim - 9) / 4) * (-11.2116-(-30.4689)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.33 + (((tickAnim - 0) / 2) * (-0.23-(-0.33)));
            yy = 0.5 + (((tickAnim - 0) / 2) * (0.5-(0.5)));
            zz = 0.45 + (((tickAnim - 0) / 2) * (1.15-(0.45)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -0.23 + (((tickAnim - 2) / 3) * (-0.225-(-0.23)));
            yy = 0.5 + (((tickAnim - 2) / 3) * (0.325-(0.5)));
            zz = 1.15 + (((tickAnim - 2) / 3) * (1.05-(1.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -0.225 + (((tickAnim - 5) / 4) * (-0.225-(-0.225)));
            yy = 0.325 + (((tickAnim - 5) / 4) * (0.5-(0.325)));
            zz = 1.05 + (((tickAnim - 5) / 4) * (0.45-(1.05)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -0.225 + (((tickAnim - 9) / 4) * (-0.33-(-0.225)));
            yy = 0.5 + (((tickAnim - 9) / 4) * (0.5-(0.5)));
            zz = 0.45 + (((tickAnim - 9) / 4) * (0.45-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 3.1436 + (((tickAnim - 0) / 2) * (0.7257-(3.1436)));
            yy = -28.1303 + (((tickAnim - 0) / 2) * (-40.0231-(-28.1303)));
            zz = 4.4656 + (((tickAnim - 0) / 2) * (7.1499-(4.4656)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0.7257 + (((tickAnim - 2) / 2) * (0-(0.7257)));
            yy = -40.0231 + (((tickAnim - 2) / 2) * (-94.5-(-40.0231)));
            zz = 7.1499 + (((tickAnim - 2) / 2) * (0-(7.1499)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -94.5 + (((tickAnim - 4) / 4) * (0-(-94.5)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0.9723-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (-42.3499-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (-4.6997-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0.9723 + (((tickAnim - 9) / 4) * (3.1436-(0.9723)));
            yy = -42.3499 + (((tickAnim - 9) / 4) * (-28.1303-(-42.3499)));
            zz = -4.6997 + (((tickAnim - 9) / 4) * (4.4656-(-4.6997)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (-0.23-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (0.1-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.23 + (((tickAnim - 4) / 4) * (0-(-0.23)));
            yy = 0.1 + (((tickAnim - 4) / 4) * (0-(0.1)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (-0.225-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -0.225 + (((tickAnim - 9) / 4) * (0-(-0.225)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 62.7831 + (((tickAnim - 0) / 3) * (73.0565-(62.7831)));
            yy = 9.9162 + (((tickAnim - 0) / 3) * (48.4558-(9.9162)));
            zz = -22.5571 + (((tickAnim - 0) / 3) * (-21.3251-(-22.5571)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 73.0565 + (((tickAnim - 3) / 4) * (100.4837-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(73.0565)));
            yy = 48.4558 + (((tickAnim - 3) / 4) * (90.1165-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350-(48.4558)));
            zz = -21.3251 + (((tickAnim - 3) / 4) * (-81.9174+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350-(-21.3251)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 100.4837-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 7) / 2) * (37.0625-(100.4837-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 90.1165-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350 + (((tickAnim - 7) / 2) * (-19.1343-(90.1165-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350)));
            zz = -81.9174+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350 + (((tickAnim - 7) / 2) * (-14.3322-(-81.9174+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 37.0625 + (((tickAnim - 9) / 4) * (62.7831-(37.0625)));
            yy = -19.1343 + (((tickAnim - 9) / 4) * (9.9162-(-19.1343)));
            zz = -14.3322 + (((tickAnim - 9) / 4) * (-22.5571-(-14.3322)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -44.4329 + (((tickAnim - 0) / 2) * (-56.9586-(-44.4329)));
            yy = -27.2 + (((tickAnim - 0) / 2) * (-30.3648-(-27.2)));
            zz = 11.2116 + (((tickAnim - 0) / 2) * (24.206-(11.2116)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -56.9586 + (((tickAnim - 2) / 3) * (-51.9143-(-56.9586)));
            yy = -30.3648 + (((tickAnim - 2) / 3) * (-27.8093-(-30.3648)));
            zz = 24.206 + (((tickAnim - 2) / 3) * (-17.4766-(24.206)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -51.9143 + (((tickAnim - 5) / 4) * (-45.411-(-51.9143)));
            yy = -27.8093 + (((tickAnim - 5) / 4) * (-31.7125-(-27.8093)));
            zz = -17.4766 + (((tickAnim - 5) / 4) * (30.4689-(-17.4766)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -45.411 + (((tickAnim - 9) / 4) * (-44.4329-(-45.411)));
            yy = -31.7125 + (((tickAnim - 9) / 4) * (-27.2-(-31.7125)));
            zz = 30.4689 + (((tickAnim - 9) / 4) * (11.2116-(30.4689)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.33 + (((tickAnim - 0) / 2) * (0.23-(0.33)));
            yy = 0.5 + (((tickAnim - 0) / 2) * (0.5-(0.5)));
            zz = 0.45 + (((tickAnim - 0) / 2) * (1.15-(0.45)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0.23 + (((tickAnim - 2) / 3) * (-0.1-(0.23)));
            yy = 0.5 + (((tickAnim - 2) / 3) * (0.325-(0.5)));
            zz = 1.15 + (((tickAnim - 2) / 3) * (1.05-(1.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -0.1 + (((tickAnim - 5) / 4) * (0.225-(-0.1)));
            yy = 0.325 + (((tickAnim - 5) / 4) * (0.5-(0.325)));
            zz = 1.05 + (((tickAnim - 5) / 4) * (0.45-(1.05)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0.225 + (((tickAnim - 9) / 4) * (0.33-(0.225)));
            yy = 0.5 + (((tickAnim - 9) / 4) * (0.5-(0.5)));
            zz = 0.45 + (((tickAnim - 9) / 4) * (0.45-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 3.1436 + (((tickAnim - 0) / 2) * (0.7257-(3.1436)));
            yy = 28.1303 + (((tickAnim - 0) / 2) * (40.0231-(28.1303)));
            zz = -4.4656 + (((tickAnim - 0) / 2) * (-7.1499-(-4.4656)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0.7257 + (((tickAnim - 2) / 2) * (0-(0.7257)));
            yy = 40.0231 + (((tickAnim - 2) / 2) * (94.5-(40.0231)));
            zz = -7.1499 + (((tickAnim - 2) / 2) * (0-(-7.1499)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 94.5 + (((tickAnim - 4) / 4) * (0-(94.5)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0.9723-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (42.3499-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (4.6997-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0.9723 + (((tickAnim - 9) / 4) * (3.1436-(0.9723)));
            yy = 42.3499 + (((tickAnim - 9) / 4) * (28.1303-(42.3499)));
            zz = 4.6997 + (((tickAnim - 9) / 4) * (-4.4656-(4.6997)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0.23-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0.23 + (((tickAnim - 4) / 4) * (0-(0.23)));
            yy = -0.1 + (((tickAnim - 4) / 4) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0.225-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0.225 + (((tickAnim - 9) / 4) * (0-(0.225)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
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



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(10.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-50))*15), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(3-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-150))*25), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(3.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-200))*25), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-120))*-25), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 6.25 + (((tickAnim - 0) / 7) * (-2.75-(6.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -2.75 + (((tickAnim - 7) / 6) * (6.25-(-2.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.7735-Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-120))*15 + (((tickAnim - 0) / 7) * (13.2265-Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-120))*15-(-0.7735-Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-120))*15)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 13.2265-Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-120))*15 + (((tickAnim - 7) / 6) * (-0.7735-Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-120))*15-(13.2265-Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-120))*15)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(9.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-250))*-15), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 46.4678 + (((tickAnim - 0) / 3) * (38.7978-(46.4678)));
            yy = -16.0762 + (((tickAnim - 0) / 3) * (16.2659-(-16.0762)));
            zz = -2.4131 + (((tickAnim - 0) / 3) * (-37.3175-(-2.4131)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 38.7978 + (((tickAnim - 3) / 3) * (3.5315-(38.7978)));
            yy = 16.2659 + (((tickAnim - 3) / 3) * (33.6694-(16.2659)));
            zz = -37.3175 + (((tickAnim - 3) / 3) * (25.8607-(-37.3175)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 3.5315 + (((tickAnim - 6) / 1) * (5.3355-(3.5315)));
            yy = 33.6694 + (((tickAnim - 6) / 1) * (30.3474-(33.6694)));
            zz = 25.8607 + (((tickAnim - 6) / 1) * (26.3329-(25.8607)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 5.3355 + (((tickAnim - 7) / 1) * (21.3069-(5.3355)));
            yy = 30.3474 + (((tickAnim - 7) / 1) * (3.6188-(30.3474)));
            zz = 26.3329 + (((tickAnim - 7) / 1) * (9.8484-(26.3329)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 21.3069 + (((tickAnim - 8) / 5) * (46.4678-(21.3069)));
            yy = 3.6188 + (((tickAnim - 8) / 5) * (-16.0762-(3.6188)));
            zz = 9.8484 + (((tickAnim - 8) / 5) * (-2.4131-(9.8484)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.434 + (((tickAnim - 0) / 3) * (-35.242-(0.434)));
            yy = 3.9135 + (((tickAnim - 0) / 3) * (46.7483-(3.9135)));
            zz = -25.316 + (((tickAnim - 0) / 3) * (12.4855-(-25.316)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -35.242 + (((tickAnim - 3) / 3) * (-16.8938-(-35.242)));
            yy = 46.7483 + (((tickAnim - 3) / 3) * (-17.2356-(46.7483)));
            zz = 12.4855 + (((tickAnim - 3) / 3) * (-32.2523-(12.4855)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -16.8938 + (((tickAnim - 6) / 1) * (-16.7557-(-16.8938)));
            yy = -17.2356 + (((tickAnim - 6) / 1) * (-20.5211-(-17.2356)));
            zz = -32.2523 + (((tickAnim - 6) / 1) * (-31.8814-(-32.2523)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -16.7557 + (((tickAnim - 7) / 1) * (-9.9328-(-16.7557)));
            yy = -20.5211 + (((tickAnim - 7) / 1) * (18.9355-(-20.5211)));
            zz = -31.8814 + (((tickAnim - 7) / 1) * (-28.7678-(-31.8814)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -9.9328 + (((tickAnim - 8) / 5) * (0.434-(-9.9328)));
            yy = 18.9355 + (((tickAnim - 8) / 5) * (3.9135-(18.9355)));
            zz = -28.7678 + (((tickAnim - 8) / 5) * (-25.316-(-28.7678)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.2 + (((tickAnim - 0) / 3) * (-0.1-(-0.2)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.95-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -0.1 + (((tickAnim - 3) / 3) * (0.3-(-0.1)));
            yy = -0.95 + (((tickAnim - 3) / 3) * (0-(-0.95)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0.3 + (((tickAnim - 6) / 7) * (-0.2-(0.3)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
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
            xx = 7.7584 + (((tickAnim - 0) / 1) * (8.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-30))*15-(7.7584)));
            yy = -101.9731 + (((tickAnim - 0) / 1) * (-125.2223-(-101.9731)));
            zz = 50.396 + (((tickAnim - 0) / 1) * (71.6337-(50.396)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 8.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-30))*15 + (((tickAnim - 1) / 2) * (36.0194-(8.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-30))*15)));
            yy = -125.2223 + (((tickAnim - 1) / 2) * (-77.2308-(-125.2223)));
            zz = 71.6337 + (((tickAnim - 1) / 2) * (39.5701-(71.6337)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 36.0194 + (((tickAnim - 3) / 2) * (13.8547-(36.0194)));
            yy = -77.2308 + (((tickAnim - 3) / 2) * (-15.6921-(-77.2308)));
            zz = 39.5701 + (((tickAnim - 3) / 2) * (11.3373-(39.5701)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 13.8547 + (((tickAnim - 5) / 1) * (31.6108-(13.8547)));
            yy = -15.6921 + (((tickAnim - 5) / 1) * (-30.9388-(-15.6921)));
            zz = 11.3373 + (((tickAnim - 5) / 1) * (30.0184-(11.3373)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 31.6108 + (((tickAnim - 6) / 1) * (-17.3525-(31.6108)));
            yy = -30.9388 + (((tickAnim - 6) / 1) * (-16.4348-(-30.9388)));
            zz = 30.0184 + (((tickAnim - 6) / 1) * (-18.9636-(30.0184)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -17.3525 + (((tickAnim - 7) / 1) * (-46.6319-(-17.3525)));
            yy = -16.4348 + (((tickAnim - 7) / 1) * (-14.3874-(-16.4348)));
            zz = -18.9636 + (((tickAnim - 7) / 1) * (-41.9909-(-18.9636)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -46.6319 + (((tickAnim - 8) / 5) * (7.7584-(-46.6319)));
            yy = -14.3874 + (((tickAnim - 8) / 5) * (-101.9731-(-14.3874)));
            zz = -41.9909 + (((tickAnim - 8) / 5) * (50.396-(-41.9909)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.075-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.45-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0.075 + (((tickAnim - 6) / 1) * (0.715-(0.075)));
            yy = -0.125 + (((tickAnim - 6) / 1) * (-0.09-(-0.125)));
            zz = 0.45 + (((tickAnim - 6) / 1) * (0.37-(0.45)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0.715 + (((tickAnim - 7) / 1) * (-0.2-(0.715)));
            yy = -0.09 + (((tickAnim - 7) / 1) * (0-(-0.09)));
            zz = 0.37 + (((tickAnim - 7) / 1) * (0.15-(0.37)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -0.2 + (((tickAnim - 8) / 1) * (-0.66-(-0.2)));
            yy = 0 + (((tickAnim - 8) / 1) * (-0.275-(0)));
            zz = 0.15 + (((tickAnim - 8) / 1) * (0.12-(0.15)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -0.66 + (((tickAnim - 9) / 4) * (0-(-0.66)));
            yy = -0.275 + (((tickAnim - 9) / 4) * (0-(-0.275)));
            zz = 0.12 + (((tickAnim - 9) / 4) * (0-(0.12)));
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
            xx = 46.4678 + (((tickAnim - 0) / 3) * (38.7978-(46.4678)));
            yy = 16.0762 + (((tickAnim - 0) / 3) * (-16.2659-(16.0762)));
            zz = 2.4131 + (((tickAnim - 0) / 3) * (37.3175-(2.4131)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 38.7978 + (((tickAnim - 3) / 3) * (3.5315-(38.7978)));
            yy = -16.2659 + (((tickAnim - 3) / 3) * (-33.6694-(-16.2659)));
            zz = 37.3175 + (((tickAnim - 3) / 3) * (-25.8607-(37.3175)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 3.5315 + (((tickAnim - 6) / 1) * (5.3355-(3.5315)));
            yy = -33.6694 + (((tickAnim - 6) / 1) * (-30.3474-(-33.6694)));
            zz = -25.8607 + (((tickAnim - 6) / 1) * (-26.3329-(-25.8607)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 5.3355 + (((tickAnim - 7) / 1) * (21.3069-(5.3355)));
            yy = -30.3474 + (((tickAnim - 7) / 1) * (-3.6188-(-30.3474)));
            zz = -26.3329 + (((tickAnim - 7) / 1) * (-9.8484-(-26.3329)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 21.3069 + (((tickAnim - 8) / 5) * (46.4678-(21.3069)));
            yy = -3.6188 + (((tickAnim - 8) / 5) * (16.0762-(-3.6188)));
            zz = -9.8484 + (((tickAnim - 8) / 5) * (2.4131-(-9.8484)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.434 + (((tickAnim - 0) / 3) * (-35.242-(0.434)));
            yy = -3.9135 + (((tickAnim - 0) / 3) * (-46.7483-(-3.9135)));
            zz = 25.316 + (((tickAnim - 0) / 3) * (-12.4855-(25.316)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -35.242 + (((tickAnim - 3) / 3) * (-16.8938-(-35.242)));
            yy = -46.7483 + (((tickAnim - 3) / 3) * (17.2356-(-46.7483)));
            zz = -12.4855 + (((tickAnim - 3) / 3) * (32.2523-(-12.4855)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -16.8938 + (((tickAnim - 6) / 1) * (-16.7557-(-16.8938)));
            yy = 17.2356 + (((tickAnim - 6) / 1) * (20.5211-(17.2356)));
            zz = 32.2523 + (((tickAnim - 6) / 1) * (31.8814-(32.2523)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -16.7557 + (((tickAnim - 7) / 1) * (-9.9328-(-16.7557)));
            yy = 20.5211 + (((tickAnim - 7) / 1) * (-18.9355-(20.5211)));
            zz = 31.8814 + (((tickAnim - 7) / 1) * (28.7678-(31.8814)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -9.9328 + (((tickAnim - 8) / 5) * (0.434-(-9.9328)));
            yy = -18.9355 + (((tickAnim - 8) / 5) * (-3.9135-(-18.9355)));
            zz = 28.7678 + (((tickAnim - 8) / 5) * (25.316-(28.7678)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.2 + (((tickAnim - 0) / 3) * (-0.1-(-0.2)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.95-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -0.1 + (((tickAnim - 3) / 3) * (-0.3-(-0.1)));
            yy = -0.95 + (((tickAnim - 3) / 3) * (0-(-0.95)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -0.3 + (((tickAnim - 6) / 7) * (-0.2-(-0.3)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 7.7584 + (((tickAnim - 0) / 1) * (8.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-30))*15-(7.7584)));
            yy = 101.9731 + (((tickAnim - 0) / 1) * (125.2223-(101.9731)));
            zz = -50.396 + (((tickAnim - 0) / 1) * (-71.6337-(-50.396)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 8.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-30))*15 + (((tickAnim - 1) / 2) * (36.0194-(8.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*575-30))*15)));
            yy = 125.2223 + (((tickAnim - 1) / 2) * (77.2308-(125.2223)));
            zz = -71.6337 + (((tickAnim - 1) / 2) * (-39.5701-(-71.6337)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 36.0194 + (((tickAnim - 3) / 2) * (13.8547-(36.0194)));
            yy = 77.2308 + (((tickAnim - 3) / 2) * (15.6921-(77.2308)));
            zz = -39.5701 + (((tickAnim - 3) / 2) * (-11.3373-(-39.5701)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 13.8547 + (((tickAnim - 5) / 1) * (31.6108-(13.8547)));
            yy = 15.6921 + (((tickAnim - 5) / 1) * (30.9388-(15.6921)));
            zz = -11.3373 + (((tickAnim - 5) / 1) * (-30.0184-(-11.3373)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 31.6108 + (((tickAnim - 6) / 1) * (-17.3525-(31.6108)));
            yy = 30.9388 + (((tickAnim - 6) / 1) * (16.4348-(30.9388)));
            zz = -30.0184 + (((tickAnim - 6) / 1) * (18.9636-(-30.0184)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -17.3525 + (((tickAnim - 7) / 1) * (-46.6319-(-17.3525)));
            yy = 16.4348 + (((tickAnim - 7) / 1) * (14.3874-(16.4348)));
            zz = 18.9636 + (((tickAnim - 7) / 1) * (41.9909-(18.9636)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -46.6319 + (((tickAnim - 8) / 5) * (7.7584-(-46.6319)));
            yy = 14.3874 + (((tickAnim - 8) / 5) * (101.9731-(14.3874)));
            zz = 41.9909 + (((tickAnim - 8) / 5) * (-50.396-(41.9909)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.075-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.45-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0.075 + (((tickAnim - 6) / 1) * (-0.715-(0.075)));
            yy = -0.125 + (((tickAnim - 6) / 1) * (-0.09-(-0.125)));
            zz = 0.45 + (((tickAnim - 6) / 1) * (0.37-(0.45)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -0.715 + (((tickAnim - 7) / 1) * (0.2-(-0.715)));
            yy = -0.09 + (((tickAnim - 7) / 1) * (0-(-0.09)));
            zz = 0.37 + (((tickAnim - 7) / 1) * (0.15-(0.37)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0.2 + (((tickAnim - 8) / 1) * (0.585-(0.2)));
            yy = 0 + (((tickAnim - 8) / 1) * (-0.2-(0)));
            zz = 0.15 + (((tickAnim - 8) / 1) * (0.12-(0.15)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0.585 + (((tickAnim - 9) / 4) * (0-(0.585)));
            yy = -0.2 + (((tickAnim - 9) / 4) * (0-(-0.2)));
            zz = 0.12 + (((tickAnim - 9) / 4) * (0-(0.12)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-17.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-200))*15), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0.35);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(2.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-100))*-15), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(2-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-150))*5), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraIsisfordia entity = (EntityPrehistoricFloraIsisfordia) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(4.5), main.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*1), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-0.2);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(23.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), leftLeg.rotateAngleY + (float) Math.toRadians(-72.75), leftLeg.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(29.5108), leftLeg2.rotateAngleY + (float) Math.toRadians(11.5016), leftLeg2.rotateAngleZ + (float) Math.toRadians(-29.8277+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*5));
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(-0.45);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(-0.325);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(-0.125);


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(-80.9189), leftLeg3.rotateAngleY + (float) Math.toRadians(-20.3575), leftLeg3.rotateAngleZ + (float) Math.toRadians(84.7735+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*5));
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(-0.225);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(0.3);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(-0.2);


        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(23.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), rightLeg.rotateAngleY + (float) Math.toRadians(72.75), rightLeg.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(29.5108), rightLeg2.rotateAngleY + (float) Math.toRadians(-11.5016), rightLeg2.rotateAngleZ + (float) Math.toRadians(29.8277+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*5));
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(0.45);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(-0.325);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(-0.125);


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(-80.9189), rightLeg3.rotateAngleY + (float) Math.toRadians(20.3575), rightLeg3.rotateAngleZ + (float) Math.toRadians(-84.7735+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*5));
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(-0.225);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(0.3);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(-0.2);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(7.25), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*10), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(5.75), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*25), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-4.25), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*25), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-10.5), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*25), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-9.25), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-2.75), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-1), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(58.7879), leftArm.rotateAngleY + (float) Math.toRadians(-22.4116), leftArm.rotateAngleZ + (float) Math.toRadians(-11.8708+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*3));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-6.6631), leftArm2.rotateAngleY + (float) Math.toRadians(-28.4774), leftArm2.rotateAngleZ + (float) Math.toRadians(-24.41+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*3));
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(0);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(0.225);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(0);


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(-40.2733), leftArm3.rotateAngleY + (float) Math.toRadians(-75.2753), leftArm3.rotateAngleZ + (float) Math.toRadians(54.8041+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-1));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(58.7879), rightArm.rotateAngleY + (float) Math.toRadians(22.4116), rightArm.rotateAngleZ + (float) Math.toRadians(11.8708+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*3));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-6.6631), rightArm2.rotateAngleY + (float) Math.toRadians(28.4774), rightArm2.rotateAngleZ + (float) Math.toRadians(24.41+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*3));
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(0);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(0.225);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(0);


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(-40.2733), rightArm3.rotateAngleY + (float) Math.toRadians(75.2753), rightArm3.rotateAngleZ + (float) Math.toRadians(-54.8041+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-1));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(15.75), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-1), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-11.75), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(5), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));

    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraIsisfordia e = (EntityPrehistoricFloraIsisfordia) entity;
        animator.update(entity);

    }
}
