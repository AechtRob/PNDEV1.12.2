package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHolonema extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r33;

    private ModelAnimator animator;

    public ModelHolonema() {
        this.textureWidth = 66;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 21, 0, -3.0F, -5.8F, -3.8F, 6, 5, 4, -0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 43, 49, -2.5F, -4.8F, -5.8F, 5, 2, 2, -0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -0.8F, -3.8F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 26, -1.5F, -2.0F, -4.0F, 5, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, -2.8097F, -9.3041F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.24F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 43, 54, -0.5F, -1.0F, 0.0F, 4, 1, 2, 0.006F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.1F, -2.6024F, -9.3139F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 57, 21, -1.975F, -1.05F, 0.0F, 0, 1, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 57, 21, 1.775F, -1.05F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.1F, -3.3434F, -10.0304F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 57, 18, -2.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 57, 18, 1.8F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.9807F, -8.8342F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 57, 7, -1.5F, -0.75F, -0.7F, 3, 1, 0, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 50, -2.0F, -1.0F, -1.0F, 4, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -4.3935F, -8.8959F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.829F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 55, -1.5F, 0.0F, -1.0F, 3, 1, 1, 0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.4523F, -4.0795F, -8.0962F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3537F, -0.5421F, 0.6932F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 57, 11, -0.775F, -0.325F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.4523F, -4.0795F, -8.0962F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3537F, 0.5421F, -0.6932F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 57, 11, -0.225F, -0.325F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -5.0023F, -8.1026F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6545F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 15, -1.5F, 1.0F, -1.0F, 4, 1, 1, 0.003F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 53, 15, -1.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -7.1515F, -4.729F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.5672F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 21, 18, -2.5F, 0.0F, -4.0F, 5, 3, 4, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -7.6691F, -2.7971F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 42, 0, -2.5F, 0.0F, -2.0F, 6, 4, 2, -0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -7.8F, 0.2F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 21, 10, -1.5F, 0.0F, 0.0F, 5, 2, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -7.8F, 0.2F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 17, 35, -2.5F, 0.0F, -3.0F, 6, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, -0.8F, -0.3F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0524F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 15, -1.5F, -5.05F, 0.3F, 5, 5, 5, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-3.8648F, -2.0868F, 0.3564F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0248F, 0.4098F, -0.14F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 42, 0.0F, -0.25F, -2.0F, 2, 1, 6, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-3.02F, -4.1455F, -4.2817F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0584F, -0.2905F, 0.0218F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 56, 54, -0.075F, -2.0F, -2.0F, 1, 3, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(3.02F, -4.1455F, -4.2817F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0584F, 0.2905F, -0.0218F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 56, 54, -0.925F, -2.0F, -2.0F, 1, 3, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.8774F, -4.6391F, -2.0488F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0517F, -0.1328F, 0.0178F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 53, 33, -0.525F, -2.375F, -2.3F, 1, 4, 4, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.8774F, -4.6391F, -2.0488F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0517F, 0.1328F, -0.0178F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 53, 33, -0.475F, -2.375F, -2.3F, 1, 4, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-4.6606F, -2.0248F, -1.4774F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.16F, -0.4564F, 0.0717F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 33, -0.4F, -1.0F, -5.7F, 2, 2, 6, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(4.6606F, -2.0248F, -1.4774F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.16F, 0.4564F, -0.0717F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 33, -1.6F, -1.0F, -5.7F, 2, 2, 6, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-3.894F, -2.3099F, 0.3615F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.026F, 0.2624F, 0.0374F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 30, 42, 0.6F, -3.725F, -1.075F, 1, 4, 5, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(3.894F, -2.3099F, 0.3615F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.026F, -0.2624F, -0.0374F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 30, 42, -1.6F, -3.725F, -1.075F, 1, 4, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(3.8648F, -2.0868F, 0.3564F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0248F, -0.4098F, 0.14F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 42, -2.0F, -0.25F, -2.0F, 2, 1, 6, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(4.0021F, -2.3224F, -1.7447F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.2803F, -0.1731F, -1.228F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 17, 39, 0.0F, 0.0F, 0.0F, 0, 7, 6, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-4.0021F, -2.3224F, -1.7447F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.2803F, 0.1731F, 1.228F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 17, 39, 0.0F, 0.0F, 0.0F, 0, 7, 6, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.25F, -2.6929F, -7.4061F);
        this.main.addChild(jaw);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.25F, 0.0051F, -2.0308F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.384F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 58, -3.3F, -1.025F, 0.025F, 0, 1, 1, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 58, 0.3F, -1.025F, 0.025F, 0, 1, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.25F, -0.1168F, -1.898F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.24F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 57, 9, -0.5F, -0.8F, 0.0F, 3, 1, 0, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 15, 53, -1.0F, -0.6F, -0.3F, 4, 1, 3, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.7013F, 3.735F);
        this.main.addChild(tail);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, -1.6321F, 3.9011F);
        this.tail.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2618F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 19, 26, -1.5F, -0.5F, -4.0F, 4, 4, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 1.7916F, 4.1684F);
        this.tail.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.192F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 36, 26, -1.5F, -3.0F, -4.0F, 4, 3, 4, 0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.9732F, 2.0135F, 2.1408F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.44F, 0.1853F, -0.9009F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 9, 55, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.9732F, 2.0135F, 2.1408F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.44F, -0.1853F, 0.9009F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 9, 55, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.109F, 3.3214F);
        this.tail.addChild(tail2);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0F, -0.4259F, 4.452F);
        this.tail2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1484F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 40, 18, -0.5F, -0.95F, -5.0F, 3, 2, 5, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.0F, 2.1F, -0.1329F);
        this.tail2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0698F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 36, 34, -0.5F, -2.2F, -0.25F, 3, 2, 5, 0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3087F, 3.5657F);
        this.tail2.addChild(tail3);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.5F, 0.2654F, 4.7864F);
        this.tail3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0873F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 43, 42, 0.5F, -0.4F, -5.05F, 2, 1, 5, 0.003F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, -1.6846F, -0.2136F);
        this.tail3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0393F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 42, 7, -0.5F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.1512F, 3.9025F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2618F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 30, 52, -0.5F, -0.25F, -0.05F, 1, 1, 5, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, 0.0F, -0.25F, -0.05F, 0, 4, 10, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.75F, 4.95F);
        this.tail4.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1309F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 53, 26, -0.5F, -0.7F, -5.0F, 1, 1, 5, -0.003F, false));

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
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.258F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(235);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 1.4F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.14F;
        this.main.offsetY = -0.19F;
        this.main.offsetZ = 0.06F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.18F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
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

        //this.head.offsetY = 0.8F;

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
//            this.body.offsetX = -0.5F;
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
        animator.rotate(this.jaw, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

