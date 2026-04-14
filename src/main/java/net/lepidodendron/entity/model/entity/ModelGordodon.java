package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGordodon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelGordodon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    private ModelAnimator animator;

    public ModelGordodon() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 19.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.293F, 7.059F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.4399F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 60, 0, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.1289F, 6.735F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6981F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 59, 58, -0.5F, -0.6F, -0.5F, 1, 2, 0, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -5.5915F, 5.7297F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 59, 54, -0.5F, 1.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -6.4817F, 6.7335F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 59, 46, -0.5F, -1.8F, 1.2F, 1, 3, 0, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -7.6271F, 4.9175F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.0472F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 58, -0.5F, -2.5F, 0.9F, 1, 3, 0, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.6872F, 5.1019F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 12, 0.025F, -9.875F, -0.55F, 0, 10, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -1.6F, 7.1F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 9, -2.5F, 0.125F, -2.15F, 4, 4, 4, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.4774F, -0.3717F, 7.3669F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.1393F, -0.4149F, -0.3348F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 26, 48, -3.9133F, -0.1585F, -0.9744F, 4, 2, 2, 0.01F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-3.1235F, 0.4071F, 0.0256F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, -1.0908F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 13, 48, -4.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-3.0718F, 0.0616F, 0.7131F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.3865F, -0.014F, -0.1829F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 50, 48, -1.0F, -1.5F, -3.0F, 1, 3, 3, 0.0F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.4774F, -0.3717F, 7.3669F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.1393F, 0.4149F, 0.3348F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 26, 48, -0.0867F, -0.1585F, -0.9744F, 4, 2, 2, 0.01F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(3.1235F, 0.4071F, 0.0256F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, 1.0908F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 13, 48, 0.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(3.0718F, 0.0616F, 0.7131F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.3865F, 0.014F, 0.1829F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 50, 48, 0.0F, -1.5F, -3.0F, 1, 3, 3, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.9F, 4.5F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 47, 54, -0.3786F, -5.6313F, -4.0883F, 1, 6, 0, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.1214F, -5.5857F, -2.2674F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.7854F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 58, 12, -0.5F, -4.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.1214F, -2.6313F, -2.7883F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 53, 55, -0.5F, -2.0F, 1.5F, 1, 5, 0, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.1214F, -2.6313F, -2.7883F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 50, 55, -0.5F, -2.0F, 0.0F, 1, 5, 0, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.1214F, -8.018F, -3.0708F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6545F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 58, -0.5F, -2.2F, 0.5F, 1, 4, 0, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.1214F, -7.2189F, -4.6868F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.5236F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 58, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.6214F, 0.0F, -3.9979F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 31, -2.5F, -10.025F, -1.0F, 0, 10, 6, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 15, 12, -5.0F, -0.025F, 0.0F, 5, 5, 5, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-0.3786F, 0.25F, -3.4978F);
        this.body.addChild(body2);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -0.35F, 1.0F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 23, -2.5F, 4.4F, -7.0F, 5, 1, 6, -0.003F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -3.0F, 0.0F, -7.0F, 6, 5, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -4.1163F, -1.5381F);
        this.body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 44, 54, -0.5F, -2.5F, 0.9F, 1, 7, 0, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 29, 53, -0.5F, -5.5F, 0.0F, 1, 10, 0, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -4.1469F, -2.2375F);
        this.body2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 35, 53, -0.5F, -4.5F, 0.0F, 1, 9, 0, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -3.8118F, -5.3258F);
        this.body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 53, -0.5F, -4.7F, 2.1F, 1, 9, 0, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, -3.8118F, -5.3258F);
        this.body2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 41, 54, -0.5F, -3.7F, 1.0F, 1, 8, 0, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, -3.8118F, -5.3258F);
        this.body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 38, 54, -0.5F, -3.7F, 0.0F, 1, 8, 0, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(3.0F, -0.35F, 1.0F);
        this.body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 30, -2.475F, -10.0F, -7.0F, 0, 10, 6, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(-0.5F, 0.0489F, -5.5262F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0873F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 25, 0, -1.5F, -0.025F, -3.8F, 5, 4, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, 3.975F, -3.8F);
        this.body3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2313F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 38, 18, -2.0F, -1.025F, 0.1F, 4, 1, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.5F, -3.0519F, -2.5203F);
        this.body3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.4363F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 57, 0, -1.0F, -1.4F, -1.6F, 1, 5, 0, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.5F, -3.0519F, -2.5203F);
        this.body3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3054F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 56, 55, -1.0F, -1.4F, -0.7F, 1, 5, 0, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0F, -2.7616F, -1.7229F);
        this.body3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2182F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 54, 40, -0.5F, -3.7F, 0.7F, 1, 7, 0, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, -2.7616F, -1.7229F);
        this.body3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2618F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 38, 24, -0.5F, -3.0F, 0.0F, 1, 6, 0, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.5F, -3.0519F, -2.5203F);
        this.body3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3491F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 55, 12, -1.0F, -2.4F, 0.0F, 1, 6, 0, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.body3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2182F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 43, 24, -2.0F, -7.025F, -3.8F, 0, 7, 4, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.956F, 2.1353F, -1.7376F);
        this.body3.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0F, -0.3491F, 0.6109F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 0, 53, -0.187F, -0.6048F, -1.1426F, 3, 2, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(2.4508F, 0.3188F, -0.1085F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.0116F, 0.2983F, 1.0884F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 52, 24, -0.1512F, -0.9141F, -1.0475F, 3, 2, 2, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(1.9988F, 0.0859F, 0.6275F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.2121F, -0.1642F, -0.1306F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 52, 29, -0.0534F, -1.6828F, -2.9107F, 1, 3, 3, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-0.956F, 2.1353F, -1.7376F);
        this.body3.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.0F, 0.3491F, -0.6109F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 0, 53, -2.813F, -0.6048F, -1.1426F, 3, 2, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-2.4508F, 0.3188F, -0.1085F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.0116F, -0.2983F, -1.0884F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 52, 24, -2.8488F, -0.9141F, -1.0475F, 3, 2, 2, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-1.9988F, 0.0859F, 0.6275F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2121F, 0.1642F, 0.1306F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 52, 29, -0.9466F, -1.6828F, -2.9107F, 1, 3, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0065F, -3.4253F);
        this.body3.addChild(neck);
        this.setRotateAngle(neck, -0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 47, -0.5F, 0.0F, -2.8F, 3, 2, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.0F, 2.0F, -2.8F);
        this.neck.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.4363F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 39, 48, -1.0F, -1.425F, 0.35F, 2, 2, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.0F, -0.889F, -0.8979F);
        this.neck.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.7854F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 59, 50, -0.5F, -1.5F, -0.1F, 1, 3, 0, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, 1.1508F, -1.4466F);
        this.neck.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.9599F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 13, 58, 0.0F, -2.2F, 1.4F, 1, 3, 0, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, 1.1508F, -1.4716F);
        this.neck.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.9599F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 32, 9, 0.0F, -2.2F, 0.8F, 1, 2, 0, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.neck.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3927F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 22, 53, -1.975F, -3.9F, -2.8F, 0, 4, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.775F);
        this.neck.addChild(head);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(2.0F, 1.58F, -1.7233F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2182F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 25, 9, -2.0F, -1.175F, 1.0F, 2, 1, 1, -0.003F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.0F, 1.2616F, -2.8784F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 1.309F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 5, 58, -0.5F, 0.0F, -1.0F, 1, 1, 1, -0.066F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(1.0F, 1.0866F, -2.7784F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.829F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 55, 19, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.003F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.4F, 0.8437F, -1.2522F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.3897F, -0.05F, 0.121F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 57, 43, -0.5F, -0.4F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(1.6F, 0.8437F, -1.2522F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.3897F, 0.05F, -0.121F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 57, 43, -0.5F, -0.4F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, 1.5703F, -1.4495F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.1745F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 52, 36, -0.5F, -1.0F, 0.0F, 2, 1, 2, 0.003F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(1.0F, 0.0F, 0.025F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.4363F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 43, 36, -1.0F, -0.2F, -3.0F, 2, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(1.0F, 1.325F, -0.425F);
        this.head.addChild(jaw);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.0F, 0.495F, -1.7971F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.4232F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 58, -1.5F, -0.5F, -0.5F, 1, 1, 1, -0.077F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.5221F, -2.4359F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1353F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 57, 40, -0.5F, -0.175F, 0.05F, 1, 1, 1, 0.0F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 53, 7, -1.0F, -0.175F, 0.5F, 2, 1, 3, -0.006F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 1.2047F, -1.3338F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.1265F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 11, 53, -1.0F, -1.0F, 0.0F, 2, 1, 3, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.2954F, 8.5521F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.3927F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 26, 31, -1.5F, 0.0F, 0.0F, 3, 3, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1F, 4.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 40, -1.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2618F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 41, 40, -0.75F, 0.0F, 0.0F, 1, 2, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 41, 40, -0.25F, 0.0F, 0.0F, 1, 2, 5, -0.001F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1F, 4.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 44, 0, -0.5F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
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

        EntityPrehistoricFloraGordodon EntityMegalosaurus = (EntityPrehistoricFloraGordodon) e;

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
        EntityPrehistoricFloraGordodon entity = (EntityPrehistoricFloraGordodon) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
       

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGordodon entity = (EntityPrehistoricFloraGordodon) entitylivingbaseIn;
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
            yy = 0 + (((tickAnim - 23) / 7) * (0.1-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (-0.75-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.695 + (((tickAnim - 30) / 20) * (0-(-1.695)));
            yy = 0.1 + (((tickAnim - 30) / 20) * (0-(0.1)));
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
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGordodon entity = (EntityPrehistoricFloraGordodon) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-6.20284-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-1.44873-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -6.20284 + (((tickAnim - 18) / 10) * (0-(-6.20284)));
            yy = -1.44873 + (((tickAnim - 18) / 10) * (0-(-1.44873)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




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


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGordodon entity = (EntityPrehistoricFloraGordodon) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*3), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*8), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*9));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-0.5);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-80))*0.5);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*-2), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-70))*-8), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-100))*2), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-70))*-8), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*2), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-6), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*6), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*1), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*8), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-4-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*-5.5), tail.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*4), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*8));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-1.25), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-12), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-15), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*-20), tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1.85969 + (((tickAnim - 0) / 8) * (51.96378-(1.85969)));
            yy = 32.61587 + (((tickAnim - 0) / 8) * (-28.68449-(32.61587)));
            zz = 8.45559 + (((tickAnim - 0) / 8) * (-13.11544-(8.45559)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 51.96378 + (((tickAnim - 8) / 4) * (5.78404-(51.96378)));
            yy = -28.68449 + (((tickAnim - 8) / 4) * (18.50602-(-28.68449)));
            zz = -13.11544 + (((tickAnim - 8) / 4) * (-29.54389-(-13.11544)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 5.78404 + (((tickAnim - 12) / 3) * (1.85969-(5.78404)));
            yy = 18.50602 + (((tickAnim - 12) / 3) * (32.61587-(18.50602)));
            zz = -29.54389 + (((tickAnim - 12) / 3) * (8.45559-(-29.54389)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -7.27889 + (((tickAnim - 0) / 8) * (0-(-7.27889)));
            yy = -14.74906 + (((tickAnim - 0) / 8) * (0-(-14.74906)));
            zz = -34.41972 + (((tickAnim - 0) / 8) * (-41.25-(-34.41972)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (-12.16459-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (14.99887-(0)));
            zz = -41.25 + (((tickAnim - 8) / 4) * (-37.79652-(-41.25)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -12.16459 + (((tickAnim - 12) / 1) * (-31.78383-(-12.16459)));
            yy = 14.99887 + (((tickAnim - 12) / 1) * (30.03588-(14.99887)));
            zz = -37.79652 + (((tickAnim - 12) / 1) * (-52.56253-(-37.79652)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -31.78383 + (((tickAnim - 13) / 2) * (-7.27889-(-31.78383)));
            yy = 30.03588 + (((tickAnim - 13) / 2) * (-14.74906-(30.03588)));
            zz = -52.56253 + (((tickAnim - 13) / 2) * (-34.41972-(-52.56253)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
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
            xx = -12.28945 + (((tickAnim - 0) / 3) * (-13.83346-(-12.28945)));
            yy = -8.05943 + (((tickAnim - 0) / 3) * (21.17917-(-8.05943)));
            zz = 26.88433 + (((tickAnim - 0) / 3) * (28.53439-(26.88433)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -13.83346 + (((tickAnim - 3) / 5) * (0-(-13.83346)));
            yy = 21.17917 + (((tickAnim - 3) / 5) * (-59.75-(21.17917)));
            zz = 28.53439 + (((tickAnim - 3) / 5) * (0-(28.53439)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -59.75 + (((tickAnim - 8) / 4) * (-96.75-(-59.75)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (-12.28945-(0)));
            yy = -96.75 + (((tickAnim - 12) / 3) * (-8.05943-(-96.75)));
            zz = 0 + (((tickAnim - 12) / 3) * (26.88433-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.125-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.125 + (((tickAnim - 3) / 5) * (-0.375-(-0.125)));
            yy = -0.25 + (((tickAnim - 3) / 5) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 3) / 5) * (-0.275-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.375 + (((tickAnim - 8) / 4) * (0.19-(-0.375)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = -0.275 + (((tickAnim - 8) / 4) * (-1.09-(-0.275)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0.19 + (((tickAnim - 12) / 3) * (0-(0.19)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = -1.09 + (((tickAnim - 12) / 3) * (0-(-1.09)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 22.66692 + (((tickAnim - 0) / 8) * (47.92002-(22.66692)));
            yy = -26.44238 + (((tickAnim - 0) / 8) * (41.95784-(-26.44238)));
            zz = -14.00093 + (((tickAnim - 0) / 8) * (-5.12179-(-14.00093)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 47.92002 + (((tickAnim - 8) / 4) * (29.93838-(47.92002)));
            yy = 41.95784 + (((tickAnim - 8) / 4) * (5.0882-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*150-(41.95784)));
            zz = -5.12179 + (((tickAnim - 8) / 4) * (22.5518+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50-(-5.12179)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 29.93838 + (((tickAnim - 12) / 3) * (22.66692-(29.93838)));
            yy = 5.0882-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*150 + (((tickAnim - 12) / 3) * (-26.44238-(5.0882-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*150)));
            zz = 22.5518+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50 + (((tickAnim - 12) / 3) * (-14.00093-(22.5518+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (19.14805-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-18.01047-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.67566-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 19.14805 + (((tickAnim - 3) / 5) * (0-(19.14805)));
            yy = -18.01047 + (((tickAnim - 3) / 5) * (0-(-18.01047)));
            zz = 0.67566 + (((tickAnim - 3) / 5) * (0-(0.67566)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (33-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 33 + (((tickAnim - 12) / 1) * (42.72-(33)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 42.72 + (((tickAnim - 13) / 2) * (0-(42.72)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.11-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.125-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.11 + (((tickAnim - 3) / 5) * (0-(-0.11)));
            zz = 0.125 + (((tickAnim - 3) / 5) * (0-(0.125)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 12) / 1) * (-0.4-(-0.25)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.4 + (((tickAnim - 13) / 2) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
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
            xx = -46.07665 + (((tickAnim - 0) / 3) * (-48.63968-(-46.07665)));
            yy = -2.97195 + (((tickAnim - 0) / 3) * (-0.25968-(-2.97195)));
            zz = 6.91971 + (((tickAnim - 0) / 3) * (8.12527-(6.91971)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -48.63968 + (((tickAnim - 3) / 2) * (-55.59323-(-48.63968)));
            yy = -0.25968 + (((tickAnim - 3) / 2) * (-17.00826-(-0.25968)));
            zz = 8.12527 + (((tickAnim - 3) / 2) * (-3.21416-(8.12527)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -55.59323 + (((tickAnim - 5) / 3) * (-62.53187-(-55.59323)));
            yy = -17.00826 + (((tickAnim - 5) / 3) * (7.30925-(-17.00826)));
            zz = -3.21416 + (((tickAnim - 5) / 3) * (-75.82071-(-3.21416)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -62.53187 + (((tickAnim - 8) / 1) * (-63.0912-(-62.53187)));
            yy = 7.30925 + (((tickAnim - 8) / 1) * (5.21267-(7.30925)));
            zz = -75.82071 + (((tickAnim - 8) / 1) * (-109.37682-(-75.82071)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -63.0912 + (((tickAnim - 9) / 3) * (-59.66035-(-63.0912)));
            yy = 5.21267 + (((tickAnim - 9) / 3) * (-7.30852-(5.21267)));
            zz = -109.37682 + (((tickAnim - 9) / 3) * (-92.0208-(-109.37682)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -59.66035 + (((tickAnim - 12) / 1) * (-56.29297-(-59.66035)));
            yy = -7.30852 + (((tickAnim - 12) / 1) * (-9.91039-(-7.30852)));
            zz = -92.0208 + (((tickAnim - 12) / 1) * (-35.37145-(-92.0208)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -56.29297 + (((tickAnim - 13) / 2) * (-46.07665-(-56.29297)));
            yy = -9.91039 + (((tickAnim - 13) / 2) * (-2.97195-(-9.91039)));
            zz = -35.37145 + (((tickAnim - 13) / 2) * (6.91971-(-35.37145)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.05 + (((tickAnim - 0) / 3) * (0.055-(-0.05)));
            yy = -0.45 + (((tickAnim - 0) / 3) * (-0.3-(-0.45)));
            zz = -0.375 + (((tickAnim - 0) / 3) * (-0.52-(-0.375)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0.055 + (((tickAnim - 3) / 5) * (0-(0.055)));
            yy = -0.3 + (((tickAnim - 3) / 5) * (0-(-0.3)));
            zz = -0.52 + (((tickAnim - 3) / 5) * (-0.8-(-0.52)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (-0.01-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0.37-(0)));
            zz = -0.8 + (((tickAnim - 8) / 1) * (-0.73-(-0.8)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -0.01 + (((tickAnim - 9) / 3) * (-0.03-(-0.01)));
            yy = 0.37 + (((tickAnim - 9) / 3) * (0.505-(0.37)));
            zz = -0.73 + (((tickAnim - 9) / 3) * (-0.59-(-0.73)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -0.03 + (((tickAnim - 12) / 3) * (-0.05-(-0.03)));
            yy = 0.505 + (((tickAnim - 12) / 3) * (-0.45-(0.505)));
            zz = -0.59 + (((tickAnim - 12) / 3) * (-0.375-(-0.59)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 47.92002 + (((tickAnim - 0) / 4) * (27.41079-(47.92002)));
            yy = -41.95784 + (((tickAnim - 0) / 4) * (54.8948-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-150-(-41.95784)));
            zz = 5.12179 + (((tickAnim - 0) / 4) * (-4.691+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50-(5.12179)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 27.41079 + (((tickAnim - 4) / 4) * (22.66692-(27.41079)));
            yy = 54.8948-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-150 + (((tickAnim - 4) / 4) * (26.44238-(54.8948-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-150)));
            zz = -4.691+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50 + (((tickAnim - 4) / 4) * (14.00093-(-4.691+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 22.66692 + (((tickAnim - 8) / 7) * (47.92002-(22.66692)));
            yy = 26.44238 + (((tickAnim - 8) / 7) * (-41.95784-(26.44238)));
            zz = 14.00093 + (((tickAnim - 8) / 7) * (5.12179-(14.00093)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-35.25-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = -35.25 + (((tickAnim - 4) / 2) * (-42.72-(-35.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = -42.72 + (((tickAnim - 6) / 2) * (-11-(-42.72)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (19.14805-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (18.01047-(0)));
            zz = -11 + (((tickAnim - 8) / 2) * (-0.67566-(-11)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 19.14805 + (((tickAnim - 10) / 5) * (0-(19.14805)));
            yy = 18.01047 + (((tickAnim - 10) / 5) * (0-(18.01047)));
            zz = -0.67566 + (((tickAnim - 10) / 5) * (0-(-0.67566)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.35-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0.35 + (((tickAnim - 4) / 4) * (0-(0.35)));
            yy = -0.25 + (((tickAnim - 4) / 4) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-0.11-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.125-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.11 + (((tickAnim - 10) / 5) * (0-(-0.11)));
            zz = 0.125 + (((tickAnim - 10) / 5) * (0-(0.125)));
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
            xx = -62.53187 + (((tickAnim - 0) / 2) * (-63.0912-(-62.53187)));
            yy = -7.30925 + (((tickAnim - 0) / 2) * (-5.21267-(-7.30925)));
            zz = 75.82071 + (((tickAnim - 0) / 2) * (109.37682-(75.82071)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -63.0912 + (((tickAnim - 2) / 2) * (-59.66035-(-63.0912)));
            yy = -5.21267 + (((tickAnim - 2) / 2) * (7.30852-(-5.21267)));
            zz = 109.37682 + (((tickAnim - 2) / 2) * (92.0208-(109.37682)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -59.66035 + (((tickAnim - 4) / 2) * (-56.29297-(-59.66035)));
            yy = 7.30852 + (((tickAnim - 4) / 2) * (9.91039-(7.30852)));
            zz = 92.0208 + (((tickAnim - 4) / 2) * (35.37145-(92.0208)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -56.29297 + (((tickAnim - 6) / 2) * (-45.87876-(-56.29297)));
            yy = 9.91039 + (((tickAnim - 6) / 2) * (3.75857-(9.91039)));
            zz = 35.37145 + (((tickAnim - 6) / 2) * (5.58556-(35.37145)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -45.87876 + (((tickAnim - 8) / 2) * (-48.63968-(-45.87876)));
            yy = 3.75857 + (((tickAnim - 8) / 2) * (0.25968-(3.75857)));
            zz = 5.58556 + (((tickAnim - 8) / 2) * (-8.12527-(5.58556)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -48.63968 + (((tickAnim - 10) / 3) * (-55.59323-(-48.63968)));
            yy = 0.25968 + (((tickAnim - 10) / 3) * (17.00826-(0.25968)));
            zz = -8.12527 + (((tickAnim - 10) / 3) * (3.21416-(-8.12527)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -55.59323 + (((tickAnim - 13) / 2) * (-62.53187-(-55.59323)));
            yy = 17.00826 + (((tickAnim - 13) / 2) * (-7.30925-(17.00826)));
            zz = 3.21416 + (((tickAnim - 13) / 2) * (75.82071-(3.21416)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.01-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.37-(0)));
            zz = -0.8 + (((tickAnim - 0) / 2) * (-0.73-(-0.8)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -0.01 + (((tickAnim - 2) / 2) * (-0.03-(-0.01)));
            yy = 0.37 + (((tickAnim - 2) / 2) * (0.505-(0.37)));
            zz = -0.73 + (((tickAnim - 2) / 2) * (-0.59-(-0.73)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.03 + (((tickAnim - 4) / 4) * (-0.05-(-0.03)));
            yy = 0.505 + (((tickAnim - 4) / 4) * (-0.45-(0.505)));
            zz = -0.59 + (((tickAnim - 4) / 4) * (-0.375-(-0.59)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.05 + (((tickAnim - 8) / 2) * (-0.03-(-0.05)));
            yy = -0.45 + (((tickAnim - 8) / 2) * (-0.3-(-0.45)));
            zz = -0.375 + (((tickAnim - 8) / 2) * (-0.52-(-0.375)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.03 + (((tickAnim - 10) / 5) * (0-(-0.03)));
            yy = -0.3 + (((tickAnim - 10) / 5) * (0-(-0.3)));
            zz = -0.52 + (((tickAnim - 10) / 5) * (-0.8-(-0.52)));
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
            xx = 51.08281 + (((tickAnim - 0) / 4) * (5.78404-(51.08281)));
            yy = 28.06227 + (((tickAnim - 0) / 4) * (-18.50602-(28.06227)));
            zz = 11.93691 + (((tickAnim - 0) / 4) * (29.54389-(11.93691)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5.78404 + (((tickAnim - 4) / 4) * (1.85969-(5.78404)));
            yy = -18.50602 + (((tickAnim - 4) / 4) * (-32.61587-(-18.50602)));
            zz = 29.54389 + (((tickAnim - 4) / 4) * (-8.45559-(29.54389)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1.85969 + (((tickAnim - 8) / 7) * (47.47469-(1.85969)));
            yy = -32.61587 + (((tickAnim - 8) / 7) * (25.12424-(-32.61587)));
            zz = -8.45559 + (((tickAnim - 8) / 7) * (6.97352-(-8.45559)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-12.16459-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-14.99887-(0)));
            zz = 41.25 + (((tickAnim - 0) / 4) * (37.79652-(41.25)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -12.16459 + (((tickAnim - 4) / 2) * (-31.78383-(-12.16459)));
            yy = -14.99887 + (((tickAnim - 4) / 2) * (-30.03588-(-14.99887)));
            zz = 37.79652 + (((tickAnim - 4) / 2) * (52.56253-(37.79652)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -31.78383 + (((tickAnim - 6) / 2) * (-7.27889-(-31.78383)));
            yy = -30.03588 + (((tickAnim - 6) / 2) * (14.74906-(-30.03588)));
            zz = 52.56253 + (((tickAnim - 6) / 2) * (34.41972-(52.56253)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -7.27889 + (((tickAnim - 8) / 7) * (0-(-7.27889)));
            yy = 14.74906 + (((tickAnim - 8) / 7) * (0-(14.74906)));
            zz = 34.41972 + (((tickAnim - 8) / 7) * (41.25-(34.41972)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 59.75 + (((tickAnim - 0) / 4) * (96.75-(59.75)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (-12.28945-(0)));
            yy = 96.75 + (((tickAnim - 4) / 4) * (8.05943-(96.75)));
            zz = 0 + (((tickAnim - 4) / 4) * (-26.88433-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -12.28945 + (((tickAnim - 8) / 3) * (-13.84631-(-12.28945)));
            yy = 8.05943 + (((tickAnim - 8) / 3) * (-17.3933-(8.05943)));
            zz = -26.88433 + (((tickAnim - 8) / 3) * (-27.12527-(-26.88433)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -13.84631 + (((tickAnim - 11) / 4) * (0-(-13.84631)));
            yy = -17.3933 + (((tickAnim - 11) / 4) * (59.75-(-17.3933)));
            zz = -27.12527 + (((tickAnim - 11) / 4) * (0-(-27.12527)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.375 + (((tickAnim - 0) / 4) * (0.19-(0.375)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = -0.275 + (((tickAnim - 0) / 4) * (-1.09-(-0.275)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0.19 + (((tickAnim - 4) / 4) * (0-(0.19)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = -1.09 + (((tickAnim - 4) / 4) * (0-(-1.09)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0.295-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-0.12-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0.295 + (((tickAnim - 11) / 4) * (0.375-(0.295)));
            yy = -0.225 + (((tickAnim - 11) / 4) * (0-(-0.225)));
            zz = -0.12 + (((tickAnim - 11) / 4) * (-0.275-(-0.12)));
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
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGordodon entity = (EntityPrehistoricFloraGordodon) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*1), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*3), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-0.25);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-80))*0.25);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*-1), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-70))*-4), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*1), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-70))*-4), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*1), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-3), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*3), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*0.5), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*3), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-5.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*-1.5), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-1.25), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-7), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-10), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*-15), tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1.85969 + (((tickAnim - 0) / 15) * (47.47469-(1.85969)));
            yy = 32.61587 + (((tickAnim - 0) / 15) * (-25.12424-(32.61587)));
            zz = 8.45559 + (((tickAnim - 0) / 15) * (-6.97352-(8.45559)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 47.47469 + (((tickAnim - 15) / 8) * (5.78404-(47.47469)));
            yy = -25.12424 + (((tickAnim - 15) / 8) * (18.50602-(-25.12424)));
            zz = -6.97352 + (((tickAnim - 15) / 8) * (-29.54389-(-6.97352)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 5.78404 + (((tickAnim - 23) / 7) * (1.85969-(5.78404)));
            yy = 18.50602 + (((tickAnim - 23) / 7) * (32.61587-(18.50602)));
            zz = -29.54389 + (((tickAnim - 23) / 7) * (8.45559-(-29.54389)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -7.27889 + (((tickAnim - 0) / 15) * (0-(-7.27889)));
            yy = -14.74906 + (((tickAnim - 0) / 15) * (0-(-14.74906)));
            zz = -34.41972 + (((tickAnim - 0) / 15) * (-41.25-(-34.41972)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (-12.16459-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (14.99887-(0)));
            zz = -41.25 + (((tickAnim - 15) / 8) * (-37.79652-(-41.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -12.16459 + (((tickAnim - 23) / 2) * (-31.78383-(-12.16459)));
            yy = 14.99887 + (((tickAnim - 23) / 2) * (30.03588-(14.99887)));
            zz = -37.79652 + (((tickAnim - 23) / 2) * (-52.56253-(-37.79652)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -31.78383 + (((tickAnim - 25) / 5) * (-7.27889-(-31.78383)));
            yy = 30.03588 + (((tickAnim - 25) / 5) * (-14.74906-(30.03588)));
            zz = -52.56253 + (((tickAnim - 25) / 5) * (-34.41972-(-52.56253)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
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
            xx = -12.28945 + (((tickAnim - 0) / 7) * (-13.10151-(-12.28945)));
            yy = -8.05943 + (((tickAnim - 0) / 7) * (21.25962-(-8.05943)));
            zz = 26.88433 + (((tickAnim - 0) / 7) * (32.10918-(26.88433)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -13.10151 + (((tickAnim - 7) / 8) * (0-(-13.10151)));
            yy = 21.25962 + (((tickAnim - 7) / 8) * (-59.75-(21.25962)));
            zz = 32.10918 + (((tickAnim - 7) / 8) * (0-(32.10918)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -59.75 + (((tickAnim - 15) / 8) * (-96.75-(-59.75)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (-12.28945-(0)));
            yy = -96.75 + (((tickAnim - 23) / 7) * (-8.05943-(-96.75)));
            zz = 0 + (((tickAnim - 23) / 7) * (26.88433-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0.175-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0.175 + (((tickAnim - 7) / 8) * (-0.375-(0.175)));
            yy = -0.375 + (((tickAnim - 7) / 8) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 7) / 8) * (-0.275-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -0.375 + (((tickAnim - 15) / 8) * (0.19-(-0.375)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = -0.275 + (((tickAnim - 15) / 8) * (-1.09-(-0.275)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0.19 + (((tickAnim - 23) / 7) * (0-(0.19)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = -1.09 + (((tickAnim - 23) / 7) * (0-(-1.09)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 22.66692 + (((tickAnim - 0) / 15) * (47.66081-(22.66692)));
            yy = -26.44238 + (((tickAnim - 0) / 15) * (24.88007-(-26.44238)));
            zz = -14.00093 + (((tickAnim - 0) / 15) * (-2.22589-(-14.00093)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 47.66081 + (((tickAnim - 15) / 8) * (29.93838-(47.66081)));
            yy = 24.88007 + (((tickAnim - 15) / 8) * (65.7882-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*150-(24.88007)));
            zz = -2.22589 + (((tickAnim - 15) / 8) * (2.1018+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50-(-2.22589)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 29.93838 + (((tickAnim - 23) / 7) * (22.66692-(29.93838)));
            yy = 65.7882-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*150 + (((tickAnim - 23) / 7) * (-26.44238-(65.7882-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*150)));
            zz = 2.1018+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50 + (((tickAnim - 23) / 7) * (-14.00093-(2.1018+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (19.14805-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-18.01047-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.67566-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 19.14805 + (((tickAnim - 5) / 10) * (0-(19.14805)));
            yy = -18.01047 + (((tickAnim - 5) / 10) * (0-(-18.01047)));
            zz = 0.67566 + (((tickAnim - 5) / 10) * (0-(0.67566)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (33-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 33 + (((tickAnim - 23) / 3) * (42.72-(33)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 42.72 + (((tickAnim - 26) / 4) * (0-(42.72)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.11-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.125-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = -0.11 + (((tickAnim - 5) / 10) * (0-(-0.11)));
            zz = 0.125 + (((tickAnim - 5) / 10) * (0-(0.125)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 23) / 3) * (-0.4-(-0.25)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = -0.4 + (((tickAnim - 26) / 4) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
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
            xx = -46.07665 + (((tickAnim - 0) / 5) * (-48.63968-(-46.07665)));
            yy = -2.97195 + (((tickAnim - 0) / 5) * (-0.25968-(-2.97195)));
            zz = 6.91971 + (((tickAnim - 0) / 5) * (8.12527-(6.91971)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -48.63968 + (((tickAnim - 5) / 5) * (-55.59323-(-48.63968)));
            yy = -0.25968 + (((tickAnim - 5) / 5) * (-17.00826-(-0.25968)));
            zz = 8.12527 + (((tickAnim - 5) / 5) * (-3.21416-(8.12527)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -55.59323 + (((tickAnim - 10) / 5) * (-62.53187-(-55.59323)));
            yy = -17.00826 + (((tickAnim - 10) / 5) * (7.30925-(-17.00826)));
            zz = -3.21416 + (((tickAnim - 10) / 5) * (-75.82071-(-3.21416)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -62.53187 + (((tickAnim - 15) / 3) * (-63.0912-(-62.53187)));
            yy = 7.30925 + (((tickAnim - 15) / 3) * (5.21267-(7.30925)));
            zz = -75.82071 + (((tickAnim - 15) / 3) * (-109.37682-(-75.82071)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -63.0912 + (((tickAnim - 18) / 5) * (-59.66035-(-63.0912)));
            yy = 5.21267 + (((tickAnim - 18) / 5) * (-7.30852-(5.21267)));
            zz = -109.37682 + (((tickAnim - 18) / 5) * (-92.0208-(-109.37682)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -59.66035 + (((tickAnim - 23) / 3) * (-56.29297-(-59.66035)));
            yy = -7.30852 + (((tickAnim - 23) / 3) * (-9.91039-(-7.30852)));
            zz = -92.0208 + (((tickAnim - 23) / 3) * (-35.37145-(-92.0208)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -56.29297 + (((tickAnim - 26) / 4) * (-46.07665-(-56.29297)));
            yy = -9.91039 + (((tickAnim - 26) / 4) * (-2.97195-(-9.91039)));
            zz = -35.37145 + (((tickAnim - 26) / 4) * (6.91971-(-35.37145)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.05 + (((tickAnim - 0) / 5) * (0.055-(-0.05)));
            yy = -0.45 + (((tickAnim - 0) / 5) * (-0.3-(-0.45)));
            zz = -0.375 + (((tickAnim - 0) / 5) * (-0.52-(-0.375)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0.055 + (((tickAnim - 5) / 10) * (0-(0.055)));
            yy = -0.3 + (((tickAnim - 5) / 10) * (0-(-0.3)));
            zz = -0.52 + (((tickAnim - 5) / 10) * (-0.8-(-0.52)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-0.01-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0.37-(0)));
            zz = -0.8 + (((tickAnim - 15) / 3) * (-0.73-(-0.8)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -0.01 + (((tickAnim - 18) / 5) * (-0.03-(-0.01)));
            yy = 0.37 + (((tickAnim - 18) / 5) * (0.505-(0.37)));
            zz = -0.73 + (((tickAnim - 18) / 5) * (-0.59-(-0.73)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -0.03 + (((tickAnim - 23) / 7) * (-0.05-(-0.03)));
            yy = 0.505 + (((tickAnim - 23) / 7) * (-0.45-(0.505)));
            zz = -0.59 + (((tickAnim - 23) / 7) * (-0.375-(-0.59)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 47.66081 + (((tickAnim - 0) / 8) * (27.41079-(47.66081)));
            yy = -24.88007 + (((tickAnim - 0) / 8) * (31.1198-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-150-(-24.88007)));
            zz = 2.22589 + (((tickAnim - 0) / 8) * (-8.441+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50-(2.22589)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 27.41079 + (((tickAnim - 8) / 7) * (22.66692-(27.41079)));
            yy = 31.1198-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-150 + (((tickAnim - 8) / 7) * (26.44238-(31.1198-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-150)));
            zz = -8.441+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50 + (((tickAnim - 8) / 7) * (14.00093-(-8.441+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 22.66692 + (((tickAnim - 15) / 15) * (47.66081-(22.66692)));
            yy = 26.44238 + (((tickAnim - 15) / 15) * (-24.88007-(26.44238)));
            zz = 14.00093 + (((tickAnim - 15) / 15) * (2.22589-(14.00093)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-35.25-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = -35.25 + (((tickAnim - 8) / 3) * (-42.72-(-35.25)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = -42.72 + (((tickAnim - 11) / 4) * (-11-(-42.72)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (19.14805-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (18.01047-(0)));
            zz = -11 + (((tickAnim - 15) / 5) * (-0.67566-(-11)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 19.14805 + (((tickAnim - 20) / 10) * (0-(19.14805)));
            yy = 18.01047 + (((tickAnim - 20) / 10) * (0-(18.01047)));
            zz = -0.67566 + (((tickAnim - 20) / 10) * (0-(-0.67566)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.35-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.35 + (((tickAnim - 8) / 7) * (0-(0.35)));
            yy = -0.25 + (((tickAnim - 8) / 7) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (-0.11-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0.125-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.11 + (((tickAnim - 20) / 10) * (0-(-0.11)));
            zz = 0.125 + (((tickAnim - 20) / 10) * (0-(0.125)));
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
            xx = -62.53187 + (((tickAnim - 0) / 3) * (-63.0912-(-62.53187)));
            yy = -7.30925 + (((tickAnim - 0) / 3) * (-5.21267-(-7.30925)));
            zz = 75.82071 + (((tickAnim - 0) / 3) * (109.37682-(75.82071)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -63.0912 + (((tickAnim - 3) / 5) * (-59.66035-(-63.0912)));
            yy = -5.21267 + (((tickAnim - 3) / 5) * (7.30852-(-5.21267)));
            zz = 109.37682 + (((tickAnim - 3) / 5) * (92.0208-(109.37682)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -59.66035 + (((tickAnim - 8) / 3) * (-56.29297-(-59.66035)));
            yy = 7.30852 + (((tickAnim - 8) / 3) * (9.91039-(7.30852)));
            zz = 92.0208 + (((tickAnim - 8) / 3) * (35.37145-(92.0208)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -56.29297 + (((tickAnim - 11) / 4) * (-45.87876-(-56.29297)));
            yy = 9.91039 + (((tickAnim - 11) / 4) * (3.75857-(9.91039)));
            zz = 35.37145 + (((tickAnim - 11) / 4) * (5.58556-(35.37145)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -45.87876 + (((tickAnim - 15) / 5) * (-48.63968-(-45.87876)));
            yy = 3.75857 + (((tickAnim - 15) / 5) * (0.25968-(3.75857)));
            zz = 5.58556 + (((tickAnim - 15) / 5) * (-8.12527-(5.58556)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -48.63968 + (((tickAnim - 20) / 5) * (-55.59323-(-48.63968)));
            yy = 0.25968 + (((tickAnim - 20) / 5) * (17.00826-(0.25968)));
            zz = -8.12527 + (((tickAnim - 20) / 5) * (3.21416-(-8.12527)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -55.59323 + (((tickAnim - 25) / 5) * (-62.53187-(-55.59323)));
            yy = 17.00826 + (((tickAnim - 25) / 5) * (-7.30925-(17.00826)));
            zz = 3.21416 + (((tickAnim - 25) / 5) * (75.82071-(3.21416)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.01-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.37-(0)));
            zz = -0.8 + (((tickAnim - 0) / 3) * (-0.73-(-0.8)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.01 + (((tickAnim - 3) / 5) * (-0.03-(-0.01)));
            yy = 0.37 + (((tickAnim - 3) / 5) * (0.505-(0.37)));
            zz = -0.73 + (((tickAnim - 3) / 5) * (-0.59-(-0.73)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.03 + (((tickAnim - 8) / 7) * (-0.05-(-0.03)));
            yy = 0.505 + (((tickAnim - 8) / 7) * (-0.45-(0.505)));
            zz = -0.59 + (((tickAnim - 8) / 7) * (-0.375-(-0.59)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.05 + (((tickAnim - 15) / 5) * (-0.03-(-0.05)));
            yy = -0.45 + (((tickAnim - 15) / 5) * (-0.3-(-0.45)));
            zz = -0.375 + (((tickAnim - 15) / 5) * (-0.52-(-0.375)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.03 + (((tickAnim - 20) / 10) * (0-(-0.03)));
            yy = -0.3 + (((tickAnim - 20) / 10) * (0-(-0.3)));
            zz = -0.52 + (((tickAnim - 20) / 10) * (-0.8-(-0.52)));
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
            xx = 47.47469 + (((tickAnim - 0) / 8) * (5.78404-(47.47469)));
            yy = 25.12424 + (((tickAnim - 0) / 8) * (-18.50602-(25.12424)));
            zz = 6.97352 + (((tickAnim - 0) / 8) * (29.54389-(6.97352)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 5.78404 + (((tickAnim - 8) / 7) * (1.85969-(5.78404)));
            yy = -18.50602 + (((tickAnim - 8) / 7) * (-32.61587-(-18.50602)));
            zz = 29.54389 + (((tickAnim - 8) / 7) * (-8.45559-(29.54389)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 1.85969 + (((tickAnim - 15) / 15) * (47.47469-(1.85969)));
            yy = -32.61587 + (((tickAnim - 15) / 15) * (25.12424-(-32.61587)));
            zz = -8.45559 + (((tickAnim - 15) / 15) * (6.97352-(-8.45559)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-12.16459-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-14.99887-(0)));
            zz = 41.25 + (((tickAnim - 0) / 8) * (37.79652-(41.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12.16459 + (((tickAnim - 8) / 2) * (-31.78383-(-12.16459)));
            yy = -14.99887 + (((tickAnim - 8) / 2) * (-30.03588-(-14.99887)));
            zz = 37.79652 + (((tickAnim - 8) / 2) * (52.56253-(37.79652)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -31.78383 + (((tickAnim - 10) / 5) * (-7.27889-(-31.78383)));
            yy = -30.03588 + (((tickAnim - 10) / 5) * (14.74906-(-30.03588)));
            zz = 52.56253 + (((tickAnim - 10) / 5) * (34.41972-(52.56253)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -7.27889 + (((tickAnim - 15) / 15) * (0-(-7.27889)));
            yy = 14.74906 + (((tickAnim - 15) / 15) * (0-(14.74906)));
            zz = 34.41972 + (((tickAnim - 15) / 15) * (41.25-(34.41972)));
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
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 59.75 + (((tickAnim - 0) / 8) * (96.75-(59.75)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (-12.28945-(0)));
            yy = 96.75 + (((tickAnim - 8) / 7) * (8.05943-(96.75)));
            zz = 0 + (((tickAnim - 8) / 7) * (-26.88433-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -12.28945 + (((tickAnim - 15) / 7) * (-13.24611-(-12.28945)));
            yy = 8.05943 + (((tickAnim - 15) / 7) * (-17.49684-(8.05943)));
            zz = -26.88433 + (((tickAnim - 15) / 7) * (-31.41617-(-26.88433)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -13.24611 + (((tickAnim - 22) / 8) * (0-(-13.24611)));
            yy = -17.49684 + (((tickAnim - 22) / 8) * (59.75-(-17.49684)));
            zz = -31.41617 + (((tickAnim - 22) / 8) * (0-(-31.41617)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0.375 + (((tickAnim - 0) / 8) * (0.19-(0.375)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = -0.275 + (((tickAnim - 0) / 8) * (-1.09-(-0.275)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.19 + (((tickAnim - 8) / 7) * (0-(0.19)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -1.09 + (((tickAnim - 8) / 7) * (0-(-1.09)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (-0.08-(0)));
            yy = 0 + (((tickAnim - 15) / 7) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (-0.12-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -0.08 + (((tickAnim - 22) / 8) * (0.375-(-0.08)));
            yy = -0.4 + (((tickAnim - 22) / 8) * (0-(-0.4)));
            zz = -0.12 + (((tickAnim - 22) / 8) * (-0.275-(-0.12)));
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

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraGordodon ee = (EntityPrehistoricFloraGordodon) entitylivingbaseIn;

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
        EntityPrehistoricFloraGordodon e = (EntityPrehistoricFloraGordodon) entity;

    }
}
