package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDiandongosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDiandongosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    private ModelAnimator animator;

    public ModelDiandongosuchus() {
        this.textureWidth = 55;
        this.textureHeight = 50;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 17.3F, 3.9F);
        this.root.cubeList.add(new ModelBox(root, 15, 16, -2.5F, -0.75F, -2.0F, 5, 3, 5, -0.01F, false));
        this.root.cubeList.add(new ModelBox(root, 13, 24, -2.5F, 1.75F, -2.0F, 5, 1, 5, -0.03F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(1.825F, 1.075F, 0.9F);
        this.root.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.1613F, 0.4515F, 0.8322F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 12, 37, 0.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(3.5F, 0.0F, 0.0F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.0F, -0.6109F, 0.5672F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 39, 7, 0.0F, -1.0F, -1.0F, 3, 2, 2, -0.01F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(2.375F, 0.0F, 0.075F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.0F, 0.1745F, 0.1745F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 18, 30, 0.0F, -1.5F, -2.5F, 1, 3, 3, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-1.825F, 1.075F, 0.9F);
        this.root.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.1613F, -0.4515F, -0.8322F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 12, 37, -4.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-3.5F, 0.0F, 0.0F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.0F, 0.6109F, -0.5672F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 39, 7, -3.0F, -1.0F, -1.0F, 3, 2, 2, -0.01F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-2.375F, 0.0F, 0.075F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.0F, -0.1745F, -0.1745F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 18, 30, -1.0F, -1.5F, -2.5F, 1, 3, 3, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5F, -1.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -0.35F, -7.5F, 5, 4, 8, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0286F, -7.4431F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 29, -2.5F, -0.2536F, -3.0569F, 5, 4, 3, 0.01F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(1.95F, 2.2214F, -1.4069F);
        this.body2.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.7795F, -0.409F, 0.2948F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 0, 36, -0.4223F, -1.0F, -1.3663F, 4, 2, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(2.7777F, 0.0F, -0.3663F);
        this.leftArm.addChild(leftArm2);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 0.775F, -0.875F);
        this.leftArm2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.6589F, 1.0603F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 0, -1.0F, -1.0F, -1.0F, 3, 2, 2, -0.01F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(1.05F, 2.5F, -1.6F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.1225F, 0.8569F, 1.1659F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 0, 0, -0.075F, -1.75F, -2.5F, 1, 3, 3, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.95F, 2.2214F, -1.4069F);
        this.body2.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.7795F, 0.409F, -0.2948F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 0, 36, -3.5777F, -1.0F, -1.3663F, 4, 2, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-2.7777F, 0.0F, -0.3663F);
        this.rightArm.addChild(rightArm2);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.775F, -0.875F);
        this.rightArm2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.6589F, -1.0603F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 0, -2.0F, -1.0F, -1.0F, 3, 2, 2, -0.01F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-1.05F, 2.5F, -1.6F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.1225F, -0.8569F, -1.1659F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 0, 0, -0.925F, -1.75F, -2.5F, 1, 3, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.2036F, -2.0569F);
        this.body2.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 24, 33, -2.0F, 0.0F, -2.5F, 4, 3, 3, 0.01F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.4837F, -1.4976F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 35, 36, -2.0F, -0.4837F, -3.0024F, 4, 3, 3, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.5163F, -2.8275F);
        this.neck2.addChild(neck3);
        this.neck3.cubeList.add(new ModelBox(neck3, 37, 15, -2.0F, -0.975F, -2.15F, 4, 2, 2, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.1093F, -0.9934F, -1.0118F);
        this.neck3.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 21, 39, -1.1093F, 0.9934F, -4.0882F, 2, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 40, -0.6093F, 0.9934F, -6.3882F, 1, 1, 3, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.1093F, 0.9934F, -6.4382F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 37, 19, -0.5F, 0.0021F, -0.1477F, 1, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.1093F, 1.4934F, -1.0882F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2531F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 10, 0.14F, -0.3F, -5.175F, 0, 1, 5, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 8, 0.125F, -0.5F, -5.575F, 1, 1, 6, -0.001F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.8907F, 1.4934F, -1.0882F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.2531F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 10, -0.14F, -0.3F, -5.175F, 0, 1, 5, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 31, 8, -1.125F, -0.5F, -5.575F, 1, 1, 6, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.1093F, 0.4934F, -2.5882F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 5, -1.0F, -0.1F, -0.475F, 2, 1, 2, -0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0437F, 2.0073F, 1.0563F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 35, 33, -2.153F, -0.0139F, -1.9695F, 4, 1, 2, -0.012F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 39, 25, -1.153F, -0.0139F, -4.9195F, 2, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 0, -1.653F, -1.2639F, -2.2945F, 3, 2, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 40, -0.653F, -0.0139F, -7.1945F, 1, 1, 3, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.153F, -0.5139F, -1.9195F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.2531F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 30, 0.125F, 0.5F, -5.575F, 1, 1, 6, -0.001F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 9, 0.225F, 0.225F, -5.25F, 0, 1, 5, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.847F, -0.5139F, -1.9195F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.2531F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 30, -1.125F, 0.5F, -5.575F, 1, 1, 6, -0.001F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 9, -0.225F, 0.225F, -5.25F, 0, 1, 5, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.head.addChild(eye);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0907F, 0.2407F, -0.5091F);
        this.eye.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2284F, 0.298F, 0.0681F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 6, -0.5F, -0.5F, -0.325F, 1, 1, 1, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.3093F, 0.2407F, -0.5091F);
        this.eye.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2284F, -0.298F, -0.0681F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 6, -0.5F, -0.5F, -0.325F, 1, 1, 1, -0.001F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.75F, 2.0F);
        this.root.addChild(tail);
        this.setRotateAngle(tail, -0.2487F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 12, -2.0F, 0.0F, 0.0F, 4, 3, 6, -0.02F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.025F, 6.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2487F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 28, 25, -1.5F, 0.0F, 0.0F, 3, 3, 5, -0.001F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3F, 4.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1876F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 19, 5, -1.0F, 0.0F, 0.0F, 2, 2, 7, -0.01F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 21, -1.0F, 1.45F, 0.0F, 2, 1, 7, -0.02F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.35F, 6.6F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.288F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 30, 0, -0.5F, 0.6F, 0.0F, 1, 1, 6, -0.02F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 29, 18, -0.5F, 0.0F, 0.0F, 1, 1, 6, -0.01F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.root.offsetY = -0.11F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.root.offsetY = -0.11F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.20F;
        this.root.offsetX = 0.075F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(212);
        this.root.rotateAngleX = (float)Math.toRadians(22);
        this.root.rotateAngleZ = (float)Math.toRadians(-12);
        this.root.scaleChildren = true;
        float scaler = 0.4F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
        this.root.offsetY = 0.0F;

        EntityPrehistoricFloraDiandongosuchus proteros = (EntityPrehistoricFloraDiandongosuchus) e;

        this.faceTarget(f3, f4, 10, neck);
        this.faceTarget(f3, f4, 10, neck2);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};
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
        EntityPrehistoricFloraDiandongosuchus ee = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiandongosuchus entity = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.60606-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (5.09872-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-16.53023-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1.60606 + (((tickAnim - 8) / 7) * (-1.91992-(1.60606)));
            yy = 5.09872 + (((tickAnim - 8) / 7) * (52.82072-(5.09872)));
            zz = -16.53023 + (((tickAnim - 8) / 7) * (13.09272-(-16.53023)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -1.91992 + (((tickAnim - 15) / 10) * (33.27252-(-1.91992)));
            yy = 52.82072 + (((tickAnim - 15) / 10) * (-25.30131-(52.82072)));
            zz = 13.09272 + (((tickAnim - 15) / 10) * (-17.92134-(13.09272)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 33.27252 + (((tickAnim - 25) / 9) * (1.60606-(33.27252)));
            yy = -25.30131 + (((tickAnim - 25) / 9) * (5.09872-(-25.30131)));
            zz = -17.92134 + (((tickAnim - 25) / 9) * (-16.53023-(-17.92134)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = 1.60606 + (((tickAnim - 34) / 7) * (-1.91992-(1.60606)));
            yy = 5.09872 + (((tickAnim - 34) / 7) * (52.82072-(5.09872)));
            zz = -16.53023 + (((tickAnim - 34) / 7) * (13.09272-(-16.53023)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -1.91992 + (((tickAnim - 41) / 9) * (0-(-1.91992)));
            yy = 52.82072 + (((tickAnim - 41) / 9) * (0-(52.82072)));
            zz = 13.09272 + (((tickAnim - 41) / 9) * (0-(13.09272)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-73.85161-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (24.2645-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (16.85472-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -73.85161 + (((tickAnim - 8) / 7) * (-40.20114-(-73.85161)));
            yy = 24.2645 + (((tickAnim - 8) / 7) * (-29.72631-(24.2645)));
            zz = 16.85472 + (((tickAnim - 8) / 7) * (25.04312-(16.85472)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -40.20114 + (((tickAnim - 15) / 10) * (13.5-(-40.20114)));
            yy = -29.72631 + (((tickAnim - 15) / 10) * (0-(-29.72631)));
            zz = 25.04312 + (((tickAnim - 15) / 10) * (0-(25.04312)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 13.5 + (((tickAnim - 25) / 9) * (-73.85161-(13.5)));
            yy = 0 + (((tickAnim - 25) / 9) * (24.2645-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (16.85472-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = -73.85161 + (((tickAnim - 34) / 7) * (-40.20114-(-73.85161)));
            yy = 24.2645 + (((tickAnim - 34) / 7) * (-29.72631-(24.2645)));
            zz = 16.85472 + (((tickAnim - 34) / 7) * (25.04312-(16.85472)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -40.20114 + (((tickAnim - 41) / 9) * (0-(-40.20114)));
            yy = -29.72631 + (((tickAnim - 41) / 9) * (0-(-29.72631)));
            zz = 25.04312 + (((tickAnim - 41) / 9) * (0-(25.04312)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-126.56-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -126.56 + (((tickAnim - 8) / 7) * (-37-(-126.56)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -37 + (((tickAnim - 15) / 10) * (-62.5-(-37)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            yy = -62.5 + (((tickAnim - 25) / 9) * (-126.56-(-62.5)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 34) / 7) * (0-(0)));
            yy = -126.56 + (((tickAnim - 34) / 7) * (-37-(-126.56)));
            zz = 0 + (((tickAnim - 34) / 7) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = -37 + (((tickAnim - 41) / 9) * (0-(-37)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.65-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.6-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.65 + (((tickAnim - 8) / 7) * (0-(-0.65)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -0.6 + (((tickAnim - 8) / 7) * (0-(-0.6)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (-0.695-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (1.33-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (-0.26-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -0.695 + (((tickAnim - 30) / 4) * (-0.4-(-0.695)));
            yy = 1.33 + (((tickAnim - 30) / 4) * (1.15-(1.33)));
            zz = -0.26 + (((tickAnim - 30) / 4) * (-0.475-(-0.26)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = -0.4 + (((tickAnim - 34) / 7) * (0-(-0.4)));
            yy = 1.15 + (((tickAnim - 34) / 7) * (0-(1.15)));
            zz = -0.475 + (((tickAnim - 34) / 7) * (0-(-0.475)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiandongosuchus entity = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -3.75 + (((tickAnim - 15) / 15) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 16) / 14) * (0-(-5)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 3.5 + (((tickAnim - 16) / 14) * (0-(3.5)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 26.75 + (((tickAnim - 16) / 8) * (0-(26.75)));
            yy = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiandongosuchus entity = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;
        int animCycle = 400;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = -11.75 + (((tickAnim - 35) / 28) * (-1.25-(-11.75)));
            yy = 0 + (((tickAnim - 35) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 28) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = -1.25 + (((tickAnim - 63) / 277) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 63) / 277) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 277) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 370) {
            xx = -1.25 + (((tickAnim - 340) / 30) * (-11.75-(-1.25)));
            yy = 0 + (((tickAnim - 340) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 30) * (0-(0)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = -11.75 + (((tickAnim - 370) / 30) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-2.05-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.7-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 35) / 28) * (0-(0)));
            yy = -2.05 + (((tickAnim - 35) / 28) * (-3.7-(-2.05)));
            zz = 0.7 + (((tickAnim - 35) / 28) * (0.7-(0.7)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 63) / 277) * (0-(0)));
            yy = -3.7 + (((tickAnim - 63) / 277) * (-3.7-(-3.7)));
            zz = 0.7 + (((tickAnim - 63) / 277) * (0.7-(0.7)));
        }
        else if (tickAnim >= 340 && tickAnim < 370) {
            xx = 0 + (((tickAnim - 340) / 30) * (0-(0)));
            yy = -3.7 + (((tickAnim - 340) / 30) * (-2.05-(-3.7)));
            zz = 0.7 + (((tickAnim - 340) / 30) * (0.7-(0.7)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            yy = -2.05 + (((tickAnim - 370) / 30) * (0-(-2.05)));
            zz = 0.7 + (((tickAnim - 370) / 30) * (0-(0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (15.75-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 35) / 28) * (-64.69049-(0)));
            yy = 15.75 + (((tickAnim - 35) / 28) * (33.1803-(15.75)));
            zz = 0 + (((tickAnim - 35) / 28) * (-58.90019-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = -64.69049 + (((tickAnim - 63) / 277) * (-64.69049-(-64.69049)));
            yy = 33.1803 + (((tickAnim - 63) / 277) * (33.1803-(33.1803)));
            zz = -58.90019 + (((tickAnim - 63) / 277) * (-58.90019-(-58.90019)));
        }
        else if (tickAnim >= 340 && tickAnim < 370) {
            xx = -64.69049 + (((tickAnim - 340) / 30) * (0-(-64.69049)));
            yy = 33.1803 + (((tickAnim - 340) / 30) * (15.75-(33.1803)));
            zz = -58.90019 + (((tickAnim - 340) / 30) * (0-(-58.90019)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            yy = 15.75 + (((tickAnim - 370) / 30) * (0-(15.75)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-35-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = -20.5 + (((tickAnim - 35) / 28) * (-165.19559-(-20.5)));
            yy = -35 + (((tickAnim - 35) / 28) * (-40.60566-(-35)));
            zz = 0 + (((tickAnim - 35) / 28) * (132.60227-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = -165.19559 + (((tickAnim - 63) / 277) * (-165.19559-(-165.19559)));
            yy = -40.60566 + (((tickAnim - 63) / 277) * (-40.60566-(-40.60566)));
            zz = 132.60227 + (((tickAnim - 63) / 277) * (132.60227-(132.60227)));
        }
        else if (tickAnim >= 340 && tickAnim < 370) {
            xx = -165.19559 + (((tickAnim - 340) / 30) * (-20.5-(-165.19559)));
            yy = -40.60566 + (((tickAnim - 340) / 30) * (-35-(-40.60566)));
            zz = 132.60227 + (((tickAnim - 340) / 30) * (0-(132.60227)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = -20.5 + (((tickAnim - 370) / 30) * (0-(-20.5)));
            yy = -35 + (((tickAnim - 370) / 30) * (0-(-35)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-0.45-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-0.825-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 370) {
            xx = -0.45 + (((tickAnim - 35) / 335) * (-0.45-(-0.45)));
            yy = 0 + (((tickAnim - 35) / 335) * (0-(0)));
            zz = -0.825 + (((tickAnim - 35) / 335) * (-0.825-(-0.825)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = -0.45 + (((tickAnim - 370) / 30) * (0-(-0.45)));
            yy = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            zz = -0.825 + (((tickAnim - 370) / 30) * (0-(-0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (10.75-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 370) {
            xx = 0 + (((tickAnim - 35) / 335) * (0-(0)));
            yy = 1.5 + (((tickAnim - 35) / 335) * (1.5-(1.5)));
            zz = 10.75 + (((tickAnim - 35) / 335) * (10.75-(10.75)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            yy = 1.5 + (((tickAnim - 370) / 30) * (0-(1.5)));
            zz = 10.75 + (((tickAnim - 370) / 30) * (0-(10.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0.15-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.325-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 370) {
            xx = 0.15 + (((tickAnim - 35) / 335) * (0.15-(0.15)));
            yy = 0 + (((tickAnim - 35) / 335) * (0-(0)));
            zz = 0.325 + (((tickAnim - 35) / 335) * (0.325-(0.325)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 0.15 + (((tickAnim - 370) / 30) * (0-(0.15)));
            yy = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            zz = 0.325 + (((tickAnim - 370) / 30) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-15.75-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 35) / 28) * (-64.69049-(0)));
            yy = -15.75 + (((tickAnim - 35) / 28) * (-33.1803-(-15.75)));
            zz = 0 + (((tickAnim - 35) / 28) * (58.90019-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = -64.69049 + (((tickAnim - 63) / 277) * (-64.69049-(-64.69049)));
            yy = -33.1803 + (((tickAnim - 63) / 277) * (-33.1803-(-33.1803)));
            zz = 58.90019 + (((tickAnim - 63) / 277) * (58.90019-(58.90019)));
        }
        else if (tickAnim >= 340 && tickAnim < 370) {
            xx = -64.69049 + (((tickAnim - 340) / 30) * (0-(-64.69049)));
            yy = -33.1803 + (((tickAnim - 340) / 30) * (-15.75-(-33.1803)));
            zz = 58.90019 + (((tickAnim - 340) / 30) * (0-(58.90019)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            yy = -15.75 + (((tickAnim - 370) / 30) * (0-(-15.75)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (35-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = -20.5 + (((tickAnim - 35) / 28) * (-165.19559-(-20.5)));
            yy = 35 + (((tickAnim - 35) / 28) * (40.60566-(35)));
            zz = 0 + (((tickAnim - 35) / 28) * (-132.60227-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = -165.19559 + (((tickAnim - 63) / 277) * (-165.19559-(-165.19559)));
            yy = 40.60566 + (((tickAnim - 63) / 277) * (40.60566-(40.60566)));
            zz = -132.60227 + (((tickAnim - 63) / 277) * (-132.60227-(-132.60227)));
        }
        else if (tickAnim >= 340 && tickAnim < 370) {
            xx = -165.19559 + (((tickAnim - 340) / 30) * (-20.5-(-165.19559)));
            yy = 40.60566 + (((tickAnim - 340) / 30) * (35-(40.60566)));
            zz = -132.60227 + (((tickAnim - 340) / 30) * (0-(-132.60227)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = -20.5 + (((tickAnim - 370) / 30) * (0-(-20.5)));
            yy = 35 + (((tickAnim - 370) / 30) * (0-(35)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0.45-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-0.825-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 370) {
            xx = 0.45 + (((tickAnim - 35) / 335) * (0.45-(0.45)));
            yy = 0 + (((tickAnim - 35) / 335) * (0-(0)));
            zz = -0.825 + (((tickAnim - 35) / 335) * (-0.825-(-0.825)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 0.45 + (((tickAnim - 370) / 30) * (0-(0.45)));
            yy = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            zz = -0.825 + (((tickAnim - 370) / 30) * (0-(-0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-10.75-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 35) / 28) * (0-(0)));
            yy = -1.5 + (((tickAnim - 35) / 28) * (-1.5-(-1.5)));
            zz = -10.75 + (((tickAnim - 35) / 28) * (-10.75-(-10.75)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 63) / 277) * (0-(0)));
            yy = -1.5 + (((tickAnim - 63) / 277) * (-1.5-(-1.5)));
            zz = -10.75 + (((tickAnim - 63) / 277) * (-10.75-(-10.75)));
        }
        else if (tickAnim >= 340 && tickAnim < 370) {
            xx = 0 + (((tickAnim - 340) / 30) * (0-(0)));
            yy = -1.5 + (((tickAnim - 340) / 30) * (-1.5-(-1.5)));
            zz = -10.75 + (((tickAnim - 340) / 30) * (-10.75-(-10.75)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            yy = -1.5 + (((tickAnim - 370) / 30) * (0-(-1.5)));
            zz = -10.75 + (((tickAnim - 370) / 30) * (0-(-10.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0.15-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.325-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = 0.15 + (((tickAnim - 35) / 28) * (-0.15-(0.15)));
            yy = 0 + (((tickAnim - 35) / 28) * (0-(0)));
            zz = 0.325 + (((tickAnim - 35) / 28) * (0.325-(0.325)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = -0.15 + (((tickAnim - 63) / 277) * (-0.15-(-0.15)));
            yy = 0 + (((tickAnim - 63) / 277) * (0-(0)));
            zz = 0.325 + (((tickAnim - 63) / 277) * (0.325-(0.325)));
        }
        else if (tickAnim >= 340 && tickAnim < 370) {
            xx = -0.15 + (((tickAnim - 340) / 30) * (0.15-(-0.15)));
            yy = 0 + (((tickAnim - 340) / 30) * (0-(0)));
            zz = 0.325 + (((tickAnim - 340) / 30) * (0.325-(0.325)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 0.15 + (((tickAnim - 370) / 30) * (0-(0.15)));
            yy = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            zz = 0.325 + (((tickAnim - 370) / 30) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 0) / 400) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 400) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 400) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = 6.5 + (((tickAnim - 63) / 277) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 63) / 277) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 277) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 400) {
            xx = 6.5 + (((tickAnim - 340) / 60) * (0-(6.5)));
            yy = 0 + (((tickAnim - 340) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0.05-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 63) / 277) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 277) * (0-(0)));
            zz = 0.05 + (((tickAnim - 63) / 277) * (0.05-(0.05)));
        }
        else if (tickAnim >= 340 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 340) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 340) / 60) * (0-(0)));
            zz = 0.05 + (((tickAnim - 340) / 60) * (0-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-4-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 35) / 28) * (15.91038-(0)));
            yy = -4 + (((tickAnim - 35) / 28) * (-15.14571-(-4)));
            zz = 0 + (((tickAnim - 35) / 28) * (-24.73692-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = 15.91038 + (((tickAnim - 63) / 277) * (15.91038-(15.91038)));
            yy = -15.14571 + (((tickAnim - 63) / 277) * (-15.14571-(-15.14571)));
            zz = -24.73692 + (((tickAnim - 63) / 277) * (-24.73692-(-24.73692)));
        }
        else if (tickAnim >= 340 && tickAnim < 370) {
            xx = 15.91038 + (((tickAnim - 340) / 30) * (0-(15.91038)));
            yy = -15.14571 + (((tickAnim - 340) / 30) * (-4-(-15.14571)));
            zz = -24.73692 + (((tickAnim - 340) / 30) * (0-(-24.73692)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            yy = -4 + (((tickAnim - 370) / 30) * (0-(-4)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 35) / 28) * (-93.95113-(0)));
            yy = 0 + (((tickAnim - 35) / 28) * (47.28978-(0)));
            zz = 0 + (((tickAnim - 35) / 28) * (-4.36862-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = -93.95113 + (((tickAnim - 63) / 277) * (-93.95113-(-93.95113)));
            yy = 47.28978 + (((tickAnim - 63) / 277) * (47.28978-(47.28978)));
            zz = -4.36862 + (((tickAnim - 63) / 277) * (-4.36862-(-4.36862)));
        }
        else if (tickAnim >= 340 && tickAnim < 370) {
            xx = -93.95113 + (((tickAnim - 340) / 30) * (0-(-93.95113)));
            yy = 47.28978 + (((tickAnim - 340) / 30) * (0-(47.28978)));
            zz = -4.36862 + (((tickAnim - 340) / 30) * (0-(-4.36862)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 63 && tickAnim < 340) {
            xx = 0.275 + (((tickAnim - 63) / 277) * (0.275-(0.275)));
            yy = -0.425 + (((tickAnim - 63) / 277) * (-0.425-(-0.425)));
            zz = 0.25 + (((tickAnim - 63) / 277) * (0.25-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-10.5-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (3.7816-(0)));
            yy = -10.5 + (((tickAnim - 35) / 15) * (-51.42398-(-10.5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0.84912-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = 3.7816 + (((tickAnim - 50) / 13) * (7.32867-(3.7816)));
            yy = -51.42398 + (((tickAnim - 50) / 13) * (-82.74739-(-51.42398)));
            zz = 0.84912 + (((tickAnim - 50) / 13) * (-12.84993-(0.84912)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = 7.32867 + (((tickAnim - 63) / 277) * (7.32867-(7.32867)));
            yy = -82.74739 + (((tickAnim - 63) / 277) * (-82.74739-(-82.74739)));
            zz = -12.84993 + (((tickAnim - 63) / 277) * (-12.84993-(-12.84993)));
        }
        else if (tickAnim >= 340 && tickAnim < 356) {
            xx = 7.32867 + (((tickAnim - 340) / 16) * (3.95589-(7.32867)));
            yy = -82.74739 + (((tickAnim - 340) / 16) * (-41.60432-(-82.74739)));
            zz = -12.84993 + (((tickAnim - 340) / 16) * (0.89743-(-12.84993)));
        }
        else if (tickAnim >= 356 && tickAnim < 370) {
            xx = 3.95589 + (((tickAnim - 356) / 14) * (0-(3.95589)));
            yy = -41.60432 + (((tickAnim - 356) / 14) * (-10.5-(-41.60432)));
            zz = 0.89743 + (((tickAnim - 356) / 14) * (0-(0.89743)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            yy = -10.5 + (((tickAnim - 370) / 30) * (0-(-10.5)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.275-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (-0.375-(0)));
            yy = 0.2 + (((tickAnim - 35) / 15) * (0.995-(0.2)));
            zz = 0.275 + (((tickAnim - 35) / 15) * (0.28-(0.275)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = -0.375 + (((tickAnim - 50) / 13) * (-0.5-(-0.375)));
            yy = 0.995 + (((tickAnim - 50) / 13) * (0.925-(0.995)));
            zz = 0.28 + (((tickAnim - 50) / 13) * (0.28-(0.28)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = -0.5 + (((tickAnim - 63) / 277) * (-0.5-(-0.5)));
            yy = 0.925 + (((tickAnim - 63) / 277) * (0.925-(0.925)));
            zz = 0.28 + (((tickAnim - 63) / 277) * (0.28-(0.28)));
        }
        else if (tickAnim >= 340 && tickAnim < 356) {
            xx = -0.5 + (((tickAnim - 340) / 16) * (0.21-(-0.5)));
            yy = 0.925 + (((tickAnim - 340) / 16) * (0.695-(0.925)));
            zz = 0.28 + (((tickAnim - 340) / 16) * (0.28-(0.28)));
        }
        else if (tickAnim >= 356 && tickAnim < 370) {
            xx = 0.21 + (((tickAnim - 356) / 14) * (0-(0.21)));
            yy = 0.695 + (((tickAnim - 356) / 14) * (0.2-(0.695)));
            zz = 0.28 + (((tickAnim - 356) / 14) * (0.275-(0.28)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            yy = 0.2 + (((tickAnim - 370) / 30) * (0-(0.2)));
            zz = 0.275 + (((tickAnim - 370) / 30) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.75 + (((tickAnim - 35) / 15) * (9.61-(3.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = 9.61 + (((tickAnim - 50) / 13) * (3.5-(9.61)));
            yy = 0 + (((tickAnim - 50) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 13) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = 3.5 + (((tickAnim - 63) / 277) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 63) / 277) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 277) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 370) {
            xx = 3.5 + (((tickAnim - 340) / 30) * (3.75-(3.5)));
            yy = 0 + (((tickAnim - 340) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 30) * (0-(0)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 3.75 + (((tickAnim - 370) / 30) * (0-(3.75)));
            yy = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = 6 + (((tickAnim - 35) / 28) * (0-(6)));
            yy = 0 + (((tickAnim - 35) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 28) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 370) {
            xx = 0 + (((tickAnim - 63) / 307) * (6-(0)));
            yy = 0 + (((tickAnim - 63) / 307) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 307) * (0-(0)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 6 + (((tickAnim - 370) / 30) * (0-(6)));
            yy = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-0.425-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 370) {
            xx = 0 + (((tickAnim - 35) / 335) * (0-(0)));
            yy = 0.025 + (((tickAnim - 35) / 335) * (0.025-(0.025)));
            zz = -0.425 + (((tickAnim - 35) / 335) * (-0.425-(-0.425)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            yy = 0.025 + (((tickAnim - 370) / 30) * (0-(0.025)));
            zz = -0.425 + (((tickAnim - 370) / 30) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 46) {
            xx = 5.5 + (((tickAnim - 35) / 11) * (14.32-(5.5)));
            yy = 0 + (((tickAnim - 35) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 11) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 14.32 + (((tickAnim - 46) / 4) * (2.48-(14.32)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = 2.48 + (((tickAnim - 50) / 13) * (-6.5-(2.48)));
            yy = 0 + (((tickAnim - 50) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 13) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 95) {
            xx = -6.5 + (((tickAnim - 63) / 32) * (-27-(-6.5)));
            yy = 0 + (((tickAnim - 63) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 32) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 330) {
            xx = -27 + (((tickAnim - 95) / 235) * (-32.25-(-27)));
            yy = 0 + (((tickAnim - 95) / 235) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 235) * (0-(0)));
        }
        else if (tickAnim >= 330 && tickAnim < 340) {
            xx = -32.25 + (((tickAnim - 330) / 10) * (-32.25-(-32.25)));
            yy = 0 + (((tickAnim - 330) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 330) / 10) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 351) {
            xx = -32.25 + (((tickAnim - 340) / 11) * (0-(-32.25)));
            yy = 0 + (((tickAnim - 340) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 11) * (0-(0)));
        }
        else if (tickAnim >= 351 && tickAnim < 360) {
            xx = 0 + (((tickAnim - 351) / 9) * (13.63-(0)));
            yy = 0 + (((tickAnim - 351) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 351) / 9) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 13.63 + (((tickAnim - 360) / 40) * (0-(13.63)));
            yy = 0 + (((tickAnim - 360) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.05-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 35) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 11) * (0-(0)));
            zz = 0.05 + (((tickAnim - 35) / 11) * (0.3-(0.05)));
        }
        else if (tickAnim >= 46 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 46) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 17) * (0-(0)));
            zz = 0.3 + (((tickAnim - 46) / 17) * (0.175-(0.3)));
        }
        else if (tickAnim >= 63 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 63) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 32) * (-0.15-(0)));
            zz = 0.175 + (((tickAnim - 63) / 32) * (0.48-(0.175)));
        }
        else if (tickAnim >= 95 && tickAnim < 330) {
            xx = 0 + (((tickAnim - 95) / 235) * (0-(0)));
            yy = -0.15 + (((tickAnim - 95) / 235) * (-0.15-(-0.15)));
            zz = 0.48 + (((tickAnim - 95) / 235) * (0.48-(0.48)));
        }
        else if (tickAnim >= 330 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 330) / 10) * (0-(0)));
            yy = -0.15 + (((tickAnim - 330) / 10) * (-0.15-(-0.15)));
            zz = 0.48 + (((tickAnim - 330) / 10) * (0.48-(0.48)));
        }
        else if (tickAnim >= 340 && tickAnim < 351) {
            xx = 0 + (((tickAnim - 340) / 11) * (0-(0)));
            yy = -0.15 + (((tickAnim - 340) / 11) * (0-(-0.15)));
            zz = 0.48 + (((tickAnim - 340) / 11) * (0-(0.48)));
        }
        else if (tickAnim >= 351 && tickAnim < 360) {
            xx = 0 + (((tickAnim - 351) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 351) / 9) * (0.1-(0)));
            zz = 0 + (((tickAnim - 351) / 9) * (0.295-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 360) / 40) * (0-(0)));
            yy = 0.1 + (((tickAnim - 360) / 40) * (0-(0.1)));
            zz = 0.295 + (((tickAnim - 360) / 40) * (0-(0.295)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 63 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 63) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 32) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 330) {
            xx = 0 + (((tickAnim - 95) / 235) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 235) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 235) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 63) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 32) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 330) {
            xx = 0 + (((tickAnim - 95) / 235) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 235) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 235) * (0-(0)));
        }
        else if (tickAnim >= 330 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 330) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 330) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 330) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 63) / 32) * (19.25-(0)));
            yy = 0 + (((tickAnim - 63) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 32) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 330) {
            xx = 19.25 + (((tickAnim - 95) / 235) * (19.25-(19.25)));
            yy = 0 + (((tickAnim - 95) / 235) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 235) * (0-(0)));
        }
        else if (tickAnim >= 330 && tickAnim < 340) {
            xx = 19.25 + (((tickAnim - 330) / 10) * (19.25-(19.25)));
            yy = 0 + (((tickAnim - 330) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 330) / 10) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 350) {
            xx = 19.25 + (((tickAnim - 340) / 10) * (0-(19.25)));
            yy = 0 + (((tickAnim - 340) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 10) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 350) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 350) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 1 + (((tickAnim - 0) / 63) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 63) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 63) * (1-(1)));
        }
        else if (tickAnim >= 63 && tickAnim < 95) {
            xx = 1 + (((tickAnim - 63) / 32) * (1-(1)));
            yy = 1 + (((tickAnim - 63) / 32) * (0.0375-(1)));
            zz = 1 + (((tickAnim - 63) / 32) * (1-(1)));
        }
        else if (tickAnim >= 95 && tickAnim < 330) {
            xx = 1 + (((tickAnim - 95) / 235) * (1-(1)));
            yy = 0.0375 + (((tickAnim - 95) / 235) * (0.0375-(0.0375)));
            zz = 1 + (((tickAnim - 95) / 235) * (1-(1)));
        }
        else if (tickAnim >= 330 && tickAnim < 340) {
            xx = 1 + (((tickAnim - 330) / 10) * (1-(1)));
            yy = 0.0375 + (((tickAnim - 330) / 10) * (1-(0.0375)));
            zz = 1 + (((tickAnim - 330) / 10) * (1-(1)));
        }
        else if (tickAnim >= 340 && tickAnim < 400) {
            xx = 1 + (((tickAnim - 340) / 60) * (1-(1)));
            yy = 1 + (((tickAnim - 340) / 60) * (1-(1)));
            zz = 1 + (((tickAnim - 340) / 60) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = 13.75 + (((tickAnim - 35) / 28) * (7.25-(13.75)));
            yy = 0 + (((tickAnim - 35) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 28) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = 7.25 + (((tickAnim - 63) / 277) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 63) / 277) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 277) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 370) {
            xx = 7.25 + (((tickAnim - 340) / 30) * (13.75-(7.25)));
            yy = 0 + (((tickAnim - 340) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 30) * (0-(0)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 13.75 + (((tickAnim - 370) / 30) * (0-(13.75)));
            yy = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = 12.75 + (((tickAnim - 35) / 28) * (17.25-(12.75)));
            yy = 0 + (((tickAnim - 35) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 28) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = 17.25 + (((tickAnim - 63) / 277) * (17.25-(17.25)));
            yy = 0 + (((tickAnim - 63) / 277) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 277) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 370) {
            xx = 17.25 + (((tickAnim - 340) / 30) * (12.75-(17.25)));
            yy = 0 + (((tickAnim - 340) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 30) * (0-(0)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 12.75 + (((tickAnim - 370) / 30) * (0-(12.75)));
            yy = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 35) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 28) * (-0.2-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 63) / 277) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 277) * (0-(0)));
            zz = -0.2 + (((tickAnim - 63) / 277) * (-0.2-(-0.2)));
        }
        else if (tickAnim >= 340 && tickAnim < 370) {
            xx = 0 + (((tickAnim - 340) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 340) / 30) * (0-(0)));
            zz = -0.2 + (((tickAnim - 340) / 30) * (0-(-0.2)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = -2 + (((tickAnim - 35) / 28) * (-6.5-(-2)));
            yy = 0 + (((tickAnim - 35) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 28) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = -6.5 + (((tickAnim - 63) / 277) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 63) / 277) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 277) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 370) {
            xx = -6.5 + (((tickAnim - 340) / 30) * (-2-(-6.5)));
            yy = 0 + (((tickAnim - 340) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 30) * (0-(0)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = -2 + (((tickAnim - 370) / 30) * (0-(-2)));
            yy = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = -10.75 + (((tickAnim - 35) / 28) * (-18.75-(-10.75)));
            yy = 0 + (((tickAnim - 35) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 28) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = -18.75 + (((tickAnim - 63) / 277) * (-18.75-(-18.75)));
            yy = 0 + (((tickAnim - 63) / 277) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 277) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 370) {
            xx = -18.75 + (((tickAnim - 340) / 30) * (-10.75-(-18.75)));
            yy = 0 + (((tickAnim - 340) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 30) * (0-(0)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = -10.75 + (((tickAnim - 370) / 30) * (0-(-10.75)));
            yy = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (4-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 35) / 28) * (15.91038-(0)));
            yy = 4 + (((tickAnim - 35) / 28) * (15.14571-(4)));
            zz = 0 + (((tickAnim - 35) / 28) * (24.73692-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = 15.91038 + (((tickAnim - 63) / 277) * (15.91038-(15.91038)));
            yy = 15.14571 + (((tickAnim - 63) / 277) * (15.14571-(15.14571)));
            zz = 24.73692 + (((tickAnim - 63) / 277) * (24.73692-(24.73692)));
        }
        else if (tickAnim >= 340 && tickAnim < 370) {
            xx = 15.91038 + (((tickAnim - 340) / 30) * (0-(15.91038)));
            yy = 15.14571 + (((tickAnim - 340) / 30) * (4-(15.14571)));
            zz = 24.73692 + (((tickAnim - 340) / 30) * (0-(24.73692)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            yy = 4 + (((tickAnim - 370) / 30) * (0-(4)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 35) / 28) * (-93.95113-(0)));
            yy = 0 + (((tickAnim - 35) / 28) * (-47.28978-(0)));
            zz = 0 + (((tickAnim - 35) / 28) * (4.36862-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = -93.95113 + (((tickAnim - 63) / 277) * (-93.95113-(-93.95113)));
            yy = -47.28978 + (((tickAnim - 63) / 277) * (-47.28978-(-47.28978)));
            zz = 4.36862 + (((tickAnim - 63) / 277) * (4.36862-(4.36862)));
        }
        else if (tickAnim >= 340 && tickAnim < 370) {
            xx = -93.95113 + (((tickAnim - 340) / 30) * (0-(-93.95113)));
            yy = -47.28978 + (((tickAnim - 340) / 30) * (0-(-47.28978)));
            zz = 4.36862 + (((tickAnim - 340) / 30) * (0-(4.36862)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (-0.275-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0.25-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = -0.275 + (((tickAnim - 63) / 277) * (-0.275-(-0.275)));
            yy = -0.425 + (((tickAnim - 63) / 277) * (-0.425-(-0.425)));
            zz = 0.25 + (((tickAnim - 63) / 277) * (0.25-(0.25)));
        }
        else if (tickAnim >= 340 && tickAnim < 400) {
            xx = -0.275 + (((tickAnim - 340) / 60) * (0-(-0.275)));
            yy = -0.425 + (((tickAnim - 340) / 60) * (0-(-0.425)));
            zz = 0.25 + (((tickAnim - 340) / 60) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (10.5-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (3.7816-(0)));
            yy = 10.5 + (((tickAnim - 35) / 15) * (51.42398-(10.5)));
            zz = 0 + (((tickAnim - 35) / 15) * (-0.84912-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = 3.7816 + (((tickAnim - 50) / 13) * (7.32867-(3.7816)));
            yy = 51.42398 + (((tickAnim - 50) / 13) * (82.74739-(51.42398)));
            zz = -0.84912 + (((tickAnim - 50) / 13) * (12.84993-(-0.84912)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = 7.32867 + (((tickAnim - 63) / 277) * (7.32867-(7.32867)));
            yy = 82.74739 + (((tickAnim - 63) / 277) * (82.74739-(82.74739)));
            zz = 12.84993 + (((tickAnim - 63) / 277) * (12.84993-(12.84993)));
        }
        else if (tickAnim >= 340 && tickAnim < 356) {
            xx = 7.32867 + (((tickAnim - 340) / 16) * (3.95589-(7.32867)));
            yy = 82.74739 + (((tickAnim - 340) / 16) * (41.60432-(82.74739)));
            zz = 12.84993 + (((tickAnim - 340) / 16) * (-0.89743-(12.84993)));
        }
        else if (tickAnim >= 356 && tickAnim < 370) {
            xx = 3.95589 + (((tickAnim - 356) / 14) * (0-(3.95589)));
            yy = 41.60432 + (((tickAnim - 356) / 14) * (10.5-(41.60432)));
            zz = -0.89743 + (((tickAnim - 356) / 14) * (0-(-0.89743)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 370) / 30) * (0-(0)));
            yy = 10.5 + (((tickAnim - 370) / 30) * (0-(10.5)));
            zz = 0 + (((tickAnim - 370) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.275-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.05 + (((tickAnim - 35) / 15) * (0.375-(-0.05)));
            yy = 0.15 + (((tickAnim - 35) / 15) * (0.995-(0.15)));
            zz = 0.275 + (((tickAnim - 35) / 15) * (0.28-(0.275)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = 0.375 + (((tickAnim - 50) / 13) * (0.5-(0.375)));
            yy = 0.995 + (((tickAnim - 50) / 13) * (0.925-(0.995)));
            zz = 0.28 + (((tickAnim - 50) / 13) * (0.28-(0.28)));
        }
        else if (tickAnim >= 63 && tickAnim < 340) {
            xx = 0.5 + (((tickAnim - 63) / 277) * (0.5-(0.5)));
            yy = 0.925 + (((tickAnim - 63) / 277) * (0.925-(0.925)));
            zz = 0.28 + (((tickAnim - 63) / 277) * (0.28-(0.28)));
        }
        else if (tickAnim >= 340 && tickAnim < 356) {
            xx = 0.5 + (((tickAnim - 340) / 16) * (0.21-(0.5)));
            yy = 0.925 + (((tickAnim - 340) / 16) * (0.695-(0.925)));
            zz = 0.28 + (((tickAnim - 340) / 16) * (0.28-(0.28)));
        }
        else if (tickAnim >= 356 && tickAnim < 370) {
            xx = 0.21 + (((tickAnim - 356) / 14) * (-0.05-(0.21)));
            yy = 0.695 + (((tickAnim - 356) / 14) * (0.15-(0.695)));
            zz = 0.28 + (((tickAnim - 356) / 14) * (0.275-(0.28)));
        }
        else if (tickAnim >= 370 && tickAnim < 400) {
            xx = -0.05 + (((tickAnim - 370) / 30) * (0-(-0.05)));
            yy = 0.15 + (((tickAnim - 370) / 30) * (0-(0.15)));
            zz = 0.275 + (((tickAnim - 370) / 30) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiandongosuchus entity = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 7.25 + (((tickAnim - 5) / 5) * (-5.25-(7.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -5.25 + (((tickAnim - 10) / 5) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -6 + (((tickAnim - 5) / 3) * (-8.25-(-6)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8.25 + (((tickAnim - 8) / 2) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -4 + (((tickAnim - 5) / 3) * (-4-(-4)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4 + (((tickAnim - 8) / 2) * (5-(-4)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 5 + (((tickAnim - 10) / 2) * (0-(5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.15-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.025 + (((tickAnim - 10) / 5) * (0-(0.025)));
            zz = 0.15 + (((tickAnim - 10) / 5) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3.5 + (((tickAnim - 5) / 5) * (28.25-(3.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 28.25 + (((tickAnim - 10) / 2) * (0-(28.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiandongosuchus entity = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -0.5 + (((tickAnim - 18) / 15) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -0.5 + (((tickAnim - 33) / 17) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-3.45-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -3.45 + (((tickAnim - 18) / 15) * (-3.45-(-3.45)));
            zz = 1 + (((tickAnim - 18) / 15) * (1-(1)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -3.45 + (((tickAnim - 33) / 17) * (0-(-3.45)));
            zz = 1 + (((tickAnim - 33) / 17) * (0-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.48012-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (33.10838-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-56.66826-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -0.48012 + (((tickAnim - 18) / 15) * (-0.48012-(-0.48012)));
            yy = 33.10838 + (((tickAnim - 18) / 15) * (33.10838-(33.10838)));
            zz = -56.66826 + (((tickAnim - 18) / 15) * (-56.66826-(-56.66826)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -0.48012 + (((tickAnim - 33) / 17) * (0-(-0.48012)));
            yy = 33.10838 + (((tickAnim - 33) / 17) * (0-(33.10838)));
            zz = -56.66826 + (((tickAnim - 33) / 17) * (0-(-56.66826)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-70.13869-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (9.98708-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (92.82222-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -70.13869 + (((tickAnim - 18) / 15) * (-70.13869-(-70.13869)));
            yy = 9.98708 + (((tickAnim - 18) / 15) * (9.98708-(9.98708)));
            zz = 92.82222 + (((tickAnim - 18) / 15) * (92.82222-(92.82222)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -70.13869 + (((tickAnim - 33) / 17) * (0-(-70.13869)));
            yy = 9.98708 + (((tickAnim - 33) / 17) * (0-(9.98708)));
            zz = 92.82222 + (((tickAnim - 33) / 17) * (0-(92.82222)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2.36714-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-2.19034-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-6.38572-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -2.36714 + (((tickAnim - 8) / 10) * (0-(-2.36714)));
            yy = -2.19034 + (((tickAnim - 8) / 10) * (23.5-(-2.19034)));
            zz = -6.38572 + (((tickAnim - 8) / 10) * (0-(-6.38572)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 23.5 + (((tickAnim - 18) / 15) * (23.5-(23.5)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 23.5 + (((tickAnim - 33) / 17) * (0-(23.5)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.48012-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-33.10838-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (56.66826-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -0.48012 + (((tickAnim - 18) / 15) * (-0.48012-(-0.48012)));
            yy = -33.10838 + (((tickAnim - 18) / 15) * (-33.10838-(-33.10838)));
            zz = 56.66826 + (((tickAnim - 18) / 15) * (56.66826-(56.66826)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -0.48012 + (((tickAnim - 33) / 17) * (0-(-0.48012)));
            yy = -33.10838 + (((tickAnim - 33) / 17) * (0-(-33.10838)));
            zz = 56.66826 + (((tickAnim - 33) / 17) * (0-(56.66826)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-70.13869-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-9.98708-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-92.82222-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -70.13869 + (((tickAnim - 18) / 15) * (-70.13869-(-70.13869)));
            yy = -9.98708 + (((tickAnim - 18) / 15) * (-9.98708-(-9.98708)));
            zz = -92.82222 + (((tickAnim - 18) / 15) * (-92.82222-(-92.82222)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -70.13869 + (((tickAnim - 33) / 17) * (0-(-70.13869)));
            yy = -9.98708 + (((tickAnim - 33) / 17) * (0-(-9.98708)));
            zz = -92.82222 + (((tickAnim - 33) / 17) * (0-(-92.82222)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-4.78967-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.85015-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (12.98019-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -4.78967 + (((tickAnim - 8) / 10) * (0-(-4.78967)));
            yy = 2.85015 + (((tickAnim - 8) / 10) * (-23.5-(2.85015)));
            zz = 12.98019 + (((tickAnim - 8) / 10) * (0-(12.98019)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -23.5 + (((tickAnim - 18) / 15) * (-23.5-(-23.5)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -23.5 + (((tickAnim - 33) / 17) * (0-(-23.5)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3.79632-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.11317-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-19.98175-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 3.79632 + (((tickAnim - 18) / 15) * (3.79632-(3.79632)));
            yy = 1.11317 + (((tickAnim - 18) / 15) * (1.11317-(1.11317)));
            zz = -19.98175 + (((tickAnim - 18) / 15) * (-19.98175-(-19.98175)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 3.79632 + (((tickAnim - 33) / 17) * (0-(3.79632)));
            yy = 1.11317 + (((tickAnim - 33) / 17) * (0-(1.11317)));
            zz = -19.98175 + (((tickAnim - 33) / 17) * (0-(-19.98175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-76.05262-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (35.49994-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (19.19789-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -76.05262 + (((tickAnim - 18) / 15) * (-76.05262-(-76.05262)));
            yy = 35.49994 + (((tickAnim - 18) / 15) * (35.49994-(35.49994)));
            zz = 19.19789 + (((tickAnim - 18) / 15) * (19.19789-(19.19789)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -76.05262 + (((tickAnim - 33) / 17) * (0-(-76.05262)));
            yy = 35.49994 + (((tickAnim - 33) / 17) * (0-(35.49994)));
            zz = 19.19789 + (((tickAnim - 33) / 17) * (0-(19.19789)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.2-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -0.3 + (((tickAnim - 18) / 15) * (-0.3-(-0.3)));
            zz = 0.2 + (((tickAnim - 18) / 15) * (0.2-(0.2)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -0.3 + (((tickAnim - 33) / 17) * (0-(-0.3)));
            zz = 0.2 + (((tickAnim - 33) / 17) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-13.79545-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-79.74852-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-20.24823-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -13.79545 + (((tickAnim - 18) / 15) * (-13.79545-(-13.79545)));
            yy = -79.74852 + (((tickAnim - 18) / 15) * (-79.74852-(-79.74852)));
            zz = -20.24823 + (((tickAnim - 18) / 15) * (-20.24823-(-20.24823)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -13.79545 + (((tickAnim - 33) / 17) * (0-(-13.79545)));
            yy = -79.74852 + (((tickAnim - 33) / 17) * (0-(-79.74852)));
            zz = -20.24823 + (((tickAnim - 33) / 17) * (0-(-20.24823)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.34-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.615-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.17-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -0.34 + (((tickAnim - 10) / 8) * (-0.25-(-0.34)));
            yy = 0.615 + (((tickAnim - 10) / 8) * (0.5-(0.615)));
            zz = -0.17 + (((tickAnim - 10) / 8) * (-0.3-(-0.17)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -0.25 + (((tickAnim - 18) / 15) * (-0.25-(-0.25)));
            yy = 0.5 + (((tickAnim - 18) / 15) * (0.5-(0.5)));
            zz = -0.3 + (((tickAnim - 18) / 15) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -0.25 + (((tickAnim - 33) / 17) * (0-(-0.25)));
            yy = 0.5 + (((tickAnim - 33) / 17) * (0-(0.5)));
            zz = -0.3 + (((tickAnim - 33) / 17) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 9.5 + (((tickAnim - 18) / 15) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 9.5 + (((tickAnim - 33) / 17) * (0-(9.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0.25 + (((tickAnim - 8) / 10) * (5.25-(0.25)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 5.25 + (((tickAnim - 18) / 15) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 33) / 17) * (0-(5.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -9.75 + (((tickAnim - 18) / 15) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -9.75 + (((tickAnim - 33) / 17) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3.79632-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-1.11317-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (19.98175-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 3.79632 + (((tickAnim - 18) / 15) * (3.79632-(3.79632)));
            yy = -1.11317 + (((tickAnim - 18) / 15) * (-1.11317-(-1.11317)));
            zz = 19.98175 + (((tickAnim - 18) / 15) * (19.98175-(19.98175)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 3.79632 + (((tickAnim - 33) / 17) * (0-(3.79632)));
            yy = -1.11317 + (((tickAnim - 33) / 17) * (0-(-1.11317)));
            zz = 19.98175 + (((tickAnim - 33) / 17) * (0-(19.98175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-76.05262-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-35.49994-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-19.19789-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -76.05262 + (((tickAnim - 18) / 15) * (-76.05262-(-76.05262)));
            yy = -35.49994 + (((tickAnim - 18) / 15) * (-35.49994-(-35.49994)));
            zz = -19.19789 + (((tickAnim - 18) / 15) * (-19.19789-(-19.19789)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -76.05262 + (((tickAnim - 33) / 17) * (0-(-76.05262)));
            yy = -35.49994 + (((tickAnim - 33) / 17) * (0-(-35.49994)));
            zz = -19.19789 + (((tickAnim - 33) / 17) * (0-(-19.19789)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.2-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -0.3 + (((tickAnim - 18) / 15) * (-0.3-(-0.3)));
            zz = 0.2 + (((tickAnim - 18) / 15) * (0.2-(0.2)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -0.3 + (((tickAnim - 33) / 17) * (0-(-0.3)));
            zz = 0.2 + (((tickAnim - 33) / 17) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-13.79545-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (79.74852-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (20.24823-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -13.79545 + (((tickAnim - 18) / 15) * (-13.79545-(-13.79545)));
            yy = 79.74852 + (((tickAnim - 18) / 15) * (79.74852-(79.74852)));
            zz = 20.24823 + (((tickAnim - 18) / 15) * (20.24823-(20.24823)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -13.79545 + (((tickAnim - 33) / 17) * (0-(-13.79545)));
            yy = 79.74852 + (((tickAnim - 33) / 17) * (0-(79.74852)));
            zz = 20.24823 + (((tickAnim - 33) / 17) * (0-(20.24823)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.34-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.615-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.17-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0.34 + (((tickAnim - 10) / 8) * (-0.25-(0.34)));
            yy = 0.615 + (((tickAnim - 10) / 8) * (0.5-(0.615)));
            zz = 0.17 + (((tickAnim - 10) / 8) * (-0.3-(0.17)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -0.25 + (((tickAnim - 18) / 15) * (-0.25-(-0.25)));
            yy = 0.5 + (((tickAnim - 18) / 15) * (0.5-(0.5)));
            zz = -0.3 + (((tickAnim - 18) / 15) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -0.25 + (((tickAnim - 33) / 17) * (0-(-0.25)));
            yy = 0.5 + (((tickAnim - 33) / 17) * (0-(0.5)));
            zz = -0.3 + (((tickAnim - 33) / 17) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiandongosuchus entity = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15 + (((tickAnim - 10) / 10) * (0-(15)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 19.5 + (((tickAnim - 5) / 5) * (4-(19.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4 + (((tickAnim - 10) / 10) * (0-(4)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.11-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.435-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.11 + (((tickAnim - 5) / 5) * (0.025-(0.11)));
            zz = 0.435 + (((tickAnim - 5) / 5) * (0.325-(0.435)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.025 + (((tickAnim - 10) / 10) * (0-(0.025)));
            zz = 0.325 + (((tickAnim - 10) / 10) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 11.5 + (((tickAnim - 7) / 3) * (0-(11.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDiandongosuchus entity = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2), root.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(1.30509), leftleg.rotateAngleY + (float) Math.toRadians(-68.3549842412+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2), leftleg.rotateAngleZ + (float) Math.toRadians(-7.9309));


        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(0), leftleg2.rotateAngleY + (float) Math.toRadians(0), leftleg2.rotateAngleZ + (float) Math.toRadians(-23.5));


        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(0), leftleg3.rotateAngleY + (float) Math.toRadians(-99.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*4), leftleg3.rotateAngleZ + (float) Math.toRadians(0));
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(-0.3);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(0);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(-0.425);


        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(1.30509), rightleg.rotateAngleY + (float) Math.toRadians(68.3549842412+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2), rightleg.rotateAngleZ + (float) Math.toRadians(7.9309));


        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(0), rightleg2.rotateAngleY + (float) Math.toRadians(0), rightleg2.rotateAngleZ + (float) Math.toRadians(23.5));


        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(0), rightleg3.rotateAngleY + (float) Math.toRadians(99.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*4), rightleg3.rotateAngleZ + (float) Math.toRadians(0));
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(-0.3);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(0);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(-0.425);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-2), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*2), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0.15);


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0), leftArm.rotateAngleY + (float) Math.toRadians(-34), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-0.81087), leftArm2.rotateAngleY + (float) Math.toRadians(-57.06912), leftArm2.rotateAngleZ + (float) Math.toRadians(-27.06684));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0), leftArm3.rotateAngleY + (float) Math.toRadians(-136.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-4), leftArm3.rotateAngleZ + (float) Math.toRadians(0));
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(0);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(0.675);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(-0.65);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*2), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-220))*-2), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(5.25), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*4), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(7.25), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*13), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(0);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(0);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(-0.2);


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*16), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-5.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-220))*20), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0), rightArm.rotateAngleY + (float) Math.toRadians(34), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-0.81087), rightArm2.rotateAngleY + (float) Math.toRadians(57.06912), rightArm2.rotateAngleZ + (float) Math.toRadians(27.06684));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0), rightArm3.rotateAngleY + (float) Math.toRadians(136.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-4), rightArm3.rotateAngleZ + (float) Math.toRadians(0));
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(0);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(0.675);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(-0.65);


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDiandongosuchus entity = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+20))*-2), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+20))*-2), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-90))*-2));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*-0.2);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-15.5-(0)));
            yy = -47 + (((tickAnim - 0) / 3) * (-65.5-(-47)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -15.5 + (((tickAnim - 3) / 7) * (-11.32537-(-15.5)));
            yy = -65.5 + (((tickAnim - 3) / 7) * (-18.85973-(-65.5)));
            zz = 0 + (((tickAnim - 3) / 7) * (-41.18277-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -11.32537 + (((tickAnim - 10) / 6) * (-5.98375-(-11.32537)));
            yy = -18.85973 + (((tickAnim - 10) / 6) * (25.58456-(-18.85973)));
            zz = -41.18277 + (((tickAnim - 10) / 6) * (8.25008-(-41.18277)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -5.98375 + (((tickAnim - 16) / 14) * (0-(-5.98375)));
            yy = 25.58456 + (((tickAnim - 16) / 14) * (-47-(25.58456)));
            zz = 8.25008 + (((tickAnim - 16) / 14) * (0-(8.25008)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-12.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (-19.85622-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (22.31337-(0)));
            zz = -12.5 + (((tickAnim - 3) / 7) * (21.57183-(-12.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -19.85622 + (((tickAnim - 10) / 6) * (2.82213-(-19.85622)));
            yy = 22.31337 + (((tickAnim - 10) / 6) * (-10.12608-(22.31337)));
            zz = 21.57183 + (((tickAnim - 10) / 6) * (-7.12885-(21.57183)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 2.82213 + (((tickAnim - 16) / 14) * (0-(2.82213)));
            yy = -10.12608 + (((tickAnim - 16) / 14) * (0-(-10.12608)));
            zz = -7.12885 + (((tickAnim - 16) / 14) * (0-(-7.12885)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -34.25 + (((tickAnim - 0) / 3) * (-61-(-34.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (-147.28855-(0)));
            yy = -61 + (((tickAnim - 3) / 4) * (-82.21673-(-61)));
            zz = 0 + (((tickAnim - 3) / 4) * (147.2813-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -147.28855 + (((tickAnim - 7) / 3) * (-46.12015-(-147.28855)));
            yy = -82.21673 + (((tickAnim - 7) / 3) * (-89.15742-(-82.21673)));
            zz = 147.2813 + (((tickAnim - 7) / 3) * (39.68155-(147.2813)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -46.12015 + (((tickAnim - 10) / 6) * (-16.3282-(-46.12015)));
            yy = -89.15742 + (((tickAnim - 10) / 6) * (-14.91629-(-89.15742)));
            zz = 39.68155 + (((tickAnim - 10) / 6) * (-3.79435-(39.68155)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -16.3282 + (((tickAnim - 16) / 7) * (-8.62257-(-16.3282)));
            yy = -14.91629 + (((tickAnim - 16) / 7) * (8.86765-(-14.91629)));
            zz = -3.79435 + (((tickAnim - 16) / 7) * (-4.34003-(-3.79435)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -8.62257 + (((tickAnim - 23) / 7) * (0-(-8.62257)));
            yy = 8.86765 + (((tickAnim - 23) / 7) * (-34.25-(8.86765)));
            zz = -4.34003 + (((tickAnim - 23) / 7) * (0-(-4.34003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.05 + (((tickAnim - 0) / 3) * (-0.525-(-0.05)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0.225 + (((tickAnim - 0) / 3) * (0-(0.225)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -0.525 + (((tickAnim - 3) / 4) * (-0.525-(-0.525)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (-0.435-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -0.525 + (((tickAnim - 7) / 3) * (-0.425-(-0.525)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = -0.435 + (((tickAnim - 7) / 3) * (-0.575-(-0.435)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -0.425 + (((tickAnim - 10) / 3) * (-0.765-(-0.425)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -0.575 + (((tickAnim - 10) / 3) * (-0.1-(-0.575)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -0.765 + (((tickAnim - 13) / 3) * (0.475-(-0.765)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = -0.1 + (((tickAnim - 13) / 3) * (0-(-0.1)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0.475 + (((tickAnim - 16) / 7) * (-0.04-(0.475)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0.185-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -0.04 + (((tickAnim - 23) / 7) * (-0.05-(-0.04)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0.185 + (((tickAnim - 23) / 7) * (0.225-(0.185)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -5.98375 + (((tickAnim - 0) / 18) * (-15.5-(-5.98375)));
            yy = -25.58456 + (((tickAnim - 0) / 18) * (65.5-(-25.58456)));
            zz = -8.25008 + (((tickAnim - 0) / 18) * (0-(-8.25008)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -15.5 + (((tickAnim - 18) / 6) * (-11.32537-(-15.5)));
            yy = 65.5 + (((tickAnim - 18) / 6) * (18.85973-(65.5)));
            zz = 0 + (((tickAnim - 18) / 6) * (41.18277-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -11.32537 + (((tickAnim - 24) / 6) * (-5.98375-(-11.32537)));
            yy = 18.85973 + (((tickAnim - 24) / 6) * (-25.58456-(18.85973)));
            zz = 41.18277 + (((tickAnim - 24) / 6) * (-8.25008-(41.18277)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 2.82213 + (((tickAnim - 0) / 18) * (0-(2.82213)));
            yy = 10.12608 + (((tickAnim - 0) / 18) * (0-(10.12608)));
            zz = 7.12885 + (((tickAnim - 0) / 18) * (12.5-(7.12885)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (-19.85622-(0)));
            yy = 0 + (((tickAnim - 18) / 6) * (-22.31337-(0)));
            zz = 12.5 + (((tickAnim - 18) / 6) * (-21.57183-(12.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -19.85622 + (((tickAnim - 24) / 6) * (2.82213-(-19.85622)));
            yy = -22.31337 + (((tickAnim - 24) / 6) * (10.12608-(-22.31337)));
            zz = -21.57183 + (((tickAnim - 24) / 6) * (7.12885-(-21.57183)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -0.175 + (((tickAnim - 0) / 18) * (0-(-0.175)));
            yy = -0.1 + (((tickAnim - 0) / 18) * (0-(-0.1)));
            zz = 0.35 + (((tickAnim - 0) / 18) * (0-(0.35)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (-0.175-(0)));
            yy = 0 + (((tickAnim - 18) / 12) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0.35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -16.3282 + (((tickAnim - 0) / 8) * (4.02967-(-16.3282)));
            yy = 14.91629 + (((tickAnim - 0) / 8) * (-14.81489-(14.91629)));
            zz = 3.79435 + (((tickAnim - 0) / 8) * (-0.21207-(3.79435)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 4.02967 + (((tickAnim - 8) / 10) * (0-(4.02967)));
            yy = -14.81489 + (((tickAnim - 8) / 10) * (61-(-14.81489)));
            zz = -0.21207 + (((tickAnim - 8) / 10) * (0-(-0.21207)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (-147.28855-(0)));
            yy = 61 + (((tickAnim - 18) / 3) * (82.21673-(61)));
            zz = 0 + (((tickAnim - 18) / 3) * (-147.2813-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -147.28855 + (((tickAnim - 21) / 3) * (-46.12015-(-147.28855)));
            yy = 82.21673 + (((tickAnim - 21) / 3) * (89.15742-(82.21673)));
            zz = -147.2813 + (((tickAnim - 21) / 3) * (-39.68155-(-147.2813)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -46.12015 + (((tickAnim - 24) / 6) * (-16.3282-(-46.12015)));
            yy = 89.15742 + (((tickAnim - 24) / 6) * (14.91629-(89.15742)));
            zz = -39.68155 + (((tickAnim - 24) / 6) * (3.79435-(-39.68155)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.5 + (((tickAnim - 0) / 8) * (0.325-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.25-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0.325 + (((tickAnim - 8) / 6) * (0.2-(0.325)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0.25 + (((tickAnim - 8) / 6) * (0.45-(0.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0.2 + (((tickAnim - 14) / 4) * (-0.525-(0.2)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0.45 + (((tickAnim - 14) / 4) * (0-(0.45)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -0.525 + (((tickAnim - 18) / 3) * (0.525-(-0.525)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (-0.435-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0.525 + (((tickAnim - 21) / 3) * (0.425-(0.525)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = -0.435 + (((tickAnim - 21) / 3) * (-0.225-(-0.435)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0.425 + (((tickAnim - 24) / 4) * (0.435-(0.425)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = -0.225 + (((tickAnim - 24) / 4) * (-0.1-(-0.225)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0.435 + (((tickAnim - 28) / 2) * (-0.5-(0.435)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = -0.1 + (((tickAnim - 28) / 2) * (0-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+20))*2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*-2), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+50))*2), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-220))*-2));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.10641-(0)));
            yy = 59 + (((tickAnim - 0) / 15) * (-34.55564-(59)));
            zz = 0 + (((tickAnim - 0) / 15) * (-3.28856-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 3.10641 + (((tickAnim - 15) / 6) * (6.34348-(3.10641)));
            yy = -34.55564 + (((tickAnim - 15) / 6) * (16.13216-(-34.55564)));
            zz = -3.28856 + (((tickAnim - 15) / 6) * (-24.39276-(-3.28856)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 6.34348 + (((tickAnim - 21) / 9) * (0-(6.34348)));
            yy = 16.13216 + (((tickAnim - 21) / 9) * (59-(16.13216)));
            zz = -24.39276 + (((tickAnim - 21) / 9) * (0-(-24.39276)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -45.28681 + (((tickAnim - 0) / 15) * (10.75-(-45.28681)));
            yy = -27.51442 + (((tickAnim - 0) / 15) * (-5.25-(-27.51442)));
            zz = 42.17811 + (((tickAnim - 0) / 15) * (-34.25-(42.17811)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 10.75 + (((tickAnim - 15) / 6) * (-14.90139-(10.75)));
            yy = -5.25 + (((tickAnim - 15) / 6) * (-26.87771-(-5.25)));
            zz = -34.25 + (((tickAnim - 15) / 6) * (-4.47404-(-34.25)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -14.90139 + (((tickAnim - 21) / 5) * (-69.03518-(-14.90139)));
            yy = -26.87771 + (((tickAnim - 21) / 5) * (-4.8234-(-26.87771)));
            zz = -4.47404 + (((tickAnim - 21) / 5) * (36.03127-(-4.47404)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -69.03518 + (((tickAnim - 26) / 4) * (-45.28681-(-69.03518)));
            yy = -4.8234 + (((tickAnim - 26) / 4) * (-27.51442-(-4.8234)));
            zz = 36.03127 + (((tickAnim - 26) / 4) * (42.17811-(36.03127)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 8) * (-0.385-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.385 + (((tickAnim - 8) / 7) * (0-(-0.385)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (9.1338-(0)));
            yy = -34 + (((tickAnim - 0) / 8) * (-15.98207-(-34)));
            zz = 0 + (((tickAnim - 0) / 8) * (16.05847-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 9.1338 + (((tickAnim - 8) / 7) * (0-(9.1338)));
            yy = -15.98207 + (((tickAnim - 8) / 7) * (-82-(-15.98207)));
            zz = 16.05847 + (((tickAnim - 8) / 7) * (0-(16.05847)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = -82 + (((tickAnim - 15) / 6) * (-113.83-(-82)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (30.82947-(0)));
            yy = -113.83 + (((tickAnim - 21) / 5) * (-122.92002-(-113.83)));
            zz = 0 + (((tickAnim - 21) / 5) * (-31.77877-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 30.82947 + (((tickAnim - 26) / 4) * (0-(30.82947)));
            yy = -122.92002 + (((tickAnim - 26) / 4) * (-34-(-122.92002)));
            zz = -31.77877 + (((tickAnim - 26) / 4) * (0-(-31.77877)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.25-(0)));
            yy = 0.1 + (((tickAnim - 0) / 8) * (0.05-(0.1)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.135-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.25 + (((tickAnim - 8) / 7) * (-0.5-(-0.25)));
            yy = 0.05 + (((tickAnim - 8) / 7) * (1.1-(0.05)));
            zz = 0.135 + (((tickAnim - 8) / 7) * (-0.175-(0.135)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -0.5 + (((tickAnim - 15) / 6) * (-0.22-(-0.5)));
            yy = 1.1 + (((tickAnim - 15) / 6) * (1.54-(1.1)));
            zz = -0.175 + (((tickAnim - 15) / 6) * (-0.08-(-0.175)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -0.22 + (((tickAnim - 21) / 5) * (-0.45-(-0.22)));
            yy = 1.54 + (((tickAnim - 21) / 5) * (1.3-(1.54)));
            zz = -0.08 + (((tickAnim - 21) / 5) * (-0.49-(-0.08)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -0.45 + (((tickAnim - 26) / 4) * (0-(-0.45)));
            yy = 1.3 + (((tickAnim - 26) / 4) * (0.1-(1.3)));
            zz = -0.49 + (((tickAnim - 26) / 4) * (0-(-0.49)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*1), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+100))*-2), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-320))*-2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*-1), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*2), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+20))*2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+20))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-90))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+50))*-1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-90))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+100))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-90))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+50))*6), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-90))*-2));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 3.10641 + (((tickAnim - 0) / 8) * (6.34348-(3.10641)));
            yy = 34.55564 + (((tickAnim - 0) / 8) * (-16.13216-(34.55564)));
            zz = 3.28856 + (((tickAnim - 0) / 8) * (24.39276-(3.28856)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 6.34348 + (((tickAnim - 8) / 7) * (0-(6.34348)));
            yy = -16.13216 + (((tickAnim - 8) / 7) * (-59-(-16.13216)));
            zz = 24.39276 + (((tickAnim - 8) / 7) * (0-(24.39276)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (3.10641-(0)));
            yy = -59 + (((tickAnim - 15) / 15) * (34.55564-(-59)));
            zz = 0 + (((tickAnim - 15) / 15) * (3.28856-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 10.75 + (((tickAnim - 0) / 6) * (-14.90139-(10.75)));
            yy = 5.25 + (((tickAnim - 0) / 6) * (26.87771-(5.25)));
            zz = 34.25 + (((tickAnim - 0) / 6) * (4.47404-(34.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -14.90139 + (((tickAnim - 6) / 5) * (-69.03518-(-14.90139)));
            yy = 26.87771 + (((tickAnim - 6) / 5) * (4.8234-(26.87771)));
            zz = 4.47404 + (((tickAnim - 6) / 5) * (-36.03127-(4.47404)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -69.03518 + (((tickAnim - 11) / 4) * (-45.28681-(-69.03518)));
            yy = 4.8234 + (((tickAnim - 11) / 4) * (27.51442-(4.8234)));
            zz = -36.03127 + (((tickAnim - 11) / 4) * (-42.17811-(-36.03127)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -45.28681 + (((tickAnim - 15) / 15) * (10.75-(-45.28681)));
            yy = 27.51442 + (((tickAnim - 15) / 15) * (5.25-(27.51442)));
            zz = -42.17811 + (((tickAnim - 15) / 15) * (34.25-(-42.17811)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -0.325 + (((tickAnim - 15) / 15) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 82 + (((tickAnim - 0) / 6) * (113.83-(82)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (30.82947-(0)));
            yy = 113.83 + (((tickAnim - 6) / 5) * (122.92002-(113.83)));
            zz = 0 + (((tickAnim - 6) / 5) * (31.77877-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 30.82947 + (((tickAnim - 11) / 4) * (0-(30.82947)));
            yy = 122.92002 + (((tickAnim - 11) / 4) * (34-(122.92002)));
            zz = 31.77877 + (((tickAnim - 11) / 4) * (0-(31.77877)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (9.24354-(0)));
            yy = 34 + (((tickAnim - 15) / 8) * (13.0985-(34)));
            zz = 0 + (((tickAnim - 15) / 8) * (-17.35596-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 9.24354 + (((tickAnim - 23) / 7) * (0-(9.24354)));
            yy = 13.0985 + (((tickAnim - 23) / 7) * (82-(13.0985)));
            zz = -17.35596 + (((tickAnim - 23) / 7) * (0-(-17.35596)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0.5 + (((tickAnim - 0) / 6) * (0.72-(0.5)));
            yy = 1.1 + (((tickAnim - 0) / 6) * (1.54-(1.1)));
            zz = -0.175 + (((tickAnim - 0) / 6) * (-0.08-(-0.175)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0.72 + (((tickAnim - 6) / 5) * (0.45-(0.72)));
            yy = 1.54 + (((tickAnim - 6) / 5) * (1.3-(1.54)));
            zz = -0.08 + (((tickAnim - 6) / 5) * (-0.49-(-0.08)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0.45 + (((tickAnim - 11) / 4) * (0-(0.45)));
            yy = 1.3 + (((tickAnim - 11) / 4) * (0.1-(1.3)));
            zz = -0.49 + (((tickAnim - 11) / 4) * (0-(-0.49)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0.1 + (((tickAnim - 15) / 8) * (0.125-(0.1)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0.5-(0)));
            yy = 0.125 + (((tickAnim - 23) / 7) * (1.1-(0.125)));
            zz = 0 + (((tickAnim - 23) / 7) * (-0.175-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);

    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDiandongosuchus entity = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*4), root.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(1.30509), leftleg.rotateAngleY + (float) Math.toRadians(-68.3549842412+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*2), leftleg.rotateAngleZ + (float) Math.toRadians(-7.9309));


        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(0), leftleg2.rotateAngleY + (float) Math.toRadians(0), leftleg2.rotateAngleZ + (float) Math.toRadians(-23.5));


        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(0), leftleg3.rotateAngleY + (float) Math.toRadians(-99.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*4), leftleg3.rotateAngleZ + (float) Math.toRadians(0));
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(-0.3);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(0);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(-0.425);


        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(1.30509), rightleg.rotateAngleY + (float) Math.toRadians(68.3549842412+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*2), rightleg.rotateAngleZ + (float) Math.toRadians(7.9309));


        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(0), rightleg2.rotateAngleY + (float) Math.toRadians(0), rightleg2.rotateAngleZ + (float) Math.toRadians(23.5));


        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(0), rightleg3.rotateAngleY + (float) Math.toRadians(99.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*4), rightleg3.rotateAngleZ + (float) Math.toRadians(0));
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(-0.3);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(0);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(-0.425);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-4), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*4), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0.15);


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0), leftArm.rotateAngleY + (float) Math.toRadians(-34), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-0.81087), leftArm2.rotateAngleY + (float) Math.toRadians(-57.06912), leftArm2.rotateAngleZ + (float) Math.toRadians(-27.06684));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0), leftArm3.rotateAngleY + (float) Math.toRadians(-136.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-4), leftArm3.rotateAngleZ + (float) Math.toRadians(0));
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(0);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(0.675);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(-0.65);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*2), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-220))*-2), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(5.25), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*4), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(7.25), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*18), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(0);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(0);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(-0.425);


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*25), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-5.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*35), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0), rightArm.rotateAngleY + (float) Math.toRadians(34), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-0.81087), rightArm2.rotateAngleY + (float) Math.toRadians(57.06912), rightArm2.rotateAngleZ + (float) Math.toRadians(27.06684));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0), rightArm3.rotateAngleY + (float) Math.toRadians(136.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-4), rightArm3.rotateAngleZ + (float) Math.toRadians(0));
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(0);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(0.675);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(-0.65);

    }




    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDiandongosuchus e = (EntityPrehistoricFloraDiandongosuchus) entity;
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
