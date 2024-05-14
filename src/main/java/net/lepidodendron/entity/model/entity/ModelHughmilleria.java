package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHughmilleria;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelHughmilleria extends AdvancedModelBase {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer LegR4;
    private final AdvancedModelRenderer LegL4;
    private final AdvancedModelRenderer LegR3;
    private final AdvancedModelRenderer LegL3;
    private final AdvancedModelRenderer LegR2;
    private final AdvancedModelRenderer LegL2;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer LegL1;
    private final AdvancedModelRenderer CheliceraR;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer CheliceraL;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legR5_2;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legL5_2;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer telson;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;

    private ModelAnimator animator;


    public ModelHughmilleria() {
        this.textureWidth = 34;
        this.textureHeight = 26;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 24.0F, -0.025F);
        this.Body.cubeList.add(new ModelBox(Body, 18, 5, -3.0F, -1.5F, -1.225F, 6, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 13, 18, -2.0F, -1.5F, -3.725F, 4, 1, 3, -0.003F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 23, -1.5F, -0.95F, -3.975F, 3, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.1F, -2.225F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 14, -2.5F, -1.0F, 0.0F, 5, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.0F, 0.5F, -1.225F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.1912F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 23, -3.0F, -2.0F, 0.0F, 3, 1, 2, -0.001F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.8883F, -1.5F, -4.0114F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.3316F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 9, -2.0F, 0.0F, 0.0F, 2, 1, 1, -0.002F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.0F, 0.5F, -1.225F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 1.1912F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 23, 0.0F, -2.0F, 0.0F, 3, 1, 2, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.8883F, -1.5F, -4.0114F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.3316F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 9, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.002F, false));

        this.LegR4 = new AdvancedModelRenderer(this);
        this.LegR4.setRotationPoint(-1.4023F, -0.225F, -2.5067F);
        this.Body.addChild(LegR4);
        this.setRotateAngle(LegR4, 0.0F, 0.3491F, 0.0F);
        this.LegR4.cubeList.add(new ModelBox(LegR4, 8, 5, -5.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.LegL4 = new AdvancedModelRenderer(this);
        this.LegL4.setRotationPoint(1.4023F, -0.225F, -2.5067F);
        this.Body.addChild(LegL4);
        this.setRotateAngle(LegL4, 0.0F, -0.3491F, 0.0F);
        this.LegL4.cubeList.add(new ModelBox(LegL4, 8, 5, 0.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.LegR3 = new AdvancedModelRenderer(this);
        this.LegR3.setRotationPoint(-1.2628F, -0.225F, -2.7666F);
        this.Body.addChild(LegR3);
        this.setRotateAngle(LegR3, 0.0F, -0.0873F, 0.0F);
        this.LegR3.cubeList.add(new ModelBox(LegR3, 0, 13, -4.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.LegL3 = new AdvancedModelRenderer(this);
        this.LegL3.setRotationPoint(1.2628F, -0.225F, -2.7666F);
        this.Body.addChild(LegL3);
        this.setRotateAngle(LegL3, 0.0F, 0.0873F, 0.0F);
        this.LegL3.cubeList.add(new ModelBox(LegL3, 0, 13, 0.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.LegR2 = new AdvancedModelRenderer(this);
        this.LegR2.setRotationPoint(-1.0083F, -0.225F, -3.3649F);
        this.Body.addChild(LegR2);
        this.setRotateAngle(LegR2, 0.0F, -0.3491F, 0.0F);
        this.LegR2.cubeList.add(new ModelBox(LegR2, 0, 8, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LegL2 = new AdvancedModelRenderer(this);
        this.LegL2.setRotationPoint(1.0083F, -0.225F, -3.3649F);
        this.Body.addChild(LegL2);
        this.setRotateAngle(LegL2, 0.0F, 0.3491F, 0.0F);
        this.LegL2.cubeList.add(new ModelBox(LegL2, 0, 8, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-0.8017F, -0.225F, -3.5437F);
        this.Body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.829F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 8, 6, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.LegL1 = new AdvancedModelRenderer(this);
        this.LegL1.setRotationPoint(0.8017F, -0.225F, -3.5437F);
        this.Body.addChild(LegL1);
        this.setRotateAngle(LegL1, 0.0F, 0.829F, 0.0F);
        this.LegL1.cubeList.add(new ModelBox(LegL1, 8, 6, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.CheliceraR = new AdvancedModelRenderer(this);
        this.CheliceraR.setRotationPoint(-0.5064F, -0.5388F, -4.3309F);
        this.Body.addChild(CheliceraR);
        this.setRotateAngle(CheliceraR, 2.8397F, 0.0099F, 0.05F);
        this.CheliceraR.cubeList.add(new ModelBox(CheliceraR, 2, 6, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.499F, -0.5F, -1.0F);
        this.CheliceraR.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 3, 4, 0.001F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(-0.501F, 0.0F, -1.0F);
        this.CheliceraR.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, -0.7854F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 3, 4, 0.001F, -0.5F, -1.0F, 0, 1, 1, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.bone2.addChild(bone3);


        this.CheliceraL = new AdvancedModelRenderer(this);
        this.CheliceraL.setRotationPoint(0.5064F, -0.5388F, -4.3309F);
        this.Body.addChild(CheliceraL);
        this.setRotateAngle(CheliceraL, 2.8397F, -0.0099F, -0.05F);
        this.CheliceraL.cubeList.add(new ModelBox(CheliceraL, 2, 6, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.5F, -1.0F);
        this.CheliceraL.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1745F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 3, 4, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.5F, 0.0F, -1.0F);
        this.CheliceraL.addChild(bone);
        this.setRotateAngle(bone, 0.0F, 0.7854F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 3, 4, 0.0F, -0.5F, -1.0F, 0, 1, 1, 0.0F, true));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-2.0568F, -0.5F, -0.8637F);
        this.Body.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.5236F, 0.0F);
        this.legR5.cubeList.add(new ModelBox(legR5, 22, 3, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.legR5_2 = new AdvancedModelRenderer(this);
        this.legR5_2.setRotationPoint(-2.7403F, -0.001F, -0.0035F);
        this.legR5.addChild(legR5_2);
        this.setRotateAngle(legR5_2, 0.0F, 0.4102F, 0.0F);
        this.legR5_2.cubeList.add(new ModelBox(legR5_2, 12, 22, -4.001F, -0.499F, -1.001F, 4, 1, 2, 0.001F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(2.0568F, -0.5F, -0.8637F);
        this.Body.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, -0.5236F, 0.0F);
        this.legL5.cubeList.add(new ModelBox(legL5, 22, 3, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.legL5_2 = new AdvancedModelRenderer(this);
        this.legL5_2.setRotationPoint(2.7403F, -0.001F, -0.0035F);
        this.legL5.addChild(legL5_2);
        this.setRotateAngle(legL5_2, 0.0F, -0.4102F, 0.0F);
        this.legL5_2.cubeList.add(new ModelBox(legL5_2, 12, 22, 0.001F, -0.499F, -1.001F, 4, 1, 2, 0.001F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.0F, 0.775F);
        this.Body.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -3.5F, -0.5F, 0.0F, 7, 1, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 18, 0, -3.0F, -0.5F, 0.0F, 6, 1, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 20, -2.5F, -0.5F, 0.0F, 5, 1, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 14, -2.0F, -0.5F, 0.0F, 4, 1, 4, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 18, 8, -1.5F, -0.5F, 0.0F, 3, 1, 4, 0.0F, false));

        this.telson = new AdvancedModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body5.addChild(telson);
        this.telson.cubeList.add(new ModelBox(telson, 0, 5, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.telson.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.0742F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 6, -0.0014F, -2.0F, -0.0371F, 1, 1, 7, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.telson.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0742F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 6, -0.9986F, -2.0F, -0.0371F, 1, 1, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body1, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(body4, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(body5, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(legR5, 0.7F, -0.3F, 0.5F);
        this.setRotateAngle(legR5_2, 0.5F, 0.0F, 0.5F);
        this.setRotateAngle(legL5, 0.7F, 0.3F, -0.5F);
        this.setRotateAngle(legL5_2, 0.5F, 0.0F, -0.5F);
        this.Body.offsetZ = -0.03F;
        this.Body.offsetY = -0.05F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Body.offsetY = 0.4F;
        this.Body.offsetX = 0.55F;
        this.Body.rotateAngleY = (float)Math.toRadians(200);
        this.Body.rotateAngleX = (float)Math.toRadians(8);
        this.Body.rotateAngleZ = (float)Math.toRadians(-8);
        this.Body.scaleChildren = true;
        float scaler = 0.5F;
        this.Body.setScale(scaler, scaler, scaler);
        //Start of pose:

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
       // this.body.offsetY = 0.4F;
        //this.body.offsetY = -0.2F;
        this.Body.offsetZ = -0.2F;


        AdvancedModelRenderer[] fishBody = {this.body1, this.body2, this.body3, this.body4, this.body5, this.telson};
        AdvancedModelRenderer[] fishTail = {this.body5, this.telson};



        //mouthparts:
        this.walk(CheliceraL, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
        this.walk(CheliceraR, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

        float speed = 0.2F;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.05F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        EntityPrehistoricFloraHughmilleria slimon = (EntityPrehistoricFloraHughmilleria) e;


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
        EntityPrehistoricFloraHughmilleria ee = (EntityPrehistoricFloraHughmilleria) entitylivingbaseIn;
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
        EntityPrehistoricFloraHughmilleria entity = (EntityPrehistoricFloraHughmilleria) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+50))*4), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+100))/2);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0);


        this.setRotateAngle(LegL3, LegL3.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+120))*4), LegL3.rotateAngleY + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*4), LegL3.rotateAngleZ + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*4));


        this.setRotateAngle(LegL2, LegL2.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*4), LegL2.rotateAngleY + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*4), LegL2.rotateAngleZ + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*4));


        this.setRotateAngle(LegL1, LegL1.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*4), LegL1.rotateAngleY + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*4), LegL1.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*4));


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-30))*5), body1.rotateAngleY + (float) Math.toRadians(0), body1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*6), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-90))*5), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-120))*6), body4.rotateAngleY + (float) Math.toRadians(0), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-150))*7), body5.rotateAngleY + (float) Math.toRadians(0), body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-180))*8), telson.rotateAngleY + (float) Math.toRadians(0), telson.rotateAngleZ + (float) Math.toRadians(0));

        this.setRotateAngle(LegL4, LegL4.rotateAngleX + (float) Math.toRadians(xx), LegL4.rotateAngleY + (float) Math.toRadians(yy), LegL4.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(LegR4, LegR4.rotateAngleX + (float) Math.toRadians(xx), LegR4.rotateAngleY + (float) Math.toRadians(yy), LegR4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(LegR3, LegR3.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+120))*4), LegR3.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*4), LegR3.rotateAngleZ + (float) Math.toRadians(-30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*4));


        this.setRotateAngle(LegR2, LegR2.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*4), LegR2.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*4), LegR2.rotateAngleZ + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*4));


        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*4), legR1.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*4), legR1.rotateAngleZ + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*4));

        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(legR5_2, legR5_2.rotateAngleX + (float) Math.toRadians(xx), legR5_2.rotateAngleY + (float) Math.toRadians(yy), legR5_2.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(legL5_2, legL5_2.rotateAngleX + (float) Math.toRadians(xx), legL5_2.rotateAngleY + (float) Math.toRadians(yy), legL5_2.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(CheliceraR, CheliceraR.rotateAngleX + (float) Math.toRadians(xx), CheliceraR.rotateAngleY + (float) Math.toRadians(yy), CheliceraR.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(CheliceraL, CheliceraL.rotateAngleX + (float) Math.toRadians(xx), CheliceraL.rotateAngleY + (float) Math.toRadians(yy), CheliceraL.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraHughmilleria entity = (EntityPrehistoricFloraHughmilleria) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5))*2), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90))), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+60))*2));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+30))*0.1);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.72571 + (((tickAnim - 0) / 5) * (-8.4-(-2.72571)));
            yy = 10.86393 + (((tickAnim - 0) / 5) * (0-(10.86393)));
            zz = 1.7889 + (((tickAnim - 0) / 5) * (-13.2-(1.7889)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -8.4 + (((tickAnim - 5) / 10) * (-15.49492-(-8.4)));
            yy = 0 + (((tickAnim - 5) / 10) * (21.62299-(0)));
            zz = -13.2 + (((tickAnim - 5) / 10) * (-18.49317-(-13.2)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -15.49492 + (((tickAnim - 15) / 5) * (-2.72571-(-15.49492)));
            yy = 21.62299 + (((tickAnim - 15) / 5) * (10.86393-(21.62299)));
            zz = -18.49317 + (((tickAnim - 15) / 5) * (1.7889-(-18.49317)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -2.72571 + (((tickAnim - 20) / 5) * (-8.4-(-2.72571)));
            yy = 10.86393 + (((tickAnim - 20) / 5) * (0-(10.86393)));
            zz = 1.7889 + (((tickAnim - 20) / 5) * (-13.2-(1.7889)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -8.4 + (((tickAnim - 25) / 10) * (-15.49492-(-8.4)));
            yy = 0 + (((tickAnim - 25) / 10) * (21.62299-(0)));
            zz = -13.2 + (((tickAnim - 25) / 10) * (-18.49317-(-13.2)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -15.49492 + (((tickAnim - 35) / 5) * (-2.73-(-15.49492)));
            yy = 21.62299 + (((tickAnim - 35) / 5) * (10.86-(21.62299)));
            zz = -18.49317 + (((tickAnim - 35) / 5) * (1.79-(-18.49317)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR4, LegR4.rotateAngleX + (float) Math.toRadians(xx), LegR4.rotateAngleY + (float) Math.toRadians(yy), LegR4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -10.76 + (((tickAnim - 0) / 7) * (-15.49492-(-10.76)));
            yy = -7.21 + (((tickAnim - 0) / 7) * (-21.62299-(-7.21)));
            zz = 14.96 + (((tickAnim - 0) / 7) * (18.49317-(14.96)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -15.49492 + (((tickAnim - 7) / 5) * (-2.72571-(-15.49492)));
            yy = -21.62299 + (((tickAnim - 7) / 5) * (-10.86393-(-21.62299)));
            zz = 18.49317 + (((tickAnim - 7) / 5) * (-1.7889-(18.49317)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -2.72571 + (((tickAnim - 12) / 5) * (-8.4-(-2.72571)));
            yy = -10.86393 + (((tickAnim - 12) / 5) * (0-(-10.86393)));
            zz = -1.7889 + (((tickAnim - 12) / 5) * (13.2-(-1.7889)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -8.4 + (((tickAnim - 17) / 3) * (-10.76-(-8.4)));
            yy = 0 + (((tickAnim - 17) / 3) * (-7.21-(0)));
            zz = 13.2 + (((tickAnim - 17) / 3) * (14.96-(13.2)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -10.76 + (((tickAnim - 20) / 7) * (-15.49492-(-10.76)));
            yy = -7.21 + (((tickAnim - 20) / 7) * (-21.62299-(-7.21)));
            zz = 14.96 + (((tickAnim - 20) / 7) * (18.49317-(14.96)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -15.49492 + (((tickAnim - 27) / 5) * (-2.72571-(-15.49492)));
            yy = -21.62299 + (((tickAnim - 27) / 5) * (-10.86393-(-21.62299)));
            zz = 18.49317 + (((tickAnim - 27) / 5) * (-1.7889-(18.49317)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -2.72571 + (((tickAnim - 32) / 5) * (-8.4-(-2.72571)));
            yy = -10.86393 + (((tickAnim - 32) / 5) * (0-(-10.86393)));
            zz = -1.7889 + (((tickAnim - 32) / 5) * (13.2-(-1.7889)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -8.4 + (((tickAnim - 37) / 3) * (-10.76-(-8.4)));
            yy = 0 + (((tickAnim - 37) / 3) * (-7.21-(0)));
            zz = 13.2 + (((tickAnim - 37) / 3) * (14.96-(13.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL4, LegL4.rotateAngleX + (float) Math.toRadians(xx), LegL4.rotateAngleY + (float) Math.toRadians(yy), LegL4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -5.07 + (((tickAnim - 0) / 2) * (-5.94086-(-5.07)));
            yy = 8.48 + (((tickAnim - 0) / 2) * (12.11913-(8.48)));
            zz = -13.92 + (((tickAnim - 0) / 2) * (-14.13013-(-13.92)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -5.94086 + (((tickAnim - 2) / 5) * (-4.25072-(-5.94086)));
            yy = 12.11913 + (((tickAnim - 2) / 5) * (0.32-(12.11913)));
            zz = -14.13013 + (((tickAnim - 2) / 5) * (1.62323-(-14.13013)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -4.25072 + (((tickAnim - 7) / 5) * (-0.71707-(-4.25072)));
            yy = 0.32 + (((tickAnim - 7) / 5) * (-9.71939-(0.32)));
            zz = 1.62323 + (((tickAnim - 7) / 5) * (-12.89304-(1.62323)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -0.71707 + (((tickAnim - 12) / 8) * (-5.07-(-0.71707)));
            yy = -9.71939 + (((tickAnim - 12) / 8) * (8.48-(-9.71939)));
            zz = -12.89304 + (((tickAnim - 12) / 8) * (-13.92-(-12.89304)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -5.07 + (((tickAnim - 20) / 2) * (-5.94086-(-5.07)));
            yy = 8.48 + (((tickAnim - 20) / 2) * (12.11913-(8.48)));
            zz = -13.92 + (((tickAnim - 20) / 2) * (-14.13013-(-13.92)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -5.94086 + (((tickAnim - 22) / 5) * (-4.25072-(-5.94086)));
            yy = 12.11913 + (((tickAnim - 22) / 5) * (0.32-(12.11913)));
            zz = -14.13013 + (((tickAnim - 22) / 5) * (1.62323-(-14.13013)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -4.25072 + (((tickAnim - 27) / 5) * (-0.71707-(-4.25072)));
            yy = 0.32 + (((tickAnim - 27) / 5) * (-9.71939-(0.32)));
            zz = 1.62323 + (((tickAnim - 27) / 5) * (-12.89304-(1.62323)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -0.71707 + (((tickAnim - 32) / 8) * (-5.07-(-0.71707)));
            yy = -9.71939 + (((tickAnim - 32) / 8) * (8.48-(-9.71939)));
            zz = -12.89304 + (((tickAnim - 32) / 8) * (-13.92-(-12.89304)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR3, LegR3.rotateAngleX + (float) Math.toRadians(xx), LegR3.rotateAngleY + (float) Math.toRadians(yy), LegR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -3.07 + (((tickAnim - 0) / 3) * (-0.71707-(-3.07)));
            yy = 3.03 + (((tickAnim - 0) / 3) * (9.71939-(3.03)));
            zz = 3.22 + (((tickAnim - 0) / 3) * (12.89304-(3.22)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -0.71707 + (((tickAnim - 3) / 10) * (-5.94086-(-0.71707)));
            yy = 9.71939 + (((tickAnim - 3) / 10) * (-12.11913-(9.71939)));
            zz = 12.89304 + (((tickAnim - 3) / 10) * (14.13013-(12.89304)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -5.94086 + (((tickAnim - 13) / 5) * (-4.25072-(-5.94086)));
            yy = -12.11913 + (((tickAnim - 13) / 5) * (-0.32-(-12.11913)));
            zz = 14.13013 + (((tickAnim - 13) / 5) * (-1.62323-(14.13013)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -4.25072 + (((tickAnim - 18) / 2) * (-3.07-(-4.25072)));
            yy = -0.32 + (((tickAnim - 18) / 2) * (3.03-(-0.32)));
            zz = -1.62323 + (((tickAnim - 18) / 2) * (3.22-(-1.62323)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -3.07 + (((tickAnim - 20) / 3) * (-0.71707-(-3.07)));
            yy = 3.03 + (((tickAnim - 20) / 3) * (9.71939-(3.03)));
            zz = 3.22 + (((tickAnim - 20) / 3) * (12.89304-(3.22)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -0.71707 + (((tickAnim - 23) / 10) * (-5.94086-(-0.71707)));
            yy = 9.71939 + (((tickAnim - 23) / 10) * (-12.11913-(9.71939)));
            zz = 12.89304 + (((tickAnim - 23) / 10) * (14.13013-(12.89304)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -5.94086 + (((tickAnim - 33) / 5) * (-4.25072-(-5.94086)));
            yy = -12.11913 + (((tickAnim - 33) / 5) * (-0.32-(-12.11913)));
            zz = 14.13013 + (((tickAnim - 33) / 5) * (-1.62323-(14.13013)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -4.25072 + (((tickAnim - 38) / 2) * (-3.07-(-4.25072)));
            yy = -0.32 + (((tickAnim - 38) / 2) * (3.03-(-0.32)));
            zz = -1.62323 + (((tickAnim - 38) / 2) * (3.22-(-1.62323)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL3, LegL3.rotateAngleX + (float) Math.toRadians(xx), LegL3.rotateAngleY + (float) Math.toRadians(yy), LegL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.35 + (((tickAnim - 0) / 3) * (10.11172-(-0.35)));
            yy = -14.64 + (((tickAnim - 0) / 3) * (-21.36058-(-14.64)));
            zz = -4.38 + (((tickAnim - 0) / 3) * (-19.52716-(-4.38)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 10.11172 + (((tickAnim - 3) / 10) * (2-(10.11172)));
            yy = -21.36058 + (((tickAnim - 3) / 10) * (0-(-21.36058)));
            zz = -19.52716 + (((tickAnim - 3) / 10) * (-16.9-(-19.52716)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 2 + (((tickAnim - 13) / 6) * (-2.96314-(2)));
            yy = 0 + (((tickAnim - 13) / 6) * (-12.95819-(0)));
            zz = -16.9 + (((tickAnim - 13) / 6) * (-0.5941-(-16.9)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -2.96314 + (((tickAnim - 19) / 1) * (-0.35-(-2.96314)));
            yy = -12.95819 + (((tickAnim - 19) / 1) * (-14.64-(-12.95819)));
            zz = -0.5941 + (((tickAnim - 19) / 1) * (-4.38-(-0.5941)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -0.35 + (((tickAnim - 20) / 3) * (10.11172-(-0.35)));
            yy = -14.64 + (((tickAnim - 20) / 3) * (-21.36058-(-14.64)));
            zz = -4.38 + (((tickAnim - 20) / 3) * (-19.52716-(-4.38)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 10.11172 + (((tickAnim - 23) / 10) * (2-(10.11172)));
            yy = -21.36058 + (((tickAnim - 23) / 10) * (0-(-21.36058)));
            zz = -19.52716 + (((tickAnim - 23) / 10) * (-16.9-(-19.52716)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 2 + (((tickAnim - 33) / 6) * (-2.96314-(2)));
            yy = 0 + (((tickAnim - 33) / 6) * (-12.95819-(0)));
            zz = -16.9 + (((tickAnim - 33) / 6) * (-0.5941-(-16.9)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = -2.96314 + (((tickAnim - 39) / 1) * (-0.35-(-2.96314)));
            yy = -12.95819 + (((tickAnim - 39) / 1) * (-14.64-(-12.95819)));
            zz = -0.5941 + (((tickAnim - 39) / 1) * (-4.38-(-0.5941)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR2, LegR2.rotateAngleX + (float) Math.toRadians(xx), LegR2.rotateAngleY + (float) Math.toRadians(yy), LegR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 6.06 + (((tickAnim - 0) / 5) * (2-(6.06)));
            yy = 10.68 + (((tickAnim - 0) / 5) * (0-(10.68)));
            zz = 18.21 + (((tickAnim - 0) / 5) * (16.9-(18.21)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 2 + (((tickAnim - 5) / 6) * (-2.96314-(2)));
            yy = 0 + (((tickAnim - 5) / 6) * (12.95819-(0)));
            zz = 16.9 + (((tickAnim - 5) / 6) * (0.5941-(16.9)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -2.96314 + (((tickAnim - 11) / 4) * (10.11172-(-2.96314)));
            yy = 12.95819 + (((tickAnim - 11) / 4) * (21.36058-(12.95819)));
            zz = 0.5941 + (((tickAnim - 11) / 4) * (19.52716-(0.5941)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 10.11172 + (((tickAnim - 15) / 5) * (6.06-(10.11172)));
            yy = 21.36058 + (((tickAnim - 15) / 5) * (10.68-(21.36058)));
            zz = 19.52716 + (((tickAnim - 15) / 5) * (18.21-(19.52716)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 6.06 + (((tickAnim - 20) / 5) * (2-(6.06)));
            yy = 10.68 + (((tickAnim - 20) / 5) * (0-(10.68)));
            zz = 18.21 + (((tickAnim - 20) / 5) * (16.9-(18.21)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 2 + (((tickAnim - 25) / 6) * (-2.96314-(2)));
            yy = 0 + (((tickAnim - 25) / 6) * (12.95819-(0)));
            zz = 16.9 + (((tickAnim - 25) / 6) * (0.5941-(16.9)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -2.96314 + (((tickAnim - 31) / 4) * (10.11172-(-2.96314)));
            yy = 12.95819 + (((tickAnim - 31) / 4) * (21.36058-(12.95819)));
            zz = 0.5941 + (((tickAnim - 31) / 4) * (19.52716-(0.5941)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 10.11172 + (((tickAnim - 35) / 5) * (6.06-(10.11172)));
            yy = 21.36058 + (((tickAnim - 35) / 5) * (10.68-(21.36058)));
            zz = 19.52716 + (((tickAnim - 35) / 5) * (18.21-(19.52716)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL2, LegL2.rotateAngleX + (float) Math.toRadians(xx), LegL2.rotateAngleY + (float) Math.toRadians(yy), LegL2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-30))*0.4), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+60))*0.4), body1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-60))*0.5), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+30))*0.5), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-90))*0.6), body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5))*0.6), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-120))*0.7), body4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-30))*0.7), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-150))*0.8), body5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-60))*0.8), body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-180))*0.9), telson.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-90))*0.9), telson.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+50))*5), legR1.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+145))*3), legR1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+50))*6));


        this.setRotateAngle(LegL1, LegL1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+50))*5), LegL1.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+145))*3), LegL1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+50))*6));


        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))), legR5.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))), legR5.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))));


        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))), legL5.rotateAngleY + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))), legL5.rotateAngleZ + (float) Math.toRadians(5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))));

    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraHughmilleria entity = (EntityPrehistoricFloraHughmilleria) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = 0;
        tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+50))*4), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+100))/2);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0);


        this.setRotateAngle(LegL3, LegL3.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*4), LegL3.rotateAngleY + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*4), LegL3.rotateAngleZ + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*4));


        this.setRotateAngle(LegL2, LegL2.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*4), LegL2.rotateAngleY + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*4), LegL2.rotateAngleZ + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*4));


        this.setRotateAngle(LegL1, LegL1.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*4), LegL1.rotateAngleY + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*4), LegL1.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*4));


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-30))*5), body1.rotateAngleY + (float) Math.toRadians(0), body1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*6), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-90))*5), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-120))*6), body4.rotateAngleY + (float) Math.toRadians(0), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-150))*7), body5.rotateAngleY + (float) Math.toRadians(0), body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-180))*8), telson.rotateAngleY + (float) Math.toRadians(0), telson.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(LegL4, LegL4.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*4), LegL4.rotateAngleY + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*4), LegL4.rotateAngleZ + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*4));


        this.setRotateAngle(LegR4, LegR4.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*4), LegR4.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*4), LegR4.rotateAngleZ + (float) Math.toRadians(-40-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*4));


        this.setRotateAngle(LegR3, LegR3.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*4), LegR3.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*4), LegR3.rotateAngleZ + (float) Math.toRadians(-30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*4));


        this.setRotateAngle(LegR2, LegR2.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*4), LegR2.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*4), LegR2.rotateAngleZ + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*4));


        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*4), legR1.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*4), legR1.rotateAngleZ + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*4));


        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+230))*25), legR5.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*25), legR5.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*35));


        this.setRotateAngle(legR5_2, legR5_2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+240))*25), legR5_2.rotateAngleY + (float) Math.toRadians(-25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*50), legR5_2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+280))*25));


        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+230))*25), legL5.rotateAngleY + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*25), legL5.rotateAngleZ + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*35));


        this.setRotateAngle(legL5_2, legL5_2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+240))*25), legL5_2.rotateAngleY + (float) Math.toRadians(25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*50), legL5_2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+280))*25));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHughmilleria e = (EntityPrehistoricFloraHughmilleria) entity;
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
