package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraRhinobatos;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelRhinobatos extends ModelBasePalaeopedia {
    private ModelAnimator animator;
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer cube_r26;

    public ModelRhinobatos() {
        this.textureWidth = 72;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 23.675F, -1.0F);
        this.main.cubeList.add(new ModelBox(main, 31, 19, -1.5F, -1.0F, -11.0F, 4, 1, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 2, 69, 0.0F, -1.0F, -15.0F, 1, 1, 4, 0.005F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.5F, -2.0F, -8.55F, 8, 2, 9, 0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 17, 35, 0.0F, -1.0042F, -15.7787F, 1, 1, 1, -0.002F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.3492F, -1.595F, -11.9427F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1999F, -0.478F, -0.028F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 55, 0.0F, 0.05F, -2.9F, 2, 1, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.3492F, -1.595F, -11.9427F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1999F, 0.478F, 0.028F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 55, -2.0F, 0.05F, -2.9F, 2, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.3639F, -0.9951F, -11.9196F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1148F, -0.5628F, -0.0514F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 6, 0.0F, -0.6F, 0.025F, 3, 1, 4, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.3639F, -0.9951F, -11.9196F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1148F, 0.5628F, 0.0514F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 6, -3.0F, -0.6F, 0.025F, 3, 1, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -2.911F, -4.6924F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0218F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 29, 24, -3.5F, 0.0F, 0.0F, 7, 1, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.25F, -2.0752F, -8.6499F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3168F, -0.0833F, 0.2485F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 35, -0.5F, -0.5F, -0.825F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.25F, -2.0752F, -8.6499F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3168F, 0.0833F, -0.2485F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 35, -0.5F, -0.5F, -0.825F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -2.4946F, -8.4946F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1091F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 35, 0, -3.5F, 0.0F, -0.175F, 7, 1, 4, 0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, -1.795F, -10.8948F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2836F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 54, 20, -2.5F, 0.0F, -0.5F, 3, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -1.0147F, -14.8179F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1876F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 54, 25, -0.5F, 0.0F, -0.15F, 1, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.936F, -0.5F, -7.9948F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.3752F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 52, 0.0F, -0.5F, 0.0F, 3, 1, 5, -0.001F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(4.936F, -0.5F, -7.9948F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.3752F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 52, -3.0F, -0.5F, 0.0F, 3, 1, 5, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0516F, -0.5F, -12.5881F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.5498F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 47, -1.0F, -0.5F, 0.0F, 2, 1, 6, -0.004F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.9484F, -0.5F, -12.5881F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.5498F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 47, -1.0F, -0.5F, 0.0F, 2, 1, 6, -0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.5F, -15.75F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.3054F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 58, 0, 0.0F, -0.5F, 0.0F, 1, 1, 3, -0.007F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, -0.5F, -15.75F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.3054F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 58, 0, -1.0F, -0.5F, 0.0F, 1, 1, 3, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.85F, 0.025F, -10.375F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.6109F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 67, -0.5F, 0.0F, -1.0F, 1, 0, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.85F, 0.025F, -10.375F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.6109F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 67, -0.5F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -1.675F, 0.3F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 12, -3.0F, -0.375F, -0.8F, 6, 2, 9, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.1F, -0.3F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0393F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 24, -2.5F, 0.0F, -0.5F, 5, 1, 9, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(3.0F, 1.35F, 2.45F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, -0.48F, 0.0F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 38, 38, -0.5F, 0.0F, -1.0F, 4, 0, 6, 0.0F, false));
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 38, 45, -0.5F, 0.025F, -1.0F, 4, 0, 6, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-3.0F, 1.35F, 2.45F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, 0.48F, 0.0F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 38, 38, -3.5F, 0.0F, -1.0F, 4, 0, 6, 0.0F, true));
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 38, 45, -3.5F, 0.025F, -1.0F, 4, 0, 6, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 8.2F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 38, -2.5F, -0.375F, -1.0F, 5, 2, 5, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.75F, -0.25F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0524F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 52, 31, -2.0F, 0.025F, -0.75F, 4, 1, 5, 0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.275F, 4.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 46, -2.0F, -0.75F, -1.0F, 4, 2, 5, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.65F, 0.3F);
        this.tail3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2618F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 33, 60, 0.0F, -3.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.25F, 4.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 54, 13, -1.5F, -0.5F, -0.5F, 3, 2, 4, -0.01F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.264F, 3.4765F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 17, 54, -1.0F, -0.186F, -0.7265F, 2, 1, 5, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.664F, -0.1765F);
        this.tail5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1004F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 54, 6, -1.0F, -1.0F, -0.45F, 2, 1, 5, -0.003F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.086F, 0.5235F);
        this.tail5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2618F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 60, 39, 0.0F, -3.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.0281F, 3.8475F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0305F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 53, 52, -0.5F, -0.0471F, -0.1792F, 1, 1, 6, -0.004F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 0.4529F, 3.8208F);
        this.tail6.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.4363F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 35, 0.5F, -0.5F, 0.0F, 0, 3, 8, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(3.3587F, -0.5F, -2.1004F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 1.0472F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0167F, 0.05F, 0.0348F);
        this.frontLeftFin.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.7156F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 29, 31, -1.425F, 0.0F, -0.4447F, 5, 0, 6, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 31, 12, -1.425F, -0.05F, -0.4447F, 5, 0, 6, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.3587F, -0.5F, -2.1004F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, -1.0472F, 0.0F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.0167F, 0.05F, 0.0348F);
        this.frontRightFin.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.7156F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 29, 31, -3.575F, 0.0F, -0.4447F, 5, 0, 6, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 31, 12, -3.575F, -0.05F, -0.4447F, 5, 0, 6, 0.0F, true));

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
        this.main.offsetX = -0.07F;
        this.main.offsetZ = 0.02F;
        this.main.offsetY = -0.245F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
        public void renderStaticFloor(float f) {
            this.main.offsetY = -0.14F;
            this.main.render(0.01F);
            resetToDefaultPose();
        }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.4F;
        this.main.offsetX = 0.3F;
        this.main.rotateAngleY = (float)Math.toRadians(220);
        this.main.rotateAngleX = (float)Math.toRadians(40);
        this.main.rotateAngleZ = (float)Math.toRadians(-10);
        this.main.scaleChildren = true;
        float scaler = 1.F;
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
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        ((EntityPrehistoricFloraRhinobatos) e).tailBuffer.applyChainSwingBuffer(fishTail);

        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;

        AdvancedModelRenderer[] leftwings = {this.frontLeftFin};
        AdvancedModelRenderer[] rightwings = {this.frontRightFin};
        float speed = 0.1F;
        if (!e.isInWater()) { // if not in water
            speed = 0.7F * 0.5F;
        } else if (!ee.getIsMoving()) {
            speed = 0.7F * 0.13F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (!e.isInWater()) {

                //this.bob(body, speed, 5F, false, f2, 1);
                this.chainWave(fishTail, speed * 0.1F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed * 0.1F, 0.1F, -3, f2, 1);
                return;
            }


            this.flap(backLeftFin, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            if (ee.getIsMoving() || e.isInWater()) { //if moving, slap fins
                //this.flap(LeftPectoral, speed * 2.5F, 0.4F, true, -3, 0, f2, 1);
                //this.flap(RightPectoral, speed* 2.5F, -0.4F, true, -3, 0, f2, 1);
                this.chainFlap(leftwings, speed * 2.5F, 0.15F, 0, f2, 1);
                this.chainFlap(rightwings, speed * 2.5F, -0.15F, 0, f2, 1);
                this.chainWave(fishTail, speed * 2.5F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed * 2.5F, 0.25F, -3, f2, 1);
            } else { //if not accelerating swing fins instead
                //this.swing(leftFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -0, -0.5F, f2, 1);
                //this.swing(rightFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -3, 0.5F, f2, 1);
//                this.flap(LeftPectoral, (speed), 0.25F, true, -3, 0, f2, 1);
//                this.flap(RightPectoral, (speed), -0.25F, true, -3, 0, f2, 1);
                this.chainFlap(leftwings, speed, 0.15F, 0, f2, 1);
                this.chainFlap(rightwings, speed, -0.15F, 0, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            }


            this.flap(backRightFin, (float) (speed), 0.2F, false, 0, 0, f2, 1);
            this.swing(backRightFin, (float) (speed), 0.2F, false, 0, 0, f2, 1);


        }
    }
}