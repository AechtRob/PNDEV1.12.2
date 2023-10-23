package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLimusaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLimusaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer ThroatPouch;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer LowerArmR;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer LowerArmL;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer UpperLegR;
    private final AdvancedModelRenderer LowerLegR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer ToesR;
    private final AdvancedModelRenderer UpperLegL;
    private final AdvancedModelRenderer LowerLegL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer ToesL;


    private ModelAnimator animator;

    public ModelLimusaurus() {
        this.textureWidth = 65;
        this.textureHeight = 61;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 4.5F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -1.0F, 0.5F);
        this.Root.addChild(Hips);
        this.Hips.cubeList.add(new ModelBox(Hips, 22, 9, -3.0F, -3.0F, -4.0F, 6, 8, 8, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, 0.0873F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -3.5F, -3.0F, -7.0F, 7, 9, 8, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.0436F, 0.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 0, 33, -3.0F, -3.0F, -7.0F, 6, 8, 7, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -1.0F, -6.0F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.2182F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 42, 0, -2.0F, -2.0F, -6.0F, 4, 5, 6, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.2182F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 20, 42, -1.5F, -2.0F, -6.0F, 3, 4, 6, 0.0F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -0.5F, -5.25F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.3054F, 0.0F, 0.0F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 10, 48, -1.0F, -1.5F, -5.0F, 2, 3, 5, -0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.5F, -5.0F);
        this.Neck3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2531F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 25, -1.0F, 0.0F, -1.0F, 2, 1, 1, -0.002F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -5.25F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.6109F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 42, 11, -1.0F, -1.5F, -1.5F, 2, 2, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 36, -0.75F, -0.51F, -3.5F, 1, 1, 2, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 36, -0.25F, -0.51F, -3.5F, 1, 1, 2, 0.01F, true));
        this.Head.cubeList.add(new ModelBox(Head, 30, 7, -1.0F, -1.0F, -1.48F, 2, 1, 1, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.5F, -1.5F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 25, -0.5F, 0.0F, -3.75F, 1, 1, 1, -0.001F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 1, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.5F, 0.5F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 41, 28, -0.5F, 0.0F, -4.0F, 1, 1, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 19, 33, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Jaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.5236F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 17, -0.74F, -1.5F, 0.75F, 1, 1, 1, -0.001F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 17, -0.26F, -1.5F, 0.75F, 1, 1, 1, -0.001F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 41, -0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 0, -0.75F, -2.0F, 0.0F, 1, 2, 1, -0.001F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 42, -0.25F, -2.0F, 0.0F, 1, 2, 1, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Jaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 33, -0.5F, 0.0F, -1.0F, 1, 1, 1, -0.002F, false));

        this.ThroatPouch = new AdvancedModelRenderer(this);
        this.ThroatPouch.setRotationPoint(0.0F, 1.5F, -5.0F);
        this.Neck3.addChild(ThroatPouch);
        this.setRotateAngle(ThroatPouch, 1.6144F, 0.0F, 0.0F);
        this.ThroatPouch.cubeList.add(new ModelBox(ThroatPouch, 36, 32, -1.0F, 0.0F, -0.075F, 2, 2, 2, -0.003F, false));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-3.0F, 3.75F, -5.0F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, -0.7057F, -0.1334F, 0.1129F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 36, 28, -0.5F, -0.5F, -0.5F, 1, 1, 3, 0.0F, false));

        this.LowerArmR = new AdvancedModelRenderer(this);
        this.LowerArmR.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, -1.1006F, 0.1001F, -0.1942F);
        this.LowerArmR.cubeList.add(new ModelBox(LowerArmR, 33, 0, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(3.0F, 3.75F, -5.0F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -0.7057F, 0.1334F, -0.1129F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 36, 28, -0.5F, -0.5F, -0.5F, 1, 1, 3, 0.0F, true));

        this.LowerArmL = new AdvancedModelRenderer(this);
        this.LowerArmL.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, -1.1006F, -0.1001F, 0.1942F);
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 33, 0, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -1.5F, 3.0F);
        this.Hips.addChild(Tail);
        this.setRotateAngle(Tail, -0.0436F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 17, -2.5F, -1.5F, 0.0F, 5, 6, 10, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.1F, 9.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0873F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 19, 25, -1.5F, -1.5F, 0.0F, 3, 4, 11, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.5F, 10.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.1309F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 39, 14, -1.0F, -1.0F, 0.0F, 2, 3, 11, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.35F, 10.5F);
        this.Tail3.addChild(Tail4);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 28, -0.5F, -0.5F, -0.5F, 1, 2, 12, 0.0F, false));

        this.UpperLegR = new AdvancedModelRenderer(this);
        this.UpperLegR.setRotationPoint(-3.0F, 0.5F, -0.5F);
        this.Hips.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, -0.2182F, 0.0F, 0.0F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 38, 42, -1.5F, -1.5F, -2.5F, 3, 8, 4, 0.0F, false));
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 24, 52, -1.5F, -1.5F, 1.0F, 3, 8, 1, -0.001F, false));

        this.LowerLegR = new AdvancedModelRenderer(this);
        this.LowerLegR.setRotationPoint(-0.5F, 6.5F, -2.5F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, 0.7854F, 0.0F, 0.0F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 0, 48, -0.5F, 0.0F, 0.0F, 2, 10, 3, -0.001F, false));
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 49, 28, -0.5F, 0.0F, 2.5F, 2, 10, 1, -0.002F, false));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.0F, 10.0F, 3.0F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, -0.7418F, 0.0F, 0.0F);
        this.FootR.cubeList.add(new ModelBox(FootR, 0, 17, -0.5F, 0.0F, -2.5F, 2, 7, 2, -0.002F, false));
        this.FootR.cubeList.add(new ModelBox(FootR, 0, 0, -0.5F, 0.0F, -1.0F, 2, 7, 1, -0.003F, false));

        this.ToesR = new AdvancedModelRenderer(this);
        this.ToesR.setRotationPoint(0.0F, 6.75F, -1.0F);
        this.FootR.addChild(ToesR);
        this.setRotateAngle(ToesR, 0.1745F, 0.0F, 0.0F);
        this.ToesR.cubeList.add(new ModelBox(ToesR, 22, 0, -1.0F, -1.0F, -4.5F, 3, 2, 5, 0.0F, false));

        this.UpperLegL = new AdvancedModelRenderer(this);
        this.UpperLegL.setRotationPoint(3.0F, 0.5F, -0.5F);
        this.Hips.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, -0.2182F, 0.0F, 0.0F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 38, 42, -1.5F, -1.5F, -2.5F, 3, 8, 4, 0.0F, true));
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 24, 52, -1.5F, -1.5F, 1.0F, 3, 8, 1, -0.001F, true));

        this.LowerLegL = new AdvancedModelRenderer(this);
        this.LowerLegL.setRotationPoint(0.5F, 6.5F, -2.5F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.7854F, 0.0F, 0.0F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 0, 48, -1.5F, 0.0F, 0.0F, 2, 10, 3, -0.001F, true));
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 49, 28, -1.5F, 0.0F, 2.5F, 2, 10, 1, -0.002F, true));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 10.0F, 3.0F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, -0.7418F, 0.0F, 0.0F);
        this.FootL.cubeList.add(new ModelBox(FootL, 0, 17, -1.5F, 0.0F, -2.5F, 2, 7, 2, -0.002F, true));
        this.FootL.cubeList.add(new ModelBox(FootL, 0, 0, -1.5F, 0.0F, -1.0F, 2, 7, 1, -0.003F, true));

        this.ToesL = new AdvancedModelRenderer(this);
        this.ToesL.setRotationPoint(0.0F, 6.75F, -1.0F);
        this.FootL.addChild(ToesL);
        this.setRotateAngle(ToesL, 0.1745F, 0.0F, 0.0F);
        this.ToesL.cubeList.add(new ModelBox(ToesL, 22, 0, -2.0F, -1.0F, -4.5F, 3, 2, 5, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.Neck.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraLimusaurus entityLimusaurus = (EntityPrehistoricFloraLimusaurus) e;

//        this.faceTarget(f3, f4, 12, Neck1);
//        this.faceTarget(f3, f4, 12, Neck2);
//        this.faceTarget(f3, f4, 12, Neck3);
//        this.faceTarget(f3, f4, 12, Head);

        AdvancedModelRenderer[] Tail = {};
        AdvancedModelRenderer[] Neck = {};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityLimusaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityLimusaurus.getAnimation() == entityLimusaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityLimusaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityLimusaurus.getIsMoving()) {
                    if (entityLimusaurus.getAnimation() != entityLimusaurus.EAT_ANIMATION
                        && entityLimusaurus.getAnimation() != entityLimusaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityLimusaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraLimusaurus ee = (EntityPrehistoricFloraLimusaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            //animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLimusaurus entity = (EntityPrehistoricFloraLimusaurus) entitylivingbaseIn;

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLimusaurus entity = (EntityPrehistoricFloraLimusaurus) entitylivingbaseIn;

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLimusaurus entity = (EntityPrehistoricFloraLimusaurus) entitylivingbaseIn;

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLimusaurus entity = (EntityPrehistoricFloraLimusaurus) entitylivingbaseIn;

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLimusaurus entity = (EntityPrehistoricFloraLimusaurus) entitylivingbaseIn;

    }



    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLimusaurus entity = (EntityPrehistoricFloraLimusaurus) entitylivingbaseIn;

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraLimusaurus entity = (EntityPrehistoricFloraLimusaurus) entitylivingbaseIn;


}

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLimusaurus e = (EntityPrehistoricFloraLimusaurus) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
