package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelEpipetalichthys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;

    public ModelEpipetalichthys() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 11, 33, -1.0F, -1.0F, -7.75F, 2, 1, 2, 0.009F, false));
        this.main.cubeList.add(new ModelBox(main, 15, 0, -1.5F, -0.9F, -6.1519F, 3, 1, 4, 0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 15, 6, -2.0F, -0.9F, -2.1519F, 4, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.8516F, 0.0F, -1.889F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.0167F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 37, -3.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.3083F, 0.0F, -3.1611F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.6894F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 21, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.6483F, -0.5F, -0.7112F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.2225F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 0, -1.5F, -0.5F, -0.5F, 2, 1, 1, -0.003F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.3083F, 0.0F, -3.1611F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.6894F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 21, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.6483F, -0.5F, -0.7112F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.2225F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 39, 0, -0.5F, -0.5F, -0.5F, 2, 1, 1, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.8516F, 0.0F, -1.889F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -1.0167F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 37, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 0.0F, -7.75F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 1.0472F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 36, -3.0F, -1.0F, 0.0F, 3, 1, 1, 0.006F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.5F, 0.0F, -5.1519F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 1.6668F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 18, -5.0F, -1.0F, 0.0F, 5, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.5F, 0.0F, -5.1519F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -1.6668F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 18, 0.0F, -1.0F, 0.0F, 5, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.9723F, 0.0F, -7.75F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.7854F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 9, -1.375F, -1.0F, 0.0F, 1, 1, 1, 0.006F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 0.0F, -7.75F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.7418F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 39, 6, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 0.0F, -7.75F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.7418F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 6, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, 0.0F, -7.75F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -1.0472F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 36, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.006F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.9397F, -2.1529F, -2.9936F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0273F, 0.034F, -0.894F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 34, -2.0F, 0.0F, 0.5F, 2, 1, 2, -0.006F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, -2.4946F, -3.0085F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.041F, 0.0149F, -0.3488F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 29, 36, -1.0F, 0.0F, 0.5F, 1, 2, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.9397F, -2.1529F, -2.9936F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0273F, -0.034F, 0.894F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 34, 0.0F, 0.0F, 0.5F, 2, 1, 2, -0.006F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, -2.4946F, -3.0085F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.041F, -0.0149F, 0.3488F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 29, 36, 0.0F, 0.0F, 0.5F, 1, 2, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0061F, -1.1879F, -6.3805F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.18F, -0.4473F, 0.2906F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 39, 3, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.0061F, -1.1879F, -6.3805F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.18F, 0.4473F, -0.2906F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 39, 3, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.95F, -1.8328F, -4.9848F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3052F, -0.3095F, -0.0697F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 30, 6, 0.0F, 0.0F, -3.0F, 1, 1, 3, -0.003F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5F, -1.995F, -2.9867F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 38, -0.5F, 0.0F, -2.0F, 1, 1, 2, -0.003F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 38, 2.5F, 0.0F, -2.0F, 1, 1, 2, -0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.95F, -1.8328F, -4.9848F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3052F, 0.3095F, 0.0697F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 30, 6, -1.0F, 0.0F, -3.0F, 1, 1, 3, -0.003F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -2.4946F, -3.0335F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0436F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 11, -2.0F, 0.5F, 0.0F, 4, 2, 3, -0.003F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -2.4946F, -3.0085F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 13, 18, -1.0F, 0.0F, 0.0F, 2, 2, 3, 0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.8452F, -5.9374F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2182F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 11, 24, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -1.0F, -7.75F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.4363F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 33, 26, -1.0F, 0.0F, 0.0F, 2, 1, 2, -0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.3083F, -0.5F, -0.4111F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.1309F, 0.2182F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 11, 29, -1.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.3083F, -0.5F, -0.4111F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.1309F, -0.2182F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 11, 29, -1.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.5F, -5.7519F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 35, 21, -1.0F, -0.4F, -1.9731F, 2, 1, 2, -0.006F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.01F, -0.0451F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 17, -1.5F, -0.99F, -0.2049F, 3, 2, 3, 0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, -1.5904F, -0.3163F);
        this.tail.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0654F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 37, 16, 1.0F, -0.25F, 0.35F, 0, 1, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -1.5904F, -0.3163F);
        this.tail.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.048F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 22, 26, -1.0F, 0.0F, 0.2F, 2, 1, 3, -0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1935F, 2.2991F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 23, -0.75F, -0.7965F, -0.004F, 2, 2, 3, -0.006F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 30, 0, -1.25F, -0.7965F, -0.004F, 1, 2, 3, -0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.751F, 1.9292F);
        this.tail2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2574F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 39, 12, 0.0F, -0.375F, -0.6F, 0, 1, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -1.2137F, 0.4806F);
        this.tail2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.2356F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 20, 36, -1.0F, -0.025F, -0.025F, 2, 1, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.2454F, 2.6698F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 28, 11, -1.0F, -0.9418F, -0.1738F, 2, 1, 3, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.0F, 0.7108F, -0.131F);
        this.tail3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0611F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 29, 0.0F, -0.775F, 0.0F, 2, 1, 3, -0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.0833F, -0.0869F, 2.406F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 22, 31, -0.4167F, -0.755F, -0.0798F, 1, 1, 3, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.4167F, 0.245F, -0.0798F);
        this.tail4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0742F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 31, 31, 1.0F, -0.55F, 0.0F, 1, 1, 3, -0.003F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0833F, -0.3228F, 2.8855F);
        this.tail4.addChild(tail5);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.5F, 0.5678F, 0.0347F);
        this.tail5.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.3927F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 15, 11, 1.0F, -1.0F, 0.0F, 1, 1, 5, -0.006F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-2.0F, 0.5678F, 0.0347F);
        this.tail5.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.48F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 0, 2.0F, -1.05F, 0.0F, 0, 3, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(180);
        this.setRotateAngle(main, 1.5F, 0.0F, 1.5F);
        this.main.offsetY = -0.3F;
        this.main.offsetX = -0.0F;
        this.main.offsetZ = -0.4F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.main.offsetY = -0.2F;
        this.main.offsetX = -0.005F;
        this.main.render(0.01F);
        resetToDefaultPose();


    }
    public void renderStaticSuspended(float f) {

        this.main.offsetY = 0.2F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.3F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.2F;
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
        this.main.offsetY = 0.0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        float speed = 0.4F;
        float taildegree = 0.35F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(frontLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);


            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0.05F;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }


}
