package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGigamachilis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelGigamachilis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftMandible1;
    private final AdvancedModelRenderer rightMandible1;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer leftAntennae1;
    private final AdvancedModelRenderer rightAntennae1;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer leftLeg6;
    private final AdvancedModelRenderer rightLeg6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer leftAntennae2;
    private final AdvancedModelRenderer rightAntennae2;
    private final AdvancedModelRenderer leftLeg7;
    private final AdvancedModelRenderer rightLeg7;

    private ModelAnimator animator;

    public ModelGigamachilis() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 23.05F, 0.0F);
        this.setRotateAngle(root, -0.1745F, 0.0F, 0.0F);
        this.root.cubeList.add(new ModelBox(root, 13, 13, -1.5F, -1.5F, -3.0F, 3, 2, 3, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5F, 1.0F, -2.75F);
        this.root.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.1467F, 0.3194F, -0.0905F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 11, 24, 0.0F, -1.0F, 0.0F, 4, 2, 0, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5F, 1.0F, -2.75F);
        this.root.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.1467F, -0.3194F, 0.0905F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 11, 24, -4.0F, -1.0F, 0.0F, 4, 2, 0, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.5F, 1.0F, -2.25F);
        this.root.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.2573F, -0.3457F, -0.2285F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 24, 19, 0.0F, -1.0F, 0.0F, 4, 2, 0, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.5F, 1.0F, -2.25F);
        this.root.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.2573F, 0.3457F, 0.2285F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 24, 19, -4.0F, -1.0F, 0.0F, 4, 2, 0, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.root.addChild(head);
        this.setRotateAngle(head, 0.2618F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 19, 7, -1.0F, -0.5F, -2.25F, 2, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.05F, -0.6F, -1.2F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0873F, -0.1309F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 13, -1.03F, -0.05F, -0.95F, 1, 1, 1, -0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.5F, 1.5F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1309F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 19, -1.5F, -1.0F, -3.6F, 1, 1, 3, -0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.05F, -0.6F, -1.2F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0873F, 0.1309F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 13, 0.03F, -0.05F, -0.95F, 1, 1, 1, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.5F, -2.25F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 0, -1.0F, 0.2883F, 0.7924F, 2, 1, 2, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.5F, 1.5F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.1309F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 19, 0.5F, -1.0F, -3.6F, 1, 1, 3, -0.01F, false));

        this.leftMandible1 = new AdvancedModelRenderer(this);
        this.leftMandible1.setRotationPoint(0.25F, 0.2F, -2.25F);
        this.head.addChild(leftMandible1);
        this.setRotateAngle(leftMandible1, -0.3491F, -0.2182F, 0.0F);
        this.leftMandible1.cubeList.add(new ModelBox(leftMandible1, 20, 19, 0.0F, 0.0F, -3.0F, 0, 1, 3, 0.0F, false));

        this.rightMandible1 = new AdvancedModelRenderer(this);
        this.rightMandible1.setRotationPoint(-0.25F, 0.2F, -2.25F);
        this.head.addChild(rightMandible1);
        this.setRotateAngle(rightMandible1, -0.3491F, 0.2182F, 0.0F);
        this.rightMandible1.cubeList.add(new ModelBox(rightMandible1, 20, 19, 0.0F, 0.0F, -3.0F, 0, 1, 3, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.0F, 1.0F, -0.5F);
        this.head.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.1847F, 0.4999F, -0.1984F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 23, 12, 0.0F, -1.0F, 0.0F, 4, 2, 0, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(0.0F, 1.0F, -0.5F);
        this.head.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.1847F, -0.4999F, 0.1984F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 23, 12, -4.0F, -1.0F, 0.0F, 4, 2, 0, 0.0F, true));

        this.leftAntennae1 = new AdvancedModelRenderer(this);
        this.leftAntennae1.setRotationPoint(0.5F, 0.15F, -2.25F);
        this.head.addChild(leftAntennae1);
        this.setRotateAngle(leftAntennae1, 0.1345F, -0.4075F, -0.7608F);
        this.leftAntennae1.cubeList.add(new ModelBox(leftAntennae1, 0, 0, 0.0F, 0.0F, -4.0F, 0, 2, 4, 0.0F, false));

        this.rightAntennae1 = new AdvancedModelRenderer(this);
        this.rightAntennae1.setRotationPoint(-0.5F, 0.15F, -2.25F);
        this.head.addChild(rightAntennae1);
        this.setRotateAngle(rightAntennae1, 0.1345F, 0.4075F, 0.7608F);
        this.rightAntennae1.cubeList.add(new ModelBox(rightAntennae1, 0, 0, 0.0F, 0.0F, -4.0F, 0, 2, 4, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.root.addChild(body1);
        this.setRotateAngle(body1, 0.0436F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 10, 0, -1.0F, -0.5F, -1.0F, 2, 1, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.body1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.096F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 13, -1.0F, -0.15F, 0.0F, 2, 1, 4, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.25F, 0.5F, 0.0F);
        this.body1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.096F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 19, -0.15F, -1.0F, 0.0F, 1, 1, 4, -0.01F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.25F, 0.5F, 0.0F);
        this.body1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.096F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 19, -0.85F, -1.0F, 0.0F, 1, 1, 4, -0.01F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.9F, 0.5F, 0.75F);
        this.body1.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, 0.0F, 1.0036F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 7, 19, -0.25F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.9F, 0.5F, 0.75F);
        this.body1.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0F, 0.0F, -1.0036F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 7, 19, -0.75F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.85F, 0.5F, 2.0F);
        this.body1.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.0F, 0.0F, 1.0036F);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 15, 7, -0.4F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(-0.85F, 0.5F, 2.0F);
        this.body1.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.0F, 0.0F, -1.0036F);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 15, 7, -0.6F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.leftLeg6 = new AdvancedModelRenderer(this);
        this.leftLeg6.setRotationPoint(0.75F, 0.5F, 3.25F);
        this.body1.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.0F, 0.0F, 1.0036F);
        this.leftLeg6.cubeList.add(new ModelBox(leftLeg6, 10, 7, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightLeg6 = new AdvancedModelRenderer(this);
        this.rightLeg6.setRotationPoint(-0.75F, 0.5F, 3.25F);
        this.body1.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.0F, 0.0F, -1.0036F);
        this.rightLeg6.cubeList.add(new ModelBox(rightLeg6, 10, 7, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 3.9F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 25, -0.5F, -0.5F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.5F, 0.0F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.2269F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 24, 0.05F, -1.0F, 0.0F, 1, 1, 2, -0.02F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 0.5F, 0.0F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.2269F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 24, -1.05F, -1.0F, 0.0F, 1, 1, 2, -0.02F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 1.9F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, 0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, 0.0F, -2.5F, 0.0F, 0, 3, 9, 0.0F, false));

        this.leftAntennae2 = new AdvancedModelRenderer(this);
        this.leftAntennae2.setRotationPoint(0.3F, 0.0F, 2.0F);
        this.body2.addChild(leftAntennae2);
        this.setRotateAngle(leftAntennae2, 0.1371F, 0.1974F, 0.7074F);
        this.leftAntennae2.cubeList.add(new ModelBox(leftAntennae2, 10, 0, 0.0F, -0.5F, -0.5F, 0, 1, 2, 0.0F, false));

        this.rightAntennae2 = new AdvancedModelRenderer(this);
        this.rightAntennae2.setRotationPoint(-0.3F, 0.0F, 2.0F);
        this.body2.addChild(rightAntennae2);
        this.setRotateAngle(rightAntennae2, 0.1371F, -0.1974F, -0.7074F);
        this.rightAntennae2.cubeList.add(new ModelBox(rightAntennae2, 10, 0, 0.0F, -0.5F, -0.5F, 0, 1, 2, 0.0F, true));

        this.leftLeg7 = new AdvancedModelRenderer(this);
        this.leftLeg7.setRotationPoint(0.55F, 0.5F, 0.5F);
        this.body2.addChild(leftLeg7);
        this.setRotateAngle(leftLeg7, 0.0F, 0.0F, 1.0036F);
        this.leftLeg7.cubeList.add(new ModelBox(leftLeg7, 0, 7, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightLeg7 = new AdvancedModelRenderer(this);
        this.rightLeg7.setRotationPoint(-0.55F, 0.5F, 0.5F);
        this.body2.addChild(rightLeg7);
        this.setRotateAngle(rightLeg7, 0.0F, 0.0F, -1.0036F);
        this.rightLeg7.cubeList.add(new ModelBox(rightLeg7, 0, 7, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(root, 1.0F, 0.0F, 0.0F);
        this.root.offsetY = -0.25F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        //this.body.offsetZ = -0.080F;
        this.root.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.30F;
        this.root.offsetX = -0.05F;
        this.root.rotateAngleY = (float)Math.toRadians(210);
        this.root.rotateAngleX = (float)Math.toRadians(40);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 3.9F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraGigamachilis ee = (EntityPrehistoricFloraGigamachilis) e;
        AdvancedModelRenderer[] Neck = {this.head};

        if (ee.getAnimation() != ee.LAY_ANIMATION && (!ee.getIsFlying()) && (!ee.getIsClimbing()) && (!ee.getIsFast())) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.1F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.2F, -0.02F, 0.5F, f2, 0.4F);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraGigamachilis ee = (EntityPrehistoricFloraGigamachilis) entitylivingbaseIn;

        if(ee.getIsMoving()) {
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }



        if (ee.getAnimation() == ee.JUMP_ANIMATION) {
            animJump(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }


    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGigamachilis entity = (EntityPrehistoricFloraGigamachilis) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*4))*3), root.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*4), root.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*5))*5));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0.3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*5-60))*0.1);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*5))*0.1);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.44376-(0)));
            yy = 2.5 + (((tickAnim - 0) / 4) * (-24.39978-(2.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (-3.97954-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0.44376 + (((tickAnim - 4) / 2) * (8.2978-(0.44376)));
            yy = -24.39978 + (((tickAnim - 4) / 2) * (-4.55877-(-24.39978)));
            zz = -3.97954 + (((tickAnim - 4) / 2) * (-24.12535-(-3.97954)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 8.2978 + (((tickAnim - 6) / 2) * (0-(8.2978)));
            yy = -4.55877 + (((tickAnim - 6) / 2) * (2.5-(-4.55877)));
            zz = -24.12535 + (((tickAnim - 6) / 2) * (0-(-24.12535)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0.44376-(0)));
            yy = 2.5 + (((tickAnim - 8) / 4) * (-24.39978-(2.5)));
            zz = 0 + (((tickAnim - 8) / 4) * (-3.97954-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0.44376 + (((tickAnim - 12) / 2) * (8.2978-(0.44376)));
            yy = -24.39978 + (((tickAnim - 12) / 2) * (-4.55877-(-24.39978)));
            zz = -3.97954 + (((tickAnim - 12) / 2) * (-24.12535-(-3.97954)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 8.2978 + (((tickAnim - 14) / 2) * (0-(8.2978)));
            yy = -4.55877 + (((tickAnim - 14) / 2) * (2.5-(-4.55877)));
            zz = -24.12535 + (((tickAnim - 14) / 2) * (0-(-24.12535)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0.44376-(0)));
            yy = 2.5 + (((tickAnim - 16) / 4) * (-24.39978-(2.5)));
            zz = 0 + (((tickAnim - 16) / 4) * (-3.97954-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0.44376 + (((tickAnim - 20) / 2) * (8.2978-(0.44376)));
            yy = -24.39978 + (((tickAnim - 20) / 2) * (-4.55877-(-24.39978)));
            zz = -3.97954 + (((tickAnim - 20) / 2) * (-24.12535-(-3.97954)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 8.2978 + (((tickAnim - 22) / 2) * (0-(8.2978)));
            yy = -4.55877 + (((tickAnim - 22) / 2) * (2.5-(-4.55877)));
            zz = -24.12535 + (((tickAnim - 22) / 2) * (0-(-24.12535)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0.44376-(0)));
            yy = 2.5 + (((tickAnim - 24) / 4) * (-24.39978-(2.5)));
            zz = 0 + (((tickAnim - 24) / 4) * (-3.97954-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0.44376 + (((tickAnim - 28) / 2) * (8.2978-(0.44376)));
            yy = -24.39978 + (((tickAnim - 28) / 2) * (-4.55877-(-24.39978)));
            zz = -3.97954 + (((tickAnim - 28) / 2) * (-24.12535-(-3.97954)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 8.2978 + (((tickAnim - 30) / 2) * (0-(8.2978)));
            yy = -4.55877 + (((tickAnim - 30) / 2) * (2.5-(-4.55877)));
            zz = -24.12535 + (((tickAnim - 30) / 2) * (0-(-24.12535)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 32) / 4) * (0.44376-(0)));
            yy = 2.5 + (((tickAnim - 32) / 4) * (-24.39978-(2.5)));
            zz = 0 + (((tickAnim - 32) / 4) * (-3.97954-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 0.44376 + (((tickAnim - 36) / 2) * (8.2978-(0.44376)));
            yy = -24.39978 + (((tickAnim - 36) / 2) * (-4.55877-(-24.39978)));
            zz = -3.97954 + (((tickAnim - 36) / 2) * (-24.12535-(-3.97954)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 8.2978 + (((tickAnim - 38) / 2) * (0-(8.2978)));
            yy = -4.55877 + (((tickAnim - 38) / 2) * (2.5-(-4.55877)));
            zz = -24.12535 + (((tickAnim - 38) / 2) * (0-(-24.12535)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.44376 + (((tickAnim - 0) / 2) * (8.2978-(0.44376)));
            yy = 24.39978 + (((tickAnim - 0) / 2) * (4.55877-(24.39978)));
            zz = 3.97954 + (((tickAnim - 0) / 2) * (24.12535-(3.97954)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 8.2978 + (((tickAnim - 2) / 2) * (0-(8.2978)));
            yy = 4.55877 + (((tickAnim - 2) / 2) * (-2.5-(4.55877)));
            zz = 24.12535 + (((tickAnim - 2) / 2) * (0-(24.12535)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0.44376-(0)));
            yy = -2.5 + (((tickAnim - 4) / 4) * (24.39978-(-2.5)));
            zz = 0 + (((tickAnim - 4) / 4) * (3.97954-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.44376 + (((tickAnim - 8) / 2) * (8.2978-(0.44376)));
            yy = 24.39978 + (((tickAnim - 8) / 2) * (4.55877-(24.39978)));
            zz = 3.97954 + (((tickAnim - 8) / 2) * (24.12535-(3.97954)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 8.2978 + (((tickAnim - 10) / 2) * (0-(8.2978)));
            yy = 4.55877 + (((tickAnim - 10) / 2) * (-2.5-(4.55877)));
            zz = 24.12535 + (((tickAnim - 10) / 2) * (0-(24.12535)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0.44376-(0)));
            yy = -2.5 + (((tickAnim - 12) / 4) * (24.39978-(-2.5)));
            zz = 0 + (((tickAnim - 12) / 4) * (3.97954-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0.44376 + (((tickAnim - 16) / 2) * (8.2978-(0.44376)));
            yy = 24.39978 + (((tickAnim - 16) / 2) * (4.55877-(24.39978)));
            zz = 3.97954 + (((tickAnim - 16) / 2) * (24.12535-(3.97954)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 8.2978 + (((tickAnim - 18) / 2) * (0-(8.2978)));
            yy = 4.55877 + (((tickAnim - 18) / 2) * (-2.5-(4.55877)));
            zz = 24.12535 + (((tickAnim - 18) / 2) * (0-(24.12535)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0.44376-(0)));
            yy = -2.5 + (((tickAnim - 20) / 4) * (24.39978-(-2.5)));
            zz = 0 + (((tickAnim - 20) / 4) * (3.97954-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0.44376 + (((tickAnim - 24) / 2) * (8.2978-(0.44376)));
            yy = 24.39978 + (((tickAnim - 24) / 2) * (4.55877-(24.39978)));
            zz = 3.97954 + (((tickAnim - 24) / 2) * (24.12535-(3.97954)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 8.2978 + (((tickAnim - 26) / 2) * (0-(8.2978)));
            yy = 4.55877 + (((tickAnim - 26) / 2) * (-2.5-(4.55877)));
            zz = 24.12535 + (((tickAnim - 26) / 2) * (0-(24.12535)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0.44376-(0)));
            yy = -2.5 + (((tickAnim - 28) / 4) * (24.39978-(-2.5)));
            zz = 0 + (((tickAnim - 28) / 4) * (3.97954-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0.44376 + (((tickAnim - 32) / 2) * (8.2978-(0.44376)));
            yy = 24.39978 + (((tickAnim - 32) / 2) * (4.55877-(24.39978)));
            zz = 3.97954 + (((tickAnim - 32) / 2) * (24.12535-(3.97954)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 8.2978 + (((tickAnim - 34) / 2) * (0-(8.2978)));
            yy = 4.55877 + (((tickAnim - 34) / 2) * (-2.5-(4.55877)));
            zz = 24.12535 + (((tickAnim - 34) / 2) * (0-(24.12535)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0.44376-(0)));
            yy = -2.5 + (((tickAnim - 36) / 4) * (24.39978-(-2.5)));
            zz = 0 + (((tickAnim - 36) / 4) * (3.97954-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 3.36359 + (((tickAnim - 0) / 2) * (21.13854-(3.36359)));
            yy = -18.04581 + (((tickAnim - 0) / 2) * (7.62162-(-18.04581)));
            zz = -7.29806 + (((tickAnim - 0) / 2) * (-19.27155-(-7.29806)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 21.13854 + (((tickAnim - 2) / 2) * (-0.02148-(21.13854)));
            yy = 7.62162 + (((tickAnim - 2) / 2) * (18.98228-(7.62162)));
            zz = -19.27155 + (((tickAnim - 2) / 2) * (3.86847-(-19.27155)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.02148 + (((tickAnim - 4) / 4) * (3.36359-(-0.02148)));
            yy = 18.98228 + (((tickAnim - 4) / 4) * (-18.04581-(18.98228)));
            zz = 3.86847 + (((tickAnim - 4) / 4) * (-7.29806-(3.86847)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 3.36359 + (((tickAnim - 8) / 2) * (21.13854-(3.36359)));
            yy = -18.04581 + (((tickAnim - 8) / 2) * (7.62162-(-18.04581)));
            zz = -7.29806 + (((tickAnim - 8) / 2) * (-19.27155-(-7.29806)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 21.13854 + (((tickAnim - 10) / 2) * (-0.02148-(21.13854)));
            yy = 7.62162 + (((tickAnim - 10) / 2) * (18.98228-(7.62162)));
            zz = -19.27155 + (((tickAnim - 10) / 2) * (3.86847-(-19.27155)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -0.02148 + (((tickAnim - 12) / 4) * (3.36359-(-0.02148)));
            yy = 18.98228 + (((tickAnim - 12) / 4) * (-18.04581-(18.98228)));
            zz = 3.86847 + (((tickAnim - 12) / 4) * (-7.29806-(3.86847)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 3.36359 + (((tickAnim - 16) / 2) * (21.13854-(3.36359)));
            yy = -18.04581 + (((tickAnim - 16) / 2) * (7.62162-(-18.04581)));
            zz = -7.29806 + (((tickAnim - 16) / 2) * (-19.27155-(-7.29806)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 21.13854 + (((tickAnim - 18) / 2) * (-0.02148-(21.13854)));
            yy = 7.62162 + (((tickAnim - 18) / 2) * (18.98228-(7.62162)));
            zz = -19.27155 + (((tickAnim - 18) / 2) * (3.86847-(-19.27155)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -0.02148 + (((tickAnim - 20) / 4) * (3.36359-(-0.02148)));
            yy = 18.98228 + (((tickAnim - 20) / 4) * (-18.04581-(18.98228)));
            zz = 3.86847 + (((tickAnim - 20) / 4) * (-7.29806-(3.86847)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 3.36359 + (((tickAnim - 24) / 2) * (21.13854-(3.36359)));
            yy = -18.04581 + (((tickAnim - 24) / 2) * (7.62162-(-18.04581)));
            zz = -7.29806 + (((tickAnim - 24) / 2) * (-19.27155-(-7.29806)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 21.13854 + (((tickAnim - 26) / 2) * (-0.02148-(21.13854)));
            yy = 7.62162 + (((tickAnim - 26) / 2) * (18.98228-(7.62162)));
            zz = -19.27155 + (((tickAnim - 26) / 2) * (3.86847-(-19.27155)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -0.02148 + (((tickAnim - 28) / 4) * (3.36359-(-0.02148)));
            yy = 18.98228 + (((tickAnim - 28) / 4) * (-18.04581-(18.98228)));
            zz = 3.86847 + (((tickAnim - 28) / 4) * (-7.29806-(3.86847)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 3.36359 + (((tickAnim - 32) / 2) * (21.13854-(3.36359)));
            yy = -18.04581 + (((tickAnim - 32) / 2) * (7.62162-(-18.04581)));
            zz = -7.29806 + (((tickAnim - 32) / 2) * (-19.27155-(-7.29806)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 21.13854 + (((tickAnim - 34) / 2) * (-0.02148-(21.13854)));
            yy = 7.62162 + (((tickAnim - 34) / 2) * (18.98228-(7.62162)));
            zz = -19.27155 + (((tickAnim - 34) / 2) * (3.86847-(-19.27155)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -0.02148 + (((tickAnim - 36) / 4) * (3.36359-(-0.02148)));
            yy = 18.98228 + (((tickAnim - 36) / 4) * (-18.04581-(18.98228)));
            zz = 3.86847 + (((tickAnim - 36) / 4) * (-7.29806-(3.86847)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.02148 + (((tickAnim - 0) / 4) * (3.36359-(-0.02148)));
            yy = -18.98228 + (((tickAnim - 0) / 4) * (18.04581-(-18.98228)));
            zz = -3.86847 + (((tickAnim - 0) / 4) * (7.29806-(-3.86847)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 3.36359 + (((tickAnim - 4) / 2) * (21.13854-(3.36359)));
            yy = 18.04581 + (((tickAnim - 4) / 2) * (-7.62162-(18.04581)));
            zz = 7.29806 + (((tickAnim - 4) / 2) * (19.27155-(7.29806)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 21.13854 + (((tickAnim - 6) / 2) * (-0.02148-(21.13854)));
            yy = -7.62162 + (((tickAnim - 6) / 2) * (-18.98228-(-7.62162)));
            zz = 19.27155 + (((tickAnim - 6) / 2) * (-3.86847-(19.27155)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.02148 + (((tickAnim - 8) / 4) * (3.36359-(-0.02148)));
            yy = -18.98228 + (((tickAnim - 8) / 4) * (18.04581-(-18.98228)));
            zz = -3.86847 + (((tickAnim - 8) / 4) * (7.29806-(-3.86847)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 3.36359 + (((tickAnim - 12) / 2) * (21.13854-(3.36359)));
            yy = 18.04581 + (((tickAnim - 12) / 2) * (-7.62162-(18.04581)));
            zz = 7.29806 + (((tickAnim - 12) / 2) * (19.27155-(7.29806)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 21.13854 + (((tickAnim - 14) / 2) * (-0.02148-(21.13854)));
            yy = -7.62162 + (((tickAnim - 14) / 2) * (-18.98228-(-7.62162)));
            zz = 19.27155 + (((tickAnim - 14) / 2) * (-3.86847-(19.27155)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.02148 + (((tickAnim - 16) / 4) * (3.36359-(-0.02148)));
            yy = -18.98228 + (((tickAnim - 16) / 4) * (18.04581-(-18.98228)));
            zz = -3.86847 + (((tickAnim - 16) / 4) * (7.29806-(-3.86847)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 3.36359 + (((tickAnim - 20) / 2) * (21.13854-(3.36359)));
            yy = 18.04581 + (((tickAnim - 20) / 2) * (-7.62162-(18.04581)));
            zz = 7.29806 + (((tickAnim - 20) / 2) * (19.27155-(7.29806)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 21.13854 + (((tickAnim - 22) / 2) * (-0.02148-(21.13854)));
            yy = -7.62162 + (((tickAnim - 22) / 2) * (-18.98228-(-7.62162)));
            zz = 19.27155 + (((tickAnim - 22) / 2) * (-3.86847-(19.27155)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -0.02148 + (((tickAnim - 24) / 4) * (3.36359-(-0.02148)));
            yy = -18.98228 + (((tickAnim - 24) / 4) * (18.04581-(-18.98228)));
            zz = -3.86847 + (((tickAnim - 24) / 4) * (7.29806-(-3.86847)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 3.36359 + (((tickAnim - 28) / 2) * (21.13854-(3.36359)));
            yy = 18.04581 + (((tickAnim - 28) / 2) * (-7.62162-(18.04581)));
            zz = 7.29806 + (((tickAnim - 28) / 2) * (19.27155-(7.29806)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 21.13854 + (((tickAnim - 30) / 2) * (-0.02148-(21.13854)));
            yy = -7.62162 + (((tickAnim - 30) / 2) * (-18.98228-(-7.62162)));
            zz = 19.27155 + (((tickAnim - 30) / 2) * (-3.86847-(19.27155)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -0.02148 + (((tickAnim - 32) / 4) * (3.36359-(-0.02148)));
            yy = -18.98228 + (((tickAnim - 32) / 4) * (18.04581-(-18.98228)));
            zz = -3.86847 + (((tickAnim - 32) / 4) * (7.29806-(-3.86847)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 3.36359 + (((tickAnim - 36) / 2) * (21.13854-(3.36359)));
            yy = 18.04581 + (((tickAnim - 36) / 2) * (-7.62162-(18.04581)));
            zz = 7.29806 + (((tickAnim - 36) / 2) * (19.27155-(7.29806)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 21.13854 + (((tickAnim - 38) / 2) * (-0.02148-(21.13854)));
            yy = -7.62162 + (((tickAnim - 38) / 2) * (-18.98228-(-7.62162)));
            zz = 19.27155 + (((tickAnim - 38) / 2) * (-3.86847-(19.27155)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.19525 + (((tickAnim - 0) / 2) * (4.51484-(0.19525)));
            yy = -17.31805 + (((tickAnim - 0) / 2) * (2.67692-(-17.31805)));
            zz = 1.0025 + (((tickAnim - 0) / 2) * (-8.70089-(1.0025)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 4.51484 + (((tickAnim - 2) / 2) * (-14.51862-(4.51484)));
            yy = 2.67692 + (((tickAnim - 2) / 2) * (21.80351-(2.67692)));
            zz = -8.70089 + (((tickAnim - 2) / 2) * (-6.08521-(-8.70089)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -14.51862 + (((tickAnim - 4) / 4) * (0.19525-(-14.51862)));
            yy = 21.80351 + (((tickAnim - 4) / 4) * (-17.31805-(21.80351)));
            zz = -6.08521 + (((tickAnim - 4) / 4) * (1.0025-(-6.08521)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.19525 + (((tickAnim - 8) / 2) * (4.51484-(0.19525)));
            yy = -17.31805 + (((tickAnim - 8) / 2) * (2.67692-(-17.31805)));
            zz = 1.0025 + (((tickAnim - 8) / 2) * (-8.70089-(1.0025)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 4.51484 + (((tickAnim - 10) / 2) * (-14.51862-(4.51484)));
            yy = 2.67692 + (((tickAnim - 10) / 2) * (21.80351-(2.67692)));
            zz = -8.70089 + (((tickAnim - 10) / 2) * (-6.08521-(-8.70089)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -14.51862 + (((tickAnim - 12) / 4) * (0.19525-(-14.51862)));
            yy = 21.80351 + (((tickAnim - 12) / 4) * (-17.31805-(21.80351)));
            zz = -6.08521 + (((tickAnim - 12) / 4) * (1.0025-(-6.08521)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0.19525 + (((tickAnim - 16) / 2) * (4.51484-(0.19525)));
            yy = -17.31805 + (((tickAnim - 16) / 2) * (2.67692-(-17.31805)));
            zz = 1.0025 + (((tickAnim - 16) / 2) * (-8.70089-(1.0025)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 4.51484 + (((tickAnim - 18) / 2) * (-14.51862-(4.51484)));
            yy = 2.67692 + (((tickAnim - 18) / 2) * (21.80351-(2.67692)));
            zz = -8.70089 + (((tickAnim - 18) / 2) * (-6.08521-(-8.70089)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -14.51862 + (((tickAnim - 20) / 4) * (0.19525-(-14.51862)));
            yy = 21.80351 + (((tickAnim - 20) / 4) * (-17.31805-(21.80351)));
            zz = -6.08521 + (((tickAnim - 20) / 4) * (1.0025-(-6.08521)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0.19525 + (((tickAnim - 24) / 2) * (4.51484-(0.19525)));
            yy = -17.31805 + (((tickAnim - 24) / 2) * (2.67692-(-17.31805)));
            zz = 1.0025 + (((tickAnim - 24) / 2) * (-8.70089-(1.0025)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 4.51484 + (((tickAnim - 26) / 2) * (-14.51862-(4.51484)));
            yy = 2.67692 + (((tickAnim - 26) / 2) * (21.80351-(2.67692)));
            zz = -8.70089 + (((tickAnim - 26) / 2) * (-6.08521-(-8.70089)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -14.51862 + (((tickAnim - 28) / 4) * (0.19525-(-14.51862)));
            yy = 21.80351 + (((tickAnim - 28) / 4) * (-17.31805-(21.80351)));
            zz = -6.08521 + (((tickAnim - 28) / 4) * (1.0025-(-6.08521)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0.19525 + (((tickAnim - 32) / 2) * (4.51484-(0.19525)));
            yy = -17.31805 + (((tickAnim - 32) / 2) * (2.67692-(-17.31805)));
            zz = 1.0025 + (((tickAnim - 32) / 2) * (-8.70089-(1.0025)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 4.51484 + (((tickAnim - 34) / 2) * (-14.51862-(4.51484)));
            yy = 2.67692 + (((tickAnim - 34) / 2) * (21.80351-(2.67692)));
            zz = -8.70089 + (((tickAnim - 34) / 2) * (-6.08521-(-8.70089)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -14.51862 + (((tickAnim - 36) / 4) * (0.19525-(-14.51862)));
            yy = 21.80351 + (((tickAnim - 36) / 4) * (-17.31805-(21.80351)));
            zz = -6.08521 + (((tickAnim - 36) / 4) * (1.0025-(-6.08521)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -14.51862 + (((tickAnim - 0) / 4) * (0.19525-(-14.51862)));
            yy = -21.80351 + (((tickAnim - 0) / 4) * (17.31805-(-21.80351)));
            zz = 6.08521 + (((tickAnim - 0) / 4) * (-1.0025-(6.08521)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0.19525 + (((tickAnim - 4) / 2) * (4.51484-(0.19525)));
            yy = 17.31805 + (((tickAnim - 4) / 2) * (-2.67692-(17.31805)));
            zz = -1.0025 + (((tickAnim - 4) / 2) * (8.70089-(-1.0025)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 4.51484 + (((tickAnim - 6) / 2) * (-14.51862-(4.51484)));
            yy = -2.67692 + (((tickAnim - 6) / 2) * (-21.80351-(-2.67692)));
            zz = 8.70089 + (((tickAnim - 6) / 2) * (6.08521-(8.70089)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -14.51862 + (((tickAnim - 8) / 4) * (0.19525-(-14.51862)));
            yy = -21.80351 + (((tickAnim - 8) / 4) * (17.31805-(-21.80351)));
            zz = 6.08521 + (((tickAnim - 8) / 4) * (-1.0025-(6.08521)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0.19525 + (((tickAnim - 12) / 2) * (4.51484-(0.19525)));
            yy = 17.31805 + (((tickAnim - 12) / 2) * (-2.67692-(17.31805)));
            zz = -1.0025 + (((tickAnim - 12) / 2) * (8.70089-(-1.0025)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 4.51484 + (((tickAnim - 14) / 2) * (-14.51862-(4.51484)));
            yy = -2.67692 + (((tickAnim - 14) / 2) * (-21.80351-(-2.67692)));
            zz = 8.70089 + (((tickAnim - 14) / 2) * (6.08521-(8.70089)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -14.51862 + (((tickAnim - 16) / 4) * (0.19525-(-14.51862)));
            yy = -21.80351 + (((tickAnim - 16) / 4) * (17.31805-(-21.80351)));
            zz = 6.08521 + (((tickAnim - 16) / 4) * (-1.0025-(6.08521)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0.19525 + (((tickAnim - 20) / 2) * (4.51484-(0.19525)));
            yy = 17.31805 + (((tickAnim - 20) / 2) * (-2.67692-(17.31805)));
            zz = -1.0025 + (((tickAnim - 20) / 2) * (8.70089-(-1.0025)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 4.51484 + (((tickAnim - 22) / 2) * (-14.51862-(4.51484)));
            yy = -2.67692 + (((tickAnim - 22) / 2) * (-21.80351-(-2.67692)));
            zz = 8.70089 + (((tickAnim - 22) / 2) * (6.08521-(8.70089)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -14.51862 + (((tickAnim - 24) / 4) * (0.19525-(-14.51862)));
            yy = -21.80351 + (((tickAnim - 24) / 4) * (17.31805-(-21.80351)));
            zz = 6.08521 + (((tickAnim - 24) / 4) * (-1.0025-(6.08521)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0.19525 + (((tickAnim - 28) / 2) * (4.51484-(0.19525)));
            yy = 17.31805 + (((tickAnim - 28) / 2) * (-2.67692-(17.31805)));
            zz = -1.0025 + (((tickAnim - 28) / 2) * (8.70089-(-1.0025)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 4.51484 + (((tickAnim - 30) / 2) * (-14.51862-(4.51484)));
            yy = -2.67692 + (((tickAnim - 30) / 2) * (-21.80351-(-2.67692)));
            zz = 8.70089 + (((tickAnim - 30) / 2) * (6.08521-(8.70089)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -14.51862 + (((tickAnim - 32) / 4) * (0.19525-(-14.51862)));
            yy = -21.80351 + (((tickAnim - 32) / 4) * (17.31805-(-21.80351)));
            zz = 6.08521 + (((tickAnim - 32) / 4) * (-1.0025-(6.08521)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 0.19525 + (((tickAnim - 36) / 2) * (4.51484-(0.19525)));
            yy = 17.31805 + (((tickAnim - 36) / 2) * (-2.67692-(17.31805)));
            zz = -1.0025 + (((tickAnim - 36) / 2) * (8.70089-(-1.0025)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 4.51484 + (((tickAnim - 38) / 2) * (-14.51862-(4.51484)));
            yy = -2.67692 + (((tickAnim - 38) / 2) * (-21.80351-(-2.67692)));
            zz = 8.70089 + (((tickAnim - 38) / 2) * (6.08521-(8.70089)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftAntennae1, leftAntennae1.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*10-60))*7), leftAntennae1.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2-60))*13), leftAntennae1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightAntennae1, rightAntennae1.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*10))*7), rightAntennae1.rotateAngleY + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2))*13), rightAntennae1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3))*3), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3))*4), body1.rotateAngleZ + (float) Math.toRadians(0));
        
    }
    public void animJump(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGigamachilis entity = (EntityPrehistoricFloraGigamachilis) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (8.75476-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.10894-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-4.99882-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 8.75476 + (((tickAnim - 2) / 1) * (22.43656-(8.75476)));
            yy = -0.10894 + (((tickAnim - 2) / 1) * (-0.9762-(-0.10894)));
            zz = -4.99882 + (((tickAnim - 2) / 1) * (7.43656-(-4.99882)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 22.43656 + (((tickAnim - 3) / 0) * (16.93446-(22.43656)));
            yy = -0.9762 + (((tickAnim - 3) / 0) * (0.87016-(-0.9762)));
            zz = 7.43656 + (((tickAnim - 3) / 0) * (7.50058-(7.43656)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 16.93446 + (((tickAnim - 3) / 1) * (6.433-(16.93446)));
            yy = 0.87016 + (((tickAnim - 3) / 1) * (2.71637-(0.87016)));
            zz = 7.50058 + (((tickAnim - 3) / 1) * (7.5646-(7.50058)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 6.433 + (((tickAnim - 4) / 1) * (-29.56869-(6.433)));
            yy = 2.71637 + (((tickAnim - 4) / 1) * (6.40865-(2.71637)));
            zz = 7.5646 + (((tickAnim - 4) / 1) * (7.69263-(7.5646)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -29.56869 + (((tickAnim - 5) / 3) * (-33.5243-(-29.56869)));
            yy = 6.40865 + (((tickAnim - 5) / 3) * (-6.01638-(6.40865)));
            zz = 7.69263 + (((tickAnim - 5) / 3) * (-10.48073-(7.69263)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -33.5243 + (((tickAnim - 8) / 3) * (-15.95232-(-33.5243)));
            yy = -6.01638 + (((tickAnim - 8) / 3) * (-3.76021-(-6.01638)));
            zz = -10.48073 + (((tickAnim - 8) / 3) * (-6.55041-(-10.48073)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -15.95232 + (((tickAnim - 11) / 1) * (3.23785-(-15.95232)));
            yy = -3.76021 + (((tickAnim - 11) / 1) * (-3.00819-(-3.76021)));
            zz = -6.55041 + (((tickAnim - 11) / 1) * (-5.24037-(-6.55041)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 3.23785 + (((tickAnim - 12) / 1) * (6.4094-(3.23785)));
            yy = -3.00819 + (((tickAnim - 12) / 1) * (-0.8945-(-3.00819)));
            zz = -5.24037 + (((tickAnim - 12) / 1) * (7.36351-(-5.24037)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 6.4094 + (((tickAnim - 13) / 2) * (0-(6.4094)));
            yy = -0.8945 + (((tickAnim - 13) / 2) * (0-(-0.8945)));
            zz = 7.36351 + (((tickAnim - 13) / 2) * (0-(7.36351)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (15-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 15 + (((tickAnim - 18) / 2) * (0-(15)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 18) / 2) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 1.5 + (((tickAnim - 3) / 0) * (0.25-(1.5)));
            zz = 1 + (((tickAnim - 3) / 0) * (0.75-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 1) * (1-(0.25)));
            zz = 0.75 + (((tickAnim - 3) / 1) * (0.5-(0.75)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 4) / 1) * (3-(1)));
            zz = 0.5 + (((tickAnim - 4) / 1) * (-1-(0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 3 + (((tickAnim - 5) / 3) * (5-(3)));
            zz = -1 + (((tickAnim - 5) / 3) * (-0.33-(-1)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 5 + (((tickAnim - 8) / 4) * (3.5-(5)));
            zz = -0.33 + (((tickAnim - 8) / 4) * (-0.16-(-0.33)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 3.5 + (((tickAnim - 12) / 3) * (0-(3.5)));
            zz = -0.16 + (((tickAnim - 12) / 3) * (0-(-0.16)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (-0.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = -0.25 + (((tickAnim - 18) / 2) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (12.5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (11.67-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 12.5 + (((tickAnim - 2) / 1) * (24.37-(12.5)));
            zz = 11.67 + (((tickAnim - 2) / 1) * (-12.5-(11.67)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 24.37 + (((tickAnim - 3) / 2) * (0-(24.37)));
            zz = -12.5 + (((tickAnim - 3) / 2) * (-25-(-12.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = -25 + (((tickAnim - 5) / 10) * (0-(-25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (15-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (18.33-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 15 + (((tickAnim - 2) / 1) * (26.25-(15)));
            zz = 18.33 + (((tickAnim - 2) / 1) * (6.87-(18.33)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 26.25 + (((tickAnim - 3) / 2) * (0-(26.25)));
            zz = 6.87 + (((tickAnim - 3) / 2) * (-27.5-(6.87)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = -27.5 + (((tickAnim - 5) / 10) * (0-(-27.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-13.13-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -13.13 + (((tickAnim - 3) / 0) * (-27.5-(-13.13)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = -27.5 + (((tickAnim - 3) / 12) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -22.5 + (((tickAnim - 18) / 2) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (14.17-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 10 + (((tickAnim - 2) / 1) * (15-(10)));
            zz = 14.17 + (((tickAnim - 2) / 1) * (-14.37-(14.17)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 15 + (((tickAnim - 3) / 2) * (0-(15)));
            zz = -14.37 + (((tickAnim - 3) / 2) * (-10-(-14.37)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = -10 + (((tickAnim - 5) / 10) * (0-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-16.4-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (14.13-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (1.74-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -16.4 + (((tickAnim - 2) / 1) * (-37.37-(-16.4)));
            yy = 14.13 + (((tickAnim - 2) / 1) * (-10.85-(14.13)));
            zz = 1.74 + (((tickAnim - 2) / 1) * (9.55-(1.74)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -37.37 + (((tickAnim - 3) / 1) * (-14.36-(-37.37)));
            yy = -10.85 + (((tickAnim - 3) / 1) * (-19.18-(-10.85)));
            zz = 9.55 + (((tickAnim - 3) / 1) * (12.15-(9.55)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -14.36 + (((tickAnim - 4) / 1) * (12.23-(-14.36)));
            yy = -19.18 + (((tickAnim - 4) / 1) * (-24.73-(-19.18)));
            zz = 12.15 + (((tickAnim - 4) / 1) * (13.89-(12.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 12.23 + (((tickAnim - 5) / 5) * (-2.01-(12.23)));
            yy = -24.73 + (((tickAnim - 5) / 5) * (-51.83-(-24.73)));
            zz = 13.89 + (((tickAnim - 5) / 5) * (18.68-(13.89)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -2.01 + (((tickAnim - 10) / 5) * (0-(-2.01)));
            yy = -51.83 + (((tickAnim - 10) / 5) * (0-(-51.83)));
            zz = 18.68 + (((tickAnim - 10) / 5) * (0-(18.68)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftAntennae1, leftAntennae1.rotateAngleX + (float) Math.toRadians(xx), leftAntennae1.rotateAngleY + (float) Math.toRadians(yy), leftAntennae1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-11.67-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -11.67 + (((tickAnim - 2) / 1) * (-25-(-11.67)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -25 + (((tickAnim - 3) / 2) * (10-(-25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 5) / 10) * (0-(10)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 18) / 2) * (0-(-10)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-45-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -45 + (((tickAnim - 3) / 2) * (15-(-45)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 15 + (((tickAnim - 5) / 10) * (0-(15)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (45-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 45 + (((tickAnim - 3) / 2) * (-12.5-(45)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -12.5 + (((tickAnim - 5) / 5) * (21.25-(-12.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 21.25 + (((tickAnim - 10) / 5) * (0-(21.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (45-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-20-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-10-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 45 + (((tickAnim - 3) / 1) * (0-(45)));
            yy = -20 + (((tickAnim - 3) / 1) * (0-(-20)));
            zz = -10 + (((tickAnim - 3) / 1) * (0-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftAntennae2, leftAntennae2.rotateAngleX + (float) Math.toRadians(xx), leftAntennae2.rotateAngleY + (float) Math.toRadians(yy), leftAntennae2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-11.67-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-6.67-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -11.67 + (((tickAnim - 2) / 1) * (-25-(-11.67)));
            zz = -6.67 + (((tickAnim - 2) / 1) * (-10-(-6.67)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -25 + (((tickAnim - 3) / 2) * (0-(-25)));
            zz = -10 + (((tickAnim - 3) / 2) * (35-(-10)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 35 + (((tickAnim - 5) / 10) * (0-(35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.67-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-14.33-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-15-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.67 + (((tickAnim - 2) / 1) * (-1-(-0.67)));
            yy = -14.33 + (((tickAnim - 2) / 1) * (-29-(-14.33)));
            zz = -15 + (((tickAnim - 2) / 1) * (-22.5-(-15)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -1 + (((tickAnim - 3) / 2) * (0-(-1)));
            yy = -29 + (((tickAnim - 3) / 2) * (0-(-29)));
            zz = -22.5 + (((tickAnim - 3) / 2) * (17.5-(-22.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 17.5 + (((tickAnim - 5) / 10) * (0-(17.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-5.83-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-3.33-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -5.83 + (((tickAnim - 2) / 1) * (-20-(-5.83)));
            zz = -3.33 + (((tickAnim - 2) / 1) * (0-(-3.33)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -20 + (((tickAnim - 3) / 2) * (0-(-20)));
            zz = 0 + (((tickAnim - 3) / 2) * (30-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 30 + (((tickAnim - 5) / 10) * (0-(30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-17.55-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-4.59-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -17.55 + (((tickAnim - 2) / 1) * (-46.13-(-17.55)));
            yy = 0.55 + (((tickAnim - 2) / 1) * (3.03-(0.55)));
            zz = -4.59 + (((tickAnim - 2) / 1) * (-25.24-(-4.59)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -46.13 + (((tickAnim - 3) / 1) * (-25.65-(-46.13)));
            yy = 3.03 + (((tickAnim - 3) / 1) * (3.86-(3.03)));
            zz = -25.24 + (((tickAnim - 3) / 1) * (-32.13-(-25.24)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -25.65 + (((tickAnim - 4) / 1) * (25.5-(-25.65)));
            yy = 3.86 + (((tickAnim - 4) / 1) * (4.41-(3.86)));
            zz = -32.13 + (((tickAnim - 4) / 1) * (-36.72-(-32.13)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 25.5 + (((tickAnim - 5) / 5) * (-52.77-(25.5)));
            yy = 4.41 + (((tickAnim - 5) / 5) * (52.76-(4.41)));
            zz = -36.72 + (((tickAnim - 5) / 5) * (-22.95-(-36.72)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -52.77 + (((tickAnim - 10) / 5) * (0-(-52.77)));
            yy = 52.76 + (((tickAnim - 10) / 5) * (0-(52.76)));
            zz = -22.95 + (((tickAnim - 10) / 5) * (0-(-22.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightAntennae1, rightAntennae1.rotateAngleX + (float) Math.toRadians(xx), rightAntennae1.rotateAngleY + (float) Math.toRadians(yy), rightAntennae1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (10-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 35 + (((tickAnim - 3) / 1) * (0-(35)));
            yy = 25 + (((tickAnim - 3) / 1) * (0-(25)));
            zz = 10 + (((tickAnim - 3) / 1) * (0-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightAntennae2, rightAntennae2.rotateAngleX + (float) Math.toRadians(xx), rightAntennae2.rotateAngleY + (float) Math.toRadians(yy), rightAntennae2.rotateAngleZ + (float) Math.toRadians(zz));
        
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
