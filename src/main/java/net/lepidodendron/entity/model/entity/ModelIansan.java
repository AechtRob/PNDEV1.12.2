package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraIansan;
import net.lepidodendron.entity.EntityPrehistoricFloraSpathobatis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelIansan extends ModelBasePalaeopedia {
    private ModelAnimator animator;
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer left;
    private final AdvancedModelRenderer right;

    public ModelIansan() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 23.675F, 7.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 48, -2.5F, -2.0F, -11.0F, 6, 2, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 55, 40, -0.025F, -0.15F, -15.75F, 1, 0, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -2.0F, -9.0F, 9, 2, 12, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 34, 45, -2.0F, -1.0F, -13.75F, 5, 1, 3, -0.001F, false));
        this.main.cubeList.add(new ModelBox(main, 4, 6, -0.5F, -1.0F, -14.75F, 2, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.0F, -13.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.24F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.0F, 0.525F, -2.0F, 1, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.875F, -1.525F, -9.5F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.3491F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 0, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.875F, -1.525F, -9.5F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.3491F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 7, 0, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -1.525F, 3.0F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 23, 29, -3.0F, -0.5F, 0.0F, 6, 2, 6, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-3.0F, 1.25F, 0.0F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.4363F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.0125F, 0.0F);
        this.backrightfin.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.4363F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 38, -4.0F, 0.0125F, 0.0F, 4, 0, 6, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 38, -4.0F, -0.0125F, 0.0F, 4, 0, 6, 0.0F, true));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(3.0F, 1.25F, 0.0F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, -0.4363F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.0125F, 0.0F);
        this.backleftfin.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 38, 0.0F, 0.0125F, 0.0F, 4, 0, 6, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 38, 0.0F, -0.0125F, 0.0F, 4, 0, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 40, -2.0F, -0.5F, 0.0F, 4, 2, 5, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 31, 0, -1.5F, -0.75F, 0.0F, 3, 2, 7, -0.02F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.05F, 1.3F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 15, 0.0F, -2.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 14, 28, -1.0F, -0.5F, -0.25F, 2, 1, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.2F, 0.75F);
        this.tail4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 6, 0.0F, -2.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -1.0F, 4.75F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 46, 45, -0.5F, 0.5F, -0.25F, 1, 1, 5, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.525F, 1.675F);
        this.tail5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 45, 3, 0.0F, -2.5F, 0.0F, 0, 3, 7, 0.0F, false));

        this.left = new AdvancedModelRenderer(this);
        this.left.setRotationPoint(4.9875F, -0.275F, -2.75F);
        this.main.addChild(left);
        this.left.cubeList.add(new ModelBox(left, 0, 28, 0.0125F, -0.875F, -4.75F, 2, 1, 9, -0.01F, false));
        this.left.cubeList.add(new ModelBox(left, 25, 16, -0.5125F, 0.125F, -6.0F, 6, 0, 12, 0.0F, false));
        this.left.cubeList.add(new ModelBox(left, 0, 15, -0.5125F, 0.15F, -6.0F, 6, 0, 12, 0.0F, false));
        this.left.cubeList.add(new ModelBox(left, 42, 29, -2.0125F, 0.15F, -10.0F, 5, 0, 4, 0.0F, false));
        this.left.cubeList.add(new ModelBox(left, 15, 45, -2.0125F, 0.125F, -10.0F, 5, 0, 4, 0.0F, false));
        this.left.cubeList.add(new ModelBox(left, 14, 50, -4.0125F, 0.175F, -13.0F, 4, 0, 3, 0.0F, false));
        this.left.cubeList.add(new ModelBox(left, 49, 34, -4.0125F, 0.15F, -13.0F, 4, 0, 3, 0.0F, false));

        this.right = new AdvancedModelRenderer(this);
        this.right.setRotationPoint(-5.9875F, -0.775F, -2.75F);
        this.main.addChild(right);
        this.right.cubeList.add(new ModelBox(right, 0, 28, -0.0125F, -0.375F, -4.75F, 2, 1, 9, -0.01F, true));
        this.right.cubeList.add(new ModelBox(right, 25, 16, -3.4875F, 0.625F, -6.0F, 6, 0, 12, 0.0F, true));
        this.right.cubeList.add(new ModelBox(right, 0, 15, -3.4875F, 0.65F, -6.0F, 6, 0, 12, 0.0F, true));
        this.right.cubeList.add(new ModelBox(right, 42, 29, -0.9875F, 0.65F, -10.0F, 5, 0, 4, 0.0F, true));
        this.right.cubeList.add(new ModelBox(right, 15, 45, -0.9875F, 0.625F, -10.0F, 5, 0, 4, 0.0F, true));
        this.right.cubeList.add(new ModelBox(right, 14, 50, 2.0125F, 0.675F, -13.0F, 4, 0, 3, 0.0F, true));
        this.right.cubeList.add(new ModelBox(right, 49, 34, 2.0125F, 0.65F, -13.0F, 4, 0, 3, 0.0F, true));

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
        ((EntityPrehistoricFloraIansan) e).tailBuffer.applyChainSwingBuffer(fishTail);

        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;

//        AdvancedModelRenderer[] leftwings = {this.leftwing, this.leftwing2, this.leftwing3, this.leftwing4};
//        AdvancedModelRenderer[] rightwings = {this.rightwing, this.rightwing2, this.rightwing3, this.rightwing4};
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
//                this.chainFlap(leftwings, speed * 2.5F, 0.15F, 0, f2, 1);
//                this.chainFlap(rightwings, speed * 2.5F, -0.15F, 0, f2, 1);
                this.chainWave(fishTail, speed * 2.5F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed * 2.5F, 0.25F, -3, f2, 1);
            } else { //if not accelerating swing fins instead
                //this.swing(leftFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -0, -0.5F, f2, 1);
                //this.swing(rightFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -3, 0.5F, f2, 1);
//                this.flap(LeftPectoral, (speed), 0.25F, true, -3, 0, f2, 1);
//                this.flap(RightPectoral, (speed), -0.25F, true, -3, 0, f2, 1);
//                this.chainFlap(leftwings, speed, 0.15F, 0, f2, 1);
//                this.chainFlap(rightwings, speed, -0.15F, 0, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            }


            this.flap(backrightfin, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            //this.swing(backrightfin, (float) (speed), 0.2F, true, 0, 0, f2, 1);


        }
    }
}