package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSilesaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSilesaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Silesaurus;
    private final AdvancedModelRenderer LegL;
    private final AdvancedModelRenderer KneeL;
    private final AdvancedModelRenderer MetatarsalL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer LegR;
    private final AdvancedModelRenderer KneeR;
    private final AdvancedModelRenderer MetatarsalR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer ArmL;
    private final AdvancedModelRenderer ElbowL;
    private final AdvancedModelRenderer MetacarpalL;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer ArmR;
    private final AdvancedModelRenderer ElbowR;
    private final AdvancedModelRenderer MetacarpalR;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;

    private ModelAnimator animator;

    public ModelSilesaurus() {
        this.textureWidth = 95;
        this.textureHeight = 95;

        this.Silesaurus = new AdvancedModelRenderer(this);
        this.Silesaurus.setRotationPoint(0.0F, 0.8F, 3.0F);
        this.Silesaurus.cubeList.add(new ModelBox(Silesaurus, 0, 0, -5.5F, -2.0F, -4.0F, 11, 10, 10, 0.0F, false));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(5.4F, 2.0F, 0.0F);
        this.Silesaurus.addChild(LegL);
        this.setRotateAngle(LegL, -0.2182F, 0.0F, 0.0F);
        this.LegL.cubeList.add(new ModelBox(LegL, 58, 24, -3.0F, -1.0F, -2.1F, 4, 11, 6, 0.0F, false));

        this.KneeL = new AdvancedModelRenderer(this);
        this.KneeL.setRotationPoint(0.0F, 9.3F, -1.3F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 1.0472F, 0.0F, 0.0F);
        this.KneeL.cubeList.add(new ModelBox(KneeL, 23, 66, -2.5F, -0.2F, -0.9F, 3, 10, 3, 0.0F, false));
        this.KneeL.cubeList.add(new ModelBox(KneeL, 0, 42, -2.5F, -0.2F, -0.1F, 3, 10, 3, -0.001F, false));

        this.MetatarsalL = new AdvancedModelRenderer(this);
        this.MetatarsalL.setRotationPoint(-1.0F, 10.0F, 2.0F);
        this.KneeL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -1.0385F, 0.0F, 0.0F);
        this.MetatarsalL.cubeList.add(new ModelBox(MetatarsalL, 9, 73, -1.0F, -0.9F, -1.8F, 2, 8, 2, 0.0F, false));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, 0.2618F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootL.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0524F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 68, 16, -1.5F, -1.1F, -4.7F, 3, 1, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 69, 42, -1.5F, -0.6F, -4.7F, 3, 1, 5, -0.001F, false));

        this.LegR = new AdvancedModelRenderer(this);
        this.LegR.setRotationPoint(-5.4F, 2.0F, 0.0F);
        this.Silesaurus.addChild(LegR);
        this.setRotateAngle(LegR, -0.2182F, 0.0F, 0.0F);
        this.LegR.cubeList.add(new ModelBox(LegR, 58, 24, -1.0F, -1.0F, -2.1F, 4, 11, 6, 0.0F, true));

        this.KneeR = new AdvancedModelRenderer(this);
        this.KneeR.setRotationPoint(0.0F, 9.3F, -1.3F);
        this.LegR.addChild(KneeR);
        this.setRotateAngle(KneeR, 1.0472F, 0.0F, 0.0F);
        this.KneeR.cubeList.add(new ModelBox(KneeR, 23, 66, -0.5F, -0.2F, -0.9F, 3, 10, 3, 0.0F, true));
        this.KneeR.cubeList.add(new ModelBox(KneeR, 0, 42, -0.5F, -0.2F, -0.1F, 3, 10, 3, -0.001F, true));

        this.MetatarsalR = new AdvancedModelRenderer(this);
        this.MetatarsalR.setRotationPoint(1.0F, 10.0F, 2.0F);
        this.KneeR.addChild(MetatarsalR);
        this.setRotateAngle(MetatarsalR, -1.0385F, 0.0F, 0.0F);
        this.MetatarsalR.cubeList.add(new ModelBox(MetatarsalR, 9, 73, -1.0F, -0.9F, -1.8F, 2, 8, 2, 0.0F, true));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.MetatarsalR.addChild(FootR);
        this.setRotateAngle(FootR, 0.2618F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootR.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0524F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 68, 16, -1.5F, -1.1F, -4.7F, 3, 1, 5, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 69, 42, -1.5F, -0.6F, -4.7F, 3, 1, 5, -0.001F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Silesaurus.addChild(Tail1);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 31, -4.0F, -2.0F, -1.0F, 8, 7, 11, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0436F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 27, 50, -3.0F, -1.4F, -1.0F, 6, 5, 10, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0524F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 42, -2.0F, -1.3F, -1.0F, 4, 3, 14, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.192F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 31, 5, -1.0F, -1.0F, -1.0F, 2, 2, 16, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Silesaurus.addChild(Body);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 21, -5.0F, -2.0F, -10.0F, 10, 10, 10, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.2F, -10.2F);
        this.Body.addChild(Chest);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 7.7F, -4.5F);
        this.Chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1222F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 50, 50, -4.0F, -1.8668F, 0.0948F, 8, 2, 6, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.8F, -1.8F);
        this.Chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 0, -4.0F, -2.6F, -3.6F, 8, 8, 7, 0.0F, false));

        this.ArmL = new AdvancedModelRenderer(this);
        this.ArmL.setRotationPoint(3.9F, 6.8F, -1.9F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.6109F, 0.0F, 0.0F);
        this.ArmL.cubeList.add(new ModelBox(ArmL, 50, 72, -2.0F, -1.0F, -2.0F, 3, 8, 3, 0.0F, false));

        this.ElbowL = new AdvancedModelRenderer(this);
        this.ElbowL.setRotationPoint(-0.5F, 6.7F, 0.6F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.7156F, 0.0F, 0.0F);
        this.ElbowL.cubeList.add(new ModelBox(ElbowL, 0, 73, -1.0F, 0.0F, -1.6F, 2, 9, 2, 0.0F, false));

        this.MetacarpalL = new AdvancedModelRenderer(this);
        this.MetacarpalL.setRotationPoint(0.0F, 8.9F, -1.4F);
        this.ElbowL.addChild(MetacarpalL);
        this.setRotateAngle(MetacarpalL, -0.0175F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.2F, 0.1F);
        this.MetacarpalL.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1222F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 42, -1.0F, 0.0F, 0.1F, 2, 2, 1, -0.002F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 46, -1.0F, 0.0F, -0.3F, 2, 2, 1, -0.001F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(0.0F, 1.4F, 1.3F);
        this.MetacarpalL.addChild(HandL);
        this.setRotateAngle(HandL, 0.0175F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.HandL.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.4486F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 5, -1.0F, -0.1903F, -0.2416F, 2, 3, 1, 0.0F, false));

        this.ArmR = new AdvancedModelRenderer(this);
        this.ArmR.setRotationPoint(-3.9F, 6.8F, -1.9F);
        this.Chest.addChild(ArmR);
        this.setRotateAngle(ArmR, 0.6109F, 0.0F, 0.0F);
        this.ArmR.cubeList.add(new ModelBox(ArmR, 50, 72, -1.0F, -1.0F, -2.0F, 3, 8, 3, 0.0F, true));

        this.ElbowR = new AdvancedModelRenderer(this);
        this.ElbowR.setRotationPoint(0.5F, 6.7F, 0.6F);
        this.ArmR.addChild(ElbowR);
        this.setRotateAngle(ElbowR, -0.7156F, 0.0F, 0.0F);
        this.ElbowR.cubeList.add(new ModelBox(ElbowR, 0, 73, -1.0F, 0.0F, -1.6F, 2, 9, 2, 0.0F, true));

        this.MetacarpalR = new AdvancedModelRenderer(this);
        this.MetacarpalR.setRotationPoint(0.0F, 8.9F, -1.4F);
        this.ElbowR.addChild(MetacarpalR);
        this.setRotateAngle(MetacarpalR, -0.0175F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.2F, 0.1F);
        this.MetacarpalR.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1222F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 23, 42, -1.0F, 0.0F, 0.1F, 2, 2, 1, -0.002F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 23, 46, -1.0F, 0.0F, -0.3F, 2, 2, 1, -0.001F, true));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(0.0F, 1.4F, 1.3F);
        this.MetacarpalR.addChild(HandR);
        this.setRotateAngle(HandR, 0.0175F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.HandR.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.4486F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 5, -1.0F, -0.1903F, -0.2416F, 2, 3, 1, 0.0F, true));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 1.5F, -3.8F);
        this.Chest.addChild(Neck3);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.7F, 0.0F);
        this.Neck3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3491F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 60, -2.5F, -0.2F, -4.0F, 5, 6, 6, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.3F, -4.0F);
        this.Neck3.addChild(Neck2);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Neck2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4974F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 53, 59, -2.0F, -1.6F, -5.6F, 4, 5, 7, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(-0.5F, -3.2F, -4.3F);
        this.Neck2.addChild(Neck1);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 36, 66, -1.5F, -0.7F, -3.7F, 4, 4, 4, -0.002F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 3.4F, -3.1F);
        this.Neck1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3491F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -0.5F, -1.26F, -0.1103F, 2, 2, 2, -0.002F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.2F, -3.6F);
        this.Neck1.addChild(Head);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.5F, -2.9F);
        this.Head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3142F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 33, 0, -1.0F, -0.0293F, -0.0169F, 4, 1, 3, -0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 1.1F, -3.8F);
        this.Head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.5934F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 26, -0.5F, -0.0235F, 0.0647F, 3, 1, 1, -0.002F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.5F, -4.7F);
        this.Head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.384F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 75, -1.0F, -0.0572F, -0.051F, 3, 1, 2, -0.001F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 3.1F, -7.2F);
        this.Head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.5934F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 48, 0, -0.5F, 0.0143F, -0.0837F, 2, 1, 3, -0.001F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.Head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2967F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 62, 16, -0.5F, 0.7F, -7.7F, 2, 1, 1, 0.001F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 23, 50, -1.0F, 0.7F, -6.7F, 3, 1, 3, -0.001F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 31, 24, -1.5F, -0.3F, -3.7F, 4, 2, 4, 0.001F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 17, 60, -0.5F, 0.3F, -7.7F, 2, 1, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 21, -0.8F, 1.0F, -6.7F, 0, 1, 3, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 21, 1.8F, 1.0F, -6.7F, 0, 1, 3, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 33, 5, -1.0F, 0.3F, -6.7F, 3, 1, 3, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.8F, 0.7F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.4276F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 63, 72, -1.5F, -0.1F, -4.0F, 4, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 69, 59, -1.5F, 0.6F, -4.0F, 4, 1, 4, -0.001F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 73, 23, -1.0F, -0.1F, -7.0F, 3, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 50, 50, 1.79F, -0.8F, -7.0F, 0, 1, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 50, 50, -0.79F, -0.8F, -7.0F, 0, 1, 2, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 48, 24, -1.5F, -2.0F, -3.1F, 4, 2, 3, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, -6.8F);
        this.Jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3491F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 24, -0.5F, -0.14F, -0.6F, 2, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, -6.8F);
        this.Jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.9599F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 4, 21, 0.0F, 0.02F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.6F, -4.0F);
        this.Jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2269F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 52, 16, -1.0F, -1.0314F, -2.9264F, 3, 1, 3, -0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.6F, -4.0F);
        this.Jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2269F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 73, 49, -0.5F, -1.0F, 0.1F, 2, 1, 3, -0.001F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Silesaurus.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.Neck.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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

        EntityPrehistoricFloraSilesaurus entitySilesaurus = (EntityPrehistoricFloraSilesaurus) e;

        this.faceTarget(f3, f4, 12, Neck1);
        this.faceTarget(f3, f4, 12, Neck2);
        this.faceTarget(f3, f4, 12, Neck3);
        this.faceTarget(f3, f4, 12, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entitySilesaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {
                    if (entitySilesaurus.getAnimation() != entitySilesaurus.EAT_ANIMATION
                        && entitySilesaurus.getAnimation() != entitySilesaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraSilesaurus ee = (EntityPrehistoricFloraSilesaurus) entitylivingbaseIn;

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
            //animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            //animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            //animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            //animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSilesaurus entity = (EntityPrehistoricFloraSilesaurus) entitylivingbaseIn;

    }



    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSilesaurus entity = (EntityPrehistoricFloraSilesaurus) entitylivingbaseIn;

        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2.49979D + (((tickAnim - 0D) / 5D) * (2.49979D-(2.49979D)));
            yy = 2.38861D + (((tickAnim - 0D) / 5D) * (-2.38861D-(2.38861D)));
            zz = 2.60663D + (((tickAnim - 0D) / 5D) * (-2.60663D-(2.60663D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 2.49979D + (((tickAnim - 5D) / 5D) * (2.49979D-(2.49979D)));
            yy = -2.38861D + (((tickAnim - 5D) / 5D) * (2.38861D-(-2.38861D)));
            zz = -2.60663D + (((tickAnim - 5D) / 5D) * (2.60663D-(-2.60663D)));
        }
        this.setRotateAngle(Silesaurus, Silesaurus.rotateAngleX + (float) Math.toRadians(xx), Silesaurus.rotateAngleY + (float) Math.toRadians(yy), Silesaurus.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = -1.3D + (((tickAnim - 0D) / 3D) * (-0.3D-(-1.3D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = -0.3D + (((tickAnim - 3D) / 2D) * (-1.3D-(-0.3D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            yy = -1.3D + (((tickAnim - 5D) / 3D) * (-0.3D-(-1.3D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            yy = -0.3D + (((tickAnim - 8D) / 2D) * (-1.5D-(-0.3D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.Silesaurus.offsetX = (float) Math.toRadians(xx);
        this.Silesaurus.offsetY = (float) Math.toRadians(yy);
        this.Silesaurus.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -45D + (((tickAnim - 0D) / 2D) * (-17.47722D-(-45D)));
            yy = -14D + (((tickAnim - 0D) / 2D) * (-10.66974D-(-14D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (-0.14502D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -17.47722D + (((tickAnim - 2D) / 1D) * (7.53418D-(-17.47722D)));
            yy = -10.66974D + (((tickAnim - 2D) / 1D) * (-9.00461D-(-10.66974D)));
            zz = -0.14502D + (((tickAnim - 2D) / 1D) * (-0.21753D-(-0.14502D)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 7.53418D + (((tickAnim - 3D) / 0D) * (10.8789D-(7.53418D)));
            yy = -9.00461D + (((tickAnim - 3D) / 0D) * (-7.33947D-(-9.00461D)));
            zz = -0.21753D + (((tickAnim - 3D) / 0D) * (-0.29003D-(-0.21753D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10.8789D + (((tickAnim - 3D) / 2D) * (12.56835D-(10.8789D)));
            yy = -7.33947D + (((tickAnim - 3D) / 2D) * (-4.00921D-(-7.33947D)));
            zz = -0.29003D + (((tickAnim - 3D) / 2D) * (-0.43505D-(-0.29003D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 12.56835D + (((tickAnim - 5D) / 5D) * (-45D-(12.56835D)));
            yy = -4.00921D + (((tickAnim - 5D) / 5D) * (-14D-(-4.00921D)));
            zz = -0.43505D + (((tickAnim - 5D) / 5D) * (0D-(-0.43505D)));
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -30D + (((tickAnim - 0D) / 1D) * (0.42D-(-30D)));
            yy = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0.42D + (((tickAnim - 1D) / 1D) * (8.34D-(0.42D)));
            yy = 0D + (((tickAnim - 1D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 1D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 8.34D + (((tickAnim - 2D) / 1D) * (-3.75D-(8.34D)));
            yy = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -3.75D + (((tickAnim - 3D) / 0D) * (15.5D-(-3.75D)));
            yy = 0D + (((tickAnim - 3D) / 0D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 15.5D + (((tickAnim - 3D) / 2D) * (20D-(15.5D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 20D + (((tickAnim - 5D) / 3D) * (43.75D-(20D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 43.75D + (((tickAnim - 8D) / 1D) * (2.08D-(43.75D)));
            yy = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 2.08D + (((tickAnim - 9D) / 1D) * (-30D-(2.08D)));
            yy = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 37.5D + (((tickAnim - 0D) / 1D) * (-9.17D-(37.5D)));
            yy = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -9.17D + (((tickAnim - 1D) / 2D) * (-7.5D-(-9.17D)));
            yy = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -7.5D + (((tickAnim - 3D) / 0D) * (16.67D-(-7.5D)));
            yy = 0D + (((tickAnim - 3D) / 0D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 16.67D + (((tickAnim - 3D) / 2D) * (37.5D-(16.67D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 37.5D + (((tickAnim - 5D) / 3D) * (-60D-(37.5D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -60D + (((tickAnim - 8D) / 1D) * (-42.5D-(-60D)));
            yy = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -42.5D + (((tickAnim - 9D) / 1D) * (37.5D-(-42.5D)));
            yy = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 37.5D + (((tickAnim - 0D) / 1D) * (37.92D-(37.5D)));
            yy = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 37.92D + (((tickAnim - 1D) / 1D) * (12.09D-(37.92D)));
            yy = 0D + (((tickAnim - 1D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 1D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 12.09D + (((tickAnim - 2D) / 1D) * (1.25D-(12.09D)));
            yy = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 1.25D + (((tickAnim - 3D) / 0D) * (25D-(1.25D)));
            yy = 0D + (((tickAnim - 3D) / 0D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 25D + (((tickAnim - 3D) / 2D) * (107.5D-(25D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 107.5D + (((tickAnim - 5D) / 3D) * (176.25D-(107.5D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 176.25D + (((tickAnim - 8D) / 1D) * (106.25D-(176.25D)));
            yy = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 106.25D + (((tickAnim - 9D) / 1D) * (37.5D-(106.25D)));
            yy = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.56835D + (((tickAnim - 0D) / 5D) * (-45D-(12.56835D)));
            yy = 4.00921D + (((tickAnim - 0D) / 5D) * (14D-(4.00921D)));
            zz = 0.43505D + (((tickAnim - 0D) / 5D) * (0D-(0.43505D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -45D + (((tickAnim - 5D) / 2D) * (-17.47722D-(-45D)));
            yy = 14D + (((tickAnim - 5D) / 2D) * (10.66974D-(14D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0.14502D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -17.47722D + (((tickAnim - 7D) / 1D) * (7.53418D-(-17.47722D)));
            yy = 10.66974D + (((tickAnim - 7D) / 1D) * (9.00461D-(10.66974D)));
            zz = 0.14502D + (((tickAnim - 7D) / 1D) * (0.21753D-(0.14502D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 7.53418D + (((tickAnim - 8D) / 0D) * (10.8789D-(7.53418D)));
            yy = 9.00461D + (((tickAnim - 8D) / 0D) * (7.33947D-(9.00461D)));
            zz = 0.21753D + (((tickAnim - 8D) / 0D) * (0.29003D-(0.21753D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10.8789D + (((tickAnim - 8D) / 2D) * (12.56835D-(10.8789D)));
            yy = 7.33947D + (((tickAnim - 8D) / 2D) * (4.00921D-(7.33947D)));
            zz = 0.29003D + (((tickAnim - 8D) / 2D) * (0.43505D-(0.29003D)));
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20D + (((tickAnim - 0D) / 3D) * (43.75D-(20D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 43.75D + (((tickAnim - 3D) / 1D) * (2.08D-(43.75D)));
            yy = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 2.08D + (((tickAnim - 4D) / 1D) * (-30D-(2.08D)));
            yy = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -30D + (((tickAnim - 5D) / 1D) * (0.42D-(-30D)));
            yy = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0.42D + (((tickAnim - 6D) / 1D) * (8.34D-(0.42D)));
            yy = 0D + (((tickAnim - 6D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 8.34D + (((tickAnim - 7D) / 1D) * (-3.75D-(8.34D)));
            yy = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -3.75D + (((tickAnim - 8D) / 0D) * (15.5D-(-3.75D)));
            yy = 0D + (((tickAnim - 8D) / 0D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 15.5D + (((tickAnim - 8D) / 2D) * (20D-(15.5D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(KneeR, KneeR.rotateAngleX + (float) Math.toRadians(xx), KneeR.rotateAngleY + (float) Math.toRadians(yy), KneeR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 37.5D + (((tickAnim - 0D) / 3D) * (-60D-(37.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -60D + (((tickAnim - 3D) / 1D) * (-42.5D-(-60D)));
            yy = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -42.5D + (((tickAnim - 4D) / 1D) * (37.5D-(-42.5D)));
            yy = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 37.5D + (((tickAnim - 5D) / 1D) * (-9.17D-(37.5D)));
            yy = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -9.17D + (((tickAnim - 6D) / 2D) * (-7.5D-(-9.17D)));
            yy = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -7.5D + (((tickAnim - 8D) / 0D) * (16.67D-(-7.5D)));
            yy = 0D + (((tickAnim - 8D) / 0D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 16.67D + (((tickAnim - 8D) / 2D) * (37.5D-(16.67D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(MetatarsalR, MetatarsalR.rotateAngleX + (float) Math.toRadians(xx), MetatarsalR.rotateAngleY + (float) Math.toRadians(yy), MetatarsalR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 107.5D + (((tickAnim - 0D) / 3D) * (176.25D-(107.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 176.25D + (((tickAnim - 3D) / 1D) * (106.25D-(176.25D)));
            yy = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 106.25D + (((tickAnim - 4D) / 1D) * (37.5D-(106.25D)));
            yy = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 37.5D + (((tickAnim - 5D) / 1D) * (37.92D-(37.5D)));
            yy = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 37.92D + (((tickAnim - 6D) / 1D) * (12.09D-(37.92D)));
            yy = 0D + (((tickAnim - 6D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 12.09D + (((tickAnim - 7D) / 1D) * (1.25D-(12.09D)));
            yy = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 1.25D + (((tickAnim - 8D) / 0D) * (25D-(1.25D)));
            yy = 0D + (((tickAnim - 8D) / 0D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25D + (((tickAnim - 8D) / 2D) * (107.5D-(25D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -42.59709D + (((tickAnim - 0D) / 1D) * (-32.59709D-(-42.59709D)));
            yy = 4.87088D + (((tickAnim - 0D) / 1D) * (4.87088D-(4.87088D)));
            zz = 13.69794D + (((tickAnim - 0D) / 1D) * (13.69794D-(13.69794D)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = -32.59709D + (((tickAnim - 1D) / 4D) * (-42.59709D-(-32.59709D)));
            yy = 4.87088D + (((tickAnim - 1D) / 4D) * (4.87088D-(4.87088D)));
            zz = 13.69794D + (((tickAnim - 1D) / 4D) * (13.69794D-(13.69794D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -42.59709D + (((tickAnim - 5D) / 1D) * (-32.59709D-(-42.59709D)));
            yy = 4.87088D + (((tickAnim - 5D) / 1D) * (4.87088D-(4.87088D)));
            zz = 13.69794D + (((tickAnim - 5D) / 1D) * (13.69794D-(13.69794D)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -32.59709D + (((tickAnim - 6D) / 4D) * (-42.59709D-(-32.59709D)));
            yy = 4.87088D + (((tickAnim - 6D) / 4D) * (4.87088D-(4.87088D)));
            zz = 13.69794D + (((tickAnim - 6D) / 4D) * (13.69794D-(13.69794D)));
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -67.5D + (((tickAnim - 0D) / 2D) * (-60D-(-67.5D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -60D + (((tickAnim - 2D) / 3D) * (-67.5D-(-60D)));
            yy = 0D + (((tickAnim - 2D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -67.5D + (((tickAnim - 5D) / 2D) * (-60D-(-67.5D)));
            yy = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -60D + (((tickAnim - 7D) / 3D) * (-67.5D-(-60D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(MetacarpalL, MetacarpalL.rotateAngleX + (float) Math.toRadians(22.5), MetacarpalL.rotateAngleY + (float) Math.toRadians(0), MetacarpalL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(135), HandL.rotateAngleY + (float) Math.toRadians(0), HandL.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -42.59709D + (((tickAnim - 0D) / 1D) * (-32.59709D-(-42.59709D)));
            yy = -4.87088D + (((tickAnim - 0D) / 1D) * (-4.87088D-(-4.87088D)));
            zz = -13.69794D + (((tickAnim - 0D) / 1D) * (-13.69794D-(-13.69794D)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = -32.59709D + (((tickAnim - 1D) / 4D) * (-42.59709D-(-32.59709D)));
            yy = -4.87088D + (((tickAnim - 1D) / 4D) * (-4.87088D-(-4.87088D)));
            zz = -13.69794D + (((tickAnim - 1D) / 4D) * (-13.69794D-(-13.69794D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -42.59709D + (((tickAnim - 5D) / 1D) * (-32.59709D-(-42.59709D)));
            yy = -4.87088D + (((tickAnim - 5D) / 1D) * (-4.87088D-(-4.87088D)));
            zz = -13.69794D + (((tickAnim - 5D) / 1D) * (-13.69794D-(-13.69794D)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -32.59709D + (((tickAnim - 6D) / 4D) * (-42.59709D-(-32.59709D)));
            yy = -4.87088D + (((tickAnim - 6D) / 4D) * (-4.87088D-(-4.87088D)));
            zz = -13.69794D + (((tickAnim - 6D) / 4D) * (-13.69794D-(-13.69794D)));
        }
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -67.5D + (((tickAnim - 0D) / 2D) * (-60D-(-67.5D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -60D + (((tickAnim - 2D) / 3D) * (-67.5D-(-60D)));
            yy = 0D + (((tickAnim - 2D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 2D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -67.5D + (((tickAnim - 5D) / 2D) * (-60D-(-67.5D)));
            yy = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -60D + (((tickAnim - 7D) / 3D) * (-67.5D-(-60D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(xx), ElbowR.rotateAngleY + (float) Math.toRadians(yy), ElbowR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(MetacarpalR, MetacarpalR.rotateAngleX + (float) Math.toRadians(22.5), MetacarpalR.rotateAngleY + (float) Math.toRadians(0), MetacarpalR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(135), HandR.rotateAngleY + (float) Math.toRadians(0), HandR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*720/0.5+30))*2), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*360/0.5+60))*5), Tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*720/0.5+30))*2), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*360/0.5+60))*5), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*720/0.5-90))*6), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*360/0.5-60))*6), Tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*720/0.5-150))*8), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*360/0.5-120))*8), Tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*720/0.5+90))*2.5), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*360/0.5+110))*0.5), Body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*720/0.5+150))*-2.5), Chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*360/0.5+170))*0.5), Chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*720/0.5+210))*1), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*360/0.5+230))*1), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*720/0.5+270))*1), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*360/0.5+290))*1), Neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*720/0.5+270))*1), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*360/0.5+290))*1), Neck1.rotateAngleZ + (float) Math.toRadians(0));



        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-17.5+Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*360/0.5+360))*0.25), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*180/0.5+510))*1), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*180/0.5-100))*2));


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraSilesaurus entity = (EntityPrehistoricFloraSilesaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0.10912D + (((tickAnim - 0D) / 10D) * (-0.10912D-(-0.10912D)));
            yy = 2.49762D + (((tickAnim - 0D) / 10D) * (-2.49762D-(2.49762D)));
            zz = 2.49762D + (((tickAnim - 0D) / 10D) * (-2.49762D-(2.49762D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.10912D + (((tickAnim - 10D) / 10D) * (-0.10912D-(-0.10912D)));
            yy = -2.49762D + (((tickAnim - 10D) / 10D) * (2.49762D-(-2.49762D)));
            zz = -2.49762D + (((tickAnim - 10D) / 10D) * (2.49762D-(-2.49762D)));
        }
        this.setRotateAngle(Silesaurus, Silesaurus.rotateAngleX + (float) Math.toRadians(xx), Silesaurus.rotateAngleY + (float) Math.toRadians(yy), Silesaurus.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = -2D + (((tickAnim - 0D) / 5D) * (-1.5D-(-2D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = -1.5D + (((tickAnim - 5D) / 5D) * (-2D-(-1.5D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            yy = -2D + (((tickAnim - 10D) / 5D) * (-1.5D-(-2D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
            yy = -1.5D + (((tickAnim - 15D) / 5D) * (-2D-(-1.5D)));
            zz = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
        }
        this.Silesaurus.offsetX = (float) Math.toRadians(xx);
        this.Silesaurus.offsetY = (float) Math.toRadians(yy);
        this.Silesaurus.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -40.23498D + (((tickAnim - 0D) / 10D) * (17.519D-(-40.23498D)));
            yy = -10.97013D + (((tickAnim - 0D) / 10D) * (-4.98093D-(-10.97013D)));
            zz = -2.11102D + (((tickAnim - 0D) / 10D) * (-0.43688D-(-2.11102D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 17.519D + (((tickAnim - 10D) / 3D) * (3.36281D-(17.519D)));
            yy = -4.98093D + (((tickAnim - 10D) / 3D) * (-4.35309D-(-4.98093D)));
            zz = -0.43688D + (((tickAnim - 10D) / 3D) * (-1.351D-(-0.43688D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 3.36281D + (((tickAnim - 13D) / 4D) * (-36.56181D-(3.36281D)));
            yy = -4.35309D + (((tickAnim - 13D) / 4D) * (-15.48806D-(-4.35309D)));
            zz = -1.351D + (((tickAnim - 13D) / 4D) * (2.61005D-(-1.351D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -36.56181D + (((tickAnim - 17D) / 3D) * (-40.23498D-(-36.56181D)));
            yy = -15.48806D + (((tickAnim - 17D) / 3D) * (-10.97013D-(-15.48806D)));
            zz = 2.61005D + (((tickAnim - 17D) / 3D) * (-2.11102D-(2.61005D)));
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (-3.12D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -3.12D + (((tickAnim - 3D) / 7D) * (32.5D-(-3.12D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 32.5D + (((tickAnim - 10D) / 4D) * (-52.5D-(32.5D)));
            yy = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -52.5D + (((tickAnim - 14D) / 3D) * (-45D-(-52.5D)));
            yy = 0D + (((tickAnim - 14D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -45D + (((tickAnim - 17D) / 3D) * (0D-(-45D)));
            yy = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
        }
        this.setRotateAngle(MetatarsalL, MetatarsalL.rotateAngleX + (float) Math.toRadians(xx), MetatarsalL.rotateAngleY + (float) Math.toRadians(yy), MetatarsalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 30D + (((tickAnim - 0D) / 5D) * (-12.5D-(30D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -12.5D + (((tickAnim - 5D) / 3D) * (-16.18539D-(-12.5D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0.26444D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0.83014D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -16.18539D + (((tickAnim - 8D) / 2D) * (5.12923D-(-16.18539D)));
            yy = 0.26444D + (((tickAnim - 8D) / 2D) * (0.52889D-(0.26444D)));
            zz = 0.83014D + (((tickAnim - 8D) / 2D) * (1.66027D-(0.83014D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 5.12923D + (((tickAnim - 10D) / 4D) * (116.69D-(5.12923D)));
            yy = 0.52889D + (((tickAnim - 10D) / 4D) * (0D-(0.52889D)));
            zz = 1.66027D + (((tickAnim - 10D) / 4D) * (0D-(1.66027D)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 116.69D + (((tickAnim - 14D) / 3D) * (118.38D-(116.69D)));
            yy = 0D + (((tickAnim - 14D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 118.38D + (((tickAnim - 17D) / 3D) * (30D-(118.38D)));
            yy = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.519D + (((tickAnim - 0D) / 3D) * (3.36281D-(17.519D)));
            yy = 4.98093D + (((tickAnim - 0D) / 3D) * (4.35309D-(4.98093D)));
            zz = 0.43688D + (((tickAnim - 0D) / 3D) * (1.351D-(0.43688D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 3.36281D + (((tickAnim - 3D) / 4D) * (-36.56181D-(3.36281D)));
            yy = 4.35309D + (((tickAnim - 3D) / 4D) * (15.48806D-(4.35309D)));
            zz = 1.351D + (((tickAnim - 3D) / 4D) * (-2.61005D-(1.351D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -36.56181D + (((tickAnim - 7D) / 3D) * (-40.23498D-(-36.56181D)));
            yy = 15.48806D + (((tickAnim - 7D) / 3D) * (10.97013D-(15.48806D)));
            zz = -2.61005D + (((tickAnim - 7D) / 3D) * (2.11102D-(-2.61005D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -40.23498D + (((tickAnim - 10D) / 10D) * (17.519D-(-40.23498D)));
            yy = 10.97013D + (((tickAnim - 10D) / 10D) * (4.98093D-(10.97013D)));
            zz = 2.11102D + (((tickAnim - 10D) / 10D) * (0.43688D-(2.11102D)));
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10D + (((tickAnim - 0D) / 4D) * (48.5D-(10D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 48.5D + (((tickAnim - 4D) / 3D) * (22.5D-(48.5D)));
            yy = 0D + (((tickAnim - 4D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 22.5D + (((tickAnim - 7D) / 3D) * (10D-(22.5D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 10D + (((tickAnim - 10D) / 3D) * (20D-(10D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 20D + (((tickAnim - 13D) / 2D) * (20D-(20D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 20D + (((tickAnim - 15D) / 5D) * (10D-(20D)));
            yy = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(KneeR, KneeR.rotateAngleX + (float) Math.toRadians(xx), KneeR.rotateAngleY + (float) Math.toRadians(yy), KneeR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 5.12923D + (((tickAnim - 0D) / 4D) * (116.69D-(5.12923D)));
            yy = -0.52889D + (((tickAnim - 0D) / 4D) * (0D-(-0.52889D)));
            zz = -1.66027D + (((tickAnim - 0D) / 4D) * (0D-(-1.66027D)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 116.69D + (((tickAnim - 4D) / 3D) * (118.38D-(116.69D)));
            yy = 0D + (((tickAnim - 4D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 118.38D + (((tickAnim - 7D) / 3D) * (30D-(118.38D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 30D + (((tickAnim - 10D) / 5D) * (-12.5D-(30D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -12.5D + (((tickAnim - 15D) / 3D) * (-16.18539D-(-12.5D)));
            yy = 0D + (((tickAnim - 15D) / 3D) * (-0.26444D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 3D) * (-0.83014D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -16.18539D + (((tickAnim - 18D) / 2D) * (5.12923D-(-16.18539D)));
            yy = -0.26444D + (((tickAnim - 18D) / 2D) * (-0.52889D-(-0.26444D)));
            zz = -0.83014D + (((tickAnim - 18D) / 2D) * (-1.66027D-(-0.83014D)));
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360/0.5+90))*2.5), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*180/0.5+110))*0.5), Body.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -22.41D + (((tickAnim - 0D) / 1D) * (-35.28046D-(-22.41D)));
            yy = 2.43D + (((tickAnim - 0D) / 1D) * (1.2326D-(2.43D)));
            zz = -13.14D + (((tickAnim - 0D) / 1D) * (-15.68992D-(-13.14D)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = -35.28046D + (((tickAnim - 1D) / 4D) * (-60.09417D-(-35.28046D)));
            yy = 1.2326D + (((tickAnim - 1D) / 4D) * (6.80431D-(1.2326D)));
            zz = -15.68992D + (((tickAnim - 1D) / 4D) * (-1.79762D-(-15.68992D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -60.09417D + (((tickAnim - 5D) / 3D) * (-12.40215D-(-60.09417D)));
            yy = 6.80431D + (((tickAnim - 5D) / 3D) * (6.2058D-(6.80431D)));
            zz = -1.79762D + (((tickAnim - 5D) / 3D) * (6.13112D-(-1.79762D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12.40215D + (((tickAnim - 8D) / 2D) * (14.59743D-(-12.40215D)));
            yy = 6.2058D + (((tickAnim - 8D) / 2D) * (-1.69573D-(6.2058D)));
            zz = 6.13112D + (((tickAnim - 8D) / 2D) * (8.41025D-(6.13112D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 14.59743D + (((tickAnim - 10D) / 5D) * (24.08135D-(14.59743D)));
            yy = -1.69573D + (((tickAnim - 10D) / 5D) * (7.47368D-(-1.69573D)));
            zz = 8.41025D + (((tickAnim - 10D) / 5D) * (3.31316D-(8.41025D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 24.08135D + (((tickAnim - 15D) / 3D) * (19.9859D-(24.08135D)));
            yy = 7.47368D + (((tickAnim - 15D) / 3D) * (8.87266D-(7.47368D)));
            zz = 3.31316D + (((tickAnim - 15D) / 3D) * (1.83489D-(3.31316D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 19.9859D + (((tickAnim - 18D) / 2D) * (-22.41D-(19.9859D)));
            yy = 8.87266D + (((tickAnim - 18D) / 2D) * (2.43D-(8.87266D)));
            zz = 1.83489D + (((tickAnim - 18D) / 2D) * (-13.14D-(1.83489D)));
        }
        this.setRotateAngle(ArmL, ArmL.rotateAngleX + (float) Math.toRadians(xx), ArmL.rotateAngleY + (float) Math.toRadians(yy), ArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 138.53111D + (((tickAnim - 0D) / 3D) * (66.60633D-(138.53111D)));
            yy = 3.43253D + (((tickAnim - 0D) / 3D) * (-11.11402D-(3.43253D)));
            zz = -3.64437D + (((tickAnim - 0D) / 3D) * (-0.37552D-(-3.64437D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 66.60633D + (((tickAnim - 3D) / 1D) * (25.98572D-(66.60633D)));
            yy = -11.11402D + (((tickAnim - 3D) / 1D) * (-8.90149D-(-11.11402D)));
            zz = -0.37552D + (((tickAnim - 3D) / 1D) * (-3.0855D-(-0.37552D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 25.98572D + (((tickAnim - 4D) / 1D) * (22.94049D-(25.98572D)));
            yy = -8.90149D + (((tickAnim - 4D) / 1D) * (-6.82608D-(-8.90149D)));
            zz = -3.0855D + (((tickAnim - 4D) / 1D) * (-3.88461D-(-3.0855D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 22.94049D + (((tickAnim - 5D) / 3D) * (19.28083D-(22.94049D)));
            yy = -6.82608D + (((tickAnim - 5D) / 3D) * (-3.23306D-(-6.82608D)));
            zz = -3.88461D + (((tickAnim - 5D) / 3D) * (0.9982D-(-3.88461D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 19.28083D + (((tickAnim - 8D) / 2D) * (3.53111D-(19.28083D)));
            yy = -3.23306D + (((tickAnim - 8D) / 2D) * (3.43253D-(-3.23306D)));
            zz = 0.9982D + (((tickAnim - 8D) / 2D) * (-3.64437D-(0.9982D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 3.53111D + (((tickAnim - 10D) / 3D) * (-15.73444D-(3.53111D)));
            yy = 3.43253D + (((tickAnim - 10D) / 3D) * (1.71627D-(3.43253D)));
            zz = -3.64437D + (((tickAnim - 10D) / 3D) * (-1.82218D-(-3.64437D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -15.73444D + (((tickAnim - 13D) / 2D) * (30D-(-15.73444D)));
            yy = 1.71627D + (((tickAnim - 13D) / 2D) * (0D-(1.71627D)));
            zz = -1.82218D + (((tickAnim - 13D) / 2D) * (0D-(-1.82218D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 30D + (((tickAnim - 15D) / 3D) * (169.85408D-(30D)));
            yy = 0D + (((tickAnim - 15D) / 3D) * (2.28836D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 3D) * (-2.42958D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 169.85408D + (((tickAnim - 18D) / 2D) * (138.53111D-(169.85408D)));
            yy = 2.28836D + (((tickAnim - 18D) / 2D) * (3.43253D-(2.28836D)));
            zz = -2.42958D + (((tickAnim - 18D) / 2D) * (-3.64437D-(-2.42958D)));
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 14.59743D + (((tickAnim - 0D) / 5D) * (24.08135D-(14.59743D)));
            yy = 1.69573D + (((tickAnim - 0D) / 5D) * (-7.47368D-(1.69573D)));
            zz = -8.41025D + (((tickAnim - 0D) / 5D) * (-3.31316D-(-8.41025D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 24.08135D + (((tickAnim - 5D) / 3D) * (19.9859D-(24.08135D)));
            yy = -7.47368D + (((tickAnim - 5D) / 3D) * (-8.87266D-(-7.47368D)));
            zz = -3.31316D + (((tickAnim - 5D) / 3D) * (-1.83489D-(-3.31316D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 19.9859D + (((tickAnim - 8D) / 3D) * (-35.28046D-(19.9859D)));
            yy = -8.87266D + (((tickAnim - 8D) / 3D) * (-1.2326D-(-8.87266D)));
            zz = -1.83489D + (((tickAnim - 8D) / 3D) * (15.68992D-(-1.83489D)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -35.28046D + (((tickAnim - 11D) / 4D) * (-60.09417D-(-35.28046D)));
            yy = -1.2326D + (((tickAnim - 11D) / 4D) * (-6.80431D-(-1.2326D)));
            zz = 15.68992D + (((tickAnim - 11D) / 4D) * (1.79762D-(15.68992D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -60.09417D + (((tickAnim - 15D) / 3D) * (-12.40215D-(-60.09417D)));
            yy = -6.80431D + (((tickAnim - 15D) / 3D) * (-6.2058D-(-6.80431D)));
            zz = 1.79762D + (((tickAnim - 15D) / 3D) * (-6.13112D-(1.79762D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -12.40215D + (((tickAnim - 18D) / 2D) * (14.59743D-(-12.40215D)));
            yy = -6.2058D + (((tickAnim - 18D) / 2D) * (1.69573D-(-6.2058D)));
            zz = -6.13112D + (((tickAnim - 18D) / 2D) * (-8.41025D-(-6.13112D)));
        }
        this.setRotateAngle(ArmR, ArmR.rotateAngleX + (float) Math.toRadians(xx), ArmR.rotateAngleY + (float) Math.toRadians(yy), ArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 5.01907D + (((tickAnim - 0D) / 5D) * (22.5D-(5.01907D)));
            yy = -1.1455D + (((tickAnim - 0D) / 5D) * (0D-(-1.1455D)));
            zz = 2.36173D + (((tickAnim - 0D) / 5D) * (0D-(2.36173D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 22.5D + (((tickAnim - 5D) / 5D) * (30D-(22.5D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 30D + (((tickAnim - 10D) / 5D) * (9.99157D-(30D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0.39097D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (-2.46926D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 9.99157D + (((tickAnim - 15D) / 3D) * (11.16415D-(9.99157D)));
            yy = 0.39097D + (((tickAnim - 15D) / 3D) * (-1.33089D-(0.39097D)));
            zz = -2.46926D + (((tickAnim - 15D) / 3D) * (7.38164D-(-2.46926D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 11.16415D + (((tickAnim - 18D) / 2D) * (5.01907D-(11.16415D)));
            yy = -1.33089D + (((tickAnim - 18D) / 2D) * (-1.1455D-(-1.33089D)));
            zz = 7.38164D + (((tickAnim - 18D) / 2D) * (2.36173D-(7.38164D)));
        }
        this.setRotateAngle(MetacarpalR, MetacarpalR.rotateAngleX + (float) Math.toRadians(xx), MetacarpalR.rotateAngleY + (float) Math.toRadians(yy), MetacarpalR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3.53111D + (((tickAnim - 0D) / 3D) * (-15.73444D-(3.53111D)));
            yy = -3.43253D + (((tickAnim - 0D) / 3D) * (-1.71627D-(-3.43253D)));
            zz = 3.64437D + (((tickAnim - 0D) / 3D) * (1.82218D-(3.64437D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15.73444D + (((tickAnim - 3D) / 2D) * (30D-(-15.73444D)));
            yy = -1.71627D + (((tickAnim - 3D) / 2D) * (0D-(-1.71627D)));
            zz = 1.82218D + (((tickAnim - 3D) / 2D) * (0D-(1.82218D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 30D + (((tickAnim - 5D) / 3D) * (169.85408D-(30D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (-2.28836D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (2.42958D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 169.85408D + (((tickAnim - 8D) / 2D) * (138.53111D-(169.85408D)));
            yy = -2.28836D + (((tickAnim - 8D) / 2D) * (-3.43253D-(-2.28836D)));
            zz = 2.42958D + (((tickAnim - 8D) / 2D) * (3.64437D-(2.42958D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 138.53111D + (((tickAnim - 10D) / 3D) * (66.60633D-(138.53111D)));
            yy = -3.43253D + (((tickAnim - 10D) / 3D) * (11.11402D-(-3.43253D)));
            zz = 3.64437D + (((tickAnim - 10D) / 3D) * (0.37552D-(3.64437D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 66.60633D + (((tickAnim - 13D) / 1D) * (25.98572D-(66.60633D)));
            yy = 11.11402D + (((tickAnim - 13D) / 1D) * (8.90149D-(11.11402D)));
            zz = 0.37552D + (((tickAnim - 13D) / 1D) * (3.0855D-(0.37552D)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 25.98572D + (((tickAnim - 14D) / 1D) * (22.94049D-(25.98572D)));
            yy = 8.90149D + (((tickAnim - 14D) / 1D) * (6.82608D-(8.90149D)));
            zz = 3.0855D + (((tickAnim - 14D) / 1D) * (3.88461D-(3.0855D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 22.94049D + (((tickAnim - 15D) / 3D) * (19.28083D-(22.94049D)));
            yy = 6.82608D + (((tickAnim - 15D) / 3D) * (3.23306D-(6.82608D)));
            zz = 3.88461D + (((tickAnim - 15D) / 3D) * (-0.9982D-(3.88461D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 19.28083D + (((tickAnim - 18D) / 2D) * (3.53111D-(19.28083D)));
            yy = 3.23306D + (((tickAnim - 18D) / 2D) * (-3.43253D-(3.23306D)));
            zz = -0.9982D + (((tickAnim - 18D) / 2D) * (3.64437D-(-0.9982D)));
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10D + (((tickAnim - 0D) / 3D) * (20D-(10D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 20D + (((tickAnim - 3D) / 2D) * (20D-(20D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 20D + (((tickAnim - 5D) / 5D) * (10D-(20D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 10D + (((tickAnim - 10D) / 4D) * (48.5D-(10D)));
            yy = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 48.5D + (((tickAnim - 14D) / 3D) * (22.5D-(48.5D)));
            yy = 0D + (((tickAnim - 14D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 22.5D + (((tickAnim - 17D) / 3D) * (10D-(22.5D)));
            yy = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
        }
        this.setRotateAngle(KneeL, KneeL.rotateAngleX + (float) Math.toRadians(xx), KneeL.rotateAngleY + (float) Math.toRadians(yy), KneeL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 32.5D + (((tickAnim - 0D) / 4D) * (-52.5D-(32.5D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -52.5D + (((tickAnim - 4D) / 3D) * (-45D-(-52.5D)));
            yy = 0D + (((tickAnim - 4D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -45D + (((tickAnim - 7D) / 3D) * (0D-(-45D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (-3.12D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -3.12D + (((tickAnim - 13D) / 7D) * (32.5D-(-3.12D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(MetatarsalR, MetatarsalR.rotateAngleX + (float) Math.toRadians(xx), MetatarsalR.rotateAngleY + (float) Math.toRadians(yy), MetatarsalR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360/0.5+30))*1), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*180/0.5+60))*2.5), Tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360/0.5-30))*2), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*180/0.5))*2.5), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360/0.5-90))*3), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*180/0.5-60))*3), Tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360/0.5-150))*4), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*180/0.5-120))*4), Tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -65D + (((tickAnim - 0D) / 5D) * (30D-(-65D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 30D + (((tickAnim - 5D) / 3D) * (-16.25D-(30D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -16.25D + (((tickAnim - 8D) / 2D) * (-26.5D-(-16.25D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -26.5D + (((tickAnim - 10D) / 5D) * (2.5D-(-26.5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 2.5D + (((tickAnim - 15D) / 3D) * (-58.75D-(2.5D)));
            yy = 0D + (((tickAnim - 15D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -58.75D + (((tickAnim - 18D) / 2D) * (-65D-(-58.75D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(ElbowL, ElbowL.rotateAngleX + (float) Math.toRadians(xx), ElbowL.rotateAngleY + (float) Math.toRadians(yy), ElbowL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 30D + (((tickAnim - 0D) / 5D) * (9.99157D-(30D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (-0.39097D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (2.46926D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 9.99157D + (((tickAnim - 5D) / 3D) * (11.16415D-(9.99157D)));
            yy = -0.39097D + (((tickAnim - 5D) / 3D) * (1.33089D-(-0.39097D)));
            zz = 2.46926D + (((tickAnim - 5D) / 3D) * (-7.38164D-(2.46926D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 11.16415D + (((tickAnim - 8D) / 2D) * (5.01907D-(11.16415D)));
            yy = 1.33089D + (((tickAnim - 8D) / 2D) * (1.1455D-(1.33089D)));
            zz = -7.38164D + (((tickAnim - 8D) / 2D) * (-2.36173D-(-7.38164D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 5.01907D + (((tickAnim - 10D) / 5D) * (22.5D-(5.01907D)));
            yy = 1.1455D + (((tickAnim - 10D) / 5D) * (0D-(1.1455D)));
            zz = -2.36173D + (((tickAnim - 10D) / 5D) * (0D-(-2.36173D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 22.5D + (((tickAnim - 15D) / 5D) * (30D-(22.5D)));
            yy = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(MetacarpalL, MetacarpalL.rotateAngleX + (float) Math.toRadians(xx), MetacarpalL.rotateAngleY + (float) Math.toRadians(yy), MetacarpalL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -26.5D + (((tickAnim - 0D) / 5D) * (2.5D-(-26.5D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2.5D + (((tickAnim - 5D) / 3D) * (-58.75D-(2.5D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -58.75D + (((tickAnim - 8D) / 2D) * (-65D-(-58.75D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -65D + (((tickAnim - 10D) / 5D) * (30D-(-65D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 30D + (((tickAnim - 15D) / 3D) * (-16.25D-(30D)));
            yy = 0D + (((tickAnim - 15D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -16.25D + (((tickAnim - 18D) / 2D) * (-26.5D-(-16.25D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(ElbowR, ElbowR.rotateAngleX + (float) Math.toRadians(xx), ElbowR.rotateAngleY + (float) Math.toRadians(yy), ElbowR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360/0.5+150))*-2.5), Chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*180/0.5+170))*0.5), Chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360/0.5+210))*1), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*180/0.5+230))*1), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360/0.5+270))*1), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*180/0.5+290))*1), Neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(-12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360/0.5+330))*0.25), Neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*180/0.5+450))*1), Neck1.rotateAngleZ + (float) Math.toRadians(0));



        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360/0.5+360))*0.25), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*180/0.5+510))*1), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*180/0.5-100))*2));


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSilesaurus e = (EntityPrehistoricFloraSilesaurus) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
