package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEuropasaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEuropasaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer UpperlegR;
    private final AdvancedModelRenderer LowerlegR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer UpperlegL;
    private final AdvancedModelRenderer LowerlegL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Shoulder;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer LowerArmR;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer LowerArmL;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer Neck4;
    private final AdvancedModelRenderer Neck5;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Jaw;

    private ModelAnimator animator;

    public ModelEuropasaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 11.0F, -2.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -13.75F, 14.0F);
        this.Hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6021F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 79, 77, -6.5F, 0.05F, -7.0F, 13, 11, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 33, -7.0F, -10.5F, 0.0F, 14, 11, 15, 0.0F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -11.0F, 14.0F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.3927F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 64, 0, -3.5F, -2.0F, -2.0F, 7, 8, 12, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.5F, 10.0F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1745F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 91, 9, -2.5F, -2.0F, -1.0F, 5, 6, 11, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1309F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 95, 95, -2.0F, -1.75F, -1.0F, 4, 5, 10, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.5F, 9.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0873F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 23, 103, -1.5F, -1.5F, -1.75F, 3, 3, 11, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.1745F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 0, 87, -1.0F, -1.0F, -1.0F, 2, 2, 15, 0.0F, false));

        this.UpperlegR = new AdvancedModelRenderer(this);
        this.UpperlegR.setRotationPoint(-7.0F, -11.75F, 8.5F);
        this.Hips.addChild(UpperlegR);
        this.setRotateAngle(UpperlegR, -0.0873F, 0.0F, 0.0F);
        this.UpperlegR.cubeList.add(new ModelBox(UpperlegR, 71, 95, -2.25F, 0.0F, -3.25F, 6, 15, 6, 0.0F, false));

        this.LowerlegR = new AdvancedModelRenderer(this);
        this.LowerlegR.setRotationPoint(-0.25F, 14.75F, -1.75F);
        this.UpperlegR.addChild(LowerlegR);
        this.setRotateAngle(LowerlegR, 0.3927F, 0.0F, 0.0F);
        this.LowerlegR.cubeList.add(new ModelBox(LowerlegR, 108, 51, -1.5F, 0.0F, -0.85F, 5, 9, 5, 0.0F, false));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.0F, 9.0F, 1.25F);
        this.LowerlegR.addChild(FootR);
        this.setRotateAngle(FootR, -0.3054F, 0.0F, 0.0F);
        this.FootR.cubeList.add(new ModelBox(FootR, 50, 0, -2.0F, -1.0F, -4.25F, 6, 3, 7, 0.0F, false));

        this.UpperlegL = new AdvancedModelRenderer(this);
        this.UpperlegL.setRotationPoint(7.0F, -11.75F, 8.5F);
        this.Hips.addChild(UpperlegL);
        this.setRotateAngle(UpperlegL, -0.0873F, 0.0F, 0.0F);
        this.UpperlegL.cubeList.add(new ModelBox(UpperlegL, 71, 95, -3.75F, 0.0F, -3.25F, 6, 15, 6, 0.0F, true));

        this.LowerlegL = new AdvancedModelRenderer(this);
        this.LowerlegL.setRotationPoint(0.25F, 14.75F, -1.75F);
        this.UpperlegL.addChild(LowerlegL);
        this.setRotateAngle(LowerlegL, 0.3927F, 0.0F, 0.0F);
        this.LowerlegL.cubeList.add(new ModelBox(LowerlegL, 108, 51, -3.5F, 0.0F, -0.85F, 5, 9, 5, 0.0F, true));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 9.0F, 1.25F);
        this.LowerlegL.addChild(FootL);
        this.setRotateAngle(FootL, -0.3054F, 0.0F, 0.0F);
        this.FootL.cubeList.add(new ModelBox(FootL, 50, 0, -4.0F, -1.0F, -4.25F, 6, 3, 7, 0.0F, true));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -10.0F, 5.5F);
        this.Hips.addChild(Body);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 9.25F, -4.25F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 45, -8.5F, -3.9F, -14.0F, 17, 4, 14, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -14.25F, -9.0F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.48F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -9.0F, -0.25F, 1.0F, 18, 19, 14, 0.0F, false));

        this.Shoulder = new AdvancedModelRenderer(this);
        this.Shoulder.setRotationPoint(0.0F, -7.25F, -11.0F);
        this.Body.addChild(Shoulder);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 6.5F, -12.0F);
        this.Shoulder.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.7854F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 74, 63, -6.5F, -4.0F, 0.1F, 13, 4, 8, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -13.25F, -10.0F);
        this.Shoulder.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4363F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 59, -7.0F, 0.75F, 6.6F, 14, 18, 10, 0.0F, false));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-7.0F, 6.75F, -7.0F);
        this.Shoulder.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, 0.1745F, 0.0F, 0.0F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 0, 104, -2.25F, -1.5F, -2.0F, 5, 15, 5, 0.0F, false));

        this.LowerArmR = new AdvancedModelRenderer(this);
        this.LowerArmR.setRotationPoint(-0.5F, 12.5F, 0.75F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, -0.48F, 0.0F, 0.0F);
        this.LowerArmR.cubeList.add(new ModelBox(LowerArmR, 60, 84, -1.25F, 0.15F, -2.0F, 4, 7, 4, 0.0F, false));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, 0.3054F, 0.0F, 0.0F);
        this.HandR.cubeList.add(new ModelBox(HandR, 19, 87, -1.75F, -0.35F, -1.5F, 5, 5, 3, 0.0F, false));
        this.HandR.cubeList.add(new ModelBox(HandR, 77, 117, 2.5F, 3.5F, -0.75F, 2, 1, 1, 0.0F, false));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(7.0F, 6.75F, -7.0F);
        this.Shoulder.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, 0.1745F, 0.0F, 0.0F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 0, 104, -2.75F, -1.5F, -2.0F, 5, 15, 5, 0.0F, true));

        this.LowerArmL = new AdvancedModelRenderer(this);
        this.LowerArmL.setRotationPoint(0.5F, 12.5F, 0.75F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, -0.48F, 0.0F, 0.0F);
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 60, 84, -2.75F, 0.15F, -2.0F, 4, 7, 4, 0.0F, true));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.3054F, 0.0F, 0.0F);
        this.HandL.cubeList.add(new ModelBox(HandL, 19, 87, -3.25F, -0.35F, -1.5F, 5, 5, 3, 0.0F, true));
        this.HandL.cubeList.add(new ModelBox(HandL, 77, 117, -4.5F, 3.5F, -0.75F, 2, 1, 1, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -5.25F, -6.0F);
        this.Shoulder.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.7854F, 0.0F, 0.0F);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 51, 20, -4.0F, -4.5F, -10.0F, 8, 11, 13, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -2.0F, -10.0F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.1745F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 48, 63, -3.5F, -1.75F, -9.0F, 7, 9, 12, 0.0F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.1309F, 0.0F, 0.0F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 37, 84, -3.0F, -1.75F, -9.0F, 6, 8, 11, 0.0F, false));

        this.Neck4 = new AdvancedModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.Neck3.addChild(Neck4);
        this.setRotateAngle(Neck4, -0.0873F, 0.0F, 0.0F);
        this.Neck4.cubeList.add(new ModelBox(Neck4, 92, 34, -2.5F, -1.5F, -9.0F, 5, 7, 10, 0.0F, false));

        this.Neck5 = new AdvancedModelRenderer(this);
        this.Neck5.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.Neck4.addChild(Neck5);
        this.setRotateAngle(Neck5, 0.5672F, 0.0F, 0.0F);
        this.Neck5.cubeList.add(new ModelBox(Neck5, 51, 107, -2.0F, -1.0F, -8.4F, 4, 6, 9, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 1.0F, -8.0F);
        this.Neck5.addChild(Head);
        this.setRotateAngle(Head, 0.6981F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 40, 103, -2.0F, -2.0F, -4.0F, 4, 4, 5, 0.015F, false));
        this.Head.cubeList.add(new ModelBox(Head, 92, 51, -1.5F, 1.0F, -7.5F, 3, 1, 4, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 5, -1.5F, -0.15F, -5.85F, 3, 2, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 39, -1.0F, -2.5F, -4.75F, 2, 4, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 1.0F, -7.5F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.6109F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 10, -1.0F, 0.0F, 0.0F, 3, 1, 2, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -2.5F, -4.75F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5236F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 33, -0.5F, 0.0F, 0.0F, 2, 4, 2, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.0F, -4.0F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.7854F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -1.5F, 0.0F, -2.95F, 3, 2, 3, -0.015F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(-0.5F, 2.0F, -0.5F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 38, 63, -1.5F, 0.0F, -3.5F, 4, 1, 5, 0.015F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 92, 28, -1.0F, -0.01F, -7.0F, 3, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 90, 0, -1.0F, 0.5F, -7.0F, 3, 1, 8, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 80, 26, -1.5F, -1.75F, -3.0F, 4, 2, 4, 0.01F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Neck1.rotateAngleX = (float) Math.toRadians(20);
        this.setRotateAngle(Neck1, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Neck3, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Neck4, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Neck5, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.05F, 0.0F, 0.0F);
        this.Neck1.offsetY = 0.04F;
        this.Neck1.offsetX = 0.0F;
        this.Neck1.offsetZ = 0.0F;
        this.Neck1.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Hips, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, -0.3F, 0.05F, 0.0F);
        this.setRotateAngle(Tail2, 0.15F, 0.09F, 0.0F);
        this.setRotateAngle(Tail3, 0.09F, 0.1F, 0.0F);
        this.setRotateAngle(Tail4, -0.05F, -0.12F, 0.0F);
        this.setRotateAngle(Tail5, -0.09F, -0.15F, 0.0F);
        this.setRotateAngle(UpperlegR, 0.15F, 0.0F, 0.0F);
        this.setRotateAngle(LowerlegR, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(FootR, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(UpperlegL, -0.09F, 0.0F, 0.0F);
        this.setRotateAngle(LowerlegL, 0.09F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, -0.02F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Shoulder, 0.08F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmR, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(LowerArmR, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(HandR, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmL, -0.25F, 0.0F, 0.0F);
        this.setRotateAngle(LowerArmL, -0.28F, 0.0F, 0.0F);
        this.setRotateAngle(HandL, 0.45F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, -0.5F, 0.05F, 0.0F);
        this.setRotateAngle(Neck2, -0.09F, 0.06F, 0.0F);
        this.setRotateAngle(Neck3, -0.09F, 0.07F, 0.0F);
        this.setRotateAngle(Neck4, 0.09F, 0.08F, 0.0F);
        this.setRotateAngle(Neck5, 0.3F, 0.09F, 0.0F);
        this.setRotateAngle(Head, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.3F, 0.0F, 0.0F);
        this.Hips.offsetY = -0.14F;
        this.Hips.render(0.01F);
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
       // this.Hips.offsetY = 0.04F;
        //this.resetToDefaultPose();

        EntityPrehistoricFloraEuropasaurus europa = (EntityPrehistoricFloraEuropasaurus) e;

        this.faceTarget(f3, f4, 6, Neck1);
        this.faceTarget(f3, f4, 6, Neck2);
        this.faceTarget(f3, f4, 6, Neck3);
        this.faceTarget(f3, f4, 4, Neck4);
        this.faceTarget(f3, f4, 4, Head);

        boolean isBaby = europa.getJuvenile();

        if (isBaby) {
            this.Neck4.scaleChildren = true;
            this.Neck5.scaleChildren = true;
            this.Head.scaleChildren = true;
            this.Neck4.setScale(1.175F, 1.175F, 1.175F);
            this.Neck5.setScale(1.175F, 1.175F, 1.175F);
            this.Head.setScale(1.175F, 1.175F, 1.175F);
        }
        else {
            this.Neck4.scaleChildren = true;
            this.Neck5.scaleChildren = true;
            this.Head.scaleChildren = true;
            this.Neck4.setScale(1F, 1, 1F);
            this.Neck5.setScale(1F, 1, 1F);
            this.Head.setScale(1F, 1, 1F);
        }

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        europa.tailBuffer.applyChainSwingBuffer(Tail);

            if (!europa.isReallyInWater()) {

                if (f3 == 0.0F || !europa.getIsMoving()) {
                    if (europa.getAnimation() != europa.EAT_ANIMATION
                        && europa.getAnimation() != europa.DRINK_ANIMATION
                        && europa.getAnimation() != europa.ATTACK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.05F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    if (europa.getAnimation() != europa.ATTACK_ANIMATION) {
                        this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    }

                    return;
                }

                if (europa.getIsFast()) { //Running


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
    


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraEuropasaurus ee = (EntityPrehistoricFloraEuropasaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
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
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LEAF_GRAZE_ANIMATION) { //The noise anim
            animLeafGrazeUpwards(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animLeafGrazeUpwards(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEuropasaurus entity = (EntityPrehistoricFloraEuropasaurus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEuropasaurus entity = (EntityPrehistoricFloraEuropasaurus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/1.5))*-4), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/1.5))*-3));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/1.5))*-4), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/1.5))*-3));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/1.5))*-4), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/1.5))*-3));
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/1.5))*-4), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/1.5))*-3));

        if (tickAnim >= 0 && tickAnim < 44) {
            xx = -5.01368 + (((tickAnim - 0) / 44) * (-5.01368-(-5.01368)));
            yy = 7.4713 + (((tickAnim - 0) / 44) * (7.4713-(7.4713)));
            zz = 0.6574 + (((tickAnim - 0) / 44) * (0.6574-(0.6574)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -5.01368 + (((tickAnim - 44) / 6) * (0.04292-(-5.01368)));
            yy = 7.4713 + (((tickAnim - 44) / 6) * (7.4713-(7.4713)));
            zz = 0.6574 + (((tickAnim - 44) / 6) * (0.6574-(0.6574)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 0.04292 + (((tickAnim - 50) / 6) * (10.04292-(0.04292)));
            yy = 7.4713 + (((tickAnim - 50) / 6) * (7.4713-(7.4713)));
            zz = 0.6574 + (((tickAnim - 50) / 6) * (0.6574-(0.6574)));
        }
        else if (tickAnim >= 56 && tickAnim < 106) {
            xx = 10.04292 + (((tickAnim - 56) / 50) * (10.04292-(10.04292)));
            yy = 7.4713 + (((tickAnim - 56) / 50) * (7.4713-(7.4713)));
            zz = 0.6574 + (((tickAnim - 56) / 50) * (0.6574-(0.6574)));
        }
        else if (tickAnim >= 106 && tickAnim < 111) {
            xx = 10.04292 + (((tickAnim - 106) / 5) * (0.04292-(10.04292)));
            yy = 7.4713 + (((tickAnim - 106) / 5) * (7.4713-(7.4713)));
            zz = 0.6574 + (((tickAnim - 106) / 5) * (0.6574-(0.6574)));
        }
        else if (tickAnim >= 111 && tickAnim < 116) {
            xx = 0.04292 + (((tickAnim - 111) / 5) * (-5.01368-(0.04292)));
            yy = 7.4713 + (((tickAnim - 111) / 5) * (7.4713-(7.4713)));
            zz = 0.6574 + (((tickAnim - 111) / 5) * (0.6574-(0.6574)));
        }
        else if (tickAnim >= 116 && tickAnim < 160) {
            xx = -5.01368 + (((tickAnim - 116) / 44) * (-5.01368-(-5.01368)));
            yy = 7.4713 + (((tickAnim - 116) / 44) * (7.4713-(7.4713)));
            zz = 0.6574 + (((tickAnim - 116) / 44) * (0.6574-(0.6574)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperlegR, UpperlegR.rotateAngleX + (float) Math.toRadians(xx), UpperlegR.rotateAngleY + (float) Math.toRadians(yy), UpperlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = -2.68 + (((tickAnim - 0) / 46) * (-2.68-(-2.68)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 52) {
            xx = -2.68 + (((tickAnim - 46) / 6) * (32-(-2.68)));
            yy = 0 + (((tickAnim - 46) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 6) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
            xx = 32 + (((tickAnim - 52) / 4) * (-7-(32)));
            yy = 0 + (((tickAnim - 52) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 4) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 106) {
            xx = -7 + (((tickAnim - 56) / 50) * (-7-(-7)));
            yy = 0 + (((tickAnim - 56) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 50) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 111) {
            xx = -7 + (((tickAnim - 106) / 5) * (32-(-7)));
            yy = 0 + (((tickAnim - 106) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 5) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 116) {
            xx = 32 + (((tickAnim - 111) / 5) * (-2.68-(32)));
            yy = 0 + (((tickAnim - 111) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 5) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 160) {
            xx = -2.68 + (((tickAnim - 116) / 44) * (-2.68-(-2.68)));
            yy = 0 + (((tickAnim - 116) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerlegR, LowerlegR.rotateAngleX + (float) Math.toRadians(xx), LowerlegR.rotateAngleY + (float) Math.toRadians(yy), LowerlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 8 + (((tickAnim - 0) / 45) * (8-(8)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 8 + (((tickAnim - 45) / 10) * (-3-(8)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 106) {
            xx = -3 + (((tickAnim - 55) / 51) * (-3-(-3)));
            yy = 0 + (((tickAnim - 55) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 51) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 116) {
            xx = -3 + (((tickAnim - 106) / 10) * (8-(-3)));
            yy = 0 + (((tickAnim - 106) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 10) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 160) {
            xx = 8 + (((tickAnim - 116) / 44) * (8-(8)));
            yy = 0 + (((tickAnim - 116) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = -11.5 + (((tickAnim - 0) / 34) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = -11.5 + (((tickAnim - 34) / 7) * (-0.75-(-11.5)));
            yy = 0 + (((tickAnim - 34) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 7) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = -0.75 + (((tickAnim - 41) / 7) * (10.17544-(-0.75)));
            yy = 0 + (((tickAnim - 41) / 7) * (-14.94159-(0)));
            zz = 0 + (((tickAnim - 41) / 7) * (-1.3378-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 110) {
            xx = 10.17544 + (((tickAnim - 48) / 62) * (10.12459-(10.17544)));
            yy = -14.94159 + (((tickAnim - 48) / 62) * (-13.88477-(-14.94159)));
            zz = -1.3378 + (((tickAnim - 48) / 62) * (-1.23818-(-1.3378)));
        }
        else if (tickAnim >= 110 && tickAnim < 148) {
            xx = 10.12459 + (((tickAnim - 110) / 38) * (10.12459-(10.12459)));
            yy = -13.88477 + (((tickAnim - 110) / 38) * (-13.88477-(-13.88477)));
            zz = -1.23818 + (((tickAnim - 110) / 38) * (-1.23818-(-1.23818)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 10.12459 + (((tickAnim - 148) / 12) * (-11.5-(10.12459)));
            yy = -13.88477 + (((tickAnim - 148) / 12) * (0-(-13.88477)));
            zz = -1.23818 + (((tickAnim - 148) / 12) * (0-(-1.23818)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperlegL, UpperlegL.rotateAngleX + (float) Math.toRadians(xx), UpperlegL.rotateAngleY + (float) Math.toRadians(yy), UpperlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = -8 + (((tickAnim - 0) / 34) * (-8-(-8)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = -8 + (((tickAnim - 34) / 7) * (30.5-(-8)));
            yy = 0 + (((tickAnim - 34) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 7) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 30.5 + (((tickAnim - 41) / 7) * (-7-(30.5)));
            yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 110) {
            xx = -7 + (((tickAnim - 48) / 62) * (-7-(-7)));
            yy = 0 + (((tickAnim - 48) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 62) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 148) {
            xx = -7 + (((tickAnim - 110) / 38) * (-7-(-7)));
            yy = 0 + (((tickAnim - 110) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 38) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 154) {
            xx = -7 + (((tickAnim - 148) / 6) * (34.41-(-7)));
            yy = 0 + (((tickAnim - 148) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 6) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 160) {
            xx = 34.41 + (((tickAnim - 154) / 6) * (-8-(34.41)));
            yy = 0 + (((tickAnim - 154) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerlegL, LowerlegL.rotateAngleX + (float) Math.toRadians(xx), LowerlegL.rotateAngleY + (float) Math.toRadians(yy), LowerlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 20 + (((tickAnim - 0) / 34) * (20-(20)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = 20 + (((tickAnim - 34) / 7) * (-12.5-(20)));
            yy = 0 + (((tickAnim - 34) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 7) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = -12.5 + (((tickAnim - 41) / 7) * (-3-(-12.5)));
            yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 110) {
            xx = -3 + (((tickAnim - 48) / 62) * (-3-(-3)));
            yy = 0 + (((tickAnim - 48) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 62) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 148) {
            xx = -3 + (((tickAnim - 110) / 38) * (-3-(-3)));
            yy = 0 + (((tickAnim - 110) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 38) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 154) {
            xx = -3 + (((tickAnim - 148) / 6) * (-7.32-(-3)));
            yy = 0 + (((tickAnim - 148) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 6) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 158) {
            xx = -7.32 + (((tickAnim - 154) / 4) * (-5.81-(-7.32)));
            yy = 0 + (((tickAnim - 154) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 4) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 160) {
            xx = -5.81 + (((tickAnim - 158) / 2) * (20-(-5.81)));
            yy = 0 + (((tickAnim - 158) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0.5 + (((tickAnim - 0) / 50) * (15-(0.5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = 15 + (((tickAnim - 50) / 60) * (15-(15)));
            yy = 0 + (((tickAnim - 50) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 60) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 15 + (((tickAnim - 110) / 50) * (0.5-(15)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -1.5 + (((tickAnim - 0) / 50) * (15-(-1.5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = 15 + (((tickAnim - 50) / 60) * (15-(15)));
            yy = 0 + (((tickAnim - 50) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 60) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 15 + (((tickAnim - 110) / 50) * (-1.5-(15)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Shoulder, Shoulder.rotateAngleX + (float) Math.toRadians(xx), Shoulder.rotateAngleY + (float) Math.toRadians(yy), Shoulder.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -9.5 + (((tickAnim - 0) / 10) * (-1.43047-(-9.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (3.53167-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.32335-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -1.43047 + (((tickAnim - 10) / 13) * (2.37549-(-1.43047)));
            yy = 3.53167 + (((tickAnim - 10) / 13) * (3.70097-(3.53167)));
            zz = 0.32335 + (((tickAnim - 10) / 13) * (0.33885-(0.32335)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 2.37549 + (((tickAnim - 23) / 27) * (-8.85319-(2.37549)));
            yy = 3.70097 + (((tickAnim - 23) / 27) * (3.70097-(3.70097)));
            zz = 0.33885 + (((tickAnim - 23) / 27) * (0.33885-(0.33885)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = -8.85319 + (((tickAnim - 50) / 60) * (-8.85319-(-8.85319)));
            yy = 3.70097 + (((tickAnim - 50) / 60) * (3.70097-(3.70097)));
            zz = 0.33885 + (((tickAnim - 50) / 60) * (0.33885-(0.33885)));
        }
        else if (tickAnim >= 110 && tickAnim < 126) {
            xx = -8.85319 + (((tickAnim - 110) / 16) * (1.14681-(-8.85319)));
            yy = 3.70097 + (((tickAnim - 110) / 16) * (3.70097-(3.70097)));
            zz = 0.33885 + (((tickAnim - 110) / 16) * (0.33885-(0.33885)));
        }
        else if (tickAnim >= 126 && tickAnim < 134) {
            xx = 1.14681 + (((tickAnim - 126) / 8) * (6.10044-(1.14681)));
            yy = 3.70097 + (((tickAnim - 126) / 8) * (3.70097-(3.70097)));
            zz = 0.33885 + (((tickAnim - 126) / 8) * (0.33885-(0.33885)));
        }
        else if (tickAnim >= 134 && tickAnim < 141) {
            xx = 6.10044 + (((tickAnim - 134) / 7) * (-3.77489-(6.10044)));
            yy = 3.70097 + (((tickAnim - 134) / 7) * (2.77573-(3.70097)));
            zz = 0.33885 + (((tickAnim - 134) / 7) * (0.25414-(0.33885)));
        }
        else if (tickAnim >= 141 && tickAnim < 148) {
            xx = -3.77489 + (((tickAnim - 141) / 7) * (-12.68326-(-3.77489)));
            yy = 2.77573 + (((tickAnim - 141) / 7) * (1.85049-(2.77573)));
            zz = 0.25414 + (((tickAnim - 141) / 7) * (0.16943-(0.25414)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = -12.68326 + (((tickAnim - 148) / 12) * (-9.5-(-12.68326)));
            yy = 1.85049 + (((tickAnim - 148) / 12) * (0-(1.85049)));
            zz = 0.16943 + (((tickAnim - 148) / 12) * (0-(0.16943)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 0) / 7) * (-32.05-(1)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -32.05 + (((tickAnim - 7) / 6) * (-42.05-(-32.05)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -42.05 + (((tickAnim - 13) / 5) * (-53-(-42.05)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -53 + (((tickAnim - 18) / 5) * (-42.33-(-53)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = -42.33 + (((tickAnim - 23) / 27) * (-68.33-(-42.33)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = -68.33 + (((tickAnim - 50) / 60) * (-68.33-(-68.33)));
            yy = 0 + (((tickAnim - 50) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 60) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 126) {
            xx = -68.33 + (((tickAnim - 110) / 16) * (-54.33-(-68.33)));
            yy = 0 + (((tickAnim - 110) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 16) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 134) {
            xx = -54.33 + (((tickAnim - 126) / 8) * (-41.33-(-54.33)));
            yy = 0 + (((tickAnim - 126) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 8) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 141) {
            xx = -41.33 + (((tickAnim - 134) / 7) * (-49.5-(-41.33)));
            yy = 0 + (((tickAnim - 134) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 7) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 148) {
            xx = -49.5 + (((tickAnim - 141) / 7) * (-16.67-(-49.5)));
            yy = 0 + (((tickAnim - 141) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 7) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = -16.67 + (((tickAnim - 148) / 12) * (1-(-16.67)));
            yy = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 11 + (((tickAnim - 0) / 7) * (66.74-(11)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 66.74 + (((tickAnim - 7) / 6) * (66.74-(66.74)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 66.74 + (((tickAnim - 13) / 5) * (66-(66.74)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 66 + (((tickAnim - 18) / 5) * (33.5-(66)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 33.5 + (((tickAnim - 23) / 27) * (44.5-(33.5)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = 44.5 + (((tickAnim - 50) / 60) * (44.5-(44.5)));
            yy = 0 + (((tickAnim - 50) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 60) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 126) {
            xx = 44.5 + (((tickAnim - 110) / 16) * (34.5-(44.5)));
            yy = 0 + (((tickAnim - 110) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 16) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 134) {
            xx = 34.5 + (((tickAnim - 126) / 8) * (22.5-(34.5)));
            yy = 0 + (((tickAnim - 126) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 8) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 141) {
            xx = 22.5 + (((tickAnim - 134) / 7) * (71.13-(22.5)));
            yy = 0 + (((tickAnim - 134) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 7) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 148) {
            xx = 71.13 + (((tickAnim - 141) / 7) * (24.09-(71.13)));
            yy = 0 + (((tickAnim - 141) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 7) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 24.09 + (((tickAnim - 148) / 12) * (11-(24.09)));
            yy = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -9.5 + (((tickAnim - 0) / 10) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -9.5 + (((tickAnim - 10) / 13) * (-18.5-(-9.5)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -18.5 + (((tickAnim - 23) / 7) * (-8.90601-(-18.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (-5.47537-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (-0.16269-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -8.90601 + (((tickAnim - 30) / 8) * (-1.46801-(-8.90601)));
            yy = -5.47537 + (((tickAnim - 30) / 8) * (-4.94494-(-5.47537)));
            zz = -0.16269 + (((tickAnim - 30) / 8) * (-0.74089-(-0.16269)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -1.46801 + (((tickAnim - 38) / 12) * (-5.98288-(-1.46801)));
            yy = -4.94494 + (((tickAnim - 38) / 12) * (-4.98455-(-4.94494)));
            zz = -0.74089 + (((tickAnim - 38) / 12) * (-0.39329-(-0.74089)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = -5.98288 + (((tickAnim - 50) / 60) * (-5.48288-(-5.98288)));
            yy = -4.98455 + (((tickAnim - 50) / 60) * (-4.98455-(-4.98455)));
            zz = -0.39329 + (((tickAnim - 50) / 60) * (-0.39329-(-0.39329)));
        }
        else if (tickAnim >= 110 && tickAnim < 117) {
            xx = -5.48288 + (((tickAnim - 110) / 7) * (2.5-(-5.48288)));
            yy = -4.98455 + (((tickAnim - 110) / 7) * (0-(-4.98455)));
            zz = -0.39329 + (((tickAnim - 110) / 7) * (0-(-0.39329)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = 2.5 + (((tickAnim - 117) / 6) * (-19.73-(2.5)));
            yy = 0 + (((tickAnim - 117) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 6) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 132) {
            xx = -19.73 + (((tickAnim - 123) / 9) * (-21.5-(-19.73)));
            yy = 0 + (((tickAnim - 123) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 9) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 160) {
            xx = -21.5 + (((tickAnim - 132) / 28) * (-9.5-(-21.5)));
            yy = 0 + (((tickAnim - 132) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (-10.02-(1)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -10.02 + (((tickAnim - 5) / 5) * (-20.37-(-10.02)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -20.37 + (((tickAnim - 10) / 13) * (-35.04-(-20.37)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -35.04 + (((tickAnim - 23) / 3) * (-50.7-(-35.04)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 37) {
            xx = -50.7 + (((tickAnim - 26) / 11) * (-58.04-(-50.7)));
            yy = 0 + (((tickAnim - 26) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 11) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -58.04 + (((tickAnim - 37) / 13) * (-68.54-(-58.04)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = -68.54 + (((tickAnim - 50) / 60) * (-68.04-(-68.54)));
            yy = 0 + (((tickAnim - 50) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 60) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 117) {
            xx = -68.04 + (((tickAnim - 110) / 7) * (-61.04-(-68.04)));
            yy = 0 + (((tickAnim - 110) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 7) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = -61.04 + (((tickAnim - 117) / 6) * (-55.7-(-61.04)));
            yy = 0 + (((tickAnim - 117) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 6) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 132) {
            xx = -55.7 + (((tickAnim - 123) / 9) * (-42.37-(-55.7)));
            yy = 0 + (((tickAnim - 123) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 9) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 141) {
            xx = -42.37 + (((tickAnim - 132) / 9) * (-30.95-(-42.37)));
            yy = 0 + (((tickAnim - 132) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 9) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 150) {
            xx = -30.95 + (((tickAnim - 141) / 9) * (-17.71-(-30.95)));
            yy = 0 + (((tickAnim - 141) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 9) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -17.71 + (((tickAnim - 150) / 10) * (1-(-17.71)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 3 && tickAnim < 10) {
            xx = 11 + (((tickAnim - 3) / 7) * (23.74-(11)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 23.74 + (((tickAnim - 10) / 13) * (39.56-(23.74)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 39.56 + (((tickAnim - 23) / 3) * (78.35-(39.56)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 37) {
            xx = 78.35 + (((tickAnim - 26) / 11) * (38.56-(78.35)));
            yy = 0 + (((tickAnim - 26) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 11) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 38.56 + (((tickAnim - 37) / 13) * (42.56-(38.56)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = 42.56 + (((tickAnim - 50) / 60) * (41.56-(42.56)));
            yy = 0 + (((tickAnim - 50) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 60) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 117) {
            xx = 41.56 + (((tickAnim - 110) / 7) * (32.56-(41.56)));
            yy = 0 + (((tickAnim - 110) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 7) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = 32.56 + (((tickAnim - 117) / 6) * (78.35-(32.56)));
            yy = 0 + (((tickAnim - 117) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 6) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 132) {
            xx = 78.35 + (((tickAnim - 123) / 9) * (47.74-(78.35)));
            yy = 0 + (((tickAnim - 123) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 9) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 141) {
            xx = 47.74 + (((tickAnim - 132) / 9) * (38.58-(47.74)));
            yy = 0 + (((tickAnim - 132) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 9) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 150) {
            xx = 38.58 + (((tickAnim - 141) / 9) * (28.39-(38.58)));
            yy = 0 + (((tickAnim - 141) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 9) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 28.39 + (((tickAnim - 150) / 10) * (11-(28.39)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 0) / 50) * (29.5-(2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 29.5 + (((tickAnim - 50) / 15) * (36.11324-(29.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1 + (((tickAnim - 50) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1 + (((tickAnim - 50) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1)));
        }
        else if (tickAnim >= 65 && tickAnim < 88) {
            xx = 36.11324 + (((tickAnim - 65) / 23) * (36.11324-(36.11324)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1 + (((tickAnim - 65) / 23) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1 + (((tickAnim - 65) / 23) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1)));
        }
        else if (tickAnim >= 88 && tickAnim < 97) {
            xx = 36.11324 + (((tickAnim - 88) / 9) * (36.11324-(36.11324)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1 + (((tickAnim - 88) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1 + (((tickAnim - 88) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = 36.11324 + (((tickAnim - 97) / 13) * (26.5-(36.11324)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1 + (((tickAnim - 97) / 13) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1 + (((tickAnim - 97) / 13) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 26.5 + (((tickAnim - 110) / 50) * (2.5-(26.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -1 + (((tickAnim - 0) / 50) * (20-(-1)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 20 + (((tickAnim - 50) / 15) * (15-(20)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 88) {
            xx = 15 + (((tickAnim - 65) / 23) * (15-(15)));
            yy = 0 + (((tickAnim - 65) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 23) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 97) {
            xx = 15 + (((tickAnim - 88) / 9) * (15-(15)));
            yy = 0 + (((tickAnim - 88) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 9) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = 15 + (((tickAnim - 97) / 13) * (20-(15)));
            yy = 0 + (((tickAnim - 97) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 13) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 20 + (((tickAnim - 110) / 50) * (-1-(20)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 65) {
            xx = -3.5 + (((tickAnim - 0) / 65) * (8.5-(-3.5)));
            yy = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 65) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 77) {
            xx = 8.5 + (((tickAnim - 65) / 12) * (10-(8.5)));
            yy = 0 + (((tickAnim - 65) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 12) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 88) {
            xx = 10 + (((tickAnim - 77) / 11) * (10-(10)));
            yy = 0 + (((tickAnim - 77) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 11) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 97) {
            xx = 10 + (((tickAnim - 88) / 9) * (10-(10)));
            yy = 0 + (((tickAnim - 88) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 9) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = 10 + (((tickAnim - 97) / 13) * (8.5-(10)));
            yy = 0 + (((tickAnim - 97) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 13) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 8.5 + (((tickAnim - 110) / 50) * (-3.5-(8.5)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 65) {
            xx = 5 + (((tickAnim - 0) / 65) * (15-(5)));
            yy = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 65) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 88) {
            xx = 15 + (((tickAnim - 65) / 23) * (15-(15)));
            yy = 0 + (((tickAnim - 65) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 23) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 97) {
            xx = 15 + (((tickAnim - 88) / 9) * (15-(15)));
            yy = 0 + (((tickAnim - 88) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 9) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = 15 + (((tickAnim - 97) / 13) * (23-(15)));
            yy = 0 + (((tickAnim - 97) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 13) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 23 + (((tickAnim - 110) / 50) * (5-(23)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 65) {
            xx = 0.5 + (((tickAnim - 0) / 65) * (-18.5-(0.5)));
            yy = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 65) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 88) {
            xx = -18.5 + (((tickAnim - 65) / 23) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 65) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 23) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 97) {
            xx = -18.5 + (((tickAnim - 88) / 9) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 88) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 9) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = -18.5 + (((tickAnim - 97) / 13) * (-11.5-(-18.5)));
            yy = 0 + (((tickAnim - 97) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 13) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = -11.5 + (((tickAnim - 110) / 50) * (0.5-(-11.5)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(xx), Neck5.rotateAngleY + (float) Math.toRadians(yy), Neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-41.07-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 98) {
            xx = -41.07 + (((tickAnim - 50) / 48) * (-41.07-(-41.07)));
            yy = 0 + (((tickAnim - 50) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 48) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 160) {
            xx = -41.07 + (((tickAnim - 98) / 62) * (0-(-41.07)));
            yy = 0 + (((tickAnim - 98) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 62) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 60 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 60) / 27) * (21-(0)));
            yy = 0 + (((tickAnim - 60) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 27) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 98) {
            xx = 21 + (((tickAnim - 87) / 11) * (0-(21)));
            yy = 0 + (((tickAnim - 87) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEuropasaurus entity = (EntityPrehistoricFloraEuropasaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-3-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-4 + (((tickAnim - 15) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-3 + (((tickAnim - 15) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 21) / 29) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 21) / 29) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 21) / 29) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 21) / 29) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 21) / 29) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 21) / 29) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 21) / 29) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 21) / 29) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 21) / 29) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 21) / 29) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 21) / 29) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 21) / 29) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 3) / 22) * (15-(0)));
            yy = 0 + (((tickAnim - 3) / 22) * (-11-(0)));
            zz = 0 + (((tickAnim - 3) / 22) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 15 + (((tickAnim - 25) / 25) * (0-(15)));
            yy = -11 + (((tickAnim - 25) / 25) * (0-(-11)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperlegL, UpperlegL.rotateAngleX + (float) Math.toRadians(xx), UpperlegL.rotateAngleY + (float) Math.toRadians(yy), UpperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 3) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 6) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.3 + (((tickAnim - 9) / 4) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 13) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperlegL.rotationPointX = this.UpperlegL.rotationPointX + (float)(xx);
        this.UpperlegL.rotationPointY = this.UpperlegL.rotationPointY - (float)(yy);
        this.UpperlegL.rotationPointZ = this.UpperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 3) / 22) * (16-(0)));
            yy = 0 + (((tickAnim - 3) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 22) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 16 + (((tickAnim - 25) / 12) * (30.98-(16)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 30.98 + (((tickAnim - 37) / 13) * (0-(30.98)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerlegL, LowerlegL.rotateAngleX + (float) Math.toRadians(xx), LowerlegL.rotateAngleY + (float) Math.toRadians(yy), LowerlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 3) / 22) * (22-(0)));
            yy = 0 + (((tickAnim - 3) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 22) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 22 + (((tickAnim - 25) / 12) * (-11.02-(22)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -11.02 + (((tickAnim - 37) / 13) * (0-(-11.02)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(xx), Neck5.rotateAngleY + (float) Math.toRadians(yy), Neck5.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEuropasaurus entity = (EntityPrehistoricFloraEuropasaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -9 + (((tickAnim - 18) / 15) * (-9-(-9)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -9 + (((tickAnim - 33) / 17) * (0-(-9)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-2-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (2.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -2 + (((tickAnim - 18) / 15) * (-2-(-2)));
            zz = 2.5 + (((tickAnim - 18) / 15) * (2.5-(2.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -2 + (((tickAnim - 33) / 17) * (0-(-2)));
            zz = 2.5 + (((tickAnim - 33) / 17) * (0-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 10 + (((tickAnim - 18) / 15) * (10-(10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 33) / 17) * (0-(10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 17 + (((tickAnim - 18) / 15) * (17-(17)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 33) / 17) * (0-(17)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -4 + (((tickAnim - 8) / 10) * (-10-(-4)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -10 + (((tickAnim - 18) / 15) * (-10-(-10)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 33) / 17) * (0-(-10)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperlegR, UpperlegR.rotateAngleX + (float) Math.toRadians(xx), UpperlegR.rotateAngleY + (float) Math.toRadians(yy), UpperlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 16 + (((tickAnim - 8) / 4) * (28-(16)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 28 + (((tickAnim - 12) / 6) * (38-(28)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 38 + (((tickAnim - 18) / 15) * (38-(38)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 38 + (((tickAnim - 33) / 17) * (0-(38)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerlegR, LowerlegR.rotateAngleX + (float) Math.toRadians(xx), LowerlegR.rotateAngleY + (float) Math.toRadians(yy), LowerlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -9 + (((tickAnim - 8) / 4) * (-15-(-9)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -15 + (((tickAnim - 12) / 6) * (-19-(-15)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -19 + (((tickAnim - 18) / 15) * (-19-(-19)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -19 + (((tickAnim - 33) / 17) * (0-(-19)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -4 + (((tickAnim - 8) / 10) * (-10-(-4)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -10 + (((tickAnim - 18) / 15) * (-10-(-10)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 33) / 17) * (0-(-10)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperlegL, UpperlegL.rotateAngleX + (float) Math.toRadians(xx), UpperlegL.rotateAngleY + (float) Math.toRadians(yy), UpperlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 16 + (((tickAnim - 8) / 4) * (28-(16)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 28 + (((tickAnim - 12) / 6) * (38-(28)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 38 + (((tickAnim - 18) / 15) * (38-(38)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 38 + (((tickAnim - 33) / 17) * (0-(38)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerlegL, LowerlegL.rotateAngleX + (float) Math.toRadians(xx), LowerlegL.rotateAngleY + (float) Math.toRadians(yy), LowerlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -9 + (((tickAnim - 8) / 4) * (-15-(-9)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -15 + (((tickAnim - 12) / 6) * (-19-(-15)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -19 + (((tickAnim - 18) / 15) * (-19-(-19)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -19 + (((tickAnim - 33) / 17) * (0-(-19)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Shoulder, Shoulder.rotateAngleX + (float) Math.toRadians(xx), Shoulder.rotateAngleY + (float) Math.toRadians(yy), Shoulder.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (13-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 41) {
            xx = 13 + (((tickAnim - 13) / 28) * (13-(13)));
            yy = 0 + (((tickAnim - 13) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 28) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 13 + (((tickAnim - 41) / 9) * (0-(13)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -5 + (((tickAnim - 8) / 5) * (-24-(-5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -24 + (((tickAnim - 13) / 5) * (3-(-24)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 41) {
            xx = 3 + (((tickAnim - 18) / 23) * (3-(3)));
            yy = 0 + (((tickAnim - 18) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 23) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 3 + (((tickAnim - 41) / 5) * (-20.33-(3)));
            yy = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -20.33 + (((tickAnim - 46) / 4) * (0-(-20.33)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 14 + (((tickAnim - 8) / 5) * (35-(14)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 35 + (((tickAnim - 13) / 5) * (-8-(35)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 41) {
            xx = -8 + (((tickAnim - 18) / 23) * (-8-(-8)));
            yy = 0 + (((tickAnim - 18) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 23) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = -8 + (((tickAnim - 41) / 5) * (41.22-(-8)));
            yy = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 41.22 + (((tickAnim - 46) / 4) * (0-(41.22)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 13 + (((tickAnim - 8) / 5) * (13-(13)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 13 + (((tickAnim - 13) / 20) * (13-(13)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 13 + (((tickAnim - 33) / 8) * (0-(13)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -17.5 + (((tickAnim - 7) / 4) * (3-(-17.5)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 11) / 22) * (3-(3)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 3 + (((tickAnim - 33) / 4) * (-20-(3)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = -20 + (((tickAnim - 37) / 4) * (0-(-20)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (37-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 37 + (((tickAnim - 7) / 4) * (-8-(37)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 33) {
            xx = -8 + (((tickAnim - 11) / 22) * (-8-(-8)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -8 + (((tickAnim - 33) / 4) * (45.33-(-8)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 45.33 + (((tickAnim - 37) / 4) * (0-(45.33)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (12.98791-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-25.49175-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 12.98791 + (((tickAnim - 18) / 14) * (12.98791-(12.98791)));
            yy = -25.49175 + (((tickAnim - 18) / 14) * (-25.49175-(-25.49175)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 18) / 14) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 12.98791 + (((tickAnim - 32) / 18) * (0-(12.98791)));
            yy = -25.49175 + (((tickAnim - 32) / 18) * (0-(-25.49175)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 32) / 18) * (0-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0.9136-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-13.25655-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0.9136 + (((tickAnim - 18) / 14) * (0.9136-(0.9136)));
            yy = -13.25655 + (((tickAnim - 18) / 14) * (-13.25655-(-13.25655)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 18) / 14) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0.9136 + (((tickAnim - 32) / 18) * (0-(0.9136)));
            yy = -13.25655 + (((tickAnim - 32) / 18) * (0-(-13.25655)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 32) / 18) * (0-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.13873-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-10.90474-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -0.13873 + (((tickAnim - 18) / 14) * (-0.13873-(-0.13873)));
            yy = -10.90474 + (((tickAnim - 18) / 14) * (-10.90474-(-10.90474)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 18) / 14) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -0.13873 + (((tickAnim - 32) / 18) * (0-(-0.13873)));
            yy = -10.90474 + (((tickAnim - 32) / 18) * (0-(-10.90474)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 32) / 18) * (0-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.42932-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-22.90748-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -0.42932 + (((tickAnim - 18) / 14) * (-0.42932-(-0.42932)));
            yy = -22.90748 + (((tickAnim - 18) / 14) * (-22.90748-(-22.90748)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 18) / 14) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -0.42932 + (((tickAnim - 32) / 18) * (0-(-0.42932)));
            yy = -22.90748 + (((tickAnim - 32) / 18) * (0-(-22.90748)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 32) / 18) * (0-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0.68717-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-3.65616-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0.68717 + (((tickAnim - 18) / 14) * (0.68717-(0.68717)));
            yy = -3.65616 + (((tickAnim - 18) / 14) * (-3.65616-(-3.65616)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 18) / 14) * (-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0.68717 + (((tickAnim - 32) / 18) * (0-(0.68717)));
            yy = -3.65616 + (((tickAnim - 32) / 18) * (0-(-3.65616)));
            zz = -6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 32) / 18) * (0-(-6.7546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(xx), Neck5.rotateAngleY + (float) Math.toRadians(yy), Neck5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEuropasaurus entity = (EntityPrehistoricFloraEuropasaurus) entitylivingbaseIn;
            int animCycle = 140;
            double tickAnim = animTick + partialTickTime;
            double xx = 0;
            double yy = 0;
            double zz = 0;


            this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/1.5))*-4), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/1.5))*-3));


            this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/1.5))*-4), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/1.5))*-3));


            this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/1.5))*-4), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/1.5))*-3));


            this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/1.5))*-4), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/1.5))*-3));



            if (tickAnim >= 0 && tickAnim < 44) {
                xx = -5.01368 + (((tickAnim - 0) / 44) * (-5.01368-(-5.01368)));
                yy = 7.4713 + (((tickAnim - 0) / 44) * (7.4713-(7.4713)));
                zz = 0.6574 + (((tickAnim - 0) / 44) * (0.6574-(0.6574)));
            }
            else if (tickAnim >= 44 && tickAnim < 50) {
                xx = -5.01368 + (((tickAnim - 44) / 6) * (0.04292-(-5.01368)));
                yy = 7.4713 + (((tickAnim - 44) / 6) * (7.4713-(7.4713)));
                zz = 0.6574 + (((tickAnim - 44) / 6) * (0.6574-(0.6574)));
            }
            else if (tickAnim >= 50 && tickAnim < 56) {
                xx = 0.04292 + (((tickAnim - 50) / 6) * (10.04292-(0.04292)));
                yy = 7.4713 + (((tickAnim - 50) / 6) * (7.4713-(7.4713)));
                zz = 0.6574 + (((tickAnim - 50) / 6) * (0.6574-(0.6574)));
            }
            else if (tickAnim >= 56 && tickAnim < 86) {
                xx = 10.04292 + (((tickAnim - 56) / 30) * (10.04292-(10.04292)));
                yy = 7.4713 + (((tickAnim - 56) / 30) * (7.4713-(7.4713)));
                zz = 0.6574 + (((tickAnim - 56) / 30) * (0.6574-(0.6574)));
            }
            else if (tickAnim >= 86 && tickAnim < 91) {
                xx = 10.04292 + (((tickAnim - 86) / 5) * (0.04292-(10.04292)));
                yy = 7.4713 + (((tickAnim - 86) / 5) * (7.4713-(7.4713)));
                zz = 0.6574 + (((tickAnim - 86) / 5) * (0.6574-(0.6574)));
            }
            else if (tickAnim >= 91 && tickAnim < 96) {
                xx = 0.04292 + (((tickAnim - 91) / 5) * (-5.01368-(0.04292)));
                yy = 7.4713 + (((tickAnim - 91) / 5) * (7.4713-(7.4713)));
                zz = 0.6574 + (((tickAnim - 91) / 5) * (0.6574-(0.6574)));
            }
            else if (tickAnim >= 96 && tickAnim < 140) {
                xx = -5.01368 + (((tickAnim - 96) / 44) * (-5.01368-(-5.01368)));
                yy = 7.4713 + (((tickAnim - 96) / 44) * (7.4713-(7.4713)));
                zz = 0.6574 + (((tickAnim - 96) / 44) * (0.6574-(0.6574)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(UpperlegR, UpperlegR.rotateAngleX + (float) Math.toRadians(xx), UpperlegR.rotateAngleY + (float) Math.toRadians(yy), UpperlegR.rotateAngleZ + (float) Math.toRadians(zz));




            if (tickAnim >= 0 && tickAnim < 46) {
                xx = -2.68 + (((tickAnim - 0) / 46) * (-2.68-(-2.68)));
                yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
                zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            }
            else if (tickAnim >= 46 && tickAnim < 52) {
                xx = -2.68 + (((tickAnim - 46) / 6) * (32-(-2.68)));
                yy = 0 + (((tickAnim - 46) / 6) * (0-(0)));
                zz = 0 + (((tickAnim - 46) / 6) * (0-(0)));
            }
            else if (tickAnim >= 52 && tickAnim < 58) {
                xx = 32 + (((tickAnim - 52) / 6) * (-7-(32)));
                yy = 0 + (((tickAnim - 52) / 6) * (0-(0)));
                zz = 0 + (((tickAnim - 52) / 6) * (0-(0)));
            }
            else if (tickAnim >= 58 && tickAnim < 86) {
                xx = -7 + (((tickAnim - 58) / 28) * (-7-(-7)));
                yy = 0 + (((tickAnim - 58) / 28) * (0-(0)));
                zz = 0 + (((tickAnim - 58) / 28) * (0-(0)));
            }
            else if (tickAnim >= 86 && tickAnim < 91) {
                xx = -7 + (((tickAnim - 86) / 5) * (32-(-7)));
                yy = 0 + (((tickAnim - 86) / 5) * (0-(0)));
                zz = 0 + (((tickAnim - 86) / 5) * (0-(0)));
            }
            else if (tickAnim >= 91 && tickAnim < 96) {
                xx = 32 + (((tickAnim - 91) / 5) * (-2.68-(32)));
                yy = 0 + (((tickAnim - 91) / 5) * (0-(0)));
                zz = 0 + (((tickAnim - 91) / 5) * (0-(0)));
            }
            else if (tickAnim >= 96 && tickAnim < 140) {
                xx = -2.68 + (((tickAnim - 96) / 44) * (-2.68-(-2.68)));
                yy = 0 + (((tickAnim - 96) / 44) * (0-(0)));
                zz = 0 + (((tickAnim - 96) / 44) * (0-(0)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(LowerlegR, LowerlegR.rotateAngleX + (float) Math.toRadians(xx), LowerlegR.rotateAngleY + (float) Math.toRadians(yy), LowerlegR.rotateAngleZ + (float) Math.toRadians(zz));




            if (tickAnim >= 0 && tickAnim < 45) {
                xx = 8 + (((tickAnim - 0) / 45) * (8-(8)));
                yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
                zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            }
            else if (tickAnim >= 45 && tickAnim < 55) {
                xx = 8 + (((tickAnim - 45) / 10) * (-3-(8)));
                yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
                zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            }
            else if (tickAnim >= 55 && tickAnim < 86) {
                xx = -3 + (((tickAnim - 55) / 31) * (-3-(-3)));
                yy = 0 + (((tickAnim - 55) / 31) * (0-(0)));
                zz = 0 + (((tickAnim - 55) / 31) * (0-(0)));
            }
            else if (tickAnim >= 86 && tickAnim < 96) {
                xx = -3 + (((tickAnim - 86) / 10) * (8-(-3)));
                yy = 0 + (((tickAnim - 86) / 10) * (0-(0)));
                zz = 0 + (((tickAnim - 86) / 10) * (0-(0)));
            }
            else if (tickAnim >= 96 && tickAnim < 140) {
                xx = 8 + (((tickAnim - 96) / 44) * (8-(8)));
                yy = 0 + (((tickAnim - 96) / 44) * (0-(0)));
                zz = 0 + (((tickAnim - 96) / 44) * (0-(0)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




            if (tickAnim >= 0 && tickAnim < 34) {
                xx = -11.5 + (((tickAnim - 0) / 34) * (-11.5-(-11.5)));
                yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
                zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            }
            else if (tickAnim >= 34 && tickAnim < 41) {
                xx = -11.5 + (((tickAnim - 34) / 7) * (-0.75-(-11.5)));
                yy = 0 + (((tickAnim - 34) / 7) * (0-(0)));
                zz = 0 + (((tickAnim - 34) / 7) * (0-(0)));
            }
            else if (tickAnim >= 41 && tickAnim < 48) {
                xx = -0.75 + (((tickAnim - 41) / 7) * (10.17544-(-0.75)));
                yy = 0 + (((tickAnim - 41) / 7) * (-14.94159-(0)));
                zz = 0 + (((tickAnim - 41) / 7) * (-1.3378-(0)));
            }
            else if (tickAnim >= 48 && tickAnim < 90) {
                xx = 10.17544 + (((tickAnim - 48) / 42) * (10.12459-(10.17544)));
                yy = -14.94159 + (((tickAnim - 48) / 42) * (-13.88477-(-14.94159)));
                zz = -1.3378 + (((tickAnim - 48) / 42) * (-1.23818-(-1.3378)));
            }
            else if (tickAnim >= 90 && tickAnim < 128) {
                xx = 10.12459 + (((tickAnim - 90) / 38) * (10.12459-(10.12459)));
                yy = -13.88477 + (((tickAnim - 90) / 38) * (-13.88477-(-13.88477)));
                zz = -1.23818 + (((tickAnim - 90) / 38) * (-1.23818-(-1.23818)));
            }
            else if (tickAnim >= 128 && tickAnim < 140) {
                xx = 10.12459 + (((tickAnim - 128) / 12) * (-11.5-(10.12459)));
                yy = -13.88477 + (((tickAnim - 128) / 12) * (0-(-13.88477)));
                zz = -1.23818 + (((tickAnim - 128) / 12) * (0-(-1.23818)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(UpperlegL, UpperlegL.rotateAngleX + (float) Math.toRadians(xx), UpperlegL.rotateAngleY + (float) Math.toRadians(yy), UpperlegL.rotateAngleZ + (float) Math.toRadians(zz));




            if (tickAnim >= 0 && tickAnim < 34) {
                xx = -8 + (((tickAnim - 0) / 34) * (-8-(-8)));
                yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
                zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            }
            else if (tickAnim >= 34 && tickAnim < 41) {
                xx = -8 + (((tickAnim - 34) / 7) * (30.5-(-8)));
                yy = 0 + (((tickAnim - 34) / 7) * (0-(0)));
                zz = 0 + (((tickAnim - 34) / 7) * (0-(0)));
            }
            else if (tickAnim >= 41 && tickAnim < 48) {
                xx = 30.5 + (((tickAnim - 41) / 7) * (-7-(30.5)));
                yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
                zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            }
            else if (tickAnim >= 48 && tickAnim < 90) {
                xx = -7 + (((tickAnim - 48) / 42) * (-7-(-7)));
                yy = 0 + (((tickAnim - 48) / 42) * (0-(0)));
                zz = 0 + (((tickAnim - 48) / 42) * (0-(0)));
            }
            else if (tickAnim >= 90 && tickAnim < 128) {
                xx = -7 + (((tickAnim - 90) / 38) * (-7-(-7)));
                yy = 0 + (((tickAnim - 90) / 38) * (0-(0)));
                zz = 0 + (((tickAnim - 90) / 38) * (0-(0)));
            }
            else if (tickAnim >= 128 && tickAnim < 134) {
                xx = -7 + (((tickAnim - 128) / 6) * (34.41-(-7)));
                yy = 0 + (((tickAnim - 128) / 6) * (0-(0)));
                zz = 0 + (((tickAnim - 128) / 6) * (0-(0)));
            }
            else if (tickAnim >= 134 && tickAnim < 140) {
                xx = 34.41 + (((tickAnim - 134) / 6) * (-8-(34.41)));
                yy = 0 + (((tickAnim - 134) / 6) * (0-(0)));
                zz = 0 + (((tickAnim - 134) / 6) * (0-(0)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(LowerlegL, LowerlegL.rotateAngleX + (float) Math.toRadians(xx), LowerlegL.rotateAngleY + (float) Math.toRadians(yy), LowerlegL.rotateAngleZ + (float) Math.toRadians(zz));




            if (tickAnim >= 0 && tickAnim < 34) {
                xx = 20 + (((tickAnim - 0) / 34) * (20-(20)));
                yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
                zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            }
            else if (tickAnim >= 34 && tickAnim < 41) {
                xx = 20 + (((tickAnim - 34) / 7) * (-12.5-(20)));
                yy = 0 + (((tickAnim - 34) / 7) * (0-(0)));
                zz = 0 + (((tickAnim - 34) / 7) * (0-(0)));
            }
            else if (tickAnim >= 41 && tickAnim < 48) {
                xx = -12.5 + (((tickAnim - 41) / 7) * (-3-(-12.5)));
                yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
                zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            }
            else if (tickAnim >= 48 && tickAnim < 90) {
                xx = -3 + (((tickAnim - 48) / 42) * (-3-(-3)));
                yy = 0 + (((tickAnim - 48) / 42) * (0-(0)));
                zz = 0 + (((tickAnim - 48) / 42) * (0-(0)));
            }
            else if (tickAnim >= 90 && tickAnim < 128) {
                xx = -3 + (((tickAnim - 90) / 38) * (-3-(-3)));
                yy = 0 + (((tickAnim - 90) / 38) * (0-(0)));
                zz = 0 + (((tickAnim - 90) / 38) * (0-(0)));
            }
            else if (tickAnim >= 128 && tickAnim < 134) {
                xx = -3 + (((tickAnim - 128) / 6) * (-7.32-(-3)));
                yy = 0 + (((tickAnim - 128) / 6) * (0-(0)));
                zz = 0 + (((tickAnim - 128) / 6) * (0-(0)));
            }
            else if (tickAnim >= 134 && tickAnim < 138) {
                xx = -7.32 + (((tickAnim - 134) / 4) * (-5.81-(-7.32)));
                yy = 0 + (((tickAnim - 134) / 4) * (0-(0)));
                zz = 0 + (((tickAnim - 134) / 4) * (0-(0)));
            }
            else if (tickAnim >= 138 && tickAnim < 140) {
                xx = -5.81 + (((tickAnim - 138) / 2) * (20-(-5.81)));
                yy = 0 + (((tickAnim - 138) / 2) * (0-(0)));
                zz = 0 + (((tickAnim - 138) / 2) * (0-(0)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




            if (tickAnim >= 0 && tickAnim < 50) {
                xx = 0.5 + (((tickAnim - 0) / 50) * (15-(0.5)));
                yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
                zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            }
            else if (tickAnim >= 50 && tickAnim < 90) {
                xx = 15 + (((tickAnim - 50) / 40) * (15-(15)));
                yy = 0 + (((tickAnim - 50) / 40) * (0-(0)));
                zz = 0 + (((tickAnim - 50) / 40) * (0-(0)));
            }
            else if (tickAnim >= 90 && tickAnim < 140) {
                xx = 15 + (((tickAnim - 90) / 50) * (0.5-(15)));
                yy = 0 + (((tickAnim - 90) / 50) * (0-(0)));
                zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




            if (tickAnim >= 0 && tickAnim < 50) {
                xx = -1.5 + (((tickAnim - 0) / 50) * (15-(-1.5)));
                yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
                zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            }
            else if (tickAnim >= 50 && tickAnim < 90) {
                xx = 15 + (((tickAnim - 50) / 40) * (15-(15)));
                yy = 0 + (((tickAnim - 50) / 40) * (0-(0)));
                zz = 0 + (((tickAnim - 50) / 40) * (0-(0)));
            }
            else if (tickAnim >= 90 && tickAnim < 140) {
                xx = 15 + (((tickAnim - 90) / 50) * (-1.5-(15)));
                yy = 0 + (((tickAnim - 90) / 50) * (0-(0)));
                zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(Shoulder, Shoulder.rotateAngleX + (float) Math.toRadians(xx), Shoulder.rotateAngleY + (float) Math.toRadians(yy), Shoulder.rotateAngleZ + (float) Math.toRadians(zz));




            if (tickAnim >= 0 && tickAnim < 10) {
                xx = -9.5 + (((tickAnim - 0) / 10) * (-1.43047-(-9.5)));
                yy = 0 + (((tickAnim - 0) / 10) * (3.53167-(0)));
                zz = 0 + (((tickAnim - 0) / 10) * (0.32335-(0)));
            }
            else if (tickAnim >= 10 && tickAnim < 23) {
                xx = -1.43047 + (((tickAnim - 10) / 13) * (2.37549-(-1.43047)));
                yy = 3.53167 + (((tickAnim - 10) / 13) * (3.70097-(3.53167)));
                zz = 0.32335 + (((tickAnim - 10) / 13) * (0.33885-(0.32335)));
            }
            else if (tickAnim >= 23 && tickAnim < 50) {
                xx = 2.37549 + (((tickAnim - 23) / 27) * (-8.85319-(2.37549)));
                yy = 3.70097 + (((tickAnim - 23) / 27) * (3.70097-(3.70097)));
                zz = 0.33885 + (((tickAnim - 23) / 27) * (0.33885-(0.33885)));
            }
            else if (tickAnim >= 50 && tickAnim < 90) {
                xx = -8.85319 + (((tickAnim - 50) / 40) * (-8.85319-(-8.85319)));
                yy = 3.70097 + (((tickAnim - 50) / 40) * (3.70097-(3.70097)));
                zz = 0.33885 + (((tickAnim - 50) / 40) * (0.33885-(0.33885)));
            }
            else if (tickAnim >= 90 && tickAnim < 106) {
                xx = -8.85319 + (((tickAnim - 90) / 16) * (1.14681-(-8.85319)));
                yy = 3.70097 + (((tickAnim - 90) / 16) * (3.70097-(3.70097)));
                zz = 0.33885 + (((tickAnim - 90) / 16) * (0.33885-(0.33885)));
            }
            else if (tickAnim >= 106 && tickAnim < 114) {
                xx = 1.14681 + (((tickAnim - 106) / 8) * (6.10044-(1.14681)));
                yy = 3.70097 + (((tickAnim - 106) / 8) * (3.70097-(3.70097)));
                zz = 0.33885 + (((tickAnim - 106) / 8) * (0.33885-(0.33885)));
            }
            else if (tickAnim >= 114 && tickAnim < 121) {
                xx = 6.10044 + (((tickAnim - 114) / 7) * (-3.77489-(6.10044)));
                yy = 3.70097 + (((tickAnim - 114) / 7) * (2.77573-(3.70097)));
                zz = 0.33885 + (((tickAnim - 114) / 7) * (0.25414-(0.33885)));
            }
            else if (tickAnim >= 121 && tickAnim < 128) {
                xx = -3.77489 + (((tickAnim - 121) / 7) * (-12.68326-(-3.77489)));
                yy = 2.77573 + (((tickAnim - 121) / 7) * (1.85049-(2.77573)));
                zz = 0.25414 + (((tickAnim - 121) / 7) * (0.16943-(0.25414)));
            }
            else if (tickAnim >= 128 && tickAnim < 140) {
                xx = -12.68326 + (((tickAnim - 128) / 12) * (-9.5-(-12.68326)));
                yy = 1.85049 + (((tickAnim - 128) / 12) * (0-(1.85049)));
                zz = 0.16943 + (((tickAnim - 128) / 12) * (0-(0.16943)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




            if (tickAnim >= 0 && tickAnim < 7) {
                xx = 1 + (((tickAnim - 0) / 7) * (-32.05-(1)));
                yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
                zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            }
            else if (tickAnim >= 7 && tickAnim < 13) {
                xx = -32.05 + (((tickAnim - 7) / 6) * (-42.05-(-32.05)));
                yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
                zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            }
            else if (tickAnim >= 13 && tickAnim < 18) {
                xx = -42.05 + (((tickAnim - 13) / 5) * (-53-(-42.05)));
                yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
                zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            }
            else if (tickAnim >= 18 && tickAnim < 23) {
                xx = -53 + (((tickAnim - 18) / 5) * (-42.33-(-53)));
                yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
                zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            }
            else if (tickAnim >= 23 && tickAnim < 50) {
                xx = -42.33 + (((tickAnim - 23) / 27) * (-68.33-(-42.33)));
                yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
                zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            }
            else if (tickAnim >= 50 && tickAnim < 90) {
                xx = -68.33 + (((tickAnim - 50) / 40) * (-68.33-(-68.33)));
                yy = 0 + (((tickAnim - 50) / 40) * (0-(0)));
                zz = 0 + (((tickAnim - 50) / 40) * (0-(0)));
            }
            else if (tickAnim >= 90 && tickAnim < 106) {
                xx = -68.33 + (((tickAnim - 90) / 16) * (-54.33-(-68.33)));
                yy = 0 + (((tickAnim - 90) / 16) * (0-(0)));
                zz = 0 + (((tickAnim - 90) / 16) * (0-(0)));
            }
            else if (tickAnim >= 106 && tickAnim < 114) {
                xx = -54.33 + (((tickAnim - 106) / 8) * (-41.33-(-54.33)));
                yy = 0 + (((tickAnim - 106) / 8) * (0-(0)));
                zz = 0 + (((tickAnim - 106) / 8) * (0-(0)));
            }
            else if (tickAnim >= 114 && tickAnim < 121) {
                xx = -41.33 + (((tickAnim - 114) / 7) * (-49.5-(-41.33)));
                yy = 0 + (((tickAnim - 114) / 7) * (0-(0)));
                zz = 0 + (((tickAnim - 114) / 7) * (0-(0)));
            }
            else if (tickAnim >= 121 && tickAnim < 128) {
                xx = -49.5 + (((tickAnim - 121) / 7) * (-16.67-(-49.5)));
                yy = 0 + (((tickAnim - 121) / 7) * (0-(0)));
                zz = 0 + (((tickAnim - 121) / 7) * (0-(0)));
            }
            else if (tickAnim >= 128 && tickAnim < 140) {
                xx = -16.67 + (((tickAnim - 128) / 12) * (1-(-16.67)));
                yy = 0 + (((tickAnim - 128) / 12) * (0-(0)));
                zz = 0 + (((tickAnim - 128) / 12) * (0-(0)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




            if (tickAnim >= 0 && tickAnim < 7) {
                xx = 11 + (((tickAnim - 0) / 7) * (66.74-(11)));
                yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
                zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            }
            else if (tickAnim >= 7 && tickAnim < 13) {
                xx = 66.74 + (((tickAnim - 7) / 6) * (66.74-(66.74)));
                yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
                zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            }
            else if (tickAnim >= 13 && tickAnim < 18) {
                xx = 66.74 + (((tickAnim - 13) / 5) * (66-(66.74)));
                yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
                zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            }
            else if (tickAnim >= 18 && tickAnim < 23) {
                xx = 66 + (((tickAnim - 18) / 5) * (33.5-(66)));
                yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
                zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            }
            else if (tickAnim >= 23 && tickAnim < 50) {
                xx = 33.5 + (((tickAnim - 23) / 27) * (44.5-(33.5)));
                yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
                zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            }
            else if (tickAnim >= 50 && tickAnim < 90) {
                xx = 44.5 + (((tickAnim - 50) / 40) * (44.5-(44.5)));
                yy = 0 + (((tickAnim - 50) / 40) * (0-(0)));
                zz = 0 + (((tickAnim - 50) / 40) * (0-(0)));
            }
            else if (tickAnim >= 90 && tickAnim < 106) {
                xx = 44.5 + (((tickAnim - 90) / 16) * (34.5-(44.5)));
                yy = 0 + (((tickAnim - 90) / 16) * (0-(0)));
                zz = 0 + (((tickAnim - 90) / 16) * (0-(0)));
            }
            else if (tickAnim >= 106 && tickAnim < 114) {
                xx = 34.5 + (((tickAnim - 106) / 8) * (22.5-(34.5)));
                yy = 0 + (((tickAnim - 106) / 8) * (0-(0)));
                zz = 0 + (((tickAnim - 106) / 8) * (0-(0)));
            }
            else if (tickAnim >= 114 && tickAnim < 121) {
                xx = 22.5 + (((tickAnim - 114) / 7) * (71.13-(22.5)));
                yy = 0 + (((tickAnim - 114) / 7) * (0-(0)));
                zz = 0 + (((tickAnim - 114) / 7) * (0-(0)));
            }
            else if (tickAnim >= 121 && tickAnim < 128) {
                xx = 71.13 + (((tickAnim - 121) / 7) * (24.09-(71.13)));
                yy = 0 + (((tickAnim - 121) / 7) * (0-(0)));
                zz = 0 + (((tickAnim - 121) / 7) * (0-(0)));
            }
            else if (tickAnim >= 128 && tickAnim < 140) {
                xx = 24.09 + (((tickAnim - 128) / 12) * (11-(24.09)));
                yy = 0 + (((tickAnim - 128) / 12) * (0-(0)));
                zz = 0 + (((tickAnim - 128) / 12) * (0-(0)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




            if (tickAnim >= 0 && tickAnim < 10) {
                xx = -9.5 + (((tickAnim - 0) / 10) * (-9.5-(-9.5)));
                yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
                zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            }
            else if (tickAnim >= 10 && tickAnim < 23) {
                xx = -9.5 + (((tickAnim - 10) / 13) * (-18.5-(-9.5)));
                yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
                zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            }
            else if (tickAnim >= 23 && tickAnim < 30) {
                xx = -18.5 + (((tickAnim - 23) / 7) * (-8.90601-(-18.5)));
                yy = 0 + (((tickAnim - 23) / 7) * (-5.47537-(0)));
                zz = 0 + (((tickAnim - 23) / 7) * (-0.16269-(0)));
            }
            else if (tickAnim >= 30 && tickAnim < 38) {
                xx = -8.90601 + (((tickAnim - 30) / 8) * (-1.46801-(-8.90601)));
                yy = -5.47537 + (((tickAnim - 30) / 8) * (-4.94494-(-5.47537)));
                zz = -0.16269 + (((tickAnim - 30) / 8) * (-0.74089-(-0.16269)));
            }
            else if (tickAnim >= 38 && tickAnim < 50) {
                xx = -1.46801 + (((tickAnim - 38) / 12) * (-5.98288-(-1.46801)));
                yy = -4.94494 + (((tickAnim - 38) / 12) * (-4.98455-(-4.94494)));
                zz = -0.74089 + (((tickAnim - 38) / 12) * (-0.39329-(-0.74089)));
            }
            else if (tickAnim >= 50 && tickAnim < 90) {
                xx = -5.98288 + (((tickAnim - 50) / 40) * (-5.48288-(-5.98288)));
                yy = -4.98455 + (((tickAnim - 50) / 40) * (-4.98455-(-4.98455)));
                zz = -0.39329 + (((tickAnim - 50) / 40) * (-0.39329-(-0.39329)));
            }
            else if (tickAnim >= 90 && tickAnim < 97) {
                xx = -5.48288 + (((tickAnim - 90) / 7) * (2.5-(-5.48288)));
                yy = -4.98455 + (((tickAnim - 90) / 7) * (0-(-4.98455)));
                zz = -0.39329 + (((tickAnim - 90) / 7) * (0-(-0.39329)));
            }
            else if (tickAnim >= 97 && tickAnim < 103) {
                xx = 2.5 + (((tickAnim - 97) / 6) * (-19.73-(2.5)));
                yy = 0 + (((tickAnim - 97) / 6) * (0-(0)));
                zz = 0 + (((tickAnim - 97) / 6) * (0-(0)));
            }
            else if (tickAnim >= 103 && tickAnim < 112) {
                xx = -19.73 + (((tickAnim - 103) / 9) * (-21.5-(-19.73)));
                yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
                zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            }
            else if (tickAnim >= 112 && tickAnim < 140) {
                xx = -21.5 + (((tickAnim - 112) / 28) * (-9.5-(-21.5)));
                yy = 0 + (((tickAnim - 112) / 28) * (0-(0)));
                zz = 0 + (((tickAnim - 112) / 28) * (0-(0)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




            if (tickAnim >= 0 && tickAnim < 5) {
                xx = 1 + (((tickAnim - 0) / 5) * (-10.02-(1)));
                yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
                zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            }
            else if (tickAnim >= 5 && tickAnim < 10) {
                xx = -10.02 + (((tickAnim - 5) / 5) * (-20.37-(-10.02)));
                yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
                zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            }
            else if (tickAnim >= 10 && tickAnim < 23) {
                xx = -20.37 + (((tickAnim - 10) / 13) * (-35.04-(-20.37)));
                yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
                zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            }
            else if (tickAnim >= 23 && tickAnim < 26) {
                xx = -35.04 + (((tickAnim - 23) / 3) * (-50.7-(-35.04)));
                yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
                zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            }
            else if (tickAnim >= 26 && tickAnim < 37) {
                xx = -50.7 + (((tickAnim - 26) / 11) * (-58.04-(-50.7)));
                yy = 0 + (((tickAnim - 26) / 11) * (0-(0)));
                zz = 0 + (((tickAnim - 26) / 11) * (0-(0)));
            }
            else if (tickAnim >= 37 && tickAnim < 50) {
                xx = -58.04 + (((tickAnim - 37) / 13) * (-68.54-(-58.04)));
                yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
                zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            }
            else if (tickAnim >= 50 && tickAnim < 90) {
                xx = -68.54 + (((tickAnim - 50) / 40) * (-68.04-(-68.54)));
                yy = 0 + (((tickAnim - 50) / 40) * (0-(0)));
                zz = 0 + (((tickAnim - 50) / 40) * (0-(0)));
            }
            else if (tickAnim >= 90 && tickAnim < 97) {
                xx = -68.04 + (((tickAnim - 90) / 7) * (-61.04-(-68.04)));
                yy = 0 + (((tickAnim - 90) / 7) * (0-(0)));
                zz = 0 + (((tickAnim - 90) / 7) * (0-(0)));
            }
            else if (tickAnim >= 97 && tickAnim < 103) {
                xx = -61.04 + (((tickAnim - 97) / 6) * (-55.7-(-61.04)));
                yy = 0 + (((tickAnim - 97) / 6) * (0-(0)));
                zz = 0 + (((tickAnim - 97) / 6) * (0-(0)));
            }
            else if (tickAnim >= 103 && tickAnim < 112) {
                xx = -55.7 + (((tickAnim - 103) / 9) * (-42.37-(-55.7)));
                yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
                zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            }
            else if (tickAnim >= 112 && tickAnim < 121) {
                xx = -42.37 + (((tickAnim - 112) / 9) * (-30.95-(-42.37)));
                yy = 0 + (((tickAnim - 112) / 9) * (0-(0)));
                zz = 0 + (((tickAnim - 112) / 9) * (0-(0)));
            }
            else if (tickAnim >= 121 && tickAnim < 130) {
                xx = -30.95 + (((tickAnim - 121) / 9) * (-17.71-(-30.95)));
                yy = 0 + (((tickAnim - 121) / 9) * (0-(0)));
                zz = 0 + (((tickAnim - 121) / 9) * (0-(0)));
            }
            else if (tickAnim >= 130 && tickAnim < 140) {
                xx = -17.71 + (((tickAnim - 130) / 10) * (1-(-17.71)));
                yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
                zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




            if (tickAnim >= 3 && tickAnim < 10) {
                xx = 11 + (((tickAnim - 3) / 7) * (23.74-(11)));
                yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
                zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            }
            else if (tickAnim >= 10 && tickAnim < 23) {
                xx = 23.74 + (((tickAnim - 10) / 13) * (39.56-(23.74)));
                yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
                zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            }
            else if (tickAnim >= 23 && tickAnim < 26) {
                xx = 39.56 + (((tickAnim - 23) / 3) * (78.35-(39.56)));
                yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
                zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            }
            else if (tickAnim >= 26 && tickAnim < 37) {
                xx = 78.35 + (((tickAnim - 26) / 11) * (38.56-(78.35)));
                yy = 0 + (((tickAnim - 26) / 11) * (0-(0)));
                zz = 0 + (((tickAnim - 26) / 11) * (0-(0)));
            }
            else if (tickAnim >= 37 && tickAnim < 50) {
                xx = 38.56 + (((tickAnim - 37) / 13) * (42.56-(38.56)));
                yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
                zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            }
            else if (tickAnim >= 50 && tickAnim < 90) {
                xx = 42.56 + (((tickAnim - 50) / 40) * (41.56-(42.56)));
                yy = 0 + (((tickAnim - 50) / 40) * (0-(0)));
                zz = 0 + (((tickAnim - 50) / 40) * (0-(0)));
            }
            else if (tickAnim >= 90 && tickAnim < 97) {
                xx = 41.56 + (((tickAnim - 90) / 7) * (32.56-(41.56)));
                yy = 0 + (((tickAnim - 90) / 7) * (0-(0)));
                zz = 0 + (((tickAnim - 90) / 7) * (0-(0)));
            }
            else if (tickAnim >= 97 && tickAnim < 103) {
                xx = 32.56 + (((tickAnim - 97) / 6) * (78.35-(32.56)));
                yy = 0 + (((tickAnim - 97) / 6) * (0-(0)));
                zz = 0 + (((tickAnim - 97) / 6) * (0-(0)));
            }
            else if (tickAnim >= 103 && tickAnim < 112) {
                xx = 78.35 + (((tickAnim - 103) / 9) * (47.74-(78.35)));
                yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
                zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            }
            else if (tickAnim >= 112 && tickAnim < 121) {
                xx = 47.74 + (((tickAnim - 112) / 9) * (38.58-(47.74)));
                yy = 0 + (((tickAnim - 112) / 9) * (0-(0)));
                zz = 0 + (((tickAnim - 112) / 9) * (0-(0)));
            }
            else if (tickAnim >= 121 && tickAnim < 130) {
                xx = 38.58 + (((tickAnim - 121) / 9) * (28.39-(38.58)));
                yy = 0 + (((tickAnim - 121) / 9) * (0-(0)));
                zz = 0 + (((tickAnim - 121) / 9) * (0-(0)));
            }
            else if (tickAnim >= 130 && tickAnim < 140) {
                xx = 28.39 + (((tickAnim - 130) / 10) * (11-(28.39)));
                yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
                zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




            if (tickAnim >= 0 && tickAnim < 48) {
                xx = 2.5 + (((tickAnim - 0) / 48) * (26.5-(2.5)));
                yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1 + (((tickAnim - 0) / 48) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1)));
                zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1 + (((tickAnim - 0) / 48) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1)));
            }
            else if (tickAnim >= 48 && tickAnim < 90) {
                xx = 26.5 + (((tickAnim - 48) / 42) * (26.5-(26.5)));
                yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1 + (((tickAnim - 48) / 42) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1)));
                zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1 + (((tickAnim - 48) / 42) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1)));
            }
            else if (tickAnim >= 90 && tickAnim < 138) {
                xx = 26.5 + (((tickAnim - 90) / 48) * (2.5-(26.5)));
                yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1 + (((tickAnim - 90) / 48) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1)));
                zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1 + (((tickAnim - 90) / 48) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+110))*-1)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




            if (tickAnim >= 0 && tickAnim < 48) {
                xx = -1 + (((tickAnim - 0) / 48) * (20-(-1)));
                yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
                zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            }
            else if (tickAnim >= 48 && tickAnim < 90) {
                xx = 20 + (((tickAnim - 48) / 42) * (20-(20)));
                yy = 0 + (((tickAnim - 48) / 42) * (0-(0)));
                zz = 0 + (((tickAnim - 48) / 42) * (0-(0)));
            }
            else if (tickAnim >= 90 && tickAnim < 138) {
                xx = 20 + (((tickAnim - 90) / 48) * (-1-(20)));
                yy = 0 + (((tickAnim - 90) / 48) * (0-(0)));
                zz = 0 + (((tickAnim - 90) / 48) * (0-(0)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




            if (tickAnim >= 0 && tickAnim < 48) {
                xx = -3.5 + (((tickAnim - 0) / 48) * (8.5-(-3.5)));
                yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
                zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            }
            else if (tickAnim >= 48 && tickAnim < 57) {
                xx = 8.5 + (((tickAnim - 48) / 9) * (11-(8.5)));
                yy = 0 + (((tickAnim - 48) / 9) * (0-(0)));
                zz = 0 + (((tickAnim - 48) / 9) * (0-(0)));
            }
            else if (tickAnim >= 57 && tickAnim < 68) {
                xx = 11 + (((tickAnim - 57) / 11) * (8.5-(11)));
                yy = 0 + (((tickAnim - 57) / 11) * (0-(0)));
                zz = 0 + (((tickAnim - 57) / 11) * (0-(0)));
            }
            else if (tickAnim >= 68 && tickAnim < 77) {
                xx = 8.5 + (((tickAnim - 68) / 9) * (11-(8.5)));
                yy = 0 + (((tickAnim - 68) / 9) * (0-(0)));
                zz = 0 + (((tickAnim - 68) / 9) * (0-(0)));
            }
            else if (tickAnim >= 77 && tickAnim < 89) {
                xx = 11 + (((tickAnim - 77) / 12) * (8.5-(11)));
                yy = 0 + (((tickAnim - 77) / 12) * (0-(0)));
                zz = 0 + (((tickAnim - 77) / 12) * (0-(0)));
            }
            else if (tickAnim >= 89 && tickAnim < 90) {
                xx = 8.5 + (((tickAnim - 89) / 1) * (8.5-(8.5)));
                yy = 0 + (((tickAnim - 89) / 1) * (0-(0)));
                zz = 0 + (((tickAnim - 89) / 1) * (0-(0)));
            }
            else if (tickAnim >= 90 && tickAnim < 138) {
                xx = 8.5 + (((tickAnim - 90) / 48) * (-3.5-(8.5)));
                yy = 0 + (((tickAnim - 90) / 48) * (0-(0)));
                zz = 0 + (((tickAnim - 90) / 48) * (0-(0)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




            if (tickAnim >= 0 && tickAnim < 48) {
                xx = 5 + (((tickAnim - 0) / 48) * (23-(5)));
                yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
                zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            }
            else if (tickAnim >= 48 && tickAnim < 57) {
                xx = 23 + (((tickAnim - 48) / 9) * (26-(23)));
                yy = 0 + (((tickAnim - 48) / 9) * (0-(0)));
                zz = 0 + (((tickAnim - 48) / 9) * (0-(0)));
            }
            else if (tickAnim >= 57 && tickAnim < 68) {
                xx = 26 + (((tickAnim - 57) / 11) * (23-(26)));
                yy = 0 + (((tickAnim - 57) / 11) * (0-(0)));
                zz = 0 + (((tickAnim - 57) / 11) * (0-(0)));
            }
            else if (tickAnim >= 68 && tickAnim < 77) {
                xx = 23 + (((tickAnim - 68) / 9) * (26-(23)));
                yy = 0 + (((tickAnim - 68) / 9) * (0-(0)));
                zz = 0 + (((tickAnim - 68) / 9) * (0-(0)));
            }
            else if (tickAnim >= 77 && tickAnim < 89) {
                xx = 26 + (((tickAnim - 77) / 12) * (23-(26)));
                yy = 0 + (((tickAnim - 77) / 12) * (0-(0)));
                zz = 0 + (((tickAnim - 77) / 12) * (0-(0)));
            }
            else if (tickAnim >= 89 && tickAnim < 90) {
                xx = 23 + (((tickAnim - 89) / 1) * (23-(23)));
                yy = 0 + (((tickAnim - 89) / 1) * (0-(0)));
                zz = 0 + (((tickAnim - 89) / 1) * (0-(0)));
            }
            else if (tickAnim >= 90 && tickAnim < 138) {
                xx = 23 + (((tickAnim - 90) / 48) * (5-(23)));
                yy = 0 + (((tickAnim - 90) / 48) * (0-(0)));
                zz = 0 + (((tickAnim - 90) / 48) * (0-(0)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




            if (tickAnim >= 0 && tickAnim < 48) {
                xx = 0.5 + (((tickAnim - 0) / 48) * (-11.5-(0.5)));
                yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
                zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            }
            else if (tickAnim >= 48 && tickAnim < 57) {
                xx = -11.5 + (((tickAnim - 48) / 9) * (-21.5-(-11.5)));
                yy = 0 + (((tickAnim - 48) / 9) * (0-(0)));
                zz = 0 + (((tickAnim - 48) / 9) * (0-(0)));
            }
            else if (tickAnim >= 57 && tickAnim < 68) {
                xx = -21.5 + (((tickAnim - 57) / 11) * (-11.5-(-21.5)));
                yy = 0 + (((tickAnim - 57) / 11) * (0-(0)));
                zz = 0 + (((tickAnim - 57) / 11) * (0-(0)));
            }
            else if (tickAnim >= 68 && tickAnim < 77) {
                xx = -11.5 + (((tickAnim - 68) / 9) * (-21.5-(-11.5)));
                yy = 0 + (((tickAnim - 68) / 9) * (0-(0)));
                zz = 0 + (((tickAnim - 68) / 9) * (0-(0)));
            }
            else if (tickAnim >= 77 && tickAnim < 89) {
                xx = -21.5 + (((tickAnim - 77) / 12) * (-11.5-(-21.5)));
                yy = 0 + (((tickAnim - 77) / 12) * (0-(0)));
                zz = 0 + (((tickAnim - 77) / 12) * (0-(0)));
            }
            else if (tickAnim >= 89 && tickAnim < 90) {
                xx = -11.5 + (((tickAnim - 89) / 1) * (-11.5-(-11.5)));
                yy = 0 + (((tickAnim - 89) / 1) * (0-(0)));
                zz = 0 + (((tickAnim - 89) / 1) * (0-(0)));
            }
            else if (tickAnim >= 90 && tickAnim < 138) {
                xx = -11.5 + (((tickAnim - 90) / 48) * (0.5-(-11.5)));
                yy = 0 + (((tickAnim - 90) / 48) * (0-(0)));
                zz = 0 + (((tickAnim - 90) / 48) * (0-(0)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(xx), Neck5.rotateAngleY + (float) Math.toRadians(yy), Neck5.rotateAngleZ + (float) Math.toRadians(zz));



            this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-4), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));



            if (tickAnim >= 55 && tickAnim < 57) {
                xx = 0 + (((tickAnim - 55) / 2) * (21-(0)));
                yy = 0 + (((tickAnim - 55) / 2) * (0-(0)));
                zz = 0 + (((tickAnim - 55) / 2) * (0-(0)));
            }
            else if (tickAnim >= 57 && tickAnim < 58) {
                xx = 21 + (((tickAnim - 57) / 1) * (0-(21)));
                yy = 0 + (((tickAnim - 57) / 1) * (0-(0)));
                zz = 0 + (((tickAnim - 57) / 1) * (0-(0)));
            }
            else if (tickAnim >= 58 && tickAnim < 75) {
                xx = 0 + (((tickAnim - 58) / 17) * (0-(0)));
                yy = 0 + (((tickAnim - 58) / 17) * (0-(0)));
                zz = 0 + (((tickAnim - 58) / 17) * (0-(0)));
            }
            else if (tickAnim >= 75 && tickAnim < 77) {
                xx = 0 + (((tickAnim - 75) / 2) * (21-(0)));
                yy = 0 + (((tickAnim - 75) / 2) * (0-(0)));
                zz = 0 + (((tickAnim - 75) / 2) * (0-(0)));
            }
            else if (tickAnim >= 77 && tickAnim < 78) {
                xx = 21 + (((tickAnim - 77) / 1) * (0-(21)));
                yy = 0 + (((tickAnim - 77) / 1) * (0-(0)));
                zz = 0 + (((tickAnim - 77) / 1) * (0-(0)));
            }
            else {
                xx = 0;
                yy = 0;
                zz = 0;
            }
            this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEuropasaurus entity = (EntityPrehistoricFloraEuropasaurus) entitylivingbaseIn;

        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*310/1.5+120))*-2), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*310/1.5+50))*-3), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(0), Neck5.rotateAngleY + (float) Math.toRadians(0), Neck5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 9 + (((tickAnim - 9) / 16) * (18-(9)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 18 + (((tickAnim - 25) / 10) * (0-(18)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 12) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 17) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 24) / 3) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 29) / 3) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Jaw.rotationPointX = this.Jaw.rotationPointX + (float)(xx);
        this.Jaw.rotationPointY = this.Jaw.rotationPointY - (float)(yy);
        this.Jaw.rotationPointZ = this.Jaw.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*310/1.5+50))*-1), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEuropasaurus entity = (EntityPrehistoricFloraEuropasaurus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-14.22967-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-18.95195-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-7.62407-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -14.22967 + (((tickAnim - 12) / 6) * (-15.97243-(-14.22967)));
            yy = -18.95195 + (((tickAnim - 12) / 6) * (-48.40281-(-18.95195)));
            zz = -7.62407 + (((tickAnim - 12) / 6) * (-12.54578-(-7.62407)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -15.97243 + (((tickAnim - 18) / 4) * (0.43203-(-15.97243)));
            yy = -48.40281 + (((tickAnim - 18) / 4) * (-37.4554-(-48.40281)));
            zz = -12.54578 + (((tickAnim - 18) / 4) * (-11.53037-(-12.54578)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0.43203 + (((tickAnim - 22) / 5) * (0-(0.43203)));
            yy = -37.4554 + (((tickAnim - 22) / 5) * (0-(-37.4554)));
            zz = -11.53037 + (((tickAnim - 22) / 5) * (0-(-11.53037)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (7-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -17 + (((tickAnim - 5) / 4) * (-27.786-(-17)));
            yy = 0 + (((tickAnim - 5) / 4) * (-4.81216-(0)));
            zz = 7 + (((tickAnim - 5) / 4) * (3.91039-(7)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -27.786 + (((tickAnim - 9) / 5) * (-11.87834-(-27.786)));
            yy = -4.81216 + (((tickAnim - 9) / 5) * (1.40121-(-4.81216)));
            zz = 3.91039 + (((tickAnim - 9) / 5) * (10.47289-(3.91039)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -11.87834 + (((tickAnim - 14) / 4) * (-8.31929-(-11.87834)));
            yy = 1.40121 + (((tickAnim - 14) / 4) * (3.85446-(1.40121)));
            zz = 10.47289 + (((tickAnim - 14) / 4) * (12.64963-(10.47289)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -8.31929 + (((tickAnim - 18) / 4) * (-45.10965-(-8.31929)));
            yy = 3.85446 + (((tickAnim - 18) / 4) * (4.77443-(3.85446)));
            zz = 12.64963 + (((tickAnim - 18) / 4) * (13.46591-(12.64963)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -45.10965 + (((tickAnim - 22) / 5) * (-37-(-45.10965)));
            yy = 4.77443 + (((tickAnim - 22) / 5) * (0-(4.77443)));
            zz = 13.46591 + (((tickAnim - 22) / 5) * (0-(13.46591)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -37 + (((tickAnim - 27) / 3) * (-14.48-(-37)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -14.48 + (((tickAnim - 30) / 5) * (0-(-14.48)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (49-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 49 + (((tickAnim - 5) / 4) * (61-(49)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 61 + (((tickAnim - 9) / 5) * (29.75624-(61)));
            yy = 0 + (((tickAnim - 9) / 5) * (-5.28788-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (4.63296-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 29.75624 + (((tickAnim - 14) / 4) * (29.43861-(29.75624)));
            yy = -5.28788 + (((tickAnim - 14) / 4) * (-2.56663-(-5.28788)));
            zz = 4.63296 + (((tickAnim - 14) / 4) * (2.20494-(4.63296)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 29.43861 + (((tickAnim - 18) / 4) * (66.12654-(29.43861)));
            yy = -2.56663 + (((tickAnim - 18) / 4) * (-0.50185-(-2.56663)));
            zz = 2.20494 + (((tickAnim - 18) / 4) * (0.35581-(2.20494)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 66.12654 + (((tickAnim - 22) / 1) * (44.54147-(66.12654)));
            yy = -0.50185 + (((tickAnim - 22) / 1) * (-0.41407-(-0.50185)));
            zz = 0.35581 + (((tickAnim - 22) / 1) * (0.29358-(0.35581)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 44.54147 + (((tickAnim - 23) / 4) * (31-(44.54147)));
            yy = -0.41407 + (((tickAnim - 23) / 4) * (0-(-0.41407)));
            zz = 0.29358 + (((tickAnim - 23) / 4) * (0-(0.29358)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 31 + (((tickAnim - 27) / 3) * (8.57-(31)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 8.57 + (((tickAnim - 30) / 5) * (0-(8.57)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-9.17995-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (40.3317-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.2991-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -9.17995 + (((tickAnim - 9) / 4) * (-20.67615-(-9.17995)));
            yy = 40.3317 + (((tickAnim - 9) / 4) * (52.27166-(40.3317)));
            zz = 0.2991 + (((tickAnim - 9) / 4) * (-6.86162-(0.2991)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -20.67615 + (((tickAnim - 13) / 4) * (7.81674-(-20.67615)));
            yy = 52.27166 + (((tickAnim - 13) / 4) * (40.53806-(52.27166)));
            zz = -6.86162 + (((tickAnim - 13) / 4) * (8.47111-(-6.86162)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 7.81674 + (((tickAnim - 17) / 2) * (-23.18326-(7.81674)));
            yy = 40.53806 + (((tickAnim - 17) / 2) * (40.53806-(40.53806)));
            zz = 8.47111 + (((tickAnim - 17) / 2) * (8.47111-(8.47111)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = -23.18326 + (((tickAnim - 19) / 8) * (-23.18326-(-23.18326)));
            yy = 40.53806 + (((tickAnim - 19) / 8) * (40.53806-(40.53806)));
            zz = 8.47111 + (((tickAnim - 19) / 8) * (8.47111-(8.47111)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -23.18326 + (((tickAnim - 27) / 5) * (0-(-23.18326)));
            yy = 40.53806 + (((tickAnim - 27) / 5) * (0-(40.53806)));
            zz = 8.47111 + (((tickAnim - 27) / 5) * (0-(8.47111)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-29.99564-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.71323-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.70095-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -29.99564 + (((tickAnim - 9) / 4) * (-37.45367-(-29.99564)));
            yy = -0.71323 + (((tickAnim - 9) / 4) * (-7.54944-(-0.71323)));
            zz = -0.70095 + (((tickAnim - 9) / 4) * (-0.2684-(-0.70095)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -37.45367 + (((tickAnim - 13) / 4) * (-55.91027-(-37.45367)));
            yy = -7.54944 + (((tickAnim - 13) / 4) * (-8.67086-(-7.54944)));
            zz = -0.2684 + (((tickAnim - 13) / 4) * (-1.99742-(-0.2684)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -55.91027 + (((tickAnim - 17) / 2) * (-8.7936-(-55.91027)));
            yy = -8.67086 + (((tickAnim - 17) / 2) * (-14.72212-(-8.67086)));
            zz = -1.99742 + (((tickAnim - 17) / 2) * (-11.32734-(-1.99742)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = -8.7936 + (((tickAnim - 19) / 8) * (-8.7936-(-8.7936)));
            yy = -14.72212 + (((tickAnim - 19) / 8) * (-14.72212-(-14.72212)));
            zz = -11.32734 + (((tickAnim - 19) / 8) * (-11.32734-(-11.32734)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -8.7936 + (((tickAnim - 27) / 2) * (-37.97349-(-8.7936)));
            yy = -14.72212 + (((tickAnim - 27) / 2) * (0.59286-(-14.72212)));
            zz = -11.32734 + (((tickAnim - 27) / 2) * (-2.63185-(-11.32734)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = -37.97349 + (((tickAnim - 29) / 3) * (-11.48-(-37.97349)));
            yy = 0.59286 + (((tickAnim - 29) / 3) * (0-(0.59286)));
            zz = -2.63185 + (((tickAnim - 29) / 3) * (0-(-2.63185)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -11.48 + (((tickAnim - 32) / 3) * (0-(-11.48)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (40-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 40 + (((tickAnim - 9) / 4) * (46-(40)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 46 + (((tickAnim - 13) / 4) * (89-(46)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 89 + (((tickAnim - 17) / 2) * (30.931-(89)));
            yy = 0 + (((tickAnim - 17) / 2) * (2.59657-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (-3.04371-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 30.931 + (((tickAnim - 19) / 8) * (30.973-(30.931)));
            yy = 2.59657 + (((tickAnim - 19) / 8) * (-1.14648-(2.59657)));
            zz = -3.04371 + (((tickAnim - 19) / 8) * (0.2722-(-3.04371)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 30.973 + (((tickAnim - 27) / 2) * (67.63842-(30.973)));
            yy = -1.14648 + (((tickAnim - 27) / 2) * (-0.66878-(-1.14648)));
            zz = 0.2722 + (((tickAnim - 27) / 2) * (0.15879-(0.2722)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 67.63842 + (((tickAnim - 29) / 3) * (8.57-(67.63842)));
            yy = -0.66878 + (((tickAnim - 29) / 3) * (0-(-0.66878)));
            zz = 0.15879 + (((tickAnim - 29) / 3) * (0-(0.15879)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 8.57 + (((tickAnim - 32) / 3) * (0-(8.57)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0.99691-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.07365-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-4.22426-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0.99691 + (((tickAnim - 14) / 8) * (0.99983-(0.99691)));
            yy = 0.07365 + (((tickAnim - 14) / 8) * (-0.01683-(0.07365)));
            zz = -4.22426 + (((tickAnim - 14) / 8) * (0.96393-(-4.22426)));
        }
        else if (tickAnim >= 22 && tickAnim < 35) {
            xx = 0.99983 + (((tickAnim - 22) / 13) * (0-(0.99983)));
            yy = -0.01683 + (((tickAnim - 22) / 13) * (0-(-0.01683)));
            zz = 0.96393 + (((tickAnim - 22) / 13) * (0-(0.96393)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Shoulder, Shoulder.rotateAngleX + (float) Math.toRadians(xx), Shoulder.rotateAngleY + (float) Math.toRadians(yy), Shoulder.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (15.52687-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-4.9838-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (1.43931-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 15.52687 + (((tickAnim - 7) / 9) * (47.38102-(15.52687)));
            yy = -4.9838 + (((tickAnim - 7) / 9) * (-24.47946-(-4.9838)));
            zz = 1.43931 + (((tickAnim - 7) / 9) * (-13.75879-(1.43931)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 47.38102 + (((tickAnim - 16) / 3) * (44.91834-(47.38102)));
            yy = -24.47946 + (((tickAnim - 16) / 3) * (8.111-(-24.47946)));
            zz = -13.75879 + (((tickAnim - 16) / 3) * (-15.25487-(-13.75879)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 44.91834 + (((tickAnim - 19) / 4) * (28.70034-(44.91834)));
            yy = 8.111 + (((tickAnim - 19) / 4) * (17.59994-(8.111)));
            zz = -15.25487 + (((tickAnim - 19) / 4) * (-14.1589-(-15.25487)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 28.70034 + (((tickAnim - 23) / 5) * (-12.74002-(28.70034)));
            yy = 17.59994 + (((tickAnim - 23) / 5) * (12.40751-(17.59994)));
            zz = -14.1589 + (((tickAnim - 23) / 5) * (-14.66822-(-14.1589)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -12.74002 + (((tickAnim - 28) / 4) * (-5.6103-(-12.74002)));
            yy = 12.40751 + (((tickAnim - 28) / 4) * (5.39723-(12.40751)));
            zz = -14.66822 + (((tickAnim - 28) / 4) * (-6.04296-(-14.66822)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -5.6103 + (((tickAnim - 32) / 3) * (0-(-5.6103)));
            yy = 5.39723 + (((tickAnim - 32) / 3) * (0-(5.39723)));
            zz = -6.04296 + (((tickAnim - 32) / 3) * (0-(-6.04296)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (3.8225-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.33251-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (2.24953-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 3.8225 + (((tickAnim - 7) / 9) * (11.34771-(3.8225)));
            yy = -0.33251 + (((tickAnim - 7) / 9) * (-2.84433-(-0.33251)));
            zz = 2.24953 + (((tickAnim - 7) / 9) * (-10.83941-(2.24953)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 11.34771 + (((tickAnim - 16) / 2) * (14.52544-(11.34771)));
            yy = -2.84433 + (((tickAnim - 16) / 2) * (2.47036-(-2.84433)));
            zz = -10.83941 + (((tickAnim - 16) / 2) * (-24.48311-(-10.83941)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 14.52544 + (((tickAnim - 18) / 5) * (6.93533-(14.52544)));
            yy = 2.47036 + (((tickAnim - 18) / 5) * (11.671-(2.47036)));
            zz = -24.48311 + (((tickAnim - 18) / 5) * (3.6853+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.75-90))*-4-(-24.48311)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 6.93533 + (((tickAnim - 23) / 5) * (2.4561-(6.93533)));
            yy = 11.671 + (((tickAnim - 23) / 5) * (11.57302-(11.671)));
            zz = 3.6853+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.75-90))*-4 + (((tickAnim - 23) / 5) * (0.63272-(3.6853+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.75-90))*-4)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 2.4561 + (((tickAnim - 28) / 4) * (1.77217-(2.4561)));
            yy = 11.57302 + (((tickAnim - 28) / 4) * (3.80361-(11.57302)));
            zz = 0.63272 + (((tickAnim - 28) / 4) * (0.58105-(0.63272)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 1.77217 + (((tickAnim - 32) / 3) * (0-(1.77217)));
            yy = 3.80361 + (((tickAnim - 32) / 3) * (0-(3.80361)));
            zz = 0.58105 + (((tickAnim - 32) / 3) * (0-(0.58105)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4.81982-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-3.9297-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (3.38324-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 4.81982 + (((tickAnim - 7) / 9) * (15.08722-(4.81982)));
            yy = -3.9297 + (((tickAnim - 7) / 9) * (-12.09908-(-3.9297)));
            zz = 3.38324 + (((tickAnim - 7) / 9) * (-4.73791-(3.38324)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 15.08722 + (((tickAnim - 16) / 2) * (12.56704-(15.08722)));
            yy = -12.09908 + (((tickAnim - 16) / 2) * (-8.54292-(-12.09908)));
            zz = -4.73791 + (((tickAnim - 16) / 2) * (-1.33538-(-4.73791)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 12.56704 + (((tickAnim - 18) / 5) * (2.60305-(12.56704)));
            yy = -8.54292 + (((tickAnim - 18) / 5) * (9.98419-(-8.54292)));
            zz = -1.33538 + (((tickAnim - 18) / 5) * (6.7538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.75-90))*-5-(-1.33538)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 2.60305 + (((tickAnim - 23) / 5) * (10.99889-(2.60305)));
            yy = 9.98419 + (((tickAnim - 23) / 5) * (-0.79091-(9.98419)));
            zz = 6.7538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.75-90))*-5 + (((tickAnim - 23) / 5) * (1.44271-(6.7538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.75-90))*-5)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 10.99889 + (((tickAnim - 28) / 4) * (5.49945-(10.99889)));
            yy = -0.79091 + (((tickAnim - 28) / 4) * (-0.39545-(-0.79091)));
            zz = 1.44271 + (((tickAnim - 28) / 4) * (0.72136-(1.44271)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 5.49945 + (((tickAnim - 32) / 3) * (0-(5.49945)));
            yy = -0.39545 + (((tickAnim - 32) / 3) * (0-(-0.39545)));
            zz = 0.72136 + (((tickAnim - 32) / 3) * (0-(0.72136)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (5.99765-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-1.78308-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (3.76679-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 5.99765 + (((tickAnim - 7) / 9) * (18.02088-(5.99765)));
            yy = -1.78308 + (((tickAnim - 7) / 9) * (-4.86803-(-1.78308)));
            zz = 3.76679 + (((tickAnim - 7) / 9) * (-6.51832-(3.76679)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 18.02088 + (((tickAnim - 16) / 2) * (12.21792-(18.02088)));
            yy = -4.86803 + (((tickAnim - 16) / 2) * (-2.56938-(-4.86803)));
            zz = -6.51832 + (((tickAnim - 16) / 2) * (-11.64257-(-6.51832)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 12.21792 + (((tickAnim - 18) / 5) * (1.04531-(12.21792)));
            yy = -2.56938 + (((tickAnim - 18) / 5) * (13.12743-(-2.56938)));
            zz = -11.64257 + (((tickAnim - 18) / 5) * (4.1239+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.75-90))*-8-(-11.64257)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 1.04531 + (((tickAnim - 23) / 5) * (10.21142-(1.04531)));
            yy = 13.12743 + (((tickAnim - 23) / 5) * (9.29852-(13.12743)));
            zz = 4.1239+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.75-90))*-8 + (((tickAnim - 23) / 5) * (-0.1838-(4.1239+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.75-90))*-8)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 10.21142 + (((tickAnim - 28) / 4) * (5.10571-(10.21142)));
            yy = 9.29852 + (((tickAnim - 28) / 4) * (4.64926-(9.29852)));
            zz = -0.1838 + (((tickAnim - 28) / 4) * (-0.0919-(-0.1838)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 5.10571 + (((tickAnim - 32) / 3) * (0-(5.10571)));
            yy = 4.64926 + (((tickAnim - 32) / 3) * (0-(4.64926)));
            zz = -0.0919 + (((tickAnim - 32) / 3) * (0-(-0.0919)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-8.18502-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-3.93485-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (2.42439-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = -8.18502 + (((tickAnim - 7) / 9) * (-17.01331-(-8.18502)));
            yy = -3.93485 + (((tickAnim - 7) / 9) * (-3.40915-(-3.93485)));
            zz = 2.42439 + (((tickAnim - 7) / 9) * (-5.41957-(2.42439)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -17.01331 + (((tickAnim - 16) / 2) * (-22.11585-(-17.01331)));
            yy = -3.40915 + (((tickAnim - 16) / 2) * (-0.89341-(-3.40915)));
            zz = -5.41957 + (((tickAnim - 16) / 2) * (-7.93078-(-5.41957)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -22.11585 + (((tickAnim - 18) / 5) * (-38.10215-(-22.11585)));
            yy = -0.89341 + (((tickAnim - 18) / 5) * (6.47479-(-0.89341)));
            zz = -7.93078 + (((tickAnim - 18) / 5) * (7.215+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.75-90))*-10-(-7.93078)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -38.10215 + (((tickAnim - 23) / 5) * (-23.60096-(-38.10215)));
            yy = 6.47479 + (((tickAnim - 23) / 5) * (2.87768-(6.47479)));
            zz = 7.215+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.75-90))*-10 + (((tickAnim - 23) / 5) * (1.44631-(7.215+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/0.75-90))*-10)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -23.60096 + (((tickAnim - 28) / 4) * (-8.30751-(-23.60096)));
            yy = 2.87768 + (((tickAnim - 28) / 4) * (0.52669-(2.87768)));
            zz = 1.44631 + (((tickAnim - 28) / 4) * (0.31324-(1.44631)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -8.30751 + (((tickAnim - 32) / 3) * (0-(-8.30751)));
            yy = 0.52669 + (((tickAnim - 32) / 3) * (0-(0.52669)));
            zz = 0.31324 + (((tickAnim - 32) / 3) * (0-(0.31324)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(xx), Neck5.rotateAngleY + (float) Math.toRadians(yy), Neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5.13348-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (6.72162-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (4.72229-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -5.13348 + (((tickAnim - 7) / 3) * (-7-(-5.13348)));
            yy = 6.72162 + (((tickAnim - 7) / 3) * (0-(6.72162)));
            zz = 4.72229 + (((tickAnim - 7) / 3) * (0-(4.72229)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7 + (((tickAnim - 10) / 3) * (-7.5597-(-7)));
            yy = 0 + (((tickAnim - 10) / 3) * (6.36977-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-9.90093-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -7.5597 + (((tickAnim - 13) / 6) * (-27.28358-(-7.5597)));
            yy = 6.36977 + (((tickAnim - 13) / 6) * (2.67962-(6.36977)));
            zz = -9.90093 + (((tickAnim - 13) / 6) * (-4.1651-(-9.90093)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -27.28358 + (((tickAnim - 19) / 6) * (-12.17009-(-27.28358)));
            yy = 2.67962 + (((tickAnim - 19) / 6) * (1.3119-(2.67962)));
            zz = -4.1651 + (((tickAnim - 19) / 6) * (-2.03916-(-4.1651)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -12.17009 + (((tickAnim - 25) / 4) * (6-(-12.17009)));
            yy = 1.3119 + (((tickAnim - 25) / 4) * (0-(1.3119)));
            zz = -2.03916 + (((tickAnim - 25) / 4) * (0-(-2.03916)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 6 + (((tickAnim - 29) / 6) * (0-(6)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-16-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = -16 + (((tickAnim - 14) / 5) * (0-(-16)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 27) {
            xx = 7 + (((tickAnim - 11) / 16) * (7-(7)));
            yy = 0 + (((tickAnim - 11) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 16) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 7 + (((tickAnim - 27) / 8) * (0-(7)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (33-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 33 + (((tickAnim - 9) / 4) * (44-(33)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 44 + (((tickAnim - 13) / 4) * (44-(44)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 44 + (((tickAnim - 17) / 2) * (0-(44)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperlegR, UpperlegR.rotateAngleX + (float) Math.toRadians(xx), UpperlegR.rotateAngleY + (float) Math.toRadians(yy), UpperlegR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(LowerlegR, LowerlegR.rotateAngleX + (float) Math.toRadians(0), LowerlegR.rotateAngleY + (float) Math.toRadians(0), LowerlegR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(0), FootR.rotateAngleY + (float) Math.toRadians(0), FootR.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (15-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 15 + (((tickAnim - 15) / 4) * (-20-(15)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = -20 + (((tickAnim - 19) / 5) * (-21-(-20)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            yy = -21 + (((tickAnim - 24) / 5) * (-13-(-21)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = -13 + (((tickAnim - 29) / 6) * (0-(-13)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (20-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            yy = 20 + (((tickAnim - 15) / 9) * (-8-(20)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = -8 + (((tickAnim - 24) / 11) * (0-(-8)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (14-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            yy = 14 + (((tickAnim - 15) / 9) * (-10-(14)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            yy = -10 + (((tickAnim - 24) / 5) * (-2.5-(-10)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = -2.5 + (((tickAnim - 29) / 6) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (23-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 15) / 14) * (0-(0)));
            yy = 23 + (((tickAnim - 15) / 14) * (-19-(23)));
            zz = 0 + (((tickAnim - 15) / 14) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = -19 + (((tickAnim - 29) / 6) * (0-(-19)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (37-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 15) / 14) * (0-(0)));
            yy = 37 + (((tickAnim - 15) / 14) * (-32-(37)));
            zz = 0 + (((tickAnim - 15) / 14) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = -32 + (((tickAnim - 29) / 6) * (0-(-32)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-8-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 12 + (((tickAnim - 9) / 7) * (19.73686-(12)));
            yy = -8 + (((tickAnim - 9) / 7) * (-12.07552-(-8)));
            zz = 0 + (((tickAnim - 9) / 7) * (-0.51636-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 19.73686 + (((tickAnim - 16) / 2) * (11.44465-(19.73686)));
            yy = -12.07552 + (((tickAnim - 16) / 2) * (-19.68138-(-12.07552)));
            zz = -0.51636 + (((tickAnim - 16) / 2) * (-3.09721-(-0.51636)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 11.44465 + (((tickAnim - 18) / 4) * (0-(11.44465)));
            yy = -19.68138 + (((tickAnim - 18) / 4) * (0-(-19.68138)));
            zz = -3.09721 + (((tickAnim - 18) / 4) * (0-(-3.09721)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperlegL, UpperlegL.rotateAngleX + (float) Math.toRadians(xx), UpperlegL.rotateAngleY + (float) Math.toRadians(yy), UpperlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -8 + (((tickAnim - 9) / 7) * (-17-(-8)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -17 + (((tickAnim - 16) / 2) * (28-(-17)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 28 + (((tickAnim - 18) / 4) * (0-(28)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerlegL, LowerlegL.rotateAngleX + (float) Math.toRadians(xx), LowerlegL.rotateAngleY + (float) Math.toRadians(yy), LowerlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -5 + (((tickAnim - 9) / 7) * (-3.24-(-5)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -3.24 + (((tickAnim - 16) / 6) * (-13-(-3.24)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -13 + (((tickAnim - 22) / 2) * (0-(-13)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEuropasaurus entity = (EntityPrehistoricFloraEuropasaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.5 + (((tickAnim - 0) / 5) * (5-(12.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 5 + (((tickAnim - 5) / 6) * (-12.5-(5)));
            yy = 2.5 + (((tickAnim - 5) / 6) * (0-(2.5)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = -12.5 + (((tickAnim - 11) / 11) * (2.5-(-12.5)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 22) / 8) * (12.5-(2.5)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperlegR, UpperlegR.rotateAngleX + (float) Math.toRadians(xx), UpperlegR.rotateAngleY + (float) Math.toRadians(yy), UpperlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 11) / 2) * (0.1-(-0.3)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.1 + (((tickAnim - 13) / 1) * (-0.3-(0.1)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 14) / 2) * (0.1-(-0.3)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 16) / 2) * (-0.1-(0.1)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperlegR.rotationPointX = this.UpperlegR.rotationPointX + (float)(xx);
        this.UpperlegR.rotationPointY = this.UpperlegR.rotationPointY - (float)(yy);
        this.UpperlegR.rotationPointZ = this.UpperlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -7.5 + (((tickAnim - 0) / 5) * (25-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 25 + (((tickAnim - 5) / 7) * (-12.5-(25)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -12.5 + (((tickAnim - 12) / 2) * (-2.5-(-12.5)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -2.5 + (((tickAnim - 14) / 2) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -2.5 + (((tickAnim - 16) / 2) * (0.32-(-2.5)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0.32 + (((tickAnim - 18) / 4) * (-1.11-(0.32)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -1.11 + (((tickAnim - 22) / 8) * (-7.5-(-1.11)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerlegR, LowerlegR.rotateAngleX + (float) Math.toRadians(xx), LowerlegR.rotateAngleY + (float) Math.toRadians(yy), LowerlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -5 + (((tickAnim - 0) / 7) * (-5-(-5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -5 + (((tickAnim - 7) / 4) * (12.5-(-5)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 12.5 + (((tickAnim - 11) / 3) * (11.15-(12.5)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 11.15 + (((tickAnim - 14) / 4) * (3.51-(11.15)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 3.51 + (((tickAnim - 18) / 4) * (-2.06-(3.51)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -2.06 + (((tickAnim - 22) / 8) * (-5-(-2.06)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -6 + (((tickAnim - 0) / 3) * (-14.5-(-6)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -14.5 + (((tickAnim - 3) / 5) * (1.11-(-14.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 1.11 + (((tickAnim - 8) / 1) * (16.43-(1.11)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 16.43 + (((tickAnim - 9) / 2) * (33.21-(16.43)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 33.21 + (((tickAnim - 11) / 2) * (37.5-(33.21)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 37.5 + (((tickAnim - 13) / 2) * (3.6-(37.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 3.6 + (((tickAnim - 15) / 7) * (2.47-(3.6)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 2.47 + (((tickAnim - 22) / 2) * (-6.15-(2.47)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -6.15 + (((tickAnim - 24) / 6) * (-6-(-6.15)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -8.2 + (((tickAnim - 0) / 4) * (-0.73-(-8.2)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -0.73 + (((tickAnim - 4) / 6) * (7.5-(-0.73)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 7.5 + (((tickAnim - 10) / 7) * (5-(7.5)));
            yy = 0 + (((tickAnim - 10) / 7) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 5 + (((tickAnim - 17) / 6) * (-15.14-(5)));
            yy = -2.5 + (((tickAnim - 17) / 6) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -15.14 + (((tickAnim - 23) / 7) * (-8.2-(-15.14)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperlegL, UpperlegL.rotateAngleX + (float) Math.toRadians(xx), UpperlegL.rotateAngleY + (float) Math.toRadians(yy), UpperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 23) / 2) * (0.1-(-0.3)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 25) / 2) * (-0.3-(0.1)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = -0.3 + (((tickAnim - 27) / 1) * (0.1-(-0.3)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 28) / 2) * (-0.1-(0.1)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperlegL.rotationPointX = this.UpperlegL.rotationPointX + (float)(xx);
        this.UpperlegL.rotationPointY = this.UpperlegL.rotationPointY - (float)(yy);
        this.UpperlegL.rotationPointZ = this.UpperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -2.5 + (((tickAnim - 0) / 6) * (-0.08-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -0.08 + (((tickAnim - 6) / 4) * (-5-(-0.08)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -5 + (((tickAnim - 10) / 7) * (25-(-5)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 25 + (((tickAnim - 17) / 6) * (-10.12-(25)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -10.12 + (((tickAnim - 23) / 5) * (-7.5-(-10.12)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 28) / 2) * (-2.5-(-7.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerlegL, LowerlegL.rotateAngleX + (float) Math.toRadians(xx), LowerlegL.rotateAngleY + (float) Math.toRadians(yy), LowerlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 10 + (((tickAnim - 0) / 6) * (-1.5-(10)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 22) {
            xx = -1.5 + (((tickAnim - 6) / 16) * (-5-(-1.5)));
            yy = 0 + (((tickAnim - 6) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 16) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -5 + (((tickAnim - 22) / 3) * (20.56-(-5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 20.56 + (((tickAnim - 25) / 5) * (10-(20.56)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.5 + (((tickAnim - 0) / 3) * (6.88-(1.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 6.88 + (((tickAnim - 3) / 4) * (10-(6.88)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 10 + (((tickAnim - 7) / 5) * (0-(10)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (-19.77-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -19.77 + (((tickAnim - 16) / 6) * (-7.34-(-19.77)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -7.34 + (((tickAnim - 22) / 2) * (-2.46-(-7.34)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -2.46 + (((tickAnim - 24) / 6) * (1.5-(-2.46)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 14) / 2) * (0.1-(-0.3)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 16) / 2) * (-0.3-(0.1)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = -0.3 + (((tickAnim - 18) / 1) * (0.1-(-0.3)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 19) / 2) * (-0.1-(0.1)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperArmR.rotationPointX = this.UpperArmR.rotationPointX + (float)(xx);
        this.UpperArmR.rotationPointY = this.UpperArmR.rotationPointY - (float)(yy);
        this.UpperArmR.rotationPointZ = this.UpperArmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4 + (((tickAnim - 0) / 3) * (8.9-(4)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 8.9 + (((tickAnim - 3) / 4) * (0.85-(8.9)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0.85 + (((tickAnim - 7) / 1) * (-0.97-(0.85)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.97 + (((tickAnim - 8) / 4) * (-20-(-0.97)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -20 + (((tickAnim - 12) / 4) * (14.58-(-20)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 14.58 + (((tickAnim - 16) / 6) * (4.08-(14.58)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 4.08 + (((tickAnim - 22) / 2) * (5.05-(4.08)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 5.05 + (((tickAnim - 24) / 6) * (4-(5.05)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -19.77 + (((tickAnim - 0) / 11) * (1.25-(-19.77)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 1.25 + (((tickAnim - 11) / 5) * (4.67-(1.25)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 4.67 + (((tickAnim - 16) / 7) * (0-(4.67)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (-19.77-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 2) * (-0.3-(0.1)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.3 + (((tickAnim - 2) / 1) * (0.1-(-0.3)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 3) / 2) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 5) / 2) * (-0.3-(0.1)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 7) / 23) * (0-(0)));
            yy = -0.3 + (((tickAnim - 7) / 23) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 7) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperArmL.rotationPointX = this.UpperArmL.rotationPointX + (float)(xx);
        this.UpperArmL.rotationPointY = this.UpperArmL.rotationPointY - (float)(yy);
        this.UpperArmL.rotationPointZ = this.UpperArmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 14.58 + (((tickAnim - 0) / 11) * (0-(14.58)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (9.47-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 9.47 + (((tickAnim - 16) / 5) * (12.5-(9.47)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 12.5 + (((tickAnim - 21) / 2) * (-0.97-(12.5)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -0.97 + (((tickAnim - 23) / 5) * (-20-(-0.97)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -20 + (((tickAnim - 28) / 2) * (14.58-(-20)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 5 + (((tickAnim - 0) / 11) * (0-(5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (-14.17-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -14.17 + (((tickAnim - 16) / 4) * (1.11-(-14.17)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 1.11 + (((tickAnim - 20) / 3) * (16.43-(1.11)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 16.43 + (((tickAnim - 23) / 1) * (33.21-(16.43)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 33.21 + (((tickAnim - 24) / 4) * (37.5-(33.21)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 37.5 + (((tickAnim - 28) / 2) * (5-(37.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 20) / 3) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0.1 + (((tickAnim - 23) / 1) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0.1 + (((tickAnim - 24) / 4) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandL.rotationPointX = this.HandL.rotationPointX + (float)(xx);
        this.HandL.rotationPointY = this.HandL.rotationPointY - (float)(yy);
        this.HandL.rotationPointZ = this.HandL.rotationPointZ + (float)(zz);
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*-1), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+300))*-4), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+300))*-3));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-4), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-3));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+260))*-4), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+260))*-3));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+270))*-4), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+270))*-3));
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+290))*-4), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+290))*-3));
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-200))*-0.5), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*350/1.5+150))*-1.7));

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 8) * (0.2-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.2 + (((tickAnim - 8) / 7) * (-0.1-(0.2)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -0.1 + (((tickAnim - 15) / 8) * (0.2-(-0.1)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.2 + (((tickAnim - 23) / 7) * (-0.1-(0.2)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);
        this.setRotateAngle(Shoulder, Shoulder.rotateAngleX + (float) Math.toRadians(0), Shoulder.rotateAngleY + (float) Math.toRadians(0), Shoulder.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-60))*-1.2));
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(9.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-50))*-1), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+300))*-1), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+300))*-2));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 3) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -0.1 + (((tickAnim - 8) / 4) * (-0.1-(-0.1)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = -0.1 + (((tickAnim - 12) / 4) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -0.1 + (((tickAnim - 20) / 5) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(xx);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(yy);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(zz);
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(5), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1));
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-130))), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-130))*-1), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-130))));
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-150))*-2), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(-14), Neck5.rotateAngleY + (float) Math.toRadians(0), Neck5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-2), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-2), Head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*350/1.5-200))*-1), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-55))));
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraEuropasaurus entity = (EntityPrehistoricFloraEuropasaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -8.2 + (((tickAnim - 0) / 9) * (-0.73-(-8.2)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -0.73 + (((tickAnim - 9) / 9) * (7.5-(-0.73)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 7.5 + (((tickAnim - 18) / 15) * (5-(7.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 33) / 7) * (-15.14-(5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -15.14 + (((tickAnim - 40) / 10) * (-8.2-(-15.14)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperlegL, UpperlegL.rotateAngleX + (float) Math.toRadians(xx), UpperlegL.rotateAngleY + (float) Math.toRadians(yy), UpperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.3 + (((tickAnim - 3) / 4) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 7) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 37) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 4) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperlegL.rotationPointX = this.UpperlegL.rotationPointX + (float)(xx);
        this.UpperlegL.rotationPointY = this.UpperlegL.rotationPointY - (float)(yy);
        this.UpperlegL.rotationPointZ = this.UpperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -2.5 + (((tickAnim - 0) / 11) * (-0.08-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -0.08 + (((tickAnim - 11) / 7) * (-5-(-0.08)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -5 + (((tickAnim - 18) / 14) * (25-(-5)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 25 + (((tickAnim - 32) / 7) * (-10.12-(25)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = -10.12 + (((tickAnim - 39) / 7) * (-7.5-(-10.12)));
            yy = 0 + (((tickAnim - 39) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 7) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 46) / 4) * (-2.5-(-7.5)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerlegL, LowerlegL.rotateAngleX + (float) Math.toRadians(xx), LowerlegL.rotateAngleY + (float) Math.toRadians(yy), LowerlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 14) * (0.4-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 32) / 14) * (0-(0)));
            yy = 0.4 + (((tickAnim - 32) / 14) * (0-(0.4)));
            zz = 0 + (((tickAnim - 32) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LowerlegL.rotationPointX = this.LowerlegL.rotationPointX + (float)(xx);
        this.LowerlegL.rotationPointY = this.LowerlegL.rotationPointY - (float)(yy);
        this.LowerlegL.rotationPointZ = this.LowerlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 12.5 + (((tickAnim - 0) / 8) * (5-(12.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 5 + (((tickAnim - 8) / 6) * (-12.5-(5)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 38) {
            xx = -12.5 + (((tickAnim - 14) / 24) * (2.5-(-12.5)));
            yy = 0 + (((tickAnim - 14) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 24) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 38) / 12) * (12.5-(2.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperlegR, UpperlegR.rotateAngleX + (float) Math.toRadians(xx), UpperlegR.rotateAngleY + (float) Math.toRadians(yy), UpperlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 20) / 3) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 27) / 3) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperlegR.rotationPointX = this.UpperlegR.rotationPointX + (float)(xx);
        this.UpperlegR.rotationPointY = this.UpperlegR.rotationPointY - (float)(yy);
        this.UpperlegR.rotationPointZ = this.UpperlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -7.5 + (((tickAnim - 0) / 8) * (25-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 25 + (((tickAnim - 8) / 6) * (-12.5-(25)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -12.5 + (((tickAnim - 14) / 6) * (-2.5-(-12.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -2.5 + (((tickAnim - 20) / 5) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -2.5 + (((tickAnim - 25) / 5) * (0.32-(-2.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0.32 + (((tickAnim - 30) / 8) * (-1.11-(0.32)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -1.11 + (((tickAnim - 38) / 12) * (-7.5-(-1.11)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerlegR, LowerlegR.rotateAngleX + (float) Math.toRadians(xx), LowerlegR.rotateAngleY + (float) Math.toRadians(yy), LowerlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0.4 + (((tickAnim - 8) / 12) * (0-(0.4)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LowerlegR.rotationPointX = this.LowerlegR.rotationPointX + (float)(xx);
        this.LowerlegR.rotationPointY = this.LowerlegR.rotationPointY - (float)(yy);
        this.LowerlegR.rotationPointZ = this.LowerlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -5 + (((tickAnim - 0) / 12) * (-5-(-5)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 12) / 8) * (12.5-(-5)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 12.5 + (((tickAnim - 20) / 11) * (3.51-(12.5)));
            yy = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 3.51 + (((tickAnim - 31) / 7) * (-2.06-(3.51)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -2.06 + (((tickAnim - 38) / 12) * (-5-(-2.06)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -19.77 + (((tickAnim - 0) / 20) * (1.25-(-19.77)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1.25 + (((tickAnim - 20) / 10) * (4.67-(1.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 4.67 + (((tickAnim - 30) / 10) * (0-(4.67)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (-19.77-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.3 + (((tickAnim - 4) / 4) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.3 + (((tickAnim - 13) / 4) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperArmL.rotationPointX = this.UpperArmL.rotationPointX + (float)(xx);
        this.UpperArmL.rotationPointY = this.UpperArmL.rotationPointY - (float)(yy);
        this.UpperArmL.rotationPointZ = this.UpperArmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 14.58 + (((tickAnim - 0) / 20) * (0-(14.58)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (9.47-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 9.47 + (((tickAnim - 28) / 7) * (12.5-(9.47)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 12.5 + (((tickAnim - 35) / 5) * (-0.97-(12.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -0.97 + (((tickAnim - 40) / 6) * (-20-(-0.97)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -20 + (((tickAnim - 46) / 4) * (14.58-(-20)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 0) / 20) * (0-(5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (-14.17-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -14.17 + (((tickAnim - 28) / 6) * (1.11-(-14.17)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 1.11 + (((tickAnim - 34) / 5) * (16.43-(1.11)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 16.43 + (((tickAnim - 39) / 3) * (33.21-(16.43)));
            yy = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 33.21 + (((tickAnim - 42) / 4) * (37.5-(33.21)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = 37.5 + (((tickAnim - 46) / 3) * (5-(37.5)));
            yy = 0 + (((tickAnim - 46) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 34 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            yy = 0.1 + (((tickAnim - 34) / 5) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 39) / 3) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            yy = 0.1 + (((tickAnim - 42) / 4) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandL.rotationPointX = this.HandL.rotationPointX + (float)(xx);
        this.HandL.rotationPointY = this.HandL.rotationPointY - (float)(yy);
        this.HandL.rotationPointZ = this.HandL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1.5 + (((tickAnim - 0) / 8) * (6.88-(1.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 6.88 + (((tickAnim - 8) / 5) * (10-(6.88)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 10 + (((tickAnim - 13) / 9) * (0-(10)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (-19.77-(0)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -19.77 + (((tickAnim - 28) / 10) * (-7.34-(-19.77)));
            yy = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -7.34 + (((tickAnim - 38) / 5) * (-2.46-(-7.34)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -2.46 + (((tickAnim - 43) / 7) * (1.5-(-2.46)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 4) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 32) / 3) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = -0.3 + (((tickAnim - 38) / 4) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperArmR.rotationPointX = this.UpperArmR.rotationPointX + (float)(xx);
        this.UpperArmR.rotationPointY = this.UpperArmR.rotationPointY - (float)(yy);
        this.UpperArmR.rotationPointZ = this.UpperArmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 4 + (((tickAnim - 0) / 8) * (8.9-(4)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 8.9 + (((tickAnim - 8) / 5) * (0.85-(8.9)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0.85 + (((tickAnim - 13) / 4) * (-0.97-(0.85)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -0.97 + (((tickAnim - 17) / 5) * (-20-(-0.97)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -20 + (((tickAnim - 22) / 6) * (14.58-(-20)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 14.58 + (((tickAnim - 28) / 10) * (4.08-(14.58)));
            yy = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 4.08 + (((tickAnim - 38) / 5) * (5.05-(4.08)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 5.05 + (((tickAnim - 43) / 7) * (4-(5.05)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -6 + (((tickAnim - 0) / 8) * (-14.5-(-6)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -14.5 + (((tickAnim - 8) / 6) * (1.11-(-14.5)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 1.11 + (((tickAnim - 14) / 4) * (16.43-(1.11)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 16.43 + (((tickAnim - 18) / 1) * (33.21-(16.43)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 33.21 + (((tickAnim - 19) / 3) * (37.5-(33.21)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 37.5 + (((tickAnim - 22) / 3) * (3.6-(37.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 3.6 + (((tickAnim - 25) / 13) * (2.47-(3.6)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 2.47 + (((tickAnim - 38) / 5) * (-6.15-(2.47)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -6.15 + (((tickAnim - 43) / 7) * (-6-(-6.15)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.1 + (((tickAnim - 14) / 4) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.1 + (((tickAnim - 18) / 1) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 19) / 3) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.HandR.rotationPointX = this.HandR.rotationPointX + (float)(xx);
        this.HandR.rotationPointY = this.HandR.rotationPointY - (float)(yy);
        this.HandR.rotationPointZ = this.HandR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 10 + (((tickAnim - 0) / 11) * (-1.5-(10)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 38) {
            xx = -1.5 + (((tickAnim - 11) / 27) * (-5-(-1.5)));
            yy = 0 + (((tickAnim - 11) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 27) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -5 + (((tickAnim - 38) / 6) * (20.56-(-5)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 20.56 + (((tickAnim - 44) / 6) * (10-(20.56)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5-150))*-3), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*215/1.5+150))*-1.2));
        this.setRotateAngle(Shoulder, Shoulder.rotateAngleX + (float) Math.toRadians(0), Shoulder.rotateAngleY + (float) Math.toRadians(0), Shoulder.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5-150))*-1));
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5+250))*-4), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5+250))*-3));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5))*-4), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5))*-3));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5+260))*-4), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5+260))*-3));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5+270))*-4), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5+270))*-3));
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5+290))*-4), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5+290))*-3));
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(0), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5+120))*-2), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5+120))*-1));
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5+130))), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5+130))*-2), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5+130))*-1));
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5-130))), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5-130))*-1), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5-130))));
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5-150))*-2), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/1.5-50))*-1), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(0), Neck5.rotateAngleY + (float) Math.toRadians(0), Neck5.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animGrazeTree(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEuropasaurus entity = (EntityPrehistoricFloraEuropasaurus) entitylivingbaseIn;
        int animCycle = 107;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 0) / 107) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 107) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperlegR, UpperlegR.rotateAngleX + (float) Math.toRadians(xx), UpperlegR.rotateAngleY + (float) Math.toRadians(yy), UpperlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 10) / 11) * (-3-(0)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -3 + (((tickAnim - 21) / 9) * (1-(-3)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 73) {
            xx = 1 + (((tickAnim - 30) / 43) * (1-(1)));
            yy = 0 + (((tickAnim - 30) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 43) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 85) {
            xx = 1 + (((tickAnim - 73) / 12) * (-3.47-(1)));
            yy = 0 + (((tickAnim - 73) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 12) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 107) {
            xx = -3.47 + (((tickAnim - 85) / 22) * (0-(-3.47)));
            yy = 0 + (((tickAnim - 85) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerlegR, LowerlegR.rotateAngleX + (float) Math.toRadians(xx), LowerlegR.rotateAngleY + (float) Math.toRadians(yy), LowerlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (3-(0)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 3 + (((tickAnim - 30) / 40) * (3-(3)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 107) {
            xx = 3 + (((tickAnim - 70) / 37) * (0-(3)));
            yy = 0 + (((tickAnim - 70) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 10) / 22) * (10-(0)));
            yy = 0 + (((tickAnim - 10) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 22) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 75) {
            xx = 10 + (((tickAnim - 32) / 43) * (10-(10)));
            yy = 0 + (((tickAnim - 32) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 43) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 107) {
            xx = 10 + (((tickAnim - 75) / 32) * (0-(10)));
            yy = 0 + (((tickAnim - 75) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Shoulder, Shoulder.rotateAngleX + (float) Math.toRadians(xx), Shoulder.rotateAngleY + (float) Math.toRadians(yy), Shoulder.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (1-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 1 + (((tickAnim - 23) / 10) * (-13-(1)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 75) {
            xx = -13 + (((tickAnim - 33) / 42) * (-13-(-13)));
            yy = 0 + (((tickAnim - 33) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 42) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 84) {
            xx = -13 + (((tickAnim - 75) / 9) * (-4.81-(-13)));
            yy = 0 + (((tickAnim - 75) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 9) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 87) {
            xx = -4.81 + (((tickAnim - 84) / 3) * (-1.5-(-4.81)));
            yy = 0 + (((tickAnim - 84) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 3) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 89) {
            xx = -1.5 + (((tickAnim - 87) / 2) * (-0.19-(-1.5)));
            yy = 0 + (((tickAnim - 87) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 2) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 93) {
            xx = -0.19 + (((tickAnim - 89) / 4) * (0-(-0.19)));
            yy = 0 + (((tickAnim - 89) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 4) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 93) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 93) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (-24-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -24 + (((tickAnim - 23) / 10) * (8-(-24)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 75) {
            xx = 8 + (((tickAnim - 33) / 42) * (8-(8)));
            yy = 0 + (((tickAnim - 33) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 42) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 84) {
            xx = 8 + (((tickAnim - 75) / 9) * (-17.29-(8)));
            yy = 0 + (((tickAnim - 75) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 9) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 87) {
            xx = -17.29 + (((tickAnim - 84) / 3) * (-23.57-(-17.29)));
            yy = 0 + (((tickAnim - 84) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 3) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 89) {
            xx = -23.57 + (((tickAnim - 87) / 2) * (-25.86-(-23.57)));
            yy = 0 + (((tickAnim - 87) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 2) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 93) {
            xx = -25.86 + (((tickAnim - 89) / 4) * (-22-(-25.86)));
            yy = 0 + (((tickAnim - 89) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 4) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 107) {
            xx = -22 + (((tickAnim - 93) / 14) * (0-(-22)));
            yy = 0 + (((tickAnim - 93) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (14-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 14 + (((tickAnim - 23) / 10) * (0-(14)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 33) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 42) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 75) / 9) * (16.19-(0)));
            yy = 0 + (((tickAnim - 75) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 9) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 93) {
            xx = 16.19 + (((tickAnim - 84) / 9) * (13-(16.19)));
            yy = 0 + (((tickAnim - 84) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 9) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 107) {
            xx = 13 + (((tickAnim - 93) / 14) * (0-(13)));
            yy = 0 + (((tickAnim - 93) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (1-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 1 + (((tickAnim - 23) / 10) * (1-(1)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 33) / 42) * (1-(1)));
            yy = 0 + (((tickAnim - 33) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 42) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 1 + (((tickAnim - 75) / 10) * (0-(1)));
            yy = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 85) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 85) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 85) / 2) * (0.1-(-0.3)));
            zz = 0 + (((tickAnim - 85) / 2) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 87) / 1) * (0-(0)));
            yy = 0.1 + (((tickAnim - 87) / 1) * (-0.3-(0.1)));
            zz = 0 + (((tickAnim - 87) / 1) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 88) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 88) / 2) * (0.1-(-0.3)));
            zz = 0 + (((tickAnim - 88) / 2) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 90) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 90) / 2) * (-0.1-(0.1)));
            zz = 0 + (((tickAnim - 90) / 2) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 92) / 15) * (0-(0)));
            yy = -0.1 + (((tickAnim - 92) / 15) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 92) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperArmL.rotationPointX = this.UpperArmL.rotationPointX + (float)(xx);
        this.UpperArmL.rotationPointY = this.UpperArmL.rotationPointY - (float)(yy);
        this.UpperArmL.rotationPointZ = this.UpperArmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (-24-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -24 + (((tickAnim - 23) / 10) * (-24-(-24)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 75) {
            xx = -24 + (((tickAnim - 33) / 42) * (-24-(-24)));
            yy = 0 + (((tickAnim - 33) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 42) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = -24 + (((tickAnim - 75) / 10) * (-22-(-24)));
            yy = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 93) {
            xx = -22 + (((tickAnim - 85) / 8) * (-22.16-(-22)));
            yy = 0 + (((tickAnim - 85) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 8) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 107) {
            xx = -22.16 + (((tickAnim - 93) / 14) * (0-(-22.16)));
            yy = 0 + (((tickAnim - 93) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (14-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 14 + (((tickAnim - 23) / 10) * (27-(14)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 75) {
            xx = 27 + (((tickAnim - 33) / 42) * (27-(27)));
            yy = 0 + (((tickAnim - 33) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 42) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 27 + (((tickAnim - 75) / 10) * (13-(27)));
            yy = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 93) {
            xx = 13 + (((tickAnim - 85) / 8) * (11.78-(13)));
            yy = 0 + (((tickAnim - 85) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 8) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 107) {
            xx = 11.78 + (((tickAnim - 93) / 14) * (0-(11.78)));
            yy = 0 + (((tickAnim - 93) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 14) / 21) * (-7-(0)));
            yy = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 21) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 71) {
            xx = -7 + (((tickAnim - 35) / 36) * (-7-(-7)));
            yy = 0 + (((tickAnim - 35) / 36) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.75-90))*-5-(0)));
            zz = 0 + (((tickAnim - 35) / 36) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/1.5-250))*-5-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 107) {
            xx = -7 + (((tickAnim - 71) / 36) * (0-(-7)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.75-90))*-5 + (((tickAnim - 71) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.75-90))*-5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/1.5-250))*-5 + (((tickAnim - 71) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/1.5-250))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 14) / 21) * (-10-(0)));
            yy = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 21) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 71) {
            xx = -10 + (((tickAnim - 35) / 36) * (-10-(-10)));
            yy = 0 + (((tickAnim - 35) / 36) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.75-70))*-2-(0)));
            zz = 0 + (((tickAnim - 35) / 36) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*165/1.6-180))*-6-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 107) {
            xx = -10 + (((tickAnim - 71) / 36) * (0-(-10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.75-70))*-2 + (((tickAnim - 71) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80/0.75-70))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*165/1.6-180))*-6 + (((tickAnim - 71) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*165/1.6-180))*-6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 14) / 21) * (6-(0)));
            yy = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 21) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 6 + (((tickAnim - 35) / 13) * (10-(6)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 71) {
            xx = 10 + (((tickAnim - 48) / 23) * (6-(10)));
            yy = 0 + (((tickAnim - 48) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 23) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 107) {
            xx = 6 + (((tickAnim - 71) / 36) * (0-(6)));
            yy = 0 + (((tickAnim - 71) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 14) / 21) * (6-(0)));
            yy = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 21) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 6 + (((tickAnim - 35) / 13) * (11-(6)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 59) {
            xx = 11 + (((tickAnim - 48) / 11) * (-5.82-(11)));
            yy = 0 + (((tickAnim - 48) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 11) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 71) {
            xx = -5.82 + (((tickAnim - 59) / 12) * (6-(-5.82)));
            yy = 0 + (((tickAnim - 59) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 12) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 77) {
            xx = 6 + (((tickAnim - 71) / 6) * (-5.02-(6)));
            yy = 0 + (((tickAnim - 71) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 6) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 88) {
            xx = -5.02 + (((tickAnim - 77) / 11) * (-5.82-(-5.02)));
            yy = 0 + (((tickAnim - 77) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 11) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 107) {
            xx = -5.82 + (((tickAnim - 88) / 19) * (0-(-5.82)));
            yy = 0 + (((tickAnim - 88) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = -3 + (((tickAnim - 14) / 21) * (4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/1.5-90))*-1-(-3)));
            yy = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 21) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/1.5-90))*-1 + (((tickAnim - 35) / 13) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75-150))*-5-(4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/1.5-90))*-1)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 71) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75-150))*-5 + (((tickAnim - 48) / 23) * (11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/1.5-90))*-1-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75-150))*-5)));
            yy = 0 + (((tickAnim - 48) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 23) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 77) {
            xx = 11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/1.5-90))*-1 + (((tickAnim - 71) / 6) * (-2.86+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75-150))*-5-(11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*260/1.5-90))*-1)));
            yy = 0 + (((tickAnim - 71) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 6) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 107) {
            xx = -2.86+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75-150))*-5 + (((tickAnim - 77) / 30) * (0-(-2.86+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75-150))*-5)));
            yy = 0 + (((tickAnim - 77) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(xx), Neck5.rotateAngleY + (float) Math.toRadians(yy), Neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -6 + (((tickAnim - 5) / 5) * (-9-(-6)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 56) {
            xx = -9 + (((tickAnim - 10) / 46) * (-10.89-(-9)));
            yy = 0 + (((tickAnim - 10) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 46) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 69) {
            xx = -10.89 + (((tickAnim - 56) / 13) * (0-(-10.89)));
            yy = 0 + (((tickAnim - 56) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 13) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 69) / 11) * (-5-(0)));
            yy = 0 + (((tickAnim - 69) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 11) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 107) {
            xx = -5 + (((tickAnim - 80) / 27) * (0-(-5)));
            yy = 0 + (((tickAnim - 80) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 43) / 3) * (11-(0)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 51) {
            xx = 11 + (((tickAnim - 46) / 5) * (0-(11)));
            yy = 0 + (((tickAnim - 46) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 5) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 51) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 51) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 19) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 70) / 5) * (11-(0)));
            yy = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 11 + (((tickAnim - 75) / 5) * (0-(11)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 80) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (3-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 23) / 10) * (-4-(3)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = -4 + (((tickAnim - 33) / 12) * (-4-(-4)));
            yy = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 12) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 78) {
            xx = -4 + (((tickAnim - 45) / 33) * (-4-(-4)));
            yy = 0 + (((tickAnim - 45) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 33) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = -4 + (((tickAnim - 78) / 10) * (3-(-4)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 107) {
            xx = 3 + (((tickAnim - 88) / 19) * (0-(3)));
            yy = 0 + (((tickAnim - 88) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = -0.2 + (((tickAnim - 23) / 10) * (0.7-(-0.2)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            yy = 0.7 + (((tickAnim - 33) / 12) * (0.7-(0.7)));
            zz = 0 + (((tickAnim - 33) / 12) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 45) / 33) * (0-(0)));
            yy = 0.7 + (((tickAnim - 45) / 33) * (0.7-(0.7)));
            zz = 0 + (((tickAnim - 45) / 33) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            yy = 0.7 + (((tickAnim - 78) / 10) * (-0.2-(0.7)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 88) / 19) * (0-(0)));
            yy = -0.2 + (((tickAnim - 88) / 19) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 88) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-4 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-3 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 15) / 32) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-4 + (((tickAnim - 15) / 32) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-3 + (((tickAnim - 15) / 32) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-3)));
        }
        else if (tickAnim >= 47 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 47) / 31) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-4 + (((tickAnim - 47) / 31) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-3 + (((tickAnim - 47) / 31) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-3)));
        }
        else if (tickAnim >= 78 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 78) / 29) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-4 + (((tickAnim - 78) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-3 + (((tickAnim - 78) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5+155))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 15) / 32) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 15) / 32) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 15) / 32) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 47 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 47) / 31) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 47) / 31) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 47) / 31) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 78 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 78) / 29) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 78) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 78) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 15) / 14) * (7-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 15) / 14) * (-3.13491-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 15) / 14) * (-2.35119-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 29 && tickAnim < 47) {
            xx = 7 + (((tickAnim - 29) / 18) * (0-(7)));
            yy = -3.13491 + (((tickAnim - 29) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(-3.13491)));
            zz = -2.35119 + (((tickAnim - 29) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(-2.35119)));
        }
        else if (tickAnim >= 47 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 47) / 31) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 47) / 31) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 47) / 31) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 78 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 78) / 29) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 78) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 78) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 15) / 14) * (8-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 15) / 14) * (-3.13491-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 15) / 14) * (-2.35119-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 29 && tickAnim < 47) {
            xx = 8 + (((tickAnim - 29) / 18) * (0-(8)));
            yy = -3.13491 + (((tickAnim - 29) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(-3.13491)));
            zz = -2.35119 + (((tickAnim - 29) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(-2.35119)));
        }
        else if (tickAnim >= 47 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 47) / 31) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 47) / 31) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 47) / 31) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 78) / 10) * (5.86132-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 78) / 10) * (-1.30478-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 78) / 10) * (-0.97859-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 88 && tickAnim < 107) {
            xx = 5.86132 + (((tickAnim - 88) / 19) * (0-(5.86132)));
            yy = -1.30478 + (((tickAnim - 88) / 19) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(-1.30478)));
            zz = -0.97859 + (((tickAnim - 88) / 19) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(-0.97859)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 15) / 14) * (18-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 15) / 14) * (-3.13491-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 15) / 14) * (-2.35119-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 29 && tickAnim < 47) {
            xx = 18 + (((tickAnim - 29) / 18) * (0-(18)));
            yy = -3.13491 + (((tickAnim - 29) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(-3.13491)));
            zz = -2.35119 + (((tickAnim - 29) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(-2.35119)));
        }
        else if (tickAnim >= 47 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 47) / 31) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 47) / 31) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 47) / 31) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 78) / 10) * (14.92421-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 78) / 10) * (-1.52545-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 78) / 10) * (-1.14408-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 88 && tickAnim < 107) {
            xx = 14.92421 + (((tickAnim - 88) / 19) * (0-(14.92421)));
            yy = -1.52545 + (((tickAnim - 88) / 19) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(-1.52545)));
            zz = -1.14408 + (((tickAnim - 88) / 19) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(-1.14408)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 10) / 97) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 97) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 97) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperlegL, UpperlegL.rotateAngleX + (float) Math.toRadians(xx), UpperlegL.rotateAngleY + (float) Math.toRadians(yy), UpperlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 10) / 12) * (-3-(0)));
            yy = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = -3 + (((tickAnim - 22) / 9) * (1-(-3)));
            yy = 0 + (((tickAnim - 22) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 9) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 76) {
            xx = 1 + (((tickAnim - 31) / 45) * (1-(1)));
            yy = 0 + (((tickAnim - 31) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 45) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 89) {
            xx = 1 + (((tickAnim - 76) / 13) * (-3.47-(1)));
            yy = 0 + (((tickAnim - 76) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 13) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 107) {
            xx = -3.47 + (((tickAnim - 89) / 18) * (0-(-3.47)));
            yy = 0 + (((tickAnim - 89) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerlegL, LowerlegL.rotateAngleX + (float) Math.toRadians(xx), LowerlegL.rotateAngleY + (float) Math.toRadians(yy), LowerlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 22) / 9) * (3-(0)));
            yy = 0 + (((tickAnim - 22) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 9) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 73) {
            xx = 3 + (((tickAnim - 31) / 42) * (3-(3)));
            yy = 0 + (((tickAnim - 31) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 42) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 107) {
            xx = 3 + (((tickAnim - 73) / 34) * (0-(3)));
            yy = 0 + (((tickAnim - 73) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));
    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEuropasaurus e = (EntityPrehistoricFloraEuropasaurus) entity;
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
