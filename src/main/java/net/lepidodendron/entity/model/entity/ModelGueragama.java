package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGueragama;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelGueragama extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3w;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3w;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neckpouch;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;

    private ModelAnimator animator;

    public ModelGueragama() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 21.75F, 5.5F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, 1.15F, 0.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.096F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 15, -3.0F, -2.0F, -1.0F, 4, 1, 4, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 1.8F, 0.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 9, -3.0F, -2.0F, -1.0F, 4, 2, 4, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.75F, 0.9F, 1.7F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.1309F, -0.6109F, -0.2356F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 10, 29, -2.5F, -0.5F, -1.0F, 3, 1, 2, 0.01F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-2.5F, 0.0F, -0.75F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 1.1781F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 30, 11, -2.75F, -0.5F, 0.5F, 3, 1, 1, -0.01F, false));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 30, 13, -2.75F, -0.5F, 0.0F, 3, 1, 1, 0.0F, false));

        this.rightLeg3w = new AdvancedModelRenderer(this);
        this.rightLeg3w.setRotationPoint(-2.75F, 0.225F, 0.75F);
        this.rightLeg2.addChild(rightLeg3w);


        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg3w.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.1091F, -0.829F, 0.3927F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 16, 15, -3.25F, 0.0F, -2.0F, 4, 0, 4, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.75F, 0.9F, 1.7F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.1309F, 0.6109F, 0.2356F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 10, 29, -0.5F, -0.5F, -1.0F, 3, 1, 2, 0.01F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(2.5F, 0.0F, -0.75F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, -1.1781F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 30, 11, -0.25F, -0.5F, 0.5F, 3, 1, 1, -0.01F, true));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 30, 13, -0.25F, -0.5F, 0.0F, 3, 1, 1, 0.0F, true));

        this.leftLeg3w = new AdvancedModelRenderer(this);
        this.leftLeg3w.setRotationPoint(2.75F, 0.225F, 0.75F);
        this.leftLeg2.addChild(leftLeg3w);


        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg3w.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.1091F, 0.829F, -0.3927F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 16, 15, -0.75F, 0.0F, -2.0F, 4, 0, 4, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.05F, 3.1F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 16, 9, -1.5F, -0.5F, -0.35F, 3, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 0, -1.0F, 0.25F, -0.35F, 2, 1, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 24, -1.0F, -0.25F, -0.35F, 2, 1, 4, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2182F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 24, 24, -0.5F, 0.0F, -0.35F, 1, 1, 4, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.25F, -0.25F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -0.75F, -5.75F, 5, 3, 6, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.25F, -5.75F);
        this.body.addChild(chest);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 1.5F, -1.5F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 20, -3.0F, -2.5F, -1.0F, 4, 1, 3, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 19, -3.0F, -2.0F, -1.0F, 4, 2, 3, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.0F, 1.15F, -1.8F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.1745F, 0.6109F, -0.5236F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 30, 22, -1.5F, -0.5F, -0.5F, 2, 1, 1, 0.01F, false));
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 32, 15, -1.5F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-1.5F, 0.0F, 0.25F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.3054F, -1.6581F, 0.1309F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 32, 17, -1.75F, -0.5F, -0.5F, 2, 1, 1, -0.01F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-1.75F, 0.25F, 0.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.0F, 0.0698F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 22, 5, -2.25F, 0.0F, -1.5F, 3, 0, 3, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(2.0F, 1.15F, -1.8F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.1745F, -0.6109F, 0.5236F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 30, 22, -0.5F, -0.5F, -0.5F, 2, 1, 1, 0.01F, true));
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 32, 15, -0.5F, -0.5F, 0.0F, 2, 1, 1, 0.0F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(1.5F, 0.0F, 0.25F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.3054F, 1.6581F, -0.1309F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 32, 17, -0.25F, -0.5F, -0.5F, 2, 1, 1, -0.01F, true));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(1.75F, 0.25F, 0.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, 0.0F, -0.0698F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 22, 5, -0.75F, 0.0F, -1.5F, 3, 0, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.25F, -2.5F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.1745F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 12, 24, -1.5F, -0.9F, -2.1F, 3, 2, 3, 0.0F, false));

        this.neckpouch = new AdvancedModelRenderer(this);
        this.neckpouch.setRotationPoint(0.0F, 1.1F, -2.5F);
        this.neck.addChild(neckpouch);
        this.setRotateAngle(neckpouch, -0.1745F, 0.0F, 0.0F);
        this.neckpouch.cubeList.add(new ModelBox(neckpouch, 0, 29, -1.0F, -1.0F, 0.0F, 2, 1, 3, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1F, -1.75F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 20, 29, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.0908F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 32, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.025F, -2.1F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0393F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 8, -1.5F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.525F, 0.5F, -3.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.5236F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 33, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.025F, 0.5F, -2.15F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.2182F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 19, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.025F, 0.5F, -2.15F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2182F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 19, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.525F, 0.5F, -3.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.5236F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 33, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.2F, -0.225F, -1.5F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.0F, -0.1745F, 0.0873F);
        this.eyeright.cubeList.add(new ModelBox(eyeright, 4, 33, -1.0F, -0.75F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.2F, -0.225F, -1.5F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.0F, 0.1745F, -0.0873F);
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 4, 33, 0.0F, -0.75F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 29, -0.5F, -0.5F, -2.9F, 1, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.5F, -2.9F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.5105F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 33, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 0.5F, -2.05F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.2007F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 32, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.02F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 0.5F, -2.05F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.2007F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 32, 0.0F, -1.0F, 0.0F, 1, 1, 2, -0.02F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.5F, -2.9F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.5105F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 33, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -1.70F;
        this.hips.offsetX = 0.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(130);
        this.hips.rotateAngleX = (float)Math.toRadians(10);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 2.8F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hips, 0.6F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.hips.offsetY = 0.122F;
        this.hips.render(0.01F);
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

        EntityPrehistoricFloraGueragama proteros = (EntityPrehistoricFloraGueragama) e;

        this.faceTarget(f3, f4, 10, neck);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
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
        EntityPrehistoricFloraGueragama ee = (EntityPrehistoricFloraGueragama) entitylivingbaseIn;

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
        EntityPrehistoricFloraGueragama entity = (EntityPrehistoricFloraGueragama) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-14.94912-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (4.78919-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-22.16263-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -14.94912 + (((tickAnim - 8) / 7) * (0-(-14.94912)));
            yy = 4.78919 + (((tickAnim - 8) / 7) * (18.5-(4.78919)));
            zz = -22.16263 + (((tickAnim - 8) / 7) * (0-(-22.16263)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (10.25-(0)));
            yy = 18.5 + (((tickAnim - 15) / 10) * (-58.25-(18.5)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 10.25 + (((tickAnim - 25) / 5) * (-14.94912-(10.25)));
            yy = -58.25 + (((tickAnim - 25) / 5) * (4.78919-(-58.25)));
            zz = 0 + (((tickAnim - 25) / 5) * (-22.16263-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -14.94912 + (((tickAnim - 30) / 5) * (0-(-14.94912)));
            yy = 4.78919 + (((tickAnim - 30) / 5) * (18.5-(4.78919)));
            zz = -22.16263 + (((tickAnim - 30) / 5) * (0-(-22.16263)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 18.5 + (((tickAnim - 35) / 15) * (0-(18.5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (11.625-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (14.125-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 11.625 + (((tickAnim - 8) / 7) * (12.75-(11.625)));
            yy = 14.125 + (((tickAnim - 8) / 7) * (28.25-(14.125)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 12.75 + (((tickAnim - 15) / 10) * (13.25-(12.75)));
            yy = 28.25 + (((tickAnim - 15) / 10) * (0-(28.25)));
            zz = 0 + (((tickAnim - 15) / 10) * (9.5-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 13.25 + (((tickAnim - 25) / 5) * (11.625-(13.25)));
            yy = 0 + (((tickAnim - 25) / 5) * (14.125-(0)));
            zz = 9.5 + (((tickAnim - 25) / 5) * (0-(9.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 11.625 + (((tickAnim - 30) / 5) * (12.75-(11.625)));
            yy = 14.125 + (((tickAnim - 30) / 5) * (28.25-(14.125)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12.75 + (((tickAnim - 35) / 15) * (0-(12.75)));
            yy = 28.25 + (((tickAnim - 35) / 15) * (0-(28.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (43.15574-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (6.11688-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (50.11266-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 43.15574 + (((tickAnim - 8) / 7) * (0-(43.15574)));
            yy = 6.11688 + (((tickAnim - 8) / 7) * (28-(6.11688)));
            zz = 50.11266 + (((tickAnim - 8) / 7) * (0-(50.11266)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-130.30192-(0)));
            yy = 28 + (((tickAnim - 15) / 5) * (10.66186-(28)));
            zz = 0 + (((tickAnim - 15) / 5) * (-135.54107-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -130.30192 + (((tickAnim - 20) / 5) * (0-(-130.30192)));
            yy = 10.66186 + (((tickAnim - 20) / 5) * (0-(10.66186)));
            zz = -135.54107 + (((tickAnim - 20) / 5) * (0-(-135.54107)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (43.15574-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (6.11688-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (50.11266-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 43.15574 + (((tickAnim - 30) / 5) * (0-(43.15574)));
            yy = 6.11688 + (((tickAnim - 30) / 5) * (28-(6.11688)));
            zz = 50.11266 + (((tickAnim - 30) / 5) * (0-(50.11266)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (-5.07946-(0)));
            yy = 28 + (((tickAnim - 35) / 8) * (11.98547-(28)));
            zz = 0 + (((tickAnim - 35) / 8) * (-5.88086-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -5.07946 + (((tickAnim - 43) / 7) * (0-(-5.07946)));
            yy = 11.98547 + (((tickAnim - 43) / 7) * (0-(11.98547)));
            zz = -5.88086 + (((tickAnim - 43) / 7) * (0-(-5.88086)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.275-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.275 + (((tickAnim - 8) / 7) * (0-(-0.275)));
            yy = 0.175 + (((tickAnim - 8) / 7) * (0-(0.175)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (-0.275-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0.175-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -0.275 + (((tickAnim - 30) / 5) * (0-(-0.275)));
            yy = 0.175 + (((tickAnim - 30) / 5) * (0-(0.175)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
        EntityPrehistoricFloraGueragama entity = (EntityPrehistoricFloraGueragama) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 12.25 + (((tickAnim - 5) / 5) * (0-(12.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.15 + (((tickAnim - 5) / 5) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -12 + (((tickAnim - 5) / 5) * (0-(-12)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.05 + (((tickAnim - 5) / 5) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 34.5 + (((tickAnim - 5) / 3) * (0-(34.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGueragama entity = (EntityPrehistoricFloraGueragama) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 4.99159 + (((tickAnim - 0) / 5) * (1.55178-(4.99159)));
            yy = 78.12002 + (((tickAnim - 0) / 5) * (43.94991-(78.12002)));
            zz = 2.17446 + (((tickAnim - 0) / 5) * (60.0204+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25-(2.17446)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.55178 + (((tickAnim - 5) / 5) * (14.25-(1.55178)));
            yy = 43.94991 + (((tickAnim - 5) / 5) * (-2.75-(43.94991)));
            zz = 60.0204+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25 + (((tickAnim - 5) / 5) * (0-(60.0204+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 14.25 + (((tickAnim - 10) / 10) * (4.99159-(14.25)));
            yy = -2.75 + (((tickAnim - 10) / 10) * (78.12002-(-2.75)));
            zz = 0 + (((tickAnim - 10) / 10) * (2.17446-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -15.24607 + (((tickAnim - 0) / 5) * (6.12696-(-15.24607)));
            yy = -12.52042 + (((tickAnim - 0) / 5) * (-29.38521-(-12.52042)));
            zz = -15.41216 + (((tickAnim - 0) / 5) * (-7.70608-(-15.41216)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 6.12696 + (((tickAnim - 5) / 5) * (0-(6.12696)));
            yy = -29.38521 + (((tickAnim - 5) / 5) * (-46.25-(-29.38521)));
            zz = -7.70608 + (((tickAnim - 5) / 5) * (0-(-7.70608)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-15.24607-(0)));
            yy = -46.25 + (((tickAnim - 10) / 10) * (-12.52042-(-46.25)));
            zz = 0 + (((tickAnim - 10) / 10) * (-15.41216-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(0);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(0);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 14.25 + (((tickAnim - 0) / 10) * (4.99159-(14.25)));
            yy = 2.75 + (((tickAnim - 0) / 10) * (-78.12-(2.75)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.1745-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 4.99159 + (((tickAnim - 10) / 5) * (-2.31224-(4.99159)));
            yy = -78.12 + (((tickAnim - 10) / 5) * (-39.37045-(-78.12)));
            zz = -2.1745 + (((tickAnim - 10) / 5) * (-27.611+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25-(-2.1745)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.31224 + (((tickAnim - 15) / 5) * (14.25-(-2.31224)));
            yy = -39.37045 + (((tickAnim - 15) / 5) * (2.75-(-39.37045)));
            zz = -27.611+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25 + (((tickAnim - 15) / 5) * (0-(-27.611+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15.24607-(0)));
            yy = 46.25 + (((tickAnim - 0) / 10) * (12.5204-(46.25)));
            zz = 0 + (((tickAnim - 0) / 10) * (15.4122-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -15.24607 + (((tickAnim - 10) / 5) * (6.12696-(-15.24607)));
            yy = 12.5204 + (((tickAnim - 10) / 5) * (29.3852-(12.5204)));
            zz = 15.4122 + (((tickAnim - 10) / 5) * (7.7061-(15.4122)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 6.12696 + (((tickAnim - 15) / 5) * (0-(6.12696)));
            yy = 29.3852 + (((tickAnim - 15) / 5) * (46.25-(29.3852)));
            zz = 7.7061 + (((tickAnim - 15) / 5) * (0-(7.7061)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 16.79241 + (((tickAnim - 0) / 10) * (112.6134-(16.79241)));
            yy = -50.5459 + (((tickAnim - 0) / 10) * (17.3026-(-50.5459)));
            zz = 1.82205 + (((tickAnim - 0) / 10) * (89.5007-(1.82205)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 112.6134 + (((tickAnim - 10) / 4) * (70.72459-(112.6134)));
            yy = 17.3026 + (((tickAnim - 10) / 4) * (-7.6165-(17.3026)));
            zz = 89.5007 + (((tickAnim - 10) / 4) * (59.2003-(89.5007)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 70.72459 + (((tickAnim - 14) / 6) * (16.79241-(70.72459)));
            yy = -7.6165 + (((tickAnim - 14) / 6) * (-50.5459-(-7.6165)));
            zz = 59.2003 + (((tickAnim - 14) / 6) * (1.82205-(59.2003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0.15 + (((tickAnim - 0) / 10) * (0.325-(0.15)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.325 + (((tickAnim - 10) / 10) * (0.15-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm1.rotationPointX = this.rightArm1.rotationPointX + (float)(xx);
        this.rightArm1.rotationPointY = this.rightArm1.rotationPointY - (float)(yy);
        this.rightArm1.rotationPointZ = this.rightArm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -4.2495 + (((tickAnim - 0) / 10) * (16.69409-(-4.2495)));
            yy = 23.602 + (((tickAnim - 0) / 10) * (57.6578-(23.602)));
            zz = 4.48875 + (((tickAnim - 0) / 10) * (-23.4904-(4.48875)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 16.69409 + (((tickAnim - 10) / 4) * (-8.18281-(16.69409)));
            yy = 57.6578 + (((tickAnim - 10) / 4) * (59.7599-(57.6578)));
            zz = -23.4904 + (((tickAnim - 10) / 4) * (-10.6441-(-23.4904)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -8.18281 + (((tickAnim - 14) / 4) * (-45.54309-(-8.18281)));
            yy = 59.7599 + (((tickAnim - 14) / 4) * (40.6795-(59.7599)));
            zz = -10.6441 + (((tickAnim - 14) / 4) * (53.7423-(-10.6441)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -45.54309 + (((tickAnim - 18) / 2) * (-4.2495-(-45.54309)));
            yy = 40.6795 + (((tickAnim - 18) / 2) * (23.602-(40.6795)));
            zz = 53.7423 + (((tickAnim - 18) / 2) * (4.48875-(53.7423)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 112.6134 + (((tickAnim - 0) / 4) * (70.72459-(112.6134)));
            yy = -17.30263 + (((tickAnim - 0) / 4) * (7.61649-(-17.30263)));
            zz = -89.50069 + (((tickAnim - 0) / 4) * (-59.20026-(-89.50069)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 70.72459 + (((tickAnim - 4) / 6) * (16.79241-(70.72459)));
            yy = 7.61649 + (((tickAnim - 4) / 6) * (50.5459-(7.61649)));
            zz = -59.20026 + (((tickAnim - 4) / 6) * (1.82205-(-59.20026)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 16.79241 + (((tickAnim - 10) / 10) * (112.6134-(16.79241)));
            yy = 50.5459 + (((tickAnim - 10) / 10) * (-17.30263-(50.5459)));
            zz = 1.82205 + (((tickAnim - 10) / 10) * (-89.50069-(1.82205)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0.325 + (((tickAnim - 0) / 10) * (0.15-(0.325)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.15 + (((tickAnim - 10) / 10) * (0.325-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm1.rotationPointX = this.leftArm1.rotationPointX + (float)(xx);
        this.leftArm1.rotationPointY = this.leftArm1.rotationPointY - (float)(yy);
        this.leftArm1.rotationPointZ = this.leftArm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 16.69409 + (((tickAnim - 0) / 4) * (-8.18281-(16.69409)));
            yy = -57.65782 + (((tickAnim - 0) / 4) * (-59.75992-(-57.65782)));
            zz = 23.49041 + (((tickAnim - 0) / 4) * (-10.64408-(23.49041)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -8.18281 + (((tickAnim - 4) / 4) * (-45.54309-(-8.18281)));
            yy = -59.75992 + (((tickAnim - 4) / 4) * (-40.67946-(-59.75992)));
            zz = -10.64408 + (((tickAnim - 4) / 4) * (-53.74225-(-10.64408)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -45.54309 + (((tickAnim - 8) / 2) * (-4.2495-(-45.54309)));
            yy = -40.67946 + (((tickAnim - 8) / 2) * (-23.602-(-40.67946)));
            zz = -53.74225 + (((tickAnim - 8) / 2) * (-4.4887-(-53.74225)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -4.2495 + (((tickAnim - 10) / 10) * (16.69409-(-4.2495)));
            yy = -23.602 + (((tickAnim - 10) / 10) * (-57.65782-(-23.602)));
            zz = -4.4887 + (((tickAnim - 10) / 10) * (23.49041-(-4.4887)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 27.56765 + (((tickAnim - 0) / 5) * (26.21576-(27.56765)));
            yy = 42.88064 + (((tickAnim - 0) / 5) * (3.81553-(42.88064)));
            zz = 29.61518 + (((tickAnim - 0) / 5) * (59.16576-(29.61518)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 26.21576 + (((tickAnim - 5) / 3) * (-13.89717-(26.21576)));
            yy = 3.81553 + (((tickAnim - 5) / 3) * (-0.27701-(3.81553)));
            zz = 59.16576 + (((tickAnim - 5) / 3) * (18.54095-(59.16576)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -13.89717 + (((tickAnim - 8) / 1) * (-11.72608-(-13.89717)));
            yy = -0.27701 + (((tickAnim - 8) / 1) * (-1.62354-(-0.27701)));
            zz = 18.54095 + (((tickAnim - 8) / 1) * (-2.67565-(18.54095)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -11.72608 + (((tickAnim - 9) / 1) * (4.25-(-11.72608)));
            yy = -1.62354 + (((tickAnim - 9) / 1) * (0-(-1.62354)));
            zz = -2.67565 + (((tickAnim - 9) / 1) * (0-(-2.67565)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 4.25 + (((tickAnim - 10) / 3) * (-23.78989-(4.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (-2.42085-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-25.90199-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -23.78989 + (((tickAnim - 13) / 2) * (-51.77126-(-23.78989)));
            yy = -2.42085 + (((tickAnim - 13) / 2) * (17.59912-(-2.42085)));
            zz = -25.90199 + (((tickAnim - 13) / 2) * (-57.24688-(-25.90199)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -51.77126 + (((tickAnim - 15) / 5) * (27.56765-(-51.77126)));
            yy = 17.59912 + (((tickAnim - 15) / 5) * (42.88064-(17.59912)));
            zz = -57.24688 + (((tickAnim - 15) / 5) * (29.61518-(-57.24688)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.3 + (((tickAnim - 0) / 5) * (-0.15-(-0.3)));
            yy = 0.375 + (((tickAnim - 0) / 5) * (-0.01-(0.375)));
            zz = 0.175 + (((tickAnim - 0) / 5) * (0.09-(0.175)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.15 + (((tickAnim - 5) / 3) * (-0.07-(-0.15)));
            yy = -0.01 + (((tickAnim - 5) / 3) * (0.25-(-0.01)));
            zz = 0.09 + (((tickAnim - 5) / 3) * (0.05-(0.09)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.07 + (((tickAnim - 8) / 2) * (0-(-0.07)));
            yy = 0.25 + (((tickAnim - 8) / 2) * (0.1-(0.25)));
            zz = 0.05 + (((tickAnim - 8) / 2) * (0-(0.05)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-0.4-(0)));
            yy = 0.1 + (((tickAnim - 10) / 3) * (0.395-(0.1)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.14-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.4 + (((tickAnim - 13) / 2) * (-0.025-(-0.4)));
            yy = 0.395 + (((tickAnim - 13) / 2) * (0.265-(0.395)));
            zz = -0.14 + (((tickAnim - 13) / 2) * (0.065-(-0.14)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.025 + (((tickAnim - 15) / 5) * (-0.3-(-0.025)));
            yy = 0.265 + (((tickAnim - 15) / 5) * (0.375-(0.265)));
            zz = 0.065 + (((tickAnim - 15) / 5) * (0.175-(0.065)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-8), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.5);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+120))*-0.2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-0.2);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-3), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*5), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*8), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-40))*-8), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-23.78989-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-2.42085-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (25.902-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -23.78989 + (((tickAnim - 3) / 2) * (-51.77126-(-23.78989)));
            yy = -2.42085 + (((tickAnim - 3) / 2) * (-17.5991-(-2.42085)));
            zz = 25.902 + (((tickAnim - 3) / 2) * (57.2469-(25.902)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -51.77126 + (((tickAnim - 5) / 5) * (-3.18235-(-51.77126)));
            yy = -17.5991 + (((tickAnim - 5) / 5) * (-42.8806-(-17.5991)));
            zz = 57.2469 + (((tickAnim - 5) / 5) * (-29.6152-(57.2469)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -3.18235 + (((tickAnim - 10) / 5) * (26.21576-(-3.18235)));
            yy = -42.8806 + (((tickAnim - 10) / 5) * (-3.8155-(-42.8806)));
            zz = -29.6152 + (((tickAnim - 10) / 5) * (-59.1658-(-29.6152)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 26.21576 + (((tickAnim - 15) / 3) * (-13.89717-(26.21576)));
            yy = -3.8155 + (((tickAnim - 15) / 3) * (0.277-(-3.8155)));
            zz = -59.1658 + (((tickAnim - 15) / 3) * (-18.5409-(-59.1658)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -13.89717 + (((tickAnim - 18) / 1) * (-11.72608-(-13.89717)));
            yy = 0.277 + (((tickAnim - 18) / 1) * (-1.62354-(0.277)));
            zz = -18.5409 + (((tickAnim - 18) / 1) * (-2.67565-(-18.5409)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -11.72608 + (((tickAnim - 19) / 1) * (0-(-11.72608)));
            yy = -1.62354 + (((tickAnim - 19) / 1) * (0-(-1.62354)));
            zz = -2.67565 + (((tickAnim - 19) / 1) * (0-(-2.67565)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.05-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.445-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.135-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.05 + (((tickAnim - 3) / 2) * (0.1-(0.05)));
            yy = 0.445 + (((tickAnim - 3) / 2) * (0.24-(0.445)));
            zz = 0.135 + (((tickAnim - 3) / 2) * (-0.11-(0.135)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.1 + (((tickAnim - 5) / 5) * (-0.3-(0.1)));
            yy = 0.24 + (((tickAnim - 5) / 5) * (-0.375-(0.24)));
            zz = -0.11 + (((tickAnim - 5) / 5) * (-0.175-(-0.11)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.3 + (((tickAnim - 10) / 5) * (-0.15-(-0.3)));
            yy = -0.375 + (((tickAnim - 10) / 5) * (-0.01-(-0.375)));
            zz = -0.175 + (((tickAnim - 10) / 5) * (0.09-(-0.175)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -0.15 + (((tickAnim - 15) / 3) * (-0.07-(-0.15)));
            yy = -0.01 + (((tickAnim - 15) / 3) * (0.25-(-0.01)));
            zz = 0.09 + (((tickAnim - 15) / 3) * (0.05-(0.09)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.07 + (((tickAnim - 18) / 2) * (0-(-0.07)));
            yy = 0.25 + (((tickAnim - 18) / 2) * (0-(0.25)));
            zz = 0.05 + (((tickAnim - 18) / 2) * (0-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*10), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-4), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (10.06486-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (59.58356-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-10.82143-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10.06486 + (((tickAnim - 3) / 2) * (46.06486-(10.06486)));
            yy = 59.58356 + (((tickAnim - 3) / 2) * (59.58356-(59.58356)));
            zz = -10.82143 + (((tickAnim - 3) / 2) * (-10.82143-(-10.82143)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 46.06486 + (((tickAnim - 5) / 5) * (5-(46.06486)));
            yy = 59.58356 + (((tickAnim - 5) / 5) * (0-(59.58356)));
            zz = -10.82143 + (((tickAnim - 5) / 5) * (-7.25-(-10.82143)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 10) / 3) * (20.08497-(5)));
            yy = 0 + (((tickAnim - 10) / 3) * (-52.89383-(0)));
            zz = -7.25 + (((tickAnim - 10) / 3) * (-8.56966-(-7.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 20.08497 + (((tickAnim - 13) / 2) * (30.58765-(20.08497)));
            yy = -52.89383 + (((tickAnim - 13) / 2) * (-69.62053-(-52.89383)));
            zz = -8.56966 + (((tickAnim - 13) / 2) * (-22.57811-(-8.56966)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 30.58765 + (((tickAnim - 15) / 1) * (20.94765-(30.58765)));
            yy = -69.62053 + (((tickAnim - 15) / 1) * (-59.25402-(-69.62053)));
            zz = -22.57811 + (((tickAnim - 15) / 1) * (-13.08549-(-22.57811)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 20.94765 + (((tickAnim - 16) / 2) * (13.06963-(20.94765)));
            yy = -59.25402 + (((tickAnim - 16) / 2) * (-35.60686-(-59.25402)));
            zz = -13.08549 + (((tickAnim - 16) / 2) * (-7.43239-(-13.08549)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 13.06963 + (((tickAnim - 18) / 2) * (0-(13.06963)));
            yy = -35.60686 + (((tickAnim - 18) / 2) * (0-(-35.60686)));
            zz = -7.43239 + (((tickAnim - 18) / 2) * (0-(-7.43239)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3w, rightLeg3w.rotateAngleX + (float) Math.toRadians(xx), rightLeg3w.rotateAngleY + (float) Math.toRadians(yy), rightLeg3w.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.325-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.125-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.325 + (((tickAnim - 5) / 5) * (0-(0.325)));
            yy = 0.35 + (((tickAnim - 5) / 5) * (0.3-(0.35)));
            zz = -0.125 + (((tickAnim - 5) / 5) * (0-(-0.125)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.3 + (((tickAnim - 10) / 5) * (0.2-(0.3)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 15) / 5) * (0-(0.2)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3w.rotationPointX = this.rightLeg3w.rotationPointX + (float)(xx);
        this.rightLeg3w.rotationPointY = this.rightLeg3w.rotationPointY - (float)(yy);
        this.rightLeg3w.rotationPointZ = this.rightLeg3w.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 16.07781 + (((tickAnim - 0) / 3) * (26.99245-(16.07781)));
            yy = 22.58567 + (((tickAnim - 0) / 3) * (52.29672-(22.58567)));
            zz = 9.70925 + (((tickAnim - 0) / 3) * (14.74936-(9.70925)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 26.99245 + (((tickAnim - 3) / 2) * (53.34439-(26.99245)));
            yy = 52.29672 + (((tickAnim - 3) / 2) * (62.34353-(52.29672)));
            zz = 14.74936 + (((tickAnim - 3) / 2) * (42.3115-(14.74936)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 53.34439 + (((tickAnim - 5) / 3) * (13.32165-(53.34439)));
            yy = 62.34353 + (((tickAnim - 5) / 3) * (37.18585-(62.34353)));
            zz = 42.3115 + (((tickAnim - 5) / 3) * (2.86325-(42.3115)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 13.32165 + (((tickAnim - 8) / 2) * (0-(13.32165)));
            yy = 37.18585 + (((tickAnim - 8) / 2) * (0-(37.18585)));
            zz = 2.86325 + (((tickAnim - 8) / 2) * (0-(2.86325)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (30.58765-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-69.62053-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (22.5781-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 30.58765 + (((tickAnim - 15) / 3) * (13.33273-(30.58765)));
            yy = -69.62053 + (((tickAnim - 15) / 3) * (-23.51743-(-69.62053)));
            zz = 22.5781 + (((tickAnim - 15) / 3) * (16.14368-(22.5781)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 13.33273 + (((tickAnim - 18) / 2) * (16.07781-(13.33273)));
            yy = -23.51743 + (((tickAnim - 18) / 2) * (22.58567-(-23.51743)));
            zz = 16.14368 + (((tickAnim - 18) / 2) * (9.70925-(16.14368)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3w, leftLeg3w.rotateAngleX + (float) Math.toRadians(xx), leftLeg3w.rotateAngleY + (float) Math.toRadians(yy), leftLeg3w.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.325-(0)));
            yy = 0.45 + (((tickAnim - 0) / 5) * (0.35-(0.45)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.125-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.325 + (((tickAnim - 5) / 5) * (0-(-0.325)));
            yy = 0.35 + (((tickAnim - 5) / 5) * (0-(0.35)));
            zz = 0.125 + (((tickAnim - 5) / 5) * (0-(0.125)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.2-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 15) / 5) * (0.45-(0.2)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3w.rotationPointX = this.leftLeg3w.rotationPointX + (float)(xx);
        this.leftLeg3w.rotationPointY = this.leftLeg3w.rotationPointY - (float)(yy);
        this.leftLeg3w.rotationPointZ = this.leftLeg3w.rotationPointZ + (float)(zz);
       

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGueragama entity = (EntityPrehistoricFloraGueragama) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.99159 + (((tickAnim - 0) / 3) * (1.55178-(4.99159)));
            yy = 78.12002 + (((tickAnim - 0) / 3) * (43.94991-(78.12002)));
            zz = 2.17446 + (((tickAnim - 0) / 3) * (60.0204+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25-(2.17446)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.55178 + (((tickAnim - 3) / 2) * (14.25-(1.55178)));
            yy = 43.94991 + (((tickAnim - 3) / 2) * (-2.75-(43.94991)));
            zz = 60.0204+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25 + (((tickAnim - 3) / 2) * (0-(60.0204+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 14.25 + (((tickAnim - 5) / 5) * (4.99159-(14.25)));
            yy = -2.75 + (((tickAnim - 5) / 5) * (78.12002-(-2.75)));
            zz = 0 + (((tickAnim - 5) / 5) * (2.17446-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -15.24607 + (((tickAnim - 0) / 3) * (6.12696-(-15.24607)));
            yy = -12.52042 + (((tickAnim - 0) / 3) * (-29.38521-(-12.52042)));
            zz = -15.41216 + (((tickAnim - 0) / 3) * (-7.70608-(-15.41216)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6.12696 + (((tickAnim - 3) / 2) * (0-(6.12696)));
            yy = -29.38521 + (((tickAnim - 3) / 2) * (-46.25-(-29.38521)));
            zz = -7.70608 + (((tickAnim - 3) / 2) * (0-(-7.70608)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-15.24607-(0)));
            yy = -46.25 + (((tickAnim - 5) / 5) * (-12.52042-(-46.25)));
            zz = 0 + (((tickAnim - 5) / 5) * (-15.41216-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(0);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(0);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 14.25 + (((tickAnim - 0) / 5) * (4.99159-(14.25)));
            yy = 2.75 + (((tickAnim - 0) / 5) * (-78.12-(2.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.1745-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 4.99159 + (((tickAnim - 5) / 3) * (-2.31224-(4.99159)));
            yy = -78.12 + (((tickAnim - 5) / 3) * (-39.37045-(-78.12)));
            zz = -2.1745 + (((tickAnim - 5) / 3) * (-27.611+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25-(-2.1745)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.31224 + (((tickAnim - 8) / 2) * (14.25-(-2.31224)));
            yy = -39.37045 + (((tickAnim - 8) / 2) * (2.75-(-39.37045)));
            zz = -27.611+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25 + (((tickAnim - 8) / 2) * (0-(-27.611+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-15.24607-(0)));
            yy = 46.25 + (((tickAnim - 0) / 5) * (12.5204-(46.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (15.4122-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -15.24607 + (((tickAnim - 5) / 3) * (6.12696-(-15.24607)));
            yy = 12.5204 + (((tickAnim - 5) / 3) * (29.3852-(12.5204)));
            zz = 15.4122 + (((tickAnim - 5) / 3) * (7.7061-(15.4122)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6.12696 + (((tickAnim - 8) / 2) * (0-(6.12696)));
            yy = 29.3852 + (((tickAnim - 8) / 2) * (46.25-(29.3852)));
            zz = 7.7061 + (((tickAnim - 8) / 2) * (0-(7.7061)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 16.79241 + (((tickAnim - 0) / 5) * (112.6134-(16.79241)));
            yy = -50.5459 + (((tickAnim - 0) / 5) * (17.3026-(-50.5459)));
            zz = 1.82205 + (((tickAnim - 0) / 5) * (89.5007-(1.82205)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 112.6134 + (((tickAnim - 5) / 3) * (70.72459-(112.6134)));
            yy = 17.3026 + (((tickAnim - 5) / 3) * (-7.6165-(17.3026)));
            zz = 89.5007 + (((tickAnim - 5) / 3) * (59.2003-(89.5007)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 70.72459 + (((tickAnim - 8) / 2) * (16.79241-(70.72459)));
            yy = -7.6165 + (((tickAnim - 8) / 2) * (-50.5459-(-7.6165)));
            zz = 59.2003 + (((tickAnim - 8) / 2) * (1.82205-(59.2003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0.15 + (((tickAnim - 0) / 5) * (0.325-(0.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.325 + (((tickAnim - 5) / 5) * (0.15-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm1.rotationPointX = this.rightArm1.rotationPointX + (float)(xx);
        this.rightArm1.rotationPointY = this.rightArm1.rotationPointY - (float)(yy);
        this.rightArm1.rotationPointZ = this.rightArm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -4.2495 + (((tickAnim - 0) / 5) * (16.69409-(-4.2495)));
            yy = 23.602 + (((tickAnim - 0) / 5) * (57.6578-(23.602)));
            zz = 4.48875 + (((tickAnim - 0) / 5) * (-23.4904-(4.48875)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 16.69409 + (((tickAnim - 5) / 3) * (-8.18281-(16.69409)));
            yy = 57.6578 + (((tickAnim - 5) / 3) * (59.7599-(57.6578)));
            zz = -23.4904 + (((tickAnim - 5) / 3) * (-10.6441-(-23.4904)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -8.18281 + (((tickAnim - 8) / 1) * (-45.54309-(-8.18281)));
            yy = 59.7599 + (((tickAnim - 8) / 1) * (40.6795-(59.7599)));
            zz = -10.6441 + (((tickAnim - 8) / 1) * (53.7423-(-10.6441)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -45.54309 + (((tickAnim - 9) / 1) * (-4.2495-(-45.54309)));
            yy = 40.6795 + (((tickAnim - 9) / 1) * (23.602-(40.6795)));
            zz = 53.7423 + (((tickAnim - 9) / 1) * (4.48875-(53.7423)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 112.6134 + (((tickAnim - 0) / 3) * (70.72459-(112.6134)));
            yy = -17.30263 + (((tickAnim - 0) / 3) * (7.61649-(-17.30263)));
            zz = -89.50069 + (((tickAnim - 0) / 3) * (-59.20026-(-89.50069)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 70.72459 + (((tickAnim - 3) / 2) * (16.79241-(70.72459)));
            yy = 7.61649 + (((tickAnim - 3) / 2) * (50.5459-(7.61649)));
            zz = -59.20026 + (((tickAnim - 3) / 2) * (1.82205-(-59.20026)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 16.79241 + (((tickAnim - 5) / 5) * (112.6134-(16.79241)));
            yy = 50.5459 + (((tickAnim - 5) / 5) * (-17.30263-(50.5459)));
            zz = 1.82205 + (((tickAnim - 5) / 5) * (-89.50069-(1.82205)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0.325 + (((tickAnim - 0) / 5) * (0.15-(0.325)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.15 + (((tickAnim - 5) / 5) * (0.325-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm1.rotationPointX = this.leftArm1.rotationPointX + (float)(xx);
        this.leftArm1.rotationPointY = this.leftArm1.rotationPointY - (float)(yy);
        this.leftArm1.rotationPointZ = this.leftArm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 16.69409 + (((tickAnim - 0) / 3) * (-8.18281-(16.69409)));
            yy = -57.65782 + (((tickAnim - 0) / 3) * (-59.75992-(-57.65782)));
            zz = 23.49041 + (((tickAnim - 0) / 3) * (-10.64408-(23.49041)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -8.18281 + (((tickAnim - 3) / 1) * (-45.54309-(-8.18281)));
            yy = -59.75992 + (((tickAnim - 3) / 1) * (-40.67946-(-59.75992)));
            zz = -10.64408 + (((tickAnim - 3) / 1) * (-53.74225-(-10.64408)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -45.54309 + (((tickAnim - 4) / 1) * (-4.2495-(-45.54309)));
            yy = -40.67946 + (((tickAnim - 4) / 1) * (-23.602-(-40.67946)));
            zz = -53.74225 + (((tickAnim - 4) / 1) * (-4.4887-(-53.74225)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4.2495 + (((tickAnim - 5) / 5) * (16.69409-(-4.2495)));
            yy = -23.602 + (((tickAnim - 5) / 5) * (-57.65782-(-23.602)));
            zz = -4.4887 + (((tickAnim - 5) / 5) * (23.49041-(-4.4887)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.56765 + (((tickAnim - 0) / 3) * (26.21576-(27.56765)));
            yy = 42.88064 + (((tickAnim - 0) / 3) * (3.81553-(42.88064)));
            zz = 29.61518 + (((tickAnim - 0) / 3) * (59.16576-(29.61518)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 26.21576 + (((tickAnim - 3) / 1) * (-13.89717-(26.21576)));
            yy = 3.81553 + (((tickAnim - 3) / 1) * (-0.27701-(3.81553)));
            zz = 59.16576 + (((tickAnim - 3) / 1) * (18.54095-(59.16576)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -13.89717 + (((tickAnim - 4) / 1) * (4.25-(-13.89717)));
            yy = -0.27701 + (((tickAnim - 4) / 1) * (0-(-0.27701)));
            zz = 18.54095 + (((tickAnim - 4) / 1) * (0-(18.54095)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 4.25 + (((tickAnim - 5) / 2) * (-32.36775-(4.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (-6.05846-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-31.60455-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -32.36775 + (((tickAnim - 7) / 1) * (-51.77126-(-32.36775)));
            yy = -6.05846 + (((tickAnim - 7) / 1) * (17.59912-(-6.05846)));
            zz = -31.60455 + (((tickAnim - 7) / 1) * (-57.24688-(-31.60455)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -51.77126 + (((tickAnim - 8) / 2) * (27.56765-(-51.77126)));
            yy = 17.59912 + (((tickAnim - 8) / 2) * (42.88064-(17.59912)));
            zz = -57.24688 + (((tickAnim - 8) / 2) * (29.61518-(-57.24688)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.3 + (((tickAnim - 0) / 3) * (-0.15-(-0.3)));
            yy = 0.375 + (((tickAnim - 0) / 3) * (-0.01-(0.375)));
            zz = 0.175 + (((tickAnim - 0) / 3) * (0.09-(0.175)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -0.15 + (((tickAnim - 3) / 1) * (-0.07-(-0.15)));
            yy = -0.01 + (((tickAnim - 3) / 1) * (0.25-(-0.01)));
            zz = 0.09 + (((tickAnim - 3) / 1) * (0.05-(0.09)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -0.07 + (((tickAnim - 4) / 1) * (0-(-0.07)));
            yy = 0.25 + (((tickAnim - 4) / 1) * (0.1-(0.25)));
            zz = 0.05 + (((tickAnim - 4) / 1) * (0-(0.05)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (-0.2-(0)));
            yy = 0.1 + (((tickAnim - 5) / 1) * (0.4-(0.1)));
            zz = 0 + (((tickAnim - 5) / 1) * (-0.07-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -0.2 + (((tickAnim - 6) / 1) * (-0.4-(-0.2)));
            yy = 0.4 + (((tickAnim - 6) / 1) * (0.395-(0.4)));
            zz = -0.07 + (((tickAnim - 6) / 1) * (-0.14-(-0.07)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -0.4 + (((tickAnim - 7) / 1) * (-0.025-(-0.4)));
            yy = 0.395 + (((tickAnim - 7) / 1) * (0.265-(0.395)));
            zz = -0.14 + (((tickAnim - 7) / 1) * (0.065-(-0.14)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.025 + (((tickAnim - 8) / 2) * (-0.3-(-0.025)));
            yy = 0.265 + (((tickAnim - 8) / 2) * (0.375-(0.265)));
            zz = 0.065 + (((tickAnim - 8) / 2) * (0.175-(0.065)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*4), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-80))*-12), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*1);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+120))*-0.2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*-0.4);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*-5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-20))*12), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*12), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*12), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*12), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-40))*-12), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-31.11932-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.61364-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (28.90051-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -31.11932 + (((tickAnim - 2) / 1) * (-51.77126-(-31.11932)));
            yy = -0.61364 + (((tickAnim - 2) / 1) * (-17.5991-(-0.61364)));
            zz = 28.90051 + (((tickAnim - 2) / 1) * (57.2469-(28.90051)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -51.77126 + (((tickAnim - 3) / 2) * (-3.18235-(-51.77126)));
            yy = -17.5991 + (((tickAnim - 3) / 2) * (-42.8806-(-17.5991)));
            zz = 57.2469 + (((tickAnim - 3) / 2) * (-29.6152-(57.2469)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3.18235 + (((tickAnim - 5) / 3) * (26.21576-(-3.18235)));
            yy = -42.8806 + (((tickAnim - 5) / 3) * (-3.8155-(-42.8806)));
            zz = -29.6152 + (((tickAnim - 5) / 3) * (-59.1658-(-29.6152)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 26.21576 + (((tickAnim - 8) / 1) * (-13.89717-(26.21576)));
            yy = -3.8155 + (((tickAnim - 8) / 1) * (0.277-(-3.8155)));
            zz = -59.1658 + (((tickAnim - 8) / 1) * (-18.5409-(-59.1658)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -13.89717 + (((tickAnim - 9) / 1) * (-11.72608-(-13.89717)));
            yy = 0.277 + (((tickAnim - 9) / 1) * (-1.62354-(0.277)));
            zz = -18.5409 + (((tickAnim - 9) / 1) * (-2.67565-(-18.5409)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0.2-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-0.07-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0.2 + (((tickAnim - 1) / 1) * (0.05-(0.2)));
            yy = 0.525 + (((tickAnim - 1) / 1) * (0.67-(0.525)));
            zz = -0.07 + (((tickAnim - 1) / 1) * (0.135-(-0.07)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.05 + (((tickAnim - 2) / 1) * (0.1-(0.05)));
            yy = 0.67 + (((tickAnim - 2) / 1) * (0.24-(0.67)));
            zz = 0.135 + (((tickAnim - 2) / 1) * (-0.11-(0.135)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.1 + (((tickAnim - 3) / 2) * (-0.3-(0.1)));
            yy = 0.24 + (((tickAnim - 3) / 2) * (-0.375-(0.24)));
            zz = -0.11 + (((tickAnim - 3) / 2) * (-0.175-(-0.11)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.3 + (((tickAnim - 5) / 3) * (-0.15-(-0.3)));
            yy = -0.375 + (((tickAnim - 5) / 3) * (-0.01-(-0.375)));
            zz = -0.175 + (((tickAnim - 5) / 3) * (0.09-(-0.175)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -0.15 + (((tickAnim - 8) / 1) * (-0.07-(-0.15)));
            yy = -0.01 + (((tickAnim - 8) / 1) * (0.25-(-0.01)));
            zz = 0.09 + (((tickAnim - 8) / 1) * (0.05-(0.09)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -0.07 + (((tickAnim - 9) / 1) * (0-(-0.07)));
            yy = 0.25 + (((tickAnim - 9) / 1) * (0-(0.25)));
            zz = 0.05 + (((tickAnim - 9) / 1) * (0-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-140))*16), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-180))*-12), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (10.06486-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (59.58356-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-10.82143-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10.06486 + (((tickAnim - 2) / 1) * (46.06486-(10.06486)));
            yy = 59.58356 + (((tickAnim - 2) / 1) * (59.58356-(59.58356)));
            zz = -10.82143 + (((tickAnim - 2) / 1) * (-10.82143-(-10.82143)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 46.06486 + (((tickAnim - 3) / 2) * (5-(46.06486)));
            yy = 59.58356 + (((tickAnim - 3) / 2) * (0-(59.58356)));
            zz = -10.82143 + (((tickAnim - 3) / 2) * (-7.25-(-10.82143)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 5 + (((tickAnim - 5) / 2) * (20.08497-(5)));
            yy = 0 + (((tickAnim - 5) / 2) * (-52.89383-(0)));
            zz = -7.25 + (((tickAnim - 5) / 2) * (-8.56966-(-7.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 20.08497 + (((tickAnim - 7) / 1) * (30.58765-(20.08497)));
            yy = -52.89383 + (((tickAnim - 7) / 1) * (-69.62053-(-52.89383)));
            zz = -8.56966 + (((tickAnim - 7) / 1) * (-22.57811-(-8.56966)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 30.58765 + (((tickAnim - 8) / 0) * (20.94765-(30.58765)));
            yy = -69.62053 + (((tickAnim - 8) / 0) * (-59.25402-(-69.62053)));
            zz = -22.57811 + (((tickAnim - 8) / 0) * (-13.08549-(-22.57811)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 20.94765 + (((tickAnim - 8) / 1) * (13.06963-(20.94765)));
            yy = -59.25402 + (((tickAnim - 8) / 1) * (-35.60686-(-59.25402)));
            zz = -13.08549 + (((tickAnim - 8) / 1) * (-7.43239-(-13.08549)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 13.06963 + (((tickAnim - 9) / 1) * (0-(13.06963)));
            yy = -35.60686 + (((tickAnim - 9) / 1) * (0-(-35.60686)));
            zz = -7.43239 + (((tickAnim - 9) / 1) * (0-(-7.43239)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3w, rightLeg3w.rotateAngleX + (float) Math.toRadians(xx), rightLeg3w.rotateAngleY + (float) Math.toRadians(yy), rightLeg3w.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.325-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.125-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.325 + (((tickAnim - 3) / 2) * (0-(0.325)));
            yy = 0.35 + (((tickAnim - 3) / 2) * (0.3-(0.35)));
            zz = -0.125 + (((tickAnim - 3) / 2) * (0-(-0.125)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 5) / 3) * (0.2-(0.3)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 8) / 2) * (0-(0.2)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3w.rotationPointX = this.rightLeg3w.rotationPointX + (float)(xx);
        this.rightLeg3w.rotationPointY = this.rightLeg3w.rotationPointY - (float)(yy);
        this.rightLeg3w.rotationPointZ = this.rightLeg3w.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 16.07781 + (((tickAnim - 0) / 2) * (26.99245-(16.07781)));
            yy = 22.58567 + (((tickAnim - 0) / 2) * (52.29672-(22.58567)));
            zz = 9.70925 + (((tickAnim - 0) / 2) * (14.74936-(9.70925)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 26.99245 + (((tickAnim - 2) / 1) * (53.34439-(26.99245)));
            yy = 52.29672 + (((tickAnim - 2) / 1) * (62.34353-(52.29672)));
            zz = 14.74936 + (((tickAnim - 2) / 1) * (42.3115-(14.74936)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 53.34439 + (((tickAnim - 3) / 1) * (13.32165-(53.34439)));
            yy = 62.34353 + (((tickAnim - 3) / 1) * (37.18585-(62.34353)));
            zz = 42.3115 + (((tickAnim - 3) / 1) * (2.86325-(42.3115)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 13.32165 + (((tickAnim - 4) / 1) * (0-(13.32165)));
            yy = 37.18585 + (((tickAnim - 4) / 1) * (0-(37.18585)));
            zz = 2.86325 + (((tickAnim - 4) / 1) * (0-(2.86325)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (30.58765-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-69.62053-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (22.5781-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 30.58765 + (((tickAnim - 8) / 1) * (13.33273-(30.58765)));
            yy = -69.62053 + (((tickAnim - 8) / 1) * (-23.51743-(-69.62053)));
            zz = 22.5781 + (((tickAnim - 8) / 1) * (16.14368-(22.5781)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 13.33273 + (((tickAnim - 9) / 1) * (16.07781-(13.33273)));
            yy = -23.51743 + (((tickAnim - 9) / 1) * (22.58567-(-23.51743)));
            zz = 16.14368 + (((tickAnim - 9) / 1) * (9.70925-(16.14368)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3w, leftLeg3w.rotateAngleX + (float) Math.toRadians(xx), leftLeg3w.rotateAngleY + (float) Math.toRadians(yy), leftLeg3w.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.325-(0)));
            yy = 0.45 + (((tickAnim - 0) / 3) * (0.35-(0.45)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.125-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.325 + (((tickAnim - 3) / 2) * (0-(-0.325)));
            yy = 0.35 + (((tickAnim - 3) / 2) * (0-(0.35)));
            zz = 0.125 + (((tickAnim - 3) / 2) * (0-(0.125)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.2-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 8) / 2) * (0.45-(0.2)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3w.rotationPointX = this.leftLeg3w.rotationPointX + (float)(xx);
        this.leftLeg3w.rotationPointY = this.leftLeg3w.rotationPointY - (float)(yy);
        this.leftLeg3w.rotationPointZ = this.leftLeg3w.rotationPointZ + (float)(zz);


    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraGueragama e = (EntityPrehistoricFloraGueragama) entity;
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
