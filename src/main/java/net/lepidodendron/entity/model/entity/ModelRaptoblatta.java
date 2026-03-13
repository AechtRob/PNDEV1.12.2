package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraRaptoblatta;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelRaptoblatta extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer leftLeg1_2;
    private final AdvancedModelRenderer leftLeg1_3_r1;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer rightLeg1_2;
    private final AdvancedModelRenderer rightLeg1_3_r1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3_r1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3_r1;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4_r1;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4_r1;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer leftForewing_r1;
    private final AdvancedModelRenderer rightForewing;
    private final AdvancedModelRenderer rightForewing_r1;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer leftHindwingFoldable;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer rightHindwingFoldable;

    private ModelAnimator animator;

    public ModelRaptoblatta() {
        this.textureWidth = 40;
        this.textureHeight = 31;

        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(0.2F, 21.9F, -1.8F);
        this.setRotateAngle(thorax, -0.1222F, 0.0F, 0.0F);
        this.thorax.cubeList.add(new ModelBox(thorax, 27, 16, -1.7F, -0.6F, -3.25F, 3, 1, 2, -0.001F, false));
        this.thorax.cubeList.add(new ModelBox(thorax, 0, 23, -2.2F, -0.6F, -1.5F, 4, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.0F, 7.8F);
        this.thorax.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.6981F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 14, 1.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.4F, 1.0F, 7.8F);
        this.thorax.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.6981F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 14, -1.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.4F, 0.3F, 5.1F);
        this.thorax.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 18, -2.1F, -0.5F, 1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.8F, 0.3F, 5.3F);
        this.thorax.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 8, -2.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.3F, 0.1F, 3.8F);
        this.thorax.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 27, -2.0F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.2F, -0.1F, 1.5F);
        this.thorax.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 22, -2.0F, -0.5F, 0.0F, 4, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.1F, 0.2F, 0.7F);
        this.thorax.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 5, -0.1F, -0.5F, 0.0F, 2, 1, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.2F, -0.6F, -3.25F);
        this.thorax.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 4, -2.0F, 0.0F, -1.0F, 4, 0, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.2F, -0.2F, -2.95F);
        this.thorax.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 23, -0.5F, -0.4F, -1.2F, 1, 1, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.2167F, -0.2312F, -4.2386F);
        this.thorax.addChild(head);
        this.setRotateAngle(head, -0.9861F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.4833F, -0.2566F, -0.125F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.6875F, -0.0912F, 0.0047F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 28, 0.6F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5167F, -0.2566F, -0.125F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.6875F, 0.0912F, -0.0047F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 28, -1.6F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.3833F, 0.8434F, 0.7249F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3665F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 14, 0.6F, -1.0F, -1.0F, 1, 2, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 14, 1.1F, -1.0F, -1.0F, 1, 2, 1, -0.001F, false));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.4871F, 1.1042F, -0.0727F);
        this.head.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, 0.9163F, -0.2094F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.8326F, -0.2F, -0.8926F);
        this.leftAntenna.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0329F, -0.3119F, -0.1462F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 14, -0.9F, 0.2F, -5.9F, 3, 0, 7, 0.0F, true));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.4537F, 1.1042F, -0.0727F);
        this.head.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, 0.9163F, 0.2094F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.8326F, -0.2F, -0.8926F);
        this.rightAntenna.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0329F, 0.3119F, 0.1462F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 14, -2.1F, 0.2F, -5.9F, 3, 0, 7, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.2F, 0.1F, -1.7F);
        this.thorax.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.6133F, -0.1647F, 0.5009F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1163F, 0.69F, -0.1814F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 27, -0.197F, -0.6F, 0.0654F, 4, 2, 0, 0.0F, true));

        this.leftLeg1_2 = new AdvancedModelRenderer(this);
        this.leftLeg1_2.setRotationPoint(2.2173F, 0.0156F, -1.7733F);
        this.leftLeg1.addChild(leftLeg1_2);


        this.leftLeg1_3_r1 = new AdvancedModelRenderer(this);
        this.leftLeg1_3_r1.setRotationPoint(0.3033F, 0.8664F, -0.8267F);
        this.leftLeg1_2.addChild(leftLeg1_3_r1);
        this.setRotateAngle(leftLeg1_3_r1, 0.6975F, -0.0336F, 1.6109F);
        this.leftLeg1_3_r1.cubeList.add(new ModelBox(leftLeg1_3_r1, 0, 5, -0.8755F, -1.1911F, 0.4287F, 3, 2, 0, 0.0F, true));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.6F, 0.1F, -1.7F);
        this.thorax.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.6133F, 0.1647F, -0.5009F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1163F, -0.69F, 0.1814F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 27, -3.803F, -0.6F, 0.0654F, 4, 2, 0, 0.0F, false));

        this.rightLeg1_2 = new AdvancedModelRenderer(this);
        this.rightLeg1_2.setRotationPoint(-2.2173F, 0.0156F, -1.7733F);
        this.rightLeg1.addChild(rightLeg1_2);


        this.rightLeg1_3_r1 = new AdvancedModelRenderer(this);
        this.rightLeg1_3_r1.setRotationPoint(-0.3033F, 0.8664F, -0.8267F);
        this.rightLeg1_2.addChild(rightLeg1_3_r1);
        this.setRotateAngle(rightLeg1_3_r1, 0.6975F, 0.0336F, -1.6109F);
        this.rightLeg1_3_r1.cubeList.add(new ModelBox(rightLeg1_3_r1, 0, 5, -2.1245F, -1.1911F, 0.4287F, 3, 2, 0, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.8314F, -0.0992F, -0.4F);
        this.thorax.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7087F, -0.2075F, 0.3647F);


        this.leftLeg3_r1 = new AdvancedModelRenderer(this);
        this.leftLeg3_r1.setRotationPoint(0.6433F, 1.359F, 1.1344F);
        this.leftLeg2.addChild(leftLeg3_r1);
        this.setRotateAngle(leftLeg3_r1, 0.1422F, -0.3545F, 0.1127F);
        this.leftLeg3_r1.cubeList.add(new ModelBox(leftLeg3_r1, 27, 12, -1.0F, -3.0F, -1.0F, 6, 3, 0, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-2.2314F, -0.0992F, -0.4F);
        this.thorax.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7087F, 0.2075F, -0.3647F);


        this.rightLeg3_r1 = new AdvancedModelRenderer(this);
        this.rightLeg3_r1.setRotationPoint(-0.6433F, 1.359F, 1.1344F);
        this.rightLeg2.addChild(rightLeg3_r1);
        this.setRotateAngle(rightLeg3_r1, 0.1422F, 0.3545F, -0.1127F);
        this.rightLeg3_r1.cubeList.add(new ModelBox(rightLeg3_r1, 27, 12, -5.0F, -3.0F, -1.0F, 6, 3, 0, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.8F, 0.1F, 0.5F);
        this.thorax.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.4633F, -0.5445F, 1.2602F);


        this.leftLeg4_r1 = new AdvancedModelRenderer(this);
        this.leftLeg4_r1.setRotationPoint(-0.3F, -0.2F, 0.1F);
        this.leftLeg3.addChild(leftLeg4_r1);
        this.setRotateAngle(leftLeg4_r1, -0.5566F, -0.8539F, 0.0527F);
        this.leftLeg4_r1.cubeList.add(new ModelBox(leftLeg4_r1, 25, 0, -0.0492F, -1.4F, -0.1134F, 7, 3, 0, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-2.2F, 0.1F, 0.5F);
        this.thorax.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.4633F, 0.5445F, -1.2602F);


        this.rightLeg4_r1 = new AdvancedModelRenderer(this);
        this.rightLeg4_r1.setRotationPoint(0.3F, -0.2F, 0.1F);
        this.rightLeg3.addChild(rightLeg4_r1);
        this.setRotateAngle(rightLeg4_r1, -0.5566F, 0.8539F, -0.0527F);
        this.rightLeg4_r1.cubeList.add(new ModelBox(rightLeg4_r1, 25, 0, -6.9508F, -1.4F, -0.1134F, 7, 3, 0, 0.0F, false));

        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(0.5F, -1.0F, -1.1F);
        this.thorax.addChild(leftForewing);
        this.setRotateAngle(leftForewing, 2.329F, -1.4416F, -2.3261F);


        this.leftForewing_r1 = new AdvancedModelRenderer(this);
        this.leftForewing_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftForewing.addChild(leftForewing_r1);
        this.setRotateAngle(leftForewing_r1, 0.003F, 0.0348F, 0.0873F);
        this.leftForewing_r1.cubeList.add(new ModelBox(leftForewing_r1, 0, 0, -0.2F, 0.301F, -1.8F, 10, 0, 4, 0.0F, true));

        this.rightForewing = new AdvancedModelRenderer(this);
        this.rightForewing.setRotationPoint(-0.9F, -1.025F, -1.1F);
        this.thorax.addChild(rightForewing);
        this.setRotateAngle(rightForewing, 2.329F, 1.4416F, 2.3261F);


        this.rightForewing_r1 = new AdvancedModelRenderer(this);
        this.rightForewing_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightForewing.addChild(rightForewing_r1);
        this.setRotateAngle(rightForewing_r1, 0.003F, -0.0348F, -0.0873F);
        this.rightForewing_r1.cubeList.add(new ModelBox(rightForewing_r1, 0, 0, -9.8F, 0.301F, -1.8F, 10, 0, 4, 0.0F, false));

        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(0.833F, -0.66F, 0.116F);
        this.thorax.addChild(leftHindwing);
        this.leftHindwing.cubeList.add(new ModelBox(leftHindwing, 0, 5, -3.0F, 0.001F, -0.5F, 4, 0, 8, 0.0F, true));

        this.leftHindwingFoldable = new AdvancedModelRenderer(this);
        this.leftHindwingFoldable.setRotationPoint(-3.0F, 0.0F, 4.5F);
        this.leftHindwing.addChild(leftHindwingFoldable);
        this.setRotateAngle(leftHindwingFoldable, 0.0F, 0.0F, -3.098F);
        this.leftHindwingFoldable.cubeList.add(new ModelBox(leftHindwingFoldable, 0, 14, -2.0F, 0.001F, -5.0F, 2, 0, 8, 0.0F, true));

        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(-1.233F, -0.66F, 0.116F);
        this.thorax.addChild(rightHindwing);
        this.rightHindwing.cubeList.add(new ModelBox(rightHindwing, 0, 5, -1.0F, 0.0F, -0.5F, 4, 0, 8, 0.0F, false));

        this.rightHindwingFoldable = new AdvancedModelRenderer(this);
        this.rightHindwingFoldable.setRotationPoint(3.0F, 0.0F, 4.5F);
        this.rightHindwing.addChild(rightHindwingFoldable);
        this.setRotateAngle(rightHindwingFoldable, 0.0F, 0.0F, 3.098F);
        this.rightHindwingFoldable.cubeList.add(new ModelBox(rightHindwingFoldable, 0, 14, 0.0F, 0.01F, -5.0F, 2, 0, 8, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.thorax.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(thorax, 0.0F, 0.0F, 0.0F);
        this.thorax.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.thorax.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        this.thorax.render(0.01f);
        resetToDefaultPose();

    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.thorax.offsetY = 0.0F;
        this.thorax.offsetX = 0.0F;
        this.thorax.offsetZ = 2.0F;
        this.thorax.rotateAngleY = (float)Math.toRadians(120);
        this.thorax.rotateAngleX = (float)Math.toRadians(0);
        this.thorax.rotateAngleZ = (float)Math.toRadians(0);
        this.thorax.scaleChildren = true;
        float scaler = 3.0F;
        this.thorax.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(thorax, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.thorax.render(f);
        //Reset rotations, positions and sizing:
        this.thorax.setScale(1.0F, 1.0F, 1.0F);
        this.thorax.scaleChildren = false;
        resetToDefaultPose();

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraRaptoblatta ee = (EntityPrehistoricFloraRaptoblatta) e;
        AdvancedModelRenderer[] Neck = {this.head};

        if (ee.getAnimation() != ee.LAY_ANIMATION && (!ee.getIsFlying()) && (!ee.getIsClimbing()) && (!ee.getIsFast())) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.1F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.2F, -0.02F, 0.5F, f2, 0.4F);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraRaptoblatta ee = (EntityPrehistoricFloraRaptoblatta) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getClimbFacing() == EnumFacing.NORTH
                    || ee.getClimbFacing() == EnumFacing.EAST
                    || ee.getClimbFacing() == EnumFacing.SOUTH
                    || ee.getClimbFacing() == EnumFacing.WEST
                    || ee.getIsClimbing()) {
                if (!ee.getHeadCollided()) {
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }
                else {
                    //Just pose with no animation running:
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                }
            }
            else if (ee.getIsMoving()) {
                if (!ee.getIsFlying()) {

                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                }
                else {
                    if (ee.getIsLaunching()) {
                        animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        //Is gliding:
                        animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
            }
        }
        else {
            if (ee.getIsLaunching()) {
//                animLaunching(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            else {
                //Is gliding:
                animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        if (ee.getAnimation() == ee.STAND_ANIMATION) { //The idle scratch
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRaptoblatta entity = (EntityPrehistoricFloraRaptoblatta) entitylivingbaseIn;
        int animCycle = 123;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (-10-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 34) {
            xx = -10 + (((tickAnim - 11) / 23) * (-10-(-10)));
            yy = 0 + (((tickAnim - 11) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 23) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = -10 + (((tickAnim - 34) / 11) * (-10-(-10)));
            yy = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = -10 + (((tickAnim - 45) / 9) * (-2.5-(-10)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 62) {
            xx = -2.5 + (((tickAnim - 54) / 8) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 54) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 8) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 63) {
            xx = -2.5 + (((tickAnim - 62) / 1) * (0.5-(-2.5)));
            yy = 0 + (((tickAnim - 62) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 1) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 0.5 + (((tickAnim - 63) / 2) * (-2.5-(0.5)));
            yy = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 114) {
            xx = -2.5 + (((tickAnim - 65) / 49) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 65) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 49) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 123) {
            xx = -2.5 + (((tickAnim - 114) / 9) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 114) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(thorax, thorax.rotateAngleX + (float) Math.toRadians(xx), thorax.rotateAngleY + (float) Math.toRadians(yy), thorax.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (1.275-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 11) / 23) * (0-(0)));
            yy = 1.275 + (((tickAnim - 11) / 23) * (1.275-(1.275)));
            zz = 0 + (((tickAnim - 11) / 23) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            yy = 1.275 + (((tickAnim - 34) / 11) * (1.275-(1.275)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            yy = 1.275 + (((tickAnim - 45) / 9) * (1.27-(1.275)));
            zz = 0 + (((tickAnim - 45) / 9) * (-0.525-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 54) / 8) * (0-(0)));
            yy = 1.27 + (((tickAnim - 54) / 8) * (1.27-(1.27)));
            zz = -0.525 + (((tickAnim - 54) / 8) * (-0.525-(-0.525)));
        }
        else if (tickAnim >= 62 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 62) / 1) * (0-(0)));
            yy = 1.27 + (((tickAnim - 62) / 1) * (1.27-(1.27)));
            zz = -0.525 + (((tickAnim - 62) / 1) * (-2.92-(-0.525)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            yy = 1.27 + (((tickAnim - 63) / 2) * (1.27-(1.27)));
            zz = -2.92 + (((tickAnim - 63) / 2) * (-0.525-(-2.92)));
        }
        else if (tickAnim >= 65 && tickAnim < 114) {
            xx = 0 + (((tickAnim - 65) / 49) * (0-(0)));
            yy = 1.27 + (((tickAnim - 65) / 49) * (1.27-(1.27)));
            zz = -0.525 + (((tickAnim - 65) / 49) * (-0.525-(-0.525)));
        }
        else if (tickAnim >= 114 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 114) / 9) * (0-(0)));
            yy = 1.27 + (((tickAnim - 114) / 9) * (0-(1.27)));
            zz = -0.525 + (((tickAnim - 114) / 9) * (0-(-0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.thorax.rotationPointX = this.thorax.rotationPointX + (float)(xx);
        this.thorax.rotationPointY = this.thorax.rotationPointY - (float)(yy);
        this.thorax.rotationPointZ = this.thorax.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (25-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 25 + (((tickAnim - 11) / 6) * (26.64113-(25)));
            yy = 0 + (((tickAnim - 11) / 6) * (23.83799-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (7.76356-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 26.64113 + (((tickAnim - 17) / 2) * (26.64113-(26.64113)));
            yy = 23.83799 + (((tickAnim - 17) / 2) * (23.83799-(23.83799)));
            zz = 7.76356 + (((tickAnim - 17) / 2) * (7.76356-(7.76356)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 26.64113 + (((tickAnim - 19) / 6) * (26.30962-(26.64113)));
            yy = 23.83799 + (((tickAnim - 19) / 6) * (-21.46686-(23.83799)));
            zz = 7.76356 + (((tickAnim - 19) / 6) * (-6.90227-(7.76356)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 26.30962 + (((tickAnim - 25) / 2) * (26.30962-(26.30962)));
            yy = -21.46686 + (((tickAnim - 25) / 2) * (-21.46686-(-21.46686)));
            zz = -6.90227 + (((tickAnim - 25) / 2) * (-6.90227-(-6.90227)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 26.30962 + (((tickAnim - 27) / 4) * (25.56491-(26.30962)));
            yy = -21.46686 + (((tickAnim - 27) / 4) * (14.33016-(-21.46686)));
            zz = -6.90227 + (((tickAnim - 27) / 4) * (4.48416-(-6.90227)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 25.56491 + (((tickAnim - 31) / 3) * (47.5-(25.56491)));
            yy = 14.33016 + (((tickAnim - 31) / 3) * (0-(14.33016)));
            zz = 4.48416 + (((tickAnim - 31) / 3) * (0-(4.48416)));
        }
        else if (tickAnim >= 34 && tickAnim < 65) {
            xx = 47.5 + (((tickAnim - 34) / 31) * (47.5-(47.5)));
            yy = 0 + (((tickAnim - 34) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 31) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 71) {
            xx = 47.5 + (((tickAnim - 65) / 6) * (47.5-(47.5)));
            yy = 0 + (((tickAnim - 65) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 6) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 74) {
            xx = 47.5 + (((tickAnim - 71) / 3) * (47.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5-(47.5)));
            yy = 0 + (((tickAnim - 71) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 3) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 79) {
            xx = 47.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5 + (((tickAnim - 74) / 5) * (47.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*750))*10-(47.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*5)));
            yy = 0 + (((tickAnim - 74) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 5) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 110) {
            xx = 47.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*750))*10 + (((tickAnim - 79) / 31) * (47.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*750))*10-(47.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*750))*10)));
            yy = 0 + (((tickAnim - 79) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 31) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 114) {
            xx = 47.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*750))*10 + (((tickAnim - 110) / 4) * (47.5-(47.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*750))*10)));
            yy = 0 + (((tickAnim - 110) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 4) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 123) {
            xx = 47.5 + (((tickAnim - 114) / 9) * (0-(47.5)));
            yy = 0 + (((tickAnim - 114) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -20 + (((tickAnim - 12) / 2) * (-20.32-Math.sin((Math.PI/180)*(((double)tickAnim/20)*750))*5-(-20)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 50) {
            xx = -20.32-Math.sin((Math.PI/180)*(((double)tickAnim/20)*750))*5 + (((tickAnim - 14) / 36) * (-27.5-(-20.32-Math.sin((Math.PI/180)*(((double)tickAnim/20)*750))*5)));
            yy = 0 + (((tickAnim - 14) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 36) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 112) {
            xx = -27.5 + (((tickAnim - 50) / 62) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 50) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 62) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 123) {
            xx = -27.5 + (((tickAnim - 112) / 11) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 112) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(xx), leftAntenna.rotateAngleY + (float) Math.toRadians(yy), leftAntenna.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -20 + (((tickAnim - 12) / 2) * (-20.32-Math.sin((Math.PI/180)*(((double)tickAnim/20)*750+30))*5-(-20)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 50) {
            xx = -20.32-Math.sin((Math.PI/180)*(((double)tickAnim/20)*750+30))*5 + (((tickAnim - 14) / 36) * (-27.5-(-20.32-Math.sin((Math.PI/180)*(((double)tickAnim/20)*750+30))*5)));
            yy = 0 + (((tickAnim - 14) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 36) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 112) {
            xx = -27.5 + (((tickAnim - 50) / 62) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 50) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 62) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 123) {
            xx = -27.5 + (((tickAnim - 112) / 11) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 112) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(xx), rightAntenna.rotateAngleY + (float) Math.toRadians(yy), rightAntenna.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5.79867-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (16.74998-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-7.05194-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -5.79867 + (((tickAnim - 3) / 3) * (-5.79867-(-5.79867)));
            yy = 16.74998 + (((tickAnim - 3) / 3) * (16.74998-(16.74998)));
            zz = -7.05194 + (((tickAnim - 3) / 3) * (-7.05194-(-7.05194)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -5.79867 + (((tickAnim - 6) / 2) * (60.50333-(-5.79867)));
            yy = 16.74998 + (((tickAnim - 6) / 2) * (41.87494-(16.74998)));
            zz = -7.05194 + (((tickAnim - 6) / 2) * (-17.62985-(-7.05194)));
        }
        else if (tickAnim >= 8 && tickAnim < 45) {
            xx = 60.50333 + (((tickAnim - 8) / 37) * (60.50333-(60.50333)));
            yy = 41.87494 + (((tickAnim - 8) / 37) * (41.87494-(41.87494)));
            zz = -17.62985 + (((tickAnim - 8) / 37) * (-17.62985-(-17.62985)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 60.50333 + (((tickAnim - 45) / 10) * (40.98704-(60.50333)));
            yy = 41.87494 + (((tickAnim - 45) / 10) * (30.12722-(41.87494)));
            zz = -17.62985 + (((tickAnim - 45) / 10) * (-14.82568-(-17.62985)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 40.98704 + (((tickAnim - 55) / 5) * (40.98704-(40.98704)));
            yy = 30.12722 + (((tickAnim - 55) / 5) * (30.12722-(30.12722)));
            zz = -14.82568 + (((tickAnim - 55) / 5) * (-14.82568-(-14.82568)));
        }
        else if (tickAnim >= 60 && tickAnim < 62) {
            xx = 40.98704 + (((tickAnim - 60) / 2) * (31.6658-(40.98704)));
            yy = 30.12722 + (((tickAnim - 60) / 2) * (27.31034-(30.12722)));
            zz = -14.82568 + (((tickAnim - 60) / 2) * (4.75012-(-14.82568)));
        }
        else if (tickAnim >= 62 && tickAnim < 63) {
            xx = 31.6658 + (((tickAnim - 62) / 1) * (48.59191-(31.6658)));
            yy = 27.31034 + (((tickAnim - 62) / 1) * (29.64328-(27.31034)));
            zz = 4.75012 + (((tickAnim - 62) / 1) * (63.55109-(4.75012)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 48.59191 + (((tickAnim - 63) / 2) * (32.81574-(48.59191)));
            yy = 29.64328 + (((tickAnim - 63) / 2) * (33.44841-(29.64328)));
            zz = 63.55109 + (((tickAnim - 63) / 2) * (23.14931-(63.55109)));
        }
        else if (tickAnim >= 65 && tickAnim < 79) {
            xx = 32.81574 + (((tickAnim - 65) / 14) * (32.81574-(32.81574)));
            yy = 33.44841 + (((tickAnim - 65) / 14) * (33.44841-(33.44841)));
            zz = 23.14931 + (((tickAnim - 65) / 14) * (23.14931-(23.14931)));
        }
        else if (tickAnim >= 79 && tickAnim < 110) {
            xx = 32.81574 + (((tickAnim - 79) / 31) * (30.60663-(32.81574)));
            yy = 33.44841 + (((tickAnim - 79) / 31) * (33.14901-(33.44841)));
            zz = 23.14931 + (((tickAnim - 79) / 31) * (17.69152-(23.14931)));
        }
        else if (tickAnim >= 110 && tickAnim < 114) {
            xx = 30.60663 + (((tickAnim - 110) / 4) * (30.60663-(30.60663)));
            yy = 33.14901 + (((tickAnim - 110) / 4) * (33.14901-(33.14901)));
            zz = 17.69152 + (((tickAnim - 110) / 4) * (17.69152-(17.69152)));
        }
        else if (tickAnim >= 114 && tickAnim < 123) {
            xx = 30.60663 + (((tickAnim - 114) / 9) * (0-(30.60663)));
            yy = 33.14901 + (((tickAnim - 114) / 9) * (0-(33.14901)));
            zz = 17.69152 + (((tickAnim - 114) / 9) * (0-(17.69152)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (42.45893-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-8.02431-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (27.64471-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 45) {
            xx = 42.45893 + (((tickAnim - 4) / 41) * (42.45893-(42.45893)));
            yy = -8.02431 + (((tickAnim - 4) / 41) * (-8.02431-(-8.02431)));
            zz = 27.64471 + (((tickAnim - 4) / 41) * (27.64471-(27.64471)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 42.45893 + (((tickAnim - 45) / 10) * (11.51758-(42.45893)));
            yy = -8.02431 + (((tickAnim - 45) / 10) * (6.7838-(-8.02431)));
            zz = 27.64471 + (((tickAnim - 45) / 10) * (15.45628-(27.64471)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 11.51758 + (((tickAnim - 55) / 5) * (11.51758-(11.51758)));
            yy = 6.7838 + (((tickAnim - 55) / 5) * (6.7838-(6.7838)));
            zz = 15.45628 + (((tickAnim - 55) / 5) * (15.45628-(15.45628)));
        }
        else if (tickAnim >= 60 && tickAnim < 62) {
            xx = 11.51758 + (((tickAnim - 60) / 2) * (-14.3911-(11.51758)));
            yy = 6.7838 + (((tickAnim - 60) / 2) * (-20.23949-(6.7838)));
            zz = 15.45628 + (((tickAnim - 60) / 2) * (-49.3308-(15.45628)));
        }
        else if (tickAnim >= 62 && tickAnim < 63) {
            xx = -14.3911 + (((tickAnim - 62) / 1) * (-14.3911-(-14.3911)));
            yy = -20.23949 + (((tickAnim - 62) / 1) * (-20.23949-(-20.23949)));
            zz = -49.3308 + (((tickAnim - 62) / 1) * (-49.3308-(-49.3308)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = -14.3911 + (((tickAnim - 63) / 2) * (5.87641-(-14.3911)));
            yy = -20.23949 + (((tickAnim - 63) / 2) * (-7.37448-(-20.23949)));
            zz = -49.3308 + (((tickAnim - 63) / 2) * (16.52137-(-49.3308)));
        }
        else if (tickAnim >= 65 && tickAnim < 79) {
            xx = 5.87641 + (((tickAnim - 65) / 14) * (5.87641-(5.87641)));
            yy = -7.37448 + (((tickAnim - 65) / 14) * (-7.37448-(-7.37448)));
            zz = 16.52137 + (((tickAnim - 65) / 14) * (16.52137-(16.52137)));
        }
        else if (tickAnim >= 79 && tickAnim < 110) {
            xx = 5.87641 + (((tickAnim - 79) / 31) * (7.02505-(5.87641)));
            yy = -7.37448 + (((tickAnim - 79) / 31) * (-3.71982-(-7.37448)));
            zz = 16.52137 + (((tickAnim - 79) / 31) * (29.45041-(16.52137)));
        }
        else if (tickAnim >= 110 && tickAnim < 114) {
            xx = 7.02505 + (((tickAnim - 110) / 4) * (7.02505-(7.02505)));
            yy = -3.71982 + (((tickAnim - 110) / 4) * (-3.71982-(-3.71982)));
            zz = 29.45041 + (((tickAnim - 110) / 4) * (29.45041-(29.45041)));
        }
        else if (tickAnim >= 114 && tickAnim < 123) {
            xx = 7.02505 + (((tickAnim - 114) / 9) * (0-(7.02505)));
            yy = -3.71982 + (((tickAnim - 114) / 9) * (0-(-3.71982)));
            zz = 29.45041 + (((tickAnim - 114) / 9) * (0-(29.45041)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1_2, leftLeg1_2.rotateAngleX + (float) Math.toRadians(xx), leftLeg1_2.rotateAngleY + (float) Math.toRadians(yy), leftLeg1_2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5.79867-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-16.74998-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (7.05194-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -5.79867 + (((tickAnim - 3) / 3) * (-5.79867-(-5.79867)));
            yy = -16.74998 + (((tickAnim - 3) / 3) * (-16.74998-(-16.74998)));
            zz = 7.05194 + (((tickAnim - 3) / 3) * (7.05194-(7.05194)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -5.79867 + (((tickAnim - 6) / 2) * (60.50333-(-5.79867)));
            yy = -16.74998 + (((tickAnim - 6) / 2) * (-41.87494-(-16.74998)));
            zz = 7.05194 + (((tickAnim - 6) / 2) * (17.62985-(7.05194)));
        }
        else if (tickAnim >= 8 && tickAnim < 45) {
            xx = 60.50333 + (((tickAnim - 8) / 37) * (60.50333-(60.50333)));
            yy = -41.87494 + (((tickAnim - 8) / 37) * (-41.87494-(-41.87494)));
            zz = 17.62985 + (((tickAnim - 8) / 37) * (17.62985-(17.62985)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 60.50333 + (((tickAnim - 45) / 10) * (40.98704-(60.50333)));
            yy = -41.87494 + (((tickAnim - 45) / 10) * (-30.12722-(-41.87494)));
            zz = 17.62985 + (((tickAnim - 45) / 10) * (14.82568-(17.62985)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 40.98704 + (((tickAnim - 55) / 5) * (40.98704-(40.98704)));
            yy = -30.12722 + (((tickAnim - 55) / 5) * (-30.12722-(-30.12722)));
            zz = 14.82568 + (((tickAnim - 55) / 5) * (14.82568-(14.82568)));
        }
        else if (tickAnim >= 60 && tickAnim < 62) {
            xx = 40.98704 + (((tickAnim - 60) / 2) * (31.6658-(40.98704)));
            yy = -30.12722 + (((tickAnim - 60) / 2) * (-27.31034-(-30.12722)));
            zz = 14.82568 + (((tickAnim - 60) / 2) * (-4.75012-(14.82568)));
        }
        else if (tickAnim >= 62 && tickAnim < 63) {
            xx = 31.6658 + (((tickAnim - 62) / 1) * (48.59191-(31.6658)));
            yy = -27.31034 + (((tickAnim - 62) / 1) * (-29.64328-(-27.31034)));
            zz = -4.75012 + (((tickAnim - 62) / 1) * (-63.55109-(-4.75012)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 48.59191 + (((tickAnim - 63) / 2) * (32.81574-(48.59191)));
            yy = -29.64328 + (((tickAnim - 63) / 2) * (-33.44841-(-29.64328)));
            zz = -63.55109 + (((tickAnim - 63) / 2) * (-23.14931-(-63.55109)));
        }
        else if (tickAnim >= 65 && tickAnim < 79) {
            xx = 32.81574 + (((tickAnim - 65) / 14) * (32.81574-(32.81574)));
            yy = -33.44841 + (((tickAnim - 65) / 14) * (-33.44841-(-33.44841)));
            zz = -23.14931 + (((tickAnim - 65) / 14) * (-23.14931-(-23.14931)));
        }
        else if (tickAnim >= 79 && tickAnim < 110) {
            xx = 32.81574 + (((tickAnim - 79) / 31) * (30.60663-(32.81574)));
            yy = -33.44841 + (((tickAnim - 79) / 31) * (-33.14901-(-33.44841)));
            zz = -23.14931 + (((tickAnim - 79) / 31) * (-17.69152-(-23.14931)));
        }
        else if (tickAnim >= 110 && tickAnim < 114) {
            xx = 30.60663 + (((tickAnim - 110) / 4) * (30.60663-(30.60663)));
            yy = -33.14901 + (((tickAnim - 110) / 4) * (-33.14901-(-33.14901)));
            zz = -17.69152 + (((tickAnim - 110) / 4) * (-17.69152-(-17.69152)));
        }
        else if (tickAnim >= 114 && tickAnim < 123) {
            xx = 30.60663 + (((tickAnim - 114) / 9) * (0-(30.60663)));
            yy = -33.14901 + (((tickAnim - 114) / 9) * (0-(-33.14901)));
            zz = -17.69152 + (((tickAnim - 114) / 9) * (0-(-17.69152)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (42.45893-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (8.02431-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-27.64471-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 45) {
            xx = 42.45893 + (((tickAnim - 4) / 41) * (42.45893-(42.45893)));
            yy = 8.02431 + (((tickAnim - 4) / 41) * (8.02431-(8.02431)));
            zz = -27.64471 + (((tickAnim - 4) / 41) * (-27.64471-(-27.64471)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 42.45893 + (((tickAnim - 45) / 10) * (11.51758-(42.45893)));
            yy = 8.02431 + (((tickAnim - 45) / 10) * (-6.7838-(8.02431)));
            zz = -27.64471 + (((tickAnim - 45) / 10) * (-15.45628-(-27.64471)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 11.51758 + (((tickAnim - 55) / 5) * (11.51758-(11.51758)));
            yy = -6.7838 + (((tickAnim - 55) / 5) * (-6.7838-(-6.7838)));
            zz = -15.45628 + (((tickAnim - 55) / 5) * (-15.45628-(-15.45628)));
        }
        else if (tickAnim >= 60 && tickAnim < 62) {
            xx = 11.51758 + (((tickAnim - 60) / 2) * (-14.3911-(11.51758)));
            yy = -6.7838 + (((tickAnim - 60) / 2) * (20.23949-(-6.7838)));
            zz = -15.45628 + (((tickAnim - 60) / 2) * (49.3308-(-15.45628)));
        }
        else if (tickAnim >= 62 && tickAnim < 63) {
            xx = -14.3911 + (((tickAnim - 62) / 1) * (-14.3911-(-14.3911)));
            yy = 20.23949 + (((tickAnim - 62) / 1) * (20.23949-(20.23949)));
            zz = 49.3308 + (((tickAnim - 62) / 1) * (49.3308-(49.3308)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = -14.3911 + (((tickAnim - 63) / 2) * (5.87641-(-14.3911)));
            yy = 20.23949 + (((tickAnim - 63) / 2) * (7.37448-(20.23949)));
            zz = 49.3308 + (((tickAnim - 63) / 2) * (-16.52137-(49.3308)));
        }
        else if (tickAnim >= 65 && tickAnim < 79) {
            xx = 5.87641 + (((tickAnim - 65) / 14) * (5.87641-(5.87641)));
            yy = 7.37448 + (((tickAnim - 65) / 14) * (7.37448-(7.37448)));
            zz = -16.52137 + (((tickAnim - 65) / 14) * (-16.52137-(-16.52137)));
        }
        else if (tickAnim >= 79 && tickAnim < 110) {
            xx = 5.87641 + (((tickAnim - 79) / 31) * (7.02505-(5.87641)));
            yy = 7.37448 + (((tickAnim - 79) / 31) * (3.71982-(7.37448)));
            zz = -16.52137 + (((tickAnim - 79) / 31) * (-29.45041-(-16.52137)));
        }
        else if (tickAnim >= 110 && tickAnim < 114) {
            xx = 7.02505 + (((tickAnim - 110) / 4) * (7.02505-(7.02505)));
            yy = 3.71982 + (((tickAnim - 110) / 4) * (3.71982-(3.71982)));
            zz = -29.45041 + (((tickAnim - 110) / 4) * (-29.45041-(-29.45041)));
        }
        else if (tickAnim >= 114 && tickAnim < 123) {
            xx = 7.02505 + (((tickAnim - 114) / 9) * (0-(7.02505)));
            yy = 3.71982 + (((tickAnim - 114) / 9) * (0-(3.71982)));
            zz = -29.45041 + (((tickAnim - 114) / 9) * (0-(-29.45041)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1_2, rightLeg1_2.rotateAngleX + (float) Math.toRadians(xx), rightLeg1_2.rotateAngleY + (float) Math.toRadians(yy), rightLeg1_2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-19.92837-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (20.92433-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-23.99399-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -19.92837 + (((tickAnim - 2) / 4) * (-46.82451-(-19.92837)));
            yy = 20.92433 + (((tickAnim - 2) / 4) * (44.58219-(20.92433)));
            zz = -23.99399 + (((tickAnim - 2) / 4) * (-21.28985-(-23.99399)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -46.82451 + (((tickAnim - 6) / 5) * (-48.76199-(-46.82451)));
            yy = 44.58219 + (((tickAnim - 6) / 5) * (36.79491-(44.58219)));
            zz = -21.28985 + (((tickAnim - 6) / 5) * (4.11578-(-21.28985)));
        }
        else if (tickAnim >= 11 && tickAnim < 45) {
            xx = -48.76199 + (((tickAnim - 11) / 34) * (-48.76199-(-48.76199)));
            yy = 36.79491 + (((tickAnim - 11) / 34) * (36.79491-(36.79491)));
            zz = 4.11578 + (((tickAnim - 11) / 34) * (4.11578-(4.11578)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -48.76199 + (((tickAnim - 45) / 5) * (-42.04216-(-48.76199)));
            yy = 36.79491 + (((tickAnim - 45) / 5) * (48.1339-(36.79491)));
            zz = 4.11578 + (((tickAnim - 45) / 5) * (-9.00945-(4.11578)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = -42.04216 + (((tickAnim - 50) / 4) * (-38.00856-(-42.04216)));
            yy = 48.1339 + (((tickAnim - 50) / 4) * (52.9813-(48.1339)));
            zz = -9.00945 + (((tickAnim - 50) / 4) * (5.54866-(-9.00945)));
        }
        else if (tickAnim >= 54 && tickAnim < 61) {
            xx = -38.00856 + (((tickAnim - 54) / 7) * (-38.00856-(-38.00856)));
            yy = 52.9813 + (((tickAnim - 54) / 7) * (52.9813-(52.9813)));
            zz = 5.54866 + (((tickAnim - 54) / 7) * (5.54866-(5.54866)));
        }
        else if (tickAnim >= 61 && tickAnim < 63) {
            xx = -38.00856 + (((tickAnim - 61) / 2) * (-39.19845-(-38.00856)));
            yy = 52.9813 + (((tickAnim - 61) / 2) * (25.5769-(52.9813)));
            zz = 5.54866 + (((tickAnim - 61) / 2) * (1.74452-(5.54866)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = -39.19845 + (((tickAnim - 63) / 2) * (-38.00856-(-39.19845)));
            yy = 25.5769 + (((tickAnim - 63) / 2) * (52.9813-(25.5769)));
            zz = 1.74452 + (((tickAnim - 63) / 2) * (5.54866-(1.74452)));
        }
        else if (tickAnim >= 65 && tickAnim < 114) {
            xx = -38.00856 + (((tickAnim - 65) / 49) * (-38.00856-(-38.00856)));
            yy = 52.9813 + (((tickAnim - 65) / 49) * (52.9813-(52.9813)));
            zz = 5.54866 + (((tickAnim - 65) / 49) * (5.54866-(5.54866)));
        }
        else if (tickAnim >= 114 && tickAnim < 118) {
            xx = -38.00856 + (((tickAnim - 114) / 4) * (-30.2116-(-38.00856)));
            yy = 52.9813 + (((tickAnim - 114) / 4) * (35.7189-(52.9813)));
            zz = 5.54866 + (((tickAnim - 114) / 4) * (-30.32685-(5.54866)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = -30.2116 + (((tickAnim - 118) / 5) * (0-(-30.2116)));
            yy = 35.7189 + (((tickAnim - 118) / 5) * (0-(35.7189)));
            zz = -30.32685 + (((tickAnim - 118) / 5) * (0-(-30.32685)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (-19.92837-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (-20.92433-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (23.99399-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -19.92837 + (((tickAnim - 10) / 4) * (-48.76199-(-19.92837)));
            yy = -20.92433 + (((tickAnim - 10) / 4) * (-36.79491-(-20.92433)));
            zz = 23.99399 + (((tickAnim - 10) / 4) * (-4.11578-(23.99399)));
        }
        else if (tickAnim >= 14 && tickAnim < 45) {
            xx = -48.76199 + (((tickAnim - 14) / 31) * (-48.76199-(-48.76199)));
            yy = -36.79491 + (((tickAnim - 14) / 31) * (-36.79491-(-36.79491)));
            zz = -4.11578 + (((tickAnim - 14) / 31) * (-4.11578-(-4.11578)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -48.76199 + (((tickAnim - 45) / 5) * (-42.04216-(-48.76199)));
            yy = -36.79491 + (((tickAnim - 45) / 5) * (-48.1339-(-36.79491)));
            zz = -4.11578 + (((tickAnim - 45) / 5) * (9.00945-(-4.11578)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = -42.04216 + (((tickAnim - 50) / 4) * (-38.00856-(-42.04216)));
            yy = -48.1339 + (((tickAnim - 50) / 4) * (-52.9813-(-48.1339)));
            zz = 9.00945 + (((tickAnim - 50) / 4) * (-5.54866-(9.00945)));
        }
        else if (tickAnim >= 54 && tickAnim < 61) {
            xx = -38.00856 + (((tickAnim - 54) / 7) * (-38.00856-(-38.00856)));
            yy = -52.9813 + (((tickAnim - 54) / 7) * (-52.9813-(-52.9813)));
            zz = -5.54866 + (((tickAnim - 54) / 7) * (-5.54866-(-5.54866)));
        }
        else if (tickAnim >= 61 && tickAnim < 63) {
            xx = -38.00856 + (((tickAnim - 61) / 2) * (-39.19845-(-38.00856)));
            yy = -52.9813 + (((tickAnim - 61) / 2) * (-25.5769-(-52.9813)));
            zz = -5.54866 + (((tickAnim - 61) / 2) * (-1.74452-(-5.54866)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = -39.19845 + (((tickAnim - 63) / 2) * (-38.00856-(-39.19845)));
            yy = -25.5769 + (((tickAnim - 63) / 2) * (-52.9813-(-25.5769)));
            zz = -1.74452 + (((tickAnim - 63) / 2) * (-5.54866-(-1.74452)));
        }
        else if (tickAnim >= 65 && tickAnim < 109) {
            xx = -38.00856 + (((tickAnim - 65) / 44) * (-38.00856-(-38.00856)));
            yy = -52.9813 + (((tickAnim - 65) / 44) * (-52.9813-(-52.9813)));
            zz = -5.54866 + (((tickAnim - 65) / 44) * (-5.54866-(-5.54866)));
        }
        else if (tickAnim >= 109 && tickAnim < 114) {
            xx = -38.00856 + (((tickAnim - 109) / 5) * (-30.2116-(-38.00856)));
            yy = -52.9813 + (((tickAnim - 109) / 5) * (-35.7189-(-52.9813)));
            zz = -5.54866 + (((tickAnim - 109) / 5) * (30.32685-(-5.54866)));
        }
        else if (tickAnim >= 114 && tickAnim < 118) {
            xx = -30.2116 + (((tickAnim - 114) / 4) * (0-(-30.2116)));
            yy = -35.7189 + (((tickAnim - 114) / 4) * (0-(-35.7189)));
            zz = 30.32685 + (((tickAnim - 114) / 4) * (0-(30.32685)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (21.83853-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (27.75697-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (-40.70248-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 21.83853 + (((tickAnim - 12) / 3) * (29.75676-(21.83853)));
            yy = 27.75697 + (((tickAnim - 12) / 3) * (42.81084-(27.75697)));
            zz = -40.70248 + (((tickAnim - 12) / 3) * (-17.49632-(-40.70248)));
        }
        else if (tickAnim >= 15 && tickAnim < 61) {
            xx = 29.75676 + (((tickAnim - 15) / 46) * (29.75676-(29.75676)));
            yy = 42.81084 + (((tickAnim - 15) / 46) * (42.81084-(42.81084)));
            zz = -17.49632 + (((tickAnim - 15) / 46) * (-17.49632-(-17.49632)));
        }
        else if (tickAnim >= 61 && tickAnim < 62) {
            xx = 29.75676 + (((tickAnim - 61) / 1) * (29.44002-(29.75676)));
            yy = 42.81084 + (((tickAnim - 61) / 1) * (40.39161-(42.81084)));
            zz = -17.49632 + (((tickAnim - 61) / 1) * (-13.80702-(-17.49632)));
        }
        else if (tickAnim >= 62 && tickAnim < 63) {
            xx = 29.44002 + (((tickAnim - 62) / 1) * (10.48441-(29.44002)));
            yy = 40.39161 + (((tickAnim - 62) / 1) * (28.88772-(40.39161)));
            zz = -13.80702 + (((tickAnim - 62) / 1) * (-13.89775-(-13.80702)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 10.48441 + (((tickAnim - 63) / 2) * (29.75676-(10.48441)));
            yy = 28.88772 + (((tickAnim - 63) / 2) * (42.81084-(28.88772)));
            zz = -13.89775 + (((tickAnim - 63) / 2) * (-17.49632-(-13.89775)));
        }
        else if (tickAnim >= 65 && tickAnim < 107) {
            xx = 29.75676 + (((tickAnim - 65) / 42) * (29.75676-(29.75676)));
            yy = 42.81084 + (((tickAnim - 65) / 42) * (42.81084-(42.81084)));
            zz = -17.49632 + (((tickAnim - 65) / 42) * (-17.49632-(-17.49632)));
        }
        else if (tickAnim >= 107 && tickAnim < 112) {
            xx = 29.75676 + (((tickAnim - 107) / 5) * (30.29499-(29.75676)));
            yy = 42.81084 + (((tickAnim - 107) / 5) * (5.3713-(42.81084)));
            zz = -17.49632 + (((tickAnim - 107) / 5) * (-26.00989-(-17.49632)));
        }
        else if (tickAnim >= 112 && tickAnim < 118) {
            xx = 30.29499 + (((tickAnim - 112) / 6) * (-3.21687-(30.29499)));
            yy = 5.3713 + (((tickAnim - 112) / 6) * (4.33304-(5.3713)));
            zz = -26.00989 + (((tickAnim - 112) / 6) * (7.52118-(-26.00989)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = -3.21687 + (((tickAnim - 118) / 5) * (0-(-3.21687)));
            yy = 4.33304 + (((tickAnim - 118) / 5) * (0-(4.33304)));
            zz = 7.52118 + (((tickAnim - 118) / 5) * (0-(7.52118)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (21.83853-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (-27.75697-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (40.70248-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 21.83853 + (((tickAnim - 18) / 3) * (29.75676-(21.83853)));
            yy = -27.75697 + (((tickAnim - 18) / 3) * (-42.81084-(-27.75697)));
            zz = 40.70248 + (((tickAnim - 18) / 3) * (17.49632-(40.70248)));
        }
        else if (tickAnim >= 21 && tickAnim < 61) {
            xx = 29.75676 + (((tickAnim - 21) / 40) * (29.75676-(29.75676)));
            yy = -42.81084 + (((tickAnim - 21) / 40) * (-42.81084-(-42.81084)));
            zz = 17.49632 + (((tickAnim - 21) / 40) * (17.49632-(17.49632)));
        }
        else if (tickAnim >= 61 && tickAnim < 62) {
            xx = 29.75676 + (((tickAnim - 61) / 1) * (29.44002-(29.75676)));
            yy = -42.81084 + (((tickAnim - 61) / 1) * (-40.39161-(-42.81084)));
            zz = 17.49632 + (((tickAnim - 61) / 1) * (13.80702-(17.49632)));
        }
        else if (tickAnim >= 62 && tickAnim < 63) {
            xx = 29.44002 + (((tickAnim - 62) / 1) * (10.48441-(29.44002)));
            yy = -40.39161 + (((tickAnim - 62) / 1) * (-28.88772-(-40.39161)));
            zz = 13.80702 + (((tickAnim - 62) / 1) * (13.89775-(13.80702)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 10.48441 + (((tickAnim - 63) / 2) * (29.75676-(10.48441)));
            yy = -28.88772 + (((tickAnim - 63) / 2) * (-42.81084-(-28.88772)));
            zz = 13.89775 + (((tickAnim - 63) / 2) * (17.49632-(13.89775)));
        }
        else if (tickAnim >= 65 && tickAnim < 103) {
            xx = 29.75676 + (((tickAnim - 65) / 38) * (29.75676-(29.75676)));
            yy = -42.81084 + (((tickAnim - 65) / 38) * (-42.81084-(-42.81084)));
            zz = 17.49632 + (((tickAnim - 65) / 38) * (17.49632-(17.49632)));
        }
        else if (tickAnim >= 103 && tickAnim < 108) {
            xx = 29.75676 + (((tickAnim - 103) / 5) * (30.29499-(29.75676)));
            yy = -42.81084 + (((tickAnim - 103) / 5) * (-5.3713-(-42.81084)));
            zz = 17.49632 + (((tickAnim - 103) / 5) * (26.00989-(17.49632)));
        }
        else if (tickAnim >= 108 && tickAnim < 114) {
            xx = 30.29499 + (((tickAnim - 108) / 6) * (-4.10593-(30.29499)));
            yy = -5.3713 + (((tickAnim - 108) / 6) * (-8.94013-(-5.3713)));
            zz = 26.00989 + (((tickAnim - 108) / 6) * (-9.65825-(26.00989)));
        }
        else if (tickAnim >= 114 && tickAnim < 123) {
            xx = -4.10593 + (((tickAnim - 114) / 9) * (0-(-4.10593)));
            yy = -8.94013 + (((tickAnim - 114) / 9) * (0-(-8.94013)));
            zz = -9.65825 + (((tickAnim - 114) / 9) * (0-(-9.65825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraRaptoblatta entity = (EntityPrehistoricFloraRaptoblatta) entitylivingbaseIn;
        int animCycle = 9;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(thorax, thorax.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750*2))*2), thorax.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750+100))*2), thorax.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750-90))*4));
        this.thorax.rotationPointX = this.thorax.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750-60))*0.1);
        this.thorax.rotationPointY = this.thorax.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750*2-60))*0.1);
        this.thorax.rotationPointZ = this.thorax.rotationPointZ + (float)(0);


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*10), leftAntenna.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*4), leftAntenna.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*4));


        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750+50))*10), rightAntenna.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*4)), rightAntenna.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*4)));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 29.83945 + (((tickAnim - 0) / 5) * (27.69627-(29.83945)));
            yy = 23.02381 + (((tickAnim - 0) / 5) * (-21.02372-(23.02381)));
            zz = -5.52212 + (((tickAnim - 0) / 5) * (-35.77467-(-5.52212)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 27.69627 + (((tickAnim - 5) / 2) * (25.32701-(27.69627)));
            yy = -21.02372 + (((tickAnim - 5) / 2) * (5.53759-(-21.02372)));
            zz = -35.77467 + (((tickAnim - 5) / 2) * (-48.64765-(-35.77467)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 25.32701 + (((tickAnim - 7) / 3) * (29.83945-(25.32701)));
            yy = 5.53759 + (((tickAnim - 7) / 3) * (23.02381-(5.53759)));
            zz = -48.64765 + (((tickAnim - 7) / 3) * (-5.52212-(-48.64765)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -16.24074 + (((tickAnim - 0) / 5) * (0-(-16.24074)));
            yy = 6.60796 + (((tickAnim - 0) / 5) * (0-(6.60796)));
            zz = -15.94387 + (((tickAnim - 0) / 5) * (0-(-15.94387)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (-34.58424-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-6.67916-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-20.70445-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -34.58424 + (((tickAnim - 7) / 3) * (-16.24074-(-34.58424)));
            yy = -6.67916 + (((tickAnim - 7) / 3) * (6.60796-(-6.67916)));
            zz = -20.70445 + (((tickAnim - 7) / 3) * (-15.94387-(-20.70445)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1_2, leftLeg1_2.rotateAngleX + (float) Math.toRadians(xx), leftLeg1_2.rotateAngleY + (float) Math.toRadians(yy), leftLeg1_2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 23.23921 + (((tickAnim - 0) / 2) * (25.32701-(23.23921)));
            yy = 19.1685 + (((tickAnim - 0) / 2) * (-5.53759-(19.1685)));
            zz = 32.10633 + (((tickAnim - 0) / 2) * (48.64765-(32.10633)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 25.32701 + (((tickAnim - 2) / 3) * (29.75331-(25.32701)));
            yy = -5.53759 + (((tickAnim - 2) / 3) * (-22.17865-(-5.53759)));
            zz = 48.64765 + (((tickAnim - 2) / 3) * (4.86601-(48.64765)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 29.75331 + (((tickAnim - 5) / 5) * (23.23921-(29.75331)));
            yy = -22.17865 + (((tickAnim - 5) / 5) * (19.1685-(-22.17865)));
            zz = 4.86601 + (((tickAnim - 5) / 5) * (32.10633-(4.86601)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-34.58424-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (6.67916-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (20.70445-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -34.58424 + (((tickAnim - 2) / 3) * (-16.24074-(-34.58424)));
            yy = 6.67916 + (((tickAnim - 2) / 3) * (-6.60796-(6.67916)));
            zz = 20.70445 + (((tickAnim - 2) / 3) * (15.94387-(20.70445)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -16.24074 + (((tickAnim - 5) / 5) * (0-(-16.24074)));
            yy = -6.60796 + (((tickAnim - 5) / 5) * (0-(-6.60796)));
            zz = 15.94387 + (((tickAnim - 5) / 5) * (0-(15.94387)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1_2, rightLeg1_2.rotateAngleX + (float) Math.toRadians(xx), rightLeg1_2.rotateAngleY + (float) Math.toRadians(yy), rightLeg1_2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -13.03779 + (((tickAnim - 0) / 2) * (-38.37403-(-13.03779)));
            yy = -2.18971 + (((tickAnim - 0) / 2) * (19.34033-(-2.18971)));
            zz = -2.60867 + (((tickAnim - 0) / 2) * (-47.10072-(-2.60867)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -38.37403 + (((tickAnim - 2) / 3) * (-64.12184-(-38.37403)));
            yy = 19.34033 + (((tickAnim - 2) / 3) * (29.30858-(19.34033)));
            zz = -47.10072 + (((tickAnim - 2) / 3) * (-27.50216-(-47.10072)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -64.12184 + (((tickAnim - 5) / 5) * (-13.03779-(-64.12184)));
            yy = 29.30858 + (((tickAnim - 5) / 5) * (-2.18971-(29.30858)));
            zz = -27.50216 + (((tickAnim - 5) / 5) * (-2.60867-(-27.50216)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -63.49956 + (((tickAnim - 0) / 5) * (-13.03779-(-63.49956)));
            yy = -30.58638 + (((tickAnim - 0) / 5) * (2.18971-(-30.58638)));
            zz = 27.60467 + (((tickAnim - 0) / 5) * (2.60867-(27.60467)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -13.03779 + (((tickAnim - 5) / 2) * (-38.37403-(-13.03779)));
            yy = 2.18971 + (((tickAnim - 5) / 2) * (-19.34033-(2.18971)));
            zz = 2.60867 + (((tickAnim - 5) / 2) * (47.10072-(2.60867)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -38.37403 + (((tickAnim - 7) / 3) * (-63.49956-(-38.37403)));
            yy = -19.34033 + (((tickAnim - 7) / 3) * (-30.58638-(-19.34033)));
            zz = 47.10072 + (((tickAnim - 7) / 3) * (27.60467-(47.10072)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.24688 + (((tickAnim - 0) / 3) * (12.8207-(27.24688)));
            yy = 17.38423 + (((tickAnim - 0) / 3) * (3.17509-(17.38423)));
            zz = -11.25208 + (((tickAnim - 0) / 3) * (-9.2125-(-11.25208)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 12.8207 + (((tickAnim - 3) / 1) * (9.065-(12.8207)));
            yy = 3.17509 + (((tickAnim - 3) / 1) * (-0.17469-(3.17509)));
            zz = -9.2125 + (((tickAnim - 3) / 1) * (-8.7097-(-9.2125)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 9.065 + (((tickAnim - 4) / 1) * (3.49091-(9.065)));
            yy = -0.17469 + (((tickAnim - 4) / 1) * (0.15189-(-0.17469)));
            zz = -8.7097 + (((tickAnim - 4) / 1) * (-7.11902-(-8.7097)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 3.49091 + (((tickAnim - 5) / 2) * (28.38747-(3.49091)));
            yy = 0.15189 + (((tickAnim - 5) / 2) * (8.2227-(0.15189)));
            zz = -7.11902 + (((tickAnim - 5) / 2) * (-43.30196-(-7.11902)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 28.38747 + (((tickAnim - 7) / 3) * (27.24688-(28.38747)));
            yy = 8.2227 + (((tickAnim - 7) / 3) * (17.38423-(8.2227)));
            zz = -43.30196 + (((tickAnim - 7) / 3) * (-11.25208-(-43.30196)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.00678 + (((tickAnim - 0) / 2) * (29.01769-(7.00678)));
            yy = -1.03149 + (((tickAnim - 0) / 2) * (-9.33077-(-1.03149)));
            zz = 7.58876 + (((tickAnim - 0) / 2) * (48.38317-(7.58876)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 29.01769 + (((tickAnim - 2) / 3) * (24.82855-(29.01769)));
            yy = -9.33077 + (((tickAnim - 2) / 3) * (-21.15813-(-9.33077)));
            zz = 48.38317 + (((tickAnim - 2) / 3) * (11.94014-(48.38317)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 24.82855 + (((tickAnim - 5) / 3) * (14.97408-(24.82855)));
            yy = -21.15813 + (((tickAnim - 5) / 3) * (-3.78264-(-21.15813)));
            zz = 11.94014 + (((tickAnim - 5) / 3) * (10.13422-(11.94014)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 14.97408 + (((tickAnim - 8) / 1) * (11.44073-(14.97408)));
            yy = -3.78264 + (((tickAnim - 8) / 1) * (-1.40528-(-3.78264)));
            zz = 10.13422 + (((tickAnim - 8) / 1) * (9.14318-(10.13422)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 11.44073 + (((tickAnim - 9) / 1) * (7.00678-(11.44073)));
            yy = -1.40528 + (((tickAnim - 9) / 1) * (-1.03149-(-1.40528)));
            zz = 9.14318 + (((tickAnim - 9) / 1) * (7.58876-(9.14318)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20 + (((tickAnim - 0) / 5) * (-4.54283-(-20)));
            yy = 50 + (((tickAnim - 0) / 5) * (0.34386-(50)));
            zz = 0 + (((tickAnim - 0) / 5) * (-9.14996-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -4.54283 + (((tickAnim - 5) / 2) * (-16.94449-(-4.54283)));
            yy = 0.34386 + (((tickAnim - 5) / 2) * (13.06296-(0.34386)));
            zz = -9.14996 + (((tickAnim - 5) / 2) * (1.03673-(-9.14996)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -16.94449 + (((tickAnim - 7) / 3) * (-20-(-16.94449)));
            yy = 13.06296 + (((tickAnim - 7) / 3) * (50-(13.06296)));
            zz = 1.03673 + (((tickAnim - 7) / 3) * (0-(1.03673)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwingFoldable, leftHindwingFoldable.rotateAngleX + (float) Math.toRadians(xx), leftHindwingFoldable.rotateAngleY + (float) Math.toRadians(yy), leftHindwingFoldable.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraRaptoblatta entity = (EntityPrehistoricFloraRaptoblatta) entitylivingbaseIn;
        int animCycle = 19;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(thorax, thorax.rotateAngleX + (float) Math.toRadians(-12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750+120))*5), thorax.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2-60))*5), thorax.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2+120))*8));
        this.thorax.rotationPointX = this.thorax.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2+60))*1);
        this.thorax.rotationPointY = this.thorax.rotationPointY - (float)(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2))*1);
        this.thorax.rotationPointZ = this.thorax.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750*6/2+60))*0.1);


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(0), leftAntenna.rotateAngleY + (float) Math.toRadians(0), leftAntenna.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2))*10));


        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(0), rightAntenna.rotateAngleY + (float) Math.toRadians(0), rightAntenna.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2+20))*10));


        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(92.37485), leftLeg1.rotateAngleY + (float) Math.toRadians(31.7545-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375))*15), leftLeg1.rotateAngleZ + (float) Math.toRadians(7.73519));


        this.setRotateAngle(leftLeg1_2, leftLeg1_2.rotateAngleX + (float) Math.toRadians(7.5), leftLeg1_2.rotateAngleY + (float) Math.toRadians(0), leftLeg1_2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(92.37485), rightLeg1.rotateAngleY + (float) Math.toRadians(-31.7545-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*375+120))*15), rightLeg1.rotateAngleZ + (float) Math.toRadians(-7.73519));


        this.setRotateAngle(rightLeg1_2, rightLeg1_2.rotateAngleX + (float) Math.toRadians(7.5), rightLeg1_2.rotateAngleY + (float) Math.toRadians(0), rightLeg1_2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-90.0856371713-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2))*10), leftLeg2.rotateAngleY + (float) Math.toRadians(-33.52446), leftLeg2.rotateAngleZ + (float) Math.toRadians(18.4559737388+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2))*10));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-90.0856371713+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2+20))*10), rightLeg2.rotateAngleY + (float) Math.toRadians(33.52446), rightLeg2.rotateAngleZ + (float) Math.toRadians(-18.4559737388-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2+20))*10));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(-38.4958407321-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2+60))*10), leftLeg3.rotateAngleY + (float) Math.toRadians(18.06652), leftLeg3.rotateAngleZ + (float) Math.toRadians(-35.28067));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(-38.4958407321-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2))*10), rightLeg3.rotateAngleY + (float) Math.toRadians(-18.06652), rightLeg3.rotateAngleZ + (float) Math.toRadians(35.28067));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -140.27166 + (((tickAnim - 0) / 1) * (-124.60671-(-140.27166)));
            yy = 88.79946 + (((tickAnim - 0) / 1) * (93.03016-(88.79946)));
            zz = 51.93517 + (((tickAnim - 0) / 1) * (115.77194-(51.93517)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -124.60671 + (((tickAnim - 1) / 1) * (-134.21195-(-124.60671)));
            yy = 93.03016 + (((tickAnim - 1) / 1) * (82.43572-(93.03016)));
            zz = 115.77194 + (((tickAnim - 1) / 1) * (177.30756-(115.77194)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -134.21195 + (((tickAnim - 2) / 0) * (-196.5653-(-134.21195)));
            yy = 82.43572 + (((tickAnim - 2) / 0) * (78.47723-(82.43572)));
            zz = 177.30756 + (((tickAnim - 2) / 0) * (114.44102-(177.30756)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -196.5653 + (((tickAnim - 2) / 1) * (-140.27166-(-196.5653)));
            yy = 78.47723 + (((tickAnim - 2) / 1) * (88.79946-(78.47723)));
            zz = 114.44102 + (((tickAnim - 2) / 1) * (51.93517-(114.44102)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -140.27166 + (((tickAnim - 3) / 1) * (-124.60671-(-140.27166)));
            yy = 88.79946 + (((tickAnim - 3) / 1) * (93.03016-(88.79946)));
            zz = 51.93517 + (((tickAnim - 3) / 1) * (115.77194-(51.93517)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -124.60671 + (((tickAnim - 4) / 1) * (-134.21195-(-124.60671)));
            yy = 93.03016 + (((tickAnim - 4) / 1) * (82.43572-(93.03016)));
            zz = 115.77194 + (((tickAnim - 4) / 1) * (177.30756-(115.77194)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -134.21195 + (((tickAnim - 5) / 1) * (-196.5653-(-134.21195)));
            yy = 82.43572 + (((tickAnim - 5) / 1) * (78.47723-(82.43572)));
            zz = 177.30756 + (((tickAnim - 5) / 1) * (114.44102-(177.30756)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -196.5653 + (((tickAnim - 6) / 0) * (-140.27166-(-196.5653)));
            yy = 78.47723 + (((tickAnim - 6) / 0) * (88.79946-(78.47723)));
            zz = 114.44102 + (((tickAnim - 6) / 0) * (51.93517-(114.44102)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -140.27166 + (((tickAnim - 6) / 1) * (-124.60671-(-140.27166)));
            yy = 88.79946 + (((tickAnim - 6) / 1) * (93.03016-(88.79946)));
            zz = 51.93517 + (((tickAnim - 6) / 1) * (115.77194-(51.93517)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -124.60671 + (((tickAnim - 7) / 1) * (-134.21195-(-124.60671)));
            yy = 93.03016 + (((tickAnim - 7) / 1) * (82.43572-(93.03016)));
            zz = 115.77194 + (((tickAnim - 7) / 1) * (177.30756-(115.77194)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -134.21195 + (((tickAnim - 8) / 1) * (-196.5653-(-134.21195)));
            yy = 82.43572 + (((tickAnim - 8) / 1) * (78.47723-(82.43572)));
            zz = 177.30756 + (((tickAnim - 8) / 1) * (114.44102-(177.30756)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -196.5653 + (((tickAnim - 9) / 1) * (-140.27166-(-196.5653)));
            yy = 78.47723 + (((tickAnim - 9) / 1) * (88.79946-(78.47723)));
            zz = 114.44102 + (((tickAnim - 9) / 1) * (51.93517-(114.44102)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -140.27166 + (((tickAnim - 10) / 0) * (-124.60671-(-140.27166)));
            yy = 88.79946 + (((tickAnim - 10) / 0) * (93.03016-(88.79946)));
            zz = 51.93517 + (((tickAnim - 10) / 0) * (115.77194-(51.93517)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -124.60671 + (((tickAnim - 10) / 1) * (-134.21195-(-124.60671)));
            yy = 93.03016 + (((tickAnim - 10) / 1) * (82.43572-(93.03016)));
            zz = 115.77194 + (((tickAnim - 10) / 1) * (177.30756-(115.77194)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -134.21195 + (((tickAnim - 11) / 1) * (-196.5653-(-134.21195)));
            yy = 82.43572 + (((tickAnim - 11) / 1) * (78.47723-(82.43572)));
            zz = 177.30756 + (((tickAnim - 11) / 1) * (114.44102-(177.30756)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -196.5653 + (((tickAnim - 12) / 1) * (-140.27166-(-196.5653)));
            yy = 78.47723 + (((tickAnim - 12) / 1) * (88.79946-(78.47723)));
            zz = 114.44102 + (((tickAnim - 12) / 1) * (51.93517-(114.44102)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -140.27166 + (((tickAnim - 13) / 1) * (-124.60671-(-140.27166)));
            yy = 88.79946 + (((tickAnim - 13) / 1) * (93.03016-(88.79946)));
            zz = 51.93517 + (((tickAnim - 13) / 1) * (115.77194-(51.93517)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = -124.60671 + (((tickAnim - 14) / 0) * (-134.21195-(-124.60671)));
            yy = 93.03016 + (((tickAnim - 14) / 0) * (82.43572-(93.03016)));
            zz = 115.77194 + (((tickAnim - 14) / 0) * (177.30756-(115.77194)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -134.21195 + (((tickAnim - 14) / 1) * (-196.5653-(-134.21195)));
            yy = 82.43572 + (((tickAnim - 14) / 1) * (78.47723-(82.43572)));
            zz = 177.30756 + (((tickAnim - 14) / 1) * (114.44102-(177.30756)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -196.5653 + (((tickAnim - 15) / 1) * (-140.27166-(-196.5653)));
            yy = 78.47723 + (((tickAnim - 15) / 1) * (88.79946-(78.47723)));
            zz = 114.44102 + (((tickAnim - 15) / 1) * (51.93517-(114.44102)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -140.27166 + (((tickAnim - 16) / 1) * (-124.60671-(-140.27166)));
            yy = 88.79946 + (((tickAnim - 16) / 1) * (93.03016-(88.79946)));
            zz = 51.93517 + (((tickAnim - 16) / 1) * (115.77194-(51.93517)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -124.60671 + (((tickAnim - 17) / 1) * (-134.21195-(-124.60671)));
            yy = 93.03016 + (((tickAnim - 17) / 1) * (82.43572-(93.03016)));
            zz = 115.77194 + (((tickAnim - 17) / 1) * (177.30756-(115.77194)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -134.21195 + (((tickAnim - 18) / 0) * (-196.5653-(-134.21195)));
            yy = 82.43572 + (((tickAnim - 18) / 0) * (78.47723-(82.43572)));
            zz = 177.30756 + (((tickAnim - 18) / 0) * (114.44102-(177.30756)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -196.5653 + (((tickAnim - 18) / 1) * (-140.27166-(-196.5653)));
            yy = 78.47723 + (((tickAnim - 18) / 1) * (88.79946-(78.47723)));
            zz = 114.44102 + (((tickAnim - 18) / 1) * (51.93517-(114.44102)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(xx), leftForewing.rotateAngleY + (float) Math.toRadians(yy), leftForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -109.24095 + (((tickAnim - 0) / 1) * (89.20174-(-109.24095)));
            yy = 85.1643 + (((tickAnim - 0) / 1) * (67.35603-(85.1643)));
            zz = -178.63907 + (((tickAnim - 0) / 1) * (82.36745-(-178.63907)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 89.20174 + (((tickAnim - 1) / 1) * (-15.99124-(89.20174)));
            yy = 67.35603 + (((tickAnim - 1) / 1) * (78.66869-(67.35603)));
            zz = 82.36745 + (((tickAnim - 1) / 1) * (41.2889-(82.36745)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -15.99124 + (((tickAnim - 2) / 0) * (-87.66021-(-15.99124)));
            yy = 78.66869 + (((tickAnim - 2) / 0) * (54.52142-(78.66869)));
            zz = 41.2889 + (((tickAnim - 2) / 0) * (-147.44517-(41.2889)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -87.66021 + (((tickAnim - 2) / 1) * (-109.24095-(-87.66021)));
            yy = 54.52142 + (((tickAnim - 2) / 1) * (85.1643-(54.52142)));
            zz = -147.44517 + (((tickAnim - 2) / 1) * (-178.63907-(-147.44517)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -109.24095 + (((tickAnim - 3) / 1) * (89.20174-(-109.24095)));
            yy = 85.1643 + (((tickAnim - 3) / 1) * (67.35603-(85.1643)));
            zz = -178.63907 + (((tickAnim - 3) / 1) * (82.36745-(-178.63907)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 89.20174 + (((tickAnim - 4) / 1) * (-15.99124-(89.20174)));
            yy = 67.35603 + (((tickAnim - 4) / 1) * (78.66869-(67.35603)));
            zz = 82.36745 + (((tickAnim - 4) / 1) * (41.2889-(82.36745)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -15.99124 + (((tickAnim - 5) / 1) * (-87.66021-(-15.99124)));
            yy = 78.66869 + (((tickAnim - 5) / 1) * (54.52142-(78.66869)));
            zz = 41.2889 + (((tickAnim - 5) / 1) * (-147.44517-(41.2889)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -87.66021 + (((tickAnim - 6) / 0) * (-109.24095-(-87.66021)));
            yy = 54.52142 + (((tickAnim - 6) / 0) * (85.1643-(54.52142)));
            zz = -147.44517 + (((tickAnim - 6) / 0) * (-178.63907-(-147.44517)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -109.24095 + (((tickAnim - 6) / 1) * (89.20174-(-109.24095)));
            yy = 85.1643 + (((tickAnim - 6) / 1) * (67.35603-(85.1643)));
            zz = -178.63907 + (((tickAnim - 6) / 1) * (82.36745-(-178.63907)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 89.20174 + (((tickAnim - 7) / 1) * (-15.99124-(89.20174)));
            yy = 67.35603 + (((tickAnim - 7) / 1) * (78.66869-(67.35603)));
            zz = 82.36745 + (((tickAnim - 7) / 1) * (41.2889-(82.36745)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -15.99124 + (((tickAnim - 8) / 1) * (-87.66021-(-15.99124)));
            yy = 78.66869 + (((tickAnim - 8) / 1) * (54.52142-(78.66869)));
            zz = 41.2889 + (((tickAnim - 8) / 1) * (-147.44517-(41.2889)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -87.66021 + (((tickAnim - 9) / 1) * (-109.24095-(-87.66021)));
            yy = 54.52142 + (((tickAnim - 9) / 1) * (85.1643-(54.52142)));
            zz = -147.44517 + (((tickAnim - 9) / 1) * (-178.63907-(-147.44517)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -109.24095 + (((tickAnim - 10) / 0) * (89.20174-(-109.24095)));
            yy = 85.1643 + (((tickAnim - 10) / 0) * (67.35603-(85.1643)));
            zz = -178.63907 + (((tickAnim - 10) / 0) * (82.36745-(-178.63907)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 89.20174 + (((tickAnim - 10) / 1) * (-15.99124-(89.20174)));
            yy = 67.35603 + (((tickAnim - 10) / 1) * (78.66869-(67.35603)));
            zz = 82.36745 + (((tickAnim - 10) / 1) * (41.2889-(82.36745)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -15.99124 + (((tickAnim - 11) / 1) * (-87.66021-(-15.99124)));
            yy = 78.66869 + (((tickAnim - 11) / 1) * (54.52142-(78.66869)));
            zz = 41.2889 + (((tickAnim - 11) / 1) * (-147.44517-(41.2889)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -87.66021 + (((tickAnim - 12) / 1) * (-109.24095-(-87.66021)));
            yy = 54.52142 + (((tickAnim - 12) / 1) * (85.1643-(54.52142)));
            zz = -147.44517 + (((tickAnim - 12) / 1) * (-178.63907-(-147.44517)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -109.24095 + (((tickAnim - 13) / 1) * (89.20174-(-109.24095)));
            yy = 85.1643 + (((tickAnim - 13) / 1) * (67.35603-(85.1643)));
            zz = -178.63907 + (((tickAnim - 13) / 1) * (82.36745-(-178.63907)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 89.20174 + (((tickAnim - 14) / 0) * (-15.99124-(89.20174)));
            yy = 67.35603 + (((tickAnim - 14) / 0) * (78.66869-(67.35603)));
            zz = 82.36745 + (((tickAnim - 14) / 0) * (41.2889-(82.36745)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -15.99124 + (((tickAnim - 14) / 1) * (-87.66021-(-15.99124)));
            yy = 78.66869 + (((tickAnim - 14) / 1) * (54.52142-(78.66869)));
            zz = 41.2889 + (((tickAnim - 14) / 1) * (-147.44517-(41.2889)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -87.66021 + (((tickAnim - 15) / 1) * (-109.24095-(-87.66021)));
            yy = 54.52142 + (((tickAnim - 15) / 1) * (85.1643-(54.52142)));
            zz = -147.44517 + (((tickAnim - 15) / 1) * (-178.63907-(-147.44517)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -109.24095 + (((tickAnim - 16) / 1) * (89.20174-(-109.24095)));
            yy = 85.1643 + (((tickAnim - 16) / 1) * (67.35603-(85.1643)));
            zz = -178.63907 + (((tickAnim - 16) / 1) * (82.36745-(-178.63907)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 89.20174 + (((tickAnim - 17) / 1) * (-15.99124-(89.20174)));
            yy = 67.35603 + (((tickAnim - 17) / 1) * (78.66869-(67.35603)));
            zz = 82.36745 + (((tickAnim - 17) / 1) * (41.2889-(82.36745)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -15.99124 + (((tickAnim - 18) / 0) * (-87.66021-(-15.99124)));
            yy = 78.66869 + (((tickAnim - 18) / 0) * (54.52142-(78.66869)));
            zz = 41.2889 + (((tickAnim - 18) / 0) * (-147.44517-(41.2889)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -87.66021 + (((tickAnim - 18) / 1) * (-109.24095-(-87.66021)));
            yy = 54.52142 + (((tickAnim - 18) / 1) * (85.1643-(54.52142)));
            zz = -147.44517 + (((tickAnim - 18) / 1) * (-178.63907-(-147.44517)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(xx), leftHindwing.rotateAngleY + (float) Math.toRadians(yy), leftHindwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftHindwingFoldable, leftHindwingFoldable.rotateAngleX + (float) Math.toRadians(0), leftHindwingFoldable.rotateAngleY + (float) Math.toRadians(0), leftHindwingFoldable.rotateAngleZ + (float) Math.toRadians(180));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -109.24095 + (((tickAnim - 0) / 1) * (89.20174-(-109.24095)));
            yy = -85.1643 + (((tickAnim - 0) / 1) * (-67.35603-(-85.1643)));
            zz = 178.63907 + (((tickAnim - 0) / 1) * (-82.36745-(178.63907)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 89.20174 + (((tickAnim - 1) / 1) * (-15.99124-(89.20174)));
            yy = -67.35603 + (((tickAnim - 1) / 1) * (-78.66869-(-67.35603)));
            zz = -82.36745 + (((tickAnim - 1) / 1) * (-41.2889-(-82.36745)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -15.99124 + (((tickAnim - 2) / 0) * (-87.66021-(-15.99124)));
            yy = -78.66869 + (((tickAnim - 2) / 0) * (-54.52142-(-78.66869)));
            zz = -41.2889 + (((tickAnim - 2) / 0) * (147.44517-(-41.2889)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -87.66021 + (((tickAnim - 2) / 1) * (-109.24095-(-87.66021)));
            yy = -54.52142 + (((tickAnim - 2) / 1) * (-85.1643-(-54.52142)));
            zz = 147.44517 + (((tickAnim - 2) / 1) * (178.63907-(147.44517)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -109.24095 + (((tickAnim - 3) / 1) * (89.20174-(-109.24095)));
            yy = -85.1643 + (((tickAnim - 3) / 1) * (-67.35603-(-85.1643)));
            zz = 178.63907 + (((tickAnim - 3) / 1) * (-82.36745-(178.63907)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 89.20174 + (((tickAnim - 4) / 1) * (-15.99124-(89.20174)));
            yy = -67.35603 + (((tickAnim - 4) / 1) * (-78.66869-(-67.35603)));
            zz = -82.36745 + (((tickAnim - 4) / 1) * (-41.2889-(-82.36745)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -15.99124 + (((tickAnim - 5) / 1) * (-87.66021-(-15.99124)));
            yy = -78.66869 + (((tickAnim - 5) / 1) * (-54.52142-(-78.66869)));
            zz = -41.2889 + (((tickAnim - 5) / 1) * (147.44517-(-41.2889)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -87.66021 + (((tickAnim - 6) / 0) * (-109.24095-(-87.66021)));
            yy = -54.52142 + (((tickAnim - 6) / 0) * (-85.1643-(-54.52142)));
            zz = 147.44517 + (((tickAnim - 6) / 0) * (178.63907-(147.44517)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -109.24095 + (((tickAnim - 6) / 1) * (89.20174-(-109.24095)));
            yy = -85.1643 + (((tickAnim - 6) / 1) * (-67.35603-(-85.1643)));
            zz = 178.63907 + (((tickAnim - 6) / 1) * (-82.36745-(178.63907)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 89.20174 + (((tickAnim - 7) / 1) * (-15.99124-(89.20174)));
            yy = -67.35603 + (((tickAnim - 7) / 1) * (-78.66869-(-67.35603)));
            zz = -82.36745 + (((tickAnim - 7) / 1) * (-41.2889-(-82.36745)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -15.99124 + (((tickAnim - 8) / 1) * (-87.66021-(-15.99124)));
            yy = -78.66869 + (((tickAnim - 8) / 1) * (-54.52142-(-78.66869)));
            zz = -41.2889 + (((tickAnim - 8) / 1) * (147.44517-(-41.2889)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -87.66021 + (((tickAnim - 9) / 1) * (-109.24095-(-87.66021)));
            yy = -54.52142 + (((tickAnim - 9) / 1) * (-85.1643-(-54.52142)));
            zz = 147.44517 + (((tickAnim - 9) / 1) * (178.63907-(147.44517)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -109.24095 + (((tickAnim - 10) / 0) * (89.20174-(-109.24095)));
            yy = -85.1643 + (((tickAnim - 10) / 0) * (-67.35603-(-85.1643)));
            zz = 178.63907 + (((tickAnim - 10) / 0) * (-82.36745-(178.63907)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 89.20174 + (((tickAnim - 10) / 1) * (-15.99124-(89.20174)));
            yy = -67.35603 + (((tickAnim - 10) / 1) * (-78.66869-(-67.35603)));
            zz = -82.36745 + (((tickAnim - 10) / 1) * (-41.2889-(-82.36745)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -15.99124 + (((tickAnim - 11) / 1) * (-87.66021-(-15.99124)));
            yy = -78.66869 + (((tickAnim - 11) / 1) * (-54.52142-(-78.66869)));
            zz = -41.2889 + (((tickAnim - 11) / 1) * (147.44517-(-41.2889)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -87.66021 + (((tickAnim - 12) / 1) * (-109.24095-(-87.66021)));
            yy = -54.52142 + (((tickAnim - 12) / 1) * (-85.1643-(-54.52142)));
            zz = 147.44517 + (((tickAnim - 12) / 1) * (178.63907-(147.44517)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -109.24095 + (((tickAnim - 13) / 1) * (89.20174-(-109.24095)));
            yy = -85.1643 + (((tickAnim - 13) / 1) * (-67.35603-(-85.1643)));
            zz = 178.63907 + (((tickAnim - 13) / 1) * (-82.36745-(178.63907)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 89.20174 + (((tickAnim - 14) / 0) * (-15.99124-(89.20174)));
            yy = -67.35603 + (((tickAnim - 14) / 0) * (-78.66869-(-67.35603)));
            zz = -82.36745 + (((tickAnim - 14) / 0) * (-41.2889-(-82.36745)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -15.99124 + (((tickAnim - 14) / 1) * (-87.66021-(-15.99124)));
            yy = -78.66869 + (((tickAnim - 14) / 1) * (-54.52142-(-78.66869)));
            zz = -41.2889 + (((tickAnim - 14) / 1) * (147.44517-(-41.2889)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -87.66021 + (((tickAnim - 15) / 1) * (-109.24095-(-87.66021)));
            yy = -54.52142 + (((tickAnim - 15) / 1) * (-85.1643-(-54.52142)));
            zz = 147.44517 + (((tickAnim - 15) / 1) * (178.63907-(147.44517)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -109.24095 + (((tickAnim - 16) / 1) * (89.20174-(-109.24095)));
            yy = -85.1643 + (((tickAnim - 16) / 1) * (-67.35603-(-85.1643)));
            zz = 178.63907 + (((tickAnim - 16) / 1) * (-82.36745-(178.63907)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 89.20174 + (((tickAnim - 17) / 1) * (-15.99124-(89.20174)));
            yy = -67.35603 + (((tickAnim - 17) / 1) * (-78.66869-(-67.35603)));
            zz = -82.36745 + (((tickAnim - 17) / 1) * (-41.2889-(-82.36745)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -15.99124 + (((tickAnim - 18) / 0) * (-87.66021-(-15.99124)));
            yy = -78.66869 + (((tickAnim - 18) / 0) * (-54.52142-(-78.66869)));
            zz = -41.2889 + (((tickAnim - 18) / 0) * (147.44517-(-41.2889)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -87.66021 + (((tickAnim - 18) / 1) * (-109.24095-(-87.66021)));
            yy = -54.52142 + (((tickAnim - 18) / 1) * (-85.1643-(-54.52142)));
            zz = 147.44517 + (((tickAnim - 18) / 1) * (178.63907-(147.44517)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(xx), rightHindwing.rotateAngleY + (float) Math.toRadians(yy), rightHindwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightHindwingFoldable, rightHindwingFoldable.rotateAngleX + (float) Math.toRadians(0), rightHindwingFoldable.rotateAngleY + (float) Math.toRadians(0), rightHindwingFoldable.rotateAngleZ + (float) Math.toRadians(-172.5));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -140.27166 + (((tickAnim - 0) / 1) * (-124.60671-(-140.27166)));
            yy = -88.79946 + (((tickAnim - 0) / 1) * (-93.03016-(-88.79946)));
            zz = -51.93517 + (((tickAnim - 0) / 1) * (-115.77194-(-51.93517)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -124.60671 + (((tickAnim - 1) / 1) * (-134.21195-(-124.60671)));
            yy = -93.03016 + (((tickAnim - 1) / 1) * (-82.43572-(-93.03016)));
            zz = -115.77194 + (((tickAnim - 1) / 1) * (-177.30756-(-115.77194)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -134.21195 + (((tickAnim - 2) / 0) * (-196.5653-(-134.21195)));
            yy = -82.43572 + (((tickAnim - 2) / 0) * (-78.47723-(-82.43572)));
            zz = -177.30756 + (((tickAnim - 2) / 0) * (-114.44102-(-177.30756)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -196.5653 + (((tickAnim - 2) / 1) * (-140.27166-(-196.5653)));
            yy = -78.47723 + (((tickAnim - 2) / 1) * (-88.79946-(-78.47723)));
            zz = -114.44102 + (((tickAnim - 2) / 1) * (-51.93517-(-114.44102)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -140.27166 + (((tickAnim - 3) / 1) * (-124.60671-(-140.27166)));
            yy = -88.79946 + (((tickAnim - 3) / 1) * (-93.03016-(-88.79946)));
            zz = -51.93517 + (((tickAnim - 3) / 1) * (-115.77194-(-51.93517)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -124.60671 + (((tickAnim - 4) / 1) * (-134.21195-(-124.60671)));
            yy = -93.03016 + (((tickAnim - 4) / 1) * (-82.43572-(-93.03016)));
            zz = -115.77194 + (((tickAnim - 4) / 1) * (-177.30756-(-115.77194)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -134.21195 + (((tickAnim - 5) / 1) * (-196.5653-(-134.21195)));
            yy = -82.43572 + (((tickAnim - 5) / 1) * (-78.47723-(-82.43572)));
            zz = -177.30756 + (((tickAnim - 5) / 1) * (-114.44102-(-177.30756)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -196.5653 + (((tickAnim - 6) / 0) * (-140.27166-(-196.5653)));
            yy = -78.47723 + (((tickAnim - 6) / 0) * (-88.79946-(-78.47723)));
            zz = -114.44102 + (((tickAnim - 6) / 0) * (-51.93517-(-114.44102)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -140.27166 + (((tickAnim - 6) / 1) * (-124.60671-(-140.27166)));
            yy = -88.79946 + (((tickAnim - 6) / 1) * (-93.03016-(-88.79946)));
            zz = -51.93517 + (((tickAnim - 6) / 1) * (-115.77194-(-51.93517)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -124.60671 + (((tickAnim - 7) / 1) * (-134.21195-(-124.60671)));
            yy = -93.03016 + (((tickAnim - 7) / 1) * (-82.43572-(-93.03016)));
            zz = -115.77194 + (((tickAnim - 7) / 1) * (-177.30756-(-115.77194)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -134.21195 + (((tickAnim - 8) / 1) * (-196.5653-(-134.21195)));
            yy = -82.43572 + (((tickAnim - 8) / 1) * (-78.47723-(-82.43572)));
            zz = -177.30756 + (((tickAnim - 8) / 1) * (-114.44102-(-177.30756)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -196.5653 + (((tickAnim - 9) / 1) * (-140.27166-(-196.5653)));
            yy = -78.47723 + (((tickAnim - 9) / 1) * (-88.79946-(-78.47723)));
            zz = -114.44102 + (((tickAnim - 9) / 1) * (-51.93517-(-114.44102)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -140.27166 + (((tickAnim - 10) / 0) * (-124.60671-(-140.27166)));
            yy = -88.79946 + (((tickAnim - 10) / 0) * (-93.03016-(-88.79946)));
            zz = -51.93517 + (((tickAnim - 10) / 0) * (-115.77194-(-51.93517)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -124.60671 + (((tickAnim - 10) / 1) * (-134.21195-(-124.60671)));
            yy = -93.03016 + (((tickAnim - 10) / 1) * (-82.43572-(-93.03016)));
            zz = -115.77194 + (((tickAnim - 10) / 1) * (-177.30756-(-115.77194)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -134.21195 + (((tickAnim - 11) / 1) * (-196.5653-(-134.21195)));
            yy = -82.43572 + (((tickAnim - 11) / 1) * (-78.47723-(-82.43572)));
            zz = -177.30756 + (((tickAnim - 11) / 1) * (-114.44102-(-177.30756)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -196.5653 + (((tickAnim - 12) / 1) * (-140.27166-(-196.5653)));
            yy = -78.47723 + (((tickAnim - 12) / 1) * (-88.79946-(-78.47723)));
            zz = -114.44102 + (((tickAnim - 12) / 1) * (-51.93517-(-114.44102)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -140.27166 + (((tickAnim - 13) / 1) * (-124.60671-(-140.27166)));
            yy = -88.79946 + (((tickAnim - 13) / 1) * (-93.03016-(-88.79946)));
            zz = -51.93517 + (((tickAnim - 13) / 1) * (-115.77194-(-51.93517)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = -124.60671 + (((tickAnim - 14) / 0) * (-134.21195-(-124.60671)));
            yy = -93.03016 + (((tickAnim - 14) / 0) * (-82.43572-(-93.03016)));
            zz = -115.77194 + (((tickAnim - 14) / 0) * (-177.30756-(-115.77194)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -134.21195 + (((tickAnim - 14) / 1) * (-196.5653-(-134.21195)));
            yy = -82.43572 + (((tickAnim - 14) / 1) * (-78.47723-(-82.43572)));
            zz = -177.30756 + (((tickAnim - 14) / 1) * (-114.44102-(-177.30756)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -196.5653 + (((tickAnim - 15) / 1) * (-140.27166-(-196.5653)));
            yy = -78.47723 + (((tickAnim - 15) / 1) * (-88.79946-(-78.47723)));
            zz = -114.44102 + (((tickAnim - 15) / 1) * (-51.93517-(-114.44102)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -140.27166 + (((tickAnim - 16) / 1) * (-124.60671-(-140.27166)));
            yy = -88.79946 + (((tickAnim - 16) / 1) * (-93.03016-(-88.79946)));
            zz = -51.93517 + (((tickAnim - 16) / 1) * (-115.77194-(-51.93517)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -124.60671 + (((tickAnim - 17) / 1) * (-134.21195-(-124.60671)));
            yy = -93.03016 + (((tickAnim - 17) / 1) * (-82.43572-(-93.03016)));
            zz = -115.77194 + (((tickAnim - 17) / 1) * (-177.30756-(-115.77194)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -134.21195 + (((tickAnim - 18) / 0) * (-196.5653-(-134.21195)));
            yy = -82.43572 + (((tickAnim - 18) / 0) * (-78.47723-(-82.43572)));
            zz = -177.30756 + (((tickAnim - 18) / 0) * (-114.44102-(-177.30756)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -196.5653 + (((tickAnim - 18) / 1) * (-140.27166-(-196.5653)));
            yy = -78.47723 + (((tickAnim - 18) / 1) * (-88.79946-(-78.47723)));
            zz = -114.44102 + (((tickAnim - 18) / 1) * (-51.93517-(-114.44102)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForewing, rightForewing.rotateAngleX + (float) Math.toRadians(xx), rightForewing.rotateAngleY + (float) Math.toRadians(yy), rightForewing.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isMoving) {
        EntityPrehistoricFloraRaptoblatta entity = (EntityPrehistoricFloraRaptoblatta) entitylivingbaseIn;
        int animCycle = 9;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        if (!isMoving) {
            tickAnim = 0;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(thorax, thorax.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750*2))*2), thorax.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750+100))*2), thorax.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750-90))*4));
        this.thorax.rotationPointX = this.thorax.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750-60))*0.1);
        this.thorax.rotationPointY = this.thorax.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750*2-60))*0.1);
        this.thorax.rotationPointZ = this.thorax.rotationPointZ + (float)(0);


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*10), leftAntenna.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*4), leftAntenna.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*4));


        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750+50))*10), rightAntenna.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*4)), rightAntenna.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*4)));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 29.83945 + (((tickAnim - 0) / 5) * (27.69627-(29.83945)));
            yy = 23.02381 + (((tickAnim - 0) / 5) * (-21.02372-(23.02381)));
            zz = -5.52212 + (((tickAnim - 0) / 5) * (-35.77467-(-5.52212)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 27.69627 + (((tickAnim - 5) / 2) * (25.32701-(27.69627)));
            yy = -21.02372 + (((tickAnim - 5) / 2) * (5.53759-(-21.02372)));
            zz = -35.77467 + (((tickAnim - 5) / 2) * (-48.64765-(-35.77467)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 25.32701 + (((tickAnim - 7) / 3) * (29.83945-(25.32701)));
            yy = 5.53759 + (((tickAnim - 7) / 3) * (23.02381-(5.53759)));
            zz = -48.64765 + (((tickAnim - 7) / 3) * (-5.52212-(-48.64765)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -16.24074 + (((tickAnim - 0) / 5) * (0-(-16.24074)));
            yy = 6.60796 + (((tickAnim - 0) / 5) * (0-(6.60796)));
            zz = -15.94387 + (((tickAnim - 0) / 5) * (0-(-15.94387)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (-34.58424-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-6.67916-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-20.70445-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -34.58424 + (((tickAnim - 7) / 3) * (-16.24074-(-34.58424)));
            yy = -6.67916 + (((tickAnim - 7) / 3) * (6.60796-(-6.67916)));
            zz = -20.70445 + (((tickAnim - 7) / 3) * (-15.94387-(-20.70445)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1_2, leftLeg1_2.rotateAngleX + (float) Math.toRadians(xx), leftLeg1_2.rotateAngleY + (float) Math.toRadians(yy), leftLeg1_2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 23.23921 + (((tickAnim - 0) / 2) * (25.32701-(23.23921)));
            yy = 19.1685 + (((tickAnim - 0) / 2) * (-5.53759-(19.1685)));
            zz = 32.10633 + (((tickAnim - 0) / 2) * (48.64765-(32.10633)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 25.32701 + (((tickAnim - 2) / 3) * (29.75331-(25.32701)));
            yy = -5.53759 + (((tickAnim - 2) / 3) * (-22.17865-(-5.53759)));
            zz = 48.64765 + (((tickAnim - 2) / 3) * (4.86601-(48.64765)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 29.75331 + (((tickAnim - 5) / 5) * (23.23921-(29.75331)));
            yy = -22.17865 + (((tickAnim - 5) / 5) * (19.1685-(-22.17865)));
            zz = 4.86601 + (((tickAnim - 5) / 5) * (32.10633-(4.86601)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-34.58424-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (6.67916-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (20.70445-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -34.58424 + (((tickAnim - 2) / 3) * (-16.24074-(-34.58424)));
            yy = 6.67916 + (((tickAnim - 2) / 3) * (-6.60796-(6.67916)));
            zz = 20.70445 + (((tickAnim - 2) / 3) * (15.94387-(20.70445)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -16.24074 + (((tickAnim - 5) / 5) * (0-(-16.24074)));
            yy = -6.60796 + (((tickAnim - 5) / 5) * (0-(-6.60796)));
            zz = 15.94387 + (((tickAnim - 5) / 5) * (0-(15.94387)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1_2, rightLeg1_2.rotateAngleX + (float) Math.toRadians(xx), rightLeg1_2.rotateAngleY + (float) Math.toRadians(yy), rightLeg1_2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -13.03779 + (((tickAnim - 0) / 2) * (-38.37403-(-13.03779)));
            yy = -2.18971 + (((tickAnim - 0) / 2) * (19.34033-(-2.18971)));
            zz = -2.60867 + (((tickAnim - 0) / 2) * (-47.10072-(-2.60867)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -38.37403 + (((tickAnim - 2) / 3) * (-64.12184-(-38.37403)));
            yy = 19.34033 + (((tickAnim - 2) / 3) * (29.30858-(19.34033)));
            zz = -47.10072 + (((tickAnim - 2) / 3) * (-27.50216-(-47.10072)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -64.12184 + (((tickAnim - 5) / 5) * (-13.03779-(-64.12184)));
            yy = 29.30858 + (((tickAnim - 5) / 5) * (-2.18971-(29.30858)));
            zz = -27.50216 + (((tickAnim - 5) / 5) * (-2.60867-(-27.50216)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -63.49956 + (((tickAnim - 0) / 5) * (-13.03779-(-63.49956)));
            yy = -30.58638 + (((tickAnim - 0) / 5) * (2.18971-(-30.58638)));
            zz = 27.60467 + (((tickAnim - 0) / 5) * (2.60867-(27.60467)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -13.03779 + (((tickAnim - 5) / 2) * (-38.37403-(-13.03779)));
            yy = 2.18971 + (((tickAnim - 5) / 2) * (-19.34033-(2.18971)));
            zz = 2.60867 + (((tickAnim - 5) / 2) * (47.10072-(2.60867)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -38.37403 + (((tickAnim - 7) / 3) * (-63.49956-(-38.37403)));
            yy = -19.34033 + (((tickAnim - 7) / 3) * (-30.58638-(-19.34033)));
            zz = 47.10072 + (((tickAnim - 7) / 3) * (27.60467-(47.10072)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.24688 + (((tickAnim - 0) / 3) * (12.8207-(27.24688)));
            yy = 17.38423 + (((tickAnim - 0) / 3) * (3.17509-(17.38423)));
            zz = -11.25208 + (((tickAnim - 0) / 3) * (-9.2125-(-11.25208)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 12.8207 + (((tickAnim - 3) / 1) * (9.065-(12.8207)));
            yy = 3.17509 + (((tickAnim - 3) / 1) * (-0.17469-(3.17509)));
            zz = -9.2125 + (((tickAnim - 3) / 1) * (-8.7097-(-9.2125)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 9.065 + (((tickAnim - 4) / 1) * (3.49091-(9.065)));
            yy = -0.17469 + (((tickAnim - 4) / 1) * (0.15189-(-0.17469)));
            zz = -8.7097 + (((tickAnim - 4) / 1) * (-7.11902-(-8.7097)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 3.49091 + (((tickAnim - 5) / 2) * (28.38747-(3.49091)));
            yy = 0.15189 + (((tickAnim - 5) / 2) * (8.2227-(0.15189)));
            zz = -7.11902 + (((tickAnim - 5) / 2) * (-43.30196-(-7.11902)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 28.38747 + (((tickAnim - 7) / 3) * (27.24688-(28.38747)));
            yy = 8.2227 + (((tickAnim - 7) / 3) * (17.38423-(8.2227)));
            zz = -43.30196 + (((tickAnim - 7) / 3) * (-11.25208-(-43.30196)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.00678 + (((tickAnim - 0) / 2) * (29.01769-(7.00678)));
            yy = -1.03149 + (((tickAnim - 0) / 2) * (-9.33077-(-1.03149)));
            zz = 7.58876 + (((tickAnim - 0) / 2) * (48.38317-(7.58876)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 29.01769 + (((tickAnim - 2) / 3) * (24.82855-(29.01769)));
            yy = -9.33077 + (((tickAnim - 2) / 3) * (-21.15813-(-9.33077)));
            zz = 48.38317 + (((tickAnim - 2) / 3) * (11.94014-(48.38317)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 24.82855 + (((tickAnim - 5) / 3) * (14.97408-(24.82855)));
            yy = -21.15813 + (((tickAnim - 5) / 3) * (-3.78264-(-21.15813)));
            zz = 11.94014 + (((tickAnim - 5) / 3) * (10.13422-(11.94014)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 14.97408 + (((tickAnim - 8) / 1) * (11.44073-(14.97408)));
            yy = -3.78264 + (((tickAnim - 8) / 1) * (-1.40528-(-3.78264)));
            zz = 10.13422 + (((tickAnim - 8) / 1) * (9.14318-(10.13422)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 11.44073 + (((tickAnim - 9) / 1) * (7.00678-(11.44073)));
            yy = -1.40528 + (((tickAnim - 9) / 1) * (-1.03149-(-1.40528)));
            zz = 9.14318 + (((tickAnim - 9) / 1) * (7.58876-(9.14318)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20 + (((tickAnim - 0) / 5) * (-4.54283-(-20)));
            yy = 50 + (((tickAnim - 0) / 5) * (0.34386-(50)));
            zz = 0 + (((tickAnim - 0) / 5) * (-9.14996-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -4.54283 + (((tickAnim - 5) / 2) * (-16.94449-(-4.54283)));
            yy = 0.34386 + (((tickAnim - 5) / 2) * (13.06296-(0.34386)));
            zz = -9.14996 + (((tickAnim - 5) / 2) * (1.03673-(-9.14996)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -16.94449 + (((tickAnim - 7) / 3) * (-20-(-16.94449)));
            yy = 13.06296 + (((tickAnim - 7) / 3) * (50-(13.06296)));
            zz = 1.03673 + (((tickAnim - 7) / 3) * (0-(1.03673)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwingFoldable, leftHindwingFoldable.rotateAngleX + (float) Math.toRadians(xx), leftHindwingFoldable.rotateAngleY + (float) Math.toRadians(yy), leftHindwingFoldable.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
