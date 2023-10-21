package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraChunerpeton;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelChunerpeton extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended Hips;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended UpperLegR;
    private final AdvancedModelRendererExtended LowerLegR;
    private final AdvancedModelRendererExtended FootR;
    private final AdvancedModelRendererExtended UpperLegL;
    private final AdvancedModelRendererExtended LowerLegL;
    private final AdvancedModelRendererExtended FootL;
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended Chest;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended GillR;
    private final AdvancedModelRendererExtended GillL;
    private final AdvancedModelRendererExtended GillR2;
    private final AdvancedModelRendererExtended GillL2;
    private final AdvancedModelRendererExtended GillR3;
    private final AdvancedModelRendererExtended GillL3;
    private final AdvancedModelRendererExtended Upperjaw;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended UpperArmR;
    private final AdvancedModelRendererExtended LowerArmR;
    private final AdvancedModelRendererExtended HandR;
    private final AdvancedModelRendererExtended UpperArmL;
    private final AdvancedModelRendererExtended LowerArmL;
    private final AdvancedModelRendererExtended HandL;
    private final AdvancedModelRendererExtended Tail1;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;

    private ModelAnimator animator;

    public ModelChunerpeton() {
        this.textureWidth = 55;
        this.textureHeight = 50;

        this.Hips = new AdvancedModelRendererExtended(this);
        this.Hips.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 21, 6, -2.0F, -2.05F, 9.0F, 4, 2, 3, -0.01F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -2.8F, 9.5F);
        this.Hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 27, -1.5F, -0.05F, -0.5F, 3, 1, 3, -0.01F, false));

        this.UpperLegR = new AdvancedModelRendererExtended(this);
        this.UpperLegR.setRotationPoint(-1.75F, -0.75F, 10.9F);
        this.Hips.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, -0.0873F, -0.3054F, 0.0F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 15, 32, -2.0F, -0.25F, -0.85F, 3, 1, 1, 0.01F, false));
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 31, 27, -2.0F, -0.25F, -0.25F, 3, 1, 1, 0.0F, false));

        this.LowerLegR = new AdvancedModelRendererExtended(this);
        this.LowerLegR.setRotationPoint(-1.75F, 0.25F, 0.3F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, 0.0F, 1.4399F, 0.0F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 32, 6, -2.25F, -0.5F, -0.5F, 3, 1, 1, -0.01F, false));
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 30, 0, -2.25F, -0.5F, -0.75F, 3, 1, 1, -0.02F, false));

        this.FootR = new AdvancedModelRendererExtended(this);
        this.FootR.setRotationPoint(-2.0F, 0.25F, 0.0F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, 0.0F, -0.48F, 0.0F);
        this.FootR.cubeList.add(new ModelBox(FootR, -3, 38, -2.5F, 0.05F, -1.5F, 3, 0, 3, 0.0F, false));
        this.FootR.cubeList.add(new ModelBox(FootR, 25, 19, -2.5F, 0.0F, -1.5F, 3, 0, 3, 0.0F, false));

        this.UpperLegL = new AdvancedModelRendererExtended(this);
        this.UpperLegL.setRotationPoint(1.75F, -0.75F, 10.9F);
        this.Hips.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, -0.0873F, 0.3054F, 0.0F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 15, 32, -1.0F, -0.25F, -0.85F, 3, 1, 1, 0.01F, true));
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 31, 27, -1.0F, -0.25F, -0.25F, 3, 1, 1, 0.0F, true));

        this.LowerLegL = new AdvancedModelRendererExtended(this);
        this.LowerLegL.setRotationPoint(1.75F, 0.25F, 0.3F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.0F, -1.4399F, 0.0F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 32, 6, -0.75F, -0.5F, -0.5F, 3, 1, 1, -0.01F, true));
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 30, 0, -0.75F, -0.5F, -0.75F, 3, 1, 1, -0.02F, true));

        this.FootL = new AdvancedModelRendererExtended(this);
        this.FootL.setRotationPoint(2.0F, 0.25F, 0.0F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.0F, 0.48F, 0.0F);
        this.FootL.cubeList.add(new ModelBox(FootL, 25, 19, -0.5F, 0.0F, -1.5F, 3, 0, 3, 0.0F, true));
        this.FootL.cubeList.add(new ModelBox(FootL, -3, 38, -0.5F, 0.05F, -1.5F, 3, 0, 3, 0.0F, true));

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 9.5F);
        this.Hips.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -3.0F, -3.0F, -8.0F, 6, 3, 6, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 18, 0, -2.5F, -3.0F, -2.0F, 5, 3, 2, 0.0F, false));

        this.Chest = new AdvancedModelRendererExtended(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, -7.5F);
        this.Body.addChild(Chest);
        this.Chest.cubeList.add(new ModelBox(Chest, 0, 16, -2.5F, -3.0F, -3.0F, 5, 3, 3, 0.01F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Chest.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 0, 9, -2.0F, -2.01F, -4.1F, 4, 2, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 33, 20, -2.0F, -2.875F, -4.1F, 4, 2, 5, -0.01F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(2.5F, 0.0F, 1.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1222F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 25, -1.85F, -2.0F, -4.8F, 2, 2, 4, 0.015F, true));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(-2.5F, 0.0F, 1.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1222F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 25, -0.15F, -2.0F, -4.8F, 2, 2, 4, 0.015F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, -1.025F, -3.9F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0873F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 29, 2, -1.0F, -0.1F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(1.0F, 0.9F, -3.0F);
        this.Jaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.5672F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 27, -2.0F, -1.01F, 0.0F, 2, 1, 4, 0.0F, true));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-1.0F, 0.9F, -3.0F);
        this.Jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.5672F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 27, 0.0F, -1.011F, 0.0F, 2, 1, 4, 0.0F, false));

        this.GillR = new AdvancedModelRendererExtended(this);
        this.GillR.setRotationPoint(-2.25F, -2.1F, -2.0F);
        this.Head.addChild(GillR);
        this.setRotateAngle(GillR, 0.829F, 0.6981F, 0.3491F);
        this.GillR.cubeList.add(new ModelBox(GillR, 26, 22, -2.5F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        this.GillL = new AdvancedModelRendererExtended(this);
        this.GillL.setRotationPoint(2.25F, -2.1F, -2.0F);
        this.Head.addChild(GillL);
        this.setRotateAngle(GillL, 0.829F, -0.6981F, -0.3491F);
        this.GillL.cubeList.add(new ModelBox(GillL, 26, 22, -0.5F, 0.0F, -0.5F, 3, 0, 2, 0.0F, true));

        this.GillR2 = new AdvancedModelRendererExtended(this);
        this.GillR2.setRotationPoint(-2.75F, -1.7F, -2.0F);
        this.Head.addChild(GillR2);
        this.setRotateAngle(GillR2, 0.5236F, 0.4363F, 0.1745F);
        this.GillR2.cubeList.add(new ModelBox(GillR2, 12, 25, -2.5F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        this.GillL2 = new AdvancedModelRendererExtended(this);
        this.GillL2.setRotationPoint(2.75F, -1.7F, -2.0F);
        this.Head.addChild(GillL2);
        this.setRotateAngle(GillL2, 0.5236F, -0.4363F, -0.1745F);
        this.GillL2.cubeList.add(new ModelBox(GillL2, 12, 25, -0.5F, 0.0F, -0.5F, 3, 0, 2, 0.0F, true));

        this.GillR3 = new AdvancedModelRendererExtended(this);
        this.GillR3.setRotationPoint(-2.75F, -1.25F, -2.0F);
        this.Head.addChild(GillR3);
        this.setRotateAngle(GillR3, 0.3491F, 0.1745F, -0.1309F);
        this.GillR3.cubeList.add(new ModelBox(GillR3, 22, 11, -2.5F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        this.GillL3 = new AdvancedModelRendererExtended(this);
        this.GillL3.setRotationPoint(2.75F, -1.25F, -2.0F);
        this.Head.addChild(GillL3);
        this.setRotateAngle(GillL3, 0.3491F, -0.1745F, 0.1309F);
        this.GillL3.cubeList.add(new ModelBox(GillL3, 22, 11, -0.5F, 0.0F, -0.5F, 3, 0, 2, 0.0F, true));

        this.Upperjaw = new AdvancedModelRendererExtended(this);
        this.Upperjaw.setRotationPoint(0.0F, -1.25F, -4.0F);
        this.Head.addChild(Upperjaw);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 31, 11, -1.0F, -0.75F, -3.0F, 2, 1, 3, 0.01F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(1.0F, -0.75F, 0.0F);
        this.Upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1745F, -0.4363F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 9, -0.25F, -0.6F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(1.0F, 0.25F, -3.0F);
        this.Upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.8029F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 15, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(1.0F, 0.25F, -3.0F);
        this.Upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.3665F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 7, 31, -1.15F, -1.0F, 1.8F, 2, 1, 2, 0.005F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(-1.0F, -0.75F, 0.0F);
        this.Upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.1745F, 0.4363F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 9, -0.75F, -0.6F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, -0.75F, -3.0F);
        this.Upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2967F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 31, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(-1.0F, 0.25F, -3.0F);
        this.Upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.3665F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 7, 31, -0.85F, -1.0F, 1.8F, 2, 1, 2, 0.005F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(-1.0F, 0.25F, -3.0F);
        this.Upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.8029F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 31, 15, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.UpperArmR = new AdvancedModelRendererExtended(this);
        this.UpperArmR.setRotationPoint(-2.25F, -0.75F, -2.75F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, 0.0873F, 0.9599F, 0.0F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 0, 29, -2.0F, -0.25F, -0.25F, 2, 1, 1, 0.0F, false));

        this.LowerArmR = new AdvancedModelRendererExtended(this);
        this.LowerArmR.setRotationPoint(-2.0F, 0.25F, 0.05F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, 0.0F, -1.0908F, 0.0F);
        this.LowerArmR.cubeList.add(new ModelBox(LowerArmR, 0, 0, -1.5F, -0.5F, -0.5F, 2, 1, 1, -0.01F, false));

        this.HandR = new AdvancedModelRendererExtended(this);
        this.HandR.setRotationPoint(-1.25F, 0.25F, 0.0F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, 0.0F, -0.4363F, 0.0F);
        this.HandR.cubeList.add(new ModelBox(HandR, -3, 35, -1.75F, 0.05F, -1.5F, 2, 0, 3, 0.0F, false));
        this.HandR.cubeList.add(new ModelBox(HandR, 10, 9, -1.75F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));

        this.UpperArmL = new AdvancedModelRendererExtended(this);
        this.UpperArmL.setRotationPoint(2.25F, -0.75F, -2.75F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, 0.0873F, -0.9599F, 0.0F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 0, 29, 0.0F, -0.25F, -0.25F, 2, 1, 1, 0.0F, true));

        this.LowerArmL = new AdvancedModelRendererExtended(this);
        this.LowerArmL.setRotationPoint(2.0F, 0.25F, 0.05F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, 0.0F, 1.0908F, 0.0F);
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 0, 0, -0.5F, -0.5F, -0.5F, 2, 1, 1, -0.01F, true));

        this.HandL = new AdvancedModelRendererExtended(this);
        this.HandL.setRotationPoint(1.25F, 0.25F, 0.0F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.0F, 0.4363F, 0.0F);
        this.HandL.cubeList.add(new ModelBox(HandL, 10, 9, -0.25F, 0.0F, -1.5F, 2, 0, 3, 0.0F, true));
        this.HandL.cubeList.add(new ModelBox(HandL, -3, 35, -0.25F, 0.05F, -1.5F, 2, 0, 3, 0.0F, true));

        this.Tail1 = new AdvancedModelRendererExtended(this);
        this.Tail1.setRotationPoint(0.0F, -1.5F, 12.0F);
        this.Hips.addChild(Tail1);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 12, 18, -1.0F, -1.0F, -0.25F, 2, 2, 5, 0.01F, false));
        this.Tail1.cubeList.add(new ModelBox(Tail1, 26, 28, 0.0F, -2.0F, 1.75F, 0, 4, 3, 0.0F, false));
        this.Tail1.cubeList.add(new ModelBox(Tail1, 0, 0, 0.0F, -1.5F, -0.25F, 0, 3, 2, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 4.75F);
        this.Tail1.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 21, 20, -0.5F, -1.0F, 0.0F, 1, 2, 5, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 20, 0.0F, -2.0F, 0.0F, 0, 4, 5, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 24, 13, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 16, 0.0F, -1.5F, 0.0F, 0, 3, 6, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Body.rotateAngleX = (float) Math.toRadians(20);
        this.setRotateAngle(Chest, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmR, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmL, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.5F, 0.0F, 0.0F);
        this.Body.offsetY = -0.04F;
        this.Body.offsetX = 0.0F;
        this.Body.offsetZ = 0.0F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Hips, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Chest, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Head, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(FootL, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(FootR, 0.0F, -0.5F, 0.0F);
        this.Hips.offsetZ = -0.06F;
        this.Hips.offsetY = 0.05F;
        this.Hips.render(0.01F);
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
        this.resetToDefaultPose();
        this.Hips.offsetY = 0F;

        EntityPrehistoricFloraChunerpeton greer = (EntityPrehistoricFloraChunerpeton) e;

        this.faceTarget(f3, f4, 12, Head);

        float speed = 0.35F;

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3};
        AdvancedModelRenderer[] Torso = {this.Body, this.Chest};
        greer.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] LeftArm = {this.UpperArmL, this.LowerArmL};
        AdvancedModelRenderer[] RightArm = {this.UpperArmR, this.LowerArmR};

        AdvancedModelRenderer[] LeftLeg = {this.UpperLegL, this.LowerLegL};
        AdvancedModelRenderer[] RightLeg = {this.UpperLegR, this.LowerLegR};

        if (greer.isReallyInWater()) { //swim animation
            if(!greer.isAtBottom()) {
                this.setRotateAngle(UpperArmL, (float) Math.toRadians(0), -(float) Math.toRadians(47.5), -(float) Math.toRadians(7.5));
                this.setRotateAngle(UpperArmR, (float) Math.toRadians(0), (float) Math.toRadians(47.5), (float) Math.toRadians(7.5));
                this.setRotateAngle(LowerArmL, -(float) Math.toRadians(0.3472), -(float) Math.toRadians(20.021), -(float) Math.toRadians(-7.3741));
                this.setRotateAngle(LowerArmR, -(float) Math.toRadians(0.3472), (float) Math.toRadians(20.021), -(float) Math.toRadians(-7.3741));
                this.setRotateAngle(UpperLegL, -(float) Math.toRadians(-1.0631), -(float) Math.toRadians(45.0107), -(float) Math.toRadians(6.6325));
                this.setRotateAngle(UpperLegR, -(float) Math.toRadians(-1.0631), (float) Math.toRadians(45.0107), -(float) Math.toRadians(6.6325));
                this.setRotateAngle(LowerLegL, -(float) Math.toRadians(1.8636), -(float) Math.toRadians(25.0156), -(float) Math.toRadians(-1.0555));
                this.setRotateAngle(LowerLegR, -(float) Math.toRadians(1.8636), (float) Math.toRadians(25.0156), -(float) Math.toRadians(-1.0555));
                this.setRotateAngle(FootL, -(float) Math.toRadians(2.7647), -(float) Math.toRadians(-25.0981), -(float) Math.toRadians(-5.4974));
                this.setRotateAngle(FootR, -(float) Math.toRadians(2.7647), (float) Math.toRadians(-25.0981), -(float) Math.toRadians(-5.4974));

                if (f3 == 0.0F || !greer.getIsMoving()) {
                    return;
                }

                this.chainSwingExtended(LeftArm, speed, -0.2F, 0F, 3.0F, f2, 0.7F);
                this.chainSwingExtended(RightArm, speed, 0.2F, 0F, 0, f2, 0.7F);

                this.chainSwingExtended(LeftLeg, speed, 0.2F, 0F, 3.0F, f2, 0.7F);
                this.chainSwingExtended(RightLeg, speed, -0.2F, 0F, 0, f2, 0.7F);

                this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(Tail, speed * 1.2F, 0.3F, -3, f2, 0.8F);
                this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
            } else {//bottom walking
                speed = speed *0.5F;
                if (greer.getIsFast()) {
                    speed = speed * 1.33F;
                }
                if (f3 == 0.0F || !greer.getIsMoving()) {
                    return;
                }
                this.chainSwing(Torso, speed, 0.07F, -3, f2, 1);

                //this.chainSwingExtended(LeftArm, speed, 0.6F,0F,3.0F, f2, 0.7F);
                //this.chainSwingExtended(RightArm, speed, -0.6F,0F,0, f2, 0.7F);
                this.swing(UpperArmL, speed, 0.6F, false, 3.0f, -0, f2, 0.7F);
                this.swing(UpperArmR, speed, -0.6F, false, 0f, -0, f2, 0.7F);
                this.swing(LowerArmL, speed, -0.4F, true, 0f, -0, f2, 0.7F);
                this.swing(LowerArmR, speed, -0.4F, true, 0f, -0, f2, 0.7F);


                this.chainSwingExtended(LeftLeg, speed, 0.4F,0F,3.0F, f2, 0.7F);
                this.chainSwingExtended(RightLeg, speed , -0.4F,0F,0, f2, 0.7F);

                this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(Tail, speed * 0.45F, 0.2F, -3, f2, 0.8F);
                this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
            }


        }
        else {
            speed = speed *0.5F;
            if (greer.getIsFast()) {
                speed = speed * 1.33F;
            }
            if (f3 == 0.0F || !greer.getIsMoving()) {
                return;
            }
            this.chainSwing(Torso, speed, 0.07F, -3, f2, 1);

            //this.chainSwingExtended(LeftArm, speed, 0.6F,0F,3.0F, f2, 0.7F);
            //this.chainSwingExtended(RightArm, speed, -0.6F,0F,0, f2, 0.7F);
            this.swing(UpperArmL, speed, 0.6F, false, 3.0f, -0, f2, 0.7F);
            this.swing(UpperArmR, speed, -0.6F, false, 0f, -0, f2, 0.7F);
            this.swing(LowerArmL, speed, -0.4F, true, 0f, -0, f2, 0.7F);
            this.swing(LowerArmR, speed, -0.4F, true, 0f, -0, f2, 0.7F);


            this.chainSwingExtended(LeftLeg, speed, 0.4F,0F,3.0F, f2, 0.7F);
            this.chainSwingExtended(RightLeg, speed , -0.4F,0F,0, f2, 0.7F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.45F, 0.2F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.Head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.Head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck, (float) Math.toRadians(0), (float) Math.toRadians(25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
