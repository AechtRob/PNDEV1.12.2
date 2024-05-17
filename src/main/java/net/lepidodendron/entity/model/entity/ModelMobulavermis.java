package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelMobulavermis extends AdvancedModelBase {
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer mouthParts;
    private final AdvancedModelRenderer leftFlipper1;
    private final AdvancedModelRenderer rightFlipper1;
    private final AdvancedModelRenderer leftFlipper2;
    private final AdvancedModelRenderer rightFlipper2;
    private final AdvancedModelRenderer leftAppendage1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftAppendage2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftAppendage3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftAppendageClaw1;
    private final AdvancedModelRenderer leftAppendageClaw2;
    private final AdvancedModelRenderer leftAppendageClaw3;
    private final AdvancedModelRenderer rightAppendage1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightAppendage2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightAppendage3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer rightAppendageClaw1;
    private final AdvancedModelRenderer rightAppendageClaw2;
    private final AdvancedModelRenderer rightAppendageClaw3;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer leftFlipper3;
    private final AdvancedModelRenderer rightFlipper3;
    private final AdvancedModelRenderer leftFlipper4;
    private final AdvancedModelRenderer rightFlipper4;
    private final AdvancedModelRenderer leftFlipper5;
    private final AdvancedModelRenderer rightFlipper5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer leftFlipper6;
    private final AdvancedModelRenderer rightFlipper6;
    private final AdvancedModelRenderer leftFlipper7;
    private final AdvancedModelRenderer rightFlipper7;
    private final AdvancedModelRenderer leftFlipper8;
    private final AdvancedModelRenderer rightFlipper8;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer leftFlipper9;
    private final AdvancedModelRenderer rightFlipper9;
    private final AdvancedModelRenderer leftFlipper10;
    private final AdvancedModelRenderer rightFlipper10;
    private final AdvancedModelRenderer leftFlipper11;
    private final AdvancedModelRenderer rightFlipper11;
    private final AdvancedModelRenderer leftFlipper12;
    private final AdvancedModelRenderer rightFlipper12;
    private final AdvancedModelRenderer leftFlipper13;
    private final AdvancedModelRenderer rightFlipper13;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;

    public ModelMobulavermis() {
        this.textureWidth = 42;
        this.textureHeight = 36;

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 23.5F, -6.0F);
        this.Head.cubeList.add(new ModelBox(Head, 24, 4, -1.0F, -1.0F, -5.0F, 2, 2, 5, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 26, 33, -1.0F, -1.0F, -7.0F, 2, 1, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 13, 4, 0.5F, -0.5F, -6.25F, 1, 0, 1, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 13, 4, -1.5F, -0.5F, -6.25F, 1, 0, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, -5.5F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.7418F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 11, -0.75F, 0.0F, -2.0F, 0, 1, 2, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 11, 0.75F, 0.0F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 0.5F, -7.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.7854F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 4, -0.6F, -1.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 0.5F, -7.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 4, -0.4F, -1.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.mouthParts = new AdvancedModelRenderer(this);
        this.mouthParts.setRotationPoint(0.0F, 0.5F, -5.0F);
        this.Head.addChild(mouthParts);
        this.mouthParts.cubeList.add(new ModelBox(mouthParts, 0, 0, -0.5F, -0.5F, -1.9F, 1, 1, 2, -0.1F, false));

        this.leftFlipper1 = new AdvancedModelRenderer(this);
        this.leftFlipper1.setRotationPoint(1.0F, 0.0F, -2.5F);
        this.Head.addChild(leftFlipper1);
        this.leftFlipper1.cubeList.add(new ModelBox(leftFlipper1, 32, 12, -0.5F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightFlipper1 = new AdvancedModelRenderer(this);
        this.rightFlipper1.setRotationPoint(-1.0F, 0.0F, -2.5F);
        this.Head.addChild(rightFlipper1);
        this.rightFlipper1.cubeList.add(new ModelBox(rightFlipper1, 32, 12, -3.5F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.leftFlipper2 = new AdvancedModelRenderer(this);
        this.leftFlipper2.setRotationPoint(1.0F, 0.0F, -1.0F);
        this.Head.addChild(leftFlipper2);
        this.leftFlipper2.cubeList.add(new ModelBox(leftFlipper2, 27, 24, -0.75F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.rightFlipper2 = new AdvancedModelRenderer(this);
        this.rightFlipper2.setRotationPoint(-1.0F, 0.0F, -1.0F);
        this.Head.addChild(rightFlipper2);
        this.rightFlipper2.cubeList.add(new ModelBox(rightFlipper2, 27, 24, -4.25F, 0.0F, -1.0F, 5, 0, 2, 0.0F, true));

        this.leftAppendage1 = new AdvancedModelRenderer(this);
        this.leftAppendage1.setRotationPoint(1.0F, 0.0F, -4.0F);
        this.Head.addChild(leftAppendage1);
        this.setRotateAngle(leftAppendage1, 0.0F, 0.48F, 0.0F);
        this.leftAppendage1.cubeList.add(new ModelBox(leftAppendage1, 28, 14, -1.0F, -0.5F, -1.0F, 5, 1, 2, 0.02F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 0.5F, -1.0F);
        this.leftAppendage1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 4, 0.0F, -0.5F, -0.75F, 1, 0, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.5F, 0.5F, -1.0F);
        this.leftAppendage1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.2182F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 4, 0.0F, -0.5F, -1.0F, 1, 0, 1, 0.0F, false));

        this.leftAppendage2 = new AdvancedModelRenderer(this);
        this.leftAppendage2.setRotationPoint(4.0F, 0.0F, 0.5F);
        this.leftAppendage1.addChild(leftAppendage2);
        this.setRotateAngle(leftAppendage2, 0.0F, 0.4363F, 0.0F);
        this.leftAppendage2.cubeList.add(new ModelBox(leftAppendage2, 11, 31, 0.0F, -0.5F, -1.5F, 4, 1, 1, 0.01F, false));
        this.leftAppendage2.cubeList.add(new ModelBox(leftAppendage2, 0, 30, 0.0F, -0.5F, -1.0F, 4, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.5F, -1.25F);
        this.leftAppendage2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.2182F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 4, 0.0F, -0.5F, -1.75F, 1, 0, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.0F, 0.5F, -1.25F);
        this.leftAppendage2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.2182F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 4, 0.0F, -0.5F, -2.0F, 1, 0, 2, 0.0F, false));

        this.leftAppendage3 = new AdvancedModelRenderer(this);
        this.leftAppendage3.setRotationPoint(4.0F, 0.0F, -0.5F);
        this.leftAppendage2.addChild(leftAppendage3);
        this.setRotateAngle(leftAppendage3, 0.0F, 0.3491F, 0.0F);
        this.leftAppendage3.cubeList.add(new ModelBox(leftAppendage3, 29, 30, 0.0F, -0.5F, -1.0F, 4, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.5F, 0.5F, -1.0F);
        this.leftAppendage3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2182F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 31, 0.0F, -0.5F, -2.75F, 1, 0, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.leftAppendage3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.2182F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 31, 0.0F, -0.5F, -2.25F, 1, 0, 3, 0.0F, false));

        this.leftAppendageClaw1 = new AdvancedModelRenderer(this);
        this.leftAppendageClaw1.setRotationPoint(3.0F, -0.1F, -1.0F);
        this.leftAppendage3.addChild(leftAppendageClaw1);
        this.setRotateAngle(leftAppendageClaw1, 0.0F, 1.0908F, 0.0F);
        this.leftAppendageClaw1.cubeList.add(new ModelBox(leftAppendageClaw1, 28, 27, 0.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));

        this.leftAppendageClaw2 = new AdvancedModelRenderer(this);
        this.leftAppendageClaw2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.leftAppendage3.addChild(leftAppendageClaw2);
        this.setRotateAngle(leftAppendageClaw2, 0.0F, 0.48F, 0.0F);
        this.leftAppendageClaw2.cubeList.add(new ModelBox(leftAppendageClaw2, 11, 24, 0.0F, 0.0F, -3.0F, 6, 0, 3, 0.0F, false));

        this.leftAppendageClaw3 = new AdvancedModelRenderer(this);
        this.leftAppendageClaw3.setRotationPoint(4.0F, 0.0F, -0.5F);
        this.leftAppendage3.addChild(leftAppendageClaw3);
        this.setRotateAngle(leftAppendageClaw3, 0.0F, -0.1309F, 0.0F);
        this.leftAppendageClaw3.cubeList.add(new ModelBox(leftAppendageClaw3, 13, 0, -1.0F, 0.1F, -0.5F, 10, 0, 3, 0.0F, false));

        this.rightAppendage1 = new AdvancedModelRenderer(this);
        this.rightAppendage1.setRotationPoint(-1.0F, 0.0F, -4.0F);
        this.Head.addChild(rightAppendage1);
        this.setRotateAngle(rightAppendage1, 0.0F, -0.48F, 0.0F);
        this.rightAppendage1.cubeList.add(new ModelBox(rightAppendage1, 28, 14, -4.0F, -0.5F, -1.0F, 5, 1, 2, 0.02F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 0.5F, -1.0F);
        this.rightAppendage1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.2182F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 4, -1.0F, -0.5F, -0.75F, 1, 0, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.5F, 0.5F, -1.0F);
        this.rightAppendage1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.2182F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 4, -1.0F, -0.5F, -1.0F, 1, 0, 1, 0.0F, true));

        this.rightAppendage2 = new AdvancedModelRenderer(this);
        this.rightAppendage2.setRotationPoint(-4.0F, 0.0F, 0.5F);
        this.rightAppendage1.addChild(rightAppendage2);
        this.setRotateAngle(rightAppendage2, 0.0F, -0.4363F, 0.0F);
        this.rightAppendage2.cubeList.add(new ModelBox(rightAppendage2, 11, 31, -4.0F, -0.5F, -1.5F, 4, 1, 1, 0.01F, true));
        this.rightAppendage2.cubeList.add(new ModelBox(rightAppendage2, 0, 30, -4.0F, -0.5F, -1.0F, 4, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 0.5F, -1.25F);
        this.rightAppendage2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2182F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 4, -1.0F, -0.5F, -1.75F, 1, 0, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.0F, 0.5F, -1.25F);
        this.rightAppendage2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.2182F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 4, -1.0F, -0.5F, -2.0F, 1, 0, 2, 0.0F, true));

        this.rightAppendage3 = new AdvancedModelRenderer(this);
        this.rightAppendage3.setRotationPoint(-4.0F, 0.0F, -0.5F);
        this.rightAppendage2.addChild(rightAppendage3);
        this.setRotateAngle(rightAppendage3, 0.0F, -0.3491F, 0.0F);
        this.rightAppendage3.cubeList.add(new ModelBox(rightAppendage3, 29, 30, -4.0F, -0.5F, -1.0F, 4, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5F, 0.5F, -1.0F);
        this.rightAppendage3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.2182F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 31, -1.0F, -0.5F, -2.75F, 1, 0, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.rightAppendage3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.2182F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 31, -1.0F, -0.5F, -2.25F, 1, 0, 3, 0.0F, true));

        this.rightAppendageClaw1 = new AdvancedModelRenderer(this);
        this.rightAppendageClaw1.setRotationPoint(-3.0F, -0.1F, -1.0F);
        this.rightAppendage3.addChild(rightAppendageClaw1);
        this.setRotateAngle(rightAppendageClaw1, 0.0F, -1.0908F, 0.0F);
        this.rightAppendageClaw1.cubeList.add(new ModelBox(rightAppendageClaw1, 28, 27, -4.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F, true));

        this.rightAppendageClaw2 = new AdvancedModelRenderer(this);
        this.rightAppendageClaw2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.rightAppendage3.addChild(rightAppendageClaw2);
        this.setRotateAngle(rightAppendageClaw2, 0.0F, -0.48F, 0.0F);
        this.rightAppendageClaw2.cubeList.add(new ModelBox(rightAppendageClaw2, 11, 24, -6.0F, 0.0F, -3.0F, 6, 0, 3, 0.0F, true));

        this.rightAppendageClaw3 = new AdvancedModelRenderer(this);
        this.rightAppendageClaw3.setRotationPoint(-4.0F, 0.0F, -0.5F);
        this.rightAppendage3.addChild(rightAppendageClaw3);
        this.setRotateAngle(rightAppendageClaw3, 0.0F, 0.1309F, 0.0F);
        this.rightAppendageClaw3.cubeList.add(new ModelBox(rightAppendageClaw3, 13, 0, -9.0F, 0.1F, -0.5F, 10, 0, 3, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 15, 15, -1.5F, -1.0F, 0.0F, 3, 2, 6, 0.0F, false));

        this.leftFlipper3 = new AdvancedModelRenderer(this);
        this.leftFlipper3.setRotationPoint(1.5F, 0.0F, 1.0F);
        this.body1.addChild(leftFlipper3);
        this.leftFlipper3.cubeList.add(new ModelBox(leftFlipper3, 27, 24, -0.75F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.rightFlipper3 = new AdvancedModelRenderer(this);
        this.rightFlipper3.setRotationPoint(-1.5F, 0.0F, 1.0F);
        this.body1.addChild(rightFlipper3);
        this.rightFlipper3.cubeList.add(new ModelBox(rightFlipper3, 27, 24, -4.25F, 0.0F, -1.0F, 5, 0, 2, 0.0F, true));

        this.leftFlipper4 = new AdvancedModelRenderer(this);
        this.leftFlipper4.setRotationPoint(1.5F, 0.0F, 3.0F);
        this.body1.addChild(leftFlipper4);
        this.leftFlipper4.cubeList.add(new ModelBox(leftFlipper4, 27, 24, -0.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.rightFlipper4 = new AdvancedModelRenderer(this);
        this.rightFlipper4.setRotationPoint(-1.5F, 0.0F, 3.0F);
        this.body1.addChild(rightFlipper4);
        this.rightFlipper4.cubeList.add(new ModelBox(rightFlipper4, 27, 24, -4.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, true));

        this.leftFlipper5 = new AdvancedModelRenderer(this);
        this.leftFlipper5.setRotationPoint(1.5F, 0.0F, 5.0F);
        this.body1.addChild(leftFlipper5);
        this.leftFlipper5.cubeList.add(new ModelBox(leftFlipper5, 27, 24, -0.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.rightFlipper5 = new AdvancedModelRenderer(this);
        this.rightFlipper5.setRotationPoint(-1.5F, 0.0F, 5.0F);
        this.body1.addChild(rightFlipper5);
        this.rightFlipper5.cubeList.add(new ModelBox(rightFlipper5, 27, 24, -4.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 15, 15, -1.5F, -1.0F, 0.0F, 3, 2, 6, 0.01F, false));

        this.leftFlipper6 = new AdvancedModelRenderer(this);
        this.leftFlipper6.setRotationPoint(1.5F, 0.0F, 1.0F);
        this.body2.addChild(leftFlipper6);
        this.leftFlipper6.cubeList.add(new ModelBox(leftFlipper6, 27, 24, -0.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.rightFlipper6 = new AdvancedModelRenderer(this);
        this.rightFlipper6.setRotationPoint(-1.5F, 0.0F, 1.0F);
        this.body2.addChild(rightFlipper6);
        this.rightFlipper6.cubeList.add(new ModelBox(rightFlipper6, 27, 24, -4.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, true));

        this.leftFlipper7 = new AdvancedModelRenderer(this);
        this.leftFlipper7.setRotationPoint(1.5F, 0.0F, 3.0F);
        this.body2.addChild(leftFlipper7);
        this.leftFlipper7.cubeList.add(new ModelBox(leftFlipper7, 27, 24, -0.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.rightFlipper7 = new AdvancedModelRenderer(this);
        this.rightFlipper7.setRotationPoint(-1.5F, 0.0F, 3.0F);
        this.body2.addChild(rightFlipper7);
        this.rightFlipper7.cubeList.add(new ModelBox(rightFlipper7, 27, 24, -4.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, true));

        this.leftFlipper8 = new AdvancedModelRenderer(this);
        this.leftFlipper8.setRotationPoint(1.5F, 0.0F, 5.0F);
        this.body2.addChild(leftFlipper8);
        this.leftFlipper8.cubeList.add(new ModelBox(leftFlipper8, 27, 24, -0.75F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.rightFlipper8 = new AdvancedModelRenderer(this);
        this.rightFlipper8.setRotationPoint(-1.5F, 0.0F, 5.0F);
        this.body2.addChild(rightFlipper8);
        this.rightFlipper8.cubeList.add(new ModelBox(rightFlipper8, 27, 24, -4.25F, 0.0F, -1.0F, 5, 0, 2, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 11, -1.0F, -0.75F, 0.0F, 2, 1, 8, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -1.0F, -0.25F, 0.0F, 2, 1, 8, -0.01F, false));

        this.leftFlipper9 = new AdvancedModelRenderer(this);
        this.leftFlipper9.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.body3.addChild(leftFlipper9);
        this.leftFlipper9.cubeList.add(new ModelBox(leftFlipper9, 27, 24, -0.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.rightFlipper9 = new AdvancedModelRenderer(this);
        this.rightFlipper9.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.body3.addChild(rightFlipper9);
        this.rightFlipper9.cubeList.add(new ModelBox(rightFlipper9, 27, 24, -4.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, true));

        this.leftFlipper10 = new AdvancedModelRenderer(this);
        this.leftFlipper10.setRotationPoint(1.0F, 0.0F, 3.0F);
        this.body3.addChild(leftFlipper10);
        this.leftFlipper10.cubeList.add(new ModelBox(leftFlipper10, 28, 18, 0.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));

        this.rightFlipper10 = new AdvancedModelRenderer(this);
        this.rightFlipper10.setRotationPoint(-1.0F, 0.0F, 3.0F);
        this.body3.addChild(rightFlipper10);
        this.rightFlipper10.cubeList.add(new ModelBox(rightFlipper10, 28, 18, -4.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F, true));

        this.leftFlipper11 = new AdvancedModelRenderer(this);
        this.leftFlipper11.setRotationPoint(1.0F, 0.0F, 5.0F);
        this.body3.addChild(leftFlipper11);
        this.leftFlipper11.cubeList.add(new ModelBox(leftFlipper11, 17, 28, -0.75F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));

        this.rightFlipper11 = new AdvancedModelRenderer(this);
        this.rightFlipper11.setRotationPoint(-1.0F, 0.0F, 5.0F);
        this.body3.addChild(rightFlipper11);
        this.rightFlipper11.cubeList.add(new ModelBox(rightFlipper11, 17, 28, -3.25F, 0.0F, -1.0F, 4, 0, 2, 0.0F, true));

        this.leftFlipper12 = new AdvancedModelRenderer(this);
        this.leftFlipper12.setRotationPoint(1.0F, 0.0F, 6.5F);
        this.body3.addChild(leftFlipper12);
        this.leftFlipper12.cubeList.add(new ModelBox(leftFlipper12, 33, 33, -0.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightFlipper12 = new AdvancedModelRenderer(this);
        this.rightFlipper12.setRotationPoint(-1.0F, 0.0F, 6.5F);
        this.body3.addChild(rightFlipper12);
        this.rightFlipper12.cubeList.add(new ModelBox(rightFlipper12, 33, 33, -2.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leftFlipper13 = new AdvancedModelRenderer(this);
        this.leftFlipper13.setRotationPoint(1.0F, 0.0F, 7.5F);
        this.body3.addChild(leftFlipper13);
        this.leftFlipper13.cubeList.add(new ModelBox(leftFlipper13, 3, 11, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightFlipper13 = new AdvancedModelRenderer(this);
        this.rightFlipper13.setRotationPoint(-1.0F, 0.0F, 7.5F);
        this.body3.addChild(rightFlipper13);
        this.rightFlipper13.cubeList.add(new ModelBox(rightFlipper13, 3, 11, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body3.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 13, 4, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 21, -0.5F, 0.0F, 0.0F, 1, 0, 8, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Head.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Head, -0.2F, -0.2F, -0.2F);
        this.setRotateAngle(body1, 0.0F, 0.1F, 0.1F);
        this.setRotateAngle(body2, 0.0F, 0.1F, 0.1F);
        this.setRotateAngle(body3, 0.1F, -0.05F, 0.1F);
        this.setRotateAngle(tail1, 0.1F, -0.2F, 0.1F);
        this.setRotateAngle(tail2, 0.1F, -0.3F, 0.1F);
        this.setRotateAngle(leftAppendage1, -0.2F, -0.3F, 0.0F);
        this.setRotateAngle(rightAppendage1, -0.2F, 0.3F, 0.0F);
        this.Head.offsetX = 0.003F;
        this.Head.offsetZ = -0.01F;
        this.Head.offsetY = -0.1F;
        this.Head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.Head.offsetZ = 0.030F;
        this.Head.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Head.offsetY = 0.4F;
        this.Head.offsetX = 0.55F;
        this.Head.rotateAngleY = (float)Math.toRadians(200);
        this.Head.rotateAngleX = (float)Math.toRadians(8);
        this.Head.rotateAngleZ = (float)Math.toRadians(-8);
        this.Head.scaleChildren = true;
        float scaler = 0.5F;
        this.Head.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Head.render(f);
        //Reset rotations, positions and sizing:
        this.Head.setScale(1.0F, 1.0F, 1.0F);
        this.Head.scaleChildren = false;
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
        //this.head.offsetY = 1.18F;

        float speed = 0.4F * 0.2F;
        float tailVdegree = 0.25F * 0.2F;
        float tailHdegree = 0.4F;
        float tailSwing = 0.75F * 0.45F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.25F * 0.2F;
            tailVdegree = 0.1F;
            //tailHdegree = 0.6F * 0.2F;
            tailSwing = 0.6F * 0.2F;
        }
        if (!e.isInWater()) {
            speed = 0.7F * 0.2F;
        }


        AdvancedModelRenderer[] fishTail = {this.body1, this.body2, this.body3, this.tail1, this.tail2};
        AdvancedModelRenderer[] pincerL = {this.leftAppendage1, this.leftAppendage2, this.leftAppendage3};
        AdvancedModelRenderer[] pincerR = {this.rightAppendage1, this.rightAppendage2, this.rightAppendage3};

        this.chainWave(fishTail, speed, tailVdegree * 0.3f, -0.5F, f2, 0.7F);
        this.chainSwing(fishTail, speed, tailHdegree, -2.5, f2, tailSwing);

        this.chainSwing(pincerL, speed * 1.5F, -0.25F, 0.5F, f2, 0.5F);
        this.chainSwing(pincerR, speed *  1.5F, 0.25F, 0.5F, f2, 0.5F);
        this.swing(leftAppendageClaw1, speed * 1.5F, -0.7F, false, 0, 1.15F, f2, 0.5F);
        this.swing(rightAppendageClaw1, speed * 1.5F, 0.7F, false, 0, -1.15F, f2, 0.5F);
        this.swing(leftAppendageClaw2, speed * 1.5F, -0.7F, false, 0, 1.15F, f2, 0.5F);
        this.swing(rightAppendageClaw2, speed * 1.5F, 0.7F, false, 0, -1.15F, f2, 0.5F);
        this.swing(leftAppendageClaw3, speed * 1.5F, -0.7F, false, 0, 1.15F, f2, 0.5F);
        this.swing(rightAppendageClaw3, speed * 1.5F, 0.7F, false, 0, -1.15F, f2, 0.5F);

        float feedModifier = 1;
        if (f3 == 0.0) {
            feedModifier = 0.15F;
        }
        float degreeFin = 0.285F * feedModifier;
        this.flap(leftFlipper1, 0.5F, -degreeFin, false, 2.0F, -0.4F, f2, 0.7F);
        this.flap(rightFlipper1, 0.5F, degreeFin, false, 2.0F, 0.4F, f2, 0.7F);
        this.flap(leftFlipper2, 0.5F, -degreeFin, false, 2.5F, -0.4F, f2, 0.7F);
        this.flap(rightFlipper2, 0.5F, degreeFin, false, 2.5F, 0.4F, f2, 0.7F);
        this.flap(leftFlipper3, 0.5F, -degreeFin, false, 3.0F, -0.4F, f2, 0.7F);
        this.flap(rightFlipper3, 0.5F, degreeFin, false, 3.0F, 0.4F, f2, 0.7F);
        this.flap(leftFlipper4, 0.5F, -degreeFin, false, 3.5F, -0.4F, f2, 0.7F);
        this.flap(rightFlipper4, 0.5F, degreeFin, false, 3.5F, 0.4F, f2, 0.7F);
        this.flap(leftFlipper5, 0.5F, -degreeFin, false, 4.0F, -0.4F, f2, 0.7F);
        this.flap(rightFlipper5, 0.5F, degreeFin, false, 4.0F, 0.4F, f2, 0.7F);
        this.flap(leftFlipper6, 0.5F, -degreeFin, false, 4.5F, -0.4F, f2, 0.7F);
        this.flap(rightFlipper6, 0.5F, degreeFin, false, 4.5F, 0.4F, f2, 0.7F);
        this.flap(leftFlipper7, 0.5F, -degreeFin, false, 5.0F, -0.4F, f2, 0.7F);
        this.flap(rightFlipper7, 0.5F, degreeFin, false, 5.0F, 0.4F, f2, 0.7F);
        this.flap(leftFlipper8, 0.5F, -degreeFin, false, 5.5F, -0.4F, f2, 0.7F);
        this.flap(rightFlipper8, 0.5F, degreeFin, false, 5.5F, 0.4F, f2, 0.7F);
        this.flap(leftFlipper9, 0.5F, -degreeFin, false, 6.0F, -0.4F, f2, 0.7F);
        this.flap(rightFlipper9, 0.5F, degreeFin, false, 6.0F, 0.4F, f2, 0.7F);
        this.flap(leftFlipper10, 0.5F, -degreeFin, false, 6.5F, -0.4F, f2, 0.7F);
        this.flap(rightFlipper10, 0.5F, degreeFin, false, 6.5F, 0.4F, f2, 0.7F);
        this.flap(leftFlipper11, 0.5F, -degreeFin, false, 7.0F, -0.4F, f2, 0.7F);
        this.flap(rightFlipper11, 0.5F, degreeFin, false, 7.0F, 0.4F, f2, 0.7F);
        this.flap(leftFlipper12, 0.5F, -degreeFin, false, 8.0F, -0.4F, f2, 0.7F);
        this.flap(rightFlipper12, 0.5F, degreeFin, false, 8.0F, 0.4F, f2, 0.7F);
        this.flap(leftFlipper13, 0.5F, -degreeFin, false, 9.0F, -0.4F, f2, 0.7F);
        this.flap(rightFlipper13, 0.5F, degreeFin, false, 9.0F, 0.4F, f2, 0.7F);

        if (!e.isInWater()) {
            //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
            //this.Head.offsetY = 1.2F - 1.18F;
            this.bob(Head, -speed * 3F, 2F, false, f2, 1);
            this.chainWave(fishTail, speed * 4F, tailHdegree * 3F, -3, f2, 1);
            this.chainSwing(fishTail, speed * 4F, tailVdegree * 3F, -3, f2, 1);
        }

    }
}
