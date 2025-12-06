package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMarmorerpeton;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMarmorerpeton extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended Hips;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended leftLeg;
    private final AdvancedModelRendererExtended leftLeg2;
    private final AdvancedModelRendererExtended leftFoot;
    private final AdvancedModelRendererExtended rightLeg;
    private final AdvancedModelRendererExtended rightLeg2;
    private final AdvancedModelRendererExtended rightFoot;
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended Chest;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended Upperjaw;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended rightArm;
    private final AdvancedModelRendererExtended rightArm2;
    private final AdvancedModelRendererExtended rightHand;
    private final AdvancedModelRendererExtended leftArm;
    private final AdvancedModelRendererExtended leftArm2;
    private final AdvancedModelRendererExtended leftHand;
    private final AdvancedModelRendererExtended Tail1;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;

    private ModelAnimator animator;

    public ModelMarmorerpeton() {
        this.textureWidth = 64;
        this.textureHeight = 50;

        this.Hips = new AdvancedModelRendererExtended(this);
        this.Hips.setRotationPoint(0.0F, 24.0F, -5.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 23, 0, -2.0F, -2.05F, 9.0F, 4, 2, 3, -0.01F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -2.8F, 9.5F);
        this.Hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 15, -1.5F, -0.05F, -0.5F, 3, 1, 3, -0.01F, false));

        this.leftLeg = new AdvancedModelRendererExtended(this);
        this.leftLeg.setRotationPoint(1.75F, -0.75F, 10.9F);
        this.Hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.1048F, 0.6529F, -0.0375F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 40, 27, -1.0F, -0.25F, -0.85F, 3, 1, 1, 0.01F, true));
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 38, 3, -1.0F, -0.25F, -0.25F, 3, 1, 1, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRendererExtended(this);
        this.leftLeg2.setRotationPoint(1.75F, 0.25F, 0.3F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, -1.4399F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 39, 24, -0.75F, -0.5F, -0.5F, 3, 1, 1, -0.01F, true));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 36, 37, -0.75F, -0.5F, -0.75F, 3, 1, 1, -0.02F, true));

        this.leftFoot = new AdvancedModelRendererExtended(this);
        this.leftFoot.setRotationPoint(2.0F, 0.25F, 0.0F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.0F, 1.5272F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 0, 33, -0.5F, 0.0F, -1.5F, 3, 0, 3, 0.01F, true));
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 30, 28, -0.5F, 0.025F, -1.5F, 3, 0, 3, 0.01F, true));

        this.rightLeg = new AdvancedModelRendererExtended(this);
        this.rightLeg.setRotationPoint(-1.75F, -0.75F, 10.9F);
        this.Hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.1048F, -0.6529F, 0.0375F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 40, 27, -2.0F, -0.25F, -0.85F, 3, 1, 1, 0.01F, false));
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 38, 3, -2.0F, -0.25F, -0.25F, 3, 1, 1, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRendererExtended(this);
        this.rightLeg2.setRotationPoint(-1.75F, 0.25F, 0.3F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 1.4399F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 39, 24, -2.25F, -0.5F, -0.5F, 3, 1, 1, -0.01F, false));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 36, 37, -2.25F, -0.5F, -0.75F, 3, 1, 1, -0.02F, false));

        this.rightFoot = new AdvancedModelRendererExtended(this);
        this.rightFoot.setRotationPoint(-2.0F, 0.25F, 0.0F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.0F, -1.5272F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 0, 33, -2.5F, 0.0F, -1.5F, 3, 0, 3, 0.01F, false));
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 30, 28, -2.5F, 0.025F, -1.5F, 3, 0, 3, 0.01F, false));

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 10.5F);
        this.Hips.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -3.0F, -3.0F, -8.0F, 6, 3, 5, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 20, -2.5F, -3.0F, -3.0F, 5, 3, 2, 0.0F, false));

        this.Chest = new AdvancedModelRendererExtended(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, -7.5F);
        this.Body.addChild(Chest);
        this.Chest.cubeList.add(new ModelBox(Chest, 0, 9, -2.5F, -3.0F, -3.0F, 5, 3, 3, 0.01F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Chest.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 12, 25, -2.0F, -2.01F, -2.1F, 4, 2, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 18, 9, -2.5F, -2.875F, -2.1F, 5, 2, 3, -0.01F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(2.5F, 0.0F, 1.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1222F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 36, -1.6F, -2.0F, -2.8F, 2, 2, 2, 0.015F, true));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(-2.5F, 0.0F, 1.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1222F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 36, -0.4F, -2.0F, -2.8F, 2, 2, 2, 0.015F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, -1.025F, -1.9F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 10, 31, -1.5F, -0.1F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(1.5F, 0.9F, -3.0F);
        this.Jaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.4363F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 27, -2.0F, -1.01F, 0.0F, 2, 1, 4, 0.0F, true));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-1.5F, 0.9F, -3.0F);
        this.Jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 27, 0.0F, -1.01F, 0.0F, 2, 1, 4, 0.0F, false));

        this.Upperjaw = new AdvancedModelRendererExtended(this);
        this.Upperjaw.setRotationPoint(0.0F, -1.25F, -2.0F);
        this.Head.addChild(Upperjaw);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 31, 32, -1.5F, -0.75F, -3.0F, 3, 1, 3, 0.01F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(1.5F, -0.75F, 0.0F);
        this.Upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1745F, -0.4363F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.25F, -0.6F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(-1.5F, -0.75F, 0.0F);
        this.Upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1745F, 0.4363F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.75F, -0.6F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(1.5F, 0.25F, -3.0F);
        this.Upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.6676F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 37, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(-1.5F, 0.25F, -3.0F);
        this.Upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.6676F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 27, 37, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(1.5F, 0.25F, -3.0F);
        this.Upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.2967F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 37, -1.3F, -1.0F, 1.675F, 2, 1, 2, 0.005F, true));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(-1.5F, 0.25F, -3.0F);
        this.Upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.2967F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 37, -0.7F, -1.0F, 1.675F, 2, 1, 2, 0.005F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.5F, -0.75F, -3.0F);
        this.Upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2967F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 6, -2.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.rightArm = new AdvancedModelRendererExtended(this);
        this.rightArm.setRotationPoint(-2.25F, -0.75F, -2.75F);
        this.Chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.0532F, 0.3504F, -0.0532F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 35, 40, -2.0F, -0.25F, -0.25F, 2, 1, 1, 0.0F, false));

        this.rightArm2 = new AdvancedModelRendererExtended(this);
        this.rightArm2.setRotationPoint(-2.0F, 0.25F, 0.05F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.0F, -1.0908F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 18, 0, -1.5F, -0.5F, -0.5F, 2, 1, 1, -0.01F, false));

        this.rightHand = new AdvancedModelRendererExtended(this);
        this.rightHand.setRotationPoint(-1.25F, 0.25F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0F, -0.5236F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 35, 17, -1.75F, 0.0F, -1.5F, 2, 0, 3, 0.01F, false));
        this.rightHand.cubeList.add(new ModelBox(rightHand, 0, 16, -1.75F, 0.025F, -1.5F, 2, 0, 3, 0.01F, false));

        this.leftArm = new AdvancedModelRendererExtended(this);
        this.leftArm.setRotationPoint(2.25F, -0.75F, -2.75F);
        this.Chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0532F, -0.3504F, 0.0532F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 35, 40, 0.0F, -0.25F, -0.25F, 2, 1, 1, 0.0F, true));

        this.leftArm2 = new AdvancedModelRendererExtended(this);
        this.leftArm2.setRotationPoint(2.0F, 0.25F, 0.05F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.0F, 1.0908F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 18, 0, -0.5F, -0.5F, -0.5F, 2, 1, 1, -0.01F, true));

        this.leftHand = new AdvancedModelRendererExtended(this);
        this.leftHand.setRotationPoint(1.25F, 0.25F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0F, 0.5236F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 35, 17, -0.25F, 0.0F, -1.5F, 2, 0, 3, 0.01F, true));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 0, 16, -0.25F, 0.025F, -1.5F, 2, 0, 3, 0.01F, true));

        this.Tail1 = new AdvancedModelRendererExtended(this);
        this.Tail1.setRotationPoint(0.0F, -1.5F, 12.0F);
        this.Hips.addChild(Tail1);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 26, 21, -1.0F, -1.0F, -0.25F, 2, 2, 4, 0.01F, false));
        this.Tail1.cubeList.add(new ModelBox(Tail1, 20, 35, 0.0F, -2.0F, 1.75F, 0, 4, 3, 0.0F, false));
        this.Tail1.cubeList.add(new ModelBox(Tail1, 7, 39, 0.0F, -1.5F, -0.25F, 0, 3, 2, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 3.75F);
        this.Tail1.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 23, 28, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 19, 15, 0.0F, -2.0F, 0.0F, 0, 4, 5, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 35, 11, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 11, 10, 0.0F, -1.5F, 0.0F, 0, 3, 6, 0.0F, false));

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
        this.setRotateAngle(rightArm, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm, 0.5F, 0.0F, 0.0F);
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
        this.Hips.offsetZ = -0.06F;
        this.Hips.offsetY = 0.055F;
        this.Hips.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hips.offsetY = -0.8F;
        this.Hips.offsetX = 0.4F;
        this.Hips.offsetZ = 2.0F;
        this.Hips.rotateAngleY = (float)Math.toRadians(120);
        this.Hips.rotateAngleX = (float)Math.toRadians(1);
        this.Hips.rotateAngleZ = (float)Math.toRadians(0);
        this.Hips.scaleChildren = true;
        float scaler = 2.0F;
        this.Hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Hips, 0.4F, 3.8F, -0.2F);
        this.setRotateAngle(Tail1, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Chest, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Head, 0.0F, 0.2F, 0.0F);
        //End of pose, now render the model:
        this.Hips.render(f);
        //Reset rotations, positions and sizing:
        this.Hips.setScale(1.0F, 1.0F, 1.0F);
        this.Hips.scaleChildren = false;
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

        EntityPrehistoricFloraMarmorerpeton greer = (EntityPrehistoricFloraMarmorerpeton) e;

        this.faceTarget(f3, f4, 12, Head);

        float speed = 0.35F;

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3};
        AdvancedModelRenderer[] Torso = {this.Body, this.Chest};
        greer.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] LeftArm = {this.leftArm, this.leftArm2};
        AdvancedModelRenderer[] RightArm = {this.rightArm, this.rightArm2};

        AdvancedModelRenderer[] LeftLeg = {this.leftLeg, this.leftLeg2};
        AdvancedModelRenderer[] RightLeg = {this.rightLeg, this.rightLeg2};

        if (greer.isReallyInWater()) { //swim animation
            if(!greer.isAtBottom()) {
                this.setRotateAngle(leftArm, (float) Math.toRadians(0), -(float) Math.toRadians(47.5), -(float) Math.toRadians(7.5));
                this.setRotateAngle(rightArm, (float) Math.toRadians(0), (float) Math.toRadians(47.5), (float) Math.toRadians(7.5));
                this.setRotateAngle(leftArm2, -(float) Math.toRadians(0.3472), -(float) Math.toRadians(20.021), -(float) Math.toRadians(-7.3741));
                this.setRotateAngle(rightArm2, -(float) Math.toRadians(0.3472), (float) Math.toRadians(20.021), -(float) Math.toRadians(-7.3741));
                this.setRotateAngle(leftLeg, -(float) Math.toRadians(-1.0631), -(float) Math.toRadians(45.0107), -(float) Math.toRadians(6.6325));
                this.setRotateAngle(rightLeg, -(float) Math.toRadians(-1.0631), (float) Math.toRadians(45.0107), -(float) Math.toRadians(6.6325));
                this.setRotateAngle(leftLeg2, -(float) Math.toRadians(1.8636), -(float) Math.toRadians(25.0156), -(float) Math.toRadians(-1.0555));
                this.setRotateAngle(rightLeg2, -(float) Math.toRadians(1.8636), (float) Math.toRadians(25.0156), -(float) Math.toRadians(-1.0555));
                this.setRotateAngle(leftFoot, -(float) Math.toRadians(2.7647), -(float) Math.toRadians(-25.0981), -(float) Math.toRadians(-5.4974));
                this.setRotateAngle(rightFoot, -(float) Math.toRadians(2.7647), (float) Math.toRadians(-25.0981), -(float) Math.toRadians(-5.4974));

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
                this.swing(leftArm, speed, 0.6F, false, 3.0f, -0, f2, 0.7F);
                this.swing(rightArm, speed, -0.6F, false, 0f, -0, f2, 0.7F);
                this.swing(leftArm2, speed, -0.4F, true, 0f, -0, f2, 0.7F);
                this.swing(rightArm2, speed, -0.4F, true, 0f, -0, f2, 0.7F);


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
            this.swing(leftArm, speed, 0.6F, false, 3.0f, -0, f2, 0.7F);
            this.swing(rightArm, speed, -0.6F, false, 0f, -0, f2, 0.7F);
            this.swing(leftArm2, speed, -0.4F, true, 0f, -0, f2, 0.7F);
            this.swing(rightArm2, speed, -0.4F, true, 0f, -0, f2, 0.7F);


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
