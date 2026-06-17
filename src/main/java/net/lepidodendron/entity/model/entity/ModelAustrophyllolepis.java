package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAustrophyllolepis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelAustrophyllolepis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer backRightFin2;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer leftSpike;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer rightSpike;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;

    private ModelAnimator animator;


    public ModelAustrophyllolepis() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, -1.0F);
        this.main.cubeList.add(new ModelBox(main, 21, 14, -2.5F, -2.0F, 2.0F, 5, 2, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 7, -3.0F, -2.5F, -2.0F, 6, 1, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -2.0F, -2.0F, 6, 2, 4, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 0.0F, -2.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 13, -2.0F, -1.0F, -4.0F, 6, 1, 4, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.2583F, -2.0481F, -3.5594F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3022F, 1.3989F, 0.2114F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 39, -2.0F, 0.0F, 0.0F, 2, 2, 2, -0.003F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(4.2583F, -2.0481F, -3.5594F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3022F, -1.3989F, -0.2114F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 39, 0.0F, 0.0F, 0.0F, 2, 2, 2, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.5878F, -2.0099F, -5.4433F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1522F, 1.2283F, 0.0569F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 39, -2.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.5878F, -2.0099F, -5.4433F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1522F, -1.2283F, -0.0569F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 39, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.5668F, -1.3546F, -6.9702F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1065F, 0.4746F, 0.0185F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, 23, 0.025F, 0.25F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.5668F, -1.3546F, -6.9702F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1065F, -0.4746F, -0.0185F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 43, 23, -1.025F, 0.25F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.4486F, -0.5479F, -5.2904F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0225F, 1.0371F, -0.0576F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 41, -0.025F, -0.5F, -0.025F, 2, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.5558F, -1.5152F, -5.378F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2617F, 1.0088F, 0.163F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 39, 32, 0.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(3.4486F, -0.5479F, -5.2904F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0225F, -1.0371F, 0.0576F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 41, -1.975F, -0.5F, -0.025F, 2, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.0259F, -1.3152F, -5.6212F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4228F, 1.011F, 0.1471F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 43, 26, -0.5F, -0.5F, -0.45F, 1, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(3.0259F, -1.3152F, -5.6212F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.4228F, -1.011F, -0.1471F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 43, 26, -0.5F, -0.5F, -0.45F, 1, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(3.5558F, -1.5152F, -5.378F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2617F, -1.0088F, -0.163F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 32, -2.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.65F, -1.7253F, -7.575F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2715F, 0.4623F, 0.1339F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 41, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.65F, -1.7253F, -7.575F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2715F, -0.4623F, -0.1339F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 41, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.8926F, -6.9507F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2628F, -0.0843F, -0.0226F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 27, 41, -1.7F, 0.0F, -0.5F, 2, 1, 1, -0.003F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.8926F, -6.9507F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2628F, 0.0843F, 0.0226F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 27, 41, -0.3F, 0.0F, -0.5F, 2, 1, 1, -0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, -2.1514F, -5.9848F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2618F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 36, -1.5F, 0.0F, -1.0F, 5, 1, 1, 0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -2.5F, -2.0F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 15, 19, -2.5F, 0.0F, -4.0F, 5, 1, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -2.5F, 2.0F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 34, 19, -2.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.3921F, 3.461F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 36, 0, 0.0F, -0.9579F, 0.014F, 0, 1, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.9043F, 0.05F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0524F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 30, -1.5F, 0.0F, 0.0F, 3, 1, 4, -0.006F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 1.3921F, 0.039F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0131F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 21, 7, -1.0F, -2.0F, 0.0F, 3, 2, 4, -0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0F, 1.2707F, 0.95F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, -0.5236F, 0.3491F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 34, 23, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0F, 1.2707F, 0.95F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, 0.5236F, -0.3491F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 34, 23, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.backRightFin2 = new AdvancedModelRenderer(this);
        this.backRightFin2.setRotationPoint(1.0F, 1.2707F, 0.95F);
        this.tail.addChild(backRightFin2);
        this.setRotateAngle(backRightFin2, 0.0F, -0.5236F, 0.3491F);
        this.backRightFin2.cubeList.add(new ModelBox(backRightFin2, 34, 23, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3921F, 3.539F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 32, -0.025F, -1.3F, -0.025F, 0, 1, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 36, 6, -0.025F, 0.2F, 0.975F, 0, 1, 4, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.8671F, -0.0484F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0654F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 21, 0, -1.0F, -0.975F, 0.05F, 2, 1, 5, -0.003F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 15, 25, -1.0F, -0.05F, 0.0F, 2, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 30, 25, -0.5F, -0.75F, 0.0F, 1, 1, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 19, 0.0F, -1.25F, 0.0F, 0, 3, 7, 0.0F, false));

        this.leftSpike = new AdvancedModelRenderer(this);
        this.leftSpike.setRotationPoint(3.5128F, -2.0099F, -4.9933F);
        this.main.addChild(leftSpike);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.4198F, 1.5F, 5.2459F);
        this.leftSpike.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.1309F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 39, 41, -1.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.309F, -0.0584F, 4.33F);
        this.leftSpike.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.029F, 0.203F, 0.1199F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 26, 37, -3.0F, 0.3F, -1.05F, 3, 1, 2, -0.006F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 36, 12, -3.0F, 0.0F, -1.05F, 3, 1, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.4198F, 2.0F, 5.2459F);
        this.leftSpike.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0306F, 0.2487F, -0.0004F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 26, 32, -3.0F, -1.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.rightSpike = new AdvancedModelRenderer(this);
        this.rightSpike.setRotationPoint(-3.5128F, -2.0099F, -4.9933F);
        this.main.addChild(rightSpike);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.4198F, 1.5F, 5.2459F);
        this.rightSpike.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.1309F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 39, 41, 0.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.309F, -0.0584F, 4.33F);
        this.rightSpike.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.029F, -0.203F, -0.1199F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 26, 37, 0.0F, 0.3F, -1.05F, 3, 1, 2, -0.006F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 36, 12, 0.0F, 0.0F, -1.05F, 3, 1, 2, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.4198F, 2.0F, 5.2459F);
        this.rightSpike.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0306F, -0.2487F, 0.0004F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 26, 32, 0.0F, -1.0F, -3.0F, 3, 1, 3, 0.0F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(3.0785F, -0.2875F, 0.5364F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.0975F, 0.3945F, 0.0188F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 36, 16, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-3.0785F, -0.2875F, 0.5364F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.0975F, -0.3945F, -0.0188F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 36, 16, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.0218F, -5.6776F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 37, 37, -1.5F, -0.1131F, -1.4965F, 3, 1, 2, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.rotateAngleZ = (float) Math.toRadians(90);
        this.main.offsetX = -0.1F;
        this.main.offsetY = -0.23F;
        this.main.offsetZ = 0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.05F;
        this.main.offsetY = -0.08F;
        this.main.offsetZ = 0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.6F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.0F;
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
        this.resetToDefaultPose();
        this.main.offsetZ = -0.2F;
        //this.headshield.offsetZ = -0.4F;
        //this.main.offsetY = 0.7F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        EntityPrehistoricFloraAustrophyllolepis phyllo = (EntityPrehistoricFloraAustrophyllolepis) e;
        float speed = 0.3F;
        float taildegree = 0.25F;
        float inwater = 1F;

        if (!e.isInWater()) {
            speed = 0.7F;
            inwater = 0.65F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        float bottomModifier = 1F;
        float swingModifier = 1F;
        float finDegreeZ = (float)Math.toRadians(25);
        float finDegreeY = (float)Math.toRadians(7.5);
        if (isAtBottom && !phyllo.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.25F;
            bottomModifier = 0.9F;
            swingModifier = 0.5F;
            finDegreeZ = (float)Math.toRadians(10);
            finDegreeY = (float)Math.toRadians(12.5);

            //this.bodylower.rotateAngleX = (float) Math.toRadians(-10);

        }



        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {



            this.chainWave(fishTail, speed *0.5F* bottomModifier, 0.02F, -1, f2, 1);
            this.chainSwing(fishTail, speed *0.5F* bottomModifier, taildegree * bottomModifier, -3, f2, 1);
            this.swing(main, speed *0.5F* bottomModifier, 0.3F * bottomModifier * swingModifier, true, 0, 0, f2, 1 * swingModifier);
            if(isAtBottom && !phyllo.getIsFast()) {
                this.walk(jaw, (float) (speed * 0.2), (float) Math.toRadians(20), true, 0.5F, -0.3F, f2, 1);
            } else {
                this.walk(jaw, (float) (speed * 0.4), (float) Math.toRadians(15), true, 0.2F, -0.25F, f2, 1);
            }
            this.flap(frontLeftFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeZ * inwater, true, -3F, 0, f2, 1 * inwater);
            this.swing(frontLeftFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeY * inwater, true, -3F, 0, f2, 1 * inwater);
            this.flap(frontRightFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeZ * inwater, true, 0F, 0, f2, 1 * inwater);
            this.swing(frontRightFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeY * inwater, true, 0, 0, f2, 1 * inwater);

            this.flap(backLeftFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), 0.15F * inwater, true, -0.1F, 0.1F, f2, 1 * inwater);
            this.swing(backLeftFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), 0.1F * inwater, true, 0, 0, f2, 1 * inwater);
            this.flap(backRightFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), -0.15F * inwater, true, 0.1F, -0.1F, f2, 1 * inwater);
            this.swing(backRightFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), -0.1F * inwater, true, 0, 0, f2, 1 * inwater);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.02F;
                this.main.offsetZ = -0.2F;
                this.chainWave(fishTail, speed, 0.05F, -1, f2, 1);
                this.chainSwing(fishTail, speed, 0.10F, -3, f2, 1);
            }
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
