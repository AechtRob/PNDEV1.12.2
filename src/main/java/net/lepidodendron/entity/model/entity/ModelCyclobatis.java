package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCyclobatis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCyclobatis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer middleFlap;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer leftSide;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftFlap;
    private final AdvancedModelRenderer leftFlap2;
    private final AdvancedModelRenderer leftFlap3;
    private final AdvancedModelRenderer leftFlap4;
    private final AdvancedModelRenderer leftFlap5;
    private final AdvancedModelRenderer leftFlap6;
    private final AdvancedModelRenderer leftFlap7;
    private final AdvancedModelRenderer leftFlap8;
    private final AdvancedModelRenderer rightSide;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightFlap;
    private final AdvancedModelRenderer rightFlap2;
    private final AdvancedModelRenderer rightFlap3;
    private final AdvancedModelRenderer rightFlap4;
    private final AdvancedModelRenderer rightFlap5;
    private final AdvancedModelRenderer rightFlap6;
    private final AdvancedModelRenderer rightFlap7;
    private final AdvancedModelRenderer rightFlap8;

    private ModelAnimator animator;

    public ModelCyclobatis() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.5F, -0.8F, -3.5F, 7, 1, 7, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 9, -3.5F, -1.2F, -3.5F, 7, 1, 7, -0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 33, 36, -0.5F, -1.0F, -6.0F, 1, 1, 3, -0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -0.825F, -2.8F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 31, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 31, 1.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.middleFlap = new AdvancedModelRenderer(this);
        this.middleFlap.setRotationPoint(0.0F, -0.475F, -5.5F);
        this.main.addChild(middleFlap);
        this.middleFlap.cubeList.add(new ModelBox(middleFlap, 0, 36, -1.0F, 0.025F, -3.0F, 2, 0, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 13, 33, -1.0F, -0.5F, 0.0F, 2, 1, 3, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0568F, 0.15F, 2.4567F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, 0.1745F, 0.0F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 39, 28, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0568F, 0.15F, 2.4567F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, -0.1745F, 0.0F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 39, 28, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 36, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.003F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 36, 16, -1.0F, 0.0F, 2.0F, 2, 0, 1, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 11, 38, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 29, 16, -1.0F, 0.0F, 1.0F, 2, 0, 1, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 39, 23, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.003F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 14, 29, -1.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));

        this.leftSide = new AdvancedModelRenderer(this);
        this.leftSide.setRotationPoint(-0.3184F, -0.475F, 0.4095F);
        this.main.addChild(leftSide);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.5F, 0.0F, -6.0F);
        this.leftSide.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -3.1416F, 0.1309F, 3.1416F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 27, 0.0F, -0.5F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(5.6213F, 0.0F, -3.8787F);
        this.leftSide.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -3.1416F, 0.7854F, 3.1416F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 23, 0.0F, -0.5F, -3.0F, 3, 1, 3, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(6.3978F, 0.0F, -0.9809F);
        this.leftSide.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -3.1416F, 1.309F, 3.1416F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 23, 0.0F, -0.5F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(6.0062F, 0.0F, 1.9934F);
        this.leftSide.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 1.4399F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 18, 0.0F, -0.5F, -3.0F, 3, 1, 3, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.9794F, 0.0F, 4.2053F);
        this.leftSide.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.829F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 22, 0.0F, -0.5F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.3184F, 0.0F, 5.5905F);
        this.leftSide.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.48F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 18, 0.0F, -0.5F, -3.0F, 3, 1, 3, 0.003F, false));

        this.leftFlap = new AdvancedModelRenderer(this);
        this.leftFlap.setRotationPoint(0.5F, 0.0F, -6.0F);
        this.leftSide.addChild(leftFlap);
        this.setRotateAngle(leftFlap, 0.0F, -0.1745F, 0.0F);
        this.leftFlap.cubeList.add(new ModelBox(leftFlap, 29, 4, 0.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, false));

        this.leftFlap2 = new AdvancedModelRenderer(this);
        this.leftFlap2.setRotationPoint(2.4696F, 0.025F, -5.6527F);
        this.leftSide.addChild(leftFlap2);
        this.setRotateAngle(leftFlap2, 0.0F, -0.48F, 0.0F);
        this.leftFlap2.cubeList.add(new ModelBox(leftFlap2, 29, 8, 0.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, false));

        this.leftFlap3 = new AdvancedModelRenderer(this);
        this.leftFlap3.setRotationPoint(4.1002F, 0.0F, -5.2392F);
        this.leftSide.addChild(leftFlap3);
        this.setRotateAngle(leftFlap3, 0.0F, -0.9599F, 0.0F);
        this.leftFlap3.cubeList.add(new ModelBox(leftFlap3, 29, 12, 0.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, false));

        this.leftFlap4 = new AdvancedModelRenderer(this);
        this.leftFlap4.setRotationPoint(5.3246F, 0.025F, -3.8201F);
        this.leftSide.addChild(leftFlap4);
        this.setRotateAngle(leftFlap4, 0.0F, -1.3483F, 0.0F);
        this.leftFlap4.cubeList.add(new ModelBox(leftFlap4, 0, 32, 0.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, false));

        this.leftFlap5 = new AdvancedModelRenderer(this);
        this.leftFlap5.setRotationPoint(5.8962F, 0.0F, -1.6259F);
        this.leftSide.addChild(leftFlap5);
        this.setRotateAngle(leftFlap5, 0.0F, -1.5664F, 0.0F);
        this.leftFlap5.cubeList.add(new ModelBox(leftFlap5, 26, 32, 0.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, false));

        this.leftFlap6 = new AdvancedModelRenderer(this);
        this.leftFlap6.setRotationPoint(6.1211F, 0.025F, 0.188F);
        this.leftSide.addChild(leftFlap6);
        this.setRotateAngle(leftFlap6, 0.0F, -1.9679F, 0.0F);
        this.leftFlap6.cubeList.add(new ModelBox(leftFlap6, 26, 28, 0.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, false));

        this.leftFlap7 = new AdvancedModelRenderer(this);
        this.leftFlap7.setRotationPoint(5.5205F, 0.0F, 2.0535F);
        this.leftSide.addChild(leftFlap7);
        this.setRotateAngle(leftFlap7, 0.0F, -2.3082F, 0.0F);
        this.leftFlap7.cubeList.add(new ModelBox(leftFlap7, 29, 0, 0.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, false));

        this.leftFlap8 = new AdvancedModelRenderer(this);
        this.leftFlap8.setRotationPoint(4.8167F, 0.025F, 3.4338F);
        this.leftSide.addChild(leftFlap8);
        this.setRotateAngle(leftFlap8, 0.0F, -2.8318F, 0.0F);
        this.leftFlap8.cubeList.add(new ModelBox(leftFlap8, 0, 18, 0.0F, 0.0F, -3.0F, 4, 0, 3, 0.0F, false));

        this.rightSide = new AdvancedModelRenderer(this);
        this.rightSide.setRotationPoint(0.3184F, -0.475F, 0.4095F);
        this.main.addChild(rightSide);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.5F, 0.0F, -6.0F);
        this.rightSide.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -3.1416F, -0.1309F, -3.1416F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 27, -3.0F, -0.5F, -3.0F, 3, 1, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-5.6213F, 0.0F, -3.8787F);
        this.rightSide.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -3.1416F, -0.7854F, -3.1416F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 23, -3.0F, -0.5F, -3.0F, 3, 1, 3, 0.003F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-6.3978F, 0.0F, -0.9809F);
        this.rightSide.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -3.1416F, -1.309F, -3.1416F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 23, -3.0F, -0.5F, -3.0F, 3, 1, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-6.0062F, 0.0F, 1.9934F);
        this.rightSide.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -1.4399F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 18, -3.0F, -0.5F, -3.0F, 3, 1, 3, 0.003F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.9794F, 0.0F, 4.2053F);
        this.rightSide.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.829F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 22, -3.0F, -0.5F, -3.0F, 3, 1, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.3184F, 0.0F, 5.5905F);
        this.rightSide.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.48F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 15, 18, -3.0F, -0.5F, -3.0F, 3, 1, 3, 0.003F, true));

        this.rightFlap = new AdvancedModelRenderer(this);
        this.rightFlap.setRotationPoint(-0.5F, 0.0F, -6.0F);
        this.rightSide.addChild(rightFlap);
        this.setRotateAngle(rightFlap, 0.0F, 0.1745F, 0.0F);
        this.rightFlap.cubeList.add(new ModelBox(rightFlap, 29, 4, -3.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, true));

        this.rightFlap2 = new AdvancedModelRenderer(this);
        this.rightFlap2.setRotationPoint(-2.4696F, 0.025F, -5.6527F);
        this.rightSide.addChild(rightFlap2);
        this.setRotateAngle(rightFlap2, 0.0F, 0.48F, 0.0F);
        this.rightFlap2.cubeList.add(new ModelBox(rightFlap2, 29, 8, -3.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, true));

        this.rightFlap3 = new AdvancedModelRenderer(this);
        this.rightFlap3.setRotationPoint(-4.1002F, 0.0F, -5.2392F);
        this.rightSide.addChild(rightFlap3);
        this.setRotateAngle(rightFlap3, 0.0F, 0.9599F, 0.0F);
        this.rightFlap3.cubeList.add(new ModelBox(rightFlap3, 29, 12, -3.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, true));

        this.rightFlap4 = new AdvancedModelRenderer(this);
        this.rightFlap4.setRotationPoint(-5.3246F, 0.025F, -3.8201F);
        this.rightSide.addChild(rightFlap4);
        this.setRotateAngle(rightFlap4, 0.0F, 1.3483F, 0.0F);
        this.rightFlap4.cubeList.add(new ModelBox(rightFlap4, 0, 32, -3.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, true));

        this.rightFlap5 = new AdvancedModelRenderer(this);
        this.rightFlap5.setRotationPoint(-5.8962F, 0.0F, -1.6259F);
        this.rightSide.addChild(rightFlap5);
        this.setRotateAngle(rightFlap5, 0.0F, 1.5664F, 0.0F);
        this.rightFlap5.cubeList.add(new ModelBox(rightFlap5, 26, 32, -3.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, true));

        this.rightFlap6 = new AdvancedModelRenderer(this);
        this.rightFlap6.setRotationPoint(-6.1211F, 0.025F, 0.188F);
        this.rightSide.addChild(rightFlap6);
        this.setRotateAngle(rightFlap6, 0.0F, 1.9679F, 0.0F);
        this.rightFlap6.cubeList.add(new ModelBox(rightFlap6, 26, 28, -3.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, true));

        this.rightFlap7 = new AdvancedModelRenderer(this);
        this.rightFlap7.setRotationPoint(-5.5205F, 0.0F, 2.0535F);
        this.rightSide.addChild(rightFlap7);
        this.setRotateAngle(rightFlap7, 0.0F, 2.3082F, 0.0F);
        this.rightFlap7.cubeList.add(new ModelBox(rightFlap7, 29, 0, -3.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, true));

        this.rightFlap8 = new AdvancedModelRenderer(this);
        this.rightFlap8.setRotationPoint(-4.8167F, 0.025F, 3.4338F);
        this.rightSide.addChild(rightFlap8);
        this.setRotateAngle(rightFlap8, 0.0F, 2.8318F, 0.0F);
        this.rightFlap8.cubeList.add(new ModelBox(rightFlap8, 0, 18, -4.0F, 0.0F, -3.0F, 4, 0, 3, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.2F;
        this.main.offsetX = -0.15F;
        this.main.offsetZ = -0.4F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.main.offsetZ = -0.1F;
        this.main.offsetY = -0.03F;
        this.main.offsetX = -0.02F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.0F;
        this.main.offsetX = -0.0F;
        this.main.rotateAngleY = (float)Math.toRadians(210);
        this.main.rotateAngleX = (float)Math.toRadians(20);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.8F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraCyclobatis ee = (EntityPrehistoricFloraCyclobatis) entitylivingbaseIn;

        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCyclobatis entity = (EntityPrehistoricFloraCyclobatis) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(middleFlap, middleFlap.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-7), middleFlap.rotateAngleY + (float) Math.toRadians(0), middleFlap.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+20))*5));
        this.setRotateAngle(leftSide, leftSide.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-50))*-2), leftSide.rotateAngleY + (float) Math.toRadians(0), leftSide.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200))*1));
        this.setRotateAngle(leftFlap, leftFlap.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-7), leftFlap.rotateAngleY + (float) Math.toRadians(0), leftFlap.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+40))*5));
        this.setRotateAngle(leftFlap2, leftFlap2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-7), leftFlap2.rotateAngleY + (float) Math.toRadians(0), leftFlap2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+60))*5));
        this.setRotateAngle(leftFlap3, leftFlap3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-7), leftFlap3.rotateAngleY + (float) Math.toRadians(0), leftFlap3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+80))*5));
        this.setRotateAngle(leftFlap4, leftFlap4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-7), leftFlap4.rotateAngleY + (float) Math.toRadians(0), leftFlap4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+100))*5));
        this.setRotateAngle(leftFlap5, leftFlap5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-7), leftFlap5.rotateAngleY + (float) Math.toRadians(0), leftFlap5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+120))*5));
        this.setRotateAngle(leftFlap6, leftFlap6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-7), leftFlap6.rotateAngleY + (float) Math.toRadians(0), leftFlap6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+140))*5));
        this.setRotateAngle(leftFlap7, leftFlap7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-7), leftFlap7.rotateAngleY + (float) Math.toRadians(0), leftFlap7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+160))*5));
        this.setRotateAngle(leftFlap8, leftFlap8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-7), leftFlap8.rotateAngleY + (float) Math.toRadians(0), leftFlap8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+180))*5));
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-1), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-0.1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-300))*-1), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backLeftFin, backLeftFin.rotateAngleX + (float) Math.toRadians(-8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-1), backLeftFin.rotateAngleY + (float) Math.toRadians(0), backLeftFin.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+180))*5));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-350))*-1), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-400))*-1), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-450))*-1), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backRightFin, backRightFin.rotateAngleX + (float) Math.toRadians(-8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-1), backRightFin.rotateAngleY + (float) Math.toRadians(0), backRightFin.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+180))*5));
        this.setRotateAngle(rightSide, rightSide.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-50))*-2), rightSide.rotateAngleY + (float) Math.toRadians(0), rightSide.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200))*-1));
        this.setRotateAngle(rightFlap, rightFlap.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-7), rightFlap.rotateAngleY + (float) Math.toRadians(0), rightFlap.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+40))*-5));
        this.setRotateAngle(rightFlap2, rightFlap2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-7), rightFlap2.rotateAngleY + (float) Math.toRadians(0), rightFlap2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+60))*-5));
        this.setRotateAngle(rightFlap3, rightFlap3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-7), rightFlap3.rotateAngleY + (float) Math.toRadians(0), rightFlap3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+80))*-5));
        this.setRotateAngle(rightFlap4, rightFlap4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-7), rightFlap4.rotateAngleY + (float) Math.toRadians(0), rightFlap4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+100))*-5));
        this.setRotateAngle(rightFlap5, rightFlap5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-7), rightFlap5.rotateAngleY + (float) Math.toRadians(0), rightFlap5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+120))*-5));
        this.setRotateAngle(rightFlap6, rightFlap6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-7), rightFlap6.rotateAngleY + (float) Math.toRadians(0), rightFlap6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+140))*-5));
        this.setRotateAngle(rightFlap7, rightFlap7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-7), rightFlap7.rotateAngleY + (float) Math.toRadians(0), rightFlap7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+160))*-5));
        this.setRotateAngle(rightFlap8, rightFlap8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200-250))*-7), rightFlap8.rotateAngleY + (float) Math.toRadians(0), rightFlap8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200+180))*-5));
        
    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCyclobatis entity = (EntityPrehistoricFloraCyclobatis) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 8) / 7) * (0-(1)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 13 + (((tickAnim - 8) / 7) * (0-(13)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 8) / 2) * (12.17-(10)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 12.17 + (((tickAnim - 10) / 5) * (0-(12.17)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22 + (((tickAnim - 8) / 2) * (22.67-(22)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 22.67 + (((tickAnim - 10) / 5) * (0-(22.67)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.2-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -0.2 + (((tickAnim - 10) / 5) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-20.92-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -20.92 + (((tickAnim - 3) / 2) * (-20.92-(-20.92)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -20.92 + (((tickAnim - 5) / 3) * (19.75-(-20.92)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 19.75 + (((tickAnim - 8) / 2) * (22.67-(19.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 22.67 + (((tickAnim - 10) / 3) * (14.06-(22.67)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 14.06 + (((tickAnim - 13) / 2) * (0-(14.06)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -0.25 + (((tickAnim - 3) / 2) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = -0.25 + (((tickAnim - 5) / 10) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 2.75 + (((tickAnim - 8) / 7) * (0-(2.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftSide, leftSide.rotateAngleX + (float) Math.toRadians(xx), leftSide.rotateAngleY + (float) Math.toRadians(yy), leftSide.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 2.75 + (((tickAnim - 8) / 7) * (0-(2.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightSide, rightSide.rotateAngleX + (float) Math.toRadians(xx), rightSide.rotateAngleY + (float) Math.toRadians(yy), rightSide.rotateAngleZ + (float) Math.toRadians(zz));


    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        EntityPrehistoricFloraCyclobatis ee = (EntityPrehistoricFloraCyclobatis) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

        if (!e.isInWater()) {
//            this.base.rotateAngleZ = (float) Math.toRadians(90);
//            this.base.offsetY = -0.2F;
//            this.bob(main, 0.5f, 2.5F, false, f2, 1);
            

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

