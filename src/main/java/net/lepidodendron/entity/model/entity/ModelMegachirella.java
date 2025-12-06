package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMegachirella;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMegachirella extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;

    private ModelAnimator animator;

    public ModelMegachirella() {
        this.textureWidth = 48;
        this.textureHeight = 36;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 21.75F, 8.0F);
        this.setRotateAngle(main, -0.0873F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 13, 26, -2.0F, -1.5F, -4.0F, 4, 3, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5F, -4.0F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -1.5F, -8.0F, 5, 4, 9, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.1F, -7.5F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.3054F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 26, 14, -1.5F, -1.5F, -4.25F, 3, 3, 5, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.1F, -3.75F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.3054F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 30, 5, -1.5F, -1.5F, -3.0F, 3, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 13, 18, -1.0F, -0.5F, -6.0F, 2, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5F, -6.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 22, -1.0F, 0.0F, 0.0F, 2, 1, 1, -0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 4, 21, -1.0F, 0.0F, 0.25F, 2, 1, 1, -0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 0.5F, -4.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.4363F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 21, -1.0F, -1.0F, -0.9F, 1, 1, 2, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 5, 3, -1.05F, -2.15F, 0.075F, 1, 2, 1, -0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 0.5F, -4.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 5, 3, 0.05F, -2.15F, 0.075F, 1, 2, 1, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 21, 0.0F, -1.0F, -0.9F, 1, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.5F, -3.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 0, -1.0F, 0.0F, -2.0F, 2, 1, 2, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.25F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 30, 0, -1.5F, -1.01F, -2.99F, 3, 2, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 17, -1.0F, -0.01F, -5.97F, 2, 1, 3, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 0.0F, -4.0F);
        this.jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 5, -1.025F, -0.025F, -0.9F, 1, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 0.0F, -4.0F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.4363F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 5, 0.025F, -0.025F, -0.9F, 1, 1, 2, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.0F, 1.0F, -7.0F);
        this.body.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.0F, 0.3491F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 19, 3, -2.75F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 0, 7, -2.75F, -0.5F, 0.0F, 3, 1, 1, -0.01F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-3.0F, 0.25F, 0.25F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.6534F, -0.0964F, -0.0108F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 3, 0.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.5F, 0.0F, -2.95F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, -0.6619F, -0.1382F, 0.1069F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 0, 0, -1.5F, 0.0F, -3.0F, 3, 0, 3, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.0F, 1.0F, -7.0F);
        this.body.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0F, -0.3491F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 19, 3, -0.25F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 0, 7, -0.25F, -0.5F, 0.0F, 3, 1, 1, -0.01F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(3.0F, 0.25F, 0.25F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.6534F, 0.0964F, 0.0108F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 3, -1.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.5F, 0.0F, -2.95F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, -0.6619F, 0.1382F, -0.1069F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 0, 0, -1.5F, 0.0F, -3.0F, 3, 0, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.25F, 1.0F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 25, -1.0F, -1.0F, -2.0F, 2, 2, 9, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 2, -0.75F, -0.25F, -1.0F, 1, 1, 11, 0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 13, -0.75F, -0.75F, -1.0F, 1, 1, 11, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 13, -0.25F, -0.75F, -1.0F, 1, 1, 11, 0.0F, true));
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 2, -0.25F, -0.25F, -1.0F, 1, 1, 11, 0.01F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 9.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 13, 14, -0.5F, -0.5F, 0.0F, 1, 1, 11, -0.01F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.5F, 0.0F, -0.5F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.0361F, 0.3911F, 0.2689F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 13, 0.0F, -1.0F, -1.5F, 3, 2, 2, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(3.0F, 0.0F, -1.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.2615F, 0.0236F, -0.1006F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 26, 29, -1.5F, -0.5F, 0.0F, 2, 1, 5, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.5F, 0.0F, 4.5F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 2.7005F, 0.4722F, 2.7875F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 9, 14, -3.3633F, 0.0084F, -0.4774F, 4, 0, 4, 0.0F, true));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.5F, 0.0F, -0.5F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.0361F, -0.3911F, -0.2689F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 13, -3.0F, -1.0F, -1.5F, 3, 2, 2, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-3.0F, 0.0F, -1.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.2615F, -0.0236F, 0.1006F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 26, 29, -0.5F, -0.5F, 0.0F, 2, 1, 5, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.5F, 0.0F, 4.5F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 2.7005F, -0.4722F, -2.7875F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 9, 14, -0.6367F, 0.0084F, -0.4774F, 4, 0, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.70F;
        this.main.offsetX = 0.2F;
        this.main.rotateAngleY = (float)Math.toRadians(130);
        this.main.rotateAngleX = (float)Math.toRadians(10);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.8F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.4F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.main.offsetY = 0.122F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraMegachirella proteros = (EntityPrehistoricFloraMegachirella) e;

        this.faceTarget(f3, f4, 10, neck);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION
                        && proteros.getAnimation() != proteros.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMegachirella ee = (EntityPrehistoricFloraMegachirella) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMegachirella entity = (EntityPrehistoricFloraMegachirella) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
 if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-75.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0.11333-(0)));
            yy = -75.75 + (((tickAnim - 10) / 5) * (-22.56082-(-75.75)));
            zz = 0 + (((tickAnim - 10) / 5) * (-14.99006-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.11333 + (((tickAnim - 15) / 5) * (0-(0.11333)));
            yy = -22.56082 + (((tickAnim - 15) / 5) * (0-(-22.56082)));
            zz = -14.99006 + (((tickAnim - 15) / 5) * (0-(-14.99006)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-75.75-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (3.47226-(0)));
            yy = -75.75 + (((tickAnim - 30) / 5) * (-30.43955-(-75.75)));
            zz = 0 + (((tickAnim - 30) / 5) * (-22.46685-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 3.47226 + (((tickAnim - 35) / 5) * (0-(3.47226)));
            yy = -30.43955 + (((tickAnim - 35) / 5) * (11.88-(-30.43955)));
            zz = -22.46685 + (((tickAnim - 35) / 5) * (0-(-22.46685)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 11.88 + (((tickAnim - 40) / 10) * (0-(11.88)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.85-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.85 + (((tickAnim - 10) / 10) * (0-(-0.85)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-0.85-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.85 + (((tickAnim - 30) / 20) * (0-(-0.85)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (54.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 54.75 + (((tickAnim - 10) / 10) * (0-(54.75)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (54.75-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (3.75-(0)));
            yy = 54.75 + (((tickAnim - 30) / 10) * (58.63-(54.75)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3.75 + (((tickAnim - 40) / 10) * (0-(3.75)));
            yy = 58.63 + (((tickAnim - 40) / 10) * (0-(58.63)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-19.58532-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (22.22257-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-37.17659-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -19.58532 + (((tickAnim - 5) / 5) * (-59.17064-(-19.58532)));
            yy = 22.22257 + (((tickAnim - 5) / 5) * (44.44514-(22.22257)));
            zz = -37.17659 + (((tickAnim - 5) / 5) * (-74.35317-(-37.17659)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -59.17064 + (((tickAnim - 10) / 10) * (0-(-59.17064)));
            yy = 44.44514 + (((tickAnim - 10) / 10) * (0-(44.44514)));
            zz = -74.35317 + (((tickAnim - 10) / 10) * (0-(-74.35317)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (-19.58532-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (22.22257-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (-37.17659-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -19.58532 + (((tickAnim - 25) / 5) * (-59.17064-(-19.58532)));
            yy = 22.22257 + (((tickAnim - 25) / 5) * (44.44514-(22.22257)));
            zz = -37.17659 + (((tickAnim - 25) / 5) * (-74.35317-(-37.17659)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -59.17064 + (((tickAnim - 30) / 10) * (-11.14542-(-59.17064)));
            yy = 44.44514 + (((tickAnim - 30) / 10) * (35.12745-(44.44514)));
            zz = -74.35317 + (((tickAnim - 30) / 10) * (-15.08819-(-74.35317)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -11.14542 + (((tickAnim - 40) / 10) * (0-(-11.14542)));
            yy = 35.12745 + (((tickAnim - 40) / 10) * (0-(35.12745)));
            zz = -15.08819 + (((tickAnim - 40) / 10) * (0-(-15.08819)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMegachirella entity = (EntityPrehistoricFloraMegachirella) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 5.5 + (((tickAnim - 8) / 7) * (0-(5.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 15.25 + (((tickAnim - 8) / 7) * (0-(15.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.325-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0.325 + (((tickAnim - 8) / 7) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (17.5-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 17.5 + (((tickAnim - 6) / 2) * (0-(17.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMegachirella entity = (EntityPrehistoricFloraMegachirella) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*4), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*4));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.25);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-4), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*7), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 42.41205 + (((tickAnim - 0) / 8) * (8.70238-(42.41205)));
            yy = 46.18998 + (((tickAnim - 0) / 8) * (-25.46095-(46.18998)));
            zz = 9.92276 + (((tickAnim - 0) / 8) * (19.03031-(9.92276)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 8.70238 + (((tickAnim - 8) / 2) * (0-(8.70238)));
            yy = -25.46095 + (((tickAnim - 8) / 2) * (-53-(-25.46095)));
            zz = 19.03031 + (((tickAnim - 8) / 2) * (0-(19.03031)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (42.41205-(0)));
            yy = -53 + (((tickAnim - 10) / 10) * (46.18998-(-53)));
            zz = 0 + (((tickAnim - 10) / 10) * (9.92276-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.48901 + (((tickAnim - 0) / 3) * (55.72031-(23.48901)));
            yy = 5.77894 + (((tickAnim - 0) / 3) * (8.57853-(5.77894)));
            zz = 52.10417 + (((tickAnim - 0) / 3) * (38.60953-(52.10417)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 55.72031 + (((tickAnim - 3) / 2) * (16.5281-(55.72031)));
            yy = 8.57853 + (((tickAnim - 3) / 2) * (25.03757-(8.57853)));
            zz = 38.60953 + (((tickAnim - 3) / 2) * (42.84435-(38.60953)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 16.5281 + (((tickAnim - 5) / 3) * (-30.56709-(16.5281)));
            yy = 25.03757 + (((tickAnim - 5) / 3) * (14.17773-(25.03757)));
            zz = 42.84435 + (((tickAnim - 5) / 3) * (11.62024-(42.84435)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -30.56709 + (((tickAnim - 8) / 2) * (0-(-30.56709)));
            yy = 14.17773 + (((tickAnim - 8) / 2) * (48.5-(14.17773)));
            zz = 11.62024 + (((tickAnim - 8) / 2) * (0-(11.62024)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (23.48901-(0)));
            yy = 48.5 + (((tickAnim - 10) / 10) * (5.77894-(48.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (52.10417-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.425 + (((tickAnim - 0) / 3) * (0.325-(0.425)));
            yy = 0.4 + (((tickAnim - 0) / 3) * (0.525-(0.4)));
            zz = 0.725 + (((tickAnim - 0) / 3) * (0.15-(0.725)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0.325 + (((tickAnim - 3) / 7) * (0-(0.325)));
            yy = 0.525 + (((tickAnim - 3) / 7) * (0-(0.525)));
            zz = 0.15 + (((tickAnim - 3) / 7) * (0-(0.15)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0.425-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0.4-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0.725-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -73.97787 + (((tickAnim - 0) / 3) * (51.80238-(-73.97787)));
            yy = -26.30334 + (((tickAnim - 0) / 3) * (20.47769-(-26.30334)));
            zz = 15.85571 + (((tickAnim - 0) / 3) * (0.22063-(15.85571)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 51.80238 + (((tickAnim - 3) / 5) * (65.85662-(51.80238)));
            yy = 20.47769 + (((tickAnim - 3) / 5) * (2.14539-(20.47769)));
            zz = 0.22063 + (((tickAnim - 3) / 5) * (-14.47107-(0.22063)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 65.85662 + (((tickAnim - 8) / 2) * (0-(65.85662)));
            yy = 2.14539 + (((tickAnim - 8) / 2) * (0-(2.14539)));
            zz = -14.47107 + (((tickAnim - 8) / 2) * (0-(-14.47107)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-15.46791-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-26.20649-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.87733-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -15.46791 + (((tickAnim - 13) / 3) * (-41.00599-(-15.46791)));
            yy = -26.20649 + (((tickAnim - 13) / 3) * (-35.42758-(-26.20649)));
            zz = -0.87733 + (((tickAnim - 13) / 3) * (8.96895-(-0.87733)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -41.00599 + (((tickAnim - 16) / 4) * (-73.97787-(-41.00599)));
            yy = -35.42758 + (((tickAnim - 16) / 4) * (-26.30334-(-35.42758)));
            zz = 8.96895 + (((tickAnim - 16) / 4) * (15.85571-(8.96895)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0.625-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 8) / 2) * (0-(0.25)));
            zz = 0.625 + (((tickAnim - 8) / 2) * (0-(0.625)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0.2-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0.2 + (((tickAnim - 12) / 1) * (0.125-(0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0.125 + (((tickAnim - 13) / 3) * (0.15-(0.125)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0.15 + (((tickAnim - 16) / 2) * (0.14-(0.15)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0.14 + (((tickAnim - 18) / 2) * (0-(0.14)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (42.41205-(0)));
            yy = 53 + (((tickAnim - 0) / 10) * (-46.18998-(53)));
            zz = 0 + (((tickAnim - 0) / 10) * (-9.92276-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 42.41205 + (((tickAnim - 10) / 8) * (8.70238-(42.41205)));
            yy = -46.18998 + (((tickAnim - 10) / 8) * (25.46095-(-46.18998)));
            zz = -9.92276 + (((tickAnim - 10) / 8) * (-19.03031-(-9.92276)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 8.70238 + (((tickAnim - 18) / 2) * (0-(8.70238)));
            yy = 25.46095 + (((tickAnim - 18) / 2) * (53-(25.46095)));
            zz = -19.03031 + (((tickAnim - 18) / 2) * (0-(-19.03031)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-4.0184-(0)));
            yy = -48.5 + (((tickAnim - 0) / 3) * (-22.54654-(-48.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (9.59663-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -4.0184 + (((tickAnim - 3) / 7) * (23.48901-(-4.0184)));
            yy = -22.54654 + (((tickAnim - 3) / 7) * (-5.77894-(-22.54654)));
            zz = 9.59663 + (((tickAnim - 3) / 7) * (-52.10417-(9.59663)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 23.48901 + (((tickAnim - 10) / 3) * (55.72031-(23.48901)));
            yy = -5.77894 + (((tickAnim - 10) / 3) * (-8.57853-(-5.77894)));
            zz = -52.10417 + (((tickAnim - 10) / 3) * (-38.60953-(-52.10417)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 55.72031 + (((tickAnim - 13) / 2) * (16.5281-(55.72031)));
            yy = -8.57853 + (((tickAnim - 13) / 2) * (-25.03757-(-8.57853)));
            zz = -38.60953 + (((tickAnim - 13) / 2) * (-42.84435-(-38.60953)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 16.5281 + (((tickAnim - 15) / 3) * (-30.56709-(16.5281)));
            yy = -25.03757 + (((tickAnim - 15) / 3) * (-14.17773-(-25.03757)));
            zz = -42.84435 + (((tickAnim - 15) / 3) * (-11.62024-(-42.84435)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -30.56709 + (((tickAnim - 18) / 2) * (0-(-30.56709)));
            yy = -14.17773 + (((tickAnim - 18) / 2) * (-48.5-(-14.17773)));
            zz = -11.62024 + (((tickAnim - 18) / 2) * (0-(-11.62024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.425-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.725-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -0.425 + (((tickAnim - 10) / 3) * (-0.325-(-0.425)));
            yy = 0.4 + (((tickAnim - 10) / 3) * (0.525-(0.4)));
            zz = 0.725 + (((tickAnim - 10) / 3) * (0.15-(0.725)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -0.325 + (((tickAnim - 13) / 7) * (0-(-0.325)));
            yy = 0.525 + (((tickAnim - 13) / 7) * (0-(0.525)));
            zz = 0.15 + (((tickAnim - 13) / 7) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-10.88048-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.76006-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-5.0343-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -10.88048 + (((tickAnim - 3) / 3) * (-35.54867-(-10.88048)));
            yy = -1.76006 + (((tickAnim - 3) / 3) * (21.71495-(-1.76006)));
            zz = -5.0343 + (((tickAnim - 3) / 3) * (-11.62864-(-5.0343)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -35.54867 + (((tickAnim - 6) / 4) * (-73.97787-(-35.54867)));
            yy = 21.71495 + (((tickAnim - 6) / 4) * (26.30334-(21.71495)));
            zz = -11.62864 + (((tickAnim - 6) / 4) * (-15.85571-(-11.62864)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -73.97787 + (((tickAnim - 10) / 3) * (51.80238-(-73.97787)));
            yy = 26.30334 + (((tickAnim - 10) / 3) * (-20.47769-(26.30334)));
            zz = -15.85571 + (((tickAnim - 10) / 3) * (0.22063-(-15.85571)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 51.80238 + (((tickAnim - 13) / 5) * (65.85662-(51.80238)));
            yy = -20.47769 + (((tickAnim - 13) / 5) * (-2.14539-(-20.47769)));
            zz = 0.22063 + (((tickAnim - 13) / 5) * (14.47107-(0.22063)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 65.85662 + (((tickAnim - 18) / 2) * (0-(65.85662)));
            yy = -2.14539 + (((tickAnim - 18) / 2) * (0-(-2.14539)));
            zz = 14.47107 + (((tickAnim - 18) / 2) * (0-(14.47107)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.2-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0.2 + (((tickAnim - 2) / 1) * (0.125-(0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0.125 + (((tickAnim - 3) / 3) * (0.15-(0.125)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0.15 + (((tickAnim - 6) / 2) * (0.14-(0.15)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0.14 + (((tickAnim - 8) / 2) * (0-(0.14)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0.625-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 18) / 2) * (0-(0.25)));
            zz = 0.625 + (((tickAnim - 18) / 2) * (0-(0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*4), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*4), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*4), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 10.69131 + (((tickAnim - 0) / 7) * (1.70337-(10.69131)));
            yy = -59.5827 + (((tickAnim - 0) / 7) * (-10.67196-(-59.5827)));
            zz = -0.17968 + (((tickAnim - 0) / 7) * (-19.34297-(-0.17968)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 1.70337 + (((tickAnim - 7) / 3) * (0-(1.70337)));
            yy = -10.67196 + (((tickAnim - 7) / 3) * (34.5-(-10.67196)));
            zz = -19.34297 + (((tickAnim - 7) / 3) * (0-(-19.34297)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (10.69131-(0)));
            yy = 34.5 + (((tickAnim - 10) / 10) * (-59.5827-(34.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (-0.17968-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0.525 + (((tickAnim - 0) / 10) * (0-(0.525)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0.525-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (20.8505-(0)));
            yy = 38.5 + (((tickAnim - 0) / 3) * (34.0645-(38.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (28.10001-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 20.8505 + (((tickAnim - 3) / 4) * (-0.89183-(20.8505)));
            yy = 34.0645 + (((tickAnim - 3) / 4) * (63.55453-(34.0645)));
            zz = 28.10001 + (((tickAnim - 3) / 4) * (3.98734-(28.10001)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -0.89183 + (((tickAnim - 7) / 3) * (13.58882-(-0.89183)));
            yy = 63.55453 + (((tickAnim - 7) / 3) * (29.74313-(63.55453)));
            zz = 3.98734 + (((tickAnim - 7) / 3) * (27.31255-(3.98734)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13.58882 + (((tickAnim - 10) / 10) * (0-(13.58882)));
            yy = 29.74313 + (((tickAnim - 10) / 10) * (38.5-(29.74313)));
            zz = 27.31255 + (((tickAnim - 10) / 10) * (0-(27.31255)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0.55-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0.55 + (((tickAnim - 7) / 3) * (0-(0.55)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3.96524 + (((tickAnim - 0) / 3) * (-152.56287-(3.96524)));
            yy = 44.45638 + (((tickAnim - 0) / 3) * (49.66193-(44.45638)));
            zz = -12.16273 + (((tickAnim - 0) / 3) * (-185.73458-(-12.16273)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -152.56287 + (((tickAnim - 3) / 4) * (-5.32027-(-152.56287)));
            yy = 49.66193 + (((tickAnim - 3) / 4) * (19.3197-(49.66193)));
            zz = -185.73458 + (((tickAnim - 3) / 4) * (-0.14348-(-185.73458)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -5.32027 + (((tickAnim - 7) / 1) * (-4.71177-(-5.32027)));
            yy = 19.3197 + (((tickAnim - 7) / 1) * (5.2448-(19.3197)));
            zz = -0.14348 + (((tickAnim - 7) / 1) * (-7.69156-(-0.14348)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.71177 + (((tickAnim - 8) / 2) * (0-(-4.71177)));
            yy = 5.2448 + (((tickAnim - 8) / 2) * (0-(5.2448)));
            zz = -7.69156 + (((tickAnim - 8) / 2) * (0-(-7.69156)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (1.87054-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-20.53207-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-5.04072-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 1.87054 + (((tickAnim - 15) / 3) * (8.66789-(1.87054)));
            yy = -20.53207 + (((tickAnim - 15) / 3) * (11.96215-(-20.53207)));
            zz = -5.04072 + (((tickAnim - 15) / 3) * (-8.60172-(-5.04072)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 8.66789 + (((tickAnim - 18) / 2) * (3.96524-(8.66789)));
            yy = 11.96215 + (((tickAnim - 18) / 2) * (44.45638-(11.96215)));
            zz = -8.60172 + (((tickAnim - 18) / 2) * (-12.16273-(-8.60172)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.525-(0)));
            yy = -0.375 + (((tickAnim - 0) / 3) * (-0.28-(-0.375)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0.525 + (((tickAnim - 3) / 7) * (0-(0.525)));
            yy = -0.28 + (((tickAnim - 3) / 7) * (0-(-0.28)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.185-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.185 + (((tickAnim - 15) / 5) * (-0.375-(0.185)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.69131-(0)));
            yy = -34.5 + (((tickAnim - 0) / 10) * (59.5827-(-34.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.17968-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 10.69131 + (((tickAnim - 10) / 7) * (1.70337-(10.69131)));
            yy = 59.5827 + (((tickAnim - 10) / 7) * (10.67196-(59.5827)));
            zz = 0.17968 + (((tickAnim - 10) / 7) * (19.34297-(0.17968)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 1.70337 + (((tickAnim - 17) / 3) * (0-(1.70337)));
            yy = 10.67196 + (((tickAnim - 17) / 3) * (-34.5-(10.67196)));
            zz = 19.34297 + (((tickAnim - 17) / 3) * (0-(19.34297)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.525 + (((tickAnim - 10) / 10) * (0-(0.525)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 13.58882 + (((tickAnim - 0) / 10) * (0-(13.58882)));
            yy = -29.74313 + (((tickAnim - 0) / 10) * (-38.5-(-29.74313)));
            zz = -27.31255 + (((tickAnim - 0) / 10) * (0-(-27.31255)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (20.8505-(0)));
            yy = -38.5 + (((tickAnim - 10) / 3) * (-34.0645-(-38.5)));
            zz = 0 + (((tickAnim - 10) / 3) * (-28.10001-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 20.8505 + (((tickAnim - 13) / 4) * (-0.89183-(20.8505)));
            yy = -34.0645 + (((tickAnim - 13) / 4) * (-63.55453-(-34.0645)));
            zz = -28.10001 + (((tickAnim - 13) / 4) * (-3.98734-(-28.10001)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -0.89183 + (((tickAnim - 17) / 3) * (13.58882-(-0.89183)));
            yy = -63.55453 + (((tickAnim - 17) / 3) * (-29.74313-(-63.55453)));
            zz = -3.98734 + (((tickAnim - 17) / 3) * (-27.31255-(-3.98734)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0.55-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0.55 + (((tickAnim - 17) / 3) * (0-(0.55)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1.87054-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (20.53207-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5.04072-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1.87054 + (((tickAnim - 5) / 3) * (8.66789-(1.87054)));
            yy = 20.53207 + (((tickAnim - 5) / 3) * (-11.96215-(20.53207)));
            zz = 5.04072 + (((tickAnim - 5) / 3) * (8.60172-(5.04072)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 8.66789 + (((tickAnim - 8) / 2) * (3.96524-(8.66789)));
            yy = -11.96215 + (((tickAnim - 8) / 2) * (-44.45638-(-11.96215)));
            zz = 8.60172 + (((tickAnim - 8) / 2) * (12.16273-(8.60172)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 3.96524 + (((tickAnim - 10) / 3) * (-165.31287-(3.96524)));
            yy = -44.45638 + (((tickAnim - 10) / 3) * (-49.66193-(-44.45638)));
            zz = 12.16273 + (((tickAnim - 10) / 3) * (185.73458-(12.16273)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -165.31287 + (((tickAnim - 13) / 4) * (-5.32027-(-165.31287)));
            yy = -49.66193 + (((tickAnim - 13) / 4) * (-19.3197-(-49.66193)));
            zz = 185.73458 + (((tickAnim - 13) / 4) * (0.14348-(185.73458)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -5.32027 + (((tickAnim - 17) / 1) * (-4.71177-(-5.32027)));
            yy = -19.3197 + (((tickAnim - 17) / 1) * (-5.2448-(-19.3197)));
            zz = 0.14348 + (((tickAnim - 17) / 1) * (7.69156-(0.14348)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -4.71177 + (((tickAnim - 18) / 2) * (0-(-4.71177)));
            yy = -5.2448 + (((tickAnim - 18) / 2) * (0-(-5.2448)));
            zz = 7.69156 + (((tickAnim - 18) / 2) * (0-(7.69156)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.185-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.185 + (((tickAnim - 5) / 5) * (-0.375-(0.185)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0.525-(0)));
            yy = -0.375 + (((tickAnim - 10) / 3) * (-0.28-(-0.375)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.525 + (((tickAnim - 13) / 7) * (0-(0.525)));
            yy = -0.28 + (((tickAnim - 13) / 7) * (0-(-0.28)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);

       

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMegachirella entity = (EntityPrehistoricFloraMegachirella) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*10), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*4));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*0.25);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*-10), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*15), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 42.41205 + (((tickAnim - 0) / 4) * (8.70238-(42.41205)));
            yy = 46.18998 + (((tickAnim - 0) / 4) * (-25.46095-(46.18998)));
            zz = 9.92276 + (((tickAnim - 0) / 4) * (19.03031-(9.92276)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 8.70238 + (((tickAnim - 4) / 1) * (0-(8.70238)));
            yy = -25.46095 + (((tickAnim - 4) / 1) * (-53-(-25.46095)));
            zz = 19.03031 + (((tickAnim - 4) / 1) * (0-(19.03031)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (42.41205-(0)));
            yy = -53 + (((tickAnim - 5) / 5) * (46.18998-(-53)));
            zz = 0 + (((tickAnim - 5) / 5) * (9.92276-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 23.48901 + (((tickAnim - 0) / 2) * (55.72031-(23.48901)));
            yy = 5.77894 + (((tickAnim - 0) / 2) * (8.57853-(5.77894)));
            zz = 52.10417 + (((tickAnim - 0) / 2) * (38.60953-(52.10417)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 55.72031 + (((tickAnim - 2) / 1) * (16.5281-(55.72031)));
            yy = 8.57853 + (((tickAnim - 2) / 1) * (25.03757-(8.57853)));
            zz = 38.60953 + (((tickAnim - 2) / 1) * (42.84435-(38.60953)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 16.5281 + (((tickAnim - 3) / 1) * (-30.56709-(16.5281)));
            yy = 25.03757 + (((tickAnim - 3) / 1) * (14.17773-(25.03757)));
            zz = 42.84435 + (((tickAnim - 3) / 1) * (11.62024-(42.84435)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -30.56709 + (((tickAnim - 4) / 1) * (0-(-30.56709)));
            yy = 14.17773 + (((tickAnim - 4) / 1) * (48.5-(14.17773)));
            zz = 11.62024 + (((tickAnim - 4) / 1) * (0-(11.62024)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (23.48901-(0)));
            yy = 48.5 + (((tickAnim - 5) / 5) * (5.77894-(48.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (52.10417-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.425 + (((tickAnim - 0) / 2) * (0.325-(0.425)));
            yy = 0.4 + (((tickAnim - 0) / 2) * (0.525-(0.4)));
            zz = 0.725 + (((tickAnim - 0) / 2) * (0.15-(0.725)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0.325 + (((tickAnim - 2) / 3) * (0-(0.325)));
            yy = 0.525 + (((tickAnim - 2) / 3) * (0-(0.525)));
            zz = 0.15 + (((tickAnim - 2) / 3) * (0-(0.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0.425-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0.4-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0.725-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -73.97787 + (((tickAnim - 0) / 2) * (51.80238-(-73.97787)));
            yy = -26.30334 + (((tickAnim - 0) / 2) * (20.47769-(-26.30334)));
            zz = 15.85571 + (((tickAnim - 0) / 2) * (0.22063-(15.85571)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 51.80238 + (((tickAnim - 2) / 2) * (65.85662-(51.80238)));
            yy = 20.47769 + (((tickAnim - 2) / 2) * (2.14539-(20.47769)));
            zz = 0.22063 + (((tickAnim - 2) / 2) * (-14.47107-(0.22063)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 65.85662 + (((tickAnim - 4) / 1) * (0-(65.85662)));
            yy = 2.14539 + (((tickAnim - 4) / 1) * (0-(2.14539)));
            zz = -14.47107 + (((tickAnim - 4) / 1) * (0-(-14.47107)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (-15.46791-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-26.20649-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-0.87733-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -15.46791 + (((tickAnim - 7) / 1) * (-41.00599-(-15.46791)));
            yy = -26.20649 + (((tickAnim - 7) / 1) * (-35.42758-(-26.20649)));
            zz = -0.87733 + (((tickAnim - 7) / 1) * (8.96895-(-0.87733)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -41.00599 + (((tickAnim - 8) / 2) * (-73.97787-(-41.00599)));
            yy = -35.42758 + (((tickAnim - 8) / 2) * (-26.30334-(-35.42758)));
            zz = 8.96895 + (((tickAnim - 8) / 2) * (15.85571-(8.96895)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (0.25-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0.625-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 4) / 1) * (0-(0.25)));
            zz = 0.625 + (((tickAnim - 4) / 1) * (0-(0.625)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0.2-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0.2 + (((tickAnim - 6) / 1) * (0.125-(0.2)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0.125 + (((tickAnim - 7) / 1) * (0.15-(0.125)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0.15 + (((tickAnim - 8) / 1) * (0.14-(0.15)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0.14 + (((tickAnim - 9) / 1) * (0-(0.14)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (42.41205-(0)));
            yy = 53 + (((tickAnim - 0) / 5) * (-46.18998-(53)));
            zz = 0 + (((tickAnim - 0) / 5) * (-9.92276-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 42.41205 + (((tickAnim - 5) / 4) * (8.70238-(42.41205)));
            yy = -46.18998 + (((tickAnim - 5) / 4) * (25.46095-(-46.18998)));
            zz = -9.92276 + (((tickAnim - 5) / 4) * (-19.03031-(-9.92276)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 8.70238 + (((tickAnim - 9) / 1) * (0-(8.70238)));
            yy = 25.46095 + (((tickAnim - 9) / 1) * (53-(25.46095)));
            zz = -19.03031 + (((tickAnim - 9) / 1) * (0-(-19.03031)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-4.0184-(0)));
            yy = -48.5 + (((tickAnim - 0) / 2) * (-22.54654-(-48.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (9.59663-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -4.0184 + (((tickAnim - 2) / 3) * (23.48901-(-4.0184)));
            yy = -22.54654 + (((tickAnim - 2) / 3) * (-5.77894-(-22.54654)));
            zz = 9.59663 + (((tickAnim - 2) / 3) * (-52.10417-(9.59663)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 23.48901 + (((tickAnim - 5) / 2) * (55.72031-(23.48901)));
            yy = -5.77894 + (((tickAnim - 5) / 2) * (-8.57853-(-5.77894)));
            zz = -52.10417 + (((tickAnim - 5) / 2) * (-38.60953-(-52.10417)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 55.72031 + (((tickAnim - 7) / 1) * (16.5281-(55.72031)));
            yy = -8.57853 + (((tickAnim - 7) / 1) * (-25.03757-(-8.57853)));
            zz = -38.60953 + (((tickAnim - 7) / 1) * (-42.84435-(-38.60953)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 16.5281 + (((tickAnim - 8) / 1) * (-30.56709-(16.5281)));
            yy = -25.03757 + (((tickAnim - 8) / 1) * (-14.17773-(-25.03757)));
            zz = -42.84435 + (((tickAnim - 8) / 1) * (-11.62024-(-42.84435)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -30.56709 + (((tickAnim - 9) / 1) * (0-(-30.56709)));
            yy = -14.17773 + (((tickAnim - 9) / 1) * (-48.5-(-14.17773)));
            zz = -11.62024 + (((tickAnim - 9) / 1) * (0-(-11.62024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.425-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.725-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -0.425 + (((tickAnim - 5) / 2) * (-0.325-(-0.425)));
            yy = 0.4 + (((tickAnim - 5) / 2) * (0.525-(0.4)));
            zz = 0.725 + (((tickAnim - 5) / 2) * (0.15-(0.725)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -0.325 + (((tickAnim - 7) / 3) * (0-(-0.325)));
            yy = 0.525 + (((tickAnim - 7) / 3) * (0-(0.525)));
            zz = 0.15 + (((tickAnim - 7) / 3) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-10.88048-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-1.76006-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-5.0343-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -10.88048 + (((tickAnim - 2) / 1) * (-35.54867-(-10.88048)));
            yy = -1.76006 + (((tickAnim - 2) / 1) * (21.71495-(-1.76006)));
            zz = -5.0343 + (((tickAnim - 2) / 1) * (-11.62864-(-5.0343)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -35.54867 + (((tickAnim - 3) / 2) * (-73.97787-(-35.54867)));
            yy = 21.71495 + (((tickAnim - 3) / 2) * (26.30334-(21.71495)));
            zz = -11.62864 + (((tickAnim - 3) / 2) * (-15.85571-(-11.62864)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -73.97787 + (((tickAnim - 5) / 2) * (51.80238-(-73.97787)));
            yy = 26.30334 + (((tickAnim - 5) / 2) * (-20.47769-(26.30334)));
            zz = -15.85571 + (((tickAnim - 5) / 2) * (0.22063-(-15.85571)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 51.80238 + (((tickAnim - 7) / 2) * (65.85662-(51.80238)));
            yy = -20.47769 + (((tickAnim - 7) / 2) * (-2.14539-(-20.47769)));
            zz = 0.22063 + (((tickAnim - 7) / 2) * (14.47107-(0.22063)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 65.85662 + (((tickAnim - 9) / 1) * (0-(65.85662)));
            yy = -2.14539 + (((tickAnim - 9) / 1) * (0-(-2.14539)));
            zz = 14.47107 + (((tickAnim - 9) / 1) * (0-(14.47107)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.2-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0.2 + (((tickAnim - 1) / 1) * (0.125-(0.2)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0.125 + (((tickAnim - 2) / 1) * (0.15-(0.125)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0.15 + (((tickAnim - 3) / 1) * (0.14-(0.15)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0.14 + (((tickAnim - 4) / 1) * (0-(0.14)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.25-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0.625-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 9) / 1) * (0-(0.25)));
            zz = 0.625 + (((tickAnim - 9) / 1) * (0-(0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*10), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*15), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*20), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10.69131 + (((tickAnim - 0) / 3) * (1.70337-(10.69131)));
            yy = -59.5827 + (((tickAnim - 0) / 3) * (-10.67196-(-59.5827)));
            zz = -0.17968 + (((tickAnim - 0) / 3) * (-19.34297-(-0.17968)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.70337 + (((tickAnim - 3) / 2) * (0-(1.70337)));
            yy = -10.67196 + (((tickAnim - 3) / 2) * (34.5-(-10.67196)));
            zz = -19.34297 + (((tickAnim - 3) / 2) * (0-(-19.34297)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (10.69131-(0)));
            yy = 34.5 + (((tickAnim - 5) / 5) * (-59.5827-(34.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.17968-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.525 + (((tickAnim - 0) / 5) * (0-(0.525)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0.525-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (20.8505-(0)));
            yy = 38.5 + (((tickAnim - 0) / 2) * (34.0645-(38.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (28.10001-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 20.8505 + (((tickAnim - 2) / 1) * (-0.89183-(20.8505)));
            yy = 34.0645 + (((tickAnim - 2) / 1) * (63.55453-(34.0645)));
            zz = 28.10001 + (((tickAnim - 2) / 1) * (3.98734-(28.10001)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.89183 + (((tickAnim - 3) / 2) * (13.58882-(-0.89183)));
            yy = 63.55453 + (((tickAnim - 3) / 2) * (29.74313-(63.55453)));
            zz = 3.98734 + (((tickAnim - 3) / 2) * (27.31255-(3.98734)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 13.58882 + (((tickAnim - 5) / 5) * (0-(13.58882)));
            yy = 29.74313 + (((tickAnim - 5) / 5) * (38.5-(29.74313)));
            zz = 27.31255 + (((tickAnim - 5) / 5) * (0-(27.31255)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.55-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.55 + (((tickAnim - 3) / 2) * (0-(0.55)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 3.96524 + (((tickAnim - 0) / 2) * (-152.56287-(3.96524)));
            yy = 44.45638 + (((tickAnim - 0) / 2) * (49.66193-(44.45638)));
            zz = -12.16273 + (((tickAnim - 0) / 2) * (-185.73458-(-12.16273)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -152.56287 + (((tickAnim - 2) / 1) * (-5.32027-(-152.56287)));
            yy = 49.66193 + (((tickAnim - 2) / 1) * (19.3197-(49.66193)));
            zz = -185.73458 + (((tickAnim - 2) / 1) * (-0.14348-(-185.73458)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -5.32027 + (((tickAnim - 3) / 1) * (-4.71177-(-5.32027)));
            yy = 19.3197 + (((tickAnim - 3) / 1) * (5.2448-(19.3197)));
            zz = -0.14348 + (((tickAnim - 3) / 1) * (-7.69156-(-0.14348)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -4.71177 + (((tickAnim - 4) / 1) * (0-(-4.71177)));
            yy = 5.2448 + (((tickAnim - 4) / 1) * (0-(5.2448)));
            zz = -7.69156 + (((tickAnim - 4) / 1) * (0-(-7.69156)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (1.87054-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-20.53207-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-5.04072-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 1.87054 + (((tickAnim - 8) / 1) * (8.66789-(1.87054)));
            yy = -20.53207 + (((tickAnim - 8) / 1) * (11.96215-(-20.53207)));
            zz = -5.04072 + (((tickAnim - 8) / 1) * (-8.60172-(-5.04072)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 8.66789 + (((tickAnim - 9) / 1) * (3.96524-(8.66789)));
            yy = 11.96215 + (((tickAnim - 9) / 1) * (44.45638-(11.96215)));
            zz = -8.60172 + (((tickAnim - 9) / 1) * (-12.16273-(-8.60172)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0.525-(0)));
            yy = -0.375 + (((tickAnim - 0) / 2) * (-0.28-(-0.375)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0.525 + (((tickAnim - 2) / 3) * (0-(0.525)));
            yy = -0.28 + (((tickAnim - 2) / 3) * (0-(-0.28)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.185-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.185 + (((tickAnim - 8) / 2) * (-0.375-(0.185)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10.69131-(0)));
            yy = -34.5 + (((tickAnim - 0) / 5) * (59.5827-(-34.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.17968-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10.69131 + (((tickAnim - 5) / 3) * (1.70337-(10.69131)));
            yy = 59.5827 + (((tickAnim - 5) / 3) * (10.67196-(59.5827)));
            zz = 0.17968 + (((tickAnim - 5) / 3) * (19.34297-(0.17968)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1.70337 + (((tickAnim - 8) / 2) * (0-(1.70337)));
            yy = 10.67196 + (((tickAnim - 8) / 2) * (-34.5-(10.67196)));
            zz = 19.34297 + (((tickAnim - 8) / 2) * (0-(19.34297)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.525 + (((tickAnim - 5) / 5) * (0-(0.525)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 13.58882 + (((tickAnim - 0) / 5) * (0-(13.58882)));
            yy = -29.74313 + (((tickAnim - 0) / 5) * (-38.5-(-29.74313)));
            zz = -27.31255 + (((tickAnim - 0) / 5) * (0-(-27.31255)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (20.8505-(0)));
            yy = -38.5 + (((tickAnim - 5) / 2) * (-34.0645-(-38.5)));
            zz = 0 + (((tickAnim - 5) / 2) * (-28.10001-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 20.8505 + (((tickAnim - 7) / 1) * (-0.89183-(20.8505)));
            yy = -34.0645 + (((tickAnim - 7) / 1) * (-63.55453-(-34.0645)));
            zz = -28.10001 + (((tickAnim - 7) / 1) * (-3.98734-(-28.10001)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.89183 + (((tickAnim - 8) / 2) * (13.58882-(-0.89183)));
            yy = -63.55453 + (((tickAnim - 8) / 2) * (-29.74313-(-63.55453)));
            zz = -3.98734 + (((tickAnim - 8) / 2) * (-27.31255-(-3.98734)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0.55-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.55 + (((tickAnim - 8) / 2) * (0-(0.55)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.87054-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (20.53207-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (5.04072-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 1.87054 + (((tickAnim - 3) / 1) * (8.66789-(1.87054)));
            yy = 20.53207 + (((tickAnim - 3) / 1) * (-11.96215-(20.53207)));
            zz = 5.04072 + (((tickAnim - 3) / 1) * (8.60172-(5.04072)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 8.66789 + (((tickAnim - 4) / 1) * (3.96524-(8.66789)));
            yy = -11.96215 + (((tickAnim - 4) / 1) * (-44.45638-(-11.96215)));
            zz = 8.60172 + (((tickAnim - 4) / 1) * (12.16273-(8.60172)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 3.96524 + (((tickAnim - 5) / 2) * (-165.31287-(3.96524)));
            yy = -44.45638 + (((tickAnim - 5) / 2) * (-49.66193-(-44.45638)));
            zz = 12.16273 + (((tickAnim - 5) / 2) * (185.73458-(12.16273)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -165.31287 + (((tickAnim - 7) / 1) * (-5.32027-(-165.31287)));
            yy = -49.66193 + (((tickAnim - 7) / 1) * (-19.3197-(-49.66193)));
            zz = 185.73458 + (((tickAnim - 7) / 1) * (0.14348-(185.73458)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -5.32027 + (((tickAnim - 8) / 1) * (-4.71177-(-5.32027)));
            yy = -19.3197 + (((tickAnim - 8) / 1) * (-5.2448-(-19.3197)));
            zz = 0.14348 + (((tickAnim - 8) / 1) * (7.69156-(0.14348)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -4.71177 + (((tickAnim - 9) / 1) * (0-(-4.71177)));
            yy = -5.2448 + (((tickAnim - 9) / 1) * (0-(-5.2448)));
            zz = 7.69156 + (((tickAnim - 9) / 1) * (0-(7.69156)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.185-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.185 + (((tickAnim - 3) / 2) * (-0.375-(0.185)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0.525-(0)));
            yy = -0.375 + (((tickAnim - 5) / 2) * (-0.28-(-0.375)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0.525 + (((tickAnim - 7) / 3) * (0-(0.525)));
            yy = -0.28 + (((tickAnim - 7) / 3) * (0-(-0.28)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMegachirella e = (EntityPrehistoricFloraMegachirella) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
