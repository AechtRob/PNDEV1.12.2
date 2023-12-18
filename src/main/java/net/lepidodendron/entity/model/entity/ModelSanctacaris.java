package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelSanctacaris extends AdvancedModelBase {
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer hat;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer legR13;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer legL13;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer legL14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer legL15;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer legL16;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer legR14;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer legR15;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer legR16;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer legR11;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer legR12;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer legL10;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer legL11;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer legL12;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer jawR5;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer jawL5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer jawR4;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer jawL4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer jawR3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer jawL3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer jawR2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer jawL2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer jawR;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer jawL;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer cube_r64;

    public ModelSanctacaris() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 21.5F, 0.0F);
        this.setRotateAngle(Head, 0.0873F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 17, -2.0F, -3.0F, -8.0F, 4, 3, 6, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 21, 4, -3.0F, -1.0F, -8.025F, 1, 1, 1, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 21, 4, 2.0F, -1.0F, -8.025F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, -3.0F, -5.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.6981F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 12, 0.0F, 0.0F, -2.0F, 4, 2, 5, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, -3.0F, -5.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.6981F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 12, -4.0F, 0.0F, -2.0F, 4, 2, 5, 0.0F, false));

        this.hat = new AdvancedModelRenderer(this);
        this.hat.setRotationPoint(0.0F, -3.0F, -4.65F);
        this.Head.addChild(hat);
        this.setRotateAngle(hat, -0.0873F, 0.0F, 0.0F);
        this.hat.cubeList.add(new ModelBox(hat, 0, 31, -3.0F, -1.25F, -3.5F, 6, 2, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.hat.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.1345F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 43, -1.0F, -4.5F, -0.15F, 2, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.hat.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.9599F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 47, -1.5F, -2.75F, -0.15F, 3, 3, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -4.0F, -2.0F);
        this.hat.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5672F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 48, -2.0F, -2.75F, -0.05F, 4, 3, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.25F, -3.0F);
        this.hat.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 39, -2.5F, -3.0F, -0.1F, 5, 3, 5, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.9F, -2.5F);
        this.Head.addChild(Body);
        this.setRotateAngle(Body, -0.0873F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -3.5F, -0.5F, 0.0F, 7, 2, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.5F, 1.5F, 2.0F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.2618F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 9, 0.0F, 0.0F, -2.0F, 2, 0, 7, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.5F, 1.5F, 2.0F);
        this.Body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.2618F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 9, -2.0F, 0.0F, -2.0F, 2, 0, 7, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.25F, 7.0F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.1309F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 9, -2.5F, -0.25F, -1.0F, 5, 1, 7, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.5F, 0.75F, 1.0F);
        this.Body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.2618F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 17, 0.0F, 0.0F, -1.0F, 2, 0, 6, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.5F, 0.75F, 1.0F);
        this.Body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.2618F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 17, -2.0F, 0.0F, -1.0F, 2, 0, 6, 0.0F, false));

        this.legR13 = new AdvancedModelRenderer(this);
        this.legR13.setRotationPoint(-1.25F, 0.75F, 0.5F);
        this.Body2.addChild(legR13);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR13.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.8727F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 9, 26, -2.35F, -0.725F, 0.0F, 4, 1, 0, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR13.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3054F, 0.1745F, -0.3927F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 24, -3.75F, -0.725F, -0.75F, 4, 0, 2, 0.0F, false));

        this.legL13 = new AdvancedModelRenderer(this);
        this.legL13.setRotationPoint(1.25F, 0.75F, 0.5F);
        this.Body2.addChild(legL13);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL13.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.8727F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 26, -1.65F, -0.725F, 0.0F, 4, 1, 0, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL13.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3054F, -0.1745F, 0.3927F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 24, -0.25F, -0.725F, -0.75F, 4, 0, 2, 0.0F, true));

        this.legL14 = new AdvancedModelRenderer(this);
        this.legL14.setRotationPoint(1.25F, 0.75F, 1.6F);
        this.Body2.addChild(legL14);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL14.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.8727F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 9, 26, -1.65F, -0.725F, 0.0F, 4, 1, 0, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL14.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3054F, -0.1745F, 0.3927F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 18, 24, -0.5F, -0.725F, -0.75F, 4, 0, 2, 0.0F, true));

        this.legL15 = new AdvancedModelRenderer(this);
        this.legL15.setRotationPoint(1.25F, 0.75F, 2.6F);
        this.Body2.addChild(legL15);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL15.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.8727F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 9, 26, -1.65F, -0.725F, 0.0F, 4, 1, 0, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL15.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3054F, -0.1745F, 0.3927F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 24, -0.75F, -0.725F, -0.75F, 4, 0, 2, 0.0F, true));

        this.legL16 = new AdvancedModelRenderer(this);
        this.legL16.setRotationPoint(1.25F, 0.75F, 3.6F);
        this.Body2.addChild(legL16);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL16.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.8727F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 9, 26, -1.65F, -0.725F, 0.0F, 4, 1, 0, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL16.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3054F, -0.1745F, 0.3927F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 18, 24, -1.0F, -0.725F, -0.75F, 4, 0, 2, 0.0F, true));

        this.legR14 = new AdvancedModelRenderer(this);
        this.legR14.setRotationPoint(-1.25F, 0.75F, 1.6F);
        this.Body2.addChild(legR14);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR14.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.8727F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 9, 26, -2.35F, -0.725F, 0.0F, 4, 1, 0, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR14.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3054F, 0.1745F, -0.3927F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 18, 24, -3.5F, -0.725F, -0.75F, 4, 0, 2, 0.0F, false));

        this.legR15 = new AdvancedModelRenderer(this);
        this.legR15.setRotationPoint(-1.25F, 0.75F, 2.6F);
        this.Body2.addChild(legR15);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR15.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.8727F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 9, 26, -2.35F, -0.725F, 0.0F, 4, 1, 0, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR15.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3054F, 0.1745F, -0.3927F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 18, 24, -3.25F, -0.725F, -0.75F, 4, 0, 2, 0.0F, false));

        this.legR16 = new AdvancedModelRenderer(this);
        this.legR16.setRotationPoint(-1.25F, 0.75F, 3.6F);
        this.Body2.addChild(legR16);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR16.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -0.8727F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 9, 26, -2.35F, -0.725F, 0.0F, 4, 1, 0, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR16.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3054F, 0.1745F, -0.3927F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 18, 24, -3.0F, -0.725F, -0.75F, 4, 0, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.25F, 6.0F);
        this.Body2.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 17, 0, -3.0F, 0.0F, 0.0F, 6, 0, 4, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-1.25F, 1.5F, 0.5F);
        this.Body.addChild(legR7);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR7.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.8727F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 9, 26, -2.25F, -0.725F, 0.025F, 4, 1, 0, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR7.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.3054F, 0.1745F, -0.3927F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 18, 24, -4.0F, -0.725F, -0.75F, 4, 0, 2, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-1.25F, 1.5F, 1.6F);
        this.Body.addChild(legR8);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR8.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, -0.8727F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 9, 26, -2.25F, -0.725F, 0.0F, 4, 1, 0, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR8.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.3054F, 0.1745F, -0.3927F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 18, 24, -4.0F, -0.725F, -0.75F, 4, 0, 2, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-1.25F, 1.5F, 2.7F);
        this.Body.addChild(legR9);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR9.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, -0.8727F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 9, 26, -2.25F, -0.725F, 0.0F, 4, 1, 0, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR9.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3054F, 0.1745F, -0.3927F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 18, 24, -4.0F, -0.725F, -0.75F, 4, 0, 2, 0.0F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-1.25F, 1.5F, 3.8F);
        this.Body.addChild(legR10);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR10.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, -0.8727F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 9, 26, -2.25F, -0.725F, 0.0F, 4, 1, 0, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR10.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.3054F, 0.1745F, -0.3927F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 18, 24, -4.0F, -0.725F, -0.75F, 4, 0, 2, 0.0F, false));

        this.legR11 = new AdvancedModelRenderer(this);
        this.legR11.setRotationPoint(-1.25F, 1.5F, 4.9F);
        this.Body.addChild(legR11);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR11.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, -0.8727F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 9, 26, -2.25F, -0.725F, 0.0F, 4, 1, 0, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR11.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.3054F, 0.1745F, -0.3927F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 18, 24, -4.0F, -0.725F, -0.75F, 4, 0, 2, 0.0F, false));

        this.legR12 = new AdvancedModelRenderer(this);
        this.legR12.setRotationPoint(-1.25F, 1.5F, 6.0F);
        this.Body.addChild(legR12);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR12.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0F, -0.8727F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 9, 26, -2.25F, -0.725F, 0.0F, 4, 1, 0, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legR12.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.3054F, 0.1745F, -0.3927F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 18, 24, -4.0F, -0.725F, -0.75F, 4, 0, 2, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(1.25F, 1.5F, 0.5F);
        this.Body.addChild(legL7);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL7.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, 0.8727F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 9, 26, -1.75F, -0.725F, 0.025F, 4, 1, 0, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL7.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.3054F, -0.1745F, 0.3927F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 18, 24, 0.0F, -0.725F, -0.75F, 4, 0, 2, 0.0F, true));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(1.25F, 1.5F, 1.6F);
        this.Body.addChild(legL8);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL8.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, 0.8727F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 9, 26, -1.75F, -0.725F, 0.0F, 4, 1, 0, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL8.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.3054F, -0.1745F, 0.3927F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 18, 24, 0.0F, -0.725F, -0.75F, 4, 0, 2, 0.0F, true));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(1.25F, 1.5F, 2.7F);
        this.Body.addChild(legL9);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL9.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, 0.8727F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 9, 26, -1.75F, -0.725F, 0.0F, 4, 1, 0, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL9.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.3054F, -0.1745F, 0.3927F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 18, 24, 0.0F, -0.725F, -0.75F, 4, 0, 2, 0.0F, true));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(1.25F, 1.5F, 3.8F);
        this.Body.addChild(legL10);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL10.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.0F, 0.8727F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 9, 26, -1.75F, -0.725F, 0.0F, 4, 1, 0, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL10.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.3054F, -0.1745F, 0.3927F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 18, 24, 0.0F, -0.725F, -0.75F, 4, 0, 2, 0.0F, true));

        this.legL11 = new AdvancedModelRenderer(this);
        this.legL11.setRotationPoint(1.25F, 1.5F, 4.9F);
        this.Body.addChild(legL11);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL11.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, 0.0F, 0.8727F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 9, 26, -1.75F, -0.725F, 0.0F, 4, 1, 0, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL11.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.3054F, -0.1745F, 0.3927F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 18, 24, 0.0F, -0.725F, -0.75F, 4, 0, 2, 0.0F, true));

        this.legL12 = new AdvancedModelRenderer(this);
        this.legL12.setRotationPoint(1.25F, 1.5F, 6.0F);
        this.Body.addChild(legL12);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL12.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.0F, 0.8727F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 9, 26, -1.75F, -0.725F, 0.0F, 4, 1, 0, 0.0F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.legL12.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.3054F, -0.1745F, 0.3927F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 18, 24, 0.0F, -0.725F, -0.75F, 4, 0, 2, 0.0F, true));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-1.25F, 0.25F, -3.5F);
        this.Head.addChild(legR6);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR6.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.0F, -0.9163F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 6, -2.25F, -0.475F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR6.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, -0.6981F, -0.0873F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 26, -4.0F, -0.225F, -0.75F, 4, 0, 1, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(1.25F, 0.25F, -3.5F);
        this.Head.addChild(legL6);


        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL6.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.0F, 0.9163F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 6, -0.75F, -0.475F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL6.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, 0.6981F, 0.0873F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 26, 0.0F, -0.225F, -0.75F, 4, 0, 1, 0.0F, true));

        this.jawR5 = new AdvancedModelRenderer(this);
        this.jawR5.setRotationPoint(-0.5F, 0.25F, -5.25F);
        this.Head.addChild(jawR5);
        this.setRotateAngle(jawR5, 0.1309F, 0.0F, 0.0F);
        this.jawR5.cubeList.add(new ModelBox(jawR5, 0, 12, -1.0F, -0.75F, -0.475F, 1, 1, 2, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.75F, 0.0F, -0.25F);
        this.jawR5.addChild(legR5);
        this.setRotateAngle(legR5, 0.3054F, 1.5708F, 0.0F);
        this.legR5.cubeList.add(new ModelBox(legR5, 15, 19, -0.5F, 0.025F, -5.25F, 2, 0, 5, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR5.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.1309F, 0.1745F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 0, -0.5F, -0.225F, -4.75F, 1, 0, 5, 0.0F, false));

        this.jawL5 = new AdvancedModelRenderer(this);
        this.jawL5.setRotationPoint(0.5F, 0.25F, -5.25F);
        this.Head.addChild(jawL5);
        this.setRotateAngle(jawL5, 0.1309F, 0.0F, 0.0F);
        this.jawL5.cubeList.add(new ModelBox(jawL5, 0, 12, 0.0F, -0.75F, -0.475F, 1, 1, 2, 0.0F, true));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.75F, 0.0F, -0.25F);
        this.jawL5.addChild(legL5);
        this.setRotateAngle(legL5, 0.3054F, -1.5708F, 0.0F);
        this.legL5.cubeList.add(new ModelBox(legL5, 15, 19, -1.5F, 0.025F, -5.25F, 2, 0, 5, 0.0F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL5.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.1309F, -0.1745F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 0, -0.5F, -0.225F, -4.75F, 1, 0, 5, 0.0F, true));

        this.jawR4 = new AdvancedModelRenderer(this);
        this.jawR4.setRotationPoint(-0.4F, 0.25F, -5.75F);
        this.Head.addChild(jawR4);
        this.setRotateAngle(jawR4, 0.1309F, 0.0F, 0.0F);
        this.jawR4.cubeList.add(new ModelBox(jawR4, 0, 9, -1.0F, -0.75F, -0.475F, 1, 1, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.75F, 0.0F, -0.25F);
        this.jawR4.addChild(legR4);
        this.setRotateAngle(legR4, 0.2618F, 1.309F, 0.0F);
        this.legR4.cubeList.add(new ModelBox(legR4, 19, 19, -0.5F, 0.025F, -5.25F, 2, 0, 5, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR4.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.1309F, 0.1745F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 9, -0.5F, -0.225F, -4.25F, 1, 0, 5, 0.0F, false));

        this.jawL4 = new AdvancedModelRenderer(this);
        this.jawL4.setRotationPoint(0.4F, 0.25F, -5.75F);
        this.Head.addChild(jawL4);
        this.setRotateAngle(jawL4, 0.1309F, 0.0F, 0.0F);
        this.jawL4.cubeList.add(new ModelBox(jawL4, 0, 9, 0.0F, -0.75F, -0.475F, 1, 1, 1, 0.0F, true));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.75F, 0.0F, -0.25F);
        this.jawL4.addChild(legL4);
        this.setRotateAngle(legL4, 0.2618F, -1.309F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 19, 19, -1.5F, 0.025F, -5.25F, 2, 0, 5, 0.0F, true));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL4.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.1309F, -0.1745F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 0, 9, -0.5F, -0.225F, -4.25F, 1, 0, 5, 0.0F, true));

        this.jawR3 = new AdvancedModelRenderer(this);
        this.jawR3.setRotationPoint(-0.3F, 0.25F, -6.25F);
        this.Head.addChild(jawR3);
        this.setRotateAngle(jawR3, 0.1309F, 0.0F, 0.0F);
        this.jawR3.cubeList.add(new ModelBox(jawR3, 0, 17, -1.0F, -0.75F, -0.475F, 1, 1, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.75F, 0.0F, -0.25F);
        this.jawR3.addChild(legR3);
        this.setRotateAngle(legR3, 0.2182F, 1.0472F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 24, 4, -0.5F, 0.025F, -4.25F, 2, 0, 4, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR3.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.1309F, 0.1745F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 17, -0.5F, -0.225F, -3.75F, 1, 0, 4, 0.0F, false));

        this.jawL3 = new AdvancedModelRenderer(this);
        this.jawL3.setRotationPoint(0.3F, 0.25F, -6.25F);
        this.Head.addChild(jawL3);
        this.setRotateAngle(jawL3, 0.1309F, 0.0F, 0.0F);
        this.jawL3.cubeList.add(new ModelBox(jawL3, 0, 17, 0.0F, -0.75F, -0.475F, 1, 1, 1, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.75F, 0.0F, -0.25F);
        this.jawL3.addChild(legL3);
        this.setRotateAngle(legL3, 0.2182F, -1.0472F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 24, 4, -1.5F, 0.025F, -4.25F, 2, 0, 4, 0.0F, true));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL3.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.1309F, -0.1745F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 17, -0.5F, -0.225F, -3.75F, 1, 0, 4, 0.0F, true));

        this.jawR2 = new AdvancedModelRenderer(this);
        this.jawR2.setRotationPoint(-0.2F, 0.25F, -6.75F);
        this.Head.addChild(jawR2);
        this.setRotateAngle(jawR2, 0.1309F, 0.0F, 0.0F);
        this.jawR2.cubeList.add(new ModelBox(jawR2, 0, 19, -1.0F, -0.75F, -0.475F, 1, 1, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.75F, 0.0F, -0.25F);
        this.jawR2.addChild(legR2);
        this.setRotateAngle(legR2, 0.2182F, 0.6981F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 24, 8, -0.5F, 0.025F, -3.75F, 2, 0, 4, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR2.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.1745F, 0.1745F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 17, 9, -0.5F, -0.225F, -3.5F, 1, 0, 4, 0.0F, false));

        this.jawL2 = new AdvancedModelRenderer(this);
        this.jawL2.setRotationPoint(0.2F, 0.25F, -6.75F);
        this.Head.addChild(jawL2);
        this.setRotateAngle(jawL2, 0.1309F, 0.0F, 0.0F);
        this.jawL2.cubeList.add(new ModelBox(jawL2, 0, 19, 0.0F, -0.75F, -0.475F, 1, 1, 1, 0.0F, true));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.75F, 0.0F, -0.25F);
        this.jawL2.addChild(legL2);
        this.setRotateAngle(legL2, 0.2182F, -0.6981F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 24, 8, -1.5F, 0.025F, -3.75F, 2, 0, 4, 0.0F, true));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL2.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.1745F, -0.1745F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 17, 9, -0.5F, -0.225F, -3.5F, 1, 0, 4, 0.0F, true));

        this.jawR = new AdvancedModelRenderer(this);
        this.jawR.setRotationPoint(-0.1F, 0.25F, -7.25F);
        this.Head.addChild(jawR);
        this.setRotateAngle(jawR, 0.1309F, 0.0F, 0.0F);
        this.jawR.cubeList.add(new ModelBox(jawR, 0, 21, -1.0F, -0.75F, -0.475F, 1, 1, 1, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.5F, 0.0F, -0.5F);
        this.jawR.addChild(legR);
        this.setRotateAngle(legR, 0.2182F, 0.1745F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 3, -0.5F, -0.075F, -2.5F, 1, 0, 3, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.1745F, 0.1745F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 0, 0, -0.5F, -0.225F, -2.75F, 1, 0, 3, 0.0F, false));

        this.jawL = new AdvancedModelRenderer(this);
        this.jawL.setRotationPoint(0.1F, 0.25F, -7.25F);
        this.Head.addChild(jawL);
        this.setRotateAngle(jawL, 0.1309F, 0.0F, 0.0F);
        this.jawL.cubeList.add(new ModelBox(jawL, 0, 21, 0.0F, -0.75F, -0.475F, 1, 1, 1, 0.0F, true));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.5F, 0.0F, -0.5F);
        this.jawL.addChild(legL);
        this.setRotateAngle(legL, 0.2182F, -0.1745F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 3, -0.5F, -0.075F, -2.5F, 1, 0, 3, 0.0F, true));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.1745F, -0.1745F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 0, -0.5F, -0.225F, -2.75F, 1, 0, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Head.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.00F, 0.0F);
        this.setRotateAngle(legR, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legR2, -0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legR3, -0.0F, -0.0F, 0.0F);
        this.setRotateAngle(legR4, 0.0F, -0.0F, 0.0F);
        this.setRotateAngle(legR5, 0.0F, -0.0F, 0.0F);
        this.setRotateAngle(legR6, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legR7, 0.0F, -0.0F, 0.0F);
        this.setRotateAngle(legR8, 0.0F, 0.0F, -0.0F);
        this.setRotateAngle(legR9, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legR10, 0.0F, 0.0F, -0.0F);
        this.setRotateAngle(legR11, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legR12, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legR13, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legR14, -0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legR15, -0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legR16, -0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL5, 0.0F, -0.0F, 0.0F);
        this.setRotateAngle(legL6, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL7, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL8, 0.0F, -0.0F, 0.0F);
        this.setRotateAngle(legL9, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL10, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL11, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL12, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL13, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL14, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL15, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL16, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jawR, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jawR2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jawR3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jawR4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jawR5, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jawL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jawL2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jawL3, 0.0F, 0.001F, 0.0F);
        this.setRotateAngle(jawL4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jawL5, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.5F, 0.0F, 0.0F);
        this.Head.offsetY=-0.15f;
        this.Head.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.Head.offsetY = 0.5F;

        AdvancedModelRenderer[] Tail = {this.Body, this.Body2, this.tail};
        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            this.swing(jawL, 0.4F, -0.4F, false, 3, -0.1F, f2, 0.8F);
            this.swing(jawR, 0.4F, 0.4F, false, 3, 0.1F, f2, 0.8F);
            this.walk(jawL, 0.4F, 0.2F, false, 0, -0.2F, f2, 0.8F);
            this.walk(jawR, 0.4F, 0.2F, false, 0, -0.2F, f2, 0.8F);
            this.swing(jawL2, 0.4F, -0.4F, false, 3, -0.1F, f2, 0.8F);
            this.swing(jawR2, 0.4F, 0.4F, false, 3, 0.1F, f2, 0.8F);
            this.walk(jawL2, 0.4F, 0.2F, false, 0, -0.2F, f2, 0.8F);
            this.walk(jawR2, 0.4F, 0.2F, false, 0, -0.2F, f2, 0.8F);
            this.swing(jawL3, 0.4F, -0.4F, false, 3, -0.1F, f2, 0.8F);
            this.swing(jawR3, 0.4F, 0.4F, false, 3, 0.1F, f2, 0.8F);
            this.walk(jawL3, 0.4F, 0.2F, false, 0, -0.2F, f2, 0.8F);
            this.walk(jawR3, 0.4F, 0.2F, false, 0, -0.2F, f2, 0.8F);
            this.swing(jawL4, 0.4F, -0.4F, false, 3, -0.1F, f2, 0.8F);
            this.swing(jawR4, 0.4F, 0.4F, false, 3, 0.1F, f2, 0.8F);
            this.walk(jawL4, 0.4F, 0.2F, false, 0, -0.2F, f2, 0.8F);
            this.walk(jawR4, 0.4F, 0.2F, false, 0, -0.2F, f2, 0.8F);
            this.swing(jawL5, 0.4F, -0.4F, false, 3, -0.1F, f2, 0.8F);
            this.swing(jawR5, 0.4F, 0.4F, false, 3, 0.1F, f2, 0.8F);
            this.walk(jawL5, 0.4F, 0.2F, false, 0, -0.2F, f2, 0.8F);
            this.walk(jawR5, 0.4F, 0.2F, false, 0, -0.2F, f2, 0.8F);

            if (f3 != 0) {
                this.chainWave(Tail, 0.65F, 0.045F, -1.5, f2, 0.8F);
            }
            else {
                this.chainWave(Tail, 0.25F, 0.015F, -1.5, f2, 0.8F);
            }

            float degreeLeg = 0.3F;
            float weightLeg = -0.5F;
            float speedLeg = 0.8F;
            this.flap(legL6, speedLeg, -degreeLeg, false, 0, -weightLeg, f2, 0.7F);
            this.flap(legR6, speedLeg, degreeLeg, false, 0, weightLeg, f2, 0.7F);
            this.flap(legL7, speedLeg, -degreeLeg, false, 0.5F, -weightLeg, f2, 0.7F);
            this.flap(legR7, speedLeg, degreeLeg, false, 0.5F, weightLeg, f2, 0.7F);
            this.flap(legL8, speedLeg, -degreeLeg, false, 1.0F, -weightLeg, f2, 0.7F);
            this.flap(legR8, speedLeg, degreeLeg, false, 1.0F, weightLeg, f2, 0.7F);
            this.flap(legL9, speedLeg, -degreeLeg, false, 1.5F, -weightLeg, f2, 0.7F);
            this.flap(legR9, speedLeg, degreeLeg, false, 1.5F, weightLeg, f2, 0.7F);
            this.flap(legL10, speedLeg, -degreeLeg, false, 2.0F, -weightLeg, f2, 0.7F);
            this.flap(legR10, speedLeg, degreeLeg, false, 2.0F, weightLeg, f2, 0.7F);
            this.flap(legL11, speedLeg, -degreeLeg, false, 2.5F, -weightLeg, f2, 0.7F);
            this.flap(legR11, speedLeg, degreeLeg, false, 2.5F, weightLeg, f2, 0.7F);
            this.flap(legL12, speedLeg, -degreeLeg, false, 3.0F, -weightLeg, f2, 0.7F);
            this.flap(legR12, speedLeg, degreeLeg, false, 3.0F, weightLeg, f2, 0.7F);
            this.flap(legL13, speedLeg, -degreeLeg, false, 3.5F, -weightLeg, f2, 0.7F);
            this.flap(legR13, speedLeg, degreeLeg, false, 3.5F, weightLeg, f2, 0.7F);
            this.flap(legL14, speedLeg, -degreeLeg, false, 4.0F, -weightLeg, f2, 0.7F);
            this.flap(legR14, speedLeg, degreeLeg, false, 4.0F, weightLeg, f2, 0.7F);
            this.flap(legL15, speedLeg, -degreeLeg, false, 4.5F, -weightLeg, f2, 0.7F);
            this.flap(legR15, speedLeg, degreeLeg, false, 4.5F, weightLeg, f2, 0.7F);
            this.flap(legL16, speedLeg, -degreeLeg, false, 5.0F, -weightLeg, f2, 0.7F);
            this.flap(legR16, speedLeg, degreeLeg, false, 5.0F, weightLeg, f2, 0.7F);


            if (!e.isInWater()) {
                this.bob(Head, -speed * 1.5F, 3F, false, f2, 1);
            } else {
                if (!isAtBottom) {
                    this.bob(Head, -speed, 0.12F, false, f2, 2);
                }
            }
        }
    }
}