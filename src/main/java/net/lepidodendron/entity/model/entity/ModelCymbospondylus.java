package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCymbospondylus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelCymbospondylus extends ModelBasePalaeopedia {


    private ModelAnimator animator;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer FrontFinL;
    private final AdvancedModelRenderer FrontFinR;
    private final AdvancedModelRenderer DorsalFin;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer LowerSnout;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer LowerSnout2;
    private final AdvancedModelRenderer LowerTeetj;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Snout;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Snout2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer UpperTeeth;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer BackFinL;
    private final AdvancedModelRenderer BackFinR;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer Tail6;
    public ModelCymbospondylus() {



        this.textureWidth = 256;
        this.textureHeight = 256;

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 0, 40, -9.0F, -3.0F, -11.0F, 18, 14, 21, -0.01F, false));
        this.Chest.cubeList.add(new ModelBox(Chest, 0, 2, -1.0F, -1.0F, -12.0F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 15.0F, -11.0F);
        this.Chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0349F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 65, 17, -7.0F, -5.0F, 0.0F, 14, 4, 23, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -6.0F, -11.0F);
        this.Chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0698F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 72, 78, -7.0F, 0.7F, 0.0F, 14, 4, 23, 0.0F, false));

        this.FrontFinL = new AdvancedModelRenderer(this);
        this.FrontFinL.setRotationPoint(-8.0F, 8.5F, -8.0F);
        this.Chest.addChild(FrontFinL);
        this.setRotateAngle(FrontFinL, 0.3054F, 0.48F, -1.0036F);
        this.FrontFinL.cubeList.add(new ModelBox(FrontFinL, 100, 105, -11.0F, -1.5F, -3.0F, 11, 3, 6, 0.0F, false));
        this.FrontFinL.cubeList.add(new ModelBox(FrontFinL, 51, 0, -26.0F, 0.0F, -2.99F, 25, 0, 13, 0.01F, false));

        this.FrontFinR = new AdvancedModelRenderer(this);
        this.FrontFinR.setRotationPoint(8.0F, 8.5F, -8.0F);
        this.Chest.addChild(FrontFinR);
        this.setRotateAngle(FrontFinR, 0.3054F, -0.48F, 1.0036F);
        this.FrontFinR.cubeList.add(new ModelBox(FrontFinR, 100, 105, 0.0F, -1.5F, -3.0F, 11, 3, 6, 0.0F, true));
        this.FrontFinR.cubeList.add(new ModelBox(FrontFinR, 51, 0, 1.0F, 0.0F, -2.99F, 25, 0, 13, 0.01F, true));

        this.DorsalFin = new AdvancedModelRenderer(this);
        this.DorsalFin.setRotationPoint(0.0F, -5.5F, -7.0F);
        this.Chest.addChild(DorsalFin);
        this.setRotateAngle(DorsalFin, 1.1345F, 0.0F, 0.0F);
        this.DorsalFin.cubeList.add(new ModelBox(DorsalFin, 57, 44, -1.0F, 0.0F, 0.0F, 2, 9, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.DorsalFin.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 32, 0.0F, 0.0F, 0.0F, 0, 10, 8, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 1.0F, -9.0F);
        this.Chest.addChild(Neck);
        this.Neck.cubeList.add(new ModelBox(Neck, 138, 111, -6.0F, -3.0F, -12.0F, 12, 12, 12, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 12.0F, -12.0F);
        this.Neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1658F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 53, 78, -4.5F, -5.0F, 0.0F, 9, 4, 12, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -6.0F, -12.0F);
        this.Neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 150, 47, -4.5F, 0.8F, 0.0F, 9, 3, 12, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, 0.0F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 159, 135, -4.0F, -2.0F, -11.0F, 8, 9, 11, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 9.0F, -11.0F);
        this.Neck2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2443F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 161, 0, -3.0F, -5.0F, 0.0F, 6, 4, 11, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -4.0F, -11.0F);
        this.Neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 44, 161, -3.0F, 0.0F, 0.0F, 6, 4, 10, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.Neck2.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 105, 4, -3.0F, -1.0F, -8.0F, 6, 4, 9, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 79, 13, -3.0F, 0.5F, -6.5F, 6, 2, 2, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 22, -3.0F, 1.0F, -6.0F, 6, 1, 1, 0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 3.0F, -8.0F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5236F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 89, 44, -2.0F, 0.0F, 1.0F, 4, 3, 4, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.0F, -7.0F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 66, 161, -2.0F, 0.0F, 0.0F, 4, 3, 7, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 3.0F, -2.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 32, 139, -3.0F, -0.01F, -6.0F, 6, 3, 8, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.0F, -6.0F);
        this.Jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -2.0F, -3.01F, 0.01F, 4, 3, 8, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5236F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 50, -2.0F, -5.0F, 1.0F, 4, 5, 5, 0.0F, false));

        this.LowerSnout = new AdvancedModelRenderer(this);
        this.LowerSnout.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Jaw.addChild(LowerSnout);
        this.setRotateAngle(LowerSnout, 0.0175F, 0.0F, 0.0F);
        this.LowerSnout.cubeList.add(new ModelBox(LowerSnout, 0, 165, -2.0F, 0.0F, -6.9F, 4, 2, 7, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.LowerSnout.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1623F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 83, -1.5F, -1.0F, -6.0F, 3, 1, 6, -0.01F, false));

        this.LowerSnout2 = new AdvancedModelRenderer(this);
        this.LowerSnout2.setRotationPoint(0.0F, 0.0F, -6.9F);
        this.LowerSnout.addChild(LowerSnout2);
        this.setRotateAngle(LowerSnout2, 0.0175F, 0.0F, 0.0F);
        this.LowerSnout2.cubeList.add(new ModelBox(LowerSnout2, 0, 11, -1.5F, 0.0F, -9.0F, 3, 2, 9, 0.0F, false));

        this.LowerTeetj = new AdvancedModelRenderer(this);
        this.LowerTeetj.setRotationPoint(0.0F, 0.0F, -7.6F);
        this.LowerSnout2.addChild(LowerTeetj);
        this.setRotateAngle(LowerTeetj, -0.0262F, 0.0F, 0.0F);
        this.LowerTeetj.cubeList.add(new ModelBox(LowerTeetj, 0, 75, -1.0F, -0.75F, 0.0F, 2, 1, 7, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.LowerTeetj.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 71, 44, -1.5F, -0.75F, 0.0F, 3, 1, 6, -0.01F, false));

        this.Snout = new AdvancedModelRenderer(this);
        this.Snout.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.Head.addChild(Snout);
        this.setRotateAngle(Snout, 0.0175F, 0.0F, 0.0F);
        this.Snout.cubeList.add(new ModelBox(Snout, 153, 163, -2.0F, 1.0F, -7.0F, 4, 3, 7, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.Snout.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1396F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -1.5F, 0.0F, 6.13F, 3, 1, 1, -0.01F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 108, -1.5F, 0.0F, 0.0F, 3, 1, 7, 0.0F, false));

        this.Snout2 = new AdvancedModelRenderer(this);
        this.Snout2.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.Snout.addChild(Snout2);
        this.setRotateAngle(Snout2, 0.0175F, 0.0F, 0.0F);
        this.Snout2.cubeList.add(new ModelBox(Snout2, 64, 13, -1.5F, 1.0F, -9.0F, 3, 2, 9, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.Snout2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1047F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 3, 3, -1.0F, 1.0F, 8.3F, 2, 1, 1, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.0F, -9.0F);
        this.Snout2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1047F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 131, 163, -1.0F, 0.0F, 0.0F, 2, 1, 9, 0.0F, false));

        this.UpperTeeth = new AdvancedModelRenderer(this);
        this.UpperTeeth.setRotationPoint(0.0F, 3.0F, -7.5F);
        this.Snout2.addChild(UpperTeeth);
        this.setRotateAngle(UpperTeeth, 0.0087F, 0.0F, 0.0F);
        this.UpperTeeth.cubeList.add(new ModelBox(UpperTeeth, 123, 91, -1.0F, -0.25F, -1.0F, 2, 1, 9, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.UpperTeeth.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 72, 94, -1.5F, -0.25F, 1.0F, 3, 1, 5, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.0F, 8.0F);
        this.Chest.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -10.0F, -3.0F, 0.0F, 20, 16, 24, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 17.0F, 0.0F);
        this.Body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0349F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 54, 51, -8.0F, -4.0F, 0.0F, 16, 3, 24, 0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -6.0F, 24.0F);
        this.Body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 150, -8.0F, 0.03F, -11.0F, 16, 4, 11, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0349F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 123, 74, -8.0F, 1.0F, 0.0F, 16, 4, 13, 0.01F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -1.0F, 22.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 75, -8.5F, -1.0F, 0.0F, 17, 14, 19, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 14.0F, 19.0F);
        this.Body2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1047F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 116, 0, -6.5F, -3.0F, -19.0F, 13, 3, 19, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -3.0F, 19.0F);
        this.Body2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1047F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 116, -6.5F, 0.0F, -19.0F, 13, 4, 19, 0.0F, false));

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 2.0F, 17.0F);
        this.Body2.addChild(Hips);
        this.Hips.cubeList.add(new ModelBox(Hips, 54, 105, -7.0F, -2.0F, 0.0F, 14, 12, 18, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 10.0F, 18.0F);
        this.Hips.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1134F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 100, 117, -5.0F, -2.0F, -18.0F, 10, 2, 18, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -2.0F, 18.0F);
        this.Hips.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1745F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 129, 91, -5.0F, 0.0F, -17.0F, 10, 3, 17, 0.0F, false));

        this.BackFinL = new AdvancedModelRenderer(this);
        this.BackFinL.setRotationPoint(-6.0F, 5.5F, 6.0F);
        this.Hips.addChild(BackFinL);
        this.setRotateAngle(BackFinL, 0.4363F, 0.6109F, -1.0472F);
        this.BackFinL.cubeList.add(new ModelBox(BackFinL, 0, 139, -10.0F, -1.5F, -3.0F, 10, 3, 6, 0.0F, false));
        this.BackFinL.cubeList.add(new ModelBox(BackFinL, 104, 22, -24.0F, 0.0F, -2.99F, 24, 0, 12, 0.01F, false));

        this.BackFinR = new AdvancedModelRenderer(this);
        this.BackFinR.setRotationPoint(6.0F, 5.5F, 6.0F);
        this.Hips.addChild(BackFinR);
        this.setRotateAngle(BackFinR, 0.4363F, -0.6109F, 1.0472F);
        this.BackFinR.cubeList.add(new ModelBox(BackFinR, 0, 139, 0.0F, -1.5F, -3.0F, 10, 3, 6, 0.0F, true));
        this.BackFinR.cubeList.add(new ModelBox(BackFinR, 104, 22, 0.0F, 0.0F, -2.99F, 24, 0, 12, 0.01F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 2.0F, 16.0F);
        this.Hips.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 110, 44, -5.0F, -3.0F, 0.0F, 10, 10, 20, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 19.0F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 47, 135, -3.5F, -2.5F, -1.0F, 7, 9, 17, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 1.0F, 14.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0175F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 131, 137, -2.5F, -3.0F, 0.0F, 5, 8, 18, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 17.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.2618F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 150, 22, -1.5F, -2.5F, 0.0F, 3, 7, 18, 0.0F, false));
        this.Tail4.cubeList.add(new ModelBox(Tail4, 95, 119, 0.0F, -21.0F, 0.0F, 0, 19, 18, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.5F, 17.0F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.0436F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 111, 157, -1.0F, -2.0F, 0.0F, 2, 5, 16, 0.0F, false));
        this.Tail5.cubeList.add(new ModelBox(Tail5, 95, 140, -0.01F, -18.5F, 0.0F, 0, 17, 16, 0.0F, false));

        this.Tail6 = new AdvancedModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, 0.0F, 15.0F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, 0.0436F, 0.0F, 0.0F);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 76, 161, -0.5F, -1.5F, 0.0F, 1, 4, 12, 0.0F, false));
        this.Tail6.cubeList.add(new ModelBox(Tail6, 45, 96, 0.0F, -14.5F, 0.0F, 0, 13, 12, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Chest.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Chest.offsetY = 0.4F;
        this.Chest.offsetX = 0.8F;
        this.Chest.offsetZ = 2.0F;
        this.Chest.rotateAngleY = (float)Math.toRadians(120);
        this.Chest.rotateAngleX = (float)Math.toRadians(1);
        this.Chest.rotateAngleZ = (float)Math.toRadians(0);
        this.Chest.scaleChildren = true;
        float scaler = 0.4F;
        this.Chest.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Chest, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(cube_r1, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(FrontFinL, 0.3003F, 0.0707F, -0.8552F);
        this.setRotateAngle(FrontFinR, 0.3312F, -0.2051F, 0.8571F);
        this.setRotateAngle(DorsalFin, 1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, -0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r4, -0.1658F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, -0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r6, -0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.0873F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r8, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(LowerSnout, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.1623F, 0.0F, 0.0F);
        this.setRotateAngle(LowerSnout2, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(LowerTeetj, -0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Snout, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(Snout2, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(UpperTeeth, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Body, -0.0436F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r18, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, -0.0436F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r21, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(Hips, -0.0436F, -0.1745F, 0.0F);
        this.setRotateAngle(cube_r23, 0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(BackFinL, 0.22F, 0.1722F, -1.0567F);
        this.setRotateAngle(BackFinR, 0.1784F, -0.2271F, 1.0819F);
        this.setRotateAngle(Tail, -0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(Tail2, 0.0436F, 0.0873F, 0.0F);
        this.setRotateAngle(Tail3, 0.0611F, 0.0436F, 0.0008F);
        this.setRotateAngle(Tail4, -0.3512F, 0.1264F, -0.0341F);
        this.setRotateAngle(Tail5, 0.0447F, 0.218F, 0.0097F);
        this.setRotateAngle(Tail6, 0.0481F, 0.4359F, 0.0203F);
        //End of pose, now render the model:
        this.Chest.render(f);
        //Reset rotations, positions and sizing:
        this.Chest.setScale(1.0F, 1.0F, 1.0F);
        this.Chest.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.Head.offsetY = -0.019F;
        this.Jaw.rotateAngleX = (float) Math.toRadians(25);
        this.Head.rotateAngleX = (float) Math.toRadians(0);
        this.Head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Chest, 0.0873F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(cube_r1, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(FrontFinL, 0.3003F, 0.0707F, -0.8552F);
        this.setRotateAngle(FrontFinR, 0.3312F, -0.2051F, 0.8571F);
        this.setRotateAngle(DorsalFin, 1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, -0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r4, -0.1658F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, -0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r6, -0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.0873F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r8, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(LowerSnout, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.1623F, 0.0F, 0.0F);
        this.setRotateAngle(LowerSnout2, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(LowerTeetj, -0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Snout, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(Snout2, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(UpperTeeth, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Body, -0.0436F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r18, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, -0.0436F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r21, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(Hips, -0.0436F, -0.1745F, 0.0F);
        this.setRotateAngle(cube_r23, 0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(BackFinL, 0.22F, 0.1722F, -1.0567F);
        this.setRotateAngle(BackFinR, 0.1784F, -0.2271F, 1.0819F);
        this.setRotateAngle(Tail, -0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(Tail2, 0.0436F, 0.0873F, 0.0F);
        this.setRotateAngle(Tail3, 0.0611F, 0.0436F, 0.0008F);
        this.setRotateAngle(Tail4, -0.3512F, 0.1264F, -0.0341F);
        this.setRotateAngle(Tail5, 0.0447F, 0.218F, 0.0097F);
        this.setRotateAngle(Tail6, 0.0481F, 0.4359F, 0.0203F);
        this.Chest.offsetY = -0.36F;
        this.Chest.offsetX = -0.44F;
        this.Chest.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(Chest, 0.0873F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(cube_r1, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(FrontFinL, 0.3003F, 0.0707F, -0.8552F);
        this.setRotateAngle(FrontFinR, 0.3312F, -0.2051F, 0.8571F);
        this.setRotateAngle(DorsalFin, 1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, -0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r4, -0.1658F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, -0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r6, -0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.0873F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r8, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(LowerSnout, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.1623F, 0.0F, 0.0F);
        this.setRotateAngle(LowerSnout2, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(LowerTeetj, -0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Snout, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(Snout2, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(UpperTeeth, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Body, -0.0436F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r18, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, -0.0436F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r21, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(Hips, -0.0436F, -0.1745F, 0.0F);
        this.setRotateAngle(cube_r23, 0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(BackFinL, 0.22F, 0.1722F, -1.0567F);
        this.setRotateAngle(BackFinR, 0.1784F, -0.2271F, 1.0819F);
        this.setRotateAngle(Tail, -0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(Tail2, 0.0436F, 0.0873F, 0.0F);
        this.setRotateAngle(Tail3, 0.0611F, 0.0436F, 0.0008F);
        this.setRotateAngle(Tail4, -0.3512F, 0.1264F, -0.0341F);
        this.setRotateAngle(Tail5, 0.0447F, 0.218F, 0.0097F);
        this.setRotateAngle(Tail6, 0.0481F, 0.4359F, 0.0203F);
        this.Chest.offsetY = 0.12F;
        this.Chest.offsetX = -0.44F;
        this.Chest.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        this.Chest.offsetY = 0.15F;
        this.Chest.offsetZ = -1F;

       AdvancedModelRenderer[] fishTail = {this.Body, this.Body2, this.Hips, this.Tail, this.Tail2, this.Tail3, this.Tail4, this.Tail5, this.Tail6};
        AdvancedModelRenderer[] upperBody = {this.Neck, this.Neck2, this.Head};
        ((EntityPrehistoricFloraCymbospondylus)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.15F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 1.8F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.18F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.35F * still, -3, f2, 0.5F * still);
            }
            else {
                this.chainSwing(fishTail, speed * still, 0.45F * still, -3, f2, 0.5F * still);
            }
            this.chainSwing(upperBody, speed * still, 0.15F, 0, f2, 0.5F *still);
        }
        else {
            //Dont swing if on land - it loooks dumb
            //this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(FrontFinL, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(FrontFinL, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);
        this.walk(FrontFinL, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

        this.flap(FrontFinR, (float) (speed * 0.65), 0.4F, true, 0.8F, 0, f2, 0.5F);
        this.swing(FrontFinR, (float) (speed * 0.65), 0.2F, false, 0, 0, f2, 0.5F);
        this.walk(FrontFinR, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

        this.flap(BackFinL, (float) (speed * 0.65), 0.4F, false, 1.8F, 0, f2, 0.5F);
        this.swing(BackFinL, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);
        this.walk(BackFinL, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

        this.flap(BackFinR, (float) (speed * 0.65), 0.4F, true, 1.8F, 0, f2, 0.5F);
        this.swing(BackFinR, (float) (speed * 0.65), 0.2F, false, 1, 0, f2, 0.5F);
        this.walk(BackFinR, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            //this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.Chest.offsetY = 0.15F;
            this.bob(Chest, -speed * 1.8F, 0.02F, false, f2, 1);
            this.walk(Jaw, (float) (speed * 1.8F), 0.15F, false, 1, 0, f2, 0);
            this.chainWave(fishTail, speed * 1.5F, 0.0025F, -0.1, f2, 0.4F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.01F, -0.25, f2, 0.2F * still);
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Head, 0,0,-0.2F);
        animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

