package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDakosaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraNothosaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraProterosuchus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDakosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Upperjaw;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer UpperLegR;
    private final AdvancedModelRenderer LowerLegR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer UpperLegL;
    private final AdvancedModelRenderer LowerLegL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;


    private final ModelAnimator animator;

    public ModelDakosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 14.5F, 4.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 57, -5.0F, -1.75F, -1.7F, 10, 8, 5, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 1.75F, -1.75F);
        this.Body.addChild(Neck);
        this.Neck.cubeList.add(new ModelBox(Neck, 37, 33, -4.0F, -3.25F, -7.25F, 8, 7, 9, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.25F, -7.25F);
        this.Neck.addChild(Head);


        this.Upperjaw = new AdvancedModelRenderer(this);
        this.Upperjaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Head.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, -0.0436F, 0.0F, 0.0F);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 54, 63, -4.0F, -4.0F, -5.0F, 8, 4, 6, 0.01F, false));
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 58, 13, -3.0F, -2.0F, -8.75F, 6, 2, 4, 0.0F, false));
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 71, 41, -3.0F, -0.35F, -8.65F, 6, 1, 4, -0.012F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Upperjaw.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 74, 10, -2.0F, -0.95F, -13.4F, 4, 1, 5, -0.015F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.6F, -13.85F);
        this.Upperjaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0785F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 68, -2.0F, -0.025F, 0.0F, 4, 2, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.65F, -13.85F);
        this.Upperjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3403F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 29, -1.5F, 0.0F, 4.275F, 3, 2, 1, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 42, -1.5F, 0.0F, 0.0F, 3, 2, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.0F, -6.0F);
        this.Upperjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1484F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 74, 46, -2.5F, 0.15F, -3.0F, 5, 2, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.5F, -3.75F, -8.25F);
        this.Upperjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1134F, 0.6109F, 0.0873F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 93, -3.25F, 0.7F, -0.25F, 3, 1, 5, -0.01F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 85, -3.25F, 0.3F, -0.25F, 3, 1, 5, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.5F, -3.75F, -8.25F);
        this.Upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1047F, 0.0F, 0.0873F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 1, 94, -0.4F, -0.55F, 5.1F, 3, 1, 4, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.5F, -3.75F, -8.25F);
        this.Upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1047F, 0.0F, -0.0873F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 1, 94, -2.6F, -0.55F, 5.1F, 3, 1, 4, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.5F, -3.75F, -8.25F);
        this.Upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1134F, -0.6109F, -0.0873F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 93, 0.25F, 0.7F, -0.25F, 3, 1, 5, -0.01F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 85, 0.25F, 0.3F, -0.25F, 3, 1, 5, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 0.15F, 0.95F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.0873F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 6, 0, -1.5F, -3.0F, -14.25F, 3, 2, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 3.0F, -5.0F);
        this.Lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3665F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 78, -1.5F, -0.125F, -9.95F, 3, 1, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.0F, -5.0F);
        this.Lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3185F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 47, 73, -2.0F, -3.1F, -10.05F, 4, 2, 5, -0.02F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 3.0F, -5.0F);
        this.Lowerjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1876F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 65, 73, -2.0F, -2.9F, -10.0F, 4, 2, 5, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 3.0F, -5.0F);
        this.Lowerjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1396F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 30, -3.0F, -3.85F, -5.0F, 6, 1, 2, -0.015F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 3.0F, -5.0F);
        this.Lowerjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1134F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 70, -3.0F, -3.325F, -5.025F, 6, 3, 4, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 7.0F, 5.0F);
        this.Lowerjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 62, 33, -3.5F, -9.35F, -10.75F, 7, 3, 5, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 63, 0, -4.0F, -6.45F, -11.5F, 8, 3, 7, -0.01F, false));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-5.0F, 3.25F, 0.25F);
        this.Body.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, -0.5236F, -0.5672F, 0.0F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 33, 6, -0.5F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(0.25F, 0.0F, 3.0F);
        this.UpperArmR.addChild(HandR);
        this.setRotateAngle(HandR, 0.5236F, 0.3927F, 0.3054F);
        this.HandR.cubeList.add(new ModelBox(HandR, 20, 70, -0.5F, -1.75F, -0.5F, 1, 3, 4, 0.0F, false));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(5.0F, 3.25F, 0.25F);
        this.Body.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -0.5236F, 0.5672F, 0.0F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 33, 6, -1.5F, -1.0F, 0.0F, 2, 2, 3, 0.0F, true));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(-0.25F, 0.0F, 3.0F);
        this.UpperArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.5236F, -0.3927F, -0.3054F);
        this.HandL.cubeList.add(new ModelBox(HandL, 20, 70, -0.5F, -1.75F, -0.5F, 1, 3, 4, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 2.0F, 2.75F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 21, -5.5F, -4.25F, 0.05F, 11, 9, 12, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.2F, 12.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 0, -5.0F, -4.2F, -1.0F, 10, 8, 13, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 3.8F, 11.0F);
        this.Body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0611F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 33, 0, -4.5F, -1.0F, -12.0F, 9, 1, 12, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -0.2F, 11.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 51, 49, -4.0F, -3.45F, 0.0F, 8, 7, 7, 0.0F, false));

        this.UpperLegR = new AdvancedModelRenderer(this);
        this.UpperLegR.setRotationPoint(-3.75F, 0.4F, 2.9F);
        this.Body4.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, 0.6981F, -0.6109F, 0.0F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 0, 21, -1.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F, false));

        this.LowerLegR = new AdvancedModelRenderer(this);
        this.LowerLegR.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, 0.6109F, 0.3491F, 0.0F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 0, 42, -0.65F, 0.45F, -1.5F, 2, 4, 3, 0.0F, false));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, 0.2618F, 0.0F, 0.2182F);
        this.FootR.cubeList.add(new ModelBox(FootR, 0, 0, -0.25F, -0.3F, -2.25F, 1, 7, 4, 0.0F, false));

        this.UpperLegL = new AdvancedModelRenderer(this);
        this.UpperLegL.setRotationPoint(3.75F, 0.4F, 2.9F);
        this.Body4.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, 0.6981F, 0.6109F, 0.0F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 0, 21, -2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F, true));

        this.LowerLegL = new AdvancedModelRenderer(this);
        this.LowerLegL.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.6109F, -0.3491F, 0.0F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 0, 42, -1.35F, 0.45F, -1.5F, 2, 4, 3, 0.0F, true));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.2618F, 0.0F, -0.2182F);
        this.FootL.cubeList.add(new ModelBox(FootL, 0, 0, -0.75F, -0.3F, -2.25F, 1, 7, 4, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.25F, 7.0F);
        this.Body4.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 35, 13, -3.0F, -2.95F, -1.0F, 6, 6, 11, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.5F, 10.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0436F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 42, -2.5F, -2.2F, -1.0F, 5, 4, 11, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.Tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.096F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 56, -2.0F, 0.05F, -1.1F, 4, 1, 11, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.55F, 10.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 58, 19, -1.5F, -1.4F, -0.75F, 3, 3, 11, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.3F, 10.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0873F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 6.25F, 4.75F);
        this.Tail4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2618F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 33, 0, -0.5F, -1.05F, -0.025F, 1, 1, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.95F, -1.0F);
        this.Tail4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.6981F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 21, 68, -0.5F, -0.2F, 0.0F, 1, 2, 9, 0.01F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 32, 36, 0.0F, -5.7F, 0.0F, 0, 7, 13, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body.render(f5);
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.Body.render(0.01F);
        resetToDefaultPose();
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
        this.Body.offsetY = 0.25F;

        EntityPrehistoricFloraDakosaurus Dako = (EntityPrehistoricFloraDakosaurus) e;

        this.faceTarget(f3, f4, 5, Neck);
        this.faceTarget(f3, f4, 5, Head);
        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2, this.Tail3, this.Tail4};
        //AdvancedModelRenderer[] Torso = {this.Neckfront, this.Neckmiddlefront, this.Neckmiddlebase, this.Neckbase, this.Bodyfront};
        Dako.tailBuffer.applyChainSwingBuffer(Tail);

        //AdvancedModelRenderer[] FL = {this.Rightupperarm, this.Rightlowerarm, this.Rightfrontfoot};
        //AdvancedModelRenderer[] FR = {this.Leftupperarm, this.Leftlowerarm, this.Leftfrontfoot};
        //AdvancedModelRenderer[] BL = {this.Rightthigh, this.Rightshin, this.Righthindfoot};
        //AdvancedModelRenderer[] BR = {this.Leftthigh, this.Leftshin, this.Lefthindfoot};

        if (!Dako.isReallyInWater()) { //will never happen as it should not be on land
            //this.leftarm.rotateAngleZ = (float) Math.toRadians(15.6125);
            //this.rightarm3.rotateAngleZ = (float) Math.toRadians(-18.662);

            //this.leftleg.rotateAngleX = -(float) Math.toRadians(22.9232);
            //this.rightleg3.rotateAngleX = -(float) Math.toRadians(22.9232);
        }
    }
    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraDakosaurus ee = (EntityPrehistoricFloraDakosaurus) entitylivingbaseIn;

        if (ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            } else {
                animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDakosaurus entity = (EntityPrehistoricFloraDakosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        double sinvar1 = (Math.PI / 180) * ((tickAnim / 20D) * 180 / 0.5);

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin(sinvar1)*-10) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*((tickAnim /20D)*180/0.66+60))*30D-(Math.sin(sinvar1)*-10D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D));
            zz = (Math.sin(sinvar1)*2) + (((tickAnim - 0D) / 10D) * (0.0));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*((tickAnim /20D)*180/0.66+60))*30) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*((tickAnim / 20D) * 180 +60))*-30D-(Math.sin((Math.PI/180)*((tickAnim /20D)*180/0.66+60))*30D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D));
            zz = (Math.sin(sinvar1)*2) + (((tickAnim - 10D) / 3D) * (0.0));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*((tickAnim / 20D) * 180 +60))*-30) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*((tickAnim / 20D) * 180 +60))*-30D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D));
            zz = (Math.sin(sinvar1)*2) + (((tickAnim - 13D) / 7D) * (0.0));
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin(sinvar1)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*((tickAnim /20D)*180/0.66))*-10D-(Math.sin(sinvar1)*5D)));
            yy = (Math.sin((Math.PI/180)*((tickAnim /20D)*360/0.5))*2) + (((tickAnim - 0D) / 10D) * (0.0));
            zz = (Math.sin(sinvar1)*2) + (((tickAnim - 0D) / 10D) * (0.0));
        }
        else {
            double v = Math.sin((Math.PI / 180) * ((tickAnim / 20D) * 180));
            if (tickAnim >= 10 && tickAnim < 13) {
                xx = (Math.sin((Math.PI/180)*((tickAnim /20D)*180/0.66))*-10) + (((tickAnim - 10D) / 3D) * (v *10D-(Math.sin((Math.PI/180)*((tickAnim /20D)*180/0.66))*-10D)));
                yy = (Math.sin((Math.PI / 180) * ((tickAnim / 20D) * 360 / 0.5))*2) + (((tickAnim - 10D) / 3D) * (0.0));
                zz = (Math.sin(sinvar1)*2) + (((tickAnim - 10D) / 3D) * (0.0));
            }
            else if (tickAnim >= 13 && tickAnim < 20) {
                xx = (v *10) + (((tickAnim - 13D) / 7D) * (0D-(v *10D)));
                yy = (Math.sin((Math.PI / 180) * ((tickAnim / 20D) * 360 / 0.5))*2) + (((tickAnim - 13D) / 7D) * (0.0));
                zz = (Math.sin(sinvar1)*2) + (((tickAnim - 13D) / 7D) * (0.0));
            }
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin(sinvar1)*0) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*((tickAnim /20D)*180/0.66-60))*5D-(Math.sin(sinvar1)*0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*((tickAnim /20D)*180/0.66-60))*5) + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*((tickAnim / 20D) * 180 -60))*40D-(Math.sin((Math.PI/180)*((tickAnim /20D)*180/0.66-60))*5D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*((tickAnim / 20D) * 180 -60))*40) + (((tickAnim - 13D) / 7D) * (0D-(Math.sin((Math.PI/180)*((tickAnim / 20D) * 180 -60))*40D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D));
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));

    }



    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDakosaurus entity = (EntityPrehistoricFloraDakosaurus) entitylivingbaseIn;
        int animCycle = 176;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1))*-1), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1))*5), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.Body.offsetX = (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1-90))*0.5);
        this.Body.offsetY = (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1-90))*0.5);
        this.Body.offsetZ = (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1-90))*0.5);
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1))*1), Neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1))*-2), Neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1))*-1));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1))*-2), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1))*-1));
        this.setRotateAngle(Body3, Body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1))*-1), Body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1))*2), Body3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1))*2));
        this.setRotateAngle(Body4, Body4.rotateAngleX + (float) Math.toRadians(0), Body4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1))*10), Body4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1))*2));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1-60))*2), Tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1-60))*20), Tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1-60))*2));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1-100))*20), Tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1-180))*25), Tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1-250))*25), Tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(0), LowerLegR.rotateAngleY + (float) Math.toRadians(0), LowerLegR.rotateAngleZ + (float) Math.toRadians(-12.5+Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1-100))*5));
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(0), FootR.rotateAngleY + (float) Math.toRadians(0), FootR.rotateAngleZ + (float) Math.toRadians(-25));
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(0), UpperLegL.rotateAngleY + (float) Math.toRadians(0), UpperLegL.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1-60))*20));
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(0), LowerLegL.rotateAngleY + (float) Math.toRadians(0), LowerLegL.rotateAngleZ + (float) Math.toRadians(12.5+Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1-100))*5));
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(0), FootL.rotateAngleY + (float) Math.toRadians(0), FootL.rotateAngleZ + (float) Math.toRadians(25));
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1-100))*5), UpperArmR.rotateAngleY + (float) Math.toRadians(0), UpperArmR.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360/1-100))*5), UpperArmL.rotateAngleY + (float) Math.toRadians(0), UpperArmL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(0), UpperLegR.rotateAngleY + (float) Math.toRadians(0), UpperLegR.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/176D)*8.8D)*360-60))*20));
    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDakosaurus entity = (EntityPrehistoricFloraDakosaurus) entitylivingbaseIn;
        int animCycle = 100;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5))*-2), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5))*-3), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.Body.offsetX = (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5-90))*1);
        this.Body.offsetY = (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5-90))*0.5);
        this.Body.offsetZ = (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5-180))*0.5);
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5+180))*3), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5+30))*-1), Neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5+270))*3), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5+120))*-1), Head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5+120))*-0.5), Body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5+120))*1), Body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body3, Body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5+90))*-0.5), Body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5+90))*5), Body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body4, Body4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5))*-0.5), Body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5))*5), Body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(0), Tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5-0))*5), Tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5-50))*5), Tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5-70))*5), Tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5-150))*10), Tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5-50))*-10), UpperArmR.rotateAngleY + (float) Math.toRadians(0), UpperArmR.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5-70))*-10), HandR.rotateAngleY + (float) Math.toRadians(0), HandR.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5-50))*-10), UpperArmL.rotateAngleY + (float) Math.toRadians(0), UpperArmL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5-70))*-10), HandL.rotateAngleY + (float) Math.toRadians(0), HandL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5))*-5), UpperLegR.rotateAngleY + (float) Math.toRadians(0), UpperLegR.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5-0))*5));
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(0), LowerLegR.rotateAngleY + (float) Math.toRadians(0), LowerLegR.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5-50))*5));
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(0), FootR.rotateAngleY + (float) Math.toRadians(0), FootR.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5-70))*5));
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5))*-5), UpperLegL.rotateAngleY + (float) Math.toRadians(0), UpperLegL.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5-0))*5));
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(0), LowerLegL.rotateAngleY + (float) Math.toRadians(0), LowerLegL.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5-0))*5));
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(0), FootL.rotateAngleY + (float) Math.toRadians(0), FootL.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/5-70))*5));
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDakosaurus entity = (EntityPrehistoricFloraDakosaurus) entitylivingbaseIn;
        int animCycle = 100;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*180/2.5))*-1), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5))*-4), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.Body.offsetX = (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5-90))*0.5);
        this.Body.offsetY = (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*180/2.5-90))*0.5);
        this.Body.offsetZ = (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5-180))*0.5);
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*180/2.5+180))*1), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5+30))*-1), Neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*180/2.5+270))*1), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5+120))*-1), Head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*180/2.5+120))*-0.5), Body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5+120))*1), Body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body3, Body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*180/2.5+90))*-0.5), Body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5+90))*5), Body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body4, Body4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*180/2.5))*-0.5), Body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5))*5), Body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(0), Tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5-0))*10), Tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5-50))*10), Tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5-70))*10), Tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5-150))*20), Tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5-70))*2), UpperArmR.rotateAngleY + (float) Math.toRadians(0), UpperArmR.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5-70))*2), UpperArmL.rotateAngleY + (float) Math.toRadians(0), UpperArmL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(0), UpperLegR.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5-0))*10), UpperLegR.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(0), LowerLegR.rotateAngleY + (float) Math.toRadians(0), LowerLegR.rotateAngleZ + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5-50))*5));
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(0), FootR.rotateAngleY + (float) Math.toRadians(0), FootR.rotateAngleZ + (float) Math.toRadians(-25+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5-70))*10));
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(0), UpperLegL.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5-0))*10), UpperLegL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(0), LowerLegL.rotateAngleY + (float) Math.toRadians(0), LowerLegL.rotateAngleZ + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5-50))*5));
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(0), FootL.rotateAngleY + (float) Math.toRadians(0), FootL.rotateAngleZ + (float) Math.toRadians(25+Math.sin((Math.PI/180)*((((double)tickAnim/100D)*5D)*360/2.5-70))*10));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);

    }
}
