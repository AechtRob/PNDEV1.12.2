package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDhanguura extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
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
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private ModelAnimator animator;


    public ModelDhanguura() {
        animator = ModelAnimator.create();
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 27, 0, -4.5F, -5.0F, -4.0F, 9, 5, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.6571F, -10.4284F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0654F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 50, -3.0F, -0.5F, -5.0F, 6, 1, 5, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 0.0F, -4.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 56, 6, -2.5F, -2.0F, -7.0F, 7, 2, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 11, -4.0F, -3.0F, -5.0F, 10, 3, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.5949F, -17.5577F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.096F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 57, -0.5F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.856F, -15.5749F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 46, 65, -1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.2234F, -3.2562F, -10.9575F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1941F, -0.3741F, -0.3085F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 53, 57, -0.2F, -0.05F, -1.275F, 2, 3, 4, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.5F, -2.8323F, -15.7913F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2338F, -0.0686F, -0.2845F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 57, -1.2F, 0.275F, 0.0F, 2, 1, 5, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.204F, -0.7299F, -15.5198F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0387F, -0.0416F, -0.2106F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 58, 11, 0.0F, -2.0F, 0.0F, 1, 2, 4, -0.006F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(4.2234F, -3.2562F, -10.9575F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1941F, 0.3741F, 0.3085F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 53, 57, -1.8F, -0.05F, -1.275F, 2, 3, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.3955F, -1.7684F, -16.8733F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2874F, -0.6179F, -0.4378F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 62, 24, -0.675F, -0.575F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.3955F, -1.7684F, -16.8733F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2874F, 0.6179F, 0.4378F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 62, 24, -0.325F, -0.575F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.0873F, -0.9702F, -18.2939F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1786F, -0.9498F, -0.0809F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 67, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.0873F, -0.9702F, -18.2939F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0006F, -0.3906F, -0.2104F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 57, 65, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.4492F, -1.7692F, -15.6945F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.25F, -0.3653F, -0.3592F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 62, 0.0F, -0.5F, -3.0F, 2, 1, 3, 0.003F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(3.4492F, -1.7692F, -15.6945F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.25F, 0.3653F, 0.3592F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 62, -2.0F, -0.5F, -3.0F, 2, 1, 3, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(3.204F, -0.7299F, -15.5198F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0387F, 0.0416F, 0.2106F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 58, 11, -1.0F, -2.0F, 0.0F, 1, 2, 4, -0.006F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.0873F, -0.9702F, -18.2939F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0006F, 0.3906F, 0.2104F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 57, 65, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.0873F, -0.9702F, -18.2939F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1786F, 0.9498F, 0.0809F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 11, 67, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(2.5F, -2.8323F, -15.7913F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2338F, 0.0686F, 0.2845F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 57, -0.8F, 0.275F, 0.0F, 2, 1, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -4.3474F, -8.9572F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2182F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 56, 36, -3.5F, 0.0F, -2.0F, 7, 1, 2, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 46, 50, -2.5F, 0.0F, -7.0F, 5, 1, 5, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -5.0F, -4.0F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 20, -5.5F, 0.0F, -5.0F, 11, 3, 5, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -2.975F, 0.0F);
        this.main.addChild(tail);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 2.6947F, 6.8933F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0349F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 29, 29, -3.0F, -3.0F, -7.0F, 6, 3, 7, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-3.5F, -1.9564F, 0.999F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2182F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 61, 3.0F, -4.0F, 0.0F, 0, 4, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0436F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 29, -4.0F, 0.0F, 0.0F, 7, 3, 7, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(3.0F, 2.5F, 1.0F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.0317F, -0.3477F, 0.0928F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 19, 57, -0.5F, 0.0F, 0.0F, 5, 0, 4, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-4.0F, 2.5F, 1.0F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.0317F, 0.3477F, -0.0928F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 19, 57, -4.5F, 0.0F, 0.0F, 5, 0, 4, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail.addChild(tail2);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, 2.625F, 0.05F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 46, 40, -1.5F, -2.925F, 0.0F, 4, 3, 6, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, -1.6F, 0.0F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0873F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 23, 40, -2.5F, -0.125F, 0.2F, 5, 3, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.0F, 5.0F);
        this.tail2.addChild(tail3);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.0F, 1.3F, 0.0F);
        this.tail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0873F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 56, 27, -0.5F, -1.825F, 0.0F, 2, 2, 6, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -2.1F, 0.0F);
        this.tail3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0436F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 52, -2.0F, -0.1F, 0.0F, 3, 2, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.5F, -0.85F, 5.0F);
        this.tail3.addChild(tail4);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.3491F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, 1.0F, -0.65F, 0.0F, 0, 6, 13, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 40, 0.0F, -0.65F, 0.0F, 2, 2, 9, -0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(4.5F, -1.0F, -7.5F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.0547F, -0.3006F, 0.1828F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 33, 20, 0.0F, 0.0F, 0.0F, 8, 0, 6, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-4.5F, -1.0F, -7.5F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.0547F, 0.3006F, -0.1828F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 33, 20, -8.0F, 0.0F, 0.0F, 8, 0, 6, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.3703F, -11.4701F);
        this.main.addChild(jaw);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.5331F, -6.7856F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1004F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 66, 65, -1.0F, -0.55F, -0.875F, 2, 1, 2, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 1.2307F, -3.3196F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0567F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 11, 62, -1.5F, -1.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-3.0F, 1.2307F, -3.3196F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0502F, -0.3051F, -0.0138F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 35, 64, 0.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-2.102F, 1.0677F, -6.1774F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.065F, -0.7408F, 0.015F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 66, 61, 0.0F, -1.0F, -2.0F, 2, 1, 2, -0.003F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(2.102F, 1.0677F, -6.1774F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.065F, 0.7408F, -0.015F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 66, 61, -2.0F, -1.0F, -2.0F, 2, 1, 2, -0.003F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(3.0F, 1.2307F, -3.3196F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0502F, 0.3051F, 0.0138F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 35, 64, -2.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 1.065F, 0.4768F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0436F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 62, 18, -3.0F, -2.0F, -3.8F, 1, 1, 4, 0.0F, true));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 62, 18, 2.0F, -2.0F, -3.8F, 1, 1, 4, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 56, 0, -3.0F, -1.0F, -3.8F, 6, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleZ = (float) Math.toRadians(0);
        this.main.rotateAngleY = (float) Math.toRadians(180);
        this.main.rotateAngleX = (float) Math.toRadians(270);
        this.main.offsetY = -0.2F;
        this.main.offsetZ = -0.1F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetZ = -0.05F;
        this.main.offsetY = -0.2F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.8F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.6F, -0.2F);
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
        this.resetToDefaultPose();

        this.main.offsetZ = 0.4F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftFin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontLeftFin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(270);
//            this.body.offsetY = -0.05F;
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -3, f2, 1F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -3, f2, 1F * still);

        }

    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}
