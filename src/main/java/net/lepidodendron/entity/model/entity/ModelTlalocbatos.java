package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraTlalocbatos;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelTlalocbatos extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;

    public ModelTlalocbatos() {
        this.textureWidth = 56;
        this.textureHeight = 47;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 23.975F, 7.0F);
        this.main.cubeList.add(new ModelBox(main, 40, 14, -1.5F, -1.0F, -10.95F, 4, 1, 2, -0.006F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -2.0F, -9.275F, 9, 2, 5, 0.02F, false));
        this.main.cubeList.add(new ModelBox(main, 23, 8, -2.5F, -2.0F, -4.275F, 6, 2, 3, 0.02F, false));
        this.main.cubeList.add(new ModelBox(main, 41, 38, -0.5F, -1.0F, -13.25F, 2, 1, 3, -0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 24, 42, 0.0F, -1.0F, -14.75F, 1, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0568F, -14.751F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2094F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 41, 0.0F, 0.025F, 0.0F, 1, 1, 4, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-5.1568F, -1.0F, -8.7652F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.4494F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 0, 0.0F, 0.0F, -0.025F, 4, 1, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(6.1568F, -1.0F, -8.7652F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.4494F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 0, -4.0F, 0.0F, -0.025F, 4, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.0F, -14.75F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.7112F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 42, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.001F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.3055F, -1.0F, -13.2349F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.7112F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 20, 0.0F, 0.0F, -0.125F, 3, 1, 6, 0.002F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.6789F, -1.6065F, -12.0698F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2508F, -0.5584F, -0.1412F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 42, 0.0F, 0.05F, -3.125F, 2, 1, 3, -0.01F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.3267F, -1.5F, -10.0912F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1411F, -0.6872F, -0.1525F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 20, -0.75F, -0.25F, -2.375F, 2, 1, 4, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.3055F, -1.0F, -13.2349F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.7112F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 20, -3.0F, 0.0F, -0.125F, 3, 1, 6, 0.004F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, -1.0F, -14.75F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.7112F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 42, -1.0F, 0.0F, 0.0F, 1, 1, 2, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-4.0F, -1.0F, -4.275F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.4363F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 35, 0.0F, -1.0F, 0.0F, 2, 2, 4, 0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(5.0F, -1.0F, -4.275F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.4363F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 35, -2.0F, -1.0F, 0.0F, 2, 2, 4, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.575F, -1.55F, -9.275F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2268F, -0.6194F, 0.3783F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 29, 5, -0.5F, -0.75F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.575F, -1.55F, -9.275F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2268F, 0.6194F, -0.3783F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 29, 5, -0.5F, -0.75F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.6789F, -1.6065F, -12.0698F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2508F, 0.5584F, 0.1412F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 42, -2.0F, 0.05F, -3.125F, 2, 1, 3, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(3.3267F, -1.5F, -10.0912F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1411F, 0.6872F, 0.1525F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 20, -1.25F, -0.25F, -2.375F, 2, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -2.0F, -9.0F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 38, -2.0F, 0.0F, -2.0F, 4, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -1.5F, -1.75F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 28, -2.0F, -0.5F, 0.0F, 4, 2, 4, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(2.7716F, 1.15F, -0.5324F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, -0.5672F, 0.0F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 23, 14, 0.0F, 0.0F, 0.0F, 3, 0, 5, 0.0F, false));
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 11, 36, 0.0F, 0.025F, 0.0F, 3, 0, 5, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-2.7716F, 1.15F, -0.5324F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.5672F, 0.0F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 23, 14, -3.0F, 0.0F, 0.0F, 3, 0, 5, 0.0F, true));
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 11, 36, -3.0F, 0.025F, 0.0F, 3, 0, 5, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 20, -1.5F, -0.5F, 0.0F, 3, 2, 5, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.0585F, 4.5362F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3491F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 43, 26, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 28, -1.0F, -0.75F, 0.0F, 2, 2, 5, -0.02F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.7F, 3.475F);
        this.tail3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3491F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 43, 31, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.225F, 4.975F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 42, 5, -0.5F, -0.5F, 0.0F, 1, 2, 3, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 32, 28, 0.0F, -2.5F, 0.0F, 0, 4, 5, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(-0.6646F, -0.5F, -2.1474F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.4494F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 14, 3.0F, -0.1F, -0.025F, 6, 0, 5, 0.0F, false));
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 8, 3.0F, -0.075F, -0.025F, 6, 0, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(1.6646F, -0.5F, -2.1474F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, -0.4494F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 14, -9.0F, -0.1F, -0.025F, 6, 0, 5, 0.0F, true));
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 8, -9.0F, -0.075F, -0.025F, 6, 0, 5, 0.0F, true));

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
        this.main.offsetY = -1.8F;
        this.main.offsetX = 0.6F;
        this.main.rotateAngleY = (float)Math.toRadians(220);
        this.main.rotateAngleX = (float)Math.toRadians(40);
        this.main.rotateAngleZ = (float)Math.toRadians(-10);
        this.main.scaleChildren = true;
        float scaler = 2.6F;
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
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        ((EntityPrehistoricFloraTlalocbatos) e).tailBuffer.applyChainSwingBuffer(fishTail);

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


            this.flap(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
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


            this.flap(backrightfin, (float) (speed), 0.2F, false, 0, 0, f2, 1);
            this.swing(backrightfin, (float) (speed), 0.2F, false, 0, 0, f2, 1);


        }
    }
}