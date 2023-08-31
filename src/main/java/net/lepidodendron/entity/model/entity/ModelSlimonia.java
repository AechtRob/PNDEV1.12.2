package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSlimonia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelSlimonia extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tergite1;
    private final AdvancedModelRenderer tergite2_3;
    private final AdvancedModelRenderer tergite4_5;
    private final AdvancedModelRenderer tergite6;
    private final AdvancedModelRenderer tergite7;
    private final AdvancedModelRenderer tergite8;
    private final AdvancedModelRenderer tergite9;
    private final AdvancedModelRenderer tergite10;
    private final AdvancedModelRenderer tergite11;
    private final AdvancedModelRenderer tergite12;
    private final AdvancedModelRenderer telson;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legL5_2;
    private final AdvancedModelRenderer legL5_3;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legR5_2;
    private final AdvancedModelRenderer legR5_3;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer cheliceraL;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cheliceraR;
    private final AdvancedModelRenderer cube_r3;

    private ModelAnimator animator;


    public ModelSlimonia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 22.0F, 3.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -1.0F, -8.0F, 8, 2, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 32, 12, -1.5F, 0.7F, -6.0F, 3, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 2.0F, -1.45F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 26, -3.0F, -2.0F, -1.0F, 7, 2, 3, 0.0F, false));

        this.tergite1 = new AdvancedModelRenderer(this);
        this.tergite1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(tergite1);
        this.tergite1.cubeList.add(new ModelBox(tergite1, 22, 23, -4.5F, -1.0F, 0.0F, 9, 2, 2, 0.0F, false));

        this.tergite2_3 = new AdvancedModelRenderer(this);
        this.tergite2_3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite1.addChild(tergite2_3);
        this.tergite2_3.cubeList.add(new ModelBox(tergite2_3, 0, 10, -5.5F, -1.0F, 0.0F, 11, 2, 4, 0.0F, false));

        this.tergite4_5 = new AdvancedModelRenderer(this);
        this.tergite4_5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergite2_3.addChild(tergite4_5);
        this.tergite4_5.cubeList.add(new ModelBox(tergite4_5, 0, 16, -5.5F, -1.0F, 0.0F, 11, 2, 4, 0.0F, false));

        this.tergite6 = new AdvancedModelRenderer(this);
        this.tergite6.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergite4_5.addChild(tergite6);
        this.tergite6.cubeList.add(new ModelBox(tergite6, 0, 22, -4.5F, -1.0F, 0.0F, 9, 2, 2, 0.0F, false));

        this.tergite7 = new AdvancedModelRenderer(this);
        this.tergite7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite6.addChild(tergite7);
        this.tergite7.cubeList.add(new ModelBox(tergite7, 18, 30, -3.5F, -1.0F, 0.0F, 7, 2, 2, 0.0F, false));

        this.tergite8 = new AdvancedModelRenderer(this);
        this.tergite8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite7.addChild(tergite8);
        this.tergite8.cubeList.add(new ModelBox(tergite8, 32, 18, -2.5F, -1.0F, 0.0F, 5, 2, 2, 0.0F, false));

        this.tergite9 = new AdvancedModelRenderer(this);
        this.tergite9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite8.addChild(tergite9);
        this.tergite9.cubeList.add(new ModelBox(tergite9, 14, 34, -2.0F, -1.0F, 0.0F, 4, 2, 2, 0.0F, false));

        this.tergite10 = new AdvancedModelRenderer(this);
        this.tergite10.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite9.addChild(tergite10);
        this.tergite10.cubeList.add(new ModelBox(tergite10, 34, 0, -2.0F, -1.0F, 0.0F, 4, 2, 2, 0.0F, false));

        this.tergite11 = new AdvancedModelRenderer(this);
        this.tergite11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite10.addChild(tergite11);
        this.tergite11.cubeList.add(new ModelBox(tergite11, 0, 33, -2.0F, -1.0F, 0.0F, 4, 2, 3, 0.0F, false));

        this.tergite12 = new AdvancedModelRenderer(this);
        this.tergite12.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tergite11.addChild(tergite12);
        this.tergite12.cubeList.add(new ModelBox(tergite12, 30, 6, -2.0F, -1.0F, 0.0F, 4, 2, 4, 0.0F, false));

        this.telson = new AdvancedModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergite12.addChild(telson);
        this.telson.cubeList.add(new ModelBox(telson, 20, 12, -0.5F, -0.5F, 0.0F, 1, 1, 10, 0.0F, false));
        this.telson.cubeList.add(new ModelBox(telson, 16, 0, -2.5F, 0.0F, 0.0F, 5, 0, 8, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.4F, 1.5F, -5.4F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0873F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 31, 0.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.4F, 1.5F, -3.2F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0873F, 0.0F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 31, -8.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.4F, 1.5F, -4.3F);
        this.body.addChild(legR3);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 31, -8.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.4F, 1.5F, -5.4F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, -0.0873F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 31, -8.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.4F, 1.5F, -4.3F);
        this.body.addChild(legL3);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 31, 0.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.4F, 1.5F, -3.2F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -0.0873F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 31, 0.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(3.5F, 1.5F, -1.0F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, -0.3927F, 0.0F);
        this.legL5.cubeList.add(new ModelBox(legL5, 26, 34, 0.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        this.legL5_2 = new AdvancedModelRenderer(this);
        this.legL5_2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.legL5.addChild(legL5_2);
        this.setRotateAngle(legL5_2, 0.0F, -0.7854F, 0.0F);
        this.legL5_2.cubeList.add(new ModelBox(legL5_2, 20, 27, 0.0F, -0.5F, -1.0F, 8, 1, 2, 0.001F, false));

        this.legL5_3 = new AdvancedModelRenderer(this);
        this.legL5_3.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.legL5_2.addChild(legL5_3);
        this.legL5_3.cubeList.add(new ModelBox(legL5_3, 4, 2, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-3.5F, 1.5F, -1.0F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.3927F, 0.0F);
        this.legR5.cubeList.add(new ModelBox(legR5, 26, 34, -3.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, true));

        this.legR5_2 = new AdvancedModelRenderer(this);
        this.legR5_2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.legR5.addChild(legR5_2);
        this.setRotateAngle(legR5_2, 0.0F, 0.7854F, 0.0F);
        this.legR5_2.cubeList.add(new ModelBox(legR5_2, 20, 27, -8.0F, -0.5F, -1.0F, 8, 1, 2, 0.001F, true));

        this.legR5_3 = new AdvancedModelRenderer(this);
        this.legR5_3.setRotationPoint(-8.0F, 0.0F, 0.0F);
        this.legR5_2.addChild(legR5_3);
        this.legR5_3.cubeList.add(new ModelBox(legR5_3, 4, 2, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(1.2F, 0.75F, -6.0F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.3927F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 0, 0.0F, 0.5F, -2.0F, 3, 0, 2, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.2F, 0.75F, -6.0F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.3927F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 0, 0, -3.0F, 0.5F, -2.0F, 3, 0, 2, 0.0F, true));

        this.cheliceraL = new AdvancedModelRenderer(this);
        this.cheliceraL.setRotationPoint(0.4F, 1.45F, -5.7F);
        this.body.addChild(cheliceraL);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cheliceraL.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.5236F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, -1, 5, -0.5F, 0.0F, -1.5F, 2, 0, 2, 0.0F, true));

        this.cheliceraR = new AdvancedModelRenderer(this);
        this.cheliceraR.setRotationPoint(-0.4F, 1.45F, -5.7F);
        this.body.addChild(cheliceraR);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cheliceraR.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.5236F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, -1, 5, -1.5F, 0.0F, -1.5F, 2, 0, 2, 0.0F, false));

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
        this.setRotateAngle(body, -1.45F, 3.1F, -0.5F);
        this.body.offsetZ = -0.33F;
        this.body.offsetY = -0.34F;
        this.body.offsetX = -0.07F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(tergite1, -0.07F, 0.0F, 0.0F);
        this.setRotateAngle(tergite2_3, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tergite4_5, 0.04F, 0.0F, 0.0F);
        this.setRotateAngle(tergite6, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tergite7, 0.06F, 0.0F, 0.0F);
        this.setRotateAngle(tergite8, 0.07F, 0.0F, 0.0F);
        this.setRotateAngle(tergite9, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tergite10, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tergite11, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tergite12, 0.0F, 0.0F, 0.0F);
        this.body.offsetY = -0.05F;
        this.body.render(0.01F);
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
        this.body.offsetY = -0.2F;
        this.body.offsetZ = 0.1F;


        AdvancedModelRenderer[] fishBody = {this.tergite1, this.tergite2_3, this.tergite4_5, this.tergite6, this.tergite7, this.tergite8, this.tergite9, this.tergite10, this.tergite11, this.tergite12, this.telson};
        AdvancedModelRenderer[] fishTail = {this.tergite12, this.telson};



        //mouthparts:
        this.walk(cheliceraL, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
        this.walk(cheliceraR, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

        float speed = 0.2F;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.05F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        EntityPrehistoricFloraSlimonia slimon = (EntityPrehistoricFloraSlimonia) e;


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {//on land
            if(!slimon.getIsMoving()) {
                this.chainWave(fishBody, speed, 0.02F, -0.2F, f2, 0.2F);
                this.chainSwing(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
                this.chainWave(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
            }

            //this.chainSwing(fishfinL, speed, -paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinL, speed, paddleVdegree, -3, f2, 2);
            //this.chainSwing(fishfinR, speed, paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinR, speed, paddleVdegree, -3, f2, 2);

            //pincers:
            //this.swing(cheliceraL, 0.3F, -0.1F, false, 0, -0.1F, f2, 0.6F);
            //this.swing(cheliceraR, 0.3F, 0.1F, false, 0, 0.1F, f2, 0.6F);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
               // this.body.offsetY = 0.2F;
                //this.bob(body, -speed * 1.5F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed, 0.01F, -2, f2, 1);
            }
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSlimonia ee = (EntityPrehistoricFloraSlimonia) entitylivingbaseIn;
        //Swimming pose:
        if (ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if ((!ee.isReallySwimming()) && (ee.getAnimation() != ee.UNSWIM_ANIMATION)) {
                    //Walk pose:
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                } else {
                    if ((ee.getAnimation() != ee.SWIM_ANIMATION)) {
                        if (ee.getIsFast()) {
                            animFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                        } else {
                            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                        }
                    }
                }
            }
            else { //in water but not moving:
                if (ee.getAnimation() != ee.UNSWIM_ANIMATION && ee.getAnimation() != ee.SWIM_ANIMATION) {
                    if (ee.isReallySwimming()) {
                        //Swim static pose:
                        animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    } else {
                        //Walk static pose:
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    }
                }
            }
        }
    }

    public void animFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSlimonia entity = (EntityPrehistoricFloraSlimonia) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+120))*2.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(3.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+150))/2);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(tergite1, tergite1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*2.5), tergite1.rotateAngleY + (float) Math.toRadians(0), tergite1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite2_3, tergite2_3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-15))*2.5), tergite2_3.rotateAngleY + (float) Math.toRadians(0), tergite2_3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite4_5, tergite4_5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-30))*3), tergite4_5.rotateAngleY + (float) Math.toRadians(0), tergite4_5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite6, tergite6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-45))*3), tergite6.rotateAngleY + (float) Math.toRadians(0), tergite6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite7, tergite7.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*4), tergite7.rotateAngleY + (float) Math.toRadians(0), tergite7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite8, tergite8.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-90))*4), tergite8.rotateAngleY + (float) Math.toRadians(0), tergite8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite9, tergite9.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-120))*6), tergite9.rotateAngleY + (float) Math.toRadians(0), tergite9.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite10, tergite10.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-150))*7), tergite10.rotateAngleY + (float) Math.toRadians(0), tergite10.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite11, tergite11.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-180))*8), tergite11.rotateAngleY + (float) Math.toRadians(0), tergite11.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite12, tergite12.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-210))*9), tergite12.rotateAngleY + (float) Math.toRadians(0), tergite12.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-270))*10), telson.rotateAngleY + (float) Math.toRadians(0), telson.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.94102 + (((tickAnim - 0) / 5) * (-18.0372-(-20.94102)));
            yy = -40.78947 + (((tickAnim - 0) / 5) * (-42.01708-(-40.78947)));
            zz = 30.36119 + (((tickAnim - 0) / 5) * (28.4404-(30.36119)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -18.0372 + (((tickAnim - 5) / 5) * (-20.94102-(-18.0372)));
            yy = -42.01708 + (((tickAnim - 5) / 5) * (-40.78947-(-42.01708)));
            zz = 28.4404 + (((tickAnim - 5) / 5) * (30.36119-(28.4404)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.94102 + (((tickAnim - 0) / 5) * (-18.0372-(-20.94102)));
            yy = 40.78947 + (((tickAnim - 0) / 5) * (42.01708-(40.78947)));
            zz = -30.36119 + (((tickAnim - 0) / 5) * (-28.4404-(-30.36119)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -18.0372 + (((tickAnim - 5) / 5) * (-20.94102-(-18.0372)));
            yy = 42.01708 + (((tickAnim - 5) / 5) * (40.78947-(42.01708)));
            zz = -28.4404 + (((tickAnim - 5) / 5) * (-30.36119-(-28.4404)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.94102 + (((tickAnim - 0) / 5) * (-23.73649-(-20.94102)));
            yy = 40.78947 + (((tickAnim - 0) / 5) * (39.49176-(40.78947)));
            zz = -30.36119 + (((tickAnim - 0) / 5) * (-32.16366-(-30.36119)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -23.73649 + (((tickAnim - 5) / 5) * (-20.94102-(-23.73649)));
            yy = 39.49176 + (((tickAnim - 5) / 5) * (40.78947-(39.49176)));
            zz = -32.16366 + (((tickAnim - 5) / 5) * (-30.36119-(-32.16366)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.94102 + (((tickAnim - 0) / 5) * (-18.0372-(-20.94102)));
            yy = 40.78947 + (((tickAnim - 0) / 5) * (42.01708-(40.78947)));
            zz = -30.36119 + (((tickAnim - 0) / 5) * (-28.4404-(-30.36119)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -18.0372 + (((tickAnim - 5) / 5) * (-20.94102-(-18.0372)));
            yy = 42.01708 + (((tickAnim - 5) / 5) * (40.78947-(42.01708)));
            zz = -28.4404 + (((tickAnim - 5) / 5) * (-30.36119-(-28.4404)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.94102 + (((tickAnim - 0) / 5) * (-23.73649-(-20.94102)));
            yy = -40.78947 + (((tickAnim - 0) / 5) * (-39.49176-(-40.78947)));
            zz = 30.36119 + (((tickAnim - 0) / 5) * (32.16366-(30.36119)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -23.73649 + (((tickAnim - 5) / 5) * (-20.94102-(-23.73649)));
            yy = -39.49176 + (((tickAnim - 5) / 5) * (-40.78947-(-39.49176)));
            zz = 32.16366 + (((tickAnim - 5) / 5) * (30.36119-(32.16366)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.94102 + (((tickAnim - 0) / 5) * (-18.0372-(-20.94102)));
            yy = -40.78947 + (((tickAnim - 0) / 5) * (-42.01708-(-40.78947)));
            zz = 30.36119 + (((tickAnim - 0) / 5) * (28.4404-(30.36119)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -18.0372 + (((tickAnim - 5) / 5) * (-20.94102-(-18.0372)));
            yy = -42.01708 + (((tickAnim - 5) / 5) * (-40.78947-(-42.01708)));
            zz = 28.4404 + (((tickAnim - 5) / 5) * (30.36119-(28.4404)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 15.85774 + (((tickAnim - 0) / 4) * (11.89969-(15.85774)));
            yy = -4.96135 + (((tickAnim - 0) / 4) * (-2.68596-(-4.96135)));
            zz = 15.63346 + (((tickAnim - 0) / 4) * (7.65797-(15.63346)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 11.89969 + (((tickAnim - 4) / 6) * (15.85774-(11.89969)));
            yy = -2.68596 + (((tickAnim - 4) / 6) * (-4.96135-(-2.68596)));
            zz = 7.65797 + (((tickAnim - 4) / 6) * (15.63346-(7.65797)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legL5_2, legL5_2.rotateAngleX + (float) Math.toRadians(0), legL5_2.rotateAngleY + (float) Math.toRadians(35), legL5_2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 15.85774 + (((tickAnim - 0) / 4) * (11.89969-(15.85774)));
            yy = 4.96135 + (((tickAnim - 0) / 4) * (2.68596-(4.96135)));
            zz = -15.63346 + (((tickAnim - 0) / 4) * (-7.65797-(-15.63346)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 11.89969 + (((tickAnim - 4) / 6) * (15.85774-(11.89969)));
            yy = 2.68596 + (((tickAnim - 4) / 6) * (4.96135-(2.68596)));
            zz = -7.65797 + (((tickAnim - 4) / 6) * (-15.63346-(-7.65797)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legR5_2, legR5_2.rotateAngleX + (float) Math.toRadians(0), legR5_2.rotateAngleY + (float) Math.toRadians(-35), legR5_2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -9.16622 + (((tickAnim - 0) / 5) * (-12.08108-(-9.16622)));
            yy = -45.67345 + (((tickAnim - 0) / 5) * (-43.69086-(-45.67345)));
            zz = 24.57429 + (((tickAnim - 0) / 5) * (18.8046-(24.57429)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -12.08108 + (((tickAnim - 5) / 5) * (-9.16622-(-12.08108)));
            yy = -43.69086 + (((tickAnim - 5) / 5) * (-45.67345-(-43.69086)));
            zz = 18.8046 + (((tickAnim - 5) / 5) * (24.57429-(18.8046)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(xx), legL1.rotateAngleY + (float) Math.toRadians(yy), legL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -9.16622 + (((tickAnim - 0) / 5) * (-12.09999-(-9.16622)));
            yy = 45.67345 + (((tickAnim - 0) / 5) * (43.90584-(45.67345)));
            zz = -24.57429 + (((tickAnim - 0) / 5) * (-18.84359-(-24.57429)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -12.09999 + (((tickAnim - 5) / 5) * (-9.16622-(-12.09999)));
            yy = 43.90584 + (((tickAnim - 5) / 5) * (45.67345-(43.90584)));
            zz = -18.84359 + (((tickAnim - 5) / 5) * (-24.57429-(-18.84359)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(xx), legR1.rotateAngleY + (float) Math.toRadians(yy), legR1.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraSlimonia entity = (EntityPrehistoricFloraSlimonia) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 4.99527 + (((tickAnim - 0) / 10) * (3.9953-(4.99527)));
            yy = -1 + (((tickAnim - 0) / 10) * (0-(-1)));
            zz = 1 + (((tickAnim - 0) / 10) * (0-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.9953 + (((tickAnim - 10) / 10) * (4.99527-(3.9953)));
            yy = 0 + (((tickAnim - 10) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-1-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4.99527 + (((tickAnim - 20) / 10) * (5.9953-(4.99527)));
            yy = 1 + (((tickAnim - 20) / 10) * (0-(1)));
            zz = -1 + (((tickAnim - 20) / 10) * (0-(-1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5.9953 + (((tickAnim - 30) / 10) * (4.99527-(5.9953)));
            yy = 0 + (((tickAnim - 30) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 3 + (((tickAnim - 0) / 10) * (3.1-(3)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 3.1 + (((tickAnim - 10) / 10) * (3-(3.1)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 3 + (((tickAnim - 20) / 10) * (3.1-(3)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 3.1 + (((tickAnim - 30) / 10) * (3-(3.1)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -1.5 + (((tickAnim - 0) / 10) * (-2.50238-(-1.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.10912-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.50238 + (((tickAnim - 10) / 10) * (-3.5-(-2.50238)));
            yy = -1 + (((tickAnim - 10) / 10) * (0-(-1)));
            zz = 0.10912 + (((tickAnim - 10) / 10) * (0-(0.10912)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -3.5 + (((tickAnim - 20) / 10) * (-2.50238-(-3.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2.50238 + (((tickAnim - 30) / 10) * (-1.5-(-2.50238)));
            yy = 1 + (((tickAnim - 30) / 10) * (0-(1)));
            zz = -0.10912 + (((tickAnim - 30) / 10) * (0-(-0.10912)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergite1, tergite1.rotateAngleX + (float) Math.toRadians(xx), tergite1.rotateAngleY + (float) Math.toRadians(yy), tergite1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.67 + (((tickAnim - 0) / 2) * (-1.5-(-1.67)));
            yy = 0.17 + (((tickAnim - 0) / 2) * (0-(0.17)));
            zz = -0.02 + (((tickAnim - 0) / 2) * (0-(-0.02)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
            xx = -1.5 + (((tickAnim - 2) / 10) * (-2.50238-(-1.5)));
            yy = 0 + (((tickAnim - 2) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 2) / 10) * (0.10912-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -2.50238 + (((tickAnim - 12) / 10) * (-3.5-(-2.50238)));
            yy = -1 + (((tickAnim - 12) / 10) * (0-(-1)));
            zz = 0.10912 + (((tickAnim - 12) / 10) * (0-(0.10912)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = -3.5 + (((tickAnim - 22) / 10) * (-2.50238-(-3.5)));
            yy = 0 + (((tickAnim - 22) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 22) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -2.50238 + (((tickAnim - 32) / 8) * (-1.67-(-2.50238)));
            yy = 1 + (((tickAnim - 32) / 8) * (0.17-(1)));
            zz = -0.10912 + (((tickAnim - 32) / 8) * (-0.02-(-0.10912)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergite2_3, tergite2_3.rotateAngleX + (float) Math.toRadians(xx), tergite2_3.rotateAngleY + (float) Math.toRadians(yy), tergite2_3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2 + (((tickAnim - 0) / 5) * (-1.5-(-2)));
            yy = 0.5 + (((tickAnim - 0) / 5) * (0-(0.5)));
            zz = -0.05 + (((tickAnim - 0) / 5) * (0-(-0.05)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -1.5 + (((tickAnim - 5) / 10) * (-2.50238-(-1.5)));
            yy = 0 + (((tickAnim - 5) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0.10912-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -2.50238 + (((tickAnim - 15) / 10) * (-3.5-(-2.50238)));
            yy = -1 + (((tickAnim - 15) / 10) * (0-(-1)));
            zz = 0.10912 + (((tickAnim - 15) / 10) * (0-(0.10912)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -3.5 + (((tickAnim - 25) / 10) * (-2.50238-(-3.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -2.50238 + (((tickAnim - 35) / 5) * (-2-(-2.50238)));
            yy = 1 + (((tickAnim - 35) / 5) * (0.5-(1)));
            zz = -0.10912 + (((tickAnim - 35) / 5) * (-0.05-(-0.10912)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergite4_5, tergite4_5.rotateAngleX + (float) Math.toRadians(xx), tergite4_5.rotateAngleY + (float) Math.toRadians(yy), tergite4_5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -2.34 + (((tickAnim - 0) / 8) * (-1.5-(-2.34)));
            yy = 0.83 + (((tickAnim - 0) / 8) * (0-(0.83)));
            zz = -0.09 + (((tickAnim - 0) / 8) * (0-(-0.09)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -1.5 + (((tickAnim - 8) / 10) * (-2.50238-(-1.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0.10912-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -2.50238 + (((tickAnim - 18) / 10) * (-3.5-(-2.50238)));
            yy = -1 + (((tickAnim - 18) / 10) * (0-(-1)));
            zz = 0.10912 + (((tickAnim - 18) / 10) * (0-(0.10912)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -3.5 + (((tickAnim - 28) / 10) * (-2.50238-(-3.5)));
            yy = 0 + (((tickAnim - 28) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -2.50238 + (((tickAnim - 38) / 2) * (-2.34-(-2.50238)));
            yy = 1 + (((tickAnim - 38) / 2) * (0.83-(1)));
            zz = -0.10912 + (((tickAnim - 38) / 2) * (-0.09-(-0.10912)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergite6, tergite6.rotateAngleX + (float) Math.toRadians(xx), tergite6.rotateAngleY + (float) Math.toRadians(yy), tergite6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1.66 + (((tickAnim - 0) / 10) * (3.5-(1.66)));
            yy = 0.92 + (((tickAnim - 0) / 10) * (0-(0.92)));
            zz = 0.06 + (((tickAnim - 0) / 10) * (0-(0.06)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.5 + (((tickAnim - 10) / 10) * (2.50238-(3.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.50238 + (((tickAnim - 20) / 10) * (1.5-(2.50238)));
            yy = -1 + (((tickAnim - 20) / 10) * (0-(-1)));
            zz = -0.10912 + (((tickAnim - 20) / 10) * (0-(-0.10912)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 1.5 + (((tickAnim - 30) / 9) * (1.50143-(1.5)));
            yy = 0 + (((tickAnim - 30) / 9) * (1-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0.06548-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 1.50143 + (((tickAnim - 39) / 1) * (1.5-(1.50143)));
            yy = 1 + (((tickAnim - 39) / 1) * (0.92-(1)));
            zz = 0.06548 + (((tickAnim - 39) / 1) * (0.06-(0.06548)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergite7, tergite7.rotateAngleX + (float) Math.toRadians(xx), tergite7.rotateAngleY + (float) Math.toRadians(yy), tergite7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 1.5 + (((tickAnim - 0) / 1) * (1.50143-(1.5)));
            yy = 0.91 + (((tickAnim - 0) / 1) * (1-(0.91)));
            zz = 0.06 + (((tickAnim - 0) / 1) * (0.06548-(0.06)));
        }
        else if (tickAnim >= 1 && tickAnim < 12) {
            xx = 1.50143 + (((tickAnim - 1) / 11) * (3.5-(1.50143)));
            yy = 1 + (((tickAnim - 1) / 11) * (0-(1)));
            zz = 0.06548 + (((tickAnim - 1) / 11) * (0-(0.06548)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 3.5 + (((tickAnim - 12) / 10) * (2.50238-(3.5)));
            yy = 0 + (((tickAnim - 12) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 2.50238 + (((tickAnim - 22) / 10) * (1.5-(2.50238)));
            yy = -1 + (((tickAnim - 22) / 10) * (0-(-1)));
            zz = -0.10912 + (((tickAnim - 22) / 10) * (0-(-0.10912)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 1.5 + (((tickAnim - 32) / 8) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 32) / 8) * (0.91-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0.06-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergite8, tergite8.rotateAngleX + (float) Math.toRadians(xx), tergite8.rotateAngleY + (float) Math.toRadians(yy), tergite8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.5 + (((tickAnim - 0) / 3) * (1.50143-(1.5)));
            yy = 0.73 + (((tickAnim - 0) / 3) * (1-(0.73)));
            zz = 0.05 + (((tickAnim - 0) / 3) * (0.06548-(0.05)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 1.50143 + (((tickAnim - 3) / 10) * (3.5-(1.50143)));
            yy = 1 + (((tickAnim - 3) / 10) * (0-(1)));
            zz = 0.06548 + (((tickAnim - 3) / 10) * (0-(0.06548)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 3.5 + (((tickAnim - 13) / 10) * (2.50238-(3.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 2.50238 + (((tickAnim - 23) / 10) * (1.5-(2.50238)));
            yy = -1 + (((tickAnim - 23) / 10) * (0-(-1)));
            zz = -0.10912 + (((tickAnim - 23) / 10) * (0-(-0.10912)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 1.5 + (((tickAnim - 33) / 7) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0.73-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0.05-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergite9, tergite9.rotateAngleX + (float) Math.toRadians(xx), tergite9.rotateAngleY + (float) Math.toRadians(yy), tergite9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1.5 + (((tickAnim - 0) / 4) * (1.50143-(1.5)));
            yy = 0.55 + (((tickAnim - 0) / 4) * (1-(0.55)));
            zz = 0.04 + (((tickAnim - 0) / 4) * (0.06548-(0.04)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 1.50143 + (((tickAnim - 4) / 11) * (3.5-(1.50143)));
            yy = 1 + (((tickAnim - 4) / 11) * (0-(1)));
            zz = 0.06548 + (((tickAnim - 4) / 11) * (0-(0.06548)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 3.5 + (((tickAnim - 15) / 10) * (2.50238-(3.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 2.50238 + (((tickAnim - 25) / 10) * (1.5-(2.50238)));
            yy = -1 + (((tickAnim - 25) / 10) * (0-(-1)));
            zz = -0.10912 + (((tickAnim - 25) / 10) * (0-(-0.10912)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1.5 + (((tickAnim - 35) / 5) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0.55-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0.04-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergite10, tergite10.rotateAngleX + (float) Math.toRadians(xx), tergite10.rotateAngleY + (float) Math.toRadians(yy), tergite10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 1.5 + (((tickAnim - 0) / 6) * (1.50143-(1.5)));
            yy = 0.36 + (((tickAnim - 0) / 6) * (1-(0.36)));
            zz = 0.02 + (((tickAnim - 0) / 6) * (0.06548-(0.02)));
        }
        else if (tickAnim >= 6 && tickAnim < 17) {
            xx = 1.50143 + (((tickAnim - 6) / 11) * (3.5-(1.50143)));
            yy = 1 + (((tickAnim - 6) / 11) * (0-(1)));
            zz = 0.06548 + (((tickAnim - 6) / 11) * (0-(0.06548)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 3.5 + (((tickAnim - 17) / 10) * (2.50238-(3.5)));
            yy = 0 + (((tickAnim - 17) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 17) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 2.50238 + (((tickAnim - 27) / 10) * (1.5-(2.50238)));
            yy = -1 + (((tickAnim - 27) / 10) * (0-(-1)));
            zz = -0.10912 + (((tickAnim - 27) / 10) * (0-(-0.10912)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 1.5 + (((tickAnim - 37) / 3) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 37) / 3) * (0.36-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0.02-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergite11, tergite11.rotateAngleX + (float) Math.toRadians(xx), tergite11.rotateAngleY + (float) Math.toRadians(yy), tergite11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1.5 + (((tickAnim - 0) / 8) * (1.50143-(1.5)));
            yy = 0.18 + (((tickAnim - 0) / 8) * (1-(0.18)));
            zz = 0.01 + (((tickAnim - 0) / 8) * (0.06548-(0.01)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 1.50143 + (((tickAnim - 8) / 10) * (3.5-(1.50143)));
            yy = 1 + (((tickAnim - 8) / 10) * (0-(1)));
            zz = 0.06548 + (((tickAnim - 8) / 10) * (0-(0.06548)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 3.5 + (((tickAnim - 18) / 10) * (2.50238-(3.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 2.50238 + (((tickAnim - 28) / 10) * (1.5-(2.50238)));
            yy = -1 + (((tickAnim - 28) / 10) * (0-(-1)));
            zz = -0.10912 + (((tickAnim - 28) / 10) * (0-(-0.10912)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 1.5 + (((tickAnim - 38) / 2) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 38) / 2) * (0.18-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0.01-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergite12, tergite12.rotateAngleX + (float) Math.toRadians(xx), tergite12.rotateAngleY + (float) Math.toRadians(yy), tergite12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1.5 + (((tickAnim - 0) / 8) * (1.50143-(1.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.06548-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 1.50143 + (((tickAnim - 8) / 11) * (3.5-(1.50143)));
            yy = 1 + (((tickAnim - 8) / 11) * (0-(1)));
            zz = 0.06548 + (((tickAnim - 8) / 11) * (0-(0.06548)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = 3.5 + (((tickAnim - 19) / 10) * (2.50238-(3.5)));
            yy = 0 + (((tickAnim - 19) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 19) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 2.50238 + (((tickAnim - 29) / 10) * (1.5-(2.50238)));
            yy = -1 + (((tickAnim - 29) / 10) * (0-(-1)));
            zz = -0.10912 + (((tickAnim - 29) / 10) * (0-(-0.10912)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(xx), telson.rotateAngleY + (float) Math.toRadians(yy), telson.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.27 + (((tickAnim - 0) / 3) * (-0.56944-(1.27)));
            yy = 7.37 + (((tickAnim - 0) / 3) * (0.17463-(7.37)));
            zz = 15.91 + (((tickAnim - 0) / 3) * (17.35542-(15.91)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.56944 + (((tickAnim - 3) / 5) * (0.49858-(-0.56944)));
            yy = 0.17463 + (((tickAnim - 3) / 5) * (20.5696-(0.17463)));
            zz = 17.35542 + (((tickAnim - 3) / 5) * (6.1396-(17.35542)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0.49858 + (((tickAnim - 8) / 5) * (6.79844-(0.49858)));
            yy = 20.5696 + (((tickAnim - 8) / 5) * (21.49213-(20.5696)));
            zz = 6.1396 + (((tickAnim - 8) / 5) * (20.3687-(6.1396)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 6.79844 + (((tickAnim - 13) / 10) * (-0.4788-(6.79844)));
            yy = 21.49213 + (((tickAnim - 13) / 10) * (0.18378-(21.49213)));
            zz = 20.3687 + (((tickAnim - 13) / 10) * (18.35947-(20.3687)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -0.4788 + (((tickAnim - 23) / 5) * (0.49858-(-0.4788)));
            yy = 0.18378 + (((tickAnim - 23) / 5) * (20.5696-(0.18378)));
            zz = 18.35947 + (((tickAnim - 23) / 5) * (6.1396-(18.35947)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0.49858 + (((tickAnim - 28) / 5) * (5.30086-(0.49858)));
            yy = 20.5696 + (((tickAnim - 28) / 5) * (21.8084-(20.5696)));
            zz = 6.1396 + (((tickAnim - 28) / 5) * (17.0307-(6.1396)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 5.30086 + (((tickAnim - 33) / 7) * (1.27-(5.30086)));
            yy = 21.8084 + (((tickAnim - 33) / 7) * (7.37-(21.8084)));
            zz = 17.0307 + (((tickAnim - 33) / 7) * (15.91-(17.0307)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -5.17 + (((tickAnim - 0) / 5) * (-5.25888-(-5.17)));
            yy = 14.86 + (((tickAnim - 0) / 5) * (11.34946-(14.86)));
            zz = -12.46 + (((tickAnim - 0) / 5) * (-22.70038-(-12.46)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -5.25888 + (((tickAnim - 5) / 10) * (-17.06133-(-5.25888)));
            yy = 11.34946 + (((tickAnim - 5) / 10) * (33.92175-(11.34946)));
            zz = -22.70038 + (((tickAnim - 5) / 10) * (-29.41119-(-22.70038)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -17.06133 + (((tickAnim - 15) / 5) * (-5.16627-(-17.06133)));
            yy = 33.92175 + (((tickAnim - 15) / 5) * (14.85972-(33.92175)));
            zz = -29.41119 + (((tickAnim - 15) / 5) * (-12.45622-(-29.41119)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -5.16627 + (((tickAnim - 20) / 5) * (-4.96584-(-5.16627)));
            yy = 14.85972 + (((tickAnim - 20) / 5) * (11.43857-(14.85972)));
            zz = -12.45622 + (((tickAnim - 20) / 5) * (-21.66214-(-12.45622)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -4.96584 + (((tickAnim - 25) / 10) * (-18.20645-(-4.96584)));
            yy = 11.43857 + (((tickAnim - 25) / 10) * (33.46731-(11.43857)));
            zz = -21.66214 + (((tickAnim - 25) / 10) * (-31.24278-(-21.66214)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -18.20645 + (((tickAnim - 35) / 5) * (-5.17-(-18.20645)));
            yy = 33.46731 + (((tickAnim - 35) / 5) * (14.86-(33.46731)));
            zz = -31.24278 + (((tickAnim - 35) / 5) * (-12.46-(-31.24278)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -4.78361 + (((tickAnim - 0) / 2) * (-5.91537-(-4.78361)));
            yy = 12.42352 + (((tickAnim - 0) / 2) * (16.42765-(12.42352)));
            zz = -21.453 + (((tickAnim - 0) / 2) * (-21.8954-(-21.453)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -5.91537 + (((tickAnim - 2) / 5) * (-0.62308-(-5.91537)));
            yy = 16.42765 + (((tickAnim - 2) / 5) * (-4.55556-(16.42765)));
            zz = -21.8954 + (((tickAnim - 2) / 5) * (0.98561-(-21.8954)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -0.62308 + (((tickAnim - 7) / 5) * (1.90981-(-0.62308)));
            yy = -4.55556 + (((tickAnim - 7) / 5) * (-7.24266-(-4.55556)));
            zz = 0.98561 + (((tickAnim - 7) / 5) * (-19.36306-(0.98561)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 1.90981 + (((tickAnim - 12) / 10) * (-5.32476-(1.90981)));
            yy = -7.24266 + (((tickAnim - 12) / 10) * (16.62353-(-7.24266)));
            zz = -19.36306 + (((tickAnim - 12) / 10) * (-19.81925-(-19.36306)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -5.32476 + (((tickAnim - 22) / 5) * (-0.62308-(-5.32476)));
            yy = 16.62353 + (((tickAnim - 22) / 5) * (-4.55556-(16.62353)));
            zz = -19.81925 + (((tickAnim - 22) / 5) * (0.98561-(-19.81925)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -0.62308 + (((tickAnim - 27) / 5) * (1.7825-(-0.62308)));
            yy = -4.55556 + (((tickAnim - 27) / 5) * (-7.27488-(-4.55556)));
            zz = 0.98561 + (((tickAnim - 27) / 5) * (-18.3555-(0.98561)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 1.7825 + (((tickAnim - 32) / 8) * (-4.78361-(1.7825)));
            yy = -7.27488 + (((tickAnim - 32) / 8) * (12.42352-(-7.27488)));
            zz = -18.3555 + (((tickAnim - 32) / 8) * (-21.453-(-18.3555)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.1 + (((tickAnim - 0) / 3) * (6.30204-(2.1)));
            yy = -20.98 + (((tickAnim - 0) / 3) * (-21.60625-(-20.98)));
            zz = -9.77 + (((tickAnim - 0) / 3) * (-19.25815-(-9.77)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 6.30204 + (((tickAnim - 3) / 10) * (-0.47879-(6.30204)));
            yy = -21.60625 + (((tickAnim - 3) / 10) * (-0.18382-(-21.60625)));
            zz = -19.25815 + (((tickAnim - 3) / 10) * (-18.35947-(-19.25815)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -0.47879 + (((tickAnim - 13) / 5) * (0.49858-(-0.47879)));
            yy = -0.18382 + (((tickAnim - 13) / 5) * (-20.56963-(-0.18382)));
            zz = -18.35947 + (((tickAnim - 13) / 5) * (-6.13958-(-18.35947)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0.49858 + (((tickAnim - 18) / 5) * (5.30086-(0.49858)));
            yy = -20.56963 + (((tickAnim - 18) / 5) * (-21.80844-(-20.56963)));
            zz = -6.13958 + (((tickAnim - 18) / 5) * (-17.03073-(-6.13958)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 5.30086 + (((tickAnim - 23) / 10) * (-0.47879-(5.30086)));
            yy = -21.80844 + (((tickAnim - 23) / 10) * (-0.18382-(-21.80844)));
            zz = -17.03073 + (((tickAnim - 23) / 10) * (-18.35947-(-17.03073)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -0.47879 + (((tickAnim - 33) / 5) * (0.49858-(-0.47879)));
            yy = -0.18382 + (((tickAnim - 33) / 5) * (-20.56963-(-0.18382)));
            zz = -18.35947 + (((tickAnim - 33) / 5) * (-6.13958-(-18.35947)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0.49858 + (((tickAnim - 38) / 2) * (2.1-(0.49858)));
            yy = -20.56963 + (((tickAnim - 38) / 2) * (-20.98-(-20.56963)));
            zz = -6.13958 + (((tickAnim - 38) / 2) * (-9.77-(-6.13958)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.86529 + (((tickAnim - 0) / 2) * (1.65463-(0.86529)));
            yy = 6.41373 + (((tickAnim - 0) / 2) * (7.30487-(6.41373)));
            zz = 11.23248 + (((tickAnim - 0) / 2) * (17.34783-(11.23248)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
            xx = 1.65463 + (((tickAnim - 2) / 10) * (-5.91537-(1.65463)));
            yy = 7.30487 + (((tickAnim - 2) / 10) * (-16.42761-(7.30487)));
            zz = 17.34783 + (((tickAnim - 2) / 10) * (21.89535-(17.34783)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -5.91537 + (((tickAnim - 12) / 5) * (-0.62308-(-5.91537)));
            yy = -16.42761 + (((tickAnim - 12) / 5) * (4.5556-(-16.42761)));
            zz = 21.89535 + (((tickAnim - 12) / 5) * (-0.9856-(21.89535)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -0.62308 + (((tickAnim - 17) / 5) * (1.90981-(-0.62308)));
            yy = 4.5556 + (((tickAnim - 17) / 5) * (7.24267-(4.5556)));
            zz = -0.9856 + (((tickAnim - 17) / 5) * (19.36308-(-0.9856)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 1.90981 + (((tickAnim - 22) / 10) * (-5.62106-(1.90981)));
            yy = 7.24267 + (((tickAnim - 22) / 10) * (-16.52812-(7.24267)));
            zz = 19.36308 + (((tickAnim - 22) / 10) * (20.8578-(19.36308)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -5.62106 + (((tickAnim - 32) / 5) * (-0.62308-(-5.62106)));
            yy = -16.52812 + (((tickAnim - 32) / 5) * (4.5556-(-16.52812)));
            zz = 20.8578 + (((tickAnim - 32) / 5) * (-0.9856-(20.8578)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -0.62308 + (((tickAnim - 37) / 3) * (0.86529-(-0.62308)));
            yy = 4.5556 + (((tickAnim - 37) / 3) * (6.41373-(4.5556)));
            zz = -0.9856 + (((tickAnim - 37) / 3) * (11.23248-(-0.9856)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -10.23 + (((tickAnim - 0) / 5) * (-17.06133-(-10.23)));
            yy = -22.96 + (((tickAnim - 0) / 5) * (-33.92179-(-22.96)));
            zz = 24.3 + (((tickAnim - 0) / 5) * (29.41121-(24.3)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -17.06133 + (((tickAnim - 5) / 5) * (-5.16627-(-17.06133)));
            yy = -33.92179 + (((tickAnim - 5) / 5) * (-14.8597-(-33.92179)));
            zz = 29.41121 + (((tickAnim - 5) / 5) * (12.4562-(29.41121)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -5.16627 + (((tickAnim - 10) / 5) * (-5.25888-(-5.16627)));
            yy = -14.8597 + (((tickAnim - 10) / 5) * (-11.34949-(-14.8597)));
            zz = 12.4562 + (((tickAnim - 10) / 5) * (22.70033-(12.4562)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -5.25888 + (((tickAnim - 15) / 10) * (-17.82763-(-5.25888)));
            yy = -11.34949 + (((tickAnim - 15) / 10) * (-33.62199-(-11.34949)));
            zz = 22.70033 + (((tickAnim - 15) / 10) * (30.63486-(22.70033)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -17.82763 + (((tickAnim - 25) / 5) * (-5.17-(-17.82763)));
            yy = -33.62199 + (((tickAnim - 25) / 5) * (-14.86-(-33.62199)));
            zz = 30.63486 + (((tickAnim - 25) / 5) * (12.46-(30.63486)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -5.17 + (((tickAnim - 30) / 5) * (-4.96584-(-5.17)));
            yy = -14.86 + (((tickAnim - 30) / 5) * (-11.4386-(-14.86)));
            zz = 12.46 + (((tickAnim - 30) / 5) * (21.6621-(12.46)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -4.96584 + (((tickAnim - 35) / 5) * (-10.23-(-4.96584)));
            yy = -11.4386 + (((tickAnim - 35) / 5) * (-22.96-(-11.4386)));
            zz = 21.6621 + (((tickAnim - 35) / 5) * (24.3-(21.6621)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.38466-(0)));
            yy = 3.5 + (((tickAnim - 0) / 5) * (4.7416-(3.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.5294-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.38466 + (((tickAnim - 5) / 5) * (0-(-0.38466)));
            yy = 4.7416 + (((tickAnim - 5) / 5) * (6-(4.7416)));
            zz = -2.5294 + (((tickAnim - 5) / 5) * (0-(-2.5294)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0.39397-(0)));
            yy = 6 + (((tickAnim - 10) / 4) * (4.9497-(6)));
            zz = 0 + (((tickAnim - 10) / 4) * (2.5308-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0.39397 + (((tickAnim - 14) / 6) * (0-(0.39397)));
            yy = 4.9497 + (((tickAnim - 14) / 6) * (3.5-(4.9497)));
            zz = 2.5308 + (((tickAnim - 14) / 6) * (0-(2.5308)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (-0.37536-(0)));
            yy = 3.5 + (((tickAnim - 20) / 4) * (4.5335-(3.5)));
            zz = 0 + (((tickAnim - 20) / 4) * (-2.528-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -0.37536 + (((tickAnim - 24) / 6) * (0-(-0.37536)));
            yy = 4.5335 + (((tickAnim - 24) / 6) * (6-(4.5335)));
            zz = -2.528 + (((tickAnim - 24) / 6) * (0-(-2.528)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0.39397-(0)));
            yy = 6 + (((tickAnim - 30) / 4) * (4.9497-(6)));
            zz = 0 + (((tickAnim - 30) / 4) * (2.5308-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0.39397 + (((tickAnim - 34) / 6) * (0-(0.39397)));
            yy = 4.9497 + (((tickAnim - 34) / 6) * (3.5-(4.9497)));
            zz = 2.5308 + (((tickAnim - 34) / 6) * (0-(2.5308)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legL5_2, legL5_2.rotateAngleX + (float) Math.toRadians(0), legL5_2.rotateAngleY + (float) Math.toRadians(45), legL5_2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.38466-(0)));
            yy = -4.5 + (((tickAnim - 0) / 5) * (-5.74161-(-4.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (2.5294-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.38466 + (((tickAnim - 5) / 5) * (0-(-0.38466)));
            yy = -5.74161 + (((tickAnim - 5) / 5) * (-7-(-5.74161)));
            zz = 2.5294 + (((tickAnim - 5) / 5) * (0-(2.5294)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0.39397-(0)));
            yy = -7 + (((tickAnim - 10) / 4) * (-5.94974-(-7)));
            zz = 0 + (((tickAnim - 10) / 4) * (-2.53083-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0.39397 + (((tickAnim - 14) / 6) * (0-(0.39397)));
            yy = -5.94974 + (((tickAnim - 14) / 6) * (-4.5-(-5.94974)));
            zz = -2.53083 + (((tickAnim - 14) / 6) * (0-(-2.53083)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (-0.37536-(0)));
            yy = -4.5 + (((tickAnim - 20) / 4) * (-5.53348-(-4.5)));
            zz = 0 + (((tickAnim - 20) / 4) * (2.528-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -0.37536 + (((tickAnim - 24) / 6) * (0-(-0.37536)));
            yy = -5.53348 + (((tickAnim - 24) / 6) * (-7-(-5.53348)));
            zz = 2.528 + (((tickAnim - 24) / 6) * (0-(2.528)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0.39397-(0)));
            yy = -7 + (((tickAnim - 30) / 4) * (-5.94974-(-7)));
            zz = 0 + (((tickAnim - 30) / 4) * (-2.53083-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0.39397 + (((tickAnim - 34) / 6) * (0-(0.39397)));
            yy = -5.94974 + (((tickAnim - 34) / 6) * (-4.5-(-5.94974)));
            zz = -2.53083 + (((tickAnim - 34) / 6) * (0-(-2.53083)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legR5_2, legR5_2.rotateAngleX + (float) Math.toRadians(0), legR5_2.rotateAngleY + (float) Math.toRadians(-45), legR5_2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(1.7365+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-115))*2.5), legL1.rotateAngleY + (float) Math.toRadians(12.6191+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-145))*5), legL1.rotateAngleZ + (float) Math.toRadians(5.1875+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-115))*10));


        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(2.2147+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+115))*2.5), legR1.rotateAngleY + (float) Math.toRadians(-12.191+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+145))*5), legR1.rotateAngleZ + (float) Math.toRadians(-6.3232+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+115))*10));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 2.5 + (((tickAnim - 20) / 20) * (0-(2.5)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(cheliceraL, cheliceraL.rotateAngleX + (float) Math.toRadians(xx), cheliceraL.rotateAngleY + (float) Math.toRadians(yy), cheliceraL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = -2.5 + (((tickAnim - 20) / 20) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(cheliceraR, cheliceraR.rotateAngleX + (float) Math.toRadians(xx), cheliceraR.rotateAngleY + (float) Math.toRadians(yy), cheliceraR.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraSlimonia entity = (EntityPrehistoricFloraSlimonia) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25+120))), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.offsetX = (float) Math.toRadians(0);
        this.body.offsetY = (float) Math.toRadians(3.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25+150))/4);
        this.body.offsetZ = (float) Math.toRadians(0);


        this.setRotateAngle(tergite1, tergite1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25))*2.5), tergite1.rotateAngleY + (float) Math.toRadians(0), tergite1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite2_3, tergite2_3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25-15))*3), tergite2_3.rotateAngleY + (float) Math.toRadians(0), tergite2_3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite4_5, tergite4_5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25-30))*3), tergite4_5.rotateAngleY + (float) Math.toRadians(0), tergite4_5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite6, tergite6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25-45))*4), tergite6.rotateAngleY + (float) Math.toRadians(0), tergite6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite7, tergite7.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25-60))*8), tergite7.rotateAngleY + (float) Math.toRadians(0), tergite7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite8, tergite8.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25-90))*5), tergite8.rotateAngleY + (float) Math.toRadians(0), tergite8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite9, tergite9.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25-120))*6), tergite9.rotateAngleY + (float) Math.toRadians(0), tergite9.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite10, tergite10.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25-150))*7), tergite10.rotateAngleY + (float) Math.toRadians(0), tergite10.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite11, tergite11.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25-180))*8), tergite11.rotateAngleY + (float) Math.toRadians(0), tergite11.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tergite12, tergite12.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25-210))*9), tergite12.rotateAngleY + (float) Math.toRadians(0), tergite12.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25-270))*10), telson.rotateAngleY + (float) Math.toRadians(0), telson.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -20.94102D + (((tickAnim - 0D) / 10D) * (-18.0372D-(-20.94102D)));
            yy = -40.78947D + (((tickAnim - 0D) / 10D) * (-42.01708D-(-40.78947D)));
            zz = 30.36119D + (((tickAnim - 0D) / 10D) * (28.4404D-(30.36119D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.0372D + (((tickAnim - 10D) / 10D) * (-20.94102D-(-18.0372D)));
            yy = -42.01708D + (((tickAnim - 10D) / 10D) * (-40.78947D-(-42.01708D)));
            zz = 28.4404D + (((tickAnim - 10D) / 10D) * (30.36119D-(28.4404D)));
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -20.94102D + (((tickAnim - 0D) / 10D) * (-18.0372D-(-20.94102D)));
            yy = 40.78947D + (((tickAnim - 0D) / 10D) * (42.01708D-(40.78947D)));
            zz = -30.36119D + (((tickAnim - 0D) / 10D) * (-28.4404D-(-30.36119D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.0372D + (((tickAnim - 10D) / 10D) * (-20.94102D-(-18.0372D)));
            yy = 42.01708D + (((tickAnim - 10D) / 10D) * (40.78947D-(42.01708D)));
            zz = -28.4404D + (((tickAnim - 10D) / 10D) * (-30.36119D-(-28.4404D)));
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -20.94102D + (((tickAnim - 0D) / 10D) * (-23.73649D-(-20.94102D)));
            yy = 40.78947D + (((tickAnim - 0D) / 10D) * (39.49176D-(40.78947D)));
            zz = -30.36119D + (((tickAnim - 0D) / 10D) * (-32.16366D-(-30.36119D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -23.73649D + (((tickAnim - 10D) / 10D) * (-20.94102D-(-23.73649D)));
            yy = 39.49176D + (((tickAnim - 10D) / 10D) * (40.78947D-(39.49176D)));
            zz = -32.16366D + (((tickAnim - 10D) / 10D) * (-30.36119D-(-32.16366D)));
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -20.94102D + (((tickAnim - 0D) / 10D) * (-18.0372D-(-20.94102D)));
            yy = 40.78947D + (((tickAnim - 0D) / 10D) * (42.01708D-(40.78947D)));
            zz = -30.36119D + (((tickAnim - 0D) / 10D) * (-28.4404D-(-30.36119D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.0372D + (((tickAnim - 10D) / 10D) * (-20.94102D-(-18.0372D)));
            yy = 42.01708D + (((tickAnim - 10D) / 10D) * (40.78947D-(42.01708D)));
            zz = -28.4404D + (((tickAnim - 10D) / 10D) * (-30.36119D-(-28.4404D)));
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -20.94102D + (((tickAnim - 0D) / 10D) * (-23.73649D-(-20.94102D)));
            yy = -40.78947D + (((tickAnim - 0D) / 10D) * (-39.49176D-(-40.78947D)));
            zz = 30.36119D + (((tickAnim - 0D) / 10D) * (32.16366D-(30.36119D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -23.73649D + (((tickAnim - 10D) / 10D) * (-20.94102D-(-23.73649D)));
            yy = -39.49176D + (((tickAnim - 10D) / 10D) * (-40.78947D-(-39.49176D)));
            zz = 32.16366D + (((tickAnim - 10D) / 10D) * (30.36119D-(32.16366D)));
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -20.94102D + (((tickAnim - 0D) / 10D) * (-18.0372D-(-20.94102D)));
            yy = -40.78947D + (((tickAnim - 0D) / 10D) * (-42.01708D-(-40.78947D)));
            zz = 30.36119D + (((tickAnim - 0D) / 10D) * (28.4404D-(30.36119D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.0372D + (((tickAnim - 10D) / 10D) * (-20.94102D-(-18.0372D)));
            yy = -42.01708D + (((tickAnim - 10D) / 10D) * (-40.78947D-(-42.01708D)));
            zz = 28.4404D + (((tickAnim - 10D) / 10D) * (30.36119D-(28.4404D)));
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 15.85774D + (((tickAnim - 0D) / 8D) * (11.89969D-(15.85774D)));
            yy = -4.96135D + (((tickAnim - 0D) / 8D) * (-2.68596D-(-4.96135D)));
            zz = 15.63346D + (((tickAnim - 0D) / 8D) * (7.65797D-(15.63346D)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 11.89969D + (((tickAnim - 8D) / 12D) * (15.85774D-(11.89969D)));
            yy = -2.68596D + (((tickAnim - 8D) / 12D) * (-4.96135D-(-2.68596D)));
            zz = 7.65797D + (((tickAnim - 8D) / 12D) * (15.63346D-(7.65797D)));
        }
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legL5_2, legL5_2.rotateAngleX + (float) Math.toRadians(0), legL5_2.rotateAngleY + (float) Math.toRadians(35), legL5_2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 15.85774D + (((tickAnim - 0D) / 8D) * (11.89969D-(15.85774D)));
            yy = 4.96135D + (((tickAnim - 0D) / 8D) * (2.68596D-(4.96135D)));
            zz = -15.63346D + (((tickAnim - 0D) / 8D) * (-7.65797D-(-15.63346D)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 11.89969D + (((tickAnim - 8D) / 12D) * (15.85774D-(11.89969D)));
            yy = 2.68596D + (((tickAnim - 8D) / 12D) * (4.96135D-(2.68596D)));
            zz = -7.65797D + (((tickAnim - 8D) / 12D) * (-15.63346D-(-7.65797D)));
        }
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legR5_2, legR5_2.rotateAngleX + (float) Math.toRadians(0), legR5_2.rotateAngleY + (float) Math.toRadians(-35), legR5_2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -9.16622D + (((tickAnim - 0D) / 10D) * (-12.08108D-(-9.16622D)));
            yy = -45.67345D + (((tickAnim - 0D) / 10D) * (-43.69086D-(-45.67345D)));
            zz = 24.57429D + (((tickAnim - 0D) / 10D) * (18.8046D-(24.57429D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12.08108D + (((tickAnim - 10D) / 10D) * (-9.16622D-(-12.08108D)));
            yy = -43.69086D + (((tickAnim - 10D) / 10D) * (-45.67345D-(-43.69086D)));
            zz = 18.8046D + (((tickAnim - 10D) / 10D) * (24.57429D-(18.8046D)));
        }
        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(xx), legL1.rotateAngleY + (float) Math.toRadians(yy), legL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -9.16622D + (((tickAnim - 0D) / 10D) * (-12.09999D-(-9.16622D)));
            yy = 45.67345D + (((tickAnim - 0D) / 10D) * (43.90584D-(45.67345D)));
            zz = -24.57429D + (((tickAnim - 0D) / 10D) * (-18.84359D-(-24.57429D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12.09999D + (((tickAnim - 10D) / 10D) * (-9.16622D-(-12.09999D)));
            yy = 43.90584D + (((tickAnim - 10D) / 10D) * (45.67345D-(43.90584D)));
            zz = -18.84359D + (((tickAnim - 10D) / 10D) * (-24.57429D-(-18.84359D)));
        }
        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(xx), legR1.rotateAngleY + (float) Math.toRadians(yy), legR1.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSlimonia e = (EntityPrehistoricFloraSlimonia) entity;
        animator.update(entity);

        animator.setAnimation(e.SWIM_ANIMATION);
        animator.startKeyframe(e.swimTransitionLength()); //move to this keyframe over the right length
        animator.rotate(legL2, -(float)Math.toRadians(20.941), -(float)Math.toRadians(40.7895),(float)Math.toRadians(30.3612));
        animator.rotate(legL3, -(float)Math.toRadians(20.941), -(float)Math.toRadians(40.7895),(float)Math.toRadians(30.3612));
        animator.rotate(legL4, -(float)Math.toRadians(20.941),-(float)Math.toRadians(40.7895),(float)Math.toRadians(30.3612));
        animator.rotate(legR2, -(float)Math.toRadians(20.941), (float)Math.toRadians(40.7895),-(float)Math.toRadians(30.3612));
        animator.rotate(legR3, -(float)Math.toRadians(20.941),(float)Math.toRadians(40.7895),-(float)Math.toRadians(30.3612));
        animator.rotate(legR4,-(float)Math.toRadians(20.941),(float)Math.toRadians(40.7895),-(float)Math.toRadians(30.3612));
        animator.rotate(legR5, -(float)Math.toRadians(15.8577),-(float)Math.toRadians(4.9614),(float)Math.toRadians(15.6335));
        animator.rotate(legL5, -(float)Math.toRadians(15.8577),(float)Math.toRadians(4.9614),-(float)Math.toRadians(15.6335));
        animator.rotate(legR1, (float)Math.toRadians(9.1662), -(float)Math.toRadians(45.6734),(float)Math.toRadians(24.5743));
        animator.rotate(legL1, (float)Math.toRadians(9.1662), (float)Math.toRadians(45.6734),-(float)Math.toRadians(24.5743));
        animator.rotate(legL5_2, (float)Math.toRadians(0),-(float)Math.toRadians(35),(float)Math.toRadians(0));
        animator.rotate(legL5_3, (float)Math.toRadians(0), (float)Math.toRadians(0),(float)Math.toRadians(0));
        animator.rotate(legR5_2, (float)Math.toRadians(0), (float)Math.toRadians(35),(float)Math.toRadians(0));
        animator.rotate(legR5_3, (float)Math.toRadians(0), (float)Math.toRadians(0),(float)Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNSWIM_ANIMATION);
        animator.startKeyframe(e.unswimTransitionLength()); //move to this keyframe over the right length
        animator.rotate(legL2, (float)Math.toRadians(0), -(float)Math.toRadians(5),(float)Math.toRadians(15));
        animator.rotate(legL3, (float)Math.toRadians(0), (float)Math.toRadians(0),(float)Math.toRadians(15));
        animator.rotate(legL4, (float)Math.toRadians(0),(float)Math.toRadians(5),(float)Math.toRadians(15));
        animator.rotate(legR2, (float)Math.toRadians(0), (float)Math.toRadians(5),(float)Math.toRadians(15));
        animator.rotate(legR3, (float)Math.toRadians(0),(float)Math.toRadians(0),(float)Math.toRadians(15));
        animator.rotate(legR4,(float)Math.toRadians(0),-(float)Math.toRadians(5),(float)Math.toRadians(15));
        animator.rotate(legR5, (float)Math.toRadians(0),(float)Math.toRadians(-3.5),(float)Math.toRadians(0));
        animator.rotate(legL5, (float)Math.toRadians(0),(float)Math.toRadians(3.5),(float)Math.toRadians(0));
        animator.rotate(legR1, -(float)Math.toRadians(1.7365), -(float)Math.toRadians(12.6191),-(float)Math.toRadians(5.1875));
        animator.rotate(legL1, -(float)Math.toRadians(1.7365), (float)Math.toRadians(12.6191),(float)Math.toRadians(5.1875));
        animator.rotate(legL5_2, (float)Math.toRadians(0),(float)Math.toRadians(0),(float)Math.toRadians(0));
        animator.rotate(legL5_3, (float)Math.toRadians(0), (float)Math.toRadians(0),(float)Math.toRadians(0));
        animator.rotate(legR5_2, (float)Math.toRadians(0), (float)Math.toRadians(0),(float)Math.toRadians(0));
        animator.rotate(legR5_3, (float)Math.toRadians(0), (float)Math.toRadians(0),(float)Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
