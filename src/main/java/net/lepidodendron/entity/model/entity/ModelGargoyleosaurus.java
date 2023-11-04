package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGargoyleosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelGargoyleosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer armleft4;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer armright4;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;

    private ModelAnimator animator;

    public ModelGargoyleosaurus() {
        this.textureWidth = 95;
        this.textureHeight = 90;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(3.0314F, -11.321F, 5.2751F);
        this.root.addChild(main);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.0314F, 0.321F, 2.7249F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 58, -4.0F, -5.325F, -1.65F, 0, 1, 10, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 61, 37, 0.0F, -5.25F, -1.25F, 0, 1, 9, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 61, 37, -2.5F, -5.25F, -1.25F, 0, 1, 9, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 52, -1.0F, -5.25F, -1.65F, 0, 1, 10, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 58, 4.0F, -5.325F, -1.65F, 0, 1, 10, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 61, 37, 2.5F, -5.25F, -1.25F, 0, 1, 9, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 52, 1.0F, -5.25F, -1.65F, 0, 1, 10, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 17, -5.0F, -4.85F, -1.225F, 10, 4, 10, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-8.2535F, -2.0185F, 6.9087F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0592F, 0.5668F, -0.3215F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 73, 15, -1.35F, 0.0F, -1.5F, 3, 0, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-8.3782F, -1.3585F, 10.5576F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1624F, 0.6075F, -0.3564F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 73, 48, -1.0F, 0.0F, -1.175F, 3, 0, 3, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.3155F, -1.3585F, 10.5576F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1624F, -0.6075F, 0.3564F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 73, 48, -2.0F, 0.0F, -1.175F, 3, 0, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.1907F, -2.0185F, 6.9087F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0592F, -0.5668F, 0.3215F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 73, 15, -1.65F, 0.0F, -1.5F, 3, 0, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.0314F, 0.321F, 2.7249F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -4.5F, -1.075F, -1.95F, 9, 5, 11, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(-3.0314F, 0.321F, 3.2249F);
        this.main.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 32, -5.0F, -2.8F, -9.025F, 10, 7, 9, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-6.5311F, -1.1855F, -7.1905F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2203F, 0.4333F, -0.1883F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 67, 0, -3.0F, -0.45F, -1.0F, 5, 0, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-5.8986F, -1.8664F, -5.5737F);
        this.Body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.133F, 0.4333F, -0.2755F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 71, -4.2103F, -0.1555F, 0.3649F, 5, 0, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-5.8468F, -2.0509F, -0.0524F);
        this.Body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1057F, 0.5225F, -0.3294F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 71, 63, -1.775F, -0.3F, -1.35F, 4, 0, 3, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(5.8468F, -2.0509F, -0.0524F);
        this.Body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1057F, -0.5225F, 0.3294F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 71, 63, -2.225F, -0.3F, -1.35F, 4, 0, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(5.8986F, -1.8664F, -5.5737F);
        this.Body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.133F, -0.4333F, 0.2755F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 71, -0.7897F, -0.1555F, 0.3649F, 5, 0, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(6.5311F, -1.1855F, -7.1905F);
        this.Body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2203F, -0.4333F, 0.1883F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 67, 0, -2.0F, -0.45F, -1.0F, 5, 0, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 12.0F, -8.5F);
        this.Body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1047F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 53, -6.3F, -15.05F, 7.25F, 1, 1, 2, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 76, -6.3F, -15.05F, 4.25F, 1, 1, 2, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 25, 76, -6.3F, -15.05F, 1.25F, 1, 1, 2, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 53, 5.3F, -15.05F, 7.25F, 1, 1, 2, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 76, 5.3F, -15.05F, 4.25F, 1, 1, 2, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 25, 76, 5.3F, -15.05F, 1.25F, 1, 1, 2, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 54, -0.5F, -16.85F, 7.5F, 1, 1, 2, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 64, -0.5F, -16.85F, 1.75F, 1, 1, 2, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 54, -2.25F, -16.85F, 6.75F, 1, 1, 2, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 64, -2.25F, -16.85F, 1.25F, 1, 1, 2, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 54, 1.25F, -16.85F, 6.75F, 1, 1, 2, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 64, 1.25F, -16.85F, 1.25F, 1, 1, 2, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 8, -5.5F, -16.1F, 1.0F, 11, 4, 9, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.75F, 12.0F, -8.5F);
        this.Body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1047F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 75, -2.25F, -16.85F, 4.5F, 1, 1, 2, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 12.0F, -8.5F);
        this.Body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1047F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 11, 75, -2.75F, -16.85F, 4.0F, 1, 1, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 12.0F, -8.5F);
        this.Body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1047F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 11, 75, 1.75F, -16.85F, 4.0F, 1, 1, 2, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, -8.5F);
        this.Body.addChild(Chest);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 3.4F, 0.0F);
        this.Chest.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2094F, 0.3054F, -0.2182F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 56, 48, -6.35F, -6.1F, -3.525F, 5, 0, 3, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.935F, -0.5825F, -4.8151F);
        this.Chest.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0087F, 0.3054F, -0.2182F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 40, 22, -1.0F, -0.4F, -1.05F, 2, 0, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 3.4F, 0.0F);
        this.Chest.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2094F, -0.3054F, 0.2182F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 56, 48, 1.35F, -6.1F, -3.525F, 5, 0, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(4.935F, -0.5825F, -4.8151F);
        this.Chest.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0087F, -0.3054F, 0.2182F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 40, 22, -1.0F, -0.4F, -1.05F, 2, 0, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Chest.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2094F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 18, 64, -5.0F, -7.425F, -4.425F, 1, 1, 1, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 65, -5.0F, -7.05F, -2.5F, 1, 1, 1, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 18, 76, -5.0F, -7.05F, -1.0F, 1, 1, 2, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 18, 76, 4.0F, -7.05F, -1.0F, 1, 1, 2, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 65, 4.0F, -7.05F, -2.5F, 1, 1, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 18, 64, 4.0F, -7.425F, -4.425F, 1, 1, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 62, -0.5F, -8.3F, 0.25F, 1, 1, 1, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 60, 26, -0.5F, -8.3F, -1.55F, 1, 1, 1, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 63, 37, -0.4F, -8.3F, -4.25F, 1, 1, 2, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 62, -2.5F, -8.3F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 60, 26, -2.5F, -8.3F, -2.3F, 1, 1, 1, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 63, 37, -2.4F, -8.3F, -4.95F, 1, 1, 2, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 62, 1.5F, -8.3F, -0.5F, 1, 1, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 60, 26, 1.5F, -8.3F, -2.3F, 1, 1, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 63, 37, 1.4F, -8.3F, -4.9F, 1, 1, 2, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 39, 36, -4.0F, -4.9F, -4.95F, 8, 2, 7, -0.01F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 25, -4.5F, -7.8F, -5.0F, 9, 3, 7, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 2.1636F, -5.3809F);
        this.Chest.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3316F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 33, 46, -4.0F, -4.9558F, -0.0291F, 8, 5, 6, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -2.4F, -4.7F);
        this.Chest.addChild(Neck1);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.2329F, -9.2389F);
        this.Neck1.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2182F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 53, 0, -2.0F, 0.15F, 5.4F, 4, 1, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.2329F, -9.2389F);
        this.Neck1.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0873F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 39, 58, -2.5F, -2.2F, 5.2F, 5, 4, 5, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.5F, 0.6173F, -3.2059F);
        this.Neck1.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1016F, 0.1486F, -0.3605F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 39, 41, -2.0F, 0.0F, -0.675F, 2, 0, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(2.5F, 0.6173F, -3.2059F);
        this.Neck1.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1016F, -0.1486F, 0.3605F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 39, 41, 0.0F, 0.0F, -0.675F, 2, 0, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.75F, -0.8922F, -2.8902F);
        this.Neck1.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2182F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 39, 58, -0.5F, 0.175F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 39, 58, 1.0F, 0.2F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 1.2329F, -2.9889F);
        this.Neck1.addChild(Neck2);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0436F, -6.2481F);
        this.Neck2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.2618F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 30, 70, -1.5F, -0.25F, 2.85F, 3, 1, 4, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-2.0F, -0.6484F, -1.9634F);
        this.Neck2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0408F, 0.1577F, -0.3994F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 30, 8, -1.5F, 0.0F, -1.25F, 2, 0, 2, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(2.0F, -0.6484F, -1.9634F);
        this.Neck2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0408F, -0.1577F, 0.3994F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 30, 8, -0.5F, 0.0F, -1.25F, 2, 0, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.25F, -1.7129F, -2.9183F);
        this.Neck2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.2182F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 5, 17, -0.5F, -0.45F, 0.85F, 1, 1, 1, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 5, 17, -3.0F, -0.45F, 0.85F, 1, 1, 1, 0.0F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 28, 52, -1.75F, -0.275F, -0.375F, 1, 1, 1, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0436F, -6.2481F);
        this.Neck2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0436F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 64, 7, -2.0F, -1.9F, 2.75F, 4, 3, 4, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.9564F, -3.3481F);
        this.Neck2.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 72, 70, -2.0F, 0.0F, -2.95F, 4, 2, 3, 0.01F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 1.0F, -2.9F);
        this.Head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1309F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 49, -1.0F, 0.0F, -1.75F, 2, 1, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-2.0F, 1.1F, -2.7F);
        this.Head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.8727F, -0.4363F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 25, 49, -3.0F, -0.1F, 0.95F, 2, 1, 1, 0.01F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-2.1853F, -0.3455F, -0.2427F);
        this.Head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.4232F, -1.1737F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 28, 56, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.01F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(2.1853F, -0.3455F, -0.2427F);
        this.Head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.4232F, 1.1737F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 28, 56, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.01F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.0F, -2.95F);
        this.Head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.3927F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 30, 36, -2.0F, 0.0F, 0.0F, 4, 1, 3, -0.01F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(2.0F, 1.1F, -2.7F);
        this.Head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -0.8727F, 0.4363F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 25, 49, 1.0F, -0.1F, 0.95F, 2, 1, 1, 0.01F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.125F, 0.5F, -1.45F);
        this.Head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1745F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 49, 22, -1.0F, -0.5F, -0.65F, 2, 1, 1, 0.0F, true));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 49, 22, 1.25F, -0.5F, -0.65F, 2, 1, 1, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.0F, -2.9F);
        this.Head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.4756F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 36, -1.0F, -0.0127F, -2.0756F, 2, 1, 2, -0.01F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.5F, -0.5F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 71, 37, -2.0F, -0.95F, -2.15F, 4, 2, 3, -0.01F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.0F, -1.9F);
        this.Jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1745F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 75, 52, -1.0F, -0.05F, -2.0F, 2, 1, 3, -0.01F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(3.25F, -0.25F, -3.4F);
        this.Chest.addChild(armleft);
        this.setRotateAngle(armleft, 0.3897F, 0.3036F, -0.1316F);
        this.armleft.cubeList.add(new ModelBox(armleft, 46, 68, -2.0F, 0.75F, -1.75F, 3, 5, 3, 0.0F, false));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(-0.25F, 5.0F, 1.0F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, -0.6537F, 0.0345F, 0.045F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 0, 0, -1.75F, 0.0F, -1.675F, 3, 5, 2, -0.01F, false));

        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(0.25F, 4.75F, -0.85F);
        this.armleft2.addChild(armleft3);
        this.setRotateAngle(armleft3, 0.2148F, 0.0045F, 0.0395F);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 47, 0, -2.0F, -0.25F, -0.825F, 3, 2, 2, 0.0F, false));

        this.armleft4 = new AdvancedModelRenderer(this);
        this.armleft4.setRotationPoint(0.0F, 1.75F, 0.5F);
        this.armleft3.addChild(armleft4);
        this.armleft4.cubeList.add(new ModelBox(armleft4, 59, 73, -2.0F, 0.0F, -2.325F, 3, 1, 3, -0.01F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-3.25F, -0.25F, -3.4F);
        this.Chest.addChild(armright);
        this.setRotateAngle(armright, 0.3978F, -0.3601F, 0.1068F);
        this.armright.cubeList.add(new ModelBox(armright, 46, 68, -1.0F, 0.75F, -1.75F, 3, 5, 3, 0.0F, true));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(0.25F, 5.0F, 1.0F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, -0.6537F, -0.0345F, -0.045F);
        this.armright2.cubeList.add(new ModelBox(armright2, 0, 0, -1.25F, 0.0F, -1.675F, 3, 5, 2, -0.01F, true));

        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(-0.25F, 4.75F, -0.85F);
        this.armright2.addChild(armright3);
        this.setRotateAngle(armright3, 0.2148F, -0.0045F, -0.0395F);
        this.armright3.cubeList.add(new ModelBox(armright3, 47, 0, -1.0F, -0.25F, -0.825F, 3, 2, 2, 0.0F, true));

        this.armright4 = new AdvancedModelRenderer(this);
        this.armright4.setRotationPoint(0.0F, 1.75F, 0.5F);
        this.armright3.addChild(armright4);
        this.armright4.cubeList.add(new ModelBox(armright4, 59, 73, -1.0F, 0.0F, -2.325F, 3, 1, 3, -0.01F, true));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(-4.1F, -2.95F, -3.0F);
        this.Chest.addChild(bone);
        this.setRotateAngle(bone, -0.0436F, 0.1309F, -0.7854F);


        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(4.1F, -2.95F, -3.0F);
        this.Chest.addChild(bone4);
        this.setRotateAngle(bone4, -0.0436F, -0.1309F, 0.7854F);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, 7.0F, 3.0F);
        this.bone4.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.2094F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 60, 22, -0.25F, -8.3F, -1.0F, 1, 1, 2, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 11, 62, -0.25F, -8.3F, -5.0F, 1, 1, 2, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 32, 49, -0.25F, -8.3F, -2.5F, 1, 1, 1, 0.0F, false));

        this.bone5 = new AdvancedModelRenderer(this);
        this.bone5.setRotationPoint(-4.1F, -2.95F, -3.0F);
        this.Chest.addChild(bone5);
        this.setRotateAngle(bone5, -0.0436F, 0.1309F, -0.7854F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, 7.0F, 3.0F);
        this.bone5.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.2094F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 60, 22, -0.75F, -8.3F, -1.0F, 1, 1, 2, 0.0F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 11, 62, -0.75F, -8.3F, -5.0F, 1, 1, 2, 0.0F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 32, 49, -0.75F, -8.3F, -2.5F, 1, 1, 1, 0.0F, true));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(5.95F, -4.35F, -4.25F);
        this.Body.addChild(bone3);
        this.setRotateAngle(bone3, -0.1134F, -0.0873F, 0.3491F);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, 7.0F, 3.0F);
        this.bone3.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.2094F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 23, -1.5F, -7.8F, -0.65F, 2, 1, 2, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 31, 22, -1.725F, -7.8F, -3.25F, 2, 1, 2, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 32, -1.8F, -7.8F, -6.0F, 2, 1, 2, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(-5.95F, -4.35F, -4.25F);
        this.Body.addChild(bone2);
        this.setRotateAngle(bone2, -0.1134F, 0.0873F, -0.3491F);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5F, 7.0F, 3.0F);
        this.bone2.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.2094F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 23, -0.5F, -7.8F, -0.65F, 2, 1, 2, 0.0F, true));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 31, 22, -0.275F, -7.8F, -3.25F, 2, 1, 2, 0.0F, true));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 32, -0.2F, -7.8F, -6.0F, 2, 1, 2, 0.0F, true));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(1.3686F, -0.129F, 4.5749F);
        this.main.addChild(legleft);
        this.setRotateAngle(legleft, 0.1745F, -0.1309F, 0.0F);
        this.legleft.cubeList.add(new ModelBox(legleft, 60, 63, -2.0F, -0.2348F, -1.8264F, 3, 5, 4, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 4.7652F, 2.1736F);
        this.legleft.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.4363F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 70, 19, -2.0F, -4.0F, -3.0F, 3, 4, 3, -0.01F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.0F, 4.8152F, -1.3264F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.3491F, 0.0F, 0.0F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 17, 67, -2.0F, -0.2387F, -0.2418F, 3, 5, 3, -0.01F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.0F, 4.5113F, 0.6832F);
        this.legleft2.addChild(legleft3);
        this.setRotateAngle(legleft3, -0.6545F, 0.0F, 0.0F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 0, 75, -2.0F, -1.0F, -0.825F, 3, 3, 2, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(0.0F, 1.85F, 0.5F);
        this.legleft3.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.1309F, 0.0F, 0.0F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 67, 31, -2.0F, 0.0F, -3.325F, 3, 1, 4, -0.01F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-7.4314F, -0.129F, 4.5749F);
        this.main.addChild(legright);
        this.setRotateAngle(legright, 0.1745F, 0.1309F, 0.0F);
        this.legright.cubeList.add(new ModelBox(legright, 60, 63, -1.0F, -0.2348F, -1.8264F, 3, 5, 4, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 4.7652F, 2.1736F);
        this.legright.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.4363F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 70, 19, -1.0F, -4.0F, -3.0F, 3, 4, 3, -0.01F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(0.0F, 4.8152F, -1.3264F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, 0.3491F, 0.0F, 0.0F);
        this.legright2.cubeList.add(new ModelBox(legright2, 17, 67, -1.0F, -0.2387F, -0.2418F, 3, 5, 3, -0.01F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(0.0F, 4.5113F, 0.6832F);
        this.legright2.addChild(legright3);
        this.setRotateAngle(legright3, -0.6545F, 0.0F, 0.0F);
        this.legright3.cubeList.add(new ModelBox(legright3, 0, 75, -1.0F, -1.0F, -0.825F, 3, 3, 2, 0.0F, true));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(0.0F, 1.85F, 0.5F);
        this.legright3.addChild(legright4);
        this.setRotateAngle(legright4, 0.1309F, 0.0F, 0.0F);
        this.legright4.cubeList.add(new ModelBox(legright4, 67, 31, -1.0F, 0.0F, -3.325F, 3, 1, 4, -0.01F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(-3.0314F, -0.679F, 11.7249F);
        this.main.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1745F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 56, 52, -3.0F, -0.75F, -1.0F, 6, 4, 6, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail1.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.1745F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 30, 0, -2.5F, -1.65F, -1.2F, 5, 1, 6, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-1.0F, -1.0519F, 3.5364F);
        this.Tail1.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.5236F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 41, 70, -0.5F, -0.6F, -0.775F, 1, 1, 1, 0.0F, true));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 41, 70, 1.5F, -0.6F, -0.775F, 1, 1, 1, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-1.0F, -1.9784F, 1.1612F);
        this.Tail1.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.3927F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 18, 49, -0.5F, -0.625F, -1.175F, 1, 2, 2, 0.0F, true));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 18, 49, 1.5F, -0.625F, -1.175F, 1, 2, 2, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-3.3983F, 0.7648F, 2.3663F);
        this.Tail1.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.1735F, 0.6935F, -0.3747F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 8, -1.525F, -0.9F, -0.55F, 3, 0, 2, 0.0F, true));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(3.3983F, 0.7648F, 2.3663F);
        this.Tail1.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.1735F, -0.6935F, 0.3747F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 8, -1.475F, -0.9F, -0.55F, 3, 0, 2, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 1.0F, 5.0F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0611F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 49, -2.0F, -1.0F, -0.75F, 4, 3, 9, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-1.0F, -1.0F, 6.25F);
        this.Tail2.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.0873F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 17, -0.075F, -0.5F, -2.15F, 0, 1, 4, 0.0F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 17, 2.075F, -0.5F, -2.15F, 0, 1, 4, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-1.0F, -1.1471F, 0.7885F);
        this.Tail2.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.3491F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 30, 0, -0.5F, -1.0F, 1.5F, 1, 1, 1, 0.0F, true));
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 30, 3, -0.5F, -0.575F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 30, 0, 1.5F, -1.0F, 1.5F, 1, 1, 1, 0.0F, false));
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 30, 3, 1.5F, -0.575F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0873F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 62, -1.0F, -0.5F, -0.75F, 2, 2, 6, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.5F, 5.0F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 60, 22, -0.5F, -0.5F, -0.5F, 1, 1, 7, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
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
        //this.resetToDefaultPose();

        EntityPrehistoricFloraGargoyleosaurus entityYuxi = (EntityPrehistoricFloraGargoyleosaurus) e;

        if (entityYuxi.getAnimation() == entityYuxi.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Head};
        entityYuxi.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityYuxi.getAnimation() == entityYuxi.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityYuxi.isReallyInWater()) {

                if (f3 == 0.0F || !entityYuxi.getIsMoving()) {
                    if (entityYuxi.getAnimation() != entityYuxi.EAT_ANIMATION
                        && entityYuxi.getAnimation() != entityYuxi.DRINK_ANIMATION
                        && entityYuxi.getAnimation() != entityYuxi.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityYuxi.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();

        EntityPrehistoricFloraGargoyleosaurus ee = (EntityPrehistoricFloraGargoyleosaurus) entitylivingbaseIn;

        if (ee.getAnimation() != ee.HIDE_ANIMATION) {
            if (!ee.isReallyInWater()) {
                if (ee.getIsMoving()) {
                    if (ee.getIsFast()) { //Running
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    } else { //Walking
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
            } else {
                //Swimming pose:
                if (!ee.getIsMoving()) { //static in water
                    //
                } else {
                    //moving in water
                    //
                }
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The hiding and unhiding anim
            animHide(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) { //The Alert Idle
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.TAIL_ANIMATION) { //The Tail Idle
            animTail(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animTail(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick){
        EntityPrehistoricFloraGargoyleosaurus entity = (EntityPrehistoricFloraGargoyleosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (2.70233-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 7) / 8) * (15-(10)));
            yy = 2.70233 + (((tickAnim - 7) / 8) * (5-(2.70233)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = 15 + (((tickAnim - 15) / 14) * (22.5-(15)));
            yy = 5 + (((tickAnim - 15) / 14) * (-5-(5)));
            zz = 0 + (((tickAnim - 15) / 14) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 22.5 + (((tickAnim - 29) / 10) * (12.19196-(22.5)));
            yy = -5 + (((tickAnim - 29) / 10) * (-2.77986-(-5)));
            zz = 0 + (((tickAnim - 29) / 10) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 12.19196 + (((tickAnim - 39) / 11) * (0-(12.19196)));
            yy = -2.77986 + (((tickAnim - 39) / 11) * (0-(-2.77986)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (20-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 15) / 14) * (-5-(0)));
            yy = 20 + (((tickAnim - 15) / 14) * (-20-(20)));
            zz = 0 + (((tickAnim - 15) / 14) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = -5 + (((tickAnim - 29) / 10) * (2.05056-(-5)));
            yy = -20 + (((tickAnim - 29) / 10) * (-13.09568-(-20)));
            zz = 0 + (((tickAnim - 29) / 10) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 2.05056 + (((tickAnim - 39) / 11) * (0-(2.05056)));
            yy = -13.09568 + (((tickAnim - 39) / 11) * (0-(-13.09568)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 7) / 8) * (-5-(-5)));
            yy = -7.5 + (((tickAnim - 7) / 8) * (15-(-7.5)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -5 + (((tickAnim - 15) / 8) * (-5-(-5)));
            yy = 15 + (((tickAnim - 15) / 8) * (15-(15)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -5 + (((tickAnim - 23) / 6) * (0-(-5)));
            yy = 15 + (((tickAnim - 23) / 6) * (7.5-(15)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 29) / 10) * (-5-(0)));
            yy = 7.5 + (((tickAnim - 29) / 10) * (-15-(7.5)));
            zz = 0 + (((tickAnim - 29) / 10) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 39) / 11) * (0-(-5)));
            yy = -15 + (((tickAnim - 39) / 11) * (0-(-15)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-4.8713-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-7.52773-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.65748-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -4.8713 + (((tickAnim - 7) / 8) * (-5-(-4.8713)));
            yy = -7.52773 + (((tickAnim - 7) / 8) * (15-(-7.52773)));
            zz = -0.65748 + (((tickAnim - 7) / 8) * (0-(-0.65748)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -5 + (((tickAnim - 15) / 8) * (-5-(-5)));
            yy = 15 + (((tickAnim - 15) / 8) * (15-(15)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -5 + (((tickAnim - 23) / 6) * (7.6287-(-5)));
            yy = 15 + (((tickAnim - 23) / 6) * (7.52773-(15)));
            zz = 0 + (((tickAnim - 23) / 6) * (0.65748-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 7.6287 + (((tickAnim - 29) / 10) * (-5-(7.6287)));
            yy = 7.52773 + (((tickAnim - 29) / 10) * (-15-(7.52773)));
            zz = 0.65748 + (((tickAnim - 29) / 10) * (0-(0.65748)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 39) / 11) * (0-(-5)));
            yy = -15 + (((tickAnim - 39) / 11) * (0-(-15)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGargoyleosaurus entity = (EntityPrehistoricFloraGargoyleosaurus) entitylivingbaseIn;

        int animCycle = 29;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 5 + (((tickAnim - 6) / 8) * (-8-(5)));
            yy = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 8) * (-2.57-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -8 + (((tickAnim - 14) / 4) * (-6-(-8)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = -2.57 + (((tickAnim - 14) / 4) * (-6-(-2.57)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = -6 + (((tickAnim - 18) / 9) * (0-(-6)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = -6 + (((tickAnim - 18) / 9) * (5-(-6)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 27) / 2) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 3 + (((tickAnim - 6) / 6) * (0-(3)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (-5-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (3-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 14) / 4) * (-5-(-5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 3 + (((tickAnim - 14) / 4) * (7-(3)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = -5 + (((tickAnim - 18) / 9) * (0-(-5)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 7 + (((tickAnim - 18) / 9) * (-6-(7)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = -6 + (((tickAnim - 27) / 2) * (0-(-6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -11 + (((tickAnim - 6) / 6) * (-11-(-11)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -11 + (((tickAnim - 12) / 2) * (-15-(-11)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (-3-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -15 + (((tickAnim - 14) / 4) * (-14-(-15)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = -3 + (((tickAnim - 14) / 4) * (-7-(-3)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = -14 + (((tickAnim - 18) / 9) * (0-(-14)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = -7 + (((tickAnim - 18) / 9) * (7-(-7)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 7 + (((tickAnim - 27) / 2) * (0-(7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 8 + (((tickAnim - 6) / 7) * (15-(8)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 15 + (((tickAnim - 13) / 5) * (30-(15)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 30 + (((tickAnim - 18) / 5) * (5-(30)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 5 + (((tickAnim - 23) / 2) * (0-(5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 8) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 11) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 13) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 17) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Jaw.rotationPointX = this.Jaw.rotationPointX + (float)(xx);
        this.Jaw.rotationPointY = this.Jaw.rotationPointY - (float)(yy);
        this.Jaw.rotationPointZ = this.Jaw.rotationPointZ + (float)(zz);

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGargoyleosaurus entity = (EntityPrehistoricFloraGargoyleosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -12 + (((tickAnim - 12) / 5) * (-15-(-12)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -15 + (((tickAnim - 17) / 17) * (-15-(-15)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -15 + (((tickAnim - 34) / 16) * (0-(-15)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-1.35-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (4.3-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = -1.35 + (((tickAnim - 12) / 5) * (-1.35-(-1.35)));
            zz = 4.3 + (((tickAnim - 12) / 5) * (4.3-(4.3)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = -1.35 + (((tickAnim - 17) / 17) * (-1.35-(-1.35)));
            zz = 4.3 + (((tickAnim - 17) / 17) * (4.3-(4.3)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = -1.35 + (((tickAnim - 34) / 16) * (0-(-1.35)));
            zz = 4.3 + (((tickAnim - 34) / 16) * (0-(4.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 4 + (((tickAnim - 12) / 5) * (7-(4)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 7 + (((tickAnim - 17) / 17) * (7-(7)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 34) / 16) * (0-(7)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.75+150))*-2-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.75+150))*-2 + (((tickAnim - 17) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.75+150))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.75+150))*-2)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.75+150))*-2 + (((tickAnim - 34) / 16) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.75+150))*-2)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-5-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-5 + (((tickAnim - 17) / 17) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-5)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-5 + (((tickAnim - 34) / 16) * (0-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+150))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+150))*2 + (((tickAnim - 17) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+150))*2)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-13.42-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -13.42 + (((tickAnim - 8) / 4) * (23.80598-(-13.42)));
            yy = 0 + (((tickAnim - 8) / 4) * (8.62294-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-3.26998-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 23.80598 + (((tickAnim - 12) / 5) * (11-(23.80598)));
            yy = 8.62294 + (((tickAnim - 12) / 5) * (0-(8.62294)));
            zz = -3.26998 + (((tickAnim - 12) / 5) * (0-(-3.26998)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 11 + (((tickAnim - 17) / 17) * (11-(11)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 11 + (((tickAnim - 34) / 3) * (8.48481-(11)));
            yy = 0 + (((tickAnim - 34) / 3) * (12.45723-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (-4.96784-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 8.48481 + (((tickAnim - 37) / 3) * (-26-(8.48481)));
            yy = 12.45723 + (((tickAnim - 37) / 3) * (0-(12.45723)));
            zz = -4.96784 + (((tickAnim - 37) / 3) * (0-(-4.96784)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -26 + (((tickAnim - 40) / 10) * (0-(-26)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.33-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 0.45 + (((tickAnim - 8) / 9) * (0.6-(0.45)));
            zz = 0.33 + (((tickAnim - 8) / 9) * (0.8-(0.33)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0.6 + (((tickAnim - 17) / 1) * (0.5-(0.6)));
            zz = 0.8 + (((tickAnim - 17) / 1) * (0.8-(0.8)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = 0.5 + (((tickAnim - 18) / 0) * (0.6-(0.5)));
            zz = 0.8 + (((tickAnim - 18) / 0) * (0.8-(0.8)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.6 + (((tickAnim - 18) / 1) * (0.5-(0.6)));
            zz = 0.8 + (((tickAnim - 18) / 1) * (0.8-(0.8)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = 0.5 + (((tickAnim - 19) / 15) * (0.6-(0.5)));
            zz = 0.8 + (((tickAnim - 19) / 15) * (0.8-(0.8)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0.6 + (((tickAnim - 34) / 6) * (0-(0.6)));
            zz = 0.8 + (((tickAnim - 34) / 6) * (0-(0.8)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 1) * (0.01-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 41) / 1) * (0-(0)));
            yy = 0.01 + (((tickAnim - 41) / 1) * (-0.1-(0.01)));
            zz = 0 + (((tickAnim - 41) / 1) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 42) / 1) * (0.01-(-0.1)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.01 + (((tickAnim - 43) / 7) * (0-(0.01)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft.rotationPointX = this.armleft.rotationPointX + (float)(xx);
        this.armleft.rotationPointY = this.armleft.rotationPointY - (float)(yy);
        this.armleft.rotationPointZ = this.armleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -9.25 + (((tickAnim - 8) / 4) * (-40.27-(-9.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -40.27 + (((tickAnim - 12) / 5) * (-3-(-40.27)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -3 + (((tickAnim - 17) / 17) * (-3-(-3)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -3 + (((tickAnim - 34) / 3) * (-32.63-(-3)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -32.63 + (((tickAnim - 37) / 3) * (0-(-32.63)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.2-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 0.1 + (((tickAnim - 8) / 9) * (0-(0.1)));
            zz = 0.2 + (((tickAnim - 8) / 9) * (0-(0.2)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (0.5-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0.2-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 40) / 5) * (0.35-(0.5)));
            zz = 0.2 + (((tickAnim - 40) / 5) * (0.3-(0.2)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.35 + (((tickAnim - 45) / 5) * (0-(0.35)));
            zz = 0.3 + (((tickAnim - 45) / 5) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (27.42-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 27.42 + (((tickAnim - 8) / 4) * (41.84-(27.42)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 41.84 + (((tickAnim - 12) / 5) * (1-(41.84)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 1 + (((tickAnim - 17) / 17) * (0-(1)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (33.88-(0)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 33.88 + (((tickAnim - 37) / 3) * (31-(33.88)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 31 + (((tickAnim - 40) / 2) * (25.36-(31)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 25.36 + (((tickAnim - 42) / 8) * (0-(25.36)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 4) / 13) * (0-(0)));
            yy = 0.1 + (((tickAnim - 4) / 13) * (0-(0.1)));
            zz = 0 + (((tickAnim - 4) / 13) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = -0.05 + (((tickAnim - 40) / 2) * (0.06-(-0.05)));
            zz = 0 + (((tickAnim - 40) / 2) * (-0.1-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = 0.06 + (((tickAnim - 42) / 3) * (0.14-(0.06)));
            zz = -0.1 + (((tickAnim - 42) / 3) * (-0.06-(-0.1)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            yy = 0.14 + (((tickAnim - 45) / 3) * (0.12-(0.14)));
            zz = -0.06 + (((tickAnim - 45) / 3) * (-0.03-(-0.06)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.12 + (((tickAnim - 48) / 2) * (0-(0.12)));
            zz = -0.03 + (((tickAnim - 48) / 2) * (0-(-0.03)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 16 + (((tickAnim - 6) / 6) * (27.42867-(16)));
            yy = 0 + (((tickAnim - 6) / 6) * (-9.17731-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (-2.39834-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 27.42867 + (((tickAnim - 12) / 5) * (27.42867-(27.42867)));
            yy = -9.17731 + (((tickAnim - 12) / 5) * (-9.17731-(-9.17731)));
            zz = -2.39834 + (((tickAnim - 12) / 5) * (-2.39834-(-2.39834)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 27.42867 + (((tickAnim - 17) / 17) * (27.42867-(27.42867)));
            yy = -9.17731 + (((tickAnim - 17) / 17) * (-9.17731-(-9.17731)));
            zz = -2.39834 + (((tickAnim - 17) / 17) * (-2.39834-(-2.39834)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 27.42867 + (((tickAnim - 34) / 4) * (27.42867-(27.42867)));
            yy = -9.17731 + (((tickAnim - 34) / 4) * (-9.17731-(-9.17731)));
            zz = -2.39834 + (((tickAnim - 34) / 4) * (-2.39834-(-2.39834)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 27.42867 + (((tickAnim - 38) / 4) * (-5.88564-(27.42867)));
            yy = -9.17731 + (((tickAnim - 38) / 4) * (-6.73003-(-9.17731)));
            zz = -2.39834 + (((tickAnim - 38) / 4) * (-1.75879-(-2.39834)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -5.88564 + (((tickAnim - 42) / 4) * (0-(-5.88564)));
            yy = -6.73003 + (((tickAnim - 42) / 4) * (0-(-6.73003)));
            zz = -1.75879 + (((tickAnim - 42) / 4) * (0-(-1.75879)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0.9 + (((tickAnim - 6) / 6) * (1.4-(0.9)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.4 + (((tickAnim - 12) / 1) * (1.42-(1.4)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 1.42 + (((tickAnim - 13) / 1) * (1.32-(1.42)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 1.32 + (((tickAnim - 14) / 1) * (1.45-(1.32)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 1.45 + (((tickAnim - 15) / 2) * (1.4-(1.45)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 1.4 + (((tickAnim - 17) / 17) * (1.4-(1.4)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 1.4 + (((tickAnim - 34) / 4) * (1.4-(1.4)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = 1.4 + (((tickAnim - 38) / 4) * (0.74-(1.4)));
            zz = 0 + (((tickAnim - 38) / 4) * (-0.4-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            yy = 0.74 + (((tickAnim - 42) / 4) * (0-(0.74)));
            zz = -0.4 + (((tickAnim - 42) / 4) * (0-(-0.4)));
        }
        else if (tickAnim >= 46 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 46) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 1) * (0.01-(0)));
            zz = 0 + (((tickAnim - 46) / 1) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 47) / 1) * (0-(0)));
            yy = 0.01 + (((tickAnim - 47) / 1) * (-0.09-(0.01)));
            zz = 0 + (((tickAnim - 47) / 1) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 48) / 0) * (0-(0)));
            yy = -0.09 + (((tickAnim - 48) / 0) * (0.02-(-0.09)));
            zz = 0 + (((tickAnim - 48) / 0) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.02 + (((tickAnim - 48) / 2) * (0-(0.02)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft.rotationPointX = this.legleft.rotationPointX + (float)(xx);
        this.legleft.rotationPointY = this.legleft.rotationPointY - (float)(yy);
        this.legleft.rotationPointZ = this.legleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 9 + (((tickAnim - 6) / 6) * (3-(9)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 3 + (((tickAnim - 12) / 5) * (3-(3)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 3 + (((tickAnim - 17) / 17) * (3-(3)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 3 + (((tickAnim - 34) / 4) * (-8-(3)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -8 + (((tickAnim - 38) / 4) * (16.13-(-8)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 16.13 + (((tickAnim - 42) / 4) * (3-(16.13)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 3 + (((tickAnim - 46) / 4) * (0-(3)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 14 + (((tickAnim - 6) / 6) * (-24-(14)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -24 + (((tickAnim - 12) / 5) * (-24-(-24)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -24 + (((tickAnim - 17) / 17) * (-24-(-24)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -24 + (((tickAnim - 34) / 4) * (-13-(-24)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -13 + (((tickAnim - 38) / 4) * (-28.53-(-13)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -28.53 + (((tickAnim - 42) / 4) * (2-(-28.53)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 2 + (((tickAnim - 46) / 4) * (0-(2)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.18-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.18-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.18 + (((tickAnim - 3) / 3) * (0.2-(0.18)));
            zz = 0.18 + (((tickAnim - 3) / 3) * (0.2-(0.18)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0.2 + (((tickAnim - 6) / 6) * (0-(0.2)));
            zz = 0.2 + (((tickAnim - 6) / 6) * (0-(0.2)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0.5-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 8) * (0.7-(0)));
            zz = 0.5 + (((tickAnim - 38) / 8) * (0.5-(0.5)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0.7 + (((tickAnim - 46) / 4) * (0-(0.7)));
            zz = 0.5 + (((tickAnim - 46) / 4) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -3 + (((tickAnim - 6) / 6) * (8-(-3)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 8 + (((tickAnim - 12) / 5) * (8-(8)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 8 + (((tickAnim - 17) / 17) * (8-(8)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 8 + (((tickAnim - 34) / 4) * (5-(8)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 38) / 2) * (15.15-(5)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 15.15 + (((tickAnim - 40) / 2) * (13.29-(15.15)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 13.29 + (((tickAnim - 42) / 1) * (-2.62-(13.29)));
            yy = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -2.62 + (((tickAnim - 43) / 3) * (0-(-2.62)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 12) / 5) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0.2 + (((tickAnim - 17) / 17) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            yy = 0.2 + (((tickAnim - 34) / 12) * (0-(0.2)));
            zz = 0 + (((tickAnim - 34) / 12) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft4.rotationPointX = this.legleft4.rotationPointX + (float)(xx);
        this.legleft4.rotationPointY = this.legleft4.rotationPointY - (float)(yy);
        this.legleft4.rotationPointZ = this.legleft4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 6 + (((tickAnim - 17) / 17) * (6-(6)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 17) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 17) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 34) / 16) * (0-(6)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 34) / 16) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 34) / 16) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*1-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 17) / 33) * (0-(4)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*2.5 + (((tickAnim - 17) / 33) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*1 + (((tickAnim - 17) / 33) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 17) / 33) * (0-(6)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*5 + (((tickAnim - 17) / 33) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1 + (((tickAnim - 17) / 33) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 50) {
            xx = 8 + (((tickAnim - 17) / 33) * (0-(8)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*5 + (((tickAnim - 17) / 33) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1 + (((tickAnim - 17) / 33) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-13.42-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -13.42 + (((tickAnim - 3) / 3) * (23.80598-(-13.42)));
            yy = 0 + (((tickAnim - 3) / 3) * (8.62294-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-3.26998-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 23.80598 + (((tickAnim - 6) / 5) * (11-(23.80598)));
            yy = 8.62294 + (((tickAnim - 6) / 5) * (0-(8.62294)));
            zz = -3.26998 + (((tickAnim - 6) / 5) * (0-(-3.26998)));
        }
        else if (tickAnim >= 11 && tickAnim < 28) {
            xx = 11 + (((tickAnim - 11) / 17) * (11-(11)));
            yy = 0 + (((tickAnim - 11) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 17) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 11 + (((tickAnim - 28) / 3) * (8.48481-(11)));
            yy = 0 + (((tickAnim - 28) / 3) * (12.45723-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (-4.96784-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 8.48481 + (((tickAnim - 31) / 3) * (-26-(8.48481)));
            yy = 12.45723 + (((tickAnim - 31) / 3) * (0-(12.45723)));
            zz = -4.96784 + (((tickAnim - 31) / 3) * (0-(-4.96784)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -26 + (((tickAnim - 34) / 16) * (0-(-26)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.33-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0.45 + (((tickAnim - 3) / 8) * (0.6-(0.45)));
            zz = 0.33 + (((tickAnim - 3) / 8) * (0.8-(0.33)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0.6 + (((tickAnim - 11) / 1) * (0.5-(0.6)));
            zz = 0.8 + (((tickAnim - 11) / 1) * (0.8-(0.8)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 12) / 1) * (0.6-(0.5)));
            zz = 0.8 + (((tickAnim - 12) / 1) * (0.8-(0.8)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0.6 + (((tickAnim - 13) / 0) * (0.5-(0.6)));
            zz = 0.8 + (((tickAnim - 13) / 0) * (0.8-(0.8)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            yy = 0.5 + (((tickAnim - 13) / 15) * (0.6-(0.5)));
            zz = 0.8 + (((tickAnim - 13) / 15) * (0.8-(0.8)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = 0.6 + (((tickAnim - 28) / 6) * (0-(0.6)));
            zz = 0.8 + (((tickAnim - 28) / 6) * (0-(0.8)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 1) * (0.01-(0)));
            zz = 0 + (((tickAnim - 34) / 1) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            yy = 0.01 + (((tickAnim - 35) / 1) * (-0.1-(0.01)));
            zz = 0 + (((tickAnim - 35) / 1) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 36) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 36) / 1) * (0.01-(-0.1)));
            zz = 0 + (((tickAnim - 36) / 1) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 0.01 + (((tickAnim - 37) / 13) * (0-(0.01)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright.rotationPointX = this.armright.rotationPointX + (float)(xx);
        this.armright.rotationPointY = this.armright.rotationPointY - (float)(yy);
        this.armright.rotationPointZ = this.armright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -9.25 + (((tickAnim - 3) / 3) * (-40.27-(-9.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -40.27 + (((tickAnim - 6) / 5) * (-3-(-40.27)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 28) {
            xx = -3 + (((tickAnim - 11) / 17) * (-3-(-3)));
            yy = 0 + (((tickAnim - 11) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 17) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -3 + (((tickAnim - 28) / 3) * (-32.63-(-3)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -32.63 + (((tickAnim - 31) / 3) * (0-(-32.63)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.2-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0.1 + (((tickAnim - 3) / 8) * (0-(0.1)));
            zz = 0.2 + (((tickAnim - 3) / 8) * (0-(0.2)));
        }
        else if (tickAnim >= 11 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 11) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 17) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 6) * (0.5-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0.2-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 34) / 5) * (0.35-(0.5)));
            zz = 0.2 + (((tickAnim - 34) / 5) * (0.3-(0.2)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0.35 + (((tickAnim - 39) / 11) * (0-(0.35)));
            zz = 0.3 + (((tickAnim - 39) / 11) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (27.42-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 27.42 + (((tickAnim - 3) / 3) * (41.84-(27.42)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 41.84 + (((tickAnim - 6) / 5) * (1-(41.84)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 11) / 17) * (0-(1)));
            yy = 0 + (((tickAnim - 11) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 17) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (33.88-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 33.88 + (((tickAnim - 31) / 3) * (31-(33.88)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 31 + (((tickAnim - 34) / 2) * (25.36-(31)));
            yy = 0 + (((tickAnim - 34) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 2) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 25.36 + (((tickAnim - 36) / 14) * (0-(25.36)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 2) / 9) * (0-(0)));
            yy = 0.1 + (((tickAnim - 2) / 9) * (0-(0.1)));
            zz = 0 + (((tickAnim - 2) / 9) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 11) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 17) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 6) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 34) / 2) * (0-(0)));
            yy = -0.05 + (((tickAnim - 34) / 2) * (0.06-(-0.05)));
            zz = 0 + (((tickAnim - 34) / 2) * (-0.1-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            yy = 0.06 + (((tickAnim - 36) / 3) * (0.14-(0.06)));
            zz = -0.1 + (((tickAnim - 36) / 3) * (-0.06-(-0.1)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 39) / 9) * (0-(0)));
            yy = 0.14 + (((tickAnim - 39) / 9) * (0.12-(0.14)));
            zz = -0.06 + (((tickAnim - 39) / 9) * (-0.03-(-0.06)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.12 + (((tickAnim - 48) / 2) * (0-(0.12)));
            zz = -0.03 + (((tickAnim - 48) / 2) * (0-(-0.03)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-5.1428-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (4.97104-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (1.29908-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -5.1428 + (((tickAnim - 9) / 4) * (20.28579-(-5.1428)));
            yy = 4.97104 + (((tickAnim - 9) / 4) * (6.96348-(4.97104)));
            zz = 1.29908 + (((tickAnim - 9) / 4) * (1.81976-(1.29908)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 20.28579 + (((tickAnim - 13) / 4) * (27.42867-(20.28579)));
            yy = 6.96348 + (((tickAnim - 13) / 4) * (9.1773-(6.96348)));
            zz = 1.81976 + (((tickAnim - 13) / 4) * (2.3983-(1.81976)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 27.42867 + (((tickAnim - 17) / 17) * (27.42867-(27.42867)));
            yy = 9.1773 + (((tickAnim - 17) / 17) * (9.1773-(9.1773)));
            zz = 2.3983 + (((tickAnim - 17) / 17) * (2.3983-(2.3983)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 27.42867 + (((tickAnim - 34) / 3) * (-4.32788-(27.42867)));
            yy = 9.1773 + (((tickAnim - 34) / 3) * (9.17728-(9.1773)));
            zz = 2.3983 + (((tickAnim - 34) / 3) * (2.39829-(2.3983)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -4.32788 + (((tickAnim - 37) / 3) * (0-(-4.32788)));
            yy = 9.17728 + (((tickAnim - 37) / 3) * (0-(9.17728)));
            zz = 2.39829 + (((tickAnim - 37) / 3) * (0-(2.39829)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (1.44-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.44 + (((tickAnim - 11) / 2) * (1.52-(1.44)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 1.52 + (((tickAnim - 13) / 4) * (1.4-(1.52)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 1.4 + (((tickAnim - 17) / 1) * (1.3-(1.4)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = 1.3 + (((tickAnim - 18) / 0) * (1.4-(1.3)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 1.4 + (((tickAnim - 18) / 1) * (1.3-(1.4)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = 1.3 + (((tickAnim - 19) / 15) * (1.4-(1.3)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            yy = 1.4 + (((tickAnim - 34) / 3) * (0.79-(1.4)));
            zz = 0 + (((tickAnim - 34) / 3) * (-0.4-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0.79 + (((tickAnim - 37) / 3) * (0-(0.79)));
            zz = -0.4 + (((tickAnim - 37) / 3) * (0-(-0.4)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 42) / 1) * (0.01-(-0.1)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 43) / 0) * (0-(0)));
            yy = 0.01 + (((tickAnim - 43) / 0) * (-0.09-(0.01)));
            zz = 0 + (((tickAnim - 43) / 0) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 43) / 1) * (0-(0)));
            yy = -0.09 + (((tickAnim - 43) / 1) * (0.02-(-0.09)));
            zz = 0 + (((tickAnim - 43) / 1) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0.02 + (((tickAnim - 44) / 6) * (0-(0.02)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright.rotationPointX = this.legright.rotationPointX + (float)(xx);
        this.legright.rotationPointY = this.legright.rotationPointY - (float)(yy);
        this.legright.rotationPointZ = this.legright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (8.63-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 8.63 + (((tickAnim - 9) / 4) * (14.96-(8.63)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 14.96 + (((tickAnim - 13) / 4) * (3-(14.96)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 3 + (((tickAnim - 17) / 17) * (3-(3)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 3 + (((tickAnim - 34) / 3) * (16.52-(3)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 16.52 + (((tickAnim - 37) / 13) * (0-(16.52)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-12.43-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -12.43 + (((tickAnim - 9) / 2) * (-12.98-(-12.43)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -12.98 + (((tickAnim - 11) / 2) * (-6.91-(-12.98)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -6.91 + (((tickAnim - 13) / 4) * (-24-(-6.91)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -24 + (((tickAnim - 17) / 17) * (-24-(-24)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -24 + (((tickAnim - 34) / 3) * (-25.18-(-24)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -25.18 + (((tickAnim - 37) / 13) * (0-(-25.18)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.4-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.1 + (((tickAnim - 9) / 4) * (0.05-(0.1)));
            zz = 0.4 + (((tickAnim - 9) / 4) * (0.71-(0.4)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.05 + (((tickAnim - 13) / 4) * (0-(0.05)));
            zz = 0.71 + (((tickAnim - 13) / 4) * (0-(0.71)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (0.1-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0.1-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.1 + (((tickAnim - 40) / 10) * (0-(0.1)));
            zz = 0.1 + (((tickAnim - 40) / 10) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (18.33-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 18.33 + (((tickAnim - 9) / 2) * (12.18-(18.33)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 12.18 + (((tickAnim - 11) / 1) * (6.57-(12.18)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 6.57 + (((tickAnim - 12) / 1) * (9-(6.57)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 9 + (((tickAnim - 13) / 2) * (6.44-(9)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 6.44 + (((tickAnim - 15) / 2) * (8-(6.44)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 8 + (((tickAnim - 17) / 17) * (8-(8)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 8 + (((tickAnim - 34) / 2) * (16.83-(8)));
            yy = 0 + (((tickAnim - 34) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 2) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 16.83 + (((tickAnim - 36) / 2) * (-1.74-(16.83)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = -1.74 + (((tickAnim - 38) / 1) * (-1.13-(-1.74)));
            yy = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 1) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = -1.13 + (((tickAnim - 39) / 2) * (10.88-(-1.13)));
            yy = 0 + (((tickAnim - 39) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 2) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 10.88 + (((tickAnim - 41) / 9) * (0-(10.88)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.03-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.6-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            yy = -0.03 + (((tickAnim - 9) / 8) * (0.2-(-0.03)));
            zz = -0.6 + (((tickAnim - 9) / 8) * (0-(-0.6)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0.2 + (((tickAnim - 17) / 17) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0.2 + (((tickAnim - 34) / 16) * (0-(0.2)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright4.rotationPointX = this.legright4.rotationPointX + (float)(xx);
        this.legright4.rotationPointY = this.legright4.rotationPointY - (float)(yy);
        this.legright4.rotationPointZ = this.legright4.rotationPointZ + (float)(zz);

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGargoyleosaurus entity = (EntityPrehistoricFloraGargoyleosaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 27.5 + (((tickAnim - 8) / 5) * (17.5-(27.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 17.5 + (((tickAnim - 13) / 7) * (0-(17.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 20 + (((tickAnim - 8) / 8) * (25-(20)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 16) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 15 + (((tickAnim - 8) / 8) * (5-(15)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 16) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 15 + (((tickAnim - 6) / 4) * (20-(15)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 10) / 3) * (0-(20)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGargoyleosaurus entity = (EntityPrehistoricFloraGargoyleosaurus) entitylivingbaseIn;

        int animCycle = 55;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 46) {
            xx = 5 + (((tickAnim - 10) / 36) * (5-(5)));
            yy = 0 + (((tickAnim - 10) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 36) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = 5 + (((tickAnim - 46) / 9) * (0-(5)));
            yy = 0 + (((tickAnim - 46) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 46) {
            xx = 2 + (((tickAnim - 10) / 36) * (2-(2)));
            yy = 0 + (((tickAnim - 10) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 36) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = 2 + (((tickAnim - 46) / 9) * (0-(2)));
            yy = 0 + (((tickAnim - 46) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (24.74534-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-2.63039-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (12.71743-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 24.74534 + (((tickAnim - 21) / 12) * (27.74534-(24.74534)));
            yy = -2.63039 + (((tickAnim - 21) / 12) * (-2.63039-(-2.63039)));
            zz = 12.71743 + (((tickAnim - 21) / 12) * (12.71743-(12.71743)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 27.74534 + (((tickAnim - 33) / 13) * (24.74534-(27.74534)));
            yy = -2.63039 + (((tickAnim - 33) / 13) * (-2.63039-(-2.63039)));
            zz = 12.71743 + (((tickAnim - 33) / 13) * (12.71743-(12.71743)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = 24.74534 + (((tickAnim - 46) / 9) * (0-(24.74534)));
            yy = -2.63039 + (((tickAnim - 46) / 9) * (0-(-2.63039)));
            zz = 12.71743 + (((tickAnim - 46) / 9) * (0-(12.71743)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (8-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 21) / 12) * (3-(0)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 8 + (((tickAnim - 21) / 12) * (8-(8)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 3 + (((tickAnim - 33) / 13) * (0-(3)));
            yy = 0 + (((tickAnim - 33) / 13) * (0-(0)));
            zz = 8 + (((tickAnim - 33) / 13) * (8-(8)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 46) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 9) * (0-(0)));
            zz = 8 + (((tickAnim - 46) / 9) * (0-(8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-1.57594-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-11.96731-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (8.64235-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -1.57594 + (((tickAnim - 21) / 12) * (1.42406-(-1.57594)));
            yy = -11.96731 + (((tickAnim - 21) / 12) * (-11.96731-(-11.96731)));
            zz = 8.64235 + (((tickAnim - 21) / 12) * (8.64235-(8.64235)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 1.42406 + (((tickAnim - 33) / 13) * (-1.57594-(1.42406)));
            yy = -11.96731 + (((tickAnim - 33) / 13) * (-11.96731-(-11.96731)));
            zz = 8.64235 + (((tickAnim - 33) / 13) * (8.64235-(8.64235)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = -1.57594 + (((tickAnim - 46) / 9) * (0-(-1.57594)));
            yy = -11.96731 + (((tickAnim - 46) / 9) * (0-(-11.96731)));
            zz = 8.64235 + (((tickAnim - 46) / 9) * (0-(8.64235)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 12 + (((tickAnim - 11) / 7) * (12.86606-(12)));
            yy = 0 + (((tickAnim - 11) / 7) * (15.51386-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (-1.37738-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 12.86606 + (((tickAnim - 18) / 4) * (-5.13394-(12.86606)));
            yy = 15.51386 + (((tickAnim - 18) / 4) * (15.51386-(15.51386)));
            zz = -1.37738 + (((tickAnim - 18) / 4) * (-1.37738-(-1.37738)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -5.13394 + (((tickAnim - 22) / 5) * (12-(-5.13394)));
            yy = 15.51386 + (((tickAnim - 22) / 5) * (0-(15.51386)));
            zz = -1.37738 + (((tickAnim - 22) / 5) * (0-(-1.37738)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 12 + (((tickAnim - 27) / 6) * (12.86606-(12)));
            yy = 0 + (((tickAnim - 27) / 6) * (15.51386-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (-1.37738-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 12.86606 + (((tickAnim - 33) / 5) * (-5.13394-(12.86606)));
            yy = 15.51386 + (((tickAnim - 33) / 5) * (15.51386-(15.51386)));
            zz = -1.37738 + (((tickAnim - 33) / 5) * (-1.37738-(-1.37738)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -5.13394 + (((tickAnim - 38) / 7) * (12-(-5.13394)));
            yy = 15.51386 + (((tickAnim - 38) / 7) * (0-(15.51386)));
            zz = -1.37738 + (((tickAnim - 38) / 7) * (0-(-1.37738)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 12 + (((tickAnim - 45) / 10) * (0-(12)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 11) / 3) * (0.2-(0.1)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 0.2 + (((tickAnim - 14) / 8) * (0-(0.2)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 5) * (0.1-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 27) / 3) * (0.2-(0.1)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0.2 + (((tickAnim - 30) / 8) * (0-(0.2)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0.1-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            yy = 0.1 + (((tickAnim - 45) / 10) * (0-(0.1)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft.rotationPointX = this.armleft.rotationPointX + (float)(xx);
        this.armleft.rotationPointY = this.armleft.rotationPointY - (float)(yy);
        this.armleft.rotationPointZ = this.armleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 11) / 7) * (-51-(-10)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -51 + (((tickAnim - 18) / 4) * (-44-(-51)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -44 + (((tickAnim - 22) / 5) * (-10-(-44)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -10 + (((tickAnim - 27) / 6) * (-51-(-10)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -51 + (((tickAnim - 33) / 5) * (-44-(-51)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -44 + (((tickAnim - 38) / 7) * (-10-(-44)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -10 + (((tickAnim - 45) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0.5-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0.5 + (((tickAnim - 24) / 3) * (0-(0.5)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0.5-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0.5 + (((tickAnim - 42) / 3) * (0-(0.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -9 + (((tickAnim - 11) / 7) * (-1-(-9)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -1 + (((tickAnim - 18) / 4) * (44-(-1)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 44 + (((tickAnim - 22) / 5) * (-9-(44)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -9 + (((tickAnim - 27) / 6) * (-1-(-9)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -1 + (((tickAnim - 33) / 5) * (44-(-1)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 44 + (((tickAnim - 38) / 7) * (-9-(44)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -9 + (((tickAnim - 45) / 10) * (0-(-9)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 11) / 16) * (0-(0)));
            yy = 0.1 + (((tickAnim - 11) / 16) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 11) / 16) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 27) / 18) * (0-(0)));
            yy = 0.1 + (((tickAnim - 27) / 18) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 27) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 29) / 26) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 29) / 26) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 29) / 26) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*1-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 29) / 26) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*2.5 + (((tickAnim - 29) / 26) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*1 + (((tickAnim - 29) / 26) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 29) / 26) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*5 + (((tickAnim - 29) / 26) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1 + (((tickAnim - 29) / 26) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 29) / 26) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*5 + (((tickAnim - 29) / 26) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1 + (((tickAnim - 29) / 26) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 49) {
            xx = -22.5 + (((tickAnim - 13) / 36) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 13) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 36) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 55) {
            xx = -22.5 + (((tickAnim - 49) / 6) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 49) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 49) {
            xx = 17.5 + (((tickAnim - 13) / 36) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 13) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 36) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 55) {
            xx = 17.5 + (((tickAnim - 49) / 6) * (0-(17.5)));
            yy = 0 + (((tickAnim - 49) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGargoyleosaurus entity = (EntityPrehistoricFloraGargoyleosaurus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (14.48-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 14.48 + (((tickAnim - 11) / 9) * (17.5-(14.48)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 17.5 + (((tickAnim - 20) / 7) * (22.5-(17.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 22.5 + (((tickAnim - 27) / 7) * (17.5-(22.5)));
            yy = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 17.5 + (((tickAnim - 34) / 9) * (19.74992-(17.5)));
            yy = 0 + (((tickAnim - 34) / 9) * (11.01878-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0.70934-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = 19.74992 + (((tickAnim - 43) / 11) * (22.09025-(19.74992)));
            yy = 11.01878 + (((tickAnim - 43) / 11) * (18.90485-(11.01878)));
            zz = 0.70934 + (((tickAnim - 43) / 11) * (-0.31627-(0.70934)));
        }
        else if (tickAnim >= 54 && tickAnim < 65) {
            xx = 22.09025 + (((tickAnim - 54) / 11) * (22.09025-(22.09025)));
            yy = 18.90485 + (((tickAnim - 54) / 11) * (18.90485-(18.90485)));
            zz = -0.31627 + (((tickAnim - 54) / 11) * (-0.31627-(-0.31627)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = 22.09025 + (((tickAnim - 65) / 8) * (10.68376-(22.09025)));
            yy = 18.90485 + (((tickAnim - 65) / 8) * (6.74246-(18.90485)));
            zz = -0.31627 + (((tickAnim - 65) / 8) * (-0.62326-(-0.31627)));
        }
        else if (tickAnim >= 73 && tickAnim < 79) {
            xx = 10.68376 + (((tickAnim - 73) / 6) * (0-(10.68376)));
            yy = 6.74246 + (((tickAnim - 73) / 6) * (0-(6.74246)));
            zz = -0.62326 + (((tickAnim - 73) / 6) * (0-(-0.62326)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (3.13-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 3.13 + (((tickAnim - 9) / 11) * (32.5-(3.13)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 32.5 + (((tickAnim - 20) / 15) * (32.5-(32.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 32.5 + (((tickAnim - 35) / 6) * (0.87116-(32.5)));
            yy = 0 + (((tickAnim - 35) / 6) * (1.6372-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (-0.46188-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 47) {
            xx = 0.87116 + (((tickAnim - 41) / 6) * (-2.32018-(0.87116)));
            yy = 1.6372 + (((tickAnim - 41) / 6) * (3.27441-(1.6372)));
            zz = -0.46188 + (((tickAnim - 41) / 6) * (-0.92376-(-0.46188)));
        }
        else if (tickAnim >= 47 && tickAnim < 54) {
            xx = -2.32018 + (((tickAnim - 47) / 7) * (10.71953-(-2.32018)));
            yy = 3.27441 + (((tickAnim - 47) / 7) * (5.37939-(3.27441)));
            zz = -0.92376 + (((tickAnim - 47) / 7) * (-1.5176-(-0.92376)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = 10.71953 + (((tickAnim - 54) / 4) * (10.21684-(10.71953)));
            yy = 5.37939 + (((tickAnim - 54) / 4) * (6.2884-(5.37939)));
            zz = -1.5176 + (((tickAnim - 54) / 4) * (-6.45994-(-1.5176)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = 10.21684 + (((tickAnim - 58) / 7) * (10.71953-(10.21684)));
            yy = 6.2884 + (((tickAnim - 58) / 7) * (5.37939-(6.2884)));
            zz = -6.45994 + (((tickAnim - 58) / 7) * (-1.5176-(-6.45994)));
        }
        else if (tickAnim >= 65 && tickAnim < 69) {
            xx = 10.71953 + (((tickAnim - 65) / 4) * (-2.43327-(10.71953)));
            yy = 5.37939 + (((tickAnim - 65) / 4) * (3.79721-(5.37939)));
            zz = -1.5176 + (((tickAnim - 65) / 4) * (-1.07125-(-1.5176)));
        }
        else if (tickAnim >= 69 && tickAnim < 79) {
            xx = -2.43327 + (((tickAnim - 69) / 10) * (0-(-2.43327)));
            yy = 3.79721 + (((tickAnim - 69) / 10) * (0-(3.79721)));
            zz = -1.07125 + (((tickAnim - 69) / 10) * (0-(-1.07125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 10) / 10) * (0-(20)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (-15-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -15 + (((tickAnim - 26) / 6) * (0-(-15)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 32) / 11) * (12.5-(0)));
            yy = 0 + (((tickAnim - 32) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 11) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = 12.5 + (((tickAnim - 43) / 11) * (0-(12.5)));
            yy = 0 + (((tickAnim - 43) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 11) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 54) / 6) * (-15-(0)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 66) {
            xx = -15 + (((tickAnim - 60) / 6) * (0-(-15)));
            yy = 0 + (((tickAnim - 60) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 6) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 66) / 5) * (15-(0)));
            yy = 0 + (((tickAnim - 66) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 5) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 15 + (((tickAnim - 71) / 9) * (0-(15)));
            yy = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (30-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 30 + (((tickAnim - 26) / 6) * (0-(30)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 32) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 22) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 54) / 6) * (30-(0)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 66) {
            xx = 30 + (((tickAnim - 60) / 6) * (0-(30)));
            yy = 0 + (((tickAnim - 60) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGargoyleosaurus entity = (EntityPrehistoricFloraGargoyleosaurus) entitylivingbaseIn;

        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 31) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2 + (((tickAnim - 0) / 31) * (-6-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 0) / 31) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 0) / 31) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -6 + (((tickAnim - 31) / 86) * (-6-(-6)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -6 + (((tickAnim - 117) / 43) * (0-(-6)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 10) * (-1.6-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 13) / 18) * (0-(0)));
            yy = -1.6 + (((tickAnim - 13) / 18) * (-3.5-(-1.6)));
            zz = 0 + (((tickAnim - 13) / 18) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = -3.5 + (((tickAnim - 31) / 86) * (-3.5-(-3.5)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = -3.5 + (((tickAnim - 117) / 43) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9 + (((tickAnim - 0) / 14) * (0.81612-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9)));
        }
        else if (tickAnim >= 14 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 14) / 19) * (0-(3)));
            yy = 0 + (((tickAnim - 14) / 19) * (0-(0)));
            zz = 0.81612 + (((tickAnim - 14) / 19) * (0-(0.81612)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = -2 + (((tickAnim - 0) / 8) * (-2-(-2)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (8-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = -2 + (((tickAnim - 8) / 12) * (0-(-2)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 8 + (((tickAnim - 20) / 13) * (6.6604-(8)));
            yy = 0 + (((tickAnim - 20) / 13) * (0.08058-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 6.6604 + (((tickAnim - 33) / 84) * (6.6604-(6.6604)));
            yy = 0.08058 + (((tickAnim - 33) / 84) * (0.08058-(0.08058)));
            zz = -0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1 + (((tickAnim - 33) / 84) * (-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1-(-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 6.6604 + (((tickAnim - 117) / 43) * (0-(6.6604)));
            yy = 0.08058 + (((tickAnim - 117) / 43) * (0-(0.08058)));
            zz = -0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1 + (((tickAnim - 117) / 43) * (-2-(-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = -0.475 + (((tickAnim - 33) / 84) * (-0.475-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Chest.rotationPointX = this.Chest.rotationPointX + (float)(xx);
        this.Chest.rotationPointY = this.Chest.rotationPointY - (float)(yy);
        this.Chest.rotationPointZ = this.Chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5.81671-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (10.83085-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (9.06678-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 5.81671 + (((tickAnim - 13) / 16) * (21.5-(5.81671)));
            yy = 10.83085 + (((tickAnim - 13) / 16) * (0-(10.83085)));
            zz = 9.06678 + (((tickAnim - 13) / 16) * (0-(9.06678)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 21.5 + (((tickAnim - 29) / 88) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 21.5 + (((tickAnim - 117) / 43) * (0-(21.5)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0.5-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.5 + (((tickAnim - 13) / 7) * (13-(0.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 13 + (((tickAnim - 20) / 9) * (23-(13)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 23 + (((tickAnim - 29) / 88) * (23-(23)));
            yy = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 23 + (((tickAnim - 117) / 43) * (0-(23)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 8) / 12) * (12-(-20)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 12 + (((tickAnim - 20) / 9) * (12-(12)));
            yy = 0 + (((tickAnim - 20) / 9) * (0.42902-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (-0.33008-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 12 + (((tickAnim - 29) / 88) * (12-(12)));
            yy = 0.42902 + (((tickAnim - 29) / 88) * (0.42902-(0.42902)));
            zz = -0.33008 + (((tickAnim - 29) / 88) * (-0.33008-(-0.33008)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 12 + (((tickAnim - 117) / 43) * (0-(12)));
            yy = 0.42902 + (((tickAnim - 117) / 43) * (0-(0.42902)));
            zz = -0.33008 + (((tickAnim - 117) / 43) * (0-(-0.33008)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 20 + (((tickAnim - 8) / 9) * (0-(20)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 20) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 3) / 3) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 12) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 14) / 146) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 146) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 146) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Jaw.rotationPointX = this.Jaw.rotationPointX + (float)(xx);
        this.Jaw.rotationPointY = this.Jaw.rotationPointY - (float)(yy);
        this.Jaw.rotationPointZ = this.Jaw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (17.7252-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (6.18705-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-5.08143-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 17.7252 + (((tickAnim - 8) / 3) * (27.63512-(17.7252)));
            yy = 6.18705 + (((tickAnim - 8) / 3) * (3.71223-(6.18705)));
            zz = -5.08143 + (((tickAnim - 8) / 3) * (-3.04886-(-5.08143)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 27.63512 + (((tickAnim - 11) / 3) * (30-(27.63512)));
            yy = 3.71223 + (((tickAnim - 11) / 3) * (0-(3.71223)));
            zz = -3.04886 + (((tickAnim - 11) / 3) * (0-(-3.04886)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 30 + (((tickAnim - 14) / 2) * (29-(30)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 29 + (((tickAnim - 16) / 2) * (31-(29)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 117) {
            xx = 31 + (((tickAnim - 18) / 99) * (31-(31)));
            yy = 0 + (((tickAnim - 18) / 99) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 99) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 31 + (((tickAnim - 117) / 16) * (25-(31)));
            yy = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 16) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 139) {
            xx = 25 + (((tickAnim - 133) / 6) * (13.16794-(25)));
            yy = 0 + (((tickAnim - 133) / 6) * (7.21884-(0)));
            zz = 0 + (((tickAnim - 133) / 6) * (-6.93856-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 144) {
            xx = 13.16794 + (((tickAnim - 139) / 5) * (3.73551-(13.16794)));
            yy = 7.21884 + (((tickAnim - 139) / 5) * (2.97798-(7.21884)));
            zz = -6.93856 + (((tickAnim - 139) / 5) * (-4.01823-(-6.93856)));
        }
        else if (tickAnim >= 144 && tickAnim < 160) {
            xx = 3.73551 + (((tickAnim - 144) / 16) * (0-(3.73551)));
            yy = 2.97798 + (((tickAnim - 144) / 16) * (0-(2.97798)));
            zz = -4.01823 + (((tickAnim - 144) / 16) * (0-(-4.01823)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 8) * (-0.2-(-0.2)));
            zz = 0.2 + (((tickAnim - 0) / 8) * (0.6-(0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 6) * (0.5-(-0.2)));
            zz = 0.6 + (((tickAnim - 8) / 6) * (0.3-(0.6)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 14) / 2) * (0.4-(0.5)));
            zz = 0.3 + (((tickAnim - 14) / 2) * (0.3-(0.3)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = 0.4 + (((tickAnim - 16) / 17) * (0.23-(0.4)));
            zz = 0.3 + (((tickAnim - 16) / 17) * (0.33-(0.3)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0.23 + (((tickAnim - 33) / 84) * (0.23-(0.23)));
            zz = 0.33 + (((tickAnim - 33) / 84) * (0.33-(0.33)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            yy = 0.23 + (((tickAnim - 117) / 16) * (0.175-(0.23)));
            zz = 0.33 + (((tickAnim - 117) / 16) * (0.5-(0.33)));
        }
        else if (tickAnim >= 133 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 133) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 133) / 3) * (0.83-(0.175)));
            zz = 0.5 + (((tickAnim - 133) / 3) * (0.76-(0.5)));
        }
        else if (tickAnim >= 136 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 136) / 8) * (0-(0)));
            yy = 0.83 + (((tickAnim - 136) / 8) * (-0.115-(0.83)));
            zz = 0.76 + (((tickAnim - 136) / 8) * (0.53-(0.76)));
        }
        else if (tickAnim >= 144 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 144) / 2) * (0-(0)));
            yy = -0.115 + (((tickAnim - 144) / 2) * (0.06-(-0.115)));
            zz = 0.53 + (((tickAnim - 144) / 2) * (0.48-(0.53)));
        }
        else if (tickAnim >= 146 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 146) / 2) * (0-(0)));
            yy = 0.06 + (((tickAnim - 146) / 2) * (0.055-(0.06)));
            zz = 0.48 + (((tickAnim - 146) / 2) * (0.44-(0.48)));
        }
        else if (tickAnim >= 148 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 148) / 1) * (0-(0)));
            yy = 0.055 + (((tickAnim - 148) / 1) * (-0.07-(0.055)));
            zz = 0.44 + (((tickAnim - 148) / 1) * (0.39-(0.44)));
        }
        else if (tickAnim >= 149 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 149) / 2) * (0-(0)));
            yy = -0.07 + (((tickAnim - 149) / 2) * (-0.05-(-0.07)));
            zz = 0.39 + (((tickAnim - 149) / 2) * (0.35-(0.39)));
        }
        else if (tickAnim >= 151 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 151) / 9) * (0-(0)));
            yy = -0.05 + (((tickAnim - 151) / 9) * (-0.1-(-0.05)));
            zz = 0.35 + (((tickAnim - 151) / 9) * (0.1-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft.rotationPointX = this.armleft.rotationPointX + (float)(xx);
        this.armleft.rotationPointY = this.armleft.rotationPointY - (float)(yy);
        this.armleft.rotationPointZ = this.armleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-33-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = -33 + (((tickAnim - 3) / 8) * (3-(-33)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 3 + (((tickAnim - 11) / 7) * (-17-(3)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -17 + (((tickAnim - 18) / 2) * (-19.99933-(-17)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.15205-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-0.08957-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = -19.99933 + (((tickAnim - 20) / 11) * (-16.99618-(-19.99933)));
            yy = -0.15205 + (((tickAnim - 20) / 11) * (-0.86162-(-0.15205)));
            zz = -0.08957 + (((tickAnim - 20) / 11) * (-0.50758-(-0.08957)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -16.99618 + (((tickAnim - 31) / 86) * (-16.99618-(-16.99618)));
            yy = -0.86162 + (((tickAnim - 31) / 86) * (-0.86162-(-0.86162)));
            zz = -0.50758 + (((tickAnim - 31) / 86) * (-0.50758-(-0.50758)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = -16.99618 + (((tickAnim - 117) / 16) * (-2.99618-(-16.99618)));
            yy = -0.86162 + (((tickAnim - 117) / 16) * (-0.86162-(-0.86162)));
            zz = -0.50758 + (((tickAnim - 117) / 16) * (-0.50758-(-0.50758)));
        }
        else if (tickAnim >= 133 && tickAnim < 139) {
            xx = -2.99618 + (((tickAnim - 133) / 6) * (-50.69775-(-2.99618)));
            yy = -0.86162 + (((tickAnim - 133) / 6) * (-0.58132-(-0.86162)));
            zz = -0.50758 + (((tickAnim - 133) / 6) * (-0.34245-(-0.50758)));
        }
        else if (tickAnim >= 139 && tickAnim < 144) {
            xx = -50.69775 + (((tickAnim - 139) / 5) * (-14.70156-(-50.69775)));
            yy = -0.58132 + (((tickAnim - 139) / 5) * (2.18123-(-0.58132)));
            zz = -0.34245 + (((tickAnim - 139) / 5) * (1.42364-(-0.34245)));
        }
        else if (tickAnim >= 144 && tickAnim < 160) {
            xx = -14.70156 + (((tickAnim - 144) / 16) * (0-(-14.70156)));
            yy = 2.18123 + (((tickAnim - 144) / 16) * (0-(2.18123)));
            zz = 1.42364 + (((tickAnim - 144) / 16) * (0-(1.42364)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.46-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.12-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.46 + (((tickAnim - 3) / 5) * (0.12-(-0.46)));
            zz = 0.12 + (((tickAnim - 3) / 5) * (0.35-(0.12)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.12 + (((tickAnim - 8) / 3) * (0.2-(0.12)));
            zz = 0.35 + (((tickAnim - 8) / 3) * (0.2-(0.35)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 11) / 2) * (-0.16-(0.2)));
            zz = 0.2 + (((tickAnim - 11) / 2) * (-0.85-(0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.16 + (((tickAnim - 13) / 3) * (-0.09-(-0.16)));
            zz = -0.85 + (((tickAnim - 13) / 3) * (-0.79-(-0.85)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = -0.09 + (((tickAnim - 16) / 2) * (0.01-(-0.09)));
            zz = -0.79 + (((tickAnim - 16) / 2) * (-0.41-(-0.79)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.01 + (((tickAnim - 18) / 2) * (0.01-(0.01)));
            zz = -0.41 + (((tickAnim - 18) / 2) * (-0.31-(-0.41)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.01 + (((tickAnim - 20) / 3) * (0.01-(0.01)));
            zz = -0.31 + (((tickAnim - 20) / 3) * (-0.31-(-0.31)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.01 + (((tickAnim - 23) / 5) * (0.01-(0.01)));
            zz = -0.31 + (((tickAnim - 23) / 5) * (-0.11-(-0.31)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0.01 + (((tickAnim - 28) / 3) * (0.01-(0.01)));
            zz = -0.11 + (((tickAnim - 28) / 3) * (-0.01-(-0.11)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = 0.01 + (((tickAnim - 31) / 86) * (0.01-(0.01)));
            zz = -0.01 + (((tickAnim - 31) / 86) * (-0.01-(-0.01)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            yy = 0.01 + (((tickAnim - 117) / 16) * (-0.39-(0.01)));
            zz = -0.01 + (((tickAnim - 117) / 16) * (-0.21-(-0.01)));
        }
        else if (tickAnim >= 133 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 133) / 3) * (0-(0)));
            yy = -0.39 + (((tickAnim - 133) / 3) * (0.04-(-0.39)));
            zz = -0.21 + (((tickAnim - 133) / 3) * (0.14-(-0.21)));
        }
        else if (tickAnim >= 136 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 136) / 3) * (0-(0)));
            yy = 0.04 + (((tickAnim - 136) / 3) * (0.15-(0.04)));
            zz = 0.14 + (((tickAnim - 136) / 3) * (0.14-(0.14)));
        }
        else if (tickAnim >= 139 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 139) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 139) / 5) * (-0.23-(0.15)));
            zz = 0.14 + (((tickAnim - 139) / 5) * (-0.09-(0.14)));
        }
        else if (tickAnim >= 144 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 144) / 16) * (0-(0)));
            yy = -0.23 + (((tickAnim - 144) / 16) * (-0.2-(-0.23)));
            zz = -0.09 + (((tickAnim - 144) / 16) * (0-(-0.09)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.55556-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 35 + (((tickAnim - 3) / 5) * (-15-(35)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = -0.55556 + (((tickAnim - 3) / 5) * (-1-(-0.55556)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -15 + (((tickAnim - 8) / 3) * (-24.97532-(-15)));
            yy = 0 + (((tickAnim - 8) / 3) * (-0.12972-(0)));
            zz = -1 + (((tickAnim - 8) / 3) * (-0.67698-(-1)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -24.97532 + (((tickAnim - 11) / 2) * (-37-(-24.97532)));
            yy = -0.12972 + (((tickAnim - 11) / 2) * (0-(-0.12972)));
            zz = -0.67698 + (((tickAnim - 11) / 2) * (0-(-0.67698)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -37 + (((tickAnim - 13) / 3) * (-22-(-37)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -22 + (((tickAnim - 16) / 2) * (-17.99383-(-22)));
            yy = 0 + (((tickAnim - 16) / 2) * (-0.74485-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0.86146-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = -17.99383 + (((tickAnim - 18) / 11) * (-13.92254-(-17.99383)));
            yy = -0.74485 + (((tickAnim - 18) / 11) * (-0.73066-(-0.74485)));
            zz = 0.86146 + (((tickAnim - 18) / 11) * (1.32282-(0.86146)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = -13.92254 + (((tickAnim - 29) / 88) * (-10.98057-(-13.92254)));
            yy = -0.73066 + (((tickAnim - 29) / 88) * (-0.77517-(-0.73066)));
            zz = 1.32282 + (((tickAnim - 29) / 88) * (-0.13816-(1.32282)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = -10.98057 + (((tickAnim - 117) / 16) * (-19.93444-(-10.98057)));
            yy = -0.77517 + (((tickAnim - 117) / 16) * (-1.58427-(-0.77517)));
            zz = -0.13816 + (((tickAnim - 117) / 16) * (-1.05315-(-0.13816)));
        }
        else if (tickAnim >= 133 && tickAnim < 139) {
            xx = -19.93444 + (((tickAnim - 133) / 6) * (60.42621-(-19.93444)));
            yy = -1.58427 + (((tickAnim - 133) / 6) * (-1.23771-(-1.58427)));
            zz = -1.05315 + (((tickAnim - 133) / 6) * (-0.82278-(-1.05315)));
        }
        else if (tickAnim >= 139 && tickAnim < 144) {
            xx = 60.42621 + (((tickAnim - 139) / 5) * (10.8853-(60.42621)));
            yy = -1.23771 + (((tickAnim - 139) / 5) * (-6.41695-(-1.23771)));
            zz = -0.82278 + (((tickAnim - 139) / 5) * (2.69485-(-0.82278)));
        }
        else if (tickAnim >= 144 && tickAnim < 160) {
            xx = 10.8853 + (((tickAnim - 144) / 16) * (0-(10.8853)));
            yy = -6.41695 + (((tickAnim - 144) / 16) * (0-(-6.41695)));
            zz = 2.69485 + (((tickAnim - 144) / 16) * (0-(2.69485)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.33-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.33 + (((tickAnim - 16) / 2) * (0.2-(0.33)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 18) / 2) * (0.1-(0.2)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 20) / 3) * (0.2-(0.1)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = 0.2 + (((tickAnim - 23) / 6) * (0.52-(0.2)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            yy = 0.52 + (((tickAnim - 29) / 88) * (0.5-(0.52)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            yy = 0.5 + (((tickAnim - 117) / 16) * (0.3-(0.5)));
            zz = 0 + (((tickAnim - 117) / 16) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 133) / 11) * (0-(0)));
            yy = 0.3 + (((tickAnim - 133) / 11) * (0.46-(0.3)));
            zz = 0 + (((tickAnim - 133) / 11) * (-0.08-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 144) / 2) * (0-(0)));
            yy = 0.46 + (((tickAnim - 144) / 2) * (0.23-(0.46)));
            zz = -0.08 + (((tickAnim - 144) / 2) * (-0.09-(-0.08)));
        }
        else if (tickAnim >= 146 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 146) / 14) * (0-(0)));
            yy = 0.23 + (((tickAnim - 146) / 14) * (0.2-(0.23)));
            zz = -0.09 + (((tickAnim - 146) / 14) * (-0.2-(-0.09)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (27-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = -3 + (((tickAnim - 0) / 13) * (0-(-3)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 27 + (((tickAnim - 13) / 4) * (40-(27)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 40 + (((tickAnim - 17) / 10) * (-38.12058-(40)));
            yy = 0 + (((tickAnim - 17) / 10) * (-4.16037-(0)));
            zz = 0 + (((tickAnim - 17) / 10) * (-1.63998-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -38.12058 + (((tickAnim - 27) / 6) * (-47.02019-(-38.12058)));
            yy = -4.16037 + (((tickAnim - 27) / 6) * (-8.57463-(-4.16037)));
            zz = -1.63998 + (((tickAnim - 27) / 6) * (-2.9193-(-1.63998)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = -47.02019 + (((tickAnim - 33) / 84) * (-47.02019-(-47.02019)));
            yy = -8.57463 + (((tickAnim - 33) / 84) * (-8.57463-(-8.57463)));
            zz = -2.9193 + (((tickAnim - 33) / 84) * (-2.9193-(-2.9193)));
        }
        else if (tickAnim >= 117 && tickAnim < 136) {
            xx = -47.02019 + (((tickAnim - 117) / 19) * (0-(-47.02019)));
            yy = -8.57463 + (((tickAnim - 117) / 19) * (0-(-8.57463)));
            zz = -2.9193 + (((tickAnim - 117) / 19) * (0-(-2.9193)));
        }
        else if (tickAnim >= 136 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 136) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 136) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 24) * (-3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 17) * (0.6-(0.2)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0.6 + (((tickAnim - 17) / 6) * (1.85-(0.6)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 1.85 + (((tickAnim - 23) / 4) * (1.25-(1.85)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 1.25 + (((tickAnim - 27) / 6) * (0.75-(1.25)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0.75 + (((tickAnim - 33) / 84) * (0.75-(0.75)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 117) / 19) * (0-(0)));
            yy = 0.75 + (((tickAnim - 117) / 19) * (-0.45-(0.75)));
            zz = 0 + (((tickAnim - 117) / 19) * (-0.1-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 136) / 2) * (0-(0)));
            yy = -0.45 + (((tickAnim - 136) / 2) * (-0.55-(-0.45)));
            zz = -0.1 + (((tickAnim - 136) / 2) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 138 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 138) / 2) * (0-(0)));
            yy = -0.55 + (((tickAnim - 138) / 2) * (-0.355-(-0.55)));
            zz = -0.1 + (((tickAnim - 138) / 2) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 140 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 140) / 2) * (0-(0)));
            yy = -0.355 + (((tickAnim - 140) / 2) * (-0.33-(-0.355)));
            zz = -0.1 + (((tickAnim - 140) / 2) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 142 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 142) / 1) * (0-(0)));
            yy = -0.33 + (((tickAnim - 142) / 1) * (-0.41-(-0.33)));
            zz = -0.1 + (((tickAnim - 142) / 1) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 143 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 143) / 2) * (0-(0)));
            yy = -0.41 + (((tickAnim - 143) / 2) * (-0.43-(-0.41)));
            zz = -0.1 + (((tickAnim - 143) / 2) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 145 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 145) / 15) * (0-(0)));
            yy = -0.43 + (((tickAnim - 145) / 15) * (-0.175-(-0.43)));
            zz = -0.1 + (((tickAnim - 145) / 15) * (0-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft.rotationPointX = this.legleft.rotationPointX + (float)(xx);
        this.legleft.rotationPointY = this.legleft.rotationPointY - (float)(yy);
        this.legleft.rotationPointZ = this.legleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -3.25 + (((tickAnim - 8) / 5) * (-7-(-3.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -7 + (((tickAnim - 13) / 7) * (14-(-7)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 14 + (((tickAnim - 20) / 5) * (13-(14)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 13 + (((tickAnim - 25) / 7) * (24-(13)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 24 + (((tickAnim - 32) / 85) * (24-(24)));
            yy = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 85) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 129) {
            xx = 24 + (((tickAnim - 117) / 12) * (34.42-(24)));
            yy = 0 + (((tickAnim - 117) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 12) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 136) {
            xx = 34.42 + (((tickAnim - 129) / 7) * (-3-(34.42)));
            yy = 0 + (((tickAnim - 129) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 7) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 160) {
            xx = -3 + (((tickAnim - 136) / 24) * (0-(-3)));
            yy = 0 + (((tickAnim - 136) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 5) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0.2-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (-0.3-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0.2 + (((tickAnim - 20) / 8) * (0.5-(0.2)));
            zz = -0.3 + (((tickAnim - 20) / 8) * (0.3-(-0.3)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 28) / 4) * (0.5-(0.5)));
            zz = 0.3 + (((tickAnim - 28) / 4) * (0.8-(0.3)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 32) / 1) * (0.5-(0.5)));
            zz = 0.8 + (((tickAnim - 32) / 1) * (0.9-(0.8)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0.5 + (((tickAnim - 33) / 84) * (0.5-(0.5)));
            zz = 0.9 + (((tickAnim - 33) / 84) * (0.9-(0.9)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 117) / 8) * (0-(0)));
            yy = 0.5 + (((tickAnim - 117) / 8) * (0.64-(0.5)));
            zz = 0.9 + (((tickAnim - 117) / 8) * (0.65-(0.9)));
        }
        else if (tickAnim >= 125 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 125) / 11) * (0-(0)));
            yy = 0.64 + (((tickAnim - 125) / 11) * (1.25-(0.64)));
            zz = 0.65 + (((tickAnim - 125) / 11) * (-0.4-(0.65)));
        }
        else if (tickAnim >= 136 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 136) / 24) * (0-(0)));
            yy = 1.25 + (((tickAnim - 136) / 24) * (0-(1.25)));
            zz = -0.4 + (((tickAnim - 136) / 24) * (0-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 11 + (((tickAnim - 4) / 9) * (2-(11)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 2 + (((tickAnim - 13) / 5) * (30.24-(2)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 30.24 + (((tickAnim - 18) / 5) * (17.57-(30.24)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 17.57 + (((tickAnim - 23) / 4) * (10-(17.57)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 10 + (((tickAnim - 27) / 5) * (35.00575-(10)));
            yy = 0 + (((tickAnim - 27) / 5) * (1.10913-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (1.72251-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 35.00575 + (((tickAnim - 32) / 85) * (35.00575-(35.00575)));
            yy = 1.10913 + (((tickAnim - 32) / 85) * (1.10913-(1.10913)));
            zz = 1.72251 + (((tickAnim - 32) / 85) * (1.72251-(1.72251)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 35.00575 + (((tickAnim - 117) / 43) * (0-(35.00575)));
            yy = 1.10913 + (((tickAnim - 117) / 43) * (0-(1.10913)));
            zz = 1.72251 + (((tickAnim - 117) / 43) * (0-(1.72251)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.38-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.14-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.38 + (((tickAnim - 4) / 4) * (-0.2-(-0.38)));
            zz = 0.14 + (((tickAnim - 4) / 4) * (0.1-(0.14)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 5) * (-0.3-(-0.2)));
            zz = 0.1 + (((tickAnim - 8) / 5) * (-0.2-(0.1)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            yy = -0.3 + (((tickAnim - 13) / 14) * (0.7-(-0.3)));
            zz = -0.2 + (((tickAnim - 13) / 14) * (-0.1-(-0.2)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0.7 + (((tickAnim - 27) / 5) * (1.1-(0.7)));
            zz = -0.1 + (((tickAnim - 27) / 5) * (0.2-(-0.1)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            yy = 1.1 + (((tickAnim - 32) / 85) * (0.8-(1.1)));
            zz = 0.2 + (((tickAnim - 32) / 85) * (0.2-(0.2)));
        }
        else if (tickAnim >= 117 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 117) / 13) * (0-(0)));
            yy = 0.8 + (((tickAnim - 117) / 13) * (1.03-(0.8)));
            zz = 0.2 + (((tickAnim - 117) / 13) * (0.33-(0.2)));
        }
        else if (tickAnim >= 130 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 130) / 6) * (0-(0)));
            yy = 1.03 + (((tickAnim - 130) / 6) * (0.7-(1.03)));
            zz = 0.33 + (((tickAnim - 130) / 6) * (0.4-(0.33)));
        }
        else if (tickAnim >= 136 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 136) / 24) * (0-(0)));
            yy = 0.7 + (((tickAnim - 136) / 24) * (0-(0.7)));
            zz = 0.4 + (((tickAnim - 136) / 24) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2 + (((tickAnim - 0) / 4) * (-15.75-(2)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -15.75 + (((tickAnim - 4) / 5) * (-20.61-(-15.75)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -20.61 + (((tickAnim - 9) / 4) * (-24.99809-(-20.61)));
            yy = 0 + (((tickAnim - 9) / 4) * (-0.22494-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (-0.97438-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -24.99809 + (((tickAnim - 13) / 7) * (16-(-24.99809)));
            yy = -0.22494 + (((tickAnim - 13) / 7) * (0-(-0.22494)));
            zz = -0.97438 + (((tickAnim - 13) / 7) * (0-(-0.97438)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 16 + (((tickAnim - 20) / 3) * (-16-(16)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -16 + (((tickAnim - 23) / 2) * (-18.68-(-16)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -18.68 + (((tickAnim - 25) / 2) * (-16-(-18.68)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -16 + (((tickAnim - 27) / 1) * (-7-(-16)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 117) {
            xx = -7 + (((tickAnim - 28) / 89) * (-7-(-7)));
            yy = 0 + (((tickAnim - 28) / 89) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 89) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = -7 + (((tickAnim - 117) / 8) * (-12.61-(-7)));
            yy = 0 + (((tickAnim - 117) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 8) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 129) {
            xx = -12.61 + (((tickAnim - 125) / 4) * (-17.28-(-12.61)));
            yy = 0 + (((tickAnim - 125) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 4) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 136) {
            xx = -17.28 + (((tickAnim - 129) / 7) * (-16.03-(-17.28)));
            yy = 0 + (((tickAnim - 129) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 7) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 140) {
            xx = -16.03 + (((tickAnim - 136) / 4) * (-12-(-16.03)));
            yy = 0 + (((tickAnim - 136) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 4) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = -12 + (((tickAnim - 140) / 20) * (1-(-12)));
            yy = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.1 + (((tickAnim - 9) / 4) * (-0.24-(-0.1)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 13) / 19) * (0-(0)));
            yy = -0.24 + (((tickAnim - 13) / 19) * (0.2-(-0.24)));
            zz = 0 + (((tickAnim - 13) / 19) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            yy = 0.2 + (((tickAnim - 32) / 85) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 32) / 85) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 117) / 13) * (0-(0)));
            yy = 0.2 + (((tickAnim - 117) / 13) * (-0.04-(0.2)));
            zz = 0 + (((tickAnim - 117) / 13) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 130) / 6) * (0-(0)));
            yy = -0.04 + (((tickAnim - 130) / 6) * (0.44-(-0.04)));
            zz = 0 + (((tickAnim - 130) / 6) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 136) / 4) * (0-(0)));
            yy = 0.44 + (((tickAnim - 136) / 4) * (0.25-(0.44)));
            zz = 0 + (((tickAnim - 136) / 4) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            yy = 0.25 + (((tickAnim - 140) / 20) * (0.1-(0.25)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft4.rotationPointX = this.legleft4.rotationPointX + (float)(xx);
        this.legleft4.rotationPointY = this.legleft4.rotationPointY - (float)(yy);
        this.legleft4.rotationPointZ = this.legleft4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 0) / 33) * (-7.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 0) / 33) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 0) / 33) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = -7.25 + (((tickAnim - 33) / 84) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -7.25 + (((tickAnim - 117) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-7.25)));
            yy = 0 + (((tickAnim - 117) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = -0.4 + (((tickAnim - 117) / 43) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.rotationPointX = this.Tail1.rotationPointX + (float)(xx);
        this.Tail1.rotationPointY = this.Tail1.rotationPointY - (float)(yy);
        this.Tail1.rotationPointZ = this.Tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*3 + (((tickAnim - 0) / 33) * (3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*3)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*7.5 + (((tickAnim - 0) / 33) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*7.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*3 + (((tickAnim - 0) / 33) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*3)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 3 + (((tickAnim - 33) / 84) * (3-(3)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 3 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*3-(3)));
            yy = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*7.5-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 117) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2 + (((tickAnim - 0) / 117) * (5.5-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*10 + (((tickAnim - 0) / 117) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*3 + (((tickAnim - 0) / 117) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*3)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 5.5 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2-(5.5)));
            yy = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*10-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 117) {
            xx = 5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*2 + (((tickAnim - 0) / 117) * (-0.75-(5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*10 + (((tickAnim - 0) / 117) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3 + (((tickAnim - 0) / 117) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -0.75 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*2-(-0.75)));
            yy = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*10-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-50))*3-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 7) / 13) * (3-(0)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-50))*3 + (((tickAnim - 7) / 13) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-50))*3)));
        }
        else if (tickAnim >= 20 && tickAnim < 117) {
            xx = 3 + (((tickAnim - 20) / 97) * (3-(3)));
            yy = 0 + (((tickAnim - 20) / 97) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 97) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 3 + (((tickAnim - 117) / 43) * (0-(3)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 16) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 19) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 28) / 1) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 29) / 2) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 31) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = -0.2 + (((tickAnim - 117) / 43) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-40-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -40 + (((tickAnim - 10) / 3) * (-31.34436-(-40)));
            yy = 0 + (((tickAnim - 10) / 3) * (2.7498-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-2.25841-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -31.34436 + (((tickAnim - 13) / 5) * (-5.26625-(-31.34436)));
            yy = 2.7498 + (((tickAnim - 13) / 5) * (-0.57627-(2.7498)));
            zz = -2.25841 + (((tickAnim - 13) / 5) * (-7.07087-(-2.25841)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -5.26625 + (((tickAnim - 18) / 3) * (27.63512-(-5.26625)));
            yy = -0.57627 + (((tickAnim - 18) / 3) * (3.71223-(-0.57627)));
            zz = -7.07087 + (((tickAnim - 18) / 3) * (-3.04886-(-7.07087)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 27.63512 + (((tickAnim - 21) / 4) * (30-(27.63512)));
            yy = 3.71223 + (((tickAnim - 21) / 4) * (0-(3.71223)));
            zz = -3.04886 + (((tickAnim - 21) / 4) * (0-(-3.04886)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 30 + (((tickAnim - 25) / 2) * (29-(30)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 29 + (((tickAnim - 27) / 2) * (31-(29)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 31 + (((tickAnim - 29) / 88) * (32.0968-(31)));
            yy = 0 + (((tickAnim - 29) / 88) * (2.59146-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (4.27748-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = 32.0968 + (((tickAnim - 117) / 6) * (28.19418-(32.0968)));
            yy = 2.59146 + (((tickAnim - 117) / 6) * (-3.79706-(2.59146)));
            zz = 4.27748 + (((tickAnim - 117) / 6) * (5.91482-(4.27748)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 28.19418 + (((tickAnim - 123) / 5) * (3.06208-(28.19418)));
            yy = -3.79706 + (((tickAnim - 123) / 5) * (1.55488-(-3.79706)));
            zz = 5.91482 + (((tickAnim - 123) / 5) * (2.56649-(5.91482)));
        }
        else if (tickAnim >= 128 && tickAnim < 145) {
            xx = 3.06208 + (((tickAnim - 128) / 17) * (0.10865-(3.06208)));
            yy = 1.55488 + (((tickAnim - 128) / 17) * (-9.69232-(1.55488)));
            zz = 2.56649 + (((tickAnim - 128) / 17) * (16.70221-(2.56649)));
        }
        else if (tickAnim >= 145 && tickAnim < 152) {
            xx = 0.10865 + (((tickAnim - 145) / 7) * (11.72274-(0.10865)));
            yy = -9.69232 + (((tickAnim - 145) / 7) * (-2.63698-(-9.69232)));
            zz = 16.70221 + (((tickAnim - 145) / 7) * (4.54415-(16.70221)));
        }
        else if (tickAnim >= 152 && tickAnim < 160) {
            xx = 11.72274 + (((tickAnim - 152) / 8) * (0-(11.72274)));
            yy = -2.63698 + (((tickAnim - 152) / 8) * (0-(-2.63698)));
            zz = 4.54415 + (((tickAnim - 152) / 8) * (0-(4.54415)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 10) * (-1.2-(-0.4)));
            zz = 0.4 + (((tickAnim - 0) / 10) * (0.4-(0.4)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -1.2 + (((tickAnim - 10) / 3) * (-0.695-(-1.2)));
            zz = 0.4 + (((tickAnim - 10) / 3) * (0.49-(0.4)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.695 + (((tickAnim - 13) / 5) * (0.325-(-0.695)));
            zz = 0.49 + (((tickAnim - 13) / 5) * (0.66-(0.49)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.325 + (((tickAnim - 18) / 3) * (0.25-(0.325)));
            zz = 0.66 + (((tickAnim - 18) / 3) * (0.1-(0.66)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 21) / 4) * (0.5-(0.25)));
            zz = 0.1 + (((tickAnim - 21) / 4) * (0.3-(0.1)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 25) / 2) * (0.4-(0.5)));
            zz = 0.3 + (((tickAnim - 25) / 2) * (0.3-(0.3)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 27) / 1) * (0.3-(0.4)));
            zz = 0.3 + (((tickAnim - 27) / 1) * (0.3-(0.3)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 28) / 1) * (0.4-(0.3)));
            zz = 0.3 + (((tickAnim - 28) / 1) * (0.3-(0.3)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 29) / 2) * (0.3-(0.4)));
            zz = 0.3 + (((tickAnim - 29) / 2) * (0.3-(0.3)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 31) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 31) / 1) * (0.4-(0.3)));
            zz = 0.3 + (((tickAnim - 31) / 1) * (0.3-(0.3)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            yy = 0.4 + (((tickAnim - 32) / 85) * (0.3-(0.4)));
            zz = 0.3 + (((tickAnim - 32) / 85) * (0.3-(0.3)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            yy = 0.3 + (((tickAnim - 117) / 11) * (1.44-(0.3)));
            zz = 0.3 + (((tickAnim - 117) / 11) * (1.58-(0.3)));
        }
        else if (tickAnim >= 128 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 128) / 1) * (0-(0)));
            yy = 1.44 + (((tickAnim - 128) / 1) * (1.26-(1.44)));
            zz = 1.58 + (((tickAnim - 128) / 1) * (1.5-(1.58)));
        }
        else if (tickAnim >= 129 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 129) / 2) * (0-(0)));
            yy = 1.26 + (((tickAnim - 129) / 2) * (1.29-(1.26)));
            zz = 1.5 + (((tickAnim - 129) / 2) * (1.42-(1.5)));
        }
        else if (tickAnim >= 131 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 131) / 2) * (0-(0)));
            yy = 1.29 + (((tickAnim - 131) / 2) * (1.01-(1.29)));
            zz = 1.42 + (((tickAnim - 131) / 2) * (1.34-(1.42)));
        }
        else if (tickAnim >= 133 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 133) / 1) * (0-(0)));
            yy = 1.01 + (((tickAnim - 133) / 1) * (1.04-(1.01)));
            zz = 1.34 + (((tickAnim - 133) / 1) * (1.26-(1.34)));
        }
        else if (tickAnim >= 134 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 134) / 26) * (0-(0)));
            yy = 1.04 + (((tickAnim - 134) / 26) * (-0.1-(1.04)));
            zz = 1.26 + (((tickAnim - 134) / 26) * (0.1-(1.26)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright.rotationPointX = this.armright.rotationPointX + (float)(xx);
        this.armright.rotationPointY = this.armright.rotationPointY - (float)(yy);
        this.armright.rotationPointZ = this.armright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.29-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -1.29 + (((tickAnim - 5) / 7) * (-17-(-1.29)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -17 + (((tickAnim - 12) / 5) * (-54.35-(-17)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -54.35 + (((tickAnim - 17) / 7) * (-17-(-54.35)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 117) {
            xx = -17 + (((tickAnim - 24) / 93) * (-12-(-17)));
            yy = 0 + (((tickAnim - 24) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 93) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 124) {
            xx = -12 + (((tickAnim - 117) / 7) * (-44.32428-(-12)));
            yy = 0 + (((tickAnim - 117) / 7) * (-2.63157-(0)));
            zz = 0 + (((tickAnim - 117) / 7) * (-0.89032-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 128) {
            xx = -44.32428 + (((tickAnim - 124) / 4) * (-28.78371-(-44.32428)));
            yy = -2.63157 + (((tickAnim - 124) / 4) * (-4.73683-(-2.63157)));
            zz = -0.89032 + (((tickAnim - 124) / 4) * (-1.60258-(-0.89032)));
        }
        else if (tickAnim >= 128 && tickAnim < 133) {
            xx = -28.78371 + (((tickAnim - 128) / 5) * (-23.54851-(-28.78371)));
            yy = -4.73683 + (((tickAnim - 128) / 5) * (-5.30773-(-4.73683)));
            zz = -1.60258 + (((tickAnim - 128) / 5) * (-3.04499-(-1.60258)));
        }
        else if (tickAnim >= 133 && tickAnim < 140) {
            xx = -23.54851 + (((tickAnim - 133) / 7) * (-16.66138-(-23.54851)));
            yy = -5.30773 + (((tickAnim - 133) / 7) * (-3.9808-(-5.30773)));
            zz = -3.04499 + (((tickAnim - 133) / 7) * (-2.28374-(-3.04499)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = -16.66138 + (((tickAnim - 140) / 5) * (-12.39571-(-16.66138)));
            yy = -3.9808 + (((tickAnim - 140) / 5) * (-2.47897-(-3.9808)));
            zz = -2.28374 + (((tickAnim - 140) / 5) * (-11.1353-(-2.28374)));
        }
        else if (tickAnim >= 145 && tickAnim < 152) {
            xx = -12.39571 + (((tickAnim - 145) / 7) * (-40.79337-(-12.39571)));
            yy = -2.47897 + (((tickAnim - 145) / 7) * (-0.0007-(-2.47897)));
            zz = -11.1353 + (((tickAnim - 145) / 7) * (-0.00314-(-11.1353)));
        }
        else if (tickAnim >= 152 && tickAnim < 160) {
            xx = -40.79337 + (((tickAnim - 152) / 8) * (0-(-40.79337)));
            yy = -0.0007 + (((tickAnim - 152) / 8) * (0-(-0.0007)));
            zz = -0.00314 + (((tickAnim - 152) / 8) * (0-(-0.00314)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 12) / 5) * (-0.08-(0.2)));
            zz = 0 + (((tickAnim - 12) / 5) * (0.35-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            yy = -0.08 + (((tickAnim - 17) / 7) * (0.01-(-0.08)));
            zz = 0.35 + (((tickAnim - 17) / 7) * (-0.01-(0.35)));
        }
        else if (tickAnim >= 24 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 24) / 93) * (0-(0)));
            yy = 0.01 + (((tickAnim - 24) / 93) * (0.51-(0.01)));
            zz = -0.01 + (((tickAnim - 24) / 93) * (-0.01-(-0.01)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 117) / 6) * (0-(0)));
            yy = 0.51 + (((tickAnim - 117) / 6) * (0.39-(0.51)));
            zz = -0.01 + (((tickAnim - 117) / 6) * (0.42-(-0.01)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 123) / 5) * (0-(0)));
            yy = 0.39 + (((tickAnim - 123) / 5) * (0.14-(0.39)));
            zz = 0.42 + (((tickAnim - 123) / 5) * (0.39-(0.42)));
        }
        else if (tickAnim >= 128 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 128) / 32) * (0-(0)));
            yy = 0.14 + (((tickAnim - 128) / 32) * (-0.2-(0.14)));
            zz = 0.39 + (((tickAnim - 128) / 32) * (0-(0.39)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (40.86-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 40.86 + (((tickAnim - 8) / 5) * (53-(40.86)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 53 + (((tickAnim - 13) / 6) * (-10.33-(53)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -10.33 + (((tickAnim - 19) / 4) * (-19.33-(-10.33)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -19.33 + (((tickAnim - 23) / 4) * (-17.33-(-19.33)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -17.33 + (((tickAnim - 27) / 2) * (-14.33-(-17.33)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = -14.33 + (((tickAnim - 29) / 88) * (-17.29966-(-14.33)));
            yy = 0 + (((tickAnim - 29) / 88) * (-0.7019-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (-4.95061-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 124) {
            xx = -17.29966 + (((tickAnim - 117) / 7) * (0-(-17.29966)));
            yy = -0.7019 + (((tickAnim - 117) / 7) * (0-(-0.7019)));
            zz = -4.95061 + (((tickAnim - 117) / 7) * (0-(-4.95061)));
        }
        else if (tickAnim >= 124 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 124) / 4) * (28.85-(0)));
            yy = 0 + (((tickAnim - 124) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 4) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 130) {
            xx = 28.85 + (((tickAnim - 128) / 2) * (25.2637-(28.85)));
            yy = 0 + (((tickAnim - 128) / 2) * (1.13352-(0)));
            zz = 0 + (((tickAnim - 128) / 2) * (-1.64787-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 25.2637 + (((tickAnim - 130) / 10) * (17.25654-(25.2637)));
            yy = 1.13352 + (((tickAnim - 130) / 10) * (8.95221-(1.13352)));
            zz = -1.64787 + (((tickAnim - 130) / 10) * (-4.49939-(-1.64787)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = 17.25654 + (((tickAnim - 140) / 5) * (12-(17.25654)));
            yy = 8.95221 + (((tickAnim - 140) / 5) * (0-(8.95221)));
            zz = -4.49939 + (((tickAnim - 140) / 5) * (0-(-4.49939)));
        }
        else if (tickAnim >= 145 && tickAnim < 152) {
            xx = 12 + (((tickAnim - 145) / 7) * (46.69038-(12)));
            yy = 0 + (((tickAnim - 145) / 7) * (2.17904-(0)));
            zz = 0 + (((tickAnim - 145) / 7) * (-0.72817-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 160) {
            xx = 46.69038 + (((tickAnim - 152) / 8) * (0-(46.69038)));
            yy = 2.17904 + (((tickAnim - 152) / 8) * (0-(2.17904)));
            zz = -0.72817 + (((tickAnim - 152) / 8) * (0-(-0.72817)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0.3 + (((tickAnim - 3) / 10) * (0.12-(0.3)));
            zz = 0 + (((tickAnim - 3) / 10) * (-0.1-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0.12 + (((tickAnim - 13) / 6) * (0.36-(0.12)));
            zz = -0.1 + (((tickAnim - 13) / 6) * (0-(-0.1)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.36 + (((tickAnim - 19) / 4) * (0.36-(0.36)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0.36 + (((tickAnim - 23) / 4) * (0.26-(0.36)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0.26 + (((tickAnim - 27) / 2) * (0.35-(0.26)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            yy = 0.35 + (((tickAnim - 29) / 88) * (0.425-(0.35)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 117) / 5) * (0-(0)));
            yy = 0.425 + (((tickAnim - 117) / 5) * (0.2-(0.425)));
            zz = 0 + (((tickAnim - 117) / 5) * (-0.01-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 122) / 6) * (0-(0)));
            yy = 0.2 + (((tickAnim - 122) / 6) * (-0.18-(0.2)));
            zz = -0.01 + (((tickAnim - 122) / 6) * (-0.05-(-0.01)));
        }
        else if (tickAnim >= 128 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 128) / 12) * (0-(0)));
            yy = -0.18 + (((tickAnim - 128) / 12) * (0.17-(-0.18)));
            zz = -0.05 + (((tickAnim - 128) / 12) * (-0.15-(-0.05)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            yy = 0.17 + (((tickAnim - 140) / 20) * (0.3-(0.17)));
            zz = -0.15 + (((tickAnim - 140) / 20) * (-0.3-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 29 + (((tickAnim - 0) / 5) * (-21-(29)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -21 + (((tickAnim - 5) / 4) * (-38-(-21)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -38 + (((tickAnim - 9) / 5) * (-62-(-38)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = -62 + (((tickAnim - 14) / 9) * (-61.95651-(-62)));
            yy = 0 + (((tickAnim - 14) / 9) * (5.9414-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0.83804-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 117) {
            xx = -61.95651 + (((tickAnim - 23) / 94) * (-61.87822-(-61.95651)));
            yy = 5.9414 + (((tickAnim - 23) / 94) * (9.9017-(5.9414)));
            zz = 0.83804 + (((tickAnim - 23) / 94) * (1.40575-(0.83804)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = -61.87822 + (((tickAnim - 117) / 21) * (-41.87822-(-61.87822)));
            yy = 9.9017 + (((tickAnim - 117) / 21) * (9.9017-(9.9017)));
            zz = 1.40575 + (((tickAnim - 117) / 21) * (1.40575-(1.40575)));
        }
        else if (tickAnim >= 138 && tickAnim < 149) {
            xx = -41.87822 + (((tickAnim - 138) / 11) * (0-(-41.87822)));
            yy = 9.9017 + (((tickAnim - 138) / 11) * (0-(9.9017)));
            zz = 1.40575 + (((tickAnim - 138) / 11) * (0-(1.40575)));
        }
        else if (tickAnim >= 149 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 149) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 149) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0.4-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = -0.275 + (((tickAnim - 14) / 1) * (-0.455-(-0.275)));
            zz = 0.4 + (((tickAnim - 14) / 1) * (0.4-(0.4)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = -0.455 + (((tickAnim - 15) / 1) * (-0.445-(-0.455)));
            zz = 0.4 + (((tickAnim - 15) / 1) * (0.4-(0.4)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = -0.445 + (((tickAnim - 16) / 1) * (-0.49-(-0.445)));
            zz = 0.4 + (((tickAnim - 16) / 1) * (0.4-(0.4)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = -0.49 + (((tickAnim - 17) / 1) * (-0.33-(-0.49)));
            zz = 0.4 + (((tickAnim - 17) / 1) * (0.4-(0.4)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -0.33 + (((tickAnim - 18) / 15) * (0.9-(-0.33)));
            zz = 0.4 + (((tickAnim - 18) / 15) * (0.4-(0.4)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0.9 + (((tickAnim - 33) / 84) * (0.9-(0.9)));
            zz = 0.4 + (((tickAnim - 33) / 84) * (0.4-(0.4)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            yy = 0.9 + (((tickAnim - 117) / 16) * (-0.225-(0.9)));
            zz = 0.4 + (((tickAnim - 117) / 16) * (-0.22-(0.4)));
        }
        else if (tickAnim >= 133 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 133) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 133) / 3) * (-0.36-(-0.225)));
            zz = -0.22 + (((tickAnim - 133) / 3) * (-0.31-(-0.22)));
        }
        else if (tickAnim >= 136 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 136) / 8) * (0-(0)));
            yy = -0.36 + (((tickAnim - 136) / 8) * (0.85-(-0.36)));
            zz = -0.31 + (((tickAnim - 136) / 8) * (-0.2-(-0.31)));
        }
        else if (tickAnim >= 144 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 144) / 5) * (0-(0)));
            yy = 0.85 + (((tickAnim - 144) / 5) * (-0.95-(0.85)));
            zz = -0.2 + (((tickAnim - 144) / 5) * (0-(-0.2)));
        }
        else if (tickAnim >= 149 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 149) / 2) * (0-(0)));
            yy = -0.95 + (((tickAnim - 149) / 2) * (-0.975-(-0.95)));
            zz = 0 + (((tickAnim - 149) / 2) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 151) / 2) * (0-(0)));
            yy = -0.975 + (((tickAnim - 151) / 2) * (-0.77-(-0.975)));
            zz = 0 + (((tickAnim - 151) / 2) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 153) / 1) * (0-(0)));
            yy = -0.77 + (((tickAnim - 153) / 1) * (-0.715-(-0.77)));
            zz = 0 + (((tickAnim - 153) / 1) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 154) / 2) * (0-(0)));
            yy = -0.715 + (((tickAnim - 154) / 2) * (-0.36-(-0.715)));
            zz = 0 + (((tickAnim - 154) / 2) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 156) / 4) * (0-(0)));
            yy = -0.36 + (((tickAnim - 156) / 4) * (0-(-0.36)));
            zz = 0 + (((tickAnim - 156) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright.rotationPointX = this.legright.rotationPointX + (float)(xx);
        this.legright.rotationPointY = this.legright.rotationPointY - (float)(yy);
        this.legright.rotationPointZ = this.legright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (28-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 28 + (((tickAnim - 5) / 4) * (22-(28)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 22 + (((tickAnim - 9) / 5) * (39-(22)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 117) {
            xx = 39 + (((tickAnim - 14) / 103) * (39-(39)));
            yy = 0 + (((tickAnim - 14) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 103) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 39 + (((tickAnim - 117) / 21) * (28.13-(39)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 144) {
            xx = 28.13 + (((tickAnim - 138) / 6) * (35.8-(28.13)));
            yy = 0 + (((tickAnim - 138) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 6) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 149) {
            xx = 35.8 + (((tickAnim - 144) / 5) * (3-(35.8)));
            yy = 0 + (((tickAnim - 144) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 5) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 160) {
            xx = 3 + (((tickAnim - 149) / 11) * (0-(3)));
            yy = 0 + (((tickAnim - 149) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 1.8 + (((tickAnim - 13) / 0) * (1.94-(1.8)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 1.94 + (((tickAnim - 13) / 1) * (2.16-(1.94)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 2.16 + (((tickAnim - 14) / 2) * (1.98-(2.16)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 1.98 + (((tickAnim - 16) / 2) * (2.07-(1.98)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 2.07 + (((tickAnim - 18) / 5) * (2.1-(2.07)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 2.1 + (((tickAnim - 23) / 8) * (2.1-(2.1)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 2.1 + (((tickAnim - 31) / 86) * (2.1-(2.1)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 21) * (0.15-(0)));
            zz = 2.1 + (((tickAnim - 117) / 21) * (1.81-(2.1)));
        }
        else if (tickAnim >= 138 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 138) / 11) * (0-(0)));
            yy = 0.15 + (((tickAnim - 138) / 11) * (0.2-(0.15)));
            zz = 1.81 + (((tickAnim - 138) / 11) * (-0.21-(1.81)));
        }
        else if (tickAnim >= 149 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 149) / 11) * (0-(0)));
            yy = 0.2 + (((tickAnim - 149) / 11) * (0-(0.2)));
            zz = -0.21 + (((tickAnim - 149) / 11) * (0-(-0.21)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 37 + (((tickAnim - 0) / 5) * (-1-(37)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -1 + (((tickAnim - 5) / 4) * (-2-(-1)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -2 + (((tickAnim - 9) / 5) * (33-(-2)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 33 + (((tickAnim - 14) / 9) * (34-(33)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 117) {
            xx = 34 + (((tickAnim - 23) / 94) * (34-(34)));
            yy = 0 + (((tickAnim - 23) / 94) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 94) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 34 + (((tickAnim - 117) / 21) * (26-(34)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 144) {
            xx = 26 + (((tickAnim - 138) / 6) * (-5.42-(26)));
            yy = 0 + (((tickAnim - 138) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 6) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 149) {
            xx = -5.42 + (((tickAnim - 144) / 5) * (8-(-5.42)));
            yy = 0 + (((tickAnim - 144) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 5) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 160) {
            xx = 8 + (((tickAnim - 149) / 11) * (0-(8)));
            yy = 0 + (((tickAnim - 149) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.18-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0.18 + (((tickAnim - 9) / 5) * (0.4-(0.18)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0.4 + (((tickAnim - 14) / 9) * (0.9-(0.4)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 0.9 + (((tickAnim - 23) / 8) * (1.1-(0.9)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = 1.1 + (((tickAnim - 31) / 86) * (1.1-(1.1)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            yy = 1.1 + (((tickAnim - 117) / 21) * (1.1-(1.1)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 138) / 11) * (0-(0)));
            yy = 1.1 + (((tickAnim - 138) / 11) * (0.61-(1.1)));
            zz = 0 + (((tickAnim - 138) / 11) * (0.5-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 149) / 11) * (0-(0)));
            yy = 0.61 + (((tickAnim - 149) / 11) * (0-(0.61)));
            zz = 0.5 + (((tickAnim - 149) / 11) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 0) / 13) * (-9-(10)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -9 + (((tickAnim - 13) / 10) * (-9.43-(-9)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -9.43 + (((tickAnim - 23) / 9) * (-6-(-9.43)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = -6 + (((tickAnim - 32) / 85) * (-8-(-6)));
            yy = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 85) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = -8 + (((tickAnim - 117) / 21) * (-9-(-8)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = -9 + (((tickAnim - 138) / 5) * (4.1-(-9)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 149) {
            xx = 4.1 + (((tickAnim - 143) / 6) * (-14.55-(4.1)));
            yy = 0 + (((tickAnim - 143) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 6) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 153) {
            xx = -14.55 + (((tickAnim - 149) / 4) * (-6.25-(-14.55)));
            yy = 0 + (((tickAnim - 149) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 4) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 160) {
            xx = -6.25 + (((tickAnim - 153) / 7) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 153) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.41-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 3) / 20) * (0-(0)));
            yy = 0.41 + (((tickAnim - 3) / 20) * (0.2-(0.41)));
            zz = 0 + (((tickAnim - 3) / 20) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 0.2 + (((tickAnim - 23) / 9) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            yy = 0.2 + (((tickAnim - 32) / 85) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 32) / 85) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            yy = 0.2 + (((tickAnim - 117) / 21) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 138) / 22) * (0-(0)));
            yy = 0.2 + (((tickAnim - 138) / 22) * (0-(0.2)));
            zz = 0 + (((tickAnim - 138) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright4.rotationPointX = this.legright4.rotationPointX + (float)(xx);
        this.legright4.rotationPointY = this.legright4.rotationPointY - (float)(yy);
        this.legright4.rotationPointZ = this.legright4.rotationPointZ + (float)(zz);

    }

    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGargoyleosaurus entity = (EntityPrehistoricFloraGargoyleosaurus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = -15 + (((tickAnim - 13) / 11) * (-15-(-15)));
            yy = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = -15 + (((tickAnim - 24) / 12) * (-5.13949-(-15)));
            yy = 0 + (((tickAnim - 24) / 12) * (26.92837-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (-5.79894-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = -5.13949 + (((tickAnim - 36) / 12) * (-5.13949-(-5.13949)));
            yy = 26.92837 + (((tickAnim - 36) / 12) * (26.92837-(26.92837)));
            zz = -5.79894 + (((tickAnim - 36) / 12) * (-5.79894-(-5.79894)));
        }
        else if (tickAnim >= 48 && tickAnim < 62) {
            xx = -5.13949 + (((tickAnim - 48) / 14) * (-2.63689-(-5.13949)));
            yy = 26.92837 + (((tickAnim - 48) / 14) * (-27.39795-(26.92837)));
            zz = -5.79894 + (((tickAnim - 48) / 14) * (-0.96996-(-5.79894)));
        }
        else if (tickAnim >= 62 && tickAnim < 73) {
            xx = -2.63689 + (((tickAnim - 62) / 11) * (-2.63689-(-2.63689)));
            yy = -27.39795 + (((tickAnim - 62) / 11) * (-27.39795-(-27.39795)));
            zz = -0.96996 + (((tickAnim - 62) / 11) * (-0.96996-(-0.96996)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -2.63689 + (((tickAnim - 73) / 7) * (0-(-2.63689)));
            yy = -27.39795 + (((tickAnim - 73) / 7) * (0-(-27.39795)));
            zz = -0.96996 + (((tickAnim - 73) / 7) * (0-(-0.96996)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 16.25 + (((tickAnim - 4) / 9) * (15-(16.25)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 15 + (((tickAnim - 13) / 7) * (17.5-(15)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 17.5 + (((tickAnim - 20) / 4) * (15-(17.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 15 + (((tickAnim - 24) / 6) * (8.38859-(15)));
            yy = 0 + (((tickAnim - 24) / 6) * (-7.40306-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (1.28505-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 8.38859 + (((tickAnim - 30) / 6) * (-1.6257-(8.38859)));
            yy = -7.40306 + (((tickAnim - 30) / 6) * (12.41216-(-7.40306)));
            zz = 1.28505 + (((tickAnim - 30) / 6) * (7.75327-(1.28505)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = -1.6257 + (((tickAnim - 36) / 6) * (-4.1257-(-1.6257)));
            yy = 12.41216 + (((tickAnim - 36) / 6) * (12.41216-(12.41216)));
            zz = 7.75327 + (((tickAnim - 36) / 6) * (7.75327-(7.75327)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = -4.1257 + (((tickAnim - 42) / 6) * (-1.6257-(-4.1257)));
            yy = 12.41216 + (((tickAnim - 42) / 6) * (12.41216-(12.41216)));
            zz = 7.75327 + (((tickAnim - 42) / 6) * (7.75327-(7.75327)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -1.6257 + (((tickAnim - 48) / 5) * (2.22716-(-1.6257)));
            yy = 12.41216 + (((tickAnim - 48) / 5) * (8.99507-(12.41216)));
            zz = 7.75327 + (((tickAnim - 48) / 5) * (3.56098-(7.75327)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 2.22716 + (((tickAnim - 53) / 9) * (7.56829-(2.22716)));
            yy = 8.99507 + (((tickAnim - 53) / 9) * (-7.7799-(8.99507)));
            zz = 3.56098 + (((tickAnim - 53) / 9) * (-2.77511-(3.56098)));
        }
        else if (tickAnim >= 62 && tickAnim < 67) {
            xx = 7.56829 + (((tickAnim - 62) / 5) * (10.06829-(7.56829)));
            yy = -7.7799 + (((tickAnim - 62) / 5) * (-7.7799-(-7.7799)));
            zz = -2.77511 + (((tickAnim - 62) / 5) * (-2.77511-(-2.77511)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = 10.06829 + (((tickAnim - 67) / 6) * (7.56829-(10.06829)));
            yy = -7.7799 + (((tickAnim - 67) / 6) * (-7.7799-(-7.7799)));
            zz = -2.77511 + (((tickAnim - 67) / 6) * (-2.77511-(-2.77511)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 7.56829 + (((tickAnim - 73) / 7) * (0-(7.56829)));
            yy = -7.7799 + (((tickAnim - 73) / 7) * (0-(-7.7799)));
            zz = -2.77511 + (((tickAnim - 73) / 7) * (0-(-2.77511)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-13.33-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -13.33 + (((tickAnim - 8) / 5) * (-10-(-13.33)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 13) / 5) * (-5-(-10)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -5 + (((tickAnim - 18) / 6) * (-10-(-5)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -10 + (((tickAnim - 24) / 8) * (-8.8-(-10)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -8.8 + (((tickAnim - 32) / 4) * (4.5-(-8.8)));
            yy = 0 + (((tickAnim - 32) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 4) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 4.5 + (((tickAnim - 36) / 4) * (9.5-(4.5)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 9.5 + (((tickAnim - 40) / 3) * (3.07-(9.5)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 3.07 + (((tickAnim - 43) / 2) * (9.5-(3.07)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 9.5 + (((tickAnim - 45) / 3) * (4.5-(9.5)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 4.5 + (((tickAnim - 48) / 4) * (9.5-(4.5)));
            yy = 0 + (((tickAnim - 48) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 4) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = 9.5 + (((tickAnim - 52) / 3) * (3.07-(9.5)));
            yy = 0 + (((tickAnim - 52) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 3) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 3.07 + (((tickAnim - 55) / 3) * (9.5-(3.07)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = 9.5 + (((tickAnim - 58) / 4) * (-4.87209-(9.5)));
            yy = 0 + (((tickAnim - 58) / 4) * (-0.22983-(0)));
            zz = 0 + (((tickAnim - 58) / 4) * (4.99473-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 73) {
            xx = -4.87209 + (((tickAnim - 62) / 11) * (-4.87209-(-4.87209)));
            yy = -0.22983 + (((tickAnim - 62) / 11) * (-0.22983-(-0.22983)));
            zz = 4.99473 + (((tickAnim - 62) / 11) * (4.99473-(4.99473)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -4.87209 + (((tickAnim - 73) / 7) * (0-(-4.87209)));
            yy = -0.22983 + (((tickAnim - 73) / 7) * (0-(-0.22983)));
            zz = 4.99473 + (((tickAnim - 73) / 7) * (0-(4.99473)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


    }


    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGargoyleosaurus entity = (EntityPrehistoricFloraGargoyleosaurus) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-10))*3), main.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+10))*3), main.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+10))*3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 1) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3 + (((tickAnim - 1) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 1) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);



        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+10))*-3), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-5), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);










        if (tickAnim >= 11 && tickAnim < 15) {
            xx = -4.69154 + (((tickAnim - 11) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75-40))*-3-(-4.69154)));
            yy = -4.66982 + (((tickAnim - 11) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+30))*5-(-4.66982)));
            zz = 2.2011 + (((tickAnim - 11) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+30))*-3-(2.2011)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3 + (((tickAnim - 13) / 0) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Chest.rotationPointX = this.Chest.rotationPointX + (float)(xx);
        this.Chest.rotationPointY = this.Chest.rotationPointY - (float)(yy);
        this.Chest.rotationPointZ = this.Chest.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+60))*5), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*-5), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*3));

        if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 13) / 0) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(xx);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(yy);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-3), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+60))*-5), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+60))*3));

        if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 13) / 0) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(xx);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(yy);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(zz);



        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-70))*3), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(11.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*-6), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 15 + (((tickAnim - 0) / 2) * (25.83333-(15)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 2) * (-5-(-5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 25.83333 + (((tickAnim - 2) / 1) * (27.5-(25.83333)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 2) / 1) * (-5-(-5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27.5 + (((tickAnim - 3) / 2) * (32.5-(27.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (10-(0)));
            zz = -5 + (((tickAnim - 3) / 2) * (-10-(-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 32.5 + (((tickAnim - 5) / 3) * (-17.5-(32.5)));
            yy = 10 + (((tickAnim - 5) / 3) * (10-(10)));
            zz = -10 + (((tickAnim - 5) / 3) * (-15-(-10)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -17.5 + (((tickAnim - 8) / 2) * (-25-(-17.5)));
            yy = 10 + (((tickAnim - 8) / 2) * (5-(10)));
            zz = -15 + (((tickAnim - 8) / 2) * (-10-(-15)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -25 + (((tickAnim - 10) / 1) * (-12.5-(-25)));
            yy = 5 + (((tickAnim - 10) / 1) * (3.33333-(5)));
            zz = -10 + (((tickAnim - 10) / 1) * (-8.33333-(-10)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -12.5 + (((tickAnim - 11) / 2) * (-2.5-(-12.5)));
            yy = 3.33333 + (((tickAnim - 11) / 2) * (0-(3.33333)));
            zz = -8.33333 + (((tickAnim - 11) / 2) * (-5-(-8.33333)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -2.5 + (((tickAnim - 13) / 2) * (15-(-2.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 13) / 2) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0.4 + (((tickAnim - 0) / 2) * (0.53-(0.4)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0.53 + (((tickAnim - 2) / 1) * (0.5-(0.53)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0.5 + (((tickAnim - 3) / 2) * (0.5-(0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0.5 + (((tickAnim - 5) / 3) * (0-(0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.4-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 10) / 1) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(0.4)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 11) / 1) * (-0.28-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = 0 + (((tickAnim - 11) / 1) * (0.1-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.28 + (((tickAnim - 12) / 1) * (-0.5-(-0.28)));
            zz = 0.1 + (((tickAnim - 12) / 1) * (0.3-(0.1)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = -0.5 + (((tickAnim - 13) / 0) * (-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(-0.5)));
            zz = 0.3 + (((tickAnim - 13) / 0) * (0.6-(0.3)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 13) / 2) * (0-(-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0.6 + (((tickAnim - 13) / 2) * (0.4-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft.rotationPointX = this.armleft.rotationPointX + (float)(xx);
        this.armleft.rotationPointY = this.armleft.rotationPointY - (float)(yy);
        this.armleft.rotationPointZ = this.armleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5 + (((tickAnim - 0) / 3) * (-2.5-(-5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 0) / 3) * (0-(5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.5 + (((tickAnim - 3) / 2) * (-60.05965-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.4239-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-2.46453-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -60.05965 + (((tickAnim - 5) / 3) * (-32.22845-(-60.05965)));
            yy = -0.4239 + (((tickAnim - 5) / 3) * (-0.36445-(-0.4239)));
            zz = -2.46453 + (((tickAnim - 5) / 3) * (-1.77222-(-2.46453)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -32.22845 + (((tickAnim - 8) / 2) * (0.04703-(-32.22845)));
            yy = -0.36445 + (((tickAnim - 8) / 2) * (-0.55262-(-0.36445)));
            zz = -1.77222 + (((tickAnim - 8) / 2) * (2.71402-(-1.77222)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0.04703 + (((tickAnim - 10) / 1) * (-9.96865-(0.04703)));
            yy = -0.55262 + (((tickAnim - 10) / 1) * (-0.36842-(-0.55262)));
            zz = 2.71402 + (((tickAnim - 10) / 1) * (1.80935-(2.71402)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -9.96865 + (((tickAnim - 11) / 2) * (-15-(-9.96865)));
            yy = -0.36842 + (((tickAnim - 11) / 2) * (0-(-0.36842)));
            zz = 1.80935 + (((tickAnim - 11) / 2) * (0-(1.80935)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -15 + (((tickAnim - 13) / 2) * (-5-(-15)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 11) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 9.25 + (((tickAnim - 0) / 3) * (11.25-(9.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 11.25 + (((tickAnim - 3) / 2) * (50.75-(11.25)));
            yy = 5 + (((tickAnim - 3) / 2) * (0-(5)));
            zz = 5 + (((tickAnim - 3) / 2) * (0-(5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 50.75 + (((tickAnim - 5) / 3) * (36.25-(50.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 36.25 + (((tickAnim - 8) / 2) * (0-(36.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (17.5-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 17.5 + (((tickAnim - 13) / 2) * (9.25-(17.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 13) / 2) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 11) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -42 + (((tickAnim - 0) / 1) * (-21.66667-(-42)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = -10 + (((tickAnim - 0) / 1) * (-10-(-10)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -21.66667 + (((tickAnim - 1) / 2) * (-10-(-21.66667)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = -10 + (((tickAnim - 1) / 2) * (-10-(-10)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -10 + (((tickAnim - 3) / 2) * (15-(-10)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -10 + (((tickAnim - 3) / 2) * (-5-(-10)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 5) / 3) * (25-(15)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 5) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 8) / 2) * (-7.5-(25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-10-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7.5 + (((tickAnim - 10) / 3) * (-30-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -10 + (((tickAnim - 10) / 3) * (-10-(-10)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -30 + (((tickAnim - 13) / 2) * (-42-(-30)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -10 + (((tickAnim - 13) / 2) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -1.5 + (((tickAnim - 0) / 1) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(-1.5)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 1) / 1) * (-0.28-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.28 + (((tickAnim - 2) / 1) * (-0.6-(-0.28)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -0.6 + (((tickAnim - 3) / 0) * (-0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(-0.6)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 3) / 2) * (-0.5-(-0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 5) / 3) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 10) / 3) * (1-(0.5)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 13) / 2) * (-1.5-(1)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft.rotationPointX = this.legleft.rotationPointX + (float)(xx);
        this.legleft.rotationPointY = this.legleft.rotationPointY - (float)(yy);
        this.legleft.rotationPointZ = this.legleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 31 + (((tickAnim - 0) / 1) * (19.66667-(31)));
            yy = -5 + (((tickAnim - 0) / 1) * (-5-(-5)));
            zz = 5 + (((tickAnim - 0) / 1) * (5-(5)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 19.66667 + (((tickAnim - 1) / 1) * (12.83333-(19.66667)));
            yy = -5 + (((tickAnim - 1) / 1) * (-5-(-5)));
            zz = 5 + (((tickAnim - 1) / 1) * (5-(5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 12.83333 + (((tickAnim - 2) / 1) * (12-(12.83333)));
            yy = -5 + (((tickAnim - 2) / 1) * (-5-(-5)));
            zz = 5 + (((tickAnim - 2) / 1) * (5-(5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 12 + (((tickAnim - 3) / 2) * (-2.5-(12)));
            yy = -5 + (((tickAnim - 3) / 2) * (0-(-5)));
            zz = 5 + (((tickAnim - 3) / 2) * (5-(5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 5) / 3) * (17.5-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 5) / 3) * (0-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 17.5 + (((tickAnim - 8) / 2) * (34.66284-(17.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (1.95085-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (4.44344-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 34.66284 + (((tickAnim - 10) / 3) * (22.40747-(34.66284)));
            yy = 1.95085 + (((tickAnim - 10) / 3) * (2.89034-(1.95085)));
            zz = 4.44344 + (((tickAnim - 10) / 3) * (8.65534-(4.44344)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 22.40747 + (((tickAnim - 13) / 2) * (31-(22.40747)));
            yy = 2.89034 + (((tickAnim - 13) / 2) * (-5-(2.89034)));
            zz = 8.65534 + (((tickAnim - 13) / 2) * (5-(8.65534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 8.5 + (((tickAnim - 0) / 1) * (-0.90424-(8.5)));
            yy = 2.5 + (((tickAnim - 0) / 1) * (1.37761-(2.5)));
            zz = 5 + (((tickAnim - 0) / 1) * (3.35853-(5)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -0.90424 + (((tickAnim - 1) / 1) * (1.69153-(-0.90424)));
            yy = 1.37761 + (((tickAnim - 1) / 1) * (0.25522-(1.37761)));
            zz = 3.35853 + (((tickAnim - 1) / 1) * (1.71706-(3.35853)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1.69153 + (((tickAnim - 2) / 1) * (-5.46271-(1.69153)));
            yy = 0.25522 + (((tickAnim - 2) / 1) * (-0.86717-(0.25522)));
            zz = 1.71706 + (((tickAnim - 2) / 1) * (0.07558-(1.71706)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -5.46271 + (((tickAnim - 3) / 0) * (-7.47514-(-5.46271)));
            yy = -0.86717 + (((tickAnim - 3) / 0) * (-0.57811-(-0.86717)));
            zz = 0.07558 + (((tickAnim - 3) / 0) * (0.05039-(0.07558)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.47514 + (((tickAnim - 3) / 2) * (-3-(-7.47514)));
            yy = -0.57811 + (((tickAnim - 3) / 2) * (0-(-0.57811)));
            zz = 0.05039 + (((tickAnim - 3) / 2) * (0-(0.05039)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3 + (((tickAnim - 5) / 3) * (40-(-3)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40 + (((tickAnim - 8) / 2) * (47.5-(40)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 47.5 + (((tickAnim - 10) / 3) * (22.5-(47.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 22.5 + (((tickAnim - 13) / 2) * (8.5-(22.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (2.5-(0)));
            zz = 5 + (((tickAnim - 13) / 2) * (5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 4 + (((tickAnim - 0) / 5) * (0-(4)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (18-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 18 + (((tickAnim - 8) / 4) * (-16-(18)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -16 + (((tickAnim - 12) / 1) * (-16.67-(-16)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -16.67 + (((tickAnim - 13) / 2) * (4-(-16.67)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-30))*-3), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-10), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.rotationPointX = this.Tail2.rotationPointX + (float)(xx);
        this.Tail2.rotationPointY = this.Tail2.rotationPointY - (float)(yy);
        this.Tail2.rotationPointZ = this.Tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*-3), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-60))*-10), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-60))*-3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.rotationPointX = this.Tail3.rotationPointX + (float)(xx);
        this.Tail3.rotationPointY = this.Tail3.rotationPointY - (float)(yy);
        this.Tail3.rotationPointZ = this.Tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-120))*-5), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-10), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-3));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17.5 + (((tickAnim - 0) / 3) * (-22.5-(-17.5)));
            yy = -10 + (((tickAnim - 0) / 3) * (-5-(-10)));
            zz = 15 + (((tickAnim - 0) / 3) * (10-(15)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -22.5 + (((tickAnim - 3) / 2) * (-2.5-(-22.5)));
            yy = -5 + (((tickAnim - 3) / 2) * (0-(-5)));
            zz = 10 + (((tickAnim - 3) / 2) * (5-(10)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 5) / 3) * (15-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 5) / 3) * (5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 8) / 0) * (25-(15)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 5 + (((tickAnim - 8) / 0) * (5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 8) / 2) * (22.5-(25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 8) / 2) * (5-(5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 22.5 + (((tickAnim - 10) / 3) * (32.5-(22.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (-10-(0)));
            zz = 5 + (((tickAnim - 10) / 3) * (10-(5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 32.5 + (((tickAnim - 13) / 2) * (-17.5-(32.5)));
            yy = -10 + (((tickAnim - 13) / 2) * (-10-(-10)));
            zz = 10 + (((tickAnim - 13) / 2) * (15-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 0) * (-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(0.25)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 3) / 2) * (-0.8-(-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = 0 + (((tickAnim - 3) / 2) * (0.4-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = -0.8 + (((tickAnim - 5) / 1) * (-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(-0.8)));
            zz = 0.4 + (((tickAnim - 5) / 1) * (0.3-(0.4)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 6) / 2) * (0.2-(-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0.3 + (((tickAnim - 6) / 2) * (0.4-(0.3)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 8) / 2) * (0-(0.2)));
            zz = 0.4 + (((tickAnim - 8) / 2) * (0.6-(0.4)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0.6 + (((tickAnim - 10) / 3) * (0.5-(0.6)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0.5 + (((tickAnim - 13) / 2) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright.rotationPointX = this.armright.rotationPointX + (float)(xx);
        this.armright.rotationPointY = this.armright.rotationPointY - (float)(yy);
        this.armright.rotationPointZ = this.armright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -32.22845 + (((tickAnim - 0) / 3) * (-7.45297-(-32.22845)));
            yy = 0.36445 + (((tickAnim - 0) / 3) * (0.55262-(0.36445)));
            zz = 1.77222 + (((tickAnim - 0) / 3) * (-2.71402-(1.77222)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.45297 + (((tickAnim - 3) / 2) * (-15-(-7.45297)));
            yy = 0.55262 + (((tickAnim - 3) / 2) * (0-(0.55262)));
            zz = -2.71402 + (((tickAnim - 3) / 2) * (0-(-2.71402)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -15 + (((tickAnim - 5) / 3) * (0-(-15)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = -5 + (((tickAnim - 8) / 0) * (-3.33333-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 8) / 2) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = -3.33333 + (((tickAnim - 8) / 2) * (0-(-3.33333)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -2.5 + (((tickAnim - 10) / 3) * (-43.80965-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.4239-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (2.46453-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -43.80965 + (((tickAnim - 13) / 2) * (-32.22845-(-43.80965)));
            yy = 0.4239 + (((tickAnim - 13) / 2) * (0.36445-(0.4239)));
            zz = 2.46453 + (((tickAnim - 13) / 2) * (1.77222-(2.46453)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 6) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 39 + (((tickAnim - 0) / 3) * (18.25-(39)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 18.25 + (((tickAnim - 3) / 2) * (17.5-(18.25)));
            yy = 2.5 + (((tickAnim - 3) / 2) * (0-(2.5)));
            zz = -2.5 + (((tickAnim - 3) / 2) * (-5-(-2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 17.5 + (((tickAnim - 5) / 3) * (-2.5-(17.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 5) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 8) / 2) * (25.28227-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (-2.68526-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-2.68526-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25.28227 + (((tickAnim - 10) / 3) * (27.5-(25.28227)));
            yy = -2.68526 + (((tickAnim - 10) / 3) * (0-(-2.68526)));
            zz = -2.68526 + (((tickAnim - 10) / 3) * (0-(-2.68526)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 27.5 + (((tickAnim - 13) / 2) * (39-(27.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 6) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25 + (((tickAnim - 0) / 3) * (-7.5-(25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (10-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -7.5 + (((tickAnim - 3) / 3) * (-30-(-7.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 10 + (((tickAnim - 3) / 3) * (10-(10)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -30 + (((tickAnim - 6) / 2) * (-41.52976-(-30)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 10 + (((tickAnim - 6) / 2) * (10-(10)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -41.52976 + (((tickAnim - 8) / 0) * (-23.33333-(-41.52976)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 10 + (((tickAnim - 8) / 0) * (10-(10)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -23.33333 + (((tickAnim - 8) / 2) * (-21.66667-(-23.33333)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 10 + (((tickAnim - 8) / 2) * (10-(10)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -21.66667 + (((tickAnim - 10) / 1) * (-15-(-21.66667)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 10 + (((tickAnim - 10) / 1) * (10-(10)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -15 + (((tickAnim - 11) / 2) * (15-(-15)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 10 + (((tickAnim - 11) / 2) * (5-(10)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 15 + (((tickAnim - 13) / 2) * (25-(15)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 13) / 2) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 3) * (1-(0.5)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 6) / 2) * (-1.5-(1)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = -1.5 + (((tickAnim - 8) / 0) * (-0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(-1.5)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 8) / 1) * (-0.72-(-0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = -0.72 + (((tickAnim - 9) / 1) * (-1-(-0.72)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 10) / 1) * (-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(-1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 11) / 2) * (-0.5-(-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 13) / 2) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright.rotationPointX = this.legright.rotationPointX + (float)(xx);
        this.legright.rotationPointY = this.legright.rotationPointY - (float)(yy);
        this.legright.rotationPointZ = this.legright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.5 + (((tickAnim - 0) / 3) * (34.71686-(17.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-5.66716-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 34.71686 + (((tickAnim - 3) / 3) * (22.40747-(34.71686)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = -5.66716 + (((tickAnim - 3) / 3) * (-8.65534-(-5.66716)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 22.40747 + (((tickAnim - 6) / 2) * (31.71919-(22.40747)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = -8.65534 + (((tickAnim - 6) / 2) * (-6.44947-(-8.65534)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 31.71919 + (((tickAnim - 8) / 0) * (22.33333-(31.71919)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = -6.44947 + (((tickAnim - 8) / 0) * (-5-(-6.44947)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 22.33333 + (((tickAnim - 8) / 1) * (16.66667-(22.33333)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 8) / 1) * (-5-(-5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 16.66667 + (((tickAnim - 9) / 1) * (18-(16.66667)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 9) / 1) * (-5-(-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 18 + (((tickAnim - 10) / 3) * (17.5-(18)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 10) / 3) * (-5-(-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 17.5 + (((tickAnim - 13) / 2) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 13) / 2) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 8) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 11) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 40 + (((tickAnim - 0) / 3) * (47.5-(40)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 47.5 + (((tickAnim - 3) / 3) * (13.5-(47.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 13.5 + (((tickAnim - 6) / 2) * (11.79448-(13.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.96731-(0)));
            zz = -5 + (((tickAnim - 6) / 2) * (-5-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 11.79448 + (((tickAnim - 8) / 0) * (0.96161-(11.79448)));
            yy = -0.96731 + (((tickAnim - 8) / 0) * (-0.93627-(-0.96731)));
            zz = -5 + (((tickAnim - 8) / 0) * (-3.75037-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0.96161 + (((tickAnim - 8) / 1) * (4.12874-(0.96161)));
            yy = -0.93627 + (((tickAnim - 8) / 1) * (-0.90523-(-0.93627)));
            zz = -3.75037 + (((tickAnim - 8) / 1) * (-2.50075-(-3.75037)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 4.12874 + (((tickAnim - 9) / 1) * (-4.5-(4.12874)));
            yy = -0.90523 + (((tickAnim - 9) / 1) * (0-(-0.90523)));
            zz = -2.50075 + (((tickAnim - 9) / 1) * (-5-(-2.50075)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -4.5 + (((tickAnim - 10) / 3) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 10) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (40-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 8) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 11) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 14 + (((tickAnim - 0) / 4) * (-18-(14)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -18 + (((tickAnim - 4) / 2) * (-16-(-18)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -16 + (((tickAnim - 6) / 2) * (0-(-16)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (14-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGargoyleosaurus entity = (EntityPrehistoricFloraGargoyleosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-2), main.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*3), main.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*3.5));

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3 + (((tickAnim - 0) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5 + (((tickAnim - 0) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3 + (((tickAnim - 9) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5 + (((tickAnim - 9) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3 + (((tickAnim - 20) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5 + (((tickAnim - 20) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.0089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2 + (((tickAnim - 0) / 4) * (-0.1384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2-(-0.0089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.0002 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.4772-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.0002)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-2.9999 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-0.035-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-2.9999)));
        }
        else if (tickAnim >= 4 && tickAnim < 40) {
            xx = -0.1384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2 + (((tickAnim - 4) / 36) * (-0.0089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2-(-0.1384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.4772 + (((tickAnim - 4) / 36) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.0002-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.4772)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-0.035 + (((tickAnim - 4) / 36) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-2.9999-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-0.035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);



        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-10))*-3.051), Chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*-2.878), Chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+99))*-3.62));

        if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Chest.rotationPointX = this.Chest.rotationPointX + (float)(xx);
        this.Chest.rotationPointY = this.Chest.rotationPointY - (float)(yy);
        this.Chest.rotationPointZ = this.Chest.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 4) / 8) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 26) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(xx);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(yy);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*5), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-5), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-3));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-3), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*4 + (((tickAnim - 0) / 40) * (5.5-(5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*4)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 27.5 + (((tickAnim - 0) / 4) * (-6.25-(27.5)));
            yy = 10 + (((tickAnim - 0) / 4) * (10-(10)));
            zz = -10 + (((tickAnim - 0) / 4) * (-10-(-10)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -6.25 + (((tickAnim - 4) / 3) * (-17.5-(-6.25)));
            yy = 10 + (((tickAnim - 4) / 3) * (10-(10)));
            zz = -10 + (((tickAnim - 4) / 3) * (-10-(-10)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -17.5 + (((tickAnim - 7) / 5) * (-22.5-(-17.5)));
            yy = 10 + (((tickAnim - 7) / 5) * (0-(10)));
            zz = -10 + (((tickAnim - 7) / 5) * (-5-(-10)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -22.5 + (((tickAnim - 12) / 10) * (10-(-22.5)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = -5 + (((tickAnim - 12) / 10) * (-2.5-(-5)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 10 + (((tickAnim - 22) / 4) * (17.75-(10)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = -2.5 + (((tickAnim - 22) / 4) * (-0.75-(-2.5)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 17.75 + (((tickAnim - 26) / 2) * (17.5-(17.75)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = -0.75 + (((tickAnim - 26) / 2) * (0-(-0.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 17.5 + (((tickAnim - 28) / 7) * (32.5-(17.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (2.5-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (-2.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 32.5 + (((tickAnim - 35) / 5) * (27.5-(32.5)));
            yy = 2.5 + (((tickAnim - 35) / 5) * (10-(2.5)));
            zz = -2.5 + (((tickAnim - 35) / 5) * (-10-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0.5 + (((tickAnim - 0) / 7) * (0.2-(0.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (-1.07-(0)));
            zz = 0.2 + (((tickAnim - 7) / 3) * (0.2-(0.2)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -1.07 + (((tickAnim - 10) / 2) * (-1.375-(-1.07)));
            zz = 0.2 + (((tickAnim - 10) / 2) * (0.2-(0.2)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = -1.375 + (((tickAnim - 12) / 5) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(-1.375)));
            zz = 0.2 + (((tickAnim - 12) / 5) * (0.975-(0.2)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 17) / 5) * (-0.9-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = 0.975 + (((tickAnim - 17) / 5) * (0.9-(0.975)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = -0.9 + (((tickAnim - 22) / 4) * (-0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.2-(-0.9)));
            zz = 0.9 + (((tickAnim - 22) / 4) * (1.15-(0.9)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = -0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.2 + (((tickAnim - 26) / 2) * (-0.9-(-0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.2)));
            zz = 1.15 + (((tickAnim - 26) / 2) * (1-(1.15)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = -0.9 + (((tickAnim - 28) / 4) * (-0.6-(-0.9)));
            zz = 1 + (((tickAnim - 28) / 4) * (0.8-(1)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = -0.6 + (((tickAnim - 32) / 3) * (-0.3-(-0.6)));
            zz = 0.8 + (((tickAnim - 32) / 3) * (0.8-(0.8)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -0.3 + (((tickAnim - 35) / 5) * (0-(-0.3)));
            zz = 0.8 + (((tickAnim - 35) / 5) * (0.5-(0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft.rotationPointX = this.armleft.rotationPointX + (float)(xx);
        this.armleft.rotationPointY = this.armleft.rotationPointY - (float)(yy);
        this.armleft.rotationPointZ = this.armleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -33.5482 + (((tickAnim - 0) / 4) * (-26.62249-(-33.5482)));
            yy = 1.69871 + (((tickAnim - 0) / 4) * (-0.72162-(1.69871)));
            zz = -2.10316 + (((tickAnim - 0) / 4) * (-2.21221-(-2.10316)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -26.62249 + (((tickAnim - 4) / 8) * (-15.21694-(-26.62249)));
            yy = -0.72162 + (((tickAnim - 4) / 8) * (2.69952-(-0.72162)));
            zz = -2.21221 + (((tickAnim - 4) / 8) * (0.7854-(-2.21221)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -15.21694 + (((tickAnim - 12) / 4) * (-17.46178-(-15.21694)));
            yy = 2.69952 + (((tickAnim - 12) / 4) * (2.31367-(2.69952)));
            zz = 0.7854 + (((tickAnim - 12) / 4) * (-0.66643-(0.7854)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -17.46178 + (((tickAnim - 16) / 4) * (-19.20662-(-17.46178)));
            yy = 2.31367 + (((tickAnim - 16) / 4) * (1.92782-(2.31367)));
            zz = -0.66643 + (((tickAnim - 16) / 4) * (-2.11825-(-0.66643)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -19.20662 + (((tickAnim - 20) / 3) * (-12.03671-(-19.20662)));
            yy = 1.92782 + (((tickAnim - 20) / 3) * (1.52284-(1.92782)));
            zz = -2.11825 + (((tickAnim - 20) / 3) * (-1.67327-(-2.11825)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -12.03671 + (((tickAnim - 23) / 3) * (-4.61198-(-12.03671)));
            yy = 1.52284 + (((tickAnim - 23) / 3) * (0.57834-(1.52284)));
            zz = -1.67327 + (((tickAnim - 23) / 3) * (-0.63547-(-1.67327)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -4.61198 + (((tickAnim - 26) / 2) * (-1.14865-(-4.61198)));
            yy = 0.57834 + (((tickAnim - 26) / 2) * (1.03378-(0.57834)));
            zz = -0.63547 + (((tickAnim - 26) / 2) * (-0.50342-(-0.63547)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -1.14865 + (((tickAnim - 28) / 5) * (-7.77427-(-1.14865)));
            yy = 1.03378 + (((tickAnim - 28) / 5) * (1.66393-(1.03378)));
            zz = -0.50342 + (((tickAnim - 28) / 5) * (-0.32071-(-0.50342)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -7.77427 + (((tickAnim - 33) / 4) * (-23.18327-(-7.77427)));
            yy = 1.66393 + (((tickAnim - 33) / 4) * (3.5637-(1.66393)));
            zz = -0.32071 + (((tickAnim - 33) / 4) * (0.23014-(-0.32071)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -23.18327 + (((tickAnim - 37) / 3) * (-33.5482-(-23.18327)));
            yy = 3.5637 + (((tickAnim - 37) / 3) * (1.69871-(3.5637)));
            zz = 0.23014 + (((tickAnim - 37) / 3) * (-2.10316-(0.23014)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 12) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 12) / 4) * (0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0.2)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 16) / 4) * (0.2-(0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 16) / 4) * (0.2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 20) / 4) * (0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0.2)));
            zz = 0.2 + (((tickAnim - 20) / 4) * (0.1-(0.2)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            yy = 0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 24) / 2) * (0.17-(0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0.1 + (((tickAnim - 24) / 2) * (0.08-(0.1)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0.17 + (((tickAnim - 26) / 2) * (0.3-(0.17)));
            zz = 0.08 + (((tickAnim - 26) / 2) * (0.3-(0.08)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0.3 + (((tickAnim - 28) / 7) * (0.8-(0.3)));
            zz = 0.3 + (((tickAnim - 28) / 7) * (0.2-(0.3)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.8 + (((tickAnim - 35) / 5) * (0.2-(0.8)));
            zz = 0.2 + (((tickAnim - 35) / 5) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 51.5 + (((tickAnim - 0) / 7) * (35-(51.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 35 + (((tickAnim - 7) / 2) * (20.23391-(35)));
            yy = 0 + (((tickAnim - 7) / 2) * (-0.69237-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (1.33078-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 20.23391 + (((tickAnim - 9) / 3) * (33.46783-(20.23391)));
            yy = -0.69237 + (((tickAnim - 9) / 3) * (-1.38475-(-0.69237)));
            zz = 1.33078 + (((tickAnim - 9) / 3) * (2.66155-(1.33078)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 33.46783 + (((tickAnim - 12) / 8) * (10.98436-(33.46783)));
            yy = -1.38475 + (((tickAnim - 12) / 8) * (-0.75155-(-1.38475)));
            zz = 2.66155 + (((tickAnim - 12) / 8) * (2.38443-(2.66155)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 10.98436 + (((tickAnim - 20) / 5) * (-2.45469-(10.98436)));
            yy = -0.75155 + (((tickAnim - 20) / 5) * (-0.22546-(-0.75155)));
            zz = 2.38443 + (((tickAnim - 20) / 5) * (0.71533-(2.38443)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -2.45469 + (((tickAnim - 25) / 3) * (-2.5-(-2.45469)));
            yy = -0.22546 + (((tickAnim - 25) / 3) * (0-(-0.22546)));
            zz = 0.71533 + (((tickAnim - 25) / 3) * (0-(0.71533)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -2.5 + (((tickAnim - 28) / 7) * (42.5-(-2.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 42.5 + (((tickAnim - 35) / 5) * (51.5-(42.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -3 + (((tickAnim - 0) / 5) * (30-(-3)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 30 + (((tickAnim - 5) / 5) * (-8.5-(30)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -8.5 + (((tickAnim - 10) / 4) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (9.5-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 9.5 + (((tickAnim - 18) / 3) * (4.5-(9.5)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 4.5 + (((tickAnim - 21) / 2) * (-0.5-(4.5)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -0.5 + (((tickAnim - 23) / 3) * (-3-(-0.5)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft4, armleft4.rotateAngleX + (float) Math.toRadians(xx), armleft4.rotateAngleY + (float) Math.toRadians(yy), armleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -44.5 + (((tickAnim - 0) / 4) * (-23.03301-(-44.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 4) * (-5-(-5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -23.03301 + (((tickAnim - 4) / 4) * (-10-(-23.03301)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = -5 + (((tickAnim - 4) / 4) * (-5-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -10 + (((tickAnim - 8) / 9) * (11-(-10)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = -5 + (((tickAnim - 8) / 9) * (0-(-5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 11 + (((tickAnim - 17) / 3) * (15-(11)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (-5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 15 + (((tickAnim - 20) / 8) * (-22.5-(15)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = -5 + (((tickAnim - 20) / 8) * (-5-(-5)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -22.5 + (((tickAnim - 28) / 5) * (-37.5-(-22.5)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = -5 + (((tickAnim - 28) / 5) * (-5-(-5)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -37.5 + (((tickAnim - 33) / 4) * (-35.5-(-37.5)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = -5 + (((tickAnim - 33) / 4) * (-5-(-5)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -35.5 + (((tickAnim - 37) / 3) * (-44.5-(-35.5)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 37) / 3) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.9 + (((tickAnim - 0) / 3) * (-0.56-(-0.9)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.56 + (((tickAnim - 3) / 1) * (0.4-(-0.56)));
            zz = -0.15 + (((tickAnim - 3) / 1) * (-0.25-(-0.15)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.4 + (((tickAnim - 4) / 4) * (-0.475-(0.4)));
            zz = -0.25 + (((tickAnim - 4) / 4) * (-0.5-(-0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.475 + (((tickAnim - 8) / 5) * (-0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5-(-0.475)));
            zz = -0.5 + (((tickAnim - 8) / 5) * (-0.25-(-0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5 + (((tickAnim - 13) / 4) * (-0.5-(-0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5)));
            zz = -0.25 + (((tickAnim - 13) / 4) * (0-(-0.25)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 17) / 3) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 3) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft.rotationPointX = this.legleft.rotationPointX + (float)(xx);
        this.legleft.rotationPointY = this.legleft.rotationPointY - (float)(yy);
        this.legleft.rotationPointZ = this.legleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 27.5 + (((tickAnim - 0) / 4) * (17.25-(27.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 17.25 + (((tickAnim - 4) / 4) * (13-(17.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 13 + (((tickAnim - 8) / 9) * (6.81734-(13)));
            yy = 0 + (((tickAnim - 8) / 9) * (2.27304-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (-1.63154-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 6.81734 + (((tickAnim - 17) / 6) * (25.10922-(6.81734)));
            yy = 2.27304 + (((tickAnim - 17) / 6) * (2.46671-(2.27304)));
            zz = -1.63154 + (((tickAnim - 17) / 6) * (1.45998-(-1.63154)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 25.10922 + (((tickAnim - 23) / 5) * (36.50144-(25.10922)));
            yy = 2.46671 + (((tickAnim - 23) / 5) * (3.23554-(2.46671)));
            zz = 1.45998 + (((tickAnim - 23) / 5) * (-0.22309-(1.45998)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 36.50144 + (((tickAnim - 28) / 5) * (37.83252-(36.50144)));
            yy = 3.23554 + (((tickAnim - 28) / 5) * (3.33317-(3.23554)));
            zz = -0.22309 + (((tickAnim - 28) / 5) * (0.57399-(-0.22309)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 37.83252 + (((tickAnim - 33) / 4) * (22.59171-(37.83252)));
            yy = 3.33317 + (((tickAnim - 33) / 4) * (3.39042-(3.33317)));
            zz = 0.57399 + (((tickAnim - 33) / 4) * (4.6193-(0.57399)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 22.59171 + (((tickAnim - 37) / 3) * (27.5-(22.59171)));
            yy = 3.39042 + (((tickAnim - 37) / 3) * (0-(3.39042)));
            zz = 4.6193 + (((tickAnim - 37) / 3) * (0-(4.6193)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 13) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17.98072 + (((tickAnim - 0) / 4) * (7.49527-(17.98072)));
            yy = 0.95645 + (((tickAnim - 0) / 4) * (0.21782-(0.95645)));
            zz = 2.69009 + (((tickAnim - 0) / 4) * (2.5095-(2.69009)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 7.49527 + (((tickAnim - 4) / 4) * (-2.99294-(7.49527)));
            yy = 0.21782 + (((tickAnim - 4) / 4) * (-0.32621-(0.21782)));
            zz = 2.5095 + (((tickAnim - 4) / 4) * (2.52136-(2.5095)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -2.99294 + (((tickAnim - 8) / 9) * (12.5-(-2.99294)));
            yy = -0.32621 + (((tickAnim - 8) / 9) * (0-(-0.32621)));
            zz = 2.52136 + (((tickAnim - 8) / 9) * (0-(2.52136)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 12.5 + (((tickAnim - 17) / 6) * (49-(12.5)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 49 + (((tickAnim - 23) / 7) * (7.5-(49)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 7.5 + (((tickAnim - 30) / 7) * (5-(7.5)));
            yy = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 37) / 3) * (17.98072-(5)));
            yy = 0 + (((tickAnim - 37) / 3) * (0.95645-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (2.69009-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 13) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 9) / 8) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -4.5 + (((tickAnim - 17) / 5) * (7-(-4.5)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 7 + (((tickAnim - 22) / 6) * (11-(7)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 11 + (((tickAnim - 28) / 6) * (-22.5-(11)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -22.5 + (((tickAnim - 34) / 6) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 0) / 6) * (-0.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 0) / 6) * (-0.0789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 0) / 6) * (-2.5046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 6 && tickAnim < 19) {
            xx = -0.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 6) / 13) * (-0.1461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-0.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = -0.0789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 6) / 13) * (-0.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-0.0789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = -2.5046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 6) / 13) * (-0.0046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(-2.5046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -0.1461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 19) / 5) * (-0.2809+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-0.1461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = -0.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 19) / 5) * (-0.0296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-0.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = -0.0046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 19) / 5) * (2.4989+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(-0.0046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -0.2809+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 24) / 8) * (-3.35325-(-0.2809+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = -0.0296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 24) / 8) * (-4.59467-(-0.0296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = 2.4989+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 24) / 8) * (0.91332-(2.4989+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -3.35325 + (((tickAnim - 32) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-3.35325)));
            yy = -4.59467 + (((tickAnim - 32) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-4.59467)));
            zz = 0.91332 + (((tickAnim - 32) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(0.91332)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.rotationPointX = this.Tail1.rotationPointX + (float)(xx);
        this.Tail1.rotationPointY = this.Tail1.rotationPointY - (float)(yy);
        this.Tail1.rotationPointZ = this.Tail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*3), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*7.5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.rotationPointX = this.Tail2.rotationPointX + (float)(xx);
        this.Tail2.rotationPointY = this.Tail2.rotationPointY - (float)(yy);
        this.Tail2.rotationPointZ = this.Tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*10), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.rotationPointX = this.Tail3.rotationPointX + (float)(xx);
        this.Tail3.rotationPointY = this.Tail3.rotationPointY - (float)(yy);
        this.Tail3.rotationPointZ = this.Tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*3), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*10), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail4.rotationPointX = this.Tail4.rotationPointX + (float)(xx);
        this.Tail4.rotationPointY = this.Tail4.rotationPointY - (float)(yy);
        this.Tail4.rotationPointZ = this.Tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 0) / 8) * (15-(10)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 2.5 + (((tickAnim - 0) / 8) * (0-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 15 + (((tickAnim - 8) / 7) * (27.5-(15)));
            yy = 0 + (((tickAnim - 8) / 7) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (2.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 27.5 + (((tickAnim - 15) / 5) * (27.5-(27.5)));
            yy = -2.5 + (((tickAnim - 15) / 5) * (-10-(-2.5)));
            zz = 2.5 + (((tickAnim - 15) / 5) * (10-(2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 27.5 + (((tickAnim - 20) / 8) * (-22.5-(27.5)));
            yy = -10 + (((tickAnim - 20) / 8) * (-10-(-10)));
            zz = 10 + (((tickAnim - 20) / 8) * (10-(10)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -22.5 + (((tickAnim - 28) / 4) * (-12-(-22.5)));
            yy = -10 + (((tickAnim - 28) / 4) * (0-(-10)));
            zz = 10 + (((tickAnim - 28) / 4) * (5-(10)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -12 + (((tickAnim - 32) / 8) * (10-(-12)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 5 + (((tickAnim - 32) / 8) * (2.5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.9 + (((tickAnim - 0) / 2) * (-1.23-(-0.9)));
            zz = 1.2 + (((tickAnim - 0) / 2) * (1.675-(1.2)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -1.23 + (((tickAnim - 2) / 2) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25-(-1.23)));
            zz = 1.675 + (((tickAnim - 2) / 2) * (1.575-(1.675)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25 + (((tickAnim - 4) / 3) * (-0.735-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25)));
            zz = 1.575 + (((tickAnim - 4) / 3) * (1.7-(1.575)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.735 + (((tickAnim - 7) / 1) * (-0.8-(-0.735)));
            zz = 1.7 + (((tickAnim - 7) / 1) * (1.55-(1.7)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.8 + (((tickAnim - 8) / 2) * (-0.4-(-0.8)));
            zz = 1.55 + (((tickAnim - 8) / 2) * (0.8-(1.55)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.4 + (((tickAnim - 10) / 5) * (-0.125-(-0.4)));
            zz = 0.8 + (((tickAnim - 10) / 5) * (0.8-(0.8)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.125 + (((tickAnim - 15) / 5) * (0-(-0.125)));
            zz = 0.8 + (((tickAnim - 15) / 5) * (0.6-(0.8)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (-0.875-(0)));
            zz = 0.6 + (((tickAnim - 20) / 8) * (0.675-(0.6)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = -0.875 + (((tickAnim - 28) / 4) * (-1.075-(-0.875)));
            zz = 0.675 + (((tickAnim - 28) / 4) * (1-(0.675)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = -1.075 + (((tickAnim - 32) / 1) * (-0.9-(-1.075)));
            zz = 1 + (((tickAnim - 32) / 1) * (0.75-(1)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = -0.9 + (((tickAnim - 33) / 3) * (-0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(-0.9)));
            zz = 0.75 + (((tickAnim - 33) / 3) * (0.7-(0.75)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            yy = -0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 36) / 2) * (-0.835-(-0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = 0.7 + (((tickAnim - 36) / 2) * (0.825-(0.7)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = -0.835 + (((tickAnim - 38) / 2) * (-0.9-(-0.835)));
            zz = 0.825 + (((tickAnim - 38) / 2) * (1.2-(0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright.rotationPointX = this.armright.rotationPointX + (float)(xx);
        this.armright.rotationPointY = this.armright.rotationPointY - (float)(yy);
        this.armright.rotationPointZ = this.armright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -12.58426 + (((tickAnim - 0) / 8) * (2.5-(-12.58426)));
            yy = -1.16329 + (((tickAnim - 0) / 8) * (0-(-1.16329)));
            zz = -0.2855 + (((tickAnim - 0) / 8) * (0-(-0.2855)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 2.5 + (((tickAnim - 8) / 8) * (-12.89782-(2.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (-3.63642-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0.62082-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -12.89782 + (((tickAnim - 16) / 4) * (-38.25909-(-12.89782)));
            yy = -3.63642 + (((tickAnim - 16) / 4) * (-4.09833-(-3.63642)));
            zz = 0.62082 + (((tickAnim - 16) / 4) * (7.48039-(0.62082)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -38.25909 + (((tickAnim - 20) / 8) * (-25.22536-(-38.25909)));
            yy = -4.09833 + (((tickAnim - 20) / 8) * (1.41179-(-4.09833)));
            zz = 7.48039 + (((tickAnim - 20) / 8) * (2.86574-(7.48039)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -25.22536 + (((tickAnim - 28) / 4) * (-16.21678-(-25.22536)));
            yy = 1.41179 + (((tickAnim - 28) / 4) * (-2.66269-(1.41179)));
            zz = 2.86574 + (((tickAnim - 28) / 4) * (-0.76204-(2.86574)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -16.21678 + (((tickAnim - 32) / 8) * (-12.58426-(-16.21678)));
            yy = -2.66269 + (((tickAnim - 32) / 8) * (-1.16329-(-2.66269)));
            zz = -0.76204 + (((tickAnim - 32) / 8) * (-0.2855-(-0.76204)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 4) * (0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0.1)));
            zz = 0.3 + (((tickAnim - 0) / 4) * (0.2-(0.3)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 4) / 3) * (-0.065-(0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0.2 + (((tickAnim - 4) / 3) * (-0.085-(0.2)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.065 + (((tickAnim - 7) / 1) * (0.3-(-0.065)));
            zz = -0.085 + (((tickAnim - 7) / 1) * (0.1-(-0.085)));
        }
        else if (tickAnim >= 8 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 8) / 24) * (0-(0)));
            yy = 0.3 + (((tickAnim - 8) / 24) * (0-(0.3)));
            zz = 0.1 + (((tickAnim - 8) / 24) * (0-(0.1)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0.1-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0.3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.4972 + (((tickAnim - 0) / 4) * (-5.31659-(2.4972)));
            yy = 0.342 + (((tickAnim - 0) / 4) * (0.18155-(0.342)));
            zz = -0.9397 + (((tickAnim - 0) / 4) * (-0.97202-(-0.9397)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -5.31659 + (((tickAnim - 4) / 3) * (-12.10056-(-5.31659)));
            yy = 0.18155 + (((tickAnim - 4) / 3) * (0.0684-(0.18155)));
            zz = -0.97202 + (((tickAnim - 4) / 3) * (-0.18794-(-0.97202)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -12.10056 + (((tickAnim - 7) / 1) * (-12-(-12.10056)));
            yy = 0.0684 + (((tickAnim - 7) / 1) * (0-(0.0684)));
            zz = -0.18794 + (((tickAnim - 7) / 1) * (0-(-0.18794)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12 + (((tickAnim - 8) / 2) * (2.25-(-12)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 2.25 + (((tickAnim - 10) / 2) * (8.17-(2.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 8.17 + (((tickAnim - 12) / 3) * (24-(8.17)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 24 + (((tickAnim - 15) / 5) * (34.75-(24)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 34.75 + (((tickAnim - 20) / 5) * (40.08-(34.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 40.08 + (((tickAnim - 25) / 3) * (26.75-(40.08)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 26.75 + (((tickAnim - 28) / 4) * (24.97476-(26.75)));
            yy = 0 + (((tickAnim - 28) / 4) * (1.02565-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (-2.81938-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 24.97476 + (((tickAnim - 32) / 8) * (2.4972-(24.97476)));
            yy = 1.02565 + (((tickAnim - 32) / 8) * (0.342-(1.02565)));
            zz = -2.81938 + (((tickAnim - 32) / 8) * (-0.9397-(-2.81938)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 25) {
            xx = -1.5 + (((tickAnim - 20) / 5) * (23.25-(-1.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 23.25 + (((tickAnim - 25) / 5) * (-9.75-(23.25)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -9.75 + (((tickAnim - 30) / 4) * (-0.75-(-9.75)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright4, armright4.rotateAngleX + (float) Math.toRadians(xx), armright4.rotateAngleY + (float) Math.toRadians(yy), armright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 0) / 8) * (-22.5-(15)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 5 + (((tickAnim - 0) / 8) * (5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -22.5 + (((tickAnim - 8) / 5) * (-37.5-(-22.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 8) / 5) * (5-(5)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -37.5 + (((tickAnim - 13) / 4) * (-32.5-(-37.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 5 + (((tickAnim - 13) / 4) * (5-(5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -32.5 + (((tickAnim - 17) / 3) * (-40.5-(-32.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 17) / 3) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -40.5 + (((tickAnim - 20) / 4) * (-16.25-(-40.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 5 + (((tickAnim - 20) / 4) * (5-(5)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -16.25 + (((tickAnim - 24) / 4) * (-10-(-16.25)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 5 + (((tickAnim - 24) / 4) * (5-(5)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -10 + (((tickAnim - 28) / 9) * (12.5-(-10)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 5 + (((tickAnim - 28) / 9) * (0-(5)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 12.5 + (((tickAnim - 37) / 3) * (15-(12.5)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = -0.65 + (((tickAnim - 20) / 4) * (-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(-0.65)));
            zz = 0 + (((tickAnim - 20) / 4) * (-0.75-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = -0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 24) / 4) * (-0.5-(-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
            zz = -0.75 + (((tickAnim - 24) / 4) * (-0.5-(-0.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = -0.5 + (((tickAnim - 28) / 5) * (-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5-(-0.5)));
            zz = -0.5 + (((tickAnim - 28) / 5) * (-0.25-(-0.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = -0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5 + (((tickAnim - 33) / 4) * (-0.5-(-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5)));
            zz = -0.25 + (((tickAnim - 33) / 4) * (0-(-0.25)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 37) / 3) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright.rotationPointX = this.legright.rotationPointX + (float)(xx);
        this.legright.rotationPointY = this.legright.rotationPointY - (float)(yy);
        this.legright.rotationPointZ = this.legright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 0) / 8) * (36.47058-(25)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.38152-(0)));
            zz = -5 + (((tickAnim - 0) / 8) * (-5.09528-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 36.47058 + (((tickAnim - 8) / 9) * (19.91451-(36.47058)));
            yy = -1.38152 + (((tickAnim - 8) / 9) * (0-(-1.38152)));
            zz = -5.09528 + (((tickAnim - 8) / 9) * (-8.74877-(-5.09528)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 19.91451 + (((tickAnim - 17) / 3) * (24.5-(19.91451)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = -8.74877 + (((tickAnim - 17) / 3) * (0-(-8.74877)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 24.5 + (((tickAnim - 20) / 4) * (17.25-(24.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 17.25 + (((tickAnim - 24) / 4) * (12-(17.25)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 12 + (((tickAnim - 28) / 5) * (4.5-(12)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 4.5 + (((tickAnim - 33) / 4) * (15.01256-(4.5)));
            yy = 0 + (((tickAnim - 33) / 4) * (1.43344-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (1.00397-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 15.01256 + (((tickAnim - 37) / 3) * (25-(15.01256)));
            yy = 1.43344 + (((tickAnim - 37) / 3) * (0-(1.43344)));
            zz = 1.00397 + (((tickAnim - 37) / 3) * (-5-(1.00397)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (-0.1-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3)));
            zz = -0.1 + (((tickAnim - 24) / 4) * (0-(-0.1)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 33) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 35 + (((tickAnim - 0) / 8) * (17.5-(35)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 17.5 + (((tickAnim - 8) / 5) * (0.5-(17.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0.5 + (((tickAnim - 13) / 4) * (5-(0.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 17) / 3) * (17.98072-(5)));
            yy = 0 + (((tickAnim - 17) / 3) * (-0.95645-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (-2.69009-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 17.98072 + (((tickAnim - 20) / 4) * (1.49527-(17.98072)));
            yy = -0.95645 + (((tickAnim - 20) / 4) * (-0.21782-(-0.95645)));
            zz = -2.69009 + (((tickAnim - 20) / 4) * (-2.5095-(-2.69009)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 1.49527 + (((tickAnim - 24) / 4) * (-1.99294-(1.49527)));
            yy = -0.21782 + (((tickAnim - 24) / 4) * (0.32621-(-0.21782)));
            zz = -2.5095 + (((tickAnim - 24) / 4) * (-2.52136-(-2.5095)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -1.99294 + (((tickAnim - 28) / 5) * (-4.5-(-1.99294)));
            yy = 0.32621 + (((tickAnim - 28) / 5) * (0-(0.32621)));
            zz = -2.52136 + (((tickAnim - 28) / 5) * (-2.5-(-2.52136)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -4.5 + (((tickAnim - 33) / 4) * (8-(-4.5)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = -2.5 + (((tickAnim - 33) / 4) * (0-(-2.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 8 + (((tickAnim - 37) / 3) * (35-(8)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = -0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 24) / 4) * (0-(-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 33) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 13 + (((tickAnim - 0) / 16) * (-16.25-(13)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -16.25 + (((tickAnim - 16) / 4) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (2-(0)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 2 + (((tickAnim - 33) / 7) * (13-(2)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraGargoyleosaurus e = (EntityPrehistoricFloraGargoyleosaurus) entity;
        animator.update(entity);


    }
}
