package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGreererpeton;
import net.lepidodendron.entity.EntityPrehistoricFloraTiktaalik;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGreererpeton extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer UpperLegR;
    private final AdvancedModelRenderer LowerLegR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer UpperLegL;
    private final AdvancedModelRenderer LowerLegL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer UpperJaw;
    private final AdvancedModelRenderer forehead;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer uppercheekr;
    private final AdvancedModelRenderer uppercheekr2;
    private final AdvancedModelRenderer uppercheekr3;
    private final AdvancedModelRenderer uppercheekr4;
    private final AdvancedModelRenderer LowerJaw;
    private final AdvancedModelRenderer lowercheekr;
    private final AdvancedModelRenderer lowercheekr2;
    private final AdvancedModelRenderer lowercheekr3;
    private final AdvancedModelRenderer lowercheekr4;
    private final AdvancedModelRenderer chin;
    private final AdvancedModelRenderer chincheekr;
    private final AdvancedModelRenderer chincheekr2;
    private final AdvancedModelRenderer chincheekr3;
    private final AdvancedModelRenderer chincheekr4;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer LowerArmR;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer LowerArmL;
    private final AdvancedModelRenderer HandL;

    private ModelAnimator animator;

    public ModelGreererpeton() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 22.25F, 1.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 27, 32, -2.0F, -1.5F, -1.0F, 4, 3, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -1.65F, -1.0F);
        this.Hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.007F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 10, -1.0F, 0.0F, 0.0F, 3, 1, 6, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Hips.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 21, -1.5F, -1.0F, -1.0F, 3, 2, 8, -0.01F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 28, 10, 0.0F, -1.5F, -1.0F, 0, 3, 8, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -1.65F, -6.0F);
        this.Tail.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0384F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 9, -0.5F, 0.1F, 5.0F, 2, 1, 8, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 33, 0.0F, -2.0F, 0.0F, 0, 4, 8, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 15, 12, -1.0F, -1.0F, -1.0F, 2, 2, 9, -0.02F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 29, 0.0F, -2.0F, 0.0F, 0, 4, 8, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 13, 23, -0.5F, -1.0F, -1.0F, 1, 2, 9, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 25, 0.0F, -1.5F, 0.0F, 0, 3, 9, 0.0F, false));
        this.Tail4.cubeList.add(new ModelBox(Tail4, 40, 34, -0.5F, -0.5F, 0.0F, 1, 1, 7, -0.01F, false));

        this.UpperLegR = new AdvancedModelRenderer(this);
        this.UpperLegR.setRotationPoint(-1.75F, 0.75F, 2.5F);
        this.Hips.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, 0.0138F, -0.3051F, -0.133F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 14, 46, -2.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        this.LowerLegR = new AdvancedModelRenderer(this);
        this.LowerLegR.setRotationPoint(-1.65F, 0.0F, -0.75F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, -0.0861F, 1.221F, -0.0487F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 42, 0, -3.0F, -0.5F, -0.5F, 3, 1, 2, 0.0F, false));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(-2.0F, 0.0F, 0.5F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, -0.0815F, -1.0042F, 0.1443F);
        this.FootR.cubeList.add(new ModelBox(FootR, 0, 0, -2.0F, -0.5F, -0.5F, 2, 1, 2, 0.0F, false));

        this.UpperLegL = new AdvancedModelRenderer(this);
        this.UpperLegL.setRotationPoint(1.75F, 0.75F, 2.5F);
        this.Hips.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, 0.0138F, 0.3051F, 0.133F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 14, 46, -1.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, true));

        this.LowerLegL = new AdvancedModelRenderer(this);
        this.LowerLegL.setRotationPoint(1.65F, 0.0F, -0.75F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, -0.0861F, -1.221F, 0.0487F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 42, 0, 0.0F, -0.5F, -0.5F, 3, 1, 2, 0.0F, true));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(2.0F, 0.0F, 0.5F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, -0.0815F, 1.0042F, -0.1443F);
        this.FootL.cubeList.add(new ModelBox(FootL, 0, 0, 0.0F, -0.5F, -0.5F, 2, 1, 2, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.Hips.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 1, 1, -2.0F, -1.5F, -8.0F, 5, 3, 8, 0.01F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 12, -1.5F, -1.65F, -8.0F, 4, 1, 8, 0.01F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Body2.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 19, 0, -2.0F, -1.5F, -6.0F, 5, 3, 6, 0.02F, false));
        this.Body.cubeList.add(new ModelBox(Body, 40, 3, -1.5F, -1.65F, -6.0F, 4, 1, 6, 0.02F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.5F, -0.25F, -6.0F);
        this.Body.addChild(Chest);
        this.Chest.cubeList.add(new ModelBox(Chest, 24, 23, -2.5F, -1.25F, -5.0F, 5, 3, 6, 0.01F, false));
        this.Chest.cubeList.add(new ModelBox(Chest, 10, 39, -2.0F, -1.4F, -5.0F, 4, 1, 6, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Chest.addChild(Head);


        this.UpperJaw = new AdvancedModelRenderer(this);
        this.UpperJaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(UpperJaw);
        this.UpperJaw.cubeList.add(new ModelBox(UpperJaw, 7, 46, -1.0F, -1.0F, -6.0F, 2, 1, 3, 0.0F, false));

        this.forehead = new AdvancedModelRenderer(this);
        this.forehead.setRotationPoint(-0.5F, -1.0F, -6.0F);
        this.UpperJaw.addChild(forehead);
        this.setRotateAngle(forehead, 0.0611F, 0.0F, 0.0F);
        this.forehead.cubeList.add(new ModelBox(forehead, 0, 3, -0.5F, 0.0F, 0.025F, 2, 1, 2, -0.01F, false));
        this.forehead.cubeList.add(new ModelBox(forehead, 32, 47, -1.0F, 0.0F, 2.0F, 3, 1, 2, 0.0F, false));
        this.forehead.cubeList.add(new ModelBox(forehead, 0, 31, -1.5F, 0.0F, 4.0F, 4, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.25F, 0.0F, 3.0F);
        this.forehead.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.109F, 0.3323F, -0.3237F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 14, 0.0F, 0.0F, -0.5F, 1, 1, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.25F, 0.0F, 3.0F);
        this.forehead.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.109F, -0.3323F, 0.3237F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 14, -1.0F, 0.0F, -0.5F, 1, 1, 2, 0.0F, false));

        this.uppercheekr = new AdvancedModelRenderer(this);
        this.uppercheekr.setRotationPoint(-1.0F, -1.0F, -6.0F);
        this.UpperJaw.addChild(uppercheekr);
        this.setRotateAngle(uppercheekr, 0.0F, -0.4363F, -0.0003F);
        this.uppercheekr.cubeList.add(new ModelBox(uppercheekr, 0, 45, -0.02F, 0.0F, -0.01F, 2, 1, 3, -0.01F, false));
        this.uppercheekr.cubeList.add(new ModelBox(uppercheekr, 0, 4, 0.08F, 0.5F, -0.01F, 0, 1, 3, 0.0F, false));

        this.uppercheekr2 = new AdvancedModelRenderer(this);
        this.uppercheekr2.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.uppercheekr.addChild(uppercheekr2);
        this.setRotateAngle(uppercheekr2, 0.0F, 0.3054F, 0.0F);
        this.uppercheekr2.cubeList.add(new ModelBox(uppercheekr2, 26, 42, 0.0F, -1.0F, -0.02F, 3, 1, 4, 0.0F, false));
        this.uppercheekr2.cubeList.add(new ModelBox(uppercheekr2, 4, 6, 0.1F, -0.5F, -0.02F, 0, 1, 2, 0.0F, false));

        this.uppercheekr3 = new AdvancedModelRenderer(this);
        this.uppercheekr3.setRotationPoint(1.0F, -1.0F, -6.0F);
        this.UpperJaw.addChild(uppercheekr3);
        this.setRotateAngle(uppercheekr3, 0.0F, 0.4363F, 0.0003F);
        this.uppercheekr3.cubeList.add(new ModelBox(uppercheekr3, 0, 45, -1.98F, 0.0F, -0.01F, 2, 1, 3, -0.01F, true));
        this.uppercheekr3.cubeList.add(new ModelBox(uppercheekr3, 0, 4, -0.08F, 0.5F, -0.01F, 0, 1, 3, 0.0F, true));

        this.uppercheekr4 = new AdvancedModelRenderer(this);
        this.uppercheekr4.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.uppercheekr3.addChild(uppercheekr4);
        this.setRotateAngle(uppercheekr4, 0.0F, -0.3054F, 0.0F);
        this.uppercheekr4.cubeList.add(new ModelBox(uppercheekr4, 26, 42, -3.0F, -1.0F, -0.02F, 3, 1, 4, 0.0F, true));
        this.uppercheekr4.cubeList.add(new ModelBox(uppercheekr4, 4, 6, -0.1F, -0.5F, -0.02F, 0, 1, 2, 0.0F, true));

        this.LowerJaw = new AdvancedModelRenderer(this);
        this.LowerJaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(LowerJaw);
        this.LowerJaw.cubeList.add(new ModelBox(LowerJaw, 43, 43, -1.0F, 0.0F, -6.0F, 2, 1, 3, 0.0F, false));

        this.lowercheekr = new AdvancedModelRenderer(this);
        this.lowercheekr.setRotationPoint(-1.0F, 0.0F, -6.0F);
        this.LowerJaw.addChild(lowercheekr);
        this.setRotateAngle(lowercheekr, 0.0F, -0.4363F, -0.0003F);
        this.lowercheekr.cubeList.add(new ModelBox(lowercheekr, 43, 29, -0.02F, 0.0F, -0.01F, 2, 1, 3, -0.01F, false));
        this.lowercheekr.cubeList.add(new ModelBox(lowercheekr, 0, 3, 0.18F, -0.5F, -0.01F, 0, 1, 3, 0.0F, false));

        this.lowercheekr2 = new AdvancedModelRenderer(this);
        this.lowercheekr2.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.lowercheekr.addChild(lowercheekr2);
        this.setRotateAngle(lowercheekr2, 0.0F, 0.3054F, 0.0F);
        this.lowercheekr2.cubeList.add(new ModelBox(lowercheekr2, 40, 23, 0.0F, -1.0F, -0.02F, 3, 1, 4, 0.0F, false));
        this.lowercheekr2.cubeList.add(new ModelBox(lowercheekr2, 0, 6, 0.15F, -1.5F, -0.02F, 0, 1, 2, 0.0F, false));

        this.lowercheekr3 = new AdvancedModelRenderer(this);
        this.lowercheekr3.setRotationPoint(1.0F, 0.0F, -6.0F);
        this.LowerJaw.addChild(lowercheekr3);
        this.setRotateAngle(lowercheekr3, 0.0F, 0.4363F, 0.0003F);
        this.lowercheekr3.cubeList.add(new ModelBox(lowercheekr3, 43, 29, -1.98F, 0.0F, -0.01F, 2, 1, 3, -0.01F, true));
        this.lowercheekr3.cubeList.add(new ModelBox(lowercheekr3, 0, 3, -0.18F, -0.5F, -0.01F, 0, 1, 3, 0.0F, true));

        this.lowercheekr4 = new AdvancedModelRenderer(this);
        this.lowercheekr4.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.lowercheekr3.addChild(lowercheekr4);
        this.setRotateAngle(lowercheekr4, 0.0F, -0.3054F, 0.0F);
        this.lowercheekr4.cubeList.add(new ModelBox(lowercheekr4, 40, 23, -3.0F, -1.0F, -0.02F, 3, 1, 4, 0.0F, true));
        this.lowercheekr4.cubeList.add(new ModelBox(lowercheekr4, 0, 6, -0.15F, -1.5F, -0.02F, 0, 1, 2, 0.0F, true));

        this.chin = new AdvancedModelRenderer(this);
        this.chin.setRotationPoint(0.0F, 1.0F, -6.0F);
        this.LowerJaw.addChild(chin);
        this.setRotateAngle(chin, -0.1134F, 0.0F, 0.0F);
        this.chin.cubeList.add(new ModelBox(chin, 36, 42, -1.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.chincheekr = new AdvancedModelRenderer(this);
        this.chincheekr.setRotationPoint(-1.0F, -1.0F, 0.0F);
        this.chin.addChild(chincheekr);
        this.setRotateAngle(chincheekr, 0.0F, -0.3927F, -0.0003F);
        this.chincheekr.cubeList.add(new ModelBox(chincheekr, 35, 0, -0.02F, 0.0F, -0.01F, 2, 1, 3, -0.01F, false));

        this.chincheekr2 = new AdvancedModelRenderer(this);
        this.chincheekr2.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.chincheekr.addChild(chincheekr2);
        this.setRotateAngle(chincheekr2, 0.0F, 0.3054F, 0.0F);
        this.chincheekr2.cubeList.add(new ModelBox(chincheekr2, 40, 18, 0.0F, -1.0F, -0.02F, 3, 1, 4, 0.0F, false));

        this.chincheekr3 = new AdvancedModelRenderer(this);
        this.chincheekr3.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.chin.addChild(chincheekr3);
        this.setRotateAngle(chincheekr3, 0.0F, 0.3927F, 0.0003F);
        this.chincheekr3.cubeList.add(new ModelBox(chincheekr3, 35, 0, -1.98F, 0.0F, -0.01F, 2, 1, 3, -0.01F, true));

        this.chincheekr4 = new AdvancedModelRenderer(this);
        this.chincheekr4.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.chincheekr3.addChild(chincheekr4);
        this.setRotateAngle(chincheekr4, 0.0F, -0.3054F, 0.0F);
        this.chincheekr4.cubeList.add(new ModelBox(chincheekr4, 40, 18, -3.0F, -1.0F, -0.02F, 3, 1, 4, 0.0F, true));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-2.5F, 1.0F, -2.5F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, 0.0F, 0.5672F, -0.1309F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 22, 47, -1.5F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        this.LowerArmR = new AdvancedModelRenderer(this);
        this.LowerArmR.setRotationPoint(-1.5F, 0.0F, 0.25F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, -3.0107F, -1.5272F, 3.1416F);
        this.LowerArmR.cubeList.add(new ModelBox(LowerArmR, 0, 12, -2.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, 0.0F, 0.0F, 0.0436F);
        this.HandR.cubeList.add(new ModelBox(HandR, 0, 0, -1.5F, -0.4F, -1.0F, 2, 1, 2, 0.0F, false));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(2.5F, 1.0F, -2.5F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, 0.0F, -0.5672F, 0.0F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 22, 47, -1.5F, -0.5F, -1.0F, 3, 1, 2, 0.0F, true));

        this.LowerArmL = new AdvancedModelRenderer(this);
        this.LowerArmL.setRotationPoint(1.5F, 0.0F, 0.25F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, -3.0107F, 1.5272F, -3.1416F);
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 0, 12, -0.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.0F, 0.0F, -0.0436F);
        this.HandL.cubeList.add(new ModelBox(HandL, 0, 0, -0.5F, -0.4F, -1.0F, 2, 1, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    public void renderStaticPlinth(float f) {
        this.LowerJaw.rotateAngleX = (float) Math.toRadians(23);
        this.Hips.render(0.01F);
    }
    public void renderStaticFloor(float f) {
        this.Hips.render(0.01F);
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
        this.Hips.offsetY = 0F;

        EntityPrehistoricFloraGreererpeton greer = (EntityPrehistoricFloraGreererpeton) e;

        this.faceTarget(f3, f4, 12, Head);

        float speed = 0.15F;

        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2, this.Tail3};
        AdvancedModelRenderer[] Torso = {this.Body, this.Body2, this.Chest};
        greer.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] LeftArm = {this.UpperArmL, this.LowerArmL};
        AdvancedModelRenderer[] RightArm = {this.UpperArmR, this.LowerArmR};

        AdvancedModelRenderer[] LeftLeg = {this.UpperLegL, this.LowerLegL};
        AdvancedModelRenderer[] RightLeg = {this.UpperLegR, this.LowerLegR};

        if (greer.isReallyInWater()) {
            this.setRotateAngle(UpperArmL, (float)Math.toRadians(0), -(float)Math.toRadians(47.5), -(float)Math.toRadians(7.5));
            this.setRotateAngle(UpperArmR, (float)Math.toRadians(0), (float)Math.toRadians(47.5), (float)Math.toRadians(7.5));
            this.setRotateAngle(LowerArmL, -(float)Math.toRadians(0.3472), -(float)Math.toRadians(20.021), -(float)Math.toRadians(-7.3741));
            this.setRotateAngle(LowerArmR, -(float)Math.toRadians(0.3472), (float)Math.toRadians(20.021), -(float)Math.toRadians(-7.3741));
            this.setRotateAngle(UpperLegL, -(float)Math.toRadians(-1.0631), -(float)Math.toRadians(45.0107), -(float)Math.toRadians(6.6325));
            this.setRotateAngle(UpperLegR, -(float)Math.toRadians(-1.0631), (float)Math.toRadians(45.0107), -(float)Math.toRadians(6.6325));
            this.setRotateAngle(LowerLegL, -(float)Math.toRadians(1.8636), -(float)Math.toRadians(25.0156), -(float)Math.toRadians(-1.0555));
            this.setRotateAngle(LowerLegR, -(float)Math.toRadians(1.8636), (float)Math.toRadians(25.0156), -(float)Math.toRadians(-1.0555));
            this.setRotateAngle(FootL, -(float)Math.toRadians(2.7647), -(float)Math.toRadians(-25.0981), -(float)Math.toRadians(-5.4974));
            this.setRotateAngle(FootR, -(float)Math.toRadians(2.7647), (float)Math.toRadians(-25.0981), -(float)Math.toRadians(-5.4974));








            if (f3 == 0.0F || !greer.getIsMoving()) {
                return;
            }

            this.chainSwingExtended(LeftArm, speed, -0.2F,0F,3.0F, f2, 0.7F);
            this.chainSwingExtended(RightArm, speed, 0.2F,0F,0, f2, 0.7F);

            this.chainSwingExtended(LeftLeg, speed, 0.2F,0F,3.0F, f2, 0.7F);
            this.chainSwingExtended(RightLeg, speed , -0.2F,0F,0, f2, 0.7F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 1.2F, 0.3F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
        }
        else {
            speed = speed *0.5F;
            if (greer.getIsFast()) {
                speed = speed * 1.33F;
            }
            this.chainSwing(Torso, speed, 0.07F, -3, f2, 1);
            if (f3 == 0.0F) {
                this.chainSwing(Tail, speed * 0.45F, 0.2F, -3, f2, 0.8F);

            }

            //this.chainSwingExtended(LeftArm, speed, 0.6F,0F,3.0F, f2, 0.7F);
            //this.chainSwingExtended(RightArm, speed, -0.6F,0F,0, f2, 0.7F);
            this.swing(UpperArmL, speed, 0.6F, false, 3.0f, -0, f2, 0.7F);
            this.swing(UpperArmR, speed, -0.6F, false, 0f, -0, f2, 0.7F);
            this.swing(LowerArmL, speed, -0.4F, true, 0f, -0, f2, 0.7F);
            this.swing(LowerArmR, speed, -0.4F, true, 0f, -0, f2, 0.7F);


            this.chainSwingExtended(LeftLeg, speed, 0.4F,0F,3.0F, f2, 0.7F);
            this.chainSwingExtended(RightLeg, speed , -0.4F,0F,0, f2, 0.7F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.45F, 0.2F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.Head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.LowerJaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.Head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.LowerJaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck, (float) Math.toRadians(0), (float) Math.toRadians(25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
