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
                if(ee.getIsFast()){
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
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


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiandongosuchus entity = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiandongosuchus entity = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiandongosuchus entity = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiandongosuchus entity = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiandongosuchus entity = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDiandongosuchus entity = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDiandongosuchus entity = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDiandongosuchus entity = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;

    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDiandongosuchus entity = (EntityPrehistoricFloraDiandongosuchus) entitylivingbaseIn;

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
