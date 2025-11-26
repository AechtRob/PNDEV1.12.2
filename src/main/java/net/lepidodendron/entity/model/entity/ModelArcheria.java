package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraArcheria;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelArcheria extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer FACELEFT;
    private final AdvancedModelRenderer FACERIGHT;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer JAWLEFT;
    private final AdvancedModelRenderer JAWRIGHT;

    private ModelAnimator animator;

    public ModelArcheria() {
        this.textureWidth = 61;
        this.textureHeight = 56;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 18.75F, 3.25F);
        this.hips.cubeList.add(new ModelBox(hips, 30, 11, -2.0F, -2.5F, -4.5F, 4, 6, 8, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.0F, 2.0F, -0.5F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -1.3526F, -0.7854F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 30, 26, -1.0F, -1.0F, -1.0F, 2, 3, 2, 0.01F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.8727F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 19, -1.0F, -0.25F, -1.0F, 2, 3, 2, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 2.75F, 0.0F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -1.0577F, 0.3463F, 0.189F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 17, 24, -1.5F, -0.5F, -0.5F, 3, 3, 1, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.0F, 2.0F, -0.5F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -1.3526F, 0.7854F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 30, 26, -1.0F, -1.0F, -1.0F, 2, 3, 2, 0.01F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.8727F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 19, -1.0F, -0.25F, -1.0F, 2, 3, 2, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 2.75F, 0.0F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -1.0577F, -0.3463F, -0.189F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 17, 24, -1.5F, -0.5F, -0.5F, 3, 3, 1, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 19, -1.5F, -1.75F, -0.75F, 3, 4, 10, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 17, 24, -0.5F, -2.5F, -0.25F, 1, 6, 10, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 9.25F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 30, 31, -1.0F, -1.25F, -1.0F, 2, 3, 10, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 34, 0.0F, -2.5F, 0.0F, 0, 6, 9, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 42, 0, -0.5F, -0.75F, -1.0F, 1, 2, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, 0.0F, -2.5F, 0.0F, 0, 6, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 10, 37, -0.5F, -0.5F, -0.25F, 1, 1, 4, -0.01F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 19, 41, -0.075F, -2.25F, 0.0F, 0, 5, 6, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.25F, -3.5F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -1.5F, -11.0F, 5, 6, 12, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 23, 0, -2.0F, -1.25F, -4.0F, 4, 5, 5, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.0F, 2.75F, -2.5F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 1.1345F, 0.7854F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 45, 35, -1.0F, -1.0F, -1.0F, 2, 3, 2, 0.01F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.9163F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 34, -1.0F, -0.25F, -1.0F, 2, 3, 2, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 2.75F, 0.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, -1.8525F, -0.6784F, 0.1797F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 17, 24, -1.5F, -0.5F, -0.5F, 3, 3, 1, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.0F, 2.75F, -2.5F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 1.1345F, -0.7854F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 45, 35, -1.0F, -1.0F, -1.0F, 2, 3, 2, 0.01F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.9163F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 34, -1.0F, -0.25F, -1.0F, 2, 3, 2, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 2.75F, 0.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, -1.8525F, 0.6784F, -0.1797F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 17, 24, -1.5F, -0.5F, -0.5F, 3, 3, 1, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.25F, -4.0F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.1309F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 45, 26, -1.5F, -1.25F, -3.0F, 3, 4, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 47, 9, -0.5F, -0.25F, -5.75F, 1, 1, 6, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 3, -0.5F, 0.25F, -5.65F, 1, 1, 0, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 23, 0, -0.5F, 0.0F, -5.45F, 1, 1, 1, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.25F, -4.75F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 50, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube = new AdvancedModelRenderer(this);
        this.cube.setRotationPoint(0.0F, -0.25F, -4.75F);
        this.head.addChild(cube);
        this.setRotateAngle(cube, 0.1745F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.cube.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 25, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.FACELEFT = new AdvancedModelRenderer(this);
        this.FACELEFT.setRotationPoint(0.5F, 0.5F, -4.75F);
        this.head.addChild(FACELEFT);
        this.setRotateAngle(FACELEFT, 0.0F, 0.2182F, 0.0F);
        this.FACELEFT.cubeList.add(new ModelBox(FACELEFT, 47, 45, -1.0F, -0.75F, 0.0F, 1, 1, 5, 0.0F, false));
        this.FACELEFT.cubeList.add(new ModelBox(FACELEFT, 17, 19, -0.05F, -0.5F, 0.5F, 0, 1, 1, 0.0F, false));
        this.FACELEFT.cubeList.add(new ModelBox(FACELEFT, 17, 19, -0.05F, -0.5F, 1.75F, 0, 1, 1, 0.0F, false));

        this.FACERIGHT = new AdvancedModelRenderer(this);
        this.FACERIGHT.setRotationPoint(-0.5F, 0.5F, -4.75F);
        this.head.addChild(FACERIGHT);
        this.setRotateAngle(FACERIGHT, 0.0F, -0.2182F, 0.0F);
        this.FACERIGHT.cubeList.add(new ModelBox(FACERIGHT, 47, 45, 0.0F, -0.75F, 0.0F, 1, 1, 5, 0.0F, true));
        this.FACERIGHT.cubeList.add(new ModelBox(FACERIGHT, 17, 19, 0.05F, -0.5F, 0.5F, 0, 1, 1, 0.0F, true));
        this.FACERIGHT.cubeList.add(new ModelBox(FACERIGHT, 17, 19, 0.05F, -0.5F, 1.75F, 0, 1, 1, 0.0F, true));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(0.0F, -0.5F, -2.25F);
        this.head.addChild(leftEye);
        this.setRotateAngle(leftEye, -0.0873F, 0.2443F, -0.3491F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(0.0F, -0.5F, -2.25F);
        this.head.addChild(rightEye);
        this.setRotateAngle(rightEye, -0.0873F, -0.2443F, 0.3491F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 0, 0, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5F, -0.25F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 32, 45, -0.5F, 0.25F, -5.45F, 1, 1, 6, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 6, 0, -0.5F, 0.0F, -5.45F, 1, 1, 1, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.25F, -1.2F);
        this.jaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4363F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 26, -1.0F, -1.55F, 0.0F, 2, 2, 1, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.25F, -4.5F);
        this.jaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 19, -1.0F, -1.0F, 3.0F, 2, 1, 3, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 41, 45, -0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.JAWLEFT = new AdvancedModelRenderer(this);
        this.JAWLEFT.setRotationPoint(0.5F, 1.25F, -4.5F);
        this.jaw.addChild(JAWLEFT);
        this.setRotateAngle(JAWLEFT, 0.0F, 0.2182F, 0.0F);
        this.JAWLEFT.cubeList.add(new ModelBox(JAWLEFT, 0, 50, -1.0F, -1.0F, 0.0F, 1, 1, 5, -0.01F, false));
        this.JAWLEFT.cubeList.add(new ModelBox(JAWLEFT, 17, 19, -0.05F, -1.25F, 0.25F, 0, 1, 1, 0.0F, false));
        this.JAWLEFT.cubeList.add(new ModelBox(JAWLEFT, 17, 19, -0.05F, -1.25F, 1.5F, 0, 1, 1, 0.0F, false));

        this.JAWRIGHT = new AdvancedModelRenderer(this);
        this.JAWRIGHT.setRotationPoint(-0.5F, 1.25F, -4.5F);
        this.jaw.addChild(JAWRIGHT);
        this.setRotateAngle(JAWRIGHT, 0.0F, -0.2182F, 0.0F);
        this.JAWRIGHT.cubeList.add(new ModelBox(JAWRIGHT, 0, 50, 0.0F, -1.0F, 0.0F, 1, 1, 5, -0.01F, true));
        this.JAWRIGHT.cubeList.add(new ModelBox(JAWRIGHT, 17, 19, 0.05F, -1.25F, 0.25F, 0, 1, 1, 0.0F, true));
        this.JAWRIGHT.cubeList.add(new ModelBox(JAWRIGHT, 17, 19, 0.05F, -1.25F, 1.5F, 0, 1, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.hips.render(f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
    //Rotations, positions and sizing:
        this.hips.offsetY = -0.6F;
        this.hips.offsetX = 0.09F;
        this.hips.rotateAngleY = (float)Math.toRadians(232);
        this.hips.rotateAngleX = (float)Math.toRadians(12);
        this.hips.rotateAngleZ = (float)Math.toRadians(-8);
        this.hips.scaleChildren = true;
        float scaler = 0.76F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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
        //this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 6, neck);
        this.faceTarget(f3, f4, 6, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};

        EntityPrehistoricFloraArcheria entitySilesaurus = (EntityPrehistoricFloraArcheria) e;

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


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

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraArcheria ee = (EntityPrehistoricFloraArcheria) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (ee.getIsFast()) { //Running
                animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArcheria entity = (EntityPrehistoricFloraArcheria) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287))*-3), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-50))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287))*0.3);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/0.5))*0.15);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 117.42281 + (((tickAnim - 0) / 4) * (91.2947-(117.42281)));
            yy = 16.41331 + (((tickAnim - 0) / 4) * (18.1292-(16.41331)));
            zz = -103.19521 + (((tickAnim - 0) / 4) * (-95.29368-(-103.19521)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 91.2947 + (((tickAnim - 4) / 4) * (55.89931-(91.2947)));
            yy = 18.1292 + (((tickAnim - 4) / 4) * (4.84401-(18.1292)));
            zz = -95.29368 + (((tickAnim - 4) / 4) * (-73.88545-(-95.29368)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 55.89931 + (((tickAnim - 8) / 5) * (-0.7001-(55.89931)));
            yy = 4.84401 + (((tickAnim - 8) / 5) * (12.281-(4.84401)));
            zz = -73.88545 + (((tickAnim - 8) / 5) * (2.7504-(-73.88545)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -0.7001 + (((tickAnim - 13) / 12) * (117.42281-(-0.7001)));
            yy = 12.281 + (((tickAnim - 13) / 12) * (16.41331-(12.281)));
            zz = 2.7504 + (((tickAnim - 13) / 12) * (-103.19521-(2.7504)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -12.5 + (((tickAnim - 0) / 4) * (-8.38645-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (-2.32598-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (2.61603-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = -8.38645 + (((tickAnim - 4) / 7) * (-29.68554-(-8.38645)));
            yy = -2.32598 + (((tickAnim - 4) / 7) * (-6.63702-(-2.32598)));
            zz = 2.61603 + (((tickAnim - 4) / 7) * (16.67042-(2.61603)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -29.68554 + (((tickAnim - 11) / 2) * (0-(-29.68554)));
            yy = -6.63702 + (((tickAnim - 11) / 2) * (0-(-6.63702)));
            zz = 16.67042 + (((tickAnim - 11) / 2) * (0-(16.67042)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 81.08571 + (((tickAnim - 0) / 4) * (106.05714-(81.08571)));
            yy = -46.62223 + (((tickAnim - 0) / 4) * (-31.08148-(-46.62223)));
            zz = -16.37098 + (((tickAnim - 0) / 4) * (-10.91399-(-16.37098)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 106.05714 + (((tickAnim - 4) / 4) * (38.02857-(106.05714)));
            yy = -31.08148 + (((tickAnim - 4) / 4) * (-15.54074-(-31.08148)));
            zz = -10.91399 + (((tickAnim - 4) / 4) * (-5.45699-(-10.91399)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 38.02857 + (((tickAnim - 8) / 5) * (0-(38.02857)));
            yy = -15.54074 + (((tickAnim - 8) / 5) * (0-(-15.54074)));
            zz = -5.45699 + (((tickAnim - 8) / 5) * (0-(-5.45699)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-20.92841-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (2.9039-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (24.28472-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -20.92841 + (((tickAnim - 18) / 7) * (81.08571-(-20.92841)));
            yy = 2.9039 + (((tickAnim - 18) / 7) * (-46.62223-(2.9039)));
            zz = 24.28472 + (((tickAnim - 18) / 7) * (-16.37098-(24.28472)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -0.7001 + (((tickAnim - 0) / 14) * (117.42281-(-0.7001)));
            yy = -12.28096 + (((tickAnim - 0) / 14) * (-16.4133-(-12.28096)));
            zz = -2.75039 + (((tickAnim - 0) / 14) * (103.1952-(-2.75039)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 117.42281 + (((tickAnim - 14) / 4) * (91.16682-(117.42281)));
            yy = -16.4133 + (((tickAnim - 14) / 4) * (-9.04212-(-16.4133)));
            zz = 103.1952 + (((tickAnim - 14) / 4) * (109.2144-(103.1952)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 91.16682 + (((tickAnim - 18) / 7) * (-0.7001-(91.16682)));
            yy = -9.04212 + (((tickAnim - 18) / 7) * (-12.28096-(-9.04212)));
            zz = 109.2144 + (((tickAnim - 18) / 7) * (-2.75039-(109.2144)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -12.5 + (((tickAnim - 14) / 4) * (-14.50579-(-12.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (17.89364-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (-12.3267-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -14.50579 + (((tickAnim - 18) / 5) * (-45.15758-(-14.50579)));
            yy = 17.89364 + (((tickAnim - 18) / 5) * (16.69847-(17.89364)));
            zz = -12.3267 + (((tickAnim - 18) / 5) * (-13.60398-(-12.3267)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -45.15758 + (((tickAnim - 23) / 2) * (0-(-45.15758)));
            yy = 16.69847 + (((tickAnim - 23) / 2) * (0-(16.69847)));
            zz = -13.60398 + (((tickAnim - 23) / 2) * (0-(-13.60398)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-15.985-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-9.12954-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-15.05496-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 14) {
            xx = -15.985 + (((tickAnim - 3) / 11) * (81.08571-(-15.985)));
            yy = -9.12954 + (((tickAnim - 3) / 11) * (46.6222-(-9.12954)));
            zz = -15.05496 + (((tickAnim - 3) / 11) * (16.371-(-15.05496)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 81.08571 + (((tickAnim - 14) / 4) * (72.65688-(81.08571)));
            yy = 46.6222 + (((tickAnim - 14) / 4) * (18.04613-(46.6222)));
            zz = 16.371 + (((tickAnim - 14) / 4) * (23.68894-(16.371)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 72.65688 + (((tickAnim - 18) / 5) * (25.30685-(72.65688)));
            yy = 18.04613 + (((tickAnim - 18) / 5) * (24.68639-(18.04613)));
            zz = 23.68894 + (((tickAnim - 18) / 5) * (-21.02937-(23.68894)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 25.30685 + (((tickAnim - 23) / 2) * (0-(25.30685)));
            yy = 24.68639 + (((tickAnim - 23) / 2) * (0-(24.68639)));
            zz = -21.02937 + (((tickAnim - 23) / 2) * (0-(-21.02937)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287+50))*-3), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-50))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-11.75), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287+90))*5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-50))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287+130))*5), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-50))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(2), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287+220))*-10), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-50))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-50))*3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-90))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-150))*-3), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-100))*-2));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -133.06185 + (((tickAnim - 0) / 13) * (20.43677-(-133.06185)));
            yy = 27.61353 + (((tickAnim - 0) / 13) * (-18.3229-(27.61353)));
            zz = -113.9612 + (((tickAnim - 0) / 13) * (5.6861-(-113.9612)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 20.43677 + (((tickAnim - 13) / 5) * (-15.22842-(20.43677)));
            yy = -18.3229 + (((tickAnim - 13) / 5) * (8.38538-(-18.3229)));
            zz = 5.6861 + (((tickAnim - 13) / 5) * (-47.6487-(5.6861)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -15.22842 + (((tickAnim - 18) / 4) * (-92.29508-(-15.22842)));
            yy = 8.38538 + (((tickAnim - 18) / 4) * (17.12751-(8.38538)));
            zz = -47.6487 + (((tickAnim - 18) / 4) * (-94.69041-(-47.6487)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -92.29508 + (((tickAnim - 22) / 3) * (-133.06185-(-92.29508)));
            yy = 17.12751 + (((tickAnim - 22) / 3) * (27.61353-(17.12751)));
            zz = -94.69041 + (((tickAnim - 22) / 3) * (-113.9612-(-94.69041)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.125-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 3) / 15) * (0-(0)));
            yy = -0.15 + (((tickAnim - 3) / 15) * (0-(-0.15)));
            zz = -0.125 + (((tickAnim - 3) / 15) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 18.43023 + (((tickAnim - 0) / 13) * (29.72254-(18.43023)));
            yy = -28.64422 + (((tickAnim - 0) / 13) * (-19.6054-(-28.64422)));
            zz = 5.60078 + (((tickAnim - 0) / 13) * (9.7654-(5.60078)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 29.72254 + (((tickAnim - 13) / 5) * (19.32638-(29.72254)));
            yy = -19.6054 + (((tickAnim - 13) / 5) * (-24.12481-(-19.6054)));
            zz = 9.7654 + (((tickAnim - 13) / 5) * (7.68309-(9.7654)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 19.32638 + (((tickAnim - 18) / 4) * (17.83972-(19.32638)));
            yy = -24.12481 + (((tickAnim - 18) / 4) * (-35.92825-(-24.12481)));
            zz = 7.68309 + (((tickAnim - 18) / 4) * (-14.59272-(7.68309)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 17.83972 + (((tickAnim - 22) / 3) * (18.43023-(17.83972)));
            yy = -35.92825 + (((tickAnim - 22) / 3) * (-28.64422-(-35.92825)));
            zz = -14.59272 + (((tickAnim - 22) / 3) * (5.60078-(-14.59272)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -3.12351 + (((tickAnim - 0) / 13) * (101.25-(-3.12351)));
            yy = -29.4613 + (((tickAnim - 0) / 13) * (0-(-29.4613)));
            zz = 40.76393 + (((tickAnim - 0) / 13) * (0-(40.76393)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 101.25 + (((tickAnim - 13) / 5) * (110.81324-(101.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (-14.73065-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (20.38197-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 110.81324 + (((tickAnim - 18) / 4) * (22.6088-(110.81324)));
            yy = -14.73065 + (((tickAnim - 18) / 4) * (-29.38981-(-14.73065)));
            zz = 20.38197 + (((tickAnim - 18) / 4) * (58.24559-(20.38197)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 22.6088 + (((tickAnim - 22) / 3) * (-3.12351-(22.6088)));
            yy = -29.38981 + (((tickAnim - 22) / 3) * (-29.4613-(-29.38981)));
            zz = 58.24559 + (((tickAnim - 22) / 3) * (40.76393-(58.24559)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 20.43677 + (((tickAnim - 0) / 4) * (-19.06254-(20.43677)));
            yy = 18.32292 + (((tickAnim - 0) / 4) * (-4.64529-(18.32292)));
            zz = -5.68611 + (((tickAnim - 0) / 4) * (54.13754-(-5.68611)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -19.06254 + (((tickAnim - 4) / 6) * (-135.31185-(-19.06254)));
            yy = -4.64529 + (((tickAnim - 4) / 6) * (-27.6135-(-4.64529)));
            zz = 54.13754 + (((tickAnim - 4) / 6) * (113.9612-(54.13754)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -135.31185 + (((tickAnim - 10) / 5) * (-86.14565-(-135.31185)));
            yy = -27.6135 + (((tickAnim - 10) / 5) * (-12.30136-(-27.6135)));
            zz = 113.9612 + (((tickAnim - 10) / 5) * (74.07876-(113.9612)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -86.14565 + (((tickAnim - 15) / 10) * (20.43677-(-86.14565)));
            yy = -12.30136 + (((tickAnim - 15) / 10) * (18.32292-(-12.30136)));
            zz = 74.07876 + (((tickAnim - 15) / 10) * (-5.68611-(74.07876)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 29.72254 + (((tickAnim - 0) / 8) * (4.7095-(29.72254)));
            yy = 19.60539 + (((tickAnim - 0) / 8) * (39.66752-(19.60539)));
            zz = -9.76543 + (((tickAnim - 0) / 8) * (5.15302-(-9.76543)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.7095 + (((tickAnim - 8) / 2) * (23.68023-(4.7095)));
            yy = 39.66752 + (((tickAnim - 8) / 2) * (28.6442-(39.66752)));
            zz = 5.15302 + (((tickAnim - 8) / 2) * (-5.6008-(5.15302)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 23.68023 + (((tickAnim - 10) / 5) * (18.36721-(23.68023)));
            yy = 28.6442 + (((tickAnim - 10) / 5) * (19.88453-(28.6442)));
            zz = -5.6008 + (((tickAnim - 10) / 5) * (-16.84918-(-5.6008)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 18.36721 + (((tickAnim - 15) / 10) * (29.72254-(18.36721)));
            yy = 19.88453 + (((tickAnim - 15) / 10) * (19.60539-(19.88453)));
            zz = -16.84918 + (((tickAnim - 15) / 10) * (-9.76543-(-16.84918)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.125-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.15 + (((tickAnim - 13) / 12) * (0-(-0.15)));
            zz = -0.125 + (((tickAnim - 13) / 12) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 101.25 + (((tickAnim - 0) / 4) * (135.56325-(101.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (14.73065-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-20.38195-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 135.56325 + (((tickAnim - 4) / 4) * (48.12607-(135.56325)));
            yy = 14.73065 + (((tickAnim - 4) / 4) * (21.04379-(14.73065)));
            zz = -20.38195 + (((tickAnim - 4) / 4) * (-29.11707-(-20.38195)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 48.12607 + (((tickAnim - 8) / 2) * (-3.1235-(48.12607)));
            yy = 21.04379 + (((tickAnim - 8) / 2) * (29.4613-(21.04379)));
            zz = -29.11707 + (((tickAnim - 8) / 2) * (-40.7639-(-29.11707)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -3.1235 + (((tickAnim - 10) / 5) * (12.40316-(-3.1235)));
            yy = 29.4613 + (((tickAnim - 10) / 5) * (21.49167-(29.4613)));
            zz = -40.7639 + (((tickAnim - 10) / 5) * (-29.35034-(-40.7639)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 12.40316 + (((tickAnim - 15) / 10) * (101.25-(12.40316)));
            yy = 21.49167 + (((tickAnim - 15) / 10) * (0-(21.49167)));
            zz = -29.35034 + (((tickAnim - 15) / 10) * (0-(-29.35034)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-170))*-5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-130))*-2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-230))*5), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-150))*-2));


    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArcheria entity = (EntityPrehistoricFloraArcheria) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287))*-3), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-50))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287))*0.3);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(125.31657), leftLeg1.rotateAngleY + (float) Math.toRadians(19.56722), leftLeg1.rotateAngleZ + (float) Math.toRadians(-93.33086));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-3.5), leftLeg2.rotateAngleY + (float) Math.toRadians(0), leftLeg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(83), leftFoot.rotateAngleY + (float) Math.toRadians(0), leftFoot.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(125.31657), rightLeg1.rotateAngleY + (float) Math.toRadians(-19.5672), rightLeg1.rotateAngleZ + (float) Math.toRadians(93.3309));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(3.5), rightLeg2.rotateAngleY + (float) Math.toRadians(0), rightLeg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(83), rightFoot.rotateAngleY + (float) Math.toRadians(0), rightFoot.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(6), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287+80))*-5), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-50))*2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-6), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287+130))*12), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-50))*2));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-4), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287+130))*18), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-50))*2));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(2), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287+220))*-28), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-50))*2));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-50))*3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-90))*2));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-150))*-3), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-100))*-2));
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(5.49882), leftArm.rotateAngleY + (float) Math.toRadians(-0.70643), leftArm.rotateAngleZ + (float) Math.toRadians(0.35407));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(37.39341), leftArm2.rotateAngleY + (float) Math.toRadians(7.88934), leftArm2.rotateAngleZ + (float) Math.toRadians(26.9523+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287+30))*4));
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(49.24965), leftArm3.rotateAngleY + (float) Math.toRadians(-35.14833), leftArm3.rotateAngleZ + (float) Math.toRadians(66.6224+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287))*-5));
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(5.33396), rightArm.rotateAngleY + (float) Math.toRadians(0.23536), rightArm.rotateAngleZ + (float) Math.toRadians(5.90283));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(37.39341), rightArm2.rotateAngleY + (float) Math.toRadians(-7.8893), rightArm2.rotateAngleZ + (float) Math.toRadians(-26.9523+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287))*4));
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(49.24965), rightArm3.rotateAngleY + (float) Math.toRadians(35.1483), rightArm3.rotateAngleZ + (float) Math.toRadians(-66.6224+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287))*-5));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-170))*-5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-130))*-2));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-230))*5), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-150))*-2));


    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArcheria entity = (EntityPrehistoricFloraArcheria) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.5);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(125.31657), leftLeg1.rotateAngleY + (float) Math.toRadians(19.56722), leftLeg1.rotateAngleZ + (float) Math.toRadians(-93.33086));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-3.5), leftLeg2.rotateAngleY + (float) Math.toRadians(0), leftLeg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(83), leftFoot.rotateAngleY + (float) Math.toRadians(0), leftFoot.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(125.31657), rightLeg1.rotateAngleY + (float) Math.toRadians(-19.5672), rightLeg1.rotateAngleZ + (float) Math.toRadians(93.3309));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(3.5), rightLeg2.rotateAngleY + (float) Math.toRadians(0), rightLeg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(83), rightFoot.rotateAngleY + (float) Math.toRadians(0), rightFoot.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(6), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*-10), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-6), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+130))*15), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*2));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-4), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+130))*20), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287-50))*2));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(2), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+220))*-30), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*2));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-90))*2));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-5), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*-2));
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(5.49882), leftArm.rotateAngleY + (float) Math.toRadians(-0.70643), leftArm.rotateAngleZ + (float) Math.toRadians(0.35407));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(37.39341), leftArm2.rotateAngleY + (float) Math.toRadians(7.88934), leftArm2.rotateAngleZ + (float) Math.toRadians(26.9523+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+30))*4));
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(49.24965), leftArm3.rotateAngleY + (float) Math.toRadians(-35.14833), leftArm3.rotateAngleZ + (float) Math.toRadians(66.6224+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-5));
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(5.33396), rightArm.rotateAngleY + (float) Math.toRadians(0.23536), rightArm.rotateAngleZ + (float) Math.toRadians(5.90283));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(37.39341), rightArm2.rotateAngleY + (float) Math.toRadians(-7.8893), rightArm2.rotateAngleZ + (float) Math.toRadians(-26.9523+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*4));
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(49.24965), rightArm3.rotateAngleY + (float) Math.toRadians(35.1483), rightArm3.rotateAngleZ + (float) Math.toRadians(-66.6224+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-5));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-170))*-10), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-130))*-2));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-230))*10), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-2));


    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArcheria entity = (EntityPrehistoricFloraArcheria) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 5 + (((tickAnim - 3) / 3) * (-12.87-(5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -12.87 + (((tickAnim - 6) / 4) * (0-(-12.87)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -10 + (((tickAnim - 3) / 3) * (4.5-(-10)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 4.5 + (((tickAnim - 6) / 4) * (0-(4.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 13.25 + (((tickAnim - 3) / 3) * (40.53-(13.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 40.53 + (((tickAnim - 6) / 2) * (0-(40.53)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
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


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraArcheria e = (EntityPrehistoricFloraArcheria) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
