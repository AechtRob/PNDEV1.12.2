package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraPhyllolepis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelPhyllolepis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer leftSpine;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer rightSpine;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;

    private ModelAnimator animator;


    public ModelPhyllolepis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 40, 5, -2.5F, -2.6F, 5.9F, 5, 2, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -3.0F, -1.0F, 8, 3, 4, 0.009F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.9289F, -1.8118F, -6.501F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3057F, -0.0416F, -0.0131F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 30, 0.0F, 0.0F, 0.0F, 3, 1, 1, -0.003F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.9289F, -1.8118F, -6.501F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2563F, 0.757F, 0.0474F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 52, -2.0F, 0.0F, 0.0F, 2, 1, 3, -0.003F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-4.381F, -1.8807F, -5.1275F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0554F, 1.215F, -0.1329F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 43, 42, -4.025F, 0.0F, 0.075F, 4, 1, 3, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(4.381F, -1.8807F, -5.1275F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0554F, -1.215F, 0.1329F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 43, 42, 0.025F, 0.0F, 0.075F, 4, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.6203F, -1.3841F, -5.0264F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4308F, 0.757F, 0.0474F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 53, -0.475F, -0.5F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.6203F, -1.3841F, -5.0264F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4308F, -0.757F, -0.0474F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 53, -0.525F, -0.5F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.9289F, -1.8118F, -6.501F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2563F, -0.757F, -0.0474F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 52, 0.0F, 0.0F, 0.0F, 2, 1, 3, -0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.9289F, -1.8118F, -6.501F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3057F, 0.0416F, 0.0131F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 30, -3.0F, 0.0F, 0.0F, 3, 1, 1, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -2.6084F, -3.9743F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 46, 0, -2.0F, 0.0F, -2.0F, 5, 1, 2, 0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -3.0F, -1.0F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 19, 28, -3.0F, 0.0F, -3.0F, 7, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.0063F, -1.2526F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 14, -3.5F, -2.0F, -2.75F, 7, 2, 3, -0.006F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-5.0137F, -0.0925F, -0.9822F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0845F, -0.3784F, 0.0313F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 30, -0.4559F, -0.9493F, -3.9907F, 2, 1, 4, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.9541F, -0.3491F, -4.8494F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.269F, -0.6622F, 0.0215F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 53, 0.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 53, 0.0F, -1.0F, -1.925F, 2, 1, 1, -0.003F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(3.9541F, -0.3491F, -4.8494F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.269F, 0.6622F, -0.0215F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 39, 53, -2.0F, -1.0F, -1.925F, 2, 1, 1, -0.003F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 53, -2.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(5.0137F, -0.0925F, -0.9822F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0845F, 0.3784F, -0.0313F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 49, 30, -1.5441F, -0.9493F, -3.9907F, 2, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -3.0F, 6.0F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 49, 36, -2.0F, 0.15F, 0.0F, 4, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.1309F, 5.8971F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 13, 41, -2.5F, -1.0F, 0.0F, 5, 1, 3, -0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 2.95F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 25, 0, -3.5F, -1.0F, 0.0F, 7, 1, 3, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -3.0F, 3.0F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 19, 8, -3.5F, 0.0F, 0.0F, 7, 2, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.1237F, -1.4524F, 8.3393F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 34, 33, -0.1237F, -1.2226F, -0.9393F, 0, 1, 7, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.1237F, 0.4381F, 6.0114F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.048F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 21, -1.5F, -0.775F, -6.0F, 3, 1, 6, -0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.1237F, -1.0726F, 0.0607F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 19, 20, -1.5F, 0.0F, 0.0F, 3, 1, 6, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.4824F, 0.8625F, 1.4645F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0983F, -0.478F, 0.1728F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 25, 5, 0.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.7299F, 0.8625F, 1.4645F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0983F, 0.478F, -0.1728F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 25, 5, -3.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.13F, 0.0801F, 5.5659F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 37, -0.0188F, -1.191F, -0.0109F, 0, 3, 6, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0063F, 0.3585F, 5.9586F);
        this.tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0393F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 17, 33, -1.0F, -1.05F, -6.0F, 2, 1, 6, -0.003F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0063F, -0.641F, 5.9891F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0305F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 29, -1.0F, -0.05F, -6.0F, 2, 1, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0063F, 0.0472F, 5.4948F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 40, 11, -0.5F, -0.75F, 0.0F, 1, 1, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 8, 0.0F, -1.25F, 0.0F, 0, 3, 9, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(3.9F, -0.5F, 2.6F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.0873F, 0.3491F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 40, 25, -2.3F, 0.0F, 0.0F, 4, 0, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-3.9F, -0.5F, 2.6F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.0873F, -0.3491F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 40, 25, -1.7F, 0.0F, 0.0F, 4, 0, 4, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, -0.9899F, -2.8694F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 20, -3.5F, -0.1598F, -2.6705F, 6, 1, 3, 0.0F, false));

        this.leftSpine = new AdvancedModelRenderer(this);
        this.leftSpine.setRotationPoint(4.0F, -3.0F, 1.0F);
        this.main.addChild(leftSpine);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.3329F, 2.5F, -2.8152F);
        this.leftSpine.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.192F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 30, 42, -0.625F, -0.5F, 0.5F, 1, 1, 5, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0148F, 1.775F, -0.2517F);
        this.leftSpine.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0396F, 0.1248F, 0.3079F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 26, 49, -0.925F, -0.8F, -2.0F, 2, 1, 4, 0.006F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 2.0F, 2.0F);
        this.leftSpine.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.1309F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 13, 46, -0.375F, -0.925F, -4.1F, 2, 1, 4, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 43, 47, -0.375F, 0.0F, -4.1F, 2, 1, 4, 0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.05F, 0.0F, 2.0F);
        this.leftSpine.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0706F, 0.1103F, 0.5711F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 47, 0.0F, 0.0F, -4.1F, 2, 1, 4, -0.003F, false));

        this.rightSpine = new AdvancedModelRenderer(this);
        this.rightSpine.setRotationPoint(-4.0F, -3.0F, 1.0F);
        this.main.addChild(rightSpine);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.3329F, 2.5F, -2.8152F);
        this.rightSpine.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.192F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 30, 42, -0.375F, -0.5F, 0.5F, 1, 1, 5, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0148F, 1.775F, -0.2517F);
        this.rightSpine.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0396F, -0.1248F, -0.3079F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 26, 49, -1.075F, -0.8F, -2.0F, 2, 1, 4, 0.006F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 2.0F, 2.0F);
        this.rightSpine.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.1309F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 13, 46, -1.625F, -0.925F, -4.1F, 2, 1, 4, 0.0F, true));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 43, 47, -1.625F, 0.0F, -4.1F, 2, 1, 4, 0.003F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.05F, 0.0F, 2.0F);
        this.rightSpine.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0706F, -0.1103F, -0.5711F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 47, -2.0F, 0.0F, -4.1F, 2, 1, 4, -0.003F, true));

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
        EntityPrehistoricFloraPhyllolepis phyllo = (EntityPrehistoricFloraPhyllolepis) e;
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


}
