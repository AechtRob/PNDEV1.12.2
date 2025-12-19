package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraAellopobatis;
import net.lepidodendron.entity.EntityPrehistoricFloraSpathobatis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAellopobatis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightwing;
    private final AdvancedModelRenderer rightwing2;
    private final AdvancedModelRenderer rightwing3;
    private final AdvancedModelRenderer leftwing;
    private final AdvancedModelRenderer leftwing2;
    private final AdvancedModelRenderer leftwing3;

    public ModelAellopobatis() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 23.675F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 55, 31, -2.5F, -3.0F, -11.0F, 6, 3, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 8, 24, -1.725F, -3.1F, -10.0F, 1, 3, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 8, 24, 1.725F, -3.1F, -10.0F, 1, 3, 1, 0.0F, true));
        this.main.cubeList.add(new ModelBox(main, 41, 42, 3.0F, -2.0F, -5.0F, 4, 2, 8, -0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 38, 31, -6.0F, -2.0F, -5.0F, 4, 2, 8, -0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -3.0F, -7.0F, 9, 3, 12, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 61, 53, -1.0F, -2.0F, -15.0F, 3, 2, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 15, 59, 0.0F, -1.0F, -21.0F, 1, 1, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 24, 22, -0.5F, -0.5F, -20.5F, 2, 0, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -0.5F, -16.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.432F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 5, 0, 0.701F, -0.5F, -1.05F, 1, 1, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, -0.5F, -16.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.432F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 5, 16, -1.701F, -0.5F, -1.05F, 1, 1, 2, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.6F, -0.5F, -15.3F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.432F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 16, -0.9768F, -0.5F, -3.9369F, 1, 1, 4, -0.001F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.6F, -0.5F, -15.3F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.432F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 16, -0.0232F, -0.5F, -3.9369F, 1, 1, 4, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -3.0F, -13.0F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.24F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 60, 11, -2.0F, 0.525F, -2.0F, 4, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -1.87F, -16.0414F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3098F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 30, -0.5F, 0.2523F, -1.8652F, 1, 1, 3, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(5.5F, -1.0F, -8.025F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0069F, 0.6676F, 0.0111F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 30, -2.675F, -1.0F, -7.675F, 5, 2, 11, -0.02F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.5F, -1.0F, -8.0F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0103F, -0.6675F, -0.0167F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 30, -2.325F, -1.0F, -7.675F, 5, 2, 11, -0.02F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -1.525F, 5.0F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 44, -3.0F, -1.5F, 0.0F, 6, 3, 6, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-3.0F, 0.75F, 2.0F);
        this.tail.addChild(backrightfin);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 58, 39, -3.5F, 0.0F, -2.0F, 4, 0, 5, 0.0F, false));
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 48, 24, -3.5F, 0.025F, -2.0F, 4, 0, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.15F, 0.05F, 2.25F);
        this.backrightfin.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.1745F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 61, 0, -0.5F, 0.0F, 0.0F, 1, 0, 6, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(3.0F, 0.75F, 2.0F);
        this.tail.addChild(backleftfin);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 58, 39, -0.5F, 0.0F, -2.0F, 4, 0, 5, 0.0F, true));
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 48, 24, -0.5F, 0.025F, -2.0F, 4, 0, 5, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.15F, 0.05F, 2.25F);
        this.backleftfin.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1745F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 61, 0, -0.5F, 0.0F, 0.0F, 1, 0, 6, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 47, 0, -1.5F, -1.5F, 0.0F, 3, 3, 7, -0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 0, 0.0F, -5.5F, 4.0F, 0, 4, 4, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 6.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 27, 51, -1.0F, -1.75F, 0.0F, 2, 3, 8, -0.02F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 16, 0.0F, -5.75F, 5.0F, 0, 4, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 8.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 48, 12, -0.5F, -0.5F, -0.25F, 1, 2, 9, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.5F, 9.0F);
        this.tail4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 45, 0.0F, -2.5F, -4.5F, 0, 4, 9, 0.0F, false));

        this.rightwing = new AdvancedModelRenderer(this);
        this.rightwing.setRotationPoint(-5.9875F, -1.325F, 0.25F);
        this.main.addChild(rightwing);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 24, 17, -2.4875F, 0.125F, -7.0F, 5, 0, 13, 0.0F, false));
        this.rightwing.cubeList.add(new ModelBox(rightwing, 0, 16, -2.4875F, 0.15F, -7.0F, 5, 0, 13, 0.0F, false));

        this.rightwing2 = new AdvancedModelRenderer(this);
        this.rightwing2.setRotationPoint(-2.4625F, 0.125F, 0.5F);
        this.rightwing.addChild(rightwing2);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 22, 33, -2.0F, 0.025F, -6.5F, 2, 0, 11, 0.0F, false));
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 31, 0, -2.0F, 0.0F, -6.5F, 2, 0, 11, 0.0F, false));

        this.rightwing3 = new AdvancedModelRenderer(this);
        this.rightwing3.setRotationPoint(-2.0F, 0.0F, 0.5F);
        this.rightwing2.addChild(rightwing3);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 0, 54, -2.0F, 0.0F, -5.0F, 2, 0, 8, 0.0F, false));
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 48, 53, -2.0F, 0.025F, -5.0F, 2, 0, 8, 0.0F, false));

        this.leftwing = new AdvancedModelRenderer(this);
        this.leftwing.setRotationPoint(6.9875F, -1.325F, 0.25F);
        this.main.addChild(leftwing);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 24, 17, -2.5125F, 0.125F, -7.0F, 5, 0, 13, 0.0F, true));
        this.leftwing.cubeList.add(new ModelBox(leftwing, 0, 16, -2.5125F, 0.15F, -7.0F, 5, 0, 13, 0.0F, true));

        this.leftwing2 = new AdvancedModelRenderer(this);
        this.leftwing2.setRotationPoint(2.4625F, 0.125F, 0.5F);
        this.leftwing.addChild(leftwing2);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 22, 33, 0.0F, 0.025F, -6.5F, 2, 0, 11, 0.0F, true));
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 31, 0, 0.0F, 0.0F, -6.5F, 2, 0, 11, 0.0F, true));

        this.leftwing3 = new AdvancedModelRenderer(this);
        this.leftwing3.setRotationPoint(2.0F, 0.0F, 0.5F);
        this.leftwing2.addChild(leftwing3);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 0, 54, 0.0F, 0.0F, -5.0F, 2, 0, 8, 0.0F, true));
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 48, 53, 0.0F, 0.025F, -5.0F, 2, 0, 8, 0.0F, true));

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
        this.main.offsetY = -0.35F;
        this.main.offsetX = 0.5F;
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
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        ((EntityPrehistoricFloraAellopobatis) e).tailBuffer.applyChainSwingBuffer(fishTail);

        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;

        AdvancedModelRenderer[] leftwings = {this.leftwing, this.leftwing2, this.leftwing3};
        AdvancedModelRenderer[] rightwings = {this.rightwing, this.rightwing2, this.rightwing3};
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
            //this.swing(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
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


            this.flap(backrightfin, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            //this.swing(backrightfin, (float) (speed), 0.2F, true, 0, 0, f2, 1);


        }
    }
}