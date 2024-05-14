package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelCapinatator extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftTeeth;
    private final AdvancedModelRenderer lefttooth;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer lefttooth7;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer lefttooth2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer lefttooth3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer lefttooth4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer lefttooth5;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer lefttooth6;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer lefttooth8;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightTeeth;
    private final AdvancedModelRenderer righttooth;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer righttooth7;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer righttooth2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer righttooth3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer righttooth4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer righttooth5;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer righttooth6;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer righttooth8;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer leftFin;
    private final AdvancedModelRenderer rightFin;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer leftFin2;
    private final AdvancedModelRenderer rightFin2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer leftFin3;
    private final AdvancedModelRenderer rightFin3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer leftFin4;
    private final AdvancedModelRenderer rightFin4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer leftFin5;
    private final AdvancedModelRenderer rightFin5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer leftFin6;
    private final AdvancedModelRenderer rightFin6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer leftFin7;
    private final AdvancedModelRenderer rightFin7;
    private final AdvancedModelRenderer body8;

    public ModelCapinatator() {
        this.textureWidth = 45;
        this.textureHeight = 45;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 3.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 20, 5, -3.0F, -1.0F, -8.0F, 3, 1, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-1.5F, -1.0F, -7.5F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 20, 11, -1.0F, 0.0F, -3.0F, 2, 1, 3, 0.001F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.2F, -2.85F);
        this.neck.addChild(head);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, 0.0F, -1.575F, 1, 1, 1, -0.001F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 21, -1.5F, -0.025F, -2.275F, 3, 1, 2, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 10, -1.0F, -0.575F, -1.0F, 2, 1, 2, 0.01F, false));

        this.leftTeeth = new AdvancedModelRenderer(this);
        this.leftTeeth.setRotationPoint(1.5F, 0.9476F, -2.5403F);
        this.head.addChild(leftTeeth);


        this.lefttooth = new AdvancedModelRenderer(this);
        this.lefttooth.setRotationPoint(-1.0F, -0.2F, 0.575F);
        this.leftTeeth.addChild(lefttooth);
        this.setRotateAngle(lefttooth, -0.1128F, 0.3923F, -0.3891F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, -0.4476F, 2.5403F);
        this.lefttooth.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 6, 1.5F, 0.725F, -2.275F, 1, 2, 0, -0.001F, false));

        this.lefttooth7 = new AdvancedModelRenderer(this);
        this.lefttooth7.setRotationPoint(-1.175F, 0.275F, 0.575F);
        this.leftTeeth.addChild(lefttooth7);
        this.setRotateAngle(lefttooth7, -0.8781F, 0.4042F, -0.8458F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, -0.4476F, 2.5403F);
        this.lefttooth7.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 11, 1.5F, -0.025F, -2.275F, 1, 2, 0, -0.001F, false));

        this.lefttooth2 = new AdvancedModelRenderer(this);
        this.lefttooth2.setRotationPoint(-1.0F, -0.025F, 0.725F);
        this.leftTeeth.addChild(lefttooth2);
        this.setRotateAngle(lefttooth2, 0.0F, 0.0F, -0.5672F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, -0.4476F, 2.5403F);
        this.lefttooth2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 11, 1.5F, 0.9F, -2.275F, 1, 2, 0, -0.001F, false));

        this.lefttooth3 = new AdvancedModelRenderer(this);
        this.lefttooth3.setRotationPoint(-0.8F, -0.025F, 0.925F);
        this.leftTeeth.addChild(lefttooth3);
        this.setRotateAngle(lefttooth3, 0.0826F, -0.2188F, -0.4208F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -0.4476F, 2.5403F);
        this.lefttooth3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 0, 1.5F, 0.975F, -2.275F, 1, 2, 0, -0.001F, false));

        this.lefttooth4 = new AdvancedModelRenderer(this);
        this.lefttooth4.setRotationPoint(-1.0F, -0.25F, 1.175F);
        this.leftTeeth.addChild(lefttooth4);
        this.setRotateAngle(lefttooth4, 0.1309F, -0.3927F, -0.4363F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, -0.4476F, 2.5403F);
        this.lefttooth4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 10, 1.5F, 0.975F, -2.275F, 1, 2, 0, -0.001F, false));

        this.lefttooth5 = new AdvancedModelRenderer(this);
        this.lefttooth5.setRotationPoint(-1.0F, -0.625F, 1.375F);
        this.leftTeeth.addChild(lefttooth5);
        this.setRotateAngle(lefttooth5, 0.3054F, -0.5672F, -0.4363F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, -0.4476F, 2.5403F);
        this.lefttooth5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 3, 1.5F, 1.975F, -2.275F, 1, 1, 0, -0.001F, false));

        this.lefttooth6 = new AdvancedModelRenderer(this);
        this.lefttooth6.setRotationPoint(-0.925F, -0.3F, 1.1F);
        this.leftTeeth.addChild(lefttooth6);
        this.setRotateAngle(lefttooth6, 0.9902F, -0.7674F, -1.0639F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, -0.4476F, 2.5403F);
        this.lefttooth6.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 16, 1.5F, 0.975F, -2.275F, 1, 2, 0, -0.001F, false));

        this.lefttooth8 = new AdvancedModelRenderer(this);
        this.lefttooth8.setRotationPoint(-1.175F, -0.3F, 0.925F);
        this.leftTeeth.addChild(lefttooth8);
        this.setRotateAngle(lefttooth8, 1.4642F, -0.9208F, -1.6874F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5F, -0.4476F, 2.5403F);
        this.lefttooth8.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 6, 1.5F, 0.975F, -2.275F, 1, 2, 0, -0.001F, false));

        this.rightTeeth = new AdvancedModelRenderer(this);
        this.rightTeeth.setRotationPoint(-1.5F, 0.9476F, -2.5403F);
        this.head.addChild(rightTeeth);


        this.righttooth = new AdvancedModelRenderer(this);
        this.righttooth.setRotationPoint(1.0F, -0.2F, 0.575F);
        this.rightTeeth.addChild(righttooth);
        this.setRotateAngle(righttooth, -0.1128F, -0.3923F, 0.3891F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.5F, -0.4476F, 2.5403F);
        this.righttooth.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 6, -2.5F, 0.725F, -2.275F, 1, 2, 0, -0.001F, true));

        this.righttooth7 = new AdvancedModelRenderer(this);
        this.righttooth7.setRotationPoint(1.175F, 0.275F, 0.575F);
        this.rightTeeth.addChild(righttooth7);
        this.setRotateAngle(righttooth7, -0.8781F, -0.4042F, 0.8458F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.5F, -0.4476F, 2.5403F);
        this.righttooth7.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 11, -2.5F, -0.025F, -2.275F, 1, 2, 0, -0.001F, true));

        this.righttooth2 = new AdvancedModelRenderer(this);
        this.righttooth2.setRotationPoint(1.0F, -0.025F, 0.725F);
        this.rightTeeth.addChild(righttooth2);
        this.setRotateAngle(righttooth2, 0.0F, 0.0F, 0.5672F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.5F, -0.4476F, 2.5403F);
        this.righttooth2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 11, -2.5F, 0.9F, -2.275F, 1, 2, 0, -0.001F, true));

        this.righttooth3 = new AdvancedModelRenderer(this);
        this.righttooth3.setRotationPoint(0.8F, -0.025F, 0.925F);
        this.rightTeeth.addChild(righttooth3);
        this.setRotateAngle(righttooth3, 0.0826F, 0.2188F, 0.4208F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.5F, -0.4476F, 2.5403F);
        this.righttooth3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 0, -2.5F, 0.975F, -2.275F, 1, 2, 0, -0.001F, true));

        this.righttooth4 = new AdvancedModelRenderer(this);
        this.righttooth4.setRotationPoint(1.0F, -0.25F, 1.175F);
        this.rightTeeth.addChild(righttooth4);
        this.setRotateAngle(righttooth4, 0.1309F, 0.3927F, 0.4363F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.5F, -0.4476F, 2.5403F);
        this.righttooth4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 10, -2.5F, 0.975F, -2.275F, 1, 2, 0, -0.001F, true));

        this.righttooth5 = new AdvancedModelRenderer(this);
        this.righttooth5.setRotationPoint(1.0F, -0.625F, 1.375F);
        this.rightTeeth.addChild(righttooth5);
        this.setRotateAngle(righttooth5, 0.3054F, 0.5672F, 0.4363F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.5F, -0.4476F, 2.5403F);
        this.righttooth5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 3, -2.5F, 1.975F, -2.275F, 1, 1, 0, -0.001F, true));

        this.righttooth6 = new AdvancedModelRenderer(this);
        this.righttooth6.setRotationPoint(0.925F, -0.3F, 1.1F);
        this.rightTeeth.addChild(righttooth6);
        this.setRotateAngle(righttooth6, 0.9902F, 0.7674F, 1.0639F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.5F, -0.4476F, 2.5403F);
        this.righttooth6.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 16, -2.5F, 0.975F, -2.275F, 1, 2, 0, -0.001F, true));

        this.righttooth8 = new AdvancedModelRenderer(this);
        this.righttooth8.setRotationPoint(1.175F, -0.3F, 0.925F);
        this.rightTeeth.addChild(righttooth8);
        this.setRotateAngle(righttooth8, 1.4642F, 0.9208F, 1.6874F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.5F, -0.4476F, 2.5403F);
        this.righttooth8.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2182F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 12, 6, -2.5F, 0.975F, -2.275F, 1, 2, 0, -0.001F, true));

        this.leftFin = new AdvancedModelRenderer(this);
        this.leftFin.setRotationPoint(0.0F, -0.5F, -6.5F);
        this.body.addChild(leftFin);
        this.leftFin.cubeList.add(new ModelBox(leftFin, 20, 16, -1.25F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));

        this.rightFin = new AdvancedModelRenderer(this);
        this.rightFin.setRotationPoint(-3.0F, -0.5F, -6.5F);
        this.body.addChild(rightFin);
        this.rightFin.cubeList.add(new ModelBox(rightFin, 20, 16, -0.75F, 0.0F, -1.5F, 2, 0, 3, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-1.525F, -1.0F, -5.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 10, 18, -1.475F, 0.0F, 0.0F, 3, 1, 3, 0.001F, false));

        this.leftFin2 = new AdvancedModelRenderer(this);
        this.leftFin2.setRotationPoint(1.525F, 0.475F, 1.5F);
        this.body2.addChild(leftFin2);
        this.leftFin2.cubeList.add(new ModelBox(leftFin2, 16, 24, -0.75F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));

        this.rightFin2 = new AdvancedModelRenderer(this);
        this.rightFin2.setRotationPoint(-1.475F, 0.475F, 1.5F);
        this.body2.addChild(rightFin2);
        this.rightFin2.cubeList.add(new ModelBox(rightFin2, 16, 24, -1.25F, 0.0F, -1.5F, 2, 0, 3, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.025F, 0.0F, 2.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 16, 0, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.leftFin3 = new AdvancedModelRenderer(this);
        this.leftFin3.setRotationPoint(1.5F, 0.5F, 1.5F);
        this.body3.addChild(leftFin3);
        this.leftFin3.cubeList.add(new ModelBox(leftFin3, 8, 23, 0.0F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));

        this.rightFin3 = new AdvancedModelRenderer(this);
        this.rightFin3.setRotationPoint(-1.5F, 0.5F, 1.5F);
        this.body3.addChild(rightFin3);
        this.rightFin3.cubeList.add(new ModelBox(rightFin3, 8, 23, -2.0F, 0.0F, -1.5F, 2, 0, 3, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(-0.025F, 0.0F, 2.5F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 16, -1.475F, 0.0F, 0.0F, 3, 1, 3, 0.001F, false));

        this.leftFin4 = new AdvancedModelRenderer(this);
        this.leftFin4.setRotationPoint(1.525F, 0.475F, 1.5F);
        this.body4.addChild(leftFin4);
        this.leftFin4.cubeList.add(new ModelBox(leftFin4, 0, 6, -1.5F, 0.0F, -1.5F, 4, 0, 3, 0.0F, false));

        this.rightFin4 = new AdvancedModelRenderer(this);
        this.rightFin4.setRotationPoint(-1.475F, 0.475F, 1.5F);
        this.body4.addChild(rightFin4);
        this.rightFin4.cubeList.add(new ModelBox(rightFin4, 0, 6, -2.5F, 0.0F, -1.5F, 4, 0, 3, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 10, 13, -1.475F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.leftFin5 = new AdvancedModelRenderer(this);
        this.leftFin5.setRotationPoint(1.475F, 0.5F, 1.5F);
        this.body5.addChild(leftFin5);
        this.leftFin5.cubeList.add(new ModelBox(leftFin5, 0, 25, 0.0F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));

        this.rightFin5 = new AdvancedModelRenderer(this);
        this.rightFin5.setRotationPoint(-1.425F, 0.5F, 1.5F);
        this.body5.addChild(rightFin5);
        this.rightFin5.cubeList.add(new ModelBox(rightFin5, 0, 25, -2.0F, 0.0F, -1.5F, 2, 0, 3, 0.0F, true));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 10, -0.975F, 0.0F, 0.0F, 2, 1, 4, -0.001F, false));

        this.leftFin6 = new AdvancedModelRenderer(this);
        this.leftFin6.setRotationPoint(1.025F, 0.475F, 2.0F);
        this.body6.addChild(leftFin6);
        this.leftFin6.cubeList.add(new ModelBox(leftFin6, 11, 6, -0.25F, 0.0F, -2.0F, 2, 0, 4, 0.0F, false));

        this.rightFin6 = new AdvancedModelRenderer(this);
        this.rightFin6.setRotationPoint(-0.975F, 0.475F, 2.0F);
        this.body6.addChild(rightFin6);
        this.rightFin6.cubeList.add(new ModelBox(rightFin6, 11, 6, -1.75F, 0.0F, -2.0F, 2, 0, 4, 0.0F, true));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.025F, 0.0F, 3.5F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 8, 27, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.leftFin7 = new AdvancedModelRenderer(this);
        this.leftFin7.setRotationPoint(0.5F, 0.5F, 1.5F);
        this.body7.addChild(leftFin7);
        this.leftFin7.cubeList.add(new ModelBox(leftFin7, 20, 20, -0.75F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));

        this.rightFin7 = new AdvancedModelRenderer(this);
        this.rightFin7.setRotationPoint(-0.5F, 0.5F, 1.5F);
        this.body7.addChild(rightFin7);
        this.rightFin7.cubeList.add(new ModelBox(rightFin7, 20, 20, -1.25F, 0.0F, -1.5F, 2, 0, 3, 0.0F, true));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 24, 25, -0.5F, 0.0F, 0.0F, 1, 1, 3, -0.001F, false));
        this.body8.cubeList.add(new ModelBox(body8, 0, 0, -2.5F, 0.5F, 0.0F, 5, 0, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, 0.1F, 0.0F, 0.05F);
        this.setRotateAngle(body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body6, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body7, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body8, 0.0F, -0.2F, 0.0F);
        this.root.offsetX = -0.01F;
        this.root.offsetZ = -0.03F;
        this.root.offsetY = -0.05F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = 0.4F;
        this.root.offsetX = 0.55F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 0.5F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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

        float speed = 0.5F * 0.2F;
        float tailVdegree = 0.25F * 0.2F;
        float tailHdegree = 0.0F * 0.2F;
        float tailSwing = 0.75F * 0.2F;


        if (!e.isInWater()) {
            speed = 0.7F * 0.2F;
        }


        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8};
        AdvancedModelRenderer[] bodyF = {this.body,this.neck,this.head};
        AdvancedModelRenderer[] teethL = {this.lefttooth7, this.lefttooth, this.lefttooth2, this.lefttooth3, this.lefttooth4, this.lefttooth5, this.lefttooth6, this.lefttooth8};
        AdvancedModelRenderer[] teethR = {this.righttooth7, this.righttooth, this.righttooth2, this.righttooth3, this.righttooth4, this.righttooth5, this.righttooth6, this.righttooth8};

        this.chainWave(fishTail, speed, tailVdegree * 0.3f, -0.5F, f2, 0.5F);
        this.chainSwing(fishTail, speed, tailHdegree, -2.5, f2, tailSwing);

        this.chainFlap(teethL, speed * 3F, -0.3F, 1, f2, 1F);
        this.chainFlap(teethR, speed *  3F, 0.3F, 1, f2, 1F);

        float feedModifier = 1;
        if (f3 == 0.0) {
            feedModifier = 0.15F;
        }
        this.chainWave(fishTail, 0.2F, tailHdegree * 3F, -3, f2, 1);
        this.chainSwing(fishTail, 0.2F, tailVdegree * 3F, -3, f2, 1);
        float degreeFin = 0.285F;
        this.chainSwing(bodyF, 0.2F, 0.1F, -3, f2, 1.0F);
        this.flap(leftFin, 0.3F, -degreeFin, false, 2.0F, -0.4F, f2, 0.7F);
        this.flap(rightFin, 0.3F, degreeFin, false, 2.0F, 0.4F, f2, 0.7F);
        this.flap(leftFin2, 0.3F, -degreeFin, false, 2.5F, -0.4F, f2, 0.7F);
        this.flap(rightFin2, 0.3F, degreeFin, false, 2.5F, 0.4F, f2, 0.7F);
        this.flap(leftFin3, 0.3F, -degreeFin, false, 3.0F, -0.4F, f2, 0.7F);
        this.flap(rightFin3, 0.3F, degreeFin, false, 3.0F, 0.4F, f2, 0.7F);
        this.flap(leftFin4, 0.3F, -degreeFin, false, 3.5F, -0.4F, f2, 0.7F);
        this.flap(rightFin4, 0.3F, degreeFin, false, 3.5F, 0.4F, f2, 0.7F);
        this.flap(leftFin5, 0.3F, -degreeFin, false, 4.0F, -0.4F, f2, 0.7F);
        this.flap(rightFin5, 0.3F, degreeFin, false, 4.0F, 0.4F, f2, 0.7F);
        this.flap(leftFin6, 0.3F, -degreeFin, false, 4.5F, -0.4F, f2, 0.7F);
        this.flap(rightFin6, 0.3F, degreeFin, false, 4.5F, 0.4F, f2, 0.7F);
        this.flap(leftFin7, 0.3F, -degreeFin, false, 5.0F, -0.4F, f2, 0.7F);
        this.flap(rightFin7, 0.3F, degreeFin, false, 5.0F, 0.4F, f2, 0.7F);




        if (!e.isInWater()) {
            //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
            //this.root.offsetY = 1.2F - 1.18F;
            this.bob(root, -speed * 3F, 2F, false, f2, 1);
            this.chainWave(fishTail, speed * 4F, tailHdegree * 3F, -3, f2, 1);
            this.chainSwing(fishTail, speed * 4F, tailVdegree * 3F, -3, f2, 1);
        }

    }
}
