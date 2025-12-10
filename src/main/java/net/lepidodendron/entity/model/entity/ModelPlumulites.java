package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPlumulites extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer legleft5;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer legright6;
    private final AdvancedModelRenderer legright7;
    private final AdvancedModelRenderer legleft7;
    private final AdvancedModelRenderer legleft6;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer legright8;
    private final AdvancedModelRenderer legleft8;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer legright9;
    private final AdvancedModelRenderer legright10;
    private final AdvancedModelRenderer legleft10;
    private final AdvancedModelRenderer legleft9;

    public ModelPlumulites() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 23.0F, -8.0F);
        this.base.cubeList.add(new ModelBox(base, 0, 13, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 12, 19, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 16, 19, 0.0F, 0.0F, -1.75F, 0, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 0.5F, -1.0F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.4363F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 6, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.25F, 0.5F, -1.0F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2618F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 19, 0.0F, -0.5F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 0.5F, -1.0F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 6, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.25F, 0.5F, -1.0F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2618F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 19, 0.0F, -0.5F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.9F);
        this.base.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 4, -1.5F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 5, -1.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.9F, 0.5F, 1.0F);
        this.base.addChild(legright);
        this.setRotateAngle(legright, 1.3963F, 0.2182F, -0.3054F);
        this.legright.cubeList.add(new ModelBox(legright, 18, 5, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.9F, 0.5F, 1.0F);
        this.base.addChild(legleft);
        this.setRotateAngle(legleft, 1.3963F, -0.2182F, 0.3054F);
        this.legleft.cubeList.add(new ModelBox(legleft, 18, 5, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 8, 13, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.5F, -0.5F, 0.7F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.6981F, 0.1309F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 19, -1.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.5F, -0.5F, -0.3F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.6981F, 0.1309F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 19, -1.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, -0.5F, 0.7F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1745F, -0.6981F, -0.1309F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 19, 0.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.5F, 0.7F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 11, -1.5F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5F, -0.5F, -0.3F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, -0.6981F, -0.1309F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 19, 0.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.5F, -0.3F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 9, -1.5F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.9F, 0.0F, 0.5F);
        this.body.addChild(legright2);
        this.setRotateAngle(legright2, 1.3963F, 0.2182F, -0.3054F);
        this.legright2.cubeList.add(new ModelBox(legright2, 18, 5, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.9F, 0.0F, 0.5F);
        this.body.addChild(legleft2);
        this.setRotateAngle(legleft2, 1.3963F, -0.2182F, 0.3054F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 18, 5, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 16, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.5F, -0.5F, 0.7F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.6981F, 0.1309F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 10, 6, -2.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.5F, -0.5F, -0.3F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.6981F, 0.1309F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 10, -2.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5F, -0.5F, 0.7F);
        this.body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, -0.6981F, -0.1309F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 10, 6, 0.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -0.5F, 0.7F);
        this.body2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 2, -2.5F, 0.0F, 0.0F, 4, 0, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5F, -0.5F, -0.3F);
        this.body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, -0.6981F, -0.1309F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 10, 0.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, -0.5F, -0.3F);
        this.body2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -2.5F, 0.0F, 0.0F, 4, 0, 2, 0.0F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.9F, 0.0F, 0.0F);
        this.body2.addChild(legright3);
        this.setRotateAngle(legright3, 1.3963F, 0.2182F, -0.3054F);
        this.legright3.cubeList.add(new ModelBox(legright3, 18, 5, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-0.9F, 0.0F, 1.5F);
        this.body2.addChild(legright4);
        this.setRotateAngle(legright4, 1.3963F, 0.2182F, -0.3054F);
        this.legright4.cubeList.add(new ModelBox(legright4, 18, 5, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(0.9F, 0.0F, 1.5F);
        this.body2.addChild(legleft4);
        this.setRotateAngle(legleft4, 1.3963F, -0.2182F, 0.3054F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 18, 5, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.9F, 0.0F, 0.0F);
        this.body2.addChild(legleft3);
        this.setRotateAngle(legleft3, 1.3963F, -0.2182F, 0.3054F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 18, 5, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 16, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.5F, -0.5F, -0.3F);
        this.body3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, 0.6981F, 0.1309F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 10, -2.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.5F, -0.5F, 0.7F);
        this.body3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1745F, 0.6981F, 0.1309F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 10, 6, -2.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5F, -0.5F, 0.7F);
        this.body3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1745F, -0.6981F, -0.1309F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 10, 6, 0.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, -0.5F, 0.7F);
        this.body3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1745F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 2, -2.5F, 0.0F, 0.0F, 4, 0, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.5F, -0.5F, -0.3F);
        this.body3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1745F, -0.6981F, -0.1309F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 10, 0.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, -0.5F, -0.3F);
        this.body3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1745F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -2.5F, 0.0F, 0.0F, 4, 0, 2, 0.0F, false));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-0.9F, 0.0F, 1.0F);
        this.body3.addChild(legright5);
        this.setRotateAngle(legright5, 1.3963F, 0.2182F, -0.3054F);
        this.legright5.cubeList.add(new ModelBox(legright5, 18, 5, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legleft5 = new AdvancedModelRenderer(this);
        this.legleft5.setRotationPoint(0.9F, 0.0F, 1.0F);
        this.body3.addChild(legleft5);
        this.setRotateAngle(legleft5, 1.3963F, -0.2182F, 0.3054F);
        this.legleft5.cubeList.add(new ModelBox(legleft5, 18, 5, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 16, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.5F, -0.5F, 0.7F);
        this.body4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1745F, 0.6981F, 0.1309F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 10, 6, -2.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.5F, -0.5F, -0.3F);
        this.body4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1745F, 0.6981F, 0.1309F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 10, -2.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.5F, -0.5F, 0.7F);
        this.body4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1745F, -0.6981F, -0.1309F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 10, 6, 0.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, -0.5F, 0.7F);
        this.body4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1745F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 2, -2.5F, 0.0F, 0.0F, 4, 0, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.5F, -0.5F, -0.3F);
        this.body4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1745F, -0.6981F, -0.1309F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 10, 0.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, -0.5F, -0.3F);
        this.body4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1745F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 0, -2.5F, 0.0F, 0.0F, 4, 0, 2, 0.0F, false));

        this.legright6 = new AdvancedModelRenderer(this);
        this.legright6.setRotationPoint(-0.9F, 0.0F, 0.5F);
        this.body4.addChild(legright6);
        this.setRotateAngle(legright6, 1.3963F, 0.2182F, -0.3054F);
        this.legright6.cubeList.add(new ModelBox(legright6, 18, 5, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legright7 = new AdvancedModelRenderer(this);
        this.legright7.setRotationPoint(-0.9F, 0.0F, 2.0F);
        this.body4.addChild(legright7);
        this.setRotateAngle(legright7, 1.3963F, 0.2182F, -0.3054F);
        this.legright7.cubeList.add(new ModelBox(legright7, 18, 5, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legleft7 = new AdvancedModelRenderer(this);
        this.legleft7.setRotationPoint(0.9F, 0.0F, 2.0F);
        this.body4.addChild(legleft7);
        this.setRotateAngle(legleft7, 1.3963F, -0.2182F, 0.3054F);
        this.legleft7.cubeList.add(new ModelBox(legleft7, 18, 5, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.legleft6 = new AdvancedModelRenderer(this);
        this.legleft6.setRotationPoint(0.9F, 0.0F, 0.5F);
        this.body4.addChild(legleft6);
        this.setRotateAngle(legleft6, 1.3963F, -0.2182F, 0.3054F);
        this.legleft6.cubeList.add(new ModelBox(legleft6, 18, 5, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 16, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.5F, -0.5F, 0.7F);
        this.body5.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1745F, 0.5236F, 0.0873F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 10, 6, -2.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(1.5F, -0.5F, -0.3F);
        this.body5.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1745F, 0.6109F, 0.0873F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 10, -2.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.5F, -0.5F, 0.7F);
        this.body5.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1745F, -0.5236F, -0.0873F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 10, 6, 0.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, -0.5F, 0.7F);
        this.body5.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1745F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 2, -2.5F, 0.0F, 0.0F, 4, 0, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.5F, -0.5F, -0.3F);
        this.body5.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1745F, -0.6109F, -0.0873F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 10, 0.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5F, -0.5F, -0.3F);
        this.body5.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1745F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 0, -2.5F, 0.0F, 0.0F, 4, 0, 2, 0.0F, false));

        this.legright8 = new AdvancedModelRenderer(this);
        this.legright8.setRotationPoint(-0.9F, 0.0F, 1.5F);
        this.body5.addChild(legright8);
        this.setRotateAngle(legright8, 1.3963F, 0.2182F, -0.3054F);
        this.legright8.cubeList.add(new ModelBox(legright8, 18, 5, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legleft8 = new AdvancedModelRenderer(this);
        this.legleft8.setRotationPoint(0.9F, 0.0F, 1.5F);
        this.body5.addChild(legleft8);
        this.setRotateAngle(legleft8, 1.3963F, -0.2182F, 0.3054F);
        this.legleft8.cubeList.add(new ModelBox(legleft8, 18, 5, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 6, -1.0F, -0.5F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(1.8F, -0.475F, 1.7F);
        this.body6.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0873F, -0.3054F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 16, 16, -1.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(1.5F, -0.475F, 0.7F);
        this.body6.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.1745F, 0.1309F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 16, 13, -1.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(1.5F, -0.5F, -0.3F);
        this.body6.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1745F, 0.3054F, 0.0436F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 8, 16, -1.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.8F, -0.475F, 1.7F);
        this.body6.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0873F, 0.3054F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 16, 16, 0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, -0.5F, 1.45F);
        this.body6.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1745F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 12, 2, -1.5F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.5F, -0.475F, 0.7F);
        this.body6.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1745F, -0.1309F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 16, 13, 0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -0.5F, 0.7F);
        this.body6.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1745F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 12, 0, -1.5F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-1.5F, -0.5F, -0.3F);
        this.body6.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1745F, -0.3054F, -0.0436F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 8, 16, 0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5F, -0.5F, -0.3F);
        this.body6.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.1745F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 4, -2.5F, 0.0F, 0.0F, 4, 0, 2, 0.0F, false));

        this.legright9 = new AdvancedModelRenderer(this);
        this.legright9.setRotationPoint(-0.9F, 0.0F, 1.0F);
        this.body6.addChild(legright9);
        this.setRotateAngle(legright9, 1.3963F, 0.2182F, -0.3054F);
        this.legright9.cubeList.add(new ModelBox(legright9, 18, 5, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legright10 = new AdvancedModelRenderer(this);
        this.legright10.setRotationPoint(-0.9F, 0.0F, 2.5F);
        this.body6.addChild(legright10);
        this.setRotateAngle(legright10, 1.3963F, 0.2182F, -0.3054F);
        this.legright10.cubeList.add(new ModelBox(legright10, 18, 5, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legleft10 = new AdvancedModelRenderer(this);
        this.legleft10.setRotationPoint(0.9F, 0.0F, 2.5F);
        this.body6.addChild(legleft10);
        this.setRotateAngle(legleft10, 1.3963F, -0.2182F, 0.3054F);
        this.legleft10.cubeList.add(new ModelBox(legleft10, 18, 5, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.legleft9 = new AdvancedModelRenderer(this);
        this.legleft9.setRotationPoint(0.9F, 0.0F, 1.0F);
        this.body6.addChild(legleft9);
        this.setRotateAngle(legleft9, 1.3963F, -0.2182F, 0.3054F);
        this.legleft9.cubeList.add(new ModelBox(legleft9, 18, 5, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.base.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.base.offsetY = 0.04F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -1.2F;
        this.base.offsetX = 0.8F;
        this.base.offsetZ = 2.0F;
        this.base.rotateAngleY = (float)Math.toRadians(232);
        this.base.rotateAngleX = (float)Math.toRadians(40);
        this.base.rotateAngleZ = (float)Math.toRadians(0);
        this.base.scaleChildren = true;
        float scaler = 3.0F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
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
        //this.Body.offsetY = 1.1F;

        AdvancedModelRenderer[] legsL = {this.legleft, this.legleft2, this.legleft3, this.legleft4, this.legleft5, this.legleft6, this.legleft7, this.legleft8, this.legleft9, this.legleft10};
        AdvancedModelRenderer[] legsR = {this.legright, this.legright2, this.legright3, this.legright4, this.legright5, this.legright6, this.legright7, this.legright8, this.legright9, this.legright10};
        AdvancedModelRenderer[] bodyF = {this.body, this.body2, this.body3, this.body4, this.body5, this.body6};

        this.chainFlap(legsL, 0.6F, 0.5F * 1, -3, f2, 1);
        this.chainFlap(legsR, 0.6F, 0.5F * -1, -3, f2, 1);
        this.chainSwing(legsL, 0.6F, 0.2F * 1, 0, f2, 1);
        this.chainSwing(legsR, 0.6F, 0.2F * -1, -0, f2, 1);

        if (f3 != 0) {
            this.chainSwing(bodyF, 0.1F, 0.06F, -3, f2, 1.0F);
        }

//        this.swing(legleft, 0.2F, -0.5F * -1, true, 0, -0.5F * -1, f2, 0.3F);
//        this.swing(legright, 0.2F, 0.5F * -1, true, 0, 0.5F * -1, f2, 0.3F);
//        this.swing(legleft2, 0.2F, -0.5F * -1, true, 1.0F, -0.5F * -1, f2, 0.3F);
//        this.swing(legright2, 0.2F, 0.5F * -1, true, 1.0F, 0.5F * -1, f2, 0.3F);
//        this.swing(legleft3, 0.2F, -0.5F * -1, true, 2.0F, -0.5F * -1, f2, 0.3F);
//        this.swing(legright3, 0.2F, 0.5F * -1, true, 2.0F, 0.5F * -1, f2, 0.3F);
//        this.swing(legleft4, 0.2F, -0.5F * -1, true, 3.0F, -0.5F * -1, f2, 0.3F);
//        this.swing(legright4, 0.2F, 0.5F * -1, true, 3.0F, 0.5F * -1, f2, 0.3F);
//        this.swing(legleft5, 0.2F, -0.5F * -1, true, 4.0F, -0.5F * -1, f2, 0.3F);
//        this.swing(legright5, 0.2F, 0.5F * -1, true, 4.0F, 0.5F * -1, f2, 0.3F);
//        this.swing(legleft6, 0.2F, -0.5F * -1, true, 5.0F, -0.5F * -1, f2, 0.3F);
//        this.swing(legright6, 0.2F, 0.5F * -1, true, 5.0F, 0.5F * -1, f2, 0.3F);
//        this.swing(legleft7, 0.2F, -0.5F * -1, true, 6.0F, -0.5F * -1, f2, 0.3F);
//        this.swing(legright7, 0.2F, 0.5F * -1, true, 6.0F, 0.5F * -1, f2, 0.3F);
//        this.swing(legleft8, 0.2F, -0.5F * -1, true, 7.0F, -0.5F * -1, f2, 0.3F);
//        this.swing(legright8, 0.2F, 0.5F * -1, true, 7.0F, 0.5F * -1, f2, 0.3F);
//        this.swing(legleft9, 0.2F, -0.5F * -1, true, 8.0F, -0.5F * -1, f2, 0.3F);
//        this.swing(legright9, 0.2F, 0.5F * -1, true, 8.0F, 0.5F * -1, f2, 0.3F);
//        this.swing(legleft10, 0.2F, -0.5F * -1, true, 9.0F, -0.5F * -1, f2, 0.3F);
//        this.swing(legright10, 0.2F, 0.5F * -1, true, 9.0F, 0.5F * -1, f2, 0.3F);

    }
}
