package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHescheleria;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHescheleria extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    private ModelAnimator animator;

    public ModelHescheleria() {
        this.textureWidth = 41;
        this.textureHeight = 41;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 18.4F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 19, 10, -1.0F, -1.5F, -2.0F, 3, 3, 4, 0.006F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.85F, 0.5656F, -0.2102F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -1.045F, 0.3843F, -0.2121F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 1, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.003F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.5444F, -0.2635F, -0.1564F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 28, 21, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.25F, -0.5F, 1.5F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, -0.1745F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 10, 0.0F, -1.25F, 0.0F, 0, 2, 2, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-0.85F, 0.5656F, -0.2102F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -1.045F, -0.3843F, 0.2121F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 1, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.003F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.5444F, 0.2635F, 0.1564F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 28, 21, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.25F, -0.5F, 1.5F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 0.1745F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 10, 0.0F, -1.25F, 0.0F, 0, 2, 2, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, -1.2F, -1.5F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0087F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -0.5F, -6.0F, 4, 3, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 10, -1.5F, 2.2F, -6.0F, 3, 1, 6, 0.009F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0632F, -5.5125F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 20, 0, -1.5F, -0.5F, -3.0F, 3, 3, 3, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(1.4223F, 2.069F, -2.2812F);
        this.body2.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.8474F, 0.5788F, -0.2075F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 0, 19, -0.5F, -0.5F, -0.25F, 1, 1, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.25F, 0.25F, 1.25F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.0F, -0.2182F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 8, 0.0F, -1.5F, 0.0F, 0, 2, 2, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.4223F, 2.069F, -2.2812F);
        this.body2.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.8474F, -0.5788F, 0.2075F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 0, 19, -0.5F, -0.5F, -0.25F, 1, 1, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.25F, 0.25F, 1.25F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.0F, 0.2182F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 8, 0.0F, -1.5F, 0.0F, 0, 2, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.55F, -2.5F);
        this.body2.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 21, 35, -1.0F, -1.0F, -2.0F, 2, 2, 2, 0.006F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 21, -1.0F, -0.5F, 0.0F, 2, 1, 2, -0.003F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.0F, -1.9F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 9, 35, -1.0F, 0.45F, -1.925F, 2, 1, 2, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.25F, 1.2098F, -3.7939F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1222F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 26, -0.65F, -0.8F, 0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 7, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.003F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 26, 0.15F, -0.8F, 0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 26, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.5757F, -4.6065F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.2741F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 27, -0.3F, 0.25F, -1.0F, 0, 1, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 27, 0.3F, 0.25F, -1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 30, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.0399F, -3.8185F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6632F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 13, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.2649F, -2.8441F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2269F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 30, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -0.23F, -1.8448F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 30, 0.25F, 0.0F, -1.0F, 1, 1, 1, 0.006F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 0, -0.25F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.2F, -2.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 21, -0.5F, -0.05F, 0.15F, 2, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 1.4592F, -0.3706F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0131F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.9F, 0.5417F, -3.0388F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3272F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 2, 28, -0.4F, -1.1F, -0.425F, 0, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.7917F, -3.0388F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.24F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 26, 0.4F, -1.1F, -0.425F, 0, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 26, -0.4F, -1.1F, -0.425F, 0, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.9535F, -1.5749F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1091F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 10, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 0.0473F, 0.4453F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0218F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 24, -1.0F, -0.8F, -1.65F, 2, 1, 2, -0.011F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 27, -1.0F, -0.05F, -2.0F, 2, 1, 2, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, 0.65F, -2.675F);
        this.head.addChild(eye);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.375F, 0.0F, 0.0F);
        this.eye.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.2182F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 35, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.375F, 0.0F, 0.0F);
        this.eye.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.2182F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 35, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -0.5F, 1.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 29, 3, -0.7F, -1.0F, 0.0F, 2, 3, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 30, 33, -1.4F, -1.0F, 0.0F, 1, 3, 4, -0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 3.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 27, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.006F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 34, -0.5F, -1.9F, 0.0F, 1, 2, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 34, -0.5F, -0.3F, 0.0F, 1, 2, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.8F, 4.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 15, 27, -0.5F, -1.425F, 0.0F, 1, 1, 6, 0.003F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 12, 0.0F, -2.425F, 0.0F, 0, 3, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 18, -0.5F, -1.4F, 0.0F, 1, 1, 7, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 10, 11, -0.025F, -2.425F, 0.0F, 0, 3, 7, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 26, 22, 0.0F, -2.4F, 7.0F, 0, 3, 3, 0.0F, false));


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
        this.main.offsetY = -1.0F;
        this.main.offsetX = -0.038F;
        this.main.rotateAngleY = (float)Math.toRadians(220);
        this.main.rotateAngleX = (float)Math.toRadians(18);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 2.33F;
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
        this.main.offsetY = 0.0F;

        EntityPrehistoricFloraHescheleria proteros = (EntityPrehistoricFloraHescheleria) e;

//        this.faceTarget(f3, f4, 10, neck1);
//        this.faceTarget(f3, f4, 10, neck2);
//        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, head};
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
        this.eye.setScale(1,1,1);
        EntityPrehistoricFloraHescheleria ee = (EntityPrehistoricFloraHescheleria) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            animBeach(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {
            //Swimming pose:
            if(ee.getIsFast()) {
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animBlink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        



    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHescheleria entity = (EntityPrehistoricFloraHescheleria) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-9.38-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -9.38 + (((tickAnim - 5) / 5) * (0-(-9.38)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (3.75-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 3.75 + (((tickAnim - 15) / 5) * (0-(3.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (12.25-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 12.25 + (((tickAnim - 10) / 5) * (-6.25-(12.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -6.25 + (((tickAnim - 15) / 5) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0.15-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0.15 + (((tickAnim - 15) / 5) * (0-(0.15)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (30-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 30 + (((tickAnim - 10) / 4) * (0-(30)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animBlink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHescheleria entity = (EntityPrehistoricFloraHescheleria) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -4 + (((tickAnim - 4) / 2) * (-4-(-4)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -4 + (((tickAnim - 6) / 4) * (0-(-4)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eye, eye.rotateAngleX + (float) Math.toRadians(xx), eye.rotateAngleY + (float) Math.toRadians(yy), eye.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1 + (((tickAnim - 0) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 4) * (0.035-(1)));
            zz = 1 + (((tickAnim - 0) / 4) * (1-(1)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 4) / 2) * (1-(1)));
            yy = 0.035 + (((tickAnim - 4) / 2) * (0.035-(0.035)));
            zz = 1 + (((tickAnim - 4) / 2) * (1-(1)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 6) / 4) * (1-(1)));
            yy = 0.035 + (((tickAnim - 6) / 4) * (1-(0.035)));
            zz = 1 + (((tickAnim - 6) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animBeach(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHescheleria entity = (EntityPrehistoricFloraHescheleria) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0.7469), main.rotateAngleY + (float) Math.toRadians(-0.0686), main.rotateAngleZ + (float) Math.toRadians(5.2497));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(-4.225);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(-35.343), leftLeg.rotateAngleY + (float) Math.toRadians(-17.6051), leftLeg.rotateAngleZ + (float) Math.toRadians(-77.1977));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0), leftLeg2.rotateAngleY + (float) Math.toRadians(21), leftLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(-34.1702), rightLeg.rotateAngleY + (float) Math.toRadians(16.5104), rightLeg.rotateAngleZ + (float) Math.toRadians(63.6913));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0), rightLeg2.rotateAngleY + (float) Math.toRadians(-19.25), rightLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0.0001), body.rotateAngleY + (float) Math.toRadians(-1), body.rotateAngleZ + (float) Math.toRadians(-3.7588));
        this.body.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*0.02),(float)1,(float)1);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-6.4979), body2.rotateAngleY + (float) Math.toRadians(-0.0786), body2.rotateAngleZ + (float) Math.toRadians(-2.9989));
        this.body2.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-0.02),(float)1,(float)1);


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(-28.131), leftArm.rotateAngleY + (float) Math.toRadians(-33.1731), leftArm.rotateAngleZ + (float) Math.toRadians(-79.1829));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-28.131), rightArm.rotateAngleY + (float) Math.toRadians(33.1731), rightArm.rotateAngleZ + (float) Math.toRadians(79.1829));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(4.75), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-11.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.275);


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(18.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*7), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(6.25), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-7.3629), tail2.rotateAngleY + (float) Math.toRadians(-1.7568), tail2.rotateAngleZ + (float) Math.toRadians(-7.7661));
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(-0.1);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(0);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(0);


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(1.7573), tail3.rotateAngleY + (float) Math.toRadians(-5.3473), tail3.rotateAngleZ + (float) Math.toRadians(4.9817));
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(-0.1);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(0);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(0);


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(1.2318), tail4.rotateAngleY + (float) Math.toRadians(-20.539), tail4.rotateAngleZ + (float) Math.toRadians(8.547));
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(-0.1);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(0);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(0);

    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHescheleria entity = (EntityPrehistoricFloraHescheleria) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*10), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*2);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(0), leftLeg.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*5), leftLeg.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0), leftLeg2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-5), leftLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(0), rightLeg.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*5), rightLeg.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0), rightLeg2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-5), rightLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*15), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*15), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*3), leftArm.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*5), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*3), rightArm.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*5), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-15), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*15), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.2);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-20), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-25), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*-30), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-35), tail4.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHescheleria entity = (EntityPrehistoricFloraHescheleria) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+50))*-2), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*5), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*0.7);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(0), leftLeg.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*5), leftLeg.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0), leftLeg2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-5), leftLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(0), rightLeg.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*5), rightLeg.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0), rightLeg2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-5), rightLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*3), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*5), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*3), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+80))*5), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*3), leftArm.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+80))*5), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*3), rightArm.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+80))*5), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*-3), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-5), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*4), head.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*5), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.2);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*1), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-15), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*1), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-15), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*1), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*-20), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-300))*1), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-25), tail4.rotateAngleZ + (float) Math.toRadians(0));

    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHescheleria e = (EntityPrehistoricFloraHescheleria) entity;
        animator.update(entity);

    }
}
