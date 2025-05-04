package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraRayonnoceras;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelRayonnoceras extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
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
    private final AdvancedModelRenderer cube_r1;

    private ModelAnimator animator;

    public ModelRayonnoceras() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 15.0F, 4.0F);
        this.setRotateAngle(body, 1.5708F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 20, 20, -3.5F, -7.4F, -2.0F, 7, 7, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 13, -4.0F, -8.25F, 4.0F, 8, 8, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -7.75F, 9.0F, 7, 7, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 26, 0, -3.0F, -7.25F, 15.0F, 6, 6, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 27, -2.5F, -6.75F, 21.0F, 5, 5, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 16, 33, -2.0F, -6.25F, 27.0F, 4, 4, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 30, 39, -1.5F, -5.75F, 33.0F, 3, 3, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 40, 18, -1.0F, -5.25F, 39.0F, 2, 2, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 20, 0, -0.5F, -4.75F, 45.0F, 1, 1, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 30, 33, -3.5F, -8.2F, -3.0F, 7, 1, 5, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 21, 12, -4.0F, -8.2F, -1.0F, 8, 1, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 42, 39, 2.9F, -6.5F, 0.5F, 1, 3, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 42, 39, -3.9F, -6.5F, 0.5F, 1, 3, 3, 0.0F, true));

        this.arm1 = new AdvancedModelRenderer(this);
        this.arm1.setRotationPoint(0.8F, -6.35F, -1.75F);
        this.body.addChild(arm1);
        this.arm1.cubeList.add(new ModelBox(arm1, 44, 0, -0.25F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));
        this.arm1.cubeList.add(new ModelBox(arm1, 42, 12, -0.75F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.armb1 = new AdvancedModelRenderer(this);
        this.armb1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm1.addChild(armb1);
        this.armb1.cubeList.add(new ModelBox(armb1, 20, 43, -0.49F, -0.51F, -3.0F, 1, 1, 3, 0.0F, false));

        this.arm6 = new AdvancedModelRenderer(this);
        this.arm6.setRotationPoint(-0.8F, -6.35F, -1.75F);
        this.body.addChild(arm6);
        this.arm6.cubeList.add(new ModelBox(arm6, 44, 0, -0.75F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));
        this.arm6.cubeList.add(new ModelBox(arm6, 42, 12, -0.25F, -0.5F, -3.0F, 1, 1, 3, -0.01F, true));

        this.armb6 = new AdvancedModelRenderer(this);
        this.armb6.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm6.addChild(armb6);
        this.armb6.cubeList.add(new ModelBox(armb6, 20, 43, -0.51F, -0.51F, -3.0F, 1, 1, 3, 0.0F, true));

        this.arm2 = new AdvancedModelRenderer(this);
        this.arm2.setRotationPoint(2.4F, -5.85F, -1.75F);
        this.body.addChild(arm2);
        this.setRotateAngle(arm2, 0.0F, 0.0F, 0.5236F);
        this.arm2.cubeList.add(new ModelBox(arm2, 44, 0, -0.25F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 42, 12, -0.75F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.armb2 = new AdvancedModelRenderer(this);
        this.armb2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm2.addChild(armb2);
        this.armb2.cubeList.add(new ModelBox(armb2, 20, 43, -0.49F, -0.51F, -3.0F, 1, 1, 3, 0.0F, false));

        this.arm7 = new AdvancedModelRenderer(this);
        this.arm7.setRotationPoint(-2.4F, -5.85F, -1.75F);
        this.body.addChild(arm7);
        this.setRotateAngle(arm7, 0.0F, 0.0F, -0.5236F);
        this.arm7.cubeList.add(new ModelBox(arm7, 44, 0, -0.75F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));
        this.arm7.cubeList.add(new ModelBox(arm7, 42, 12, -0.25F, -0.5F, -3.0F, 1, 1, 3, -0.01F, true));

        this.armb7 = new AdvancedModelRenderer(this);
        this.armb7.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm7.addChild(armb7);
        this.armb7.cubeList.add(new ModelBox(armb7, 20, 43, -0.51F, -0.51F, -3.0F, 1, 1, 3, 0.0F, true));

        this.arm3 = new AdvancedModelRenderer(this);
        this.arm3.setRotationPoint(2.9F, -4.2F, -1.75F);
        this.body.addChild(arm3);
        this.setRotateAngle(arm3, 0.0F, 0.0F, 1.5708F);
        this.arm3.cubeList.add(new ModelBox(arm3, 44, 0, -0.25F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));
        this.arm3.cubeList.add(new ModelBox(arm3, 42, 12, -0.75F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.armb3 = new AdvancedModelRenderer(this);
        this.armb3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm3.addChild(armb3);
        this.armb3.cubeList.add(new ModelBox(armb3, 20, 43, -0.49F, -0.51F, -3.0F, 1, 1, 3, 0.0F, false));

        this.arm8 = new AdvancedModelRenderer(this);
        this.arm8.setRotationPoint(-2.9F, -4.2F, -1.75F);
        this.body.addChild(arm8);
        this.setRotateAngle(arm8, 0.0F, 0.0F, -1.5708F);
        this.arm8.cubeList.add(new ModelBox(arm8, 44, 0, -0.75F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));
        this.arm8.cubeList.add(new ModelBox(arm8, 42, 12, -0.25F, -0.5F, -3.0F, 1, 1, 3, -0.01F, true));

        this.armb8 = new AdvancedModelRenderer(this);
        this.armb8.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm8.addChild(armb8);
        this.armb8.cubeList.add(new ModelBox(armb8, 20, 43, -0.51F, -0.51F, -3.0F, 1, 1, 3, 0.0F, true));

        this.arm4 = new AdvancedModelRenderer(this);
        this.arm4.setRotationPoint(2.65F, -2.6F, -1.75F);
        this.body.addChild(arm4);
        this.setRotateAngle(arm4, 0.0F, 0.0F, 2.0944F);
        this.arm4.cubeList.add(new ModelBox(arm4, 44, 0, -0.25F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));
        this.arm4.cubeList.add(new ModelBox(arm4, 42, 12, -0.75F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.armb4 = new AdvancedModelRenderer(this);
        this.armb4.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm4.addChild(armb4);
        this.armb4.cubeList.add(new ModelBox(armb4, 20, 43, -0.49F, -0.51F, -3.0F, 1, 1, 3, 0.0F, false));

        this.arm9 = new AdvancedModelRenderer(this);
        this.arm9.setRotationPoint(-2.65F, -2.6F, -1.75F);
        this.body.addChild(arm9);
        this.setRotateAngle(arm9, 0.0F, 0.0F, -2.0944F);
        this.arm9.cubeList.add(new ModelBox(arm9, 44, 0, -0.75F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));
        this.arm9.cubeList.add(new ModelBox(arm9, 42, 12, -0.25F, -0.5F, -3.0F, 1, 1, 3, -0.01F, true));

        this.armb9 = new AdvancedModelRenderer(this);
        this.armb9.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm9.addChild(armb9);
        this.armb9.cubeList.add(new ModelBox(armb9, 20, 43, -0.51F, -0.51F, -3.0F, 1, 1, 3, 0.0F, true));

        this.arm5 = new AdvancedModelRenderer(this);
        this.arm5.setRotationPoint(1.15F, -1.6F, -1.75F);
        this.body.addChild(arm5);
        this.setRotateAngle(arm5, 0.0F, 0.0F, 2.9671F);
        this.arm5.cubeList.add(new ModelBox(arm5, 44, 0, -0.25F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));
        this.arm5.cubeList.add(new ModelBox(arm5, 42, 12, -0.75F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.armb5 = new AdvancedModelRenderer(this);
        this.armb5.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm5.addChild(armb5);
        this.armb5.cubeList.add(new ModelBox(armb5, 20, 43, -0.49F, -0.51F, -3.0F, 1, 1, 3, 0.0F, false));

        this.arm10 = new AdvancedModelRenderer(this);
        this.arm10.setRotationPoint(-1.15F, -1.6F, -1.75F);
        this.body.addChild(arm10);
        this.setRotateAngle(arm10, 0.0F, 0.0F, -2.9671F);
        this.arm10.cubeList.add(new ModelBox(arm10, 44, 0, -0.75F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));
        this.arm10.cubeList.add(new ModelBox(arm10, 42, 12, -0.25F, -0.5F, -3.0F, 1, 1, 3, -0.01F, true));

        this.armb10 = new AdvancedModelRenderer(this);
        this.armb10.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm10.addChild(armb10);
        this.armb10.cubeList.add(new ModelBox(armb10, 20, 43, -0.51F, -0.51F, -3.0F, 1, 1, 3, 0.0F, true));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, -1.3461F, 4.4151F);
        this.body.addChild(siphon);
        this.setRotateAngle(siphon, 0.0873F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.siphon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 38, -1.5F, -0.9611F, -7.0353F, 3, 2, 7, 0.0F, false));
        
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
        this.body.offsetZ = -0.1F;
        this.body.offsetY = -0.03F;
        this.body.offsetX = -0.02F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = 0.5F;
        this.body.offsetX = 0.05F;
        this.body.offsetZ = -2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(0);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 0.4F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 1.2F, 0.8F, -0.2F);
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
    public void setLivingAnimations(EntityLivingBase entitylivingbodyIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbodyIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraRayonnoceras ee = (EntityPrehistoricFloraRayonnoceras) entitylivingbodyIn;

        if(ee.isReallyInWater()) {
            animWalking(entitylivingbodyIn, limbSwing, limbSwingAmount, partialTickTime);
        }

        if(ee.isAtBottom() && ee.canBeVertical()) {
            animWalkingForage(entitylivingbodyIn, limbSwing, limbSwingAmount, partialTickTime);
        }



    }

    public void animWalking(EntityLivingBase entitylivingbodyIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraRayonnoceras entity = (EntityPrehistoricFloraRayonnoceras) entitylivingbodyIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-90))*-1), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-20))*1);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-50))*-0.5);
        this.setRotateAngle(arm1, arm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-100))*-2), arm1.rotateAngleY + (float) Math.toRadians(0), arm1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb1, armb1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-180))*-2), armb1.rotateAngleY + (float) Math.toRadians(0), armb1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm6, arm6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-120))*-2), arm6.rotateAngleY + (float) Math.toRadians(0), arm6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb6, armb6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-180))*-2), armb6.rotateAngleY + (float) Math.toRadians(0), armb6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-90))*-2), arm2.rotateAngleY + (float) Math.toRadians(0), arm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb2, armb2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-150))*-2), armb2.rotateAngleY + (float) Math.toRadians(0), armb2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm7, arm7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-80))*-2), arm7.rotateAngleY + (float) Math.toRadians(0), arm7.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb7, armb7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-140))*-2), armb7.rotateAngleY + (float) Math.toRadians(0), armb7.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm3, arm3.rotateAngleX + (float) Math.toRadians(0), arm3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-90))*2), arm3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb3, armb3.rotateAngleX + (float) Math.toRadians(0), armb3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-150))*2), armb3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm8, arm8.rotateAngleX + (float) Math.toRadians(0), arm8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-90))*-2), arm8.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb8, armb8.rotateAngleX + (float) Math.toRadians(0), armb8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-150))*-2), armb8.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm4, arm4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-90))*3), arm4.rotateAngleY + (float) Math.toRadians(0), arm4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb4, armb4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-150))*4), armb4.rotateAngleY + (float) Math.toRadians(0), armb4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm9, arm9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-80))*3), arm9.rotateAngleY + (float) Math.toRadians(0), arm9.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb9, armb9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-140))*5), armb9.rotateAngleY + (float) Math.toRadians(0), armb9.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5, arm5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-130))*4), arm5.rotateAngleY + (float) Math.toRadians(0), arm5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb5, armb5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-170))*5), armb5.rotateAngleY + (float) Math.toRadians(0), armb5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm10, arm10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-120))*4), arm10.rotateAngleY + (float) Math.toRadians(0), arm10.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb10, armb10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145-180))*5), armb10.rotateAngleY + (float) Math.toRadians(0), armb10.rotateAngleZ + (float) Math.toRadians(0));
        this.siphon.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*145))*0.1));
        
    }
    public void animWalkingForage(EntityLivingBase entitylivingbodyIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraRayonnoceras entity = (EntityPrehistoricFloraRayonnoceras) entitylivingbodyIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(-3.075+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-80))*-0.4);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(-2.8);


        this.setRotateAngle(arm1, arm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-20))*-5), arm1.rotateAngleY + (float) Math.toRadians(0), arm1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb1, armb1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-120))*-8), armb1.rotateAngleY + (float) Math.toRadians(0), armb1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm6, arm6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-20))*-5), arm6.rotateAngleY + (float) Math.toRadians(0), arm6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb6, armb6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-120))*-8), armb6.rotateAngleY + (float) Math.toRadians(0), armb6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-20))*-5), arm2.rotateAngleY + (float) Math.toRadians(0), arm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb2, armb2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-120))*-8), armb2.rotateAngleY + (float) Math.toRadians(0), armb2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm7, arm7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-20))*-5), arm7.rotateAngleY + (float) Math.toRadians(0), arm7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb7, armb7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-120))*-8), armb7.rotateAngleY + (float) Math.toRadians(0), armb7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm3, arm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-20))*-5), arm3.rotateAngleY + (float) Math.toRadians(0), arm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb3, armb3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-120))*-8), armb3.rotateAngleY + (float) Math.toRadians(0), armb3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm8, arm8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-20))*-5), arm8.rotateAngleY + (float) Math.toRadians(0), arm8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb8, armb8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-120))*-8), armb8.rotateAngleY + (float) Math.toRadians(0), armb8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm4, arm4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-20))*-5), arm4.rotateAngleY + (float) Math.toRadians(0), arm4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb4, armb4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-120))*-8), armb4.rotateAngleY + (float) Math.toRadians(0), armb4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm9, arm9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-20))*-5), arm9.rotateAngleY + (float) Math.toRadians(0), arm9.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb9, armb9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-120))*-8), armb9.rotateAngleY + (float) Math.toRadians(0), armb9.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm5, arm5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-20))*-5), arm5.rotateAngleY + (float) Math.toRadians(0), arm5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb5, armb5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-120))*-8), armb5.rotateAngleY + (float) Math.toRadians(0), armb5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm10, arm10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-20))*-5), arm10.rotateAngleY + (float) Math.toRadians(0), arm10.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armb10, armb10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-120))*-8), armb10.rotateAngleY + (float) Math.toRadians(0), armb10.rotateAngleZ + (float) Math.toRadians(0));


        this.siphon.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-80))*0.07));

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        this.body.offsetY = 0.5F;

        EntityPrehistoricFloraRayonnoceras ee = (EntityPrehistoricFloraRayonnoceras) e;
        if(e.isInWater() && !((EntityPrehistoricFloraRayonnoceras) e).canBeVertical()) {
            this.body.rotateAngleX = (float) Math.toRadians(0);
            this.body.rotateAngleY = (float) Math.toRadians(180);
        }


        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetX = -1f;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

