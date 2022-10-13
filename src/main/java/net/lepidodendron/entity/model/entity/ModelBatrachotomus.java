package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBatrachotomus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBatrachotomus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended Root;
    private final AdvancedModelRendererExtended Hips;
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended Chest;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended Neck2;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended Lips;
    private final AdvancedModelRendererExtended Lips2;
    private final AdvancedModelRendererExtended Teeth;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended Forehead;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended ThroatPouch;
    private final AdvancedModelRendererExtended UpperArmR;
    private final AdvancedModelRendererExtended LowerArmR;
    private final AdvancedModelRendererExtended HandR;
    private final AdvancedModelRendererExtended UpperArmL;
    private final AdvancedModelRendererExtended LowerArmL;
    private final AdvancedModelRendererExtended HandL;
    private final AdvancedModelRendererExtended Tail;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended Tail4;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended Tail5;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended UpperLegR;
    private final AdvancedModelRendererExtended LowerLegR;
    private final AdvancedModelRendererExtended FootR;
    private final AdvancedModelRendererExtended ToesR;
    private final AdvancedModelRendererExtended bone2;
    private final AdvancedModelRendererExtended UpperLegL;
    private final AdvancedModelRendererExtended LowerLegL;
    private final AdvancedModelRendererExtended FootL;
    private final AdvancedModelRendererExtended ToesL;
    private final AdvancedModelRendererExtended bone;
    private ModelAnimator animator;

    public ModelBatrachotomus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Root = new AdvancedModelRendererExtended(this);
        this.Root.setRotationPoint(0.0F, 4.0F, 0.0F);


        this.Hips = new AdvancedModelRendererExtended(this);
        this.Hips.setRotationPoint(0.0F, -3.0F, 11.0F);
        this.Root.addChild(Hips);
        this.setRotateAngle(Hips, 0.0873F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 36, 15, -4.0F, -2.0F, -7.0F, 8, 11, 10, 0.0F, false));
        this.Hips.cubeList.add(new ModelBox(Hips, 48, 37, -1.5F, -2.5F, -6.0F, 3, 1, 9, -0.01F, false));

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, 0.0175F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -5.0F, -2.0F, -11.0F, 10, 12, 13, 0.01F, false));
        this.Body.cubeList.add(new ModelBox(Body, 59, 23, -1.5F, -2.5F, -11.0F, 3, 1, 13, 0.0F, false));

        this.Chest = new AdvancedModelRendererExtended(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.1309F, 0.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 53, 48, -4.0F, -2.0F, -8.0F, 8, 10, 8, 0.0F, false));
        this.Chest.cubeList.add(new ModelBox(Chest, 62, 14, -1.5F, -2.5F, -8.0F, 3, 1, 8, -0.01F, false));

        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, 0.0436F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 65, 0, -2.5F, -2.0F, -5.0F, 5, 7, 5, -0.01F, false));
        this.Neck.cubeList.add(new ModelBox(Neck, 32, 70, -1.0F, -2.5F, -5.0F, 2, 1, 5, -0.02F, false));

        this.Neck2 = new AdvancedModelRendererExtended(this);
        this.Neck2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0873F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 78, 23, -2.0F, -1.98F, -5.0F, 4, 7, 5, 0.0F, false));
        this.Neck2.cubeList.add(new ModelBox(Neck2, 85, 55, -1.0F, -2.5F, -5.0F, 2, 1, 5, -0.03F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.Neck2.addChild(Head);
        this.setRotateAngle(Head, -0.0436F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 74, 37, -2.5F, -3.0F, -3.0F, 5, 4, 4, 0.0F, false));

        this.Lips = new AdvancedModelRendererExtended(this);
        this.Lips.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.Head.addChild(Lips);
        this.setRotateAngle(Lips, 0.0175F, 0.0F, 0.0F);
        this.Lips.cubeList.add(new ModelBox(Lips, 40, 87, -1.5F, 0.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.Lips2 = new AdvancedModelRendererExtended(this);
        this.Lips2.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.Lips.addChild(Lips2);
        this.setRotateAngle(Lips2, -0.2723F, 0.0F, 0.0F);
        this.Lips2.cubeList.add(new ModelBox(Lips2, 85, 0, -1.0F, -2.0F, -5.0F, 2, 2, 5, 0.0F, false));

        this.Teeth = new AdvancedModelRendererExtended(this);
        this.Teeth.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.Lips2.addChild(Teeth);
        this.setRotateAngle(Teeth, 0.0524F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.Teeth.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 9, -1.5F, 0.3F, 0.2F, 3, 1, 3, -0.01F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Teeth.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0698F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 87, 40, -1.0F, -0.4F, -5.2F, 2, 1, 5, -0.01F, false));

        this.Forehead = new AdvancedModelRendererExtended(this);
        this.Forehead.setRotationPoint(0.0F, -3.0F, -3.0F);
        this.Head.addChild(Forehead);
        this.setRotateAngle(Forehead, 0.1047F, 0.0F, 0.0F);
        this.Forehead.cubeList.add(new ModelBox(Forehead, 0, 31, -1.0F, 0.01F, -7.99F, 2, 2, 4, -0.01F, false));
        this.Forehead.cubeList.add(new ModelBox(Forehead, 25, 26, -1.0F, 0.01F, -8.3F, 2, 2, 1, -0.02F, false));
        this.Forehead.cubeList.add(new ModelBox(Forehead, 0, 25, -1.0F, 0.0F, -4.09F, 2, 2, 4, -0.01F, false));
        this.Forehead.cubeList.add(new ModelBox(Forehead, 25, 29, -1.0F, 0.0F, -0.9F, 2, 2, 1, -0.02F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, 1.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.1047F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 62, 82, -2.5F, 0.0F, -4.0F, 5, 3, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Jaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 88, 35, -1.5F, -0.03F, -3.5F, 3, 1, 4, -0.03F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(1.0F, 0.0F, -11.0F);
        this.Jaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 3, -0.25F, 0.0F, -0.2F, 0, 1, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 20, -1.75F, 0.0F, -0.2F, 0, 1, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5236F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 80, 82, -1.5F, -4.0F, 0.0F, 3, 4, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.096F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 59, 66, -1.5F, -2.06F, -3.65F, 3, 2, 4, -0.02F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 83, 61, -1.0F, -2.06F, -8.61F, 2, 2, 5, -0.02F, false));

        this.ThroatPouch = new AdvancedModelRendererExtended(this);
        this.ThroatPouch.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.Neck2.addChild(ThroatPouch);
        this.ThroatPouch.cubeList.add(new ModelBox(ThroatPouch, 44, 80, -2.0F, -2.0F, -5.0F, 4, 2, 5, -0.01F, false));

        this.UpperArmR = new AdvancedModelRendererExtended(this);
        this.UpperArmR.setRotationPoint(-5.0F, 7.0F, -5.0F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, 0.3927F, 0.0F, 0.0F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 30, 80, -0.5F, -1.5F, -2.0F, 3, 7, 4, 0.0F, false));

        this.LowerArmR = new AdvancedModelRendererExtended(this);
        this.LowerArmR.setRotationPoint(-1.0F, 5.5F, 2.0F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, -0.6283F, 0.0F, 0.0F);
        this.LowerArmR.cubeList.add(new ModelBox(LowerArmR, 16, 80, 0.5F, 0.0F, -4.0F, 3, 9, 4, -0.01F, false));

        this.HandR = new AdvancedModelRendererExtended(this);
        this.HandR.setRotationPoint(1.0F, 9.0F, -2.0F);
        this.LowerArmR.addChild(HandR);
        this.HandR.cubeList.add(new ModelBox(HandR, 77, 48, -1.0F, -1.0F, -3.5F, 4, 2, 5, 0.0F, false));

        this.UpperArmL = new AdvancedModelRendererExtended(this);
        this.UpperArmL.setRotationPoint(5.0F, 7.0F, -5.0F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, 0.3927F, 0.0F, 0.0F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 30, 80, -2.5F, -1.5F, -2.0F, 3, 7, 4, 0.0F, true));

        this.LowerArmL = new AdvancedModelRendererExtended(this);
        this.LowerArmL.setRotationPoint(1.0F, 5.5F, 2.0F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, -0.6283F, 0.0F, 0.0F);
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 16, 80, -3.5F, 0.0F, -4.0F, 3, 9, 4, -0.01F, true));

        this.HandL = new AdvancedModelRendererExtended(this);
        this.HandL.setRotationPoint(-1.0F, 9.0F, -2.0F);
        this.LowerArmL.addChild(HandL);
        this.HandL.cubeList.add(new ModelBox(HandL, 77, 48, -3.0F, -1.0F, -3.5F, 4, 2, 5, 0.0F, true));

        this.Tail = new AdvancedModelRendererExtended(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Hips.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 25, -3.0F, -1.99F, 0.0F, 6, 9, 13, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.Tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0175F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 56, -1.5F, 0.0F, -0.01F, 3, 1, 13, -0.02F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 0.5F, 12.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0401F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 25, 36, -2.5F, -2.0F, 0.0F, 5, 7, 13, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, -2.0F, 7.0F);
        this.Tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 46, 0, -1.5F, -0.5F, -7.01F, 3, 1, 13, -0.01F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.5F, 12.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0436F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 47, -2.0F, -2.0F, 0.0F, 4, 5, 13, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, -2.0F, 6.0F);
        this.Tail3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 65, -1.0F, -0.5F, -6.0F, 2, 1, 13, -0.01F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0436F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 43, 66, -1.5F, -1.5F, 0.0F, 3, 4, 10, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, -1.5F, 5.0F);
        this.Tail4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 87, 61, -0.5F, -0.5F, -5.0F, 1, 1, 10, 0.0F, false));

        this.Tail5 = new AdvancedModelRendererExtended(this);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 9.5F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.0436F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 33, 0, -1.0F, -1.0F, 0.0F, 2, 3, 10, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, -1.0F, 5.0F);
        this.Tail5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 85, 81, -0.5F, -0.5F, -5.0F, 1, 1, 9, 0.0F, false));

        this.UpperLegR = new AdvancedModelRendererExtended(this);
        this.UpperLegR.setRotationPoint(-4.0F, 3.0F, -0.2F);
        this.Hips.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, -0.3491F, 0.0F, 0.0F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 69, 66, -3.0F, -2.0F, -3.5F, 4, 10, 6, 0.0F, false));

        this.LowerLegR = new AdvancedModelRendererExtended(this);
        this.LowerLegR.setRotationPoint(-1.0F, 8.0F, -3.5F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, 0.4363F, 0.0F, 0.0F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 0, 79, -1.5F, 0.0F, 0.0F, 3, 9, 5, 0.0F, false));

        this.FootR = new AdvancedModelRendererExtended(this);
        this.FootR.setRotationPoint(0.0F, 9.0F, 4.5F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, -0.1745F, 0.0F, 0.0F);
        this.FootR.cubeList.add(new ModelBox(FootR, 0, 0, -1.0F, 0.0F, -4.0F, 2, 4, 4, 0.0F, false));

        this.ToesR = new AdvancedModelRendererExtended(this);
        this.ToesR.setRotationPoint(0.0F, 4.0F, -2.0F);
        this.FootR.addChild(ToesR);
        this.ToesR.cubeList.add(new ModelBox(ToesR, 76, 12, -2.0F, -1.0F, -4.0F, 4, 2, 5, 0.0F, false));

        this.bone2 = new AdvancedModelRendererExtended(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.ToesR.addChild(bone2);
        this.bone2.cubeList.add(new ModelBox(bone2, 85, 7, -2.0F, -1.0F, -3.0F, 4, 2, 3, 0.002F, false));

        this.UpperLegL = new AdvancedModelRendererExtended(this);
        this.UpperLegL.setRotationPoint(4.0F, 3.0F, -0.2F);
        this.Hips.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, -0.3491F, 0.0F, 0.0F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 69, 66, -1.0F, -2.0F, -3.5F, 4, 10, 6, 0.0F, true));

        this.LowerLegL = new AdvancedModelRendererExtended(this);
        this.LowerLegL.setRotationPoint(1.0F, 8.0F, -3.5F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.4363F, 0.0F, 0.0F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 0, 79, -1.5F, 0.0F, 0.0F, 3, 9, 5, 0.0F, true));

        this.FootL = new AdvancedModelRendererExtended(this);
        this.FootL.setRotationPoint(0.0F, 9.0F, 4.5F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, -0.1745F, 0.0F, 0.0F);
        this.FootL.cubeList.add(new ModelBox(FootL, 0, 0, -1.0F, 0.0F, -4.0F, 2, 4, 4, 0.0F, true));

        this.ToesL = new AdvancedModelRendererExtended(this);
        this.ToesL.setRotationPoint(0.0F, 4.0F, -2.0F);
        this.FootL.addChild(ToesL);
        this.ToesL.cubeList.add(new ModelBox(ToesL, 76, 12, -2.0F, -1.0F, -4.0F, 4, 2, 5, 0.0F, true));

        this.bone = new AdvancedModelRendererExtended(this);
        this.bone.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.ToesL.addChild(bone);
        this.bone.cubeList.add(new ModelBox(bone, 85, 7, -2.0F, -1.0F, -3.0F, 4, 2, 3, 0.002F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.Head.rotateAngleX = (float) Math.toRadians(2.83);
        this.Jaw.rotateAngleX = (float) Math.toRadians(51.7);
        this.HandR.rotateAngleX = (float) Math.toRadians(42.6);
        this.HandR.rotateAngleY = (float) Math.toRadians(51.7);
        this.HandR.rotateAngleZ = (float) Math.toRadians(-20.7);
        this.HandL.rotateAngleX = (float) Math.toRadians(70);
        this.HandL.rotateAngleY = (float) Math.toRadians(-50.5);
        this.HandL.rotateAngleZ = (float) Math.toRadians(-14);
        this.LowerArmR.rotateAngleX = (float) Math.toRadians(-41.9);
        this.LowerArmL.rotateAngleX = (float) Math.toRadians(-46.9);
        this.UpperArmR.rotateAngleX = (float) Math.toRadians(-18.2);
        this.UpperArmR.rotateAngleY = (float) Math.toRadians(24);
        this.UpperArmR.rotateAngleZ = (float) Math.toRadians(-9.6);
        this.UpperArmL.rotateAngleX = (float) Math.toRadians(-18.4);
        this.UpperArmL.rotateAngleY = (float) Math.toRadians(-16.5);
        this.UpperArmL.rotateAngleZ = (float) Math.toRadians(10.3);
        this.Neck.rotateAngleZ = (float) Math.toRadians(-7.5);
        this.Neck.rotateAngleX = (float) Math.toRadians(-2.8);
        this.Neck2.rotateAngleZ = (float) Math.toRadians(-5);
        this.Neck2.rotateAngleX = (float) Math.toRadians(2.7);
        this.Chest.offsetY = -0.05F;
        this.Chest.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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

        EntityPrehistoricFloraBatrachotomus Batrachotomus = (EntityPrehistoricFloraBatrachotomus) e;

        this.faceTarget(f3, f4, 8, Neck);
        this.faceTarget(f3, f4, 8, Neck2);
        this.faceTarget(f3, f4, 8, Head);

        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] Neck = {this.Neck, this.Neck2, this.Head};

        if (Batrachotomus.getAnimation() == Batrachotomus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Batrachotomus.isReallyInWater()) {

            if (f3 == 0.0F || !Batrachotomus.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
            }

            if (Batrachotomus.getIsFast()) { //Running


            }
            else { //Walking
                
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

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBatrachotomus entity = (EntityPrehistoricFloraBatrachotomus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 0D) / 9D) * 0D);
            yy = -1D + (((tickAnim - 0D) / 9D) * 1D);
            zz = -2D + (((tickAnim - 0D) / 9D) * 2D);
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = 0D + (((tickAnim - 9D) / 10D) * 0D);
            yy = 0D + (((tickAnim - 9D) / 10D) * -1D);
            zz = 0D + (((tickAnim - 9D) / 10D) * -2D);
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 19D) / 10D) * 0D);
            yy = -1D + (((tickAnim - 19D) / 10D) * 1D);
            zz = -2D + (((tickAnim - 19D) / 10D) * 2D);
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 0D + (((tickAnim - 29D) / 10D) * 0D);
            yy = 0D + (((tickAnim - 29D) / 10D) * -1D);
            zz = 0D + (((tickAnim - 29D) / 10D) * -2D);
        }
        else {
            xx = 0D;
            yy = -1D;
            zz = -2D;
        }


       // this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(xx), Root.rotateAngleY + (float) Math.toRadians(yy), Root.rotateAngleZ + (float) Math.toRadians(zz));
        this.Root.offsetY = (float)Math.toRadians(yy);
        this.Root.offsetZ = (float)Math.toRadians(zz);

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 25D + (((tickAnim - 0D) / 10D) * -72.5D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -47.5D + (((tickAnim - 10D) / 10D) * -17.5D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = -65D + (((tickAnim - 20D) / 9D) * 63.75D);
            yy = 0D + (((tickAnim - 20D) / 9D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 9D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -1.25D + (((tickAnim - 29D) / 11D) * 23.75D);
            yy = 0D + (((tickAnim - 29D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0D);
        }


        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.5D + (((tickAnim - 0D) / 5D) * -59.59D);
            yy = 0D + (((tickAnim - 0D) / 5D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 5D) * 0D);
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -47.09D + (((tickAnim - 5D) / 5D) * 35.42D);
            yy = 0D + (((tickAnim - 5D) / 5D) * 0D);
            zz = 0D + (((tickAnim - 5D) / 5D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.67D + (((tickAnim - 10D) / 10D) * 39.17D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 27.5D + (((tickAnim - 20D) / 9D) * 1.25D);
            yy = 0D + (((tickAnim - 20D) / 9D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 9D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 28.75D + (((tickAnim - 29D) / 11D) * -16.25D);
            yy = 0D + (((tickAnim - 29D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0D);
        }


        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 130D + (((tickAnim - 0D) / 10D) * -63.5D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 66.5D + (((tickAnim - 10D) / 10D) * -24D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 42.5D + (((tickAnim - 20D) / 10D) * -66.25D);
            yy = 0D + (((tickAnim - 20D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 10D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -23.75D + (((tickAnim - 30D) / 10D) * 153.75D);
            yy = 0D + (((tickAnim - 30D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 10D) * 0D);
        }


        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -65D + (((tickAnim - 0D) / 10D) * 63.75D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -1.25D + (((tickAnim - 10D) / 10D) * 26.25D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 25D + (((tickAnim - 20D) / 9D) * -72.5D);
            yy = 0D + (((tickAnim - 20D) / 9D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 9D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -47.5D + (((tickAnim - 29D) / 11D) * -17.5D);
            yy = 0D + (((tickAnim - 29D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0D);
        }



        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 27.5D + (((tickAnim - 0D) / 10D) * 1.25D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 28.75D + (((tickAnim - 10D) / 10D) * -16.25D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 12.5D + (((tickAnim - 20D) / 5D) * -59.59D);
            yy = 0D + (((tickAnim - 20D) / 5D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 5D) * 0D);
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -47.09D + (((tickAnim - 25D) / 4D) * 35.42D);
            yy = 0D + (((tickAnim - 25D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 25D) / 4D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -11.67D + (((tickAnim - 29D) / 11D) * 39.17D);
            yy = 0D + (((tickAnim - 29D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0D);
        }


        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 42.5D + (((tickAnim - 0D) / 8D) * -66.25D);
            yy = 0D + (((tickAnim - 0D) / 8D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 8D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -23.75D + (((tickAnim - 8D) / 6D) * 173.75D);
            yy = 0D + (((tickAnim - 8D) / 6D) * 0D);
            zz = 0D + (((tickAnim - 8D) / 6D) * 0D);
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 150D + (((tickAnim - 14D) / 8D) * -83.5D);
            yy = 0D + (((tickAnim - 14D) / 8D) * 0D);
            zz = 0D + (((tickAnim - 14D) / 8D) * 0D);
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 66.5D + (((tickAnim - 22D) / 8D) * 0D);
            yy = 0D + (((tickAnim - 22D) / 8D) * 0D);
            zz = 0D + (((tickAnim - 22D) / 8D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 66.5D + (((tickAnim - 30D) / 10D) * -24D);
            yy = 0D + (((tickAnim - 30D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 10D) * 0D);
        }


        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -22.5D + (((tickAnim - 0D) / 11D) * 22.5D);
            yy = 0D + (((tickAnim - 0D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 11D) * 0D);
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 11D) / 10D) * 10D);
            yy = 0D + (((tickAnim - 11D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 11D) / 10D) * 0D);
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = 10D + (((tickAnim - 21D) / 10D) * 10D);
            yy = 0D + (((tickAnim - 21D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 21D) / 10D) * 0D);
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 20D + (((tickAnim - 31D) / 9D) * -42.5D);
            yy = 0D + (((tickAnim - 31D) / 9D) * 0D);
            zz = 0D + (((tickAnim - 31D) / 9D) * 0D);
        }


        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 44.98D + (((tickAnim - 0D) / 11D) * -57.48D);
            yy = 0D + (((tickAnim - 0D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 11D) * 0D);
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = -12.5D + (((tickAnim - 11D) / 11D) * 35D);
            yy = 0D + (((tickAnim - 11D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 11D) / 11D) * 0D);
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 22.5D + (((tickAnim - 22D) / 10D) * 8.13D);
            yy = 0D + (((tickAnim - 22D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 22D) / 10D) * 0D);
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 30.63D + (((tickAnim - 32D) / 8D) * 14.35D);
            yy = 0D + (((tickAnim - 32D) / 8D) * 0D);
            zz = 0D + (((tickAnim - 32D) / 8D) * 0D);
        }


        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -29.46D + (((tickAnim - 0D) / 11D) * 29.46D);
            yy = 0D + (((tickAnim - 0D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 11D) * 0D);
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 11D) / 10D) * -12.5D);
            yy = 0D + (((tickAnim - 11D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 11D) / 10D) * 0D);
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = -12.5D + (((tickAnim - 21D) / 10D) * -12.5D);
            yy = 0D + (((tickAnim - 21D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 21D) / 10D) * 0D);
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = -25D + (((tickAnim - 31D) / 8D) * -4.46D);
            yy = 0D + (((tickAnim - 31D) / 8D) * 0D);
            zz = 0D + (((tickAnim - 31D) / 8D) * 0D);
        }
        else {
            xx = -25D  -4.46D;
            yy = 0D;
            zz = 0D;
        }


        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 0D) / 21D) * 27.5D);
            yy = 0D + (((tickAnim - 0D) / 21D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 21D) * 0D);
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = 27.5D + (((tickAnim - 21D) / 10D) * 33.87784D);
            yy = 0D + (((tickAnim - 21D) / 10D) * 0.0458D);
            zz = 0D + (((tickAnim - 21D) / 10D) * -0.2956D);
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = 61.37784D + (((tickAnim - 31D) / 8D) * -61.37784D);
            yy = 0.0458D + (((tickAnim - 31D) / 8D) * -0.0458D);
            zz = -0.2956D + (((tickAnim - 31D) / 8D) * 0.2956D);
        }
        else {
            xx = 61.37784D -61.37784D;
            yy = 0.0458D  -0.0458D;
            zz = -0.2956D + 0.2956D;
        }


        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 10D + (((tickAnim - 0D) / 11D) * 10D);
            yy = 0D + (((tickAnim - 0D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 11D) * 0D);
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 20D + (((tickAnim - 11D) / 10D) * -42.5D);
            yy = 0D + (((tickAnim - 11D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 11D) / 10D) * 0D);
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = -22.5D + (((tickAnim - 21D) / 10D) * 22.5D);
            yy = 0D + (((tickAnim - 21D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 21D) / 10D) * 0D);
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 31D) / 9D) * 10D);
            yy = 0D + (((tickAnim - 31D) / 9D) * 0D);
            zz = 0D + (((tickAnim - 31D) / 9D) * 0D);
        }


        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 22.5D + (((tickAnim - 0D) / 11D) * 8.13D);
            yy = 0D + (((tickAnim - 0D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 11D) * 0D);
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 30.63D + (((tickAnim - 11D) / 10D) * 14.35D);
            yy = 0D + (((tickAnim - 11D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 11D) / 10D) * 0D);
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = 44.98D + (((tickAnim - 21D) / 10D) * -57.48D);
            yy = 0D + (((tickAnim - 21D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 21D) / 10D) * 0D);
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -12.5D + (((tickAnim - 31D) / 9D) * 35D);
            yy = 0D + (((tickAnim - 31D) / 9D) * 0D);
            zz = 0D + (((tickAnim - 31D) / 9D) * 0D);
        }


        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -12.5D + (((tickAnim - 0D) / 11D) * -12.5D);
            yy = 0D + (((tickAnim - 0D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 11D) * 0D);
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -25D + (((tickAnim - 11D) / 10D) * -4.46D);
            yy = 0D + (((tickAnim - 11D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 11D) / 10D) * 0D);
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = -29.46D + (((tickAnim - 21D) / 10D) * 29.46D);
            yy = 0D + (((tickAnim - 21D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 21D) / 10D) * 0D);
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 31D) / 9D) * -12.5D);
            yy = 0D + (((tickAnim - 31D) / 9D) * 0D);
            zz = 0D + (((tickAnim - 31D) / 9D) * 0D);
        }


        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0.00474D + (((tickAnim - 0D) / 15D) * 0D);
            yy = -1D + (((tickAnim - 0D) / 15D) * 2D);
            zz = -1D + (((tickAnim - 0D) / 15D) * 2D);
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0.00474D + (((tickAnim - 15D) / 15D) * 0D);
            yy = 1D + (((tickAnim - 15D) / 15D) * -2D);
            zz = 1D + (((tickAnim - 15D) / 15D) * -2D);
        }
        else {
            xx = 0.00474D;
            yy = 1D  -2D;
            zz = 1D  -2D;
        }


        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 2.50474D + (((tickAnim - 0D) / 10D) * -5.00474D);
            yy = 2.49048D + (((tickAnim - 0D) / 10D) * -2.49048D);
            zz = 0.21803D + (((tickAnim - 0D) / 10D) * -0.21803D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.5D + (((tickAnim - 10D) / 10D) * 5.00474D);
            yy = 0D + (((tickAnim - 10D) / 10D) * -2.49048D);
            zz = 0D + (((tickAnim - 10D) / 10D) * -0.21803D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 2.50474D + (((tickAnim - 20D) / 9D) * -5.00474D);
            yy = -2.49048D + (((tickAnim - 20D) / 9D) * 2.49048D);
            zz = -0.21803D + (((tickAnim - 20D) / 9D) * 0.21803D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -2.5D + (((tickAnim - 29D) / 11D) * 5.00474D);
            yy = 0D + (((tickAnim - 29D) / 11D) * 2.49048D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0.21803D);
        }


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 2.49762D + (((tickAnim - 0D) / 8D) * -7.49762D);
            yy = 2.49762D + (((tickAnim - 0D) / 8D) * -2.49762D);
            zz = -0.10912D + (((tickAnim - 0D) / 8D) * 0.10912D);
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -5D + (((tickAnim - 8D) / 6D) * 7.49762D);
            yy = 0D + (((tickAnim - 8D) / 6D) * -2.49762D);
            zz = 0D + (((tickAnim - 8D) / 6D) * 0.10912D);
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 2.49762D + (((tickAnim - 14D) / 8D) * -7.49762D);
            yy = -2.49762D + (((tickAnim - 14D) / 8D) * 2.49762D);
            zz = 0.10912D + (((tickAnim - 14D) / 8D) * -0.10912D);
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -5D + (((tickAnim - 22D) / 8D) * 7.49762D);
            yy = 0D + (((tickAnim - 22D) / 8D) * 2.49762D);
            zz = 0D + (((tickAnim - 22D) / 8D) * -0.10912D);
        }
        else {
            xx = -5D + 7.49762D;
            yy = 0D +  2.49762D;
            zz = 0D  -0.10912D;
        }


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2.519D + (((tickAnim - 0D) / 10D) * 12.519D);
            yy = 4.98093D + (((tickAnim - 0D) / 10D) * -4.98093D);
            zz = -0.43688D + (((tickAnim - 0D) / 10D) * 0.43688D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10D + (((tickAnim - 10D) / 10D) * -12.519D);
            yy = 0D + (((tickAnim - 10D) / 10D) * -4.98093D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0.43688D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = -2.519D + (((tickAnim - 20D) / 9D) * 12.519D);
            yy = -4.98093D + (((tickAnim - 20D) / 9D) * 4.98093D);
            zz = 0.43688D + (((tickAnim - 20D) / 9D) * -0.43688D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 10D + (((tickAnim - 29D) / 11D) * -12.519D);
            yy = 0D + (((tickAnim - 29D) / 11D) * 4.98093D);
            zz = 0D + (((tickAnim - 29D) / 11D) * -0.43688D);
        }


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 2.5D + (((tickAnim - 0D) / 8D) * -2.5D);
            yy = 0D + (((tickAnim - 0D) / 8D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 8D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 8D) / 6D) * 2.5D);
            yy = 0D + (((tickAnim - 8D) / 6D) * 0D);
            zz = 0D + (((tickAnim - 8D) / 6D) * 0D);
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 2.5D + (((tickAnim - 14D) / 8D) * -2.5D);
            yy = 0D + (((tickAnim - 14D) / 8D) * 0D);
            zz = 0D + (((tickAnim - 14D) / 8D) * 0D);
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 22D) / 8D) * 2.5D);
            yy = 0D + (((tickAnim - 22D) / 8D) * 0D);
            zz = 0D + (((tickAnim - 22D) / 8D) * 0D);
        }
        else {
            xx = 0D +  2.5D;
            yy = 0D;
            zz = 0D;
        }


        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * -5D);
            yy = -2.5D + (((tickAnim - 0D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5D + (((tickAnim - 10D) / 10D) * 5D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 20D) / 9D) * -5D);
            yy = 2.5D + (((tickAnim - 20D) / 9D) * -2.5D);
            zz = 0D + (((tickAnim - 20D) / 9D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -5D + (((tickAnim - 29D) / 11D) * 5D);
            yy = 0D + (((tickAnim - 29D) / 11D) * -2.5D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0D);
        }


        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * -2.5D);
            yy = -2.5D + (((tickAnim - 0D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.5D + (((tickAnim - 10D) / 10D) * 2.5D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 20D) / 9D) * -2.5D);
            yy = 2.5D + (((tickAnim - 20D) / 9D) * -2.5D);
            zz = 0D + (((tickAnim - 20D) / 9D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -2.5D + (((tickAnim - 29D) / 11D) * 2.5D);
            yy = 0D + (((tickAnim - 29D) / 11D) * -2.5D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0D);
        }


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * -2.5D);
            yy = -2.5D + (((tickAnim - 0D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.5D + (((tickAnim - 10D) / 10D) * 2.5D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 20D) / 9D) * -2.5D);
            yy = 2.5D + (((tickAnim - 20D) / 9D) * -2.5D);
            zz = 0D + (((tickAnim - 20D) / 9D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -2.5D + (((tickAnim - 29D) / 11D) * 2.5D);
            yy = 0D + (((tickAnim - 29D) / 11D) * -2.5D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0D);
        }


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * -2.5D);
            yy = -2.5D + (((tickAnim - 0D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.5D + (((tickAnim - 10D) / 10D) * 2.5D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 20D) / 9D) * -2.5D);
            yy = 2.5D + (((tickAnim - 20D) / 9D) * -2.5D);
            zz = 0D + (((tickAnim - 20D) / 9D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -2.5D + (((tickAnim - 29D) / 11D) * 2.5D);
            yy = 0D + (((tickAnim - 29D) / 11D) * -2.5D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0D);
        }


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * 5D);
            yy = -2.5D + (((tickAnim - 0D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5D + (((tickAnim - 10D) / 10D) * -5D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 20D) / 9D) * 5D);
            yy = 2.5D + (((tickAnim - 20D) / 9D) * -2.5D);
            zz = 0D + (((tickAnim - 20D) / 9D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 5D + (((tickAnim - 29D) / 11D) * -5D);
            yy = 0D + (((tickAnim - 29D) / 11D) * -2.5D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0D);
        }


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 27.5D + (((tickAnim - 0D) / 11D) * 33.87784D);
            yy = 0D + (((tickAnim - 0D) / 11D) * 0.0458D);
            zz = 0D + (((tickAnim - 0D) / 11D) * -0.2956D);
        }
        else if (tickAnim >= 11 && tickAnim < 31) {
            xx = 61.37784D + (((tickAnim - 11D) / 20D) * -48.87784D);
            yy = 0.0458D + (((tickAnim - 11D) / 20D) * -0.0458D);
            zz = -0.2956D + (((tickAnim - 11D) / 20D) * 0.2956D);
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 12.5D + (((tickAnim - 31D) / 9D) * 15D);
            yy = 0D + (((tickAnim - 31D) / 9D) * 0D);
            zz = 0D + (((tickAnim - 31D) / 9D) * 0D);
        }


        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 42.78D + (((tickAnim - 0D) / 20D) * -82.78D);
            yy = 0D + (((tickAnim - 0D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 20D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = -40D + (((tickAnim - 20D) / 9D) * 74.17D);
            yy = 0D + (((tickAnim - 20D) / 9D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 9D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 34.17D + (((tickAnim - 29D) / 10D) * 8.61D);
            yy = 0D + (((tickAnim - 29D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 29D) / 10D) * 0D);
        }
        else {
            xx = 34.17D +  8.61D;
            yy = 0D ;
            zz = 0;
        }


        this.setRotateAngle(bone2, bone2.rotateAngleX + (float) Math.toRadians(xx), bone2.rotateAngleY + (float) Math.toRadians(yy), bone2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -40D + (((tickAnim - 0D) / 20D) * 82.78D);
            yy = 0D + (((tickAnim - 0D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 20D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 42.78D + (((tickAnim - 20D) / 20D) * -82.78D);
            yy = 0D + (((tickAnim - 20D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 20D) * 0D);
        }


        this.setRotateAngle(bone, bone.rotateAngleX + (float) Math.toRadians(xx), bone.rotateAngleY + (float) Math.toRadians(yy), bone.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBatrachotomus entity = (EntityPrehistoricFloraBatrachotomus) entitylivingbaseIn;


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraBatrachotomus ee = (EntityPrehistoricFloraBatrachotomus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {

            if (!ee.getIsMoving()) {
                return;
            }

            if (ee.getIsFast()) { //Running
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

            }
            else { //Walking
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                return;
            }
            //moving in water
            return;
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraBatrachotomus e = (EntityPrehistoricFloraBatrachotomus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        //setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.DRINK_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.Hips, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Hips, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Hips, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Hips, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Hips, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Hips, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Hips, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Hips, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Hips, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Hips, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(10);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(Head, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Jaw, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(Head, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Jaw, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.NOISE_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(Neck, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Head, (float) Math.toRadians(-50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(8);
        animator.resetKeyframe(9);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(Neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Head, (float) Math.toRadians(-50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Jaw, (float) Math.toRadians(60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
