package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraVaranosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelVaranosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
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
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;

    private ModelAnimator animator;

    public ModelVaranosuchus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 16.0F, 4.5F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -1.2F, -6.0F, 5, 5, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 24, 41, 1.3F, -1.65F, -5.1F, 0, 1, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 24, 41, -1.3F, -1.65F, -5.1F, 0, 1, 5, 0.0F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.5F, 0.3F, -1.25F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.2608F, -0.0226F, -0.0843F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 13, 36, -1.0F, -0.5F, -1.5F, 2, 5, 3, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 4.5F, -1.5F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9547F, -0.0283F, 0.1266F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 22, 48, -1.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.4997F, 4.8615F, 1.4361F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6891F, -0.0222F, -0.0269F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 28, 28, -2.0F, -0.05F, -4.0F, 3, 1, 4, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.5F, 0.3F, -1.25F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2608F, 0.0226F, 0.0843F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 13, 36, -1.0F, -0.5F, -1.5F, 2, 5, 3, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 4.5F, -1.5F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.9547F, 0.0283F, -0.1266F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 22, 48, -1.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.4997F, 4.8615F, 1.4361F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6891F, 0.0222F, 0.0269F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 28, 28, -1.0F, -0.05F, -4.0F, 3, 1, 4, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -5.3F);
        this.main.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 12, -2.5F, -1.2F, -6.0F, 5, 5, 6, -0.003F, false));
        this.body2.cubeList.add(new ModelBox(body2, 40, 10, 1.5F, -1.65F, -5.2F, 0, 1, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 40, 10, -1.5F, -1.65F, -5.2F, 0, 1, 5, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.8962F, -5.5872F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0873F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 24, -2.0F, -0.175F, -3.0F, 4, 4, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 57, 38, 1.0F, -0.6242F, -2.9826F, 0, 1, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 57, 38, -1.0F, -0.6242F, -2.9826F, 0, 1, 3, 0.0F, true));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.0F, 2.65F, -1.75F);
        this.body3.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.3927F, 0.0F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 51, 17, -1.0F, -0.25F, -1.0F, 2, 3, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 2.75F, 1.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.6981F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 51, 10, -1.0F, 0.0F, -2.0F, 2, 4, 2, -0.003F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 3.25F, -0.2F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.2225F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 40, 0, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.0F, 2.65F, -1.75F);
        this.body3.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.3927F, 0.0F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 51, 17, -1.0F, -0.25F, -1.0F, 2, 3, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 2.75F, 1.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.6981F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 51, 10, -1.0F, 0.0F, -2.0F, 2, 4, 2, -0.003F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 3.25F, -0.2F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2225F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 40, 0, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.4F, -2.25F);
        this.body3.addChild(neck);
        this.setRotateAngle(neck, -0.0873F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 32, -1.5F, -1.475F, -3.0F, 3, 3, 3, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 27, 56, 0.5F, -1.925F, -2.5F, 0, 1, 1, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 27, 56, -0.5F, -1.925F, -2.5F, 0, 1, 1, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.4481F, -2.7888F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 38, 19, -1.0F, 0.6981F, -3.2112F, 2, 1, 4, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.8432F, -5.5682F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 45, -0.5F, -1.0F, -1.0F, 1, 1, 4, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.055F, -2.9601F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 48, -0.5F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.8432F, -5.5682F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2793F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 53, 0, -0.5F, -1.0F, 0.0F, 1, 1, 3, 0.006F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0717F, 1.8964F, -3.5312F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1851F, -0.2389F, 0.0132F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 48, -0.9F, -0.8F, 0.2F, 0, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 57, 50, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.2954F, 1.7677F, -4.4845F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.013F, -0.144F, -0.001F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 36, -0.4F, -0.8F, -0.6F, 0, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.0717F, 1.8964F, -3.5312F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1851F, 0.2389F, -0.0132F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 42, 48, 0.9F, -0.8F, 0.2F, 0, 1, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 57, 50, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.2954F, 1.7677F, -4.4845F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1439F, -0.144F, -0.001F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 25, -0.5F, -1.0F, -0.1F, 1, 1, 1, -0.003F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.2954F, 1.7677F, -4.4845F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.013F, 0.144F, 0.001F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 36, 0.4F, -0.8F, -0.6F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.2954F, 1.7677F, -4.4845F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1439F, 0.144F, 0.001F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 25, -0.5F, -1.0F, -0.1F, 1, 1, 1, -0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.6752F, 1.1981F, -0.8422F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.048F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 57, 47, 0.05F, -0.5F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.2099F, 1.1981F, -3.5652F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.2487F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 53, 5, -0.7F, -0.5F, 0.0F, 1, 1, 3, 0.01F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.4351F, 0.9127F, -6.3932F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0743F, -0.144F, -0.001F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 31, 53, -0.95F, 0.0F, -0.075F, 1, 1, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.4351F, 0.9127F, -6.3932F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0743F, 0.144F, 0.001F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 31, 53, -0.05F, 0.0F, -0.075F, 1, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.6752F, 1.1981F, -0.8422F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.048F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 57, 47, -1.05F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.2099F, 1.1981F, -3.5652F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.2487F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 53, 5, -0.3F, -0.5F, 0.0F, 1, 1, 3, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.6928F, -1.1065F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 39, -1.0F, 0.0052F, -2.1047F, 2, 1, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 54, 27, -1.0F, -0.9948F, -1.1047F, 2, 1, 2, -0.006F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.1216F, -2.5564F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 15, 24, -0.5F, -1.0F, 0.0F, 1, 1, 2, -0.006F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.6887F, -4.509F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 57, 43, -0.5F, -1.0F, 0.0F, 1, 1, 2, -0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.5582F, -5.5004F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1309F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 24, 39, -0.5F, -1.2F, 0.2F, 1, 1, 0, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 46, 41, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.8883F, 1.0052F, -2.6311F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1376F, -0.1436F, -0.0079F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 49, 53, 0.0F, -1.0F, -2.9F, 1, 1, 3, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.2099F, -0.4948F, -2.4588F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.2487F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 40, 53, -0.7F, 0.5F, 0.0F, 1, 1, 3, 0.003F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.6752F, -0.4948F, 0.2643F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.048F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 52, 38, 0.05F, 0.5F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.6752F, -0.4948F, 0.2643F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.048F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 52, 38, -1.05F, 0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.8883F, 1.0052F, -2.6311F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1464F, -0.1436F, -0.0079F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 20, 56, 0.125F, -1.25F, -2.75F, 0, 1, 3, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.8883F, 1.0052F, -2.6311F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1464F, 0.1436F, 0.0079F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 56, -0.125F, -1.25F, -2.75F, 0, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.8883F, 1.0052F, -2.6311F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1376F, 0.1436F, 0.0079F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 49, 53, -1.0F, -1.0F, -2.9F, 1, 1, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.2099F, -0.4948F, -2.4588F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.2487F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 40, 53, -0.3F, 0.5F, 0.0F, 1, 1, 3, 0.003F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.207F, -1.3459F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.0567F, 0.0F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 0.7782F, 2.8834F);
        this.throat.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0873F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 54, 23, -0.5F, -1.0F, 0.0F, 2, 1, 2, -0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 0.0018F, -0.0143F);
        this.throat.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.2618F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 46, 47, -0.5F, -2.0F, 0.0F, 2, 2, 3, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.05F, -0.5F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.2574F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 23, 10, -2.0F, 0.0F, 0.0F, 4, 4, 4, 0.01F, false));
        this.tail.cubeList.add(new ModelBox(tail, 52, 32, 1.0F, -0.4483F, -0.0261F, 0, 1, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 52, 32, -1.0F, -0.4483F, -0.0261F, 0, 1, 4, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.05F, 3.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1484F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 23, 0, -1.5F, -1.0F, 0.0F, 3, 4, 5, -0.003F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 41, 34, 0.75F, -1.4422F, -0.0551F, 0, 1, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 41, 34, -0.75F, -1.4422F, -0.0551F, 0, 1, 5, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.025F, 4.425F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2618F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 23, 19, -1.0F, -1.0F, 0.0F, 2, 3, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 35, 41, 0.4F, -1.4214F, -0.103F, 0, 1, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 35, 41, -0.4F, -1.4214F, -0.103F, 0, 1, 5, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.025F, 4.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 15, 28, -0.5F, -1.0F, 0.0F, 1, 2, 5, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 43, 25, 0.25F, -1.4367F, -0.0717F, 0, 1, 5, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 43, 25, -0.25F, -1.4367F, -0.0717F, 0, 1, 5, 0.0F, true));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.4F, 4.5F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.3709F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 28, 34, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.003F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 45, 0.1F, -0.9489F, -0.0209F, 0, 1, 5, 0.0F, false));
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

        EntityPrehistoricFloraVaranosuchus EntityMegalosaurus = (EntityPrehistoricFloraVaranosuchus) e;

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
        EntityPrehistoricFloraVaranosuchus entity = (EntityPrehistoricFloraVaranosuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (18.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-80-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-10.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 18.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-80 + (((tickAnim - 5) / 5) * (-11.99098-(18.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-80)));
            yy = 2.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 5) / 5) * (-44.687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(2.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            zz = -10.25 + (((tickAnim - 5) / 5) * (10.12006-(-10.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -11.99098 + (((tickAnim - 10) / 5) * (0-(-11.99098)));
            yy = -44.687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 10) / 5) * (0-(-44.687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            zz = 10.12006 + (((tickAnim - 10) / 5) * (0-(10.12006)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.55-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0.55 + (((tickAnim - 10) / 5) * (0-(0.55)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (20.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+20))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-16.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (17.75-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 20.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+20))*-50 + (((tickAnim - 5) / 5) * (-33.112+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*50-(20.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+20))*-50)));
            yy = -16.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 5) / 5) * (79.3764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(-16.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            zz = 17.75 + (((tickAnim - 5) / 5) * (15.45451-(17.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -33.112+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*50 + (((tickAnim - 10) / 5) * (0-(-33.112+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*50)));
            yy = 79.3764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 10) / 5) * (0-(79.3764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
            zz = 15.45451 + (((tickAnim - 10) / 5) * (0-(15.45451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-54.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*220))*100-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -54.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*220))*100 + (((tickAnim - 8) / 7) * (0-(-54.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*220))*100)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.12468-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (5.98466-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-8.03111-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3.12468 + (((tickAnim - 5) / 3) * (-18.59132-(-3.12468)));
            yy = 5.98466 + (((tickAnim - 5) / 3) * (-2.29968-(5.98466)));
            zz = -8.03111 + (((tickAnim - 5) / 3) * (-14.22867-(-8.03111)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -18.59132 + (((tickAnim - 8) / 2) * (-20.93978-(-18.59132)));
            yy = -2.29968 + (((tickAnim - 8) / 2) * (6.49449-(-2.29968)));
            zz = -14.22867 + (((tickAnim - 8) / 2) * (-24.2497-(-14.22867)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -20.93978 + (((tickAnim - 10) / 3) * (-0.23845-(-20.93978)));
            yy = 6.49449 + (((tickAnim - 10) / 3) * (6.7408-(6.49449)));
            zz = -24.2497 + (((tickAnim - 10) / 3) * (-12.33803-(-24.2497)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.23845 + (((tickAnim - 13) / 2) * (0-(-0.23845)));
            yy = 6.7408 + (((tickAnim - 13) / 2) * (0-(6.7408)));
            zz = -12.33803 + (((tickAnim - 13) / 2) * (0-(-12.33803)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVaranosuchus entity = (EntityPrehistoricFloraVaranosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.25 + (((tickAnim - 10) / 10) * (0-(17.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (23.63-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 23.63 + (((tickAnim - 5) / 5) * (-12.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*55-(23.63)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*55 + (((tickAnim - 10) / 10) * (0-(-12.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*55)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 29.25 + (((tickAnim - 5) / 5) * (0-(29.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVaranosuchus entity = (EntityPrehistoricFloraVaranosuchus) entitylivingbaseIn;
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


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.325-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0.325 + (((tickAnim - 12) / 18) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




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




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-27-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -27 + (((tickAnim - 11) / 10) * (11.75-(-27)));
            yy = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 11.75 + (((tickAnim - 21) / 9) * (0-(11.75)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVaranosuchus entity = (EntityPrehistoricFloraVaranosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (45.75-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 45.75 + (((tickAnim - 21) / 12) * (-26.75-(45.75)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -26.75 + (((tickAnim - 33) / 5) * (-18.75-(-26.75)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -18.75 + (((tickAnim - 38) / 12) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 13 + (((tickAnim - 21) / 6) * (31.54-(13)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 31.54 + (((tickAnim - 27) / 6) * (6.58-(31.54)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 6.58 + (((tickAnim - 33) / 5) * (0-(6.58)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.96-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 21) {
            xx = 1.96 + (((tickAnim - 8) / 13) * (71.5-(1.96)));
            yy = 0 + (((tickAnim - 8) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 13) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 71.5 + (((tickAnim - 21) / 6) * (107.21-(71.5)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 107.21 + (((tickAnim - 27) / 6) * (53.17-(107.21)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 53.17 + (((tickAnim - 33) / 5) * (17.75-(53.17)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 17.75 + (((tickAnim - 38) / 12) * (0-(17.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 6) * (1.88-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 1.88 + (((tickAnim - 27) / 2) * (3.235-(1.88)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 3.235 + (((tickAnim - 29) / 4) * (1.73-(3.235)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 1.73 + (((tickAnim - 33) / 5) * (0-(1.73)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
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
        EntityPrehistoricFloraVaranosuchus entity = (EntityPrehistoricFloraVaranosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -9.25 + (((tickAnim - 18) / 15) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -9.25 + (((tickAnim - 33) / 17) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-2.7-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -2.7 + (((tickAnim - 18) / 15) * (-2.7-(-2.7)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -2.7 + (((tickAnim - 33) / 17) * (0-(-2.7)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-6.75-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -23.5 + (((tickAnim - 18) / 15) * (-23.5-(-23.5)));
            yy = -6.75 + (((tickAnim - 18) / 15) * (-6.75-(-6.75)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.5 + (((tickAnim - 33) / 17) * (0-(-23.5)));
            yy = -6.75 + (((tickAnim - 33) / 17) * (0-(-6.75)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (38.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 38.5 + (((tickAnim - 18) / 15) * (38.5-(38.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 38.5 + (((tickAnim - 33) / 17) * (0-(38.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.15-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0.15 + (((tickAnim - 18) / 15) * (0.15-(0.15)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0.15 + (((tickAnim - 33) / 17) * (0-(0.15)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -5 + (((tickAnim - 18) / 15) * (-5-(-5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 33) / 17) * (0-(-5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (6.75-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -23.5 + (((tickAnim - 18) / 15) * (-23.5-(-23.5)));
            yy = 6.75 + (((tickAnim - 18) / 15) * (6.75-(6.75)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.5 + (((tickAnim - 33) / 17) * (0-(-23.5)));
            yy = 6.75 + (((tickAnim - 33) / 17) * (0-(6.75)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (38.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 38.5 + (((tickAnim - 18) / 15) * (38.5-(38.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 38.5 + (((tickAnim - 33) / 17) * (0-(38.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.15-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0.15 + (((tickAnim - 18) / 15) * (0.15-(0.15)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0.15 + (((tickAnim - 33) / 17) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -5 + (((tickAnim - 18) / 15) * (-5-(-5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 33) / 17) * (0-(-5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 20.75 + (((tickAnim - 18) / 15) * (20.75-(20.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 20.75 + (((tickAnim - 33) / 17) * (0-(20.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -21.5 + (((tickAnim - 18) / 15) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -21.5 + (((tickAnim - 33) / 17) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 10.5 + (((tickAnim - 18) / 15) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 33) / 17) * (0-(10.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 20.75 + (((tickAnim - 18) / 15) * (20.75-(20.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 20.75 + (((tickAnim - 33) / 17) * (0-(20.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -21.5 + (((tickAnim - 18) / 15) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -21.5 + (((tickAnim - 33) / 17) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 10.5 + (((tickAnim - 18) / 15) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 33) / 17) * (0-(10.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 10.75 + (((tickAnim - 18) / 15) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 33) / 17) * (0-(10.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (3-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 18) / 15) * (3-(3)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 3 + (((tickAnim - 33) / 17) * (0-(3)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -7.5 + (((tickAnim - 8) / 10) * (4.5-(-7.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 4.5 + (((tickAnim - 18) / 15) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 4.5 + (((tickAnim - 33) / 5) * (-2.75-(4.5)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 38) / 12) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (12.75-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 12.75 + (((tickAnim - 8) / 10) * (7.49-(12.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 7.49 + (((tickAnim - 18) / 15) * (7.49-(7.49)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 7.49 + (((tickAnim - 33) / 5) * (10.75-(7.49)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 10.75 + (((tickAnim - 38) / 5) * (3.12535-(10.75)));
            yy = 0 + (((tickAnim - 38) / 5) * (1.74056-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (1.02689-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 3.12535 + (((tickAnim - 43) / 7) * (0-(3.12535)));
            yy = 1.74056 + (((tickAnim - 43) / 7) * (0-(1.74056)));
            zz = 1.02689 + (((tickAnim - 43) / 7) * (0-(1.02689)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraVaranosuchus entity = (EntityPrehistoricFloraVaranosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -212.0458+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-250 + (((tickAnim - 0) / 10) * (-34-(-212.0458+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-250)));
            yy = 0.06655 + (((tickAnim - 0) / 10) * (0-(0.06655)));
            zz = -0.20655 + (((tickAnim - 0) / 10) * (0-(-0.20655)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -34 + (((tickAnim - 10) / 10) * (-162.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-200))*-200-(-34)));
            yy = 0 + (((tickAnim - 10) / 10) * (0.06655-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-0.20655-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5 + (((tickAnim - 0) / 3) * (28.29-(5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 28.29 + (((tickAnim - 3) / 4) * (19.73-(28.29)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 19.73 + (((tickAnim - 7) / 3) * (-5.5-(19.73)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5.5 + (((tickAnim - 10) / 10) * (5-(-5.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.125 + (((tickAnim - 10) / 10) * (0-(-0.125)));
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




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 72 + (((tickAnim - 0) / 2) * (105.42-(72)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 105.42 + (((tickAnim - 2) / 4) * (53.96-(105.42)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 53.96 + (((tickAnim - 6) / 4) * (39.75-(53.96)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 39.75 + (((tickAnim - 10) / 3) * (29.25-(39.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 29.25 + (((tickAnim - 13) / 2) * (5-(29.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 15) / 5) * (72-(5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.625 + (((tickAnim - 0) / 4) * (2.49-(0.625)));
            zz = -0.05 + (((tickAnim - 0) / 4) * (-0.04-(-0.05)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 2.49 + (((tickAnim - 4) / 4) * (0.775-(2.49)));
            zz = -0.04 + (((tickAnim - 4) / 4) * (0-(-0.04)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.775 + (((tickAnim - 8) / 2) * (-0.05-(0.775)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = -0.05 + (((tickAnim - 10) / 1) * (-0.1-(-0.05)));
            zz = 0 + (((tickAnim - 10) / 1) * (0.175-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 11) / 1) * (0-(-0.1)));
            zz = 0.175 + (((tickAnim - 11) / 1) * (0-(0.175)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0.25-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 13) / 2) * (-0.125-(0.25)));
            zz = 0 + (((tickAnim - 13) / 2) * (0.515-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -0.125 + (((tickAnim - 15) / 3) * (1.075-(-0.125)));
            zz = 0.515 + (((tickAnim - 15) / 3) * (0.45-(0.515)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1.075 + (((tickAnim - 18) / 2) * (0.625-(1.075)));
            zz = 0.45 + (((tickAnim - 18) / 2) * (-0.05-(0.45)));
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
            xx = -34.25 + (((tickAnim - 0) / 10) * (-80.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-180-(-34.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -80.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-180 + (((tickAnim - 10) / 10) * (-34.25-(-80.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-180)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -5.5 + (((tickAnim - 0) / 10) * (5-(-5.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 10) / 3) * (28.29-(5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 28.29 + (((tickAnim - 13) / 4) * (18.73-(28.29)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 18.73 + (((tickAnim - 17) / 3) * (-5.5-(18.73)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.125 + (((tickAnim - 0) / 10) * (0-(-0.125)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.125-(0)));
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




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 39.75 + (((tickAnim - 0) / 3) * (6.25-(39.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6.25 + (((tickAnim - 3) / 2) * (17.25-(6.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 17.25 + (((tickAnim - 5) / 5) * (72-(17.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 72 + (((tickAnim - 10) / 2) * (105.42-(72)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 105.42 + (((tickAnim - 12) / 4) * (53.96-(105.42)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 53.96 + (((tickAnim - 16) / 4) * (39.75-(53.96)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 1) * (0.35-(-0.05)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.26-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.35 + (((tickAnim - 1) / 1) * (0.5-(0.35)));
            zz = 0.26 + (((tickAnim - 1) / 1) * (0.26-(0.26)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 2) / 1) * (0.5-(0.5)));
            zz = 0.26 + (((tickAnim - 2) / 1) * (0.26-(0.26)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 2) * (0-(0.5)));
            zz = 0.26 + (((tickAnim - 3) / 2) * (0.515-(0.26)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0.515 + (((tickAnim - 5) / 3) * (0.04-(0.515)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.625-(0)));
            zz = 0.04 + (((tickAnim - 8) / 2) * (-0.05-(0.04)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.625 + (((tickAnim - 10) / 3) * (2.49-(0.625)));
            zz = -0.05 + (((tickAnim - 10) / 3) * (-0.04-(-0.05)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 2.49 + (((tickAnim - 13) / 3) * (0.775-(2.49)));
            zz = -0.04 + (((tickAnim - 13) / 3) * (0-(-0.04)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.775 + (((tickAnim - 16) / 4) * (-0.05-(0.775)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
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
            xx = -39 + (((tickAnim - 0) / 10) * (33.25-(-39)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 33.25 + (((tickAnim - 10) / 5) * (-3.35896-(33.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (4.41499-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-12.50524-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -3.35896 + (((tickAnim - 15) / 5) * (-39-(-3.35896)));
            yy = 4.41499 + (((tickAnim - 15) / 5) * (0-(4.41499)));
            zz = -12.50524 + (((tickAnim - 15) / 5) * (0-(-12.50524)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 18.5 + (((tickAnim - 0) / 10) * (2.25-(18.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 2.25 + (((tickAnim - 10) / 2) * (17.42-(2.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 17.42 + (((tickAnim - 12) / 3) * (-35.5-(17.42)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -35.5 + (((tickAnim - 15) / 2) * (-35.5-(-35.5)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -35.5 + (((tickAnim - 17) / 3) * (18.5-(-35.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0.55-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0.55 + (((tickAnim - 12) / 8) * (0-(0.55)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
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
            xx = 20.75 + (((tickAnim - 0) / 5) * (-6.5-(20.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -6.5 + (((tickAnim - 5) / 5) * (37.25-(-6.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 37.25 + (((tickAnim - 10) / 2) * (89.58-(37.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 89.58 + (((tickAnim - 12) / 3) * (96-(89.58)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 96 + (((tickAnim - 15) / 2) * (96-(96)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 96 + (((tickAnim - 17) / 3) * (20.75-(96)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 3) * (0.49-(0.3)));
            zz = -0.225 + (((tickAnim - 0) / 3) * (-0.11-(-0.225)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.49 + (((tickAnim - 3) / 2) * (0.175-(0.49)));
            zz = -0.11 + (((tickAnim - 3) / 2) * (0-(-0.11)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 5) / 5) * (0.65-(0.175)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.55-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.65 + (((tickAnim - 10) / 2) * (0.59-(0.65)));
            zz = -0.55 + (((tickAnim - 10) / 2) * (-1.285-(-0.55)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.59 + (((tickAnim - 12) / 3) * (0.48-(0.59)));
            zz = -1.285 + (((tickAnim - 12) / 3) * (-1.615-(-1.285)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0.48 + (((tickAnim - 15) / 2) * (0.48-(0.48)));
            zz = -1.615 + (((tickAnim - 15) / 2) * (-1.615-(-1.615)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.48 + (((tickAnim - 17) / 3) * (0.3-(0.48)));
            zz = -1.615 + (((tickAnim - 17) / 3) * (-0.225-(-1.615)));
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
            xx = 33.25 + (((tickAnim - 0) / 5) * (-3.35896-(33.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (-4.41499-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (12.50524-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.35896 + (((tickAnim - 5) / 5) * (-39-(-3.35896)));
            yy = -4.41499 + (((tickAnim - 5) / 5) * (0-(-4.41499)));
            zz = 12.50524 + (((tickAnim - 5) / 5) * (0-(12.50524)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -39 + (((tickAnim - 10) / 10) * (33.25-(-39)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 37.25 + (((tickAnim - 0) / 2) * (89.58-(37.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 89.58 + (((tickAnim - 2) / 3) * (96-(89.58)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 96 + (((tickAnim - 5) / 2) * (96-(96)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 96 + (((tickAnim - 7) / 3) * (20.75-(96)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 20.75 + (((tickAnim - 10) / 5) * (-6.5-(20.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -6.5 + (((tickAnim - 15) / 5) * (37.25-(-6.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.65 + (((tickAnim - 0) / 2) * (0.59-(0.65)));
            zz = -0.55 + (((tickAnim - 0) / 2) * (-1.285-(-0.55)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.59 + (((tickAnim - 2) / 3) * (0.48-(0.59)));
            zz = -1.285 + (((tickAnim - 2) / 3) * (-1.615-(-1.285)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.48 + (((tickAnim - 5) / 2) * (0.48-(0.48)));
            zz = -1.615 + (((tickAnim - 5) / 2) * (-1.615-(-1.615)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.48 + (((tickAnim - 7) / 3) * (0.3-(0.48)));
            zz = -1.615 + (((tickAnim - 7) / 3) * (-0.225-(-1.615)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 10) / 3) * (0.49-(0.3)));
            zz = -0.225 + (((tickAnim - 10) / 3) * (-0.11-(-0.225)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.49 + (((tickAnim - 13) / 2) * (0.175-(0.49)));
            zz = -0.11 + (((tickAnim - 13) / 2) * (0-(-0.11)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 15) / 5) * (0.65-(0.175)));
            zz = 0 + (((tickAnim - 15) / 5) * (-0.55-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*2), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*3));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*0.3);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*0.2);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-3), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*2), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*-3));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*4), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-2), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-3));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 2.25 + (((tickAnim - 0) / 2) * (17.42-(2.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 17.42 + (((tickAnim - 2) / 3) * (-35.5-(17.42)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -35.5 + (((tickAnim - 5) / 2) * (-35.5-(-35.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -35.5 + (((tickAnim - 7) / 3) * (18.5-(-35.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 18.5 + (((tickAnim - 10) / 10) * (2.25-(18.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = 0.55 + (((tickAnim - 2) / 8) * (0-(0.55)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
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
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-185))*-4), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*2), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-215))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-130))*0.5), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*3), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*3));
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(0);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(0);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(0);


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-190))*0.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-230))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-260))*1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-350))*19), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-290))*0.5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-400))*15), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*5));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraVaranosuchus entity = (EntityPrehistoricFloraVaranosuchus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+80))*12), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577))*-1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -39.70225 + (((tickAnim - 0) / 7) * (29.54775-(-39.70225)));
            yy = -9.50791 + (((tickAnim - 0) / 7) * (-9.50791-(-9.50791)));
            zz = 3.29063 + (((tickAnim - 0) / 7) * (3.29063-(3.29063)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 29.54775 + (((tickAnim - 7) / 3) * (128.8727+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(29.54775)));
            yy = -9.50791 + (((tickAnim - 7) / 3) * (-9.50791-(-9.50791)));
            zz = 3.29063 + (((tickAnim - 7) / 3) * (3.29063-(3.29063)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 128.8727+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 10) / 3) * (-39.70225-(128.8727+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
            yy = -9.50791 + (((tickAnim - 10) / 3) * (-9.50791-(-9.50791)));
            zz = 3.29063 + (((tickAnim - 10) / 3) * (3.29063-(3.29063)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -23.9452 + (((tickAnim - 0) / 7) * (18.05369-(-23.9452)));
            yy = 0.90165 + (((tickAnim - 0) / 7) * (0.21679-(0.90165)));
            zz = -7.86927 + (((tickAnim - 0) / 7) * (-6.87581-(-7.86927)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 18.05369 + (((tickAnim - 7) / 3) * (33.55425-(18.05369)));
            yy = 0.21679 + (((tickAnim - 7) / 3) * (0.55922-(0.21679)));
            zz = -6.87581 + (((tickAnim - 7) / 3) * (-7.37254-(-6.87581)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 33.55425 + (((tickAnim - 10) / 3) * (-23.9452-(33.55425)));
            yy = 0.55922 + (((tickAnim - 10) / 3) * (0.90165-(0.55922)));
            zz = -7.37254 + (((tickAnim - 10) / 3) * (-7.86927-(-7.37254)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.925 + (((tickAnim - 4) / 3) * (0-(0.925)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
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
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 53.92583 + (((tickAnim - 0) / 3) * (21.53389-(53.92583)));
            yy = -0.62948 + (((tickAnim - 0) / 3) * (-0.41966-(-0.62948)));
            zz = 2.67803 + (((tickAnim - 0) / 3) * (1.78535-(2.67803)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 21.53389 + (((tickAnim - 3) / 4) * (80.5-(21.53389)));
            yy = -0.41966 + (((tickAnim - 3) / 4) * (0-(-0.41966)));
            zz = 1.78535 + (((tickAnim - 3) / 4) * (0-(1.78535)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 80.5 + (((tickAnim - 7) / 1) * (113.82097-(80.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (-0.10491-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0.44634-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 113.82097 + (((tickAnim - 8) / 2) * (77.71291-(113.82097)));
            yy = -0.10491 + (((tickAnim - 8) / 2) * (-0.31474-(-0.10491)));
            zz = 0.44634 + (((tickAnim - 8) / 2) * (1.33901-(0.44634)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 77.71291 + (((tickAnim - 10) / 3) * (53.92583-(77.71291)));
            yy = -0.31474 + (((tickAnim - 10) / 3) * (-0.62948-(-0.31474)));
            zz = 1.33901 + (((tickAnim - 10) / 3) * (2.67803-(1.33901)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.625 + (((tickAnim - 0) / 1) * (1.4-(0.625)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.13-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 1.4 + (((tickAnim - 1) / 2) * (1.08-(1.4)));
            zz = 0.13 + (((tickAnim - 1) / 2) * (0.4-(0.13)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.08 + (((tickAnim - 3) / 1) * (1.22-(1.08)));
            zz = 0.4 + (((tickAnim - 3) / 1) * (0.725-(0.4)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 1.22 + (((tickAnim - 4) / 3) * (0.95-(1.22)));
            zz = 0.725 + (((tickAnim - 4) / 3) * (0-(0.725)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.95 + (((tickAnim - 7) / 1) * (2.12-(0.95)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.655-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 2.12 + (((tickAnim - 8) / 2) * (1.61-(2.12)));
            zz = -0.655 + (((tickAnim - 8) / 2) * (-0.075-(-0.655)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.61 + (((tickAnim - 10) / 3) * (0.625-(1.61)));
            zz = -0.075 + (((tickAnim - 10) / 3) * (0-(-0.075)));
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
            xx = -40.70225 + (((tickAnim - 0) / 7) * (29.54775-(-40.70225)));
            yy = 9.50791 + (((tickAnim - 0) / 7) * (9.50791-(9.50791)));
            zz = -3.29063 + (((tickAnim - 0) / 7) * (-3.29063-(-3.29063)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 29.54775 + (((tickAnim - 7) / 3) * (126.0227+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(29.54775)));
            yy = 9.50791 + (((tickAnim - 7) / 3) * (9.50791-(9.50791)));
            zz = -3.29063 + (((tickAnim - 7) / 3) * (-3.29063-(-3.29063)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 126.0227+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 10) / 3) * (-40.70225-(126.0227+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
            yy = 9.50791 + (((tickAnim - 10) / 3) * (9.50791-(9.50791)));
            zz = -3.29063 + (((tickAnim - 10) / 3) * (-3.29063-(-3.29063)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -23.9452 + (((tickAnim - 0) / 7) * (18.05369-(-23.9452)));
            yy = -0.90165 + (((tickAnim - 0) / 7) * (-0.21679-(-0.90165)));
            zz = 7.86927 + (((tickAnim - 0) / 7) * (6.87581-(7.86927)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 18.05369 + (((tickAnim - 7) / 3) * (33.55425-(18.05369)));
            yy = -0.21679 + (((tickAnim - 7) / 3) * (-0.55922-(-0.21679)));
            zz = 6.87581 + (((tickAnim - 7) / 3) * (7.37254-(6.87581)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 33.55425 + (((tickAnim - 10) / 3) * (-23.9452-(33.55425)));
            yy = -0.55922 + (((tickAnim - 10) / 3) * (-0.90165-(-0.55922)));
            zz = 7.37254 + (((tickAnim - 10) / 3) * (7.86927-(7.37254)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.925 + (((tickAnim - 4) / 3) * (0-(0.925)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
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
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 57.42583 + (((tickAnim - 0) / 3) * (21.53389-(57.42583)));
            yy = 0.62948 + (((tickAnim - 0) / 3) * (0.41966-(0.62948)));
            zz = -2.67803 + (((tickAnim - 0) / 3) * (-1.78535-(-2.67803)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 21.53389 + (((tickAnim - 3) / 4) * (80.5-(21.53389)));
            yy = 0.41966 + (((tickAnim - 3) / 4) * (0-(0.41966)));
            zz = -1.78535 + (((tickAnim - 3) / 4) * (0-(-1.78535)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 80.5 + (((tickAnim - 7) / 1) * (113.82097-(80.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (-0.10491-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0.44634-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 113.82097 + (((tickAnim - 8) / 2) * (77.71291-(113.82097)));
            yy = -0.10491 + (((tickAnim - 8) / 2) * (-0.31474-(-0.10491)));
            zz = 0.44634 + (((tickAnim - 8) / 2) * (1.33901-(0.44634)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 77.71291 + (((tickAnim - 10) / 3) * (57.42583-(77.71291)));
            yy = -0.31474 + (((tickAnim - 10) / 3) * (0.62948-(-0.31474)));
            zz = 1.33901 + (((tickAnim - 10) / 3) * (-2.67803-(1.33901)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.625 + (((tickAnim - 0) / 1) * (1.4-(0.625)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.13-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 1.4 + (((tickAnim - 1) / 2) * (1.08-(1.4)));
            zz = 0.13 + (((tickAnim - 1) / 2) * (0.4-(0.13)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.08 + (((tickAnim - 3) / 1) * (1.22-(1.08)));
            zz = 0.4 + (((tickAnim - 3) / 1) * (0.725-(0.4)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 1.22 + (((tickAnim - 4) / 3) * (0.95-(1.22)));
            zz = 0.725 + (((tickAnim - 4) / 3) * (0-(0.725)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.95 + (((tickAnim - 7) / 1) * (2.12-(0.95)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.655-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 2.12 + (((tickAnim - 8) / 2) * (1.61-(2.12)));
            zz = -0.655 + (((tickAnim - 8) / 2) * (-0.075-(-0.655)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.61 + (((tickAnim - 10) / 3) * (0.625-(1.61)));
            zz = -0.075 + (((tickAnim - 10) / 3) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+30))*-4), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+30))*-5), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.56824 + (((tickAnim - 0) / 3) * (33.542+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(29.56824)));
            yy = -4.99308 + (((tickAnim - 0) / 3) * (0.94736-(-4.99308)));
            zz = 4.16691 + (((tickAnim - 0) / 3) * (-10.84227-(4.16691)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 33.542+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 3) / 4) * (-47.25-(33.542+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
            yy = 0.94736 + (((tickAnim - 3) / 4) * (0-(0.94736)));
            zz = -10.84227 + (((tickAnim - 3) / 4) * (0-(-10.84227)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -47.25 + (((tickAnim - 7) / 6) * (29.56824-(-47.25)));
            yy = 0 + (((tickAnim - 7) / 6) * (-4.99308-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (4.16691-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 31 + (((tickAnim - 0) / 3) * (-39.57-(31)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -39.57 + (((tickAnim - 3) / 4) * (22.25-(-39.57)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 22.25 + (((tickAnim - 7) / 6) * (31-(22.25)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 1) / 6) * (0-(0)));
            yy = 0.6 + (((tickAnim - 1) / 6) * (0-(0.6)));
            zz = 0 + (((tickAnim - 1) / 6) * (0-(0)));
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
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 85.75 + (((tickAnim - 0) / 1) * (73.02-(85.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 73.02 + (((tickAnim - 1) / 2) * (101.15-(73.02)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 101.15 + (((tickAnim - 3) / 4) * (59.75-(101.15)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 59.75 + (((tickAnim - 7) / 1) * (3.00188-(59.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.89391-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.23706-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 3.00188 + (((tickAnim - 8) / 1) * (-17.25192-(3.00188)));
            yy = 0.89391 + (((tickAnim - 8) / 1) * (-0.2769-(0.89391)));
            zz = -0.23706 + (((tickAnim - 8) / 1) * (-0.99907-(-0.23706)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -17.25192 + (((tickAnim - 9) / 4) * (85.75-(-17.25192)));
            yy = -0.2769 + (((tickAnim - 9) / 4) * (0-(-0.2769)));
            zz = -0.99907 + (((tickAnim - 9) / 4) * (0-(-0.99907)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 1.3 + (((tickAnim - 0) / 1) * (1.975-(1.3)));
            zz = -1.15 + (((tickAnim - 0) / 1) * (-1.275-(-1.15)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 1.975 + (((tickAnim - 1) / 2) * (0.675-(1.975)));
            zz = -1.275 + (((tickAnim - 1) / 2) * (-1.605-(-1.275)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.675 + (((tickAnim - 3) / 4) * (0.3-(0.675)));
            zz = -1.605 + (((tickAnim - 3) / 4) * (-0.925-(-1.605)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 7) / 1) * (-0.6-(0.3)));
            zz = -0.925 + (((tickAnim - 7) / 1) * (0-(-0.925)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.6 + (((tickAnim - 8) / 1) * (-0.575-(-0.6)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -0.575 + (((tickAnim - 9) / 2) * (1.6-(-0.575)));
            zz = 0 + (((tickAnim - 9) / 2) * (-0.77-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.6 + (((tickAnim - 11) / 2) * (1.3-(1.6)));
            zz = -0.77 + (((tickAnim - 11) / 2) * (-1.15-(-0.77)));
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
            xx = 29.56824 + (((tickAnim - 0) / 3) * (40.767+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(29.56824)));
            yy = 4.99308 + (((tickAnim - 0) / 3) * (-0.94736-(4.99308)));
            zz = -4.16691 + (((tickAnim - 0) / 3) * (10.84227-(-4.16691)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 40.767+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 3) / 4) * (-47.25-(40.767+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
            yy = -0.94736 + (((tickAnim - 3) / 4) * (0-(-0.94736)));
            zz = 10.84227 + (((tickAnim - 3) / 4) * (0-(10.84227)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -47.25 + (((tickAnim - 7) / 6) * (29.56824-(-47.25)));
            yy = 0 + (((tickAnim - 7) / 6) * (4.99308-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (-4.16691-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 31 + (((tickAnim - 0) / 3) * (-39.57-(31)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -39.57 + (((tickAnim - 3) / 4) * (30.25-(-39.57)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 30.25 + (((tickAnim - 7) / 6) * (31-(30.25)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 1) / 6) * (0-(0)));
            yy = 0.6 + (((tickAnim - 1) / 6) * (-0.05-(0.6)));
            zz = 0 + (((tickAnim - 1) / 6) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.05 + (((tickAnim - 7) / 6) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
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
            xx = 85.75 + (((tickAnim - 0) / 1) * (73.02-(85.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 73.02 + (((tickAnim - 1) / 2) * (101.15-(73.02)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 101.15 + (((tickAnim - 3) / 4) * (59.75-(101.15)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 59.75 + (((tickAnim - 7) / 1) * (9.74725-(59.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.2957-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (2.01793-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 9.74725 + (((tickAnim - 8) / 1) * (-22.00279-(9.74725)));
            yy = 0.2957 + (((tickAnim - 8) / 1) * (0.24578-(0.2957)));
            zz = 2.01793 + (((tickAnim - 8) / 1) * (2.20863-(2.01793)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -22.00279 + (((tickAnim - 9) / 4) * (85.75-(-22.00279)));
            yy = 0.24578 + (((tickAnim - 9) / 4) * (0-(0.24578)));
            zz = 2.20863 + (((tickAnim - 9) / 4) * (0-(2.20863)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 1.3 + (((tickAnim - 0) / 1) * (1.975-(1.3)));
            zz = -1.15 + (((tickAnim - 0) / 1) * (-1.275-(-1.15)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 1.975 + (((tickAnim - 1) / 2) * (0.675-(1.975)));
            zz = -1.275 + (((tickAnim - 1) / 2) * (-1.605-(-1.275)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.675 + (((tickAnim - 3) / 4) * (0.3-(0.675)));
            zz = -1.605 + (((tickAnim - 3) / 4) * (-0.925-(-1.605)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 7) / 1) * (0.05-(0.3)));
            zz = -0.925 + (((tickAnim - 7) / 1) * (0-(-0.925)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.05 + (((tickAnim - 8) / 1) * (-0.575-(0.05)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -0.575 + (((tickAnim - 9) / 2) * (1.6-(-0.575)));
            zz = 0 + (((tickAnim - 9) / 2) * (-0.77-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.6 + (((tickAnim - 11) / 2) * (1.3-(1.6)));
            zz = -0.77 + (((tickAnim - 11) / 2) * (-1.15-(-0.77)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+80))*-12), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+180))*-5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(0), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-50))*-5), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-100))*5), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-150))*-15), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-200))*-20 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-200))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-200))*-20)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-200))*-20 + (((tickAnim - 5) / 1) * (5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-200))*-11.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-200))*-20)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-200))*-11.5 + (((tickAnim - 6) / 1) * (12.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-200))*-11.5-(5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-200))*-11.5)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 12.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-200))*-11.5 + (((tickAnim - 7) / 1) * (10.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-200))*-11.5-(12.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-200))*-11.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 10.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-200))*-11.5 + (((tickAnim - 8) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-200))*-13.75-(10.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-200))*-11.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-200))*-13.75 + (((tickAnim - 9) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-200))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-200))*-13.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-25 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-25 + (((tickAnim - 5) / 1) * (-26.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-25)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -26.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-25 + (((tickAnim - 6) / 1) * (-2.38-(-26.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-25)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -2.38 + (((tickAnim - 7) / 1) * (-5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-25-(-2.38)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-25 + (((tickAnim - 8) / 1) * (7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-25-(-5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-25)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-25 + (((tickAnim - 9) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-42.5-(7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-25)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-42.5 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-42.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-42.5)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-42.5 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*577-250))*-42.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraVaranosuchus ee = (EntityPrehistoricFloraVaranosuchus) entitylivingbaseIn;

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
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraVaranosuchus e = (EntityPrehistoricFloraVaranosuchus) entity;

    }
}
