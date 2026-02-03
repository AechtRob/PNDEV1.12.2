package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraCowralepis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelCowralepis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer leftSpike;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer rightSpike;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;

    private ModelAnimator animator;


    public ModelCowralepis() {
        this.textureWidth = 55;
        this.textureHeight = 55;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 30, 22, -2.5F, -2.0F, 2.0F, 5, 2, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 15, 12, -3.0F, -2.5F, -1.0F, 6, 1, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 15, 6, -3.0F, -2.0F, -1.0F, 6, 2, 3, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.3263F, -1.6137F, -2.5438F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 2.1231F, 1.4875F, 1.7936F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 39, -2.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.6509F, -1.0275F, -5.4352F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1665F, 1.4072F, -0.3408F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 38, -3.0F, -0.025F, 0.025F, 3, 1, 2, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.7604F, -1.4092F, -5.4828F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6359F, 1.3688F, 0.3467F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 35, -3.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(4.3263F, -1.6137F, -2.5438F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 2.1231F, -1.4875F, -1.7936F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 39, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.6509F, -1.0275F, -5.4352F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1665F, -1.4072F, 0.3408F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 38, 0.0F, -0.025F, 0.025F, 3, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.7604F, -1.4092F, -5.4828F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.6359F, -1.3688F, -0.3467F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 35, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.513F, -1.5921F, -5.9526F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2691F, 1.0814F, 0.0117F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 43, -0.5F, 0.025F, -1.025F, 1, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.1309F, -0.5482F, -6.2752F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1251F, 1.0814F, 0.0117F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 41, 32, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.003F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.8202F, -1.3983F, -7.248F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2211F, 1.0814F, 0.0117F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 39, -2.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.3314F, -1.0413F, -7.4037F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2293F, 0.501F, -0.0112F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 35, -0.5F, 0.0F, 0.0F, 1, 1, 1, -0.003F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.4651F, -1.5496F, -6.8525F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2598F, 0.501F, -0.0112F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 43, 19, -1.0F, -0.125F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(3.1309F, -0.5482F, -6.2752F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1251F, -1.0814F, -0.0117F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 41, 32, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.513F, -1.5921F, -5.9526F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2691F, -1.0814F, -0.0117F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 29, 43, -0.5F, 0.025F, -1.025F, 1, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.8202F, -1.3983F, -7.248F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2211F, -1.0814F, -0.0117F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 29, 39, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.3314F, -1.0413F, -7.4037F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2293F, -0.501F, 0.0112F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 35, -0.5F, 0.0F, 0.0F, 1, 1, 1, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.4651F, -1.5496F, -6.8525F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2598F, -0.501F, 0.0112F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 43, 19, 0.0F, -0.125F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.7176F, -6.943F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3491F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 38, 0, -2.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, -2.2385F, -3.9886F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 21, 0, -1.0F, 0.0F, -3.0F, 5, 1, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5F, -2.5F, -1.0F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 15, 17, -1.0F, 0.0F, -3.0F, 5, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, 0.0F, -1.0F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0131F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, -2.0F, -1.0F, -4.0F, 6, 1, 4, 0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -2.5F, 2.0F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 11, -1.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.3921F, 3.461F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 11, 39, 0.0F, -0.9579F, 0.014F, 0, 1, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.9043F, 0.05F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0524F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 15, 29, -1.5F, 0.0F, 0.0F, 3, 1, 4, -0.006F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, 1.3921F, 0.039F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0131F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 15, 22, -1.0F, -2.0F, 0.0F, 3, 2, 4, -0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0F, 1.2707F, 0.95F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, -0.5236F, 0.3491F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 34, 15, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0F, 1.2707F, 0.95F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, 0.5236F, -0.3491F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 34, 15, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3921F, 3.539F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 30, 32, -0.025F, -1.3F, -0.025F, 0, 1, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 39, -0.025F, 0.2F, 0.975F, 0, 1, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.8671F, -0.0484F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0654F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 17, -1.0F, -0.975F, 0.05F, 2, 1, 5, -0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0436F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 24, -1.0F, -0.05F, 0.0F, 2, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 31, -0.5F, -0.75F, 0.0F, 1, 1, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 6, 0.0F, -1.25F, 0.0F, 0, 3, 7, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(3.0F, -0.25F, 1.0F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.0975F, 0.3945F, 0.0188F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 41, 36, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-3.0F, -0.25F, 1.0F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.0975F, -0.3945F, -0.0188F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 41, 36, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.7718F, -4.9276F);
        this.main.addChild(jaw);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -0.2752F, 0.3411F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0175F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 30, 27, -2.0F, 0.0F, -2.95F, 4, 1, 3, -0.003F, false));

        this.leftSpike = new AdvancedModelRenderer(this);
        this.leftSpike.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.main.addChild(leftSpike);
        this.setRotateAngle(leftSpike, -0.0131F, 0.0F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(5.0211F, -0.5F, -3.0893F);
        this.leftSpike.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.1745F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 34, 5, -0.85F, -0.5F, -1.5F, 1, 1, 4, 0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(3.6144F, -2.3512F, -1.9625F);
        this.leftSpike.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0693F, 0.1849F, 0.3981F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 43, 15, 0.025F, 0.3F, -1.0F, 2, 1, 2, -0.003F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 42, 0.025F, 0.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(4.1743F, -0.5F, -1.0076F);
        this.leftSpike.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0873F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 32, 17, -0.975F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

        this.rightSpike = new AdvancedModelRenderer(this);
        this.rightSpike.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.main.addChild(rightSpike);
        this.setRotateAngle(rightSpike, -0.0131F, 0.0F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-5.0211F, -0.5F, -3.0893F);
        this.rightSpike.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.1745F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 34, 5, -0.15F, -0.5F, -1.5F, 1, 1, 4, 0.003F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-3.6144F, -2.3512F, -1.9625F);
        this.rightSpike.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0693F, -0.1849F, -0.3981F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 43, 15, -2.025F, 0.3F, -1.0F, 2, 1, 2, -0.003F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 42, -2.025F, 0.0F, -1.0F, 2, 1, 2, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-4.1743F, -0.5F, -1.0076F);
        this.rightSpike.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -0.0873F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 32, 17, -1.025F, -0.5F, -3.0F, 2, 1, 3, 0.0F, true));

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
        this.main.offsetZ = 0.02F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.1F;
        this.main.offsetY = 0.1F;
        this.main.offsetZ = 0.03F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.2F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.8F;
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
        //this.headshield.offsetZ = -0.4F;
        //this.main.offsetY = 0.7F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        EntityPrehistoricFloraCowralepis cowra = (EntityPrehistoricFloraCowralepis) e;
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
        if (isAtBottom && !cowra.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.23F;
            bottomModifier = 0.8F;
            swingModifier = 0.5F;
            finDegreeZ = (float)Math.toRadians(15);
            finDegreeY = (float)Math.toRadians(12.5);

            //this.bodylower.rotateAngleX = (float) Math.toRadians(-10);

        }



        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {



            this.chainWave(fishTail, speed *0.5F* bottomModifier, 0.02F, -1, f2, 1);
            this.chainSwing(fishTail, speed *0.5F* bottomModifier, taildegree * bottomModifier, -3, f2, 1);
            this.swing(main, speed *0.5F* bottomModifier, 0.3F * bottomModifier * swingModifier, true, 0, 0, f2, 1 * swingModifier);
            if(isAtBottom && !cowra.getIsFast()) {
                this.walk(jaw, (float) (speed * 0.2), (float) Math.toRadians(20), true, 0.5F, -0.3F, f2, 1);
            } else {
                this.walk(jaw, (float) (speed * 0.4), (float) Math.toRadians(15), true, 0.2F, -0.25F, f2, 1);
            }
            this.flap(frontLeftFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeZ * inwater, true, -3F, 0, f2, 1 * inwater);
            this.swing(frontLeftFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeY * inwater, true, -3F, 0, f2, 1 * inwater);
            this.flap(frontRightFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeZ * inwater, true, -3F, 0, f2, 1 * inwater);
            this.swing(frontRightFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), finDegreeY * inwater, true, -3F, 0, f2, 1 * inwater);

            this.flap(backLeftFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), 0.15F * inwater, true, -0.1F, 0.1F, f2, 1 * inwater);
            this.swing(backLeftFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), 0.1F * inwater, true, 0, 0, f2, 1 * inwater);
            this.flap(backRightFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), -0.15F * inwater, true, 0.1F, -0.1F, f2, 1 * inwater);
            this.swing(backRightFin, (float) (speed * 0.45 * (bottomModifier * 2.5F)), -0.1F * inwater, true, 0, 0, f2, 1 * inwater);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.02F;
                this.chainWave(fishTail, speed, 0.05F, -1, f2, 1);
                this.chainSwing(fishTail, speed, 0.10F, -3, f2, 1);
            }
        }
    }


}
