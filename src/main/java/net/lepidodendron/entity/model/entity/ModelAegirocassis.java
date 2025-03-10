package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAegirocassis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer Helement_shell;
    private final AdvancedModelRenderer Helement_R_r1;
    private final AdvancedModelRenderer Helement_L_r1;
    private final AdvancedModelRenderer PelementL;
    private final AdvancedModelRenderer PelementL2_r1;
    private final AdvancedModelRenderer PelementL1_r1;
    private final AdvancedModelRenderer PelementR;
    private final AdvancedModelRenderer PelementR2_r1;
    private final AdvancedModelRenderer PelementR1_r1;
    private final AdvancedModelRenderer headbase;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer appendageR;
    private final AdvancedModelRenderer shaftR;
    private final AdvancedModelRenderer shaftR2;
    private final AdvancedModelRenderer shaftR3;
    private final AdvancedModelRenderer shaftR4;
    private final AdvancedModelRenderer shaftR5;
    private final AdvancedModelRenderer appendageL;
    private final AdvancedModelRenderer shaftL;
    private final AdvancedModelRenderer shaftL2;
    private final AdvancedModelRenderer shaftL3;
    private final AdvancedModelRenderer shaftL4;
    private final AdvancedModelRenderer shaftL5;
    private final AdvancedModelRenderer segments;
    private final AdvancedModelRenderer segment1;
    private final AdvancedModelRenderer finupperL;
    private final AdvancedModelRenderer finupperR;
    private final AdvancedModelRenderer finlowerL;
    private final AdvancedModelRenderer finlowerR;
    private final AdvancedModelRenderer segment2;
    private final AdvancedModelRenderer finlowerR2;
    private final AdvancedModelRenderer finupperR2;
    private final AdvancedModelRenderer finupperL2;
    private final AdvancedModelRenderer finlowerL2;
    private final AdvancedModelRenderer segment3;
    private final AdvancedModelRenderer finupperL3;
    private final AdvancedModelRenderer finupperR3;
    private final AdvancedModelRenderer finlowerL3;
    private final AdvancedModelRenderer finlowerR3;
    private final AdvancedModelRenderer segment4;
    private final AdvancedModelRenderer finupperR4;
    private final AdvancedModelRenderer finupperL4;
    private final AdvancedModelRenderer finlowerL4;
    private final AdvancedModelRenderer finlowerR4;
    private final AdvancedModelRenderer segment5;
    private final AdvancedModelRenderer finupperR5;
    private final AdvancedModelRenderer finlowerR5;
    private final AdvancedModelRenderer finupperL5;
    private final AdvancedModelRenderer finlowerL5;
    private final AdvancedModelRenderer segment6;
    private final AdvancedModelRenderer finlowerR6;
    private final AdvancedModelRenderer finupperR6;
    private final AdvancedModelRenderer finupperL6;
    private final AdvancedModelRenderer finlowerL6;
    private final AdvancedModelRenderer segment7;
    private final AdvancedModelRenderer finupperL7;
    private final AdvancedModelRenderer finupperR7;
    private final AdvancedModelRenderer finlowerL7;
    private final AdvancedModelRenderer finlowerR7;
    private final AdvancedModelRenderer segment8;
    private final AdvancedModelRenderer finupperL8;
    private final AdvancedModelRenderer finlowerL8;
    private final AdvancedModelRenderer finupperR8;
    private final AdvancedModelRenderer finlowerR8;
    private final AdvancedModelRenderer segment9;
    private final AdvancedModelRenderer finlowerR9;
    private final AdvancedModelRenderer finlowerL9;
    private final AdvancedModelRenderer finupperR9;
    private final AdvancedModelRenderer finupperL9;
    private final AdvancedModelRenderer segment10;
    private final AdvancedModelRenderer finupperL10;
    private final AdvancedModelRenderer finupperR10;
    private final AdvancedModelRenderer finlowerL10;
    private final AdvancedModelRenderer finlowerR10;
    private final AdvancedModelRenderer segment11;

    public ModelAegirocassis() {
        this.textureWidth = 95;
        this.textureHeight = 95;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -9.0F, 0.0F);
        this.body.addChild(head);


        this.Helement_shell = new AdvancedModelRenderer(this);
        this.Helement_shell.setRotationPoint(0.0F, -3.25F, 0.0F);
        this.head.addChild(Helement_shell);
        this.Helement_shell.cubeList.add(new ModelBox(Helement_shell, 0, 38, 6.75F, 2.0F, -13.25F, 0, 3, 12, 0.0F, false));
        this.Helement_shell.cubeList.add(new ModelBox(Helement_shell, 18, 20, -6.75F, 2.0F, -13.25F, 0, 3, 12, 0.0F, false));

        this.Helement_R_r1 = new AdvancedModelRenderer(this);
        this.Helement_R_r1.setRotationPoint(0.0F, 12.25F, 0.0F);
        this.Helement_shell.addChild(Helement_R_r1);
        this.setRotateAngle(Helement_R_r1, 0.0F, 0.0F, -0.5236F);
        this.Helement_R_r1.cubeList.add(new ModelBox(Helement_R_r1, 0, 0, -0.89F, -12.25F, -30.0F, 8, 0, 30, 0.0F, false));

        this.Helement_L_r1 = new AdvancedModelRenderer(this);
        this.Helement_L_r1.setRotationPoint(0.0F, 12.25F, 0.0F);
        this.Helement_shell.addChild(Helement_L_r1);
        this.setRotateAngle(Helement_L_r1, 0.0F, 0.0F, 0.5236F);
        this.Helement_L_r1.cubeList.add(new ModelBox(Helement_L_r1, 16, 16, -7.11F, -12.25F, -30.0F, 8, 0, 30, 0.0F, false));

        this.PelementL = new AdvancedModelRenderer(this);
        this.PelementL.setRotationPoint(4.0F, 1.0F, -7.0F);
        this.head.addChild(PelementL);


        this.PelementL2_r1 = new AdvancedModelRenderer(this);
        this.PelementL2_r1.setRotationPoint(-4.0F, 8.0F, 7.0F);
        this.PelementL.addChild(PelementL2_r1);
        this.setRotateAngle(PelementL2_r1, 0.0F, 0.0F, 0.2618F);
        this.PelementL2_r1.cubeList.add(new ModelBox(PelementL2_r1, 0, 16, 1.0F, -9.25F, -13.251F, 3, 4, 12, 0.0F, false));

        this.PelementL1_r1 = new AdvancedModelRenderer(this);
        this.PelementL1_r1.setRotationPoint(-4.0F, 8.75F, 7.0F);
        this.PelementL.addChild(PelementL1_r1);
        this.setRotateAngle(PelementL1_r1, 0.0F, 0.0F, -0.2618F);
        this.PelementL1_r1.cubeList.add(new ModelBox(PelementL1_r1, 18, 35, 5.25F, -9.75F, -13.25F, 3, 3, 12, 0.0F, false));

        this.PelementR = new AdvancedModelRenderer(this);
        this.PelementR.setRotationPoint(-4.0F, 1.0F, -7.0F);
        this.head.addChild(PelementR);


        this.PelementR2_r1 = new AdvancedModelRenderer(this);
        this.PelementR2_r1.setRotationPoint(4.0F, 8.5F, 7.0F);
        this.PelementR.addChild(PelementR2_r1);
        this.setRotateAngle(PelementR2_r1, 0.0F, 0.0F, -0.2618F);
        this.PelementR2_r1.cubeList.add(new ModelBox(PelementR2_r1, 0, 0, -4.0F, -9.75F, -13.251F, 3, 4, 12, 0.0F, false));

        this.PelementR1_r1 = new AdvancedModelRenderer(this);
        this.PelementR1_r1.setRotationPoint(4.0F, 8.5F, 7.0F);
        this.PelementR.addChild(PelementR1_r1);
        this.setRotateAngle(PelementR1_r1, 0.0F, 0.0F, 0.2618F);
        this.PelementR1_r1.cubeList.add(new ModelBox(PelementR1_r1, 0, 32, -8.25F, -9.5F, -13.25F, 3, 3, 12, 0.0F, false));

        this.headbase = new AdvancedModelRenderer(this);
        this.headbase.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.head.addChild(headbase);
        this.headbase.cubeList.add(new ModelBox(headbase, 46, 0, -3.0F, -1.0F, -13.0F, 6, 4, 7, 0.0F, false));
        this.headbase.cubeList.add(new ModelBox(headbase, 42, 46, -4.5F, -1.0F, -6.0F, 9, 4, 6, 0.0F, false));
        this.headbase.cubeList.add(new ModelBox(headbase, 0, 0, -1.5F, 3.0F, -12.0F, 3, 1, 3, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(4.5F, 0.5F, -0.5F);
        this.headbase.addChild(eyeL);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 65, 0, -0.5F, -1.0F, -0.5F, 3, 2, 1, 0.0F, false));
        this.eyeL.cubeList.add(new ModelBox(eyeL, 66, 48, 2.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-4.5F, 0.5F, -0.5F);
        this.headbase.addChild(eyeR);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 18, 0, -2.5F, -1.0F, -0.5F, 3, 2, 1, 0.0F, false));
        this.eyeR.cubeList.add(new ModelBox(eyeR, 66, 44, -3.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.appendageR = new AdvancedModelRenderer(this);
        this.appendageR.setRotationPoint(-2.0F, 1.0F, -13.0F);
        this.headbase.addChild(appendageR);
        this.appendageR.cubeList.add(new ModelBox(appendageR, 6, 77, -1.5F, 1.0F, -1.0F, 3, 4, 0, 0.0F, false));
        this.appendageR.cubeList.add(new ModelBox(appendageR, 62, 35, -1.5F, -1.0F, -7.0F, 2, 2, 7, 0.0F, false));

        this.shaftR = new AdvancedModelRenderer(this);
        this.shaftR.setRotationPoint(-1.0F, 1.0F, -6.0F);
        this.appendageR.addChild(shaftR);
        this.shaftR.cubeList.add(new ModelBox(shaftR, 6, 73, -0.5F, 0.0F, 0.0F, 3, 8, 0, 0.0F, false));

        this.shaftR2 = new AdvancedModelRenderer(this);
        this.shaftR2.setRotationPoint(-1.0F, 1.0F, -5.0F);
        this.appendageR.addChild(shaftR2);
        this.shaftR2.cubeList.add(new ModelBox(shaftR2, 6, 73, -0.5F, 0.0F, 0.0F, 3, 8, 0, 0.0F, false));

        this.shaftR3 = new AdvancedModelRenderer(this);
        this.shaftR3.setRotationPoint(-1.0F, 1.0F, -4.0F);
        this.appendageR.addChild(shaftR3);
        this.shaftR3.cubeList.add(new ModelBox(shaftR3, 6, 73, -0.5F, 0.0F, 0.0F, 3, 8, 0, 0.0F, false));

        this.shaftR4 = new AdvancedModelRenderer(this);
        this.shaftR4.setRotationPoint(-1.0F, 1.0F, -3.0F);
        this.appendageR.addChild(shaftR4);
        this.shaftR4.cubeList.add(new ModelBox(shaftR4, 6, 73, -0.5F, 0.0F, 0.0F, 3, 8, 0, 0.0F, false));

        this.shaftR5 = new AdvancedModelRenderer(this);
        this.shaftR5.setRotationPoint(-1.0F, 1.0F, -2.0F);
        this.appendageR.addChild(shaftR5);
        this.shaftR5.cubeList.add(new ModelBox(shaftR5, 6, 73, -0.5F, 0.0F, 0.0F, 3, 8, 0, 0.0F, false));

        this.appendageL = new AdvancedModelRenderer(this);
        this.appendageL.setRotationPoint(2.0F, 1.0F, -13.0F);
        this.headbase.addChild(appendageL);
        this.appendageL.cubeList.add(new ModelBox(appendageL, 0, 77, -1.5F, 1.0F, -1.0F, 3, 4, 0, 0.0F, false));
        this.appendageL.cubeList.add(new ModelBox(appendageL, 19, 64, -0.5F, -1.0F, -7.0F, 2, 2, 7, 0.0F, false));

        this.shaftL = new AdvancedModelRenderer(this);
        this.shaftL.setRotationPoint(1.0F, 1.0F, -6.0F);
        this.appendageL.addChild(shaftL);
        this.shaftL.cubeList.add(new ModelBox(shaftL, 0, 73, -2.5F, 0.0F, 0.0F, 3, 8, 0, 0.0F, false));

        this.shaftL2 = new AdvancedModelRenderer(this);
        this.shaftL2.setRotationPoint(1.0F, 1.0F, -5.0F);
        this.appendageL.addChild(shaftL2);
        this.shaftL2.cubeList.add(new ModelBox(shaftL2, 0, 73, -2.5F, 0.0F, 0.0F, 3, 8, 0, 0.0F, false));

        this.shaftL3 = new AdvancedModelRenderer(this);
        this.shaftL3.setRotationPoint(1.0F, 1.0F, -4.0F);
        this.appendageL.addChild(shaftL3);
        this.shaftL3.cubeList.add(new ModelBox(shaftL3, 0, 73, -2.5F, 0.0F, 0.0F, 3, 8, 0, 0.0F, false));

        this.shaftL4 = new AdvancedModelRenderer(this);
        this.shaftL4.setRotationPoint(1.0F, 1.0F, -3.0F);
        this.appendageL.addChild(shaftL4);
        this.shaftL4.cubeList.add(new ModelBox(shaftL4, 0, 73, -2.5F, 0.0F, 0.0F, 3, 8, 0, 0.0F, false));

        this.shaftL5 = new AdvancedModelRenderer(this);
        this.shaftL5.setRotationPoint(1.0F, 1.0F, -2.0F);
        this.appendageL.addChild(shaftL5);
        this.shaftL5.cubeList.add(new ModelBox(shaftL5, 0, 73, -2.5F, 0.0F, 0.0F, 3, 8, 0, 0.0F, false));

        this.segments = new AdvancedModelRenderer(this);
        this.segments.setRotationPoint(0.0F, -10.0F, 0.0F);
        this.body.addChild(segments);


        this.segment1 = new AdvancedModelRenderer(this);
        this.segment1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.segments.addChild(segment1);
        this.segment1.cubeList.add(new ModelBox(segment1, 0, 61, -5.0F, -2.0F, 0.0F, 10, 5, 3, 0.0F, false));

        this.finupperL = new AdvancedModelRenderer(this);
        this.finupperL.setRotationPoint(5.0F, -2.0F, 1.0F);
        this.segment1.addChild(finupperL);
        this.setRotateAngle(finupperL, 0.0F, 0.0F, 0.7854F);
        this.finupperL.cubeList.add(new ModelBox(finupperL, 12, 66, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finupperR = new AdvancedModelRenderer(this);
        this.finupperR.setRotationPoint(-5.0F, -2.0F, 1.0F);
        this.segment1.addChild(finupperR);
        this.setRotateAngle(finupperR, 0.0F, 0.0F, -0.7854F);
        this.finupperR.cubeList.add(new ModelBox(finupperR, 46, 0, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finlowerL = new AdvancedModelRenderer(this);
        this.finlowerL.setRotationPoint(5.0F, 3.0F, 1.0F);
        this.segment1.addChild(finlowerL);
        this.setRotateAngle(finlowerL, 0.0F, 0.0F, -0.7854F);
        this.finlowerL.cubeList.add(new ModelBox(finlowerL, 6, 33, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finlowerR = new AdvancedModelRenderer(this);
        this.finlowerR.setRotationPoint(-5.0F, 3.0F, 1.0F);
        this.segment1.addChild(finlowerR);
        this.setRotateAngle(finlowerR, 0.0F, 0.0F, 0.7854F);
        this.finlowerR.cubeList.add(new ModelBox(finlowerR, 24, 0, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.segment2 = new AdvancedModelRenderer(this);
        this.segment2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment1.addChild(segment2);
        this.segment2.cubeList.add(new ModelBox(segment2, 52, 56, -5.0F, -2.01F, 0.0F, 10, 5, 3, 0.0F, false));

        this.finlowerR2 = new AdvancedModelRenderer(this);
        this.finlowerR2.setRotationPoint(-5.0F, 3.0F, 1.0F);
        this.segment2.addChild(finlowerR2);
        this.setRotateAngle(finlowerR2, 0.0F, 0.0F, 0.7854F);
        this.finlowerR2.cubeList.add(new ModelBox(finlowerR2, 18, 21, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finupperR2 = new AdvancedModelRenderer(this);
        this.finupperR2.setRotationPoint(-5.0F, -2.0F, 1.0F);
        this.segment2.addChild(finupperR2);
        this.setRotateAngle(finupperR2, 0.0F, 0.0F, -0.7854F);
        this.finupperR2.cubeList.add(new ModelBox(finupperR2, 36, 40, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finupperL2 = new AdvancedModelRenderer(this);
        this.finupperL2.setRotationPoint(5.0F, -2.0F, 1.0F);
        this.segment2.addChild(finupperL2);
        this.setRotateAngle(finupperL2, 0.0F, 0.0F, 0.7854F);
        this.finupperL2.cubeList.add(new ModelBox(finupperL2, 6, 66, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finlowerL2 = new AdvancedModelRenderer(this);
        this.finlowerL2.setRotationPoint(5.0F, 3.0F, 1.0F);
        this.segment2.addChild(finlowerL2);
        this.setRotateAngle(finlowerL2, 0.0F, 0.0F, -0.7854F);
        this.finlowerL2.cubeList.add(new ModelBox(finlowerL2, 0, 33, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.segment3 = new AdvancedModelRenderer(this);
        this.segment3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment2.addChild(segment3);
        this.segment3.cubeList.add(new ModelBox(segment3, 26, 56, -5.0F, -2.0F, 0.0F, 10, 5, 3, 0.0F, false));

        this.finupperL3 = new AdvancedModelRenderer(this);
        this.finupperL3.setRotationPoint(5.0F, -2.0F, 1.0F);
        this.segment3.addChild(finupperL3);
        this.setRotateAngle(finupperL3, 0.0F, 0.0F, 0.7854F);
        this.finupperL3.cubeList.add(new ModelBox(finupperL3, 0, 66, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finupperR3 = new AdvancedModelRenderer(this);
        this.finupperR3.setRotationPoint(-5.0F, -2.0F, 1.0F);
        this.segment3.addChild(finupperR3);
        this.setRotateAngle(finupperR3, 0.0F, 0.0F, -0.7854F);
        this.finupperR3.cubeList.add(new ModelBox(finupperR3, 6, 37, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finlowerL3 = new AdvancedModelRenderer(this);
        this.finlowerL3.setRotationPoint(5.0F, 3.0F, 1.0F);
        this.segment3.addChild(finlowerL3);
        this.setRotateAngle(finlowerL3, 0.0F, 0.0F, -0.7854F);
        this.finlowerL3.cubeList.add(new ModelBox(finlowerL3, 24, 32, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finlowerR3 = new AdvancedModelRenderer(this);
        this.finlowerR3.setRotationPoint(-5.0F, 3.0F, 1.0F);
        this.segment3.addChild(finlowerR3);
        this.setRotateAngle(finlowerR3, 0.0F, 0.0F, 0.7854F);
        this.finlowerR3.cubeList.add(new ModelBox(finlowerR3, 6, 21, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.segment4 = new AdvancedModelRenderer(this);
        this.segment4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment3.addChild(segment4);
        this.segment4.cubeList.add(new ModelBox(segment4, 0, 53, -5.0F, -2.01F, 0.0F, 10, 5, 3, 0.0F, false));

        this.finupperR4 = new AdvancedModelRenderer(this);
        this.finupperR4.setRotationPoint(-5.0F, -2.0F, 1.0F);
        this.segment4.addChild(finupperR4);
        this.setRotateAngle(finupperR4, 0.0F, 0.0F, -0.7854F);
        this.finupperR4.cubeList.add(new ModelBox(finupperR4, 0, 37, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finupperL4 = new AdvancedModelRenderer(this);
        this.finupperL4.setRotationPoint(5.0F, -2.0F, 1.0F);
        this.segment4.addChild(finupperL4);
        this.setRotateAngle(finupperL4, 0.0F, 0.0F, 0.7854F);
        this.finupperL4.cubeList.add(new ModelBox(finupperL4, 65, 0, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finlowerL4 = new AdvancedModelRenderer(this);
        this.finlowerL4.setRotationPoint(5.0F, 3.0F, 1.0F);
        this.segment4.addChild(finlowerL4);
        this.setRotateAngle(finlowerL4, 0.0F, 0.0F, -0.7854F);
        this.finlowerL4.cubeList.add(new ModelBox(finlowerL4, 18, 32, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finlowerR4 = new AdvancedModelRenderer(this);
        this.finlowerR4.setRotationPoint(-5.0F, 3.0F, 1.0F);
        this.segment4.addChild(finlowerR4);
        this.setRotateAngle(finlowerR4, 0.0F, 0.0F, 0.7854F);
        this.finlowerR4.cubeList.add(new ModelBox(finlowerR4, 0, 21, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.segment5 = new AdvancedModelRenderer(this);
        this.segment5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment4.addChild(segment5);
        this.segment5.cubeList.add(new ModelBox(segment5, 62, 19, -4.5F, -2.0F, 0.0F, 9, 5, 3, 0.0F, false));

        this.finupperR5 = new AdvancedModelRenderer(this);
        this.finupperR5.setRotationPoint(-4.5F, -2.0F, 1.0F);
        this.segment5.addChild(finupperR5);
        this.setRotateAngle(finupperR5, 0.0F, 0.0F, -0.7854F);
        this.finupperR5.cubeList.add(new ModelBox(finupperR5, 36, 32, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finlowerR5 = new AdvancedModelRenderer(this);
        this.finlowerR5.setRotationPoint(-4.5F, 3.0F, 1.0F);
        this.segment5.addChild(finlowerR5);
        this.setRotateAngle(finlowerR5, 0.0F, 0.0F, 0.7854F);
        this.finlowerR5.cubeList.add(new ModelBox(finlowerR5, 18, 4, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finupperL5 = new AdvancedModelRenderer(this);
        this.finupperL5.setRotationPoint(4.5F, -2.0F, 1.0F);
        this.segment5.addChild(finupperL5);
        this.setRotateAngle(finupperL5, 0.0F, 0.0F, 0.7854F);
        this.finupperL5.cubeList.add(new ModelBox(finupperL5, 62, 32, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finlowerL5 = new AdvancedModelRenderer(this);
        this.finlowerL5.setRotationPoint(4.5F, 3.0F, 1.0F);
        this.segment5.addChild(finlowerL5);
        this.setRotateAngle(finlowerL5, 0.0F, 0.0F, -0.7854F);
        this.finlowerL5.cubeList.add(new ModelBox(finlowerL5, 6, 29, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.segment6 = new AdvancedModelRenderer(this);
        this.segment6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment5.addChild(segment6);
        this.segment6.cubeList.add(new ModelBox(segment6, 62, 11, -4.5F, -2.01F, 0.0F, 9, 5, 3, 0.0F, false));

        this.finlowerR6 = new AdvancedModelRenderer(this);
        this.finlowerR6.setRotationPoint(-4.5F, 3.0F, 1.0F);
        this.segment6.addChild(finlowerR6);
        this.setRotateAngle(finlowerR6, 0.0F, 0.0F, 0.7854F);
        this.finlowerR6.cubeList.add(new ModelBox(finlowerR6, 18, 0, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finupperR6 = new AdvancedModelRenderer(this);
        this.finupperR6.setRotationPoint(-4.5F, -2.0F, 1.0F);
        this.segment6.addChild(finupperR6);
        this.setRotateAngle(finupperR6, 0.0F, 0.0F, -0.7854F);
        this.finupperR6.cubeList.add(new ModelBox(finupperR6, 36, 36, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finupperL6 = new AdvancedModelRenderer(this);
        this.finupperL6.setRotationPoint(4.5F, -2.0F, 1.0F);
        this.segment6.addChild(finupperL6);
        this.setRotateAngle(finupperL6, 0.0F, 0.0F, 0.7854F);
        this.finupperL6.cubeList.add(new ModelBox(finupperL6, 36, 47, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finlowerL6 = new AdvancedModelRenderer(this);
        this.finlowerL6.setRotationPoint(4.5F, 3.0F, 1.0F);
        this.segment6.addChild(finlowerL6);
        this.setRotateAngle(finlowerL6, 0.0F, 0.0F, -0.7854F);
        this.finlowerL6.cubeList.add(new ModelBox(finlowerL6, 0, 29, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.segment7 = new AdvancedModelRenderer(this);
        this.segment7.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment6.addChild(segment7);
        this.segment7.cubeList.add(new ModelBox(segment7, 62, 27, -4.0F, -2.0F, 0.0F, 8, 5, 3, 0.0F, false));

        this.finupperL7 = new AdvancedModelRenderer(this);
        this.finupperL7.setRotationPoint(4.0F, -2.0F, 1.0F);
        this.segment7.addChild(finupperL7);
        this.setRotateAngle(finupperL7, 0.0F, 0.0F, 0.7854F);
        this.finupperL7.cubeList.add(new ModelBox(finupperL7, 30, 47, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finupperR7 = new AdvancedModelRenderer(this);
        this.finupperR7.setRotationPoint(-4.0F, -2.0F, 1.0F);
        this.segment7.addChild(finupperR7);
        this.setRotateAngle(finupperR7, 0.0F, 0.0F, -0.7854F);
        this.finupperR7.cubeList.add(new ModelBox(finupperR7, 24, 36, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finlowerL7 = new AdvancedModelRenderer(this);
        this.finlowerL7.setRotationPoint(4.0F, 3.0F, 1.0F);
        this.segment7.addChild(finlowerL7);
        this.setRotateAngle(finlowerL7, 0.0F, 0.0F, -0.7854F);
        this.finlowerL7.cubeList.add(new ModelBox(finlowerL7, 24, 21, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finlowerR7 = new AdvancedModelRenderer(this);
        this.finlowerR7.setRotationPoint(-4.0F, 3.0F, 1.0F);
        this.segment7.addChild(finlowerR7);
        this.setRotateAngle(finlowerR7, 0.0F, 0.0F, 0.7854F);
        this.finlowerR7.cubeList.add(new ModelBox(finlowerR7, 6, 5, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.segment8 = new AdvancedModelRenderer(this);
        this.segment8.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment7.addChild(segment8);
        this.segment8.cubeList.add(new ModelBox(segment8, 30, 64, -3.5F, -1.5F, 0.0F, 7, 4, 3, 0.0F, false));

        this.finupperL8 = new AdvancedModelRenderer(this);
        this.finupperL8.setRotationPoint(3.5F, -1.5F, 1.0F);
        this.segment8.addChild(finupperL8);
        this.setRotateAngle(finupperL8, 0.0F, 0.0F, 0.7854F);
        this.finupperL8.cubeList.add(new ModelBox(finupperL8, 24, 47, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finlowerL8 = new AdvancedModelRenderer(this);
        this.finlowerL8.setRotationPoint(3.5F, 2.5F, 1.0F);
        this.segment8.addChild(finlowerL8);
        this.setRotateAngle(finlowerL8, 0.0F, 0.0F, -0.7854F);
        this.finlowerL8.cubeList.add(new ModelBox(finlowerL8, 24, 4, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finupperR8 = new AdvancedModelRenderer(this);
        this.finupperR8.setRotationPoint(-3.5F, -1.5F, 1.0F);
        this.segment8.addChild(finupperR8);
        this.setRotateAngle(finupperR8, 0.0F, 0.0F, -0.7854F);
        this.finupperR8.cubeList.add(new ModelBox(finupperR8, 18, 36, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finlowerR8 = new AdvancedModelRenderer(this);
        this.finlowerR8.setRotationPoint(-3.25F, 2.5F, 1.0F);
        this.segment8.addChild(finlowerR8);
        this.setRotateAngle(finlowerR8, 0.0F, 0.0F, 0.7854F);
        this.finlowerR8.cubeList.add(new ModelBox(finlowerR8, 0, 5, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.segment9 = new AdvancedModelRenderer(this);
        this.segment9.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment8.addChild(segment9);
        this.segment9.cubeList.add(new ModelBox(segment9, 50, 64, -3.0F, -1.5F, 0.0F, 6, 4, 3, 0.0F, false));

        this.finlowerR9 = new AdvancedModelRenderer(this);
        this.finlowerR9.setRotationPoint(-3.0F, 2.5F, 1.0F);
        this.segment9.addChild(finlowerR9);
        this.setRotateAngle(finlowerR9, 0.0F, 0.0F, 0.7854F);
        this.finlowerR9.cubeList.add(new ModelBox(finlowerR9, 0, 44, 0.0F, 0.0F, -1.0F, 0, 3, 3, 0.0F, false));

        this.finlowerL9 = new AdvancedModelRenderer(this);
        this.finlowerL9.setRotationPoint(3.0F, 2.5F, 1.0F);
        this.segment9.addChild(finlowerL9);
        this.setRotateAngle(finlowerL9, 0.0F, 0.0F, -0.7854F);
        this.finlowerL9.cubeList.add(new ModelBox(finlowerL9, 6, 44, 0.0F, 0.0F, -1.0F, 0, 3, 3, 0.0F, false));

        this.finupperR9 = new AdvancedModelRenderer(this);
        this.finupperR9.setRotationPoint(-3.0F, -1.5F, 1.0F);
        this.segment9.addChild(finupperR9);
        this.setRotateAngle(finupperR9, 0.0F, 0.0F, -0.7854F);
        this.finupperR9.cubeList.add(new ModelBox(finupperR9, 12, 44, 0.0F, -3.0F, -1.0F, 0, 3, 3, 0.0F, false));

        this.finupperL9 = new AdvancedModelRenderer(this);
        this.finupperL9.setRotationPoint(3.0F, -1.5F, 1.0F);
        this.segment9.addChild(finupperL9);
        this.setRotateAngle(finupperL9, 0.0F, 0.0F, 0.7854F);
        this.finupperL9.cubeList.add(new ModelBox(finupperL9, 49, 53, 0.0F, -3.0F, -1.0F, 0, 3, 3, 0.0F, false));

        this.segment10 = new AdvancedModelRenderer(this);
        this.segment10.setRotationPoint(0.0F, 0.5F, 3.0F);
        this.segment9.addChild(segment10);
        this.segment10.cubeList.add(new ModelBox(segment10, 46, 11, -2.5F, -1.5F, 0.0F, 5, 3, 2, 0.0F, false));

        this.finupperL10 = new AdvancedModelRenderer(this);
        this.finupperL10.setRotationPoint(2.5F, -1.5F, 1.0F);
        this.segment10.addChild(finupperL10);
        this.setRotateAngle(finupperL10, 0.0F, 0.0F, 0.7854F);
        this.finupperL10.cubeList.add(new ModelBox(finupperL10, 42, 34, 0.0F, -3.0F, -1.0F, 0, 3, 2, 0.0F, false));

        this.finupperR10 = new AdvancedModelRenderer(this);
        this.finupperR10.setRotationPoint(-2.5F, -1.5F, 1.0F);
        this.segment10.addChild(finupperR10);
        this.setRotateAngle(finupperR10, 0.0F, 0.0F, -0.7854F);
        this.finupperR10.cubeList.add(new ModelBox(finupperR10, 42, 31, 0.0F, -3.0F, -1.0F, 0, 3, 2, 0.0F, false));

        this.finlowerL10 = new AdvancedModelRenderer(this);
        this.finlowerL10.setRotationPoint(2.5F, 1.5F, 1.0F);
        this.segment10.addChild(finlowerL10);
        this.setRotateAngle(finlowerL10, 0.0F, 0.0F, -0.7854F);
        this.finlowerL10.cubeList.add(new ModelBox(finlowerL10, 42, 28, 0.0F, 0.0F, -1.0F, 0, 3, 2, 0.0F, false));

        this.finlowerR10 = new AdvancedModelRenderer(this);
        this.finlowerR10.setRotationPoint(-2.5F, 1.5F, 1.0F);
        this.segment10.addChild(finlowerR10);
        this.setRotateAngle(finlowerR10, 0.0F, 0.0F, 0.7854F);
        this.finlowerR10.cubeList.add(new ModelBox(finlowerR10, 42, 42, 0.0F, 0.0F, -1.0F, 0, 3, 2, 0.0F, false));

        this.segment11 = new AdvancedModelRenderer(this);
        this.segment11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment10.addChild(segment11);
        this.segment11.cubeList.add(new ModelBox(segment11, 0, 4, -2.0F, -1.0F, 0.0F, 4, 2, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetX = -0F;
        this.body.offsetZ = 0.02F;
        this.body.offsetY = -0.15F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.1329F, (float) Math.toRadians(90), -0.4024F);
        this.setRotateAngle(Helement_R_r1, 0.0F, 0.0F, -0.5236F);
        this.setRotateAngle(Helement_L_r1, 0.0F, 0.0F, 0.5236F);
        this.setRotateAngle(PelementL2_r1, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(PelementL1_r1, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(PelementR2_r1, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(PelementR1_r1, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(finupperL, 0.0F, 0.0F, 0.4363F);
        this.setRotateAngle(finupperR, 0.0F, 0.0F, -0.4363F);
        this.setRotateAngle(finlowerL, 0.0F, 0.0F, -0.4363F);
        this.setRotateAngle(finlowerR, 0.0F, 0.0F, 0.4363F);
        this.setRotateAngle(segment2, 0.0437F, 0.0436F, 0.0019F);
        this.setRotateAngle(finlowerR2, 0.0F, 0.0F, 0.5236F);
        this.setRotateAngle(finupperR2, 0.0F, 0.0F, -0.5672F);
        this.setRotateAngle(finupperL2, 0.0F, 0.0F, 0.5672F);
        this.setRotateAngle(finlowerL2, 0.0F, 0.0F, -0.6109F);
        this.setRotateAngle(segment3, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(finupperL3, 0.0F, 0.0F, 0.7854F);
        this.setRotateAngle(finupperR3, 0.0F, 0.0F, -0.7854F);
        this.setRotateAngle(finlowerL3, 0.0F, 0.0F, -0.6109F);
        this.setRotateAngle(finlowerR3, 0.0F, 0.0F, 0.6109F);
        this.setRotateAngle(segment4, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(finupperR4, 0.0F, 0.0F, -0.9599F);
        this.setRotateAngle(finupperL4, 0.0F, 0.0F, 0.9599F);
        this.setRotateAngle(finlowerL4, 0.0F, 0.0F, -0.7854F);
        this.setRotateAngle(finlowerR4, 0.0F, 0.0F, 0.7854F);
        this.setRotateAngle(segment5, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(finupperR5, 0.0F, 0.0F, -1.2217F);
        this.setRotateAngle(finlowerR5, 0.0F, 0.0F, 0.9599F);
        this.setRotateAngle(finupperL5, 0.0F, 0.0F, 1.2217F);
        this.setRotateAngle(finlowerL5, 0.0F, 0.0F, -0.9599F);
        this.setRotateAngle(segment6, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(finlowerR6, 0.0F, 0.0F, 1.2217F);
        this.setRotateAngle(finupperR6, 0.0F, 0.0F, -1.0472F);
        this.setRotateAngle(finupperL6, 0.0F, 0.0F, 1.0472F);
        this.setRotateAngle(finlowerL6, 0.0F, 0.0F, -1.2217F);
        this.setRotateAngle(segment7, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(finupperL7, 0.0F, 0.0F, 0.7854F);
        this.setRotateAngle(finupperR7, 0.0F, 0.0F, -0.7854F);
        this.setRotateAngle(finlowerL7, 0.0F, 0.0F, -1.4399F);
        this.setRotateAngle(finlowerR7, 0.0F, 0.0F, 1.4399F);
        this.setRotateAngle(segment8, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(finupperL8, 0.0F, 0.0F, 0.6545F);
        this.setRotateAngle(finlowerL8, 0.0F, 0.0F, -1.3963F);
        this.setRotateAngle(finupperR8, 0.0F, 0.0F, -0.6545F);
        this.setRotateAngle(finlowerR8, 0.0F, 0.0F, 1.3963F);
        this.setRotateAngle(segment9, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(finlowerR9, 0.0F, 0.0F, 1.2217F);
        this.setRotateAngle(finlowerL9, 0.0F, 0.0F, -1.2217F);
        this.setRotateAngle(finupperR9, 0.0F, 0.0F, -0.5236F);
        this.setRotateAngle(finupperL9, 0.0F, 0.0F, 0.5236F);
        this.setRotateAngle(segment10, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(finupperL10, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(finupperR10, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(finlowerL10, 0.0F, 0.0F, -0.7854F);
        this.setRotateAngle(finlowerR10, 0.0F, 0.0F, 0.7854F);
        this.setRotateAngle(segment11, 0.0F, 0.0873F, 0.0F);
        this.body.offsetY = -0.4F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(body, -0.1329F, (float) Math.toRadians(90), 0.1024F);
        this.setRotateAngle(Helement_R_r1, 0.0F, 0.0F, -0.5236F);
        this.setRotateAngle(Helement_L_r1, 0.0F, 0.0F, 0.5236F);
        this.setRotateAngle(PelementL2_r1, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(PelementL1_r1, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(PelementR2_r1, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(PelementR1_r1, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(finupperL, 0.0F, 0.0F, 0.4363F);
        this.setRotateAngle(finupperR, 0.0F, 0.0F, -0.4363F);
        this.setRotateAngle(finlowerL, 0.0F, 0.0F, -0.4363F);
        this.setRotateAngle(finlowerR, 0.0F, 0.0F, 0.4363F);
        this.setRotateAngle(segment2, 0.0437F, 0.0436F, 0.0019F);
        this.setRotateAngle(finlowerR2, 0.0F, 0.0F, 0.5236F);
        this.setRotateAngle(finupperR2, 0.0F, 0.0F, -0.5672F);
        this.setRotateAngle(finupperL2, 0.0F, 0.0F, 0.5672F);
        this.setRotateAngle(finlowerL2, 0.0F, 0.0F, -0.6109F);
        this.setRotateAngle(segment3, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(finupperL3, 0.0F, 0.0F, 0.7854F);
        this.setRotateAngle(finupperR3, 0.0F, 0.0F, -0.7854F);
        this.setRotateAngle(finlowerL3, 0.0F, 0.0F, -0.6109F);
        this.setRotateAngle(finlowerR3, 0.0F, 0.0F, 0.6109F);
        this.setRotateAngle(segment4, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(finupperR4, 0.0F, 0.0F, -0.9599F);
        this.setRotateAngle(finupperL4, 0.0F, 0.0F, 0.9599F);
        this.setRotateAngle(finlowerL4, 0.0F, 0.0F, -0.7854F);
        this.setRotateAngle(finlowerR4, 0.0F, 0.0F, 0.7854F);
        this.setRotateAngle(segment5, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(finupperR5, 0.0F, 0.0F, -1.2217F);
        this.setRotateAngle(finlowerR5, 0.0F, 0.0F, 0.9599F);
        this.setRotateAngle(finupperL5, 0.0F, 0.0F, 1.2217F);
        this.setRotateAngle(finlowerL5, 0.0F, 0.0F, -0.9599F);
        this.setRotateAngle(segment6, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(finlowerR6, 0.0F, 0.0F, 1.2217F);
        this.setRotateAngle(finupperR6, 0.0F, 0.0F, -1.0472F);
        this.setRotateAngle(finupperL6, 0.0F, 0.0F, 1.0472F);
        this.setRotateAngle(finlowerL6, 0.0F, 0.0F, -1.2217F);
        this.setRotateAngle(segment7, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(finupperL7, 0.0F, 0.0F, 0.7854F);
        this.setRotateAngle(finupperR7, 0.0F, 0.0F, -0.7854F);
        this.setRotateAngle(finlowerL7, 0.0F, 0.0F, -1.4399F);
        this.setRotateAngle(finlowerR7, 0.0F, 0.0F, 1.4399F);
        this.setRotateAngle(segment8, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(finupperL8, 0.0F, 0.0F, 0.6545F);
        this.setRotateAngle(finlowerL8, 0.0F, 0.0F, -1.3963F);
        this.setRotateAngle(finupperR8, 0.0F, 0.0F, -0.6545F);
        this.setRotateAngle(finlowerR8, 0.0F, 0.0F, 1.3963F);
        this.setRotateAngle(segment9, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(finlowerR9, 0.0F, 0.0F, 1.2217F);
        this.setRotateAngle(finlowerL9, 0.0F, 0.0F, -1.2217F);
        this.setRotateAngle(finupperR9, 0.0F, 0.0F, -0.5236F);
        this.setRotateAngle(finupperL9, 0.0F, 0.0F, 0.5236F);
        this.setRotateAngle(segment10, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(finupperL10, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(finupperR10, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(finlowerL10, 0.0F, 0.0F, -0.7854F);
        this.setRotateAngle(finlowerR10, 0.0F, 0.0F, 0.7854F);
        this.setRotateAngle(segment11, 0.0F, 0.0873F, 0.0F);
        this.body.offsetX = -0.1F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.5F;
        this.body.offsetX = 0.2F;
        this.body.rotateAngleY = (float) Math.toRadians(210);
        this.body.rotateAngleX = (float) Math.toRadians(8);
        this.body.rotateAngleZ = (float) Math.toRadians(-4);
        this.body.scaleChildren = true;
        float scaler = 0.7F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, -0.2F, 3.9F, 0.1F);
        this.setRotateAngle(Helement_R_r1, 0.0F, 0.0F, -0.5236F);
        this.setRotateAngle(Helement_L_r1, 0.0F, 0.0F, 0.5236F);
        this.setRotateAngle(PelementL2_r1, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(PelementL1_r1, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(PelementR2_r1, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(PelementR1_r1, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(finupperL, 0.0F, 0.0F, 0.4363F);
        this.setRotateAngle(finupperR, 0.0F, 0.0F, -0.4363F);
        this.setRotateAngle(finlowerL, 0.0F, 0.0F, -0.4363F);
        this.setRotateAngle(finlowerR, 0.0F, 0.0F, 0.4363F);
        this.setRotateAngle(segment2, 0.0437F, 0.0436F, 0.0019F);
        this.setRotateAngle(finlowerR2, 0.0F, 0.0F, 0.5236F);
        this.setRotateAngle(finupperR2, 0.0F, 0.0F, -0.5672F);
        this.setRotateAngle(finupperL2, 0.0F, 0.0F, 0.5672F);
        this.setRotateAngle(finlowerL2, 0.0F, 0.0F, -0.6109F);
        this.setRotateAngle(segment3, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(finupperL3, 0.0F, 0.0F, 0.7854F);
        this.setRotateAngle(finupperR3, 0.0F, 0.0F, -0.7854F);
        this.setRotateAngle(finlowerL3, 0.0F, 0.0F, -0.6109F);
        this.setRotateAngle(finlowerR3, 0.0F, 0.0F, 0.6109F);
        this.setRotateAngle(segment4, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(finupperR4, 0.0F, 0.0F, -0.9599F);
        this.setRotateAngle(finupperL4, 0.0F, 0.0F, 0.9599F);
        this.setRotateAngle(finlowerL4, 0.0F, 0.0F, -0.7854F);
        this.setRotateAngle(finlowerR4, 0.0F, 0.0F, 0.7854F);
        this.setRotateAngle(segment5, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(finupperR5, 0.0F, 0.0F, -1.2217F);
        this.setRotateAngle(finlowerR5, 0.0F, 0.0F, 0.9599F);
        this.setRotateAngle(finupperL5, 0.0F, 0.0F, 1.2217F);
        this.setRotateAngle(finlowerL5, 0.0F, 0.0F, -0.9599F);
        this.setRotateAngle(segment6, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(finlowerR6, 0.0F, 0.0F, 1.2217F);
        this.setRotateAngle(finupperR6, 0.0F, 0.0F, -1.0472F);
        this.setRotateAngle(finupperL6, 0.0F, 0.0F, 1.0472F);
        this.setRotateAngle(finlowerL6, 0.0F, 0.0F, -1.2217F);
        this.setRotateAngle(segment7, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(finupperL7, 0.0F, 0.0F, 0.7854F);
        this.setRotateAngle(finupperR7, 0.0F, 0.0F, -0.7854F);
        this.setRotateAngle(finlowerL7, 0.0F, 0.0F, -1.4399F);
        this.setRotateAngle(finlowerR7, 0.0F, 0.0F, 1.4399F);
        this.setRotateAngle(segment8, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(finupperL8, 0.0F, 0.0F, 0.6545F);
        this.setRotateAngle(finlowerL8, 0.0F, 0.0F, -1.3963F);
        this.setRotateAngle(finupperR8, 0.0F, 0.0F, -0.6545F);
        this.setRotateAngle(finlowerR8, 0.0F, 0.0F, 1.3963F);
        this.setRotateAngle(segment9, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(finlowerR9, 0.0F, 0.0F, 1.2217F);
        this.setRotateAngle(finlowerL9, 0.0F, 0.0F, -1.2217F);
        this.setRotateAngle(finupperR9, 0.0F, 0.0F, -0.5236F);
        this.setRotateAngle(finupperL9, 0.0F, 0.0F, 0.5236F);
        this.setRotateAngle(segment10, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(finupperL10, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(finupperR10, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(finlowerL10, 0.0F, 0.0F, -0.7854F);
        this.setRotateAngle(finlowerR10, 0.0F, 0.0F, 0.7854F);
        this.setRotateAngle(segment11, 0.0F, 0.0873F, 0.0F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        this.body.offsetY = 0F;

        AdvancedModelRenderer[] Body = {this.segment1, this.segment2, this.segment3, this.segment4, this.segment5, this.segment6, this.segment7, this.segment8, this.segment9, this.segment10, this.segment11};

        float speed = 0.1F;
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.3F;}
        if (!e.isInWater()) {
            speed = 0.3F;
        }

        //mouthparts:
        this.flap(this.shaftL,0.2F * still, -0.2F, true, 0F, 0F, f2, 0.5F);
        this.flap(this.shaftR,0.2F * still, -0.2F, false, 0F, 0F,  f2, 0.5F);

        this.flap(this.shaftL2,0.2F * still, -0.2F, true, 0.75F, 0F, f2, 0.5F);
        this.flap(this.shaftR2,0.2F * still, -0.2F, false, 0.75F, 0F,  f2, 0.5F);

        this.flap(this.shaftL3,0.2F * still, -0.2F, true, 1.5F, 0F, f2, 0.5F);
        this.flap(this.shaftR3,0.2F * still, -0.2F, false, 1.5F, 0F,  f2, 0.5F);

        this.flap(this.shaftL4,0.2F * still, -0.2F, true, 2.25F, 0F, f2, 0.5F);
        this.flap(this.shaftR4,0.2F * still, -0.2F, false, 2.25F, 0F,  f2, 0.5F);

        this.flap(this.shaftL5,0.2F * still, -0.2F, true, 3.0F, 0F, f2, 0.5F);
        this.flap(this.shaftR5,0.2F * still, -0.2F, false, 3.0F, 0F,  f2, 0.5F);


        this.walk(this.shaftL,0.1F * still, -0.12F, true, 0F, 0F, f2, 0.5F);
        this.walk(this.shaftR,0.1F * still, -0.12F, false, 0F, 0F,  f2, 0.5F);

        this.walk(this.shaftL2,0.1F * still, -0.12F, true, 0.75F, 0F, f2, 0.5F);
        this.walk(this.shaftR2,0.1F * still, -0.12F, false, 0.75F, 0F,  f2, 0.5F);

        this.walk(this.shaftL3,0.1F * still, -0.12F, true, 1.5F, 0F, f2, 0.5F);
        this.walk(this.shaftR3,0.1F * still, -0.12F, false, 1.5F, 0F,  f2, 0.5F);

        this.walk(this.shaftL4,0.1F * still, -0.12F, true, 2.25F, 0F, f2, 0.5F);
        this.walk(this.shaftR4,0.1F * still, -0.12F, false, 2.25F, 0F,  f2, 0.5F);

        this.walk(this.shaftL5,0.1F * still, -0.12F, true, 3.0F, 0F, f2, 0.5F);
        this.walk(this.shaftR5,0.1F * still, -0.12F, false, 3.0F, 0F,  f2, 0.5F);

        // ---------------- end mouthparts

        this.flap(finlowerL10, 0.5F, -0.6F, false, 0, -0.5F, f2, 0.7F);
        this.flap(finlowerR10, 0.5F, 0.6F, false, 0, 0.5F, f2, 0.7F);
        this.flap(finlowerL9, 0.5F, -0.6F, false, 0.5F, -0.5F, f2, 0.7F);
        this.flap(finlowerR9, 0.5F, 0.6F, false, 0.5F, 0.5F, f2, 0.7F);
        this.flap(finlowerL8, 0.5F, -0.6F, false, 1.0F, -0.5F, f2, 0.7F);
        this.flap(finlowerR8, 0.5F, 0.6F, false, 1.0F, 0.5F, f2, 0.7F);
        this.flap(finlowerL7, 0.5F, -0.6F, false, 1.5F, -0.5F, f2, 0.7F);
        this.flap(finlowerR7, 0.5F, 0.6F, false, 1.5F, 0.5F, f2, 0.7F);
        this.flap(finlowerL6, 0.5F, -0.6F, false, 2.0F, -0.5F, f2, 0.7F);
        this.flap(finlowerR6, 0.5F, 0.6F, false, 2.0F, 0.5F, f2, 0.7F);
        this.flap(finlowerL5, 0.5F, -0.6F, false, 2.5F, -0.5F, f2, 0.7F);
        this.flap(finlowerR5, 0.5F, 0.6F, false, 2.5F, 0.5F, f2, 0.7F);
        this.flap(finlowerL4, 0.5F, -0.6F, false, 3.0F, -0.5F, f2, 0.7F);
        this.flap(finlowerR4, 0.5F, 0.6F, false, 3.0F, 0.5F, f2, 0.7F);
        this.flap(finlowerL3, 0.5F, -0.6F, false, 3.5F, -0.5F, f2, 0.7F);
        this.flap(finlowerR3, 0.5F, 0.6F, false, 3.5F, 0.5F, f2, 0.7F);
        this.flap(finlowerL2, 0.5F, -0.6F, false, 4.0F, -0.5F, f2, 0.7F);
        this.flap(finlowerR2, 0.5F, 0.6F, false, 4.0F, 0.5F, f2, 0.7F);
        this.flap(finlowerL, 0.5F, -0.6F, false, 4.5F, -0.5F, f2, 0.7F);
        this.flap(finlowerR, 0.5F, 0.6F, false, 4.5F, 0.5F, f2, 0.7F);

        this.flap(finupperL10, 0.3F * still, -0.6F, false, 0, -0.5F, f2, 0.7F);
        this.flap(finupperR10, 0.3F * still, 0.6F, false, 0, 0.5F, f2, 0.7F);
        this.flap(finupperL9, 0.3F * still, -0.6F, false, 0.5F, -0.5F, f2, 0.7F);
        this.flap(finupperR9, 0.3F * still, 0.6F, false, 0.5F, 0.5F, f2, 0.7F);
        this.flap(finupperL8, 0.3F * still, -0.6F, false, 1.0F, -0.5F, f2, 0.7F);
        this.flap(finupperR8, 0.3F * still, 0.6F, false, 1.0F, 0.5F, f2, 0.7F);
        this.flap(finupperL7, 0.3F * still, -0.6F, false, 1.5F, -0.5F, f2, 0.7F);
        this.flap(finupperR7, 0.3F * still, 0.6F, false, 1.5F, 0.5F, f2, 0.7F);
        this.flap(finupperL6, 0.3F * still, -0.6F, false, 2.0F, -0.5F, f2, 0.7F);
        this.flap(finupperR6, 0.3F * still, 0.6F, false, 2.0F, 0.5F, f2, 0.7F);
        this.flap(finupperL5, 0.3F * still, -0.6F, false, 2.5F, -0.5F, f2, 0.7F);
        this.flap(finupperR5, 0.3F * still, 0.6F, false, 2.5F, 0.5F, f2, 0.7F);
        this.flap(finupperL4, 0.3F * still, -0.6F, false, 3.0F, -0.5F, f2, 0.7F);
        this.flap(finupperR4, 0.3F * still, 0.6F, false, 3.0F, 0.5F, f2, 0.7F);
        this.flap(finupperL3, 0.3F * still, -0.6F, false, 3.5F, -0.5F, f2, 0.7F);
        this.flap(finupperR3, 0.3F * still, 0.6F, false, 3.5F, 0.5F, f2, 0.7F);
        this.flap(finupperL2, 0.3F * still, -0.6F, false, 4.0F, -0.5F, f2, 0.7F);
        this.flap(finupperR2, 0.3F * still, 0.6F, false, 4.0F, 0.5F, f2, 0.7F);
        this.flap(finupperL, 0.3F * still, -0.6F, false, 4.5F, -0.5F, f2, 0.7F);
        this.flap(finupperR, 0.3F * still, 0.6F, false, 4.5F, 0.5F, f2, 0.7F);

        this.chainWave(Body, speed * still, 0.02F * still, -3, f2, 0.2F * still);
        this.chainSwing(Body, speed * still, 0.1F * still, -1.2F, f2, 0.2F * still);

        this.bob(body, -speed, 0.6F, false, f2, 1);

        if (!e.isInWater()) {
            //this.Body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 0F;
            this.chainWave(Body, speed * 2F, 0.3F, -3, f2, 0.2F);
            this.bob(body, -speed * 1.5F, 5F, false, f2, 1);
        }

    }
}
