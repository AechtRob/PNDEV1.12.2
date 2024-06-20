package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraStrobilopterus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelStrobilopterus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer Body6;
    private final AdvancedModelRenderer Telson;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer bone2;


    private ModelAnimator animator;


    public ModelStrobilopterus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(-1.5F, 22.95F, -7.75F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 6, -2.5F, -2.0F, 2.75F, 8, 2, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 19, 0.0F, -2.0F, 0.0F, 3, 2, 3, 0.01F, false));
        this.Body.cubeList.add(new ModelBox(Body, 7, 14, -0.5F, -2.025F, 1.5F, 4, 0, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 20, 11, 0.0F, -2.04F, 2.0F, 3, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.7418F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 13, -2.0F, -2.0F, 2.7F, 2, 2, 1, -0.015F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 19, -2.0F, -2.0F, 0.0F, 2, 2, 3, -0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.7418F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 19, 0.0F, -2.0F, 0.0F, 2, 2, 3, -0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 13, 0.0F, -2.0F, 2.7F, 2, 2, 1, -0.015F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(1.5F, -0.95F, 4.75F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.0436F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 0, -4.0F, -1.0F, -0.2F, 8, 2, 4, -0.01F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 3.8F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 10, -3.5F, -0.975F, -0.025F, 7, 2, 2, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.1F, 2.0F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, -0.0262F, 0.0F, 0.0F);
        this.Body4.cubeList.add(new ModelBox(Body4, 9, 17, -1.5F, -1.0F, -0.5F, 3, 2, 3, -0.01F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 14, -1.5F, -1.0F, -0.025F, 3, 2, 3, 0.0F, false));

        this.Body6 = new AdvancedModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body5.addChild(Body6);
        this.Body6.cubeList.add(new ModelBox(Body6, 20, 7, -1.0F, -1.0F, -0.5F, 2, 2, 2, -0.01F, false));

        this.Telson = new AdvancedModelRenderer(this);
        this.Telson.setRotationPoint(0.0F, 0.0F, 1.475F);
        this.Body6.addChild(Telson);
        this.Telson.cubeList.add(new ModelBox(Telson, 12, 10, -0.5F, -0.5F, -0.375F, 1, 1, 6, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(0.75F, 0.0F, 0.75F);
        this.Body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, -0.6109F, -0.48F);
        this.legR.cubeList.add(new ModelBox(legR, 19, 3, -2.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(2.25F, 0.0F, 0.75F);
        this.Body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.6109F, 0.48F);
        this.legL.cubeList.add(new ModelBox(legL, 19, 3, -0.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(0.75F, 0.0F, 1.5F);
        this.Body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, -0.3927F, -0.3316F);
        this.legR2.cubeList.add(new ModelBox(legR2, 17, 18, -3.5F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(2.25F, 0.0F, 1.5F);
        this.Body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.3927F, 0.3316F);
        this.legL2.cubeList.add(new ModelBox(legL2, 17, 18, -0.5F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(0.75F, 0.0F, 2.05F);
        this.Body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, -0.1745F, -0.2618F);
        this.legR3.cubeList.add(new ModelBox(legR3, 17, 17, -4.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(2.25F, 0.0F, 2.05F);
        this.Body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.1745F, 0.2618F);
        this.legL3.cubeList.add(new ModelBox(legL3, 17, 17, 0.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(0.75F, 0.0F, 2.45F);
        this.Body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.1309F, -0.2182F);
        this.legR4.cubeList.add(new ModelBox(legR4, 17, 6, -4.75F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(2.25F, 0.0F, 2.45F);
        this.Body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -0.1309F, 0.2182F);
        this.legL4.cubeList.add(new ModelBox(legL4, 17, 6, -0.25F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.5F, 0.0F, 3.7F);
        this.Body.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.3491F, -0.1309F);
        this.legR5.cubeList.add(new ModelBox(legR5, 12, 22, -2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(-1.7935F, 0.01F, -0.0538F);
        this.legR5.addChild(bone);
        this.setRotateAngle(bone, 0.0F, 0.4363F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 20, 0, -3.01F, -0.51F, -0.99F, 3, 1, 2, 0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -3.51F, -0.51F, -0.69F, 1, 1, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(3.5F, 0.0F, 3.7F);
        this.Body.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, -0.3491F, 0.1309F);
        this.legL5.cubeList.add(new ModelBox(legL5, 12, 22, 0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(1.7851F, 0.01F, -0.0356F);
        this.legL5.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, -0.4363F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 20, 0, 0.01F, -0.51F, -1.01F, 3, 1, 2, 0.01F, true));
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 0, 2.51F, -0.51F, -0.71F, 1, 1, 1, 0.0F, true));

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
        this.setRotateAngle(Body2, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.05F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.05F, 0.0F);
        this.setRotateAngle(Body6, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Telson, 0.0F, 0.0F, 0.0F);
        this.Body.offsetZ = -0.03F;
        this.Body.offsetY = 0.16F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.Body.offsetZ = 0.030F;
        this.Body.render(0.01f);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Body.offsetY = 0.0F;
        this.Body.offsetX = 1.5F;
        this.Body.rotateAngleY = (float)Math.toRadians(200);
        this.Body.rotateAngleX = (float)Math.toRadians(8);
        this.Body.rotateAngleZ = (float)Math.toRadians(-8);
        this.Body.scaleChildren = true;
        float scaler = 4.0F;
        this.Body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Body, 0.3F, -3.3F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.9F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Body6, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Telson, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Body.render(f);
        //Reset rotations, positions and sizing:
        this.Body.setScale(1.0F, 1.0F, 1.0F);
        this.Body.scaleChildren = false;
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
       // this.body.offsetZ = 0.4F;
        //this.body.offsetY = -0.2F;
        this.Body.offsetZ = -0.1F;


        AdvancedModelRenderer[] fishBody = {this.Body2, this.Body3, this.Body4, this.Body5, this.Body6, this.Telson};
        AdvancedModelRenderer[] fishTail = {this.Body6, this.Telson};



        //mouthparts:
       // this.walk(cheliceraL, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
        //this.walk(cheliceraR, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

        float speed = 0.2F;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.05F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        EntityPrehistoricFloraStrobilopterus slimon = (EntityPrehistoricFloraStrobilopterus) e;


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
        EntityPrehistoricFloraStrobilopterus ee = (EntityPrehistoricFloraStrobilopterus) entitylivingbaseIn;
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
        EntityPrehistoricFloraStrobilopterus entity = (EntityPrehistoricFloraStrobilopterus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+50))*3), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(0.3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+150))/4);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0);


        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+20))*2), Body2.rotateAngleY + (float) Math.toRadians(0), Body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body3, Body3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-10))*3), Body3.rotateAngleY + (float) Math.toRadians(0), Body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body4, Body4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-40))*4), Body4.rotateAngleY + (float) Math.toRadians(0), Body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body5, Body5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-70))*5), Body5.rotateAngleY + (float) Math.toRadians(0), Body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body6, Body6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-100))*6), Body6.rotateAngleY + (float) Math.toRadians(0), Body6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Telson, Telson.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-130))*7), Telson.rotateAngleY + (float) Math.toRadians(0), Telson.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2), legR.rotateAngleY + (float) Math.toRadians(45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*2), legR.rotateAngleZ + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*2));


        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2), legL.rotateAngleY + (float) Math.toRadians(-45-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*2), legL.rotateAngleZ + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*2));


        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*2), legR2.rotateAngleY + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2), legR2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*2));


        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*2), legL2.rotateAngleY + (float) Math.toRadians(-40-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2), legL2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*2));


        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+120))*2), legR3.rotateAngleY + (float) Math.toRadians(35+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*2), legR3.rotateAngleZ + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2));


        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+120))*2), legL3.rotateAngleY + (float) Math.toRadians(-35-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*2), legL3.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2));


        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+150))*2), legR4.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+120))*2), legR4.rotateAngleZ + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*2));


        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+150))*2), legL4.rotateAngleY + (float) Math.toRadians(-30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+120))*2), legL4.rotateAngleZ + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*2));

        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(bone, bone.rotateAngleX + (float) Math.toRadians(xx), bone.rotateAngleY + (float) Math.toRadians(yy), bone.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(bone2, bone2.rotateAngleX + (float) Math.toRadians(xx), bone2.rotateAngleY + (float) Math.toRadians(yy), bone2.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraStrobilopterus entity = (EntityPrehistoricFloraStrobilopterus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = 0;

        tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+50))*3), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(0.3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))/4);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0);


        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+20))*2), Body2.rotateAngleY + (float) Math.toRadians(0), Body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body3, Body3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-10))*3), Body3.rotateAngleY + (float) Math.toRadians(0), Body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body4, Body4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-40))*4), Body4.rotateAngleY + (float) Math.toRadians(0), Body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body5, Body5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-70))*5), Body5.rotateAngleY + (float) Math.toRadians(0), Body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body6, Body6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-100))*6), Body6.rotateAngleY + (float) Math.toRadians(0), Body6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Telson, Telson.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-130))*7), Telson.rotateAngleY + (float) Math.toRadians(0), Telson.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2), legR.rotateAngleY + (float) Math.toRadians(45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*2), legR.rotateAngleZ + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*2));


        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2), legL.rotateAngleY + (float) Math.toRadians(-45-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*2), legL.rotateAngleZ + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*2));


        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2), legR2.rotateAngleY + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2), legR2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*2));


        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2), legL2.rotateAngleY + (float) Math.toRadians(-40-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2), legL2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*2));


        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*2), legR3.rotateAngleY + (float) Math.toRadians(35+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2), legR3.rotateAngleZ + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2));


        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*2), legL3.rotateAngleY + (float) Math.toRadians(-35-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2), legL3.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2));


        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*2), legR4.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*2), legR4.rotateAngleZ + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2));


        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*2), legL4.rotateAngleY + (float) Math.toRadians(-30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*2), legL4.rotateAngleZ + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2));


        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+260))*15), legR5.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+210))*25), legR5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*15));


        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+260))*15), legL5.rotateAngleY + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+210))*25), legL5.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*15));


        this.setRotateAngle(bone, bone.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+270))*25), bone.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*35), bone.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+310))*25));


        this.setRotateAngle(bone2, bone2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+270))*25), bone2.rotateAngleY + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*35), bone2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+310))*25));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraStrobilopterus entity = (EntityPrehistoricFloraStrobilopterus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5))), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+90))), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+60))*0.5));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(0.3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+30))*0.15);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0);


        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-30))), Body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+60))), Body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body3, Body3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-60))), Body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+30))), Body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body4, Body4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-90))), Body4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5))), Body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body5, Body5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-120))), Body5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-30))), Body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body6, Body6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-150))), Body6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-60))), Body6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Telson, Telson.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-180))), Telson.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-90))), Telson.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 10.27029 + (((tickAnim - 0) / 8) * (-7.37821-(10.27029)));
            yy = -12.9097 + (((tickAnim - 0) / 8) * (13.53239-(-12.9097)));
            zz = -6.8528 + (((tickAnim - 0) / 8) * (3.51864-(-6.8528)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -7.37821 + (((tickAnim - 8) / 4) * (4.38746-(-7.37821)));
            yy = 13.53239 + (((tickAnim - 8) / 4) * (-4.09567-(13.53239)));
            zz = 3.51864 + (((tickAnim - 8) / 4) * (24.10435-(3.51864)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 4.38746 + (((tickAnim - 12) / 3) * (10.27029-(4.38746)));
            yy = -4.09567 + (((tickAnim - 12) / 3) * (-12.9097-(-4.09567)));
            zz = 24.10435 + (((tickAnim - 12) / 3) * (-6.8528-(24.10435)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 10.27029 + (((tickAnim - 15) / 8) * (-7.37821-(10.27029)));
            yy = -12.9097 + (((tickAnim - 15) / 8) * (13.53239-(-12.9097)));
            zz = -6.8528 + (((tickAnim - 15) / 8) * (3.51864-(-6.8528)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -7.37821 + (((tickAnim - 23) / 4) * (4.38746-(-7.37821)));
            yy = 13.53239 + (((tickAnim - 23) / 4) * (-4.09567-(13.53239)));
            zz = 3.51864 + (((tickAnim - 23) / 4) * (24.10435-(3.51864)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 4.38746 + (((tickAnim - 27) / 3) * (10.27029-(4.38746)));
            yy = -4.09567 + (((tickAnim - 27) / 3) * (-12.9097-(-4.09567)));
            zz = 24.10435 + (((tickAnim - 27) / 3) * (-6.8528-(24.10435)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -5.42 + (((tickAnim - 0) / 1) * (-7.37821-(-5.42)));
            yy = -10.59 + (((tickAnim - 0) / 1) * (-13.53239-(-10.59)));
            zz = -2.37 + (((tickAnim - 0) / 1) * (-3.51864-(-2.37)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = -7.37821 + (((tickAnim - 1) / 4) * (4.38746-(-7.37821)));
            yy = -13.53239 + (((tickAnim - 1) / 4) * (4.09567-(-13.53239)));
            zz = -3.51864 + (((tickAnim - 1) / 4) * (-24.10435-(-3.51864)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 4.38746 + (((tickAnim - 5) / 3) * (10.27029-(4.38746)));
            yy = 4.09567 + (((tickAnim - 5) / 3) * (12.9097-(4.09567)));
            zz = -24.10435 + (((tickAnim - 5) / 3) * (6.8528-(-24.10435)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 10.27029 + (((tickAnim - 8) / 8) * (-7.37821-(10.27029)));
            yy = 12.9097 + (((tickAnim - 8) / 8) * (-13.53239-(12.9097)));
            zz = 6.8528 + (((tickAnim - 8) / 8) * (-3.51864-(6.8528)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -7.37821 + (((tickAnim - 16) / 4) * (4.38746-(-7.37821)));
            yy = -13.53239 + (((tickAnim - 16) / 4) * (4.09567-(-13.53239)));
            zz = -3.51864 + (((tickAnim - 16) / 4) * (-24.10435-(-3.51864)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 4.38746 + (((tickAnim - 20) / 3) * (10.27029-(4.38746)));
            yy = 4.09567 + (((tickAnim - 20) / 3) * (12.9097-(4.09567)));
            zz = -24.10435 + (((tickAnim - 20) / 3) * (6.8528-(-24.10435)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 10.27029 + (((tickAnim - 23) / 7) * (-5.42-(10.27029)));
            yy = 12.9097 + (((tickAnim - 23) / 7) * (-10.59-(12.9097)));
            zz = 6.8528 + (((tickAnim - 23) / 7) * (-2.37-(6.8528)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.04 + (((tickAnim - 0) / 3) * (-4.88437-(-0.04)));
            yy = 1.66 + (((tickAnim - 0) / 3) * (14.24647-(1.66)));
            zz = -0.6 + (((tickAnim - 0) / 3) * (1.30596-(-0.6)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -4.88437 + (((tickAnim - 3) / 5) * (2.3866-(-4.88437)));
            yy = 14.24647 + (((tickAnim - 3) / 5) * (-4.62783-(14.24647)));
            zz = 1.30596 + (((tickAnim - 3) / 5) * (15.94002-(1.30596)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 2.3866 + (((tickAnim - 8) / 3) * (6.02208-(2.3866)));
            yy = -4.62783 + (((tickAnim - 8) / 3) * (-14.06497-(-4.62783)));
            zz = 15.94002 + (((tickAnim - 8) / 3) * (-2.99295-(15.94002)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 6.02208 + (((tickAnim - 11) / 7) * (-4.88437-(6.02208)));
            yy = -14.06497 + (((tickAnim - 11) / 7) * (14.24647-(-14.06497)));
            zz = -2.99295 + (((tickAnim - 11) / 7) * (1.30596-(-2.99295)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -4.88437 + (((tickAnim - 18) / 5) * (2.3866-(-4.88437)));
            yy = 14.24647 + (((tickAnim - 18) / 5) * (-4.62783-(14.24647)));
            zz = 1.30596 + (((tickAnim - 18) / 5) * (15.94002-(1.30596)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 2.3866 + (((tickAnim - 23) / 3) * (6.02208-(2.3866)));
            yy = -4.62783 + (((tickAnim - 23) / 3) * (-14.06497-(-4.62783)));
            zz = 15.94002 + (((tickAnim - 23) / 3) * (-2.99295-(15.94002)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 6.02208 + (((tickAnim - 26) / 4) * (-0.04-(6.02208)));
            yy = -14.06497 + (((tickAnim - 26) / 4) * (1.66-(-14.06497)));
            zz = -2.99295 + (((tickAnim - 26) / 4) * (-0.6-(-2.99295)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0.93 + (((tickAnim - 0) / 1) * (2.3866-(0.93)));
            yy = 0.85 + (((tickAnim - 0) / 1) * (4.62783-(0.85)));
            zz = -13.01 + (((tickAnim - 0) / 1) * (-15.94002-(-13.01)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 2.3866 + (((tickAnim - 1) / 3) * (6.02208-(2.3866)));
            yy = 4.62783 + (((tickAnim - 1) / 3) * (14.06497-(4.62783)));
            zz = -15.94002 + (((tickAnim - 1) / 3) * (2.99295-(-15.94002)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 6.02208 + (((tickAnim - 4) / 8) * (-4.88437-(6.02208)));
            yy = 14.06497 + (((tickAnim - 4) / 8) * (-14.24647-(14.06497)));
            zz = 2.99295 + (((tickAnim - 4) / 8) * (-1.30596-(2.99295)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -4.88437 + (((tickAnim - 12) / 4) * (2.3866-(-4.88437)));
            yy = -14.24647 + (((tickAnim - 12) / 4) * (4.62783-(-14.24647)));
            zz = -1.30596 + (((tickAnim - 12) / 4) * (-15.94002-(-1.30596)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 2.3866 + (((tickAnim - 16) / 3) * (6.02208-(2.3866)));
            yy = 4.62783 + (((tickAnim - 16) / 3) * (14.06497-(4.62783)));
            zz = -15.94002 + (((tickAnim - 16) / 3) * (2.99295-(-15.94002)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 6.02208 + (((tickAnim - 19) / 8) * (-4.88437-(6.02208)));
            yy = 14.06497 + (((tickAnim - 19) / 8) * (-14.24647-(14.06497)));
            zz = 2.99295 + (((tickAnim - 19) / 8) * (-1.30596-(2.99295)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -4.88437 + (((tickAnim - 27) / 3) * (0.93-(-4.88437)));
            yy = -14.24647 + (((tickAnim - 27) / 3) * (0.85-(-14.24647)));
            zz = -1.30596 + (((tickAnim - 27) / 3) * (-13.01-(-1.30596)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 2.87 + (((tickAnim - 0) / 2) * (4.22007-(2.87)));
            yy = -9.63 + (((tickAnim - 0) / 2) * (-14.45215-(-9.63)));
            zz = 6.48 + (((tickAnim - 0) / 2) * (-1.26025-(6.48)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = 4.22007 + (((tickAnim - 2) / 7) * (-3.85287-(4.22007)));
            yy = -14.45215 + (((tickAnim - 2) / 7) * (14.50067-(-14.45215)));
            zz = -1.26025 + (((tickAnim - 2) / 7) * (0.18638-(-1.26025)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -3.85287 + (((tickAnim - 9) / 4) * (1.52909-(-3.85287)));
            yy = 14.50067 + (((tickAnim - 9) / 4) * (-4.80121-(14.50067)));
            zz = 0.18638 + (((tickAnim - 9) / 4) * (14.22196-(0.18638)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 1.52909 + (((tickAnim - 13) / 4) * (4.22007-(1.52909)));
            yy = -4.80121 + (((tickAnim - 13) / 4) * (-14.45215-(-4.80121)));
            zz = 14.22196 + (((tickAnim - 13) / 4) * (-1.26025-(14.22196)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 4.22007 + (((tickAnim - 17) / 7) * (-3.85287-(4.22007)));
            yy = -14.45215 + (((tickAnim - 17) / 7) * (14.50067-(-14.45215)));
            zz = -1.26025 + (((tickAnim - 17) / 7) * (0.18638-(-1.26025)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -3.85287 + (((tickAnim - 24) / 4) * (1.52909-(-3.85287)));
            yy = 14.50067 + (((tickAnim - 24) / 4) * (-4.80121-(14.50067)));
            zz = 0.18638 + (((tickAnim - 24) / 4) * (14.22196-(0.18638)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 1.52909 + (((tickAnim - 28) / 2) * (2.87-(1.52909)));
            yy = -4.80121 + (((tickAnim - 28) / 2) * (-9.63-(-4.80121)));
            zz = 14.22196 + (((tickAnim - 28) / 2) * (6.48-(14.22196)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1.16 + (((tickAnim - 0) / 3) * (-3.85287-(-1.16)));
            yy = -4.85 + (((tickAnim - 0) / 3) * (-14.50067-(-4.85)));
            zz = 0.3 + (((tickAnim - 0) / 3) * (-0.18638-(0.3)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -3.85287 + (((tickAnim - 3) / 4) * (1.52909-(-3.85287)));
            yy = -14.50067 + (((tickAnim - 3) / 4) * (4.80121-(-14.50067)));
            zz = -0.18638 + (((tickAnim - 3) / 4) * (-14.22196-(-0.18638)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 1.52909 + (((tickAnim - 7) / 3) * (4.22007-(1.52909)));
            yy = 4.80121 + (((tickAnim - 7) / 3) * (14.45215-(4.80121)));
            zz = -14.22196 + (((tickAnim - 7) / 3) * (1.26025-(-14.22196)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 4.22007 + (((tickAnim - 10) / 8) * (-3.85287-(4.22007)));
            yy = 14.45215 + (((tickAnim - 10) / 8) * (-14.50067-(14.45215)));
            zz = 1.26025 + (((tickAnim - 10) / 8) * (-0.18638-(1.26025)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -3.85287 + (((tickAnim - 18) / 4) * (1.52909-(-3.85287)));
            yy = -14.50067 + (((tickAnim - 18) / 4) * (4.80121-(-14.50067)));
            zz = -0.18638 + (((tickAnim - 18) / 4) * (-14.22196-(-0.18638)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 1.52909 + (((tickAnim - 22) / 3) * (4.22007-(1.52909)));
            yy = 4.80121 + (((tickAnim - 22) / 3) * (14.45215-(4.80121)));
            zz = -14.22196 + (((tickAnim - 22) / 3) * (1.26025-(-14.22196)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 4.22007 + (((tickAnim - 25) / 5) * (-1.16-(4.22007)));
            yy = 14.45215 + (((tickAnim - 25) / 5) * (-4.85-(14.45215)));
            zz = 1.26025 + (((tickAnim - 25) / 5) * (0.3-(1.26025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (-3.46684-(1)));
            yy = -4.89 + (((tickAnim - 0) / 5) * (14.62329-(-4.89)));
            zz = -0.29 + (((tickAnim - 0) / 5) * (-0.89381-(-0.29)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -3.46684 + (((tickAnim - 5) / 4) * (1.00205-(-3.46684)));
            yy = 14.62329 + (((tickAnim - 5) / 4) * (-4.89132-(14.62329)));
            zz = -0.89381 + (((tickAnim - 5) / 4) * (9.70875-(-0.89381)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 1.00205 + (((tickAnim - 9) / 4) * (3.2365-(1.00205)));
            yy = -4.89132 + (((tickAnim - 9) / 4) * (-14.64863-(-4.89132)));
            zz = 9.70875 + (((tickAnim - 9) / 4) * (0.01002-(9.70875)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 3.2365 + (((tickAnim - 13) / 7) * (-3.46684-(3.2365)));
            yy = -14.64863 + (((tickAnim - 13) / 7) * (14.62329-(-14.64863)));
            zz = 0.01002 + (((tickAnim - 13) / 7) * (-0.89381-(0.01002)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -3.46684 + (((tickAnim - 20) / 4) * (1.00205-(-3.46684)));
            yy = 14.62329 + (((tickAnim - 20) / 4) * (-4.89132-(14.62329)));
            zz = -0.89381 + (((tickAnim - 20) / 4) * (9.70875-(-0.89381)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 1.00205 + (((tickAnim - 24) / 4) * (3.2365-(1.00205)));
            yy = -4.89132 + (((tickAnim - 24) / 4) * (-14.64863-(-4.89132)));
            zz = 9.70875 + (((tickAnim - 24) / 4) * (0.01002-(9.70875)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 3.2365 + (((tickAnim - 28) / 2) * (1-(3.2365)));
            yy = -14.64863 + (((tickAnim - 28) / 2) * (-4.89-(-14.64863)));
            zz = 0.01002 + (((tickAnim - 28) / 2) * (-0.29-(0.01002)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1.68 + (((tickAnim - 0) / 3) * (1.00205-(-1.68)));
            yy = -6.82 + (((tickAnim - 0) / 3) * (4.89132-(-6.82)));
            zz = -3.35 + (((tickAnim - 0) / 3) * (-9.70875-(-3.35)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 1.00205 + (((tickAnim - 3) / 3) * (3.2365-(1.00205)));
            yy = 4.89132 + (((tickAnim - 3) / 3) * (14.64863-(4.89132)));
            zz = -9.70875 + (((tickAnim - 3) / 3) * (-0.01002-(-9.70875)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 3.2365 + (((tickAnim - 6) / 7) * (-3.46684-(3.2365)));
            yy = 14.64863 + (((tickAnim - 6) / 7) * (-14.62329-(14.64863)));
            zz = -0.01002 + (((tickAnim - 6) / 7) * (0.89381-(-0.01002)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -3.46684 + (((tickAnim - 13) / 5) * (1.00205-(-3.46684)));
            yy = -14.62329 + (((tickAnim - 13) / 5) * (4.89132-(-14.62329)));
            zz = 0.89381 + (((tickAnim - 13) / 5) * (-9.70875-(0.89381)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 1.00205 + (((tickAnim - 18) / 3) * (3.2365-(1.00205)));
            yy = 4.89132 + (((tickAnim - 18) / 3) * (14.64863-(4.89132)));
            zz = -9.70875 + (((tickAnim - 18) / 3) * (-0.01002-(-9.70875)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 3.2365 + (((tickAnim - 21) / 7) * (-3.46684-(3.2365)));
            yy = 14.64863 + (((tickAnim - 21) / 7) * (-14.62329-(14.64863)));
            zz = -0.01002 + (((tickAnim - 21) / 7) * (0.89381-(-0.01002)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -3.46684 + (((tickAnim - 28) / 2) * (-1.68-(-3.46684)));
            yy = -14.62329 + (((tickAnim - 28) / 2) * (-6.82-(-14.62329)));
            zz = 0.89381 + (((tickAnim - 28) / 2) * (-3.35-(0.89381)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25+90))), legR5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25+60))), legR5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25))));


        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25+120))), legL5.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25+90))), legL5.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25+30))));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraStrobilopterus e = (EntityPrehistoricFloraStrobilopterus) entity;
        animator.update(entity);

        animator.setAnimation(e.SWIM_ANIMATION);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNSWIM_ANIMATION);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
