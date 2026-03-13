package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeognatha_jungle;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelArchaeognatha_jungle extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftMandible1;
    private final AdvancedModelRenderer leftMandible2;
    private final AdvancedModelRenderer rightMandible1;
    private final AdvancedModelRenderer rightMandible2;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer leftAntennae1;
    private final AdvancedModelRenderer rightAntennae1;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer leftLeg6;
    private final AdvancedModelRenderer rightLeg6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer leftAntennae2;
    private final AdvancedModelRenderer rightAntennae2;
    private final AdvancedModelRenderer leftLeg7;
    private final AdvancedModelRenderer rightLeg7;

    private ModelAnimator animator;

    public ModelArchaeognatha_jungle() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 23.05F, 0.0F);
        this.setRotateAngle(root, -0.1745F, 0.0F, 0.0F);
        this.root.cubeList.add(new ModelBox(root, 0, 6, -1.5F, -1.5F, -3.0F, 3, 2, 3, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5F, 1.0F, -2.25F);
        this.root.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0884F, 0.1853F, -0.1148F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 20, 20, 0.0F, -1.0F, 0.0F, 4, 2, 0, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5F, 1.0F, -2.25F);
        this.root.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0884F, -0.1853F, 0.1148F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 20, 20, -4.0F, -1.0F, 0.0F, 4, 2, 0, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.5F, 1.0F, -0.75F);
        this.root.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.3086F, -0.4999F, -0.3466F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 20, 17, 0.0F, -1.0F, 0.0F, 4, 2, 0, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.5F, 1.0F, -0.75F);
        this.root.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.3086F, 0.4999F, 0.3466F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 20, 17, -4.0F, -1.0F, 0.0F, 4, 2, 0, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.root.addChild(head);
        this.setRotateAngle(head, 0.2618F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 14, 7, -1.0F, -0.5F, -2.25F, 2, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.05F, -0.6F, -1.2F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.4363F, 0.0F, -0.2182F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 23, -1.08F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.05F, -0.6F, -1.2F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4363F, 0.0F, 0.2182F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 23, 0.08F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.5F, -2.25F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 17, -1.0F, 0.25F, 0.7F, 2, 1, 2, -0.01F, false));

        this.leftMandible1 = new AdvancedModelRenderer(this);
        this.leftMandible1.setRotationPoint(0.5F, 0.2F, -2.25F);
        this.head.addChild(leftMandible1);
        this.setRotateAngle(leftMandible1, -0.6545F, 0.0F, 0.0F);
        this.leftMandible1.cubeList.add(new ModelBox(leftMandible1, 5, 17, 0.0F, 0.0F, -2.0F, 0, 1, 2, 0.0F, false));

        this.leftMandible2 = new AdvancedModelRenderer(this);
        this.leftMandible2.setRotationPoint(0.0F, 0.5F, -2.0F);
        this.leftMandible1.addChild(leftMandible2);
        this.setRotateAngle(leftMandible2, 2.7925F, 0.0F, 0.0F);
        this.leftMandible2.cubeList.add(new ModelBox(leftMandible2, 14, 0, -0.05F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));

        this.rightMandible1 = new AdvancedModelRenderer(this);
        this.rightMandible1.setRotationPoint(-0.5F, 0.2F, -2.25F);
        this.head.addChild(rightMandible1);
        this.setRotateAngle(rightMandible1, -0.6545F, 0.0F, 0.0F);
        this.rightMandible1.cubeList.add(new ModelBox(rightMandible1, 5, 17, 0.0F, 0.0F, -2.0F, 0, 1, 2, 0.0F, true));

        this.rightMandible2 = new AdvancedModelRenderer(this);
        this.rightMandible2.setRotationPoint(0.0F, 0.5F, -2.0F);
        this.rightMandible1.addChild(rightMandible2);
        this.setRotateAngle(rightMandible2, 2.7925F, 0.0F, 0.0F);
        this.rightMandible2.cubeList.add(new ModelBox(rightMandible2, 14, 0, 0.05F, -0.5F, -2.0F, 0, 1, 2, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.0F, 1.0F, -0.75F);
        this.head.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.2772F, 0.3972F, -0.2151F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 22, 7, 0.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(0.0F, 1.0F, -0.75F);
        this.head.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.2772F, -0.3972F, 0.2151F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 22, 7, -3.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.leftAntennae1 = new AdvancedModelRenderer(this);
        this.leftAntennae1.setRotationPoint(0.5F, 0.15F, -2.25F);
        this.head.addChild(leftAntennae1);
        this.setRotateAngle(leftAntennae1, 0.1345F, -0.4075F, -0.7608F);
        this.leftAntennae1.cubeList.add(new ModelBox(leftAntennae1, 0, 0, 0.0F, 0.0F, -13.0F, 0, 3, 13, 0.0F, false));

        this.rightAntennae1 = new AdvancedModelRenderer(this);
        this.rightAntennae1.setRotationPoint(-0.5F, 0.15F, -2.25F);
        this.head.addChild(rightAntennae1);
        this.setRotateAngle(rightAntennae1, 0.1345F, 0.4075F, 0.7608F);
        this.rightAntennae1.cubeList.add(new ModelBox(rightAntennae1, 0, 0, 0.0F, 0.0F, -13.0F, 0, 3, 13, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.root.addChild(body1);
        this.setRotateAngle(body1, 0.0436F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 14, 0, -1.0F, -0.5F, -1.0F, 2, 1, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.body1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.096F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.0F, -0.15F, 0.0F, 2, 1, 4, -0.01F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.75F, 0.5F, 0.75F);
        this.body1.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, 0.0F, 1.0036F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 24, 2, -0.25F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.75F, 0.5F, 0.75F);
        this.body1.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0F, 0.0F, -1.0036F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 24, 2, -0.75F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.75F, 0.5F, 2.0F);
        this.body1.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.0F, 0.0F, 1.0036F);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 24, 0, -0.4F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(-0.75F, 0.5F, 2.0F);
        this.body1.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.0F, 0.0F, -1.0036F);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 24, 0, -0.6F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.leftLeg6 = new AdvancedModelRenderer(this);
        this.leftLeg6.setRotationPoint(0.75F, 0.5F, 3.25F);
        this.body1.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.0F, 0.0F, 1.0036F);
        this.leftLeg6.cubeList.add(new ModelBox(leftLeg6, 0, 24, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightLeg6 = new AdvancedModelRenderer(this);
        this.rightLeg6.setRotationPoint(-0.75F, 0.5F, 3.25F);
        this.body1.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.0F, 0.0F, -1.0036F);
        this.rightLeg6.cubeList.add(new ModelBox(rightLeg6, 0, 24, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 3.9F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 11, 21, -0.5F, -0.5F, 0.0F, 1, 1, 2, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 1.9F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, 0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 17, 0.0F, -2.5F, 0.0F, 0, 3, 10, 0.0F, false));

        this.leftAntennae2 = new AdvancedModelRenderer(this);
        this.leftAntennae2.setRotationPoint(0.3F, 0.0F, 2.0F);
        this.body2.addChild(leftAntennae2);
        this.setRotateAngle(leftAntennae2, 0.1371F, 0.1974F, 0.7074F);
        this.leftAntennae2.cubeList.add(new ModelBox(leftAntennae2, 0, 17, 0.0F, -1.5F, -0.5F, 0, 2, 4, 0.0F, false));

        this.rightAntennae2 = new AdvancedModelRenderer(this);
        this.rightAntennae2.setRotationPoint(-0.3F, 0.0F, 2.0F);
        this.body2.addChild(rightAntennae2);
        this.setRotateAngle(rightAntennae2, 0.1371F, -0.1974F, -0.7074F);
        this.rightAntennae2.cubeList.add(new ModelBox(rightAntennae2, 0, 17, 0.0F, -1.5F, -0.5F, 0, 2, 4, 0.0F, true));

        this.leftLeg7 = new AdvancedModelRenderer(this);
        this.leftLeg7.setRotationPoint(0.25F, 0.5F, 0.5F);
        this.body2.addChild(leftLeg7);
        this.setRotateAngle(leftLeg7, 0.0F, 0.0F, 1.0036F);
        this.leftLeg7.cubeList.add(new ModelBox(leftLeg7, 23, 23, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightLeg7 = new AdvancedModelRenderer(this);
        this.rightLeg7.setRotationPoint(-0.25F, 0.5F, 0.5F);
        this.body2.addChild(rightLeg7);
        this.setRotateAngle(rightLeg7, 0.0F, 0.0F, -1.0036F);
        this.rightLeg7.cubeList.add(new ModelBox(rightLeg7, 23, 23, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

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

        EntityPrehistoricFloraArchaeognatha_jungle ee = (EntityPrehistoricFloraArchaeognatha_jungle) e;
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
        EntityPrehistoricFloraArchaeognatha_jungle ee = (EntityPrehistoricFloraArchaeognatha_jungle) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getClimbFacing() == EnumFacing.NORTH
                    || ee.getClimbFacing() == EnumFacing.EAST
                    || ee.getClimbFacing() == EnumFacing.SOUTH
                    || ee.getClimbFacing() == EnumFacing.WEST
                    || ee.getIsClimbing()) {
                if (!ee.getHeadCollided()) {
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                } else {
                    //Just pose with no animation running:
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                }
            }
            else if (!ee.getIsFlying() && ee.getIsMoving() && ee.onGround) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }


        if (ee.getAnimation() == ee.JUMP_ANIMATION) {
            animJump(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animJump(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchaeognatha_jungle entity = (EntityPrehistoricFloraArchaeognatha_jungle) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (8.75476-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-0.10894-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-4.99882-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 8.75476 + (((tickAnim - 1) / 1) * (17.43656-(8.75476)));
            yy = -0.10894 + (((tickAnim - 1) / 1) * (-0.9762-(-0.10894)));
            zz = -4.99882 + (((tickAnim - 1) / 1) * (7.43656-(-4.99882)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 17.43656 + (((tickAnim - 2) / 1) * (1.433-(17.43656)));
            yy = -0.9762 + (((tickAnim - 2) / 1) * (2.71637-(-0.9762)));
            zz = 7.43656 + (((tickAnim - 2) / 1) * (7.5646-(7.43656)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.433 + (((tickAnim - 3) / 5) * (-33.5243-(1.433)));
            yy = 2.71637 + (((tickAnim - 3) / 5) * (-6.01638-(2.71637)));
            zz = 7.5646 + (((tickAnim - 3) / 5) * (-10.48073-(7.5646)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -33.5243 + (((tickAnim - 8) / 4) * (-4.26215-(-33.5243)));
            yy = -6.01638 + (((tickAnim - 8) / 4) * (-3.00819-(-6.01638)));
            zz = -10.48073 + (((tickAnim - 8) / 4) * (-5.24037-(-10.48073)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -4.26215 + (((tickAnim - 12) / 1) * (11.62-(-4.26215)));
            yy = -3.00819 + (((tickAnim - 12) / 1) * (-1.5-(-3.00819)));
            zz = -5.24037 + (((tickAnim - 12) / 1) * (-2.62-(-5.24037)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 11.62 + (((tickAnim - 13) / 2) * (0-(11.62)));
            yy = -1.5 + (((tickAnim - 13) / 2) * (0-(-1.5)));
            zz = -2.62 + (((tickAnim - 13) / 2) * (0-(-2.62)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (1-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 2) / 1) * (-0.37-(1)));
            zz = 1 + (((tickAnim - 2) / 1) * (0.67-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -0.37 + (((tickAnim - 3) / 0) * (2.52-(-0.37)));
            zz = 0.67 + (((tickAnim - 3) / 0) * (0.5-(0.67)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 2.52 + (((tickAnim - 3) / 5) * (5-(2.52)));
            zz = 0.5 + (((tickAnim - 3) / 5) * (-0.33-(0.5)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (12.5-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (6.67-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 12.5 + (((tickAnim - 1) / 1) * (21.87-(12.5)));
            zz = 6.67 + (((tickAnim - 1) / 1) * (-11.25-(6.67)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 21.87 + (((tickAnim - 2) / 1) * (0-(21.87)));
            zz = -11.25 + (((tickAnim - 2) / 1) * (-25-(-11.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = -25 + (((tickAnim - 3) / 12) * (0-(-25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (4.17-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = -12.5 + (((tickAnim - 1) / 1) * (-21.88-(-12.5)));
            zz = 4.17 + (((tickAnim - 1) / 1) * (-8.12-(4.17)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -21.88 + (((tickAnim - 2) / 1) * (0-(-21.88)));
            zz = -8.12 + (((tickAnim - 2) / 1) * (35-(-8.12)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 35 + (((tickAnim - 3) / 12) * (0-(35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (20.83-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 10 + (((tickAnim - 1) / 1) * (22.5-(10)));
            zz = 20.83 + (((tickAnim - 1) / 1) * (11.87-(20.83)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 22.5 + (((tickAnim - 2) / 1) * (0-(22.5)));
            zz = 11.87 + (((tickAnim - 2) / 1) * (-27.5-(11.87)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = -27.5 + (((tickAnim - 3) / 12) * (0-(-27.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-9.17-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = -12.5 + (((tickAnim - 1) / 1) * (-22.5-(-12.5)));
            zz = -9.17 + (((tickAnim - 1) / 1) * (-30.67-(-9.17)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -22.5 + (((tickAnim - 2) / 1) * (0-(-22.5)));
            zz = -30.67 + (((tickAnim - 2) / 1) * (17.5-(-30.67)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 17.5 + (((tickAnim - 3) / 12) * (0-(17.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (12.5-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (1.67-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -30 + (((tickAnim - 1) / 1) * (-40-(-30)));
            yy = 12.5 + (((tickAnim - 1) / 1) * (9.37-(12.5)));
            zz = 1.67 + (((tickAnim - 1) / 1) * (-26.25-(1.67)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -40 + (((tickAnim - 2) / 1) * (0-(-40)));
            yy = 9.37 + (((tickAnim - 2) / 1) * (0-(9.37)));
            zz = -26.25 + (((tickAnim - 2) / 1) * (-10-(-26.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = -10 + (((tickAnim - 3) / 12) * (0-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (7.5-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -32.5 + (((tickAnim - 1) / 1) * (-44.38-(-32.5)));
            yy = -7.5 + (((tickAnim - 1) / 1) * (-13.13-(-7.5)));
            zz = 7.5 + (((tickAnim - 1) / 1) * (7.5-(7.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -44.38 + (((tickAnim - 2) / 1) * (0-(-44.38)));
            yy = -13.13 + (((tickAnim - 2) / 1) * (0-(-13.13)));
            zz = 7.5 + (((tickAnim - 2) / 1) * (30-(7.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 30 + (((tickAnim - 3) / 12) * (0-(30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-16.4-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (14.13-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (1.74-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -16.4 + (((tickAnim - 1) / 1) * (-37.37-(-16.4)));
            yy = 14.13 + (((tickAnim - 1) / 1) * (-10.85-(14.13)));
            zz = 1.74 + (((tickAnim - 1) / 1) * (9.55-(1.74)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -37.37 + (((tickAnim - 2) / 1) * (-14.36-(-37.37)));
            yy = -10.85 + (((tickAnim - 2) / 1) * (-19.18-(-10.85)));
            zz = 9.55 + (((tickAnim - 2) / 1) * (12.15-(9.55)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -14.36 + (((tickAnim - 3) / 0) * (12.23-(-14.36)));
            yy = -19.18 + (((tickAnim - 3) / 0) * (-24.73-(-19.18)));
            zz = 12.15 + (((tickAnim - 3) / 0) * (13.89-(12.15)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 12.23 + (((tickAnim - 3) / 7) * (-2.01-(12.23)));
            yy = -24.73 + (((tickAnim - 3) / 7) * (-51.83-(-24.73)));
            zz = 13.89 + (((tickAnim - 3) / 7) * (18.68-(13.89)));
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




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-17.55-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-4.59-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -17.55 + (((tickAnim - 1) / 1) * (-46.13-(-17.55)));
            yy = 0.55 + (((tickAnim - 1) / 1) * (3.03-(0.55)));
            zz = -4.59 + (((tickAnim - 1) / 1) * (-25.24-(-4.59)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -46.13 + (((tickAnim - 2) / 1) * (-25.65-(-46.13)));
            yy = 3.03 + (((tickAnim - 2) / 1) * (3.86-(3.03)));
            zz = -25.24 + (((tickAnim - 2) / 1) * (-32.13-(-25.24)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -25.65 + (((tickAnim - 3) / 0) * (25.5-(-25.65)));
            yy = 3.86 + (((tickAnim - 3) / 0) * (4.41-(3.86)));
            zz = -32.13 + (((tickAnim - 3) / 0) * (-36.72-(-32.13)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 25.5 + (((tickAnim - 3) / 7) * (-52.77-(25.5)));
            yy = 4.41 + (((tickAnim - 3) / 7) * (52.76-(4.41)));
            zz = -36.72 + (((tickAnim - 3) / 7) * (-22.95-(-36.72)));
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




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -25 + (((tickAnim - 2) / 1) * (10-(-25)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 3) / 12) * (0-(10)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -25 + (((tickAnim - 2) / 1) * (15-(-25)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 15 + (((tickAnim - 3) / 12) * (0-(15)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (45-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 45 + (((tickAnim - 2) / 1) * (-12.5-(45)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -12.5 + (((tickAnim - 3) / 7) * (21.25-(-12.5)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (45-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 45 + (((tickAnim - 2) / 1) * (-25-(45)));
            yy = 0 + (((tickAnim - 2) / 1) * (22.5-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -25 + (((tickAnim - 3) / 7) * (27.5-(-25)));
            yy = 22.5 + (((tickAnim - 3) / 7) * (11.25-(22.5)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 27.5 + (((tickAnim - 10) / 5) * (0-(27.5)));
            yy = 11.25 + (((tickAnim - 10) / 5) * (0-(11.25)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftAntennae2, leftAntennae2.rotateAngleX + (float) Math.toRadians(xx), leftAntennae2.rotateAngleY + (float) Math.toRadians(yy), leftAntennae2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (45-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 45 + (((tickAnim - 2) / 1) * (-35-(45)));
            yy = 0 + (((tickAnim - 2) / 1) * (-25-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -35 + (((tickAnim - 3) / 7) * (40-(-35)));
            yy = -25 + (((tickAnim - 3) / 7) * (-12.5-(-25)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 40 + (((tickAnim - 10) / 5) * (0-(40)));
            yy = -12.5 + (((tickAnim - 10) / 5) * (0-(-12.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightAntennae2, rightAntennae2.rotateAngleX + (float) Math.toRadians(xx), rightAntennae2.rotateAngleY + (float) Math.toRadians(yy), rightAntennae2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArchaeognatha_jungle entity = (EntityPrehistoricFloraArchaeognatha_jungle) entitylivingbaseIn;
        int animCycle = 5;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 2.99049 + (((tickAnim - 0) / 1) * (0-(2.99049)));
            yy = 2.97762 + (((tickAnim - 0) / 1) * (1-(2.97762)));
            zz = -0.36594 + (((tickAnim - 0) / 1) * (8-(-0.36594)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0.44863-(0)));
            yy = 1 + (((tickAnim - 1) / 1) * (-5.91742-(1)));
            zz = 8 + (((tickAnim - 1) / 1) * (3.49382-(8)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.44863 + (((tickAnim - 2) / 1) * (-0.65749-(0.44863)));
            yy = -5.91742 + (((tickAnim - 2) / 1) * (-0.57042-(-5.91742)));
            zz = 3.49382 + (((tickAnim - 2) / 1) * (7.73975-(3.49382)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -0.65749 + (((tickAnim - 3) / 0) * (2.99578-(-0.65749)));
            yy = -0.57042 + (((tickAnim - 3) / 0) * (1.98509-(-0.57042)));
            zz = 7.73975 + (((tickAnim - 3) / 0) * (-2.74384-(7.73975)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.99578 + (((tickAnim - 3) / 1) * (5.38767-(2.99578)));
            yy = 1.98509 + (((tickAnim - 3) / 1) * (3.00832-(1.98509)));
            zz = -2.74384 + (((tickAnim - 3) / 1) * (-1.01443-(-2.74384)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 5.38767 + (((tickAnim - 4) / 1) * (2.99049-(5.38767)));
            yy = 3.00832 + (((tickAnim - 4) / 1) * (2.97762-(3.00832)));
            zz = -1.01443 + (((tickAnim - 4) / 1) * (-0.36594-(-1.01443)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0.1-(0)));
            yy = 0.5 + (((tickAnim - 0) / 1) * (0.9-(0.5)));
            zz = 0.2 + (((tickAnim - 0) / 1) * (-0.3-(0.2)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0.1 + (((tickAnim - 1) / 1) * (0-(0.1)));
            yy = 0.9 + (((tickAnim - 1) / 1) * (0.5-(0.9)));
            zz = -0.3 + (((tickAnim - 1) / 1) * (0.2-(-0.3)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 2) / 1) * (0.9-(0.5)));
            zz = 0.2 + (((tickAnim - 2) / 1) * (-0.3-(0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (-0.1-(0)));
            yy = 0.9 + (((tickAnim - 3) / 0) * (0.5-(0.9)));
            zz = -0.3 + (((tickAnim - 3) / 0) * (0.2-(-0.3)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -0.1 + (((tickAnim - 3) / 1) * (0.2-(-0.1)));
            yy = 0.5 + (((tickAnim - 3) / 1) * (0.9-(0.5)));
            zz = 0.2 + (((tickAnim - 3) / 1) * (-0.3-(0.2)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0.2 + (((tickAnim - 4) / 1) * (0-(0.2)));
            yy = 0.9 + (((tickAnim - 4) / 1) * (0.5-(0.9)));
            zz = -0.3 + (((tickAnim - 4) / 1) * (0.2-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6.61613 + (((tickAnim - 0) / 1) * (0.98353-(6.61613)));
            yy = -36.34325 + (((tickAnim - 0) / 1) * (-6.10129-(-36.34325)));
            zz = -7.66363 + (((tickAnim - 0) / 1) * (-11.77835-(-7.66363)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0.98353 + (((tickAnim - 1) / 1) * (-0.79954-(0.98353)));
            yy = -6.10129 + (((tickAnim - 1) / 1) * (7.34521-(-6.10129)));
            zz = -11.77835 + (((tickAnim - 1) / 1) * (1.10644-(-11.77835)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.79954 + (((tickAnim - 2) / 1) * (6.61613-(-0.79954)));
            yy = 7.34521 + (((tickAnim - 2) / 1) * (-36.34325-(7.34521)));
            zz = 1.10644 + (((tickAnim - 2) / 1) * (-7.66363-(1.10644)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 6.61613 + (((tickAnim - 3) / 0) * (0.98353-(6.61613)));
            yy = -36.34325 + (((tickAnim - 3) / 0) * (-6.10129-(-36.34325)));
            zz = -7.66363 + (((tickAnim - 3) / 0) * (-11.77835-(-7.66363)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0.98353 + (((tickAnim - 3) / 1) * (-0.79954-(0.98353)));
            yy = -6.10129 + (((tickAnim - 3) / 1) * (7.34521-(-6.10129)));
            zz = -11.77835 + (((tickAnim - 3) / 1) * (1.10644-(-11.77835)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -0.79954 + (((tickAnim - 4) / 1) * (6.61613-(-0.79954)));
            yy = 7.34521 + (((tickAnim - 4) / 1) * (-36.34325-(7.34521)));
            zz = 1.10644 + (((tickAnim - 4) / 1) * (-7.66363-(1.10644)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.79954 + (((tickAnim - 0) / 2) * (6.61613-(-0.79954)));
            yy = -7.34521 + (((tickAnim - 0) / 2) * (36.34325-(-7.34521)));
            zz = -1.10644 + (((tickAnim - 0) / 2) * (7.66363-(-1.10644)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 6.61613 + (((tickAnim - 2) / 1) * (-0.79954-(6.61613)));
            yy = 36.34325 + (((tickAnim - 2) / 1) * (-7.34521-(36.34325)));
            zz = 7.66363 + (((tickAnim - 2) / 1) * (-1.10644-(7.66363)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -0.79954 + (((tickAnim - 3) / 1) * (6.61613-(-0.79954)));
            yy = -7.34521 + (((tickAnim - 3) / 1) * (36.34325-(-7.34521)));
            zz = -1.10644 + (((tickAnim - 3) / 1) * (7.66363-(-1.10644)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 6.61613 + (((tickAnim - 4) / 1) * (-0.79954-(6.61613)));
            yy = 36.34325 + (((tickAnim - 4) / 1) * (-7.34521-(36.34325)));
            zz = 7.66363 + (((tickAnim - 4) / 1) * (-1.10644-(7.66363)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.38474 + (((tickAnim - 0) / 2) * (6.99835-(-7.38474)));
            yy = 20.30768 + (((tickAnim - 0) / 2) * (-22.34619-(20.30768)));
            zz = 11.0304 + (((tickAnim - 0) / 2) * (-4.86749-(11.0304)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 6.99835 + (((tickAnim - 2) / 1) * (-7.38474-(6.99835)));
            yy = -22.34619 + (((tickAnim - 2) / 1) * (20.30768-(-22.34619)));
            zz = -4.86749 + (((tickAnim - 2) / 1) * (11.0304-(-4.86749)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -7.38474 + (((tickAnim - 3) / 1) * (6.99835-(-7.38474)));
            yy = 20.30768 + (((tickAnim - 3) / 1) * (-22.34619-(20.30768)));
            zz = 11.0304 + (((tickAnim - 3) / 1) * (-4.86749-(11.0304)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 6.99835 + (((tickAnim - 4) / 1) * (-7.38474-(6.99835)));
            yy = -22.34619 + (((tickAnim - 4) / 1) * (20.30768-(-22.34619)));
            zz = -4.86749 + (((tickAnim - 4) / 1) * (11.0304-(-4.86749)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 4.11154 + (((tickAnim - 0) / 1) * (2.98429-(4.11154)));
            yy = 23.33295 + (((tickAnim - 0) / 1) * (-10.73308-(23.33295)));
            zz = 1.17846 + (((tickAnim - 0) / 1) * (9.9069-(1.17846)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 2.98429 + (((tickAnim - 1) / 1) * (-7.38474-(2.98429)));
            yy = -10.73308 + (((tickAnim - 1) / 1) * (-20.30768-(-10.73308)));
            zz = 9.9069 + (((tickAnim - 1) / 1) * (-11.0304-(9.9069)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -7.38474 + (((tickAnim - 2) / 1) * (4.11154-(-7.38474)));
            yy = -20.30768 + (((tickAnim - 2) / 1) * (23.33295-(-20.30768)));
            zz = -11.0304 + (((tickAnim - 2) / 1) * (1.17846-(-11.0304)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 4.11154 + (((tickAnim - 3) / 0) * (2.98429-(4.11154)));
            yy = 23.33295 + (((tickAnim - 3) / 0) * (-10.73308-(23.33295)));
            zz = 1.17846 + (((tickAnim - 3) / 0) * (9.9069-(1.17846)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.98429 + (((tickAnim - 3) / 1) * (-7.38474-(2.98429)));
            yy = -10.73308 + (((tickAnim - 3) / 1) * (-20.30768-(-10.73308)));
            zz = 9.9069 + (((tickAnim - 3) / 1) * (-11.0304-(9.9069)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -7.38474 + (((tickAnim - 4) / 1) * (4.11154-(-7.38474)));
            yy = -20.30768 + (((tickAnim - 4) / 1) * (23.33295-(-20.30768)));
            zz = -11.0304 + (((tickAnim - 4) / 1) * (1.17846-(-11.0304)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.06267 + (((tickAnim - 0) / 2) * (4.29706-(-7.06267)));
            yy = 21.6498 + (((tickAnim - 0) / 2) * (-22.02051-(21.6498)));
            zz = -5.9674 + (((tickAnim - 0) / 2) * (2.87819-(-5.9674)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 4.29706 + (((tickAnim - 2) / 1) * (-7.06267-(4.29706)));
            yy = -22.02051 + (((tickAnim - 2) / 1) * (21.6498-(-22.02051)));
            zz = 2.87819 + (((tickAnim - 2) / 1) * (-5.9674-(2.87819)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -7.06267 + (((tickAnim - 3) / 1) * (4.29706-(-7.06267)));
            yy = 21.6498 + (((tickAnim - 3) / 1) * (-22.02051-(21.6498)));
            zz = -5.9674 + (((tickAnim - 3) / 1) * (2.87819-(-5.9674)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 4.29706 + (((tickAnim - 4) / 1) * (-7.06267-(4.29706)));
            yy = -22.02051 + (((tickAnim - 4) / 1) * (21.6498-(-22.02051)));
            zz = 2.87819 + (((tickAnim - 4) / 1) * (-5.9674-(2.87819)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 4.29706 + (((tickAnim - 0) / 1) * (-8.23312-(4.29706)));
            yy = 22.02051 + (((tickAnim - 0) / 1) * (-3.39396-(22.02051)));
            zz = -2.87819 + (((tickAnim - 0) / 1) * (13.54812-(-2.87819)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -8.23312 + (((tickAnim - 1) / 1) * (-7.06267-(-8.23312)));
            yy = -3.39396 + (((tickAnim - 1) / 1) * (-21.6498-(-3.39396)));
            zz = 13.54812 + (((tickAnim - 1) / 1) * (5.9674-(13.54812)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -7.06267 + (((tickAnim - 2) / 1) * (4.29706-(-7.06267)));
            yy = -21.6498 + (((tickAnim - 2) / 1) * (22.02051-(-21.6498)));
            zz = 5.9674 + (((tickAnim - 2) / 1) * (-2.87819-(5.9674)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 4.29706 + (((tickAnim - 3) / 0) * (-8.23312-(4.29706)));
            yy = 22.02051 + (((tickAnim - 3) / 0) * (-3.39396-(22.02051)));
            zz = -2.87819 + (((tickAnim - 3) / 0) * (13.54812-(-2.87819)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -8.23312 + (((tickAnim - 3) / 1) * (-7.06267-(-8.23312)));
            yy = -3.39396 + (((tickAnim - 3) / 1) * (-21.6498-(-3.39396)));
            zz = 13.54812 + (((tickAnim - 3) / 1) * (5.9674-(13.54812)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -7.06267 + (((tickAnim - 4) / 1) * (4.29706-(-7.06267)));
            yy = -21.6498 + (((tickAnim - 4) / 1) * (22.02051-(-21.6498)));
            zz = 5.9674 + (((tickAnim - 4) / 1) * (-2.87819-(5.9674)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-10-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (-25-(0)));
            yy = -10 + (((tickAnim - 1) / 1) * (1.25-(-10)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -25 + (((tickAnim - 2) / 1) * (-10-(-25)));
            yy = 1.25 + (((tickAnim - 2) / 1) * (12.5-(1.25)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -10 + (((tickAnim - 3) / 0) * (-12.72126-(-10)));
            yy = 12.5 + (((tickAnim - 3) / 0) * (-39.92025-(12.5)));
            zz = 0 + (((tickAnim - 3) / 0) * (4.05069-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -12.72126 + (((tickAnim - 3) / 2) * (0-(-12.72126)));
            yy = -39.92025 + (((tickAnim - 3) / 2) * (0-(-39.92025)));
            zz = 4.05069 + (((tickAnim - 3) / 2) * (0-(4.05069)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftAntennae1, leftAntennae1.rotateAngleX + (float) Math.toRadians(xx), leftAntennae1.rotateAngleY + (float) Math.toRadians(yy), leftAntennae1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (8.75-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -25 + (((tickAnim - 1) / 1) * (0-(-25)));
            yy = 8.75 + (((tickAnim - 1) / 1) * (17.5-(8.75)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-12.5-(0)));
            yy = 17.5 + (((tickAnim - 2) / 1) * (17.5-(17.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -12.5 + (((tickAnim - 3) / 0) * (0-(-12.5)));
            yy = 17.5 + (((tickAnim - 3) / 0) * (0-(17.5)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (-22.51332-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-12.49993-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (-0.04506-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -22.51332 + (((tickAnim - 4) / 1) * (0-(-22.51332)));
            yy = -12.49993 + (((tickAnim - 4) / 1) * (0-(-12.49993)));
            zz = -0.04506 + (((tickAnim - 4) / 1) * (0-(-0.04506)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightAntennae1, rightAntennae1.rotateAngleX + (float) Math.toRadians(xx), rightAntennae1.rotateAngleY + (float) Math.toRadians(yy), rightAntennae1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -1.24881 + (((tickAnim - 0) / 1) * (2.48389-(-1.24881)));
            yy = -2.4994 + (((tickAnim - 0) / 1) * (1.97351-(-2.4994)));
            zz = -0.05457 + (((tickAnim - 0) / 1) * (0.60895-(-0.05457)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 2.48389 + (((tickAnim - 1) / 2) * (7.46157-(2.48389)));
            yy = 1.97351 + (((tickAnim - 1) / 2) * (0.07558-(1.97351)));
            zz = 0.60895 + (((tickAnim - 1) / 2) * (-0.86717-(0.60895)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 7.46157 + (((tickAnim - 3) / 1) * (4.97809-(7.46157)));
            yy = 0.07558 + (((tickAnim - 3) / 1) * (2.4362-(0.07558)));
            zz = -0.86717 + (((tickAnim - 3) / 1) * (0.97708-(-0.86717)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 4.97809 + (((tickAnim - 4) / 1) * (-1.24881-(4.97809)));
            yy = 2.4362 + (((tickAnim - 4) / 1) * (-2.4994-(2.4362)));
            zz = 0.97708 + (((tickAnim - 4) / 1) * (-0.05457-(0.97708)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -2.5 + (((tickAnim - 0) / 2) * (2.5-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 2) / 1) * (0-(2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -2.5 + (((tickAnim - 0) / 2) * (2.5-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 2) / 1) * (0-(2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftAntennae2, leftAntennae2.rotateAngleX + (float) Math.toRadians(xx), leftAntennae2.rotateAngleY + (float) Math.toRadians(yy), leftAntennae2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -2.5 + (((tickAnim - 0) / 2) * (2.5-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 2) / 1) * (0-(2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightAntennae2, rightAntennae2.rotateAngleX + (float) Math.toRadians(xx), rightAntennae2.rotateAngleY + (float) Math.toRadians(yy), rightAntennae2.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isMoving) {
        EntityPrehistoricFloraArchaeognatha_jungle entity = (EntityPrehistoricFloraArchaeognatha_jungle) entitylivingbaseIn;
        int animCycle = 5;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        if (!isMoving) {
            tickAnim = 0;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 2.99049 + (((tickAnim - 0) / 1) * (0-(2.99049)));
            yy = 2.97762 + (((tickAnim - 0) / 1) * (1-(2.97762)));
            zz = -0.36594 + (((tickAnim - 0) / 1) * (8-(-0.36594)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0.44863-(0)));
            yy = 1 + (((tickAnim - 1) / 1) * (-5.91742-(1)));
            zz = 8 + (((tickAnim - 1) / 1) * (3.49382-(8)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.44863 + (((tickAnim - 2) / 1) * (-0.65749-(0.44863)));
            yy = -5.91742 + (((tickAnim - 2) / 1) * (-0.57042-(-5.91742)));
            zz = 3.49382 + (((tickAnim - 2) / 1) * (7.73975-(3.49382)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -0.65749 + (((tickAnim - 3) / 0) * (2.99578-(-0.65749)));
            yy = -0.57042 + (((tickAnim - 3) / 0) * (1.98509-(-0.57042)));
            zz = 7.73975 + (((tickAnim - 3) / 0) * (-2.74384-(7.73975)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.99578 + (((tickAnim - 3) / 1) * (5.38767-(2.99578)));
            yy = 1.98509 + (((tickAnim - 3) / 1) * (3.00832-(1.98509)));
            zz = -2.74384 + (((tickAnim - 3) / 1) * (-1.01443-(-2.74384)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 5.38767 + (((tickAnim - 4) / 1) * (2.99049-(5.38767)));
            yy = 3.00832 + (((tickAnim - 4) / 1) * (2.97762-(3.00832)));
            zz = -1.01443 + (((tickAnim - 4) / 1) * (-0.36594-(-1.01443)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0.1-(0)));
            yy = 0.5 + (((tickAnim - 0) / 1) * (0.9-(0.5)));
            zz = 0.2 + (((tickAnim - 0) / 1) * (-0.3-(0.2)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0.1 + (((tickAnim - 1) / 1) * (0-(0.1)));
            yy = 0.9 + (((tickAnim - 1) / 1) * (0.5-(0.9)));
            zz = -0.3 + (((tickAnim - 1) / 1) * (0.2-(-0.3)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 2) / 1) * (0.9-(0.5)));
            zz = 0.2 + (((tickAnim - 2) / 1) * (-0.3-(0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (-0.1-(0)));
            yy = 0.9 + (((tickAnim - 3) / 0) * (0.5-(0.9)));
            zz = -0.3 + (((tickAnim - 3) / 0) * (0.2-(-0.3)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -0.1 + (((tickAnim - 3) / 1) * (0.2-(-0.1)));
            yy = 0.5 + (((tickAnim - 3) / 1) * (0.9-(0.5)));
            zz = 0.2 + (((tickAnim - 3) / 1) * (-0.3-(0.2)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0.2 + (((tickAnim - 4) / 1) * (0-(0.2)));
            yy = 0.9 + (((tickAnim - 4) / 1) * (0.5-(0.9)));
            zz = -0.3 + (((tickAnim - 4) / 1) * (0.2-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6.61613 + (((tickAnim - 0) / 1) * (0.98353-(6.61613)));
            yy = -36.34325 + (((tickAnim - 0) / 1) * (-6.10129-(-36.34325)));
            zz = -7.66363 + (((tickAnim - 0) / 1) * (-11.77835-(-7.66363)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0.98353 + (((tickAnim - 1) / 1) * (-0.79954-(0.98353)));
            yy = -6.10129 + (((tickAnim - 1) / 1) * (7.34521-(-6.10129)));
            zz = -11.77835 + (((tickAnim - 1) / 1) * (1.10644-(-11.77835)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.79954 + (((tickAnim - 2) / 1) * (6.61613-(-0.79954)));
            yy = 7.34521 + (((tickAnim - 2) / 1) * (-36.34325-(7.34521)));
            zz = 1.10644 + (((tickAnim - 2) / 1) * (-7.66363-(1.10644)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 6.61613 + (((tickAnim - 3) / 0) * (0.98353-(6.61613)));
            yy = -36.34325 + (((tickAnim - 3) / 0) * (-6.10129-(-36.34325)));
            zz = -7.66363 + (((tickAnim - 3) / 0) * (-11.77835-(-7.66363)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0.98353 + (((tickAnim - 3) / 1) * (-0.79954-(0.98353)));
            yy = -6.10129 + (((tickAnim - 3) / 1) * (7.34521-(-6.10129)));
            zz = -11.77835 + (((tickAnim - 3) / 1) * (1.10644-(-11.77835)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -0.79954 + (((tickAnim - 4) / 1) * (6.61613-(-0.79954)));
            yy = 7.34521 + (((tickAnim - 4) / 1) * (-36.34325-(7.34521)));
            zz = 1.10644 + (((tickAnim - 4) / 1) * (-7.66363-(1.10644)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.79954 + (((tickAnim - 0) / 2) * (6.61613-(-0.79954)));
            yy = -7.34521 + (((tickAnim - 0) / 2) * (36.34325-(-7.34521)));
            zz = -1.10644 + (((tickAnim - 0) / 2) * (7.66363-(-1.10644)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 6.61613 + (((tickAnim - 2) / 1) * (-0.79954-(6.61613)));
            yy = 36.34325 + (((tickAnim - 2) / 1) * (-7.34521-(36.34325)));
            zz = 7.66363 + (((tickAnim - 2) / 1) * (-1.10644-(7.66363)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -0.79954 + (((tickAnim - 3) / 1) * (6.61613-(-0.79954)));
            yy = -7.34521 + (((tickAnim - 3) / 1) * (36.34325-(-7.34521)));
            zz = -1.10644 + (((tickAnim - 3) / 1) * (7.66363-(-1.10644)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 6.61613 + (((tickAnim - 4) / 1) * (-0.79954-(6.61613)));
            yy = 36.34325 + (((tickAnim - 4) / 1) * (-7.34521-(36.34325)));
            zz = 7.66363 + (((tickAnim - 4) / 1) * (-1.10644-(7.66363)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.38474 + (((tickAnim - 0) / 2) * (6.99835-(-7.38474)));
            yy = 20.30768 + (((tickAnim - 0) / 2) * (-22.34619-(20.30768)));
            zz = 11.0304 + (((tickAnim - 0) / 2) * (-4.86749-(11.0304)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 6.99835 + (((tickAnim - 2) / 1) * (-7.38474-(6.99835)));
            yy = -22.34619 + (((tickAnim - 2) / 1) * (20.30768-(-22.34619)));
            zz = -4.86749 + (((tickAnim - 2) / 1) * (11.0304-(-4.86749)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -7.38474 + (((tickAnim - 3) / 1) * (6.99835-(-7.38474)));
            yy = 20.30768 + (((tickAnim - 3) / 1) * (-22.34619-(20.30768)));
            zz = 11.0304 + (((tickAnim - 3) / 1) * (-4.86749-(11.0304)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 6.99835 + (((tickAnim - 4) / 1) * (-7.38474-(6.99835)));
            yy = -22.34619 + (((tickAnim - 4) / 1) * (20.30768-(-22.34619)));
            zz = -4.86749 + (((tickAnim - 4) / 1) * (11.0304-(-4.86749)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 4.11154 + (((tickAnim - 0) / 1) * (2.98429-(4.11154)));
            yy = 23.33295 + (((tickAnim - 0) / 1) * (-10.73308-(23.33295)));
            zz = 1.17846 + (((tickAnim - 0) / 1) * (9.9069-(1.17846)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 2.98429 + (((tickAnim - 1) / 1) * (-7.38474-(2.98429)));
            yy = -10.73308 + (((tickAnim - 1) / 1) * (-20.30768-(-10.73308)));
            zz = 9.9069 + (((tickAnim - 1) / 1) * (-11.0304-(9.9069)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -7.38474 + (((tickAnim - 2) / 1) * (4.11154-(-7.38474)));
            yy = -20.30768 + (((tickAnim - 2) / 1) * (23.33295-(-20.30768)));
            zz = -11.0304 + (((tickAnim - 2) / 1) * (1.17846-(-11.0304)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 4.11154 + (((tickAnim - 3) / 0) * (2.98429-(4.11154)));
            yy = 23.33295 + (((tickAnim - 3) / 0) * (-10.73308-(23.33295)));
            zz = 1.17846 + (((tickAnim - 3) / 0) * (9.9069-(1.17846)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.98429 + (((tickAnim - 3) / 1) * (-7.38474-(2.98429)));
            yy = -10.73308 + (((tickAnim - 3) / 1) * (-20.30768-(-10.73308)));
            zz = 9.9069 + (((tickAnim - 3) / 1) * (-11.0304-(9.9069)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -7.38474 + (((tickAnim - 4) / 1) * (4.11154-(-7.38474)));
            yy = -20.30768 + (((tickAnim - 4) / 1) * (23.33295-(-20.30768)));
            zz = -11.0304 + (((tickAnim - 4) / 1) * (1.17846-(-11.0304)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.06267 + (((tickAnim - 0) / 2) * (4.29706-(-7.06267)));
            yy = 21.6498 + (((tickAnim - 0) / 2) * (-22.02051-(21.6498)));
            zz = -5.9674 + (((tickAnim - 0) / 2) * (2.87819-(-5.9674)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 4.29706 + (((tickAnim - 2) / 1) * (-7.06267-(4.29706)));
            yy = -22.02051 + (((tickAnim - 2) / 1) * (21.6498-(-22.02051)));
            zz = 2.87819 + (((tickAnim - 2) / 1) * (-5.9674-(2.87819)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -7.06267 + (((tickAnim - 3) / 1) * (4.29706-(-7.06267)));
            yy = 21.6498 + (((tickAnim - 3) / 1) * (-22.02051-(21.6498)));
            zz = -5.9674 + (((tickAnim - 3) / 1) * (2.87819-(-5.9674)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 4.29706 + (((tickAnim - 4) / 1) * (-7.06267-(4.29706)));
            yy = -22.02051 + (((tickAnim - 4) / 1) * (21.6498-(-22.02051)));
            zz = 2.87819 + (((tickAnim - 4) / 1) * (-5.9674-(2.87819)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 4.29706 + (((tickAnim - 0) / 1) * (-8.23312-(4.29706)));
            yy = 22.02051 + (((tickAnim - 0) / 1) * (-3.39396-(22.02051)));
            zz = -2.87819 + (((tickAnim - 0) / 1) * (13.54812-(-2.87819)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -8.23312 + (((tickAnim - 1) / 1) * (-7.06267-(-8.23312)));
            yy = -3.39396 + (((tickAnim - 1) / 1) * (-21.6498-(-3.39396)));
            zz = 13.54812 + (((tickAnim - 1) / 1) * (5.9674-(13.54812)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -7.06267 + (((tickAnim - 2) / 1) * (4.29706-(-7.06267)));
            yy = -21.6498 + (((tickAnim - 2) / 1) * (22.02051-(-21.6498)));
            zz = 5.9674 + (((tickAnim - 2) / 1) * (-2.87819-(5.9674)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 4.29706 + (((tickAnim - 3) / 0) * (-8.23312-(4.29706)));
            yy = 22.02051 + (((tickAnim - 3) / 0) * (-3.39396-(22.02051)));
            zz = -2.87819 + (((tickAnim - 3) / 0) * (13.54812-(-2.87819)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -8.23312 + (((tickAnim - 3) / 1) * (-7.06267-(-8.23312)));
            yy = -3.39396 + (((tickAnim - 3) / 1) * (-21.6498-(-3.39396)));
            zz = 13.54812 + (((tickAnim - 3) / 1) * (5.9674-(13.54812)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -7.06267 + (((tickAnim - 4) / 1) * (4.29706-(-7.06267)));
            yy = -21.6498 + (((tickAnim - 4) / 1) * (22.02051-(-21.6498)));
            zz = 5.9674 + (((tickAnim - 4) / 1) * (-2.87819-(5.9674)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-10-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (-25-(0)));
            yy = -10 + (((tickAnim - 1) / 1) * (1.25-(-10)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -25 + (((tickAnim - 2) / 1) * (-10-(-25)));
            yy = 1.25 + (((tickAnim - 2) / 1) * (12.5-(1.25)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -10 + (((tickAnim - 3) / 0) * (-12.72126-(-10)));
            yy = 12.5 + (((tickAnim - 3) / 0) * (-39.92025-(12.5)));
            zz = 0 + (((tickAnim - 3) / 0) * (4.05069-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -12.72126 + (((tickAnim - 3) / 2) * (0-(-12.72126)));
            yy = -39.92025 + (((tickAnim - 3) / 2) * (0-(-39.92025)));
            zz = 4.05069 + (((tickAnim - 3) / 2) * (0-(4.05069)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftAntennae1, leftAntennae1.rotateAngleX + (float) Math.toRadians(xx), leftAntennae1.rotateAngleY + (float) Math.toRadians(yy), leftAntennae1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (8.75-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -25 + (((tickAnim - 1) / 1) * (0-(-25)));
            yy = 8.75 + (((tickAnim - 1) / 1) * (17.5-(8.75)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-12.5-(0)));
            yy = 17.5 + (((tickAnim - 2) / 1) * (17.5-(17.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -12.5 + (((tickAnim - 3) / 0) * (0-(-12.5)));
            yy = 17.5 + (((tickAnim - 3) / 0) * (0-(17.5)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (-22.51332-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-12.49993-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (-0.04506-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -22.51332 + (((tickAnim - 4) / 1) * (0-(-22.51332)));
            yy = -12.49993 + (((tickAnim - 4) / 1) * (0-(-12.49993)));
            zz = -0.04506 + (((tickAnim - 4) / 1) * (0-(-0.04506)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightAntennae1, rightAntennae1.rotateAngleX + (float) Math.toRadians(xx), rightAntennae1.rotateAngleY + (float) Math.toRadians(yy), rightAntennae1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -1.24881 + (((tickAnim - 0) / 1) * (2.48389-(-1.24881)));
            yy = -2.4994 + (((tickAnim - 0) / 1) * (1.97351-(-2.4994)));
            zz = -0.05457 + (((tickAnim - 0) / 1) * (0.60895-(-0.05457)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 2.48389 + (((tickAnim - 1) / 2) * (7.46157-(2.48389)));
            yy = 1.97351 + (((tickAnim - 1) / 2) * (0.07558-(1.97351)));
            zz = 0.60895 + (((tickAnim - 1) / 2) * (-0.86717-(0.60895)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 7.46157 + (((tickAnim - 3) / 1) * (4.97809-(7.46157)));
            yy = 0.07558 + (((tickAnim - 3) / 1) * (2.4362-(0.07558)));
            zz = -0.86717 + (((tickAnim - 3) / 1) * (0.97708-(-0.86717)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 4.97809 + (((tickAnim - 4) / 1) * (-1.24881-(4.97809)));
            yy = 2.4362 + (((tickAnim - 4) / 1) * (-2.4994-(2.4362)));
            zz = 0.97708 + (((tickAnim - 4) / 1) * (-0.05457-(0.97708)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -2.5 + (((tickAnim - 0) / 2) * (2.5-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 2) / 1) * (0-(2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -2.5 + (((tickAnim - 0) / 2) * (2.5-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 2) / 1) * (0-(2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftAntennae2, leftAntennae2.rotateAngleX + (float) Math.toRadians(xx), leftAntennae2.rotateAngleY + (float) Math.toRadians(yy), leftAntennae2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -2.5 + (((tickAnim - 0) / 2) * (2.5-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 2) / 1) * (0-(2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
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
