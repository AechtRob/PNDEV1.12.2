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
                if(ee.getIsFast()){
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (ee.getIsFast()) { //Running
                animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

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

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraColossosuchus entity = (EntityPrehistoricFloraColossosuchus) entitylivingbaseIn;

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraColossosuchus entity = (EntityPrehistoricFloraColossosuchus) entitylivingbaseIn;

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraColossosuchus entity = (EntityPrehistoricFloraColossosuchus) entitylivingbaseIn;

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraColossosuchus entity = (EntityPrehistoricFloraColossosuchus) entitylivingbaseIn;

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraColossosuchus entity = (EntityPrehistoricFloraColossosuchus) entitylivingbaseIn;


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraColossosuchus entity = (EntityPrehistoricFloraColossosuchus) entitylivingbaseIn;

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraColossosuchus entity = (EntityPrehistoricFloraColossosuchus) entitylivingbaseIn;

    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraColossosuchus entity = (EntityPrehistoricFloraColossosuchus) entitylivingbaseIn;

    }




    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraColossosuchus e = (EntityPrehistoricFloraColossosuchus) entity;
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
