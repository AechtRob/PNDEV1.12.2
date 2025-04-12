package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGeosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelGeosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Upperjaw;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer LJ2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer LJ3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer UpperLegL;
    private final AdvancedModelRenderer LowerLegL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer UpperLegR;
    private final AdvancedModelRenderer LowerLegR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;


    private final ModelAnimator animator;

    public ModelGeosaurus() {
        this.textureWidth = 80;
        this.textureHeight = 68;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 16.0F, -1.5F);
        this.Body.cubeList.add(new ModelBox(Body, 28, 35, -3.5F, -1.25F, -1.5F, 7, 6, 5, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 1.0F, -0.5F);
        this.Body.addChild(Neck);
        this.Neck.cubeList.add(new ModelBox(Neck, 50, 16, -2.5F, -1.99F, -5.0F, 5, 5, 5, -0.001F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Neck.addChild(Head);


        this.Upperjaw = new AdvancedModelRenderer(this);
        this.Upperjaw.setRotationPoint(0.0F, -1.0F, -5.875F);
        this.Head.addChild(Upperjaw);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 56, 30, -3.0F, -1.0F, 0.875F, 6, 3, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Upperjaw.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 45, -3.5F, -0.725F, 2.6F, 1, 1, 3, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 45, 2.5F, -0.725F, 2.6F, 1, 1, 3, 0.0F, false));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(0.0F, 2.0F, 0.875F);
        this.Upperjaw.addChild(snout);
        this.setRotateAngle(snout, -0.0436F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 50, 56, -2.0F, -1.0F, -5.0F, 4, 1, 5, 0.0F, false));
        this.snout.cubeList.add(new ModelBox(snout, 55, 49, -2.0F, -1.5F, -5.0F, 4, 1, 5, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.85F, -5.75F);
        this.snout.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 56, -1.0F, -1.0F, -2.0F, 2, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 1.0F, -5.0F);
        this.snout.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 41, -1.0F, -1.0F, 1.0F, 3, 1, 3, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, -2.6F, -1.5F);
        this.snout.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.183F, -0.8346F, -0.0652F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 9, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.5F, -2.6F, -1.5F);
        this.snout.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.183F, 0.8346F, 0.0652F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 9, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.75F, -5.0F);
        this.snout.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 14, -1.0F, 0.0F, -2.85F, 2, 1, 1, -0.001F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 62, -1.0F, 0.0F, -2.0F, 2, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -1.75F, -5.0F);
        this.snout.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2356F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 14, -1.0F, 0.0F, 4.275F, 3, 1, 1, -0.001F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 35, 0, -1.0F, 1.0F, 1.0F, 3, 1, 4, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 58, 0, -1.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.snout.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 61, 26, -1.5F, 1.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.0436F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 37, 49, -3.0F, 0.5F, -5.0F, 6, 1, 6, -0.002F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 44, 9, -3.0F, 0.0F, -5.0F, 6, 1, 6, -0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.24F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 58, 38, -2.0F, -2.0F, 0.0F, 4, 2, 4, -0.001F, false));

        this.LJ2 = new AdvancedModelRenderer(this);
        this.LJ2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Lowerjaw.addChild(LJ2);
        this.setRotateAngle(LJ2, 0.0436F, 0.0F, 0.0F);
        this.LJ2.cubeList.add(new ModelBox(LJ2, 32, 56, -2.0F, 0.0F, -5.0F, 4, 1, 5, -0.001F, false));
        this.LJ2.cubeList.add(new ModelBox(LJ2, 22, 0, -2.0F, 0.5F, -5.0F, 4, 1, 5, -0.002F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.75F, -4.75F);
        this.LJ2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 14, -1.0F, 0.0F, -2.0F, 2, 1, 1, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -0.75F, -4.9F);
        this.LJ2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 57, -2.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.LJ3 = new AdvancedModelRenderer(this);
        this.LJ3.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.LJ2.addChild(LJ3);
        this.setRotateAngle(LJ3, -0.0873F, 0.0F, 0.0F);
        this.LJ3.cubeList.add(new ModelBox(LJ3, 30, 46, -1.5F, -1.0F, -2.925F, 3, 1, 3, -0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 0.5F, 0.0F);
        this.LJ3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1702F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 62, 9, -0.5F, -1.0F, -2.925F, 2, 1, 3, -0.002F, false));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-3.75F, 3.0F, 0.0F);
        this.Body.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, -0.5236F, -0.5672F, 0.0F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 0, 53, 0.0F, -1.0F, 0.0F, 1, 2, 2, 0.0F, true));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(0.5F, 0.0F, 2.0F);
        this.UpperArmR.addChild(HandR);
        this.setRotateAngle(HandR, 0.5236F, 0.3927F, 0.3054F);
        this.HandR.cubeList.add(new ModelBox(HandR, 37, 50, -0.5F, -1.0F, -0.25F, 1, 2, 2, 0.0F, true));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(3.75F, 3.0F, 0.0F);
        this.Body.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -0.5236F, 0.5672F, 0.0F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 0, 53, -1.0F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(-0.5F, 0.0F, 2.0F);
        this.UpperArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.5236F, -0.3927F, -0.3054F);
        this.HandL.cubeList.add(new ModelBox(HandL, 37, 50, -0.5F, -1.0F, -0.25F, 1, 2, 2, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.85F, 3.5F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 23, 17, -4.0F, -2.5F, -1.0F, 8, 7, 11, 0.001F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -0.75F, 9.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 0, -3.5F, -1.5F, 0.0F, 7, 6, 8, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 4.5F, 8.0F);
        this.Body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0698F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 22, 6, -3.0F, -1.0F, -8.0F, 6, 1, 8, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 1.0F, 8.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 28, -3.0F, -2.25F, -1.0F, 6, 5, 8, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.75F, 7.0F);
        this.Body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0916F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 0, -2.0F, -1.0F, -8.0F, 4, 1, 8, 0.0F, false));

        this.UpperLegL = new AdvancedModelRenderer(this);
        this.UpperLegL.setRotationPoint(2.75F, 0.9F, 0.65F);
        this.Body4.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, 1.0036F, 0.6109F, 0.0F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 0, 28, -1.75F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false));

        this.LowerLegL = new AdvancedModelRenderer(this);
        this.LowerLegL.setRotationPoint(-0.25F, 4.75F, -0.5F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.48F, -0.3491F, 0.0F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 0, 41, -1.35F, -0.05F, -0.5F, 2, 4, 2, 0.0F, false));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.2618F, 0.0F, -0.2182F);
        this.FootL.cubeList.add(new ModelBox(FootL, 0, 0, -0.75F, -0.3F, -1.25F, 1, 4, 3, 0.0F, false));

        this.UpperLegR = new AdvancedModelRenderer(this);
        this.UpperLegR.setRotationPoint(-2.75F, 0.9F, 0.65F);
        this.Body4.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, 1.0036F, -0.6109F, 0.0F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 0, 28, -0.25F, 0.0F, -1.0F, 2, 5, 2, 0.0F, true));

        this.LowerLegR = new AdvancedModelRenderer(this);
        this.LowerLegR.setRotationPoint(0.25F, 4.75F, -0.5F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, 0.48F, 0.3491F, 0.0F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 0, 41, -0.65F, -0.05F, -0.5F, 2, 4, 2, 0.0F, true));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, 0.2618F, 0.0F, 0.2182F);
        this.FootR.cubeList.add(new ModelBox(FootR, 0, 0, -0.25F, -0.3F, -1.25F, 1, 4, 3, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body4.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 15, 46, -2.0F, -2.0F, 0.0F, 4, 4, 7, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0436F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 44, 38, -1.5F, -1.75F, 0.0F, 3, 3, 8, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.5F, 7.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0436F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 41, -1.0F, -1.25F, 0.0F, 2, 3, 9, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.5F, 8.0F);
        this.Tail3.addChild(Tail4);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 5.0F, 5.25F);
        this.Tail4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3927F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 11, 57, -0.5F, -0.4F, -0.125F, 1, 1, 7, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.75F, 1.0F);
        this.Tail4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.829F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 0.0F, -10.0F, -3.0F, 0, 11, 17, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 53, -0.5F, 0.0F, 0.0F, 1, 2, 8, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Body.offsetY = -0.0F;
        this.Body.offsetX = 0.5F;
        this.Body.offsetZ = 2.0F;
        this.Body.rotateAngleY = (float)Math.toRadians(120);
        this.Body.rotateAngleX = (float)Math.toRadians(1);
        this.Body.rotateAngleZ = (float)Math.toRadians(0);
        this.Body.scaleChildren = true;
        float scaler = 0.5F;
        this.Body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Body, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Body2, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Body4, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Tail, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Tail2, -0.05F, 0.1F, 0.0F);
        this.setRotateAngle(Tail3, -0.15F, 0.1F, 0.0F);
        this.setRotateAngle(Tail4, -0.15F, 0.1F, 0.0F);
        this.setRotateAngle(LowerLegR, 0.5F, 0.15F, -0.45F);
        this.setRotateAngle(FootR, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(Neck, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Head, 0.0F, 0.25F, 0.0F);
        //End of pose, now render the model:
        this.Body.render(f);
        //Reset rotations, positions and sizing:
        this.Body.setScale(1.0F, 1.0F, 1.0F);
        this.Body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.Body.rotateAngleX = (float) Math.toRadians(20);
        this.setRotateAngle(Body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Head, 0.0F, 0.28F, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.2F, 0.0F, 0.0F);
        this.Body2.setScale(0,0,0);
        this.Body2.setScale(0,0,0);
        this.Body2.scaleChildren = true;
        this.Body.offsetY = -0.18F;
        this.Body.offsetX = 0.0F;
        this.Body.offsetZ = -0.45F;
        this.Body.render(0.01F);
        this.Body2.setScale(1,1,1);
        this.Body2.setScale(1,1,1);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.1F, -0.1F, -0.15F);
        this.setRotateAngle(Body2, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Body4, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Tail, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Tail2, -0.05F, 0.1F, 0.0F);
        this.setRotateAngle(Tail3, -0.15F, 0.1F, 0.0F);
        this.setRotateAngle(Tail4, -0.15F, 0.1F, 0.0F);
        this.setRotateAngle(LowerLegR, 0.5F, 0.15F, -0.45F);
        this.setRotateAngle(FootR, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(Neck, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Head, 0.0F, 0.25F, 0.0F);
        this.Body.offsetY = -0.14F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(Body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Neck, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.0F, 0.0F, 0.0F);
        this.Body.offsetY = 0.05F;
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
        this.Body.offsetZ = -0.9F;

        EntityPrehistoricFloraGeosaurus Dako = (EntityPrehistoricFloraGeosaurus) e;

        this.faceTarget(f3, f4, 5, Neck);
        this.faceTarget(f3, f4, 5, Head);
        AdvancedModelRenderer[] Tail = {this.Body3, this.Body4, this.Tail, this.Tail2, this.Tail3, this.Tail4};
        //AdvancedModelRenderer[] Torso = {this.Neckfront, this.Neckmiddlefront, this.Neckmiddlebase, this.Neckbase, this.Bodyfront};
        Dako.tailBuffer.applyChainSwingBuffer(Tail);

        //AdvancedModelRenderer[] FL = {this.Rightupperarm, this.Rightlowerarm, this.Rightfrontfoot};
        //AdvancedModelRenderer[] FR = {this.Leftupperarm, this.Leftlowerarm, this.Leftfrontfoot};
        //AdvancedModelRenderer[] BL = {this.Rightthigh, this.Rightshin, this.Righthindfoot};
        //AdvancedModelRenderer[] BR = {this.Leftthigh, this.Leftshin, this.Lefthindfoot};

        AdvancedModelRenderer[] fishTail = {this.Body4, this.Tail, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] finPectoralLeft = {this.UpperArmL, this.HandL};
        AdvancedModelRenderer[] finPectoralRight = {this.UpperArmR, this.HandR};
        AdvancedModelRenderer[] finPelvicLeft = {this.UpperLegL, this.LowerLegL, this.FootL};
        AdvancedModelRenderer[] finPelvicRight = {this.UpperLegR, this.LowerLegR, this.FootR};

        if (!Dako.isReallyInWater()) { //will never happen as it should not be on land
            float speed = 0.3F;
            float outOfWater = 1.45f;

            this.Body.bob(speed, 0.35F, false, f2, 1F);

            this.chainWave(fishTail, speed * outOfWater, 0.05F * outOfWater, -3, f2, 1);
            this.chainSwing(fishTail, speed * outOfWater, 0.15F * outOfWater, -2.5, f2, 1);
            this.swing(Body, speed * outOfWater, 0.21F * outOfWater, true, 0, 0, f2, 1);

            this.chainWave(finPectoralLeft, speed * outOfWater, 0.25F * outOfWater, 0.5F, f2, 1);
            this.chainSwingExtended(finPectoralLeft, speed * outOfWater, 0.8F * outOfWater, 0.5F, 3, f2, 1);
            this.chainFlap(finPectoralLeft, speed * outOfWater, 0.15F * outOfWater, -0.8, f2, 1);

            this.chainWave(finPectoralRight, speed * outOfWater, 0.25F * outOfWater, 0.5F, f2, 1);
            this.chainSwing(finPectoralRight, speed * outOfWater, -0.8F * outOfWater, 0.5F, f2, 1);
            this.chainFlap(finPectoralRight, speed * outOfWater, -0.15F * outOfWater, 0.8, f2, 1);

            this.chainWave(finPelvicLeft, speed * outOfWater, 0.20F * outOfWater, 0.3F, f2, 1);
            this.chainSwing(finPelvicLeft, speed * outOfWater, 0.20F * outOfWater, 0.3F, f2, 1);
            this.chainFlap(finPelvicLeft, speed * outOfWater, 0.10F * outOfWater, -0.5, f2, 1);

            this.chainWave(finPelvicRight, speed * outOfWater, 0.20F * outOfWater, 0.3F, f2, 1);
            this.chainSwingExtended(finPelvicRight, speed * outOfWater, -0.20F * outOfWater, 0.3F, 3, f2, 1);
            this.chainFlap(finPelvicRight, speed * outOfWater, -0.10F * outOfWater, 0.5, f2, 1);

        }
    }
    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraGeosaurus ee = (EntityPrehistoricFloraGeosaurus) entitylivingbaseIn;

        if (ee.isReallyInWater()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
        }
        else {
            //Do the LL one defined above
        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGeosaurus entity = (EntityPrehistoricFloraGeosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66+60))*30)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10))));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2))));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66+60))*30) + (((tickAnim - 10) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*-30)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66+60))*30))));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2) + (((tickAnim - 10) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2))));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*-30) + (((tickAnim - 13) / 7) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*-30))));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2) + (((tickAnim - 13) / 7) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66))*-10)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2))));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66))*-10) + (((tickAnim - 10) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66))*-10))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2) + (((tickAnim - 10) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2) + (((tickAnim - 10) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2))));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10) + (((tickAnim - 13) / 7) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2) + (((tickAnim - 13) / 7) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2) + (((tickAnim - 13) / 7) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66-60))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0))));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66-60))*5) + (((tickAnim - 10) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*40)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66-60))*5))));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*40) + (((tickAnim - 13) / 7) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*40))));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGeosaurus entity = (EntityPrehistoricFloraGeosaurus) entitylivingbaseIn;
        int animCycle = 176;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-1)), Body.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*5)), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-90))*0.5));
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-90))*0.5));
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-90))*0.5));
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*1)), Neck.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-2)), Neck.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-1)));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-2)), Head.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-1)));
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(0), Body2.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*2)), Body2.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*2)));
        this.setRotateAngle(Body3, Body3.rotateAngleX + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-1)), Body3.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*2)), Body3.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*2)));
        this.setRotateAngle(Body4, Body4.rotateAngleX + (float) Math.toRadians(0), Body4.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*10)), Body4.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*2)));
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(0), UpperLegL.rotateAngleY + (float) Math.toRadians(0), UpperLegL.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-60))*20)));
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(0), LowerLegL.rotateAngleY + (float) Math.toRadians(0), LowerLegL.rotateAngleZ + (float) Math.toRadians(12.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-100))*5)));
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(0), FootL.rotateAngleY + (float) Math.toRadians(0), FootL.rotateAngleZ + (float) Math.toRadians(25));
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(0), UpperLegR.rotateAngleY + (float) Math.toRadians(0), UpperLegR.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*20)));
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(0), LowerLegR.rotateAngleY + (float) Math.toRadians(0), LowerLegR.rotateAngleZ + (float) Math.toRadians(-12.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-100))*5)));
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(0), FootR.rotateAngleY + (float) Math.toRadians(0), FootR.rotateAngleZ + (float) Math.toRadians(-25));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-60))*2)), Tail.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-60))*20)), Tail.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-60))*2)));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-100))*20)), Tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-180))*25)), Tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-250))*25)), Tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-100))*5)), UpperArmL.rotateAngleY + (float) Math.toRadians(0), UpperArmL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-100))*5)), UpperArmR.rotateAngleY + (float) Math.toRadians(0), UpperArmR.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGeosaurus entity = (EntityPrehistoricFloraGeosaurus) entitylivingbaseIn;
        int animCycle = 100;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/2.5))*-1)), Body.rotateAngleY + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5))*-4)), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*0.5));
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/2.5-90))*0.5));
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-180))*0.5));
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/2.5+180))*1)), Neck.rotateAngleY + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-1)), Neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/2.5+270))*1)), Head.rotateAngleY + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+120))*-1)), Head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/2.5+120))*-0.5)), Body2.rotateAngleY + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+120))*1)), Body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body3, Body3.rotateAngleX + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/2.5+90))*-0.5)), Body3.rotateAngleY + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+90))*5)), Body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body4, Body4.rotateAngleX + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/2.5))*-0.5)), Body4.rotateAngleY + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5))*5)), Body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(0), UpperLegL.rotateAngleY + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-0))*10)), UpperLegL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(0), LowerLegL.rotateAngleY + (float) Math.toRadians(0), LowerLegL.rotateAngleZ + (float) Math.toRadians(7.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*5)));
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(0), FootL.rotateAngleY + (float) Math.toRadians(0), FootL.rotateAngleZ + (float) Math.toRadians(25+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*10)));
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(0), UpperLegR.rotateAngleY + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-0))*10)), UpperLegR.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(0), LowerLegR.rotateAngleY + (float) Math.toRadians(0), LowerLegR.rotateAngleZ + (float) Math.toRadians(-7.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*5)));
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(0), FootR.rotateAngleY + (float) Math.toRadians(0), FootR.rotateAngleZ + (float) Math.toRadians(-25+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*10)));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(0), Tail.rotateAngleY + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-0))*10)), Tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*10)), Tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*10)), Tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-150))*20)), Tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*2)), UpperArmL.rotateAngleY + (float) Math.toRadians(0), UpperArmL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(0+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*2)), UpperArmR.rotateAngleY + (float) Math.toRadians(0), UpperArmR.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);

    }
}
