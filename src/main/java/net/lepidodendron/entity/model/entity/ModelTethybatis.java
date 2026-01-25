package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraTethybatis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelTethybatis extends ModelBasePalaeopedia {
    private ModelAnimator animator;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;

    public ModelTethybatis() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -14.0F);
        this.body.cubeList.add(new ModelBox(body, 30, 34, -3.0F, -2.0F, 5.8F, 6, 2, 9, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 52, 32, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 52, 26, -2.5F, -1.0F, 1.0F, 5, 1, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.125F, 0.0F, 0.25F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0698F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 28, 1.5F, -1.0F, 1.0F, 1, 1, 5, 0.02F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.125F, 0.0F, 0.25F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0698F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 28, -2.5F, -1.0F, 1.0F, 1, 1, 5, 0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.7F, 5.7F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 45, -0.5F, -0.01F, 0.0F, 1, 0, 9, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 34, -3.0F, 0.0F, 0.0F, 6, 2, 9, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 1.0036F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 60, 41, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -1.0036F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 60, 41, 0.0F, -1.0F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.85F, -2.2F, 3.15F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2793F, 0.2836F, -0.5672F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 62, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.85F, -2.2F, 3.15F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2793F, -0.2836F, 0.5672F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 44, 62, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.075F, 0.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2749F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 62, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.01F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 55, -2.0F, 0.0F, 1.0F, 4, 2, 5, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.0F, -0.2F, 1.5F);
        this.body.addChild(pectoralfinright);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 0, 0, -8.75F, 0.0F, -1.0F, 9, 0, 17, 0.0F, false));
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 0, 17, -8.75F, 0.02F, -1.0F, 9, 0, 17, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.0F, -0.2F, 1.5F);
        this.body.addChild(pectoralfinleft);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 0, 0, -0.25F, 0.0F, -1.0F, 9, 0, 17, 0.0F, true));
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 0, 17, -0.25F, 0.02F, -1.0F, 9, 0, 17, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.0F, 14.9F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 52, 0, -2.5F, -2.0F, -1.0F, 5, 3, 7, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.5F, 6.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 55, -1.5F, -1.5F, -1.0F, 3, 3, 7, -0.01F, false));
        this.body3.cubeList.add(new ModelBox(body3, 56, 53, 0.0F, -5.5F, 0.3F, 0, 4, 5, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 60, 32, 0.0F, -5.5F, 0.25F, 0, 4, 5, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 20, 55, -1.0F, -1.5F, -1.0F, 2, 3, 7, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.4363F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 56, 45, -0.5F, -1.0F, -1.0F, 1, 2, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.7F, 0.0F);
        this.body5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5236F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 52, 10, 0.0F, -8.0F, -1.0F, 0, 8, 8, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-2.5F, 0.875F, 0.1F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.0262F, 0.1309F, 0.0F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 0, 45, -3.25F, 0.0F, 0.0F, 4, 0, 10, 0.0F, false));
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 28, 45, -3.25F, 0.015F, 0.0F, 4, 0, 10, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(2.5F, 0.875F, 0.1F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.0262F, -0.1309F, 0.0F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 0, 45, -0.75F, 0.0F, 0.0F, 4, 0, 10, 0.0F, true));
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 28, 45, -0.75F, 0.015F, 0.0F, 4, 0, 10, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleX = (float) Math.toRadians(90);
        this.body.rotateAngleZ = (float) Math.toRadians(90);
        this.body.offsetX = -0.07F;
        this.body.offsetZ = 0.02F;
        this.body.offsetY = -0.245F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
        public void renderStaticFloor(float f) {
            this.body.offsetY = -0.14F;
            this.body.render(0.01F);
            resetToDefaultPose();
        }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.35F;
        this.body.offsetX = 0.5F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(0);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 1.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3 , this.body4, this.body5};
        ((EntityPrehistoricFloraTethybatis) e).tailBuffer.applyChainSwingBuffer(fishTail);

        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;

        AdvancedModelRenderer[] leftwings = {this.pectoralfinleft};
        AdvancedModelRenderer[] rightwings = {this.pectoralfinright};
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


            this.flap(pelvicfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
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


            this.flap(pelvicfinright, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            //this.swing(backrightfin, (float) (speed), 0.2F, true, 0, 0, f2, 1);


        }
    }
}