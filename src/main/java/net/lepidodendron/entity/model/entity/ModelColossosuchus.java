package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraColossosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelColossosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backLeftLeg4;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer backRightLeg4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;

    private ModelAnimator animator;

    public ModelColossosuchus() {
        this.textureWidth = 113;
        this.textureHeight = 113;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 8.25F, 18.75F);
        this.main.cubeList.add(new ModelBox(main, 31, 49, -4.5F, -1.75F, -4.75F, 9, 8, 9, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 18, 80, -2.0F, -2.75F, -3.75F, 4, 1, 8, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 2.25F, -3.75F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 64, 0, -5.0F, -4.5F, -6.0F, 10, 9, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 87, -2.5F, -5.5F, -6.0F, 5, 1, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -6.0F, -5.0F, -12.0F, 12, 10, 14, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 43, -3.0F, -6.0F, -12.0F, 6, 1, 14, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 24, -5.0F, -4.5F, -10.0F, 10, 9, 10, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 56, 70, -2.5F, -5.75F, -10.0F, 5, 2, 10, -0.01F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(5.0F, 1.6F, -8.0F);
        this.body3.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.6284F, 0.3272F, -0.4164F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 81, 83, -2.5F, -1.5F, -2.0F, 4, 9, 5, 0.0F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.0F, 6.5F, 0.025F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.7803F, 0.008F, 0.4902F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 0, 43, -2.0F, -0.5182F, -1.3821F, 3, 7, 4, 0.0F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 6.4818F, 1.1179F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.0873F, 0.0F, 0.0F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 35, 84, -2.5F, -1.0F, -6.5F, 4, 2, 7, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-5.0F, 1.6F, -8.0F);
        this.body3.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.6284F, -0.3272F, 0.4164F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 81, 83, -1.5F, -1.5F, -2.0F, 4, 9, 5, 0.0F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(0.0F, 6.5F, 0.025F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.7803F, -0.008F, -0.4902F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 0, 43, -1.0F, -0.5182F, -1.3821F, 3, 7, 4, 0.0F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 6.4818F, 1.1179F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.0873F, 0.0F, 0.0F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 35, 84, -1.5F, -1.0F, -6.5F, 4, 2, 7, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.5F, -9.0F);
        this.body3.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 77, 52, -3.5F, -3.25F, -6.0F, 7, 7, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.75F, -3.0F);
        this.neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 90, 71, -2.0F, -1.0F, -3.0F, 4, 2, 6, -0.001F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.5F, -5.0F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 81, 15, -3.0F, -2.5F, -5.0F, 6, 5, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.0F, -2.5F);
        this.neck2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 91, -1.5F, -0.45F, -2.5F, 3, 2, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 2.5F, -2.5F);
        this.neck2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 92, 26, -3.0F, -1.425F, -2.45F, 5, 2, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.2273F, -1.893F, -4.0028F);
        this.neck2.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 78, 42, -3.7273F, 0.393F, -4.9972F, 7, 2, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 17, 89, -3.2273F, -1.107F, -4.9972F, 6, 2, 5, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 30, 24, 1.7727F, -1.607F, -4.9972F, 1, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 30, 24, -3.2273F, -1.607F, -4.9972F, 1, 1, 2, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 92, 33, -2.7273F, 0.393F, -8.9972F, 5, 2, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 38, 10, -2.2273F, 1.393F, -10.9972F, 4, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 30, 27, -1.2273F, 0.393F, -9.9972F, 2, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 76, 72, -1.2273F, 1.393F, -20.9972F, 2, 1, 10, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.8273F, 2.7F, -21.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3491F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 101, -1.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.2F, 2.275F, -7.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.3665F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 94, 0.0544F, -0.119F, -2.2305F, 0, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.7F, 2.175F, -9.9F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.3142F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 95, 0.0567F, -0.1592F, -1.1F, 0, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.9545F, 2.0F, -16.15F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.4712F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 86, -0.1F, 0.0F, -4.9F, 0, 1, 10, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.1545F, 2.175F, -9.9F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.3142F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 95, -0.0567F, -0.1592F, -1.1F, 0, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.6545F, 2.275F, -7.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.3665F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 94, -0.0544F, -0.119F, -2.2305F, 0, 1, 4, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 2.0F, -16.15F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.4712F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 86, 0.1F, 0.0F, -4.9F, 0, 1, 10, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.2273F, 1.393F, -19.9972F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5236F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 28, -1.5F, 0.0F, -1.0F, 3, 2, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.2273F, 1.2232F, -10.6676F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.432F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 24, -1.0F, -0.525F, -1.625F, 2, 1, 3, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.7727F, 0.293F, -7.6722F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1178F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 56, 0, -2.5F, -0.4566F, -2.3308F, 3, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.2727F, -1.107F, -4.9972F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3927F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 54, 37, -2.5F, 0.0F, -4.0F, 4, 2, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.975F, -2.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0175F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 84, 65, -3.7273F, -0.6F, -3.0F, 7, 1, 5, 0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 14, 73, -2.7273F, -0.6F, -7.0F, 5, 1, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 54, -2.2273F, -0.6F, -9.0F, 4, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 78, 31, -1.2273F, -0.6F, -19.0F, 2, 1, 10, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.0F, -0.5F, -5.0F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.6109F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 57, 0.1F, -1.1F, -2.0F, 0, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.2F, -8.0F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.1396F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 2, 59, 1.7F, -1.4F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0545F, 0.0F, -13.0F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.2618F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, -8, 50, -0.1F, -1.4F, -6.0F, 0, 1, 10, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.4545F, -0.2F, -8.0F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.1396F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 2, 59, -1.7F, -1.4F, -1.0F, 0, 1, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.4545F, -0.5F, -5.0F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.6109F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 57, -0.1F, -1.1F, -2.0F, 0, 1, 4, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.6F, 0.0F, -13.0F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.2618F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, -8, 50, 0.1F, -1.4F, -6.0F, 0, 1, 10, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.2273F, 0.9F, -5.0F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1745F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 35, 93, -2.0F, -1.15F, -2.0F, 4, 1, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.2273F, 1.4F, 1.0F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0436F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 90, 0, -2.5F, -1.075F, -4.05F, 5, 1, 5, 0.0F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(3.75F, 1.5F, -0.65F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.6353F, -0.5747F, -0.6353F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 63, 82, -2.0F, -0.5F, -2.0F, 4, 9, 5, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.0F, 8.25F, -1.5F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.8613F, 0.0201F, 0.7387F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 0, 0, -1.5F, -0.254F, -0.4182F, 3, 9, 4, 0.0F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 8.246F, 1.5818F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, 0.0F, 0.0F, 0.096F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 26, 49, -1.5F, -0.5F, -2.0F, 3, 3, 4, -0.01F, false));

        this.backLeftLeg4 = new AdvancedModelRenderer(this);
        this.backLeftLeg4.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.backLeftLeg3.addChild(backLeftLeg4);
        this.setRotateAngle(backLeftLeg4, -0.0349F, -0.0008F, -0.0436F);
        this.backLeftLeg4.cubeList.add(new ModelBox(backLeftLeg4, 38, 0, -2.5F, -0.5F, -7.0F, 5, 2, 8, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-3.75F, 1.5F, -0.65F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.6353F, 0.5747F, 0.6353F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 63, 82, -2.0F, -0.5F, -2.0F, 4, 9, 5, 0.0F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(0.0F, 8.25F, -1.5F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.8613F, -0.0201F, -0.7387F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 0, 0, -1.5F, -0.254F, -0.4182F, 3, 9, 4, 0.0F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 8.246F, 1.5818F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, 0.0F, 0.0F, -0.096F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 26, 49, -1.5F, -0.5F, -2.0F, 3, 3, 4, -0.01F, true));

        this.backRightLeg4 = new AdvancedModelRenderer(this);
        this.backRightLeg4.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.backRightLeg3.addChild(backRightLeg4);
        this.setRotateAngle(backRightLeg4, -0.0349F, 0.0008F, 0.0436F);
        this.backRightLeg4.cubeList.add(new ModelBox(backRightLeg4, 38, 0, -2.5F, -0.5F, -7.0F, 5, 2, 8, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.25F, 3.25F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.2356F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 27, 30, -3.5F, 0.0F, 0.0F, 7, 6, 13, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 20, 66, -1.5F, -1.6F, 0.7F, 3, 2, 12, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.75F, 12.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2313F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 39, 11, -3.0F, -1.5F, 0.0F, 6, 5, 13, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 64, 16, -1.0F, -3.2F, 0.0F, 2, 2, 13, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 12.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 55, 54, -2.5F, -1.5F, 0.0F, 5, 4, 12, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 73, -0.5F, -3.3F, 0.0F, 1, 2, 12, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.5F, 11.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.3142F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 58, 37, -2.0F, -1.5F, 0.0F, 4, 3, 12, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 54, 21, 0.05F, -3.5F, 0.0F, 0, 2, 12, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.25F, 11.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 38, 70, -1.5F, -1.5F, 0.0F, 3, 2, 12, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 54, 24, 0.0F, -3.5F, 1.0F, 0, 2, 11, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.5F, 11.0F);
        this.tail5.addChild(tail6);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 58, -1.0F, -1.5F, 0.0F, 2, 1, 14, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 54, 18, -0.025F, -3.5F, 1.0F, 0, 2, 13, 0.0F, false));


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

        EntityPrehistoricFloraColossosuchus proteros = (EntityPrehistoricFloraColossosuchus) e;

        if(proteros.isReallyInWater()){
            this.main.offsetY = 0.5F;
        }
        this.faceTarget(f3, f4, 10, neck);
        this.faceTarget(f3, f4, 10, neck2);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
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
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
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
        EntityPrehistoricFloraColossosuchus ee = (EntityPrehistoricFloraColossosuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraColossosuchus entity = (EntityPrehistoricFloraColossosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (69.66595-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (19.32526-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-31.13819-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 69.66595 + (((tickAnim - 20) / 16) * (45.73277-(69.66595)));
            yy = 19.32526 + (((tickAnim - 20) / 16) * (10.66953-(19.32526)));
            zz = -31.13819 + (((tickAnim - 20) / 16) * (-46.78229-(-31.13819)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 45.73277 + (((tickAnim - 36) / 14) * (0-(45.73277)));
            yy = 10.66953 + (((tickAnim - 36) / 14) * (0-(10.66953)));
            zz = -46.78229 + (((tickAnim - 36) / 14) * (0-(-46.78229)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.40955-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-17.78182-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-16.40795-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 6.40955 + (((tickAnim - 20) / 16) * (-38.72327-(6.40955)));
            yy = -17.78182 + (((tickAnim - 20) / 16) * (-8.39697-(-17.78182)));
            zz = -16.40795 + (((tickAnim - 20) / 16) * (-7.7482-(-16.40795)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -38.72327 + (((tickAnim - 36) / 14) * (0-(-38.72327)));
            yy = -8.39697 + (((tickAnim - 36) / 14) * (0-(-8.39697)));
            zz = -7.7482 + (((tickAnim - 36) / 14) * (0-(-7.7482)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 20) / 16) * (0.775-(0)));
            yy = 0 + (((tickAnim - 20) / 16) * (1.525-(0)));
            zz = 0 + (((tickAnim - 20) / 16) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0.775 + (((tickAnim - 36) / 14) * (0-(0.775)));
            yy = 1.525 + (((tickAnim - 36) / 14) * (0-(1.525)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-19.43-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -19.43 + (((tickAnim - 10) / 10) * (80.75-(-19.43)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 80.75 + (((tickAnim - 20) / 16) * (95.63-(80.75)));
            yy = 0 + (((tickAnim - 20) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 16) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 95.63 + (((tickAnim - 36) / 14) * (0-(95.63)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 20) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 16) * (2.2-(0)));
            zz = 0 + (((tickAnim - 20) / 16) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 36) / 8) * (0-(0)));
            yy = 2.2 + (((tickAnim - 36) / 8) * (2.81-(2.2)));
            zz = 0 + (((tickAnim - 36) / 8) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 2.81 + (((tickAnim - 44) / 6) * (0-(2.81)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraColossosuchus entity = (EntityPrehistoricFloraColossosuchus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 2.75 + (((tickAnim - 20) / 20) * (0-(2.75)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 20) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 12 + (((tickAnim - 20) / 6) * (14-(12)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 14 + (((tickAnim - 26) / 9) * (0-(14)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraColossosuchus entity = (EntityPrehistoricFloraColossosuchus) entitylivingbaseIn;
        int animCycle = 560;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-6.175-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            yy = -6.175 + (((tickAnim - 30) / 470) * (-6.175-(-6.175)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            yy = -6.175 + (((tickAnim - 500) / 25) * (-3.175-(-6.175)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            yy = -3.175 + (((tickAnim - 525) / 35) * (0-(-3.175)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 30) * (-34.64316-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-8.84133-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-33.96825-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -34.64316 + (((tickAnim - 30) / 470) * (-34.64316-(-34.64316)));
            yy = -8.84133 + (((tickAnim - 30) / 470) * (-8.84133-(-8.84133)));
            zz = -33.96825 + (((tickAnim - 30) / 470) * (-33.96825-(-33.96825)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -34.64316 + (((tickAnim - 500) / 25) * (3.82909-(-34.64316)));
            yy = -8.84133 + (((tickAnim - 500) / 25) * (4.44346-(-8.84133)));
            zz = -33.96825 + (((tickAnim - 500) / 25) * (-44.96843-(-33.96825)));
        }
        else if (tickAnim >= 525 && tickAnim < 542) {
            xx = 3.82909 + (((tickAnim - 525) / 17) * (5.8068-(3.82909)));
            yy = 4.44346 + (((tickAnim - 525) / 17) * (-9.28377-(4.44346)));
            zz = -44.96843 + (((tickAnim - 525) / 17) * (-9.26479-(-44.96843)));
        }
        else if (tickAnim >= 542 && tickAnim < 560) {
            xx = 5.8068 + (((tickAnim - 542) / 18) * (0-(5.8068)));
            yy = -9.28377 + (((tickAnim - 542) / 18) * (0-(-9.28377)));
            zz = -9.26479 + (((tickAnim - 542) / 18) * (0-(-9.26479)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-52.65505-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-4.3484-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (14.23938-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -52.65505 + (((tickAnim - 22) / 8) * (-51.20664-(-52.65505)));
            yy = -4.3484 + (((tickAnim - 22) / 8) * (-9.0313-(-4.3484)));
            zz = 14.23938 + (((tickAnim - 22) / 8) * (29.5741-(14.23938)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -51.20664 + (((tickAnim - 30) / 470) * (-51.20664-(-51.20664)));
            yy = -9.0313 + (((tickAnim - 30) / 470) * (-9.0313-(-9.0313)));
            zz = 29.5741 + (((tickAnim - 30) / 470) * (29.5741-(29.5741)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -51.20664 + (((tickAnim - 500) / 25) * (-49.15981-(-51.20664)));
            yy = -9.0313 + (((tickAnim - 500) / 25) * (20.83727-(-9.0313)));
            zz = 29.5741 + (((tickAnim - 500) / 25) * (15.59751-(29.5741)));
        }
        else if (tickAnim >= 525 && tickAnim < 542) {
            xx = -49.15981 + (((tickAnim - 525) / 17) * (-15.73816-(-49.15981)));
            yy = 20.83727 + (((tickAnim - 525) / 17) * (20.25457-(20.83727)));
            zz = 15.59751 + (((tickAnim - 525) / 17) * (8.07254-(15.59751)));
        }
        else if (tickAnim >= 542 && tickAnim < 560) {
            xx = -15.73816 + (((tickAnim - 542) / 18) * (0-(-15.73816)));
            yy = 20.25457 + (((tickAnim - 542) / 18) * (0-(20.25457)));
            zz = 8.07254 + (((tickAnim - 542) / 18) * (0-(8.07254)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-0.325-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (1.28-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -0.325 + (((tickAnim - 22) / 8) * (0-(-0.325)));
            yy = -0.675 + (((tickAnim - 22) / 8) * (0-(-0.675)));
            zz = 1.28 + (((tickAnim - 22) / 8) * (1.775-(1.28)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 1.775 + (((tickAnim - 30) / 470) * (1.775-(1.775)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 1.775 + (((tickAnim - 500) / 25) * (0-(1.775)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (80.28431-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-7.97327-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0.65557-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 80.28431 + (((tickAnim - 22) / 8) * (83.25-(80.28431)));
            yy = -7.97327 + (((tickAnim - 22) / 8) * (0-(-7.97327)));
            zz = 0.65557 + (((tickAnim - 22) / 8) * (0-(0.65557)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 83.25 + (((tickAnim - 30) / 470) * (83.25-(83.25)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 83.25 + (((tickAnim - 500) / 25) * (79.5-(83.25)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 542) {
            xx = 79.5 + (((tickAnim - 525) / 17) * (11.23503-(79.5)));
            yy = 0 + (((tickAnim - 525) / 17) * (3.04012-(0)));
            zz = 0 + (((tickAnim - 525) / 17) * (-11.10432-(0)));
        }
        else if (tickAnim >= 542 && tickAnim < 560) {
            xx = 11.23503 + (((tickAnim - 542) / 18) * (0-(11.23503)));
            yy = 3.04012 + (((tickAnim - 542) / 18) * (0-(3.04012)));
            zz = -11.10432 + (((tickAnim - 542) / 18) * (0-(-11.10432)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (1.775-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0.425-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            yy = 1.775 + (((tickAnim - 30) / 470) * (1.775-(1.775)));
            zz = 0.425 + (((tickAnim - 30) / 470) * (0.425-(0.425)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            yy = 1.775 + (((tickAnim - 500) / 25) * (2.55-(1.775)));
            zz = 0.425 + (((tickAnim - 500) / 25) * (-1-(0.425)));
        }
        else if (tickAnim >= 525 && tickAnim < 542) {
            xx = 0 + (((tickAnim - 525) / 17) * (0-(0)));
            yy = 2.55 + (((tickAnim - 525) / 17) * (0-(2.55)));
            zz = -1 + (((tickAnim - 525) / 17) * (0-(-1)));
        }
        else if (tickAnim >= 542 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 542) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 542) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 542) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-34.64316-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (8.84133-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (33.96825-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -34.64316 + (((tickAnim - 30) / 470) * (-34.64316-(-34.64316)));
            yy = 8.84133 + (((tickAnim - 30) / 470) * (8.84133-(8.84133)));
            zz = 33.96825 + (((tickAnim - 30) / 470) * (33.96825-(33.96825)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -34.64316 + (((tickAnim - 500) / 25) * (-34.55204-(-34.64316)));
            yy = 8.84133 + (((tickAnim - 500) / 25) * (8.68859-(8.84133)));
            zz = 33.96825 + (((tickAnim - 500) / 25) * (29.87868-(33.96825)));
        }
        else if (tickAnim >= 525 && tickAnim < 543) {
            xx = -34.55204 + (((tickAnim - 525) / 18) * (-33.08675-(-34.55204)));
            yy = 8.68859 + (((tickAnim - 525) / 18) * (3.95684-(8.68859)));
            zz = 29.87868 + (((tickAnim - 525) / 18) * (21.12672-(29.87868)));
        }
        else if (tickAnim >= 543 && tickAnim < 552) {
            xx = -33.08675 + (((tickAnim - 543) / 9) * (-28.8704-(-33.08675)));
            yy = 3.95684 + (((tickAnim - 543) / 9) * (-6.44848-(3.95684)));
            zz = 21.12672 + (((tickAnim - 543) / 9) * (45.49636-(21.12672)));
        }
        else if (tickAnim >= 552 && tickAnim < 560) {
            xx = -28.8704 + (((tickAnim - 552) / 8) * (0-(-28.8704)));
            yy = -6.44848 + (((tickAnim - 552) / 8) * (0-(-6.44848)));
            zz = 45.49636 + (((tickAnim - 552) / 8) * (0-(45.49636)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-51.20664-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (9.0313-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-29.5741-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -51.20664 + (((tickAnim - 30) / 470) * (-51.20664-(-51.20664)));
            yy = 9.0313 + (((tickAnim - 30) / 470) * (9.0313-(9.0313)));
            zz = -29.5741 + (((tickAnim - 30) / 470) * (-29.5741-(-29.5741)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -51.20664 + (((tickAnim - 500) / 25) * (-14.58073-(-51.20664)));
            yy = 9.0313 + (((tickAnim - 500) / 25) * (14.22687-(9.0313)));
            zz = -29.5741 + (((tickAnim - 500) / 25) * (-33.15475-(-29.5741)));
        }
        else if (tickAnim >= 525 && tickAnim < 543) {
            xx = -14.58073 + (((tickAnim - 525) / 18) * (-3.63663-(-14.58073)));
            yy = 14.22687 + (((tickAnim - 525) / 18) * (23.51786-(14.22687)));
            zz = -33.15475 + (((tickAnim - 525) / 18) * (-2.54161-(-33.15475)));
        }
        else if (tickAnim >= 543 && tickAnim < 560) {
            xx = -3.63663 + (((tickAnim - 543) / 17) * (0-(-3.63663)));
            yy = 23.51786 + (((tickAnim - 543) / 17) * (0-(23.51786)));
            zz = -2.54161 + (((tickAnim - 543) / 17) * (0-(-2.54161)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (1.775-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 1.775 + (((tickAnim - 30) / 470) * (1.775-(1.775)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 1.775 + (((tickAnim - 500) / 25) * (0-(1.775)));
        }
        else if (tickAnim >= 525 && tickAnim < 552) {
            xx = 0 + (((tickAnim - 525) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 525) / 27) * (1.425-(0)));
            zz = 0 + (((tickAnim - 525) / 27) * (1.275-(0)));
        }
        else if (tickAnim >= 552 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 552) / 8) * (0-(0)));
            yy = 1.425 + (((tickAnim - 552) / 8) * (0-(1.425)));
            zz = 1.275 + (((tickAnim - 552) / 8) * (0-(1.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (83.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 83.25 + (((tickAnim - 30) / 470) * (83.25-(83.25)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 83.25 + (((tickAnim - 500) / 25) * (45.52448-(83.25)));
            yy = 0 + (((tickAnim - 500) / 25) * (-5.60833-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (4.60183-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 543) {
            xx = 45.52448 + (((tickAnim - 525) / 18) * (35.00749-(45.52448)));
            yy = -5.60833 + (((tickAnim - 525) / 18) * (8.95665-(-5.60833)));
            zz = 4.60183 + (((tickAnim - 525) / 18) * (-15.13162-(4.60183)));
        }
        else if (tickAnim >= 543 && tickAnim < 552) {
            xx = 35.00749 + (((tickAnim - 543) / 9) * (79.75749-(35.00749)));
            yy = 8.95665 + (((tickAnim - 543) / 9) * (8.95665-(8.95665)));
            zz = -15.13162 + (((tickAnim - 543) / 9) * (-15.13162-(-15.13162)));
        }
        else if (tickAnim >= 552 && tickAnim < 560) {
            xx = 79.75749 + (((tickAnim - 552) / 8) * (0-(79.75749)));
            yy = 8.95665 + (((tickAnim - 552) / 8) * (0-(8.95665)));
            zz = -15.13162 + (((tickAnim - 552) / 8) * (0-(-15.13162)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (1.775-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0.425-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            yy = 1.775 + (((tickAnim - 30) / 470) * (1.775-(1.775)));
            zz = 0.425 + (((tickAnim - 30) / 470) * (0.425-(0.425)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            yy = 1.775 + (((tickAnim - 500) / 25) * (0-(1.775)));
            zz = 0.425 + (((tickAnim - 500) / 25) * (-1.375-(0.425)));
        }
        else if (tickAnim >= 525 && tickAnim < 543) {
            xx = 0 + (((tickAnim - 525) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 525) / 18) * (0-(0)));
            zz = -1.375 + (((tickAnim - 525) / 18) * (0-(-1.375)));
        }
        else if (tickAnim >= 543 && tickAnim < 552) {
            xx = 0 + (((tickAnim - 543) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 543) / 9) * (2.175-(0)));
            zz = 0 + (((tickAnim - 543) / 9) * (0-(0)));
        }
        else if (tickAnim >= 552 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 552) / 8) * (0-(0)));
            yy = 2.175 + (((tickAnim - 552) / 8) * (0-(2.175)));
            zz = 0 + (((tickAnim - 552) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 89) {
            xx = -11.75 + (((tickAnim - 30) / 59) * (-11.75-(-11.75)));
            yy = 0 + (((tickAnim - 30) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 59) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 90) {
            xx = -11.75 + (((tickAnim - 89) / 1) * (-14.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+70))*-3-(-11.75)));
            yy = 0 + (((tickAnim - 89) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 1) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 130) {
            xx = -14.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+70))*-3 + (((tickAnim - 90) / 40) * (-15.5-(-14.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+70))*-3)));
            yy = 0 + (((tickAnim - 90) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 40) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 500) {
            xx = -15.5 + (((tickAnim - 130) / 370) * (-11.75-(-15.5)));
            yy = 0 + (((tickAnim - 130) / 370) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 370) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -11.75 + (((tickAnim - 500) / 25) * (-15.5-(-11.75)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -15.5 + (((tickAnim - 525) / 35) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 89) {
            xx = 5.5 + (((tickAnim - 30) / 59) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 30) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 59) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 90) {
            xx = 5.5 + (((tickAnim - 89) / 1) * (5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-5-(5.5)));
            yy = 0 + (((tickAnim - 89) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 1) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 130) {
            xx = 5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-5 + (((tickAnim - 90) / 40) * (0.75-(5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-5)));
            yy = 0 + (((tickAnim - 90) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 40) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 500) {
            xx = 0.75 + (((tickAnim - 130) / 370) * (-8.5-(0.75)));
            yy = 0 + (((tickAnim - 130) / 370) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 370) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 540) {
            xx = -8.5 + (((tickAnim - 500) / 40) * (14.25-(-8.5)));
            yy = 0 + (((tickAnim - 500) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 40) * (0-(0)));
        }
        else if (tickAnim >= 540 && tickAnim < 560) {
            xx = 14.25 + (((tickAnim - 540) / 20) * (0-(14.25)));
            yy = 0 + (((tickAnim - 540) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 540) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 87 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 87) / 1) * (3.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*20-(0)));
            yy = 0 + (((tickAnim - 87) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 1) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 130) {
            xx = 3.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*20 + (((tickAnim - 88) / 42) * (19.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.5))*0.2-(3.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*20)));
            yy = 0 + (((tickAnim - 88) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 42) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 500) {
            xx = 19.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.5))*0.2 + (((tickAnim - 130) / 370) * (30-(19.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.5))*0.2)));
            yy = 0 + (((tickAnim - 130) / 370) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 370) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 512) {
            xx = 30 + (((tickAnim - 500) / 12) * (0-(30)));
            yy = 0 + (((tickAnim - 500) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-37.24582-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-22.8013-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (10.35442-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -37.24582 + (((tickAnim - 30) / 470) * (-37.24582-(-37.24582)));
            yy = -22.8013 + (((tickAnim - 30) / 470) * (-22.8013-(-22.8013)));
            zz = 10.35442 + (((tickAnim - 30) / 470) * (10.35442-(10.35442)));
        }
        else if (tickAnim >= 500 && tickAnim < 560) {
            xx = -37.24582 + (((tickAnim - 500) / 60) * (0-(-37.24582)));
            yy = -22.8013 + (((tickAnim - 500) / 60) * (0-(-22.8013)));
            zz = 10.35442 + (((tickAnim - 500) / 60) * (0-(10.35442)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (28.36994-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-6.78195-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (4.74239-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 28.36994 + (((tickAnim - 30) / 470) * (28.36994-(28.36994)));
            yy = -6.78195 + (((tickAnim - 30) / 470) * (-6.78195-(-6.78195)));
            zz = 4.74239 + (((tickAnim - 30) / 470) * (4.74239-(4.74239)));
        }
        else if (tickAnim >= 500 && tickAnim < 560) {
            xx = 28.36994 + (((tickAnim - 500) / 60) * (0-(28.36994)));
            yy = -6.78195 + (((tickAnim - 500) / 60) * (0-(-6.78195)));
            zz = 4.74239 + (((tickAnim - 500) / 60) * (0-(4.74239)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(0);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(0);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(0);


        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(0), backLeftLeg3.rotateAngleY + (float) Math.toRadians(0), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(0);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(0);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 7.75 + (((tickAnim - 30) / 470) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 560) {
            xx = 7.75 + (((tickAnim - 500) / 60) * (0-(7.75)));
            yy = 0 + (((tickAnim - 500) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            yy = 0.85 + (((tickAnim - 30) / 470) * (0.85-(0.85)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 533) {
            xx = 0 + (((tickAnim - 500) / 33) * (0-(0)));
            yy = 0.85 + (((tickAnim - 500) / 33) * (0-(0.85)));
            zz = 0 + (((tickAnim - 500) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-37.24582-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (22.8013-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-10.35442-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -37.24582 + (((tickAnim - 30) / 470) * (-37.24582-(-37.24582)));
            yy = 22.8013 + (((tickAnim - 30) / 470) * (22.8013-(22.8013)));
            zz = -10.35442 + (((tickAnim - 30) / 470) * (-10.35442-(-10.35442)));
        }
        else if (tickAnim >= 500 && tickAnim < 560) {
            xx = -37.24582 + (((tickAnim - 500) / 60) * (0-(-37.24582)));
            yy = 22.8013 + (((tickAnim - 500) / 60) * (0-(22.8013)));
            zz = -10.35442 + (((tickAnim - 500) / 60) * (0-(-10.35442)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (28.36994-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (6.78195-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-4.74239-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 28.36994 + (((tickAnim - 30) / 470) * (28.36994-(28.36994)));
            yy = 6.78195 + (((tickAnim - 30) / 470) * (6.78195-(6.78195)));
            zz = -4.74239 + (((tickAnim - 30) / 470) * (-4.74239-(-4.74239)));
        }
        else if (tickAnim >= 500 && tickAnim < 560) {
            xx = 28.36994 + (((tickAnim - 500) / 60) * (0-(28.36994)));
            yy = 6.78195 + (((tickAnim - 500) / 60) * (0-(6.78195)));
            zz = -4.74239 + (((tickAnim - 500) / 60) * (0-(-4.74239)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(0);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(0);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 7.75 + (((tickAnim - 30) / 470) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 560) {
            xx = 7.75 + (((tickAnim - 500) / 60) * (0-(7.75)));
            yy = 0 + (((tickAnim - 500) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            yy = 0.85 + (((tickAnim - 30) / 470) * (0.85-(0.85)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 533) {
            xx = 0 + (((tickAnim - 500) / 33) * (0-(0)));
            yy = 0.85 + (((tickAnim - 500) / 33) * (0-(0.85)));
            zz = 0 + (((tickAnim - 500) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 17.5 + (((tickAnim - 30) / 470) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 17.5 + (((tickAnim - 500) / 25) * (6.5-(17.5)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 6.5 + (((tickAnim - 525) / 35) * (0-(6.5)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -7.5 + (((tickAnim - 30) / 470) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -7.5 + (((tickAnim - 500) / 25) * (6.25-(-7.5)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 6.25 + (((tickAnim - 525) / 35) * (0-(6.25)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -5.5 + (((tickAnim - 30) / 470) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 560) {
            xx = -5.5 + (((tickAnim - 500) / 60) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 500) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -5 + (((tickAnim - 30) / 470) * (-5-(-5)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -5 + (((tickAnim - 500) / 25) * (-7.25-(-5)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -7.25 + (((tickAnim - 525) / 35) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -0.5 + (((tickAnim - 30) / 470) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -0.5 + (((tickAnim - 500) / 25) * (-5.5-(-0.5)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -5.5 + (((tickAnim - 525) / 35) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraColossosuchus entity = (EntityPrehistoricFloraColossosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-6.825-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -6.825 + (((tickAnim - 20) / 10) * (-6.825-(-6.825)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -6.825 + (((tickAnim - 30) / 20) * (0-(-6.825)));
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
            zz = 0 + (((tickAnim - 0) / 20) * (-28.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -28.75 + (((tickAnim - 20) / 10) * (-28.75-(-28.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -28.75 + (((tickAnim - 30) / 20) * (0-(-28.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.35-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1.35 + (((tickAnim - 20) / 10) * (1.35-(1.35)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1.35 + (((tickAnim - 30) / 20) * (0-(1.35)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.67665-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-8.47676-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (23.78606-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.67665 + (((tickAnim - 20) / 10) * (-1.67665-(-1.67665)));
            yy = -8.47676 + (((tickAnim - 20) / 10) * (-8.47676-(-8.47676)));
            zz = 23.78606 + (((tickAnim - 20) / 10) * (23.78606-(23.78606)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.67665 + (((tickAnim - 30) / 20) * (0-(-1.67665)));
            yy = -8.47676 + (((tickAnim - 30) / 20) * (0-(-8.47676)));
            zz = 23.78606 + (((tickAnim - 30) / 20) * (0-(23.78606)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.55-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.525 + (((tickAnim - 20) / 10) * (0.525-(0.525)));
            yy = 2.55 + (((tickAnim - 20) / 10) * (2.55-(2.55)));
            zz = -0.5 + (((tickAnim - 20) / 10) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0.525 + (((tickAnim - 30) / 20) * (0-(0.525)));
            yy = 2.55 + (((tickAnim - 30) / 20) * (0-(2.55)));
            zz = -0.5 + (((tickAnim - 30) / 20) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (28.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 28.75 + (((tickAnim - 20) / 10) * (28.75-(28.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 28.75 + (((tickAnim - 30) / 20) * (0-(28.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.35-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.35 + (((tickAnim - 20) / 10) * (-1.35-(-1.35)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.35 + (((tickAnim - 30) / 20) * (0-(-1.35)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.67665-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (8.47676-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-23.78606-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.67665 + (((tickAnim - 20) / 10) * (-1.67665-(-1.67665)));
            yy = 8.47676 + (((tickAnim - 20) / 10) * (8.47676-(8.47676)));
            zz = -23.78606 + (((tickAnim - 20) / 10) * (-23.78606-(-23.78606)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.67665 + (((tickAnim - 30) / 20) * (0-(-1.67665)));
            yy = 8.47676 + (((tickAnim - 30) / 20) * (0-(8.47676)));
            zz = -23.78606 + (((tickAnim - 30) / 20) * (0-(-23.78606)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.55-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.525 + (((tickAnim - 20) / 10) * (0.525-(0.525)));
            yy = 2.55 + (((tickAnim - 20) / 10) * (2.55-(2.55)));
            zz = -0.5 + (((tickAnim - 20) / 10) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0.525 + (((tickAnim - 30) / 20) * (0-(0.525)));
            yy = 2.55 + (((tickAnim - 30) / 20) * (0-(2.55)));
            zz = -0.5 + (((tickAnim - 30) / 20) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -13.75 + (((tickAnim - 20) / 10) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -13.75 + (((tickAnim - 30) / 20) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9.25 + (((tickAnim - 20) / 10) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 30) / 20) * (0-(9.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-25.60841-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5.36059-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-6.54547-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -25.60841 + (((tickAnim - 20) / 10) * (-25.60841-(-25.60841)));
            yy = -5.36059 + (((tickAnim - 20) / 10) * (-5.36059-(-5.36059)));
            zz = -6.54547 + (((tickAnim - 20) / 10) * (-6.54547-(-6.54547)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -25.60841 + (((tickAnim - 30) / 20) * (0-(-25.60841)));
            yy = -5.36059 + (((tickAnim - 30) / 20) * (0-(-5.36059)));
            zz = -6.54547 + (((tickAnim - 30) / 20) * (0-(-6.54547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (29.54949-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-14.10947-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (8.11649-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29.54949 + (((tickAnim - 20) / 10) * (29.54949-(29.54949)));
            yy = -14.10947 + (((tickAnim - 20) / 10) * (-14.10947-(-14.10947)));
            zz = 8.11649 + (((tickAnim - 20) / 10) * (8.11649-(8.11649)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 29.54949 + (((tickAnim - 30) / 20) * (0-(29.54949)));
            yy = -14.10947 + (((tickAnim - 30) / 20) * (0-(-14.10947)));
            zz = 8.11649 + (((tickAnim - 30) / 20) * (0-(8.11649)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9.05552-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.28004-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (6.73436-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9.05552 + (((tickAnim - 20) / 10) * (-9.05552-(-9.05552)));
            yy = -1.28004 + (((tickAnim - 20) / 10) * (-1.28004-(-1.28004)));
            zz = 6.73436 + (((tickAnim - 20) / 10) * (6.73436-(6.73436)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9.05552 + (((tickAnim - 30) / 20) * (0-(-9.05552)));
            yy = -1.28004 + (((tickAnim - 30) / 20) * (0-(-1.28004)));
            zz = 6.73436 + (((tickAnim - 30) / 20) * (0-(6.73436)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.15-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 2.15 + (((tickAnim - 20) / 10) * (2.15-(2.15)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 2.15 + (((tickAnim - 30) / 20) * (0-(2.15)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-25.60841-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (5.36059-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (6.54547-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -25.60841 + (((tickAnim - 20) / 10) * (-25.60841-(-25.60841)));
            yy = 5.36059 + (((tickAnim - 20) / 10) * (5.36059-(5.36059)));
            zz = 6.54547 + (((tickAnim - 20) / 10) * (6.54547-(6.54547)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -25.60841 + (((tickAnim - 30) / 20) * (0-(-25.60841)));
            yy = 5.36059 + (((tickAnim - 30) / 20) * (0-(5.36059)));
            zz = 6.54547 + (((tickAnim - 30) / 20) * (0-(6.54547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (29.54949-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (14.10947-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-8.11649-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29.54949 + (((tickAnim - 20) / 10) * (29.54949-(29.54949)));
            yy = 14.10947 + (((tickAnim - 20) / 10) * (14.10947-(14.10947)));
            zz = -8.11649 + (((tickAnim - 20) / 10) * (-8.11649-(-8.11649)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 29.54949 + (((tickAnim - 30) / 20) * (0-(29.54949)));
            yy = 14.10947 + (((tickAnim - 30) / 20) * (0-(14.10947)));
            zz = -8.11649 + (((tickAnim - 30) / 20) * (0-(-8.11649)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9.05552-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.28004-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (6.73436-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9.05552 + (((tickAnim - 20) / 10) * (-9.05552-(-9.05552)));
            yy = -1.28004 + (((tickAnim - 20) / 10) * (-1.28004-(-1.28004)));
            zz = 6.73436 + (((tickAnim - 20) / 10) * (6.73436-(6.73436)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9.05552 + (((tickAnim - 30) / 20) * (0-(-9.05552)));
            yy = -1.28004 + (((tickAnim - 30) / 20) * (0-(-1.28004)));
            zz = 6.73436 + (((tickAnim - 30) / 20) * (0-(6.73436)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.15-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 2.15 + (((tickAnim - 20) / 10) * (2.15-(2.15)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 2.15 + (((tickAnim - 30) / 20) * (0-(2.15)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4.25 + (((tickAnim - 20) / 10) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 4.25 + (((tickAnim - 30) / 20) * (0-(4.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5.75 + (((tickAnim - 20) / 10) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 30) / 20) * (0-(5.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 20) / 10) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 30) / 20) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraColossosuchus entity = (EntityPrehistoricFloraColossosuchus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.75 + (((tickAnim - 3) / 5) * (-0.5-(1.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.5 + (((tickAnim - 8) / 2) * (6.25-(-0.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6.25 + (((tickAnim - 10) / 3) * (0-(6.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -7.75 + (((tickAnim - 3) / 5) * (-27.09589-(-7.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (-1.5989-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-5.46242-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -27.09589 + (((tickAnim - 8) / 5) * (0-(-27.09589)));
            yy = -1.5989 + (((tickAnim - 8) / 5) * (0-(-1.5989)));
            zz = -5.46242 + (((tickAnim - 8) / 5) * (0-(-5.46242)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 3.25 + (((tickAnim - 3) / 5) * (31-(3.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 31 + (((tickAnim - 8) / 2) * (0-(31)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraColossosuchus entity = (EntityPrehistoricFloraColossosuchus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*1.5), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-0.2);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*0.5), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*-0.5), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-1), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(15.5), frontLeftLeg.rotateAngleY + (float) Math.toRadians(0), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(0));
        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(-1.1);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(0);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(0);


        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(71.33723), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(7.81915), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(-15.15123));
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(0);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(0);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(0);


        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(138.65506), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(-85.1097), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(-30.41243));
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(-0.6);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(0);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(0);


        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(15.5), frontRightLeg.rotateAngleY + (float) Math.toRadians(0), frontRightLeg.rotateAngleZ + (float) Math.toRadians(0));
        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(1.1);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(0);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(0);


        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(71.33723), frontRightLeg2.rotateAngleY + (float) Math.toRadians(-7.81915), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(15.15123));
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(0);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(0);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(0);


        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(115.2762), frontRightLeg3.rotateAngleY + (float) Math.toRadians(86.64621), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(6.97667));
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(0.6);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(0);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(0);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*1), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-300))*1), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(80.6695+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-2), backLeftLeg.rotateAngleY + (float) Math.toRadians(13.12067), backLeftLeg.rotateAngleZ + (float) Math.toRadians(-29.82136));
        this.backLeftLeg.rotationPointX = this.backLeftLeg.rotationPointX + (float)(-1.125);
        this.backLeftLeg.rotationPointY = this.backLeftLeg.rotationPointY - (float)(0);
        this.backLeftLeg.rotationPointZ = this.backLeftLeg.rotationPointZ + (float)(0);


        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(-15.35996), backLeftLeg2.rotateAngleY + (float) Math.toRadians(9.86686), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(-48.10514));


        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(95.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-4), backLeftLeg3.rotateAngleY + (float) Math.toRadians(0), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(0);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(0);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(-0.65);


        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-4), backLeftLeg4.rotateAngleY + (float) Math.toRadians(0), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(0));
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(0);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(1.725);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(0);


        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(78.4195+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2), backRightLeg.rotateAngleY + (float) Math.toRadians(-13.12067), backRightLeg.rotateAngleZ + (float) Math.toRadians(29.82136));
        this.backRightLeg.rotationPointX = this.backRightLeg.rotationPointX + (float)(1.125);
        this.backRightLeg.rotationPointY = this.backRightLeg.rotationPointY - (float)(0);
        this.backRightLeg.rotationPointZ = this.backRightLeg.rotationPointZ + (float)(0);


        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(-13.85996), backRightLeg2.rotateAngleY + (float) Math.toRadians(-9.86686), backRightLeg2.rotateAngleZ + (float) Math.toRadians(48.10514));


        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(95.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*4), backRightLeg3.rotateAngleY + (float) Math.toRadians(0), backRightLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(0);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(0);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(-0.65);


        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-4), backRightLeg4.rotateAngleY + (float) Math.toRadians(0), backRightLeg4.rotateAngleZ + (float) Math.toRadians(0));
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(0);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(1.725);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(0);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(7.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*3), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(7.25), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+20))*-5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(3.5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-8), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-12.75), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*11), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-4), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*14), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-1.5), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+250))*-17), tail6.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraColossosuchus entity = (EntityPrehistoricFloraColossosuchus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 22.31104 + (((tickAnim - 0) / 8) * (-25.10292-(22.31104)));
            yy = -6.39982 + (((tickAnim - 0) / 8) * (-17.10699-(-6.39982)));
            zz = 5.81032 + (((tickAnim - 0) / 8) * (-43.67026-(5.81032)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -25.10292 + (((tickAnim - 8) / 10) * (-54.1014-(-25.10292)));
            yy = -17.10699 + (((tickAnim - 8) / 10) * (-10.4132-(-17.10699)));
            zz = -43.67026 + (((tickAnim - 8) / 10) * (-7.56205-(-43.67026)));
        }
        else if (tickAnim >= 18 && tickAnim < 60) {
            xx = -54.1014 + (((tickAnim - 18) / 42) * (22.31104-(-54.1014)));
            yy = -10.4132 + (((tickAnim - 18) / 42) * (-6.39982-(-10.4132)));
            zz = -7.56205 + (((tickAnim - 18) / 42) * (5.81032-(-7.56205)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 25.85681 + (((tickAnim - 0) / 13) * (-17.13482-(25.85681)));
            yy = 10.05329 + (((tickAnim - 0) / 13) * (-18.16902-(10.05329)));
            zz = -11.55761 + (((tickAnim - 0) / 13) * (13.54266-(-11.55761)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -17.13482 + (((tickAnim - 13) / 5) * (14.27278-(-17.13482)));
            yy = -18.16902 + (((tickAnim - 13) / 5) * (-12.21307-(-18.16902)));
            zz = 13.54266 + (((tickAnim - 13) / 5) * (-3.99534-(13.54266)));
        }
        else if (tickAnim >= 18 && tickAnim < 60) {
            xx = 14.27278 + (((tickAnim - 18) / 42) * (25.85681-(14.27278)));
            yy = -12.21307 + (((tickAnim - 18) / 42) * (10.05329-(-12.21307)));
            zz = -3.99534 + (((tickAnim - 18) / 42) * (-11.55761-(-3.99534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.62-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0.62 + (((tickAnim - 3) / 10) * (0.375-(0.62)));
            zz = 0 + (((tickAnim - 3) / 10) * (1.1-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 13) / 5) * (0-(0.375)));
            zz = 1.1 + (((tickAnim - 13) / 5) * (0-(1.1)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 18) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 20) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 56.75 + (((tickAnim - 0) / 3) * (112.78557-(56.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.7792-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.14579-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 112.78557 + (((tickAnim - 3) / 10) * (95.3209-(112.78557)));
            yy = -0.7792 + (((tickAnim - 3) / 10) * (-2.92201-(-0.7792)));
            zz = 0.14579 + (((tickAnim - 3) / 10) * (0.54672-(0.14579)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 95.3209 + (((tickAnim - 13) / 5) * (38.20597-(95.3209)));
            yy = -2.92201 + (((tickAnim - 13) / 5) * (-6.42842-(-2.92201)));
            zz = 0.54672 + (((tickAnim - 13) / 5) * (1.20278-(0.54672)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = 38.20597 + (((tickAnim - 18) / 20) * (-1.75-(38.20597)));
            yy = -6.42842 + (((tickAnim - 18) / 20) * (0-(-6.42842)));
            zz = 1.20278 + (((tickAnim - 18) / 20) * (6-(1.20278)));
        }
        else if (tickAnim >= 38 && tickAnim < 49) {
            xx = -1.75 + (((tickAnim - 38) / 11) * (-9.5-(-1.75)));
            yy = 0 + (((tickAnim - 38) / 11) * (0-(0)));
            zz = 6 + (((tickAnim - 38) / 11) * (3-(6)));
        }
        else if (tickAnim >= 49 && tickAnim < 60) {
            xx = -9.5 + (((tickAnim - 49) / 11) * (56.75-(-9.5)));
            yy = 0 + (((tickAnim - 49) / 11) * (0-(0)));
            zz = 3 + (((tickAnim - 49) / 11) * (0-(3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 2.275 + (((tickAnim - 0) / 3) * (3.39-(2.275)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.225-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 3.39 + (((tickAnim - 3) / 10) * (2.87-(3.39)));
            zz = -1.225 + (((tickAnim - 3) / 10) * (-0.955-(-1.225)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 2.87 + (((tickAnim - 13) / 5) * (0.675-(2.87)));
            zz = -0.955 + (((tickAnim - 13) / 5) * (0.7-(-0.955)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0.675 + (((tickAnim - 18) / 10) * (1.305-(0.675)));
            zz = 0.7 + (((tickAnim - 18) / 10) * (0.54-(0.7)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            yy = 1.305 + (((tickAnim - 28) / 10) * (1.01-(1.305)));
            zz = 0.54 + (((tickAnim - 28) / 10) * (0.36-(0.54)));
        }
        else if (tickAnim >= 38 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 38) / 11) * (0-(0)));
            yy = 1.01 + (((tickAnim - 38) / 11) * (0.215-(1.01)));
            zz = 0.36 + (((tickAnim - 38) / 11) * (0.18-(0.36)));
        }
        else if (tickAnim >= 49 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 49) / 11) * (0-(0)));
            yy = 0.215 + (((tickAnim - 49) / 11) * (2.275-(0.215)));
            zz = 0.18 + (((tickAnim - 49) / 11) * (0-(0.18)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = -25.49491 + (((tickAnim - 0) / 27) * (22.31104-(-25.49491)));
            yy = 11.05362 + (((tickAnim - 0) / 27) * (6.39982-(11.05362)));
            zz = 16.40372 + (((tickAnim - 0) / 27) * (-5.81032-(16.40372)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 22.31104 + (((tickAnim - 27) / 7) * (-25.10292-(22.31104)));
            yy = 6.39982 + (((tickAnim - 27) / 7) * (17.10699-(6.39982)));
            zz = -5.81032 + (((tickAnim - 27) / 7) * (43.67026-(-5.81032)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = -25.10292 + (((tickAnim - 34) / 9) * (-54.1014-(-25.10292)));
            yy = 17.10699 + (((tickAnim - 34) / 9) * (10.4132-(17.10699)));
            zz = 43.67026 + (((tickAnim - 34) / 9) * (7.56205-(43.67026)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -54.1014 + (((tickAnim - 43) / 17) * (-25.49491-(-54.1014)));
            yy = 10.4132 + (((tickAnim - 43) / 17) * (11.05362-(10.4132)));
            zz = 7.56205 + (((tickAnim - 43) / 17) * (16.40372-(7.56205)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 21.09201 + (((tickAnim - 0) / 27) * (25.85681-(21.09201)));
            yy = 0.60767 + (((tickAnim - 0) / 27) * (-10.05329-(0.60767)));
            zz = -11.1525 + (((tickAnim - 0) / 27) * (11.55761-(-11.1525)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 25.85681 + (((tickAnim - 27) / 11) * (-17.13482-(25.85681)));
            yy = -10.05329 + (((tickAnim - 27) / 11) * (18.16902-(-10.05329)));
            zz = 11.55761 + (((tickAnim - 27) / 11) * (-13.54266-(11.55761)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -17.13482 + (((tickAnim - 38) / 5) * (14.27278-(-17.13482)));
            yy = 18.16902 + (((tickAnim - 38) / 5) * (12.21307-(18.16902)));
            zz = -13.54266 + (((tickAnim - 38) / 5) * (3.99534-(-13.54266)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 14.27278 + (((tickAnim - 43) / 17) * (21.09201-(14.27278)));
            yy = 12.21307 + (((tickAnim - 43) / 17) * (0.60767-(12.21307)));
            zz = 3.99534 + (((tickAnim - 43) / 17) * (-11.1525-(3.99534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 3) * (0.62-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0.62 + (((tickAnim - 30) / 8) * (0.375-(0.62)));
            zz = 0 + (((tickAnim - 30) / 8) * (1.1-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 38) / 5) * (0-(0.375)));
            zz = 1.1 + (((tickAnim - 38) / 5) * (0-(1.1)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 6.48466 + (((tickAnim - 0) / 27) * (56.75-(6.48466)));
            yy = 0.59784 + (((tickAnim - 0) / 27) * (0-(0.59784)));
            zz = -2.93988 + (((tickAnim - 0) / 27) * (0-(-2.93988)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 56.75 + (((tickAnim - 27) / 3) * (112.78557-(56.75)));
            yy = 0 + (((tickAnim - 27) / 3) * (-0.7792-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0.14579-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 112.78557 + (((tickAnim - 30) / 8) * (95.3209-(112.78557)));
            yy = -0.7792 + (((tickAnim - 30) / 8) * (-2.92201-(-0.7792)));
            zz = 0.14579 + (((tickAnim - 30) / 8) * (0.54672-(0.14579)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 95.3209 + (((tickAnim - 38) / 5) * (38.20597-(95.3209)));
            yy = -2.92201 + (((tickAnim - 38) / 5) * (6.42842-(-2.92201)));
            zz = 0.54672 + (((tickAnim - 38) / 5) * (-1.20278-(0.54672)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 38.20597 + (((tickAnim - 43) / 17) * (6.48466-(38.20597)));
            yy = 6.42842 + (((tickAnim - 43) / 17) * (0.59784-(6.42842)));
            zz = -1.20278 + (((tickAnim - 43) / 17) * (-2.93988-(-1.20278)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0.425 + (((tickAnim - 0) / 27) * (2.275-(0.425)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 2.275 + (((tickAnim - 27) / 3) * (3.39-(2.275)));
            zz = 0 + (((tickAnim - 27) / 3) * (-1.225-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 3.39 + (((tickAnim - 30) / 8) * (2.87-(3.39)));
            zz = -1.225 + (((tickAnim - 30) / 8) * (-0.955-(-1.225)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 2.87 + (((tickAnim - 38) / 5) * (0.675-(2.87)));
            zz = -0.955 + (((tickAnim - 38) / 5) * (0.7-(-0.955)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            yy = 0.675 + (((tickAnim - 43) / 9) * (0.9-(0.675)));
            zz = 0.7 + (((tickAnim - 43) / 9) * (0.35-(0.7)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            yy = 0.9 + (((tickAnim - 52) / 8) * (0.425-(0.9)));
            zz = 0.35 + (((tickAnim - 52) / 8) * (0-(0.35)));
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
            xx = 19.68473 + (((tickAnim - 0) / 18) * (57.08588-(19.68473)));
            yy = -1.31833 + (((tickAnim - 0) / 18) * (24.86192-(-1.31833)));
            zz = -4.85077 + (((tickAnim - 0) / 18) * (-17.63084-(-4.85077)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 57.08588 + (((tickAnim - 18) / 5) * (33.06573-(57.08588)));
            yy = 24.86192 + (((tickAnim - 18) / 5) * (11.28025-(24.86192)));
            zz = -17.63084 + (((tickAnim - 18) / 5) * (-6.92547-(-17.63084)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 33.06573 + (((tickAnim - 23) / 8) * (-2.31419-(33.06573)));
            yy = 11.28025 + (((tickAnim - 23) / 8) * (16.92551-(11.28025)));
            zz = -6.92547 + (((tickAnim - 23) / 8) * (6.68645-(-6.92547)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -2.31419 + (((tickAnim - 31) / 4) * (-14.92033-(-2.31419)));
            yy = 16.92551 + (((tickAnim - 31) / 4) * (14.97949-(16.92551)));
            zz = 6.68645 + (((tickAnim - 31) / 4) * (14.75325-(6.68645)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = -14.92033 + (((tickAnim - 35) / 25) * (19.68473-(-14.92033)));
            yy = 14.97949 + (((tickAnim - 35) / 25) * (-1.31833-(14.97949)));
            zz = 14.75325 + (((tickAnim - 35) / 25) * (-4.85077-(14.75325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 4.25449 + (((tickAnim - 0) / 18) * (5.52353-(4.25449)));
            yy = 9.71772 + (((tickAnim - 0) / 18) * (-14.20639-(9.71772)));
            zz = -7.08804 + (((tickAnim - 0) / 18) * (-33.10734-(-7.08804)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 5.52353 + (((tickAnim - 18) / 2) * (7.93712-(5.52353)));
            yy = -14.20639 + (((tickAnim - 18) / 2) * (-8.63119-(-14.20639)));
            zz = -33.10734 + (((tickAnim - 18) / 2) * (-36.30252-(-33.10734)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 7.93712 + (((tickAnim - 20) / 5) * (-27.69249-(7.93712)));
            yy = -8.63119 + (((tickAnim - 20) / 5) * (-0.26839-(-8.63119)));
            zz = -36.30252 + (((tickAnim - 20) / 5) * (-41.09531-(-36.30252)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = -27.69249 + (((tickAnim - 25) / 6) * (-35.18956-(-27.69249)));
            yy = -0.26839 + (((tickAnim - 25) / 6) * (-1.1643-(-0.26839)));
            zz = -41.09531 + (((tickAnim - 25) / 6) * (-25.14227-(-41.09531)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -35.18956 + (((tickAnim - 31) / 4) * (-11.21109-(-35.18956)));
            yy = -1.1643 + (((tickAnim - 31) / 4) * (-12.58685-(-1.1643)));
            zz = -25.14227 + (((tickAnim - 31) / 4) * (-25.151-(-25.14227)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = -11.21109 + (((tickAnim - 35) / 25) * (4.25449-(-11.21109)));
            yy = -12.58685 + (((tickAnim - 35) / 25) * (9.71772-(-12.58685)));
            zz = -25.151 + (((tickAnim - 35) / 25) * (-7.08804-(-25.151)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (4.275-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            yy = 4.275 + (((tickAnim - 25) / 6) * (1.825-(4.275)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = 1.825 + (((tickAnim - 31) / 4) * (0-(1.825)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -17.37658 + (((tickAnim - 0) / 5) * (-28.16804-(-17.37658)));
            yy = 13.41594 + (((tickAnim - 0) / 5) * (11.27573-(13.41594)));
            zz = 5.05895 + (((tickAnim - 0) / 5) * (6.88612-(5.05895)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -28.16804 + (((tickAnim - 5) / 5) * (-8.90702-(-28.16804)));
            yy = 11.27573 + (((tickAnim - 5) / 5) * (6.3426-(11.27573)));
            zz = 6.88612 + (((tickAnim - 5) / 5) * (3.87344-(6.88612)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -8.90702 + (((tickAnim - 10) / 8) * (61-(-8.90702)));
            yy = 6.3426 + (((tickAnim - 10) / 8) * (0-(6.3426)));
            zz = 3.87344 + (((tickAnim - 10) / 8) * (0-(3.87344)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 61 + (((tickAnim - 18) / 2) * (93.15005-(61)));
            yy = 0 + (((tickAnim - 18) / 2) * (-1.78172-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-1.2957-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 93.15005 + (((tickAnim - 20) / 5) * (90.12513-(93.15005)));
            yy = -1.78172 + (((tickAnim - 20) / 5) * (-4.4543-(-1.78172)));
            zz = -1.2957 + (((tickAnim - 20) / 5) * (-3.23925-(-1.2957)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 90.12513 + (((tickAnim - 25) / 6) * (38.25027-(90.12513)));
            yy = -4.4543 + (((tickAnim - 25) / 6) * (-8.90859-(-4.4543)));
            zz = -3.23925 + (((tickAnim - 25) / 6) * (-6.47851-(-3.23925)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 38.25027 + (((tickAnim - 31) / 4) * (19.75-(38.25027)));
            yy = -8.90859 + (((tickAnim - 31) / 4) * (0-(-8.90859)));
            zz = -6.47851 + (((tickAnim - 31) / 4) * (0-(-6.47851)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 19.75 + (((tickAnim - 35) / 13) * (-3.05084-(19.75)));
            yy = 0 + (((tickAnim - 35) / 13) * (7.15517-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (2.69811-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -3.05084 + (((tickAnim - 48) / 12) * (-17.37658-(-3.05084)));
            yy = 7.15517 + (((tickAnim - 48) / 12) * (13.41594-(7.15517)));
            zz = 2.69811 + (((tickAnim - 48) / 12) * (5.05895-(2.69811)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.17-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.17 + (((tickAnim - 5) / 5) * (1.05-(-0.17)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 1.05 + (((tickAnim - 10) / 8) * (1.025-(1.05)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0.11-(0)));
            yy = 1.025 + (((tickAnim - 18) / 7) * (4.585-(1.025)));
            zz = 0 + (((tickAnim - 18) / 7) * (-0.5-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 0.11 + (((tickAnim - 25) / 6) * (0.225-(0.11)));
            yy = 4.585 + (((tickAnim - 25) / 6) * (1.8-(4.585)));
            zz = -0.5 + (((tickAnim - 25) / 6) * (0-(-0.5)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0.225 + (((tickAnim - 31) / 4) * (0-(0.225)));
            yy = 1.8 + (((tickAnim - 31) / 4) * (0.425-(1.8)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            yy = 0.425 + (((tickAnim - 35) / 13) * (0.875-(0.425)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            yy = 0.875 + (((tickAnim - 48) / 12) * (0-(0.875)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -35.18956 + (((tickAnim - 0) / 5) * (-11.21109-(-35.18956)));
            yy = 1.1643 + (((tickAnim - 0) / 5) * (12.58685-(1.1643)));
            zz = 25.14227 + (((tickAnim - 0) / 5) * (25.151-(25.14227)));
        }
        else if (tickAnim >= 5 && tickAnim < 43) {
            xx = -11.21109 + (((tickAnim - 5) / 38) * (5.52353-(-11.21109)));
            yy = 12.58685 + (((tickAnim - 5) / 38) * (14.20639-(12.58685)));
            zz = 25.151 + (((tickAnim - 5) / 38) * (33.10734-(25.151)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 5.52353 + (((tickAnim - 43) / 4) * (7.93712-(5.52353)));
            yy = 14.20639 + (((tickAnim - 43) / 4) * (8.63119-(14.20639)));
            zz = 33.10734 + (((tickAnim - 43) / 4) * (36.30252-(33.10734)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = 7.93712 + (((tickAnim - 47) / 5) * (-27.69249-(7.93712)));
            yy = 8.63119 + (((tickAnim - 47) / 5) * (0.26839-(8.63119)));
            zz = 36.30252 + (((tickAnim - 47) / 5) * (41.09531-(36.30252)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = -27.69249 + (((tickAnim - 52) / 8) * (-35.18956-(-27.69249)));
            yy = 0.26839 + (((tickAnim - 52) / 8) * (1.1643-(0.26839)));
            zz = 41.09531 + (((tickAnim - 52) / 8) * (25.14227-(41.09531)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 1.825 + (((tickAnim - 0) / 5) * (0-(1.825)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 5) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 38) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 9) * (4.275-(0)));
            zz = 0 + (((tickAnim - 43) / 9) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            yy = 4.275 + (((tickAnim - 52) / 8) * (1.825-(4.275)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
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
            xx = 38.25027 + (((tickAnim - 0) / 5) * (19.75-(38.25027)));
            yy = -8.90859 + (((tickAnim - 0) / 5) * (0-(-8.90859)));
            zz = -6.47851 + (((tickAnim - 0) / 5) * (0-(-6.47851)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 19.75 + (((tickAnim - 5) / 15) * (-10.32538-(19.75)));
            yy = 0 + (((tickAnim - 5) / 15) * (-14.11959-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (-7.33806-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -10.32538 + (((tickAnim - 20) / 12) * (-9.36269-(-10.32538)));
            yy = -14.11959 + (((tickAnim - 20) / 12) * (-7.31302-(-14.11959)));
            zz = -7.33806 + (((tickAnim - 20) / 12) * (-20.04502-(-7.33806)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = -9.36269 + (((tickAnim - 32) / 11) * (61-(-9.36269)));
            yy = -7.31302 + (((tickAnim - 32) / 11) * (0-(-7.31302)));
            zz = -20.04502 + (((tickAnim - 32) / 11) * (0-(-20.04502)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 61 + (((tickAnim - 43) / 4) * (93.15005-(61)));
            yy = 0 + (((tickAnim - 43) / 4) * (-1.78172-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (-1.2957-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = 93.15005 + (((tickAnim - 47) / 5) * (90.12513-(93.15005)));
            yy = -1.78172 + (((tickAnim - 47) / 5) * (-4.4543-(-1.78172)));
            zz = -1.2957 + (((tickAnim - 47) / 5) * (-3.23925-(-1.2957)));
        }
        else if (tickAnim >= 52 && tickAnim < 57) {
            xx = 90.12513 + (((tickAnim - 52) / 5) * (38.00021-(90.12513)));
            yy = -4.4543 + (((tickAnim - 52) / 5) * (-7.12687-(-4.4543)));
            zz = -3.23925 + (((tickAnim - 52) / 5) * (-5.18281-(-3.23925)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 38.00021 + (((tickAnim - 57) / 3) * (38.25027-(38.00021)));
            yy = -7.12687 + (((tickAnim - 57) / 3) * (-8.90859-(-7.12687)));
            zz = -5.18281 + (((tickAnim - 57) / 3) * (-6.47851-(-5.18281)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.225 + (((tickAnim - 0) / 5) * (0-(0.225)));
            yy = 1.8 + (((tickAnim - 0) / 5) * (0.425-(1.8)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.425 + (((tickAnim - 5) / 8) * (1.55-(0.425)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 1.55 + (((tickAnim - 13) / 7) * (1.5-(1.55)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = 1.5 + (((tickAnim - 20) / 12) * (1.61-(1.5)));
            zz = 0 + (((tickAnim - 20) / 12) * (0.475-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 1.61 + (((tickAnim - 32) / 6) * (2.405-(1.61)));
            zz = 0.475 + (((tickAnim - 32) / 6) * (0.2-(0.475)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 2.405 + (((tickAnim - 38) / 5) * (1.025-(2.405)));
            zz = 0.2 + (((tickAnim - 38) / 5) * (0-(0.2)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 43) / 9) * (0.11-(0)));
            yy = 1.025 + (((tickAnim - 43) / 9) * (4.585-(1.025)));
            zz = 0 + (((tickAnim - 43) / 9) * (-0.5-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 57) {
            xx = 0.11 + (((tickAnim - 52) / 5) * (0.18-(0.11)));
            yy = 4.585 + (((tickAnim - 52) / 5) * (2.22-(4.585)));
            zz = -0.5 + (((tickAnim - 52) / 5) * (-0.36-(-0.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0.18 + (((tickAnim - 57) / 3) * (0.225-(0.18)));
            yy = 2.22 + (((tickAnim - 57) / 3) * (1.8-(2.22)));
            zz = -0.36 + (((tickAnim - 57) / 3) * (0-(-0.36)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-20))*1.2), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-90))*1.5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*0.25);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-50))*0.3);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5))*-0.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-120))*1));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+40))*-0.5), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*-1.5), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-1));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-20))*-1.2), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-120))*-2.5), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*-2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-50))*1), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-120))*2), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-100))*1), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-140))*2), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-100))*-1), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-130))*-3), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.31419 + (((tickAnim - 0) / 5) * (-14.92033-(-2.31419)));
            yy = -16.92551 + (((tickAnim - 0) / 5) * (-14.97949-(-16.92551)));
            zz = -6.68645 + (((tickAnim - 0) / 5) * (-14.75325-(-6.68645)));
        }
        else if (tickAnim >= 5 && tickAnim < 43) {
            xx = -14.92033 + (((tickAnim - 5) / 38) * (57.08588-(-14.92033)));
            yy = -14.97949 + (((tickAnim - 5) / 38) * (-24.86192-(-14.97949)));
            zz = -14.75325 + (((tickAnim - 5) / 38) * (17.63084-(-14.75325)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 57.08588 + (((tickAnim - 43) / 9) * (33.06573-(57.08588)));
            yy = -24.86192 + (((tickAnim - 43) / 9) * (-11.28025-(-24.86192)));
            zz = 17.63084 + (((tickAnim - 43) / 9) * (6.92547-(17.63084)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 33.06573 + (((tickAnim - 52) / 8) * (-2.31419-(33.06573)));
            yy = -11.28025 + (((tickAnim - 52) / 8) * (-16.92551-(-11.28025)));
            zz = 6.92547 + (((tickAnim - 52) / 8) * (-6.68645-(6.92547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-30))*-1), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-90))*-1.5), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(2.5), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-130))*-1.5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-120))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-4), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-160))*-1), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-1), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-190))*-1), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-200))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(2), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-230))*-5), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-250))*2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-30))*-1), tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-280))*-5), tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-300))*2));

    }




    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraColossosuchus e = (EntityPrehistoricFloraColossosuchus) entity;
        animator.update(entity);

    }
}
