package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelTuzoia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer valveright;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer valveleft;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer antennaleft;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer legleft5;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer legright6;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer legleft6;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer legright7;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer legleft7;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer legright8;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer legleft8;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer legright9;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer legleft9;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer legright10;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer legleft10;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer legright11;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer legleft11;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer legright12;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer legleft12;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail;

    public ModelTuzoia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 19.25F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 34, 30, -1.5F, -2.75F, -4.5F, 3, 3, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 37, 0.0F, -4.35F, -6.5F, 0, 1, 11, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, -2.95F, -4.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 40, -1.0F, 0.0F, -3.4F, 1, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 40, -4.0F, 0.0F, -3.4F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.75F, -4.5F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 40, -1.0F, 0.0F, -3.0F, 2, 1, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 42, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.valveright = new AdvancedModelRenderer(this);
        this.valveright.setRotationPoint(0.0F, -3.4F, -6.0F);
        this.body.addChild(valveright);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-4.7F, 1.75F, 0.0F);
        this.valveright.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.2654F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 16, 0.0F, -4.0F, -1.0F, 0, 4, 17, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -6.0F, 0.0F, -1.0F, 6, 0, 16, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.05F, 14.0F);
        this.valveright.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.3491F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 31, -5.0F, 0.0F, -1.0F, 5, 0, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 16, -5.0F, 0.0F, -15.0F, 5, 0, 14, 0.0F, false));

        this.valveleft = new AdvancedModelRenderer(this);
        this.valveleft.setRotationPoint(0.0F, -3.4F, -6.0F);
        this.body.addChild(valveleft);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(4.7F, 1.75F, 0.0F);
        this.valveleft.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 1.2654F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 16, 0.0F, -4.0F, -1.0F, 0, 4, 17, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, 0.0F, -1.0F, 6, 0, 16, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.05F, 14.0F);
        this.valveleft.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.3491F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 31, 0.0F, 0.0F, -1.0F, 5, 0, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 16, 0.0F, 0.0F, -15.0F, 5, 0, 14, 0.0F, true));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(-1.0F, -1.65F, -6.5F);
        this.body.addChild(antennaright);
        this.setRotateAngle(antennaright, 0.0436F, 0.3054F, -0.829F);
        this.antennaright.cubeList.add(new ModelBox(antennaright, 22, 37, -1.5F, 0.0F, -3.0F, 2, 0, 3, 0.0F, false));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(1.0F, -1.65F, -6.5F);
        this.body.addChild(antennaleft);
        this.setRotateAngle(antennaleft, 0.0436F, -0.3054F, 0.829F);
        this.antennaleft.cubeList.add(new ModelBox(antennaleft, 22, 37, -0.5F, 0.0F, -3.0F, 2, 0, 3, 0.0F, true));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.75F, -0.75F, -5.5F);
        this.body.addChild(legright);
        this.setRotateAngle(legright, -0.5236F, 0.1309F, 0.4363F);
        this.legright.cubeList.add(new ModelBox(legright, 34, 45, -0.5F, -0.5F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.75F, -0.75F, -5.5F);
        this.body.addChild(legleft);
        this.setRotateAngle(legleft, -0.5236F, -0.1309F, -0.4363F);
        this.legleft.cubeList.add(new ModelBox(legleft, 34, 45, -1.5F, -0.5F, 0.0F, 2, 3, 0, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.75F, -0.75F, -4.75F);
        this.body.addChild(legright2);
        this.setRotateAngle(legright2, -0.3054F, 0.1309F, 0.4363F);
        this.legright2.cubeList.add(new ModelBox(legright2, 38, 46, -0.5F, -0.5F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.75F, -0.75F, -4.75F);
        this.body.addChild(legleft2);
        this.setRotateAngle(legleft2, -0.3054F, -0.1309F, -0.4363F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 38, 46, -1.5F, -0.5F, 0.0F, 2, 3, 0, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-1.25F, 0.25F, -3.95F);
        this.body.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, 0.1309F, 0.4363F);
        this.legright3.cubeList.add(new ModelBox(legright3, 42, 46, -0.5F, -0.5F, 0.0F, 2, 3, 0, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.5F, 0.0F);
        this.legright3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.2182F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 37, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(1.25F, 0.25F, -3.95F);
        this.body.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, -0.1309F, -0.4363F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 42, 46, -1.5F, -0.5F, 0.0F, 2, 3, 0, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.5F, 0.0F);
        this.legleft3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.2182F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 37, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-1.25F, 0.25F, -2.7F);
        this.body.addChild(legright4);
        this.setRotateAngle(legright4, 0.0F, 0.1309F, 0.4363F);
        this.legright4.cubeList.add(new ModelBox(legright4, 44, 4, -0.5F, -1.0F, 0.0F, 2, 4, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 1.0F, 0.0F);
        this.legright4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.2182F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 7, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(1.25F, 0.25F, -2.7F);
        this.body.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.0F, -0.1309F, -0.4363F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 44, 4, -1.5F, -1.0F, 0.0F, 2, 4, 0, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 1.0F, 0.0F);
        this.legleft4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.2182F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 48, 7, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-1.25F, 0.25F, -1.45F);
        this.body.addChild(legright5);
        this.setRotateAngle(legright5, 0.0F, 0.1309F, 0.4363F);
        this.legright5.cubeList.add(new ModelBox(legright5, 44, 8, -0.5F, -1.0F, 0.0F, 2, 4, 0, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.6F, 1.25F, 0.0F);
        this.legright5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.2182F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 48, 11, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.legleft5 = new AdvancedModelRenderer(this);
        this.legleft5.setRotationPoint(1.25F, 0.25F, -1.45F);
        this.body.addChild(legleft5);
        this.setRotateAngle(legleft5, 0.0F, -0.1309F, -0.4363F);
        this.legleft5.cubeList.add(new ModelBox(legleft5, 44, 8, -1.5F, -1.0F, 0.0F, 2, 4, 0, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.6F, 1.25F, 0.0F);
        this.legleft5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.2182F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 48, 11, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.legright6 = new AdvancedModelRenderer(this);
        this.legright6.setRotationPoint(-1.25F, 0.25F, -0.2F);
        this.body.addChild(legright6);
        this.setRotateAngle(legright6, 0.0F, 0.1309F, 0.4363F);
        this.legright6.cubeList.add(new ModelBox(legright6, 44, 12, -0.5F, -0.5F, 0.0F, 2, 4, 0, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.6F, 1.5F, 0.0F);
        this.legright6.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.2182F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 48, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.legleft6 = new AdvancedModelRenderer(this);
        this.legleft6.setRotationPoint(1.25F, 0.25F, -0.2F);
        this.body.addChild(legleft6);
        this.setRotateAngle(legleft6, 0.0F, -0.1309F, -0.4363F);
        this.legleft6.cubeList.add(new ModelBox(legleft6, 44, 12, -1.5F, -0.5F, 0.0F, 2, 4, 0, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.6F, 1.5F, 0.0F);
        this.legleft6.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.2182F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 48, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.legright7 = new AdvancedModelRenderer(this);
        this.legright7.setRotationPoint(-1.25F, 0.25F, 1.05F);
        this.body.addChild(legright7);
        this.setRotateAngle(legright7, 0.0F, 0.1309F, 0.4363F);
        this.legright7.cubeList.add(new ModelBox(legright7, 22, 45, -0.5F, -0.5F, 0.0F, 2, 4, 0, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.6F, 1.5F, 0.0F);
        this.legright7.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.2182F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 48, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.legleft7 = new AdvancedModelRenderer(this);
        this.legleft7.setRotationPoint(1.25F, 0.25F, 1.05F);
        this.body.addChild(legleft7);
        this.setRotateAngle(legleft7, 0.0F, -0.1309F, -0.4363F);
        this.legleft7.cubeList.add(new ModelBox(legleft7, 22, 45, -1.5F, -0.5F, 0.0F, 2, 4, 0, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.6F, 1.5F, 0.0F);
        this.legleft7.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.2182F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 48, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.legright8 = new AdvancedModelRenderer(this);
        this.legright8.setRotationPoint(-1.25F, 0.25F, 2.05F);
        this.body.addChild(legright8);
        this.setRotateAngle(legright8, 0.0873F, 0.1309F, 0.4363F);
        this.legright8.cubeList.add(new ModelBox(legright8, 26, 45, -0.5F, -0.6F, 0.0F, 2, 4, 0, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.6F, 1.4F, 0.0F);
        this.legright8.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.2182F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 48, 42, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.legleft8 = new AdvancedModelRenderer(this);
        this.legleft8.setRotationPoint(1.25F, 0.25F, 2.05F);
        this.body.addChild(legleft8);
        this.setRotateAngle(legleft8, 0.0873F, -0.1309F, -0.4363F);
        this.legleft8.cubeList.add(new ModelBox(legleft8, 26, 45, -1.5F, -0.6F, 0.0F, 2, 4, 0, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.6F, 1.4F, 0.0F);
        this.legleft8.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.2182F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 48, 42, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.legright9 = new AdvancedModelRenderer(this);
        this.legright9.setRotationPoint(-1.25F, 0.25F, 3.3F);
        this.body.addChild(legright9);
        this.setRotateAngle(legright9, 0.1745F, 0.1309F, 0.4363F);
        this.legright9.cubeList.add(new ModelBox(legright9, 30, 45, -0.5F, -0.85F, 0.0F, 2, 4, 0, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.6F, 1.15F, 0.0F);
        this.legright9.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.2182F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 49, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.legleft9 = new AdvancedModelRenderer(this);
        this.legleft9.setRotationPoint(1.25F, 0.25F, 3.3F);
        this.body.addChild(legleft9);
        this.setRotateAngle(legleft9, 0.1745F, -0.1309F, -0.4363F);
        this.legleft9.cubeList.add(new ModelBox(legleft9, 30, 45, -1.5F, -0.85F, 0.0F, 2, 4, 0, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.6F, 1.15F, 0.0F);
        this.legleft9.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.2182F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 49, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.legright10 = new AdvancedModelRenderer(this);
        this.legright10.setRotationPoint(-1.25F, 0.25F, 4.4F);
        this.body.addChild(legright10);
        this.setRotateAngle(legright10, 0.3927F, 0.1309F, 0.4363F);
        this.legright10.cubeList.add(new ModelBox(legright10, 46, 46, -0.5F, -0.35F, 0.0F, 2, 3, 0, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.6F, 0.65F, 0.0F);
        this.legright10.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.2182F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 2, 49, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.legleft10 = new AdvancedModelRenderer(this);
        this.legleft10.setRotationPoint(1.25F, 0.25F, 4.4F);
        this.body.addChild(legleft10);
        this.setRotateAngle(legleft10, 0.3927F, -0.1309F, -0.4363F);
        this.legleft10.cubeList.add(new ModelBox(legleft10, 46, 46, -1.5F, -0.35F, 0.0F, 2, 3, 0, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.6F, 0.65F, 0.0F);
        this.legleft10.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.2182F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 2, 49, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.legright11 = new AdvancedModelRenderer(this);
        this.legright11.setRotationPoint(-0.75F, -0.5F, 5.15F);
        this.body.addChild(legright11);
        this.setRotateAngle(legright11, 0.48F, 0.1309F, 0.4363F);
        this.legright11.cubeList.add(new ModelBox(legright11, 48, 4, -0.5F, -0.35F, 0.0F, 2, 3, 0, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.4F, 0.3F, 0.0F);
        this.legright11.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.2182F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 8, 49, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legleft11 = new AdvancedModelRenderer(this);
        this.legleft11.setRotationPoint(0.75F, -0.5F, 5.15F);
        this.body.addChild(legleft11);
        this.setRotateAngle(legleft11, 0.48F, -0.1309F, -0.4363F);
        this.legleft11.cubeList.add(new ModelBox(legleft11, 48, 4, -1.5F, -0.35F, 0.0F, 2, 3, 0, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.4F, 0.3F, 0.0F);
        this.legleft11.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.2182F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 8, 49, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.legright12 = new AdvancedModelRenderer(this);
        this.legright12.setRotationPoint(-0.65F, -0.5F, 5.9F);
        this.body.addChild(legright12);
        this.setRotateAngle(legright12, 0.7418F, 0.1309F, 0.4363F);
        this.legright12.cubeList.add(new ModelBox(legright12, 4, 49, -0.5F, -0.85F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.425F, 0.05F, 0.0F);
        this.legright12.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.2182F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 6, 49, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legleft12 = new AdvancedModelRenderer(this);
        this.legleft12.setRotationPoint(0.65F, -0.5F, 5.9F);
        this.body.addChild(legleft12);
        this.setRotateAngle(legleft12, 0.7418F, -0.1309F, -0.4363F);
        this.legleft12.cubeList.add(new ModelBox(legleft12, 4, 49, -0.5F, -0.85F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.425F, 0.05F, 0.0F);
        this.legleft12.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.2182F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 6, 49, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.75F, 4.5F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.2182F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 44, 0, -1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 22, 42, -3.0F, 0.1F, 2.0F, 6, 0, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 );
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.05F);
        this.body.offsetY = -0.1F;
        this.body.offsetZ = -0.02F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.0F;
        this.body.offsetX = -1.338F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 1.63F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

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

        AdvancedModelRenderer[] Tail = {this.tail};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.flap(antennaleft, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.flap(antennaright, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);

            this.walk(antennaleft, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            this.walk(antennaright, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);

            float tailVdegree = 0.12F;
            float tailHdegree = 0.3F;
            this.chainWave(Tail, speed*0.5F, tailVdegree, 2, f2, 1);


            float speedLeg = 1.1F;
            float degreeLeg = 0.25F;
            this.flap(legleft, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
            this.flap(legright, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
            this.flap(legleft2, speedLeg, -degreeLeg, false, 0.5F, -0.5F, f2, 0.7F);
            this.flap(legright2, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
            this.flap(legleft3, speedLeg, -degreeLeg, false, 1.0F, -0.5F, f2, 0.7F);
            this.flap(legright3, speedLeg, degreeLeg, false, 1.0F, 0.5F, f2, 0.7F);
            this.flap(legleft4, speedLeg, -degreeLeg, false, 1.5F, -0.5F, f2, 0.7F);
            this.flap(legright4, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
            this.flap(legleft5, speedLeg, -degreeLeg, false, 2.0F, -0.5F, f2, 0.7F);
            this.flap(legright5, speedLeg, degreeLeg, false, 2.0F, 0.5F, f2, 0.7F);
            this.flap(legleft6, speedLeg, -degreeLeg, false, 2.5F, -0.5F, f2, 0.7F);
            this.flap(legright6, speedLeg, degreeLeg, false, 2.5F, 0.5F, f2, 0.7F);
            this.flap(legleft7, speedLeg, -degreeLeg, false, 3.0F, -0.5F, f2, 0.7F);
            this.flap(legright7, speedLeg, degreeLeg, false, 3.0F, 0.5F, f2, 0.7F);
            this.flap(legleft8, speedLeg, -degreeLeg, false, 3.5F, -0.5F, f2, 0.7F);
            this.flap(legright8, speedLeg, degreeLeg, false, 3.5F, 0.5F, f2, 0.7F);
            this.flap(legleft9, speedLeg, -degreeLeg, false, 4.0F, -0.5F, f2, 0.7F);
            this.flap(legright9, speedLeg, degreeLeg, false, 4.0F, 0.5F, f2, 0.7F);
            this.flap(legleft10, speedLeg, -degreeLeg, false, 4.5F, -0.5F, f2, 0.7F);
            this.flap(legright10, speedLeg, degreeLeg, false, 4.5F, 0.5F, f2, 0.7F);
            this.flap(legleft11, speedLeg, -degreeLeg, false, 5.0F, -0.5F, f2, 0.7F);
            this.flap(legright11, speedLeg, degreeLeg, false, 5.0F, 0.5F, f2, 0.7F);
            this.flap(legleft12, speedLeg, -degreeLeg, false, 5.5F, -0.5F, f2, 0.7F);
            this.flap(legright12, speedLeg, degreeLeg, false, 5.5F, 0.5F, f2, 0.7F);
            if (!e.isInWater()) {
                //this.Main_Body.offsetY = 0.4F;
//                this.Main_Body.rotateAngleZ = (float) Math.toRadians(90);
            }


                if (f3 == 0.0F) {
                    this.bob(body, -speed, 0.3F, false, f2, 2);

                }
                else
                {
                    this.bob(body, -speed, 1F, false, f2, 2);
                }

        }
    }
}
