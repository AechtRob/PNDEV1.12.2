package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMosura extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer finright;
    private final AdvancedModelRenderer finleft;
    private final AdvancedModelRenderer finright2;
    private final AdvancedModelRenderer finleft2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer finright3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer finleft3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer finright4;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer finleft4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer finright5;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer finleft5;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer finright6;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer finleft6;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer finright7;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer finleft7;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer finright8;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer finleft8;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer finright9;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer finleft9;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer finright10;
    private final AdvancedModelRenderer finleft10;
    private final AdvancedModelRenderer finright11;
    private final AdvancedModelRenderer finleft11;
    private final AdvancedModelRenderer finright12;
    private final AdvancedModelRenderer finleft12;
    private final AdvancedModelRenderer finright13;
    private final AdvancedModelRenderer finleft13;
    private final AdvancedModelRenderer appendageright;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer appendageright2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer appendageleft;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer appendageleft2;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;

    public ModelMosura() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.85F, -4.3F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -1.0F, -3.0F, 2, 1, 4, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 0, -1.0F, -1.25F, -3.02F, 2, 1, 4, -0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 20, 10, -0.5F, -0.925F, -2.0F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.175F, -1.75F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.192F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 19, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.9F, -0.3F, -2.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.2618F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 19, -0.3F, -1.0F, 0.0F, 1, 1, 1, -0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.9F, -0.3F, -2.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.2618F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 19, -0.7F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.finright = new AdvancedModelRenderer(this);
        this.finright.setRotationPoint(-1.0F, -0.1F, -0.5F);
        this.body.addChild(finright);
        this.setRotateAngle(finright, -0.0873F, 0.0F, -0.2618F);
        this.finright.cubeList.add(new ModelBox(finright, 20, 13, -0.55F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finleft = new AdvancedModelRenderer(this);
        this.finleft.setRotationPoint(1.0F, -0.1F, -0.5F);
        this.body.addChild(finleft);
        this.setRotateAngle(finleft, -0.0873F, 0.0F, 0.2618F);
        this.finleft.cubeList.add(new ModelBox(finleft, 20, 13, -0.45F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.finright2 = new AdvancedModelRenderer(this);
        this.finright2.setRotationPoint(-1.0F, -0.1F, 0.5F);
        this.body.addChild(finright2);
        this.setRotateAngle(finright2, -0.0873F, 0.0F, -0.2618F);
        this.finright2.cubeList.add(new ModelBox(finright2, 20, 14, -0.9F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finleft2 = new AdvancedModelRenderer(this);
        this.finleft2.setRotationPoint(1.0F, -0.1F, 0.5F);
        this.body.addChild(finleft2);
        this.setRotateAngle(finleft2, -0.0873F, 0.0F, 0.2618F);
        this.finleft2.cubeList.add(new ModelBox(finleft2, 20, 14, -0.1F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.75F, 1.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 10, -1.0F, -0.55F, -0.25F, 2, 1, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 5, -1.0F, -0.05F, -0.25F, 2, 1, 4, 0.01F, false));

        this.finright3 = new AdvancedModelRenderer(this);
        this.finright3.setRotationPoint(-1.0F, 0.65F, 0.5F);
        this.body2.addChild(finright3);
        this.setRotateAngle(finright3, -0.0873F, 0.0F, -0.3491F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.0F, -0.5F);
        this.finright3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.5236F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 16, -3.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.finleft3 = new AdvancedModelRenderer(this);
        this.finleft3.setRotationPoint(1.0F, 0.65F, 0.5F);
        this.body2.addChild(finleft3);
        this.setRotateAngle(finleft3, -0.0873F, 0.0F, 0.3491F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.0F, -0.5F);
        this.finleft3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.5236F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 16, -1.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, true));

        this.finright4 = new AdvancedModelRenderer(this);
        this.finright4.setRotationPoint(-1.0F, 0.65F, 1.5F);
        this.body2.addChild(finright4);
        this.setRotateAngle(finright4, -0.0873F, 0.0F, -0.3491F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.85F, 0.0F, -0.2F);
        this.finright4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.576F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 17, -3.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.finleft4 = new AdvancedModelRenderer(this);
        this.finleft4.setRotationPoint(1.0F, 0.65F, 1.5F);
        this.body2.addChild(finleft4);
        this.setRotateAngle(finleft4, -0.0873F, 0.0F, 0.3491F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.85F, 0.0F, -0.2F);
        this.finleft4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.576F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 17, -1.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, true));

        this.finright5 = new AdvancedModelRenderer(this);
        this.finright5.setRotationPoint(-1.0F, 0.65F, 2.5F);
        this.body2.addChild(finright5);
        this.setRotateAngle(finright5, -0.0873F, 0.0F, -0.3491F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.65F, 0.0F, -0.3F);
        this.finright5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.7069F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 18, -3.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.finleft5 = new AdvancedModelRenderer(this);
        this.finleft5.setRotationPoint(1.0F, 0.65F, 2.5F);
        this.body2.addChild(finleft5);
        this.setRotateAngle(finleft5, -0.0873F, 0.0F, 0.3491F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.65F, 0.0F, -0.3F);
        this.finleft5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.7069F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 18, -1.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, true));

        this.finright6 = new AdvancedModelRenderer(this);
        this.finright6.setRotationPoint(-1.0F, 0.65F, 3.5F);
        this.body2.addChild(finright6);
        this.setRotateAngle(finright6, -0.0873F, 0.0F, -0.3491F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.65F, 0.0F, -0.3F);
        this.finright6.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.8378F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 15, -2.5F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.finleft6 = new AdvancedModelRenderer(this);
        this.finleft6.setRotationPoint(1.0F, 0.65F, 3.5F);
        this.body2.addChild(finleft6);
        this.setRotateAngle(finleft6, -0.0873F, 0.0F, 0.3491F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.65F, 0.0F, -0.3F);
        this.finleft6.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.8378F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 15, -1.5F, 0.0F, 0.0F, 4, 0, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.05F, 3.75F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 12, 10, -0.75F, -0.5F, -0.25F, 1, 1, 3, -0.02F, false));
        this.body3.cubeList.add(new ModelBox(body3, 12, 14, -0.75F, -0.1F, -0.25F, 1, 1, 3, -0.01F, false));
        this.body3.cubeList.add(new ModelBox(body3, 12, 10, -0.25F, -0.5F, -0.25F, 1, 1, 3, -0.02F, true));
        this.body3.cubeList.add(new ModelBox(body3, 12, 14, -0.25F, -0.1F, -0.25F, 1, 1, 3, -0.01F, true));

        this.finright7 = new AdvancedModelRenderer(this);
        this.finright7.setRotationPoint(-0.75F, 0.6F, 0.75F);
        this.body3.addChild(finright7);
        this.setRotateAngle(finright7, -0.0873F, 0.0F, -0.3054F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.65F, 0.0F, -0.3F);
        this.finright7.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.8814F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 18, -1.9F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.finleft7 = new AdvancedModelRenderer(this);
        this.finleft7.setRotationPoint(0.75F, 0.6F, 0.75F);
        this.body3.addChild(finleft7);
        this.setRotateAngle(finleft7, -0.0873F, 0.0F, 0.3054F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.65F, 0.0F, -0.3F);
        this.finleft7.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.8814F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 18, -1.1F, 0.0F, 0.0F, 3, 0, 1, 0.0F, true));

        this.finright8 = new AdvancedModelRenderer(this);
        this.finright8.setRotationPoint(-0.75F, 0.6F, 1.75F);
        this.body3.addChild(finright8);
        this.setRotateAngle(finright8, -0.0873F, 0.0F, -0.2618F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.65F, 0.0F, -0.3F);
        this.finright8.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.8814F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 19, -0.7F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.finleft8 = new AdvancedModelRenderer(this);
        this.finleft8.setRotationPoint(0.75F, 0.6F, 1.75F);
        this.body3.addChild(finleft8);
        this.setRotateAngle(finleft8, -0.0873F, 0.0F, 0.2618F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.65F, 0.0F, -0.3F);
        this.finleft8.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.8814F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 19, -1.3F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.finright9 = new AdvancedModelRenderer(this);
        this.finright9.setRotationPoint(-0.75F, 0.6F, 2.75F);
        this.body3.addChild(finright9);
        this.setRotateAngle(finright9, -0.0873F, 0.0F, -0.2182F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.05F, 0.0F, -1.15F);
        this.finright9.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.7854F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 4, 21, -1.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.finleft9 = new AdvancedModelRenderer(this);
        this.finleft9.setRotationPoint(0.75F, 0.6F, 2.75F);
        this.body3.addChild(finleft9);
        this.setRotateAngle(finleft9, -0.0873F, 0.0F, 0.2182F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.05F, 0.0F, -1.15F);
        this.finleft9.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.7854F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 4, 21, 0.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.15F, 2.75F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 12, 5, -0.5F, -0.4F, -0.45F, 1, 1, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.225F, 0.1F, 3.55F);
        this.body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.1745F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 10, 15, 0.0F, -0.5F, -0.775F, 0, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.225F, 0.1F, 3.55F);
        this.body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.1745F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 15, 0.0F, -0.5F, -0.775F, 0, 1, 1, 0.0F, false));

        this.finright10 = new AdvancedModelRenderer(this);
        this.finright10.setRotationPoint(-0.5F, 0.35F, 0.0F);
        this.body4.addChild(finright10);
        this.setRotateAngle(finright10, -0.0873F, 0.0F, -0.1745F);
        this.finright10.cubeList.add(new ModelBox(finright10, 20, 15, -0.65F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finleft10 = new AdvancedModelRenderer(this);
        this.finleft10.setRotationPoint(0.5F, 0.35F, 0.0F);
        this.body4.addChild(finleft10);
        this.setRotateAngle(finleft10, -0.0873F, 0.0F, 0.1745F);
        this.finleft10.cubeList.add(new ModelBox(finleft10, 20, 15, -0.35F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.finright11 = new AdvancedModelRenderer(this);
        this.finright11.setRotationPoint(-0.5F, 0.35F, 1.0F);
        this.body4.addChild(finright11);
        this.setRotateAngle(finright11, -0.0873F, 0.0F, -0.1745F);
        this.finright11.cubeList.add(new ModelBox(finright11, 20, 16, -0.575F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finleft11 = new AdvancedModelRenderer(this);
        this.finleft11.setRotationPoint(0.5F, 0.35F, 1.0F);
        this.body4.addChild(finleft11);
        this.setRotateAngle(finleft11, -0.0873F, 0.0F, 0.1745F);
        this.finleft11.cubeList.add(new ModelBox(finleft11, 20, 16, -0.425F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.finright12 = new AdvancedModelRenderer(this);
        this.finright12.setRotationPoint(-0.5F, 0.35F, 2.0F);
        this.body4.addChild(finright12);
        this.setRotateAngle(finright12, -0.0873F, 0.0F, -0.1745F);
        this.finright12.cubeList.add(new ModelBox(finright12, 20, 17, -0.45F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finleft12 = new AdvancedModelRenderer(this);
        this.finleft12.setRotationPoint(0.5F, 0.35F, 2.0F);
        this.body4.addChild(finleft12);
        this.setRotateAngle(finleft12, -0.0873F, 0.0F, 0.1745F);
        this.finleft12.cubeList.add(new ModelBox(finleft12, 20, 17, -0.55F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.finright13 = new AdvancedModelRenderer(this);
        this.finright13.setRotationPoint(-0.5F, 0.35F, 3.0F);
        this.body4.addChild(finright13);
        this.setRotateAngle(finright13, -0.0873F, 0.0F, -0.1745F);
        this.finright13.cubeList.add(new ModelBox(finright13, 20, 19, -0.3F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finleft13 = new AdvancedModelRenderer(this);
        this.finleft13.setRotationPoint(0.5F, 0.35F, 3.0F);
        this.body4.addChild(finleft13);
        this.setRotateAngle(finleft13, -0.0873F, 0.0F, 0.1745F);
        this.finleft13.cubeList.add(new ModelBox(finleft13, 20, 19, -0.7F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.appendageright = new AdvancedModelRenderer(this);
        this.appendageright.setRotationPoint(-0.5F, -0.4F, -2.5F);
        this.body.addChild(appendageright);
        this.setRotateAngle(appendageright, 0.3491F, 0.2182F, 0.0F);
        this.appendageright.cubeList.add(new ModelBox(appendageright, 10, 18, -0.5F, -0.5F, -1.5F, 1, 1, 2, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.4F, -1.15F);
        this.appendageright.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0436F, 0.0F, -0.1745F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 4, 20, 0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 0.4F, -0.5F);
        this.appendageright.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2618F, 0.0F, -0.2182F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 10, 21, 0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 0.4F, -0.85F);
        this.appendageright.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0873F, 0.0F, -0.2182F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 10, 17, 0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.appendageright2 = new AdvancedModelRenderer(this);
        this.appendageright2.setRotationPoint(0.0F, -0.3F, -1.4F);
        this.appendageright.addChild(appendageright2);
        this.setRotateAngle(appendageright2, 0.4363F, 0.0F, 0.0F);
        this.appendageright2.cubeList.add(new ModelBox(appendageright2, 0, 20, -0.5F, -0.2F, -1.0F, 1, 1, 1, -0.02F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.0F, -0.6F);
        this.appendageright2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.4363F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 20, 20, -1.0F, 0.0F, -0.9F, 1, 0, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 0.15F, -0.6F);
        this.appendageright2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.6109F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 12, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 0.7F, -0.25F);
        this.appendageright2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.7854F, 0.0F, -0.1745F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 8, 21, 0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.appendageleft = new AdvancedModelRenderer(this);
        this.appendageleft.setRotationPoint(0.5F, -0.4F, -2.5F);
        this.body.addChild(appendageleft);
        this.setRotateAngle(appendageleft, 0.3491F, -0.2182F, 0.0F);
        this.appendageleft.cubeList.add(new ModelBox(appendageleft, 10, 18, -0.5F, -0.5F, -1.5F, 1, 1, 2, -0.01F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 0.4F, -1.15F);
        this.appendageleft.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0436F, 0.0F, 0.1745F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 4, 20, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 0.4F, -0.5F);
        this.appendageleft.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2618F, 0.0F, 0.2182F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 10, 21, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 0.4F, -0.85F);
        this.appendageleft.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0873F, 0.0F, 0.2182F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 10, 17, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.appendageleft2 = new AdvancedModelRenderer(this);
        this.appendageleft2.setRotationPoint(0.0F, -0.3F, -1.4F);
        this.appendageleft.addChild(appendageleft2);
        this.setRotateAngle(appendageleft2, 0.4363F, 0.0F, 0.0F);
        this.appendageleft2.cubeList.add(new ModelBox(appendageleft2, 0, 20, -0.5F, -0.2F, -1.0F, 1, 1, 1, -0.02F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, 0.0F, -0.6F);
        this.appendageleft2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.4363F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 20, 20, 0.0F, 0.0F, -0.9F, 1, 0, 1, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, 0.15F, -0.6F);
        this.appendageleft2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.6109F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 20, 12, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, 0.7F, -0.25F);
        this.appendageleft2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.7854F, 0.0F, 0.1745F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 8, 21, -1.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.22F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.render(0.018F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.4F;
        this.body.offsetX = 0.15F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 1.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(appendageright, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(appendageleft2, 0.4F, 0.0F, 0.0F);
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
        this.body.offsetY = 1.11F;

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.walk(appendageleft, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);
            this.walk(appendageright, 0.6F, 0.15F, false, 0f, 0f, f2, 1F);
            this.walk(appendageleft, 0.6F, 0.15F, false, 0.5f, 0f, f2, 0.5F);
            this.walk(appendageright, 0.6F, 0.15F, false, 0.5f, 0f, f2, 0.5F);


            float degreeFin = 0.185F;
            this.flap(finleft9, 0.5F, -degreeFin, false, 0, -0, f2, 0.7F);
            this.flap(finright9, 0.5F, degreeFin, false, 0, 0, f2, 0.7F);
            this.flap(finleft8, 0.5F, -degreeFin, false, 0.5F, -0, f2, 0.7F);
            this.flap(finright8, 0.5F, degreeFin, false, 0.5F, 0, f2, 0.7F);
            this.flap(finleft7, 0.5F, -degreeFin, false, 1.0F, -0, f2, 0.7F);
            this.flap(finright7, 0.5F, degreeFin, false, 1.0F, 0, f2, 0.7F);
            this.flap(finleft6, 0.5F, -degreeFin, false, 1.5F, -0, f2, 0.7F);
            this.flap(finright6, 0.5F, degreeFin, false, 1.5F, 0, f2, 0.7F);
            this.flap(finleft5, 0.5F, -degreeFin, false, 2.0F, -0, f2, 0.7F);
            this.flap(finright5, 0.5F, degreeFin, false, 2.0F, 0, f2, 0.7F);
            this.flap(finleft4, 0.5F, -degreeFin, false, 2.5F, -0, f2, 0.7F);
            this.flap(finright4, 0.5F, degreeFin, false, 2.5F, 0, f2, 0.7F);
            this.flap(finleft3, 0.5F, -degreeFin, false, 3.0F, -0, f2, 0.7F);
            this.flap(finright3, 0.5F, degreeFin, false, 3.0F, 0, f2, 0.7F);
            this.flap(finleft2, 0.5F, -degreeFin, false, 3.5F, -0, f2, 0.7F);
            this.flap(finright2, 0.5F, degreeFin, false, 3.5F, 0, f2, 0.7F);
            this.flap(finleft, 0.5F, -degreeFin, false, 4.0F, -0, f2, 0.7F);
            this.flap(finright, 0.5F, degreeFin, false, 4.0F, 0, f2, 0.7F);

            this.walk(finleft9, 0.5F, -degreeFin * 0.5F, true, 0, -0.5F, f2, 0.7F);
            this.walk(finright9, 0.5F, degreeFin * 0.5F, false, 0, 0.5F, f2, 0.7F);
            this.walk(finleft8, 0.5F, -degreeFin * 0.5F, true, 0.5F, -0.5F, f2, 0.7F);
            this.walk(finright8, 0.5F, degreeFin * 0.5F, false, 0.5F, 0.5F, f2, 0.7F);
            this.walk(finleft7, 0.5F, -degreeFin * 0.5F, true, 1.0F, -0.5F, f2, 0.7F);
            this.walk(finright7, 0.5F, degreeFin * 0.5F, false, 1.0F, 0.5F, f2, 0.7F);
            this.walk(finleft6, 0.5F, -degreeFin * 0.5F, true, 1.5F, -0.5F, f2, 0.7F);
            this.walk(finright6, 0.5F, degreeFin * 0.5F, false, 1.5F, 0.5F, f2, 0.7F);
            this.walk(finleft5, 0.5F, -degreeFin * 0.5F, true, 2.0F, -0.5F, f2, 0.7F);
            this.walk(finright5, 0.5F, degreeFin * 0.5F, false, 2.0F, 0.5F, f2, 0.7F);
            this.walk(finleft4, 0.5F, -degreeFin * 0.5F, true, 2.5F, -0.5F, f2, 0.7F);
            this.walk(finright4, 0.5F, degreeFin * 0.5F, false, 2.5F, 0.5F, f2, 0.7F);
            this.walk(finleft3, 0.5F, -degreeFin * 0.5F, true, 3.0F, -0.5F, f2, 0.7F);
            this.walk(finright3, 0.5F, degreeFin * 0.5F, false, 3.0F, 0.5F, f2, 0.7F);
            this.walk(finleft2, 0.5F, -degreeFin * 0.5F, true, 3.5F, -0.5F, f2, 0.7F);
            this.walk(finright2, 0.5F, degreeFin * 0.5F, false, 3.5F, 0.5F, f2, 0.7F);
            this.walk(finleft, 0.5F, -degreeFin * 0.5F, true, 4.0F, -0.5F, f2, 0.7F);
            this.walk(finright, 0.5F, degreeFin * 0.5F, false, 4.0F, 0.5F, f2, 0.7F);


            if (!e.isInWater()) {
                this.bob(body, -speed * 1.5F, 2.5F, false, f2, 1);
            }
            else {
                if (f3 == 0.0F) {
                    this.bob(body, -speed, 0.15F, false, f2, 2);
                }
                else
                {
                    this.bob(body, -speed, 0.3F, false, f2, 2);
                }
            }
        }
    }
}
