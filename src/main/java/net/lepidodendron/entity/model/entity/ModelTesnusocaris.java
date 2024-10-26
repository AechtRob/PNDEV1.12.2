package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelTesnusocaris extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer antennaleft;
    private final AdvancedModelRenderer headlegright;
    private final AdvancedModelRenderer headlegleft;
    private final AdvancedModelRenderer headlegright2;
    private final AdvancedModelRenderer headlegleft2;
    private final AdvancedModelRenderer headlegright3;
    private final AdvancedModelRenderer headlegleft3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer legleft5;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer legright6;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer legleft6;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer legright7;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer legleft7;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer legright8;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer legleft8;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer legright9;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer legleft9;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer legright10;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer legleft10;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer legright11;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer legleft11;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer legright12;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer legleft12;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer legright13;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer legleft13;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer legright14;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer legleft14;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer legright15;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer legleft15;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer legright16;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer legleft16;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer legright17;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer legleft17;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer legright18;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer legleft18;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer legright19;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer legleft19;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer legright20;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer legleft20;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer legright21;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer legleft21;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer legright22;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer legleft22;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer telson;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;

    public ModelTesnusocaris() {
        this.textureWidth = 27;
        this.textureHeight = 20;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, -3.1416F);
        this.head.cubeList.add(new ModelBox(head, 0, 12, -1.5F, -1.0F, -8.0F, 3, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 5, -2.0F, -1.0F, -6.5F, 4, 1, 3, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -1.0F, -7.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 3, -0.35F, 0.0F, -0.75F, 1, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 3, -1.65F, 0.0F, -0.75F, 1, 1, 1, 0.0F, false));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(-0.75F, 0.0F, -6.5F);
        this.head.addChild(antennaright);
        this.setRotateAngle(antennaright, 0.0F, -0.2618F, -0.2182F);
        this.antennaright.cubeList.add(new ModelBox(antennaright, 0, 0, -10.0F, 0.0F, -0.5F, 10, 0, 5, 0.0F, false));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(0.75F, 0.0F, -6.5F);
        this.head.addChild(antennaleft);
        this.setRotateAngle(antennaleft, 0.0F, 0.2618F, 0.2182F);
        this.antennaleft.cubeList.add(new ModelBox(antennaleft, 0, 0, 0.0F, 0.0F, -0.5F, 10, 0, 5, 0.0F, true));

        this.headlegright = new AdvancedModelRenderer(this);
        this.headlegright.setRotationPoint(-0.25F, 0.0F, -5.5F);
        this.head.addChild(headlegright);
        this.setRotateAngle(headlegright, 0.0F, 0.0F, -0.2618F);
        this.headlegright.cubeList.add(new ModelBox(headlegright, 0, 2, -1.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.headlegleft = new AdvancedModelRenderer(this);
        this.headlegleft.setRotationPoint(0.25F, 0.0F, -5.5F);
        this.head.addChild(headlegleft);
        this.setRotateAngle(headlegleft, 0.0F, 0.0F, 0.2618F);
        this.headlegleft.cubeList.add(new ModelBox(headlegleft, 0, 2, -0.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.headlegright2 = new AdvancedModelRenderer(this);
        this.headlegright2.setRotationPoint(-0.25F, 0.0F, -4.75F);
        this.head.addChild(headlegright2);
        this.setRotateAngle(headlegright2, 0.1745F, 0.1309F, -0.2618F);
        this.headlegright2.cubeList.add(new ModelBox(headlegright2, 0, 17, -2.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.headlegleft2 = new AdvancedModelRenderer(this);
        this.headlegleft2.setRotationPoint(0.25F, 0.0F, -4.75F);
        this.head.addChild(headlegleft2);
        this.setRotateAngle(headlegleft2, 0.1745F, -0.1309F, 0.2618F);
        this.headlegleft2.cubeList.add(new ModelBox(headlegleft2, 0, 17, -0.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.headlegright3 = new AdvancedModelRenderer(this);
        this.headlegright3.setRotationPoint(-0.25F, 0.0F, -4.0F);
        this.head.addChild(headlegright3);
        this.setRotateAngle(headlegright3, 0.1745F, 0.2618F, -0.2618F);
        this.headlegright3.cubeList.add(new ModelBox(headlegright3, 15, 16, -2.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.headlegleft3 = new AdvancedModelRenderer(this);
        this.headlegleft3.setRotationPoint(0.25F, 0.0F, -4.0F);
        this.head.addChild(headlegleft3);
        this.setRotateAngle(headlegleft3, 0.1745F, -0.2618F, 0.2618F);
        this.headlegleft3.cubeList.add(new ModelBox(headlegleft3, 15, 16, -0.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.75F, -3.5F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 9, -2.0F, -0.25F, 0.0F, 4, 1, 2, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.55F, 0.75F, -0.35F);
        this.body.addChild(legright);
        this.setRotateAngle(legright, -0.1745F, 0.7854F, -0.3491F);
        this.legright.cubeList.add(new ModelBox(legright, 10, 5, -5.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2618F, -0.3054F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 13, -4.0F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.55F, 0.75F, -0.35F);
        this.body.addChild(legleft);
        this.setRotateAngle(legleft, -0.1745F, -0.7854F, 0.3491F);
        this.legleft.cubeList.add(new ModelBox(legleft, 10, 5, 0.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2618F, 0.3054F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 7, 13, 0.0F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.55F, 0.75F, 0.65F);
        this.body.addChild(legright2);
        this.setRotateAngle(legright2, -0.1745F, 0.7854F, -0.3491F);
        this.legright2.cubeList.add(new ModelBox(legright2, 9, 9, -5.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2618F, -0.3054F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 7, -4.0F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.55F, 0.75F, 0.65F);
        this.body.addChild(legleft2);
        this.setRotateAngle(legleft2, -0.1745F, -0.7854F, 0.3491F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 9, 9, 0.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.2618F, 0.3054F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 7, 0.0F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 9, -2.0F, -0.25F, 0.0F, 4, 1, 2, 0.01F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.55F, 0.75F, -0.35F);
        this.body2.addChild(legright3);
        this.setRotateAngle(legright3, -0.1745F, 0.7854F, -0.3491F);
        this.legright3.cubeList.add(new ModelBox(legright3, 10, 5, -5.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.2618F, -0.3054F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 13, -4.0F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.55F, 0.75F, -0.35F);
        this.body2.addChild(legleft3);
        this.setRotateAngle(legleft3, -0.1745F, -0.7854F, 0.3491F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 10, 5, 0.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.2618F, 0.3054F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 13, 0.0F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-0.55F, 0.75F, 0.65F);
        this.body2.addChild(legright4);
        this.setRotateAngle(legright4, -0.1745F, 0.7854F, -0.3491F);
        this.legright4.cubeList.add(new ModelBox(legright4, 9, 9, -5.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.2618F, -0.3054F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 7, -4.0F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(0.55F, 0.75F, 0.65F);
        this.body2.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.0F, -0.7854F, 0.3491F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 9, 9, 0.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.2618F, 0.3054F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 7, 0.0F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 9, -2.0F, -0.25F, 0.0F, 4, 1, 2, 0.0F, false));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-0.55F, 0.75F, -0.35F);
        this.body3.addChild(legright5);
        this.setRotateAngle(legright5, -0.1745F, 0.7854F, -0.3491F);
        this.legright5.cubeList.add(new ModelBox(legright5, 10, 5, -4.75F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.2618F, -0.3054F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 7, 13, -3.75F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft5 = new AdvancedModelRenderer(this);
        this.legleft5.setRotationPoint(0.55F, 0.75F, -0.35F);
        this.body3.addChild(legleft5);
        this.setRotateAngle(legleft5, -0.1745F, -0.7854F, 0.3491F);
        this.legleft5.cubeList.add(new ModelBox(legleft5, 10, 5, -0.25F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.2618F, 0.3054F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 7, 13, -0.25F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.legright6 = new AdvancedModelRenderer(this);
        this.legright6.setRotationPoint(-0.55F, 0.75F, 0.65F);
        this.body3.addChild(legright6);
        this.setRotateAngle(legright6, -0.1745F, 0.7854F, -0.3491F);
        this.legright6.cubeList.add(new ModelBox(legright6, 9, 9, -4.75F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright6.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2618F, -0.3054F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 7, -3.75F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft6 = new AdvancedModelRenderer(this);
        this.legleft6.setRotationPoint(0.55F, 0.75F, 0.65F);
        this.body3.addChild(legleft6);
        this.setRotateAngle(legleft6, -0.1745F, -0.7854F, 0.3491F);
        this.legleft6.cubeList.add(new ModelBox(legleft6, 9, 9, -0.25F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft6.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.2618F, 0.3054F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 10, 7, -0.25F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 9, -2.0F, -0.25F, 0.0F, 4, 1, 2, 0.01F, false));

        this.legright7 = new AdvancedModelRenderer(this);
        this.legright7.setRotationPoint(-0.55F, 0.75F, -0.35F);
        this.body4.addChild(legright7);
        this.setRotateAngle(legright7, -0.1745F, 0.7854F, -0.3491F);
        this.legright7.cubeList.add(new ModelBox(legright7, 10, 5, -4.75F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright7.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.2618F, -0.3054F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 7, 13, -3.75F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft7 = new AdvancedModelRenderer(this);
        this.legleft7.setRotationPoint(0.55F, 0.75F, -0.35F);
        this.body4.addChild(legleft7);
        this.setRotateAngle(legleft7, -0.1745F, -0.7854F, 0.3491F);
        this.legleft7.cubeList.add(new ModelBox(legleft7, 10, 5, -0.25F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft7.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.2618F, 0.3054F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 13, -0.25F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.legright8 = new AdvancedModelRenderer(this);
        this.legright8.setRotationPoint(-0.55F, 0.75F, 0.65F);
        this.body4.addChild(legright8);
        this.setRotateAngle(legright8, -0.1745F, 0.7854F, -0.3491F);
        this.legright8.cubeList.add(new ModelBox(legright8, 9, 9, -4.75F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright8.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.2618F, -0.3054F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 7, -3.75F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft8 = new AdvancedModelRenderer(this);
        this.legleft8.setRotationPoint(0.55F, 0.75F, 0.65F);
        this.body4.addChild(legleft8);
        this.setRotateAngle(legleft8, -0.1745F, -0.7854F, 0.3491F);
        this.legleft8.cubeList.add(new ModelBox(legleft8, 9, 9, -0.25F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft8.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.2618F, 0.3054F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 7, -0.25F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 9, -2.0F, -0.25F, 0.0F, 4, 1, 2, 0.0F, false));

        this.legright9 = new AdvancedModelRenderer(this);
        this.legright9.setRotationPoint(-0.55F, 0.75F, -0.35F);
        this.body5.addChild(legright9);
        this.setRotateAngle(legright9, -0.1745F, 0.7854F, -0.3491F);
        this.legright9.cubeList.add(new ModelBox(legright9, 10, 5, -4.5F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright9.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.2618F, -0.3054F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 7, 13, -3.5F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft9 = new AdvancedModelRenderer(this);
        this.legleft9.setRotationPoint(0.55F, 0.75F, -0.35F);
        this.body5.addChild(legleft9);
        this.setRotateAngle(legleft9, -0.1745F, -0.7854F, 0.3491F);
        this.legleft9.cubeList.add(new ModelBox(legleft9, 10, 5, -0.5F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft9.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.2618F, 0.3054F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 7, 13, -0.5F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.legright10 = new AdvancedModelRenderer(this);
        this.legright10.setRotationPoint(-0.55F, 0.75F, 0.65F);
        this.body5.addChild(legright10);
        this.setRotateAngle(legright10, -0.1745F, 0.7854F, -0.3491F);
        this.legright10.cubeList.add(new ModelBox(legright10, 9, 9, -4.5F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright10.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.2618F, -0.3054F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 10, 7, -3.5F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft10 = new AdvancedModelRenderer(this);
        this.legleft10.setRotationPoint(0.55F, 0.75F, 0.65F);
        this.body5.addChild(legleft10);
        this.setRotateAngle(legleft10, -0.1745F, -0.7854F, 0.3491F);
        this.legleft10.cubeList.add(new ModelBox(legleft10, 9, 9, -0.5F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft10.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.2618F, 0.3054F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 10, 7, -0.5F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 9, -2.0F, -0.25F, 0.0F, 4, 1, 2, 0.01F, false));

        this.legright11 = new AdvancedModelRenderer(this);
        this.legright11.setRotationPoint(-0.55F, 0.75F, -0.35F);
        this.body6.addChild(legright11);
        this.setRotateAngle(legright11, -0.1745F, 0.7854F, -0.3491F);
        this.legright11.cubeList.add(new ModelBox(legright11, 10, 5, -4.5F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright11.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.2618F, -0.3054F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 7, 13, -3.5F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft11 = new AdvancedModelRenderer(this);
        this.legleft11.setRotationPoint(0.55F, 0.75F, -0.35F);
        this.body6.addChild(legleft11);
        this.setRotateAngle(legleft11, -0.1745F, -0.7854F, 0.3491F);
        this.legleft11.cubeList.add(new ModelBox(legleft11, 10, 5, -0.5F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft11.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.2618F, 0.3054F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 7, 13, -0.5F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.legright12 = new AdvancedModelRenderer(this);
        this.legright12.setRotationPoint(-0.55F, 0.75F, 0.65F);
        this.body6.addChild(legright12);
        this.setRotateAngle(legright12, -0.1745F, 0.7854F, -0.3491F);
        this.legright12.cubeList.add(new ModelBox(legright12, 9, 9, -4.5F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright12.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.2618F, -0.3054F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 10, 7, -3.5F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft12 = new AdvancedModelRenderer(this);
        this.legleft12.setRotationPoint(0.55F, 0.75F, 0.65F);
        this.body6.addChild(legleft12);
        this.setRotateAngle(legleft12, -0.1745F, -0.7854F, 0.3491F);
        this.legleft12.cubeList.add(new ModelBox(legleft12, 9, 9, -0.5F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft12.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.2618F, 0.3054F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 10, 7, -0.5F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 0, 9, -2.0F, -0.25F, 0.0F, 4, 1, 2, 0.0F, false));

        this.legright13 = new AdvancedModelRenderer(this);
        this.legright13.setRotationPoint(-0.55F, 0.75F, -0.35F);
        this.body7.addChild(legright13);
        this.setRotateAngle(legright13, -0.1745F, 0.7854F, -0.3491F);
        this.legright13.cubeList.add(new ModelBox(legright13, 10, 5, -4.25F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright13.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.2618F, -0.3054F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 7, 13, -3.25F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft13 = new AdvancedModelRenderer(this);
        this.legleft13.setRotationPoint(0.55F, 0.75F, -0.35F);
        this.body7.addChild(legleft13);
        this.setRotateAngle(legleft13, -0.1745F, -0.7854F, 0.3491F);
        this.legleft13.cubeList.add(new ModelBox(legleft13, 10, 5, -0.75F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft13.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.2618F, 0.3054F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 7, 13, -0.75F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.legright14 = new AdvancedModelRenderer(this);
        this.legright14.setRotationPoint(-0.55F, 0.75F, 0.65F);
        this.body7.addChild(legright14);
        this.setRotateAngle(legright14, -0.1745F, 0.7854F, -0.3491F);
        this.legright14.cubeList.add(new ModelBox(legright14, 9, 9, -4.25F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright14.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.2618F, -0.3054F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 10, 7, -3.25F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft14 = new AdvancedModelRenderer(this);
        this.legleft14.setRotationPoint(0.55F, 0.75F, 0.65F);
        this.body7.addChild(legleft14);
        this.setRotateAngle(legleft14, -0.1745F, -0.7854F, 0.3491F);
        this.legleft14.cubeList.add(new ModelBox(legleft14, 9, 9, -0.75F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft14.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.2618F, 0.3054F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 10, 7, -0.75F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 10, 10, -1.5F, -0.25F, 0.0F, 3, 1, 2, 0.01F, false));

        this.legright15 = new AdvancedModelRenderer(this);
        this.legright15.setRotationPoint(-0.55F, 0.75F, -0.35F);
        this.body8.addChild(legright15);
        this.setRotateAngle(legright15, -0.1745F, 0.7854F, -0.3491F);
        this.legright15.cubeList.add(new ModelBox(legright15, 10, 5, -4.25F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright15.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.2618F, -0.3054F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 7, 13, -3.0F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft15 = new AdvancedModelRenderer(this);
        this.legleft15.setRotationPoint(0.55F, 0.75F, -0.35F);
        this.body8.addChild(legleft15);
        this.setRotateAngle(legleft15, -0.1745F, -0.7854F, 0.3491F);
        this.legleft15.cubeList.add(new ModelBox(legleft15, 10, 5, -0.75F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft15.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -0.2618F, 0.3054F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 7, 13, -1.0F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.legright16 = new AdvancedModelRenderer(this);
        this.legright16.setRotationPoint(-0.55F, 0.75F, 0.65F);
        this.body8.addChild(legright16);
        this.setRotateAngle(legright16, -0.1745F, 0.7854F, -0.3491F);
        this.legright16.cubeList.add(new ModelBox(legright16, 9, 9, -4.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright16.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.2618F, -0.3054F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 10, 7, -3.0F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft16 = new AdvancedModelRenderer(this);
        this.legleft16.setRotationPoint(0.55F, 0.75F, 0.65F);
        this.body8.addChild(legleft16);
        this.setRotateAngle(legleft16, -0.1745F, -0.7854F, 0.3491F);
        this.legleft16.cubeList.add(new ModelBox(legleft16, 9, 9, -1.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft16.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.2618F, 0.3054F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 10, 7, -1.0F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 10, 10, -1.5F, -0.25F, 0.0F, 3, 1, 2, 0.0F, false));

        this.legright17 = new AdvancedModelRenderer(this);
        this.legright17.setRotationPoint(-0.55F, 0.75F, -0.35F);
        this.body9.addChild(legright17);
        this.setRotateAngle(legright17, -0.1745F, 0.7854F, -0.3491F);
        this.legright17.cubeList.add(new ModelBox(legright17, 10, 5, -3.75F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright17.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.2618F, -0.3054F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 7, 13, -3.0F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft17 = new AdvancedModelRenderer(this);
        this.legleft17.setRotationPoint(0.55F, 0.75F, -0.35F);
        this.body9.addChild(legleft17);
        this.setRotateAngle(legleft17, -0.1745F, -0.7854F, 0.3491F);
        this.legleft17.cubeList.add(new ModelBox(legleft17, 10, 5, -1.25F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft17.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.2618F, 0.3054F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 7, 13, -1.0F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.legright18 = new AdvancedModelRenderer(this);
        this.legright18.setRotationPoint(-0.55F, 0.75F, 0.65F);
        this.body9.addChild(legright18);
        this.setRotateAngle(legright18, -0.1745F, 0.7854F, -0.3491F);
        this.legright18.cubeList.add(new ModelBox(legright18, 9, 9, -3.5F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright18.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.2618F, -0.3054F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 10, 7, -3.0F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft18 = new AdvancedModelRenderer(this);
        this.legleft18.setRotationPoint(0.55F, 0.75F, 0.65F);
        this.body9.addChild(legleft18);
        this.setRotateAngle(legleft18, -0.1745F, -0.7854F, 0.3491F);
        this.legleft18.cubeList.add(new ModelBox(legleft18, 9, 9, -1.5F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft18.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.2618F, 0.3054F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 10, 7, -1.0F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 10, 10, -1.5F, -0.25F, 0.0F, 3, 1, 2, 0.01F, false));

        this.legright19 = new AdvancedModelRenderer(this);
        this.legright19.setRotationPoint(-0.55F, 0.75F, -0.35F);
        this.body10.addChild(legright19);
        this.setRotateAngle(legright19, -0.1745F, 0.7854F, -0.3491F);
        this.legright19.cubeList.add(new ModelBox(legright19, 10, 5, -3.25F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright19.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.2618F, -0.3054F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 7, 13, -2.75F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft19 = new AdvancedModelRenderer(this);
        this.legleft19.setRotationPoint(0.55F, 0.75F, -0.35F);
        this.body10.addChild(legleft19);
        this.setRotateAngle(legleft19, -0.1745F, -0.7854F, 0.3491F);
        this.legleft19.cubeList.add(new ModelBox(legleft19, 10, 5, -1.75F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft19.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, -0.2618F, 0.3054F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 7, 13, -1.25F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.legright20 = new AdvancedModelRenderer(this);
        this.legright20.setRotationPoint(-0.55F, 0.75F, 0.65F);
        this.body10.addChild(legright20);
        this.setRotateAngle(legright20, -0.1745F, 0.7854F, -0.3491F);
        this.legright20.cubeList.add(new ModelBox(legright20, 9, 9, -3.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright20.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.2618F, -0.3054F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 10, 7, -2.75F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.legleft20 = new AdvancedModelRenderer(this);
        this.legleft20.setRotationPoint(0.55F, 0.75F, 0.65F);
        this.body10.addChild(legleft20);
        this.setRotateAngle(legleft20, -0.1745F, -0.7854F, 0.3491F);
        this.legleft20.cubeList.add(new ModelBox(legleft20, 9, 9, -2.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft20.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, -0.2618F, 0.3054F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 10, 7, -1.25F, 0.0F, -1.0F, 4, 0, 1, 0.0F, true));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body10.addChild(body11);
        this.body11.cubeList.add(new ModelBox(body11, 14, 13, -1.0F, -0.25F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legright21 = new AdvancedModelRenderer(this);
        this.legright21.setRotationPoint(-0.55F, 0.75F, -0.35F);
        this.body11.addChild(legright21);
        this.setRotateAngle(legright21, -0.1745F, 0.7854F, -0.3491F);
        this.legright21.cubeList.add(new ModelBox(legright21, 11, 5, -2.5F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright21.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.2618F, -0.3054F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 16, -2.5F, 0.0F, -1.0F, 3, 0, 1, 0.0F, false));

        this.legleft21 = new AdvancedModelRenderer(this);
        this.legleft21.setRotationPoint(0.55F, 0.75F, -0.35F);
        this.body11.addChild(legleft21);
        this.setRotateAngle(legleft21, -0.1745F, -0.7854F, 0.3491F);
        this.legleft21.cubeList.add(new ModelBox(legleft21, 11, 5, -1.5F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft21.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, -0.2618F, 0.3054F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 16, -0.5F, 0.0F, -1.0F, 3, 0, 1, 0.0F, true));

        this.legright22 = new AdvancedModelRenderer(this);
        this.legright22.setRotationPoint(-0.55F, 0.75F, 0.65F);
        this.body11.addChild(legright22);
        this.setRotateAngle(legright22, -0.1745F, 0.7854F, -0.3491F);
        this.legright22.cubeList.add(new ModelBox(legright22, 11, 9, -2.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legright22.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.2618F, -0.3054F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 13, 8, -2.25F, 0.0F, -1.0F, 3, 0, 1, 0.0F, false));

        this.legleft22 = new AdvancedModelRenderer(this);
        this.legleft22.setRotationPoint(0.55F, 0.75F, 0.65F);
        this.body11.addChild(legleft22);
        this.setRotateAngle(legleft22, -0.1745F, -0.7854F, 0.3491F);
        this.legleft22.cubeList.add(new ModelBox(legleft22, 11, 9, -1.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.legleft22.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, -0.2618F, 0.3054F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 13, 8, -0.75F, 0.0F, -1.0F, 3, 0, 1, 0.0F, true));

        this.telson = new AdvancedModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body11.addChild(telson);
        this.telson.cubeList.add(new ModelBox(telson, 8, 14, -1.0F, -0.25F, 0.0F, 2, 1, 2, 0.01F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.75F, 2.0F);
        this.telson.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.3491F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 0, 0.0F, -0.5F, 0.0F, 1, 0, 2, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.75F, 2.0F);
        this.telson.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, -0.3491F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 0, -1.0F, -0.5F, 0.0F, 1, 0, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.head.render(f5 * 0.25F);
        this.head.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.head.offsetX = -0.F;
        this.head.offsetY = -0F;
        this.head.offsetZ = 0.0F;
        this.head.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    @Override
    public void renderStaticBook(float f) {

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
        //this.Body.offsetY = 1.17F;
        //this.gill.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.gill.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.telson};
        AdvancedModelRenderer[] legsL = {this.legright, this.legright2, this.legright3, this.legright4, this.legright5, this.legright6, this.legright7, this.legright8,
                this.legright9, this.legright10, this.legright11, this.legright12, this.legright13, this.legright14, this.legright15, this.legright16, this.legright17,
                this.legright18, this.legright19, this.legright20, this.legright21, this.legright22};
        AdvancedModelRenderer[] legsR = {this.legleft, this.legleft2, this.legleft3, this.legleft4, this.legleft5, this.legleft6, this.legleft7, this.legleft8,
                this.legleft9, this.legleft10, this.legleft11, this.legleft12, this.legleft13, this.legleft14, this.legleft15, this.legleft16, this.legleft17,
                this.legleft18, this.legleft19, this.legleft20, this.legleft21, this.legleft22};
        //left and right are inverted on this one
        AdvancedModelRenderer[] handL = {this.headlegright, this.headlegright2, this.headlegright3};
        AdvancedModelRenderer[] handR = {this.headlegleft, this.headlegleft2, this.headlegleft3};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if(e.isInWater()) {
                //this.chainWave(fishTail, speed, 0.05F, -3.5, f2, 1);
                this.chainSwing(fishTail, speed * 3, 0.05F, -9, f2, 0.7F);
                this.chainWave(handL, speed, 0.2F, -3, f2, 1);
                this.chainSwing(handL, speed, 0.05F, -3, f2, 0.7F);
                this.chainWave(handR, speed, 0.2F, -3, f2, 1);
                this.chainSwing(handR, speed, 0.05F, -3, f2, 0.7F);
                this.chainFlap(legsL, speed * 5, -0.5F, -3, f2, 0.7F);
                this.chainFlap(legsR, speed * 5, 0.5F, -3, f2, 0.7F);
                this.walk(antennaright, speed, 0.5F, false, 0, -0.5F, f2, 0.3F);
                this.walk(antennaleft, speed, 0.5F, false, 0, -0.5F, f2, 0.3F);
                //this.swing(head, speed, 0.05F, true, 0, 0, f2, 1);
                this.bob(head, speed * 4, 0.4F, false, f2, 1);
            }
            else {
                this.head.rotateAngleX = (float) Math.toRadians(180);
                this.swing(antennaright, speed, 0.3F, false, 0, -0.5F, f2, 0.3F);
                this.swing(antennaleft, speed, -0.3F, false, 0, -0.5F, f2, 0.3F);
                //this.Body.offsetY = 1.07F;
                //this.bob(head, -speed, 5F, false, f2, 1);
            }
        }
    }
}
