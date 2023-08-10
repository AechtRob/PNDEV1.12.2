package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraSpathobatis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSpathobatis extends AdvancedModelBase {
    private ModelAnimator animator;
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer leftwing;
    private final AdvancedModelRenderer leftwing2;
    private final AdvancedModelRenderer leftwing3;
    private final AdvancedModelRenderer leftwing4;
    private final AdvancedModelRenderer rightwing;
    private final AdvancedModelRenderer rightwing2;
    private final AdvancedModelRenderer rightwing3;
    private final AdvancedModelRenderer rightwing4;

    public ModelSpathobatis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 23.675F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 24, 43, -2.5F, -3.0F, -11.0F, 6, 3, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 18, 1.225F, -3.1F, -10.0F, 1, 3, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 10, -1.225F, -3.1F, -10.0F, 1, 3, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 13, 19, 4.0F, -2.0F, -5.0F, 3, 2, 13, -0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 13, 19, -6.0F, -2.0F, -5.0F, 3, 2, 13, -0.01F, true));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -3.0F, -7.0F, 9, 3, 15, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 24, -1.0F, -2.0F, -15.0F, 3, 2, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 44, 5, 0.0F, -1.0F, -19.0F, 1, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -0.5F, -16.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.432F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.701F, -0.5F, -1.05F, 1, 1, 2, -0.01F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 23, -0.275F, -0.5F, -3.05F, 1, 1, 4, -0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, -0.5F, -16.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.432F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.701F, -0.5F, -1.05F, 1, 1, 2, -0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 23, -0.725F, -0.5F, -3.05F, 1, 1, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -3.0F, -13.0F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.24F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 0, -2.0F, 0.525F, -2.0F, 4, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.87F, -16.0414F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3098F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 31, -0.5F, 0.2523F, -1.8652F, 1, 1, 3, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.5F, -1.0F, -8.0F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.6676F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 18, -2.325F, -1.0F, -7.675F, 5, 2, 11, -0.02F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(5.5F, -1.0F, -8.0F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.6676F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 18, -2.675F, -1.0F, -7.675F, 5, 2, 11, -0.02F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -1.525F, 7.0F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 22, 34, -3.5F, -1.5F, 0.0F, 7, 3, 6, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(3.5F, 0.5F, 3.5F);
        this.tail.addChild(backleftfin);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 27, 18, 0.0F, 0.0F, -2.5F, 4, 0, 5, 0.0F, false));
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 0, 10, 0.0F, 0.025F, -2.5F, 4, 0, 5, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-3.5F, 0.5F, 3.5F);
        this.tail.addChild(backrightfin);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 27, 18, -4.0F, 0.0F, -2.5F, 4, 0, 5, 0.0F, true));
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 0, 10, -4.0F, 0.025F, -2.5F, 4, 0, 5, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 11, 43, -1.5F, -1.5F, 0.0F, 3, 3, 7, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 6.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 40, 35, -1.0F, -1.75F, 0.0F, 2, 3, 8, -0.02F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 1, 0.0F, -5.75F, 2.0F, 0, 4, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 8.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 33, 4, -0.5F, -0.5F, -0.25F, 1, 2, 9, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 25, 0.0F, -4.5F, 3.75F, 0, 4, 5, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 8.75F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 23, 0.0F, -5.5F, 0.0F, 0, 7, 11, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 1.25F, 11.0F);
        this.tail5.addChild(tail6);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 32, 0.0F, -6.25F, 0.0F, 0, 7, 9, 0.0F, false));

        this.leftwing = new AdvancedModelRenderer(this);
        this.leftwing.setRotationPoint(6.9875F, -1.075F, 0.25F);
        this.main.addChild(leftwing);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 6, 18, -0.5125F, 0.125F, -7.0F, 3, 0, 14, 0.0F, false));
        this.leftwing.cubeList.add(new ModelBox(leftwing, 0, 18, -0.5125F, 0.15F, -7.0F, 3, 0, 14, 0.0F, false));

        this.leftwing2 = new AdvancedModelRenderer(this);
        this.leftwing2.setRotationPoint(2.4625F, 0.125F, 0.5F);
        this.leftwing.addChild(leftwing2);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 24, 0, 0.0F, 0.025F, -6.5F, 2, 0, 13, 0.0F, false));
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 20, 0, 0.0F, 0.0F, -6.5F, 2, 0, 13, 0.0F, false));

        this.leftwing3 = new AdvancedModelRenderer(this);
        this.leftwing3.setRotationPoint(2.0F, 0.0F, 0.5F);
        this.leftwing2.addChild(leftwing3);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 0, 18, 0.0F, 0.0F, -5.0F, 2, 0, 10, 0.0F, false));
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 0, 0, 0.0F, 0.025F, -5.0F, 2, 0, 10, 0.0F, false));

        this.leftwing4 = new AdvancedModelRenderer(this);
        this.leftwing4.setRotationPoint(2.0F, 0.0F, 1.0F);
        this.leftwing3.addChild(leftwing4);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 0, 18, 0.0F, 0.0F, -3.0F, 2, 0, 6, 0.0F, false));
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 0, 0, 0.0F, 0.025F, -3.0F, 2, 0, 6, 0.0F, false));

        this.rightwing = new AdvancedModelRenderer(this);
        this.rightwing.setRotationPoint(-5.9875F, -1.075F, 0.25F);
        this.main.addChild(rightwing);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 6, 18, -2.4875F, 0.125F, -7.0F, 3, 0, 14, 0.0F, true));
        this.rightwing.cubeList.add(new ModelBox(rightwing, 0, 18, -2.4875F, 0.15F, -7.0F, 3, 0, 14, 0.0F, true));

        this.rightwing2 = new AdvancedModelRenderer(this);
        this.rightwing2.setRotationPoint(-2.4625F, 0.125F, 0.5F);
        this.rightwing.addChild(rightwing2);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 24, 0, -2.0F, 0.025F, -6.5F, 2, 0, 13, 0.0F, true));
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 20, 0, -2.0F, 0.0F, -6.5F, 2, 0, 13, 0.0F, true));

        this.rightwing3 = new AdvancedModelRenderer(this);
        this.rightwing3.setRotationPoint(-2.0F, 0.0F, 0.5F);
        this.rightwing2.addChild(rightwing3);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 0, 18, -2.0F, 0.0F, -5.0F, 2, 0, 10, 0.0F, true));
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 0, 0, -2.0F, 0.025F, -5.0F, 2, 0, 10, 0.0F, true));

        this.rightwing4 = new AdvancedModelRenderer(this);
        this.rightwing4.setRotationPoint(-2.0F, 0.0F, 1.0F);
        this.rightwing3.addChild(rightwing4);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 0, 18, -2.0F, 0.0F, -3.0F, 2, 0, 6, 0.0F, true));
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 0, 0, -2.0F, 0.025F, -3.0F, 2, 0, 6, 0.0F, true));

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
            this.setRotateAngle(main, 0.2F, 0.0F, -0.2F);
            this.setRotateAngle(tail, 0.1F, 0.1F, 0.0F);
            this.setRotateAngle(tail2, 0.1F, 0.1F, 0.0F);
            this.setRotateAngle(tail3, 0.1F, 0.2F, 0.0F);
            this.setRotateAngle(tail4, 0.1F, -0.2F, 0.0F);
            this.setRotateAngle(tail5, 0.2F, -0.3F, 0.0F);
            this.setRotateAngle(tail6, 0.2F, -0.3F, 0.0F);
            this.setRotateAngle(leftwing, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(leftwing2, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(leftwing3, 0.0F, 0.0F, -0.2F);
            this.setRotateAngle(leftwing4, 0.0F, 0.0F, -0.3F);
            this.setRotateAngle(rightwing, 0.0F, 0.0F, 0.1F);
            this.setRotateAngle(rightwing2, 0.0F, 0.0F, 0.1F);
            this.setRotateAngle(rightwing3, 0.0F, 0.0F, 0.2F);
            this.setRotateAngle(rightwing4, 0.0F, 0.0F, 0.3F);
            this.main.offsetY = -0.14F;
            this.main.render(0.01F);
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
        ((EntityPrehistoricFloraSpathobatis) e).tailBuffer.applyChainSwingBuffer(fishTail);

        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;

        AdvancedModelRenderer[] leftwings = {this.leftwing, this.leftwing2, this.leftwing3, this.leftwing4};
        AdvancedModelRenderer[] rightwings = {this.rightwing, this.rightwing2, this.rightwing3, this.rightwing4};
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