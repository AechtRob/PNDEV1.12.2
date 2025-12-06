package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPseudoangustidontus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer Helement_shell;
    private final AdvancedModelRenderer Helement_L_r1;
    private final AdvancedModelRenderer Helement_shell2;
    private final AdvancedModelRenderer Helement_L_r2;
    private final AdvancedModelRenderer PelementL;
    private final AdvancedModelRenderer PelementL2_r1;
    private final AdvancedModelRenderer PelementL3_r1;
    private final AdvancedModelRenderer PelementL2_r2;
    private final AdvancedModelRenderer PelementL1_r1;
    private final AdvancedModelRenderer PelementR;
    private final AdvancedModelRenderer headbase;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer eyeL2;
    private final AdvancedModelRenderer appendageL;
    private final AdvancedModelRenderer appendageL_r1;
    private final AdvancedModelRenderer appendageL_r2;
    private final AdvancedModelRenderer shaftL;
    private final AdvancedModelRenderer shaftL_r1;
    private final AdvancedModelRenderer shaftL_r2;
    private final AdvancedModelRenderer shaftL2;
    private final AdvancedModelRenderer shaftL_r3;
    private final AdvancedModelRenderer shaftL_r4;
    private final AdvancedModelRenderer shaftL3;
    private final AdvancedModelRenderer shaftL_r5;
    private final AdvancedModelRenderer shaftL_r6;
    private final AdvancedModelRenderer shaftL4;
    private final AdvancedModelRenderer shaftL_r7;
    private final AdvancedModelRenderer shaftL_r8;
    private final AdvancedModelRenderer shaftL5;
    private final AdvancedModelRenderer shaftL_r9;
    private final AdvancedModelRenderer shaftL_r10;
    private final AdvancedModelRenderer shaftL_r11;
    private final AdvancedModelRenderer shaftL_r12;
    private final AdvancedModelRenderer appendageL2;
    private final AdvancedModelRenderer appendageL_r3;
    private final AdvancedModelRenderer appendageL_r4;
    private final AdvancedModelRenderer shaftL6;
    private final AdvancedModelRenderer shaftL_r13;
    private final AdvancedModelRenderer shaftL_r14;
    private final AdvancedModelRenderer shaftL7;
    private final AdvancedModelRenderer shaftL_r15;
    private final AdvancedModelRenderer shaftL_r16;
    private final AdvancedModelRenderer shaftL8;
    private final AdvancedModelRenderer shaftL_r17;
    private final AdvancedModelRenderer shaftL_r18;
    private final AdvancedModelRenderer shaftL9;
    private final AdvancedModelRenderer shaftL_r19;
    private final AdvancedModelRenderer shaftL_r20;
    private final AdvancedModelRenderer shaftL10;
    private final AdvancedModelRenderer shaftL_r21;
    private final AdvancedModelRenderer shaftL_r22;
    private final AdvancedModelRenderer shaftL_r23;
    private final AdvancedModelRenderer shaftL_r24;
    private final AdvancedModelRenderer segments;
    private final AdvancedModelRenderer segment1;
    private final AdvancedModelRenderer finupperL;
    private final AdvancedModelRenderer finupperR;
    private final AdvancedModelRenderer finlowerL;
    private final AdvancedModelRenderer finlowerR;
    private final AdvancedModelRenderer segment2;
    private final AdvancedModelRenderer finupperL2;
    private final AdvancedModelRenderer finupperR2;
    private final AdvancedModelRenderer finlowerL2;
    private final AdvancedModelRenderer finlowerR2;
    private final AdvancedModelRenderer segment3;
    private final AdvancedModelRenderer finupperL3;
    private final AdvancedModelRenderer finupperR3;
    private final AdvancedModelRenderer finlowerL3;
    private final AdvancedModelRenderer finlowerR3;
    private final AdvancedModelRenderer segment4;
    private final AdvancedModelRenderer finupperL4;
    private final AdvancedModelRenderer finupperR4;
    private final AdvancedModelRenderer finlowerL4;
    private final AdvancedModelRenderer finlowerR4;
    private final AdvancedModelRenderer segment5;
    private final AdvancedModelRenderer finupperL5;
    private final AdvancedModelRenderer finupperR5;
    private final AdvancedModelRenderer finlowerL5;
    private final AdvancedModelRenderer finlowerR5;
    private final AdvancedModelRenderer segment6;
    private final AdvancedModelRenderer finupperL6;
    private final AdvancedModelRenderer finupperR6;
    private final AdvancedModelRenderer finlowerL6;
    private final AdvancedModelRenderer finlowerR6;
    private final AdvancedModelRenderer segment7;
    private final AdvancedModelRenderer finupperL7;
    private final AdvancedModelRenderer finupperR7;
    private final AdvancedModelRenderer finlowerL7;
    private final AdvancedModelRenderer finlowerR7;
    private final AdvancedModelRenderer segment8;
    private final AdvancedModelRenderer finupperL8;
    private final AdvancedModelRenderer finupperR8;
    private final AdvancedModelRenderer finlowerL8;
    private final AdvancedModelRenderer finlowerR8;
    private final AdvancedModelRenderer segment9;
    private final AdvancedModelRenderer finlowerL9;
    private final AdvancedModelRenderer finlowerR9;
    private final AdvancedModelRenderer finupperL9;
    private final AdvancedModelRenderer finupperR9;
    private final AdvancedModelRenderer segment10;
    private final AdvancedModelRenderer finupperL10;
    private final AdvancedModelRenderer finupperR10;
    private final AdvancedModelRenderer finlowerL10;
    private final AdvancedModelRenderer finlowerR10;
    private final AdvancedModelRenderer segment11;

    public ModelPseudoangustidontus() {
        this.textureWidth = 86;
        this.textureHeight = 86;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(body);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -9.0F, 0.0F);
        this.body.addChild(head);


        this.Helement_shell = new AdvancedModelRenderer(this);
        this.Helement_shell.setRotationPoint(0.0F, -3.25F, 0.0F);
        this.head.addChild(Helement_shell);
        this.Helement_shell.cubeList.add(new ModelBox(Helement_shell, 19, 36, 6.75F, 2.0F, -13.25F, 0, 3, 12, 0.0F, false));

        this.Helement_L_r1 = new AdvancedModelRenderer(this);
        this.Helement_L_r1.setRotationPoint(0.0F, 12.25F, 0.0F);
        this.Helement_shell.addChild(Helement_L_r1);
        this.setRotateAngle(Helement_L_r1, 0.0F, 0.0F, 0.5236F);
        this.Helement_L_r1.cubeList.add(new ModelBox(Helement_L_r1, 0, 0, -7.11F, -12.25F, -24.0F, 8, 0, 24, 0.0F, false));

        this.Helement_shell2 = new AdvancedModelRenderer(this);
        this.Helement_shell2.setRotationPoint(0.0F, -3.25F, 0.0F);
        this.head.addChild(Helement_shell2);
        this.Helement_shell2.cubeList.add(new ModelBox(Helement_shell2, 19, 36, -6.75F, 2.0F, -13.25F, 0, 3, 12, 0.0F, true));

        this.Helement_L_r2 = new AdvancedModelRenderer(this);
        this.Helement_L_r2.setRotationPoint(0.0F, 12.25F, 0.0F);
        this.Helement_shell2.addChild(Helement_L_r2);
        this.setRotateAngle(Helement_L_r2, 0.0F, 0.0F, -0.5236F);
        this.Helement_L_r2.cubeList.add(new ModelBox(Helement_L_r2, 0, 0, -0.89F, -12.25F, -24.0F, 8, 0, 24, 0.0F, true));

        this.PelementL = new AdvancedModelRenderer(this);
        this.PelementL.setRotationPoint(4.0F, 1.0F, -7.0F);
        this.head.addChild(PelementL);


        this.PelementL2_r1 = new AdvancedModelRenderer(this);
        this.PelementL2_r1.setRotationPoint(-4.0F, 8.75F, 7.0F);
        this.PelementL.addChild(PelementL2_r1);
        this.setRotateAngle(PelementL2_r1, 0.0F, 0.0F, 0.2618F);
        this.PelementL2_r1.cubeList.add(new ModelBox(PelementL2_r1, 0, 25, -8.25F, -9.75F, -13.25F, 3, 3, 12, 0.0F, true));

        this.PelementL3_r1 = new AdvancedModelRenderer(this);
        this.PelementL3_r1.setRotationPoint(-4.0F, 8.0F, 7.0F);
        this.PelementL.addChild(PelementL3_r1);
        this.setRotateAngle(PelementL3_r1, 0.0F, 0.0F, -0.2618F);
        this.PelementL3_r1.cubeList.add(new ModelBox(PelementL3_r1, 41, 0, -4.0F, -9.25F, -11.251F, 3, 3, 9, 0.0F, true));

        this.PelementL2_r2 = new AdvancedModelRenderer(this);
        this.PelementL2_r2.setRotationPoint(-4.0F, 8.0F, 7.0F);
        this.PelementL.addChild(PelementL2_r2);
        this.setRotateAngle(PelementL2_r2, 0.0F, 0.0F, 0.2618F);
        this.PelementL2_r2.cubeList.add(new ModelBox(PelementL2_r2, 41, 0, 1.0F, -9.25F, -11.251F, 3, 3, 9, 0.0F, false));

        this.PelementL1_r1 = new AdvancedModelRenderer(this);
        this.PelementL1_r1.setRotationPoint(-4.0F, 8.75F, 7.0F);
        this.PelementL.addChild(PelementL1_r1);
        this.setRotateAngle(PelementL1_r1, 0.0F, 0.0F, -0.2618F);
        this.PelementL1_r1.cubeList.add(new ModelBox(PelementL1_r1, 0, 25, 5.25F, -9.75F, -13.25F, 3, 3, 12, 0.0F, false));

        this.PelementR = new AdvancedModelRenderer(this);
        this.PelementR.setRotationPoint(-4.0F, 1.0F, -7.0F);
        this.head.addChild(PelementR);


        this.headbase = new AdvancedModelRenderer(this);
        this.headbase.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.head.addChild(headbase);
        this.headbase.cubeList.add(new ModelBox(headbase, 32, 36, -3.0F, -1.0F, -13.0F, 6, 4, 7, 0.0F, false));
        this.headbase.cubeList.add(new ModelBox(headbase, 19, 25, -4.5F, -1.0F, -6.0F, 9, 4, 6, 0.0F, false));
        this.headbase.cubeList.add(new ModelBox(headbase, 59, 43, -1.5F, 3.0F, -12.0F, 3, 1, 3, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(4.5F, 0.5F, -0.5F);
        this.headbase.addChild(eyeL);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 9, 20, -0.5F, -1.0F, -0.5F, 3, 2, 1, 0.0F, false));
        this.eyeL.cubeList.add(new ModelBox(eyeL, 75, 32, 2.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.eyeL2 = new AdvancedModelRenderer(this);
        this.eyeL2.setRotationPoint(-4.5F, 0.5F, -0.5F);
        this.headbase.addChild(eyeL2);
        this.eyeL2.cubeList.add(new ModelBox(eyeL2, 9, 20, -2.5F, -1.0F, -0.5F, 3, 2, 1, 0.0F, true));
        this.eyeL2.cubeList.add(new ModelBox(eyeL2, 75, 32, -3.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.appendageL = new AdvancedModelRenderer(this);
        this.appendageL.setRotationPoint(2.0F, 1.0F, -13.0F);
        this.headbase.addChild(appendageL);
        this.setRotateAngle(appendageL, 0.053F, -0.1699F, -0.1756F);
        this.appendageL.cubeList.add(new ModelBox(appendageL, 0, 9, -0.5F, -1.0F, -8.0F, 2, 2, 8, 0.0F, false));

        this.appendageL_r1 = new AdvancedModelRenderer(this);
        this.appendageL_r1.setRotationPoint(0.5F, -0.5F, -7.0F);
        this.appendageL.addChild(appendageL_r1);
        this.setRotateAngle(appendageL_r1, 0.48F, 0.0F, 0.0F);
        this.appendageL_r1.cubeList.add(new ModelBox(appendageL_r1, 0, 20, -1.0F, -0.8F, -2.7F, 2, 1, 2, -0.003F, false));

        this.appendageL_r2 = new AdvancedModelRenderer(this);
        this.appendageL_r2.setRotationPoint(0.5F, 1.5F, -1.0F);
        this.appendageL.addChild(appendageL_r2);
        this.setRotateAngle(appendageL_r2, -1.0036F, 0.0F, 0.0F);
        this.appendageL_r2.cubeList.add(new ModelBox(appendageL_r2, 65, 20, 0.0F, -0.5F, -1.0F, 0, 1, 3, 0.0F, false));

        this.shaftL = new AdvancedModelRenderer(this);
        this.shaftL.setRotationPoint(1.0F, 1.0F, -6.0F);
        this.appendageL.addChild(shaftL);
        this.setRotateAngle(shaftL, -0.1745F, 0.0F, 0.0F);


        this.shaftL_r1 = new AdvancedModelRenderer(this);
        this.shaftL_r1.setRotationPoint(-0.8736F, 0.0F, -0.9848F);
        this.shaftL.addChild(shaftL_r1);
        this.setRotateAngle(shaftL_r1, -0.1367F, 0.3198F, 0.0888F);
        this.shaftL_r1.cubeList.add(new ModelBox(shaftL_r1, 66, 68, -2.8F, 0.0F, 0.0F, 3, 10, 0, 0.0F, false));

        this.shaftL_r2 = new AdvancedModelRenderer(this);
        this.shaftL_r2.setRotationPoint(-0.8736F, 0.0F, -0.9848F);
        this.shaftL.addChild(shaftL_r2);
        this.setRotateAngle(shaftL_r2, -0.1298F, 0.017F, 0.1298F);
        this.shaftL_r2.cubeList.add(new ModelBox(shaftL_r2, 57, 63, -2.8F, 0.0F, 0.0F, 4, 10, 0, 0.0F, false));

        this.shaftL2 = new AdvancedModelRenderer(this);
        this.shaftL2.setRotationPoint(1.0F, 1.0F, -5.0F);
        this.appendageL.addChild(shaftL2);
        this.setRotateAngle(shaftL2, -0.0872F, -0.0038F, -0.0435F);


        this.shaftL_r3 = new AdvancedModelRenderer(this);
        this.shaftL_r3.setRotationPoint(0.1264F, 0.0F, -0.9848F);
        this.shaftL2.addChild(shaftL_r3);
        this.setRotateAngle(shaftL_r3, -0.0903F, 0.2646F, 0.0201F);
        this.shaftL_r3.cubeList.add(new ModelBox(shaftL_r3, 68, 9, -3.8F, 0.0F, -0.1F, 3, 10, 0, 0.0F, false));

        this.shaftL_r4 = new AdvancedModelRenderer(this);
        this.shaftL_r4.setRotationPoint(0.1264F, 0.0F, -0.9848F);
        this.shaftL2.addChild(shaftL_r4);
        this.setRotateAngle(shaftL_r4, -0.0872F, 0.0038F, 0.0435F);
        this.shaftL_r4.cubeList.add(new ModelBox(shaftL_r4, 48, 63, -3.8F, 0.0F, 0.0F, 4, 10, 0, 0.0F, false));

        this.shaftL3 = new AdvancedModelRenderer(this);
        this.shaftL3.setRotationPoint(1.0F, 1.0F, -4.0F);
        this.appendageL.addChild(shaftL3);
        this.setRotateAngle(shaftL3, 0.0F, 0.0F, -0.1309F);


        this.shaftL_r5 = new AdvancedModelRenderer(this);
        this.shaftL_r5.setRotationPoint(0.1264F, 0.0F, -0.9848F);
        this.shaftL3.addChild(shaftL_r5);
        this.setRotateAngle(shaftL_r5, -0.0723F, 0.2611F, -0.0187F);
        this.shaftL_r5.cubeList.add(new ModelBox(shaftL_r5, 66, 57, -3.8F, 0.0F, -0.1F, 3, 10, 0, 0.0F, false));

        this.shaftL_r6 = new AdvancedModelRenderer(this);
        this.shaftL_r6.setRotationPoint(0.1264F, 0.0F, -0.9848F);
        this.shaftL3.addChild(shaftL_r6);
        this.setRotateAngle(shaftL_r6, -0.0698F, 0.0F, 0.0F);
        this.shaftL_r6.cubeList.add(new ModelBox(shaftL_r6, 18, 61, -3.8F, 0.0F, 0.0F, 4, 10, 0, 0.0F, false));

        this.shaftL4 = new AdvancedModelRenderer(this);
        this.shaftL4.setRotationPoint(1.0F, 1.0F, -3.0F);
        this.appendageL.addChild(shaftL4);
        this.setRotateAngle(shaftL4, 0.0F, 0.0F, -0.1309F);


        this.shaftL_r7 = new AdvancedModelRenderer(this);
        this.shaftL_r7.setRotationPoint(0.2264F, 0.0F, -0.9848F);
        this.shaftL4.addChild(shaftL_r7);
        this.setRotateAngle(shaftL_r7, -0.0181F, 0.2624F, 0.0302F);
        this.shaftL_r7.cubeList.add(new ModelBox(shaftL_r7, 41, 65, -3.9F, 0.0F, -0.1F, 3, 10, 0, 0.0F, false));

        this.shaftL_r8 = new AdvancedModelRenderer(this);
        this.shaftL_r8.setRotationPoint(0.2264F, 0.0F, -0.9848F);
        this.shaftL4.addChild(shaftL_r8);
        this.setRotateAngle(shaftL_r8, -0.0174F, 0.0006F, 0.0349F);
        this.shaftL_r8.cubeList.add(new ModelBox(shaftL_r8, 9, 61, -3.9F, 0.0F, 0.0F, 4, 10, 0, 0.0F, false));

        this.shaftL5 = new AdvancedModelRenderer(this);
        this.shaftL5.setRotationPoint(1.0F, 1.0F, -2.0F);
        this.appendageL.addChild(shaftL5);
        this.setRotateAngle(shaftL5, 0.0436F, 0.0F, 0.0F);


        this.shaftL_r9 = new AdvancedModelRenderer(this);
        this.shaftL_r9.setRotationPoint(0.1264F, 0.0F, 0.0152F);
        this.shaftL5.addChild(shaftL_r9);
        this.setRotateAngle(shaftL_r9, 0.0903F, 0.2608F, 0.067F);
        this.shaftL_r9.cubeList.add(new ModelBox(shaftL_r9, 27, 65, -3.8F, 0.0F, -0.1F, 3, 10, 0, 0.0F, false));

        this.shaftL_r10 = new AdvancedModelRenderer(this);
        this.shaftL_r10.setRotationPoint(0.1264F, 0.0F, 0.0152F);
        this.shaftL5.addChild(shaftL_r10);
        this.setRotateAngle(shaftL_r10, 0.0873F, 0.0F, 0.0436F);
        this.shaftL_r10.cubeList.add(new ModelBox(shaftL_r10, 0, 25, -3.8F, 0.0F, 0.0F, 4, 10, 0, 0.0F, false));

        this.shaftL_r11 = new AdvancedModelRenderer(this);
        this.shaftL_r11.setRotationPoint(0.3264F, 0.0F, -0.9848F);
        this.shaftL5.addChild(shaftL_r11);
        this.setRotateAngle(shaftL_r11, 0.0F, 0.2182F, 0.0F);
        this.shaftL_r11.cubeList.add(new ModelBox(shaftL_r11, 34, 65, -4.0F, 0.0F, -0.1F, 3, 10, 0, 0.0F, false));

        this.shaftL_r12 = new AdvancedModelRenderer(this);
        this.shaftL_r12.setRotationPoint(0.3264F, 0.0F, -0.9848F);
        this.shaftL5.addChild(shaftL_r12);
        this.setRotateAngle(shaftL_r12, 0.0F, 0.0F, 0.0F);
        this.shaftL_r12.cubeList.add(new ModelBox(shaftL_r12, 0, 61, -4.0F, 0.0F, 0.0F, 4, 10, 0, 0.0F, false));

        this.appendageL2 = new AdvancedModelRenderer(this);
        this.appendageL2.setRotationPoint(-2.0F, 1.0F, -13.0F);
        this.headbase.addChild(appendageL2);
        this.setRotateAngle(appendageL2, 0.053F, 0.1699F, 0.1756F);
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 0, 9, -1.5F, -1.0F, -8.0F, 2, 2, 8, 0.0F, true));

        this.appendageL_r3 = new AdvancedModelRenderer(this);
        this.appendageL_r3.setRotationPoint(-0.5F, -0.5F, -7.0F);
        this.appendageL2.addChild(appendageL_r3);
        this.setRotateAngle(appendageL_r3, 0.48F, 0.0F, 0.0F);
        this.appendageL_r3.cubeList.add(new ModelBox(appendageL_r3, 0, 20, -1.0F, -0.8F, -2.7F, 2, 1, 2, -0.003F, true));

        this.appendageL_r4 = new AdvancedModelRenderer(this);
        this.appendageL_r4.setRotationPoint(-0.5F, 1.5F, -1.0F);
        this.appendageL2.addChild(appendageL_r4);
        this.setRotateAngle(appendageL_r4, -1.0036F, 0.0F, 0.0F);
        this.appendageL_r4.cubeList.add(new ModelBox(appendageL_r4, 65, 20, 0.0F, -0.5F, -1.0F, 0, 1, 3, 0.0F, true));

        this.shaftL6 = new AdvancedModelRenderer(this);
        this.shaftL6.setRotationPoint(-1.0F, 1.0F, -6.0F);
        this.appendageL2.addChild(shaftL6);
        this.setRotateAngle(shaftL6, -0.1745F, 0.0F, 0.0F);


        this.shaftL_r13 = new AdvancedModelRenderer(this);
        this.shaftL_r13.setRotationPoint(0.8736F, 0.0F, -0.9848F);
        this.shaftL6.addChild(shaftL_r13);
        this.setRotateAngle(shaftL_r13, -0.1367F, -0.3198F, -0.0888F);
        this.shaftL_r13.cubeList.add(new ModelBox(shaftL_r13, 66, 68, -0.2F, 0.0F, 0.0F, 3, 10, 0, 0.0F, true));

        this.shaftL_r14 = new AdvancedModelRenderer(this);
        this.shaftL_r14.setRotationPoint(0.8736F, 0.0F, -0.9848F);
        this.shaftL6.addChild(shaftL_r14);
        this.setRotateAngle(shaftL_r14, -0.1298F, -0.017F, -0.1298F);
        this.shaftL_r14.cubeList.add(new ModelBox(shaftL_r14, 57, 63, -1.2F, 0.0F, 0.0F, 4, 10, 0, 0.0F, true));

        this.shaftL7 = new AdvancedModelRenderer(this);
        this.shaftL7.setRotationPoint(-1.0F, 1.0F, -5.0F);
        this.appendageL2.addChild(shaftL7);
        this.setRotateAngle(shaftL7, -0.0872F, 0.0038F, 0.0435F);


        this.shaftL_r15 = new AdvancedModelRenderer(this);
        this.shaftL_r15.setRotationPoint(-0.1264F, 0.0F, -0.9848F);
        this.shaftL7.addChild(shaftL_r15);
        this.setRotateAngle(shaftL_r15, -0.0903F, -0.2646F, -0.0201F);
        this.shaftL_r15.cubeList.add(new ModelBox(shaftL_r15, 68, 9, 0.8F, 0.0F, -0.1F, 3, 10, 0, 0.0F, true));

        this.shaftL_r16 = new AdvancedModelRenderer(this);
        this.shaftL_r16.setRotationPoint(-0.1264F, 0.0F, -0.9848F);
        this.shaftL7.addChild(shaftL_r16);
        this.setRotateAngle(shaftL_r16, -0.0872F, -0.0038F, -0.0435F);
        this.shaftL_r16.cubeList.add(new ModelBox(shaftL_r16, 48, 63, -0.2F, 0.0F, 0.0F, 4, 10, 0, 0.0F, true));

        this.shaftL8 = new AdvancedModelRenderer(this);
        this.shaftL8.setRotationPoint(-1.0F, 1.0F, -4.0F);
        this.appendageL2.addChild(shaftL8);
        this.setRotateAngle(shaftL8, 0.0F, 0.0F, 0.1309F);


        this.shaftL_r17 = new AdvancedModelRenderer(this);
        this.shaftL_r17.setRotationPoint(-0.1264F, 0.0F, -0.9848F);
        this.shaftL8.addChild(shaftL_r17);
        this.setRotateAngle(shaftL_r17, -0.0723F, -0.2611F, 0.0187F);
        this.shaftL_r17.cubeList.add(new ModelBox(shaftL_r17, 66, 57, 0.8F, 0.0F, -0.1F, 3, 10, 0, 0.0F, true));

        this.shaftL_r18 = new AdvancedModelRenderer(this);
        this.shaftL_r18.setRotationPoint(-0.1264F, 0.0F, -0.9848F);
        this.shaftL8.addChild(shaftL_r18);
        this.setRotateAngle(shaftL_r18, -0.0698F, 0.0F, 0.0F);
        this.shaftL_r18.cubeList.add(new ModelBox(shaftL_r18, 18, 61, -0.2F, 0.0F, 0.0F, 4, 10, 0, 0.0F, true));

        this.shaftL9 = new AdvancedModelRenderer(this);
        this.shaftL9.setRotationPoint(-1.0F, 1.0F, -3.0F);
        this.appendageL2.addChild(shaftL9);
        this.setRotateAngle(shaftL9, 0.0F, 0.0F, 0.1309F);


        this.shaftL_r19 = new AdvancedModelRenderer(this);
        this.shaftL_r19.setRotationPoint(-0.2264F, 0.0F, -0.9848F);
        this.shaftL9.addChild(shaftL_r19);
        this.setRotateAngle(shaftL_r19, -0.0181F, -0.2624F, -0.0302F);
        this.shaftL_r19.cubeList.add(new ModelBox(shaftL_r19, 41, 65, 0.9F, 0.0F, -0.1F, 3, 10, 0, 0.0F, true));

        this.shaftL_r20 = new AdvancedModelRenderer(this);
        this.shaftL_r20.setRotationPoint(-0.2264F, 0.0F, -0.9848F);
        this.shaftL9.addChild(shaftL_r20);
        this.setRotateAngle(shaftL_r20, -0.0174F, -0.0006F, -0.0349F);
        this.shaftL_r20.cubeList.add(new ModelBox(shaftL_r20, 9, 61, -0.1F, 0.0F, 0.0F, 4, 10, 0, 0.0F, true));

        this.shaftL10 = new AdvancedModelRenderer(this);
        this.shaftL10.setRotationPoint(-1.0F, 1.0F, -2.0F);
        this.appendageL2.addChild(shaftL10);
        this.setRotateAngle(shaftL10, 0.0436F, 0.0F, 0.0F);


        this.shaftL_r21 = new AdvancedModelRenderer(this);
        this.shaftL_r21.setRotationPoint(-0.1264F, 0.0F, 0.0152F);
        this.shaftL10.addChild(shaftL_r21);
        this.setRotateAngle(shaftL_r21, 0.0903F, -0.2608F, -0.067F);
        this.shaftL_r21.cubeList.add(new ModelBox(shaftL_r21, 27, 65, 0.8F, 0.0F, -0.1F, 3, 10, 0, 0.0F, true));

        this.shaftL_r22 = new AdvancedModelRenderer(this);
        this.shaftL_r22.setRotationPoint(-0.1264F, 0.0F, 0.0152F);
        this.shaftL10.addChild(shaftL_r22);
        this.setRotateAngle(shaftL_r22, 0.0873F, 0.0F, -0.0436F);
        this.shaftL_r22.cubeList.add(new ModelBox(shaftL_r22, 0, 25, -0.2F, 0.0F, 0.0F, 4, 10, 0, 0.0F, true));

        this.shaftL_r23 = new AdvancedModelRenderer(this);
        this.shaftL_r23.setRotationPoint(-0.3264F, 0.0F, -0.9848F);
        this.shaftL10.addChild(shaftL_r23);
        this.setRotateAngle(shaftL_r23, 0.0F, -0.2182F, 0.0F);
        this.shaftL_r23.cubeList.add(new ModelBox(shaftL_r23, 34, 65, 1.0F, 0.0F, -0.1F, 3, 10, 0, 0.0F, true));

        this.shaftL_r24 = new AdvancedModelRenderer(this);
        this.shaftL_r24.setRotationPoint(-0.3264F, 0.0F, -0.9848F);
        this.shaftL10.addChild(shaftL_r24);
        this.setRotateAngle(shaftL_r24, 0.0F, 0.0F, 0.0F);
        this.shaftL_r24.cubeList.add(new ModelBox(shaftL_r24, 0, 61, 0.0F, 0.0F, 0.0F, 4, 10, 0, 0.0F, true));

        this.segments = new AdvancedModelRenderer(this);
        this.segments.setRotationPoint(0.0F, -10.0F, 0.0F);
        this.body.addChild(segments);


        this.segment1 = new AdvancedModelRenderer(this);
        this.segment1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.segments.addChild(segment1);
        this.segment1.cubeList.add(new ModelBox(segment1, 0, 52, -5.0F, -2.0F, 0.0F, 10, 5, 3, 0.0F, false));

        this.finupperL = new AdvancedModelRenderer(this);
        this.finupperL.setRotationPoint(5.0F, -2.0F, 1.0F);
        this.segment1.addChild(finupperL);
        this.setRotateAngle(finupperL, 0.0F, 0.0F, 0.7854F);
        this.finupperL.cubeList.add(new ModelBox(finupperL, 59, 74, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finupperR = new AdvancedModelRenderer(this);
        this.finupperR.setRotationPoint(-5.0F, -2.0F, 1.0F);
        this.segment1.addChild(finupperR);
        this.setRotateAngle(finupperR, 0.0F, 0.0F, -0.7854F);
        this.finupperR.cubeList.add(new ModelBox(finupperR, 59, 74, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, true));

        this.finlowerL = new AdvancedModelRenderer(this);
        this.finlowerL.setRotationPoint(5.0F, 3.0F, 1.0F);
        this.segment1.addChild(finlowerL);
        this.setRotateAngle(finlowerL, 0.0F, 0.0F, -0.7854F);
        this.finlowerL.cubeList.add(new ModelBox(finlowerL, 75, 9, 0.0F, 0.0F, -1.0F, 0, 3, 3, 0.0F, false));

        this.finlowerR = new AdvancedModelRenderer(this);
        this.finlowerR.setRotationPoint(-5.0F, 3.0F, 1.0F);
        this.segment1.addChild(finlowerR);
        this.setRotateAngle(finlowerR, 0.0F, 0.0F, 0.7854F);
        this.finlowerR.cubeList.add(new ModelBox(finlowerR, 75, 9, 0.0F, 0.0F, -1.0F, 0, 3, 3, 0.0F, true));

        this.segment2 = new AdvancedModelRenderer(this);
        this.segment2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment1.addChild(segment2);
        this.segment2.cubeList.add(new ModelBox(segment2, 50, 25, -5.0F, -2.01F, 0.0F, 10, 5, 3, 0.0F, false));

        this.finupperL2 = new AdvancedModelRenderer(this);
        this.finupperL2.setRotationPoint(5.0F, -2.0F, 1.0F);
        this.segment2.addChild(finupperL2);
        this.setRotateAngle(finupperL2, 0.0F, 0.0F, 0.7854F);
        this.finupperL2.cubeList.add(new ModelBox(finupperL2, 74, 17, 0.0F, -5.0F, -1.0F, 0, 5, 3, 0.0F, false));

        this.finupperR2 = new AdvancedModelRenderer(this);
        this.finupperR2.setRotationPoint(-5.0F, -2.0F, 1.0F);
        this.segment2.addChild(finupperR2);
        this.setRotateAngle(finupperR2, 0.0F, 0.0F, -0.7854F);
        this.finupperR2.cubeList.add(new ModelBox(finupperR2, 74, 17, 0.0F, -5.0F, -1.0F, 0, 5, 3, 0.0F, true));

        this.finlowerL2 = new AdvancedModelRenderer(this);
        this.finlowerL2.setRotationPoint(5.0F, 3.0F, 1.0F);
        this.segment2.addChild(finlowerL2);
        this.setRotateAngle(finlowerL2, 0.0F, 0.0F, -0.7854F);
        this.finlowerL2.cubeList.add(new ModelBox(finlowerL2, 52, 74, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finlowerR2 = new AdvancedModelRenderer(this);
        this.finlowerR2.setRotationPoint(-5.0F, 3.0F, 1.0F);
        this.segment2.addChild(finlowerR2);
        this.setRotateAngle(finlowerR2, 0.0F, 0.0F, 0.7854F);
        this.finlowerR2.cubeList.add(new ModelBox(finlowerR2, 52, 74, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, true));

        this.segment3 = new AdvancedModelRenderer(this);
        this.segment3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment2.addChild(segment3);
        this.segment3.cubeList.add(new ModelBox(segment3, 44, 48, -5.0F, -2.0F, 0.0F, 10, 5, 3, 0.0F, false));

        this.finupperL3 = new AdvancedModelRenderer(this);
        this.finupperL3.setRotationPoint(5.0F, -2.0F, 1.0F);
        this.segment3.addChild(finupperL3);
        this.setRotateAngle(finupperL3, 0.0F, 0.0F, 0.7854F);
        this.finupperL3.cubeList.add(new ModelBox(finupperL3, 73, 73, 0.0F, -5.0F, -1.0F, 0, 5, 3, 0.0F, false));

        this.finupperR3 = new AdvancedModelRenderer(this);
        this.finupperR3.setRotationPoint(-5.0F, -2.0F, 1.0F);
        this.segment3.addChild(finupperR3);
        this.setRotateAngle(finupperR3, 0.0F, 0.0F, -0.7854F);
        this.finupperR3.cubeList.add(new ModelBox(finupperR3, 73, 73, 0.0F, -5.0F, -1.0F, 0, 5, 3, 0.0F, true));

        this.finlowerL3 = new AdvancedModelRenderer(this);
        this.finlowerL3.setRotationPoint(5.0F, 3.0F, 1.0F);
        this.segment3.addChild(finlowerL3);
        this.setRotateAngle(finlowerL3, 0.0F, 0.0F, -0.7854F);
        this.finlowerL3.cubeList.add(new ModelBox(finlowerL3, 73, 64, 0.0F, 0.0F, -1.0F, 0, 5, 3, 0.0F, false));

        this.finlowerR3 = new AdvancedModelRenderer(this);
        this.finlowerR3.setRotationPoint(-5.0F, 3.0F, 1.0F);
        this.segment3.addChild(finlowerR3);
        this.setRotateAngle(finlowerR3, 0.0F, 0.0F, 0.7854F);
        this.finlowerR3.cubeList.add(new ModelBox(finlowerR3, 73, 64, 0.0F, 0.0F, -1.0F, 0, 5, 3, 0.0F, true));

        this.segment4 = new AdvancedModelRenderer(this);
        this.segment4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment3.addChild(segment4);
        this.segment4.cubeList.add(new ModelBox(segment4, 41, 13, -5.0F, -2.01F, 0.0F, 10, 5, 3, 0.0F, false));

        this.finupperL4 = new AdvancedModelRenderer(this);
        this.finupperL4.setRotationPoint(5.0F, -2.0F, 1.0F);
        this.segment4.addChild(finupperL4);
        this.setRotateAngle(finupperL4, 0.0F, 0.0F, 0.7854F);
        this.finupperL4.cubeList.add(new ModelBox(finupperL4, 73, 55, 0.0F, -5.0F, -1.0F, 0, 5, 3, 0.0F, false));

        this.finupperR4 = new AdvancedModelRenderer(this);
        this.finupperR4.setRotationPoint(-5.0F, -2.0F, 1.0F);
        this.segment4.addChild(finupperR4);
        this.setRotateAngle(finupperR4, 0.0F, 0.0F, -0.7854F);
        this.finupperR4.cubeList.add(new ModelBox(finupperR4, 73, 55, 0.0F, -5.0F, -1.0F, 0, 5, 3, 0.0F, true));

        this.finlowerL4 = new AdvancedModelRenderer(this);
        this.finlowerL4.setRotationPoint(5.0F, 3.0F, 1.0F);
        this.segment4.addChild(finlowerL4);
        this.setRotateAngle(finlowerL4, 0.0F, 0.0F, -0.7854F);
        this.finlowerL4.cubeList.add(new ModelBox(finlowerL4, 7, 72, 0.0F, 0.0F, -1.0F, 0, 6, 3, 0.0F, false));

        this.finlowerR4 = new AdvancedModelRenderer(this);
        this.finlowerR4.setRotationPoint(-5.0F, 3.0F, 1.0F);
        this.segment4.addChild(finlowerR4);
        this.setRotateAngle(finlowerR4, 0.0F, 0.0F, 0.7854F);
        this.finlowerR4.cubeList.add(new ModelBox(finlowerR4, 7, 72, 0.0F, 0.0F, -1.0F, 0, 6, 3, 0.0F, true));

        this.segment5 = new AdvancedModelRenderer(this);
        this.segment5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment4.addChild(segment5);
        this.segment5.cubeList.add(new ModelBox(segment5, 57, 0, -4.5F, -2.0F, 0.0F, 9, 5, 3, 0.0F, false));

        this.finupperL5 = new AdvancedModelRenderer(this);
        this.finupperL5.setRotationPoint(4.5F, -2.0F, 1.0F);
        this.segment5.addChild(finupperL5);
        this.setRotateAngle(finupperL5, 0.0F, 0.0F, 0.7854F);
        this.finupperL5.cubeList.add(new ModelBox(finupperL5, 21, 73, 0.0F, -5.0F, -1.0F, 0, 5, 3, 0.0F, false));

        this.finupperR5 = new AdvancedModelRenderer(this);
        this.finupperR5.setRotationPoint(-4.5F, -2.0F, 1.0F);
        this.segment5.addChild(finupperR5);
        this.setRotateAngle(finupperR5, 0.0F, 0.0F, -0.7854F);
        this.finupperR5.cubeList.add(new ModelBox(finupperR5, 21, 73, 0.0F, -5.0F, -1.0F, 0, 5, 3, 0.0F, true));

        this.finlowerL5 = new AdvancedModelRenderer(this);
        this.finlowerL5.setRotationPoint(4.5F, 3.0F, 1.0F);
        this.segment5.addChild(finlowerL5);
        this.setRotateAngle(finlowerL5, 0.0F, 0.0F, -0.7854F);
        this.finlowerL5.cubeList.add(new ModelBox(finlowerL5, 0, 72, 0.0F, 0.0F, -1.0F, 0, 6, 3, 0.0F, false));

        this.finlowerR5 = new AdvancedModelRenderer(this);
        this.finlowerR5.setRotationPoint(-4.5F, 3.0F, 1.0F);
        this.segment5.addChild(finlowerR5);
        this.setRotateAngle(finlowerR5, 0.0F, 0.0F, 0.7854F);
        this.finlowerR5.cubeList.add(new ModelBox(finlowerR5, 0, 72, 0.0F, 0.0F, -1.0F, 0, 6, 3, 0.0F, true));

        this.segment6 = new AdvancedModelRenderer(this);
        this.segment6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment5.addChild(segment6);
        this.segment6.cubeList.add(new ModelBox(segment6, 52, 34, -4.5F, -2.01F, 0.0F, 9, 5, 3, 0.0F, false));

        this.finupperL6 = new AdvancedModelRenderer(this);
        this.finupperL6.setRotationPoint(4.5F, -2.0F, 1.0F);
        this.segment6.addChild(finupperL6);
        this.setRotateAngle(finupperL6, 0.0F, 0.0F, 0.7854F);
        this.finupperL6.cubeList.add(new ModelBox(finupperL6, 14, 72, 0.0F, -5.0F, -1.0F, 0, 5, 3, 0.0F, false));

        this.finupperR6 = new AdvancedModelRenderer(this);
        this.finupperR6.setRotationPoint(-4.5F, -2.0F, 1.0F);
        this.segment6.addChild(finupperR6);
        this.setRotateAngle(finupperR6, 0.0F, 0.0F, -0.7854F);
        this.finupperR6.cubeList.add(new ModelBox(finupperR6, 14, 72, 0.0F, -5.0F, -1.0F, 0, 5, 3, 0.0F, true));

        this.finlowerL6 = new AdvancedModelRenderer(this);
        this.finlowerL6.setRotationPoint(4.5F, 3.0F, 1.0F);
        this.segment6.addChild(finlowerL6);
        this.setRotateAngle(finlowerL6, 0.0F, 0.0F, -0.7854F);
        this.finlowerL6.cubeList.add(new ModelBox(finlowerL6, 71, 45, 0.0F, 0.0F, -1.0F, 0, 6, 3, 0.0F, false));

        this.finlowerR6 = new AdvancedModelRenderer(this);
        this.finlowerR6.setRotationPoint(-4.5F, 3.0F, 1.0F);
        this.segment6.addChild(finlowerR6);
        this.setRotateAngle(finlowerR6, 0.0F, 0.0F, 0.7854F);
        this.finlowerR6.cubeList.add(new ModelBox(finlowerR6, 71, 45, 0.0F, 0.0F, -1.0F, 0, 6, 3, 0.0F, true));

        this.segment7 = new AdvancedModelRenderer(this);
        this.segment7.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment6.addChild(segment7);
        this.segment7.cubeList.add(new ModelBox(segment7, 0, 0, -4.0F, -2.0F, 0.0F, 8, 5, 3, 0.0F, false));

        this.finupperL7 = new AdvancedModelRenderer(this);
        this.finupperL7.setRotationPoint(4.0F, -2.0F, 1.0F);
        this.segment7.addChild(finupperL7);
        this.setRotateAngle(finupperL7, 0.0F, 0.0F, 0.7854F);
        this.finupperL7.cubeList.add(new ModelBox(finupperL7, 45, 74, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finupperR7 = new AdvancedModelRenderer(this);
        this.finupperR7.setRotationPoint(-4.0F, -2.0F, 1.0F);
        this.segment7.addChild(finupperR7);
        this.setRotateAngle(finupperR7, 0.0F, 0.0F, -0.7854F);
        this.finupperR7.cubeList.add(new ModelBox(finupperR7, 45, 74, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, true));

        this.finlowerL7 = new AdvancedModelRenderer(this);
        this.finlowerL7.setRotationPoint(4.0F, 3.0F, 1.0F);
        this.segment7.addChild(finlowerL7);
        this.setRotateAngle(finlowerL7, 0.0F, 0.0F, -0.7854F);
        this.finlowerL7.cubeList.add(new ModelBox(finlowerL7, 41, 0, 0.0F, 0.0F, -1.0F, 0, 5, 3, 0.0F, false));

        this.finlowerR7 = new AdvancedModelRenderer(this);
        this.finlowerR7.setRotationPoint(-4.0F, 3.0F, 1.0F);
        this.segment7.addChild(finlowerR7);
        this.setRotateAngle(finlowerR7, 0.0F, 0.0F, 0.7854F);
        this.finlowerR7.cubeList.add(new ModelBox(finlowerR7, 41, 0, 0.0F, 0.0F, -1.0F, 0, 5, 3, 0.0F, true));

        this.segment8 = new AdvancedModelRenderer(this);
        this.segment8.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment7.addChild(segment8);
        this.segment8.cubeList.add(new ModelBox(segment8, 27, 57, -3.5F, -1.5F, 0.0F, 7, 4, 3, 0.0F, false));

        this.finupperL8 = new AdvancedModelRenderer(this);
        this.finupperL8.setRotationPoint(3.5F, -1.5F, 1.0F);
        this.segment8.addChild(finupperL8);
        this.setRotateAngle(finupperL8, 0.0F, 0.0F, 0.7854F);
        this.finupperL8.cubeList.add(new ModelBox(finupperL8, 13, 9, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finupperR8 = new AdvancedModelRenderer(this);
        this.finupperR8.setRotationPoint(-3.5F, -1.5F, 1.0F);
        this.segment8.addChild(finupperR8);
        this.setRotateAngle(finupperR8, 0.0F, 0.0F, -0.7854F);
        this.finupperR8.cubeList.add(new ModelBox(finupperR8, 13, 9, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, true));

        this.finlowerL8 = new AdvancedModelRenderer(this);
        this.finlowerL8.setRotationPoint(3.5F, 2.5F, 1.0F);
        this.segment8.addChild(finlowerL8);
        this.setRotateAngle(finlowerL8, 0.0F, 0.0F, -0.7854F);
        this.finlowerL8.cubeList.add(new ModelBox(finlowerL8, 0, 9, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finlowerR8 = new AdvancedModelRenderer(this);
        this.finlowerR8.setRotationPoint(-3.5F, 2.5F, 1.0F);
        this.segment8.addChild(finlowerR8);
        this.setRotateAngle(finlowerR8, 0.0F, 0.0F, 0.7854F);
        this.finlowerR8.cubeList.add(new ModelBox(finlowerR8, 0, 9, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, true));

        this.segment9 = new AdvancedModelRenderer(this);
        this.segment9.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment8.addChild(segment9);
        this.segment9.cubeList.add(new ModelBox(segment9, 0, 41, -3.0F, -1.5F, 0.0F, 6, 4, 3, 0.0F, false));

        this.finlowerL9 = new AdvancedModelRenderer(this);
        this.finlowerL9.setRotationPoint(3.0F, 2.5F, 1.0F);
        this.segment9.addChild(finlowerL9);
        this.setRotateAngle(finlowerL9, 0.0F, 0.0F, -0.7854F);
        this.finlowerL9.cubeList.add(new ModelBox(finlowerL9, 19, 41, 0.0F, 0.0F, -1.0F, 0, 3, 3, 0.0F, false));

        this.finlowerR9 = new AdvancedModelRenderer(this);
        this.finlowerR9.setRotationPoint(-3.0F, 2.5F, 1.0F);
        this.segment9.addChild(finlowerR9);
        this.setRotateAngle(finlowerR9, 0.0F, 0.0F, 0.7854F);
        this.finlowerR9.cubeList.add(new ModelBox(finlowerR9, 19, 41, 0.0F, 0.0F, -1.0F, 0, 3, 3, 0.0F, true));

        this.finupperL9 = new AdvancedModelRenderer(this);
        this.finupperL9.setRotationPoint(3.0F, -1.5F, 1.0F);
        this.segment9.addChild(finupperL9);
        this.setRotateAngle(finupperL9, 0.0F, 0.0F, 0.7854F);
        this.finupperL9.cubeList.add(new ModelBox(finupperL9, 32, 36, 0.0F, -3.0F, -1.0F, 0, 3, 3, 0.0F, false));

        this.finupperR9 = new AdvancedModelRenderer(this);
        this.finupperR9.setRotationPoint(-3.0F, -1.5F, 1.0F);
        this.segment9.addChild(finupperR9);
        this.setRotateAngle(finupperR9, 0.0F, 0.0F, -0.7854F);
        this.finupperR9.cubeList.add(new ModelBox(finupperR9, 32, 36, 0.0F, -3.0F, -1.0F, 0, 3, 3, 0.0F, true));

        this.segment10 = new AdvancedModelRenderer(this);
        this.segment10.setRotationPoint(0.0F, 0.5F, 3.0F);
        this.segment9.addChild(segment10);
        this.segment10.cubeList.add(new ModelBox(segment10, 48, 57, -2.5F, -1.5F, 0.0F, 5, 3, 2, 0.0F, false));

        this.finupperL10 = new AdvancedModelRenderer(this);
        this.finupperL10.setRotationPoint(2.5F, -1.5F, 1.0F);
        this.segment10.addChild(finupperL10);
        this.setRotateAngle(finupperL10, 0.0F, 0.0F, 0.7854F);
        this.finupperL10.cubeList.add(new ModelBox(finupperL10, 19, 25, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.finupperR10 = new AdvancedModelRenderer(this);
        this.finupperR10.setRotationPoint(-2.5F, -1.5F, 1.0F);
        this.segment10.addChild(finupperR10);
        this.setRotateAngle(finupperR10, 0.0F, 0.0F, -0.7854F);
        this.finupperR10.cubeList.add(new ModelBox(finupperR10, 19, 25, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.finlowerL10 = new AdvancedModelRenderer(this);
        this.finlowerL10.setRotationPoint(2.5F, 1.5F, 1.0F);
        this.segment10.addChild(finlowerL10);
        this.setRotateAngle(finlowerL10, 0.0F, 0.0F, -0.7854F);
        this.finlowerL10.cubeList.add(new ModelBox(finlowerL10, 19, 18, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.finlowerR10 = new AdvancedModelRenderer(this);
        this.finlowerR10.setRotationPoint(-2.5F, 1.5F, 1.0F);
        this.segment10.addChild(finlowerR10);
        this.setRotateAngle(finlowerR10, 0.0F, 0.0F, 0.7854F);
        this.finlowerR10.cubeList.add(new ModelBox(finlowerR10, 19, 18, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.segment11 = new AdvancedModelRenderer(this);
        this.segment11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment10.addChild(segment11);
        this.segment11.cubeList.add(new ModelBox(segment11, 27, 52, -2.0F, -1.0F, 0.0F, 4, 2, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.render(f5);
    }

    public void renderStaticWall(float f) {
        this.bone.rotateAngleY = (float) Math.toRadians(90);
        this.bone.offsetX = -0.05F;
        this.bone.offsetZ = 0.1F;
        this.bone.offsetY = -0.15F;
        this.bone.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(bone, -0.1F, 0.0F, 0.1F);
        this.setRotateAngle(head, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(segment1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(segment2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(segment3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(segment4, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(segment5, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(segment6, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(segment7, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(segment8, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(segment9, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(segment10, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(segment11, 0.0F, -0.1F, 0.0F);
        this.bone.offsetZ = -0.1F;
        this.bone.offsetY = -0.2F;
        this.bone.offsetX = 0.005F;
        this.bone.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(bone, 0.1F, 0.0F, 0.1F);
        this.setRotateAngle(head, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(segment1, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(segment2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(segment3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(segment4, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(segment5, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(segment6, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(segment7, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(segment8, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(segment9, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(segment10, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(segment11, 0.0F, 0.0F, 0.0F);
        this.bone.offsetZ = -0.0F;
        this.bone.offsetY = -0.05F;
        this.bone.offsetX = 0.005F;
        this.bone.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.bone.offsetY = -1.0F;
        this.bone.offsetX = 0.2F;
        this.bone.offsetZ = 2.0F;
        this.bone.rotateAngleY = (float)Math.toRadians(200);
        this.bone.rotateAngleX = (float)Math.toRadians(8);
        this.bone.rotateAngleZ = (float)Math.toRadians(-8);
        this.bone.scaleChildren = true;
        float scaler = 1.2F;
        this.bone.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(bone, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(head, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(segment1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(segment2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(segment3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(segment4, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(segment5, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(segment6, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(segment7, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(segment8, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(segment9, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(segment10, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(segment11, 0.0F, -0.1F, 0.0F);
        //End of pose, now render the model:
        this.bone.render(f);
        //Reset rotations, positions and sizing:
        this.bone.setScale(1.0F, 1.0F, 1.0F);
        this.bone.scaleChildren = false;
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
        this.bone.offsetY = 0F;

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
        this.flap(this.shaftL6,0.2F * still, -0.2F, false, 0F, 0F,  f2, 0.5F);

        this.flap(this.shaftL2,0.2F * still, -0.2F, true, 0.75F, 0F, f2, 0.5F);
        this.flap(this.shaftL7,0.2F * still, -0.2F, false, 0.75F, 0F,  f2, 0.5F);

        this.flap(this.shaftL3,0.2F * still, -0.2F, true, 1.5F, 0F, f2, 0.5F);
        this.flap(this.shaftL8,0.2F * still, -0.2F, false, 1.5F, 0F,  f2, 0.5F);

        this.flap(this.shaftL4,0.2F * still, -0.2F, true, 2.25F, 0F, f2, 0.5F);
        this.flap(this.shaftL9,0.2F * still, -0.2F, false, 2.25F, 0F,  f2, 0.5F);

        this.flap(this.shaftL5,0.2F * still, -0.2F, true, 3.0F, 0F, f2, 0.5F);
        this.flap(this.shaftL10,0.2F * still, -0.2F, false, 3.0F, 0F,  f2, 0.5F);


        this.walk(this.shaftL,0.1F * still, -0.12F, true, 0F, 0F, f2, 0.5F);
        this.walk(this.shaftL6,0.1F * still, -0.12F, false, 0F, 0F,  f2, 0.5F);

        this.walk(this.shaftL2,0.1F * still, -0.12F, true, 0.75F, 0F, f2, 0.5F);
        this.walk(this.shaftL7,0.1F * still, -0.12F, false, 0.75F, 0F,  f2, 0.5F);

        this.walk(this.shaftL3,0.1F * still, -0.12F, true, 1.5F, 0F, f2, 0.5F);
        this.walk(this.shaftL8,0.1F * still, -0.12F, false, 1.5F, 0F,  f2, 0.5F);

        this.walk(this.shaftL4,0.1F * still, -0.12F, true, 2.25F, 0F, f2, 0.5F);
        this.walk(this.shaftL9,0.1F * still, -0.12F, false, 2.25F, 0F,  f2, 0.5F);

        this.walk(this.shaftL5,0.1F * still, -0.12F, true, 3.0F, 0F, f2, 0.5F);
        this.walk(this.shaftL10,0.1F * still, -0.12F, false, 3.0F, 0F,  f2, 0.5F);

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

        this.bob(bone, -speed, 0.6F, false, f2, 1);

        if (!e.isInWater()) {
            //this.Body.rotateAngleZ = (float) Math.toRadians(90);
            this.bone.offsetY = 0.3F;
            this.chainWave(Body, speed * 2F, 0.3F, -3, f2, 0.2F);
            this.bob(bone, -speed * 1.5F, 5F, false, f2, 1);
        }

    }
}
