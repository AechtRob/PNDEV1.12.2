package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraShenzhousaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelShenzhousaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftUpperPropatagium;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftLowerPropatagium;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftArm4;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightUpperPropatagium;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightLowerPropatagium;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightArm4;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer eyes;
    private ModelAnimator animator;

    public ModelShenzhousaurus() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 3.0F, -1.075F);
        this.setRotateAngle(main, -0.0873F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -2.75F, -3.0F, 6, 8, 9, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 62, 21, -2.0F, 5.25F, 0.0F, 4, 1, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 77, 91, -0.5F, 5.25F, 0.0F, 1, 2, 6, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -2.75F, 3.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 71, 63, -2.5F, 0.0F, 0.0F, 6, 3, 5, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -2.75F, -1.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 17, -2.5F, 0.0F, -2.0F, 7, 4, 7, -0.01F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.main.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.1309F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 21, 71, -1.5F, -2.0F, -1.0F, 3, 10, 5, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.75F, 0.75F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6109F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 36, 89, -0.75F, -1.25F, -1.25F, 2, 10, 3, 0.0F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 94, 51, -1.25F, -1.25F, -1.25F, 1, 10, 3, -0.01F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 8.0F, 0.75F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7854F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 96, 30, -1.0F, 0.25F, -1.0F, 2, 6, 2, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.75F, 0.25F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.3927F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 60, 97, -1.5F, -0.25F, -2.75F, 3, 1, 3, 0.0F, false));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.25F, -2.5F);
        this.leftLeg4.addChild(leftLeg5);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 98, 39, -1.5F, -0.5F, -2.75F, 3, 1, 3, -0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.main.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.1309F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 21, 71, -1.5F, -2.0F, -1.0F, 3, 10, 5, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.75F, 0.75F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6109F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 36, 89, -1.25F, -1.25F, -1.25F, 2, 10, 3, 0.0F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 94, 51, 0.25F, -1.25F, -1.25F, 1, 10, 3, -0.01F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 8.0F, 0.75F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7854F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 96, 30, -1.0F, 0.25F, -1.0F, 2, 6, 2, 0.0F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.75F, 0.25F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.3927F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 60, 97, -1.5F, -0.25F, -2.75F, 3, 1, 3, 0.0F, true));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.25F, -2.5F);
        this.rightLeg4.addChild(rightLeg5);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 98, 39, -1.5F, -0.5F, -2.75F, 3, 1, 3, -0.01F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5F, 6.0F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 31, 42, -2.0F, -2.0F, -1.0F, 4, 5, 8, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 38, 79, -1.0F, 3.0F, -1.0F, 2, 1, 8, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -2.0F, 4.0F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 94, 73, -1.5F, 0.0F, 0.0F, 4, 1, 4, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -2.0F, 0.0F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 71, 72, -1.5F, 0.0F, -1.0F, 5, 2, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 48, 56, -1.5F, -1.5F, -1.0F, 3, 3, 8, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 74, -1.0F, 1.5F, -1.0F, 2, 2, 8, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 33, 29, -2.5F, -0.25F, -1.0F, 5, 4, 8, 0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.35F, 6.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 60, 0, -1.0F, -1.0F, -0.25F, 2, 2, 9, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 61, -0.5F, 1.0F, -0.25F, 1, 3, 9, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 33, -3.0F, 0.0F, -0.25F, 6, 5, 9, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.05F, 8.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 48, -0.5F, -0.75F, -0.25F, 1, 1, 11, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 25, 56, 0.0F, 0.25F, -0.25F, 0, 3, 11, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 48, 68, -2.5F, 0.0F, -0.25F, 5, 4, 6, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 83, 0, -2.0F, 0.0F, 5.75F, 4, 3, 5, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 47, 101, -1.5F, 0.0F, 10.75F, 3, 2, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 31, 0, -3.5F, -2.0F, -6.0F, 7, 9, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 62, 12, -2.5F, 7.0F, -6.0F, 5, 1, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 80, 81, -1.0F, 7.0F, -6.0F, 2, 2, 7, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.0F, -6.25F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 18, -3.5F, 0.0F, 0.0F, 7, 5, 9, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.75F, -6.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 56, 42, -2.5F, -1.0F, -4.5F, 5, 5, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 4.0F, -4.5F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5672F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 95, -1.0F, 0.0F, 0.0F, 0, 2, 6, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 87, -2.5F, 0.0F, 0.0F, 3, 1, 6, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 60, 29, -3.5F, -4.0F, 0.0F, 5, 4, 6, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -1.0F, -2.0F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 71, 54, -3.5F, 0.0F, 0.0F, 6, 3, 5, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, -1.0F, -5.0F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 59, 81, -3.5F, 0.0F, 0.0F, 5, 3, 5, 0.01F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.5076F, 3.0F, -2.9132F);
        this.body2.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.8727F, 0.1745F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 99, 79, -1.0F, -0.75F, -1.0F, 2, 6, 2, 0.0F, false));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 28, 95, 0.65F, -0.75F, 1.0F, 0, 8, 3, 0.0F, false));

        this.leftUpperPropatagium = new AdvancedModelRenderer(this);
        this.leftUpperPropatagium.setRotationPoint(0.0F, 2.25F, -1.0F);
        this.leftArm.addChild(leftUpperPropatagium);
        this.setRotateAngle(leftUpperPropatagium, -0.2182F, 0.0F, 0.0F);
        this.leftUpperPropatagium.cubeList.add(new ModelBox(leftUpperPropatagium, 103, 103, -0.5F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.75F, 4.5F, -0.2F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.3963F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 84, 100, -1.0F, -1.0F, -1.0F, 1, 5, 2, 0.0F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 83, 21, -0.15F, -3.0F, -1.0F, 0, 8, 6, 0.0F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 102, -1.5F, -1.0F, -1.0F, 1, 5, 2, -0.01F, false));

        this.leftLowerPropatagium = new AdvancedModelRenderer(this);
        this.leftLowerPropatagium.setRotationPoint(-0.75F, 4.0F, -1.0F);
        this.leftArm2.addChild(leftLowerPropatagium);
        this.setRotateAngle(leftLowerPropatagium, 0.2618F, 0.0F, 0.0F);
        this.leftLowerPropatagium.cubeList.add(new ModelBox(leftLowerPropatagium, 7, 102, -0.5F, -4.0F, 0.0F, 1, 4, 2, -0.01F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.25F, 3.75F, 0.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.5672F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 35, 103, -1.0F, 1.75F, -1.0F, 1, 4, 2, 0.0F, false));
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 14, 104, -1.0F, -0.25F, -1.0F, 1, 2, 2, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.1F, 4.15F, 0.5F);
        this.leftArm3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0698F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 102, 0, -0.05F, -3.5F, -1.0F, 0, 4, 3, 0.0F, false));

        this.leftArm4 = new AdvancedModelRenderer(this);
        this.leftArm4.setRotationPoint(-0.5F, 0.75F, -1.0F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, -0.2618F, 0.0F, 0.2182F);
        this.leftArm4.cubeList.add(new ModelBox(leftArm4, 25, 48, -0.5F, 0.0F, 0.0F, 1, 4, 1, -0.01F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.5076F, 3.0F, -2.9132F);
        this.body2.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.8727F, -0.1745F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 99, 79, -1.0F, -0.75F, -1.0F, 2, 6, 2, 0.0F, true));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 28, 95, -0.65F, -0.75F, 1.0F, 0, 8, 3, 0.0F, true));

        this.rightUpperPropatagium = new AdvancedModelRenderer(this);
        this.rightUpperPropatagium.setRotationPoint(0.0F, 2.25F, -1.0F);
        this.rightArm.addChild(rightUpperPropatagium);
        this.setRotateAngle(rightUpperPropatagium, -0.2182F, 0.0F, 0.0F);
        this.rightUpperPropatagium.cubeList.add(new ModelBox(rightUpperPropatagium, 103, 103, -0.5F, 0.0F, 0.0F, 1, 2, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.75F, 4.5F, -0.2F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.3963F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 84, 100, 0.0F, -1.0F, -1.0F, 1, 5, 2, 0.0F, true));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 83, 21, 0.15F, -3.0F, -1.0F, 0, 8, 6, 0.0F, true));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 102, 0.5F, -1.0F, -1.0F, 1, 5, 2, -0.01F, true));

        this.rightLowerPropatagium = new AdvancedModelRenderer(this);
        this.rightLowerPropatagium.setRotationPoint(0.75F, 4.0F, -1.0F);
        this.rightArm2.addChild(rightLowerPropatagium);
        this.setRotateAngle(rightLowerPropatagium, 0.2618F, 0.0F, 0.0F);
        this.rightLowerPropatagium.cubeList.add(new ModelBox(rightLowerPropatagium, 7, 102, -0.5F, -4.0F, 0.0F, 1, 4, 2, -0.01F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.25F, 3.75F, 0.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.5672F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 35, 103, 0.0F, 1.75F, -1.0F, 1, 4, 2, 0.0F, true));
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 14, 104, 0.0F, -0.25F, -1.0F, 1, 2, 2, 0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.1F, 4.15F, 0.5F);
        this.rightArm3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0698F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 102, 0, 0.05F, -3.5F, -1.0F, 0, 4, 3, 0.0F, true));

        this.rightArm4 = new AdvancedModelRenderer(this);
        this.rightArm4.setRotationPoint(0.5F, 0.75F, -1.0F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, -0.2618F, 0.0F, -0.2182F);
        this.rightArm4.cubeList.add(new ModelBox(rightArm4, 25, 48, -0.5F, 0.0F, 0.0F, 1, 4, 1, -0.01F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.3054F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 79, 40, -1.5F, -1.0F, -5.0F, 3, 4, 6, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 87, 9, -1.5F, 3.0F, -5.0F, 3, 1, 6, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 38, 71, 0.0F, 3.0F, -4.0F, 0, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -1.0F, -3.0F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 60, 90, -1.5F, 0.0F, 0.0F, 4, 2, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.0F, -5.35F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 95, -1.5F, 0.0F, 0.0F, 3, 2, 4, 0.01F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.1F, -4.75F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.5672F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 85, -1.0F, -1.0F, -5.0F, 2, 3, 6, 0.02F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -1.0F, -2.25F);
        this.neck2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 103, 99, -1.5F, 0.0F, 0.0F, 2, 1, 2, 0.04F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -1.0F, -5.25F);
        this.neck2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 73, 100, -1.5F, 0.0F, 0.0F, 2, 1, 3, 0.03F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 2.0F, 1.0F);
        this.neck2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 96, 24, -1.5F, 0.0F, -4.0F, 2, 1, 4, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.15F, -5.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2182F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 92, 91, -1.0F, -0.75F, -4.5F, 2, 2, 5, 0.0F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 94, 65, -1.0F, -0.25F, -4.5F, 2, 2, 5, -0.02F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.75F, -2.75F);
        this.neck3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 92, 99, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.02F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.75F, -4.6F);
        this.neck3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 103, 59, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.01F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.25F, -4.5F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.6109F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 58, 102, -1.0F, -0.75F, -1.35F, 2, 2, 2, -0.04F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 2.25F, -1.35F);
        this.neck4.addChild(throat);
        this.setRotateAngle(throat, -0.3491F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 96, 17, -0.5F, -1.0F, 0.0F, 1, 1, 5, -0.05F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, -0.05F, 5.5F);
        this.throat.addChild(throat2);
        this.setRotateAngle(throat2, -0.48F, 0.0F, 0.0F);
        this.throat2.cubeList.add(new ModelBox(throat2, 47, 90, 0.0F, -1.0F, -5.0F, 0, 4, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, 0.25F, -0.85F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.5236F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 103, 50, -1.5F, -1.1F, -1.775F, 2, 2, 2, 0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.1F, -1.75F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3491F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 98, 44, -1.0F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5F, 0.925F, -1.75F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2361F, -0.2491F, 0.0709F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 91, 104, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 0.925F, -1.75F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2361F, 0.2491F, -0.0709F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 91, 104, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.925F, -1.85F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2182F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 21, 104, -1.0F, -1.0F, -1.9F, 1, 1, 2, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, -1.0F, -1.75F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2182F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 74, 105, -1.5F, -0.1F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -1.0F, -0.75F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 103, 55, -1.5F, -0.1F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -1.0F, 0.225F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.3927F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 87, 17, -1.5F, -0.1F, 0.0F, 2, 1, 2, 0.02F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5F, -0.25F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 83, 36, -1.5F, 0.4F, -1.45F, 2, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 105, 30, -1.0F, 0.4F, -3.0F, 1, 1, 2, -0.02F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.4F, -3.0F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3054F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 105, 34, -1.0F, 0.0F, -1.95F, 1, 1, 2, -0.02F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.4F, 1.4F, -1.5F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.2182F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 67, 105, 0.0F, -1.0F, -1.85F, 1, 1, 2, -0.03F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.4F, 1.4F, -1.5F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.2182F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 67, 105, -1.0F, -1.0F, -1.85F, 1, 1, 2, -0.03F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.4F, -1.5F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0873F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 99, 88, -1.5F, -0.95F, 0.75F, 2, 1, 1, -0.03F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.4F, -1.475F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0873F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 86, 51, -1.5F, -0.95F, 0.0F, 2, 1, 1, -0.02F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(-0.5F, -0.1F, -1.0F);
        this.head.addChild(eyes);
        this.eyes.cubeList.add(new ModelBox(eyes, 79, 51, -1.15F, -0.5F, -0.5F, 2, 1, 1, 0.02F, true));
        this.eyes.cubeList.add(new ModelBox(eyes, 79, 51, -0.85F, -0.5F, -0.5F, 2, 1, 1, 0.02F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.neck.rotateAngleX = (float) Math.toRadians(90);

        this.neck.offsetY = -0F;
        this.neck.offsetX = -0F;
        this.neck.offsetZ = -0.02F;
        this.neck.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        this.main.offsetY = -0.08F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 0.35F;
        this.main.offsetX = 0.15F;
        this.main.rotateAngleY = (float)Math.toRadians(220);
        this.main.rotateAngleX = (float)Math.toRadians(-2);
        this.main.rotateAngleZ = (float)Math.toRadians(2);
        this.main.scaleChildren = true;
        float scaler = 0.8F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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

        EntityPrehistoricFloraShenzhousaurus entityShenzhousaurus = (EntityPrehistoricFloraShenzhousaurus) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, neck4);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.neck4, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftArm3, this.leftArm4};
        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightArm3, this.rightArm4};

        entityShenzhousaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityShenzhousaurus.getAnimation() == entityShenzhousaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityShenzhousaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityShenzhousaurus.getIsMoving()) {
                    if (entityShenzhousaurus.getAnimation() != entityShenzhousaurus.EAT_ANIMATION
                        && entityShenzhousaurus.getAnimation() != entityShenzhousaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                        this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                        this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                        this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                        this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityShenzhousaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraShenzhousaurus ee = (EntityPrehistoricFloraShenzhousaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
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
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SCRATCH_LEFT_ANIMATION) { //The noise anim
            animScratch(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animScratch(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShenzhousaurus entity = (EntityPrehistoricFloraShenzhousaurus) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-50 + (((tickAnim - 0) / 25) * (17.25-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-50)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 17.25 + (((tickAnim - 25) / 20) * (0-(17.25)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20 + (((tickAnim - 0) / 45) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 0) / 45) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*20 + (((tickAnim - 0) / 25) * (12.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-100))*-20-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*20)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 12.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-100))*-20 + (((tickAnim - 25) / 20) * (0-(12.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-100))*-20)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -21.25 + (((tickAnim - 25) / 20) * (0-(-21.25)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (34.125-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 34.125 + (((tickAnim - 20) / 5) * (38.5-(34.125)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 38.5 + (((tickAnim - 25) / 2) * (36.3-(38.5)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 36.3 + (((tickAnim - 27) / 13) * (0-(36.3)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 0) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 7) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 7) * (1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 7) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 7) / 7) * (0-(1)));
            zz = 1 + (((tickAnim - 7) / 7) * (1-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 14) / 11) * (1-(1)));
            yy = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            zz = 1 + (((tickAnim - 14) / 11) * (1-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 1 + (((tickAnim - 25) / 8) * (1-(1)));
            yy = 0 + (((tickAnim - 25) / 8) * (1-(0)));
            zz = 1 + (((tickAnim - 25) / 8) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShenzhousaurus entity = (EntityPrehistoricFloraShenzhousaurus) entitylivingbaseIn;
        int animCycle = 150;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 125) {
            xx = 5.75 + (((tickAnim - 25) / 100) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 100) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 5.75 + (((tickAnim - 125) / 25) * (0-(5.75)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-3.275-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            zz = -3.275 + (((tickAnim - 25) / 100) * (-3.275-(-3.275)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = -3.275 + (((tickAnim - 125) / 25) * (0-(-3.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 100) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 125) {
            xx = 8.25 + (((tickAnim - 25) / 100) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 100) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 8.25 + (((tickAnim - 125) / 25) * (0-(8.25)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            yy = -0.75 + (((tickAnim - 25) / 100) * (-0.75-(-0.75)));
            zz = 0 + (((tickAnim - 25) / 100) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            yy = -0.75 + (((tickAnim - 125) / 25) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 125) {
            xx = 7.5 + (((tickAnim - 25) / 100) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 100) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 7.5 + (((tickAnim - 125) / 25) * (0-(7.5)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 100) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 125) {
            xx = -19.25 + (((tickAnim - 25) / 100) * (-19.25-(-19.25)));
            yy = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 100) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = -19.25 + (((tickAnim - 125) / 25) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-32.63-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -32.63 + (((tickAnim - 13) / 12) * (-20.25-(-32.63)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 125) {
            xx = -20.25 + (((tickAnim - 25) / 100) * (-20.25-(-20.25)));
            yy = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 100) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 137) {
            xx = -20.25 + (((tickAnim - 125) / 12) * (-29.8-(-20.25)));
            yy = 0 + (((tickAnim - 125) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 12) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 150) {
            xx = -29.8 + (((tickAnim - 137) / 13) * (0-(-29.8)));
            yy = 0 + (((tickAnim - 137) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (42.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 42.75 + (((tickAnim - 13) / 12) * (-7-(42.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 125) {
            xx = -7 + (((tickAnim - 25) / 100) * (-7-(-7)));
            yy = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 100) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 137) {
            xx = -7 + (((tickAnim - 125) / 12) * (63.77-(-7)));
            yy = 0 + (((tickAnim - 125) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 12) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 150) {
            xx = 63.77 + (((tickAnim - 137) / 13) * (0-(63.77)));
            yy = 0 + (((tickAnim - 137) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.4-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            yy = -0.575 + (((tickAnim - 25) / 100) * (-0.575-(-0.575)));
            zz = 0.4 + (((tickAnim - 25) / 100) * (0.4-(0.4)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            yy = -0.575 + (((tickAnim - 125) / 25) * (0-(-0.575)));
            zz = 0.4 + (((tickAnim - 125) / 25) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-50.13-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -50.13 + (((tickAnim - 13) / 12) * (1.25-(-50.13)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 125) {
            xx = 1.25 + (((tickAnim - 25) / 100) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 100) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 137) {
            xx = 1.25 + (((tickAnim - 125) / 12) * (-41.08-(1.25)));
            yy = 0 + (((tickAnim - 125) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 12) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 150) {
            xx = -41.08 + (((tickAnim - 137) / 13) * (0-(-41.08)));
            yy = 0 + (((tickAnim - 137) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (36.67-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 36.67 + (((tickAnim - 4) / 9) * (53.75-(36.67)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 53.75 + (((tickAnim - 13) / 12) * (20-(53.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 125) {
            xx = 20 + (((tickAnim - 25) / 100) * (20-(20)));
            yy = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 100) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 137) {
            xx = 20 + (((tickAnim - 125) / 12) * (68.92-(20)));
            yy = 0 + (((tickAnim - 125) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 12) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 150) {
            xx = 68.92 + (((tickAnim - 137) / 13) * (0-(68.92)));
            yy = 0 + (((tickAnim - 137) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -14 + (((tickAnim - 5) / 8) * (34.5-(-14)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 34.5 + (((tickAnim - 13) / 12) * (0-(34.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 100) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 125) {
            xx = -7.75 + (((tickAnim - 25) / 100) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 100) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = -7.75 + (((tickAnim - 125) / 25) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 94) {
            xx = 14.75 + (((tickAnim - 25) / 69) * (14.75-(14.75)));
            yy = 0 + (((tickAnim - 25) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 69) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 95) {
            xx = 14.75 + (((tickAnim - 94) / 1) * (12.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*5-(14.75)));
            yy = 0 + (((tickAnim - 94) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 1) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 12.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*5 + (((tickAnim - 95) / 20) * (10.25-(12.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*5)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 10.25 + (((tickAnim - 115) / 10) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 10) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 10.25 + (((tickAnim - 125) / 25) * (0-(10.25)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 94) {
            xx = 15.25 + (((tickAnim - 25) / 69) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 25) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 69) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 95) {
            xx = 15.25 + (((tickAnim - 94) / 1) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 94) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 1) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 15.25 + (((tickAnim - 95) / 20) * (0-(15.25)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 10) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-13.75-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            zz = -13.75 + (((tickAnim - 25) / 100) * (-13.75-(-13.75)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = -13.75 + (((tickAnim - 125) / 25) * (0-(-13.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (21-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 100) * (0-(0)));
            zz = 21 + (((tickAnim - 25) / 100) * (21-(21)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 21 + (((tickAnim - 125) / 25) * (0-(21)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-35 + (((tickAnim - 0) / 25) * (28.75-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-35)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 28.75 + (((tickAnim - 25) / 15) * (28.75-(28.75)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 28.75 + (((tickAnim - 40) / 15) * (13.5-(28.75)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = 13.5 + (((tickAnim - 55) / 15) * (28.75-(13.5)));
            yy = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 15) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 28.75 + (((tickAnim - 70) / 15) * (28.75-(28.75)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 28.75 + (((tickAnim - 85) / 15) * (13.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*15-(28.75)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = 13.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*15 + (((tickAnim - 100) / 15) * (3.5-(13.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*15)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 3.5 + (((tickAnim - 115) / 10) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 10) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 3.5 + (((tickAnim - 125) / 25) * (0-(3.5)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55 + (((tickAnim - 0) / 25) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (-182.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-205-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = -182.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-205 + (((tickAnim - 35) / 13) * (-15.95-(-182.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-205)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -15.95 + (((tickAnim - 48) / 5) * (-15.25-(-15.95)));
            yy = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = -15.25 + (((tickAnim - 53) / 2) * (-8.25-(-15.25)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = -8.25 + (((tickAnim - 55) / 15) * (18-(-8.25)));
            yy = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 15) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 18 + (((tickAnim - 70) / 10) * (59.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(18)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 59.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 80) / 13) * (-15.95-(59.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = -15.95 + (((tickAnim - 93) / 5) * (-7.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*-10-(-15.95)));
            yy = 0 + (((tickAnim - 93) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 5) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -7.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*-10 + (((tickAnim - 98) / 17) * (4.5-(-7.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*-10)));
            yy = 0 + (((tickAnim - 98) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 17) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 4.5 + (((tickAnim - 115) / 10) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 10) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 4.5 + (((tickAnim - 125) / 25) * (0-(4.5)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0.615-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0.615 + (((tickAnim - 48) / 7) * (0.375-(0.615)));
        }
        else if (tickAnim >= 55 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 55) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 30) * (0-(0)));
            zz = 0.375 + (((tickAnim - 55) / 30) * (0-(0.375)));
        }
        else if (tickAnim >= 85 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 85) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 8) * (0.615-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 93) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 93) / 7) * (0-(0)));
            zz = 0.615 + (((tickAnim - 93) / 7) * (0.375-(0.615)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 100) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 50) * (0-(0)));
            zz = 0.375 + (((tickAnim - 100) / 50) * (0-(0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-1.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-10-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -1.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-10 + (((tickAnim - 25) / 10) * (10.25-(-1.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-10)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 10.25 + (((tickAnim - 35) / 3) * (13.9416-(10.25)));
            yy = 0 + (((tickAnim - 35) / 3) * (-2.7668-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (-0.1096-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 13.9416 + (((tickAnim - 38) / 10) * (-28-(13.9416)));
            yy = -2.7668 + (((tickAnim - 38) / 10) * (0-(-2.7668)));
            zz = -0.1096 + (((tickAnim - 38) / 10) * (0-(-0.1096)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -28 + (((tickAnim - 48) / 5) * (-17.5-(-28)));
            yy = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 70) {
            xx = -17.5 + (((tickAnim - 53) / 17) * (-1.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-10-(-17.5)));
            yy = 0 + (((tickAnim - 53) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 17) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -1.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-10 + (((tickAnim - 70) / 10) * (10.25-(-1.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*-10)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = 10.25 + (((tickAnim - 80) / 3) * (13.9416-(10.25)));
            yy = 0 + (((tickAnim - 80) / 3) * (-2.7668-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (-0.1096-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 93) {
            xx = 13.9416 + (((tickAnim - 83) / 10) * (-28-(13.9416)));
            yy = -2.7668 + (((tickAnim - 83) / 10) * (0-(-2.7668)));
            zz = -0.1096 + (((tickAnim - 83) / 10) * (0-(-0.1096)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = -28 + (((tickAnim - 93) / 5) * (-17.5-(-28)));
            yy = 0 + (((tickAnim - 93) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 5) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -17.5 + (((tickAnim - 98) / 17) * (-27-(-17.5)));
            yy = 0 + (((tickAnim - 98) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 17) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = -27 + (((tickAnim - 115) / 10) * (-27-(-27)));
            yy = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 10) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = -27 + (((tickAnim - 125) / 25) * (0-(-27)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.45-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 0.45 + (((tickAnim - 25) / 23) * (0.775-(0.45)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0.775 + (((tickAnim - 48) / 22) * (0.45-(0.775)));
        }
        else if (tickAnim >= 70 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 70) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 23) * (0-(0)));
            zz = 0.45 + (((tickAnim - 70) / 23) * (0.775-(0.45)));
        }
        else if (tickAnim >= 93 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 93) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 93) / 22) * (0-(0)));
            zz = 0.775 + (((tickAnim - 93) / 22) * (0.775-(0.775)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            zz = 0.775 + (((tickAnim - 115) / 10) * (0.775-(0.775)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0.775 + (((tickAnim - 125) / 25) * (0-(0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -4.5 + (((tickAnim - 40) / 40) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 150) {
            xx = -4.5 + (((tickAnim - 85) / 65) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 85) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0.2-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 0.2 + (((tickAnim - 40) / 40) * (0-(0.2)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0.2-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 85) / 65) * (0-(0)));
            yy = 0.2 + (((tickAnim - 85) / 65) * (0-(0.2)));
            zz = 0 + (((tickAnim - 85) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -16.25 + (((tickAnim - 25) / 10) * (-37.25-(-16.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -37.25 + (((tickAnim - 35) / 3) * (-30.5-(-37.25)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -30.5 + (((tickAnim - 38) / 2) * (-89.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*55-(-30.5)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -89.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*55 + (((tickAnim - 40) / 8) * (-46.75-(-89.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*55)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -46.75 + (((tickAnim - 48) / 5) * (-25.25-(-46.75)));
            yy = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 70) {
            xx = -25.25 + (((tickAnim - 53) / 17) * (-16.25-(-25.25)));
            yy = 0 + (((tickAnim - 53) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 17) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -16.25 + (((tickAnim - 70) / 10) * (-37.25-(-16.25)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = -37.25 + (((tickAnim - 80) / 3) * (-30.5-(-37.25)));
            yy = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = -30.5 + (((tickAnim - 83) / 2) * (-89.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*55-(-30.5)));
            yy = 0 + (((tickAnim - 83) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 2) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 93) {
            xx = -89.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*55 + (((tickAnim - 85) / 8) * (-46.75-(-89.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*55)));
            yy = 0 + (((tickAnim - 85) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 8) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = -46.75 + (((tickAnim - 93) / 5) * (-25.25-(-46.75)));
            yy = 0 + (((tickAnim - 93) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 5) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -25.25 + (((tickAnim - 98) / 17) * (0-(-25.25)));
            yy = 0 + (((tickAnim - 98) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 17) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 10) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 85) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (29.75-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 29.75 + (((tickAnim - 35) / 3) * (0-(29.75)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (17.75-(0)));
            yy = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 17.75 + (((tickAnim - 48) / 5) * (0-(17.75)));
            yy = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 53) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 14) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 67) / 10) * (29.75-(0)));
            yy = 0 + (((tickAnim - 67) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 10) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 82) {
            xx = 29.75 + (((tickAnim - 77) / 5) * (0-(29.75)));
            yy = 0 + (((tickAnim - 77) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 5) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 82) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 7) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 89) / 4) * (17.75-(0)));
            yy = 0 + (((tickAnim - 89) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 4) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = 17.75 + (((tickAnim - 93) / 5) * (0-(17.75)));
            yy = 0 + (((tickAnim - 93) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 5) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 98) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 98) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShenzhousaurus entity = (EntityPrehistoricFloraShenzhousaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(-9.575-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*10), leftLeg1.rotateAngleY + (float) Math.toRadians(0), leftLeg1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(30.2-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-40), leftLeg2.rotateAngleY + (float) Math.toRadians(0), leftLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(-14.325-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*30), leftLeg3.rotateAngleY + (float) Math.toRadians(0), leftLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(29.925-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*-30), leftLeg4.rotateAngleY + (float) Math.toRadians(0), leftLeg4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(0.075-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*20), leftLeg5.rotateAngleY + (float) Math.toRadians(0), leftLeg5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(-0.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*1), rightLeg1.rotateAngleY + (float) Math.toRadians(0), rightLeg1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-1.95-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*2), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShenzhousaurus entity = (EntityPrehistoricFloraShenzhousaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-32.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -32.25 + (((tickAnim - 18) / 15) * (-32.25-(-32.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -32.25 + (((tickAnim - 33) / 17) * (0-(-32.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-7.075-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (1.65-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -7.075 + (((tickAnim - 18) / 15) * (-7.075-(-7.075)));
            zz = 1.65 + (((tickAnim - 18) / 15) * (1.65-(1.65)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -7.075 + (((tickAnim - 33) / 17) * (0-(-7.075)));
            zz = 1.65 + (((tickAnim - 33) / 17) * (0-(1.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 8.75 + (((tickAnim - 18) / 15) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 33) / 17) * (0-(8.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (59.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 59.5 + (((tickAnim - 18) / 15) * (59.5-(59.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 59.5 + (((tickAnim - 33) / 17) * (0-(59.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-84.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -84.25 + (((tickAnim - 18) / 15) * (-84.25-(-84.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -84.25 + (((tickAnim - 33) / 17) * (0-(-84.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (-1.625-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -1.625 + (((tickAnim - 18) / 15) * (-1.625-(-1.625)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            yy = -1.625 + (((tickAnim - 33) / 8) * (0-(-1.625)));
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
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (49.5608-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.8946-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (5.1445-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 49.5608 + (((tickAnim - 18) / 15) * (49.5608-(49.5608)));
            yy = 0.8946 + (((tickAnim - 18) / 15) * (0.8946-(0.8946)));
            zz = 5.1445 + (((tickAnim - 18) / 15) * (5.1445-(5.1445)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 49.5608 + (((tickAnim - 33) / 17) * (0-(49.5608)));
            yy = 0.8946 + (((tickAnim - 33) / 17) * (0-(0.8946)));
            zz = 5.1445 + (((tickAnim - 33) / 17) * (0-(5.1445)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 8.75 + (((tickAnim - 18) / 15) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 33) / 17) * (0-(8.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (59.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 59.5 + (((tickAnim - 18) / 15) * (59.5-(59.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 59.5 + (((tickAnim - 33) / 17) * (0-(59.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-84.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -84.25 + (((tickAnim - 18) / 15) * (-84.25-(-84.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -84.25 + (((tickAnim - 33) / 17) * (0-(-84.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (-1.625-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -1.625 + (((tickAnim - 18) / 15) * (-1.625-(-1.625)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            yy = -1.625 + (((tickAnim - 33) / 8) * (0-(-1.625)));
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
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (49.5608-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.8946-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-5.1445-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 49.5608 + (((tickAnim - 18) / 15) * (49.5608-(49.5608)));
            yy = -0.8946 + (((tickAnim - 18) / 15) * (-0.8946-(-0.8946)));
            zz = -5.1445 + (((tickAnim - 18) / 15) * (-5.1445-(-5.1445)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 49.5608 + (((tickAnim - 33) / 17) * (0-(49.5608)));
            yy = -0.8946 + (((tickAnim - 33) / 17) * (0-(-0.8946)));
            zz = -5.1445 + (((tickAnim - 33) / 17) * (0-(-5.1445)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 18) / 15) * (5-(5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 33) / 17) * (0-(5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 14 + (((tickAnim - 18) / 15) * (14-(14)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 14 + (((tickAnim - 33) / 17) * (0-(14)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 12 + (((tickAnim - 18) / 15) * (12-(12)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 33) / 17) * (0-(12)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 13 + (((tickAnim - 18) / 15) * (13-(13)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 13 + (((tickAnim - 33) / 17) * (0-(13)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 8 + (((tickAnim - 18) / 15) * (8-(8)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 8 + (((tickAnim - 33) / 17) * (0-(8)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 13.75 + (((tickAnim - 18) / 15) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 13.75 + (((tickAnim - 33) / 17) * (0-(13.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 15.25 + (((tickAnim - 18) / 15) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 15.25 + (((tickAnim - 33) / 17) * (0-(15.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShenzhousaurus entity = (EntityPrehistoricFloraShenzhousaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
    if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 0) / 10) * (18.75-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 18.75 + (((tickAnim - 10) / 10) * (0-(18.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12.75 + (((tickAnim - 10) / 10) * (0-(12.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 0) / 10) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-14.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -14.75 + (((tickAnim - 10) / 10) * (0-(-14.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 0) / 10) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (17.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 17.75 + (((tickAnim - 10) / 10) * (0-(17.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 0) / 10) * (-55.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*100-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -55.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*100 + (((tickAnim - 10) / 10) * (0-(-55.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*100)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (29.625-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 29.625 + (((tickAnim - 10) / 3) * (54.08-(29.625)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 54.08 + (((tickAnim - 13) / 4) * (349.765-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*500-(54.08)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 349.765-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*500 + (((tickAnim - 17) / 3) * (0-(349.765-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*500)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6.25 + (((tickAnim - 10) / 3) * (14.935-(6.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 14.935 + (((tickAnim - 13) / 4) * (67.87-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(14.935)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 67.87-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 17) / 3) * (0-(67.87-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 0) / 5) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-21.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -21.5 + (((tickAnim - 10) / 3) * (-123.235-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(-21.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -123.235-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 13) / 7) * (0-(-123.235-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 0) / 5) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (17.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 17.5 + (((tickAnim - 10) / 7) * (-3.92-(17.5)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -3.92 + (((tickAnim - 17) / 3) * (0-(-3.92)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 0) / 10) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-27.92-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -27.92 + (((tickAnim - 13) / 4) * (-28.71-(-27.92)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -28.71 + (((tickAnim - 17) / 3) * (0-(-28.71)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 0) / 5) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (29-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 29 + (((tickAnim - 10) / 3) * (0-(29)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShenzhousaurus entity = (EntityPrehistoricFloraShenzhousaurus) entitylivingbaseIn;
        int animCycle = 28;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 0) / 5) * (5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 5) / 5) * (0-(5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-28.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -28.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 15) / 3) * (0-(-28.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (-6-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -6 + (((tickAnim - 20) / 3) * (-8.75-(-6)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -8.75 + (((tickAnim - 23) / 5) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (1.5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 1.5 + (((tickAnim - 15) / 8) * (7.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*550))*-10-(1.5)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 7.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*550))*-10 + (((tickAnim - 23) / 5) * (0-(7.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*550))*-10)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.75 + (((tickAnim - 5) / 5) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (8-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 8 + (((tickAnim - 15) / 3) * (0-(8)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (8-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 8 + (((tickAnim - 20) / 3) * (0.25-(8)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0.25 + (((tickAnim - 23) / 5) * (0-(0.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -21.25 + (((tickAnim - 5) / 5) * (0-(-21.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (6-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6 + (((tickAnim - 15) / 3) * (0-(6)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (6-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 6 + (((tickAnim - 20) / 8) * (0-(6)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 18.25 + (((tickAnim - 5) / 5) * (0-(18.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -11.75 + (((tickAnim - 15) / 3) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -11.75 + (((tickAnim - 20) / 8) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -11.75 + (((tickAnim - 15) / 3) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -11.75 + (((tickAnim - 20) / 3) * (-27-(-11.75)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -27 + (((tickAnim - 23) / 5) * (0-(-27)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 32.5 + (((tickAnim - 5) / 3) * (0-(32.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (14-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 14 + (((tickAnim - 15) / 3) * (0-(14)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (14-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 14 + (((tickAnim - 20) / 3) * (43-(14)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 43 + (((tickAnim - 23) / 5) * (0-(43)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraShenzhousaurus entity = (EntityPrehistoricFloraShenzhousaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-70))*3.5), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-70))*1), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-70))*-2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-70))*0.19);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*0.3);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-70))*0.59);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -17.9584 + (((tickAnim - 0) / 13) * (19-(-17.9584)));
            yy = 1.506 + (((tickAnim - 0) / 13) * (0-(1.506)));
            zz = 3.1599 + (((tickAnim - 0) / 13) * (0-(3.1599)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 19 + (((tickAnim - 13) / 5) * (103.705-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(19)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 103.705-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 18) / 7) * (-17.9584-(103.705-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 18) / 7) * (1.506-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (3.1599-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -0.5 + (((tickAnim - 0) / 13) * (30.5-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 30.5 + (((tickAnim - 13) / 5) * (218.505-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(30.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 218.505-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 18) / 7) * (-0.5-(218.505-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.55 + (((tickAnim - 0) / 13) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.715-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0.715 + (((tickAnim - 18) / 7) * (-0.55-(0.715)));
            zz = -0.25 + (((tickAnim - 18) / 7) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 3.25 + (((tickAnim - 0) / 13) * (0-(3.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (35.43-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 35.43-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 18) / 7) * (3.25-(35.43-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 11.8142 + (((tickAnim - 0) / 6) * (-9.87-(11.8142)));
            yy = 3.8171 + (((tickAnim - 0) / 6) * (0-(3.8171)));
            zz = -5.5712 + (((tickAnim - 0) / 6) * (0-(-5.5712)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -9.87 + (((tickAnim - 6) / 3) * (33.31-(-9.87)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 33.31 + (((tickAnim - 9) / 4) * (38-(33.31)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 38 + (((tickAnim - 13) / 5) * (62.57-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150-(38)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 62.57-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150 + (((tickAnim - 18) / 7) * (11.8142-(62.57-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150)));
            yy = 0 + (((tickAnim - 18) / 7) * (3.8171-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (-5.5712-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*6 + (((tickAnim - 0) / 6) * (-0.525-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*6)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = -0.525 + (((tickAnim - 6) / 3) * (-0.195-(-0.525)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = -0.195 + (((tickAnim - 9) / 9) * (0.825-(-0.195)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0.825 + (((tickAnim - 18) / 7) * (0-(0.825)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (-56.38-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -56.38 + (((tickAnim - 9) / 4) * (27.25-(-56.38)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 27.25 + (((tickAnim - 13) / 5) * (48.75-(27.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 48.75 + (((tickAnim - 18) / 7) * (0-(48.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 19 + (((tickAnim - 0) / 6) * (30.43-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120-(19)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 30.43-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120 + (((tickAnim - 6) / 7) * (-17.9585-(30.43-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120)));
            yy = 0 + (((tickAnim - 6) / 7) * (-1.506-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-3.1596-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -17.9585 + (((tickAnim - 13) / 12) * (19-(-17.9585)));
            yy = -1.506 + (((tickAnim - 13) / 12) * (0-(-1.506)));
            zz = -3.1596 + (((tickAnim - 13) / 12) * (0-(-3.1596)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 30.5 + (((tickAnim - 0) / 6) * (70.655-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(30.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 70.655-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 6) / 7) * (-0.5-(70.655-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -0.5 + (((tickAnim - 13) / 12) * (30.5-(-0.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.715-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.715 + (((tickAnim - 5) / 8) * (-0.55-(0.715)));
            zz = -0.25 + (((tickAnim - 5) / 8) * (0-(-0.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.55 + (((tickAnim - 13) / 12) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-27.32-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -27.32-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 5) / 3) * (-66.345-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(-27.32-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -66.345-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 8) / 5) * (3-(-66.345-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 3 + (((tickAnim - 13) / 12) * (0-(3)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 38 + (((tickAnim - 0) / 6) * (88.945-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(38)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 88.945-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 6) / 7) * (11.8532-(88.945-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 6) / 7) * (-3.3941-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (4.9506-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 11.8532 + (((tickAnim - 13) / 3) * (-0.12-(11.8532)));
            yy = -3.3941 + (((tickAnim - 13) / 3) * (0-(-3.3941)));
            zz = 4.9506 + (((tickAnim - 13) / 3) * (0-(4.9506)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -0.12 + (((tickAnim - 16) / 5) * (36.81-(-0.12)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 36.81 + (((tickAnim - 21) / 4) * (38-(36.81)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 1.15 + (((tickAnim - 6) / 7) * (-1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*4-(1.15)));
            zz = -0.5 + (((tickAnim - 6) / 7) * (0-(-0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*4 + (((tickAnim - 13) / 3) * (0.115-(-1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*4)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.115 + (((tickAnim - 16) / 2) * (0.645-(0.115)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.645 + (((tickAnim - 18) / 3) * (-0.07-(0.645)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = -0.07 + (((tickAnim - 21) / 4) * (0-(-0.07)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 27.25 + (((tickAnim - 0) / 6) * (48.75-(27.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 48.75 + (((tickAnim - 6) / 7) * (0-(48.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (-64.89-(0)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -64.89 + (((tickAnim - 21) / 4) * (27.25-(-64.89)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*-3), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-70))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*-3.5), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-70))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*-4), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-70))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*-4), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-6), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-70))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-70))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*-2.5), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*2));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0.6482-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*-2.5), leftArm.rotateAngleY + (float) Math.toRadians(6.0733), leftArm.rotateAngleZ + (float) Math.toRadians(-1.5038));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*-3), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-350))*4), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0.6482-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*-2.5), rightArm.rotateAngleY + (float) Math.toRadians(-6.0733), rightArm.rotateAngleZ + (float) Math.toRadians(1.5038));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*-3), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-350))*4), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*-1), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*-1.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-300))*-2), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-350))*-2), throat2.rotateAngleY + (float) Math.toRadians(0), throat2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-320))*-4));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-350))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraShenzhousaurus entity = (EntityPrehistoricFloraShenzhousaurus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-4.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+100))*9), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+100))*5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5))*-1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+80))*1.5);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 27-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*490 + (((tickAnim - 0) / 8) * (0.4118-(27-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*490)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.4812-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (4.7761-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0.4118 + (((tickAnim - 8) / 5) * (303.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*400-(0.4118)));
            yy = 1.4812 + (((tickAnim - 8) / 5) * (0-(1.4812)));
            zz = 4.7761 + (((tickAnim - 8) / 5) * (0-(4.7761)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 59.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*750))*-40 + (((tickAnim - 0) / 8) * (-3.25-(59.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*750))*-40)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -3.25 + (((tickAnim - 8) / 5) * (59.975-(-3.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.55 + (((tickAnim - 8) / 5) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -18.25 + (((tickAnim - 0) / 2) * (-25.59-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*400-(-18.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = -25.59-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*400 + (((tickAnim - 2) / 6) * (-8.75-(-25.59-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*400)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -8.75 + (((tickAnim - 8) / 5) * (-18.25-(-8.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-1.09-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -1.09 + (((tickAnim - 4) / 2) * (-0.4-(-1.09)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.4 + (((tickAnim - 6) / 2) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 62 + (((tickAnim - 0) / 6) * (73.25-(62)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 73.25 + (((tickAnim - 6) / 2) * (17.5-(73.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 17.5 + (((tickAnim - 8) / 0) * (48.42-(17.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 48.42 + (((tickAnim - 8) / 5) * (62-(48.42)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (1.225-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 1.225 + (((tickAnim - 8) / 0) * (1.295-(1.225)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.295 + (((tickAnim - 8) / 5) * (0-(1.295)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 41 + (((tickAnim - 0) / 6) * (0-(41)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (-64.67-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -64.67 + (((tickAnim - 8) / 1) * (0-(-64.67)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (41-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -23.9162 + (((tickAnim - 0) / 8) * (200.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*400-(-23.9162)));
            yy = 3.3204 + (((tickAnim - 0) / 8) * (0-(3.3204)));
            zz = -3.3204 + (((tickAnim - 0) / 8) * (0-(-3.3204)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 200.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*400 + (((tickAnim - 8) / 5) * (-23.225-(200.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*400)));
            yy = 0 + (((tickAnim - 8) / 5) * (3.3204-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-3.3204-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 14.25 + (((tickAnim - 0) / 1) * (-3.25-(14.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = -3.25 + (((tickAnim - 1) / 5) * (-105.53-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-240-(-3.25)));
            yy = 0 + (((tickAnim - 1) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 5) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -105.53-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-240 + (((tickAnim - 6) / 7) * (14.25-(-105.53-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-240)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            yy = -0.55 + (((tickAnim - 1) / 4) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 1) / 4) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -38 + (((tickAnim - 0) / 1) * (0-(-38)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 1) / 4) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 4) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -18.25 + (((tickAnim - 5) / 3) * (-55.97-(-18.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -55.97 + (((tickAnim - 8) / 2) * (-55.97-(-55.97)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -55.97 + (((tickAnim - 10) / 3) * (-38-(-55.97)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.575 + (((tickAnim - 8) / 2) * (-0.575-(-0.575)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -0.575 + (((tickAnim - 10) / 3) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 73.25 + (((tickAnim - 0) / 1) * (14.25-(73.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 14.25 + (((tickAnim - 1) / 2) * (63.86-(14.25)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 63.86 + (((tickAnim - 3) / 2) * (62-(63.86)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 62 + (((tickAnim - 5) / 8) * (73.25-(62)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (1.175-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 1.175 + (((tickAnim - 1) / 1) * (2.295-(1.175)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 2.295 + (((tickAnim - 2) / 3) * (0-(2.295)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (-30.5-(0)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -30.5 + (((tickAnim - 2) / 1) * (-59.75-(-30.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -59.75 + (((tickAnim - 3) / 4) * (41-(-59.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 41 + (((tickAnim - 7) / 6) * (0-(41)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(3-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-50))*15), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+100))*5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+100))*5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-150))*10), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-150))*5), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-150))*-5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-200))*5), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-200))*-5), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-4.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-10))*8), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577))*5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-3-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+100))*-12), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-100))*5));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+80))*-1);


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(19.767), leftArm.rotateAngleY + (float) Math.toRadians(12.0163), leftArm.rotateAngleZ + (float) Math.toRadians(-4.445));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-27.5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(23.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+100))*-12), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(19.767), rightArm.rotateAngleY + (float) Math.toRadians(-12.0163), rightArm.rotateAngleZ + (float) Math.toRadians(4.445));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-27.5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(23.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+100))*-12), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(2.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+150))*17), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+100))*-15), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-6.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+250))*-10), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(12-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5))*5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(-12.75), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(3.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-50))*-5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraShenzhousaurus e = (EntityPrehistoricFloraShenzhousaurus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

    }
}
