package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaboilus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelArchaboilus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftHindwingFoldable;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftForewingFoldable;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightForewing;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightForewingFoldable;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightHindwingFoldable;
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

    public ModelArchaboilus() {
        this.textureWidth = 45;
        this.textureHeight = 44;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.35F, 1.25F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.925F, -4.5F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 10, -1.5F, -1.0F, -0.2F, 3, 2, 1, -0.02F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 37, -1.5F, -1.0F, -1.0F, 3, 2, 1, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.225F, -4.5F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 41, -0.5F, -1.025F, 0.8F, 2, 0, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 0, -1.0F, -1.025F, -1.2F, 3, 2, 2, 0.0F, false));

        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(1.335F, -0.4738F, -2.4437F);
        this.main.addChild(leftHindwing);
        this.setRotateAngle(leftHindwing, 0.0611F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.0486F, -0.375F, 5.3385F);
        this.leftHindwing.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 31, 0.0F, 0.0F, -6.0F, 2, 0, 5, 0.0F, false));

        this.leftHindwingFoldable = new AdvancedModelRenderer(this);
        this.leftHindwingFoldable.setRotationPoint(-0.0484F, -0.3743F, 0.8385F);
        this.leftHindwing.addChild(leftHindwingFoldable);
        this.setRotateAngle(leftHindwingFoldable, 0.0F, 0.0F, -2.3998F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftHindwingFoldable.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 2.3998F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 23, 0.0F, 0.0F, -1.5F, 0, 2, 5, 0.0F, false));

        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(1.36F, -0.4985F, -3.4529F);
        this.main.addChild(leftForewing);
        this.setRotateAngle(leftForewing, 0.0524F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.0486F, -0.375F, 5.3385F);
        this.leftForewing.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 1.5708F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 23, 0.0F, 0.0F, -6.0F, 2, 0, 6, 0.0F, false));

        this.leftForewingFoldable = new AdvancedModelRenderer(this);
        this.leftForewingFoldable.setRotationPoint(-0.0484F, -0.3743F, 0.8385F);
        this.leftForewing.addChild(leftForewingFoldable);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftForewingFoldable.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 1.6144F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 31, 0.0F, 0.0F, -1.5F, 0, 1, 6, 0.0F, false));

        this.rightForewing = new AdvancedModelRenderer(this);
        this.rightForewing.setRotationPoint(-1.36F, -0.4985F, -3.4529F);
        this.main.addChild(rightForewing);
        this.setRotateAngle(rightForewing, 0.0524F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0486F, -0.375F, 5.3385F);
        this.rightForewing.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 23, -2.0F, 0.0F, -6.0F, 2, 0, 6, 0.0F, true));

        this.rightForewingFoldable = new AdvancedModelRenderer(this);
        this.rightForewingFoldable.setRotationPoint(0.0484F, -0.3743F, 0.8385F);
        this.rightForewing.addChild(rightForewingFoldable);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightForewingFoldable.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -1.6144F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 31, 0.0F, 0.0F, -1.5F, 0, 1, 6, 0.0F, true));

        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(-1.335F, -0.4738F, -2.4437F);
        this.main.addChild(rightHindwing);
        this.setRotateAngle(rightHindwing, 0.0611F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0486F, -0.375F, 5.3385F);
        this.rightHindwing.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -1.5708F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 31, -2.0F, 0.0F, -6.0F, 2, 0, 5, 0.0F, true));

        this.rightHindwingFoldable = new AdvancedModelRenderer(this);
        this.rightHindwingFoldable.setRotationPoint(0.0484F, -0.3743F, 0.8385F);
        this.rightHindwing.addChild(rightHindwingFoldable);
        this.setRotateAngle(rightHindwingFoldable, 0.0F, 0.0F, 2.3998F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightHindwingFoldable.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -2.3998F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 23, 0.0F, 0.0F, -1.5F, 0, 2, 5, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.8432F, 1.4153F, -3.7052F);
        this.main.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.4302F, 1.0413F, 0.5342F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 16, 39, -3.9392F, -0.4639F, -0.111F, 4, 1, 0, 0.0F, true));

        this.rightLeg32 = new AdvancedModelRenderer(this);
        this.rightLeg32.setRotationPoint(-3.9392F, -0.4639F, -0.111F);
        this.rightLeg3.addChild(rightLeg32);
        this.setRotateAngle(rightLeg32, 0.0F, 0.0F, -1.6144F);
        this.rightLeg32.cubeList.add(new ModelBox(rightLeg32, 35, 37, -4.0064F, -1.051F, -0.01F, 4, 2, 0, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.5F, 0.5F, -3.95F);
        this.main.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.3491F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 33, 18, -3.5F, 0.3F, 0.0F, 4, 3, 0, 0.0F, true));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.25F, 0.5F, -4.5F);
        this.main.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, -0.6545F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 33, 14, -3.75F, 0.3F, 0.0F, 4, 3, 0, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.25F, 0.5F, -4.5F);
        this.main.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, 0.6545F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 33, 14, -0.25F, 0.3F, 0.0F, 4, 3, 0, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.5F, 0.5F, -3.95F);
        this.main.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, -0.3491F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 33, 18, -0.5F, 0.3F, 0.0F, 4, 3, 0, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.8432F, 1.4153F, -3.7052F);
        this.main.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.4302F, -1.0413F, -0.5342F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 16, 39, -0.0608F, -0.4639F, -0.111F, 4, 1, 0, 0.0F, false));

        this.leftLeg32 = new AdvancedModelRenderer(this);
        this.leftLeg32.setRotationPoint(3.9392F, -0.4639F, -0.111F);
        this.leftLeg3.addChild(leftLeg32);
        this.setRotateAngle(leftLeg32, 0.0F, 0.0F, 1.6144F);
        this.leftLeg32.cubeList.add(new ModelBox(leftLeg32, 35, 37, 0.0064F, -1.051F, -0.01F, 4, 2, 0, 0.0F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -0.6523F, -4.0363F);
        this.main.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 17, 23, -1.0F, -0.1477F, -0.4637F, 2, 2, 5, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 30, -1.0F, 1.4523F, -0.4637F, 2, 1, 5, -0.01F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 35, 40, -1.0F, 0.1523F, 4.5363F, 2, 2, 1, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 21, 41, -0.5F, 0.6523F, 5.5363F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 1.1523F, 6.5363F);
        this.abdomen.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.2793F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 42, 8, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 1.1523F, 6.5363F);
        this.abdomen.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2793F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 42, 8, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.1523F, 8.0363F);
        this.abdomen.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 37, 0.0F, -1.775F, -1.475F, 0, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.425F, -5.4F);
        this.main.addChild(head);
        this.setRotateAngle(head, -0.1309F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.75F, -0.038F, -1.1405F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 41, -0.375F, -0.475F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 41, 0.875F, -0.475F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.875F, -0.425F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 9, 39, -0.5F, 1.475F, -1.45F, 1, 1, 2, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 33, 5, -1.0F, 0.0F, -1.5F, 2, 2, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.8236F, 0.2007F, -2.0937F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2308F, 0.0065F, -0.1884F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 42, 5, -0.175F, 0.85F, 0.375F, 0, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.8236F, 0.2007F, -2.0937F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2308F, -0.0065F, 0.1884F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 42, 5, 0.175F, 0.85F, 0.375F, 0, 1, 1, 0.0F, false));

        this.rightAntennae = new AdvancedModelRenderer(this);
        this.rightAntennae.setRotationPoint(-0.4899F, 0.0392F, -1.5807F);
        this.head.addChild(rightAntennae);
        this.setRotateAngle(rightAntennae, 0.3765F, -0.0586F, -0.235F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.0F, -1.25F);
        this.rightAntennae.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, 0.0F, -4.5F, -1.0F, 0, 6, 16, 0.0F, true));

        this.leftAntennae = new AdvancedModelRenderer(this);
        this.leftAntennae.setRotationPoint(0.4899F, 0.0392F, -1.5807F);
        this.head.addChild(leftAntennae);
        this.setRotateAngle(leftAntennae, 0.3765F, 0.0586F, 0.235F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.0F, -1.25F);
        this.leftAntennae.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, 0.0F, -4.5F, -1.0F, 0, 6, 16, 0.0F, false));

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

        EntityPrehistoricFloraArchaboilus ee = (EntityPrehistoricFloraArchaboilus) e;
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
        EntityPrehistoricFloraArchaboilus ee = (EntityPrehistoricFloraArchaboilus) entitylivingbaseIn;

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
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }

        if (ee.getIsJumping() && ee.getAnimation() == ee.JUMP_ANIMATION) {
            animJump(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getIsJumping() && ee.getAnimation() == ee.ROAR_ANIMATION) {
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    
    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isMoving) {
        EntityPrehistoricFloraArchaboilus entity = (EntityPrehistoricFloraArchaboilus) entitylivingbaseIn;
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
        EntityPrehistoricFloraArchaboilus entity = (EntityPrehistoricFloraArchaboilus) entitylivingbaseIn;
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
        EntityPrehistoricFloraArchaboilus entity = (EntityPrehistoricFloraArchaboilus) entitylivingbaseIn;
        int animCycle = 14;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 1) {
            xx = 14.66393 + (((tickAnim - 0) / 1) * (13.81246-(14.66393)));
            yy = 1.0934 + (((tickAnim - 0) / 1) * (-1.23579-(1.0934)));
            zz = -1.30294 + (((tickAnim - 0) / 1) * (-22.63455-(-1.30294)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 13.81246 + (((tickAnim - 1) / 2) * (14.66393-(13.81246)));
            yy = -1.23579 + (((tickAnim - 1) / 2) * (1.0934-(-1.23579)));
            zz = -22.63455 + (((tickAnim - 1) / 2) * (-1.30294-(-22.63455)));
        }
        else if (tickAnim >= 3 && tickAnim < 14) {
            xx = 14.66393 + (((tickAnim - 3) / 11) * (14.66393-(14.66393)));
            yy = 1.0934 + (((tickAnim - 3) / 11) * (1.0934-(1.0934)));
            zz = -1.30294 + (((tickAnim - 3) / 11) * (-1.30294-(-1.30294)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(xx), leftForewing.rotateAngleY + (float) Math.toRadians(yy), leftForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0.20429-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-2.18566-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-22.49429-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0.20429 + (((tickAnim - 1) / 2) * (0-(0.20429)));
            yy = -2.18566 + (((tickAnim - 1) / 2) * (0-(-2.18566)));
            zz = -22.49429 + (((tickAnim - 1) / 2) * (0-(-22.49429)));
        }
        else if (tickAnim >= 3 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 3) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(xx), leftHindwing.rotateAngleY + (float) Math.toRadians(yy), leftHindwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0.20429-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (2.18566-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (22.49429-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0.20429 + (((tickAnim - 1) / 2) * (0-(0.20429)));
            yy = 2.18566 + (((tickAnim - 1) / 2) * (0-(2.18566)));
            zz = 22.49429 + (((tickAnim - 1) / 2) * (0-(22.49429)));
        }
        else if (tickAnim >= 3 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 3) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(xx), rightHindwing.rotateAngleY + (float) Math.toRadians(yy), rightHindwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 14.66393 + (((tickAnim - 0) / 1) * (13.81246-(14.66393)));
            yy = -1.0934 + (((tickAnim - 0) / 1) * (1.23579-(-1.0934)));
            zz = 1.30294 + (((tickAnim - 0) / 1) * (22.63455-(1.30294)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 13.81246 + (((tickAnim - 1) / 2) * (14.66393-(13.81246)));
            yy = 1.23579 + (((tickAnim - 1) / 2) * (-1.0934-(1.23579)));
            zz = 22.63455 + (((tickAnim - 1) / 2) * (1.30294-(22.63455)));
        }
        else if (tickAnim >= 3 && tickAnim < 14) {
            xx = 14.66393 + (((tickAnim - 3) / 11) * (14.66393-(14.66393)));
            yy = -1.0934 + (((tickAnim - 3) / 11) * (-1.0934-(-1.0934)));
            zz = 1.30294 + (((tickAnim - 3) / 11) * (1.30294-(1.30294)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForewing, rightForewing.rotateAngleX + (float) Math.toRadians(xx), rightForewing.rotateAngleY + (float) Math.toRadians(yy), rightForewing.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animJump(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchaboilus entity = (EntityPrehistoricFloraArchaboilus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.4905-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.21782-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-4.99527-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 2.4905 + (((tickAnim - 3) / 3) * (-24.87739-(2.4905)));
            yy = 0.21782 + (((tickAnim - 3) / 3) * (1.93597-(0.21782)));
            zz = -4.99527 + (((tickAnim - 3) / 3) * (7.24721-(-4.99527)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -24.87739 + (((tickAnim - 6) / 2) * (-27.08129-(-24.87739)));
            yy = 1.93597 + (((tickAnim - 6) / 2) * (-0.24993-(1.93597)));
            zz = 7.24721 + (((tickAnim - 6) / 2) * (-2.86856-(7.24721)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -27.08129 + (((tickAnim - 8) / 9) * (-8.29874-(-27.08129)));
            yy = -0.24993 + (((tickAnim - 8) / 9) * (0.72347-(-0.24993)));
            zz = -2.86856 + (((tickAnim - 8) / 9) * (4.94751-(-2.86856)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -8.29874 + (((tickAnim - 17) / 3) * (0-(-8.29874)));
            yy = 0.72347 + (((tickAnim - 17) / 3) * (0-(0.72347)));
            zz = 4.94751 + (((tickAnim - 17) / 3) * (0-(4.94751)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.75-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 1.75 + (((tickAnim - 5) / 8) * (0.97-(1.75)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.97 + (((tickAnim - 13) / 7) * (0-(0.97)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-67.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = -67.5 + (((tickAnim - 5) / 15) * (0-(-67.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (22.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-22.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 22.5 + (((tickAnim - 5) / 15) * (0-(22.5)));
            zz = -22.5 + (((tickAnim - 5) / 15) * (0-(-22.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1.04943-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-85.10683-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-3.78017-(0)));
            zz = 1.04943 + (((tickAnim - 3) / 2) * (94.99688-(1.04943)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -85.10683 + (((tickAnim - 5) / 15) * (0-(-85.10683)));
            yy = -3.78017 + (((tickAnim - 5) / 15) * (0-(-3.78017)));
            zz = 94.99688 + (((tickAnim - 5) / 15) * (0-(94.99688)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-1.62447-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-6.20329-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (15.22322-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -1.62447 + (((tickAnim - 3) / 2) * (9.89099-(-1.62447)));
            yy = -6.20329 + (((tickAnim - 3) / 2) * (-8.17368-(-6.20329)));
            zz = 15.22322 + (((tickAnim - 3) / 2) * (-85.09617-(15.22322)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 9.89099 + (((tickAnim - 5) / 15) * (0-(9.89099)));
            yy = -8.17368 + (((tickAnim - 5) / 15) * (0-(-8.17368)));
            zz = -85.09617 + (((tickAnim - 5) / 15) * (0-(-85.09617)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg32, leftLeg32.rotateAngleX + (float) Math.toRadians(xx), leftLeg32.rotateAngleY + (float) Math.toRadians(yy), leftLeg32.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (-25-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -25 + (((tickAnim - 8) / 9) * (0-(-25)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftAntennae, leftAntennae.rotateAngleX + (float) Math.toRadians(xx), leftAntennae.rotateAngleY + (float) Math.toRadians(yy), leftAntennae.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-84.84878-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-3.53661-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-153.2704-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -84.84878 + (((tickAnim - 3) / 1) * (-98.77929-(-84.84878)));
            yy = -3.53661 + (((tickAnim - 3) / 1) * (41.31011-(-3.53661)));
            zz = -153.2704 + (((tickAnim - 3) / 1) * (-118.08793-(-153.2704)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -98.77929 + (((tickAnim - 4) / 1) * (-95.70215-(-98.77929)));
            yy = 41.31011 + (((tickAnim - 4) / 1) * (-27.38601-(41.31011)));
            zz = -118.08793 + (((tickAnim - 4) / 1) * (-58.65378-(-118.08793)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -95.70215 + (((tickAnim - 5) / 1) * (-90.37853-(-95.70215)));
            yy = -27.38601 + (((tickAnim - 5) / 1) * (-45.46086-(-27.38601)));
            zz = -58.65378 + (((tickAnim - 5) / 1) * (-105.76572-(-58.65378)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -90.37853 + (((tickAnim - 6) / 1) * (-84.84878-(-90.37853)));
            yy = -45.46086 + (((tickAnim - 6) / 1) * (-3.53661-(-45.46086)));
            zz = -105.76572 + (((tickAnim - 6) / 1) * (-153.2704-(-105.76572)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -84.84878 + (((tickAnim - 7) / 1) * (-98.77929-(-84.84878)));
            yy = -3.53661 + (((tickAnim - 7) / 1) * (41.31011-(-3.53661)));
            zz = -153.2704 + (((tickAnim - 7) / 1) * (-118.08793-(-153.2704)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -98.77929 + (((tickAnim - 8) / 0) * (-95.70215-(-98.77929)));
            yy = 41.31011 + (((tickAnim - 8) / 0) * (-27.38601-(41.31011)));
            zz = -118.08793 + (((tickAnim - 8) / 0) * (-58.65378-(-118.08793)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -95.70215 + (((tickAnim - 8) / 1) * (-90.37853-(-95.70215)));
            yy = -27.38601 + (((tickAnim - 8) / 1) * (-45.46086-(-27.38601)));
            zz = -58.65378 + (((tickAnim - 8) / 1) * (-105.76572-(-58.65378)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -90.37853 + (((tickAnim - 9) / 1) * (-84.84878-(-90.37853)));
            yy = -45.46086 + (((tickAnim - 9) / 1) * (-3.53661-(-45.46086)));
            zz = -105.76572 + (((tickAnim - 9) / 1) * (-153.2704-(-105.76572)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -84.84878 + (((tickAnim - 10) / 1) * (-98.77929-(-84.84878)));
            yy = -3.53661 + (((tickAnim - 10) / 1) * (41.31011-(-3.53661)));
            zz = -153.2704 + (((tickAnim - 10) / 1) * (-118.08793-(-153.2704)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -98.77929 + (((tickAnim - 11) / 1) * (-95.70215-(-98.77929)));
            yy = 41.31011 + (((tickAnim - 11) / 1) * (-27.38601-(41.31011)));
            zz = -118.08793 + (((tickAnim - 11) / 1) * (-58.65378-(-118.08793)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -95.70215 + (((tickAnim - 12) / 1) * (-90.37853-(-95.70215)));
            yy = -27.38601 + (((tickAnim - 12) / 1) * (-45.46086-(-27.38601)));
            zz = -58.65378 + (((tickAnim - 12) / 1) * (-105.76572-(-58.65378)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -90.37853 + (((tickAnim - 13) / 0) * (-84.84878-(-90.37853)));
            yy = -45.46086 + (((tickAnim - 13) / 0) * (-3.53661-(-45.46086)));
            zz = -105.76572 + (((tickAnim - 13) / 0) * (-153.2704-(-105.76572)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -84.84878 + (((tickAnim - 13) / 1) * (-98.77929-(-84.84878)));
            yy = -3.53661 + (((tickAnim - 13) / 1) * (41.31011-(-3.53661)));
            zz = -153.2704 + (((tickAnim - 13) / 1) * (-118.08793-(-153.2704)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -98.77929 + (((tickAnim - 14) / 1) * (-95.70215-(-98.77929)));
            yy = 41.31011 + (((tickAnim - 14) / 1) * (-27.38601-(41.31011)));
            zz = -118.08793 + (((tickAnim - 14) / 1) * (-58.65378-(-118.08793)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -95.70215 + (((tickAnim - 15) / 1) * (-90.37853-(-95.70215)));
            yy = -27.38601 + (((tickAnim - 15) / 1) * (-45.46086-(-27.38601)));
            zz = -58.65378 + (((tickAnim - 15) / 1) * (-105.76572-(-58.65378)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -90.37853 + (((tickAnim - 16) / 1) * (-84.84878-(-90.37853)));
            yy = -45.46086 + (((tickAnim - 16) / 1) * (-3.53661-(-45.46086)));
            zz = -105.76572 + (((tickAnim - 16) / 1) * (-153.2704-(-105.76572)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -84.84878 + (((tickAnim - 17) / 1) * (-98.77929-(-84.84878)));
            yy = -3.53661 + (((tickAnim - 17) / 1) * (41.31011-(-3.53661)));
            zz = -153.2704 + (((tickAnim - 17) / 1) * (-118.08793-(-153.2704)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -98.77929 + (((tickAnim - 18) / 0) * (-95.70215-(-98.77929)));
            yy = 41.31011 + (((tickAnim - 18) / 0) * (-27.38601-(41.31011)));
            zz = -118.08793 + (((tickAnim - 18) / 0) * (-58.65378-(-118.08793)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -95.70215 + (((tickAnim - 18) / 1) * (-2.80285-(-95.70215)));
            yy = -27.38601 + (((tickAnim - 18) / 1) * (8.78031-(-27.38601)));
            zz = -58.65378 + (((tickAnim - 18) / 1) * (-30.4305-(-58.65378)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -2.80285 + (((tickAnim - 19) / 1) * (0-(-2.80285)));
            yy = 8.78031 + (((tickAnim - 19) / 1) * (0-(8.78031)));
            zz = -30.4305 + (((tickAnim - 19) / 1) * (0-(-30.4305)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(xx), leftForewing.rotateAngleY + (float) Math.toRadians(yy), leftForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (45-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 1) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 17) * (0-(0)));
            zz = 45 + (((tickAnim - 1) / 17) * (45-(45)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 45 + (((tickAnim - 18) / 2) * (0-(45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewingFoldable, leftForewingFoldable.rotateAngleX + (float) Math.toRadians(xx), leftForewingFoldable.rotateAngleY + (float) Math.toRadians(yy), leftForewingFoldable.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-66.05078-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.33513-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-143.01157-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -66.05078 + (((tickAnim - 3) / 1) * (-63.53545-(-66.05078)));
            yy = -1.33513 + (((tickAnim - 3) / 1) * (45.55383-(-1.33513)));
            zz = -143.01157 + (((tickAnim - 3) / 1) * (-73.4964-(-143.01157)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -63.53545 + (((tickAnim - 4) / 1) * (-76.57802-(-63.53545)));
            yy = 45.55383 + (((tickAnim - 4) / 1) * (-24.83367-(45.55383)));
            zz = -73.4964 + (((tickAnim - 4) / 1) * (-51.86719-(-73.4964)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -76.57802 + (((tickAnim - 5) / 1) * (-69.79983-(-76.57802)));
            yy = -24.83367 + (((tickAnim - 5) / 1) * (-40.67924-(-24.83367)));
            zz = -51.86719 + (((tickAnim - 5) / 1) * (-102.37294-(-51.86719)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -69.79983 + (((tickAnim - 6) / 1) * (-66.05078-(-69.79983)));
            yy = -40.67924 + (((tickAnim - 6) / 1) * (-1.33513-(-40.67924)));
            zz = -102.37294 + (((tickAnim - 6) / 1) * (-143.01157-(-102.37294)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -66.05078 + (((tickAnim - 7) / 1) * (-63.53545-(-66.05078)));
            yy = -1.33513 + (((tickAnim - 7) / 1) * (45.55383-(-1.33513)));
            zz = -143.01157 + (((tickAnim - 7) / 1) * (-73.4964-(-143.01157)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -63.53545 + (((tickAnim - 8) / 0) * (-76.57802-(-63.53545)));
            yy = 45.55383 + (((tickAnim - 8) / 0) * (-24.83367-(45.55383)));
            zz = -73.4964 + (((tickAnim - 8) / 0) * (-51.86719-(-73.4964)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -76.57802 + (((tickAnim - 8) / 1) * (-69.79983-(-76.57802)));
            yy = -24.83367 + (((tickAnim - 8) / 1) * (-40.67924-(-24.83367)));
            zz = -51.86719 + (((tickAnim - 8) / 1) * (-102.37294-(-51.86719)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -69.79983 + (((tickAnim - 9) / 1) * (-66.05078-(-69.79983)));
            yy = -40.67924 + (((tickAnim - 9) / 1) * (-1.33513-(-40.67924)));
            zz = -102.37294 + (((tickAnim - 9) / 1) * (-143.01157-(-102.37294)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -66.05078 + (((tickAnim - 10) / 1) * (-63.53545-(-66.05078)));
            yy = -1.33513 + (((tickAnim - 10) / 1) * (45.55383-(-1.33513)));
            zz = -143.01157 + (((tickAnim - 10) / 1) * (-73.4964-(-143.01157)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -63.53545 + (((tickAnim - 11) / 1) * (-76.57802-(-63.53545)));
            yy = 45.55383 + (((tickAnim - 11) / 1) * (-24.83367-(45.55383)));
            zz = -73.4964 + (((tickAnim - 11) / 1) * (-51.86719-(-73.4964)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -76.57802 + (((tickAnim - 12) / 1) * (-69.79983-(-76.57802)));
            yy = -24.83367 + (((tickAnim - 12) / 1) * (-40.67924-(-24.83367)));
            zz = -51.86719 + (((tickAnim - 12) / 1) * (-102.37294-(-51.86719)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -69.79983 + (((tickAnim - 13) / 0) * (-66.05078-(-69.79983)));
            yy = -40.67924 + (((tickAnim - 13) / 0) * (-1.33513-(-40.67924)));
            zz = -102.37294 + (((tickAnim - 13) / 0) * (-143.01157-(-102.37294)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -66.05078 + (((tickAnim - 13) / 1) * (-63.53545-(-66.05078)));
            yy = -1.33513 + (((tickAnim - 13) / 1) * (45.55383-(-1.33513)));
            zz = -143.01157 + (((tickAnim - 13) / 1) * (-73.4964-(-143.01157)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -63.53545 + (((tickAnim - 14) / 1) * (-76.57802-(-63.53545)));
            yy = 45.55383 + (((tickAnim - 14) / 1) * (-24.83367-(45.55383)));
            zz = -73.4964 + (((tickAnim - 14) / 1) * (-51.86719-(-73.4964)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -76.57802 + (((tickAnim - 15) / 1) * (-69.79983-(-76.57802)));
            yy = -24.83367 + (((tickAnim - 15) / 1) * (-40.67924-(-24.83367)));
            zz = -51.86719 + (((tickAnim - 15) / 1) * (-102.37294-(-51.86719)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -69.79983 + (((tickAnim - 16) / 1) * (-66.05078-(-69.79983)));
            yy = -40.67924 + (((tickAnim - 16) / 1) * (-1.33513-(-40.67924)));
            zz = -102.37294 + (((tickAnim - 16) / 1) * (-143.01157-(-102.37294)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -66.05078 + (((tickAnim - 17) / 1) * (-63.53545-(-66.05078)));
            yy = -1.33513 + (((tickAnim - 17) / 1) * (45.55383-(-1.33513)));
            zz = -143.01157 + (((tickAnim - 17) / 1) * (-73.4964-(-143.01157)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -63.53545 + (((tickAnim - 18) / 0) * (-76.57802-(-63.53545)));
            yy = 45.55383 + (((tickAnim - 18) / 0) * (-24.83367-(45.55383)));
            zz = -73.4964 + (((tickAnim - 18) / 0) * (-51.86719-(-73.4964)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -76.57802 + (((tickAnim - 18) / 1) * (-4.93535-(-76.57802)));
            yy = -24.83367 + (((tickAnim - 18) / 1) * (5.43324-(-24.83367)));
            zz = -51.86719 + (((tickAnim - 18) / 1) * (-39.71343-(-51.86719)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -4.93535 + (((tickAnim - 19) / 1) * (0-(-4.93535)));
            yy = 5.43324 + (((tickAnim - 19) / 1) * (0-(5.43324)));
            zz = -39.71343 + (((tickAnim - 19) / 1) * (0-(-39.71343)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(xx), leftHindwing.rotateAngleY + (float) Math.toRadians(yy), leftHindwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-0.26618-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.19949-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -0.26618 + (((tickAnim - 5) / 1) * (-0.04875-(-0.26618)));
            yy = -0.33908 + (((tickAnim - 5) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 5) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -0.04875 + (((tickAnim - 6) / 1) * (0-(-0.04875)));
            yy = -0.54038 + (((tickAnim - 6) / 1) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 6) / 1) * (0-(-0.42591)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (-0.26618-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.19949-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -0.26618 + (((tickAnim - 8) / 1) * (-0.04875-(-0.26618)));
            yy = -0.33908 + (((tickAnim - 8) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 8) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -0.04875 + (((tickAnim - 9) / 1) * (0-(-0.04875)));
            yy = -0.54038 + (((tickAnim - 9) / 1) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 9) / 1) * (0-(-0.42591)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (-0.26618-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (-0.19949-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -0.26618 + (((tickAnim - 12) / 1) * (-0.04875-(-0.26618)));
            yy = -0.33908 + (((tickAnim - 12) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 12) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -0.04875 + (((tickAnim - 13) / 0) * (0-(-0.04875)));
            yy = -0.54038 + (((tickAnim - 13) / 0) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 13) / 0) * (0-(-0.42591)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (-0.26618-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-0.19949-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -0.26618 + (((tickAnim - 15) / 1) * (-0.04875-(-0.26618)));
            yy = -0.33908 + (((tickAnim - 15) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 15) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -0.04875 + (((tickAnim - 16) / 1) * (0-(-0.04875)));
            yy = -0.54038 + (((tickAnim - 16) / 1) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 16) / 1) * (0-(-0.42591)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (-0.26618-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (-0.19949-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.26618 + (((tickAnim - 18) / 2) * (0-(-0.26618)));
            yy = -0.33908 + (((tickAnim - 18) / 2) * (0-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 18) / 2) * (0-(-0.19949)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHindwing.rotationPointX = this.leftHindwing.rotationPointX + (float)(xx);
        this.leftHindwing.rotationPointY = this.leftHindwing.rotationPointY - (float)(yy);
        this.leftHindwing.rotationPointZ = this.leftHindwing.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (177.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 3) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 15) * (0-(0)));
            zz = 177.5 + (((tickAnim - 3) / 15) * (177.5-(177.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 177.5 + (((tickAnim - 18) / 2) * (0-(177.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwingFoldable, leftHindwingFoldable.rotateAngleX + (float) Math.toRadians(xx), leftHindwingFoldable.rotateAngleY + (float) Math.toRadians(yy), leftHindwingFoldable.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (67.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 67.5 + (((tickAnim - 5) / 15) * (0-(67.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-22.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (22.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = -22.5 + (((tickAnim - 5) / 15) * (0-(-22.5)));
            zz = 22.5 + (((tickAnim - 5) / 15) * (0-(22.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.04943-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-85.10683-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (3.78017-(0)));
            zz = -1.04943 + (((tickAnim - 3) / 2) * (-94.99688-(-1.04943)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -85.10683 + (((tickAnim - 5) / 15) * (0-(-85.10683)));
            yy = 3.78017 + (((tickAnim - 5) / 15) * (0-(3.78017)));
            zz = -94.99688 + (((tickAnim - 5) / 15) * (0-(-94.99688)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-1.62447-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (6.20329-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-15.22322-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -1.62447 + (((tickAnim - 3) / 2) * (9.89099-(-1.62447)));
            yy = 6.20329 + (((tickAnim - 3) / 2) * (8.17368-(6.20329)));
            zz = -15.22322 + (((tickAnim - 3) / 2) * (85.09617-(-15.22322)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 9.89099 + (((tickAnim - 5) / 15) * (0-(9.89099)));
            yy = 8.17368 + (((tickAnim - 5) / 15) * (0-(8.17368)));
            zz = 85.09617 + (((tickAnim - 5) / 15) * (0-(85.09617)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg32, rightLeg32.rotateAngleX + (float) Math.toRadians(xx), rightLeg32.rotateAngleY + (float) Math.toRadians(yy), rightLeg32.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (-25-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -25 + (((tickAnim - 9) / 7) * (0-(-25)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightAntennae, rightAntennae.rotateAngleX + (float) Math.toRadians(xx), rightAntennae.rotateAngleY + (float) Math.toRadians(yy), rightAntennae.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-66.05078-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.33513-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (143.01157-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -66.05078 + (((tickAnim - 3) / 1) * (-63.53545-(-66.05078)));
            yy = 1.33513 + (((tickAnim - 3) / 1) * (-45.55383-(1.33513)));
            zz = 143.01157 + (((tickAnim - 3) / 1) * (73.4964-(143.01157)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -63.53545 + (((tickAnim - 4) / 1) * (-76.57802-(-63.53545)));
            yy = -45.55383 + (((tickAnim - 4) / 1) * (24.83367-(-45.55383)));
            zz = 73.4964 + (((tickAnim - 4) / 1) * (51.86719-(73.4964)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -76.57802 + (((tickAnim - 5) / 1) * (-69.79983-(-76.57802)));
            yy = 24.83367 + (((tickAnim - 5) / 1) * (40.67924-(24.83367)));
            zz = 51.86719 + (((tickAnim - 5) / 1) * (102.37294-(51.86719)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -69.79983 + (((tickAnim - 6) / 1) * (-66.05078-(-69.79983)));
            yy = 40.67924 + (((tickAnim - 6) / 1) * (1.33513-(40.67924)));
            zz = 102.37294 + (((tickAnim - 6) / 1) * (143.01157-(102.37294)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -66.05078 + (((tickAnim - 7) / 1) * (-63.53545-(-66.05078)));
            yy = 1.33513 + (((tickAnim - 7) / 1) * (-45.55383-(1.33513)));
            zz = 143.01157 + (((tickAnim - 7) / 1) * (73.4964-(143.01157)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -63.53545 + (((tickAnim - 8) / 0) * (-76.57802-(-63.53545)));
            yy = -45.55383 + (((tickAnim - 8) / 0) * (24.83367-(-45.55383)));
            zz = 73.4964 + (((tickAnim - 8) / 0) * (51.86719-(73.4964)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -76.57802 + (((tickAnim - 8) / 1) * (-69.79983-(-76.57802)));
            yy = 24.83367 + (((tickAnim - 8) / 1) * (40.67924-(24.83367)));
            zz = 51.86719 + (((tickAnim - 8) / 1) * (102.37294-(51.86719)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -69.79983 + (((tickAnim - 9) / 1) * (-66.05078-(-69.79983)));
            yy = 40.67924 + (((tickAnim - 9) / 1) * (1.33513-(40.67924)));
            zz = 102.37294 + (((tickAnim - 9) / 1) * (143.01157-(102.37294)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -66.05078 + (((tickAnim - 10) / 1) * (-63.53545-(-66.05078)));
            yy = 1.33513 + (((tickAnim - 10) / 1) * (-45.55383-(1.33513)));
            zz = 143.01157 + (((tickAnim - 10) / 1) * (73.4964-(143.01157)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -63.53545 + (((tickAnim - 11) / 1) * (-76.57802-(-63.53545)));
            yy = -45.55383 + (((tickAnim - 11) / 1) * (24.83367-(-45.55383)));
            zz = 73.4964 + (((tickAnim - 11) / 1) * (51.86719-(73.4964)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -76.57802 + (((tickAnim - 12) / 1) * (-69.79983-(-76.57802)));
            yy = 24.83367 + (((tickAnim - 12) / 1) * (40.67924-(24.83367)));
            zz = 51.86719 + (((tickAnim - 12) / 1) * (102.37294-(51.86719)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -69.79983 + (((tickAnim - 13) / 0) * (-66.05078-(-69.79983)));
            yy = 40.67924 + (((tickAnim - 13) / 0) * (1.33513-(40.67924)));
            zz = 102.37294 + (((tickAnim - 13) / 0) * (143.01157-(102.37294)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -66.05078 + (((tickAnim - 13) / 1) * (-63.53545-(-66.05078)));
            yy = 1.33513 + (((tickAnim - 13) / 1) * (-45.55383-(1.33513)));
            zz = 143.01157 + (((tickAnim - 13) / 1) * (73.4964-(143.01157)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -63.53545 + (((tickAnim - 14) / 1) * (-76.57802-(-63.53545)));
            yy = -45.55383 + (((tickAnim - 14) / 1) * (24.83367-(-45.55383)));
            zz = 73.4964 + (((tickAnim - 14) / 1) * (51.86719-(73.4964)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -76.57802 + (((tickAnim - 15) / 1) * (-69.79983-(-76.57802)));
            yy = 24.83367 + (((tickAnim - 15) / 1) * (40.67924-(24.83367)));
            zz = 51.86719 + (((tickAnim - 15) / 1) * (102.37294-(51.86719)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -69.79983 + (((tickAnim - 16) / 1) * (-66.05078-(-69.79983)));
            yy = 40.67924 + (((tickAnim - 16) / 1) * (1.33513-(40.67924)));
            zz = 102.37294 + (((tickAnim - 16) / 1) * (143.01157-(102.37294)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -66.05078 + (((tickAnim - 17) / 1) * (-63.53545-(-66.05078)));
            yy = 1.33513 + (((tickAnim - 17) / 1) * (-45.55383-(1.33513)));
            zz = 143.01157 + (((tickAnim - 17) / 1) * (73.4964-(143.01157)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -63.53545 + (((tickAnim - 18) / 0) * (-76.57802-(-63.53545)));
            yy = -45.55383 + (((tickAnim - 18) / 0) * (24.83367-(-45.55383)));
            zz = 73.4964 + (((tickAnim - 18) / 0) * (51.86719-(73.4964)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -76.57802 + (((tickAnim - 18) / 1) * (-4.93535-(-76.57802)));
            yy = 24.83367 + (((tickAnim - 18) / 1) * (-5.43324-(24.83367)));
            zz = 51.86719 + (((tickAnim - 18) / 1) * (39.71343-(51.86719)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -4.93535 + (((tickAnim - 19) / 1) * (0-(-4.93535)));
            yy = -5.43324 + (((tickAnim - 19) / 1) * (0-(-5.43324)));
            zz = 39.71343 + (((tickAnim - 19) / 1) * (0-(39.71343)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(xx), rightHindwing.rotateAngleY + (float) Math.toRadians(yy), rightHindwing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0.26618-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.19949-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0.26618 + (((tickAnim - 5) / 1) * (0.04875-(0.26618)));
            yy = -0.33908 + (((tickAnim - 5) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 5) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0.04875 + (((tickAnim - 6) / 1) * (0-(0.04875)));
            yy = -0.54038 + (((tickAnim - 6) / 1) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 6) / 1) * (0-(-0.42591)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0.26618-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.19949-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0.26618 + (((tickAnim - 8) / 1) * (0.04875-(0.26618)));
            yy = -0.33908 + (((tickAnim - 8) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 8) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0.04875 + (((tickAnim - 9) / 1) * (0-(0.04875)));
            yy = -0.54038 + (((tickAnim - 9) / 1) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 9) / 1) * (0-(-0.42591)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0.26618-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (-0.19949-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0.26618 + (((tickAnim - 12) / 1) * (0.04875-(0.26618)));
            yy = -0.33908 + (((tickAnim - 12) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 12) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0.04875 + (((tickAnim - 13) / 0) * (0-(0.04875)));
            yy = -0.54038 + (((tickAnim - 13) / 0) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 13) / 0) * (0-(-0.42591)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0.26618-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-0.19949-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0.26618 + (((tickAnim - 15) / 1) * (0.04875-(0.26618)));
            yy = -0.33908 + (((tickAnim - 15) / 1) * (-0.54038-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 15) / 1) * (-0.42591-(-0.19949)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0.04875 + (((tickAnim - 16) / 1) * (0-(0.04875)));
            yy = -0.54038 + (((tickAnim - 16) / 1) * (0-(-0.54038)));
            zz = -0.42591 + (((tickAnim - 16) / 1) * (0-(-0.42591)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0.26618-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (-0.33908-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (-0.19949-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0.26618 + (((tickAnim - 18) / 2) * (0-(0.26618)));
            yy = -0.33908 + (((tickAnim - 18) / 2) * (0-(-0.33908)));
            zz = -0.19949 + (((tickAnim - 18) / 2) * (0-(-0.19949)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHindwing.rotationPointX = this.rightHindwing.rotationPointX + (float)(xx);
        this.rightHindwing.rotationPointY = this.rightHindwing.rotationPointY - (float)(yy);
        this.rightHindwing.rotationPointZ = this.rightHindwing.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-177.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 3) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 15) * (0-(0)));
            zz = -177.5 + (((tickAnim - 3) / 15) * (-177.5-(-177.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = -177.5 + (((tickAnim - 18) / 2) * (0-(-177.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindwingFoldable, rightHindwingFoldable.rotateAngleX + (float) Math.toRadians(xx), rightHindwingFoldable.rotateAngleY + (float) Math.toRadians(yy), rightHindwingFoldable.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-84.84878-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (3.53661-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (153.2704-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -84.84878 + (((tickAnim - 3) / 1) * (-98.77929-(-84.84878)));
            yy = 3.53661 + (((tickAnim - 3) / 1) * (-41.31011-(3.53661)));
            zz = 153.2704 + (((tickAnim - 3) / 1) * (118.08793-(153.2704)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -98.77929 + (((tickAnim - 4) / 1) * (-95.70215-(-98.77929)));
            yy = -41.31011 + (((tickAnim - 4) / 1) * (27.38601-(-41.31011)));
            zz = 118.08793 + (((tickAnim - 4) / 1) * (58.65378-(118.08793)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -95.70215 + (((tickAnim - 5) / 1) * (-90.37853-(-95.70215)));
            yy = 27.38601 + (((tickAnim - 5) / 1) * (45.46086-(27.38601)));
            zz = 58.65378 + (((tickAnim - 5) / 1) * (105.76572-(58.65378)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -90.37853 + (((tickAnim - 6) / 1) * (-84.84878-(-90.37853)));
            yy = 45.46086 + (((tickAnim - 6) / 1) * (3.53661-(45.46086)));
            zz = 105.76572 + (((tickAnim - 6) / 1) * (153.2704-(105.76572)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -84.84878 + (((tickAnim - 7) / 1) * (-98.77929-(-84.84878)));
            yy = 3.53661 + (((tickAnim - 7) / 1) * (-41.31011-(3.53661)));
            zz = 153.2704 + (((tickAnim - 7) / 1) * (118.08793-(153.2704)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -98.77929 + (((tickAnim - 8) / 0) * (-95.70215-(-98.77929)));
            yy = -41.31011 + (((tickAnim - 8) / 0) * (27.38601-(-41.31011)));
            zz = 118.08793 + (((tickAnim - 8) / 0) * (58.65378-(118.08793)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -95.70215 + (((tickAnim - 8) / 1) * (-90.37853-(-95.70215)));
            yy = 27.38601 + (((tickAnim - 8) / 1) * (45.46086-(27.38601)));
            zz = 58.65378 + (((tickAnim - 8) / 1) * (105.76572-(58.65378)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -90.37853 + (((tickAnim - 9) / 1) * (-84.84878-(-90.37853)));
            yy = 45.46086 + (((tickAnim - 9) / 1) * (3.53661-(45.46086)));
            zz = 105.76572 + (((tickAnim - 9) / 1) * (153.2704-(105.76572)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -84.84878 + (((tickAnim - 10) / 1) * (-98.77929-(-84.84878)));
            yy = 3.53661 + (((tickAnim - 10) / 1) * (-41.31011-(3.53661)));
            zz = 153.2704 + (((tickAnim - 10) / 1) * (118.08793-(153.2704)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -98.77929 + (((tickAnim - 11) / 1) * (-95.70215-(-98.77929)));
            yy = -41.31011 + (((tickAnim - 11) / 1) * (27.38601-(-41.31011)));
            zz = 118.08793 + (((tickAnim - 11) / 1) * (58.65378-(118.08793)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -95.70215 + (((tickAnim - 12) / 1) * (-90.37853-(-95.70215)));
            yy = 27.38601 + (((tickAnim - 12) / 1) * (45.46086-(27.38601)));
            zz = 58.65378 + (((tickAnim - 12) / 1) * (105.76572-(58.65378)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -90.37853 + (((tickAnim - 13) / 0) * (-84.84878-(-90.37853)));
            yy = 45.46086 + (((tickAnim - 13) / 0) * (3.53661-(45.46086)));
            zz = 105.76572 + (((tickAnim - 13) / 0) * (153.2704-(105.76572)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -84.84878 + (((tickAnim - 13) / 1) * (-98.77929-(-84.84878)));
            yy = 3.53661 + (((tickAnim - 13) / 1) * (-41.31011-(3.53661)));
            zz = 153.2704 + (((tickAnim - 13) / 1) * (118.08793-(153.2704)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -98.77929 + (((tickAnim - 14) / 1) * (-95.70215-(-98.77929)));
            yy = -41.31011 + (((tickAnim - 14) / 1) * (27.38601-(-41.31011)));
            zz = 118.08793 + (((tickAnim - 14) / 1) * (58.65378-(118.08793)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -95.70215 + (((tickAnim - 15) / 1) * (-90.37853-(-95.70215)));
            yy = 27.38601 + (((tickAnim - 15) / 1) * (45.46086-(27.38601)));
            zz = 58.65378 + (((tickAnim - 15) / 1) * (105.76572-(58.65378)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -90.37853 + (((tickAnim - 16) / 1) * (-84.84878-(-90.37853)));
            yy = 45.46086 + (((tickAnim - 16) / 1) * (3.53661-(45.46086)));
            zz = 105.76572 + (((tickAnim - 16) / 1) * (153.2704-(105.76572)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -84.84878 + (((tickAnim - 17) / 1) * (-98.77929-(-84.84878)));
            yy = 3.53661 + (((tickAnim - 17) / 1) * (-41.31011-(3.53661)));
            zz = 153.2704 + (((tickAnim - 17) / 1) * (118.08793-(153.2704)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -98.77929 + (((tickAnim - 18) / 0) * (-95.70215-(-98.77929)));
            yy = -41.31011 + (((tickAnim - 18) / 0) * (27.38601-(-41.31011)));
            zz = 118.08793 + (((tickAnim - 18) / 0) * (58.65378-(118.08793)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -95.70215 + (((tickAnim - 18) / 1) * (-2.80285-(-95.70215)));
            yy = 27.38601 + (((tickAnim - 18) / 1) * (-8.78031-(27.38601)));
            zz = 58.65378 + (((tickAnim - 18) / 1) * (30.4305-(58.65378)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -2.80285 + (((tickAnim - 19) / 1) * (0-(-2.80285)));
            yy = -8.78031 + (((tickAnim - 19) / 1) * (0-(-8.78031)));
            zz = 30.4305 + (((tickAnim - 19) / 1) * (0-(30.4305)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForewing, rightForewing.rotateAngleX + (float) Math.toRadians(xx), rightForewing.rotateAngleY + (float) Math.toRadians(yy), rightForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-45-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 1) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 17) * (0-(0)));
            zz = -45 + (((tickAnim - 1) / 17) * (-45-(-45)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = -45 + (((tickAnim - 18) / 2) * (0-(-45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForewingFoldable, rightForewingFoldable.rotateAngleX + (float) Math.toRadians(xx), rightForewingFoldable.rotateAngleY + (float) Math.toRadians(yy), rightForewingFoldable.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
