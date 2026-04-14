package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLangobardisaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLangobardisaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backLeftLeg4;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer backRightLeg4;
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;

    private ModelAnimator animator;

    public ModelLangobardisaurus() {
        this.textureWidth = 44;
        this.textureHeight = 44;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 15.5833F, 3.8333F);


        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(1.5F, -0.0833F, 0.1667F);
        this.root.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, 0.0288F, 0.1298F, -0.228F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 18, 33, -1.0F, -0.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.25F, 2.9F, -0.3F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.762F, -0.2324F, 0.2F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 0, 0, -0.5F, 0.0F, -0.7F, 1, 5, 1, 0.001F, false));
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 0, 38, -0.5F, 0.0F, -0.3F, 1, 5, 1, 0.0F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.5672F, 0.0F, 0.0F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 0, 13, -0.5F, 0.0F, -0.5F, 1, 3, 1, -0.001F, false));

        this.backLeftLeg4 = new AdvancedModelRenderer(this);
        this.backLeftLeg4.setRotationPoint(0.0F, 2.75F, 0.25F);
        this.backLeftLeg3.addChild(backLeftLeg4);
        this.setRotateAngle(backLeftLeg4, -0.244F, 0.0149F, 0.041F);
        this.backLeftLeg4.cubeList.add(new ModelBox(backLeftLeg4, 25, 0, -1.5F, 0.0F, -3.0F, 3, 0, 3, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-1.5F, -0.0833F, 0.1667F);
        this.root.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, 0.0288F, -0.1298F, 0.228F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 18, 33, -1.0F, -0.5F, -1.0F, 2, 4, 2, 0.0F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-0.25F, 2.9F, -0.3F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.762F, 0.2324F, -0.2F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 0, 0, -0.5F, 0.0F, -0.7F, 1, 5, 1, 0.001F, true));
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 0, 38, -0.5F, 0.0F, -0.3F, 1, 5, 1, 0.0F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.5672F, 0.0F, 0.0F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 0, 13, -0.5F, 0.0F, -0.5F, 1, 3, 1, -0.001F, true));

        this.backRightLeg4 = new AdvancedModelRenderer(this);
        this.backRightLeg4.setRotationPoint(0.0F, 2.75F, 0.25F);
        this.backRightLeg3.addChild(backRightLeg4);
        this.setRotateAngle(backRightLeg4, -0.244F, -0.0149F, -0.041F);
        this.backRightLeg4.cubeList.add(new ModelBox(backRightLeg4, 25, 0, -1.5F, 0.0F, -3.0F, 3, 0, 3, 0.0F, true));

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 0.1667F, -0.3333F);
        this.root.addChild(hip);
        this.hip.cubeList.add(new ModelBox(hip, 21, 20, -1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.35F, 1.0F);
        this.hip.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 16, 27, -1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.75F, 2.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 27, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 25, 7, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.001F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 9, 15, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 13, -0.5F, -0.5F, 0.0F, 1, 1, 6, -0.001F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.2F, -0.75F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -0.4891F, -8.0002F, 4, 4, 8, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-0.5F, 0.0109F, -7.5002F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 18, 13, -1.0F, -0.3154F, -2.7471F, 3, 3, 3, 0.0F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(1.65F, 1.9346F, -1.2471F);
        this.body2.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, -0.9599F, 0.7854F, 0.0F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 17, 0, -0.4697F, -0.4184F, -0.1568F, 1, 1, 5, 0.0F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.0303F, -0.0184F, 4.5432F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.5673F, 0.6092F, 0.6147F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 32, 4, -0.5F, -0.5F, 0.0F, 1, 1, 4, -0.001F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 0.0F, 3.75F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.0852F, -0.2185F, 0.0078F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 9, 36, -0.5F, -1.5F, 0.0F, 4, 3, 0, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-0.65F, 1.9346F, -1.2471F);
        this.body2.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, -0.9599F, -0.7854F, 0.0F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 17, 0, -0.5303F, -0.4184F, -0.1568F, 1, 1, 5, 0.0F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(-0.0303F, -0.0184F, 4.5432F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.5673F, -0.6092F, -0.6147F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 32, 4, -0.5F, -0.5F, 0.0F, 1, 1, 4, -0.001F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 0.0F, 3.75F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.0852F, 0.2185F, -0.0078F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 9, 36, -3.5F, -1.5F, 0.0F, 4, 3, 0, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.0654F, -2.0721F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.3491F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 8, 24, -0.5F, -0.0197F, -2.9901F, 2, 2, 3, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2007F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 21, -0.5F, -0.0197F, -2.9901F, 2, 2, 3, 0.001F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1745F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 31, 13, -0.5F, 0.1303F, -2.9401F, 2, 2, 3, -0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.7447F, -1.8401F);
        this.neck3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1134F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 27, -0.5F, -0.0027F, -0.9957F, 2, 1, 1, 0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.5197F, -0.9901F);
        this.neck3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 40, -0.5F, 0.0F, -0.875F, 2, 1, 2, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.8697F, -2.7651F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.1309F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 27, 33, -0.5F, 0.0F, -2.0F, 2, 3, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.3054F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 34, 19, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.002F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 33, 0.0F, 1.0F, -4.6F, 1, 1, 3, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.0F, -2.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 27, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 7, 30, 0.0F, 0.0F, -5.5F, 1, 1, 4, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 20, 40, -0.5F, 0.0F, -2.0F, 2, 1, 2, 0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 24, -0.5F, -1.5F, -1.4F, 2, 2, 2, -0.01F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.5F, 0.8012F, -1.9176F);
        this.head.addChild(eye);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.625F, 0.0022F, -0.0083F);
        this.eye.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2778F, -0.3367F, -0.0939F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 13, -0.475F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.625F, 0.0022F, -0.0083F);
        this.eye.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2778F, 0.3367F, 0.0939F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 13, -0.525F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = 0.2F;
        this.root.offsetX = 0.35F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(1);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 0.6F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetY = -0.105F;
        this.root.render(0.01F);
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

        EntityPrehistoricFloraLangobardisaurus EntityMegalosaurus = (EntityPrehistoricFloraLangobardisaurus) e;

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
        EntityPrehistoricFloraLangobardisaurus entity = (EntityPrehistoricFloraLangobardisaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 21 + (((tickAnim - 10) / 10) * (0-(21)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11 + (((tickAnim - 10) / 10) * (0-(11)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 29 + (((tickAnim - 10) / 10) * (0-(29)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 20.75 + (((tickAnim - 5) / 5) * (0-(20.75)));
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
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (30.5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 30.5 + (((tickAnim - 8) / 2) * (0-(30.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLangobardisaurus entity = (EntityPrehistoricFloraLangobardisaurus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(-23.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*-10), root.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*10), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*10));
        this.root.rotationPointX = this.root.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-1);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*-1.5);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*0.5);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -25.75 + (((tickAnim - 0) / 5) * (49.05333-(-25.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (14.22637-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-18.40342-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 49.05333 + (((tickAnim - 5) / 3) * (-9.11141-(49.05333)));
            yy = 14.22637 + (((tickAnim - 5) / 3) * (6.39844-(14.22637)));
            zz = -18.40342 + (((tickAnim - 5) / 3) * (-60.36532-(-18.40342)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -9.11141 + (((tickAnim - 8) / 2) * (-25.75-(-9.11141)));
            yy = 6.39844 + (((tickAnim - 8) / 2) * (0-(6.39844)));
            zz = -60.36532 + (((tickAnim - 8) / 2) * (0-(-60.36532)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -8.25 + (((tickAnim - 0) / 3) * (23.12-(-8.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 23.12 + (((tickAnim - 3) / 2) * (16.25-(23.12)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 16.25 + (((tickAnim - 5) / 2) * (35.12-(16.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 35.12 + (((tickAnim - 7) / 3) * (-8.25-(35.12)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -2.5 + (((tickAnim - 0) / 1) * (-34.96-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -34.96 + (((tickAnim - 1) / 1) * (-57.22-(-34.96)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -57.22 + (((tickAnim - 2) / 3) * (0-(-57.22)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (-66.13-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -66.13 + (((tickAnim - 7) / 1) * (-66.13-(-66.13)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -66.13 + (((tickAnim - 8) / 2) * (-2.5-(-66.13)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.5-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0.5 + (((tickAnim - 2) / 3) * (0-(0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.275 + (((tickAnim - 7) / 1) * (-0.275-(-0.275)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 8) / 2) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 27 + (((tickAnim - 0) / 1) * (64.95285-(27)));
            yy = 0 + (((tickAnim - 0) / 1) * (-7.40199-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (5.96643-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 64.95285 + (((tickAnim - 1) / 1) * (57.00879-(64.95285)));
            yy = -7.40199 + (((tickAnim - 1) / 1) * (-5.70398-(-7.40199)));
            zz = 5.96643 + (((tickAnim - 1) / 1) * (7.81892-(5.96643)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 57.00879 + (((tickAnim - 2) / 1) * (31.86986-(57.00879)));
            yy = -5.70398 + (((tickAnim - 2) / 1) * (-2.99184-(-5.70398)));
            zz = 7.81892 + (((tickAnim - 2) / 1) * (7.15048-(7.81892)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 31.86986 + (((tickAnim - 3) / 2) * (144.5-(31.86986)));
            yy = -2.99184 + (((tickAnim - 3) / 2) * (0-(-2.99184)));
            zz = 7.15048 + (((tickAnim - 3) / 2) * (0-(7.15048)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 144.5 + (((tickAnim - 5) / 2) * (181.5-(144.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 181.5 + (((tickAnim - 7) / 1) * (100.17-(181.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 100.17 + (((tickAnim - 8) / 2) * (27-(100.17)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.575 + (((tickAnim - 2) / 1) * (0-(0.575)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0.63-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (-0.12-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.63 + (((tickAnim - 3) / 2) * (-0.175-(0.63)));
            zz = -0.12 + (((tickAnim - 3) / 2) * (-0.175-(-0.12)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.175 + (((tickAnim - 5) / 2) * (-0.175-(-0.175)));
            zz = -0.175 + (((tickAnim - 5) / 2) * (-0.175-(-0.175)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 7) / 3) * (0-(-0.175)));
            zz = -0.175 + (((tickAnim - 7) / 3) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 51.30333 + (((tickAnim - 0) / 3) * (-8.49332-(51.30333)));
            yy = -14.22637 + (((tickAnim - 0) / 3) * (-6.70988-(-14.22637)));
            zz = 18.40342 + (((tickAnim - 0) / 3) * (57.80895-(18.40342)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -8.49332 + (((tickAnim - 3) / 2) * (-25.75-(-8.49332)));
            yy = -6.70988 + (((tickAnim - 3) / 2) * (0-(-6.70988)));
            zz = 57.80895 + (((tickAnim - 3) / 2) * (0-(57.80895)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -25.75 + (((tickAnim - 5) / 5) * (51.30333-(-25.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (-14.22637-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (18.40342-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 16.25 + (((tickAnim - 0) / 2) * (35.12-(16.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 35.12 + (((tickAnim - 2) / 3) * (-8.25-(35.12)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -8.25 + (((tickAnim - 5) / 3) * (23.12-(-8.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 23.12 + (((tickAnim - 8) / 2) * (16.25-(23.12)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-66.13-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -66.13 + (((tickAnim - 2) / 1) * (-66.13-(-66.13)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -66.13 + (((tickAnim - 3) / 2) * (-2.5-(-66.13)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -2.5 + (((tickAnim - 5) / 1) * (-34.96-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -34.96 + (((tickAnim - 6) / 1) * (-49.22-(-34.96)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -49.22 + (((tickAnim - 7) / 3) * (0-(-49.22)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.275 + (((tickAnim - 2) / 1) * (-0.275-(-0.275)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 3) / 2) * (0-(-0.275)));
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
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 144.5 + (((tickAnim - 0) / 2) * (181.5-(144.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 181.5 + (((tickAnim - 2) / 1) * (100.17-(181.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 100.17 + (((tickAnim - 3) / 2) * (27-(100.17)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 27 + (((tickAnim - 5) / 1) * (64.95285-(27)));
            yy = 0 + (((tickAnim - 5) / 1) * (7.40199-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (-5.96643-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 64.95285 + (((tickAnim - 6) / 1) * (56.00879-(64.95285)));
            yy = 7.40199 + (((tickAnim - 6) / 1) * (5.70398-(7.40199)));
            zz = -5.96643 + (((tickAnim - 6) / 1) * (-7.81892-(-5.96643)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 56.00879 + (((tickAnim - 7) / 1) * (31.86986-(56.00879)));
            yy = 5.70398 + (((tickAnim - 7) / 1) * (2.99184-(5.70398)));
            zz = -7.81892 + (((tickAnim - 7) / 1) * (-7.15048-(-7.81892)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 31.86986 + (((tickAnim - 8) / 2) * (144.5-(31.86986)));
            yy = 2.99184 + (((tickAnim - 8) / 2) * (0-(2.99184)));
            zz = -7.15048 + (((tickAnim - 8) / 2) * (0-(-7.15048)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 2) * (-0.175-(-0.175)));
            zz = -0.175 + (((tickAnim - 0) / 2) * (-0.175-(-0.175)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 2) / 3) * (0-(-0.175)));
            zz = -0.175 + (((tickAnim - 2) / 3) * (0-(-0.175)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (1.15-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 1.15 + (((tickAnim - 6) / 1) * (1.35-(1.15)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.35 + (((tickAnim - 7) / 1) * (1.055-(1.35)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.12-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.055 + (((tickAnim - 8) / 2) * (-0.175-(1.055)));
            zz = -0.12 + (((tickAnim - 8) / 2) * (-0.175-(-0.12)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(8.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*-10), tail.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*10), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*10));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(7-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*-10), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*10), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*10));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(7.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-100))*-10), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*20), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*10));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(6.1356282328-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*-10), tail4.rotateAngleY + (float) Math.toRadians(1.7058476961-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*30), tail4.rotateAngleZ + (float) Math.toRadians(-1.2151061328+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*10));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-7.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-100))*-10), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-40), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-10));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-2.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*10), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*-12), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*-12));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-7-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*5), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-12), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*12));


        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(57.5), frontLeftLeg.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*5), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*15));


        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(0), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*10), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(0), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(-110.25), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(57.5), frontRightLeg.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*5), frontRightLeg.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*15));


        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(0), frontRightLeg2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*10), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(0), frontRightLeg3.rotateAngleY + (float) Math.toRadians(110.25), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-2.5), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-80))*-12), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-80))*-12));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-3.25), neck2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-140))*12), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(17.25), neck3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-12), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(12.5), neck4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*-12), neck4.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLangobardisaurus entity = (EntityPrehistoricFloraLangobardisaurus) entitylivingbaseIn;int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-70))*-1.5), root.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*3), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*-4));
        this.root.rotationPointX = this.root.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*0.3);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-70))*0.5);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 19.87631 + (((tickAnim - 0) / 5) * (-13.22946-(19.87631)));
            yy = -11.86245 + (((tickAnim - 0) / 5) * (-14.32267-(-11.86245)));
            zz = -4.68385 + (((tickAnim - 0) / 5) * (-17.97773-(-4.68385)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -13.22946 + (((tickAnim - 5) / 5) * (-46.29537-(-13.22946)));
            yy = -14.32267 + (((tickAnim - 5) / 5) * (-2.31163-(-14.32267)));
            zz = -17.97773 + (((tickAnim - 5) / 5) * (-17.90027-(-17.97773)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -46.29537 + (((tickAnim - 10) / 10) * (19.87631-(-46.29537)));
            yy = -2.31163 + (((tickAnim - 10) / 10) * (-11.86245-(-2.31163)));
            zz = -17.90027 + (((tickAnim - 10) / 10) * (-4.68385-(-17.90027)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.25 + (((tickAnim - 0) / 3) * (34.19-(8.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 34.19 + (((tickAnim - 3) / 7) * (0-(34.19)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (14.37-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 14.37 + (((tickAnim - 15) / 5) * (8.25-(14.37)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-52.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -52.75 + (((tickAnim - 3) / 3) * (-100.25-(-52.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -100.25 + (((tickAnim - 6) / 4) * (0-(-100.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -27.25 + (((tickAnim - 12) / 3) * (-46.3-(-27.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -46.3 + (((tickAnim - 15) / 5) * (0-(-46.3)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -0.65 + (((tickAnim - 6) / 4) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
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
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 97.25 + (((tickAnim - 0) / 3) * (173.66403-(97.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.66705-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.98456-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 173.66403 + (((tickAnim - 3) / 3) * (143.41403-(173.66403)));
            yy = 1.66705 + (((tickAnim - 3) / 3) * (-1.66705-(1.66705)));
            zz = -2.98456 + (((tickAnim - 3) / 3) * (2.98456-(-2.98456)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 143.41403 + (((tickAnim - 6) / 4) * (42.99208-(143.41403)));
            yy = -1.66705 + (((tickAnim - 6) / 4) * (-5.00115-(-1.66705)));
            zz = 2.98456 + (((tickAnim - 6) / 4) * (8.95367-(2.98456)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 42.99208 + (((tickAnim - 10) / 2) * (58.03507-(42.99208)));
            yy = -5.00115 + (((tickAnim - 10) / 2) * (-4.16763-(-5.00115)));
            zz = 8.95367 + (((tickAnim - 10) / 2) * (7.46139-(8.95367)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 58.03507 + (((tickAnim - 12) / 3) * (52.99011-(58.03507)));
            yy = -4.16763 + (((tickAnim - 12) / 3) * (-6.07391-(-4.16763)));
            zz = 7.46139 + (((tickAnim - 12) / 3) * (8.33066-(7.46139)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 52.99011 + (((tickAnim - 15) / 3) * (22.87005-(52.99011)));
            yy = -6.07391 + (((tickAnim - 15) / 3) * (-3.03695-(-6.07391)));
            zz = 8.33066 + (((tickAnim - 15) / 3) * (4.16533-(8.33066)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 22.87005 + (((tickAnim - 18) / 2) * (97.25-(22.87005)));
            yy = -3.03695 + (((tickAnim - 18) / 2) * (0-(-3.03695)));
            zz = 4.16533 + (((tickAnim - 18) / 2) * (0-(4.16533)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.45-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 3) / 3) * (0.225-(0.225)));
            zz = -0.45 + (((tickAnim - 3) / 3) * (-0.625-(-0.45)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.225 + (((tickAnim - 6) / 4) * (0-(0.225)));
            zz = -0.625 + (((tickAnim - 6) / 4) * (0-(-0.625)));
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
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -46.29537 + (((tickAnim - 0) / 10) * (19.87631-(-46.29537)));
            yy = 2.31163 + (((tickAnim - 0) / 10) * (11.86245-(2.31163)));
            zz = 17.90027 + (((tickAnim - 0) / 10) * (4.68385-(17.90027)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 19.87631 + (((tickAnim - 10) / 5) * (-13.22946-(19.87631)));
            yy = 11.86245 + (((tickAnim - 10) / 5) * (14.32267-(11.86245)));
            zz = 4.68385 + (((tickAnim - 10) / 5) * (17.97773-(4.68385)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -13.22946 + (((tickAnim - 15) / 5) * (-46.29537-(-13.22946)));
            yy = 14.32267 + (((tickAnim - 15) / 5) * (2.31163-(14.32267)));
            zz = 17.97773 + (((tickAnim - 15) / 5) * (17.90027-(17.97773)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (14.37-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 14.37 + (((tickAnim - 5) / 5) * (8.25-(14.37)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 8.25 + (((tickAnim - 10) / 3) * (34.19-(8.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 34.19 + (((tickAnim - 13) / 7) * (0-(34.19)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -27.25 + (((tickAnim - 2) / 3) * (-46.3-(-27.25)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -46.3 + (((tickAnim - 5) / 5) * (0-(-46.3)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-52.75-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -52.75 + (((tickAnim - 13) / 3) * (-100.25-(-52.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -100.25 + (((tickAnim - 16) / 4) * (0-(-100.25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = -0.65 + (((tickAnim - 16) / 4) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 42.99208 + (((tickAnim - 0) / 2) * (58.03507-(42.99208)));
            yy = 5.00115 + (((tickAnim - 0) / 2) * (4.16763-(5.00115)));
            zz = -8.95367 + (((tickAnim - 0) / 2) * (-7.46139-(-8.95367)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 58.03507 + (((tickAnim - 2) / 3) * (52.99011-(58.03507)));
            yy = 4.16763 + (((tickAnim - 2) / 3) * (6.07391-(4.16763)));
            zz = -7.46139 + (((tickAnim - 2) / 3) * (-8.33066-(-7.46139)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 52.99011 + (((tickAnim - 5) / 3) * (22.87005-(52.99011)));
            yy = 6.07391 + (((tickAnim - 5) / 3) * (3.03695-(6.07391)));
            zz = -8.33066 + (((tickAnim - 5) / 3) * (-4.16533-(-8.33066)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22.87005 + (((tickAnim - 8) / 2) * (97.25-(22.87005)));
            yy = 3.03695 + (((tickAnim - 8) / 2) * (0-(3.03695)));
            zz = -4.16533 + (((tickAnim - 8) / 2) * (0-(-4.16533)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 97.25 + (((tickAnim - 10) / 3) * (173.66403-(97.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (1.66705-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-2.98456-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 173.66403 + (((tickAnim - 13) / 3) * (143.41403-(173.66403)));
            yy = 1.66705 + (((tickAnim - 13) / 3) * (1.66705-(1.66705)));
            zz = -2.98456 + (((tickAnim - 13) / 3) * (-2.98456-(-2.98456)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 143.41403 + (((tickAnim - 16) / 4) * (42.99208-(143.41403)));
            yy = 1.66705 + (((tickAnim - 16) / 4) * (5.00115-(1.66705)));
            zz = -2.98456 + (((tickAnim - 16) / 4) * (-8.95367-(-2.98456)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.225-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.45-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 13) / 3) * (0.225-(0.225)));
            zz = -0.45 + (((tickAnim - 13) / 3) * (-0.625-(-0.45)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.225 + (((tickAnim - 16) / 4) * (0-(0.225)));
            zz = -0.625 + (((tickAnim - 16) / 4) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*-2), hip.rotateAngleY + (float) Math.toRadians(0), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*5));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*-2), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-2), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*-2), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*-2), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*-2), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*3), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-4), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-4));
        this.body.rotationPointX = this.body.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*0.15);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*-3), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*6), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*4));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*-0.15);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -53.94683 + (((tickAnim - 0) / 10) * (37.75-(-53.94683)));
            yy = -13.4826 + (((tickAnim - 0) / 10) * (0-(-13.4826)));
            zz = -44.30972 + (((tickAnim - 0) / 10) * (0-(-44.30972)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 37.75 + (((tickAnim - 10) / 5) * (-22.40691-(37.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (-0.53995-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-77.21128-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -22.40691 + (((tickAnim - 15) / 5) * (-53.94683-(-22.40691)));
            yy = -0.53995 + (((tickAnim - 15) / 5) * (-13.4826-(-0.53995)));
            zz = -77.21128 + (((tickAnim - 15) / 5) * (-44.30972-(-77.21128)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-1.91532-(0)));
            yy = -35 + (((tickAnim - 0) / 2) * (-20.2333-(-35)));
            zz = 0 + (((tickAnim - 0) / 2) * (-6.08274-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = -1.91532 + (((tickAnim - 2) / 8) * (-5-(-1.91532)));
            yy = -20.2333 + (((tickAnim - 2) / 8) * (0-(-20.2333)));
            zz = -6.08274 + (((tickAnim - 2) / 8) * (0-(-6.08274)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 10) / 5) * (-31.74253-(-5)));
            yy = 0 + (((tickAnim - 10) / 5) * (-16.76929-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-34.53636-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -31.74253 + (((tickAnim - 15) / 5) * (0-(-31.74253)));
            yy = -16.76929 + (((tickAnim - 15) / 5) * (-35-(-16.76929)));
            zz = -34.53636 + (((tickAnim - 15) / 5) * (0-(-34.53636)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -0.075 + (((tickAnim - 0) / 20) * (-0.075-(-0.075)));
            zz = 0.225 + (((tickAnim - 0) / 20) * (0.225-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-14.89309-(0)));
            yy = -13.75 + (((tickAnim - 0) / 2) * (-14.54222-(-13.75)));
            zz = 0 + (((tickAnim - 0) / 2) * (12.26805-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -14.89309 + (((tickAnim - 2) / 3) * (-15.91901-(-14.89309)));
            yy = -14.54222 + (((tickAnim - 2) / 3) * (-4.63559-(-14.54222)));
            zz = 12.26805 + (((tickAnim - 2) / 3) * (4.66501-(12.26805)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -15.91901 + (((tickAnim - 5) / 5) * (0-(-15.91901)));
            yy = -4.63559 + (((tickAnim - 5) / 5) * (-98.25-(-4.63559)));
            zz = 4.66501 + (((tickAnim - 5) / 5) * (0-(4.66501)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -98.25 + (((tickAnim - 10) / 5) * (-145-(-98.25)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -145 + (((tickAnim - 15) / 3) * (0-(-145)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (-13.75-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.15-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = -0.15 + (((tickAnim - 2) / 3) * (-0.35-(-0.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -0.35 + (((tickAnim - 5) / 5) * (0-(-0.35)));
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
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 37.75 + (((tickAnim - 0) / 5) * (-22.40691-(37.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.53995-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (77.21128-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -22.40691 + (((tickAnim - 5) / 5) * (-53.94683-(-22.40691)));
            yy = 0.53995 + (((tickAnim - 5) / 5) * (13.4826-(0.53995)));
            zz = 77.21128 + (((tickAnim - 5) / 5) * (44.30972-(77.21128)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -53.94683 + (((tickAnim - 10) / 10) * (37.75-(-53.94683)));
            yy = 13.4826 + (((tickAnim - 10) / 10) * (0-(13.4826)));
            zz = 44.30972 + (((tickAnim - 10) / 10) * (0-(44.30972)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -5 + (((tickAnim - 0) / 5) * (-31.74253-(-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (16.76929-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (34.53636-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -31.74253 + (((tickAnim - 5) / 5) * (0-(-31.74253)));
            yy = 16.76929 + (((tickAnim - 5) / 5) * (35-(16.76929)));
            zz = 34.53636 + (((tickAnim - 5) / 5) * (0-(34.53636)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-5-(0)));
            yy = 35 + (((tickAnim - 10) / 10) * (0-(35)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.225-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.075 + (((tickAnim - 10) / 10) * (0-(-0.075)));
            zz = 0.225 + (((tickAnim - 10) / 10) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 98.25 + (((tickAnim - 0) / 5) * (145-(98.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 145 + (((tickAnim - 5) / 3) * (0-(145)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (13.75-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (-8.89695-(0)));
            yy = 13.75 + (((tickAnim - 10) / 2) * (6.56297-(13.75)));
            zz = 0 + (((tickAnim - 10) / 2) * (-11.64147-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -8.89695 + (((tickAnim - 12) / 3) * (-15.91901-(-8.89695)));
            yy = 6.56297 + (((tickAnim - 12) / 3) * (-4.63559-(6.56297)));
            zz = -11.64147 + (((tickAnim - 12) / 3) * (4.66501-(-11.64147)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -15.91901 + (((tickAnim - 15) / 5) * (0-(-15.91901)));
            yy = -4.63559 + (((tickAnim - 15) / 5) * (98.25-(-4.63559)));
            zz = 4.66501 + (((tickAnim - 15) / 5) * (0-(4.66501)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (-0.15-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = -0.15 + (((tickAnim - 12) / 3) * (-0.35-(-0.15)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -0.35 + (((tickAnim - 15) / 5) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*3), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*6), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*-6), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-350))*6), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));



    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraLangobardisaurus ee = (EntityPrehistoricFloraLangobardisaurus) entitylivingbaseIn;

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
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLangobardisaurus e = (EntityPrehistoricFloraLangobardisaurus) entity;

    }
}
