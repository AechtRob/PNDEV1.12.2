package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPanguraptor;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPanguraptor extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended Hips;
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended Chest;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended Neck2;
    private final AdvancedModelRendererExtended Neck3;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended lips;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended forehead;
    private final AdvancedModelRendererExtended forehead2;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended ThroatPouch;
    private final AdvancedModelRendererExtended UpperArmR;
    private final AdvancedModelRendererExtended LowerArmR;
    private final AdvancedModelRendererExtended HandR;
    private final AdvancedModelRendererExtended UpperArmL;
    private final AdvancedModelRendererExtended LowerArmL;
    private final AdvancedModelRendererExtended HandL;
    private final AdvancedModelRendererExtended Tail;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended Tail4;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended UpperLegR;
    private final AdvancedModelRendererExtended LowerLegR;
    private final AdvancedModelRendererExtended FootR;
    private final AdvancedModelRendererExtended ToesR;
    private final AdvancedModelRendererExtended UpperLegL;
    private final AdvancedModelRendererExtended LowerLegL;
    private final AdvancedModelRendererExtended FootL;
    private final AdvancedModelRendererExtended ToesL;

    private ModelAnimator animator;

    public ModelPanguraptor() {
        this.textureWidth = 83;
        this.textureHeight = 71;

        this.Hips = new AdvancedModelRendererExtended(this);
        this.Hips.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.setRotateAngle(Hips, -0.0436F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 36, 0, -2.5F, -2.0F, -4.0F, 5, 9, 10, 0.0F, false));

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, -0.0436F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 24, 52, -2.5F, -2.0F, -6.0F, 5, 9, 6, -0.01F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -4.5F, -7.0F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 66, 3, -0.5F, 0.0862F, 0.445F, 1, 4, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -1.5F, -2.0F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 56, 0, -1.5F, -1.0F, -5.0F, 3, 2, 7, 0.0F, false));

        this.Chest = new AdvancedModelRendererExtended(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.0436F, 0.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 0, 41, -3.0F, -2.0F, -8.0F, 6, 8, 9, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -4.0F, -1.0F);
        this.Chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 69, 25, -1.0F, -0.4087F, -5.2354F, 2, 3, 6, 0.01F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, -2.0F, -4.0F);
        this.Chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 59, 21, -2.0F, -1.0F, -2.0F, 4, 2, 6, 0.01F, false));

        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, 0.3F, -7.0F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.2618F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 57, 40, -2.0F, -2.0F, -7.0F, 4, 4, 7, 0.0F, false));
        this.Neck.cubeList.add(new ModelBox(Neck, 59, 13, -1.5F, 2.0F, -7.0F, 3, 2, 7, 0.0F, false));

        this.Neck2 = new AdvancedModelRendererExtended(this);
        this.Neck2.setRotationPoint(0.0F, -0.4F, -5.7F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.2618F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 0, 58, -1.5F, -1.5F, -7.0F, 3, 4, 7, 0.0F, false));
        this.Neck2.cubeList.add(new ModelBox(Neck2, 30, 45, -1.0F, 2.5F, -6.0F, 2, 1, 6, 0.01F, false));

        this.Neck3 = new AdvancedModelRendererExtended(this);
        this.Neck3.setRotationPoint(0.0F, -0.5F, -6.4F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.4363F, 0.0F, 0.0F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 17, 0, -1.0F, -1.0F, -6.0F, 2, 4, 6, -0.02F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, 0.9F, -5.2F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.1745F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 19, 31, -1.5F, -2.0F, -3.0F, 3, 3, 3, 0.0F, false));

        this.lips = new AdvancedModelRendererExtended(this);
        this.lips.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.Head.addChild(lips);
        this.setRotateAngle(lips, -0.0087F, 0.0F, 0.0F);
        this.lips.cubeList.add(new ModelBox(lips, 0, 30, -1.0F, -2.0F, -4.0F, 2, 2, 4, 0.0F, false));
        this.lips.cubeList.add(new ModelBox(lips, 17, 0, -0.5F, -1.01F, -5.5F, 1, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.lips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0262F, 0.1309F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 9, 0.3F, 0.3F, 0.0F, 0, 1, 5, 0.0F, true));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.lips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0262F, -0.1309F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 9, -0.3F, 0.3F, 0.0F, 0, 1, 5, 0.0F, false));

        this.forehead = new AdvancedModelRendererExtended(this);
        this.forehead.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.Head.addChild(forehead);
        this.setRotateAngle(forehead, -0.1431F, 0.0F, 0.0F);
        this.forehead.cubeList.add(new ModelBox(forehead, 25, 10, -1.0F, -0.01F, -2.0F, 2, 2, 2, -0.01F, false));

        this.forehead2 = new AdvancedModelRendererExtended(this);
        this.forehead2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.forehead.addChild(forehead2);
        this.setRotateAngle(forehead2, 0.48F, 0.0F, 0.0F);
        this.forehead2.cubeList.add(new ModelBox(forehead2, 27, 0, -0.5F, -0.01F, -2.98F, 1, 2, 3, -0.01F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.forehead2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.5F, -0.019F, -2.1F, 1, 1, 1, -0.03F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 0, -0.5F, -0.01F, -1.95F, 1, 1, 2, -0.02F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 21, 45, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1571F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 41, -1.0F, -3.0F, 0.5F, 2, 3, 2, -0.01F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(0.0F, 0.6395F, -3.3986F);
        this.Jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.0262F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 17, 10, -1.0F, -0.6595F, -3.5814F, 2, 1, 4, -0.01F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 17, 3, -0.5F, -0.6595F, -5.1014F, 1, 1, 2, -0.02F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, -0.6395F, -4.6014F);
        this.jaw2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.1309F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 0, 0.29F, -0.3F, 1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, -0.6395F, -4.6014F);
        this.jaw2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, -0.1309F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 0, -0.29F, -0.3F, 1.0F, 0, 1, 3, 0.0F, false));

        this.ThroatPouch = new AdvancedModelRendererExtended(this);
        this.ThroatPouch.setRotationPoint(0.0F, 3.0F, -2.0F);
        this.Neck3.addChild(ThroatPouch);
        this.ThroatPouch.cubeList.add(new ModelBox(ThroatPouch, 29, 23, -1.0F, -2.0F, -3.0F, 2, 2, 3, -0.03F, false));

        this.UpperArmR = new AdvancedModelRendererExtended(this);
        this.UpperArmR.setRotationPoint(-3.0F, 3.5F, -5.5F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, 0.48F, 0.0F, 0.0F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 19, 23, -1.0F, -1.0F, -1.5F, 2, 5, 3, 0.0F, false));

        this.LowerArmR = new AdvancedModelRendererExtended(this);
        this.LowerArmR.setRotationPoint(0.0F, 4.0F, 1.0F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, -0.9599F, 0.0F, 0.0F);
        this.LowerArmR.cubeList.add(new ModelBox(LowerArmR, 40, 23, -1.0F, -0.5F, -2.0F, 2, 6, 2, -0.01F, false));

        this.HandR = new AdvancedModelRendererExtended(this);
        this.HandR.setRotationPoint(-0.5F, 5.0F, -1.0F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, 0.1135F, 0.0653F, -0.5199F);
        this.HandR.cubeList.add(new ModelBox(HandR, 36, 0, -0.5F, 0.0F, -1.5F, 1, 5, 3, -0.02F, false));

        this.UpperArmL = new AdvancedModelRendererExtended(this);
        this.UpperArmL.setRotationPoint(3.0F, 3.5F, -5.5F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, 0.48F, 0.0F, 0.0F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 19, 23, -1.0F, -1.0F, -1.5F, 2, 5, 3, 0.0F, true));

        this.LowerArmL = new AdvancedModelRendererExtended(this);
        this.LowerArmL.setRotationPoint(0.0F, 4.0F, 1.0F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, -0.9599F, 0.0F, 0.0F);
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 40, 23, -1.0F, -0.5F, -2.0F, 2, 6, 2, -0.01F, true));

        this.HandL = new AdvancedModelRendererExtended(this);
        this.HandL.setRotationPoint(0.5F, 5.0F, -1.0F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.1135F, -0.0653F, 0.5199F);
        this.HandL.cubeList.add(new ModelBox(HandL, 36, 0, -0.5F, 0.0F, -1.5F, 1, 5, 3, -0.02F, true));

        this.Tail = new AdvancedModelRendererExtended(this);
        this.Tail.setRotationPoint(0.0F, -0.9F, 5.0F);
        this.Hips.addChild(Tail);
        this.setRotateAngle(Tail, 0.0436F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 40, 23, -2.0F, -1.0F, 0.0F, 4, 6, 11, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 0.1F, 10.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0873F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 21, 28, -1.5F, -1.0F, 0.0F, 3, 4, 13, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 40, 40, -1.0F, 3.0F, 0.0F, 2, 1, 13, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.1F, 12.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0436F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 23, -1.0F, -1.0F, 0.0F, 2, 3, 15, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0646F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -0.5F, -3.0F, 0.0F, 1, 2, 15, 0.0F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 14.5F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0873F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 18, 5, -0.5F, -1.0F, 0.0F, 1, 2, 16, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Tail4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.01F, -1.0F, 0.0F, 0, 4, 17, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -0.01F, -1.0F, 0.0F, 0, 4, 17, 0.0F, false));

        this.UpperLegR = new AdvancedModelRendererExtended(this);
        this.UpperLegR.setRotationPoint(-2.5F, 1.0F, 1.0F);
        this.Hips.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, -0.2618F, 0.0F, 0.0F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 46, 54, -2.0F, -1.0F, -3.0F, 3, 9, 6, 0.0F, false));

        this.LowerLegR = new AdvancedModelRendererExtended(this);
        this.LowerLegR.setRotationPoint(-0.5F, 8.0F, -2.0F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, 0.829F, 0.0F, 0.0F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 0, 0, -1.0F, -0.01F, 0.0F, 2, 10, 4, -0.01F, false));

        this.FootR = new AdvancedModelRendererExtended(this);
        this.FootR.setRotationPoint(0.0F, 10.0F, 3.5F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, -0.829F, 0.0F, 0.0F);
        this.FootR.cubeList.add(new ModelBox(FootR, 0, 21, -1.0F, -0.03F, -3.0F, 2, 6, 3, -0.02F, false));

        this.ToesR = new AdvancedModelRendererExtended(this);
        this.ToesR.setRotationPoint(0.0F, 6.0F, -1.0F);
        this.FootR.addChild(ToesR);
        this.setRotateAngle(ToesR, 0.3054F, 0.0F, 0.0F);
        this.ToesR.cubeList.add(new ModelBox(ToesR, 58, 63, -1.5F, -0.9537F, -5.1993F, 3, 2, 6, 0.0F, false));

        this.UpperLegL = new AdvancedModelRendererExtended(this);
        this.UpperLegL.setRotationPoint(2.5F, 1.0F, 1.0F);
        this.Hips.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, -0.2618F, 0.0F, 0.0F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 46, 54, -1.0F, -1.0F, -3.0F, 3, 9, 6, 0.0F, true));

        this.LowerLegL = new AdvancedModelRendererExtended(this);
        this.LowerLegL.setRotationPoint(0.5F, 8.0F, -2.0F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.829F, 0.0F, 0.0F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 0, 0, -1.0F, -0.01F, 0.0F, 2, 10, 4, -0.01F, true));

        this.FootL = new AdvancedModelRendererExtended(this);
        this.FootL.setRotationPoint(0.0F, 10.0F, 3.5F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, -0.829F, 0.0F, 0.0F);
        this.FootL.cubeList.add(new ModelBox(FootL, 0, 21, -1.0F, -0.03F, -3.0F, 2, 6, 3, -0.02F, true));

        this.ToesL = new AdvancedModelRendererExtended(this);
        this.ToesL.setRotationPoint(0.0F, 6.0F, -1.0F);
        this.FootL.addChild(ToesL);
        this.setRotateAngle(ToesL, 0.3054F, 0.0F, 0.0F);
        this.ToesL.cubeList.add(new ModelBox(ToesL, 58, 63, -1.5F, -0.9537F, -5.1993F, 3, 2, 6, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    @Override

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hips.offsetY = 0.0F;
        this.Hips.offsetX = 0.4F;
        this.Hips.offsetZ = 2.0F;
        this.Hips.rotateAngleY = (float)Math.toRadians(120);
        this.Hips.rotateAngleX = (float)Math.toRadians(0);
        this.Hips.rotateAngleZ = (float)Math.toRadians(0);
        this.Hips.scaleChildren = true;
        float scaler = 0.8F;
        this.Hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Hips, 0.0F, 3.8F, -0.2F);
        this.setRotateAngle(Body, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Chest, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Neck3, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(lips, -0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.0262F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r6, -0.0262F, -0.1309F, 0.0F);
        this.setRotateAngle(forehead, -0.1431F, 0.0F, 0.0F);
        this.setRotateAngle(forehead2, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(jaw2, -0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0436F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0436F, -0.1309F, 0.0F);
        this.setRotateAngle(UpperArmR, 0.48F, 0.0F, 0.8727F);
        this.setRotateAngle(LowerArmR, -0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(HandR, 0.1135F, 0.0653F, -0.5199F);
        this.setRotateAngle(UpperArmL, 0.0F, 0.0F, -0.829F);
        this.setRotateAngle(LowerArmL, -0.9599F, 0.0F, -0.3927F);
        this.setRotateAngle(HandL, 0.1135F, 0.1092F, 0.9999F);
        this.setRotateAngle(Tail, 0.2182F, 0.1309F, 0.0F);
        this.setRotateAngle(Tail2, 0.2182F, 0.1309F, 0.0F);
        this.setRotateAngle(Tail3, 0.4363F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r11, -0.0646F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, 0.3927F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r12, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegR, -1.0472F, 0.2618F, 0.0873F);
        this.setRotateAngle(LowerLegR, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(FootR, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(ToesR, 2.138F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegL, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegL, 1.0908F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, -0.829F, 0.0F, 0.0F);
        this.setRotateAngle(ToesL, 0.3054F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Hips.render(f);
        //Reset rotations, positions and sizing:
        this.Hips.setScale(1.0F, 1.0F, 1.0F);
        this.Hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.Neck.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Hips, -0.4363F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(Body, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Chest, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Neck3, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(lips, -0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.0262F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r6, -0.0262F, -0.1309F, 0.0F);
        this.setRotateAngle(forehead, -0.1431F, 0.0F, 0.0F);
        this.setRotateAngle(forehead2, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(jaw2, -0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0436F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0436F, -0.1309F, 0.0F);
        this.setRotateAngle(UpperArmR, 0.48F, 0.0F, 0.8727F);
        this.setRotateAngle(LowerArmR, -0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(HandR, 0.1135F, 0.0653F, -0.5199F);
        this.setRotateAngle(UpperArmL, 0.0F, 0.0F, -0.829F);
        this.setRotateAngle(LowerArmL, -0.9599F, 0.0F, -0.3927F);
        this.setRotateAngle(HandL, 0.1135F, 0.1092F, 0.9999F);
        this.setRotateAngle(Tail, 0.2182F, 0.1309F, 0.0F);
        this.setRotateAngle(Tail2, 0.2182F, 0.1309F, 0.0F);
        this.setRotateAngle(Tail3, 0.4363F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r11, -0.0646F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, 0.3927F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r12, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegR, -1.0472F, 0.2618F, 0.0873F);
        this.setRotateAngle(LowerLegR, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(FootR, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(ToesR, 2.138F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegL, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegL, 1.0908F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, -0.829F, 0.0F, 0.0F);
        this.setRotateAngle(ToesL, 0.3054F, 0.0F, 0.0F);

        this.Hips.offsetY = 0.01F;
        this.Hips.render(0.01F);
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
        this.Hips.offsetY = 0.02F;
        //this.Hips.offsetZ = 0.2F;

        f2 = 0;


        EntityPrehistoricFloraPanguraptor Panguraptor = (EntityPrehistoricFloraPanguraptor) e;
        float masterSpeed = Panguraptor.getTravelSpeed() * 1.8F;

        this.faceTarget(f3, f4, 10, Neck);
        this.faceTarget(f3, f4, 10, Neck2);
        this.faceTarget(f3, f4, 10, Neck3);
        this.faceTarget(f3, f4, 10, Head);

        //float speed = 0.2F;

        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Neck = {this.Neck, this.Neck2, this.Neck3};
        Panguraptor.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] ArmL = {this.UpperArmL, this.LowerArmL};
        AdvancedModelRenderer[] ArmR = {this.UpperArmR, this.LowerArmR};


        if (Panguraptor.getAnimation() == Panguraptor.LAY_ANIMATION) {
//            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
//            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
//            //Other stuff

            return;
        }
        
        if (!Panguraptor.isReallyInWater()) {

            if (f3 == 0.0F || !Panguraptor.getIsMoving()) {
//                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
//                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
//                this.chainFlap(Tail, (0.2F*0.6F), 0.10F, 0.2F, f2, 1F);
//                this.chainSwing(Tail, (0.2F*0.6F) * 2F, 0.05F, 0.12F, f2, 1F);

                return;
           }

            if (Panguraptor.getIsFast()) { //Running
//                float speed = masterSpeed / 2F;
//                this.Hips.offsetY = 0.05F;
//                this.UpperLegL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 3, f2, 1.5F);
//                this.UpperLegR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 0, f2, 1.5F);
//
//                this.chainWaveExtended(ArmL, speed, 0.10F, 0.5, 8, f2, 1F);
//                this.chainWaveExtended(ArmR, speed, 0.10F, 0.5, 5, f2, 1F);
//                this.walk(HandL, speed, 0.10F, true, 5, 0F, f2, 1F);
//                this.walk(HandR, speed, 0.10F, true, 2, 0F, f2, 1F);
//
//                this.walk(UpperLegL, speed, 0.60F, true, 8, 0.55F, f2, 1F);
//                this.walk(UpperLegR, speed, 0.60F, true, 5, 0.55F, f2, 1F);
//
//                this.walk(LowerLegL, speed, 0.60F, true, 6.5F, -0.7F, f2, 1F);
//                this.walk(LowerLegR, speed, 0.60F, true, 3.5F, -0.7F, f2, 1F);
//
//                this.walk(FootL, speed, 0.25F, true, 4, -0.18F, f2, 1F);
//                this.walk(FootR, speed, 0.25F, true, 1, -0.18F, f2, 1F);
//
//                this.walk(ToesL, speed, 1.2F, true, 7.5F, -0.5F, f2, 1F);
//                this.walk(ToesR, speed, 1.2F, true, 4.5F, -0.5F, f2, 1F);
//
//                this.bobExtended(Hips, speed * 2F, 1.0F, false, 2.5F, f2, 1F);
//
//                this.flap(Hips, speed, 0.12F, false, 5.0F, 0.06F, f2, 1.0F);
//                this.flap(Body, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);
//                this.flap(Chest, speed, -0.08F, false, 5.0F, -0.04F, f2, 1.0F);
//                this.flap(this.Neck, speed, 0.08F, false, 5.0F, 0.04F, f2, 1.0F);
//
//                this.flap(UpperLegL, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);
//                this.flap(UpperLegR, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);
//
//                this.walk(Body, speed * 2, 0.015F, false, 2.5F, -0.01F, f2, 0.8F);
//                this.walk(Chest, speed * 2, 0.04F, false, 2.5F, -0.01F, f2, 0.8F);
//
//                this.walk(this.Neck, speed * 2, -0.25F, false, 2.5F, 0F, f2, 0.8F);
//                this.walk(Neck2, speed * 2, -0.3F, false, 2.5F, 0F, f2, 0.8F);
//                this.walk(Neck3, speed * 2, 0.2F, false, 2.5F, 0F, f2, 0.8F);
//                this.walk(Head, speed * 2, 0.35F, false, 2.5F, 0F, f2, 0.8F);
//
//                this.chainFlap(Tail, (speed * 0.6F), 0.20F, 0.2F, f2, 1F);
//                this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.10F, 0.12F, f2, 1F);
//
//                this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1) + 0.2F;
            }
            else { //Walking
//                float speed = masterSpeed / 2.00F;
//                this.Hips.offsetY = 0.05F;
//                this.UpperLegL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.625), false, 3, f2, 1.5F);
//                this.UpperLegR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.625), false, 0, f2, 1.5F);
//
//                this.chainWaveExtended(ArmL, speed, 0.10F, 0.5, 8, f2, 1F);
//                this.chainWaveExtended(ArmR, speed, 0.10F, 0.5, 5, f2, 1F);
//                this.walk(HandL, speed, 0.10F, true, 5, 0F, f2, 1F);
//                this.walk(HandR, speed, 0.10F, true, 2, 0F, f2, 1F);
//
//                this.walk(UpperLegL, speed, 0.40F, true, 8, 0.35F, f2, 1F);
//                this.walk(UpperLegR, speed, 0.40F, true, 5, 0.35F, f2, 1F);
//
//                this.walk(LowerLegL, speed, 0.30F, true, 6.5F, 0F, f2, 1F);
//                this.walk(LowerLegR, speed, 0.30F, true, 3.5F, 0F, f2, 1F);
//
//                this.bobExtended(LowerLegL, speed, 1.5F, false, 7.0F, f2, 1F);
//                this.bobExtended(LowerLegR, speed, 1.5F, false, 4.0F, f2, 1F);
//
//                this.walk(FootL, speed, 0.25F, true, 4, -0.18F, f2, 1F);
//                this.walk(FootR, speed, 0.25F, true, 1, -0.18F, f2, 1F);
//
//                this.walk(ToesL, speed, 0.5F, true, 5.0F, -0.45F, f2, 1F);
//                this.walk(ToesR, speed, 0.5F, true, 2.0F, -0.45F, f2, 1F);
//
//                this.bobExtended(Hips, speed * 2F, 1.33F, false, 3.5F, f2, 1F);
//
//                this.flap(Hips, speed, 0.22F, false, 6.0F, 0.06F, f2, 1.0F);
//                this.flap(Body, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);
//                this.flap(Chest, speed, -0.12F, false, 6.0F, -0.04F, f2, 1.0F);
//                this.flap(this.Neck, speed, 0.12F, false, 6.0F, 0.04F, f2, 1.0F);
//
//                this.flap(UpperLegL, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);
//                this.flap(UpperLegR, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);
//
//                this.walk(Body, speed * 2, 0.015F, false, 2.5F, -0.01F, f2, 0.8F);
//                this.walk(Chest, speed * 2, 0.04F, false, 2.5F, -0.01F, f2, 0.8F);
//
//                this.walk(this.Neck, speed * 2, -0.25F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
//                this.walk(Neck2, speed * 2, -0.3F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
//                this.walk(Neck3, speed * 2, 0.2F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
//                this.walk(Head, speed * 2, 0.35F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
//
//                this.chainFlap(Tail, (speed * 0.6F), 0.20F * 0.75F, 0.2F, f2, 1F);
//                this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.10F * 0.75F, 0.12F, f2, 1F);
//
//                this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(4.0), false, 1.75F, f2, 1) + 0.2F;

            }
        }
        else {
            //Swimming pose:
            
            if (f3 == 0.0F) { //static in water
                return;
            }
            //moving in water

            return;

        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPanguraptor ee = (EntityPrehistoricFloraPanguraptor) entitylivingbaseIn;

        float masterSpeed = ee.getTravelSpeed() * 1.8F;
        float f2 = (float)ee.ticksExisted + partialTickTime;
        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Neck = {this.Neck, this.Neck2, this.Neck3};
        AdvancedModelRenderer[] ArmL = {this.UpperArmL, this.LowerArmL};
        AdvancedModelRenderer[] ArmR = {this.UpperArmR, this.LowerArmR};


        if ((!ee.isReallyInWater())) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
                if (ee.getIsFast()) { //Running
                    float speed = masterSpeed / 2F;
                    this.Hips.offsetY = 0.05F;
                    this.UpperLegL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 3, f2, 1.5F);
                    this.UpperLegR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 0, f2, 1.5F);

                    this.chainWaveExtended(ArmL, speed, 0.10F, 0.5, 8, f2, 1F);
                    this.chainWaveExtended(ArmR, speed, 0.10F, 0.5, 5, f2, 1F);
                    this.walk(HandL, speed, 0.10F, true, 5, 0F, f2, 1F);
                    this.walk(HandR, speed, 0.10F, true, 2, 0F, f2, 1F);

                    this.walk(UpperLegL, speed, 0.60F, true, 8, 0.55F, f2, 1F);
                    this.walk(UpperLegR, speed, 0.60F, true, 5, 0.55F, f2, 1F);

                    this.walk(LowerLegL, speed, 0.60F, true, 6.5F, -0.7F, f2, 1F);
                    this.walk(LowerLegR, speed, 0.60F, true, 3.5F, -0.7F, f2, 1F);

                    this.walk(FootL, speed, 0.25F, true, 4, -0.18F, f2, 1F);
                    this.walk(FootR, speed, 0.25F, true, 1, -0.18F, f2, 1F);

                    this.walk(ToesL, speed, 1.2F, true, 7.5F, -0.5F, f2, 1F);
                    this.walk(ToesR, speed, 1.2F, true, 4.5F, -0.5F, f2, 1F);

                    this.bobExtended(Hips, speed * 2F, 1.0F, false, 2.5F, f2, 1F);

                    this.flap(Hips, speed, 0.12F, false, 5.0F, 0.06F, f2, 1.0F);
                    this.flap(Body, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);
                    this.flap(Chest, speed, -0.08F, false, 5.0F, -0.04F, f2, 1.0F);
                    this.flap(this.Neck, speed, 0.08F, false, 5.0F, 0.04F, f2, 1.0F);

                    this.flap(UpperLegL, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);
                    this.flap(UpperLegR, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);

                    this.walk(Body, speed * 2, 0.015F, false, 2.5F, -0.01F, f2, 0.8F);
                    this.walk(Chest, speed * 2, 0.04F, false, 2.5F, -0.01F, f2, 0.8F);

                    this.walk(this.Neck, speed * 2, -0.25F, false, 2.5F, 0F, f2, 0.8F);
                    this.walk(Neck2, speed * 2, -0.3F, false, 2.5F, 0F, f2, 0.8F);
                    this.walk(Neck3, speed * 2, 0.2F, false, 2.5F, 0F, f2, 0.8F);
                    this.walk(Head, speed * 2, 0.35F, false, 2.5F, 0F, f2, 0.8F);

                    this.chainFlap(Tail, (speed * 0.6F), 0.20F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

                    this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1) + 0.2F;

                } else { //Walking
                    float speed = masterSpeed / 2.00F;
                    this.Hips.offsetY = 0.05F;
                    this.UpperLegL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.625), false, 3, f2, 1.5F);
                    this.UpperLegR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.625), false, 0, f2, 1.5F);

                    this.chainWaveExtended(ArmL, speed, 0.10F, 0.5, 8, f2, 1F);
                    this.chainWaveExtended(ArmR, speed, 0.10F, 0.5, 5, f2, 1F);
                    this.walk(HandL, speed, 0.10F, true, 5, 0F, f2, 1F);
                    this.walk(HandR, speed, 0.10F, true, 2, 0F, f2, 1F);

                    this.walk(UpperLegL, speed, 0.40F, true, 8, 0.35F, f2, 1F);
                    this.walk(UpperLegR, speed, 0.40F, true, 5, 0.35F, f2, 1F);

                    this.walk(LowerLegL, speed, 0.30F, true, 6.5F, 0F, f2, 1F);
                    this.walk(LowerLegR, speed, 0.30F, true, 3.5F, 0F, f2, 1F);

                    this.bobExtended(LowerLegL, speed, 1.5F, false, 7.0F, f2, 1F);
                    this.bobExtended(LowerLegR, speed, 1.5F, false, 4.0F, f2, 1F);

                    this.walk(FootL, speed, 0.25F, true, 4, -0.18F, f2, 1F);
                    this.walk(FootR, speed, 0.25F, true, 1, -0.18F, f2, 1F);

                    this.walk(ToesL, speed, 0.5F, true, 5.0F, -0.45F, f2, 1F);
                    this.walk(ToesR, speed, 0.5F, true, 2.0F, -0.45F, f2, 1F);

                    this.bobExtended(Hips, speed * 2F, 1.33F, false, 3.5F, f2, 1F);

                    this.flap(Hips, speed, 0.22F, false, 6.0F, 0.06F, f2, 1.0F);
                    this.flap(Body, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);
                    this.flap(Chest, speed, -0.12F, false, 6.0F, -0.04F, f2, 1.0F);
                    this.flap(this.Neck, speed, 0.12F, false, 6.0F, 0.04F, f2, 1.0F);

                    this.flap(UpperLegL, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);
                    this.flap(UpperLegR, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);

                    this.walk(Body, speed * 2, 0.015F, false, 2.5F, -0.01F, f2, 0.8F);
                    this.walk(Chest, speed * 2, 0.04F, false, 2.5F, -0.01F, f2, 0.8F);

                    this.walk(this.Neck, speed * 2, -0.25F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                    this.walk(Neck2, speed * 2, -0.3F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                    this.walk(Neck3, speed * 2, 0.2F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                    this.walk(Head, speed * 2, 0.35F * 0.75F, false, 2.5F, 0F, f2, 0.8F);

                    this.chainFlap(Tail, (speed * 0.6F), 0.20F * 0.75F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.10F * 0.75F, 0.12F, f2, 1F);

                    this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(4.0), false, 1.75F, f2, 1) + 0.2F;

                }
            }
            else if ((!ee.getIsMoving()) && ee.getAnimation() != ee.LAY_ANIMATION) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                this.chainFlap(Tail, (0.2F*0.6F), 0.10F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.2F*0.6F) * 2F, 0.05F, 0.12F, f2, 1F);
            }
            else if (ee.getAnimation() == ee.LAY_ANIMATION) {
                this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            //moving in water
            //
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            //animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            //animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The idle noise/anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPanguraptor entity = (EntityPrehistoricFloraPanguraptor) entitylivingbaseIn;

        int animCycle = 18;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (-35-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -35 + (((tickAnim - 8) / 10) * (0-(-35)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -2.5 + (((tickAnim - 3) / 3) * (3-(-2.5)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 3 + (((tickAnim - 6) / 3) * (5-(3)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 5 + (((tickAnim - 9) / 3) * (2-(5)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 2 + (((tickAnim - 12) / 1) * (0-(2)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0.5-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 14) / 2) * (0-(0.5)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (-10-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -10 + (((tickAnim - 5) / 7) * (-6.09-(-10)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -6.09 + (((tickAnim - 12) / 3) * (5-(-6.09)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 15) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 10 + (((tickAnim - 3) / 1) * (-5-(10)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 4) / 4) * (20-(-5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 8) / 5) * (-5-(20)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 13) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 3) / 5) * (20-(15)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 20 + (((tickAnim - 8) / 10) * (0-(20)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 4) / 14) * (0-(10)));
            yy = 0 + (((tickAnim - 4) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (30-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 30 + (((tickAnim - 7) / 5) * (30-(30)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 30 + (((tickAnim - 12) / 1) * (0-(30)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-20-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-30-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (30-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -20 + (((tickAnim - 8) / 3) * (-60-(-20)));
            yy = -30 + (((tickAnim - 8) / 3) * (10-(-30)));
            zz = 30 + (((tickAnim - 8) / 3) * (30-(30)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -60 + (((tickAnim - 11) / 1) * (-60-(-60)));
            yy = 10 + (((tickAnim - 11) / 1) * (10-(10)));
            zz = 30 + (((tickAnim - 11) / 1) * (45-(30)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -60 + (((tickAnim - 12) / 1) * (-60-(-60)));
            yy = 10 + (((tickAnim - 12) / 1) * (10-(10)));
            zz = 45 + (((tickAnim - 12) / 1) * (45-(45)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -60 + (((tickAnim - 13) / 0) * (-10-(-60)));
            yy = 10 + (((tickAnim - 13) / 0) * (-20-(10)));
            zz = 45 + (((tickAnim - 13) / 0) * (30-(45)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 13) / 5) * (0-(-10)));
            yy = -20 + (((tickAnim - 13) / 5) * (0-(-20)));
            zz = 30 + (((tickAnim - 13) / 5) * (0-(30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-20-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (30-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-30-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -20 + (((tickAnim - 8) / 3) * (-60-(-20)));
            yy = 30 + (((tickAnim - 8) / 3) * (-10-(30)));
            zz = -30 + (((tickAnim - 8) / 3) * (-30-(-30)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -60 + (((tickAnim - 11) / 1) * (-60-(-60)));
            yy = -10 + (((tickAnim - 11) / 1) * (-10-(-10)));
            zz = -30 + (((tickAnim - 11) / 1) * (-45-(-30)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -60 + (((tickAnim - 12) / 1) * (-60-(-60)));
            yy = -10 + (((tickAnim - 12) / 1) * (-10-(-10)));
            zz = -45 + (((tickAnim - 12) / 1) * (-45-(-45)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -60 + (((tickAnim - 13) / 0) * (-10-(-60)));
            yy = -10 + (((tickAnim - 13) / 0) * (20-(-10)));
            zz = -45 + (((tickAnim - 13) / 0) * (-30-(-45)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 13) / 5) * (0-(-10)));
            yy = 20 + (((tickAnim - 13) / 5) * (0-(20)));
            zz = -30 + (((tickAnim - 13) / 5) * (0-(-30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -7 + (((tickAnim - 3) / 3) * (15-(-7)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 15 + (((tickAnim - 6) / 3) * (5-(15)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 9) / 9) * (0-(5)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 9) / 9) * (0-(5)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (5-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 8) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (10-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 10 + (((tickAnim - 5) / 9) * (0-(10)));
            yy = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-20.04292-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (7.4713-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.6574-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -20.04292 + (((tickAnim - 3) / 4) * (-1.72-(-20.04292)));
            yy = 7.4713 + (((tickAnim - 3) / 4) * (5.3-(7.4713)));
            zz = -0.6574 + (((tickAnim - 3) / 4) * (-0.47-(-0.6574)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -1.72 + (((tickAnim - 7) / 5) * (-45-(-1.72)));
            yy = 5.3 + (((tickAnim - 7) / 5) * (3.37-(5.3)));
            zz = -0.47 + (((tickAnim - 7) / 5) * (-0.3-(-0.47)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -45 + (((tickAnim - 12) / 2) * (0-(-45)));
            yy = 3.37 + (((tickAnim - 12) / 2) * (1.93-(3.37)));
            zz = -0.3 + (((tickAnim - 12) / 2) * (-0.17-(-0.3)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 1.93 + (((tickAnim - 14) / 4) * (0-(1.93)));
            zz = -0.17 + (((tickAnim - 14) / 4) * (0-(-0.17)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 27.5 + (((tickAnim - 3) / 5) * (-3.87-(27.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -3.87 + (((tickAnim - 8) / 4) * (-50-(-3.87)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -50 + (((tickAnim - 12) / 4) * (10-(-50)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 16) / 2) * (0-(10)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 3) / 5) * (6.61-(-5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 6.61 + (((tickAnim - 8) / 4) * (12-(6.61)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 12 + (((tickAnim - 12) / 1) * (40-(12)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 40 + (((tickAnim - 13) / 0) * (0-(40)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 3) / 5) * (95-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 95 + (((tickAnim - 8) / 3) * (50-(95)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 50 + (((tickAnim - 11) / 1) * (90-(50)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 90 + (((tickAnim - 12) / 1) * (95-(90)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 95 + (((tickAnim - 13) / 1) * (30-(95)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 30 + (((tickAnim - 14) / 1) * (10-(30)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 15) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-20.04292-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (7.4713-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.6574-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -20.04292 + (((tickAnim - 3) / 4) * (40-(-20.04292)));
            yy = 7.4713 + (((tickAnim - 3) / 4) * (5.3-(7.4713)));
            zz = -0.6574 + (((tickAnim - 3) / 4) * (-0.47-(-0.6574)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 40 + (((tickAnim - 7) / 11) * (0-(40)));
            yy = 5.3 + (((tickAnim - 7) / 11) * (0-(5.3)));
            zz = -0.47 + (((tickAnim - 7) / 11) * (0-(-0.47)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 27.5 + (((tickAnim - 3) / 5) * (-3.87-(27.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -3.87 + (((tickAnim - 8) / 10) * (0-(-3.87)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 3) / 5) * (6.61-(-5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 6.61 + (((tickAnim - 8) / 10) * (0-(6.61)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 3) / 5) * (45.97-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 45.97 + (((tickAnim - 8) / 5) * (0-(45.97)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPanguraptor entity = (EntityPrehistoricFloraPanguraptor) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -15 + (((tickAnim - 10) / 7) * (-15-(-15)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -15 + (((tickAnim - 17) / 5) * (0-(-15)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -15 + (((tickAnim - 8) / 6) * (-15-(-15)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -15 + (((tickAnim - 14) / 5) * (0-(-15)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 10 + (((tickAnim - 10) / 7) * (10-(10)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 10 + (((tickAnim - 17) / 5) * (0-(10)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -20 + (((tickAnim - 10) / 8) * (-10-(-20)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -10 + (((tickAnim - 18) / 6) * (0-(-10)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 6) / 2) * (1-(5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 8) / 0) * (5-(1)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 5 + (((tickAnim - 8) / 1) * (1-(5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 9) / 1) * (5-(1)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 5 + (((tickAnim - 10) / 1) * (1-(5)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 11) / 1) * (5-(1)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 12) / 1) * (1-(5)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 13) / 0) * (5-(1)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 5 + (((tickAnim - 13) / 1) * (1-(5)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 14) / 1) * (5-(1)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 5 + (((tickAnim - 15) / 1) * (1-(5)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 1 + (((tickAnim - 16) / 1) * (5-(1)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 17) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 30 + (((tickAnim - 6) / 2) * (10-(30)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 8) / 0) * (30-(10)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 30 + (((tickAnim - 8) / 1) * (10-(30)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 9) / 1) * (30-(10)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 30 + (((tickAnim - 10) / 1) * (10-(30)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 10 + (((tickAnim - 11) / 1) * (30-(10)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 30 + (((tickAnim - 12) / 1) * (10-(30)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 13) / 0) * (30-(10)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 30 + (((tickAnim - 13) / 1) * (10-(30)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 14) / 1) * (30-(10)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 30 + (((tickAnim - 15) / 1) * (10-(30)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 10 + (((tickAnim - 16) / 1) * (30-(10)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 30 + (((tickAnim - 17) / 3) * (0-(30)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ThroatPouch, ThroatPouch.rotateAngleX + (float) Math.toRadians(xx), ThroatPouch.rotateAngleY + (float) Math.toRadians(yy), ThroatPouch.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPanguraptor e = (EntityPrehistoricFloraPanguraptor) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.DRINK_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Hips, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperLegL, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperLegR, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperArmL, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperArmR, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(5);
        animator.rotate(this.Hips, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperLegL, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperLegR, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperArmL, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperArmR, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.rotate(this.Hips, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperLegL, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperLegR, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperArmL, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperArmR, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(5);
        animator.rotate(this.Hips, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperLegL, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperLegR, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperArmL, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperArmR, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.rotate(this.Hips, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperLegL, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperLegR, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperArmL, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperArmR, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(15);
        animator.move(this.Neck, (float) Math.toRadians(-30),0,0);
        animator.rotate(this.Neck2, (float) Math.toRadians(-30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck3, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.move(this.Neck, (float) Math.toRadians(-35),0,0);
        animator.rotate(this.Neck2, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck3, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(2);
        animator.move(this.Neck, (float) Math.toRadians(-32),0,0);
        animator.rotate(this.Neck2, (float) Math.toRadians(-32), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck3, (float) Math.toRadians(-22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.move(this.Neck, (float) Math.toRadians(-35),0,0);
        animator.rotate(this.Neck2, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck3, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(2);
        animator.move(this.Neck, (float) Math.toRadians(-32),0,0);
        animator.rotate(this.Neck2, (float) Math.toRadians(-32), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck3, (float) Math.toRadians(-22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(10);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(-6), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(-6), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck3, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(5);
        animator.rotate(this.Hips, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperLegL, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperLegR, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperArmL, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.UpperArmR, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck3, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.startKeyframe(10);
        animator.move(this.Neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.Neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
