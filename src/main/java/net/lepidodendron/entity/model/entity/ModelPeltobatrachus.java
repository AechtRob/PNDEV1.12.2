package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPeltobatrachus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPeltobatrachus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r22;

    private ModelAnimator animator;

    public ModelPeltobatrachus() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 16.5F, 1.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.9625F, -0.5F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -1.0375F, -8.5F, 8, 5, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 15, -3.5F, -1.9625F, -8.5F, 7, 1, 9, -0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.4625F, -8.0F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 29, 24, -3.5F, 0.125F, -5.0F, 7, 4, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -1.3F, 0.0F);
        this.chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 9, -2.5F, 0.0F, -5.2F, 6, 2, 5, 0.01F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(3.25F, 2.5F, -1.5F);
        this.chest.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.1766F, 0.4011F, -1.1421F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 13, 59, -1.0F, -0.5F, -1.0F, 2, 3, 2, 0.0F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.0F, 2.25F, 0.25F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.8119F, -0.1394F, 1.0003F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 0, 15, -1.0F, -0.2956F, -1.0616F, 2, 4, 2, 0.0F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 3.5044F, 0.7384F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.3925F, 0.0044F, 0.2052F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 52, 36, -1.4956F, -0.5869F, -3.9962F, 3, 1, 4, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-3.25F, 2.5F, -1.5F);
        this.chest.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.1766F, -0.4011F, 1.1421F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 13, 59, -1.0F, -0.5F, -1.0F, 2, 3, 2, 0.0F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(0.0F, 2.25F, 0.25F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.8119F, 0.1394F, -1.0003F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 0, 15, -1.0F, -0.2956F, -1.0616F, 2, 4, 2, 0.0F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 3.5044F, 0.7384F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.3925F, -0.0044F, -0.2052F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 52, 36, -1.5044F, -0.5869F, -3.9962F, 3, 1, 4, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2529F, -4.8726F);
        this.chest.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 37, -1.0F, 1.3677F, -7.9029F, 2, 1, 8, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.8617F, -1.5756F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 0, -2.5F, -1.0F, -1.4F, 5, 2, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, 0.3344F, -4.0357F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.096F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 15, -0.425F, -0.375F, -0.95F, 1, 1, 2, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 15, 2.425F, -0.375F, -0.95F, 1, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.9465F, 1.8677F, -3.0159F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1309F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 54, 50, 0.1647F, -0.5F, 0.2687F, 3, 1, 4, 0.001F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.6004F, 1.8677F, -6.7977F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.7854F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 9, 0.4887F, -0.5F, -2.0351F, 2, 1, 2, -0.001F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 26, 0.6887F, 0.0F, -2.1351F, 0, 1, 2, -0.001F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.7F, 1.8677F, -2.9029F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.3927F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 49, 22, -0.0044F, -0.5F, -3.8899F, 3, 1, 4, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 9, 0.0956F, 0.0F, -3.8899F, 0, 1, 4, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.3177F, -5.0529F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.096F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 56, -1.5F, 0.6142F, 0.011F, 4, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 1.3677F, -7.9029F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 43, 47, -0.5F, -0.525F, 0.0F, 2, 1, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(3.9465F, 1.8677F, -3.0159F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.1309F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 54, 50, -3.1647F, -0.5F, 0.2687F, 3, 1, 4, 0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.6004F, 1.8677F, -6.7977F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.7854F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 26, -0.6887F, 0.0F, -2.1351F, 0, 1, 2, -0.001F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 9, -2.4887F, -0.5F, -2.0351F, 2, 1, 2, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(3.7F, 1.8677F, -2.9029F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.3927F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 9, -0.0956F, 0.0F, -3.8899F, 0, 1, 4, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 49, 22, -2.9956F, -0.5F, -3.8899F, 3, 1, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 2.3677F, 0.0971F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 54, 56, -2.5F, -2.0F, -2.0F, 4, 3, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 47, -1.5F, 0.0058F, -7.9856F, 2, 1, 6, 0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 2.0058F, 0.0144F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1309F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 44, 17, -3.0F, -1.175F, -3.375F, 6, 1, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 44, -2.0F, -1.175F, -6.375F, 4, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-4.4466F, -0.075F, -3.113F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.1309F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 54, 0.1647F, 0.075F, 0.2687F, 3, 1, 4, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-3.1004F, -0.075F, -6.8948F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.781F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 37, 0.4887F, 0.075F, -2.0351F, 2, 1, 2, -0.01F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 0, 0.8387F, -0.425F, -2.2351F, 0, 1, 2, -0.01F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-4.2F, -0.075F, -3.0F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.3927F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 30, -0.0044F, 0.05F, -3.8899F, 3, 1, 4, -0.001F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 13, 37, 0.2456F, -0.45F, -3.8899F, 0, 1, 4, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(3.4465F, -0.075F, -3.113F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.1309F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 39, 54, -3.1647F, 0.075F, 0.2687F, 3, 1, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.1004F, -0.075F, -6.8948F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.781F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 0, -0.8387F, -0.425F, -2.2351F, 0, 1, 2, -0.01F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 37, -2.4887F, 0.075F, -2.0351F, 2, 1, 2, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(3.2F, -0.075F, -3.0F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.3927F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 13, 37, -0.2456F, -0.45F, -3.8899F, 0, 1, 4, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 50, 30, -2.9956F, 0.05F, -3.8899F, 3, 1, 4, -0.001F, false));

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, -0.4625F, -0.8F);
        this.body.addChild(hip);
        this.setRotateAngle(hip, -0.1745F, 0.0F, 0.0F);
        this.hip.cubeList.add(new ModelBox(hip, 0, 26, -3.5F, -0.075F, 0.0F, 7, 3, 7, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -0.3F, 3.5F);
        this.hip.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 0, -2.5F, -0.975F, -2.55F, 6, 2, 6, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 3.425F, 1.5F);
        this.hip.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2182F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 15, -3.0F, -0.5F, -1.5F, 6, 1, 7, 0.0F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(3.25F, 2.425F, 4.55F);
        this.hip.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.3927F, 0.0F, -1.4835F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 28, 55, -1.0F, -0.5F, -1.0F, 2, 3, 2, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.0F, 2.25F, 0.25F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.5236F, 0.0F, 1.309F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 0, 15, -1.0F, -0.2956F, -1.0616F, 2, 4, 2, 0.0F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 3.5044F, -0.2616F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.3032F, -0.2536F, 0.3121F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 52, 36, -1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-3.25F, 2.425F, 4.55F);
        this.hip.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.3927F, 0.0F, 1.4835F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 28, 55, -1.0F, -0.5F, -1.0F, 2, 3, 2, 0.0F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(0.0F, 2.25F, 0.25F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.5236F, 0.0F, -1.309F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 0, 15, -1.0F, -0.2956F, -1.0616F, 2, 4, 2, 0.0F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 3.5044F, -0.2616F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.3032F, 0.2536F, -0.3121F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 52, 36, -1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.35F, 6.5F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 22, 34, -2.0F, 0.0F, 0.0F, 4, 2, 7, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.2F, 3.5F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1309F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 38, 37, -1.5F, -0.8F, -3.5F, 3, 2, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 6.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 14, 44, -1.0F, 0.0F, 0.0F, 2, 1, 7, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.8F, 0.25F);
        this.tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0785F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 26, 46, -0.5F, -0.05F, -0.25F, 1, 1, 7, 0.0F, false));
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

        EntityPrehistoricFloraPeltobatrachus EntityMegalosaurus = (EntityPrehistoricFloraPeltobatrachus) e;

        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2};
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
        EntityPrehistoricFloraPeltobatrachus entity = (EntityPrehistoricFloraPeltobatrachus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13.5 + (((tickAnim - 10) / 10) * (0-(13.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-24.93243-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-9.24109-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-13.77563-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -24.93243 + (((tickAnim - 10) / 10) * (0-(-24.93243)));
            yy = -9.24109 + (((tickAnim - 10) / 10) * (0-(-9.24109)));
            zz = -13.77563 + (((tickAnim - 10) / 10) * (0-(-13.77563)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.41217-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-18.21086-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.85838-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.41217 + (((tickAnim - 10) / 10) * (0-(3.41217)));
            yy = -18.21086 + (((tickAnim - 10) / 10) * (0-(-18.21086)));
            zz = -2.85838 + (((tickAnim - 10) / 10) * (0-(-2.85838)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-24.93243-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (9.24109-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (13.77563-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -24.93243 + (((tickAnim - 10) / 10) * (0-(-24.93243)));
            yy = 9.24109 + (((tickAnim - 10) / 10) * (0-(9.24109)));
            zz = 13.77563 + (((tickAnim - 10) / 10) * (0-(13.77563)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.41217-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (18.21086-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.85838-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.41217 + (((tickAnim - 10) / 10) * (0-(3.41217)));
            yy = 18.21086 + (((tickAnim - 10) / 10) * (0-(18.21086)));
            zz = 2.85838 + (((tickAnim - 10) / 10) * (0-(2.85838)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.875-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-4.375-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 8.875 + (((tickAnim - 5) / 5) * (-3.5-(8.875)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -4.375 + (((tickAnim - 5) / 5) * (-8.75-(-4.375)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3.5 + (((tickAnim - 10) / 10) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -8.75 + (((tickAnim - 10) / 10) * (0-(-8.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 14 + (((tickAnim - 5) / 5) * (0-(14)));
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
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPeltobatrachus entity = (EntityPrehistoricFloraPeltobatrachus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5.4432+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+20))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (34.4661+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (4.70151-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5.4432+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+20))*-20 + (((tickAnim - 5) / 5) * (-35.087+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*40-(-5.4432+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+20))*-20)));
            yy = 34.4661+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 5) / 5) * (49.5764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(34.4661+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            zz = 4.70151 + (((tickAnim - 5) / 5) * (15.45451-(4.70151)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -35.087+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*40 + (((tickAnim - 10) / 5) * (0-(-35.087+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*40)));
            yy = 49.5764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 10) / 5) * (0-(49.5764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            zz = 15.45451 + (((tickAnim - 10) / 5) * (0-(15.45451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.775-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0.775 + (((tickAnim - 7) / 8) * (0-(0.775)));
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


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPeltobatrachus entity = (EntityPrehistoricFloraPeltobatrachus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-2.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-80))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -2.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-80))*-20 + (((tickAnim - 18) / 12) * (0-(-2.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-80))*-20)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (37.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 37.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-50 + (((tickAnim - 18) / 3) * (0-(37.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-50)));
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
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPeltobatrachus entity = (EntityPrehistoricFloraPeltobatrachus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+5))*-1 + (((tickAnim - 0) / 4) * (0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*0.5-(-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+5))*-1)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*0.5 + (((tickAnim - 4) / 1) * (0.25-(0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*0.5)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0.25 + (((tickAnim - 5) / 6) * (7.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70+53))*-8-(0.25)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 7.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70+53))*-8 + (((tickAnim - 11) / 5) * (0.25-(7.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70+53))*-8)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 16) / 1) * (0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1-(0.25)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1 + (((tickAnim - 17) / 3) * (-1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-10))*1-(0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-3));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*0.2);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*-2), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*3), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-3));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -48.24079 + (((tickAnim - 0) / 11) * (53.08046-(-48.24079)));
            yy = -2.88484 + (((tickAnim - 0) / 11) * (19.26122-(-2.88484)));
            zz = -4.05769 + (((tickAnim - 0) / 11) * (31.15497-(-4.05769)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 53.08046 + (((tickAnim - 11) / 4) * (1.06781-(53.08046)));
            yy = 19.26122 + (((tickAnim - 11) / 4) * (119.0205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(19.26122)));
            zz = 31.15497 + (((tickAnim - 11) / 4) * (-42.03262-(31.15497)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1.06781 + (((tickAnim - 15) / 5) * (-48.24079-(1.06781)));
            yy = 119.0205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 15) / 5) * (-2.88484-(119.0205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            zz = -42.03262 + (((tickAnim - 15) / 5) * (-4.05769-(-42.03262)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 13.20313 + (((tickAnim - 0) / 11) * (30-(13.20313)));
            yy = -36.55612 + (((tickAnim - 0) / 11) * (0-(-36.55612)));
            zz = 6.5817 + (((tickAnim - 0) / 11) * (0-(6.5817)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 30 + (((tickAnim - 11) / 4) * (-11.55144-(30)));
            yy = 0 + (((tickAnim - 11) / 4) * (4.71337-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (36.17053-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -11.55144 + (((tickAnim - 15) / 5) * (13.20313-(-11.55144)));
            yy = 4.71337 + (((tickAnim - 15) / 5) * (-36.55612-(4.71337)));
            zz = 36.17053 + (((tickAnim - 15) / 5) * (6.5817-(36.17053)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.425-(0)));
            zz = -0.175 + (((tickAnim - 0) / 11) * (-0.3-(-0.175)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0.425 + (((tickAnim - 11) / 9) * (0-(0.425)));
            zz = -0.3 + (((tickAnim - 11) / 9) * (-0.175-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 7.48534 + (((tickAnim - 0) / 5) * (-25.97577-(7.48534)));
            yy = 0.99357 + (((tickAnim - 0) / 5) * (5.45789-(0.99357)));
            zz = -11.87386 + (((tickAnim - 0) / 5) * (-5.85375-(-11.87386)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -25.97577 + (((tickAnim - 5) / 3) * (-84.3683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(-25.97577)));
            yy = 5.45789 + (((tickAnim - 5) / 3) * (7.72117-(5.45789)));
            zz = -5.85375 + (((tickAnim - 5) / 3) * (-5.30511-(-5.85375)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -84.3683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 8) / 3) * (60.57117-(-84.3683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = 7.72117 + (((tickAnim - 8) / 3) * (9.60723-(7.72117)));
            zz = -5.30511 + (((tickAnim - 8) / 3) * (-4.8479-(-5.30511)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 60.57117 + (((tickAnim - 11) / 4) * (83.02826-(60.57117)));
            yy = 9.60723 + (((tickAnim - 11) / 4) * (5.3004-(9.60723)));
            zz = -4.8479 + (((tickAnim - 11) / 4) * (-8.36088-(-4.8479)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 83.02826 + (((tickAnim - 15) / 5) * (7.48534-(83.02826)));
            yy = 5.3004 + (((tickAnim - 15) / 5) * (0.99357-(5.3004)));
            zz = -8.36088 + (((tickAnim - 15) / 5) * (-11.87386-(-8.36088)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.45 + (((tickAnim - 0) / 3) * (1.15-(0.45)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 1.15 + (((tickAnim - 3) / 4) * (0.675-(1.15)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0.15-(0)));
            yy = 0.675 + (((tickAnim - 7) / 1) * (0.825-(0.675)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.26-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0.15 + (((tickAnim - 8) / 3) * (0.3-(0.15)));
            yy = 0.825 + (((tickAnim - 8) / 3) * (1.975-(0.825)));
            zz = -0.26 + (((tickAnim - 8) / 3) * (-0.525-(-0.26)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0.3 + (((tickAnim - 11) / 2) * (0.21-(0.3)));
            yy = 1.975 + (((tickAnim - 11) / 2) * (3.01-(1.975)));
            zz = -0.525 + (((tickAnim - 11) / 2) * (-0.89-(-0.525)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.21 + (((tickAnim - 13) / 2) * (0.15-(0.21)));
            yy = 3.01 + (((tickAnim - 13) / 2) * (2.365-(3.01)));
            zz = -0.89 + (((tickAnim - 13) / 2) * (-1.135-(-0.89)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.15 + (((tickAnim - 15) / 5) * (0-(0.15)));
            yy = 2.365 + (((tickAnim - 15) / 5) * (0.45-(2.365)));
            zz = -1.135 + (((tickAnim - 15) / 5) * (0-(-1.135)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 53.08046 + (((tickAnim - 0) / 5) * (-0.12839-(53.08046)));
            yy = -19.26122 + (((tickAnim - 0) / 5) * (117.0127+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*200-(-19.26122)));
            zz = -31.15497 + (((tickAnim - 0) / 5) * (46.52171-(-31.15497)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -0.12839 + (((tickAnim - 5) / 4) * (-48.24079-(-0.12839)));
            yy = 117.0127+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*200 + (((tickAnim - 5) / 4) * (-2.88484-(117.0127+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*200)));
            zz = 46.52171 + (((tickAnim - 5) / 4) * (-4.05769-(46.52171)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -48.24079 + (((tickAnim - 9) / 11) * (53.08046-(-48.24079)));
            yy = -2.88484 + (((tickAnim - 9) / 11) * (-19.26122-(-2.88484)));
            zz = -4.05769 + (((tickAnim - 9) / 11) * (-31.15497-(-4.05769)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 30 + (((tickAnim - 0) / 5) * (-11.55144-(30)));
            yy = 0 + (((tickAnim - 0) / 5) * (-4.71337-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-36.17053-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -11.55144 + (((tickAnim - 5) / 4) * (13.20313-(-11.55144)));
            yy = -4.71337 + (((tickAnim - 5) / 4) * (36.55612-(-4.71337)));
            zz = -36.17053 + (((tickAnim - 5) / 4) * (6.5817-(-36.17053)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 13.20313 + (((tickAnim - 9) / 11) * (30-(13.20313)));
            yy = 36.55612 + (((tickAnim - 9) / 11) * (0-(36.55612)));
            zz = 6.5817 + (((tickAnim - 9) / 11) * (0-(6.5817)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0.425 + (((tickAnim - 0) / 9) * (0-(0.425)));
            zz = -0.3 + (((tickAnim - 0) / 9) * (-0.175-(-0.3)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0.425-(0)));
            zz = -0.175 + (((tickAnim - 9) / 11) * (-0.3-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 60.57117 + (((tickAnim - 0) / 5) * (83.02826-(60.57117)));
            yy = -9.60723 + (((tickAnim - 0) / 5) * (-5.3004-(-9.60723)));
            zz = 4.8479 + (((tickAnim - 0) / 5) * (8.36088-(4.8479)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 83.02826 + (((tickAnim - 5) / 4) * (7.48534-(83.02826)));
            yy = -5.3004 + (((tickAnim - 5) / 4) * (-0.99357-(-5.3004)));
            zz = 8.36088 + (((tickAnim - 5) / 4) * (11.87386-(8.36088)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 7.48534 + (((tickAnim - 9) / 5) * (-25.97577-(7.48534)));
            yy = -0.99357 + (((tickAnim - 9) / 5) * (-5.45789-(-0.99357)));
            zz = 11.87386 + (((tickAnim - 9) / 5) * (5.85375-(11.87386)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -25.97577 + (((tickAnim - 14) / 4) * (19.3817+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250-(-25.97577)));
            yy = -5.45789 + (((tickAnim - 14) / 4) * (-7.72117-(-5.45789)));
            zz = 5.85375 + (((tickAnim - 14) / 4) * (5.30511-(5.85375)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 19.3817+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250 + (((tickAnim - 18) / 2) * (60.57117-(19.3817+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250)));
            yy = -7.72117 + (((tickAnim - 18) / 2) * (-9.60723-(-7.72117)));
            zz = 5.30511 + (((tickAnim - 18) / 2) * (4.8479-(5.30511)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.3 + (((tickAnim - 0) / 3) * (-0.21-(-0.3)));
            yy = 1.975 + (((tickAnim - 0) / 3) * (3.01-(1.975)));
            zz = -0.525 + (((tickAnim - 0) / 3) * (-0.89-(-0.525)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.21 + (((tickAnim - 3) / 2) * (-0.15-(-0.21)));
            yy = 3.01 + (((tickAnim - 3) / 2) * (2.365-(3.01)));
            zz = -0.89 + (((tickAnim - 3) / 2) * (-1.135-(-0.89)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -0.15 + (((tickAnim - 5) / 4) * (0-(-0.15)));
            yy = 2.365 + (((tickAnim - 5) / 4) * (0.1-(2.365)));
            zz = -1.135 + (((tickAnim - 5) / 4) * (0-(-1.135)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.1 + (((tickAnim - 9) / 4) * (1.2-(0.1)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 1.2 + (((tickAnim - 13) / 0) * (0.755-(1.2)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.755 + (((tickAnim - 13) / 1) * (0.625-(0.755)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0.625 + (((tickAnim - 14) / 3) * (0.825-(0.625)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (-0.3-(0)));
            yy = 0.825 + (((tickAnim - 17) / 3) * (1.975-(0.825)));
            zz = 0 + (((tickAnim - 17) / 3) * (-0.525-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*-3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-3));


        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-2), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*4), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-4));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 55.55775 + (((tickAnim - 0) / 5) * (10.70257-(55.55775)));
            yy = 9.36279 + (((tickAnim - 0) / 5) * (-21.85616-(9.36279)));
            zz = 4.87742 + (((tickAnim - 0) / 5) * (-6.58892-(4.87742)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 10.70257 + (((tickAnim - 5) / 5) * (-27.25-(10.70257)));
            yy = -21.85616 + (((tickAnim - 5) / 5) * (0-(-21.85616)));
            zz = -6.58892 + (((tickAnim - 5) / 5) * (0-(-6.58892)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -27.25 + (((tickAnim - 10) / 10) * (55.55775-(-27.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (9.36279-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (4.87742-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 23.39682 + (((tickAnim - 0) / 5) * (-23.41818-(23.39682)));
            yy = 42.60769 + (((tickAnim - 0) / 5) * (-5.6392-(42.60769)));
            zz = 5.98817 + (((tickAnim - 0) / 5) * (2.85151-(5.98817)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -23.41818 + (((tickAnim - 5) / 5) * (-28.75-(-23.41818)));
            yy = -5.6392 + (((tickAnim - 5) / 5) * (-49.5-(-5.6392)));
            zz = 2.85151 + (((tickAnim - 5) / 5) * (0-(2.85151)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -28.75 + (((tickAnim - 10) / 10) * (23.39682-(-28.75)));
            yy = -49.5 + (((tickAnim - 10) / 10) * (42.60769-(-49.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (5.98817-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.55-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.55 + (((tickAnim - 5) / 5) * (0-(0.55)));
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
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 85.25583 + (((tickAnim - 0) / 2) * (109.54728-(85.25583)));
            yy = 12.48181 + (((tickAnim - 0) / 2) * (12.6408-(12.48181)));
            zz = -5.20869 + (((tickAnim - 0) / 2) * (-7.23322-(-5.20869)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 109.54728 + (((tickAnim - 2) / 3) * (59.93233-(109.54728)));
            yy = 12.6408 + (((tickAnim - 2) / 3) * (12.91903-(12.6408)));
            zz = -7.23322 + (((tickAnim - 2) / 3) * (-10.77615-(-7.23322)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 59.93233 + (((tickAnim - 5) / 5) * (36.91096-(59.93233)));
            yy = 12.91903 + (((tickAnim - 5) / 5) * (13.3165-(12.91903)));
            zz = -10.77615 + (((tickAnim - 5) / 5) * (-15.83748-(-10.77615)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 36.91096 + (((tickAnim - 10) / 4) * (3.88019-(36.91096)));
            yy = 13.3165 + (((tickAnim - 10) / 4) * (12.95878-(13.3165)));
            zz = -15.83748 + (((tickAnim - 10) / 4) * (-11.28228-(-15.83748)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 3.88019 + (((tickAnim - 14) / 6) * (85.25583-(3.88019)));
            yy = 12.95878 + (((tickAnim - 14) / 6) * (12.48181-(12.95878)));
            zz = -11.28228 + (((tickAnim - 14) / 6) * (-5.20869-(-11.28228)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.125 + (((tickAnim - 0) / 2) * (1.86-(1.125)));
            zz = 0.325 + (((tickAnim - 0) / 2) * (0.23-(0.325)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 1.86 + (((tickAnim - 2) / 3) * (0.935-(1.86)));
            zz = 0.23 + (((tickAnim - 2) / 3) * (0.075-(0.23)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.935 + (((tickAnim - 5) / 5) * (-0.425-(0.935)));
            zz = 0.075 + (((tickAnim - 5) / 5) * (0-(0.075)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -0.425 + (((tickAnim - 10) / 4) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (1.23-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0.555-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1.23 + (((tickAnim - 18) / 2) * (1.125-(1.23)));
            zz = 0.555 + (((tickAnim - 18) / 2) * (0.325-(0.555)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -27.25 + (((tickAnim - 0) / 10) * (55.55775-(-27.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (-9.36279-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-4.87742-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 55.55775 + (((tickAnim - 10) / 5) * (10.70257-(55.55775)));
            yy = -9.36279 + (((tickAnim - 10) / 5) * (21.85616-(-9.36279)));
            zz = -4.87742 + (((tickAnim - 10) / 5) * (6.58892-(-4.87742)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 10.70257 + (((tickAnim - 15) / 5) * (-27.25-(10.70257)));
            yy = 21.85616 + (((tickAnim - 15) / 5) * (0-(21.85616)));
            zz = 6.58892 + (((tickAnim - 15) / 5) * (0-(6.58892)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -28.75 + (((tickAnim - 0) / 10) * (23.39682-(-28.75)));
            yy = 49.5 + (((tickAnim - 0) / 10) * (-42.60769-(49.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (-5.98817-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 23.39682 + (((tickAnim - 10) / 5) * (-23.41818-(23.39682)));
            yy = -42.60769 + (((tickAnim - 10) / 5) * (5.6392-(-42.60769)));
            zz = -5.98817 + (((tickAnim - 10) / 5) * (-2.85151-(-5.98817)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -23.41818 + (((tickAnim - 15) / 5) * (-28.75-(-23.41818)));
            yy = 5.6392 + (((tickAnim - 15) / 5) * (49.5-(5.6392)));
            zz = -2.85151 + (((tickAnim - 15) / 5) * (0-(-2.85151)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.55-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.55 + (((tickAnim - 15) / 5) * (0-(-0.55)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 36.91096 + (((tickAnim - 0) / 5) * (-1.31767-(36.91096)));
            yy = -13.3165 + (((tickAnim - 0) / 5) * (-12.91903-(-13.3165)));
            zz = 15.83748 + (((tickAnim - 0) / 5) * (10.77615-(15.83748)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -1.31767 + (((tickAnim - 5) / 5) * (85.25583-(-1.31767)));
            yy = -12.91903 + (((tickAnim - 5) / 5) * (-12.48181-(-12.91903)));
            zz = 10.77615 + (((tickAnim - 5) / 5) * (5.20869-(10.77615)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 85.25583 + (((tickAnim - 10) / 2) * (109.54728-(85.25583)));
            yy = -12.48181 + (((tickAnim - 10) / 2) * (-12.6408-(-12.48181)));
            zz = 5.20869 + (((tickAnim - 10) / 2) * (7.23322-(5.20869)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 109.54728 + (((tickAnim - 12) / 3) * (59.93233-(109.54728)));
            yy = -12.6408 + (((tickAnim - 12) / 3) * (-12.91903-(-12.6408)));
            zz = 7.23322 + (((tickAnim - 12) / 3) * (10.77615-(7.23322)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 59.93233 + (((tickAnim - 15) / 5) * (36.91096-(59.93233)));
            yy = -12.91903 + (((tickAnim - 15) / 5) * (-13.3165-(-12.91903)));
            zz = 10.77615 + (((tickAnim - 15) / 5) * (15.83748-(10.77615)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 5) * (0.085-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.15-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.085 + (((tickAnim - 5) / 5) * (1.125-(0.085)));
            zz = 0.15 + (((tickAnim - 5) / 5) * (0.325-(0.15)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 1.125 + (((tickAnim - 10) / 2) * (1.86-(1.125)));
            zz = 0.325 + (((tickAnim - 10) / 2) * (0.23-(0.325)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 1.86 + (((tickAnim - 12) / 3) * (0.935-(1.86)));
            zz = 0.23 + (((tickAnim - 12) / 3) * (0.075-(0.23)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.935 + (((tickAnim - 15) / 5) * (-0.425-(0.935)));
            zz = 0.075 + (((tickAnim - 15) / 5) * (0-(0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*9), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3));



    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPeltobatrachus entity = (EntityPrehistoricFloraPeltobatrachus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1 + (((tickAnim - 0) / 8) * (0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*0.5 + (((tickAnim - 8) / 2) * (0.275-(0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*0.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            yy = 0.275 + (((tickAnim - 10) / 12) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70+10))*-1-(0.275)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 22) / 9) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70+10))*-1 + (((tickAnim - 22) / 9) * (0.275-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70+10))*-1)));
            zz = 0 + (((tickAnim - 22) / 9) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 0.275 + (((tickAnim - 31) / 2) * (1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1-(0.275)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1 + (((tickAnim - 33) / 7) * (1.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-2-(1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-1), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-2));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.2);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-1), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*-2));



        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -48.24079 + (((tickAnim - 0) / 21) * (53.08046-(-48.24079)));
            yy = -2.88484 + (((tickAnim - 0) / 21) * (19.26122-(-2.88484)));
            zz = -4.05769 + (((tickAnim - 0) / 21) * (31.15497-(-4.05769)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 53.08046 + (((tickAnim - 21) / 9) * (1.06781-(53.08046)));
            yy = 19.26122 + (((tickAnim - 21) / 9) * (119.0205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(19.26122)));
            zz = 31.15497 + (((tickAnim - 21) / 9) * (-42.03262-(31.15497)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1.06781 + (((tickAnim - 30) / 10) * (-48.24079-(1.06781)));
            yy = 119.0205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 30) / 10) * (-2.88484-(119.0205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            zz = -42.03262 + (((tickAnim - 30) / 10) * (-4.05769-(-42.03262)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 13.20313 + (((tickAnim - 0) / 21) * (30-(13.20313)));
            yy = -36.55612 + (((tickAnim - 0) / 21) * (0-(-36.55612)));
            zz = 6.5817 + (((tickAnim - 0) / 21) * (0-(6.5817)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 30 + (((tickAnim - 21) / 9) * (-11.55144-(30)));
            yy = 0 + (((tickAnim - 21) / 9) * (4.71337-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (36.17053-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -11.55144 + (((tickAnim - 30) / 10) * (13.20313-(-11.55144)));
            yy = 4.71337 + (((tickAnim - 30) / 10) * (-36.55612-(4.71337)));
            zz = 36.17053 + (((tickAnim - 30) / 10) * (6.5817-(36.17053)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0.425-(0)));
            zz = -0.175 + (((tickAnim - 0) / 21) * (-0.3-(-0.175)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = 0.425 + (((tickAnim - 21) / 19) * (0-(0.425)));
            zz = -0.3 + (((tickAnim - 21) / 19) * (-0.175-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 7.48534 + (((tickAnim - 0) / 9) * (-25.97577-(7.48534)));
            yy = 0.99357 + (((tickAnim - 0) / 9) * (5.45789-(0.99357)));
            zz = -11.87386 + (((tickAnim - 0) / 9) * (-5.85375-(-11.87386)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -25.97577 + (((tickAnim - 9) / 7) * (-160.0183+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(-25.97577)));
            yy = 5.45789 + (((tickAnim - 9) / 7) * (7.72117-(5.45789)));
            zz = -5.85375 + (((tickAnim - 9) / 7) * (-5.30511-(-5.85375)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -160.0183+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 16) / 5) * (60.57117-(-160.0183+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = 7.72117 + (((tickAnim - 16) / 5) * (9.60723-(7.72117)));
            zz = -5.30511 + (((tickAnim - 16) / 5) * (-4.8479-(-5.30511)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 60.57117 + (((tickAnim - 21) / 9) * (83.02826-(60.57117)));
            yy = 9.60723 + (((tickAnim - 21) / 9) * (5.3004-(9.60723)));
            zz = -4.8479 + (((tickAnim - 21) / 9) * (-8.36088-(-4.8479)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 83.02826 + (((tickAnim - 30) / 10) * (7.48534-(83.02826)));
            yy = 5.3004 + (((tickAnim - 30) / 10) * (0.99357-(5.3004)));
            zz = -8.36088 + (((tickAnim - 30) / 10) * (-11.87386-(-8.36088)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.45 + (((tickAnim - 0) / 5) * (1.15-(0.45)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 1.15 + (((tickAnim - 5) / 8) * (0.15-(1.15)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0.15-(0)));
            yy = 0.15 + (((tickAnim - 13) / 4) * (2.075-(0.15)));
            zz = 0 + (((tickAnim - 13) / 4) * (-0.26-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0.15 + (((tickAnim - 17) / 4) * (0.3-(0.15)));
            yy = 2.075 + (((tickAnim - 17) / 4) * (1.975-(2.075)));
            zz = -0.26 + (((tickAnim - 17) / 4) * (-0.525-(-0.26)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0.3 + (((tickAnim - 21) / 6) * (0.21-(0.3)));
            yy = 1.975 + (((tickAnim - 21) / 6) * (3.01-(1.975)));
            zz = -0.525 + (((tickAnim - 21) / 6) * (-0.89-(-0.525)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0.21 + (((tickAnim - 27) / 3) * (0.15-(0.21)));
            yy = 3.01 + (((tickAnim - 27) / 3) * (2.365-(3.01)));
            zz = -0.89 + (((tickAnim - 27) / 3) * (-1.135-(-0.89)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.15 + (((tickAnim - 30) / 10) * (0-(0.15)));
            yy = 2.365 + (((tickAnim - 30) / 10) * (0.45-(2.365)));
            zz = -1.135 + (((tickAnim - 30) / 10) * (0-(-1.135)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 53.08046 + (((tickAnim - 0) / 9) * (-0.12839-(53.08046)));
            yy = -19.26122 + (((tickAnim - 0) / 9) * (117.0127+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*200-(-19.26122)));
            zz = -31.15497 + (((tickAnim - 0) / 9) * (46.52171-(-31.15497)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -0.12839 + (((tickAnim - 9) / 9) * (-48.24079-(-0.12839)));
            yy = 117.0127+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*200 + (((tickAnim - 9) / 9) * (-2.88484-(117.0127+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*200)));
            zz = 46.52171 + (((tickAnim - 9) / 9) * (-4.05769-(46.52171)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -48.24079 + (((tickAnim - 18) / 22) * (53.08046-(-48.24079)));
            yy = -2.88484 + (((tickAnim - 18) / 22) * (-19.26122-(-2.88484)));
            zz = -4.05769 + (((tickAnim - 18) / 22) * (-31.15497-(-4.05769)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 30 + (((tickAnim - 0) / 9) * (-11.55144-(30)));
            yy = 0 + (((tickAnim - 0) / 9) * (-4.71337-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-36.17053-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -11.55144 + (((tickAnim - 9) / 9) * (13.20313-(-11.55144)));
            yy = -4.71337 + (((tickAnim - 9) / 9) * (36.55612-(-4.71337)));
            zz = -36.17053 + (((tickAnim - 9) / 9) * (6.5817-(-36.17053)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 13.20313 + (((tickAnim - 18) / 22) * (30-(13.20313)));
            yy = 36.55612 + (((tickAnim - 18) / 22) * (0-(36.55612)));
            zz = 6.5817 + (((tickAnim - 18) / 22) * (0-(6.5817)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0.425 + (((tickAnim - 0) / 18) * (0-(0.425)));
            zz = -0.3 + (((tickAnim - 0) / 18) * (-0.175-(-0.3)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0.425-(0)));
            zz = -0.175 + (((tickAnim - 18) / 22) * (-0.3-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 60.57117 + (((tickAnim - 0) / 9) * (83.02826-(60.57117)));
            yy = -9.60723 + (((tickAnim - 0) / 9) * (-5.3004-(-9.60723)));
            zz = 4.8479 + (((tickAnim - 0) / 9) * (8.36088-(4.8479)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 83.02826 + (((tickAnim - 9) / 9) * (7.48534-(83.02826)));
            yy = -5.3004 + (((tickAnim - 9) / 9) * (-0.99357-(-5.3004)));
            zz = 8.36088 + (((tickAnim - 9) / 9) * (11.87386-(8.36088)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 7.48534 + (((tickAnim - 18) / 10) * (-25.97577-(7.48534)));
            yy = -0.99357 + (((tickAnim - 18) / 10) * (-5.45789-(-0.99357)));
            zz = 11.87386 + (((tickAnim - 18) / 10) * (5.85375-(11.87386)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -25.97577 + (((tickAnim - 28) / 7) * (-106.8433+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250-(-25.97577)));
            yy = -5.45789 + (((tickAnim - 28) / 7) * (-7.72117-(-5.45789)));
            zz = 5.85375 + (((tickAnim - 28) / 7) * (5.30511-(5.85375)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -106.8433+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250 + (((tickAnim - 35) / 5) * (60.57117-(-106.8433+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250)));
            yy = -7.72117 + (((tickAnim - 35) / 5) * (-9.60723-(-7.72117)));
            zz = 5.30511 + (((tickAnim - 35) / 5) * (4.8479-(5.30511)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.3 + (((tickAnim - 0) / 5) * (-0.21-(-0.3)));
            yy = 1.975 + (((tickAnim - 0) / 5) * (3.01-(1.975)));
            zz = -0.525 + (((tickAnim - 0) / 5) * (-0.89-(-0.525)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -0.21 + (((tickAnim - 5) / 4) * (-0.15-(-0.21)));
            yy = 3.01 + (((tickAnim - 5) / 4) * (2.365-(3.01)));
            zz = -0.89 + (((tickAnim - 5) / 4) * (-1.135-(-0.89)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -0.15 + (((tickAnim - 9) / 9) * (0-(-0.15)));
            yy = 2.365 + (((tickAnim - 9) / 9) * (0.1-(2.365)));
            zz = -1.135 + (((tickAnim - 9) / 9) * (0-(-1.135)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0.1 + (((tickAnim - 18) / 6) * (1.2-(0.1)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 1.2 + (((tickAnim - 24) / 4) * (0.95-(1.2)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0.95 + (((tickAnim - 28) / 5) * (1.7-(0.95)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (-0.11-(0)));
            yy = 1.7 + (((tickAnim - 33) / 2) * (1.1-(1.7)));
            zz = 0 + (((tickAnim - 33) / 2) * (0.325-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -0.11 + (((tickAnim - 35) / 5) * (-0.3-(-0.11)));
            yy = 1.1 + (((tickAnim - 35) / 5) * (1.975-(1.1)));
            zz = 0.325 + (((tickAnim - 35) / 5) * (-0.525-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-350))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*-2));


        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-1), hip.rotateAngleY + (float) Math.toRadians(0), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-3));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 55.55775 + (((tickAnim - 0) / 13) * (10.70257-(55.55775)));
            yy = 9.36279 + (((tickAnim - 0) / 13) * (-21.85616-(9.36279)));
            zz = 4.87742 + (((tickAnim - 0) / 13) * (-6.58892-(4.87742)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 10.70257 + (((tickAnim - 13) / 7) * (-27.25-(10.70257)));
            yy = -21.85616 + (((tickAnim - 13) / 7) * (0-(-21.85616)));
            zz = -6.58892 + (((tickAnim - 13) / 7) * (0-(-6.58892)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -27.25 + (((tickAnim - 20) / 20) * (55.55775-(-27.25)));
            yy = 0 + (((tickAnim - 20) / 20) * (9.36279-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (4.87742-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 23.39682 + (((tickAnim - 0) / 13) * (-23.41818-(23.39682)));
            yy = 42.60769 + (((tickAnim - 0) / 13) * (-5.6392-(42.60769)));
            zz = 5.98817 + (((tickAnim - 0) / 13) * (2.85151-(5.98817)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -23.41818 + (((tickAnim - 13) / 7) * (-28.75-(-23.41818)));
            yy = -5.6392 + (((tickAnim - 13) / 7) * (-49.5-(-5.6392)));
            zz = 2.85151 + (((tickAnim - 13) / 7) * (0-(2.85151)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -28.75 + (((tickAnim - 20) / 20) * (23.39682-(-28.75)));
            yy = -49.5 + (((tickAnim - 20) / 20) * (42.60769-(-49.5)));
            zz = 0 + (((tickAnim - 20) / 20) * (5.98817-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.58-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.325-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0.58 + (((tickAnim - 3) / 10) * (0.55-(0.58)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = -0.325 + (((tickAnim - 3) / 10) * (0-(-0.325)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.55 + (((tickAnim - 13) / 7) * (-0.25-(0.55)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -0.25 + (((tickAnim - 20) / 20) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 86.56474 + (((tickAnim - 0) / 3) * (109.88601-(86.56474)));
            yy = 6.59478 + (((tickAnim - 0) / 3) * (13.12365-(6.59478)));
            zz = -20.14997 + (((tickAnim - 0) / 3) * (-18.9782-(-20.14997)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 109.88601 + (((tickAnim - 3) / 10) * (59.93233-(109.88601)));
            yy = 13.12365 + (((tickAnim - 3) / 10) * (12.91903-(13.12365)));
            zz = -18.9782 + (((tickAnim - 3) / 10) * (-10.77615-(-18.9782)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 59.93233 + (((tickAnim - 13) / 7) * (36.71804-(59.93233)));
            yy = 12.91903 + (((tickAnim - 13) / 7) * (11.48431-(12.91903)));
            zz = -10.77615 + (((tickAnim - 13) / 7) * (-10.64782-(-10.77615)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 36.71804 + (((tickAnim - 20) / 8) * (3.88019-(36.71804)));
            yy = 11.48431 + (((tickAnim - 20) / 8) * (12.95878-(11.48431)));
            zz = -10.64782 + (((tickAnim - 20) / 8) * (-11.28228-(-10.64782)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 3.88019 + (((tickAnim - 28) / 12) * (86.56474-(3.88019)));
            yy = 12.95878 + (((tickAnim - 28) / 12) * (6.59478-(12.95878)));
            zz = -11.28228 + (((tickAnim - 28) / 12) * (-20.14997-(-11.28228)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.125 + (((tickAnim - 0) / 3) * (2.31-(1.125)));
            zz = 0.325 + (((tickAnim - 0) / 3) * (0.23-(0.325)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 2.31 + (((tickAnim - 3) / 10) * (0.935-(2.31)));
            zz = 0.23 + (((tickAnim - 3) / 10) * (0.075-(0.23)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.935 + (((tickAnim - 13) / 7) * (-0.425-(0.935)));
            zz = 0.075 + (((tickAnim - 13) / 7) * (0-(0.075)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = -0.425 + (((tickAnim - 20) / 8) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 6) * (1.505-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0.555-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 1.505 + (((tickAnim - 34) / 6) * (1.125-(1.505)));
            zz = 0.555 + (((tickAnim - 34) / 6) * (0.325-(0.555)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -27.25 + (((tickAnim - 0) / 20) * (55.55775-(-27.25)));
            yy = 0 + (((tickAnim - 0) / 20) * (-9.36279-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-4.87742-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 55.55775 + (((tickAnim - 20) / 13) * (10.70257-(55.55775)));
            yy = -9.36279 + (((tickAnim - 20) / 13) * (21.85616-(-9.36279)));
            zz = -4.87742 + (((tickAnim - 20) / 13) * (6.58892-(-4.87742)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 10.70257 + (((tickAnim - 33) / 7) * (-27.25-(10.70257)));
            yy = 21.85616 + (((tickAnim - 33) / 7) * (0-(21.85616)));
            zz = 6.58892 + (((tickAnim - 33) / 7) * (0-(6.58892)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -28.75 + (((tickAnim - 0) / 20) * (23.39682-(-28.75)));
            yy = 49.5 + (((tickAnim - 0) / 20) * (-42.60769-(49.5)));
            zz = 0 + (((tickAnim - 0) / 20) * (-5.98817-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 23.39682 + (((tickAnim - 20) / 13) * (-23.41818-(23.39682)));
            yy = -42.60769 + (((tickAnim - 20) / 13) * (5.6392-(-42.60769)));
            zz = -5.98817 + (((tickAnim - 20) / 13) * (-2.85151-(-5.98817)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -23.41818 + (((tickAnim - 33) / 7) * (-28.75-(-23.41818)));
            yy = 5.6392 + (((tickAnim - 33) / 7) * (49.5-(5.6392)));
            zz = -2.85151 + (((tickAnim - 33) / 7) * (0-(-2.85151)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (-0.55-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -0.55 + (((tickAnim - 33) / 7) * (0-(-0.55)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 36.65102 + (((tickAnim - 0) / 9) * (2.68233-(36.65102)));
            yy = -11.07085 + (((tickAnim - 0) / 9) * (-12.91903-(-11.07085)));
            zz = 9.46627 + (((tickAnim - 0) / 9) * (10.77615-(9.46627)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 2.68233 + (((tickAnim - 9) / 5) * (7.88365-(2.68233)));
            yy = -12.91903 + (((tickAnim - 9) / 5) * (-6.42508-(-12.91903)));
            zz = 10.77615 + (((tickAnim - 9) / 5) * (5.56968-(10.77615)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 7.88365 + (((tickAnim - 14) / 6) * (84.36852-(7.88365)));
            yy = -6.42508 + (((tickAnim - 14) / 6) * (1.15119-(-6.42508)));
            zz = 5.56968 + (((tickAnim - 14) / 6) * (-0.50454-(5.56968)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 84.36852 + (((tickAnim - 20) / 3) * (109.54728-(84.36852)));
            yy = 1.15119 + (((tickAnim - 20) / 3) * (-12.6408-(1.15119)));
            zz = -0.50454 + (((tickAnim - 20) / 3) * (7.23322-(-0.50454)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 109.54728 + (((tickAnim - 23) / 10) * (59.93233-(109.54728)));
            yy = -12.6408 + (((tickAnim - 23) / 10) * (-12.91903-(-12.6408)));
            zz = 7.23322 + (((tickAnim - 23) / 10) * (10.77615-(7.23322)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 59.93233 + (((tickAnim - 33) / 7) * (36.65102-(59.93233)));
            yy = -12.91903 + (((tickAnim - 33) / 7) * (-11.07085-(-12.91903)));
            zz = 10.77615 + (((tickAnim - 33) / 7) * (9.46627-(10.77615)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -0.625 + (((tickAnim - 0) / 9) * (-0.115-(-0.625)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.15-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = -0.115 + (((tickAnim - 9) / 5) * (0.71-(-0.115)));
            zz = 0.15 + (((tickAnim - 9) / 5) * (0.23-(0.15)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0.71 + (((tickAnim - 14) / 6) * (1.125-(0.71)));
            zz = 0.23 + (((tickAnim - 14) / 6) * (0.325-(0.23)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 1.125 + (((tickAnim - 20) / 3) * (1.86-(1.125)));
            zz = 0.325 + (((tickAnim - 20) / 3) * (0.23-(0.325)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 1.86 + (((tickAnim - 23) / 10) * (0.935-(1.86)));
            zz = 0.23 + (((tickAnim - 23) / 10) * (0.075-(0.23)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0.935 + (((tickAnim - 33) / 7) * (-0.625-(0.935)));
            zz = 0.075 + (((tickAnim - 33) / 7) * (0-(0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*9), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-3));


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPeltobatrachus ee = (EntityPrehistoricFloraPeltobatrachus) entitylivingbaseIn;

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
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPeltobatrachus e = (EntityPrehistoricFloraPeltobatrachus) entity;

    }
}
