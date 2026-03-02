package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraUmenopterix;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelUmenopterix extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer rightForewing;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer cube_r18;

    private ModelAnimator animator;

    public ModelUmenopterix() {
        this.textureWidth = 26;
        this.textureHeight = 21;

        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(-0.6F, 21.9F, -0.45F);
        this.thorax.cubeList.add(new ModelBox(thorax, 0, 17, -1.4F, -0.3F, -1.15F, 4, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.thorax.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1047F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 17, -0.9F, -0.1F, 1.3F, 3, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.6F, 0.7F, 5.7F);
        this.thorax.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2013F, 1.0207F, -0.1722F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 4, -2.1F, -0.5086F, 0.4471F, 2, 1, 0, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.8F, 0.7F, 5.7F);
        this.thorax.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2013F, -1.0207F, 0.1722F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 4, 0.1F, -0.5086F, 0.4471F, 2, 1, 0, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.1F, 3.9F);
        this.thorax.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 7, 0.1F, -0.1F, 1.3F, 2, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.2F, 1.15F);
        this.thorax.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1047F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 13, -1.9F, -0.1F, 0.3F, 4, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.1F, -0.3F, -1.85F);
        this.thorax.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 5, -1.0F, 0.0F, -2.0F, 3, 0, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.9F, 0.3F, -1.45F);
        this.thorax.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1222F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 10, -1.3F, -0.5055F, -1.5547F, 2, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.4F, 0.4F, -2.25F);
        this.thorax.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1222F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 2, -0.3F, -0.5055F, -1.5547F, 1, 1, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.6F, 0.6F, -3.05F);
        this.thorax.addChild(head);
        this.setRotateAngle(head, 0.576F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 18, 18, -1.0F, -0.9F, -1.2F, 2, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 0.7F, -1.0F, -1.1F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.7F, -1.0F, -1.1F, 1, 1, 1, 0.0F, true));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.8F, -0.4F, -0.9F);
        this.head.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, -0.4283F, -0.5351F, -0.0052F);
        this.leftAntenna.cubeList.add(new ModelBox(leftAntenna, 0, 0, -0.7741F, -0.1274F, -5.1222F, 2, 0, 5, 0.0F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.8F, -0.4F, -0.9F);
        this.head.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, -0.4283F, 0.5351F, 0.0052F);
        this.rightAntenna.cubeList.add(new ModelBox(rightAntenna, 0, 0, -1.2259F, -0.1274F, -5.1222F, 2, 0, 5, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.5F, 0.4F, 1.05F);
        this.thorax.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.0524F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2716F, 0.9153F, -0.3968F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 10, -6.6F, 0.0F, -1.3F, 7, 0, 3, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.3F, 0.4F, 0.05F);
        this.thorax.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, -0.1309F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1571F, -0.2793F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 13, -4.6F, 0.0F, -1.3F, 5, 0, 3, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.4F, 0.6F, -2.15F);
        this.thorax.addChild(leftLeg1);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.1F, 0.2F, 0.0F);
        this.leftLeg1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4859F, -0.9118F, -0.1618F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 0, -1.0F, 0.0F, -4.0F, 3, 0, 5, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.2F, 0.6F, -2.15F);
        this.thorax.addChild(rightLeg1);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.1F, 0.2F, 0.0F);
        this.rightLeg1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.4859F, 0.9118F, 0.1618F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 0, -2.0F, 0.0F, -4.0F, 3, 0, 5, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(2.5F, 0.4F, 0.05F);
        this.thorax.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, 0.1309F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.1571F, 0.2793F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 13, -0.4F, 0.0F, -1.3F, 5, 0, 3, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(2.7F, 0.4F, 1.05F);
        this.thorax.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.0524F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2716F, -0.9153F, 0.3968F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 10, -0.4F, 0.0F, -1.3F, 7, 0, 3, 0.0F, false));

        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(1.7F, -0.4F, -0.15F);
        this.thorax.addChild(leftForewing);
        this.setRotateAngle(leftForewing, 0.0F, -1.6144F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.0734F, 1.7F, 0.4241F);
        this.leftForewing.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 1.6144F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -0.89F, -1.99F, -0.7259F, 3, 1, 9, 0.0F, false));

        this.rightForewing = new AdvancedModelRenderer(this);
        this.rightForewing.setRotationPoint(-0.5F, -0.4F, -0.15F);
        this.thorax.addChild(rightForewing);
        this.setRotateAngle(rightForewing, 0.0F, 1.6144F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0734F, 1.7F, 0.4241F);
        this.rightForewing.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -1.6144F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -2.11F, -2.0F, -0.7259F, 3, 1, 9, 0.0F, true));

        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(2.0F, -0.3F, 0.15F);
        this.thorax.addChild(leftHindwing);
        this.setRotateAngle(leftHindwing, 0.0F, -0.576F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.8254F, 0.0F, 0.1774F);
        this.leftHindwing.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.5672F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 7, 0, -1.7603F, 0.0F, -0.1693F, 3, 0, 8, 0.0F, false));

        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(-0.8F, -0.3F, 0.15F);
        this.thorax.addChild(rightHindwing);
        this.setRotateAngle(rightHindwing, 0.0F, 0.5672F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.8254F, 0.0F, 0.1774F);
        this.rightHindwing.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.5672F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 7, 0, -1.2397F, -0.01F, -0.1693F, 3, 0, 8, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.thorax.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(thorax, 1.0F, 0.0F, 0.0F);
        this.thorax.offsetY = -0.25F;
        this.thorax.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.thorax.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        //this.body.offsetZ = -0.080F;
        this.thorax.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.thorax.offsetY = -2.30F;
        this.thorax.offsetX = -0.05F;
        this.thorax.rotateAngleY = (float)Math.toRadians(210);
        this.thorax.rotateAngleX = (float)Math.toRadians(40);
        this.thorax.rotateAngleZ = (float)Math.toRadians(-8);
        this.thorax.scaleChildren = true;
        float scaler = 3.9F;
        this.thorax.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.thorax.render(f);
        //Reset rotations, positions and sizing:
        this.thorax.setScale(1.0F, 1.0F, 1.0F);
        this.thorax.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraUmenopterix ee = (EntityPrehistoricFloraUmenopterix) e;
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
        EntityPrehistoricFloraUmenopterix ee = (EntityPrehistoricFloraUmenopterix) entitylivingbaseIn;

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
        EntityPrehistoricFloraUmenopterix entity = (EntityPrehistoricFloraUmenopterix) entitylivingbaseIn;
        int animCycle = 38;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(thorax, thorax.rotateAngleX + (float) Math.toRadians(-37.5), thorax.rotateAngleY + (float) Math.toRadians(0), thorax.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187))*20));
        this.thorax.rotationPointX = this.thorax.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-60))*3);
        this.thorax.rotationPointY = this.thorax.rotationPointY - (float)(3.2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374+40))*1);
        this.thorax.rotationPointZ = this.thorax.rotationPointZ + (float)(0);


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187))*3), leftAntenna.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187))*20), leftAntenna.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-60))*3), rightAntenna.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-60))*20), rightAntenna.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(0), leftLeg1.rotateAngleY + (float) Math.toRadians(0), leftLeg1.rotateAngleZ + (float) Math.toRadians(5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-70))*5));


        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(0), rightLeg1.rotateAngleY + (float) Math.toRadians(0), rightLeg1.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-40))*5));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(22.19157), leftLeg2.rotateAngleY + (float) Math.toRadians(-3.81024), leftLeg2.rotateAngleZ + (float) Math.toRadians(39.2524863734+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-70))*20));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-90))*10), leftLeg3.rotateAngleY + (float) Math.toRadians(0), leftLeg3.rotateAngleZ + (float) Math.toRadians(55));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 9.57416 + (((tickAnim - 0) / 1) * (20.01538-(9.57416)));
            yy = 96.94184 + (((tickAnim - 0) / 1) * (95.40849-(96.94184)));
            zz = -14.20638 + (((tickAnim - 0) / 1) * (-5.57954-(-14.20638)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 20.01538 + (((tickAnim - 1) / 1) * (10.4566-(20.01538)));
            yy = 95.40849 + (((tickAnim - 1) / 1) * (93.87513-(95.40849)));
            zz = -5.57954 + (((tickAnim - 1) / 1) * (3.04729-(-5.57954)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10.4566 + (((tickAnim - 2) / 1) * (9.57416-(10.4566)));
            yy = 93.87513 + (((tickAnim - 2) / 1) * (96.94184-(93.87513)));
            zz = 3.04729 + (((tickAnim - 2) / 1) * (-14.20638-(3.04729)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 9.57416 + (((tickAnim - 3) / 1) * (20.01538-(9.57416)));
            yy = 96.94184 + (((tickAnim - 3) / 1) * (95.40849-(96.94184)));
            zz = -14.20638 + (((tickAnim - 3) / 1) * (-5.57954-(-14.20638)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 20.01538 + (((tickAnim - 4) / 1) * (10.4566-(20.01538)));
            yy = 95.40849 + (((tickAnim - 4) / 1) * (93.87513-(95.40849)));
            zz = -5.57954 + (((tickAnim - 4) / 1) * (3.04729-(-5.57954)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 10.4566 + (((tickAnim - 5) / 1) * (9.57416-(10.4566)));
            yy = 93.87513 + (((tickAnim - 5) / 1) * (96.94184-(93.87513)));
            zz = 3.04729 + (((tickAnim - 5) / 1) * (-14.20638-(3.04729)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 9.57416 + (((tickAnim - 6) / 1) * (20.01538-(9.57416)));
            yy = 96.94184 + (((tickAnim - 6) / 1) * (95.40849-(96.94184)));
            zz = -14.20638 + (((tickAnim - 6) / 1) * (-5.57954-(-14.20638)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 20.01538 + (((tickAnim - 7) / 1) * (10.4566-(20.01538)));
            yy = 95.40849 + (((tickAnim - 7) / 1) * (93.87513-(95.40849)));
            zz = -5.57954 + (((tickAnim - 7) / 1) * (3.04729-(-5.57954)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10.4566 + (((tickAnim - 8) / 2) * (9.57416-(10.4566)));
            yy = 93.87513 + (((tickAnim - 8) / 2) * (96.94184-(93.87513)));
            zz = 3.04729 + (((tickAnim - 8) / 2) * (-14.20638-(3.04729)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 9.57416 + (((tickAnim - 10) / 0) * (20.01538-(9.57416)));
            yy = 96.94184 + (((tickAnim - 10) / 0) * (95.40849-(96.94184)));
            zz = -14.20638 + (((tickAnim - 10) / 0) * (-5.57954-(-14.20638)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 20.01538 + (((tickAnim - 10) / 1) * (10.4566-(20.01538)));
            yy = 95.40849 + (((tickAnim - 10) / 1) * (93.87513-(95.40849)));
            zz = -5.57954 + (((tickAnim - 10) / 1) * (3.04729-(-5.57954)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 10.4566 + (((tickAnim - 11) / 2) * (9.57416-(10.4566)));
            yy = 93.87513 + (((tickAnim - 11) / 2) * (96.94184-(93.87513)));
            zz = 3.04729 + (((tickAnim - 11) / 2) * (-14.20638-(3.04729)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 9.57416 + (((tickAnim - 13) / 1) * (20.01538-(9.57416)));
            yy = 96.94184 + (((tickAnim - 13) / 1) * (95.40849-(96.94184)));
            zz = -14.20638 + (((tickAnim - 13) / 1) * (-5.57954-(-14.20638)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 20.01538 + (((tickAnim - 14) / 0) * (10.4566-(20.01538)));
            yy = 95.40849 + (((tickAnim - 14) / 0) * (93.87513-(95.40849)));
            zz = -5.57954 + (((tickAnim - 14) / 0) * (3.04729-(-5.57954)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 10.4566 + (((tickAnim - 14) / 2) * (9.57416-(10.4566)));
            yy = 93.87513 + (((tickAnim - 14) / 2) * (96.94184-(93.87513)));
            zz = 3.04729 + (((tickAnim - 14) / 2) * (-14.20638-(3.04729)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 9.57416 + (((tickAnim - 16) / 1) * (20.01538-(9.57416)));
            yy = 96.94184 + (((tickAnim - 16) / 1) * (95.40849-(96.94184)));
            zz = -14.20638 + (((tickAnim - 16) / 1) * (-5.57954-(-14.20638)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 20.01538 + (((tickAnim - 17) / 1) * (10.4566-(20.01538)));
            yy = 95.40849 + (((tickAnim - 17) / 1) * (93.87513-(95.40849)));
            zz = -5.57954 + (((tickAnim - 17) / 1) * (3.04729-(-5.57954)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 10.4566 + (((tickAnim - 18) / 1) * (9.57416-(10.4566)));
            yy = 93.87513 + (((tickAnim - 18) / 1) * (96.94184-(93.87513)));
            zz = 3.04729 + (((tickAnim - 18) / 1) * (-14.20638-(3.04729)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 9.57416 + (((tickAnim - 19) / 1) * (20.01538-(9.57416)));
            yy = 96.94184 + (((tickAnim - 19) / 1) * (95.40849-(96.94184)));
            zz = -14.20638 + (((tickAnim - 19) / 1) * (-5.57954-(-14.20638)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 20.01538 + (((tickAnim - 20) / 1) * (10.4566-(20.01538)));
            yy = 95.40849 + (((tickAnim - 20) / 1) * (93.87513-(95.40849)));
            zz = -5.57954 + (((tickAnim - 20) / 1) * (3.04729-(-5.57954)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 10.4566 + (((tickAnim - 21) / 1) * (9.57416-(10.4566)));
            yy = 93.87513 + (((tickAnim - 21) / 1) * (96.94184-(93.87513)));
            zz = 3.04729 + (((tickAnim - 21) / 1) * (-14.20638-(3.04729)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 9.57416 + (((tickAnim - 22) / 1) * (20.01538-(9.57416)));
            yy = 96.94184 + (((tickAnim - 22) / 1) * (95.40849-(96.94184)));
            zz = -14.20638 + (((tickAnim - 22) / 1) * (-5.57954-(-14.20638)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 20.01538 + (((tickAnim - 23) / 1) * (10.4566-(20.01538)));
            yy = 95.40849 + (((tickAnim - 23) / 1) * (93.87513-(95.40849)));
            zz = -5.57954 + (((tickAnim - 23) / 1) * (3.04729-(-5.57954)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 10.4566 + (((tickAnim - 24) / 2) * (9.57416-(10.4566)));
            yy = 93.87513 + (((tickAnim - 24) / 2) * (96.94184-(93.87513)));
            zz = 3.04729 + (((tickAnim - 24) / 2) * (-14.20638-(3.04729)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 9.57416 + (((tickAnim - 26) / 0) * (20.01538-(9.57416)));
            yy = 96.94184 + (((tickAnim - 26) / 0) * (95.40849-(96.94184)));
            zz = -14.20638 + (((tickAnim - 26) / 0) * (-5.57954-(-14.20638)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 20.01538 + (((tickAnim - 26) / 1) * (10.4566-(20.01538)));
            yy = 95.40849 + (((tickAnim - 26) / 1) * (93.87513-(95.40849)));
            zz = -5.57954 + (((tickAnim - 26) / 1) * (3.04729-(-5.57954)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 10.4566 + (((tickAnim - 27) / 2) * (9.57416-(10.4566)));
            yy = 93.87513 + (((tickAnim - 27) / 2) * (96.94184-(93.87513)));
            zz = 3.04729 + (((tickAnim - 27) / 2) * (-14.20638-(3.04729)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 9.57416 + (((tickAnim - 29) / 1) * (20.01538-(9.57416)));
            yy = 96.94184 + (((tickAnim - 29) / 1) * (95.40849-(96.94184)));
            zz = -14.20638 + (((tickAnim - 29) / 1) * (-5.57954-(-14.20638)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 20.01538 + (((tickAnim - 30) / 0) * (10.4566-(20.01538)));
            yy = 95.40849 + (((tickAnim - 30) / 0) * (93.87513-(95.40849)));
            zz = -5.57954 + (((tickAnim - 30) / 0) * (3.04729-(-5.57954)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 10.4566 + (((tickAnim - 30) / 2) * (9.57416-(10.4566)));
            yy = 93.87513 + (((tickAnim - 30) / 2) * (96.94184-(93.87513)));
            zz = 3.04729 + (((tickAnim - 30) / 2) * (-14.20638-(3.04729)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 9.57416 + (((tickAnim - 32) / 1) * (20.01538-(9.57416)));
            yy = 96.94184 + (((tickAnim - 32) / 1) * (95.40849-(96.94184)));
            zz = -14.20638 + (((tickAnim - 32) / 1) * (-5.57954-(-14.20638)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 20.01538 + (((tickAnim - 33) / 1) * (10.4566-(20.01538)));
            yy = 95.40849 + (((tickAnim - 33) / 1) * (93.87513-(95.40849)));
            zz = -5.57954 + (((tickAnim - 33) / 1) * (3.04729-(-5.57954)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 10.4566 + (((tickAnim - 34) / 1) * (9.57416-(10.4566)));
            yy = 93.87513 + (((tickAnim - 34) / 1) * (96.94184-(93.87513)));
            zz = 3.04729 + (((tickAnim - 34) / 1) * (-14.20638-(3.04729)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 9.57416 + (((tickAnim - 35) / 1) * (20.01538-(9.57416)));
            yy = 96.94184 + (((tickAnim - 35) / 1) * (95.40849-(96.94184)));
            zz = -14.20638 + (((tickAnim - 35) / 1) * (-5.57954-(-14.20638)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 20.01538 + (((tickAnim - 36) / 1) * (10.4566-(20.01538)));
            yy = 95.40849 + (((tickAnim - 36) / 1) * (93.87513-(95.40849)));
            zz = -5.57954 + (((tickAnim - 36) / 1) * (3.04729-(-5.57954)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 10.4566 + (((tickAnim - 37) / 1) * (9.57416-(10.4566)));
            yy = 93.87513 + (((tickAnim - 37) / 1) * (96.94184-(93.87513)));
            zz = 3.04729 + (((tickAnim - 37) / 1) * (-14.20638-(3.04729)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(xx), leftForewing.rotateAngleY + (float) Math.toRadians(yy), leftForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 9.57416 + (((tickAnim - 0) / 1) * (20.01538-(9.57416)));
            yy = -96.94184 + (((tickAnim - 0) / 1) * (-95.40849-(-96.94184)));
            zz = 14.20638 + (((tickAnim - 0) / 1) * (5.57954-(14.20638)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 20.01538 + (((tickAnim - 1) / 1) * (10.4566-(20.01538)));
            yy = -95.40849 + (((tickAnim - 1) / 1) * (-93.87513-(-95.40849)));
            zz = 5.57954 + (((tickAnim - 1) / 1) * (-3.04729-(5.57954)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10.4566 + (((tickAnim - 2) / 1) * (9.57416-(10.4566)));
            yy = -93.87513 + (((tickAnim - 2) / 1) * (-96.94184-(-93.87513)));
            zz = -3.04729 + (((tickAnim - 2) / 1) * (14.20638-(-3.04729)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 9.57416 + (((tickAnim - 3) / 1) * (20.01538-(9.57416)));
            yy = -96.94184 + (((tickAnim - 3) / 1) * (-95.40849-(-96.94184)));
            zz = 14.20638 + (((tickAnim - 3) / 1) * (5.57954-(14.20638)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 20.01538 + (((tickAnim - 4) / 1) * (10.4566-(20.01538)));
            yy = -95.40849 + (((tickAnim - 4) / 1) * (-93.87513-(-95.40849)));
            zz = 5.57954 + (((tickAnim - 4) / 1) * (-3.04729-(5.57954)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 10.4566 + (((tickAnim - 5) / 1) * (9.57416-(10.4566)));
            yy = -93.87513 + (((tickAnim - 5) / 1) * (-96.94184-(-93.87513)));
            zz = -3.04729 + (((tickAnim - 5) / 1) * (14.20638-(-3.04729)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 9.57416 + (((tickAnim - 6) / 1) * (20.01538-(9.57416)));
            yy = -96.94184 + (((tickAnim - 6) / 1) * (-95.40849-(-96.94184)));
            zz = 14.20638 + (((tickAnim - 6) / 1) * (5.57954-(14.20638)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 20.01538 + (((tickAnim - 7) / 1) * (10.4566-(20.01538)));
            yy = -95.40849 + (((tickAnim - 7) / 1) * (-93.87513-(-95.40849)));
            zz = 5.57954 + (((tickAnim - 7) / 1) * (-3.04729-(5.57954)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10.4566 + (((tickAnim - 8) / 2) * (9.57416-(10.4566)));
            yy = -93.87513 + (((tickAnim - 8) / 2) * (-96.94184-(-93.87513)));
            zz = -3.04729 + (((tickAnim - 8) / 2) * (14.20638-(-3.04729)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 9.57416 + (((tickAnim - 10) / 0) * (20.01538-(9.57416)));
            yy = -96.94184 + (((tickAnim - 10) / 0) * (-95.40849-(-96.94184)));
            zz = 14.20638 + (((tickAnim - 10) / 0) * (5.57954-(14.20638)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 20.01538 + (((tickAnim - 10) / 1) * (10.4566-(20.01538)));
            yy = -95.40849 + (((tickAnim - 10) / 1) * (-93.87513-(-95.40849)));
            zz = 5.57954 + (((tickAnim - 10) / 1) * (-3.04729-(5.57954)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 10.4566 + (((tickAnim - 11) / 2) * (9.57416-(10.4566)));
            yy = -93.87513 + (((tickAnim - 11) / 2) * (-96.94184-(-93.87513)));
            zz = -3.04729 + (((tickAnim - 11) / 2) * (14.20638-(-3.04729)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 9.57416 + (((tickAnim - 13) / 1) * (20.01538-(9.57416)));
            yy = -96.94184 + (((tickAnim - 13) / 1) * (-95.40849-(-96.94184)));
            zz = 14.20638 + (((tickAnim - 13) / 1) * (5.57954-(14.20638)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 20.01538 + (((tickAnim - 14) / 0) * (10.4566-(20.01538)));
            yy = -95.40849 + (((tickAnim - 14) / 0) * (-93.87513-(-95.40849)));
            zz = 5.57954 + (((tickAnim - 14) / 0) * (-3.04729-(5.57954)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 10.4566 + (((tickAnim - 14) / 2) * (9.57416-(10.4566)));
            yy = -93.87513 + (((tickAnim - 14) / 2) * (-96.94184-(-93.87513)));
            zz = -3.04729 + (((tickAnim - 14) / 2) * (14.20638-(-3.04729)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 9.57416 + (((tickAnim - 16) / 1) * (20.01538-(9.57416)));
            yy = -96.94184 + (((tickAnim - 16) / 1) * (-95.40849-(-96.94184)));
            zz = 14.20638 + (((tickAnim - 16) / 1) * (5.57954-(14.20638)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 20.01538 + (((tickAnim - 17) / 1) * (10.4566-(20.01538)));
            yy = -95.40849 + (((tickAnim - 17) / 1) * (-93.87513-(-95.40849)));
            zz = 5.57954 + (((tickAnim - 17) / 1) * (-3.04729-(5.57954)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 10.4566 + (((tickAnim - 18) / 1) * (9.57416-(10.4566)));
            yy = -93.87513 + (((tickAnim - 18) / 1) * (-96.94184-(-93.87513)));
            zz = -3.04729 + (((tickAnim - 18) / 1) * (14.20638-(-3.04729)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 9.57416 + (((tickAnim - 19) / 1) * (20.01538-(9.57416)));
            yy = -96.94184 + (((tickAnim - 19) / 1) * (-95.40849-(-96.94184)));
            zz = 14.20638 + (((tickAnim - 19) / 1) * (5.57954-(14.20638)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 20.01538 + (((tickAnim - 20) / 1) * (10.4566-(20.01538)));
            yy = -95.40849 + (((tickAnim - 20) / 1) * (-93.87513-(-95.40849)));
            zz = 5.57954 + (((tickAnim - 20) / 1) * (-3.04729-(5.57954)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 10.4566 + (((tickAnim - 21) / 1) * (9.57416-(10.4566)));
            yy = -93.87513 + (((tickAnim - 21) / 1) * (-96.94184-(-93.87513)));
            zz = -3.04729 + (((tickAnim - 21) / 1) * (14.20638-(-3.04729)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 9.57416 + (((tickAnim - 22) / 1) * (20.01538-(9.57416)));
            yy = -96.94184 + (((tickAnim - 22) / 1) * (-95.40849-(-96.94184)));
            zz = 14.20638 + (((tickAnim - 22) / 1) * (5.57954-(14.20638)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 20.01538 + (((tickAnim - 23) / 1) * (10.4566-(20.01538)));
            yy = -95.40849 + (((tickAnim - 23) / 1) * (-93.87513-(-95.40849)));
            zz = 5.57954 + (((tickAnim - 23) / 1) * (-3.04729-(5.57954)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 10.4566 + (((tickAnim - 24) / 2) * (9.57416-(10.4566)));
            yy = -93.87513 + (((tickAnim - 24) / 2) * (-96.94184-(-93.87513)));
            zz = -3.04729 + (((tickAnim - 24) / 2) * (14.20638-(-3.04729)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 9.57416 + (((tickAnim - 26) / 0) * (20.01538-(9.57416)));
            yy = -96.94184 + (((tickAnim - 26) / 0) * (-95.40849-(-96.94184)));
            zz = 14.20638 + (((tickAnim - 26) / 0) * (5.57954-(14.20638)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 20.01538 + (((tickAnim - 26) / 1) * (10.4566-(20.01538)));
            yy = -95.40849 + (((tickAnim - 26) / 1) * (-93.87513-(-95.40849)));
            zz = 5.57954 + (((tickAnim - 26) / 1) * (-3.04729-(5.57954)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 10.4566 + (((tickAnim - 27) / 2) * (9.57416-(10.4566)));
            yy = -93.87513 + (((tickAnim - 27) / 2) * (-96.94184-(-93.87513)));
            zz = -3.04729 + (((tickAnim - 27) / 2) * (14.20638-(-3.04729)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 9.57416 + (((tickAnim - 29) / 1) * (20.01538-(9.57416)));
            yy = -96.94184 + (((tickAnim - 29) / 1) * (-95.40849-(-96.94184)));
            zz = 14.20638 + (((tickAnim - 29) / 1) * (5.57954-(14.20638)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 20.01538 + (((tickAnim - 30) / 0) * (10.4566-(20.01538)));
            yy = -95.40849 + (((tickAnim - 30) / 0) * (-93.87513-(-95.40849)));
            zz = 5.57954 + (((tickAnim - 30) / 0) * (-3.04729-(5.57954)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 10.4566 + (((tickAnim - 30) / 2) * (9.57416-(10.4566)));
            yy = -93.87513 + (((tickAnim - 30) / 2) * (-96.94184-(-93.87513)));
            zz = -3.04729 + (((tickAnim - 30) / 2) * (14.20638-(-3.04729)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 9.57416 + (((tickAnim - 32) / 1) * (20.01538-(9.57416)));
            yy = -96.94184 + (((tickAnim - 32) / 1) * (-95.40849-(-96.94184)));
            zz = 14.20638 + (((tickAnim - 32) / 1) * (5.57954-(14.20638)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 20.01538 + (((tickAnim - 33) / 1) * (10.4566-(20.01538)));
            yy = -95.40849 + (((tickAnim - 33) / 1) * (-93.87513-(-95.40849)));
            zz = 5.57954 + (((tickAnim - 33) / 1) * (-3.04729-(5.57954)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 10.4566 + (((tickAnim - 34) / 1) * (9.57416-(10.4566)));
            yy = -93.87513 + (((tickAnim - 34) / 1) * (-96.94184-(-93.87513)));
            zz = -3.04729 + (((tickAnim - 34) / 1) * (14.20638-(-3.04729)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 9.57416 + (((tickAnim - 35) / 1) * (20.01538-(9.57416)));
            yy = -96.94184 + (((tickAnim - 35) / 1) * (-95.40849-(-96.94184)));
            zz = 14.20638 + (((tickAnim - 35) / 1) * (5.57954-(14.20638)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 20.01538 + (((tickAnim - 36) / 1) * (10.4566-(20.01538)));
            yy = -95.40849 + (((tickAnim - 36) / 1) * (-93.87513-(-95.40849)));
            zz = 5.57954 + (((tickAnim - 36) / 1) * (-3.04729-(5.57954)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 10.4566 + (((tickAnim - 37) / 1) * (9.57416-(10.4566)));
            yy = -93.87513 + (((tickAnim - 37) / 1) * (-96.94184-(-93.87513)));
            zz = -3.04729 + (((tickAnim - 37) / 1) * (14.20638-(-3.04729)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForewing, rightForewing.rotateAngleX + (float) Math.toRadians(xx), rightForewing.rotateAngleY + (float) Math.toRadians(yy), rightForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -1.60069 + (((tickAnim - 0) / 1) * (47.05778-(-1.60069)));
            yy = 79.97745 + (((tickAnim - 0) / 1) * (48.52076-(79.97745)));
            zz = -83.44341 + (((tickAnim - 0) / 1) * (37.38441-(-83.44341)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 47.05778 + (((tickAnim - 1) / 1) * (10.03716-(47.05778)));
            yy = 48.52076 + (((tickAnim - 1) / 1) * (66.03274-(48.52076)));
            zz = 37.38441 + (((tickAnim - 1) / 1) * (45.2931-(37.38441)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 10.03716 + (((tickAnim - 2) / 0) * (-36.59428-(10.03716)));
            yy = 66.03274 + (((tickAnim - 2) / 0) * (60.94607-(66.03274)));
            zz = 45.2931 + (((tickAnim - 2) / 0) * (-64.61002-(45.2931)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -36.59428 + (((tickAnim - 2) / 1) * (-1.60069-(-36.59428)));
            yy = 60.94607 + (((tickAnim - 2) / 1) * (79.97745-(60.94607)));
            zz = -64.61002 + (((tickAnim - 2) / 1) * (-83.44341-(-64.61002)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -1.60069 + (((tickAnim - 3) / 1) * (47.05778-(-1.60069)));
            yy = 79.97745 + (((tickAnim - 3) / 1) * (48.52076-(79.97745)));
            zz = -83.44341 + (((tickAnim - 3) / 1) * (37.38441-(-83.44341)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 47.05778 + (((tickAnim - 4) / 1) * (10.03716-(47.05778)));
            yy = 48.52076 + (((tickAnim - 4) / 1) * (66.03274-(48.52076)));
            zz = 37.38441 + (((tickAnim - 4) / 1) * (45.2931-(37.38441)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 10.03716 + (((tickAnim - 5) / 1) * (-36.59428-(10.03716)));
            yy = 66.03274 + (((tickAnim - 5) / 1) * (60.94607-(66.03274)));
            zz = 45.2931 + (((tickAnim - 5) / 1) * (-64.61002-(45.2931)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -36.59428 + (((tickAnim - 6) / 0) * (-1.60069-(-36.59428)));
            yy = 60.94607 + (((tickAnim - 6) / 0) * (79.97745-(60.94607)));
            zz = -64.61002 + (((tickAnim - 6) / 0) * (-83.44341-(-64.61002)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -1.60069 + (((tickAnim - 6) / 1) * (47.05778-(-1.60069)));
            yy = 79.97745 + (((tickAnim - 6) / 1) * (48.52076-(79.97745)));
            zz = -83.44341 + (((tickAnim - 6) / 1) * (37.38441-(-83.44341)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 47.05778 + (((tickAnim - 7) / 1) * (10.03716-(47.05778)));
            yy = 48.52076 + (((tickAnim - 7) / 1) * (66.03274-(48.52076)));
            zz = 37.38441 + (((tickAnim - 7) / 1) * (45.2931-(37.38441)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 10.03716 + (((tickAnim - 8) / 1) * (-36.59428-(10.03716)));
            yy = 66.03274 + (((tickAnim - 8) / 1) * (60.94607-(66.03274)));
            zz = 45.2931 + (((tickAnim - 8) / 1) * (-64.61002-(45.2931)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -36.59428 + (((tickAnim - 9) / 1) * (-1.60069-(-36.59428)));
            yy = 60.94607 + (((tickAnim - 9) / 1) * (79.97745-(60.94607)));
            zz = -64.61002 + (((tickAnim - 9) / 1) * (-83.44341-(-64.61002)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -1.60069 + (((tickAnim - 10) / 0) * (47.05778-(-1.60069)));
            yy = 79.97745 + (((tickAnim - 10) / 0) * (48.52076-(79.97745)));
            zz = -83.44341 + (((tickAnim - 10) / 0) * (37.38441-(-83.44341)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 47.05778 + (((tickAnim - 10) / 1) * (10.03716-(47.05778)));
            yy = 48.52076 + (((tickAnim - 10) / 1) * (66.03274-(48.52076)));
            zz = 37.38441 + (((tickAnim - 10) / 1) * (45.2931-(37.38441)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 10.03716 + (((tickAnim - 11) / 1) * (-36.59428-(10.03716)));
            yy = 66.03274 + (((tickAnim - 11) / 1) * (60.94607-(66.03274)));
            zz = 45.2931 + (((tickAnim - 11) / 1) * (-64.61002-(45.2931)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -36.59428 + (((tickAnim - 12) / 1) * (-1.60069-(-36.59428)));
            yy = 60.94607 + (((tickAnim - 12) / 1) * (79.97745-(60.94607)));
            zz = -64.61002 + (((tickAnim - 12) / 1) * (-83.44341-(-64.61002)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -1.60069 + (((tickAnim - 13) / 1) * (47.05778-(-1.60069)));
            yy = 79.97745 + (((tickAnim - 13) / 1) * (48.52076-(79.97745)));
            zz = -83.44341 + (((tickAnim - 13) / 1) * (37.38441-(-83.44341)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 47.05778 + (((tickAnim - 14) / 0) * (10.03716-(47.05778)));
            yy = 48.52076 + (((tickAnim - 14) / 0) * (66.03274-(48.52076)));
            zz = 37.38441 + (((tickAnim - 14) / 0) * (45.2931-(37.38441)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 10.03716 + (((tickAnim - 14) / 1) * (-36.59428-(10.03716)));
            yy = 66.03274 + (((tickAnim - 14) / 1) * (60.94607-(66.03274)));
            zz = 45.2931 + (((tickAnim - 14) / 1) * (-64.61002-(45.2931)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -36.59428 + (((tickAnim - 15) / 1) * (-1.60069-(-36.59428)));
            yy = 60.94607 + (((tickAnim - 15) / 1) * (79.97745-(60.94607)));
            zz = -64.61002 + (((tickAnim - 15) / 1) * (-83.44341-(-64.61002)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -1.60069 + (((tickAnim - 16) / 1) * (47.05778-(-1.60069)));
            yy = 79.97745 + (((tickAnim - 16) / 1) * (48.52076-(79.97745)));
            zz = -83.44341 + (((tickAnim - 16) / 1) * (37.38441-(-83.44341)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 47.05778 + (((tickAnim - 17) / 1) * (10.03716-(47.05778)));
            yy = 48.52076 + (((tickAnim - 17) / 1) * (66.03274-(48.52076)));
            zz = 37.38441 + (((tickAnim - 17) / 1) * (45.2931-(37.38441)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 10.03716 + (((tickAnim - 18) / 0) * (-36.59428-(10.03716)));
            yy = 66.03274 + (((tickAnim - 18) / 0) * (60.94607-(66.03274)));
            zz = 45.2931 + (((tickAnim - 18) / 0) * (-64.61002-(45.2931)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -36.59428 + (((tickAnim - 18) / 1) * (-1.60069-(-36.59428)));
            yy = 60.94607 + (((tickAnim - 18) / 1) * (79.97745-(60.94607)));
            zz = -64.61002 + (((tickAnim - 18) / 1) * (-83.44341-(-64.61002)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -1.60069 + (((tickAnim - 19) / 1) * (47.05778-(-1.60069)));
            yy = 79.97745 + (((tickAnim - 19) / 1) * (48.52076-(79.97745)));
            zz = -83.44341 + (((tickAnim - 19) / 1) * (37.38441-(-83.44341)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 47.05778 + (((tickAnim - 20) / 1) * (10.03716-(47.05778)));
            yy = 48.52076 + (((tickAnim - 20) / 1) * (66.03274-(48.52076)));
            zz = 37.38441 + (((tickAnim - 20) / 1) * (45.2931-(37.38441)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 10.03716 + (((tickAnim - 21) / 1) * (-36.59428-(10.03716)));
            yy = 66.03274 + (((tickAnim - 21) / 1) * (60.94607-(66.03274)));
            zz = 45.2931 + (((tickAnim - 21) / 1) * (-64.61002-(45.2931)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -36.59428 + (((tickAnim - 22) / 0) * (-1.60069-(-36.59428)));
            yy = 60.94607 + (((tickAnim - 22) / 0) * (79.97745-(60.94607)));
            zz = -64.61002 + (((tickAnim - 22) / 0) * (-83.44341-(-64.61002)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -1.60069 + (((tickAnim - 22) / 1) * (47.05778-(-1.60069)));
            yy = 79.97745 + (((tickAnim - 22) / 1) * (48.52076-(79.97745)));
            zz = -83.44341 + (((tickAnim - 22) / 1) * (37.38441-(-83.44341)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 47.05778 + (((tickAnim - 23) / 1) * (10.03716-(47.05778)));
            yy = 48.52076 + (((tickAnim - 23) / 1) * (66.03274-(48.52076)));
            zz = 37.38441 + (((tickAnim - 23) / 1) * (45.2931-(37.38441)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 10.03716 + (((tickAnim - 24) / 1) * (-36.59428-(10.03716)));
            yy = 66.03274 + (((tickAnim - 24) / 1) * (60.94607-(66.03274)));
            zz = 45.2931 + (((tickAnim - 24) / 1) * (-64.61002-(45.2931)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -36.59428 + (((tickAnim - 25) / 1) * (-1.60069-(-36.59428)));
            yy = 60.94607 + (((tickAnim - 25) / 1) * (79.97745-(60.94607)));
            zz = -64.61002 + (((tickAnim - 25) / 1) * (-83.44341-(-64.61002)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = -1.60069 + (((tickAnim - 26) / 0) * (47.05778-(-1.60069)));
            yy = 79.97745 + (((tickAnim - 26) / 0) * (48.52076-(79.97745)));
            zz = -83.44341 + (((tickAnim - 26) / 0) * (37.38441-(-83.44341)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 47.05778 + (((tickAnim - 26) / 1) * (10.03716-(47.05778)));
            yy = 48.52076 + (((tickAnim - 26) / 1) * (66.03274-(48.52076)));
            zz = 37.38441 + (((tickAnim - 26) / 1) * (45.2931-(37.38441)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 10.03716 + (((tickAnim - 27) / 1) * (-36.59428-(10.03716)));
            yy = 66.03274 + (((tickAnim - 27) / 1) * (60.94607-(66.03274)));
            zz = 45.2931 + (((tickAnim - 27) / 1) * (-64.61002-(45.2931)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -36.59428 + (((tickAnim - 28) / 1) * (-1.60069-(-36.59428)));
            yy = 60.94607 + (((tickAnim - 28) / 1) * (79.97745-(60.94607)));
            zz = -64.61002 + (((tickAnim - 28) / 1) * (-83.44341-(-64.61002)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -1.60069 + (((tickAnim - 29) / 1) * (47.05778-(-1.60069)));
            yy = 79.97745 + (((tickAnim - 29) / 1) * (48.52076-(79.97745)));
            zz = -83.44341 + (((tickAnim - 29) / 1) * (37.38441-(-83.44341)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 47.05778 + (((tickAnim - 30) / 0) * (10.03716-(47.05778)));
            yy = 48.52076 + (((tickAnim - 30) / 0) * (66.03274-(48.52076)));
            zz = 37.38441 + (((tickAnim - 30) / 0) * (45.2931-(37.38441)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 10.03716 + (((tickAnim - 30) / 1) * (-36.59428-(10.03716)));
            yy = 66.03274 + (((tickAnim - 30) / 1) * (60.94607-(66.03274)));
            zz = 45.2931 + (((tickAnim - 30) / 1) * (-64.61002-(45.2931)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -36.59428 + (((tickAnim - 31) / 1) * (-1.60069-(-36.59428)));
            yy = 60.94607 + (((tickAnim - 31) / 1) * (79.97745-(60.94607)));
            zz = -64.61002 + (((tickAnim - 31) / 1) * (-83.44341-(-64.61002)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -1.60069 + (((tickAnim - 32) / 1) * (47.05778-(-1.60069)));
            yy = 79.97745 + (((tickAnim - 32) / 1) * (48.52076-(79.97745)));
            zz = -83.44341 + (((tickAnim - 32) / 1) * (37.38441-(-83.44341)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 47.05778 + (((tickAnim - 33) / 1) * (10.03716-(47.05778)));
            yy = 48.52076 + (((tickAnim - 33) / 1) * (66.03274-(48.52076)));
            zz = 37.38441 + (((tickAnim - 33) / 1) * (45.2931-(37.38441)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 10.03716 + (((tickAnim - 34) / 0) * (-36.59428-(10.03716)));
            yy = 66.03274 + (((tickAnim - 34) / 0) * (60.94607-(66.03274)));
            zz = 45.2931 + (((tickAnim - 34) / 0) * (-64.61002-(45.2931)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -36.59428 + (((tickAnim - 34) / 1) * (-1.60069-(-36.59428)));
            yy = 60.94607 + (((tickAnim - 34) / 1) * (79.97745-(60.94607)));
            zz = -64.61002 + (((tickAnim - 34) / 1) * (-83.44341-(-64.61002)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -1.60069 + (((tickAnim - 35) / 1) * (47.05778-(-1.60069)));
            yy = 79.97745 + (((tickAnim - 35) / 1) * (48.52076-(79.97745)));
            zz = -83.44341 + (((tickAnim - 35) / 1) * (37.38441-(-83.44341)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 47.05778 + (((tickAnim - 36) / 1) * (10.03716-(47.05778)));
            yy = 48.52076 + (((tickAnim - 36) / 1) * (66.03274-(48.52076)));
            zz = 37.38441 + (((tickAnim - 36) / 1) * (45.2931-(37.38441)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 10.03716 + (((tickAnim - 37) / 1) * (-36.59428-(10.03716)));
            yy = 66.03274 + (((tickAnim - 37) / 1) * (60.94607-(66.03274)));
            zz = 45.2931 + (((tickAnim - 37) / 1) * (-64.61002-(45.2931)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -36.59428 + (((tickAnim - 38) / 0) * (-1.60069-(-36.59428)));
            yy = 60.94607 + (((tickAnim - 38) / 0) * (79.97745-(60.94607)));
            zz = -64.61002 + (((tickAnim - 38) / 0) * (-83.44341-(-64.61002)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(xx), leftHindwing.rotateAngleY + (float) Math.toRadians(yy), leftHindwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -1.60069 + (((tickAnim - 0) / 1) * (47.05778-(-1.60069)));
            yy = -79.97745 + (((tickAnim - 0) / 1) * (-48.52076-(-79.97745)));
            zz = 83.44341 + (((tickAnim - 0) / 1) * (-37.38441-(83.44341)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 47.05778 + (((tickAnim - 1) / 1) * (10.03716-(47.05778)));
            yy = -48.52076 + (((tickAnim - 1) / 1) * (-66.03274-(-48.52076)));
            zz = -37.38441 + (((tickAnim - 1) / 1) * (-45.2931-(-37.38441)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 10.03716 + (((tickAnim - 2) / 0) * (-36.59428-(10.03716)));
            yy = -66.03274 + (((tickAnim - 2) / 0) * (-60.94607-(-66.03274)));
            zz = -45.2931 + (((tickAnim - 2) / 0) * (64.61002-(-45.2931)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -36.59428 + (((tickAnim - 2) / 1) * (-1.60069-(-36.59428)));
            yy = -60.94607 + (((tickAnim - 2) / 1) * (-79.97745-(-60.94607)));
            zz = 64.61002 + (((tickAnim - 2) / 1) * (83.44341-(64.61002)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -1.60069 + (((tickAnim - 3) / 1) * (47.05778-(-1.60069)));
            yy = -79.97745 + (((tickAnim - 3) / 1) * (-48.52076-(-79.97745)));
            zz = 83.44341 + (((tickAnim - 3) / 1) * (-37.38441-(83.44341)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 47.05778 + (((tickAnim - 4) / 1) * (10.03716-(47.05778)));
            yy = -48.52076 + (((tickAnim - 4) / 1) * (-66.03274-(-48.52076)));
            zz = -37.38441 + (((tickAnim - 4) / 1) * (-45.2931-(-37.38441)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 10.03716 + (((tickAnim - 5) / 1) * (-36.59428-(10.03716)));
            yy = -66.03274 + (((tickAnim - 5) / 1) * (-60.94607-(-66.03274)));
            zz = -45.2931 + (((tickAnim - 5) / 1) * (64.61002-(-45.2931)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -36.59428 + (((tickAnim - 6) / 0) * (-1.60069-(-36.59428)));
            yy = -60.94607 + (((tickAnim - 6) / 0) * (-79.97745-(-60.94607)));
            zz = 64.61002 + (((tickAnim - 6) / 0) * (83.44341-(64.61002)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -1.60069 + (((tickAnim - 6) / 1) * (47.05778-(-1.60069)));
            yy = -79.97745 + (((tickAnim - 6) / 1) * (-48.52076-(-79.97745)));
            zz = 83.44341 + (((tickAnim - 6) / 1) * (-37.38441-(83.44341)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 47.05778 + (((tickAnim - 7) / 1) * (10.03716-(47.05778)));
            yy = -48.52076 + (((tickAnim - 7) / 1) * (-66.03274-(-48.52076)));
            zz = -37.38441 + (((tickAnim - 7) / 1) * (-45.2931-(-37.38441)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 10.03716 + (((tickAnim - 8) / 1) * (-36.59428-(10.03716)));
            yy = -66.03274 + (((tickAnim - 8) / 1) * (-60.94607-(-66.03274)));
            zz = -45.2931 + (((tickAnim - 8) / 1) * (64.61002-(-45.2931)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -36.59428 + (((tickAnim - 9) / 1) * (-1.60069-(-36.59428)));
            yy = -60.94607 + (((tickAnim - 9) / 1) * (-79.97745-(-60.94607)));
            zz = 64.61002 + (((tickAnim - 9) / 1) * (83.44341-(64.61002)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -1.60069 + (((tickAnim - 10) / 0) * (47.05778-(-1.60069)));
            yy = -79.97745 + (((tickAnim - 10) / 0) * (-48.52076-(-79.97745)));
            zz = 83.44341 + (((tickAnim - 10) / 0) * (-37.38441-(83.44341)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 47.05778 + (((tickAnim - 10) / 1) * (10.03716-(47.05778)));
            yy = -48.52076 + (((tickAnim - 10) / 1) * (-66.03274-(-48.52076)));
            zz = -37.38441 + (((tickAnim - 10) / 1) * (-45.2931-(-37.38441)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 10.03716 + (((tickAnim - 11) / 1) * (-36.59428-(10.03716)));
            yy = -66.03274 + (((tickAnim - 11) / 1) * (-60.94607-(-66.03274)));
            zz = -45.2931 + (((tickAnim - 11) / 1) * (64.61002-(-45.2931)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -36.59428 + (((tickAnim - 12) / 1) * (-1.60069-(-36.59428)));
            yy = -60.94607 + (((tickAnim - 12) / 1) * (-79.97745-(-60.94607)));
            zz = 64.61002 + (((tickAnim - 12) / 1) * (83.44341-(64.61002)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -1.60069 + (((tickAnim - 13) / 1) * (47.05778-(-1.60069)));
            yy = -79.97745 + (((tickAnim - 13) / 1) * (-48.52076-(-79.97745)));
            zz = 83.44341 + (((tickAnim - 13) / 1) * (-37.38441-(83.44341)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 47.05778 + (((tickAnim - 14) / 0) * (10.03716-(47.05778)));
            yy = -48.52076 + (((tickAnim - 14) / 0) * (-66.03274-(-48.52076)));
            zz = -37.38441 + (((tickAnim - 14) / 0) * (-45.2931-(-37.38441)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 10.03716 + (((tickAnim - 14) / 1) * (-36.59428-(10.03716)));
            yy = -66.03274 + (((tickAnim - 14) / 1) * (-60.94607-(-66.03274)));
            zz = -45.2931 + (((tickAnim - 14) / 1) * (64.61002-(-45.2931)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -36.59428 + (((tickAnim - 15) / 1) * (-1.60069-(-36.59428)));
            yy = -60.94607 + (((tickAnim - 15) / 1) * (-79.97745-(-60.94607)));
            zz = 64.61002 + (((tickAnim - 15) / 1) * (83.44341-(64.61002)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -1.60069 + (((tickAnim - 16) / 1) * (47.05778-(-1.60069)));
            yy = -79.97745 + (((tickAnim - 16) / 1) * (-48.52076-(-79.97745)));
            zz = 83.44341 + (((tickAnim - 16) / 1) * (-37.38441-(83.44341)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 47.05778 + (((tickAnim - 17) / 1) * (10.03716-(47.05778)));
            yy = -48.52076 + (((tickAnim - 17) / 1) * (-66.03274-(-48.52076)));
            zz = -37.38441 + (((tickAnim - 17) / 1) * (-45.2931-(-37.38441)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 10.03716 + (((tickAnim - 18) / 0) * (-36.59428-(10.03716)));
            yy = -66.03274 + (((tickAnim - 18) / 0) * (-60.94607-(-66.03274)));
            zz = -45.2931 + (((tickAnim - 18) / 0) * (64.61002-(-45.2931)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -36.59428 + (((tickAnim - 18) / 1) * (-1.60069-(-36.59428)));
            yy = -60.94607 + (((tickAnim - 18) / 1) * (-79.97745-(-60.94607)));
            zz = 64.61002 + (((tickAnim - 18) / 1) * (83.44341-(64.61002)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -1.60069 + (((tickAnim - 19) / 1) * (47.05778-(-1.60069)));
            yy = -79.97745 + (((tickAnim - 19) / 1) * (-48.52076-(-79.97745)));
            zz = 83.44341 + (((tickAnim - 19) / 1) * (-37.38441-(83.44341)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 47.05778 + (((tickAnim - 20) / 1) * (10.03716-(47.05778)));
            yy = -48.52076 + (((tickAnim - 20) / 1) * (-66.03274-(-48.52076)));
            zz = -37.38441 + (((tickAnim - 20) / 1) * (-45.2931-(-37.38441)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 10.03716 + (((tickAnim - 21) / 1) * (-36.59428-(10.03716)));
            yy = -66.03274 + (((tickAnim - 21) / 1) * (-60.94607-(-66.03274)));
            zz = -45.2931 + (((tickAnim - 21) / 1) * (64.61002-(-45.2931)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -36.59428 + (((tickAnim - 22) / 0) * (-1.60069-(-36.59428)));
            yy = -60.94607 + (((tickAnim - 22) / 0) * (-79.97745-(-60.94607)));
            zz = 64.61002 + (((tickAnim - 22) / 0) * (83.44341-(64.61002)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -1.60069 + (((tickAnim - 22) / 1) * (47.05778-(-1.60069)));
            yy = -79.97745 + (((tickAnim - 22) / 1) * (-48.52076-(-79.97745)));
            zz = 83.44341 + (((tickAnim - 22) / 1) * (-37.38441-(83.44341)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 47.05778 + (((tickAnim - 23) / 1) * (10.03716-(47.05778)));
            yy = -48.52076 + (((tickAnim - 23) / 1) * (-66.03274-(-48.52076)));
            zz = -37.38441 + (((tickAnim - 23) / 1) * (-45.2931-(-37.38441)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 10.03716 + (((tickAnim - 24) / 1) * (-36.59428-(10.03716)));
            yy = -66.03274 + (((tickAnim - 24) / 1) * (-60.94607-(-66.03274)));
            zz = -45.2931 + (((tickAnim - 24) / 1) * (64.61002-(-45.2931)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -36.59428 + (((tickAnim - 25) / 1) * (-1.60069-(-36.59428)));
            yy = -60.94607 + (((tickAnim - 25) / 1) * (-79.97745-(-60.94607)));
            zz = 64.61002 + (((tickAnim - 25) / 1) * (83.44341-(64.61002)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = -1.60069 + (((tickAnim - 26) / 0) * (47.05778-(-1.60069)));
            yy = -79.97745 + (((tickAnim - 26) / 0) * (-48.52076-(-79.97745)));
            zz = 83.44341 + (((tickAnim - 26) / 0) * (-37.38441-(83.44341)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 47.05778 + (((tickAnim - 26) / 1) * (10.03716-(47.05778)));
            yy = -48.52076 + (((tickAnim - 26) / 1) * (-66.03274-(-48.52076)));
            zz = -37.38441 + (((tickAnim - 26) / 1) * (-45.2931-(-37.38441)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 10.03716 + (((tickAnim - 27) / 1) * (-36.59428-(10.03716)));
            yy = -66.03274 + (((tickAnim - 27) / 1) * (-60.94607-(-66.03274)));
            zz = -45.2931 + (((tickAnim - 27) / 1) * (64.61002-(-45.2931)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -36.59428 + (((tickAnim - 28) / 1) * (-1.60069-(-36.59428)));
            yy = -60.94607 + (((tickAnim - 28) / 1) * (-79.97745-(-60.94607)));
            zz = 64.61002 + (((tickAnim - 28) / 1) * (83.44341-(64.61002)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -1.60069 + (((tickAnim - 29) / 1) * (47.05778-(-1.60069)));
            yy = -79.97745 + (((tickAnim - 29) / 1) * (-48.52076-(-79.97745)));
            zz = 83.44341 + (((tickAnim - 29) / 1) * (-37.38441-(83.44341)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 47.05778 + (((tickAnim - 30) / 0) * (10.03716-(47.05778)));
            yy = -48.52076 + (((tickAnim - 30) / 0) * (-66.03274-(-48.52076)));
            zz = -37.38441 + (((tickAnim - 30) / 0) * (-45.2931-(-37.38441)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 10.03716 + (((tickAnim - 30) / 1) * (-36.59428-(10.03716)));
            yy = -66.03274 + (((tickAnim - 30) / 1) * (-60.94607-(-66.03274)));
            zz = -45.2931 + (((tickAnim - 30) / 1) * (64.61002-(-45.2931)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -36.59428 + (((tickAnim - 31) / 1) * (-1.60069-(-36.59428)));
            yy = -60.94607 + (((tickAnim - 31) / 1) * (-79.97745-(-60.94607)));
            zz = 64.61002 + (((tickAnim - 31) / 1) * (83.44341-(64.61002)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -1.60069 + (((tickAnim - 32) / 1) * (47.05778-(-1.60069)));
            yy = -79.97745 + (((tickAnim - 32) / 1) * (-48.52076-(-79.97745)));
            zz = 83.44341 + (((tickAnim - 32) / 1) * (-37.38441-(83.44341)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 47.05778 + (((tickAnim - 33) / 1) * (10.03716-(47.05778)));
            yy = -48.52076 + (((tickAnim - 33) / 1) * (-66.03274-(-48.52076)));
            zz = -37.38441 + (((tickAnim - 33) / 1) * (-45.2931-(-37.38441)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 10.03716 + (((tickAnim - 34) / 0) * (-36.59428-(10.03716)));
            yy = -66.03274 + (((tickAnim - 34) / 0) * (-60.94607-(-66.03274)));
            zz = -45.2931 + (((tickAnim - 34) / 0) * (64.61002-(-45.2931)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -36.59428 + (((tickAnim - 34) / 1) * (-1.60069-(-36.59428)));
            yy = -60.94607 + (((tickAnim - 34) / 1) * (-79.97745-(-60.94607)));
            zz = 64.61002 + (((tickAnim - 34) / 1) * (83.44341-(64.61002)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -1.60069 + (((tickAnim - 35) / 1) * (47.05778-(-1.60069)));
            yy = -79.97745 + (((tickAnim - 35) / 1) * (-48.52076-(-79.97745)));
            zz = 83.44341 + (((tickAnim - 35) / 1) * (-37.38441-(83.44341)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 47.05778 + (((tickAnim - 36) / 1) * (10.03716-(47.05778)));
            yy = -48.52076 + (((tickAnim - 36) / 1) * (-66.03274-(-48.52076)));
            zz = -37.38441 + (((tickAnim - 36) / 1) * (-45.2931-(-37.38441)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 10.03716 + (((tickAnim - 37) / 1) * (-36.59428-(10.03716)));
            yy = -66.03274 + (((tickAnim - 37) / 1) * (-60.94607-(-66.03274)));
            zz = -45.2931 + (((tickAnim - 37) / 1) * (64.61002-(-45.2931)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -36.59428 + (((tickAnim - 38) / 0) * (-1.60069-(-36.59428)));
            yy = -60.94607 + (((tickAnim - 38) / 0) * (-79.97745-(-60.94607)));
            zz = 64.61002 + (((tickAnim - 38) / 0) * (83.44341-(64.61002)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(xx), rightHindwing.rotateAngleY + (float) Math.toRadians(yy), rightHindwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(22.19157), rightLeg2.rotateAngleY + (float) Math.toRadians(3.81024), rightLeg2.rotateAngleZ + (float) Math.toRadians(-39.2524863734-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-90))*20));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-90))*10), rightLeg3.rotateAngleY + (float) Math.toRadians(0), rightLeg3.rotateAngleZ + (float) Math.toRadians(-55));



    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraUmenopterix entity = (EntityPrehistoricFloraUmenopterix) entitylivingbaseIn;
        int animCycle = 9;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(thorax, thorax.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750*2))*2), thorax.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750+100))*2), thorax.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750-90))*4));
        this.thorax.rotationPointX = this.thorax.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750-60))*0.1);
        this.thorax.rotationPointY = this.thorax.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750*2-60))*0.1);
        this.thorax.rotationPointZ = this.thorax.rotationPointZ + (float)(0);


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*10), leftAntenna.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*4), leftAntenna.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*4));


        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750+50))*5), rightAntenna.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*4)), rightAntenna.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*4)));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1.44261 + (((tickAnim - 0) / 5) * (1.90069-(1.44261)));
            yy = 29.96852 + (((tickAnim - 0) / 5) * (-4.81564-(29.96852)));
            zz = 2.88614 + (((tickAnim - 0) / 5) * (-5.46935-(2.88614)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 1.90069 + (((tickAnim - 5) / 2) * (-4.41282-(1.90069)));
            yy = -4.81564 + (((tickAnim - 5) / 2) * (11.9048-(-4.81564)));
            zz = -5.46935 + (((tickAnim - 5) / 2) * (-29.43614-(-5.46935)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -4.41282 + (((tickAnim - 7) / 3) * (1.44261-(-4.41282)));
            yy = 11.9048 + (((tickAnim - 7) / 3) * (29.96852-(11.9048)));
            zz = -29.43614 + (((tickAnim - 7) / 3) * (2.88614-(-29.43614)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.90069 + (((tickAnim - 0) / 2) * (-4.41282-(1.90069)));
            yy = 4.81564 + (((tickAnim - 0) / 2) * (-11.9048-(4.81564)));
            zz = 5.46935 + (((tickAnim - 0) / 2) * (29.43614-(5.46935)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -4.41282 + (((tickAnim - 2) / 3) * (1.44261-(-4.41282)));
            yy = -11.9048 + (((tickAnim - 2) / 3) * (-29.96852-(-11.9048)));
            zz = 29.43614 + (((tickAnim - 2) / 3) * (-2.88614-(29.43614)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.44261 + (((tickAnim - 5) / 5) * (1.90069-(1.44261)));
            yy = -29.96852 + (((tickAnim - 5) / 5) * (4.81564-(-29.96852)));
            zz = -2.88614 + (((tickAnim - 5) / 5) * (5.46935-(-2.88614)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.53775 + (((tickAnim - 0) / 2) * (-8.06091-(-1.53775)));
            yy = -14.92277 + (((tickAnim - 0) / 2) * (-7.59659-(-14.92277)));
            zz = 5.95141 + (((tickAnim - 0) / 2) * (-41.26478-(5.95141)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -8.06091 + (((tickAnim - 2) / 3) * (-20.45981-(-8.06091)));
            yy = -7.59659 + (((tickAnim - 2) / 3) * (12.60049-(-7.59659)));
            zz = -41.26478 + (((tickAnim - 2) / 3) * (-14.32947-(-41.26478)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -20.45981 + (((tickAnim - 5) / 5) * (-1.53775-(-20.45981)));
            yy = 12.60049 + (((tickAnim - 5) / 5) * (-14.92277-(12.60049)));
            zz = -14.32947 + (((tickAnim - 5) / 5) * (5.95141-(-14.32947)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -3.25 + (((tickAnim - 0) / 5) * (4.18731-(-3.25)));
            yy = 12.5 + (((tickAnim - 0) / 5) * (-14.84112-(12.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (2.98095-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 4.18731 + (((tickAnim - 5) / 2) * (8.70018-(4.18731)));
            yy = -14.84112 + (((tickAnim - 5) / 2) * (-2.13053-(-14.84112)));
            zz = 2.98095 + (((tickAnim - 5) / 2) * (-23.50192-(2.98095)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 8.70018 + (((tickAnim - 7) / 3) * (-3.25-(8.70018)));
            yy = -2.13053 + (((tickAnim - 7) / 3) * (12.5-(-2.13053)));
            zz = -23.50192 + (((tickAnim - 7) / 3) * (0-(-23.50192)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.45981 + (((tickAnim - 0) / 5) * (-1.53775-(-20.45981)));
            yy = -12.60049 + (((tickAnim - 0) / 5) * (14.92277-(-12.60049)));
            zz = 14.32947 + (((tickAnim - 0) / 5) * (-5.95141-(14.32947)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -1.53775 + (((tickAnim - 5) / 2) * (-8.06091-(-1.53775)));
            yy = 14.92277 + (((tickAnim - 5) / 2) * (7.59659-(14.92277)));
            zz = -5.95141 + (((tickAnim - 5) / 2) * (41.26478-(-5.95141)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -8.06091 + (((tickAnim - 7) / 3) * (-20.45981-(-8.06091)));
            yy = 7.59659 + (((tickAnim - 7) / 3) * (-12.60049-(7.59659)));
            zz = 41.26478 + (((tickAnim - 7) / 3) * (14.32947-(41.26478)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 4.18731 + (((tickAnim - 0) / 2) * (8.70018-(4.18731)));
            yy = 14.84112 + (((tickAnim - 0) / 2) * (2.13053-(14.84112)));
            zz = -2.98095 + (((tickAnim - 0) / 2) * (23.50192-(-2.98095)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 8.70018 + (((tickAnim - 2) / 3) * (-3.25-(8.70018)));
            yy = 2.13053 + (((tickAnim - 2) / 3) * (-12.5-(2.13053)));
            zz = 23.50192 + (((tickAnim - 2) / 3) * (0-(23.50192)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.25 + (((tickAnim - 5) / 5) * (4.18731-(-3.25)));
            yy = -12.5 + (((tickAnim - 5) / 5) * (14.84112-(-12.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (-2.98095-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isMoving) {
        EntityPrehistoricFloraUmenopterix entity = (EntityPrehistoricFloraUmenopterix) entitylivingbaseIn;
        int animCycle = 9;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        if (!isMoving) {
            tickAnim = 0;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(thorax, thorax.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750*2))*2), thorax.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750+100))*2), thorax.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750-90))*4));
        this.thorax.rotationPointX = this.thorax.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750-60))*0.1);
        this.thorax.rotationPointY = this.thorax.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750*2-60))*0.1);
        this.thorax.rotationPointZ = this.thorax.rotationPointZ + (float)(0);


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*10), leftAntenna.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*4), leftAntenna.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*4));


        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750+50))*5), rightAntenna.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*4)), rightAntenna.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*4)));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1.44261 + (((tickAnim - 0) / 5) * (1.90069-(1.44261)));
            yy = 29.96852 + (((tickAnim - 0) / 5) * (-4.81564-(29.96852)));
            zz = 2.88614 + (((tickAnim - 0) / 5) * (-5.46935-(2.88614)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 1.90069 + (((tickAnim - 5) / 2) * (-4.41282-(1.90069)));
            yy = -4.81564 + (((tickAnim - 5) / 2) * (11.9048-(-4.81564)));
            zz = -5.46935 + (((tickAnim - 5) / 2) * (-29.43614-(-5.46935)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -4.41282 + (((tickAnim - 7) / 3) * (1.44261-(-4.41282)));
            yy = 11.9048 + (((tickAnim - 7) / 3) * (29.96852-(11.9048)));
            zz = -29.43614 + (((tickAnim - 7) / 3) * (2.88614-(-29.43614)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.90069 + (((tickAnim - 0) / 2) * (-4.41282-(1.90069)));
            yy = 4.81564 + (((tickAnim - 0) / 2) * (-11.9048-(4.81564)));
            zz = 5.46935 + (((tickAnim - 0) / 2) * (29.43614-(5.46935)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -4.41282 + (((tickAnim - 2) / 3) * (1.44261-(-4.41282)));
            yy = -11.9048 + (((tickAnim - 2) / 3) * (-29.96852-(-11.9048)));
            zz = 29.43614 + (((tickAnim - 2) / 3) * (-2.88614-(29.43614)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.44261 + (((tickAnim - 5) / 5) * (1.90069-(1.44261)));
            yy = -29.96852 + (((tickAnim - 5) / 5) * (4.81564-(-29.96852)));
            zz = -2.88614 + (((tickAnim - 5) / 5) * (5.46935-(-2.88614)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.53775 + (((tickAnim - 0) / 2) * (-8.06091-(-1.53775)));
            yy = -14.92277 + (((tickAnim - 0) / 2) * (-7.59659-(-14.92277)));
            zz = 5.95141 + (((tickAnim - 0) / 2) * (-41.26478-(5.95141)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -8.06091 + (((tickAnim - 2) / 3) * (-20.45981-(-8.06091)));
            yy = -7.59659 + (((tickAnim - 2) / 3) * (12.60049-(-7.59659)));
            zz = -41.26478 + (((tickAnim - 2) / 3) * (-14.32947-(-41.26478)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -20.45981 + (((tickAnim - 5) / 5) * (-1.53775-(-20.45981)));
            yy = 12.60049 + (((tickAnim - 5) / 5) * (-14.92277-(12.60049)));
            zz = -14.32947 + (((tickAnim - 5) / 5) * (5.95141-(-14.32947)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -3.25 + (((tickAnim - 0) / 5) * (4.18731-(-3.25)));
            yy = 12.5 + (((tickAnim - 0) / 5) * (-14.84112-(12.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (2.98095-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 4.18731 + (((tickAnim - 5) / 2) * (8.70018-(4.18731)));
            yy = -14.84112 + (((tickAnim - 5) / 2) * (-2.13053-(-14.84112)));
            zz = 2.98095 + (((tickAnim - 5) / 2) * (-23.50192-(2.98095)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 8.70018 + (((tickAnim - 7) / 3) * (-3.25-(8.70018)));
            yy = -2.13053 + (((tickAnim - 7) / 3) * (12.5-(-2.13053)));
            zz = -23.50192 + (((tickAnim - 7) / 3) * (0-(-23.50192)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.45981 + (((tickAnim - 0) / 5) * (-1.53775-(-20.45981)));
            yy = -12.60049 + (((tickAnim - 0) / 5) * (14.92277-(-12.60049)));
            zz = 14.32947 + (((tickAnim - 0) / 5) * (-5.95141-(14.32947)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -1.53775 + (((tickAnim - 5) / 2) * (-8.06091-(-1.53775)));
            yy = 14.92277 + (((tickAnim - 5) / 2) * (7.59659-(14.92277)));
            zz = -5.95141 + (((tickAnim - 5) / 2) * (41.26478-(-5.95141)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -8.06091 + (((tickAnim - 7) / 3) * (-20.45981-(-8.06091)));
            yy = 7.59659 + (((tickAnim - 7) / 3) * (-12.60049-(7.59659)));
            zz = 41.26478 + (((tickAnim - 7) / 3) * (14.32947-(41.26478)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 4.18731 + (((tickAnim - 0) / 2) * (8.70018-(4.18731)));
            yy = 14.84112 + (((tickAnim - 0) / 2) * (2.13053-(14.84112)));
            zz = -2.98095 + (((tickAnim - 0) / 2) * (23.50192-(-2.98095)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 8.70018 + (((tickAnim - 2) / 3) * (-3.25-(8.70018)));
            yy = 2.13053 + (((tickAnim - 2) / 3) * (-12.5-(2.13053)));
            zz = 23.50192 + (((tickAnim - 2) / 3) * (0-(23.50192)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.25 + (((tickAnim - 5) / 5) * (4.18731-(-3.25)));
            yy = -12.5 + (((tickAnim - 5) / 5) * (14.84112-(-12.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (-2.98095-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
