package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraRiojasuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelRiojasuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;

    private ModelAnimator animator;

    public ModelRiojasuchus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 15.5546F, 5.297F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.4296F, -2.472F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 33, -2.0F, -1.575F, 0.0F, 3, 1, 5, -0.06F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, -2.5F, -1.0F, 0.0F, 4, 5, 5, 0.0F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(2.15F, 0.8204F, 0.028F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.48F, 0.0F, 0.0F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 40, 9, -1.5F, -1.0F, -1.5F, 3, 5, 3, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(1.0F, 4.0F, -1.35F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.8159F, 0.0F, 0.0F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 13, 48, -2.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 4.6116F, 0.7755F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.3229F, 0.0F, 0.0F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 34, 40, -2.5F, -0.4159F, -3.0026F, 3, 1, 4, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-2.15F, 0.8204F, 0.028F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.48F, 0.0F, 0.0F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 40, 9, -1.5F, -1.0F, -1.5F, 3, 5, 3, 0.0F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-1.0F, 4.0F, -1.35F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.8159F, 0.0F, 0.0F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 13, 48, 0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 4.6116F, 0.7755F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.3229F, 0.0F, 0.0F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 34, 40, -0.5F, -0.4159F, -3.0026F, 3, 1, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.7814F, 2.3773F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.3927F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 19, 23, -1.5F, 0.0F, 0.0F, 3, 3, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 17, 33, -1.0F, -0.7F, 0.0F, 2, 1, 6, -0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1813F, 5.5034F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 25, 0, -1.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.7F, 0.25F);
        this.tail2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0916F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 23, 0.0F, 0.0F, -0.25F, 1, 1, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 5.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.3491F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 35, -0.5F, 0.0F, 0.0F, 1, 1, 6, 0.003F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 41, 46, 0.0F, -0.25F, 0.0F, 0, 1, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.0421F, -2.297F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -1.5125F, -6.5F, 5, 6, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 19, 14, -1.5F, -1.9875F, -6.5F, 3, 1, 7, 0.001F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.2625F, -6.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.1745F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 25, -2.0F, 0.0F, -4.0F, 4, 5, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 28, 46, -1.0F, -0.675F, -3.975F, 2, 1, 4, 0.0F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(1.725F, 3.7769F, -3.3479F);
        this.body2.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.7298F, 0.1468F, -0.162F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 51, 31, -1.0F, 0.0F, -0.5F, 2, 4, 2, 0.01F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -1.3933F, 0.0017F, 0.22F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 0, 50, -1.0F, -1.0F, -0.725F, 2, 4, 2, 0.0F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 2.617F, 0.0036F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.48F, 0.0F, 0.0F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 25, 9, -1.5F, 0.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-1.725F, 3.7769F, -3.3479F);
        this.body2.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.7298F, -0.1468F, 0.162F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 51, 31, -1.0F, 0.0F, -0.5F, 2, 4, 2, 0.01F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -1.3933F, -0.0017F, -0.22F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 0, 50, -1.0F, -1.0F, -0.725F, 2, 4, 2, 0.0F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 2.617F, 0.0036F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.48F, 0.0F, 0.0F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 25, 9, -1.5F, 0.0F, -2.0F, 3, 1, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.025F, -3.5F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.1091F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 15, 41, -1.25F, 0.0F, -4.0F, 2, 2, 4, -0.011F, false));
        this.neck.cubeList.add(new ModelBox(neck, 42, 0, -0.75F, 0.0F, -4.0F, 2, 2, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1091F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 49, 40, -0.5F, -0.1F, -4.175F, 1, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.75F, 3.0F, -5.0F);
        this.neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 43, 0.75F, -2.125F, 1.0F, 2, 2, 4, -0.011F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0434F, -3.7538F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 53, 15, -0.5F, 0.975F, -4.25F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 40, 18, -1.0F, 0.975F, -3.25F, 2, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 9, 50, 0.825F, 1.2F, -3.225F, 0, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 9, 50, -0.825F, 1.2F, -3.225F, 0, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.375F, 2.2491F, -5.6363F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.9687F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 53, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 53, 0.75F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.0833F, -5.8251F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.7505F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 53, 7, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.002F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.1001F, -5.6428F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.3875F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 41, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -0.3984F, -1.9341F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.384F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 48, -1.6F, 0.25F, -1.25F, 1, 1, 1, -0.001F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 48, -0.4F, 0.25F, -1.25F, 1, 1, 1, -0.001F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 52, 46, -1.5F, 0.0F, -2.0F, 2, 1, 2, -0.001F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 53, 11, -1.0F, 0.0F, -4.0F, 1, 1, 2, 0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.025F, -0.25F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 52, -0.5F, 0.0F, -1.725F, 2, 2, 2, 0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 2.0F, -0.5F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 53, 23, 0.0F, -0.025F, -4.0F, 1, 1, 2, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 51, 18, -0.5F, -0.025F, -2.75F, 2, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 31, 52, -0.5F, -1.525F, -1.45F, 2, 2, 2, -0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.25F, 0.225F, -3.75F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.2182F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 52, 50, 0.0F, -0.5F, -0.25F, 0, 1, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.75F, 0.225F, -3.75F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.2182F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 52, 50, 0.0F, -0.5F, -0.25F, 0, 1, 3, 0.0F, false));

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

        EntityPrehistoricFloraRiojasuchus EntityMegalosaurus = (EntityPrehistoricFloraRiojasuchus) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};

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

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRiojasuchus entity = (EntityPrehistoricFloraRiojasuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (18.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-80-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-10.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 18.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-80 + (((tickAnim - 5) / 5) * (-11.99098-(18.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-80)));
            yy = 2.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 5) / 5) * (-44.687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(2.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            zz = -10.25 + (((tickAnim - 5) / 5) * (10.12006-(-10.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -11.99098 + (((tickAnim - 10) / 5) * (0-(-11.99098)));
            yy = -44.687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 10) / 5) * (0-(-44.687+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            zz = 10.12006 + (((tickAnim - 10) / 5) * (0-(10.12006)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.55-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0.55 + (((tickAnim - 10) / 5) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (15.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+20))*-80-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (17.75-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 15.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+20))*-80 + (((tickAnim - 5) / 5) * (-102.462+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*150-(15.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+20))*-80)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80 + (((tickAnim - 5) / 5) * (79.3764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80)));
            zz = 17.75 + (((tickAnim - 5) / 5) * (15.45451-(17.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -102.462+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*150 + (((tickAnim - 10) / 5) * (0-(-102.462+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*150)));
            yy = 79.3764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 10) / 5) * (0-(79.3764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
            zz = 15.45451 + (((tickAnim - 10) / 5) * (0-(15.45451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.625-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.55-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0.625 + (((tickAnim - 5) / 10) * (0-(0.625)));
            yy = -0.625 + (((tickAnim - 5) / 10) * (0-(-0.625)));
            zz = 1.55 + (((tickAnim - 5) / 10) * (0-(1.55)));
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
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-54.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*220))*100-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -54.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*220))*100 + (((tickAnim - 8) / 7) * (0-(-54.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*220))*100)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRiojasuchus entity = (EntityPrehistoricFloraRiojasuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.25 + (((tickAnim - 10) / 10) * (0-(17.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (23.63-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 23.63 + (((tickAnim - 5) / 5) * (-12.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*55-(23.63)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*55 + (((tickAnim - 10) / 10) * (0-(-12.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*55)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 29.25 + (((tickAnim - 5) / 5) * (0-(29.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRiojasuchus entity = (EntityPrehistoricFloraRiojasuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (45.75-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 45.75 + (((tickAnim - 21) / 12) * (-26.75-(45.75)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -26.75 + (((tickAnim - 33) / 5) * (-18.75-(-26.75)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -18.75 + (((tickAnim - 38) / 12) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 13 + (((tickAnim - 21) / 12) * (6.58-(13)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 6.58 + (((tickAnim - 33) / 5) * (0-(6.58)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.96-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 21) {
            xx = 1.96 + (((tickAnim - 8) / 13) * (71.5-(1.96)));
            yy = 0 + (((tickAnim - 8) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 13) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 71.5 + (((tickAnim - 21) / 6) * (107.21-(71.5)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 107.21 + (((tickAnim - 27) / 6) * (71.92-(107.21)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 71.92 + (((tickAnim - 33) / 5) * (17.75-(71.92)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 17.75 + (((tickAnim - 38) / 12) * (0-(17.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 6) * (1.88-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 1.88 + (((tickAnim - 27) / 6) * (1.255-(1.88)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 1.255 + (((tickAnim - 33) / 5) * (-0.625-(1.255)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -0.625 + (((tickAnim - 38) / 12) * (0-(-0.625)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
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
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRiojasuchus entity = (EntityPrehistoricFloraRiojasuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -9.25 + (((tickAnim - 18) / 15) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -9.25 + (((tickAnim - 33) / 17) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-2.7-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -2.7 + (((tickAnim - 18) / 15) * (-2.7-(-2.7)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -2.7 + (((tickAnim - 33) / 17) * (0-(-2.7)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-6.75-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -23.5 + (((tickAnim - 18) / 15) * (-23.5-(-23.5)));
            yy = -6.75 + (((tickAnim - 18) / 15) * (-6.75-(-6.75)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.5 + (((tickAnim - 33) / 17) * (0-(-23.5)));
            yy = -6.75 + (((tickAnim - 33) / 17) * (0-(-6.75)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (42-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 42 + (((tickAnim - 18) / 15) * (42-(42)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 42 + (((tickAnim - 33) / 17) * (0-(42)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -8.75 + (((tickAnim - 18) / 15) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -8.75 + (((tickAnim - 33) / 17) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (6.75-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -23.5 + (((tickAnim - 18) / 15) * (-23.5-(-23.5)));
            yy = 6.75 + (((tickAnim - 18) / 15) * (6.75-(6.75)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.5 + (((tickAnim - 33) / 17) * (0-(-23.5)));
            yy = 6.75 + (((tickAnim - 33) / 17) * (0-(6.75)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (42-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 42 + (((tickAnim - 18) / 15) * (42-(42)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 42 + (((tickAnim - 33) / 17) * (0-(42)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -8.75 + (((tickAnim - 18) / 15) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -8.75 + (((tickAnim - 33) / 17) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (3-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 18) / 15) * (3-(3)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 3 + (((tickAnim - 33) / 17) * (0-(3)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -7.5 + (((tickAnim - 8) / 10) * (4.5-(-7.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 4.5 + (((tickAnim - 18) / 15) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 4.5 + (((tickAnim - 33) / 5) * (-2.75-(4.5)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 38) / 12) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (-18.37465-(0)));
            yy = 0 + (((tickAnim - 38) / 5) * (1.74056-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (1.02689-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -18.37465 + (((tickAnim - 43) / 7) * (0-(-18.37465)));
            yy = 1.74056 + (((tickAnim - 43) / 7) * (0-(1.74056)));
            zz = 1.02689 + (((tickAnim - 43) / 7) * (0-(1.02689)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 17.5 + (((tickAnim - 18) / 15) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 33) / 17) * (0-(17.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -20.75 + (((tickAnim - 18) / 15) * (-20.75-(-20.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -20.75 + (((tickAnim - 33) / 17) * (0-(-20.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 13 + (((tickAnim - 18) / 15) * (13-(13)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 13 + (((tickAnim - 33) / 17) * (0-(13)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 17.5 + (((tickAnim - 18) / 15) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 33) / 17) * (0-(17.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -20.75 + (((tickAnim - 18) / 15) * (-20.75-(-20.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -20.75 + (((tickAnim - 33) / 17) * (0-(-20.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 13 + (((tickAnim - 18) / 15) * (13-(13)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 13 + (((tickAnim - 33) / 17) * (0-(13)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 7 + (((tickAnim - 18) / 15) * (7-(7)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 33) / 17) * (0-(7)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRiojasuchus entity = (EntityPrehistoricFloraRiojasuchus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = -14.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-30 + (((tickAnim - 0) / 18) * (-10.1-(-14.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-30)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -10.1 + (((tickAnim - 18) / 12) * (0-(-10.1)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.325-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0.325 + (((tickAnim - 12) / 18) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (33.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 33.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-50 + (((tickAnim - 18) / 12) * (0-(33.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-50)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (77.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-100-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 77.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-100 + (((tickAnim - 18) / 3) * (0-(77.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-30))*-100)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraRiojasuchus entity = (EntityPrehistoricFloraRiojasuchus) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5))*4), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-100))*10));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-20))*0.55);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-80))*0.45);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 43.94688 + (((tickAnim - 0) / 4) * (-35.92-(43.94688)));
            yy = -13.2075 + (((tickAnim - 0) / 4) * (0-(-13.2075)));
            zz = -3.85864 + (((tickAnim - 0) / 4) * (0-(-3.85864)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -35.92 + (((tickAnim - 4) / 2) * (-20.75-(-35.92)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -20.75 + (((tickAnim - 6) / 7) * (43.94688-(-20.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (-13.2075-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-3.85864-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 10.5 + (((tickAnim - 0) / 1) * (23.25-(10.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 23.25 + (((tickAnim - 1) / 3) * (28.16-(23.25)));
            yy = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 28.16 + (((tickAnim - 4) / 2) * (-8.25-(28.16)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -8.25 + (((tickAnim - 6) / 7) * (10.5-(-8.25)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 57.75 + (((tickAnim - 0) / 1) * (79.82-(57.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 79.82 + (((tickAnim - 1) / 5) * (32.61523-(79.82)));
            yy = 0 + (((tickAnim - 1) / 5) * (1.60167-(0)));
            zz = 0 + (((tickAnim - 1) / 5) * (-9.6188-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 32.61523 + (((tickAnim - 6) / 4) * (-12.87-(32.61523)));
            yy = 1.60167 + (((tickAnim - 6) / 4) * (0-(1.60167)));
            zz = -9.6188 + (((tickAnim - 6) / 4) * (0-(-9.6188)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -12.87 + (((tickAnim - 10) / 3) * (57.75-(-12.87)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.435-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.15-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0.435 + (((tickAnim - 1) / 2) * (0.88-(0.435)));
            zz = 0.15 + (((tickAnim - 1) / 2) * (0.07-(0.15)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.88 + (((tickAnim - 3) / 1) * (0.6-(0.88)));
            zz = 0.07 + (((tickAnim - 3) / 1) * (0-(0.07)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.6 + (((tickAnim - 4) / 2) * (-0.175-(0.6)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 6) / 3) * (-0.085-(-0.175)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.085 + (((tickAnim - 9) / 4) * (0-(-0.085)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -8.25 + (((tickAnim - 0) / 6) * (43.94688-(-8.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (13.2075-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (3.85864-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 43.94688 + (((tickAnim - 6) / 4) * (-35.92-(43.94688)));
            yy = 13.2075 + (((tickAnim - 6) / 4) * (0-(13.2075)));
            zz = 3.85864 + (((tickAnim - 6) / 4) * (0-(3.85864)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -35.92 + (((tickAnim - 10) / 3) * (-8.25-(-35.92)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -2.25 + (((tickAnim - 0) / 6) * (10.5-(-2.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 10.5 + (((tickAnim - 6) / 1) * (23.25-(10.5)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 23.25 + (((tickAnim - 7) / 4) * (28.16-(23.25)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 28.16 + (((tickAnim - 11) / 2) * (-8.25-(28.16)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -8.25 + (((tickAnim - 13) / 0) * (-2.25-(-8.25)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 9.63454 + (((tickAnim - 0) / 3) * (1.92-(9.63454)));
            yy = 1.55661 + (((tickAnim - 0) / 3) * (0-(1.55661)));
            zz = 9.87932 + (((tickAnim - 0) / 3) * (0-(9.87932)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 1.92 + (((tickAnim - 3) / 0) * (3.86-(1.92)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 3.86 + (((tickAnim - 3) / 3) * (57.75-(3.86)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 57.75 + (((tickAnim - 6) / 1) * (79.82-(57.75)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 79.82 + (((tickAnim - 7) / 6) * (27.88513-(79.82)));
            yy = 0 + (((tickAnim - 7) / 6) * (-1.47949-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (8.87855-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 27.88513 + (((tickAnim - 13) / 0) * (9.63454-(27.88513)));
            yy = -1.47949 + (((tickAnim - 13) / 0) * (1.55661-(-1.47949)));
            zz = 8.87855 + (((tickAnim - 13) / 0) * (9.87932-(8.87855)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.375 + (((tickAnim - 0) / 1) * (-0.16-(0.375)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.04-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = -0.16 + (((tickAnim - 1) / 2) * (0.025-(-0.16)));
            zz = 0.04 + (((tickAnim - 1) / 2) * (0.075-(0.04)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.025 + (((tickAnim - 3) / 0) * (0.17-(0.025)));
            zz = 0.075 + (((tickAnim - 3) / 0) * (0.175-(0.075)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.17 + (((tickAnim - 3) / 1) * (0.425-(0.17)));
            zz = 0.175 + (((tickAnim - 3) / 1) * (0.21-(0.175)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 4) / 2) * (0-(0.425)));
            zz = 0.21 + (((tickAnim - 4) / 2) * (0-(0.21)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0.435-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0.15-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.435 + (((tickAnim - 7) / 1) * (0.88-(0.435)));
            zz = 0.15 + (((tickAnim - 7) / 1) * (0.07-(0.15)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.88 + (((tickAnim - 8) / 3) * (0.6-(0.88)));
            zz = 0.07 + (((tickAnim - 8) / 3) * (0-(0.07)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.6 + (((tickAnim - 11) / 2) * (0.225-(0.6)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0.225 + (((tickAnim - 13) / 0) * (0.375-(0.225)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-100))*4), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-100))*2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-150))*8), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-100))*10), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-150))*2.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-200))*12), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-150))*15), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-200))*4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-50))*-4), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*-5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-100))*-15));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-20))*-3), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-100))*3), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-100))*10));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -75.25 + (((tickAnim - 0) / 6) * (13.25-(-75.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 13.25 + (((tickAnim - 6) / 3) * (-30.70913-(13.25)));
            yy = 0 + (((tickAnim - 6) / 3) * (12.61088-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (-41.58507-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -30.70913 + (((tickAnim - 9) / 4) * (-75.25-(-30.70913)));
            yy = 12.61088 + (((tickAnim - 9) / 4) * (0-(12.61088)));
            zz = -41.58507 + (((tickAnim - 9) / 4) * (0-(-41.58507)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.55 + (((tickAnim - 0) / 6) * (0-(0.55)));
            zz = 0.175 + (((tickAnim - 0) / 6) * (0-(0.175)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0.55-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0.175-(0)));
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
            xx = 48.81074 + (((tickAnim - 0) / 6) * (10.75-(48.81074)));
            yy = -8.85281 + (((tickAnim - 0) / 6) * (0-(-8.85281)));
            zz = -4.10122 + (((tickAnim - 0) / 6) * (0-(-4.10122)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 10.75 + (((tickAnim - 6) / 2) * (36.15569-(10.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.69172-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (15.88067-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 36.15569 + (((tickAnim - 8) / 3) * (-20.37186-(36.15569)));
            yy = -0.69172 + (((tickAnim - 8) / 3) * (-9.40131-(-0.69172)));
            zz = 15.88067 + (((tickAnim - 8) / 3) * (23.15986-(15.88067)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -20.37186 + (((tickAnim - 11) / 2) * (48.81074-(-20.37186)));
            yy = -9.40131 + (((tickAnim - 11) / 2) * (-8.85281-(-9.40131)));
            zz = 23.15986 + (((tickAnim - 11) / 2) * (-4.10122-(23.15986)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 19.45308 + (((tickAnim - 0) / 3) * (0.94136-(19.45308)));
            yy = 2.40857 + (((tickAnim - 0) / 3) * (0.37462-(2.40857)));
            zz = -2.18084 + (((tickAnim - 0) / 3) * (-0.50714-(-2.18084)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.94136 + (((tickAnim - 3) / 3) * (67-(0.94136)));
            yy = 0.37462 + (((tickAnim - 3) / 3) * (0-(0.37462)));
            zz = -0.50714 + (((tickAnim - 3) / 3) * (0-(-0.50714)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 67 + (((tickAnim - 6) / 2) * (94.12448-(67)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.12445-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.10169-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 94.12448 + (((tickAnim - 8) / 3) * (94.1238-(94.12448)));
            yy = 0.12445 + (((tickAnim - 8) / 3) * (0.29039-(0.12445)));
            zz = -0.10169 + (((tickAnim - 8) / 3) * (-0.23727-(-0.10169)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 94.1238 + (((tickAnim - 11) / 2) * (19.45308-(94.1238)));
            yy = 0.29039 + (((tickAnim - 11) / 2) * (2.40857-(0.29039)));
            zz = -0.23727 + (((tickAnim - 11) / 2) * (-2.18084-(-0.23727)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.3-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-0.225-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.3 + (((tickAnim - 6) / 7) * (0-(0.3)));
            zz = -0.225 + (((tickAnim - 6) / 7) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13.25 + (((tickAnim - 0) / 3) * (-30.70913-(13.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-12.61088-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (41.58507-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -30.70913 + (((tickAnim - 3) / 4) * (-75.25-(-30.70913)));
            yy = -12.61088 + (((tickAnim - 3) / 4) * (0-(-12.61088)));
            zz = 41.58507 + (((tickAnim - 3) / 4) * (0-(41.58507)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -75.25 + (((tickAnim - 7) / 6) * (13.25-(-75.25)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.175-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.55 + (((tickAnim - 7) / 6) * (0-(0.55)));
            zz = 0.175 + (((tickAnim - 7) / 6) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(xx);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(yy);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 10.75 + (((tickAnim - 0) / 1) * (36.15569-(10.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.69172-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-15.88067-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 36.15569 + (((tickAnim - 1) / 3) * (-20.37186-(36.15569)));
            yy = 0.69172 + (((tickAnim - 1) / 3) * (9.40131-(0.69172)));
            zz = -15.88067 + (((tickAnim - 1) / 3) * (-23.15986-(-15.88067)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -20.37186 + (((tickAnim - 4) / 3) * (48.81074-(-20.37186)));
            yy = 9.40131 + (((tickAnim - 4) / 3) * (8.85281-(9.40131)));
            zz = -23.15986 + (((tickAnim - 4) / 3) * (4.10122-(-23.15986)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 48.81074 + (((tickAnim - 7) / 6) * (10.75-(48.81074)));
            yy = 8.85281 + (((tickAnim - 7) / 6) * (0-(8.85281)));
            zz = 4.10122 + (((tickAnim - 7) / 6) * (0-(4.10122)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(0);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(0);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 67 + (((tickAnim - 0) / 1) * (94.12448-(67)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.12445-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-0.10169-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 94.12448 + (((tickAnim - 1) / 2) * (94.1238-(94.12448)));
            yy = 0.12445 + (((tickAnim - 1) / 2) * (0.29039-(0.12445)));
            zz = -0.10169 + (((tickAnim - 1) / 2) * (-0.23727-(-0.10169)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 94.1238 + (((tickAnim - 3) / 4) * (24.24559-(94.1238)));
            yy = 0.29039 + (((tickAnim - 3) / 4) * (0.76362-(0.29039)));
            zz = -0.23727 + (((tickAnim - 3) / 4) * (-0.64507-(-0.23727)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 24.24559 + (((tickAnim - 7) / 2) * (6.44101-(24.24559)));
            yy = 0.76362 + (((tickAnim - 7) / 2) * (-0.31273-(0.76362)));
            zz = -0.64507 + (((tickAnim - 7) / 2) * (0.25552-(-0.64507)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 6.44101 + (((tickAnim - 9) / 4) * (67-(6.44101)));
            yy = -0.31273 + (((tickAnim - 9) / 4) * (0-(-0.31273)));
            zz = 0.25552 + (((tickAnim - 9) / 4) * (0-(0.25552)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 7) * (0-(0.3)));
            zz = -0.225 + (((tickAnim - 0) / 7) * (0-(-0.225)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.3-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (-0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-8.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-200))*-4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*4));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0.55);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-100))*4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraRiojasuchus entity = (EntityPrehistoricFloraRiojasuchus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*2.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*2.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-20))*0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-80))*0.25);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 43.94688 + (((tickAnim - 0) / 8) * (-35.92-(43.94688)));
            yy = -13.2075 + (((tickAnim - 0) / 8) * (0-(-13.2075)));
            zz = -3.85864 + (((tickAnim - 0) / 8) * (0-(-3.85864)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -35.92 + (((tickAnim - 8) / 4) * (-20.75-(-35.92)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -20.75 + (((tickAnim - 12) / 13) * (43.94688-(-20.75)));
            yy = 0 + (((tickAnim - 12) / 13) * (-13.2075-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (-3.85864-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 10.5 + (((tickAnim - 0) / 2) * (23.25-(10.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 23.25 + (((tickAnim - 2) / 6) * (28.16-(23.25)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 28.16 + (((tickAnim - 8) / 4) * (-8.25-(28.16)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -8.25 + (((tickAnim - 12) / 13) * (10.5-(-8.25)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 57.75 + (((tickAnim - 0) / 2) * (79.82-(57.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
            xx = 79.82 + (((tickAnim - 2) / 10) * (28-(79.82)));
            yy = 0 + (((tickAnim - 2) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 10) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 28 + (((tickAnim - 12) / 7) * (-12.87-(28)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -12.87 + (((tickAnim - 19) / 6) * (57.75-(-12.87)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.435-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.15-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.435 + (((tickAnim - 2) / 3) * (0.88-(0.435)));
            zz = 0.15 + (((tickAnim - 2) / 3) * (0.07-(0.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.88 + (((tickAnim - 5) / 3) * (0.6-(0.88)));
            zz = 0.07 + (((tickAnim - 5) / 3) * (0-(0.07)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.6 + (((tickAnim - 8) / 4) * (-0.75-(0.6)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = -0.75 + (((tickAnim - 12) / 5) * (-0.085-(-0.75)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = -0.085 + (((tickAnim - 17) / 8) * (0-(-0.085)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -8.25 + (((tickAnim - 0) / 11) * (43.94688-(-8.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (13.2075-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (3.85864-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 43.94688 + (((tickAnim - 11) / 8) * (-35.92-(43.94688)));
            yy = 13.2075 + (((tickAnim - 11) / 8) * (0-(13.2075)));
            zz = 3.85864 + (((tickAnim - 11) / 8) * (0-(3.85864)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -35.92 + (((tickAnim - 19) / 3) * (-20.75-(-35.92)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -20.75 + (((tickAnim - 22) / 3) * (-8.25-(-20.75)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -2.25 + (((tickAnim - 0) / 11) * (10.5-(-2.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 10.5 + (((tickAnim - 11) / 2) * (23.25-(10.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 23.25 + (((tickAnim - 13) / 6) * (28.16-(23.25)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 28.16 + (((tickAnim - 19) / 3) * (-8.25-(28.16)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -8.25 + (((tickAnim - 22) / 3) * (-2.25-(-8.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 9.5 + (((tickAnim - 0) / 3) * (1.92-(9.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 1.92 + (((tickAnim - 3) / 4) * (3.86-(1.92)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 3.86 + (((tickAnim - 7) / 4) * (57.75-(3.86)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 57.75 + (((tickAnim - 11) / 2) * (79.82-(57.75)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 79.82 + (((tickAnim - 13) / 9) * (28-(79.82)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 28 + (((tickAnim - 22) / 3) * (9.5-(28)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 2) * (-0.16-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.04-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.16 + (((tickAnim - 2) / 1) * (0.025-(-0.16)));
            zz = 0.04 + (((tickAnim - 2) / 1) * (0.075-(0.04)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.025 + (((tickAnim - 3) / 4) * (0.17-(0.025)));
            zz = 0.075 + (((tickAnim - 3) / 4) * (0.175-(0.075)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.17 + (((tickAnim - 7) / 1) * (0.425-(0.17)));
            zz = 0.175 + (((tickAnim - 7) / 1) * (0.21-(0.175)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.425 + (((tickAnim - 8) / 3) * (0-(0.425)));
            zz = 0.21 + (((tickAnim - 8) / 3) * (0-(0.21)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0.435-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0.15-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.435 + (((tickAnim - 13) / 3) * (0.88-(0.435)));
            zz = 0.15 + (((tickAnim - 13) / 3) * (0.07-(0.15)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 0.88 + (((tickAnim - 16) / 3) * (0.6-(0.88)));
            zz = 0.07 + (((tickAnim - 16) / 3) * (0-(0.07)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 19) / 3) * (-0.75-(0.6)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = -0.75 + (((tickAnim - 22) / 3) * (-0.2-(-0.75)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*2.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*6), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*-2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-1.5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-20))*-1.5), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*3), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-4));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -52.5 + (((tickAnim - 0) / 13) * (13.25-(-52.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 13.25 + (((tickAnim - 13) / 6) * (-30.70913-(13.25)));
            yy = 0 + (((tickAnim - 13) / 6) * (12.61088-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (-41.58507-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -30.70913 + (((tickAnim - 19) / 6) * (-52.5-(-30.70913)));
            yy = 12.61088 + (((tickAnim - 19) / 6) * (0-(12.61088)));
            zz = -41.58507 + (((tickAnim - 19) / 6) * (0-(-41.58507)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0.55 + (((tickAnim - 0) / 13) * (0-(0.55)));
            zz = 0.175 + (((tickAnim - 0) / 13) * (0-(0.175)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0.55-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0.175-(0)));
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
            xx = 29.56074 + (((tickAnim - 0) / 13) * (10.75-(29.56074)));
            yy = -8.85281 + (((tickAnim - 0) / 13) * (0-(-8.85281)));
            zz = -4.10122 + (((tickAnim - 0) / 13) * (0-(-4.10122)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 10.75 + (((tickAnim - 13) / 2) * (36.15569-(10.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (-0.69172-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (15.88067-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 36.15569 + (((tickAnim - 15) / 6) * (-20.37186-(36.15569)));
            yy = -0.69172 + (((tickAnim - 15) / 6) * (-9.40131-(-0.69172)));
            zz = 15.88067 + (((tickAnim - 15) / 6) * (23.15986-(15.88067)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -20.37186 + (((tickAnim - 21) / 4) * (29.56074-(-20.37186)));
            yy = -9.40131 + (((tickAnim - 21) / 4) * (-8.85281-(-9.40131)));
            zz = 23.15986 + (((tickAnim - 21) / 4) * (-4.10122-(23.15986)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 19.45308 + (((tickAnim - 0) / 6) * (0.94136-(19.45308)));
            yy = 2.40857 + (((tickAnim - 0) / 6) * (0.37462-(2.40857)));
            zz = -2.18084 + (((tickAnim - 0) / 6) * (-0.50714-(-2.18084)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0.94136 + (((tickAnim - 6) / 7) * (67-(0.94136)));
            yy = 0.37462 + (((tickAnim - 6) / 7) * (0-(0.37462)));
            zz = -0.50714 + (((tickAnim - 6) / 7) * (0-(-0.50714)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 67 + (((tickAnim - 13) / 2) * (94.12448-(67)));
            yy = 0 + (((tickAnim - 13) / 2) * (0.12445-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-0.10169-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 94.12448 + (((tickAnim - 15) / 6) * (94.1238-(94.12448)));
            yy = 0.12445 + (((tickAnim - 15) / 6) * (0.29039-(0.12445)));
            zz = -0.10169 + (((tickAnim - 15) / 6) * (-0.23727-(-0.10169)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 94.1238 + (((tickAnim - 21) / 4) * (19.45308-(94.1238)));
            yy = 0.29039 + (((tickAnim - 21) / 4) * (2.40857-(0.29039)));
            zz = -0.23727 + (((tickAnim - 21) / 4) * (-2.18084-(-0.23727)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.85 + (((tickAnim - 0) / 6) * (0-(0.85)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0.3-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-0.225-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0.3 + (((tickAnim - 13) / 12) * (0.85-(0.3)));
            zz = -0.225 + (((tickAnim - 13) / 12) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 13.25 + (((tickAnim - 0) / 8) * (-30.70913-(13.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (-12.61088-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (41.58507-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -30.70913 + (((tickAnim - 8) / 6) * (-52.5-(-30.70913)));
            yy = -12.61088 + (((tickAnim - 8) / 6) * (0-(-12.61088)));
            zz = 41.58507 + (((tickAnim - 8) / 6) * (0-(41.58507)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = -52.5 + (((tickAnim - 14) / 11) * (13.25-(-52.5)));
            yy = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0.175-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            yy = 0.55 + (((tickAnim - 14) / 11) * (0-(0.55)));
            zz = 0.175 + (((tickAnim - 14) / 11) * (0-(0.175)));
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
            xx = 10.75 + (((tickAnim - 0) / 3) * (36.15569-(10.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.69172-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-15.88067-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 36.15569 + (((tickAnim - 3) / 6) * (-20.37186-(36.15569)));
            yy = 0.69172 + (((tickAnim - 3) / 6) * (9.40131-(0.69172)));
            zz = -15.88067 + (((tickAnim - 3) / 6) * (-23.15986-(-15.88067)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -20.37186 + (((tickAnim - 9) / 5) * (29.56074-(-20.37186)));
            yy = 9.40131 + (((tickAnim - 9) / 5) * (8.85281-(9.40131)));
            zz = -23.15986 + (((tickAnim - 9) / 5) * (4.10122-(-23.15986)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 29.56074 + (((tickAnim - 14) / 11) * (10.75-(29.56074)));
            yy = 8.85281 + (((tickAnim - 14) / 11) * (0-(8.85281)));
            zz = 4.10122 + (((tickAnim - 14) / 11) * (0-(4.10122)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 67 + (((tickAnim - 0) / 3) * (94.12448-(67)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.12445-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.10169-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 94.12448 + (((tickAnim - 3) / 5) * (94.1238-(94.12448)));
            yy = 0.12445 + (((tickAnim - 3) / 5) * (0.29039-(0.12445)));
            zz = -0.10169 + (((tickAnim - 3) / 5) * (-0.23727-(-0.10169)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 94.1238 + (((tickAnim - 8) / 6) * (23.24759-(94.1238)));
            yy = 0.29039 + (((tickAnim - 8) / 6) * (-0.58079-(0.29039)));
            zz = -0.23727 + (((tickAnim - 8) / 6) * (0.47455-(-0.23727)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 23.24759 + (((tickAnim - 14) / 4) * (6.44101-(23.24759)));
            yy = -0.58079 + (((tickAnim - 14) / 4) * (-0.31273-(-0.58079)));
            zz = 0.47455 + (((tickAnim - 14) / 4) * (0.25552-(0.47455)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 6.44101 + (((tickAnim - 18) / 7) * (67-(6.44101)));
            yy = -0.31273 + (((tickAnim - 18) / 7) * (0-(-0.31273)));
            zz = 0.25552 + (((tickAnim - 18) / 7) * (0-(0.25552)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 14) * (0.25-(0.3)));
            zz = -0.225 + (((tickAnim - 0) / 14) * (0-(-0.225)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 14) / 4) * (0-(0.25)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0.3-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (-0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*-2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*4));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraRiojasuchus ee = (EntityPrehistoricFloraRiojasuchus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraRiojasuchus e = (EntityPrehistoricFloraRiojasuchus) entity;

    }
}
