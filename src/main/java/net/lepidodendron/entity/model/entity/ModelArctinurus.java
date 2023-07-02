package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelArctinurus extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer wing_r1;
    private final AdvancedModelRenderer wing_r2;
    private final AdvancedModelRenderer wing_r3;
    private final AdvancedModelRenderer wing_r4;
    private final AdvancedModelRenderer wing_r5;
    private final AdvancedModelRenderer wing_r6;
    private final AdvancedModelRenderer wing_r7;
    private final AdvancedModelRenderer wing_r8;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Lleg1;
    private final AdvancedModelRenderer Rleg1;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Lleg9;
    private final AdvancedModelRenderer Rleg9;
    private final AdvancedModelRenderer Rleg8;
    private final AdvancedModelRenderer Lleg8;
    private final AdvancedModelRenderer Lleg6;
    private final AdvancedModelRenderer Rleg6;
    private final AdvancedModelRenderer Rleg5;
    private final AdvancedModelRenderer Lleg5;
    private final AdvancedModelRenderer Lleg4;
    private final AdvancedModelRenderer Rleg4;
    private final AdvancedModelRenderer Lleg3;
    private final AdvancedModelRenderer Rleg3;
    private final AdvancedModelRenderer Lleg2;
    private final AdvancedModelRenderer Rleg2;

    public ModelArctinurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 22.75F, -2.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 33, 3, -2.0F, -1.26F, -5.0F, 4, 1, 5, 0.1F, false));
        this.head.cubeList.add(new ModelBox(head, 30, 34, -1.5F, -2.01F, -4.0F, 3, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -1.5F, 2.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.1745F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 40, 0.3F, -0.49F, -5.0F, 2, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 20, -1.5F, -3.26F, -5.25F, 3, 1, 3, 0.01F, false));

        this.wing_r1 = new AdvancedModelRenderer(this);
        this.wing_r1.setRotationPoint(2.0F, -1.25F, -5.0F);
        this.head.addChild(wing_r1);
        this.setRotateAngle(wing_r1, 0.0F, -0.2618F, 0.1745F);
        this.wing_r1.cubeList.add(new ModelBox(wing_r1, 10, 45, 0.0F, -0.01F, 0.0F, 4, 1, 1, -0.01F, false));

        this.wing_r2 = new AdvancedModelRenderer(this);
        this.wing_r2.setRotationPoint(2.0F, -1.25F, -5.0F);
        this.head.addChild(wing_r2);
        this.setRotateAngle(wing_r2, 0.0F, -0.7854F, 0.1745F);
        this.wing_r2.cubeList.add(new ModelBox(wing_r2, 0, 45, 3.4504F, -0.01F, -1.9963F, 4, 1, 1, -0.01F, false));

        this.wing_r3 = new AdvancedModelRenderer(this);
        this.wing_r3.setRotationPoint(2.0F, -1.25F, -5.0F);
        this.head.addChild(wing_r3);
        this.setRotateAngle(wing_r3, 0.0F, -1.2654F, 0.1745F);
        this.wing_r3.cubeList.add(new ModelBox(wing_r3, 0, 0, 5.6726F, -0.01F, -5.2075F, 1, 1, 1, -0.01F, false));

        this.wing_r4 = new AdvancedModelRenderer(this);
        this.wing_r4.setRotationPoint(2.0F, -1.25F, 7.0F);
        this.head.addChild(wing_r4);
        this.setRotateAngle(wing_r4, 0.0F, 0.0F, 0.1745F);
        this.wing_r4.cubeList.add(new ModelBox(wing_r4, 0, 15, 0.0F, -0.01F, -12.0F, 7, 1, 5, 0.0F, false));

        this.wing_r5 = new AdvancedModelRenderer(this);
        this.wing_r5.setRotationPoint(-2.0F, -1.25F, -5.0F);
        this.head.addChild(wing_r5);
        this.setRotateAngle(wing_r5, 0.0F, 0.2618F, -0.1745F);
        this.wing_r5.cubeList.add(new ModelBox(wing_r5, 30, 45, -4.0F, -0.01F, 0.0F, 4, 1, 1, -0.01F, false));

        this.wing_r6 = new AdvancedModelRenderer(this);
        this.wing_r6.setRotationPoint(-2.0F, -1.25F, -5.0F);
        this.head.addChild(wing_r6);
        this.setRotateAngle(wing_r6, 0.0F, 0.7854F, -0.1745F);
        this.wing_r6.cubeList.add(new ModelBox(wing_r6, 20, 45, -7.4504F, -0.01F, -1.9963F, 4, 1, 1, -0.01F, false));

        this.wing_r7 = new AdvancedModelRenderer(this);
        this.wing_r7.setRotationPoint(-2.0F, -1.25F, -5.0F);
        this.head.addChild(wing_r7);
        this.setRotateAngle(wing_r7, 0.0F, 1.2654F, -0.1745F);
        this.wing_r7.cubeList.add(new ModelBox(wing_r7, 0, 2, -6.6726F, -0.01F, -5.2075F, 1, 1, 1, -0.01F, false));

        this.wing_r8 = new AdvancedModelRenderer(this);
        this.wing_r8.setRotationPoint(-2.0F, -1.25F, 7.0F);
        this.head.addChild(wing_r8);
        this.setRotateAngle(wing_r8, 0.0F, 0.0F, -0.1745F);
        this.wing_r8.cubeList.add(new ModelBox(wing_r8, 19, 10, -7.0F, -0.01F, -12.0F, 7, 1, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -1.5F, 2.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.1745F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 41, -2.3F, -0.49F, -5.0F, 2, 1, 3, 0.0F, false));

        this.Lleg1 = new AdvancedModelRenderer(this);
        this.Lleg1.setRotationPoint(1.9527F, 0.0308F, -1.0F);
        this.head.addChild(Lleg1);
        this.setRotateAngle(Lleg1, 0.0F, 0.0F, 0.1745F);
        this.Lleg1.cubeList.add(new ModelBox(Lleg1, 45, 3, 0.0412F, -0.0285F, -0.5F, 6, 0, 1, 0.0F, false));

        this.Rleg1 = new AdvancedModelRenderer(this);
        this.Rleg1.setRotationPoint(-1.9527F, 0.0308F, -1.0F);
        this.head.addChild(Rleg1);
        this.setRotateAngle(Rleg1, 0.0F, 0.0F, -0.1745F);
        this.Rleg1.cubeList.add(new ModelBox(Rleg1, 51, 0, -6.0412F, -0.0285F, -0.5F, 6, 0, 1, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-1.0F, 0.0F, -5.0F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.3491F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 31, 29, -6.0F, -0.19F, -5.0F, 6, 0, 5, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(1.0F, 0.0F, -5.0F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.3491F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 31, 24, 0.0F, -0.19F, -5.0F, 6, 0, 5, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.head.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 12, 40, -2.5F, -0.51F, 0.01F, 5, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.0F, 1.5F, 2.0F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.2182F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 16, -6.5F, -1.26F, -2.0F, 8, 0, 4, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.0F, 1.5F, 2.0F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.2182F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 31, 16, -1.5F, -1.26F, -2.0F, 8, 0, 4, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 28, 39, -2.49F, -0.5F, 0.01F, 5, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.0F, 1.5F, 0.0F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.2182F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 29, -6.51F, -1.15F, 0.0F, 8, 0, 4, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.0F, 1.5F, 0.0F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.2182F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 29, -1.49F, -1.15F, 0.0F, 8, 0, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 38, 9, -2.5F, -0.51F, 0.01F, 5, 2, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.0F, 1.5F, -2.0F);
        this.body4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.2182F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 28, -6.5F, -1.06F, 2.0F, 8, 0, 4, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(3.0F, 1.5F, -2.0F);
        this.body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.2182F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 28, -1.5F, -1.06F, 2.0F, 8, 0, 4, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 37, -2.5F, -0.51F, 0.01F, 5, 2, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.0F, 1.5F, -2.0F);
        this.body5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.2182F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 25, -6.5F, -0.96F, 2.0F, 8, 0, 4, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(3.0F, 1.5F, -2.0F);
        this.body5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.2182F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 25, -1.5F, -0.96F, 2.0F, 8, 0, 4, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 16, 36, -2.5F, -0.51F, 0.01F, 5, 2, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.0F, 1.5F, -2.0F);
        this.body6.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.2182F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 24, -6.5F, -0.86F, 2.0F, 8, 0, 4, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(3.0F, 1.5F, -2.0F);
        this.body6.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.2182F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 24, -1.5F, -0.86F, 2.0F, 8, 0, 4, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 1.5F, 2.5F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 40, 34, -2.0F, -2.01F, -0.49F, 4, 2, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-3.0F, 0.0F, -2.5F);
        this.body7.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.2182F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 33, -5.5F, -0.76F, 2.0F, 7, 0, 4, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(3.0F, 0.0F, -2.5F);
        this.body7.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.2182F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 33, -1.5F, -0.76F, 2.0F, 7, 0, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.0F, 1.5F);
        this.body7.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 24, 0, -1.5F, -1.01F, -0.25F, 3, 2, 2, -0.02F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -0.5F, -0.185F, 1.5F, 1, 0, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-3.0F, 1.0F, -4.0F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.2182F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -4.3F, -0.66F, 3.0F, 7, 0, 8, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(3.0F, 1.0F, -4.0F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.2182F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -2.7F, -0.66F, 3.0F, 7, 0, 8, 0.0F, false));

        this.Lleg9 = new AdvancedModelRenderer(this);
        this.Lleg9.setRotationPoint(0.9451F, 1.1176F, 1.0F);
        this.tail.addChild(Lleg9);
        this.setRotateAngle(Lleg9, 0.0F, 0.0F, 0.1745F);
        this.Lleg9.cubeList.add(new ModelBox(Lleg9, 29, 44, 0.0337F, -0.1154F, -0.5F, 7, 0, 1, 0.0F, false));

        this.Rleg9 = new AdvancedModelRenderer(this);
        this.Rleg9.setRotationPoint(-0.9451F, 1.1176F, 1.0F);
        this.tail.addChild(Rleg9);
        this.setRotateAngle(Rleg9, 0.0F, 0.0F, -0.1745F);
        this.Rleg9.cubeList.add(new ModelBox(Rleg9, 42, 15, -7.0337F, -0.1154F, -0.5F, 7, 0, 1, 0.0F, false));

        this.Rleg8 = new AdvancedModelRenderer(this);
        this.Rleg8.setRotationPoint(-1.9451F, 0.1176F, 0.5F);
        this.body7.addChild(Rleg8);
        this.setRotateAngle(Rleg8, 0.0F, 0.0F, -0.1745F);
        this.Rleg8.cubeList.add(new ModelBox(Rleg8, 42, 15, -7.0337F, -0.1154F, -0.5F, 7, 0, 1, 0.0F, false));

        this.Lleg8 = new AdvancedModelRenderer(this);
        this.Lleg8.setRotationPoint(1.9451F, 0.1176F, 0.5F);
        this.body7.addChild(Lleg8);
        this.setRotateAngle(Lleg8, 0.0F, 0.0F, 0.1745F);
        this.Lleg8.cubeList.add(new ModelBox(Lleg8, 29, 44, 0.0337F, -0.1154F, -0.5F, 7, 0, 1, 0.0F, false));

        this.Lleg6 = new AdvancedModelRenderer(this);
        this.Lleg6.setRotationPoint(1.9451F, 1.6176F, 1.0F);
        this.body6.addChild(Lleg6);
        this.setRotateAngle(Lleg6, 0.0F, 0.0F, 0.1745F);
        this.Lleg6.cubeList.add(new ModelBox(Lleg6, 29, 44, 0.0337F, -0.1154F, -0.5F, 7, 0, 1, 0.0F, false));

        this.Rleg6 = new AdvancedModelRenderer(this);
        this.Rleg6.setRotationPoint(-1.9451F, 1.6176F, 1.0F);
        this.body6.addChild(Rleg6);
        this.setRotateAngle(Rleg6, 0.0F, 0.0F, -0.1745F);
        this.Rleg6.cubeList.add(new ModelBox(Rleg6, 42, 15, -7.0337F, -0.1154F, -0.5F, 7, 0, 1, 0.0F, false));

        this.Rleg5 = new AdvancedModelRenderer(this);
        this.Rleg5.setRotationPoint(-1.9451F, 1.6176F, 1.0F);
        this.body5.addChild(Rleg5);
        this.setRotateAngle(Rleg5, 0.0F, 0.0F, -0.1745F);
        this.Rleg5.cubeList.add(new ModelBox(Rleg5, 42, 15, -7.0337F, -0.1154F, -0.5F, 7, 0, 1, 0.0F, false));

        this.Lleg5 = new AdvancedModelRenderer(this);
        this.Lleg5.setRotationPoint(1.9451F, 1.6176F, 1.0F);
        this.body5.addChild(Lleg5);
        this.setRotateAngle(Lleg5, 0.0F, 0.0F, 0.1745F);
        this.Lleg5.cubeList.add(new ModelBox(Lleg5, 29, 44, 0.0337F, -0.1154F, -0.5F, 7, 0, 1, 0.0F, false));

        this.Lleg4 = new AdvancedModelRenderer(this);
        this.Lleg4.setRotationPoint(1.9451F, 1.6176F, 1.0F);
        this.body4.addChild(Lleg4);
        this.setRotateAngle(Lleg4, 0.0F, 0.0F, 0.1745F);
        this.Lleg4.cubeList.add(new ModelBox(Lleg4, 29, 44, 0.0337F, -0.1154F, -0.5F, 7, 0, 1, 0.0F, false));

        this.Rleg4 = new AdvancedModelRenderer(this);
        this.Rleg4.setRotationPoint(-1.9451F, 1.6176F, 1.0F);
        this.body4.addChild(Rleg4);
        this.setRotateAngle(Rleg4, 0.0F, 0.0F, -0.1745F);
        this.Rleg4.cubeList.add(new ModelBox(Rleg4, 42, 15, -7.0337F, -0.1154F, -0.5F, 7, 0, 1, 0.0F, false));

        this.Lleg3 = new AdvancedModelRenderer(this);
        this.Lleg3.setRotationPoint(1.9451F, 1.6176F, 1.0F);
        this.body3.addChild(Lleg3);
        this.setRotateAngle(Lleg3, 0.0F, 0.0F, 0.1745F);
        this.Lleg3.cubeList.add(new ModelBox(Lleg3, 29, 44, 0.0337F, -0.1154F, -0.5F, 7, 0, 1, 0.0F, false));

        this.Rleg3 = new AdvancedModelRenderer(this);
        this.Rleg3.setRotationPoint(-1.9451F, 1.6176F, 1.0F);
        this.body3.addChild(Rleg3);
        this.setRotateAngle(Rleg3, 0.0F, 0.0F, -0.1745F);
        this.Rleg3.cubeList.add(new ModelBox(Rleg3, 42, 15, -7.0337F, -0.1154F, -0.5F, 7, 0, 1, 0.0F, false));

        this.Lleg2 = new AdvancedModelRenderer(this);
        this.Lleg2.setRotationPoint(1.9451F, 1.6176F, 1.0F);
        this.body2.addChild(Lleg2);
        this.setRotateAngle(Lleg2, 0.0F, 0.0F, 0.1745F);
        this.Lleg2.cubeList.add(new ModelBox(Lleg2, 29, 44, 0.0337F, -0.1154F, -0.5F, 7, 0, 1, 0.0F, false));

        this.Rleg2 = new AdvancedModelRenderer(this);
        this.Rleg2.setRotationPoint(-1.9451F, 1.6176F, 1.0F);
        this.body2.addChild(Rleg2);
        this.setRotateAngle(Rleg2, 0.0F, 0.0F, -0.1745F);
        this.Rleg2.cubeList.add(new ModelBox(Rleg2, 42, 15, -7.0337F, -0.1154F, -0.5F, 7, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.3F);
    }

    public void renderStatic(float f) {
       //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.offsetZ = -0.3F;
        this.body.render(0.037F);
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.body.offsetZ = -0.1F;
        this.body.offsetY = 1.05F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.Lleg1, this.Lleg2, this.Lleg3, this.Lleg4, this.Lleg5, this.Lleg6, this.Lleg8, this.Lleg9};
        AdvancedModelRenderer[] legsR = {this.Rleg1, this.Rleg2, this.Rleg3, this.Rleg4, this.Rleg5, this.Rleg6, this.Rleg8, this.Rleg9};
        AdvancedModelRenderer[] bodyF = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.tail};

        float weight = -0.5F;

        if (isAtBottom) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
            this.flap(Lleg1, 0.5F, -0.5F, false, 0, -weight, f2, 0.3F);
            this.flap(Rleg1, 0.5F, 0.5F, false, 0, weight, f2, 0.3F);
            this.flap(Lleg2, 0.5F, -0.5F, false, 1.0F, -weight, f2, 0.3F);
            this.flap(Rleg2, 0.5F, 0.5F, false, 1.0F, weight, f2, 0.3F);
            this.flap(Lleg3, 0.5F, -0.5F, false, 2.0F, -weight, f2, 0.3F);
            this.flap(Rleg3, 0.5F, 0.5F, false, 2.0F, weight, f2, 0.3F);
            this.flap(Lleg4, 0.5F, -0.5F, false, 3.0F, -weight, f2, 0.3F);
            this.flap(Rleg4, 0.5F, 0.5F, false, 3.0F, weight, f2, 0.3F);
            this.flap(Lleg5, 0.5F, -0.5F, false, 4.0F, -weight, f2, 0.3F);
            this.flap(Rleg5, 0.5F, 0.5F, false, 4.0F, weight, f2, 0.3F);
            this.flap(Lleg6, 0.5F, -0.5F, false, 5.0F, -weight, f2, 0.3F);
            this.flap(Rleg6, 0.5F, 0.5F, false, 5.0F, weight, f2, 0.3F);
            this.flap(Lleg8, 0.5F, -0.5F, false, 6.0F, -weight, f2, 0.3F);
            this.flap(Rleg8, 0.5F, 0.5F, false, 6.0F, weight, f2, 0.3F);
            this.flap(Lleg9, 0.5F, -0.5F, false, 7.0F, -weight, f2, 0.3F);
            this.flap(Rleg9, 0.5F, 0.5F, false, 7.0F, weight, f2, 0.3F);

            if (f3 != 0) {
                this.chainSwing(bodyF, 0.1F, 0.06F, -3, f2, 1.0F);
            }

            this.bob(body, 0.0F, 0.0F, false, f2, 1);
        } else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
            this.flap(Lleg1, 0.2F, -0.5F, false, 0, -weight, f2, 0.3F);
            this.flap(Rleg1, 0.2F, 0.5F, false, 0, weight, f2, 0.3F);
            this.flap(Lleg2, 0.2F, -0.5F, false, 1.0F, -weight, f2, 0.3F);
            this.flap(Rleg2, 0.2F, 0.5F, false, 1.0F, weight, f2, 0.3F);
            this.flap(Lleg3, 0.2F, -0.5F, false, 2.0F, -weight, f2, 0.3F);
            this.flap(Rleg3, 0.2F, 0.5F, false, 2.0F, weight, f2, 0.3F);
            this.flap(Lleg4, 0.2F, -0.5F, false, 3.0F, -weight, f2, 0.3F);
            this.flap(Rleg4, 0.2F, 0.5F, false, 3.0F, weight, f2, 0.3F);
            this.flap(Lleg5, 0.2F, -0.5F, false, 4.0F, -weight, f2, 0.3F);
            this.flap(Rleg5, 0.2F, 0.5F, false, 4.0F, weight, f2, 0.3F);
            this.flap(Lleg6, 0.2F, -0.5F, false, 5.0F, -weight, f2, 0.3F);
            this.flap(Rleg6, 0.2F, 0.5F, false, 5.0F, weight, f2, 0.3F);
            this.flap(Lleg8, 0.2F, -0.5F, false, 6.0F, -weight, f2, 0.3F);
            this.flap(Rleg8, 0.2F, 0.5F, false, 6.0F, weight, f2, 0.3F);
            this.flap(Lleg9, 0.2F, -0.5F, false, 7.0F, -weight, f2, 0.3F);
            this.flap(Rleg9, 0.2F, 0.5F, false, 7.0F, weight, f2, 0.3F);
            if (f3 != 0) {
                this.chainSwing(bodyF, 0.2F, 0.03F, -3, f2, 0.5F);
                this.chainWave(bodyF, 0.5F, 0.05f, -3, f2, 0.8F);
            }
            this.bob(body, 0.2F, 0.15F, false, f2, 1);
        }

        this.swing(antennaL, 0.3F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.3F, 0.2F, false, 0, 0.1F, f2, 0.8F);

    }
}
