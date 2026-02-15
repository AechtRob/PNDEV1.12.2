package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEoproscopia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelEoproscopia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightForewing;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer rightHindwing2;
    private final AdvancedModelRenderer rightHindwing3;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer leftHindwing2;
    private final AdvancedModelRenderer leftHindwing3;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg12;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg12;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg22;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg22;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg32;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg32;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer leftAntenna;

    private ModelAnimator animator;

    public ModelEoproscopia() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 19.0F, -2.0F);
        this.body.cubeList.add(new ModelBox(body, 32, 18, -0.5F, -1.1F, -1.25F, 1, 1, 2, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.4F, -0.1F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 33, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.rightForewing = new AdvancedModelRenderer(this);
        this.rightForewing.setRotationPoint(-0.5F, -1.4F, 0.4F);
        this.body.addChild(rightForewing);
        this.setRotateAngle(rightForewing, -0.1178F, 0.0F, 0.0F);
        this.rightForewing.cubeList.add(new ModelBox(rightForewing, 0, 0, 0.0F, 0.01F, -0.4F, 1, 0, 11, 0.0F, false));

        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(0.5F, -1.4F, 0.4F);
        this.body.addChild(leftForewing);
        this.setRotateAngle(leftForewing, -0.1178F, 0.0F, 0.0F);
        this.leftForewing.cubeList.add(new ModelBox(leftForewing, 0, 0, -1.0F, 0.0F, -0.4F, 1, 0, 11, 0.0F, true));

        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(-0.5F, -1.4F, 0.4F);
        this.body.addChild(rightHindwing);
        this.setRotateAngle(rightHindwing, -0.1353F, 0.0F, 0.0F);
        this.rightHindwing.cubeList.add(new ModelBox(rightHindwing, 0, 11, 0.0F, 0.0F, -0.375F, 1, 0, 11, 0.0F, false));

        this.rightHindwing2 = new AdvancedModelRenderer(this);
        this.rightHindwing2.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.rightHindwing.addChild(rightHindwing2);
        this.setRotateAngle(rightHindwing2, 0.0F, 0.0F, -3.1416F);
        this.rightHindwing2.cubeList.add(new ModelBox(rightHindwing2, 24, 10, 0.0F, -0.01F, 1.625F, 1, 0, 8, 0.0F, false));

        this.rightHindwing3 = new AdvancedModelRenderer(this);
        this.rightHindwing3.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.rightHindwing2.addChild(rightHindwing3);
        this.setRotateAngle(rightHindwing3, 0.0F, 0.0F, -3.1416F);
        this.rightHindwing3.cubeList.add(new ModelBox(rightHindwing3, 0, 33, 0.0F, -0.02F, 2.625F, 1, 0, 5, 0.0F, false));

        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(0.5F, -1.4F, 0.4F);
        this.body.addChild(leftHindwing);
        this.setRotateAngle(leftHindwing, -0.1353F, 0.0F, 0.0F);
        this.leftHindwing.cubeList.add(new ModelBox(leftHindwing, 0, 11, -1.0F, 0.0F, -0.375F, 1, 0, 11, 0.0F, true));

        this.leftHindwing2 = new AdvancedModelRenderer(this);
        this.leftHindwing2.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.leftHindwing.addChild(leftHindwing2);
        this.setRotateAngle(leftHindwing2, 0.0F, 0.0F, 3.1416F);
        this.leftHindwing2.cubeList.add(new ModelBox(leftHindwing2, 24, 10, -1.0F, -0.01F, 1.625F, 1, 0, 8, 0.0F, true));

        this.leftHindwing3 = new AdvancedModelRenderer(this);
        this.leftHindwing3.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.leftHindwing2.addChild(leftHindwing3);
        this.setRotateAngle(leftHindwing3, 0.0F, 0.0F, 3.1416F);
        this.leftHindwing3.cubeList.add(new ModelBox(leftHindwing3, 0, 33, -1.0F, -0.02F, 2.625F, 1, 0, 5, 0.0F, true));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.5F, -0.1F, -0.75F);
        this.body.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -1.4399F, 0.8727F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 34, 33, 0.0F, 0.0F, -0.5F, 0, 4, 1, 0.0F, false));

        this.rightLeg12 = new AdvancedModelRenderer(this);
        this.rightLeg12.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.rightLeg1.addChild(rightLeg12);
        this.setRotateAngle(rightLeg12, 1.1345F, 0.0F, 0.0F);
        this.rightLeg12.cubeList.add(new ModelBox(rightLeg12, 20, 33, -0.01F, 0.0F, -1.5F, 0, 5, 2, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.5F, -0.1F, -0.75F);
        this.body.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -1.4399F, -0.8727F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 34, 33, 0.0F, 0.0F, -0.5F, 0, 4, 1, 0.0F, true));

        this.leftLeg12 = new AdvancedModelRenderer(this);
        this.leftLeg12.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.leftLeg1.addChild(leftLeg12);
        this.setRotateAngle(leftLeg12, 1.1345F, 0.0F, 0.0F);
        this.leftLeg12.cubeList.add(new ModelBox(leftLeg12, 20, 33, 0.01F, 0.0F, -1.5F, 0, 5, 2, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5F, -0.1F, 0.1F);
        this.body.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.3701F, -1.2217F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 28, 36, 0.0F, 0.0F, -0.5F, 0, 4, 1, 0.0F, false));

        this.rightLeg22 = new AdvancedModelRenderer(this);
        this.rightLeg22.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.rightLeg2.addChild(rightLeg22);
        this.setRotateAngle(rightLeg22, -1.0036F, 0.0F, 0.0F);
        this.rightLeg22.cubeList.add(new ModelBox(rightLeg22, 24, 33, -0.01F, 0.0F, -0.5F, 0, 5, 2, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5F, -0.1F, 0.1F);
        this.body.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.3701F, 1.2217F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 28, 36, 0.0F, 0.0F, -0.5F, 0, 4, 1, 0.0F, true));

        this.leftLeg22 = new AdvancedModelRenderer(this);
        this.leftLeg22.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.leftLeg2.addChild(leftLeg22);
        this.setRotateAngle(leftLeg22, -1.0036F, 0.0F, 0.0F);
        this.leftLeg22.cubeList.add(new ModelBox(leftLeg22, 24, 33, 0.01F, 0.0F, -0.5F, 0, 5, 2, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.5F, -0.1F, 0.75F);
        this.body.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.1745F, -0.5236F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 24, 0, 0.0F, -0.5F, -0.5F, 0, 1, 9, 0.0F, false));

        this.rightLeg32 = new AdvancedModelRenderer(this);
        this.rightLeg32.setRotationPoint(0.0F, 0.0F, 8.5F);
        this.rightLeg3.addChild(rightLeg32);
        this.setRotateAngle(rightLeg32, -1.0908F, 0.0F, 0.0F);
        this.rightLeg32.cubeList.add(new ModelBox(rightLeg32, 22, 22, -0.01F, -1.5F, 0.0F, 0, 2, 9, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.5F, -0.1F, 0.75F);
        this.body.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.1745F, 0.5236F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 24, 0, 0.0F, -0.5F, -0.5F, 0, 1, 9, 0.0F, true));

        this.leftLeg32 = new AdvancedModelRenderer(this);
        this.leftLeg32.setRotationPoint(0.0F, 0.0F, 8.5F);
        this.leftLeg3.addChild(leftLeg32);
        this.setRotateAngle(leftLeg32, -1.0908F, 0.0F, 0.0F);
        this.leftLeg32.cubeList.add(new ModelBox(leftLeg32, 22, 22, 0.01F, -1.5F, 0.0F, 0, 2, 9, 0.0F, true));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -0.6F, 0.75F);
        this.body.addChild(abdomen);
        this.setRotateAngle(abdomen, -0.1309F, 0.0F, 0.0F);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 22, -0.5F, -0.5F, -0.2F, 1, 1, 10, 0.01F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 36, 37, 0.0F, -0.5F, 9.8F, 0, 1, 1, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.6F, -1.25F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 24, 18, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1F, -2.9F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 30, 36, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 36, 33, -0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 36, 35, -0.75F, -1.0F, -1.0F, 1, 1, 1, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 36, 35, -0.25F, -1.0F, -1.0F, 1, 1, 1, -0.01F, true));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.25F, 0.0F, -1.0F);
        this.head.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, -0.2182F, 0.2618F, 0.0F);
        this.rightAntenna.cubeList.add(new ModelBox(rightAntenna, 12, 33, 0.0F, -1.75F, -4.0F, 0, 2, 4, 0.0F, false));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.25F, 0.0F, -1.0F);
        this.head.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, -0.2182F, -0.2618F, 0.0F);
        this.leftAntenna.cubeList.add(new ModelBox(leftAntenna, 12, 33, 0.0F, -1.75F, -4.0F, 0, 2, 4, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(body, 1.0F, 0.0F, 0.0F);
        this.body.offsetY = -0.25F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        //this.body.offsetZ = -0.080F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.30F;
        this.body.offsetX = -0.05F;
        this.body.rotateAngleY = (float)Math.toRadians(210);
        this.body.rotateAngleX = (float)Math.toRadians(40);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 3.9F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraEoproscopia ee = (EntityPrehistoricFloraEoproscopia) e;
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
        EntityPrehistoricFloraEoproscopia ee = (EntityPrehistoricFloraEoproscopia) entitylivingbaseIn;

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


    }

    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEoproscopia entity = (EntityPrehistoricFloraEoproscopia) entitylivingbaseIn;
        int animCycle = 38;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 187.43262 + (((tickAnim - 0) / 2) * (142.43262-(187.43262)));
            yy = -57.07594 + (((tickAnim - 0) / 2) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 0) / 2) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 142.43262 + (((tickAnim - 2) / 1) * (187.43262-(142.43262)));
            yy = -57.07594 + (((tickAnim - 2) / 1) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 2) / 1) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 187.43262 + (((tickAnim - 3) / 2) * (142.43262-(187.43262)));
            yy = -57.07594 + (((tickAnim - 3) / 2) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 3) / 2) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 142.43262 + (((tickAnim - 5) / 1) * (187.43262-(142.43262)));
            yy = -57.07594 + (((tickAnim - 5) / 1) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 5) / 1) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 187.43262 + (((tickAnim - 6) / 2) * (142.43262-(187.43262)));
            yy = -57.07594 + (((tickAnim - 6) / 2) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 6) / 2) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 142.43262 + (((tickAnim - 8) / 2) * (187.43262-(142.43262)));
            yy = -57.07594 + (((tickAnim - 8) / 2) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 8) / 2) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 187.43262 + (((tickAnim - 10) / 1) * (142.43262-(187.43262)));
            yy = -57.07594 + (((tickAnim - 10) / 1) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 10) / 1) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 142.43262 + (((tickAnim - 11) / 2) * (187.43262-(142.43262)));
            yy = -57.07594 + (((tickAnim - 11) / 2) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 11) / 2) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 187.43262 + (((tickAnim - 13) / 1) * (142.43262-(187.43262)));
            yy = -57.07594 + (((tickAnim - 13) / 1) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 13) / 1) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 142.43262 + (((tickAnim - 14) / 2) * (187.43262-(142.43262)));
            yy = -57.07594 + (((tickAnim - 14) / 2) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 14) / 2) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 187.43262 + (((tickAnim - 16) / 2) * (142.43262-(187.43262)));
            yy = -57.07594 + (((tickAnim - 16) / 2) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 16) / 2) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 142.43262 + (((tickAnim - 18) / 1) * (187.43262-(142.43262)));
            yy = -57.07594 + (((tickAnim - 18) / 1) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 18) / 1) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 187.43262 + (((tickAnim - 19) / 2) * (142.43262-(187.43262)));
            yy = -57.07594 + (((tickAnim - 19) / 2) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 19) / 2) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 142.43262 + (((tickAnim - 21) / 1) * (187.43262-(142.43262)));
            yy = -57.07594 + (((tickAnim - 21) / 1) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 21) / 1) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 187.43262 + (((tickAnim - 22) / 2) * (142.43262-(187.43262)));
            yy = -57.07594 + (((tickAnim - 22) / 2) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 22) / 2) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 142.43262 + (((tickAnim - 24) / 2) * (187.43262-(142.43262)));
            yy = -57.07594 + (((tickAnim - 24) / 2) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 24) / 2) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 187.43262 + (((tickAnim - 26) / 1) * (142.43262-(187.43262)));
            yy = -57.07594 + (((tickAnim - 26) / 1) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 26) / 1) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 142.43262 + (((tickAnim - 27) / 2) * (187.43262-(142.43262)));
            yy = -57.07594 + (((tickAnim - 27) / 2) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 27) / 2) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 187.43262 + (((tickAnim - 29) / 1) * (142.43262-(187.43262)));
            yy = -57.07594 + (((tickAnim - 29) / 1) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 29) / 1) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 142.43262 + (((tickAnim - 30) / 2) * (187.43262-(142.43262)));
            yy = -57.07594 + (((tickAnim - 30) / 2) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 30) / 2) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 187.43262 + (((tickAnim - 32) / 2) * (142.43262-(187.43262)));
            yy = -57.07594 + (((tickAnim - 32) / 2) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 32) / 2) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 142.43262 + (((tickAnim - 34) / 1) * (187.43262-(142.43262)));
            yy = -57.07594 + (((tickAnim - 34) / 1) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 34) / 1) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 187.43262 + (((tickAnim - 35) / 2) * (142.43262-(187.43262)));
            yy = -57.07594 + (((tickAnim - 35) / 2) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 35) / 2) * (-157.8732-(-157.8732)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 142.43262 + (((tickAnim - 37) / 1) * (187.43262-(142.43262)));
            yy = -57.07594 + (((tickAnim - 37) / 1) * (-57.07594-(-57.07594)));
            zz = -157.8732 + (((tickAnim - 37) / 1) * (-157.8732-(-157.8732)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForewing, rightForewing.rotateAngleX + (float) Math.toRadians(xx), rightForewing.rotateAngleY + (float) Math.toRadians(yy), rightForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 255.47101 + (((tickAnim - 0) / 1) * (101.06955-(255.47101)));
            yy = -87.93651 + (((tickAnim - 0) / 1) * (-59.36583-(-87.93651)));
            zz = -169.25716 + (((tickAnim - 0) / 1) * (-82.55845-(-169.25716)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 101.06955 + (((tickAnim - 1) / 1) * (16.65349-(101.06955)));
            yy = -59.36583 + (((tickAnim - 1) / 1) * (-78.40294-(-59.36583)));
            zz = -82.55845 + (((tickAnim - 1) / 1) * (-57.74454-(-82.55845)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 16.65349 + (((tickAnim - 2) / 0) * (286.15521-(16.65349)));
            yy = -78.40294 + (((tickAnim - 2) / 0) * (-70.20334-(-78.40294)));
            zz = -57.74454 + (((tickAnim - 2) / 0) * (-265.8183-(-57.74454)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 286.15521 + (((tickAnim - 2) / 1) * (255.47101-(286.15521)));
            yy = -70.20334 + (((tickAnim - 2) / 1) * (-87.93651-(-70.20334)));
            zz = -265.8183 + (((tickAnim - 2) / 1) * (-169.25716-(-265.8183)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 255.47101 + (((tickAnim - 3) / 1) * (101.06955-(255.47101)));
            yy = -87.93651 + (((tickAnim - 3) / 1) * (-59.36583-(-87.93651)));
            zz = -169.25716 + (((tickAnim - 3) / 1) * (-82.55845-(-169.25716)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 101.06955 + (((tickAnim - 4) / 1) * (16.65349-(101.06955)));
            yy = -59.36583 + (((tickAnim - 4) / 1) * (-78.40294-(-59.36583)));
            zz = -82.55845 + (((tickAnim - 4) / 1) * (-57.74454-(-82.55845)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 16.65349 + (((tickAnim - 5) / 1) * (286.15521-(16.65349)));
            yy = -78.40294 + (((tickAnim - 5) / 1) * (-70.20334-(-78.40294)));
            zz = -57.74454 + (((tickAnim - 5) / 1) * (-265.8183-(-57.74454)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = 286.15521 + (((tickAnim - 6) / 0) * (255.47101-(286.15521)));
            yy = -70.20334 + (((tickAnim - 6) / 0) * (-87.93651-(-70.20334)));
            zz = -265.8183 + (((tickAnim - 6) / 0) * (-169.25716-(-265.8183)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 255.47101 + (((tickAnim - 6) / 1) * (101.06955-(255.47101)));
            yy = -87.93651 + (((tickAnim - 6) / 1) * (-59.36583-(-87.93651)));
            zz = -169.25716 + (((tickAnim - 6) / 1) * (-82.55845-(-169.25716)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 101.06955 + (((tickAnim - 7) / 1) * (16.65349-(101.06955)));
            yy = -59.36583 + (((tickAnim - 7) / 1) * (-78.40294-(-59.36583)));
            zz = -82.55845 + (((tickAnim - 7) / 1) * (-57.74454-(-82.55845)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 16.65349 + (((tickAnim - 8) / 1) * (286.15521-(16.65349)));
            yy = -78.40294 + (((tickAnim - 8) / 1) * (-70.20334-(-78.40294)));
            zz = -57.74454 + (((tickAnim - 8) / 1) * (-265.8183-(-57.74454)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 286.15521 + (((tickAnim - 9) / 1) * (255.47101-(286.15521)));
            yy = -70.20334 + (((tickAnim - 9) / 1) * (-87.93651-(-70.20334)));
            zz = -265.8183 + (((tickAnim - 9) / 1) * (-169.25716-(-265.8183)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 255.47101 + (((tickAnim - 10) / 0) * (101.06955-(255.47101)));
            yy = -87.93651 + (((tickAnim - 10) / 0) * (-59.36583-(-87.93651)));
            zz = -169.25716 + (((tickAnim - 10) / 0) * (-82.55845-(-169.25716)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 101.06955 + (((tickAnim - 10) / 1) * (16.65349-(101.06955)));
            yy = -59.36583 + (((tickAnim - 10) / 1) * (-78.40294-(-59.36583)));
            zz = -82.55845 + (((tickAnim - 10) / 1) * (-57.74454-(-82.55845)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 16.65349 + (((tickAnim - 11) / 1) * (286.15521-(16.65349)));
            yy = -78.40294 + (((tickAnim - 11) / 1) * (-70.20334-(-78.40294)));
            zz = -57.74454 + (((tickAnim - 11) / 1) * (-265.8183-(-57.74454)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 286.15521 + (((tickAnim - 12) / 1) * (255.47101-(286.15521)));
            yy = -70.20334 + (((tickAnim - 12) / 1) * (-87.93651-(-70.20334)));
            zz = -265.8183 + (((tickAnim - 12) / 1) * (-169.25716-(-265.8183)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 255.47101 + (((tickAnim - 13) / 1) * (101.06955-(255.47101)));
            yy = -87.93651 + (((tickAnim - 13) / 1) * (-59.36583-(-87.93651)));
            zz = -169.25716 + (((tickAnim - 13) / 1) * (-82.55845-(-169.25716)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 101.06955 + (((tickAnim - 14) / 0) * (16.65349-(101.06955)));
            yy = -59.36583 + (((tickAnim - 14) / 0) * (-78.40294-(-59.36583)));
            zz = -82.55845 + (((tickAnim - 14) / 0) * (-57.74454-(-82.55845)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 16.65349 + (((tickAnim - 14) / 1) * (286.15521-(16.65349)));
            yy = -78.40294 + (((tickAnim - 14) / 1) * (-70.20334-(-78.40294)));
            zz = -57.74454 + (((tickAnim - 14) / 1) * (-265.8183-(-57.74454)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 286.15521 + (((tickAnim - 15) / 1) * (255.47101-(286.15521)));
            yy = -70.20334 + (((tickAnim - 15) / 1) * (-87.93651-(-70.20334)));
            zz = -265.8183 + (((tickAnim - 15) / 1) * (-169.25716-(-265.8183)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 255.47101 + (((tickAnim - 16) / 1) * (101.06955-(255.47101)));
            yy = -87.93651 + (((tickAnim - 16) / 1) * (-59.36583-(-87.93651)));
            zz = -169.25716 + (((tickAnim - 16) / 1) * (-82.55845-(-169.25716)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 101.06955 + (((tickAnim - 17) / 1) * (16.65349-(101.06955)));
            yy = -59.36583 + (((tickAnim - 17) / 1) * (-78.40294-(-59.36583)));
            zz = -82.55845 + (((tickAnim - 17) / 1) * (-57.74454-(-82.55845)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 16.65349 + (((tickAnim - 18) / 0) * (286.15521-(16.65349)));
            yy = -78.40294 + (((tickAnim - 18) / 0) * (-70.20334-(-78.40294)));
            zz = -57.74454 + (((tickAnim - 18) / 0) * (-265.8183-(-57.74454)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 286.15521 + (((tickAnim - 18) / 1) * (255.47101-(286.15521)));
            yy = -70.20334 + (((tickAnim - 18) / 1) * (-87.93651-(-70.20334)));
            zz = -265.8183 + (((tickAnim - 18) / 1) * (-169.25716-(-265.8183)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 255.47101 + (((tickAnim - 19) / 1) * (101.06955-(255.47101)));
            yy = -87.93651 + (((tickAnim - 19) / 1) * (-59.36583-(-87.93651)));
            zz = -169.25716 + (((tickAnim - 19) / 1) * (-82.55845-(-169.25716)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 101.06955 + (((tickAnim - 20) / 1) * (16.65349-(101.06955)));
            yy = -59.36583 + (((tickAnim - 20) / 1) * (-78.40294-(-59.36583)));
            zz = -82.55845 + (((tickAnim - 20) / 1) * (-57.74454-(-82.55845)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 16.65349 + (((tickAnim - 21) / 1) * (286.15521-(16.65349)));
            yy = -78.40294 + (((tickAnim - 21) / 1) * (-70.20334-(-78.40294)));
            zz = -57.74454 + (((tickAnim - 21) / 1) * (-265.8183-(-57.74454)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = 286.15521 + (((tickAnim - 22) / 0) * (255.47101-(286.15521)));
            yy = -70.20334 + (((tickAnim - 22) / 0) * (-87.93651-(-70.20334)));
            zz = -265.8183 + (((tickAnim - 22) / 0) * (-169.25716-(-265.8183)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 255.47101 + (((tickAnim - 22) / 1) * (101.06955-(255.47101)));
            yy = -87.93651 + (((tickAnim - 22) / 1) * (-59.36583-(-87.93651)));
            zz = -169.25716 + (((tickAnim - 22) / 1) * (-82.55845-(-169.25716)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 101.06955 + (((tickAnim - 23) / 1) * (16.65349-(101.06955)));
            yy = -59.36583 + (((tickAnim - 23) / 1) * (-78.40294-(-59.36583)));
            zz = -82.55845 + (((tickAnim - 23) / 1) * (-57.74454-(-82.55845)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 16.65349 + (((tickAnim - 24) / 1) * (286.15521-(16.65349)));
            yy = -78.40294 + (((tickAnim - 24) / 1) * (-70.20334-(-78.40294)));
            zz = -57.74454 + (((tickAnim - 24) / 1) * (-265.8183-(-57.74454)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 286.15521 + (((tickAnim - 25) / 1) * (255.47101-(286.15521)));
            yy = -70.20334 + (((tickAnim - 25) / 1) * (-87.93651-(-70.20334)));
            zz = -265.8183 + (((tickAnim - 25) / 1) * (-169.25716-(-265.8183)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 255.47101 + (((tickAnim - 26) / 0) * (101.06955-(255.47101)));
            yy = -87.93651 + (((tickAnim - 26) / 0) * (-59.36583-(-87.93651)));
            zz = -169.25716 + (((tickAnim - 26) / 0) * (-82.55845-(-169.25716)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 101.06955 + (((tickAnim - 26) / 1) * (16.65349-(101.06955)));
            yy = -59.36583 + (((tickAnim - 26) / 1) * (-78.40294-(-59.36583)));
            zz = -82.55845 + (((tickAnim - 26) / 1) * (-57.74454-(-82.55845)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 16.65349 + (((tickAnim - 27) / 1) * (286.15521-(16.65349)));
            yy = -78.40294 + (((tickAnim - 27) / 1) * (-70.20334-(-78.40294)));
            zz = -57.74454 + (((tickAnim - 27) / 1) * (-265.8183-(-57.74454)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 286.15521 + (((tickAnim - 28) / 1) * (255.47101-(286.15521)));
            yy = -70.20334 + (((tickAnim - 28) / 1) * (-87.93651-(-70.20334)));
            zz = -265.8183 + (((tickAnim - 28) / 1) * (-169.25716-(-265.8183)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 255.47101 + (((tickAnim - 29) / 1) * (101.06955-(255.47101)));
            yy = -87.93651 + (((tickAnim - 29) / 1) * (-59.36583-(-87.93651)));
            zz = -169.25716 + (((tickAnim - 29) / 1) * (-82.55845-(-169.25716)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 101.06955 + (((tickAnim - 30) / 0) * (16.65349-(101.06955)));
            yy = -59.36583 + (((tickAnim - 30) / 0) * (-78.40294-(-59.36583)));
            zz = -82.55845 + (((tickAnim - 30) / 0) * (-57.74454-(-82.55845)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 16.65349 + (((tickAnim - 30) / 1) * (286.15521-(16.65349)));
            yy = -78.40294 + (((tickAnim - 30) / 1) * (-70.20334-(-78.40294)));
            zz = -57.74454 + (((tickAnim - 30) / 1) * (-265.8183-(-57.74454)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 286.15521 + (((tickAnim - 31) / 1) * (255.47101-(286.15521)));
            yy = -70.20334 + (((tickAnim - 31) / 1) * (-87.93651-(-70.20334)));
            zz = -265.8183 + (((tickAnim - 31) / 1) * (-169.25716-(-265.8183)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 255.47101 + (((tickAnim - 32) / 1) * (101.06955-(255.47101)));
            yy = -87.93651 + (((tickAnim - 32) / 1) * (-59.36583-(-87.93651)));
            zz = -169.25716 + (((tickAnim - 32) / 1) * (-82.55845-(-169.25716)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 101.06955 + (((tickAnim - 33) / 1) * (16.65349-(101.06955)));
            yy = -59.36583 + (((tickAnim - 33) / 1) * (-78.40294-(-59.36583)));
            zz = -82.55845 + (((tickAnim - 33) / 1) * (-57.74454-(-82.55845)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 16.65349 + (((tickAnim - 34) / 0) * (286.15521-(16.65349)));
            yy = -78.40294 + (((tickAnim - 34) / 0) * (-70.20334-(-78.40294)));
            zz = -57.74454 + (((tickAnim - 34) / 0) * (-265.8183-(-57.74454)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 286.15521 + (((tickAnim - 34) / 1) * (255.47101-(286.15521)));
            yy = -70.20334 + (((tickAnim - 34) / 1) * (-87.93651-(-70.20334)));
            zz = -265.8183 + (((tickAnim - 34) / 1) * (-169.25716-(-265.8183)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 255.47101 + (((tickAnim - 35) / 1) * (101.06955-(255.47101)));
            yy = -87.93651 + (((tickAnim - 35) / 1) * (-59.36583-(-87.93651)));
            zz = -169.25716 + (((tickAnim - 35) / 1) * (-82.55845-(-169.25716)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 101.06955 + (((tickAnim - 36) / 1) * (16.65349-(101.06955)));
            yy = -59.36583 + (((tickAnim - 36) / 1) * (-78.40294-(-59.36583)));
            zz = -82.55845 + (((tickAnim - 36) / 1) * (-57.74454-(-82.55845)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 16.65349 + (((tickAnim - 37) / 1) * (286.15521-(16.65349)));
            yy = -78.40294 + (((tickAnim - 37) / 1) * (-70.20334-(-78.40294)));
            zz = -57.74454 + (((tickAnim - 37) / 1) * (-265.8183-(-57.74454)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 286.15521 + (((tickAnim - 38) / 0) * (255.47101-(286.15521)));
            yy = -70.20334 + (((tickAnim - 38) / 0) * (-87.93651-(-70.20334)));
            zz = -265.8183 + (((tickAnim - 38) / 0) * (-169.25716-(-265.8183)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(xx), rightHindwing.rotateAngleY + (float) Math.toRadians(yy), rightHindwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightHindwing2, rightHindwing2.rotateAngleX + (float) Math.toRadians(0), rightHindwing2.rotateAngleY + (float) Math.toRadians(0), rightHindwing2.rotateAngleZ + (float) Math.toRadians(180));


        this.setRotateAngle(rightHindwing3, rightHindwing3.rotateAngleX + (float) Math.toRadians(0), rightHindwing3.rotateAngleY + (float) Math.toRadians(0), rightHindwing3.rotateAngleZ + (float) Math.toRadians(180));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 187.43262 + (((tickAnim - 0) / 2) * (142.43262-(187.43262)));
            yy = 57.07594 + (((tickAnim - 0) / 2) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 0) / 2) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 142.43262 + (((tickAnim - 2) / 1) * (187.43262-(142.43262)));
            yy = 57.07594 + (((tickAnim - 2) / 1) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 2) / 1) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 187.43262 + (((tickAnim - 3) / 2) * (142.43262-(187.43262)));
            yy = 57.07594 + (((tickAnim - 3) / 2) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 3) / 2) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 142.43262 + (((tickAnim - 5) / 1) * (187.43262-(142.43262)));
            yy = 57.07594 + (((tickAnim - 5) / 1) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 5) / 1) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 187.43262 + (((tickAnim - 6) / 2) * (142.43262-(187.43262)));
            yy = 57.07594 + (((tickAnim - 6) / 2) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 6) / 2) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 142.43262 + (((tickAnim - 8) / 2) * (187.43262-(142.43262)));
            yy = 57.07594 + (((tickAnim - 8) / 2) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 8) / 2) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 187.43262 + (((tickAnim - 10) / 1) * (142.43262-(187.43262)));
            yy = 57.07594 + (((tickAnim - 10) / 1) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 10) / 1) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 142.43262 + (((tickAnim - 11) / 2) * (187.43262-(142.43262)));
            yy = 57.07594 + (((tickAnim - 11) / 2) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 11) / 2) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 187.43262 + (((tickAnim - 13) / 1) * (142.43262-(187.43262)));
            yy = 57.07594 + (((tickAnim - 13) / 1) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 13) / 1) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 142.43262 + (((tickAnim - 14) / 2) * (187.43262-(142.43262)));
            yy = 57.07594 + (((tickAnim - 14) / 2) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 14) / 2) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 187.43262 + (((tickAnim - 16) / 2) * (142.43262-(187.43262)));
            yy = 57.07594 + (((tickAnim - 16) / 2) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 16) / 2) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 142.43262 + (((tickAnim - 18) / 1) * (187.43262-(142.43262)));
            yy = 57.07594 + (((tickAnim - 18) / 1) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 18) / 1) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 187.43262 + (((tickAnim - 19) / 2) * (142.43262-(187.43262)));
            yy = 57.07594 + (((tickAnim - 19) / 2) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 19) / 2) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 142.43262 + (((tickAnim - 21) / 1) * (187.43262-(142.43262)));
            yy = 57.07594 + (((tickAnim - 21) / 1) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 21) / 1) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 187.43262 + (((tickAnim - 22) / 2) * (142.43262-(187.43262)));
            yy = 57.07594 + (((tickAnim - 22) / 2) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 22) / 2) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 142.43262 + (((tickAnim - 24) / 2) * (187.43262-(142.43262)));
            yy = 57.07594 + (((tickAnim - 24) / 2) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 24) / 2) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 187.43262 + (((tickAnim - 26) / 1) * (142.43262-(187.43262)));
            yy = 57.07594 + (((tickAnim - 26) / 1) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 26) / 1) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 142.43262 + (((tickAnim - 27) / 2) * (187.43262-(142.43262)));
            yy = 57.07594 + (((tickAnim - 27) / 2) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 27) / 2) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 187.43262 + (((tickAnim - 29) / 1) * (142.43262-(187.43262)));
            yy = 57.07594 + (((tickAnim - 29) / 1) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 29) / 1) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 142.43262 + (((tickAnim - 30) / 2) * (187.43262-(142.43262)));
            yy = 57.07594 + (((tickAnim - 30) / 2) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 30) / 2) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 187.43262 + (((tickAnim - 32) / 2) * (142.43262-(187.43262)));
            yy = 57.07594 + (((tickAnim - 32) / 2) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 32) / 2) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 142.43262 + (((tickAnim - 34) / 1) * (187.43262-(142.43262)));
            yy = 57.07594 + (((tickAnim - 34) / 1) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 34) / 1) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 187.43262 + (((tickAnim - 35) / 2) * (142.43262-(187.43262)));
            yy = 57.07594 + (((tickAnim - 35) / 2) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 35) / 2) * (157.8732-(157.8732)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 142.43262 + (((tickAnim - 37) / 1) * (187.43262-(142.43262)));
            yy = 57.07594 + (((tickAnim - 37) / 1) * (57.07594-(57.07594)));
            zz = 157.8732 + (((tickAnim - 37) / 1) * (157.8732-(157.8732)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(xx), leftForewing.rotateAngleY + (float) Math.toRadians(yy), leftForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 255.47101 + (((tickAnim - 0) / 1) * (101.06955-(255.47101)));
            yy = 87.93651 + (((tickAnim - 0) / 1) * (59.36583-(87.93651)));
            zz = 169.25716 + (((tickAnim - 0) / 1) * (82.55845-(169.25716)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 101.06955 + (((tickAnim - 1) / 1) * (16.65349-(101.06955)));
            yy = 59.36583 + (((tickAnim - 1) / 1) * (78.40294-(59.36583)));
            zz = 82.55845 + (((tickAnim - 1) / 1) * (57.74454-(82.55845)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 16.65349 + (((tickAnim - 2) / 0) * (286.15521-(16.65349)));
            yy = 78.40294 + (((tickAnim - 2) / 0) * (70.20334-(78.40294)));
            zz = 57.74454 + (((tickAnim - 2) / 0) * (265.8183-(57.74454)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 286.15521 + (((tickAnim - 2) / 1) * (255.47101-(286.15521)));
            yy = 70.20334 + (((tickAnim - 2) / 1) * (87.93651-(70.20334)));
            zz = 265.8183 + (((tickAnim - 2) / 1) * (169.25716-(265.8183)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 255.47101 + (((tickAnim - 3) / 1) * (101.06955-(255.47101)));
            yy = 87.93651 + (((tickAnim - 3) / 1) * (59.36583-(87.93651)));
            zz = 169.25716 + (((tickAnim - 3) / 1) * (82.55845-(169.25716)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 101.06955 + (((tickAnim - 4) / 1) * (16.65349-(101.06955)));
            yy = 59.36583 + (((tickAnim - 4) / 1) * (78.40294-(59.36583)));
            zz = 82.55845 + (((tickAnim - 4) / 1) * (57.74454-(82.55845)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 16.65349 + (((tickAnim - 5) / 1) * (286.15521-(16.65349)));
            yy = 78.40294 + (((tickAnim - 5) / 1) * (70.20334-(78.40294)));
            zz = 57.74454 + (((tickAnim - 5) / 1) * (265.8183-(57.74454)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = 286.15521 + (((tickAnim - 6) / 0) * (255.47101-(286.15521)));
            yy = 70.20334 + (((tickAnim - 6) / 0) * (87.93651-(70.20334)));
            zz = 265.8183 + (((tickAnim - 6) / 0) * (169.25716-(265.8183)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 255.47101 + (((tickAnim - 6) / 1) * (101.06955-(255.47101)));
            yy = 87.93651 + (((tickAnim - 6) / 1) * (59.36583-(87.93651)));
            zz = 169.25716 + (((tickAnim - 6) / 1) * (82.55845-(169.25716)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 101.06955 + (((tickAnim - 7) / 1) * (16.65349-(101.06955)));
            yy = 59.36583 + (((tickAnim - 7) / 1) * (78.40294-(59.36583)));
            zz = 82.55845 + (((tickAnim - 7) / 1) * (57.74454-(82.55845)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 16.65349 + (((tickAnim - 8) / 1) * (286.15521-(16.65349)));
            yy = 78.40294 + (((tickAnim - 8) / 1) * (70.20334-(78.40294)));
            zz = 57.74454 + (((tickAnim - 8) / 1) * (265.8183-(57.74454)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 286.15521 + (((tickAnim - 9) / 1) * (255.47101-(286.15521)));
            yy = 70.20334 + (((tickAnim - 9) / 1) * (87.93651-(70.20334)));
            zz = 265.8183 + (((tickAnim - 9) / 1) * (169.25716-(265.8183)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 255.47101 + (((tickAnim - 10) / 0) * (101.06955-(255.47101)));
            yy = 87.93651 + (((tickAnim - 10) / 0) * (59.36583-(87.93651)));
            zz = 169.25716 + (((tickAnim - 10) / 0) * (82.55845-(169.25716)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 101.06955 + (((tickAnim - 10) / 1) * (16.65349-(101.06955)));
            yy = 59.36583 + (((tickAnim - 10) / 1) * (78.40294-(59.36583)));
            zz = 82.55845 + (((tickAnim - 10) / 1) * (57.74454-(82.55845)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 16.65349 + (((tickAnim - 11) / 1) * (286.15521-(16.65349)));
            yy = 78.40294 + (((tickAnim - 11) / 1) * (70.20334-(78.40294)));
            zz = 57.74454 + (((tickAnim - 11) / 1) * (265.8183-(57.74454)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 286.15521 + (((tickAnim - 12) / 1) * (255.47101-(286.15521)));
            yy = 70.20334 + (((tickAnim - 12) / 1) * (87.93651-(70.20334)));
            zz = 265.8183 + (((tickAnim - 12) / 1) * (169.25716-(265.8183)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 255.47101 + (((tickAnim - 13) / 1) * (101.06955-(255.47101)));
            yy = 87.93651 + (((tickAnim - 13) / 1) * (59.36583-(87.93651)));
            zz = 169.25716 + (((tickAnim - 13) / 1) * (82.55845-(169.25716)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 101.06955 + (((tickAnim - 14) / 0) * (16.65349-(101.06955)));
            yy = 59.36583 + (((tickAnim - 14) / 0) * (78.40294-(59.36583)));
            zz = 82.55845 + (((tickAnim - 14) / 0) * (57.74454-(82.55845)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 16.65349 + (((tickAnim - 14) / 1) * (286.15521-(16.65349)));
            yy = 78.40294 + (((tickAnim - 14) / 1) * (70.20334-(78.40294)));
            zz = 57.74454 + (((tickAnim - 14) / 1) * (265.8183-(57.74454)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 286.15521 + (((tickAnim - 15) / 1) * (255.47101-(286.15521)));
            yy = 70.20334 + (((tickAnim - 15) / 1) * (87.93651-(70.20334)));
            zz = 265.8183 + (((tickAnim - 15) / 1) * (169.25716-(265.8183)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 255.47101 + (((tickAnim - 16) / 1) * (101.06955-(255.47101)));
            yy = 87.93651 + (((tickAnim - 16) / 1) * (59.36583-(87.93651)));
            zz = 169.25716 + (((tickAnim - 16) / 1) * (82.55845-(169.25716)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 101.06955 + (((tickAnim - 17) / 1) * (16.65349-(101.06955)));
            yy = 59.36583 + (((tickAnim - 17) / 1) * (78.40294-(59.36583)));
            zz = 82.55845 + (((tickAnim - 17) / 1) * (57.74454-(82.55845)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 16.65349 + (((tickAnim - 18) / 0) * (286.15521-(16.65349)));
            yy = 78.40294 + (((tickAnim - 18) / 0) * (70.20334-(78.40294)));
            zz = 57.74454 + (((tickAnim - 18) / 0) * (265.8183-(57.74454)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 286.15521 + (((tickAnim - 18) / 1) * (255.47101-(286.15521)));
            yy = 70.20334 + (((tickAnim - 18) / 1) * (87.93651-(70.20334)));
            zz = 265.8183 + (((tickAnim - 18) / 1) * (169.25716-(265.8183)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 255.47101 + (((tickAnim - 19) / 1) * (101.06955-(255.47101)));
            yy = 87.93651 + (((tickAnim - 19) / 1) * (59.36583-(87.93651)));
            zz = 169.25716 + (((tickAnim - 19) / 1) * (82.55845-(169.25716)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 101.06955 + (((tickAnim - 20) / 1) * (16.65349-(101.06955)));
            yy = 59.36583 + (((tickAnim - 20) / 1) * (78.40294-(59.36583)));
            zz = 82.55845 + (((tickAnim - 20) / 1) * (57.74454-(82.55845)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 16.65349 + (((tickAnim - 21) / 1) * (286.15521-(16.65349)));
            yy = 78.40294 + (((tickAnim - 21) / 1) * (70.20334-(78.40294)));
            zz = 57.74454 + (((tickAnim - 21) / 1) * (265.8183-(57.74454)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = 286.15521 + (((tickAnim - 22) / 0) * (255.47101-(286.15521)));
            yy = 70.20334 + (((tickAnim - 22) / 0) * (87.93651-(70.20334)));
            zz = 265.8183 + (((tickAnim - 22) / 0) * (169.25716-(265.8183)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 255.47101 + (((tickAnim - 22) / 1) * (101.06955-(255.47101)));
            yy = 87.93651 + (((tickAnim - 22) / 1) * (59.36583-(87.93651)));
            zz = 169.25716 + (((tickAnim - 22) / 1) * (82.55845-(169.25716)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 101.06955 + (((tickAnim - 23) / 1) * (16.65349-(101.06955)));
            yy = 59.36583 + (((tickAnim - 23) / 1) * (78.40294-(59.36583)));
            zz = 82.55845 + (((tickAnim - 23) / 1) * (57.74454-(82.55845)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 16.65349 + (((tickAnim - 24) / 1) * (286.15521-(16.65349)));
            yy = 78.40294 + (((tickAnim - 24) / 1) * (70.20334-(78.40294)));
            zz = 57.74454 + (((tickAnim - 24) / 1) * (265.8183-(57.74454)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 286.15521 + (((tickAnim - 25) / 1) * (255.47101-(286.15521)));
            yy = 70.20334 + (((tickAnim - 25) / 1) * (87.93651-(70.20334)));
            zz = 265.8183 + (((tickAnim - 25) / 1) * (169.25716-(265.8183)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 255.47101 + (((tickAnim - 26) / 0) * (101.06955-(255.47101)));
            yy = 87.93651 + (((tickAnim - 26) / 0) * (59.36583-(87.93651)));
            zz = 169.25716 + (((tickAnim - 26) / 0) * (82.55845-(169.25716)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 101.06955 + (((tickAnim - 26) / 1) * (16.65349-(101.06955)));
            yy = 59.36583 + (((tickAnim - 26) / 1) * (78.40294-(59.36583)));
            zz = 82.55845 + (((tickAnim - 26) / 1) * (57.74454-(82.55845)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 16.65349 + (((tickAnim - 27) / 1) * (286.15521-(16.65349)));
            yy = 78.40294 + (((tickAnim - 27) / 1) * (70.20334-(78.40294)));
            zz = 57.74454 + (((tickAnim - 27) / 1) * (265.8183-(57.74454)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 286.15521 + (((tickAnim - 28) / 1) * (255.47101-(286.15521)));
            yy = 70.20334 + (((tickAnim - 28) / 1) * (87.93651-(70.20334)));
            zz = 265.8183 + (((tickAnim - 28) / 1) * (169.25716-(265.8183)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 255.47101 + (((tickAnim - 29) / 1) * (101.06955-(255.47101)));
            yy = 87.93651 + (((tickAnim - 29) / 1) * (59.36583-(87.93651)));
            zz = 169.25716 + (((tickAnim - 29) / 1) * (82.55845-(169.25716)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 101.06955 + (((tickAnim - 30) / 0) * (16.65349-(101.06955)));
            yy = 59.36583 + (((tickAnim - 30) / 0) * (78.40294-(59.36583)));
            zz = 82.55845 + (((tickAnim - 30) / 0) * (57.74454-(82.55845)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 16.65349 + (((tickAnim - 30) / 1) * (286.15521-(16.65349)));
            yy = 78.40294 + (((tickAnim - 30) / 1) * (70.20334-(78.40294)));
            zz = 57.74454 + (((tickAnim - 30) / 1) * (265.8183-(57.74454)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 286.15521 + (((tickAnim - 31) / 1) * (255.47101-(286.15521)));
            yy = 70.20334 + (((tickAnim - 31) / 1) * (87.93651-(70.20334)));
            zz = 265.8183 + (((tickAnim - 31) / 1) * (169.25716-(265.8183)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 255.47101 + (((tickAnim - 32) / 1) * (101.06955-(255.47101)));
            yy = 87.93651 + (((tickAnim - 32) / 1) * (59.36583-(87.93651)));
            zz = 169.25716 + (((tickAnim - 32) / 1) * (82.55845-(169.25716)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 101.06955 + (((tickAnim - 33) / 1) * (16.65349-(101.06955)));
            yy = 59.36583 + (((tickAnim - 33) / 1) * (78.40294-(59.36583)));
            zz = 82.55845 + (((tickAnim - 33) / 1) * (57.74454-(82.55845)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 16.65349 + (((tickAnim - 34) / 0) * (286.15521-(16.65349)));
            yy = 78.40294 + (((tickAnim - 34) / 0) * (70.20334-(78.40294)));
            zz = 57.74454 + (((tickAnim - 34) / 0) * (265.8183-(57.74454)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 286.15521 + (((tickAnim - 34) / 1) * (255.47101-(286.15521)));
            yy = 70.20334 + (((tickAnim - 34) / 1) * (87.93651-(70.20334)));
            zz = 265.8183 + (((tickAnim - 34) / 1) * (169.25716-(265.8183)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 255.47101 + (((tickAnim - 35) / 1) * (101.06955-(255.47101)));
            yy = 87.93651 + (((tickAnim - 35) / 1) * (59.36583-(87.93651)));
            zz = 169.25716 + (((tickAnim - 35) / 1) * (82.55845-(169.25716)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 101.06955 + (((tickAnim - 36) / 1) * (16.65349-(101.06955)));
            yy = 59.36583 + (((tickAnim - 36) / 1) * (78.40294-(59.36583)));
            zz = 82.55845 + (((tickAnim - 36) / 1) * (57.74454-(82.55845)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 16.65349 + (((tickAnim - 37) / 1) * (286.15521-(16.65349)));
            yy = 78.40294 + (((tickAnim - 37) / 1) * (70.20334-(78.40294)));
            zz = 57.74454 + (((tickAnim - 37) / 1) * (265.8183-(57.74454)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 286.15521 + (((tickAnim - 38) / 0) * (255.47101-(286.15521)));
            yy = 70.20334 + (((tickAnim - 38) / 0) * (87.93651-(70.20334)));
            zz = 265.8183 + (((tickAnim - 38) / 0) * (169.25716-(265.8183)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(xx), leftHindwing.rotateAngleY + (float) Math.toRadians(yy), leftHindwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftHindwing2, leftHindwing2.rotateAngleX + (float) Math.toRadians(0), leftHindwing2.rotateAngleY + (float) Math.toRadians(0), leftHindwing2.rotateAngleZ + (float) Math.toRadians(180));


        this.setRotateAngle(leftHindwing3, leftHindwing3.rotateAngleX + (float) Math.toRadians(0), leftHindwing3.rotateAngleY + (float) Math.toRadians(0), leftHindwing3.rotateAngleZ + (float) Math.toRadians(180));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-37.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187))*20));
        this.body.rotationPointX = this.body.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-60))*3);
        this.body.rotationPointY = this.body.rotationPointY - (float)(7.2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374+40))*1);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(-2.6209404182+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-70))*10), rightLeg1.rotateAngleY + (float) Math.toRadians(-13.50953), rightLeg1.rotateAngleZ + (float) Math.toRadians(16.12715));


        this.setRotateAngle(rightLeg12, rightLeg12.rotateAngleX + (float) Math.toRadians(-60), rightLeg12.rotateAngleY + (float) Math.toRadians(0), rightLeg12.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(-2.6209404182+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-70))*10), leftLeg1.rotateAngleY + (float) Math.toRadians(13.50953), leftLeg1.rotateAngleZ + (float) Math.toRadians(-16.12715));


        this.setRotateAngle(leftLeg12, leftLeg12.rotateAngleX + (float) Math.toRadians(-60), leftLeg12.rotateAngleY + (float) Math.toRadians(0), leftLeg12.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(12.69001), rightLeg2.rotateAngleY + (float) Math.toRadians(46.82889), rightLeg2.rotateAngleZ + (float) Math.toRadians(2.7507205334-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-90))*20));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(12.69001), leftLeg2.rotateAngleY + (float) Math.toRadians(-46.82889), leftLeg2.rotateAngleZ + (float) Math.toRadians(-2.7507205334+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-70))*20));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(-7.5), rightLeg3.rotateAngleY + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-90))*3), rightLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(-7.5), leftLeg3.rotateAngleY + (float) Math.toRadians(-15-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-90))*3), leftLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(abdomen, abdomen.rotateAngleX + (float) Math.toRadians(0), abdomen.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-90))*8), abdomen.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEoproscopia entity = (EntityPrehistoricFloraEoproscopia) entitylivingbaseIn;
        int animCycle = 16;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*450/0.5+150))*1.5), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*225/0.5+150))*2.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*225/0.5+60))*10));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*450/0.5+60))*0.1);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 30.10392 + (((tickAnim - 0) / 4) * (-54.48692-(30.10392)));
            yy = 23.76305 + (((tickAnim - 0) / 4) * (-3.78085-(23.76305)));
            zz = 18.49032 + (((tickAnim - 0) / 4) * (3.55414-(18.49032)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -54.48692 + (((tickAnim - 4) / 4) * (2.20809-(-54.48692)));
            yy = -3.78085 + (((tickAnim - 4) / 4) * (-24.92821-(-3.78085)));
            zz = 3.55414 + (((tickAnim - 4) / 4) * (0.56246-(3.55414)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2.20809 + (((tickAnim - 8) / 4) * (5.51308-(2.20809)));
            yy = -24.92821 + (((tickAnim - 8) / 4) * (-3.78085-(-24.92821)));
            zz = 0.56246 + (((tickAnim - 8) / 4) * (3.55414-(0.56246)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 5.51308 + (((tickAnim - 12) / 4) * (30.10392-(5.51308)));
            yy = -3.78085 + (((tickAnim - 12) / 4) * (23.76305-(-3.78085)));
            zz = 3.55414 + (((tickAnim - 12) / 4) * (18.49032-(3.55414)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (60-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 60 + (((tickAnim - 4) / 4) * (0-(60)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg12, rightLeg12.rotateAngleX + (float) Math.toRadians(xx), rightLeg12.rotateAngleY + (float) Math.toRadians(yy), rightLeg12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.20809 + (((tickAnim - 0) / 4) * (5.51308-(2.20809)));
            yy = 24.92821 + (((tickAnim - 0) / 4) * (3.78085-(24.92821)));
            zz = -0.56246 + (((tickAnim - 0) / 4) * (-3.55414-(-0.56246)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5.51308 + (((tickAnim - 4) / 4) * (30.10392-(5.51308)));
            yy = 3.78085 + (((tickAnim - 4) / 4) * (-23.76305-(3.78085)));
            zz = -3.55414 + (((tickAnim - 4) / 4) * (-18.49032-(-3.55414)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 30.10392 + (((tickAnim - 8) / 4) * (-54.48692-(30.10392)));
            yy = -23.76305 + (((tickAnim - 8) / 4) * (3.78085-(-23.76305)));
            zz = -18.49032 + (((tickAnim - 8) / 4) * (-3.55414-(-18.49032)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -54.48692 + (((tickAnim - 12) / 4) * (2.20809-(-54.48692)));
            yy = 3.78085 + (((tickAnim - 12) / 4) * (24.92821-(3.78085)));
            zz = -3.55414 + (((tickAnim - 12) / 4) * (-0.56246-(-3.55414)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (60-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 60 + (((tickAnim - 12) / 4) * (0-(60)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg12, leftLeg12.rotateAngleX + (float) Math.toRadians(xx), leftLeg12.rotateAngleY + (float) Math.toRadians(yy), leftLeg12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -116.27902 + (((tickAnim - 0) / 8) * (2.99593-(-116.27902)));
            yy = -12.83655 + (((tickAnim - 0) / 8) * (15.33694-(-12.83655)));
            zz = 109.06424 + (((tickAnim - 0) / 8) * (4.57097-(109.06424)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2.99593 + (((tickAnim - 8) / 4) * (-5.16142-(2.99593)));
            yy = 15.33694 + (((tickAnim - 8) / 4) * (7.36615-(15.33694)));
            zz = 4.57097 + (((tickAnim - 8) / 4) * (54.85436-(4.57097)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -5.16142 + (((tickAnim - 12) / 4) * (-116.27902-(-5.16142)));
            yy = 7.36615 + (((tickAnim - 12) / 4) * (-12.83655-(7.36615)));
            zz = 54.85436 + (((tickAnim - 12) / 4) * (109.06424-(54.85436)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -37.5 + (((tickAnim - 0) / 8) * (0-(-37.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (-62.5-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -62.5 + (((tickAnim - 12) / 4) * (-37.5-(-62.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg22, rightLeg22.rotateAngleX + (float) Math.toRadians(xx), rightLeg22.rotateAngleY + (float) Math.toRadians(yy), rightLeg22.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.99593 + (((tickAnim - 0) / 4) * (-5.16142-(2.99593)));
            yy = -15.33694 + (((tickAnim - 0) / 4) * (-7.36615-(-15.33694)));
            zz = -4.57097 + (((tickAnim - 0) / 4) * (-54.85436-(-4.57097)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -5.16142 + (((tickAnim - 4) / 4) * (-116.27902-(-5.16142)));
            yy = -7.36615 + (((tickAnim - 4) / 4) * (12.83655-(-7.36615)));
            zz = -54.85436 + (((tickAnim - 4) / 4) * (-109.06424-(-54.85436)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -116.27902 + (((tickAnim - 8) / 8) * (2.99593-(-116.27902)));
            yy = 12.83655 + (((tickAnim - 8) / 8) * (-15.33694-(12.83655)));
            zz = -109.06424 + (((tickAnim - 8) / 8) * (-4.57097-(-109.06424)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-62.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -62.5 + (((tickAnim - 4) / 4) * (-37.5-(-62.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -37.5 + (((tickAnim - 8) / 8) * (0-(-37.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg22, leftLeg22.rotateAngleX + (float) Math.toRadians(xx), leftLeg22.rotateAngleY + (float) Math.toRadians(yy), leftLeg22.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -2.5 + (((tickAnim - 0) / 4) * (34.59136-(-2.5)));
            yy = 7.5 + (((tickAnim - 0) / 4) * (0.68893-(7.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (-2.36592-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 34.59136 + (((tickAnim - 4) / 4) * (21.68272-(34.59136)));
            yy = 0.68893 + (((tickAnim - 4) / 4) * (1.37785-(0.68893)));
            zz = -2.36592 + (((tickAnim - 4) / 4) * (-4.73183-(-2.36592)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 21.68272 + (((tickAnim - 8) / 4) * (14.59136-(21.68272)));
            yy = 1.37785 + (((tickAnim - 8) / 4) * (4.43893-(1.37785)));
            zz = -4.73183 + (((tickAnim - 8) / 4) * (-2.36592-(-4.73183)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 14.59136 + (((tickAnim - 12) / 4) * (-2.5-(14.59136)));
            yy = 4.43893 + (((tickAnim - 12) / 4) * (7.5-(4.43893)));
            zz = -2.36592 + (((tickAnim - 12) / 4) * (0-(-2.36592)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-61.70001-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (3.25302-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (9.75405-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -61.70001 + (((tickAnim - 4) / 4) * (-45.90001-(-61.70001)));
            yy = 3.25302 + (((tickAnim - 4) / 4) * (6.50604-(3.25302)));
            zz = 9.75405 + (((tickAnim - 4) / 4) * (19.50809-(9.75405)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -45.90001 + (((tickAnim - 8) / 8) * (0-(-45.90001)));
            yy = 6.50604 + (((tickAnim - 8) / 8) * (0-(6.50604)));
            zz = 19.50809 + (((tickAnim - 8) / 8) * (0-(19.50809)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg32, rightLeg32.rotateAngleX + (float) Math.toRadians(xx), rightLeg32.rotateAngleY + (float) Math.toRadians(yy), rightLeg32.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 21.68272 + (((tickAnim - 0) / 4) * (14.59136-(21.68272)));
            yy = -1.37785 + (((tickAnim - 0) / 4) * (-4.43893-(-1.37785)));
            zz = 4.73183 + (((tickAnim - 0) / 4) * (2.36592-(4.73183)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 14.59136 + (((tickAnim - 4) / 4) * (-2.5-(14.59136)));
            yy = -4.43893 + (((tickAnim - 4) / 4) * (-7.5-(-4.43893)));
            zz = 2.36592 + (((tickAnim - 4) / 4) * (0-(2.36592)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -2.5 + (((tickAnim - 8) / 4) * (34.59136-(-2.5)));
            yy = -7.5 + (((tickAnim - 8) / 4) * (-0.68893-(-7.5)));
            zz = 0 + (((tickAnim - 8) / 4) * (2.36592-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 34.59136 + (((tickAnim - 12) / 4) * (21.68272-(34.59136)));
            yy = -0.68893 + (((tickAnim - 12) / 4) * (-1.37785-(-0.68893)));
            zz = 2.36592 + (((tickAnim - 12) / 4) * (4.73183-(2.36592)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -45.90001 + (((tickAnim - 0) / 8) * (0-(-45.90001)));
            yy = -6.50604 + (((tickAnim - 0) / 8) * (0-(-6.50604)));
            zz = -19.50809 + (((tickAnim - 0) / 8) * (0-(-19.50809)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (-61.70001-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (-3.25302-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-9.75405-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -61.70001 + (((tickAnim - 12) / 4) * (-45.90001-(-61.70001)));
            yy = -3.25302 + (((tickAnim - 12) / 4) * (-6.50604-(-3.25302)));
            zz = -9.75405 + (((tickAnim - 12) / 4) * (-19.50809-(-9.75405)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg32, leftLeg32.rotateAngleX + (float) Math.toRadians(xx), leftLeg32.rotateAngleY + (float) Math.toRadians(yy), leftLeg32.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(0), rightAntenna.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*450+230))*10), rightAntenna.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(0), leftAntenna.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*450+150))*10), leftAntenna.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isMoving) {
        EntityPrehistoricFloraEoproscopia entity = (EntityPrehistoricFloraEoproscopia) entitylivingbaseIn;
        int animCycle = 16;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        if (!isMoving) {
            tickAnim = 0;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*450/0.5+150))*1.5), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*225/0.5+150))*2.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*225/0.5+60))*10));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*450/0.5+60))*0.1);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 30.10392 + (((tickAnim - 0) / 4) * (-54.48692-(30.10392)));
            yy = 23.76305 + (((tickAnim - 0) / 4) * (-3.78085-(23.76305)));
            zz = 18.49032 + (((tickAnim - 0) / 4) * (3.55414-(18.49032)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -54.48692 + (((tickAnim - 4) / 4) * (2.20809-(-54.48692)));
            yy = -3.78085 + (((tickAnim - 4) / 4) * (-24.92821-(-3.78085)));
            zz = 3.55414 + (((tickAnim - 4) / 4) * (0.56246-(3.55414)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2.20809 + (((tickAnim - 8) / 4) * (5.51308-(2.20809)));
            yy = -24.92821 + (((tickAnim - 8) / 4) * (-3.78085-(-24.92821)));
            zz = 0.56246 + (((tickAnim - 8) / 4) * (3.55414-(0.56246)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 5.51308 + (((tickAnim - 12) / 4) * (30.10392-(5.51308)));
            yy = -3.78085 + (((tickAnim - 12) / 4) * (23.76305-(-3.78085)));
            zz = 3.55414 + (((tickAnim - 12) / 4) * (18.49032-(3.55414)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (60-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 60 + (((tickAnim - 4) / 4) * (0-(60)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg12, rightLeg12.rotateAngleX + (float) Math.toRadians(xx), rightLeg12.rotateAngleY + (float) Math.toRadians(yy), rightLeg12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.20809 + (((tickAnim - 0) / 4) * (5.51308-(2.20809)));
            yy = 24.92821 + (((tickAnim - 0) / 4) * (3.78085-(24.92821)));
            zz = -0.56246 + (((tickAnim - 0) / 4) * (-3.55414-(-0.56246)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5.51308 + (((tickAnim - 4) / 4) * (30.10392-(5.51308)));
            yy = 3.78085 + (((tickAnim - 4) / 4) * (-23.76305-(3.78085)));
            zz = -3.55414 + (((tickAnim - 4) / 4) * (-18.49032-(-3.55414)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 30.10392 + (((tickAnim - 8) / 4) * (-54.48692-(30.10392)));
            yy = -23.76305 + (((tickAnim - 8) / 4) * (3.78085-(-23.76305)));
            zz = -18.49032 + (((tickAnim - 8) / 4) * (-3.55414-(-18.49032)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -54.48692 + (((tickAnim - 12) / 4) * (2.20809-(-54.48692)));
            yy = 3.78085 + (((tickAnim - 12) / 4) * (24.92821-(3.78085)));
            zz = -3.55414 + (((tickAnim - 12) / 4) * (-0.56246-(-3.55414)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (60-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 60 + (((tickAnim - 12) / 4) * (0-(60)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg12, leftLeg12.rotateAngleX + (float) Math.toRadians(xx), leftLeg12.rotateAngleY + (float) Math.toRadians(yy), leftLeg12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -116.27902 + (((tickAnim - 0) / 8) * (2.99593-(-116.27902)));
            yy = -12.83655 + (((tickAnim - 0) / 8) * (15.33694-(-12.83655)));
            zz = 109.06424 + (((tickAnim - 0) / 8) * (4.57097-(109.06424)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2.99593 + (((tickAnim - 8) / 4) * (-5.16142-(2.99593)));
            yy = 15.33694 + (((tickAnim - 8) / 4) * (7.36615-(15.33694)));
            zz = 4.57097 + (((tickAnim - 8) / 4) * (54.85436-(4.57097)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -5.16142 + (((tickAnim - 12) / 4) * (-116.27902-(-5.16142)));
            yy = 7.36615 + (((tickAnim - 12) / 4) * (-12.83655-(7.36615)));
            zz = 54.85436 + (((tickAnim - 12) / 4) * (109.06424-(54.85436)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -37.5 + (((tickAnim - 0) / 8) * (0-(-37.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (-62.5-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -62.5 + (((tickAnim - 12) / 4) * (-37.5-(-62.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg22, rightLeg22.rotateAngleX + (float) Math.toRadians(xx), rightLeg22.rotateAngleY + (float) Math.toRadians(yy), rightLeg22.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.99593 + (((tickAnim - 0) / 4) * (-5.16142-(2.99593)));
            yy = -15.33694 + (((tickAnim - 0) / 4) * (-7.36615-(-15.33694)));
            zz = -4.57097 + (((tickAnim - 0) / 4) * (-54.85436-(-4.57097)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -5.16142 + (((tickAnim - 4) / 4) * (-116.27902-(-5.16142)));
            yy = -7.36615 + (((tickAnim - 4) / 4) * (12.83655-(-7.36615)));
            zz = -54.85436 + (((tickAnim - 4) / 4) * (-109.06424-(-54.85436)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -116.27902 + (((tickAnim - 8) / 8) * (2.99593-(-116.27902)));
            yy = 12.83655 + (((tickAnim - 8) / 8) * (-15.33694-(12.83655)));
            zz = -109.06424 + (((tickAnim - 8) / 8) * (-4.57097-(-109.06424)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-62.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -62.5 + (((tickAnim - 4) / 4) * (-37.5-(-62.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -37.5 + (((tickAnim - 8) / 8) * (0-(-37.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg22, leftLeg22.rotateAngleX + (float) Math.toRadians(xx), leftLeg22.rotateAngleY + (float) Math.toRadians(yy), leftLeg22.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -2.5 + (((tickAnim - 0) / 4) * (34.59136-(-2.5)));
            yy = 7.5 + (((tickAnim - 0) / 4) * (0.68893-(7.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (-2.36592-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 34.59136 + (((tickAnim - 4) / 4) * (21.68272-(34.59136)));
            yy = 0.68893 + (((tickAnim - 4) / 4) * (1.37785-(0.68893)));
            zz = -2.36592 + (((tickAnim - 4) / 4) * (-4.73183-(-2.36592)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 21.68272 + (((tickAnim - 8) / 4) * (14.59136-(21.68272)));
            yy = 1.37785 + (((tickAnim - 8) / 4) * (4.43893-(1.37785)));
            zz = -4.73183 + (((tickAnim - 8) / 4) * (-2.36592-(-4.73183)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 14.59136 + (((tickAnim - 12) / 4) * (-2.5-(14.59136)));
            yy = 4.43893 + (((tickAnim - 12) / 4) * (7.5-(4.43893)));
            zz = -2.36592 + (((tickAnim - 12) / 4) * (0-(-2.36592)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-61.70001-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (3.25302-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (9.75405-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -61.70001 + (((tickAnim - 4) / 4) * (-45.90001-(-61.70001)));
            yy = 3.25302 + (((tickAnim - 4) / 4) * (6.50604-(3.25302)));
            zz = 9.75405 + (((tickAnim - 4) / 4) * (19.50809-(9.75405)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -45.90001 + (((tickAnim - 8) / 8) * (0-(-45.90001)));
            yy = 6.50604 + (((tickAnim - 8) / 8) * (0-(6.50604)));
            zz = 19.50809 + (((tickAnim - 8) / 8) * (0-(19.50809)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg32, rightLeg32.rotateAngleX + (float) Math.toRadians(xx), rightLeg32.rotateAngleY + (float) Math.toRadians(yy), rightLeg32.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 21.68272 + (((tickAnim - 0) / 4) * (14.59136-(21.68272)));
            yy = -1.37785 + (((tickAnim - 0) / 4) * (-4.43893-(-1.37785)));
            zz = 4.73183 + (((tickAnim - 0) / 4) * (2.36592-(4.73183)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 14.59136 + (((tickAnim - 4) / 4) * (-2.5-(14.59136)));
            yy = -4.43893 + (((tickAnim - 4) / 4) * (-7.5-(-4.43893)));
            zz = 2.36592 + (((tickAnim - 4) / 4) * (0-(2.36592)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -2.5 + (((tickAnim - 8) / 4) * (34.59136-(-2.5)));
            yy = -7.5 + (((tickAnim - 8) / 4) * (-0.68893-(-7.5)));
            zz = 0 + (((tickAnim - 8) / 4) * (2.36592-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 34.59136 + (((tickAnim - 12) / 4) * (21.68272-(34.59136)));
            yy = -0.68893 + (((tickAnim - 12) / 4) * (-1.37785-(-0.68893)));
            zz = 2.36592 + (((tickAnim - 12) / 4) * (4.73183-(2.36592)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -45.90001 + (((tickAnim - 0) / 8) * (0-(-45.90001)));
            yy = -6.50604 + (((tickAnim - 0) / 8) * (0-(-6.50604)));
            zz = -19.50809 + (((tickAnim - 0) / 8) * (0-(-19.50809)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (-61.70001-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (-3.25302-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-9.75405-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -61.70001 + (((tickAnim - 12) / 4) * (-45.90001-(-61.70001)));
            yy = -3.25302 + (((tickAnim - 12) / 4) * (-6.50604-(-3.25302)));
            zz = -9.75405 + (((tickAnim - 12) / 4) * (-19.50809-(-9.75405)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg32, leftLeg32.rotateAngleX + (float) Math.toRadians(xx), leftLeg32.rotateAngleY + (float) Math.toRadians(yy), leftLeg32.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(0), rightAntenna.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*450+230))*10), rightAntenna.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(0), leftAntenna.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*450+150))*10), leftAntenna.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
