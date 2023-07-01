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

        if ((!ee.isReallySwimming()) && (ee.getAnimation() != ee.UNSWIM_ANIMATION)) {
            //Walk pose:

                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        } else {

                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSlimonia entity = (EntityPrehistoricFloraSlimonia) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));

        this.body.offsetX = (float) Math.toRadians(xx);
        this.body.offsetY = (float) Math.toRadians(yy);
        this.body.offsetZ = (float) Math.toRadians(zz);

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -1.5D + (((tickAnim - 0D) / 10D) * (-2.50238D-(-1.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0.10912D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.50238D + (((tickAnim - 10D) / 10D) * (-3.5D-(-2.50238D)));
            yy = -1D + (((tickAnim - 10D) / 10D) * (0D-(-1D)));
            zz = 0.10912D + (((tickAnim - 10D) / 10D) * (0D-(0.10912D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -3.5D + (((tickAnim - 20D) / 10D) * (-2.50238D-(-3.5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (1D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (-0.10912D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2.50238D + (((tickAnim - 30D) / 10D) * (-1.5D-(-2.50238D)));
            yy = 1D + (((tickAnim - 30D) / 10D) * (0D-(1D)));
            zz = -0.10912D + (((tickAnim - 30D) / 10D) * (0D-(-0.10912D)));
        }
        this.setRotateAngle(tergite1, tergite1.rotateAngleX + (float) Math.toRadians(xx), tergite1.rotateAngleY + (float) Math.toRadians(yy), tergite1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.67D + (((tickAnim - 0D) / 2D) * (-1.5D-(-1.67D)));
            yy = 0.17D + (((tickAnim - 0D) / 2D) * (0D-(0.17D)));
            zz = -0.02D + (((tickAnim - 0D) / 2D) * (0D-(-0.02D)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
            xx = -1.5D + (((tickAnim - 2D) / 10D) * (-2.50238D-(-1.5D)));
            yy = 0D + (((tickAnim - 2D) / 10D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 10D) * (0.10912D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -2.50238D + (((tickAnim - 12D) / 10D) * (-3.5D-(-2.50238D)));
            yy = -1D + (((tickAnim - 12D) / 10D) * (0D-(-1D)));
            zz = 0.10912D + (((tickAnim - 12D) / 10D) * (0D-(0.10912D)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = -3.5D + (((tickAnim - 22D) / 10D) * (-2.50238D-(-3.5D)));
            yy = 0D + (((tickAnim - 22D) / 10D) * (1D-(0D)));
            zz = 0D + (((tickAnim - 22D) / 10D) * (-0.10912D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -2.50238D + (((tickAnim - 32D) / 8D) * (-1.67D-(-2.50238D)));
            yy = 1D + (((tickAnim - 32D) / 8D) * (0.17D-(1D)));
            zz = -0.10912D + (((tickAnim - 32D) / 8D) * (-0.02D-(-0.10912D)));
        }
        this.setRotateAngle(tergite2_3, tergite2_3.rotateAngleX + (float) Math.toRadians(xx), tergite2_3.rotateAngleY + (float) Math.toRadians(yy), tergite2_3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2D + (((tickAnim - 0D) / 5D) * (-1.5D-(-2D)));
            yy = 0.5D + (((tickAnim - 0D) / 5D) * (0D-(0.5D)));
            zz = -0.05D + (((tickAnim - 0D) / 5D) * (0D-(-0.05D)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -1.5D + (((tickAnim - 5D) / 10D) * (-2.50238D-(-1.5D)));
            yy = 0D + (((tickAnim - 5D) / 10D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 10D) * (0.10912D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -2.50238D + (((tickAnim - 15D) / 10D) * (-3.5D-(-2.50238D)));
            yy = -1D + (((tickAnim - 15D) / 10D) * (0D-(-1D)));
            zz = 0.10912D + (((tickAnim - 15D) / 10D) * (0D-(0.10912D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -3.5D + (((tickAnim - 25D) / 10D) * (-2.50238D-(-3.5D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (1D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (-0.10912D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -2.50238D + (((tickAnim - 35D) / 5D) * (-2D-(-2.50238D)));
            yy = 1D + (((tickAnim - 35D) / 5D) * (0.5D-(1D)));
            zz = -0.10912D + (((tickAnim - 35D) / 5D) * (-0.05D-(-0.10912D)));
        }
        this.setRotateAngle(tergite4_5, tergite4_5.rotateAngleX + (float) Math.toRadians(xx), tergite4_5.rotateAngleY + (float) Math.toRadians(yy), tergite4_5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -2.34D + (((tickAnim - 0D) / 8D) * (-1.5D-(-2.34D)));
            yy = 0.83D + (((tickAnim - 0D) / 8D) * (0D-(0.83D)));
            zz = -0.09D + (((tickAnim - 0D) / 8D) * (0D-(-0.09D)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -1.5D + (((tickAnim - 8D) / 10D) * (-2.50238D-(-1.5D)));
            yy = 0D + (((tickAnim - 8D) / 10D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 10D) * (0.10912D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -2.50238D + (((tickAnim - 18D) / 10D) * (-3.5D-(-2.50238D)));
            yy = -1D + (((tickAnim - 18D) / 10D) * (0D-(-1D)));
            zz = 0.10912D + (((tickAnim - 18D) / 10D) * (0D-(0.10912D)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -3.5D + (((tickAnim - 28D) / 10D) * (-2.50238D-(-3.5D)));
            yy = 0D + (((tickAnim - 28D) / 10D) * (1D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 10D) * (-0.10912D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -2.50238D + (((tickAnim - 38D) / 2D) * (-2.34D-(-2.50238D)));
            yy = 1D + (((tickAnim - 38D) / 2D) * (0.83D-(1D)));
            zz = -0.10912D + (((tickAnim - 38D) / 2D) * (-0.09D-(-0.10912D)));
        }
        this.setRotateAngle(tergite6, tergite6.rotateAngleX + (float) Math.toRadians(xx), tergite6.rotateAngleY + (float) Math.toRadians(yy), tergite6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1.66D + (((tickAnim - 0D) / 10D) * (3.5D-(1.66D)));
            yy = 0.92D + (((tickAnim - 0D) / 10D) * (0D-(0.92D)));
            zz = 0.06D + (((tickAnim - 0D) / 10D) * (0D-(0.06D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.5D + (((tickAnim - 10D) / 10D) * (2.50238D-(3.5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (-0.10912D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.50238D + (((tickAnim - 20D) / 10D) * (1.5D-(2.50238D)));
            yy = -1D + (((tickAnim - 20D) / 10D) * (0D-(-1D)));
            zz = -0.10912D + (((tickAnim - 20D) / 10D) * (0D-(-0.10912D)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 1.5D + (((tickAnim - 30D) / 9D) * (1.50143D-(1.5D)));
            yy = 0D + (((tickAnim - 30D) / 9D) * (1D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 9D) * (0.06548D-(0D)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 1.50143D + (((tickAnim - 39D) / 1D) * (1.5D-(1.50143D)));
            yy = 1D + (((tickAnim - 39D) / 1D) * (0.92D-(1D)));
            zz = 0.06548D + (((tickAnim - 39D) / 1D) * (0.06D-(0.06548D)));
        }
        this.setRotateAngle(tergite7, tergite7.rotateAngleX + (float) Math.toRadians(xx), tergite7.rotateAngleY + (float) Math.toRadians(yy), tergite7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 1.5D + (((tickAnim - 0D) / 1D) * (1.50143D-(1.5D)));
            yy = 0.91D + (((tickAnim - 0D) / 1D) * (1D-(0.91D)));
            zz = 0.06D + (((tickAnim - 0D) / 1D) * (0.06548D-(0.06D)));
        }
        else if (tickAnim >= 1 && tickAnim < 12) {
            xx = 1.50143D + (((tickAnim - 1D) / 11D) * (3.5D-(1.50143D)));
            yy = 1D + (((tickAnim - 1D) / 11D) * (0D-(1D)));
            zz = 0.06548D + (((tickAnim - 1D) / 11D) * (0D-(0.06548D)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 3.5D + (((tickAnim - 12D) / 10D) * (2.50238D-(3.5D)));
            yy = 0D + (((tickAnim - 12D) / 10D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 10D) * (-0.10912D-(0D)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 2.50238D + (((tickAnim - 22D) / 10D) * (1.5D-(2.50238D)));
            yy = -1D + (((tickAnim - 22D) / 10D) * (0D-(-1D)));
            zz = -0.10912D + (((tickAnim - 22D) / 10D) * (0D-(-0.10912D)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 1.5D + (((tickAnim - 32D) / 8D) * (1.5D-(1.5D)));
            yy = 0D + (((tickAnim - 32D) / 8D) * (0.91D-(0D)));
            zz = 0D + (((tickAnim - 32D) / 8D) * (0.06D-(0D)));
        }
        this.setRotateAngle(tergite8, tergite8.rotateAngleX + (float) Math.toRadians(xx), tergite8.rotateAngleY + (float) Math.toRadians(yy), tergite8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.5D + (((tickAnim - 0D) / 3D) * (1.50143D-(1.5D)));
            yy = 0.73D + (((tickAnim - 0D) / 3D) * (1D-(0.73D)));
            zz = 0.05D + (((tickAnim - 0D) / 3D) * (0.06548D-(0.05D)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 1.50143D + (((tickAnim - 3D) / 10D) * (3.5D-(1.50143D)));
            yy = 1D + (((tickAnim - 3D) / 10D) * (0D-(1D)));
            zz = 0.06548D + (((tickAnim - 3D) / 10D) * (0D-(0.06548D)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 3.5D + (((tickAnim - 13D) / 10D) * (2.50238D-(3.5D)));
            yy = 0D + (((tickAnim - 13D) / 10D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 10D) * (-0.10912D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 2.50238D + (((tickAnim - 23D) / 10D) * (1.5D-(2.50238D)));
            yy = -1D + (((tickAnim - 23D) / 10D) * (0D-(-1D)));
            zz = -0.10912D + (((tickAnim - 23D) / 10D) * (0D-(-0.10912D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 1.5D + (((tickAnim - 33D) / 7D) * (1.5D-(1.5D)));
            yy = 0D + (((tickAnim - 33D) / 7D) * (0.73D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 7D) * (0.05D-(0D)));
        }
        this.setRotateAngle(tergite9, tergite9.rotateAngleX + (float) Math.toRadians(xx), tergite9.rotateAngleY + (float) Math.toRadians(yy), tergite9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1.5D + (((tickAnim - 0D) / 4D) * (1.50143D-(1.5D)));
            yy = 0.55D + (((tickAnim - 0D) / 4D) * (1D-(0.55D)));
            zz = 0.04D + (((tickAnim - 0D) / 4D) * (0.06548D-(0.04D)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 1.50143D + (((tickAnim - 4D) / 11D) * (3.5D-(1.50143D)));
            yy = 1D + (((tickAnim - 4D) / 11D) * (0D-(1D)));
            zz = 0.06548D + (((tickAnim - 4D) / 11D) * (0D-(0.06548D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 3.5D + (((tickAnim - 15D) / 10D) * (2.50238D-(3.5D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (-0.10912D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 2.50238D + (((tickAnim - 25D) / 10D) * (1.5D-(2.50238D)));
            yy = -1D + (((tickAnim - 25D) / 10D) * (0D-(-1D)));
            zz = -0.10912D + (((tickAnim - 25D) / 10D) * (0D-(-0.10912D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1.5D + (((tickAnim - 35D) / 5D) * (1.5D-(1.5D)));
            yy = 0D + (((tickAnim - 35D) / 5D) * (0.55D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 5D) * (0.04D-(0D)));
        }
        this.setRotateAngle(tergite10, tergite10.rotateAngleX + (float) Math.toRadians(xx), tergite10.rotateAngleY + (float) Math.toRadians(yy), tergite10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 1.5D + (((tickAnim - 0D) / 6D) * (1.50143D-(1.5D)));
            yy = 0.36D + (((tickAnim - 0D) / 6D) * (1D-(0.36D)));
            zz = 0.02D + (((tickAnim - 0D) / 6D) * (0.06548D-(0.02D)));
        }
        else if (tickAnim >= 6 && tickAnim < 17) {
            xx = 1.50143D + (((tickAnim - 6D) / 11D) * (3.5D-(1.50143D)));
            yy = 1D + (((tickAnim - 6D) / 11D) * (0D-(1D)));
            zz = 0.06548D + (((tickAnim - 6D) / 11D) * (0D-(0.06548D)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 3.5D + (((tickAnim - 17D) / 10D) * (2.50238D-(3.5D)));
            yy = 0D + (((tickAnim - 17D) / 10D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 10D) * (-0.10912D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 2.50238D + (((tickAnim - 27D) / 10D) * (1.5D-(2.50238D)));
            yy = -1D + (((tickAnim - 27D) / 10D) * (0D-(-1D)));
            zz = -0.10912D + (((tickAnim - 27D) / 10D) * (0D-(-0.10912D)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 1.5D + (((tickAnim - 37D) / 3D) * (1.5D-(1.5D)));
            yy = 0D + (((tickAnim - 37D) / 3D) * (0.36D-(0D)));
            zz = 0D + (((tickAnim - 37D) / 3D) * (0.02D-(0D)));
        }
        this.setRotateAngle(tergite11, tergite11.rotateAngleX + (float) Math.toRadians(xx), tergite11.rotateAngleY + (float) Math.toRadians(yy), tergite11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1.5D + (((tickAnim - 0D) / 8D) * (1.50143D-(1.5D)));
            yy = 0.18D + (((tickAnim - 0D) / 8D) * (1D-(0.18D)));
            zz = 0.01D + (((tickAnim - 0D) / 8D) * (0.06548D-(0.01D)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 1.50143D + (((tickAnim - 8D) / 10D) * (3.5D-(1.50143D)));
            yy = 1D + (((tickAnim - 8D) / 10D) * (0D-(1D)));
            zz = 0.06548D + (((tickAnim - 8D) / 10D) * (0D-(0.06548D)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 3.5D + (((tickAnim - 18D) / 10D) * (2.50238D-(3.5D)));
            yy = 0D + (((tickAnim - 18D) / 10D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 10D) * (-0.10912D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 2.50238D + (((tickAnim - 28D) / 10D) * (1.5D-(2.50238D)));
            yy = -1D + (((tickAnim - 28D) / 10D) * (0D-(-1D)));
            zz = -0.10912D + (((tickAnim - 28D) / 10D) * (0D-(-0.10912D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 1.5D + (((tickAnim - 38D) / 2D) * (1.5D-(1.5D)));
            yy = 0D + (((tickAnim - 38D) / 2D) * (0.18D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 2D) * (0.01D-(0D)));
        }
        this.setRotateAngle(tergite12, tergite12.rotateAngleX + (float) Math.toRadians(xx), tergite12.rotateAngleY + (float) Math.toRadians(yy), tergite12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1.5D + (((tickAnim - 0D) / 8D) * (1.50143D-(1.5D)));
            yy = 0D + (((tickAnim - 0D) / 8D) * (1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 8D) * (0.06548D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 1.50143D + (((tickAnim - 8D) / 11D) * (3.5D-(1.50143D)));
            yy = 1D + (((tickAnim - 8D) / 11D) * (0D-(1D)));
            zz = 0.06548D + (((tickAnim - 8D) / 11D) * (0D-(0.06548D)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = 3.5D + (((tickAnim - 19D) / 10D) * (2.50238D-(3.5D)));
            yy = 0D + (((tickAnim - 19D) / 10D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 19D) / 10D) * (-0.10912D-(0D)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 2.50238D + (((tickAnim - 29D) / 10D) * (1.5D-(2.50238D)));
            yy = -1D + (((tickAnim - 29D) / 10D) * (0D-(-1D)));
            zz = -0.10912D + (((tickAnim - 29D) / 10D) * (0D-(-0.10912D)));
        }
        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(xx), telson.rotateAngleY + (float) Math.toRadians(yy), telson.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.27D + (((tickAnim - 0D) / 3D) * (-0.56944D-(1.27D)));
            yy = 7.37D + (((tickAnim - 0D) / 3D) * (0.17463D-(7.37D)));
            zz = 15.91D + (((tickAnim - 0D) / 3D) * (17.35542D-(15.91D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.56944D + (((tickAnim - 3D) / 5D) * (0.49858D-(-0.56944D)));
            yy = 0.17463D + (((tickAnim - 3D) / 5D) * (20.5696D-(0.17463D)));
            zz = 17.35542D + (((tickAnim - 3D) / 5D) * (6.1396D-(17.35542D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0.49858D + (((tickAnim - 8D) / 5D) * (6.79844D-(0.49858D)));
            yy = 20.5696D + (((tickAnim - 8D) / 5D) * (21.49213D-(20.5696D)));
            zz = 6.1396D + (((tickAnim - 8D) / 5D) * (20.3687D-(6.1396D)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 6.79844D + (((tickAnim - 13D) / 10D) * (-0.4788D-(6.79844D)));
            yy = 21.49213D + (((tickAnim - 13D) / 10D) * (0.18378D-(21.49213D)));
            zz = 20.3687D + (((tickAnim - 13D) / 10D) * (18.35947D-(20.3687D)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -0.4788D + (((tickAnim - 23D) / 5D) * (0.49858D-(-0.4788D)));
            yy = 0.18378D + (((tickAnim - 23D) / 5D) * (20.5696D-(0.18378D)));
            zz = 18.35947D + (((tickAnim - 23D) / 5D) * (6.1396D-(18.35947D)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0.49858D + (((tickAnim - 28D) / 5D) * (5.30086D-(0.49858D)));
            yy = 20.5696D + (((tickAnim - 28D) / 5D) * (21.8084D-(20.5696D)));
            zz = 6.1396D + (((tickAnim - 28D) / 5D) * (17.0307D-(6.1396D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 5.30086D + (((tickAnim - 33D) / 7D) * (1.27D-(5.30086D)));
            yy = 21.8084D + (((tickAnim - 33D) / 7D) * (7.37D-(21.8084D)));
            zz = 17.0307D + (((tickAnim - 33D) / 7D) * (15.91D-(17.0307D)));
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -5.17D + (((tickAnim - 0D) / 5D) * (-5.25888D-(-5.17D)));
            yy = 14.86D + (((tickAnim - 0D) / 5D) * (11.34946D-(14.86D)));
            zz = -12.46D + (((tickAnim - 0D) / 5D) * (-22.70038D-(-12.46D)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -5.25888D + (((tickAnim - 5D) / 10D) * (-17.06133D-(-5.25888D)));
            yy = 11.34946D + (((tickAnim - 5D) / 10D) * (33.92175D-(11.34946D)));
            zz = -22.70038D + (((tickAnim - 5D) / 10D) * (-29.41119D-(-22.70038D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -17.06133D + (((tickAnim - 15D) / 5D) * (-5.16627D-(-17.06133D)));
            yy = 33.92175D + (((tickAnim - 15D) / 5D) * (14.85972D-(33.92175D)));
            zz = -29.41119D + (((tickAnim - 15D) / 5D) * (-12.45622D-(-29.41119D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -5.16627D + (((tickAnim - 20D) / 5D) * (-4.96584D-(-5.16627D)));
            yy = 14.85972D + (((tickAnim - 20D) / 5D) * (11.43857D-(14.85972D)));
            zz = -12.45622D + (((tickAnim - 20D) / 5D) * (-21.66214D-(-12.45622D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -4.96584D + (((tickAnim - 25D) / 10D) * (-18.20645D-(-4.96584D)));
            yy = 11.43857D + (((tickAnim - 25D) / 10D) * (33.46731D-(11.43857D)));
            zz = -21.66214D + (((tickAnim - 25D) / 10D) * (-31.24278D-(-21.66214D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -18.20645D + (((tickAnim - 35D) / 5D) * (-5.17D-(-18.20645D)));
            yy = 33.46731D + (((tickAnim - 35D) / 5D) * (14.86D-(33.46731D)));
            zz = -31.24278D + (((tickAnim - 35D) / 5D) * (-12.46D-(-31.24278D)));
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -4.78361D + (((tickAnim - 0D) / 2D) * (-5.91537D-(-4.78361D)));
            yy = 12.42352D + (((tickAnim - 0D) / 2D) * (16.42765D-(12.42352D)));
            zz = -21.453D + (((tickAnim - 0D) / 2D) * (-21.8954D-(-21.453D)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -5.91537D + (((tickAnim - 2D) / 5D) * (-0.62308D-(-5.91537D)));
            yy = 16.42765D + (((tickAnim - 2D) / 5D) * (-4.55556D-(16.42765D)));
            zz = -21.8954D + (((tickAnim - 2D) / 5D) * (0.98561D-(-21.8954D)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -0.62308D + (((tickAnim - 7D) / 5D) * (1.90981D-(-0.62308D)));
            yy = -4.55556D + (((tickAnim - 7D) / 5D) * (-7.24266D-(-4.55556D)));
            zz = 0.98561D + (((tickAnim - 7D) / 5D) * (-19.36306D-(0.98561D)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 1.90981D + (((tickAnim - 12D) / 10D) * (-5.32476D-(1.90981D)));
            yy = -7.24266D + (((tickAnim - 12D) / 10D) * (16.62353D-(-7.24266D)));
            zz = -19.36306D + (((tickAnim - 12D) / 10D) * (-19.81925D-(-19.36306D)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -5.32476D + (((tickAnim - 22D) / 5D) * (-0.62308D-(-5.32476D)));
            yy = 16.62353D + (((tickAnim - 22D) / 5D) * (-4.55556D-(16.62353D)));
            zz = -19.81925D + (((tickAnim - 22D) / 5D) * (0.98561D-(-19.81925D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -0.62308D + (((tickAnim - 27D) / 5D) * (1.7825D-(-0.62308D)));
            yy = -4.55556D + (((tickAnim - 27D) / 5D) * (-7.27488D-(-4.55556D)));
            zz = 0.98561D + (((tickAnim - 27D) / 5D) * (-18.3555D-(0.98561D)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 1.7825D + (((tickAnim - 32D) / 8D) * (-4.78361D-(1.7825D)));
            yy = -7.27488D + (((tickAnim - 32D) / 8D) * (12.42352D-(-7.27488D)));
            zz = -18.3555D + (((tickAnim - 32D) / 8D) * (-21.453D-(-18.3555D)));
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.1D + (((tickAnim - 0D) / 3D) * (6.30204D-(2.1D)));
            yy = -20.98D + (((tickAnim - 0D) / 3D) * (-21.60625D-(-20.98D)));
            zz = -9.77D + (((tickAnim - 0D) / 3D) * (-19.25815D-(-9.77D)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 6.30204D + (((tickAnim - 3D) / 10D) * (-0.47879D-(6.30204D)));
            yy = -21.60625D + (((tickAnim - 3D) / 10D) * (-0.18382D-(-21.60625D)));
            zz = -19.25815D + (((tickAnim - 3D) / 10D) * (-18.35947D-(-19.25815D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -0.47879D + (((tickAnim - 13D) / 5D) * (0.49858D-(-0.47879D)));
            yy = -0.18382D + (((tickAnim - 13D) / 5D) * (-20.56963D-(-0.18382D)));
            zz = -18.35947D + (((tickAnim - 13D) / 5D) * (-6.13958D-(-18.35947D)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0.49858D + (((tickAnim - 18D) / 5D) * (5.30086D-(0.49858D)));
            yy = -20.56963D + (((tickAnim - 18D) / 5D) * (-21.80844D-(-20.56963D)));
            zz = -6.13958D + (((tickAnim - 18D) / 5D) * (-17.03073D-(-6.13958D)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 5.30086D + (((tickAnim - 23D) / 10D) * (-0.47879D-(5.30086D)));
            yy = -21.80844D + (((tickAnim - 23D) / 10D) * (-0.18382D-(-21.80844D)));
            zz = -17.03073D + (((tickAnim - 23D) / 10D) * (-18.35947D-(-17.03073D)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -0.47879D + (((tickAnim - 33D) / 5D) * (0.49858D-(-0.47879D)));
            yy = -0.18382D + (((tickAnim - 33D) / 5D) * (-20.56963D-(-0.18382D)));
            zz = -18.35947D + (((tickAnim - 33D) / 5D) * (-6.13958D-(-18.35947D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0.49858D + (((tickAnim - 38D) / 2D) * (2.1D-(0.49858D)));
            yy = -20.56963D + (((tickAnim - 38D) / 2D) * (-20.98D-(-20.56963D)));
            zz = -6.13958D + (((tickAnim - 38D) / 2D) * (-9.77D-(-6.13958D)));
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.86529D + (((tickAnim - 0D) / 2D) * (1.65463D-(0.86529D)));
            yy = 6.41373D + (((tickAnim - 0D) / 2D) * (7.30487D-(6.41373D)));
            zz = 11.23248D + (((tickAnim - 0D) / 2D) * (17.34783D-(11.23248D)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
            xx = 1.65463D + (((tickAnim - 2D) / 10D) * (-5.91537D-(1.65463D)));
            yy = 7.30487D + (((tickAnim - 2D) / 10D) * (-16.42761D-(7.30487D)));
            zz = 17.34783D + (((tickAnim - 2D) / 10D) * (21.89535D-(17.34783D)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -5.91537D + (((tickAnim - 12D) / 5D) * (-0.62308D-(-5.91537D)));
            yy = -16.42761D + (((tickAnim - 12D) / 5D) * (4.5556D-(-16.42761D)));
            zz = 21.89535D + (((tickAnim - 12D) / 5D) * (-0.9856D-(21.89535D)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -0.62308D + (((tickAnim - 17D) / 5D) * (1.90981D-(-0.62308D)));
            yy = 4.5556D + (((tickAnim - 17D) / 5D) * (7.24267D-(4.5556D)));
            zz = -0.9856D + (((tickAnim - 17D) / 5D) * (19.36308D-(-0.9856D)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 1.90981D + (((tickAnim - 22D) / 10D) * (-5.62106D-(1.90981D)));
            yy = 7.24267D + (((tickAnim - 22D) / 10D) * (-16.52812D-(7.24267D)));
            zz = 19.36308D + (((tickAnim - 22D) / 10D) * (20.8578D-(19.36308D)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -5.62106D + (((tickAnim - 32D) / 5D) * (-0.62308D-(-5.62106D)));
            yy = -16.52812D + (((tickAnim - 32D) / 5D) * (4.5556D-(-16.52812D)));
            zz = 20.8578D + (((tickAnim - 32D) / 5D) * (-0.9856D-(20.8578D)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -0.62308D + (((tickAnim - 37D) / 3D) * (0.86529D-(-0.62308D)));
            yy = 4.5556D + (((tickAnim - 37D) / 3D) * (6.41373D-(4.5556D)));
            zz = -0.9856D + (((tickAnim - 37D) / 3D) * (11.23248D-(-0.9856D)));
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -10.23D + (((tickAnim - 0D) / 5D) * (-17.06133D-(-10.23D)));
            yy = -22.96D + (((tickAnim - 0D) / 5D) * (-33.92179D-(-22.96D)));
            zz = 24.3D + (((tickAnim - 0D) / 5D) * (29.41121D-(24.3D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -17.06133D + (((tickAnim - 5D) / 5D) * (-5.16627D-(-17.06133D)));
            yy = -33.92179D + (((tickAnim - 5D) / 5D) * (-14.8597D-(-33.92179D)));
            zz = 29.41121D + (((tickAnim - 5D) / 5D) * (12.4562D-(29.41121D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -5.16627D + (((tickAnim - 10D) / 5D) * (-5.25888D-(-5.16627D)));
            yy = -14.8597D + (((tickAnim - 10D) / 5D) * (-11.34949D-(-14.8597D)));
            zz = 12.4562D + (((tickAnim - 10D) / 5D) * (22.70033D-(12.4562D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -5.25888D + (((tickAnim - 15D) / 10D) * (-17.82763D-(-5.25888D)));
            yy = -11.34949D + (((tickAnim - 15D) / 10D) * (-33.62199D-(-11.34949D)));
            zz = 22.70033D + (((tickAnim - 15D) / 10D) * (30.63486D-(22.70033D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -17.82763D + (((tickAnim - 25D) / 5D) * (-5.17D-(-17.82763D)));
            yy = -33.62199D + (((tickAnim - 25D) / 5D) * (-14.86D-(-33.62199D)));
            zz = 30.63486D + (((tickAnim - 25D) / 5D) * (12.46D-(30.63486D)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -5.17D + (((tickAnim - 30D) / 5D) * (-4.96584D-(-5.17D)));
            yy = -14.86D + (((tickAnim - 30D) / 5D) * (-11.4386D-(-14.86D)));
            zz = 12.46D + (((tickAnim - 30D) / 5D) * (21.6621D-(12.46D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -4.96584D + (((tickAnim - 35D) / 5D) * (-10.23D-(-4.96584D)));
            yy = -11.4386D + (((tickAnim - 35D) / 5D) * (-22.96D-(-11.4386D)));
            zz = 21.6621D + (((tickAnim - 35D) / 5D) * (24.3D-(21.6621D)));
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (-0.38466D-(0D)));
            yy = 3.5D + (((tickAnim - 0D) / 5D) * (4.7416D-(3.5D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (-2.5294D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.38466D + (((tickAnim - 5D) / 5D) * (0D-(-0.38466D)));
            yy = 4.7416D + (((tickAnim - 5D) / 5D) * (6D-(4.7416D)));
            zz = -2.5294D + (((tickAnim - 5D) / 5D) * (0D-(-2.5294D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 10D) / 4D) * (0.39397D-(0D)));
            yy = 6D + (((tickAnim - 10D) / 4D) * (4.9497D-(6D)));
            zz = 0D + (((tickAnim - 10D) / 4D) * (2.5308D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0.39397D + (((tickAnim - 14D) / 6D) * (0D-(0.39397D)));
            yy = 4.9497D + (((tickAnim - 14D) / 6D) * (3.5D-(4.9497D)));
            zz = 2.5308D + (((tickAnim - 14D) / 6D) * (0D-(2.5308D)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0D + (((tickAnim - 20D) / 4D) * (-0.37536D-(0D)));
            yy = 3.5D + (((tickAnim - 20D) / 4D) * (4.5335D-(3.5D)));
            zz = 0D + (((tickAnim - 20D) / 4D) * (-2.528D-(0D)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -0.37536D + (((tickAnim - 24D) / 6D) * (0D-(-0.37536D)));
            yy = 4.5335D + (((tickAnim - 24D) / 6D) * (6D-(4.5335D)));
            zz = -2.528D + (((tickAnim - 24D) / 6D) * (0D-(-2.528D)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0D + (((tickAnim - 30D) / 4D) * (0.39397D-(0D)));
            yy = 6D + (((tickAnim - 30D) / 4D) * (4.9497D-(6D)));
            zz = 0D + (((tickAnim - 30D) / 4D) * (2.5308D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0.39397D + (((tickAnim - 34D) / 6D) * (0D-(0.39397D)));
            yy = 4.9497D + (((tickAnim - 34D) / 6D) * (3.5D-(4.9497D)));
            zz = 2.5308D + (((tickAnim - 34D) / 6D) * (0D-(2.5308D)));
        }
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legL5_2, legL5_2.rotateAngleX + (float) Math.toRadians(0), legL5_2.rotateAngleY + (float) Math.toRadians(45), legL5_2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (-0.38466D-(0D)));
            yy = -4.5D + (((tickAnim - 0D) / 5D) * (-5.74161D-(-4.5D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (2.5294D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.38466D + (((tickAnim - 5D) / 5D) * (0D-(-0.38466D)));
            yy = -5.74161D + (((tickAnim - 5D) / 5D) * (-7D-(-5.74161D)));
            zz = 2.5294D + (((tickAnim - 5D) / 5D) * (0D-(2.5294D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 10D) / 4D) * (0.39397D-(0D)));
            yy = -7D + (((tickAnim - 10D) / 4D) * (-5.94974D-(-7D)));
            zz = 0D + (((tickAnim - 10D) / 4D) * (-2.53083D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0.39397D + (((tickAnim - 14D) / 6D) * (0D-(0.39397D)));
            yy = -5.94974D + (((tickAnim - 14D) / 6D) * (-4.5D-(-5.94974D)));
            zz = -2.53083D + (((tickAnim - 14D) / 6D) * (0D-(-2.53083D)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0D + (((tickAnim - 20D) / 4D) * (-0.37536D-(0D)));
            yy = -4.5D + (((tickAnim - 20D) / 4D) * (-5.53348D-(-4.5D)));
            zz = 0D + (((tickAnim - 20D) / 4D) * (2.528D-(0D)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -0.37536D + (((tickAnim - 24D) / 6D) * (0D-(-0.37536D)));
            yy = -5.53348D + (((tickAnim - 24D) / 6D) * (-7D-(-5.53348D)));
            zz = 2.528D + (((tickAnim - 24D) / 6D) * (0D-(2.528D)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0D + (((tickAnim - 30D) / 4D) * (0.39397D-(0D)));
            yy = -7D + (((tickAnim - 30D) / 4D) * (-5.94974D-(-7D)));
            zz = 0D + (((tickAnim - 30D) / 4D) * (-2.53083D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0.39397D + (((tickAnim - 34D) / 6D) * (0D-(0.39397D)));
            yy = -5.94974D + (((tickAnim - 34D) / 6D) * (-4.5D-(-5.94974D)));
            zz = -2.53083D + (((tickAnim - 34D) / 6D) * (0D-(-2.53083D)));
        }
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legR5_2, legR5_2.rotateAngleX + (float) Math.toRadians(0), legR5_2.rotateAngleY + (float) Math.toRadians(-45), legR5_2.rotateAngleZ + (float) Math.toRadians(0));





        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(xx), legL1.rotateAngleY + (float) Math.toRadians(yy), legL1.rotateAngleZ + (float) Math.toRadians(zz));






        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(xx), legR1.rotateAngleY + (float) Math.toRadians(yy), legR1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 20D) / 20D) * (0D-(0D)));
            yy = 2.5D + (((tickAnim - 20D) / 20D) * (0D-(2.5D)));
            zz = 0D + (((tickAnim - 20D) / 20D) * (0D-(0D)));
        }
        this.setRotateAngle(cheliceraL, cheliceraL.rotateAngleX + (float) Math.toRadians(xx), cheliceraL.rotateAngleY + (float) Math.toRadians(yy), cheliceraL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 20D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 20D) / 20D) * (0D-(0D)));
            yy = -2.5D + (((tickAnim - 20D) / 20D) * (0D-(-2.5D)));
            zz = 0D + (((tickAnim - 20D) / 20D) * (0D-(0D)));
        }
        this.setRotateAngle(cheliceraR, cheliceraR.rotateAngleX + (float) Math.toRadians(xx), cheliceraR.rotateAngleY + (float) Math.toRadians(yy), cheliceraR.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSlimonia entity = (EntityPrehistoricFloraSlimonia) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
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
