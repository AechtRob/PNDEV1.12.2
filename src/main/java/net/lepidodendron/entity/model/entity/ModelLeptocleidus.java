package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLeptocleidus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLeptocleidus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer eye3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer eye4;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
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
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;

    private ModelAnimator animator;

    public ModelLeptocleidus() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -6.5F, -14.0F, -6.0F, 13, 11, 12, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -12.75F, -5.0F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 24, -5.5F, -1.0F, -8.0F, 11, 10, 8, 0.0F, false));

        this.frontRightFlipper = new AdvancedModelRenderer(this);
        this.frontRightFlipper.setRotationPoint(-5.1139F, 6.268F, -5.497F);
        this.body.addChild(frontRightFlipper);
        this.setRotateAngle(frontRightFlipper, -0.0924F, 0.1245F, 1.4759F);
        this.frontRightFlipper.cubeList.add(new ModelBox(frontRightFlipper, 53, 71, -0.5F, -0.5F, -2.0F, 2, 6, 5, 0.0F, false));

        this.frontRightFlipper2 = new AdvancedModelRenderer(this);
        this.frontRightFlipper2.setRotationPoint(0.5F, 5.2768F, -1.7785F);
        this.frontRightFlipper.addChild(frontRightFlipper2);
        this.setRotateAngle(frontRightFlipper2, 0.1745F, 0.0F, 0.0F);
        this.frontRightFlipper2.cubeList.add(new ModelBox(frontRightFlipper2, 0, 59, -1.5F, -0.5F, -0.5F, 3, 7, 6, 0.0F, false));

        this.frontRightFlipper3 = new AdvancedModelRenderer(this);
        this.frontRightFlipper3.setRotationPoint(0.0F, 6.0239F, 0.286F);
        this.frontRightFlipper2.addChild(frontRightFlipper3);
        this.setRotateAngle(frontRightFlipper3, 0.1309F, 0.0F, 0.0F);
        this.frontRightFlipper3.cubeList.add(new ModelBox(frontRightFlipper3, 38, 71, -1.0F, 0.0F, -0.5F, 2, 6, 5, 0.0F, false));

        this.frontLeftFlipper = new AdvancedModelRenderer(this);
        this.frontLeftFlipper.setRotationPoint(5.1139F, 6.268F, -5.497F);
        this.body.addChild(frontLeftFlipper);
        this.setRotateAngle(frontLeftFlipper, -0.0924F, -0.1245F, -1.4759F);
        this.frontLeftFlipper.cubeList.add(new ModelBox(frontLeftFlipper, 53, 71, -1.5F, -0.5F, -2.0F, 2, 6, 5, 0.0F, true));

        this.frontLeftFlipper2 = new AdvancedModelRenderer(this);
        this.frontLeftFlipper2.setRotationPoint(-0.5F, 5.2768F, -1.7785F);
        this.frontLeftFlipper.addChild(frontLeftFlipper2);
        this.setRotateAngle(frontLeftFlipper2, 0.1745F, 0.0F, 0.0F);
        this.frontLeftFlipper2.cubeList.add(new ModelBox(frontLeftFlipper2, 0, 59, -1.5F, -0.5F, -0.5F, 3, 7, 6, 0.0F, true));

        this.frontLeftFlipper3 = new AdvancedModelRenderer(this);
        this.frontLeftFlipper3.setRotationPoint(0.0F, 6.0239F, 0.286F);
        this.frontLeftFlipper2.addChild(frontLeftFlipper3);
        this.setRotateAngle(frontLeftFlipper3, 0.1309F, 0.0F, 0.0F);
        this.frontLeftFlipper3.cubeList.add(new ModelBox(frontLeftFlipper3, 38, 71, -1.0F, 0.0F, -0.5F, 2, 6, 5, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.25F, -7.0F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 39, 41, -3.5F, -1.0F, -8.0F, 7, 8, 8, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.25F, -7.0F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 43, -3.0F, -1.0F, -8.0F, 6, 7, 8, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.25F, -7.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0436F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 29, 58, -2.5F, -1.0F, -6.0F, 5, 5, 6, -0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 4.1F, -6.0F);
        this.neck3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 51, 15, -1.5F, -1.1F, 0.0F, 4, 2, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 2.0232F, -5.0162F);
        this.neck3.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 73, 58, -2.5F, -1.025F, -6.0F, 5, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 70, 52, -3.0F, -1.025F, -3.0F, 6, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 35, 55, 2.15F, 0.475F, -5.0F, 0, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 35, 55, -2.15F, 0.475F, -5.0F, 0, 1, 1, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 83, 75, 1.15F, 0.475F, -9.0F, 0, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 83, 75, -1.15F, 0.475F, -9.0F, 0, 1, 3, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 83, 70, -1.5F, -0.025F, -9.0F, 3, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 29, 51, -1.0F, -0.525F, -7.0F, 2, 1, 2, -0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 29, 47, -1.0F, -0.025F, -11.0F, 2, 1, 2, -0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 32, 55, 0.65F, 0.475F, -11.0F, 0, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 32, 55, -0.65F, 0.475F, -11.0F, 0, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, -3.0211F, -0.9375F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3534F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 73, 64, -0.5F, 0.0F, -3.0F, 5, 2, 3, 0.001F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 76, 5, 0.0F, 0.0F, -6.0F, 4, 2, 3, 0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -0.327F, -9.1994F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.24F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 83, -0.5F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.025F, -11.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 76, 11, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.9845F, -0.4448F, -7.1582F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.1599F, 0.1558F, -0.2667F);


        this.eye3 = new AdvancedModelRenderer(this);
        this.eye3.setRotationPoint(0.9845F, -0.4448F, -7.1582F);
        this.head.addChild(eye3);
        this.setRotateAngle(eye3, 0.1599F, -0.1558F, 0.2667F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.475F, 0.675F, 0.0F);
        this.eye3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1897F, 0.1182F, -0.9795F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 72, 37, -0.5F, -0.95F, -1.0F, 1, 1, 2, 0.0F, true));

        this.eye4 = new AdvancedModelRenderer(this);
        this.eye4.setRotationPoint(-0.9845F, -0.4448F, -7.1582F);
        this.head.addChild(eye4);
        this.setRotateAngle(eye4, 0.1599F, 0.1558F, -0.2667F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.475F, 0.675F, 0.0F);
        this.eye4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1897F, -0.1182F, 0.9795F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 72, 37, -0.5F, -0.95F, -1.0F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 0.975F, -0.75F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 29, 43, -0.5F, 0.0F, -10.25F, 2, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 29, 55, 1.0F, -0.5F, -10.25F, 0, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 29, 55, 0.0F, -0.5F, -10.25F, 0, 1, 1, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 62, 83, -1.0F, 0.0F, -8.25F, 3, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 19, 64, 1.5F, -0.5F, -8.25F, 0, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 19, 64, -0.5F, -0.5F, -8.25F, 0, 1, 3, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 76, 0, -2.0F, 0.0F, -5.25F, 5, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 73, -2.5F, 0.0F, -2.25F, 6, 1, 3, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 19, 59, 2.5F, -0.5F, -4.25F, 0, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 19, 59, -1.5F, -0.5F, -4.25F, 0, 1, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 1.6946F, -4.3108F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0654F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 78, -0.5F, -1.0F, 2.0F, 4, 1, 3, -0.001F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 83, 0.0F, -1.0F, -1.0F, 3, 1, 3, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 1.6281F, -5.2637F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2138F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 75, 83, -1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -13.7257F, 5.4924F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 39, 24, -5.0F, 0.0F, 0.0F, 10, 10, 6, 0.0F, false));

        this.backRightFlipper = new AdvancedModelRenderer(this);
        this.backRightFlipper.setRotationPoint(-4.3248F, 7.3593F, 2.2437F);
        this.tail.addChild(backRightFlipper);
        this.setRotateAngle(backRightFlipper, 0.4312F, 0.1245F, 1.4759F);
        this.backRightFlipper.cubeList.add(new ModelBox(backRightFlipper, 72, 15, -0.5F, -0.5F, -2.0F, 2, 6, 5, 0.0F, false));

        this.backRightFlipper2 = new AdvancedModelRenderer(this);
        this.backRightFlipper2.setRotationPoint(0.5F, 5.2768F, -1.7785F);
        this.backRightFlipper.addChild(backRightFlipper2);
        this.setRotateAngle(backRightFlipper2, 0.1745F, 0.0F, 0.0F);
        this.backRightFlipper2.cubeList.add(new ModelBox(backRightFlipper2, 19, 70, -1.5F, -0.5F, -0.5F, 3, 7, 6, 0.0F, false));

        this.backRightFlipper3 = new AdvancedModelRenderer(this);
        this.backRightFlipper3.setRotationPoint(0.0F, 6.0239F, 0.286F);
        this.backRightFlipper2.addChild(backRightFlipper3);
        this.setRotateAngle(backRightFlipper3, 0.1309F, 0.0F, 0.0F);
        this.backRightFlipper3.cubeList.add(new ModelBox(backRightFlipper3, 68, 71, -1.0F, 0.0F, -0.5F, 2, 6, 5, 0.0F, false));

        this.backLeftFlipper = new AdvancedModelRenderer(this);
        this.backLeftFlipper.setRotationPoint(4.3248F, 7.3593F, 2.2437F);
        this.tail.addChild(backLeftFlipper);
        this.setRotateAngle(backLeftFlipper, 0.4312F, -0.1245F, -1.4759F);
        this.backLeftFlipper.cubeList.add(new ModelBox(backLeftFlipper, 72, 15, -1.5F, -0.5F, -2.0F, 2, 6, 5, 0.0F, true));

        this.backLeftFlipper2 = new AdvancedModelRenderer(this);
        this.backLeftFlipper2.setRotationPoint(-0.5F, 5.2768F, -1.7785F);
        this.backLeftFlipper.addChild(backLeftFlipper2);
        this.setRotateAngle(backLeftFlipper2, 0.1745F, 0.0F, 0.0F);
        this.backLeftFlipper2.cubeList.add(new ModelBox(backLeftFlipper2, 19, 70, -1.5F, -0.5F, -0.5F, 3, 7, 6, 0.0F, true));

        this.backLeftFlipper3 = new AdvancedModelRenderer(this);
        this.backLeftFlipper3.setRotationPoint(0.0F, 6.0239F, 0.286F);
        this.backLeftFlipper2.addChild(backLeftFlipper3);
        this.setRotateAngle(backLeftFlipper3, 0.1309F, 0.0F, 0.0F);
        this.backLeftFlipper3.cubeList.add(new ModelBox(backLeftFlipper3, 68, 71, -1.0F, 0.0F, -0.5F, 2, 6, 5, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 4.6F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 51, 0, -3.0F, -0.1305F, 0.9914F, 6, 8, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0305F, 6.2414F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 52, 58, -2.0F, 0.0F, 0.0F, 4, 6, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.4F, 5.25F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 72, 27, -1.5F, 0.0F, 0.0F, 3, 4, 5, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.175F, 4.25F);
        this.tail4.addChild(tail5);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -0.125F, 0.375F);
        this.tail5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3927F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 51, 83, -1.0F, -0.001F, -0.0436F, 1, 2, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tail5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 70, 41, -1.0F, -1.0F, 0.0F, 2, 3, 7, 0.0F, false));
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
        this.main.offsetY = -0.38F;
        this.main.offsetX = -0.03F;
        this.main.rotateAngleY = (float)Math.toRadians(205);
        this.main.rotateAngleX = (float)Math.toRadians(18);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 0.625F;
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
        EntityPrehistoricFloraLeptocleidus ee = (EntityPrehistoricFloraLeptocleidus) entitylivingbaseIn;

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
        EntityPrehistoricFloraLeptocleidus entity = (EntityPrehistoricFloraLeptocleidus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2 + (((tickAnim - 5) / 8) * (-0.75-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -0.75 + (((tickAnim - 13) / 4) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 1.25 + (((tickAnim - 5) / 8) * (-0.75-(1.25)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -0.75 + (((tickAnim - 13) / 4) * (-1.25-(-0.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -1.25 + (((tickAnim - 17) / 3) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 2.5 + (((tickAnim - 5) / 8) * (1.5-(2.5)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 1.5 + (((tickAnim - 13) / 4) * (1.75-(1.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 1.75 + (((tickAnim - 17) / 3) * (0-(1.75)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -7.5 + (((tickAnim - 5) / 8) * (-1.25-(-7.5)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -1.25 + (((tickAnim - 13) / 7) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 12.25 + (((tickAnim - 5) / 8) * (0-(12.25)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (8-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 8 + (((tickAnim - 17) / 3) * (0-(8)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
       
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLeptocleidus entity = (EntityPrehistoricFloraLeptocleidus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+10))*2.5), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967-100))*0.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967))*-0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967))*1);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.966+120))*2), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967-150))*2));



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -1.335+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+220))*-40 + (((tickAnim - 0) / 23) * (5.2823+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+250))*-40-(-1.335+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+220))*-40)));
            yy = -22.9686+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+150))*-20 + (((tickAnim - 0) / 23) * (-13.309+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+180))*-40-(-22.9686+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+150))*-20)));
            zz = -9.8906+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+70))*-20 + (((tickAnim - 0) / 23) * (-4.0531+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+50))*-20-(-9.8906+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+70))*-20)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 5.2823+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+250))*-40 + (((tickAnim - 23) / 37) * (-1.335+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+220))*-40-(5.2823+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+250))*-40)));
            yy = -13.309+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+180))*-40 + (((tickAnim - 23) / 37) * (-22.9686+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+150))*-20-(-13.309+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+180))*-40)));
            zz = -4.0531+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+50))*-20 + (((tickAnim - 23) / 37) * (-9.8906+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+70))*-20-(-4.0531+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+50))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightFlipper, frontRightFlipper.rotateAngleX + (float) Math.toRadians(xx), frontRightFlipper.rotateAngleY + (float) Math.toRadians(yy), frontRightFlipper.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(frontRightFlipper2, frontRightFlipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967+290))*10), frontRightFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967+220))*-5), frontRightFlipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967-10))*-15));


        this.setRotateAngle(frontRightFlipper3, frontRightFlipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967+250))*5), frontRightFlipper3.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967+320))*-5), frontRightFlipper3.rotateAngleZ + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967-50))*-15));



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 1.335+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+220))*-40 + (((tickAnim - 0) / 23) * (-7.2177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+250))*-60-(1.335+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+220))*-40)));
            yy = 29.4436+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+170))*20 + (((tickAnim - 0) / 23) * (24.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+180))*40-(29.4436+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+170))*20)));
            zz = 13.2656+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+50))*20 + (((tickAnim - 0) / 23) * (-4.0531+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+50))*60-(13.2656+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+50))*20)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = -7.2177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+250))*-60 + (((tickAnim - 23) / 37) * (13.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+200))*-40-(-7.2177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+250))*-60)));
            yy = 24.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+180))*40 + (((tickAnim - 23) / 37) * (29.4436+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+170))*20-(24.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+180))*40)));
            zz = -4.0531+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+50))*60 + (((tickAnim - 23) / 37) * (18.9656+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+30))*20-(-4.0531+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.973+50))*60)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftFlipper, frontLeftFlipper.rotateAngleX + (float) Math.toRadians(xx), frontLeftFlipper.rotateAngleY + (float) Math.toRadians(yy), frontLeftFlipper.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(frontLeftFlipper2, frontLeftFlipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967+290))*10), frontLeftFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967+220))*-5), frontLeftFlipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967-10))*15));


        this.setRotateAngle(frontLeftFlipper3, frontLeftFlipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967+250))*5), frontLeftFlipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967+320))*-5), frontLeftFlipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967-50))*15));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.966+160))*1), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967-200))*2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967+220))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967-280))*2));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*115/0.967+280))*1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967-320))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*117/0.972+260))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*117/0.972-320))*2));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967+60))*2), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967-60))*2));


        this.setRotateAngle(backRightFlipper, backRightFlipper.rotateAngleX + (float) Math.toRadians(-22.4796+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967+160))*-35), backRightFlipper.rotateAngleY + (float) Math.toRadians(-4.2115+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967+120))*-20), backRightFlipper.rotateAngleZ + (float) Math.toRadians(5.3393+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967-40))*-5));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+20))*10 + (((tickAnim - 0) / 20) * (12.9158+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+20))*10-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+20))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+120))*-20 + (((tickAnim - 0) / 20) * (-3.045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+120))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+120))*-20)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967-100))*-10 + (((tickAnim - 0) / 20) * (-1.7866+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967-100))*-10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967-100))*-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 12.9158+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+20))*10 + (((tickAnim - 20) / 40) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+20))*10-(12.9158+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+20))*10)));
            yy = -3.045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+120))*-20 + (((tickAnim - 20) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+120))*-20-(-3.045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+120))*-20)));
            zz = -1.7866+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967-100))*-10 + (((tickAnim - 20) / 40) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967-100))*-10-(-1.7866+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967-100))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightFlipper2, backRightFlipper2.rotateAngleX + (float) Math.toRadians(xx), backRightFlipper2.rotateAngleY + (float) Math.toRadians(yy), backRightFlipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967-70))*20 + (((tickAnim - 0) / 9) * (-10.5249+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833-70))*-20-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967-70))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+200))*5 + (((tickAnim - 0) / 9) * (1.7275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833+200))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+200))*5)));
            zz = 19.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+350))*15 + (((tickAnim - 0) / 9) * (-8.1543+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833+300))*-35-(19.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+350))*15)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -10.5249+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833-70))*-20 + (((tickAnim - 9) / 11) * (-24.296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-70))*20-(-10.5249+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833-70))*-20)));
            yy = 1.7275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833+200))*-5 + (((tickAnim - 9) / 11) * (2.4594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+200))*-5-(1.7275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833+200))*-5)));
            zz = -8.1543+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833+300))*-35 + (((tickAnim - 9) / 11) * (-14.7722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+300))*-15-(-8.1543+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833+300))*-35)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = -24.296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-70))*20 + (((tickAnim - 20) / 40) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967-70))*20-(-24.296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833-70))*20)));
            yy = 2.4594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+200))*-5 + (((tickAnim - 20) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+200))*5-(2.4594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+200))*-5)));
            zz = -14.7722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+300))*-15 + (((tickAnim - 20) / 40) * (19.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+350))*15-(-14.7722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.833+300))*-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightFlipper3, backRightFlipper3.rotateAngleX + (float) Math.toRadians(xx), backRightFlipper3.rotateAngleY + (float) Math.toRadians(yy), backRightFlipper3.rotateAngleZ + (float) Math.toRadians(zz));

        this.backRightFlipper3.rotationPointX = this.backRightFlipper3.rotationPointX + (float)(0);
        this.backRightFlipper3.rotationPointY = this.backRightFlipper3.rotationPointY - (float)(1);
        this.backRightFlipper3.rotationPointZ = this.backRightFlipper3.rotationPointZ + (float)(0);


        this.setRotateAngle(backLeftFlipper, backLeftFlipper.rotateAngleX + (float) Math.toRadians(-22.4796+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967+160))*-35), backLeftFlipper.rotateAngleY + (float) Math.toRadians(-4.2115+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967+100))*20), backLeftFlipper.rotateAngleZ + (float) Math.toRadians(-5.3393+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967-60))*5));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+20))*10 + (((tickAnim - 0) / 20) * (11.4592+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+20))*-10-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+20))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+120))*20 + (((tickAnim - 0) / 20) * (0.1577+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+120))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+120))*20)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967-100))*10 + (((tickAnim - 0) / 20) * (-1.6383+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967-100))*-10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967-100))*10)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 11.4592+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+20))*-10 + (((tickAnim - 20) / 40) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+20))*10-(11.4592+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+20))*-10)));
            yy = 0.1577+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+120))*20 + (((tickAnim - 20) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+120))*20-(0.1577+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+120))*20)));
            zz = -1.6383+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967-100))*-10 + (((tickAnim - 20) / 40) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967-100))*10-(-1.6383+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967-100))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftFlipper2, backLeftFlipper2.rotateAngleX + (float) Math.toRadians(xx), backLeftFlipper2.rotateAngleY + (float) Math.toRadians(yy), backLeftFlipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967-70))*20 + (((tickAnim - 0) / 21) * (0.4066+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833-70))*20-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967-70))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+200))*-5 + (((tickAnim - 0) / 21) * (3.2752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833+200))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+200))*-5)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+300))*15 + (((tickAnim - 0) / 21) * (8.7345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833+300))*10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+300))*15)));
        }
        else if (tickAnim >= 21 && tickAnim < 50) {
            xx = 0.4066+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833-70))*20 + (((tickAnim - 21) / 29) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833-70))*20-(0.4066+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833-70))*20)));
            yy = 3.2752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833+200))*-5 + (((tickAnim - 21) / 29) * (-4.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833+200))*-5-(3.2752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833+200))*-5)));
            zz = 8.7345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833+300))*10 + (((tickAnim - 21) / 29) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833+300))*15-(8.7345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833+300))*10)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833-70))*20 + (((tickAnim - 50) / 10) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967-70))*20-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833-70))*20)));
            yy = -4.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833+200))*-5 + (((tickAnim - 50) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+200))*-5-(-4.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833+200))*-5)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833+300))*15 + (((tickAnim - 50) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.967+300))*15-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*116/0.833+300))*15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftFlipper3, backLeftFlipper3.rotateAngleX + (float) Math.toRadians(xx), backLeftFlipper3.rotateAngleY + (float) Math.toRadians(yy), backLeftFlipper3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 50) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 50) / 10) * (1-(1)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftFlipper3.rotationPointX = this.backLeftFlipper3.rotationPointX + (float)(xx);
        this.backLeftFlipper3.rotationPointY = this.backLeftFlipper3.rotationPointY - (float)(yy);
        this.backLeftFlipper3.rotationPointZ = this.backLeftFlipper3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967+20))*1), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.968-20))*1), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.972-80))*2), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*116/0.967-120))*2), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));
       
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLeptocleidus entity = (EntityPrehistoricFloraLeptocleidus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+10))*3), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967-100))*0.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967))*-0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967))*1.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.966+120))*3), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967-150))*2));



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -1.335+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+220))*-40 + (((tickAnim - 0) / 12) * (5.3573+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.973+250))*-40-(-1.335+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+220))*-40)));
            yy = -22.9686+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+150))*-20 + (((tickAnim - 0) / 12) * (-50.4912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.973+140))*-60-(-22.9686+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+150))*-20)));
            zz = -13.2656+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+50))*-20 + (((tickAnim - 0) / 12) * (-4.0531+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.973+50))*-50-(-13.2656+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+50))*-20)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 5.3573+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.973+250))*-40 + (((tickAnim - 12) / 18) * (-1.335+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+220))*-40-(5.3573+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.973+250))*-40)));
            yy = -50.4912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.973+140))*-60 + (((tickAnim - 12) / 18) * (-24.3936+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+20))*-25-(-50.4912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.973+140))*-60)));
            zz = -4.0531+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.973+50))*-50 + (((tickAnim - 12) / 18) * (-13.2656+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+50))*-20-(-4.0531+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.973+50))*-50)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightFlipper, frontRightFlipper.rotateAngleX + (float) Math.toRadians(xx), frontRightFlipper.rotateAngleY + (float) Math.toRadians(yy), frontRightFlipper.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(frontRightFlipper2, frontRightFlipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967+290))*10), frontRightFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967+220))*-5), frontRightFlipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967-10))*-15));


        this.setRotateAngle(frontRightFlipper3, frontRightFlipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967+250))*5), frontRightFlipper3.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967+320))*-5), frontRightFlipper3.rotateAngleZ + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967-50))*-15));



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 1.335+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+220))*-40 + (((tickAnim - 0) / 12) * (5.4515+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.973+250))*-40-(1.335+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+220))*-40)));
            yy = 29.4436+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+170))*20 + (((tickAnim - 0) / 12) * (43.0588+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.973+140))*60-(29.4436+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+170))*20)));
            zz = 13.2656+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+50))*20 + (((tickAnim - 0) / 12) * (-4.042+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.973+50))*50-(13.2656+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+50))*20)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 5.4515+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.973+250))*-40 + (((tickAnim - 12) / 18) * (1.335+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+220))*-40-(5.4515+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.973+250))*-40)));
            yy = 43.0588+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.973+140))*60 + (((tickAnim - 12) / 18) * (26.1936+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+20))*20-(43.0588+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.973+140))*60)));
            zz = -4.042+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.973+50))*50 + (((tickAnim - 12) / 18) * (8.4156+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+90))*20-(-4.042+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.973+50))*50)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftFlipper, frontLeftFlipper.rotateAngleX + (float) Math.toRadians(xx), frontLeftFlipper.rotateAngleY + (float) Math.toRadians(yy), frontLeftFlipper.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(frontLeftFlipper2, frontLeftFlipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967+290))*10), frontLeftFlipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967+220))*-5), frontLeftFlipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967-10))*15));


        this.setRotateAngle(frontLeftFlipper3, frontLeftFlipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967+250))*5), frontLeftFlipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967+320))*-5), frontLeftFlipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967-50))*15));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.966+160))*2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967-200))*2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967+220))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967-280))*2));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967+280))*2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967-320))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*233/0.972+260))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*234/0.972-320))*2));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967+60))*1), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967-60))*2));


        this.setRotateAngle(backRightFlipper, backRightFlipper.rotateAngleX + (float) Math.toRadians(-22.4796+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967+160))*-35), backRightFlipper.rotateAngleY + (float) Math.toRadians(-4.2115+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967+120))*-20), backRightFlipper.rotateAngleZ + (float) Math.toRadians(5.3393+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967-40))*-5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+20))*10 + (((tickAnim - 0) / 10) * (5.6158+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.967+20))*10-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+20))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+120))*-20 + (((tickAnim - 0) / 10) * (6.505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.967+120))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+120))*-20)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967-100))*-10 + (((tickAnim - 0) / 10) * (0.4884+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.967-100))*-10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967-100))*-10)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 5.6158+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.967+20))*10 + (((tickAnim - 10) / 20) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+20))*10-(5.6158+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.967+20))*10)));
            yy = 6.505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.967+120))*-20 + (((tickAnim - 10) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+120))*-20-(6.505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.967+120))*-20)));
            zz = 0.4884+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.967-100))*-10 + (((tickAnim - 10) / 20) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967-100))*-10-(0.4884+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.967-100))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightFlipper2, backRightFlipper2.rotateAngleX + (float) Math.toRadians(xx), backRightFlipper2.rotateAngleY + (float) Math.toRadians(yy), backRightFlipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967-70))*20 + (((tickAnim - 0) / 10) * (16.479+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833-70))*20-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967-70))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+200))*5 + (((tickAnim - 0) / 10) * (2.4594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833+200))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+200))*5)));
            zz = 19.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+350))*15 + (((tickAnim - 0) / 10) * (-14.7722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833+300))*-15-(19.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+350))*15)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 16.479+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833-70))*20 + (((tickAnim - 10) / 20) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967-70))*20-(16.479+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833-70))*20)));
            yy = 2.4594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833+200))*-5 + (((tickAnim - 10) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+200))*5-(2.4594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833+200))*-5)));
            zz = -14.7722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833+300))*-15 + (((tickAnim - 10) / 20) * (19.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+350))*15-(-14.7722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833+300))*-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightFlipper3, backRightFlipper3.rotateAngleX + (float) Math.toRadians(xx), backRightFlipper3.rotateAngleY + (float) Math.toRadians(yy), backRightFlipper3.rotateAngleZ + (float) Math.toRadians(zz));

        this.backRightFlipper3.rotationPointX = this.backRightFlipper3.rotationPointX + (float)(0);
        this.backRightFlipper3.rotationPointY = this.backRightFlipper3.rotationPointY - (float)(1);
        this.backRightFlipper3.rotationPointZ = this.backRightFlipper3.rotationPointZ + (float)(0);


        this.setRotateAngle(backLeftFlipper, backLeftFlipper.rotateAngleX + (float) Math.toRadians(-22.4796+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967+160))*-35), backLeftFlipper.rotateAngleY + (float) Math.toRadians(-4.2115+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967+100))*20), backLeftFlipper.rotateAngleZ + (float) Math.toRadians(-5.3393+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967-60))*5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+20))*10 + (((tickAnim - 0) / 10) * (24.6592+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.967+20))*-10-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+20))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+120))*20 + (((tickAnim - 0) / 10) * (-10.7173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.967+120))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+120))*20)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967-100))*10 + (((tickAnim - 0) / 10) * (6.0617+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.967-100))*-10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967-100))*10)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 24.6592+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.967+20))*-10 + (((tickAnim - 10) / 20) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+20))*10-(24.6592+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.967+20))*-10)));
            yy = -10.7173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.967+120))*20 + (((tickAnim - 10) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+120))*20-(-10.7173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.967+120))*20)));
            zz = 6.0617+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.967-100))*-10 + (((tickAnim - 10) / 20) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967-100))*10-(6.0617+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.967-100))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftFlipper2, backLeftFlipper2.rotateAngleX + (float) Math.toRadians(xx), backLeftFlipper2.rotateAngleY + (float) Math.toRadians(yy), backLeftFlipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967-70))*20 + (((tickAnim - 0) / 11) * (0.4066+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833-70))*20-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967-70))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+200))*-5 + (((tickAnim - 0) / 11) * (3.2752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833+200))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+200))*-5)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+300))*15 + (((tickAnim - 0) / 11) * (8.7345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833+300))*10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+300))*15)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0.4066+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833-70))*20 + (((tickAnim - 11) / 14) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833-70))*20-(0.4066+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833-70))*20)));
            yy = 3.2752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833+200))*-5 + (((tickAnim - 11) / 14) * (-4.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833+200))*-5-(3.2752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833+200))*-5)));
            zz = 8.7345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833+300))*10 + (((tickAnim - 11) / 14) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833+300))*15-(8.7345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833+300))*10)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833-70))*20 + (((tickAnim - 25) / 5) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967-70))*20-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833-70))*20)));
            yy = -4.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833+200))*-5 + (((tickAnim - 25) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+200))*-5-(-4.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833+200))*-5)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833+300))*15 + (((tickAnim - 25) / 5) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*232/0.967+300))*15-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.833+300))*15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftFlipper3, backLeftFlipper3.rotateAngleX + (float) Math.toRadians(xx), backLeftFlipper3.rotateAngleY + (float) Math.toRadians(yy), backLeftFlipper3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 25) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 25) / 5) * (1-(1)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftFlipper3.rotationPointX = this.backLeftFlipper3.rotationPointX + (float)(xx);
        this.backLeftFlipper3.rotationPointY = this.backLeftFlipper3.rotationPointY - (float)(yy);
        this.backLeftFlipper3.rotationPointZ = this.backLeftFlipper3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967+20))*3), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.968-20))*3), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.972-80))*3), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*232/0.967-120))*3), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));
        
    }
    public void animBeached(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLeptocleidus entity = (EntityPrehistoricFloraLeptocleidus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(-3.4);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);
        this.main.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*0.01),(float)1,(float)1);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-0.01),(float)1,(float)1);



        if (tickAnim >= 0 && tickAnim < 28) {
            xx = -10.95308 + (((tickAnim - 0) / 28) * (-11.03561-(-10.95308)));
            yy = -0.48664 + (((tickAnim - 0) / 28) * (-0.69698-(-0.48664)));
            zz = -1.6932 + (((tickAnim - 0) / 28) * (-2.4179+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.5-(-1.6932)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = -11.03561 + (((tickAnim - 28) / 32) * (-10.95308-(-11.03561)));
            yy = -0.69698 + (((tickAnim - 28) / 32) * (-0.48664-(-0.69698)));
            zz = -2.4179+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.5 + (((tickAnim - 28) / 32) * (-1.6932-(-2.4179+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightFlipper, frontRightFlipper.rotateAngleX + (float) Math.toRadians(xx), frontRightFlipper.rotateAngleY + (float) Math.toRadians(yy), frontRightFlipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 5.5 + (((tickAnim - 0) / 28) * (5.01356-(5.5)));
            yy = -4.25 + (((tickAnim - 0) / 28) * (-5.76428-(-4.25)));
            zz = 0 + (((tickAnim - 0) / 28) * (2.8185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 5.01356 + (((tickAnim - 28) / 32) * (5.5-(5.01356)));
            yy = -5.76428 + (((tickAnim - 28) / 32) * (-4.25-(-5.76428)));
            zz = 2.8185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 28) / 32) * (0-(2.8185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightFlipper2, frontRightFlipper2.rotateAngleX + (float) Math.toRadians(xx), frontRightFlipper2.rotateAngleY + (float) Math.toRadians(yy), frontRightFlipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-0.19641-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0.51324-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-2.69542-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = -0.19641 + (((tickAnim - 28) / 32) * (0-(-0.19641)));
            yy = 0.51324 + (((tickAnim - 28) / 32) * (0-(0.51324)));
            zz = -2.69542 + (((tickAnim - 28) / 32) * (0-(-2.69542)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightFlipper3, frontRightFlipper3.rotateAngleX + (float) Math.toRadians(xx), frontRightFlipper3.rotateAngleY + (float) Math.toRadians(yy), frontRightFlipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 5.25976 + (((tickAnim - 0) / 23) * (5.25716-(5.25976)));
            yy = -3.4853 + (((tickAnim - 0) / 23) * (-3.4874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5-(-3.4853)));
            zz = -0.32065 + (((tickAnim - 0) / 23) * (-0.27475-(-0.32065)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 5.25716 + (((tickAnim - 23) / 37) * (5.25976-(5.25716)));
            yy = -3.4874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5 + (((tickAnim - 23) / 37) * (-3.4853-(-3.4874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5)));
            zz = -0.27475 + (((tickAnim - 23) / 37) * (-0.32065-(-0.27475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = -6.5 + (((tickAnim - 0) / 23) * (-6-(-6.5)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            yy = -6 + (((tickAnim - 23) / 37) * (-6.5-(-6)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-2.75), neck3.rotateAngleY + (float) Math.toRadians(21.25), neck3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -6 + (((tickAnim - 0) / 15) * (-9-(-6)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -9 + (((tickAnim - 15) / 17) * (-6-(-9)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 48) {
            xx = -6 + (((tickAnim - 32) / 16) * (-9-(-6)));
            yy = 0 + (((tickAnim - 32) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 16) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -9 + (((tickAnim - 48) / 12) * (-6-(-9)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 3.25 + (((tickAnim - 15) / 17) * (0-(3.25)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 32) / 16) * (3.25-(0)));
            yy = 0 + (((tickAnim - 32) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 16) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 3.25 + (((tickAnim - 48) / 12) * (0-(3.25)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.tail.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-0.01),(float)1,(float)1);


        this.setRotateAngle(backRightFlipper, backRightFlipper.rotateAngleX + (float) Math.toRadians(0), backRightFlipper.rotateAngleY + (float) Math.toRadians(0), backRightFlipper.rotateAngleZ + (float) Math.toRadians(3.25));


        this.setRotateAngle(backRightFlipper2, backRightFlipper2.rotateAngleX + (float) Math.toRadians(0.3208), backRightFlipper2.rotateAngleY + (float) Math.toRadians(-6.5148), backRightFlipper2.rotateAngleZ + (float) Math.toRadians(-2.7258));


        this.setRotateAngle(backRightFlipper3, backRightFlipper3.rotateAngleX + (float) Math.toRadians(0), backRightFlipper3.rotateAngleY + (float) Math.toRadians(0), backRightFlipper3.rotateAngleZ + (float) Math.toRadians(7));



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -12.5 + (((tickAnim - 0) / 30) * (-11.25-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -11.25 + (((tickAnim - 30) / 30) * (-12.5-(-11.25)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftFlipper, backLeftFlipper.rotateAngleX + (float) Math.toRadians(xx), backLeftFlipper.rotateAngleY + (float) Math.toRadians(yy), backLeftFlipper.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(backLeftFlipper2, backLeftFlipper2.rotateAngleX + (float) Math.toRadians(-0.18883), backLeftFlipper2.rotateAngleY + (float) Math.toRadians(4.22316), backLeftFlipper2.rotateAngleZ + (float) Math.toRadians(-2.71557));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-9.5), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-3.25), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(3.5), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(8.5), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));

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

        EntityPrehistoricFloraLeptocleidus ee = (EntityPrehistoricFloraLeptocleidus) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

