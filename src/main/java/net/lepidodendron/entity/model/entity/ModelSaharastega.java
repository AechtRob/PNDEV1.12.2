package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSaharastega;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSaharastega extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    private ModelAnimator animator;

    public ModelSaharastega() {
        this.textureWidth = 62;
        this.textureHeight = 59;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.25F, 3.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.3076F, -6.2916F, -0.1305F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -0.7875F, -4.0F, 7, 4, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 13, -3.0F, -1.7125F, -4.0F, 6, 1, 8, -0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.2125F, -3.5F);
        this.body.addChild(chest);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -1.3F, 0.0F);
        this.chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 13, -1.5F, 0.0F, -5.2F, 5, 2, 6, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.075F, -5.0F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0742F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 23, -3.0F, 0.0F, 0.3F, 6, 3, 5, 0.0F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(2.75F, 1.75F, -0.5F);
        this.chest.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.1766F, 0.4011F, -1.1421F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 35, 51, -1.0F, -0.5F, -1.0F, 2, 3, 2, 0.0F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.0F, 2.25F, 0.25F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.8119F, -0.1394F, 1.0003F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 26, 51, -1.0F, -0.2956F, -1.0616F, 2, 4, 2, 0.0F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 3.5044F, 0.7384F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.3925F, 0.0044F, 0.2052F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 32, 40, -1.4956F, -0.5869F, -3.9962F, 3, 1, 4, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-2.75F, 1.75F, -0.5F);
        this.chest.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.1766F, -0.4011F, 1.1421F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 35, 51, -1.0F, -0.5F, -1.0F, 2, 3, 2, 0.0F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(0.0F, 2.25F, 0.25F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.8119F, 0.1394F, -1.0003F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 26, 51, -1.0F, -0.2956F, -1.0616F, 2, 4, 2, 0.0F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 3.5044F, 0.7384F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.3925F, -0.0044F, -0.2052F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 32, 40, -1.5044F, -0.5869F, -3.9962F, 3, 1, 4, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.0931F, 0.5924F, -4.4799F);
        this.chest.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 18, 55, -0.4069F, -0.3424F, -7.4861F, 1, 1, 1, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 31, 7, -2.4069F, -0.3424F, -3.0701F, 5, 1, 4, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 45, 46, -0.9069F, -0.3424F, -6.8201F, 2, 1, 4, 0.006F, false));
        this.head.cubeList.add(new ModelBox(head, 52, 19, -1.9069F, -0.888F, -2.705F, 4, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.4069F, -0.888F, -1.705F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 28, -2.0F, 0.0F, -0.575F, 5, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.1569F, 0.6576F, -0.0701F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 53, 0.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.8069F, -0.2798F, -2.8932F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0631F, -0.4423F, 0.3349F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 53, 57, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.1052F, 0.6576F, -6.7201F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.7767F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 57, 32, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.636F, 0.6576F, -3.0246F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.3927F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 48, 22, 0.0F, -1.0F, -4.0F, 2, 1, 4, -0.003F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.9931F, -0.2798F, -2.8932F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0631F, 0.4423F, -0.3349F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 53, 57, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.4069F, 0.3052F, -2.7482F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 55, -1.0F, -1.125F, -0.6F, 3, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0931F, -0.3424F, -6.8201F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 47, -1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.536F, 0.7576F, -3.0246F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.3927F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 52, 13, 0.0F, -1.0F, -4.0F, 0, 1, 4, -0.003F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0052F, 0.7576F, -6.7201F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.7767F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 23, 55, 0.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.1914F, 0.7576F, -6.7201F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.7767F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 23, 55, 0.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.2914F, 0.6576F, -6.7201F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.7767F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 57, 32, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.7222F, 0.7576F, -3.0246F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.3927F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 52, 13, 0.0F, -1.0F, -4.0F, 0, 1, 4, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.8222F, 0.6576F, -3.0246F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.3927F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 48, 22, -2.0F, -1.0F, -4.0F, 2, 1, 4, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(3.3431F, 0.6576F, -0.0701F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.1745F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 53, -1.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.1967F, 0.623F, -0.5572F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 35, 57, -0.6036F, 0.0346F, -6.9289F, 1, 1, 1, 0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 15, 40, -2.6036F, 0.0346F, -2.513F, 5, 1, 3, 0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 15, 45, -2.6036F, -1.3655F, -1.313F, 5, 2, 2, -0.006F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 47, 38, -1.1036F, 0.0346F, -6.263F, 2, 1, 4, 0.006F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.3019F, -0.0654F, -6.1629F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.7767F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 40, 57, 0.0713F, 0.0F, -1.0701F, 0, 1, 1, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 57, 35, 0.0F, 0.1F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.8327F, -0.0654F, -2.4674F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.3927F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 52, 0.0924F, 0.0F, -4.0383F, 0, 1, 4, -0.003F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 50, 7, 0.0F, 0.1F, -4.0F, 2, 1, 4, -0.003F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0947F, -0.0654F, -6.1629F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.7767F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 40, 57, -0.0713F, 0.0F, -1.0701F, 0, 1, 1, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 57, 35, -1.0F, 0.1F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-3.3536F, 0.0346F, 0.487F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.1745F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 53, 52, 0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.6254F, -0.0654F, -2.4674F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.3927F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 44, 52, -0.0924F, 0.0F, -4.0383F, 0, 1, 4, -0.003F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 50, 7, -2.0F, 0.1F, -4.0F, 2, 1, 4, -0.003F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(3.1464F, 0.0346F, 0.487F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.1745F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 53, 52, -1.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.1036F, 1.4206F, -2.2801F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0916F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 30, 46, -2.0F, -1.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.6036F, 1.1596F, -4.263F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1309F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 13, 50, -1.0F, -1.0F, -1.0F, 3, 1, 3, 0.0F, false));

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, -0.2125F, 2.7F);
        this.body.addChild(hip);
        this.setRotateAngle(hip, -0.1745F, 0.0F, 0.0F);
        this.hip.cubeList.add(new ModelBox(hip, 0, 23, -3.0F, -0.575F, 0.0F, 6, 3, 6, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.0F, -0.3F, 3.5F);
        this.hip.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0436F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 31, 0, -1.5F, -0.975F, -2.55F, 5, 1, 5, 0.0F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(2.75F, 1.925F, 2.8F);
        this.hip.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.3927F, 0.0F, -1.4835F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 52, 0, -1.0F, -0.5F, -1.0F, 2, 3, 2, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.0F, 2.25F, 0.25F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.5236F, 0.0F, 1.309F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 15, 33, -1.0F, -0.2956F, -1.0616F, 2, 4, 2, 0.0F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 3.5044F, -0.2616F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.3032F, -0.2536F, 0.3121F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 42, 32, -1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-2.75F, 1.925F, 2.8F);
        this.hip.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.3927F, 0.0F, 1.4835F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 52, 0, -1.0F, -0.5F, -1.0F, 2, 3, 2, 0.0F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(0.0F, 2.25F, 0.25F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.5236F, 0.0F, -1.309F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 15, 33, -1.0F, -0.2956F, -1.0616F, 2, 4, 2, 0.0F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 3.5044F, -0.2616F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.3032F, 0.2536F, -0.3121F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 42, 32, -1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.947F, 5.5847F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 25, 32, -2.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 3.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 33, -1.5F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 3.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 40, -1.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = -0.2F;
        this.main.rotateAngleY = (float)Math.toRadians(140);
        this.main.rotateAngleX = (float)Math.toRadians(24);
        this.main.rotateAngleZ = (float)Math.toRadians(5);
        this.main.scaleChildren = true;
        float scaler = 0.98F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 6, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};

        EntityPrehistoricFloraSaharastega entitySilesaurus = (EntityPrehistoricFloraSaharastega) e;

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraSaharastega ee = (EntityPrehistoricFloraSaharastega) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animWalkFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSaharastega entity = (EntityPrehistoricFloraSaharastega) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -35 + (((tickAnim - 0) / 16) * (35.33237-(-35)));
            yy = 0 + (((tickAnim - 0) / 16) * (25.2132-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (10.74701-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 35.33237 + (((tickAnim - 16) / 3) * (33.34842-(35.33237)));
            yy = 25.2132 + (((tickAnim - 16) / 3) * (31.96716-(25.2132)));
            zz = 10.74701 + (((tickAnim - 16) / 3) * (8.43689-(10.74701)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 33.34842 + (((tickAnim - 19) / 8) * (-12.39783-(33.34842)));
            yy = 31.96716 + (((tickAnim - 19) / 8) * (6.70827-(31.96716)));
            zz = 8.43689 + (((tickAnim - 19) / 8) * (-21.59258-(8.43689)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -12.39783 + (((tickAnim - 27) / 8) * (-35-(-12.39783)));
            yy = 6.70827 + (((tickAnim - 27) / 8) * (0-(6.70827)));
            zz = -21.59258 + (((tickAnim - 27) / 8) * (0-(-21.59258)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0.12245 + (((tickAnim - 0) / 16) * (12.96552-(0.12245)));
            yy = -25.54833 + (((tickAnim - 0) / 16) * (4.0393-(-25.54833)));
            zz = -4.43914 + (((tickAnim - 0) / 16) * (-2.90132-(-4.43914)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 12.96552 + (((tickAnim - 16) / 12) * (-38.76886-(12.96552)));
            yy = 4.0393 + (((tickAnim - 16) / 12) * (-12.20049-(4.0393)));
            zz = -2.90132 + (((tickAnim - 16) / 12) * (22.18805-(-2.90132)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -38.76886 + (((tickAnim - 28) / 7) * (0.12245-(-38.76886)));
            yy = -12.20049 + (((tickAnim - 28) / 7) * (-25.54833-(-12.20049)));
            zz = 22.18805 + (((tickAnim - 28) / 7) * (-4.43914-(22.18805)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-0.275-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -0.275 + (((tickAnim - 28) / 7) * (0-(-0.275)));
            yy = 0.5 + (((tickAnim - 28) / 7) * (0-(0.5)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 18 + (((tickAnim - 0) / 8) * (-13.78889-(18)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.86331-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (3.70593-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -13.78889 + (((tickAnim - 8) / 8) * (43.1466-(-13.78889)));
            yy = 0.86331 + (((tickAnim - 8) / 8) * (0.14963-(0.86331)));
            zz = 3.70593 + (((tickAnim - 8) / 8) * (-4.50895-(3.70593)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 43.1466 + (((tickAnim - 16) / 6) * (89.9208-(43.1466)));
            yy = 0.14963 + (((tickAnim - 16) / 6) * (-0.13585-(0.14963)));
            zz = -4.50895 + (((tickAnim - 16) / 6) * (-7.79491-(-4.50895)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 89.9208 + (((tickAnim - 22) / 6) * (80.37069-(89.9208)));
            yy = -0.13585 + (((tickAnim - 22) / 6) * (-0.49269-(-0.13585)));
            zz = -7.79491 + (((tickAnim - 22) / 6) * (-11.90235-(-7.79491)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 80.37069 + (((tickAnim - 28) / 7) * (18-(80.37069)));
            yy = -0.49269 + (((tickAnim - 28) / 7) * (0-(-0.49269)));
            zz = -11.90235 + (((tickAnim - 28) / 7) * (0-(-11.90235)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.9 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1.4-(0.9)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1.4 + (((tickAnim - 8) / 3) * (0.98-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1.4)));
            zz = 0 + (((tickAnim - 8) / 3) * (0.01-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0.98 + (((tickAnim - 11) / 5) * (1.55-(0.98)));
            zz = 0.01 + (((tickAnim - 11) / 5) * (0.02-(0.01)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 1.55 + (((tickAnim - 16) / 6) * (2.275-(1.55)));
            zz = 0.02 + (((tickAnim - 16) / 6) * (-1.07-(0.02)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 2.275 + (((tickAnim - 22) / 6) * (2.47-(2.275)));
            zz = -1.07 + (((tickAnim - 22) / 6) * (-1.075-(-1.07)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 2.47 + (((tickAnim - 28) / 7) * (0.9-(2.47)));
            zz = -1.075 + (((tickAnim - 28) / 7) * (0-(-1.075)));
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
            xx = 62 + (((tickAnim - 0) / 9) * (16.60362-(62)));
            yy = 0 + (((tickAnim - 0) / 9) * (1.60602-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-13.28959-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 16.60362 + (((tickAnim - 9) / 9) * (-33.45671-(16.60362)));
            yy = 1.60602 + (((tickAnim - 9) / 9) * (6.33394-(1.60602)));
            zz = -13.28959 + (((tickAnim - 9) / 9) * (5.29699-(-13.28959)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -33.45671 + (((tickAnim - 18) / 17) * (62-(-33.45671)));
            yy = 6.33394 + (((tickAnim - 18) / 17) * (0-(6.33394)));
            zz = 5.29699 + (((tickAnim - 18) / 17) * (0-(5.29699)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 39.02398 + (((tickAnim - 0) / 9) * (-22.19719-(39.02398)));
            yy = 28.13585 + (((tickAnim - 0) / 9) * (4.38194-(28.13585)));
            zz = 1.48775 + (((tickAnim - 0) / 9) * (-27.92953-(1.48775)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -22.19719 + (((tickAnim - 9) / 9) * (14.55492-(-22.19719)));
            yy = 4.38194 + (((tickAnim - 9) / 9) * (-40.10736-(4.38194)));
            zz = -27.92953 + (((tickAnim - 9) / 9) * (-20.19384-(-27.92953)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 14.55492 + (((tickAnim - 18) / 17) * (39.02398-(14.55492)));
            yy = -40.10736 + (((tickAnim - 18) / 17) * (28.13585-(-40.10736)));
            zz = -20.19384 + (((tickAnim - 18) / 17) * (1.48775-(-20.19384)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0.225 + (((tickAnim - 9) / 9) * (0-(0.225)));
            yy = 0.35 + (((tickAnim - 9) / 9) * (0-(0.35)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
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
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 9.65453 + (((tickAnim - 0) / 4) * (87.59428-(9.65453)));
            yy = -1.32472 + (((tickAnim - 0) / 4) * (-10.38168-(-1.32472)));
            zz = -2.49724 + (((tickAnim - 0) / 4) * (-20.74603-(-2.49724)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 87.59428 + (((tickAnim - 4) / 5) * (37.0547-(87.59428)));
            yy = -10.38168 + (((tickAnim - 4) / 5) * (1.22333-(-10.38168)));
            zz = -20.74603 + (((tickAnim - 4) / 5) * (11.40382-(-20.74603)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 37.0547 + (((tickAnim - 9) / 4) * (-9.51992-(37.0547)));
            yy = 1.22333 + (((tickAnim - 9) / 4) * (7.43401-(1.22333)));
            zz = 11.40382 + (((tickAnim - 9) / 4) * (17.95336-(11.40382)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -9.51992 + (((tickAnim - 13) / 5) * (4.39221-(-9.51992)));
            yy = 7.43401 + (((tickAnim - 13) / 5) * (8.27851-(7.43401)));
            zz = 17.95336 + (((tickAnim - 13) / 5) * (-1.58613-(17.95336)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 4.39221 + (((tickAnim - 18) / 7) * (-17.99811-(4.39221)));
            yy = 8.27851 + (((tickAnim - 18) / 7) * (10.24138-(8.27851)));
            zz = -1.58613 + (((tickAnim - 18) / 7) * (6.71719-(-1.58613)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -17.99811 + (((tickAnim - 25) / 10) * (9.65453-(-17.99811)));
            yy = 10.24138 + (((tickAnim - 25) / 10) * (-1.32472-(10.24138)));
            zz = 6.71719 + (((tickAnim - 25) / 10) * (-2.49724-(6.71719)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.605-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.185-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 1.605 + (((tickAnim - 4) / 5) * (1.075-(1.605)));
            zz = 0.185 + (((tickAnim - 4) / 5) * (0.025-(0.185)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (-0.625-(0)));
            yy = 1.075 + (((tickAnim - 9) / 4) * (0.09-(1.075)));
            zz = 0.025 + (((tickAnim - 9) / 4) * (0.01-(0.025)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -0.625 + (((tickAnim - 13) / 5) * (0-(-0.625)));
            yy = 0.09 + (((tickAnim - 13) / 5) * (0.05-(0.09)));
            zz = 0.01 + (((tickAnim - 13) / 5) * (0-(0.01)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0.05 + (((tickAnim - 18) / 7) * (-0.575-(0.05)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = -0.575 + (((tickAnim - 25) / 7) * (0.185-(-0.575)));
            zz = 0 + (((tickAnim - 25) / 7) * (0.275-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 0.185 + (((tickAnim - 32) / 3) * (0-(0.185)));
            zz = 0.275 + (((tickAnim - 32) / 3) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 35.33237 + (((tickAnim - 0) / 3) * (33.34842-(35.33237)));
            yy = -25.2132 + (((tickAnim - 0) / 3) * (-31.96716-(-25.2132)));
            zz = -10.74701 + (((tickAnim - 0) / 3) * (-8.43689-(-10.74701)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 33.34842 + (((tickAnim - 3) / 8) * (-12.39783-(33.34842)));
            yy = -31.96716 + (((tickAnim - 3) / 8) * (-6.70827-(-31.96716)));
            zz = -8.43689 + (((tickAnim - 3) / 8) * (21.59258-(-8.43689)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = -12.39783 + (((tickAnim - 11) / 8) * (-35-(-12.39783)));
            yy = -6.70827 + (((tickAnim - 11) / 8) * (0-(-6.70827)));
            zz = 21.59258 + (((tickAnim - 11) / 8) * (0-(21.59258)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = -35 + (((tickAnim - 19) / 16) * (35.33237-(-35)));
            yy = 0 + (((tickAnim - 19) / 16) * (-25.2132-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (-10.74701-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 12.96552 + (((tickAnim - 0) / 12) * (-38.76886-(12.96552)));
            yy = -4.0393 + (((tickAnim - 0) / 12) * (12.20049-(-4.0393)));
            zz = 2.90132 + (((tickAnim - 0) / 12) * (-22.18805-(2.90132)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = -38.76886 + (((tickAnim - 12) / 7) * (0.12245-(-38.76886)));
            yy = 12.20049 + (((tickAnim - 12) / 7) * (25.54833-(12.20049)));
            zz = -22.18805 + (((tickAnim - 12) / 7) * (4.43914-(-22.18805)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0.12245 + (((tickAnim - 19) / 16) * (12.96552-(0.12245)));
            yy = 25.54833 + (((tickAnim - 19) / 16) * (-4.0393-(25.54833)));
            zz = 4.43914 + (((tickAnim - 19) / 16) * (2.90132-(4.43914)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-0.275-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = -0.275 + (((tickAnim - 12) / 7) * (0-(-0.275)));
            yy = 0.5 + (((tickAnim - 12) / 7) * (0-(0.5)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
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
            xx = 43.1466 + (((tickAnim - 0) / 5) * (89.9208-(43.1466)));
            yy = 0.14963 + (((tickAnim - 0) / 5) * (-0.13585-(0.14963)));
            zz = 4.50895 + (((tickAnim - 0) / 5) * (7.79491-(4.50895)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 89.9208 + (((tickAnim - 5) / 7) * (80.37069-(89.9208)));
            yy = -0.13585 + (((tickAnim - 5) / 7) * (-0.49269-(-0.13585)));
            zz = 7.79491 + (((tickAnim - 5) / 7) * (11.90235-(7.79491)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 80.37069 + (((tickAnim - 12) / 7) * (19.75-(80.37069)));
            yy = -0.49269 + (((tickAnim - 12) / 7) * (0-(-0.49269)));
            zz = 11.90235 + (((tickAnim - 12) / 7) * (0-(11.90235)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 19.75 + (((tickAnim - 19) / 7) * (-12.53889-(19.75)));
            yy = 0 + (((tickAnim - 19) / 7) * (0.86331-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (-3.70593-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = -12.53889 + (((tickAnim - 26) / 9) * (43.1466-(-12.53889)));
            yy = 0.86331 + (((tickAnim - 26) / 9) * (0.14963-(0.86331)));
            zz = -3.70593 + (((tickAnim - 26) / 9) * (4.50895-(-3.70593)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 1.55 + (((tickAnim - 0) / 5) * (2.275-(1.55)));
            zz = 0.02 + (((tickAnim - 0) / 5) * (-1.07-(0.02)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 2.275 + (((tickAnim - 5) / 7) * (2.295-(2.275)));
            zz = -1.07 + (((tickAnim - 5) / 7) * (-1.075-(-1.07)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = 2.295 + (((tickAnim - 12) / 7) * (0.775-(2.295)));
            zz = -1.075 + (((tickAnim - 12) / 7) * (0-(-1.075)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            yy = 0.775 + (((tickAnim - 19) / 7) * (0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1-(0.775)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1 + (((tickAnim - 26) / 4) * (0.98-(0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1)));
            zz = 0 + (((tickAnim - 26) / 4) * (0.01-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0.98 + (((tickAnim - 30) / 5) * (1.55-(0.98)));
            zz = 0.01 + (((tickAnim - 30) / 5) * (0.02-(0.01)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -33.45671 + (((tickAnim - 0) / 18) * (62-(-33.45671)));
            yy = -6.33394 + (((tickAnim - 0) / 18) * (0-(-6.33394)));
            zz = -5.29699 + (((tickAnim - 0) / 18) * (0-(-5.29699)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 62 + (((tickAnim - 18) / 8) * (16.60362-(62)));
            yy = 0 + (((tickAnim - 18) / 8) * (-1.60602-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (13.28959-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 16.60362 + (((tickAnim - 26) / 9) * (-33.45671-(16.60362)));
            yy = -1.60602 + (((tickAnim - 26) / 9) * (-6.33394-(-1.60602)));
            zz = 13.28959 + (((tickAnim - 26) / 9) * (-5.29699-(13.28959)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 14.55492 + (((tickAnim - 0) / 18) * (39.02398-(14.55492)));
            yy = 40.10736 + (((tickAnim - 0) / 18) * (-28.13585-(40.10736)));
            zz = 20.19384 + (((tickAnim - 0) / 18) * (-1.48775-(20.19384)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 39.02398 + (((tickAnim - 18) / 8) * (-22.19719-(39.02398)));
            yy = -28.13585 + (((tickAnim - 18) / 8) * (-4.38194-(-28.13585)));
            zz = -1.48775 + (((tickAnim - 18) / 8) * (27.92953-(-1.48775)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = -22.19719 + (((tickAnim - 26) / 9) * (14.55492-(-22.19719)));
            yy = -4.38194 + (((tickAnim - 26) / 9) * (40.10736-(-4.38194)));
            zz = 27.92953 + (((tickAnim - 26) / 9) * (20.19384-(27.92953)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0.225-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (0.35-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0.225 + (((tickAnim - 26) / 9) * (0-(0.225)));
            yy = 0.35 + (((tickAnim - 26) / 9) * (0-(0.35)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 3.22855 + (((tickAnim - 0) / 8) * (-17.80001-(3.22855)));
            yy = -14.58075 + (((tickAnim - 0) / 8) * (-12.18193-(-14.58075)));
            zz = 3.18044 + (((tickAnim - 0) / 8) * (-3.27385-(3.18044)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -17.80001 + (((tickAnim - 8) / 10) * (9.65453-(-17.80001)));
            yy = -12.18193 + (((tickAnim - 8) / 10) * (1.32472-(-12.18193)));
            zz = -3.27385 + (((tickAnim - 8) / 10) * (2.49724-(-3.27385)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 9.65453 + (((tickAnim - 18) / 4) * (87.59428-(9.65453)));
            yy = 1.32472 + (((tickAnim - 18) / 4) * (10.38168-(1.32472)));
            zz = 2.49724 + (((tickAnim - 18) / 4) * (20.74603-(2.49724)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 87.59428 + (((tickAnim - 22) / 4) * (37.0547-(87.59428)));
            yy = 10.38168 + (((tickAnim - 22) / 4) * (-1.22333-(10.38168)));
            zz = 20.74603 + (((tickAnim - 22) / 4) * (-11.40382-(20.74603)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 37.0547 + (((tickAnim - 26) / 5) * (-9.51992-(37.0547)));
            yy = -1.22333 + (((tickAnim - 26) / 5) * (-7.43401-(-1.22333)));
            zz = -11.40382 + (((tickAnim - 26) / 5) * (-17.95336-(-11.40382)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -9.51992 + (((tickAnim - 31) / 4) * (3.22855-(-9.51992)));
            yy = -7.43401 + (((tickAnim - 31) / 4) * (-14.58075-(-7.43401)));
            zz = -17.95336 + (((tickAnim - 31) / 4) * (3.18044-(-17.95336)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 8) * (-0.72-(0.175)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.72 + (((tickAnim - 8) / 5) * (0.2-(-0.72)));
            zz = 0 + (((tickAnim - 8) / 5) * (0.3-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 13) / 5) * (0-(0.2)));
            zz = 0.3 + (((tickAnim - 13) / 5) * (0-(0.3)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (1.605-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0.185-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 1.605 + (((tickAnim - 22) / 4) * (1.075-(1.605)));
            zz = 0.185 + (((tickAnim - 22) / 4) * (0.025-(0.185)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (0.625-(0)));
            yy = 1.075 + (((tickAnim - 26) / 5) * (0.09-(1.075)));
            zz = 0.025 + (((tickAnim - 26) / 5) * (0.01-(0.025)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0.625 + (((tickAnim - 31) / 4) * (0-(0.625)));
            yy = 0.09 + (((tickAnim - 31) / 4) * (0.175-(0.09)));
            zz = 0.01 + (((tickAnim - 31) / 4) * (0-(0.01)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-130))*-2), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*0.19);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-50))*0.3);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-100))*-0.3);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-200))*-2), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-300))*-4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.jaw.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-300))*-0.001),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-300))*-0.069),(float)1);


        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-150))*-2), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*2), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*2));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-200))*-3), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-250))*-2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-300))*-1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*8));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSaharastega entity = (EntityPrehistoricFloraSaharastega) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*7), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-20))*0.5);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+90))*7), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(74.6811), frontLeftLeg.rotateAngleY + (float) Math.toRadians(26.09686), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(61.72288));
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(-164+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-5), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(-79.02966), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(-180));
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(0);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(0);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(-0.325);
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(73+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-5), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(0), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(0);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(1.275);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(-0.325);
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(74.6811), frontRightLeg.rotateAngleY + (float) Math.toRadians(-26.09686), frontRightLeg.rotateAngleZ + (float) Math.toRadians(-61.72288));
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(-160+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*5), frontRightLeg2.rotateAngleY + (float) Math.toRadians(79.02966), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(-180));
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(0);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(0);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(-0.325);
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(73+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*5), frontRightLeg3.rotateAngleY + (float) Math.toRadians(0), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(0);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(1.275);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(-0.325);
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+170))*7), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-7), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*3));
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(68+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*3), backLeftLeg.rotateAngleY + (float) Math.toRadians(0), backLeftLeg.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*9), backLeftLeg2.rotateAngleY + (float) Math.toRadians(0), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(-81));
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(105+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*15), backLeftLeg3.rotateAngleY + (float) Math.toRadians(0), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(68+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-3), backRightLeg.rotateAngleY + (float) Math.toRadians(0), backRightLeg.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-9), backRightLeg2.rotateAngleY + (float) Math.toRadians(0), backRightLeg2.rotateAngleZ + (float) Math.toRadians(81));
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(105+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-15), backRightLeg3.rotateAngleY + (float) Math.toRadians(0), backRightLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*5));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-15), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*5));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-25), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*8));


    }
    public void animWalkFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSaharastega entity = (EntityPrehistoricFloraSaharastega) entitylivingbaseIn;
        int animCycle = 21;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -35 + (((tickAnim - 0) / 10) * (35.33237-(-35)));
            yy = 0 + (((tickAnim - 0) / 10) * (25.2132-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (10.74701-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 35.33237 + (((tickAnim - 10) / 2) * (33.34842-(35.33237)));
            yy = 25.2132 + (((tickAnim - 10) / 2) * (31.96716-(25.2132)));
            zz = 10.74701 + (((tickAnim - 10) / 2) * (8.43689-(10.74701)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 33.34842 + (((tickAnim - 12) / 5) * (-12.39783-(33.34842)));
            yy = 31.96716 + (((tickAnim - 12) / 5) * (6.70827-(31.96716)));
            zz = 8.43689 + (((tickAnim - 12) / 5) * (-21.59258-(8.43689)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -12.39783 + (((tickAnim - 17) / 5) * (-35-(-12.39783)));
            yy = 6.70827 + (((tickAnim - 17) / 5) * (0-(6.70827)));
            zz = -21.59258 + (((tickAnim - 17) / 5) * (0-(-21.59258)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0.12245 + (((tickAnim - 0) / 10) * (12.96552-(0.12245)));
            yy = -25.54833 + (((tickAnim - 0) / 10) * (4.0393-(-25.54833)));
            zz = -4.43914 + (((tickAnim - 0) / 10) * (-2.90132-(-4.43914)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 12.96552 + (((tickAnim - 10) / 7) * (-38.76886-(12.96552)));
            yy = 4.0393 + (((tickAnim - 10) / 7) * (-12.20049-(4.0393)));
            zz = -2.90132 + (((tickAnim - 10) / 7) * (22.18805-(-2.90132)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -38.76886 + (((tickAnim - 17) / 5) * (0.12245-(-38.76886)));
            yy = -12.20049 + (((tickAnim - 17) / 5) * (-25.54833-(-12.20049)));
            zz = 22.18805 + (((tickAnim - 17) / 5) * (-4.43914-(22.18805)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-0.275-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -0.275 + (((tickAnim - 17) / 5) * (0-(-0.275)));
            yy = 0.5 + (((tickAnim - 17) / 5) * (0-(0.5)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 18 + (((tickAnim - 0) / 4) * (-12.53889-(18)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.86331-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (3.70593-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -12.53889 + (((tickAnim - 4) / 6) * (43.1466-(-12.53889)));
            yy = 0.86331 + (((tickAnim - 4) / 6) * (0.14963-(0.86331)));
            zz = 3.70593 + (((tickAnim - 4) / 6) * (-4.50895-(3.70593)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 43.1466 + (((tickAnim - 10) / 3) * (89.9208-(43.1466)));
            yy = 0.14963 + (((tickAnim - 10) / 3) * (-0.13585-(0.14963)));
            zz = -4.50895 + (((tickAnim - 10) / 3) * (-7.79491-(-4.50895)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 89.9208 + (((tickAnim - 13) / 4) * (80.37069-(89.9208)));
            yy = -0.13585 + (((tickAnim - 13) / 4) * (-0.49269-(-0.13585)));
            zz = -7.79491 + (((tickAnim - 13) / 4) * (-11.90235-(-7.79491)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 80.37069 + (((tickAnim - 17) / 5) * (18-(80.37069)));
            yy = -0.49269 + (((tickAnim - 17) / 5) * (0-(-0.49269)));
            zz = -11.90235 + (((tickAnim - 17) / 5) * (0-(-11.90235)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 4) * (0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1-(0.3)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1 + (((tickAnim - 4) / 3) * (0.98-(0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1)));
            zz = 0 + (((tickAnim - 4) / 3) * (0.01-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.98 + (((tickAnim - 7) / 3) * (1.55-(0.98)));
            zz = 0.01 + (((tickAnim - 7) / 3) * (0.02-(0.01)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.55 + (((tickAnim - 10) / 3) * (2.275-(1.55)));
            zz = 0.02 + (((tickAnim - 10) / 3) * (-1.07-(0.02)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 2.275 + (((tickAnim - 13) / 4) * (2.47-(2.275)));
            zz = -1.07 + (((tickAnim - 13) / 4) * (-1.075-(-1.07)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 2.47 + (((tickAnim - 17) / 5) * (0.3-(2.47)));
            zz = -1.075 + (((tickAnim - 17) / 5) * (0-(-1.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 62 + (((tickAnim - 0) / 6) * (16.60362-(62)));
            yy = 0 + (((tickAnim - 0) / 6) * (1.60602-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-13.28959-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 16.60362 + (((tickAnim - 6) / 5) * (-33.45671-(16.60362)));
            yy = 1.60602 + (((tickAnim - 6) / 5) * (6.33394-(1.60602)));
            zz = -13.28959 + (((tickAnim - 6) / 5) * (5.29699-(-13.28959)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = -33.45671 + (((tickAnim - 11) / 11) * (62-(-33.45671)));
            yy = 6.33394 + (((tickAnim - 11) / 11) * (0-(6.33394)));
            zz = 5.29699 + (((tickAnim - 11) / 11) * (0-(5.29699)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 39.02398 + (((tickAnim - 0) / 6) * (-22.19719-(39.02398)));
            yy = 28.13585 + (((tickAnim - 0) / 6) * (4.38194-(28.13585)));
            zz = 1.48775 + (((tickAnim - 0) / 6) * (-27.92953-(1.48775)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -22.19719 + (((tickAnim - 6) / 5) * (14.55492-(-22.19719)));
            yy = 4.38194 + (((tickAnim - 6) / 5) * (-40.10736-(4.38194)));
            zz = -27.92953 + (((tickAnim - 6) / 5) * (-20.19384-(-27.92953)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 14.55492 + (((tickAnim - 11) / 11) * (39.02398-(14.55492)));
            yy = -40.10736 + (((tickAnim - 11) / 11) * (28.13585-(-40.10736)));
            zz = -20.19384 + (((tickAnim - 11) / 11) * (1.48775-(-20.19384)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0.225 + (((tickAnim - 6) / 5) * (0-(0.225)));
            yy = 0.35 + (((tickAnim - 6) / 5) * (0-(0.35)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
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
            xx = 9.65453 + (((tickAnim - 0) / 3) * (87.59428-(9.65453)));
            yy = -1.32472 + (((tickAnim - 0) / 3) * (-10.38168-(-1.32472)));
            zz = -2.49724 + (((tickAnim - 0) / 3) * (-20.74603-(-2.49724)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 87.59428 + (((tickAnim - 3) / 3) * (37.0547-(87.59428)));
            yy = -10.38168 + (((tickAnim - 3) / 3) * (1.22333-(-10.38168)));
            zz = -20.74603 + (((tickAnim - 3) / 3) * (11.40382-(-20.74603)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 37.0547 + (((tickAnim - 6) / 2) * (-9.51992-(37.0547)));
            yy = 1.22333 + (((tickAnim - 6) / 2) * (7.43401-(1.22333)));
            zz = 11.40382 + (((tickAnim - 6) / 2) * (17.95336-(11.40382)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -9.51992 + (((tickAnim - 8) / 3) * (4.39221-(-9.51992)));
            yy = 7.43401 + (((tickAnim - 8) / 3) * (8.27851-(7.43401)));
            zz = 17.95336 + (((tickAnim - 8) / 3) * (-1.58613-(17.95336)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 4.39221 + (((tickAnim - 11) / 4) * (-17.99811-(4.39221)));
            yy = 8.27851 + (((tickAnim - 11) / 4) * (10.24138-(8.27851)));
            zz = -1.58613 + (((tickAnim - 11) / 4) * (6.71719-(-1.58613)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -17.99811 + (((tickAnim - 15) / 7) * (9.65453-(-17.99811)));
            yy = 10.24138 + (((tickAnim - 15) / 7) * (-1.32472-(10.24138)));
            zz = 6.71719 + (((tickAnim - 15) / 7) * (-2.49724-(6.71719)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.605-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.185-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.605 + (((tickAnim - 3) / 3) * (1.075-(1.605)));
            zz = 0.185 + (((tickAnim - 3) / 3) * (0.025-(0.185)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (-0.625-(0)));
            yy = 1.075 + (((tickAnim - 6) / 2) * (0.09-(1.075)));
            zz = 0.025 + (((tickAnim - 6) / 2) * (0.01-(0.025)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -0.625 + (((tickAnim - 8) / 3) * (0-(-0.625)));
            yy = 0.09 + (((tickAnim - 8) / 3) * (-0.275-(0.09)));
            zz = 0.01 + (((tickAnim - 8) / 3) * (0-(0.01)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -0.275 + (((tickAnim - 11) / 4) * (0.89-(-0.275)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 0.89 + (((tickAnim - 15) / 7) * (0-(0.89)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 35.33237 + (((tickAnim - 0) / 2) * (33.34842-(35.33237)));
            yy = -25.2132 + (((tickAnim - 0) / 2) * (-31.96716-(-25.2132)));
            zz = -10.74701 + (((tickAnim - 0) / 2) * (-8.43689-(-10.74701)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 33.34842 + (((tickAnim - 2) / 5) * (-12.39783-(33.34842)));
            yy = -31.96716 + (((tickAnim - 2) / 5) * (-6.70827-(-31.96716)));
            zz = -8.43689 + (((tickAnim - 2) / 5) * (21.59258-(-8.43689)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -12.39783 + (((tickAnim - 7) / 5) * (-35-(-12.39783)));
            yy = -6.70827 + (((tickAnim - 7) / 5) * (0-(-6.70827)));
            zz = 21.59258 + (((tickAnim - 7) / 5) * (0-(21.59258)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -35 + (((tickAnim - 12) / 10) * (35.33237-(-35)));
            yy = 0 + (((tickAnim - 12) / 10) * (-25.2132-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (-10.74701-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 12.96552 + (((tickAnim - 0) / 8) * (-38.76886-(12.96552)));
            yy = -4.0393 + (((tickAnim - 0) / 8) * (12.20049-(-4.0393)));
            zz = 2.90132 + (((tickAnim - 0) / 8) * (-22.18805-(2.90132)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -38.76886 + (((tickAnim - 8) / 4) * (0.12245-(-38.76886)));
            yy = 12.20049 + (((tickAnim - 8) / 4) * (25.54833-(12.20049)));
            zz = -22.18805 + (((tickAnim - 8) / 4) * (4.43914-(-22.18805)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 0.12245 + (((tickAnim - 12) / 10) * (12.96552-(0.12245)));
            yy = 25.54833 + (((tickAnim - 12) / 10) * (-4.0393-(25.54833)));
            zz = 4.43914 + (((tickAnim - 12) / 10) * (2.90132-(4.43914)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.275-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.275 + (((tickAnim - 8) / 4) * (0-(-0.275)));
            yy = 0.5 + (((tickAnim - 8) / 4) * (0-(0.5)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 43.1466 + (((tickAnim - 0) / 3) * (89.9208-(43.1466)));
            yy = 0.14963 + (((tickAnim - 0) / 3) * (-0.13585-(0.14963)));
            zz = 4.50895 + (((tickAnim - 0) / 3) * (7.79491-(4.50895)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 89.9208 + (((tickAnim - 3) / 5) * (80.37069-(89.9208)));
            yy = -0.13585 + (((tickAnim - 3) / 5) * (-0.49269-(-0.13585)));
            zz = 7.79491 + (((tickAnim - 3) / 5) * (11.90235-(7.79491)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 80.37069 + (((tickAnim - 8) / 4) * (19.75-(80.37069)));
            yy = -0.49269 + (((tickAnim - 8) / 4) * (0-(-0.49269)));
            zz = 11.90235 + (((tickAnim - 8) / 4) * (0-(11.90235)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 19.75 + (((tickAnim - 12) / 4) * (-12.53889-(19.75)));
            yy = 0 + (((tickAnim - 12) / 4) * (0.86331-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (-3.70593-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -12.53889 + (((tickAnim - 16) / 6) * (43.1466-(-12.53889)));
            yy = 0.86331 + (((tickAnim - 16) / 6) * (0.14963-(0.86331)));
            zz = -3.70593 + (((tickAnim - 16) / 6) * (4.50895-(-3.70593)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.55 + (((tickAnim - 0) / 3) * (2.275-(1.55)));
            zz = 0.02 + (((tickAnim - 0) / 3) * (-1.07-(0.02)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 2.275 + (((tickAnim - 3) / 5) * (2.295-(2.275)));
            zz = -1.07 + (((tickAnim - 3) / 5) * (-1.075-(-1.07)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 2.295 + (((tickAnim - 8) / 4) * (0.275-(2.295)));
            zz = -1.075 + (((tickAnim - 8) / 4) * (0-(-1.075)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0.275 + (((tickAnim - 12) / 4) * (0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1-(0.275)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1 + (((tickAnim - 16) / 2) * (0.98-(0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-1)));
            zz = 0 + (((tickAnim - 16) / 2) * (0.01-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.98 + (((tickAnim - 18) / 4) * (1.55-(0.98)));
            zz = 0.01 + (((tickAnim - 18) / 4) * (0.02-(0.01)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -33.45671 + (((tickAnim - 0) / 11) * (62-(-33.45671)));
            yy = -6.33394 + (((tickAnim - 0) / 11) * (0-(-6.33394)));
            zz = -5.29699 + (((tickAnim - 0) / 11) * (0-(-5.29699)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 62 + (((tickAnim - 11) / 5) * (16.60362-(62)));
            yy = 0 + (((tickAnim - 11) / 5) * (-1.60602-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (13.28959-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 16.60362 + (((tickAnim - 16) / 6) * (-33.45671-(16.60362)));
            yy = -1.60602 + (((tickAnim - 16) / 6) * (-6.33394-(-1.60602)));
            zz = 13.28959 + (((tickAnim - 16) / 6) * (-5.29699-(13.28959)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 14.55492 + (((tickAnim - 0) / 11) * (39.02398-(14.55492)));
            yy = 40.10736 + (((tickAnim - 0) / 11) * (-28.13585-(40.10736)));
            zz = 20.19384 + (((tickAnim - 0) / 11) * (-1.48775-(20.19384)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 39.02398 + (((tickAnim - 11) / 5) * (-22.19719-(39.02398)));
            yy = -28.13585 + (((tickAnim - 11) / 5) * (-4.38194-(-28.13585)));
            zz = -1.48775 + (((tickAnim - 11) / 5) * (27.92953-(-1.48775)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -22.19719 + (((tickAnim - 16) / 6) * (14.55492-(-22.19719)));
            yy = -4.38194 + (((tickAnim - 16) / 6) * (40.10736-(-4.38194)));
            zz = 27.92953 + (((tickAnim - 16) / 6) * (20.19384-(27.92953)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0.225-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (0.35-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0.225 + (((tickAnim - 16) / 6) * (0-(0.225)));
            yy = 0.35 + (((tickAnim - 16) / 6) * (0-(0.35)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 3.22855 + (((tickAnim - 0) / 4) * (-17.80001-(3.22855)));
            yy = -14.58075 + (((tickAnim - 0) / 4) * (-12.18193-(-14.58075)));
            zz = 3.18044 + (((tickAnim - 0) / 4) * (-3.27385-(3.18044)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = -17.80001 + (((tickAnim - 4) / 7) * (9.65453-(-17.80001)));
            yy = -12.18193 + (((tickAnim - 4) / 7) * (1.32472-(-12.18193)));
            zz = -3.27385 + (((tickAnim - 4) / 7) * (2.49724-(-3.27385)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 9.65453 + (((tickAnim - 11) / 2) * (87.59428-(9.65453)));
            yy = 1.32472 + (((tickAnim - 11) / 2) * (10.38168-(1.32472)));
            zz = 2.49724 + (((tickAnim - 11) / 2) * (20.74603-(2.49724)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 87.59428 + (((tickAnim - 13) / 3) * (37.0547-(87.59428)));
            yy = 10.38168 + (((tickAnim - 13) / 3) * (-1.22333-(10.38168)));
            zz = 20.74603 + (((tickAnim - 13) / 3) * (-11.40382-(20.74603)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 37.0547 + (((tickAnim - 16) / 2) * (-9.51992-(37.0547)));
            yy = -1.22333 + (((tickAnim - 16) / 2) * (-7.43401-(-1.22333)));
            zz = -11.40382 + (((tickAnim - 16) / 2) * (-17.95336-(-11.40382)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -9.51992 + (((tickAnim - 18) / 4) * (3.22855-(-9.51992)));
            yy = -7.43401 + (((tickAnim - 18) / 4) * (-14.58075-(-7.43401)));
            zz = -17.95336 + (((tickAnim - 18) / 4) * (3.18044-(-17.95336)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 4) * (0.78-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = 0.78 + (((tickAnim - 4) / 7) * (0-(0.78)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (1.605-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0.185-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 1.605 + (((tickAnim - 13) / 3) * (1.075-(1.605)));
            zz = 0.185 + (((tickAnim - 13) / 3) * (0.025-(0.185)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0.625-(0)));
            yy = 1.075 + (((tickAnim - 16) / 2) * (0.09-(1.075)));
            zz = 0.025 + (((tickAnim - 16) / 2) * (0.01-(0.025)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0.625 + (((tickAnim - 18) / 4) * (0-(0.625)));
            yy = 0.09 + (((tickAnim - 18) / 4) * (0-(0.09)));
            zz = 0.01 + (((tickAnim - 18) / 4) * (0-(0.01)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-50))*-4), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-50))*4), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-50))*-4));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-50))*0.2);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-50))*-0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-100))*-0.5);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-200))*-5), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-200))*4), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-50))*-4));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-7), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.jaw.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-300))*-0.059),(float)1);


        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-150))*-4), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-100))*4), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-100))*4));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-200))*-3), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-150))*3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-150))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-250))*-2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-200))*5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-200))*4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-300))*-1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-200))*5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-250))*8));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSaharastega entity = (EntityPrehistoricFloraSaharastega) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (45.75-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 45.75 + (((tickAnim - 8) / 1) * (45.75-(45.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 45.75 + (((tickAnim - 9) / 4) * (0-(45.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSaharastega e = (EntityPrehistoricFloraSaharastega) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
