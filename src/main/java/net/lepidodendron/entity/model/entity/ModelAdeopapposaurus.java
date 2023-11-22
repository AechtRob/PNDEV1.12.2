package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAdeopapposaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAdeopapposaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer arm;
    private final AdvancedModelRenderer forearm;
    private final AdvancedModelRenderer hand;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer arm2;
    private final AdvancedModelRenderer forearm2;
    private final AdvancedModelRenderer hand2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer lips;
    private final AdvancedModelRenderer lips2;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer teeth;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer ThroatPouch;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer UpperLegR;
    private final AdvancedModelRenderer LowerLegR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer ToesR;
    private final AdvancedModelRenderer UpperLegR2;
    private final AdvancedModelRenderer LowerLegR2;
    private final AdvancedModelRenderer FootR2;
    private final AdvancedModelRenderer ToesR2;
    private ModelAnimator animator;

    public ModelAdeopapposaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 6.5F, 1.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Root.addChild(Hips);
        this.Hips.cubeList.add(new ModelBox(Hips, 26, 30, -4.0F, -3.0F, -4.0F, 8, 10, 8, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.1F, -4.0F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, 0.0436F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -4.5F, -3.0F, -8.0F, 9, 10, 9, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -6.0F, -8.0F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 18, 0.75F, 0.3916F, 0.3842F, 0, 3, 9, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 18, -0.75F, 0.3916F, 0.3842F, 0, 3, 9, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 18, 2.5F, 0.0F, -9.0F, 0, 2, 9, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 18, -2.5F, 0.0F, -9.0F, 0, 2, 9, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.0436F, 0.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 48, 0, -4.0F, -3.0F, -7.0F, 8, 9, 7, 0.0F, false));
        this.Chest.cubeList.add(new ModelBox(Chest, 48, 9, -3.0F, 6.0F, -7.0F, 0, 2, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -6.0F, -1.0F);
        this.Chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 22, 0.75F, 0.4015F, -6.3165F, 0, 3, 6, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 22, -0.75F, 0.4015F, -6.3165F, 0, 3, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.0F, -1.0F);
        this.Chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 24, 2.5F, -1.5529F, -5.7956F, 0, 2, 6, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 24, -2.5F, -1.5529F, -5.7956F, 0, 2, 6, 0.0F, false));

        this.arm = new AdvancedModelRenderer(this);
        this.arm.setRotationPoint(-4.0F, 4.0F, -4.5F);
        this.Chest.addChild(arm);
        this.setRotateAngle(arm, 0.9604F, -0.025F, -0.0357F);
        this.arm.cubeList.add(new ModelBox(arm, 43, 62, -1.0F, -1.0F, -1.5F, 2, 5, 3, 0.0F, false));
        this.arm.cubeList.add(new ModelBox(arm, 23, 18, -0.49F, -1.0F, 1.5F, 0, 5, 1, 0.0F, false));

        this.forearm = new AdvancedModelRenderer(this);
        this.forearm.setRotationPoint(0.0F, 3.0F, 0.5F);
        this.arm.addChild(forearm);
        this.setRotateAngle(forearm, -1.1345F, 0.0F, 0.0F);
        this.forearm.cubeList.add(new ModelBox(forearm, 62, 33, -1.0F, 0.0F, -2.0F, 2, 5, 3, -0.002F, false));
        this.forearm.cubeList.add(new ModelBox(forearm, 21, 18, -0.5F, -1.0F, 1.0F, 0, 6, 1, 0.0F, false));

        this.hand = new AdvancedModelRenderer(this);
        this.hand.setRotationPoint(-0.5F, 4.5F, -0.5F);
        this.forearm.addChild(hand);
        this.setRotateAngle(hand, 0.0F, 0.0F, -0.48F);
        this.hand.cubeList.add(new ModelBox(hand, 0, 0, -0.5F, 0.0F, -1.5F, 1, 4, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.0F, -1.5F);
        this.hand.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5178F, -0.045F, -0.258F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 0, 0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F, false));

        this.arm2 = new AdvancedModelRenderer(this);
        this.arm2.setRotationPoint(4.0F, 4.0F, -4.5F);
        this.Chest.addChild(arm2);
        this.setRotateAngle(arm2, 0.9604F, 0.025F, 0.0357F);
        this.arm2.cubeList.add(new ModelBox(arm2, 43, 62, -1.0F, -1.0F, -1.5F, 2, 5, 3, 0.0F, true));
        this.arm2.cubeList.add(new ModelBox(arm2, 23, 18, 0.49F, -1.0F, 1.5F, 0, 5, 1, 0.0F, true));

        this.forearm2 = new AdvancedModelRenderer(this);
        this.forearm2.setRotationPoint(0.0F, 3.0F, 0.5F);
        this.arm2.addChild(forearm2);
        this.setRotateAngle(forearm2, -1.1345F, 0.0F, 0.0F);
        this.forearm2.cubeList.add(new ModelBox(forearm2, 62, 33, -1.0F, 0.0F, -2.0F, 2, 5, 3, -0.002F, true));
        this.forearm2.cubeList.add(new ModelBox(forearm2, 21, 18, 0.5F, -1.0F, 1.0F, 0, 6, 1, 0.0F, true));

        this.hand2 = new AdvancedModelRenderer(this);
        this.hand2.setRotationPoint(0.5F, 4.5F, -0.5F);
        this.forearm2.addChild(hand2);
        this.setRotateAngle(hand2, 0.0F, 0.0F, 0.48F);
        this.hand2.cubeList.add(new ModelBox(hand2, 0, 0, -0.5F, 0.0F, -1.5F, 1, 4, 3, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.0F, -1.5F);
        this.hand2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5178F, 0.045F, 0.258F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 0, -1.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F, true));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -0.7F, -5.75F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.4363F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 46, 51, -2.5F, -2.0F, -6.0F, 5, 5, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.0F, -6.0F);
        this.Neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 13, 1.5F, 0.0F, 0.0F, 0, 6, 6, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 13, -1.5F, 0.0F, 0.0F, 0, 6, 6, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.5F, -5.15F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.1745F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 53, 23, -1.5F, -1.5F, -6.0F, 3, 4, 6, 0.0F, false));
        this.Neck2.cubeList.add(new ModelBox(Neck2, 0, 19, -1.0F, 2.5F, -6.0F, 0, 3, 6, 0.0F, false));
        this.Neck2.cubeList.add(new ModelBox(Neck2, 0, 19, 1.0F, 2.5F, -6.0F, 0, 3, 6, 0.0F, true));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 0.0F, -5.4F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.3054F, 0.0F, 0.0F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 14, 57, -1.0F, -1.5F, -6.0F, 2, 3, 6, -0.002F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.6F, -5.6F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.2618F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 47, -1.5F, -1.0F, -2.0F, 3, 2, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 7, -1.5F, -0.5F, -1.98F, 3, 1, 1, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0262F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 50, 33, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.lips = new AdvancedModelRenderer(this);
        this.lips.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Head.addChild(lips);
        this.setRotateAngle(lips, 0.0349F, 0.0F, 0.0F);
        this.lips.cubeList.add(new ModelBox(lips, 10, 55, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.002F, false));

        this.lips2 = new AdvancedModelRenderer(this);
        this.lips2.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.lips.addChild(lips2);
        this.setRotateAngle(lips2, -0.1309F, 0.0F, 0.0F);
        this.lips2.cubeList.add(new ModelBox(lips2, 19, 41, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.lips2.addChild(nose);
        this.setRotateAngle(nose, 0.7854F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 19, 44, -0.5F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.nose.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5236F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 5, 0, -0.5F, 0.0F, 0.1F, 1, 1, 1, -0.002F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 25, -0.5F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

        this.teeth = new AdvancedModelRenderer(this);
        this.teeth.setRotationPoint(-0.25F, 1.0F, -6.8F);
        this.Head.addChild(teeth);
        this.setRotateAngle(teeth, -0.1291F, -0.1139F, -0.0052F);
        this.teeth.cubeList.add(new ModelBox(teeth, 0, 0, 0.0F, -0.8F, 1.0F, 0, 1, 1, 0.0F, false));
        this.teeth.cubeList.add(new ModelBox(teeth, 0, 0, 0.5F, -0.8F, 1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -0.3F, 3.0F);
        this.teeth.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 0, 0.0F, -0.5F, -0.1F, 0, 1, 2, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 0, -0.5F, -0.5F, -0.1F, 0, 1, 2, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 19, 48, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4014F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 7, 38, -1.0F, -2.0F, 0.33F, 2, 2, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.25F, 0.0F, -5.0F);
        this.Jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0436F, 0.1309F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 27, 2, 0.0F, -0.5F, -0.4F, 0, 1, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.25F, 0.0F, -5.0F);
        this.Jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0436F, -0.1309F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 2, 0.0F, -0.5F, -0.4F, 0, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.Jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 38, -0.5F, -1.0F, -3.998F, 1, 1, 2, -0.002F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 40, 51, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.ThroatPouch = new AdvancedModelRenderer(this);
        this.ThroatPouch.setRotationPoint(0.0F, 1.5F, -3.0F);
        this.Neck3.addChild(ThroatPouch);
        this.ThroatPouch.cubeList.add(new ModelBox(ThroatPouch, 41, 0, -1.0F, -2.0F, -3.0F, 2, 2, 3, -0.006F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.1F, 3.0F);
        this.Hips.addChild(Tail);
        this.setRotateAngle(Tail, -0.0873F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 25, 8, -3.0F, -3.0F, 0.0F, 6, 8, 11, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0873F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 19, -2.0F, -2.5F, 0.0F, 4, 6, 13, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0873F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 38, -1.5F, -2.0F, 0.0F, 3, 4, 13, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0873F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 45, 35, -1.0F, -1.5F, 0.0F, 2, 3, 13, 0.0F, false));

        this.UpperLegR = new AdvancedModelRenderer(this);
        this.UpperLegR.setRotationPoint(-4.0F, 1.5F, 0.5F);
        this.Hips.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, -0.5236F, 0.0F, 0.0F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 26, 49, -2.0F, -1.5F, -3.0F, 4, 8, 6, 0.0F, false));

        this.LowerLegR = new AdvancedModelRenderer(this);
        this.LowerLegR.setRotationPoint(0.0F, 6.5F, -2.0F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, 1.1345F, 0.0F, 0.0F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 0, 55, -1.5F, 0.0F, 0.0F, 3, 8, 4, -0.002F, false));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.0F, 8.0F, 3.5F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, -0.6981F, 0.0F, 0.0F);
        this.FootR.cubeList.add(new ModelBox(FootR, 0, 38, -1.0F, 0.0F, -3.0F, 2, 6, 3, 0.0F, false));

        this.ToesR = new AdvancedModelRenderer(this);
        this.ToesR.setRotationPoint(0.0F, 6.0F, -1.5F);
        this.FootR.addChild(ToesR);
        this.setRotateAngle(ToesR, 0.0873F, 0.0F, 0.0F);
        this.ToesR.cubeList.add(new ModelBox(ToesR, 27, 0, -2.0F, -1.0F, -5.0F, 4, 2, 6, 0.0F, false));

        this.UpperLegR2 = new AdvancedModelRenderer(this);
        this.UpperLegR2.setRotationPoint(4.0F, 1.5F, 0.5F);
        this.Hips.addChild(UpperLegR2);
        this.setRotateAngle(UpperLegR2, -0.5236F, 0.0F, 0.0F);
        this.UpperLegR2.cubeList.add(new ModelBox(UpperLegR2, 26, 49, -2.0F, -1.5F, -3.0F, 4, 8, 6, 0.0F, true));

        this.LowerLegR2 = new AdvancedModelRenderer(this);
        this.LowerLegR2.setRotationPoint(0.0F, 6.5F, -2.0F);
        this.UpperLegR2.addChild(LowerLegR2);
        this.setRotateAngle(LowerLegR2, 1.1345F, 0.0F, 0.0F);
        this.LowerLegR2.cubeList.add(new ModelBox(LowerLegR2, 0, 55, -1.5F, 0.0F, 0.0F, 3, 8, 4, -0.002F, true));

        this.FootR2 = new AdvancedModelRenderer(this);
        this.FootR2.setRotationPoint(0.0F, 8.0F, 3.5F);
        this.LowerLegR2.addChild(FootR2);
        this.setRotateAngle(FootR2, -0.6981F, 0.0F, 0.0F);
        this.FootR2.cubeList.add(new ModelBox(FootR2, 0, 38, -1.0F, 0.0F, -3.0F, 2, 6, 3, 0.0F, true));

        this.ToesR2 = new AdvancedModelRenderer(this);
        this.ToesR2.setRotationPoint(0.0F, 6.0F, -1.5F);
        this.FootR2.addChild(ToesR2);
        this.setRotateAngle(ToesR2, 0.0873F, 0.0F, 0.0F);
        this.ToesR2.cubeList.add(new ModelBox(ToesR2, 27, 0, -2.0F, -1.0F, -5.0F, 4, 2, 6, 0.0F, true));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
    }
    public void renderStatic(float f) {

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

        EntityPrehistoricFloraAdeopapposaurus entityAdeopapposaurus = (EntityPrehistoricFloraAdeopapposaurus) e;

        this.faceTarget(f3, f4, 12, Neck);
        this.faceTarget(f3, f4, 12, Neck2);
        this.faceTarget(f3, f4, 12, Neck3);
        this.faceTarget(f3, f4, 12, Head);

        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Neck = {this.Neck, this.Neck2, this.Neck3, this.Head};
        AdvancedModelRenderer[] ArmL = {this.arm2, this.forearm2};
        AdvancedModelRenderer[] ArmR = {this.arm, this.forearm};

        entityAdeopapposaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityAdeopapposaurus.getAnimation() == entityAdeopapposaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityAdeopapposaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityAdeopapposaurus.getIsMoving()) {
                    if (entityAdeopapposaurus.getAnimation() != entityAdeopapposaurus.EAT_ANIMATION
                        && entityAdeopapposaurus.getAnimation() != entityAdeopapposaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                        this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                        this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                        this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                        this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityAdeopapposaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraAdeopapposaurus ee = (EntityPrehistoricFloraAdeopapposaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LOOK_ANIMATION) {
            animLook(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }


    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAdeopapposaurus entity = (EntityPrehistoricFloraAdeopapposaurus) entitylivingbaseIn;

        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -1.5 + (((tickAnim - 13) / 6) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -1.5 + (((tickAnim - 8) / 10) * (1.15-(-1.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 1.15 + (((tickAnim - 18) / 7) * (0-(1.15)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -1.25 + (((tickAnim - 8) / 10) * (-3-(-1.25)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -3 + (((tickAnim - 18) / 7) * (0-(-3)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (10.25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 10.25 + (((tickAnim - 12) / 13) * (0-(10.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm, arm.rotateAngleX + (float) Math.toRadians(xx), arm.rotateAngleY + (float) Math.toRadians(yy), arm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-21.5211-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-11.2497-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.0806-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -21.5211 + (((tickAnim - 12) / 13) * (0-(-21.5211)));
            yy = -11.2497 + (((tickAnim - 12) / 13) * (0-(-11.2497)));
            zz = 0.0806 + (((tickAnim - 12) / 13) * (0-(0.0806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forearm, forearm.rotateAngleX + (float) Math.toRadians(xx), forearm.rotateAngleY + (float) Math.toRadians(yy), forearm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0.225 + (((tickAnim - 12) / 13) * (0-(0.225)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.forearm.rotationPointX = this.forearm.rotationPointX + (float)(xx);
        this.forearm.rotationPointY = this.forearm.rotationPointY - (float)(yy);
        this.forearm.rotationPointZ = this.forearm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-21.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -21.25 + (((tickAnim - 15) / 10) * (0-(-21.25)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hand, hand.rotateAngleX + (float) Math.toRadians(xx), hand.rotateAngleY + (float) Math.toRadians(yy), hand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-10.25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = -10.25 + (((tickAnim - 12) / 13) * (0-(-10.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(xx), arm2.rotateAngleY + (float) Math.toRadians(yy), arm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-20.77111-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (11.24973-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.0806-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -20.77111 + (((tickAnim - 12) / 13) * (0-(-20.77111)));
            yy = 11.24973 + (((tickAnim - 12) / 13) * (0-(11.24973)));
            zz = -0.0806 + (((tickAnim - 12) / 13) * (0-(-0.0806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forearm2, forearm2.rotateAngleX + (float) Math.toRadians(xx), forearm2.rotateAngleY + (float) Math.toRadians(yy), forearm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0.225 + (((tickAnim - 12) / 13) * (0-(0.225)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.forearm2.rotationPointX = this.forearm2.rotationPointX + (float)(xx);
        this.forearm2.rotationPointY = this.forearm2.rotationPointY - (float)(yy);
        this.forearm2.rotationPointZ = this.forearm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (21.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 21.25 + (((tickAnim - 15) / 10) * (0-(21.25)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hand2, hand2.rotateAngleX + (float) Math.toRadians(xx), hand2.rotateAngleY + (float) Math.toRadians(yy), hand2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -6.25 + (((tickAnim - 13) / 12) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -5 + (((tickAnim - 13) / 12) * (0-(-5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 2.75 + (((tickAnim - 13) / 6) * (-7.88-(2.75)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -7.88 + (((tickAnim - 19) / 6) * (0-(-7.88)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 7.75 + (((tickAnim - 8) / 5) * (-0.75-(7.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -0.75 + (((tickAnim - 13) / 6) * (-8.1-(-0.75)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -8.1 + (((tickAnim - 19) / 6) * (0-(-8.1)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 15 + (((tickAnim - 8) / 7) * (12.74-(15)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 12.74 + (((tickAnim - 15) / 7) * (0-(12.74)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.09-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 10) / 2) * (0-(0.09)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0.09-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 13) / 2) * (0-(0.09)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
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

    public void animLook(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAdeopapposaurus entity = (EntityPrehistoricFloraAdeopapposaurus) entitylivingbaseIn;

        int animCycle = 70;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -7.5 + (((tickAnim - 13) / 12) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 39) {
            xx = -7.5 + (((tickAnim - 25) / 14) * (-7.52832-(-7.5)));
            yy = 0 + (((tickAnim - 25) / 14) * (-4.95712-(0)));
            zz = 0 + (((tickAnim - 25) / 14) * (0.65426-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 52) {
            xx = -7.52832 + (((tickAnim - 39) / 13) * (-10.00708-(-7.52832)));
            yy = -4.95712 + (((tickAnim - 39) / 13) * (1.06226-(-4.95712)));
            zz = 0.65426 + (((tickAnim - 39) / 13) * (-0.13969-(0.65426)));
        }
        else if (tickAnim >= 52 && tickAnim < 57) {
            xx = -10.00708 + (((tickAnim - 52) / 5) * (-7.5-(-10.00708)));
            yy = 1.06226 + (((tickAnim - 52) / 5) * (0-(1.06226)));
            zz = -0.13969 + (((tickAnim - 52) / 5) * (0-(-0.13969)));
        }
        else if (tickAnim >= 57 && tickAnim < 70) {
            xx = -7.5 + (((tickAnim - 57) / 13) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 57) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -5 + (((tickAnim - 13) / 13) * (0-(-5)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 26) / 20) * (4.26-(0)));
            yy = 0 + (((tickAnim - 26) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 20) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 57) {
            xx = 4.26 + (((tickAnim - 46) / 11) * (-5-(4.26)));
            yy = 0 + (((tickAnim - 46) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 11) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 70) {
            xx = -5 + (((tickAnim - 57) / 13) * (0-(-5)));
            yy = 0 + (((tickAnim - 57) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (15.54-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 15.54 + (((tickAnim - 8) / 5) * (12.5-(15.54)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 12.5 + (((tickAnim - 13) / 10) * (12.62314-(12.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (-14.97137-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (-0.93716-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 12.62314 + (((tickAnim - 23) / 9) * (12.62314-(12.62314)));
            yy = -14.97137 + (((tickAnim - 23) / 9) * (-14.97137-(-14.97137)));
            zz = -0.93716 + (((tickAnim - 23) / 9) * (-0.93716-(-0.93716)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 12.62314 + (((tickAnim - 32) / 6) * (5.12314-(12.62314)));
            yy = -14.97137 + (((tickAnim - 32) / 6) * (-5.51577-(-14.97137)));
            zz = -0.93716 + (((tickAnim - 32) / 6) * (-0.34527-(-0.93716)));
        }
        else if (tickAnim >= 38 && tickAnim < 51) {
            xx = 5.12314 + (((tickAnim - 38) / 13) * (12.62314-(5.12314)));
            yy = -5.51577 + (((tickAnim - 38) / 13) * (14.97137-(-5.51577)));
            zz = -0.34527 + (((tickAnim - 38) / 13) * (0.93716-(-0.34527)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = 12.62314 + (((tickAnim - 51) / 8) * (12.62314-(12.62314)));
            yy = 14.97137 + (((tickAnim - 51) / 8) * (14.97137-(14.97137)));
            zz = 0.93716 + (((tickAnim - 51) / 8) * (0.93716-(0.93716)));
        }
        else if (tickAnim >= 59 && tickAnim < 70) {
            xx = 12.62314 + (((tickAnim - 59) / 11) * (0-(12.62314)));
            yy = 14.97137 + (((tickAnim - 59) / 11) * (0-(14.97137)));
            zz = 0.93716 + (((tickAnim - 59) / 11) * (0-(0.93716)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (26.07-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 26.07 + (((tickAnim - 8) / 5) * (-5-(26.07)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -5 + (((tickAnim - 13) / 10) * (15.08377-(-5)));
            yy = 0 + (((tickAnim - 13) / 10) * (-4.53051-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (-2.11751-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 15.08377 + (((tickAnim - 23) / 9) * (25.08377-(15.08377)));
            yy = -4.53051 + (((tickAnim - 23) / 9) * (-4.53051-(-4.53051)));
            zz = -2.11751 + (((tickAnim - 23) / 9) * (-2.11751-(-2.11751)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 25.08377 + (((tickAnim - 32) / 10) * (20.08377-(25.08377)));
            yy = -4.53051 + (((tickAnim - 32) / 10) * (0.19698-(-4.53051)));
            zz = -2.11751 + (((tickAnim - 32) / 10) * (0.09207-(-2.11751)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = 20.08377 + (((tickAnim - 42) / 9) * (2.58377-(20.08377)));
            yy = 0.19698 + (((tickAnim - 42) / 9) * (4.53051-(0.19698)));
            zz = 0.09207 + (((tickAnim - 42) / 9) * (2.11751-(0.09207)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = 2.58377 + (((tickAnim - 51) / 8) * (15.08377-(2.58377)));
            yy = 4.53051 + (((tickAnim - 51) / 8) * (4.53051-(4.53051)));
            zz = 2.11751 + (((tickAnim - 51) / 8) * (2.11751-(2.11751)));
        }
        else if (tickAnim >= 59 && tickAnim < 70) {
            xx = 15.08377 + (((tickAnim - 59) / 11) * (0-(15.08377)));
            yy = 4.53051 + (((tickAnim - 59) / 11) * (0-(4.53051)));
            zz = 2.11751 + (((tickAnim - 59) / 11) * (0-(2.11751)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 3.75 + (((tickAnim - 7) / 11) * (-1.33626-(3.75)));
            yy = 0 + (((tickAnim - 7) / 11) * (-4.07965-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (-2.8265-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -1.33626 + (((tickAnim - 18) / 5) * (-9.59066-(-1.33626)));
            yy = -4.07965 + (((tickAnim - 18) / 5) * (-10.19911-(-4.07965)));
            zz = -2.8265 + (((tickAnim - 18) / 5) * (-7.06626-(-2.8265)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -9.59066 + (((tickAnim - 23) / 9) * (-9.59066-(-9.59066)));
            yy = -10.19911 + (((tickAnim - 23) / 9) * (-10.19911-(-10.19911)));
            zz = -7.06626 + (((tickAnim - 23) / 9) * (-7.06626-(-7.06626)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -9.59066 + (((tickAnim - 32) / 9) * (2.90934-(-9.59066)));
            yy = -10.19911 + (((tickAnim - 32) / 9) * (0.5368-(-10.19911)));
            zz = -7.06626 + (((tickAnim - 32) / 9) * (0.37191-(-7.06626)));
        }
        else if (tickAnim >= 41 && tickAnim < 51) {
            xx = 2.90934 + (((tickAnim - 41) / 10) * (-9.59066-(2.90934)));
            yy = 0.5368 + (((tickAnim - 41) / 10) * (10.19911-(0.5368)));
            zz = 0.37191 + (((tickAnim - 41) / 10) * (7.06626-(0.37191)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = -9.59066 + (((tickAnim - 51) / 8) * (-9.59066-(-9.59066)));
            yy = 10.19911 + (((tickAnim - 51) / 8) * (10.19911-(10.19911)));
            zz = 7.06626 + (((tickAnim - 51) / 8) * (7.06626-(7.06626)));
        }
        else if (tickAnim >= 59 && tickAnim < 70) {
            xx = -9.59066 + (((tickAnim - 59) / 11) * (0-(-9.59066)));
            yy = 10.19911 + (((tickAnim - 59) / 11) * (0-(10.19911)));
            zz = 7.06626 + (((tickAnim - 59) / 11) * (0-(7.06626)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (14.11-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = 14.11 + (((tickAnim - 8) / 15) * (1.87242-(14.11)));
            yy = 0 + (((tickAnim - 8) / 15) * (-19.6835-(0)));
            zz = 0 + (((tickAnim - 8) / 15) * (3.61644-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 1.87242 + (((tickAnim - 23) / 4) * (-10.62758-(1.87242)));
            yy = -19.6835 + (((tickAnim - 23) / 4) * (-19.6835-(-19.6835)));
            zz = 3.61644 + (((tickAnim - 23) / 4) * (3.61644-(3.61644)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -10.62758 + (((tickAnim - 27) / 3) * (1.87242-(-10.62758)));
            yy = -19.6835 + (((tickAnim - 27) / 3) * (-19.6835-(-19.6835)));
            zz = 3.61644 + (((tickAnim - 27) / 3) * (3.61644-(3.61644)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 1.87242 + (((tickAnim - 30) / 3) * (-10.62758-(1.87242)));
            yy = -19.6835 + (((tickAnim - 30) / 3) * (-19.6835-(-19.6835)));
            zz = 3.61644 + (((tickAnim - 30) / 3) * (3.61644-(3.61644)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -10.62758 + (((tickAnim - 33) / 3) * (1.87242-(-10.62758)));
            yy = -19.6835 + (((tickAnim - 33) / 3) * (-19.6835-(-19.6835)));
            zz = 3.61644 + (((tickAnim - 33) / 3) * (3.61644-(3.61644)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 1.87242 + (((tickAnim - 36) / 5) * (-13.12758-(1.87242)));
            yy = -19.6835 + (((tickAnim - 36) / 5) * (-3.9367-(-19.6835)));
            zz = 3.61644 + (((tickAnim - 36) / 5) * (0.72329-(3.61644)));
        }
        else if (tickAnim >= 41 && tickAnim < 51) {
            xx = -13.12758 + (((tickAnim - 41) / 10) * (1.87242-(-13.12758)));
            yy = -3.9367 + (((tickAnim - 41) / 10) * (19.6835-(-3.9367)));
            zz = 0.72329 + (((tickAnim - 41) / 10) * (-3.61644-(0.72329)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = 1.87242 + (((tickAnim - 51) / 2) * (9.37242-(1.87242)));
            yy = 19.6835 + (((tickAnim - 51) / 2) * (19.6835-(19.6835)));
            zz = -3.61644 + (((tickAnim - 51) / 2) * (-3.61644-(-3.61644)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 9.37242 + (((tickAnim - 53) / 4) * (1.87242-(9.37242)));
            yy = 19.6835 + (((tickAnim - 53) / 4) * (19.6835-(19.6835)));
            zz = -3.61644 + (((tickAnim - 53) / 4) * (-3.61644-(-3.61644)));
        }
        else if (tickAnim >= 57 && tickAnim < 59) {
            xx = 1.87242 + (((tickAnim - 57) / 2) * (9.37242-(1.87242)));
            yy = 19.6835 + (((tickAnim - 57) / 2) * (19.6835-(19.6835)));
            zz = -3.61644 + (((tickAnim - 57) / 2) * (-3.61644-(-3.61644)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = 9.37242 + (((tickAnim - 59) / 4) * (1.87242-(9.37242)));
            yy = 19.6835 + (((tickAnim - 59) / 4) * (19.6835-(19.6835)));
            zz = -3.61644 + (((tickAnim - 59) / 4) * (-3.61644-(-3.61644)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 1.87242 + (((tickAnim - 63) / 7) * (0-(1.87242)));
            yy = 19.6835 + (((tickAnim - 63) / 7) * (0-(19.6835)));
            zz = -3.61644 + (((tickAnim - 63) / 7) * (0-(-3.61644)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAdeopapposaurus entity = (EntityPrehistoricFloraAdeopapposaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-3.77-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = -3.77 + (((tickAnim - 18) / 13) * (-3.77-(-3.77)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = -3.77 + (((tickAnim - 31) / 19) * (0-(-3.77)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -7 + (((tickAnim - 19) / 9) * (-7-(-7)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 28) / 22) * (0-(-7)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 8.75 + (((tickAnim - 19) / 9) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 28) / 22) * (0-(8.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 19) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 10) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (5.42-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 5.42 + (((tickAnim - 38) / 12) * (0-(5.42)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-6-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            zz = -6 + (((tickAnim - 13) / 16) * (0-(-6)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (7-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 38) / 12) * (0-(7)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0.55933-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-4.63358-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-6.17494-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 0.55933 + (((tickAnim - 13) / 16) * (0-(0.55933)));
            yy = -4.63358 + (((tickAnim - 13) / 16) * (0-(-4.63358)));
            zz = -6.17494 + (((tickAnim - 13) / 16) * (0-(-6.17494)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (4.5-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 4.5 + (((tickAnim - 38) / 5) * (6-(4.5)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 43) / 7) * (0-(6)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -6 + (((tickAnim - 19) / 9) * (-6-(-6)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 28) / 22) * (0-(-6)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 3 + (((tickAnim - 19) / 9) * (3-(3)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 3 + (((tickAnim - 28) / 8) * (-1.05-(3)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = -1.05 + (((tickAnim - 36) / 7) * (-3.56-(-1.05)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -3.56 + (((tickAnim - 43) / 7) * (0-(-3.56)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 8.5 + (((tickAnim - 19) / 9) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 8.5 + (((tickAnim - 28) / 8) * (1.27-(8.5)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 1.27 + (((tickAnim - 36) / 7) * (-4.58-(1.27)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -4.58 + (((tickAnim - 43) / 7) * (0-(-4.58)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 4.5 + (((tickAnim - 19) / 9) * (4.5-(4.5)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 4.5 + (((tickAnim - 28) / 22) * (0-(4.5)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.66-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 5.66 + (((tickAnim - 4) / 5) * (12.12-(5.66)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 12.12 + (((tickAnim - 9) / 5) * (17.84-(12.12)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 17.84 + (((tickAnim - 14) / 5) * (21.5-(17.84)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 21.5 + (((tickAnim - 19) / 9) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 21.5 + (((tickAnim - 28) / 11) * (13.5-(21.5)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 39) / 11) * (0-(13.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-9.83-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -9.83 + (((tickAnim - 4) / 5) * (-19.66-(-9.83)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -19.66 + (((tickAnim - 9) / 5) * (-28.91-(-19.66)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -28.91 + (((tickAnim - 14) / 5) * (-34.75-(-28.91)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -34.75 + (((tickAnim - 19) / 9) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = -34.75 + (((tickAnim - 28) / 11) * (-25.13-(-34.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -25.13 + (((tickAnim - 39) / 11) * (0-(-25.13)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0.175-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0.175 + (((tickAnim - 18) / 1) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootR.rotationPointX = this.FootR.rotationPointX + (float)(xx);
        this.FootR.rotationPointY = this.FootR.rotationPointY - (float)(yy);
        this.FootR.rotationPointZ = this.FootR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.52-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 3.52 + (((tickAnim - 4) / 5) * (7.25-(3.52)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 7.25 + (((tickAnim - 9) / 4) * (9.67-(7.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 9.67 + (((tickAnim - 13) / 1) * (10.76-(9.67)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 10.76 + (((tickAnim - 14) / 3) * (11-(10.76)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 11 + (((tickAnim - 17) / 2) * (13.75-(11)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 13.75 + (((tickAnim - 19) / 9) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 13.75 + (((tickAnim - 28) / 11) * (11.63-(13.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 11.63 + (((tickAnim - 39) / 11) * (0-(11.63)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0.235-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0.235 + (((tickAnim - 30) / 3) * (0.225-(0.235)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0.225 + (((tickAnim - 33) / 6) * (0-(0.225)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 42) / 2) * (0.2-(0.175)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 44) / 4) * (0.13-(0.2)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.13 + (((tickAnim - 48) / 2) * (0-(0.13)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ToesR.rotationPointX = this.ToesR.rotationPointX + (float)(xx);
        this.ToesR.rotationPointY = this.ToesR.rotationPointY - (float)(yy);
        this.ToesR.rotationPointZ = this.ToesR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = -4.5 + (((tickAnim - 19) / 9) * (-4.5-(-4.5)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -4.5 + (((tickAnim - 28) / 22) * (0-(-4.5)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR2, UpperLegR2.rotateAngleX + (float) Math.toRadians(xx), UpperLegR2.rotateAngleY + (float) Math.toRadians(yy), UpperLegR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.67-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 5.67 + (((tickAnim - 4) / 8) * (14.84-(5.67)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 14.84 + (((tickAnim - 12) / 4) * (19.56-(14.84)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 19.56 + (((tickAnim - 16) / 3) * (21.5-(19.56)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 21.5 + (((tickAnim - 19) / 9) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 21.5 + (((tickAnim - 28) / 11) * (13.5-(21.5)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 39) / 11) * (0-(13.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR2, LowerLegR2.rotateAngleX + (float) Math.toRadians(xx), LowerLegR2.rotateAngleY + (float) Math.toRadians(yy), LowerLegR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-9.55-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -9.55 + (((tickAnim - 4) / 8) * (-24.15-(-9.55)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -24.15 + (((tickAnim - 12) / 4) * (-31.21-(-24.15)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -31.21 + (((tickAnim - 16) / 3) * (-34.75-(-31.21)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -34.75 + (((tickAnim - 19) / 9) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = -34.75 + (((tickAnim - 28) / 11) * (-25.13-(-34.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -25.13 + (((tickAnim - 39) / 11) * (0-(-25.13)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR2, FootR2.rotateAngleX + (float) Math.toRadians(xx), FootR2.rotateAngleY + (float) Math.toRadians(yy), FootR2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0.1-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.1 + (((tickAnim - 18) / 1) * (0-(0.1)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootR2.rotationPointX = this.FootR2.rotationPointX + (float)(xx);
        this.FootR2.rotationPointY = this.FootR2.rotationPointY - (float)(yy);
        this.FootR2.rotationPointZ = this.FootR2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.49-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 19) {
            xx = 3.49 + (((tickAnim - 4) / 15) * (13.75-(3.49)));
            yy = 0 + (((tickAnim - 4) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 15) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 13.75 + (((tickAnim - 19) / 9) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 13.75 + (((tickAnim - 28) / 11) * (11.63-(13.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 11.63 + (((tickAnim - 39) / 11) * (0-(11.63)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR2, ToesR2.rotateAngleX + (float) Math.toRadians(xx), ToesR2.rotateAngleY + (float) Math.toRadians(yy), ToesR2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0.235-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0.235 + (((tickAnim - 30) / 3) * (0.225-(0.235)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0.225 + (((tickAnim - 33) / 6) * (0-(0.225)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 42) / 2) * (0.2-(0.175)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 44) / 4) * (0.13-(0.2)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.13 + (((tickAnim - 48) / 2) * (0-(0.13)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ToesR2.rotationPointX = this.ToesR2.rotationPointX + (float)(xx);
        this.ToesR2.rotationPointY = this.ToesR2.rotationPointY - (float)(yy);
        this.ToesR2.rotationPointZ = this.ToesR2.rotationPointZ + (float)(zz);


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAdeopapposaurus entity = (EntityPrehistoricFloraAdeopapposaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 0) / 50) * (-2-(-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 0) / 50) * (4-(4)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = 15.25 + (((tickAnim - 27) / 23) * (0-(15.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm, arm.rotateAngleX + (float) Math.toRadians(xx), arm.rotateAngleY + (float) Math.toRadians(yy), arm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = -34.25 + (((tickAnim - 27) / 23) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forearm, forearm.rotateAngleX + (float) Math.toRadians(xx), forearm.rotateAngleY + (float) Math.toRadians(yy), forearm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = 15.25 + (((tickAnim - 27) / 23) * (0-(15.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(xx), arm2.rotateAngleY + (float) Math.toRadians(yy), arm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = -34.25 + (((tickAnim - 27) / 23) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forearm2, forearm2.rotateAngleX + (float) Math.toRadians(xx), forearm2.rotateAngleY + (float) Math.toRadians(yy), forearm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.60681 + (((tickAnim - 0) / 50) * (-0.60681-(-0.60681)));
            yy = -2.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 50) * (-2.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(-2.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = 10.2559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*- + (((tickAnim - 0) / 50) * (10.2559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-(10.2559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.28486 + (((tickAnim - 0) / 50) * (-0.28486-(-0.28486)));
            yy = -8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1 + (((tickAnim - 0) / 50) * (-8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1-(-8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1)));
            zz = 4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 0) / 50) * (4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-(4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.8609 + (((tickAnim - 0) / 50) * (-0.8609-(-0.8609)));
            yy = -18.2291+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-155))*-1 + (((tickAnim - 0) / 50) * (-18.2291+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-155))*-1-(-18.2291+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-155))*-1)));
            zz = -0.9738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)) + (((tickAnim - 0) / 50) * (-0.9738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))-(-0.9738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -2.14987 + (((tickAnim - 0) / 50) * (-2.14987-(-2.14987)));
            yy = 2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4 + (((tickAnim - 0) / 50) * (2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4-(2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4)));
            zz = 10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 0) / 50) * (10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-(10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -18.19162 + (((tickAnim - 0) / 25) * (9.6812-(-18.19162)));
            yy = 1.58774 + (((tickAnim - 0) / 25) * (9.51868-(1.58774)));
            zz = 4.21113 + (((tickAnim - 0) / 25) * (4.87018-(4.21113)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 9.6812 + (((tickAnim - 25) / 15) * (-1.77073-(9.6812)));
            yy = 9.51868 + (((tickAnim - 25) / 15) * (-11.08171-(9.51868)));
            zz = 4.87018 + (((tickAnim - 25) / 15) * (-1.95086-(4.87018)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -1.77073 + (((tickAnim - 40) / 10) * (-18.19162-(-1.77073)));
            yy = -11.08171 + (((tickAnim - 40) / 10) * (1.58774-(-11.08171)));
            zz = -1.95086 + (((tickAnim - 40) / 10) * (4.21113-(-1.95086)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR2, UpperLegR2.rotateAngleX + (float) Math.toRadians(xx), UpperLegR2.rotateAngleY + (float) Math.toRadians(yy), UpperLegR2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-2.57-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = -2.57 + (((tickAnim - 25) / 8) * (0.745-(-2.57)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0.745 + (((tickAnim - 33) / 7) * (1.395-(0.745)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 1.395 + (((tickAnim - 40) / 10) * (0-(1.395)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.UpperLegR2.rotationPointX = this.UpperLegR2.rotationPointX + (float)(xx);
        this.UpperLegR2.rotationPointY = this.UpperLegR2.rotationPointY - (float)(yy);
        this.UpperLegR2.rotationPointZ = this.UpperLegR2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.5 + (((tickAnim - 0) / 5) * (-16.5-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -16.5 + (((tickAnim - 5) / 6) * (0.25-(-16.5)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 0.25 + (((tickAnim - 11) / 11) * (29.46255-(0.25)));
            yy = 0 + (((tickAnim - 11) / 11) * (-10.3634-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (-0.95634-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 29.46255 + (((tickAnim - 22) / 3) * (25.3741-(29.46255)));
            yy = -10.3634 + (((tickAnim - 22) / 3) * (-13.55214-(-10.3634)));
            zz = -0.95634 + (((tickAnim - 22) / 3) * (-1.2506-(-0.95634)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = 25.3741 + (((tickAnim - 25) / 18) * (22.69-(25.3741)));
            yy = -13.55214 + (((tickAnim - 25) / 18) * (0-(-13.55214)));
            zz = -1.2506 + (((tickAnim - 25) / 18) * (0-(-1.2506)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 22.69 + (((tickAnim - 43) / 7) * (-0.5-(22.69)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR2, LowerLegR2.rotateAngleX + (float) Math.toRadians(xx), LowerLegR2.rotateAngleY + (float) Math.toRadians(yy), LowerLegR2.rotateAngleZ + (float) Math.toRadians(zz));

        this.LowerLegR2.rotationPointX = this.LowerLegR2.rotationPointX + (float)(0.325);
        this.LowerLegR2.rotationPointY = this.LowerLegR2.rotationPointY - (float)(0);
        this.LowerLegR2.rotationPointZ = this.LowerLegR2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -8 + (((tickAnim - 0) / 5) * (4.5-(-8)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 4.5 + (((tickAnim - 5) / 3) * (-12.05-(4.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -12.05 + (((tickAnim - 8) / 3) * (-21.75-(-12.05)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -21.75 + (((tickAnim - 11) / 3) * (-31.64-(-21.75)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -31.64 + (((tickAnim - 14) / 4) * (-1.54-(-31.64)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -1.54 + (((tickAnim - 18) / 4) * (0.48-(-1.54)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0.48 + (((tickAnim - 22) / 6) * (14.7-(0.48)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 14.7 + (((tickAnim - 28) / 3) * (20.39-(14.7)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 44) {
            xx = 20.39 + (((tickAnim - 31) / 13) * (-54.58-(20.39)));
            yy = 0 + (((tickAnim - 31) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 13) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -54.58 + (((tickAnim - 44) / 6) * (-8-(-54.58)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR2, FootR2.rotateAngleX + (float) Math.toRadians(xx), FootR2.rotateAngleY + (float) Math.toRadians(yy), FootR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 16.75 + (((tickAnim - 0) / 8) * (31-(16.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 31 + (((tickAnim - 8) / 3) * (28.74024-(31)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.58463-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-1.91268-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 28.74024 + (((tickAnim - 11) / 2) * (28.89-(28.74024)));
            yy = 0.58463 + (((tickAnim - 11) / 2) * (0-(0.58463)));
            zz = -1.91268 + (((tickAnim - 11) / 2) * (0-(-1.91268)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 28.89 + (((tickAnim - 13) / 1) * (34.15-(28.89)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 34.15 + (((tickAnim - 14) / 3) * (-1.48-(34.15)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -1.48 + (((tickAnim - 17) / 1) * (-14.61-(-1.48)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -14.61 + (((tickAnim - 18) / 4) * (39.75-(-14.61)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 39.75 + (((tickAnim - 22) / 3) * (70.99002-(39.75)));
            yy = 0 + (((tickAnim - 22) / 3) * (0.18287-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (-6.24733-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 70.99002 + (((tickAnim - 25) / 3) * (76.75-(70.99002)));
            yy = 0.18287 + (((tickAnim - 25) / 3) * (0-(0.18287)));
            zz = -6.24733 + (((tickAnim - 25) / 3) * (0-(-6.24733)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 76.75 + (((tickAnim - 28) / 3) * (71-(76.75)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 71 + (((tickAnim - 31) / 9) * (56-(71)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 56 + (((tickAnim - 40) / 10) * (16.75-(56)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR2, ToesR2.rotateAngleX + (float) Math.toRadians(xx), ToesR2.rotateAngleY + (float) Math.toRadians(yy), ToesR2.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAdeopapposaurus entity = (EntityPrehistoricFloraAdeopapposaurus) entitylivingbaseIn;

        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 7.5 + (((tickAnim - 6) / 7) * (5-(7.5)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 5 + (((tickAnim - 13) / 11) * (5-(5)));
            yy = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 5 + (((tickAnim - 24) / 11) * (0-(5)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 6) / 7) * (5-(10)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 5 + (((tickAnim - 13) / 11) * (5-(5)));
            yy = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 5 + (((tickAnim - 24) / 11) * (0-(5)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 25) {
            xx = -17.5 + (((tickAnim - 7) / 18) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 7) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 18) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -17.5 + (((tickAnim - 25) / 10) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm, arm.rotateAngleX + (float) Math.toRadians(xx), arm.rotateAngleY + (float) Math.toRadians(yy), arm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 25) {
            xx = 25 + (((tickAnim - 7) / 18) * (25-(25)));
            yy = 0 + (((tickAnim - 7) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 18) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 25 + (((tickAnim - 25) / 10) * (0-(25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forearm, forearm.rotateAngleX + (float) Math.toRadians(xx), forearm.rotateAngleY + (float) Math.toRadians(yy), forearm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = -30 + (((tickAnim - 6) / 10) * (-127.6862-(-30)));
            yy = 0 + (((tickAnim - 6) / 10) * (3.89049-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (9.21927-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 35) {
            xx = -127.6862 + (((tickAnim - 16) / 19) * (0-(-127.6862)));
            yy = 3.89049 + (((tickAnim - 16) / 19) * (0-(3.89049)));
            zz = 9.21927 + (((tickAnim - 16) / 19) * (0-(9.21927)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(xx), arm2.rotateAngleY + (float) Math.toRadians(yy), arm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 30 + (((tickAnim - 6) / 10) * (33-(30)));
            yy = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 35) {
            xx = 33 + (((tickAnim - 16) / 19) * (0-(33)));
            yy = 0 + (((tickAnim - 16) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forearm2, forearm2.rotateAngleX + (float) Math.toRadians(xx), forearm2.rotateAngleY + (float) Math.toRadians(yy), forearm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (30.98-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 30.98 + (((tickAnim - 5) / 8) * (17.32-(30.98)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 17.32 + (((tickAnim - 13) / 7) * (17.32-(17.32)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 17.32 + (((tickAnim - 20) / 10) * (-17.68-(17.32)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -17.68 + (((tickAnim - 30) / 5) * (0-(-17.68)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (9.41-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 9.41 + (((tickAnim - 7) / 6) * (29.05-(9.41)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 29.05 + (((tickAnim - 13) / 7) * (21.99-(29.05)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 21.99 + (((tickAnim - 20) / 8) * (29.05-(21.99)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 29.05 + (((tickAnim - 28) / 7) * (0-(29.05)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-1.18-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -1.18 + (((tickAnim - 7) / 6) * (14.32-(-1.18)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 14.32 + (((tickAnim - 13) / 7) * (23.37-(14.32)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 23.37 + (((tickAnim - 20) / 7) * (11.82-(23.37)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 11.82 + (((tickAnim - 27) / 8) * (0-(11.82)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (19.31-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 19.31 + (((tickAnim - 5) / 8) * (18.95-(19.31)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 18.95 + (((tickAnim - 13) / 7) * (36.65113-(18.95)));
            yy = 0 + (((tickAnim - 13) / 7) * (-10.94769-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (2.35151-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 36.65113 + (((tickAnim - 20) / 7) * (18.95-(36.65113)));
            yy = -10.94769 + (((tickAnim - 20) / 7) * (0-(-10.94769)));
            zz = 2.35151 + (((tickAnim - 20) / 7) * (0-(2.35151)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 18.95 + (((tickAnim - 27) / 8) * (0-(18.95)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (15-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 15 + (((tickAnim - 18) / 5) * (0-(15)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (15-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 15 + (((tickAnim - 27) / 8) * (0-(15)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAdeopapposaurus entity = (EntityPrehistoricFloraAdeopapposaurus) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -6.75 + (((tickAnim - 8) / 7) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 8) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-0.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-0.3-(0)));
            zz = -0.25 + (((tickAnim - 10) / 5) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.9789-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (3.49315-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.21895-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0.9789 + (((tickAnim - 6) / 4) * (0-(0.9789)));
            yy = 3.49315 + (((tickAnim - 6) / 4) * (0-(3.49315)));
            zz = 0.21895 + (((tickAnim - 6) / 4) * (0-(0.21895)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.76796-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-7.21693-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.0465-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 5.76796 + (((tickAnim - 5) / 5) * (0-(5.76796)));
            yy = -7.21693 + (((tickAnim - 5) / 5) * (5.75-(-7.21693)));
            zz = -2.0465 + (((tickAnim - 5) / 5) * (0-(-2.0465)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 5.75 + (((tickAnim - 10) / 5) * (0-(5.75)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-55.14832-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (12.57952-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (28.62705-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -55.14832 + (((tickAnim - 5) / 4) * (-84.61028-(-55.14832)));
            yy = 12.57952 + (((tickAnim - 5) / 4) * (-24.48644-(12.57952)));
            zz = 28.62705 + (((tickAnim - 5) / 4) * (47.74012-(28.62705)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -84.61028 + (((tickAnim - 9) / 6) * (0-(-84.61028)));
            yy = -24.48644 + (((tickAnim - 9) / 6) * (0-(-24.48644)));
            zz = 47.74012 + (((tickAnim - 9) / 6) * (0-(47.74012)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm, arm.rotateAngleX + (float) Math.toRadians(xx), arm.rotateAngleY + (float) Math.toRadians(yy), arm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (25.75-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 14.25 + (((tickAnim - 4) / 5) * (22.44023-(14.25)));
            yy = 25.75 + (((tickAnim - 4) / 5) * (2.5816-(25.75)));
            zz = 0 + (((tickAnim - 4) / 5) * (20.9273-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 22.44023 + (((tickAnim - 9) / 6) * (0-(22.44023)));
            yy = 2.5816 + (((tickAnim - 9) / 6) * (0-(2.5816)));
            zz = 20.9273 + (((tickAnim - 9) / 6) * (0-(20.9273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forearm, forearm.rotateAngleX + (float) Math.toRadians(xx), forearm.rotateAngleY + (float) Math.toRadians(yy), forearm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (20.25-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = 20.25 + (((tickAnim - 4) / 7) * (-27.25-(20.25)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -27.25 + (((tickAnim - 11) / 4) * (0-(-27.25)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hand, hand.rotateAngleX + (float) Math.toRadians(xx), hand.rotateAngleY + (float) Math.toRadians(yy), hand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (33.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 33.5 + (((tickAnim - 7) / 8) * (0-(33.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-17.63783-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-10.906-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (1.44375-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -17.63783 + (((tickAnim - 7) / 8) * (0-(-17.63783)));
            yy = -10.906 + (((tickAnim - 7) / 8) * (0-(-10.906)));
            zz = 1.44375 + (((tickAnim - 7) / 8) * (0-(1.44375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -8.5 + (((tickAnim - 7) / 8) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-20.82904-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.66225-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.13588-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -20.82904 + (((tickAnim - 7) / 8) * (0-(-20.82904)));
            yy = 0.66225 + (((tickAnim - 7) / 8) * (0-(0.66225)));
            zz = -0.13588 + (((tickAnim - 7) / 8) * (0-(-0.13588)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.75 + (((tickAnim - 3) / 5) * (-0.75-(1.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.75 + (((tickAnim - 8) / 7) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 6.5 + (((tickAnim - 8) / 7) * (0-(6.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 6.5 + (((tickAnim - 8) / 7) * (0-(6.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR2, UpperLegR2.rotateAngleX + (float) Math.toRadians(xx), UpperLegR2.rotateAngleY + (float) Math.toRadians(yy), UpperLegR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR2, LowerLegR2.rotateAngleX + (float) Math.toRadians(xx), LowerLegR2.rotateAngleY + (float) Math.toRadians(yy), LowerLegR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR2, ToesR2.rotateAngleX + (float) Math.toRadians(xx), ToesR2.rotateAngleY + (float) Math.toRadians(yy), ToesR2.rotateAngleZ + (float) Math.toRadians(zz));


    }


    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraAdeopapposaurus entity = (EntityPrehistoricFloraAdeopapposaurus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1-(0)));
            yy = 5 + (((tickAnim - 0) / 8) * (-1.66667-(5)));
            zz = 0.00001 + (((tickAnim - 0) / 8) * (2.50001-(0.00001)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 8) / 7) * (0-(1)));
            yy = -1.66667 + (((tickAnim - 8) / 7) * (-5-(-1.66667)));
            zz = 2.50001 + (((tickAnim - 8) / 7) * (0.00002-(2.50001)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (1-(0)));
            yy = -5 + (((tickAnim - 15) / 8) * (1.66667-(-5)));
            zz = 0.00002 + (((tickAnim - 15) / 8) * (-2.49999-(0.00002)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 23) / 7) * (0-(1)));
            yy = 1.66667 + (((tickAnim - 23) / 7) * (5-(1.66667)));
            zz = -2.49999 + (((tickAnim - 23) / 7) * (0.00001-(-2.49999)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -1.25 + (((tickAnim - 0) / 8) * (0-(-1.25)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (-1-(0)));
            zz = -1 + (((tickAnim - 8) / 4) * (0-(-1)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = -1 + (((tickAnim - 12) / 3) * (-1.25-(-1)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -1.25 + (((tickAnim - 15) / 8) * (0-(-1.25)));
            zz = 0 + (((tickAnim - 15) / 8) * (-1-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (-1-(0)));
            zz = -1 + (((tickAnim - 23) / 4) * (0-(-1)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = -1 + (((tickAnim - 27) / 3) * (-1.25-(-1)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.5-(0)));
            yy = -3 + (((tickAnim - 0) / 8) * (0-(-3)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 2.5 + (((tickAnim - 8) / 7) * (0-(2.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (3-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (2.5-(0)));
            yy = 3 + (((tickAnim - 15) / 8) * (0-(3)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 23) / 7) * (0-(2.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (-3-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 2.22 + (((tickAnim - 0) / 7) * (0-(2.22)));
            yy = -0.28 + (((tickAnim - 0) / 7) * (-2.5-(-0.28)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (2.5-(0)));
            yy = -2.5 + (((tickAnim - 7) / 7) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 2.5 + (((tickAnim - 14) / 8) * (0-(2.5)));
            yy = 0 + (((tickAnim - 14) / 8) * (2.5-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (2.5-(0)));
            yy = 2.5 + (((tickAnim - 22) / 7) * (0-(2.5)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 29) / 1) * (2.22-(2.5)));
            yy = 0 + (((tickAnim - 29) / 1) * (-0.28-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6.87 + (((tickAnim - 0) / 1) * (6.46079-(6.87)));
            yy = -15.79 + (((tickAnim - 0) / 1) * (-15.776-(-15.79)));
            zz = 2.71 + (((tickAnim - 0) / 1) * (2.6988-(2.71)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 6.46079 + (((tickAnim - 1) / 5) * (11.41146-(6.46079)));
            yy = -15.776 + (((tickAnim - 1) / 5) * (-15.9272-(-15.776)));
            zz = 2.6988 + (((tickAnim - 1) / 5) * (2.862-(2.6988)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 11.41146 + (((tickAnim - 6) / 10) * (6.46079-(11.41146)));
            yy = -15.9272 + (((tickAnim - 6) / 10) * (-15.776-(-15.9272)));
            zz = 2.862 + (((tickAnim - 6) / 10) * (2.6988-(2.862)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 6.46079 + (((tickAnim - 16) / 5) * (11.41146-(6.46079)));
            yy = -15.776 + (((tickAnim - 16) / 5) * (-15.9272-(-15.776)));
            zz = 2.6988 + (((tickAnim - 16) / 5) * (2.862-(2.6988)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 11.41146 + (((tickAnim - 21) / 9) * (6.87-(11.41146)));
            yy = -15.9272 + (((tickAnim - 21) / 9) * (-15.79-(-15.9272)));
            zz = 2.862 + (((tickAnim - 21) / 9) * (2.71-(2.862)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm, arm.rotateAngleX + (float) Math.toRadians(xx), arm.rotateAngleY + (float) Math.toRadians(yy), arm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -26.67 + (((tickAnim - 0) / 4) * (-22.5-(-26.67)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -22.5 + (((tickAnim - 4) / 5) * (-32.5-(-22.5)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = -32.5 + (((tickAnim - 9) / 10) * (-22.5-(-32.5)));
            yy = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 10) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -22.5 + (((tickAnim - 19) / 5) * (-32.5-(-22.5)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -32.5 + (((tickAnim - 24) / 6) * (-26.67-(-32.5)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forearm, forearm.rotateAngleX + (float) Math.toRadians(xx), forearm.rotateAngleY + (float) Math.toRadians(yy), forearm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6.87 + (((tickAnim - 0) / 1) * (6.46079-(6.87)));
            yy = 15.79 + (((tickAnim - 0) / 1) * (15.77596-(15.79)));
            zz = -2.71 + (((tickAnim - 0) / 1) * (-2.69878-(-2.71)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 6.46079 + (((tickAnim - 1) / 5) * (11.41146-(6.46079)));
            yy = 15.77596 + (((tickAnim - 1) / 5) * (15.92724-(15.77596)));
            zz = -2.69878 + (((tickAnim - 1) / 5) * (-2.86199-(-2.69878)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 11.41146 + (((tickAnim - 6) / 10) * (6.46079-(11.41146)));
            yy = 15.92724 + (((tickAnim - 6) / 10) * (15.77596-(15.92724)));
            zz = -2.86199 + (((tickAnim - 6) / 10) * (-2.69878-(-2.86199)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 6.46079 + (((tickAnim - 16) / 5) * (11.41146-(6.46079)));
            yy = 15.77596 + (((tickAnim - 16) / 5) * (15.92724-(15.77596)));
            zz = -2.69878 + (((tickAnim - 16) / 5) * (-2.86199-(-2.69878)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 11.41146 + (((tickAnim - 21) / 9) * (6.87-(11.41146)));
            yy = 15.92724 + (((tickAnim - 21) / 9) * (15.79-(15.92724)));
            zz = -2.86199 + (((tickAnim - 21) / 9) * (-2.71-(-2.86199)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(xx), arm2.rotateAngleY + (float) Math.toRadians(yy), arm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -26.67 + (((tickAnim - 0) / 4) * (-22.5-(-26.67)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -22.5 + (((tickAnim - 4) / 5) * (-32.5-(-22.5)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = -32.5 + (((tickAnim - 9) / 10) * (-22.5-(-32.5)));
            yy = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 10) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -22.5 + (((tickAnim - 19) / 5) * (-32.5-(-22.5)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -32.5 + (((tickAnim - 24) / 6) * (-26.67-(-32.5)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forearm2, forearm2.rotateAngleX + (float) Math.toRadians(xx), forearm2.rotateAngleY + (float) Math.toRadians(yy), forearm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -1.67 + (((tickAnim - 0) / 5) * (0-(-1.67)));
            yy = -0.83 + (((tickAnim - 0) / 5) * (-2.5-(-0.83)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (-2.5-(0)));
            yy = -2.5 + (((tickAnim - 5) / 8) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 13) / 7) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (2.5-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (-2.5-(0)));
            yy = 2.5 + (((tickAnim - 20) / 8) * (0-(2.5)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -2.5 + (((tickAnim - 28) / 2) * (-1.67-(-2.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (-0.83-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.56 + (((tickAnim - 0) / 2) * (0-(-0.56)));
            yy = -1.94 + (((tickAnim - 0) / 2) * (-2.5-(-1.94)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 2) / 7) * (-2.5-(0)));
            yy = -2.5 + (((tickAnim - 2) / 7) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 2) / 7) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = -2.5 + (((tickAnim - 9) / 8) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 9) / 8) * (2.5-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 17) / 7) * (-2.5-(0)));
            yy = 2.5 + (((tickAnim - 17) / 7) * (0-(2.5)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -2.5 + (((tickAnim - 24) / 6) * (-0.56-(-2.5)));
            yy = 0 + (((tickAnim - 24) / 6) * (-1.94-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (4.74742-(0)));
            yy = 2.5 + (((tickAnim - 0) / 8) * (7.09348-(2.5)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.1657-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 4.74742 + (((tickAnim - 8) / 7) * (0-(4.74742)));
            yy = 7.09348 + (((tickAnim - 8) / 7) * (-2.5-(7.09348)));
            zz = -2.1657 + (((tickAnim - 8) / 7) * (0-(-2.1657)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (4.81147-(0)));
            yy = -2.5 + (((tickAnim - 15) / 8) * (-7.07074-(-2.5)));
            zz = 0 + (((tickAnim - 15) / 8) * (1.66238-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 4.81147 + (((tickAnim - 23) / 7) * (0-(4.81147)));
            yy = -7.07074 + (((tickAnim - 23) / 7) * (2.5-(-7.07074)));
            zz = 1.66238 + (((tickAnim - 23) / 7) * (0-(1.66238)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -1.94 + (((tickAnim - 0) / 1) * (-2.5-(-1.94)));
            yy = 2.22 + (((tickAnim - 0) / 1) * (2.5-(2.22)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 1) / 7) * (2.5-(-2.5)));
            yy = 2.5 + (((tickAnim - 1) / 7) * (0-(2.5)));
            zz = 0 + (((tickAnim - 1) / 7) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 2.5 + (((tickAnim - 8) / 8) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -2.5 + (((tickAnim - 16) / 7) * (2.5-(-2.5)));
            yy = -2.5 + (((tickAnim - 16) / 7) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 23) / 7) * (-1.94-(2.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (2.22-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.28 + (((tickAnim - 0) / 4) * (-2.5-(0.28)));
            yy = 1.11 + (((tickAnim - 0) / 4) * (2.5-(1.11)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -2.5 + (((tickAnim - 4) / 8) * (2.5-(-2.5)));
            yy = 2.5 + (((tickAnim - 4) / 8) * (0-(2.5)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 2.5 + (((tickAnim - 12) / 7) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 12) / 7) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = -2.5 + (((tickAnim - 19) / 8) * (2.5-(-2.5)));
            yy = -2.5 + (((tickAnim - 19) / 8) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 19) / 8) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 27) / 3) * (0.28-(2.5)));
            yy = 0 + (((tickAnim - 27) / 3) * (1.11-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 1.39 + (((tickAnim - 0) / 6) * (-2.5-(1.39)));
            yy = 0.56 + (((tickAnim - 0) / 6) * (2.5-(0.56)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -2.5 + (((tickAnim - 6) / 7) * (2.5-(-2.5)));
            yy = 2.5 + (((tickAnim - 6) / 7) * (0-(2.5)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 2.5 + (((tickAnim - 13) / 8) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 13) / 8) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -2.5 + (((tickAnim - 21) / 7) * (2.5-(-2.5)));
            yy = -2.5 + (((tickAnim - 21) / 7) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 28) / 2) * (1.39-(2.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (0.56-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 2.5 + (((tickAnim - 0) / 8) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -2.5 + (((tickAnim - 8) / 7) * (2.5-(-2.5)));
            yy = 2.5 + (((tickAnim - 8) / 7) * (0-(2.5)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 2.5 + (((tickAnim - 15) / 8) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 15) / 8) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -2.5 + (((tickAnim - 23) / 7) * (2.5-(-2.5)));
            yy = -2.5 + (((tickAnim - 23) / 7) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 40.24491 + (((tickAnim - 0) / 10) * (-35.57554-(40.24491)));
            yy = 2.27929 + (((tickAnim - 0) / 10) * (11.89989-(2.27929)));
            zz = 4.85494 + (((tickAnim - 0) / 10) * (-2.61886-(4.85494)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -35.57554 + (((tickAnim - 10) / 4) * (-29.18869-(-35.57554)));
            yy = 11.89989 + (((tickAnim - 10) / 4) * (17.03178-(11.89989)));
            zz = -2.61886 + (((tickAnim - 10) / 4) * (-6.59496-(-2.61886)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -29.18869 + (((tickAnim - 14) / 1) * (-24.91132-(-29.18869)));
            yy = 17.03178 + (((tickAnim - 14) / 1) * (18.05816-(17.03178)));
            zz = -6.59496 + (((tickAnim - 14) / 1) * (-7.39018-(-6.59496)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -24.91132 + (((tickAnim - 15) / 10) * (18.6708-(-24.91132)));
            yy = 18.05816 + (((tickAnim - 15) / 10) * (8.35305-(18.05816)));
            zz = -7.39018 + (((tickAnim - 15) / 10) * (6.77006-(-7.39018)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 18.6708 + (((tickAnim - 25) / 5) * (40.24491-(18.6708)));
            yy = 8.35305 + (((tickAnim - 25) / 5) * (2.27929-(8.35305)));
            zz = 6.77006 + (((tickAnim - 25) / 5) * (4.85494-(6.77006)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.00015 + (((tickAnim - 0) / 3) * (36.19-(4.00015)));
            yy = 0.00437 + (((tickAnim - 0) / 3) * (0-(0.00437)));
            zz = 0.0169 + (((tickAnim - 0) / 3) * (0-(0.0169)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 36.19 + (((tickAnim - 3) / 7) * (40.83-(36.19)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 40.83 + (((tickAnim - 10) / 5) * (0-(40.83)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (5.17-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 5.17 + (((tickAnim - 18) / 1) * (6.11-(5.17)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 6.11 + (((tickAnim - 19) / 4) * (2.00008-(6.11)));
            yy = 0 + (((tickAnim - 19) / 4) * (0.00218-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0.00845-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 2.00008 + (((tickAnim - 23) / 4) * (10.33345-(2.00008)));
            yy = 0.00218 + (((tickAnim - 23) / 4) * (0.0034-(0.00218)));
            zz = 0.00845 + (((tickAnim - 23) / 4) * (0.01314-(0.00845)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 10.33345 + (((tickAnim - 27) / 3) * (4.00015-(10.33345)));
            yy = 0.0034 + (((tickAnim - 27) / 3) * (0.00437-(0.0034)));
            zz = 0.01314 + (((tickAnim - 27) / 3) * (0.0169-(0.01314)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.5 + (((tickAnim - 0) / 5) * (-36.77-(12.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -36.77 + (((tickAnim - 5) / 3) * (-49.87-(-36.77)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -49.87 + (((tickAnim - 8) / 2) * (-28.33-(-49.87)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -28.33 + (((tickAnim - 10) / 2) * (-28.89-(-28.33)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -28.89 + (((tickAnim - 12) / 3) * (7.5-(-28.89)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 15) / 3) * (-7.67-(7.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -7.67 + (((tickAnim - 18) / 1) * (-10.28-(-7.67)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -10.28 + (((tickAnim - 19) / 4) * (2.5-(-10.28)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 2.5 + (((tickAnim - 23) / 4) * (-0.56-(2.5)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -0.56 + (((tickAnim - 27) / 3) * (12.5-(-0.56)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 15.00204 + (((tickAnim - 0) / 6) * (118.33-(15.00204)));
            yy = 1.49178 + (((tickAnim - 0) / 6) * (0-(1.49178)));
            zz = 0.15684 + (((tickAnim - 0) / 6) * (0-(0.15684)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 118.33 + (((tickAnim - 6) / 6) * (86.04-(118.33)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 86.04 + (((tickAnim - 12) / 3) * (13.42861-(86.04)));
            yy = 0 + (((tickAnim - 12) / 3) * (-3.81468-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (6.4622-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 13.42861 + (((tickAnim - 15) / 3) * (14.8409-(13.42861)));
            yy = -3.81468 + (((tickAnim - 15) / 3) * (-3.19969-(-3.81468)));
            zz = 6.4622 + (((tickAnim - 15) / 3) * (4.03021-(6.4622)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 14.8409 + (((tickAnim - 18) / 1) * (9.11577-(14.8409)));
            yy = -3.19969 + (((tickAnim - 18) / 1) * (-2.78969-(-3.19969)));
            zz = 4.03021 + (((tickAnim - 18) / 1) * (2.40889-(4.03021)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 9.11577 + (((tickAnim - 19) / 4) * (-12.33451-(9.11577)));
            yy = -2.78969 + (((tickAnim - 19) / 4) * (-1.9697-(-2.78969)));
            zz = 2.40889 + (((tickAnim - 19) / 4) * (-0.83375-(2.40889)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -12.33451 + (((tickAnim - 23) / 2) * (-8.95103-(-12.33451)));
            yy = -1.9697 + (((tickAnim - 23) / 2) * (-1.64157-(-1.9697)));
            zz = -0.83375 + (((tickAnim - 23) / 2) * (-4.42655-(-0.83375)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -8.95103 + (((tickAnim - 25) / 2) * (4.55042-(-8.95103)));
            yy = -1.64157 + (((tickAnim - 25) / 2) * (-1.57901-(-1.64157)));
            zz = -4.42655 + (((tickAnim - 25) / 2) * (-3.20467-(-4.42655)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 4.55042 + (((tickAnim - 27) / 1) * (5.41933-(4.55042)));
            yy = -1.57901 + (((tickAnim - 27) / 1) * (1.49284-(-1.57901)));
            zz = -3.20467 + (((tickAnim - 27) / 1) * (-5.7743-(-3.20467)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 5.41933 + (((tickAnim - 28) / 2) * (15.00204-(5.41933)));
            yy = 1.49284 + (((tickAnim - 28) / 2) * (1.49178-(1.49284)));
            zz = -5.7743 + (((tickAnim - 28) / 2) * (0.15684-(-5.7743)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -24.91132 + (((tickAnim - 0) / 10) * (18.6708-(-24.91132)));
            yy = -18.0582 + (((tickAnim - 0) / 10) * (-8.3531-(-18.0582)));
            zz = 7.3902 + (((tickAnim - 0) / 10) * (-6.7701-(7.3902)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 18.6708 + (((tickAnim - 10) / 5) * (40.24491-(18.6708)));
            yy = -8.3531 + (((tickAnim - 10) / 5) * (-2.2793-(-8.3531)));
            zz = -6.7701 + (((tickAnim - 10) / 5) * (-4.8549-(-6.7701)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 40.24491 + (((tickAnim - 15) / 10) * (-35.57554-(40.24491)));
            yy = -2.2793 + (((tickAnim - 15) / 10) * (-11.8999-(-2.2793)));
            zz = -4.8549 + (((tickAnim - 15) / 10) * (2.6189-(-4.8549)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -35.57554 + (((tickAnim - 25) / 4) * (-29.18869-(-35.57554)));
            yy = -11.8999 + (((tickAnim - 25) / 4) * (-17.0318-(-11.8999)));
            zz = 2.6189 + (((tickAnim - 25) / 4) * (6.595-(2.6189)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -29.18869 + (((tickAnim - 29) / 1) * (-24.91132-(-29.18869)));
            yy = -17.0318 + (((tickAnim - 29) / 1) * (-18.0582-(-17.0318)));
            zz = 6.595 + (((tickAnim - 29) / 1) * (7.3902-(6.595)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR2, UpperLegR2.rotateAngleX + (float) Math.toRadians(xx), UpperLegR2.rotateAngleY + (float) Math.toRadians(yy), UpperLegR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5.17-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 5.17 + (((tickAnim - 3) / 1) * (6.11-(5.17)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 6.11 + (((tickAnim - 4) / 4) * (2.00008-(6.11)));
            yy = 0 + (((tickAnim - 4) / 4) * (0.00218-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0.00845-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2.00008 + (((tickAnim - 8) / 4) * (10.33345-(2.00008)));
            yy = 0.00218 + (((tickAnim - 8) / 4) * (0.0034-(0.00218)));
            zz = 0.00845 + (((tickAnim - 8) / 4) * (0.01314-(0.00845)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 10.33345 + (((tickAnim - 12) / 3) * (4.00015-(10.33345)));
            yy = 0.0034 + (((tickAnim - 12) / 3) * (0.00437-(0.0034)));
            zz = 0.01314 + (((tickAnim - 12) / 3) * (0.0169-(0.01314)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 4.00015 + (((tickAnim - 15) / 3) * (36.19-(4.00015)));
            yy = 0.00437 + (((tickAnim - 15) / 3) * (0-(0.00437)));
            zz = 0.0169 + (((tickAnim - 15) / 3) * (0-(0.0169)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 36.19 + (((tickAnim - 18) / 7) * (40.83-(36.19)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 40.83 + (((tickAnim - 25) / 5) * (0-(40.83)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR2, LowerLegR2.rotateAngleX + (float) Math.toRadians(xx), LowerLegR2.rotateAngleY + (float) Math.toRadians(yy), LowerLegR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7.5 + (((tickAnim - 0) / 3) * (-7.67-(7.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -7.67 + (((tickAnim - 3) / 1) * (-10.28-(-7.67)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -10.28 + (((tickAnim - 4) / 4) * (2.5-(-10.28)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2.5 + (((tickAnim - 8) / 4) * (-0.56-(2.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -0.56 + (((tickAnim - 12) / 3) * (12.5-(-0.56)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 12.5 + (((tickAnim - 15) / 5) * (-36.77-(12.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -36.77 + (((tickAnim - 20) / 3) * (-49.87-(-36.77)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -49.87 + (((tickAnim - 23) / 2) * (-28.33-(-49.87)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -28.33 + (((tickAnim - 25) / 2) * (-28.89-(-28.33)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -28.89 + (((tickAnim - 27) / 3) * (7.5-(-28.89)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR2, FootR2.rotateAngleX + (float) Math.toRadians(xx), FootR2.rotateAngleY + (float) Math.toRadians(yy), FootR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13.42861 + (((tickAnim - 0) / 3) * (14.8409-(13.42861)));
            yy = 3.8147 + (((tickAnim - 0) / 3) * (3.1997-(3.8147)));
            zz = -6.4622 + (((tickAnim - 0) / 3) * (-4.0302-(-6.4622)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 14.8409 + (((tickAnim - 3) / 1) * (9.11577-(14.8409)));
            yy = 3.1997 + (((tickAnim - 3) / 1) * (2.7897-(3.1997)));
            zz = -4.0302 + (((tickAnim - 3) / 1) * (-2.4089-(-4.0302)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 9.11577 + (((tickAnim - 4) / 4) * (-12.33451-(9.11577)));
            yy = 2.7897 + (((tickAnim - 4) / 4) * (1.9697-(2.7897)));
            zz = -2.4089 + (((tickAnim - 4) / 4) * (0.8338-(-2.4089)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12.33451 + (((tickAnim - 8) / 2) * (-8.95103-(-12.33451)));
            yy = 1.9697 + (((tickAnim - 8) / 2) * (1.6416-(1.9697)));
            zz = 0.8338 + (((tickAnim - 8) / 2) * (4.4266-(0.8338)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -8.95103 + (((tickAnim - 10) / 2) * (4.55042-(-8.95103)));
            yy = 1.6416 + (((tickAnim - 10) / 2) * (1.579-(1.6416)));
            zz = 4.4266 + (((tickAnim - 10) / 2) * (3.2047-(4.4266)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 4.55042 + (((tickAnim - 12) / 1) * (5.41933-(4.55042)));
            yy = 1.579 + (((tickAnim - 12) / 1) * (-1.4928-(1.579)));
            zz = 3.2047 + (((tickAnim - 12) / 1) * (5.7743-(3.2047)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 5.41933 + (((tickAnim - 13) / 2) * (15.00204-(5.41933)));
            yy = -1.4928 + (((tickAnim - 13) / 2) * (-1.4918-(-1.4928)));
            zz = 5.7743 + (((tickAnim - 13) / 2) * (-0.1568-(5.7743)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 15.00204 + (((tickAnim - 15) / 6) * (118.33-(15.00204)));
            yy = -1.4918 + (((tickAnim - 15) / 6) * (0-(-1.4918)));
            zz = -0.1568 + (((tickAnim - 15) / 6) * (0-(-0.1568)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 118.33 + (((tickAnim - 21) / 6) * (86.04-(118.33)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 86.04 + (((tickAnim - 27) / 3) * (13.42861-(86.04)));
            yy = 0 + (((tickAnim - 27) / 3) * (3.8147-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (-6.4622-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR2, ToesR2.rotateAngleX + (float) Math.toRadians(xx), ToesR2.rotateAngleY + (float) Math.toRadians(yy), ToesR2.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAdeopapposaurus entity = (EntityPrehistoricFloraAdeopapposaurus) entitylivingbaseIn;

        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2 + (((tickAnim - 0) / 3) * (3-(2)));
            yy = 5 + (((tickAnim - 0) / 3) * (-1.66667-(5)));
            zz = 0.00001 + (((tickAnim - 0) / 3) * (2.50001-(0.00001)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3 + (((tickAnim - 3) / 2) * (2-(3)));
            yy = -1.66667 + (((tickAnim - 3) / 2) * (-5-(-1.66667)));
            zz = 2.50001 + (((tickAnim - 3) / 2) * (0.00002-(2.50001)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2 + (((tickAnim - 5) / 3) * (3-(2)));
            yy = -5 + (((tickAnim - 5) / 3) * (1.66667-(-5)));
            zz = 0.00002 + (((tickAnim - 5) / 3) * (-2.49999-(0.00002)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 3 + (((tickAnim - 8) / 2) * (2-(3)));
            yy = 1.66667 + (((tickAnim - 8) / 2) * (5-(1.66667)));
            zz = -2.49999 + (((tickAnim - 8) / 2) * (0.00001-(-2.49999)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -2.5 + (((tickAnim - 0) / 3) * (-2-(-2.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (-3.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -2 + (((tickAnim - 3) / 2) * (-2.5-(-2)));
            zz = -3.25 + (((tickAnim - 3) / 2) * (0-(-3.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -2.5 + (((tickAnim - 5) / 3) * (-2-(-2.5)));
            zz = 0 + (((tickAnim - 5) / 3) * (-3.25-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -2 + (((tickAnim - 8) / 2) * (-2.5-(-2)));
            zz = -3.25 + (((tickAnim - 8) / 2) * (0-(-3.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1 + (((tickAnim - 0) / 3) * (1.5-(-1)));
            yy = -3 + (((tickAnim - 0) / 3) * (0-(-3)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.5 + (((tickAnim - 3) / 2) * (-1-(1.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (3-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -1 + (((tickAnim - 5) / 3) * (1.5-(-1)));
            yy = 3 + (((tickAnim - 5) / 3) * (0-(3)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1.5 + (((tickAnim - 8) / 2) * (-1-(1.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (-3-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.52 + (((tickAnim - 0) / 3) * (6-(8.52)));
            yy = -0.28 + (((tickAnim - 0) / 3) * (-2.5-(-0.28)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6 + (((tickAnim - 3) / 2) * (8.5-(6)));
            yy = -2.5 + (((tickAnim - 3) / 2) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 8.5 + (((tickAnim - 5) / 3) * (6-(8.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6 + (((tickAnim - 8) / 2) * (8.52-(6)));
            yy = 2.5 + (((tickAnim - 8) / 2) * (-0.28-(2.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 18.46079 + (((tickAnim - 0) / 2) * (23.41146-(18.46079)));
            yy = -15.776 + (((tickAnim - 0) / 2) * (-15.9272-(-15.776)));
            zz = 2.6988 + (((tickAnim - 0) / 2) * (2.862-(2.6988)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 23.41146 + (((tickAnim - 2) / 3) * (18.46079-(23.41146)));
            yy = -15.9272 + (((tickAnim - 2) / 3) * (-15.776-(-15.9272)));
            zz = 2.862 + (((tickAnim - 2) / 3) * (2.6988-(2.862)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 18.46079 + (((tickAnim - 5) / 3) * (23.41146-(18.46079)));
            yy = -15.776 + (((tickAnim - 5) / 3) * (-15.9272-(-15.776)));
            zz = 2.6988 + (((tickAnim - 5) / 3) * (2.862-(2.6988)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 23.41146 + (((tickAnim - 8) / 2) * (18.87-(23.41146)));
            yy = -15.9272 + (((tickAnim - 8) / 2) * (-15.79-(-15.9272)));
            zz = 2.862 + (((tickAnim - 8) / 2) * (2.71-(2.862)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm, arm.rotateAngleX + (float) Math.toRadians(xx), arm.rotateAngleY + (float) Math.toRadians(yy), arm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -49.67 + (((tickAnim - 0) / 2) * (-45.5-(-49.67)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -45.5 + (((tickAnim - 2) / 1) * (-55.5-(-45.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -55.5 + (((tickAnim - 3) / 4) * (-45.5-(-55.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -45.5 + (((tickAnim - 7) / 1) * (-55.5-(-45.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -55.5 + (((tickAnim - 8) / 2) * (-49.67-(-55.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forearm, forearm.rotateAngleX + (float) Math.toRadians(xx), forearm.rotateAngleY + (float) Math.toRadians(yy), forearm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 17.46079 + (((tickAnim - 0) / 2) * (22.41146-(17.46079)));
            yy = 15.77596 + (((tickAnim - 0) / 2) * (15.92724-(15.77596)));
            zz = -2.69878 + (((tickAnim - 0) / 2) * (-2.86199-(-2.69878)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 22.41146 + (((tickAnim - 2) / 3) * (17.46079-(22.41146)));
            yy = 15.92724 + (((tickAnim - 2) / 3) * (15.77596-(15.92724)));
            zz = -2.86199 + (((tickAnim - 2) / 3) * (-2.69878-(-2.86199)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 17.46079 + (((tickAnim - 5) / 3) * (22.41146-(17.46079)));
            yy = 15.77596 + (((tickAnim - 5) / 3) * (15.92724-(15.77596)));
            zz = -2.69878 + (((tickAnim - 5) / 3) * (-2.86199-(-2.69878)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22.41146 + (((tickAnim - 8) / 2) * (17.87-(22.41146)));
            yy = 15.92724 + (((tickAnim - 8) / 2) * (15.79-(15.92724)));
            zz = -2.86199 + (((tickAnim - 8) / 2) * (-2.71-(-2.86199)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(xx), arm2.rotateAngleY + (float) Math.toRadians(yy), arm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -49.67 + (((tickAnim - 0) / 2) * (-45.5-(-49.67)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -45.5 + (((tickAnim - 2) / 1) * (-55.5-(-45.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -55.5 + (((tickAnim - 3) / 4) * (-45.5-(-55.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -45.5 + (((tickAnim - 7) / 1) * (-55.5-(-45.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -55.5 + (((tickAnim - 8) / 2) * (-49.67-(-55.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forearm2, forearm2.rotateAngleX + (float) Math.toRadians(xx), forearm2.rotateAngleY + (float) Math.toRadians(yy), forearm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.67 + (((tickAnim - 0) / 2) * (-6-(-7.67)));
            yy = -0.83 + (((tickAnim - 0) / 2) * (-2.5-(-0.83)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -6 + (((tickAnim - 2) / 2) * (-8.5-(-6)));
            yy = -2.5 + (((tickAnim - 2) / 2) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -8.5 + (((tickAnim - 4) / 3) * (-6-(-8.5)));
            yy = 0 + (((tickAnim - 4) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -6 + (((tickAnim - 7) / 2) * (-8.5-(-6)));
            yy = 2.5 + (((tickAnim - 7) / 2) * (0-(2.5)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -8.5 + (((tickAnim - 9) / 1) * (-7.67-(-8.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (-0.83-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -3.11 + (((tickAnim - 0) / 1) * (-2-(-3.11)));
            yy = -1.39 + (((tickAnim - 0) / 1) * (-2.5-(-1.39)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -2 + (((tickAnim - 1) / 2) * (-4.5-(-2)));
            yy = -2.5 + (((tickAnim - 1) / 2) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -4.5 + (((tickAnim - 3) / 3) * (-2-(-4.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -2 + (((tickAnim - 6) / 3) * (-4.5-(-2)));
            yy = 2.5 + (((tickAnim - 6) / 3) * (0-(2.5)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -4.5 + (((tickAnim - 9) / 1) * (-3.11-(-4.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (-1.39-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -0.56 + (((tickAnim - 0) / 1) * (0-(-0.56)));
            yy = -1.94 + (((tickAnim - 0) / 1) * (-2.5-(-1.94)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (-2.5-(0)));
            yy = -2.5 + (((tickAnim - 1) / 2) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -2.5 + (((tickAnim - 3) / 3) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (-2.5-(0)));
            yy = 2.5 + (((tickAnim - 6) / 2) * (0-(2.5)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 8) / 2) * (-0.56-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (-1.94-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4.74742-(0)));
            yy = 2.5 + (((tickAnim - 0) / 3) * (7.09348-(2.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.1657-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 4.74742 + (((tickAnim - 3) / 2) * (0-(4.74742)));
            yy = 7.09348 + (((tickAnim - 3) / 2) * (-2.5-(7.09348)));
            zz = -2.1657 + (((tickAnim - 3) / 2) * (0-(-2.1657)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (4.81147-(0)));
            yy = -2.5 + (((tickAnim - 5) / 3) * (-7.07074-(-2.5)));
            zz = 0 + (((tickAnim - 5) / 3) * (1.66238-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.81147 + (((tickAnim - 8) / 2) * (0-(4.81147)));
            yy = -7.07074 + (((tickAnim - 8) / 2) * (2.5-(-7.07074)));
            zz = 1.66238 + (((tickAnim - 8) / 2) * (0-(1.66238)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2.5 + (((tickAnim - 0) / 3) * (2.5-(-2.5)));
            yy = 2.5 + (((tickAnim - 0) / 3) * (0-(2.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.5 + (((tickAnim - 3) / 2) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 5) / 3) * (2.5-(-2.5)));
            yy = -2.5 + (((tickAnim - 5) / 3) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 8) / 2) * (-1.94-(2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (2.22-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.22 + (((tickAnim - 0) / 2) * (-4.5-(-1.22)));
            yy = 1.11 + (((tickAnim - 0) / 2) * (2.5-(1.11)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -4.5 + (((tickAnim - 2) / 2) * (0.5-(-4.5)));
            yy = 2.5 + (((tickAnim - 2) / 2) * (0-(2.5)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0.5 + (((tickAnim - 4) / 3) * (-4.5-(0.5)));
            yy = 0 + (((tickAnim - 4) / 3) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -4.5 + (((tickAnim - 7) / 2) * (0.5-(-4.5)));
            yy = -2.5 + (((tickAnim - 7) / 2) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0.5 + (((tickAnim - 9) / 1) * (-1.22-(0.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (1.11-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.5 + (((tickAnim - 0) / 2) * (-5.5-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -5.5 + (((tickAnim - 2) / 2) * (-0.5-(-5.5)));
            yy = 2.5 + (((tickAnim - 2) / 2) * (0-(2.5)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.5 + (((tickAnim - 4) / 4) * (-5.5-(-0.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -5.5 + (((tickAnim - 8) / 2) * (-0.5-(-5.5)));
            yy = -2.5 + (((tickAnim - 8) / 2) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.25118 + (((tickAnim - 0) / 3) * (-35-(29.25118)));
            yy = 9.57892 + (((tickAnim - 0) / 3) * (0-(9.57892)));
            zz = 10.40372 + (((tickAnim - 0) / 3) * (0-(10.40372)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -35 + (((tickAnim - 3) / 2) * (-30.21675-(-35)));
            yy = 0 + (((tickAnim - 3) / 2) * (8.48916-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-5.86282-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -30.21675 + (((tickAnim - 5) / 3) * (-9.31466-(-30.21675)));
            yy = 8.48916 + (((tickAnim - 5) / 3) * (12.47443-(8.48916)));
            zz = -5.86282 + (((tickAnim - 5) / 3) * (0.25839-(-5.86282)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -9.31466 + (((tickAnim - 8) / 2) * (29.25118-(-9.31466)));
            yy = 12.47443 + (((tickAnim - 8) / 2) * (9.57892-(12.47443)));
            zz = 0.25839 + (((tickAnim - 8) / 2) * (10.40372-(0.25839)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 36.25 + (((tickAnim - 0) / 3) * (60-(36.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 60 + (((tickAnim - 3) / 1) * (-5.83-(60)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -5.83 + (((tickAnim - 4) / 1) * (-23.75-(-5.83)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -23.75 + (((tickAnim - 5) / 1) * (-1.67-(-23.75)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -1.67 + (((tickAnim - 6) / 1) * (14.16-(-1.67)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 14.16 + (((tickAnim - 7) / 1) * (20-(14.16)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 20 + (((tickAnim - 8) / 2) * (36.25-(20)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 15.04725 + (((tickAnim - 0) / 2) * (21.68-(15.04725)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 21.68 + (((tickAnim - 2) / 1) * (-42.5-(21.68)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -42.5 + (((tickAnim - 3) / 0) * (-34.15-(-42.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -34.15 + (((tickAnim - 3) / 2) * (12.54725-(-34.15)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 12.54725 + (((tickAnim - 5) / 1) * (-23.27033-(12.54725)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -23.27033 + (((tickAnim - 6) / 1) * (-25.34-(-23.27033)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -25.34 + (((tickAnim - 7) / 1) * (2.5945-(-25.34)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 2.5945 + (((tickAnim - 8) / 1) * (33.4-(2.5945)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 33.4 + (((tickAnim - 9) / 1) * (15.04725-(33.4)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 46.25 + (((tickAnim - 0) / 3) * (110-(46.25)));
            yy = -0.02 + (((tickAnim - 0) / 3) * (0-(-0.02)));
            zz = -2.5 + (((tickAnim - 0) / 3) * (0-(-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 110 + (((tickAnim - 3) / 1) * (44.10141-(110)));
            yy = 0 + (((tickAnim - 3) / 1) * (-2.84805-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0.09067-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 44.10141 + (((tickAnim - 4) / 1) * (38.52094-(44.10141)));
            yy = -2.84805 + (((tickAnim - 4) / 1) * (-6.33463-(-2.84805)));
            zz = 0.09067 + (((tickAnim - 4) / 1) * (1.55491-(0.09067)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 38.52094 + (((tickAnim - 5) / 1) * (44.85373-(38.52094)));
            yy = -6.33463 + (((tickAnim - 5) / 1) * (-5.06786-(-6.33463)));
            zz = 1.55491 + (((tickAnim - 5) / 1) * (-0.39544-(1.55491)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 44.85373 + (((tickAnim - 6) / 1) * (23.51421-(44.85373)));
            yy = -5.06786 + (((tickAnim - 6) / 1) * (-4.70923-(-5.06786)));
            zz = -0.39544 + (((tickAnim - 6) / 1) * (0.51254-(-0.39544)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 23.51421 + (((tickAnim - 7) / 1) * (-17.5-(23.51421)));
            yy = -4.70923 + (((tickAnim - 7) / 1) * (0-(-4.70923)));
            zz = 0.51254 + (((tickAnim - 7) / 1) * (0-(0.51254)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -17.5 + (((tickAnim - 8) / 0) * (-21.24863-(-17.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0.04058-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (-1.6677-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -21.24863 + (((tickAnim - 8) / 1) * (38.75063-(-21.24863)));
            yy = 0.04058 + (((tickAnim - 8) / 1) * (-0.02786-(0.04058)));
            zz = -1.6677 + (((tickAnim - 8) / 1) * (-3.33327-(-1.6677)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 38.75063 + (((tickAnim - 9) / 1) * (46.25-(38.75063)));
            yy = -0.02786 + (((tickAnim - 9) / 1) * (-0.02-(-0.02786)));
            zz = -3.33327 + (((tickAnim - 9) / 1) * (-2.5-(-3.33327)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -30.21675 + (((tickAnim - 0) / 3) * (-9.31466-(-30.21675)));
            yy = -8.4892 + (((tickAnim - 0) / 3) * (-12.4744-(-8.4892)));
            zz = 5.8628 + (((tickAnim - 0) / 3) * (-0.2584-(5.8628)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -9.31466 + (((tickAnim - 3) / 2) * (29.25118-(-9.31466)));
            yy = -12.4744 + (((tickAnim - 3) / 2) * (-9.5789-(-12.4744)));
            zz = -0.2584 + (((tickAnim - 3) / 2) * (-10.4037-(-0.2584)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 29.25118 + (((tickAnim - 5) / 3) * (-35-(29.25118)));
            yy = -9.5789 + (((tickAnim - 5) / 3) * (0-(-9.5789)));
            zz = -10.4037 + (((tickAnim - 5) / 3) * (0-(-10.4037)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -35 + (((tickAnim - 8) / 2) * (-30.21675-(-35)));
            yy = 0 + (((tickAnim - 8) / 2) * (-8.4892-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (5.8628-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR2, UpperLegR2.rotateAngleX + (float) Math.toRadians(xx), UpperLegR2.rotateAngleY + (float) Math.toRadians(yy), UpperLegR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -23.75 + (((tickAnim - 0) / 1) * (-1.67-(-23.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -1.67 + (((tickAnim - 1) / 1) * (14.16-(-1.67)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 14.16 + (((tickAnim - 2) / 1) * (20-(14.16)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 20 + (((tickAnim - 3) / 2) * (36.25-(20)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 36.25 + (((tickAnim - 5) / 3) * (60-(36.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 60 + (((tickAnim - 8) / 1) * (-5.83-(60)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -5.83 + (((tickAnim - 9) / 1) * (-23.75-(-5.83)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR2, LowerLegR2.rotateAngleX + (float) Math.toRadians(xx), LowerLegR2.rotateAngleY + (float) Math.toRadians(yy), LowerLegR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 12.54725 + (((tickAnim - 0) / 1) * (-23.27033-(12.54725)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -23.27033 + (((tickAnim - 1) / 1) * (-25.34-(-23.27033)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -25.34 + (((tickAnim - 2) / 1) * (2.5945-(-25.34)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.5945 + (((tickAnim - 3) / 1) * (33.4-(2.5945)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 33.4 + (((tickAnim - 4) / 1) * (15.04725-(33.4)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 15.04725 + (((tickAnim - 5) / 2) * (21.68-(15.04725)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 21.68 + (((tickAnim - 7) / 1) * (-42.5-(21.68)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -42.5 + (((tickAnim - 8) / 0) * (-34.15-(-42.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -34.15 + (((tickAnim - 8) / 2) * (12.54725-(-34.15)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR2, FootR2.rotateAngleX + (float) Math.toRadians(xx), FootR2.rotateAngleY + (float) Math.toRadians(yy), FootR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 38.52094 + (((tickAnim - 0) / 1) * (44.85373-(38.52094)));
            yy = 6.3346 + (((tickAnim - 0) / 1) * (5.0679-(6.3346)));
            zz = -1.5549 + (((tickAnim - 0) / 1) * (0.3954-(-1.5549)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 44.85373 + (((tickAnim - 1) / 1) * (23.51421-(44.85373)));
            yy = 5.0679 + (((tickAnim - 1) / 1) * (4.7092-(5.0679)));
            zz = 0.3954 + (((tickAnim - 1) / 1) * (-0.5125-(0.3954)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 23.51421 + (((tickAnim - 2) / 1) * (-17.5-(23.51421)));
            yy = 4.7092 + (((tickAnim - 2) / 1) * (0-(4.7092)));
            zz = -0.5125 + (((tickAnim - 2) / 1) * (0-(-0.5125)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -17.5 + (((tickAnim - 3) / 0) * (-21.24863-(-17.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (-0.0406-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (1.6677-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -21.24863 + (((tickAnim - 3) / 1) * (38.75063-(-21.24863)));
            yy = -0.0406 + (((tickAnim - 3) / 1) * (0.0279-(-0.0406)));
            zz = 1.6677 + (((tickAnim - 3) / 1) * (3.3333-(1.6677)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 38.75063 + (((tickAnim - 4) / 1) * (46.25-(38.75063)));
            yy = 0.0279 + (((tickAnim - 4) / 1) * (0.02-(0.0279)));
            zz = 3.3333 + (((tickAnim - 4) / 1) * (2.5-(3.3333)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 46.25 + (((tickAnim - 5) / 3) * (110-(46.25)));
            yy = 0.02 + (((tickAnim - 5) / 3) * (0-(0.02)));
            zz = 2.5 + (((tickAnim - 5) / 3) * (0-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 110 + (((tickAnim - 8) / 1) * (44.10141-(110)));
            yy = 0 + (((tickAnim - 8) / 1) * (2.848-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (-0.0907-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 44.10141 + (((tickAnim - 9) / 1) * (38.52094-(44.10141)));
            yy = 2.848 + (((tickAnim - 9) / 1) * (6.3346-(2.848)));
            zz = -0.0907 + (((tickAnim - 9) / 1) * (-1.5549-(-0.0907)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR2, ToesR2.rotateAngleX + (float) Math.toRadians(xx), ToesR2.rotateAngleY + (float) Math.toRadians(yy), ToesR2.rotateAngleZ + (float) Math.toRadians(zz));



    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAdeopapposaurus e = (EntityPrehistoricFloraAdeopapposaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.ROAR_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck3, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);

    }
}
