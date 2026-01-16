package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraIanthasaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelIanthasaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer sail1;
    private final AdvancedModelRenderer sail2;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;

    private ModelAnimator animator;

    public ModelIanthasaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(-0.5F, -4.2F, 2.9F);
        this.main.addChild(hip);
        this.hip.cubeList.add(new ModelBox(hip, 0, 13, -1.5F, -1.825F, -3.65F, 4, 4, 6, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.575F, 1.85F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.1745F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 27, -1.0F, 0.0F, 0.0F, 3, 3, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.35F, 5.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 23, 27, -0.5F, 0.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3F, 5.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 30, 0, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.4F, -3.0F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -0.5128F, -7.0038F, 5, 5, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 6, 0.475F, -7.5128F, -7.0038F, 0, 7, 7, 0.0F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(2.2F, 2.6872F, -5.7538F);
        this.body.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.0F, -0.48F, 0.48F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 24, 36, 0.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(2.275F, -0.35F, 0.0F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, 0.2134F, 0.2028F, 1.1296F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 41, 11, 0.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.5F, 0.5F, -0.5F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 35, 36, 1.0F, -2.0F, -2.0F, 1, 3, 3, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-1.2F, 2.6872F, -5.7538F);
        this.body.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.0F, 0.48F, -0.48F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 24, 36, -3.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(-2.275F, -0.35F, 0.0F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, 0.2134F, -0.2028F, -1.1296F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 41, 11, -2.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(-0.5F, 0.5F, -0.5F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 35, 36, -2.0F, -2.0F, -2.0F, 1, 3, 3, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.0531F, -6.9914F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 34, 24, -1.0F, -0.358F, -3.1199F, 3, 2, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.642F, -3.1199F);
        this.body2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6545F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 16, -0.5F, -2.325F, 0.0F, 2, 2, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -0.0232F, -2.9825F);
        this.body2.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 40, 31, -0.5F, -0.0169F, -1.988F, 3, 1, 2, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 13, 0.0F, -0.0169F, -2.988F, 2, 1, 1, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 4, 0, 0.5F, 0.3331F, -3.188F, 1, 1, 0, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 1.95F, 0.2331F, -2.988F, 0, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 0.05F, 0.2331F, -2.988F, 0, 1, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -0.8583F, -0.2242F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 35, -0.5F, 0.0346F, -0.0011F, 2, 1, 2, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.1F, 0.0148F, -1.1902F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 13, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 13, 1.7F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.4833F, -2.1992F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 0, -0.5F, -0.0019F, 0.009F, 3, 1, 2, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.9831F, -3.988F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4363F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 0, -0.5F, -0.575F, 0.25F, 2, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(2.0F, 0.9831F, -0.138F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 0, -2.0F, -0.3F, -3.2F, 2, 1, 4, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 5, -1.5F, -0.55F, -2.95F, 1, 1, 0, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 0, -0.1F, -0.55F, -1.95F, 0, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 0, -1.9F, -0.55F, -1.95F, 0, 1, 1, 0.0F, true));

        this.sail1 = new AdvancedModelRenderer(this);
        this.sail1.setRotationPoint(0.0F, -0.625F, -0.25F);
        this.body2.addChild(sail1);
        this.sail1.cubeList.add(new ModelBox(sail1, 15, 33, 0.5F, -6.5739F, -3.7627F, 0, 7, 4, 0.0F, false));

        this.sail2 = new AdvancedModelRenderer(this);
        this.sail2.setRotationPoint(0.0F, -2.075F, -2.95F);
        this.hip.addChild(sail2);
        this.sail2.cubeList.add(new ModelBox(sail2, 14, 17, 0.5F, -6.75F, -0.05F, 0, 8, 7, 0.0F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(2.25F, 0.55F, 0.5F);
        this.hip.addChild(backLeftLeg);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.35F, -1.125F, -1.25F);
        this.backLeftLeg.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5492F, -1.226F, -0.7454F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 41, -0.1F, -1.0F, 0.075F, 2, 3, 2, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.275F, 2.05F, 0.025F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.0005F, -0.1276F, -0.0206F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 0, 37, 0.6754F, -1.8281F, -1.5311F, 2, 3, 2, 0.0F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.7736F, 3.7037F, -1.4293F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 30, 8, -0.6232F, -2.9818F, -1.3518F, 3, 1, 3, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-1.25F, 0.55F, 0.5F);
        this.hip.addChild(backRightLeg);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.35F, -1.125F, -1.25F);
        this.backRightLeg.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5492F, 1.226F, 0.7454F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 41, -1.9F, -1.0F, 0.075F, 2, 3, 2, 0.0F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-0.275F, 2.05F, 0.025F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.0005F, 0.1276F, 0.0206F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 0, 37, -2.6754F, -1.8281F, -1.5311F, 2, 3, 2, 0.0F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(-0.7736F, 3.7037F, -1.4293F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 30, 8, -2.3768F, -2.9818F, -1.3518F, 3, 1, 3, 0.0F, true));

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
        this.main.offsetY = 0.2F;
        this.main.offsetX = 0.35F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.6F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.105F;
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

        EntityPrehistoricFloraIanthasaurus EntityMegalosaurus = (EntityPrehistoricFloraIanthasaurus) e;

        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.head};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIanthasaurus entity = (EntityPrehistoricFloraIanthasaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15.25 + (((tickAnim - 10) / 10) * (0-(15.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 24 + (((tickAnim - 5) / 5) * (18-(24)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 18 + (((tickAnim - 10) / 10) * (0-(18)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 31.5 + (((tickAnim - 5) / 5) * (0-(31.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
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
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12.75 + (((tickAnim - 10) / 10) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sail1, sail1.rotateAngleX + (float) Math.toRadians(xx), sail1.rotateAngleY + (float) Math.toRadians(yy), sail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.475-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.425 + (((tickAnim - 10) / 10) * (0-(-0.425)));
            zz = 0.475 + (((tickAnim - 10) / 10) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sail1.rotationPointX = this.sail1.rotationPointX + (float)(xx);
        this.sail1.rotationPointY = this.sail1.rotationPointY - (float)(yy);
        this.sail1.rotationPointZ = this.sail1.rotationPointZ + (float)(zz);

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIanthasaurus entity = (EntityPrehistoricFloraIanthasaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = -7.25 + (((tickAnim - 14) / 11) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = -10 + (((tickAnim - 14) / 11) * (0-(-10)));
            yy = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (36.75-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 36.75 + (((tickAnim - 14) / 11) * (0-(36.75)));
            yy = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 7.5 + (((tickAnim - 14) / 11) * (0-(7.5)));
            yy = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sail1, sail1.rotateAngleX + (float) Math.toRadians(xx), sail1.rotateAngleY + (float) Math.toRadians(yy), sail1.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIanthasaurus entity = (EntityPrehistoricFloraIanthasaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (41.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-44-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 41.25 + (((tickAnim - 13) / 7) * (26.85703-(41.25)));
            yy = -44 + (((tickAnim - 13) / 7) * (-7.69183-(-44)));
            zz = 0 + (((tickAnim - 13) / 7) * (-30.32029-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 26.85703 + (((tickAnim - 20) / 6) * (0-(26.85703)));
            yy = -7.69183 + (((tickAnim - 20) / 6) * (0-(-7.69183)));
            zz = -30.32029 + (((tickAnim - 20) / 6) * (0-(-30.32029)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (41.25-(0)));
            yy = 0 + (((tickAnim - 26) / 14) * (-44-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 41.25 + (((tickAnim - 40) / 5) * (26.85703-(41.25)));
            yy = -44 + (((tickAnim - 40) / 5) * (-7.69183-(-44)));
            zz = 0 + (((tickAnim - 40) / 5) * (-30.32029-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 26.85703 + (((tickAnim - 45) / 5) * (0-(26.85703)));
            yy = -7.69183 + (((tickAnim - 45) / 5) * (0-(-7.69183)));
            zz = -30.32029 + (((tickAnim - 45) / 5) * (0-(-30.32029)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 25.25 + (((tickAnim - 13) / 13) * (0-(25.25)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (25.25-(0)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 25.25 + (((tickAnim - 40) / 10) * (0-(25.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.475-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            yy = 0.6 + (((tickAnim - 13) / 13) * (0-(0.6)));
            zz = 0.475 + (((tickAnim - 13) / 13) * (0-(0.475)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 14) * (0.6-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0.475-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.6 + (((tickAnim - 40) / 10) * (0-(0.6)));
            zz = 0.475 + (((tickAnim - 40) / 10) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (43.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 43.5 + (((tickAnim - 13) / 7) * (70.05-(43.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 70.05 + (((tickAnim - 20) / 6) * (0-(70.05)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (43.5-(0)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 43.5 + (((tickAnim - 40) / 5) * (70.05-(43.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 70.05 + (((tickAnim - 45) / 5) * (0-(70.05)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (1.975-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.525 + (((tickAnim - 13) / 7) * (1.3-(0.525)));
            zz = 1.975 + (((tickAnim - 13) / 7) * (3.07-(1.975)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 1.3 + (((tickAnim - 20) / 6) * (0-(1.3)));
            zz = 3.07 + (((tickAnim - 20) / 6) * (0-(3.07)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 14) * (0.525-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (1.975-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 40) / 5) * (1.3-(0.525)));
            zz = 1.975 + (((tickAnim - 40) / 5) * (3.07-(1.975)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 1.3 + (((tickAnim - 45) / 5) * (0-(1.3)));
            zz = 3.07 + (((tickAnim - 45) / 5) * (0-(3.07)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraIanthasaurus entity = (EntityPrehistoricFloraIanthasaurus) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5+20))*2), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+100))*-10), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+100))*-5));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-150))*0.3);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-50))*0.4);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5))*-3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+50))*10), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+50))*5));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (12.91662-(0)));
            yy = 53 + (((tickAnim - 0) / 6) * (-32.05718-(53)));
            zz = 0 + (((tickAnim - 0) / 6) * (-14.91218-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 12.91662 + (((tickAnim - 6) / 3) * (8.86606-(12.91662)));
            yy = -32.05718 + (((tickAnim - 6) / 3) * (19.91309-(-32.05718)));
            zz = -14.91218 + (((tickAnim - 6) / 3) * (-28.85774-(-14.91218)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 8.86606 + (((tickAnim - 9) / 3) * (0-(8.86606)));
            yy = 19.91309 + (((tickAnim - 9) / 3) * (53-(19.91309)));
            zz = -28.85774 + (((tickAnim - 9) / 3) * (0-(-28.85774)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0.525 + (((tickAnim - 0) / 6) * (0-(0.525)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0.525-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(xx);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(yy);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -28.59058 + (((tickAnim - 0) / 6) * (-0.22788-(-28.59058)));
            yy = -3.61075 + (((tickAnim - 0) / 6) * (-12.18752-(-3.61075)));
            zz = 1.02505 + (((tickAnim - 0) / 6) * (-19.79202-(1.02505)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -0.22788 + (((tickAnim - 6) / 3) * (-40.16524-(-0.22788)));
            yy = -12.18752 + (((tickAnim - 6) / 3) * (39.28896-(-12.18752)));
            zz = -19.79202 + (((tickAnim - 6) / 3) * (-18.07465-(-19.79202)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -40.16524 + (((tickAnim - 9) / 3) * (-28.59058-(-40.16524)));
            yy = 39.28896 + (((tickAnim - 9) / 3) * (-3.61075-(39.28896)));
            zz = -18.07465 + (((tickAnim - 9) / 3) * (1.02505-(-18.07465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.24695 + (((tickAnim - 0) / 3) * (9.38878-(-0.24695)));
            yy = -17.99838 + (((tickAnim - 0) / 3) * (0.39823-(-17.99838)));
            zz = -8.71142 + (((tickAnim - 0) / 3) * (13.44065-(-8.71142)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 9.38878 + (((tickAnim - 3) / 3) * (0-(9.38878)));
            yy = 0.39823 + (((tickAnim - 3) / 3) * (-51.75-(0.39823)));
            zz = 13.44065 + (((tickAnim - 3) / 3) * (0-(13.44065)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (-161.75112-(0)));
            yy = -51.75 + (((tickAnim - 6) / 2) * (-71.73114-(-51.75)));
            zz = 0 + (((tickAnim - 6) / 2) * (168.45806-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -161.75112 + (((tickAnim - 8) / 1) * (-109.03588-(-161.75112)));
            yy = -71.73114 + (((tickAnim - 8) / 1) * (-60.25852-(-71.73114)));
            zz = 168.45806 + (((tickAnim - 8) / 1) * (101.53898-(168.45806)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -109.03588 + (((tickAnim - 9) / 2) * (-19.30587-(-109.03588)));
            yy = -60.25852 + (((tickAnim - 9) / 2) * (-38.24648-(-60.25852)));
            zz = 101.53898 + (((tickAnim - 9) / 2) * (2.87247-(101.53898)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -19.30587 + (((tickAnim - 11) / 1) * (-0.24695-(-19.30587)));
            yy = -38.24648 + (((tickAnim - 11) / 1) * (-17.99838-(-38.24648)));
            zz = 2.87247 + (((tickAnim - 11) / 1) * (-8.71142-(2.87247)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.25 + (((tickAnim - 3) / 3) * (-0.475-(0.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-0.55-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -0.475 + (((tickAnim - 6) / 2) * (0.95-(-0.475)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = -0.55 + (((tickAnim - 6) / 2) * (-0.95-(-0.55)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0.95 + (((tickAnim - 8) / 1) * (1.785-(0.95)));
            yy = 0 + (((tickAnim - 8) / 1) * (0.675-(0)));
            zz = -0.95 + (((tickAnim - 8) / 1) * (-0.975-(-0.95)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 1.785 + (((tickAnim - 9) / 3) * (0-(1.785)));
            yy = 0.675 + (((tickAnim - 9) / 3) * (0-(0.675)));
            zz = -0.975 + (((tickAnim - 9) / 3) * (0-(-0.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-50))*2), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+150))*10), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+50))*-5));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5+50))*1.5), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-150))*10), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+100))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5))*1.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-200))*15), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+100))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5))*1.5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-250))*20), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+100))*-3));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 43.06932 + (((tickAnim - 0) / 3) * (19.05687-(43.06932)));
            yy = -25.7105 + (((tickAnim - 0) / 3) * (10.35097-(-25.7105)));
            zz = -9.32388 + (((tickAnim - 0) / 3) * (-27.9827-(-9.32388)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 19.05687 + (((tickAnim - 3) / 3) * (0-(19.05687)));
            yy = 10.35097 + (((tickAnim - 3) / 3) * (29-(10.35097)));
            zz = -27.9827 + (((tickAnim - 3) / 3) * (0-(-27.9827)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (43.06932-(0)));
            yy = 29 + (((tickAnim - 6) / 6) * (-25.7105-(29)));
            zz = 0 + (((tickAnim - 6) / 6) * (-9.32388-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg.rotationPointX = this.backLeftLeg.rotationPointX + (float)(xx);
        this.backLeftLeg.rotationPointY = this.backLeftLeg.rotationPointY - (float)(yy);
        this.backLeftLeg.rotationPointZ = this.backLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 16.85749 + (((tickAnim - 0) / 3) * (-7.65075-(16.85749)));
            yy = 7.17471 + (((tickAnim - 0) / 3) * (-20.31722-(7.17471)));
            zz = 2.1909 + (((tickAnim - 0) / 3) * (-19.99454-(2.1909)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -7.65075 + (((tickAnim - 3) / 3) * (-17.25-(-7.65075)));
            yy = -20.31722 + (((tickAnim - 3) / 3) * (-41.75-(-20.31722)));
            zz = -19.99454 + (((tickAnim - 3) / 3) * (0-(-19.99454)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -17.25 + (((tickAnim - 6) / 6) * (16.85749-(-17.25)));
            yy = -41.75 + (((tickAnim - 6) / 6) * (7.17471-(-41.75)));
            zz = 0 + (((tickAnim - 6) / 6) * (2.1909-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 6) * (0-(0.5)));
            zz = 0.625 + (((tickAnim - 0) / 6) * (-1.85-(0.625)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (0.5-(0)));
            zz = -1.85 + (((tickAnim - 6) / 6) * (0.625-(-1.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 59 + (((tickAnim - 0) / 1) * (105.75-(59)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 105.75 + (((tickAnim - 1) / 2) * (105.75-(105.75)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 105.75 + (((tickAnim - 3) / 3) * (18.5-(105.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 18.5 + (((tickAnim - 6) / 2) * (-3.02457-(18.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (2.5268-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (10.19474-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -3.02457 + (((tickAnim - 8) / 4) * (59-(-3.02457)));
            yy = 2.5268 + (((tickAnim - 8) / 4) * (0-(2.5268)));
            zz = 10.19474 + (((tickAnim - 8) / 4) * (0-(10.19474)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 1.05 + (((tickAnim - 0) / 1) * (3.015-(1.05)));
            zz = 2.65 + (((tickAnim - 0) / 1) * (3.725-(2.65)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 3.015 + (((tickAnim - 1) / 2) * (2.725-(3.015)));
            zz = 3.725 + (((tickAnim - 1) / 2) * (3.55-(3.725)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 2.725 + (((tickAnim - 3) / 3) * (0.3-(2.725)));
            zz = 3.55 + (((tickAnim - 3) / 3) * (1.2-(3.55)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (-0.45-(0)));
            yy = 0.3 + (((tickAnim - 6) / 2) * (-0.05-(0.3)));
            zz = 1.2 + (((tickAnim - 6) / 2) * (0.15-(1.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.45 + (((tickAnim - 8) / 4) * (0-(-0.45)));
            yy = -0.05 + (((tickAnim - 8) / 4) * (1.05-(-0.05)));
            zz = 0.15 + (((tickAnim - 8) / 4) * (2.65-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.91662 + (((tickAnim - 0) / 3) * (8.86606-(12.91662)));
            yy = 32.05718 + (((tickAnim - 0) / 3) * (-19.91309-(32.05718)));
            zz = 14.91218 + (((tickAnim - 0) / 3) * (28.85774-(14.91218)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 8.86606 + (((tickAnim - 3) / 3) * (0-(8.86606)));
            yy = -19.91309 + (((tickAnim - 3) / 3) * (-53-(-19.91309)));
            zz = 28.85774 + (((tickAnim - 3) / 3) * (0-(28.85774)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (12.91662-(0)));
            yy = -53 + (((tickAnim - 6) / 6) * (32.05718-(-53)));
            zz = 0 + (((tickAnim - 6) / 6) * (14.91218-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.525-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0.525 + (((tickAnim - 6) / 6) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(xx);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(yy);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.22788 + (((tickAnim - 0) / 3) * (-40.16524-(-0.22788)));
            yy = 12.18752 + (((tickAnim - 0) / 3) * (-39.28896-(12.18752)));
            zz = 19.79202 + (((tickAnim - 0) / 3) * (18.07465-(19.79202)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -40.16524 + (((tickAnim - 3) / 3) * (-28.59058-(-40.16524)));
            yy = -39.28896 + (((tickAnim - 3) / 3) * (3.61075-(-39.28896)));
            zz = 18.07465 + (((tickAnim - 3) / 3) * (-1.02505-(18.07465)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -28.59058 + (((tickAnim - 6) / 6) * (-0.22788-(-28.59058)));
            yy = 3.61075 + (((tickAnim - 6) / 6) * (12.18752-(3.61075)));
            zz = -1.02505 + (((tickAnim - 6) / 6) * (19.79202-(-1.02505)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-161.75112-(0)));
            yy = 51.75 + (((tickAnim - 0) / 2) * (71.73114-(51.75)));
            zz = 0 + (((tickAnim - 0) / 2) * (-168.45806-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -161.75112 + (((tickAnim - 2) / 1) * (-109.03588-(-161.75112)));
            yy = 71.73114 + (((tickAnim - 2) / 1) * (60.25852-(71.73114)));
            zz = -168.45806 + (((tickAnim - 2) / 1) * (-101.53898-(-168.45806)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -109.03588 + (((tickAnim - 3) / 2) * (-19.30587-(-109.03588)));
            yy = 60.25852 + (((tickAnim - 3) / 2) * (38.24648-(60.25852)));
            zz = -101.53898 + (((tickAnim - 3) / 2) * (-2.87247-(-101.53898)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -19.30587 + (((tickAnim - 5) / 1) * (-0.24695-(-19.30587)));
            yy = 38.24648 + (((tickAnim - 5) / 1) * (17.99838-(38.24648)));
            zz = -2.87247 + (((tickAnim - 5) / 1) * (8.71142-(-2.87247)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -0.24695 + (((tickAnim - 6) / 2) * (-0.73849-(-0.24695)));
            yy = 17.99838 + (((tickAnim - 6) / 2) * (1.86109-(17.99838)));
            zz = 8.71142 + (((tickAnim - 6) / 2) * (-13.79465-(8.71142)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.73849 + (((tickAnim - 8) / 4) * (0-(-0.73849)));
            yy = 1.86109 + (((tickAnim - 8) / 4) * (51.75-(1.86109)));
            zz = -13.79465 + (((tickAnim - 8) / 4) * (0-(-13.79465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.475 + (((tickAnim - 0) / 2) * (-0.95-(-0.475)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = -0.55 + (((tickAnim - 0) / 2) * (-0.95-(-0.55)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.95 + (((tickAnim - 2) / 1) * (-1.785-(-0.95)));
            yy = 0 + (((tickAnim - 2) / 1) * (0.675-(0)));
            zz = -0.95 + (((tickAnim - 2) / 1) * (-0.975-(-0.95)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -1.785 + (((tickAnim - 3) / 3) * (0-(-1.785)));
            yy = 0.675 + (((tickAnim - 3) / 3) * (0-(0.675)));
            zz = -0.975 + (((tickAnim - 3) / 3) * (0-(-0.975)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (-0.475-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-0.55-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-100))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(sail1, sail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-50))*-2), sail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+150))*-1), sail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+55))*5));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.025 + (((tickAnim - 0) / 3) * (0.015-(-0.025)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.015 + (((tickAnim - 3) / 2) * (0-(0.015)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-0.075-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.075 + (((tickAnim - 8) / 4) * (-0.025-(-0.075)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sail1.rotationPointX = this.sail1.rotationPointX + (float)(xx);
        this.sail1.rotationPointY = this.sail1.rotationPointY - (float)(yy);
        this.sail1.rotationPointZ = this.sail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(sail2, sail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5))*-2), sail2.rotateAngleY + (float) Math.toRadians(0), sail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615+55))*4));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.025 + (((tickAnim - 0) / 3) * (0.11-(0.025)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -0.125 + (((tickAnim - 0) / 3) * (-0.21-(-0.125)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.11 + (((tickAnim - 3) / 2) * (0-(0.11)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -0.21 + (((tickAnim - 3) / 2) * (-0.3-(-0.21)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-0.14-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -0.3 + (((tickAnim - 5) / 3) * (-0.21-(-0.3)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.14 + (((tickAnim - 8) / 4) * (0.025-(-0.14)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = -0.21 + (((tickAnim - 8) / 4) * (-0.125-(-0.21)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sail2.rotationPointX = this.sail2.rotationPointX + (float)(xx);
        this.sail2.rotationPointY = this.sail2.rotationPointY - (float)(yy);
        this.sail2.rotationPointZ = this.sail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 8.25 + (((tickAnim - 0) / 5) * (43.06932-(8.25)));
            yy = -15.5 + (((tickAnim - 0) / 5) * (25.7105-(-15.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (9.32388-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 43.06932 + (((tickAnim - 5) / 3) * (19.05687-(43.06932)));
            yy = 25.7105 + (((tickAnim - 5) / 3) * (-10.35097-(25.7105)));
            zz = 9.32388 + (((tickAnim - 5) / 3) * (27.9827-(9.32388)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 19.05687 + (((tickAnim - 8) / 2) * (7.28232-(19.05687)));
            yy = -10.35097 + (((tickAnim - 8) / 2) * (-24.62285-(-10.35097)));
            zz = 27.9827 + (((tickAnim - 8) / 2) * (-15.12779-(27.9827)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 7.28232 + (((tickAnim - 10) / 2) * (8.25-(7.28232)));
            yy = -24.62285 + (((tickAnim - 10) / 2) * (-15.5-(-24.62285)));
            zz = -15.12779 + (((tickAnim - 10) / 2) * (0-(-15.12779)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
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
        this.backRightLeg.rotationPointX = this.backRightLeg.rotationPointX + (float)(xx);
        this.backRightLeg.rotationPointY = this.backRightLeg.rotationPointY - (float)(yy);
        this.backRightLeg.rotationPointZ = this.backRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -6.07554 + (((tickAnim - 0) / 5) * (16.85749-(-6.07554)));
            yy = 28.24888 + (((tickAnim - 0) / 5) * (7.17471-(28.24888)));
            zz = 5.05038 + (((tickAnim - 0) / 5) * (2.1909-(5.05038)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 16.85749 + (((tickAnim - 5) / 3) * (-7.65075-(16.85749)));
            yy = 7.17471 + (((tickAnim - 5) / 3) * (20.31722-(7.17471)));
            zz = 2.1909 + (((tickAnim - 5) / 3) * (19.99454-(2.1909)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -7.65075 + (((tickAnim - 8) / 2) * (-4.25985-(-7.65075)));
            yy = 20.31722 + (((tickAnim - 8) / 2) * (43.81625-(20.31722)));
            zz = 19.99454 + (((tickAnim - 8) / 2) * (16.88155-(19.99454)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -4.25985 + (((tickAnim - 10) / 2) * (-6.07554-(-4.25985)));
            yy = 43.81625 + (((tickAnim - 10) / 2) * (28.24888-(43.81625)));
            zz = 16.88155 + (((tickAnim - 10) / 2) * (5.05038-(16.88155)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.5-(0)));
            zz = -1.095 + (((tickAnim - 0) / 5) * (-0.625-(-1.095)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-0.3-(0)));
            yy = 0.5 + (((tickAnim - 5) / 3) * (0.23-(0.5)));
            zz = -0.625 + (((tickAnim - 5) / 3) * (-0.755-(-0.625)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.3 + (((tickAnim - 8) / 2) * (-0.675-(-0.3)));
            yy = 0.23 + (((tickAnim - 8) / 2) * (0-(0.23)));
            zz = -0.755 + (((tickAnim - 8) / 2) * (-1.475-(-0.755)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -0.675 + (((tickAnim - 10) / 2) * (0-(-0.675)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = -1.475 + (((tickAnim - 10) / 2) * (-1.095-(-1.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.76749 + (((tickAnim - 0) / 3) * (-13.77457-(0.76749)));
            yy = -0.96487 + (((tickAnim - 0) / 3) * (-2.5268-(-0.96487)));
            zz = -6.71299 + (((tickAnim - 0) / 3) * (-10.19474-(-6.71299)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -13.77457 + (((tickAnim - 3) / 2) * (59-(-13.77457)));
            yy = -2.5268 + (((tickAnim - 3) / 2) * (0-(-2.5268)));
            zz = -10.19474 + (((tickAnim - 3) / 2) * (0-(-10.19474)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 59 + (((tickAnim - 5) / 1) * (105.75-(59)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 105.75 + (((tickAnim - 6) / 2) * (105.75-(105.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 105.75 + (((tickAnim - 8) / 2) * (18.5-(105.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 18.5 + (((tickAnim - 10) / 2) * (0.76749-(18.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.96487-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (-6.71299-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.45-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.6-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.45 + (((tickAnim - 3) / 2) * (0-(0.45)));
            yy = 0.325 + (((tickAnim - 3) / 2) * (1.05-(0.325)));
            zz = -0.6 + (((tickAnim - 3) / 2) * (2.65-(-0.6)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 1.05 + (((tickAnim - 5) / 1) * (3.015-(1.05)));
            zz = 2.65 + (((tickAnim - 5) / 1) * (3.725-(2.65)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 3.015 + (((tickAnim - 6) / 2) * (2.725-(3.015)));
            zz = 3.725 + (((tickAnim - 6) / 2) * (3.55-(3.725)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 2.725 + (((tickAnim - 8) / 2) * (0.3-(2.725)));
            zz = 3.55 + (((tickAnim - 8) / 2) * (1.2-(3.55)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 10) / 2) * (0-(0.3)));
            zz = 1.2 + (((tickAnim - 10) / 2) * (0-(1.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);
       
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraIanthasaurus entity = (EntityPrehistoricFloraIanthasaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+20))*2), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*-5), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*-5));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*0.3);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*0.4);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*-3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*5));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (12.91662-(0)));
            yy = 53 + (((tickAnim - 0) / 13) * (-32.05718-(53)));
            zz = 0 + (((tickAnim - 0) / 13) * (-14.91218-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 12.91662 + (((tickAnim - 13) / 7) * (8.86606-(12.91662)));
            yy = -32.05718 + (((tickAnim - 13) / 7) * (19.91309-(-32.05718)));
            zz = -14.91218 + (((tickAnim - 13) / 7) * (-28.85774-(-14.91218)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 8.86606 + (((tickAnim - 20) / 5) * (0-(8.86606)));
            yy = 19.91309 + (((tickAnim - 20) / 5) * (53-(19.91309)));
            zz = -28.85774 + (((tickAnim - 20) / 5) * (0-(-28.85774)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0.525 + (((tickAnim - 0) / 13) * (0-(0.525)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0.525-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(xx);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(yy);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -28.59058 + (((tickAnim - 0) / 13) * (-0.22788-(-28.59058)));
            yy = -3.61075 + (((tickAnim - 0) / 13) * (-12.18752-(-3.61075)));
            zz = 1.02505 + (((tickAnim - 0) / 13) * (-19.79202-(1.02505)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -0.22788 + (((tickAnim - 13) / 7) * (-40.16524-(-0.22788)));
            yy = -12.18752 + (((tickAnim - 13) / 7) * (39.28896-(-12.18752)));
            zz = -19.79202 + (((tickAnim - 13) / 7) * (-18.07465-(-19.79202)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -40.16524 + (((tickAnim - 20) / 5) * (-28.59058-(-40.16524)));
            yy = 39.28896 + (((tickAnim - 20) / 5) * (-3.61075-(39.28896)));
            zz = -18.07465 + (((tickAnim - 20) / 5) * (1.02505-(-18.07465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.24695 + (((tickAnim - 0) / 5) * (9.38878-(-0.24695)));
            yy = -17.99838 + (((tickAnim - 0) / 5) * (0.39823-(-17.99838)));
            zz = -8.71142 + (((tickAnim - 0) / 5) * (13.44065-(-8.71142)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 9.38878 + (((tickAnim - 5) / 8) * (0-(9.38878)));
            yy = 0.39823 + (((tickAnim - 5) / 8) * (-51.75-(0.39823)));
            zz = 13.44065 + (((tickAnim - 5) / 8) * (0-(13.44065)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (-161.75112-(0)));
            yy = -51.75 + (((tickAnim - 13) / 3) * (-71.73114-(-51.75)));
            zz = 0 + (((tickAnim - 13) / 3) * (168.45806-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -161.75112 + (((tickAnim - 16) / 4) * (-109.03588-(-161.75112)));
            yy = -71.73114 + (((tickAnim - 16) / 4) * (-60.25852-(-71.73114)));
            zz = 168.45806 + (((tickAnim - 16) / 4) * (101.53898-(168.45806)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -109.03588 + (((tickAnim - 20) / 3) * (-19.30587-(-109.03588)));
            yy = -60.25852 + (((tickAnim - 20) / 3) * (-38.24648-(-60.25852)));
            zz = 101.53898 + (((tickAnim - 20) / 3) * (2.87247-(101.53898)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -19.30587 + (((tickAnim - 23) / 2) * (-0.24695-(-19.30587)));
            yy = -38.24648 + (((tickAnim - 23) / 2) * (-17.99838-(-38.24648)));
            zz = 2.87247 + (((tickAnim - 23) / 2) * (-8.71142-(2.87247)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0.25 + (((tickAnim - 5) / 8) * (-0.475-(0.25)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (-0.55-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -0.475 + (((tickAnim - 13) / 0) * (-0.12-(-0.475)));
            yy = 0 + (((tickAnim - 13) / 0) * (0.525-(0)));
            zz = -0.55 + (((tickAnim - 13) / 0) * (-0.65-(-0.55)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -0.12 + (((tickAnim - 13) / 3) * (0.95-(-0.12)));
            yy = 0.525 + (((tickAnim - 13) / 3) * (0-(0.525)));
            zz = -0.65 + (((tickAnim - 13) / 3) * (-0.95-(-0.65)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0.95 + (((tickAnim - 16) / 4) * (1.785-(0.95)));
            yy = 0 + (((tickAnim - 16) / 4) * (0.675-(0)));
            zz = -0.95 + (((tickAnim - 16) / 4) * (-0.975-(-0.95)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 1.785 + (((tickAnim - 20) / 5) * (0-(1.785)));
            yy = 0.675 + (((tickAnim - 20) / 5) * (0-(0.675)));
            zz = -0.975 + (((tickAnim - 20) / 5) * (0-(-0.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*2), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*4), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-5));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+50))*1.5), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*7), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*1.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*7), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*1.5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*7), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*-3));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 43.06932 + (((tickAnim - 0) / 7) * (19.05687-(43.06932)));
            yy = -25.7105 + (((tickAnim - 0) / 7) * (10.35097-(-25.7105)));
            zz = -9.32388 + (((tickAnim - 0) / 7) * (-27.9827-(-9.32388)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 19.05687 + (((tickAnim - 7) / 6) * (0-(19.05687)));
            yy = 10.35097 + (((tickAnim - 7) / 6) * (29-(10.35097)));
            zz = -27.9827 + (((tickAnim - 7) / 6) * (0-(-27.9827)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (43.06932-(0)));
            yy = 29 + (((tickAnim - 13) / 12) * (-25.7105-(29)));
            zz = 0 + (((tickAnim - 13) / 12) * (-9.32388-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg.rotationPointX = this.backLeftLeg.rotationPointX + (float)(xx);
        this.backLeftLeg.rotationPointY = this.backLeftLeg.rotationPointY - (float)(yy);
        this.backLeftLeg.rotationPointZ = this.backLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 16.85749 + (((tickAnim - 0) / 7) * (-7.65075-(16.85749)));
            yy = 7.17471 + (((tickAnim - 0) / 7) * (-20.31722-(7.17471)));
            zz = 2.1909 + (((tickAnim - 0) / 7) * (-19.99454-(2.1909)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -7.65075 + (((tickAnim - 7) / 6) * (-17.25-(-7.65075)));
            yy = -20.31722 + (((tickAnim - 7) / 6) * (-41.75-(-20.31722)));
            zz = -19.99454 + (((tickAnim - 7) / 6) * (0-(-19.99454)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -17.25 + (((tickAnim - 13) / 12) * (16.85749-(-17.25)));
            yy = -41.75 + (((tickAnim - 13) / 12) * (7.17471-(-41.75)));
            zz = 0 + (((tickAnim - 13) / 12) * (2.1909-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 13) * (0-(0.5)));
            zz = 0.625 + (((tickAnim - 0) / 13) * (-1.85-(0.625)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0.5-(0)));
            zz = -1.85 + (((tickAnim - 13) / 12) * (0.625-(-1.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 59 + (((tickAnim - 0) / 3) * (105.75-(59)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 105.75 + (((tickAnim - 3) / 4) * (105.75-(105.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 105.75 + (((tickAnim - 7) / 6) * (18.5-(105.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 18.5 + (((tickAnim - 13) / 5) * (-3.02457-(18.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (2.5268-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (10.19474-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -3.02457 + (((tickAnim - 18) / 7) * (59-(-3.02457)));
            yy = 2.5268 + (((tickAnim - 18) / 7) * (0-(2.5268)));
            zz = 10.19474 + (((tickAnim - 18) / 7) * (0-(10.19474)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.05 + (((tickAnim - 0) / 3) * (3.015-(1.05)));
            zz = 2.65 + (((tickAnim - 0) / 3) * (3.725-(2.65)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 3.015 + (((tickAnim - 3) / 4) * (2.725-(3.015)));
            zz = 3.725 + (((tickAnim - 3) / 4) * (3.55-(3.725)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 2.725 + (((tickAnim - 7) / 6) * (0.3-(2.725)));
            zz = 3.55 + (((tickAnim - 7) / 6) * (1.2-(3.55)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-0.45-(0)));
            yy = 0.3 + (((tickAnim - 13) / 5) * (-0.05-(0.3)));
            zz = 1.2 + (((tickAnim - 13) / 5) * (0.15-(1.2)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -0.45 + (((tickAnim - 18) / 7) * (0-(-0.45)));
            yy = -0.05 + (((tickAnim - 18) / 7) * (1.05-(-0.05)));
            zz = 0.15 + (((tickAnim - 18) / 7) * (2.65-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 12.91662 + (((tickAnim - 0) / 7) * (8.86606-(12.91662)));
            yy = 32.05718 + (((tickAnim - 0) / 7) * (-19.91309-(32.05718)));
            zz = 14.91218 + (((tickAnim - 0) / 7) * (28.85774-(14.91218)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 8.86606 + (((tickAnim - 7) / 6) * (0-(8.86606)));
            yy = -19.91309 + (((tickAnim - 7) / 6) * (-53-(-19.91309)));
            zz = 28.85774 + (((tickAnim - 7) / 6) * (0-(28.85774)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (12.91662-(0)));
            yy = -53 + (((tickAnim - 13) / 12) * (32.05718-(-53)));
            zz = 0 + (((tickAnim - 13) / 12) * (14.91218-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.525-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0.525 + (((tickAnim - 13) / 12) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(xx);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(yy);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.22788 + (((tickAnim - 0) / 8) * (-40.16524-(-0.22788)));
            yy = 12.18752 + (((tickAnim - 0) / 8) * (-39.28896-(12.18752)));
            zz = 19.79202 + (((tickAnim - 0) / 8) * (18.07465-(19.79202)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -40.16524 + (((tickAnim - 8) / 5) * (-28.59058-(-40.16524)));
            yy = -39.28896 + (((tickAnim - 8) / 5) * (3.61075-(-39.28896)));
            zz = 18.07465 + (((tickAnim - 8) / 5) * (-1.02505-(18.07465)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -28.59058 + (((tickAnim - 13) / 12) * (-0.22788-(-28.59058)));
            yy = 3.61075 + (((tickAnim - 13) / 12) * (12.18752-(3.61075)));
            zz = -1.02505 + (((tickAnim - 13) / 12) * (19.79202-(-1.02505)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-161.75112-(0)));
            yy = 51.75 + (((tickAnim - 0) / 3) * (71.73114-(51.75)));
            zz = 0 + (((tickAnim - 0) / 3) * (-168.45806-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -161.75112 + (((tickAnim - 3) / 5) * (-109.03588-(-161.75112)));
            yy = 71.73114 + (((tickAnim - 3) / 5) * (60.25852-(71.73114)));
            zz = -168.45806 + (((tickAnim - 3) / 5) * (-101.53898-(-168.45806)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -109.03588 + (((tickAnim - 8) / 3) * (-19.30587-(-109.03588)));
            yy = 60.25852 + (((tickAnim - 8) / 3) * (38.24648-(60.25852)));
            zz = -101.53898 + (((tickAnim - 8) / 3) * (-2.87247-(-101.53898)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -19.30587 + (((tickAnim - 11) / 2) * (-0.24695-(-19.30587)));
            yy = 38.24648 + (((tickAnim - 11) / 2) * (17.99838-(38.24648)));
            zz = -2.87247 + (((tickAnim - 11) / 2) * (8.71142-(-2.87247)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -0.24695 + (((tickAnim - 13) / 5) * (-0.73849-(-0.24695)));
            yy = 17.99838 + (((tickAnim - 13) / 5) * (1.86109-(17.99838)));
            zz = 8.71142 + (((tickAnim - 13) / 5) * (-13.79465-(8.71142)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -0.73849 + (((tickAnim - 18) / 7) * (0-(-0.73849)));
            yy = 1.86109 + (((tickAnim - 18) / 7) * (51.75-(1.86109)));
            zz = -13.79465 + (((tickAnim - 18) / 7) * (0-(-13.79465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.475 + (((tickAnim - 0) / 3) * (-0.95-(-0.475)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -0.55 + (((tickAnim - 0) / 3) * (-0.95-(-0.55)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.95 + (((tickAnim - 3) / 5) * (-1.785-(-0.95)));
            yy = 0 + (((tickAnim - 3) / 5) * (0.675-(0)));
            zz = -0.95 + (((tickAnim - 3) / 5) * (-0.975-(-0.95)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -1.785 + (((tickAnim - 8) / 5) * (0-(-1.785)));
            yy = 0.675 + (((tickAnim - 8) / 5) * (0-(0.675)));
            zz = -0.975 + (((tickAnim - 8) / 5) * (0-(-0.975)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (-0.475-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (-0.55-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(sail1, sail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*-2), sail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*-1), sail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+55))*5));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.025 + (((tickAnim - 0) / 5) * (0.015-(-0.025)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0.015 + (((tickAnim - 5) / 6) * (0-(0.015)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (-0.075-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -0.075 + (((tickAnim - 18) / 7) * (-0.025-(-0.075)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sail1.rotationPointX = this.sail1.rotationPointX + (float)(xx);
        this.sail1.rotationPointY = this.sail1.rotationPointY - (float)(yy);
        this.sail1.rotationPointZ = this.sail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(sail2, sail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*-2), sail2.rotateAngleY + (float) Math.toRadians(0), sail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+55))*4));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.025 + (((tickAnim - 0) / 5) * (0.11-(0.025)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = -0.125 + (((tickAnim - 0) / 5) * (-0.21-(-0.125)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.11 + (((tickAnim - 5) / 5) * (0-(0.11)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -0.21 + (((tickAnim - 5) / 5) * (-0.3-(-0.21)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (-0.14-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = -0.3 + (((tickAnim - 10) / 8) * (-0.21-(-0.3)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -0.14 + (((tickAnim - 18) / 7) * (0.025-(-0.14)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = -0.21 + (((tickAnim - 18) / 7) * (-0.125-(-0.21)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sail2.rotationPointX = this.sail2.rotationPointX + (float)(xx);
        this.sail2.rotationPointY = this.sail2.rotationPointY - (float)(yy);
        this.sail2.rotationPointZ = this.sail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 8.25 + (((tickAnim - 0) / 10) * (43.06932-(8.25)));
            yy = -15.5 + (((tickAnim - 0) / 10) * (25.7105-(-15.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (9.32388-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 43.06932 + (((tickAnim - 10) / 7) * (19.05687-(43.06932)));
            yy = 25.7105 + (((tickAnim - 10) / 7) * (-10.35097-(25.7105)));
            zz = 9.32388 + (((tickAnim - 10) / 7) * (27.9827-(9.32388)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 19.05687 + (((tickAnim - 17) / 6) * (7.28232-(19.05687)));
            yy = -10.35097 + (((tickAnim - 17) / 6) * (-24.62285-(-10.35097)));
            zz = 27.9827 + (((tickAnim - 17) / 6) * (-15.12779-(27.9827)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 7.28232 + (((tickAnim - 23) / 2) * (8.25-(7.28232)));
            yy = -24.62285 + (((tickAnim - 23) / 2) * (-15.5-(-24.62285)));
            zz = -15.12779 + (((tickAnim - 23) / 2) * (0-(-15.12779)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg.rotationPointX = this.backRightLeg.rotationPointX + (float)(xx);
        this.backRightLeg.rotationPointY = this.backRightLeg.rotationPointY - (float)(yy);
        this.backRightLeg.rotationPointZ = this.backRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -6.07554 + (((tickAnim - 0) / 10) * (16.85749-(-6.07554)));
            yy = 28.24888 + (((tickAnim - 0) / 10) * (7.17471-(28.24888)));
            zz = 5.05038 + (((tickAnim - 0) / 10) * (2.1909-(5.05038)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 16.85749 + (((tickAnim - 10) / 7) * (-7.65075-(16.85749)));
            yy = 7.17471 + (((tickAnim - 10) / 7) * (20.31722-(7.17471)));
            zz = 2.1909 + (((tickAnim - 10) / 7) * (19.99454-(2.1909)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -7.65075 + (((tickAnim - 17) / 6) * (-4.25985-(-7.65075)));
            yy = 20.31722 + (((tickAnim - 17) / 6) * (43.81625-(20.31722)));
            zz = 19.99454 + (((tickAnim - 17) / 6) * (16.88155-(19.99454)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -4.25985 + (((tickAnim - 23) / 2) * (-6.07554-(-4.25985)));
            yy = 43.81625 + (((tickAnim - 23) / 2) * (28.24888-(43.81625)));
            zz = 16.88155 + (((tickAnim - 23) / 2) * (5.05038-(16.88155)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.5-(0)));
            zz = -1.095 + (((tickAnim - 0) / 10) * (-0.625-(-1.095)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (-0.3-(0)));
            yy = 0.5 + (((tickAnim - 10) / 7) * (0.23-(0.5)));
            zz = -0.625 + (((tickAnim - 10) / 7) * (-0.755-(-0.625)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -0.3 + (((tickAnim - 17) / 6) * (-0.675-(-0.3)));
            yy = 0.23 + (((tickAnim - 17) / 6) * (0-(0.23)));
            zz = -0.755 + (((tickAnim - 17) / 6) * (-1.475-(-0.755)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -0.675 + (((tickAnim - 23) / 2) * (0-(-0.675)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = -1.475 + (((tickAnim - 23) / 2) * (-1.095-(-1.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.76749 + (((tickAnim - 0) / 5) * (-13.77457-(0.76749)));
            yy = -0.96487 + (((tickAnim - 0) / 5) * (-2.5268-(-0.96487)));
            zz = -6.71299 + (((tickAnim - 0) / 5) * (-10.19474-(-6.71299)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -13.77457 + (((tickAnim - 5) / 5) * (59-(-13.77457)));
            yy = -2.5268 + (((tickAnim - 5) / 5) * (0-(-2.5268)));
            zz = -10.19474 + (((tickAnim - 5) / 5) * (0-(-10.19474)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 59 + (((tickAnim - 10) / 3) * (105.75-(59)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 105.75 + (((tickAnim - 13) / 4) * (105.75-(105.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 105.75 + (((tickAnim - 17) / 6) * (18.5-(105.75)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 18.5 + (((tickAnim - 23) / 2) * (0.76749-(18.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (-0.96487-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (-6.71299-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.45-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.6-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.45 + (((tickAnim - 5) / 5) * (0-(0.45)));
            yy = 0.325 + (((tickAnim - 5) / 5) * (1.05-(0.325)));
            zz = -0.6 + (((tickAnim - 5) / 5) * (2.65-(-0.6)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.05 + (((tickAnim - 10) / 3) * (3.015-(1.05)));
            zz = 2.65 + (((tickAnim - 10) / 3) * (3.725-(2.65)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 3.015 + (((tickAnim - 13) / 4) * (2.725-(3.015)));
            zz = 3.725 + (((tickAnim - 13) / 4) * (3.55-(3.725)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 2.725 + (((tickAnim - 17) / 6) * (0.3-(2.725)));
            zz = 3.55 + (((tickAnim - 17) / 6) * (1.2-(3.55)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 23) / 2) * (0-(0.3)));
            zz = 1.2 + (((tickAnim - 23) / 2) * (0-(1.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraIanthasaurus ee = (EntityPrehistoricFloraIanthasaurus) entitylivingbaseIn;

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
            //moving in water
            //
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraIanthasaurus e = (EntityPrehistoricFloraIanthasaurus) entity;

    }
}
