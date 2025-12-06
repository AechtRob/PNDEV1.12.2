package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHaqelpycnodus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;

    public ModelHaqelpycnodus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -12.0F, -3.0F, 3, 9, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 9, 15, -1.0F, -11.0F, -5.0F, 2, 6, 2, 0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 9, 24, -1.0F, -8.75F, 1.675F, 2, 3, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -10.5665F, 3.1503F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.2654F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 12, -1.0F, 0.0F, 0.0F, 2, 2, 2, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -12.3406F, 2.2268F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.0908F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 33, -1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -13.7548F, 0.8126F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 25, -1.0F, 0.0F, 0.0F, 2, 2, 2, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -7.5411F, -7.114F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.8326F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 39, -1.0F, -0.375F, -1.25F, 1, 0, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 33, -1.5F, -0.4F, -1.0F, 2, 3, 1, 0.006F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -9.3537F, -6.2688F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.1345F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 26, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.7F, -9.6899F, -4.6258F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.789F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 38, -0.375F, -0.8F, -0.3F, 1, 1, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 38, 0.775F, -0.8F, -0.3F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -10.5611F, -5.9452F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 6, -1.0F, 0.0F, -3.0F, 2, 2, 3, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -12.1478F, -4.7277F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.9163F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 25, 30, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, -12.5704F, -3.8214F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5672F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 40, -1.0F, -0.2F, -0.9F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -12.993F, -2.9151F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4363F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 30, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, -12.6716F, -3.2981F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.7418F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 9, 35, -1.0F, -0.1F, 0.025F, 0, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -14.6F, -1.0F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.6981F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 0, -1.0F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, -14.9628F, -0.0033F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.4363F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 40, -1.025F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -11.2407F, 3.8248F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.4835F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 25, 35, 0.025F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -13.1201F, 3.1408F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.2217F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 37, 0, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, -13.583F, 0.8922F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.8727F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 16, -0.975F, -1.425F, -0.2F, 0, 2, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, -14.283F, -0.3203F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.5236F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 36, 10, -1.0F, -2.4F, -0.075F, 0, 3, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -14.6F, -1.0F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.4363F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 19, -1.0F, 0.0F, 0.0F, 2, 3, 2, 0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -2.4415F, -3.2638F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -2.3824F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 12, -0.5F, 0.0F, -2.0F, 2, 4, 2, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, -2.3853F, -2.6834F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -2.2515F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 5, 38, -1.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -1.2519F, -1.6561F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -2.2078F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 28, 5, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -1.0254F, 0.331F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.6842F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 37, 39, 0.5F, 0.0F, -0.75F, 0, 1, 1, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 28, 0, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, -1.5774F, 1.1649F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.9861F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 27, 22, -0.5F, 0.0F, -1.0F, 2, 1, 1, 0.003F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -4.2764F, 4.039F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0524F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 21, 38, 0.025F, -2.0F, -1.0F, 0, 2, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, -1.1512F, 0.2386F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2269F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 18, 25, -1.0F, -3.9F, 0.0F, 0, 4, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -3.0161F, 2.5542F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.7679F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 28, -0.5F, 0.0F, -2.0F, 2, 2, 2, -0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, -4.7737F, 3.5086F);
        this.main.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.4974F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 27, 17, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, -5.75F, 3.725F);
        this.main.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.2182F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 34, 22, -0.5F, 0.0F, -2.0F, 2, 1, 2, 0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -7.0F, 3.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 37, 5, -0.5F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 15, 0.0F, -4.0F, 0.0F, 0, 8, 4, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0F, -1.6098F, -0.9152F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.6342F, 0.4353F, -0.3008F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 39, 35, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0F, -1.6098F, -0.9152F);
        this.main.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.6342F, -0.4353F, 0.3008F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 39, 35, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -6.8769F, -5.6633F);
        this.main.addChild(jaw);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, 1.4165F, -1.4885F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 1.4399F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 32, 35, -0.5F, 0.0F, 0.0F, 2, 2, 1, -0.006F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, -0.6642F, -1.4508F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 1.8326F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 28, 10, -1.0F, -0.45F, -1.7F, 1, 0, 1, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 34, 30, -1.5F, -0.575F, -2.0F, 2, 3, 1, -0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.5F, -5.5F, -2.5F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.1443F, 0.4323F, 0.0608F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 38, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.5F, -5.5F, -2.5F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.1443F, -0.4323F, -0.0608F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 38, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.25F;
        this.main.offsetX = -0.4F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 4.0F;
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
        this.main.offsetY = -0.125F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.body.offsetY = 1.35F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);


            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                this.main.offsetX = 0.40F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
