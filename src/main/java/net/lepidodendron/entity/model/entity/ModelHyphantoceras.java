package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHyphantoceras;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHyphantoceras extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer tentacle6;
    private final AdvancedModelRenderer tentacle1;
    private final AdvancedModelRenderer tentacle7;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle9;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacle8;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacle10;
    private final AdvancedModelRenderer tentacle5;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer siphon;

    private ModelAnimator animator;

    public ModelHyphantoceras() {
        this.textureWidth = 50;
        this.textureHeight = 50;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -16.0F, 6.0F);
        this.base.addChild(shell);
        this.setRotateAngle(shell, -0.1309F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -1.5F, 0.0F, -3.0F, 3, 13, 3, 0.0F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, -0.5672F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 22, 23, -1.0F, 0.0F, -3.0F, 2, 4, 3, 0.04F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, -0.829F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 0, 28, -1.0F, 0.0F, -3.0F, 2, 4, 3, 0.02F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.829F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 28, 9, -1.0F, 0.0F, -2.0F, 2, 4, 2, 0.01F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(1.0F, 4.0F, 0.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.48F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 28, 0, -2.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 13, 0, -4.0F, 4.0F, -5.0F, 2, 2, 5, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 39, 34, -2.0F, 4.0F, -5.0F, 1, 2, 2, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 13, 8, -3.0F, 12.0F, -8.0F, 2, 2, 5, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 22, 16, -3.0F, 18.0F, -10.0F, 2, 2, 4, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 30, 31, -2.0F, 25.0F, -12.0F, 1, 1, 3, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 33, 25, -2.0F, 31.0F, -14.0F, 1, 1, 3, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 13, 16, -1.0F, 4.0F, -5.0F, 2, 10, 2, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 0, 17, -1.0F, 12.0F, -8.0F, 2, 8, 2, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 11, 29, -1.0F, 18.0F, -10.0F, 1, 8, 1, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 35, 16, -1.0F, 25.0F, -12.0F, 1, 7, 1, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 39, 39, -1.0F, 31.0F, -14.0F, 1, 4, 1, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 40, 16, -1.0F, 36.0F, -15.0F, 1, 4, 1, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 30, 36, -2.0F, 35.0F, -15.0F, 2, 1, 2, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 37, 0, -2.0F, 40.0F, -16.0F, 2, 1, 2, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 27, 40, -1.0F, 41.0F, -16.0F, 1, 3, 1, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 37, 4, -2.0F, 44.0F, -17.0F, 2, 1, 2, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 32, 40, -1.0F, 45.0F, -17.0F, 1, 3, 1, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 0, 41, -1.0F, 49.0F, -18.0F, 1, 3, 1, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 37, 8, -2.0F, 48.0F, -18.0F, 2, 1, 2, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 9, 39, -2.0F, 52.0F, -19.0F, 2, 1, 2, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 5, 43, -1.0F, 53.0F, -19.0F, 1, 2, 1, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 18, 39, -2.0F, 55.0F, -20.0F, 2, 1, 2, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 10, 43, -1.0F, 56.0F, -20.0F, 1, 2, 1, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 39, 30, -2.0F, 58.0F, -21.0F, 2, 1, 2, 0.0F, false));
        this.shell5.cubeList.add(new ModelBox(shell5, 15, 43, -1.0F, 59.0F, -21.0F, 1, 2, 1, 0.0F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, 0.0F, -2.75F);
        this.shell.addChild(mantle);
        this.setRotateAngle(mantle, -0.4931F, 0.0F, 0.0F);
        this.mantle.cubeList.add(new ModelBox(mantle, 0, 36, -1.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));
        this.mantle.cubeList.add(new ModelBox(mantle, 25, 45, -0.5F, -2.025F, 0.5F, 1, 1, 1, 0.0F, false));

        this.tentacle6 = new AdvancedModelRenderer(this);
        this.tentacle6.setRotationPoint(0.5F, -2.0F, 1.5F);
        this.mantle.addChild(tentacle6);
        this.setRotateAngle(tentacle6, -0.6109F, 0.0F, 0.9599F);
        this.tentacle6.cubeList.add(new ModelBox(tentacle6, 16, 31, 0.0F, -4.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.tentacle1 = new AdvancedModelRenderer(this);
        this.tentacle1.setRotationPoint(-0.5F, -2.0F, 1.5F);
        this.mantle.addChild(tentacle1);
        this.setRotateAngle(tentacle1, -0.6109F, 0.0F, -0.9599F);
        this.tentacle1.cubeList.add(new ModelBox(tentacle1, 16, 31, 0.0F, -4.0F, -0.5F, 0, 4, 3, 0.0F, true));

        this.tentacle7 = new AdvancedModelRenderer(this);
        this.tentacle7.setRotationPoint(1.0F, -2.0F, 1.5F);
        this.mantle.addChild(tentacle7);
        this.setRotateAngle(tentacle7, 0.0F, 0.0F, 1.309F);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 16, 31, 0.0F, -4.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(-1.0F, -2.0F, 1.5F);
        this.mantle.addChild(tentacle2);
        this.setRotateAngle(tentacle2, 0.0F, 0.0F, -1.309F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 16, 31, 0.0F, -4.0F, -0.5F, 0, 4, 3, 0.0F, true));

        this.tentacle9 = new AdvancedModelRenderer(this);
        this.tentacle9.setRotationPoint(0.75F, -2.0F, 0.5F);
        this.mantle.addChild(tentacle9);
        this.setRotateAngle(tentacle9, 0.5236F, 0.0F, 1.1345F);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 23, 31, 0.0F, -4.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(-0.75F, -2.0F, 0.5F);
        this.mantle.addChild(tentacle4);
        this.setRotateAngle(tentacle4, 0.5236F, 0.0F, -1.1345F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 23, 31, 0.0F, -4.0F, -0.5F, 0, 4, 3, 0.0F, true));

        this.tentacle8 = new AdvancedModelRenderer(this);
        this.tentacle8.setRotationPoint(1.0F, -2.0F, 0.5F);
        this.mantle.addChild(tentacle8);
        this.setRotateAngle(tentacle8, 0.0873F, 0.0F, 1.2654F);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 23, 31, 0.0F, -4.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(-1.0F, -2.0F, 0.5F);
        this.mantle.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 0.0873F, 0.0F, -1.2654F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 23, 31, 0.0F, -4.0F, -0.5F, 0, 4, 3, 0.0F, true));

        this.tentacle10 = new AdvancedModelRenderer(this);
        this.tentacle10.setRotationPoint(0.25F, -2.0F, 0.5F);
        this.mantle.addChild(tentacle10);
        this.setRotateAngle(tentacle10, 0.9055F, -0.1166F, 1.0139F);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 23, 31, 0.0F, -4.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(-0.25F, -2.0F, 0.5F);
        this.mantle.addChild(tentacle5);
        this.setRotateAngle(tentacle5, 0.9055F, 0.1166F, -1.0139F);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 23, 31, 0.0F, -4.0F, -0.5F, 0, 4, 3, 0.0F, true));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(1.0F, -0.75F, 1.0F);
        this.mantle.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.0F, 0.9599F, 0.0F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 42, 27, 0.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-1.0F, -0.75F, 1.0F);
        this.mantle.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.0F, -0.9599F, 0.0F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 42, 27, -1.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F, true));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, -0.5F, 1.25F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, -0.9163F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 20, 43, -0.5F, -2.5F, -1.05F, 1, 2, 1, 0.0F, false));
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void renderStaticWall(float f) {
        this.base.rotateAngleY = (float) Math.toRadians(90);
        this.base.offsetY = -0.2F;
        this.base.offsetX = -0.15F;
        this.base.offsetZ = -0.4F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.base.offsetZ = -0.1F;
        this.base.offsetY = -0.03F;
        this.base.offsetX = -0.02F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -1.2F;
        this.base.offsetX = 1.2F;
        this.base.rotateAngleY = (float)Math.toRadians(242);
        this.base.rotateAngleX = (float)Math.toRadians(-18);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 1.23F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
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
        EntityPrehistoricFloraHyphantoceras ee = (EntityPrehistoricFloraHyphantoceras) entitylivingbaseIn;

        if(ee.isReallyInWater()) {
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHyphantoceras entity = (EntityPrehistoricFloraHyphantoceras) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(shell, shell.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+120+50))*2), shell.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+190+90))*10), shell.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-240))*2));
        this.shell.rotationPointX = this.shell.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*1);
        this.shell.rotationPointY = this.shell.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+280))*1);
        this.shell.rotationPointZ = this.shell.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+500))*1);
        this.setRotateAngle(tentacle6, tentacle6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160+30*4))*2), tentacle6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50+30*4))*2), tentacle6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100+30*4))*2));
        this.tentacle6.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);
        this.setRotateAngle(tentacle1, tentacle1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160+30*5))*2), tentacle1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50+30*5))*2), tentacle1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100+30*5))*2));
        this.tentacle1.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);
        this.setRotateAngle(tentacle7, tentacle7.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160+30*3))*2), tentacle7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50+30*3))*2), tentacle7.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100+30*3))*2));
        this.tentacle7.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);
        this.setRotateAngle(tentacle2, tentacle2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160+30*4))*2), tentacle2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50+30*4))*2), tentacle2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100+30*4))*2));
        this.tentacle2.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);
        this.setRotateAngle(tentacle9, tentacle9.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160+30))*2), tentacle9.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50+30))*2), tentacle9.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100+30))*2));
        this.tentacle9.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);
        this.setRotateAngle(tentacle4, tentacle4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160+30*2))*2), tentacle4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50+30*2))*2), tentacle4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100+30*2))*2));
        this.tentacle4.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);
        this.setRotateAngle(tentacle8, tentacle8.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160+30*2))*2), tentacle8.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50+30*2))*2), tentacle8.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100+30*2))*2));
        this.tentacle8.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);
        this.setRotateAngle(tentacle3, tentacle3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160+30*3))*2), tentacle3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50+30*3))*2), tentacle3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100+30*3))*2));
        this.tentacle3.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);
        this.setRotateAngle(tentacle10, tentacle10.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))*2), tentacle10.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2), tentacle10.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*2));
        this.tentacle10.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);
        this.setRotateAngle(tentacle5, tentacle5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160+30))*2), tentacle5.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50+30))*2), tentacle5.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100+30))*2));
        this.tentacle5.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraHyphantoceras ee = (EntityPrehistoricFloraHyphantoceras) e;

        if (!e.isInWater()) {
            this.base.rotateAngleZ = (float) Math.toRadians(90);
            this.base.offsetX = -1f;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

