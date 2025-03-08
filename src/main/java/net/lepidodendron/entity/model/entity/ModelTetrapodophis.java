package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTetrapodophis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTetrapodophis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer pelvis;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer leftfoot_r1;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer rightfoot_r1;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail1_r1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3_r1;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;

    private ModelAnimator animator;

    public ModelTetrapodophis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.1F, 22.5F, -15.8F);
        this.chest.cubeList.add(new ModelBox(chest, 38, 9, -1.5342F, -1.1F, -1.0002F, 3, 2, 3, 0.003F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0658F, 0.0F, 1.8998F);
        this.chest.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 21, 0, -1.6F, -1.1F, -0.1F, 3, 2, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 5.6F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 19, 20, -1.6F, -1.1F, 0.0F, 3, 2, 6, 0.003F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 5.9F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 20, -1.6F, -1.1F, -0.2F, 3, 2, 6, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 5.8F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 29, -1.6F, -1.1F, -0.2F, 3, 2, 6, 0.003F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 19, 29, -1.6F, -1.1F, 0.0F, 3, 2, 5, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 4.9F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 36, 29, -1.6F, -1.1F, -0.1F, 3, 2, 5, 0.003F, false));

        this.pelvis = new AdvancedModelRenderer(this);
        this.pelvis.setRotationPoint(0.0F, 0.0F, 4.7F);
        this.body6.addChild(pelvis);
        this.setRotateAngle(pelvis, -0.0873F, 0.0F, 0.0F);
        this.pelvis.cubeList.add(new ModelBox(pelvis, 34, 37, -1.6F, -1.1F, -0.1F, 3, 2, 4, 0.0F, false));
        this.pelvis.cubeList.add(new ModelBox(pelvis, 0, 38, -1.6F, 0.2F, -0.1F, 3, 1, 4, -0.01F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.9F, 0.4F, 2.5F);
        this.pelvis.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.1147F, 0.5695F, -0.0827F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 0, 50, 0.2F, -0.6F, -0.6F, 2, 1, 1, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.9F, 0.0F, -0.1F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -1.4923F, -1.1659F, 1.6814F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 33, 50, 0.1F, -0.6F, -0.5F, 2, 1, 1, 0.0F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(1.9F, 0.1F, 0.0F);
        this.leftLeg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.179F, 0.6853F, -0.5734F);


        this.leftfoot_r1 = new AdvancedModelRenderer(this);
        this.leftfoot_r1.setRotationPoint(0.9F, 0.0F, 0.0F);
        this.leftfoot.addChild(leftfoot_r1);
        this.setRotateAngle(leftfoot_r1, 0.1047F, 0.0F, 0.0F);
        this.leftfoot_r1.cubeList.add(new ModelBox(leftfoot_r1, 40, 6, -1.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.1F, 0.4F, 2.5F);
        this.pelvis.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.1147F, -0.5695F, 0.0827F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 51, 3, -2.2F, -0.6F, -0.6F, 2, 1, 1, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.9F, 0.0F, -0.1F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -1.4923F, 1.1659F, -1.6814F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 7, 51, -2.1F, -0.6F, -0.5F, 2, 1, 1, 0.0F, false));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(-1.9F, 0.1F, 0.0F);
        this.rightLeg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.179F, -0.6853F, 0.5734F);


        this.rightfoot_r1 = new AdvancedModelRenderer(this);
        this.rightfoot_r1.setRotationPoint(-0.9F, 0.0F, 0.0F);
        this.rightfoot.addChild(rightfoot_r1);
        this.setRotateAngle(rightfoot_r1, 0.1047F, 0.0F, 0.0F);
        this.rightfoot_r1.cubeList.add(new ModelBox(rightfoot_r1, 49, 6, -1.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(-0.7F, 0.4F, 3.9F);
        this.pelvis.addChild(tail1);


        this.tail1_r1 = new AdvancedModelRenderer(this);
        this.tail1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail1.addChild(tail1_r1);
        this.setRotateAngle(tail1_r1, 0.0524F, 0.0F, 0.0F);
        this.tail1_r1.cubeList.add(new ModelBox(tail1_r1, 0, 0, -0.4F, -1.4F, -0.3F, 2, 2, 8, 0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1F, 6.9F);
        this.tail1.addChild(tail2);


        this.tail3_r1 = new AdvancedModelRenderer(this);
        this.tail3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail2.addChild(tail3_r1);
        this.setRotateAngle(tail3_r1, 0.1047F, 0.0F, 0.0F);
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 19, 11, -0.4F, -0.9F, 0.5F, 2, 1, 7, 0.0F, false));
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 0, 11, -0.4F, -1.4F, 0.5F, 2, 1, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.6F, -1.5844F, 7.2908F);
        this.tail2.addChild(tail3);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.6F, 1.5844F, -7.2908F);
        this.tail3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1047F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 37, 0.1F, -1.0F, 7.4F, 1, 1, 6, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(0.8658F, 0.5F, 0.7998F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.0F, -0.3665F, 0.1745F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 51, 9, 0.2F, -1.0F, -0.8F, 2, 1, 1, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(1.9199F, 0.034F, -0.0423F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.3002F, 0.9388F, 0.4597F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 45, 49, 0.0F, -1.0F, -0.4F, 2, 1, 1, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(1.9F, -0.3F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.1735F, 0.4442F, -0.2575F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 49, 37, -0.1F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-0.9342F, 0.5F, 0.7998F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.0F, 0.3665F, -0.1745F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 51, 12, -2.2F, -1.0F, -0.8F, 2, 1, 1, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-1.9199F, 0.034F, -0.0423F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.3002F, -0.9388F, -0.4597F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 51, 0, -2.0F, -1.0F, -0.4F, 2, 1, 1, 0.0F, false));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-1.9F, -0.3F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.1735F, -0.4442F, 0.2575F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 49, 40, -1.9F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(-0.0342F, 0.0F, -0.6002F);
        this.chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.0873F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 45, 44, -1.5F, -1.1F, -2.0F, 3, 2, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.1F, -1.7F);
        this.Neck.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 49, 25, -1.5F, -1.0F, -1.2F, 3, 2, 1, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 11, 45, -0.5F, -0.5F, -4.9F, 1, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.5F, -4.8F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2443F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 15, -0.4782F, 0.0F, 0.1462F, 1, 1, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.1F, -4.5F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1222F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 44, -0.5F, -0.6F, 0.0F, 1, 1, 4, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.8F, -0.9F, -1.2F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0969F, 0.2093F, -0.107F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 49, 20, -0.675F, -0.0282F, -2.9902F, 1, 1, 3, -0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.8F, -0.9F, -1.2F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0969F, -0.2093F, 0.107F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 49, 15, -0.325F, -0.0282F, -2.9902F, 1, 1, 3, -0.02F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.1F, -0.7F, -4.8F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.2443F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 51, -0.4782F, 0.0F, 2.2462F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.1F, -0.7F, -4.8F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.2443F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 50, -0.5218F, 0.0F, 2.2462F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.5F, -4.8F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.2443F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 21, -0.5218F, 0.0F, 0.1462F, 1, 1, 4, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5956F, -1.1001F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 22, 45, -0.5F, -0.6F, -3.7F, 1, 1, 4, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 14, 51, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.6F, -3.6F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.2269F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 44, -0.4782F, 0.0F, 0.1462F, 1, 1, 4, -0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.6F, -3.6F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.2269F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 0, -0.5218F, 0.0F, 0.1462F, 1, 1, 4, -0.02F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.chest.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.chest.offsetY = -2.5F;
        this.chest.offsetX = 2.9F;
        this.chest.rotateAngleY = (float)Math.toRadians(240);
        this.chest.rotateAngleX = (float)Math.toRadians(28);
        this.chest.rotateAngleZ = (float)Math.toRadians(-8);
        this.chest.scaleChildren = true;
        float scaler = 2.5F;
        this.chest.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.chest.render(f);
        //Reset rotations, positions and sizing:
        this.chest.setScale(1.0F, 1.0F, 1.0F);
        this.chest.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {

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
        this.chest.offsetY = 0.0F;

        EntityPrehistoricFloraTetrapodophis proteros = (EntityPrehistoricFloraTetrapodophis) e;

        this.faceTarget(f3, f4, 10, Neck);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.Neck, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        proteros.tailBuffer.applyChainSwingBuffer(Tail);

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION) {
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
        EntityPrehistoricFloraTetrapodophis ee = (EntityPrehistoricFloraTetrapodophis) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                }
            } else {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }



    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTetrapodophis entity = (EntityPrehistoricFloraTetrapodophis) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (19.59558-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-37.75757-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-22.60589-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 19.59558 + (((tickAnim - 10) / 5) * (13.63251-(19.59558)));
            yy = -37.75757 + (((tickAnim - 10) / 5) * (10.85923-(-37.75757)));
            zz = -22.60589 + (((tickAnim - 10) / 5) * (-29.57284-(-22.60589)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 13.63251 + (((tickAnim - 15) / 5) * (0-(13.63251)));
            yy = 10.85923 + (((tickAnim - 15) / 5) * (52-(10.85923)));
            zz = -29.57284 + (((tickAnim - 15) / 5) * (0-(-29.57284)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (19.59558-(0)));
            yy = 52 + (((tickAnim - 20) / 10) * (-37.75757-(52)));
            zz = 0 + (((tickAnim - 20) / 10) * (-22.60589-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 19.59558 + (((tickAnim - 30) / 5) * (13.63251-(19.59558)));
            yy = -37.75757 + (((tickAnim - 30) / 5) * (10.85923-(-37.75757)));
            zz = -22.60589 + (((tickAnim - 30) / 5) * (-29.57284-(-22.60589)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 13.63251 + (((tickAnim - 35) / 5) * (0-(13.63251)));
            yy = 10.85923 + (((tickAnim - 35) / 5) * (52-(10.85923)));
            zz = -29.57284 + (((tickAnim - 35) / 5) * (0-(-29.57284)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 52 + (((tickAnim - 40) / 10) * (0-(52)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (14.97695-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-55.66826-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-11.70153-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 14.97695 + (((tickAnim - 10) / 10) * (-1.00626-(14.97695)));
            yy = -55.66826 + (((tickAnim - 10) / 10) * (-18.56901-(-55.66826)));
            zz = -11.70153 + (((tickAnim - 10) / 10) * (-1.75407-(-11.70153)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.00626 + (((tickAnim - 20) / 10) * (14.97695-(-1.00626)));
            yy = -18.56901 + (((tickAnim - 20) / 10) * (-55.66826-(-18.56901)));
            zz = -1.75407 + (((tickAnim - 20) / 10) * (-11.70153-(-1.75407)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 14.97695 + (((tickAnim - 30) / 10) * (-1.00626-(14.97695)));
            yy = -55.66826 + (((tickAnim - 30) / 10) * (-18.56901-(-55.66826)));
            zz = -11.70153 + (((tickAnim - 30) / 10) * (-1.75407-(-11.70153)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -1.00626 + (((tickAnim - 40) / 10) * (0-(-1.00626)));
            yy = -18.56901 + (((tickAnim - 40) / 10) * (0-(-18.56901)));
            zz = -1.75407 + (((tickAnim - 40) / 10) * (0-(-1.75407)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 18.25 + (((tickAnim - 10) / 5) * (20.19187-(18.25)));
            yy = -2.75 + (((tickAnim - 10) / 5) * (-29.31713-(-2.75)));
            zz = 0 + (((tickAnim - 10) / 5) * (56.35772-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 20.19187 + (((tickAnim - 15) / 3) * (-11.25-(20.19187)));
            yy = -29.31713 + (((tickAnim - 15) / 3) * (0-(-29.31713)));
            zz = 56.35772 + (((tickAnim - 15) / 3) * (0-(56.35772)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -11.25 + (((tickAnim - 18) / 2) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (18.25-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-2.75-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 18.25 + (((tickAnim - 30) / 5) * (20.19187-(18.25)));
            yy = -2.75 + (((tickAnim - 30) / 5) * (-29.31713-(-2.75)));
            zz = 0 + (((tickAnim - 30) / 5) * (56.35772-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 20.19187 + (((tickAnim - 35) / 3) * (-11.25-(20.19187)));
            yy = -29.31713 + (((tickAnim - 35) / 3) * (0-(-29.31713)));
            zz = 56.35772 + (((tickAnim - 35) / 3) * (0-(56.35772)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -11.25 + (((tickAnim - 38) / 2) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.275-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0.075-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.275 + (((tickAnim - 15) / 3) * (0-(0.275)));
            zz = 0.075 + (((tickAnim - 15) / 3) * (0-(0.075)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0.275-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0.075-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0.275 + (((tickAnim - 35) / 3) * (0-(0.275)));
            zz = 0.075 + (((tickAnim - 35) / 3) * (0-(0.075)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTetrapodophis entity = (EntityPrehistoricFloraTetrapodophis) entitylivingbaseIn;
        int animCycle = 8;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 2.25 + (((tickAnim - 3) / 3) * (-11-(2.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -11 + (((tickAnim - 6) / 2) * (0-(-11)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -10 + (((tickAnim - 3) / 3) * (-4.75-(-10)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -4.75 + (((tickAnim - 6) / 2) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 10.75 + (((tickAnim - 3) / 3) * (28.75-(10.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 28.75 + (((tickAnim - 6) / 1) * (0-(28.75)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraTetrapodophis entity = (EntityPrehistoricFloraTetrapodophis) entitylivingbaseIn;
        int animCycle = 25;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*278-50))*-7), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*278+50))*1.5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*278+50))*-1.8);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*278-100))*-7), body1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*278-200))*-7), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*278-350))*7), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*278-4050))*7), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*278-400))*7), body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(0), body6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*278-50))*7), body6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pelvis, pelvis.rotateAngleX + (float) Math.toRadians(0), pelvis.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*278-450))*7), pelvis.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 14.32793 + (((tickAnim - 0) / 6) * (-1.46206-(14.32793)));
            yy = -61.561 + (((tickAnim - 0) / 6) * (-13.1325-(-61.561)));
            zz = -4.26452 + (((tickAnim - 0) / 6) * (-23.942-(-4.26452)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -1.46206 + (((tickAnim - 6) / 6) * (0-(-1.46206)));
            yy = -13.1325 + (((tickAnim - 6) / 6) * (27.25-(-13.1325)));
            zz = -23.942 + (((tickAnim - 6) / 6) * (0-(-23.942)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (-0.05844-(0)));
            yy = 27.25 + (((tickAnim - 12) / 6) * (-15.3886-(27.25)));
            zz = 0 + (((tickAnim - 12) / 6) * (-23.7651-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = -0.05844 + (((tickAnim - 18) / 8) * (14.32793-(-0.05844)));
            yy = -15.3886 + (((tickAnim - 18) / 8) * (-61.561-(-15.3886)));
            zz = -23.7651 + (((tickAnim - 18) / 8) * (-4.26452-(-23.7651)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 154.66009 + (((tickAnim - 0) / 2) * (147.92366-(154.66009)));
            yy = -0.08426 + (((tickAnim - 0) / 2) * (1.67836-(-0.08426)));
            zz = -78.15985 + (((tickAnim - 0) / 2) * (-69.09551-(-78.15985)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 147.92366 + (((tickAnim - 2) / 4) * (148.74415-(147.92366)));
            yy = 1.67836 + (((tickAnim - 2) / 4) * (25.9238-(1.67836)));
            zz = -69.09551 + (((tickAnim - 2) / 4) * (-66.3565-(-69.09551)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 148.74415 + (((tickAnim - 6) / 3) * (114.53949-(148.74415)));
            yy = 25.9238 + (((tickAnim - 6) / 3) * (36.4119-(25.9238)));
            zz = -66.3565 + (((tickAnim - 6) / 3) * (-67.2737-(-66.3565)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 114.53949 + (((tickAnim - 9) / 3) * (78.16705-(114.53949)));
            yy = 36.4119 + (((tickAnim - 9) / 3) * (45.7548-(36.4119)));
            zz = -67.2737 + (((tickAnim - 9) / 3) * (-58.2295-(-67.2737)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 78.16705 + (((tickAnim - 12) / 6) * (136.28568-(78.16705)));
            yy = 45.7548 + (((tickAnim - 12) / 6) * (29.0848-(45.7548)));
            zz = -58.2295 + (((tickAnim - 12) / 6) * (-26.338-(-58.2295)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 136.28568 + (((tickAnim - 18) / 8) * (154.66009-(136.28568)));
            yy = 29.0848 + (((tickAnim - 18) / 8) * (-0.08426-(29.0848)));
            zz = -26.338 + (((tickAnim - 18) / 8) * (-78.15985-(-26.338)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0.225 + (((tickAnim - 6) / 6) * (0-(0.225)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 12) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 14) * (0-(0)));
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
            xx = 14.97881 + (((tickAnim - 0) / 2) * (30.09907-(14.97881)));
            yy = -17.8023 + (((tickAnim - 0) / 2) * (-24.5358-(-17.8023)));
            zz = 41.1639 + (((tickAnim - 0) / 2) * (79.8994-(41.1639)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 30.09907 + (((tickAnim - 2) / 5) * (30.83142-(30.09907)));
            yy = -24.5358 + (((tickAnim - 2) / 5) * (-14.6412-(-24.5358)));
            zz = 79.8994 + (((tickAnim - 2) / 5) * (67.0903-(79.8994)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 30.83142 + (((tickAnim - 7) / 2) * (-0.25359-(30.83142)));
            yy = -14.6412 + (((tickAnim - 7) / 2) * (-9.775-(-14.6412)));
            zz = 67.0903 + (((tickAnim - 7) / 2) * (25.7082-(67.0903)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -0.25359 + (((tickAnim - 9) / 3) * (0-(-0.25359)));
            yy = -9.775 + (((tickAnim - 9) / 3) * (0-(-9.775)));
            zz = 25.7082 + (((tickAnim - 9) / 3) * (0-(25.7082)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (-48.72265-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (-8.1785-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (-55.9602-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = -48.72265 + (((tickAnim - 18) / 8) * (14.97881-(-48.72265)));
            yy = -8.1785 + (((tickAnim - 18) / 8) * (-17.8023-(-8.1785)));
            zz = -55.9602 + (((tickAnim - 18) / 8) * (41.16394-(-55.9602)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0.225 + (((tickAnim - 0) / 26) * (0.225-(0.225)));
            zz = 0.15 + (((tickAnim - 0) / 26) * (0.15-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.05844-(0)));
            yy = -27.25 + (((tickAnim - 0) / 6) * (15.38865-(-27.25)));
            zz = 0 + (((tickAnim - 0) / 6) * (23.76507-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -0.05844 + (((tickAnim - 6) / 7) * (14.32793-(-0.05844)));
            yy = 15.38865 + (((tickAnim - 6) / 7) * (61.561-(15.38865)));
            zz = 23.76507 + (((tickAnim - 6) / 7) * (4.2645-(23.76507)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 14.32793 + (((tickAnim - 13) / 7) * (-1.46206-(14.32793)));
            yy = 61.561 + (((tickAnim - 13) / 7) * (13.13247-(61.561)));
            zz = 4.2645 + (((tickAnim - 13) / 7) * (23.94204-(4.2645)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -1.46206 + (((tickAnim - 20) / 6) * (0-(-1.46206)));
            yy = 13.13247 + (((tickAnim - 20) / 6) * (-27.25-(13.13247)));
            zz = 23.94204 + (((tickAnim - 20) / 6) * (0-(23.94204)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 78.16705 + (((tickAnim - 0) / 6) * (136.28568-(78.16705)));
            yy = -45.75478 + (((tickAnim - 0) / 6) * (-29.08483-(-45.75478)));
            zz = 58.22945 + (((tickAnim - 0) / 6) * (26.338-(58.22945)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 136.28568 + (((tickAnim - 6) / 7) * (154.66009-(136.28568)));
            yy = -29.08483 + (((tickAnim - 6) / 7) * (0.0843-(-29.08483)));
            zz = 26.338 + (((tickAnim - 6) / 7) * (78.1598-(26.338)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 154.66009 + (((tickAnim - 13) / 2) * (175.3142-(154.66009)));
            yy = 0.0843 + (((tickAnim - 13) / 2) * (6.78404-(0.0843)));
            zz = 78.1598 + (((tickAnim - 13) / 2) * (94.37844-(78.1598)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 175.3142 + (((tickAnim - 15) / 5) * (148.74415-(175.3142)));
            yy = 6.78404 + (((tickAnim - 15) / 5) * (-25.9238-(6.78404)));
            zz = 94.37844 + (((tickAnim - 15) / 5) * (66.35652-(94.37844)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 148.74415 + (((tickAnim - 20) / 3) * (114.53949-(148.74415)));
            yy = -25.9238 + (((tickAnim - 20) / 3) * (-36.41185-(-25.9238)));
            zz = 66.35652 + (((tickAnim - 20) / 3) * (67.27372-(66.35652)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 114.53949 + (((tickAnim - 23) / 3) * (78.16705-(114.53949)));
            yy = -36.41185 + (((tickAnim - 23) / 3) * (-45.75478-(-36.41185)));
            zz = 67.27372 + (((tickAnim - 23) / 3) * (58.22945-(67.27372)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0.225-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0.225 + (((tickAnim - 20) / 6) * (0-(0.225)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-40.82967-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-5.26689-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (34.75983-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -40.82967 + (((tickAnim - 3) / 3) * (-48.72265-(-40.82967)));
            yy = -5.26689 + (((tickAnim - 3) / 3) * (8.17853-(-5.26689)));
            zz = 34.75983 + (((tickAnim - 3) / 3) * (55.9602-(34.75983)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -48.72265 + (((tickAnim - 6) / 7) * (14.97881-(-48.72265)));
            yy = 8.17853 + (((tickAnim - 6) / 7) * (17.8023-(8.17853)));
            zz = 55.9602 + (((tickAnim - 6) / 7) * (-41.1639-(55.9602)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 14.97881 + (((tickAnim - 13) / 2) * (30.09907-(14.97881)));
            yy = 17.8023 + (((tickAnim - 13) / 2) * (24.5358-(17.8023)));
            zz = -41.1639 + (((tickAnim - 13) / 2) * (-79.89942-(-41.1639)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 30.09907 + (((tickAnim - 15) / 5) * (30.83142-(30.09907)));
            yy = 24.5358 + (((tickAnim - 15) / 5) * (14.64124-(24.5358)));
            zz = -79.89942 + (((tickAnim - 15) / 5) * (-67.09034-(-79.89942)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 30.83142 + (((tickAnim - 20) / 3) * (-0.25359-(30.83142)));
            yy = 14.64124 + (((tickAnim - 20) / 3) * (9.77502-(14.64124)));
            zz = -67.09034 + (((tickAnim - 20) / 3) * (-25.70818-(-67.09034)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -0.25359 + (((tickAnim - 23) / 3) * (0-(-0.25359)));
            yy = 9.77502 + (((tickAnim - 23) / 3) * (0-(9.77502)));
            zz = -25.70818 + (((tickAnim - 23) / 3) * (0-(-25.70818)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(0);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(0.225);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(0.15);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*278-500))*15), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*278-450))*15), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*278-350))*-15), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 9.75 + (((tickAnim - 0) / 13) * (76.2754-(9.75)));
            yy = 53.75 + (((tickAnim - 0) / 13) * (-34.3646-(53.75)));
            zz = 0 + (((tickAnim - 0) / 13) * (-56.0911-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 76.2754 + (((tickAnim - 13) / 6) * (5.59469-(76.2754)));
            yy = -34.3646 + (((tickAnim - 13) / 6) * (10.0765-(-34.3646)));
            zz = -56.0911 + (((tickAnim - 13) / 6) * (-32.35915-(-56.0911)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 5.59469 + (((tickAnim - 19) / 7) * (9.75-(5.59469)));
            yy = 10.0765 + (((tickAnim - 19) / 7) * (53.75-(10.0765)));
            zz = -32.35915 + (((tickAnim - 19) / 7) * (0-(-32.35915)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (101.18286-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (13.70348-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (105.95865-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 101.18286 + (((tickAnim - 6) / 7) * (15.23642-(101.18286)));
            yy = 13.70348 + (((tickAnim - 6) / 7) * (-40.039-(13.70348)));
            zz = 105.95865 + (((tickAnim - 6) / 7) * (0.4269-(105.95865)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 15.23642 + (((tickAnim - 13) / 6) * (10.22148-(15.23642)));
            yy = -40.039 + (((tickAnim - 13) / 6) * (-22.00193-(-40.039)));
            zz = 0.4269 + (((tickAnim - 13) / 6) * (5.01926-(0.4269)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 10.22148 + (((tickAnim - 19) / 4) * (3.28342-(10.22148)));
            yy = -22.00193 + (((tickAnim - 19) / 4) * (11.58116-(-22.00193)));
            zz = 5.01926 + (((tickAnim - 19) / 4) * (2.20793-(5.01926)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 3.28342 + (((tickAnim - 23) / 3) * (0-(3.28342)));
            yy = 11.58116 + (((tickAnim - 23) / 3) * (0-(11.58116)));
            zz = 2.20793 + (((tickAnim - 23) / 3) * (0-(2.20793)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
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
            xx = -0.96787 + (((tickAnim - 0) / 2) * (-10.40567-(-0.96787)));
            yy = -15.30467 + (((tickAnim - 0) / 2) * (-11.35952-(-15.30467)));
            zz = -5.75374 + (((tickAnim - 0) / 2) * (-29.66371-(-5.75374)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -10.40567 + (((tickAnim - 2) / 1) * (-7.65571-(-10.40567)));
            yy = -11.35952 + (((tickAnim - 2) / 1) * (-9.43133-(-11.35952)));
            zz = -29.66371 + (((tickAnim - 2) / 1) * (-34.85503-(-29.66371)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -7.65571 + (((tickAnim - 3) / 3) * (-6.78971-(-7.65571)));
            yy = -9.43133 + (((tickAnim - 3) / 3) * (-3.63435-(-9.43133)));
            zz = -34.85503 + (((tickAnim - 3) / 3) * (-39.72321-(-34.85503)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -6.78971 + (((tickAnim - 6) / 2) * (-37.95919-(-6.78971)));
            yy = -3.63435 + (((tickAnim - 6) / 2) * (20.21101-(-3.63435)));
            zz = -39.72321 + (((tickAnim - 6) / 2) * (-83.72584-(-39.72321)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -37.95919 + (((tickAnim - 8) / 5) * (95.68994-(-37.95919)));
            yy = 20.21101 + (((tickAnim - 8) / 5) * (20.59888-(20.21101)));
            zz = -83.72584 + (((tickAnim - 8) / 5) * (54.32004-(-83.72584)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 95.68994 + (((tickAnim - 13) / 6) * (47.79128-(95.68994)));
            yy = 20.59888 + (((tickAnim - 13) / 6) * (-52.25247-(20.59888)));
            zz = 54.32004 + (((tickAnim - 13) / 6) * (56.9996-(54.32004)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 47.79128 + (((tickAnim - 19) / 4) * (-11.13419-(47.79128)));
            yy = -52.25247 + (((tickAnim - 19) / 4) * (-25.2447-(-52.25247)));
            zz = 56.9996 + (((tickAnim - 19) / 4) * (14.95005-(56.9996)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -11.13419 + (((tickAnim - 23) / 3) * (-0.96787-(-11.13419)));
            yy = -25.2447 + (((tickAnim - 23) / 3) * (-15.30467-(-25.2447)));
            zz = 14.95005 + (((tickAnim - 23) / 3) * (-5.75374-(14.95005)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-0.2-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -0.2 + (((tickAnim - 1) / 1) * (-0.45-(-0.2)));
            yy = 0.175 + (((tickAnim - 1) / 1) * (0-(0.175)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.45 + (((tickAnim - 2) / 1) * (-0.575-(-0.45)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -0.575 + (((tickAnim - 3) / 0) * (-0.625-(-0.575)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -0.625 + (((tickAnim - 3) / 1) * (-0.56-(-0.625)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -0.56 + (((tickAnim - 4) / 1) * (-0.465-(-0.56)));
            yy = 0 + (((tickAnim - 4) / 1) * (-0.16-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -0.465 + (((tickAnim - 5) / 1) * (-0.35-(-0.465)));
            yy = -0.16 + (((tickAnim - 5) / 1) * (-0.375-(-0.16)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -0.35 + (((tickAnim - 6) / 2) * (-0.285-(-0.35)));
            yy = -0.375 + (((tickAnim - 6) / 2) * (-0.35-(-0.375)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 26) {
            xx = -0.285 + (((tickAnim - 8) / 18) * (0-(-0.285)));
            yy = -0.35 + (((tickAnim - 8) / 18) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 8) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 76.2754 + (((tickAnim - 0) / 6) * (5.59469-(76.2754)));
            yy = 34.3646 + (((tickAnim - 0) / 6) * (-10.0765-(34.3646)));
            zz = 56.0911 + (((tickAnim - 0) / 6) * (32.3592-(56.0911)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 5.59469 + (((tickAnim - 6) / 6) * (9.75-(5.59469)));
            yy = -10.0765 + (((tickAnim - 6) / 6) * (-53.75-(-10.0765)));
            zz = 32.3592 + (((tickAnim - 6) / 6) * (0-(32.3592)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 9.75 + (((tickAnim - 12) / 6) * (5.73404-(9.75)));
            yy = -53.75 + (((tickAnim - 12) / 6) * (-4.35453-(-53.75)));
            zz = 0 + (((tickAnim - 12) / 6) * (32.94332-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 5.73404 + (((tickAnim - 18) / 8) * (76.2754-(5.73404)));
            yy = -4.35453 + (((tickAnim - 18) / 8) * (34.3646-(-4.35453)));
            zz = 32.94332 + (((tickAnim - 18) / 8) * (56.0911-(32.94332)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 15.23642 + (((tickAnim - 0) / 6) * (10.22148-(15.23642)));
            yy = 40.039 + (((tickAnim - 0) / 6) * (22.0019-(40.039)));
            zz = 0.4269 + (((tickAnim - 0) / 6) * (-5.0193-(0.4269)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 10.22148 + (((tickAnim - 6) / 3) * (3.28342-(10.22148)));
            yy = 22.0019 + (((tickAnim - 6) / 3) * (-11.5812-(22.0019)));
            zz = -5.0193 + (((tickAnim - 6) / 3) * (-2.2079-(-5.0193)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 3.28342 + (((tickAnim - 9) / 3) * (0-(3.28342)));
            yy = -11.5812 + (((tickAnim - 9) / 3) * (0-(-11.5812)));
            zz = -2.2079 + (((tickAnim - 9) / 3) * (0-(-2.2079)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (73.13071-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (41.32171-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (-57.29994-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 73.13071 + (((tickAnim - 18) / 8) * (15.23642-(73.13071)));
            yy = 41.32171 + (((tickAnim - 18) / 8) * (40.039-(41.32171)));
            zz = -57.29994 + (((tickAnim - 18) / 8) * (0.4269-(-57.29994)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 6 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 95.68994 + (((tickAnim - 0) / 6) * (47.79128-(95.68994)));
            yy = -20.5989 + (((tickAnim - 0) / 6) * (52.2525-(-20.5989)));
            zz = -54.32 + (((tickAnim - 0) / 6) * (-56.9996-(-54.32)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 47.79128 + (((tickAnim - 6) / 3) * (0-(47.79128)));
            yy = 52.2525 + (((tickAnim - 6) / 3) * (0-(52.2525)));
            zz = -56.9996 + (((tickAnim - 6) / 3) * (0-(-56.9996)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (-0.96787-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (15.3047-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (5.7537-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -0.96787 + (((tickAnim - 12) / 1) * (-18.78399-(-0.96787)));
            yy = 15.3047 + (((tickAnim - 12) / 1) * (16.27649-(15.3047)));
            zz = 5.7537 + (((tickAnim - 12) / 1) * (22.24103-(5.7537)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -18.78399 + (((tickAnim - 13) / 2) * (-32.97361-(-18.78399)));
            yy = 16.27649 + (((tickAnim - 13) / 2) * (11.05849-(16.27649)));
            zz = 22.24103 + (((tickAnim - 13) / 2) * (38.92388-(22.24103)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -32.97361 + (((tickAnim - 15) / 3) * (-34.86569-(-32.97361)));
            yy = 11.05849 + (((tickAnim - 15) / 3) * (1.5672-(11.05849)));
            zz = 38.92388 + (((tickAnim - 15) / 3) * (54.94704-(38.92388)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -34.86569 + (((tickAnim - 18) / 4) * (-74.85927-(-34.86569)));
            yy = 1.5672 + (((tickAnim - 18) / 4) * (-34.22586-(1.5672)));
            zz = 54.94704 + (((tickAnim - 18) / 4) * (101.83659-(54.94704)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -74.85927 + (((tickAnim - 22) / 4) * (95.68994-(-74.85927)));
            yy = -34.22586 + (((tickAnim - 22) / 4) * (-20.5989-(-34.22586)));
            zz = 101.83659 + (((tickAnim - 22) / 4) * (-54.32-(101.83659)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0.225-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0.225 + (((tickAnim - 15) / 3) * (0.4-(0.225)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0.225-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0.4 + (((tickAnim - 18) / 0) * (0.45-(0.4)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0.225 + (((tickAnim - 18) / 0) * (0.275-(0.225)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0.45 + (((tickAnim - 18) / 1) * (0.275-(0.45)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0.275 + (((tickAnim - 18) / 1) * (0.225-(0.275)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0.275 + (((tickAnim - 19) / 3) * (0-(0.275)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0.225 + (((tickAnim - 19) / 3) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*278+100))*-5), Neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*278+150))*-5), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTetrapodophis entity = (EntityPrehistoricFloraTetrapodophis) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-7), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*1.5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*-1.8);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0);
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-100))*-7), body1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-200))*-7), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-350))*7), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-4050))*7), body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-400))*7), body5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(0), body6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*7), body6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(pelvis, pelvis.rotateAngleX + (float) Math.toRadians(0), pelvis.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-450))*7), pelvis.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(37.78497), leftLeg1.rotateAngleY + (float) Math.toRadians(-80.247), leftLeg1.rotateAngleZ + (float) Math.toRadians(28.4547));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(97.75069), leftLeg2.rotateAngleY + (float) Math.toRadians(43.47347), leftLeg2.rotateAngleZ + (float) Math.toRadians(-48.25225));
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(37.78497), rightLeg1.rotateAngleY + (float) Math.toRadians(80.24697), rightLeg1.rotateAngleZ + (float) Math.toRadians(-28.45468));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(97.75069), rightLeg2.rotateAngleY + (float) Math.toRadians(-43.4735), rightLeg2.rotateAngleZ + (float) Math.toRadians(48.2523));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-500))*15), tail1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-450))*15), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-350))*-15), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0), leftArm1.rotateAngleY + (float) Math.toRadians(-44), leftArm1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(30.13819), leftArm2.rotateAngleY + (float) Math.toRadians(-54.65278), leftArm2.rotateAngleZ + (float) Math.toRadians(-4.78427));
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(-0.82409), leftHand.rotateAngleY + (float) Math.toRadians(-35.78302), leftHand.rotateAngleZ + (float) Math.toRadians(32.79563));
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0), rightArm1.rotateAngleY + (float) Math.toRadians(44), rightArm1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(30.13819), rightArm2.rotateAngleY + (float) Math.toRadians(54.6528), rightArm2.rotateAngleZ + (float) Math.toRadians(4.7843));
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(-0.82409), rightHand.rotateAngleY + (float) Math.toRadians(35.783), rightHand.rotateAngleZ + (float) Math.toRadians(-32.7956));
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+100))*-5), Neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.76+150))*-5), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraTetrapodophis entity = (EntityPrehistoricFloraTetrapodophis) entitylivingbaseIn;
        int animCycle = 10;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-50))*-10), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75+50))*3));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75+50))*-2);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-100))*-10), body1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-200))*-10), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-350))*10), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-4050))*10), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-400))*10), body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(0), body6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-50))*10), body6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pelvis, pelvis.rotateAngleX + (float) Math.toRadians(0), pelvis.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-450))*10), pelvis.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 14.32793 + (((tickAnim - 0) / 2) * (-1.46206-(14.32793)));
            yy = -61.561 + (((tickAnim - 0) / 2) * (-13.1325-(-61.561)));
            zz = -4.26452 + (((tickAnim - 0) / 2) * (-23.942-(-4.26452)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -1.46206 + (((tickAnim - 2) / 3) * (0-(-1.46206)));
            yy = -13.1325 + (((tickAnim - 2) / 3) * (27.25-(-13.1325)));
            zz = -23.942 + (((tickAnim - 2) / 3) * (0-(-23.942)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (-0.05844-(0)));
            yy = 27.25 + (((tickAnim - 5) / 2) * (-15.3886-(27.25)));
            zz = 0 + (((tickAnim - 5) / 2) * (-23.7651-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -0.05844 + (((tickAnim - 7) / 3) * (14.32793-(-0.05844)));
            yy = -15.3886 + (((tickAnim - 7) / 3) * (-61.561-(-15.3886)));
            zz = -23.7651 + (((tickAnim - 7) / 3) * (-4.26452-(-23.7651)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 154.66009 + (((tickAnim - 0) / 1) * (147.92366-(154.66009)));
            yy = -0.08426 + (((tickAnim - 0) / 1) * (1.67836-(-0.08426)));
            zz = -78.15985 + (((tickAnim - 0) / 1) * (-69.09551-(-78.15985)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 147.92366 + (((tickAnim - 1) / 1) * (148.74415-(147.92366)));
            yy = 1.67836 + (((tickAnim - 1) / 1) * (25.9238-(1.67836)));
            zz = -69.09551 + (((tickAnim - 1) / 1) * (-66.3565-(-69.09551)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 148.74415 + (((tickAnim - 2) / 1) * (114.53949-(148.74415)));
            yy = 25.9238 + (((tickAnim - 2) / 1) * (36.4119-(25.9238)));
            zz = -66.3565 + (((tickAnim - 2) / 1) * (-67.2737-(-66.3565)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 114.53949 + (((tickAnim - 3) / 2) * (78.16705-(114.53949)));
            yy = 36.4119 + (((tickAnim - 3) / 2) * (45.7548-(36.4119)));
            zz = -67.2737 + (((tickAnim - 3) / 2) * (-58.2295-(-67.2737)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 78.16705 + (((tickAnim - 5) / 2) * (136.28568-(78.16705)));
            yy = 45.7548 + (((tickAnim - 5) / 2) * (29.0848-(45.7548)));
            zz = -58.2295 + (((tickAnim - 5) / 2) * (-26.338-(-58.2295)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 136.28568 + (((tickAnim - 7) / 3) * (154.66009-(136.28568)));
            yy = 29.0848 + (((tickAnim - 7) / 3) * (-0.08426-(29.0848)));
            zz = -26.338 + (((tickAnim - 7) / 3) * (-78.15985-(-26.338)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 2) / 3) * (0-(0.225)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 14.97881 + (((tickAnim - 0) / 1) * (30.09907-(14.97881)));
            yy = -17.8023 + (((tickAnim - 0) / 1) * (-24.5358-(-17.8023)));
            zz = 41.1639 + (((tickAnim - 0) / 1) * (79.8994-(41.1639)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 30.09907 + (((tickAnim - 1) / 2) * (30.83142-(30.09907)));
            yy = -24.5358 + (((tickAnim - 1) / 2) * (-14.6412-(-24.5358)));
            zz = 79.8994 + (((tickAnim - 1) / 2) * (67.0903-(79.8994)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 30.83142 + (((tickAnim - 3) / 0) * (-0.25359-(30.83142)));
            yy = -14.6412 + (((tickAnim - 3) / 0) * (-9.775-(-14.6412)));
            zz = 67.0903 + (((tickAnim - 3) / 0) * (25.7082-(67.0903)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.25359 + (((tickAnim - 3) / 2) * (0-(-0.25359)));
            yy = -9.775 + (((tickAnim - 3) / 2) * (0-(-9.775)));
            zz = 25.7082 + (((tickAnim - 3) / 2) * (0-(25.7082)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (-48.72265-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-8.1785-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-55.9602-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -48.72265 + (((tickAnim - 7) / 3) * (14.97881-(-48.72265)));
            yy = -8.1785 + (((tickAnim - 7) / 3) * (-17.8023-(-8.1785)));
            zz = -55.9602 + (((tickAnim - 7) / 3) * (41.16394-(-55.9602)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.225 + (((tickAnim - 0) / 10) * (0.225-(0.225)));
            zz = 0.15 + (((tickAnim - 0) / 10) * (0.15-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.05844-(0)));
            yy = -27.25 + (((tickAnim - 0) / 2) * (15.38865-(-27.25)));
            zz = 0 + (((tickAnim - 0) / 2) * (23.76507-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -0.05844 + (((tickAnim - 2) / 3) * (14.32793-(-0.05844)));
            yy = 15.38865 + (((tickAnim - 2) / 3) * (61.561-(15.38865)));
            zz = 23.76507 + (((tickAnim - 2) / 3) * (4.2645-(23.76507)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 14.32793 + (((tickAnim - 5) / 3) * (-1.46206-(14.32793)));
            yy = 61.561 + (((tickAnim - 5) / 3) * (13.13247-(61.561)));
            zz = 4.2645 + (((tickAnim - 5) / 3) * (23.94204-(4.2645)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1.46206 + (((tickAnim - 8) / 2) * (0-(-1.46206)));
            yy = 13.13247 + (((tickAnim - 8) / 2) * (-27.25-(13.13247)));
            zz = 23.94204 + (((tickAnim - 8) / 2) * (0-(23.94204)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 78.16705 + (((tickAnim - 0) / 2) * (136.28568-(78.16705)));
            yy = -45.75478 + (((tickAnim - 0) / 2) * (-29.08483-(-45.75478)));
            zz = 58.22945 + (((tickAnim - 0) / 2) * (26.338-(58.22945)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 136.28568 + (((tickAnim - 2) / 3) * (154.66009-(136.28568)));
            yy = -29.08483 + (((tickAnim - 2) / 3) * (0.0843-(-29.08483)));
            zz = 26.338 + (((tickAnim - 2) / 3) * (78.1598-(26.338)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 154.66009 + (((tickAnim - 5) / 3) * (148.74415-(154.66009)));
            yy = 0.0843 + (((tickAnim - 5) / 3) * (-25.9238-(0.0843)));
            zz = 78.1598 + (((tickAnim - 5) / 3) * (66.35652-(78.1598)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 148.74415 + (((tickAnim - 8) / 1) * (114.53949-(148.74415)));
            yy = -25.9238 + (((tickAnim - 8) / 1) * (-36.41185-(-25.9238)));
            zz = 66.35652 + (((tickAnim - 8) / 1) * (67.27372-(66.35652)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 114.53949 + (((tickAnim - 9) / 1) * (78.16705-(114.53949)));
            yy = -36.41185 + (((tickAnim - 9) / 1) * (-45.75478-(-36.41185)));
            zz = 67.27372 + (((tickAnim - 9) / 1) * (58.22945-(67.27372)));
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
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.225-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.225 + (((tickAnim - 8) / 2) * (0-(0.225)));
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




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-48.72265-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (8.17853-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (55.9602-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -48.72265 + (((tickAnim - 2) / 3) * (14.97881-(-48.72265)));
            yy = 8.17853 + (((tickAnim - 2) / 3) * (17.8023-(8.17853)));
            zz = 55.9602 + (((tickAnim - 2) / 3) * (-41.1639-(55.9602)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 14.97881 + (((tickAnim - 5) / 3) * (30.83142-(14.97881)));
            yy = 17.8023 + (((tickAnim - 5) / 3) * (14.64124-(17.8023)));
            zz = -41.1639 + (((tickAnim - 5) / 3) * (-67.09034-(-41.1639)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 30.83142 + (((tickAnim - 8) / 1) * (-0.25359-(30.83142)));
            yy = 14.64124 + (((tickAnim - 8) / 1) * (9.77502-(14.64124)));
            zz = -67.09034 + (((tickAnim - 8) / 1) * (-25.70818-(-67.09034)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -0.25359 + (((tickAnim - 9) / 1) * (0-(-0.25359)));
            yy = 9.77502 + (((tickAnim - 9) / 1) * (0-(9.77502)));
            zz = -25.70818 + (((tickAnim - 9) / 1) * (0-(-25.70818)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(0);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(0.225);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(0.15);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-500))*20), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-450))*20), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-350))*-20), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 9.75 + (((tickAnim - 0) / 5) * (76.2754-(9.75)));
            yy = 53.75 + (((tickAnim - 0) / 5) * (-34.3646-(53.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (-56.0911-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 76.2754 + (((tickAnim - 5) / 3) * (5.59469-(76.2754)));
            yy = -34.3646 + (((tickAnim - 5) / 3) * (10.0765-(-34.3646)));
            zz = -56.0911 + (((tickAnim - 5) / 3) * (-32.35915-(-56.0911)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5.59469 + (((tickAnim - 8) / 2) * (9.75-(5.59469)));
            yy = 10.0765 + (((tickAnim - 8) / 2) * (53.75-(10.0765)));
            zz = -32.35915 + (((tickAnim - 8) / 2) * (0-(-32.35915)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (101.18286-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (13.70348-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (105.95865-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 101.18286 + (((tickAnim - 2) / 3) * (15.23642-(101.18286)));
            yy = 13.70348 + (((tickAnim - 2) / 3) * (-40.039-(13.70348)));
            zz = 105.95865 + (((tickAnim - 2) / 3) * (0.4269-(105.95865)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 15.23642 + (((tickAnim - 5) / 3) * (10.22148-(15.23642)));
            yy = -40.039 + (((tickAnim - 5) / 3) * (-22.00193-(-40.039)));
            zz = 0.4269 + (((tickAnim - 5) / 3) * (5.01926-(0.4269)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 10.22148 + (((tickAnim - 8) / 1) * (3.28342-(10.22148)));
            yy = -22.00193 + (((tickAnim - 8) / 1) * (11.58116-(-22.00193)));
            zz = 5.01926 + (((tickAnim - 8) / 1) * (2.20793-(5.01926)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 3.28342 + (((tickAnim - 9) / 1) * (0-(3.28342)));
            yy = 11.58116 + (((tickAnim - 9) / 1) * (0-(11.58116)));
            zz = 2.20793 + (((tickAnim - 9) / 1) * (0-(2.20793)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -0.96787 + (((tickAnim - 0) / 1) * (-1.76023-(-0.96787)));
            yy = -15.30467 + (((tickAnim - 0) / 1) * (-12.15643-(-15.30467)));
            zz = -5.75374 + (((tickAnim - 0) / 1) * (-31.09272-(-5.75374)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -1.76023 + (((tickAnim - 1) / 1) * (0.09432-(-1.76023)));
            yy = -12.15643 + (((tickAnim - 1) / 1) * (-22.53075-(-12.15643)));
            zz = -31.09272 + (((tickAnim - 1) / 1) * (-31.00437-(-31.09272)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.09432 + (((tickAnim - 2) / 1) * (-37.95919-(0.09432)));
            yy = -22.53075 + (((tickAnim - 2) / 1) * (20.21101-(-22.53075)));
            zz = -31.00437 + (((tickAnim - 2) / 1) * (-83.72584-(-31.00437)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -37.95919 + (((tickAnim - 3) / 2) * (95.68994-(-37.95919)));
            yy = 20.21101 + (((tickAnim - 3) / 2) * (20.59888-(20.21101)));
            zz = -83.72584 + (((tickAnim - 3) / 2) * (54.32004-(-83.72584)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 95.68994 + (((tickAnim - 5) / 3) * (47.79128-(95.68994)));
            yy = 20.59888 + (((tickAnim - 5) / 3) * (-52.25247-(20.59888)));
            zz = 54.32004 + (((tickAnim - 5) / 3) * (56.9996-(54.32004)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 47.79128 + (((tickAnim - 8) / 1) * (-11.13419-(47.79128)));
            yy = -52.25247 + (((tickAnim - 8) / 1) * (-25.2447-(-52.25247)));
            zz = 56.9996 + (((tickAnim - 8) / 1) * (14.95005-(56.9996)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -11.13419 + (((tickAnim - 9) / 1) * (-0.96787-(-11.13419)));
            yy = -25.2447 + (((tickAnim - 9) / 1) * (-15.30467-(-25.2447)));
            zz = 14.95005 + (((tickAnim - 9) / 1) * (-5.75374-(14.95005)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-0.8-(0)));
            yy = 0.425 + (((tickAnim - 0) / 1) * (0.15-(0.425)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -0.8 + (((tickAnim - 1) / 1) * (-0.725-(-0.8)));
            yy = 0.15 + (((tickAnim - 1) / 1) * (0-(0.15)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.725 + (((tickAnim - 2) / 1) * (-0.685-(-0.725)));
            yy = 0 + (((tickAnim - 2) / 1) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -0.685 + (((tickAnim - 3) / 7) * (0-(-0.685)));
            yy = -0.35 + (((tickAnim - 3) / 7) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 76.2754 + (((tickAnim - 0) / 2) * (5.59469-(76.2754)));
            yy = 34.3646 + (((tickAnim - 0) / 2) * (-10.0765-(34.3646)));
            zz = 56.0911 + (((tickAnim - 0) / 2) * (32.3592-(56.0911)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 5.59469 + (((tickAnim - 2) / 3) * (9.75-(5.59469)));
            yy = -10.0765 + (((tickAnim - 2) / 3) * (-53.75-(-10.0765)));
            zz = 32.3592 + (((tickAnim - 2) / 3) * (0-(32.3592)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 9.75 + (((tickAnim - 5) / 3) * (5.73404-(9.75)));
            yy = -53.75 + (((tickAnim - 5) / 3) * (-4.35453-(-53.75)));
            zz = 0 + (((tickAnim - 5) / 3) * (32.94332-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5.73404 + (((tickAnim - 8) / 2) * (76.2754-(5.73404)));
            yy = -4.35453 + (((tickAnim - 8) / 2) * (34.3646-(-4.35453)));
            zz = 32.94332 + (((tickAnim - 8) / 2) * (56.0911-(32.94332)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 15.23642 + (((tickAnim - 0) / 2) * (10.22148-(15.23642)));
            yy = 40.039 + (((tickAnim - 0) / 2) * (22.0019-(40.039)));
            zz = 0.4269 + (((tickAnim - 0) / 2) * (-5.0193-(0.4269)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10.22148 + (((tickAnim - 2) / 1) * (3.28342-(10.22148)));
            yy = 22.0019 + (((tickAnim - 2) / 1) * (-11.5812-(22.0019)));
            zz = -5.0193 + (((tickAnim - 2) / 1) * (-2.2079-(-5.0193)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.28342 + (((tickAnim - 3) / 2) * (0-(3.28342)));
            yy = -11.5812 + (((tickAnim - 3) / 2) * (0-(-11.5812)));
            zz = -2.2079 + (((tickAnim - 3) / 2) * (0-(-2.2079)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (73.13071-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (41.32171-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-57.29994-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 73.13071 + (((tickAnim - 8) / 2) * (15.23642-(73.13071)));
            yy = 41.32171 + (((tickAnim - 8) / 2) * (40.039-(41.32171)));
            zz = -57.29994 + (((tickAnim - 8) / 2) * (0.4269-(-57.29994)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
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
            xx = 95.68994 + (((tickAnim - 0) / 2) * (47.79128-(95.68994)));
            yy = -20.5989 + (((tickAnim - 0) / 2) * (52.2525-(-20.5989)));
            zz = -54.32 + (((tickAnim - 0) / 2) * (-56.9996-(-54.32)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 47.79128 + (((tickAnim - 2) / 1) * (0-(47.79128)));
            yy = 52.2525 + (((tickAnim - 2) / 1) * (0-(52.2525)));
            zz = -56.9996 + (((tickAnim - 2) / 1) * (0-(-56.9996)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-0.96787-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (15.3047-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (5.7537-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.96787 + (((tickAnim - 5) / 3) * (-34.86569-(-0.96787)));
            yy = 15.3047 + (((tickAnim - 5) / 3) * (1.5672-(15.3047)));
            zz = 5.7537 + (((tickAnim - 5) / 3) * (54.94704-(5.7537)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -34.86569 + (((tickAnim - 8) / 1) * (-74.85927-(-34.86569)));
            yy = 1.5672 + (((tickAnim - 8) / 1) * (-34.22586-(1.5672)));
            zz = 54.94704 + (((tickAnim - 8) / 1) * (101.83659-(54.94704)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -74.85927 + (((tickAnim - 9) / 1) * (95.68994-(-74.85927)));
            yy = -34.22586 + (((tickAnim - 9) / 1) * (-20.5989-(-34.22586)));
            zz = 101.83659 + (((tickAnim - 9) / 1) * (-54.32-(101.83659)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0.225 + (((tickAnim - 5) / 1) * (0.3-(0.225)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.35-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0.1-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0.3 + (((tickAnim - 6) / 1) * (0.4-(0.3)));
            yy = 0.35 + (((tickAnim - 6) / 1) * (0.7-(0.35)));
            zz = 0.1 + (((tickAnim - 6) / 1) * (0.225-(0.1)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0.4 + (((tickAnim - 7) / 1) * (0.55-(0.4)));
            yy = 0.7 + (((tickAnim - 7) / 1) * (0-(0.7)));
            zz = 0.225 + (((tickAnim - 7) / 1) * (0.225-(0.225)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0.55 + (((tickAnim - 8) / 1) * (0-(0.55)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0.225 + (((tickAnim - 8) / 1) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75+100))*-5), Neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75+150))*-5), head.rotateAngleZ + (float) Math.toRadians(0));

    }


        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTetrapodophis e = (EntityPrehistoricFloraTetrapodophis) entity;
        animator.update(entity);

            animator.setAnimation(e.ROAR_ANIMATION);
            animator.startKeyframe(10);
            animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.endKeyframe();
            animator.setStaticKeyframe(10);
            animator.resetKeyframe(10);

    }
}
