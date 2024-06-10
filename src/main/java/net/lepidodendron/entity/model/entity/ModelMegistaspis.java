package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMegistaspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Lleg2;
    private final AdvancedModelRenderer Rleg3;
    private final AdvancedModelRenderer Rleg2;
    private final AdvancedModelRenderer Lleg1;
    private final AdvancedModelRenderer Rleg1;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer Lleg3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Rleg4;
    private final AdvancedModelRenderer Lleg4;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Lleg5;
    private final AdvancedModelRenderer Rleg5;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Lleg6;
    private final AdvancedModelRenderer Rleg6;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer Lleg9;
    private final AdvancedModelRenderer Rleg9;
    private final AdvancedModelRenderer Rleg8;
    private final AdvancedModelRenderer Lleg8;

    public ModelMegistaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.0F, -2.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 16, 24, -2.0F, -1.26F, -8.0F, 4, 1, 8, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 32, 17, -1.5F, -2.01F, -7.0F, 3, 1, 7, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 13, 25, -3.5F, -1.81F, -6.0F, 2, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 7, 10, 1.5F, -1.81F, -6.0F, 2, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(5.8589F, -0.75F, 0.9931F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5672F, 0.1745F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 16, 0.5F, 0.6F, -3.5F, 1, 0, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -1.5F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.2217F, 0.1745F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 43, -3.592F, -0.01F, -5.3103F, 4, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -1.5F, 0.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.1745F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 29, 0.0F, 0.0F, -2.0F, 5, 1, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 37, 0.0F, 0.01F, -5.0F, 3, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -1.5F, 0.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.1745F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 17, 0.0F, 0.01F, -6.0F, 2, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, -1.5F, 0.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.7854F, 0.1745F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 41, -4.9571F, 0.0F, -6.2929F, 4, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-5.8589F, -0.75F, 0.9931F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.5672F, -0.1745F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 2, 16, -1.5F, 0.6F, -3.5F, 1, 0, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -1.5F, 0.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.7854F, -0.1745F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 43, 0.9571F, 0.0F, -6.2929F, 4, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -1.5F, 0.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 1.2217F, -0.1745F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 44, -0.408F, -0.01F, -5.3103F, 4, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -1.5F, 0.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.1745F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 19, -2.0F, 0.01F, -6.0F, 2, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -1.5F, 0.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.1745F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 36, -3.0F, 0.01F, -5.0F, 3, 1, 3, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 36, -5.0F, 0.0F, -2.0F, 5, 1, 2, 0.0F, false));

        this.Lleg2 = new AdvancedModelRenderer(this);
        this.Lleg2.setRotationPoint(1.0F, 0.0F, -2.5F);
        this.head.addChild(Lleg2);
        this.setRotateAngle(Lleg2, 0.0F, 0.0F, 0.1745F);
        this.Lleg2.cubeList.add(new ModelBox(Lleg2, 43, 40, 0.0F, 0.01F, -0.5F, 5, 0, 1, 0.0F, false));

        this.Rleg3 = new AdvancedModelRenderer(this);
        this.Rleg3.setRotationPoint(-1.0F, 0.0F, -0.5F);
        this.head.addChild(Rleg3);
        this.setRotateAngle(Rleg3, 0.0F, 0.0F, -0.1745F);
        this.Rleg3.cubeList.add(new ModelBox(Rleg3, 32, 16, -5.0F, 0.01F, -0.5F, 5, 0, 1, 0.0F, false));

        this.Rleg2 = new AdvancedModelRenderer(this);
        this.Rleg2.setRotationPoint(-1.0F, 0.0F, -2.5F);
        this.head.addChild(Rleg2);
        this.setRotateAngle(Rleg2, 0.0F, 0.0F, -0.1745F);
        this.Rleg2.cubeList.add(new ModelBox(Rleg2, 39, 8, -5.0F, 0.01F, -0.5F, 5, 0, 1, 0.0F, false));

        this.Lleg1 = new AdvancedModelRenderer(this);
        this.Lleg1.setRotationPoint(1.0F, 0.0F, -4.5F);
        this.head.addChild(Lleg1);
        this.setRotateAngle(Lleg1, 0.0F, 0.0F, 0.1745F);
        this.Lleg1.cubeList.add(new ModelBox(Lleg1, 43, 43, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.Rleg1 = new AdvancedModelRenderer(this);
        this.Rleg1.setRotationPoint(-1.0F, 0.0F, -4.5F);
        this.head.addChild(Rleg1);
        this.setRotateAngle(Rleg1, 0.0F, 0.0F, -0.1745F);
        this.Rleg1.cubeList.add(new ModelBox(Rleg1, 43, 41, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-1.0F, 0.0F, -7.0F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.3491F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 5, -6.0F, -0.19F, -5.0F, 6, 0, 5, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(1.0F, 0.0F, -7.0F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.3491F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 0, 0.0F, -0.19F, -5.0F, 6, 0, 5, 0.0F, false));

        this.Lleg3 = new AdvancedModelRenderer(this);
        this.Lleg3.setRotationPoint(1.0F, 0.0F, -0.5F);
        this.head.addChild(Lleg3);
        this.setRotateAngle(Lleg3, 0.0F, 0.0F, 0.1745F);
        this.Lleg3.cubeList.add(new ModelBox(Lleg3, 43, 34, 0.0F, 0.01F, -0.5F, 5, 0, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.head.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 40, 4, -2.0F, -0.51F, 0.01F, 4, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.0F, 1.5F, 2.0F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.2182F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 33, -3.5F, -1.26F, -2.0F, 5, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.0F, 1.5F, 2.0F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.2182F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 36, -1.5F, -1.26F, -2.0F, 5, 1, 2, 0.0F, false));

        this.Rleg4 = new AdvancedModelRenderer(this);
        this.Rleg4.setRotationPoint(-1.0F, 1.5F, 1.5F);
        this.body2.addChild(Rleg4);
        this.setRotateAngle(Rleg4, 0.0F, 0.0F, -0.1745F);
        this.Rleg4.cubeList.add(new ModelBox(Rleg4, 12, 31, -5.0F, 0.01F, -0.5F, 5, 0, 1, 0.0F, false));

        this.Lleg4 = new AdvancedModelRenderer(this);
        this.Lleg4.setRotationPoint(1.0F, 1.5F, 1.5F);
        this.body2.addChild(Lleg4);
        this.setRotateAngle(Lleg4, 0.0F, 0.0F, 0.1745F);
        this.Lleg4.cubeList.add(new ModelBox(Lleg4, 43, 33, 0.0F, 0.01F, -0.5F, 5, 0, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 22, 39, -1.99F, -0.5F, 0.01F, 4, 2, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.0F, 1.5F, 0.0F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.2182F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 33, 10, -3.51F, -1.25F, 0.0F, 5, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.0F, 1.5F, 0.0F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.2182F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 34, -1.49F, -1.25F, 0.0F, 5, 1, 2, 0.0F, false));

        this.Lleg5 = new AdvancedModelRenderer(this);
        this.Lleg5.setRotationPoint(1.0F, 1.5F, 1.25F);
        this.body3.addChild(Lleg5);
        this.setRotateAngle(Lleg5, 0.0F, 0.0F, 0.1745F);
        this.Lleg5.cubeList.add(new ModelBox(Lleg5, 43, 30, 0.0F, 0.01F, -0.25F, 5, 0, 1, 0.0F, false));

        this.Rleg5 = new AdvancedModelRenderer(this);
        this.Rleg5.setRotationPoint(-1.0F, 1.5F, 1.5F);
        this.body3.addChild(Rleg5);
        this.setRotateAngle(Rleg5, 0.0F, 0.0F, -0.1745F);
        this.Rleg5.cubeList.add(new ModelBox(Rleg5, 12, 30, -5.0F, 0.01F, -0.5F, 5, 0, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 10, 39, -2.0F, -0.51F, 0.01F, 4, 2, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.0F, 1.5F, -2.0F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.2182F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 33, 13, -3.5F, -1.26F, 2.0F, 5, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.0F, 1.5F, -2.0F);
        this.body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.2182F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 33, -1.5F, -1.26F, 2.0F, 5, 1, 2, 0.0F, false));

        this.Lleg6 = new AdvancedModelRenderer(this);
        this.Lleg6.setRotationPoint(1.0F, 1.5F, 1.5F);
        this.body4.addChild(Lleg6);
        this.setRotateAngle(Lleg6, 0.0F, 0.0F, 0.1745F);
        this.Lleg6.cubeList.add(new ModelBox(Lleg6, 43, 29, 0.0F, 0.01F, -0.5F, 5, 0, 1, 0.0F, false));

        this.Rleg6 = new AdvancedModelRenderer(this);
        this.Rleg6.setRotationPoint(-1.0F, 1.5F, 1.5F);
        this.body4.addChild(Rleg6);
        this.setRotateAngle(Rleg6, 0.0F, 0.0F, -0.1745F);
        this.Rleg6.cubeList.add(new ModelBox(Rleg6, 12, 29, -5.0F, 0.01F, -0.5F, 5, 0, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);


        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.body5.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -1.5F, 0.74F, 0.0F, 3, 0, 17, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 16, -2.0F, -0.285F, -0.5F, 4, 1, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.01F, 0.0F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0611F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 26, -1.5F, 0.0F, 0.0F, 3, 1, 7, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 0.245F, 3.0F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.1745F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 34, 40, -4.5F, -0.505F, -3.0F, 4, 1, 2, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 10, -1.0F, -0.505F, -1.0F, 1, 1, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.245F, 3.0F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.9599F, -0.1745F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 32, 25, -3.4083F, -0.495F, 0.092F, 6, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 0.245F, 3.0F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.1745F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 33, 4, 0.0F, -0.505F, -1.0F, 1, 1, 5, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 34, 43, 0.5F, -0.505F, -3.0F, 4, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 0.245F, 3.0F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.9599F, 0.1745F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 33, 0, -2.5917F, -0.495F, 0.092F, 6, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.5F, 0.74F, 8.0F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.1309F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 11, 0, -5.0F, 0.0F, -8.0F, 5, 0, 12, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.5F, 0.74F, 8.0F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.1309F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 11, 12, 0.0F, 0.0F, -8.0F, 5, 0, 12, 0.0F, false));

        this.Lleg9 = new AdvancedModelRenderer(this);
        this.Lleg9.setRotationPoint(1.0F, 1.0F, 3.5F);
        this.tail.addChild(Lleg9);
        this.setRotateAngle(Lleg9, 0.0F, 0.0F, 0.1745F);
        this.Lleg9.cubeList.add(new ModelBox(Lleg9, 39, 32, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.Rleg9 = new AdvancedModelRenderer(this);
        this.Rleg9.setRotationPoint(-1.0F, 1.0F, 3.5F);
        this.tail.addChild(Rleg9);
        this.setRotateAngle(Rleg9, 0.0F, 0.0F, -0.1745F);
        this.Rleg9.cubeList.add(new ModelBox(Rleg9, 6, 14, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.Rleg8 = new AdvancedModelRenderer(this);
        this.Rleg8.setRotationPoint(-1.0F, 1.0F, 1.5F);
        this.tail.addChild(Rleg8);
        this.setRotateAngle(Rleg8, 0.0F, 0.0F, -0.1745F);
        this.Rleg8.cubeList.add(new ModelBox(Rleg8, 0, 25, -5.0F, 0.01F, -0.5F, 5, 0, 1, 0.0F, false));

        this.Lleg8 = new AdvancedModelRenderer(this);
        this.Lleg8.setRotationPoint(1.0F, 1.0F, 1.5F);
        this.tail.addChild(Lleg8);
        this.setRotateAngle(Lleg8, 0.0F, 0.0F, 0.1745F);
        this.Lleg8.cubeList.add(new ModelBox(Lleg8, 42, 16, 0.0F, 0.01F, -0.5F, 5, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.05F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.05F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.05F, 0.0F);
        this.body.offsetY = 0.055F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.body.offsetY = -0.05F;
        this.body.render(0.01F);
        resetToDefaultPose();
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
        //this.Body.offsetY = 1.1F;

        AdvancedModelRenderer[] legsL = {this.Lleg1, this.Lleg2, this.Lleg3, this.Lleg4, this.Lleg5, this.Lleg6, this.Lleg8, this.Lleg9};
        AdvancedModelRenderer[] legsR = {this.Rleg1, this.Rleg2, this.Rleg3, this.Rleg4, this.Rleg5, this.Rleg6, this.Rleg8, this.Rleg9};
        AdvancedModelRenderer[] bodyF = {this.body2, this.body3, this.body4, this.tail};


        this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
        this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

        this.swing(antennaL, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        if (f3 != 0) {
            this.chainSwing(bodyF, 0.1F, 0.06F, -3, f2, 1.0F);
        }

        this.flap(Lleg1, 0.5F, -0.5F, true, 0, -0.5F, f2, 0.3F);
        this.flap(Rleg1, 0.5F, 0.5F, true, 0, 0.5F, f2, 0.3F);
        this.flap(Lleg2, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
        this.flap(Rleg2, 0.5F, 0.5F, true, 1.0F, 0.5F, f2, 0.3F);
        this.flap(Lleg3, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
        this.flap(Rleg3, 0.5F, 0.5F, true, 2.0F, 0.5F, f2, 0.3F);
        this.flap(Lleg4, 0.5F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
        this.flap(Rleg4, 0.5F, 0.5F, true, 3.0F, 0.5F, f2, 0.3F);
        this.flap(Lleg5, 0.5F, -0.5F, true, 4.0F, -0.5F, f2, 0.3F);
        this.flap(Rleg5, 0.5F, 0.5F, true, 4.0F, 0.5F, f2, 0.3F);
        this.flap(Lleg6, 0.5F, -0.5F, true, 5.0F, -0.5F, f2, 0.3F);
        this.flap(Rleg6, 0.5F, 0.5F, true, 5.0F, 0.5F, f2, 0.3F);
        this.flap(Lleg8, 0.5F, -0.5F, true, 6.0F, -0.5F, f2, 0.3F);
        this.flap(Rleg8, 0.5F, 0.5F, true, 6.0F, 0.5F, f2, 0.3F);
        this.flap(Lleg9, 0.5F, -0.5F, true, 7.0F, -0.5F, f2, 0.3F);
        this.flap(Rleg9, 0.5F, 0.5F, true, 7.0F, 0.5F, f2, 0.3F);

    }
}
