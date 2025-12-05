package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBrazilichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
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
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer tail4;

    private ModelAnimator animator;

    public ModelBrazilichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 17.25F, 1.0F);
        this.root.cubeList.add(new ModelBox(root, 0, 0, -2.5F, -0.25F, -7.0F, 5, 6, 10, 0.0F, false));
        this.root.cubeList.add(new ModelBox(root, 19, 17, 0.0F, -5.75F, -2.0F, 0, 6, 8, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 11.75F, 1.0F);
        this.root.addChild(head);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, -8.6715F, -11.4904F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 38, -0.5F, -1.8F, 0.5F, 4, 2, 4, 0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -8.2217F, -13.5106F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.7854F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 17, -0.75F, -0.575F, -0.275F, 0, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.5F, -8.1273F, -12.979F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -2.9F, -0.5537F, 2.186F, 0, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -7.6624F, -12.5629F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 3, -1.25F, -1.0F, -0.225F, 0, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -7.6023F, -14.879F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 4, 17, 0.1F, -0.444F, 0.1821F, 0, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.75F, -8.0802F, -14.8187F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3491F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 17, 0.0F, -0.5F, -0.65F, 0, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -7.6273F, -14.904F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 3, 0.1F, -0.4319F, -1.5847F, 0, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -7.6624F, -12.5629F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 3, 1.25F, -1.0F, -0.225F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, -8.1273F, -12.979F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 2.9F, -0.5537F, 2.186F, 0, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 45, 25, -0.5F, -1.0537F, 0.186F, 4, 1, 3, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, -7.6023F, -14.879F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 4, 17, -0.1F, -0.444F, 0.1821F, 0, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 49, -2.5F, -0.994F, -0.0179F, 3, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.75F, -8.0802F, -14.8187F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3491F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 17, 0.0F, -0.5F, -0.65F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -8.2217F, -13.5106F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.7854F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 17, 0.75F, -0.575F, -0.275F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, -7.6273F, -14.904F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 7, 3, -0.1F, -0.4319F, -1.5847F, 0, 1, 1, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 23, 51, -2.5F, -0.9819F, -1.9847F, 3, 1, 2, 0.001F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, -9.55F, -16.45F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 11, -2.5F, -0.0092F, 0.0047F, 3, 1, 4, -0.001F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 0, -2.5F, -1.6842F, 2.5047F, 3, 1, 2, -0.003F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 44, 47, -2.5F, -0.7592F, 1.5047F, 3, 1, 3, -0.002F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, -11.55F, -12.975F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.5236F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 41, 40, -0.5F, -0.0147F, -5.0047F, 3, 1, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -12.0F, -8.0F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 31, 27, -1.5F, 0.0F, -5.0F, 4, 3, 5, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(1.35F, -9.3F, -14.2F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.3927F, 0.0F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 0, 52, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 4, 0, -0.425F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.35F, -9.3F, -14.2F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.3927F, 0.0F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 52, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 4, 0, -0.575F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -7.2105F, -7.9889F);
        this.head.addChild(jaw);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, -1.0669F, -4.9901F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 52, 17, -1.75F, -0.1787F, 1.211F, 0, 1, 3, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.75F, -0.8724F, -4.6678F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 12, 19, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.0F, -0.5419F, -6.8901F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2618F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 17, -1.25F, -0.494F, 0.2321F, 0, 1, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.75F, 0.0162F, -7.0179F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.8727F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 21, 0, -0.75F, -0.825F, -0.375F, 0, 1, 1, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, -0.5669F, -6.9151F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3054F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 6, 7, -1.25F, -0.4819F, -1.9847F, 0, 1, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.0669F, -4.9901F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0436F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 52, 17, 1.75F, -0.1787F, 1.211F, 0, 1, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.75F, -0.8724F, -4.6678F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0436F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 12, 19, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.25F, 0.0162F, -7.0179F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.8727F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 21, 0, 0.75F, -0.825F, -0.375F, 0, 1, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.5419F, -6.8901F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2618F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 10, 17, 1.25F, -0.494F, 0.2321F, 0, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 30, 45, -0.5F, 0.006F, -0.2679F, 2, 1, 2, -0.001F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.9846F, -5.2914F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0262F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 21, 0, -0.5F, -1.9734F, 0.0002F, 3, 2, 6, -0.001F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.5669F, -6.9151F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3054F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 6, 7, 1.25F, -0.4819F, -1.9847F, 0, 1, 1, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 46, 32, -0.5F, 0.0181F, -1.9847F, 2, 1, 4, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.25F, 5.25F, -6.5F);
        this.root.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.228F, 0.1298F, -0.5087F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 35, 45, 0.0F, 0.0F, 0.0F, 0, 6, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.25F, 5.25F, -6.5F);
        this.root.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.228F, -0.1298F, 0.5087F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 35, 45, 0.0F, 0.0F, 0.0F, 0, 6, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 2.7464F, 2.4656F);
        this.root.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 28, 12, -2.0F, -2.4964F, 0.0344F, 4, 5, 5, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -2.9964F, 0.0344F);
        this.tail.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0829F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 35, 4, -1.5F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 3.0036F, 0.0344F);
        this.tail.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0873F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 10, 17, -1.5F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.9F, 2.5036F, 2.7844F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.2331F, 0.1607F, -0.8761F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 0, 0, 0.0F, 0.0F, 0.0F, 0, 4, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.9F, 2.5036F, 2.7844F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.2331F, -0.1607F, 0.8761F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 0, 0, 0.0F, 0.0F, 0.0F, 0, 4, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2249F, 4.413F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 14, 32, -1.5F, -1.7715F, 0.1214F, 3, 4, 5, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, 2.2285F, 2.1214F);
        this.tail2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.3491F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 17, -0.5F, 0.25F, 0.0F, 0, 3, 3, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, -2.2715F, 0.1214F);
        this.tail2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0873F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 42, 18, -0.5F, -0.1F, 0.075F, 2, 1, 5, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, 2.7285F, 0.1214F);
        this.tail2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0873F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 12, 42, -0.5F, -0.95F, 0.025F, 2, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1876F, 4.6099F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 31, 36, -1.0F, -1.4591F, 0.0114F, 2, 3, 5, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, -1.9591F, 0.0114F);
        this.tail3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0873F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 45, 0.0F, -0.175F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, 2.0409F, -0.4886F);
        this.tail3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0873F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 22, 44, 0.0F, -0.9F, 0.55F, 1, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0409F, 4.5114F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 47, 0, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 17, 0.0F, -5.0F, 0.5F, 0, 10, 9, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.root.offsetZ = -0.02F;
        this.root.offsetY = -0.2F;
        this.root.offsetX = -0.03F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, -0.5F, 0.3F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail2, -0.1F, -0.2F, 0.0F);
        this.setRotateAngle(tail3, -0.1F, -0.3F, 0.0F);
        this.setRotateAngle(tail4, -0.1F, -0.3F, 0.0F);
        this.root.offsetZ = 0.0F;
        this.root.offsetY = -0.15F;
        this.root.offsetX = 0.0F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.0F;
        this.root.offsetX = 0.8F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(2);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 2.2F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, -0.1F, 0.3F, 0.0F);
        this.setRotateAngle(tail4, -0.1F, 0.3F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }
    
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.Acrolepis.offsetY = 1.0F;

        if (e instanceof EntityLiving) {
            if (((EntityLiving)e).isAIDisabled()) {
                return;
            }
        }

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still * 2, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(root, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftFin, (float) (speed * 1.35), 0.38F, false, 0.8F, 0, f2, 0.5F);
        this.walk(frontLeftFin, (float) (speed * 1.35), 0.28F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 1.35), -0.38F, false, 0.8F, 0, f2, 0.5F);
        this.walk(frontRightFin, (float) (speed * 1.35), -0.28F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin, (float) (speed * 1.35), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.walk(backLeftFin, (float) (speed * 1.35), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 1.35), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.walk(backRightFin, (float) (speed * 1.35), -0.18F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.root.offsetY = 0.30F;
            this.bob(root, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.28F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.Head, 0,0,-0.5F);
        //animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

