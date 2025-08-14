package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKronosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKronosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer backLeftFlipper;
    private final AdvancedModelRenderer backLeftFlipper2;
    private final AdvancedModelRenderer backLeftFlipper3;
    private final AdvancedModelRenderer backLeftFlipper4;
    private final AdvancedModelRenderer backRightFlipper;
    private final AdvancedModelRenderer backRightFlipper2;
    private final AdvancedModelRenderer backRightFlipper3;
    private final AdvancedModelRenderer backRightFlipper4;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer frontLeftFlipper;
    private final AdvancedModelRenderer frontLeftFlipper2;
    private final AdvancedModelRenderer frontLeftFlipper3;
    private final AdvancedModelRenderer frontLeftFlipper4;
    private final AdvancedModelRenderer frontRightFlipper;
    private final AdvancedModelRenderer frontRightFlipper2;
    private final AdvancedModelRenderer frontRightFlipper3;
    private final AdvancedModelRenderer frontRightFlipper4;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
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
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
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

    private ModelAnimator animator;

    public ModelKronosaurus() {
        this.textureWidth = 180;
        this.textureHeight = 175;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 5.5F, 23.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -15.0F, -3.0F, -29.25F, 30, 19, 26, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.6997F, -4.4847F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 79, -12.5F, 0.1F, -0.75F, 25, 17, 15, 0.0F, false));

        this.backLeftFlipper = new AdvancedModelRenderer(this);
        this.backLeftFlipper.setRotationPoint(10.0626F, 12.9949F, 7.2347F);
        this.tail.addChild(backLeftFlipper);
        this.setRotateAngle(backLeftFlipper, 0.406F, -0.0086F, -1.3678F);
        this.backLeftFlipper.cubeList.add(new ModelBox(backLeftFlipper, 142, 91, -3.3258F, -0.5542F, -3.0F, 5, 6, 6, 0.0F, false));

        this.backLeftFlipper2 = new AdvancedModelRenderer(this);
        this.backLeftFlipper2.setRotationPoint(-0.3258F, 4.4458F, -0.5F);
        this.backLeftFlipper.addChild(backLeftFlipper2);
        this.backLeftFlipper2.cubeList.add(new ModelBox(backLeftFlipper2, 130, 141, -2.5F, 0.0F, -3.0F, 4, 12, 9, 0.0F, false));

        this.backLeftFlipper3 = new AdvancedModelRenderer(this);
        this.backLeftFlipper3.setRotationPoint(-0.5F, 11.0434F, -2.7462F);
        this.backLeftFlipper2.addChild(backLeftFlipper3);
        this.setRotateAngle(backLeftFlipper3, 0.1745F, 0.0F, 0.0F);
        this.backLeftFlipper3.cubeList.add(new ModelBox(backLeftFlipper3, 142, 55, -1.5F, 1.0F, 0.0F, 3, 8, 7, 0.0F, false));

        this.backLeftFlipper4 = new AdvancedModelRenderer(this);
        this.backLeftFlipper4.setRotationPoint(0.0F, 9.0F, 0.25F);
        this.backLeftFlipper3.addChild(backLeftFlipper4);
        this.setRotateAngle(backLeftFlipper4, 0.2182F, 0.0F, 0.0F);
        this.backLeftFlipper4.cubeList.add(new ModelBox(backLeftFlipper4, 86, 153, -1.0F, 0.0F, 0.0F, 2, 8, 5, 0.0F, false));

        this.backRightFlipper = new AdvancedModelRenderer(this);
        this.backRightFlipper.setRotationPoint(-10.0626F, 12.9949F, 7.2347F);
        this.tail.addChild(backRightFlipper);
        this.setRotateAngle(backRightFlipper, 0.406F, 0.0086F, 1.3678F);
        this.backRightFlipper.cubeList.add(new ModelBox(backRightFlipper, 142, 91, -1.6742F, -0.5542F, -3.0F, 5, 6, 6, 0.0F, true));

        this.backRightFlipper2 = new AdvancedModelRenderer(this);
        this.backRightFlipper2.setRotationPoint(0.3258F, 4.4458F, -0.5F);
        this.backRightFlipper.addChild(backRightFlipper2);
        this.backRightFlipper2.cubeList.add(new ModelBox(backRightFlipper2, 130, 141, -1.5F, 0.0F, -3.0F, 4, 12, 9, 0.0F, true));

        this.backRightFlipper3 = new AdvancedModelRenderer(this);
        this.backRightFlipper3.setRotationPoint(0.5F, 11.0434F, -2.7462F);
        this.backRightFlipper2.addChild(backRightFlipper3);
        this.setRotateAngle(backRightFlipper3, 0.1745F, 0.0F, 0.0F);
        this.backRightFlipper3.cubeList.add(new ModelBox(backRightFlipper3, 142, 55, -1.5F, 1.0F, 0.0F, 3, 8, 7, 0.0F, true));

        this.backRightFlipper4 = new AdvancedModelRenderer(this);
        this.backRightFlipper4.setRotationPoint(0.0F, 9.0F, 0.25F);
        this.backRightFlipper3.addChild(backRightFlipper4);
        this.setRotateAngle(backRightFlipper4, 0.2182F, 0.0F, 0.0F);
        this.backRightFlipper4.cubeList.add(new ModelBox(backRightFlipper4, 86, 153, -1.0F, 0.0F, 0.0F, 2, 8, 5, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 3.3502F, 14.2609F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 80, 79, -9.0F, -3.0F, -2.0F, 18, 13, 13, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 112, 0, -6.0F, -2.75F, -2.0F, 12, 10, 12, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 10.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 92, 129, -4.5F, -2.0F, -2.0F, 9, 7, 10, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.75F, 8.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 40, 142, -3.0F, -1.0F, -2.0F, 6, 5, 6, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.2F, 4.0F);
        this.tail5.addChild(tail6);
        this.tail6.cubeList.add(new ModelBox(tail6, 48, 111, -1.5F, -1.0F, -1.0F, 3, 2, 10, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 4.6252F, 7.3095F);
        this.tail6.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.4268F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 120, 155, 0.5F, -9.0F, 0.0F, 1, 9, 4, 0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 1.0F, 9.0F);
        this.tail6.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.1345F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 160, 10, 0.5F, -3.0F, -4.0F, 1, 3, 4, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.75F, -28.5F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 45, -13.0F, 0.0F, -16.0F, 26, 18, 16, 0.0F, false));

        this.frontLeftFlipper = new AdvancedModelRenderer(this);
        this.frontLeftFlipper.setRotationPoint(11.0626F, 12.0452F, -9.5F);
        this.body.addChild(frontLeftFlipper);
        this.setRotateAngle(frontLeftFlipper, 0.1265F, -0.0338F, -1.3111F);
        this.frontLeftFlipper.cubeList.add(new ModelBox(frontLeftFlipper, 64, 142, -3.3258F, -0.5542F, -3.0F, 5, 6, 6, 0.0F, false));

        this.frontLeftFlipper2 = new AdvancedModelRenderer(this);
        this.frontLeftFlipper2.setRotationPoint(-0.3258F, 4.4458F, -0.5F);
        this.frontLeftFlipper.addChild(frontLeftFlipper2);
        this.frontLeftFlipper2.cubeList.add(new ModelBox(frontLeftFlipper2, 142, 35, -2.5F, 0.0F, -3.0F, 4, 11, 9, 0.0F, false));

        this.frontLeftFlipper3 = new AdvancedModelRenderer(this);
        this.frontLeftFlipper3.setRotationPoint(-0.5F, 11.0434F, -2.7462F);
        this.frontLeftFlipper2.addChild(frontLeftFlipper3);
        this.setRotateAngle(frontLeftFlipper3, 0.1745F, 0.0F, 0.0F);
        this.frontLeftFlipper3.cubeList.add(new ModelBox(frontLeftFlipper3, 142, 77, -1.5F, 0.0F, 0.0F, 3, 7, 7, 0.0F, false));

        this.frontLeftFlipper4 = new AdvancedModelRenderer(this);
        this.frontLeftFlipper4.setRotationPoint(0.0F, 7.0F, 0.25F);
        this.frontLeftFlipper3.addChild(frontLeftFlipper4);
        this.setRotateAngle(frontLeftFlipper4, 0.2182F, 0.0F, 0.0F);
        this.frontLeftFlipper4.cubeList.add(new ModelBox(frontLeftFlipper4, 64, 154, -1.0F, 0.0F, 0.0F, 2, 7, 5, 0.0F, false));

        this.frontRightFlipper = new AdvancedModelRenderer(this);
        this.frontRightFlipper.setRotationPoint(-11.0626F, 12.0452F, -9.5F);
        this.body.addChild(frontRightFlipper);
        this.setRotateAngle(frontRightFlipper, 0.1265F, 0.0338F, 1.3111F);
        this.frontRightFlipper.cubeList.add(new ModelBox(frontRightFlipper, 64, 142, -1.6742F, -0.5542F, -3.0F, 5, 6, 6, 0.0F, true));

        this.frontRightFlipper2 = new AdvancedModelRenderer(this);
        this.frontRightFlipper2.setRotationPoint(0.3258F, 4.4458F, -0.5F);
        this.frontRightFlipper.addChild(frontRightFlipper2);
        this.frontRightFlipper2.cubeList.add(new ModelBox(frontRightFlipper2, 142, 35, -1.5F, 0.0F, -3.0F, 4, 11, 9, 0.0F, true));

        this.frontRightFlipper3 = new AdvancedModelRenderer(this);
        this.frontRightFlipper3.setRotationPoint(0.5F, 11.0434F, -2.7462F);
        this.frontRightFlipper2.addChild(frontRightFlipper3);
        this.setRotateAngle(frontRightFlipper3, 0.1745F, 0.0F, 0.0F);
        this.frontRightFlipper3.cubeList.add(new ModelBox(frontRightFlipper3, 142, 77, -1.5F, 0.0F, 0.0F, 3, 7, 7, 0.0F, true));

        this.frontRightFlipper4 = new AdvancedModelRenderer(this);
        this.frontRightFlipper4.setRotationPoint(0.0F, 7.0F, 0.25F);
        this.frontRightFlipper3.addChild(frontRightFlipper4);
        this.setRotateAngle(frontRightFlipper4, 0.2182F, 0.0F, 0.0F);
        this.frontRightFlipper4.cubeList.add(new ModelBox(frontRightFlipper4, 64, 154, -1.0F, 0.0F, 0.0F, 2, 7, 5, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.25F, -14.0F);
        this.body.addChild(neck1);
        this.neck1.cubeList.add(new ModelBox(neck1, 84, 45, -10.0F, 0.0F, -9.0F, 20, 16, 9, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.25F, -6.0F);
        this.neck1.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 80, 105, -9.0F, 0.0F, -9.0F, 18, 15, 9, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.25F, -7.0F);
        this.neck2.addChild(neck3);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 111, -8.0F, -0.15F, -8.0F, 16, 14, 8, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.neck3.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 134, 105, -7.5F, -1.0F, -4.0F, 15, 7, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 112, 22, -6.5F, 2.0F, -13.0F, 13, 4, 9, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 48, 123, -5.0F, 4.0F, -17.0F, 10, 2, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 42, 153, -3.5F, 4.0F, -21.0F, 7, 2, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 156, 29, -2.0F, 4.0F, -28.0F, 4, 2, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 160, 0, -2.5F, 4.0F, -24.0F, 5, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 42, 159, -1.5F, 5.0F, -33.0F, 3, 1, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.75F, 6.0F, -23.25F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.1745F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 78, 154, -0.1F, -0.0009F, 6.9564F, 0, 1, 4, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.5F, 6.0F, -23.25F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.1745F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 40, 133, -0.1F, -0.0009F, 2.9564F, 0, 1, 4, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.725F, 6.0F, -23.25F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.1745F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 86, 142, -0.1F, -0.0009F, -0.0436F, 0, 1, 3, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.95F, 6.0F, -25.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.3927F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 74, 111, 0.0F, 0.0F, -2.25F, 0, 2, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.45F, 6.0F, -30.75F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.3927F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 138, 0.0F, 0.0F, -1.75F, 0, 1, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.45F, 6.0F, -30.75F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.3927F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 138, 0.0F, 0.0F, -1.75F, 0, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 4.0F, -28.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 156, 22, -0.5F, 0.0F, -5.05F, 2, 1, 6, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(3.75F, 6.0F, -23.25F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, -0.1745F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 78, 154, 0.1F, -0.0009F, 6.9564F, 0, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.5F, 6.0F, -23.25F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, -0.1745F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 40, 133, 0.1F, -0.0009F, 2.9564F, 0, 1, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.725F, 6.0F, -23.25F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, -0.1745F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 86, 142, 0.1F, -0.0009F, -0.0436F, 0, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.95F, 6.0F, -25.0F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.3927F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 74, 111, 0.0F, 0.0F, -2.25F, 0, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 3.3147F, -21.1735F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1004F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 110, 146, -2.5F, 0.0F, -6.9F, 3, 2, 7, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 2.4465F, -16.2495F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 153, -1.5F, 0.0F, -5.0F, 5, 2, 6, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 1.2437F, -12.4346F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3054F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 146, 70, -3.5F, 0.0F, -4.0F, 8, 3, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -0.4771F, -9.9772F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6109F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 112, 35, -5.5F, 0.0F, -4.0F, 10, 3, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, -1.0F, -4.0F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 84, 70, -4.5F, 0.0F, -6.0F, 11, 3, 6, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 6.0F, -1.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 130, 129, -7.5F, 0.0F, -3.0F, 15, 6, 6, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 156, 148, -2.0F, 0.0F, -27.0F, 4, 2, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 160, 5, -2.5F, 0.0F, -23.0F, 5, 2, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 156, 141, -1.5F, 0.0F, -32.0F, 3, 2, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 86, 146, -4.0F, 0.0F, -20.0F, 8, 3, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 118, 70, -5.0F, 0.0F, -16.0F, 10, 3, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 48, 129, -6.5F, 0.0F, -12.0F, 13, 4, 9, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 146, -5.0F, -3.4F, -3.0F, 10, 4, 3, -0.004F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 134, 116, -5.0F, -4.5F, -9.925F, 10, 5, 7, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.0F, 2.0F, -32.0F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1309F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 22, 153, -2.5F, -2.0F, 5.0F, 3, 2, 7, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 146, -2.0F, -2.0F, 0.0F, 2, 2, 5, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 100, 155, -4.0F, -2.0F, 16.0F, 6, 2, 4, -0.001F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 156, 154, -3.0F, -2.0F, 12.0F, 4, 2, 4, -0.001F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.5F, 4.6105F, -12.1711F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 133, -7.5F, -3.0F, -0.225F, 10, 3, 10, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.475F, 0.0F, -22.0F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.2618F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 58, 159, 0.0F, -1.0F, -1.25F, 0, 1, 3, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-3.725F, 0.0F, -18.75F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.2618F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 78, 159, 0.0F, -1.0F, -1.25F, 0, 1, 4, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-4.475F, 0.0F, -15.0F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.2618F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 156, 160, 0.0F, -0.5F, -0.25F, 0, 1, 5, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.975F, 0.0F, -24.0F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.2618F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 116, 42, 0.0F, -1.0F, -1.25F, 0, 1, 1, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.975F, 0.0F, -26.0F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0873F, 0.0F, -0.2618F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 114, 42, 0.0F, -1.25F, -1.0F, 0, 2, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.6F, 0.0F, -28.5F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0873F, 0.0F, -0.2618F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 112, 42, 0.1F, -1.75F, -0.1F, 0, 2, 1, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.475F, 0.0F, -29.0F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1309F, 0.0F, -0.2618F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 74, 116, 0.0F, -1.0F, -2.9F, 0, 1, 3, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.975F, 0.0F, -26.0F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0873F, 0.0F, 0.2618F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 114, 42, 0.0F, -1.25F, -1.0F, 0, 2, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.6F, 0.0F, -28.5F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0873F, 0.0F, 0.2618F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 112, 42, -0.1F, -1.75F, -0.1F, 0, 2, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.475F, 0.0F, -29.0F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1309F, 0.0F, 0.2618F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 74, 116, 0.0F, -1.0F, -2.9F, 0, 1, 3, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(4.475F, 0.0F, -15.0F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, 0.2618F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 156, 160, 0.0F, -0.5F, -0.25F, 0, 1, 5, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(3.725F, 0.0F, -18.75F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, 0.2618F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 78, 159, 0.0F, -1.0F, -1.25F, 0, 1, 4, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(2.475F, 0.0F, -22.0F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, 0.2618F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 58, 159, 0.0F, -1.0F, -1.25F, 0, 1, 3, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.975F, 0.0F, -24.0F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, 0.2618F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 116, 42, 0.0F, -1.0F, -1.25F, 0, 1, 1, 0.0F, false));
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
        this.main.offsetY = -2.0F;
        this.main.offsetX = -1.338F;
        this.main.scaleChildren = true;
        float scaler = 1.63F;
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
        this.neck1.rotateAngleX = (float) Math.toRadians(90);
        this.setRotateAngle(neck3, 0.0F, -0F, 0.0F);
        this.setRotateAngle(neck2, -0F, -0F, 0F);
        this.setRotateAngle(neck1, -0F, -0F, 0F);
        this.setRotateAngle(jaw, 0F, 0.0F, 0.0F);
        this.setRotateAngle(head, -0F, -0F, -0.F);
        this.neck1.offsetY = -0.08F;
        this.neck1.offsetX = -0F;
        this.neck1.offsetZ = 0.15F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(tail6, 0.0F, 0.2007F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, 0.096F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.2269F, 0.0F);
        this.setRotateAngle(tail3, -0.0441F, 0.1439F, -0.0063F);
        this.setRotateAngle(tail2, -0.044F, 0.1308F, -0.0057F);
        this.setRotateAngle(tail, -0.0442F, 0.1613F, -0.0071F);
        this.setRotateAngle(neck3, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(neck2, -0.0018F, -0.0698F, 0.0262F);
        this.setRotateAngle(neck1, -0.0875F, -0.0814F, 0.0246F);
        this.setRotateAngle(main, -0.1946F, 0.078F, 0.3764F);
        this.setRotateAngle(jaw, 0.2225F, 0.0F, 0.0F);
        this.setRotateAngle(head, -0.1901F, -0.1033F, -0.0531F);
        this.setRotateAngle(frontRightFlipper4, 0.216F, -0.0311F, 0.1406F);
        this.setRotateAngle(frontRightFlipper3, 0.1739F, -0.0151F, 0.0859F);
        this.setRotateAngle(frontRightFlipper2, 0.0F, 0.0F, 0.1178F);
        this.setRotateAngle(frontRightFlipper, -0.0513F, -0.0294F, 1.7958F);
        this.setRotateAngle(frontLeftFlipper4, 0.2119F, 0.0524F, -0.2388F);
        this.setRotateAngle(frontLeftFlipper3, 0.1679F, 0.0479F, -0.2752F);
        this.setRotateAngle(frontLeftFlipper2, 0.0F, 0.0F, -0.2793F);
        this.setRotateAngle(frontLeftFlipper, -0.0724F, -0.0594F, -1.629F);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.3927F);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.3927F);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.3927F);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.1745F);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.1745F);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(cube_r30, 0.1309F, 0.0F, 0.2618F);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.1745F);
        this.setRotateAngle(cube_r29, -0.0873F, 0.0F, 0.2618F);
        this.setRotateAngle(cube_r28, 0.0873F, 0.0F, 0.2618F);
        this.setRotateAngle(cube_r27, 0.1309F, 0.0F, -0.2618F);
        this.setRotateAngle(cube_r26, -0.0873F, 0.0F, -0.2618F);
        this.setRotateAngle(cube_r25, 0.0873F, 0.0F, -0.2618F);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(cube_r20, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.1004F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.3927F);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, -0.1745F);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, -0.1745F);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, -0.1745F);
        this.setRotateAngle(cube_r1, 1.4268F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0131F, -0.0007F, 0.0524F);
        this.setRotateAngle(backRightFlipper4, 0.2164F, 0.0283F, -0.1278F);
        this.setRotateAngle(backRightFlipper3, 0.1735F, 0.0189F, -0.1074F);
        this.setRotateAngle(backRightFlipper2, 0.0F, 0.0F, -0.1396F);
        this.setRotateAngle(backRightFlipper, 0.4054F, 0.0241F, 1.3317F);
        this.setRotateAngle(backLeftFlipper4, 0.2181F, 0.0066F, -0.0298F);
        this.setRotateAngle(backLeftFlipper3, 0.1719F, -0.0302F, 0.1719F);
        this.setRotateAngle(backLeftFlipper2, 0.0F, 0.0F, -0.0087F);
        this.setRotateAngle(backLeftFlipper, 0.4034F, 0.0482F, -1.5001F);
        this.main.offsetY = -0.35F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraKronosaurus ee = (EntityPrehistoricFloraKronosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            animBeached(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }


        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKronosaurus entity = (EntityPrehistoricFloraKronosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-70))*2), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-13.1848+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.21699-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-6.13083-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = -13.1848+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 5) / 9) * (-12.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.5))*13-(-13.1848+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = -1.21699 + (((tickAnim - 5) / 9) * (0-(-1.21699)));
            zz = -6.13083 + (((tickAnim - 5) / 9) * (0-(-6.13083)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -12.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.5))*13 + (((tickAnim - 14) / 6) * (0-(-12.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.5))*13)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 5) * (0.6-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.6 + (((tickAnim - 5) / 5) * (0.3-(0.6)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0.3 + (((tickAnim - 10) / 4) * (0.55-(0.3)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0.55 + (((tickAnim - 14) / 6) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 17.25 + (((tickAnim - 5) / 5) * (0.90077-(17.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (1.24709-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (2.53949-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0.90077 + (((tickAnim - 10) / 4) * (16.40077-(0.90077)));
            yy = 1.24709 + (((tickAnim - 10) / 4) * (1.24709-(1.24709)));
            zz = 2.53949 + (((tickAnim - 10) / 4) * (2.53949-(2.53949)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 16.40077 + (((tickAnim - 14) / 6) * (0-(16.40077)));
            yy = 1.24709 + (((tickAnim - 14) / 6) * (0-(1.24709)));
            zz = 2.53949 + (((tickAnim - 14) / 6) * (0-(2.53949)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
        
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKronosaurus entity = (EntityPrehistoricFloraKronosaurus) entitylivingbaseIn;
        int animCycle = 90;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+380))*-4), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-100))*0.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26))*-0.1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26))*2);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-180))*3), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-60))*2));


        this.setRotateAngle(backLeftFlipper, backLeftFlipper.rotateAngleX + (float) Math.toRadians(-22.4796+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-190))*-15), backLeftFlipper.rotateAngleY + (float) Math.toRadians(-4.2115+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+50))*20), backLeftFlipper.rotateAngleZ + (float) Math.toRadians(-5.3393+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-20))*5));


        this.setRotateAngle(backLeftFlipper2, backLeftFlipper2.rotateAngleX + (float) Math.toRadians(-12+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-50))*20), backLeftFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+120))*15), backLeftFlipper2.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-100))*10));


        this.setRotateAngle(backLeftFlipper3, backLeftFlipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+150))*-10), backLeftFlipper3.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+80))*10), backLeftFlipper3.rotateAngleZ + (float) Math.toRadians(-5.3393+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-10))*5));


        this.setRotateAngle(backLeftFlipper4, backLeftFlipper4.rotateAngleX + (float) Math.toRadians(9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-100))*20), backLeftFlipper4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+250))*5), backLeftFlipper4.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+300))*20));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+50))*-2), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-50))*-5), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-80))*-5), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-150))*-8), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-100))*-12), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+120))*-1), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-142))*1));


        this.setRotateAngle(frontLeftFlipper, frontLeftFlipper.rotateAngleX + (float) Math.toRadians(-2.7678+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+180))*-30), frontLeftFlipper.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+90))*25), frontLeftFlipper.rotateAngleZ + (float) Math.toRadians(0.302+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+70))*20));


        this.setRotateAngle(frontLeftFlipper2, frontLeftFlipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+290))*10), frontLeftFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+50))*10), frontLeftFlipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-10))*15));


        this.setRotateAngle(frontLeftFlipper3, frontLeftFlipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+150))*-15), frontLeftFlipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+320))*-5), frontLeftFlipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-50))*15));


        this.setRotateAngle(frontLeftFlipper4, frontLeftFlipper4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+120))*-10), frontLeftFlipper4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+390))*-5), frontLeftFlipper4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-90))*15));


        this.setRotateAngle(frontRightFlipper, frontRightFlipper.rotateAngleX + (float) Math.toRadians(-2.7678+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+180))*-30), frontRightFlipper.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+90))*-25), frontRightFlipper.rotateAngleZ + (float) Math.toRadians(0.302+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+70))*-20));


        this.setRotateAngle(frontRightFlipper2, frontRightFlipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+290))*10), frontRightFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+50))*-10), frontRightFlipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-10))*-15));


        this.setRotateAngle(frontRightFlipper3, frontRightFlipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+150))*-15), frontRightFlipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+320))*5), frontRightFlipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-50))*-15));


        this.setRotateAngle(frontRightFlipper4, frontRightFlipper4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+120))*-10), frontRightFlipper4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+390))*-5), frontRightFlipper4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-90))*-15));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+160))*-3), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-200))*1));
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(0);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(1.025);


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+220))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-280))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+220))*-1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-280))*1));


        this.setRotateAngle(backRightFlipper, backRightFlipper.rotateAngleX + (float) Math.toRadians(-22.4796+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-190))*-15), backRightFlipper.rotateAngleY + (float) Math.toRadians(-4.2115+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+50))*-20), backRightFlipper.rotateAngleZ + (float) Math.toRadians(5.3393+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-20))*-5));


        this.setRotateAngle(backRightFlipper2, backRightFlipper2.rotateAngleX + (float) Math.toRadians(-12+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-50))*20), backRightFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+120))*-15), backRightFlipper2.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-100))*-10));


        this.setRotateAngle(backRightFlipper3, backRightFlipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+150))*-10), backRightFlipper3.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+80))*-10), backRightFlipper3.rotateAngleZ + (float) Math.toRadians(5.3393+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-10))*-5));


        this.setRotateAngle(backRightFlipper4, backRightFlipper4.rotateAngleX + (float) Math.toRadians(9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-100))*20), backRightFlipper4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+250))*-5), backRightFlipper4.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+300))*-20));
        

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKronosaurus entity = (EntityPrehistoricFloraKronosaurus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+380))*-4), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-100))*0.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834))*-0.1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834))*1.5);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-180))*3), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-60))*2));


        this.setRotateAngle(backLeftFlipper, backLeftFlipper.rotateAngleX + (float) Math.toRadians(-22.4796+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-190))*-15), backLeftFlipper.rotateAngleY + (float) Math.toRadians(-4.2115+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+50))*20), backLeftFlipper.rotateAngleZ + (float) Math.toRadians(-5.3393+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-20))*5));


        this.setRotateAngle(backLeftFlipper2, backLeftFlipper2.rotateAngleX + (float) Math.toRadians(-12+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-50))*20), backLeftFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+120))*15), backLeftFlipper2.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-100))*10));


        this.setRotateAngle(backLeftFlipper3, backLeftFlipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+150))*-10), backLeftFlipper3.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+80))*10), backLeftFlipper3.rotateAngleZ + (float) Math.toRadians(-5.3393+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-10))*5));


        this.setRotateAngle(backLeftFlipper4, backLeftFlipper4.rotateAngleX + (float) Math.toRadians(9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-100))*20), backLeftFlipper4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+250))*5), backLeftFlipper4.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+300))*20));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+50))*-2), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-50))*-5), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-80))*-5), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-150))*-8), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-100))*-12), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+120))*-1), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-142))*1));


        this.setRotateAngle(frontLeftFlipper, frontLeftFlipper.rotateAngleX + (float) Math.toRadians(-2.7678+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+180))*-30), frontLeftFlipper.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+90))*25), frontLeftFlipper.rotateAngleZ + (float) Math.toRadians(0.302+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+70))*20));


        this.setRotateAngle(frontLeftFlipper2, frontLeftFlipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+290))*10), frontLeftFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+50))*10), frontLeftFlipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-10))*15));


        this.setRotateAngle(frontLeftFlipper3, frontLeftFlipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+150))*-15), frontLeftFlipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+320))*-5), frontLeftFlipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-50))*15));


        this.setRotateAngle(frontLeftFlipper4, frontLeftFlipper4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+120))*-10), frontLeftFlipper4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26+390))*-5), frontLeftFlipper4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/1.26-90))*15));


        this.setRotateAngle(frontRightFlipper, frontRightFlipper.rotateAngleX + (float) Math.toRadians(-2.7678+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+180))*-30), frontRightFlipper.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+90))*-25), frontRightFlipper.rotateAngleZ + (float) Math.toRadians(0.302+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+70))*-20));


        this.setRotateAngle(frontRightFlipper2, frontRightFlipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+290))*10), frontRightFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+50))*-10), frontRightFlipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-10))*-15));


        this.setRotateAngle(frontRightFlipper3, frontRightFlipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+150))*-15), frontRightFlipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+320))*5), frontRightFlipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-50))*-15));


        this.setRotateAngle(frontRightFlipper4, frontRightFlipper4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+120))*-10), frontRightFlipper4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+390))*-5), frontRightFlipper4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-90))*-15));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+160))*-3), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-200))*1));
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(0);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(1.025);


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+220))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-280))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+220))*-1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-280))*1));


        this.setRotateAngle(backRightFlipper, backRightFlipper.rotateAngleX + (float) Math.toRadians(-22.4796+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-190))*-15), backRightFlipper.rotateAngleY + (float) Math.toRadians(-4.2115+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+50))*-20), backRightFlipper.rotateAngleZ + (float) Math.toRadians(5.3393+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-20))*-5));


        this.setRotateAngle(backRightFlipper2, backRightFlipper2.rotateAngleX + (float) Math.toRadians(-12+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-50))*20), backRightFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+120))*-15), backRightFlipper2.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-100))*-10));


        this.setRotateAngle(backRightFlipper3, backRightFlipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+150))*-10), backRightFlipper3.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+80))*-10), backRightFlipper3.rotateAngleZ + (float) Math.toRadians(5.3393+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-10))*-5));


        this.setRotateAngle(backRightFlipper4, backRightFlipper4.rotateAngleX + (float) Math.toRadians(9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834-100))*20), backRightFlipper4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+250))*-5), backRightFlipper4.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.834+300))*-20));


    }
    public void animBeached(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKronosaurus entity = (EntityPrehistoricFloraKronosaurus) entitylivingbaseIn;
        int animCycle = 140;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = -1.95 + (((tickAnim - 0) / 140) * (-1.95-(-1.95)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);

        this.main.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.008),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.008),(float)1);



        if (tickAnim >= 0 && tickAnim < 140) {
            xx = -7.25 + (((tickAnim - 0) / 140) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));

        this.tail.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.008),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.008),(float)1);


        this.setRotateAngle(backLeftFlipper, backLeftFlipper.rotateAngleX + (float) Math.toRadians(0), backLeftFlipper.rotateAngleY + (float) Math.toRadians(0), backLeftFlipper.rotateAngleZ + (float) Math.toRadians(-5.75));


        this.setRotateAngle(backLeftFlipper2, backLeftFlipper2.rotateAngleX + (float) Math.toRadians(0), backLeftFlipper2.rotateAngleY + (float) Math.toRadians(0), backLeftFlipper2.rotateAngleZ + (float) Math.toRadians(3.25));


        this.setRotateAngle(backLeftFlipper3, backLeftFlipper3.rotateAngleX + (float) Math.toRadians(0.00336), backLeftFlipper3.rotateAngleY + (float) Math.toRadians(1.47721), backLeftFlipper3.rotateAngleZ + (float) Math.toRadians(-5.48947));


        this.setRotateAngle(backLeftFlipper4, backLeftFlipper4.rotateAngleX + (float) Math.toRadians(0), backLeftFlipper4.rotateAngleY + (float) Math.toRadians(0), backLeftFlipper4.rotateAngleZ + (float) Math.toRadians(-7.5));



        if (tickAnim >= 0 && tickAnim < 140) {
            xx = -13.96723 + (((tickAnim - 0) / 140) * (-13.96723-(-13.96723)));
            yy = 0.96695 + (((tickAnim - 0) / 140) * (0.96695-(0.96695)));
            zz = 3.88155 + (((tickAnim - 0) / 140) * (3.88155-(3.88155)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 5.28507 + (((tickAnim - 0) / 140) * (5.28507-(5.28507)));
            yy = -8.07318 + (((tickAnim - 0) / 140) * (-8.07318-(-8.07318)));
            zz = 2.98698 + (((tickAnim - 0) / 140) * (2.98698-(2.98698)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 10.05988 + (((tickAnim - 0) / 140) * (10.05988-(10.05988)));
            yy = -9.68816 + (((tickAnim - 0) / 140) * (-9.68816-(-9.68816)));
            zz = -1.20979 + (((tickAnim - 0) / 140) * (-1.20979-(-1.20979)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 5.99519 + (((tickAnim - 0) / 140) * (5.99519-(5.99519)));
            yy = -7.42787 + (((tickAnim - 0) / 140) * (-7.42787-(-7.42787)));
            zz = 5.71196 + (((tickAnim - 0) / 140) * (5.71196-(5.71196)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = -5.1834 + (((tickAnim - 0) / 140) * (-5.1834-(-5.1834)));
            yy = 3.4952 + (((tickAnim - 0) / 140) * (3.4952-(3.4952)));
            zz = 25.2444 + (((tickAnim - 0) / 140) * (25.2444-(25.2444)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 6.25 + (((tickAnim - 0) / 140) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));

        this.body.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.008),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.008),(float)1);



        if (tickAnim >= 0 && tickAnim < 140) {
            xx = -13.15143 + (((tickAnim - 0) / 140) * (-13.15143-(-13.15143)));
            yy = -12.2675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 0) / 140) * (-12.2675-(-12.2675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            zz = 8.88716 + (((tickAnim - 0) / 140) * (8.88716-(8.88716)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftFlipper, frontLeftFlipper.rotateAngleX + (float) Math.toRadians(xx), frontLeftFlipper.rotateAngleY + (float) Math.toRadians(yy), frontLeftFlipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = -0.89614 + (((tickAnim - 0) / 140) * (-0.89614-(-0.89614)));
            yy = 4.81115 + (((tickAnim - 0) / 140) * (4.81115-(4.81115)));
            zz = -9.47789 + (((tickAnim - 0) / 140) * (-9.47789-(-9.47789)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftFlipper2, frontLeftFlipper2.rotateAngleX + (float) Math.toRadians(xx), frontLeftFlipper2.rotateAngleY + (float) Math.toRadians(yy), frontLeftFlipper2.rotateAngleZ + (float) Math.toRadians(zz));





        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 11.92742 + (((tickAnim - 0) / 140) * (11.92742-(11.92742)));
            yy = -2.31243 + (((tickAnim - 0) / 140) * (-2.31243-(-2.31243)));
            zz = -9.32146 + (((tickAnim - 0) / 140) * (-9.32146-(-9.32146)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftFlipper3, frontLeftFlipper3.rotateAngleX + (float) Math.toRadians(xx), frontLeftFlipper3.rotateAngleY + (float) Math.toRadians(yy), frontLeftFlipper3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 140) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftFlipper3.rotationPointX = this.frontLeftFlipper3.rotationPointX + (float)(xx);
        this.frontLeftFlipper3.rotationPointY = this.frontLeftFlipper3.rotationPointY - (float)(yy);
        this.frontLeftFlipper3.rotationPointZ = this.frontLeftFlipper3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 14.5 + (((tickAnim - 0) / 140) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = -5.25 + (((tickAnim - 0) / 140) * (-5.25-(-5.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftFlipper4, frontLeftFlipper4.rotateAngleX + (float) Math.toRadians(xx), frontLeftFlipper4.rotateAngleY + (float) Math.toRadians(yy), frontLeftFlipper4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = -13.15143 + (((tickAnim - 0) / 140) * (-13.15143-(-13.15143)));
            yy = 12.2675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 0) / 140) * (12.2675-(12.2675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            zz = -8.88716 + (((tickAnim - 0) / 140) * (-8.88716-(-8.88716)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightFlipper, frontRightFlipper.rotateAngleX + (float) Math.toRadians(xx), frontRightFlipper.rotateAngleY + (float) Math.toRadians(yy), frontRightFlipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = -0.89614 + (((tickAnim - 0) / 140) * (-0.89614-(-0.89614)));
            yy = -4.81115 + (((tickAnim - 0) / 140) * (-4.81115-(-4.81115)));
            zz = 9.47789 + (((tickAnim - 0) / 140) * (9.47789-(9.47789)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightFlipper2, frontRightFlipper2.rotateAngleX + (float) Math.toRadians(xx), frontRightFlipper2.rotateAngleY + (float) Math.toRadians(yy), frontRightFlipper2.rotateAngleZ + (float) Math.toRadians(zz));





        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 11.92742 + (((tickAnim - 0) / 140) * (11.92742-(11.92742)));
            yy = 2.31243 + (((tickAnim - 0) / 140) * (2.31243-(2.31243)));
            zz = 9.32146 + (((tickAnim - 0) / 140) * (9.32146-(9.32146)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightFlipper3, frontRightFlipper3.rotateAngleX + (float) Math.toRadians(xx), frontRightFlipper3.rotateAngleY + (float) Math.toRadians(yy), frontRightFlipper3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 140) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightFlipper3.rotationPointX = this.frontRightFlipper3.rotationPointX + (float)(xx);
        this.frontRightFlipper3.rotationPointY = this.frontRightFlipper3.rotationPointY - (float)(yy);
        this.frontRightFlipper3.rotationPointZ = this.frontRightFlipper3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 14.5 + (((tickAnim - 0) / 140) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 5.25 + (((tickAnim - 0) / 140) * (5.25-(5.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightFlipper4, frontRightFlipper4.rotateAngleX + (float) Math.toRadians(xx), frontRightFlipper4.rotateAngleY + (float) Math.toRadians(yy), frontRightFlipper4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 4.992 + (((tickAnim - 0) / 41) * (5-(4.992)));
            yy = 0.28311 + (((tickAnim - 0) / 41) * (0-(0.28311)));
            zz = -3.23766 + (((tickAnim - 0) / 41) * (0-(-3.23766)));
        }
        else if (tickAnim >= 41 && tickAnim < 57) {
            xx = 5 + (((tickAnim - 41) / 16) * (6.6404+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5-(5)));
            yy = 0 + (((tickAnim - 41) / 16) * (4.9328+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(0)));
            zz = 0 + (((tickAnim - 41) / 16) * (0.393-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 66) {
            xx = 6.6404+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5 + (((tickAnim - 57) / 9) * (4.83748-(6.6404+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5)));
            yy = 4.9328+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 57) / 9) * (6.50815-(4.9328+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            zz = 0.393 + (((tickAnim - 57) / 9) * (3.19238-(0.393)));
        }
        else if (tickAnim >= 66 && tickAnim < 102) {
            xx = 4.83748 + (((tickAnim - 66) / 36) * (4.26931-(4.83748)));
            yy = 6.50815 + (((tickAnim - 66) / 36) * (6.73249-(6.50815)));
            zz = 3.19238 + (((tickAnim - 66) / 36) * (0.43314-(3.19238)));
        }
        else if (tickAnim >= 102 && tickAnim < 122) {
            xx = 4.26931 + (((tickAnim - 102) / 20) * (0.88465-(4.26931)));
            yy = 6.73249 + (((tickAnim - 102) / 20) * (3.36624-(6.73249)));
            zz = 0.43314 + (((tickAnim - 102) / 20) * (0.21657-(0.43314)));
        }
        else if (tickAnim >= 122 && tickAnim < 140) {
            xx = 0.88465 + (((tickAnim - 122) / 18) * (4.992-(0.88465)));
            yy = 3.36624 + (((tickAnim - 122) / 18) * (0.28311-(3.36624)));
            zz = 0.21657 + (((tickAnim - 122) / 18) * (-3.23766-(0.21657)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 41) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 41) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 41) / 99) * (0-(0)));
            yy = -0.425 + (((tickAnim - 41) / 99) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 41) / 99) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 41) {
            xx = -2.6735 + (((tickAnim - 0) / 41) * (-2.86902-(-2.6735)));
            yy = -3.80488 + (((tickAnim - 0) / 41) * (-3.6598-(-3.80488)));
            zz = -1.07114 + (((tickAnim - 0) / 41) * (1.93172-(-1.07114)));
        }
        else if (tickAnim >= 41 && tickAnim < 57) {
            xx = -2.86902 + (((tickAnim - 41) / 16) * (-6.169+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(-2.86902)));
            yy = -3.6598 + (((tickAnim - 41) / 16) * (-3.6598-(-3.6598)));
            zz = 1.93172 + (((tickAnim - 41) / 16) * (1.93172-(1.93172)));
        }
        else if (tickAnim >= 57 && tickAnim < 66) {
            xx = -6.169+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 57) / 9) * (-5.96243-(-6.169+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = -3.6598 + (((tickAnim - 57) / 9) * (-3.50519-(-3.6598)));
            zz = 1.93172 + (((tickAnim - 57) / 9) * (3.42666-(1.93172)));
        }
        else if (tickAnim >= 66 && tickAnim < 102) {
            xx = -5.96243 + (((tickAnim - 66) / 36) * (-5.86902-(-5.96243)));
            yy = -3.50519 + (((tickAnim - 66) / 36) * (-3.6598-(-3.50519)));
            zz = 3.42666 + (((tickAnim - 66) / 36) * (1.93172-(3.42666)));
        }
        else if (tickAnim >= 102 && tickAnim < 122) {
            xx = -5.86902 + (((tickAnim - 102) / 20) * (-8.59548-(-5.86902)));
            yy = -3.6598 + (((tickAnim - 102) / 20) * (-2.19343-(-3.6598)));
            zz = 1.93172 + (((tickAnim - 102) / 20) * (1.55946-(1.93172)));
        }
        else if (tickAnim >= 122 && tickAnim < 140) {
            xx = -8.59548 + (((tickAnim - 122) / 18) * (-2.6735-(-8.59548)));
            yy = -2.19343 + (((tickAnim - 122) / 18) * (-3.80488-(-2.19343)));
            zz = 1.55946 + (((tickAnim - 122) / 18) * (-1.07114-(1.55946)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 41) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 41) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 16) * (0.5-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 57) / 83) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 83) * (0-(0)));
            zz = 0.5 + (((tickAnim - 57) / 83) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -0.49237 + (((tickAnim - 0) / 17) * (-12.14946-(-0.49237)));
            yy = -1.88248 + (((tickAnim - 0) / 17) * (-2.3161-(-1.88248)));
            zz = 5.97423 + (((tickAnim - 0) / 17) * (3.76962-(5.97423)));
        }
        else if (tickAnim >= 17 && tickAnim < 41) {
            xx = -12.14946 + (((tickAnim - 17) / 24) * (-1.26473-(-12.14946)));
            yy = -2.3161 + (((tickAnim - 17) / 24) * (-2.94483-(-2.3161)));
            zz = 3.76962 + (((tickAnim - 17) / 24) * (0.57293-(3.76962)));
        }
        else if (tickAnim >= 41 && tickAnim < 57) {
            xx = -1.26473 + (((tickAnim - 41) / 16) * (-3.91546-(-1.26473)));
            yy = -2.94483 + (((tickAnim - 41) / 16) * (3.5144+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-2.94483)));
            zz = 0.57293 + (((tickAnim - 41) / 16) * (-1.92698-(0.57293)));
        }
        else if (tickAnim >= 57 && tickAnim < 66) {
            xx = -3.91546 + (((tickAnim - 57) / 9) * (5.37103-(-3.91546)));
            yy = 3.5144+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 57) / 9) * (9.34989-(3.5144+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            zz = -1.92698 + (((tickAnim - 57) / 9) * (-6.21133-(-1.92698)));
        }
        else if (tickAnim >= 66 && tickAnim < 93) {
            xx = 5.37103 + (((tickAnim - 66) / 27) * (5.58454-(5.37103)));
            yy = 9.34989 + (((tickAnim - 66) / 27) * (9.81444-(9.34989)));
            zz = -6.21133 + (((tickAnim - 66) / 27) * (-1.92698-(-6.21133)));
        }
        else if (tickAnim >= 93 && tickAnim < 102) {
            xx = 5.58454 + (((tickAnim - 93) / 9) * (6.33454-(5.58454)));
            yy = 9.81444 + (((tickAnim - 93) / 9) * (9.81444-(9.81444)));
            zz = -1.92698 + (((tickAnim - 93) / 9) * (-1.92698-(-1.92698)));
        }
        else if (tickAnim >= 102 && tickAnim < 122) {
            xx = 6.33454 + (((tickAnim - 102) / 20) * (-5.92654-(6.33454)));
            yy = 9.81444 + (((tickAnim - 102) / 20) * (-3.04453-(9.81444)));
            zz = -1.92698 + (((tickAnim - 102) / 20) * (-0.00983-(-1.92698)));
        }
        else if (tickAnim >= 122 && tickAnim < 140) {
            xx = -5.92654 + (((tickAnim - 122) / 18) * (-0.49237-(-5.92654)));
            yy = -3.04453 + (((tickAnim - 122) / 18) * (-1.88248-(-3.04453)));
            zz = -0.00983 + (((tickAnim - 122) / 18) * (5.97423-(-0.00983)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            yy = -0.55 + (((tickAnim - 0) / 41) * (-0.55-(-0.55)));
            zz = 1.4 + (((tickAnim - 0) / 41) * (1.4-(1.4)));
        }
        else if (tickAnim >= 41 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 41) / 99) * (0-(0)));
            yy = -0.55 + (((tickAnim - 41) / 99) * (-0.55-(-0.55)));
            zz = 1.4 + (((tickAnim - 41) / 99) * (1.4-(1.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 41) {
            xx = 4 + (((tickAnim - 17) / 24) * (0-(4)));
            yy = 0 + (((tickAnim - 17) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 24) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 41) / 16) * (7-(0)));
            yy = 0 + (((tickAnim - 41) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 16) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 7 + (((tickAnim - 57) / 3) * (2.15-(7)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 66) {
            xx = 2.15 + (((tickAnim - 60) / 6) * (0-(2.15)));
            yy = 0 + (((tickAnim - 60) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 6) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 66) / 27) * (0.75-(0)));
            yy = 0 + (((tickAnim - 66) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 27) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 102) {
            xx = 0.75 + (((tickAnim - 93) / 9) * (0-(0.75)));
            yy = 0 + (((tickAnim - 93) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 9) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 102) / 20) * (7.25-(0)));
            yy = 0 + (((tickAnim - 102) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 20) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 140) {
            xx = 7.25 + (((tickAnim - 122) / 18) * (0-(7.25)));
            yy = 0 + (((tickAnim - 122) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = -1.14818 + (((tickAnim - 0) / 140) * (-0.99979-(-1.14818)));
            yy = 2.4176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*-0.5 + (((tickAnim - 0) / 140) * (2.4176-(2.4176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*-0.5)));
            zz = -4.45778 + (((tickAnim - 0) / 140) * (-4.45778-(-4.45778)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightFlipper, backRightFlipper.rotateAngleX + (float) Math.toRadians(xx), backRightFlipper.rotateAngleY + (float) Math.toRadians(yy), backRightFlipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 10 + (((tickAnim - 0) / 140) * (10-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightFlipper2, backRightFlipper2.rotateAngleX + (float) Math.toRadians(xx), backRightFlipper2.rotateAngleY + (float) Math.toRadians(yy), backRightFlipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 9.5 + (((tickAnim - 0) / 140) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 5.5 + (((tickAnim - 0) / 140) * (5.5-(5.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightFlipper3, backRightFlipper3.rotateAngleX + (float) Math.toRadians(xx), backRightFlipper3.rotateAngleY + (float) Math.toRadians(yy), backRightFlipper3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = 0.325 + (((tickAnim - 0) / 140) * (0.325-(0.325)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightFlipper3.rotationPointX = this.backRightFlipper3.rotationPointX + (float)(xx);
        this.backRightFlipper3.rotationPointY = this.backRightFlipper3.rotationPointY - (float)(yy);
        this.backRightFlipper3.rotationPointZ = this.backRightFlipper3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 15 + (((tickAnim - 0) / 140) * (15-(15)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightFlipper4, backRightFlipper4.rotateAngleX + (float) Math.toRadians(xx), backRightFlipper4.rotateAngleY + (float) Math.toRadians(yy), backRightFlipper4.rotateAngleZ + (float) Math.toRadians(zz));

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        this.faceTarget(f3, f4, 5, neck1);
        this.faceTarget(f3, f4, 5, neck2);
        this.faceTarget(f3, f4, 5, head);

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        EntityPrehistoricFloraKronosaurus ee = (EntityPrehistoricFloraKronosaurus) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

