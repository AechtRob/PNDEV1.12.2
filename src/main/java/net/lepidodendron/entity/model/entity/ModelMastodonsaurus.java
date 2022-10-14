package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMastodonsaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelMastodonsaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Mastodonsaurus;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer RArm;
    private final AdvancedModelRenderer RArm2;
    private final AdvancedModelRenderer RHand;
    private final AdvancedModelRenderer RArm3;
    private final AdvancedModelRenderer RArm4;
    private final AdvancedModelRenderer RHand2;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer RGill;
    private final AdvancedModelRenderer RGill2;
    private final AdvancedModelRenderer UpperJaw;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer LowerJaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer bonejawthing;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer RLeg;
    private final AdvancedModelRenderer RLeg2;
    private final AdvancedModelRenderer RFoot;
    private final AdvancedModelRenderer RLeg3;
    private final AdvancedModelRenderer RLeg4;
    private final AdvancedModelRenderer RFoot2;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer bone;

    private ModelAnimator animator;

    public ModelMastodonsaurus() {
        this.textureWidth = 256;
        this.textureHeight = 256;

        this.Mastodonsaurus = new AdvancedModelRenderer(this);
        this.Mastodonsaurus.setRotationPoint(0.0F, 19.0F, 14.0F);
        this.setRotateAngle(Mastodonsaurus, -0.0436F, 0.0F, 0.0F);
        this.Mastodonsaurus.cubeList.add(new ModelBox(Mastodonsaurus, 0, 36, -6.5F, -5.0F, -8.0F, 13, 8, 10, 0.0F, false));
        this.Mastodonsaurus.cubeList.add(new ModelBox(Mastodonsaurus, 85, 34, -5.0F, -5.5F, -8.0F, 10, 1, 10, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 5.0F, -8.0F);
        this.Mastodonsaurus.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0175F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 77, -6.0F, -2.5F, 0.0F, 12, 2, 10, -0.01F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.Mastodonsaurus.addChild(Body);
        this.setRotateAngle(Body, 0.0436F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -7.5F, -4.0F, -10.0F, 15, 8, 12, 0.02F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 21, -7.0F, 4.0F, -10.0F, 14, 2, 12, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 41, 24, -6.0F, -4.5F, -10.0F, 12, 1, 12, 0.0F, false));

        this.RArm = new AdvancedModelRenderer(this);
        this.RArm.setRotationPoint(6.5F, 4.0F, -8.0F);
        this.Body.addChild(RArm);
        this.setRotateAngle(RArm, 0.0F, -0.8727F, 0.1745F);
        this.RArm.cubeList.add(new ModelBox(RArm, 122, 98, 0.0F, -2.0F, -1.0F, 6, 3, 4, 0.0F, false));

        this.RArm2 = new AdvancedModelRenderer(this);
        this.RArm2.setRotationPoint(4.5F, 0.0F, 1.0F);
        this.RArm.addChild(RArm2);
        this.setRotateAngle(RArm2, 0.0F, 1.4835F, 0.0F);
        this.RArm2.cubeList.add(new ModelBox(RArm2, 126, 6, 0.0F, -1.5F, -1.5F, 6, 2, 3, 0.0F, false));

        this.RHand = new AdvancedModelRenderer(this);
        this.RHand.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.RArm2.addChild(RHand);
        this.setRotateAngle(RHand, 0.1414F, 0.6633F, -0.0542F);
        this.RHand.cubeList.add(new ModelBox(RHand, 126, 0, -1.0F, -0.5F, -2.0F, 5, 1, 4, 0.0F, false));

        this.RArm3 = new AdvancedModelRenderer(this);
        this.RArm3.setRotationPoint(-6.5F, 4.0F, -8.0F);
        this.Body.addChild(RArm3);
        this.setRotateAngle(RArm3, 0.0F, 0.8727F, -0.1745F);
        this.RArm3.cubeList.add(new ModelBox(RArm3, 122, 98, -6.0F, -2.0F, -1.0F, 6, 3, 4, 0.0F, true));

        this.RArm4 = new AdvancedModelRenderer(this);
        this.RArm4.setRotationPoint(-4.5F, 0.0F, 1.0F);
        this.RArm3.addChild(RArm4);
        this.setRotateAngle(RArm4, 0.0F, -1.4835F, 0.0F);
        this.RArm4.cubeList.add(new ModelBox(RArm4, 126, 6, -6.0F, -1.5F, -1.5F, 6, 2, 3, 0.0F, true));

        this.RHand2 = new AdvancedModelRenderer(this);
        this.RHand2.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.RArm4.addChild(RHand2);
        this.setRotateAngle(RHand2, 0.1414F, -0.6633F, 0.0542F);
        this.RHand2.cubeList.add(new ModelBox(RHand2, 126, 0, -4.0F, -0.5F, -2.0F, 5, 1, 4, 0.0F, true));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -1.5F, -8.0F);
        this.Body.addChild(Neck);
        this.setRotateAngle(Neck, 0.0436F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 78, 19, -6.5F, -2.5F, -8.0F, 13, 6, 8, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 5.5F, -8.0F);
        this.Neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 82, 106, -4.5F, -3.0F, 0.0F, 9, 3, 8, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0611F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 108, 77, -4.5F, 0.0F, -8.0F, 9, 1, 8, -0.01F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.5F, -7.0F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.0436F, 0.0F, 0.0F);


        this.RGill = new AdvancedModelRenderer(this);
        this.RGill.setRotationPoint(6.5F, 0.0F, -1.0F);
        this.Head.addChild(RGill);
        this.setRotateAngle(RGill, 0.0F, 0.6109F, 0.0F);
        this.RGill.cubeList.add(new ModelBox(RGill, 0, 55, 0.0F, -3.0F, 0.0F, 0, 5, 6, 0.0F, false));

        this.RGill2 = new AdvancedModelRenderer(this);
        this.RGill2.setRotationPoint(-6.5F, 0.0F, -1.0F);
        this.Head.addChild(RGill2);
        this.setRotateAngle(RGill2, 0.0F, -0.6109F, 0.0F);
        this.RGill2.cubeList.add(new ModelBox(RGill2, 0, 55, 0.0F, -3.0F, 0.0F, 0, 5, 6, 0.0F, true));

        this.UpperJaw = new AdvancedModelRenderer(this);
        this.UpperJaw.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Head.addChild(UpperJaw);
        this.setRotateAngle(UpperJaw, -0.0436F, 0.0F, 0.0F);
        this.UpperJaw.cubeList.add(new ModelBox(UpperJaw, 58, 42, -2.5F, -1.98F, -15.0F, 5, 2, 16, -0.01F, false));
        this.UpperJaw.cubeList.add(new ModelBox(UpperJaw, 0, 0, -2.0F, -2.0F, -16.0F, 4, 2, 1, 0.0F, false));
        this.UpperJaw.cubeList.add(new ModelBox(UpperJaw, 0, 36, 1.5F, -0.5F, -13.0F, 1, 2, 1, 0.0F, false));
        this.UpperJaw.cubeList.add(new ModelBox(UpperJaw, 5, 36, -2.5F, -0.5F, -13.0F, 1, 2, 1, 0.0F, false));
        this.UpperJaw.cubeList.add(new ModelBox(UpperJaw, 7, 21, -3.0F, -0.5F, -10.0F, 1, 2, 1, 0.0F, false));
        this.UpperJaw.cubeList.add(new ModelBox(UpperJaw, 7, 8, 2.0F, -0.5F, -10.0F, 1, 2, 1, 0.0F, false));
        this.UpperJaw.cubeList.add(new ModelBox(UpperJaw, 0, 25, -2.0F, 0.0F, -15.0F, 4, 1, 0, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.0F, -3.5F, -3.0F);
        this.UpperJaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0289F, -0.2163F, 0.134F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 8, 0.0F, 0.2F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.0F, -3.5F, -3.0F);
        this.UpperJaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0289F, 0.2163F, -0.134F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 21, -1.0F, 0.2F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.5F, 0.0F, -15.0F);
        this.UpperJaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.2182F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 41, 5, -4.57F, -2.0F, -0.38F, 5, 2, 16, -0.01F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 116, 22, -0.07F, -0.5F, 0.62F, 0, 1, 12, -0.01F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 42, 95, -2.0F, -0.5F, 1.62F, 0, 1, 9, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.UpperJaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.48F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 43, 0, -5.0F, 0.0F, 0.0F, 10, 2, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.5F, 0.0F, -15.0F);
        this.UpperJaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2182F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 57, 124, 2.0F, -0.5F, 1.62F, 0, 1, 9, -0.01F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 116, 36, 0.07F, -0.5F, 0.62F, 0, 1, 12, -0.01F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 55, -0.43F, -2.0F, -0.38F, 5, 2, 16, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.0F, 0.0F, -16.0F);
        this.UpperJaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.5672F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 5, 40, 0.0F, -2.0F, 0.0F, 1, 2, 1, -0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.0F, 0.0F, -16.0F);
        this.UpperJaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.5672F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 24, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.02F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.UpperJaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0611F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 55, 98, -4.0F, 0.0F, -9.02F, 8, 2, 9, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.UpperJaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0611F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 120, -2.5F, 0.0F, -16.0F, 5, 2, 7, -0.01F, false));

        this.LowerJaw = new AdvancedModelRenderer(this);
        this.LowerJaw.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Head.addChild(LowerJaw);
        this.setRotateAngle(LowerJaw, -0.0873F, 0.0F, 0.0F);
        this.LowerJaw.cubeList.add(new ModelBox(LowerJaw, 0, 4, -2.0F, 0.0F, -15.99F, 4, 2, 1, 0.0F, false));
        this.LowerJaw.cubeList.add(new ModelBox(LowerJaw, 54, 61, -2.5F, 0.0F, -15.0F, 5, 2, 16, 0.0F, false));
        this.LowerJaw.cubeList.add(new ModelBox(LowerJaw, 5, 27, -2.5F, -2.5F, -15.0F, 1, 3, 1, 0.0F, false));
        this.LowerJaw.cubeList.add(new ModelBox(LowerJaw, 0, 27, 1.5F, -2.5F, -15.0F, 1, 3, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.0F, 0.0F, -16.0F);
        this.LowerJaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.5672F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 37, 37, -1.0F, 0.0F, 0.01F, 1, 2, 1, -0.02F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.0F, 0.0F, -16.0F);
        this.LowerJaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.5672F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 40, 0.0F, 0.0F, 0.01F, 1, 2, 1, -0.02F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.5F, 0.0F, -15.0F);
        this.LowerJaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.2182F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 31, 39, -4.58F, 0.0F, -0.38F, 5, 2, 16, -0.01F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 109, 94, -0.07F, -0.5F, 0.62F, 0, 1, 12, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.5F, 0.0F, -15.0F);
        this.LowerJaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.2182F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 27, 58, -0.42F, 0.0F, -0.38F, 5, 2, 16, -0.01F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 113, 3, 0.07F, -0.5F, 0.62F, 0, 1, 12, -0.01F, false));

        this.bonejawthing = new AdvancedModelRenderer(this);
        this.bonejawthing.setRotationPoint(0.0F, 2.0F, -15.99F);
        this.LowerJaw.addChild(bonejawthing);
        this.setRotateAngle(bonejawthing, -0.1833F, 0.0F, 0.0F);
        this.bonejawthing.cubeList.add(new ModelBox(bonejawthing, 68, 0, -1.5F, -1.0F, 0.0F, 3, 1, 17, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.5F, 0.0F, -0.01F);
        this.bonejawthing.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.1972F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 43, 120, -2.32F, -3.0F, 8.73F, 3, 1, 8, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, 0.0F, -0.01F);
        this.bonejawthing.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.1972F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 112, 120, -0.68F, -3.0F, 8.73F, 3, 1, 8, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.5F, 0.0F, -0.01F);
        this.bonejawthing.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.1169F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 92, 0, -2.32F, -2.0F, 4.4F, 3, 1, 13, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 29, 77, -2.32F, -1.0F, 0.73F, 3, 1, 16, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.5F, 0.0F, -0.01F);
        this.bonejawthing.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.1169F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 22, 95, -0.68F, -2.0F, 4.4F, 3, 1, 13, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 52, 80, -0.68F, -1.0F, 0.73F, 3, 1, 16, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.5F, 0.0F, -0.01F);
        this.bonejawthing.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.6981F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 41, 28, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.02F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.5F, 0.0F, -0.01F);
        this.bonejawthing.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.6981F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 37, 41, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.02F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Mastodonsaurus.addChild(Body2);
        this.setRotateAngle(Body2, -0.0436F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 75, 80, -6.0F, -3.5F, 0.0F, 12, 7, 8, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 83, 96, -5.0F, -4.0F, 0.0F, 10, 1, 8, -0.02F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.Body2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 85, 46, -5.5F, -2.5F, 0.0F, 11, 2, 8, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, -0.0436F, 0.0F, 0.0F);
        this.Body3.cubeList.add(new ModelBox(Body3, 81, 61, -5.0F, -3.0F, 0.0F, 10, 6, 9, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Body3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1082F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 25, 110, -4.0F, 0.0F, 1.0F, 8, 1, 8, -0.03F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 4.0F, 0.0029F);
        this.Body3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0436F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 109, 110, -4.0F, -1.0F, 0.9971F, 8, 1, 8, 0.0F, false));

        this.RLeg = new AdvancedModelRenderer(this);
        this.RLeg.setRotationPoint(3.5F, 1.1309F, 7.0029F);
        this.Body3.addChild(RLeg);
        this.setRotateAngle(RLeg, 0.0393F, 0.5618F, 0.3294F);
        this.RLeg.cubeList.add(new ModelBox(RLeg, 120, 68, 0.0F, -1.1309F, -2.0029F, 6, 3, 4, 0.0F, false));

        this.RLeg2 = new AdvancedModelRenderer(this);
        this.RLeg2.setRotationPoint(4.5F, 0.3691F, -0.0029F);
        this.RLeg.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 0.0F, -1.2654F, 0.0F);
        this.RLeg2.cubeList.add(new ModelBox(RLeg2, 124, 50, -0.5F, -1.0F, -1.5F, 6, 2, 3, -0.01F, false));

        this.RFoot = new AdvancedModelRenderer(this);
        this.RFoot.setRotationPoint(5.5F, 0.0F, 0.0F);
        this.RLeg2.addChild(RFoot);
        this.setRotateAngle(RFoot, -0.1668F, 0.8294F, -0.3932F);
        this.RFoot.cubeList.add(new ModelBox(RFoot, 13, 110, -1.0F, -0.5F, -2.0F, 5, 1, 4, 0.0F, false));

        this.RLeg3 = new AdvancedModelRenderer(this);
        this.RLeg3.setRotationPoint(-3.5F, 1.1309F, 7.0029F);
        this.Body3.addChild(RLeg3);
        this.setRotateAngle(RLeg3, 0.0393F, -0.5618F, -0.3294F);
        this.RLeg3.cubeList.add(new ModelBox(RLeg3, 120, 68, -6.0F, -1.1309F, -2.0029F, 6, 3, 4, 0.0F, true));

        this.RLeg4 = new AdvancedModelRenderer(this);
        this.RLeg4.setRotationPoint(-4.5F, 0.3691F, -0.0029F);
        this.RLeg3.addChild(RLeg4);
        this.setRotateAngle(RLeg4, 0.0F, 1.2654F, 0.0F);
        this.RLeg4.cubeList.add(new ModelBox(RLeg4, 124, 50, -5.5F, -1.0F, -1.5F, 6, 2, 3, -0.01F, true));

        this.RFoot2 = new AdvancedModelRenderer(this);
        this.RFoot2.setRotationPoint(-5.5F, 0.0F, 0.0F);
        this.RLeg4.addChild(RFoot2);
        this.setRotateAngle(RFoot2, -0.1668F, -0.8294F, 0.3932F);
        this.RFoot2.cubeList.add(new ModelBox(RFoot2, 13, 110, -4.0F, -0.5F, -2.0F, 5, 1, 4, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Body3.addChild(Tail);
        this.setRotateAngle(Tail, 0.0436F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 90, -3.5F, -2.5F, -1.0F, 7, 5, 10, 0.0F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 95, 118, 0.0F, -5.0F, 0.0F, 0, 10, 8, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.Tail.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0911F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 111, 57, -2.5F, -1.0F, 0.0F, 5, 1, 9, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0436F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 58, 110, -2.0F, -2.0F, 0.0F, 4, 4, 9, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 76, 118, -0.01F, -5.0F, 0.0F, 0, 10, 9, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Tail2.addChild(bone);
        this.setRotateAngle(bone, -0.0436F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 122, 87, -1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 106, 0.0F, -4.0F, 0.0F, 0, 8, 12, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Mastodonsaurus.render(f5 * 1.375F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Neck.offsetY = -0.001F;
        this.LowerJaw.rotateAngleX = (float) Math.toRadians(35);
        this.Head.rotateAngleX = (float) Math.toRadians(-15);
        this.Neck.render(0.01F);
        GlStateManager.enableCull();
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
        this.Mastodonsaurus.offsetY = -0.50F; //72

        EntityPrehistoricFloraMastodonsaurus Mastodonsaurus = (EntityPrehistoricFloraMastodonsaurus) e;

        this.faceTarget(f3, f4, 4, Neck);
        this.faceTarget(f3, f4, 4, Head);

        float speed = 0.225F;
        if (Mastodonsaurus.getIsFast()) {
            speed = speed * 1.52F;
        }

        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2};
        AdvancedModelRenderer[] Torso = {this.Neck, this.Body, this.Body2, this.Body3};

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        float bottomModifierTail = 1F;
        boolean atBottom = false;
        if (Mastodonsaurus.isReallyInWater() && isAtBottom && !Mastodonsaurus.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.12F;
            bottomModifierTail = 0.3F;
            atBottom = true;
        }


        if (!Mastodonsaurus.isReallyInWater()) {

            if (f3 == 0.0F || !Mastodonsaurus.getIsMoving()) { //Not moving
                return;
            }

            this.flap(RLeg, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
            this.swing(RLeg, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(RLeg2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
            this.walk(RFoot, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.flap(RLeg3, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
            this.swing(RLeg3, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(RLeg4, speed, -0.6F, true, 8, 0F, f2, 0.8F);
            this.walk(RFoot2, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(RArm, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(RArm, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(RArm2, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(RHand, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(RArm3, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(RArm3, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(RArm4, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
            this.walk(RHand2, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.1F, -0.2, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.2, f2, 0.7F);
            //this.bob(Mastodonsaurus, speed*2, 0.3F, false, f2, 1F);

            this.Mastodonsaurus.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, 1.5F, f2, 1);

        }
        else {
            speed = speed * 2F;

            if (!atBottom) {

                this.setRotateAngle(RArm, 0, (float) Math.toRadians(-50), (float) Math.toRadians(10));
                this.setRotateAngle(RArm3, 0, (float) Math.toRadians(50), (float) Math.toRadians(-10));
                this.setRotateAngle(RArm2, 0, (float) Math.toRadians(-20), 0);
                this.setRotateAngle(RArm4, 0, (float) Math.toRadians(20), 0);
                this.setRotateAngle(RHand, 0.1414F, (float) Math.toRadians(3), -0.0542F);
                this.setRotateAngle(RHand2, 0.1414F, (float) Math.toRadians(-3), 0.0542F);

                this.setRotateAngle(RLeg, (float) Math.toRadians(-2.2535), (float) Math.toRadians(-30.3117), (float) Math.toRadians(18.8722));
                this.setRotateAngle(RLeg3, (float) Math.toRadians(-2.2535), (float) Math.toRadians(30.3117), (float) Math.toRadians(-18.8722));
                this.setRotateAngle(RLeg2, (float) Math.toRadians(0), (float) Math.toRadians(-72.5), (float) Math.toRadians(0));
                this.setRotateAngle(RLeg4, (float) Math.toRadians(0), (float) Math.toRadians(72.5), (float) Math.toRadians(0));
                this.setRotateAngle(RFoot, (float) Math.toRadians(9.5576), (float) Math.toRadians(20.0197), (float) Math.toRadians(-22.5273));
                this.setRotateAngle(RFoot2, (float) Math.toRadians(9.5576), (float) Math.toRadians(-20.0197), (float) Math.toRadians(22.5273));

                AdvancedModelRenderer[] BackL = {this.RLeg2, this.RFoot};
                AdvancedModelRenderer[] BackR = {this.RLeg4, this.RFoot2};
                AdvancedModelRenderer[] FrontL = {this.RArm, this.RArm2};
                AdvancedModelRenderer[] FrontR = {this.RArm3, this.RArm4};

                this.chainWaveExtended(FrontL, speed * 0.85F, -0.2F, -2, 1F, f2, 1);
                this.chainWaveExtended(FrontR, speed * 0.85F, -0.2F, -2, 4F, f2, 1);
                this.chainWaveExtended(BackL, speed * 0.85F, -0.2F, -2, 1F, f2, 1);
                this.chainWaveExtended(BackR, speed * 0.85F, -0.2F, -2, 4F, f2, 1);

            }
            else if (f3 != 0 && Mastodonsaurus.getIsMoving()) {
                this.flap(RLeg, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
                this.swing(RLeg, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
                this.walk(RLeg2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
                this.walk(RFoot, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

                this.flap(RLeg3, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
                this.swing(RLeg3, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
                this.walk(RLeg4, speed, -0.6F, true, 8, 0F, f2, 0.8F);
                this.walk(RFoot2, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

                this.flap(RArm, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
                this.swing(RArm, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
                this.walk(RArm2, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
                this.walk(RHand, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

                this.flap(RArm3, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
                this.swing(RArm3, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
                this.walk(RArm4, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
                this.walk(RHand2, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

                this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
                this.chainSwing(Torso, speed, 0.1F, -0.2, f2, 0.7F);
                //this.bob(Mastodonsaurus, speed*2, 0.3F, false, f2, 1F);

                this.Mastodonsaurus.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, 1.5F, f2, 1);

            }

            this.chainSwing(Tail, speed * bottomModifierTail, 0.6F * bottomModifierTail, -0.4, f2, 0.5F * bottomModifierTail);
            if (!atBottom) {
                this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
                this.chainSwing(Torso, speed, 0.15F, -0.2, f2, 0.7F);
            }
            else {
                this.swing(Neck, speed * bottomModifierTail * 0.33F, 0.1F, false, 0, -0.05F, f2, 0.5F);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Head, 0,0,-0.3F);
        animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.LowerJaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.Head, 0,0,-0.3F);
        animator.rotate(this.Head, (float) Math.toRadians(-45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.LowerJaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
