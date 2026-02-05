package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDiplocaulus_minimus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDiplocaulus_minimus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;


    private ModelAnimator animator;

    public ModelDiplocaulus_minimus() {
        this.textureWidth = 47;
        this.textureHeight = 44;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 22.0F, 7.0F);
        this.main.cubeList.add(new ModelBox(main, 22, 29, -1.5F, -0.75F, -1.0F, 3, 2, 2, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.3729F, 0.8308F, -0.689F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.4514F, 0.9038F, -0.1054F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 29, 37, -0.25F, -0.5F, -0.25F, 1, 1, 3, 0.0F, false));
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 38, 37, -0.65F, -0.5F, -0.25F, 1, 1, 3, -0.003F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.05F, 0.25F, 2.35F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.2618F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 18, 39, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.3729F, 0.8308F, -0.689F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.4514F, -0.9038F, 0.1054F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 29, 37, -0.75F, -0.5F, -0.25F, 1, 1, 3, 0.0F, true));
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 38, 37, -0.35F, -0.5F, -0.25F, 1, 1, 3, -0.003F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.05F, 0.25F, 2.35F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.2618F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 18, 39, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.2F, 0.0F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 9, -1.0F, -0.75F, 0.0F, 2, 1, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 15, 9, -1.0F, -0.25F, 0.0F, 2, 1, 5, -0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0833F, -0.0833F, 4.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 23, -0.3333F, -0.5667F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 28, 16, -0.3333F, -0.3667F, 0.0F, 1, 1, 4, -0.003F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 28, 16, -0.8333F, -0.3667F, 0.0F, 1, 1, 4, -0.003F, true));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 27, -0.8333F, -0.5667F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.0833F, 0.0333F, 3.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 21, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 15, 16, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 11, 28, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.3617F, -0.5143F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 16, -2.0F, -0.5383F, -2.9857F, 4, 2, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.7096F, 0.0905F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 23, -1.5F, -1.0F, -3.0F, 3, 1, 3, 0.003F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.1383F, -2.9857F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.6994F, -0.5F, -4.5008F, 5, 3, 5, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(-0.1994F, 0.2887F, -3.9751F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 22, -2.0F, -0.5387F, -2.0257F, 4, 2, 2, -0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.0613F, -0.0257F);
        this.body3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2531F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 33, -1.5F, -0.85F, -2.025F, 3, 1, 2, 0.003F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.1386F, -1.5289F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 30, 7, -1.5F, -0.1501F, -1.9968F, 3, 2, 2, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -0.311F, -1.8263F);
        this.body4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.048F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 39, -0.5F, 0.025F, -0.2F, 2, 1, 2, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(1.3845F, 1.3499F, -0.2635F);
        this.body4.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.3048F, -0.9645F, 0.0523F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 37, 22, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, -0.5F, -2.25F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.2775F, 0.3488F, -0.1025F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 34, 4, -0.5F, 0.5F, -2.0F, 2, 0, 2, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.3845F, 1.3499F, -0.2635F);
        this.body4.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.3048F, 0.9645F, -0.0523F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 37, 22, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, -0.5F, -2.25F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.2775F, -0.3488F, 0.1025F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 34, 4, -1.5F, 0.5F, -2.0F, 2, 0, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.3411F, -1.6493F);
        this.body4.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 30, 12, -1.5F, 0.291F, -1.4975F, 3, 1, 2, -0.003F, false));
        this.neck.cubeList.add(new ModelBox(neck, 33, 29, -1.5F, 1.116F, -1.4975F, 3, 1, 2, -0.006F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.165F, -1.0679F);
        this.neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1353F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 42, -0.5F, 0.025F, -0.15F, 2, 1, 1, -0.003F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0338F, 0.1439F, -1.0949F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 33, 33, -1.5338F, 0.5471F, -1.9026F, 3, 1, 2, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 18, 42, -0.5338F, 0.5471F, -2.9026F, 1, 1, 1, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.5547F, 1.0471F, 0.533F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 1.1345F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 41, 7, -0.1F, -0.5F, -1.8F, 1, 1, 2, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.678F, 1.0471F, -0.8758F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.6981F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 34, -1.0F, -0.5F, 0.0F, 1, 1, 3, 0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.4662F, 1.0471F, -2.9026F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.829F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 34, -1.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.7703F, 1.0471F, 0.4387F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -1.309F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 41, 11, -1.0F, -0.5F, -2.0F, 1, 1, 2, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.832F, 1.0471F, -0.9742F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.7418F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 23, 42, 0.0F, -0.5F, 0.0F, 1, 1, 1, 0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5338F, 1.0471F, -2.9026F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.8727F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 37, 0.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.7338F, 0.841F, -1.4597F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.056F, -0.1658F, -0.1101F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 33, 42, -0.575F, -0.5F, -0.7F, 1, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.6662F, 0.841F, -1.4597F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.056F, 0.1658F, 0.1101F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 33, 42, -0.425F, -0.5F, -0.7F, 1, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.0338F, 0.5471F, -1.9026F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2662F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 0, -1.5F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.0338F, 1.3721F, -0.4026F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.575F, 0.5F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 42, -0.5F, -1.0F, -2.95F, 1, 1, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 39, 16, -1.0F, -1.0F, -2.05F, 2, 1, 2, 0.003F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = -0.2F;
        this.main.rotateAngleY = (float)Math.toRadians(140);
        this.main.rotateAngleX = (float)Math.toRadians(24);
        this.main.rotateAngleZ = (float)Math.toRadians(5);
        this.main.scaleChildren = true;
        float scaler = 0.98F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        EntityPrehistoricFloraDiplocaulus_minimus entitySilesaurus = (EntityPrehistoricFloraDiplocaulus_minimus) e;

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
        EntityPrehistoricFloraDiplocaulus_minimus ee = (EntityPrehistoricFloraDiplocaulus_minimus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDiplocaulus_minimus entity = (EntityPrehistoricFloraDiplocaulus_minimus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-30), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*2);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*1);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 106.46344 + (((tickAnim - 0) / 20) * (31.71344-(106.46344)));
            yy = -40.34089 + (((tickAnim - 0) / 20) * (-40.34089-(-40.34089)));
            zz = 101.42112 + (((tickAnim - 0) / 20) * (101.42112-(101.42112)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 31.71344 + (((tickAnim - 20) / 10) * (67.70906-(31.71344)));
            yy = -40.34089 + (((tickAnim - 20) / 10) * (-60.99697-(-40.34089)));
            zz = 101.42112 + (((tickAnim - 20) / 10) * (82.41067-(101.42112)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 67.70906 + (((tickAnim - 30) / 10) * (106.46344-(67.70906)));
            yy = -60.99697 + (((tickAnim - 30) / 10) * (-40.34089-(-60.99697)));
            zz = 82.41067 + (((tickAnim - 30) / 10) * (101.42112-(82.41067)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 19.11109 + (((tickAnim - 0) / 10) * (72.51999-(19.11109)));
            yy = 44.71736 + (((tickAnim - 0) / 10) * (57.44539-(44.71736)));
            zz = -79.30867 + (((tickAnim - 0) / 10) * (-72.5632-(-79.30867)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 72.51999 + (((tickAnim - 10) / 10) * (115.12019-(72.51999)));
            yy = 57.44539 + (((tickAnim - 10) / 10) * (43.5764-(57.44539)));
            zz = -72.5632 + (((tickAnim - 10) / 10) * (-105.26804-(-72.5632)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 115.12019 + (((tickAnim - 20) / 20) * (19.11109-(115.12019)));
            yy = 43.5764 + (((tickAnim - 20) / 20) * (44.71736-(43.5764)));
            zz = -105.26804 + (((tickAnim - 20) / 20) * (-79.30867-(-105.26804)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-20), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*-10), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-20), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-20), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*-20), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*20), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*10));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*5), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-230))*2));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*-10), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*-10));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-300))*-15), body4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-400))*-5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 110.82476 + (((tickAnim - 0) / 10) * (85.22103-(110.82476)));
            yy = 48.76898 + (((tickAnim - 0) / 10) * (11.81599-(48.76898)));
            zz = -92.16485 + (((tickAnim - 0) / 10) * (-106.8884-(-92.16485)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 85.22103 + (((tickAnim - 10) / 10) * (66.7965-(85.22103)));
            yy = 11.81599 + (((tickAnim - 10) / 10) * (48.79392-(11.81599)));
            zz = -106.8884 + (((tickAnim - 10) / 10) * (-91.91449-(-106.8884)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 66.7965 + (((tickAnim - 20) / 6) * (111.63808-(66.7965)));
            yy = 48.79392 + (((tickAnim - 20) / 6) * (48.78664-(48.79392)));
            zz = -91.91449 + (((tickAnim - 20) / 6) * (-91.98751-(-91.91449)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 111.63808 + (((tickAnim - 26) / 14) * (110.82476-(111.63808)));
            yy = 48.78664 + (((tickAnim - 26) / 14) * (48.76898-(48.78664)));
            zz = -91.98751 + (((tickAnim - 26) / 14) * (-92.16485-(-91.98751)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(33.75), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 55.07476 + (((tickAnim - 0) / 20) * (112.32476-(55.07476)));
            yy = -48.76898 + (((tickAnim - 0) / 20) * (-48.76898-(-48.76898)));
            zz = 92.16485 + (((tickAnim - 0) / 20) * (92.16485-(92.16485)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 112.32476 + (((tickAnim - 20) / 10) * (59.70819-(112.32476)));
            yy = -48.76898 + (((tickAnim - 20) / 10) * (0.47586-(-48.76898)));
            zz = 92.16485 + (((tickAnim - 20) / 10) * (93.05921-(92.16485)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 59.70819 + (((tickAnim - 30) / 10) * (55.07476-(59.70819)));
            yy = 0.47586 + (((tickAnim - 30) / 10) * (-48.76898-(0.47586)));
            zz = 93.05921 + (((tickAnim - 30) / 10) * (92.16485-(93.05921)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(42.25), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-350))*20), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-400))*-5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-600))*5), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-400))*25), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-600))*-5));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.5 + (((tickAnim - 0) / 5) * (35.5-(0.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 35.5 + (((tickAnim - 5) / 10) * (0-(35.5)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (53.25-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 53.25 + (((tickAnim - 25) / 8) * (0-(53.25)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDiplocaulus_minimus entity = (EntityPrehistoricFloraDiplocaulus_minimus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*9), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-0.59);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(53.407666652+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*9), leftLeg.rotateAngleY + (float) Math.toRadians(-44.90377), leftLeg.rotateAngleZ + (float) Math.toRadians(94.42288));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-33.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*12), leftLeg2.rotateAngleY + (float) Math.toRadians(0), leftLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(53.407666652+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-9), rightLeg.rotateAngleY + (float) Math.toRadians(44.90377), rightLeg.rotateAngleZ + (float) Math.toRadians(-94.42288));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-33.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-12), rightLeg2.rotateAngleY + (float) Math.toRadians(0), rightLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*3), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*9), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*15), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*18), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*21), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-9), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-9), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*9), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-9), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(109.3432366885+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*9), leftArm.rotateAngleY + (float) Math.toRadians(49.45164), leftArm.rotateAngleZ + (float) Math.toRadians(-91.78623));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(27+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-12), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(109.3432366885+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-9), rightArm.rotateAngleY + (float) Math.toRadians(-49.45164), rightArm.rotateAngleZ + (float) Math.toRadians(91.78623));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(27+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*12), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-350))*-9), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-500))*-9), head.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiplocaulus_minimus entity = (EntityPrehistoricFloraDiplocaulus_minimus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -11 + (((tickAnim - 10) / 3) * (4.75-(-11)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 4.75 + (((tickAnim - 13) / 7) * (0-(4.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -11.75 + (((tickAnim - 13) / 7) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (39.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 39.25 + (((tickAnim - 7) / 3) * (39.25-(39.25)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 39.25 + (((tickAnim - 10) / 3) * (0-(39.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDiplocaulus_minimus e = (EntityPrehistoricFloraDiplocaulus_minimus) entity;
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
