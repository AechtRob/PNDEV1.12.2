package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelOgyginus extends AdvancedModelBase {
    private final AdvancedModelRenderer Ogyginus;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer AntennaeR2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer AntennaeL2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer AntennaeL;
    private final AdvancedModelRenderer AntennaeR;
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
    private final AdvancedModelRenderer ddd_r1;
    private final AdvancedModelRenderer LLeg3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer RLeg3;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Thorax2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer ddd_r2;
    private final AdvancedModelRenderer LLeg5;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer RLeg5;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Thorax3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer ddd_r3;
    private final AdvancedModelRenderer ddd_r4;
    private final AdvancedModelRenderer Thorax4;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer ddd_r5;
    private final AdvancedModelRenderer ddd_r6;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer LLeg8;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer RLeg8;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer Thorax5;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer ddd_r7;
    private final AdvancedModelRenderer ddd_r8;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer Pygidium;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer LLeg11;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer RLeg12;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer RLeg10;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer LLeg10;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer RLeg9;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer LLeg9;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer RLeg7;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer LLeg7;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer RLeg6;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer LLeg6;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer Rleg4;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer LLeg4;
    private final AdvancedModelRenderer cube_r48;

    public ModelOgyginus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Ogyginus = new AdvancedModelRenderer(this);
        this.Ogyginus.setRotationPoint(0.0F, 22.25F, -47.0F);


        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 0.0F, 39.3F);
        this.Ogyginus.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 33, -2.5F, -1.45F, -9.8F, 5, 2, 10, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 38, 36, -3.0F, -1.7F, -12.0F, 6, 2, 4, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 4, 2.25F, -1.2F, -5.675F, 2, 1, 3, -0.001F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 0, -4.25F, -1.2F, -5.675F, 2, 1, 3, -0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.6184F, -0.45F, -16.1564F);
        this.Cephalon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.1745F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 22, -0.3684F, -0.5F, 6.3314F, 9, 1, 10, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.0513F, -0.3737F, -9.4401F);
        this.Cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.7418F, 0.1745F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 61, -0.6522F, -0.5F, -1.2654F, 5, 1, 1, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.6184F, -0.45F, -7.9314F);
        this.Cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.8727F, 0.1745F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 60, 3.2704F, -0.5F, -3.1285F, 5, 1, 1, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.6184F, -0.45F, -7.9314F);
        this.Cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 1.3526F, -0.1745F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, -1, 17, -13.8897F, 0.5F, -6.5917F, 4, 0, 1, -0.001F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 15, -9.8897F, -0.5F, -6.5917F, 4, 1, 1, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.6184F, -0.45F, -7.9314F);
        this.Cephalon.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -1.3526F, 0.1745F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, -1, 18, 9.8897F, 0.5F, -6.5917F, 4, 0, 1, -0.001F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 13, 5.8897F, -0.5F, -6.5917F, 4, 1, 1, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.6184F, -0.45F, -7.9314F);
        this.Cephalon.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.8727F, -0.1745F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 62, -8.2704F, -0.5F, -3.1285F, 5, 1, 1, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.0513F, -0.3737F, -9.4401F);
        this.Cephalon.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.7418F, -0.1745F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 62, 22, -4.3478F, -0.5F, -1.2654F, 5, 1, 1, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.6184F, -0.45F, -16.1564F);
        this.Cephalon.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.1745F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 1, -8.6316F, -0.5F, 6.3314F, 9, 1, 10, 0.0F, false));

        this.AntennaeR2 = new AdvancedModelRenderer(this);
        this.AntennaeR2.setRotationPoint(-1.9F, 1.25F, -8.0F);
        this.Cephalon.addChild(AntennaeR2);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.4F, 5.05F, -2.2F);
        this.AntennaeR2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.7854F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 12, -12.9853F, -5.9F, -5.5147F, 11, 0, 6, 0.0F, false));

        this.AntennaeL2 = new AdvancedModelRenderer(this);
        this.AntennaeL2.setRotationPoint(1.9F, 1.25F, -8.0F);
        this.Cephalon.addChild(AntennaeL2);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.4F, 5.05F, 17.8F);
        this.AntennaeL2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.7854F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 34, -11.5F, -5.9F, -20.0F, 11, 0, 6, 0.0F, false));

        this.AntennaeL = new AdvancedModelRenderer(this);
        this.AntennaeL.setRotationPoint(1.4F, 1.25F, -53.5F);
        this.Cephalon.addChild(AntennaeL);


        this.AntennaeR = new AdvancedModelRenderer(this);
        this.AntennaeR.setRotationPoint(-1.4F, 1.25F, -53.5F);
        this.Cephalon.addChild(AntennaeR);


        this.LLeg1 = new AdvancedModelRenderer(this);
        this.LLeg1.setRotationPoint(1.4187F, 1.0695F, -1.8F);
        this.Cephalon.addChild(LLeg1);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.4187F, 6.0305F, 10.8F);
        this.LLeg1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.0873F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 27, 2, 0.9F, -6.1F, -11.3F, 5, 0, 1, 0.0F, false));

        this.LLeg2 = new AdvancedModelRenderer(this);
        this.LLeg2.setRotationPoint(1.4149F, 1.1567F, 0.2F);
        this.Cephalon.addChild(LLeg2);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.4149F, 5.9433F, 8.8F);
        this.LLeg2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.0873F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 51, 21, 0.9F, -6.1F, -9.3F, 7, 0, 1, 0.0F, false));

        this.RLeg1 = new AdvancedModelRenderer(this);
        this.RLeg1.setRotationPoint(-1.4187F, 1.0695F, -1.8F);
        this.Cephalon.addChild(RLeg1);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.4187F, 6.0305F, 10.8F);
        this.RLeg1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.0873F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 1, -5.9F, -6.1F, -11.3F, 5, 0, 1, 0.0F, false));

        this.RLeg2 = new AdvancedModelRenderer(this);
        this.RLeg2.setRotationPoint(-1.4149F, 1.1567F, 0.2F);
        this.Cephalon.addChild(RLeg2);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.4149F, 5.9433F, 8.8F);
        this.RLeg2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.0873F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 27, 0, -7.9F, -6.1F, -9.3F, 7, 0, 1, 0.0F, false));

        this.Thorax1 = new AdvancedModelRenderer(this);
        this.Thorax1.setRotationPoint(0.0F, 0.0F, 39.0F);
        this.Ogyginus.addChild(Thorax1);
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 40, 50, -3.5F, -0.9F, 0.5F, 7, 2, 3, 0.0F, false));
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 20, 55, -2.5F, -1.3F, 0.5F, 5, 2, 3, -0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, 0.9F, 9.0F);
        this.Thorax1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.2182F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 44, 26, -11.0F, -2.1F, -9.0F, 7, 0, 4, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, -4, 63, -4.0F, -2.1F, -9.0F, 2, 0, 4, 0.0F, true));

        this.ddd_r1 = new AdvancedModelRenderer(this);
        this.ddd_r1.setRotationPoint(-1.0F, 0.9F, 9.0F);
        this.Thorax1.addChild(ddd_r1);
        this.setRotateAngle(ddd_r1, 0.0F, 0.0F, 0.2182F);
        this.ddd_r1.cubeList.add(new ModelBox(ddd_r1, -4, 63, 2.0F, -2.1F, -9.0F, 2, 0, 4, 0.0F, false));
        this.ddd_r1.cubeList.add(new ModelBox(ddd_r1, 42, 46, 4.0F, -2.1F, -9.0F, 7, 0, 4, 0.0F, false));

        this.LLeg3 = new AdvancedModelRenderer(this);
        this.LLeg3.setRotationPoint(2.4149F, 1.1567F, 2.0F);
        this.Thorax1.addChild(LLeg3);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.4149F, 5.9433F, 8.0F);
        this.LLeg3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.0873F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 59, 54, 0.9F, -6.1F, -8.0F, 7, 0, 1, 0.0F, false));

        this.RLeg3 = new AdvancedModelRenderer(this);
        this.RLeg3.setRotationPoint(-2.4149F, 1.1567F, 2.5F);
        this.Thorax1.addChild(RLeg3);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.4149F, 5.9433F, 7.5F);
        this.RLeg3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.0873F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 19, 40, -7.9F, -6.1F, -8.0F, 7, 0, 1, 0.0F, false));

        this.Thorax2 = new AdvancedModelRenderer(this);
        this.Thorax2.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Thorax1.addChild(Thorax2);
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 52, 16, -3.5F, -0.9F, 0.0F, 7, 2, 3, -0.001F, false));
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 36, 55, -2.5F, -1.3F, 0.0F, 5, 2, 3, -0.002F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, 0.9F, 6.5F);
        this.Thorax2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.2182F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 44, 22, -11.0F, -2.0F, -7.0F, 7, 0, 4, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, -4, 63, -4.0F, -2.0F, -7.0F, 2, 0, 4, 0.0F, true));

        this.ddd_r2 = new AdvancedModelRenderer(this);
        this.ddd_r2.setRotationPoint(-1.0F, 0.9F, 8.5F);
        this.Thorax2.addChild(ddd_r2);
        this.setRotateAngle(ddd_r2, 0.0F, 0.0F, 0.2182F);
        this.ddd_r2.cubeList.add(new ModelBox(ddd_r2, -4, 63, 2.0F, -2.0F, -9.0F, 2, 0, 4, 0.0F, false));
        this.ddd_r2.cubeList.add(new ModelBox(ddd_r2, 28, 46, 4.0F, -2.0F, -9.0F, 7, 0, 4, 0.0F, false));

        this.LLeg5 = new AdvancedModelRenderer(this);
        this.LLeg5.setRotationPoint(2.4149F, 1.1567F, 3.0F);
        this.Thorax2.addChild(LLeg5);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.4149F, 5.9433F, 3.5F);
        this.LLeg5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.0873F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 59, 0.9F, -6.1F, -4.0F, 7, 0, 1, 0.0F, false));

        this.RLeg5 = new AdvancedModelRenderer(this);
        this.RLeg5.setRotationPoint(-2.4149F, 1.1567F, 3.0F);
        this.Thorax2.addChild(RLeg5);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.4149F, 5.9433F, 3.5F);
        this.RLeg5.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.0873F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 19, 41, -7.9F, -6.1F, -4.0F, 7, 0, 1, 0.0F, false));

        this.Thorax3 = new AdvancedModelRenderer(this);
        this.Thorax3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Thorax2.addChild(Thorax3);
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 0, 54, -3.5F, -0.9F, 0.0F, 7, 2, 3, -0.002F, false));
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 52, 55, -2.5F, -1.3F, 0.0F, 5, 2, 3, -0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, 0.9F, 4.5F);
        this.Thorax3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.2182F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 40, 42, -9.0F, -1.4F, -5.0F, 7, 0, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, 0.9F, 4.5F);
        this.Thorax3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 0.2182F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 14, 46, 2.0F, -1.4F, -5.0F, 7, 0, 4, 0.0F, false));

        this.ddd_r3 = new AdvancedModelRenderer(this);
        this.ddd_r3.setRotationPoint(-1.0F, 0.9F, 8.5F);
        this.Thorax3.addChild(ddd_r3);
        this.setRotateAngle(ddd_r3, 0.0F, 0.0F, 0.2182F);
        this.ddd_r3.cubeList.add(new ModelBox(ddd_r3, -4, 63, 3.0F, -1.85F, -9.0F, 1, 0, 4, 0.0F, false));

        this.ddd_r4 = new AdvancedModelRenderer(this);
        this.ddd_r4.setRotationPoint(1.0F, 0.9F, 8.5F);
        this.Thorax3.addChild(ddd_r4);
        this.setRotateAngle(ddd_r4, 0.0F, 0.0F, -0.2182F);
        this.ddd_r4.cubeList.add(new ModelBox(ddd_r4, -4, 63, -4.0F, -1.85F, -9.0F, 2, 0, 4, 0.0F, true));

        this.Thorax4 = new AdvancedModelRenderer(this);
        this.Thorax4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Thorax3.addChild(Thorax4);
        this.Thorax4.cubeList.add(new ModelBox(Thorax4, 20, 50, -3.5F, -0.9F, 0.0F, 7, 2, 3, -0.003F, false));
        this.Thorax4.cubeList.add(new ModelBox(Thorax4, 56, 0, -2.5F, -1.3F, 0.0F, 5, 2, 3, -0.004F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, 0.9F, 2.5F);
        this.Thorax4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.2182F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 26, 42, -9.0F, -1.3F, -3.0F, 7, 0, 4, 0.0F, false));

        this.ddd_r5 = new AdvancedModelRenderer(this);
        this.ddd_r5.setRotationPoint(-1.0F, 0.9F, 8.5F);
        this.Thorax4.addChild(ddd_r5);
        this.setRotateAngle(ddd_r5, 0.0F, 0.0F, 0.2182F);
        this.ddd_r5.cubeList.add(new ModelBox(ddd_r5, -4, 63, 2.0F, -1.75F, -9.0F, 2, 0, 4, 0.0F, false));

        this.ddd_r6 = new AdvancedModelRenderer(this);
        this.ddd_r6.setRotationPoint(1.0F, 0.9F, 8.5F);
        this.Thorax4.addChild(ddd_r6);
        this.setRotateAngle(ddd_r6, 0.0F, 0.0F, -0.2182F);
        this.ddd_r6.cubeList.add(new ModelBox(ddd_r6, -4, 63, -4.0F, -1.75F, -9.0F, 2, 0, 4, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0F, 0.9F, 2.5F);
        this.Thorax4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 0.2182F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 45, 2.0F, -1.3F, -3.0F, 7, 0, 4, 0.0F, false));

        this.LLeg8 = new AdvancedModelRenderer(this);
        this.LLeg8.setRotationPoint(2.4149F, 1.1567F, 3.0F);
        this.Thorax4.addChild(LLeg8);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.4149F, 5.9433F, -2.5F);
        this.LLeg8.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.0873F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 56, 52, 0.9F, -6.1F, 2.0F, 7, 0, 1, 0.0F, false));

        this.RLeg8 = new AdvancedModelRenderer(this);
        this.RLeg8.setRotationPoint(-2.4149F, 1.1567F, 3.0F);
        this.Thorax4.addChild(RLeg8);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.4149F, 5.9433F, -2.5F);
        this.RLeg8.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.0873F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 47, 30, -7.9F, -6.1F, 2.0F, 7, 0, 1, 0.0F, false));

        this.Thorax5 = new AdvancedModelRenderer(this);
        this.Thorax5.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.Thorax4.addChild(Thorax5);
        this.Thorax5.cubeList.add(new ModelBox(Thorax5, 0, 49, -3.5F, -0.4F, 0.0F, 7, 2, 3, -0.004F, false));
        this.Thorax5.cubeList.add(new ModelBox(Thorax5, 56, 5, -2.5F, -0.8F, 0.0F, 5, 2, 3, -0.005F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, 1.4F, -0.5F);
        this.Thorax5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.2182F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 34, 18, -9.0F, -1.2F, 0.0F, 7, 0, 4, 0.0F, false));

        this.ddd_r7 = new AdvancedModelRenderer(this);
        this.ddd_r7.setRotationPoint(-1.0F, 1.4F, 8.5F);
        this.Thorax5.addChild(ddd_r7);
        this.setRotateAngle(ddd_r7, 0.0F, 0.0F, 0.2182F);
        this.ddd_r7.cubeList.add(new ModelBox(ddd_r7, -4, 63, 2.0F, -1.625F, -9.0F, 2, 0, 4, 0.0F, false));

        this.ddd_r8 = new AdvancedModelRenderer(this);
        this.ddd_r8.setRotationPoint(1.0F, 1.4F, 8.5F);
        this.Thorax5.addChild(ddd_r8);
        this.setRotateAngle(ddd_r8, 0.0F, 0.0F, -0.2182F);
        this.ddd_r8.cubeList.add(new ModelBox(ddd_r8, -4, 63, -4.0F, -1.65F, -9.0F, 2, 0, 4, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.0F, 1.4F, -0.5F);
        this.Thorax5.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, 0.2182F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 46, 12, 2.0F, -1.2F, 0.0F, 7, 0, 4, 0.0F, false));

        this.Pygidium = new AdvancedModelRenderer(this);
        this.Pygidium.setRotationPoint(0.0F, 0.0F, 2.6F);
        this.Thorax5.addChild(Pygidium);
        this.setRotateAngle(Pygidium, 0.0F, 0.0F, 0.0F);
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 54, 34, -2.0F, -0.95F, 0.1F, 4, 2, 4, 0.0F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 58, 40, -1.5F, -0.95F, 4.1F, 3, 2, 3, -0.01F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 57, 46, -1.0F, -0.95F, 6.5F, 2, 1, 4, -0.02F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 27, 22, -2.5F, -0.55F, -0.7F, 5, 1, 11, -0.02F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(2.6184F, 0.05F, -18.1686F);
        this.Pygidium.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 0.1745F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 0, -0.3684F, -0.5F, 18.6686F, 9, 1, 10, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(9.3002F, 1.2061F, 2.7374F);
        this.Pygidium.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 1.5708F, 0.1745F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 8, -0.0252F, -0.4783F, -1.0639F, 2, 1, 1, -0.001F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(2.4948F, 0.0272F, 8.359F);
        this.Pygidium.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 1.0472F, 0.1745F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 12, 60, 3.2704F, -0.4992F, 2.1285F, 5, 1, 1, -0.002F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(2.6184F, 0.05F, 8.7314F);
        this.Pygidium.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.6545F, 0.1745F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 24, 60, -0.6522F, -0.5F, 0.2654F, 5, 1, 1, -0.001F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-2.6184F, 0.05F, -18.1686F);
        this.Pygidium.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, -0.1745F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 0, -8.6316F, -0.5F, 18.6686F, 9, 1, 10, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-2.6184F, 0.05F, 8.7314F);
        this.Pygidium.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -0.6545F, -0.1745F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 24, 60, -4.3478F, -0.5F, 0.2654F, 5, 1, 1, -0.001F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-2.4948F, 0.0272F, 8.359F);
        this.Pygidium.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -1.0472F, -0.1745F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 12, 60, -8.2704F, -0.4992F, 2.1285F, 5, 1, 1, -0.002F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-9.3002F, 1.2061F, 2.7374F);
        this.Pygidium.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -1.5708F, -0.1745F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 8, -1.9748F, -0.4783F, -1.0639F, 2, 1, 1, -0.001F, true));

        this.LLeg11 = new AdvancedModelRenderer(this);
        this.LLeg11.setRotationPoint(0.4168F, 1.7131F, 3.1F);
        this.Pygidium.addChild(LLeg11);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.4168F, 5.9869F, -20.6F);
        this.LLeg11.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0F, 0.0873F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 60, 0.9F, -6.1F, 20.1F, 6, 0, 1, 0.0F, false));

        this.RLeg12 = new AdvancedModelRenderer(this);
        this.RLeg12.setRotationPoint(-1.4168F, 1.7131F, 3.1F);
        this.Pygidium.addChild(RLeg12);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(2.4168F, 5.9869F, -20.6F);
        this.RLeg12.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, -0.0873F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 17, 45, -7.8962F, -6.1872F, 20.1F, 6, 0, 1, 0.0F, false));

        this.RLeg10 = new AdvancedModelRenderer(this);
        this.RLeg10.setRotationPoint(-1.4149F, 1.6567F, 1.4F);
        this.Pygidium.addChild(RLeg10);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(1.4149F, 5.9433F, -6.5F);
        this.RLeg10.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, -0.0873F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 47, 32, -7.9F, -6.1F, 6.0F, 7, 0, 1, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(1.4149F, -1.6567F, -15.0F);
        this.RLeg10.addChild(bone);


        this.LLeg10 = new AdvancedModelRenderer(this);
        this.LLeg10.setRotationPoint(1.4149F, 1.6567F, 1.4F);
        this.Pygidium.addChild(LLeg10);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.4149F, 5.9433F, -6.5F);
        this.LLeg10.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, 0.0873F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 55, 10, 0.9F, -6.1F, 6.0F, 7, 0, 1, 0.0F, false));

        this.RLeg9 = new AdvancedModelRenderer(this);
        this.RLeg9.setRotationPoint(-2.4149F, 1.6567F, 2.0F);
        this.Thorax5.addChild(RLeg9);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(1.4149F, 5.9433F, -4.5F);
        this.RLeg9.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, -0.0873F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 47, 31, -7.9F, -6.1F, 4.0F, 7, 0, 1, 0.0F, false));

        this.LLeg9 = new AdvancedModelRenderer(this);
        this.LLeg9.setRotationPoint(2.4149F, 1.6567F, 2.0F);
        this.Thorax5.addChild(LLeg9);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.4149F, 5.9433F, -4.5F);
        this.LLeg9.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, 0.0873F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 56, 51, 0.9F, -6.1F, 4.0F, 7, 0, 1, 0.0F, false));

        this.RLeg7 = new AdvancedModelRenderer(this);
        this.RLeg7.setRotationPoint(-2.4149F, 1.1567F, 1.0F);
        this.Thorax4.addChild(RLeg7);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(1.4149F, 5.9433F, -0.5F);
        this.RLeg7.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, -0.0873F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 41, 35, -7.9F, -6.1F, 0.0F, 7, 0, 1, 0.0F, false));

        this.LLeg7 = new AdvancedModelRenderer(this);
        this.LLeg7.setRotationPoint(2.4149F, 0.9067F, 1.0F);
        this.Thorax4.addChild(LLeg7);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(3.5F, 0.5F, 0.0F);
        this.LLeg7.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, 0.0873F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 57, 45, -3.5F, 0.0F, -0.5F, 7, 0, 1, 0.0F, false));

        this.RLeg6 = new AdvancedModelRenderer(this);
        this.RLeg6.setRotationPoint(-2.4149F, 1.1567F, 2.0F);
        this.Thorax3.addChild(RLeg6);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(1.4149F, 5.9433F, 1.5F);
        this.RLeg6.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.0F, -0.0873F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 41, 34, -7.9F, -6.1F, -2.0F, 7, 0, 1, 0.0F, false));

        this.LLeg6 = new AdvancedModelRenderer(this);
        this.LLeg6.setRotationPoint(2.4149F, 1.1567F, 2.0F);
        this.Thorax3.addChild(LLeg6);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-1.4149F, 5.9433F, 1.5F);
        this.LLeg6.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.0F, 0.0873F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 58, 33, 0.9F, -6.1F, -2.0F, 7, 0, 1, 0.0F, false));

        this.Rleg4 = new AdvancedModelRenderer(this);
        this.Rleg4.setRotationPoint(-2.4149F, 1.1567F, 1.0F);
        this.Thorax2.addChild(Rleg4);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(1.4149F, 5.9433F, 5.5F);
        this.Rleg4.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, 0.0F, -0.0873F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 41, 0, -7.9F, -6.1F, -6.0F, 7, 0, 1, 0.0F, false));

        this.LLeg4 = new AdvancedModelRenderer(this);
        this.LLeg4.setRotationPoint(2.4149F, 1.1567F, 1.0F);
        this.Thorax2.addChild(LLeg4);


        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-1.4149F, 5.9433F, 5.5F);
        this.LLeg4.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.0F, 0.0873F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 59, 53, 0.9F, -6.1F, -6.0F, 7, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Ogyginus.render(f5 * 0.3F);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Ogyginus.offsetZ = 0.02F;
        this.Ogyginus.render(0.037F);
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
        this.Ogyginus.offsetY = 1.03F;

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

            if (f3 != 0) {
                this.chainSwing(bodyF, 0.1F, 0.06F, -3, f2, 1.0F);
            }

            this.bob(Ogyginus, 0.0F, 0.0F, false, f2, 1);
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
            this.flap(LLeg6, 0.2F, -0.5F, false, 5.0F, -weight, f2, 0.3F);
            this.flap(RLeg6, 0.2F, 0.5F, false, 5.0F, weight, f2, 0.3F);
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
            this.bob(Ogyginus, 0.2F, 0.15F, false, f2, 1);
        }

        this.swing(AntennaeL2, 0.3F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(AntennaeR2, 0.3F, 0.2F, false, 0, 0.1F, f2, 0.8F);

    }
}
