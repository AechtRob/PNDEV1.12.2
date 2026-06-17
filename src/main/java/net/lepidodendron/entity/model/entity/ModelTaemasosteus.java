package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTaemasosteus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer leftSpike;
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
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r24;
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
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private ModelAnimator animator;

    public ModelTaemasosteus() {
        animator = ModelAnimator.create();

        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 20, -4.5F, -6.75F, -2.0F, 9, 6, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.2601F, -2.8961F, -6.7326F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.5708F, -0.5236F, 0.3054F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 48, -0.175F, -0.525F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.2601F, -2.8961F, -6.7326F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.5708F, 0.5236F, -0.3054F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 48, -0.825F, -0.525F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, -2.9931F, -8.1893F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.4399F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 64, -1.5F, 2.0F, -1.0F, 6, 3, 1, 0.003F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 63, -0.5F, 0.0F, -1.0F, 4, 2, 1, 0.006F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.5F, -1.8711F, -7.3284F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.5209F, -0.3027F, 0.0411F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 27, 12, 1.2F, -0.725F, -0.275F, 0, 2, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.5F, -1.8711F, -7.3284F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.5209F, 0.3027F, -0.0411F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 12, -1.2F, -0.725F, -0.275F, 0, 2, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.9931F, -8.1893F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.9163F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 66, 58, -1.5F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -4.5798F, -6.9718F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.6065F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 57, -1.5F, 0.0F, 0.0F, 5, 3, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -6.729F, -3.5982F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4363F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 42, -3.5F, 0.0F, -1.0F, 7, 4, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -8.3077F, 2.0322F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2356F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 56, 16, -4.0F, 0.0F, 0.0F, 8, 2, 2, -0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -8.3077F, 2.0322F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1004F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 50, 42, -4.0F, 0.0F, -3.0F, 8, 2, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0461F, 1.1002F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 21, 51, -3.5F, -1.0F, 0.0F, 7, 1, 3, -0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0461F, 1.1002F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1178F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 27, 34, -4.0F, -2.0F, -5.0F, 8, 2, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.1558F, -4.7054F, -6.1053F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2636F, -0.4791F, 0.015F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 58, 21, 0.075F, 0.0F, -0.125F, 2, 3, 5, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(3.1558F, -4.7054F, -6.1053F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2636F, 0.4791F, -0.015F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 58, 21, -2.075F, 0.0F, -0.125F, 2, 3, 5, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(4.7202F, -1.6317F, 0.6786F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.0999F, -0.5148F, 0.2009F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 42, 0.0F, 0.0F, 0.0F, 8, 0, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-4.7202F, -1.6317F, 0.6786F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.0999F, 0.5148F, -0.2009F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 42, -8.0F, 0.0F, 0.0F, 8, 0, 5, 0.0F, true));

        this.leftSpike = new AdvancedModelRenderer(this);
        this.leftSpike.setRotationPoint(-0.5F, 0.5F, -0.025F);
        this.main.addChild(leftSpike);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-4.7F, -2.25F, -2.3F);
        this.leftSpike.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0873F, -0.2618F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 39, 65, 0.15F, -1.0F, -0.15F, 2, 2, 4, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-4.5419F, -3.25F, -2.3026F);
        this.leftSpike.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1011F, -0.0612F, 0.1467F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 53, 58, -0.05F, -3.0F, 0.05F, 2, 3, 4, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(5.5419F, -3.25F, -2.3026F);
        this.leftSpike.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1011F, 0.0612F, -0.1467F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 53, 58, -1.95F, -3.0F, 0.05F, 2, 3, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(5.7F, -2.25F, -2.3F);
        this.leftSpike.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0873F, 0.2618F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 39, 65, -2.15F, -1.0F, -0.15F, 2, 2, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.5578F, -3.6792F);
        this.main.addChild(jaw);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.0F, -0.7308F, -4.1832F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2367F, -0.2123F, 0.0508F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 51, 0.65F, -0.3F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-3.25F, 0.957F, -0.1565F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1826F, -0.4299F, 0.0768F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 52, 66, 0.0F, -1.0F, -3.5F, 2, 1, 4, -0.003F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(3.25F, 0.957F, -0.1565F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1826F, 0.4299F, -0.0768F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 52, 66, -2.0F, -1.0F, -3.5F, 2, 1, 4, -0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.0F, -0.7308F, -4.1832F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2367F, 0.2123F, -0.0508F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 42, 51, -0.65F, -0.3F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, 1.0395F, 0.3366F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1658F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 54, 34, -1.5F, -1.0F, -5.0F, 4, 1, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.3327F, 3.5025F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 27, 0, -4.0F, -2.1673F, -0.0025F, 8, 5, 6, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 4.1123F, 0.1061F);
        this.body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1571F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 33, -3.0F, -2.0F, 0.0F, 7, 2, 6, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-4.0F, -3.1219F, 1.0392F);
        this.body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.3054F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 28, 65, 4.0F, -2.875F, -0.225F, 0, 3, 5, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -2.6861F, 6.0201F);
        this.body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.144F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 31, 25, -3.5F, 0.0F, -5.925F, 7, 2, 6, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.526F, -0.1227F, 4.9748F);
        this.body.addChild(tail);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-2.5259F, 2.3022F, 6.6928F);
        this.tail.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1614F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 56, 0, -0.5F, -2.0F, -6.875F, 5, 2, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-2.0259F, -2.5446F, 0.5227F);
        this.tail.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1309F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 48, -1.5F, 0.0F, -0.25F, 6, 4, 4, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.8438F, 2.3366F, 1.1542F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.0768F, -0.5422F, 0.418F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 58, 30, 0.0F, 0.0F, -0.5F, 4, 0, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-2.8957F, 2.3366F, 1.1542F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.0768F, 0.5422F, -0.418F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 58, 30, -4.0F, 0.0F, -0.5F, 4, 0, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.526F, 0.6479F, 4.1004F);
        this.tail.addChild(tail2);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 2.0866F, -0.0936F);
        this.tail2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1047F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 21, 56, -1.5F, -2.0F, -0.975F, 3, 2, 5, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -0.5341F, 2.062F);
        this.tail2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0829F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 55, 6, -2.0F, -2.0F, -3.0F, 4, 4, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.599F, 3.536F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 50, 48, -1.5F, -1.6935F, 0.0113F, 3, 3, 6, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, 1.3065F, 5.0113F);
        this.tail3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.192F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 38, 58, -0.5F, -1.0F, -5.0F, 2, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.8493F, 5.4268F);
        this.tail3.addChild(tail4);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -0.1042F, 5.1553F);
        this.tail4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.4581F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 15, 64, -0.5F, -1.05F, -5.2F, 1, 1, 5, -0.003F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, 2.1558F, 0.5845F);
        this.tail4.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2618F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 0, 0.5F, -3.0F, 0.0F, 0, 6, 13, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 31, 12, -0.5F, -3.0F, 0.0F, 2, 2, 10, 0.0F, false));

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
