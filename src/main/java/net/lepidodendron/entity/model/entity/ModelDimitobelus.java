package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDimitobelus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDimitobelus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer finL;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer finR;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer arm1;
    private final AdvancedModelRenderer armb1;
    private final AdvancedModelRenderer arm6;
    private final AdvancedModelRenderer armb6;
    private final AdvancedModelRenderer arm2;
    private final AdvancedModelRenderer armb2;
    private final AdvancedModelRenderer arm7;
    private final AdvancedModelRenderer armb7;
    private final AdvancedModelRenderer arm3;
    private final AdvancedModelRenderer armb3;
    private final AdvancedModelRenderer arm8;
    private final AdvancedModelRenderer armb8;
    private final AdvancedModelRenderer arm4;
    private final AdvancedModelRenderer armb4;
    private final AdvancedModelRenderer arm9;
    private final AdvancedModelRenderer armb9;
    private final AdvancedModelRenderer arm5;
    private final AdvancedModelRenderer armb5;
    private final AdvancedModelRenderer arm10;
    private final AdvancedModelRenderer armb10;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer cube_r3;

    private ModelAnimator animator;

    public ModelDimitobelus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 54, -3.4F, -5.25F, -1.5F, 1, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 32, 26, -2.5F, -5.75F, -1.75F, 5, 4, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -6.0F, 1.25F, 6, 5, 13, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 32, 33, -2.0F, -5.0F, 18.25F, 4, 3, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 53, -1.0F, -4.5F, 21.25F, 2, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 32, 18, -2.5F, -5.5F, 14.25F, 5, 4, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 42, 51, 2.4F, -5.25F, -1.5F, 1, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 38, 16, 2.425F, -4.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 42, 16, -3.425F, -4.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 38, 6, -2.0F, -2.25F, -1.74F, 4, 1, 3, 0.0F, false));

        this.finL = new AdvancedModelRenderer(this);
        this.finL.setRotationPoint(2.25F, -4.0F, 17.0F);
        this.body.addChild(finL);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.25F, 0.0F, 2.25F);
        this.finL.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2182F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 30, -1.25F, 0.0F, -9.5F, 4, 0, 12, 0.0F, false));

        this.finR = new AdvancedModelRenderer(this);
        this.finR.setRotationPoint(-2.25F, -4.0F, 17.0F);
        this.body.addChild(finR);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.25F, 0.0F, 2.25F);
        this.finR.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2182F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 18, -2.75F, 0.0F, -9.5F, 4, 0, 12, 0.0F, false));

        this.arm1 = new AdvancedModelRenderer(this);
        this.arm1.setRotationPoint(0.65F, -5.15F, -1.75F);
        this.body.addChild(arm1);
        this.setRotateAngle(arm1, 0.0175F, 0.0F, 0.1745F);
        this.arm1.cubeList.add(new ModelBox(arm1, 12, 48, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.armb1 = new AdvancedModelRenderer(this);
        this.armb1.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm1.addChild(armb1);
        this.armb1.cubeList.add(new ModelBox(armb1, 38, 0, -0.49F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm6 = new AdvancedModelRenderer(this);
        this.arm6.setRotationPoint(-0.65F, -5.15F, -1.75F);
        this.body.addChild(arm6);
        this.setRotateAngle(arm6, 0.0175F, 0.0F, -0.1745F);
        this.arm6.cubeList.add(new ModelBox(arm6, 50, 20, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.armb6 = new AdvancedModelRenderer(this);
        this.armb6.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm6.addChild(armb6);
        this.armb6.cubeList.add(new ModelBox(armb6, 44, 39, -0.51F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm2 = new AdvancedModelRenderer(this);
        this.arm2.setRotationPoint(1.85F, -4.6F, -1.75F);
        this.body.addChild(arm2);
        this.setRotateAngle(arm2, 0.0175F, 0.0F, 0.7854F);
        this.arm2.cubeList.add(new ModelBox(arm2, 48, 45, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.armb2 = new AdvancedModelRenderer(this);
        this.armb2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm2.addChild(armb2);
        this.armb2.cubeList.add(new ModelBox(armb2, 38, 10, -0.49F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm7 = new AdvancedModelRenderer(this);
        this.arm7.setRotationPoint(-1.85F, -4.6F, -1.75F);
        this.body.addChild(arm7);
        this.setRotateAngle(arm7, 0.0175F, 0.0F, -0.7854F);
        this.arm7.cubeList.add(new ModelBox(arm7, 48, 50, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.armb7 = new AdvancedModelRenderer(this);
        this.armb7.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm7.addChild(armb7);
        this.armb7.cubeList.add(new ModelBox(armb7, 24, 45, -0.51F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm3 = new AdvancedModelRenderer(this);
        this.arm3.setRotationPoint(2.1F, -3.4F, -1.75F);
        this.body.addChild(arm3);
        this.setRotateAngle(arm3, 0.0175F, 0.0F, 1.5708F);
        this.arm3.cubeList.add(new ModelBox(arm3, 50, 0, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.armb3 = new AdvancedModelRenderer(this);
        this.armb3.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm3.addChild(armb3);
        this.armb3.cubeList.add(new ModelBox(armb3, 32, 39, -0.49F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm8 = new AdvancedModelRenderer(this);
        this.arm8.setRotationPoint(-2.1F, -3.4F, -1.75F);
        this.body.addChild(arm8);
        this.setRotateAngle(arm8, 0.0175F, 0.0F, -1.5708F);
        this.arm8.cubeList.add(new ModelBox(arm8, 22, 51, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.armb8 = new AdvancedModelRenderer(this);
        this.armb8.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm8.addChild(armb8);
        this.armb8.cubeList.add(new ModelBox(armb8, 36, 45, -0.51F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm4 = new AdvancedModelRenderer(this);
        this.arm4.setRotationPoint(1.85F, -2.2F, -1.75F);
        this.body.addChild(arm4);
        this.setRotateAngle(arm4, 0.0175F, 0.0F, 2.3562F);
        this.arm4.cubeList.add(new ModelBox(arm4, 50, 10, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.armb4 = new AdvancedModelRenderer(this);
        this.armb4.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm4.addChild(armb4);
        this.armb4.cubeList.add(new ModelBox(armb4, 0, 42, -0.49F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm9 = new AdvancedModelRenderer(this);
        this.arm9.setRotationPoint(-1.85F, -2.2F, -1.75F);
        this.body.addChild(arm9);
        this.setRotateAngle(arm9, 0.0175F, 0.0F, -2.3562F);
        this.arm9.cubeList.add(new ModelBox(arm9, 32, 51, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.armb9 = new AdvancedModelRenderer(this);
        this.armb9.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm9.addChild(armb9);
        this.armb9.cubeList.add(new ModelBox(armb9, 46, 33, -0.51F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm5 = new AdvancedModelRenderer(this);
        this.arm5.setRotationPoint(0.65F, -1.65F, -1.75F);
        this.body.addChild(arm5);
        this.setRotateAngle(arm5, 0.0175F, 0.0F, 2.9671F);
        this.arm5.cubeList.add(new ModelBox(arm5, 50, 15, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.armb5 = new AdvancedModelRenderer(this);
        this.armb5.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm5.addChild(armb5);
        this.armb5.cubeList.add(new ModelBox(armb5, 12, 42, -0.49F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm10 = new AdvancedModelRenderer(this);
        this.arm10.setRotationPoint(-0.65F, -1.65F, -1.75F);
        this.body.addChild(arm10);
        this.setRotateAngle(arm10, 0.0175F, 0.0F, -2.9671F);
        this.arm10.cubeList.add(new ModelBox(arm10, 52, 5, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.armb10 = new AdvancedModelRenderer(this);
        this.armb10.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm10.addChild(armb10);
        this.armb10.cubeList.add(new ModelBox(armb10, 0, 48, -0.51F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, -1.2592F, -0.317F);
        this.body.addChild(siphon);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.7592F, 2.317F);
        this.siphon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 26, -0.5F, -1.65F, -4.15F, 1, 1, 4, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.2F;
        this.body.offsetX = -0.15F;
        this.body.offsetZ = -0.4F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.body.offsetZ = -0.1F;
        this.body.offsetY = -0.03F;
        this.body.offsetX = -0.02F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.9F;
        this.body.offsetX = 0.6F;
        this.body.rotateAngleY = (float)Math.toRadians(242);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 3.23F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraDimitobelus ee = (EntityPrehistoricFloraDimitobelus) entitylivingbaseIn;

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDimitobelus entity = (EntityPrehistoricFloraDimitobelus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*112/0.310-20))*-0.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.34-80))*0.1));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75+5))*-0.3);
        this.setRotateAngle(finL, finL.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*268/0.75-50))*8), finL.rotateAngleY + (float) Math.toRadians(0), finL.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75+20))*-20));
        this.setRotateAngle(finR, finR.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*268/0.75-50))*8), finR.rotateAngleY + (float) Math.toRadians(0), finR.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75+20))*20));
        this.setRotateAngle(arm1, arm1.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-10))*-0.5), arm1.rotateAngleY + (float) Math.toRadians(0), arm1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb1, armb1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-20))*0.8), armb1.rotateAngleY + (float) Math.toRadians(0), armb1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm6, arm6.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-10))*-0.5), arm6.rotateAngleY + (float) Math.toRadians(0), arm6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb6, armb6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-20))*0.8), armb6.rotateAngleY + (float) Math.toRadians(0), armb6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-20))*-0.5), arm2.rotateAngleY + (float) Math.toRadians(0), arm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb2, armb2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-40))*0.8), armb2.rotateAngleY + (float) Math.toRadians(0), armb2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm7, arm7.rotateAngleX + (float) Math.toRadians(8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-20))*-0.5), arm7.rotateAngleY + (float) Math.toRadians(0), arm7.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb7, armb7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-40))*0.8), armb7.rotateAngleY + (float) Math.toRadians(0), armb7.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm3, arm3.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-30))*-0.5), arm3.rotateAngleY + (float) Math.toRadians(0), arm3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb3, armb3.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-60))*0.8), armb3.rotateAngleY + (float) Math.toRadians(0), armb3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm8, arm8.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-30))*-0.5), arm8.rotateAngleY + (float) Math.toRadians(0), arm8.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb8, armb8.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-60))*0.8), armb8.rotateAngleY + (float) Math.toRadians(0), armb8.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm4, arm4.rotateAngleX + (float) Math.toRadians(8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-20))*-0.5), arm4.rotateAngleY + (float) Math.toRadians(0), arm4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb4, armb4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-40))*0.5), armb4.rotateAngleY + (float) Math.toRadians(0), armb4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm9, arm9.rotateAngleX + (float) Math.toRadians(8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-20))*-0.5), arm9.rotateAngleY + (float) Math.toRadians(0), arm9.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb9, armb9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-40))*0.8), armb9.rotateAngleY + (float) Math.toRadians(0), armb9.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5, arm5.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-10))*-0.5), arm5.rotateAngleY + (float) Math.toRadians(0), arm5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb5, armb5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-20))*0.8), armb5.rotateAngleY + (float) Math.toRadians(0), armb5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm10, arm10.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-10))*-0.5), arm10.rotateAngleY + (float) Math.toRadians(0), arm10.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb10, armb10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-20))*0.8), armb10.rotateAngleY + (float) Math.toRadians(0), armb10.rotateAngleZ + (float) Math.toRadians(0));
        this.siphon.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-150))*-0.1),(float)1);
      
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDimitobelus entity = (EntityPrehistoricFloraDimitobelus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*225/0.312-60))*-1.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*225/0.34-80))*0.5));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75+15))*-0.5);
        this.setRotateAngle(finL, finL.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-50))*10), finL.rotateAngleY + (float) Math.toRadians(0), finL.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75+20))*-25));
        this.setRotateAngle(finR, finR.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-50))*10), finR.rotateAngleY + (float) Math.toRadians(0), finR.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75+20))*25));
        this.setRotateAngle(arm1, arm1.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-20))*-0.5), arm1.rotateAngleY + (float) Math.toRadians(0), arm1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb1, armb1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-40))*1), armb1.rotateAngleY + (float) Math.toRadians(0), armb1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm6, arm6.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-20))*-0.5), arm6.rotateAngleY + (float) Math.toRadians(0), arm6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb6, armb6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-40))*1), armb6.rotateAngleY + (float) Math.toRadians(0), armb6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-40))*-0.5), arm2.rotateAngleY + (float) Math.toRadians(0), arm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb2, armb2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-80))*1), armb2.rotateAngleY + (float) Math.toRadians(0), armb2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm7, arm7.rotateAngleX + (float) Math.toRadians(8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-40))*-0.5), arm7.rotateAngleY + (float) Math.toRadians(0), arm7.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb7, armb7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-80))*1), armb7.rotateAngleY + (float) Math.toRadians(0), armb7.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm3, arm3.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-80))*-0.5), arm3.rotateAngleY + (float) Math.toRadians(0), arm3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb3, armb3.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-120))*1), armb3.rotateAngleY + (float) Math.toRadians(0), armb3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm8, arm8.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-80))*-0.5), arm8.rotateAngleY + (float) Math.toRadians(0), arm8.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb8, armb8.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-120))*1), armb8.rotateAngleY + (float) Math.toRadians(0), armb8.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm4, arm4.rotateAngleX + (float) Math.toRadians(8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-40))*-0.5), arm4.rotateAngleY + (float) Math.toRadians(0), arm4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb4, armb4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-80))*1), armb4.rotateAngleY + (float) Math.toRadians(0), armb4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm9, arm9.rotateAngleX + (float) Math.toRadians(8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-40))*-0.5), arm9.rotateAngleY + (float) Math.toRadians(0), arm9.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb9, armb9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-80))*1), armb9.rotateAngleY + (float) Math.toRadians(0), armb9.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5, arm5.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-20))*-0.5), arm5.rotateAngleY + (float) Math.toRadians(0), arm5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb5, armb5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-40))*1), armb5.rotateAngleY + (float) Math.toRadians(0), armb5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm10, arm10.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-20))*-0.5), arm10.rotateAngleY + (float) Math.toRadians(0), arm10.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb10, armb10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-40))*1), armb10.rotateAngleY + (float) Math.toRadians(0), armb10.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(siphon, siphon.rotateAngleX + (float) Math.toRadians(-5.5), siphon.rotateAngleY + (float) Math.toRadians(0), siphon.rotateAngleZ + (float) Math.toRadians(0));
        this.siphon.rotationPointX = this.siphon.rotationPointX + (float)(0);
        this.siphon.rotationPointY = this.siphon.rotationPointY - (float)(0.2);
        this.siphon.rotationPointZ = this.siphon.rotationPointZ + (float)(0);
        this.siphon.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.75-150))*-0.3),(float)1);
        
    }



    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraDimitobelus ee = (EntityPrehistoricFloraDimitobelus) e;

        this.body.rotateAngleY = (float) Math.toRadians(180);
        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = -0.2F;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

