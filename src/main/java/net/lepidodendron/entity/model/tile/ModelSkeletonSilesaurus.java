package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSilesaurus extends AdvancedModelBase {
    private final AdvancedModelRenderer Silesaurus;
    private final AdvancedModelRenderer Hips_r1;
    private final AdvancedModelRenderer Hips_r2;
    private final AdvancedModelRenderer Hips_r3;
    private final AdvancedModelRenderer Hips_r4;
    private final AdvancedModelRenderer Hips_r5;
    private final AdvancedModelRenderer Hips_r6;
    private final AdvancedModelRenderer Hips_r7;
    private final AdvancedModelRenderer Hips_r8;
    private final AdvancedModelRenderer Hips_r9;
    private final AdvancedModelRenderer LegL;
    private final AdvancedModelRenderer KneeL;
    private final AdvancedModelRenderer MetatarsalL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer LegL2;
    private final AdvancedModelRenderer KneeL2;
    private final AdvancedModelRenderer MetatarsalL2;
    private final AdvancedModelRenderer FootL2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
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
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer ArmL;
    private final AdvancedModelRenderer ElbowL;
    private final AdvancedModelRenderer MetacarpalL;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer ArmL2;
    private final AdvancedModelRenderer ElbowL2;
    private final AdvancedModelRenderer MetacarpalL2;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer HandL2;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer cube_r75;

    public ModelSkeletonSilesaurus() {
        this.textureWidth = 73;
        this.textureHeight = 73;

        this.Silesaurus = new AdvancedModelRenderer(this);
        this.Silesaurus.setRotationPoint(0.0F, 0.2F, 3.0F);
        this.Silesaurus.cubeList.add(new ModelBox(Silesaurus, 31, 14, -1.0F, -0.8F, -4.0F, 2, 2, 10, 0.0F, false));

        this.Hips_r1 = new AdvancedModelRenderer(this);
        this.Hips_r1.setRotationPoint(-3.0F, 0.16F, 1.011F);
        this.Silesaurus.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, 0.1134F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 47, 40, 1.0F, -0.198F, -2.1613F, 1, 1, 5, 0.0F, true));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 37, 40, 0.0F, -0.198F, -3.1613F, 1, 3, 7, 0.0F, true));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 37, 40, 5.0F, -0.198F, -3.1613F, 1, 3, 7, 0.0F, false));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 47, 40, 4.0F, -0.198F, -2.1613F, 1, 1, 5, 0.0F, false));

        this.Hips_r2 = new AdvancedModelRenderer(this);
        this.Hips_r2.setRotationPoint(-3.0F, 3.56F, 3.511F);
        this.Silesaurus.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, 0.9385F, 0.0821F, -0.3218F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 10, 0, 0.2134F, -0.8118F, -0.7492F, 1, 8, 1, 0.0F, true));

        this.Hips_r3 = new AdvancedModelRenderer(this);
        this.Hips_r3.setRotationPoint(-3.0F, 0.16F, 1.011F);
        this.Silesaurus.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, 0.1128F, 0.0076F, -0.1744F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 49, 27, -0.4691F, 2.7611F, -2.1584F, 1, 1, 5, 0.0F, true));

        this.Hips_r4 = new AdvancedModelRenderer(this);
        this.Hips_r4.setRotationPoint(-1.5F, 7.16F, -3.489F);
        this.Silesaurus.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, -0.499F, 0.0117F, -0.2703F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 35, 0, -0.3525F, -0.3494F, -0.7402F, 1, 5, 1, -0.001F, true));

        this.Hips_r5 = new AdvancedModelRenderer(this);
        this.Hips_r5.setRotationPoint(-3.0F, 3.66F, -0.589F);
        this.Silesaurus.addChild(Hips_r5);
        this.setRotateAngle(Hips_r5, -0.7172F, 0.0117F, -0.2703F);
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 48, 60, 0.1924F, -0.4035F, -0.4411F, 1, 5, 1, 0.0F, true));

        this.Hips_r6 = new AdvancedModelRenderer(this);
        this.Hips_r6.setRotationPoint(1.5F, 7.16F, -3.489F);
        this.Silesaurus.addChild(Hips_r6);
        this.setRotateAngle(Hips_r6, -0.499F, -0.0117F, 0.2703F);
        this.Hips_r6.cubeList.add(new ModelBox(Hips_r6, 35, 0, -0.6475F, -0.3494F, -0.7402F, 1, 5, 1, -0.001F, false));

        this.Hips_r7 = new AdvancedModelRenderer(this);
        this.Hips_r7.setRotationPoint(3.0F, 3.66F, -0.589F);
        this.Silesaurus.addChild(Hips_r7);
        this.setRotateAngle(Hips_r7, -0.7172F, -0.0117F, 0.2703F);
        this.Hips_r7.cubeList.add(new ModelBox(Hips_r7, 48, 60, -1.1924F, -0.4035F, -0.4411F, 1, 5, 1, 0.0F, false));

        this.Hips_r8 = new AdvancedModelRenderer(this);
        this.Hips_r8.setRotationPoint(3.0F, 3.56F, 3.511F);
        this.Silesaurus.addChild(Hips_r8);
        this.setRotateAngle(Hips_r8, 0.9385F, -0.0821F, 0.3218F);
        this.Hips_r8.cubeList.add(new ModelBox(Hips_r8, 10, 0, -1.2134F, -0.8118F, -0.7492F, 1, 8, 1, 0.0F, false));

        this.Hips_r9 = new AdvancedModelRenderer(this);
        this.Hips_r9.setRotationPoint(3.0F, 0.16F, 1.011F);
        this.Silesaurus.addChild(Hips_r9);
        this.setRotateAngle(Hips_r9, 0.1128F, -0.0076F, 0.1744F);
        this.Hips_r9.cubeList.add(new ModelBox(Hips_r9, 49, 27, -0.5309F, 2.7611F, -2.1584F, 1, 1, 5, 0.0F, false));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(3.4F, 3.4F, 1.8F);
        this.Silesaurus.addChild(LegL);
        this.setRotateAngle(LegL, 0.0436F, 0.0F, 0.0F);
        this.LegL.cubeList.add(new ModelBox(LegL, 0, 0, -1.0F, -0.6079F, -1.0542F, 2, 10, 2, 0.0F, false));

        this.KneeL = new AdvancedModelRenderer(this);
        this.KneeL.setRotationPoint(0.1F, 9.3005F, -0.378F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 1.2654F, 0.0F, 0.0F);
        this.KneeL.cubeList.add(new ModelBox(KneeL, 25, 53, -1.1F, -0.129F, -0.8112F, 2, 9, 1, 0.0F, false));
        this.KneeL.cubeList.add(new ModelBox(KneeL, 41, 51, -1.1F, -0.129F, 0.6888F, 2, 9, 1, -0.001F, false));

        this.MetatarsalL = new AdvancedModelRenderer(this);
        this.MetatarsalL.setRotationPoint(-0.1F, 8.4517F, 0.5813F);
        this.KneeL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -0.6458F, 0.0F, 0.0F);
        this.MetatarsalL.cubeList.add(new ModelBox(MetatarsalL, 48, 51, -1.0F, 0.0387F, -1.6167F, 2, 6, 2, 0.001F, false));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 5.9387F, 0.1833F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, 1.1781F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootL.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0524F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 46, 10, -1.5F, -1.1F, -4.7F, 3, 1, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 46, 17, -1.5F, -0.6F, -4.7F, 3, 1, 5, -0.001F, false));

        this.LegL2 = new AdvancedModelRenderer(this);
        this.LegL2.setRotationPoint(-3.4F, 3.4F, 1.8F);
        this.Silesaurus.addChild(LegL2);
        this.setRotateAngle(LegL2, -1.1781F, 0.0F, 0.0F);
        this.LegL2.cubeList.add(new ModelBox(LegL2, 0, 0, -1.0F, -0.6079F, -1.0542F, 2, 10, 2, 0.0F, true));

        this.KneeL2 = new AdvancedModelRenderer(this);
        this.KneeL2.setRotationPoint(-0.1F, 9.3005F, -0.378F);
        this.LegL2.addChild(KneeL2);
        this.setRotateAngle(KneeL2, 1.4835F, 0.0F, 0.0F);
        this.KneeL2.cubeList.add(new ModelBox(KneeL2, 25, 53, -0.9F, -0.129F, -0.8112F, 2, 9, 1, 0.0F, true));
        this.KneeL2.cubeList.add(new ModelBox(KneeL2, 41, 51, -0.9F, -0.129F, 0.6888F, 2, 9, 1, -0.001F, true));

        this.MetatarsalL2 = new AdvancedModelRenderer(this);
        this.MetatarsalL2.setRotationPoint(0.1F, 8.4517F, 0.5813F);
        this.KneeL2.addChild(MetatarsalL2);
        this.setRotateAngle(MetatarsalL2, -1.4748F, 0.0F, 0.0F);
        this.MetatarsalL2.cubeList.add(new ModelBox(MetatarsalL2, 48, 51, -1.0F, 0.0387F, -1.6167F, 2, 6, 2, 0.001F, true));

        this.FootL2 = new AdvancedModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 5.9387F, 0.1833F);
        this.MetatarsalL2.addChild(FootL2);
        this.setRotateAngle(FootL2, 1.9199F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootL2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0524F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 10, -1.5F, -1.1F, -4.7F, 3, 1, 5, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 17, -1.5F, -0.6F, -4.7F, 3, 1, 5, -0.001F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 5.2F);
        this.Silesaurus.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0873F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.5F, 2.9F);
        this.Tail1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3927F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 20, 0.0F, 0.9797F, -0.1354F, 0, 2, 1, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.5F, 8.9F);
        this.Tail1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 18, 0.0F, -0.0203F, -0.1354F, 0, 4, 1, 0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.5F, 6.9F);
        this.Tail1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 3, 18, 0.0F, -0.0203F, -0.1354F, 0, 4, 1, 0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.5F, 4.9F);
        this.Tail1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 18, 0.0F, -0.0203F, -0.1354F, 0, 4, 1, 0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.1F, 0.0F);
        this.Tail1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 0, -1.0F, -0.8354F, -0.179F, 2, 2, 11, 0.001F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.6F, 10.3F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0436F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 16, 18, -1.0F, -0.8782F, -0.5005F, 2, 2, 10, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.9218F, 0.5995F);
        this.Tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.48F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 25, 33, 0.0F, 3.9797F, 6.7928F, 0, 1, 1, 0.001F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 7, 0.0F, 2.9797F, 5.0608F, 0, 2, 1, 0.001F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 14, 0.0F, 1.9797F, 3.3287F, 0, 2, 1, 0.001F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 18, 0.0F, 0.9797F, 1.5967F, 0, 3, 1, 0.001F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 41, 0.0F, -0.0203F, -0.1354F, 0, 3, 1, 0.001F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.1784F, 9.4908F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.1833F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 18, -0.5F, -0.5F, -1.0017F, 1, 1, 13, 0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.1F, -8.9017F);
        this.Tail3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.48F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 13, 0.0F, 7.3472F, 14.0525F, 0, 1, 1, 0.001F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 26, 0.0F, 6.4393F, 12.2705F, 0, 1, 1, 0.001F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 26, 0.0F, 5.5313F, 10.4885F, 0, 1, 1, 0.001F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 33, 0.0F, 4.6233F, 8.7065F, 0, 1, 1, 0.001F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.0913F, 11.9992F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.192F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 0, -0.5F, -0.3974F, -0.04F, 1, 1, 16, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.2F, -3.0F);
        this.Silesaurus.addChild(Body);
        this.setRotateAngle(Body, -0.0873F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.8F, 0.0F);
        this.Body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 19, 31, -1.0F, -1.4F, -10.0F, 2, 2, 10, 0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0532F, 0.5773F, -0.3498F);
        this.Body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.5635F, -0.0209F, 0.2068F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 3, 41, -1.1445F, -0.7166F, 2.7064F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0532F, 0.5773F, -0.3498F);
        this.Body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.5721F, -0.0221F, 0.5996F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 59, -0.0049F, -0.7166F, -0.0547F, 0, 1, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0532F, 0.5773F, -2.3498F);
        this.Body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.4951F, -0.0352F, 0.2049F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 19, 0, -1.1445F, -0.7166F, 2.7064F, 0, 1, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0532F, 0.5773F, -2.3498F);
        this.Body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.5144F, -0.0615F, 0.5972F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 60, 53, -0.0049F, -0.7166F, -0.0547F, 0, 1, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0532F, 0.8773F, -4.3498F);
        this.Body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.4418F, -0.1103F, 0.591F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 61, -0.0049F, -0.7166F, -0.0547F, 0, 1, 3, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0532F, 0.8773F, -4.3498F);
        this.Body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -1.4096F, -0.0528F, 0.2011F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 25, 0, -1.1445F, -0.7166F, 2.7064F, 0, 1, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0532F, 1.0773F, -6.3498F);
        this.Body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -1.3239F, -0.07F, 0.1959F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 61, 59, -1.1445F, -0.7166F, 2.7064F, 0, 1, 3, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0532F, 1.0773F, -6.3498F);
        this.Body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -1.3684F, -0.1586F, 0.5811F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 6, 62, -0.0049F, -0.7166F, -0.0547F, 0, 1, 3, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0532F, 1.4773F, -8.3498F);
        this.Body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -1.3089F, -0.1966F, 0.5706F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 13, 62, -0.0049F, -0.7166F, -0.0547F, 0, 1, 3, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0532F, 1.4773F, -8.3498F);
        this.Body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -1.2552F, -0.0834F, 0.1906F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 31, 14, -1.1445F, -0.7166F, 2.7064F, 0, 1, 4, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0532F, 0.5773F, -0.3498F);
        this.Body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -1.5721F, 0.0221F, -0.5996F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 18, 59, 0.0049F, -0.7166F, -0.0547F, 0, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0532F, 0.5773F, -0.3498F);
        this.Body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.5635F, 0.0209F, -0.2068F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 3, 41, 1.1445F, -0.7166F, 2.7064F, 0, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0532F, 0.5773F, -2.3498F);
        this.Body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -1.5144F, 0.0615F, -0.5972F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 60, 53, 0.0049F, -0.7166F, -0.0547F, 0, 1, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0532F, 0.5773F, -2.3498F);
        this.Body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -1.4951F, 0.0352F, -0.2049F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 19, 0, 1.1445F, -0.7166F, 2.7064F, 0, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0532F, 0.8773F, -4.3498F);
        this.Body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -1.4418F, 0.1103F, -0.591F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 36, 61, 0.0049F, -0.7166F, -0.0547F, 0, 1, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0532F, 0.8773F, -4.3498F);
        this.Body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -1.4096F, 0.0528F, -0.2011F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 25, 0, 1.1445F, -0.7166F, 2.7064F, 0, 1, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.0532F, 1.0773F, -6.3498F);
        this.Body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -1.3684F, 0.1586F, -0.5811F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 6, 62, 0.0049F, -0.7166F, -0.0547F, 0, 1, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.0532F, 1.0773F, -6.3498F);
        this.Body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -1.3239F, 0.07F, -0.1959F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 61, 59, 1.1445F, -0.7166F, 2.7064F, 0, 1, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.0532F, 1.4773F, -8.3498F);
        this.Body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -1.3089F, 0.1966F, -0.5706F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 13, 62, 0.0049F, -0.7166F, -0.0547F, 0, 1, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.0532F, 1.4773F, -8.3498F);
        this.Body.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -1.2552F, 0.0834F, -0.1906F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 31, 14, 1.1445F, -0.7166F, 2.7064F, 0, 1, 4, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 1.0F, -9.5F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, -0.044F, -0.1308F, 0.0057F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-2.1206F, 7.8267F, -3.0344F);
        this.Chest.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.4039F, 0.5527F, 0.8876F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 26, -2.5345F, -0.7133F, -2.0218F, 3, 1, 3, -0.001F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-2.1206F, 7.8267F, -3.0344F);
        this.Chest.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1373F, 0.6599F, 1.7924F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 50, -6.6514F, 1.2719F, -1.0218F, 5, 1, 2, -0.001F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(2.1206F, 7.8267F, -3.0344F);
        this.Chest.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1373F, -0.6599F, -1.7924F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 50, 1.6514F, 1.2719F, -1.0218F, 5, 1, 2, -0.001F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(2.1206F, 7.8267F, -3.0344F);
        this.Chest.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.4039F, -0.5527F, -0.8876F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 26, -0.4655F, -0.7133F, -2.0218F, 3, 1, 3, -0.001F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 9.4F, 0.8F);
        this.Chest.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1745F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 34, 31, -2.0F, -1.8471F, -0.1413F, 4, 2, 6, -0.001F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 7.7F, -5.2F);
        this.Chest.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.2793F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 33, -2.0F, -0.8668F, 0.0948F, 4, 1, 6, -0.001F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 1.8F, -6.2F);
        this.Chest.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.2182F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 35, 0, -1.0F, -1.1575F, 0.0438F, 2, 2, 7, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.0532F, 0.7773F, -0.8498F);
        this.Chest.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -1.1518F, -0.1028F, 0.181F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 11, 41, -1.1445F, -0.7166F, 2.7064F, 0, 1, 4, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.0532F, 0.7773F, -0.8498F);
        this.Chest.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -1.218F, -0.2524F, 0.5503F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 62, 30, -0.0049F, -0.7166F, -0.0547F, 0, 1, 3, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-2.7532F, 3.2773F, -1.4498F);
        this.Chest.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -1.022F, -0.1254F, 0.1662F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 58, 3, 0.0155F, -0.5635F, -0.0288F, 0, 1, 4, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-1.1121F, 1.068F, -2.6359F);
        this.Chest.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -1.1005F, -0.319F, 0.5172F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 62, 35, 0.0748F, -0.4231F, -0.0325F, 0, 1, 3, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.1121F, 1.668F, -4.6359F);
        this.Chest.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.9496F, -0.3871F, 0.4212F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 53, 62, 0.0748F, -0.4231F, -0.0325F, 0, 1, 3, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-1.1121F, 1.668F, -4.6359F);
        this.Chest.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.901F, -0.2819F, 0.2737F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 58, 9, -0.4503F, -0.4231F, 2.9283F, 0, 1, 4, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(1.0532F, 0.7773F, -0.8498F);
        this.Chest.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -1.218F, 0.2524F, -0.5503F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 62, 30, 0.0049F, -0.7166F, -0.0547F, 0, 1, 3, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(1.0532F, 0.7773F, -0.8498F);
        this.Chest.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -1.1518F, 0.1028F, -0.181F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 11, 41, 1.1445F, -0.7166F, 2.7064F, 0, 1, 4, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(2.7532F, 3.2773F, -1.4498F);
        this.Chest.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -1.022F, 0.1254F, -0.1662F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 58, 3, -0.0155F, -0.5635F, -0.0288F, 0, 1, 4, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(1.1121F, 1.068F, -2.6359F);
        this.Chest.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -1.1005F, 0.319F, -0.5172F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 62, 35, -0.0748F, -0.4231F, -0.0325F, 0, 1, 3, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(1.1121F, 1.668F, -4.6359F);
        this.Chest.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.9496F, 0.3871F, -0.4212F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 53, 62, -0.0748F, -0.4231F, -0.0325F, 0, 1, 3, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(1.1121F, 1.668F, -4.6359F);
        this.Chest.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.901F, 0.2819F, -0.2737F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 58, 9, 0.4503F, -0.4231F, 2.9283F, 0, 1, 4, 0.0F, false));

        this.ArmL = new AdvancedModelRenderer(this);
        this.ArmL.setRotationPoint(3.9F, 6.8F, -2.6F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, 1.0036F, 0.0F, 0.0F);
        this.ArmL.cubeList.add(new ModelBox(ArmL, 16, 18, -1.5F, 0.0F, -1.0F, 2, 7, 2, 0.001F, false));

        this.ElbowL = new AdvancedModelRenderer(this);
        this.ElbowL.setRotationPoint(-0.5F, 6.7F, 0.6F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -1.6319F, 0.0F, 0.0F);
        this.ElbowL.cubeList.add(new ModelBox(ElbowL, 32, 53, -1.0F, 0.0F, -0.6F, 2, 9, 1, 0.0F, false));
        this.ElbowL.cubeList.add(new ModelBox(ElbowL, 55, 34, -1.0F, 1.0F, -1.9F, 2, 8, 1, 0.0F, false));

        this.MetacarpalL = new AdvancedModelRenderer(this);
        this.MetacarpalL.setRotationPoint(0.0F, 8.9F, -1.4F);
        this.ElbowL.addChild(MetacarpalL);
        this.setRotateAngle(MetacarpalL, 0.8988F, 0.0F, 0.0F);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, -0.2F, 0.1F);
        this.MetacarpalL.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.1222F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 19, 7, -1.0F, 0.0F, 0.1F, 2, 2, 1, -0.002F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 31, 20, -1.0F, 0.0F, -0.3F, 2, 2, 1, -0.001F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(0.0F, 1.4F, 1.3F);
        this.MetacarpalL.addChild(HandL);
        this.setRotateAngle(HandL, 0.9338F, 0.0F, 0.0F);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.HandL.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -1.4486F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 64, 15, -1.0F, -0.1903F, -0.2416F, 2, 3, 1, 0.0F, false));

        this.ArmL2 = new AdvancedModelRenderer(this);
        this.ArmL2.setRotationPoint(-3.9F, 6.8F, -2.6F);
        this.Chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, 1.309F, 0.0F, 0.0F);
        this.ArmL2.cubeList.add(new ModelBox(ArmL2, 16, 18, -0.5F, 0.0F, -1.0F, 2, 7, 2, 0.001F, true));

        this.ElbowL2 = new AdvancedModelRenderer(this);
        this.ElbowL2.setRotationPoint(0.5F, 6.7F, 0.6F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -2.0246F, 0.0F, 0.0F);
        this.ElbowL2.cubeList.add(new ModelBox(ElbowL2, 32, 53, -1.0F, 0.0F, -0.6F, 2, 9, 1, 0.0F, true));
        this.ElbowL2.cubeList.add(new ModelBox(ElbowL2, 55, 34, -1.0F, 1.0F, -1.9F, 2, 8, 1, 0.0F, true));

        this.MetacarpalL2 = new AdvancedModelRenderer(this);
        this.MetacarpalL2.setRotationPoint(0.0F, 8.9F, -1.4F);
        this.ElbowL2.addChild(MetacarpalL2);
        this.setRotateAngle(MetacarpalL2, 0.5061F, 0.0F, 0.0F);


        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, -0.2F, 0.1F);
        this.MetacarpalL2.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.1222F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 19, 7, -1.0F, 0.0F, 0.1F, 2, 2, 1, -0.002F, true));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 31, 20, -1.0F, 0.0F, -0.3F, 2, 2, 1, -0.001F, true));

        this.HandL2 = new AdvancedModelRenderer(this);
        this.HandL2.setRotationPoint(0.0F, 1.4F, 1.3F);
        this.MetacarpalL2.addChild(HandL2);
        this.setRotateAngle(HandL2, 1.85F, 0.0F, 0.0F);


        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.HandL2.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -1.4486F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 64, 15, -1.0F, -0.1903F, -0.2416F, 2, 3, 1, 0.0F, true));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 1.5F, -6.0F);
        this.Chest.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.0436F, 0.0F, 0.0F);


        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, -0.1F, -2.9F);
        this.Neck3.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.0436F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 55, 47, -1.0F, -0.8687F, -0.0706F, 2, 2, 3, 0.001F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-2.6121F, 2.268F, 1.3641F);
        this.Neck3.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.7755F, -0.2684F, 0.239F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 63, 0, 0.0364F, -0.3102F, -0.0534F, 0, 1, 3, 0.0F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-1.0F, 0.7F, -0.6F);
        this.Neck3.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.8183F, -0.3906F, 0.3708F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 40, 63, -0.0797F, -0.4975F, -0.0757F, 0, 1, 3, 0.0F, true));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-1.0F, 0.6F, -2.6F);
        this.Neck3.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.7561F, -0.1803F, 0.1521F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 19, 0, -0.0797F, -0.4975F, -0.0757F, 0, 1, 5, 0.0F, true));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(2.6121F, 2.268F, 1.3641F);
        this.Neck3.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.7755F, 0.2684F, -0.239F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 63, 0, -0.0364F, -0.3102F, -0.0534F, 0, 1, 3, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(1.0F, 0.7F, -0.6F);
        this.Neck3.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.8183F, 0.3906F, -0.3708F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 40, 63, 0.0797F, -0.4975F, -0.0757F, 0, 1, 3, 0.0F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(1.0F, 0.6F, -2.6F);
        this.Neck3.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.7561F, 0.1803F, -0.1521F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 19, 0, 0.0797F, -0.4975F, -0.0757F, 0, 1, 5, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.3F, -2.5F);
        this.Neck3.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0447F, -0.218F, 0.0097F);


        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Neck2.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.4974F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 41, -1.0F, -0.6F, -5.6F, 2, 2, 6, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-1.0F, -0.1F, -2.1F);
        this.Neck2.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.754F, -0.1676F, 0.14F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 3, 7, 0.0069F, -0.3098F, -0.5442F, 0, 1, 6, 0.0F, true));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(-1.0F, -1.2F, -4.5F);
        this.Neck2.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.7495F, -0.1357F, 0.1099F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 0, 18, 0.0428F, -0.6183F, -0.0536F, 0, 1, 6, 0.0F, true));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(1.0F, -0.1F, -2.1F);
        this.Neck2.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.754F, 0.1676F, -0.14F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 3, 7, -0.0069F, -0.3098F, -0.5442F, 0, 1, 6, 0.0F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(1.0F, -1.2F, -4.5F);
        this.Neck2.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.7495F, 0.1357F, -0.1099F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 0, 18, -0.0428F, -0.6183F, -0.0536F, 0, 1, 6, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -2.4F, -4.9F);
        this.Neck2.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.1329F, -0.173F, -0.023F);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 10, 56, -1.0F, -0.8F, -2.8F, 2, 2, 3, -0.002F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-1.0F, 0.7F, -1.7F);
        this.Neck1.addChild(cube_r66);
        this.setRotateAngle(cube_r66, -0.6643F, -0.1588F, 0.1232F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 28, 45, 0.0F, -0.5F, -0.1F, 0, 1, 6, 0.0F, true));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(1.0F, 0.7F, -1.7F);
        this.Neck1.addChild(cube_r67);
        this.setRotateAngle(cube_r67, -0.6643F, 0.1588F, -0.1232F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 28, 45, 0.0F, -0.5F, -0.1F, 0, 1, 6, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.Neck1.addChild(Head);


        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-1.0F, -0.5F, -3.1F);
        this.Head.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.3142F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 0, 54, -0.5F, 0.2707F, -0.1169F, 3, 1, 3, -0.001F, false));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(-0.5F, 2.1F, -7.4F);
        this.Head.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.4887F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 47, 0, -0.5F, 0.0143F, -0.0837F, 2, 1, 5, -0.001F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(-0.5F, -0.4F, -0.2F);
        this.Head.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.2967F, 0.0F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 35, 44, -0.5F, 0.7F, -7.7F, 2, 1, 1, 0.001F, false));
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 12, 51, -1.0F, 0.7F, -6.7F, 3, 1, 3, -0.001F, false));
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 17, 44, -1.5F, -0.3F, -3.7F, 4, 2, 4, 0.001F, false));
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 41, 27, -0.5F, 0.3F, -7.7F, 2, 1, 1, 0.0F, false));
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 64, 6, -0.8F, 1.0F, -6.7F, 0, 1, 3, 0.0F, true));
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 64, 6, 1.8F, 1.0F, -6.7F, 0, 1, 3, 0.0F, false));
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 15, 33, -1.0F, 0.3F, -6.7F, 3, 1, 3, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(-0.5F, 0.8F, 0.5F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.6894F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 57, 24, 1.5F, -0.1F, -4.0F, 1, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 53, 56, 1.5F, 0.6F, -4.0F, 1, 1, 4, -0.001F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 60, 41, 1.0F, -0.1F, -7.0F, 1, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 33, 1.79F, -0.5F, -8.0F, 0, 1, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 34, 31, 1.79F, -0.5F, -6.7F, 0, 1, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 34, 31, -0.79F, -0.5F, -6.7F, 0, 1, 2, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 33, -0.79F, -0.5F, -8.0F, 0, 1, 2, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 60, 41, -1.0F, -0.1F, -7.0F, 1, 1, 3, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 57, 24, -1.5F, -0.1F, -4.0F, 1, 1, 4, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 53, 56, -1.5F, 0.6F, -4.0F, 1, 1, 4, -0.001F, true));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(0.0F, 0.0F, -6.8F);
        this.Jaw.addChild(cube_r71);
        this.setRotateAngle(cube_r71, -0.3491F, 0.0F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 21, 38, -0.5F, -0.14F, -0.6F, 2, 1, 1, 0.0F, false));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(0.0F, 0.0F, -6.8F);
        this.Jaw.addChild(cube_r72);
        this.setRotateAngle(cube_r72, -0.9599F, 0.0F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 10, 10, 0.0F, 0.02F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(1.0F, 1.6F, -4.0F);
        this.Jaw.addChild(cube_r73);
        this.setRotateAngle(cube_r73, -0.2269F, 0.0F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 58, 17, -2.0F, -1.0314F, -2.9264F, 1, 1, 3, -0.001F, true));
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 58, 17, 0.0F, -1.0314F, -2.9264F, 1, 1, 3, -0.001F, false));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(0.5F, 1.6F, -4.0F);
        this.Jaw.addChild(cube_r74);
        this.setRotateAngle(cube_r74, -0.2409F, -0.3398F, 0.0817F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 0, 59, 0.0F, -0.7F, 0.1F, 0, 1, 4, 0.0F, true));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(0.5F, 1.6F, -4.0F);
        this.Jaw.addChild(cube_r75);
        this.setRotateAngle(cube_r75, -0.2409F, 0.3398F, -0.0817F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 0, 59, 0.0F, -0.7F, 0.1F, 0, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.Silesaurus.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
