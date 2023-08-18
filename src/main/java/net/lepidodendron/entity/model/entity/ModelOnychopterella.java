package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraOnychopterella;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelOnychopterella extends AdvancedModelBase {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legRs5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legLs5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Body5;

    private ModelAnimator animator;


    public ModelOnychopterella() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 20.5F, -3.0F);
        this.setRotateAngle(Body, 0.0873F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 6, -0.5F, 0.2F, -4.5F, 1, 1, 2, 0.01F, false));
        this.Body.cubeList.add(new ModelBox(Body, 14, 6, -2.5F, 0.25F, -3.0F, 5, 1, 3, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -3.0F, -0.25F, -5.0F, 6, 1, 5, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.9F, 0.0F, -3.0F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.0873F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.65F, -0.25F, -0.4F, 1, 1, 1, 0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.9F, 0.0F, -3.0F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.0873F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.35F, -0.25F, -0.4F, 1, 1, 1, 0.01F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-0.5F, 0.75F, -4.0F);
        this.Body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.6109F, -0.8727F);
        this.legR1.cubeList.add(new ModelBox(legR1, 21, 5, -2.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(0.5F, 0.75F, -4.0F);
        this.Body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.6109F, 0.8727F);
        this.legL1.cubeList.add(new ModelBox(legL1, 21, 5, -0.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.75F, 0.75F, -3.75F);
        this.Body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, -0.1309F, -0.9163F);
        this.legR2.cubeList.add(new ModelBox(legR2, 16, 4, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.75F, 0.75F, -3.75F);
        this.Body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.1309F, 0.9163F);
        this.legL2.cubeList.add(new ModelBox(legL2, 16, 4, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.75F, 0.75F, -3.0F);
        this.Body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.1745F, -0.6981F);
        this.legR3.cubeList.add(new ModelBox(legR3, 16, 3, -4.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.75F, 0.75F, -3.0F);
        this.Body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.1745F, 0.6981F);
        this.legL3.cubeList.add(new ModelBox(legL3, 16, 3, 0.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.25F, 0.75F, -2.75F);
        this.Body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.6545F, -0.6545F);
        this.legR4.cubeList.add(new ModelBox(legR4, 14, 10, -4.9782F, -0.5019F, -0.5377F, 5, 1, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.25F, 0.75F, -2.75F);
        this.Body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -0.6545F, 0.6545F);
        this.legL4.cubeList.add(new ModelBox(legL4, 14, 10, -0.0218F, -0.5019F, -0.5377F, 5, 1, 1, 0.0F, true));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-2.25F, 0.85F, -0.75F);
        this.Body.addChild(legR5);
        this.setRotateAngle(legR5, -0.1745F, 0.7418F, -0.2182F);
        this.legR5.cubeList.add(new ModelBox(legR5, 10, 21, -2.9623F, -0.5019F, -0.5218F, 3, 1, 1, 0.0F, false));

        this.legRs5 = new AdvancedModelRenderer(this);
        this.legRs5.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.legR5.addChild(legRs5);
        this.setRotateAngle(legRs5, 0.0F, 0.0F, -0.5236F);
        this.legRs5.cubeList.add(new ModelBox(legRs5, 18, 15, -2.9623F, -0.5019F, -0.5218F, 3, 1, 1, -0.01F, false));
        this.legRs5.cubeList.add(new ModelBox(legRs5, 0, 2, -4.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(2.25F, 0.85F, -0.75F);
        this.Body.addChild(legL5);
        this.setRotateAngle(legL5, -0.1745F, -0.7418F, 0.2182F);
        this.legL5.cubeList.add(new ModelBox(legL5, 10, 21, -0.0377F, -0.5019F, -0.5218F, 3, 1, 1, 0.0F, true));

        this.legLs5 = new AdvancedModelRenderer(this);
        this.legLs5.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.legL5.addChild(legLs5);
        this.setRotateAngle(legLs5, 0.0F, 0.0F, 0.5236F);
        this.legLs5.cubeList.add(new ModelBox(legLs5, 18, 15, -0.0377F, -0.5019F, -0.5218F, 3, 1, 1, -0.01F, true));
        this.legLs5.cubeList.add(new ModelBox(legLs5, 0, 2, 3.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Body.addChild(body2);
        this.setRotateAngle(body2, -0.1309F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 13, -3.5F, -0.15F, 0.0F, 7, 1, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 17, 0, -3.0F, -0.15F, 4.0F, 6, 1, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 6, -2.0F, -0.65F, 0.0F, 4, 1, 6, 0.01F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 18, 12, -1.5F, -0.4F, 0.0F, 3, 1, 2, 0.01F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 6, 18, -1.5F, -0.4F, 0.0F, 3, 1, 2, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 18, -0.5F, -0.4F, 1.0F, 1, 1, 4, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 16, 18, -1.0F, -0.4F, -0.75F, 2, 1, 2, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Body3, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Body4, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Body5, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(legL4, 0.0F, -0.6F, 0.8F);
        this.setRotateAngle(legR4, 0.0F, 0.6F, -0.8F);
        this.Body.offsetY = -0.05F;
        this.Body.render(0.01F);
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
       // this.body.offsetY = 0.4F;
        //this.Body.offsetY = -0.2F;
        //this.Body.offsetZ = 0.1F;

        float speed = 0.2F;
        AdvancedModelRenderer[] fishTail = {this.Body3, this.Body4, this.Body5};


        EntityPrehistoricFloraOnychopterella slimon = (EntityPrehistoricFloraOnychopterella) e;


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {//on land
            if(!slimon.getIsMoving()) {
                this.chainSwing(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
                this.chainWave(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
            }

            if (!e.isInWater()) {
                this.chainSwing(fishTail, speed, 0.01F, -2, f2, 1);
            }
        }
    }
    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraOnychopterella ee = (EntityPrehistoricFloraOnychopterella) entitylivingbaseIn;
        //Swimming pose:

        if (ee.isReallyInWater()) {
            if ((!ee.isReallySwimming())) {
                //Walk pose:
                if (ee.getIsFast()) {
                    animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }

            } else {
                //animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        } else {

        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOnychopterella entity = (EntityPrehistoricFloraOnychopterella) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+90))), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*0.5));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(-0.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+30))*0.25);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0);
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body3, Body3.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-60))*1.5), Body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+30))*1.5), Body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body4, Body4.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-120))*2), Body4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))*2), Body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body5, Body5.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-240))*2.5), Body5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*2.5), Body5.rotateAngleZ + (float) Math.toRadians(0));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 3.63354 + (((tickAnim - 0) / 10) * (-9.55716-(3.63354)));
            yy = -66.08779 + (((tickAnim - 0) / 10) * (-27.25269-(-66.08779)));
            zz = 16.03017 + (((tickAnim - 0) / 10) * (17.39683-(16.03017)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -9.55716 + (((tickAnim - 10) / 5) * (-6.2581-(-9.55716)));
            yy = -27.25269 + (((tickAnim - 10) / 5) * (-44.83766-(-27.25269)));
            zz = 17.39683 + (((tickAnim - 10) / 5) * (39.37759-(17.39683)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -6.2581 + (((tickAnim - 15) / 5) * (3.63354-(-6.2581)));
            yy = -44.83766 + (((tickAnim - 15) / 5) * (-66.08779-(-44.83766)));
            zz = 39.37759 + (((tickAnim - 15) / 5) * (16.03017-(39.37759)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -10.24539 + (((tickAnim - 0) / 5) * (-6.2581-(-10.24539)));
            yy = 27.94078 + (((tickAnim - 0) / 5) * (44.83766-(27.94078)));
            zz = -13.3968 + (((tickAnim - 0) / 5) * (-39.37759-(-13.3968)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -6.2581 + (((tickAnim - 5) / 5) * (1.99526-(-6.2581)));
            yy = 44.83766 + (((tickAnim - 5) / 5) * (66.23514-(44.83766)));
            zz = -39.37759 + (((tickAnim - 5) / 5) * (-19.44508-(-39.37759)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.99526 + (((tickAnim - 10) / 10) * (-10.24539-(1.99526)));
            yy = 66.23514 + (((tickAnim - 10) / 10) * (27.94078-(66.23514)));
            zz = -19.44508 + (((tickAnim - 10) / 10) * (-13.3968-(-19.44508)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 51.81918 + (((tickAnim - 0) / 5) * (59.67212-(51.81918)));
            yy = 0.88765 + (((tickAnim - 0) / 5) * (-18.58846-(0.88765)));
            zz = 12.49499 + (((tickAnim - 0) / 5) * (28.28504-(12.49499)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 59.67212 + (((tickAnim - 5) / 5) * (46.31425-(59.67212)));
            yy = -18.58846 + (((tickAnim - 5) / 5) * (-45.37014-(-18.58846)));
            zz = 28.28504 + (((tickAnim - 5) / 5) * (28.5549-(28.28504)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 46.31425 + (((tickAnim - 10) / 5) * (58.1841-(46.31425)));
            yy = -45.37014 + (((tickAnim - 10) / 5) * (-18.78327-(-45.37014)));
            zz = 28.5549 + (((tickAnim - 10) / 5) * (13.52352-(28.5549)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 58.1841 + (((tickAnim - 15) / 5) * (51.81918-(58.1841)));
            yy = -18.78327 + (((tickAnim - 15) / 5) * (0.88765-(-18.78327)));
            zz = 13.52352 + (((tickAnim - 15) / 5) * (12.49499-(13.52352)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = -22.5 + (((tickAnim - 0) / 5) * (-45-(-22.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -45 + (((tickAnim - 5) / 5) * (-65-(-45)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -65 + (((tickAnim - 10) / 10) * (-22.5-(-65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRs5, legRs5.rotateAngleX + (float) Math.toRadians(xx), legRs5.rotateAngleY + (float) Math.toRadians(yy), legRs5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 46.1193 + (((tickAnim - 0) / 5) * (58.34145-(46.1193)));
            yy = 45.88534 + (((tickAnim - 0) / 5) * (20.68503-(45.88534)));
            zz = -25.10912 + (((tickAnim - 0) / 5) * (-2.75053-(-25.10912)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 58.34145 + (((tickAnim - 5) / 5) * (52.29266-(58.34145)));
            yy = 20.68503 + (((tickAnim - 5) / 5) * (0.80539-(20.68503)));
            zz = -2.75053 + (((tickAnim - 5) / 5) * (-1.95142-(-2.75053)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 52.29266 + (((tickAnim - 10) / 5) * (59.67212-(52.29266)));
            yy = 0.80539 + (((tickAnim - 10) / 5) * (18.58846-(0.80539)));
            zz = -1.95142 + (((tickAnim - 10) / 5) * (-28.28504-(-1.95142)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 59.67212 + (((tickAnim - 15) / 5) * (46.1193-(59.67212)));
            yy = 18.58846 + (((tickAnim - 15) / 5) * (45.88534-(18.58846)));
            zz = -28.28504 + (((tickAnim - 15) / 5) * (-25.10912-(-28.28504)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 65 + (((tickAnim - 0) / 10) * (22.5-(65)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 22.5 + (((tickAnim - 10) / 5) * (45-(22.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 45 + (((tickAnim - 15) / 5) * (65-(45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLs5, legLs5.rotateAngleX + (float) Math.toRadians(xx), legLs5.rotateAngleY + (float) Math.toRadians(yy), legLs5.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(0), legR1.rotateAngleY + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+145))*2.5), legR1.rotateAngleZ + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+115))*5));
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(0), legR2.rotateAngleY + (float) Math.toRadians(-45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+205))*2.5), legR2.rotateAngleZ + (float) Math.toRadians(45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+175))*5));
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(0), legR3.rotateAngleY + (float) Math.toRadians(-50+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+265))*2.5), legR3.rotateAngleZ + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+235))*5));
        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(0), legL1.rotateAngleY + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+145))*2.5), legL1.rotateAngleZ + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+115))*5));
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(0), legL2.rotateAngleY + (float) Math.toRadians(45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+205))*2.5), legL2.rotateAngleZ + (float) Math.toRadians(-45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+175))*5));
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(0), legL3.rotateAngleY + (float) Math.toRadians(50+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+265))*2.5), legL3.rotateAngleZ + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+235))*5));

    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOnychopterella entity = (EntityPrehistoricFloraOnychopterella) entitylivingbaseIn;

        int animCycle = 5;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 9 + (((tickAnim - 0) / 1) * (-4-(9)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0.5 + (((tickAnim - 0) / 1) * (0-(0.5)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -4 + (((tickAnim - 1) / 2) * (7.6875-(-4)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (-4-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 7.6875 + (((tickAnim - 3) / 1) * (13-(7.6875)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = -4 + (((tickAnim - 3) / 1) * (2.5-(-4)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 13 + (((tickAnim - 4) / 1) * (9-(13)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 2.5 + (((tickAnim - 4) / 1) * (0.5-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 1.3 + (((tickAnim - 0) / 4) * (0.1-(1.3)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.1 + (((tickAnim - 4) / 1) * (1.3-(0.1)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 33.23163 + (((tickAnim - 0) / 3) * (20.27615-(33.23163)));
            yy = 1.93442 + (((tickAnim - 0) / 3) * (-45.40419-(1.93442)));
            zz = -14.20852 + (((tickAnim - 0) / 3) * (59.20361-(-14.20852)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 20.27615 + (((tickAnim - 3) / 0) * (0.80455-(20.27615)));
            yy = -45.40419 + (((tickAnim - 3) / 0) * (-74.07733-(-45.40419)));
            zz = 59.20361 + (((tickAnim - 3) / 0) * (3.75854-(59.20361)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0.80455 + (((tickAnim - 3) / 1) * (21.37977-(0.80455)));
            yy = -74.07733 + (((tickAnim - 3) / 1) * (-38.739-(-74.07733)));
            zz = 3.75854 + (((tickAnim - 3) / 1) * (21.53732-(3.75854)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 21.37977 + (((tickAnim - 4) / 1) * (33.23163-(21.37977)));
            yy = -38.739 + (((tickAnim - 4) / 1) * (1.93442-(-38.739)));
            zz = 21.53732 + (((tickAnim - 4) / 1) * (-14.20852-(21.53732)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (15-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 15 + (((tickAnim - 2) / 1) * (22.5-(15)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 22.5 + (((tickAnim - 3) / 0) * (22.5-(22.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 22.5 + (((tickAnim - 3) / 1) * (-45-(22.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = -45 + (((tickAnim - 4) / 1) * (0-(-45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRs5, legRs5.rotateAngleX + (float) Math.toRadians(xx), legRs5.rotateAngleY + (float) Math.toRadians(yy), legRs5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 33.23163 + (((tickAnim - 0) / 3) * (20.27615-(33.23163)));
            yy = -1.93442 + (((tickAnim - 0) / 3) * (45.40419-(-1.93442)));
            zz = 14.20852 + (((tickAnim - 0) / 3) * (-59.20361-(14.20852)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 20.27615 + (((tickAnim - 3) / 0) * (4.04957-(20.27615)));
            yy = 45.40419 + (((tickAnim - 3) / 0) * (74.76997-(45.40419)));
            zz = -59.20361 + (((tickAnim - 3) / 0) * (2.37383-(-59.20361)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 4.04957 + (((tickAnim - 3) / 1) * (21.80316-(4.04957)));
            yy = 74.76997 + (((tickAnim - 3) / 1) * (40.44995-(74.76997)));
            zz = 2.37383 + (((tickAnim - 3) / 1) * (-29.87439-(2.37383)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 21.80316 + (((tickAnim - 4) / 1) * (33.23163-(21.80316)));
            yy = 40.44995 + (((tickAnim - 4) / 1) * (-1.93442-(40.44995)));
            zz = -29.87439 + (((tickAnim - 4) / 1) * (14.20852-(-29.87439)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-15-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -15 + (((tickAnim - 2) / 1) * (-22.5-(-15)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = -22.5 + (((tickAnim - 3) / 0) * (-22.5-(-22.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = -22.5 + (((tickAnim - 3) / 1) * (45-(-22.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 45 + (((tickAnim - 4) / 1) * (0-(45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLs5, legLs5.rotateAngleX + (float) Math.toRadians(xx), legLs5.rotateAngleY + (float) Math.toRadians(yy), legLs5.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+50))*10), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body3, Body3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-10))*10), Body3.rotateAngleY + (float) Math.toRadians(0), Body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body4, Body4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-70))*10), Body4.rotateAngleY + (float) Math.toRadians(0), Body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body5, Body5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-130))*10), Body5.rotateAngleY + (float) Math.toRadians(0), Body5.rotateAngleZ + (float) Math.toRadians(0));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 27.08679 + (((tickAnim - 0) / 2) * (-8.74881-(27.08679)));
            yy = -81.43734 + (((tickAnim - 0) / 2) * (-16.0775-(-81.43734)));
            zz = 1.25009 + (((tickAnim - 0) / 2) * (-0.43304-(1.25009)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -8.74881 + (((tickAnim - 2) / 1) * (-3.89134-(-8.74881)));
            yy = -16.0775 + (((tickAnim - 2) / 1) * (-20.63844-(-16.0775)));
            zz = -0.43304 + (((tickAnim - 2) / 1) * (28.05548-(-0.43304)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -3.89134 + (((tickAnim - 3) / 1) * (0.92177-(-3.89134)));
            yy = -20.63844 + (((tickAnim - 3) / 1) * (-74.31878-(-20.63844)));
            zz = 28.05548 + (((tickAnim - 3) / 1) * (39.02872-(28.05548)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0.92177 + (((tickAnim - 4) / 1) * (27.08679-(0.92177)));
            yy = -74.31878 + (((tickAnim - 4) / 1) * (-81.43734-(-74.31878)));
            zz = 39.02872 + (((tickAnim - 4) / 1) * (1.25009-(39.02872)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 27.81632 + (((tickAnim - 0) / 2) * (-10.0841-(27.81632)));
            yy = 80.96106 + (((tickAnim - 0) / 2) * (16.65035-(80.96106)));
            zz = -1.03026 + (((tickAnim - 0) / 2) * (4.13498-(-1.03026)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -10.0841 + (((tickAnim - 2) / 1) * (-3.89134-(-10.0841)));
            yy = 16.65035 + (((tickAnim - 2) / 1) * (20.63844-(16.65035)));
            zz = 4.13498 + (((tickAnim - 2) / 1) * (-28.05548-(4.13498)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -3.89134 + (((tickAnim - 3) / 1) * (0.92177-(-3.89134)));
            yy = 20.63844 + (((tickAnim - 3) / 1) * (74.31878-(20.63844)));
            zz = -28.05548 + (((tickAnim - 3) / 1) * (-39.02872-(-28.05548)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0.92177 + (((tickAnim - 4) / 1) * (27.81632-(0.92177)));
            yy = 74.31878 + (((tickAnim - 4) / 1) * (80.96106-(74.31878)));
            zz = -39.02872 + (((tickAnim - 4) / 1) * (-1.03026-(-39.02872)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(0), legR1.rotateAngleY + (float) Math.toRadians(67.5), legR1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(0), legL1.rotateAngleY + (float) Math.toRadians(-67.5), legL1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(0), legR2.rotateAngleY + (float) Math.toRadians(57.5), legR2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(0), legL2.rotateAngleY + (float) Math.toRadians(-57.5), legL2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(0), legR3.rotateAngleY + (float) Math.toRadians(45), legR3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(0), legL3.rotateAngleY + (float) Math.toRadians(-45), legL3.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraOnychopterella e = (EntityPrehistoricFloraOnychopterella) entity;
        animator.update(entity);
    }
}
