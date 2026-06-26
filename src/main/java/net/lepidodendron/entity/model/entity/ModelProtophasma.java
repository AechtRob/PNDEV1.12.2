package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraProtophasma;
import net.lepidodendron.entity.EntityPrehistoricFloraProtophasma;
import net.lepidodendron.entity.EntityPrehistoricFloraSantanmantis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelProtophasma extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer protophasma;
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer rightForewing;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer abdomen1;
    private final AdvancedModelRenderer abdomen2;
    private final AdvancedModelRenderer abdomen3;
    private final AdvancedModelRenderer rightCercus;
    private final AdvancedModelRenderer leftCercus;

    private ModelAnimator animator;

    public ModelProtophasma() {
        this.textureWidth = 45;
        this.textureHeight = 45;

        this.protophasma = new AdvancedModelRenderer(this);
        this.protophasma.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.protophasma.addChild(thorax);
        this.thorax.cubeList.add(new ModelBox(thorax, 10, 22, -1.0F, -4.695F, -1.3688F, 2, 2, 3, -0.01F, false));
        this.thorax.cubeList.add(new ModelBox(thorax, 7, 28, -1.0F, -4.095F, -3.1688F, 2, 1, 2, -0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.6365F, -2.18F);
        this.thorax.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 22, -1.0F, -1.1635F, -2.0F, 2, 1, 3, 0.0F, false));

        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(0.6F, -4.7F, -2.8F);
        this.thorax.addChild(leftForewing);
        this.setRotateAngle(leftForewing, 0.0F, -1.2217F, 0.0F);
        this.leftForewing.cubeList.add(new ModelBox(leftForewing, 0, 0, 0.0F, 0.0F, 0.0F, 13, 0, 5, 0.0F, false));

        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(1.0F, -4.6F, -0.3F);
        this.thorax.addChild(leftHindwing);
        this.setRotateAngle(leftHindwing, 0.0F, -1.1781F, 0.0F);
        this.leftHindwing.cubeList.add(new ModelBox(leftHindwing, 0, 6, -0.4F, 0.0F, 0.0F, 12, 0, 5, 0.0F, false));

        this.rightForewing = new AdvancedModelRenderer(this);
        this.rightForewing.setRotationPoint(-0.6F, -4.7F, -2.8F);
        this.thorax.addChild(rightForewing);
        this.setRotateAngle(rightForewing, 0.0F, 1.2217F, 0.0F);
        this.rightForewing.cubeList.add(new ModelBox(rightForewing, 0, 0, -13.0F, -0.01F, 0.0F, 13, 0, 5, 0.0F, true));

        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(-1.0F, -4.6F, -0.3F);
        this.thorax.addChild(rightHindwing);
        this.setRotateAngle(rightHindwing, 0.0F, 1.1781F, 0.0F);
        this.rightHindwing.cubeList.add(new ModelBox(rightHindwing, 0, 6, -11.6F, -0.01F, 0.0F, 12, 0, 5, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.774F, -2.6268F);
        this.thorax.addChild(neck);
        this.setRotateAngle(neck, 0.1309F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 25, -0.5F, -1.5551F, -2.3641F, 1, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.2257F, -4.6505F, -2.0846F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.7854F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0257F, 3.0818F, -1.6619F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.9171F, -0.4718F, 0.5355F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 12, -1.181F, -0.3136F, -2.0075F, 1, 1, 1, -0.1F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5743F, 3.0818F, -1.6619F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.9171F, 0.4718F, -0.5355F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 12, 0.181F, -0.3136F, -2.0075F, 1, 1, 1, -0.1F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.2257F, 3.5061F, -1.6619F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 22, -0.55F, 0.5865F, -2.0373F, 0, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 22, 0.55F, 0.5865F, -2.0373F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, -0.1135F, -2.4373F, 1, 1, 1, 0.08F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 6, -0.5F, -0.6135F, -2.4373F, 1, 1, 1, 0.1F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.6513F, 1.5332F, -3.2756F);
        this.head.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, 0.0F, 0.0F, -0.2618F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.2F, -2.5332F, 3.2756F);
        this.rightAntenna.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5672F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 29, -0.2F, 1.3F, -3.1F, 0, 3, 2, 0.0F, true));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.2F, 1.5332F, -3.2756F);
        this.head.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, 0.0F, 0.0F, 0.2618F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.2F, -2.5332F, 3.2756F);
        this.leftAntenna.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5672F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 29, 0.2F, 1.3F, -3.1F, 0, 3, 2, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.5F, -3.0F, -2.55F);
        this.thorax.addChild(rightLeg1);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.25F, 0.0F);
        this.rightLeg1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.8727F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 17, -7.0F, -2.3F, 0.0F, 7, 4, 0, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.5F, -3.0F, -2.55F);
        this.thorax.addChild(leftLeg1);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.25F, 0.0F);
        this.leftLeg1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.8727F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 17, 0.0F, -2.3F, 0.0F, 7, 4, 0, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5F, -3.05F, -1.75F);
        this.thorax.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, -0.5236F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.rightLeg2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.829F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 12, -7.0F, -3.0F, 0.0F, 7, 4, 0, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5F, -3.05F, -1.75F);
        this.thorax.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.5236F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.leftLeg2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.829F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 12, 0.0F, -3.0F, 0.0F, 7, 4, 0, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.5F, -2.7F, 0.55F);
        this.thorax.addChild(rightLeg3);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.65F, 0.0F);
        this.rightLeg3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.6109F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 20, -6.0F, -3.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.5F, -2.7F, 0.55F);
        this.thorax.addChild(leftLeg3);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.65F, 0.0F);
        this.leftLeg3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.6109F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 20, 0.0F, -3.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.abdomen1 = new AdvancedModelRenderer(this);
        this.abdomen1.setRotationPoint(0.0F, -4.595F, 1.3312F);
        this.protophasma.addChild(abdomen1);
        this.abdomen1.cubeList.add(new ModelBox(abdomen1, 28, 27, -1.0F, -0.1F, -0.7F, 2, 1, 2, -0.02F, false));
        this.abdomen1.cubeList.add(new ModelBox(abdomen1, 19, 27, -1.0F, 0.5F, -0.7F, 2, 1, 2, -0.03F, false));

        this.abdomen2 = new AdvancedModelRenderer(this);
        this.abdomen2.setRotationPoint(0.0F, -0.1F, 1.2F);
        this.abdomen1.addChild(abdomen2);
        this.setRotateAngle(abdomen2, -0.0873F, 0.0F, 0.0F);
        this.abdomen2.cubeList.add(new ModelBox(abdomen2, 0, 12, -1.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.abdomen3 = new AdvancedModelRenderer(this);
        this.abdomen3.setRotationPoint(0.0F, 0.4F, 5.0667F);
        this.abdomen2.addChild(abdomen3);
        this.setRotateAngle(abdomen3, -0.1309F, 0.0F, 0.0F);
        this.abdomen3.cubeList.add(new ModelBox(abdomen3, 25, 12, -1.0F, 0.5F, -0.2667F, 2, 1, 2, -0.02F, false));
        this.abdomen3.cubeList.add(new ModelBox(abdomen3, 29, 20, -1.0F, -0.1F, -0.2667F, 2, 1, 2, -0.01F, false));
        this.abdomen3.cubeList.add(new ModelBox(abdomen3, 0, 30, -0.5F, 0.2F, 1.6333F, 1, 1, 1, -0.03F, false));

        this.rightCercus = new AdvancedModelRenderer(this);
        this.rightCercus.setRotationPoint(-1.0F, 2.295F, 0.1021F);
        this.abdomen3.addChild(rightCercus);
        this.setRotateAngle(rightCercus, 0.0F, -0.5236F, 0.0F);
        this.rightCercus.cubeList.add(new ModelBox(rightCercus, 18, 22, 1.7096F, -2.065F, 1.9011F, 0, 1, 1, 0.0F, true));

        this.leftCercus = new AdvancedModelRenderer(this);
        this.leftCercus.setRotationPoint(1.0F, 2.295F, 0.1021F);
        this.abdomen3.addChild(leftCercus);
        this.setRotateAngle(leftCercus, 0.0F, 0.5236F, 0.0F);
        this.leftCercus.cubeList.add(new ModelBox(leftCercus, 18, 22, -1.7086F, -2.065F, 1.9011F, 0, 1, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.protophasma.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(protophasma, 1.0F, 0.0F, 0.0F);
        this.protophasma.offsetY = -0.25F;
        this.protophasma.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.protophasma.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        //this.body.offsetZ = -0.080F;
        this.protophasma.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.protophasma.offsetY = -2.30F;
        this.protophasma.offsetX = -0.05F;
        this.protophasma.rotateAngleY = (float)Math.toRadians(210);
        this.protophasma.rotateAngleX = (float)Math.toRadians(40);
        this.protophasma.rotateAngleZ = (float)Math.toRadians(-8);
        this.protophasma.scaleChildren = true;
        float scaler = 3.9F;
        this.protophasma.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.protophasma.render(f);
        //Reset rotations, positions and sizing:
        this.protophasma.setScale(1.0F, 1.0F, 1.0F);
        this.protophasma.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraProtophasma ee = (EntityPrehistoricFloraProtophasma) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getClimbFacing() == EnumFacing.NORTH
                    || ee.getClimbFacing() == EnumFacing.EAST
                    || ee.getClimbFacing() == EnumFacing.SOUTH
                    || ee.getClimbFacing() == EnumFacing.WEST
                    || ee.getIsClimbing()) {
                if (!ee.getHeadCollided()) {
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }
                else {
                    //Just pose with no animation running:
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                }
            }
            else if (ee.getIsMoving()) {
                if (!ee.getIsFlying() && ee.getIsMoving() && ee.onGround) {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
                else {
                    if (ee.getIsLaunching()) {
                        animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        //Is gliding:
                        animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
            }
        }
        else {
            //Is gliding:
            animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        }

        if (ee.getAnimation() == ee.STAND_ANIMATION) { //The idle scratch
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProtophasma entity = (EntityPrehistoricFloraProtophasma) entitylivingbaseIn;
        int animCycle = 93;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 17) {
            xx = -10 + (((tickAnim - 2) / 15) * (-7.5-(-10)));
            yy = 0 + (((tickAnim - 2) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 15) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -7.5 + (((tickAnim - 17) / 6) * (-6.51122-(-7.5)));
            yy = 0 + (((tickAnim - 17) / 6) * (-0.14808-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (-0.78618-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = -6.51122 + (((tickAnim - 23) / 14) * (-10.66008-(-6.51122)));
            yy = -0.14808 + (((tickAnim - 23) / 14) * (-0.46274-(-0.14808)));
            zz = -0.78618 + (((tickAnim - 23) / 14) * (-2.45683-(-0.78618)));
        }
        else if (tickAnim >= 37 && tickAnim < 58) {
            xx = -10.66008 + (((tickAnim - 37) / 21) * (-7.90769-(-10.66008)));
            yy = -0.46274 + (((tickAnim - 37) / 21) * (-0.28581-(-0.46274)));
            zz = -2.45683 + (((tickAnim - 37) / 21) * (-1.51745-(-2.45683)));
        }
        else if (tickAnim >= 58 && tickAnim < 70) {
            xx = -7.90769 + (((tickAnim - 58) / 12) * (-9.52682-(-7.90769)));
            yy = -0.28581 + (((tickAnim - 58) / 12) * (0.18699-(-0.28581)));
            zz = -1.51745 + (((tickAnim - 58) / 12) * (0.86249-(-1.51745)));
        }
        else if (tickAnim >= 70 && tickAnim < 74) {
            xx = -9.52682 + (((tickAnim - 70) / 4) * (-11.39986-(-9.52682)));
            yy = 0.18699 + (((tickAnim - 70) / 4) * (0.34459-(0.18699)));
            zz = 0.86249 + (((tickAnim - 70) / 4) * (1.6558-(0.86249)));
        }
        else if (tickAnim >= 74 && tickAnim < 91) {
            xx = -11.39986 + (((tickAnim - 74) / 17) * (-10-(-11.39986)));
            yy = 0.34459 + (((tickAnim - 74) / 17) * (0-(0.34459)));
            zz = 1.6558 + (((tickAnim - 74) / 17) * (0-(1.6558)));
        }
        else if (tickAnim >= 91 && tickAnim < 94) {
            xx = -10 + (((tickAnim - 91) / 3) * (0-(-10)));
            yy = 0 + (((tickAnim - 91) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(protophasma, protophasma.rotateAngleX + (float) Math.toRadians(xx), protophasma.rotateAngleY + (float) Math.toRadians(yy), protophasma.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (77.5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            yy = 77.5 + (((tickAnim - 2) / 5) * (62.5-(77.5)));
            zz = 0 + (((tickAnim - 2) / 5) * (-14-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            yy = 62.5 + (((tickAnim - 7) / 9) * (77.5-(62.5)));
            zz = -14 + (((tickAnim - 7) / 9) * (-14-(-14)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 16) / 10) * (0-(0)));
            yy = 77.5 + (((tickAnim - 16) / 10) * (52.5-(77.5)));
            zz = -14 + (((tickAnim - 16) / 10) * (-14-(-14)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = 52.5 + (((tickAnim - 26) / 8) * (77.5-(52.5)));
            zz = -14 + (((tickAnim - 26) / 8) * (-14-(-14)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            yy = 77.5 + (((tickAnim - 34) / 10) * (57.5-(77.5)));
            zz = -14 + (((tickAnim - 34) / 10) * (-14-(-14)));
        }
        else if (tickAnim >= 44 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 44) / 10) * (0-(0)));
            yy = 57.5 + (((tickAnim - 44) / 10) * (77.5-(57.5)));
            zz = -14 + (((tickAnim - 44) / 10) * (-14-(-14)));
        }
        else if (tickAnim >= 54 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 54) / 9) * (0-(0)));
            yy = 77.5 + (((tickAnim - 54) / 9) * (52.5-(77.5)));
            zz = -14 + (((tickAnim - 54) / 9) * (-14-(-14)));
        }
        else if (tickAnim >= 63 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 63) / 9) * (0-(0)));
            yy = 52.5 + (((tickAnim - 63) / 9) * (77.5-(52.5)));
            zz = -14 + (((tickAnim - 63) / 9) * (-14-(-14)));
        }
        else if (tickAnim >= 72 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 72) / 10) * (0-(0)));
            yy = 77.5 + (((tickAnim - 72) / 10) * (57.5-(77.5)));
            zz = -14 + (((tickAnim - 72) / 10) * (-14-(-14)));
        }
        else if (tickAnim >= 82 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 82) / 9) * (0-(0)));
            yy = 57.5 + (((tickAnim - 82) / 9) * (77.5-(57.5)));
            zz = -14 + (((tickAnim - 82) / 9) * (0-(-14)));
        }
        else if (tickAnim >= 91 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 91) / 3) * (0-(0)));
            yy = 77.5 + (((tickAnim - 91) / 3) * (0-(77.5)));
            zz = 0 + (((tickAnim - 91) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(xx), leftForewing.rotateAngleY + (float) Math.toRadians(yy), leftForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (55-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (18-(0)));
            yy = 55 + (((tickAnim - 2) / 6) * (35-(55)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 18 + (((tickAnim - 8) / 9) * (18-(18)));
            yy = 35 + (((tickAnim - 8) / 9) * (55-(35)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 18 + (((tickAnim - 17) / 9) * (18-(18)));
            yy = 55 + (((tickAnim - 17) / 9) * (25-(55)));
            zz = 0 + (((tickAnim - 17) / 9) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 18 + (((tickAnim - 26) / 9) * (18-(18)));
            yy = 25 + (((tickAnim - 26) / 9) * (55-(25)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 18 + (((tickAnim - 35) / 10) * (18-(18)));
            yy = 55 + (((tickAnim - 35) / 10) * (25-(55)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 18 + (((tickAnim - 45) / 9) * (18-(18)));
            yy = 25 + (((tickAnim - 45) / 9) * (55-(25)));
            zz = 0 + (((tickAnim - 45) / 9) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 64) {
            xx = 18 + (((tickAnim - 54) / 10) * (18-(18)));
            yy = 55 + (((tickAnim - 54) / 10) * (25-(55)));
            zz = 0 + (((tickAnim - 54) / 10) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 73) {
            xx = 18 + (((tickAnim - 64) / 9) * (18-(18)));
            yy = 25 + (((tickAnim - 64) / 9) * (55-(25)));
            zz = 0 + (((tickAnim - 64) / 9) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 82) {
            xx = 18 + (((tickAnim - 73) / 9) * (18-(18)));
            yy = 55 + (((tickAnim - 73) / 9) * (25-(55)));
            zz = 0 + (((tickAnim - 73) / 9) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 91) {
            xx = 18 + (((tickAnim - 82) / 9) * (0-(18)));
            yy = 25 + (((tickAnim - 82) / 9) * (55-(25)));
            zz = 0 + (((tickAnim - 82) / 9) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 91) / 3) * (0-(0)));
            yy = 55 + (((tickAnim - 91) / 3) * (0-(55)));
            zz = 0 + (((tickAnim - 91) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(xx), leftHindwing.rotateAngleY + (float) Math.toRadians(yy), leftHindwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-77.5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            yy = -77.5 + (((tickAnim - 2) / 5) * (-62.5-(-77.5)));
            zz = 0 + (((tickAnim - 2) / 5) * (14-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            yy = -62.5 + (((tickAnim - 7) / 9) * (-77.5-(-62.5)));
            zz = 14 + (((tickAnim - 7) / 9) * (14-(14)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 16) / 10) * (0-(0)));
            yy = -77.5 + (((tickAnim - 16) / 10) * (-52.5-(-77.5)));
            zz = 14 + (((tickAnim - 16) / 10) * (14-(14)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = -52.5 + (((tickAnim - 26) / 8) * (-77.5-(-52.5)));
            zz = 14 + (((tickAnim - 26) / 8) * (14-(14)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            yy = -77.5 + (((tickAnim - 34) / 10) * (-57.5-(-77.5)));
            zz = 14 + (((tickAnim - 34) / 10) * (14-(14)));
        }
        else if (tickAnim >= 44 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 44) / 10) * (0-(0)));
            yy = -57.5 + (((tickAnim - 44) / 10) * (-77.5-(-57.5)));
            zz = 14 + (((tickAnim - 44) / 10) * (14-(14)));
        }
        else if (tickAnim >= 54 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 54) / 9) * (0-(0)));
            yy = -77.5 + (((tickAnim - 54) / 9) * (-52.5-(-77.5)));
            zz = 14 + (((tickAnim - 54) / 9) * (14-(14)));
        }
        else if (tickAnim >= 63 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 63) / 9) * (0-(0)));
            yy = -52.5 + (((tickAnim - 63) / 9) * (-77.5-(-52.5)));
            zz = 14 + (((tickAnim - 63) / 9) * (14-(14)));
        }
        else if (tickAnim >= 72 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 72) / 10) * (0-(0)));
            yy = -77.5 + (((tickAnim - 72) / 10) * (-57.5-(-77.5)));
            zz = 14 + (((tickAnim - 72) / 10) * (14-(14)));
        }
        else if (tickAnim >= 82 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 82) / 9) * (0-(0)));
            yy = -57.5 + (((tickAnim - 82) / 9) * (-77.5-(-57.5)));
            zz = 14 + (((tickAnim - 82) / 9) * (0-(14)));
        }
        else if (tickAnim >= 91 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 91) / 3) * (0-(0)));
            yy = -77.5 + (((tickAnim - 91) / 3) * (0-(-77.5)));
            zz = 0 + (((tickAnim - 91) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForewing, rightForewing.rotateAngleX + (float) Math.toRadians(xx), rightForewing.rotateAngleY + (float) Math.toRadians(yy), rightForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-55-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (14-(0)));
            yy = -55 + (((tickAnim - 2) / 6) * (-35-(-55)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 14 + (((tickAnim - 8) / 9) * (14-(14)));
            yy = -35 + (((tickAnim - 8) / 9) * (-55-(-35)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 14 + (((tickAnim - 17) / 9) * (14-(14)));
            yy = -55 + (((tickAnim - 17) / 9) * (-25-(-55)));
            zz = 0 + (((tickAnim - 17) / 9) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 14 + (((tickAnim - 26) / 9) * (14-(14)));
            yy = -25 + (((tickAnim - 26) / 9) * (-55-(-25)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 14 + (((tickAnim - 35) / 10) * (14-(14)));
            yy = -55 + (((tickAnim - 35) / 10) * (-25-(-55)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 14 + (((tickAnim - 45) / 9) * (14-(14)));
            yy = -25 + (((tickAnim - 45) / 9) * (-55-(-25)));
            zz = 0 + (((tickAnim - 45) / 9) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 64) {
            xx = 14 + (((tickAnim - 54) / 10) * (14-(14)));
            yy = -55 + (((tickAnim - 54) / 10) * (-25-(-55)));
            zz = 0 + (((tickAnim - 54) / 10) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 73) {
            xx = 14 + (((tickAnim - 64) / 9) * (14-(14)));
            yy = -25 + (((tickAnim - 64) / 9) * (-55-(-25)));
            zz = 0 + (((tickAnim - 64) / 9) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 82) {
            xx = 14 + (((tickAnim - 73) / 9) * (14-(14)));
            yy = -55 + (((tickAnim - 73) / 9) * (-25-(-55)));
            zz = 0 + (((tickAnim - 73) / 9) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 91) {
            xx = 14 + (((tickAnim - 82) / 9) * (0-(14)));
            yy = -25 + (((tickAnim - 82) / 9) * (-55-(-25)));
            zz = 0 + (((tickAnim - 82) / 9) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 91) / 3) * (0-(0)));
            yy = -55 + (((tickAnim - 91) / 3) * (0-(-55)));
            zz = 0 + (((tickAnim - 91) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(xx), rightHindwing.rotateAngleY + (float) Math.toRadians(yy), rightHindwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 41) {
            xx = 10 + (((tickAnim - 12) / 29) * (7.5-(10)));
            yy = 0 + (((tickAnim - 12) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 29) * (2.5-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 75) {
            xx = 7.5 + (((tickAnim - 41) / 34) * (2.61-(7.5)));
            yy = 0 + (((tickAnim - 41) / 34) * (0-(0)));
            zz = 2.5 + (((tickAnim - 41) / 34) * (-1.63-(2.5)));
        }
        else if (tickAnim >= 75 && tickAnim < 94) {
            xx = 2.61 + (((tickAnim - 75) / 19) * (0-(2.61)));
            yy = 0 + (((tickAnim - 75) / 19) * (0-(0)));
            zz = -1.63 + (((tickAnim - 75) / 19) * (0-(-1.63)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 20 + (((tickAnim - 2) / 5) * (15-(20)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 15 + (((tickAnim - 7) / 10) * (13.07-(15)));
            yy = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 13.07 + (((tickAnim - 17) / 6) * (11.17-(13.07)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 11.17 + (((tickAnim - 23) / 14) * (15.44-(11.17)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 58) {
            xx = 15.44 + (((tickAnim - 37) / 21) * (12.18-(15.44)));
            yy = 0 + (((tickAnim - 37) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 21) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 70) {
            xx = 12.18 + (((tickAnim - 58) / 12) * (17.47-(12.18)));
            yy = 0 + (((tickAnim - 58) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 12) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 74) {
            xx = 17.47 + (((tickAnim - 70) / 4) * (20.44-(17.47)));
            yy = 0 + (((tickAnim - 70) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 4) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 91) {
            xx = 20.44 + (((tickAnim - 74) / 17) * (17.5-(20.44)));
            yy = 0 + (((tickAnim - 74) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 17) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 94) {
            xx = 17.5 + (((tickAnim - 91) / 3) * (0-(17.5)));
            yy = 0 + (((tickAnim - 91) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (5.51516-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.08075-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-6.02746-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 5.51516 + (((tickAnim - 2) / 5) * (5.72489-(5.51516)));
            yy = -0.08075 + (((tickAnim - 2) / 5) * (-0.0765-(-0.08075)));
            zz = -6.02746 + (((tickAnim - 2) / 5) * (-5.71023-(-6.02746)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 5.72489 + (((tickAnim - 7) / 9) * (5.51516-(5.72489)));
            yy = -0.0765 + (((tickAnim - 7) / 9) * (-0.08075-(-0.0765)));
            zz = -5.71023 + (((tickAnim - 7) / 9) * (-6.02746-(-5.71023)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
            xx = 5.51516 + (((tickAnim - 16) / 10) * (5.72489-(5.51516)));
            yy = -0.08075 + (((tickAnim - 16) / 10) * (-0.0765-(-0.08075)));
            zz = -6.02746 + (((tickAnim - 16) / 10) * (-5.71023-(-6.02746)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 5.72489 + (((tickAnim - 26) / 8) * (5.51516-(5.72489)));
            yy = -0.0765 + (((tickAnim - 26) / 8) * (-0.08075-(-0.0765)));
            zz = -5.71023 + (((tickAnim - 26) / 8) * (-6.02746-(-5.71023)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 5.51516 + (((tickAnim - 34) / 10) * (5.72489-(5.51516)));
            yy = -0.08075 + (((tickAnim - 34) / 10) * (-0.0765-(-0.08075)));
            zz = -6.02746 + (((tickAnim - 34) / 10) * (-5.71023-(-6.02746)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 5.72489 + (((tickAnim - 44) / 9) * (5.51516-(5.72489)));
            yy = -0.0765 + (((tickAnim - 44) / 9) * (-0.08075-(-0.0765)));
            zz = -5.71023 + (((tickAnim - 44) / 9) * (-6.02746-(-5.71023)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 5.51516 + (((tickAnim - 53) / 9) * (5.72489-(5.51516)));
            yy = -0.08075 + (((tickAnim - 53) / 9) * (-0.0765-(-0.08075)));
            zz = -6.02746 + (((tickAnim - 53) / 9) * (-5.71023-(-6.02746)));
        }
        else if (tickAnim >= 62 && tickAnim < 71) {
            xx = 5.72489 + (((tickAnim - 62) / 9) * (5.51516-(5.72489)));
            yy = -0.0765 + (((tickAnim - 62) / 9) * (-0.08075-(-0.0765)));
            zz = -5.71023 + (((tickAnim - 62) / 9) * (-6.02746-(-5.71023)));
        }
        else if (tickAnim >= 71 && tickAnim < 81) {
            xx = 5.51516 + (((tickAnim - 71) / 10) * (5.72489-(5.51516)));
            yy = -0.08075 + (((tickAnim - 71) / 10) * (-0.0765-(-0.08075)));
            zz = -6.02746 + (((tickAnim - 71) / 10) * (-5.71023-(-6.02746)));
        }
        else if (tickAnim >= 81 && tickAnim < 91) {
            xx = 5.72489 + (((tickAnim - 81) / 10) * (5.51516-(5.72489)));
            yy = -0.0765 + (((tickAnim - 81) / 10) * (-0.08075-(-0.0765)));
            zz = -5.71023 + (((tickAnim - 81) / 10) * (-6.02746-(-5.71023)));
        }
        else if (tickAnim >= 91 && tickAnim < 94) {
            xx = 5.51516 + (((tickAnim - 91) / 3) * (0-(5.51516)));
            yy = -0.08075 + (((tickAnim - 91) / 3) * (0-(-0.08075)));
            zz = -6.02746 + (((tickAnim - 91) / 3) * (0-(-6.02746)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 10 + (((tickAnim - 2) / 5) * (9.46797-(10)));
            yy = 0 + (((tickAnim - 2) / 5) * (0.29361-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (-2.23077-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 9.46797 + (((tickAnim - 7) / 10) * (9.53-(9.46797)));
            yy = 0.29361 + (((tickAnim - 7) / 10) * (0.26-(0.29361)));
            zz = -2.23077 + (((tickAnim - 7) / 10) * (-0.98-(-2.23077)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 9.53 + (((tickAnim - 17) / 6) * (9.57-(9.53)));
            yy = 0.26 + (((tickAnim - 17) / 6) * (0.24-(0.26)));
            zz = -0.98 + (((tickAnim - 17) / 6) * (-0.9-(-0.98)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 9.57 + (((tickAnim - 23) / 14) * (9.66-(9.57)));
            yy = 0.24 + (((tickAnim - 23) / 14) * (0.19-(0.24)));
            zz = -0.9 + (((tickAnim - 23) / 14) * (5.28-(-0.9)));
        }
        else if (tickAnim >= 37 && tickAnim < 58) {
            xx = 9.66 + (((tickAnim - 37) / 21) * (9.79-(9.66)));
            yy = 0.19 + (((tickAnim - 37) / 21) * (0.12-(0.19)));
            zz = 5.28 + (((tickAnim - 37) / 21) * (0.26-(5.28)));
        }
        else if (tickAnim >= 58 && tickAnim < 70) {
            xx = 9.79 + (((tickAnim - 58) / 12) * (9.86-(9.79)));
            yy = 0.12 + (((tickAnim - 58) / 12) * (0.08-(0.12)));
            zz = 0.26 + (((tickAnim - 58) / 12) * (-0.83-(0.26)));
        }
        else if (tickAnim >= 70 && tickAnim < 74) {
            xx = 9.86 + (((tickAnim - 70) / 4) * (9.89-(9.86)));
            yy = 0.08 + (((tickAnim - 70) / 4) * (0.07-(0.08)));
            zz = -0.83 + (((tickAnim - 70) / 4) * (0.32-(-0.83)));
        }
        else if (tickAnim >= 74 && tickAnim < 91) {
            xx = 9.89 + (((tickAnim - 74) / 17) * (10-(9.89)));
            yy = 0.07 + (((tickAnim - 74) / 17) * (0-(0.07)));
            zz = 0.32 + (((tickAnim - 74) / 17) * (0-(0.32)));
        }
        else if (tickAnim >= 91 && tickAnim < 94) {
            xx = 10 + (((tickAnim - 91) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 91) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 20 + (((tickAnim - 4) / 5) * (2.5-(20)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 2.5 + (((tickAnim - 9) / 9) * (20-(2.5)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 20 + (((tickAnim - 18) / 9) * (2.5-(20)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = 2.5 + (((tickAnim - 27) / 9) * (20-(2.5)));
            yy = 0 + (((tickAnim - 27) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 9) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 46) {
            xx = 20 + (((tickAnim - 36) / 10) * (2.5-(20)));
            yy = 0 + (((tickAnim - 36) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 10) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 2.5 + (((tickAnim - 46) / 8) * (20-(2.5)));
            yy = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 64) {
            xx = 20 + (((tickAnim - 54) / 10) * (2.5-(20)));
            yy = 0 + (((tickAnim - 54) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 10) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 73) {
            xx = 2.5 + (((tickAnim - 64) / 9) * (20-(2.5)));
            yy = 0 + (((tickAnim - 64) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 9) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 81) {
            xx = 20 + (((tickAnim - 73) / 8) * (2.5-(20)));
            yy = 0 + (((tickAnim - 73) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 8) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 91) {
            xx = 2.5 + (((tickAnim - 81) / 10) * (20-(2.5)));
            yy = 0 + (((tickAnim - 81) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 10) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 94) {
            xx = 20 + (((tickAnim - 91) / 3) * (0-(20)));
            yy = 0 + (((tickAnim - 91) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen1, abdomen1.rotateAngleX + (float) Math.toRadians(xx), abdomen1.rotateAngleY + (float) Math.toRadians(yy), abdomen1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 1 + (((tickAnim - 0) / 17) * (1.2-(1)));
            yy = 1 + (((tickAnim - 0) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 17) * (1-(1)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 1.2 + (((tickAnim - 17) / 10) * (1-(1.2)));
            yy = 1 + (((tickAnim - 17) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 17) / 10) * (1-(1)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 1 + (((tickAnim - 27) / 10) * (1.2-(1)));
            yy = 1 + (((tickAnim - 27) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 27) / 10) * (1-(1)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = 1.2 + (((tickAnim - 37) / 8) * (1-(1.2)));
            yy = 1 + (((tickAnim - 37) / 8) * (1-(1)));
            zz = 1 + (((tickAnim - 37) / 8) * (1-(1)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 1 + (((tickAnim - 45) / 6) * (1.2-(1)));
            yy = 1 + (((tickAnim - 45) / 6) * (1-(1)));
            zz = 1 + (((tickAnim - 45) / 6) * (1-(1)));
        }
        else if (tickAnim >= 51 && tickAnim < 62) {
            xx = 1.2 + (((tickAnim - 51) / 11) * (1-(1.2)));
            yy = 1 + (((tickAnim - 51) / 11) * (1-(1)));
            zz = 1 + (((tickAnim - 51) / 11) * (1-(1)));
        }
        else if (tickAnim >= 62 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 62) / 8) * (1.2-(1)));
            yy = 1 + (((tickAnim - 62) / 8) * (1-(1)));
            zz = 1 + (((tickAnim - 62) / 8) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1.2 + (((tickAnim - 70) / 10) * (1-(1.2)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 70) / 10) * (1-(1)));
        }
        else if (tickAnim >= 80 && tickAnim < 88) {
            xx = 1 + (((tickAnim - 80) / 8) * (1.2-(1)));
            yy = 1 + (((tickAnim - 80) / 8) * (1-(1)));
            zz = 1 + (((tickAnim - 80) / 8) * (1-(1)));
        }
        else if (tickAnim >= 88 && tickAnim < 94) {
            xx = 1.2 + (((tickAnim - 88) / 6) * (1-(1.2)));
            yy = 1 + (((tickAnim - 88) / 6) * (1-(1)));
            zz = 1 + (((tickAnim - 88) / 6) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.abdomen2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 20 + (((tickAnim - 2) / 5) * (15-(20)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 15 + (((tickAnim - 7) / 10) * (10.57-(15)));
            yy = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 37) {
            xx = 10.57 + (((tickAnim - 17) / 20) * (20.6-(10.57)));
            yy = 0 + (((tickAnim - 17) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 20) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 58) {
            xx = 20.6 + (((tickAnim - 37) / 21) * (15.37-(20.6)));
            yy = 0 + (((tickAnim - 37) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 21) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 70) {
            xx = 15.37 + (((tickAnim - 58) / 12) * (14.52-(15.37)));
            yy = 0 + (((tickAnim - 58) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 12) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 91) {
            xx = 14.52 + (((tickAnim - 70) / 21) * (17.5-(14.52)));
            yy = 0 + (((tickAnim - 70) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 21) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 94) {
            xx = 17.5 + (((tickAnim - 91) / 3) * (0-(17.5)));
            yy = 0 + (((tickAnim - 91) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (5.51516-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.08075-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (6.02746-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 5.51516 + (((tickAnim - 2) / 5) * (5.72489-(5.51516)));
            yy = 0.08075 + (((tickAnim - 2) / 5) * (0.0765-(0.08075)));
            zz = 6.02746 + (((tickAnim - 2) / 5) * (5.71023-(6.02746)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 5.72489 + (((tickAnim - 7) / 9) * (5.51516-(5.72489)));
            yy = 0.0765 + (((tickAnim - 7) / 9) * (0.08075-(0.0765)));
            zz = 5.71023 + (((tickAnim - 7) / 9) * (6.02746-(5.71023)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
            xx = 5.51516 + (((tickAnim - 16) / 10) * (5.72489-(5.51516)));
            yy = 0.08075 + (((tickAnim - 16) / 10) * (0.0765-(0.08075)));
            zz = 6.02746 + (((tickAnim - 16) / 10) * (5.71023-(6.02746)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 5.72489 + (((tickAnim - 26) / 8) * (5.51516-(5.72489)));
            yy = 0.0765 + (((tickAnim - 26) / 8) * (0.08075-(0.0765)));
            zz = 5.71023 + (((tickAnim - 26) / 8) * (6.02746-(5.71023)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 5.51516 + (((tickAnim - 34) / 10) * (5.72489-(5.51516)));
            yy = 0.08075 + (((tickAnim - 34) / 10) * (0.0765-(0.08075)));
            zz = 6.02746 + (((tickAnim - 34) / 10) * (5.71023-(6.02746)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 5.72489 + (((tickAnim - 44) / 9) * (5.51516-(5.72489)));
            yy = 0.0765 + (((tickAnim - 44) / 9) * (0.08075-(0.0765)));
            zz = 5.71023 + (((tickAnim - 44) / 9) * (6.02746-(5.71023)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 5.51516 + (((tickAnim - 53) / 9) * (5.72489-(5.51516)));
            yy = 0.08075 + (((tickAnim - 53) / 9) * (0.0765-(0.08075)));
            zz = 6.02746 + (((tickAnim - 53) / 9) * (5.71023-(6.02746)));
        }
        else if (tickAnim >= 62 && tickAnim < 71) {
            xx = 5.72489 + (((tickAnim - 62) / 9) * (5.51516-(5.72489)));
            yy = 0.0765 + (((tickAnim - 62) / 9) * (0.08075-(0.0765)));
            zz = 5.71023 + (((tickAnim - 62) / 9) * (6.02746-(5.71023)));
        }
        else if (tickAnim >= 71 && tickAnim < 81) {
            xx = 5.51516 + (((tickAnim - 71) / 10) * (5.72489-(5.51516)));
            yy = 0.08075 + (((tickAnim - 71) / 10) * (0.0765-(0.08075)));
            zz = 6.02746 + (((tickAnim - 71) / 10) * (5.71023-(6.02746)));
        }
        else if (tickAnim >= 81 && tickAnim < 91) {
            xx = 5.72489 + (((tickAnim - 81) / 10) * (5.51516-(5.72489)));
            yy = 0.0765 + (((tickAnim - 81) / 10) * (0.08075-(0.0765)));
            zz = 5.71023 + (((tickAnim - 81) / 10) * (6.02746-(5.71023)));
        }
        else if (tickAnim >= 91 && tickAnim < 94) {
            xx = 5.51516 + (((tickAnim - 91) / 3) * (0-(5.51516)));
            yy = 0.08075 + (((tickAnim - 91) / 3) * (0-(0.08075)));
            zz = 6.02746 + (((tickAnim - 91) / 3) * (0-(6.02746)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 10 + (((tickAnim - 2) / 5) * (9.46797-(10)));
            yy = 0 + (((tickAnim - 2) / 5) * (-0.29361-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (2.23077-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 9.46797 + (((tickAnim - 7) / 10) * (9.52877-(9.46797)));
            yy = -0.29361 + (((tickAnim - 7) / 10) * (-0.26005-(-0.29361)));
            zz = 2.23077 + (((tickAnim - 7) / 10) * (1.97583-(2.23077)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 9.52877 + (((tickAnim - 17) / 6) * (9.56379-(9.52877)));
            yy = -0.26005 + (((tickAnim - 17) / 6) * (-0.40388-(-0.26005)));
            zz = 1.97583 + (((tickAnim - 17) / 6) * (2.79197-(1.97583)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 9.56379 + (((tickAnim - 23) / 14) * (9.65545-(9.56379)));
            yy = -0.40388 + (((tickAnim - 23) / 14) * (-0.19015-(-0.40388)));
            zz = 2.79197 + (((tickAnim - 23) / 14) * (1.44469-(2.79197)));
        }
        else if (tickAnim >= 37 && tickAnim < 58) {
            xx = 9.65545 + (((tickAnim - 37) / 21) * (9.78371-(9.65545)));
            yy = -0.19015 + (((tickAnim - 37) / 21) * (-0.28741-(-0.19015)));
            zz = 1.44469 + (((tickAnim - 37) / 21) * (1.87777-(1.44469)));
        }
        else if (tickAnim >= 58 && tickAnim < 70) {
            xx = 9.78371 + (((tickAnim - 58) / 12) * (9.86-(9.78371)));
            yy = -0.28741 + (((tickAnim - 58) / 12) * (-0.18-(-0.28741)));
            zz = 1.87777 + (((tickAnim - 58) / 12) * (-0.79-(1.87777)));
        }
        else if (tickAnim >= 70 && tickAnim < 74) {
            xx = 9.86 + (((tickAnim - 70) / 4) * (9.89-(9.86)));
            yy = -0.18 + (((tickAnim - 70) / 4) * (-0.15-(-0.18)));
            zz = -0.79 + (((tickAnim - 70) / 4) * (-4.64-(-0.79)));
        }
        else if (tickAnim >= 74 && tickAnim < 91) {
            xx = 9.89 + (((tickAnim - 74) / 17) * (10-(9.89)));
            yy = -0.15 + (((tickAnim - 74) / 17) * (0-(-0.15)));
            zz = -4.64 + (((tickAnim - 74) / 17) * (0-(-4.64)));
        }
        else if (tickAnim >= 91 && tickAnim < 94) {
            xx = 10 + (((tickAnim - 91) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 91) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProtophasma entity = (EntityPrehistoricFloraProtophasma) entitylivingbaseIn;
        int animCycle = 16;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(protophasma, protophasma.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430*3-60*2))*5), protophasma.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430*2-60))*4), protophasma.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430-60*2))*3));
        this.protophasma.rotationPointX = this.protophasma.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430-60))*0.7);
        this.protophasma.rotationPointY = this.protophasma.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430*3))*0.3);
        this.protophasma.rotationPointZ = this.protophasma.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430*2+60))*0.4);



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -53.97756 + (((tickAnim - 0) / 1) * (21.54589-(-53.97756)));
            yy = 72.56921 + (((tickAnim - 0) / 1) * (73.71734-(72.56921)));
            zz = -71.40161 + (((tickAnim - 0) / 1) * (5.38234-(-71.40161)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 21.54589 + (((tickAnim - 1) / 1) * (16.29009-(21.54589)));
            yy = 73.71734 + (((tickAnim - 1) / 1) * (72.20257-(73.71734)));
            zz = 5.38234 + (((tickAnim - 1) / 1) * (59.65212-(5.38234)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 16.29009 + (((tickAnim - 2) / 1) * (-41.62207-(16.29009)));
            yy = 72.20257 + (((tickAnim - 2) / 1) * (84.60673-(72.20257)));
            zz = 59.65212 + (((tickAnim - 2) / 1) * (-3.32609-(59.65212)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -41.62207 + (((tickAnim - 3) / 0) * (-53.97756-(-41.62207)));
            yy = 84.60673 + (((tickAnim - 3) / 0) * (72.56921-(84.60673)));
            zz = -3.32609 + (((tickAnim - 3) / 0) * (-71.40161-(-3.32609)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -53.97756 + (((tickAnim - 3) / 1) * (21.54589-(-53.97756)));
            yy = 72.56921 + (((tickAnim - 3) / 1) * (73.71734-(72.56921)));
            zz = -71.40161 + (((tickAnim - 3) / 1) * (5.38234-(-71.40161)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 21.54589 + (((tickAnim - 4) / 1) * (16.29009-(21.54589)));
            yy = 73.71734 + (((tickAnim - 4) / 1) * (72.20257-(73.71734)));
            zz = 5.38234 + (((tickAnim - 4) / 1) * (59.65212-(5.38234)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 16.29009 + (((tickAnim - 5) / 1) * (-41.62207-(16.29009)));
            yy = 72.20257 + (((tickAnim - 5) / 1) * (84.60673-(72.20257)));
            zz = 59.65212 + (((tickAnim - 5) / 1) * (-3.32609-(59.65212)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -41.62207 + (((tickAnim - 6) / 1) * (-53.97756-(-41.62207)));
            yy = 84.60673 + (((tickAnim - 6) / 1) * (72.56921-(84.60673)));
            zz = -3.32609 + (((tickAnim - 6) / 1) * (-71.40161-(-3.32609)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -53.97756 + (((tickAnim - 7) / 1) * (21.54589-(-53.97756)));
            yy = 72.56921 + (((tickAnim - 7) / 1) * (73.71734-(72.56921)));
            zz = -71.40161 + (((tickAnim - 7) / 1) * (5.38234-(-71.40161)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 21.54589 + (((tickAnim - 8) / 0) * (16.29009-(21.54589)));
            yy = 73.71734 + (((tickAnim - 8) / 0) * (72.20257-(73.71734)));
            zz = 5.38234 + (((tickAnim - 8) / 0) * (59.65212-(5.38234)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 16.29009 + (((tickAnim - 8) / 1) * (-41.62207-(16.29009)));
            yy = 72.20257 + (((tickAnim - 8) / 1) * (84.60673-(72.20257)));
            zz = 59.65212 + (((tickAnim - 8) / 1) * (-3.32609-(59.65212)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -41.62207 + (((tickAnim - 9) / 1) * (-53.97756-(-41.62207)));
            yy = 84.60673 + (((tickAnim - 9) / 1) * (72.56921-(84.60673)));
            zz = -3.32609 + (((tickAnim - 9) / 1) * (-71.40161-(-3.32609)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -53.97756 + (((tickAnim - 10) / 1) * (21.54589-(-53.97756)));
            yy = 72.56921 + (((tickAnim - 10) / 1) * (73.71734-(72.56921)));
            zz = -71.40161 + (((tickAnim - 10) / 1) * (5.38234-(-71.40161)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 21.54589 + (((tickAnim - 11) / 1) * (16.29009-(21.54589)));
            yy = 73.71734 + (((tickAnim - 11) / 1) * (72.20257-(73.71734)));
            zz = 5.38234 + (((tickAnim - 11) / 1) * (59.65212-(5.38234)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 16.29009 + (((tickAnim - 12) / 1) * (-41.62207-(16.29009)));
            yy = 72.20257 + (((tickAnim - 12) / 1) * (84.60673-(72.20257)));
            zz = 59.65212 + (((tickAnim - 12) / 1) * (-3.32609-(59.65212)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -41.62207 + (((tickAnim - 13) / 0) * (-53.97756-(-41.62207)));
            yy = 84.60673 + (((tickAnim - 13) / 0) * (72.56921-(84.60673)));
            zz = -3.32609 + (((tickAnim - 13) / 0) * (-71.40161-(-3.32609)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -53.97756 + (((tickAnim - 13) / 1) * (21.54589-(-53.97756)));
            yy = 72.56921 + (((tickAnim - 13) / 1) * (73.71734-(72.56921)));
            zz = -71.40161 + (((tickAnim - 13) / 1) * (5.38234-(-71.40161)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 21.54589 + (((tickAnim - 14) / 1) * (16.29009-(21.54589)));
            yy = 73.71734 + (((tickAnim - 14) / 1) * (72.20257-(73.71734)));
            zz = 5.38234 + (((tickAnim - 14) / 1) * (59.65212-(5.38234)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 16.29009 + (((tickAnim - 15) / 1) * (-41.62207-(16.29009)));
            yy = 72.20257 + (((tickAnim - 15) / 1) * (84.60673-(72.20257)));
            zz = 59.65212 + (((tickAnim - 15) / 1) * (-3.32609-(59.65212)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -41.62207 + (((tickAnim - 16) / 1) * (-53.97756-(-41.62207)));
            yy = 84.60673 + (((tickAnim - 16) / 1) * (72.56921-(84.60673)));
            zz = -3.32609 + (((tickAnim - 16) / 1) * (-71.40161-(-3.32609)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(xx), leftForewing.rotateAngleY + (float) Math.toRadians(yy), leftForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -50.01455 + (((tickAnim - 0) / 1) * (-6.30008-(-50.01455)));
            yy = 55.11548 + (((tickAnim - 0) / 1) * (54.01278-(55.11548)));
            zz = -41.99965 + (((tickAnim - 0) / 1) * (6.72643-(-41.99965)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -6.30008 + (((tickAnim - 1) / 1) * (2.41439-(-6.30008)));
            yy = 54.01278 + (((tickAnim - 1) / 1) * (52.91009-(54.01278)));
            zz = 6.72643 + (((tickAnim - 1) / 1) * (55.45252-(6.72643)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.41439 + (((tickAnim - 2) / 1) * (-46.30008-(2.41439)));
            yy = 52.91009 + (((tickAnim - 2) / 1) * (54.01278-(52.91009)));
            zz = 55.45252 + (((tickAnim - 2) / 1) * (6.72643-(55.45252)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -46.30008 + (((tickAnim - 3) / 0) * (-50.01455-(-46.30008)));
            yy = 54.01278 + (((tickAnim - 3) / 0) * (55.11548-(54.01278)));
            zz = 6.72643 + (((tickAnim - 3) / 0) * (-41.99965-(6.72643)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -50.01455 + (((tickAnim - 3) / 1) * (-6.30008-(-50.01455)));
            yy = 55.11548 + (((tickAnim - 3) / 1) * (54.01278-(55.11548)));
            zz = -41.99965 + (((tickAnim - 3) / 1) * (6.72643-(-41.99965)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -6.30008 + (((tickAnim - 4) / 1) * (2.41439-(-6.30008)));
            yy = 54.01278 + (((tickAnim - 4) / 1) * (52.91009-(54.01278)));
            zz = 6.72643 + (((tickAnim - 4) / 1) * (55.45252-(6.72643)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 2.41439 + (((tickAnim - 5) / 1) * (-46.30008-(2.41439)));
            yy = 52.91009 + (((tickAnim - 5) / 1) * (54.01278-(52.91009)));
            zz = 55.45252 + (((tickAnim - 5) / 1) * (6.72643-(55.45252)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -46.30008 + (((tickAnim - 6) / 1) * (-50.01455-(-46.30008)));
            yy = 54.01278 + (((tickAnim - 6) / 1) * (55.11548-(54.01278)));
            zz = 6.72643 + (((tickAnim - 6) / 1) * (-41.99965-(6.72643)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -50.01455 + (((tickAnim - 7) / 1) * (-6.30008-(-50.01455)));
            yy = 55.11548 + (((tickAnim - 7) / 1) * (54.01278-(55.11548)));
            zz = -41.99965 + (((tickAnim - 7) / 1) * (6.72643-(-41.99965)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -6.30008 + (((tickAnim - 8) / 0) * (2.41439-(-6.30008)));
            yy = 54.01278 + (((tickAnim - 8) / 0) * (52.91009-(54.01278)));
            zz = 6.72643 + (((tickAnim - 8) / 0) * (55.45252-(6.72643)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 2.41439 + (((tickAnim - 8) / 1) * (-46.30008-(2.41439)));
            yy = 52.91009 + (((tickAnim - 8) / 1) * (54.01278-(52.91009)));
            zz = 55.45252 + (((tickAnim - 8) / 1) * (6.72643-(55.45252)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -46.30008 + (((tickAnim - 9) / 1) * (-50.01455-(-46.30008)));
            yy = 54.01278 + (((tickAnim - 9) / 1) * (55.11548-(54.01278)));
            zz = 6.72643 + (((tickAnim - 9) / 1) * (-41.99965-(6.72643)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -50.01455 + (((tickAnim - 10) / 1) * (-6.30008-(-50.01455)));
            yy = 55.11548 + (((tickAnim - 10) / 1) * (54.01278-(55.11548)));
            zz = -41.99965 + (((tickAnim - 10) / 1) * (6.72643-(-41.99965)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -6.30008 + (((tickAnim - 11) / 1) * (2.41439-(-6.30008)));
            yy = 54.01278 + (((tickAnim - 11) / 1) * (52.91009-(54.01278)));
            zz = 6.72643 + (((tickAnim - 11) / 1) * (55.45252-(6.72643)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 2.41439 + (((tickAnim - 12) / 1) * (-46.30008-(2.41439)));
            yy = 52.91009 + (((tickAnim - 12) / 1) * (54.01278-(52.91009)));
            zz = 55.45252 + (((tickAnim - 12) / 1) * (6.72643-(55.45252)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -46.30008 + (((tickAnim - 13) / 0) * (-50.01455-(-46.30008)));
            yy = 54.01278 + (((tickAnim - 13) / 0) * (55.11548-(54.01278)));
            zz = 6.72643 + (((tickAnim - 13) / 0) * (-41.99965-(6.72643)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -50.01455 + (((tickAnim - 13) / 1) * (-6.30008-(-50.01455)));
            yy = 55.11548 + (((tickAnim - 13) / 1) * (54.01278-(55.11548)));
            zz = -41.99965 + (((tickAnim - 13) / 1) * (6.72643-(-41.99965)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -6.30008 + (((tickAnim - 14) / 1) * (2.41439-(-6.30008)));
            yy = 54.01278 + (((tickAnim - 14) / 1) * (52.91009-(54.01278)));
            zz = 6.72643 + (((tickAnim - 14) / 1) * (55.45252-(6.72643)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 2.41439 + (((tickAnim - 15) / 1) * (-46.30008-(2.41439)));
            yy = 52.91009 + (((tickAnim - 15) / 1) * (54.01278-(52.91009)));
            zz = 55.45252 + (((tickAnim - 15) / 1) * (6.72643-(55.45252)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -46.30008 + (((tickAnim - 16) / 1) * (-50.01455-(-46.30008)));
            yy = 54.01278 + (((tickAnim - 16) / 1) * (55.11548-(54.01278)));
            zz = 6.72643 + (((tickAnim - 16) / 1) * (-41.99965-(6.72643)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(xx), leftHindwing.rotateAngleY + (float) Math.toRadians(yy), leftHindwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -53.97756 + (((tickAnim - 0) / 1) * (21.54589-(-53.97756)));
            yy = -72.56921 + (((tickAnim - 0) / 1) * (-73.71734-(-72.56921)));
            zz = 71.40161 + (((tickAnim - 0) / 1) * (-5.38234-(71.40161)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 21.54589 + (((tickAnim - 1) / 1) * (16.29009-(21.54589)));
            yy = -73.71734 + (((tickAnim - 1) / 1) * (-72.20257-(-73.71734)));
            zz = -5.38234 + (((tickAnim - 1) / 1) * (-59.65212-(-5.38234)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 16.29009 + (((tickAnim - 2) / 1) * (-41.62207-(16.29009)));
            yy = -72.20257 + (((tickAnim - 2) / 1) * (-84.60673-(-72.20257)));
            zz = -59.65212 + (((tickAnim - 2) / 1) * (3.32609-(-59.65212)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -41.62207 + (((tickAnim - 3) / 0) * (-53.97756-(-41.62207)));
            yy = -84.60673 + (((tickAnim - 3) / 0) * (-72.56921-(-84.60673)));
            zz = 3.32609 + (((tickAnim - 3) / 0) * (71.40161-(3.32609)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -53.97756 + (((tickAnim - 3) / 1) * (21.54589-(-53.97756)));
            yy = -72.56921 + (((tickAnim - 3) / 1) * (-73.71734-(-72.56921)));
            zz = 71.40161 + (((tickAnim - 3) / 1) * (-5.38234-(71.40161)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 21.54589 + (((tickAnim - 4) / 1) * (16.29009-(21.54589)));
            yy = -73.71734 + (((tickAnim - 4) / 1) * (-72.20257-(-73.71734)));
            zz = -5.38234 + (((tickAnim - 4) / 1) * (-59.65212-(-5.38234)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 16.29009 + (((tickAnim - 5) / 1) * (-41.62207-(16.29009)));
            yy = -72.20257 + (((tickAnim - 5) / 1) * (-84.60673-(-72.20257)));
            zz = -59.65212 + (((tickAnim - 5) / 1) * (3.32609-(-59.65212)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -41.62207 + (((tickAnim - 6) / 1) * (-53.97756-(-41.62207)));
            yy = -84.60673 + (((tickAnim - 6) / 1) * (-72.56921-(-84.60673)));
            zz = 3.32609 + (((tickAnim - 6) / 1) * (71.40161-(3.32609)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -53.97756 + (((tickAnim - 7) / 1) * (21.54589-(-53.97756)));
            yy = -72.56921 + (((tickAnim - 7) / 1) * (-73.71734-(-72.56921)));
            zz = 71.40161 + (((tickAnim - 7) / 1) * (-5.38234-(71.40161)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 21.54589 + (((tickAnim - 8) / 0) * (16.29009-(21.54589)));
            yy = -73.71734 + (((tickAnim - 8) / 0) * (-72.20257-(-73.71734)));
            zz = -5.38234 + (((tickAnim - 8) / 0) * (-59.65212-(-5.38234)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 16.29009 + (((tickAnim - 8) / 1) * (-41.62207-(16.29009)));
            yy = -72.20257 + (((tickAnim - 8) / 1) * (-84.60673-(-72.20257)));
            zz = -59.65212 + (((tickAnim - 8) / 1) * (3.32609-(-59.65212)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -41.62207 + (((tickAnim - 9) / 1) * (-53.97756-(-41.62207)));
            yy = -84.60673 + (((tickAnim - 9) / 1) * (-72.56921-(-84.60673)));
            zz = 3.32609 + (((tickAnim - 9) / 1) * (71.40161-(3.32609)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -53.97756 + (((tickAnim - 10) / 1) * (21.54589-(-53.97756)));
            yy = -72.56921 + (((tickAnim - 10) / 1) * (-73.71734-(-72.56921)));
            zz = 71.40161 + (((tickAnim - 10) / 1) * (-5.38234-(71.40161)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 21.54589 + (((tickAnim - 11) / 1) * (16.29009-(21.54589)));
            yy = -73.71734 + (((tickAnim - 11) / 1) * (-72.20257-(-73.71734)));
            zz = -5.38234 + (((tickAnim - 11) / 1) * (-59.65212-(-5.38234)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 16.29009 + (((tickAnim - 12) / 1) * (-41.62207-(16.29009)));
            yy = -72.20257 + (((tickAnim - 12) / 1) * (-84.60673-(-72.20257)));
            zz = -59.65212 + (((tickAnim - 12) / 1) * (3.32609-(-59.65212)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -41.62207 + (((tickAnim - 13) / 0) * (-53.97756-(-41.62207)));
            yy = -84.60673 + (((tickAnim - 13) / 0) * (-72.56921-(-84.60673)));
            zz = 3.32609 + (((tickAnim - 13) / 0) * (71.40161-(3.32609)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -53.97756 + (((tickAnim - 13) / 1) * (21.54589-(-53.97756)));
            yy = -72.56921 + (((tickAnim - 13) / 1) * (-73.71734-(-72.56921)));
            zz = 71.40161 + (((tickAnim - 13) / 1) * (-5.38234-(71.40161)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 21.54589 + (((tickAnim - 14) / 1) * (16.29009-(21.54589)));
            yy = -73.71734 + (((tickAnim - 14) / 1) * (-72.20257-(-73.71734)));
            zz = -5.38234 + (((tickAnim - 14) / 1) * (-59.65212-(-5.38234)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 16.29009 + (((tickAnim - 15) / 1) * (-41.62207-(16.29009)));
            yy = -72.20257 + (((tickAnim - 15) / 1) * (-84.60673-(-72.20257)));
            zz = -59.65212 + (((tickAnim - 15) / 1) * (3.32609-(-59.65212)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -41.62207 + (((tickAnim - 16) / 1) * (-53.97756-(-41.62207)));
            yy = -84.60673 + (((tickAnim - 16) / 1) * (-72.56921-(-84.60673)));
            zz = 3.32609 + (((tickAnim - 16) / 1) * (71.40161-(3.32609)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForewing, rightForewing.rotateAngleX + (float) Math.toRadians(xx), rightForewing.rotateAngleY + (float) Math.toRadians(yy), rightForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -50.01455 + (((tickAnim - 0) / 1) * (-6.30008-(-50.01455)));
            yy = -55.11548 + (((tickAnim - 0) / 1) * (-54.01278-(-55.11548)));
            zz = 41.99965 + (((tickAnim - 0) / 1) * (-6.72643-(41.99965)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -6.30008 + (((tickAnim - 1) / 1) * (2.41439-(-6.30008)));
            yy = -54.01278 + (((tickAnim - 1) / 1) * (-52.91009-(-54.01278)));
            zz = -6.72643 + (((tickAnim - 1) / 1) * (-55.45252-(-6.72643)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.41439 + (((tickAnim - 2) / 1) * (-46.30008-(2.41439)));
            yy = -52.91009 + (((tickAnim - 2) / 1) * (-54.01278-(-52.91009)));
            zz = -55.45252 + (((tickAnim - 2) / 1) * (-6.72643-(-55.45252)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -46.30008 + (((tickAnim - 3) / 0) * (-50.01455-(-46.30008)));
            yy = -54.01278 + (((tickAnim - 3) / 0) * (-55.11548-(-54.01278)));
            zz = -6.72643 + (((tickAnim - 3) / 0) * (41.99965-(-6.72643)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -50.01455 + (((tickAnim - 3) / 1) * (-6.30008-(-50.01455)));
            yy = -55.11548 + (((tickAnim - 3) / 1) * (-54.01278-(-55.11548)));
            zz = 41.99965 + (((tickAnim - 3) / 1) * (-6.72643-(41.99965)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -6.30008 + (((tickAnim - 4) / 1) * (2.41439-(-6.30008)));
            yy = -54.01278 + (((tickAnim - 4) / 1) * (-52.91009-(-54.01278)));
            zz = -6.72643 + (((tickAnim - 4) / 1) * (-55.45252-(-6.72643)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 2.41439 + (((tickAnim - 5) / 1) * (-46.30008-(2.41439)));
            yy = -52.91009 + (((tickAnim - 5) / 1) * (-54.01278-(-52.91009)));
            zz = -55.45252 + (((tickAnim - 5) / 1) * (-6.72643-(-55.45252)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -46.30008 + (((tickAnim - 6) / 1) * (-50.01455-(-46.30008)));
            yy = -54.01278 + (((tickAnim - 6) / 1) * (-55.11548-(-54.01278)));
            zz = -6.72643 + (((tickAnim - 6) / 1) * (41.99965-(-6.72643)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -50.01455 + (((tickAnim - 7) / 1) * (-6.30008-(-50.01455)));
            yy = -55.11548 + (((tickAnim - 7) / 1) * (-54.01278-(-55.11548)));
            zz = 41.99965 + (((tickAnim - 7) / 1) * (-6.72643-(41.99965)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -6.30008 + (((tickAnim - 8) / 0) * (2.41439-(-6.30008)));
            yy = -54.01278 + (((tickAnim - 8) / 0) * (-52.91009-(-54.01278)));
            zz = -6.72643 + (((tickAnim - 8) / 0) * (-55.45252-(-6.72643)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 2.41439 + (((tickAnim - 8) / 1) * (-46.30008-(2.41439)));
            yy = -52.91009 + (((tickAnim - 8) / 1) * (-54.01278-(-52.91009)));
            zz = -55.45252 + (((tickAnim - 8) / 1) * (-6.72643-(-55.45252)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -46.30008 + (((tickAnim - 9) / 1) * (-50.01455-(-46.30008)));
            yy = -54.01278 + (((tickAnim - 9) / 1) * (-55.11548-(-54.01278)));
            zz = -6.72643 + (((tickAnim - 9) / 1) * (41.99965-(-6.72643)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -50.01455 + (((tickAnim - 10) / 1) * (-6.30008-(-50.01455)));
            yy = -55.11548 + (((tickAnim - 10) / 1) * (-54.01278-(-55.11548)));
            zz = 41.99965 + (((tickAnim - 10) / 1) * (-6.72643-(41.99965)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -6.30008 + (((tickAnim - 11) / 1) * (2.41439-(-6.30008)));
            yy = -54.01278 + (((tickAnim - 11) / 1) * (-52.91009-(-54.01278)));
            zz = -6.72643 + (((tickAnim - 11) / 1) * (-55.45252-(-6.72643)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 2.41439 + (((tickAnim - 12) / 1) * (-46.30008-(2.41439)));
            yy = -52.91009 + (((tickAnim - 12) / 1) * (-54.01278-(-52.91009)));
            zz = -55.45252 + (((tickAnim - 12) / 1) * (-6.72643-(-55.45252)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -46.30008 + (((tickAnim - 13) / 0) * (-50.01455-(-46.30008)));
            yy = -54.01278 + (((tickAnim - 13) / 0) * (-55.11548-(-54.01278)));
            zz = -6.72643 + (((tickAnim - 13) / 0) * (41.99965-(-6.72643)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -50.01455 + (((tickAnim - 13) / 1) * (-6.30008-(-50.01455)));
            yy = -55.11548 + (((tickAnim - 13) / 1) * (-54.01278-(-55.11548)));
            zz = 41.99965 + (((tickAnim - 13) / 1) * (-6.72643-(41.99965)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -6.30008 + (((tickAnim - 14) / 1) * (2.41439-(-6.30008)));
            yy = -54.01278 + (((tickAnim - 14) / 1) * (-52.91009-(-54.01278)));
            zz = -6.72643 + (((tickAnim - 14) / 1) * (-55.45252-(-6.72643)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 2.41439 + (((tickAnim - 15) / 1) * (-46.30008-(2.41439)));
            yy = -52.91009 + (((tickAnim - 15) / 1) * (-54.01278-(-52.91009)));
            zz = -55.45252 + (((tickAnim - 15) / 1) * (-6.72643-(-55.45252)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -46.30008 + (((tickAnim - 16) / 1) * (-50.01455-(-46.30008)));
            yy = -54.01278 + (((tickAnim - 16) / 1) * (-55.11548-(-54.01278)));
            zz = -6.72643 + (((tickAnim - 16) / 1) * (41.99965-(-6.72643)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(xx), rightHindwing.rotateAngleY + (float) Math.toRadians(yy), rightHindwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430*4-60*2))*5), rightAntenna.rotateAngleY + (float) Math.toRadians(0), rightAntenna.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430*4-60))*5), leftAntenna.rotateAngleY + (float) Math.toRadians(0), leftAntenna.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(-35+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430*4+60))*10), rightLeg1.rotateAngleY + (float) Math.toRadians(-10), rightLeg1.rotateAngleZ + (float) Math.toRadians(5));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-15-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430*2-60*3))*10), rightLeg2.rotateAngleY + (float) Math.toRadians(27.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430*2-60))*5), rightLeg2.rotateAngleZ + (float) Math.toRadians(-30));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(28.49476), rightLeg3.rotateAngleY + (float) Math.toRadians(41.92528), rightLeg3.rotateAngleZ + (float) Math.toRadians(3.59345));
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(-0.25);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(0);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(0);


        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(-35+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430*4+60*2))*10), leftLeg1.rotateAngleY + (float) Math.toRadians(10), leftLeg1.rotateAngleZ + (float) Math.toRadians(-5));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-15-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430*2-60*2))*10), leftLeg2.rotateAngleY + (float) Math.toRadians(-27.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430*2))*5), leftLeg2.rotateAngleZ + (float) Math.toRadians(30));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(28.49476), leftLeg3.rotateAngleY + (float) Math.toRadians(-41.92528), leftLeg3.rotateAngleZ + (float) Math.toRadians(-3.59345));
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(0.25);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(0);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(0);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProtophasma entity = (EntityPrehistoricFloraProtophasma) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(protophasma, protophasma.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*7))*2), protophasma.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), protophasma.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*4-60*3))*4));
        this.protophasma.rotationPointX = this.protophasma.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*0.4);
        this.protophasma.rotationPointY = this.protophasma.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*8))*0.1);
        this.protophasma.rotationPointZ = this.protophasma.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3+60))*0.1);


        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*10-60))*10), rightAntenna.rotateAngleY + (float) Math.toRadians(0), rightAntenna.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*6-60))*20));


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*10))*10), leftAntenna.rotateAngleY + (float) Math.toRadians(0), leftAntenna.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*6))*20));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (25-(0)));
            yy = -22.5 + (((tickAnim - 0) / 5) * (20-(-22.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (17.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 5) / 3) * (10-(25)));
            yy = 20 + (((tickAnim - 5) / 3) * (2.5-(20)));
            zz = 17.5 + (((tickAnim - 5) / 3) * (37.5-(17.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 8) / 2) * (0-(10)));
            yy = 2.5 + (((tickAnim - 8) / 2) * (-22.5-(2.5)));
            zz = 37.5 + (((tickAnim - 8) / 2) * (0-(37.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (25-(0)));
            yy = -22.5 + (((tickAnim - 10) / 5) * (20-(-22.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (17.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 25 + (((tickAnim - 15) / 3) * (10-(25)));
            yy = 20 + (((tickAnim - 15) / 3) * (2.5-(20)));
            zz = 17.5 + (((tickAnim - 15) / 3) * (37.5-(17.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 18) / 2) * (0-(10)));
            yy = 2.5 + (((tickAnim - 18) / 2) * (-22.5-(2.5)));
            zz = 37.5 + (((tickAnim - 18) / 2) * (0-(37.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (25-(0)));
            yy = -22.5 + (((tickAnim - 20) / 5) * (20-(-22.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (17.5-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 25 + (((tickAnim - 25) / 3) * (10-(25)));
            yy = 20 + (((tickAnim - 25) / 3) * (2.5-(20)));
            zz = 17.5 + (((tickAnim - 25) / 3) * (37.5-(17.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 28) / 2) * (0-(10)));
            yy = 2.5 + (((tickAnim - 28) / 2) * (-22.5-(2.5)));
            zz = 37.5 + (((tickAnim - 28) / 2) * (0-(37.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (25-(0)));
            yy = -22.5 + (((tickAnim - 30) / 5) * (20-(-22.5)));
            zz = 0 + (((tickAnim - 30) / 5) * (17.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 25 + (((tickAnim - 35) / 3) * (10-(25)));
            yy = 20 + (((tickAnim - 35) / 3) * (2.5-(20)));
            zz = 17.5 + (((tickAnim - 35) / 3) * (37.5-(17.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 38) / 2) * (0-(10)));
            yy = 2.5 + (((tickAnim - 38) / 2) * (-22.5-(2.5)));
            zz = 37.5 + (((tickAnim - 38) / 2) * (0-(37.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.75 + (((tickAnim - 5) / 5) * (0-(0.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0.75-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.75 + (((tickAnim - 15) / 5) * (0-(0.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0.75-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0.75 + (((tickAnim - 25) / 5) * (0-(0.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0.75-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.75 + (((tickAnim - 35) / 5) * (0-(0.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 28.33 + (((tickAnim - 0) / 1) * (30-(28.33)));
            yy = 13.75 + (((tickAnim - 0) / 1) * (20-(13.75)));
            zz = -27.5 + (((tickAnim - 0) / 1) * (-30-(-27.5)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 30 + (((tickAnim - 1) / 2) * (14.83333-(30)));
            yy = 20 + (((tickAnim - 1) / 2) * (-12.934-(20)));
            zz = -30 + (((tickAnim - 1) / 2) * (9.01303-(-30)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 14.83333 + (((tickAnim - 3) / 3) * (20-(14.83333)));
            yy = -12.934 + (((tickAnim - 3) / 3) * (-17.5-(-12.934)));
            zz = 9.01303 + (((tickAnim - 3) / 3) * (-15-(9.01303)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 20 + (((tickAnim - 6) / 5) * (30-(20)));
            yy = -17.5 + (((tickAnim - 6) / 5) * (20-(-17.5)));
            zz = -15 + (((tickAnim - 6) / 5) * (-30-(-15)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 30 + (((tickAnim - 11) / 2) * (14.83333-(30)));
            yy = 20 + (((tickAnim - 11) / 2) * (-12.934-(20)));
            zz = -30 + (((tickAnim - 11) / 2) * (9.01303-(-30)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 14.83333 + (((tickAnim - 13) / 3) * (20-(14.83333)));
            yy = -12.934 + (((tickAnim - 13) / 3) * (-17.5-(-12.934)));
            zz = 9.01303 + (((tickAnim - 13) / 3) * (-15-(9.01303)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 20 + (((tickAnim - 16) / 5) * (30-(20)));
            yy = -17.5 + (((tickAnim - 16) / 5) * (20-(-17.5)));
            zz = -15 + (((tickAnim - 16) / 5) * (-30-(-15)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 30 + (((tickAnim - 21) / 2) * (14.83333-(30)));
            yy = 20 + (((tickAnim - 21) / 2) * (-12.934-(20)));
            zz = -30 + (((tickAnim - 21) / 2) * (9.01303-(-30)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 14.83333 + (((tickAnim - 23) / 3) * (20-(14.83333)));
            yy = -12.934 + (((tickAnim - 23) / 3) * (-17.5-(-12.934)));
            zz = 9.01303 + (((tickAnim - 23) / 3) * (-15-(9.01303)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 20 + (((tickAnim - 26) / 5) * (30-(20)));
            yy = -17.5 + (((tickAnim - 26) / 5) * (20-(-17.5)));
            zz = -15 + (((tickAnim - 26) / 5) * (-30-(-15)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 30 + (((tickAnim - 31) / 2) * (14.83333-(30)));
            yy = 20 + (((tickAnim - 31) / 2) * (-12.934-(20)));
            zz = -30 + (((tickAnim - 31) / 2) * (9.01303-(-30)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 14.83333 + (((tickAnim - 33) / 3) * (20-(14.83333)));
            yy = -12.934 + (((tickAnim - 33) / 3) * (-17.5-(-12.934)));
            zz = 9.01303 + (((tickAnim - 33) / 3) * (-15-(9.01303)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 20 + (((tickAnim - 36) / 4) * (28.33-(20)));
            yy = -17.5 + (((tickAnim - 36) / 4) * (13.75-(-17.5)));
            zz = -15 + (((tickAnim - 36) / 4) * (-27.5-(-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 20 + (((tickAnim - 0) / 2) * (15-(20)));
            yy = -12.5 + (((tickAnim - 0) / 2) * (-22.5-(-12.5)));
            zz = -3.33 + (((tickAnim - 0) / 2) * (-10-(-3.33)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 15 + (((tickAnim - 2) / 5) * (12.5-(15)));
            yy = -22.5 + (((tickAnim - 2) / 5) * (17.5-(-22.5)));
            zz = -10 + (((tickAnim - 2) / 5) * (-15-(-10)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 12.5 + (((tickAnim - 7) / 2) * (22.5-(12.5)));
            yy = 17.5 + (((tickAnim - 7) / 2) * (-7.5-(17.5)));
            zz = -15 + (((tickAnim - 7) / 2) * (0-(-15)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 22.5 + (((tickAnim - 9) / 3) * (15-(22.5)));
            yy = -7.5 + (((tickAnim - 9) / 3) * (-22.5-(-7.5)));
            zz = 0 + (((tickAnim - 9) / 3) * (-10-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 15 + (((tickAnim - 12) / 5) * (12.5-(15)));
            yy = -22.5 + (((tickAnim - 12) / 5) * (17.5-(-22.5)));
            zz = -10 + (((tickAnim - 12) / 5) * (-15-(-10)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 12.5 + (((tickAnim - 17) / 2) * (22.5-(12.5)));
            yy = 17.5 + (((tickAnim - 17) / 2) * (-7.5-(17.5)));
            zz = -15 + (((tickAnim - 17) / 2) * (0-(-15)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 22.5 + (((tickAnim - 19) / 3) * (15-(22.5)));
            yy = -7.5 + (((tickAnim - 19) / 3) * (-22.5-(-7.5)));
            zz = 0 + (((tickAnim - 19) / 3) * (-10-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 15 + (((tickAnim - 22) / 5) * (12.5-(15)));
            yy = -22.5 + (((tickAnim - 22) / 5) * (17.5-(-22.5)));
            zz = -10 + (((tickAnim - 22) / 5) * (-15-(-10)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 12.5 + (((tickAnim - 27) / 2) * (22.5-(12.5)));
            yy = 17.5 + (((tickAnim - 27) / 2) * (-7.5-(17.5)));
            zz = -15 + (((tickAnim - 27) / 2) * (0-(-15)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 22.5 + (((tickAnim - 29) / 3) * (15-(22.5)));
            yy = -7.5 + (((tickAnim - 29) / 3) * (-22.5-(-7.5)));
            zz = 0 + (((tickAnim - 29) / 3) * (-10-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 15 + (((tickAnim - 32) / 5) * (12.5-(15)));
            yy = -22.5 + (((tickAnim - 32) / 5) * (17.5-(-22.5)));
            zz = -10 + (((tickAnim - 32) / 5) * (-15-(-10)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 12.5 + (((tickAnim - 37) / 2) * (22.5-(12.5)));
            yy = 17.5 + (((tickAnim - 37) / 2) * (-7.5-(17.5)));
            zz = -15 + (((tickAnim - 37) / 2) * (0-(-15)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 22.5 + (((tickAnim - 39) / 1) * (20-(22.5)));
            yy = -7.5 + (((tickAnim - 39) / 1) * (-12.5-(-7.5)));
            zz = 0 + (((tickAnim - 39) / 1) * (-3.33-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.8 + (((tickAnim - 0) / 2) * (1.5-(0.8)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 1.5 + (((tickAnim - 2) / 5) * (-0.6-(1.5)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -0.6 + (((tickAnim - 7) / 5) * (1.5-(-0.6)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 1.5 + (((tickAnim - 12) / 5) * (-0.6-(1.5)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -0.6 + (((tickAnim - 17) / 5) * (1.5-(-0.6)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 1.5 + (((tickAnim - 22) / 5) * (-0.6-(1.5)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -0.6 + (((tickAnim - 27) / 5) * (1.5-(-0.6)));
            yy = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 1.5 + (((tickAnim - 32) / 5) * (-0.6-(1.5)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -0.6 + (((tickAnim - 37) / 3) * (0.8-(-0.6)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 20 + (((tickAnim - 0) / 2) * (10-(20)));
            yy = -14.17 + (((tickAnim - 0) / 2) * (-2.5-(-14.17)));
            zz = -24.17 + (((tickAnim - 0) / 2) * (-37.5-(-24.17)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 10 + (((tickAnim - 2) / 2) * (0-(10)));
            yy = -2.5 + (((tickAnim - 2) / 2) * (22.5-(-2.5)));
            zz = -37.5 + (((tickAnim - 2) / 2) * (0-(-37.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (25-(0)));
            yy = 22.5 + (((tickAnim - 4) / 5) * (-20-(22.5)));
            zz = 0 + (((tickAnim - 4) / 5) * (-17.5-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 25 + (((tickAnim - 9) / 3) * (10-(25)));
            yy = -20 + (((tickAnim - 9) / 3) * (-2.5-(-20)));
            zz = -17.5 + (((tickAnim - 9) / 3) * (-37.5-(-17.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 10 + (((tickAnim - 12) / 2) * (0-(10)));
            yy = -2.5 + (((tickAnim - 12) / 2) * (22.5-(-2.5)));
            zz = -37.5 + (((tickAnim - 12) / 2) * (0-(-37.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (25-(0)));
            yy = 22.5 + (((tickAnim - 14) / 5) * (-20-(22.5)));
            zz = 0 + (((tickAnim - 14) / 5) * (-17.5-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 25 + (((tickAnim - 19) / 3) * (10-(25)));
            yy = -20 + (((tickAnim - 19) / 3) * (-2.5-(-20)));
            zz = -17.5 + (((tickAnim - 19) / 3) * (-37.5-(-17.5)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 10 + (((tickAnim - 22) / 2) * (0-(10)));
            yy = -2.5 + (((tickAnim - 22) / 2) * (22.5-(-2.5)));
            zz = -37.5 + (((tickAnim - 22) / 2) * (0-(-37.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (25-(0)));
            yy = 22.5 + (((tickAnim - 24) / 5) * (-20-(22.5)));
            zz = 0 + (((tickAnim - 24) / 5) * (-17.5-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 25 + (((tickAnim - 29) / 3) * (10-(25)));
            yy = -20 + (((tickAnim - 29) / 3) * (-2.5-(-20)));
            zz = -17.5 + (((tickAnim - 29) / 3) * (-37.5-(-17.5)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 10 + (((tickAnim - 32) / 2) * (0-(10)));
            yy = -2.5 + (((tickAnim - 32) / 2) * (22.5-(-2.5)));
            zz = -37.5 + (((tickAnim - 32) / 2) * (0-(-37.5)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 34) / 5) * (25-(0)));
            yy = 22.5 + (((tickAnim - 34) / 5) * (-20-(22.5)));
            zz = 0 + (((tickAnim - 34) / 5) * (-17.5-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 25 + (((tickAnim - 39) / 1) * (20-(25)));
            yy = -20 + (((tickAnim - 39) / 1) * (-14.17-(-20)));
            zz = -17.5 + (((tickAnim - 39) / 1) * (-24.17-(-17.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.63 + (((tickAnim - 0) / 4) * (0-(-0.63)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -0.75 + (((tickAnim - 9) / 5) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -0.75 + (((tickAnim - 19) / 5) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = -0.75 + (((tickAnim - 29) / 5) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 34) / 5) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = -0.75 + (((tickAnim - 39) / 1) * (-0.63-(-0.75)));
            yy = 0 + (((tickAnim - 39) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 20 + (((tickAnim - 0) / 5) * (30-(20)));
            yy = 17.5 + (((tickAnim - 0) / 5) * (-20-(17.5)));
            zz = 15 + (((tickAnim - 0) / 5) * (30-(15)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 30 + (((tickAnim - 5) / 3) * (14.83333-(30)));
            yy = -20 + (((tickAnim - 5) / 3) * (12.934-(-20)));
            zz = 30 + (((tickAnim - 5) / 3) * (-9.01303-(30)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 14.83333 + (((tickAnim - 8) / 2) * (20-(14.83333)));
            yy = 12.934 + (((tickAnim - 8) / 2) * (17.5-(12.934)));
            zz = -9.01303 + (((tickAnim - 8) / 2) * (15-(-9.01303)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 20 + (((tickAnim - 10) / 5) * (30-(20)));
            yy = 17.5 + (((tickAnim - 10) / 5) * (-20-(17.5)));
            zz = 15 + (((tickAnim - 10) / 5) * (30-(15)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 30 + (((tickAnim - 15) / 3) * (14.83333-(30)));
            yy = -20 + (((tickAnim - 15) / 3) * (12.934-(-20)));
            zz = 30 + (((tickAnim - 15) / 3) * (-9.01303-(30)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 14.83333 + (((tickAnim - 18) / 2) * (20-(14.83333)));
            yy = 12.934 + (((tickAnim - 18) / 2) * (17.5-(12.934)));
            zz = -9.01303 + (((tickAnim - 18) / 2) * (15-(-9.01303)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 20 + (((tickAnim - 20) / 5) * (30-(20)));
            yy = 17.5 + (((tickAnim - 20) / 5) * (-20-(17.5)));
            zz = 15 + (((tickAnim - 20) / 5) * (30-(15)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 30 + (((tickAnim - 25) / 3) * (14.83333-(30)));
            yy = -20 + (((tickAnim - 25) / 3) * (12.934-(-20)));
            zz = 30 + (((tickAnim - 25) / 3) * (-9.01303-(30)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 14.83333 + (((tickAnim - 28) / 2) * (20-(14.83333)));
            yy = 12.934 + (((tickAnim - 28) / 2) * (17.5-(12.934)));
            zz = -9.01303 + (((tickAnim - 28) / 2) * (15-(-9.01303)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 20 + (((tickAnim - 30) / 5) * (30-(20)));
            yy = 17.5 + (((tickAnim - 30) / 5) * (-20-(17.5)));
            zz = 15 + (((tickAnim - 30) / 5) * (30-(15)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 30 + (((tickAnim - 35) / 3) * (14.83333-(30)));
            yy = -20 + (((tickAnim - 35) / 3) * (12.934-(-20)));
            zz = 30 + (((tickAnim - 35) / 3) * (-9.01303-(30)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 14.83333 + (((tickAnim - 38) / 2) * (20-(14.83333)));
            yy = 12.934 + (((tickAnim - 38) / 2) * (17.5-(12.934)));
            zz = -9.01303 + (((tickAnim - 38) / 2) * (15-(-9.01303)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 12.92 + (((tickAnim - 0) / 1) * (12.5-(12.92)));
            yy = -10.83 + (((tickAnim - 0) / 1) * (-17.5-(-10.83)));
            zz = 14.17 + (((tickAnim - 0) / 1) * (15-(14.17)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 12.5 + (((tickAnim - 1) / 2) * (22.5-(12.5)));
            yy = -17.5 + (((tickAnim - 1) / 2) * (7.5-(-17.5)));
            zz = 15 + (((tickAnim - 1) / 2) * (0-(15)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 22.5 + (((tickAnim - 3) / 3) * (15-(22.5)));
            yy = 7.5 + (((tickAnim - 3) / 3) * (22.5-(7.5)));
            zz = 0 + (((tickAnim - 3) / 3) * (10-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 15 + (((tickAnim - 6) / 5) * (12.5-(15)));
            yy = 22.5 + (((tickAnim - 6) / 5) * (-17.5-(22.5)));
            zz = 10 + (((tickAnim - 6) / 5) * (15-(10)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 12.5 + (((tickAnim - 11) / 2) * (22.5-(12.5)));
            yy = -17.5 + (((tickAnim - 11) / 2) * (7.5-(-17.5)));
            zz = 15 + (((tickAnim - 11) / 2) * (0-(15)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 22.5 + (((tickAnim - 13) / 3) * (15-(22.5)));
            yy = 7.5 + (((tickAnim - 13) / 3) * (22.5-(7.5)));
            zz = 0 + (((tickAnim - 13) / 3) * (10-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 15 + (((tickAnim - 16) / 5) * (12.5-(15)));
            yy = 22.5 + (((tickAnim - 16) / 5) * (-17.5-(22.5)));
            zz = 10 + (((tickAnim - 16) / 5) * (15-(10)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 12.5 + (((tickAnim - 21) / 2) * (22.5-(12.5)));
            yy = -17.5 + (((tickAnim - 21) / 2) * (7.5-(-17.5)));
            zz = 15 + (((tickAnim - 21) / 2) * (0-(15)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 22.5 + (((tickAnim - 23) / 3) * (15-(22.5)));
            yy = 7.5 + (((tickAnim - 23) / 3) * (22.5-(7.5)));
            zz = 0 + (((tickAnim - 23) / 3) * (10-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 15 + (((tickAnim - 26) / 5) * (12.5-(15)));
            yy = 22.5 + (((tickAnim - 26) / 5) * (-17.5-(22.5)));
            zz = 10 + (((tickAnim - 26) / 5) * (15-(10)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 12.5 + (((tickAnim - 31) / 2) * (22.5-(12.5)));
            yy = -17.5 + (((tickAnim - 31) / 2) * (7.5-(-17.5)));
            zz = 15 + (((tickAnim - 31) / 2) * (0-(15)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 22.5 + (((tickAnim - 33) / 3) * (15-(22.5)));
            yy = 7.5 + (((tickAnim - 33) / 3) * (22.5-(7.5)));
            zz = 0 + (((tickAnim - 33) / 3) * (10-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 15 + (((tickAnim - 36) / 4) * (12.92-(15)));
            yy = 22.5 + (((tickAnim - 36) / 4) * (-10.83-(22.5)));
            zz = 10 + (((tickAnim - 36) / 4) * (14.17-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0.25 + (((tickAnim - 0) / 1) * (0.6-(0.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 0.6 + (((tickAnim - 1) / 5) * (-1.5-(0.6)));
            yy = 0 + (((tickAnim - 1) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 5) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -1.5 + (((tickAnim - 6) / 5) * (0.6-(-1.5)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0.6 + (((tickAnim - 11) / 5) * (-1.5-(0.6)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -1.5 + (((tickAnim - 16) / 5) * (0.6-(-1.5)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0.6 + (((tickAnim - 21) / 5) * (-1.5-(0.6)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = -1.5 + (((tickAnim - 26) / 5) * (0.6-(-1.5)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 0.6 + (((tickAnim - 31) / 5) * (-1.5-(0.6)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -1.5 + (((tickAnim - 36) / 4) * (0.25-(-1.5)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
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
    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isMoving) {
        EntityPrehistoricFloraProtophasma entity = (EntityPrehistoricFloraProtophasma) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        if (!isMoving) {
            tickAnim = 0;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(protophasma, protophasma.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*7))*2), protophasma.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), protophasma.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*4-60*3))*4));
        this.protophasma.rotationPointX = this.protophasma.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*0.4);
        this.protophasma.rotationPointY = this.protophasma.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*8))*0.1);
        this.protophasma.rotationPointZ = this.protophasma.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3+60))*0.1);


        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*10-60))*10), rightAntenna.rotateAngleY + (float) Math.toRadians(0), rightAntenna.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*6-60))*20));


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*10))*10), leftAntenna.rotateAngleY + (float) Math.toRadians(0), leftAntenna.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*6))*20));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (25-(0)));
            yy = -22.5 + (((tickAnim - 0) / 5) * (20-(-22.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (17.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 5) / 3) * (10-(25)));
            yy = 20 + (((tickAnim - 5) / 3) * (2.5-(20)));
            zz = 17.5 + (((tickAnim - 5) / 3) * (37.5-(17.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 8) / 2) * (0-(10)));
            yy = 2.5 + (((tickAnim - 8) / 2) * (-22.5-(2.5)));
            zz = 37.5 + (((tickAnim - 8) / 2) * (0-(37.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (25-(0)));
            yy = -22.5 + (((tickAnim - 10) / 5) * (20-(-22.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (17.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 25 + (((tickAnim - 15) / 3) * (10-(25)));
            yy = 20 + (((tickAnim - 15) / 3) * (2.5-(20)));
            zz = 17.5 + (((tickAnim - 15) / 3) * (37.5-(17.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 18) / 2) * (0-(10)));
            yy = 2.5 + (((tickAnim - 18) / 2) * (-22.5-(2.5)));
            zz = 37.5 + (((tickAnim - 18) / 2) * (0-(37.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (25-(0)));
            yy = -22.5 + (((tickAnim - 20) / 5) * (20-(-22.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (17.5-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 25 + (((tickAnim - 25) / 3) * (10-(25)));
            yy = 20 + (((tickAnim - 25) / 3) * (2.5-(20)));
            zz = 17.5 + (((tickAnim - 25) / 3) * (37.5-(17.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 28) / 2) * (0-(10)));
            yy = 2.5 + (((tickAnim - 28) / 2) * (-22.5-(2.5)));
            zz = 37.5 + (((tickAnim - 28) / 2) * (0-(37.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (25-(0)));
            yy = -22.5 + (((tickAnim - 30) / 5) * (20-(-22.5)));
            zz = 0 + (((tickAnim - 30) / 5) * (17.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 25 + (((tickAnim - 35) / 3) * (10-(25)));
            yy = 20 + (((tickAnim - 35) / 3) * (2.5-(20)));
            zz = 17.5 + (((tickAnim - 35) / 3) * (37.5-(17.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 38) / 2) * (0-(10)));
            yy = 2.5 + (((tickAnim - 38) / 2) * (-22.5-(2.5)));
            zz = 37.5 + (((tickAnim - 38) / 2) * (0-(37.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.75 + (((tickAnim - 5) / 5) * (0-(0.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0.75-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.75 + (((tickAnim - 15) / 5) * (0-(0.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0.75-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0.75 + (((tickAnim - 25) / 5) * (0-(0.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0.75-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.75 + (((tickAnim - 35) / 5) * (0-(0.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 28.33 + (((tickAnim - 0) / 1) * (30-(28.33)));
            yy = 13.75 + (((tickAnim - 0) / 1) * (20-(13.75)));
            zz = -27.5 + (((tickAnim - 0) / 1) * (-30-(-27.5)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 30 + (((tickAnim - 1) / 2) * (14.83333-(30)));
            yy = 20 + (((tickAnim - 1) / 2) * (-12.934-(20)));
            zz = -30 + (((tickAnim - 1) / 2) * (9.01303-(-30)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 14.83333 + (((tickAnim - 3) / 3) * (20-(14.83333)));
            yy = -12.934 + (((tickAnim - 3) / 3) * (-17.5-(-12.934)));
            zz = 9.01303 + (((tickAnim - 3) / 3) * (-15-(9.01303)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 20 + (((tickAnim - 6) / 5) * (30-(20)));
            yy = -17.5 + (((tickAnim - 6) / 5) * (20-(-17.5)));
            zz = -15 + (((tickAnim - 6) / 5) * (-30-(-15)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 30 + (((tickAnim - 11) / 2) * (14.83333-(30)));
            yy = 20 + (((tickAnim - 11) / 2) * (-12.934-(20)));
            zz = -30 + (((tickAnim - 11) / 2) * (9.01303-(-30)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 14.83333 + (((tickAnim - 13) / 3) * (20-(14.83333)));
            yy = -12.934 + (((tickAnim - 13) / 3) * (-17.5-(-12.934)));
            zz = 9.01303 + (((tickAnim - 13) / 3) * (-15-(9.01303)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 20 + (((tickAnim - 16) / 5) * (30-(20)));
            yy = -17.5 + (((tickAnim - 16) / 5) * (20-(-17.5)));
            zz = -15 + (((tickAnim - 16) / 5) * (-30-(-15)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 30 + (((tickAnim - 21) / 2) * (14.83333-(30)));
            yy = 20 + (((tickAnim - 21) / 2) * (-12.934-(20)));
            zz = -30 + (((tickAnim - 21) / 2) * (9.01303-(-30)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 14.83333 + (((tickAnim - 23) / 3) * (20-(14.83333)));
            yy = -12.934 + (((tickAnim - 23) / 3) * (-17.5-(-12.934)));
            zz = 9.01303 + (((tickAnim - 23) / 3) * (-15-(9.01303)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 20 + (((tickAnim - 26) / 5) * (30-(20)));
            yy = -17.5 + (((tickAnim - 26) / 5) * (20-(-17.5)));
            zz = -15 + (((tickAnim - 26) / 5) * (-30-(-15)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 30 + (((tickAnim - 31) / 2) * (14.83333-(30)));
            yy = 20 + (((tickAnim - 31) / 2) * (-12.934-(20)));
            zz = -30 + (((tickAnim - 31) / 2) * (9.01303-(-30)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 14.83333 + (((tickAnim - 33) / 3) * (20-(14.83333)));
            yy = -12.934 + (((tickAnim - 33) / 3) * (-17.5-(-12.934)));
            zz = 9.01303 + (((tickAnim - 33) / 3) * (-15-(9.01303)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 20 + (((tickAnim - 36) / 4) * (28.33-(20)));
            yy = -17.5 + (((tickAnim - 36) / 4) * (13.75-(-17.5)));
            zz = -15 + (((tickAnim - 36) / 4) * (-27.5-(-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 20 + (((tickAnim - 0) / 2) * (15-(20)));
            yy = -12.5 + (((tickAnim - 0) / 2) * (-22.5-(-12.5)));
            zz = -3.33 + (((tickAnim - 0) / 2) * (-10-(-3.33)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 15 + (((tickAnim - 2) / 5) * (12.5-(15)));
            yy = -22.5 + (((tickAnim - 2) / 5) * (17.5-(-22.5)));
            zz = -10 + (((tickAnim - 2) / 5) * (-15-(-10)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 12.5 + (((tickAnim - 7) / 2) * (22.5-(12.5)));
            yy = 17.5 + (((tickAnim - 7) / 2) * (-7.5-(17.5)));
            zz = -15 + (((tickAnim - 7) / 2) * (0-(-15)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 22.5 + (((tickAnim - 9) / 3) * (15-(22.5)));
            yy = -7.5 + (((tickAnim - 9) / 3) * (-22.5-(-7.5)));
            zz = 0 + (((tickAnim - 9) / 3) * (-10-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 15 + (((tickAnim - 12) / 5) * (12.5-(15)));
            yy = -22.5 + (((tickAnim - 12) / 5) * (17.5-(-22.5)));
            zz = -10 + (((tickAnim - 12) / 5) * (-15-(-10)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 12.5 + (((tickAnim - 17) / 2) * (22.5-(12.5)));
            yy = 17.5 + (((tickAnim - 17) / 2) * (-7.5-(17.5)));
            zz = -15 + (((tickAnim - 17) / 2) * (0-(-15)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 22.5 + (((tickAnim - 19) / 3) * (15-(22.5)));
            yy = -7.5 + (((tickAnim - 19) / 3) * (-22.5-(-7.5)));
            zz = 0 + (((tickAnim - 19) / 3) * (-10-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 15 + (((tickAnim - 22) / 5) * (12.5-(15)));
            yy = -22.5 + (((tickAnim - 22) / 5) * (17.5-(-22.5)));
            zz = -10 + (((tickAnim - 22) / 5) * (-15-(-10)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 12.5 + (((tickAnim - 27) / 2) * (22.5-(12.5)));
            yy = 17.5 + (((tickAnim - 27) / 2) * (-7.5-(17.5)));
            zz = -15 + (((tickAnim - 27) / 2) * (0-(-15)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 22.5 + (((tickAnim - 29) / 3) * (15-(22.5)));
            yy = -7.5 + (((tickAnim - 29) / 3) * (-22.5-(-7.5)));
            zz = 0 + (((tickAnim - 29) / 3) * (-10-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 15 + (((tickAnim - 32) / 5) * (12.5-(15)));
            yy = -22.5 + (((tickAnim - 32) / 5) * (17.5-(-22.5)));
            zz = -10 + (((tickAnim - 32) / 5) * (-15-(-10)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 12.5 + (((tickAnim - 37) / 2) * (22.5-(12.5)));
            yy = 17.5 + (((tickAnim - 37) / 2) * (-7.5-(17.5)));
            zz = -15 + (((tickAnim - 37) / 2) * (0-(-15)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 22.5 + (((tickAnim - 39) / 1) * (20-(22.5)));
            yy = -7.5 + (((tickAnim - 39) / 1) * (-12.5-(-7.5)));
            zz = 0 + (((tickAnim - 39) / 1) * (-3.33-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.8 + (((tickAnim - 0) / 2) * (1.5-(0.8)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 1.5 + (((tickAnim - 2) / 5) * (-0.6-(1.5)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -0.6 + (((tickAnim - 7) / 5) * (1.5-(-0.6)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 1.5 + (((tickAnim - 12) / 5) * (-0.6-(1.5)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -0.6 + (((tickAnim - 17) / 5) * (1.5-(-0.6)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 1.5 + (((tickAnim - 22) / 5) * (-0.6-(1.5)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -0.6 + (((tickAnim - 27) / 5) * (1.5-(-0.6)));
            yy = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 1.5 + (((tickAnim - 32) / 5) * (-0.6-(1.5)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -0.6 + (((tickAnim - 37) / 3) * (0.8-(-0.6)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 20 + (((tickAnim - 0) / 2) * (10-(20)));
            yy = -14.17 + (((tickAnim - 0) / 2) * (-2.5-(-14.17)));
            zz = -24.17 + (((tickAnim - 0) / 2) * (-37.5-(-24.17)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 10 + (((tickAnim - 2) / 2) * (0-(10)));
            yy = -2.5 + (((tickAnim - 2) / 2) * (22.5-(-2.5)));
            zz = -37.5 + (((tickAnim - 2) / 2) * (0-(-37.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (25-(0)));
            yy = 22.5 + (((tickAnim - 4) / 5) * (-20-(22.5)));
            zz = 0 + (((tickAnim - 4) / 5) * (-17.5-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 25 + (((tickAnim - 9) / 3) * (10-(25)));
            yy = -20 + (((tickAnim - 9) / 3) * (-2.5-(-20)));
            zz = -17.5 + (((tickAnim - 9) / 3) * (-37.5-(-17.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 10 + (((tickAnim - 12) / 2) * (0-(10)));
            yy = -2.5 + (((tickAnim - 12) / 2) * (22.5-(-2.5)));
            zz = -37.5 + (((tickAnim - 12) / 2) * (0-(-37.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (25-(0)));
            yy = 22.5 + (((tickAnim - 14) / 5) * (-20-(22.5)));
            zz = 0 + (((tickAnim - 14) / 5) * (-17.5-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 25 + (((tickAnim - 19) / 3) * (10-(25)));
            yy = -20 + (((tickAnim - 19) / 3) * (-2.5-(-20)));
            zz = -17.5 + (((tickAnim - 19) / 3) * (-37.5-(-17.5)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 10 + (((tickAnim - 22) / 2) * (0-(10)));
            yy = -2.5 + (((tickAnim - 22) / 2) * (22.5-(-2.5)));
            zz = -37.5 + (((tickAnim - 22) / 2) * (0-(-37.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (25-(0)));
            yy = 22.5 + (((tickAnim - 24) / 5) * (-20-(22.5)));
            zz = 0 + (((tickAnim - 24) / 5) * (-17.5-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 25 + (((tickAnim - 29) / 3) * (10-(25)));
            yy = -20 + (((tickAnim - 29) / 3) * (-2.5-(-20)));
            zz = -17.5 + (((tickAnim - 29) / 3) * (-37.5-(-17.5)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 10 + (((tickAnim - 32) / 2) * (0-(10)));
            yy = -2.5 + (((tickAnim - 32) / 2) * (22.5-(-2.5)));
            zz = -37.5 + (((tickAnim - 32) / 2) * (0-(-37.5)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 34) / 5) * (25-(0)));
            yy = 22.5 + (((tickAnim - 34) / 5) * (-20-(22.5)));
            zz = 0 + (((tickAnim - 34) / 5) * (-17.5-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 25 + (((tickAnim - 39) / 1) * (20-(25)));
            yy = -20 + (((tickAnim - 39) / 1) * (-14.17-(-20)));
            zz = -17.5 + (((tickAnim - 39) / 1) * (-24.17-(-17.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.63 + (((tickAnim - 0) / 4) * (0-(-0.63)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -0.75 + (((tickAnim - 9) / 5) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -0.75 + (((tickAnim - 19) / 5) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = -0.75 + (((tickAnim - 29) / 5) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 34) / 5) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = -0.75 + (((tickAnim - 39) / 1) * (-0.63-(-0.75)));
            yy = 0 + (((tickAnim - 39) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 20 + (((tickAnim - 0) / 5) * (30-(20)));
            yy = 17.5 + (((tickAnim - 0) / 5) * (-20-(17.5)));
            zz = 15 + (((tickAnim - 0) / 5) * (30-(15)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 30 + (((tickAnim - 5) / 3) * (14.83333-(30)));
            yy = -20 + (((tickAnim - 5) / 3) * (12.934-(-20)));
            zz = 30 + (((tickAnim - 5) / 3) * (-9.01303-(30)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 14.83333 + (((tickAnim - 8) / 2) * (20-(14.83333)));
            yy = 12.934 + (((tickAnim - 8) / 2) * (17.5-(12.934)));
            zz = -9.01303 + (((tickAnim - 8) / 2) * (15-(-9.01303)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 20 + (((tickAnim - 10) / 5) * (30-(20)));
            yy = 17.5 + (((tickAnim - 10) / 5) * (-20-(17.5)));
            zz = 15 + (((tickAnim - 10) / 5) * (30-(15)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 30 + (((tickAnim - 15) / 3) * (14.83333-(30)));
            yy = -20 + (((tickAnim - 15) / 3) * (12.934-(-20)));
            zz = 30 + (((tickAnim - 15) / 3) * (-9.01303-(30)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 14.83333 + (((tickAnim - 18) / 2) * (20-(14.83333)));
            yy = 12.934 + (((tickAnim - 18) / 2) * (17.5-(12.934)));
            zz = -9.01303 + (((tickAnim - 18) / 2) * (15-(-9.01303)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 20 + (((tickAnim - 20) / 5) * (30-(20)));
            yy = 17.5 + (((tickAnim - 20) / 5) * (-20-(17.5)));
            zz = 15 + (((tickAnim - 20) / 5) * (30-(15)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 30 + (((tickAnim - 25) / 3) * (14.83333-(30)));
            yy = -20 + (((tickAnim - 25) / 3) * (12.934-(-20)));
            zz = 30 + (((tickAnim - 25) / 3) * (-9.01303-(30)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 14.83333 + (((tickAnim - 28) / 2) * (20-(14.83333)));
            yy = 12.934 + (((tickAnim - 28) / 2) * (17.5-(12.934)));
            zz = -9.01303 + (((tickAnim - 28) / 2) * (15-(-9.01303)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 20 + (((tickAnim - 30) / 5) * (30-(20)));
            yy = 17.5 + (((tickAnim - 30) / 5) * (-20-(17.5)));
            zz = 15 + (((tickAnim - 30) / 5) * (30-(15)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 30 + (((tickAnim - 35) / 3) * (14.83333-(30)));
            yy = -20 + (((tickAnim - 35) / 3) * (12.934-(-20)));
            zz = 30 + (((tickAnim - 35) / 3) * (-9.01303-(30)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 14.83333 + (((tickAnim - 38) / 2) * (20-(14.83333)));
            yy = 12.934 + (((tickAnim - 38) / 2) * (17.5-(12.934)));
            zz = -9.01303 + (((tickAnim - 38) / 2) * (15-(-9.01303)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 12.92 + (((tickAnim - 0) / 1) * (12.5-(12.92)));
            yy = -10.83 + (((tickAnim - 0) / 1) * (-17.5-(-10.83)));
            zz = 14.17 + (((tickAnim - 0) / 1) * (15-(14.17)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 12.5 + (((tickAnim - 1) / 2) * (22.5-(12.5)));
            yy = -17.5 + (((tickAnim - 1) / 2) * (7.5-(-17.5)));
            zz = 15 + (((tickAnim - 1) / 2) * (0-(15)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 22.5 + (((tickAnim - 3) / 3) * (15-(22.5)));
            yy = 7.5 + (((tickAnim - 3) / 3) * (22.5-(7.5)));
            zz = 0 + (((tickAnim - 3) / 3) * (10-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 15 + (((tickAnim - 6) / 5) * (12.5-(15)));
            yy = 22.5 + (((tickAnim - 6) / 5) * (-17.5-(22.5)));
            zz = 10 + (((tickAnim - 6) / 5) * (15-(10)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 12.5 + (((tickAnim - 11) / 2) * (22.5-(12.5)));
            yy = -17.5 + (((tickAnim - 11) / 2) * (7.5-(-17.5)));
            zz = 15 + (((tickAnim - 11) / 2) * (0-(15)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 22.5 + (((tickAnim - 13) / 3) * (15-(22.5)));
            yy = 7.5 + (((tickAnim - 13) / 3) * (22.5-(7.5)));
            zz = 0 + (((tickAnim - 13) / 3) * (10-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 15 + (((tickAnim - 16) / 5) * (12.5-(15)));
            yy = 22.5 + (((tickAnim - 16) / 5) * (-17.5-(22.5)));
            zz = 10 + (((tickAnim - 16) / 5) * (15-(10)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 12.5 + (((tickAnim - 21) / 2) * (22.5-(12.5)));
            yy = -17.5 + (((tickAnim - 21) / 2) * (7.5-(-17.5)));
            zz = 15 + (((tickAnim - 21) / 2) * (0-(15)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 22.5 + (((tickAnim - 23) / 3) * (15-(22.5)));
            yy = 7.5 + (((tickAnim - 23) / 3) * (22.5-(7.5)));
            zz = 0 + (((tickAnim - 23) / 3) * (10-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 15 + (((tickAnim - 26) / 5) * (12.5-(15)));
            yy = 22.5 + (((tickAnim - 26) / 5) * (-17.5-(22.5)));
            zz = 10 + (((tickAnim - 26) / 5) * (15-(10)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 12.5 + (((tickAnim - 31) / 2) * (22.5-(12.5)));
            yy = -17.5 + (((tickAnim - 31) / 2) * (7.5-(-17.5)));
            zz = 15 + (((tickAnim - 31) / 2) * (0-(15)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 22.5 + (((tickAnim - 33) / 3) * (15-(22.5)));
            yy = 7.5 + (((tickAnim - 33) / 3) * (22.5-(7.5)));
            zz = 0 + (((tickAnim - 33) / 3) * (10-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 15 + (((tickAnim - 36) / 4) * (12.92-(15)));
            yy = 22.5 + (((tickAnim - 36) / 4) * (-10.83-(22.5)));
            zz = 10 + (((tickAnim - 36) / 4) * (14.17-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0.25 + (((tickAnim - 0) / 1) * (0.6-(0.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 0.6 + (((tickAnim - 1) / 5) * (-1.5-(0.6)));
            yy = 0 + (((tickAnim - 1) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 5) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -1.5 + (((tickAnim - 6) / 5) * (0.6-(-1.5)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0.6 + (((tickAnim - 11) / 5) * (-1.5-(0.6)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -1.5 + (((tickAnim - 16) / 5) * (0.6-(-1.5)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0.6 + (((tickAnim - 21) / 5) * (-1.5-(0.6)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = -1.5 + (((tickAnim - 26) / 5) * (0.6-(-1.5)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 0.6 + (((tickAnim - 31) / 5) * (-1.5-(0.6)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -1.5 + (((tickAnim - 36) / 4) * (0.25-(-1.5)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
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
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
