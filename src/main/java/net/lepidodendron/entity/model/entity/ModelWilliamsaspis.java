package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWilliamsaspis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r31;

    public ModelWilliamsaspis() {
        this.textureWidth = 53;
        this.textureHeight = 53;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 27, 30, -2.0F, -5.3F, 1.375F, 4, 5, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 41, 5, -1.0F, -6.75F, -2.8F, 2, 2, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, 1.3065F, -1.2635F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2531F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -1.0F, 0.0F, 4, 1, 5, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, 0.7856F, -4.2179F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 0, -0.5F, -1.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -3.2435F, -3.6775F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3971F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 27, -0.5F, 0.0F, -3.0F, 3, 3, 3, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, -0.5F, -5.75F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6981F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 34, -0.5F, -1.0F, 0.0F, 4, 1, 2, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, -5.8977F, 3.2457F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 34, 0.5F, 0.0F, -2.975F, 2, 2, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -6.75F, -0.8F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 41, 22, 0.5F, 0.0F, 0.0F, 2, 2, 2, 0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.9F, -3.0391F, -7.4196F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.6619F, -0.1382F, -0.1069F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 41, 43, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.9F, -3.0391F, -7.4196F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.6619F, 0.1382F, 0.1069F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 41, 43, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -4.4413F, -7.2351F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6545F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 43, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -6.75F, -2.8F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.48F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 18, -1.5F, 0.0F, -5.0F, 3, 4, 3, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 43, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.2087F, -2.7F, -4.8004F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.6109F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 38, -0.6F, 1.5F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.7002F, -0.2F, -5.1446F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4592F, -0.7901F, -0.0286F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 41, 27, 0.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.9681F, -1.2F, -2.4257F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0546F, -0.4293F, 0.1922F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 17, 0.525F, -3.95F, -3.0F, 2, 4, 3, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(3.9681F, -1.2F, -2.4257F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0546F, 0.4293F, -0.1922F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 17, -2.525F, -3.95F, -3.0F, 2, 4, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.7002F, -0.2F, -5.1446F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.4592F, 0.7901F, 0.0286F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 41, 27, -2.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.2087F, -2.7F, -4.8004F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.6109F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 38, -1.4F, 1.5F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.9852F, 0.3F, -1.9027F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, -0.2618F, 0.0829F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 0, 0.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(2.9852F, 0.3F, -1.9027F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0436F, 0.2618F, -0.0829F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 34, 0, -2.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.9852F, 0.3F, -1.9027F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.1309F, 0.0829F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 15, 7, 0.0F, -6.0F, 0.0F, 2, 6, 4, 0.003F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-2.5297F, -5.1811F, -1.9027F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0829F, -0.3491F, 0.0829F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 38, 0.0F, -0.5F, -3.0F, 2, 1, 3, 0.003F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(2.5297F, -5.1811F, -1.9027F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0829F, 0.3491F, -0.0829F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 24, 38, -2.0F, -0.5F, -3.0F, 2, 1, 3, 0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.9852F, 0.3F, -1.9027F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.1309F, -0.0829F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 15, 7, -2.0F, -6.0F, 0.0F, 2, 6, 4, 0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.4852F, -0.7F, -1.9027F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.1745F, 0.7418F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 28, 12, -1.5F, 0.0F, 0.0F, 3, 0, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.4852F, -0.7F, -1.9027F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.1745F, -0.7418F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 28, 12, -1.5F, 0.0F, 0.0F, 3, 0, 4, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.3605F, -5.3984F);
        this.main.addChild(jaw);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.8605F, 0.2538F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.4363F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 39, 31, -1.5F, -0.75F, -3.0F, 2, 1, 3, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.9578F, 2.9581F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 18, -1.5F, -2.0422F, -1.2081F, 3, 4, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, -2.9568F, -0.0653F);
        this.tail.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.528F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 29, 43, 0.5F, -2.0F, 0.3F, 0, 2, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, -2.0422F, 2.7919F);
        this.tail.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.3098F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 35, 38, -0.5F, 0.0F, -3.0F, 2, 1, 3, -0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 1.9578F, 2.7919F);
        this.tail.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3622F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 39, 17, -0.5F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.025F, 0.0035F, 2.5206F);
        this.tail.addChild(tail2);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.525F, -1.5457F, 3.7713F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1309F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 28, 25, -0.5F, 0.0F, -4.0F, 2, 1, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.525F, -1.5457F, 3.7713F);
        this.tail2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1309F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 15, 26, -0.5F, 0.0F, -4.0F, 2, 3, 4, -0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.8752F, 1.5708F, 0.1602F);
        this.tail2.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.3054F, 0.0F, -1.0908F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 36, 43, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.9252F, 1.5708F, 0.1602F);
        this.tail2.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.3054F, 0.0F, 1.0908F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 36, 43, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.025F, -0.5993F, 3.6074F);
        this.tail2.addChild(tail3);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.8341F, 2.9199F);
        this.tail3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.4145F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 43, 10, -0.5F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -1.1736F, 2.6555F);
        this.tail3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0785F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 11, 40, -0.5F, 0.025F, -3.0F, 1, 2, 3, 0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.6598F, 2.6075F);
        this.tail3.addChild(tail4);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, -0.5138F, 0.0481F);
        this.tail4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.384F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 7, 0.5F, 0.025F, -0.5F, 0, 3, 7, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 28, 5, 0.0F, 0.025F, -0.5F, 1, 1, 5, 0.0F, false));
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

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};

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

    }}
