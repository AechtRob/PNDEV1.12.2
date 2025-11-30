package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBrachydectes;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBrachydectes extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer Mouth;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer tail;

    private ModelAnimator animator;

    public ModelBrachydectes() {
        this.textureWidth = 85;
        this.textureHeight = 75;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 22.5F, 1.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -15.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 32, 37, -1.5F, -2.5F, -0.02F, 3, 4, 13, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0262F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 19, -1.5F, 0.0F, -0.02F, 3, 1, 13, -0.015F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 0, 53, -1.0F, -1.5F, -12.01F, 2, 3, 13, -0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.5F, -12.0F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0698F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 54, -1.0F, 0.0F, -0.01F, 2, 1, 13, -0.03F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2618F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 4, -1.0F, -1.5F, -2.5F, 2, 1, 3, 0.0F, false));

        this.Mouth = new AdvancedModelRenderer(this);
        this.Mouth.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.head.addChild(Mouth);
        this.setRotateAngle(Mouth, -0.1745F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Mouth.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -1.0F, -3.0F, 2, 1, 3, -0.01F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(0.5F, 1.0F, -10.0F);
        this.neck.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.5404F, -1.1011F, -0.5216F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 0, 12, 0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.0F, 0.0F, 0.1745F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 6, 10, 0.0F, -0.5F, -0.5F, 2, 1, 1, -0.01F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-0.5F, 1.0F, -10.0F);
        this.neck.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.5404F, 1.1011F, 0.5216F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 6, 8, -2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.0F, 0.0F, -0.1745F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 8, -2.0F, -0.5F, -0.5F, 2, 1, 1, -0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 11.98F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 18, -2.0F, -2.5F, -0.01F, 4, 4, 14, -0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 22, 22, -1.5F, -3.0F, -0.01F, 3, 1, 14, -0.02F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 12.99F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -2.0F, -2.5F, -0.01F, 4, 4, 14, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 22, 4, -1.5F, -3.0F, -0.01F, 3, 1, 14, -0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 12.99F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 36, -1.5F, -2.5F, -0.01F, 3, 4, 13, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.5F, 13.04F);
        this.body4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 51, 33, -1.5F, 0.0F, -13.05F, 3, 1, 13, -0.02F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 11.99F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 42, 0, -1.5F, -1.5F, -0.02F, 3, 3, 13, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.5F, 13.05F);
        this.body5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 51, 47, -1.5F, 0.0F, -13.07F, 3, 1, 13, -0.02F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 11.99F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 17, 53, -1.0F, -1.5F, -0.02F, 2, 3, 7, -0.01F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(0.5F, 1.0F, 6.06F);
        this.body6.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.1298F, -0.7769F, 0.1841F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 10, 0.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.5F, 0.0F, -0.5F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, -0.5672F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 18, 0.0F, -0.5F, -0.5F, 2, 1, 1, -0.01F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-0.5F, 1.0F, 6.06F);
        this.body6.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.1298F, 0.7769F, -0.1841F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 7, 4, -2.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.5F, 0.0F, -0.5F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.5672F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 6, 12, -2.0F, -0.5F, -0.5F, 2, 1, 1, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 6.99F);
        this.body6.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 19, 37, -0.5F, -1.2F, -1.03F, 1, 2, 8, -0.01F, false));
        this.tail.cubeList.add(new ModelBox(tail, 7, 0, -0.5F, -0.7F, 6.97F, 1, 1, 2, 0.0F, false));

        animator = ModelAnimator.create();
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(neck, 0.0F, -0.2F, 0.05F);
        this.setRotateAngle(head, 0.0F, -0.2F, 0.05F);
        this.setRotateAngle(body, 0.0F, 0.2F, 0.05F);
        this.setRotateAngle(body2, 0.0F, 0.3F, 0.05F);
        this.setRotateAngle(body3, 0.0F, 0.4F, 0.05F);
        this.setRotateAngle(body4, 0.0F, -0.5F, 0.05F);
        this.setRotateAngle(body5, 0.0F, -0.6F, 0.05F);
        this.setRotateAngle(body6, 0.0F, -0.8F, 0.05F);
        this.setRotateAngle(tail, 0.0F, -1.0F, 0.05F);
        this.root.offsetX = -0.006F;
        this.root.offsetY = -0.12F;
        this.root.offsetZ = -0.15F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.5F;
        this.root.offsetX = 0.8F;
        this.root.rotateAngleY = (float)Math.toRadians(245);
        this.root.rotateAngleX = (float)Math.toRadians(28);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 0.90F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(neck, 0.0F, -0.2F, 0.05F);
        this.setRotateAngle(head, 0.0F, -0.2F, 0.05F);
        this.setRotateAngle(body, 0.0F, 0.2F, 0.05F);
        this.setRotateAngle(body2, 0.0F, 0.3F, 0.05F);
        this.setRotateAngle(body3, 0.0F, 0.4F, 0.05F);
        this.setRotateAngle(body4, 0.0F, -0.5F, 0.05F);
        this.setRotateAngle(body5, 0.0F, -0.6F, 0.05F);
        this.setRotateAngle(body6, 0.0F, -0.8F, 0.05F);
        this.setRotateAngle(tail, 0.0F, -1.0F, 0.05F);

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
        //this.resetToDefaultPose();
        this.root.offsetZ = -0.6F;

        EntityPrehistoricFloraBrachydectes Brachydectes = (EntityPrehistoricFloraBrachydectes) e;

        this.faceTarget(f3, f4, 16, head);
        AdvancedModelRenderer[] Tail = {this.body2, this.body3, this.body4, this.body5, this.body6, this.tail};
        Brachydectes.tailBuffer.applyChainSwingBuffer(Tail);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraBrachydectes ee = (EntityPrehistoricFloraBrachydectes) entitylivingbaseIn;

        //the only animation for this is managed directly by the animation ticker:
        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animMove(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
            } else {
                animMove(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        }

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBrachydectes entity = (EntityPrehistoricFloraBrachydectes) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*30), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-3));
        this.body.rotationPointX = this.body.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+95))*5);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-30), body2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*3));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-20), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-20), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-30), body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-30), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-20), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*3));


        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(0), body6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-30), body6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(0), leftLeg.rotateAngleY + (float) Math.toRadians(-25), leftLeg.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(0), rightLeg.rotateAngleY + (float) Math.toRadians(25), rightLeg.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-30), tail.rotateAngleZ + (float) Math.toRadians(0));
    }
    public void animMove(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraBrachydectes entity = (EntityPrehistoricFloraBrachydectes) entitylivingbaseIn;
        int animCycle = 160;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*10), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-3));
        this.body.rotationPointX = this.body.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+95))*2);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-10), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-5), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*3));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-30), leftArm.rotateAngleY + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*40), leftArm.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))*30));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0), leftArm2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*20), leftArm2.rotateAngleZ + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*20));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*30), rightArm.rotateAngleY + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*40), rightArm.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))*30));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0), rightArm2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*20), rightArm2.rotateAngleZ + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*20));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-5), body2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*3));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-5), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-5), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-5), body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(0), body6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-3), body6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(41.0872), leftLeg.rotateAngleY + (float) Math.toRadians(-36.85641), leftLeg.rotateAngleZ + (float) Math.toRadians(-41.44798));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0), leftLeg2.rotateAngleY + (float) Math.toRadians(25.5), leftLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(21.15674), rightLeg.rotateAngleY + (float) Math.toRadians(30.69311), rightLeg.rotateAngleZ + (float) Math.toRadians(21.84995));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0), rightLeg2.rotateAngleY + (float) Math.toRadians(-14.25), rightLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-2), tail.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Mouth, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
