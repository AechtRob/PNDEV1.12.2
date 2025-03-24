package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCamptosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCamptosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Camptosaurus;
    private final AdvancedModelRenderer Basin_r1;
    private final AdvancedModelRenderer Basin_r2;
    private final AdvancedModelRenderer Basin_r3;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Basin_r4;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Basin_r5;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer LegL;
    private final AdvancedModelRenderer KneeL;
    private final AdvancedModelRenderer MetatarsalL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer FootL2;
    private final AdvancedModelRenderer LegR;
    private final AdvancedModelRenderer KneeR;
    private final AdvancedModelRenderer MetatarsalR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer FootR2;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer ArmL;
    private final AdvancedModelRenderer ElbowL;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer OpposableL;
    private final AdvancedModelRenderer ArmR;
    private final AdvancedModelRenderer ElbowR;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer OpposableR;
    private final AdvancedModelRenderer Neck4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;

    private ModelAnimator animator;

    public ModelCamptosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Camptosaurus = new AdvancedModelRenderer(this);
        this.Camptosaurus.setRotationPoint(0.0F, -1.0F, 0.0F);


        this.Basin_r1 = new AdvancedModelRenderer(this);
        this.Basin_r1.setRotationPoint(0.0F, -9.6F, 7.0F);
        this.Camptosaurus.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.4887F, 0.0F, 0.0F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 0, 29, -1.0F, 0.9413F, 0.6591F, 2, 4, 4, -0.001F, false));

        this.Basin_r2 = new AdvancedModelRenderer(this);
        this.Basin_r2.setRotationPoint(0.0F, -8.5F, 0.0F);
        this.Camptosaurus.addChild(Basin_r2);
        this.setRotateAngle(Basin_r2, -0.0087F, 0.0F, 0.0F);
        this.Basin_r2.cubeList.add(new ModelBox(Basin_r2, 69, 100, -1.0F, 0.0117F, 0.1447F, 2, 4, 7, 0.0F, false));

        this.Basin_r3 = new AdvancedModelRenderer(this);
        this.Basin_r3.setRotationPoint(0.0F, -9.3F, -1.9F);
        this.Camptosaurus.addChild(Basin_r3);
        this.setRotateAngle(Basin_r3, -0.3403F, 0.0F, 0.0F);
        this.Basin_r3.cubeList.add(new ModelBox(Basin_r3, 41, 45, -5.5F, 0.0F, -0.1F, 11, 17, 12, 0.0F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -5.3F, 9.1F);
        this.Camptosaurus.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.4189F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 88, 44, -4.0F, 0.0F, 0.2F, 8, 14, 6, 0.0F, false));
        this.Tail1.cubeList.add(new ModelBox(Tail1, 88, 44, -4.0F, 0.1F, -1.8F, 8, 14, 6, -0.01F, false));

        this.Basin_r4 = new AdvancedModelRenderer(this);
        this.Basin_r4.setRotationPoint(0.0F, -1.8F, 0.3F);
        this.Tail1.addChild(Basin_r4);
        this.setRotateAngle(Basin_r4, -0.1222F, 0.0F, 0.0F);
        this.Basin_r4.cubeList.add(new ModelBox(Basin_r4, 23, 57, -1.0F, -0.0271F, -0.0488F, 2, 4, 6, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1745F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 42, 16, -3.0F, 0.0F, -2.0F, 6, 8, 13, 0.0F, false));

        this.Basin_r5 = new AdvancedModelRenderer(this);
        this.Basin_r5.setRotationPoint(0.0F, -2.0F, 0.4F);
        this.Tail2.addChild(Basin_r5);
        this.setRotateAngle(Basin_r5, -0.192F, 0.0F, 0.0F);
        this.Basin_r5.cubeList.add(new ModelBox(Basin_r5, 89, 89, -1.0F, 0.9199F, -0.0616F, 2, 4, 11, -0.001F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1309F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 68, 25, -2.0F, 0.0F, -1.0F, 4, 5, 13, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0873F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 57, -1.5F, 0.0F, -1.0F, 3, 3, 16, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.3F, 15.2F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.1745F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 0, 80, -1.0F, 0.0F, -1.0F, 2, 2, 14, 0.0F, false));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(5.5F, -3.5F, 2.5F);
        this.Camptosaurus.addChild(LegL);
        this.setRotateAngle(LegL, -0.3491F, 0.0F, 0.0F);
        this.LegL.cubeList.add(new ModelBox(LegL, 69, 75, -3.5F, -2.0F, -4.5F, 6, 15, 9, 0.0F, false));

        this.KneeL = new AdvancedModelRenderer(this);
        this.KneeL.setRotationPoint(0.0F, 12.4F, -4.3F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 0.9599F, 0.0F, 0.0F);
        this.KneeL.cubeList.add(new ModelBox(KneeL, 27, 94, -3.0F, 0.4F, -0.5F, 5, 13, 6, 0.0F, false));

        this.MetatarsalL = new AdvancedModelRenderer(this);
        this.MetatarsalL.setRotationPoint(0.0F, 13.0F, 4.7F);
        this.KneeL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -0.6981F, 0.0F, 0.0F);
        this.MetatarsalL.cubeList.add(new ModelBox(MetatarsalL, 50, 94, -3.0F, -0.1F, -3.5F, 5, 10, 4, -0.01F, false));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 8.3F, -0.8F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, -1.4835F, 0.0F, 0.0F);
        this.FootL.cubeList.add(new ModelBox(FootL, 105, 82, -3.5F, -1.4F, -0.8F, 6, 4, 3, 0.0F, false));

        this.FootL2 = new AdvancedModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 2.4F, 0.7F);
        this.FootL.addChild(FootL2);
        this.FootL2.cubeList.add(new ModelBox(FootL2, 68, 17, -3.5F, -0.1F, -1.5F, 6, 4, 3, 0.01F, false));

        this.LegR = new AdvancedModelRenderer(this);
        this.LegR.setRotationPoint(-5.5F, -3.5F, 2.5F);
        this.Camptosaurus.addChild(LegR);
        this.setRotateAngle(LegR, -0.3491F, 0.0F, 0.0F);
        this.LegR.cubeList.add(new ModelBox(LegR, 69, 75, -2.5F, -2.0F, -4.5F, 6, 15, 9, 0.0F, true));

        this.KneeR = new AdvancedModelRenderer(this);
        this.KneeR.setRotationPoint(0.0F, 12.4F, -4.3F);
        this.LegR.addChild(KneeR);
        this.setRotateAngle(KneeR, 0.9599F, 0.0F, 0.0F);
        this.KneeR.cubeList.add(new ModelBox(KneeR, 27, 94, -2.0F, 0.4F, -0.5F, 5, 13, 6, 0.0F, true));

        this.MetatarsalR = new AdvancedModelRenderer(this);
        this.MetatarsalR.setRotationPoint(0.0F, 13.0F, 4.7F);
        this.KneeR.addChild(MetatarsalR);
        this.setRotateAngle(MetatarsalR, -0.6981F, 0.0F, 0.0F);
        this.MetatarsalR.cubeList.add(new ModelBox(MetatarsalR, 50, 94, -2.0F, -0.1F, -3.5F, 5, 10, 4, -0.01F, true));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.0F, 8.3F, -0.8F);
        this.MetatarsalR.addChild(FootR);
        this.setRotateAngle(FootR, -1.4835F, 0.0F, 0.0F);
        this.FootR.cubeList.add(new ModelBox(FootR, 105, 82, -2.5F, -1.4F, -0.8F, 6, 4, 3, 0.0F, true));

        this.FootR2 = new AdvancedModelRenderer(this);
        this.FootR2.setRotationPoint(0.0F, 2.4F, 0.7F);
        this.FootR.addChild(FootR2);
        this.FootR2.cubeList.add(new ModelBox(FootR2, 68, 17, -2.5F, -0.1F, -1.5F, 6, 4, 3, 0.0F, true));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -3.0F, -2.0F);
        this.Camptosaurus.addChild(Body);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -6.8F, -6.9F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 68, 0, -6.0F, -0.1383F, 1.1951F, 13, 9, 7, -0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 68, 0, -6.0F, -0.1383F, 0.1951F, 13, 9, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 10.2F, -14.9F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1047F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -6.0F, -14.0383F, -0.3049F, 13, 14, 14, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -3.2F, -18.9F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2967F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 29, -6.0F, -0.0549F, -0.1534F, 13, 14, 13, 0.01F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.6F, -18.3F);
        this.Body.addChild(Chest);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 9.6F, -2.2F);
        this.Chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2443F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 90, 17, -4.0F, -8.9504F, -0.1496F, 10, 9, 6, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 3.6F, -0.7F);
        this.Chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.6458F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 75, -4.0F, -5.0F, -5.0F, 10, 9, 9, 0.0F, false));

        this.ArmL = new AdvancedModelRenderer(this);
        this.ArmL.setRotationPoint(4.4F, 7.6F, -1.3F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.6109F, 0.0F, 0.0F);
        this.ArmL.cubeList.add(new ModelBox(ArmL, 0, 0, -1.6F, -1.0F, -1.5F, 3, 8, 3, 0.0F, false));

        this.ElbowL = new AdvancedModelRenderer(this);
        this.ElbowL.setRotationPoint(0.0F, 6.5F, 0.8F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, 0.3054F, 0.0F, 0.0F);
        this.ElbowL.cubeList.add(new ModelBox(ElbowL, 103, 33, -1.0F, -2.5F, -6.4F, 2, 3, 7, 0.0F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(0.7F, -1.0F, -6.4F);
        this.ElbowL.addChild(HandL);
        this.setRotateAngle(HandL, 0.0F, 0.2618F, 0.0F);
        this.HandL.cubeList.add(new ModelBox(HandL, 60, 75, -1.0F, -1.5F, -4.0F, 1, 3, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.HandL.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 57, -1.0F, -2.0F, -1.0F, 1, 2, 1, -0.01F, false));

        this.OpposableL = new AdvancedModelRenderer(this);
        this.OpposableL.setRotationPoint(0.0F, 1.0F, -0.5F);
        this.HandL.addChild(OpposableL);
        this.setRotateAngle(OpposableL, -0.2618F, 0.0F, 0.0F);
        this.OpposableL.cubeList.add(new ModelBox(OpposableL, 41, 0, -1.0F, 0.0F, -0.5F, 1, 2, 1, -0.01F, false));

        this.ArmR = new AdvancedModelRenderer(this);
        this.ArmR.setRotationPoint(-4.4F, 7.6F, -1.3F);
        this.Chest.addChild(ArmR);
        this.setRotateAngle(ArmR, 0.6109F, 0.0F, 0.0F);
        this.ArmR.cubeList.add(new ModelBox(ArmR, 0, 0, -1.4F, -1.0F, -1.5F, 3, 8, 3, 0.0F, true));

        this.ElbowR = new AdvancedModelRenderer(this);
        this.ElbowR.setRotationPoint(0.0F, 6.5F, 0.8F);
        this.ArmR.addChild(ElbowR);
        this.setRotateAngle(ElbowR, 0.3054F, 0.0F, 0.0F);
        this.ElbowR.cubeList.add(new ModelBox(ElbowR, 103, 33, -1.0F, -2.5F, -6.4F, 2, 3, 7, 0.0F, true));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(-0.7F, -1.0F, -6.4F);
        this.ElbowR.addChild(HandR);
        this.setRotateAngle(HandR, 0.0F, -0.2618F, 0.0F);
        this.HandR.cubeList.add(new ModelBox(HandR, 60, 75, 0.0F, -1.5F, -4.0F, 1, 3, 4, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.HandR.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 57, 0.0F, -2.0F, -1.0F, 1, 2, 1, -0.01F, true));

        this.OpposableR = new AdvancedModelRenderer(this);
        this.OpposableR.setRotationPoint(0.0F, 1.0F, -0.5F);
        this.HandR.addChild(OpposableR);
        this.setRotateAngle(OpposableR, -0.2618F, 0.0F, 0.0F);
        this.OpposableR.cubeList.add(new ModelBox(OpposableR, 41, 0, 0.0F, 0.0F, -0.5F, 1, 2, 1, -0.01F, true));

        this.Neck4 = new AdvancedModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, 4.0F, -4.7F);
        this.Chest.addChild(Neck4);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.Neck4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 91, 65, -2.5F, -0.4F, -0.3F, 5, 8, 8, 0.0F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -1.2F, -4.2F);
        this.Neck4.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.1745F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.9068F, -1.4919F);
        this.Neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 41, 0, -2.0F, 0.0F, -2.0F, 4, 6, 6, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -1.2068F, -2.9919F);
        this.Neck3.addChild(Neck2);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.1F, 1.0F);
        this.Neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7069F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 97, -1.5F, -0.3731F, -6.4922F, 3, 5, 7, -0.03F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -4.2F, -4.1F);
        this.Neck2.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.1571F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.1086F, -2.3905F);
        this.Neck1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2094F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 57, -1.5F, 0.1F, -0.1F, 3, 5, 3, -0.04F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.1914F, -2.3905F);
        this.Neck1.addChild(Head);
        this.setRotateAngle(Head, -0.2182F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, -0.3F, -2.7F);
        this.Head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.4189F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 38, -2.0F, -0.0437F, -1.0322F, 2, 2, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.2285F, -3.0251F);
        this.Head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2368F, -0.1207F, -0.0192F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 58, 9, -1.0451F, -0.99F, -1.873F, 0, 2, 4, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 1, 109, -1.0299F, -0.99F, -1.873F, 0, 2, 4, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.2285F, -3.0251F);
        this.Head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2368F, 0.1207F, 0.0192F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 1, 109, 1.0299F, -0.99F, -1.873F, 0, 2, 4, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 58, 9, 1.0451F, -0.99F, -1.873F, 0, 2, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, -0.4F, -2.7F);
        this.Head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3142F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 83, -2.0F, 0.05F, -0.2651F, 2, 2, 3, 0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 2.2F, -5.6F);
        this.Head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2281F, -0.1207F, -0.0192F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 34, 57, -0.7F, -0.0782F, 1.0062F, 0, 1, 3, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 2.2F, -5.6F);
        this.Head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2281F, 0.1207F, 0.0192F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 57, 0.7F, -0.0782F, 1.0062F, 0, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.6F, -4.7F);
        this.Head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.4712F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 65, 0, -0.5F, 0.0414F, -0.0034F, 1, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 1.2F, -5.5F);
        this.Head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.576F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 62, 6, -1.0F, -0.0194F, -0.0019F, 1, 1, 1, -0.001F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 3.1F, -6.1F);
        this.Head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 2.1468F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 68, 25, -1.0F, -0.528F, -0.5699F, 2, 1, 1, 0.001F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 2.7F, -6.9F);
        this.Head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 1.309F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 67, 75, -1.0F, -0.0517F, -0.9492F, 2, 1, 1, 0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 1.9F, -6.2F);
        this.Head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.8378F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 10, 57, -1.0F, -0.0366F, -1.0121F, 1, 1, 1, -0.001F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, 1.8F, -6.2F);
        this.Head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.7679F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 62, 38, -1.5F, 0.0353F, -0.0815F, 1, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 2.6F, -6.9F);
        this.Head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.6545F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 34, 68, -1.5F, 0.0035F, -0.0627F, 2, 1, 1, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 2.1F, -6.1F);
        this.Head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.5411F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 53, 38, -1.5F, -0.08F, -0.006F, 2, 1, 4, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.0F, 2.0F, -6.1F);
        this.Head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2461F, -0.1185F, -0.0297F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 19, 77, 0.0F, 0.017F, -0.0302F, 1, 1, 4, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.0F, 2.0F, -6.1F);
        this.Head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2461F, 0.1185F, 0.0297F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 19, 77, -1.0F, 0.017F, -0.0302F, 1, 1, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 0.5F, 0.4F);
        this.Head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2443F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 76, 44, -1.5F, -0.1F, -6.7F, 2, 1, 4, 0.01F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 77, -2.0F, -1.1F, -2.7F, 3, 2, 3, 0.04F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.2F, 0.9F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.1047F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 66, -1.5F, 0.0F, -3.0F, 3, 2, 3, 0.02F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 23, 68, 1.3F, -1.0F, -3.0F, 0, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 109, 1.29F, -1.0F, -3.0F, 0, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 109, -1.29F, -1.0F, -3.0F, 0, 1, 3, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 23, 68, -1.3F, -1.0F, -3.0F, 0, 1, 3, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 40, 38, -1.0F, 1.0F, -5.0F, 2, 1, 2, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 38, -1.0F, 1.0F, -6.9F, 2, 1, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 1.0F, -6.5F);
        this.Jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1582F, -0.1207F, -0.0192F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 30, 77, -0.7428F, -0.7106F, 0.5598F, 0, 1, 4, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 110, -0.7313F, -0.7106F, 0.5598F, 0, 1, 4, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 34, 57, -0.7F, -0.1782F, 1.0062F, 0, 1, 3, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 76, 50, -1.0F, 0.0218F, 0.0062F, 1, 1, 4, -0.01F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 1.0F, -6.5F);
        this.Jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1582F, 0.1207F, 0.0192F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 110, 0.7313F, -0.7106F, 0.5598F, 0, 1, 4, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 30, 77, 0.7428F, -0.7106F, 0.5598F, 0, 1, 4, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 34, 57, 0.7F, -0.1782F, 1.0062F, 0, 1, 3, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 76, 50, 0.0F, 0.0218F, 0.0062F, 1, 1, 4, -0.01F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.Jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1571F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 56, 0, -1.0F, 0.1F, 0.5F, 2, 1, 4, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 2.0F, -7.0F);
        this.Jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.2618F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 27, 68, -1.0F, -1.04F, -0.9F, 2, 1, 1, -0.02F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Camptosaurus.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Camptosaurus.offsetY = 0.10F;
        this.Camptosaurus.offsetX = -0.1F;
        this.Camptosaurus.offsetZ = 2.5F;
        this.Camptosaurus.rotateAngleY = (float)Math.toRadians(115);
        this.Camptosaurus.rotateAngleX = (float)Math.toRadians(-2);
        this.Camptosaurus.rotateAngleZ = (float)Math.toRadians(2);
        this.Camptosaurus.scaleChildren = true;
        float scaler = 0.6F;
        this.Camptosaurus.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Camptosaurus, -0.0F, 4.0F, 0.0F);
        this.setRotateAngle(Tail5, -0.0886F, -0.1739F, 0.0154F);
        this.setRotateAngle(Tail4, 0.0894F, -0.2173F, -0.0193F);
        this.setRotateAngle(Tail3, 0.0468F, -0.2163F, -0.0289F);
        this.setRotateAngle(Tail2, 0.131F, -0.0433F, -0.0057F);
        this.setRotateAngle(Tail1, -0.4189F, 0.0F, 0.0F);
        this.setRotateAngle(OpposableR, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(OpposableL, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Neck4, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Neck3, 0.1713F, 0.0935F, -0.028F);
        this.setRotateAngle(Neck2, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(Neck1, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(MetatarsalR, -0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(MetatarsalL, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(LegR, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(LegL, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(KneeR, 0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(KneeL, 1.0472F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.3665F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.219F, 0.0852F, -0.0189F);
        this.setRotateAngle(HandR, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(HandL, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(FootR, -1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, -1.7453F, 0.0F, 0.0F);
        this.setRotateAngle(ElbowR, 0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(ElbowL, 0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, 0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.1582F, 0.1207F, 0.0192F);
        this.setRotateAngle(cube_r3, 0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, 0.1582F, -0.1207F, -0.0192F);
        this.setRotateAngle(cube_r28, 0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r27, 0.2461F, 0.1185F, 0.0297F);
        this.setRotateAngle(cube_r26, 0.2461F, -0.1185F, -0.0297F);
        this.setRotateAngle(cube_r25, 0.5411F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, 0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.7679F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, 0.8378F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 1.309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 2.1468F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.576F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.4712F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.2281F, 0.1207F, 0.0192F);
        this.setRotateAngle(cube_r16, 0.2281F, -0.1207F, -0.0192F);
        this.setRotateAngle(cube_r15, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.2368F, 0.1207F, 0.0192F);
        this.setRotateAngle(cube_r13, 0.2368F, -0.1207F, -0.0192F);
        this.setRotateAngle(cube_r12, 0.4189F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.7069F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Chest, -0.0437F, 0.0436F, -0.0019F);
        this.setRotateAngle(Body, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Basin_r5, -0.192F, 0.0F, 0.0F);
        this.setRotateAngle(Basin_r4, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(Basin_r3, -0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(Basin_r2, -0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(Basin_r1, -0.4887F, 0.0F, 0.0F);
        this.setRotateAngle(ArmR, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(ArmL, 0.6109F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Camptosaurus.render(f);
        //Reset rotations, positions and sizing:
        this.Camptosaurus.setScale(1.0F, 1.0F, 1.0F);
        this.Camptosaurus.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(Tail5, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, -0.4189F, 0.0F, 0.0F);
        this.setRotateAngle(OpposableR, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(OpposableL, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Neck3, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(MetatarsalR, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(MetatarsalL, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(LegR, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(LegL, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(KneeR, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(KneeL, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(HandR, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(HandL, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(FootR, -1.4835F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, -1.4835F, 0.0F, 0.0F);
        this.setRotateAngle(ElbowR, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(ElbowL, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, 0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.1582F, 0.1207F, 0.0192F);
        this.setRotateAngle(cube_r3, 0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, 0.1582F, -0.1207F, -0.0192F);
        this.setRotateAngle(cube_r28, 0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r27, 0.2461F, 0.1185F, 0.0297F);
        this.setRotateAngle(cube_r26, 0.2461F, -0.1185F, -0.0297F);
        this.setRotateAngle(cube_r25, 0.5411F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, 0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.7679F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, 0.8378F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 1.309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 2.1468F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.576F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.4712F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.2281F, 0.1207F, 0.0192F);
        this.setRotateAngle(cube_r16, 0.2281F, -0.1207F, -0.0192F);
        this.setRotateAngle(cube_r15, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.2368F, 0.1207F, 0.0192F);
        this.setRotateAngle(cube_r13, 0.2368F, -0.1207F, -0.0192F);
        this.setRotateAngle(cube_r12, 0.4189F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.7069F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Basin_r5, -0.192F, 0.0F, 0.0F);
        this.setRotateAngle(Basin_r4, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(Basin_r3, -0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(Basin_r2, -0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(Basin_r1, -0.4887F, 0.0F, 0.0F);
        this.setRotateAngle(ArmR, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(ArmL, 0.6109F, 0.0F, 0.0F);
        this.Neck3.offsetY = -0.01F;
        this.Neck3.offsetZ = -0.01F;
        this.Neck3.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Tail5, -0.0886F, -0.1739F, 0.0154F);
        this.setRotateAngle(Tail4, 0.0894F, -0.2173F, -0.0193F);
        this.setRotateAngle(Tail3, 0.0468F, -0.2163F, -0.0289F);
        this.setRotateAngle(Tail2, 0.131F, -0.0433F, -0.0057F);
        this.setRotateAngle(Tail1, -0.4189F, 0.0F, 0.0F);
        this.setRotateAngle(OpposableR, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(OpposableL, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Neck4, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Neck3, 0.1713F, 0.0935F, -0.028F);
        this.setRotateAngle(Neck2, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(Neck1, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(MetatarsalR, -0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(MetatarsalL, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(LegR, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(LegL, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(KneeR, 0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(KneeL, 1.0472F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.3665F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.219F, 0.0852F, -0.0189F);
        this.setRotateAngle(HandR, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(HandL, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(FootR, -1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, -1.7453F, 0.0F, 0.0F);
        this.setRotateAngle(ElbowR, 0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(ElbowL, 0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, 0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.1582F, 0.1207F, 0.0192F);
        this.setRotateAngle(cube_r3, 0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, 0.1582F, -0.1207F, -0.0192F);
        this.setRotateAngle(cube_r28, 0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r27, 0.2461F, 0.1185F, 0.0297F);
        this.setRotateAngle(cube_r26, 0.2461F, -0.1185F, -0.0297F);
        this.setRotateAngle(cube_r25, 0.5411F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, 0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.7679F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, 0.8378F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 1.309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 2.1468F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.576F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.4712F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.2281F, 0.1207F, 0.0192F);
        this.setRotateAngle(cube_r16, 0.2281F, -0.1207F, -0.0192F);
        this.setRotateAngle(cube_r15, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.2368F, 0.1207F, 0.0192F);
        this.setRotateAngle(cube_r13, 0.2368F, -0.1207F, -0.0192F);
        this.setRotateAngle(cube_r12, 0.4189F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.7069F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Chest, -0.0437F, 0.0436F, -0.0019F);
        this.setRotateAngle(Body, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Basin_r5, -0.192F, 0.0F, 0.0F);
        this.setRotateAngle(Basin_r4, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(Basin_r3, -0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(Basin_r2, -0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(Basin_r1, -0.4887F, 0.0F, 0.0F);
        this.setRotateAngle(ArmR, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(ArmL, 0.6109F, 0.0F, 0.0F);
        this.Camptosaurus.offsetY = -0.109F;
        this.Camptosaurus.render(0.01F);
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

        EntityPrehistoricFloraCamptosaurus entityCamptosaurus = (EntityPrehistoricFloraCamptosaurus) e;

        this.faceTarget(f3, f4, 10, Neck4);
        this.faceTarget(f3, f4, 10, Neck3);
        this.faceTarget(f3, f4, 10, Neck2);
        this.faceTarget(f3, f4, 10, Neck1);
        this.faceTarget(f3, f4, 10, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] Neck = {this.Neck4, this.Neck3, this.Neck2, this.Neck1, this.Head};
        AdvancedModelRenderer[] ArmL = {this.ArmL, this.ElbowL, this.HandL};
        AdvancedModelRenderer[] ArmR = {this.ArmR, this.ElbowR, this.HandR};

        entityCamptosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityCamptosaurus.getAnimation() == entityCamptosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityCamptosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityCamptosaurus.getIsMoving()) {
                    if (entityCamptosaurus.getAnimation() != entityCamptosaurus.EAT_ANIMATION
                        && (!entityCamptosaurus.isAnimationDirectionLocked(entityCamptosaurus.getAnimation()))) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.ArmL, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.ArmR, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.ElbowL, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.ElbowR, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);


                    return;
                }

                if (entityCamptosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraCamptosaurus ee = (EntityPrehistoricFloraCamptosaurus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animDrink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE1) { //The noise anim
            animIdle1(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE2) { //The noise anim
            animIdle2(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE3) { //The noise anim
            animIdle3(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE4) { //The noise anim
            animIdle4(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamptosaurus entity = (EntityPrehistoricFloraCamptosaurus) entitylivingbaseIn;

        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (5-(0)));
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
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (5-(0)));
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




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = -30 + (((tickAnim - 6) / 10) * (-57.6862-(-30)));
            yy = 0 + (((tickAnim - 6) / 10) * (3.89049-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (9.21927-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 35) {
            xx = -57.6862 + (((tickAnim - 16) / 19) * (0-(-57.6862)));
            yy = 3.89049 + (((tickAnim - 16) / 19) * (0-(3.89049)));
            zz = 9.21927 + (((tickAnim - 16) / 19) * (0-(9.21927)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 12.5 + (((tickAnim - 6) / 6) * (0-(12.5)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (30-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 16) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 19) * (0-(0)));
            zz = 30 + (((tickAnim - 16) / 19) * (0-(30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(OpposableL, OpposableL.rotateAngleX + (float) Math.toRadians(xx), OpposableL.rotateAngleY + (float) Math.toRadians(yy), OpposableL.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(xx), ElbowR.rotateAngleY + (float) Math.toRadians(yy), ElbowR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (29.91-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 29.91 + (((tickAnim - 13) / 11) * (29.91-(29.91)));
            yy = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 29.91 + (((tickAnim - 24) / 11) * (0-(29.91)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-1.18-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -1.18 + (((tickAnim - 7) / 6) * (11.82-(-1.18)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 11.82 + (((tickAnim - 13) / 7) * (23.37-(11.82)));
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




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10.98-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 10.98 + (((tickAnim - 5) / 8) * (-17.68-(10.98)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -17.68 + (((tickAnim - 13) / 7) * (-10.59-(-17.68)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10.59 + (((tickAnim - 20) / 10) * (-17.68-(-10.59)));
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
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




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
        EntityPrehistoricFloraCamptosaurus entity = (EntityPrehistoricFloraCamptosaurus) entitylivingbaseIn;

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
        this.setRotateAngle(Camptosaurus, Camptosaurus.rotateAngleX + (float) Math.toRadians(xx), Camptosaurus.rotateAngleY + (float) Math.toRadians(yy), Camptosaurus.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-0.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -0.25 + (((tickAnim - 10) / 5) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Camptosaurus.rotationPointX = this.Camptosaurus.rotationPointX + (float)(xx);
        this.Camptosaurus.rotationPointY = this.Camptosaurus.rotationPointY - (float)(yy);
        this.Camptosaurus.rotationPointZ = this.Camptosaurus.rotationPointZ + (float)(zz);




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




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 4 + (((tickAnim - 3) / 5) * (-1.75-(4)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -1.75 + (((tickAnim - 8) / 7) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(xx), ElbowR.rotateAngleY + (float) Math.toRadians(yy), ElbowR.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-17.48465-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.29929-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.71973-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -17.48465 + (((tickAnim - 5) / 10) * (0-(-17.48465)));
            yy = -0.29929 + (((tickAnim - 5) / 10) * (0-(-0.29929)));
            zz = 0.71973 + (((tickAnim - 5) / 10) * (0-(0.71973)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-7-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 4.25 + (((tickAnim - 7) / 8) * (0-(4.25)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = -7 + (((tickAnim - 7) / 8) * (0-(-7)));
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

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamptosaurus entity = (EntityPrehistoricFloraCamptosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-130))*2), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-100))*-3));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-130))*2), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-100))*-3));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*2), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-100))*-3));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0), Tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*2), Tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (32.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 32.25 + (((tickAnim - 25) / 25) * (0-(32.25)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (1.075-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 1.075 + (((tickAnim - 38) / 12) * (0-(1.075)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegL.rotationPointX = this.LegL.rotationPointX + (float)(xx);
        this.LegL.rotationPointY = this.LegL.rotationPointY - (float)(yy);
        this.LegL.rotationPointZ = this.LegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-12.78-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -12.78 + (((tickAnim - 15) / 10) * (23-(-12.78)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 23 + (((tickAnim - 25) / 13) * (21.63-(23)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 21.63 + (((tickAnim - 38) / 12) * (0-(21.63)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = -5.25 + (((tickAnim - 15) / 23) * (-56.46-(-5.25)));
            yy = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 23) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -56.46 + (((tickAnim - 38) / 12) * (0-(-56.46)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -9.5 + (((tickAnim - 6) / 9) * (-3-(-9.5)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -3 + (((tickAnim - 15) / 10) * (69.5-(-3)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 69.5 + (((tickAnim - 25) / 13) * (50.25-(69.5)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 50.25 + (((tickAnim - 38) / 6) * (-1.3-(50.25)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -1.3 + (((tickAnim - 44) / 6) * (0-(-1.3)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (6.1209-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-1.37403-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-4.25547-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 6.1209 + (((tickAnim - 33) / 17) * (0-(6.1209)));
            yy = -1.37403 + (((tickAnim - 33) / 17) * (0-(-1.37403)));
            zz = -4.25547 + (((tickAnim - 33) / 17) * (0-(-4.25547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (2.01464-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-6.40067-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-1.22778-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 2.01464 + (((tickAnim - 33) / 17) * (0-(2.01464)));
            yy = -6.40067 + (((tickAnim - 33) / 17) * (0-(-6.40067)));
            zz = -1.22778 + (((tickAnim - 33) / 17) * (0-(-1.22778)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (1.57213-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-26.47993-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-3.46312-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 1.57213 + (((tickAnim - 33) / 17) * (0-(1.57213)));
            yy = -26.47993 + (((tickAnim - 33) / 17) * (0-(-26.47993)));
            zz = -3.46312 + (((tickAnim - 33) / 17) * (0-(-3.46312)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-14.5-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 14.25 + (((tickAnim - 33) / 17) * (0-(14.25)));
            yy = -14.5 + (((tickAnim - 33) / 17) * (0-(-14.5)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-21.5-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -21.5 + (((tickAnim - 33) / 17) * (0-(-21.5)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamptosaurus entity = (EntityPrehistoricFloraCamptosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -8.5 + (((tickAnim - 15) / 20) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 35) / 15) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Camptosaurus, Camptosaurus.rotateAngleX + (float) Math.toRadians(xx), Camptosaurus.rotateAngleY + (float) Math.toRadians(yy), Camptosaurus.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-8.55-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -8.55 + (((tickAnim - 15) / 20) * (-8.55-(-8.55)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -8.55 + (((tickAnim - 35) / 15) * (0-(-8.55)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Camptosaurus.rotationPointX = this.Camptosaurus.rotationPointX + (float)(xx);
        this.Camptosaurus.rotationPointY = this.Camptosaurus.rotationPointY - (float)(yy);
        this.Camptosaurus.rotationPointZ = this.Camptosaurus.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.79289-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (6.9646-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.70479-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -4.79289 + (((tickAnim - 15) / 20) * (-4.79289-(-4.79289)));
            yy = 6.9646 + (((tickAnim - 15) / 20) * (6.9646-(6.9646)));
            zz = -0.70479 + (((tickAnim - 15) / 20) * (-0.70479-(-0.70479)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4.79289 + (((tickAnim - 35) / 15) * (0-(-4.79289)));
            yy = 6.9646 + (((tickAnim - 35) / 15) * (0-(6.9646)));
            zz = -0.70479 + (((tickAnim - 35) / 15) * (0-(-0.70479)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -6.75 + (((tickAnim - 15) / 20) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -6.75 + (((tickAnim - 35) / 15) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (4.04225-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (3.17182-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-0.70925-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 4.04225 + (((tickAnim - 11) / 4) * (-4.78766-(4.04225)));
            yy = 3.17182 + (((tickAnim - 11) / 4) * (4.39175-(3.17182)));
            zz = -0.70925 + (((tickAnim - 11) / 4) * (-0.98204-(-0.70925)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -4.78766 + (((tickAnim - 15) / 20) * (-4.78766-(-4.78766)));
            yy = 4.39175 + (((tickAnim - 15) / 20) * (4.39175-(4.39175)));
            zz = -0.98204 + (((tickAnim - 15) / 20) * (-0.98204-(-0.98204)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -4.78766 + (((tickAnim - 35) / 10) * (-4.09589-(-4.78766)));
            yy = 4.39175 + (((tickAnim - 35) / 10) * (1.46392-(4.39175)));
            zz = -0.98204 + (((tickAnim - 35) / 10) * (-0.32735-(-0.98204)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -4.09589 + (((tickAnim - 45) / 5) * (0-(-4.09589)));
            yy = 1.46392 + (((tickAnim - 45) / 5) * (0-(1.46392)));
            zz = -0.32735 + (((tickAnim - 45) / 5) * (0-(-0.32735)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (14.56525-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (13.05245-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (8.49144-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 14.56525 + (((tickAnim - 11) / 4) * (26.10196-(14.56525)));
            yy = 13.05245 + (((tickAnim - 11) / 4) * (-1.54127-(13.05245)));
            zz = 8.49144 + (((tickAnim - 11) / 4) * (4.87141-(8.49144)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 26.10196 + (((tickAnim - 15) / 2) * (28.60196-(26.10196)));
            yy = -1.54127 + (((tickAnim - 15) / 2) * (-1.54127-(-1.54127)));
            zz = 4.87141 + (((tickAnim - 15) / 2) * (4.87141-(4.87141)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 28.60196 + (((tickAnim - 17) / 3) * (26.10196-(28.60196)));
            yy = -1.54127 + (((tickAnim - 17) / 3) * (-1.54127-(-1.54127)));
            zz = 4.87141 + (((tickAnim - 17) / 3) * (4.87141-(4.87141)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 26.10196 + (((tickAnim - 20) / 15) * (26.10196-(26.10196)));
            yy = -1.54127 + (((tickAnim - 20) / 15) * (-1.54127-(-1.54127)));
            zz = 4.87141 + (((tickAnim - 20) / 15) * (4.87141-(4.87141)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 26.10196 + (((tickAnim - 35) / 6) * (3.75041-(26.10196)));
            yy = -1.54127 + (((tickAnim - 35) / 6) * (-0.67354-(-1.54127)));
            zz = 4.87141 + (((tickAnim - 35) / 6) * (-0.51308-(4.87141)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 3.75041 + (((tickAnim - 41) / 4) * (-12.95432-(3.75041)));
            yy = -0.67354 + (((tickAnim - 41) / 4) * (-0.36739-(-0.67354)));
            zz = -0.51308 + (((tickAnim - 41) / 4) * (-0.27986-(-0.51308)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -12.95432 + (((tickAnim - 45) / 5) * (0-(-12.95432)));
            yy = -0.36739 + (((tickAnim - 45) / 5) * (0-(-0.36739)));
            zz = -0.27986 + (((tickAnim - 45) / 5) * (0-(-0.27986)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (21.73077-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (5.05556-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 21.73077 + (((tickAnim - 11) / 4) * (0-(21.73077)));
            yy = 5.05556 + (((tickAnim - 11) / 4) * (7-(5.05556)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (7.5-(0)));
            yy = 7 + (((tickAnim - 15) / 2) * (7-(7)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 7.5 + (((tickAnim - 17) / 2) * (0-(7.5)));
            yy = 7 + (((tickAnim - 17) / 2) * (7-(7)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (7.5-(0)));
            yy = 7 + (((tickAnim - 19) / 4) * (7-(7)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 7.5 + (((tickAnim - 23) / 12) * (0-(7.5)));
            yy = 7 + (((tickAnim - 23) / 12) * (7-(7)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 35) / 6) * (-1.5-(0)));
            yy = 7 + (((tickAnim - 35) / 6) * (4.27778-(7)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = -1.5 + (((tickAnim - 41) / 4) * (-5.93182-(-1.5)));
            yy = 4.27778 + (((tickAnim - 41) / 4) * (2.33333-(4.27778)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -5.93182 + (((tickAnim - 45) / 5) * (0-(-5.93182)));
            yy = 2.33333 + (((tickAnim - 45) / 5) * (0-(2.33333)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (2.275-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 2.275 + (((tickAnim - 15) / 20) * (2.275-(2.275)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 2.275 + (((tickAnim - 35) / 15) * (0-(2.275)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegL.rotationPointX = this.LegL.rotationPointX + (float)(xx);
        this.LegL.rotationPointY = this.LegL.rotationPointY - (float)(yy);
        this.LegL.rotationPointZ = this.LegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (28.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 28.5 + (((tickAnim - 15) / 20) * (28.5-(28.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 28.5 + (((tickAnim - 35) / 15) * (0-(28.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-43.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -43.5 + (((tickAnim - 15) / 20) * (-43.5-(-43.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -43.5 + (((tickAnim - 35) / 15) * (0-(-43.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 24 + (((tickAnim - 15) / 20) * (24-(24)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 35) / 15) * (0-(24)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-23.36204-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (21.67994-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (5.42653-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -23.36204 + (((tickAnim - 15) / 20) * (-23.36204-(-23.36204)));
            yy = 21.67994 + (((tickAnim - 15) / 20) * (21.67994-(21.67994)));
            zz = 5.42653 + (((tickAnim - 15) / 20) * (5.42653-(5.42653)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -23.36204 + (((tickAnim - 35) / 15) * (0-(-23.36204)));
            yy = 21.67994 + (((tickAnim - 35) / 15) * (0-(21.67994)));
            zz = 5.42653 + (((tickAnim - 35) / 15) * (0-(5.42653)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (38.38-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 38.38 + (((tickAnim - 8) / 7) * (38.25-(38.38)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 38.25 + (((tickAnim - 15) / 20) * (38.25-(38.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 38.25 + (((tickAnim - 35) / 8) * (38.38-(38.25)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 38.38 + (((tickAnim - 43) / 7) * (0-(38.38)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeR, KneeR.rotateAngleX + (float) Math.toRadians(xx), KneeR.rotateAngleY + (float) Math.toRadians(yy), KneeR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-49.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -49.75 + (((tickAnim - 8) / 7) * (-32.5-(-49.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -32.5 + (((tickAnim - 15) / 20) * (-32.5-(-32.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -32.5 + (((tickAnim - 35) / 8) * (-49.75-(-32.5)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -49.75 + (((tickAnim - 43) / 7) * (0-(-49.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalR, MetatarsalR.rotateAngleX + (float) Math.toRadians(xx), MetatarsalR.rotateAngleY + (float) Math.toRadians(yy), MetatarsalR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 34.5 + (((tickAnim - 8) / 7) * (30-(34.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 30 + (((tickAnim - 15) / 20) * (30-(30)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 30 + (((tickAnim - 35) / 8) * (34.5-(30)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 34.5 + (((tickAnim - 43) / 7) * (0-(34.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 6.5 + (((tickAnim - 15) / 20) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 35) / 15) * (0-(6.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 6.75 + (((tickAnim - 15) / 20) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 35) / 15) * (0-(6.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.55759-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (10.58377-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (2.91059-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.55759 + (((tickAnim - 8) / 7) * (8.80759-(0.55759)));
            yy = 10.58377 + (((tickAnim - 8) / 7) * (10.58377-(10.58377)));
            zz = 2.91059 + (((tickAnim - 8) / 7) * (2.91059-(2.91059)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 8.80759 + (((tickAnim - 15) / 20) * (1.37353-(8.80759)));
            yy = 10.58377 + (((tickAnim - 15) / 20) * (-13.20385-(10.58377)));
            zz = 2.91059 + (((tickAnim - 15) / 20) * (-5.6324-(2.91059)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 1.37353 + (((tickAnim - 35) / 15) * (0-(1.37353)));
            yy = -13.20385 + (((tickAnim - 35) / 15) * (0-(-13.20385)));
            zz = -5.6324 + (((tickAnim - 35) / 15) * (0-(-5.6324)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (-5.25-(0)));
            yy = 2 + (((tickAnim - 8) / 7) * (2-(2)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -5.25 + (((tickAnim - 15) / 20) * (0-(-5.25)));
            yy = 2 + (((tickAnim - 15) / 20) * (-10.75-(2)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -10.75 + (((tickAnim - 35) / 15) * (0-(-10.75)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.88507-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (8.41393-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.77338-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.88507 + (((tickAnim - 8) / 7) * (-6.63507-(-0.88507)));
            yy = 8.41393 + (((tickAnim - 8) / 7) * (8.41393-(8.41393)));
            zz = -2.77338 + (((tickAnim - 8) / 7) * (-2.77338-(-2.77338)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -6.63507 + (((tickAnim - 15) / 20) * (-0.8579-(-6.63507)));
            yy = 8.41393 + (((tickAnim - 15) / 20) * (-7.62272-(8.41393)));
            zz = -2.77338 + (((tickAnim - 15) / 20) * (1.12221-(-2.77338)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.8579 + (((tickAnim - 35) / 15) * (0-(-0.8579)));
            yy = -7.62272 + (((tickAnim - 35) / 15) * (0-(-7.62272)));
            zz = 1.12221 + (((tickAnim - 35) / 15) * (0-(1.12221)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamptosaurus entity = (EntityPrehistoricFloraCamptosaurus) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 44) {
            xx = 12.5 + (((tickAnim - 13) / 31) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 13) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 31) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 12.5 + (((tickAnim - 44) / 16) * (0-(12.5)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 44) {
            xx = 5 + (((tickAnim - 13) / 31) * (5-(5)));
            yy = 0 + (((tickAnim - 13) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 31) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 5 + (((tickAnim - 44) / 16) * (0-(5)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -7.5 + (((tickAnim - 30) / 30) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 17.5 + (((tickAnim - 18) / 12) * (22.5-(17.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 44) {
            xx = 22.5 + (((tickAnim - 30) / 14) * (17.5-(22.5)));
            yy = 0 + (((tickAnim - 30) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 14) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 17.5 + (((tickAnim - 44) / 16) * (0-(17.5)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (45-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 16) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 24) * (0-(0)));
            zz = 45 + (((tickAnim - 16) / 24) * (45-(45)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 45 + (((tickAnim - 40) / 20) * (0-(45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(OpposableL, OpposableL.rotateAngleX + (float) Math.toRadians(xx), OpposableL.rotateAngleY + (float) Math.toRadians(yy), OpposableL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 43) {
            xx = -17.5 + (((tickAnim - 12) / 31) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 12) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 31) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 59) {
            xx = -17.5 + (((tickAnim - 43) / 16) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 43) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 43) {
            xx = 25 + (((tickAnim - 12) / 31) * (25-(25)));
            yy = 0 + (((tickAnim - 12) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 31) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 59) {
            xx = 25 + (((tickAnim - 43) / 16) * (0-(25)));
            yy = 0 + (((tickAnim - 43) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(xx), ElbowR.rotateAngleY + (float) Math.toRadians(yy), ElbowR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 43) {
            xx = 27.5 + (((tickAnim - 13) / 30) * (27.5-(27.5)));
            yy = 0 + (((tickAnim - 13) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 30) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 27.5 + (((tickAnim - 43) / 17) * (0-(27.5)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 12.5 + (((tickAnim - 13) / 16) * (-5-(12.5)));
            yy = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 16) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = -5 + (((tickAnim - 29) / 14) * (12.5-(-5)));
            yy = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 14) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 12.5 + (((tickAnim - 43) / 9) * (3.75-(12.5)));
            yy = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 9) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 3.75 + (((tickAnim - 52) / 8) * (0-(3.75)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 12.5 + (((tickAnim - 13) / 16) * (-2.5-(12.5)));
            yy = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 16) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = -2.5 + (((tickAnim - 29) / 14) * (12.5-(-2.5)));
            yy = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 14) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 12.5 + (((tickAnim - 43) / 9) * (1.25-(12.5)));
            yy = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 9) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 1.25 + (((tickAnim - 52) / 8) * (0-(1.25)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 2.5 + (((tickAnim - 13) / 16) * (-15-(2.5)));
            yy = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 16) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = -15 + (((tickAnim - 29) / 14) * (2.5-(-15)));
            yy = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 14) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 2.5 + (((tickAnim - 43) / 9) * (-18.25-(2.5)));
            yy = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 9) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = -18.25 + (((tickAnim - 52) / 8) * (0-(-18.25)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (15-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 29) {
            xx = 15 + (((tickAnim - 16) / 13) * (0-(15)));
            yy = 0 + (((tickAnim - 16) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 13) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 29) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 13) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (15-(0)));
            yy = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 15 + (((tickAnim - 48) / 8) * (0-(15)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamptosaurus entity = (EntityPrehistoricFloraCamptosaurus) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-10.03742-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (4.92385-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.87038-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 51) {
            xx = -10.03742 + (((tickAnim - 11) / 40) * (-10.03742-(-10.03742)));
            yy = 4.92385 + (((tickAnim - 11) / 40) * (4.92385-(4.92385)));
            zz = -0.87038 + (((tickAnim - 11) / 40) * (-0.87038-(-0.87038)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = -10.03742 + (((tickAnim - 51) / 9) * (0-(-10.03742)));
            yy = 4.92385 + (((tickAnim - 51) / 9) * (0-(4.92385)));
            zz = -0.87038 + (((tickAnim - 51) / 9) * (0-(-0.87038)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-5.03858-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (4.92442-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.86381-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 24) {
            xx = -5.03858 + (((tickAnim - 11) / 13) * (-4.5658-(-5.03858)));
            yy = 4.92442 + (((tickAnim - 11) / 13) * (12.66278-(4.92442)));
            zz = 0.86381 + (((tickAnim - 11) / 13) * (1.4452-(0.86381)));
        }
        else if (tickAnim >= 24 && tickAnim < 39) {
            xx = -4.5658 + (((tickAnim - 24) / 15) * (-4.5658-(-4.5658)));
            yy = 12.66278 + (((tickAnim - 24) / 15) * (12.66278-(12.66278)));
            zz = 1.4452 + (((tickAnim - 24) / 15) * (1.4452-(1.4452)));
        }
        else if (tickAnim >= 39 && tickAnim < 51) {
            xx = -4.5658 + (((tickAnim - 39) / 12) * (-5.03858-(-4.5658)));
            yy = 12.66278 + (((tickAnim - 39) / 12) * (4.92442-(12.66278)));
            zz = 1.4452 + (((tickAnim - 39) / 12) * (0.86381-(1.4452)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = -5.03858 + (((tickAnim - 51) / 9) * (0-(-5.03858)));
            yy = 4.92442 + (((tickAnim - 51) / 9) * (0-(4.92442)));
            zz = 0.86381 + (((tickAnim - 51) / 9) * (0-(0.86381)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-45-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -45 + (((tickAnim - 17) / 6) * (-15.58-(-45)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -15.58 + (((tickAnim - 23) / 10) * (-93.26784-(-15.58)));
            yy = 0 + (((tickAnim - 23) / 10) * (20.69318-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (11.13797-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -93.26784 + (((tickAnim - 33) / 7) * (-93.26784-(-93.26784)));
            yy = 20.69318 + (((tickAnim - 33) / 7) * (20.69318-(20.69318)));
            zz = 11.13797 + (((tickAnim - 33) / 7) * (11.13797-(11.13797)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -93.26784 + (((tickAnim - 40) / 20) * (0-(-93.26784)));
            yy = 20.69318 + (((tickAnim - 40) / 20) * (0-(20.69318)));
            zz = 11.13797 + (((tickAnim - 40) / 20) * (0-(11.13797)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 22.5 + (((tickAnim - 17) / 6) * (4.04-(22.5)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 4.04 + (((tickAnim - 23) / 10) * (23.03-(4.04)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 23.03 + (((tickAnim - 33) / 7) * (23.03-(23.03)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 23.03 + (((tickAnim - 40) / 20) * (0-(23.03)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(xx), ElbowR.rotateAngleY + (float) Math.toRadians(yy), ElbowR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-15-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 17) / 43) * (0-(0)));
            yy = -15 + (((tickAnim - 17) / 43) * (0-(-15)));
            zz = 0 + (((tickAnim - 17) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (-47.5-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 17) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 30) * (0-(0)));
            zz = -47.5 + (((tickAnim - 17) / 30) * (-47.5-(-47.5)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = -47.5 + (((tickAnim - 47) / 13) * (0-(-47.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(OpposableR, OpposableR.rotateAngleX + (float) Math.toRadians(xx), OpposableR.rotateAngleY + (float) Math.toRadians(yy), OpposableR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 12.5 + (((tickAnim - 11) / 5) * (17.65989-(12.5)));
            yy = 0 + (((tickAnim - 11) / 5) * (5.48865-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (1.24468-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 17.65989 + (((tickAnim - 16) / 8) * (12.92638-(17.65989)));
            yy = 5.48865 + (((tickAnim - 16) / 8) * (14.63639-(5.48865)));
            zz = 1.24468 + (((tickAnim - 16) / 8) * (3.31914-(1.24468)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 12.92638 + (((tickAnim - 24) / 9) * (12.18922-(12.92638)));
            yy = 14.63639 + (((tickAnim - 24) / 9) * (-0.95308-(14.63639)));
            zz = 3.31914 + (((tickAnim - 24) / 9) * (-0.12924-(3.31914)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 12.18922 + (((tickAnim - 33) / 6) * (12.92638-(12.18922)));
            yy = -0.95308 + (((tickAnim - 33) / 6) * (14.63639-(-0.95308)));
            zz = -0.12924 + (((tickAnim - 33) / 6) * (3.31914-(-0.12924)));
        }
        else if (tickAnim >= 39 && tickAnim < 51) {
            xx = 12.92638 + (((tickAnim - 39) / 12) * (12.5-(12.92638)));
            yy = 14.63639 + (((tickAnim - 39) / 12) * (0-(14.63639)));
            zz = 3.31914 + (((tickAnim - 39) / 12) * (0-(3.31914)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 12.5 + (((tickAnim - 51) / 9) * (0-(12.5)));
            yy = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 12.5 + (((tickAnim - 11) / 6) * (11.50394-(12.5)));
            yy = 0 + (((tickAnim - 11) / 6) * (12.06421-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (-3.20693-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 11.50394 + (((tickAnim - 17) / 7) * (1.50394-(11.50394)));
            yy = 12.06421 + (((tickAnim - 17) / 7) * (12.06421-(12.06421)));
            zz = -3.20693 + (((tickAnim - 17) / 7) * (-3.20693-(-3.20693)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 1.50394 + (((tickAnim - 24) / 9) * (13.53097-(1.50394)));
            yy = 12.06421 + (((tickAnim - 24) / 9) * (23.63841-(12.06421)));
            zz = -3.20693 + (((tickAnim - 24) / 9) * (1.84592-(-3.20693)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 13.53097 + (((tickAnim - 33) / 6) * (11.50394-(13.53097)));
            yy = 23.63841 + (((tickAnim - 33) / 6) * (12.06421-(23.63841)));
            zz = 1.84592 + (((tickAnim - 33) / 6) * (-3.20693-(1.84592)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 11.50394 + (((tickAnim - 39) / 6) * (7.25105-(11.50394)));
            yy = 12.06421 + (((tickAnim - 39) / 6) * (5.01563-(12.06421)));
            zz = -3.20693 + (((tickAnim - 39) / 6) * (-0.03998-(-3.20693)));
        }
        else if (tickAnim >= 45 && tickAnim < 52) {
            xx = 7.25105 + (((tickAnim - 45) / 7) * (12.5-(7.25105)));
            yy = 5.01563 + (((tickAnim - 45) / 7) * (0-(5.01563)));
            zz = -0.03998 + (((tickAnim - 45) / 7) * (0-(-0.03998)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 12.5 + (((tickAnim - 52) / 8) * (0-(12.5)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 7.5 + (((tickAnim - 11) / 6) * (-2.34435-(7.5)));
            yy = 0 + (((tickAnim - 11) / 6) * (7.15787-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (-1.41719-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -2.34435 + (((tickAnim - 17) / 7) * (-12.34435-(-2.34435)));
            yy = 7.15787 + (((tickAnim - 17) / 7) * (7.15787-(7.15787)));
            zz = -1.41719 + (((tickAnim - 17) / 7) * (-1.41719-(-1.41719)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -12.34435 + (((tickAnim - 24) / 9) * (7.11027-(-12.34435)));
            yy = 7.15787 + (((tickAnim - 24) / 9) * (21.15396-(7.15787)));
            zz = -1.41719 + (((tickAnim - 24) / 9) * (-7.06544-(-1.41719)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 7.11027 + (((tickAnim - 33) / 6) * (7.65565-(7.11027)));
            yy = 21.15396 + (((tickAnim - 33) / 6) * (7.15787-(21.15396)));
            zz = -7.06544 + (((tickAnim - 33) / 6) * (-1.41719-(-7.06544)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 7.65565 + (((tickAnim - 39) / 6) * (0.06226-(7.65565)));
            yy = 7.15787 + (((tickAnim - 39) / 6) * (2.86315-(7.15787)));
            zz = -1.41719 + (((tickAnim - 39) / 6) * (-0.56688-(-1.41719)));
        }
        else if (tickAnim >= 45 && tickAnim < 52) {
            xx = 0.06226 + (((tickAnim - 45) / 7) * (7.5-(0.06226)));
            yy = 2.86315 + (((tickAnim - 45) / 7) * (0-(2.86315)));
            zz = -0.56688 + (((tickAnim - 45) / 7) * (0-(-0.56688)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 7.5 + (((tickAnim - 52) / 8) * (0-(7.5)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = -5 + (((tickAnim - 11) / 6) * (-4.76948-(-5)));
            yy = 0 + (((tickAnim - 11) / 6) * (8.83168-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (-4.67179-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -4.76948 + (((tickAnim - 17) / 7) * (10.23052-(-4.76948)));
            yy = 8.83168 + (((tickAnim - 17) / 7) * (8.83168-(8.83168)));
            zz = -4.67179 + (((tickAnim - 17) / 7) * (-4.67179-(-4.67179)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 10.23052 + (((tickAnim - 24) / 8) * (-4.76948-(10.23052)));
            yy = 8.83168 + (((tickAnim - 24) / 8) * (8.83168-(8.83168)));
            zz = -4.67179 + (((tickAnim - 24) / 8) * (-4.67179-(-4.67179)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = -4.76948 + (((tickAnim - 32) / 7) * (-4.76948-(-4.76948)));
            yy = 8.83168 + (((tickAnim - 32) / 7) * (8.83168-(8.83168)));
            zz = -4.67179 + (((tickAnim - 32) / 7) * (-4.67179-(-4.67179)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -4.76948 + (((tickAnim - 39) / 6) * (17.59221-(-4.76948)));
            yy = 8.83168 + (((tickAnim - 39) / 6) * (3.53267-(8.83168)));
            zz = -4.67179 + (((tickAnim - 39) / 6) * (-1.86872-(-4.67179)));
        }
        else if (tickAnim >= 45 && tickAnim < 52) {
            xx = 17.59221 + (((tickAnim - 45) / 7) * (-5-(17.59221)));
            yy = 3.53267 + (((tickAnim - 45) / 7) * (0-(3.53267)));
            zz = -1.86872 + (((tickAnim - 45) / 7) * (0-(-1.86872)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = -5 + (((tickAnim - 52) / 8) * (0-(-5)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 32) {
            xx = -10 + (((tickAnim - 11) / 21) * (7.5-(-10)));
            yy = 0 + (((tickAnim - 11) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 21) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 7.5 + (((tickAnim - 32) / 7) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 7.5 + (((tickAnim - 39) / 6) * (-0.88-(7.5)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 52) {
            xx = -0.88 + (((tickAnim - 45) / 7) * (-10-(-0.88)));
            yy = 0 + (((tickAnim - 45) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 7) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = -10 + (((tickAnim - 52) / 8) * (0-(-10)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (15-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 15 + (((tickAnim - 42) / 2) * (0-(15)));
            yy = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamptosaurus entity = (EntityPrehistoricFloraCamptosaurus) entitylivingbaseIn;

        int animCycle = 70;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 26) {
            xx = -7.5 + (((tickAnim - 11) / 15) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 11) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 15) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -7.5 + (((tickAnim - 26) / 6) * (2.26355-(-7.5)));
            yy = 0 + (((tickAnim - 26) / 6) * (7.31588-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (1.12336-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = 2.26355 + (((tickAnim - 32) / 11) * (-0.52115-(2.26355)));
            yy = 7.31588 + (((tickAnim - 32) / 11) * (22.55593-(7.31588)));
            zz = 1.12336 + (((tickAnim - 32) / 11) * (3.46349-(1.12336)));
        }
        else if (tickAnim >= 43 && tickAnim < 59) {
            xx = -0.52115 + (((tickAnim - 43) / 16) * (-0.52115-(-0.52115)));
            yy = 22.55593 + (((tickAnim - 43) / 16) * (22.55593-(22.55593)));
            zz = 3.46349 + (((tickAnim - 43) / 16) * (3.46349-(3.46349)));
        }
        else if (tickAnim >= 59 && tickAnim < 70) {
            xx = -0.52115 + (((tickAnim - 59) / 11) * (0-(-0.52115)));
            yy = 22.55593 + (((tickAnim - 59) / 11) * (0-(22.55593)));
            zz = 3.46349 + (((tickAnim - 59) / 11) * (0-(3.46349)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (13.19-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 13.19 + (((tickAnim - 6) / 5) * (10-(13.19)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 10 + (((tickAnim - 11) / 6) * (5.35552-(10)));
            yy = 0 + (((tickAnim - 11) / 6) * (-0.21619-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0.07676-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 5.35552 + (((tickAnim - 17) / 3) * (9.6885-(5.35552)));
            yy = -0.21619 + (((tickAnim - 17) / 3) * (-0.36601-(-0.21619)));
            zz = 0.07676 + (((tickAnim - 17) / 3) * (0.12996-(0.07676)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 9.6885 + (((tickAnim - 20) / 6) * (10-(9.6885)));
            yy = -0.36601 + (((tickAnim - 20) / 6) * (0-(-0.36601)));
            zz = 0.12996 + (((tickAnim - 20) / 6) * (0-(0.12996)));
        }
        else if (tickAnim >= 26 && tickAnim < 43) {
            xx = 10 + (((tickAnim - 26) / 17) * (-2.91473-(10)));
            yy = 0 + (((tickAnim - 26) / 17) * (4.74967-(0)));
            zz = 0 + (((tickAnim - 26) / 17) * (-1.68648-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = -2.91473 + (((tickAnim - 43) / 5) * (3.55898-(-2.91473)));
            yy = 4.74967 + (((tickAnim - 43) / 5) * (5.23433-(4.74967)));
            zz = -1.68648 + (((tickAnim - 43) / 5) * (-1.85857-(-1.68648)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 3.55898 + (((tickAnim - 48) / 5) * (-6.95544-(3.55898)));
            yy = 5.23433 + (((tickAnim - 48) / 5) * (5.31915-(5.23433)));
            zz = -1.85857 + (((tickAnim - 48) / 5) * (-1.88869-(-1.85857)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = -6.95544 + (((tickAnim - 53) / 6) * (-2.91473-(-6.95544)));
            yy = 5.31915 + (((tickAnim - 53) / 6) * (4.74967-(5.31915)));
            zz = -1.88869 + (((tickAnim - 53) / 6) * (-1.68648-(-1.88869)));
        }
        else if (tickAnim >= 59 && tickAnim < 62) {
            xx = -2.91473 + (((tickAnim - 59) / 3) * (-4.36574-(-2.91473)));
            yy = 4.74967 + (((tickAnim - 59) / 3) * (3.4824-(4.74967)));
            zz = -1.68648 + (((tickAnim - 59) / 3) * (-1.23651-(-1.68648)));
        }
        else if (tickAnim >= 62 && tickAnim < 70) {
            xx = -4.36574 + (((tickAnim - 62) / 8) * (0-(-4.36574)));
            yy = 3.4824 + (((tickAnim - 62) / 8) * (0-(3.4824)));
            zz = -1.23651 + (((tickAnim - 62) / 8) * (0-(-1.23651)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (5.35-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 5.35 + (((tickAnim - 6) / 5) * (5-(5.35)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 5 + (((tickAnim - 11) / 3) * (0.12631-(5)));
            yy = 0 + (((tickAnim - 11) / 3) * (0.07333-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (-0.05105-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0.12631 + (((tickAnim - 14) / 5) * (7.14597-(0.12631)));
            yy = 0.07333 + (((tickAnim - 14) / 5) * (0.16955-(0.07333)));
            zz = -0.05105 + (((tickAnim - 14) / 5) * (-0.11803-(-0.05105)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 7.14597 + (((tickAnim - 19) / 4) * (-0.43269-(7.14597)));
            yy = 0.16955 + (((tickAnim - 19) / 4) * (0.22013-(0.16955)));
            zz = -0.11803 + (((tickAnim - 19) / 4) * (-0.15324-(-0.11803)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -0.43269 + (((tickAnim - 23) / 3) * (5-(-0.43269)));
            yy = 0.22013 + (((tickAnim - 23) / 3) * (0-(0.22013)));
            zz = -0.15324 + (((tickAnim - 23) / 3) * (0-(-0.15324)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 5 + (((tickAnim - 26) / 9) * (21.63979-(5)));
            yy = 0 + (((tickAnim - 26) / 9) * (-1.70256-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (1.18521-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 21.63979 + (((tickAnim - 35) / 8) * (0.35816-(21.63979)));
            yy = -1.70256 + (((tickAnim - 35) / 8) * (-2.2376-(-1.70256)));
            zz = 1.18521 + (((tickAnim - 35) / 8) * (1.55768-(1.18521)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 0.35816 + (((tickAnim - 43) / 5) * (6.30232-(0.35816)));
            yy = -2.2376 + (((tickAnim - 43) / 5) * (-2.36883-(-2.2376)));
            zz = 1.55768 + (((tickAnim - 43) / 5) * (1.64903-(1.55768)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 6.30232 + (((tickAnim - 48) / 5) * (14.16935-(6.30232)));
            yy = -2.36883 + (((tickAnim - 48) / 5) * (-2.44408-(-2.36883)));
            zz = 1.64903 + (((tickAnim - 48) / 5) * (1.70141-(1.64903)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = 14.16935 + (((tickAnim - 53) / 6) * (0.35816-(14.16935)));
            yy = -2.44408 + (((tickAnim - 53) / 6) * (-2.2376-(-2.44408)));
            zz = 1.70141 + (((tickAnim - 53) / 6) * (1.55768-(1.70141)));
        }
        else if (tickAnim >= 59 && tickAnim < 64) {
            xx = 0.35816 + (((tickAnim - 59) / 5) * (-5.68412-(0.35816)));
            yy = -2.2376 + (((tickAnim - 59) / 5) * (-1.1059-(-2.2376)));
            zz = 1.55768 + (((tickAnim - 59) / 5) * (0.76985-(1.55768)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = -5.68412 + (((tickAnim - 64) / 6) * (0-(-5.68412)));
            yy = -1.1059 + (((tickAnim - 64) / 6) * (0-(-1.1059)));
            zz = 0.76985 + (((tickAnim - 64) / 6) * (0-(0.76985)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 26) {
            xx = -2.5 + (((tickAnim - 11) / 15) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 11) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 15) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 43) {
            xx = -2.5 + (((tickAnim - 26) / 17) * (-1.42366-(-2.5)));
            yy = 0 + (((tickAnim - 26) / 17) * (12.55475-(0)));
            zz = 0 + (((tickAnim - 26) / 17) * (-0.39275-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 59) {
            xx = -1.42366 + (((tickAnim - 43) / 16) * (-1.42366-(-1.42366)));
            yy = 12.55475 + (((tickAnim - 43) / 16) * (12.55475-(12.55475)));
            zz = -0.39275 + (((tickAnim - 43) / 16) * (-0.39275-(-0.39275)));
        }
        else if (tickAnim >= 59 && tickAnim < 66) {
            xx = -1.42366 + (((tickAnim - 59) / 7) * (-8.0353-(-1.42366)));
            yy = 12.55475 + (((tickAnim - 59) / 7) * (4.72059-(12.55475)));
            zz = -0.39275 + (((tickAnim - 59) / 7) * (-0.14767-(-0.39275)));
        }
        else if (tickAnim >= 66 && tickAnim < 70) {
            xx = -8.0353 + (((tickAnim - 66) / 4) * (0-(-8.0353)));
            yy = 4.72059 + (((tickAnim - 66) / 4) * (0-(4.72059)));
            zz = -0.14767 + (((tickAnim - 66) / 4) * (0-(-0.14767)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -5 + (((tickAnim - 14) / 5) * (-4-(-5)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -4 + (((tickAnim - 19) / 4) * (-5-(-4)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -5 + (((tickAnim - 23) / 6) * (0-(-5)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 14) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 43) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = -5 + (((tickAnim - 48) / 3) * (-4-(-5)));
            yy = 0 + (((tickAnim - 48) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 3) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
            xx = -4 + (((tickAnim - 51) / 4) * (-5-(-4)));
            yy = 0 + (((tickAnim - 51) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 4) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -5 + (((tickAnim - 55) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (15-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 15 + (((tickAnim - 14) / 5) * (12.05-(15)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 12.05 + (((tickAnim - 19) / 4) * (11.89-(12.05)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 11.89 + (((tickAnim - 23) / 6) * (0-(11.89)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 14) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 43) / 5) * (15-(0)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 15 + (((tickAnim - 48) / 3) * (12.05-(15)));
            yy = 0 + (((tickAnim - 48) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 3) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
            xx = 12.05 + (((tickAnim - 51) / 4) * (11.89-(12.05)));
            yy = 0 + (((tickAnim - 51) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 4) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 11.89 + (((tickAnim - 55) / 5) * (0-(11.89)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamptosaurus entity = (EntityPrehistoricFloraCamptosaurus) entitylivingbaseIn;

        int animCycle = 70;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (6.56727-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-6.67614-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.70286-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 6.56727 + (((tickAnim - 6) / 5) * (5.12076-(6.56727)));
            yy = -6.67614 + (((tickAnim - 6) / 5) * (-12.45167-(-6.67614)));
            zz = -0.70286 + (((tickAnim - 6) / 5) * (-1.10693-(-0.70286)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 5.12076 + (((tickAnim - 11) / 12) * (-13.72548-(5.12076)));
            yy = -12.45167 + (((tickAnim - 11) / 12) * (-14.65806-(-12.45167)));
            zz = -1.10693 + (((tickAnim - 11) / 12) * (0.33145-(-1.10693)));
        }
        else if (tickAnim >= 23 && tickAnim < 41) {
            xx = -13.72548 + (((tickAnim - 23) / 18) * (-19.738-(-13.72548)));
            yy = -14.65806 + (((tickAnim - 23) / 18) * (-0.88362-(-14.65806)));
            zz = 0.33145 + (((tickAnim - 23) / 18) * (-2.37143-(0.33145)));
        }
        else if (tickAnim >= 41 && tickAnim < 59) {
            xx = -19.738 + (((tickAnim - 41) / 18) * (-0.21379-(-19.738)));
            yy = -0.88362 + (((tickAnim - 41) / 18) * (5.76348-(-0.88362)));
            zz = -2.37143 + (((tickAnim - 41) / 18) * (-2.94689-(-2.37143)));
        }
        else if (tickAnim >= 59 && tickAnim < 70) {
            xx = -0.21379 + (((tickAnim - 59) / 11) * (0-(-0.21379)));
            yy = 5.76348 + (((tickAnim - 59) / 11) * (0-(5.76348)));
            zz = -2.94689 + (((tickAnim - 59) / 11) * (0-(-2.94689)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 5 + (((tickAnim - 11) / 5) * (9.69-(5)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 9.69 + (((tickAnim - 16) / 7) * (-3.57-(9.69)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 41) {
            xx = -3.57 + (((tickAnim - 23) / 18) * (-4.73-(-3.57)));
            yy = 0 + (((tickAnim - 23) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 18) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = -4.73 + (((tickAnim - 41) / 7) * (-4.37-(-4.73)));
            yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 59) {
            xx = -4.37 + (((tickAnim - 48) / 11) * (8.27-(-4.37)));
            yy = 0 + (((tickAnim - 48) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 11) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 70) {
            xx = 8.27 + (((tickAnim - 59) / 11) * (0-(8.27)));
            yy = 0 + (((tickAnim - 59) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 31) {
            xx = -32.5 + (((tickAnim - 13) / 18) * (-2.04-(-32.5)));
            yy = 0 + (((tickAnim - 13) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 18) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 70) {
            xx = -2.04 + (((tickAnim - 31) / 39) * (0-(-2.04)));
            yy = 0 + (((tickAnim - 31) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 31) {
            xx = 37.5 + (((tickAnim - 13) / 18) * (27.93-(37.5)));
            yy = 0 + (((tickAnim - 13) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 18) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 70) {
            xx = 27.93 + (((tickAnim - 31) / 39) * (0-(27.93)));
            yy = 0 + (((tickAnim - 31) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 37) {
            xx = -32.5 + (((tickAnim - 18) / 19) * (-2.04-(-32.5)));
            yy = 0 + (((tickAnim - 18) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 19) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 70) {
            xx = -2.04 + (((tickAnim - 37) / 33) * (0-(-2.04)));
            yy = 0 + (((tickAnim - 37) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 37) {
            xx = 37.5 + (((tickAnim - 18) / 19) * (27.93-(37.5)));
            yy = 0 + (((tickAnim - 18) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 19) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 70) {
            xx = 27.93 + (((tickAnim - 37) / 33) * (0-(27.93)));
            yy = 0 + (((tickAnim - 37) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(xx), ElbowR.rotateAngleY + (float) Math.toRadians(yy), ElbowR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 15 + (((tickAnim - 11) / 5) * (23.88-(15)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 23.88 + (((tickAnim - 16) / 7) * (-3.2-(23.88)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 59) {
            xx = -3.2 + (((tickAnim - 23) / 36) * (4.27-(-3.2)));
            yy = 0 + (((tickAnim - 23) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 36) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 70) {
            xx = 4.27 + (((tickAnim - 59) / 11) * (0-(4.27)));
            yy = 0 + (((tickAnim - 59) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 27.5 + (((tickAnim - 11) / 5) * (25.29-(27.5)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 25.29 + (((tickAnim - 16) / 7) * (-4.63-(25.29)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 42) {
            xx = -4.63 + (((tickAnim - 23) / 19) * (-12.8-(-4.63)));
            yy = 0 + (((tickAnim - 23) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 19) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = -12.8 + (((tickAnim - 42) / 6) * (-8.37-(-12.8)));
            yy = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 59) {
            xx = -8.37 + (((tickAnim - 48) / 11) * (20.14-(-8.37)));
            yy = 0 + (((tickAnim - 48) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 11) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 70) {
            xx = 20.14 + (((tickAnim - 59) / 11) * (0-(20.14)));
            yy = 0 + (((tickAnim - 59) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 42) {
            xx = -7.5 + (((tickAnim - 23) / 19) * (5.47-(-7.5)));
            yy = 0 + (((tickAnim - 23) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 19) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 5.47 + (((tickAnim - 42) / 11) * (-10.52-(5.47)));
            yy = 0 + (((tickAnim - 42) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 11) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = -10.52 + (((tickAnim - 53) / 6) * (-0.47-(-10.52)));
            yy = 0 + (((tickAnim - 53) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 70) {
            xx = -0.47 + (((tickAnim - 59) / 11) * (0-(-0.47)));
            yy = 0 + (((tickAnim - 59) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 27) {
            xx = 7.5 + (((tickAnim - 12) / 15) * (-9.5-(7.5)));
            yy = 0 + (((tickAnim - 12) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 15) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 48) {
            xx = -9.5 + (((tickAnim - 27) / 21) * (5.25-(-9.5)));
            yy = 0 + (((tickAnim - 27) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 21) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 59) {
            xx = 5.25 + (((tickAnim - 48) / 11) * (-12.08-(5.25)));
            yy = 0 + (((tickAnim - 48) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 11) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 70) {
            xx = -12.08 + (((tickAnim - 59) / 11) * (0-(-12.08)));
            yy = 0 + (((tickAnim - 59) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 53) {
            xx = -17.5 + (((tickAnim - 23) / 30) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 23) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 30) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 70) {
            xx = -17.5 + (((tickAnim - 53) / 17) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 53) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 12.5 + (((tickAnim - 5) / 9) * (0-(12.5)));
            yy = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 14) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animIdle1(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamptosaurus entity = (EntityPrehistoricFloraCamptosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -2.5 + (((tickAnim - 10) / 5) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (2.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (2.5-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 2.5 + (((tickAnim - 15) / 5) * (0-(2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 2.5 + (((tickAnim - 20) / 4) * (0.41508-(2.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0.03631-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (-4.99987-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0.41508 + (((tickAnim - 24) / 6) * (-2.5-(0.41508)));
            yy = 0.03631 + (((tickAnim - 24) / 6) * (0-(0.03631)));
            zz = -4.99987 + (((tickAnim - 24) / 6) * (0-(-4.99987)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 30) / 10) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.98448-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (7.43547-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-7.56397-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -0.98448 + (((tickAnim - 10) / 6) * (-1.30962-(-0.98448)));
            yy = 7.43547 + (((tickAnim - 10) / 6) * (7.38542-(7.43547)));
            zz = -7.56397 + (((tickAnim - 10) / 6) * (-10.08453-(-7.56397)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -1.30962 + (((tickAnim - 16) / 5) * (-0.5415-(-1.30962)));
            yy = 7.38542 + (((tickAnim - 16) / 5) * (7.47889-(7.38542)));
            zz = -10.08453 + (((tickAnim - 16) / 5) * (-4.15301-(-10.08453)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -0.5415 + (((tickAnim - 21) / 4) * (4.25715-(-0.5415)));
            yy = 7.47889 + (((tickAnim - 21) / 4) * (7.45916-(7.47889)));
            zz = -4.15301 + (((tickAnim - 21) / 4) * (-5.70344-(-4.15301)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 4.25715 + (((tickAnim - 25) / 5) * (-0.98448-(4.25715)));
            yy = 7.45916 + (((tickAnim - 25) / 5) * (7.43547-(7.45916)));
            zz = -5.70344 + (((tickAnim - 25) / 5) * (-7.56397-(-5.70344)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -0.98448 + (((tickAnim - 30) / 5) * (-5.49224-(-0.98448)));
            yy = 7.43547 + (((tickAnim - 30) / 5) * (3.71774-(7.43547)));
            zz = -7.56397 + (((tickAnim - 30) / 5) * (-3.78199-(-7.56397)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5.49224 + (((tickAnim - 35) / 5) * (0-(-5.49224)));
            yy = 3.71774 + (((tickAnim - 35) / 5) * (0-(3.71774)));
            zz = -3.78199 + (((tickAnim - 35) / 5) * (0-(-3.78199)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (4.72688-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (3.41171-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-2.88731-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 4.72688 + (((tickAnim - 4) / 6) * (-0.4682-(4.72688)));
            yy = 3.41171 + (((tickAnim - 4) / 6) * (5.84865-(3.41171)));
            zz = -2.88731 + (((tickAnim - 4) / 6) * (-4.94968-(-2.88731)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -0.4682 + (((tickAnim - 10) / 4) * (2.0318-(-0.4682)));
            yy = 5.84865 + (((tickAnim - 10) / 4) * (5.84865-(5.84865)));
            zz = -4.94968 + (((tickAnim - 10) / 4) * (-4.94968-(-4.94968)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 2.0318 + (((tickAnim - 14) / 4) * (1.61414-(2.0318)));
            yy = 5.84865 + (((tickAnim - 14) / 4) * (5.3504-(5.84865)));
            zz = -4.94968 + (((tickAnim - 14) / 4) * (-2.48807-(-4.94968)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1.61414 + (((tickAnim - 18) / 5) * (-4.12956-(1.61414)));
            yy = 5.3504 + (((tickAnim - 18) / 5) * (5.52835-(5.3504)));
            zz = -2.48807 + (((tickAnim - 18) / 5) * (-3.36722-(-2.48807)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -4.12956 + (((tickAnim - 23) / 3) * (-0.4091-(-4.12956)));
            yy = 5.52835 + (((tickAnim - 23) / 3) * (5.63511-(5.52835)));
            zz = -3.36722 + (((tickAnim - 23) / 3) * (-3.89471-(-3.36722)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -0.4091 + (((tickAnim - 26) / 4) * (-0.4682-(-0.4091)));
            yy = 5.63511 + (((tickAnim - 26) / 4) * (5.84865-(5.63511)));
            zz = -3.89471 + (((tickAnim - 26) / 4) * (-4.94968-(-3.89471)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -0.4682 + (((tickAnim - 30) / 10) * (0-(-0.4682)));
            yy = 5.84865 + (((tickAnim - 30) / 10) * (0-(5.84865)));
            zz = -4.94968 + (((tickAnim - 30) / 10) * (0-(-4.94968)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-4.375-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 6) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = -4.375 + (((tickAnim - 6) / 4) * (-7.5-(-4.375)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -7.5 + (((tickAnim - 10) / 3) * (2.5-(-7.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (5-(0)));
            zz = 2.5 + (((tickAnim - 13) / 5) * (0-(2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -2.5 + (((tickAnim - 18) / 3) * (-2.44252-(-2.5)));
            yy = 5 + (((tickAnim - 18) / 3) * (3.29266-(5)));
            zz = 0 + (((tickAnim - 18) / 3) * (-12.01153-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -2.44252 + (((tickAnim - 21) / 2) * (0.72362-(-2.44252)));
            yy = 3.29266 + (((tickAnim - 21) / 2) * (2.39466-(3.29266)));
            zz = -12.01153 + (((tickAnim - 21) / 2) * (-10.78111-(-12.01153)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0.72362 + (((tickAnim - 23) / 3) * (0.38653-(0.72362)));
            yy = 2.39466 + (((tickAnim - 23) / 3) * (1.51497-(2.39466)));
            zz = -10.78111 + (((tickAnim - 23) / 3) * (-12.05149-(-10.78111)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0.38653 + (((tickAnim - 26) / 2) * (-2.26808-(0.38653)));
            yy = 1.51497 + (((tickAnim - 26) / 2) * (0.90898-(1.51497)));
            zz = -12.05149 + (((tickAnim - 26) / 2) * (-10.23089-(-12.05149)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -2.26808 + (((tickAnim - 28) / 2) * (0-(-2.26808)));
            yy = 0.90898 + (((tickAnim - 28) / 2) * (0-(0.90898)));
            zz = -10.23089 + (((tickAnim - 28) / 2) * (-7.5-(-10.23089)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = -7.5 + (((tickAnim - 30) / 5) * (-3.75-(-7.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 35) / 5) * (0-(5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = -3.75 + (((tickAnim - 35) / 5) * (0-(-3.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (5.83333-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 4) / 6) * (0-(-5)));
            yy = 5.83333 + (((tickAnim - 4) / 6) * (10-(5.83333)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-1.5908-(0)));
            yy = 10 + (((tickAnim - 10) / 3) * (8.29433-(10)));
            zz = 0 + (((tickAnim - 10) / 3) * (-9.9811-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -1.5908 + (((tickAnim - 13) / 3) * (3.71221-(-1.5908)));
            yy = 8.29433 + (((tickAnim - 13) / 3) * (8.61922-(8.29433)));
            zz = -9.9811 + (((tickAnim - 13) / 3) * (-8.07993-(-9.9811)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 3.71221 + (((tickAnim - 16) / 4) * (-12.37962-(3.71221)));
            yy = 8.61922 + (((tickAnim - 16) / 4) * (9.02533-(8.61922)));
            zz = -8.07993 + (((tickAnim - 16) / 4) * (-5.70348-(-8.07993)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -12.37962 + (((tickAnim - 20) / 4) * (-20.79276-(-12.37962)));
            yy = 9.02533 + (((tickAnim - 20) / 4) * (4.53447-(9.02533)));
            zz = -5.70348 + (((tickAnim - 20) / 4) * (-12.11404-(-5.70348)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -20.79276 + (((tickAnim - 24) / 3) * (-21.88158-(-20.79276)));
            yy = 4.53447 + (((tickAnim - 24) / 3) * (6.87684-(4.53447)));
            zz = -12.11404 + (((tickAnim - 24) / 3) * (-6.92231-(-12.11404)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -21.88158 + (((tickAnim - 27) / 3) * (0-(-21.88158)));
            yy = 6.87684 + (((tickAnim - 27) / 3) * (10-(6.87684)));
            zz = -6.92231 + (((tickAnim - 27) / 3) * (0-(-6.92231)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 10 + (((tickAnim - 30) / 10) * (0-(10)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 2.5 + (((tickAnim - 10) / 4) * (2.5-(2.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -7.5 + (((tickAnim - 14) / 3) * (-6.29914-(-7.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (0.80609-(0)));
            zz = 2.5 + (((tickAnim - 14) / 3) * (4.86656-(2.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -6.29914 + (((tickAnim - 17) / 3) * (-4.66107-(-6.29914)));
            yy = 0.80609 + (((tickAnim - 17) / 3) * (-1.61523-(0.80609)));
            zz = 4.86656 + (((tickAnim - 17) / 3) * (-2.88978-(4.86656)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -4.66107 + (((tickAnim - 20) / 3) * (9.28646-(-4.66107)));
            yy = -1.61523 + (((tickAnim - 20) / 3) * (-3.26313-(-1.61523)));
            zz = -2.88978 + (((tickAnim - 20) / 3) * (-8.76215-(-2.88978)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 9.28646 + (((tickAnim - 23) / 3) * (4.98657-(9.28646)));
            yy = -3.26313 + (((tickAnim - 23) / 3) * (-0.84199-(-3.26313)));
            zz = -8.76215 + (((tickAnim - 23) / 3) * (3.68224-(-8.76215)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 4.98657 + (((tickAnim - 26) / 4) * (0-(4.98657)));
            yy = -0.84199 + (((tickAnim - 26) / 4) * (0-(-0.84199)));
            zz = 3.68224 + (((tickAnim - 26) / 4) * (2.5-(3.68224)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 2.5 + (((tickAnim - 30) / 10) * (0-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (10-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 10 + (((tickAnim - 14) / 5) * (4.34-(10)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 4.34 + (((tickAnim - 19) / 5) * (12.34-(4.34)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 12.34 + (((tickAnim - 24) / 6) * (0-(12.34)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-87.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -87.5 + (((tickAnim - 10) / 20) * (-87.5-(-87.5)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -87.5 + (((tickAnim - 30) / 10) * (0-(-87.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 17.5 + (((tickAnim - 5) / 5) * (0-(17.5)));
            yy = -5 + (((tickAnim - 5) / 5) * (-10-(-5)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-10-(0)));
            yy = -10 + (((tickAnim - 10) / 3) * (-10-(-10)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -10 + (((tickAnim - 13) / 2) * (0-(-10)));
            yy = -10 + (((tickAnim - 13) / 2) * (-10-(-10)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-10-(0)));
            yy = -10 + (((tickAnim - 15) / 3) * (-10-(-10)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 18) / 2) * (0-(-10)));
            yy = -10 + (((tickAnim - 18) / 2) * (-10-(-10)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (-10-(0)));
            yy = -10 + (((tickAnim - 20) / 3) * (-10-(-10)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -10 + (((tickAnim - 23) / 2) * (0-(-10)));
            yy = -10 + (((tickAnim - 23) / 2) * (-10-(-10)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (-10-(0)));
            yy = -10 + (((tickAnim - 25) / 3) * (-10-(-10)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 28) / 2) * (0-(-10)));
            yy = -10 + (((tickAnim - 28) / 2) * (-10-(-10)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (-15-(0)));
            yy = -10 + (((tickAnim - 30) / 5) * (-5-(-10)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -15 + (((tickAnim - 35) / 5) * (0-(-15)));
            yy = -5 + (((tickAnim - 35) / 5) * (0-(-5)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(xx), ElbowR.rotateAngleY + (float) Math.toRadians(yy), ElbowR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            yy = -7.5 + (((tickAnim - 10) / 20) * (-7.5-(-7.5)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -7.5 + (((tickAnim - 30) / 10) * (0-(-7.5)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animIdle2(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamptosaurus entity = (EntityPrehistoricFloraCamptosaurus) entitylivingbaseIn;

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




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 7) / 6) * (-10-(5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -10 + (((tickAnim - 13) / 10) * (-7.69725-(-10)));
            yy = 0 + (((tickAnim - 13) / 10) * (-23.34777-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (-3.91335-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -7.69725 + (((tickAnim - 23) / 5) * (-5.19725-(-7.69725)));
            yy = -23.34777 + (((tickAnim - 23) / 5) * (-23.34777-(-23.34777)));
            zz = -3.91335 + (((tickAnim - 23) / 5) * (-3.91335-(-3.91335)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -5.19725 + (((tickAnim - 28) / 4) * (-7.69725-(-5.19725)));
            yy = -23.34777 + (((tickAnim - 28) / 4) * (-23.34777-(-23.34777)));
            zz = -3.91335 + (((tickAnim - 28) / 4) * (-3.91335-(-3.91335)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = -7.69725 + (((tickAnim - 32) / 10) * (-15.19725-(-7.69725)));
            yy = -23.34777 + (((tickAnim - 32) / 10) * (1.01512-(-23.34777)));
            zz = -3.91335 + (((tickAnim - 32) / 10) * (0.17015-(-3.91335)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = -15.19725 + (((tickAnim - 42) / 9) * (-7.69725-(-15.19725)));
            yy = 1.01512 + (((tickAnim - 42) / 9) * (23.34777-(1.01512)));
            zz = 0.17015 + (((tickAnim - 42) / 9) * (3.91335-(0.17015)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = -7.69725 + (((tickAnim - 51) / 8) * (-15.19725-(-7.69725)));
            yy = 23.34777 + (((tickAnim - 51) / 8) * (23.34777-(23.34777)));
            zz = 3.91335 + (((tickAnim - 51) / 8) * (3.91335-(3.91335)));
        }
        else if (tickAnim >= 59 && tickAnim < 70) {
            xx = -15.19725 + (((tickAnim - 59) / 11) * (0-(-15.19725)));
            yy = 23.34777 + (((tickAnim - 59) / 11) * (0-(23.34777)));
            zz = 3.91335 + (((tickAnim - 59) / 11) * (0-(3.91335)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




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
            xx = 0 + (((tickAnim - 0) / 8) * (26.07-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 26.07 + (((tickAnim - 8) / 5) * (25-(26.07)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 25 + (((tickAnim - 13) / 10) * (25.08377-(25)));
            yy = 0 + (((tickAnim - 13) / 10) * (-4.53051-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (-2.11751-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 25.08377 + (((tickAnim - 23) / 9) * (25.08377-(25.08377)));
            yy = -4.53051 + (((tickAnim - 23) / 9) * (-4.53051-(-4.53051)));
            zz = -2.11751 + (((tickAnim - 23) / 9) * (-2.11751-(-2.11751)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 25.08377 + (((tickAnim - 32) / 10) * (20.08377-(25.08377)));
            yy = -4.53051 + (((tickAnim - 32) / 10) * (0.19698-(-4.53051)));
            zz = -2.11751 + (((tickAnim - 32) / 10) * (0.09207-(-2.11751)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = 20.08377 + (((tickAnim - 42) / 9) * (25.08377-(20.08377)));
            yy = 0.19698 + (((tickAnim - 42) / 9) * (4.53051-(0.19698)));
            zz = 0.09207 + (((tickAnim - 42) / 9) * (2.11751-(0.09207)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = 25.08377 + (((tickAnim - 51) / 8) * (25.08377-(25.08377)));
            yy = 4.53051 + (((tickAnim - 51) / 8) * (4.53051-(4.53051)));
            zz = 2.11751 + (((tickAnim - 51) / 8) * (2.11751-(2.11751)));
        }
        else if (tickAnim >= 59 && tickAnim < 70) {
            xx = 25.08377 + (((tickAnim - 59) / 11) * (0-(25.08377)));
            yy = 4.53051 + (((tickAnim - 59) / 11) * (0-(4.53051)));
            zz = 2.11751 + (((tickAnim - 59) / 11) * (0-(2.11751)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




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

    public void animIdle3(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamptosaurus entity = (EntityPrehistoricFloraCamptosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -2.5 + (((tickAnim - 10) / 5) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-2.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (2.5-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -2.5 + (((tickAnim - 15) / 5) * (0-(-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 2.5 + (((tickAnim - 20) / 4) * (0.41508-(2.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (-0.03631-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (4.99987-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0.41508 + (((tickAnim - 24) / 6) * (-2.5-(0.41508)));
            yy = -0.03631 + (((tickAnim - 24) / 6) * (0-(-0.03631)));
            zz = 4.99987 + (((tickAnim - 24) / 6) * (0-(4.99987)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 30) / 10) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-87.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -87.5 + (((tickAnim - 10) / 20) * (-87.5-(-87.5)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -87.5 + (((tickAnim - 30) / 10) * (0-(-87.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 17.5 + (((tickAnim - 5) / 5) * (0-(17.5)));
            yy = 5 + (((tickAnim - 5) / 5) * (10-(5)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-10-(0)));
            yy = 10 + (((tickAnim - 10) / 3) * (10-(10)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -10 + (((tickAnim - 13) / 2) * (0-(-10)));
            yy = 10 + (((tickAnim - 13) / 2) * (10-(10)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-10-(0)));
            yy = 10 + (((tickAnim - 15) / 3) * (10-(10)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 18) / 2) * (0-(-10)));
            yy = 10 + (((tickAnim - 18) / 2) * (10-(10)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (-10-(0)));
            yy = 10 + (((tickAnim - 20) / 3) * (10-(10)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -10 + (((tickAnim - 23) / 2) * (0-(-10)));
            yy = 10 + (((tickAnim - 23) / 2) * (10-(10)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (-10-(0)));
            yy = 10 + (((tickAnim - 25) / 3) * (10-(10)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 28) / 2) * (0-(-10)));
            yy = 10 + (((tickAnim - 28) / 2) * (10-(10)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (-15-(0)));
            yy = 10 + (((tickAnim - 30) / 5) * (5-(10)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -15 + (((tickAnim - 35) / 5) * (0-(-15)));
            yy = 5 + (((tickAnim - 35) / 5) * (0-(5)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            yy = 7.5 + (((tickAnim - 10) / 20) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 7.5 + (((tickAnim - 30) / 10) * (0-(7.5)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.98448-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-7.43547-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (7.56397-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -0.98448 + (((tickAnim - 10) / 6) * (-1.30962-(-0.98448)));
            yy = -7.43547 + (((tickAnim - 10) / 6) * (-7.38542-(-7.43547)));
            zz = 7.56397 + (((tickAnim - 10) / 6) * (10.08453-(7.56397)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -1.30962 + (((tickAnim - 16) / 5) * (-0.5415-(-1.30962)));
            yy = -7.38542 + (((tickAnim - 16) / 5) * (-7.47889-(-7.38542)));
            zz = 10.08453 + (((tickAnim - 16) / 5) * (4.15301-(10.08453)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -0.5415 + (((tickAnim - 21) / 4) * (4.25715-(-0.5415)));
            yy = -7.47889 + (((tickAnim - 21) / 4) * (-7.45916-(-7.47889)));
            zz = 4.15301 + (((tickAnim - 21) / 4) * (5.70344-(4.15301)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 4.25715 + (((tickAnim - 25) / 5) * (-0.98448-(4.25715)));
            yy = -7.45916 + (((tickAnim - 25) / 5) * (-7.43547-(-7.45916)));
            zz = 5.70344 + (((tickAnim - 25) / 5) * (7.56397-(5.70344)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -0.98448 + (((tickAnim - 30) / 5) * (-5.49224-(-0.98448)));
            yy = -7.43547 + (((tickAnim - 30) / 5) * (-3.71774-(-7.43547)));
            zz = 7.56397 + (((tickAnim - 30) / 5) * (3.78199-(7.56397)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5.49224 + (((tickAnim - 35) / 5) * (0-(-5.49224)));
            yy = -3.71774 + (((tickAnim - 35) / 5) * (0-(-3.71774)));
            zz = 3.78199 + (((tickAnim - 35) / 5) * (0-(3.78199)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (4.72688-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-3.41171-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (2.88731-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 4.72688 + (((tickAnim - 4) / 6) * (-0.4682-(4.72688)));
            yy = -3.41171 + (((tickAnim - 4) / 6) * (-5.84865-(-3.41171)));
            zz = 2.88731 + (((tickAnim - 4) / 6) * (4.94968-(2.88731)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -0.4682 + (((tickAnim - 10) / 4) * (2.0318-(-0.4682)));
            yy = -5.84865 + (((tickAnim - 10) / 4) * (-5.84865-(-5.84865)));
            zz = 4.94968 + (((tickAnim - 10) / 4) * (4.94968-(4.94968)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 2.0318 + (((tickAnim - 14) / 4) * (1.61414-(2.0318)));
            yy = -5.84865 + (((tickAnim - 14) / 4) * (-5.3504-(-5.84865)));
            zz = 4.94968 + (((tickAnim - 14) / 4) * (2.48807-(4.94968)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1.61414 + (((tickAnim - 18) / 5) * (-4.12956-(1.61414)));
            yy = -5.3504 + (((tickAnim - 18) / 5) * (-5.52835-(-5.3504)));
            zz = 2.48807 + (((tickAnim - 18) / 5) * (3.36722-(2.48807)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -4.12956 + (((tickAnim - 23) / 3) * (-0.4091-(-4.12956)));
            yy = -5.52835 + (((tickAnim - 23) / 3) * (-5.63511-(-5.52835)));
            zz = 3.36722 + (((tickAnim - 23) / 3) * (3.89471-(3.36722)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -0.4091 + (((tickAnim - 26) / 4) * (-0.4682-(-0.4091)));
            yy = -5.63511 + (((tickAnim - 26) / 4) * (-5.84865-(-5.63511)));
            zz = 3.89471 + (((tickAnim - 26) / 4) * (4.94968-(3.89471)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -0.4682 + (((tickAnim - 30) / 10) * (0-(-0.4682)));
            yy = -5.84865 + (((tickAnim - 30) / 10) * (0-(-5.84865)));
            zz = 4.94968 + (((tickAnim - 30) / 10) * (0-(4.94968)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (4.375-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 6) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 4.375 + (((tickAnim - 6) / 4) * (7.5-(4.375)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 7.5 + (((tickAnim - 10) / 3) * (-2.5-(7.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (-5-(0)));
            zz = -2.5 + (((tickAnim - 13) / 5) * (0-(-2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -2.5 + (((tickAnim - 18) / 3) * (-2.44252-(-2.5)));
            yy = -5 + (((tickAnim - 18) / 3) * (-3.29266-(-5)));
            zz = 0 + (((tickAnim - 18) / 3) * (12.01153-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -2.44252 + (((tickAnim - 21) / 2) * (0.72362-(-2.44252)));
            yy = -3.29266 + (((tickAnim - 21) / 2) * (-2.39466-(-3.29266)));
            zz = 12.01153 + (((tickAnim - 21) / 2) * (10.78111-(12.01153)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0.72362 + (((tickAnim - 23) / 3) * (0.38653-(0.72362)));
            yy = -2.39466 + (((tickAnim - 23) / 3) * (-1.51497-(-2.39466)));
            zz = 10.78111 + (((tickAnim - 23) / 3) * (12.05149-(10.78111)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0.38653 + (((tickAnim - 26) / 2) * (-2.26808-(0.38653)));
            yy = -1.51497 + (((tickAnim - 26) / 2) * (-0.90898-(-1.51497)));
            zz = 12.05149 + (((tickAnim - 26) / 2) * (10.23089-(12.05149)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -2.26808 + (((tickAnim - 28) / 2) * (0-(-2.26808)));
            yy = -0.90898 + (((tickAnim - 28) / 2) * (0-(-0.90898)));
            zz = 10.23089 + (((tickAnim - 28) / 2) * (7.5-(10.23089)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 7.5 + (((tickAnim - 30) / 5) * (3.75-(7.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 35) / 5) * (0-(5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 3.75 + (((tickAnim - 35) / 5) * (0-(3.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-5.83333-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 4) / 6) * (0-(-5)));
            yy = -5.83333 + (((tickAnim - 4) / 6) * (-10-(-5.83333)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-1.5908-(0)));
            yy = -10 + (((tickAnim - 10) / 3) * (-8.29433-(-10)));
            zz = 0 + (((tickAnim - 10) / 3) * (9.9811-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -1.5908 + (((tickAnim - 13) / 3) * (3.71221-(-1.5908)));
            yy = -8.29433 + (((tickAnim - 13) / 3) * (-8.61922-(-8.29433)));
            zz = 9.9811 + (((tickAnim - 13) / 3) * (8.07993-(9.9811)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 3.71221 + (((tickAnim - 16) / 4) * (-12.37962-(3.71221)));
            yy = -8.61922 + (((tickAnim - 16) / 4) * (-9.02533-(-8.61922)));
            zz = 8.07993 + (((tickAnim - 16) / 4) * (5.70348-(8.07993)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -12.37962 + (((tickAnim - 20) / 4) * (-20.79276-(-12.37962)));
            yy = -9.02533 + (((tickAnim - 20) / 4) * (-4.53447-(-9.02533)));
            zz = 5.70348 + (((tickAnim - 20) / 4) * (12.11404-(5.70348)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -20.79276 + (((tickAnim - 24) / 3) * (-21.88158-(-20.79276)));
            yy = -4.53447 + (((tickAnim - 24) / 3) * (-6.87684-(-4.53447)));
            zz = 12.11404 + (((tickAnim - 24) / 3) * (6.92231-(12.11404)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -21.88158 + (((tickAnim - 27) / 3) * (0-(-21.88158)));
            yy = -6.87684 + (((tickAnim - 27) / 3) * (-10-(-6.87684)));
            zz = 6.92231 + (((tickAnim - 27) / 3) * (0-(6.92231)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -10 + (((tickAnim - 30) / 10) * (0-(-10)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = -2.5 + (((tickAnim - 10) / 4) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -7.5 + (((tickAnim - 14) / 3) * (-6.29914-(-7.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (-0.80609-(0)));
            zz = -2.5 + (((tickAnim - 14) / 3) * (-4.86656-(-2.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -6.29914 + (((tickAnim - 17) / 3) * (-4.66107-(-6.29914)));
            yy = -0.80609 + (((tickAnim - 17) / 3) * (1.61523-(-0.80609)));
            zz = -4.86656 + (((tickAnim - 17) / 3) * (2.88978-(-4.86656)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -4.66107 + (((tickAnim - 20) / 3) * (9.28646-(-4.66107)));
            yy = 1.61523 + (((tickAnim - 20) / 3) * (3.26313-(1.61523)));
            zz = 2.88978 + (((tickAnim - 20) / 3) * (8.76215-(2.88978)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 9.28646 + (((tickAnim - 23) / 3) * (4.98657-(9.28646)));
            yy = 3.26313 + (((tickAnim - 23) / 3) * (0.84199-(3.26313)));
            zz = 8.76215 + (((tickAnim - 23) / 3) * (-3.68224-(8.76215)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 4.98657 + (((tickAnim - 26) / 4) * (0-(4.98657)));
            yy = 0.84199 + (((tickAnim - 26) / 4) * (0-(0.84199)));
            zz = -3.68224 + (((tickAnim - 26) / 4) * (-2.5-(-3.68224)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -2.5 + (((tickAnim - 30) / 10) * (0-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (10-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 10 + (((tickAnim - 14) / 5) * (4.34-(10)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 4.34 + (((tickAnim - 19) / 5) * (12.34-(4.34)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 12.34 + (((tickAnim - 24) / 6) * (0-(12.34)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animIdle4(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamptosaurus entity = (EntityPrehistoricFloraCamptosaurus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 66) {
            xx = 10 + (((tickAnim - 26) / 40) * (10-(10)));
            yy = 0 + (((tickAnim - 26) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 40) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 10 + (((tickAnim - 66) / 14) * (0-(10)));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 23) / 16) * (2.5-(0)));
            yy = 0 + (((tickAnim - 23) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 16) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 66) {
            xx = 2.5 + (((tickAnim - 39) / 27) * (0-(2.5)));
            yy = 0 + (((tickAnim - 39) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 27) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (-32.5-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 34) {
            xx = -32.5 + (((tickAnim - 15) / 19) * (-35-(-32.5)));
            yy = 0 + (((tickAnim - 15) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 19) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 55) {
            xx = -35 + (((tickAnim - 34) / 21) * (-32.5-(-35)));
            yy = 0 + (((tickAnim - 34) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 21) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 72) {
            xx = -32.5 + (((tickAnim - 55) / 17) * (0-(-32.5)));
            yy = 0 + (((tickAnim - 55) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 17) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (50-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 55) {
            xx = 50 + (((tickAnim - 15) / 40) * (50-(50)));
            yy = 0 + (((tickAnim - 15) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 40) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 72) {
            xx = 50 + (((tickAnim - 55) / 17) * (0-(50)));
            yy = 0 + (((tickAnim - 55) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 17) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 15) / 40) * (0-(0)));
            yy = -12.5 + (((tickAnim - 15) / 40) * (-12.5-(-12.5)));
            zz = 0 + (((tickAnim - 15) / 40) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 55) / 17) * (0-(0)));
            yy = -12.5 + (((tickAnim - 55) / 17) * (0-(-12.5)));
            zz = 0 + (((tickAnim - 55) / 17) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 13) / 11) * (-32.5-(0)));
            yy = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 43) {
            xx = -32.5 + (((tickAnim - 24) / 19) * (-35-(-32.5)));
            yy = 0 + (((tickAnim - 24) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 19) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 64) {
            xx = -35 + (((tickAnim - 43) / 21) * (-32.5-(-35)));
            yy = 0 + (((tickAnim - 43) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 21) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 72) {
            xx = -32.5 + (((tickAnim - 64) / 8) * (0-(-32.5)));
            yy = 0 + (((tickAnim - 64) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 8) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 13) / 11) * (50-(0)));
            yy = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 64) {
            xx = 50 + (((tickAnim - 24) / 40) * (50-(50)));
            yy = 0 + (((tickAnim - 24) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 40) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 72) {
            xx = 50 + (((tickAnim - 64) / 8) * (0-(50)));
            yy = 0 + (((tickAnim - 64) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 8) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(xx), ElbowR.rotateAngleY + (float) Math.toRadians(yy), ElbowR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 11) * (12.5-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 24) / 40) * (0-(0)));
            yy = 12.5 + (((tickAnim - 24) / 40) * (12.5-(12.5)));
            zz = 0 + (((tickAnim - 24) / 40) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 64) / 8) * (0-(0)));
            yy = 12.5 + (((tickAnim - 64) / 8) * (0-(12.5)));
            zz = 0 + (((tickAnim - 64) / 8) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 32) {
            xx = -15 + (((tickAnim - 13) / 19) * (5.42-(-15)));
            yy = 0 + (((tickAnim - 13) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 19) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 5.42 + (((tickAnim - 32) / 9) * (6.09-(5.42)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 51) {
            xx = 6.09 + (((tickAnim - 41) / 10) * (-2.16-(6.09)));
            yy = 0 + (((tickAnim - 41) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 10) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 61) {
            xx = -2.16 + (((tickAnim - 51) / 10) * (-0.41-(-2.16)));
            yy = 0 + (((tickAnim - 51) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 10) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 68) {
            xx = -0.41 + (((tickAnim - 61) / 7) * (13.81-(-0.41)));
            yy = 0 + (((tickAnim - 61) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 7) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 13.81 + (((tickAnim - 68) / 12) * (0-(13.81)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 17.5 + (((tickAnim - 18) / 6) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 17.5 + (((tickAnim - 24) / 12) * (9.1-(17.5)));
            yy = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = 9.1 + (((tickAnim - 36) / 8) * (10.98193-(9.1)));
            yy = 0 + (((tickAnim - 36) / 8) * (11.47566-(0)));
            zz = 0 + (((tickAnim - 36) / 8) * (-2.44291-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 52) {
            xx = 10.98193 + (((tickAnim - 44) / 8) * (3.17567-(10.98193)));
            yy = 11.47566 + (((tickAnim - 44) / 8) * (21.80376-(11.47566)));
            zz = -2.44291 + (((tickAnim - 44) / 8) * (-4.64152-(-2.44291)));
        }
        else if (tickAnim >= 52 && tickAnim < 62) {
            xx = 3.17567 + (((tickAnim - 52) / 10) * (0.03715-(3.17567)));
            yy = 21.80376 + (((tickAnim - 52) / 10) * (16.67346-(21.80376)));
            zz = -4.64152 + (((tickAnim - 52) / 10) * (-3.5494-(-4.64152)));
        }
        else if (tickAnim >= 62 && tickAnim < 71) {
            xx = 0.03715 + (((tickAnim - 62) / 9) * (8.52742-(0.03715)));
            yy = 16.67346 + (((tickAnim - 62) / 9) * (7.05416-(16.67346)));
            zz = -3.5494 + (((tickAnim - 62) / 9) * (-1.50167-(-3.5494)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 8.52742 + (((tickAnim - 71) / 9) * (0-(8.52742)));
            yy = 7.05416 + (((tickAnim - 71) / 9) * (0-(7.05416)));
            zz = -1.50167 + (((tickAnim - 71) / 9) * (0-(-1.50167)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (19.12584-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-9.56973-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (4.55984-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 19.12584 + (((tickAnim - 13) / 7) * (19.12584-(19.12584)));
            yy = -9.56973 + (((tickAnim - 13) / 7) * (-9.56973-(-9.56973)));
            zz = 4.55984 + (((tickAnim - 13) / 7) * (4.55984-(4.55984)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 19.12584 + (((tickAnim - 20) / 12) * (19.79687-(19.12584)));
            yy = -9.56973 + (((tickAnim - 20) / 12) * (-15.17022-(-9.56973)));
            zz = 4.55984 + (((tickAnim - 20) / 12) * (8.82912-(4.55984)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = 19.79687 + (((tickAnim - 32) / 11) * (10.4679-(19.79687)));
            yy = -15.17022 + (((tickAnim - 32) / 11) * (-20.77072-(-15.17022)));
            zz = 8.82912 + (((tickAnim - 32) / 11) * (13.0984-(8.82912)));
        }
        else if (tickAnim >= 43 && tickAnim < 51) {
            xx = 10.4679 + (((tickAnim - 43) / 8) * (17.75058-(10.4679)));
            yy = -20.77072 + (((tickAnim - 43) / 8) * (-11.74108-(-20.77072)));
            zz = 13.0984 + (((tickAnim - 43) / 8) * (7.76499-(13.0984)));
        }
        else if (tickAnim >= 51 && tickAnim < 58) {
            xx = 17.75058 + (((tickAnim - 51) / 7) * (17.31594-(17.75058)));
            yy = -11.74108 + (((tickAnim - 51) / 7) * (6.31821-(-11.74108)));
            zz = 7.76499 + (((tickAnim - 51) / 7) * (-2.90184-(7.76499)));
        }
        else if (tickAnim >= 58 && tickAnim < 67) {
            xx = 17.31594 + (((tickAnim - 58) / 9) * (20.54174-(17.31594)));
            yy = 6.31821 + (((tickAnim - 58) / 9) * (17.79587-(6.31821)));
            zz = -2.90184 + (((tickAnim - 58) / 9) * (-9.77499-(-2.90184)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 20.54174 + (((tickAnim - 67) / 5) * (20.33859-(20.54174)));
            yy = 17.79587 + (((tickAnim - 67) / 5) * (11.12242-(17.79587)));
            zz = -9.77499 + (((tickAnim - 67) / 5) * (-6.10937-(-9.77499)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 20.33859 + (((tickAnim - 72) / 8) * (0-(20.33859)));
            yy = 11.12242 + (((tickAnim - 72) / 8) * (0-(11.12242)));
            zz = -6.10937 + (((tickAnim - 72) / 8) * (0-(-6.10937)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (13.57965-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-16.58933-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (13.21092-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 13.57965 + (((tickAnim - 11) / 14) * (13.57965-(13.57965)));
            yy = -16.58933 + (((tickAnim - 11) / 14) * (-16.58933-(-16.58933)));
            zz = 13.21092 + (((tickAnim - 11) / 14) * (13.21092-(13.21092)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = 13.57965 + (((tickAnim - 25) / 18) * (13.29868-(13.57965)));
            yy = -16.58933 + (((tickAnim - 25) / 18) * (-10.13792-(-16.58933)));
            zz = 13.21092 + (((tickAnim - 25) / 18) * (8.07334-(13.21092)));
        }
        else if (tickAnim >= 43 && tickAnim < 63) {
            xx = 13.29868 + (((tickAnim - 43) / 20) * (5.5954-(13.29868)));
            yy = -10.13792 + (((tickAnim - 43) / 20) * (2.32632-(-10.13792)));
            zz = 8.07334 + (((tickAnim - 43) / 20) * (-6.71128-(8.07334)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 5.5954 + (((tickAnim - 63) / 10) * (7.51793-(5.5954)));
            yy = 2.32632 + (((tickAnim - 63) / 10) * (1.04684-(2.32632)));
            zz = -6.71128 + (((tickAnim - 63) / 10) * (-3.02008-(-6.71128)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 7.51793 + (((tickAnim - 73) / 7) * (0-(7.51793)));
            yy = 1.04684 + (((tickAnim - 73) / 7) * (0-(1.04684)));
            zz = -3.02008 + (((tickAnim - 73) / 7) * (0-(-3.02008)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 13) / 7) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 7.5 + (((tickAnim - 20) / 13) * (-9.0014-(7.5)));
            yy = 0 + (((tickAnim - 20) / 13) * (2.26945-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (-0.41956-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -9.0014 + (((tickAnim - 33) / 7) * (10.66456-(-9.0014)));
            yy = 2.26945 + (((tickAnim - 33) / 7) * (3.40417-(2.26945)));
            zz = -0.41956 + (((tickAnim - 33) / 7) * (-0.62934-(-0.41956)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 10.66456 + (((tickAnim - 40) / 8) * (-14.62194-(10.66456)));
            yy = 3.40417 + (((tickAnim - 40) / 8) * (4.68073-(3.40417)));
            zz = -0.62934 + (((tickAnim - 40) / 8) * (-0.86535-(-0.62934)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -14.62194 + (((tickAnim - 48) / 5) * (5.97394-(-14.62194)));
            yy = 4.68073 + (((tickAnim - 48) / 5) * (5.67361-(4.68073)));
            zz = -0.86535 + (((tickAnim - 48) / 5) * (-1.04891-(-0.86535)));
        }
        else if (tickAnim >= 53 && tickAnim < 63) {
            xx = 5.97394 + (((tickAnim - 53) / 10) * (-5.50456-(5.97394)));
            yy = 5.67361 + (((tickAnim - 53) / 10) * (7.3757-(5.67361)));
            zz = -1.04891 + (((tickAnim - 53) / 10) * (-1.36358-(-1.04891)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = -5.50456 + (((tickAnim - 63) / 10) * (12.52295-(-5.50456)));
            yy = 7.3757 + (((tickAnim - 63) / 10) * (3.31906-(7.3757)));
            zz = -1.36358 + (((tickAnim - 63) / 10) * (-0.61361-(-1.36358)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 12.52295 + (((tickAnim - 73) / 7) * (0-(12.52295)));
            yy = 3.31906 + (((tickAnim - 73) / 7) * (0-(3.31906)));
            zz = -0.61361 + (((tickAnim - 73) / 7) * (0-(-0.61361)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 66) {
            xx = 5 + (((tickAnim - 26) / 40) * (5-(5)));
            yy = 0 + (((tickAnim - 26) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 40) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 5 + (((tickAnim - 66) / 14) * (0-(5)));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Camptosaurus, Camptosaurus.rotateAngleX + (float) Math.toRadians(xx), Camptosaurus.rotateAngleY + (float) Math.toRadians(yy), Camptosaurus.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (-1.75-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 26) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 40) * (0-(0)));
            zz = -1.75 + (((tickAnim - 26) / 40) * (-1.75-(-1.75)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = -1.75 + (((tickAnim - 66) / 14) * (0-(-1.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Camptosaurus.rotationPointX = this.Camptosaurus.rotationPointX + (float)(xx);
        this.Camptosaurus.rotationPointY = this.Camptosaurus.rotationPointY - (float)(yy);
        this.Camptosaurus.rotationPointZ = this.Camptosaurus.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 46) {
            xx = 5 + (((tickAnim - 26) / 20) * (7.5-(5)));
            yy = 0 + (((tickAnim - 26) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 20) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 66) {
            xx = 7.5 + (((tickAnim - 46) / 20) * (5-(7.5)));
            yy = 0 + (((tickAnim - 46) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 20) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 5 + (((tickAnim - 66) / 14) * (0-(5)));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 46) {
            xx = -7.5 + (((tickAnim - 26) / 20) * (-5-(-7.5)));
            yy = 0 + (((tickAnim - 26) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 20) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 66) {
            xx = -5 + (((tickAnim - 46) / 20) * (-7.5-(-5)));
            yy = 0 + (((tickAnim - 46) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 20) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = -7.5 + (((tickAnim - 66) / 14) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = -12.5 + (((tickAnim - 26) / 12) * (-13.54-(-12.5)));
            yy = 0 + (((tickAnim - 26) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 12) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = -13.54 + (((tickAnim - 38) / 8) * (-10-(-13.54)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = -10 + (((tickAnim - 46) / 7) * (-8.44-(-10)));
            yy = 0 + (((tickAnim - 46) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 7) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 66) {
            xx = -8.44 + (((tickAnim - 53) / 13) * (-12.5-(-8.44)));
            yy = 0 + (((tickAnim - 53) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 13) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = -12.5 + (((tickAnim - 66) / 14) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = -7.5 + (((tickAnim - 26) / 12) * (-7.08-(-7.5)));
            yy = 0 + (((tickAnim - 26) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 12) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = -7.08 + (((tickAnim - 38) / 8) * (-2.5-(-7.08)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = -2.5 + (((tickAnim - 46) / 7) * (-1.87-(-2.5)));
            yy = 0 + (((tickAnim - 46) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 7) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 66) {
            xx = -1.87 + (((tickAnim - 53) / 13) * (-7.5-(-1.87)));
            yy = 0 + (((tickAnim - 53) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 13) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = -7.5 + (((tickAnim - 66) / 14) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 46) {
            xx = -5 + (((tickAnim - 26) / 20) * (-2.5-(-5)));
            yy = 0 + (((tickAnim - 26) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 20) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = -2.5 + (((tickAnim - 46) / 7) * (14.06-(-2.5)));
            yy = 0 + (((tickAnim - 46) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 7) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 66) {
            xx = 14.06 + (((tickAnim - 53) / 13) * (-5-(14.06)));
            yy = 0 + (((tickAnim - 53) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 13) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 66) / 14) * (0-(-5)));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-23.47-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 26) {
            xx = -23.47 + (((tickAnim - 14) / 12) * (-20-(-23.47)));
            yy = 0 + (((tickAnim - 14) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 12) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 66) {
            xx = -20 + (((tickAnim - 26) / 40) * (-20-(-20)));
            yy = 0 + (((tickAnim - 26) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 40) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 73) {
            xx = -20 + (((tickAnim - 66) / 7) * (-30.49-(-20)));
            yy = 0 + (((tickAnim - 66) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 7) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -30.49 + (((tickAnim - 73) / 7) * (0-(-30.49)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 26 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 26) / 40) * (0-(0)));
            yy = -0.2 + (((tickAnim - 26) / 40) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 26) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegL.rotationPointX = this.LegL.rotationPointX + (float)(xx);
        this.LegL.rotationPointY = this.LegL.rotationPointY - (float)(yy);
        this.LegL.rotationPointZ = this.LegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (17.26-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 26) {
            xx = 17.26 + (((tickAnim - 14) / 12) * (-5-(17.26)));
            yy = 0 + (((tickAnim - 14) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 12) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 66) {
            xx = -5 + (((tickAnim - 26) / 40) * (-5-(-5)));
            yy = 0 + (((tickAnim - 26) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 40) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 73) {
            xx = -5 + (((tickAnim - 66) / 7) * (10.5-(-5)));
            yy = 0 + (((tickAnim - 66) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 7) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 10.5 + (((tickAnim - 73) / 7) * (0-(10.5)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-1.13-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 26) {
            xx = -1.13 + (((tickAnim - 14) / 12) * (2.5-(-1.13)));
            yy = 0 + (((tickAnim - 14) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 12) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 66) {
            xx = 2.5 + (((tickAnim - 26) / 40) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 26) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 40) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 73) {
            xx = 2.5 + (((tickAnim - 66) / 7) * (-6.5-(2.5)));
            yy = 0 + (((tickAnim - 66) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 7) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -6.5 + (((tickAnim - 73) / 7) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (32.1-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 26) {
            xx = 32.1 + (((tickAnim - 14) / 12) * (17.5-(32.1)));
            yy = 0 + (((tickAnim - 14) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 12) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 66) {
            xx = 17.5 + (((tickAnim - 26) / 40) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 26) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 40) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 73) {
            xx = 17.5 + (((tickAnim - 66) / 7) * (26.99-(17.5)));
            yy = 0 + (((tickAnim - 66) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 7) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 26.99 + (((tickAnim - 73) / 7) * (0-(26.99)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 66) {
            xx = 1.5 + (((tickAnim - 26) / 40) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 26) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 40) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 1.5 + (((tickAnim - 66) / 14) * (0-(1.5)));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 26 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 26) / 40) * (0-(0)));
            yy = -0.2 + (((tickAnim - 26) / 40) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 26) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegR.rotationPointX = this.LegR.rotationPointX + (float)(xx);
        this.LegR.rotationPointY = this.LegR.rotationPointY - (float)(yy);
        this.LegR.rotationPointZ = this.LegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 66) {
            xx = -4 + (((tickAnim - 26) / 40) * (-4-(-4)));
            yy = 0 + (((tickAnim - 26) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 40) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = -4 + (((tickAnim - 66) / 14) * (0-(-4)));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeR, KneeR.rotateAngleX + (float) Math.toRadians(xx), KneeR.rotateAngleY + (float) Math.toRadians(yy), KneeR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 26) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 40) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalR, MetatarsalR.rotateAngleX + (float) Math.toRadians(xx), MetatarsalR.rotateAngleY + (float) Math.toRadians(yy), MetatarsalR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 66) {
            xx = -2.5 + (((tickAnim - 26) / 40) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 26) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 40) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 66) / 14) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCamptosaurus entity = (EntityPrehistoricFloraCamptosaurus) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Camptosaurus, Camptosaurus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-180))*-2.2), Camptosaurus.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-150))*2.5), Camptosaurus.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-150))*1.85));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1.75 + (((tickAnim - 0) / 3) * (-1.25-(-1.75)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -1.25 + (((tickAnim - 3) / 5) * (-1.75-(-1.25)));
            zz = -2.25 + (((tickAnim - 3) / 5) * (0-(-2.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -1.75 + (((tickAnim - 8) / 3) * (-1.25-(-1.75)));
            zz = 0 + (((tickAnim - 8) / 3) * (-2.25-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -1.25 + (((tickAnim - 11) / 4) * (-1.75-(-1.25)));
            zz = -2.25 + (((tickAnim - 11) / 4) * (0-(-2.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Camptosaurus.rotationPointX = this.Camptosaurus.rotationPointX + (float)(xx);
        this.Camptosaurus.rotationPointY = this.Camptosaurus.rotationPointY - (float)(yy);
        this.Camptosaurus.rotationPointZ = this.Camptosaurus.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+250))*1.2), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+250))*1.5));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+250))*1.5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+250))*1.5));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-250))*-2.5), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-250))*1.7), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+250))*1.5));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-250))*-2.5), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-250))*1.9), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+250))*1.5));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-250))*-2.4), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-250))*2), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-250))*1.5));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 42.5 + (((tickAnim - 0) / 3) * (35.36-(42.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 35.36 + (((tickAnim - 3) / 3) * (-32.5-(35.36)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -32.5 + (((tickAnim - 6) / 2) * (-25-(-32.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -25 + (((tickAnim - 8) / 7) * (42.5-(-25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17.5 + (((tickAnim - 0) / 3) * (20.83-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 20.83 + (((tickAnim - 3) / 3) * (21.94-(20.83)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 21.94 + (((tickAnim - 6) / 2) * (-22.5-(21.94)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -22.5 + (((tickAnim - 8) / 3) * (-2.78-(-22.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -2.78 + (((tickAnim - 11) / 2) * (-1.17-(-2.78)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -1.17 + (((tickAnim - 13) / 2) * (-17.5-(-1.17)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -20 + (((tickAnim - 0) / 3) * (-1.67-(-20)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -1.67 + (((tickAnim - 3) / 3) * (-29.72-(-1.67)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -29.72 + (((tickAnim - 6) / 2) * (5-(-29.72)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 5 + (((tickAnim - 8) / 1) * (-25.55-(5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -25.55 + (((tickAnim - 9) / 2) * (-31.11-(-25.55)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -31.11 + (((tickAnim - 11) / 2) * (-26.67-(-31.11)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -26.67 + (((tickAnim - 13) / 2) * (-20-(-26.67)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.5 + (((tickAnim - 0) / 3) * (54.17-(22.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 54.17 + (((tickAnim - 3) / 3) * (83.89-(54.17)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 83.89 + (((tickAnim - 6) / 2) * (42.5-(83.89)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 42.5 + (((tickAnim - 8) / 1) * (50.56-(42.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 50.56 + (((tickAnim - 9) / 2) * (28.61-(50.56)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 28.61 + (((tickAnim - 11) / 2) * (26.17-(28.61)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 26.17 + (((tickAnim - 13) / 2) * (22.5-(26.17)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -25 + (((tickAnim - 0) / 8) * (42.5-(-25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 42.5 + (((tickAnim - 8) / 2) * (35.36-(42.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 35.36 + (((tickAnim - 10) / 3) * (-32.5-(35.36)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -32.5 + (((tickAnim - 13) / 2) * (-25-(-32.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -22.5 + (((tickAnim - 0) / 3) * (-2.78-(-22.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.78 + (((tickAnim - 3) / 2) * (-1.17-(-2.78)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -1.17 + (((tickAnim - 5) / 3) * (-17.5-(-1.17)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -17.5 + (((tickAnim - 8) / 2) * (20.83-(-17.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 20.83 + (((tickAnim - 10) / 3) * (21.94-(20.83)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 21.94 + (((tickAnim - 13) / 2) * (-22.5-(21.94)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeR, KneeR.rotateAngleX + (float) Math.toRadians(xx), KneeR.rotateAngleY + (float) Math.toRadians(yy), KneeR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 5 + (((tickAnim - 0) / 2) * (-25.55-(5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -25.55 + (((tickAnim - 2) / 1) * (-31.11-(-25.55)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -31.11 + (((tickAnim - 3) / 2) * (-26.67-(-31.11)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -26.67 + (((tickAnim - 5) / 3) * (-20-(-26.67)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 8) / 2) * (-1.67-(-20)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -1.67 + (((tickAnim - 10) / 3) * (-29.72-(-1.67)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -29.72 + (((tickAnim - 13) / 2) * (5-(-29.72)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalR, MetatarsalR.rotateAngleX + (float) Math.toRadians(xx), MetatarsalR.rotateAngleY + (float) Math.toRadians(yy), MetatarsalR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 42.5 + (((tickAnim - 0) / 2) * (50.56-(42.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 50.56 + (((tickAnim - 2) / 1) * (28.61-(50.56)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 28.61 + (((tickAnim - 3) / 2) * (26.17-(28.61)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 26.17 + (((tickAnim - 5) / 3) * (22.5-(26.17)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22.5 + (((tickAnim - 8) / 2) * (54.17-(22.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 54.17 + (((tickAnim - 10) / 3) * (83.89-(54.17)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 83.89 + (((tickAnim - 13) / 2) * (42.5-(83.89)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+100))*2), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*1.8), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+150))*1));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-150))*3.5), Chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+100))*2), Chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-180))*1.2));


        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-150))*-5), ArmL.rotateAngleY + (float) Math.toRadians(0), ArmL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+150))*5.8), ElbowL.rotateAngleY + (float) Math.toRadians(0), ElbowL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-150))*-5), HandL.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-250))*-2.5), HandL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-150))*-5), ArmR.rotateAngleY + (float) Math.toRadians(0), ArmR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+150))*5.8), ElbowR.rotateAngleY + (float) Math.toRadians(0), ElbowR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-150))*-5), HandR.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-250))*-2.5), HandR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+560))*1.85), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*1.8), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-180))*1.2));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+560))*0.85), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-100))*1.5), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+180))*1.8));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+180))*0.85), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-170))*1.5), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+180))*1.2));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+560))*0.85), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+150))*1.5));


        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*2.5), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -27.5 + (((tickAnim - 0) / 3) * (36.67-(-27.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 36.67 + (((tickAnim - 3) / 5) * (0-(36.67)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (-2.22-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -2.22 + (((tickAnim - 11) / 4) * (-27.5-(-2.22)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL2, FootL2.rotateAngleX + (float) Math.toRadians(xx), FootL2.rotateAngleY + (float) Math.toRadians(yy), FootL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-2.22-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -2.22 + (((tickAnim - 3) / 5) * (-27.5-(-2.22)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -27.5 + (((tickAnim - 8) / 2) * (36.67-(-27.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 36.67 + (((tickAnim - 10) / 5) * (0-(36.67)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR2, FootR2.rotateAngleX + (float) Math.toRadians(xx), FootR2.rotateAngleY + (float) Math.toRadians(yy), FootR2.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCamptosaurus entity = (EntityPrehistoricFloraCamptosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Camptosaurus, Camptosaurus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-0.85), Camptosaurus.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1), Camptosaurus.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 10) * (-1.25-(-1)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -1.25 + (((tickAnim - 10) / 10) * (-1-(-1.25)));
            zz = -2.25 + (((tickAnim - 10) / 10) * (0-(-2.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -1 + (((tickAnim - 20) / 10) * (-1.25-(-1)));
            zz = 0 + (((tickAnim - 20) / 10) * (-2.25-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -1.25 + (((tickAnim - 30) / 10) * (-1-(-1.25)));
            zz = -2.25 + (((tickAnim - 30) / 10) * (0-(-2.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Camptosaurus.rotationPointX = this.Camptosaurus.rotationPointX + (float)(xx);
        this.Camptosaurus.rotationPointY = this.Camptosaurus.rotationPointY - (float)(yy);
        this.Camptosaurus.rotationPointZ = this.Camptosaurus.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.2));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1.2), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.2));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1.4), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.2));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-1.4), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1.6), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.2));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-1.6), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.8), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1.2));



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 37.49437 + (((tickAnim - 0) / 14) * (-17.50563-(37.49437)));
            yy = -0.45101 + (((tickAnim - 0) / 14) * (-0.45101-(-0.45101)));
            zz = 1.4306 + (((tickAnim - 0) / 14) * (1.4306-(1.4306)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -17.50563 + (((tickAnim - 14) / 6) * (-22.50563-(-17.50563)));
            yy = -0.45101 + (((tickAnim - 14) / 6) * (-0.45101-(-0.45101)));
            zz = 1.4306 + (((tickAnim - 14) / 6) * (1.4306-(1.4306)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -22.50563 + (((tickAnim - 20) / 20) * (37.49437-(-22.50563)));
            yy = -0.45101 + (((tickAnim - 20) / 20) * (-0.45101-(-0.45101)));
            zz = 1.4306 + (((tickAnim - 20) / 20) * (1.4306-(1.4306)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (1-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 1 + (((tickAnim - 26) / 4) * (0-(1)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (1.25-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 1.25 + (((tickAnim - 35) / 5) * (0-(1.25)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegL.rotationPointX = this.LegL.rotationPointX + (float)(xx);
        this.LegL.rotationPointY = this.LegL.rotationPointY - (float)(yy);
        this.LegL.rotationPointZ = this.LegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -20.25 + (((tickAnim - 0) / 4) * (13.81-(-20.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 13.81 + (((tickAnim - 4) / 4) * (24.58-(13.81)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 24.58 + (((tickAnim - 8) / 3) * (32.29-(24.58)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 32.29 + (((tickAnim - 11) / 3) * (-4.09-(32.29)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -4.09 + (((tickAnim - 14) / 6) * (-12.75-(-4.09)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -12.75 + (((tickAnim - 20) / 10) * (-4-(-12.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -4 + (((tickAnim - 30) / 10) * (-20.25-(-4)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));

        this.KneeL.rotationPointX = this.KneeL.rotationPointX + (float)(0);
        this.KneeL.rotationPointY = this.KneeL.rotationPointY - (float)(0);
        this.KneeL.rotationPointZ = this.KneeL.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 6.5 + (((tickAnim - 0) / 4) * (-2.04-(6.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -2.04 + (((tickAnim - 4) / 4) * (8.69-(-2.04)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 8.69 + (((tickAnim - 8) / 3) * (-40.31-(8.69)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -40.31 + (((tickAnim - 11) / 3) * (-47.3-(-40.31)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -47.3 + (((tickAnim - 14) / 6) * (1.5-(-47.3)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1.5 + (((tickAnim - 20) / 10) * (-27.25-(1.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -27.25 + (((tickAnim - 30) / 10) * (6.5-(-27.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -23.74734 + (((tickAnim - 0) / 8) * (52.71099-(-23.74734)));
            yy = -0.32142 + (((tickAnim - 0) / 8) * (-0.32142-(-0.32142)));
            zz = -0.94694 + (((tickAnim - 0) / 8) * (-0.94694-(-0.94694)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 52.71099 + (((tickAnim - 8) / 6) * (80.73182-(52.71099)));
            yy = -0.32142 + (((tickAnim - 8) / 6) * (-0.32142-(-0.32142)));
            zz = -0.94694 + (((tickAnim - 8) / 6) * (-0.94694-(-0.94694)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 80.73182 + (((tickAnim - 14) / 6) * (33.75266-(80.73182)));
            yy = -0.32142 + (((tickAnim - 14) / 6) * (-0.32142-(-0.32142)));
            zz = -0.94694 + (((tickAnim - 14) / 6) * (-0.94694-(-0.94694)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 33.75266 + (((tickAnim - 20) / 10) * (23.75266-(33.75266)));
            yy = -0.32142 + (((tickAnim - 20) / 10) * (-0.32142-(-0.32142)));
            zz = -0.94694 + (((tickAnim - 20) / 10) * (-0.94694-(-0.94694)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 23.75266 + (((tickAnim - 30) / 10) * (-23.74734-(23.75266)));
            yy = -0.32142 + (((tickAnim - 30) / 10) * (-0.32142-(-0.32142)));
            zz = -0.94694 + (((tickAnim - 30) / 10) * (-0.94694-(-0.94694)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FootL.rotationPointX = this.FootL.rotationPointX + (float)(xx);
        this.FootL.rotationPointY = this.FootL.rotationPointY - (float)(yy);
        this.FootL.rotationPointZ = this.FootL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -22.50563 + (((tickAnim - 0) / 20) * (37.49437-(-22.50563)));
            yy = -0.45101 + (((tickAnim - 0) / 20) * (-0.45101-(-0.45101)));
            zz = 1.4306 + (((tickAnim - 0) / 20) * (1.4306-(1.4306)));
        }
        else if (tickAnim >= 20 && tickAnim < 34) {
            xx = 37.49437 + (((tickAnim - 20) / 14) * (-17.50563-(37.49437)));
            yy = -0.45101 + (((tickAnim - 20) / 14) * (-0.45101-(-0.45101)));
            zz = 1.4306 + (((tickAnim - 20) / 14) * (1.4306-(1.4306)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -17.50563 + (((tickAnim - 34) / 6) * (-22.50563-(-17.50563)));
            yy = -0.45101 + (((tickAnim - 34) / 6) * (-0.45101-(-0.45101)));
            zz = 1.4306 + (((tickAnim - 34) / 6) * (1.4306-(1.4306)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 6) / 3) * (0.06-(1)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0.06 + (((tickAnim - 9) / 5) * (1.16-(0.06)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 1.16 + (((tickAnim - 14) / 6) * (0-(1.16)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegR.rotationPointX = this.LegR.rotationPointX + (float)(xx);
        this.LegR.rotationPointY = this.LegR.rotationPointY - (float)(yy);
        this.LegR.rotationPointZ = this.LegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -12.75 + (((tickAnim - 0) / 10) * (-4-(-12.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -4 + (((tickAnim - 10) / 10) * (-20.25-(-4)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -20.25 + (((tickAnim - 20) / 4) * (13.81-(-20.25)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 13.81 + (((tickAnim - 24) / 4) * (24.58-(13.81)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 24.58 + (((tickAnim - 28) / 3) * (32.29-(24.58)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 32.29 + (((tickAnim - 31) / 3) * (-4.09-(32.29)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -4.09 + (((tickAnim - 34) / 6) * (-12.75-(-4.09)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(KneeR, KneeR.rotateAngleX + (float) Math.toRadians(xx), KneeR.rotateAngleY + (float) Math.toRadians(yy), KneeR.rotateAngleZ + (float) Math.toRadians(zz));

        this.KneeR.rotationPointX = this.KneeR.rotationPointX + (float)(0);
        this.KneeR.rotationPointY = this.KneeR.rotationPointY - (float)(0);
        this.KneeR.rotationPointZ = this.KneeR.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1.5 + (((tickAnim - 0) / 10) * (-27.25-(1.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -27.25 + (((tickAnim - 10) / 10) * (6.5-(-27.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 6.5 + (((tickAnim - 20) / 4) * (-2.04-(6.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -2.04 + (((tickAnim - 24) / 4) * (8.69-(-2.04)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 8.69 + (((tickAnim - 28) / 3) * (-40.31-(8.69)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -40.31 + (((tickAnim - 31) / 3) * (-47.3-(-40.31)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -47.3 + (((tickAnim - 34) / 6) * (1.5-(-47.3)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(MetatarsalR, MetatarsalR.rotateAngleX + (float) Math.toRadians(xx), MetatarsalR.rotateAngleY + (float) Math.toRadians(yy), MetatarsalR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 33.75266 + (((tickAnim - 0) / 10) * (23.75266-(33.75266)));
            yy = -0.32142 + (((tickAnim - 0) / 10) * (-0.32142-(-0.32142)));
            zz = -0.94694 + (((tickAnim - 0) / 10) * (-0.94694-(-0.94694)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 23.75266 + (((tickAnim - 10) / 10) * (-23.74734-(23.75266)));
            yy = -0.32142 + (((tickAnim - 10) / 10) * (-0.32142-(-0.32142)));
            zz = -0.94694 + (((tickAnim - 10) / 10) * (-0.94694-(-0.94694)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -23.74734 + (((tickAnim - 20) / 8) * (52.71099-(-23.74734)));
            yy = -0.32142 + (((tickAnim - 20) / 8) * (-0.32142-(-0.32142)));
            zz = -0.94694 + (((tickAnim - 20) / 8) * (-0.94694-(-0.94694)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 52.71099 + (((tickAnim - 28) / 6) * (80.73182-(52.71099)));
            yy = -0.32142 + (((tickAnim - 28) / 6) * (-0.32142-(-0.32142)));
            zz = -0.94694 + (((tickAnim - 28) / 6) * (-0.94694-(-0.94694)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 80.73182 + (((tickAnim - 34) / 6) * (33.75266-(80.73182)));
            yy = -0.32142 + (((tickAnim - 34) / 6) * (-0.32142-(-0.32142)));
            zz = -0.94694 + (((tickAnim - 34) / 6) * (-0.94694-(-0.94694)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));

        this.FootR.rotationPointX = this.FootR.rotationPointX + (float)(0);
        this.FootR.rotationPointY = this.FootR.rotationPointY - (float)(0);
        this.FootR.rotationPointZ = this.FootR.rotationPointZ + (float)(0);


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*0.62), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*1.89), Chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1.2), Chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));


        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3), ArmL.rotateAngleY + (float) Math.toRadians(0), ArmL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*3.5), ElbowL.rotateAngleY + (float) Math.toRadians(0), ElbowL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*2), HandL.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-0.5), HandL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3), ArmR.rotateAngleY + (float) Math.toRadians(0), ArmR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*3.5), ElbowR.rotateAngleY + (float) Math.toRadians(0), ElbowR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*2), HandR.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-0.5), HandR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*0.25), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1.5), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*0.35), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1.2), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1.5));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*0.45), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.2), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*0.85), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(0), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = -13 + (((tickAnim - 2) / 6) * (35-(-13)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 35 + (((tickAnim - 8) / 12) * (0-(35)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL2, FootL2.rotateAngleX + (float) Math.toRadians(xx), FootL2.rotateAngleY + (float) Math.toRadians(yy), FootL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (-13-(0)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -13 + (((tickAnim - 22) / 6) * (35-(-13)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 35 + (((tickAnim - 28) / 12) * (0-(35)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR2, FootR2.rotateAngleX + (float) Math.toRadians(xx), FootR2.rotateAngleY + (float) Math.toRadians(yy), FootR2.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCamptosaurus e = (EntityPrehistoricFloraCamptosaurus) entity;
        animator.update(entity);


    }
}
