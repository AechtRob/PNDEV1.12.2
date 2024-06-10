package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraHungioides;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelHungioides extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Hungioides;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer AntennaeL;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer AntennaeR;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer LLeg1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer LLeg2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer RLeg1;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer RLeg2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Thorax1;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer LLeg3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer LLeg4;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer RLeg3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Rleg4;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer Thorax2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer LLeg5;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer LLeg6;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer RLeg5;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer RLeg6;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer Thorax3;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer LLeg7;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer RLeg7;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer Thorax4;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer LLeg8;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer LLeg9;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer RLeg8;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer RLeg9;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer Thorax5;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer LLeg10;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer RLeg10;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer Pygidium;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer LLeg11;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer RLeg12;
    private final AdvancedModelRenderer cube_r50;

    public ModelHungioides() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Hungioides = new AdvancedModelRenderer(this);
        this.Hungioides.setRotationPoint(0.0F, 22.25F, 0.0F);


        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Hungioides.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 12, -4.0F, -0.9F, -8.0F, 8, 2, 8, 0.001F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 1, 23, -2.5F, -1.45F, -7.0F, 5, 1, 7, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 5, 2.25F, -1.45F, -4.0F, 2, 1, 3, -0.001F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 5, -4.25F, -1.45F, -4.0F, 2, 1, 3, -0.001F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Cephalon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0463F, -0.4246F, -0.2811F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -7.5117F, -1.5885F, 2.8F, 1, 1, 4, -0.001F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0971F, -1.1213F, -0.3496F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 12, -4.9617F, -1.5885F, 1.15F, 1, 1, 3, -0.001F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0589F, -0.7732F, -0.3032F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 12, -6.0617F, -1.5885F, 2.2F, 1, 1, 3, -0.001F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0463F, 0.4246F, 0.2811F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 6.5117F, -1.5885F, 2.8F, 1, 1, 4, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Cephalon.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0971F, 1.1213F, 0.3496F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 12, 3.9617F, -1.5885F, 1.15F, 1, 1, 3, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Cephalon.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0589F, 0.7732F, 0.3032F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 12, 5.0617F, -1.5885F, 2.2F, 1, 1, 3, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Cephalon.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0421F, 0.0113F, -0.2616F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -9.7117F, -1.5885F, -3.0F, 6, 1, 11, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Cephalon.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0421F, -0.0113F, 0.2616F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 3.7117F, -1.5885F, -3.0F, 6, 1, 11, 0.0F, false));

        this.AntennaeL = new AdvancedModelRenderer(this);
        this.AntennaeL.setRotationPoint(1.4F, 1.25F, -7.5F);
        this.Cephalon.addChild(AntennaeL);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.4F, 5.85F, 15.5F);
        this.AntennaeL.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.7854F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 0, -10.5F, -5.9F, -18.0F, 11, 0, 6, 0.0F, false));

        this.AntennaeR = new AdvancedModelRenderer(this);
        this.AntennaeR.setRotationPoint(-1.4F, 1.25F, -7.5F);
        this.Cephalon.addChild(AntennaeR);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.4F, 5.85F, 15.5F);
        this.AntennaeR.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.7854F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 0, -0.5F, -5.9F, -18.0F, 11, 0, 6, 0.0F, true));

        this.LLeg1 = new AdvancedModelRenderer(this);
        this.LLeg1.setRotationPoint(1.4F, 1.15F, -3.5F);
        this.Cephalon.addChild(LLeg1);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.4F, 5.95F, 11.5F);
        this.LLeg1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.0873F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 31, 21, 0.9F, -6.1F, -12.0F, 6, 0, 1, 0.0F, false));

        this.LLeg2 = new AdvancedModelRenderer(this);
        this.LLeg2.setRotationPoint(1.45F, 1.15F, -1.5F);
        this.Cephalon.addChild(LLeg2);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.45F, 5.95F, 9.5F);
        this.LLeg2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.0873F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 31, 0.9F, -6.1F, -10.0F, 7, 0, 1, 0.0F, false));

        this.RLeg1 = new AdvancedModelRenderer(this);
        this.RLeg1.setRotationPoint(-1.4F, 1.15F, -3.5F);
        this.Cephalon.addChild(RLeg1);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.4F, 5.95F, 11.5F);
        this.RLeg1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.0873F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 31, 21, -6.9F, -6.1F, -12.0F, 6, 0, 1, 0.0F, true));

        this.RLeg2 = new AdvancedModelRenderer(this);
        this.RLeg2.setRotationPoint(-1.4F, 1.15F, -1.5F);
        this.Cephalon.addChild(RLeg2);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.4F, 5.95F, 9.5F);
        this.RLeg2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.0873F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 31, -7.9F, -6.1F, -10.0F, 7, 0, 1, 0.0F, true));

        this.Thorax1 = new AdvancedModelRenderer(this);
        this.Thorax1.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Hungioides.addChild(Thorax1);
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 0, 31, -2.5F, -0.9F, -0.5F, 5, 2, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.1F, 7.8F);
        this.Thorax1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0349F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 31, 36, -1.5F, -2.2F, -8.4F, 3, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.9F, 8.0F);
        this.Thorax1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.2182F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 22, -9.15F, -2.1F, -8.0F, 8, 0, 6, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.9F, 8.0F);
        this.Thorax1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.2182F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 22, 22, 1.15F, -2.1F, -8.0F, 8, 0, 6, 0.0F, false));

        this.LLeg3 = new AdvancedModelRenderer(this);
        this.LLeg3.setRotationPoint(1.4F, 1.15F, 0.5F);
        this.Thorax1.addChild(LLeg3);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.4F, 5.95F, 7.5F);
        this.LLeg3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.0873F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 13, 31, 0.9F, -6.1F, -8.0F, 7, 0, 1, 0.0F, false));

        this.LLeg4 = new AdvancedModelRenderer(this);
        this.LLeg4.setRotationPoint(1.4F, 1.15F, 2.5F);
        this.Thorax1.addChild(LLeg4);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.4F, 5.95F, 5.5F);
        this.LLeg4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.0873F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 13, 31, 0.9F, -6.1F, -6.0F, 7, 0, 1, 0.0F, false));

        this.RLeg3 = new AdvancedModelRenderer(this);
        this.RLeg3.setRotationPoint(-1.4F, 1.15F, 0.5F);
        this.Thorax1.addChild(RLeg3);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.4F, 5.95F, 7.5F);
        this.RLeg3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.0873F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 13, 31, -7.9F, -6.1F, -8.0F, 7, 0, 1, 0.0F, true));

        this.Rleg4 = new AdvancedModelRenderer(this);
        this.Rleg4.setRotationPoint(-1.4F, 1.15F, 2.5F);
        this.Thorax1.addChild(Rleg4);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.4F, 5.95F, 5.5F);
        this.Rleg4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.0873F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 13, 31, -7.9F, -6.1F, -6.0F, 7, 0, 1, 0.0F, true));

        this.Thorax2 = new AdvancedModelRenderer(this);
        this.Thorax2.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Thorax1.addChild(Thorax2);
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 35, 16, -2.5F, -0.9F, 0.0F, 5, 2, 3, -0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.1F, 4.3F);
        this.Thorax2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0349F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 12, 41, -1.5F, -2.2F, -4.4F, 3, 1, 3, -0.001F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.9F, 4.5F);
        this.Thorax2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.2182F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 22, 22, -9.05F, -2.0F, -5.0F, 8, 0, 6, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.9F, 4.5F);
        this.Thorax2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 0.2182F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 22, 22, 1.05F, -2.0F, -5.0F, 8, 0, 6, 0.0F, false));

        this.LLeg5 = new AdvancedModelRenderer(this);
        this.LLeg5.setRotationPoint(1.4F, 1.15F, 1.0F);
        this.Thorax2.addChild(LLeg5);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.4F, 5.95F, 3.5F);
        this.LLeg5.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.0873F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 13, 31, 0.9F, -6.1F, -4.0F, 7, 0, 1, 0.0F, false));

        this.LLeg6 = new AdvancedModelRenderer(this);
        this.LLeg6.setRotationPoint(1.4F, 1.15F, 3.0F);
        this.Thorax2.addChild(LLeg6);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.4F, 5.95F, 1.5F);
        this.LLeg6.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.0873F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 13, 31, 0.9F, -6.1F, -2.0F, 7, 0, 1, 0.0F, false));

        this.RLeg5 = new AdvancedModelRenderer(this);
        this.RLeg5.setRotationPoint(-1.4F, 1.15F, 1.0F);
        this.Thorax2.addChild(RLeg5);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.4F, 5.95F, 3.5F);
        this.RLeg5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.0873F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 13, 31, -7.9F, -6.1F, -4.0F, 7, 0, 1, 0.0F, true));

        this.RLeg6 = new AdvancedModelRenderer(this);
        this.RLeg6.setRotationPoint(-1.4F, 1.15F, 3.0F);
        this.Thorax2.addChild(RLeg6);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.4F, 5.95F, 1.5F);
        this.RLeg6.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, -0.0873F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 13, 31, -7.9F, -6.1F, -2.0F, 7, 0, 1, 0.0F, true));

        this.Thorax3 = new AdvancedModelRenderer(this);
        this.Thorax3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Thorax2.addChild(Thorax3);
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 15, 36, -2.5F, -0.9F, 0.0F, 5, 2, 3, -0.002F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 1.1F, 1.3F);
        this.Thorax3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0349F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 41, -1.5F, -2.2F, -1.4F, 3, 1, 3, -0.002F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.9F, 1.5F);
        this.Thorax3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -0.2182F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 22, 22, -8.95F, -1.9F, -2.0F, 8, 0, 6, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.9F, 1.5F);
        this.Thorax3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, 0.2182F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 22, 22, 0.95F, -1.9F, -2.0F, 8, 0, 6, 0.0F, false));

        this.LLeg7 = new AdvancedModelRenderer(this);
        this.LLeg7.setRotationPoint(1.4F, 1.15F, 2.0F);
        this.Thorax3.addChild(LLeg7);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.4F, 5.95F, -0.5F);
        this.LLeg7.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, 0.0873F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 13, 31, 0.9F, -6.1F, 0.0F, 7, 0, 1, 0.0F, false));

        this.RLeg7 = new AdvancedModelRenderer(this);
        this.RLeg7.setRotationPoint(-1.4F, 1.15F, 2.0F);
        this.Thorax3.addChild(RLeg7);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.4F, 5.95F, -0.5F);
        this.RLeg7.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, -0.0873F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 13, 31, -7.9F, -6.1F, 0.0F, 7, 0, 1, 0.0F, true));

        this.Thorax4 = new AdvancedModelRenderer(this);
        this.Thorax4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Thorax3.addChild(Thorax4);
        this.Thorax4.cubeList.add(new ModelBox(Thorax4, 34, 28, -2.5F, -0.9F, 0.0F, 5, 2, 3, -0.003F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 1.1F, -1.7F);
        this.Thorax4.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0349F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 38, 12, -1.5F, -2.2F, 1.6F, 3, 1, 3, -0.003F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.9F, -1.5F);
        this.Thorax4.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, -0.2182F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 17, 12, -8.85F, -1.8F, 1.0F, 7, 0, 7, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.9F, -1.5F);
        this.Thorax4.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, 0.2182F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 17, 12, 1.85F, -1.8F, 1.0F, 7, 0, 7, 0.0F, false));

        this.LLeg8 = new AdvancedModelRenderer(this);
        this.LLeg8.setRotationPoint(1.4F, 1.15F, 1.0F);
        this.Thorax4.addChild(LLeg8);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.4F, 5.95F, -2.5F);
        this.LLeg8.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0F, 0.0873F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 13, 31, 0.9F, -6.1F, 2.0F, 7, 0, 1, 0.0F, false));

        this.LLeg9 = new AdvancedModelRenderer(this);
        this.LLeg9.setRotationPoint(1.4F, 1.15F, 3.0F);
        this.Thorax4.addChild(LLeg9);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.4F, 5.95F, -4.5F);
        this.LLeg9.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, 0.0873F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 13, 31, 0.9F, -6.1F, 4.0F, 7, 0, 1, 0.0F, false));

        this.RLeg8 = new AdvancedModelRenderer(this);
        this.RLeg8.setRotationPoint(-1.4F, 1.15F, 1.0F);
        this.Thorax4.addChild(RLeg8);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(1.4F, 5.95F, -2.5F);
        this.RLeg8.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, -0.0873F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 13, 31, -7.9F, -6.1F, 2.0F, 7, 0, 1, 0.0F, true));

        this.RLeg9 = new AdvancedModelRenderer(this);
        this.RLeg9.setRotationPoint(-1.4F, 1.15F, 3.0F);
        this.Thorax4.addChild(RLeg9);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.4F, 5.95F, -4.5F);
        this.RLeg9.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, -0.0873F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 13, 31, -7.9F, -6.1F, 4.0F, 7, 0, 1, 0.0F, true));

        this.Thorax5 = new AdvancedModelRenderer(this);
        this.Thorax5.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.Thorax4.addChild(Thorax5);
        this.Thorax5.cubeList.add(new ModelBox(Thorax5, 0, 37, -2.5F, -0.4F, 0.0F, 5, 2, 2, -0.004F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 1.6F, -4.7F);
        this.Thorax5.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0349F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 9, -1.5F, -2.2F, 4.6F, 3, 1, 1, -0.004F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 1.4F, -4.5F);
        this.Thorax5.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, -0.2182F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 28, 6, -6.95F, -1.7F, 4.0F, 6, 0, 6, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 1.4F, -4.5F);
        this.Thorax5.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, 0.2182F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 28, 6, 0.95F, -1.7F, 4.0F, 6, 0, 6, 0.0F, false));

        this.LLeg10 = new AdvancedModelRenderer(this);
        this.LLeg10.setRotationPoint(0.4F, 1.65F, 1.6F);
        this.Thorax5.addChild(LLeg10);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-1.4F, 5.95F, -6.1F);
        this.LLeg10.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, 0.0873F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 13, 31, 0.9F, -6.1F, 5.6F, 7, 0, 1, 0.0F, false));

        this.RLeg10 = new AdvancedModelRenderer(this);
        this.RLeg10.setRotationPoint(-0.4F, 1.65F, 1.65F);
        this.Thorax5.addChild(RLeg10);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(1.4F, 5.95F, -6.15F);
        this.RLeg10.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.0F, -0.0873F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 13, 31, -7.9F, -6.1F, 5.6F, 7, 0, 1, 0.0F, true));

        this.Pygidium = new AdvancedModelRenderer(this);
        this.Pygidium.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Thorax5.addChild(Pygidium);
        this.setRotateAngle(Pygidium, 0.0F, 0.0F, 0.0F);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.9F, -6.5F);
        this.Pygidium.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.0843F, -0.0226F, -0.2608F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 10, 22, -4.55F, -1.65F, 6.5F, 5, 0, 8, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.9F, -6.5F);
        this.Pygidium.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.0843F, 0.0226F, 0.2608F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 10, 22, -0.45F, -1.65F, 6.5F, 5, 0, 8, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 1.6F, -6.5F);
        this.Pygidium.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.0873F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 22, 28, -1.5F, -2.45F, 6.0F, 3, 2, 6, 0.0F, false));

        this.LLeg11 = new AdvancedModelRenderer(this);
        this.LLeg11.setRotationPoint(0.55F, 1.75F, 1.6F);
        this.Pygidium.addChild(LLeg11);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-1.55F, 5.95F, -8.1F);
        this.LLeg11.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.0F, 0.0873F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 31, 21, 0.9F, -6.1F, 7.6F, 6, 0, 1, 0.0F, false));

        this.RLeg12 = new AdvancedModelRenderer(this);
        this.RLeg12.setRotationPoint(-0.55F, 1.75F, 1.6F);
        this.Pygidium.addChild(RLeg12);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(1.55F, 5.95F, -8.1F);
        this.RLeg12.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.0F, -0.0873F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 31, 21, -6.9F, -6.1F, 7.6F, 6, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Hungioides.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Hungioides.offsetZ = 0.02F;
        this.Hungioides.render(0.037F);
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
        //this.Hungioides.offsetY = 0.65F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.LLeg1, this.LLeg2, this.LLeg3, this.LLeg4, this.LLeg5, this.LLeg6, this.LLeg7, this.LLeg8, this.LLeg9, this.LLeg10, this.LLeg11};
        AdvancedModelRenderer[] legsR = {this.RLeg1, this.RLeg2, this.RLeg3, this.Rleg4, this.RLeg5, this.RLeg6, this.RLeg7, this.RLeg8, this.RLeg9, this.RLeg10, this.RLeg12};
        AdvancedModelRenderer[] bodyF = {this.Thorax1, this.Thorax2, this.Thorax3, this.Thorax4, this.Thorax5, this.Pygidium};

        float weight = -0.5F;

        if (isAtBottom) {
            if (((EntityPrehistoricFloraHungioides) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(LLeg1, 0.5F, -0.5F, false, 0, -weight, f2, 0.3F);
                this.flap(RLeg1, 0.5F, 0.5F, false, 0, weight, f2, 0.3F);
                this.flap(LLeg2, 0.5F, -0.5F, false, 1.0F, -weight, f2, 0.3F);
                this.flap(RLeg2, 0.5F, 0.5F, false, 1.0F, weight, f2, 0.3F);
                this.flap(LLeg3, 0.5F, -0.5F, false, 2.0F, -weight, f2, 0.3F);
                this.flap(RLeg3, 0.5F, 0.5F, false, 2.0F, weight, f2, 0.3F);
                this.flap(LLeg4, 0.5F, -0.5F, false, 3.0F, -weight, f2, 0.3F);
                this.flap(Rleg4, 0.5F, 0.5F, false, 3.0F, weight, f2, 0.3F);
                this.flap(LLeg5, 0.5F, -0.5F, false, 4.0F, -weight, f2, 0.3F);
                this.flap(RLeg5, 0.5F, 0.5F, false, 4.0F, weight, f2, 0.3F);
                this.flap(LLeg6, 0.5F, -0.5F, false, 5.0F, -weight, f2, 0.3F);
                this.flap(RLeg6, 0.5F, 0.5F, false, 5.0F, weight, f2, 0.3F);
                this.flap(LLeg7, 0.5F, -0.5F, false, 6.0F, -weight, f2, 0.3F);
                this.flap(RLeg7, 0.5F, 0.5F, false, 6.0F, weight, f2, 0.3F);
                this.flap(LLeg8, 0.5F, -0.5F, false, 7.0F, -weight, f2, 0.3F);
                this.flap(RLeg8, 0.5F, 0.5F, false, 7.0F, weight, f2, 0.3F);
                this.flap(LLeg9, 0.5F, -0.5F, false, 8.0F, -weight, f2, 0.3F);
                this.flap(RLeg9, 0.5F, 0.5F, false, 8.0F, weight, f2, 0.3F);
                this.flap(LLeg10, 0.5F, -0.5F, false, 9.0F, -weight, f2, 0.3F);
                this.flap(RLeg10, 0.5F, 0.5F, false, 9.0F, weight, f2, 0.3F);
                this.flap(LLeg11, 0.5F, -0.5F, false, 10.0F, -weight, f2, 0.3F);
                this.flap(RLeg12, 0.5F, 0.5F, false, 10.0F, weight, f2, 0.3F);
                this.chainSwing(bodyF, 0.1F, 0.06F, -3, f2, 1.0F);
            }

            this.bob(Hungioides, 0.0F, 0.0F, false, f2, 1);
        } else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(LLeg1, 0.2F, -0.5F, false, 0, -weight, f2, 0.3F);
            this.flap(RLeg1, 0.2F, 0.5F, false, 0, weight, f2, 0.3F);
            this.flap(LLeg2, 0.2F, -0.5F, false, 1.0F, -weight, f2, 0.3F);
            this.flap(RLeg2, 0.2F, 0.5F, false, 1.0F, weight, f2, 0.3F);
            this.flap(LLeg3, 0.2F, -0.5F, false, 2.0F, -weight, f2, 0.3F);
            this.flap(RLeg3, 0.2F, 0.5F, false, 2.0F, weight, f2, 0.3F);
            this.flap(LLeg4, 0.2F, -0.5F, false, 3.0F, -weight, f2, 0.3F);
            this.flap(Rleg4, 0.2F, 0.5F, false, 3.0F, weight, f2, 0.3F);
            this.flap(LLeg5, 0.2F, -0.5F, false, 4.0F, -weight, f2, 0.3F);
            this.flap(RLeg5, 0.2F, 0.5F, false, 4.0F, weight, f2, 0.3F);
            this.flap(LLeg6, 0.2F, -0.5F, false, 8.0F, -weight, f2, 0.3F);
            this.flap(RLeg6, 0.2F, 0.5F, false, 8.0F, weight, f2, 0.3F);
            this.flap(LLeg7, 0.2F, -0.5F, false, 6.0F, -weight, f2, 0.3F);
            this.flap(RLeg7, 0.2F, 0.5F, false, 6.0F, weight, f2, 0.3F);
            this.flap(LLeg8, 0.2F, -0.5F, false, 7.0F, -weight, f2, 0.3F);
            this.flap(RLeg8, 0.2F, 0.5F, false, 7.0F, weight, f2, 0.3F);
            this.flap(LLeg9, 0.2F, -0.5F, false, 8.0F, -weight, f2, 0.3F);
            this.flap(RLeg9, 0.2F, 0.5F, false, 8.0F, weight, f2, 0.3F);
            this.flap(LLeg10, 0.2F, -0.5F, false, 9.0F, -weight, f2, 0.3F);
            this.flap(RLeg10, 0.2F, 0.5F, false, 9.0F, weight, f2, 0.3F);
            this.flap(LLeg11, 0.2F, -0.5F, false, 10.0F, -weight, f2, 0.3F);
            this.flap(RLeg12, 0.2F, 0.5F, false, 10.0F, weight, f2, 0.3F);
            if (f3 != 0) {
                this.chainSwing(bodyF, 0.2F, 0.03F, -3, f2, 0.5F);
                this.chainWave(bodyF, 0.5F, 0.05f, -3, f2, 0.8F);
            }
            this.bob(Hungioides, 0.2F, 0.15F, false, f2, 1);
        }

        this.swing(AntennaeL, 0.3F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(AntennaeR, 0.3F, 0.2F, false, 0, 0.1F, f2, 0.8F);

    }
}
