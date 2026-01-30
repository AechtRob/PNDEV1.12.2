package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraUmoonasaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelUmoonasaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer frontRightFlipper;
    private final AdvancedModelRenderer frontRightFlipper2;
    private final AdvancedModelRenderer frontRightFlipper3;
    private final AdvancedModelRenderer frontLeftFlipper;
    private final AdvancedModelRenderer frontLeftFlipper2;
    private final AdvancedModelRenderer frontLeftFlipper3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer backRightFlipper;
    private final AdvancedModelRenderer backRightFlipper2;
    private final AdvancedModelRenderer backRightFlipper3;
    private final AdvancedModelRenderer backLeftFlipper;
    private final AdvancedModelRenderer backLeftFlipper2;
    private final AdvancedModelRenderer backLeftFlipper3;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r13;

    private ModelAnimator animator;

    public ModelUmoonasaurus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -6.5F, -13.0F, -6.0F, 13, 9, 14, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -11.0F, -6.0F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 23, -5.0F, -1.75F, -6.5F, 10, 8, 8, 0.0F, false));

        this.frontRightFlipper = new AdvancedModelRenderer(this);
        this.frontRightFlipper.setRotationPoint(-3.8639F, 3.768F, -1.747F);
        this.body.addChild(frontRightFlipper);
        this.setRotateAngle(frontRightFlipper, -0.2618F, 0.0F, 1.309F);
        this.frontRightFlipper.cubeList.add(new ModelBox(frontRightFlipper, 54, 10, -0.5F, -0.5F, -3.25F, 2, 8, 5, 0.0F, false));

        this.frontRightFlipper2 = new AdvancedModelRenderer(this);
        this.frontRightFlipper2.setRotationPoint(0.5F, 7.5268F, -1.7785F);
        this.frontRightFlipper.addChild(frontRightFlipper2);
        this.setRotateAngle(frontRightFlipper2, 0.1309F, 0.0F, 0.0F);
        this.frontRightFlipper2.cubeList.add(new ModelBox(frontRightFlipper2, 22, 39, -1.0F, -0.5F, -1.5F, 2, 9, 6, 0.01F, false));

        this.frontRightFlipper3 = new AdvancedModelRenderer(this);
        this.frontRightFlipper3.setRotationPoint(0.0F, 8.0239F, 0.286F);
        this.frontRightFlipper2.addChild(frontRightFlipper3);
        this.setRotateAngle(frontRightFlipper3, 0.1309F, 0.0F, 0.0F);
        this.frontRightFlipper3.cubeList.add(new ModelBox(frontRightFlipper3, 52, 55, -0.5F, 0.0F, -1.5F, 1, 7, 5, 0.0F, false));

        this.frontLeftFlipper = new AdvancedModelRenderer(this);
        this.frontLeftFlipper.setRotationPoint(3.8639F, 3.768F, -1.747F);
        this.body.addChild(frontLeftFlipper);
        this.setRotateAngle(frontLeftFlipper, -0.2618F, 0.0F, -1.309F);
        this.frontLeftFlipper.cubeList.add(new ModelBox(frontLeftFlipper, 54, 10, -1.5F, -0.5F, -3.25F, 2, 8, 5, 0.0F, true));

        this.frontLeftFlipper2 = new AdvancedModelRenderer(this);
        this.frontLeftFlipper2.setRotationPoint(-0.5F, 7.5268F, -1.7785F);
        this.frontLeftFlipper.addChild(frontLeftFlipper2);
        this.setRotateAngle(frontLeftFlipper2, 0.1309F, 0.0F, 0.0F);
        this.frontLeftFlipper2.cubeList.add(new ModelBox(frontLeftFlipper2, 22, 39, -1.0F, -0.5F, -1.5F, 2, 9, 6, 0.01F, true));

        this.frontLeftFlipper3 = new AdvancedModelRenderer(this);
        this.frontLeftFlipper3.setRotationPoint(0.0F, 8.0239F, 0.286F);
        this.frontLeftFlipper2.addChild(frontLeftFlipper3);
        this.setRotateAngle(frontLeftFlipper3, 0.1309F, 0.0F, 0.0F);
        this.frontLeftFlipper3.cubeList.add(new ModelBox(frontLeftFlipper3, 52, 55, -0.5F, 0.0F, -1.5F, 1, 7, 5, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -6.75F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.1309F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 39, -3.0F, -1.5F, -4.0F, 6, 6, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.0873F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 54, 0, -2.5F, -1.5F, -4.0F, 5, 5, 5, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0436F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 54, 47, -2.0F, -1.5F, -4.0F, 4, 4, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.35F, -4.0F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 68, 10, -1.5F, -0.3F, -5.3F, 3, 1, 3, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.7F, -4.95F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 68, 14, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.325F, -3.425F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3578F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 60, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.175F, -0.75F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.096F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 67, -1.5F, -1.0F, -2.0F, 3, 2, 3, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.725F, -0.7F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 64, 63, -2.0F, -1.0F, -2.0F, 4, 1, 3, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.025F, 0.975F, -4.55F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0611F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 68, 1.0F, -1.0F, -2.0F, 0, 1, 3, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 68, -0.95F, -1.0F, -2.0F, 0, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.15F, -0.75F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 64, 55, -2.0F, -1.0F, -2.0F, 4, 1, 3, 0.02F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.775F, -1.55F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 12, 63, -1.5F, -0.025F, -3.75F, 3, 1, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 68, 21, -1.5F, -1.025F, -0.75F, 3, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 64, 59, -2.0F, 0.0F, -1.15F, 4, 1, 3, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.05F, 0.7F, -2.95F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0611F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 68, 17, 1.0F, -1.0F, -2.0F, 0, 1, 3, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 68, 17, -0.9F, -1.0F, -2.0F, 0, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.0F, -3.45F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 68, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.95F, 1.175F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0611F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 50, 67, -1.5F, -2.0F, -2.0F, 3, 2, 3, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.55F, -1.75F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.288F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 62, 67, -1.5F, -1.0F, -2.0F, 3, 1, 3, -0.02F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(-0.8345F, -0.6216F, -3.8744F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.2035F, 0.2693F, -0.2667F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.475F, 0.675F, 0.0F);
        this.eye.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1897F, -0.1182F, 0.9795F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 70, 23, -0.5F, -0.95F, -1.0F, 1, 1, 2, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(0.8345F, -0.6216F, -3.8744F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.2035F, -0.2693F, 0.2667F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.475F, 0.675F, 0.0F);
        this.eye2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1897F, 0.1182F, -0.9795F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 70, 23, -0.5F, -0.95F, -1.0F, 1, 1, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -11.7F, 8.0F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 35, 23, -5.0F, -1.0F, -1.0F, 10, 8, 8, 0.0F, false));

        this.backRightFlipper = new AdvancedModelRenderer(this);
        this.backRightFlipper.setRotationPoint(-4.0748F, 4.3336F, 2.7361F);
        this.tail.addChild(backRightFlipper);
        this.setRotateAngle(backRightFlipper, 0.48F, 0.0F, 1.309F);
        this.backRightFlipper.cubeList.add(new ModelBox(backRightFlipper, 38, 54, -0.5F, -0.5F, -2.0F, 2, 8, 5, 0.0F, false));

        this.backRightFlipper2 = new AdvancedModelRenderer(this);
        this.backRightFlipper2.setRotationPoint(0.5F, 7.2768F, -0.7785F);
        this.backRightFlipper.addChild(backRightFlipper2);
        this.setRotateAngle(backRightFlipper2, 0.2182F, 0.0F, 0.0F);
        this.backRightFlipper2.cubeList.add(new ModelBox(backRightFlipper2, 38, 39, -1.0F, -0.5F, -1.25F, 2, 9, 6, 0.01F, false));

        this.backRightFlipper3 = new AdvancedModelRenderer(this);
        this.backRightFlipper3.setRotationPoint(0.0F, 8.2739F, 0.036F);
        this.backRightFlipper2.addChild(backRightFlipper3);
        this.setRotateAngle(backRightFlipper3, 0.2618F, 0.0F, 0.0F);
        this.backRightFlipper3.cubeList.add(new ModelBox(backRightFlipper3, 0, 60, -0.5F, 0.0F, -0.5F, 1, 7, 5, 0.0F, false));

        this.backLeftFlipper = new AdvancedModelRenderer(this);
        this.backLeftFlipper.setRotationPoint(4.0748F, 4.3336F, 2.7361F);
        this.tail.addChild(backLeftFlipper);
        this.setRotateAngle(backLeftFlipper, 0.48F, 0.0F, -1.309F);
        this.backLeftFlipper.cubeList.add(new ModelBox(backLeftFlipper, 38, 54, -1.5F, -0.5F, -2.0F, 2, 8, 5, 0.0F, true));

        this.backLeftFlipper2 = new AdvancedModelRenderer(this);
        this.backLeftFlipper2.setRotationPoint(-0.5F, 7.2768F, -0.7785F);
        this.backLeftFlipper.addChild(backLeftFlipper2);
        this.setRotateAngle(backLeftFlipper2, 0.2182F, 0.0F, 0.0F);
        this.backLeftFlipper2.cubeList.add(new ModelBox(backLeftFlipper2, 38, 39, -1.0F, -0.5F, -1.25F, 2, 9, 6, 0.01F, true));

        this.backLeftFlipper3 = new AdvancedModelRenderer(this);
        this.backLeftFlipper3.setRotationPoint(0.0F, 8.2739F, 0.036F);
        this.backLeftFlipper2.addChild(backLeftFlipper3);
        this.setRotateAngle(backLeftFlipper3, 0.2618F, 0.0F, 0.0F);
        this.backLeftFlipper3.cubeList.add(new ModelBox(backLeftFlipper3, 0, 60, -0.5F, 0.0F, -0.5F, 1, 7, 5, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.15F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 50, -2.5F, -1.0F, -1.0F, 5, 5, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 54, 39, -1.5F, -1.0F, -1.0F, 3, 3, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 20, 54, -1.0F, -1.0F, -1.0F, 2, 2, 7, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.6F, 0.5F);
        this.tail4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.288F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 63, -0.5F, -2.0F, -1.0F, 1, 2, 5, 0.0F, false));
        
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
        this.main.offsetY = -0.2F;
        this.main.offsetX = -0.2F;
        this.main.rotateAngleY = (float)Math.toRadians(220);
        this.main.rotateAngleX = (float)Math.toRadians(18);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 0.4F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.35F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.main.offsetY = -0.08F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraUmoonasaurus ee = (EntityPrehistoricFloraUmoonasaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            animBeached(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraUmoonasaurus entity = (EntityPrehistoricFloraUmoonasaurus) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0.75 + (((tickAnim - 4) / 4) * (1.5-(0.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 1.5 + (((tickAnim - 8) / 4) * (0-(1.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 8 + (((tickAnim - 4) / 4) * (16-(8)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 16 + (((tickAnim - 8) / 4) * (0-(16)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.25-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0.25 + (((tickAnim - 4) / 4) * (0.325-(0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0.325 + (((tickAnim - 8) / 4) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 22.75 + (((tickAnim - 4) / 2) * (31.39-(22.75)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 31.39 + (((tickAnim - 6) / 2) * (0-(31.39)));
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
        EntityPrehistoricFloraUmoonasaurus entity = (EntityPrehistoricFloraUmoonasaurus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*-4), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.75))*1));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+30))*0.8);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+50))*-0.8);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*-4), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*4), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(0);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(0);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(0);


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*4), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*4), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*4), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*6), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+50))*6), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontRightFlipper, frontRightFlipper.rotateAngleX + (float) Math.toRadians(12.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+80))*-30), frontRightFlipper.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-20))*-40), frontRightFlipper.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*-20));


        this.setRotateAngle(frontRightFlipper2, frontRightFlipper2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+80))*-20), frontRightFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+20))*-20), frontRightFlipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-90))*-20));


        this.setRotateAngle(frontRightFlipper3, frontRightFlipper3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+180))*20), frontRightFlipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-200))*-20), frontRightFlipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-90))*-20));


        this.setRotateAngle(backRightFlipper, backRightFlipper.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*-20), backRightFlipper.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*-40), backRightFlipper.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+50))*20));


        this.setRotateAngle(backRightFlipper2, backRightFlipper2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*-20), backRightFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+20))*-10), backRightFlipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+50))*20));


        this.setRotateAngle(backRightFlipper3, backRightFlipper3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+100))*20), backRightFlipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-200))*-10), backRightFlipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*20));
        this.backRightFlipper3.rotationPointX = this.backRightFlipper3.rotationPointX + (float)(0);
        this.backRightFlipper3.rotationPointY = this.backRightFlipper3.rotationPointY - (float)(0.4);
        this.backRightFlipper3.rotationPointZ = this.backRightFlipper3.rotationPointZ + (float)(0);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+80))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontLeftFlipper, frontLeftFlipper.rotateAngleX + (float) Math.toRadians(12.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+80))*-30), frontLeftFlipper.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-20))*40), frontLeftFlipper.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*20));


        this.setRotateAngle(frontLeftFlipper2, frontLeftFlipper2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+80))*-20), frontLeftFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+20))*20), frontLeftFlipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-90))*20));
        this.frontLeftFlipper2.rotationPointX = this.frontLeftFlipper2.rotationPointX + (float)(0);
        this.frontLeftFlipper2.rotationPointY = this.frontLeftFlipper2.rotationPointY - (float)(0.45);
        this.frontLeftFlipper2.rotationPointZ = this.frontLeftFlipper2.rotationPointZ + (float)(0);


        this.setRotateAngle(frontLeftFlipper3, frontLeftFlipper3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+180))*20), frontLeftFlipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-200))*20), frontLeftFlipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-90))*20));


        this.setRotateAngle(backLeftFlipper, backLeftFlipper.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*-20), backLeftFlipper.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*40), backLeftFlipper.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+50))*-20));


        this.setRotateAngle(backLeftFlipper2, backLeftFlipper2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*-20), backLeftFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+20))*10), backLeftFlipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+50))*-20));


        this.setRotateAngle(backLeftFlipper3, backLeftFlipper3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+100))*20), backLeftFlipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-200))*10), backLeftFlipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*-20));
        this.backLeftFlipper3.rotationPointX = this.backLeftFlipper3.rotationPointX + (float)(0);
        this.backLeftFlipper3.rotationPointY = this.backLeftFlipper3.rotationPointY - (float)(0.4);
        this.backLeftFlipper3.rotationPointZ = this.backLeftFlipper3.rotationPointZ + (float)(0);
        
        
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraUmoonasaurus entity = (EntityPrehistoricFloraUmoonasaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-10), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*217/0.75))*2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+30))*2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*2);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-10), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*10), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(0);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(0);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(0);


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*12), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*12), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*12), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*12), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(1);


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-20))*12), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*12), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontRightFlipper, frontRightFlipper.rotateAngleX + (float) Math.toRadians(12.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+80))*-30), frontRightFlipper.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-20))*-40), frontRightFlipper.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+20))*-20));


        this.setRotateAngle(frontRightFlipper2, frontRightFlipper2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+80))*-20), frontRightFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+20))*-20), frontRightFlipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-20));


        this.setRotateAngle(frontRightFlipper3, frontRightFlipper3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+180))*20), frontRightFlipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*-20), frontRightFlipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-20));


        this.setRotateAngle(backRightFlipper, backRightFlipper.rotateAngleX + (float) Math.toRadians(-4.2594+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-20), backRightFlipper.rotateAngleY + (float) Math.toRadians(2.3598+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*-40), backRightFlipper.rotateAngleZ + (float) Math.toRadians(-6.5434+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*30));


        this.setRotateAngle(backRightFlipper2, backRightFlipper2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-20), backRightFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+20))*-10), backRightFlipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*20));


        this.setRotateAngle(backRightFlipper3, backRightFlipper3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*20), backRightFlipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*-10), backRightFlipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*20));
        this.backRightFlipper3.rotationPointX = this.backRightFlipper3.rotationPointX + (float)(0);
        this.backRightFlipper3.rotationPointY = this.backRightFlipper3.rotationPointY - (float)(0.4);
        this.backRightFlipper3.rotationPointZ = this.backRightFlipper3.rotationPointZ + (float)(0);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+80))*-5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontLeftFlipper, frontLeftFlipper.rotateAngleX + (float) Math.toRadians(12.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+80))*-30), frontLeftFlipper.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-20))*40), frontLeftFlipper.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+20))*20));


        this.setRotateAngle(frontLeftFlipper2, frontLeftFlipper2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+80))*-20), frontLeftFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+20))*20), frontLeftFlipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*20));
        this.frontLeftFlipper2.rotationPointX = this.frontLeftFlipper2.rotationPointX + (float)(0);
        this.frontLeftFlipper2.rotationPointY = this.frontLeftFlipper2.rotationPointY - (float)(0.45);
        this.frontLeftFlipper2.rotationPointZ = this.frontLeftFlipper2.rotationPointZ + (float)(0);


        this.setRotateAngle(frontLeftFlipper3, frontLeftFlipper3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+180))*20), frontLeftFlipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*20), frontLeftFlipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*20));


        this.setRotateAngle(backLeftFlipper, backLeftFlipper.rotateAngleX + (float) Math.toRadians(-5.9324+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-20), backLeftFlipper.rotateAngleY + (float) Math.toRadians(-3.1222+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*40), backLeftFlipper.rotateAngleZ + (float) Math.toRadians(9.037+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-30));


        this.setRotateAngle(backLeftFlipper2, backLeftFlipper2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-20), backLeftFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+20))*10), backLeftFlipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-20));


        this.setRotateAngle(backLeftFlipper3, backLeftFlipper3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*20), backLeftFlipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*10), backLeftFlipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-20));
        this.backLeftFlipper3.rotationPointX = this.backLeftFlipper3.rotationPointX + (float)(0);
        this.backLeftFlipper3.rotationPointY = this.backLeftFlipper3.rotationPointY - (float)(0.4);
        this.backLeftFlipper3.rotationPointZ = this.backLeftFlipper3.rotationPointZ + (float)(0);
        
        
    }
    public void animBeached(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraUmoonasaurus entity = (EntityPrehistoricFloraUmoonasaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(-4.25);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-25.25), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(0);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(-0.4);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(0);


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(2.75), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(16), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 22.25 + (((tickAnim - 0) / 10) * (-17.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-88))*50-(22.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -17.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-88))*50 + (((tickAnim - 10) / 10) * (22.25-(-17.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-88))*50)));
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
            xx = -0.75 + (((tickAnim - 0) / 10) * (-10.75-(-0.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10.75 + (((tickAnim - 10) / 10) * (-0.75-(-10.75)));
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
            xx = -11.75 + (((tickAnim - 0) / 10) * (-17.25-(-11.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -17.25 + (((tickAnim - 10) / 10) * (-11.75-(-17.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(frontRightFlipper, frontRightFlipper.rotateAngleX + (float) Math.toRadians(6.56494), frontRightFlipper.rotateAngleY + (float) Math.toRadians(9.23902), frontRightFlipper.rotateAngleZ + (float) Math.toRadians(4.72784));


        this.setRotateAngle(frontRightFlipper2, frontRightFlipper2.rotateAngleX + (float) Math.toRadians(0), frontRightFlipper2.rotateAngleY + (float) Math.toRadians(0), frontRightFlipper2.rotateAngleZ + (float) Math.toRadians(6.75));


        this.setRotateAngle(frontRightFlipper3, frontRightFlipper3.rotateAngleX + (float) Math.toRadians(0), frontRightFlipper3.rotateAngleY + (float) Math.toRadians(0), frontRightFlipper3.rotateAngleZ + (float) Math.toRadians(1.5));


        this.setRotateAngle(backRightFlipper, backRightFlipper.rotateAngleX + (float) Math.toRadians(0), backRightFlipper.rotateAngleY + (float) Math.toRadians(0), backRightFlipper.rotateAngleZ + (float) Math.toRadians(10.5));


        this.setRotateAngle(backRightFlipper3, backRightFlipper3.rotateAngleX + (float) Math.toRadians(0), backRightFlipper3.rotateAngleY + (float) Math.toRadians(0), backRightFlipper3.rotateAngleZ + (float) Math.toRadians(6.5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 0) / 10) * (-8.25-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.25 + (((tickAnim - 10) / 10) * (-3-(-8.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 20.25 + (((tickAnim - 10) / 7) * (10.5-(20.25)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 10.5 + (((tickAnim - 17) / 3) * (0-(10.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(frontLeftFlipper, frontLeftFlipper.rotateAngleX + (float) Math.toRadians(0.24271), frontLeftFlipper.rotateAngleY + (float) Math.toRadians(-4.83472), frontLeftFlipper.rotateAngleZ + (float) Math.toRadians(-3.15037));


        this.setRotateAngle(frontLeftFlipper2, frontLeftFlipper2.rotateAngleX + (float) Math.toRadians(0), frontLeftFlipper2.rotateAngleY + (float) Math.toRadians(0), frontLeftFlipper2.rotateAngleZ + (float) Math.toRadians(-10.5));


        this.setRotateAngle(backLeftFlipper, backLeftFlipper.rotateAngleX + (float) Math.toRadians(0), backLeftFlipper.rotateAngleY + (float) Math.toRadians(0), backLeftFlipper.rotateAngleZ + (float) Math.toRadians(-4.5));


        this.setRotateAngle(backLeftFlipper2, backLeftFlipper2.rotateAngleX + (float) Math.toRadians(0), backLeftFlipper2.rotateAngleY + (float) Math.toRadians(0), backLeftFlipper2.rotateAngleZ + (float) Math.toRadians(-11.5));
        
    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 5, neck2);
        this.faceTarget(f3, f4, 5, neck3);
        this.faceTarget(f3, f4, 5, head);

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        EntityPrehistoricFloraUmoonasaurus ee = (EntityPrehistoricFloraUmoonasaurus) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

