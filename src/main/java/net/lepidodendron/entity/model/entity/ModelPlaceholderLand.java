package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSilesaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraYinlong;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPlaceholderLand extends AdvancedModelBaseExtended {
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

    public ModelPlaceholderLand() {
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
        EntityPrehistoricFloraYinlong ee = (EntityPrehistoricFloraYinlong) entitylivingbaseIn;

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
        EntityPrehistoricFloraYinlong entity = (EntityPrehistoricFloraYinlong) entitylivingbaseIn;

    }



    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYinlong entity = (EntityPrehistoricFloraYinlong) entitylivingbaseIn;

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraYinlong entity = (EntityPrehistoricFloraYinlong) entitylivingbaseIn;


}

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraYinlong e = (EntityPrehistoricFloraYinlong) entity;
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
