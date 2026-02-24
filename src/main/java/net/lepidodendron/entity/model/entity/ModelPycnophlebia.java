package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPycnophlebia;
import net.lepidodendron.entity.EntityPrehistoricFloraPsittacosaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelPycnophlebia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftForewingFoldable;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftHindwingFoldable;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightHindwingFoldable;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightForewing;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightForewingFoldable;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg32;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg32;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer rightAntennae;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer leftAntennae;
    private final AdvancedModelRenderer cube_r19;

    private ModelAnimator animator;

    public ModelPycnophlebia() {
        this.textureWidth = 55;
        this.textureHeight = 43;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.35F, 1.25F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.925F, -4.5F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 37, -1.5F, -1.0F, -0.2F, 3, 2, 1, -0.02F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 34, -1.5F, -1.0F, -1.0F, 3, 2, 1, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.225F, -4.5F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 50, 8, -0.5F, -1.025F, 0.8F, 2, 0, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 24, -1.0F, -1.025F, -1.2F, 3, 2, 2, 0.0F, false));

        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(1.36F, -0.6735F, -3.4529F);
        this.main.addChild(leftForewing);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.0486F, -0.375F, 5.3385F);
        this.leftForewing.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 11, 0.0F, 0.0F, -6.0F, 3, 0, 12, 0.0F, false));

        this.leftForewingFoldable = new AdvancedModelRenderer(this);
        this.leftForewingFoldable.setRotationPoint(-0.0484F, -0.3743F, 0.8385F);
        this.leftForewing.addChild(leftForewingFoldable);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftForewingFoldable.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 2.3998F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 33, -12, 0.0F, 0.0F, -1.5F, 0, 2, 12, 0.0F, false));

        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(1.335F, -0.6235F, -2.4529F);
        this.main.addChild(leftHindwing);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.0486F, -0.375F, 5.3385F);
        this.leftHindwing.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 1.5708F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 31, 11, 0.0F, 0.0F, -6.0F, 3, 0, 11, 0.0F, false));

        this.leftHindwingFoldable = new AdvancedModelRenderer(this);
        this.leftHindwingFoldable.setRotationPoint(-0.0484F, -0.3743F, 0.8385F);
        this.leftHindwing.addChild(leftHindwingFoldable);
        this.setRotateAngle(leftHindwingFoldable, 0.0F, 0.0F, -2.3998F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftHindwingFoldable.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 2.3998F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 31, 23, 0.0F, 0.0F, -1.5F, 0, 3, 11, 0.0F, false));

        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(-1.335F, -0.6235F, -2.4529F);
        this.main.addChild(rightHindwing);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0486F, -0.375F, 5.3385F);
        this.rightHindwing.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 11, -3.0F, 0.0F, -6.0F, 3, 0, 11, 0.0F, true));

        this.rightHindwingFoldable = new AdvancedModelRenderer(this);
        this.rightHindwingFoldable.setRotationPoint(0.0484F, -0.3743F, 0.8385F);
        this.rightHindwing.addChild(rightHindwingFoldable);
        this.setRotateAngle(rightHindwingFoldable, 0.0F, 0.0F, 2.3998F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightHindwingFoldable.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -2.3998F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 23, 0.0F, 0.0F, -1.5F, 0, 3, 11, 0.0F, true));

        this.rightForewing = new AdvancedModelRenderer(this);
        this.rightForewing.setRotationPoint(-1.36F, -0.6735F, -3.4529F);
        this.main.addChild(rightForewing);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0486F, -0.375F, 5.3385F);
        this.rightForewing.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -1.5708F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 11, -3.0F, 0.0F, -6.0F, 3, 0, 12, 0.0F, true));

        this.rightForewingFoldable = new AdvancedModelRenderer(this);
        this.rightForewingFoldable.setRotationPoint(0.0484F, -0.3743F, 0.8385F);
        this.rightForewing.addChild(rightForewingFoldable);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightForewingFoldable.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -2.3998F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 33, -12, 0.0F, 0.0F, -1.5F, 0, 2, 12, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.8432F, 1.4153F, -3.7052F);
        this.main.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.4302F, 1.0413F, 0.5342F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 50, 6, -3.9392F, -0.4639F, -0.111F, 4, 1, 0, 0.0F, true));

        this.rightLeg32 = new AdvancedModelRenderer(this);
        this.rightLeg32.setRotationPoint(-3.9392F, -0.4639F, -0.111F);
        this.rightLeg3.addChild(rightLeg32);
        this.setRotateAngle(rightLeg32, 0.0F, 0.0F, -1.6144F);
        this.rightLeg32.cubeList.add(new ModelBox(rightLeg32, 50, 3, -4.0064F, -1.051F, -0.01F, 4, 2, 0, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.5F, 0.5F, -3.95F);
        this.main.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.3491F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 9, 34, -3.5F, 0.3F, 0.0F, 4, 3, 0, 0.0F, true));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.25F, 0.5F, -4.5F);
        this.main.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, -0.6545F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 0, 33, -3.75F, 0.3F, 0.0F, 4, 3, 0, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.25F, 0.5F, -4.5F);
        this.main.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, 0.6545F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 0, 33, -0.25F, 0.3F, 0.0F, 4, 3, 0, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.5F, 0.5F, -3.95F);
        this.main.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, -0.3491F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 9, 34, -0.5F, 0.3F, 0.0F, 4, 3, 0, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.8432F, 1.4153F, -3.7052F);
        this.main.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.4302F, -1.0413F, -0.5342F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 50, 6, -0.0608F, -0.4639F, -0.111F, 4, 1, 0, 0.0F, false));

        this.leftLeg32 = new AdvancedModelRenderer(this);
        this.leftLeg32.setRotationPoint(3.9392F, -0.4639F, -0.111F);
        this.leftLeg3.addChild(leftLeg32);
        this.setRotateAngle(leftLeg32, 0.0F, 0.0F, 1.6144F);
        this.leftLeg32.cubeList.add(new ModelBox(leftLeg32, 50, 3, 0.0064F, -1.051F, -0.01F, 4, 2, 0, 0.0F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -0.6523F, -4.0363F);
        this.main.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 24, -1.0F, -0.1477F, -0.4637F, 2, 2, 6, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 33, 3, -1.0F, 1.4523F, -0.4637F, 2, 1, 6, -0.01F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 23, 38, -1.0F, 0.1523F, 5.5363F, 2, 2, 1, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 30, 38, -0.5F, 0.6523F, 6.5363F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 1.1523F, 7.5363F);
        this.abdomen.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.2793F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 42, 22, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 1.1523F, 7.5363F);
        this.abdomen.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2793F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 42, 22, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.1523F, 8.0363F);
        this.abdomen.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 38, 0.0F, -1.6F, -0.475F, 0, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.425F, -5.4F);
        this.main.addChild(head);
        this.setRotateAngle(head, -0.1309F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.75F, -0.038F, -1.1405F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 29, -0.375F, -0.475F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 29, 0.875F, -0.475F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.875F, -0.425F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 38, -0.5F, 1.475F, -1.45F, 1, 1, 2, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 17, 29, -1.0F, 0.0F, -1.5F, 2, 2, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.8236F, 0.2007F, -2.0937F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2308F, 0.0065F, -0.1884F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 24, -0.175F, 0.85F, 0.375F, 0, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.8236F, 0.2007F, -2.0937F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2308F, -0.0065F, 0.1884F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 24, 0.175F, 0.85F, 0.375F, 0, 1, 1, 0.0F, false));

        this.rightAntennae = new AdvancedModelRenderer(this);
        this.rightAntennae.setRotationPoint(-0.4899F, 0.0392F, -1.5807F);
        this.head.addChild(rightAntennae);
        this.setRotateAngle(rightAntennae, 0.3765F, -0.0586F, -0.235F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.0F, -1.25F);
        this.rightAntennae.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, -12, 0.0F, -4.5F, -1.0F, 0, 6, 16, 0.0F, true));

        this.leftAntennae = new AdvancedModelRenderer(this);
        this.leftAntennae.setRotationPoint(0.4899F, 0.0392F, -1.5807F);
        this.head.addChild(leftAntennae);
        this.setRotateAngle(leftAntennae, 0.3765F, 0.0586F, 0.235F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.0F, -1.25F);
        this.leftAntennae.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, -12, 0.0F, -4.5F, -1.0F, 0, 6, 16, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(main, 1.0F, 0.0F, 0.0F);
        this.main.offsetY = -0.25F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        //this.body.offsetZ = -0.080F;
        this.main.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -2.30F;
        this.main.offsetX = -0.05F;
        this.main.rotateAngleY = (float)Math.toRadians(210);
        this.main.rotateAngleX = (float)Math.toRadians(40);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 3.9F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraPycnophlebia ee = (EntityPrehistoricFloraPycnophlebia) e;
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
        EntityPrehistoricFloraPycnophlebia ee = (EntityPrehistoricFloraPycnophlebia) entitylivingbaseIn;

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
                if (!ee.getIsFlying() && ee.getIsMoving() && ee.onGround) {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
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
            //Is gliding:
            animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        }

        if (ee.getIsJumping() && ee.getAnimation() == ee.ROAR_ANIMATION) {
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPycnophlebia entity = (EntityPrehistoricFloraPycnophlebia) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-30), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*2.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+30))*0.25);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(0), leftLeg1.rotateAngleY + (float) Math.toRadians(0), leftLeg1.rotateAngleZ + (float) Math.toRadians(-67.5));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0), leftLeg2.rotateAngleY + (float) Math.toRadians(22.5), leftLeg2.rotateAngleZ + (float) Math.toRadians(-22.5));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(0), leftLeg3.rotateAngleY + (float) Math.toRadians(0), leftLeg3.rotateAngleZ + (float) Math.toRadians(77.5));


        this.setRotateAngle(leftLeg32, leftLeg32.rotateAngleX + (float) Math.toRadians(0), leftLeg32.rotateAngleY + (float) Math.toRadians(0), leftLeg32.rotateAngleZ + (float) Math.toRadians(-50));


        this.setRotateAngle(leftAntennae, leftAntennae.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-60))*5), leftAntennae.rotateAngleY + (float) Math.toRadians(0), leftAntennae.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -95.70215 + (((tickAnim - 0) / 1) * (-90.37853-(-95.70215)));
            yy = -27.38601 + (((tickAnim - 0) / 1) * (-45.46086-(-27.38601)));
            zz = -58.65378 + (((tickAnim - 0) / 1) * (-105.76572-(-58.65378)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -90.37853 + (((tickAnim - 1) / 1) * (-84.84878-(-90.37853)));
            yy = -45.46086 + (((tickAnim - 1) / 1) * (-3.53661-(-45.46086)));
            zz = -105.76572 + (((tickAnim - 1) / 1) * (-153.2704-(-105.76572)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -84.84878 + (((tickAnim - 2) / 1) * (-98.77929-(-84.84878)));
            yy = -3.53661 + (((tickAnim - 2) / 1) * (41.31011-(-3.53661)));
            zz = -153.2704 + (((tickAnim - 2) / 1) * (-118.08793-(-153.2704)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -98.77929 + (((tickAnim - 3) / 0) * (-95.70215-(-98.77929)));
            yy = 41.31011 + (((tickAnim - 3) / 0) * (-27.38601-(41.31011)));
            zz = -118.08793 + (((tickAnim - 3) / 0) * (-58.65378-(-118.08793)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -95.70215 + (((tickAnim - 3) / 1) * (-90.37853-(-95.70215)));
            yy = -27.38601 + (((tickAnim - 3) / 1) * (-45.46086-(-27.38601)));
            zz = -58.65378 + (((tickAnim - 3) / 1) * (-105.76572-(-58.65378)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -90.37853 + (((tickAnim - 4) / 1) * (-84.84878-(-90.37853)));
            yy = -45.46086 + (((tickAnim - 4) / 1) * (-3.53661-(-45.46086)));
            zz = -105.76572 + (((tickAnim - 4) / 1) * (-153.2704-(-105.76572)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -84.84878 + (((tickAnim - 5) / 1) * (-98.77929-(-84.84878)));
            yy = -3.53661 + (((tickAnim - 5) / 1) * (41.31011-(-3.53661)));
            zz = -153.2704 + (((tickAnim - 5) / 1) * (-118.08793-(-153.2704)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -98.77929 + (((tickAnim - 6) / 1) * (-95.70215-(-98.77929)));
            yy = 41.31011 + (((tickAnim - 6) / 1) * (-27.38601-(41.31011)));
            zz = -118.08793 + (((tickAnim - 6) / 1) * (-58.65378-(-118.08793)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -95.70215 + (((tickAnim - 7) / 1) * (-90.37853-(-95.70215)));
            yy = -27.38601 + (((tickAnim - 7) / 1) * (-45.46086-(-27.38601)));
            zz = -58.65378 + (((tickAnim - 7) / 1) * (-105.76572-(-58.65378)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -90.37853 + (((tickAnim - 8) / 0) * (-84.84878-(-90.37853)));
            yy = -45.46086 + (((tickAnim - 8) / 0) * (-3.53661-(-45.46086)));
            zz = -105.76572 + (((tickAnim - 8) / 0) * (-153.2704-(-105.76572)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -84.84878 + (((tickAnim - 8) / 1) * (-98.77929-(-84.84878)));
            yy = -3.53661 + (((tickAnim - 8) / 1) * (41.31011-(-3.53661)));
            zz = -153.2704 + (((tickAnim - 8) / 1) * (-118.08793-(-153.2704)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -98.77929 + (((tickAnim - 9) / 1) * (-95.70215-(-98.77929)));
            yy = 41.31011 + (((tickAnim - 9) / 1) * (-27.38601-(41.31011)));
            zz = -118.08793 + (((tickAnim - 9) / 1) * (-58.65378-(-118.08793)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -95.70215 + (((tickAnim - 10) / 1) * (-90.37853-(-95.70215)));
            yy = -27.38601 + (((tickAnim - 10) / 1) * (-45.46086-(-27.38601)));
            zz = -58.65378 + (((tickAnim - 10) / 1) * (-105.76572-(-58.65378)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -90.37853 + (((tickAnim - 11) / 1) * (-84.84878-(-90.37853)));
            yy = -45.46086 + (((tickAnim - 11) / 1) * (-3.53661-(-45.46086)));
            zz = -105.76572 + (((tickAnim - 11) / 1) * (-153.2704-(-105.76572)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -84.84878 + (((tickAnim - 12) / 1) * (-98.77929-(-84.84878)));
            yy = -3.53661 + (((tickAnim - 12) / 1) * (41.31011-(-3.53661)));
            zz = -153.2704 + (((tickAnim - 12) / 1) * (-118.08793-(-153.2704)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -98.77929 + (((tickAnim - 13) / 0) * (-95.70215-(-98.77929)));
            yy = 41.31011 + (((tickAnim - 13) / 0) * (-27.38601-(41.31011)));
            zz = -118.08793 + (((tickAnim - 13) / 0) * (-58.65378-(-118.08793)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -95.70215 + (((tickAnim - 13) / 1) * (-90.37853-(-95.70215)));
            yy = -27.38601 + (((tickAnim - 13) / 1) * (-45.46086-(-27.38601)));
            zz = -58.65378 + (((tickAnim - 13) / 1) * (-105.76572-(-58.65378)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -90.37853 + (((tickAnim - 14) / 1) * (-84.84878-(-90.37853)));
            yy = -45.46086 + (((tickAnim - 14) / 1) * (-3.53661-(-45.46086)));
            zz = -105.76572 + (((tickAnim - 14) / 1) * (-153.2704-(-105.76572)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -84.84878 + (((tickAnim - 15) / 1) * (-98.77929-(-84.84878)));
            yy = -3.53661 + (((tickAnim - 15) / 1) * (41.31011-(-3.53661)));
            zz = -153.2704 + (((tickAnim - 15) / 1) * (-118.08793-(-153.2704)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -98.77929 + (((tickAnim - 16) / 1) * (-95.70215-(-98.77929)));
            yy = 41.31011 + (((tickAnim - 16) / 1) * (-27.38601-(41.31011)));
            zz = -118.08793 + (((tickAnim - 16) / 1) * (-58.65378-(-118.08793)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -95.70215 + (((tickAnim - 17) / 1) * (-90.37853-(-95.70215)));
            yy = -27.38601 + (((tickAnim - 17) / 1) * (-45.46086-(-27.38601)));
            zz = -58.65378 + (((tickAnim - 17) / 1) * (-105.76572-(-58.65378)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -90.37853 + (((tickAnim - 18) / 0) * (-84.84878-(-90.37853)));
            yy = -45.46086 + (((tickAnim - 18) / 0) * (-3.53661-(-45.46086)));
            zz = -105.76572 + (((tickAnim - 18) / 0) * (-153.2704-(-105.76572)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -84.84878 + (((tickAnim - 18) / 1) * (-98.77929-(-84.84878)));
            yy = -3.53661 + (((tickAnim - 18) / 1) * (41.31011-(-3.53661)));
            zz = -153.2704 + (((tickAnim - 18) / 1) * (-118.08793-(-153.2704)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -98.77929 + (((tickAnim - 19) / 1) * (-96.37012-(-98.77929)));
            yy = 41.31011 + (((tickAnim - 19) / 1) * (-37.33101-(41.31011)));
            zz = -118.08793 + (((tickAnim - 19) / 1) * (-57.41047-(-118.08793)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(xx), leftForewing.rotateAngleY + (float) Math.toRadians(yy), leftForewing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftForewingFoldable, leftForewingFoldable.rotateAngleX + (float) Math.toRadians(0), leftForewingFoldable.rotateAngleY + (float) Math.toRadians(0), leftForewingFoldable.rotateAngleZ + (float) Math.toRadians(45));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -76.57802 + (((tickAnim - 0) / 1) * (-69.79983-(-76.57802)));
            yy = -24.83367 + (((tickAnim - 0) / 1) * (-40.67924-(-24.83367)));
            zz = -51.86719 + (((tickAnim - 0) / 1) * (-102.37294-(-51.86719)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -69.79983 + (((tickAnim - 1) / 1) * (-66.05078-(-69.79983)));
            yy = -40.67924 + (((tickAnim - 1) / 1) * (-1.33513-(-40.67924)));
            zz = -102.37294 + (((tickAnim - 1) / 1) * (-143.01157-(-102.37294)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -66.05078 + (((tickAnim - 2) / 1) * (-63.53545-(-66.05078)));
            yy = -1.33513 + (((tickAnim - 2) / 1) * (45.55383-(-1.33513)));
            zz = -143.01157 + (((tickAnim - 2) / 1) * (-73.4964-(-143.01157)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -63.53545 + (((tickAnim - 3) / 0) * (-76.57802-(-63.53545)));
            yy = 45.55383 + (((tickAnim - 3) / 0) * (-24.83367-(45.55383)));
            zz = -73.4964 + (((tickAnim - 3) / 0) * (-51.86719-(-73.4964)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -76.57802 + (((tickAnim - 3) / 1) * (-69.79983-(-76.57802)));
            yy = -24.83367 + (((tickAnim - 3) / 1) * (-40.67924-(-24.83367)));
            zz = -51.86719 + (((tickAnim - 3) / 1) * (-102.37294-(-51.86719)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -69.79983 + (((tickAnim - 4) / 1) * (-66.05078-(-69.79983)));
            yy = -40.67924 + (((tickAnim - 4) / 1) * (-1.33513-(-40.67924)));
            zz = -102.37294 + (((tickAnim - 4) / 1) * (-143.01157-(-102.37294)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -66.05078 + (((tickAnim - 5) / 1) * (-63.53545-(-66.05078)));
            yy = -1.33513 + (((tickAnim - 5) / 1) * (45.55383-(-1.33513)));
            zz = -143.01157 + (((tickAnim - 5) / 1) * (-73.4964-(-143.01157)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -63.53545 + (((tickAnim - 6) / 1) * (-76.57802-(-63.53545)));
            yy = 45.55383 + (((tickAnim - 6) / 1) * (-24.83367-(45.55383)));
            zz = -73.4964 + (((tickAnim - 6) / 1) * (-51.86719-(-73.4964)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -76.57802 + (((tickAnim - 7) / 1) * (-69.79983-(-76.57802)));
            yy = -24.83367 + (((tickAnim - 7) / 1) * (-40.67924-(-24.83367)));
            zz = -51.86719 + (((tickAnim - 7) / 1) * (-102.37294-(-51.86719)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -69.79983 + (((tickAnim - 8) / 0) * (-66.05078-(-69.79983)));
            yy = -40.67924 + (((tickAnim - 8) / 0) * (-1.33513-(-40.67924)));
            zz = -102.37294 + (((tickAnim - 8) / 0) * (-143.01157-(-102.37294)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -66.05078 + (((tickAnim - 8) / 1) * (-63.53545-(-66.05078)));
            yy = -1.33513 + (((tickAnim - 8) / 1) * (45.55383-(-1.33513)));
            zz = -143.01157 + (((tickAnim - 8) / 1) * (-73.4964-(-143.01157)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -63.53545 + (((tickAnim - 9) / 1) * (-76.57802-(-63.53545)));
            yy = 45.55383 + (((tickAnim - 9) / 1) * (-24.83367-(45.55383)));
            zz = -73.4964 + (((tickAnim - 9) / 1) * (-51.86719-(-73.4964)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -76.57802 + (((tickAnim - 10) / 1) * (-69.79983-(-76.57802)));
            yy = -24.83367 + (((tickAnim - 10) / 1) * (-40.67924-(-24.83367)));
            zz = -51.86719 + (((tickAnim - 10) / 1) * (-102.37294-(-51.86719)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -69.79983 + (((tickAnim - 11) / 1) * (-66.05078-(-69.79983)));
            yy = -40.67924 + (((tickAnim - 11) / 1) * (-1.33513-(-40.67924)));
            zz = -102.37294 + (((tickAnim - 11) / 1) * (-143.01157-(-102.37294)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -66.05078 + (((tickAnim - 12) / 1) * (-63.53545-(-66.05078)));
            yy = -1.33513 + (((tickAnim - 12) / 1) * (45.55383-(-1.33513)));
            zz = -143.01157 + (((tickAnim - 12) / 1) * (-73.4964-(-143.01157)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -63.53545 + (((tickAnim - 13) / 0) * (-76.57802-(-63.53545)));
            yy = 45.55383 + (((tickAnim - 13) / 0) * (-24.83367-(45.55383)));
            zz = -73.4964 + (((tickAnim - 13) / 0) * (-51.86719-(-73.4964)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -76.57802 + (((tickAnim - 13) / 1) * (-69.79983-(-76.57802)));
            yy = -24.83367 + (((tickAnim - 13) / 1) * (-40.67924-(-24.83367)));
            zz = -51.86719 + (((tickAnim - 13) / 1) * (-102.37294-(-51.86719)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -69.79983 + (((tickAnim - 14) / 1) * (-66.05078-(-69.79983)));
            yy = -40.67924 + (((tickAnim - 14) / 1) * (-1.33513-(-40.67924)));
            zz = -102.37294 + (((tickAnim - 14) / 1) * (-143.01157-(-102.37294)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -66.05078 + (((tickAnim - 15) / 1) * (-63.53545-(-66.05078)));
            yy = -1.33513 + (((tickAnim - 15) / 1) * (45.55383-(-1.33513)));
            zz = -143.01157 + (((tickAnim - 15) / 1) * (-73.4964-(-143.01157)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -63.53545 + (((tickAnim - 16) / 1) * (-76.57802-(-63.53545)));
            yy = 45.55383 + (((tickAnim - 16) / 1) * (-24.83367-(45.55383)));
            zz = -73.4964 + (((tickAnim - 16) / 1) * (-51.86719-(-73.4964)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -76.57802 + (((tickAnim - 17) / 1) * (-69.79983-(-76.57802)));
            yy = -24.83367 + (((tickAnim - 17) / 1) * (-40.67924-(-24.83367)));
            zz = -51.86719 + (((tickAnim - 17) / 1) * (-102.37294-(-51.86719)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -69.79983 + (((tickAnim - 18) / 0) * (-66.05078-(-69.79983)));
            yy = -40.67924 + (((tickAnim - 18) / 0) * (-1.33513-(-40.67924)));
            zz = -102.37294 + (((tickAnim - 18) / 0) * (-143.01157-(-102.37294)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -66.05078 + (((tickAnim - 18) / 1) * (-63.53545-(-66.05078)));
            yy = -1.33513 + (((tickAnim - 18) / 1) * (45.55383-(-1.33513)));
            zz = -143.01157 + (((tickAnim - 18) / 1) * (-73.4964-(-143.01157)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -63.53545 + (((tickAnim - 19) / 1) * (-76.57802-(-63.53545)));
            yy = 45.55383 + (((tickAnim - 19) / 1) * (-24.83367-(45.55383)));
            zz = -73.4964 + (((tickAnim - 19) / 1) * (-51.86719-(-73.4964)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(xx), leftHindwing.rotateAngleY + (float) Math.toRadians(yy), leftHindwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -0.26618 + (((tickAnim - 0) / 1) * (-0.04875-(-0.26618)));
            yy = -0.33908 + (((tickAnim - 0) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 0) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -0.04875 + (((tickAnim - 1) / 1) * (0-(-0.04875)));
            yy = -0.54038 + (((tickAnim - 1) / 1) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 1) / 1) * (0-(-0.42591)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-0.26618-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (-0.19949-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -0.26618 + (((tickAnim - 3) / 1) * (-0.04875-(-0.26618)));
            yy = -0.33908 + (((tickAnim - 3) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 3) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -0.04875 + (((tickAnim - 4) / 1) * (0-(-0.04875)));
            yy = -0.54038 + (((tickAnim - 4) / 1) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 4) / 1) * (0-(-0.42591)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (-0.26618-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-0.19949-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -0.26618 + (((tickAnim - 7) / 1) * (-0.04875-(-0.26618)));
            yy = -0.33908 + (((tickAnim - 7) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 7) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -0.04875 + (((tickAnim - 8) / 0) * (0-(-0.04875)));
            yy = -0.54038 + (((tickAnim - 8) / 0) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 8) / 0) * (0-(-0.42591)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-0.26618-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-0.19949-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -0.26618 + (((tickAnim - 10) / 1) * (-0.04875-(-0.26618)));
            yy = -0.33908 + (((tickAnim - 10) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 10) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -0.04875 + (((tickAnim - 11) / 1) * (0-(-0.04875)));
            yy = -0.54038 + (((tickAnim - 11) / 1) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 11) / 1) * (0-(-0.42591)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (-0.26618-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (-0.19949-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -0.26618 + (((tickAnim - 13) / 1) * (-0.04875-(-0.26618)));
            yy = -0.33908 + (((tickAnim - 13) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 13) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -0.04875 + (((tickAnim - 14) / 1) * (0-(-0.04875)));
            yy = -0.54038 + (((tickAnim - 14) / 1) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 14) / 1) * (0-(-0.42591)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (-0.26618-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (-0.19949-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -0.26618 + (((tickAnim - 17) / 1) * (-0.04875-(-0.26618)));
            yy = -0.33908 + (((tickAnim - 17) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 17) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -0.04875 + (((tickAnim - 18) / 0) * (0-(-0.04875)));
            yy = -0.54038 + (((tickAnim - 18) / 0) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 18) / 0) * (0-(-0.42591)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (-0.26618-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-0.19949-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHindwing.rotationPointX = this.leftHindwing.rotationPointX + (float)(xx);
        this.leftHindwing.rotationPointY = this.leftHindwing.rotationPointY - (float)(yy);
        this.leftHindwing.rotationPointZ = this.leftHindwing.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftHindwingFoldable, leftHindwingFoldable.rotateAngleX + (float) Math.toRadians(0), leftHindwingFoldable.rotateAngleY + (float) Math.toRadians(0), leftHindwingFoldable.rotateAngleZ + (float) Math.toRadians(177.5));


        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(0), rightLeg1.rotateAngleY + (float) Math.toRadians(0), rightLeg1.rotateAngleZ + (float) Math.toRadians(67.5));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0), rightLeg2.rotateAngleY + (float) Math.toRadians(-22.5), rightLeg2.rotateAngleZ + (float) Math.toRadians(22.5));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(0), rightLeg3.rotateAngleY + (float) Math.toRadians(0), rightLeg3.rotateAngleZ + (float) Math.toRadians(-77.5));


        this.setRotateAngle(rightLeg32, rightLeg32.rotateAngleX + (float) Math.toRadians(0), rightLeg32.rotateAngleY + (float) Math.toRadians(0), rightLeg32.rotateAngleZ + (float) Math.toRadians(50));


        this.setRotateAngle(rightAntennae, rightAntennae.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*5), rightAntennae.rotateAngleY + (float) Math.toRadians(0), rightAntennae.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -95.70215 + (((tickAnim - 0) / 1) * (-90.37853-(-95.70215)));
            yy = 27.38601 + (((tickAnim - 0) / 1) * (45.46086-(27.38601)));
            zz = 58.65378 + (((tickAnim - 0) / 1) * (105.76572-(58.65378)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -90.37853 + (((tickAnim - 1) / 1) * (-84.84878-(-90.37853)));
            yy = 45.46086 + (((tickAnim - 1) / 1) * (3.53661-(45.46086)));
            zz = 105.76572 + (((tickAnim - 1) / 1) * (153.2704-(105.76572)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -84.84878 + (((tickAnim - 2) / 1) * (-98.77929-(-84.84878)));
            yy = 3.53661 + (((tickAnim - 2) / 1) * (-41.31011-(3.53661)));
            zz = 153.2704 + (((tickAnim - 2) / 1) * (118.08793-(153.2704)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -98.77929 + (((tickAnim - 3) / 0) * (-95.70215-(-98.77929)));
            yy = -41.31011 + (((tickAnim - 3) / 0) * (27.38601-(-41.31011)));
            zz = 118.08793 + (((tickAnim - 3) / 0) * (58.65378-(118.08793)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -95.70215 + (((tickAnim - 3) / 1) * (-90.37853-(-95.70215)));
            yy = 27.38601 + (((tickAnim - 3) / 1) * (45.46086-(27.38601)));
            zz = 58.65378 + (((tickAnim - 3) / 1) * (105.76572-(58.65378)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -90.37853 + (((tickAnim - 4) / 1) * (-84.84878-(-90.37853)));
            yy = 45.46086 + (((tickAnim - 4) / 1) * (3.53661-(45.46086)));
            zz = 105.76572 + (((tickAnim - 4) / 1) * (153.2704-(105.76572)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -84.84878 + (((tickAnim - 5) / 1) * (-98.77929-(-84.84878)));
            yy = 3.53661 + (((tickAnim - 5) / 1) * (-41.31011-(3.53661)));
            zz = 153.2704 + (((tickAnim - 5) / 1) * (118.08793-(153.2704)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -98.77929 + (((tickAnim - 6) / 1) * (-95.70215-(-98.77929)));
            yy = -41.31011 + (((tickAnim - 6) / 1) * (27.38601-(-41.31011)));
            zz = 118.08793 + (((tickAnim - 6) / 1) * (58.65378-(118.08793)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -95.70215 + (((tickAnim - 7) / 1) * (-90.37853-(-95.70215)));
            yy = 27.38601 + (((tickAnim - 7) / 1) * (45.46086-(27.38601)));
            zz = 58.65378 + (((tickAnim - 7) / 1) * (105.76572-(58.65378)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -90.37853 + (((tickAnim - 8) / 0) * (-84.84878-(-90.37853)));
            yy = 45.46086 + (((tickAnim - 8) / 0) * (3.53661-(45.46086)));
            zz = 105.76572 + (((tickAnim - 8) / 0) * (153.2704-(105.76572)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -84.84878 + (((tickAnim - 8) / 1) * (-98.77929-(-84.84878)));
            yy = 3.53661 + (((tickAnim - 8) / 1) * (-41.31011-(3.53661)));
            zz = 153.2704 + (((tickAnim - 8) / 1) * (118.08793-(153.2704)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -98.77929 + (((tickAnim - 9) / 1) * (-95.70215-(-98.77929)));
            yy = -41.31011 + (((tickAnim - 9) / 1) * (27.38601-(-41.31011)));
            zz = 118.08793 + (((tickAnim - 9) / 1) * (58.65378-(118.08793)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -95.70215 + (((tickAnim - 10) / 1) * (-90.37853-(-95.70215)));
            yy = 27.38601 + (((tickAnim - 10) / 1) * (45.46086-(27.38601)));
            zz = 58.65378 + (((tickAnim - 10) / 1) * (105.76572-(58.65378)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -90.37853 + (((tickAnim - 11) / 1) * (-84.84878-(-90.37853)));
            yy = 45.46086 + (((tickAnim - 11) / 1) * (3.53661-(45.46086)));
            zz = 105.76572 + (((tickAnim - 11) / 1) * (153.2704-(105.76572)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -84.84878 + (((tickAnim - 12) / 1) * (-98.77929-(-84.84878)));
            yy = 3.53661 + (((tickAnim - 12) / 1) * (-41.31011-(3.53661)));
            zz = 153.2704 + (((tickAnim - 12) / 1) * (118.08793-(153.2704)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -98.77929 + (((tickAnim - 13) / 0) * (-95.70215-(-98.77929)));
            yy = -41.31011 + (((tickAnim - 13) / 0) * (27.38601-(-41.31011)));
            zz = 118.08793 + (((tickAnim - 13) / 0) * (58.65378-(118.08793)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -95.70215 + (((tickAnim - 13) / 1) * (-90.37853-(-95.70215)));
            yy = 27.38601 + (((tickAnim - 13) / 1) * (45.46086-(27.38601)));
            zz = 58.65378 + (((tickAnim - 13) / 1) * (105.76572-(58.65378)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -90.37853 + (((tickAnim - 14) / 1) * (-84.84878-(-90.37853)));
            yy = 45.46086 + (((tickAnim - 14) / 1) * (3.53661-(45.46086)));
            zz = 105.76572 + (((tickAnim - 14) / 1) * (153.2704-(105.76572)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -84.84878 + (((tickAnim - 15) / 1) * (-98.77929-(-84.84878)));
            yy = 3.53661 + (((tickAnim - 15) / 1) * (-41.31011-(3.53661)));
            zz = 153.2704 + (((tickAnim - 15) / 1) * (118.08793-(153.2704)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -98.77929 + (((tickAnim - 16) / 1) * (-95.70215-(-98.77929)));
            yy = -41.31011 + (((tickAnim - 16) / 1) * (27.38601-(-41.31011)));
            zz = 118.08793 + (((tickAnim - 16) / 1) * (58.65378-(118.08793)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -95.70215 + (((tickAnim - 17) / 1) * (-90.37853-(-95.70215)));
            yy = 27.38601 + (((tickAnim - 17) / 1) * (45.46086-(27.38601)));
            zz = 58.65378 + (((tickAnim - 17) / 1) * (105.76572-(58.65378)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -90.37853 + (((tickAnim - 18) / 0) * (-84.84878-(-90.37853)));
            yy = 45.46086 + (((tickAnim - 18) / 0) * (3.53661-(45.46086)));
            zz = 105.76572 + (((tickAnim - 18) / 0) * (153.2704-(105.76572)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -84.84878 + (((tickAnim - 18) / 1) * (-98.77929-(-84.84878)));
            yy = 3.53661 + (((tickAnim - 18) / 1) * (-41.31011-(3.53661)));
            zz = 153.2704 + (((tickAnim - 18) / 1) * (118.08793-(153.2704)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -98.77929 + (((tickAnim - 19) / 1) * (-96.37012-(-98.77929)));
            yy = -41.31011 + (((tickAnim - 19) / 1) * (37.33101-(-41.31011)));
            zz = 118.08793 + (((tickAnim - 19) / 1) * (57.41047-(118.08793)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForewing, rightForewing.rotateAngleX + (float) Math.toRadians(xx), rightForewing.rotateAngleY + (float) Math.toRadians(yy), rightForewing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightForewingFoldable, rightForewingFoldable.rotateAngleX + (float) Math.toRadians(0), rightForewingFoldable.rotateAngleY + (float) Math.toRadians(0), rightForewingFoldable.rotateAngleZ + (float) Math.toRadians(-45));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -76.57802 + (((tickAnim - 0) / 1) * (-69.79983-(-76.57802)));
            yy = 24.83367 + (((tickAnim - 0) / 1) * (40.67924-(24.83367)));
            zz = 51.86719 + (((tickAnim - 0) / 1) * (102.37294-(51.86719)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -69.79983 + (((tickAnim - 1) / 1) * (-66.05078-(-69.79983)));
            yy = 40.67924 + (((tickAnim - 1) / 1) * (1.33513-(40.67924)));
            zz = 102.37294 + (((tickAnim - 1) / 1) * (143.01157-(102.37294)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -66.05078 + (((tickAnim - 2) / 1) * (-63.53545-(-66.05078)));
            yy = 1.33513 + (((tickAnim - 2) / 1) * (-45.55383-(1.33513)));
            zz = 143.01157 + (((tickAnim - 2) / 1) * (73.4964-(143.01157)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -63.53545 + (((tickAnim - 3) / 0) * (-76.57802-(-63.53545)));
            yy = -45.55383 + (((tickAnim - 3) / 0) * (24.83367-(-45.55383)));
            zz = 73.4964 + (((tickAnim - 3) / 0) * (51.86719-(73.4964)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -76.57802 + (((tickAnim - 3) / 1) * (-69.79983-(-76.57802)));
            yy = 24.83367 + (((tickAnim - 3) / 1) * (40.67924-(24.83367)));
            zz = 51.86719 + (((tickAnim - 3) / 1) * (102.37294-(51.86719)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -69.79983 + (((tickAnim - 4) / 1) * (-66.05078-(-69.79983)));
            yy = 40.67924 + (((tickAnim - 4) / 1) * (1.33513-(40.67924)));
            zz = 102.37294 + (((tickAnim - 4) / 1) * (143.01157-(102.37294)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -66.05078 + (((tickAnim - 5) / 1) * (-63.53545-(-66.05078)));
            yy = 1.33513 + (((tickAnim - 5) / 1) * (-45.55383-(1.33513)));
            zz = 143.01157 + (((tickAnim - 5) / 1) * (73.4964-(143.01157)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -63.53545 + (((tickAnim - 6) / 1) * (-76.57802-(-63.53545)));
            yy = -45.55383 + (((tickAnim - 6) / 1) * (24.83367-(-45.55383)));
            zz = 73.4964 + (((tickAnim - 6) / 1) * (51.86719-(73.4964)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -76.57802 + (((tickAnim - 7) / 1) * (-69.79983-(-76.57802)));
            yy = 24.83367 + (((tickAnim - 7) / 1) * (40.67924-(24.83367)));
            zz = 51.86719 + (((tickAnim - 7) / 1) * (102.37294-(51.86719)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -69.79983 + (((tickAnim - 8) / 0) * (-66.05078-(-69.79983)));
            yy = 40.67924 + (((tickAnim - 8) / 0) * (1.33513-(40.67924)));
            zz = 102.37294 + (((tickAnim - 8) / 0) * (143.01157-(102.37294)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -66.05078 + (((tickAnim - 8) / 1) * (-63.53545-(-66.05078)));
            yy = 1.33513 + (((tickAnim - 8) / 1) * (-45.55383-(1.33513)));
            zz = 143.01157 + (((tickAnim - 8) / 1) * (73.4964-(143.01157)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -63.53545 + (((tickAnim - 9) / 1) * (-76.57802-(-63.53545)));
            yy = -45.55383 + (((tickAnim - 9) / 1) * (24.83367-(-45.55383)));
            zz = 73.4964 + (((tickAnim - 9) / 1) * (51.86719-(73.4964)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -76.57802 + (((tickAnim - 10) / 1) * (-69.79983-(-76.57802)));
            yy = 24.83367 + (((tickAnim - 10) / 1) * (40.67924-(24.83367)));
            zz = 51.86719 + (((tickAnim - 10) / 1) * (102.37294-(51.86719)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -69.79983 + (((tickAnim - 11) / 1) * (-66.05078-(-69.79983)));
            yy = 40.67924 + (((tickAnim - 11) / 1) * (1.33513-(40.67924)));
            zz = 102.37294 + (((tickAnim - 11) / 1) * (143.01157-(102.37294)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -66.05078 + (((tickAnim - 12) / 1) * (-63.53545-(-66.05078)));
            yy = 1.33513 + (((tickAnim - 12) / 1) * (-45.55383-(1.33513)));
            zz = 143.01157 + (((tickAnim - 12) / 1) * (73.4964-(143.01157)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -63.53545 + (((tickAnim - 13) / 0) * (-76.57802-(-63.53545)));
            yy = -45.55383 + (((tickAnim - 13) / 0) * (24.83367-(-45.55383)));
            zz = 73.4964 + (((tickAnim - 13) / 0) * (51.86719-(73.4964)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -76.57802 + (((tickAnim - 13) / 1) * (-69.79983-(-76.57802)));
            yy = 24.83367 + (((tickAnim - 13) / 1) * (40.67924-(24.83367)));
            zz = 51.86719 + (((tickAnim - 13) / 1) * (102.37294-(51.86719)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -69.79983 + (((tickAnim - 14) / 1) * (-66.05078-(-69.79983)));
            yy = 40.67924 + (((tickAnim - 14) / 1) * (1.33513-(40.67924)));
            zz = 102.37294 + (((tickAnim - 14) / 1) * (143.01157-(102.37294)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -66.05078 + (((tickAnim - 15) / 1) * (-63.53545-(-66.05078)));
            yy = 1.33513 + (((tickAnim - 15) / 1) * (-45.55383-(1.33513)));
            zz = 143.01157 + (((tickAnim - 15) / 1) * (73.4964-(143.01157)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -63.53545 + (((tickAnim - 16) / 1) * (-76.57802-(-63.53545)));
            yy = -45.55383 + (((tickAnim - 16) / 1) * (24.83367-(-45.55383)));
            zz = 73.4964 + (((tickAnim - 16) / 1) * (51.86719-(73.4964)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -76.57802 + (((tickAnim - 17) / 1) * (-69.79983-(-76.57802)));
            yy = 24.83367 + (((tickAnim - 17) / 1) * (40.67924-(24.83367)));
            zz = 51.86719 + (((tickAnim - 17) / 1) * (102.37294-(51.86719)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -69.79983 + (((tickAnim - 18) / 0) * (-66.05078-(-69.79983)));
            yy = 40.67924 + (((tickAnim - 18) / 0) * (1.33513-(40.67924)));
            zz = 102.37294 + (((tickAnim - 18) / 0) * (143.01157-(102.37294)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -66.05078 + (((tickAnim - 18) / 1) * (-63.53545-(-66.05078)));
            yy = 1.33513 + (((tickAnim - 18) / 1) * (-45.55383-(1.33513)));
            zz = 143.01157 + (((tickAnim - 18) / 1) * (73.4964-(143.01157)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -63.53545 + (((tickAnim - 19) / 1) * (-76.57802-(-63.53545)));
            yy = -45.55383 + (((tickAnim - 19) / 1) * (24.83367-(-45.55383)));
            zz = 73.4964 + (((tickAnim - 19) / 1) * (51.86719-(73.4964)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(xx), rightHindwing.rotateAngleY + (float) Math.toRadians(yy), rightHindwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0.26618 + (((tickAnim - 0) / 1) * (0.04875-(0.26618)));
            yy = -0.33908 + (((tickAnim - 0) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 0) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0.04875 + (((tickAnim - 1) / 1) * (0-(0.04875)));
            yy = -0.54038 + (((tickAnim - 1) / 1) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 1) / 1) * (0-(-0.42591)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0.26618-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (-0.19949-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0.26618 + (((tickAnim - 3) / 1) * (0.04875-(0.26618)));
            yy = -0.33908 + (((tickAnim - 3) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 3) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0.04875 + (((tickAnim - 4) / 1) * (0-(0.04875)));
            yy = -0.54038 + (((tickAnim - 4) / 1) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 4) / 1) * (0-(-0.42591)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0.26618-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-0.19949-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0.26618 + (((tickAnim - 7) / 1) * (0.04875-(0.26618)));
            yy = -0.33908 + (((tickAnim - 7) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 7) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0.04875 + (((tickAnim - 8) / 0) * (0-(0.04875)));
            yy = -0.54038 + (((tickAnim - 8) / 0) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 8) / 0) * (0-(-0.42591)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0.26618-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-0.19949-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0.26618 + (((tickAnim - 10) / 1) * (0.04875-(0.26618)));
            yy = -0.33908 + (((tickAnim - 10) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 10) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0.04875 + (((tickAnim - 11) / 1) * (0-(0.04875)));
            yy = -0.54038 + (((tickAnim - 11) / 1) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 11) / 1) * (0-(-0.42591)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0.26618-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (-0.19949-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0.26618 + (((tickAnim - 13) / 1) * (0.04875-(0.26618)));
            yy = -0.33908 + (((tickAnim - 13) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 13) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0.04875 + (((tickAnim - 14) / 1) * (0-(0.04875)));
            yy = -0.54038 + (((tickAnim - 14) / 1) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 14) / 1) * (0-(-0.42591)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0.26618-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (-0.19949-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0.26618 + (((tickAnim - 17) / 1) * (0.04875-(0.26618)));
            yy = -0.33908 + (((tickAnim - 17) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 17) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0.04875 + (((tickAnim - 18) / 0) * (0-(0.04875)));
            yy = -0.54038 + (((tickAnim - 18) / 0) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 18) / 0) * (0-(-0.42591)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0.26618-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-0.19949-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHindwing.rotationPointX = this.rightHindwing.rotationPointX + (float)(xx);
        this.rightHindwing.rotationPointY = this.rightHindwing.rotationPointY - (float)(yy);
        this.rightHindwing.rotationPointZ = this.rightHindwing.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightHindwingFoldable, rightHindwingFoldable.rotateAngleX + (float) Math.toRadians(0), rightHindwingFoldable.rotateAngleY + (float) Math.toRadians(0), rightHindwingFoldable.rotateAngleZ + (float) Math.toRadians(-177.5));


    }
    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isMoving) {
        EntityPrehistoricFloraPycnophlebia entity = (EntityPrehistoricFloraPycnophlebia) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        if (!isMoving) {
            tickAnim = 0;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+150))*1.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+150))*2.5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+60))*2.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+60))*0.1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -9.28 + (((tickAnim - 0) / 2) * (12.73916-(-9.28)));
            yy = 11.26 + (((tickAnim - 0) / 2) * (21.66159-(11.26)));
            zz = -14.43 + (((tickAnim - 0) / 2) * (14.75144-(-14.43)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 12.73916 + (((tickAnim - 2) / 3) * (2.33397-(12.73916)));
            yy = 21.66159 + (((tickAnim - 2) / 3) * (2.59128-(21.66159)));
            zz = 14.75144 + (((tickAnim - 2) / 3) * (3.74396-(14.75144)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 2.33397 + (((tickAnim - 5) / 4) * (2.8612-(2.33397)));
            yy = 2.59128 + (((tickAnim - 5) / 4) * (-22.76926-(2.59128)));
            zz = 3.74396 + (((tickAnim - 5) / 4) * (11.11992-(3.74396)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 2.8612 + (((tickAnim - 9) / 4) * (-18.55198-(2.8612)));
            yy = -22.76926 + (((tickAnim - 9) / 4) * (0.0285-(-22.76926)));
            zz = 11.11992 + (((tickAnim - 9) / 4) * (-28.8518-(11.11992)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -18.55198 + (((tickAnim - 13) / 2) * (-9.28-(-18.55198)));
            yy = 0.0285 + (((tickAnim - 13) / 2) * (11.26-(0.0285)));
            zz = -28.8518 + (((tickAnim - 13) / 2) * (-14.43-(-28.8518)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.13165 + (((tickAnim - 0) / 3) * (-0.41419-(-0.13165)));
            yy = -7.49885 + (((tickAnim - 0) / 3) * (-22.49639-(-7.49885)));
            zz = 1.00863 + (((tickAnim - 0) / 3) * (1.08237-(1.00863)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -0.41419 + (((tickAnim - 3) / 4) * (-1.43681-(-0.41419)));
            yy = -22.49639 + (((tickAnim - 3) / 4) * (3.46419-(-22.49639)));
            zz = 1.08237 + (((tickAnim - 3) / 4) * (-22.54345-(1.08237)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -1.43681 + (((tickAnim - 7) / 3) * (4.11405-(-1.43681)));
            yy = 3.46419 + (((tickAnim - 7) / 3) * (22.13991-(3.46419)));
            zz = -22.54345 + (((tickAnim - 7) / 3) * (10.80524-(-22.54345)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 4.11405 + (((tickAnim - 10) / 3) * (1.47307-(4.11405)));
            yy = 22.13991 + (((tickAnim - 10) / 3) * (7.44149-(22.13991)));
            zz = 10.80524 + (((tickAnim - 10) / 3) * (1.87534-(10.80524)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1.47307 + (((tickAnim - 13) / 2) * (-0.13165-(1.47307)));
            yy = 7.44149 + (((tickAnim - 13) / 2) * (-7.49885-(7.44149)));
            zz = 1.87534 + (((tickAnim - 13) / 2) * (1.00863-(1.87534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 6.21925 + (((tickAnim - 0) / 3) * (-11.59079-(6.21925)));
            yy = 23.7226 + (((tickAnim - 0) / 3) * (22.953-(23.7226)));
            zz = -15.9993 + (((tickAnim - 0) / 3) * (2.3105-(-15.9993)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = -11.59079 + (((tickAnim - 3) / 8) * (-7-(-11.59079)));
            yy = 22.953 + (((tickAnim - 3) / 8) * (0-(22.953)));
            zz = 2.3105 + (((tickAnim - 3) / 8) * (15-(2.3105)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -7 + (((tickAnim - 11) / 4) * (6.21925-(-7)));
            yy = 0 + (((tickAnim - 11) / 4) * (23.7226-(0)));
            zz = 15 + (((tickAnim - 11) / 4) * (-15.9993-(15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (-27.5-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = -27.5 + (((tickAnim - 11) / 4) * (-2.5-(-27.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg32, leftLeg32.rotateAngleX + (float) Math.toRadians(xx), leftLeg32.rotateAngleY + (float) Math.toRadians(yy), leftLeg32.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftAntennae, leftAntennae.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+60))*5), leftAntennae.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+90))*2.5), leftAntennae.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+120))*2.5));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.00307 + (((tickAnim - 0) / 4) * (-18.55198-(2.00307)));
            yy = 22.6313 + (((tickAnim - 0) / 4) * (-0.02851-(22.6313)));
            zz = -7.7614 + (((tickAnim - 0) / 4) * (28.85183-(-7.7614)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -18.55198 + (((tickAnim - 4) / 4) * (6.88918-(-18.55198)));
            yy = -0.02851 + (((tickAnim - 4) / 4) * (-22.25913-(-0.02851)));
            zz = 28.85183 + (((tickAnim - 4) / 4) * (-7.96138-(28.85183)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6.88918 + (((tickAnim - 8) / 2) * (7.06945-(6.88918)));
            yy = -22.25913 + (((tickAnim - 8) / 2) * (-7.08992-(-22.25913)));
            zz = -7.96138 + (((tickAnim - 8) / 2) * (-9.79283-(-7.96138)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 7.06945 + (((tickAnim - 10) / 3) * (1.33099-(7.06945)));
            yy = -7.08992 + (((tickAnim - 10) / 3) * (7.49454-(-7.08992)));
            zz = -9.79283 + (((tickAnim - 10) / 3) * (-3.21705-(-9.79283)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1.33099 + (((tickAnim - 13) / 2) * (2.00307-(1.33099)));
            yy = 7.49454 + (((tickAnim - 13) / 2) * (22.6313-(7.49454)));
            zz = -3.21705 + (((tickAnim - 13) / 2) * (-7.7614-(-3.21705)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 1.55758 + (((tickAnim - 0) / 1) * (4.11405-(1.55758)));
            yy = -17.67723 + (((tickAnim - 0) / 1) * (-22.13991-(-17.67723)));
            zz = -0.6584 + (((tickAnim - 0) / 1) * (-10.80524-(-0.6584)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 4.11405 + (((tickAnim - 1) / 2) * (3.82667-(4.11405)));
            yy = -22.13991 + (((tickAnim - 1) / 2) * (-12.08454-(-22.13991)));
            zz = -10.80524 + (((tickAnim - 1) / 2) * (-10.10697-(-10.80524)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.82667 + (((tickAnim - 3) / 2) * (1.77993-(3.82667)));
            yy = -12.08454 + (((tickAnim - 3) / 2) * (2.54007-(-12.08454)));
            zz = -10.10697 + (((tickAnim - 3) / 2) * (-1.40127-(-10.10697)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1.77993 + (((tickAnim - 5) / 3) * (-0.41419-(1.77993)));
            yy = 2.54007 + (((tickAnim - 5) / 3) * (22.49639-(2.54007)));
            zz = -1.40127 + (((tickAnim - 5) / 3) * (-1.08237-(-1.40127)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -0.41419 + (((tickAnim - 8) / 5) * (-1.43681-(-0.41419)));
            yy = 22.49639 + (((tickAnim - 8) / 5) * (-3.46419-(22.49639)));
            zz = -1.08237 + (((tickAnim - 8) / 5) * (22.54345-(-1.08237)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -1.43681 + (((tickAnim - 13) / 2) * (1.55758-(-1.43681)));
            yy = -3.46419 + (((tickAnim - 13) / 2) * (-17.67723-(-3.46419)));
            zz = 22.54345 + (((tickAnim - 13) / 2) * (-0.6584-(22.54345)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -9.04 + (((tickAnim - 0) / 3) * (-7-(-9.04)));
            yy = -10.2 + (((tickAnim - 0) / 3) * (0-(-10.2)));
            zz = -9.36 + (((tickAnim - 0) / 3) * (-15-(-9.36)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -7 + (((tickAnim - 3) / 5) * (6.21925-(-7)));
            yy = 0 + (((tickAnim - 3) / 5) * (-23.7226-(0)));
            zz = -15 + (((tickAnim - 3) / 5) * (15.9993-(-15)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 6.21925 + (((tickAnim - 8) / 3) * (-11.59079-(6.21925)));
            yy = -23.7226 + (((tickAnim - 8) / 3) * (-22.953-(-23.7226)));
            zz = 15.9993 + (((tickAnim - 8) / 3) * (-2.3105-(15.9993)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -11.59079 + (((tickAnim - 11) / 4) * (-9.04-(-11.59079)));
            yy = -22.953 + (((tickAnim - 11) / 4) * (-10.2-(-22.953)));
            zz = -2.3105 + (((tickAnim - 11) / 4) * (-9.36-(-2.3105)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 15.28 + (((tickAnim - 0) / 3) * (27.5-(15.28)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 27.5 + (((tickAnim - 3) / 5) * (2.5-(27.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 2.5 + (((tickAnim - 8) / 3) * (0-(2.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (15.28-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg32, rightLeg32.rotateAngleX + (float) Math.toRadians(xx), rightLeg32.rotateAngleY + (float) Math.toRadians(yy), rightLeg32.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightAntennae, rightAntennae.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+120))*5), rightAntennae.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+150))*2.5), rightAntennae.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+180))*2.5));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPycnophlebia entity = (EntityPrehistoricFloraPycnophlebia) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+150))*1.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+150))*2.5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+60))*2.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+60))*0.1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -9.28 + (((tickAnim - 0) / 2) * (12.73916-(-9.28)));
            yy = 11.26 + (((tickAnim - 0) / 2) * (21.66159-(11.26)));
            zz = -14.43 + (((tickAnim - 0) / 2) * (14.75144-(-14.43)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 12.73916 + (((tickAnim - 2) / 3) * (2.33397-(12.73916)));
            yy = 21.66159 + (((tickAnim - 2) / 3) * (2.59128-(21.66159)));
            zz = 14.75144 + (((tickAnim - 2) / 3) * (3.74396-(14.75144)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 2.33397 + (((tickAnim - 5) / 4) * (2.8612-(2.33397)));
            yy = 2.59128 + (((tickAnim - 5) / 4) * (-22.76926-(2.59128)));
            zz = 3.74396 + (((tickAnim - 5) / 4) * (11.11992-(3.74396)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 2.8612 + (((tickAnim - 9) / 4) * (-18.55198-(2.8612)));
            yy = -22.76926 + (((tickAnim - 9) / 4) * (0.0285-(-22.76926)));
            zz = 11.11992 + (((tickAnim - 9) / 4) * (-28.8518-(11.11992)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -18.55198 + (((tickAnim - 13) / 2) * (-9.28-(-18.55198)));
            yy = 0.0285 + (((tickAnim - 13) / 2) * (11.26-(0.0285)));
            zz = -28.8518 + (((tickAnim - 13) / 2) * (-14.43-(-28.8518)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.13165 + (((tickAnim - 0) / 3) * (-0.41419-(-0.13165)));
            yy = -7.49885 + (((tickAnim - 0) / 3) * (-22.49639-(-7.49885)));
            zz = 1.00863 + (((tickAnim - 0) / 3) * (1.08237-(1.00863)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -0.41419 + (((tickAnim - 3) / 4) * (-1.43681-(-0.41419)));
            yy = -22.49639 + (((tickAnim - 3) / 4) * (3.46419-(-22.49639)));
            zz = 1.08237 + (((tickAnim - 3) / 4) * (-22.54345-(1.08237)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -1.43681 + (((tickAnim - 7) / 3) * (4.11405-(-1.43681)));
            yy = 3.46419 + (((tickAnim - 7) / 3) * (22.13991-(3.46419)));
            zz = -22.54345 + (((tickAnim - 7) / 3) * (10.80524-(-22.54345)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 4.11405 + (((tickAnim - 10) / 3) * (1.47307-(4.11405)));
            yy = 22.13991 + (((tickAnim - 10) / 3) * (7.44149-(22.13991)));
            zz = 10.80524 + (((tickAnim - 10) / 3) * (1.87534-(10.80524)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1.47307 + (((tickAnim - 13) / 2) * (-0.13165-(1.47307)));
            yy = 7.44149 + (((tickAnim - 13) / 2) * (-7.49885-(7.44149)));
            zz = 1.87534 + (((tickAnim - 13) / 2) * (1.00863-(1.87534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 6.21925 + (((tickAnim - 0) / 3) * (-11.59079-(6.21925)));
            yy = 23.7226 + (((tickAnim - 0) / 3) * (22.953-(23.7226)));
            zz = -15.9993 + (((tickAnim - 0) / 3) * (2.3105-(-15.9993)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = -11.59079 + (((tickAnim - 3) / 8) * (-7-(-11.59079)));
            yy = 22.953 + (((tickAnim - 3) / 8) * (0-(22.953)));
            zz = 2.3105 + (((tickAnim - 3) / 8) * (15-(2.3105)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -7 + (((tickAnim - 11) / 4) * (6.21925-(-7)));
            yy = 0 + (((tickAnim - 11) / 4) * (23.7226-(0)));
            zz = 15 + (((tickAnim - 11) / 4) * (-15.9993-(15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (-27.5-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = -27.5 + (((tickAnim - 11) / 4) * (-2.5-(-27.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg32, leftLeg32.rotateAngleX + (float) Math.toRadians(xx), leftLeg32.rotateAngleY + (float) Math.toRadians(yy), leftLeg32.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftAntennae, leftAntennae.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+60))*5), leftAntennae.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+90))*2.5), leftAntennae.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+120))*2.5));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.00307 + (((tickAnim - 0) / 4) * (-18.55198-(2.00307)));
            yy = 22.6313 + (((tickAnim - 0) / 4) * (-0.02851-(22.6313)));
            zz = -7.7614 + (((tickAnim - 0) / 4) * (28.85183-(-7.7614)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -18.55198 + (((tickAnim - 4) / 4) * (6.88918-(-18.55198)));
            yy = -0.02851 + (((tickAnim - 4) / 4) * (-22.25913-(-0.02851)));
            zz = 28.85183 + (((tickAnim - 4) / 4) * (-7.96138-(28.85183)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6.88918 + (((tickAnim - 8) / 2) * (7.06945-(6.88918)));
            yy = -22.25913 + (((tickAnim - 8) / 2) * (-7.08992-(-22.25913)));
            zz = -7.96138 + (((tickAnim - 8) / 2) * (-9.79283-(-7.96138)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 7.06945 + (((tickAnim - 10) / 3) * (1.33099-(7.06945)));
            yy = -7.08992 + (((tickAnim - 10) / 3) * (7.49454-(-7.08992)));
            zz = -9.79283 + (((tickAnim - 10) / 3) * (-3.21705-(-9.79283)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1.33099 + (((tickAnim - 13) / 2) * (2.00307-(1.33099)));
            yy = 7.49454 + (((tickAnim - 13) / 2) * (22.6313-(7.49454)));
            zz = -3.21705 + (((tickAnim - 13) / 2) * (-7.7614-(-3.21705)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 1.55758 + (((tickAnim - 0) / 1) * (4.11405-(1.55758)));
            yy = -17.67723 + (((tickAnim - 0) / 1) * (-22.13991-(-17.67723)));
            zz = -0.6584 + (((tickAnim - 0) / 1) * (-10.80524-(-0.6584)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 4.11405 + (((tickAnim - 1) / 2) * (3.82667-(4.11405)));
            yy = -22.13991 + (((tickAnim - 1) / 2) * (-12.08454-(-22.13991)));
            zz = -10.80524 + (((tickAnim - 1) / 2) * (-10.10697-(-10.80524)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.82667 + (((tickAnim - 3) / 2) * (1.77993-(3.82667)));
            yy = -12.08454 + (((tickAnim - 3) / 2) * (2.54007-(-12.08454)));
            zz = -10.10697 + (((tickAnim - 3) / 2) * (-1.40127-(-10.10697)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1.77993 + (((tickAnim - 5) / 3) * (-0.41419-(1.77993)));
            yy = 2.54007 + (((tickAnim - 5) / 3) * (22.49639-(2.54007)));
            zz = -1.40127 + (((tickAnim - 5) / 3) * (-1.08237-(-1.40127)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -0.41419 + (((tickAnim - 8) / 5) * (-1.43681-(-0.41419)));
            yy = 22.49639 + (((tickAnim - 8) / 5) * (-3.46419-(22.49639)));
            zz = -1.08237 + (((tickAnim - 8) / 5) * (22.54345-(-1.08237)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -1.43681 + (((tickAnim - 13) / 2) * (1.55758-(-1.43681)));
            yy = -3.46419 + (((tickAnim - 13) / 2) * (-17.67723-(-3.46419)));
            zz = 22.54345 + (((tickAnim - 13) / 2) * (-0.6584-(22.54345)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -9.04 + (((tickAnim - 0) / 3) * (-7-(-9.04)));
            yy = -10.2 + (((tickAnim - 0) / 3) * (0-(-10.2)));
            zz = -9.36 + (((tickAnim - 0) / 3) * (-15-(-9.36)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -7 + (((tickAnim - 3) / 5) * (6.21925-(-7)));
            yy = 0 + (((tickAnim - 3) / 5) * (-23.7226-(0)));
            zz = -15 + (((tickAnim - 3) / 5) * (15.9993-(-15)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 6.21925 + (((tickAnim - 8) / 3) * (-11.59079-(6.21925)));
            yy = -23.7226 + (((tickAnim - 8) / 3) * (-22.953-(-23.7226)));
            zz = 15.9993 + (((tickAnim - 8) / 3) * (-2.3105-(15.9993)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -11.59079 + (((tickAnim - 11) / 4) * (-9.04-(-11.59079)));
            yy = -22.953 + (((tickAnim - 11) / 4) * (-10.2-(-22.953)));
            zz = -2.3105 + (((tickAnim - 11) / 4) * (-9.36-(-2.3105)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 15.28 + (((tickAnim - 0) / 3) * (27.5-(15.28)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 27.5 + (((tickAnim - 3) / 5) * (2.5-(27.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 2.5 + (((tickAnim - 8) / 3) * (0-(2.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (15.28-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg32, rightLeg32.rotateAngleX + (float) Math.toRadians(xx), rightLeg32.rotateAngleY + (float) Math.toRadians(yy), rightLeg32.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightAntennae, rightAntennae.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+120))*5), rightAntennae.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+150))*2.5), rightAntennae.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+180))*2.5));


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPycnophlebia entity = (EntityPrehistoricFloraPycnophlebia) entitylivingbaseIn;
        int animCycle = 14;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 1) {
            xx = 14.66393 + (((tickAnim - 0) / 1) * (13.81197-(14.66393)));
            yy = 1.0934 + (((tickAnim - 0) / 1) * (1.15739-(1.0934)));
            zz = -1.30294 + (((tickAnim - 0) / 1) * (-21.91151-(-1.30294)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 13.81197 + (((tickAnim - 1) / 1) * (14.66393-(13.81197)));
            yy = 1.15739 + (((tickAnim - 1) / 1) * (1.0934-(1.15739)));
            zz = -21.91151 + (((tickAnim - 1) / 1) * (-1.30294-(-21.91151)));
        }
        else if (tickAnim >= 2 && tickAnim < 14) {
            xx = 14.66393 + (((tickAnim - 2) / 12) * (14.66393-(14.66393)));
            yy = 1.0934 + (((tickAnim - 2) / 12) * (1.0934-(1.0934)));
            zz = -1.30294 + (((tickAnim - 2) / 12) * (-1.30294-(-1.30294)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(xx), leftForewing.rotateAngleY + (float) Math.toRadians(yy), leftForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-17.5-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = -2.5 + (((tickAnim - 1) / 1) * (0-(-2.5)));
            zz = -17.5 + (((tickAnim - 1) / 1) * (0-(-17.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 2) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(xx), leftHindwing.rotateAngleY + (float) Math.toRadians(yy), leftHindwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 14.66393 + (((tickAnim - 0) / 1) * (13.81197-(14.66393)));
            yy = -1.0934 + (((tickAnim - 0) / 1) * (-1.15739-(-1.0934)));
            zz = 1.30294 + (((tickAnim - 0) / 1) * (21.91151-(1.30294)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 13.81197 + (((tickAnim - 1) / 1) * (14.66393-(13.81197)));
            yy = -1.15739 + (((tickAnim - 1) / 1) * (-1.0934-(-1.15739)));
            zz = 21.91151 + (((tickAnim - 1) / 1) * (1.30294-(21.91151)));
        }
        else if (tickAnim >= 2 && tickAnim < 14) {
            xx = 14.66393 + (((tickAnim - 2) / 12) * (14.66393-(14.66393)));
            yy = -1.0934 + (((tickAnim - 2) / 12) * (-1.0934-(-1.0934)));
            zz = 1.30294 + (((tickAnim - 2) / 12) * (1.30294-(1.30294)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForewing, rightForewing.rotateAngleX + (float) Math.toRadians(xx), rightForewing.rotateAngleY + (float) Math.toRadians(yy), rightForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (17.5-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 2.5 + (((tickAnim - 1) / 1) * (0-(2.5)));
            zz = 17.5 + (((tickAnim - 1) / 1) * (0-(17.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 2) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(xx), rightHindwing.rotateAngleY + (float) Math.toRadians(yy), rightHindwing.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
