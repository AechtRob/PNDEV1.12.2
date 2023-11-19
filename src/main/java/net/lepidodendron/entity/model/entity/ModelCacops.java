package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCacops;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCacops extends AdvancedModelBaseExtended {

    private final AdvancedModelRenderer Hip;
    private final AdvancedModelRenderer UpperLegR;
    private final AdvancedModelRenderer LowerLegR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer UpperLegL;
    private final AdvancedModelRenderer LowerLegL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer LowerArmR;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer LowerArmL;
    private final AdvancedModelRenderer HandL;

    private ModelAnimator animator;

    public ModelCacops() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Hip = new AdvancedModelRenderer(this);
        this.Hip.setRotationPoint(0.0F, 17.0F, 9.75F);
        this.setRotateAngle(Hip, -0.2182F, 0.0F, 0.0F);
        this.Hip.cubeList.add(new ModelBox(Hip, 22, 7, -2.5F, 0.125F, -1.0F, 5, 4, 4, 0.0F, false));

        this.UpperLegR = new AdvancedModelRenderer(this);
        this.UpperLegR.setRotationPoint(-2.25F, 2.75F, 2.0F);
        this.Hip.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, -0.0873F, 0.3491F, -0.1745F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 36, 7, -2.5F, -0.5F, -1.0F, 3, 2, 2, 0.2F, false));

        this.LowerLegR = new AdvancedModelRenderer(this);
        this.LowerLegR.setRotationPoint(-2.25F, 0.65F, -0.5F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, 0.2182F, 0.7418F, -1.0472F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 39, 18, -3.0F, -0.51F, -0.49F, 3, 1, 2, 0.1F, false));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(-2.5F, -0.5F, 0.45F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, 0.8727F, -0.5236F, -0.2182F);
        this.FootR.cubeList.add(new ModelBox(FootR, 11, 37, -1.0F, -2.26F, -1.64F, 1, 3, 3, 0.1F, false));

        this.UpperLegL = new AdvancedModelRenderer(this);
        this.UpperLegL.setRotationPoint(2.25F, 2.75F, 2.0F);
        this.Hip.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, -0.0873F, -0.3491F, 0.1745F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 36, 7, -0.5F, -0.5F, -1.0F, 3, 2, 2, 0.2F, true));

        this.LowerLegL = new AdvancedModelRenderer(this);
        this.LowerLegL.setRotationPoint(2.25F, 0.65F, -0.5F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.2182F, -0.7418F, 1.0472F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 39, 18, 0.0F, -0.51F, -0.49F, 3, 1, 2, 0.1F, true));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(2.5F, -0.5F, 0.45F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.8727F, 0.5236F, 0.2182F);
        this.FootL.cubeList.add(new ModelBox(FootL, 11, 37, 0.0F, -2.26F, -1.64F, 1, 3, 3, 0.1F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.75F, 3.0F);
        this.Hip.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1745F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 30, 27, -1.5F, -0.325F, -1.0F, 3, 3, 4, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.5F, 3.0F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0873F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 35, 21, -1.0F, -0.3245F, -1.0218F, 2, 2, 4, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Hip.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 19, 17, -3.5F, -0.975F, -3.0F, 7, 5, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.8F, -2.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 34, -1.0F, 0.05F, -0.25F, 2, 1, 2, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 1.0F, -1.75F);
        this.body.addChild(body1);
        this.setRotateAngle(body1, 0.0873F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 11, 31, -1.0F, -3.0F, -5.5F, 2, 1, 5, 0.01F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -4.0F, -2.325F, -5.25F, 8, 6, 5, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, -5.25F);
        this.body1.addChild(Chest);
        this.setRotateAngle(Chest, 0.0873F, 0.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 0, 11, -3.5F, -2.05F, -3.0F, 7, 5, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.Chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 40, -1.0F, -0.1F, -2.0F, 2, 1, 2, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -2.75F);
        this.Chest.addChild(Head);


        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 42, 35, -0.99F, 0.01F, -8.0F, 2, 1, 6, 0.015F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 34, 34, -2.5F, -1.49F, -2.5F, 5, 2, 3, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 1.0F, -8.0F);
        this.lowerjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.5236F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 0, -2.0F, -0.99F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 1.0F, -8.0F);
        this.lowerjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.192F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 0, -0.975F, -0.99F, 2.825F, 2, 1, 6, 0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 1.0F, -8.0F);
        this.lowerjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.5236F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 0, 0.0F, -0.99F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 1.0F, -8.0F);
        this.lowerjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.192F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 0, -1.025F, -0.99F, 2.825F, 2, 1, 6, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.0F, -8.0F);
        this.lowerjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1134F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 20, -2.5F, -1.5F, 4.0F, 5, 2, 5, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 27, -1.0F, -1.0F, 0.25F, 2, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.0F, -8.0F);
        this.lowerjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3578F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 3, -2.0F, -1.5F, 2.075F, 4, 1, 2, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 20, 32, -1.0F, -1.01F, -8.0F, 2, 1, 5, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 22, 15, -1.5F, -1.01F, -3.0F, 3, 1, 1, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 16, 25, -2.5F, -2.1F, -3.25F, 5, 2, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.5236F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 38, -2.0F, -0.99F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.192F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 27, -0.975F, -0.99F, 2.825F, 2, 1, 6, 0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 27, 0.75F, -1.5F, 3.0F, 1, 1, 2, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 1.25F, -2.5F, 3.5F, 0, 1, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -1.25F, -2.5F, 3.5F, 0, 1, 1, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 27, -1.75F, -1.5F, 3.0F, 1, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.192F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 27, -1.025F, -0.99F, 2.825F, 2, 1, 6, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.5236F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 19, 38, 0.0F, -0.99F, 0.0F, 2, 1, 3, -0.005F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.325F, 0.5F, -7.0F);
        this.upperjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.2618F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 44, 0.0F, -1.01F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.325F, 0.5F, -7.0F);
        this.upperjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.2618F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 44, 0.0F, -1.01F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3491F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 39, -1.0F, -0.25F, 2.25F, 2, 1, 3, 0.0F, false));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-3.5F, 2.25F, -1.65F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, 0.0F, 0.4363F, -0.6109F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 33, 39, -2.6F, -0.1F, -1.0F, 3, 1, 2, 0.2F, false));

        this.LowerArmR = new AdvancedModelRenderer(this);
        this.LowerArmR.setRotationPoint(-2.75F, 0.4F, 0.0F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, 0.2618F, -1.3963F, -1.2217F);
        this.LowerArmR.cubeList.add(new ModelBox(LowerArmR, 0, 27, -2.0F, -0.51F, -0.49F, 2, 2, 1, 0.1F, false));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(-1.75F, 0.5F, -0.3F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, 0.0436F, 1.0996F, -0.0873F);
        this.HandR.cubeList.add(new ModelBox(HandR, 37, 12, -1.0F, -1.51F, -2.39F, 1, 3, 3, 0.0F, false));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(3.5F, 2.25F, -1.65F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, 0.0F, -0.4363F, 0.6109F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 33, 39, -0.4F, -0.1F, -1.0F, 3, 1, 2, 0.2F, true));

        this.LowerArmL = new AdvancedModelRenderer(this);
        this.LowerArmL.setRotationPoint(2.75F, 0.4F, 0.0F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, 0.2618F, 1.3963F, 1.2217F);
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 0, 27, 0.0F, -0.51F, -0.49F, 2, 2, 1, 0.1F, true));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(1.75F, 0.5F, -0.3F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.0436F, -1.0996F, 0.0873F);
        this.HandL.cubeList.add(new ModelBox(HandL, 37, 12, 0.0F, -1.51F, -2.39F, 1, 3, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hip.render(f5);
    }
    public void renderStaticFloor(float f) {
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
        this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 6, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2};

        EntityPrehistoricFloraCacops entitySilesaurus = (EntityPrehistoricFloraCacops) e;

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraCacops ee = (EntityPrehistoricFloraCacops) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCacops entity = (EntityPrehistoricFloraCacops) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = -0.75 + (((tickAnim - 0) / 9) * (-1-(-0.75)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = -1 + (((tickAnim - 9) / 9) * (-0.75-(-1)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = -0.75 + (((tickAnim - 18) / 9) * (0-(-0.75)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (-0.75-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hip.rotationPointX = this.Hip.rotationPointX + (float)(xx);
        this.Hip.rotationPointY = this.Hip.rotationPointY - (float)(yy);
        this.Hip.rotationPointZ = this.Hip.rotationPointZ + (float)(zz);

        this.setRotateAngle(Hip, Hip.rotateAngleX + (float) Math.toRadians(0), Hip.rotateAngleY + (float) Math.toRadians(0), Hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/35D)*1.75D)*150/0.75-10))*-1));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (-11.98798D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (-5.72989D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (11.66716D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -11.98798D + (((tickAnim - 4D) / 5D) * (-29D-(-11.98798D)));
            yy = -5.72989D + (((tickAnim - 4D) / 5D) * (-19D-(-5.72989D)));
            zz = 11.66716D + (((tickAnim - 4D) / 5D) * (0D-(11.66716D)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -29D + (((tickAnim - 9D) / 5D) * (-12.01318D-(-29D)));
            yy = -19D + (((tickAnim - 9D) / 5D) * (-29.14767D-(-19D)));
            zz = 0D + (((tickAnim - 9D) / 5D) * (4.0079D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -12.01318D + (((tickAnim - 14D) / 4D) * (0D-(-12.01318D)));
            yy = -29.14767D + (((tickAnim - 14D) / 4D) * (-38D-(-29.14767D)));
            zz = 4.0079D + (((tickAnim - 14D) / 4D) * (0D-(4.0079D)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 18D) / 5D) * (-0.05132D-(0D)));
            yy = -38D + (((tickAnim - 18D) / 5D) * (-25.82164D-(-38D)));
            zz = 0D + (((tickAnim - 18D) / 5D) * (3.4926D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -0.05132D + (((tickAnim - 23D) / 3D) * (0.08163D-(-0.05132D)));
            yy = -25.82164D + (((tickAnim - 23D) / 3D) * (-18.65408D-(-25.82164D)));
            zz = 3.4926D + (((tickAnim - 23D) / 3D) * (3.98586D-(3.4926D)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0.08163D + (((tickAnim - 26D) / 4D) * (0.22937D-(0.08163D)));
            yy = -18.65408D + (((tickAnim - 26D) / 4D) * (-9.24223D-(-18.65408D)));
            zz = 3.98586D + (((tickAnim - 26D) / 4D) * (3.00701D-(3.98586D)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0.22937D + (((tickAnim - 30D) / 5D) * (0D-(0.22937D)));
            yy = -9.24223D + (((tickAnim - 30D) / 5D) * (0D-(-9.24223D)));
            zz = 3.00701D + (((tickAnim - 30D) / 5D) * (0D-(3.00701D)));
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 0D) / 17D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 17D) * (-40D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 17D) / 18D) * (0D-(0D)));
            yy = -40D + (((tickAnim - 17D) / 18D) * (0D-(-40D)));
            zz = 0D + (((tickAnim - 17D) / 18D) * (0D-(0D)));
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 0D) / 8D) * (-7.77958D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 8D) * (9.78872D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 8D) * (3.16078D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -7.77958D + (((tickAnim - 8D) / 9D) * (-9.47139D-(-7.77958D)));
            yy = 9.78872D + (((tickAnim - 8D) / 9D) * (41.78578D-(9.78872D)));
            zz = 3.16078D + (((tickAnim - 8D) / 9D) * (-17.54042D-(3.16078D)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = -9.47139D + (((tickAnim - 17D) / 18D) * (0D-(-9.47139D)));
            yy = 41.78578D + (((tickAnim - 17D) / 18D) * (0D-(41.78578D)));
            zz = -17.54042D + (((tickAnim - 17D) / 18D) * (0D-(-17.54042D)));
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 6.36267D + (((tickAnim - 0D) / 4D) * (6.21606D-(6.36267D)));
            yy = 40.27433D + (((tickAnim - 0D) / 4D) * (29.84843D-(40.27433D)));
            zz = 10.679D + (((tickAnim - 0D) / 4D) * (7.41944D-(10.679D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 6.21606D + (((tickAnim - 4D) / 4D) * (6.41617D-(6.21606D)));
            yy = 29.84843D + (((tickAnim - 4D) / 4D) * (19.37706D-(29.84843D)));
            zz = 7.41944D + (((tickAnim - 4D) / 4D) * (6.1892D-(7.41944D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 6.41617D + (((tickAnim - 8D) / 5D) * (6.5796D-(6.41617D)));
            yy = 19.37706D + (((tickAnim - 8D) / 5D) * (9.66985D-(19.37706D)));
            zz = 6.1892D + (((tickAnim - 8D) / 5D) * (6.85252D-(6.1892D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 6.5796D + (((tickAnim - 13D) / 4D) * (6.37588D-(6.5796D)));
            yy = 9.66985D + (((tickAnim - 13D) / 4D) * (-1.71472D-(9.66985D)));
            zz = 6.85252D + (((tickAnim - 13D) / 4D) * (9.69759D-(6.85252D)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 6.37588D + (((tickAnim - 17D) / 9D) * (-15.81052D-(6.37588D)));
            yy = -1.71472D + (((tickAnim - 17D) / 9D) * (23.5305D-(-1.71472D)));
            zz = 9.69759D + (((tickAnim - 17D) / 9D) * (-6.43169D-(9.69759D)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = -15.81052D + (((tickAnim - 26D) / 9D) * (6.36267D-(-15.81052D)));
            yy = 23.5305D + (((tickAnim - 26D) / 9D) * (40.27433D-(23.5305D)));
            zz = -6.43169D + (((tickAnim - 26D) / 9D) * (10.679D-(-6.43169D)));
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 4.83884D + (((tickAnim - 0D) / 17D) * (8.39588D-(4.83884D)));
            yy = 28.41097D + (((tickAnim - 0D) / 17D) * (6.63806D-(28.41097D)));
            zz = -17.11521D + (((tickAnim - 0D) / 17D) * (-25.37633D-(-17.11521D)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 8.39588D + (((tickAnim - 17D) / 18D) * (4.83884D-(8.39588D)));
            yy = 6.63806D + (((tickAnim - 17D) / 18D) * (28.41097D-(6.63806D)));
            zz = -25.37633D + (((tickAnim - 17D) / 18D) * (-17.11521D-(-25.37633D)));
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -7.84593D + (((tickAnim - 0D) / 4D) * (-4.62827D-(-7.84593D)));
            yy = -25.34455D + (((tickAnim - 0D) / 4D) * (-17.14478D-(-25.34455D)));
            zz = 13.55741D + (((tickAnim - 0D) / 4D) * (18.75561D-(13.55741D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -4.62827D + (((tickAnim - 4D) / 4D) * (-2.63203D-(-4.62827D)));
            yy = -17.14478D + (((tickAnim - 4D) / 4D) * (-8.93845D-(-17.14478D)));
            zz = 18.75561D + (((tickAnim - 4D) / 4D) * (18.15204D-(18.75561D)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -2.63203D + (((tickAnim - 8D) / 9D) * (-0.53825D-(-2.63203D)));
            yy = -8.93845D + (((tickAnim - 8D) / 9D) * (7.70287D-(-8.93845D)));
            zz = 18.15204D + (((tickAnim - 8D) / 9D) * (13.65562D-(18.15204D)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = -0.53825D + (((tickAnim - 17D) / 18D) * (-7.84593D-(-0.53825D)));
            yy = 7.70287D + (((tickAnim - 17D) / 18D) * (-25.34455D-(7.70287D)));
            zz = 13.65562D + (((tickAnim - 17D) / 18D) * (13.55741D-(13.65562D)));
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0), Tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/35D)*1.75D)*150/0.75-10))*1), Tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/35D)*1.75D)*150/0.75-10))*-7));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/35D)*1.75D)*150/0.75-10))*5), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0), body1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/35D)*1.75D)*150/0.75-10))*-1));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (-0.9468D-(0D)));
            yy = -26D + (((tickAnim - 0D) / 4D) * (-15.98977D-(-26D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (1.98628D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -0.9468D + (((tickAnim - 4D) / 5D) * (-0.2318D-(-0.9468D)));
            yy = -15.98977D + (((tickAnim - 4D) / 5D) * (-3.9785D-(-15.98977D)));
            zz = 1.98628D + (((tickAnim - 4D) / 5D) * (2.14234D-(1.98628D)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = -0.2318D + (((tickAnim - 9D) / 8D) * (0D-(-0.2318D)));
            yy = -3.9785D + (((tickAnim - 9D) / 8D) * (14D-(-3.9785D)));
            zz = 2.14234D + (((tickAnim - 9D) / 8D) * (0D-(2.14234D)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 17D) / 9D) * (-9.84498D-(0D)));
            yy = 14D + (((tickAnim - 17D) / 9D) * (-15.69306D-(14D)));
            zz = 0D + (((tickAnim - 17D) / 9D) * (12.59018D-(0D)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = -9.84498D + (((tickAnim - 26D) / 9D) * (0D-(-9.84498D)));
            yy = -15.69306D + (((tickAnim - 26D) / 9D) * (-26D-(-15.69306D)));
            zz = 12.59018D + (((tickAnim - 26D) / 9D) * (0D-(12.59018D)));
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 0D) / 17D) * (0D-(0D)));
            yy = 5D + (((tickAnim - 0D) / 17D) * (-5D-(5D)));
            zz = 0D + (((tickAnim - 0D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 17D) / 18D) * (0D-(0D)));
            yy = -5D + (((tickAnim - 17D) / 18D) * (5D-(-5D)));
            zz = 0D + (((tickAnim - 17D) / 18D) * (0D-(0D)));
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 14.33147D + (((tickAnim - 0D) / 17D) * (-11.52777D-(14.33147D)));
            yy = 11.32943D + (((tickAnim - 0D) / 17D) * (-1.30808D-(11.32943D)));
            zz = 14.78262D + (((tickAnim - 0D) / 17D) * (-11.58677D-(14.78262D)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = -11.52777D + (((tickAnim - 17D) / 18D) * (14.33147D-(-11.52777D)));
            yy = -1.30808D + (((tickAnim - 17D) / 18D) * (11.32943D-(-1.30808D)));
            zz = -11.58677D + (((tickAnim - 17D) / 18D) * (14.78262D-(-11.58677D)));
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 45.59313D + (((tickAnim - 0D) / 4D) * (33.48171D-(45.59313D)));
            yy = -43.99252D + (((tickAnim - 0D) / 4D) * (-12.56624D-(-43.99252D)));
            zz = -23.50936D + (((tickAnim - 0D) / 4D) * (-30.9872D-(-23.50936D)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 33.48171D + (((tickAnim - 4D) / 7D) * (2.84499D-(33.48171D)));
            yy = -12.56624D + (((tickAnim - 4D) / 7D) * (14.16124D-(-12.56624D)));
            zz = -30.9872D + (((tickAnim - 4D) / 7D) * (-15.01281D-(-30.9872D)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 2.84499D + (((tickAnim - 11D) / 6D) * (0D-(2.84499D)));
            yy = 14.16124D + (((tickAnim - 11D) / 6D) * (28D-(14.16124D)));
            zz = -15.01281D + (((tickAnim - 11D) / 6D) * (0D-(-15.01281D)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 17D) / 18D) * (45.59313D-(0D)));
            yy = 28D + (((tickAnim - 17D) / 18D) * (-43.99252D-(28D)));
            zz = 0D + (((tickAnim - 17D) / 18D) * (-23.50936D-(0D)));
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 0D) / 11D) * (31.07068D-(0D)));
            yy = -13D + (((tickAnim - 0D) / 11D) * (-1.33282D-(-13D)));
            zz = 0D + (((tickAnim - 0D) / 11D) * (32.27635D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 31.07068D + (((tickAnim - 11D) / 6D) * (0D-(31.07068D)));
            yy = -1.33282D + (((tickAnim - 11D) / 6D) * (-4D-(-1.33282D)));
            zz = 32.27635D + (((tickAnim - 11D) / 6D) * (0D-(32.27635D)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0D + (((tickAnim - 17D) / 5D) * (0D-(0D)));
            yy = -4D + (((tickAnim - 17D) / 5D) * (4.32D-(-4D)));
            zz = 0D + (((tickAnim - 17D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 22D) / 4D) * (0D-(0D)));
            yy = 4.32D + (((tickAnim - 22D) / 4D) * (7.5D-(4.32D)));
            zz = 0D + (((tickAnim - 22D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 26D) / 9D) * (0D-(0D)));
            yy = 7.5D + (((tickAnim - 26D) / 9D) * (-13D-(7.5D)));
            zz = 0D + (((tickAnim - 26D) / 9D) * (0D-(0D)));
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -2.17358D + (((tickAnim - 0D) / 11D) * (-4.88714D-(-2.17358D)));
            yy = 55.10765D + (((tickAnim - 0D) / 11D) * (17.68468D-(55.10765D)));
            zz = 5.26726D + (((tickAnim - 0D) / 11D) * (-5.30139D-(5.26726D)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = -4.88714D + (((tickAnim - 11D) / 6D) * (-7.14813D-(-4.88714D)));
            yy = 17.68468D + (((tickAnim - 11D) / 6D) * (-13.60938D-(17.68468D)));
            zz = -5.30139D + (((tickAnim - 11D) / 6D) * (-6.18681D-(-5.30139D)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = -7.14813D + (((tickAnim - 17D) / 9D) * (-13.48768D-(-7.14813D)));
            yy = -13.60938D + (((tickAnim - 17D) / 9D) * (11.56333D-(-13.60938D)));
            zz = -6.18681D + (((tickAnim - 17D) / 9D) * (11.34291D-(-6.18681D)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = -13.48768D + (((tickAnim - 26D) / 9D) * (-2.17358D-(-13.48768D)));
            yy = 11.56333D + (((tickAnim - 26D) / 9D) * (55.10765D-(11.56333D)));
            zz = 11.34291D + (((tickAnim - 26D) / 9D) * (5.26726D-(11.34291D)));
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCacops entity = (EntityPrehistoricFloraCacops) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 0D) / 12D) * (8.02558D-(0D)));
            yy = -50D + (((tickAnim - 0D) / 12D) * (38.08641D-(-50D)));
            zz = 0D + (((tickAnim - 0D) / 12D) * (9.45312D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 8.02558D + (((tickAnim - 12D) / 13D) * (0D-(8.02558D)));
            yy = 38.08641D + (((tickAnim - 12D) / 13D) * (-50D-(38.08641D)));
            zz = 9.45312D + (((tickAnim - 12D) / 13D) * (0D-(9.45312D)));
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 0D) / 12D) * (60.30774D-(0D)));
            yy = 20D + (((tickAnim - 0D) / 12D) * (11.84428D-(20D)));
            zz = 0D + (((tickAnim - 0D) / 12D) * (58.15265D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 60.30774D + (((tickAnim - 12D) / 13D) * (0D-(60.30774D)));
            yy = 11.84428D + (((tickAnim - 12D) / 13D) * (20D-(11.84428D)));
            zz = 58.15265D + (((tickAnim - 12D) / 13D) * (0D-(58.15265D)));
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0.2141D + (((tickAnim - 0D) / 12D) * (-41.23209D-(0.2141D)));
            yy = 48.7649D + (((tickAnim - 0D) / 12D) * (44.26081D-(48.7649D)));
            zz = 0.67885D + (((tickAnim - 0D) / 12D) * (-37.40455D-(0.67885D)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -41.23209D + (((tickAnim - 12D) / 13D) * (0.2141D-(-41.23209D)));
            yy = 44.26081D + (((tickAnim - 12D) / 13D) * (48.7649D-(44.26081D)));
            zz = -37.40455D + (((tickAnim - 12D) / 13D) * (0.67885D-(-37.40455D)));
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
            yy = 50D + (((tickAnim - 0D) / 12D) * (-33D-(50D)));
            zz = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 12D) / 13D) * (0D-(0D)));
            yy = -33D + (((tickAnim - 12D) / 13D) * (50D-(-33D)));
            zz = 0D + (((tickAnim - 12D) / 13D) * (0D-(0D)));
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 0D) / 12D) * (49.97126D-(0D)));
            yy = -20D + (((tickAnim - 0D) / 12D) * (-24.86011D-(-20D)));
            zz = 0D + (((tickAnim - 0D) / 12D) * (-51.60447D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 49.97126D + (((tickAnim - 12D) / 13D) * (0D-(49.97126D)));
            yy = -24.86011D + (((tickAnim - 12D) / 13D) * (-20D-(-24.86011D)));
            zz = -51.60447D + (((tickAnim - 12D) / 13D) * (0D-(-51.60447D)));
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -0.21409D + (((tickAnim - 0D) / 12D) * (-46.12333D-(-0.21409D)));
            yy = -48.76485D + (((tickAnim - 0D) / 12D) * (-54.69D-(-48.76485D)));
            zz = 0.67885D + (((tickAnim - 0D) / 12D) * (34.62316D-(0.67885D)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -46.12333D + (((tickAnim - 12D) / 13D) * (-0.21409D-(-46.12333D)));
            yy = -54.69D + (((tickAnim - 12D) / 13D) * (-48.76485D-(-54.69D)));
            zz = 34.62316D + (((tickAnim - 12D) / 13D) * (0.67885D-(34.62316D)));
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)*400/1.4-300))*-1), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)*400/1.4+300))*-1));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)*400/1.4-300))*-5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)*400/1.4+300))*-5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)*400/1.4-300))*-1), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)*400/1.4+300))*-1));



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 19.50273D + (((tickAnim - 0D) / 12D) * (-16.8442D-(19.50273D)));
            yy = -67.52861D + (((tickAnim - 0D) / 12D) * (18.46474D-(-67.52861D)));
            zz = -2.65255D + (((tickAnim - 0D) / 12D) * (1.24491D-(-2.65255D)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -16.8442D + (((tickAnim - 12D) / 13D) * (19.50273D-(-16.8442D)));
            yy = 18.46474D + (((tickAnim - 12D) / 13D) * (-67.52861D-(18.46474D)));
            zz = 1.24491D + (((tickAnim - 12D) / 13D) * (-2.65255D-(1.24491D)));
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -40.62999D + (((tickAnim - 0D) / 12D) * (48.52902D-(-40.62999D)));
            yy = 30.58592D + (((tickAnim - 0D) / 12D) * (88.44563D-(30.58592D)));
            zz = 72.64934D + (((tickAnim - 0D) / 12D) * (77.2515D-(72.64934D)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 48.52902D + (((tickAnim - 12D) / 13D) * (-40.62999D-(48.52902D)));
            yy = 88.44563D + (((tickAnim - 12D) / 13D) * (30.58592D-(88.44563D)));
            zz = 77.2515D + (((tickAnim - 12D) / 13D) * (72.64934D-(77.2515D)));
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 167D + (((tickAnim - 0D) / 25D) * (167D-(167D)));
            yy = 6D + (((tickAnim - 0D) / 25D) * (6D-(6D)));
            zz = 180D + (((tickAnim - 0D) / 25D) * (180D-(180D)));
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 0D) / 12D) * (15.93072D-(0D)));
            yy = -21D + (((tickAnim - 0D) / 12D) * (51.31613D-(-21D)));
            zz = -25D + (((tickAnim - 0D) / 12D) * (-3.59909D-(-25D)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 15.93072D + (((tickAnim - 12D) / 13D) * (0D-(15.93072D)));
            yy = 51.31613D + (((tickAnim - 12D) / 13D) * (-21D-(51.31613D)));
            zz = -3.59909D + (((tickAnim - 12D) / 13D) * (-25D-(-3.59909D)));
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 28.03211D + (((tickAnim - 0D) / 12D) * (-88.8799D-(28.03211D)));
            yy = -83.2484D + (((tickAnim - 0D) / 12D) * (-7.58387D-(-83.2484D)));
            zz = -57.94473D + (((tickAnim - 0D) / 12D) * (-54.3326D-(-57.94473D)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -88.8799D + (((tickAnim - 12D) / 13D) * (28.03211D-(-88.8799D)));
            yy = -7.58387D + (((tickAnim - 12D) / 13D) * (-83.2484D-(-7.58387D)));
            zz = -54.3326D + (((tickAnim - 12D) / 13D) * (-57.94473D-(-54.3326D)));
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 167D + (((tickAnim - 0D) / 25D) * (167D-(167D)));
            yy = -6D + (((tickAnim - 0D) / 25D) * (-6D-(-6D)));
            zz = -180D + (((tickAnim - 0D) / 25D) * (-180D-(-180D)));
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCacops e = (EntityPrehistoricFloraCacops) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Head, 0,0,-0.2F);
        animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.Head, 0,0,-0.2F);
        animator.rotate(this.Head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
