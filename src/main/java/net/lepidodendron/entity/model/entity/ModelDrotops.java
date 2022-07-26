package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelDrotops extends AdvancedModelBase {
    private final AdvancedModelRenderer Drotops;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer AntennaeLeft;
    private final AdvancedModelRenderer AntennaeRight;
    private final AdvancedModelRenderer LLeg1;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer LLeg2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer RLeg1;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer RLeg2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Thorax1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer LLeg3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer LLeg4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer RLeg3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer RLeg4;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Thorax2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer LLeg5;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer RLeg5;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer Thorax3;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer LLeg6;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer LLeg7;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer RLeg6;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer RLeg7;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer Pygidium;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer LLeg8;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer RLeg8;
    private final AdvancedModelRenderer cube_r45;

    public ModelDrotops() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Drotops = new AdvancedModelRenderer(this);
        this.Drotops.setRotationPoint(0.0F, 22.9F, -2.0F);
        this.Drotops.cubeList.add(new ModelBox(Drotops, 17, 14, -4.0F, -0.4F, -1.0F, 8, 1, 1, 0.0F, false));
        this.Drotops.cubeList.add(new ModelBox(Drotops, 0, 28, -1.0F, -0.4F, -4.0F, 2, 1, 3, 0.0F, false));
        this.Drotops.cubeList.add(new ModelBox(Drotops, 0, 25, -2.0F, -1.15F, -2.0F, 4, 1, 2, 0.0F, false));
        this.Drotops.cubeList.add(new ModelBox(Drotops, 19, 0, -3.0F, -0.65F, -1.0F, 6, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, 0.0F, -2.0F);
        this.Drotops.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 23, 0.0F, -1.0F, -1.55F, 1, 1, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 0.6F, -4.0F);
        this.Drotops.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.7854F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 23, -4.0F, -1.0F, 0.0F, 4, 1, 2, -0.01F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -4.25F, -1.0F, 0.0F, 1, 1, 1, -0.02F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.0F, 0.0F, -2.0F);
        this.Drotops.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.7854F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 23, -1.0F, -1.0F, -1.55F, 1, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.35F, -3.75F);
        this.Drotops.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 11, 23, -1.0F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 0.6F, -4.0F);
        this.Drotops.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.7854F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 3.25F, -1.0F, 0.0F, 1, 1, 1, -0.02F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 23, 0.0F, -1.0F, 0.0F, 4, 1, 2, -0.01F, false));

        this.AntennaeLeft = new AdvancedModelRenderer(this);
        this.AntennaeLeft.setRotationPoint(1.5F, 0.35F, -3.5F);
        this.Drotops.addChild(AntennaeLeft);
        this.AntennaeLeft.cubeList.add(new ModelBox(AntennaeLeft, 0, 0, -0.5F, 0.0F, -4.5F, 7, 0, 5, 0.0F, false));

        this.AntennaeRight = new AdvancedModelRenderer(this);
        this.AntennaeRight.setRotationPoint(-1.5F, 0.35F, -3.5F);
        this.Drotops.addChild(AntennaeRight);
        this.AntennaeRight.cubeList.add(new ModelBox(AntennaeRight, 0, 0, -6.5F, 0.0F, -4.5F, 7, 0, 5, 0.0F, true));

        this.LLeg1 = new AdvancedModelRenderer(this);
        this.LLeg1.setRotationPoint(0.0F, 0.6F, -2.5F);
        this.Drotops.addChild(LLeg1);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.1309F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 5, 24, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.LLeg2 = new AdvancedModelRenderer(this);
        this.LLeg2.setRotationPoint(0.5F, 0.6F, -0.75F);
        this.Drotops.addChild(LLeg2);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.1309F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 5, 24, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.RLeg1 = new AdvancedModelRenderer(this);
        this.RLeg1.setRotationPoint(0.0F, 0.6F, -2.5F);
        this.Drotops.addChild(RLeg1);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.1309F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 24, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, true));

        this.RLeg2 = new AdvancedModelRenderer(this);
        this.RLeg2.setRotationPoint(-0.5F, 0.6F, -0.75F);
        this.Drotops.addChild(RLeg2);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.1309F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 5, 24, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, true));

        this.Thorax1 = new AdvancedModelRenderer(this);
        this.Thorax1.setRotationPoint(0.0F, 0.1F, 0.0F);
        this.Drotops.addChild(Thorax1);
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 0, 17, -3.5F, -0.5F, -0.05F, 7, 1, 3, -0.01F, false));
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 27, 27, -1.0F, -1.0F, -0.05F, 2, 1, 3, -0.01F, false));
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 17, 10, -3.0F, -0.75F, -0.05F, 6, 1, 3, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.25F, -1.5F, 3.95F);
        this.Thorax1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 2.3562F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 18, 1.0F, -1.25F, -4.0F, 0, 2, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -1.25F, 3.95F);
        this.Thorax1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 3.1416F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 13, 1.0F, -1.0F, -4.0F, 0, 1, 3, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -1.5F, 3.95F);
        this.Thorax1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 3.1416F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 2, 1.0F, -1.0F, -3.0F, 0, 1, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(3.25F, -1.5F, 3.95F);
        this.Thorax1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -2.3562F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 18, -1.0F, -1.25F, -4.0F, 0, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, -1.25F, 3.95F);
        this.Thorax1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -3.1416F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 13, -1.0F, -1.0F, -4.0F, 0, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -1.5F, 3.95F);
        this.Thorax1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -3.1416F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 2, -1.0F, -1.0F, -3.0F, 0, 1, 2, 0.0F, false));

        this.LLeg3 = new AdvancedModelRenderer(this);
        this.LLeg3.setRotationPoint(1.0F, 0.5F, 0.95F);
        this.Thorax1.addChild(LLeg3);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.1309F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 5, 24, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.LLeg4 = new AdvancedModelRenderer(this);
        this.LLeg4.setRotationPoint(1.0F, 0.5F, 2.95F);
        this.Thorax1.addChild(LLeg4);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.1309F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 5, 24, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.RLeg3 = new AdvancedModelRenderer(this);
        this.RLeg3.setRotationPoint(-1.0F, 0.5F, 0.95F);
        this.Thorax1.addChild(RLeg3);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.1309F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 5, 24, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, true));

        this.RLeg4 = new AdvancedModelRenderer(this);
        this.RLeg4.setRotationPoint(-1.0F, 0.5F, 2.95F);
        this.Thorax1.addChild(RLeg4);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.1309F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 5, 24, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, true));

        this.Thorax2 = new AdvancedModelRenderer(this);
        this.Thorax2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Thorax1.addChild(Thorax2);
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 9, 27, -1.0F, -1.0F, -0.1F, 2, 1, 3, -0.02F, false));
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 17, 6, -3.0F, -0.75F, -0.1F, 6, 1, 3, -0.02F, false));
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 0, 9, -3.5F, -0.5F, -0.1F, 7, 1, 3, -0.02F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, -1.5F, 3.9F);
        this.Thorax2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 3.1416F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 21, 1.0F, -1.0F, -4.0F, 0, 1, 3, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, -1.25F, 0.9F);
        this.Thorax2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 3.1416F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 4, 1.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-3.25F, -1.5F, 0.9F);
        this.Thorax2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 2.3562F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, 1.0F, -1.25F, -1.0F, 0, 2, 2, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, -1.25F, 0.9F);
        this.Thorax2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -3.1416F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 4, -1.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(3.25F, -1.5F, 0.9F);
        this.Thorax2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -2.3562F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -1.0F, -1.25F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, -1.5F, 3.9F);
        this.Thorax2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -3.1416F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 21, -1.0F, -1.0F, -4.0F, 0, 1, 3, 0.0F, false));

        this.LLeg5 = new AdvancedModelRenderer(this);
        this.LLeg5.setRotationPoint(1.0F, 0.5F, 1.9F);
        this.Thorax2.addChild(LLeg5);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg5.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.1309F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 5, 24, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.RLeg5 = new AdvancedModelRenderer(this);
        this.RLeg5.setRotationPoint(-1.0F, 0.5F, 1.9F);
        this.Thorax2.addChild(RLeg5);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.1309F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 5, 24, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, true));

        this.Thorax3 = new AdvancedModelRenderer(this);
        this.Thorax3.setRotationPoint(0.0F, 0.0F, 2.85F);
        this.Thorax2.addChild(Thorax3);
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 0, 5, -3.5F, -0.5F, 0.0F, 7, 1, 3, -0.03F, false));
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 17, 2, -3.0F, -0.75F, 0.0F, 6, 1, 3, -0.03F, false));
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 20, 26, -1.0F, -1.0F, 0.0F, 2, 1, 3, -0.03F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-3.25F, -1.5F, -2.0F);
        this.Thorax3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, 2.3562F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 16, 24, 1.0F, -1.25F, 2.0F, 0, 2, 3, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0F, -1.25F, 4.0F);
        this.Thorax3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 3.1416F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 5, 1.0F, -1.0F, -3.0F, 0, 1, 1, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.75F, -1.5F, 4.0F);
        this.Thorax3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, 3.1416F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 6, 1.0F, -1.0F, -3.0F, 0, 1, 1, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(3.25F, -1.5F, -2.0F);
        this.Thorax3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, -2.3562F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 16, 24, -1.0F, -1.25F, 2.0F, 0, 2, 3, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(1.0F, -1.25F, 4.0F);
        this.Thorax3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, -3.1416F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 5, -1.0F, -1.0F, -3.0F, 0, 1, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.75F, -1.5F, 4.0F);
        this.Thorax3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, -3.1416F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 6, -1.0F, -1.0F, -3.0F, 0, 1, 1, 0.0F, false));

        this.LLeg6 = new AdvancedModelRenderer(this);
        this.LLeg6.setRotationPoint(1.0F, 0.5F, 1.0F);
        this.Thorax3.addChild(LLeg6);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg6.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, 0.1309F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 5, 24, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.LLeg7 = new AdvancedModelRenderer(this);
        this.LLeg7.setRotationPoint(0.5F, 0.5F, 2.75F);
        this.Thorax3.addChild(LLeg7);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg7.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, 0.1309F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 5, 24, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.RLeg6 = new AdvancedModelRenderer(this);
        this.RLeg6.setRotationPoint(-1.0F, 0.5F, 1.0F);
        this.Thorax3.addChild(RLeg6);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg6.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, -0.1309F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 5, 24, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, true));

        this.RLeg7 = new AdvancedModelRenderer(this);
        this.RLeg7.setRotationPoint(-0.5F, 0.5F, 2.75F);
        this.Thorax3.addChild(RLeg7);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg7.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0F, -0.1309F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 5, 24, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, true));

        this.Pygidium = new AdvancedModelRenderer(this);
        this.Pygidium.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Thorax3.addChild(Pygidium);
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 8, 31, -0.5F, -1.0F, -0.1F, 1, 1, 2, -0.05F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 1, 14, -3.5F, -0.5F, -0.1F, 7, 1, 2, -0.04F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 19, 21, -2.5F, -0.75F, 0.65F, 5, 1, 1, -0.05F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 18, 18, -3.0F, -0.75F, -0.1F, 6, 1, 1, -0.04F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 18, 31, -1.0F, -1.0F, -0.1F, 2, 1, 1, -0.04F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 0, 21, -2.5F, -0.5F, 0.9F, 5, 1, 2, -0.05F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 30, 20, -1.5F, -0.75F, 1.4F, 3, 1, 1, -0.06F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.0F, -1.25F, 3.65F);
        this.Pygidium.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, -3.1416F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 10, -1.0F, -1.0F, -2.0F, 0, 1, 1, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.0F, -1.25F, 0.9F);
        this.Pygidium.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, 3.1416F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 8, 1.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-3.25F, -1.5F, -4.35F);
        this.Pygidium.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, 2.3562F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 9, 1.0F, -1.25F, 5.0F, 0, 1, 1, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(1.0F, -1.25F, 0.9F);
        this.Pygidium.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, -3.1416F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 8, -1.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(3.25F, -1.5F, -4.35F);
        this.Pygidium.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, -2.3562F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 9, -1.0F, -1.25F, 5.0F, 0, 1, 1, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-1.0F, -1.5F, 1.9F);
        this.Pygidium.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, -3.1416F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 12, -1.0F, -1.0F, -2.0F, 0, 1, 1, 0.0F, false));

        this.LLeg8 = new AdvancedModelRenderer(this);
        this.LLeg8.setRotationPoint(0.0F, 0.5F, 1.4F);
        this.Pygidium.addChild(LLeg8);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg8.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, 0.1309F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 5, 24, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.RLeg8 = new AdvancedModelRenderer(this);
        this.RLeg8.setRotationPoint(0.0F, 0.5F, 1.4F);
        this.Pygidium.addChild(RLeg8);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg8.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.0F, -0.1309F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 5, 24, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Drotops.render(f5 * 0.25F);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableCull();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //this.Drotops.offsetZ = 0.1F;
        this.Drotops.render(0.022f);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.Drotops.offsetY = 1.1F;

        AdvancedModelRenderer[] legsL = {this.LLeg1, this.LLeg2, this.LLeg3, this.LLeg4, this.LLeg5, this.LLeg6, this.LLeg7, this.LLeg8};
        AdvancedModelRenderer[] legsR = {this.RLeg1, this.RLeg2, this.RLeg3, this.RLeg4, this.RLeg5, this.RLeg6, this.RLeg7, this.RLeg8};

        this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
        this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

        this.swing(AntennaeLeft, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(AntennaeRight, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        this.flap(LLeg1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
        this.flap(RLeg1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
        this.flap(LLeg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg6, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg6, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg7, 0.5F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg7, 0.5F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg8, 0.5F, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg8, 0.5F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);

    }
}
