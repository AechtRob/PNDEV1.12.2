package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBryantolepis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer spike;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer spike2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private ModelAnimator animator;


    public ModelBryantolepis() {
        animator = ModelAnimator.create();
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -5.0F, -4.975F, 6, 4, 6, -0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 25, 0, -2.5F, -5.0F, 1.0F, 5, 4, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -4.2725F, 1.8217F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.7017F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 43, -0.5F, -2.0F, -2.0F, 3, 2, 2, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -6.722F, 0.4075F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.8326F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 43, -1.5F, -2.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -6.2043F, -1.5243F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 27, -1.5F, -2.0F, 0.0F, 4, 2, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -5.169F, -5.388F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 28, -2.5F, -4.0F, 0.0F, 6, 4, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.0F, -1.8456F, -6.162F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.2618F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 28, -0.625F, -0.65F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.0F, -1.8456F, -6.162F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.2618F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 28, -0.375F, -0.65F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -4.2455F, -7.162F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.0908F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 31, -1.5F, -2.0F, 0.0F, 5, 2, 3, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, -3.57F, -7.8993F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.829F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 48, -0.5F, -1.0F, 0.0F, 4, 1, 1, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, -2.5785F, -8.0298F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 46, 45, -0.5F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -2.5785F, -8.0298F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 41, -2.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5F, -2.2056F, -6.5819F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6109F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 43, -0.5F, -1.475F, -1.4F, 4, 2, 2, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.5F, -1.0952F, -6.8126F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.4399F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 25, 8, -0.5F, -1.0F, -1.0F, 4, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, -0.25F, -5.0F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4363F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 15, -1.5F, -2.0F, -2.0F, 5, 2, 2, -0.006F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.6426F, 3.8377F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.4363F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 27, 48, -1.5F, -1.0F, 0.0F, 3, 1, 1, -0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.3993F, -2.0711F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 11, -2.5F, -2.0F, 0.0F, 5, 2, 6, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.25F, -5.0F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 31, -2.5F, -2.0F, 0.0F, 5, 2, 3, 0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -6.0F, -2.0F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0524F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 20, -2.5F, 0.0F, 0.05F, 5, 1, 6, 0.003F, false));

        this.spike = new AdvancedModelRenderer(this);
        this.spike.setRotationPoint(2.5778F, -0.65F, -3.1088F);
        this.main.addChild(spike);
        this.setRotateAngle(spike, -0.1309F, 0.1745F, 0.0F);
        this.spike.cubeList.add(new ModelBox(spike, 36, 48, 0.1559F, -0.5F, 1.6343F, 1, 1, 2, -0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.1559F, 0.0F, 1.6343F);
        this.spike.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.3491F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 35, 43, -2.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

        this.spike2 = new AdvancedModelRenderer(this);
        this.spike2.setRotationPoint(-2.5778F, -0.65F, -3.1088F);
        this.main.addChild(spike2);
        this.setRotateAngle(spike2, -0.1309F, -0.1745F, 0.0F);
        this.spike2.cubeList.add(new ModelBox(spike2, 36, 48, -1.1559F, -0.5F, 1.6343F, 1, 1, 2, -0.003F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.1559F, 0.0F, 1.6343F);
        this.spike2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.3491F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 35, 43, 0.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.6F, -0.25F, -1.25F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.0873F, 0.3054F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 11, 48, -0.5F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.6F, -0.25F, -1.25F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.0873F, -0.3054F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 11, 48, -0.5F, 0.0F, 0.0F, 1, 0, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.165F, -4.9679F);
        this.main.addChild(jaw);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.5045F, -2.1093F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.5672F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 48, 48, -0.5F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 0.765F, -0.6321F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1745F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 45, 37, -1.0F, -1.0F, -1.5F, 3, 1, 2, 0.009F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.8767F, 3.3558F);
        this.main.addChild(tail);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -2.0485F, 0.7021F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.4189F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 20, 48, 0.0F, -2.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -2.1111F, 0.307F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1571F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 15, 37, -1.5F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 2.7767F, 0.1442F);
        this.tail.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 23, 22, -2.0F, -4.0F, 0.175F, 4, 4, 4, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0F, 2.5267F, 1.3942F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.2519F, 0.2443F, -0.7543F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 43, 48, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0F, 2.5267F, 1.3942F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.2519F, -0.2443F, 0.7543F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 43, 48, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2178F, 3.7355F);
        this.tail.addChild(tail2);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, 2.409F, -0.0913F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0873F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 35, -0.5F, -3.025F, 0.225F, 3, 3, 4, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -2.0434F, -0.166F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1745F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 30, 37, -1.0F, 0.3F, 0.275F, 3, 1, 4, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1646F, 3.3722F);
        this.tail2.addChild(tail3);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 1.8948F, 0.2451F);
        this.tail3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1309F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 40, 20, -0.5F, -2.1F, 0.0F, 2, 2, 4, 0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, -1.1702F, 0.6197F);
        this.tail3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.096F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 42, 0, -0.5F, 0.0F, -0.65F, 2, 1, 4, -0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail3.addChild(tail4);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.5F, -0.6423F, -0.4936F);
        this.tail4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2967F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 23, 11, 1.5F, 0.0F, -0.05F, 0, 3, 7, -0.003F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.0F, -0.8923F, -0.4936F);
        this.tail4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2531F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 38, 8, 0.5F, 0.5F, -0.05F, 1, 1, 5, -0.003F, false));
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
