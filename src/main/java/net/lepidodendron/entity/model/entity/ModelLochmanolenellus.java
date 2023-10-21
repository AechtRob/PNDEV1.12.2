package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraLochmanolenellus;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLochmanolenellus extends AdvancedModelBase {
    private final AdvancedModelRenderer Lochmanolenellus;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer LLeg1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer LLeg2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer RLeg1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer RLeg2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer RAntennae1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer LAntennae1;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Thorax1;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer LLeg3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer LLeg4;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer RLeg3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer RLeg4;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer Thorax2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer LLeg5;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer RLeg5;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer Thorax3;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer LLeg6;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer RLeg6;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer Pygidium;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer LLeg7;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer RLeg7;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer LAntennae2;
    private final AdvancedModelRenderer RAntennae2;

    public ModelLochmanolenellus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Lochmanolenellus = new AdvancedModelRenderer(this);
        this.Lochmanolenellus.setRotationPoint(0.0F, 22.75F, -3.0F);
        this.Lochmanolenellus.cubeList.add(new ModelBox(Lochmanolenellus, 16, 19, -1.5F, -0.9F, -4.0F, 3, 1, 4, 0.0F, false));
        this.Lochmanolenellus.cubeList.add(new ModelBox(Lochmanolenellus, 0, 0, 1.5F, -0.9F, -3.0F, 1, 1, 2, 0.0F, false));
        this.Lochmanolenellus.cubeList.add(new ModelBox(Lochmanolenellus, 0, 0, -2.5F, -0.9F, -3.0F, 1, 1, 2, 0.0F, true));
        this.Lochmanolenellus.cubeList.add(new ModelBox(Lochmanolenellus, 0, 6, -4.5F, -0.5F, -5.0F, 9, 1, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, 0.5F, -5.0F);
        this.Lochmanolenellus.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3229F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 24, -3.2F, -1.0F, 0.0F, 3, 1, 1, -0.01F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 3, -0.95F, -1.0F, 0.0F, 1, 1, 1, -0.02F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(4.95F, 0.25F, -2.95F);
        this.Lochmanolenellus.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.9163F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 18, 0.9F, -0.25F, 1.25F, 4, 0, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.5F, 0.5F, -5.0F);
        this.Lochmanolenellus.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.3229F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 3, -0.05F, -1.0F, 0.0F, 1, 1, 1, -0.02F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 24, 0.2F, -1.0F, 0.0F, 3, 1, 1, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(4.75F, 0.25F, -2.75F);
        this.Lochmanolenellus.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2356F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 8, -1.05F, -0.25F, -1.15F, 5, 0, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.95F, 0.25F, -2.95F);
        this.Lochmanolenellus.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.9163F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 18, -4.9F, -0.25F, 1.25F, 4, 0, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-4.75F, 0.25F, -2.75F);
        this.Lochmanolenellus.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.2356F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 8, -3.95F, -0.25F, -1.15F, 5, 0, 2, 0.0F, true));

        this.LLeg1 = new AdvancedModelRenderer(this);
        this.LLeg1.setRotationPoint(1.0F, 0.5F, -3.5F);
        this.Lochmanolenellus.addChild(LLeg1);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -0.25F);
        this.LLeg1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.2182F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 19, 0.0F, 0.0F, -0.25F, 3, 0, 1, 0.0F, false));

        this.LLeg2 = new AdvancedModelRenderer(this);
        this.LLeg2.setRotationPoint(1.0F, 0.5F, -1.5F);
        this.Lochmanolenellus.addChild(LLeg2);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LLeg2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.2182F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 25, 19, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.RLeg1 = new AdvancedModelRenderer(this);
        this.RLeg1.setRotationPoint(-1.0F, 0.5F, -3.5F);
        this.Lochmanolenellus.addChild(RLeg1);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -0.25F);
        this.RLeg1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.2182F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 19, -3.0F, 0.0F, -0.25F, 3, 0, 1, 0.0F, true));

        this.RLeg2 = new AdvancedModelRenderer(this);
        this.RLeg2.setRotationPoint(-1.0F, 0.5F, -1.5F);
        this.Lochmanolenellus.addChild(RLeg2);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RLeg2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.2182F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 25, 19, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.RAntennae1 = new AdvancedModelRenderer(this);
        this.RAntennae1.setRotationPoint(-2.0F, 0.25F, -4.5F);
        this.Lochmanolenellus.addChild(RAntennae1);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.0F, 0.25F, 7.5F);
        this.RAntennae1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.7854F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -3.5F, -0.25F, -12.75F, 8, 0, 6, 0.0F, true));

        this.LAntennae1 = new AdvancedModelRenderer(this);
        this.LAntennae1.setRotationPoint(2.0F, 0.25F, -4.5F);
        this.Lochmanolenellus.addChild(LAntennae1);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.0F, 0.25F, 7.5F);
        this.LAntennae1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.7854F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -4.5F, -0.25F, -12.75F, 8, 0, 6, 0.0F, false));

        this.Thorax1 = new AdvancedModelRenderer(this);
        this.Thorax1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Lochmanolenellus.addChild(Thorax1);
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 0, 12, -4.0F, -0.5F, -1.5F, 8, 1, 5, -0.01F, false));
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 0, 23, -1.0F, -0.75F, -0.5F, 2, 1, 4, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.95F, 0.05F, 0.25F);
        this.Thorax1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.7854F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-4.75F, 0.25F, -2.95F);
        this.Thorax1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 1.0472F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 10, -7.65F, -0.25F, 3.0F, 4, 0, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-3.95F, 0.05F, 1.25F);
        this.Thorax1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.7854F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 1, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(3.95F, 0.05F, 1.25F);
        this.Thorax1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.7854F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 1, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(4.75F, 0.25F, -2.95F);
        this.Thorax1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -1.0472F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 22, 10, 3.65F, -0.25F, 3.0F, 4, 0, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(3.95F, 0.05F, 0.25F);
        this.Thorax1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.7854F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(3.0F, 0.05F, 3.0F);
        this.Thorax1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.7854F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 3, 5, 0.25F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-3.0F, 0.05F, 3.0F);
        this.Thorax1.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.7854F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 3, 5, -1.25F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.LLeg3 = new AdvancedModelRenderer(this);
        this.LLeg3.setRotationPoint(1.0F, 0.5F, 0.5F);
        this.Thorax1.addChild(LLeg3);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LLeg3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.2182F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 25, 19, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.LLeg4 = new AdvancedModelRenderer(this);
        this.LLeg4.setRotationPoint(1.0F, 0.5F, 2.5F);
        this.Thorax1.addChild(LLeg4);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LLeg4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 0.2182F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 25, 19, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.RLeg3 = new AdvancedModelRenderer(this);
        this.RLeg3.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.Thorax1.addChild(RLeg3);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RLeg3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.2182F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 25, 19, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.RLeg4 = new AdvancedModelRenderer(this);
        this.RLeg4.setRotationPoint(-1.0F, 0.5F, 2.5F);
        this.Thorax1.addChild(RLeg4);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RLeg4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.2182F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 25, 19, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.Thorax2 = new AdvancedModelRenderer(this);
        this.Thorax2.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Thorax1.addChild(Thorax2);
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 0, 18, -3.0F, -0.5F, -1.0F, 6, 1, 4, -0.02F, false));
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 8, 23, -1.0F, -0.75F, 0.0F, 2, 1, 3, -0.02F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.95F, 0.05F, 0.25F);
        this.Thorax2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.9599F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 3, 3, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-2.95F, 0.05F, 1.0F);
        this.Thorax2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.9599F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 4, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-2.95F, 0.05F, 1.75F);
        this.Thorax2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 1.0036F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 4, 1, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-2.95F, 0.05F, 2.5F);
        this.Thorax2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 1.0472F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 4, 4, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-2.2F, 0.05F, 2.3F);
        this.Thorax2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 1.0908F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 12, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(2.2F, 0.05F, 2.3F);
        this.Thorax2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -1.0908F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 12, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(2.95F, 0.05F, 2.5F);
        this.Thorax2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -1.0472F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 4, 4, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(2.95F, 0.05F, 1.75F);
        this.Thorax2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -1.0036F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 4, 1, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(2.95F, 0.05F, 1.0F);
        this.Thorax2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.9599F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 4, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(2.95F, 0.05F, 0.25F);
        this.Thorax2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -0.9599F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 3, 3, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.LLeg5 = new AdvancedModelRenderer(this);
        this.LLeg5.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.Thorax2.addChild(LLeg5);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LLeg5.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, 0.2182F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 25, 19, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.RLeg5 = new AdvancedModelRenderer(this);
        this.RLeg5.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.Thorax2.addChild(RLeg5);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RLeg5.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, -0.2182F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 25, 19, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.Thorax3 = new AdvancedModelRenderer(this);
        this.Thorax3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Thorax2.addChild(Thorax3);
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 21, 12, -2.0F, -0.5F, -1.0F, 4, 1, 3, -0.03F, false));
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 15, 24, -0.5F, -0.75F, -1.0F, 1, 1, 3, -0.03F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.95F, 0.05F, 0.25F);
        this.Thorax3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 1.0908F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 7, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.95F, 0.05F, 1.0F);
        this.Thorax3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 1.1781F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 8, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.95F, 0.05F, 1.75F);
        this.Thorax3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 1.309F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 9, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.95F, 0.05F, 1.75F);
        this.Thorax3.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, -1.309F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 9, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(1.95F, 0.05F, 1.0F);
        this.Thorax3.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, -1.1781F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 8, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(1.95F, 0.05F, 0.25F);
        this.Thorax3.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, -1.0908F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 7, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.LLeg6 = new AdvancedModelRenderer(this);
        this.LLeg6.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Thorax3.addChild(LLeg6);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LLeg6.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, 0.2182F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 25, 19, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.RLeg6 = new AdvancedModelRenderer(this);
        this.RLeg6.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Thorax3.addChild(RLeg6);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RLeg6.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, -0.2182F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 25, 19, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.Pygidium = new AdvancedModelRenderer(this);
        this.Pygidium.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Thorax3.addChild(Pygidium);
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 24, 16, -1.5F, -0.5F, -1.0F, 3, 1, 2, -0.04F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 0, 5, -0.5F, -0.5F, 0.75F, 1, 1, 1, -0.05F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-1.45F, 0.05F, 0.0F);
        this.Pygidium.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 1.309F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 10, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.75F, 0.05F, 1.0F);
        this.Pygidium.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 1.5272F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 13, -0.75F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-1.25F, 0.05F, 1.0F);
        this.Pygidium.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, 1.3963F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 2, 13, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(1.25F, 0.05F, 1.0F);
        this.Pygidium.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, -1.3963F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 2, 13, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.75F, 0.05F, 1.0F);
        this.Pygidium.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, -1.5272F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 13, -0.25F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(1.45F, 0.05F, 0.0F);
        this.Pygidium.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, -1.309F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 10, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.LLeg7 = new AdvancedModelRenderer(this);
        this.LLeg7.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Pygidium.addChild(LLeg7);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LLeg7.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.0F, 0.2182F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 25, 19, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.RLeg7 = new AdvancedModelRenderer(this);
        this.RLeg7.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Pygidium.addChild(RLeg7);


        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RLeg7.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, 0.0F, -0.2182F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 25, 19, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.LAntennae2 = new AdvancedModelRenderer(this);
        this.LAntennae2.setRotationPoint(1.25F, 0.25F, 1.0F);
        this.Pygidium.addChild(LAntennae2);
        this.LAntennae2.cubeList.add(new ModelBox(LAntennae2, 15, 0, -0.5F, 0.0F, -0.25F, 3, 0, 8, 0.0F, false));

        this.RAntennae2 = new AdvancedModelRenderer(this);
        this.RAntennae2.setRotationPoint(-1.25F, 0.25F, 1.0F);
        this.Pygidium.addChild(RAntennae2);
        this.RAntennae2.cubeList.add(new ModelBox(RAntennae2, 15, 0, -2.5F, 0.0F, -0.25F, 3, 0, 8, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Lochmanolenellus.render(f5 * 0.18F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = 0.1F;
        this.Lochmanolenellus.render(0.025f);
        //GlStateManager.enableCull();
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
        this.Lochmanolenellus.offsetY = 1.2F;

        AdvancedModelRenderer[] legsL = {this.LLeg1, this.LLeg2, this.LLeg3, this.LLeg4, this.LLeg5, this.LLeg6, this.LLeg7};
        AdvancedModelRenderer[] legsR = {this.RLeg1, this.RLeg2, this.RLeg3, this.RLeg4, this.RLeg5, this.RLeg6, this.RLeg7};
        AdvancedModelRenderer[] Thorax = {this.Thorax1, this.Thorax2, this.Thorax3};

        if (((EntityPrehistoricFloraLochmanolenellus) e).getIsMoving()) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

            this.chainSwing(Thorax, 0.2F, 0.022F, 1.5, f2, 0.8F);

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


        }

        this.swing(LAntennae1, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(RAntennae1, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        this.swing(LAntennae2, 0.3F, -0.2F, false, 0, 0.2F, f2, 0.8F);
        this.swing(RAntennae2, 0.3F, 0.2F, false, 0, -0.2F, f2, 0.8F);
    }
}
