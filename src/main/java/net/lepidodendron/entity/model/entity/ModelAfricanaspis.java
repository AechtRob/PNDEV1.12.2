package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAfricanaspis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer leftSpine;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer rightSpine;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;


    public ModelAfricanaspis() {
        this.textureWidth = 50;
        this.textureHeight = 46;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -4.0F, -2.5F, 5, 4, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.0053F, -5.5457F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0305F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 0, -2.0F, -1.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.8505F, -7.3584F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2836F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 42, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.2527F, -7.1738F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6545F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 6, -1.0F, 0.0F, -1.0F, 2, 1, 1, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.0979F, -5.3612F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4363F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 41, 23, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -4.0F, -2.5F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 6, -2.0F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -6.1109F, -0.6789F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.8326F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 37, 30, -0.5F, -0.875F, -3.0F, 1, 2, 3, -0.006F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -7.9633F, 0.5736F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.4748F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 43, -0.5F, -1.0F, -2.0F, 1, 1, 2, -0.009F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -7.6572F, -0.8071F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.0036F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 41, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -3.9617F, -2.3379F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.1781F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 36, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -4.0F, -2.0F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.7418F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 38, -1.0F, -0.2F, -0.275F, 2, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.9836F, -0.717F, -7.0498F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3093F, -0.6306F, -0.054F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 43, 11, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.1051F, -1.5469F, -6.1574F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2512F, -0.5944F, 0.0279F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 6, -0.625F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.9836F, -0.717F, -7.0498F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3819F, -0.5261F, -0.217F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 43, 42, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.138F, -1.2537F, -5.3805F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1355F, -0.0819F, -0.0571F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 30, 0.075F, -1.55F, -0.25F, 2, 2, 4, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.1051F, -1.5469F, -6.1574F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2512F, 0.5944F, -0.0279F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 26, 6, -0.375F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.9836F, -0.717F, -7.0498F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3819F, 0.5261F, 0.217F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 43, 42, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.9836F, -0.717F, -7.0498F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3093F, 0.6306F, 0.054F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 43, 11, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(2.138F, -1.2537F, -5.3805F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1355F, 0.0819F, 0.0571F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 11, 30, -2.075F, -1.55F, -0.25F, 2, 2, 4, 0.0F, false));

        this.leftSpine = new AdvancedModelRenderer(this);
        this.leftSpine.setRotationPoint(0.5F, -4.0F, -2.5F);
        this.main.addChild(leftSpine);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(3.825F, 4.003F, -0.7502F);
        this.leftSpine.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0124F, 0.7768F, 0.0008F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 23, -3.0F, -1.0F, -3.3F, 3, 1, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(4.3204F, 3.5121F, -0.2466F);
        this.leftSpine.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0094F, 0.3405F, 0.0064F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 35, 36, -1.0F, -0.5F, 0.0F, 1, 1, 4, 0.006F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(3.15F, 3.1348F, 2.2906F);
        this.leftSpine.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0044F, 0.0378F, 1.0468F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 0, -2.5F, 0.0F, -3.025F, 3, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.7285F, 3.5716F, 1.9781F);
        this.leftSpine.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.013F, 0.1746F, -0.0033F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 32, 18, -1.5F, -0.525F, -2.5F, 3, 1, 3, 0.003F, false));

        this.rightSpine = new AdvancedModelRenderer(this);
        this.rightSpine.setRotationPoint(-0.5F, -4.0F, -2.5F);
        this.main.addChild(rightSpine);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-3.825F, 4.003F, -0.7502F);
        this.rightSpine.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0124F, -0.7768F, -0.0008F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 23, 0.0F, -1.0F, -3.3F, 3, 1, 4, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-4.3204F, 3.5121F, -0.2466F);
        this.rightSpine.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0094F, -0.3405F, -0.0064F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 35, 36, 0.0F, -0.5F, 0.0F, 1, 1, 4, 0.006F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-3.15F, 3.1348F, 2.2906F);
        this.rightSpine.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0044F, -0.0378F, -1.0468F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 34, 0, -0.5F, 0.0F, -3.025F, 3, 1, 3, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-2.7285F, 3.5716F, 1.9781F);
        this.rightSpine.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.013F, -0.1746F, 0.0033F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 32, 18, -1.5F, -0.525F, -2.5F, 3, 1, 3, 0.003F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(3.1552F, -0.2969F, -0.5698F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.0873F, 0.2182F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 11, 37, -1.5F, 0.0F, 0.0F, 3, 0, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-3.1552F, -0.2969F, -0.5698F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.0873F, -0.2182F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 11, 37, -1.5F, 0.0F, 0.0F, 3, 0, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.4053F, -5.2957F);
        this.main.addChild(jaw);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1309F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 27, 42, -1.0F, -1.0F, -2.0F, 2, 1, 2, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(tail);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 0.0F, 1.0F);
        this.tail.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1309F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 16, -1.5F, -2.0F, 0.0F, 4, 2, 4, -0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, -4.0F, 1.0F);
        this.tail.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0742F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 9, -1.5F, 0.025F, 0.0F, 4, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(tail2);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.0F, -1.3539F, 8.2972F);
        this.tail2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1309F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 17, 16, -0.5F, -1.675F, -3.925F, 3, 2, 4, -0.003F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-2.5F, -3.6078F, 5.4829F);
        this.tail2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.2182F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 36, 42, 2.5F, -0.95F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.0F, -4.0F, 1.0F);
        this.tail2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0873F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 17, 9, -0.5F, 0.0F, 3.5F, 3, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail2.addChild(tail3);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.0F, -1.0429F, 7.8861F);
        this.tail3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.3491F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 41, 27, 1.0F, 0.0F, 0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, -1.2173F, 11.8823F);
        this.tail3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0436F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 24, 30, -0.5F, -1.0F, -4.0F, 2, 1, 4, -0.003F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, -3.3899F, 7.9734F);
        this.tail3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0349F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 28, 23, -0.5F, 0.025F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.5F, -2.2142F, 11.3828F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 32, 11, 0.0F, -1.0F, 0.0F, 1, 2, 4, 0.0F, true));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.3054F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 15, 23, 0.0F, -0.875F, -0.4F, 1, 1, 5, -0.003F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 29, 0.5F, -1.2F, 0.175F, 0, 3, 5, 0.0F, false));

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
        this.main.offsetZ = -0.5F;

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

        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(270);
//            this.body.offsetY = -0.05F;
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -3, f2, 1F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -3, f2, 1F * still);

        }

    }}
